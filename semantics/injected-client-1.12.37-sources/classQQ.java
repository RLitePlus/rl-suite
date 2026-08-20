import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qq")
public class classQQ implements classXZ {
   @ObfuscatedSignature(descriptor = "Lqq;")
   @ObfuscatedName("ab")
   static final classQQ field5590 = new classQQ(3, "PATCH", false, true);
   @ObfuscatedSignature(descriptor = "Lqq;")
   @ObfuscatedName("af")
   public static final classQQ field5588 = new classQQ(1, "GET", true, false);
   @ObfuscatedSignature(descriptor = "Lqq;")
   @ObfuscatedName("ae")
   static final classQQ field5589 = new classQQ(2, "PUT", false, true);
   @ObfuscatedName("ac")
   boolean field5595;
   @ObfuscatedSignature(descriptor = "Lqq;")
   @ObfuscatedName("ag")
   static final classQQ field5591 = new classQQ(4, "DELETE", false, true);
   @ObfuscatedName("as")
   int field5592;
   @ObfuscatedName("ax")
   String field5593;
   @ObfuscatedName("aa")
   boolean field5594;
   @ObfuscatedSignature(descriptor = "Lqq;")
   @ObfuscatedName("az")
   public static final classQQ field5587 = new classQQ(0, "POST", true, true);
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field5596 = 4;
   @ObfuscatedSignature(descriptor = "Lbw;")
   @ObfuscatedName("fx")
   public static classBW field5597;

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return this.field5592 * 2142977363;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qq.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("as")
   public String method9706(int var1) {
      try {
         return this.field5593;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qq.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ag")
   boolean method9711(int var1) {
      try {
         return this.field5595;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qq.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   boolean method9712() {
      return this.field5595;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ac")
   boolean method9704() {
      return this.field5594;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return this.field5592 * 2142977363;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return this.field5592 * -409231248;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ay")
   public String method9707() {
      return this.field5593;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("al")
   public String method9708() {
      return this.field5593;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("aj")
   public String method9709() {
      return this.field5593;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ax")
   boolean method9705(int var1) {
      try {
         return this.field5594;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qq.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return this.field5592 * 837162110;
   }

   classQQ(int var1, String var2, boolean var3, boolean var4) {
      this.field5592 = var1 * -441970981;
      this.field5593 = var2;
      this.field5594 = var3;
      this.field5595 = var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqq;)Ljava/lang/String;")
   @ObfuscatedName("mo")
   public static String method9710(classQQ var0) {
      return var0.field5593;
   }

   @ObfuscatedSignature(descriptor = "(FFFFI)Lul;")
   @ObfuscatedName("af")
   static classUL method9713(float var0, float var1, float var2, float var3, int var4) {
      try {
         synchronized (classUL.field6323) {
            if (classUL.field6321 * 1171203923 == 0) {
               if (var4 >= 120041229) {
                  throw new IllegalStateException();
               } else {
                  return new classUL(var0, var1, var2, var3);
               }
            } else {
               classUL.field6323[(classUL.field6321 -= -1712212773) * 1171203923].method11361(var0, var1, var2, var3, (byte)-20);
               return classUL.field6323[1171203923 * classUL.field6321];
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "qq.af(" + ')');
      }
   }
}
