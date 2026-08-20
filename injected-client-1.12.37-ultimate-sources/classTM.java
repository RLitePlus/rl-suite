import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tm")
public class classTM {
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   public static final int field6157 = 11;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field6159 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field6156 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field6163 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field6161 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   public static final int field6155 = 10;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final int field6166 = 31;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field6162 = 34;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field6167 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field6165 = 1024;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   public static final int field6164 = 35;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field6160 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("bc")
   public static final int field6168 = 63;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field6158 = 127;

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("az")
   public static int method10934(int var0, int var1) {
      try {
         if (0 != var0) {
            if (var1 != -973324355) {
               throw new IllegalStateException();
            }

            if (1 != var0) {
               return -1;
            }

            if (var1 != -973324355) {
               throw new IllegalStateException();
            }
         }

         return 0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "tm.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;Llw;I)V")
   @ObfuscatedName("fj")
   static void method10935(classLW var0, classLW var1, int var2) {
      try {
         if (var1 != null) {
            if (var2 != 1238625483) {
               throw new IllegalStateException();
            }

            if (classWK.field6691.method12139(var0, (byte)-89) != null) {
               classJL var3 = classEF.method3849(classJS.IF_BUTTOND, client.field795.field1535, (byte)-72);
               classXY.method13186(var3.field3343, 63131743 * var0.field4260, (byte)16);
               var3.field3343.method12979(var1.field4329 * -1163656551, 118945049);
               var3.field3343.method12973(var1.field4260 * 63131743, -1542382992);
               var3.field3343.method12979(-1163656551 * var0.field4329, -458203294);
               classXY.method13186(var3.field3343, var1.field4319 * 2073671441, (byte)16);
               var3.field3343.method13188(2073671441 * var0.field4319, (short)-25158);
               client.field795.method3367(var3, -1301097035);
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "tm.fj(" + ')');
      }
   }

   protected classTM() throws Throwable {
      throw new Error();
   }
}
