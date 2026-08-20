import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xs")
public class PacketBuffer extends classXY implements net.runelite.api.PacketBuffer {
   @ObfuscatedName("az")
   static final int[] field6926 = new int[]{
      0,
      1,
      3,
      7,
      15,
      31,
      63,
      127,
      255,
      511,
      1023,
      2047,
      4095,
      8191,
      16383,
      32767,
      65535,
      131071,
      262143,
      524287,
      1048575,
      2097151,
      4194303,
      8388607,
      16777215,
      33554431,
      67108863,
      134217727,
      268435455,
      536870911,
      1073741823,
      Integer.MAX_VALUE,
      -1
   };
   @ObfuscatedSignature(descriptor = "Lyt;")
   @ObfuscatedName("af")
   classYT field6929;
   @ObfuscatedName("ae")
   int field6927;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field6928 = 1;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   public void method12896(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 + this.field6929.method13625((byte)1));
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   @Override
   public void vmethod649(int var1) {
      try {
         super.vmethod649(-1721213701);
         this.field6929 = null;
         this.field6927 = 0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xs.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([II)V")
   @ObfuscatedName("af")
   public void method12892(int[] var1, int var2) {
      try {
         this.field6929 = new classYT(var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xs.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("as")
   public boolean method12906(int var1) {
      try {
         int var2 = this.field6954[this.field6955 * 702114061] - classYT.method13626(this.field6929, -1969645377) & 0xFF;
         if (var2 < 128) {
            if (var1 != 127450546) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xs.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("by")
   public int method12902(int var1) {
      try {
         return this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] - this.field6929.method13625((byte)1) & 0xFF;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xs.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   public void method12917() {
      this.field6927 = this.field6955 * -1286969624;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   public void method12897(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 + this.field6929.method13625((byte)1));
   }

   @ObfuscatedSignature(descriptor = "([BIII)V")
   @ObfuscatedName("ac")
   public void method12913(byte[] var1, int var2, int var3, int var4) {
      try {
         for (int var5 = 0; var5 < var3; var5++) {
            if (var4 >= 107076391) {
               throw new IllegalStateException();
            }

            var1[var5 + var2] = (byte)(this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] - this.field6929.method13625((byte)1));
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "xs.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   @Override
   public void vmethod650() {
      super.vmethod649(-1688114718);
      this.field6929 = null;
      this.field6927 = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxs;)I")
   @ObfuscatedName("rr")
   public static int method12909(PacketBuffer var0) {
      int var1 = var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] - var0.field6929.method13625((byte)1) & 0xFF;
      return var1 < 128
         ? var1
         : (var1 - 128 << 8) + (var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] - var0.field6929.method13625((byte)1) & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ay")
   public int method12931(int var1, int var2) {
      try {
         return var1 - 702114061 * this.field6955;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xs.ay(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bx")
   public boolean method12907() {
      int var1 = this.field6954[this.field6955 * 702114061] - classYT.method13626(this.field6929, -1984765983) & 0xFF;
      return var1 >= 1819681526;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxs;I)I")
   @ObfuscatedName("qb")
   public static int method12922(PacketBuffer var0, int var1) {
      int var2 = 512124769 * var0.field6927 >> 3;
      int var3 = 8 - (var0.field6927 * -653463055 & 7);
      int var4 = 0;

      for (var0.field6927 += var1 * -1278857492; var1 > var3; var3 = 8) {
         var4 += (var0.field6954[var2++] & field6926[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += var0.field6954[var2] & field6926[var3];
      } else {
         var4 += var0.field6954[var2] >> var3 - var1 & field6926[var1];
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aj")
   public int method12929(int var1, int var2) {
      try {
         return var1 * 8 - this.field6927 * -653463055;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xs.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   public void method12898(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 670931612 - 1] = (byte)(var1 + this.field6929.method13625((byte)1));
   }

   public PacketBuffer(int var1) {
      super(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lyt;)V")
   @ObfuscatedName("ai")
   public void method12893(classYT var1) {
      this.field6929 = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bj")
   public void method12918() {
      this.field6927 = this.field6955 * -1286969624;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   public int method12903() {
      return this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] - this.field6929.method13625((byte)1) & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   public void method12899(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 + this.field6929.method13625((byte)1));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("am")
   public int method12904() {
      return this.field6954[(this.field6955 += -1095856699) * 305740227 - 1] - this.field6929.method13625((byte)1) & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ab")
   public void method12900(int var1, byte var2) {
      try {
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 + this.field6929.method13625((byte)1));
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xs.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxs;)V")
   @ObfuscatedName("bh")
   public static void method12919(PacketBuffer var0) {
      var0.field6927 = var0.field6955 * -1286969624;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bp")
   public int method12905() {
      return this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] - this.field6929.method13625((byte)1) & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "(Lyt;I)V")
   @ObfuscatedName("ae")
   public void method12894(classYT var1, int var2) {
      try {
         this.field6929 = var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xs.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxs;Lyt;)V")
   @ObfuscatedName("cd")
   public static void method12895(PacketBuffer var0, classYT var1) {
      if (var0 == null) {
         var0.method12907();
      }

      var0.field6929 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bn")
   public boolean method12908() {
      int var1 = this.field6954[this.field6955 * 702114061] - classYT.method13626(this.field6929, -2023992503) & 0xFF;
      return var1 >= 128;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   public int method12910() {
      int var1 = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] - this.field6929.method13625((byte)1) & 0xFF;
      return var1 < 128
         ? var1
         : (var1 - 128 << 8) + (this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] - this.field6929.method13625((byte)1) & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "(Lxs;II)I")
   @ObfuscatedName("bp")
   public static int method12923(PacketBuffer var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method12930(var1, var1);
      } else {
         try {
            int var3 = -653463055 * var0.field6927 >> 3;
            int var4 = 8 - (var0.field6927 * -653463055 & 7);
            int var5 = 0;

            for (var0.field6927 += var1 * -2104238319; var1 > var4; var4 = 8) {
               var5 += (var0.field6954[var3++] & field6926[var4]) << var1 - var4;
               var1 -= var4;
            }

            if (var4 == var1) {
               if (var2 <= -1001260316) {
                  throw new IllegalStateException();
               }

               var5 += var0.field6954[var3] & field6926[var4];
            } else {
               var5 += var0.field6954[var3] >> var4 - var1 & field6926[var1];
            }

            return var5;
         } catch (RuntimeException var6) {
            throw classEG.method3884(var6, "xs.ao(" + 41);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxs;[BII)V")
   @ObfuscatedName("ei")
   public static void method12914(PacketBuffer var0, byte[] var1, int var2, int var3) {
      if (var0 == null) {
         var0.method12896(var2);
      }

      for (int var4 = 0; var4 < var3; var4++) {
         var1[var4 + var2] = (byte)(var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] - var0.field6929.method13625((byte)1));
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("bm")
   public void method12915(byte[] var1, int var2, int var3) {
      for (int var4 = 0; var4 < var3; var4++) {
         var1[var4 + var2] = (byte)(this.field6954[(this.field6955 += 597900486) * 702114061 - 1] - this.field6929.method13625((byte)1));
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   @Override
   public void vmethod651() {
      super.vmethod649(-1854594923);
      this.field6929 = null;
      this.field6927 = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   @Override
   public void vmethod652() {
      super.vmethod649(-1678019292);
      this.field6929 = null;
      this.field6927 = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public int method12924(int var1) {
      int var2 = -653463055 * this.field6927 >> 3;
      int var3 = 8 - (this.field6927 * -653463055 & 7);
      int var4 = 0;

      for (this.field6927 += var1 * -1158609679; var1 > var3; var3 = 8) {
         var4 += (this.field6954[var2++] & field6926[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += this.field6954[var2] & field6926[var3];
      } else {
         var4 += this.field6954[var2] >> var3 - var1 & field6926[var1];
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)V")
   @ObfuscatedName("oc")
   public static void method12926(PacketBuffer var0, int var1) {
      if (var0 == null) {
         var0.method12901(var1);
      } else {
         try {
            var0.field6955 = (7 + var0.field6927 * -653463055) / 8 * -1095856699;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "xs.al(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("be")
   public int method12925(int var1) {
      int var2 = -653463055 * this.field6927 >> 3;
      int var3 = 8 - (this.field6927 * -2133011107 & 7);
      int var4 = 0;

      for (this.field6927 += var1 * -2104238319; var1 > var3; var3 = 8) {
         var4 += (this.field6954[var2++] & field6926[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var3 == var1) {
         var4 += this.field6954[var2] & field6926[var3];
      } else {
         var4 += this.field6954[var2] >> var3 - var1 & field6926[var1];
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   public void method12927() {
      this.field6955 = (7 + this.field6927 * -1058862881) / 8 * -1095856699;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   public void method12928() {
      this.field6955 = (7 + this.field6927 * -653463055) / 8 * -1095856699;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bu")
   public int method12932(int var1) {
      return var1 - 702114061 * this.field6955;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ba")
   public int method12933(int var1) {
      return var1 - 702114061 * this.field6955;
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("du")
   static void method12934(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         classCZ.method2851(classCQ.field1220, var0, var1, var2, var3, var4, -287734684);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "xs.du(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;B)I")
   @ObfuscatedName("pj")
   public static int method12911(PacketBuffer var0, byte var1) {
      if (var0 == null) {
         return var0.method12912(var1);
      } else {
         try {
            int var2 = var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] - var0.field6929.method13625((byte)1) & 0xFF;
            if (var2 < 128) {
               if (var1 <= 2) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               return (var2 - 128 << 8) + (var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] - var0.field6929.method13625((byte)1) & 0xFF);
            }
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "xs.ax(" + 41);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxs;[BII)V")
   @ObfuscatedName("fq")
   public static void method12916(PacketBuffer var0, byte[] var1, int var2, int var3) {
      if (var0 == null) {
         var0.method12903();
      }

      for (int var4 = 0; var4 < var3; var4++) {
         var1[var4 + var2] = (byte)(var0.field6954[(var0.field6955 += -1067028931) * 702114061 - 1] - var0.field6929.method13625((byte)1));
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ax")
   public int method12912(byte var1) {
      try {
         int var2 = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] - this.field6929.method13625((byte)1) & 0xFF;
         if (var2 < 128) {
            if (var1 <= 2) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            return (var2 - 128 << 8) + (this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] - this.field6929.method13625((byte)1) & 0xFF);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xs.ax(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aa")
   public void method12920(byte var1) {
      try {
         this.field6927 = this.field6955 * -1286969624;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xs.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;B)V")
   @ObfuscatedName("vk")
   public static void method12921(PacketBuffer var0, byte var1) {
      if (var0 == null) {
         var0.method12920(var1);
      } else {
         try {
            var0.field6927 = var0.field6955 * -1286969624;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "xs.aa(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   public void method12901(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 670931612 - 1] = (byte)(var1 + this.field6929.method13625((byte)1));
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ao")
   public int method12930(int var1, int var2) {
      try {
         return var1 * 8 - this.field6927 * -653463055;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xs.aj(" + 41);
      }
   }
}
