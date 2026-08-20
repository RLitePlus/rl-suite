import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nx")
public class classNX implements Iterator {
   @ObfuscatedSignature(descriptor = "Lvj;")
   @ObfuscatedName("af")
   classVJ field4788;
   @ObfuscatedSignature(descriptor = "Lnz;")
   @ObfuscatedName("az")
   classNZ field4787;
   @ObfuscatedSignature(descriptor = "Lvj;")
   @ObfuscatedName("ae")
   classVJ field4789 = null;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnx;)V")
   @ObfuscatedName("wh")
   public static void method8255(classNX var0) {
      if (var0.field4789 == null) {
         throw new IllegalStateException();
      } else {
         var0.field4789.method11958();
         var0.field4789 = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;Ltn;Ltw;)V")
   @ObfuscatedName("do")
   public static void method8257(classCL var0, classTN var1, classTW var2) {
      if (var0 == null) {
         var0.method1593();
      }

      var0.field786 = var1;
      var0.field787 = var2;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ao")
   public Object method8248() {
      classVJ var1 = this.field4788;
      if (var1 == this.field4787.field4800) {
         var1 = null;
         this.field4788 = null;
      } else {
         this.field4788 = var1.field6515;
      }

      this.field4789 = var1;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   public boolean method8252() {
      return this.field4788 != this.field4787.field4800;
   }

   @Override
   public void remove() {
      if (this.field4789 == null) {
         throw new IllegalStateException();
      } else {
         this.field4789.method11958();
         this.field4789 = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqc;)Ljava/io/InputStream;")
   @ObfuscatedName("pp")
   public static InputStream method8258(classQC var0) throws IOException {
      return var0.val$tlsClientProtocol.getInputStream();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   public boolean method8253() {
      return this.field4788 != this.field4787.field4800;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("al")
   public Object method8249() {
      classVJ var1 = this.field4788;
      if (var1 == this.field4787.field4800) {
         var1 = null;
         this.field4788 = null;
      } else {
         this.field4788 = var1.field6515;
      }

      this.field4789 = var1;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("aj")
   public Object method8250() {
      classVJ var1 = this.field4788;
      if (var1 == this.field4787.field4800) {
         var1 = null;
         this.field4788 = null;
      } else {
         this.field4788 = var1.field6515;
      }

      this.field4789 = var1;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   public boolean method8254() {
      return this.field4788 != this.field4787.field4800;
   }

   @Override
   public Object next() {
      classVJ var1 = this.field4788;
      if (var1 == this.field4787.field4800) {
         var1 = null;
         this.field4788 = null;
      } else {
         this.field4788 = var1.field6515;
      }

      this.field4789 = var1;
      return var1;
   }

   @Override
   public boolean hasNext() {
      return this.field4788 != this.field4787.field4800;
   }

   classNX(classNZ var1) {
      this.field4787 = var1;
      this.field4788 = this.field4787.field4800.field6515;
      this.field4789 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnx;)Ljava/lang/Object;")
   @ObfuscatedName("bk")
   public static Object method8251(classNX var0) {
      if (var0 == null) {
         var0.method8256();
      }

      classVJ var1 = var0.field4788;
      if (var1 == var0.field4787.field4800) {
         var1 = null;
         var0.field4788 = null;
      } else {
         var0.field4788 = var1.field6515;
      }

      var0.field4789 = var1;
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   public void method8256() {
      if (this.field4789 == null) {
         throw new IllegalStateException();
      } else {
         this.field4789.method11958();
         this.field4789 = null;
      }
   }
}
