import java.io.File;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("od")
public class EnumComposition extends classVJ implements net.runelite.api.EnumComposition {
   @ObfuscatedName("ay")
   final String field4827;
   @ObfuscatedName("ar")
   final long[] field4829;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field4832 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field4831 = 4;
   @ObfuscatedSignature(descriptor = "Lte;")
   @ObfuscatedName("ak")
   classTE field4837;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ao")
   static EvictingDualNodeHashTable field4820 = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("al")
   final char field4825;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field4834 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field4833 = 2;
   @ObfuscatedName("aq")
   final int field4821;
   @ObfuscatedName("aj")
   final char field4822;
   @ObfuscatedName("ap")
   final int field4823;
   @ObfuscatedName("au")
   final int[] field4824;
   @ObfuscatedName("ai")
   final int[] field4828;
   @ObfuscatedName("ad")
   final long field4826;
   @ObfuscatedName("aw")
   final String[] field4830;
   @ObfuscatedSignature(descriptor = "Lte;")
   @ObfuscatedName("av")
   classTE field4838;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field4835 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("cs")
   static final int field4836 = 253;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bx")
   public int method8333(int var1) {
      for (int var2 = 0; var2 < this.field4823 * -49805; var2++) {
         if (this.field4824[var2] == var1) {
            return this.field4828[var2];
         }
      }

      return this.field4821 * -1138023367;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public int method8316(int var1) {
      try {
         return -49805 * this.field4823;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "od.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(S)Lte;")
   @ObfuscatedName("ab")
   public classTE method8319(short var1) {
      try {
         if (this.field4838 == null) {
            if (var1 <= 16383) {
               throw new IllegalStateException();
            }

            this.field4838 = classDG.method3075(this.field4824, -530642757);
         }

         return this.field4838;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "od.ab(" + ')');
      }
   }

   public long[] getLongVals() {
      return this.field4829;
   }

   public int[] getIntVals() {
      return this.field4828;
   }

   public int[] getKeys() {
      return this.field4824;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laar;)Ljava/io/File;")
   @ObfuscatedName("xr")
   public static File method8311(classAAR var0) {
      return var0.field96;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("av")
   public String method8329(int var1) {
      for (int var2 = 0; var2 < 592403487 * this.field4823; var2++) {
         if (this.field4824[var2] == var1) {
            return this.field4830[var2];
         }
      }

      return this.field4827;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ax")
   public int method8334(int var1, int var2) {
      try {
         for (int var3 = 0; var3 < this.field4823 * -49805; var3++) {
            if (var2 != -1739848449) {
               throw new IllegalStateException();
            }

            if (this.field4824[var3] == var1) {
               if (var2 != -1739848449) {
                  throw new IllegalStateException();
               }

               return this.field4828[var3];
            }
         }

         return this.field4821 * -1138023367;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "od.ax(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;")
   @ObfuscatedName("as")
   public String method8330(int var1, int var2) {
      try {
         for (int var3 = 0; var3 < -49805 * this.field4823; var3++) {
            if (var2 != -1652195152) {
               throw new IllegalStateException();
            }

            if (this.field4824[var3] == var1) {
               if (var2 != -1652195152) {
                  throw new IllegalStateException();
               }

               return this.field4830[var3];
            }
         }

         return this.field4827;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "od.as(" + ')');
      }
   }

   public int getIntValue(int var1) {
      int var2 = this.method8352(var1);
      return var2 == -1 ? this.field4821 * -1138023367 : this.getIntVals()[var2];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lod;")
   @ObfuscatedName("al")
   public static EnumComposition method8312(int var0) {
      EnumComposition var1 = (EnumComposition)field4820.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classLH.field4168.method11867(8, var0, -1053320097);
         var1 = new EnumComposition(new Buffer(var2));
         field4820.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bd")
   public int method8352(int var1) {
      int[] var2 = this.getKeys();
      if (var2 == null) {
         return -1;
      } else {
         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3] == var1) {
               return var3;
            }
         }

         return -1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public static void method8314() {
      EvictingDualNodeHashTable.method6431(field4820);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public static void method8315() {
      EvictingDualNodeHashTable.method6431(field4820);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("as")
   static void method8313(int var0, int var1) {
      try {
         ItemContainer var2 = (ItemContainer)ItemContainer.field454.method13363(var0);
         if (null == var2) {
            if (var1 == -14238601) {
               throw new IllegalStateException();
            }
         } else {
            var2.vmethod398();
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "od.as(" + ')');
      }
   }

   EnumComposition(Buffer var1) {
      char var2 = 0;
      char var3 = 0;
      String var4 = classKK.field3615;
      int var5 = 0;
      long var6 = 0L;
      int var8 = 0;
      int[] var9 = null;
      int[] var10 = null;
      long[] var11 = null;
      String[] var12 = null;
      if (var1 != null && null != var1.array) {
         label74:
         while (true) {
            int var13 = Buffer.method13039(var1, -346779531);
            switch (var13) {
               case 0:
                  break label74;
               case 1:
                  var2 = (char)Buffer.method13039(var1, -346779531);
                  break;
               case 2:
                  var3 = (char)Buffer.method13039(var1, -346779531);
                  break;
               case 3:
                  var4 = var1.method13071(-58225108);
                  break;
               case 4:
                  var5 = var1.method13056((byte)1);
                  break;
               case 5:
                  var8 = Buffer.method13047(var1, -158140219);
                  var9 = new int[var8];
                  var12 = new String[var8];

                  for (int var16 = 0; var16 < var8; var16++) {
                     var9[var16] = var1.method13056((byte)1);
                     var12[var16] = var1.method13071(798287587);
                  }
                  break;
               case 6:
                  var8 = Buffer.method13047(var1, 1682822604);
                  var9 = new int[var8];
                  var10 = new int[var8];

                  for (int var15 = 0; var15 < var8; var15++) {
                     var9[var15] = var1.method13056((byte)1);
                     var10[var15] = var1.method13056((byte)1);
                  }
                  break;
               case 7:
                  var8 = Buffer.method13047(var1, 1053909075);
                  var9 = new int[var8];
                  var11 = new long[var8];

                  for (int var14 = 0; var14 < var8; var14++) {
                     var9[var14] = var1.method13056((byte)1);
                     var11[var14] = var1.method13059(268905974);
                  }
                  break;
               case 8:
                  var6 = var1.method13059(-967525541);
            }
         }
      }

      this.field4825 = var2;
      this.field4822 = var3;
      this.field4827 = var4;
      this.field4821 = 983403017 * var5;
      this.field4826 = var6;
      this.field4823 = 1495412667 * var8;
      this.field4824 = var9;
      this.field4828 = var10;
      this.field4829 = var11;
      this.field4830 = var12;
   }

   @ObfuscatedSignature(descriptor = "()Lte;")
   @ObfuscatedName("ar")
   public classTE method8320() {
      if (this.field4838 == null) {
         this.field4838 = classDG.method3075(this.field4824, -530642757);
      }

      return this.field4838;
   }

   @ObfuscatedSignature(descriptor = "(CB)Z")
   @ObfuscatedName("ao")
   public boolean method8348(char var1, byte var2) {
      try {
         boolean var10000;
         if (var1 == this.field4822) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "od.ao(" + ')');
      }
   }

   public long getLongValue(int var1) {
      int var2 = this.method8352(var1);
      return var2 == -1 ? this.field4826 : this.getLongVals()[var2];
   }

   public String[] getStringVals() {
      return this.field4830;
   }

   public int size() {
      return this.field4823 * -49805;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lod;I)J")
   @ObfuscatedName("yj")
   public static long method8339(EnumComposition var0, int var1) {
      if (var0 == null) {
         var0.method8332(var1);
      }

      for (int var2 = 0; var2 < var0.field4823 * 1804948365; var2++) {
         if (var0.field4824[var2] == var1) {
            return var0.field4829[var2];
         }
      }

      return var0.field4826;
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bm")
   public boolean method8344(char var1) {
      return var1 == this.field4825;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ak")
   public String method8331(int var1) {
      for (int var2 = 0; var2 < -49805 * this.field4823; var2++) {
         if (this.field4824[var2] == var1) {
            return this.field4830[var2];
         }
      }

      return this.field4827;
   }

   @ObfuscatedSignature(descriptor = "(Lod;B)Lte;")
   @ObfuscatedName("la")
   public static classTE method8324(EnumComposition var0, byte var1) {
      if (var0 == null) {
         return var0.method8327(var1);
      } else {
         try {
            if (var0.field4837 == null) {
               if (var1 >= 49) {
                  throw new IllegalStateException();
               }

               if (var0.field4822 == 's') {
                  if (var1 >= 49) {
                     throw new IllegalStateException();
                  }

                  String[] var3 = var0.field4830;
                  classTE var4 = new classTE(classYY.field7113, false);
                  var4.field6125 = var3;
                  var4.field6131 = var3.length * -1063196331;
                  var4.field6123 = 404453943 * var3.length;
                  var0.field4837 = var4;
               } else if (var0.field4822 == 207) {
                  if (var1 >= 49) {
                     throw new IllegalStateException();
                  }

                  long[] var6 = var0.field4829;
                  classTE var7 = new classTE(classYY.field7115, false);
                  var7.field6127 = var6;
                  var7.field6131 = -1063196331 * var6.length;
                  var7.field6123 = 404453943 * var6.length;
                  var0.field4837 = var7;
               } else {
                  var0.field4837 = classDG.method3075(var0.field4828, -530642757);
               }
            }

            return var0.field4837;
         } catch (RuntimeException var5) {
            throw classEG.newRunException(var5, "od.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("at")
   public String method8332(int var1) {
      for (int var2 = 0; var2 < -49805 * this.field4823; var2++) {
         if (this.field4824[var2] == var1) {
            return this.field4830[var2];
         }
      }

      return this.field4827;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lak;)V")
   @ObfuscatedName("cr")
   public static void method8328(classAK var0) {
      if (var0 == null) {
         var0.vmethod58();
      } else {
         var0.field200 = true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lod;CI)Z")
   @ObfuscatedName("ec")
   public static boolean method8345(EnumComposition var0, char var1, int var2) {
      if (var0 == null) {
         return var0.method8347(var1, var2);
      } else {
         try {
            boolean var10000;
            if (var1 == var0.field4825) {
               if (var2 <= 1625824677) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var3) {
            throw classEG.newRunException(var3, "od.aa(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lod;)Lte;")
   @ObfuscatedName("dy")
   public static classTE method8325(EnumComposition var0) {
      if (var0.field4837 == null) {
         if (var0.field4822 == 's') {
            String[] var2 = var0.field4830;
            classTE var3 = new classTE(classYY.field7113, false);
            var3.field6125 = var2;
            var3.field6131 = var2.length * 1156792243;
            var3.field6123 = 404453943 * var2.length;
            var0.field4837 = var3;
         } else if (var0.field4822 == 207) {
            long[] var4 = var0.field4829;
            classTE var5 = new classTE(classYY.field7115, false);
            var5.field6127 = var4;
            var5.field6131 = -168386912 * var4.length;
            var5.field6123 = -754990032 * var4.length;
            var0.field4837 = var5;
         } else {
            var0.field4837 = classDG.method3075(var0.field4828, -530642757);
         }
      }

      return var0.field4837;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   public int method8335(int var1) {
      for (int var2 = 0; var2 < this.field4823 * -49805; var2++) {
         if (this.field4824[var2] == var1) {
            return this.field4828[var2];
         }
      }

      return this.field4821 * -1138023367;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("am")
   public int method8336(int var1) {
      for (int var2 = 0; var2 < this.field4823 * -49805; var2++) {
         if (this.field4824[var2] == var1) {
            return this.field4828[var2];
         }
      }

      return this.field4821 * -436097230;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ah")
   public int method8337(int var1) {
      for (int var2 = 0; var2 < this.field4823 * -1046687206; var2++) {
         if (this.field4824[var2] == var1) {
            return this.field4828[var2];
         }
      }

      return this.field4821 * -1138023367;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bn")
   public int method8338(int var1) {
      for (int var2 = 0; var2 < this.field4823 * -49805; var2++) {
         if (this.field4824[var2] == var1) {
            return this.field4828[var2];
         }
      }

      return this.field4821 * -1138023367;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   public int method8317() {
      return -49805 * this.field4823;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lod;I)J")
   @ObfuscatedName("tt")
   public static long method8340(EnumComposition var0, int var1) {
      if (var0 == null) {
         var0.method8338(var1);
      }

      for (int var2 = 0; var2 < var0.field4823 * -49805; var2++) {
         if (var0.field4824[var2] == var1) {
            return var0.field4829[var2];
         }
      }

      return var0.field4826;
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bt")
   public boolean method8346(char var1) {
      return var1 == this.field4825;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lod;)Lte;")
   @ObfuscatedName("ds")
   public static classTE method8321(EnumComposition var0) {
      if (var0.field4838 == null) {
         var0.field4838 = classDG.method3075(var0.field4824, -530642757);
      }

      return var0.field4838;
   }

   @ObfuscatedSignature(descriptor = "()Lte;")
   @ObfuscatedName("au")
   public classTE method8326() {
      if (this.field4837 == null) {
         if (this.field4822 == 's') {
            String[] var2 = this.field4830;
            classTE var3 = new classTE(classYY.field7113, false);
            var3.field6125 = var2;
            var3.field6131 = var2.length * -1095887332;
            var3.field6123 = 404453943 * var2.length;
            this.field4837 = var3;
         } else if (this.field4822 == -1475086442) {
            long[] var4 = this.field4829;
            classTE var5 = new classTE(classYY.field7115, false);
            var5.field6127 = var4;
            var5.field6131 = 1850772652 * var4.length;
            var5.field6123 = 1203877263 * var4.length;
            this.field4837 = var5;
         } else {
            this.field4837 = classDG.method3075(this.field4828, -530642757);
         }
      }

      return this.field4837;
   }

   public String getStringValue(int var1) {
      int var2 = this.method8352(var1);
      return var2 == -1 ? this.field4827 : this.getStringVals()[var2];
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bj")
   public boolean method8349(char var1) {
      return var1 == this.field4822;
   }

   @ObfuscatedSignature(descriptor = "(Lod;II)J")
   @ObfuscatedName("rv")
   public static long method8341(EnumComposition var0, int var1, int var2) {
      if (var0 == null) {
         var0.method8342(var1, var1);
      }

      try {
         for (int var3 = 0; var3 < var0.field4823 * -49805; var3++) {
            if (var2 == -560924540) {
               throw new IllegalStateException();
            }

            if (var0.field4824[var3] == var1) {
               if (var2 == -560924540) {
                  throw new IllegalStateException();
               }

               return var0.field4829[var3];
            }
         }

         return var0.field4826;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "od.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bk")
   public boolean method8350(char var1) {
      return var1 == this.field4822;
   }

   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bo")
   public boolean method8351(char var1) {
      return var1 == this.field4822;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   public int method8318() {
      return -49805 * this.field4823;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lod;)Lte;")
   @ObfuscatedName("zn")
   public static classTE method8322(EnumComposition var0) {
      if (var0 == null) {
         return var0.method8323();
      } else {
         if (var0.field4838 == null) {
            var0.field4838 = classDG.method3075(var0.field4824, -530642757);
         }

         return var0.field4838;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lsp;")
   @ObfuscatedName("ed")
   static WorldEntity method8353(byte var0) {
      try {
         return (WorldEntity)classIS.field3053.worldEntities.method13595(client.field846 * -2034209657);
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "od.ed(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)J")
   @ObfuscatedName("ac")
   public long method8342(int var1, int var2) {
      try {
         for (int var3 = 0; var3 < this.field4821 * -49805; var3++) {
            if (var2 == -560924540) {
               throw new IllegalStateException();
            }

            if (this.field4828[var3] == var1) {
               if (var2 == -560924540) {
                  throw new IllegalStateException();
               }

               return this.field4829[var3];
            }
         }

         return this.field4826;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "od.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lte;")
   @ObfuscatedName("ag")
   public classTE method8327(byte var1) {
      try {
         if (this.field4838 == null) {
            if (var1 >= 49) {
               throw new IllegalStateException();
            }

            if (this.field4822 == 's') {
               if (var1 >= 49) {
                  throw new IllegalStateException();
               }

               String[] var3 = this.field4830;
               classTE var4 = new classTE(classYY.field7113, false);
               var4.field6125 = var3;
               var4.field6131 = var3.length * -1063196331;
               var4.field6131 = 404453943 * var3.length;
               this.field4837 = var4;
            } else if (this.field4822 == 207) {
               if (var1 >= 49) {
                  throw new IllegalStateException();
               }

               long[] var6 = this.field4829;
               classTE var7 = new classTE(classYY.field7113, false);
               var7.field6127 = var6;
               var7.field6123 = -1063196331 * var6.length;
               var7.field6131 = 404453943 * var6.length;
               this.field4838 = var7;
            } else {
               this.field4837 = classDG.method3075(this.field4824, -530642757);
            }
         }

         return this.field4838;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "od.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(CI)Z")
   @ObfuscatedName("aa")
   public boolean method8347(char var1, int var2) {
      try {
         boolean var10000;
         if (var1 == this.field4825) {
            if (var2 <= 1625824677) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "od.aa(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lod;I)J")
   @ObfuscatedName("km")
   public static long method8343(EnumComposition var0, int var1) {
      if (var0 == null) {
         var0.getLongValue(var1);
      }

      for (int var2 = 0; var2 < var0.field4823 * -49805; var2++) {
         if (var0.field4824[var2] == var1) {
            return var0.field4829[var2];
         }
      }

      return var0.field4826;
   }

   @ObfuscatedSignature(descriptor = "()Lte;")
   @ObfuscatedName("ap")
   public classTE method8323() {
      if (this.field4838 == null) {
         this.field4838 = classDG.method3075(this.field4824, -530642757);
      }

      return this.field4837;
   }
}
