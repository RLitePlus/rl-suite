import java.awt.Font;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ab")
public final class classAB {
   @ObfuscatedName("rq")
   static Font field123;
   @ObfuscatedSignature(descriptor = "Lcy;")
   @ObfuscatedName("kn")
   static classCY field122;
   @ObfuscatedName("au")
   static int[] field126;
   @ToRemove(unused = "true")
   @ObfuscatedName("ba")
   static final String field124 = "JX_DISPLAY_NAME";
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field121 = 72;
   @ObfuscatedName("fc")
   static List field125;

   classAB() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Las;)Lae;")
   @ObfuscatedName("af")
   public static classAE method305(classAS var0) {
      switch (var0.field263 * 1928617345) {
         case 0:
            return new classAZ();
         default:
            throw new IllegalArgumentException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Las;)Lae;")
   @ObfuscatedName("ae")
   public static classAE method306(classAS var0) {
      switch (var0.field263 * 1928617345) {
         case 0:
            return new classAZ();
         default:
            throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lyy;I)Ljava/lang/Object;")
   @ObfuscatedName("ca")
   static Object method308(classYY var0, int var1) {
      try {
         if (var0 == null) {
            if (var1 == -1130275237) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("popValueOfType() failure - null baseVarType");
            }
         } else {
            switch (-900901303 * var0.field7107) {
               case 2:
                  return classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
               case 3:
                  return classBB.field322[(classXT.field6939 -= -1297854163) * 18294437];
               case 4:
                  return classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               default:
                  throw new IllegalStateException("popValueOfType() failure - unsupported type");
            }
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ab.ca(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
   @ObfuscatedName("al")
   static void method307(String var0, String var1, String var2, int var3) {
      try {
         classAC.method326(7, 2121783381);
         classSP.method10624(var0, var1, var2, (byte)-121);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ab.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("hi")
   static int method309(byte var0) {
      try {
         return client.field962 * 2106329293;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "ab.hi(" + 41);
      }
   }
}
