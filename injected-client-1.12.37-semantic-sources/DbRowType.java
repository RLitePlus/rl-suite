import net.runelite.api.dbtable.DBRowConfig;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ze")
public class DbRowType extends classVJ implements DBRowConfig {
   @ObfuscatedName("ax")
   public final int field7173;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field7175 = 255;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ab")
   static AbstractArchive field7177;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field7174 = 15;
   @ObfuscatedName("as")
   final Object[][] field7172;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field7176 = 4;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ag")
   public static EvictingDualNodeHashTable field7171 = new EvictingDualNodeHashTable(64);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("ag")
   public static void method13982(AbstractArchive var0) {
      field7177 = var0;
   }

   @ObfuscatedSignature(descriptor = "(I)[Ljava/lang/Object;")
   @ObfuscatedName("aq")
   public Object[] method13993(int var1) {
      return this.method13989(var1, -1748206208);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("ab")
   public static void method13983(AbstractArchive var0) {
      field7177 = var0;
   }

   @ObfuscatedSignature(descriptor = "(II)[Ljava/lang/Object;")
   @ObfuscatedName("ae")
   public Object[] method13989(int var1, int var2) {
      try {
         if (this.field7172 == null) {
            if (var2 >= -1668547461) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return this.field7172[var1];
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ze.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("as")
   public static void method13984(AbstractArchive var0) {
      field7177 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lze;")
   @ObfuscatedName("ax")
   public static DbRowType method13985(int var0) {
      DbRowType var1 = (DbRowType)field7171.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = field7177.method11867(38, var0, -816950851);
         var1 = new DbRowType(new classXY(var2), var0, -1);
         field7171.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lze;")
   @ObfuscatedName("aa")
   public static DbRowType method13986(int var0) {
      DbRowType var1 = (DbRowType)field7171.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = field7177.method11867(38, var0, -1835031851);
         var1 = new DbRowType(new classXY(var2), var0, -1);
         field7171.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lze;I)[Ljava/lang/Object;")
   @ObfuscatedName("hn")
   public static Object[] method13990(DbRowType var0, int var1) {
      return var0.field7172 == null ? null : var0.field7172[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)[Ljava/lang/Object;")
   @ObfuscatedName("aj")
   public Object[] method13991(int var1) {
      return this.field7172 == null ? null : this.field7172[var1];
   }

   public int getTableID() {
      return this.field7173 * 1026569721;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lze;")
   @ObfuscatedName("ao")
   public static DbRowType method13987(int var0) {
      DbRowType var1 = (DbRowType)field7171.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = field7177.method11867(-1018306527, var0, -866745503);
         var1 = new DbRowType(new classXY(var2), var0, -1);
         field7171.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lze;")
   @ObfuscatedName("ac")
   public static DbRowType method13988(int var0) {
      DbRowType var1 = (DbRowType)field7171.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = field7177.method11867(38, var0, -764903838);
         var1 = new DbRowType(new classXY(var2), var0, -1);
         field7171.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Ljava/lang/Object;")
   @ObfuscatedName("sb")
   public Object[] method13992(int var1) {
      return this.field7172 == null ? null : this.field7172[var1];
   }

   DbRowType(classXY var1, int var2, int var3) {
      Object[][] var4 = (Object[][])null;
      int[][] var5 = (int[][])null;
      int var6 = -1;
      if (var1 != null && var1.field6954 != null) {
         label80:
         while (true) {
            int var7 = classXY.method13039(var1, -346779531);
            switch (var7) {
               case 0:
                  break label80;
               case 1:
               case 2:
               default:
                  break;
               case 3:
                  int var8 = Math.max(classXY.method13039(var1, -346779531), var3);
                  var4 = new Object[var8][];
                  var5 = new int[var8][];

                  for (int var9 = classXY.method13039(var1, -346779531); 255 != var9; var9 = classXY.method13039(var1, -346779531)) {
                     int var10 = classXY.method13039(var1, -346779531);
                     int[] var11 = new int[var10];

                     for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = var1.method13094((short)23116);
                     }

                     int var15 = var1.method13094((short)24730);
                     Object[] var16 = new Object[var15 * var11.length];

                     for (int var17 = 0; var17 < var15; var17++) {
                        for (int var18 = 0; var18 < var11.length; var18++) {
                           int var19 = var17 * var11.length + var18;
                           classYY var20 = FriendsList.method10130(var11[var18], 1994570088);
                           var16[var19] = var20.method13787(var1, 827988912);
                        }
                     }

                     var4[var9] = var16;
                     var5[var9] = var11;
                  }
                  break;
               case 4:
                  var6 = classXY.method13119(var1, -1071170881);
            }
         }
      }

      if (var4 == null && var3 > 0) {
         var4 = new Object[var3][];
         var5 = new int[var3][];
      }

      this.field7172 = var4;
      this.field7173 = 586972233 * var6;
   }
}
