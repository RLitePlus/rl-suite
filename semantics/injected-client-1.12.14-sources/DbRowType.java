import net.runelite.api.dbtable.DBRowConfig;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wi")
public class DbRowType extends DualNode implements DBRowConfig {
   @ObfuscatedName("ae")
   public int tableId = -1072383613;
   @ObfuscatedName("ag")
   Object[][] columnTypes;
   @ObfuscatedName("an")
   int[][] field6387;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field6384 = 21;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("at")
   static EvictingDualNodeHashTable DBRowType_cache = new EvictingDualNodeHashTable(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("du")
   static final int field6386 = 128;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field6385 = 2;

   DbRowType() {
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ar")
   void method11731(Buffer var1, int var2) {
      if (3 == var2) {
         int var3 = var1.readUnsignedByte(-736169025);
         if (null == this.columnTypes) {
            this.columnTypes = new Object[var3][];
            this.field6387 = new int[var3][];
         }

         for (int var4 = var1.readUnsignedByte(664838876); var4 != 255; var4 = var1.readUnsignedByte(-452456850)) {
            int var5 = var1.readUnsignedByte(1929972198);
            int[] var6 = new int[var5];

            for (int var7 = 0; var7 < var5; var7++) {
               var6[var7] = Buffer.method12050(var1, -953688972);
            }

            this.columnTypes[var4] = JagexCache.method4922(var1, var6, -360392137);
            this.field6387[var4] = var6;
         }
      } else if (4 == var2) {
         this.tableId = var1.packBytesToInt(605963712) * 1072383613;
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)[Ljava/lang/Object;")
   @ObfuscatedName("ae")
   public Object[] getColumnType(int var1, byte var2) {
      try {
         if (null == this.columnTypes) {
            if (var2 == 1) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return this.columnTypes[var1];
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "wi.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("aj")
   void method11732(Buffer var1, int var2, int var3) {
      try {
         if (3 == var2) {
            if (var3 != -816355039) {
               throw new IllegalStateException();
            }

            int var4 = var1.readUnsignedByte(567090188);
            if (null == this.columnTypes) {
               if (var3 != -816355039) {
                  return;
               }

               this.columnTypes = new Object[var4][];
               this.field6387 = new int[var4][];
            }

            for (int var5 = var1.readUnsignedByte(956265295); var5 != 255; var5 = var1.readUnsignedByte(1564996684)) {
               if (var3 != -816355039) {
                  throw new IllegalStateException();
               }

               int var6 = var1.readUnsignedByte(967011759);
               int[] var7 = new int[var6];

               for (int var8 = 0; var8 < var6; var8++) {
                  if (var3 != -816355039) {
                     throw new IllegalStateException();
                  }

                  var7[var8] = Buffer.method12050(var1, 119683238);
               }

               this.columnTypes[var5] = JagexCache.method4922(var1, var7, -983926347);
               this.field6387[var5] = var7;
            }
         } else if (4 == var2) {
            if (var3 != -816355039) {
               return;
            }

            this.tableId = var1.packBytesToInt(-967082657) * 1072383613;
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "wi.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("an")
   void method11726(Buffer var1, int var2) {
      try {
         while (true) {
            int var3 = var1.readUnsignedByte(-1459924419);
            if (0 == var3) {
               if (var2 <= 16711680) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.method11732(var1, var3, -816355039);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "wi.an(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("aw")
   public static void method11719(AbstractArchive var0) {
      classGP.field2045 = var0;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("al")
   void method11733(Buffer var1, int var2) {
      if (3 == var2) {
         int var3 = var1.readUnsignedByte(348289420);
         if (null == this.columnTypes) {
            this.columnTypes = new Object[var3][];
            this.field6387 = new int[var3][];
         }

         for (int var4 = var1.readUnsignedByte(666717652); var4 != 255; var4 = var1.readUnsignedByte(-1187123208)) {
            int var5 = var1.readUnsignedByte(1705931044);
            int[] var6 = new int[var5];

            for (int var7 = 0; var7 < var5; var7++) {
               var6[var7] = Buffer.method12050(var1, -632257245);
            }

            this.columnTypes[var4] = JagexCache.method4922(var1, var6, 187874929);
            this.field6387[var4] = var6;
         }
      } else if (4 == var2) {
         this.tableId = var1.packBytesToInt(-657634724) * 1072383613;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("ay")
   public static void method11720(AbstractArchive var0) {
      classGP.field2045 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lwi;")
   @ObfuscatedName("au")
   public static DbRowType method11722(int var0) {
      DbRowType var1 = (DbRowType)class402.method8806(DBRowType_cache, var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classGP.field2045.getFile(-2005198200, var0, 508779355);
         var1 = new DbRowType();
         if (var2 != null) {
            var1.method11726(new Buffer(var2), 316394900);
         }

         var1.method11736((byte)-7);
         DBRowType_cache.put(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("gq")
   public static void method11738(Buffer var0, int var1) {
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(128 - var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   public static void method11725() {
      DBRowType_cache.clear();
   }

   @ObfuscatedSignature(descriptor = "(I)[Ljava/lang/Object;")
   @ObfuscatedName("yo")
   public Object[] method11739(int var1) {
      return this.getColumnType(var1, (byte)16);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lwi;")
   @ObfuscatedName("ad")
   public static DbRowType method11723(int var0) {
      DbRowType var1 = (DbRowType)class402.method8806(DBRowType_cache, var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classGP.field2045.getFile(893361135, var0, 437219304);
         var1 = new DbRowType();
         if (var2 != null) {
            var1.method11726(new Buffer(var2), 416466190);
         }

         var1.method11736((byte)-70);
         DBRowType_cache.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ax")
   void method11734(Buffer var1, int var2) {
      if (3 == var2) {
         int var3 = var1.readUnsignedByte(-308490991);
         if (null == this.columnTypes) {
            this.columnTypes = new Object[var3][];
            this.field6387 = new int[var3][];
         }

         for (int var4 = var1.readUnsignedByte(-1597661436); var4 != 255; var4 = var1.readUnsignedByte(744265526)) {
            int var5 = var1.readUnsignedByte(1089397621);
            int[] var6 = new int[var5];

            for (int var7 = 0; var7 < var5; var7++) {
               var6[var7] = Buffer.method12050(var1, -1080773847);
            }

            this.columnTypes[var4] = JagexCache.method4922(var1, var6, 105584356);
            this.field6387[var4] = var6;
         }
      } else if (4 == var2) {
         this.tableId = var1.packBytesToInt(-204354588) * 1072383613;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ac")
   void method11727(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(1450944974);
         if (0 == var2) {
            return;
         }

         this.method11732(var1, var2, -816355039);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("as")
   void method11728(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(-1379339458);
         if (0 == var2) {
            return;
         }

         this.method11732(var1, var2, -816355039);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Ljava/lang/Object;")
   @ObfuscatedName("ab")
   public Object[] method11730(int var1) {
      return null == this.columnTypes ? null : this.columnTypes[var1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("ap")
   public static void method11721(AbstractArchive var0) {
      classGP.field2045 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lwi;")
   @ObfuscatedName("az")
   public static DbRowType method11724(int var0) {
      DbRowType var1 = (DbRowType)class402.method8806(DBRowType_cache, var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classGP.field2045.getFile(1896191911, var0, -2017788739);
         var1 = new DbRowType();
         if (var2 != null) {
            var1.method11726(new Buffer(var2), 1135117627);
         }

         var1.method11736((byte)-103);
         DBRowType_cache.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ah")
   void method11735(Buffer var1, int var2) {
      if (3 == var2) {
         int var3 = var1.readUnsignedByte(-437344325);
         if (null == this.columnTypes) {
            this.columnTypes = new Object[var3][];
            this.field6387 = new int[var3][];
         }

         for (int var4 = var1.readUnsignedByte(-172622755); var4 != 255; var4 = var1.readUnsignedByte(-1481424167)) {
            int var5 = var1.readUnsignedByte(673924364);
            int[] var6 = new int[var5];

            for (int var7 = 0; var7 < var5; var7++) {
               var6[var7] = Buffer.method12050(var1, 851376037);
            }

            this.columnTypes[var4] = JagexCache.method4922(var1, var6, 375950992);
            this.field6387[var4] = var6;
         }
      } else if (4 == var2) {
         this.tableId = var1.packBytesToInt(27699797) * 1072383613;
      }
   }

   public int getTableID() {
      return this.tableId * -1403723051;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ak")
   void method11736(byte var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "wi.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   void method11737() {
   }
}
