import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wz")
class classWZ implements Iterator {
   @ObfuscatedSignature(descriptor = "[Lxt;")
   @ObfuscatedName("ay")
   static SpritePixels[] field6473;
   @ObfuscatedName("av")
   int field6471;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field6470 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   public static final int field6472 = 1;

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("az")
   public boolean method11906() {
      return this.field6471 * -1670710245 < classUM.method11185(this.this$0, (byte)-15);
   }

   @Override
   public boolean hasNext() {
      try {
         return this.field6471 * -1670710245 < classUM.method11185(this.this$0, (byte)-30);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "wz.hasNext(" + ')');
      }
   }

   classWZ(classWQ var1) {
      this.this$0 = var1;
   }

   @Override
   public void remove() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "wz.remove(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwz;)Ljava/lang/Object;")
   @ObfuscatedName("zf")
   public static Object method11909(classWZ var0) {
      if (var0 == null) {
         var0.method11912();
      }

      int var1 = (var0.field6471 += -7438829) * -1670710245 - 1;
      class535 var2 = (class535)var0.this$0.field6439.get(var1);
      return null != var2 ? var2 : var0.this$0.method11832(var1, (byte)-24);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcr;I)V")
   @ObfuscatedName("jt")
   public static void method11915(Actor var0, int var1) {
      AnimationSequence.method10313(var0.poseAnimationSequence, var1, -973260275);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lic;Ljava/lang/String;I)Ljp;")
   @ObfuscatedName("bg")
   public static Task method11916(TaskHandler var0, String var1, int var2) {
      if (var0 == null) {
         var0.method4865();
      }

      return var0.newTask(1, var2, 0, var1, -1990974840);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("au")
   public Object method11910() {
      int var1 = (this.field6471 += -7438829) * -1670710245 - 1;
      class535 var2 = (class535)this.this$0.field6439.get(var1);
      return null != var2 ? var2 : this.this$0.method11832(var1, (byte)-50);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ay")
   public Object method11911() {
      int var1 = (this.field6471 += 443886580) * -1670710245 - 1;
      class535 var2 = (class535)this.this$0.field6439.get(var1);
      return null != var2 ? var2 : this.this$0.method11832(var1, (byte)-99);
   }

   @Override
   public Object next() {
      try {
         int var1 = (this.field6471 += -7438829) * -1670710245 - 1;
         class535 var2 = (class535)this.this$0.field6439.get(var1);
         return null != var2 ? var2 : this.this$0.method11832(var1, (byte)-50);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "wz.next(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   public boolean method11907() {
      return this.field6471 * -1670710245 < classUM.method11185(this.this$0, (byte)10);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method11908() {
      return this.field6471 * -429985298 < classUM.method11185(this.this$0, (byte)53);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public void method11912() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public void method11913() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   public void method11914() {
      throw new UnsupportedOperationException();
   }
}
