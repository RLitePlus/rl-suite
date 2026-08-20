import java.awt.Component;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("zn")
public abstract class classZN {
   classZN() {
   }

   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("ab")
   abstract byte[] vmethod658(int var1);

   @ObfuscatedSignature(descriptor = "([BI)V")
   @ObfuscatedName("ag")
   abstract void vmethod659(byte[] var1, int var2);

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ay")
   abstract byte[] vmethod660();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BZ)Ljava/lang/Object;")
   @ObfuscatedName("ax")
   public static Object method14069(byte[] var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0.length > 136) {
         classZW var2 = new classZW();
         var2.vmethod659(var0, -2127650824);
         return var2;
      } else {
         return var1 ? classLP.method7141(var0, -1399874615) : var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Z)[B")
   @ObfuscatedName("ac")
   public static byte[] method14071(Object var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var3 = (byte[])var0;
         return var1 ? classLP.method7141(var3, 1628626068) : var3;
      } else if (var0 instanceof classZN) {
         classZN var2 = (classZN)var0;
         return var2.vmethod658(-829968186);
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltg;Ljava/awt/Component;)V")
   @ObfuscatedName("fc")
   public static void method14074(RasterProvider var0, Component var1) {
      if (var0 == null) {
         var0.method10801(var1);
      } else {
         var0.field6135 = var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Z)[B")
   @ObfuscatedName("aa")
   public static byte[] method14072(Object var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var3 = (byte[])var0;
         return var1 ? classLP.method7141(var3, 1702708355) : var3;
      } else if (var0 instanceof classZN) {
         classZN var2 = (classZN)var0;
         return var2.vmethod658(-1850790914);
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Z)[B")
   @ObfuscatedName("ao")
   public static byte[] method14073(Object var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var3 = (byte[])var0;
         return var1 ? classLP.method7141(var3, -315706899) : var3;
      } else if (var0 instanceof classZN) {
         classZN var2 = (classZN)var0;
         return var2.vmethod658(-1343966382);
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("al")
   abstract byte[] vmethod661();

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("aj")
   abstract byte[] vmethod662();

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("aq")
   abstract void vmethod663(byte[] var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BZ)Ljava/lang/Object;")
   @ObfuscatedName("as")
   public static Object method14070(byte[] var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0.length > 136) {
         classZW var2 = new classZW();
         var2.vmethod659(var0, 1149834317);
         return var2;
      } else {
         return var1 ? classLP.method7141(var0, 156286945) : var0;
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ad")
   abstract void vmethod664(byte[] var1);

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("au")
   abstract void vmethod665(byte[] var1);

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ap")
   abstract void vmethod666(byte[] var1);
}
