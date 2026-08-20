import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gg")
public abstract class classGG {
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field2574 = 8;
   @ObfuscatedName("af")
   public int field2573;
   @ObfuscatedName("ab")
   public int field2571;
   @ObfuscatedName("az")
   public int field2575;
   @ObfuscatedName("ax")
   public static int[] field2578;
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("ih")
   static classVP field2576;
   @ObfuscatedName("ae")
   public int field2572;
   @ObfuscatedSignature(descriptor = "Lym;")
   @ObfuscatedName("mf")
   static SpritePixels field2577;

   @ObfuscatedSignature(descriptor = "(IIILgc;)Z")
   @ObfuscatedName("ae")
   protected abstract boolean vmethod146(int var1, int var2, int var3, CollisionMap var4);

   @ObfuscatedSignature(descriptor = "(IIILgc;B)Z")
   @ObfuscatedName("az")
   protected abstract boolean vmethod144(int var1, int var2, int var3, CollisionMap var4, byte var5);

   @ObfuscatedSignature(descriptor = "(IIILgc;)Z")
   @ObfuscatedName("af")
   protected abstract boolean vmethod145(int var1, int var2, int var3, CollisionMap var4);

   protected classGG() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvl;I)I")
   @ObfuscatedName("sj")
   public static int method5429(classVL var0, int var1) {
      return var0.field6519[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   public static void method5428(int var0) {
      try {
         EvictingDualNodeHashTable.method6431(classPA.field5203);
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "gg.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ad")
   static void method5430(int var0) {
      try {
         int var1 = classAB.field122.method2833(1873816533);
         int var2 = client.field977 * -1239932395 + var1;
         long var5 = System.currentTimeMillis();
         int var4 = (int)(var5 / 86400000L) - 11745;
         if (var2 <= var4) {
            if (var0 <= -324749371) {
               return;
            }

            classAB.field122.method2835(var4, (byte)66);
            classAC.method326(38, 2132665134);
         } else {
            classBJ.method1117(true, -347989319);
         }
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "gg.ad(" + ')');
      }
   }
}
