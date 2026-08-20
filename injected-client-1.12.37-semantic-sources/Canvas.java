import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("td")
public final class Canvas extends java.awt.Canvas {
   @ObfuscatedName("az")
   Component field6119;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   static final int field6121 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   public static final int field6120 = 42;

   Canvas(Component var1) {
      this.field6119 = var1;
   }

   @Override
   public final void update(Graphics var1) {
      try {
         this.field6119.update(var1);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "td.update(" + ')');
      }
   }

   @Override
   public final void paint(Graphics var1) {
      try {
         this.field6119.paint(var1);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "td.paint(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("afq")
   public final void method10745(Graphics var1) {
      this.field6119.update(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("afx")
   public final void method10746(Graphics var1) {
      this.field6119.update(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("afj")
   public final void method10747(Graphics var1) {
      this.field6119.update(var1);
   }
}
