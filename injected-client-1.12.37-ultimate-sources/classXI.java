import java.util.Arrays;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xi")
class classXI implements Iterator {
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field6872 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   static final int field6871 = 28;
   @ObfuscatedName("az")
   int field6873;

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("aj")
   public Object method12783() {
      int var1 = (this.field6873 += -1778383927) * -345274759 - 1;
      classUF var2 = (classUF)this.this$0.field6924.method6147(var1);
      return var2 != null ? var2 : this.this$0.method12877(var1, 147996753);
   }

   classXI(classXR var1) {
      this.this$0 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqc;Z)V")
   @ObfuscatedName("sk")
   public static void method12789(classQC var0, boolean var1) {
      if (var0 == null) {
         var0.method9449();
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method12779() {
      return -345274759 * this.field6873 < this.this$0.method11706((byte)-57);
   }

   @Override
   public void remove() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "xi.remove(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxi;)Ljava/lang/Object;")
   @ObfuscatedName("ol")
   public static Object method12784(classXI var0) {
      if (var0 == null) {
         var0.method12780();
      }

      int var1 = (var0.field6873 += -1778383927) * -345274759 - 1;
      classUF var2 = (classUF)var0.this$0.field6924.method6147(var1);
      return var2 != null ? var2 : var0.this$0.method12877(var1, -853134992);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("al")
   public Object method12785() {
      int var1 = (this.field6873 += -1778383927) * -434097062 - 1;
      classUF var2 = (classUF)this.this$0.field6924.method6147(var1);
      return var2 != null ? var2 : this.this$0.method12877(var1, -1467959802);
   }

   @Override
   public boolean hasNext() {
      try {
         return -345274759 * this.field6873 < this.this$0.method11706((byte)-62);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "xi.hasNext(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   public boolean method12780() {
      return -345274759 * this.field6873 < this.this$0.method11706((byte)-44);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ay")
   public Object method12786() {
      int var1 = (this.field6873 += -1778383927) * -345274759 - 1;
      classUF var2 = (classUF)this.this$0.field6924.method6147(var1);
      return var2 != null ? var2 : this.this$0.method12877(var1, -528950311);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   public boolean method12781() {
      return -345274759 * this.field6873 < this.this$0.method11706((byte)-46);
   }

   @Override
   public Object next() {
      try {
         int var1 = (this.field6873 += -1778383927) * -345274759 - 1;
         classUF var2 = (classUF)this.this$0.field6924.method6147(var1);
         return var2 != null ? var2 : this.this$0.method12877(var1, -1359164034);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xi.next(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   public void method12787() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   public void method12788() {
      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;)I")
   @ObfuscatedName("tf")
   public static int method12790(classUU var0) {
      byte var1 = 31;
      byte var2 = 1;
      return 31 * var2 + Arrays.hashCode(var0.field6403);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   public boolean method12782() {
      return -345274759 * this.field6873 < this.this$0.method11706((byte)-114);
   }
}
