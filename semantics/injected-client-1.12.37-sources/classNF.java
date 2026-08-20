import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nf")
class classNF implements ThreadFactory {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field4669 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field4668 = 2;

   @Override
   public Thread newThread(Runnable var1) {
      try {
         return new Thread(var1, "OSRS WAV Load");
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "nf.newThread(" + ')');
      }
   }

   classNF(classNU var1) {
      this.this$0 = var1;
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("cd")
   static int method7835(int var0, Script var1, boolean var2, int var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "nf.cd(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnf;Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("tt")
   public static Thread method7831(classNF var0, Runnable var1) {
      if (var0 == null) {
         var0.method7832(var1);
      }

      return new Thread(var1, "OSRS WAV Load");
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("af")
   public Thread method7832(Runnable var1) {
      return new Thread(var1, "OSRS WAV Load");
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("aj")
   static int method7834(int var0, byte var1) {
      try {
         int var2 = var0 >> 3;
         return 3 * var2 + 600;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "nf.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIIILup;Lym;Lkh;B)V")
   @ObfuscatedName("ac")
   static final void method7833(WorldView var0, int var1, int var2, int var3, int var4, classUP var5, SpritePixels var6, classKH var7, byte var8) {
      try {
         classUZ var9 = classYY.method13790(var0, var1, var2, (byte)108);
         var1 = (int)var9.field6427;
         var2 = (int)var9.field6426;
         classUZ.method11727(var9, 1929479128);
         int var10 = var1 / 32 - 2106329293 * client.field962 / 32;
         int var11 = var2 / 32 - -2126074583 * client.field986 / 32;
         int var12 = var10 * var10 + var11 * var11;
         if (var12 > 4225) {
            if (var8 <= 42) {
               return;
            }

            if (var12 < 90000) {
               int var13 = var5.method11443(530045440);
               int var14 = classUP.method11445(var5, (byte)-13);
               int var15 = var11 * var13 + var14 * var10 >> 16;
               int var16 = var11 * var14 - var13 * var10 >> 16;
               double var17 = Math.atan2(var15, var16);
               int var19 = var7.field3586 * -1246906611 / 2 - 25;
               int var20 = (int)(Math.sin(var17) * var19);
               int var21 = (int)(Math.cos(var17) * var19);
               byte var22 = 20;
               classKU.field4033
                  .method13548(
                     -1246906611 * var7.field3586 / 2 + var3 - var22 / 2 + var20,
                     var7.field3585 * -1637380195 / 2 + var4 - var22 / 2 - var21 - 10,
                     var22,
                     var22,
                     15,
                     15,
                     var17,
                     256
                  );
               return;
            }
         }

         classBO.method1165(var3, var4, var10, var11, var5, var6, var7, (byte)69);
      } catch (RuntimeException var23) {
         throw classEG.newRunException(var23, "nf.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("ab")
   public static int method7830(int var0, int var1, byte var2) {
      try {
         int var3 = var1 - var0 & 2047;
         if (var3 > 1024) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            } else {
               return -(2048 - var3);
            }
         } else {
            return var3;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "nf.ab(" + 41);
      }
   }
}
