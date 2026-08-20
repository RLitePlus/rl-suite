import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xh")
public final class BZip2State {
   @ObfuscatedName("as")
   int outputLength;
   @ObfuscatedName("af")
   int originalPointer;
   @ObfuscatedName("ag")
   final int field6513;
   @ObfuscatedName("be")
   int[] cftab;
   @ObfuscatedName("ae")
   final int field6502;
   @ObfuscatedName("aj")
   final int field6516;
   @ObfuscatedName("ak")
   final int field6504;
   @ObfuscatedName("ar")
   int bsBuff;
   @ObfuscatedName("bk")
   byte[] ll8;
   @ObfuscatedName("ad")
   byte[] outputArray;
   @ObfuscatedName("bo")
   int nInUse;
   @ObfuscatedName("az")
   int nextBit_unused;
   @ObfuscatedName("al")
   int blockSize100k;
   @ObfuscatedName("ai")
   int next_out;
   @ObfuscatedName("bb")
   int[] getAndMoveToFrontDecode_yy;
   @ObfuscatedName("ac")
   int field6522;
   @ObfuscatedName("ab")
   byte out_char;
   @ObfuscatedName("bz")
   byte[] seqToUnseq;
   @ObfuscatedName("au")
   int nextByte;
   @ObfuscatedName("ah")
   int bsLive;
   @ObfuscatedName("an")
   final int field6501;
   @ObfuscatedName("aa")
   int[] unzftab;
   @ObfuscatedName("am")
   int field6526;
   @ObfuscatedName("ao")
   int su_ch2;
   @ObfuscatedName("ax")
   int su_rNToGo;
   @ObfuscatedName("aq")
   int nblocks_used;
   @ObfuscatedName("bj")
   byte[][] temp_charArray2d;
   @ObfuscatedName("bg")
   boolean[] inUse;
   @ObfuscatedName("aw")
   byte[] selector;
   @ObfuscatedName("bs")
   boolean[] inUse16;
   @ObfuscatedName("ap")
   byte[] selectorMtf;
   @ObfuscatedName("av")
   static int[] BZip2Decompressor_block;
   @ObfuscatedName("ay")
   byte[] inputArray;
   @ObfuscatedName("at")
   final int field6500 = 4096;
   @ObfuscatedName("bm")
   int[][] limit;
   @ObfuscatedName("bp")
   int[][] base;
   @ObfuscatedName("bt")
   int[][] perm;
   @ObfuscatedName("bu")
   int[] minLens;
   @ObfuscatedName("ba")
   int field6533;
   @ToRemove(unused = "true")
   @ObfuscatedName("cl")
   static final int field6535 = 2160;

   BZip2State() {
      this.field6513 = 16;
      this.field6501 = 258;
      this.field6502 = 6;
      this.field6516 = 50;
      this.field6504 = 18002;
      this.seqToUnseq = new byte[18002];
      this.ll8 = new byte[18002];
      this.nextByte = 0;
      this.next_out = 0;
      this.unzftab = new int[256];
      this.cftab = new int[257];
      this.inUse = new boolean[256];
      this.inUse16 = new boolean[16];
      this.inputArray = new byte[256];
      this.selector = new byte[4096];
      this.getAndMoveToFrontDecode_yy = new int[16];
      this.temp_charArray2d = new byte[6][258];
      this.limit = new int[6][258];
      this.base = new int[6][258];
      this.perm = new int[6][258];
      this.minLens = new int[6];
   }
}
