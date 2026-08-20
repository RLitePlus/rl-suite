import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("oy")
public class classOY extends classVJ {
   @ObfuscatedName("ag")
   public final int field5193;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field5196 = 5;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ae")
   public static classVA field5201;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ab")
   public static classJZ field5194 = new classJZ(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   static final int field5200 = 106;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field5197 = 19;
   @ObfuscatedSignature(descriptor = "[Lyz;")
   @ObfuscatedName("aq")
   static classYZ[] field5202;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5199 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final char field5195 = 'À';
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   public static final int field5198 = 65536;

   classOY(classXY var1) {
      int var2 = 0;
      if (null != var1 && var1.field6954 != null) {
         label26:
         while (true) {
            int var3 = classXY.method13039(var1, -346779531);
            switch (var3) {
               case 0:
                  break label26;
               case 5:
                  var2 = classXY.method13047(var1, 1304636744);
            }
         }
      }

      this.field5193 = var2 * -1695411655;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;II)V")
   @ObfuscatedName("mm")
   public static void method8821(classLC var0, int var1, int var2) {
      boolean var3 = var0.field4094 * 1705409403 != var2;
      var0.field4094 = var2 * -2056377421;
      if (var3) {
         if (var0.field4094 * 1705409403 == var1) {
            for (int var4 = 0; var4 < 7; var4++) {
               int var5 = classON.method8611(var4, (byte)64);
               if (var0.field4095[var5] > 0 && var0.field4095[var5] < 2048) {
                  var0.field4095[var5] = var0.field4092[var5];
               }
            }
         } else {
            if (var0.field4095[0] < 2048 || var0.method6719(-298054372)) {
               var0.field4095[2111598757 * classOV.field5166.field5154] = 1;
            }

            for (int var6 = 0; var6 < 7; var6++) {
               int var7 = classON.method8611(var6, (byte)51);
               if (var0.field4095[var7] > 0 && var0.field4095[var7] < 2048) {
                  classGB.method5301(var2, var0.field4095, var6, (byte)8);
               }
            }
         }
      }

      var0.method6711((byte)-16);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Loy;")
   @ObfuscatedName("ae")
   public static classOY method8819(int var0) {
      classOY var1 = (classOY)field5194.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = field5201.method11867(16, var0, -1710366334);
         var1 = new classOY(new classXY(var2));
         field5194.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Loy;")
   @ObfuscatedName("af")
   public static classOY method8820(int var0) {
      classOY var1 = (classOY)field5194.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = field5201.method11867(16, var0, -1064434243);
         var1 = new classOY(new classXY(var2));
         field5194.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("cr")
   static int method8822(int var0, classBL var1, boolean var2, int var3) {
      try {
         if (var0 == 6754) {
            int var8 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
            classPL var9 = classOH.method8448(var8, 677467691);
            Object[] var10 = classBB.field328;
            int var11 = (classBB.field338 += 1222866659) * 1375698635 - 1;
            String var12;
            if (null != var9) {
               if (var3 == -1506417701) {
                  throw new IllegalStateException();
               }

               var12 = var9.method8994((byte)55);
            } else {
               var12 = "";
            }

            var10[var11] = var12;
            return 1;
         } else if (6764 == var0) {
            if (var3 == -1506417701) {
               throw new IllegalStateException();
            } else {
               classDY.field1679 -= 240082458;
               classPL var7 = classOH.method8448(classBB.field323[-324749371 * classDY.field1679], -385869);
               int var5 = classBB.field323[1 + classDY.field1679 * -324749371];
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var7.method8977(var5, (byte)-51);
               classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = var7.method8984(var5, (byte)-74);
               return 1;
            }
         } else if (var0 == 6765) {
            if (var3 == -1506417701) {
               throw new IllegalStateException();
            } else {
               classPL var4 = classOH.method8448(classBB.field323[(classDY.field1679 -= 120041229) * -324749371], 826357941);
               int[] var10000 = classBB.field323;
               int var10001 = (classDY.field1679 += 120041229) * -324749371 - 1;
               int var10002;
               if (var4 != null) {
                  if (var3 == -1506417701) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1781570005 * var4.field5320;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "oy.cr(" + 41);
      }
   }
}
