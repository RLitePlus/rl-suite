import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ov")
public class classOV {
   @ObfuscatedSignature(descriptor = "Lov;")
   @ObfuscatedName("ac")
   static final classOV field5156 = new classOV(7);
   @ObfuscatedSignature(descriptor = "Lov;")
   @ObfuscatedName("af")
   static final classOV field5162 = new classOV(1);
   @ObfuscatedSignature(descriptor = "Lov;")
   @ObfuscatedName("ae")
   static final classOV field5161 = new classOV(2);
   @ObfuscatedSignature(descriptor = "Lov;")
   @ObfuscatedName("ab")
   public static final classOV field5164 = new classOV(3);
   @ObfuscatedSignature(descriptor = "Laam;")
   @ObfuscatedName("lf")
   static classAAM field5169;
   @ObfuscatedSignature(descriptor = "Lov;")
   @ObfuscatedName("as")
   public static final classOV field5160 = new classOV(5);
   @ObfuscatedSignature(descriptor = "Lov;")
   @ObfuscatedName("ag")
   static final classOV field5159 = new classOV(4);
   @ObfuscatedSignature(descriptor = "Lov;")
   @ObfuscatedName("aj")
   public static final classOV field5166 = new classOV(11);
   @ObfuscatedSignature(descriptor = "Lov;")
   @ObfuscatedName("aa")
   static final classOV field5163 = new classOV(8);
   @ObfuscatedSignature(descriptor = "Lov;")
   @ObfuscatedName("az")
   static final classOV field5155 = new classOV(0);
   @ObfuscatedSignature(descriptor = "Lov;")
   @ObfuscatedName("al")
   static final classOV field5165 = new classOV(10);
   @ObfuscatedSignature(descriptor = "Lov;")
   @ObfuscatedName("ao")
   static final classOV field5157 = new classOV(9);
   @ObfuscatedSignature(descriptor = "Lov;")
   @ObfuscatedName("ay")
   static final classOV field5167 = new classOV(12);
   @ObfuscatedSignature(descriptor = "Lov;")
   @ObfuscatedName("aq")
   static final classOV field5168 = new classOV(13);
   @ObfuscatedName("ap")
   public final int field5154;
   @ObfuscatedSignature(descriptor = "Lov;")
   @ObfuscatedName("ax")
   static final classOV field5158 = new classOV(6);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzd;II)V")
   @ObfuscatedName("kw")
   public static void method8801(classZD var0, int var1, int var2) {
      if (var0 == null) {
         var0.method13948();
      }

      if (!var0.method13845(348927165) && var0.field7170 != null) {
         classWB var3 = classZD.method13970(var0, var1, var2, 507558147);
         boolean var4 = (Integer)var3.field6654 == 0 && (Integer)var3.field6655 == var0.field7158.size();
         int var5 = (Integer)var3.field6654;
         int var6 = 0;
         int var7 = var4 ? 0 : ((classAAY)var0.field7158.get((Integer)var3.field6654)).field115 * -1444878478;
         int var8 = 0;

         for (int var9 = (Integer)var3.field6654; var9 <= (Integer)var3.field6655; var9++) {
            boolean var10 = var9 >= var0.field7158.size();
            classAAY var11 = (classAAY)var0.field7158.get(!var10 ? var9 : var0.field7158.size() - 1);
            int var12 = !var10 ? var0.method13967(var11, false, (byte)7) : 0;
            boolean var13 = !var10 && var11.field117 == '\n';
            boolean var14 = !var10 && var0.method13847(138571214) && var6 + var12 > 1062600889 * var0.field7160;
            if (var13 || var14 || var10) {
               int var15 = var9;
               int var16 = 0;
               if (var14) {
                  int var17 = 0;
                  if (1911222201 * var0.field7159 == 1) {
                     for (int var18 = var9; var18 > var5; var18--) {
                        classAAY var19 = (classAAY)var0.field7158.get(var18);
                        var17 += var18 < var15 ? var0.method13967(var19, false, (byte)8) : 0;
                        if (var19.field117 == ' ' || var19.field117 == '\n') {
                           var15 = var18;
                           var6 -= var17;
                           var16 = var17;
                           break;
                        }
                     }
                  }
               }

               int var25 = -var0.method13950(var6, (byte)-113);

               for (int var26 = var5; var26 < var15; var26++) {
                  classAAY var27 = (classAAY)var0.field7158.get(var26);
                  int var20 = var0.method13967(var27, false, (byte)92);
                  var27.field116 = var25 * -1084672117;
                  var27.field115 = 822615700 * var7;
                  var25 += var20;
               }

               var5 = var15;
               var6 = var16;
               var7 += var0.method13911((byte)32);
               var8++;
            }

            var6 += !var10 ? var12 : 0;
         }

         if (0 != var0.field7156 * -2110789749 && var4) {
            int var21 = var8 * var0.method13911((byte)-16);
            int var22 = var0.method13952(var21, 58465824);

            for (int var23 = 0; var23 < var0.field7158.size(); var23++) {
               classAAY var24 = (classAAY)var0.field7158.get(var23);
               var24.field115 -= -170636343 * var22;
            }
         }
      }
   }

   classOV(int var1) {
      this.field5154 = var1 * 1132328749;
   }
}
