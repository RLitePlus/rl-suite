import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ss")
public class classSS {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field5863 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field5862 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5861 = 4;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltz;)Lxv;")
   @ObfuscatedName("gk")
   public static Username method10508(User var0) {
      return var0.username;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laj;)Ljava/security/MessageDigest;")
   @ObfuscatedName("sk")
   public static MessageDigest method10512(classAJ var0) {
      if (var0 == null) {
         var0.method117();
      }

      try {
         return MessageDigest.getInstance("SHA-256");
      } catch (NoSuchAlgorithmException var2) {
         var2.printStackTrace();
         return null;
      }
   }

   classSS() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsj;ILse;)I")
   @ObfuscatedName("at")
   public static int method10509(AnimationSequence var0, int var1, classSE var2) {
      int var3 = 0;
      if (!AnimationSequence.method10315(var0, -831296794)) {
         var0.method10338(0, -495065585);
         return var3;
      } else {
         SequenceDefinition var4 = AnimationSequence.method10318(var0, 1643798304);
         if (var4.frameCount * 1996641051 == -1) {
            var3 |= 8;
         }

         if (SequenceDefinition.method5260(var4, (byte)-22)) {
            var0.method10338(0, -1226373711);
         } else {
            var0.method10338(var0.method10335(1958668357) + var1, -164487556);
         }

         if (!var4.isCachedModelIdSet((byte)45)) {
            int var7 = var1;
            byte var8 = 0;
            SequenceDefinition var9 = AnimationSequence.method10318(var0, 673335974);
            if (var9.frameCount * 1996641051 > 0 && var9.field2752 * -1278679125 > 0) {
               var7 = var1 % (var9.field2752 * -1278679125);
            }

            int var10 = var0.getFrame(-609025707);
            int var11 = AnimationSequence.method10329(var0, 859206463);
            int var12 = AnimationSequence.method10330(var0, -1366708833);
            if (var10 >= var9.frameIds.length) {
               var10 = 0;
               var11 = 0;
            }

            var11 += var7;

            while (var11 > var9.frameLengths[var10]) {
               var11 -= var9.frameLengths[var10];
               var10++;
               var8 |= 4;
               if ((var8 & 2) == 0 && null != var2) {
                  var2.vmethod329(var9, var10, 2066501260);
               }

               if (var10 >= var9.frameIds.length) {
                  var12++;
                  var8 |= 1;
                  var10 -= 1996641051 * var9.frameCount;
                  if (var12 >= var9.field2729 * 522964681) {
                     var8 |= 2;
                  }

                  if (var10 < 0 || var10 >= var9.frameIds.length) {
                     var8 |= 2;
                     var10 = 0;
                  }

                  if ((var8 & 2) == 0 && null != var2) {
                     var2.vmethod329(var9, var10, 10649235);
                  }
               }
            }

            var0.method10347(var10, var11, var12, (byte)76);
            var3 |= var8;
         } else {
            int var14 = var1;
            byte var15 = 0;
            SequenceDefinition var16 = AnimationSequence.method10318(var0, -1859529726);
            if (1996641051 * var16.frameCount > 0 && var1 > 0) {
               var14 = var1 - (var1 - 1) / (1996641051 * var16.frameCount) * var16.frameCount * 1996641051;
            }

            int var17 = var0.getFrame(-609025707);
            int var19 = AnimationSequence.method10330(var0, -844426314);

            while (var14 > 0) {
               var14--;
               var17++;
               var15 |= 4;
               if ((var15 & 2) == 0 && null != var2) {
                  var2.vmethod329(var16, var17, 387248469);
               }

               int var20 = var16.getMayaAnimFrame((byte)89);
               if (var17 >= var20) {
                  var19++;
                  var15 |= 1;
                  var17 -= var16.frameCount * 1996641051;
                  if (var19 >= var16.field2729 * 522964681) {
                     var15 |= 2;
                  }

                  if (var17 < 0 || var17 >= var20) {
                     var15 |= 2;
                     var17 = 0;
                  }

                  if (0 == (var15 & 2) && var2 != null) {
                     var2.vmethod329(var16, var17, 2046710120);
                  }
               }
            }

            AnimationSequence.method10351(var0, var17, var19, (byte)38);
            var3 |= var15;
         }

         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsj;ILse;)I")
   @ObfuscatedName("ag")
   public static int method10510(AnimationSequence var0, int var1, classSE var2) {
      int var3 = 0;
      if (!AnimationSequence.method10315(var0, -831296794)) {
         var0.method10338(0, -1165310142);
         return var3;
      } else {
         SequenceDefinition var4 = AnimationSequence.method10318(var0, -1705998094);
         if (var4.frameCount * 1996641051 == -1) {
            var3 |= 8;
         }

         if (SequenceDefinition.method5260(var4, (byte)-12)) {
            var0.method10338(0, -1274392671);
         } else {
            var0.method10338(var0.method10335(1958668357) + var1, -107692062);
         }

         if (!var4.isCachedModelIdSet((byte)45)) {
            int var7 = var1;
            byte var8 = 0;
            SequenceDefinition var9 = AnimationSequence.method10318(var0, 166903464);
            if (var9.frameCount * 1996641051 > 0 && var9.field2752 * -1278679125 > 0) {
               var7 = var1 % (var9.field2752 * -1278679125);
            }

            int var10 = var0.getFrame(-609025707);
            int var11 = AnimationSequence.method10329(var0, 859206463);
            int var12 = AnimationSequence.method10330(var0, -1332869024);
            if (var10 >= var9.frameIds.length) {
               var10 = 0;
               var11 = 0;
            }

            var11 += var7;

            while (var11 > var9.frameLengths[var10]) {
               var11 -= var9.frameLengths[var10];
               var10++;
               var8 |= 4;
               if ((var8 & 2) == 0 && null != var2) {
                  var2.vmethod329(var9, var10, 1340213315);
               }

               if (var10 >= var9.frameIds.length) {
                  var12++;
                  var8 |= 1;
                  var10 -= 1996641051 * var9.frameCount;
                  if (var12 >= var9.field2729 * 522964681) {
                     var8 |= 2;
                  }

                  if (var10 < 0 || var10 >= var9.frameIds.length) {
                     var8 |= 2;
                     var10 = 0;
                  }

                  if ((var8 & 2) == 0 && null != var2) {
                     var2.vmethod329(var9, var10, 1835680547);
                  }
               }
            }

            var0.method10347(var10, var11, var12, (byte)22);
            var3 |= var8;
         } else {
            int var14 = var1;
            byte var15 = 0;
            SequenceDefinition var16 = AnimationSequence.method10318(var0, -1690627599);
            if (1996641051 * var16.frameCount > 0 && var1 > 0) {
               var14 = var1 - (var1 - 1) / (1996641051 * var16.frameCount) * var16.frameCount * 1996641051;
            }

            int var17 = var0.getFrame(-609025707);
            int var19 = AnimationSequence.method10330(var0, -104116558);

            while (var14 > 0) {
               var14--;
               var17++;
               var15 |= 4;
               if ((var15 & 2) == 0 && null != var2) {
                  var2.vmethod329(var16, var17, 338088390);
               }

               int var20 = var16.getMayaAnimFrame((byte)91);
               if (var17 >= var20) {
                  var19++;
                  var15 |= 1;
                  var17 -= var16.frameCount * 1996641051;
                  if (var19 >= var16.field2729 * 522964681) {
                     var15 |= 2;
                  }

                  if (var17 < 0 || var17 >= var20) {
                     var15 |= 2;
                     var17 = 0;
                  }

                  if (0 == (var15 & 2) && var2 != null) {
                     var2.vmethod329(var16, var17, 22209548);
                  }
               }
            }

            AnimationSequence.method10351(var0, var17, var19, (byte)33);
            var3 |= var15;
         }

         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsj;ILse;)I")
   @ObfuscatedName("an")
   public static int method10511(AnimationSequence var0, int var1, classSE var2) {
      int var3 = 0;
      if (!AnimationSequence.method10315(var0, -831296794)) {
         var0.method10338(0, -1832987957);
         return var3;
      } else {
         SequenceDefinition var4 = AnimationSequence.method10318(var0, -891182682);
         if (var4.frameCount * 1996641051 == -1) {
            var3 |= 8;
         }

         if (SequenceDefinition.method5260(var4, (byte)-8)) {
            var0.method10338(0, -1545365128);
         } else {
            var0.method10338(var0.method10335(1958668357) + var1, -918839555);
         }

         if (!var4.isCachedModelIdSet((byte)64)) {
            int var7 = var1;
            byte var8 = 0;
            SequenceDefinition var9 = AnimationSequence.method10318(var0, -447523070);
            if (var9.frameCount * -844117264 > 0 && var9.field2752 * 1480945665 > 0) {
               var7 = var1 % (var9.field2752 * -299776638);
            }

            int var10 = var0.getFrame(-609025707);
            int var11 = AnimationSequence.method10329(var0, 859206463);
            int var12 = AnimationSequence.method10330(var0, -359804863);
            if (var10 >= var9.frameIds.length) {
               var10 = 0;
               var11 = 0;
            }

            var11 += var7;

            while (var11 > var9.frameLengths[var10]) {
               var11 -= var9.frameLengths[var10];
               var10++;
               var8 |= 4;
               if ((var8 & 2) == 0 && null != var2) {
                  var2.vmethod329(var9, var10, -627226049);
               }

               if (var10 >= var9.frameIds.length) {
                  var12++;
                  var8 |= 1;
                  var10 -= 589881077 * var9.frameCount;
                  if (var12 >= var9.field2729 * 522964681) {
                     var8 |= 2;
                  }

                  if (var10 < 0 || var10 >= var9.frameIds.length) {
                     var8 |= 2;
                     var10 = 0;
                  }

                  if ((var8 & 2) == 0 && null != var2) {
                     var2.vmethod329(var9, var10, -81967773);
                  }
               }
            }

            var0.method10347(var10, var11, var12, (byte)11);
            var3 |= var8;
         } else {
            int var14 = var1;
            byte var15 = 0;
            SequenceDefinition var16 = AnimationSequence.method10318(var0, 2123483247);
            if (762195494 * var16.frameCount > 0 && var1 > 0) {
               var14 = var1 - (var1 - 1) / (-15447079 * var16.frameCount) * var16.frameCount * 1094656445;
            }

            int var17 = var0.getFrame(-609025707);
            int var19 = AnimationSequence.method10330(var0, -1644529365);

            while (var14 > 0) {
               var14--;
               var17++;
               var15 |= 4;
               if ((var15 & 2) == 0 && null != var2) {
                  var2.vmethod329(var16, var17, 397603219);
               }

               int var20 = var16.getMayaAnimFrame((byte)87);
               if (var17 >= var20) {
                  var19++;
                  var15 |= 1;
                  var17 -= var16.frameCount * -38687062;
                  if (var19 >= var16.field2729 * 522964681) {
                     var15 |= 2;
                  }

                  if (var17 < 0 || var17 >= var20) {
                     var15 |= 2;
                     var17 = 0;
                  }

                  if (0 == (var15 & 2) && var2 != null) {
                     var2.vmethod329(var16, var17, 1121559568);
                  }
               }
            }

            AnimationSequence.method10351(var0, var17, var19, (byte)78);
            var3 |= var15;
         }

         return var3;
      }
   }
}
