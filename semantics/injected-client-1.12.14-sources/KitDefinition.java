import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hy")
public class KitDefinition extends DualNode {
   @ToRemove(unused = "true")
   @ObfuscatedName("br")
   static final int field2423 = 122;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2421 = 1;
   @ObfuscatedName("ai")
   public boolean nonSelectable;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("ae")
   public static AbstractArchive KitDefinition_archive;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ak")
   public static EvictingDualNodeHashTable KitDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("aw")
   int[] models2;
   @ObfuscatedName("ap")
   short[] recolorFrom;
   @ObfuscatedName("ay")
   short[] recolorTo;
   @ObfuscatedName("au")
   short[] retextureFrom;
   @ObfuscatedName("az")
   short[] retextureTo;
   @ObfuscatedName("ad")
   int[] models = new int[]{-1, -1, -1, -1, -1};
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field2420 = 7;
   @ObfuscatedName("as")
   int bodypartID;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field2422 = 0;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhy;")
   @ObfuscatedName("au")
   public static KitDefinition method4818(int var0) {
      KitDefinition var1 = (KitDefinition)class402.method8806(KitDefinition_cached, var0);
      if (null != var1) {
         return var1;
      } else if (KitDefinition_archive == null) {
         return null;
      } else {
         byte[] var2 = KitDefinition_archive.getFile(3, var0, 1484167843);
         var1 = new KitDefinition();
         if (null != var2) {
            var1.decode(new Buffer(var2), 10387054);
         }

         KitDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("at")
   void decode(Buffer var1, int var2) {
      try {
         while (true) {
            int var3 = var1.readUnsignedByte(1780053824);
            if (0 == var3) {
               if (var2 <= -92117231) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.decodeNext(var1, var3, 1518553920);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hy.at(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhy;Lxa;I)V")
   @ObfuscatedName("rx")
   public static void method4825(KitDefinition var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method4829(var1, var2);
      }

      if (1 == var2) {
         var0.bodypartID = var1.readUnsignedByte(-860355997) * -10376639;
      } else if (var2 == 2) {
         int var3 = var1.readUnsignedByte(298710472);
         var0.models2 = new int[var3];

         for (int var4 = 0; var4 < var3; var4++) {
            var0.models2[var4] = Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 == 3) {
         var0.nonSelectable = true;
      } else if (var2 == 40) {
         int var5 = var1.readUnsignedByte(-167648384);
         var0.recolorFrom = new short[var5];
         var0.recolorTo = new short[var5];

         for (int var7 = 0; var7 < var5; var7++) {
            var0.recolorFrom[var7] = (short)Buffer.method12008(var1, (byte)5);
            var0.recolorTo[var7] = (short)Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 == 41) {
         int var6 = var1.readUnsignedByte(-1108308826);
         var0.retextureFrom = new short[var6];
         var0.retextureTo = new short[var6];

         for (int var8 = 0; var8 < var6; var8++) {
            var0.retextureFrom[var8] = (short)Buffer.method12008(var1, (byte)5);
            var0.retextureTo[var8] = (short)Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 >= 60 && var2 < 70) {
         var0.models[var2 - 60] = Buffer.method12008(var1, (byte)5);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("ag")
   void decodeNext(Buffer var1, int var2, int var3) {
      try {
         if (1 == var2) {
            if (var3 <= 767905562) {
               throw new IllegalStateException();
            }

            this.bodypartID = var1.readUnsignedByte(-1202287944) * -10376639;
         } else if (var2 == 2) {
            if (var3 <= 767905562) {
               return;
            }

            int var4 = var1.readUnsignedByte(-1058538897);
            this.models2 = new int[var4];

            for (int var5 = 0; var5 < var4; var5++) {
               if (var3 <= 767905562) {
                  throw new IllegalStateException();
               }

               this.models2[var5] = Buffer.method12008(var1, (byte)5);
            }
         } else if (var2 == 3) {
            if (var3 <= 767905562) {
               throw new IllegalStateException();
            }

            this.nonSelectable = true;
         } else if (var2 == 40) {
            if (var3 <= 767905562) {
               throw new IllegalStateException();
            }

            int var7 = var1.readUnsignedByte(-918416473);
            this.recolorFrom = new short[var7];
            this.recolorTo = new short[var7];

            for (int var9 = 0; var9 < var7; var9++) {
               this.recolorFrom[var9] = (short)Buffer.method12008(var1, (byte)5);
               this.recolorTo[var9] = (short)Buffer.method12008(var1, (byte)5);
            }
         } else if (var2 == 41) {
            if (var3 <= 767905562) {
               return;
            }

            int var8 = var1.readUnsignedByte(-2623900);
            this.retextureFrom = new short[var8];
            this.retextureTo = new short[var8];

            for (int var10 = 0; var10 < var8; var10++) {
               if (var3 <= 767905562) {
                  throw new IllegalStateException();
               }

               this.retextureFrom[var10] = (short)Buffer.method12008(var1, (byte)5);
               this.retextureTo[var10] = (short)Buffer.method12008(var1, (byte)5);
            }
         } else if (var2 >= 60) {
            if (var3 <= 767905562) {
               return;
            }

            if (var2 < 70) {
               this.models[var2 - 60] = Buffer.method12008(var1, (byte)5);
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "hy.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhy;II)Z")
   @ObfuscatedName("dz")
   public static boolean method4830(KitDefinition var0, int var1, int var2) {
      if (var0 == null) {
         var0.method4836();
      }

      return var2 == 1 ? 7 + var1 == 1035634027 * var0.bodypartID : var1 == var0.bodypartID * 1953719745;
   }

   @ObfuscatedSignature(descriptor = "(IIB)Z")
   @ObfuscatedName("an")
   public boolean method4831(int var1, int var2, byte var3) {
      try {
         if (var2 == 1) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               boolean var5;
               if (7 + var1 == 1953719745 * this.bodypartID) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var5 = true;
               } else {
                  var5 = false;
               }

               return var5;
            }
         } else {
            boolean var10000;
            if (var1 == this.bodypartID * 1953719745) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hy.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhy;I)Ljm;")
   @ObfuscatedName("fm")
   public static ModelData method4835(KitDefinition var0, int var1) {
      if (var0 == null) {
         return var0.getModelData(var1);
      } else {
         try {
            if (var0.models2 == null) {
               if (var1 >= 1102186593) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               ModelData[] var2 = new ModelData[var0.models2.length];

               for (int var3 = 0; var3 < var0.models2.length; var3++) {
                  if (var1 >= 1102186593) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = ModelData.ModelData_get(ClanChannelMember.KitDefinition_modelsArchive, var0.models2[var3], 0);
               }

               ModelData var6;
               if (1 == var2.length) {
                  if (var1 >= 1102186593) {
                     throw new IllegalStateException();
                  }

                  var6 = var2[0];
               } else {
                  var6 = new ModelData(var2, var2.length);
               }

               if (var0.recolorFrom != null) {
                  if (var1 >= 1102186593) {
                     throw new IllegalStateException();
                  }

                  for (int var4 = 0; var4 < var0.recolorFrom.length; var4++) {
                     if (var1 >= 1102186593) {
                        throw new IllegalStateException();
                     }

                     var6.recolor(var0.recolorFrom[var4], var0.recolorTo[var4]);
                  }
               }

               if (var0.retextureFrom != null) {
                  if (var1 >= 1102186593) {
                     throw new IllegalStateException();
                  }

                  for (int var7 = 0; var7 < var0.retextureFrom.length; var7++) {
                     if (var1 >= 1102186593) {
                        throw new IllegalStateException();
                     }

                     ModelData.method6071(var6, var0.retextureFrom[var7], var0.retextureTo[var7]);
                  }
               }

               return var6;
            }
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "hy.aj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ae")
   public boolean ready(int var1) {
      try {
         if (null == this.models2) {
            if (var1 >= -884222249) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var2 = true;

            for (int var3 = 0; var3 < this.models2.length; var3++) {
               if (var1 >= -884222249) {
                  throw new IllegalStateException();
               }

               if (!ClanChannelMember.KitDefinition_modelsArchive.tryLoadFile(this.models2[var3], 0, 756705879)) {
                  if (var1 >= -884222249) {
                     throw new IllegalStateException();
                  }

                  var2 = false;
               }
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hy.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ab")
   void method4827(Buffer var1, int var2) {
      if (1 == var2) {
         this.bodypartID = var1.readUnsignedByte(-314467643) * -10376639;
      } else if (var2 == 2) {
         int var3 = var1.readUnsignedByte(-287134646);
         this.models2 = new int[var3];

         for (int var4 = 0; var4 < var3; var4++) {
            this.models2[var4] = Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 == 3) {
         this.nonSelectable = true;
      } else if (var2 == 40) {
         int var5 = var1.readUnsignedByte(-1017723455);
         this.recolorFrom = new short[var5];
         this.recolorTo = new short[var5];

         for (int var7 = 0; var7 < var5; var7++) {
            this.recolorFrom[var7] = (short)Buffer.method12008(var1, (byte)5);
            this.recolorTo[var7] = (short)Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 == 41) {
         int var6 = var1.readUnsignedByte(122906893);
         this.retextureFrom = new short[var6];
         this.retextureTo = new short[var6];

         for (int var8 = 0; var8 < var6; var8++) {
            this.retextureFrom[var8] = (short)Buffer.method12008(var1, (byte)5);
            this.retextureTo[var8] = (short)Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 >= 60 && var2 < 70) {
         this.models[var2 - 60] = Buffer.method12008(var1, (byte)5);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljm;")
   @ObfuscatedName("af")
   public ModelData method4836() {
      if (this.models2 == null) {
         return null;
      } else {
         ModelData[] var1 = new ModelData[this.models2.length];

         for (int var2 = 0; var2 < this.models2.length; var2++) {
            var1[var2] = ModelData.ModelData_get(ClanChannelMember.KitDefinition_modelsArchive, this.models2[var2], 0);
         }

         ModelData var4;
         if (1 == var1.length) {
            var4 = var1[0];
         } else {
            var4 = new ModelData(var1, var1.length);
         }

         if (this.recolorFrom != null) {
            for (int var3 = 0; var3 < this.recolorFrom.length; var3++) {
               var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
            }
         }

         if (this.retextureFrom != null) {
            for (int var5 = 0; var5 < this.retextureFrom.length; var5++) {
               ModelData.method6071(var4, this.retextureFrom[var5], this.retextureTo[var5]);
            }
         }

         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhy;")
   @ObfuscatedName("ap")
   public static KitDefinition method4819(int var0) {
      KitDefinition var1 = (KitDefinition)class402.method8806(KitDefinition_cached, var0);
      if (null != var1) {
         return var1;
      } else if (KitDefinition_archive == null) {
         return null;
      } else {
         byte[] var2 = KitDefinition_archive.getFile(3, var0, -1264877768);
         var1 = new KitDefinition();
         if (null != var2) {
            var1.decode(new Buffer(var2), 659043276);
         }

         KitDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhy;")
   @ObfuscatedName("ay")
   public static KitDefinition method4820(int var0) {
      KitDefinition var1 = (KitDefinition)class402.method8806(KitDefinition_cached, var0);
      if (null != var1) {
         return var1;
      } else if (KitDefinition_archive == null) {
         return null;
      } else {
         byte[] var2 = KitDefinition_archive.getFile(3, var0, -1463995182);
         var1 = new KitDefinition();
         if (null != var2) {
            var1.decode(new Buffer(var2), 1581137553);
         }

         KitDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("as")
   void method4828(Buffer var1, int var2) {
      if (1 == var2) {
         this.bodypartID = var1.readUnsignedByte(-465422510) * -10376639;
      } else if (var2 == 2) {
         int var3 = var1.readUnsignedByte(-1048557753);
         this.models2 = new int[var3];

         for (int var4 = 0; var4 < var3; var4++) {
            this.models2[var4] = Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 == 3) {
         this.nonSelectable = true;
      } else if (var2 == 40) {
         int var5 = var1.readUnsignedByte(1801220242);
         this.recolorFrom = new short[var5];
         this.recolorTo = new short[var5];

         for (int var7 = 0; var7 < var5; var7++) {
            this.recolorFrom[var7] = (short)Buffer.method12008(var1, (byte)5);
            this.recolorTo[var7] = (short)Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 == 41) {
         int var6 = var1.readUnsignedByte(859703538);
         this.retextureFrom = new short[var6];
         this.retextureTo = new short[var6];

         for (int var8 = 0; var8 < var6; var8++) {
            this.retextureFrom[var8] = (short)Buffer.method12008(var1, (byte)5);
            this.retextureTo[var8] = (short)Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 >= 60 && var2 < 70) {
         this.models[var2 - 60] = Buffer.method12008(var1, (byte)5);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("az")
   void method4823(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(-1287166747);
         if (0 == var2) {
            return;
         }

         this.decodeNext(var1, var2, 1652620868);
      }
   }

   KitDefinition() {
      this.nonSelectable = false;
      this.bodypartID = 10376639;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/ArrayList;IIIIB)V")
   @ObfuscatedName("ip")
   static void playSong(ArrayList var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         if (!var0.isEmpty()) {
            int var6 = (Integer)var0.get(0);
            if (var6 == -1) {
               if (var5 == 1) {
                  return;
               }

               if (!client.playingJingle) {
                  classGK.method4244(0, 0, 976721852);
                  return;
               }
            }

            if (var6 != -1) {
               if (var5 == 1) {
                  return;
               }

               boolean var7;
               if (!class345.field4309.isEmpty()) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  }

                  boolean var10000;
                  label78: {
                     MidiRequest var8 = (MidiRequest)class345.field4309.get(0);
                     if (var8 != null) {
                        if (var5 == 1) {
                           throw new IllegalStateException();
                        }

                        if (var8.musicTrackGroupId * -1778393937 == var6) {
                           var10000 = true;
                           break label78;
                        }
                     }

                     var10000 = false;
                  }

                  var7 = var10000;
               } else {
                  var7 = false;
               }

               if (!var7) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  }

                  if (class468.clientPreferences.getMusicVolume((byte)6) != 0) {
                     if (var5 == 1) {
                        throw new IllegalStateException();
                     }

                     ArrayList var11 = new ArrayList();

                     for (int var9 = 0; var9 < var0.size(); var9++) {
                        if (var5 == 1) {
                           throw new IllegalStateException();
                        }

                        var11.add(
                           new MidiRequest(
                              GrandExchangeOfferOwnWorldComparator.field422,
                              (Integer)var0.get(var9),
                              0,
                              class468.clientPreferences.getMusicVolume((byte)6),
                              false
                           )
                        );
                     }

                     if (client.playingJingle) {
                        if (var5 == 1) {
                           throw new IllegalStateException();
                        }

                        class345.field4309.clear();
                        class345.field4309.addAll(var11);
                        ItemLayer.method5389(var1, var2, var3, var4, -1231331929);
                     } else {
                        class113.method3918(var11, var1, var2, var3, var4, false, -1882065613);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "hy.ip(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ac")
   void method4829(Buffer var1, int var2) {
      if (1 == var2) {
         this.bodypartID = var1.readUnsignedByte(-958136833) * -10376639;
      } else if (var2 == 2) {
         int var3 = var1.readUnsignedByte(2072253733);
         this.models2 = new int[var3];

         for (int var4 = 0; var4 < var3; var4++) {
            this.models2[var4] = Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 == 3) {
         this.nonSelectable = true;
      } else if (var2 == 40) {
         int var5 = var1.readUnsignedByte(-1202824443);
         this.recolorFrom = new short[var5];
         this.recolorTo = new short[var5];

         for (int var7 = 0; var7 < var5; var7++) {
            this.recolorFrom[var7] = (short)Buffer.method12008(var1, (byte)5);
            this.recolorTo[var7] = (short)Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 == 41) {
         int var6 = var1.readUnsignedByte(-911409101);
         this.retextureFrom = new short[var6];
         this.retextureTo = new short[var6];

         for (int var8 = 0; var8 < var6; var8++) {
            this.retextureFrom[var8] = (short)Buffer.method12008(var1, (byte)5);
            this.retextureTo[var8] = (short)Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 >= -955689401 && var2 < 1525802116) {
         this.models[var2 - 60] = Buffer.method12008(var1, (byte)5);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljm;")
   @ObfuscatedName("aw")
   public ModelData getKitDefinitionModels(int var1) {
      try {
         ModelData[] var2 = new ModelData[5];
         int var3 = 0;

         for (int var4 = 0; var4 < 5; var4++) {
            if (var1 != -1793120611) {
               throw new IllegalStateException();
            }

            if (-1 != this.models[var4]) {
               if (var1 != -1793120611) {
                  throw new IllegalStateException();
               }

               var2[var3++] = ModelData.ModelData_get(ClanChannelMember.KitDefinition_modelsArchive, this.models[var4], 0);
            }
         }

         ModelData var7 = new ModelData(var2, var3);
         if (null != this.recolorFrom) {
            if (var1 != -1793120611) {
               throw new IllegalStateException();
            }

            for (int var5 = 0; var5 < this.recolorFrom.length; var5++) {
               if (var1 != -1793120611) {
                  throw new IllegalStateException();
               }

               var7.recolor(this.recolorFrom[var5], this.recolorTo[var5]);
            }
         }

         if (null != this.retextureFrom) {
            for (int var8 = 0; var8 < this.retextureFrom.length; var8++) {
               if (var1 != -1793120611) {
                  throw new IllegalStateException();
               }

               ModelData.method6071(var7, this.retextureFrom[var8], this.retextureTo[var8]);
            }
         }

         return var7;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "hy.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhy;B)Z")
   @ObfuscatedName("hl")
   public static boolean method4839(KitDefinition var0, byte var1) {
      if (var0 == null) {
         return var0.method4843(var1);
      } else {
         try {
            boolean var2 = true;

            for (int var3 = 0; var3 < 5; var3++) {
               if (-1 != var0.models[var3]) {
                  if (var1 != 32) {
                     throw new IllegalStateException();
                  }

                  if (!ClanChannelMember.KitDefinition_modelsArchive.tryLoadFile(var0.models[var3], 0, 756705879)) {
                     if (var1 != 32) {
                        throw new IllegalStateException();
                     }

                     var2 = false;
                  }
               }
            }

            return var2;
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "hy.ak(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ah")
   public boolean method4834() {
      if (null == this.models2) {
         return true;
      } else {
         boolean var1 = true;

         for (int var2 = 0; var2 < this.models2.length; var2++) {
            if (!ClanChannelMember.KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0, 756705879)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljm;")
   @ObfuscatedName("al")
   public ModelData method4837() {
      if (this.models2 == null) {
         return null;
      } else {
         ModelData[] var1 = new ModelData[this.models2.length];

         for (int var2 = 0; var2 < this.models2.length; var2++) {
            var1[var2] = ModelData.ModelData_get(ClanChannelMember.KitDefinition_modelsArchive, this.models2[var2], 0);
         }

         ModelData var4;
         if (1 == var1.length) {
            var4 = var1[0];
         } else {
            var4 = new ModelData(var1, var1.length);
         }

         if (this.recolorFrom != null) {
            for (int var3 = 0; var3 < this.recolorFrom.length; var3++) {
               var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
            }
         }

         if (this.retextureFrom != null) {
            for (int var5 = 0; var5 < this.retextureFrom.length; var5++) {
               ModelData.method6071(var4, this.retextureFrom[var5], this.retextureTo[var5]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ar")
   public boolean method4832(int var1, int var2) {
      return var2 == 1 ? 7 + var1 == 1953719745 * this.bodypartID : var1 == this.bodypartID * 1953719745;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ao")
   public boolean method4840() {
      boolean var1 = true;

      for (int var2 = 0; var2 < 5; var2++) {
         if (-1 != this.models[var2] && !ClanChannelMember.KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0, 756705879)) {
            var1 = false;
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   public boolean method4841() {
      boolean var1 = true;

      for (int var2 = 0; var2 < 5; var2++) {
         if (-1 != this.models[var2] && !ClanChannelMember.KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0, 756705879)) {
            var1 = false;
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("at")
   public static void method4821(byte var0) {
      try {
         SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
         SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "hy.at(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lna;)I")
   @ObfuscatedName("sb")
   public static int method4845(MidiFileReader var0) {
      int var1 = var0.trackPositions.length;
      int var2 = -1;
      int var3 = 1885320806;

      for (int var4 = 0; var4 < var1; var4++) {
         if (var0.trackPositions[var4] >= 0 && var0.trackLengths[var4] < var3) {
            var2 = var4;
            var3 = var0.trackLengths[var4];
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lof;B)Lof;")
   @ObfuscatedName("nd")
   static Widget method4848(Widget var0, byte var1) {
      try {
         Widget var2 = WorldEntityConfig.method4787(var0, 667436832);
         if (var2 == null) {
            var2 = var0.parent;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "hy.nd(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aa")
   public boolean method4842() {
      boolean var1 = true;

      for (int var2 = 0; var2 < 5; var2++) {
         if (-1 != this.models[var2] && !ClanChannelMember.KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0, 756705879)) {
            var1 = false;
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljm;")
   @ObfuscatedName("aj")
   public ModelData getModelData(int var1) {
      try {
         ModelData[] var2 = new ModelData[5];
         int var3 = 0;

         for (int var4 = 0; var4 < 5; var4++) {
            if (var1 != -1793120611) {
               throw new IllegalStateException();
            }

            if (-1 != this.models2[var4]) {
               if (var1 != -1793120611) {
                  throw new IllegalStateException();
               }

               var2[var3++] = ModelData.ModelData_get(ClanChannelMember.KitDefinition_modelsArchive, this.models2[var4], 0);
            }
         }

         ModelData var7 = new ModelData(var2, var3);
         if (null != this.retextureFrom) {
            if (var1 != -1793120611) {
               throw new IllegalStateException();
            }

            for (int var5 = 0; var5 < this.recolorFrom.length; var5++) {
               if (var1 != -1793120611) {
                  throw new IllegalStateException();
               }

               var7.recolor(this.recolorTo[var5], this.retextureFrom[var5]);
            }
         }

         if (null != this.retextureFrom) {
            for (int var8 = 0; var8 < this.retextureFrom.length; var8++) {
               if (var1 != -1793120611) {
                  throw new IllegalStateException();
               }

               ModelData.method6071(var7, this.retextureFrom[var8], this.recolorFrom[var8]);
            }
         }

         return var7;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "hy.aw(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhy;)Ljm;")
   @ObfuscatedName("lc")
   public static ModelData method4838(KitDefinition var0) {
      if (var0 == null) {
         var0.method4841();
      }

      if (var0.models2 == null) {
         return null;
      } else {
         ModelData[] var1 = new ModelData[var0.models2.length];

         for (int var2 = 0; var2 < var0.models2.length; var2++) {
            var1[var2] = ModelData.ModelData_get(ClanChannelMember.KitDefinition_modelsArchive, var0.models2[var2], 0);
         }

         ModelData var4;
         if (1 == var1.length) {
            var4 = var1[0];
         } else {
            var4 = new ModelData(var1, var1.length);
         }

         if (var0.recolorFrom != null) {
            for (int var3 = 0; var3 < var0.recolorFrom.length; var3++) {
               var4.recolor(var0.recolorFrom[var3], var0.recolorTo[var3]);
            }
         }

         if (var0.retextureFrom != null) {
            for (int var5 = 0; var5 < var0.retextureFrom.length; var5++) {
               ModelData.method6071(var4, var0.retextureFrom[var5], var0.retextureTo[var5]);
            }
         }

         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhy;Lxa;)V")
   @ObfuscatedName("hv")
   public static void method4824(KitDefinition var0, Buffer var1) {
      if (var0 == null) {
         var0.method4837();
      }

      while (true) {
         int var2 = var1.readUnsignedByte(20268731);
         if (0 == var2) {
            return;
         }

         var0.decodeNext(var1, var2, 2135649040);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ak")
   public boolean method4843(byte var1) {
      try {
         boolean var2 = true;

         for (int var3 = 0; var3 < 5; var3++) {
            if (-1 != this.models2[var3]) {
               if (var1 != 32) {
                  throw new IllegalStateException();
               }

               if (!ClanChannelMember.KitDefinition_modelsArchive.tryLoadFile(this.models[var3], 0, 756705879)) {
                  if (var1 != 32) {
                     throw new IllegalStateException();
                  }

                  var2 = false;
               }
            }
         }

         return var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hy.ak(" + ')');
      }
   }
}
