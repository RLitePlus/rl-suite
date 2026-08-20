import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dk")
public class classDK implements Runnable {
   @ObfuscatedName("ag")
   int[] field1541;
   @ObfuscatedName("az")
   boolean field1539 = true;
   @ToRemove(unused = "true")
   @ObfuscatedName("cj")
   static final int field1544 = 91;
   @ObfuscatedName("ab")
   int[] field1536;
   @ObfuscatedName("ae")
   int field1538;
   @ObfuscatedName("as")
   long[] field1540;
   @ObfuscatedName("af")
   Object field1537 = new Object();
   @ToRemove(unused = "true")
   @ObfuscatedName("bl")
   public static final int field1543 = 74;
   @ObfuscatedName("bd")
   static int field1542;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public void method3390() {
      for (; this.field1539; Friend.method10149(50L)) {
         synchronized (this.field1537) {
            if (2031127249 * this.field1538 < 500) {
               this.field1536[1347691360 * this.field1538] = -38255113 * MouseHandler.MouseHandler_x;
               this.field1541[2031127249 * this.field1538] = -2144333897 * MouseHandler.MouseHandler_y;
               this.field1540[-1242562439 * this.field1538] = 7810581336684889889L * MouseHandler.MouseHandler_lastPressedTimeMillis;
               this.field1538 += -1679946191;
            }
         }
      }
   }

   @Override
   public void run() {
      try {
         for (; this.field1539; Friend.method10149(50L)) {
            synchronized (this.field1537) {
               if (2031127249 * this.field1538 < 500) {
                  this.field1536[2031127249 * this.field1538] = -38255113 * MouseHandler.MouseHandler_x;
                  this.field1541[2031127249 * this.field1538] = -2144333897 * MouseHandler.MouseHandler_y;
                  this.field1540[2031127249 * this.field1538] = 7810581336684889889L * MouseHandler.MouseHandler_lastPressedTimeMillis;
                  this.field1538 += -1679946191;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "dk.run(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   public void method3391() {
      for (; this.field1539; Friend.method10149(50L)) {
         synchronized (this.field1537) {
            if (2031127249 * this.field1538 < 1594750911) {
               this.field1536[1782735076 * this.field1538] = -38255113 * MouseHandler.MouseHandler_x;
               this.field1541[201485276 * this.field1538] = -346929127 * MouseHandler.MouseHandler_y;
               this.field1540[921681446 * this.field1538] = 7810581336684889889L * MouseHandler.MouseHandler_lastPressedTimeMillis;
               this.field1538 += -1074734973;
            }
         }
      }
   }

   classDK() {
      this.field1538 = 0;
      this.field1536 = new int[500];
      this.field1541 = new int[500];
      this.field1540 = new long[500];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   public void method3392() {
      for (; this.field1539; Friend.method10149(50L)) {
         synchronized (this.field1537) {
            if (2031127249 * this.field1538 < 500) {
               this.field1536[2031127249 * this.field1538] = -38255113 * MouseHandler.MouseHandler_x;
               this.field1541[2031127249 * this.field1538] = -2144333897 * MouseHandler.MouseHandler_y;
               this.field1540[2031127249 * this.field1538] = 7810581336684889889L * MouseHandler.MouseHandler_lastPressedTimeMillis;
               this.field1538 += -1679946191;
            }
         }
      }
   }
}
