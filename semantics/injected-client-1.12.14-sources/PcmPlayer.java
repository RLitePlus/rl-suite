import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dm")
public class PcmPlayer {
   @ObfuscatedName("bo")
   int field1428;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field1438 = 10;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field1440 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field1443 = 4;
   @ObfuscatedName("bb")
   int field1432;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   protected static final int field1437 = 512;
   @ObfuscatedSignature(descriptor = "Ldn;")
   @ObfuscatedName("af")
   PcmStream stream;
   @ObfuscatedName("am")
   long timeMs;
   @ObfuscatedName("ao")
   int capacity;
   @ObfuscatedName("aa")
   int field1436;
   @ObfuscatedName("aq")
   int field1441;
   @ObfuscatedName("be")
   long field1435;
   @ObfuscatedName("bk")
   boolean field1431;
   @ObfuscatedName("bz")
   long field1425;
   @ObfuscatedName("bs")
   int field1427;
   @ObfuscatedName("ah")
   int field1434 = -413683936;
   @ObfuscatedName("al")
   protected int[] samples;
   @ObfuscatedName("bg")
   int field1429;
   @ObfuscatedSignature(descriptor = "[Ldn;")
   @ObfuscatedName("bj")
   PcmStream[] field1433;
   @ObfuscatedSignature(descriptor = "[Ldn;")
   @ObfuscatedName("bm")
   PcmStream[] field1430;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field1442 = 0;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("kx")
   static Archive field1445;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   protected void vmethod0() throws Exception {
   }

   @ObfuscatedSignature(descriptor = "(Ldm;II)V")
   @ObfuscatedName("tu")
   public static void method3375(PcmPlayer var0, int var1, int var2) {
      if (var0 == null) {
         var0.skip(var1, var1);
      }

      try {
         var0.field1432 -= var1 * -1176698205;
         if (-710098677 * var0.field1432 < 0) {
            if (var2 <= 1916706378) {
               throw new IllegalStateException();
            }

            var0.field1432 = 0;
         }

         if (var0.stream != null) {
            var0.stream.skip(var1);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dm.bk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldn;I)V")
   @ObfuscatedName("be")
   public final synchronized void setStream(PcmStream var1, int var2) {
      try {
         this.stream = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dm.be(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bo")
   public final synchronized void run(int var1) {
      try {
         if (null == this.samples) {
            if (var1 != 327716789) {
               throw new IllegalStateException();
            }
         } else {
            long var2 = ParamComposition.method4949((byte)15);

            try {
               if (-8512824579973741295L * this.field1435 != 0L) {
                  if (var1 != 327716789) {
                     throw new IllegalStateException();
                  }

                  if (var2 < this.field1435 * -8512824579973741295L) {
                     if (var1 != 327716789) {
                        throw new IllegalStateException();
                     }

                     return;
                  }

                  this.open(-570055171 * this.capacity, 2147101588);
                  this.field1435 = 0L;
                  this.field1431 = true;
               }

               int var4 = this.position(2034132374);
               if (-1593537969 * this.field1427 - var4 > this.field1428 * -1794557445) {
                  if (var1 != 327716789) {
                     throw new IllegalStateException();
                  }

                  this.field1428 = -2098403021 * (this.field1427 * -1593537969 - var4);
               }

               int var5 = 1880300539 * this.field1436 + -1941825805 * this.field1441;
               if (512 + var5 > 32768) {
                  var5 = 32256;
               }

               if (var5 + 512 > this.capacity * -570055171) {
                  if (var1 != 327716789) {
                     return;
                  }

                  this.capacity += 1300059136;
                  if (this.capacity * -570055171 > 32768) {
                     if (var1 != 327716789) {
                        throw new IllegalStateException();
                     }

                     this.capacity = -1347780608;
                  }

                  this.close((byte)63);
                  this.open(-570055171 * this.capacity, 2146775458);
                  var4 = 0;
                  this.field1431 = true;
                  if (512 + var5 > this.capacity * -570055171) {
                     if (var1 != 327716789) {
                        return;
                     }

                     var5 = -570055171 * this.capacity - 512;
                     this.field1441 = (var5 - 1880300539 * this.field1436) * -1151208901;
                  }
               }

               while (var4 < var5) {
                  if (var1 != 327716789) {
                     return;
                  }

                  this.fill(this.samples, 512);
                  this.vmethod13();
                  var4 += 512;
               }

               if (var2 > this.field1425 * 2365771317891820805L) {
                  if (var1 != 327716789) {
                     throw new IllegalStateException();
                  }

                  if (!this.field1431) {
                     if (var1 != 327716789) {
                        throw new IllegalStateException();
                     }

                     if (0 == this.field1428 * -1794557445) {
                        if (var1 != 327716789) {
                           throw new IllegalStateException();
                        }

                        if (this.field1429 * -616751957 == 0) {
                           if (var1 != 327716789) {
                              return;
                           }

                           this.close((byte)20);
                           this.field1435 = 2723783553124404209L * (2000L + var2);
                           return;
                        }
                     }

                     this.field1441 = Math.min(this.field1429 * -616751957, -1794557445 * this.field1428) * -1151208901;
                     this.field1429 = this.field1428 * 2097788913;
                  } else {
                     this.field1431 = false;
                  }

                  this.field1428 = 0;
                  this.field1425 = (2000L + var2) * 2005516284271318989L;
               }

               this.field1427 = 1179274415 * var4;
            } catch (Exception var7) {
               this.close((byte)111);
               this.field1435 = (2000L + var2) * 2723783553124404209L;
            }

            try {
               if (var2 > -578378229844875927L * this.timeMs + 500000L) {
                  var2 = this.timeMs * -578378229844875927L;
               }

               while (var2 > 5000L + this.timeMs * -578378229844875927L) {
                  if (var1 != 327716789) {
                     return;
                  }

                  method3375(this, 512, 2124002911);
                  this.timeMs = this.timeMs + -6743416701443376423L * (512000 / (1063377631 * EnumComposition.field2157));
               }
            } catch (Exception var6) {
               this.timeMs = var2 * -6743416701443376423L;
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "dm.bo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bg")
   public final void method3367(int var1) {
      try {
         this.field1431 = true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dm.bg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bx")
   public final synchronized void method3372() {
      if (null != class372.soundSystem) {
         boolean var1 = true;

         for (int var2 = 0; var2 < 2; var2++) {
            if (class372.soundSystem.players[var2] == this) {
               class372.soundSystem.players[var2] = null;
            }

            if (class372.soundSystem.players[var2] != null) {
               var1 = false;
            }
         }

         if (var1) {
            Script.soundSystemExecutor.shutdownNow();
            Script.soundSystemExecutor = null;
            class372.soundSystem = null;
         }
      }

      this.close((byte)87);
      this.samples = null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bz")
   public final synchronized void shutdown(int var1) {
      try {
         if (null != class372.soundSystem) {
            boolean var2 = true;

            for (int var3 = 0; var3 < 2; var3++) {
               if (var1 <= -2036724670) {
                  return;
               }

               if (class372.soundSystem.players[var3] == this) {
                  if (var1 <= -2036724670) {
                     throw new IllegalStateException();
                  }

                  class372.soundSystem.players[var3] = null;
               }

               if (class372.soundSystem.players[var3] != null) {
                  if (var1 <= -2036724670) {
                     throw new IllegalStateException();
                  }

                  var2 = false;
               }
            }

            if (var2) {
               if (var1 <= -2036724670) {
                  throw new IllegalStateException();
               }

               Script.soundSystemExecutor.shutdownNow();
               Script.soundSystemExecutor = null;
               class372.soundSystem = null;
            }
         }

         this.close((byte)44);
         this.samples = null;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "dm.bz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   protected void vmethod18() {
   }

   @ObfuscatedSignature(descriptor = "([II)V")
   @ObfuscatedName("bb")
   final void fill(int[] var1, int var2) {
      int var3 = var2;
      if (FaceNormal.PcmPlayer_stereo) {
         var3 = var2 << 1;
      }

      class488.clearIntArray(var1, 0, var3);
      this.field1432 -= var2 * -1176698205;
      if (null != this.stream && this.field1432 * -710098677 <= 0) {
         this.field1432 = this.field1432 + -1176698205 * (EnumComposition.field2157 * 1063377631 >> 4);
         UrlRequest.PcmStream_disable(this.stream, -4718732);
         this.method3384(this.stream, this.stream.vmethod161(), -390683352);
         int var4 = 0;
         int var5 = 255;

         label145:
         for (int var6 = 7; var5 != 0; var6--) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if (0 != (var9 & 1)) {
                  var5 &= ~(1 << var7);
                  PcmStream var10 = null;
                  PcmStream var11 = this.field1433[var7];

                  while (var11 != null) {
                     AbstractSound var12 = var11.sound;
                     if (null != var12 && var12.position > var8) {
                        var5 |= 1 << var7;
                        var10 = var11;
                        var11 = var11.after;
                     } else {
                        var11.active = true;
                        int var13 = var11.vmethod171();
                        var4 += var13;
                        if (null != var12) {
                           var12.position += var13;
                        }

                        if (var4 >= this.field1434 * -1117250359) {
                           break label145;
                        }

                        PcmStream var14 = var11.vmethod163();
                        if (var14 != null) {
                           for (int var15 = var11.field1448; null != var14; var14 = var11.vmethod169()) {
                              this.method3384(var14, var15 * var14.vmethod161() >> 8, -2108741505);
                           }
                        }

                        PcmStream var20 = var11.after;
                        var11.after = null;
                        if (var10 == null) {
                           this.field1433[var7] = var20;
                        } else {
                           var10.after = var20;
                        }

                        if (var20 == null) {
                           this.field1430[var7] = var10;
                        }

                        var11 = var20;
                     }
                  }
               }

               var7 += 4;
               var8++;
            }
         }

         for (int var16 = 0; var16 < 8; var16++) {
            PcmStream var17 = this.field1433[var16];
            PcmStream[] var18 = this.field1433;
            this.field1430[var16] = null;
            var18[var16] = null;

            while (var17 != null) {
               PcmStream var19 = var17.after;
               var17.after = null;
               var17 = var19;
            }
         }
      }

      if (-710098677 * this.field1432 < 0) {
         this.field1432 = 0;
      }

      if (null != this.stream) {
         this.stream.fill(var1, 0, var2);
      }

      this.timeMs = ParamComposition.method4949((byte)15) * -6743416701443376423L;
   }

   @ObfuscatedSignature(descriptor = "(Ldn;II)V")
   @ObfuscatedName("bj")
   final void method3384(PcmStream var1, int var2, int var3) {
      try {
         int var4 = var2 >> 5;
         PcmStream var5 = this.field1430[var4];
         if (var5 == null) {
            if (var3 == 218003032) {
               throw new IllegalStateException();
            }

            this.field1433[var4] = var1;
         } else {
            var5.after = var1;
         }

         this.field1430[var4] = var1;
         var1.field1448 = var2;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "dm.bj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("av")
   protected void init(byte var1) throws Exception {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dm.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("at")
   protected void open(int var1, int var2) throws Exception {
      try {
         ;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dm.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   protected int position(int var1) throws Exception {
      try {
         return this.capacity * -570055171;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dm.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("wg")
   public void method3388() {
      if (this.samples == null) {
         PcmStreamMixer var1 = SecureUrlRequester.client.method2557();
         synchronized (var1) {
            var1.method3445().clear();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ae")
   protected void close(byte var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dm.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aj")
   protected void discard(byte var1) throws Exception {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dm.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ct")
   final void method3376(int var1) {
      this.field1432 -= var1 * -1176698205;
      if (-88911094 * this.field1432 < 0) {
         this.field1432 = 0;
      }

      if (this.stream != null) {
         this.stream.skip(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   protected void vmethod1() throws Exception {
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   protected int vmethod9() throws Exception {
      return this.capacity * 527403039;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   protected void vmethod4() throws Exception {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfy;Lry;ILfs;I)V")
   @ObfuscatedName("ke")
   public static void method3382(classFY var0, TransformationMatrix var1, int var2, class136 var3, int var4) {
      float[] var5 = var3.method4080(var0.field1929 * -342400765, (byte)0);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (var0.field1944[var2] != null) {
         classFT var9 = var0.field1944[var2][6];
         classFT var10 = var0.field1944[var2][7];
         classFT var11 = var0.field1944[var2][8];
         if (var9 != null) {
            var6 = var9.method4110(var4, (byte)13);
         }

         if (null != var10) {
            var7 = var10.method4110(var4, (byte)2);
         }

         if (var11 != null) {
            var8 = var11.method4110(var4, (byte)32);
         }
      }

      TransformationMatrix var12 = SecureUrlRequester.method3893(-961071485);
      TransformationMatrix.method9953(var12, var6, var7, var8, 2067568072);
      TransformationMatrix.method9959(var1, var12, (byte)-102);
      TransformationMatrix.method9929(var12, (byte)1);
   }

   protected PcmPlayer() {
      this.timeMs = ParamComposition.method4949((byte)15) * -6743416701443376423L;
      this.field1435 = 0L;
      this.field1428 = 0;
      this.field1429 = 0;
      this.field1427 = 0;
      this.field1425 = 0L;
      this.field1431 = true;
      this.field1432 = 0;
      this.field1433 = new PcmStream[8];
      this.field1430 = new PcmStream[8];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bh")
   public final void method3368() {
      this.field1431 = true;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ad")
   protected void vmethod8(int var1) throws Exception {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   protected void vmethod2() throws Exception {
   }

   @ObfuscatedSignature(descriptor = "(Ldn;I)V")
   @ObfuscatedName("cb")
   final void method3385(PcmStream var1, int var2) {
      int var3 = var2 >> 5;
      PcmStream var4 = this.field1430[var3];
      if (var4 == null) {
         this.field1433[var3] = var1;
      } else {
         var4.after = var1;
      }

      this.field1430[var3] = var1;
      var1.field1448 = var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bc")
   public final synchronized void method3369() {
      this.field1431 = true;

      try {
         this.discard((byte)89);
      } catch (Exception var2) {
         this.close((byte)85);
         this.field1435 = (ParamComposition.method4949((byte)15) + 2000L) * 2723783553124404209L;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   protected void vmethod19() {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   protected void write() {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   protected void vmethod15() throws Exception {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   protected void vmethod22() throws Exception {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldm;I)V")
   @ObfuscatedName("ic")
   public static void method3377(PcmPlayer var0, int var1) {
      if (var0 == null) {
         var0.vmethod22();
      }

      var0.field1432 -= var1 * -1176698205;
      if (-710098677 * var0.field1432 < 0) {
         var0.field1432 = 0;
      }

      if (var0.stream != null) {
         var0.stream.skip(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   protected void vmethod23() throws Exception {
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ce")
   final void method3378(int var1) {
      this.field1432 -= var1 * -1176698205;
      if (1257028771 * this.field1432 < 0) {
         this.field1432 = 0;
      }

      if (this.stream != null) {
         this.stream.skip(var1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lic;II)Ldm;")
   @ObfuscatedName("bp")
   public static final PcmPlayer method3353(TaskHandler var0, int var1, int var2) {
      if (0 == EnumComposition.field2157 * 1063377631) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < -207725119) {
            var2 = 30722462;
         }

         try {
            PcmPlayer var3 = class380.pcmPlayerProvider.player((short)339);
            var3.samples = new int[(FaceNormal.PcmPlayer_stereo ? 2 : 1) * 512];
            var3.field1436 = -1039144153 * var2;
            var3.init((byte)15);
            var3.capacity = ((var2 & 82883073) + 2048) * -461352671;
            if (var3.capacity * -1088019577 > 32768) {
               var3.capacity = -2054299303;
            }

            var3.open(-570055171 * var3.capacity, 2144515816);
            if (class339.field4369 * -1378093337 > 0 && class372.soundSystem == null) {
               class372.soundSystem = new SoundSystem();
               Script.soundSystemExecutor = Executors.newScheduledThreadPool(1);
               Script.soundSystemExecutor.scheduleAtFixedRate(class372.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (class372.soundSystem != null) {
               if (class372.soundSystem.players[var1] != null) {
                  throw new IllegalArgumentException();
               }

               class372.soundSystem.players[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            client.method2460(var4);
            return new PcmPlayer();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lic;II)Ldm;")
   @ObfuscatedName("bt")
   public static final PcmPlayer method3354(TaskHandler var0, int var1, int var2) {
      if (0 == EnumComposition.field2157 * 1063377631) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 512) {
            var2 = 512;
         }

         try {
            PcmPlayer var3 = class380.pcmPlayerProvider.player((short)339);
            var3.samples = new int[(FaceNormal.PcmPlayer_stereo ? 2 : 1) * 512];
            var3.field1436 = -1446791373 * var2;
            var3.init((byte)15);
            var3.capacity = ((var2 & -2048) + 2048) * -523018411;
            if (var3.capacity * -570055171 > 32768) {
               var3.capacity = -1347780608;
            }

            var3.open(-570055171 * var3.capacity, 2145561803);
            if (class339.field4369 * -1378093337 > 0 && class372.soundSystem == null) {
               class372.soundSystem = new SoundSystem();
               Script.soundSystemExecutor = Executors.newScheduledThreadPool(1);
               Script.soundSystemExecutor.scheduleAtFixedRate(class372.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (class372.soundSystem != null) {
               if (class372.soundSystem.players[var1] != null) {
                  throw new IllegalArgumentException();
               }

               class372.soundSystem.players[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            client.method2460(var4);
            return new PcmPlayer();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("ba")
   static final void method3357(PcmStream var0) {
      var0.active = false;
      if (null != var0.sound) {
         var0.sound.position = 0;
      }

      for (PcmStream var1 = var0.vmethod163(); null != var1; var1 = var0.vmethod169()) {
         UrlRequest.PcmStream_disable(var1, 1639779956);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   protected void vmethod7(int var1) throws Exception {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("bi")
   static final void method3358(PcmStream var0) {
      var0.active = false;
      if (null != var0.sound) {
         var0.sound.position = 0;
      }

      for (PcmStream var1 = var0.vmethod163(); null != var1; var1 = var0.vmethod169()) {
         UrlRequest.PcmStream_disable(var1, 1748918287);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bs")
   public final synchronized void tryDiscard(int var1) {
      try {
         this.field1431 = true;

         try {
            this.discard((byte)67);
         } catch (Exception var3) {
            this.close((byte)49);
            this.field1435 = (ParamComposition.method4949((byte)15) + 2000L) * 2723783553124404209L;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "dm.bs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("by")
   public final synchronized void method3360(PcmStream var1) {
      this.stream = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("bw")
   public final synchronized void method3361(PcmStream var1) {
      this.stream = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bn")
   public final synchronized void method3364() {
      if (null != this.samples) {
         long var1 = ParamComposition.method4949((byte)15);

         try {
            if (-8512824579973741295L * this.field1435 != 0L) {
               if (var1 < this.field1435 * -8512824579973741295L) {
                  return;
               }

               this.open(-570055171 * this.capacity, 2146071305);
               this.field1435 = 0L;
               this.field1431 = true;
            }

            int var3 = this.position(1543866289);
            if (-1593537969 * this.field1427 - var3 > this.field1428 * -761849646) {
               this.field1428 = 1894313462 * (this.field1427 * -1750309491 - var3);
            }

            int var4 = 1880300539 * this.field1436 + -1941825805 * this.field1441;
            if (1046368070 + var4 > 32768) {
               var4 = 1082489231;
            }

            if (var4 + -420654558 > this.capacity * -570055171) {
               this.capacity += 1932484242;
               if (this.capacity * -1066107990 > 1807858431) {
                  this.capacity = 293362096;
               }

               this.close((byte)23);
               this.open(-570055171 * this.capacity, 2147309491);
               var3 = 0;
               this.field1431 = true;
               if (-1450201311 + var4 > this.capacity * 254691681) {
                  var4 = -570055171 * this.capacity - -1454663245;
                  this.field1441 = (var4 - 1880300539 * this.field1436) * -1759486783;
               }
            }

            while (var3 < var4) {
               this.fill(this.samples, -1480687735);
               this.vmethod13();
               var3 += 512;
            }

            if (var1 > this.field1425 * 2365771317891820805L) {
               if (!this.field1431) {
                  if (0 == this.field1428 * -690071387 && this.field1429 * -1156428296 == 0) {
                     this.close((byte)116);
                     this.field1435 = 2723783553124404209L * (2000L + var1);
                     return;
                  }

                  this.field1441 = Math.min(this.field1429 * -616751957, -1794557445 * this.field1428) * -1151208901;
                  this.field1429 = this.field1428 * 2097788913;
               } else {
                  this.field1431 = false;
               }

               this.field1428 = 0;
               this.field1425 = (2000L + var1) * 2005516284271318989L;
            }

            this.field1427 = 1526472801 * var3;
         } catch (Exception var6) {
            this.close((byte)13);
            this.field1435 = (2000L + var1) * 2723783553124404209L;
         }

         try {
            if (var1 > -578378229844875927L * this.timeMs + 500000L) {
               var1 = this.timeMs * -578378229844875927L;
            }

            while (var1 > 5000L + this.timeMs * -578378229844875927L) {
               method3375(this, -691983519, 2056984568);
               this.timeMs = this.timeMs + -6743416701443376423L * (1234480009 / (1063377631 * EnumComposition.field2157));
            }
         } catch (Exception var5) {
            this.timeMs = var1 * -6743416701443376423L;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bd")
   public final synchronized void method3365() {
      if (null != this.samples) {
         long var1 = ParamComposition.method4949((byte)15);

         try {
            if (-8512824579973741295L * this.field1435 != 0L) {
               if (var1 < this.field1435 * -8512824579973741295L) {
                  return;
               }

               this.open(-1023112263 * this.capacity, 2144263933);
               this.field1435 = 0L;
               this.field1431 = true;
            }

            int var3 = this.position(-558718220);
            if (-1593537969 * this.field1427 - var3 > this.field1428 * -1794557445) {
               this.field1428 = 481328383 * (this.field1427 * -775304449 - var3);
            }

            int var4 = 1880300539 * this.field1436 + -1941825805 * this.field1441;
            if (512 + var4 > -369615493) {
               var4 = 32256;
            }

            if (var4 + 393249494 > this.capacity * -524183086) {
               this.capacity += 1300059136;
               if (this.capacity * 2019793424 > 1344175742) {
                  this.capacity = -1347780608;
               }

               this.close((byte)37);
               this.open(-570055171 * this.capacity, 2145798393);
               var3 = 0;
               this.field1431 = true;
               if (512 + var4 > this.capacity * 1260268309) {
                  var4 = -1574997968 * this.capacity - 460291226;
                  this.field1441 = (var4 - 1880300539 * this.field1436) * -1151208901;
               }
            }

            while (var3 < var4) {
               this.fill(this.samples, 1487939692);
               this.vmethod13();
               var3 += 512;
            }

            if (var1 > this.field1425 * 2365771317891820805L) {
               if (!this.field1431) {
                  if (0 == this.field1428 * 1732957781 && this.field1429 * -616751957 == 0) {
                     this.close((byte)116);
                     this.field1435 = 2723783553124404209L * (2000L + var1);
                     return;
                  }

                  this.field1441 = Math.min(this.field1429 * -758901298, -1243324790 * this.field1428) * 1566043446;
                  this.field1429 = this.field1428 * 2097788913;
               } else {
                  this.field1431 = false;
               }

               this.field1428 = 0;
               this.field1425 = (2000L + var1) * 2005516284271318989L;
            }

            this.field1427 = 1179274415 * var3;
         } catch (Exception var6) {
            this.close((byte)7);
            this.field1435 = (2000L + var1) * 2723783553124404209L;
         }

         try {
            if (var1 > -578378229844875927L * this.timeMs + 500000L) {
               var1 = this.timeMs * -578378229844875927L;
            }

            while (var1 > 5000L + this.timeMs * -578378229844875927L) {
               method3375(this, -1651619494, 2019641676);
               this.timeMs = this.timeMs + -6743416701443376423L * (1928683154 / (1063377631 * EnumComposition.field2157));
            }
         } catch (Exception var5) {
            this.timeMs = var1 * -6743416701443376423L;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldm;I)V")
   @ObfuscatedName("al")
   public static void method3379(PcmPlayer var0, int var1) {
      if (var0 == null) {
         var0.write();
      }

      var0.field1432 -= var1 * -1176698205;
      if (-710098677 * var0.field1432 < 0) {
         var0.field1432 = 0;
      }

      if (var0.stream != null) {
         var0.stream.skip(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("br")
   public final synchronized void method3366() {
      if (null != this.samples) {
         long var1 = ParamComposition.method4949((byte)15);

         try {
            if (-8512824579973741295L * this.field1435 != 0L) {
               if (var1 < this.field1435 * -8512824579973741295L) {
                  return;
               }

               this.open(-570055171 * this.capacity, 2145296814);
               this.field1435 = 0L;
               this.field1431 = true;
            }

            int var3 = this.position(-561868430);
            if (-1593537969 * this.field1427 - var3 > this.field1428 * -1794557445) {
               this.field1428 = 1491829893 * (this.field1427 * -1593537969 - var3);
            }

            int var4 = 1880300539 * this.field1436 + -1941825805 * this.field1441;
            if (512 + var4 > 32768) {
               var4 = 32256;
            }

            if (var4 + -2030582059 > this.capacity * -570055171) {
               this.capacity += -627360631;
               if (this.capacity * 823845928 > 32768) {
                  this.capacity = -1347780608;
               }

               this.close((byte)55);
               this.open(1810501430 * this.capacity, 2144073173);
               var3 = 0;
               this.field1431 = true;
               if (512 + var4 > this.capacity * -570055171) {
                  var4 = -1684893687 * this.capacity - 512;
                  this.field1441 = (var4 - -817234095 * this.field1436) * -1151208901;
               }
            }

            while (var3 < var4) {
               this.fill(this.samples, 512);
               this.vmethod13();
               var3 += 512;
            }

            if (var1 > this.field1425 * 2365771317891820805L) {
               if (!this.field1431) {
                  if (0 == this.field1428 * -1794557445 && this.field1429 * -616751957 == 0) {
                     this.close((byte)101);
                     this.field1435 = 2723783553124404209L * (2000L + var1);
                     return;
                  }

                  this.field1441 = Math.min(this.field1429 * -616751957, -1794557445 * this.field1428) * 455596548;
                  this.field1429 = this.field1428 * 8009797;
               } else {
                  this.field1431 = false;
               }

               this.field1428 = 0;
               this.field1425 = (2000L + var1) * 2005516284271318989L;
            }

            this.field1427 = 1112114262 * var3;
         } catch (Exception var6) {
            this.close((byte)8);
            this.field1435 = (2000L + var1) * 2723783553124404209L;
         }

         try {
            if (var1 > -578378229844875927L * this.timeMs + 500000L) {
               var1 = this.timeMs * -578378229844875927L;
            }

            while (var1 > 5000L + this.timeMs * -578378229844875927L) {
               method3375(this, 1474118485, 2035111247);
               this.timeMs = this.timeMs + -6743416701443376423L * (-185426483 / (1063377631 * EnumComposition.field2157));
            }
         } catch (Exception var5) {
            this.timeMs = var1 * -6743416701443376423L;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   protected void vmethod3() throws Exception {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   protected void vmethod16() {
   }

   @ObfuscatedSignature(descriptor = "(Ldn;)V")
   @ObfuscatedName("bf")
   public final synchronized void method3362(PcmStream var1) {
      this.stream = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bq")
   public final synchronized void method3371() {
      this.field1431 = true;

      try {
         this.discard((byte)81);
      } catch (Exception var2) {
         this.close((byte)91);
         this.field1435 = (ParamComposition.method4949((byte)15) + 2000L) * 2723783553124404209L;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("nl")
   static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      client.method2459(var0, var1, var2, var3, var4, var5, var6);

      try {
         if (!WidgetDefinition.method7961(class226.widgetDefinition, var0, -1746356712)) {
            if (var7 != -722766257) {
               throw new IllegalStateException();
            } else {
               client.method2485(var0, var1, var2, var3, var4, var5, var6);
            }
         } else {
            class545.updateInterface(
               class226.widgetDefinition.Widget_interfaceComponents[var0],
               0,
               class226.widgetDefinition.Widget_interfaceComponents[var0].length - 1,
               -1,
               -1,
               var1,
               var2,
               var3,
               var4,
               var5,
               var6,
               -27848124
            );
            client.method2485(var0, var1, var2, var3, var4, var5, var6);
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "dm.nl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bv")
   public final synchronized void method3374() {
      if (null != class372.soundSystem) {
         boolean var1 = true;

         for (int var2 = 0; var2 < 2; var2++) {
            if (class372.soundSystem.players[var2] == this) {
               class372.soundSystem.players[var2] = null;
            }

            if (class372.soundSystem.players[var2] != null) {
               var1 = false;
            }
         }

         if (var1) {
            Script.soundSystemExecutor.shutdownNow();
            Script.soundSystemExecutor = null;
            class372.soundSystem = null;
         }
      }

      this.close((byte)59);
      this.samples = null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   protected int vmethod10() throws Exception {
      return this.capacity * -570055171;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lic;II)Ldm;")
   @ObfuscatedName("bm")
   public static final PcmPlayer method3355(TaskHandler var0, int var1, int var2) {
      if (0 == EnumComposition.field2157 * 1063377631) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 512) {
            var2 = 512;
         }

         try {
            PcmPlayer var3 = class380.pcmPlayerProvider.player((short)339);
            var3.samples = new int[(FaceNormal.PcmPlayer_stereo ? 2 : 1) * 512];
            var3.field1436 = -1446791373 * var2;
            var3.init((byte)15);
            var3.capacity = ((var2 & -2048) + 2048) * -523018411;
            if (var3.capacity * -570055171 > 32768) {
               var3.capacity = -1347780608;
            }

            var3.open(-570055171 * var3.capacity, 2145451760);
            if (class339.field4369 * -1378093337 > 0 && class372.soundSystem == null) {
               class372.soundSystem = new SoundSystem();
               Script.soundSystemExecutor = Executors.newScheduledThreadPool(1);
               Script.soundSystemExecutor.scheduleAtFixedRate(class372.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (class372.soundSystem != null) {
               if (class372.soundSystem.players[var1] != null) {
                  throw new IllegalArgumentException();
               }

               class372.soundSystem.players[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            client.method2460(var4);
            return new PcmPlayer();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "([II)V")
   @ObfuscatedName("cm")
   final void method3383(int[] var1, int var2) {
      int var3 = var2;
      if (FaceNormal.PcmPlayer_stereo) {
         var3 = var2 << 1;
      }

      class488.clearIntArray(var1, 0, var3);
      this.field1432 -= var2 * -1176698205;
      if (null != this.stream && this.field1432 * -710098677 <= 0) {
         this.field1432 = this.field1432 + 1697404792 * (EnumComposition.field2157 * -2073753068 >> 4);
         UrlRequest.PcmStream_disable(this.stream, 1588880773);
         this.method3384(this.stream, this.stream.vmethod161(), 1595614525);
         int var4 = 0;
         int var5 = 255;

         label142:
         for (int var6 = 7; var5 != 0; var6--) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if (0 != (var9 & 1)) {
                  var5 &= ~(1 << var7);
                  PcmStream var10 = null;
                  PcmStream var11 = this.field1433[var7];

                  while (var11 != null) {
                     AbstractSound var12 = var11.sound;
                     if (null != var12 && var12.position > var8) {
                        var5 |= 1 << var7;
                        var10 = var11;
                        var11 = var11.after;
                     } else {
                        var11.active = true;
                        int var13 = var11.vmethod171();
                        var4 += var13;
                        if (null != var12) {
                           var12.position += var13;
                        }

                        if (var4 >= this.field1434 * -1117250359) {
                           break label142;
                        }

                        PcmStream var14 = var11.vmethod163();
                        if (var14 != null) {
                           for (int var15 = var11.field1448; null != var14; var14 = var11.vmethod169()) {
                              this.method3384(var14, var15 * var14.vmethod161() >> 8, 1510948995);
                           }
                        }

                        PcmStream var20 = var11.after;
                        var11.after = null;
                        if (var10 == null) {
                           this.field1433[var7] = var20;
                        } else {
                           var10.after = var20;
                        }

                        if (var20 == null) {
                           this.field1430[var7] = var10;
                        }

                        var11 = var20;
                     }
                  }
               }

               var7 += 4;
               var8++;
            }
         }

         for (int var16 = 0; var16 < 8; var16++) {
            PcmStream var17 = this.field1433[var16];
            PcmStream[] var18 = this.field1433;
            this.field1430[var16] = null;
            var18[var16] = null;

            while (var17 != null) {
               PcmStream var19 = var17.after;
               var17.after = null;
               var17 = var19;
            }
         }
      }

      if (-710098677 * this.field1432 < 0) {
         this.field1432 = 0;
      }

      if (null != this.stream) {
         this.stream.fill(var1, 0, var2);
      }

      this.timeMs = ParamComposition.method4949((byte)15) * -6743416701443376423L;
   }

   @ObfuscatedSignature(descriptor = "(Ldn;I)V")
   @ObfuscatedName("ck")
   final void method3386(PcmStream var1, int var2) {
      int var3 = var2 >> 5;
      PcmStream var4 = this.field1430[var3];
      if (var4 == null) {
         this.field1433[var3] = var1;
      } else {
         var4.after = var1;
      }

      this.field1430[var3] = var1;
      var1.field1448 = var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   protected void vmethod14() throws Exception {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   protected void vmethod12() throws Exception {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   protected void vmethod13() throws Exception {
      try {
         ;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "dm.an(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lic;II)Ldm;")
   @ObfuscatedName("bu")
   public static final PcmPlayer method3356(TaskHandler var0, int var1, int var2) {
      if (0 == EnumComposition.field2157 * 1063377631) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 512) {
            var2 = 512;
         }

         try {
            PcmPlayer var3 = class380.pcmPlayerProvider.player((short)339);
            var3.samples = new int[(FaceNormal.PcmPlayer_stereo ? 2 : 1) * 512];
            var3.field1436 = -1446791373 * var2;
            var3.init((byte)15);
            var3.capacity = ((var2 & -2048) + 2048) * -523018411;
            if (var3.capacity * -570055171 > 32768) {
               var3.capacity = -1347780608;
            }

            var3.open(-570055171 * var3.capacity, 2145566882);
            if (class339.field4369 * -1378093337 > 0 && class372.soundSystem == null) {
               class372.soundSystem = new SoundSystem();
               Script.soundSystemExecutor = Executors.newScheduledThreadPool(1);
               Script.soundSystemExecutor.scheduleAtFixedRate(class372.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (class372.soundSystem != null) {
               if (class372.soundSystem.players[var1] != null) {
                  throw new IllegalArgumentException();
               }

               class372.soundSystem.players[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            client.method2460(var4);
            return new PcmPlayer();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bk")
   final void skip(int var1, int var2) {
      try {
         this.field1429 = this.field1441 - var1 * -1176698205;
         if (-710098677 * this.field1434 < 0) {
            if (var2 <= 1916706378) {
               throw new IllegalStateException();
            }

            this.field1432 = 0;
         }

         if (this.stream != null) {
            this.stream.skip(var1);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dm.bk(" + ')');
      }
   }
}
