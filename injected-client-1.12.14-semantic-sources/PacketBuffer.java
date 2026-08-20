import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xj")
public class PacketBuffer extends Buffer implements net.runelite.api.PacketBuffer {
   @ObfuscatedSignature(descriptor = "Lxo;")
   @ObfuscatedName("at")
   IsaacCipher isaacCipher;
   @ObfuscatedName("av")
   static final int[] field6547 = new int[]{
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
   @ObfuscatedName("ag")
   int bitIndex;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxj;I)V")
   @ObfuscatedName("zy")
   public static void method12315(PacketBuffer var0, int var1) {
      var0.array[(var0.offset += -1260842954) * 2108391709 - 1] = (byte)(var1 + var0.isaacCipher.nextInt((byte)-9));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxj;I)V")
   @ObfuscatedName("hr")
   public static void method12316(PacketBuffer var0, int var1) {
      var0.array[(var0.offset += -1222774309) * 2108391709 - 1] = (byte)(var1 + var0.isaacCipher.nextInt((byte)-49));
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bn")
   public void method12343() {
      this.offset = (this.bitIndex * -1996081443 + 7) / 8 * 1741769013;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bg")
   public boolean method12325() {
      int var1 = this.array[this.offset * 1151891057] - this.isaacCipher.method12447(327716789) & 0xFF;
      return var1 >= 128;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("av")
   @Override
   public void releaseArray(byte var1) {
      try {
         super.releaseArray((byte)16);
         this.isaacCipher = null;
         this.bitIndex = 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xj.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxo;I)V")
   @ObfuscatedName("ag")
   public void setIsaacCipher(IsaacCipher var1, int var2) {
      try {
         this.isaacCipher = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xj.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxj;)I")
   @ObfuscatedName("ko")
   public static int method12327(PacketBuffer var0) {
      if (var0 == null) {
         return var0.method12324();
      } else {
         int var1 = var0.array[(var0.offset += 1787714143) * 2108391709 - 1] - var0.isaacCipher.nextInt((byte)-120) & 0xFF;
         return var1 < 128
            ? var1
            : (var1 - 128 << 8) + (var0.array[(var0.offset += 1741769013) * 2108391709 - 1] - var0.isaacCipher.nextInt((byte)-82) & -213906912);
      }
   }

   public PacketBuffer(int var1) {
      super(var1);
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("ae")
   public int readByteIsaac(short var1) {
      try {
         return this.array[(this.offset += 1741769013) * 2108391709 - 1] - this.isaacCipher.nextInt((byte)-125) & 0xFF;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xj.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("az")
   public int bitsRemaining(int var1, int var2) {
      try {
         return var1 - this.offset * 2108391709;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xj.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   @Override
   public void vmethod449() {
      super.releaseArray((byte)-1);
      this.isaacCipher = null;
      this.bitIndex = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvu;)I")
   @ObfuscatedName("xe")
   public static int method12338(classVU var0) {
      return var0.field6308 * 721429832;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxe;)[I")
   @ObfuscatedName("xz")
   public static int[] method12311(NPCOverheadIcons var0) {
      return var0.overheadArchiveIds;
   }

   @ObfuscatedSignature(descriptor = "(Lxo;)V")
   @ObfuscatedName("al")
   public void method12312(IsaacCipher var1) {
      this.isaacCipher = var1;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ad")
   public int method12339(int var1, int var2) {
      try {
         int var3 = -1996081443 * this.bitIndex >> 3;
         int var4 = 8 - (this.bitIndex * -1996081443 & 7);
         int var5 = 0;

         for (this.bitIndex += -1028566667 * var1; var1 > var4; var4 = 8) {
            if (var2 != 1333712909) {
               throw new IllegalStateException();
            }

            var5 += (this.array[var3++] & field6547[var4]) << var1 - var4;
            var1 -= var4;
         }

         if (var1 == var4) {
            if (var2 != 1333712909) {
               throw new IllegalStateException();
            }

            var5 += this.array[var3] & field6547[var4];
         } else {
            var5 += this.array[var3] >> var4 - var1 & field6547[var1];
         }

         return var5;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "xj.ay(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxj;)V")
   @ObfuscatedName("qi")
   public static void method12344(PacketBuffer var0) {
      var0.offset = (var0.bitIndex * -1014866328 + 7) / 8 * -96504164;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("au")
   public void exportIndex(byte var1) {
      try {
         this.offset = (this.bitIndex * -1996081443 + 7) / 8 * 1741769013;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xj.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxo;)V")
   @ObfuscatedName("ar")
   public void method12313(IsaacCipher var1) {
      this.isaacCipher = var1;
   }

   @ObfuscatedSignature(descriptor = "([BIIS)V")
   @ObfuscatedName("aw")
   public void method12331(byte[] var1, int var2, int var3, short var4) {
      try {
         for (int var5 = 0; var5 < var3; var5++) {
            if (var4 != 180) {
               return;
            }

            var1[var5 + var2] = (byte)(this.array[(this.offset += 1741769013) * 2108391709 - 1] - this.isaacCipher.nextInt((byte)-64));
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "xj.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   @Override
   public void vmethod450() {
      super.releaseArray((byte)-71);
      this.isaacCipher = null;
      this.bitIndex = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bq")
   public int method12351(int var1) {
      return var1 - this.offset * 568426117;
   }

   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("ab")
   public void method12307(int[] var1) {
      this.isaacCipher = new IsaacCipher(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxj;I)I")
   @ObfuscatedName("rp")
   public static int method12347(PacketBuffer var0, int var1) {
      if (var0 == null) {
         var0.method12353(var1);
      }

      return 8 * var1 - var0.bitIndex * -1996081443;
   }

   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("ax")
   public void method12308(int[] var1) {
      this.isaacCipher = new IsaacCipher(var1);
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("bm")
   public void method12332(byte[] var1, int var2, int var3) {
      for (int var4 = 0; var4 < var3; var4++) {
         var1[var4 + var2] = (byte)(this.array[(this.offset += 1741769013) * 2108391709 - 1] - this.isaacCipher.nextInt((byte)-72));
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxo;)V")
   @ObfuscatedName("ah")
   public void method12314(IsaacCipher var1) {
      this.isaacCipher = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ao")
   public void method12317(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 + this.isaacCipher.nextInt((byte)-85));
   }

   @ObfuscatedSignature(descriptor = "([II)V")
   @ObfuscatedName("at")
   public void newIsaacCipher(int[] var1, int var2) {
      try {
         this.isaacCipher = new IsaacCipher(var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xj.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("am")
   public void method12318(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 + this.isaacCipher.nextInt((byte)-47));
   }

   @ObfuscatedSignature(descriptor = "(IS)V")
   @ObfuscatedName("an")
   public void writeByteIsaac(int var1, short var2) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 + this.isaacCipher.nextInt((byte)-60));
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xj.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bo")
   public int method12321() {
      return this.array[(this.offset += 1741769013) * 2108391709 - 1] - this.isaacCipher.nextInt((byte)-11) & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "(Lxj;I)V")
   @ObfuscatedName("vg")
   public static void method12336(PacketBuffer var0, int var1) {
      if (var0 == null) {
         var0.importIndex(var1);
      } else {
         try {
            var0.bitIndex = var0.offset * -1840678392;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "xj.ap(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bk")
   public int method12322() {
      return this.array[(this.offset += -1232266486) * 2108391709 - 1] - this.isaacCipher.nextInt((byte)-33) & -2115827103;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("be")
   public int method12323() {
      return this.array[(this.offset += 1741769013) * 2108391709 - 1] - this.isaacCipher.nextInt((byte)-87) & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "(S)Z")
   @ObfuscatedName("aj")
   public boolean method12326(short var1) {
      try {
         int var2 = this.array[this.offset * 2108391709] - this.isaacCipher.method12447(327716789) & 0xFF;
         if (var2 < 128) {
            if (var1 <= 1402) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xj.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   public int method12328() {
      int var1 = this.array[(this.offset += 1741769013) * 2108391709 - 1] - this.isaacCipher.nextInt((byte)-91) & 0xFF;
      return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.array[(this.offset += 1741769013) * 2108391709 - 1] - this.isaacCipher.nextInt((byte)-40) & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bz")
   public int method12329() {
      int var1 = this.array[(this.offset += -1897147851) * 1958857869 - 1] - this.isaacCipher.nextInt((byte)-30) & -1152802410;
      return var1 < 534851909
         ? var1
         : (var1 - 1022524561 << 8) + (this.array[(this.offset += -188099039) * 1809762416 - 1] - this.isaacCipher.nextInt((byte)-103) & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("bb")
   public void method12333(byte[] var1, int var2, int var3) {
      for (int var4 = 0; var4 < var3; var4++) {
         var1[var4 + var2] = (byte)(this.array[(this.offset += 1095111693) * 2108391709 - 1] - this.isaacCipher.nextInt((byte)-36));
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("bj")
   public void method12334(byte[] var1, int var2, int var3) {
      for (int var4 = 0; var4 < var3; var4++) {
         var1[var4 + var2] = (byte)(this.array[(this.offset += -839172554) * -595345278 - 1] - this.isaacCipher.nextInt((byte)-62));
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   @Override
   public void vmethod448() {
      super.releaseArray((byte)46);
      this.isaacCipher = null;
      this.bitIndex = 0;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ay")
   public int readBits(int var1, int var2) {
      try {
         return 8 * var1 - this.bitIndex * -1996081443;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xj.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bi")
   public int method12340(int var1) {
      int var2 = -1996081443 * this.bitIndex >> 3;
      int var3 = 8 - (this.bitIndex * -1996081443 & 7);
      int var4 = 0;

      for (this.bitIndex += 14605262 * var1; var1 > var3; var3 = 8) {
         var4 += (this.array[var2++] & field6547[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var1 == var3) {
         var4 += this.array[var2] & field6547[var3];
      } else {
         var4 += this.array[var2] >> var3 - var1 & field6547[var1];
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ak")
   public int readSmartByteShortIsaac(int var1) {
      try {
         int var2 = this.array[(this.offset += 1741769013) * 2108391709 - 1] - this.isaacCipher.nextInt((byte)-110) & 0xFF;
         return var2 < 128
            ? var2
            : (var2 - 128 << 8) + (this.array[(this.offset += 1741769013) * 2108391709 - 1] - this.isaacCipher.nextInt((byte)-120) & 0xFF);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xj.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bf")
   public void method12346() {
      this.offset = (this.bitIndex * -1996081443 + 7) / 8 * 2083831591;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("br")
   public int method12349(int var1) {
      return 8 * var1 - this.bitIndex * -1996081443;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxj;[BII)V")
   @ObfuscatedName("kc")
   public static void method12335(PacketBuffer var0, byte[] var1, int var2, int var3) {
      if (var0 == null) {
         var0.method12352(var2);
      }

      for (int var4 = 0; var4 < var3; var4++) {
         var1[var4 + var2] = (byte)(var0.array[(var0.offset += 1741769013) * 2108391709 - 1] - var0.isaacCipher.nextInt((byte)-4));
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bc")
   public int method12352(int var1) {
      return var1 - this.offset * 2108391709;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bw")
   public int method12341(int var1) {
      int var2 = -1996081443 * this.bitIndex >> 3;
      int var3 = 8 - (this.bitIndex * -1996081443 & 7);
      int var4 = 0;

      for (this.bitIndex += -1028566667 * var1; var1 > var3; var3 = 8) {
         var4 += (this.array[var2++] & field6547[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var1 == var3) {
         var4 += this.array[var2] & field6547[var3];
      } else {
         var4 += this.array[var2] >> var3 - var1 & field6547[var1];
      }

      return var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxj;I)I")
   @ObfuscatedName("oc")
   public static int method12342(PacketBuffer var0, int var1) {
      int var2 = -1996081443 * var0.bitIndex >> 3;
      int var3 = 8 - (var0.bitIndex * -1996081443 & 7);
      int var4 = 0;

      for (var0.bitIndex += -1028566667 * var1; var1 > var3; var3 = 8) {
         var4 += (var0.array[var2++] & field6547[var3]) << var1 - var3;
         var1 -= var3;
      }

      if (var1 == var3) {
         var4 += var0.array[var2] & field6547[var3];
      } else {
         var4 += var0.array[var2] >> var3 - var1 & field6547[var1];
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ap")
   public void importIndex(int var1) {
      try {
         this.bitIndex = this.offset * -1840678392;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xj.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   public int method12324() {
      return this.array[(this.offset += -1232266486) * 2108391709 - 1] - this.isaacCipher.nextInt((byte)-33) & -2115827103;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bl")
   public int method12353(int var1) {
      return var1 - this.offset * 568426117;
   }
}
