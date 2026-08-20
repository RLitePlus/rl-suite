import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("oy")
public class Skills {
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field4752 = 3;
   @ObfuscatedName("at")
   public static final boolean[] Skills_enabled = new boolean[]{
      true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false
   };
   @ToRemove(unused = "true")
   @ObfuscatedName("cv")
   static final int field4753 = 90;
   @ToRemove(unused = "true")
   @ObfuscatedName("dw")
   public static final int field4754 = 101;
   @ObfuscatedSignature(descriptor = "Lvs;")
   @ObfuscatedName("vx")
   static WorldMap worldMap;
   @ObfuscatedName("rw")
   static int selectedSpellWidget;
   @ObfuscatedSignature(descriptor = "Ldm;")
   @ObfuscatedName("ux")
   static PcmPlayer pcmPlayer1;
   @ObfuscatedName("ag")
   public static int[] Skills_experienceTable = new int[99];
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field4751 = 7;

   Skills() throws Throwable {
      throw new Error();
   }

   static {
      int var0 = 0;

      for (int var1 = 0; var1 < 99; var1++) {
         int var2 = 1 + var1;
         int var3 = (int)(var2 + 300.0 * Math.pow(2.0, var2 / 7.0));
         var0 += var3;
         Skills_experienceTable[var1] = var0 / 4;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ak")
   static void method8683(byte var0) {
      try {
         ItemContainer.itemContainers = new NodeHashTable(32);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "oy.ak(" + ')');
      }
   }
}
