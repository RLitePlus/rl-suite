import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ka")
public class classKA {
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   public static final int field3510 = 10;
   @ObfuscatedName("af")
   public static int[] field3509 = new int[]{18, 19, 20, 32};
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3512 = 22;
   @ObfuscatedName("az")
   public static int[] field3508 = new int[]{12, 14, 17, 24};
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field3511 = -1;
   @ObfuscatedSignature(descriptor = "Lyz;")
   @ObfuscatedName("cd")
   static classYZ field3514;
   @ObfuscatedSignature(descriptor = "Lie;")
   @ObfuscatedName("fj")
   static classIE field3513;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrt;Laae;)Lrr;")
   @ObfuscatedName("aq")
   public static classRR method6446(classRT var0, classAAE var1) {
      if (var0 == null) {
         var0.getMembers();
      }

      return !var1.method171(1073339404) ? null : (classRR)var0.field5844.get(var1);
   }

   classKA() throws Throwable {
      throw new Error();
   }
}
