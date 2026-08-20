import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("il")
public class classIL extends classHB {
   @ToRemove(unused = "true")
   @ObfuscatedName("cf")
   static final int field2989 = 74;
   @ObfuscatedName("af")
   long field2990;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field2986 = 50;
   @ToRemove(unused = "true")
   @ObfuscatedName("cb")
   static final int field2988 = 149;
   @ObfuscatedName("az")
   int field2987;
   @ObfuscatedSignature(descriptor = "Lmj;")
   @ObfuscatedName("hp")
   static classMJ field2991;

   @ObfuscatedSignature(descriptor = "(Liq;B)V")
   @ObfuscatedName("af")
   @Override
   void vmethod499(ClanSettings var1, byte var2) {
      try {
         var1.method6287(this.field2987 * -369383987, -2440418005129830071L * this.field2990);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "il.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod498(classXY var1, int var2) {
      try {
         this.field2987 = var1.method13056((byte)1) * -904278267;
         this.field2990 = var1.method13059(1820342398) * 3653361061942911225L;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "il.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod503(ClanSettings var1) {
      var1.method6287(this.field2987 * -369383987, -2440418005129830071L * this.field2990);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod500(classXY var1) {
      this.field2987 = var1.method13056((byte)1) * -904278267;
      this.field2990 = var1.method13059(-642246786) * 3653361061942911225L;
   }

   classIL(classIF var1) {
      this.this$0 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvv;Llw;)Z")
   @ObfuscatedName("bf")
   public static boolean method6222(classVV var0, Widget var1) {
      if (var0 == null) {
         var0.method12160();
      }

      return var1.field4289;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;I)Z")
   @ObfuscatedName("uj")
   public static boolean method6223(classLH var0, int var1) {
      if (var0 == null) {
         var0.method6880();
      }

      var0.field4142 = 1211480737 * var1;
      if (var0.method7073((byte)-128)) {
         var0.method7095((byte)58);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod502(ClanSettings var1) {
      var1.method6287(this.field2987 * -369383987, -2440418005129830071L * this.field2990);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod501(classXY var1) {
      this.field2987 = var1.method13056((byte)1) * -904278267;
      this.field2990 = var1.method13059(1420762225) * 3653361061942911225L;
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod504(ClanSettings var1) {
      var1.method6287(this.field2987 * -369383987, -2440418005129830071L * this.field2990);
   }
}
