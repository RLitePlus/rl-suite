import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jq")
public class class251 {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final boolean field3151 = false;
   @ObfuscatedSignature(descriptor = "[Lfs;")
   @ObfuscatedName("at")
   class136[] field3149;
   @ObfuscatedName("ag")
   int field3150;
   @ObfuscatedName("ay")
   static int[] Interpreter_intLocals;

   @ObfuscatedSignature(descriptor = "()[Lfs;")
   @ObfuscatedName("ai")
   class136[] method6161() {
      return this.field3149;
   }

   class251(Buffer var1, int var2) {
      this.field3149 = new class136[var2];
      this.field3150 = var1.readUnsignedByte(976294794) * 40192229;

      for (int var3 = 0; var3 < this.field3149.length; var3++) {
         class136 var4 = new class136(-1712769811 * this.field3150, var1, false);
         this.field3149[var3] = var4;
      }

      this.method6153(1725817435);
   }

   @ObfuscatedSignature(descriptor = "(Ljq;I)I")
   @ObfuscatedName("ud")
   public static int method6154(class251 var0, int var1) {
      if (var0 == null) {
         var0.method6158(var1);
      }

      try {
         return var0.field3149.length;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jq.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lfs;")
   @ObfuscatedName("ag")
   public class136 method6159(int var1, int var2) {
      try {
         if (var1 >= method6154(this, 1474315245)) {
            if (var2 != -146335463) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return this.field3149[var1];
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "jq.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Lfs;")
   @ObfuscatedName("an")
   class136[] method6162(int var1) {
      try {
         return this.field3149;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jq.an(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljq;I)Lfs;")
   @ObfuscatedName("yu")
   public static class136 method6160(class251 var0, int var1) {
      if (var0 == null) {
         var0.method6163();
      }

      return var1 >= method6154(var0, 751591957) ? null : var0.field3149[var1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljq;)V")
   @ObfuscatedName("mw")
   public static void method6150(class251 var0) {
      class136[] var1 = var0.field3149;

      for (int var2 = 0; var2 < var1.length; var2++) {
         class136 var3 = var1[var2];
         if (var3.field1849 * -281282873 >= 0) {
            var3.field1857 = var0.field3149[-281282873 * var3.field1849];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfy;IB)V")
   @ObfuscatedName("ae")
   public void method6165(classFY var1, int var2, byte var3) {
      try {
         this.method6172(var1, var2, null, false, -1773435983);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "jq.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfy;I[ZZI)V")
   @ObfuscatedName("aj")
   void method6172(classFY var1, int var2, boolean[] var3, boolean var4, int var5) {
      this.method6171(rl19.field5583, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(Lfy;I)V")
   @ObfuscatedName("ab")
   public void method6166(classFY var1, int var2) {
      this.method6172(var1, var2, null, false, -318035147);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fx")
   public int method6175() {
      return method6154(this, 1305165838);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   public int method6155() {
      return this.field3149.length;
   }

   @ObfuscatedSignature(descriptor = "(Lrl19;Lfy;I[ZZ)V")
   @ObfuscatedName("af")
   public void method6171(rl19 var1, classFY var2, int var3, boolean[] var4, boolean var5) {
      int var6 = var2.field1929 * -157771145;
      int var7 = 0;

      for (class136 var11 : this.field3149) {
         if (var4 == null || var5 == var4[var7]) {
            var2.method4199(var1, var3, var11, var7, var6);
         }

         var7++;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   public int method6156() {
      return this.field3149.length;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("az")
   public int method6157() {
      return this.field3149.length;
   }

   @ObfuscatedSignature(descriptor = "()[Lfs;")
   @ObfuscatedName("as")
   class136[] method6163() {
      return this.field3149;
   }

   @ObfuscatedSignature(descriptor = "(I)Lfs;")
   @ObfuscatedName("ga")
   public class136 method6176(int var1) {
      return this.method6159(var1, -146335463);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   void method6151() {
      class136[] var1 = this.field3149;

      for (int var2 = 0; var2 < var1.length; var2++) {
         class136 var3 = var1[var2];
         if (var3.field1849 * -281282873 >= 0) {
            var3.field1857 = this.field3149[-281282873 * var3.field1849];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hn")
   public void method6173() {
      int var1 = 0;

      while (var1 < this.field3149.length) {
         this.field3149[var1].field1856 = var1++;
      }
   }

   @ObfuscatedSignature(descriptor = "()[Lfs;")
   @ObfuscatedName("ac")
   class136[] method6164() {
      return this.field3149;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljq;)V")
   @ObfuscatedName("eu")
   public static void method6152(class251 var0) {
      class136[] var1 = var0.field3149;

      for (int var2 = 0; var2 < var1.length; var2++) {
         class136 var3 = var1[var2];
         if (var3.field1849 * -1656558379 >= 0) {
            var3.field1857 = var0.field3149[-281282873 * var3.field1849];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfy;I)V")
   @ObfuscatedName("ax")
   public void method6167(classFY var1, int var2) {
      this.method6172(var1, var2, null, false, 1695250438);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   void method6153(int var1) {
      this.method6173();

      try {
         class136[] var2 = this.field3149;

         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var1 == -204531100) {
               return;
            }

            class136 var4 = var2[var3];
            if (var4.field1849 * -281282873 >= 0) {
               if (var1 == -204531100) {
                  return;
               }

               var4.field1857 = this.field3149[-281282873 * var4.field1849];
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "jq.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfy;I[ZZ)V")
   @ObfuscatedName("al")
   void method6168(classFY var1, int var2, boolean[] var3, boolean var4) {
      int var5 = var1.method4165((byte)24);
      int var6 = 0;
      class136[] var7 = this.method6162(842086229);

      for (int var8 = 0; var8 < var7.length; var8++) {
         class136 var9 = var7[var8];
         if (null == var3 || var4 == var3[var6]) {
            var1.method4194(var2, var9, var6, var5, 2094812916);
         }

         var6++;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfy;I[ZZ)V")
   @ObfuscatedName("ah")
   void method6169(classFY var1, int var2, boolean[] var3, boolean var4) {
      int var5 = var1.method4165((byte)101);
      int var6 = 0;
      class136[] var7 = this.method6162(439958877);

      for (int var8 = 0; var8 < var7.length; var8++) {
         class136 var9 = var7[var8];
         if (null == var3 || var4 == var3[var6]) {
            var1.method4194(var2, var9, var6, var5, -1026786020);
         }

         var6++;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfy;I[ZZ)V")
   @ObfuscatedName("ar")
   void method6170(classFY var1, int var2, boolean[] var3, boolean var4) {
      int var5 = var1.method4165((byte)26);
      int var6 = 0;
      class136[] var7 = this.method6162(-617246082);

      for (int var8 = 0; var8 < var7.length; var8++) {
         class136 var9 = var7[var8];
         if (null == var3 || var4 == var3[var6]) {
            var1.method4194(var2, var9, var6, var5, -1170684555);
         }

         var6++;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ox")
   public void method6174() {
      for (int var1 = 0; var1 < this.field3150 * -1712769811; var1++) {
         for (class136 var5 : this.field3149) {
            var5.method4098(var1);
         }
      }

      for (int var6 = 0; var6 < this.field3150 * -1712769811; var6++) {
         for (class136 var10 : this.field3149) {
            var10.method4090(var6);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lwh;")
   @ObfuscatedName("at")
   public static class586 method6149(int var0, int var1) {
      try {
         int var2 = classWR.field6444[var0];
         if (var2 == 1) {
            if (var1 != -1703539756) {
               throw new IllegalStateException();
            } else {
               return class586.field6376;
            }
         } else if (var2 == 2) {
            if (var1 != -1703539756) {
               throw new IllegalStateException();
            } else {
               return class586.field6379;
            }
         } else if (var2 == 3) {
            if (var1 != -1703539756) {
               throw new IllegalStateException();
            } else {
               return class586.field6377;
            }
         } else {
            return null;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "jq.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   public int method6158(int var1) {
      try {
         return this.field3149.length;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "jq.at(" + 41);
      }
   }
}
