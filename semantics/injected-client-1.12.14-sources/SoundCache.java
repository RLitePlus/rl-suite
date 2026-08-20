import java.io.File;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ds")
public class SoundCache {
   @ToRemove(unused = "true")
   @ObfuscatedName("bn")
   static final int field1481 = 64;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("at")
   AbstractArchive field1478;
   @ObfuscatedName("ab")
   static File field1483;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("av")
   AbstractArchive soundEffectIndex;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field1480 = 20;
   @ToRemove(unused = "true")
   @ObfuscatedName("ef")
   static final int field1482 = 16;
   @ObfuscatedSignature(descriptor = "Lqi;")
   @ObfuscatedName("ag")
   NodeHashTable field1477;

   @ObfuscatedSignature(descriptor = "(Lds;I[IB)Ldq;")
   @ObfuscatedName("uj")
   public static RawSound method3456(SoundCache var0, int var1, int[] var2, byte var3) {
      if (var0 == null) {
         var0.getSoundEffect(var1, var2, var3);
      }

      try {
         if (var0.soundEffectIndex.getGroupCount(1187554420) == 1) {
            if (var3 <= 0) {
               throw new IllegalStateException();
            } else {
               return var0.getSoundEffect0(0, var1, var2, 1746275493);
            }
         } else if (AbstractArchive.method9046(var0.soundEffectIndex, var1, (byte)-15) - 1 == 1) {
            return var0.getSoundEffect0(var1, 1, var2, 2109994822);
         } else if (AbstractArchive.method9046(var0.soundEffectIndex, var1, (byte)-27) - 1 == 0) {
            if (var3 <= 0) {
               throw new IllegalStateException();
            } else {
               return var0.getSoundEffect0(var1, 0, var2, 1768365620);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ds.ag(" + ')');
      }
   }

   public SoundCache(AbstractArchive var1, AbstractArchive var2) {
      new NodeHashTable(256);
      this.field1477 = new NodeHashTable(256);
      this.soundEffectIndex = var1;
      this.field1478 = var2;
   }

   @ObfuscatedSignature(descriptor = "(II[II)Ldq;")
   @ObfuscatedName("av")
   RawSound getSoundEffect0(int var1, int var2, int[] var3, int var4) {
      try {
         long var5 = this.method3469(var1, var2, false, (byte)32);
         class107 var7 = (class107)this.field1477.method8915(var5);
         if (null != var7) {
            if (var4 <= 1357438925) {
               throw new IllegalStateException();
            } else {
               return class107.method3822(var7, (short)1621);
            }
         } else {
            if (var3 != null) {
               if (var4 <= 1357438925) {
                  throw new IllegalStateException();
               }

               if (var3[0] <= 0) {
                  return null;
               }
            }

            SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
            if (var8 == null) {
               if (var4 <= 1357438925) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               RawSound var9 = SoundEffect.method3582(var8);
               this.field1477.put(new class107(var9), var5);
               if (var3 != null) {
                  var3[0] -= var9.samples.length;
               }

               return var9;
            }
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "ds.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II[I)Ldq;")
   @ObfuscatedName("ak")
   RawSound method3447(int var1, int var2, int[] var3) {
      long var4 = this.method3469(var1, var2, false, (byte)32);
      class107 var6 = (class107)this.field1477.method8915(var4);
      if (null != var6) {
         return class107.method3822(var6, (short)1621);
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
         if (var7 == null) {
            return null;
         } else {
            RawSound var8 = SoundEffect.method3582(var7);
            this.field1477.put(new class107(var8), var4);
            if (var3 != null) {
               var3[0] -= var8.samples.length;
            }

            return var8;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lds;II)Leq;")
   @ObfuscatedName("yi")
   public static class107 method3462(SoundCache var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method3465(var1, var1);
      } else {
         try {
            if (var0.field1478.getGroupCount(767668456) == 1) {
               if (var2 <= -2079702875) {
                  throw new IllegalStateException();
               } else {
                  return var0.method3455(0, var1, 115684603);
               }
            } else if (AbstractArchive.method9046(var0.field1478, var1, (byte)-27) == 1) {
               if (var2 <= -2079702875) {
                  throw new IllegalStateException();
               } else {
                  return var0.method3455(var1, 0, -670821186);
               }
            } else {
               throw new RuntimeException();
            }
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "ds.an(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Ldq;")
   @ObfuscatedName("ae")
   public RawSound method3466(int var1, byte var2) {
      try {
         return method3456(this, var1, null, (byte)99);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ds.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZB)J")
   @ObfuscatedName("aj")
   long method3469(int var1, int var2, boolean var3, byte var4) {
      try {
         int var5 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
         var5 |= var1 << 16;
         if (var3) {
            if (var4 != 32) {
               throw new IllegalStateException();
            } else {
               return var5 ^ 4294967296L;
            }
         } else {
            return var5;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ds.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lds;IIZ)J")
   @ObfuscatedName("gl")
   public static long method3470(SoundCache var0, int var1, int var2, boolean var3) {
      if (var0 == null) {
         var0.method3467(var1);
      }

      int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
      var4 |= var1 << 16;
      return var3 ? var4 ^ 4294967296L : var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lds;II[I)Ldq;")
   @ObfuscatedName("jm")
   public static RawSound method3448(SoundCache var0, int var1, int var2, int[] var3) {
      if (var0 == null) {
         var0.method3455(var1, var1, var1);
      }

      long var4 = var0.method3469(var1, var2, false, (byte)32);
      class107 var6 = (class107)var0.field1477.method8915(var4);
      if (null != var6) {
         return class107.method3822(var6, (short)1621);
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         SoundEffect var7 = SoundEffect.readSoundEffect(var0.soundEffectIndex, var1, var2);
         if (var7 == null) {
            return null;
         } else {
            RawSound var8 = SoundEffect.method3582(var7);
            var0.field1477.put(new class107(var8), var4);
            if (var3 != null) {
               var3[0] -= var8.samples.length;
            }

            return var8;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Leq;")
   @ObfuscatedName("ad")
   class107 method3453(int var1, int var2) {
      long var3 = this.method3469(var1, var2, true, (byte)32);
      class107 var5 = (class107)this.field1477.method8915(var3);
      if (null != var5) {
         return var5;
      } else {
         VorbisSample var6 = VorbisSample.readMusicSample(this.field1478, var1, var2);
         if (null == var6) {
            return new class107();
         } else {
            class107 var7 = new class107(var6);
            this.field1477.put(var7, var3);
            return var7;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II[I)Ldq;")
   @ObfuscatedName("aw")
   RawSound method3449(int var1, int var2, int[] var3) {
      long var4 = this.method3469(var1, var2, false, (byte)32);
      class107 var6 = (class107)this.field1477.method8915(var4);
      if (null != var6) {
         return class107.method3822(var6, (short)1621);
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
         if (var7 == null) {
            return null;
         } else {
            RawSound var8 = SoundEffect.method3582(var7);
            this.field1477.put(new class107(var8), var4);
            if (var3 != null) {
               var3[0] -= var8.samples.length;
            }

            return var8;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lds;IIZ)J")
   @ObfuscatedName("nw")
   public static long method3471(SoundCache var0, int var1, int var2, boolean var3) {
      if (var0 == null) {
         var0.method3465(var1, var1);
      }

      int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
      var4 |= var1 << 16;
      return var3 ? var4 ^ 4294967296L : var4;
   }

   @ObfuscatedSignature(descriptor = "(II[I)Ldq;")
   @ObfuscatedName("au")
   RawSound method3450(int var1, int var2, int[] var3) {
      long var4 = this.method3469(var1, var2, false, (byte)32);
      class107 var6 = (class107)this.field1477.method8915(var4);
      if (null != var6) {
         return class107.method3822(var6, (short)1621);
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
         if (var7 == null) {
            return null;
         } else {
            RawSound var8 = SoundEffect.method3582(var7);
            this.field1477.put(new class107(var8), var4);
            if (var3 != null) {
               var3[0] -= var8.samples.length;
            }

            return var8;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZ)J")
   @ObfuscatedName("al")
   long method3472(int var1, int var2, boolean var3) {
      int var4 = var2 ^ (var1 << 4 & 2122933122 | var1 >> 12);
      var4 |= var1 << 16;
      return var3 ? var4 ^ 4294967296L : var4;
   }

   @ObfuscatedSignature(descriptor = "(I[I)Ldq;")
   @ObfuscatedName("ai")
   RawSound method3457(int var1, int[] var2) {
      if (this.soundEffectIndex.getGroupCount(1033707977) == 1) {
         return this.getSoundEffect0(0, var1, var2, 1861227909);
      } else if (AbstractArchive.method9046(this.soundEffectIndex, var1, (byte)-76) - 1 == 1) {
         return this.getSoundEffect0(var1, 1, var2, 1599284394);
      } else if (AbstractArchive.method9046(this.soundEffectIndex, var1, (byte)-112) - 1 == 0) {
         return this.getSoundEffect0(var1, 0, var2, 1566482848);
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lds;I[I)Ldq;")
   @ObfuscatedName("iu")
   public static RawSound method3458(SoundCache var0, int var1, int[] var2) {
      if (var0.soundEffectIndex.getGroupCount(1211949972) == 1) {
         return var0.getSoundEffect0(0, var1, var2, 1623025523);
      } else if (AbstractArchive.method9046(var0.soundEffectIndex, var1, (byte)-71) - 1 == 1) {
         return var0.getSoundEffect0(var1, 1, var2, 1560838488);
      } else if (AbstractArchive.method9046(var0.soundEffectIndex, var1, (byte)-23) - 1 == 0) {
         return var0.getSoundEffect0(var1, 0, var2, 1631126790);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ldq;")
   @ObfuscatedName("ah")
   public RawSound method3467(int var1) {
      return method3456(this, var1, null, (byte)118);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lds;II)Leq;")
   @ObfuscatedName("ci")
   public static class107 method3454(SoundCache var0, int var1, int var2) {
      if (var0 == null) {
         var0.method3467(var1);
      }

      long var3 = var0.method3469(var1, var2, true, (byte)32);
      class107 var5 = (class107)var0.field1477.method8915(var3);
      if (null != var5) {
         return var5;
      } else {
         VorbisSample var6 = VorbisSample.readMusicSample(var0.field1478, var1, var2);
         if (null == var6) {
            return new class107();
         } else {
            class107 var7 = new class107(var6);
            var0.field1477.put(var7, var3);
            return var7;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I[I)Ldq;")
   @ObfuscatedName("ab")
   RawSound method3459(int var1, int[] var2) {
      if (this.soundEffectIndex.getGroupCount(1393827824) == 1) {
         return this.getSoundEffect0(0, var1, var2, 2131161080);
      } else if (AbstractArchive.method9046(this.soundEffectIndex, var1, (byte)-108) - 1 == 1) {
         return this.getSoundEffect0(var1, 1, var2, 1543870198);
      } else if (AbstractArchive.method9046(this.soundEffectIndex, var1, (byte)-111) - 1 == 0) {
         return this.getSoundEffect0(var1, 0, var2, 1377741951);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I[I)Ldq;")
   @ObfuscatedName("ac")
   RawSound method3460(int var1, int[] var2) {
      if (this.soundEffectIndex.getGroupCount(-753805066) == 1) {
         return this.getSoundEffect0(0, var1, var2, 2002225813);
      } else if (AbstractArchive.method9046(this.soundEffectIndex, var1, (byte)-58) - 1 == 1) {
         return this.getSoundEffect0(var1, 1, var2, 1495356166);
      } else if (AbstractArchive.method9046(this.soundEffectIndex, var1, (byte)-95) - 1 == 0) {
         return this.getSoundEffect0(var1, 0, var2, 1886904508);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lfz;")
   @ObfuscatedName("aj")
   static class141 method3468(int var0, byte var1) {
      try {
         class141 var2 = (class141)GrandExchangeOffer.findEnumerated(classPD.method8716((byte)14), var0, (byte)1);
         if (var2 == null) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            var2 = class141.field1946;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ds.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lds;I)Leq;")
   @ObfuscatedName("vx")
   public static class107 method3463(SoundCache var0, int var1) {
      if (var0.field1478.getGroupCount(-796830813) == 1) {
         return var0.method3455(0, var1, -1565787624);
      } else if (AbstractArchive.method9046(var0.field1478, var1, (byte)-48) == 1) {
         return var0.method3455(var1, 0, -864655566);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZI)V")
   @ObfuscatedName("ja")
   static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4, int var5) {
      if (var4) {
         rl22.method9565(Occluder.topLevelWorldView);
      }

      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 < 1) {
         var3 = 1;
      }

      int var6 = var3 - 334;
      double var7;
      if (var6 < 0) {
         var7 = client.field695;
      } else if (var6 >= 100) {
         var7 = client.field696;
      } else {
         var7 = (client.field696 - client.field695) * var6 / 100 + client.field695;
      }

      double var9 = var3 * var7 * 512.0 / (var2 * 334);
      if (var9 < client.field700) {
         var9 = client.field700;
         var7 = var9 * var2 * 334.0 / (var3 * 512);
         if (var7 > client.field638) {
            var7 = client.field638;
            double var11 = var3 * var7 * 512.0 / (var9 * 334.0);
            int var13 = (int)((var2 - var11) / 2.0);
            if (var4) {
               AbstractRasterizer.method5460();
               AbstractRasterizer.method5451(var0, var1, var13, var3, -16777216);
               AbstractRasterizer.method5451(var0 + var2 - var13, var1, var13, var3, -16777216);
            }

            var0 += var13;
            var2 -= var13 * 2;
         }
      } else if (var9 > client.field701) {
         var9 = client.field701;
         var7 = var9 * var2 * 334.0 / (var3 * 512);
         if (var7 < client.field699) {
            var7 = client.field699;
            double var16 = var9 * var2 * 334.0 / (var7 * 512.0);
            int var17 = (int)((var3 - var16) / 2.0);
            if (var4) {
               AbstractRasterizer.method5460();
               AbstractRasterizer.method5451(var0, var1, var2, var17, -16777216);
               AbstractRasterizer.method5451(var0, var3 + var1 - var17, var2, var17, -16777216);
            }

            var1 += var17;
            var3 -= var17 * 2;
         }
      }

      client.viewportZoom = (int)(var3 * var7 / 334.0) * -1881477815;
      if (var2 != client.viewportWidth * 164941911 || var3 != client.viewportHeight * 620574401) {
         client.method2425(var2, var3);
      }

      client.viewportOffsetX = var0 * 375280273;
      client.viewportOffsetY = var1 * -839518845;
      client.viewportWidth = var2 * -1787749529;
      client.viewportHeight = var3 * 1252809025;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIB)[I")
   @ObfuscatedName("av")
   static int[] method3452(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         int[] var6 = new int[256];

         for (int var7 = 0; var7 < 64; var7++) {
            if (var5 <= 0) {
               throw new IllegalStateException();
            }

            var6[var7] = classOX.method8682(var0, var1, var7, -1940838705);
         }

         for (int var9 = 0; var9 < 64; var9++) {
            if (var5 <= 0) {
               throw new IllegalStateException();
            }

            var6[64 + var9] = classOX.method8682(var1, var2, var9, -2041081507);
         }

         for (int var10 = 0; var10 < 64; var10++) {
            var6[var10 + 128] = classOX.method8682(var2, var3, var10, -2032310249);
         }

         for (int var11 = 0; var11 < 64; var11++) {
            if (var5 <= 0) {
               throw new IllegalStateException();
            }

            var6[192 + var11] = classOX.method8682(var3, var4, var11, -2137134261);
         }

         return var6;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "ds.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Leq;")
   @ObfuscatedName("at")
   class107 method3455(int var1, int var2, int var3) {
      try {
         long var4 = this.method3469(var1, var2, true, (byte)32);
         class107 var6 = (class107)this.field1477.method8915(var4);
         if (null != var6) {
            if (var3 >= 340712311) {
               throw new IllegalStateException();
            } else {
               return var6;
            }
         } else {
            VorbisSample var7 = VorbisSample.readMusicSample(this.field1478, var1, var2);
            if (null == var7) {
               if (var3 >= 340712311) {
                  throw new IllegalStateException();
               } else {
                  return new class107();
               }
            } else {
               class107 var8 = new class107(var7);
               this.field1477.put(var8, var4);
               return var8;
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "ds.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Leq;")
   @ObfuscatedName("ar")
   public class107 method3464(int var1) {
      if (this.field1478.getGroupCount(381480782) == 1) {
         return this.method3455(0, var1, -690805161);
      } else if (AbstractArchive.method9046(this.field1478, var1, (byte)-71) == 1) {
         return this.method3455(var1, 0, -1986860431);
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lds;II[I)Ldq;")
   @ObfuscatedName("ot")
   public static RawSound method3451(SoundCache var0, int var1, int var2, int[] var3) {
      if (var0 == null) {
         var0.method3464(var1);
      }

      long var4 = var0.method3469(var1, var2, false, (byte)32);
      class107 var6 = (class107)var0.field1477.method8915(var4);
      if (null != var6) {
         return class107.method3822(var6, (short)1621);
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         SoundEffect var7 = SoundEffect.readSoundEffect(var0.soundEffectIndex, var1, var2);
         if (var7 == null) {
            return null;
         } else {
            RawSound var8 = SoundEffect.method3582(var7);
            var0.field1477.put(new class107(var8), var4);
            if (var3 != null) {
               var3[0] -= var8.samples.length;
            }

            return var8;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I[IB)Ldq;")
   @ObfuscatedName("ag")
   RawSound getSoundEffect(int var1, int[] var2, byte var3) {
      try {
         if (this.field1478.method8998(1187554420) == 1) {
            if (var3 <= 0) {
               throw new IllegalStateException();
            } else {
               return this.getSoundEffect0(0, var1, var2, 1746275493);
            }
         } else if (AbstractArchive.method9046(this.soundEffectIndex, var1, (byte)-15) - 1 == 1) {
            return this.getSoundEffect0(var1, 1, var2, 2109994822);
         } else if (AbstractArchive.method9046(this.field1478, var1, (byte)-27) - 1 == 0) {
            if (var3 <= 0) {
               throw new IllegalStateException();
            } else {
               return this.getSoundEffect0(var1, 0, var2, 1768365620);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ds.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Leq;")
   @ObfuscatedName("an")
   public class107 method3465(int var1, int var2) {
      try {
         if (this.field1478.method9058(767668456) == 1) {
            if (var2 <= -2079702875) {
               throw new IllegalStateException();
            } else {
               return this.method3455(0, var1, 115684603);
            }
         } else if (AbstractArchive.method9046(this.soundEffectIndex, var1, (byte)-27) == 1) {
            if (var2 <= -2079702875) {
               throw new IllegalStateException();
            } else {
               return this.method3455(var1, 0, -670821186);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ds.an(" + ')');
      }
   }
}
