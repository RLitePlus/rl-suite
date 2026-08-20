import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ij")
public class class217 {
   @ToRemove(unused = "true")
   @ObfuscatedName("ba")
   static final int field2494 = 89;
   @ObfuscatedName("at")
   public int field2490;
   @ObfuscatedName("av")
   public int field2493 = 0;
   @ObfuscatedName("an")
   public int field2491;
   @ObfuscatedName("ae")
   public int field2492;
   @ToRemove(unused = "true")
   @ObfuscatedName("bz")
   public static final int field2495 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("ck")
   static final int field2496 = 0;
   @ObfuscatedName("ag")
   public int field2489;
   @ObfuscatedName("bi")
   static boolean clearLoginScreen;
   @ObfuscatedSignature(descriptor = "[Lxt;")
   @ObfuscatedName("ap")
   static SpritePixels[] mapDotSprites;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldm;)V")
   @ObfuscatedName("wo")
   public static void method4908(PcmPlayer var0) {
      if (var0 == null) {
         var0.vmethod23();
      } else {
         var0.field1431 = true;
      }
   }

   class217(int var1, int var2, int var3, int var4, int var5) {
      this.field2490 = 1068788125;
      this.field2489 = 0;
      this.field2491 = 0;
      this.field2492 = 0;
      this.field2493 = 234865515 * var1;
      this.field2490 = 1068788125 * var2;
      this.field2489 = 1718019165 * var3;
      this.field2491 = var4 * 172659183;
      this.field2492 = var5 * 1449807659;
   }

   @ObfuscatedSignature(descriptor = "(I)Lbn;")
   @ObfuscatedName("ap")
   static World getNextWorldListWorld(int var0) {
      try {
         if (World.World_listCount * 330506487 < World.World_count * -858019443) {
            if (var0 >= -1534032782) {
               throw new IllegalStateException();
            } else {
               return World.World_worlds[(World.World_listCount += -615407417) * 330506487 - 1];
            }
         } else {
            return null;
         }
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ij.ap(" + ')');
      }
   }
}
