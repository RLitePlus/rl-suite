import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fs")
public class class136 {
   @ObfuscatedName("ai")
   float[][] field1863;
   @ObfuscatedName("av")
   public final int field1849;
   @ObfuscatedSignature(descriptor = "Lfs;")
   @ObfuscatedName("ag")
   public class136 field1857;
   @ObfuscatedSignature(descriptor = "[Lry;")
   @ObfuscatedName("aw")
   TransformationMatrix[] field1852;
   @ObfuscatedName("ae")
   boolean field1848;
   @ObfuscatedName("aj")
   boolean field1847;
   @ObfuscatedSignature(descriptor = "[Lry;")
   @ObfuscatedName("ak")
   TransformationMatrix[] field1851;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("kd")
   static Archive field1858;
   @ObfuscatedSignature(descriptor = "Lry;")
   @ObfuscatedName("ap")
   TransformationMatrix field1859;
   @ObfuscatedSignature(descriptor = "Lry;")
   @ObfuscatedName("ay")
   TransformationMatrix field1861;
   @ObfuscatedSignature(descriptor = "Lry;")
   @ObfuscatedName("au")
   TransformationMatrix field1860;
   @ToRemove(unused = "true")
   @ObfuscatedName("cw")
   static final int field1854 = 91;
   @ObfuscatedName("an")
   float[][] field1864;
   @ObfuscatedName("az")
   float[][] field1865;
   @ObfuscatedName("sb")
   public int field1856;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field1853 = 32;
   @ObfuscatedName("ad")
   float[][] field1862;
   @ObfuscatedSignature(descriptor = "[Lry;")
   @ObfuscatedName("at")
   final TransformationMatrix[] field1850;
   @ObfuscatedName("is")
   static int foundItemIdCount;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("vb")
   public void method4091() {
      method4052(this, 1263041541);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfs;I)Lry;")
   @ObfuscatedName("zh")
   public static TransformationMatrix method4059(class136 var0, int var1) {
      if (var0 == null) {
         var0.method4058(var1);
      }

      if (var0.field1851[var1] == null) {
         var0.field1851[var1] = new TransformationMatrix(var0.method4057(var1, (byte)-10));
         if (null != var0.field1857) {
            TransformationMatrix.method9959(var0.field1851[var1], var0.field1857.method4089(var1, 1900336257), (byte)-35);
         } else {
            TransformationMatrix.method9959(var0.field1851[var1], TransformationMatrix.field5728, (byte)-101);
         }
      }

      return var0.field1851[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)Lry;")
   @ObfuscatedName("ab")
   TransformationMatrix method4060(int var1) {
      if (this.field1851[var1] == null) {
         this.field1851[var1] = new TransformationMatrix(this.method4057(var1, (byte)31));
         if (null != this.field1857) {
            TransformationMatrix.method9959(this.field1851[var1], this.field1857.method4089(var1, -878805019), (byte)-48);
         } else {
            TransformationMatrix.method9959(this.field1851[var1], TransformationMatrix.field5728, (byte)-4);
         }
      }

      return this.field1851[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("sa")
   public float[] method4092(int var1) {
      return this.method4077(var1, (byte)-1);
   }

   @ObfuscatedSignature(descriptor = "()Lry;")
   @ObfuscatedName("bg")
   TransformationMatrix method4071() {
      if (this.field1848) {
         TransformationMatrix.method10012(this.field1861, this.method4087(1161523175), -1716911418);
         if (null != this.field1857) {
            TransformationMatrix.method9959(this.field1861, method4072(this.field1857, -2002225124), (byte)-115);
         }

         this.field1848 = false;
      }

      return this.field1861;
   }

   @ObfuscatedSignature(descriptor = "()Lry;")
   @ObfuscatedName("aq")
   public TransformationMatrix method4065() {
      return this.field1859;
   }

   @ObfuscatedSignature(descriptor = "(II)Lry;")
   @ObfuscatedName("an")
   TransformationMatrix method4089(int var1, int var2) {
      if (this.field1851[var1] == null) {
         TransformationMatrix var3 = this.method4096(var1);
         if (this.field1857 != null) {
            var3 = new TransformationMatrix(var3);
            var3.method10024(this.field1857.method4093(var1));
         }

         this.field1851[var1] = var3;
      }

      return this.field1851[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("bb")
   float[] method4076(int var1) {
      return this.field1865[var1];
   }

   @ObfuscatedSignature(descriptor = "(Lfs;I)V")
   @ObfuscatedName("ji")
   public static void method4052(class136 var0, int var1) {
      if (var0 == null) {
         var0.method4055(var1);
      }

      try {
         var0.field1865 = new float[var0.field1850.length][3];
         var0.field1862 = new float[var0.field1850.length][3];
         var0.field1863 = new float[var0.field1850.length][3];
         TransformationMatrix var2 = SecureUrlRequester.method3893(500591551);

         for (int var3 = 0; var3 < var0.field1850.length; var3++) {
            if (var1 == -17021882) {
               return;
            }

            TransformationMatrix var4 = var0.method4057(var3, (byte)-14);
            TransformationMatrix.method10012(var2, var4, -451304357);
            var2.method9982(-266015735);
            var0.field1865[var3] = var2.method9935(-627470855);
            var0.field1862[var3][0] = var4.field5742;
            var0.field1862[var3][1] = var4.field5737;
            var0.field1862[var3][2] = var4.field5734;
            var0.field1863[var3] = var4.method10008(-1589304907);
         }

         TransformationMatrix.method9929(var2, (byte)1);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "fs.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lry;")
   @ObfuscatedName("ae")
   public TransformationMatrix method4087(int var1) {
      rl1 var2 = rl19.field5583.field5577[this.field1856];
      return var2.field5550;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfs;)V")
   @ObfuscatedName("hm")
   public static void method4053(class136 var0) {
      var0.field1865 = new float[var0.field1850.length][3];
      var0.field1862 = new float[var0.field1850.length][3];
      var0.field1863 = new float[var0.field1850.length][3];
      TransformationMatrix var1 = SecureUrlRequester.method3893(246762126);

      for (int var2 = 0; var2 < var0.field1850.length; var2++) {
         TransformationMatrix var3 = var0.method4057(var2, (byte)-58);
         TransformationMatrix.method10012(var1, var3, -1300270238);
         var1.method9982(1100442139);
         var0.field1865[var2] = var1.method9935(1520418806);
         var0.field1862[var2][0] = var3.field5742;
         var0.field1862[var2][1] = var3.field5737;
         var0.field1862[var2][2] = var3.field5734;
         var0.field1863[var2] = var3.method10008(-804188210);
      }

      TransformationMatrix.method9929(var1, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(Lry;I)V")
   @ObfuscatedName("aj")
   void method4068(TransformationMatrix var1, int var2) {
      try {
         TransformationMatrix.method10012(this.field1859, var1, -1081326446);
         this.field1848 = true;
         this.field1847 = true;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fs.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lry;")
   @ObfuscatedName("aw")
   public TransformationMatrix method4073(int var1, byte var2) {
      try {
         if (this.field1847) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            TransformationMatrix.method10012(this.field1860, this.method4084(var1, 619504460), -811746768);
            TransformationMatrix.method9959(this.field1860, method4072(this, -2026679362), (byte)-34);
            this.field1847 = false;
         }

         return this.field1860;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fs.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lry;")
   @ObfuscatedName("pj")
   public TransformationMatrix method4093(int var1) {
      return this.method4089(var1, -666108368);
   }

   @ObfuscatedSignature(descriptor = "(IB)[F")
   @ObfuscatedName("ap")
   float[] method4077(int var1, byte var2) {
      try {
         return this.field1865[var1];
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fs.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[F")
   @ObfuscatedName("ay")
   float[] method4079(int var1, int var2) {
      try {
         return this.field1862[var1];
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fs.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)[F")
   @ObfuscatedName("au")
   float[] method4080(int var1, byte var2) {
      try {
         return this.field1863[var1];
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fs.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("lz")
   public float[] method4094(int var1) {
      return this.method4079(var1, -1314912615);
   }

   @ObfuscatedSignature(descriptor = "(Lrl19;I)Lry;")
   @ObfuscatedName("up")
   public TransformationMatrix method4086(rl19 var1, int var2) {
      rl1 var3 = var1.field5577[this.field1856];
      if (var3.field5553) {
         var3.field5552.method10020(this.method4098(var2));
         var3.field5552.method10024(this.method4085(var1));
         var3.field5553 = false;
      }

      return var3.field5552;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   void method4054() {
      this.field1865 = new float[this.field1850.length][3];
      this.field1862 = new float[this.field1850.length][3];
      this.field1863 = new float[this.field1850.length][3];
      TransformationMatrix var1 = SecureUrlRequester.method3893(-1106488655);

      for (int var2 = 0; var2 < this.field1850.length; var2++) {
         TransformationMatrix var3 = this.method4057(var2, (byte)-54);
         TransformationMatrix.method10012(var1, var3, -1231199357);
         var1.method9982(9600327);
         this.field1865[var2] = var1.method9935(-743886859);
         this.field1862[var2][0] = var3.field5742;
         this.field1862[var2][1] = var3.field5737;
         this.field1862[var2][2] = var3.field5734;
         this.field1863[var2] = var3.method10008(-1589437319);
      }

      TransformationMatrix.method9929(var1, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(Lry;)V")
   @ObfuscatedName("be")
   void method4069(TransformationMatrix var1) {
      TransformationMatrix.method10012(this.field1859, var1, -885796915);
      this.field1848 = true;
      this.field1847 = true;
   }

   @ObfuscatedSignature(descriptor = "(I)Lry;")
   @ObfuscatedName("as")
   TransformationMatrix method4056(int var1) {
      return this.field1850[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("nr")
   public float[] method4095(int var1) {
      return this.method4080(var1, (byte)29);
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("bj")
   float[] method4081(int var1) {
      return this.field1863[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)Lry;")
   @ObfuscatedName("al")
   TransformationMatrix method4062(int var1) {
      if (this.field1852[var1] == null) {
         this.field1852[var1] = new TransformationMatrix(this.method4089(var1, 303162475));
         this.field1852[var1].method9982(-693936495);
      }

      return this.field1852[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)Lry;")
   @ObfuscatedName("af")
   TransformationMatrix method4063(int var1) {
      if (this.field1852[var1] == null) {
         this.field1852[var1] = new TransformationMatrix(this.method4089(var1, -1426724401));
         this.field1852[var1].method9982(1602147043);
      }

      return this.field1852[var1];
   }

   @ObfuscatedSignature(descriptor = "()Lry;")
   @ObfuscatedName("am")
   public TransformationMatrix method4066() {
      return this.field1859;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("jj")
   public void method4090(int var1) {
      this.field1850[var1] = null;
      this.field1851 = null;
   }

   @ObfuscatedSignature(descriptor = "()Lry;")
   @ObfuscatedName("ao")
   public TransformationMatrix method4067() {
      return this.field1859;
   }

   public class136(int var1, Buffer var2, boolean var3) {
      this.field1848 = this.field1847 = true;
      this.field1849 = var2.method12230() * -1495930121;
      this.field1850 = new TransformationMatrix[var1];
      this.field1851 = new TransformationMatrix[var1];
      this.field1852 = new TransformationMatrix[var1];

      for (int var4 = 0; var4 < var1; var4++) {
         this.field1850[var4] = new TransformationMatrix(var2, var3);
         var2.method12227();
         var2.method12227();
         var2.method12227();
      }

      this.method4091();
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIIIII)V")
   @ObfuscatedName("ki")
   static void method4083(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         NodeDeque var7 = var0.groundItems[var1][var2][var3];
         if (var7 != null) {
            if (var6 <= -341728243) {
               throw new IllegalStateException();
            }

            for (TileItem var8 = (TileItem)var7.last(); var8 != null; var8 = (TileItem)var7.previous()) {
               if (var6 <= -341728243) {
                  throw new IllegalStateException();
               }

               if (var8.visibleTime * 782226465 == var4) {
                  if (var6 <= -341728243) {
                     return;
                  }

                  if (var5 == var8.despawnTime * -1247866467) {
                     if (var6 <= -341728243) {
                        throw new IllegalStateException();
                     }

                     var8.method3044(-1990983405);
                     break;
                  }
               }
            }

            class157.updateItemPile(var1, var2, var3, 1933250272);
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "fs.ki(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lry;")
   @ObfuscatedName("ag")
   TransformationMatrix method4084(int var1, int var2) {
      if (this.field1852[var1] == null) {
         TransformationMatrix var3 = new TransformationMatrix(this.method4093(var1));
         var3.method10035();
         this.field1852[var1] = var3;
      }

      return this.field1852[var1];
   }

   @ObfuscatedSignature(descriptor = "(Lry;)V")
   @ObfuscatedName("bo")
   void method4070(TransformationMatrix var1) {
      TransformationMatrix.method10012(this.field1859, var1, -556519846);
      this.field1848 = true;
      this.field1847 = true;
   }

   @ObfuscatedSignature(descriptor = "(I)Lry;")
   @ObfuscatedName("bs")
   public TransformationMatrix method4074(int var1) {
      if (this.field1847) {
         TransformationMatrix.method10012(this.field1860, this.method4084(var1, 320520989), -1834706392);
         TransformationMatrix.method9959(this.field1860, method4072(this, -1950689686), (byte)-30);
         this.field1847 = false;
      }

      return this.field1860;
   }

   @ObfuscatedSignature(descriptor = "(I)Lry;")
   @ObfuscatedName("bz")
   public TransformationMatrix method4075(int var1) {
      if (this.field1847) {
         TransformationMatrix.method10012(this.field1860, this.method4084(var1, 831218699), -1964541997);
         TransformationMatrix.method9959(this.field1860, method4072(this, -1892258740), (byte)-43);
         this.field1847 = false;
      }

      return this.field1860;
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("bk")
   float[] method4078(int var1) {
      return this.field1865[var1];
   }

   @ObfuscatedSignature(descriptor = "(IB)Lry;")
   @ObfuscatedName("at")
   TransformationMatrix method4057(int var1, byte var2) {
      try {
         return this.field1850[var1];
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fs.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl19;)Lry;")
   @ObfuscatedName("nu")
   public TransformationMatrix method4085(rl19 var1) {
      rl1 var2 = var1.field5577[this.field1856];
      if (var2.field5554) {
         var2.field5551.method10020(var2.field5550);
         if (this.field1857 != null) {
            var2.field5551.method10024(this.field1857.method4085(var1));
         }

         var2.field5554 = false;
      }

      return var2.field5551;
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("bm")
   float[] method4082(int var1) {
      return this.field1863[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)Lry;")
   @ObfuscatedName("ax")
   TransformationMatrix method4061(int var1) {
      if (this.field1851[var1] == null) {
         this.field1851[var1] = new TransformationMatrix(this.method4057(var1, (byte)-3));
         if (null != this.field1857) {
            TransformationMatrix.method9959(this.field1851[var1], this.field1857.method4089(var1, -518258654), (byte)-116);
         } else {
            TransformationMatrix.method9959(this.field1851[var1], TransformationMatrix.field5728, (byte)-17);
         }
      }

      return this.field1851[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)Lry;")
   @ObfuscatedName("ql")
   public TransformationMatrix method4096(int var1) {
      return this.method4057(var1, (byte)-14);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfs;I)Lry;")
   @ObfuscatedName("uv")
   public static TransformationMatrix method4064(class136 var0, int var1) {
      if (var0.field1852[var1] == null) {
         var0.field1852[var1] = new TransformationMatrix(var0.method4089(var1, 1771691248));
         var0.field1852[var1].method9982(-138572297);
      }

      return var0.field1852[var1];
   }

   @ObfuscatedSignature(descriptor = "(Lry;)V")
   @ObfuscatedName("ha")
   public void method4097(TransformationMatrix var1) {
      this.method4068(var1, -1793120611);
   }

   @ObfuscatedSignature(descriptor = "(Lfs;I)Lry;")
   @ObfuscatedName("fg")
   public static TransformationMatrix method4072(class136 var0, int var1) {
      if (var0 == null) {
         return var0.method4088(var1);
      } else {
         try {
            if (var0.field1848) {
               if (var1 >= -1793120611) {
                  throw new IllegalStateException();
               }

               TransformationMatrix.method10012(var0.field1861, var0.method4087(1108940004), -1462325013);
               if (null != var0.field1857) {
                  if (var1 >= -1793120611) {
                     throw new IllegalStateException();
                  }

                  TransformationMatrix.method9959(var0.field1861, method4072(var0.field1857, -2142531196), (byte)-67);
               }

               var0.field1848 = false;
            }

            return var0.field1861;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "fs.ak(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lry;")
   @ObfuscatedName("ak")
   TransformationMatrix method4088(int var1) {
      rl1 var2 = rl19.field5583.field5577[this.field1856];
      return var2.field5551;
   }

   @ObfuscatedSignature(descriptor = "(I)Lry;")
   @ObfuscatedName("ai")
   TransformationMatrix method4058(int var1) {
      return this.field1850[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)Lry;")
   @ObfuscatedName("il")
   public TransformationMatrix method4098(int var1) {
      return this.method4084(var1, 619504460);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   void method4055(int var1) {
      try {
         this.field1864 = new float[this.field1850.length][3];
         this.field1862 = new float[this.field1850.length][3];
         this.field1864 = new float[this.field1850.length][3];
         TransformationMatrix var2 = SecureUrlRequester.method3893(500591551);

         for (int var3 = 0; var3 < this.field1850.length; var3++) {
            if (var1 == -17021882) {
               return;
            }

            TransformationMatrix var4 = this.method4057(var3, (byte)-14);
            TransformationMatrix.method10012(var2, var4, -451304357);
            var2.method9982(-266015735);
            this.field1864[var3] = var2.method9935(-627470855);
            this.field1863[var3][0] = var4.field5734;
            this.field1862[var3][1] = var4.field5725;
            this.field1862[var3][2] = var4.field5743;
            this.field1863[var3] = var4.method9935(-1589304907);
         }

         TransformationMatrix.method9929(var2, (byte)1);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "fs.av(" + ')');
      }
   }
}
