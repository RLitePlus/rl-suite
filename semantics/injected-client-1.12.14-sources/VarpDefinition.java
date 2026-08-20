import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hw")
public class VarpDefinition extends DualNode {
   @ObfuscatedName("aj")
   public int type = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field2410 = 0;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ae")
   public static EvictingDualNodeHashTable VarpDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("an")
   static AbstractArchive VarpDefinition_archive;
   @ObfuscatedName("ag")
   public static int field2407;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2409 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field2408 = 11;
   @ObfuscatedName("bu")
   static int field2411;

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("az")
   void method4793(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(-1192270141);
         if (var2 == 0) {
            method4803(this, (byte)65);
            return;
         }

         this.decodeNext(var1, var2, -1778326048);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;S)V")
   @ObfuscatedName("ag")
   void decode(Buffer var1, short var2) {
      try {
         while (true) {
            int var3 = var1.readUnsignedByte(-582432189);
            if (var3 == 0) {
               if (var2 == 177) {
                  throw new IllegalStateException();
               }

               method4803(this, (byte)65);
               return;
            }

            this.decodeNext(var1, var3, -1778326048);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hw.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhw;")
   @ObfuscatedName("ak")
   public static VarpDefinition method4791(int var0) {
      VarpDefinition var1 = (VarpDefinition)class402.method8806(VarpDefinition_cached, var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = VarpDefinition_archive.getFile(16, var0, 78616468);
         var1 = new VarpDefinition();
         if (null != var2) {
            var1.decode(new Buffer(var2), (short)-7801);
         }

         VarpDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhw;Lxa;)V")
   @ObfuscatedName("eg")
   public static void method4795(VarpDefinition var0, Buffer var1) {
      if (var0 == null) {
         var0.method4802();
      } else {
         while (true) {
            int var2 = var1.readUnsignedByte(1217398463);
            if (var2 == 0) {
               method4803(var0, (byte)65);
               return;
            }

            var0.decodeNext(var1, var2, -1778326048);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ai")
   void method4799(Buffer var1, int var2) {
      if (var2 == 5) {
         this.type = Buffer.method12008(var1, (byte)5) * -802477767;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("aj")
   public static void method4790(AbstractArchive var0) {
      VarpDefinition_archive = var0;
      field2407 = AbstractArchive.method9046(VarpDefinition_archive, 16, (byte)-44) * -881101544;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhw;")
   @ObfuscatedName("aw")
   public static VarpDefinition method4792(int var0) {
      VarpDefinition var1 = (VarpDefinition)class402.method8806(VarpDefinition_cached, var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = VarpDefinition_archive.getFile(16, var0, -1133392267);
         var1 = new VarpDefinition();
         if (null != var2) {
            var1.decode(new Buffer(var2), (short)1714);
         }

         VarpDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("an")
   void decodeNext(Buffer var1, int var2, int var3) {
      try {
         if (var2 == 5) {
            if (var3 != -1778326048) {
               return;
            }

            this.type = Buffer.method12008(var1, (byte)5) * -802477767;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hw.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ay")
   void method4796(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(258740171);
         if (var2 == 0) {
            method4803(this, (byte)65);
            return;
         }

         this.decodeNext(var1, var2, -1778326048);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("au")
   void method4797(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(118953247);
         if (var2 == 0) {
            method4803(this, (byte)65);
            return;
         }

         this.decodeNext(var1, var2, -1778326048);
      }
   }

   VarpDefinition() {
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ad")
   void method4798(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(-404544343);
         if (var2 == 0) {
            method4803(this, (byte)65);
            return;
         }

         this.decodeNext(var1, var2, -1778326048);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   void method4801() {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   void method4802() {
   }

   @ObfuscatedSignature(descriptor = "(Lut;IB)V")
   @ObfuscatedName("ay")
   public static void method4805(DynamicArray var0, int var1, byte var2) {
      try {
         class461.method9338(var0, null, true, -928498657);
         int var3 = var0.method11215((byte)34);
         if (var3 > 1) {
            var1 %= var3;
            if (var1 == 0) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }
            } else {
               if (var1 < 0) {
                  var1 += var3;
               }

               if (class586.field6376 == var0.field6107) {
                  if (var2 <= 1) {
                     return;
                  }

                  int[] var4 = var0.method11207(2053374425);
                  LoginScreenAnimation.method1352(var4, 0, var3 - 1, (byte)-40);
                  LoginScreenAnimation.method1352(var4, 0, var1 - 1, (byte)46);
                  LoginScreenAnimation.method1352(var4, var1, var3 - 1, (byte)-25);
               } else if (class586.field6377 == var0.field6107) {
                  if (var2 <= 1) {
                     throw new IllegalStateException();
                  }

                  long[] var7 = DynamicArray.method11211(var0, (byte)114);
                  HttpResponse.method141(var7, 0, var3 - 1, 917351200);
                  HttpResponse.method141(var7, 0, var1 - 1, -1139737807);
                  HttpResponse.method141(var7, var1, var3 - 1, 1470091641);
               } else {
                  Object[] var8 = var0.method11214((byte)45);
                  classFM.method4029(var8, 0, var3 - 1, 2108391709);
                  classFM.method4029(var8, 0, var1 - 1, 2108391709);
                  classFM.method4029(var8, var1, var3 - 1, 2108391709);
               }
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "hw.ay(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljm;)V")
   @ObfuscatedName("zt")
   public static void method4806(ModelData var0) {
      if (var0 == null) {
         var0.method6057();
      }

      for (int var1 = 0; var1 < var0.verticesCount; var1++) {
         int var2 = (int)var0.field3096[var1];
         var0.field3096[var1] = var0.field3101[var1];
         var0.field3101[var1] = -var2;
      }

      var0.method6087();
   }

   @ObfuscatedSignature(descriptor = "(Lhw;B)V")
   @ObfuscatedName("qf")
   public static void method4803(VarpDefinition var0, byte var1) {
      if (var0 == null) {
         var0.method4804(var1);
      }

      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hw.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ae")
   void method4804(byte var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hw.ae(" + ')');
      }
   }
}
