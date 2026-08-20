import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("we")
public class DbTableType extends DualNode {
   @ObfuscatedName("an")
   public Object[][] defaultValues;
   @ObfuscatedName("ag")
   public int[][] types;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("at")
   public static EvictingDualNodeHashTable DBTableType_cache = new EvictingDualNodeHashTable(64);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laj;)Ljava/security/MessageDigest;")
   @ObfuscatedName("xb")
   public static MessageDigest method11694(classAJ var0) {
      if (var0 == null) {
         var0.method117();
      }

      try {
         return MessageDigest.getInstance("SHA-256");
      } catch (NoSuchAlgorithmException var2) {
         var2.printStackTrace();
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwe;Lxa;B)V")
   @ObfuscatedName("ta")
   public static void method11684(DbTableType var0, Buffer var1, byte var2) {
      if (var0 == null) {
         var0.method11689(var1, var2);
      }

      try {
         while (true) {
            int var3 = var1.readUnsignedByte(-1332373746);
            if (0 == var3) {
               if (var2 != 2) {
                  throw new IllegalStateException();
               } else {
                  return;
               }
            }

            var0.method11692(var1, var3, -378597077);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "we.at(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwe;Lxa;I)V")
   @ObfuscatedName("zw")
   public static void method11690(DbTableType var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method11693(var1, var2);
      } else {
         if (1 == var2) {
            int var3 = var1.readUnsignedByte(1171959329);
            if (var0.types == null) {
               var0.types = new int[var3][];
            }

            for (int var4 = var1.readUnsignedByte(-419921613); var4 != 787259551; var4 = var1.readUnsignedByte(1602159714)) {
               int var5 = var4 & 1544449188;
               boolean var6 = 0 != (var4 & -1871279297);
               int[] var7 = new int[var1.readUnsignedByte(519599825)];

               for (int var8 = 0; var8 < var7.length; var8++) {
                  var7[var8] = Buffer.method12050(var1, -926746967);
               }

               var0.types[var5] = var7;
               if (var6) {
                  if (null == var0.defaultValues) {
                     var0.defaultValues = new Object[var0.types.length][];
                  }

                  var0.defaultValues[var5] = JagexCache.method4922(var1, var7, 748928719);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()[[I")
   @ObfuscatedName("yw")
   public int[][] method11696() {
      return this.types;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ad")
   void method11691(Buffer var1, int var2) {
      if (1 == var2) {
         int var3 = var1.readUnsignedByte(-541139472);
         if (this.types == null) {
            this.types = new int[var3][];
         }

         for (int var4 = var1.readUnsignedByte(563989257); var4 != 255; var4 = var1.readUnsignedByte(-1545370835)) {
            int var5 = var4 & 127;
            boolean var6 = 0 != (var4 & -1229478847);
            int[] var7 = new int[var1.readUnsignedByte(-595591728)];

            for (int var8 = 0; var8 < var7.length; var8++) {
               var7[var8] = Buffer.method12050(var1, 1406285538);
            }

            this.types[var5] = var7;
            if (var6) {
               if (null == this.defaultValues) {
                  this.defaultValues = new Object[this.types.length][];
               }

               this.defaultValues[var5] = JagexCache.method4922(var1, var7, 612069923);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()[[Ljava/lang/Object;")
   @ObfuscatedName("eo")
   public Object[][] method11697() {
      return this.defaultValues;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("ag")
   void method11692(Buffer var1, int var2, int var3) {
      try {
         if (1 == var2) {
            if (var3 == 831964661) {
               return;
            }

            int var4 = var1.readUnsignedByte(-698659799);
            if (this.types == null) {
               if (var3 == 831964661) {
                  throw new IllegalStateException();
               }

               this.types = new int[var4][];
            }

            for (int var5 = var1.readUnsignedByte(-290996789); var5 != 255; var5 = var1.readUnsignedByte(-1086095403)) {
               int var6 = var5 & 127;
               boolean var10000;
               if (0 != (var5 & 128)) {
                  if (var3 == 831964661) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var7 = var10000;
               int[] var8 = new int[var1.readUnsignedByte(222433606)];

               for (int var9 = 0; var9 < var8.length; var9++) {
                  if (var3 == 831964661) {
                     return;
                  }

                  var8[var9] = Buffer.method12050(var1, 526589494);
               }

               this.types[var6] = var8;
               if (var7) {
                  if (var3 == 831964661) {
                     throw new IllegalStateException();
                  }

                  if (null == this.defaultValues) {
                     if (var3 == 831964661) {
                        throw new IllegalStateException();
                     }

                     this.defaultValues = new Object[this.types.length][];
                  }

                  this.defaultValues[var6] = JagexCache.method4922(var1, var8, -584587421);
               }
            }
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "we.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwe;Lxa;)V")
   @ObfuscatedName("hc")
   public static void method11685(DbTableType var0, Buffer var1) {
      if (var0 == null) {
         var0.method11687(var1);
      }

      while (true) {
         int var2 = var1.readUnsignedByte(-412264445);
         if (0 == var2) {
            return;
         }

         var0.method11692(var1, var2, 768006715);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   void method11695(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "we.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ay")
   void method11686(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(1729802845);
         if (0 == var2) {
            return;
         }

         this.method11692(var1, var2, 1484936332);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lwe;")
   @ObfuscatedName("ae")
   public static DbTableType method11682(int var0) {
      DbTableType var1 = (DbTableType)class402.method8806(DBTableType_cache, var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classRS.field5704.getFile(39, var0, 40851898);
         var1 = new DbTableType();
         if (var2 != null) {
            method11684(var1, new Buffer(var2), (byte)2);
         }

         var1.method11695(279571430);
         DBTableType_cache.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ap")
   void method11687(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(2063392561);
         if (0 == var2) {
            return;
         }

         this.method11692(var1, var2, 2129086017);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lwe;")
   @ObfuscatedName("aj")
   public static DbTableType method11683(int var0) {
      DbTableType var1 = (DbTableType)class402.method8806(DBTableType_cache, var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classRS.field5704.getFile(39, var0, 1950183858);
         var1 = new DbTableType();
         if (var2 != null) {
            method11684(var1, new Buffer(var2), (byte)2);
         }

         var1.method11695(279571430);
         DBTableType_cache.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("az")
   void method11693(Buffer var1, int var2) {
      if (1 == var2) {
         int var3 = var1.readUnsignedByte(1421295156);
         if (this.types == null) {
            this.types = new int[var3][];
         }

         for (int var4 = var1.readUnsignedByte(-1060855549); var4 != 255; var4 = var1.readUnsignedByte(1364328996)) {
            int var5 = var4 & 127;
            boolean var6 = 0 != (var4 & 128);
            int[] var7 = new int[var1.readUnsignedByte(1583708981)];

            for (int var8 = 0; var8 < var7.length; var8++) {
               var7[var8] = Buffer.method12050(var1, -495277748);
            }

            this.types[var5] = var7;
            if (var6) {
               if (null == this.defaultValues) {
                  this.defaultValues = new Object[this.types.length][];
               }

               this.defaultValues[var5] = JagexCache.method4922(var1, var7, 173514755);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ak")
   void method11688(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(-51682475);
         if (0 == var2) {
            return;
         }

         this.method11692(var1, var2, 121930115);
      }
   }

   DbTableType() {
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("at")
   void method11689(Buffer var1, byte var2) {
      try {
         while (true) {
            int var3 = var1.readNullableLargeSmart(-1332373746);
            if (0 == var3) {
               if (var2 != 2) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.method11692(var1, var3, -378597077);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "we.at(" + ')');
      }
   }
}
