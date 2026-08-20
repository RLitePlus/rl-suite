import javax.annotation.Nullable;
import net.runelite.api.IterableHashTable;
import net.runelite.api.ParamHolder;
import net.runelite.api.events.PostObjectComposition;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("iv")
public class ObjectComposition extends DualNode implements ParamHolder, net.runelite.api.ObjectComposition {
   @ObfuscatedSignature(descriptor = "Lpu;")
   @ObfuscatedName("ec")
   public class402 field2673;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2704 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field2699 = 5;
   @ObfuscatedName("dw")
   public String[] actions;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2698 = 15;
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   public static final int field2709 = 300;
   @ObfuscatedName("es")
   public boolean boolean3;
   @ObfuscatedName("dc")
   public boolean clipped;
   @ObfuscatedSignature(descriptor = "Lnb;")
   @ObfuscatedName("dn")
   public class343 field2691;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field2701 = 21;
   @ObfuscatedSignature(descriptor = "Lnb;")
   @ObfuscatedName("bh")
   public static final class343 field2646 = class343.field4175;
   @ObfuscatedSignature(descriptor = "Lnb;")
   @ObfuscatedName("bl")
   public static final class343 field2655 = class343.field4175;
   @ObfuscatedSignature(descriptor = "Lnb;")
   @ObfuscatedName("bc")
   public static final class343 field2649 = class343.field4175;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field2702 = 41;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("bv")
   static EvictingDualNodeHashTable ObjectDefinition_cached = new EvictingDualNodeHashTable(4096);
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ch")
   public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500);
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field2706 = 19;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("cm")
   static EvictingDualNodeHashTable ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(256);
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("cb")
   static EvictingDualNodeHashTable ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(256);
   @ObfuscatedSignature(descriptor = "[Ljm;")
   @ObfuscatedName("ck")
   static ModelData[] modelDataArray = new ModelData[4];
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field2700 = 14;
   @ObfuscatedName("cs")
   int[] modelIds;
   @ObfuscatedName("cn")
   int[] models;
   @ObfuscatedName("co")
   public String name = Strings.field4861;
   @ObfuscatedName("cy")
   public boolean boolean1;
   @ObfuscatedName("cg")
   short[] recolorTo;
   @ObfuscatedName("cp")
   short[] retextureFrom;
   @ObfuscatedName("cd")
   short[] retextureTo;
   @ObfuscatedName("cz")
   public int sizeX = 98251817;
   @ObfuscatedName("ci")
   public int sizeY = 434524193;
   @ObfuscatedName("cf")
   public int interactType = 416039630;
   @ObfuscatedSignature(descriptor = "Lnb;")
   @ObfuscatedName("dk")
   public class343 field2662;
   @ObfuscatedName("cq")
   public int int1;
   @ObfuscatedName("cv")
   int clipType;
   @ObfuscatedName("cw")
   boolean nonFlatShading;
   @ObfuscatedName("cr")
   public boolean modelClipped;
   @ObfuscatedName("cj")
   public int animationId;
   @ObfuscatedName("ca")
   public int int2;
   @ObfuscatedName("dy")
   boolean isRotated;
   @ObfuscatedName("dd")
   int contrast;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field2707 = 40;
   @ObfuscatedName("dv")
   public int mapIconId;
   @ObfuscatedName("df")
   public int mapSceneId;
   @ObfuscatedName("ce")
   public static boolean ObjectDefinition_isLowDetail = false;
   @ObfuscatedName("db")
   int modelSizeX;
   @ObfuscatedName("dh")
   int modelSizeY;
   @ObfuscatedName("dt")
   int modelHeight;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field2703 = 33;
   @ObfuscatedName("dz")
   int offsetX;
   @ObfuscatedName("di")
   int offsetHeight;
   @ObfuscatedName("dj")
   int offsetY;
   @ObfuscatedName("cc")
   public int id;
   @ObfuscatedName("dl")
   boolean isSolid;
   @ObfuscatedName("dr")
   public int int3;
   @ObfuscatedName("cl")
   int ambient;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field2645 = 1;
   @ObfuscatedName("du")
   int transformVarp;
   @ObfuscatedName("dm")
   public int ambientSoundId;
   @ObfuscatedSignature(descriptor = "Lql;")
   @ObfuscatedName("ek")
   IterableNodeHashTable params;
   @ObfuscatedName("dg")
   public int int8;
   @ObfuscatedSignature(descriptor = "Lnb;")
   @ObfuscatedName("ds")
   public class343 field2687;
   @ObfuscatedName("de")
   public int field2660;
   @ObfuscatedName("do")
   public int field2689;
   @ObfuscatedName("er")
   public boolean field2696;
   @ObfuscatedName("ea")
   public int int5;
   @ObfuscatedName("cx")
   short[] recolorFrom;
   @ObfuscatedName("da")
   public boolean boolean2;
   @ObfuscatedName("ee")
   public int int6;
   @ObfuscatedName("eq")
   public int[] soundEffectIds;
   @ObfuscatedName("dp")
   public int int7;
   @ObfuscatedName("dq")
   int transformVarbit;
   @ObfuscatedName("dx")
   public int[] transforms;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field2708 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field2705 = 23;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liv;Lxa;I)V")
   @ObfuscatedName("kk")
   public static void method5150(ObjectComposition var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method5142();
      }

      if (1 == var2) {
         int var3 = var1.readUnsignedByte(1654568746);
         if (var3 > 0) {
            if (null != var0.modelIds && !ObjectDefinition_isLowDetail) {
               var1.offset += 930339743 * var3;
            } else {
               var0.models = new int[var3];
               var0.modelIds = new int[var3];

               for (int var4 = 0; var4 < var3; var4++) {
                  var0.modelIds[var4] = Buffer.method12008(var1, (byte)5);
                  var0.models[var4] = var1.readUnsignedByte(471684663);
               }
            }
         }
      } else if (var2 == 2) {
         var0.name = var1.readStringCp1252NullCircumfixed(1406454671);
      } else if (5 == var2) {
         int var6 = var1.readUnsignedByte(556249863);
         if (var6 > 0) {
            if (var0.modelIds != null && !ObjectDefinition_isLowDetail) {
               var1.offset += -811429270 * var6;
            } else {
               var0.models = null;
               var0.modelIds = new int[var6];

               for (int var12 = 0; var12 < var6; var12++) {
                  var0.modelIds[var12] = Buffer.method12008(var1, (byte)5);
               }
            }
         }
      } else if (14 == var2) {
         var0.sizeX = var1.readUnsignedByte(-768319167) * 98251817;
      } else if (var2 == 15) {
         var0.sizeY = var1.readUnsignedByte(-1460981175) * 434524193;
      } else if (var2 == 17) {
         var0.interactType = 0;
         var0.boolean1 = false;
      } else if (18 == var2) {
         var0.boolean1 = false;
      } else if (19 == var2) {
         var0.int1 = var1.readUnsignedByte(-1436498776) * -591515787;
      } else if (var2 == 21) {
         var0.clipType = 0;
      } else if (22 == var2) {
         var0.nonFlatShading = true;
      } else if (23 == var2) {
         var0.modelClipped = true;
      } else if (24 == var2) {
         var0.animationId = Buffer.method12008(var1, (byte)5) * -1657420237;
         if (var0.animationId * 930784507 == 65535) {
            var0.animationId = 1657420237;
         }
      } else if (var2 == 27) {
         var0.interactType = 208019815;
      } else if (28 == var2) {
         var0.int2 = var1.readUnsignedByte(55862680) * 765596469;
      } else if (29 == var2) {
         var0.ambient = Buffer.method12001(var1, (byte)104) * -365302667;
      } else if (var2 == 39) {
         var0.contrast = Buffer.method12001(var1, (byte)16) * 480270427;
      } else if (var2 >= 30 && var2 < 35) {
         var0.actions[var2 - 30] = var1.readStringCp1252NullCircumfixed(2011163271);
         if (var0.actions[var2 - 30].equalsIgnoreCase(Strings.field4856)) {
            var0.actions[var2 - 30] = null;
         }
      } else if (var2 == 40) {
         int var7 = var1.readUnsignedByte(1144771529);
         var0.recolorFrom = new short[var7];
         var0.recolorTo = new short[var7];

         for (int var13 = 0; var13 < var7; var13++) {
            var0.recolorFrom[var13] = (short)Buffer.method12008(var1, (byte)5);
            var0.recolorTo[var13] = (short)Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 == 41) {
         int var8 = var1.readUnsignedByte(-1672084008);
         var0.retextureFrom = new short[var8];
         var0.retextureTo = new short[var8];

         for (int var14 = 0; var14 < var8; var14++) {
            var0.retextureFrom[var14] = (short)Buffer.method12008(var1, (byte)5);
            var0.retextureTo[var14] = (short)Buffer.method12008(var1, (byte)5);
         }
      } else if (61 == var2) {
         Buffer.method12008(var1, (byte)5);
      } else if (var2 == 62) {
         var0.isRotated = true;
      } else if (var2 == 64) {
         var0.clipped = false;
      } else if (65 == var2) {
         var0.modelSizeX = Buffer.method12008(var1, (byte)5) * -314716151;
      } else if (66 == var2) {
         var0.modelHeight = Buffer.method12008(var1, (byte)5) * -1027683525;
      } else if (67 == var2) {
         var0.modelSizeY = Buffer.method12008(var1, (byte)5) * 932555869;
      } else if (var2 == 68) {
         var0.mapSceneId = Buffer.method12008(var1, (byte)5) * -1140107735;
      } else if (var2 == 69) {
         var1.readUnsignedByte(1948241909);
      } else if (var2 == 70) {
         var0.offsetX = var1.readShort((byte)-105) * -1113138057;
      } else if (71 == var2) {
         var0.offsetHeight = var1.readShort((byte)-70) * -1112324803;
      } else if (72 == var2) {
         var0.offsetY = var1.readShort((byte)-7) * -1797744199;
      } else if (73 == var2) {
         var0.boolean2 = true;
      } else if (74 == var2) {
         var0.isSolid = true;
      } else if (var2 == 75) {
         var0.int3 = var1.readUnsignedByte(-1532852100) * -717080919;
      } else if (var2 == 77 || var2 == 92) {
         var0.transformVarbit = Buffer.method12008(var1, (byte)5) * 202669531;
         if (var0.transformVarbit * -753060269 == 65535) {
            var0.transformVarbit = -202669531;
         }

         var0.transformVarp = Buffer.method12008(var1, (byte)5) * -326958533;
         if (65535 == 1406043891 * var0.transformVarp) {
            var0.transformVarp = 326958533;
         }

         int var11 = -1;
         if (92 == var2) {
            var11 = Buffer.method12008(var1, (byte)5);
            if (65535 == var11) {
               var11 = -1;
            }
         }

         int var16 = var1.readUnsignedByte(1571430241);
         var0.transforms = new int[2 + var16];

         for (int var5 = 0; var5 <= var16; var5++) {
            var0.transforms[var5] = Buffer.method12008(var1, (byte)5);
            if (65535 == var0.transforms[var5]) {
               var0.transforms[var5] = -1;
            }
         }

         var0.transforms[1 + var16] = var11;
      } else if (78 == var2) {
         var0.ambientSoundId = Buffer.method12008(var1, (byte)5) * 1543321215;
         var0.int7 = var1.readUnsignedByte(-591796240) * 1058055821;
         var0.int8 = var1.readUnsignedByte(392069567) * 613196815;
      } else if (79 == var2) {
         var0.int5 = Buffer.method12008(var1, (byte)5) * -1230482209;
         var0.int6 = Buffer.method12008(var1, (byte)5) * -197720233;
         var0.int7 = var1.readUnsignedByte(-253041383) * 1058055821;
         var0.int8 = var1.readUnsignedByte(-628261636) * 613196815;
         int var9 = var1.readUnsignedByte(302294876);
         var0.soundEffectIds = new int[var9];

         for (int var15 = 0; var15 < var9; var15++) {
            var0.soundEffectIds[var15] = Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 == 81) {
         var0.clipType = var1.readUnsignedByte(-198388520) * 1589262592;
      } else if (var2 == 82) {
         var0.mapIconId = Buffer.method12008(var1, (byte)5) * 1244549305;
      } else if (var2 == 89) {
         var0.boolean3 = false;
      } else if (var2 == 90) {
         var0.field2696 = true;
      } else if (var2 == 91) {
         var0.field2687 = class358.method7866(var1.readUnsignedByte(330062646), -878953959);
      } else if (var2 == 93) {
         var0.field2662 = class358.method7866(var1.readUnsignedByte(484166869), -1751567425);
         var0.field2660 = Buffer.method12008(var1, (byte)5) * -1419917095;
         var0.field2691 = class358.method7866(var1.readUnsignedByte(1906328234), 371604499);
         var0.field2689 = Buffer.method12008(var1, (byte)5) * -829794815;
      } else if (249 == var2) {
         var0.params = class406.readStringIntParameters(var1, var0.params, (byte)79);
      } else if (94 != var2 && var2 == 95) {
         class402[] var10 = new class402[]{class402.field5240, class402.field5241, class402.field5242};
         var0.field2673 = (class402)GrandExchangeOffer.findEnumerated(var10, var1.readUnsignedByte(-1462171037), (byte)1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Liv;")
   @ObfuscatedName("ac")
   public static ObjectComposition method5137(int var0) {
      ObjectComposition var1 = (ObjectComposition)class402.method8806(ObjectDefinition_cached, var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = VarcInt.ObjectDefinition_archive.getFile(6, var0, 1677501784);
         var1 = new ObjectComposition();
         var1.id = -1273149277 * var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2), (byte)7);
         }

         var1.postDecode(634828876);
         if (var1.isSolid) {
            var1.interactType = 0;
            var1.boolean1 = false;
         }

         ObjectDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   void postDecode(int var1) {
      try {
         if (-1 == this.int1 * -1900812067) {
            if (var1 != 634828876) {
               throw new IllegalStateException();
            }

            this.int1 = 0;
            label67:
            if (null != this.modelIds) {
               if (var1 != 634828876) {
                  throw new IllegalStateException();
               }

               if (null != this.models) {
                  if (var1 != 634828876) {
                     throw new IllegalStateException();
                  }

                  if (10 != this.models[0]) {
                     break label67;
                  }

                  if (var1 != 634828876) {
                     this.method5189();
                     return;
                  }
               }

               this.int1 = -591515787;
            }

            for (int var2 = 0; var2 < 5; var2++) {
               if (var1 != 634828876) {
                  throw new IllegalStateException();
               }

               if (this.actions[var2] != null) {
                  if (var1 != 634828876) {
                     throw new IllegalStateException();
                  }

                  this.int1 = -591515787;
               }
            }
         }

         if (1768476057 * this.int3 == -1) {
            if (var1 != 634828876) {
               throw new IllegalStateException();
            }

            this.int3 = -717080919 * (this.interactType * 756705879 != 0 ? 1 : 0);
         }

         this.method5189();
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "iv.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liv;II[[IIII)Ljz;")
   @ObfuscatedName("yk")
   public static Renderable method5161(ObjectComposition var0, int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method5166(var1, var1, var3, var1, var1, var1);
      }

      long var7;
      if (var0.models == null) {
         var7 = (var0.id * 1095054960 << 10) + var2;
      } else {
         var7 = (-965498101 * var0.id << 10) + (var1 << 3) + var2;
      }

      Object var9 = (Renderable)class402.method8806(ObjectDefinition_cachedEntities, var7);
      if (var9 == null) {
         ModelData var10 = method5186(var0, var1, var2, (byte)0);
         if (null == var10) {
            return null;
         }

         if (!var0.nonFlatShading) {
            var9 = ModelData.method6106(var10, 64 + 945261307 * var0.ambient, var0.contrast * -54781908 + -1974629910, -50, -10, 987403700);
         } else {
            var10.ambient = (short)(69436381 * var0.ambient + -307127247);
            var10.contrast = (short)(-62861840 + var0.contrast * 203396339);
            var10.calculateVertexNormals();
            var9 = var10;
         }

         ObjectDefinition_cachedEntities.put((DualNode)var9, var7);
      }

      if (var0.nonFlatShading) {
         var9 = ModelData.method6048((ModelData)var9);
      }

      if (var0.clipType * 1102315881 >= 0) {
         if (var9 instanceof Model) {
            var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, 135730185 * var0.clipType);
         } else if (var9 instanceof ModelData) {
            var9 = ((ModelData)var9).method6049(var3, var4, var5, var6, true, 1436933530 * var0.clipType);
         }
      }

      return (Renderable)var9;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("an")
   void decode(Buffer var1, byte var2) {
      try {
         while (true) {
            int var3 = var1.readUnsignedByte(-164686936);
            if (0 == var3) {
               if (var2 <= 0) {
                  return;
               }

               return;
            }

            method5154(this, var1, var3, -1481714301);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "iv.an(" + ')');
      }
   }

   public int getId() {
      return this.id * -965498101;
   }

   @ObfuscatedSignature(descriptor = "(II[[IIII)Ljz;")
   @ObfuscatedName("dt")
   public Renderable method5192(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      return this.getEntity(var1, var2, var3, var4, var5, var6, -2065491027);
   }

   public int getSizeY() {
      return this.sizeY * -352504863;
   }

   public int getMapSceneId() {
      return this.mapSceneId * 93759001;
   }

   public int getSizeX() {
      return this.sizeX * 1813358617;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("as")
   public boolean hasSound(int var1) {
      try {
         if (null == this.transforms) {
            if (var1 <= 413413255) {
               throw new IllegalStateException();
            } else {
               if (-1 == -1194817153 * this.ambientSoundId) {
                  if (var1 <= 413413255) {
                     throw new IllegalStateException();
                  }

                  if (this.soundEffectIds == null) {
                     return false;
                  }

                  if (var1 <= 413413255) {
                     throw new IllegalStateException();
                  }
               }

               return true;
            }
         } else {
            int var2 = 0;

            while (true) {
               if (var2 >= this.transforms.length) {
                  return false;
               }

               if (var1 <= 413413255) {
                  throw new IllegalStateException();
               }

               if (this.transforms[var2] != -1) {
                  ObjectComposition var3 = AsyncHttpResponse.getObjectDefinition(this.transforms[var2], 2136185926);
                  if (-1194817153 * var3.ambientSoundId != -1) {
                     break;
                  }

                  if (var1 <= 413413255) {
                     throw new IllegalStateException();
                  }

                  if (var3.soundEffectIds != null) {
                     if (var1 <= 413413255) {
                        throw new IllegalStateException();
                     }
                     break;
                  }
               }

               var2++;
            }

            return true;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "iv.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bg")
   public final boolean method5158(int var1) {
      try {
         if (null == this.modelIds) {
            if (var1 <= 1728800592) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var2 = true;

            for (int var3 = 0; var3 < this.modelIds.length; var3++) {
               if (var1 <= 1728800592) {
                  throw new IllegalStateException();
               }

               var2 &= SecureRandomCallable.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0, 756705879);
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "iv.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II[[IIIII)Lky;")
   @ObfuscatedName("ap")
   public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6, int var7) {
      try {
         long var8;
         if (null == this.models) {
            if (var7 >= 196151124) {
               throw new IllegalStateException();
            }

            var8 = var2 + (this.id * -965498101 << 10);
         } else {
            var8 = var2 + (var1 << 3) + (this.id * -965498101 << 10);
         }

         Model var10 = (Model)class402.method8806(ObjectDefinition_cachedModels, var8);
         if (var10 == null) {
            if (var7 >= 196151124) {
               throw new IllegalStateException();
            }

            ModelData var11 = method5186(this, var1, var2, (byte)0);
            if (null == var11) {
               if (var7 >= 196151124) {
                  throw new IllegalStateException();
               }

               return null;
            }

            var10 = ModelData.method6106(var11, 69436381 * this.ambient + 64, 768 + this.contrast * -706784357, -50, -10, -50);
            ObjectDefinition_cachedModels.put(var10, var8);
         }

         if (135730185 * this.clipType >= 0) {
            if (var7 >= 196151124) {
               throw new IllegalStateException();
            }

            var10 = var10.contourGround(var3, var4, var5, var6, true, this.clipType * 135730185);
         }

         return var10;
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "iv.ap(" + ')');
      }
   }

   public int getIntValue(int var1) {
      Node var2 = this.method5188(var1);
      if (var2 != null) {
         IntegerNode var4 = (IntegerNode)var2;
         return var4.getValue();
      } else {
         ParamComposition var3 = SecureUrlRequester.client.method2360(var1);
         if (var3.method4972()) {
            throw new IllegalArgumentException("trying to get int from string param");
         } else {
            return var3.method4973();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   public static void method5140() {
      ObjectDefinition_cached.clear();
      ObjectDefinition_cachedModelData.clear();
      ObjectDefinition_cachedEntities.clear();
      ObjectDefinition_cachedModels.clear();
   }

   @ObfuscatedSignature(descriptor = "(I)Liv;")
   @ObfuscatedName("az")
   public final ObjectComposition transform(int var1) {
      try {
         int var2 = -1;
         if (this.transformVarbit * -753060269 != -1) {
            if (var1 == -1709238509) {
               throw new IllegalStateException();
            }

            var2 = WorldMapData_1.getVarbit(-753060269 * this.transformVarbit, 1285359231);
         } else if (-1 != this.transformVarp * 1406043891) {
            if (var1 == -1709238509) {
               throw new IllegalStateException();
            }

            var2 = Varps.Varps_main[1406043891 * this.transformVarp];
         }

         int var3;
         if (var2 >= 0 && var2 < this.transforms.length - 1) {
            var3 = this.transforms[var2];
         } else {
            var3 = this.transforms[this.transforms.length - 1];
         }

         if (var3 != -1) {
            if (var1 == -1709238509) {
               throw new IllegalStateException();
            } else {
               return AsyncHttpResponse.getObjectDefinition(var3, 2064850471);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "iv.az(" + ')');
      }
   }

   public int getVarbitId() {
      return this.transformVarbit * -753060269;
   }

   @ObfuscatedSignature(descriptor = "(Liv;IIB)Ljm;")
   @ObfuscatedName("fq")
   public static ModelData method5186(ObjectComposition var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         var0.getModelData(var1, var1, var3);
      }

      synchronized (ObjectDefinition_cachedModelData) {
         int var8 = var2;
         int var7 = var1;
         ObjectComposition var6 = var0;
         boolean var9 = false;

         ModelData var10000;
         try {
            ModelData var10 = null;
            if (null == var6.models) {
               if (var7 != 10) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               if (var6.modelIds == null) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               boolean var11 = var6.isRotated;
               if (2 == var7) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  if (var8 > 3) {
                     if (var9) {
                        throw new IllegalStateException();
                     }

                     var11 = !var11;
                  }
               }

               int var12 = var6.modelIds.length;

               for (int var13 = 0; var13 < var12; var13++) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  int var14 = var6.modelIds[var13];
                  if (var11) {
                     if (var9) {
                        throw new IllegalStateException();
                     }

                     var14 += 65536;
                  }

                  var10 = (ModelData)class402.method8806(ObjectDefinition_cachedModelData, var14);
                  if (null == var10) {
                     if (var9) {
                        throw new IllegalStateException();
                     }

                     var10 = ModelData.ModelData_get(SecureRandomCallable.ObjectDefinition_modelsArchive, var14 & 65535, 0);
                     if (var10 == null) {
                        if (var9) {
                           throw new IllegalStateException();
                        }

                        return null;
                     }

                     if (var11) {
                        if (var9) {
                           throw new IllegalStateException();
                        }

                        var10.method6074();
                     }

                     ObjectDefinition_cachedModelData.put(var10, var14);
                  }

                  if (var12 > 1) {
                     modelDataArray[var13] = var10;
                  }
               }

               if (var12 > 1) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  var10 = new ModelData(modelDataArray, var12);
               }
            } else {
               int var23 = -1;

               for (int var25 = 0; var25 < var6.models.length; var25++) {
                  if (var7 == var6.models[var25]) {
                     if (var9) {
                        throw new IllegalStateException();
                     }

                     var23 = var25;
                     break;
                  }
               }

               if (-1 == var23) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               int var26 = var6.modelIds[var23];
               boolean var10001;
               if (var8 > 3) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               boolean var28 = var6.isRotated ^ var10001;
               if (var28) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  var26 += 65536;
               }

               var10 = (ModelData)class402.method8806(ObjectDefinition_cachedModelData, var26);
               if (var10 == null) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  var10 = ModelData.ModelData_get(SecureRandomCallable.ObjectDefinition_modelsArchive, var26 & 65535, 0);
                  if (null == var10) {
                     if (var9) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  if (var28) {
                     var10.method6074();
                  }

                  ObjectDefinition_cachedModelData.put(var10, var26);
               }
            }

            boolean var24;
            label315: {
               if (128 == var6.modelSizeX * -274284999 && 128 == var6.modelHeight * 848811507) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  if (128 == -914257931 * var6.modelSizeY) {
                     var24 = false;
                     break label315;
                  }

                  if (var9) {
                     throw new IllegalStateException();
                  }
               }

               var24 = true;
            }

            boolean var27;
            label307: {
               if (0 == var6.offsetX * -671892153) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  if (var6.offsetHeight * -1044268523 == 0) {
                     if (var6.offsetY * 1580309641 == 0) {
                        var27 = false;
                        break label307;
                     }

                     if (var9) {
                        throw new IllegalStateException();
                     }
                  }
               }

               var27 = true;
            }

            boolean var10003;
            label299: {
               var10000 = new ModelData;
               if (var8 == 0) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  if (!var24 && !var27) {
                     if (var9) {
                        throw new IllegalStateException();
                     }

                     var10003 = true;
                     break label299;
                  }
               }

               var10003 = false;
            }

            boolean var10004;
            if (null == var6.recolorFrom) {
               if (var9) {
                  throw new IllegalStateException();
               }

               var10004 = true;
            } else {
               var10004 = false;
            }

            boolean var10005;
            if (null == var6.retextureFrom) {
               if (var9) {
                  throw new IllegalStateException();
               }

               var10005 = true;
            } else {
               var10005 = false;
            }

            var10000./* $VF: Unable to resugar constructor */<init>(var10, var10003, var10004, var10005, true);
            ModelData var29 = var10000;
            if (4 == var7 && var8 > 3) {
               if (var9) {
                  throw new IllegalStateException();
               }

               var29.method6061(256);
               ModelData.method6104(var29, 45, 0, -45);
            }

            var8 &= 3;
            if (var8 == 1) {
               if (var9) {
                  throw new IllegalStateException();
               }

               var29.method6107();
            } else if (2 == var8) {
               if (var9) {
                  throw new IllegalStateException();
               }

               var29.method6103();
            } else if (3 == var8) {
               if (var9) {
                  throw new IllegalStateException();
               }

               var29.method6112();
            }

            if (var6.recolorFrom != null) {
               if (var9) {
                  throw new IllegalStateException();
               }

               for (int var30 = 0; var30 < var6.recolorFrom.length; var30++) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  var29.recolor(var6.recolorFrom[var30], var6.recolorTo[var30]);
               }
            }

            if (null != var6.retextureFrom) {
               if (var9) {
                  throw new IllegalStateException();
               }

               for (int var31 = 0; var31 < var6.retextureFrom.length; var31++) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  ModelData.method6071(var29, var6.retextureFrom[var31], var6.retextureTo[var31]);
               }
            }

            if (var24) {
               if (var9) {
                  throw new IllegalStateException();
               }

               var29.resize(var6.modelSizeX * -274284999, var6.modelHeight * 848811507, -914257931 * var6.modelSizeY);
            }

            if (var27) {
               if (var9) {
                  throw new IllegalStateException();
               }

               ModelData.method6104(var29, var6.offsetX * -671892153, -1044268523 * var6.offsetHeight, 1580309641 * var6.offsetY);
            }

            var10000 = var29;
         } catch (RuntimeException var15) {
            throw RestClientThreadFactory.newRunException(var15, "iv.au(" + ')');
         }

         return var10000;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("ai")
   public String getStringParam(int var1, String var2, int var3) {
      try {
         return Projectile.method1418(this.params, var1, var2, -1270297154);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "iv.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II[[IIIII)Ljz;")
   @ObfuscatedName("aw")
   public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6, int var7) {
      try {
         long var8;
         if (this.models == null) {
            if (var7 >= -1280537267) {
               throw new IllegalStateException();
            }

            var8 = (this.id * -965498101 << 10) + var2;
         } else {
            var8 = (-965498101 * this.id << 10) + (var1 << 3) + var2;
         }

         Object var10 = (Renderable)class402.method8806(ObjectDefinition_cachedEntities, var8);
         if (var10 == null) {
            if (var7 >= -1280537267) {
               throw new IllegalStateException();
            }

            ModelData var11 = method5186(this, var1, var2, (byte)0);
            if (null == var11) {
               if (var7 >= -1280537267) {
                  throw new IllegalStateException();
               }

               return null;
            }

            if (!this.nonFlatShading) {
               if (var7 >= -1280537267) {
                  throw new IllegalStateException();
               }

               var10 = ModelData.method6106(var11, 64 + 69436381 * this.ambient, this.contrast * -706784357 + 768, -50, -10, -50);
            } else {
               var11.ambient = (short)(69436381 * this.ambient + 64);
               var11.contrast = (short)(768 + this.contrast * -706784357);
               var11.calculateVertexNormals();
               var10 = var11;
            }

            ObjectDefinition_cachedEntities.put((DualNode)var10, var8);
         }

         if (this.nonFlatShading) {
            if (var7 >= -1280537267) {
               throw new IllegalStateException();
            }

            var10 = ModelData.method6048((ModelData)var10);
         }

         if (this.clipType * 135730185 >= 0) {
            if (var7 >= -1280537267) {
               throw new IllegalStateException();
            }

            if (var10 instanceof Model) {
               var10 = ((Model)var10).contourGround(var3, var4, var5, var6, true, 135730185 * this.clipType);
            } else if (var10 instanceof ModelData) {
               if (var7 >= -1280537267) {
                  throw new IllegalStateException();
               }

               var10 = ((ModelData)var10).method6049(var3, var4, var5, var6, true, 135730185 * this.clipType);
            }
         }

         return (Renderable)var10;
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "iv.aw(" + ')');
      }
   }

   public IterableHashTable getParams() {
      return this.params;
   }

   static {
      ObjectDefinition_cachedModels.method7386(256);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Liv;")
   @ObfuscatedName("ax")
   public static ObjectComposition method5138(int var0) {
      ObjectComposition var1 = (ObjectComposition)class402.method8806(ObjectDefinition_cached, var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = VarcInt.ObjectDefinition_archive.getFile(6, var0, 1948907335);
         var1 = new ObjectComposition();
         var1.id = -1273149277 * var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2), (byte)66);
         }

         var1.postDecode(634828876);
         if (var1.isSolid) {
            var1.interactType = 0;
            var1.boolean1 = false;
         }

         ObjectDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Liv;")
   @ObfuscatedName("ab")
   public static ObjectComposition method5139(int var0) {
      ObjectComposition var1 = (ObjectComposition)class402.method8806(ObjectDefinition_cached, var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = VarcInt.ObjectDefinition_archive.getFile(6, var0, 1948017118);
         var1 = new ObjectComposition();
         var1.id = 508533685 * var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2), (byte)20);
         }

         var1.postDecode(634828876);
         if (var1.isSolid) {
            var1.interactType = 0;
            var1.boolean1 = false;
         }

         ObjectDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bz")
   public final boolean method5159() {
      if (null == this.modelIds) {
         return true;
      } else {
         boolean var1 = true;

         for (int var2 = 0; var2 < this.modelIds.length; var2++) {
            var1 &= SecureRandomCallable.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 1945426340, 0, 756705879);
         }

         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liv;Lxa;)V")
   @ObfuscatedName("wt")
   public static void method5148(ObjectComposition var0, Buffer var1) {
      if (var0 == null) {
         var0.getImpostorIds();
      }

      while (true) {
         int var2 = var1.readUnsignedByte(1742133421);
         if (0 == var2) {
            return;
         }

         method5154(var0, var1, var2, -1481714301);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lvz;")
   @ObfuscatedName("dp")
   public Node method5188(int var1) {
      return this.getParams() == null ? null : (Node)this.getParams().get(var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   void method5142() {
      if (-1 == this.int1 * -1900812067) {
         this.int1 = 0;
         if (null != this.modelIds && (null == this.models || 10 == this.models[0])) {
            this.int1 = -591515787;
         }

         for (int var1 = 0; var1 < 5; var1++) {
            if (this.actions[var1] != null) {
               this.int1 = -591515787;
            }
         }
      }

      if (1768476057 * this.int3 == -1) {
         this.int3 = -717080919 * (this.interactType * 756705879 != 0 ? 1 : 0);
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("ag")
   public static void method5136(short var0) {
      try {
         FileSystem.FileSystem_cacheFiles.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "iv.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ljm;")
   @ObfuscatedName("wj")
   public ModelData method5193(int var1, int var2) {
      return method5186(this, var1, var2, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   void method5143() {
      if (-1 == this.int1 * -511670815) {
         this.int1 = 0;
         if (null != this.modelIds && (null == this.models || 10 == this.models[0])) {
            this.int1 = 599294036;
         }

         for (int var1 = 0; var1 < 5; var1++) {
            if (this.actions[var1] != null) {
               this.int1 = -486217314;
            }
         }
      }

      if (-1515502660 * this.int3 == -1) {
         this.int3 = 1907244072 * (this.interactType * -1986002880 != 0 ? 1 : 0);
      }
   }

   @ObfuscatedSignature(descriptor = "(II[[IIIILiw;I)Lky;")
   @ObfuscatedName("ba")
   public final Model method5169(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
      long var9;
      if (this.models == null) {
         var9 = var2 + (-965498101 * this.id << 10);
      } else {
         var9 = var2 + (-965498101 * this.id << 10) + (var1 << 3);
      }

      Model var11 = (Model)class402.method8806(ObjectDefinition_cachedModels, var9);
      if (null == var11) {
         ModelData var12 = method5186(this, var1, var2, (byte)0);
         if (null == var12) {
            return null;
         }

         var11 = ModelData.method6106(var12, this.ambient * 69436381 + 64, 768 + -706784357 * this.contrast, -50, -10, -50);
         ObjectDefinition_cachedModels.put(var11, var9);
      }

      if (null == var7 && 135730185 * this.clipType == -1) {
         return var11;
      } else {
         if (null != var7) {
            var11 = var7.transformObjectModel(var11, var8, var2, (byte)46);
         } else {
            var11 = var11.toSharedSequenceModel(true);
         }

         if (135730185 * this.clipType >= 0 && var3 != null) {
            var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType * 135730185);
         }

         return var11;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ljm;")
   @ObfuscatedName("bi")
   final ModelData method5171(int var1, int var2) {
      ModelData var3 = null;
      if (null == this.models) {
         if (var1 != 10) {
            return null;
         }

         if (this.modelIds == null) {
            return null;
         }

         boolean var4 = this.isRotated;
         if (2 == var1 && var2 > 3) {
            var4 = !var4;
         }

         int var5 = this.modelIds.length;

         for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.modelIds[var6];
            if (var4) {
               var7 += 65536;
            }

            var3 = (ModelData)class402.method8806(ObjectDefinition_cachedModelData, var7);
            if (null == var3) {
               var3 = ModelData.ModelData_get(SecureRandomCallable.ObjectDefinition_modelsArchive, var7 & 65535, 0);
               if (var3 == null) {
                  return null;
               }

               if (var4) {
                  var3.method6074();
               }

               ObjectDefinition_cachedModelData.put(var3, var7);
            }

            if (var5 > 1) {
               modelDataArray[var6] = var3;
            }
         }

         if (var5 > 1) {
            var3 = new ModelData(modelDataArray, var5);
         }
      } else {
         int var9 = -1;

         for (int var11 = 0; var11 < this.models.length; var11++) {
            if (var1 == this.models[var11]) {
               var9 = var11;
               break;
            }
         }

         if (-1 == var9) {
            return null;
         }

         int var12 = this.modelIds[var9];
         boolean var14 = this.isRotated ^ var2 > 3;
         if (var14) {
            var12 += 65536;
         }

         var3 = (ModelData)class402.method8806(ObjectDefinition_cachedModelData, var12);
         if (var3 == null) {
            var3 = ModelData.ModelData_get(SecureRandomCallable.ObjectDefinition_modelsArchive, var12 & 65535, 0);
            if (null == var3) {
               return null;
            }

            if (var14) {
               var3.method6074();
            }

            ObjectDefinition_cachedModelData.put(var3, var12);
         }
      }

      boolean var10;
      if (128 == this.modelSizeX * -274284999 && 128 == this.modelHeight * 848811507 && 128 == -914257931 * this.modelSizeY) {
         var10 = false;
      } else {
         var10 = true;
      }

      boolean var13;
      if (0 == this.offsetX * -671892153 && this.offsetHeight * -1044268523 == 0 && this.offsetY * 1580309641 == 0) {
         var13 = false;
      } else {
         var13 = true;
      }

      ModelData var15 = new ModelData(var3, var2 == 0 && !var10 && !var13, null == this.recolorFrom, null == this.retextureFrom, true);
      if (4 == var1 && var2 > 3) {
         var15.method6061(256);
         ModelData.method6104(var15, 45, 0, -45);
      }

      var2 &= 3;
      if (var2 == 1) {
         var15.method6107();
      } else if (2 == var2) {
         var15.method6103();
      } else if (3 == var2) {
         var15.method6112();
      }

      if (this.recolorFrom != null) {
         for (int var16 = 0; var16 < this.recolorFrom.length; var16++) {
            var15.recolor(this.recolorFrom[var16], this.recolorTo[var16]);
         }
      }

      if (null != this.retextureFrom) {
         for (int var17 = 0; var17 < this.retextureFrom.length; var17++) {
            ModelData.method6071(var15, this.retextureFrom[var17], this.retextureTo[var17]);
         }
      }

      if (var10) {
         var15.resize(this.modelSizeX * -274284999, this.modelHeight * 848811507, -914257931 * this.modelSizeY);
      }

      if (var13) {
         ModelData.method6104(var15, this.offsetX * -671892153, -1044268523 * this.offsetHeight, 1580309641 * this.offsetY);
      }

      return var15;
   }

   @ObfuscatedSignature(descriptor = "(Liv;III)I")
   @ObfuscatedName("cz")
   public static int method5175(ObjectComposition var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.getIntParam(var1, var1, var1);
      }

      try {
         return class108.method3858(var0.params, var1, var2, -2096378545);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "iv.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("be")
   void method5151(Buffer var1, int var2) {
      if (1 == var2) {
         int var3 = var1.readUnsignedByte(-195680815);
         if (var3 > 0) {
            if (null != this.modelIds && !ObjectDefinition_isLowDetail) {
               var1.offset += 930339743 * var3;
            } else {
               this.models = new int[var3];
               this.modelIds = new int[var3];

               for (int var4 = 0; var4 < var3; var4++) {
                  this.modelIds[var4] = Buffer.method12008(var1, (byte)5);
                  this.models[var4] = var1.readUnsignedByte(1541789404);
               }
            }
         }
      } else if (var2 == 2) {
         this.name = var1.readStringCp1252NullCircumfixed(-19414387);
      } else if (5 == var2) {
         int var6 = var1.readUnsignedByte(1351666185);
         if (var6 > 0) {
            if (this.modelIds != null && !ObjectDefinition_isLowDetail) {
               var1.offset += -1848953298 * var6;
            } else {
               this.models = null;
               this.modelIds = new int[var6];

               for (int var12 = 0; var12 < var6; var12++) {
                  this.modelIds[var12] = Buffer.method12008(var1, (byte)5);
               }
            }
         }
      } else if (14 == var2) {
         this.sizeX = var1.readUnsignedByte(490193888) * -1859339470;
      } else if (var2 == 15) {
         this.sizeY = var1.readUnsignedByte(957357870) * 434524193;
      } else if (var2 == 17) {
         this.interactType = 0;
         this.boolean1 = false;
      } else if (18 == var2) {
         this.boolean1 = false;
      } else if (19 == var2) {
         this.int1 = var1.readUnsignedByte(676362521) * 1127989223;
      } else if (var2 == 21) {
         this.clipType = 0;
      } else if (22 == var2) {
         this.nonFlatShading = true;
      } else if (23 == var2) {
         this.modelClipped = true;
      } else if (24 == var2) {
         this.animationId = Buffer.method12008(var1, (byte)5) * -1657420237;
         if (this.animationId * -1032194285 == 170614836) {
            this.animationId = 685169129;
         }
      } else if (var2 == 27) {
         this.interactType = -383954410;
      } else if (28 == var2) {
         this.int2 = var1.readUnsignedByte(-566592515) * 765596469;
      } else if (29 == var2) {
         this.ambient = Buffer.method12001(var1, (byte)107) * -365302667;
      } else if (var2 == 2006715871) {
         this.contrast = Buffer.method12001(var1, (byte)7) * 1391721847;
      } else if (var2 >= 30 && var2 < 35) {
         this.actions[var2 - 30] = var1.readStringCp1252NullCircumfixed(-1664386982);
         if (this.actions[var2 - 30].equalsIgnoreCase(Strings.field4856)) {
            this.actions[var2 - 30] = null;
         }
      } else if (var2 == -1633749472) {
         int var7 = var1.readUnsignedByte(12259181);
         this.recolorFrom = new short[var7];
         this.recolorTo = new short[var7];

         for (int var13 = 0; var13 < var7; var13++) {
            this.recolorFrom[var13] = (short)Buffer.method12008(var1, (byte)5);
            this.recolorTo[var13] = (short)Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 == -1883980181) {
         int var8 = var1.readUnsignedByte(900757134);
         this.retextureFrom = new short[var8];
         this.retextureTo = new short[var8];

         for (int var14 = 0; var14 < var8; var14++) {
            this.retextureFrom[var14] = (short)Buffer.method12008(var1, (byte)5);
            this.retextureTo[var14] = (short)Buffer.method12008(var1, (byte)5);
         }
      } else if (1530975784 == var2) {
         Buffer.method12008(var1, (byte)5);
      } else if (var2 == 1548863971) {
         this.isRotated = true;
      } else if (var2 == 64) {
         this.clipped = false;
      } else if (65 == var2) {
         this.modelSizeX = Buffer.method12008(var1, (byte)5) * -314716151;
      } else if (66 == var2) {
         this.modelHeight = Buffer.method12008(var1, (byte)5) * -1027683525;
      } else if (67 == var2) {
         this.modelSizeY = Buffer.method12008(var1, (byte)5) * 932555869;
      } else if (var2 == -1365243245) {
         this.mapSceneId = Buffer.method12008(var1, (byte)5) * -1140107735;
      } else if (var2 == 69) {
         var1.readUnsignedByte(1313369581);
      } else if (var2 == 1260997897) {
         this.offsetX = var1.readShort((byte)-114) * -1113138057;
      } else if (1083163633 == var2) {
         this.offsetHeight = var1.readShort((byte)-112) * 263589594;
      } else if (-880157222 == var2) {
         this.offsetY = var1.readShort((byte)-33) * -1797744199;
      } else if (73 == var2) {
         this.boolean2 = true;
      } else if (74 == var2) {
         this.isSolid = true;
      } else if (var2 == -1084795164) {
         this.int3 = var1.readUnsignedByte(440096440) * 652511918;
      } else if (var2 == -275194757 || var2 == 432787666) {
         this.transformVarbit = Buffer.method12008(var1, (byte)5) * 1542503386;
         if (this.transformVarbit * 1215770920 == -1413283859) {
            this.transformVarbit = -202669531;
         }

         this.transformVarp = Buffer.method12008(var1, (byte)5) * -326958533;
         if (-1059071400 == 1406043891 * this.transformVarp) {
            this.transformVarp = 326958533;
         }

         int var11 = -1;
         if (965017437 == var2) {
            var11 = Buffer.method12008(var1, (byte)5);
            if (65535 == var11) {
               var11 = -1;
            }
         }

         int var16 = var1.readUnsignedByte(-318139221);
         this.transforms = new int[2 + var16];

         for (int var5 = 0; var5 <= var16; var5++) {
            this.transforms[var5] = Buffer.method12008(var1, (byte)5);
            if (442010224 == this.transforms[var5]) {
               this.transforms[var5] = -1;
            }
         }

         this.transforms[1 + var16] = var11;
      } else if (78 == var2) {
         this.ambientSoundId = Buffer.method12008(var1, (byte)5) * -1691433152;
         this.int7 = var1.readUnsignedByte(716312008) * 1058055821;
         this.int8 = var1.readUnsignedByte(1377731065) * -1225608668;
      } else if (79 == var2) {
         this.int5 = Buffer.method12008(var1, (byte)5) * 1967170594;
         this.int6 = Buffer.method12008(var1, (byte)5) * -1269119776;
         this.int7 = var1.readUnsignedByte(1267242415) * -1846595961;
         this.int8 = var1.readUnsignedByte(-190585125) * 613196815;
         int var9 = var1.readUnsignedByte(-1235750954);
         this.soundEffectIds = new int[var9];

         for (int var15 = 0; var15 < var9; var15++) {
            this.soundEffectIds[var15] = Buffer.method12008(var1, (byte)5);
         }
      } else if (var2 == 81) {
         this.clipType = var1.readUnsignedByte(631353807) * 263456996;
      } else if (var2 == 932713272) {
         this.mapIconId = Buffer.method12008(var1, (byte)5) * 1244549305;
      } else if (var2 == 89) {
         this.boolean3 = false;
      } else if (var2 == 551932254) {
         this.field2696 = true;
      } else if (var2 == -1328893037) {
         this.field2687 = class358.method7866(var1.readUnsignedByte(-600610474), -877747654);
      } else if (var2 == 93) {
         this.field2662 = class358.method7866(var1.readUnsignedByte(1469973742), -1127537263);
         this.field2660 = Buffer.method12008(var1, (byte)5) * -1419917095;
         this.field2691 = class358.method7866(var1.readUnsignedByte(-534672683), -1682993608);
         this.field2689 = Buffer.method12008(var1, (byte)5) * 1165170643;
      } else if (-1479796994 == var2) {
         this.params = class406.readStringIntParameters(var1, this.params, (byte)-84);
      } else if (94 != var2 && var2 == 95) {
         class402[] var10 = new class402[]{class402.field5240, class402.field5241, class402.field5242};
         this.field2673 = (class402)GrandExchangeOffer.findEnumerated(var10, var1.readUnsignedByte(464596436), (byte)1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liv;Lxa;I)V")
   @ObfuscatedName("se")
   public static void method5152(ObjectComposition var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.setValue(var2, var2);
      } else {
         if (1 == var2) {
            int var3 = var1.readUnsignedByte(-182674885);
            if (var3 > 0) {
               if (null != var0.modelIds && !ObjectDefinition_isLowDetail) {
                  var1.offset += 930339743 * var3;
               } else {
                  var0.models = new int[var3];
                  var0.modelIds = new int[var3];

                  for (int var4 = 0; var4 < var3; var4++) {
                     var0.modelIds[var4] = Buffer.method12008(var1, (byte)5);
                     var0.models[var4] = var1.readUnsignedByte(1167540191);
                  }
               }
            }
         } else if (var2 == 2) {
            var0.name = var1.readStringCp1252NullCircumfixed(1189685943);
         } else if (5 == var2) {
            int var6 = var1.readUnsignedByte(1493203007);
            if (var6 > 0) {
               if (var0.modelIds != null && !ObjectDefinition_isLowDetail) {
                  var1.offset += -811429270 * var6;
               } else {
                  var0.models = null;
                  var0.modelIds = new int[var6];

                  for (int var12 = 0; var12 < var6; var12++) {
                     var0.modelIds[var12] = Buffer.method12008(var1, (byte)5);
                  }
               }
            }
         } else if (14 == var2) {
            var0.sizeX = var1.readUnsignedByte(-618674856) * 98251817;
         } else if (var2 == 15) {
            var0.sizeY = var1.readUnsignedByte(890795729) * 434524193;
         } else if (var2 == 17) {
            var0.interactType = 0;
            var0.boolean1 = false;
         } else if (18 == var2) {
            var0.boolean1 = false;
         } else if (19 == var2) {
            var0.int1 = var1.readUnsignedByte(204150576) * -591515787;
         } else if (var2 == 21) {
            var0.clipType = 0;
         } else if (22 == var2) {
            var0.nonFlatShading = true;
         } else if (23 == var2) {
            var0.modelClipped = true;
         } else if (24 == var2) {
            var0.animationId = Buffer.method12008(var1, (byte)5) * -1657420237;
            if (var0.animationId * 930784507 == 65535) {
               var0.animationId = 1657420237;
            }
         } else if (var2 == 27) {
            var0.interactType = 208019815;
         } else if (28 == var2) {
            var0.int2 = var1.readUnsignedByte(2040764382) * 765596469;
         } else if (29 == var2) {
            var0.ambient = Buffer.method12001(var1, (byte)108) * -365302667;
         } else if (var2 == 39) {
            var0.contrast = Buffer.method12001(var1, (byte)50) * 480270427;
         } else if (var2 >= 30 && var2 < 35) {
            var0.actions[var2 - 30] = var1.readStringCp1252NullCircumfixed(-1528428595);
            if (var0.actions[var2 - 30].equalsIgnoreCase(Strings.field4856)) {
               var0.actions[var2 - 30] = null;
            }
         } else if (var2 == 40) {
            int var7 = var1.readUnsignedByte(-983173200);
            var0.recolorFrom = new short[var7];
            var0.recolorTo = new short[var7];

            for (int var13 = 0; var13 < var7; var13++) {
               var0.recolorFrom[var13] = (short)Buffer.method12008(var1, (byte)5);
               var0.recolorTo[var13] = (short)Buffer.method12008(var1, (byte)5);
            }
         } else if (var2 == 41) {
            int var8 = var1.readUnsignedByte(478908327);
            var0.retextureFrom = new short[var8];
            var0.retextureTo = new short[var8];

            for (int var14 = 0; var14 < var8; var14++) {
               var0.retextureFrom[var14] = (short)Buffer.method12008(var1, (byte)5);
               var0.retextureTo[var14] = (short)Buffer.method12008(var1, (byte)5);
            }
         } else if (61 == var2) {
            Buffer.method12008(var1, (byte)5);
         } else if (var2 == 62) {
            var0.isRotated = true;
         } else if (var2 == 64) {
            var0.clipped = false;
         } else if (65 == var2) {
            var0.modelSizeX = Buffer.method12008(var1, (byte)5) * -314716151;
         } else if (66 == var2) {
            var0.modelHeight = Buffer.method12008(var1, (byte)5) * -1027683525;
         } else if (67 == var2) {
            var0.modelSizeY = Buffer.method12008(var1, (byte)5) * 932555869;
         } else if (var2 == 68) {
            var0.mapSceneId = Buffer.method12008(var1, (byte)5) * -1140107735;
         } else if (var2 == 69) {
            var1.readUnsignedByte(27363360);
         } else if (var2 == 70) {
            var0.offsetX = var1.readShort((byte)-121) * -1113138057;
         } else if (71 == var2) {
            var0.offsetHeight = var1.readShort((byte)-111) * -1112324803;
         } else if (72 == var2) {
            var0.offsetY = var1.readShort((byte)-85) * -1797744199;
         } else if (73 == var2) {
            var0.boolean2 = true;
         } else if (74 == var2) {
            var0.isSolid = true;
         } else if (var2 == 75) {
            var0.int3 = var1.readUnsignedByte(-245447529) * -717080919;
         } else if (var2 == 77 || var2 == 92) {
            var0.transformVarbit = Buffer.method12008(var1, (byte)5) * 202669531;
            if (var0.transformVarbit * -753060269 == 65535) {
               var0.transformVarbit = -202669531;
            }

            var0.transformVarp = Buffer.method12008(var1, (byte)5) * -326958533;
            if (65535 == 1406043891 * var0.transformVarp) {
               var0.transformVarp = 326958533;
            }

            int var11 = -1;
            if (92 == var2) {
               var11 = Buffer.method12008(var1, (byte)5);
               if (65535 == var11) {
                  var11 = -1;
               }
            }

            int var16 = var1.readUnsignedByte(-1193462722);
            var0.transforms = new int[2 + var16];

            for (int var5 = 0; var5 <= var16; var5++) {
               var0.transforms[var5] = Buffer.method12008(var1, (byte)5);
               if (65535 == var0.transforms[var5]) {
                  var0.transforms[var5] = -1;
               }
            }

            var0.transforms[1 + var16] = var11;
         } else if (78 == var2) {
            var0.ambientSoundId = Buffer.method12008(var1, (byte)5) * 1543321215;
            var0.int7 = var1.readUnsignedByte(-237050119) * 1058055821;
            var0.int8 = var1.readUnsignedByte(36011249) * 613196815;
         } else if (79 == var2) {
            var0.int5 = Buffer.method12008(var1, (byte)5) * -1230482209;
            var0.int6 = Buffer.method12008(var1, (byte)5) * -197720233;
            var0.int7 = var1.readUnsignedByte(-416432877) * 1058055821;
            var0.int8 = var1.readUnsignedByte(268222069) * 613196815;
            int var9 = var1.readUnsignedByte(-826260259);
            var0.soundEffectIds = new int[var9];

            for (int var15 = 0; var15 < var9; var15++) {
               var0.soundEffectIds[var15] = Buffer.method12008(var1, (byte)5);
            }
         } else if (var2 == 81) {
            var0.clipType = var1.readUnsignedByte(1521006381) * 1589262592;
         } else if (var2 == 82) {
            var0.mapIconId = Buffer.method12008(var1, (byte)5) * 1244549305;
         } else if (var2 == 89) {
            var0.boolean3 = false;
         } else if (var2 == 90) {
            var0.field2696 = true;
         } else if (var2 == 91) {
            var0.field2687 = class358.method7866(var1.readUnsignedByte(1901930523), -352060885);
         } else if (var2 == 93) {
            var0.field2662 = class358.method7866(var1.readUnsignedByte(1505789432), -2139595647);
            var0.field2660 = Buffer.method12008(var1, (byte)5) * -1419917095;
            var0.field2691 = class358.method7866(var1.readUnsignedByte(640630829), -1372850847);
            var0.field2689 = Buffer.method12008(var1, (byte)5) * -829794815;
         } else if (249 == var2) {
            var0.params = class406.readStringIntParameters(var1, var0.params, (byte)1);
         } else if (94 != var2 && var2 == 95) {
            class402[] var10 = new class402[]{class402.field5240, class402.field5241, class402.field5242};
            var0.field2673 = (class402)GrandExchangeOffer.findEnumerated(var10, var1.readUnsignedByte(985307443), (byte)1);
         }
      }
   }

   public String getName() {
      return this.name;
   }

   @ObfuscatedSignature(descriptor = "(II[[IIII)Ljz;")
   @ObfuscatedName("bm")
   public final Renderable method5163(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.models == null) {
         var7 = (this.id * -965498101 << 10) + var2;
      } else {
         var7 = (-965498101 * this.id << 10) + (var1 << 3) + var2;
      }

      Object var9 = (Renderable)class402.method8806(ObjectDefinition_cachedEntities, var7);
      if (var9 == null) {
         ModelData var10 = method5186(this, var1, var2, (byte)0);
         if (null == var10) {
            return null;
         }

         if (!this.nonFlatShading) {
            var9 = ModelData.method6106(var10, 64 + 69436381 * this.ambient, this.contrast * -706784357 + 768, -50, -10, -50);
         } else {
            var10.ambient = (short)(69436381 * this.ambient + 64);
            var10.contrast = (short)(768 + this.contrast * -706784357);
            var10.calculateVertexNormals();
            var9 = var10;
         }

         ObjectDefinition_cachedEntities.put((DualNode)var9, var7);
      }

      if (this.nonFlatShading) {
         var9 = ModelData.method6048((ModelData)var9);
      }

      if (this.clipType * 135730185 >= 0) {
         if (var9 instanceof Model) {
            var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, 135730185 * this.clipType);
         } else if (var9 instanceof ModelData) {
            var9 = ((ModelData)var9).method6049(var3, var4, var5, var6, true, 135730185 * this.clipType);
         }
      }

      return (Renderable)var9;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("tz")
   public int method5194() {
      return this.sizeX * 1813358617;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bs")
   public final boolean method5155(int var1) {
      if (this.models != null) {
         for (int var4 = 0; var4 < this.models.length; var4++) {
            if (var1 == this.models[var4]) {
               return SecureRandomCallable.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0, 756705879);
            }
         }

         return true;
      } else if (this.modelIds == null) {
         return true;
      } else if (10 != var1) {
         return true;
      } else {
         boolean var2 = true;

         for (int var3 = 0; var3 < this.modelIds.length; var3++) {
            var2 &= SecureRandomCallable.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0, 756705879);
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ak")
   public final boolean needsModelFiles(int var1) {
      if (this.models != null) {
         for (int var4 = 0; var4 < this.models.length; var4++) {
            if (var1 == this.models[var4]) {
               return SecureRandomCallable.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0, 756705879);
            }
         }

         return true;
      } else if (this.modelIds == null) {
         return true;
      } else if (10 != var1) {
         return true;
      } else {
         boolean var2 = true;

         for (int var3 = 0; var3 < this.modelIds.length; var3++) {
            var2 &= SecureRandomCallable.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0, 756705879);
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(II[[IIII)Ljz;")
   @ObfuscatedName("bb")
   public final Renderable method5164(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.models == null) {
         var7 = (this.id * -965498101 << 10) + var2;
      } else {
         var7 = (-965498101 * this.id << 10) + (var1 << 3) + var2;
      }

      Object var9 = (Renderable)class402.method8806(ObjectDefinition_cachedEntities, var7);
      if (var9 == null) {
         ModelData var10 = method5186(this, var1, var2, (byte)0);
         if (null == var10) {
            return null;
         }

         if (!this.nonFlatShading) {
            var9 = ModelData.method6106(var10, 64 + 69436381 * this.ambient, this.contrast * -706784357 + 768, -50, -10, -50);
         } else {
            var10.ambient = (short)(69436381 * this.ambient + 64);
            var10.contrast = (short)(768 + this.contrast * -706784357);
            var10.calculateVertexNormals();
            var9 = var10;
         }

         ObjectDefinition_cachedEntities.put((DualNode)var9, var7);
      }

      if (this.nonFlatShading) {
         var9 = ModelData.method6048((ModelData)var9);
      }

      if (this.clipType * 135730185 >= 0) {
         if (var9 instanceof Model) {
            var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, 135730185 * this.clipType);
         } else if (var9 instanceof ModelData) {
            var9 = ((ModelData)var9).method6049(var3, var4, var5, var6, true, 135730185 * this.clipType);
         }
      }

      return (Renderable)var9;
   }

   public void setParams(IterableHashTable var1) {
      this.params = (IterableNodeHashTable)var1;
   }

   @ObfuscatedSignature(descriptor = "()Liv;")
   @ObfuscatedName("by")
   public final ObjectComposition method5173() {
      int var1 = -1;
      if (this.transformVarbit * -753060269 != -1) {
         var1 = WorldMapData_1.getVarbit(-753060269 * this.transformVarbit, 1626540358);
      } else if (-1 != this.transformVarp * 1406043891) {
         var1 = Varps.Varps_main[1406043891 * this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? AsyncHttpResponse.getObjectDefinition(var2, 2061353297) : null;
   }

   @ObfuscatedSignature(descriptor = "(II[[IIII)Lky;")
   @ObfuscatedName("bt")
   public final Model method5168(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (null == this.models) {
         var7 = var2 + (this.id * 1808026397 << 10);
      } else {
         var7 = var2 + (var1 << 3) + (this.id * 2021543486 << 10);
      }

      Model var9 = (Model)class402.method8806(ObjectDefinition_cachedModels, var7);
      if (var9 == null) {
         ModelData var10 = method5186(this, var1, var2, (byte)0);
         if (null == var10) {
            return null;
         }

         var9 = ModelData.method6106(var10, 69436381 * this.ambient + 64, 768 + this.contrast * -706784357, -50, -10, -50);
         ObjectDefinition_cachedModels.put(var9, var7);
      }

      if (453502126 * this.clipType >= 0) {
         var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType * 1266562719);
      }

      return var9;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bk")
   public final boolean method5160() {
      if (null == this.modelIds) {
         return true;
      } else {
         boolean var1 = true;

         for (int var2 = 0; var2 < this.modelIds.length; var2++) {
            var1 &= SecureRandomCallable.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0, 756705879);
         }

         return var1;
      }
   }

   ObjectComposition() {
      this.boolean1 = true;
      this.int1 = 591515787;
      this.clipType = -996063801;
      this.nonFlatShading = false;
      this.modelClipped = false;
      this.animationId = 1657420237;
      this.int2 = -635358384;
      this.ambient = 0;
      this.contrast = 0;
      this.actions = new String[5];
      this.mapIconId = -1244549305;
      this.mapSceneId = 1140107735;
      this.isRotated = false;
      this.clipped = true;
      this.modelSizeX = -1628961664;
      this.modelHeight = 1600494976;
      this.modelSizeY = -891933056;
      this.offsetX = 0;
      this.offsetHeight = 0;
      this.offsetY = 0;
      this.boolean2 = false;
      this.isSolid = false;
      this.int3 = 717080919;
      this.transformVarbit = -202669531;
      this.transformVarp = 326958533;
      this.ambientSoundId = -1543321215;
      this.int7 = 0;
      this.int8 = 0;
      this.field2687 = field2646;
      this.field2660 = -773366196;
      this.field2689 = 169658668;
      this.field2662 = field2655;
      this.field2691 = field2649;
      this.field2673 = class402.field5241;
      this.int5 = 0;
      this.int6 = 0;
      this.boolean3 = true;
      this.field2696 = false;
   }

   @ObfuscatedSignature(descriptor = "(Lrl19;II[[IIIILiw;I)Lky;")
   @ObfuscatedName("dm")
   public Model method5190(
      @Nullable rl19 param1,
      int nullx,
      int nullxx,
      int[][] nullxxx,
      int nullxxxx,
      int nullxxxxx,
      int nullxxxxxx,
      SequenceDefinition nullxxxxxxx,
      int nullxxxxxxxx
   ) {
      long var10;
      if (this.models == null) {
         var10 = nullxx + (this.id * -965498101 << 10);
      } else {
         var10 = nullxx + (nullx << 3) + (this.id * -965498101 << 10);
      }

      Model var12;
      synchronized (ObjectDefinition_cachedModels) {
         var12 = (Model)ObjectDefinition_cachedModels.method7390(var10);
      }

      if (var12 == null) {
         ModelData var18 = this.method5193(nullx, nullxx);
         if (var18 == null) {
            return null;
         }

         var12 = var18.method6119(this.ambient * 69436381 + 64, this.contrast * -706784357 + 768, -50, -10, -50);
         synchronized (ObjectDefinition_cachedModels) {
            ObjectDefinition_cachedModels.method7391(var12, var10);
         }
      }

      if (nullxxxxxxx == null && this.clipType * 135730185 == -1) {
         return var12;
      } else {
         if (nullxxxxxxx != null) {
            assert var1 != null;

            var12 = nullxxxxxxx.method5270(var1, var12, nullxxxxxxxx, nullxx);
         } else if (var1 != null) {
            var12 = var12.method6859(var1, true);
         }

         if (this.clipType * 135730185 >= 0 && nullxxx != null) {
            var12 = var12.method6891(nullxxx, nullxxxx, nullxxxxx, nullxxxxxx, var1 == null, this.clipType * 135730185);
         }

         return var12;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liv;)V")
   @ObfuscatedName("lb")
   public static void method5144(ObjectComposition var0) {
      if (-1 == var0.int1 * -1900812067) {
         var0.int1 = 0;
         if (null != var0.modelIds && (null == var0.models || 10 == var0.models[0])) {
            var0.int1 = -591515787;
         }

         for (int var1 = 0; var1 < 5; var1++) {
            if (var0.actions[var1] != null) {
               var0.int1 = -591515787;
            }
         }
      }

      if (1768476057 * var0.int3 == -1) {
         var0.int3 = -717080919 * (var0.interactType * 756705879 != 0 ? 1 : 0);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bl")
   public String method5179(int var1, String var2) {
      return Projectile.method1418(this.params, var1, var2, -43875302);
   }

   @ObfuscatedSignature(descriptor = "()Liv;")
   @ObfuscatedName("bw")
   public final ObjectComposition method5174() {
      int var1 = -1;
      if (this.transformVarbit * -753060269 != -1) {
         var1 = WorldMapData_1.getVarbit(-753060269 * this.transformVarbit, 306299713);
      } else if (-1 != this.transformVarp * 1406043891) {
         var1 = Varps.Varps_main[1406043891 * this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? AsyncHttpResponse.getObjectDefinition(var2, 1993316843) : null;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bf")
   public int method5176(int var1, int var2) {
      return class108.method3858(this.params, var1, var2, -1660617309);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ao")
   void method5149(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(1754432473);
         if (0 == var2) {
            return;
         }

         method5154(this, var1, var2, -1481714301);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("br")
   public String method5180(int var1, String var2) {
      return Projectile.method1418(this.params, var1, var2, -1664691306);
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bh")
   public String method5181(int var1, String var2) {
      return Projectile.method1418(this.params, var1, var2, -1787033938);
   }

   public void setValue(int var1, String var2) {
      this.method5191(var1, new ObjectNode(var2));
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("io")
   public boolean method5195() {
      return this.hasSound(503720603);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liv;)V")
   @ObfuscatedName("ct")
   public static void method5145(ObjectComposition var0) {
      if (var0 == null) {
         var0.method5146();
      } else {
         if (-1 == var0.int1 * -1900812067) {
            var0.int1 = 0;
            if (null != var0.modelIds && (null == var0.models || 10 == var0.models[0])) {
               var0.int1 = -591515787;
            }

            for (int var1 = 0; var1 < 5; var1++) {
               if (var0.actions[var1] != null) {
                  var0.int1 = -591515787;
               }
            }
         }

         if (1768476057 * var0.int3 == -1) {
            var0.int3 = -717080919 * (var0.interactType * 756705879 != 0 ? 1 : 0);
         }
      }
   }

   public void setMapSceneId(int var1) {
      this.mapSceneId = var1 * -1140107735;
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("aj")
   public final boolean method5157(int var1, byte var2) {
      try {
         if (this.models == null) {
            if (this.modelIds == null) {
               if (var2 <= 14) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else if (10 != var1) {
               if (var2 <= 14) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               boolean var6 = true;

               for (int var4 = 0; var4 < this.modelIds.length; var4++) {
                  if (var2 <= 14) {
                     throw new IllegalStateException();
                  }

                  var6 &= SecureRandomCallable.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0, 756705879);
               }

               return var6;
            }
         } else {
            for (int var3 = 0; var3 < this.models.length; var3++) {
               if (var2 <= 14) {
                  throw new IllegalStateException();
               }

               if (var1 == this.models[var3]) {
                  if (var2 <= 14) {
                     throw new IllegalStateException();
                  }

                  return SecureRandomCallable.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0, 756705879);
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "iv.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bc")
   public boolean method5183() {
      if (null == this.transforms) {
         return -1 != 1760798639 * this.ambientSoundId || this.soundEffectIds != null;
      } else {
         for (int var1 = 0; var1 < this.transforms.length; var1++) {
            if (this.transforms[var1] != -1) {
               ObjectComposition var2 = AsyncHttpResponse.getObjectDefinition(this.transforms[var1], 1987900983);
               if (-1194817153 * var2.ambientSoundId != -1 || var2.soundEffectIds != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("li")
   public void method5189() {
      if (this.clipType * 135730185 > 0 && (client.field997 & 16) == 0) {
         this.clipType = -1 * 996063801;
      }

      PostObjectComposition var1 = new PostObjectComposition(this);
      SecureUrlRequester.client.getCallbacks().post(var1);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bq")
   public boolean method5184() {
      if (null == this.transforms) {
         return -1 != 95221971 * this.ambientSoundId || this.soundEffectIds != null;
      } else {
         for (int var1 = 0; var1 < this.transforms.length; var1++) {
            if (this.transforms[var1] != -1) {
               ObjectComposition var2 = AsyncHttpResponse.getObjectDefinition(this.transforms[var1], 2123591829);
               if (-394709073 * var2.ambientSoundId != -1 || var2.soundEffectIds != null) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Liv;")
   @ObfuscatedName("fy")
   public static ObjectComposition method5196(int var0) {
      return AsyncHttpResponse.getObjectDefinition(var0, 2094555887);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liv;II[[IIII)Ljz;")
   @ObfuscatedName("ox")
   public static Renderable method5165(ObjectComposition var0, int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (var0.models == null) {
         var7 = (var0.id * -965498101 << 10) + var2;
      } else {
         var7 = (-965498101 * var0.id << 10) + (var1 << 3) + var2;
      }

      Object var9 = (Renderable)class402.method8806(ObjectDefinition_cachedEntities, var7);
      if (var9 == null) {
         ModelData var10 = method5186(var0, var1, var2, (byte)0);
         if (null == var10) {
            return null;
         }

         if (!var0.nonFlatShading) {
            var9 = ModelData.method6106(var10, 64 + 69436381 * var0.ambient, var0.contrast * -706784357 + 768, -50, -10, -50);
         } else {
            var10.ambient = (short)(69436381 * var0.ambient + 64);
            var10.contrast = (short)(768 + var0.contrast * -706784357);
            var10.calculateVertexNormals();
            var9 = var10;
         }

         ObjectDefinition_cachedEntities.put((DualNode)var9, var7);
      }

      if (var0.nonFlatShading) {
         var9 = ModelData.method6048((ModelData)var9);
      }

      if (var0.clipType * 135730185 >= 0) {
         if (var9 instanceof Model) {
            var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, 135730185 * var0.clipType);
         } else if (var9 instanceof ModelData) {
            var9 = ((ModelData)var9).method6049(var3, var4, var5, var6, true, 135730185 * var0.clipType);
         }
      }

      return (Renderable)var9;
   }

   @ObfuscatedSignature(descriptor = "()Liv;")
   @ObfuscatedName("fc")
   public ObjectComposition method5197() {
      return this.transform(2068375148);
   }

   @ObfuscatedSignature(descriptor = "(II[[IIIILiw;I)Lky;")
   @ObfuscatedName("bu")
   public final Model method5170(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
      long var9;
      if (this.models == null) {
         var9 = var2 + (-965498101 * this.id << 10);
      } else {
         var9 = var2 + (1160102014 * this.id << 10) + (var1 << 3);
      }

      Model var11 = (Model)class402.method8806(ObjectDefinition_cachedModels, var9);
      if (null == var11) {
         ModelData var12 = method5186(this, var1, var2, (byte)0);
         if (null == var12) {
            return null;
         }

         var11 = ModelData.method6106(var12, this.ambient * -454202796 + -262205709, 768 + 1737140580 * this.contrast, -2018765143, -1824989650, -2094765082);
         ObjectDefinition_cachedModels.put(var11, var9);
      }

      if (null == var7 && 135730185 * this.clipType == -1) {
         return var11;
      } else {
         if (null != var7) {
            var11 = var7.transformObjectModel(var11, var8, var2, (byte)8);
         } else {
            var11 = var11.toSharedSequenceModel(true);
         }

         if (1714810656 * this.clipType >= 0 && var3 != null) {
            var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType * -2017752726);
         }

         return var11;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dv")
   public boolean method5198() {
      return this.method5158(1882603197);
   }

   public String getStringValue(int var1) {
      Node var2 = this.method5188(var1);
      if (var2 != null) {
         ObjectNode var4 = (ObjectNode)var2;
         return (String)var4.method11288();
      } else {
         ParamComposition var3 = SecureUrlRequester.client.method2360(var1);
         if (!var3.method4972()) {
            throw new IllegalArgumentException("trying to get string from int param");
         } else {
            return var3.method4974();
         }
      }
   }

   public int getVarPlayerId() {
      return this.transformVarp * 1406043891;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("ae")
   void decodeNext(Buffer var1, int var2, int var3) {
      try {
         if (1 == var2) {
            if (var3 != -1481714301) {
               throw new IllegalStateException();
            }

            int var4 = var1.readVarInt(912536214);
            if (var4 > 0) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               if (null != this.modelIds) {
                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }

                  if (!ObjectDefinition_isLowDetail) {
                     var1.offset += 930339743 * var4;
                     return;
                  }
               }

               this.modelIds = new int[var4];
               this.models = new int[var4];

               for (int var5 = 0; var5 < var4; var5++) {
                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }

                  this.modelIds[var5] = Buffer.method12008(var1, (byte)5);
                  this.models[var5] = var1.method12183(1181942454);
               }
            }
         } else if (var2 == 2) {
            if (var3 != -1481714301) {
               return;
            }

            this.name = var1.readStringCp1252NullTerminatedOrNull(-1851314328);
         } else if (5 == var2) {
            int var8 = var1.readUnsignedByteAdd(250090925);
            if (var8 > 0) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               if (this.models != null) {
                  if (var3 != -1481714301) {
                     return;
                  }

                  if (!ObjectDefinition_isLowDetail) {
                     var1.offset += -811429270 * var8;
                     return;
                  }

                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }
               }

               this.models = null;
               this.models = new int[var8];

               for (int var14 = 0; var14 < var8; var14++) {
                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }

                  this.modelIds[var14] = Buffer.method12008(var1, (byte)5);
               }
            }
         } else if (14 == var2) {
            if (var3 != -1481714301) {
               throw new IllegalStateException();
            }

            this.int7 = var1.readShortLE(1897645730) * 98251817;
         } else if (var2 == 15) {
            if (var3 != -1481714301) {
               throw new IllegalStateException();
            }

            this.int5 = var1.readUnsignedByte(1684845990) * 434524193;
         } else if (var2 == 17) {
            if (var3 != -1481714301) {
               throw new IllegalStateException();
            }

            this.int5 = 0;
            this.boolean1 = false;
         } else if (18 == var2) {
            if (var3 != -1481714301) {
               throw new IllegalStateException();
            }

            this.boolean1 = false;
         } else if (19 == var2) {
            if (var3 != -1481714301) {
               return;
            }

            this.int8 = var1.readNullableLargeSmart(2075466908) * -591515787;
         } else if (var2 == 21) {
            this.contrast = 0;
         } else if (22 == var2) {
            this.isSolid = true;
         } else if (23 == var2) {
            this.field2696 = true;
         } else if (24 == var2) {
            if (var3 != -1481714301) {
               return;
            }

            this.int6 = Buffer.method12008(var1, (byte)5) * -1657420237;
            if (this.mapIconId * 930784507 == 65535) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               this.field2660 = 1657420237;
            }
         } else if (var2 == 27) {
            if (var3 != -1481714301) {
               return;
            }

            this.id = 208019815;
         } else if (28 == var2) {
            if (var3 != -1481714301) {
               throw new IllegalStateException();
            }

            this.field2660 = var1.readUnsignedByteAdd(668435719) * 765596469;
         } else if (29 == var2) {
            if (var3 != -1481714301) {
               throw new IllegalStateException();
            }

            this.ambient = Buffer.method12001(var1, (byte)69) * -365302667;
         } else if (var2 == 39) {
            if (var3 != -1481714301) {
               throw new IllegalStateException();
            }

            this.transformVarbit = Buffer.method12001(var1, (byte)99) * 480270427;
         } else {
            if (var2 >= 30) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               if (var2 < 35) {
                  this.actions[var2 - 30] = var1.readStringCp1252NullTerminatedOrNull(-1037307949);
                  if (this.actions[var2 - 30].equalsIgnoreCase(Strings.field4949)) {
                     if (var3 != -1481714301) {
                        throw new IllegalStateException();
                     }

                     this.actions[var2 - 30] = null;
                  }

                  return;
               }
            }

            if (var2 == 40) {
               if (var3 != -1481714301) {
                  return;
               }

               int var9 = var1.readSignedShort(-1671577109);
               this.retextureFrom = new short[var9];
               this.retextureTo = new short[var9];

               for (int var15 = 0; var15 < var9; var15++) {
                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }

                  this.retextureTo[var15] = (short)Buffer.method12008(var1, (byte)5);
                  this.recolorTo[var15] = (short)Buffer.method12008(var1, (byte)5);
               }
            } else if (var2 == 41) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               int var10 = var1.readUnsignedIntIME(-203664473);
               this.recolorFrom = new short[var10];
               this.recolorFrom = new short[var10];

               for (int var16 = 0; var16 < var10; var16++) {
                  if (var3 != -1481714301) {
                     return;
                  }

                  this.retextureTo[var16] = (short)Buffer.method12008(var1, (byte)5);
                  this.retextureTo[var16] = (short)Buffer.method12008(var1, (byte)5);
               }
            } else if (61 == var2) {
               if (var3 != -1481714301) {
                  return;
               }

               Buffer.method12008(var1, (byte)5);
            } else if (var2 == 62) {
               this.isSolid = true;
            } else if (var2 == 64) {
               this.boolean2 = false;
            } else if (65 == var2) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               this.modelSizeY = Buffer.method12008(var1, (byte)5) * -314716151;
            } else if (66 == var2) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               this.modelSizeY = Buffer.method12008(var1, (byte)5) * -1027683525;
            } else if (67 == var2) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               this.transformVarbit = Buffer.method12008(var1, (byte)5) * 932555869;
            } else if (var2 == 68) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               this.field2660 = Buffer.method12008(var1, (byte)5) * -1140107735;
            } else if (var2 == 69) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               var1.readNullableLargeSmart(-363859643);
            } else if (var2 == 70) {
               this.transformVarp = var1.readShort((byte)-11) * -1113138057;
            } else if (71 == var2) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               this.modelHeight = var1.method12174((byte)-94) * -1112324803;
            } else if (72 == var2) {
               if (var3 != -1481714301) {
                  return;
               }

               this.clipType = var1.method12174((byte)-44) * -1797744199;
            } else if (73 == var2) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               this.modelClipped = true;
            } else if (74 == var2) {
               if (var3 != -1481714301) {
                  return;
               }

               this.isSolid = true;
            } else if (var2 == 75) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               this.interactType = var1.readSignedShort(89727827) * -717080919;
            } else {
               if (var2 != 77) {
                  if (var2 != 92) {
                     if (78 == var2) {
                        this.int7 = Buffer.method12008(var1, (byte)5) * 1543321215;
                        this.mapSceneId = var1.readUnsignedByteAdd(-98449872) * 1058055821;
                        this.int5 = var1.method12075(1048963075) * 613196815;
                        return;
                     } else if (79 == var2) {
                        if (var3 != -1481714301) {
                           throw new IllegalStateException();
                        }

                        this.int5 = Buffer.method12008(var1, (byte)5) * -1230482209;
                        this.sizeX = Buffer.method12008(var1, (byte)5) * -197720233;
                        this.animationId = var1.readSignedShort(1691909641) * 1058055821;
                        this.sizeX = var1.readMedium(369323452) * 613196815;
                        int var12 = var1.readUnsignedByteNeg(1158650260);
                        this.soundEffectIds = new int[var12];

                        for (int var18 = 0; var18 < var12; var18++) {
                           if (var3 != -1481714301) {
                              throw new IllegalStateException();
                           }

                           this.soundEffectIds[var18] = Buffer.method12008(var1, (byte)5);
                        }

                        return;
                     } else if (var2 == 81) {
                        if (var3 != -1481714301) {
                           throw new IllegalStateException();
                        }

                        this.clipType = var1.readUnsignedShortAddLE(-1470624643) * 1589262592;
                        return;
                     } else if (var2 == 82) {
                        if (var3 != -1481714301) {
                           throw new IllegalStateException();
                        }

                        this.int5 = Buffer.method12008(var1, (byte)5) * 1244549305;
                        return;
                     } else if (var2 == 89) {
                        this.boolean3 = false;
                        return;
                     } else if (var2 == 90) {
                        if (var3 != -1481714301) {
                           throw new IllegalStateException();
                        }

                        this.boolean3 = true;
                        return;
                     } else if (var2 == 91) {
                        if (var3 != -1481714301) {
                           return;
                        }

                        this.field2662 = class358.method7866(var1.method12100(1877533945), -1670779494);
                        return;
                     } else if (var2 == 93) {
                        if (var3 != -1481714301) {
                           throw new IllegalStateException();
                        }

                        this.field2687 = class358.method7866(var1.method12075(2102275540), -956524701);
                        this.interactType = Buffer.method12008(var1, (byte)5) * -1419917095;
                        this.field2687 = class358.method7866(var1.method12075(483556316), -344002692);
                        this.int7 = Buffer.method12008(var1, (byte)5) * -829794815;
                        return;
                     } else if (249 == var2) {
                        this.params = class406.readStringIntParameters(var1, this.params, (byte)-69);
                        return;
                     } else {
                        if (94 == var2) {
                           if (var3 != -1481714301) {
                              return;
                           }
                        } else if (var2 == 95) {
                           if (var3 != -1481714301) {
                              throw new IllegalStateException();
                           }

                           class402[] var13 = new class402[]{class402.field5241, class402.field5240, class402.field5241};
                           this.field2673 = (class402)GrandExchangeOffer.findEnumerated(var13, var1.readUnsignedShortAddLE(-1643136536), (byte)1);
                           return;
                        }

                        return;
                     }
                  }

                  if (var3 != -1481714301) {
                     return;
                  }
               }

               this.offsetX = Buffer.method12008(var1, (byte)5) * 202669531;
               if (this.offsetX * -753060269 == 65535) {
                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }

                  this.transformVarbit = -202669531;
               }

               this.contrast = Buffer.method12008(var1, (byte)5) * -326958533;
               if (65535 == 1406043891 * this.modelSizeX) {
                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }

                  this.ambient = 326958533;
               }

               int var11 = -1;
               if (92 == var2) {
                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }

                  var11 = Buffer.method12008(var1, (byte)5);
                  if (65535 == var11) {
                     if (var3 != -1481714301) {
                        throw new IllegalStateException();
                     }

                     var11 = -1;
                  }
               }

               int var17 = var1.readUnsignedShortAdd(524180269);
               this.transforms = new int[2 + var17];

               for (int var6 = 0; var6 <= var17; var6++) {
                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }

                  this.soundEffectIds[var6] = Buffer.method12008(var1, (byte)5);
                  if (65535 == this.soundEffectIds[var6]) {
                     if (var3 != -1481714301) {
                        return;
                     }

                     this.soundEffectIds[var6] = -1;
                  }
               }

               this.transforms[1 + var17] = var11;
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "iv.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("gz")
   public int method5199() {
      return this.sizeY * -352504863;
   }

   public int[] getImpostorIds() {
      return this.transforms;
   }

   public void setValue(int var1, int var2) {
      this.method5191(var1, new IntegerNode(var2));
   }

   @ObfuscatedSignature(descriptor = "(II[[IIIILiw;IB)Lky;")
   @ObfuscatedName("ay")
   public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8, byte var9) {
      return this.method5190(rl19.field5583, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public String[] getActions() {
      return this.actions;
   }

   public int getMapIconId() {
      return this.mapIconId * -2059094647;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ad")
   public int getIntParam(int var1, int var2, int var3) {
      try {
         return class108.method3858(this.params, var1, var2, -2096378545);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "iv.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Liv;Lxa;II)V")
   @ObfuscatedName("tc")
   public static void method5154(ObjectComposition var0, Buffer var1, int var2, int var3) {
      if (var0 == null) {
         var0.decodeNext(var1, var2, var2);
      }

      try {
         if (1 == var2) {
            if (var3 != -1481714301) {
               throw new IllegalStateException();
            }

            int var4 = var1.readUnsignedByte(912536214);
            if (var4 > 0) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               if (null != var0.modelIds) {
                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }

                  if (!ObjectDefinition_isLowDetail) {
                     var1.offset += 930339743 * var4;
                     return;
                  }
               }

               var0.models = new int[var4];
               var0.modelIds = new int[var4];

               for (int var5 = 0; var5 < var4; var5++) {
                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }

                  var0.modelIds[var5] = Buffer.method12008(var1, (byte)5);
                  var0.models[var5] = var1.readUnsignedByte(1181942454);
               }
            }
         } else if (var2 == 2) {
            if (var3 != -1481714301) {
               return;
            }

            var0.name = var1.readStringCp1252NullCircumfixed(-1851314328);
         } else if (5 == var2) {
            int var8 = var1.readUnsignedByte(250090925);
            if (var8 > 0) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               if (var0.modelIds != null) {
                  if (var3 != -1481714301) {
                     return;
                  }

                  if (!ObjectDefinition_isLowDetail) {
                     var1.offset += -811429270 * var8;
                     return;
                  }

                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }
               }

               var0.models = null;
               var0.modelIds = new int[var8];

               for (int var14 = 0; var14 < var8; var14++) {
                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }

                  var0.modelIds[var14] = Buffer.method12008(var1, (byte)5);
               }
            }
         } else if (14 == var2) {
            if (var3 != -1481714301) {
               throw new IllegalStateException();
            }

            var0.sizeX = var1.readUnsignedByte(1897645730) * 98251817;
         } else if (var2 == 15) {
            if (var3 != -1481714301) {
               throw new IllegalStateException();
            }

            var0.sizeY = var1.readUnsignedByte(1684845990) * 434524193;
         } else if (var2 == 17) {
            if (var3 != -1481714301) {
               throw new IllegalStateException();
            }

            var0.interactType = 0;
            var0.boolean1 = false;
         } else if (18 == var2) {
            if (var3 != -1481714301) {
               throw new IllegalStateException();
            }

            var0.boolean1 = false;
         } else if (19 == var2) {
            if (var3 != -1481714301) {
               return;
            }

            var0.int1 = var1.readUnsignedByte(2075466908) * -591515787;
         } else if (var2 == 21) {
            var0.clipType = 0;
         } else if (22 == var2) {
            var0.nonFlatShading = true;
         } else if (23 == var2) {
            var0.modelClipped = true;
         } else if (24 == var2) {
            if (var3 != -1481714301) {
               return;
            }

            var0.animationId = Buffer.method12008(var1, (byte)5) * -1657420237;
            if (var0.animationId * 930784507 == 65535) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               var0.animationId = 1657420237;
            }
         } else if (var2 == 27) {
            if (var3 != -1481714301) {
               return;
            }

            var0.interactType = 208019815;
         } else if (28 == var2) {
            if (var3 != -1481714301) {
               throw new IllegalStateException();
            }

            var0.int2 = var1.readUnsignedByte(668435719) * 765596469;
         } else if (29 == var2) {
            if (var3 != -1481714301) {
               throw new IllegalStateException();
            }

            var0.ambient = Buffer.method12001(var1, (byte)69) * -365302667;
         } else if (var2 == 39) {
            if (var3 != -1481714301) {
               throw new IllegalStateException();
            }

            var0.contrast = Buffer.method12001(var1, (byte)99) * 480270427;
         } else {
            if (var2 >= 30) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               if (var2 < 35) {
                  var0.actions[var2 - 30] = var1.readStringCp1252NullCircumfixed(-1037307949);
                  if (var0.actions[var2 - 30].equalsIgnoreCase(Strings.field4856)) {
                     if (var3 != -1481714301) {
                        throw new IllegalStateException();
                     }

                     var0.actions[var2 - 30] = null;
                  }

                  return;
               }
            }

            if (var2 == 40) {
               if (var3 != -1481714301) {
                  return;
               }

               int var9 = var1.readUnsignedByte(-1671577109);
               var0.recolorFrom = new short[var9];
               var0.recolorTo = new short[var9];

               for (int var15 = 0; var15 < var9; var15++) {
                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }

                  var0.recolorFrom[var15] = (short)Buffer.method12008(var1, (byte)5);
                  var0.recolorTo[var15] = (short)Buffer.method12008(var1, (byte)5);
               }
            } else if (var2 == 41) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               int var10 = var1.readUnsignedByte(-203664473);
               var0.retextureFrom = new short[var10];
               var0.retextureTo = new short[var10];

               for (int var16 = 0; var16 < var10; var16++) {
                  if (var3 != -1481714301) {
                     return;
                  }

                  var0.retextureFrom[var16] = (short)Buffer.method12008(var1, (byte)5);
                  var0.retextureTo[var16] = (short)Buffer.method12008(var1, (byte)5);
               }
            } else if (61 == var2) {
               if (var3 != -1481714301) {
                  return;
               }

               Buffer.method12008(var1, (byte)5);
            } else if (var2 == 62) {
               var0.isRotated = true;
            } else if (var2 == 64) {
               var0.clipped = false;
            } else if (65 == var2) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               var0.modelSizeX = Buffer.method12008(var1, (byte)5) * -314716151;
            } else if (66 == var2) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               var0.modelHeight = Buffer.method12008(var1, (byte)5) * -1027683525;
            } else if (67 == var2) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               var0.modelSizeY = Buffer.method12008(var1, (byte)5) * 932555869;
            } else if (var2 == 68) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               var0.mapSceneId = Buffer.method12008(var1, (byte)5) * -1140107735;
            } else if (var2 == 69) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               var1.readUnsignedByte(-363859643);
            } else if (var2 == 70) {
               var0.offsetX = var1.readShort((byte)-11) * -1113138057;
            } else if (71 == var2) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               var0.offsetHeight = var1.readShort((byte)-94) * -1112324803;
            } else if (72 == var2) {
               if (var3 != -1481714301) {
                  return;
               }

               var0.offsetY = var1.readShort((byte)-44) * -1797744199;
            } else if (73 == var2) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               var0.boolean2 = true;
            } else if (74 == var2) {
               if (var3 != -1481714301) {
                  return;
               }

               var0.isSolid = true;
            } else if (var2 == 75) {
               if (var3 != -1481714301) {
                  throw new IllegalStateException();
               }

               var0.int3 = var1.readUnsignedByte(89727827) * -717080919;
            } else {
               if (var2 != 77) {
                  if (var2 != 92) {
                     if (78 == var2) {
                        var0.ambientSoundId = Buffer.method12008(var1, (byte)5) * 1543321215;
                        var0.int7 = var1.readUnsignedByte(-98449872) * 1058055821;
                        var0.int8 = var1.readUnsignedByte(1048963075) * 613196815;
                        return;
                     } else if (79 == var2) {
                        if (var3 != -1481714301) {
                           throw new IllegalStateException();
                        }

                        var0.int5 = Buffer.method12008(var1, (byte)5) * -1230482209;
                        var0.int6 = Buffer.method12008(var1, (byte)5) * -197720233;
                        var0.int7 = var1.readUnsignedByte(1691909641) * 1058055821;
                        var0.int8 = var1.readUnsignedByte(369323452) * 613196815;
                        int var12 = var1.readUnsignedByte(1158650260);
                        var0.soundEffectIds = new int[var12];

                        for (int var18 = 0; var18 < var12; var18++) {
                           if (var3 != -1481714301) {
                              throw new IllegalStateException();
                           }

                           var0.soundEffectIds[var18] = Buffer.method12008(var1, (byte)5);
                        }

                        return;
                     } else if (var2 == 81) {
                        if (var3 != -1481714301) {
                           throw new IllegalStateException();
                        }

                        var0.clipType = var1.readUnsignedByte(-1470624643) * 1589262592;
                        return;
                     } else if (var2 == 82) {
                        if (var3 != -1481714301) {
                           throw new IllegalStateException();
                        }

                        var0.mapIconId = Buffer.method12008(var1, (byte)5) * 1244549305;
                        return;
                     } else if (var2 == 89) {
                        var0.boolean3 = false;
                        return;
                     } else if (var2 == 90) {
                        if (var3 != -1481714301) {
                           throw new IllegalStateException();
                        }

                        var0.field2696 = true;
                        return;
                     } else if (var2 == 91) {
                        if (var3 != -1481714301) {
                           return;
                        }

                        var0.field2687 = class358.method7866(var1.readUnsignedByte(1877533945), -1670779494);
                        return;
                     } else if (var2 == 93) {
                        if (var3 != -1481714301) {
                           throw new IllegalStateException();
                        }

                        var0.field2662 = class358.method7866(var1.readUnsignedByte(2102275540), -956524701);
                        var0.field2660 = Buffer.method12008(var1, (byte)5) * -1419917095;
                        var0.field2691 = class358.method7866(var1.readUnsignedByte(483556316), -344002692);
                        var0.field2689 = Buffer.method12008(var1, (byte)5) * -829794815;
                        return;
                     } else if (249 == var2) {
                        var0.params = class406.readStringIntParameters(var1, var0.params, (byte)-69);
                        return;
                     } else {
                        if (94 == var2) {
                           if (var3 != -1481714301) {
                              return;
                           }
                        } else if (var2 == 95) {
                           if (var3 != -1481714301) {
                              throw new IllegalStateException();
                           }

                           class402[] var13 = new class402[]{class402.field5240, class402.field5241, class402.field5242};
                           var0.field2673 = (class402)GrandExchangeOffer.findEnumerated(var13, var1.readUnsignedByte(-1643136536), (byte)1);
                           return;
                        }

                        return;
                     }
                  }

                  if (var3 != -1481714301) {
                     return;
                  }
               }

               var0.transformVarbit = Buffer.method12008(var1, (byte)5) * 202669531;
               if (var0.transformVarbit * -753060269 == 65535) {
                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }

                  var0.transformVarbit = -202669531;
               }

               var0.transformVarp = Buffer.method12008(var1, (byte)5) * -326958533;
               if (65535 == 1406043891 * var0.transformVarp) {
                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }

                  var0.transformVarp = 326958533;
               }

               int var11 = -1;
               if (92 == var2) {
                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }

                  var11 = Buffer.method12008(var1, (byte)5);
                  if (65535 == var11) {
                     if (var3 != -1481714301) {
                        throw new IllegalStateException();
                     }

                     var11 = -1;
                  }
               }

               int var17 = var1.readUnsignedByte(524180269);
               var0.transforms = new int[2 + var17];

               for (int var6 = 0; var6 <= var17; var6++) {
                  if (var3 != -1481714301) {
                     throw new IllegalStateException();
                  }

                  var0.transforms[var6] = Buffer.method12008(var1, (byte)5);
                  if (65535 == var0.transforms[var6]) {
                     if (var3 != -1481714301) {
                        return;
                     }

                     var0.transforms[var6] = -1;
                  }
               }

               var0.transforms[1 + var17] = var11;
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "iv.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILvz;)V")
   @ObfuscatedName("br")
   public void method5191(int var1, Node var2) {
      ParamComposition var3 = SecureUrlRequester.client.method2360(var1);
      if (var3.method4972() != (var2 instanceof ObjectNode)) {
         if (var3.method4972()) {
            throw new IllegalArgumentException("trying to put int into string param");
         } else {
            throw new IllegalArgumentException("trying to put string into int param");
         }
      } else {
         if (this.getParams() == null) {
            this.setParams(new IterableNodeHashTable(16));
         }

         this.getParams().put(var2, var1);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   void method5146() {
      if (-1 == this.mapSceneId * -1900812067) {
         this.sizeY = 0;
         if (null != this.modelIds && (null == this.modelIds || 10 == this.modelIds[0])) {
            this.interactType = -591515787;
         }

         for (int var1 = 0; var1 < 5; var1++) {
            if (this.actions[var1] != null) {
               this.field2689 = -591515787;
            }
         }
      }

      if (1768476057 * this.field2689 == -1) {
         this.interactType = -717080919 * (this.animationId * 756705879 != 0 ? 1 : 0);
      }
   }

   public void setMapIconId(int var1) {
      this.mapIconId = var1 * 1244549305;
   }

   @ObfuscatedSignature(descriptor = "(II[[IIII)Ljz;")
   @ObfuscatedName("bp")
   public final Renderable method5166(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.models == null) {
         var7 = (this.field2689 * 1095054960 << 10) + var2;
      } else {
         var7 = (-965498101 * this.mapSceneId << 10) + (var1 << 3) + var2;
      }

      Object var9 = (Renderable)class402.method8806(ObjectDefinition_cachedModels, var7);
      if (var9 == null) {
         ModelData var10 = method5186(this, var1, var2, (byte)0);
         if (null == var10) {
            return null;
         }

         if (!this.isSolid) {
            var9 = ModelData.method6106(var10, 64 + 945261307 * this.modelHeight, this.transformVarbit * -54781908 + -1974629910, -50, -10, 987403700);
         } else {
            var10.contrast = (short)(69436381 * this.clipType + -307127247);
            var10.ambient = (short)(-62861840 + this.modelHeight * 203396339);
            var10.method6107();
            var9 = var10;
         }

         ObjectDefinition_cached.method7374((DualNode)var9, var7);
      }

      if (this.isSolid) {
         var9 = ModelData.method6048((ModelData)var9);
      }

      if (this.contrast * 1102315881 >= 0) {
         if (var9 instanceof Model) {
            var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, 135730185 * this.offsetY);
         } else if (var9 instanceof ModelData) {
            var9 = ((ModelData)var9).method6126(var3, var4, var5, var6, true, 1436933530 * this.ambient);
         }
      }

      return (Renderable)var9;
   }

   @ObfuscatedSignature(descriptor = "(IIB)Ljm;")
   @ObfuscatedName("au")
   final ModelData getModelData(int var1, int var2, byte var3) {
      synchronized (ObjectDefinition_cachedModelData) {
         int var8 = var2;
         int var7 = var1;
         ObjectComposition var6 = this;
         boolean var9 = false;

         ModelData var10000;
         try {
            ModelData var10 = null;
            if (null == var6.models) {
               if (var7 != 10) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               if (var6.models == null) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               boolean var11 = var6.isSolid;
               if (2 == var7) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  if (var8 > 3) {
                     if (var9) {
                        throw new IllegalStateException();
                     }

                     var11 = !var11;
                  }
               }

               int var12 = var6.models.length;

               for (int var13 = 0; var13 < var12; var13++) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  int var14 = var6.models[var13];
                  if (var11) {
                     if (var9) {
                        throw new IllegalStateException();
                     }

                     var14 += 65536;
                  }

                  var10 = (ModelData)class402.method8806(ObjectDefinition_cachedModelData, var14);
                  if (null == var10) {
                     if (var9) {
                        throw new IllegalStateException();
                     }

                     var10 = ModelData.method6019(SecureRandomCallable.ObjectDefinition_modelsArchive, var14 & 65535, 0);
                     if (var10 == null) {
                        if (var9) {
                           throw new IllegalStateException();
                        }

                        return null;
                     }

                     if (var11) {
                        if (var9) {
                           throw new IllegalStateException();
                        }

                        var10.method6056();
                     }

                     ObjectDefinition_cachedModelData.put(var10, var14);
                  }

                  if (var12 > 1) {
                     modelDataArray[var13] = var10;
                  }
               }

               if (var12 > 1) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  var10 = new ModelData(modelDataArray, var12);
               }
            } else {
               int var23 = -1;

               for (int var25 = 0; var25 < var6.modelIds.length; var25++) {
                  if (var7 == var6.modelIds[var25]) {
                     if (var9) {
                        throw new IllegalStateException();
                     }

                     var23 = var25;
                     break;
                  }
               }

               if (-1 == var23) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               int var26 = var6.models[var23];
               boolean var10001;
               if (var8 > 3) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               boolean var28 = var6.isRotated ^ var10001;
               if (var28) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  var26 += 65536;
               }

               var10 = (ModelData)class402.method8806(ObjectDefinition_cachedModelData, var26);
               if (var10 == null) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  var10 = ModelData.method6019(SecureRandomCallable.ObjectDefinition_modelsArchive, var26 & 65535, 0);
                  if (null == var10) {
                     if (var9) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  if (var28) {
                     var10.method6085();
                  }

                  ObjectDefinition_cachedModelData.method7391(var10, var26);
               }
            }

            boolean var24;
            label313: {
               if (128 == var6.offsetX * -274284999 && 128 == var6.modelHeight * 848811507) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  if (128 == -914257931 * var6.modelSizeY) {
                     var24 = false;
                     break label313;
                  }

                  if (var9) {
                     throw new IllegalStateException();
                  }
               }

               var24 = true;
            }

            boolean var27;
            label305: {
               if (0 == var6.ambient * -671892153) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  if (var6.offsetX * -1044268523 == 0) {
                     if (var6.ambient * 1580309641 == 0) {
                        var27 = false;
                        break label305;
                     }

                     if (var9) {
                        throw new IllegalStateException();
                     }
                  }
               }

               var27 = true;
            }

            boolean var10003;
            label297: {
               var10000 = new ModelData;
               if (var8 == 0) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  if (!var24 && !var27) {
                     if (var9) {
                        throw new IllegalStateException();
                     }

                     var10003 = true;
                     break label297;
                  }
               }

               var10003 = false;
            }

            boolean var10004;
            if (null == var6.recolorTo) {
               if (var9) {
                  throw new IllegalStateException();
               }

               var10004 = true;
            } else {
               var10004 = false;
            }

            boolean var10005;
            if (null == var6.retextureFrom) {
               if (var9) {
                  throw new IllegalStateException();
               }

               var10005 = true;
            } else {
               var10005 = false;
            }

            var10000./* $VF: Unable to resugar constructor */<init>(var10, var10003, var10004, var10005, true);
            ModelData var29 = var10000;
            if (4 == var7 && var8 > 3) {
               if (var9) {
                  throw new IllegalStateException();
               }

               var29.method6061(256);
               ModelData.method6104(var29, 45, 0, -45);
            }

            var8 &= 3;
            if (var8 == 1) {
               if (var9) {
                  throw new IllegalStateException();
               }

               var29.method6084();
            } else if (2 == var8) {
               if (var9) {
                  throw new IllegalStateException();
               }

               var29.method6130();
            } else if (3 == var8) {
               if (var9) {
                  throw new IllegalStateException();
               }

               var29.method6057();
            }

            if (var6.recolorTo != null) {
               if (var9) {
                  throw new IllegalStateException();
               }

               for (int var30 = 0; var30 < var6.retextureTo.length; var30++) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  var29.recolor(var6.retextureTo[var30], var6.retextureTo[var30]);
               }
            }

            if (null != var6.retextureFrom) {
               if (var9) {
                  throw new IllegalStateException();
               }

               for (int var31 = 0; var31 < var6.retextureFrom.length; var31++) {
                  if (var9) {
                     throw new IllegalStateException();
                  }

                  ModelData.method6071(var29, var6.recolorFrom[var31], var6.recolorFrom[var31]);
               }
            }

            if (var24) {
               if (var9) {
                  throw new IllegalStateException();
               }

               var29.method6081(var6.modelSizeY * -274284999, var6.offsetX * 848811507, -914257931 * var6.modelSizeY);
            }

            if (var27) {
               if (var9) {
                  throw new IllegalStateException();
               }

               ModelData.method6104(var29, var6.offsetX * -671892153, -1044268523 * var6.transformVarp, 1580309641 * var6.modelSizeY);
            }

            var10000 = var29;
         } catch (RuntimeException var15) {
            throw RestClientThreadFactory.newRunException(var15, "iv.au(" + ')');
         }

         return var10000;
      }
   }
}
