import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("iu")
public class classIU extends classHB {
   @ObfuscatedName("pm")
   static int field3065;
   @ObfuscatedName("az")
   String field3066;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   static final int field3063 = 1076101384;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field3062 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("bc")
   static final int field3064 = 30;

   @ObfuscatedSignature(descriptor = "(D)I")
   @ObfuscatedName("ag")
   public static int method6316(double var0) {
      try {
         return (int)(2607.5945876176133 * var0) & 16383;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "iu.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod498(classXY var1, int var2) {
      try {
         this.field3066 = var1.method13071(-329009483);
         var1.method13056((byte)1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "iu.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;B)V")
   @ObfuscatedName("af")
   @Override
   void vmethod499(classIQ var1, byte var2) {
      try {
         var1.field3016 = this.field3066;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "iu.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod500(classXY var1) {
      this.field3066 = var1.method13071(593986710);
      var1.method13056((byte)1);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod501(classXY var1) {
      this.field3066 = var1.method13071(113709177);
      var1.method13056((byte)1);
   }

   classIU(classIF var1) {
      this.this$0 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod504(classIQ var1) {
      var1.field3016 = this.field3066;
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod502(classIQ var1) {
      var1.field3016 = this.field3066;
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod503(classIQ var1) {
      var1.field3016 = this.field3066;
   }
}
