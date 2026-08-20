import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yo")
final class classYO implements classYH {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field7022 = 0;
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("ir")
   static classVP field7023;

   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Object;")
   @ObfuscatedName("ax")
   @Override
   public Object vmethod654(classXY var1) {
      return classPD.method8843(var1, false, -193629541);
   }

   @ObfuscatedSignature(descriptor = "(Lyo;Lte;Lxy;I)V")
   @ObfuscatedName("ud")
   public static void method13603(classYO var0, classTE var1, classXY var2, int var3) {
      if (var0 == null) {
         var0.method13606(var1, var2, var3);
      }

      try {
         var1.method10795(var2, (byte)-34);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "yo.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxy;I)V")
   @ObfuscatedName("ae")
   @Override
   public void vmethod656(Object var1, classXY var2, int var3) {
      try {
         method13603(this, (classTE)var1, var2, -1771415505);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "yo.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyo;Lte;Lxy;)V")
   @ObfuscatedName("bg")
   public static void method13604(classYO var0, classTE var1, classXY var2) {
      if (var0 == null) {
         var0.vmethod655(var2);
      }

      var1.method10795(var2, (byte)-11);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;B)Ljava/lang/Object;")
   @ObfuscatedName("af")
   @Override
   public Object vmethod653(classXY var1, byte var2) {
      try {
         return classPD.method8843(var1, false, -193629541);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "yo.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Object;")
   @ObfuscatedName("ac")
   @Override
   public Object vmethod655(classXY var1) {
      return classPD.method8843(var1, false, -193629541);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxy;)V")
   @ObfuscatedName("aa")
   @Override
   public void vmethod657(Object var1, classXY var2) {
      method13603(this, (classTE)var1, var2, -588465721);
   }

   @ObfuscatedSignature(descriptor = "(Lte;Lxy;)V")
   @ObfuscatedName("ag")
   void method13605(classTE var1, classXY var2) {
      var1.method10795(var2, (byte)-63);
   }

   @ObfuscatedSignature(descriptor = "(Lte;Lxy;I)V")
   @ObfuscatedName("az")
   void method13606(classTE var1, classXY var2, int var3) {
      try {
         var1.method10795(var2, (byte)-34);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "yo.az(" + ')');
      }
   }
}
