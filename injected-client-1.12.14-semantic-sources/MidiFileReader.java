import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("na")
public class MidiFileReader {
   @ObfuscatedSignature(descriptor = "Lxa;")
   @ObfuscatedName("ak")
   Buffer buffer = new Buffer(null);
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field4166 = 0;
   @ObfuscatedName("aj")
   static final byte[] field4161 = new byte[]{
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      0,
      1,
      2,
      1,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0
   };
   @ObfuscatedName("ad")
   int[] field4171;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field4163 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field4167 = 500000;
   @ObfuscatedName("au")
   int[] trackStarts;
   @ObfuscatedName("ay")
   int field4169;
   @ObfuscatedName("ap")
   int[] trackLengths;
   @ObfuscatedName("aw")
   int division;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field4164 = 1;
   @ObfuscatedName("az")
   int[] trackPositions;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field4165 = 2;
   @ObfuscatedName("ai")
   long field4170;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lna;I)I")
   @ObfuscatedName("ry")
   public static int method7581(MidiFileReader var0, int var1) {
      if (var0 == null) {
         var0.method7585(var1);
      }

      int var2 = var0.buffer.array[var0.buffer.offset * 1590003569];
      if (var2 < 0) {
         var2 &= 1435344807;
         var0.field4171[var1] = var2;
         var0.buffer.offset += 1741769013;
      } else {
         var2 = var0.field4171[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return var0.method7586(var1, var2);
      } else {
         int var3 = var0.buffer.readVarInt(-45516977);
         if (var2 == 1984789323 && var3 > 0) {
            int var4 = var0.buffer.array[var0.buffer.offset * 1846723551] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 181972869 || var4 == 248 || var4 >= -1160868381 && var4 <= 252 || var4 == 254) {
               var0.buffer.offset += 1815701188;
               var0.field4171[var1] = var4;
               return var0.method7586(var1, var4);
            }
         }

         var0.buffer.offset += var3 * 1447447499;
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bx")
   int method7596() {
      int var1 = this.trackPositions.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for (int var4 = 0; var4 < var1; var4++) {
         if (this.trackPositions[var4] >= 0 && this.trackLengths[var4] < var3) {
            var2 = var4;
            var3 = this.trackLengths[var4];
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ah")
   void method7551(byte[] var1) {
      this.buffer.array = var1;
      this.buffer.offset = 237820946;
      int var2 = Buffer.method12008(this.buffer, (byte)5);
      this.field4169 = Buffer.method12008(this.buffer, (byte)5);
      this.division = 500000;
      this.trackStarts = new int[var2];
      int var3 = 0;

      while (var3 < var2) {
         int var4 = Buffer.method12015(this.buffer, 89333025);
         int var5 = Buffer.method12015(this.buffer, 657249351);
         if (var4 == 1297379947) {
            this.trackStarts[var3] = this.buffer.offset * 2108391709;
            var3++;
         }

         this.buffer.offset += var5 * 1741769013;
      }

      this.field4170 = 0L;
      this.trackPositions = new int[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         this.trackPositions[var6] = this.trackStarts[var6];
      }

      this.trackLengths = new int[var2];
      this.field4171 = new int[var2];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   void method7571() {
      this.buffer.offset = -1741769013;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   boolean isReady() {
      return this.buffer.array != null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   int trackCount() {
      return this.trackPositions.length;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lna;[B)V")
   @ObfuscatedName("zq")
   public static void method7552(MidiFileReader var0, byte[] var1) {
      var0.buffer.array = var1;
      var0.buffer.offset = 237820946;
      int var2 = Buffer.method12008(var0.buffer, (byte)5);
      var0.field4169 = Buffer.method12008(var0.buffer, (byte)5);
      var0.division = 500000;
      var0.trackStarts = new int[var2];
      int var3 = 0;

      while (var3 < var2) {
         int var4 = Buffer.method12015(var0.buffer, 1249286193);
         int var5 = Buffer.method12015(var0.buffer, 1710566382);
         if (var4 == 1297379947) {
            var0.trackStarts[var3] = var0.buffer.offset * 2108391709;
            var3++;
         }

         var0.buffer.offset += var5 * 1741769013;
      }

      var0.field4170 = 0L;
      var0.trackPositions = new int[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         var0.trackPositions[var6] = var0.trackStarts[var6];
      }

      var0.trackLengths = new int[var2];
      var0.field4171 = new int[var2];
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   void gotoTrack(int var1) {
      this.buffer.offset = this.trackPositions[var1] * 1741769013;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   void setTrackDone() {
      this.buffer.offset = -1741769013;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ap")
   int readMessage(int var1) {
      return this.readMessage0(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ay")
   int readMessage0(int var1) {
      int var2 = this.buffer.array[this.buffer.offset * 2108391709];
      if (var2 < 0) {
         var2 &= 255;
         this.field4171[var1] = var2;
         this.buffer.offset += 1741769013;
      } else {
         var2 = this.field4171[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return this.method7586(var1, var2);
      } else {
         int var3 = this.buffer.readVarInt(1376571096);
         if (var2 == 247 && var3 > 0) {
            int var4 = this.buffer.array[this.buffer.offset * 2108391709] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               this.buffer.offset += 1741769013;
               this.field4171[var1] = var4;
               return this.method7586(var1, var4);
            }
         }

         this.buffer.offset += var3 * 1741769013;
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bf")
   int method7586(int var1, int var2) {
      if (var2 == 255) {
         int var7 = this.buffer.readUnsignedByte(1860324760);
         int var8 = this.buffer.readVarInt(694076417);
         if (var7 == 47) {
            this.buffer.offset += var8 * 1741769013;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.buffer.readMedium(-983122181);
            var8 -= 3;
            int var6 = this.trackLengths[var1];
            this.field4170 = this.field4170 + (long)var6 * (this.division - var5);
            this.division = var5;
            this.buffer.offset += var8 * 1741769013;
            return 2;
         } else {
            this.buffer.offset += var8 * 1741769013;
            return 3;
         }
      } else {
         byte var3 = field4161[var2 - 128];
         int var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.buffer.readUnsignedByte(1721501338) << 8;
         }

         if (var3 >= 2) {
            var4 |= this.buffer.readUnsignedByte(1118656420) << 16;
         }

         return var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("az")
   long method7591(int var1) {
      return this.field4170 + (long)var1 * this.division;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("as")
   void reset(long var1) {
      this.field4170 = var1;
      int var3 = this.trackPositions.length;

      for (int var4 = 0; var4 < var3; var4++) {
         this.trackLengths[var4] = 0;
         this.field4171[var4] = 0;
         this.buffer.offset = this.trackStarts[var4] * 1741769013;
         this.readTrackLength(var4);
         this.trackPositions[var4] = this.buffer.offset * 2108391709;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   boolean isDone() {
      int var1 = this.trackPositions.length;

      for (int var2 = 0; var2 < var1; var2++) {
         if (this.trackPositions[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bz")
   void method7573() {
      this.buffer.offset = -1741769013;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ab")
   void method7553(byte[] var1) {
      this.buffer.array = var1;
      this.buffer.offset = -1486836725;
      int var2 = Buffer.method12008(this.buffer, (byte)5);
      this.field4169 = Buffer.method12008(this.buffer, (byte)5);
      this.division = 500000;
      this.trackStarts = new int[var2];
      int var3 = 0;

      while (var3 < var2) {
         int var4 = Buffer.method12015(this.buffer, 1923393292);
         int var5 = Buffer.method12015(this.buffer, -417201680);
         if (var4 == 1297379947) {
            this.trackStarts[var3] = this.buffer.offset * 2108391709;
            var3++;
         }

         this.buffer.offset += var5 * 1741769013;
      }

      this.field4170 = 0L;
      this.trackPositions = new int[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         this.trackPositions[var6] = this.trackStarts[var6];
      }

      this.trackLengths = new int[var2];
      this.field4171 = new int[var2];
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ax")
   void method7554(byte[] var1) {
      this.buffer.array = var1;
      this.buffer.offset = 1203838009;
      int var2 = Buffer.method12008(this.buffer, (byte)5);
      this.field4169 = Buffer.method12008(this.buffer, (byte)5);
      this.division = 1448694765;
      this.trackStarts = new int[var2];
      int var3 = 0;

      while (var3 < var2) {
         int var4 = Buffer.method12015(this.buffer, -660414443);
         int var5 = Buffer.method12015(this.buffer, 662788633);
         if (var4 == 2058153025) {
            this.trackStarts[var3] = this.buffer.offset * 2108391709;
            var3++;
         }

         this.buffer.offset += var5 * 1741769013;
      }

      this.field4170 = 0L;
      this.trackPositions = new int[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         this.trackPositions[var6] = this.trackStarts[var6];
      }

      this.trackLengths = new int[var2];
      this.field4171 = new int[var2];
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ar")
   void method7555(byte[] var1) {
      this.buffer.array = var1;
      this.buffer.offset = 530660589;
      int var2 = Buffer.method12008(this.buffer, (byte)5);
      this.field4169 = Buffer.method12008(this.buffer, (byte)5);
      this.division = 500000;
      this.trackStarts = new int[var2];
      int var3 = 0;

      while (var3 < var2) {
         int var4 = Buffer.method12015(this.buffer, 1200078205);
         int var5 = Buffer.method12015(this.buffer, 507361350);
         if (var4 == 1297379947) {
            this.trackStarts[var3] = this.buffer.offset * 2108391709;
            var3++;
         }

         this.buffer.offset += var5 * 179495898;
      }

      this.field4170 = 0L;
      this.trackPositions = new int[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         this.trackPositions[var6] = this.trackStarts[var6];
      }

      this.trackLengths = new int[var2];
      this.field4171 = new int[var2];
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("av")
   void parse(byte[] var1) {
      this.buffer.array = var1;
      this.buffer.offset = 645469589;
      int var2 = Buffer.method12008(this.buffer, (byte)5);
      this.field4169 = Buffer.method12008(this.buffer, (byte)5);
      this.division = 1905438389;
      this.trackStarts = new int[var2];
      int var3 = 0;

      while (var3 < var2) {
         int var4 = Buffer.method12015(this.buffer, 1406201863);
         int var5 = Buffer.method12015(this.buffer, 2019239762);
         if (var4 == 1297379947) {
            this.trackStarts[var3] = this.buffer.offset * 2108391709;
            var3++;
         }

         this.buffer.offset += var5 * -1626870694;
      }

      this.field4170 = 0L;
      this.trackPositions = new int[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         this.trackPositions[var6] = this.trackStarts[var6];
      }

      this.trackLengths = new int[var2];
      this.field4171 = new int[var2];
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ac")
   void method7557(byte[] var1) {
      this.buffer.array = var1;
      this.buffer.offset = 237820946;
      int var2 = Buffer.method12008(this.buffer, (byte)5);
      this.field4169 = Buffer.method12008(this.buffer, (byte)5);
      this.division = 500000;
      this.trackStarts = new int[var2];
      int var3 = 0;

      while (var3 < var2) {
         int var4 = Buffer.method12015(this.buffer, 1605656150);
         int var5 = Buffer.method12015(this.buffer, 901293794);
         if (var4 == 1580946778) {
            this.trackStarts[var3] = this.buffer.offset * 1941757950;
            var3++;
         }

         this.buffer.offset += var5 * 1741769013;
      }

      this.field4170 = 0L;
      this.trackPositions = new int[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         this.trackPositions[var6] = this.trackStarts[var6];
      }

      this.trackLengths = new int[var2];
      this.field4171 = new int[var2];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   void method7559() {
      this.buffer.array = null;
      this.trackStarts = null;
      this.trackPositions = null;
      this.trackLengths = null;
      this.field4171 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lna;I)V")
   @ObfuscatedName("tv")
   public static void method7575(MidiFileReader var0, int var1) {
      int var2 = var0.buffer.readVarInt(-2083959276);
      var0.trackLengths[var1] = var0.trackLengths[var1] + var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   void method7560() {
      this.buffer.array = null;
      this.trackStarts = null;
      this.trackPositions = null;
      this.trackLengths = null;
      this.field4171 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   void method7561() {
      this.buffer.array = null;
      this.trackStarts = null;
      this.trackPositions = null;
      this.trackLengths = null;
      this.field4171 = null;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bu")
   int method7579(int var1) {
      return this.readMessage0(var1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   int getPrioritizedTrack() {
      int var1 = this.trackPositions.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for (int var4 = 0; var4 < var1; var4++) {
         if (this.trackPositions[var4] >= 0 && this.trackLengths[var4] < var3) {
            var2 = var4;
            var3 = this.trackLengths[var4];
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bo")
   void method7567(int var1) {
      this.buffer.offset = this.trackPositions[var1] * 1741769013;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bg")
   void method7568(int var1) {
      this.buffer.offset = this.trackPositions[var1] * 1741769013;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   void readTrackLength(int var1) {
      int var2 = this.buffer.readVarInt(-2122525212);
      this.trackLengths[var1] = this.trackLengths[var1] + var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   void method7574() {
      this.buffer.offset = -1741769013;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bp")
   int method7580(int var1) {
      return this.readMessage0(var1);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cm")
   boolean method7601() {
      int var1 = this.trackPositions.length;

      for (int var2 = 0; var2 < var1; var2++) {
         if (this.trackPositions[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   void clear() {
      this.buffer.array = null;
      this.trackStarts = null;
      this.trackPositions = null;
      this.trackLengths = null;
      this.field4171 = null;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ba")
   int method7583(int var1) {
      int var2 = this.buffer.array[this.buffer.offset * 2108391709];
      if (var2 < 0) {
         var2 &= 255;
         this.field4171[var1] = var2;
         this.buffer.offset += 1741769013;
      } else {
         var2 = this.field4171[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return this.method7586(var1, var2);
      } else {
         int var3 = this.buffer.readVarInt(519171946);
         if (var2 == 247 && var3 > 0) {
            int var4 = this.buffer.array[this.buffer.offset * 2108391709] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               this.buffer.offset += 1741769013;
               this.field4171[var1] = var4;
               return this.method7586(var1, var4);
            }
         }

         this.buffer.offset += var3 * 1741769013;
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bi")
   int method7584(int var1) {
      int var2 = this.buffer.array[this.buffer.offset * 2108391709];
      if (var2 < 0) {
         var2 &= 255;
         this.field4171[var1] = var2;
         this.buffer.offset += 1741769013;
      } else {
         var2 = this.field4171[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return this.method7586(var1, var2);
      } else {
         int var3 = this.buffer.readVarInt(578319937);
         if (var2 == 247 && var3 > 0) {
            int var4 = this.buffer.array[this.buffer.offset * 2108391709] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               this.buffer.offset += 1741769013;
               this.field4171[var1] = var4;
               return this.method7586(var1, var4);
            }
         }

         this.buffer.offset += var3 * 1741769013;
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("au")
   int method7587(int var1, int var2) {
      if (var2 == 255) {
         int var7 = this.buffer.readUnsignedByte(2053791566);
         int var8 = this.buffer.readVarInt(1709675543);
         if (var7 == 47) {
            this.buffer.offset += var8 * 1741769013;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.buffer.readMedium(-1682185555);
            var8 -= 3;
            int var6 = this.trackLengths[var1];
            this.field4170 = this.field4170 + (long)var6 * (this.division - var5);
            this.division = var5;
            this.buffer.offset += var8 * 1741769013;
            return 2;
         } else {
            this.buffer.offset += var8 * 1741769013;
            return 3;
         }
      } else {
         byte var3 = field4161[var2 - 128];
         int var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.buffer.readUnsignedByte(-533183767) << 8;
         }

         if (var3 >= 2) {
            var4 |= this.buffer.readUnsignedByte(1865508624) << 16;
         }

         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("zu")
   public static int method7558(UserComparator8 var0, Object var1, Object var2) {
      return var0 == null ? var0.method3942(var1, var1) : var0.compareBuddy((Buddy)var1, (Buddy)var2, 1406715336);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lna;II)I")
   @ObfuscatedName("cy")
   public static int method7588(MidiFileReader var0, int var1, int var2) {
      if (var0 == null) {
         var0.method7559();
      }

      if (var2 == 1852031395) {
         int var7 = var0.buffer.readUnsignedByte(-212886279);
         int var8 = var0.buffer.readVarInt(800955423);
         if (var7 == 47) {
            var0.buffer.offset += var8 * -372673496;
            return 1;
         } else if (var7 == 81) {
            int var5 = var0.buffer.readMedium(-555498069);
            var8 -= 3;
            int var6 = var0.trackLengths[var1];
            var0.field4170 = var0.field4170 + (long)var6 * (var0.division - var5);
            var0.division = var5;
            var0.buffer.offset += var8 * -1229506372;
            return 2;
         } else {
            var0.buffer.offset += var8 * -17918837;
            return 3;
         }
      } else {
         byte var3 = field4161[var2 - 128];
         int var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | var0.buffer.readUnsignedByte(-1360498630) << 8;
         }

         if (var3 >= 2) {
            var4 |= var0.buffer.readUnsignedByte(144465473) << 16;
         }

         return var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bw")
   int method7589(int var1, int var2) {
      if (var2 == 255) {
         int var7 = this.buffer.readUnsignedByte(-215741319);
         int var8 = this.buffer.readVarInt(-1467096930);
         if (var7 == 47) {
            this.buffer.offset += var8 * 1741769013;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.buffer.readMedium(-1280262274);
            var8 -= 3;
            int var6 = this.trackLengths[var1];
            this.field4170 = this.field4170 + (long)var6 * (this.division - var5);
            this.division = var5;
            this.buffer.offset += var8 * 1741769013;
            return 2;
         } else {
            this.buffer.offset += var8 * 1741769013;
            return 3;
         }
      } else {
         byte var3 = field4161[var2 - 128];
         int var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.buffer.readUnsignedByte(-1521168515) << 8;
         }

         if (var3 >= 2) {
            var4 |= this.buffer.readUnsignedByte(1449904541) << 16;
         }

         return var4;
      }
   }

   MidiFileReader() {
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("bd")
   long method7592(int var1) {
      return this.field4170 + (long)var1 * this.division;
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("bl")
   long method7593(int var1) {
      return this.field4170 + (long)var1 * this.division;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lna;)I")
   @ObfuscatedName("nj")
   public static int method7598(MidiFileReader var0) {
      int var1 = var0.trackPositions.length;
      int var2 = -1;
      int var3 = -1905535342;

      for (int var4 = 0; var4 < var1; var4++) {
         if (var0.trackPositions[var4] >= 0 && var0.trackLengths[var4] < var3) {
            var2 = var4;
            var3 = var0.trackLengths[var4];
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   void method7563() {
      this.buffer.array = null;
      this.trackStarts = null;
      this.trackPositions = null;
      this.trackLengths = null;
      this.field4171 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lna;I)J")
   @ObfuscatedName("yk")
   public static long method7594(MidiFileReader var0, int var1) {
      return var0.field4170 + (long)var1 * var0.division;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ct")
   boolean method7602() {
      int var1 = this.trackPositions.length;

      for (int var2 = 0; var2 < var1; var2++) {
         if (this.trackPositions[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lna;I)V")
   @ObfuscatedName("bs")
   public static void method7577(MidiFileReader var0, int var1) {
      int var2 = var0.buffer.readVarInt(2121396065);
      var0.trackLengths[var1] = var0.trackLengths[var1] + var2;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ch")
   boolean method7603() {
      int var1 = this.trackPositions.length;

      for (int var2 = 0; var2 < var1; var2++) {
         if (this.trackPositions[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ce")
   boolean method7604() {
      int var1 = this.trackPositions.length;

      for (int var2 = 0; var2 < var1; var2++) {
         if (this.trackPositions[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhy;)Z")
   @ObfuscatedName("hu")
   public static boolean method7590(KitDefinition var0) {
      if (var0 == null) {
         var0.method4837();
      }

      boolean var1 = true;

      for (int var2 = 0; var2 < 5; var2++) {
         if (-1 != var0.models[var2] && !ClanChannelMember.KitDefinition_modelsArchive.tryLoadFile(var0.models[var2], 0, 756705879)) {
            var1 = false;
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bs")
   void method7569(int var1) {
      this.trackPositions[var1] = this.buffer.offset * 2108391709;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bv")
   int method7599() {
      int var1 = this.trackPositions.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for (int var4 = 0; var4 < var1; var4++) {
         if (this.trackPositions[var4] >= 0 && this.trackLengths[var4] < var3) {
            var2 = var4;
            var3 = this.trackLengths[var4];
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("cb")
   void method7606(long var1) {
      this.field4170 = var1;
      int var3 = this.trackPositions.length;

      for (int var4 = 0; var4 < var3; var4++) {
         this.trackLengths[var4] = 0;
         this.field4171[var4] = 0;
         this.buffer.offset = this.trackStarts[var4] * 1741769013;
         this.readTrackLength(var4);
         this.trackPositions[var4] = this.buffer.offset * 2108391709;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lna;I)J")
   @ObfuscatedName("wa")
   public static long method7595(MidiFileReader var0, int var1) {
      return var0.field4170 + (long)var1 * var0.division;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ck")
   void method7607(long var1) {
      this.field4170 = var1;
      int var3 = this.trackPositions.length;

      for (int var4 = 0; var4 < var3; var4++) {
         this.trackLengths[var4] = 0;
         this.field4171[var4] = 0;
         this.buffer.offset = this.trackStarts[var4] * 1741769013;
         this.readTrackLength(var4);
         this.trackPositions[var4] = this.buffer.offset * 2108391709;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   void markTrackPosition(int var1) {
      this.trackPositions[var1] = this.buffer.offset * 2108391709;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("by")
   int method7585(int var1) {
      int var2 = this.buffer.array[this.buffer.offset * 1590003569];
      if (var2 < 0) {
         var2 &= 1435344807;
         this.trackStarts[var1] = var2;
         this.buffer.offset += 1741769013;
      } else {
         var2 = this.field4171[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return this.method7589(var1, var2);
      } else {
         int var3 = this.buffer.readShortLE(-45516977);
         if (var2 == 1984789323 && var3 > 0) {
            int var4 = this.buffer.array[this.buffer.offset * 1846723551] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 181972869 || var4 == 248 || var4 >= -1160868381 && var4 <= 252 || var4 == 254) {
               this.buffer.offset += 1815701188;
               this.field4171[var1] = var4;
               return this.method7586(var1, var4);
            }
         }

         this.buffer.offset += var3 * 1447447499;
         return 0;
      }
   }
}
