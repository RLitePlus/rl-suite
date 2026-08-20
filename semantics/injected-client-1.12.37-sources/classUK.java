import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uk")
public abstract class classUK {
   @ToRemove(unused = "true")
   @ObfuscatedName("cw")
   static final int field6320 = 90;

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ax")
   public abstract boolean vmethod583(int var1) throws IOException;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   public abstract int vmethod591() throws IOException;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   public abstract int vmethod586(int var1) throws IOException;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public abstract int vmethod593(int var1) throws IOException;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   public abstract void vmethod601();

   @ObfuscatedSignature(descriptor = "([BIII)V")
   @ObfuscatedName("ag")
   public abstract void vmethod597(byte[] var1, int var2, int var3, int var4) throws IOException;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("as")
   public abstract void vmethod604(int var1);

   @ObfuscatedSignature(descriptor = "([BIII)I")
   @ObfuscatedName("ab")
   public abstract int vmethod594(byte[] var1, int var2, int var3, int var4) throws IOException;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   public abstract int vmethod588() throws IOException;

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aa")
   public abstract boolean vmethod585(int var1) throws IOException;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   public abstract int vmethod587() throws IOException;

   @ObfuscatedSignature(descriptor = "([BII)I")
   @ObfuscatedName("au")
   public abstract int vmethod595(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   public abstract int vmethod592() throws IOException;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   public abstract int vmethod589() throws IOException;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   public abstract int vmethod590() throws IOException;

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("az")
   public abstract boolean vmethod582(int var1, int var2) throws IOException;

   @ObfuscatedSignature(descriptor = "([BII)I")
   @ObfuscatedName("ap")
   public abstract int vmethod596(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("av")
   public abstract void vmethod602();

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ai")
   public abstract void vmethod598(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ar")
   public abstract void vmethod599(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ac")
   public abstract boolean vmethod584(int var1) throws IOException;

   classUK() {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   public abstract void vmethod603();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   public abstract void vmethod605();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   public abstract void vmethod600();

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("hw")
   static void method11337(int var0, int var1) {
      try {
         client.field967 = var0 * 82733095;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "uk.hw(" + ')');
      }
   }
}
