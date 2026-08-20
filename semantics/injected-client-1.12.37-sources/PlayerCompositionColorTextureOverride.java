import net.runelite.api.ColorTextureOverride;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pi")
public class PlayerCompositionColorTextureOverride implements ColorTextureOverride {
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field5264 = 8;
   @ObfuscatedSignature(descriptor = "Lfx;")
   @ObfuscatedName("aj")
   public Model field5268;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field5266 = 91;
   @ObfuscatedName("as")
   public short[] field5261;
   @ObfuscatedName("ag")
   public short[] field5260;
   @ObfuscatedName("ax")
   int field5257 = 1424760829;
   @ObfuscatedName("ac")
   int field5258 = 286785645;
   @ObfuscatedName("aa")
   int field5259 = -1097885037;
   @ObfuscatedName("ao")
   int field5262 = 74289375;
   @ObfuscatedName("al")
   public int field5263;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5267 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field5265 = 2;

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ae")
   public boolean method8900(byte var1) {
      try {
         boolean var10000;
         if (null != this.field5260) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pi.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ag")
   boolean method8905(int var1, int var2) {
      try {
         if (0 == var1) {
            if (var2 != 938234762) {
               throw new IllegalStateException();
            }

            if (-292131739 * this.field5259 != -1) {
               return true;
            }

            if (var2 != 938234762) {
               throw new IllegalStateException();
            }
         }

         if (var1 != 1 || 10867937 * this.field5262 == -1) {
            return false;
         } else if (var2 != 938234762) {
            throw new IllegalStateException();
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "pi.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpi;I)I")
   @ObfuscatedName("cz")
   public static int method8909(PlayerCompositionColorTextureOverride var0, int var1) {
      if (var0 == null) {
         var0.method8914(var1, var1);
      }

      return var1 == 0 ? 22782873 * var0.field5257 : -1158941029 * var0.field5258;
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("as")
   int method8910(int var1, byte var2) {
      try {
         return var1 == 0 ? 956156587 * this.field5257 : -1158941029 * this.field5258;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "pi.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpi;I)Z")
   @ObfuscatedName("gw")
   public static boolean method8898(PlayerCompositionColorTextureOverride var0, int var1) {
      if (var0 == null) {
         return var0.method8899(var1);
      } else {
         try {
            boolean var10000;
            if (var0.field5261 != null) {
               if (var1 >= -631212490) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "pi.af(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpi;I)Z")
   @ObfuscatedName("lc")
   public static boolean method8901(PlayerCompositionColorTextureOverride var0, int var1) {
      if (var0 == null) {
         var0.method8905(var1, var1);
      }

      return 0 == var1 && -1 != 956156587 * var0.field5257 || var1 == 1 && var0.field5258 * -1158941029 != -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpi;I)Z")
   @ObfuscatedName("if")
   public static boolean method8902(PlayerCompositionColorTextureOverride var0, int var1) {
      if (var0 == null) {
         var0.method8908(var1);
      }

      return 0 == var1 && -1 != 956156587 * var0.field5257 || var1 == 1 && var0.field5258 * -1158941029 != -1;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ax")
   int method8914(int var1, int var2) {
      try {
         int var10000;
         if (0 == var1) {
            if (var2 == -1601733392) {
               throw new IllegalStateException();
            }

            var10000 = this.field5259 * -292131739;
         } else {
            var10000 = 10867937 * this.field5262;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "pi.ax(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpi;I)Z")
   @ObfuscatedName("ja")
   public static boolean method8903(PlayerCompositionColorTextureOverride var0, int var1) {
      return var0 == null ? var0.method8907(var1) : 0 == var1 && -1 != 956156587 * var0.field5257 || var1 == 1 && var0.field5258 * -1158941029 != -1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   int method8911(int var1) {
      return var1 == 0 ? -1063788746 * this.field5257 : -1158941029 * this.field5258;
   }

   public short[] getColorToReplaceWith() {
      return this.field5261;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ab")
   boolean method8904(int var1, int var2) {
      try {
         if (0 == var1) {
            if (var2 <= -1663814620) {
               throw new IllegalStateException();
            }

            if (-1 != 956156587 * this.field5257) {
               return true;
            }

            if (var2 <= -1663814620) {
               throw new IllegalStateException();
            }
         }

         if (var1 != 1 || this.field5258 * -1158941029 == -1) {
            return false;
         } else if (var2 <= -1663814620) {
            throw new IllegalStateException();
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "pi.ab(" + ')');
      }
   }

   public short[] getTextureToReplaceWith() {
      return this.field5260;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILxy;)Lpi;")
   @ObfuscatedName("aa")
   public static PlayerCompositionColorTextureOverride method8896(int var0, Buffer var1) {
      int var2 = Buffer.method13039(var1, -346779531);
      boolean var3 = (var2 & 1) != 0;
      boolean var4 = 0 != (var2 & 2);
      boolean var5 = (var2 & 4) != 0;
      boolean var6 = 0 != (var2 & 8);
      PlayerCompositionColorTextureOverride var7 = new PlayerCompositionColorTextureOverride(var0);
      if (var3) {
         int var8 = Buffer.method13039(var1, -346779531);
         int[] var9 = new int[]{var8 & 15, var8 >> 4 & 15};
         boolean var10 = null != var7.field5261 && var7.field5261.length == var9.length;

         for (int var11 = 0; var11 < 2; var11++) {
            if (15 != var9[var11]) {
               short var12 = (short)Buffer.method13047(var1, -958221560);
               if (var10) {
                  var7.field5261[var9[var11]] = var12;
               }
            }
         }
      }

      if (var4) {
         int var13 = Buffer.method13039(var1, -346779531);
         int[] var14 = new int[]{var13 & 15, var13 >> 4 & 15};
         boolean var15 = null != var7.field5260 && var7.field5260.length == var14.length;

         for (int var16 = 0; var16 < 2; var16++) {
            if (15 != var14[var16]) {
               short var17 = (short)Buffer.method13047(var1, -1039993073);
               if (var15) {
                  var7.field5260[var14[var16]] = var17;
               }
            }
         }
      }

      if (var5) {
         var7.field5257 = var1.method13117(classXM.field6888.field6890, 1919755029) * -1424760829;
         var7.field5258 = var1.method13117(classXM.field6888.field6890, 1450990995) * -286785645;
      }

      if (var6) {
         var7.field5259 = var1.method13117(classXM.field6888.field6890, 1783821026) * 1097885037;
         var7.field5262 = var1.method13117(classXM.field6888.field6890, 1721372049) * -74289375;
      }

      return var7;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ay")
   boolean method8906(int var1) {
      return 0 == var1 && 889924629 * this.field5259 != -1 || var1 == 1 && 10867937 * this.field5262 != -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILxy;)Lpi;")
   @ObfuscatedName("ac")
   public static PlayerCompositionColorTextureOverride method8897(int var0, Buffer var1) {
      int var2 = Buffer.method13039(var1, -346779531);
      boolean var3 = (var2 & 1) != 0;
      boolean var4 = 0 != (var2 & 2);
      boolean var5 = (var2 & 4) != 0;
      boolean var6 = 0 != (var2 & 8);
      PlayerCompositionColorTextureOverride var7 = new PlayerCompositionColorTextureOverride(var0);
      if (var3) {
         int var8 = Buffer.method13039(var1, -346779531);
         int[] var9 = new int[]{var8 & 15, var8 >> 4 & 15};
         boolean var10 = null != var7.field5261 && var7.field5261.length == var9.length;

         for (int var11 = 0; var11 < 2; var11++) {
            if (15 != var9[var11]) {
               short var12 = (short)Buffer.method13047(var1, -911564702);
               if (var10) {
                  var7.field5261[var9[var11]] = var12;
               }
            }
         }
      }

      if (var4) {
         int var13 = Buffer.method13039(var1, -346779531);
         int[] var14 = new int[]{var13 & 15, var13 >> 4 & 15};
         boolean var15 = null != var7.field5260 && var7.field5260.length == var14.length;

         for (int var16 = 0; var16 < 2; var16++) {
            if (15 != var14[var16]) {
               short var17 = (short)Buffer.method13047(var1, 923550907);
               if (var15) {
                  var7.field5260[var14[var16]] = var17;
               }
            }
         }
      }

      if (var5) {
         var7.field5257 = var1.method13117(classXM.field6888.field6890, 1672296045) * -1424760829;
         var7.field5258 = var1.method13117(classXM.field6888.field6890, 1678631184) * -286785645;
      }

      if (var6) {
         var7.field5259 = var1.method13117(classXM.field6888.field6890, 1857278622) * 1097885037;
         var7.field5262 = var1.method13117(classXM.field6888.field6890, 2146828395) * -74289375;
      }

      return var7;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aq")
   boolean method8907(int var1) {
      return 0 == var1 && -292131739 * this.field5259 != -1 || var1 == 1 && 10867937 * this.field5262 != -1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ad")
   int method8912(int var1) {
      return var1 == 0 ? 956156587 * this.field5257 : -1158941029 * this.field5258;
   }

   public PlayerCompositionColorTextureOverride(int var1) {
      ItemComposition var2 = classOB.method8299(var1, (byte)52);
      if (var2.method8700(-1879922488)) {
         this.field5261 = new short[var2.field5041.length];
         System.arraycopy(var2.field5041, 0, this.field5261, 0, this.field5261.length);
      }

      if (var2.method8702(509268873)) {
         this.field5260 = new short[var2.field5017.length];
         System.arraycopy(var2.field5017, 0, this.field5260, 0, this.field5260.length);
      }

      this.field5263 = var2.field5037 * -1321466701;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ap")
   int method8913(int var1) {
      return var1 == 0 ? 956156587 * this.field5257 : -1158941029 * this.field5258;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ai")
   int method8915(int var1) {
      return 0 == var1 ? this.field5259 * -292131739 : 10867937 * this.field5262;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   boolean method8908(int var1) {
      return 0 == var1 && -292131739 * this.field5262 != -1 || var1 == 1 && 10867937 * this.field5257 != -1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("af")
   public boolean method8899(int var1) {
      try {
         boolean var10000;
         if (this.field5261 != null) {
            if (var1 >= -631212490) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pi.af(" + ')');
      }
   }
}
