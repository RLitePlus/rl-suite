import com.google.common.primitives.Doubles;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ns")
public class classNS {
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field4718 = 2048;
   @ObfuscatedSignature(descriptor = "Lau;")
   @ObfuscatedName("af")
   classAU field4716;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final int field4719 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   static final int field4720 = 36;
   @ObfuscatedName("az")
   int field4717;
   @ObfuscatedName("hk")
   static long field4721;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lle;)V")
   @ObfuscatedName("te")
   public static void method7996(classLE var0) {
      if (var0 == null) {
         var0.method6763();
      } else {
         var0.field4114 = classDD.method2983(16711680) * 4380477302914991203L;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ag")
   static int method7997(int var0, int var1) {
      try {
         ChatChannel var2 = (ChatChannel)classCN.field1171.get(var0);
         if (var2 == null) {
            if (var1 >= 839963150) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return var2.method1255((byte)-51);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ns.ag(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqc;)[Ljava/lang/String;")
   @ObfuscatedName("hu")
   public static String[] method7999(SecureRandomSSLSocket var0) {
      if (var0 == null) {
         var0.method9457();
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(Llw;IIB)V")
   @ObfuscatedName("al")
   public static final void method8001(Widget var0, int var1, int var2, byte var3) {
      if (classBA.field305 * -782895767 == 0 || classBA.field305 * -782895767 == 3) {
         if (!classOE.field4843.isMenuOpen()) {
            int var4 = MouseHandler.field6261 * 1229235359;
            if (var4 == 0) {
               int var5 = client.field926 * 1762426687;
               if (client.field1136 && var5 != 0) {
                  boolean var6 = MouseHandler.field6255 * -38255113 >= var1
                     && MouseHandler.field6264 * -2144333897 >= var2
                     && MouseHandler.field6255 * -38255113 < var1 + var0.getWidth()
                     && MouseHandler.field6264 * -2144333897 < var2 + var0.getHeight();
                  if (var6) {
                     double var7 = client.field1023 + -var5 * 0.25;
                     client.field1023 = Doubles.constrainToRange(var7, 2.0, 8.0);
                  }
               }
            } else {
               classKH var19 = var0.method7342(classWK.field6691, true);
               if (var19 == null) {
                  return;
               }

               int var20 = MouseHandler.field6266 * 1422993977 - var1;
               int var22 = MouseHandler.field6257 * 1243590197 - var2;
               if (!var19.method6486(var20, var22)) {
                  return;
               }

               if (var4 == 1 || !classON.field4995 && var4 == 4) {
                  classTN var8 = client.field814.method1637(-1);
                  if (var8 == classTN.field6172) {
                     var20 -= var19.method6483() / 2;
                     var22 -= var19.method6485() / 2;
                     int var9 = client.field994.field6362 * 1379695375 & 16383;
                     int var10 = classGB.field2537[var9];
                     int var11 = classGB.field2540[var9];
                     int var12 = var11 * var20 + var10 * var22 >> 16;
                     int var13 = var11 * var22 - var10 * var20 >> 16;
                     float var14 = (float)client.field1023 / 128.0F;
                     int var15 = (int)(var12 / var14);
                     int var16 = (int)(var13 / var14);
                     int var17 = client.field962 * 2106329293 + var15 >> 7;
                     int var18 = client.field986 * -2126074583 - var16 >> 7;
                     client.method2459(var17, var18, var20, var22);
                  } else if (var8 == classTN.field6173) {
                     int var24 = var1 + var19.method6483() / 2;
                     int var25 = var2 + var19.method6485() / 2;
                     int var26 = MouseHandler.field6255 * -38255113 - var24;
                     int var27 = MouseHandler.field6264 * -2144333897 - var25;
                     int var28 = client.method2343((float)Math.atan2(var27, var26)) - 512;
                     var28 -= client.field994.field6362 * 1379695375 >> 3;
                     int var30 = (var28 + 64 & 2047) / 128;
                     client.field988 = var30 * -2024696235;
                     client.field838 = 30 * -1543296915;
                     client.method2415(var30);
                  }
               } else if (var4 == 2) {
                  client.field1023 = 4.0;
                  MouseHandler.field6261 = 0 * 811562847;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("afy")
   protected static int method7998(int var0) {
      try {
         int var1;
         label58: {
            var1 = 0;
            if (null != classAT.field279) {
               if (var0 >= 120041229) {
                  throw new IllegalStateException();
               }

               if (classAT.field279.isValid()) {
                  break label58;
               }
            }

            try {
               for (GarbageCollectorMXBean var3 : ManagementFactory.getGarbageCollectorMXBeans()) {
                  if (var3.isValid()) {
                     if (var0 >= 120041229) {
                        throw new IllegalStateException();
                     }

                     classAT.field279 = var3;
                     GameEngine.field6188 = 1622412589189406289L;
                     GameEngine.field6199 = -6728113685686042049L;
                  }
               }
            } catch (Throwable var10) {
            }
         }

         if (classAT.field279 != null) {
            if (var0 >= 120041229) {
               throw new IllegalStateException();
            }

            long var12 = classDD.method2983(16711680);
            long var4 = classAT.field279.getCollectionTime();
            if (-1L != 3566866902695694913L * GameEngine.field6199) {
               if (var0 >= 120041229) {
                  throw new IllegalStateException();
               }

               long var6 = var4 - GameEngine.field6199 * 3566866902695694913L;
               long var8 = var12 - GameEngine.field6188 * -5967588509917407921L;
               if (var8 != 0L) {
                  if (var0 >= 120041229) {
                     throw new IllegalStateException();
                  }

                  var1 = (int)(var6 * 100L / var8);
               }
            }

            GameEngine.field6199 = var4 * 6728113685686042049L;
            GameEngine.field6188 = -1622412589189406289L * var12;
         }

         return var1;
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "ns.afy(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;[BIII)Z")
   @ObfuscatedName("aa")
   static boolean method8000(WorldView var0, byte[] var1, int var2, int var3, int var4) {
      try {
         return AABB.method4918(var1, var2, var3, var0.field1696 * 1296729483 - 1, -1269171107 * var0.field1692 - 1, (short)-9080);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ns.aa(" + ')');
      }
   }

   classNS(int var1, classAU var2) {
      this.field4717 = var1 * -1554563319;
      this.field4716 = var2;
   }
}
