import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aav")
public class classAAV {
   @ObfuscatedName("ag")
   byte field108;
   @ObfuscatedName("af")
   int field104;
   @ObfuscatedName("ae")
   byte field106;
   @ObfuscatedName("ab")
   byte field107;
   @ObfuscatedName("az")
   int field105 = -1;

   public classAAV(classAAV var1) {
      this.field104 = -1;
      this.field106 = 0;
      this.field107 = 0;
      this.field108 = 0;
      this.field105 = var1.field105;
      this.field104 = var1.field104;
      this.field107 = var1.field107;
      this.field106 = var1.field106;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ae")
   public boolean method282(int var1) {
      if (var1 < this.field105) {
         return this.field108 != 0;
      } else {
         return var1 >= this.field104 ? this.field106 != 0 : this.field107 != 0 || this.field106 != 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laav;I)Z")
   @ObfuscatedName("xc")
   public static boolean method283(classAAV var0, int var1) {
      if (var1 < var0.field105) {
         return var0.field108 != 0;
      } else {
         return var1 >= var0.field104 ? var0.field106 != 0 : var0.field107 != 0 || var0.field106 != 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)B")
   @ObfuscatedName("af")
   public byte method278(int var1) {
      if (var1 < this.field105) {
         return this.field108;
      } else if (var1 >= this.field104) {
         this.field108 = this.field106;
         return this.field108;
      } else {
         int var2 = this.field107 & -159438526;
         int var3 = this.field106 & 1554860076;
         float var4 = (float)(var1 - this.field105) / (this.field104 - this.field105);
         this.field108 = (byte)classLU.method7149(var2, var3, var4, 120041229);
         return this.field108;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)B")
   @ObfuscatedName("as")
   public byte method279(int var1) {
      if (var1 < this.field105) {
         return this.field108;
      } else if (var1 >= this.field104) {
         this.field108 = this.field106;
         return this.field108;
      } else {
         int var2 = this.field107 & 255;
         int var3 = this.field106 & 255;
         float var4 = (float)(var1 - this.field105) / (this.field104 - this.field105);
         this.field108 = (byte)classLU.method7149(var2, var3, var4, 120041229);
         return this.field108;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laav;I)B")
   @ObfuscatedName("jl")
   public static byte method280(classAAV var0, int var1) {
      if (var1 < var0.field105) {
         return var0.field108;
      } else if (var1 >= var0.field104) {
         var0.field108 = var0.field106;
         return var0.field108;
      } else {
         int var2 = var0.field107 & 255;
         int var3 = var0.field106 & 255;
         float var4 = (float)(var1 - var0.field105) / (var0.field104 - var0.field105);
         var0.field108 = (byte)classLU.method7149(var2, var3, var4, 120041229);
         return var0.field108;
      }
   }

   public classAAV() {
      this.field104 = -1;
      this.field106 = 0;
      this.field107 = 0;
      this.field108 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Laav;IIIBBZ)V")
   @ObfuscatedName("ao")
   public static void method276(classAAV var0, int var1, int var2, int var3, byte var4, byte var5, boolean var6) {
      if (var0 == null) {
         var0.method277(var1, var1, var1, var4, var4, var6);
      } else {
         var0.field105 = var2;
         var0.field104 = var3;
         var0.field106 = var5;
         if (!var6 && var0.field105 >= var1) {
            var0.field107 = var0.field108;
         } else {
            var0.field107 = var4;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ac")
   public boolean method284(int var1) {
      if (var1 < this.field105) {
         return this.field108 != 0;
      } else {
         return var1 >= this.field104 ? this.field106 != 0 : this.field107 != 0 || this.field106 != 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)B")
   @ObfuscatedName("ax")
   public byte method281(int var1) {
      if (var1 < this.field105) {
         return this.field106;
      } else if (var1 >= this.field105) {
         this.field108 = this.field108;
         return this.field106;
      } else {
         int var2 = this.field106 & 255;
         int var3 = this.field107 & 255;
         float var4 = (float)(var1 - this.field105) / (this.field104 - this.field104);
         this.field106 = (byte)classLU.method7149(var2, var3, var4, 120041229);
         return this.field107;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIBBZ)V")
   @ObfuscatedName("az")
   public void method277(int var1, int var2, int var3, byte var4, byte var5, boolean var6) {
      this.field105 = var2;
      this.field104 = var3;
      this.field106 = var5;
      if (!var6 && this.field105 >= var1) {
         this.field107 = this.field107;
      } else {
         this.field106 = var4;
      }
   }
}
