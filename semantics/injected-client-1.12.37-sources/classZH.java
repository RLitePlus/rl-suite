import java.awt.event.FocusEvent;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("zh")
public class classZH {
   @ToRemove(unused = "true")
   @ObfuscatedName("bi")
   static final int field7186 = 75;
   @ObfuscatedName("az")
   final int[] field7184;
   @ObfuscatedName("af")
   int field7185;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ic")
   public int method14011() {
      return method14003(this, (byte)10);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   public void method14006() {
      this.field7185 = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("vb")
   public static void method14010(GameEngine var0, FocusEvent var1) {
      if (var0 == null) {
         var0.method10987();
      }

      GameEngine.field6190 = true;
      var0.field6207 = true;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("az")
   public void method13999(int var1, byte var2) {
      try {
         this.field7184[(this.field7185 += 1397954045) * -1078628523 - 1] = var1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "zh.az(" + ')');
      }
   }

   public classZH(int var1) {
      this.field7184 = new int[var1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzh;I)V")
   @ObfuscatedName("vo")
   public static void method14000(classZH var0, int var1) {
      var0.field7184[(var0.field7185 += 1397954045) * -1520696924 - 1] = var1;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("af")
   public int method14001(int var1, int var2) {
      try {
         return this.field7184[var1];
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "zh.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   public void method14007(int var1) {
      try {
         this.field7185 = 0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zh.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   public int method14002() {
      return -1078628523 * this.field7185;
   }

   @ObfuscatedSignature(descriptor = "(Lzh;B)I")
   @ObfuscatedName("ch")
   public static int method14003(classZH var0, byte var1) {
      if (var0 == null) {
         var0.method14005(var1);
      }

      try {
         return -1078628523 * var0.field7185;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zh.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("wb")
   public int method14012(int var1) {
      return this.method14001(var1, 2011977896);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public void method14008() {
      this.field7185 = 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ax")
   public int method14004() {
      return -1078628523 * this.field7185;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxk;)Z")
   @ObfuscatedName("wn")
   public static boolean method14009(classXK var0) {
      return var0.field6884;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ae")
   public int method14005(byte var1) {
      try {
         return -1078628523 * this.field7185;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "zh.ae(" + 41);
      }
   }
}
