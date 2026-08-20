import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pq")
public class PlayerType implements Enum {
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("an")
   static final PlayerType PlayerType_ironman = new PlayerType(3, 2, false, false, true);
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("at")
   static final PlayerType PlayerType_playerModerator = new PlayerType(1, 0, true, true, true);
   @ObfuscatedName("ah")
   public final boolean isUser;
   @ObfuscatedName("ax")
   public final int modIcon;
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("ae")
   static final PlayerType PlayerType_ultimateIronman = new PlayerType(4, 3, false, false, true);
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("aj")
   static final PlayerType PlayerType_hardcoreIronman = new PlayerType(5, 10, false, false, true);
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("az")
   static final PlayerType field5206 = new PlayerType(11, 45, false, false, true);
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("aw")
   static final PlayerType field5210 = new PlayerType(7, 41, false, false, true);
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("ap")
   static final PlayerType field5211 = new PlayerType(8, 42, false, false, true);
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("ay")
   static final PlayerType field5212 = new PlayerType(9, 43, false, false, true);
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("au")
   static final PlayerType field5209 = new PlayerType(10, 44, false, false, true);
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("ac")
   static final PlayerType field5218 = new PlayerType(15, 49, false, false, true);
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("ad")
   static final PlayerType field5213 = new PlayerType(12, 46, false, false, true);
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("ai")
   static final PlayerType field5216 = new PlayerType(13, 47, false, false, true);
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("as")
   static final PlayerType field5217 = new PlayerType(14, 48, false, false, true);
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("av")
   static final PlayerType PlayerType_normal = new PlayerType(0, -1, true, false, true);
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("ab")
   static final PlayerType field5219 = new PlayerType(16, 52, false, false, true);
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("ak")
   static final PlayerType field5215 = new PlayerType(6, 22, false, false, true);
   @ObfuscatedName("ar")
   public final boolean isPrivileged;
   @ObfuscatedSignature(descriptor = "Lpq;")
   @ObfuscatedName("ag")
   static final PlayerType PlayerType_jagexModerator = new PlayerType(2, 1, true, true, false);
   @ObfuscatedName("al")
   final int id;
   @ToRemove(unused = "true")
   @ObfuscatedName("cu")
   public static final int field5224 = 1009;

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return this.id * 2013458997;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pq.av(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpq;")
   @ObfuscatedName("ak")
   public static PlayerType[] method8782() {
      return new PlayerType[]{
         field5216,
         field5217,
         field5219,
         field5212,
         PlayerType_normal,
         field5213,
         field5211,
         field5210,
         PlayerType_ultimateIronman,
         field5206,
         PlayerType_hardcoreIronman,
         field5209,
         PlayerType_playerModerator,
         field5215,
         PlayerType_jagexModerator,
         field5218,
         PlayerType_ironman
      };
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return this.id * 2013458997;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return this.id * 2013458997;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return this.id * 2013458997;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpq;")
   @ObfuscatedName("ap")
   public static PlayerType[] method8783() {
      return new PlayerType[]{
         field5216,
         field5217,
         field5219,
         field5212,
         PlayerType_normal,
         field5213,
         field5211,
         field5210,
         PlayerType_ultimateIronman,
         field5206,
         PlayerType_hardcoreIronman,
         field5209,
         PlayerType_playerModerator,
         field5215,
         PlayerType_jagexModerator,
         field5218,
         PlayerType_ironman
      };
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpq;")
   @ObfuscatedName("aw")
   public static PlayerType[] method8784() {
      return new PlayerType[]{
         field5216,
         field5217,
         field5219,
         field5212,
         PlayerType_normal,
         field5213,
         field5211,
         field5210,
         PlayerType_ultimateIronman,
         field5206,
         PlayerType_hardcoreIronman,
         field5209,
         PlayerType_playerModerator,
         field5215,
         PlayerType_jagexModerator,
         field5218,
         PlayerType_ironman
      };
   }

   PlayerType(int var1, int var2, boolean var3, boolean var4, boolean var5) {
      this.id = var1 * 726814749;
      this.modIcon = var2 * -612019283;
      this.isPrivileged = var4;
      this.isUser = var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpq;")
   @ObfuscatedName("aj")
   public static PlayerType[] method8785() {
      return new PlayerType[]{
         field5216,
         field5217,
         field5219,
         field5212,
         PlayerType_normal,
         field5213,
         field5211,
         field5210,
         PlayerType_ultimateIronman,
         field5206,
         PlayerType_hardcoreIronman,
         field5209,
         PlayerType_playerModerator,
         field5215,
         PlayerType_jagexModerator,
         field5218,
         PlayerType_ironman
      };
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)Ljava/lang/String;")
   @ObfuscatedName("an")
   static String method8786(Buffer var0, int var1, int var2) {
      try {
         try {
            int var3 = Buffer.method12050(var0, -2079065432);
            if (var3 > var1) {
               if (var2 == 560090080) {
                  throw new IllegalStateException();
               }

               var3 = var1;
            }

            byte[] var4 = new byte[var3];
            var0.offset = var0.offset + class365.huffman.decompress(var0.array, var0.offset * 2108391709, var4, 0, var3, 285570138) * 1741769013;
            return RouteStrategy.decodeStringCp1252(var4, 0, var3, 1895064943);
         } catch (Exception var6) {
            return "Cabbage";
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "pq.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
   @ObfuscatedName("av")
   public static void RunException_sendStackTrace(String var0, Throwable var1, int var2) {
      Throwable var3 = var1;
      if (var1 instanceof RunException && "".equals(var1.getMessage())) {
         var3 = var1.getCause();
      }

      if (var0 == null) {
         client.field938.error("Client error", var3);
      } else {
         client.field938.error("Client error: {}", var0, var3);
      }

      SecureUrlRequester.client.getCallbacks().error(var0, var3);
   }
}
