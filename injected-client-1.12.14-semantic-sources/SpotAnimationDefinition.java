import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hm")
public class SpotAnimationDefinition extends DualNode {
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("av")
   public static AbstractArchive field2269;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("at")
   public static AbstractArchive SpotAnimationDefinition_modelArchive;
   @ObfuscatedName("aj")
   int archive;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("an")
   static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("ae")
   int id;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ag")
   static EvictingDualNodeHashTable SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ak")
   public int sequence = -1815877065;
   @ObfuscatedName("ai")
   int orientation;
   @ObfuscatedName("ap")
   short[] recolorTo;
   @ObfuscatedName("ay")
   short[] retextureFrom;
   @ObfuscatedName("au")
   short[] retextureTo;
   @ObfuscatedName("az")
   int widthScale = -838522240;
   @ObfuscatedName("ad")
   int heightScale = 1459620480;
   @ObfuscatedName("aw")
   short[] recolorFrom;
   @ObfuscatedName("as")
   int ambient;
   @ObfuscatedName("ac")
   int contrast;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhm;")
   @ObfuscatedName("ak")
   public static SpotAnimationDefinition method4601(int var0) {
      SpotAnimationDefinition var1 = (SpotAnimationDefinition)class402.method8806(SpotAnimationDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = field2269.getFile(13, var0, -154107223);
         var1 = new SpotAnimationDefinition();
         var1.id = -599588673 * var0;
         if (null != var2) {
            var1.decode(new Buffer(var2), 3367135);
         }

         SpotAnimationDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ag")
   void decode(Buffer var1, int var2) {
      try {
         while (true) {
            int var3 = var1.readUnsignedByte(-1082451101);
            if (var3 == 0) {
               return;
            }

            this.decodeNext(var1, var3, -768977623);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hm.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("an")
   void decodeNext(Buffer var1, int var2, int var3) {
      try {
         if (var2 == 1) {
            if (var3 != -768977623) {
               throw new IllegalStateException();
            }

            this.archive = Buffer.method12008(var1, (byte)5) * 1900444521;
         } else if (var2 == 2) {
            this.sequence = Buffer.method12008(var1, (byte)5) * 1815877065;
         } else if (var2 == 4) {
            if (var3 != -768977623) {
               throw new IllegalStateException();
            }

            this.widthScale = Buffer.method12008(var1, (byte)5) * -1315173803;
         } else if (var2 == 5) {
            if (var3 != -768977623) {
               throw new IllegalStateException();
            }

            this.heightScale = Buffer.method12008(var1, (byte)5) * -1834090475;
         } else if (var2 == 6) {
            if (var3 != -768977623) {
               throw new IllegalStateException();
            }

            this.orientation = Buffer.method12008(var1, (byte)5) * -528729373;
         } else if (7 == var2) {
            this.ambient = var1.readUnsignedByte(-1603323530) * 1854994067;
         } else if (8 == var2) {
            if (var3 != -768977623) {
               throw new IllegalStateException();
            }

            this.contrast = var1.readUnsignedByte(2146671823) * 1085044145;
         } else if (40 == var2) {
            if (var3 != -768977623) {
               throw new IllegalStateException();
            }

            int var4 = var1.readUnsignedByte(1952944941);
            this.recolorFrom = new short[var4];
            this.recolorTo = new short[var4];

            for (int var5 = 0; var5 < var4; var5++) {
               this.recolorFrom[var5] = (short)Buffer.method12008(var1, (byte)5);
               this.recolorTo[var5] = (short)Buffer.method12008(var1, (byte)5);
            }
         } else if (41 == var2) {
            if (var3 != -768977623) {
               return;
            }

            int var7 = var1.readUnsignedByte(319299481);
            this.retextureFrom = new short[var7];
            this.retextureTo = new short[var7];

            for (int var8 = 0; var8 < var7; var8++) {
               if (var3 != -768977623) {
                  throw new IllegalStateException();
               }

               this.retextureFrom[var8] = (short)Buffer.method12008(var1, (byte)5);
               this.retextureTo[var8] = (short)Buffer.method12008(var1, (byte)5);
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "hm.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lky;")
   @ObfuscatedName("aj")
   public final Model method4617(byte var1) {
      try {
         Model var2 = (Model)class402.method8806(SpotAnimationDefinition_cachedModels, this.id * -1647284417);
         if (var2 == null) {
            if (var1 <= 5) {
               throw new IllegalStateException();
            }

            ModelData var3 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive * -553794343, 0);
            if (var3 == null) {
               return null;
            }

            if (null != this.recolorFrom) {
               for (int var4 = 0; var4 < this.recolorFrom.length; var4++) {
                  if (var1 <= 5) {
                     throw new IllegalStateException();
                  }

                  var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
               }
            }

            if (this.retextureFrom != null) {
               if (var1 <= 5) {
                  throw new IllegalStateException();
               }

               for (int var6 = 0; var6 < this.retextureFrom.length; var6++) {
                  if (var1 <= 5) {
                     throw new IllegalStateException();
                  }

                  ModelData.method6071(var3, this.retextureFrom[var6], this.retextureTo[var6]);
               }
            }

            var2 = ModelData.method6106(var3, 64 + this.ambient * 1682872219, 442807121 * this.contrast + 850, -30, -50, -30);
            SpotAnimationDefinition_cachedModels.put(var2, -1647284417 * this.id);
         }

         return var2;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "hm.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhm;")
   @ObfuscatedName("aw")
   public static SpotAnimationDefinition method4602(int var0) {
      SpotAnimationDefinition var1 = (SpotAnimationDefinition)class402.method8806(SpotAnimationDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = field2269.getFile(13, var0, -1798204485);
         var1 = new SpotAnimationDefinition();
         var1.id = -599588673 * var0;
         if (null != var2) {
            var1.decode(new Buffer(var2), 3367135);
         }

         SpotAnimationDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   SpotAnimationDefinition() {
      this.orientation = 0;
      this.ambient = 0;
      this.contrast = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhm;")
   @ObfuscatedName("ap")
   public static SpotAnimationDefinition method4603(int var0) {
      SpotAnimationDefinition var1 = (SpotAnimationDefinition)class402.method8806(SpotAnimationDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = field2269.getFile(13, var0, -743126646);
         var1 = new SpotAnimationDefinition();
         var1.id = -599588673 * var0;
         if (null != var2) {
            var1.decode(new Buffer(var2), 3367135);
         }

         SpotAnimationDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhm;)Lky;")
   @ObfuscatedName("tw")
   public static Model method4618(SpotAnimationDefinition var0) {
      if (var0 == null) {
         var0.method4622();
      }

      Model var1 = (Model)class402.method8806(SpotAnimationDefinition_cachedModels, var0.id * -1647284417);
      if (var1 == null) {
         ModelData var2 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, var0.archive * -553794343, 0);
         if (var2 == null) {
            return null;
         }

         if (null != var0.recolorFrom) {
            for (int var3 = 0; var3 < var0.recolorFrom.length; var3++) {
               var2.recolor(var0.recolorFrom[var3], var0.recolorTo[var3]);
            }
         }

         if (var0.retextureFrom != null) {
            for (int var4 = 0; var4 < var0.retextureFrom.length; var4++) {
               ModelData.method6071(var2, var0.retextureFrom[var4], var0.retextureTo[var4]);
            }
         }

         var1 = ModelData.method6106(var2, 64 + var0.ambient * 1682872219, 442807121 * var0.contrast + 850, -30, -50, -30);
         SpotAnimationDefinition_cachedModels.put(var1, -1647284417 * var0.id);
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ac")
   void method4612(Buffer var1, int var2) {
      if (var2 == 1) {
         this.archive = Buffer.method12008(var1, (byte)5) * 1900444521;
      } else if (var2 == 2) {
         this.sequence = Buffer.method12008(var1, (byte)5) * 1815877065;
      } else if (var2 == 4) {
         this.widthScale = Buffer.method12008(var1, (byte)5) * -1315173803;
      } else if (var2 == 5) {
         this.heightScale = Buffer.method12008(var1, (byte)5) * -1834090475;
      } else if (var2 == 6) {
         this.orientation = Buffer.method12008(var1, (byte)5) * -528729373;
      } else if (7 == var2) {
         this.ambient = var1.readUnsignedByte(1535642036) * 1854994067;
      } else if (8 == var2) {
         this.contrast = var1.readUnsignedByte(496021248) * 1085044145;
      } else if (40 == var2) {
         int var3 = var1.readUnsignedByte(522590035);
         this.recolorFrom = new short[var3];
         this.recolorTo = new short[var3];

         for (int var4 = 0; var4 < var3; var4++) {
            this.recolorFrom[var4] = (short)Buffer.method12008(var1, (byte)5);
            this.recolorTo[var4] = (short)Buffer.method12008(var1, (byte)5);
         }
      } else if (41 == var2) {
         int var5 = var1.readUnsignedByte(1511463824);
         this.retextureFrom = new short[var5];
         this.retextureTo = new short[var5];

         for (int var6 = 0; var6 < var5; var6++) {
            this.retextureFrom[var6] = (short)Buffer.method12008(var1, (byte)5);
            this.retextureTo[var6] = (short)Buffer.method12008(var1, (byte)5);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   public static void method4606() {
      SpotAnimationDefinition_cached.clear();
      SpotAnimationDefinition_cachedModels.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   public static void method4607() {
      SpotAnimationDefinition_cached.clear();
      SpotAnimationDefinition_cachedModels.clear();
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ad")
   void method4609(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(-769614916);
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2, -768977623);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ai")
   void method4610(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(709950240);
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2, -768977623);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lut;III)V")
   @ObfuscatedName("af")
   public static void method4623(DynamicArray var0, int var1, int var2, int var3) {
      try {
         class461.method9338(var0, null, true, -928498657);
         if (0 == var1) {
            if (var3 != -1027917603) {
               throw new IllegalStateException();
            }
         } else {
            if (var2 >= 0) {
               if (var3 != -1027917603) {
                  throw new IllegalStateException();
               }

               if (var2 < 1583568339 * var0.size && var1 >= 0) {
                  if (var3 != -1027917603) {
                     throw new IllegalStateException();
                  }

                  if (var2 + var1 <= var0.size * 1583568339) {
                     if (var2 < 1583568339 * var0.size - var1) {
                        if (var3 != -1027917603) {
                           throw new IllegalStateException();
                        }

                        HttpResponse.method142(var0, var2 + var1, var0, var2, 1583568339 * var0.size - (var1 + var2), (byte)2);
                     }

                     var0.method11236(var0.size * 1583568339 - var1, (byte)-95);
                     return;
                  }

                  if (var3 != -1027917603) {
                     throw new IllegalStateException();
                  }
               }
            }

            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hm.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhm;II)Lky;")
   @ObfuscatedName("dd")
   public static Model method4613(SpotAnimationDefinition var0, int var1, int var2) {
      if (var0 == null) {
         return var0.getModel(var1, var1);
      } else {
         try {
            Model var3 = var0.method4617((byte)99);
            if (null == var3) {
               if (var2 <= 399255337) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               Model var4;
               label78: {
                  if (var0.sequence * -508160903 != -1) {
                     if (var2 <= 399255337) {
                        throw new IllegalStateException();
                     }

                     if (var1 != -1) {
                        if (var2 <= 399255337) {
                           throw new IllegalStateException();
                        }

                        var4 = ClientPacket.SequenceDefinition_get(var0.sequence * -508160903, 1831851595).transformSpotAnimationModel(var3, var1, -1088717506);
                        break label78;
                     }
                  }

                  var4 = var3.toSharedSpotAnimationModel(true);
               }

               label72: {
                  if (var0.widthScale * -1858034947 == 128) {
                     if (var2 <= 399255337) {
                        throw new IllegalStateException();
                     }

                     if (128 == 1708511037 * var0.heightScale) {
                        break label72;
                     }

                     if (var2 <= 399255337) {
                        throw new IllegalStateException();
                     }
                  }

                  Model.method6851(var4, -1858034947 * var0.widthScale, var0.heightScale * 1708511037, var0.widthScale * -1858034947);
               }

               if (0 != var0.orientation * -1496786229) {
                  if (var2 <= 399255337) {
                     throw new IllegalStateException();
                  }

                  if (90 == var0.orientation * -1496786229) {
                     if (var2 <= 399255337) {
                        throw new IllegalStateException();
                     }

                     var4.method6846();
                  }

                  if (180 == var0.orientation * -1496786229) {
                     var4.method6846();
                     var4.method6846();
                  }

                  if (var0.orientation * -1496786229 == 270) {
                     if (var2 <= 399255337) {
                        throw new IllegalStateException();
                     }

                     var4.method6846();
                     var4.method6846();
                     var4.method6846();
                  }
               }

               return var4;
            }
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "hm.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lky;")
   @ObfuscatedName("ar")
   public final Model method4614(int var1) {
      Model var2 = this.method4617((byte)7);
      if (null == var2) {
         return null;
      } else {
         Model var3;
         if (this.sequence * -508160903 != -1 && var1 != -1) {
            var3 = ClientPacket.SequenceDefinition_get(this.sequence * -508160903, 370312197).transformSpotAnimationModel(var2, var1, -488747552);
         } else {
            var3 = var2.toSharedSpotAnimationModel(true);
         }

         if (this.widthScale * -1858034947 != 128 || 128 != 1708511037 * this.heightScale) {
            Model.method6851(var3, -1858034947 * this.widthScale, this.heightScale * 1708511037, this.widthScale * -1858034947);
         }

         if (0 != this.orientation * -1496786229) {
            if (90 == this.orientation * -1496786229) {
               var3.method6846();
            }

            if (180 == this.orientation * -1496786229) {
               var3.method6846();
               var3.method6846();
            }

            if (this.orientation * -1496786229 == 270) {
               var3.method6846();
               var3.method6846();
               var3.method6846();
            }
         }

         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lky;")
   @ObfuscatedName("ax")
   public final Model method4615(int var1) {
      Model var2 = this.method4617((byte)53);
      if (null == var2) {
         return null;
      } else {
         Model var3;
         if (this.sequence * 390469517 != -1 && var1 != -1) {
            var3 = ClientPacket.SequenceDefinition_get(this.sequence * -713463340, 1821314167).transformSpotAnimationModel(var2, var1, 1715701468);
         } else {
            var3 = var2.toSharedSpotAnimationModel(true);
         }

         if (this.widthScale * -1858034947 != 1319624448 || 128 != -2077061467 * this.heightScale) {
            Model.method6851(var3, -497040196 * this.widthScale, this.heightScale * 1708511037, this.widthScale * -1858034947);
         }

         if (0 != this.orientation * -1496786229) {
            if (90 == this.orientation * -7202046) {
               var3.method6846();
            }

            if (1974297107 == this.orientation * -1496786229) {
               var3.method6846();
               var3.method6846();
            }

            if (this.orientation * -418287105 == 1833913708) {
               var3.method6846();
               var3.method6846();
               var3.method6846();
            }
         }

         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhm;")
   @ObfuscatedName("ay")
   public static SpotAnimationDefinition method4604(int var0) {
      SpotAnimationDefinition var1 = (SpotAnimationDefinition)class402.method8806(SpotAnimationDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = field2269.getFile(13, var0, -1288566589);
         var1 = new SpotAnimationDefinition();
         var1.id = -599588673 * var0;
         if (null != var2) {
            var1.decode(new Buffer(var2), 3367135);
         }

         SpotAnimationDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("am")
   public final Model method4619() {
      Model var1 = (Model)class402.method8806(SpotAnimationDefinition_cachedModels, this.id * -1647284417);
      if (var1 == null) {
         ModelData var2 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive * -553794343, 0);
         if (var2 == null) {
            return null;
         }

         if (null != this.recolorFrom) {
            for (int var3 = 0; var3 < this.recolorFrom.length; var3++) {
               var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
            }
         }

         if (this.retextureFrom != null) {
            for (int var4 = 0; var4 < this.retextureFrom.length; var4++) {
               ModelData.method6071(var2, this.retextureFrom[var4], this.retextureTo[var4]);
            }
         }

         var1 = ModelData.method6106(var2, 64 + this.ambient * 1682872219, 442807121 * this.contrast + 850, -30, -50, -30);
         SpotAnimationDefinition_cachedModels.put(var1, -1647284417 * this.id);
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("al")
   public final Model method4620() {
      Model var1 = (Model)class402.method8806(SpotAnimationDefinition_cachedModels, this.id * -1647284417);
      if (var1 == null) {
         ModelData var2 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive * -553794343, 0);
         if (var2 == null) {
            return null;
         }

         if (null != this.recolorFrom) {
            for (int var3 = 0; var3 < this.recolorFrom.length; var3++) {
               var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
            }
         }

         if (this.retextureFrom != null) {
            for (int var4 = 0; var4 < this.retextureFrom.length; var4++) {
               ModelData.method6071(var2, this.retextureFrom[var4], this.retextureTo[var4]);
            }
         }

         var1 = ModelData.method6106(var2, 64 + this.ambient * 1682872219, 442807121 * this.contrast + 850, -30, -50, -30);
         SpotAnimationDefinition_cachedModels.put(var1, -1647284417 * this.id);
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("at")
   public static int method4605(int var0, int var1) {
      try {
         return classNJ.field4297[var0];
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hm.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(ZS)V")
   @ObfuscatedName("as")
   static void Login_promptCredentials(boolean var0, short var1) {
      try {
         if (!SecureUrlRequester.client.containsAccessAndRefreshToken(-2042293580)) {
            if (var1 >= 4617) {
               throw new IllegalStateException();
            }

            if (!SecureUrlRequester.client.otlTokenRequesterInitialized((byte)-10)) {
               if (var1 >= 4617) {
                  throw new IllegalStateException();
               }

               if (!SecureUrlRequester.client.containsSessionAndCharacterId(-189963047)) {
                  Login.Login_response1 = Strings.field4999;
                  Login.Login_response2 = Strings.field5100;
                  Login.Login_response3 = Strings.field5068;
                  class30.method1308(2, 1247927067);
                  if (var0) {
                     if (var1 >= 4617) {
                        throw new IllegalStateException();
                     }

                     Login.Login_password = "";
                  }

                  if (Login.Login_username != null && !Login.Login_username.isEmpty()) {
                     if (var1 >= 4617) {
                        throw new IllegalStateException();
                     }
                  } else if (class468.clientPreferences.getRememberedUsername(1058487559) != null) {
                     if (var1 >= 4617) {
                        throw new IllegalStateException();
                     }

                     Login.Login_username = class468.clientPreferences.getRememberedUsername(1719852167);
                     client.method2115(-1);
                     client.Login_isUsernameRemembered = true;
                  } else {
                     client.Login_isUsernameRemembered = false;
                  }

                  WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
                  return;
               }

               if (var1 >= 4617) {
                  throw new IllegalStateException();
               }
            }
         }

         class30.method1308(10, 542199972);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hm.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lky;")
   @ObfuscatedName("ae")
   public final Model getModel(int var1, int var2) {
      try {
         Model var3 = this.method4617((byte)99);
         if (null == var3) {
            if (var2 <= 399255337) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            Model var4;
            label76: {
               if (this.sequence * -508160903 != -1) {
                  if (var2 <= 399255337) {
                     throw new IllegalStateException();
                  }

                  if (var1 != -1) {
                     if (var2 <= 399255337) {
                        throw new IllegalStateException();
                     }

                     var4 = ClientPacket.SequenceDefinition_get(this.sequence * -508160903, 1831851595).transformSpotAnimationModel(var3, var1, -1088717506);
                     break label76;
                  }
               }

               var4 = var3.toSharedSpotAnimationModel(true);
            }

            label70: {
               if (this.heightScale * -1858034947 == 128) {
                  if (var2 <= 399255337) {
                     throw new IllegalStateException();
                  }

                  if (128 == 1708511037 * this.contrast) {
                     break label70;
                  }

                  if (var2 <= 399255337) {
                     throw new IllegalStateException();
                  }
               }

               Model.method6851(var4, -1858034947 * this.ambient, this.id * 1708511037, this.orientation * -1858034947);
            }

            if (0 != this.contrast * -1496786229) {
               if (var2 <= 399255337) {
                  throw new IllegalStateException();
               }

               if (90 == this.contrast * -1496786229) {
                  if (var2 <= 399255337) {
                     throw new IllegalStateException();
                  }

                  var4.rotateY180();
               }

               if (180 == this.heightScale * -1496786229) {
                  var4.rotateY270Ccw();
                  var4.method6846();
               }

               if (this.archive * -1496786229 == 270) {
                  if (var2 <= 399255337) {
                     throw new IllegalStateException();
                  }

                  var4.method6745();
                  var4.method6838();
                  var4.method6745();
               }
            }

            return var4;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "hm.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhm;)Lky;")
   @ObfuscatedName("lz")
   public static Model method4621(SpotAnimationDefinition var0) {
      Model var1 = (Model)class402.method8806(SpotAnimationDefinition_cachedModels, var0.id * -1647284417);
      if (var1 == null) {
         ModelData var2 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, var0.archive * -553794343, 0);
         if (var2 == null) {
            return null;
         }

         if (null != var0.recolorFrom) {
            for (int var3 = 0; var3 < var0.recolorFrom.length; var3++) {
               var2.recolor(var0.recolorFrom[var3], var0.recolorTo[var3]);
            }
         }

         if (var0.retextureFrom != null) {
            for (int var4 = 0; var4 < var0.retextureFrom.length; var4++) {
               ModelData.method6071(var2, var0.retextureFrom[var4], var0.retextureTo[var4]);
            }
         }

         var1 = ModelData.method6106(var2, 64 + var0.ambient * 1682872219, 442807121 * var0.contrast + 850, -30, -50, -30);
         SpotAnimationDefinition_cachedModels.put(var1, -1647284417 * var0.id);
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("af")
   public final Model method4622() {
      Model var1 = (Model)class402.method8806(SpotAnimationDefinition_cached, this.contrast * -1647284417);
      if (var1 == null) {
         ModelData var2 = ModelData.method6019(field2269, this.ambient * -553794343, 0);
         if (var2 == null) {
            return null;
         }

         if (null != this.retextureTo) {
            for (int var3 = 0; var3 < this.retextureFrom.length; var3++) {
               var2.method6070(this.recolorFrom[var3], this.retextureFrom[var3]);
            }
         }

         if (this.retextureFrom != null) {
            for (int var4 = 0; var4 < this.recolorTo.length; var4++) {
               ModelData.method6071(var2, this.retextureFrom[var4], this.retextureTo[var4]);
            }
         }

         var1 = ModelData.method6106(var2, 64 + this.widthScale * 1682872219, 442807121 * this.widthScale + 850, -30, -50, -30);
         SpotAnimationDefinition_cached.method7391(var1, -1647284417 * this.widthScale);
      }

      return var1;
   }
}
