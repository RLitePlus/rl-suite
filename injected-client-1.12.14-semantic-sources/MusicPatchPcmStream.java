import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nk")
public class MusicPatchPcmStream extends PcmStream {
   @ObfuscatedSignature(descriptor = "Lnc;")
   @ObfuscatedName("ag")
   MidiPcmStream superStream;
   @ObfuscatedSignature(descriptor = "Ldr;")
   @ObfuscatedName("at")
   PcmStreamMixer mixer;
   @ObfuscatedSignature(descriptor = "Lrt;")
   @ObfuscatedName("av")
   NodeDeque queue = new NodeDeque();
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   public static final int field4303 = 22050;
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   static final int field4304 = 74;

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bk")
   @Override
   protected PcmStream vmethod163() {
      try {
         MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
         if (null == var1) {
            return null;
         } else {
            return (PcmStream)(var1.stream != null ? var1.stream : this.vmethod169());
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "nk.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnk;Lnd;I)V")
   @ObfuscatedName("sx")
   public static void method7800(MusicPatchPcmStream var0, MusicPatchNode var1, int var2) {
      if (0 != (var0.superStream.field4226[var1.field4253 * 591677655] & 4) && var1.field4243 * 498415289 < 0) {
         int var3 = var0.superStream.field4210[var1.field4253 * 591677655] / (EnumComposition.field2157 * 1063377631);
         int var4 = (var3 + 1048575 - 408960161 * var1.field4245) / var3;
         var1.field4245 = (var2 * var3 + 408960161 * var1.field4245 & 1048575) * -562256031;
         if (var4 <= var2) {
            if (var0.superStream.field4209[var1.field4253 * 591677655] == 0) {
               var1.stream = RawPcmStream.method3180(var1.rawSound, var1.stream.method3291(), var1.stream.method3255(), var1.stream.method3258());
            } else {
               var1.stream = RawPcmStream.method3180(var1.rawSound, var1.stream.method3291(), 0, var1.stream.method3258());
               var0.superStream.method7667(var1, var1.table.field4357[var1.field4248 * 1059417007] < 0, (short)3860);
            }

            if (var1.table.field4357[var1.field4248 * 1059417007] < 0) {
               var1.stream.method3242(-1);
            }

            var2 = 408960161 * var1.field4245 / var3;
         }
      }

      var1.stream.skip(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnk;Lnd;[IIII)V")
   @ObfuscatedName("gr")
   public static void method7794(MusicPatchPcmStream var0, MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
      if (0 != (var0.superStream.field4226[var1.field4253 * 591677655] & 4) && 498415289 * var1.field4243 < 0) {
         int var6 = var0.superStream.field4210[591677655 * var1.field4253] / (1063377631 * EnumComposition.field2157);

         while (true) {
            int var7 = (var6 + 505799867 - 408960161 * var1.field4245) / var6;
            if (var7 > var4) {
               var1.field4245 += var6 * var4 * -562256031;
               break;
            }

            var1.stream.fill(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field4245 += -562256031 * (var6 * var7 - 1048576);
            int var8 = 1063377631 * EnumComposition.field2157 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            RawPcmStream var10 = var1.stream;
            if (0 == var0.superStream.field4209[var1.field4253 * 2045085029]) {
               var1.stream = RawPcmStream.method3180(var1.rawSound, var10.method3291(), var10.method3255(), var10.method3258());
            } else {
               var1.stream = RawPcmStream.method3180(var1.rawSound, var10.method3291(), 0, var10.method3258());
               var0.superStream.method7667(var1, var1.table.field4357[1059417007 * var1.field4248] < 0, (short)32062);
               var1.stream.method3278(var8, var10.method3255());
            }

            if (var1.table.field4357[var1.field4248 * -1684147818] < 0) {
               var1.stream.method3242(-1);
            }

            var10.method3287(var8);
            var10.fill(var2, var3, var5 - var3);
            if (RawPcmStream.method3305(var10)) {
               var0.mixer.addSubStream(var10);
            }
         }
      }

      var1.stream.fill(var2, var3, var4);
   }

   MusicPatchPcmStream(MidiPcmStream var1) {
      this.mixer = new PcmStreamMixer();
      this.superStream = var1;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bf")
   @Override
   protected void vmethod174(int[] var1, int var2, int var3) {
      this.mixer.fill(var1, var2, var3);

      label32:
      for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
         if (!this.superStream.method7725(var6, 1842254816)) {
            int var4 = var2;
            int var5 = var3;

            while (var5 > 67522799 * var6.field4249) {
               this.method7795(var6, var1, var4, 67522799 * var6.field4249, var5 + var4, (byte)14);
               var4 += 67522799 * var6.field4249;
               var5 -= 67522799 * var6.field4249;
               if (MidiPcmStream.method7731(this.superStream, var6, var1, var4, var5, (byte)2)) {
                  continue label32;
               }
            }

            this.method7795(var6, var1, var4, var5, var5 + var4, (byte)70);
            var6.field4249 -= var5 * 699325967;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   @Override
   protected int vmethod171() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "nk.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("ak")
   @Override
   protected PcmStream nextSubStream() {
      MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
      if (null == var1) {
         return null;
      } else {
         return (PcmStream)(var1.stream != null ? var1.stream : this.vmethod169());
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("au")
   @Override
   protected void skip(int var1) {
      try {
         this.mixer.skip(var1);

         label36:
         for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); null != var3; var3 = (MusicPatchNode)this.queue.previous()) {
            if (!this.superStream.method7725(var3, 1842254816)) {
               int var2 = var1;

               while (var2 > var3.field4249 * 67522799) {
                  this.method7801(var3, 67522799 * var3.field4249, 995705765);
                  var2 -= var3.field4249 * 67522799;
                  if (MidiPcmStream.method7731(this.superStream, var3, null, 0, var2, (byte)2)) {
                     continue label36;
                  }
               }

               this.method7801(var3, var2, 1747331636);
               var3.field4249 -= var2 * 699325967;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "nk.au(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lch;II)V")
   @ObfuscatedName("uu")
   public static void method7793(Projectile var0, int var1, int var2) {
      if (var0 == null) {
         var0.getRemainingCycles();
      }

      var0.cycleStart += var1 * -2037230632;
      var0.orientation += var2 * -962973240;
      var0.sourceX += var1 * 561414215;
      var0.startPos += var2 * 1913364417;
      var0.x = var0.x + Coord.method8301(var1, -355008838);
      var0.y = var0.y + Coord.method8301(var2, -355008838);
   }

   @ObfuscatedSignature(descriptor = "(Lnd;[IIIIB)V")
   @ObfuscatedName("av")
   void method7795(MusicPatchNode var1, int[] var2, int var3, int var4, int var5, byte var6) {
      try {
         if (0 != (this.superStream.field4226[var1.field4253 * 591677655] & 4)) {
            if (var6 == 0) {
               throw new IllegalStateException();
            }

            if (498415289 * var1.field4243 < 0) {
               int var7 = this.superStream.field4210[591677655 * var1.field4253] / (1063377631 * EnumComposition.field2157);

               while (true) {
                  int var8 = (var7 + 1048575 - 408960161 * var1.field4245) / var7;
                  if (var8 > var4) {
                     if (var6 == 0) {
                        throw new IllegalStateException();
                     }

                     var1.field4245 += var7 * var4 * -562256031;
                     break;
                  }

                  var1.stream.fill(var2, var3, var8);
                  var3 += var8;
                  var4 -= var8;
                  var1.field4245 += -562256031 * (var7 * var8 - 1048576);
                  int var9 = 1063377631 * EnumComposition.field2157 / 100;
                  int var10 = 262144 / var7;
                  if (var10 < var9) {
                     if (var6 == 0) {
                        return;
                     }

                     var9 = var10;
                  }

                  RawPcmStream var11 = var1.stream;
                  if (0 == this.superStream.field4209[var1.field4253 * 591677655]) {
                     var1.stream = RawPcmStream.method3180(var1.rawSound, var11.method3291(), var11.method3255(), var11.method3258());
                  } else {
                     var1.stream = RawPcmStream.method3180(var1.rawSound, var11.method3291(), 0, var11.method3258());
                     boolean var10002;
                     if (var1.table.field4357[1059417007 * var1.field4248] < 0) {
                        if (var6 == 0) {
                           throw new IllegalStateException();
                        }

                        var10002 = true;
                     } else {
                        var10002 = false;
                     }

                     this.superStream.method7667(var1, var10002, (short)14372);
                     var1.stream.method3278(var9, var11.method3255());
                  }

                  if (var1.table.field4357[var1.field4248 * 1059417007] < 0) {
                     if (var6 == 0) {
                        throw new IllegalStateException();
                     }

                     var1.stream.method3242(-1);
                  }

                  var11.method3287(var9);
                  var11.fill(var2, var3, var5 - var3);
                  if (RawPcmStream.method3305(var11)) {
                     this.mixer.addSubStream(var11);
                  }
               }
            }
         }

         var1.stream.fill(var2, var3, var4);
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "nk.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnd;II)V")
   @ObfuscatedName("at")
   void method7801(MusicPatchNode var1, int var2, int var3) {
      try {
         if (0 != (this.superStream.field4226[var1.field4253 * 591677655] & 4)) {
            if (var3 <= -659003284) {
               return;
            }

            if (var1.field4243 * 498415289 < 0) {
               if (var3 <= -659003284) {
                  throw new IllegalStateException();
               }

               int var4 = this.superStream.field4210[var1.field4253 * 591677655] / (EnumComposition.field2157 * 1063377631);
               int var5 = (var4 + 1048575 - 408960161 * var1.field4245) / var4;
               var1.field4245 = (var2 * var4 + 408960161 * var1.field4245 & 1048575) * -562256031;
               if (var5 <= var2) {
                  if (var3 <= -659003284) {
                     throw new IllegalStateException();
                  }

                  if (this.superStream.field4209[var1.field4253 * 591677655] == 0) {
                     if (var3 <= -659003284) {
                        throw new IllegalStateException();
                     }

                     var1.stream = RawPcmStream.method3180(var1.rawSound, var1.stream.method3291(), var1.stream.method3255(), var1.stream.method3258());
                  } else {
                     var1.stream = RawPcmStream.method3180(var1.rawSound, var1.stream.method3291(), 0, var1.stream.method3258());
                     this.superStream.method7667(var1, var1.table.field4357[var1.field4248 * 1059417007] < 0, (short)17133);
                  }

                  if (var1.table.field4357[var1.field4248 * 1059417007] < 0) {
                     if (var3 <= -659003284) {
                        throw new IllegalStateException();
                     }

                     var1.stream.method3242(-1);
                  }

                  var2 = 408960161 * var1.field4245 / var4;
               }
            }
         }

         var1.stream.skip(var2);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "nk.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bz")
   @Override
   protected PcmStream vmethod166() {
      MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
      if (null == var1) {
         return null;
      } else {
         return (PcmStream)(var1.stream != null ? var1.stream : this.vmethod169());
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bb")
   @Override
   protected PcmStream vmethod164() {
      MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
      if (null == var1) {
         return null;
      } else {
         return (PcmStream)(var1.stream != null ? var1.stream : this.vmethod169());
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bo")
   @Override
   protected PcmStream vmethod169() {
      try {
         MusicPatchNode var1;
         do {
            var1 = (MusicPatchNode)this.queue.previous();
            if (null == var1) {
               return null;
            }
         } while (var1.stream == null);

         return var1.stream;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "nk.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bg")
   @Override
   protected PcmStream vmethod167() {
      MusicPatchNode var1;
      do {
         var1 = (MusicPatchNode)this.queue.previous();
         if (null == var1) {
            return null;
         }
      } while (var1.stream == null);

      return var1.stream;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnk;Lnd;[IIII)V")
   @ObfuscatedName("gs")
   public static void method7796(MusicPatchPcmStream var0, MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.vmethod167();
      }

      if (0 != (var0.superStream.field4226[var1.field4253 * 591677655] & 4) && 498415289 * var1.field4243 < 0) {
         int var6 = var0.superStream.field4210[591677655 * var1.field4253] / (1063377631 * EnumComposition.field2157);

         while (true) {
            int var7 = (var6 + 1048575 - 408960161 * var1.field4245) / var6;
            if (var7 > var4) {
               var1.field4245 += var6 * var4 * -562256031;
               break;
            }

            var1.stream.fill(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field4245 += -562256031 * (var6 * var7 - 1048576);
            int var8 = 1063377631 * EnumComposition.field2157 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            RawPcmStream var10 = var1.stream;
            if (0 == var0.superStream.field4209[var1.field4253 * 591677655]) {
               var1.stream = RawPcmStream.method3180(var1.rawSound, var10.method3291(), var10.method3255(), var10.method3258());
            } else {
               var1.stream = RawPcmStream.method3180(var1.rawSound, var10.method3291(), 0, var10.method3258());
               var0.superStream.method7667(var1, var1.table.field4357[1059417007 * var1.field4248] < 0, (short)29855);
               var1.stream.method3278(var8, var10.method3255());
            }

            if (var1.table.field4357[var1.field4248 * 1059417007] < 0) {
               var1.stream.method3242(-1);
            }

            var10.method3287(var8);
            var10.fill(var2, var3, var5 - var3);
            if (RawPcmStream.method3305(var10)) {
               var0.mixer.addSubStream(var10);
            }
         }
      }

      var1.stream.fill(var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bs")
   @Override
   protected PcmStream vmethod168() {
      MusicPatchNode var1;
      do {
         var1 = (MusicPatchNode)this.queue.previous();
         if (null == var1) {
            return null;
         }
      } while (var1.stream == null);

      return var1.stream;
   }

   @ObfuscatedSignature(descriptor = "(Lnd;I)V")
   @ObfuscatedName("ai")
   void method7802(MusicPatchNode var1, int var2) {
      if (0 != (this.superStream.field4226[var1.field4253 * 42446394] & 4) && var1.field4243 * 498415289 < 0) {
         int var3 = this.superStream.field4210[var1.field4253 * 591677655] / (EnumComposition.field2157 * 1276510996);
         int var4 = (var3 + 1048575 - -1060451901 * var1.field4245) / var3;
         var1.field4245 = (var2 * var3 + -217538907 * var1.field4245 & 1048575) * 1745512132;
         if (var4 <= var2) {
            if (this.superStream.field4209[var1.field4253 * 591677655] == 0) {
               var1.stream = RawPcmStream.method3180(var1.rawSound, var1.stream.method3291(), var1.stream.method3255(), var1.stream.method3258());
            } else {
               var1.stream = RawPcmStream.method3180(var1.rawSound, var1.stream.method3291(), 0, var1.stream.method3258());
               this.superStream.method7667(var1, var1.table.field4357[var1.field4248 * 1059417007] < 0, (short)11728);
            }

            if (var1.table.field4357[var1.field4248 * 1059417007] < 0) {
               var1.stream.method3242(-1);
            }

            var2 = 1845903137 * var1.field4245 / var3;
         }
      }

      var1.stream.skip(var2);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bu")
   @Override
   protected void vmethod176(int var1) {
      this.mixer.skip(var1);

      label33:
      for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); null != var3; var3 = (MusicPatchNode)this.queue.previous()) {
         if (!this.superStream.method7725(var3, 1842254816)) {
            int var2 = var1;

            while (var2 > var3.field4249 * 67522799) {
               this.method7801(var3, -105668562 * var3.field4249, 1581964501);
               var2 -= var3.field4249 * 67522799;
               if (MidiPcmStream.method7731(this.superStream, var3, null, 0, var2, (byte)2)) {
                  continue label33;
               }
            }

            this.method7801(var3, var2, 1003639740);
            var3.field4249 -= var2 * 511868771;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bw")
   @Override
   protected void vmethod175(int[] var1, int var2, int var3) {
      this.mixer.fill(var1, var2, var3);

      label34:
      for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
         if (!this.superStream.method7725(var6, 1842254816)) {
            int var4 = var2;
            int var5 = var3;

            while (var5 > -508295148 * var6.field4249) {
               this.method7795(var6, var1, var4, 67522799 * var6.field4249, var5 + var4, (byte)-46);
               var4 += 67522799 * var6.field4249;
               var5 -= 1579162622 * var6.field4249;
               if (MidiPcmStream.method7731(this.superStream, var6, var1, var4, var5, (byte)2)) {
                  continue label34;
               }
            }

            this.method7795(var6, var1, var4, var5, var5 + var4, (byte)-41);
            var6.field4249 -= var5 * 331200772;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bj")
   @Override
   protected int vmethod172() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "(Lnd;[IIII)V")
   @ObfuscatedName("az")
   void method7797(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
      if (0 != (this.superStream.field4226[var1.field4253 * 591677655] & 4) && -91626140 * var1.field4243 < 0) {
         int var6 = this.superStream.field4210[591677655 * var1.field4253] / (1063377631 * EnumComposition.field2157);

         while (true) {
            int var7 = (var6 + -404648338 - 1983295146 * var1.field4245) / var6;
            if (var7 > var4) {
               var1.field4245 += var6 * var4 * -562256031;
               break;
            }

            var1.stream.fill(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field4245 += 1580605327 * (var6 * var7 - 1153154234);
            int var8 = 288462229 * EnumComposition.field2157 / 100;
            int var9 = -1120551079 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            RawPcmStream var10 = var1.stream;
            if (0 == this.superStream.field4209[var1.field4253 * -1006207833]) {
               var1.stream = RawPcmStream.method3180(var1.rawSound, var10.method3291(), var10.method3255(), var10.method3258());
            } else {
               var1.stream = RawPcmStream.method3180(var1.rawSound, var10.method3291(), 0, var10.method3258());
               this.superStream.method7667(var1, var1.table.field4357[-1928047657 * var1.field4248] < 0, (short)10402);
               var1.stream.method3278(var8, var10.method3255());
            }

            if (var1.table.field4357[var1.field4248 * 1059417007] < 0) {
               var1.stream.method3242(-1);
            }

            var10.method3287(var8);
            var10.fill(var2, var3, var5 - var3);
            if (RawPcmStream.method3305(var10)) {
               this.mixer.addSubStream(var10);
            }
         }
      }

      var1.stream.fill(var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("aj")
   @Override
   protected PcmStream firstSubStream() {
      MusicPatchNode var1;
      do {
         var1 = (MusicPatchNode)this.queue.previous();
         if (null == var1) {
            return null;
         }
      } while (var1.stream == null);

      return var1.stream;
   }

   @ObfuscatedSignature(descriptor = "(Lnd;[IIII)V")
   @ObfuscatedName("an")
   void method7798(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
      if (0 != (this.superStream.field4226[var1.field4253 * 591677655] & 4) && 498415289 * var1.field4243 < 0) {
         int var6 = this.superStream.field4210[591677655 * var1.field4253] / (1063377631 * EnumComposition.field2157);

         while (true) {
            int var7 = (var6 + 1048575 - 408960161 * var1.field4245) / var6;
            if (var7 > var4) {
               var1.field4245 += var6 * var4 * -562256031;
               break;
            }

            var1.stream.fill(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field4245 += -562256031 * (var6 * var7 - 1048576);
            int var8 = 1063377631 * EnumComposition.field2157 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            RawPcmStream var10 = var1.stream;
            if (0 == this.superStream.field4209[var1.field4253 * 591677655]) {
               var1.stream = RawPcmStream.method3180(var1.rawSound, var10.method3291(), var10.method3255(), var10.method3258());
            } else {
               var1.stream = RawPcmStream.method3180(var1.rawSound, var10.method3291(), 0, var10.method3258());
               this.superStream.method7667(var1, var1.table.field4357[1059417007 * var1.field4248] < 0, (short)3496);
               var1.stream.method3278(var8, var10.method3255());
            }

            if (var1.table.field4357[var1.field4248 * 1059417007] < 0) {
               var1.stream.method3242(-1);
            }

            var10.method3287(var8);
            var10.fill(var2, var3, var5 - var3);
            if (RawPcmStream.method3305(var10)) {
               this.mixer.addSubStream(var10);
            }
         }
      }

      var1.stream.fill(var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(Lnd;[IIII)V")
   @ObfuscatedName("ay")
   void method7799(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
      if (0 != (this.superStream.field4226[var1.field4253 * -777302154] & 4) && -1510987975 * var1.field4243 < 0) {
         int var6 = this.superStream.field4210[591677655 * var1.field4253] / (860936329 * EnumComposition.field2157);

         while (true) {
            int var7 = (var6 + 1048575 - 408960161 * var1.field4245) / var6;
            if (var7 > var4) {
               var1.field4245 += var6 * var4 * 1871910448;
               break;
            }

            var1.stream.fill(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field4245 += 2003132001 * (var6 * var7 - -46859137);
            int var8 = -1803679494 * EnumComposition.field2157 / -1101929106;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            RawPcmStream var10 = var1.stream;
            if (0 == this.superStream.field4209[var1.field4253 * 1916537659]) {
               var1.stream = RawPcmStream.method3180(var1.rawSound, var10.method3291(), var10.method3255(), var10.method3258());
            } else {
               var1.stream = RawPcmStream.method3180(var1.rawSound, var10.method3291(), 0, var10.method3258());
               this.superStream.method7667(var1, var1.table.field4357[1059417007 * var1.field4248] < 0, (short)8743);
               var1.stream.method3278(var8, var10.method3255());
            }

            if (var1.table.field4357[var1.field4248 * 1813898937] < 0) {
               var1.stream.method3242(-1);
            }

            var10.method3287(var8);
            var10.fill(var2, var3, var5 - var3);
            if (RawPcmStream.method3305(var10)) {
               this.mixer.addSubStream(var10);
            }
         }
      }

      var1.stream.fill(var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("ap")
   @Override
   protected void fill(int[] var1, int var2, int var3) {
      try {
         this.mixer.fill(var1, var2, var3);

         label35:
         for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
            if (!this.superStream.method7725(var6, 1842254816)) {
               int var4 = var2;
               int var5 = var3;

               while (var5 > 67522799 * var6.field4249) {
                  this.method7795(var6, var1, var4, 67522799 * var6.field4249, var5 + var4, (byte)-3);
                  var4 += 67522799 * var6.field4249;
                  var5 -= 67522799 * var6.field4249;
                  if (MidiPcmStream.method7731(this.superStream, var6, var1, var4, var5, (byte)2)) {
                     continue label35;
                  }
               }

               this.method7795(var6, var1, var4, var5, var5 + var4, (byte)6);
               var6.field4249 -= var5 * 699325967;
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "nk.ap(" + ')');
      }
   }
}
