import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("iw")
public class SequenceDefinition extends DualNode implements net.runelite.api.Animation {
   @ObfuscatedName("br")
   public int field2729;
   @ObfuscatedName("bw")
   public boolean field2725;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field2741 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field2745 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2740 = 2;
   @ObfuscatedName("bd")
   public int weapon;
   @ObfuscatedName("bt")
   public int field2752;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field2746 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field2750 = 15;
   @ObfuscatedName("bg")
   static boolean field2737 = false;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("aq")
   public static EvictingDualNodeHashTable SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("be")
   public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("bo")
   public static EvictingDualNodeHashTable SequenceDefinition_cachedModel = new EvictingDualNodeHashTable(100);
   @ObfuscatedName("bh")
   public int field2734;
   @ObfuscatedName("bs")
   public int SequenceDefinition_cachedModelId;
   @ObfuscatedName("bz")
   public Map field2753;
   @ObfuscatedName("bk")
   int field2728;
   @ObfuscatedName("bb")
   int field2721;
   @ObfuscatedName("bj")
   public int[] frameIds;
   @ObfuscatedName("bm")
   int[] chatFrameIds;
   @ObfuscatedName("bp")
   public int[] frameLengths;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field2744 = 4;
   @ObfuscatedName("te")
   public int field2720 = -1;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2748 = 1;
   @ObfuscatedName("zf")
   public static final Set field2738 = ImmutableSet.of(472, 1729);
   @ObfuscatedName("ba")
   int[] field2754;
   @ObfuscatedName("bi")
   boolean[] field2758;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field2749 = 0;
   @ObfuscatedName("bx")
   public boolean field2733;
   @ObfuscatedName("bf")
   public int field2726;
   @ObfuscatedName("bn")
   public int shield;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field2747 = 16;
   @ObfuscatedName("bu")
   public int frameCount;
   @ObfuscatedName("by")
   public int animationHeightOffset;
   @ObfuscatedName("bl")
   public int field2731;
   @ObfuscatedName("bc")
   public int restartMode;
   @ObfuscatedName("bq")
   int field2751;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field2742 = 11;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field2743 = 1;

   @ObfuscatedSignature(descriptor = "(Lky;I)Lky;")
   @ObfuscatedName("bf")
   Model method5227(Model var1, int var2) {
      if (!this.isCachedModelIdSet((byte)-91)) {
         var2 = this.frameIds[var2];
         Frames var15 = UrlRequest.getFrames(var2 >> 16, 2026210527);
         var2 &= 65535;
         if (var15 == null) {
            return var1.toSharedSpotAnimationModel(true);
         } else {
            Model var16 = var1.toSharedSpotAnimationModel(!var15.hasAlphaTransform(var2, (byte)37));
            var16.animate(var15, var2);
            return var16;
         }
      } else {
         int var4 = this.SequenceDefinition_cachedModelId * -326405849;
         classFY var3;
         if (HitSplatDefinition.method4993(var4, 1402352388) != 0) {
            var3 = null;
         } else {
            classFY var6 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var4);
            classFY var5;
            if (var6 != null) {
               var5 = var6;
            } else {
               AbstractArchive var8 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
               AbstractArchive var9 = WorldMapIcon_0.SpotAnimationDefinition_archive;
               boolean var10 = WorldMapSectionType.method7176(var8, var9, var4, -1267610787);
               classFY var7;
               if (!var10) {
                  var7 = null;
               } else {
                  if (classFY.field1932 == null) {
                     classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
                     classFY.field1932 = new ThreadPoolExecutor(
                        0,
                        1886450023 * classFY.field1930,
                        0L,
                        TimeUnit.MILLISECONDS,
                        new ArrayBlockingQueue<>(100 + -333558724 * classFY.field1930),
                        new class195(this)
                     );
                  }

                  try {
                     var7 = new classFY(var8, var9, var4);
                  } catch (Exception var12) {
                     var7 = null;
                  }
               }

               if (null != var7) {
                  SequenceDefinition_cachedModel.put(var7, var4);
               }

               var5 = var7;
            }

            var3 = var5;
         }

         if (var3 == null) {
            return var1.toSharedSpotAnimationModel(true);
         } else {
            Model var17 = var1.toSharedSpotAnimationModel(!var3.method4169((byte)12));
            var17.method6753(var3, var2);
            return var17;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ae")
   void decode(Buffer var1, int var2) {
      try {
         while (true) {
            int var3 = var1.readUnsignedByte(-1071862079);
            if (var3 == 0) {
               return;
            }

            this.decodeNext(var1, var3, 1076101603);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "iw.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("aj")
   void decodeNext(Buffer var1, int var2, int var3) {
      try {
         if (1 == var2) {
            if (var3 != 1076101603) {
               throw new IllegalStateException();
            }

            int var4 = Buffer.method12008(var1, (byte)5);
            this.frameLengths = new int[var4];

            for (int var5 = 0; var5 < var4; var5++) {
               if (var3 != 1076101603) {
                  return;
               }

               this.frameLengths[var5] = Buffer.method12008(var1, (byte)5);
            }

            this.frameIds = new int[var4];

            for (int var19 = 0; var19 < var4; var19++) {
               if (var3 != 1076101603) {
                  throw new IllegalStateException();
               }

               this.frameIds[var19] = Buffer.method12008(var1, (byte)5);
            }

            for (int var20 = 0; var20 < var4; var20++) {
               if (var3 != 1076101603) {
                  throw new IllegalStateException();
               }

               this.frameIds[var20] = (Buffer.method12008(var1, (byte)5) << 16) + this.frameIds[var20];
            }
         } else if (2 == var2) {
            this.frameCount = Buffer.method12008(var1, (byte)5) * -1510748397;
         } else if (var2 == 3) {
            if (var3 != 1076101603) {
               throw new IllegalStateException();
            }

            int var14 = var1.readUnsignedByte(176103621);
            this.field2754 = new int[var14 + 1];

            for (int var21 = 0; var21 < var14; var21++) {
               if (var3 != 1076101603) {
                  throw new IllegalStateException();
               }

               this.field2754[var21] = var1.readUnsignedByte(-700631283);
            }

            this.field2754[var14] = 9999999;
         } else if (var2 == 4) {
            if (var3 != 1076101603) {
               throw new IllegalStateException();
            }

            this.field2725 = true;
         } else if (var2 == 5) {
            if (var3 != 1076101603) {
               return;
            }

            this.field2726 = var1.readUnsignedByte(1607042470) * -988342399;
         } else if (6 == var2) {
            this.shield = Buffer.method12008(var1, (byte)5) * -1414702993;
         } else if (var2 == 7) {
            if (var3 != 1076101603) {
               return;
            }

            this.weapon = Buffer.method12008(var1, (byte)5) * 1495265339;
         } else if (var2 == 8) {
            if (var3 != 1076101603) {
               throw new IllegalStateException();
            }

            this.field2729 = var1.readUnsignedByte(1527155835) * 1179888505;
         } else if (9 == var2) {
            if (var3 != 1076101603) {
               throw new IllegalStateException();
            }

            this.field2734 = var1.readUnsignedByte(-1540687601) * 942745027;
         } else if (var2 == 10) {
            if (var3 != 1076101603) {
               throw new IllegalStateException();
            }

            this.field2731 = var1.readUnsignedByte(394714961) * -1537695663;
         } else if (var2 == 11) {
            if (var3 != 1076101603) {
               throw new IllegalStateException();
            }

            this.restartMode = var1.readUnsignedByte(1145104895) * -2090662083;
         } else if (var2 == 12) {
            if (var3 != 1076101603) {
               throw new IllegalStateException();
            }

            int var15 = var1.readUnsignedByte(-1723619992);
            this.chatFrameIds = new int[var15];

            for (int var22 = 0; var22 < var15; var22++) {
               if (var3 != 1076101603) {
                  throw new IllegalStateException();
               }

               this.chatFrameIds[var22] = Buffer.method12008(var1, (byte)5);
            }

            for (int var23 = 0; var23 < var15; var23++) {
               if (var3 != 1076101603) {
                  throw new IllegalStateException();
               }

               this.chatFrameIds[var23] = (Buffer.method12008(var1, (byte)5) << 16) + this.chatFrameIds[var23];
            }
         } else if (var2 == 13) {
            if (var3 != 1076101603) {
               throw new IllegalStateException();
            }

            this.SequenceDefinition_cachedModelId = Buffer.method12015(var1, 1657070230) * -1849495913;
         } else if (var2 == 14) {
            if (var3 != 1076101603) {
               throw new IllegalStateException();
            }

            int var16 = Buffer.method12008(var1, (byte)5);
            if (null == this.field2753) {
               this.field2753 = new HashMap();
            }

            for (int var24 = 0; var24 < var16; var24++) {
               if (var3 != 1076101603) {
                  return;
               }

               int var6;
               class217 var7;
               label254: {
                  var6 = Buffer.method12008(var1, (byte)5);
                  if (null != var1) {
                     int var8 = 0;
                     int var9 = -1;
                     int var10 = 0;
                     int var11 = 0;
                     int var12 = 0;
                     var8 = Buffer.method12008(var1, (byte)5);
                     var9 = var1.readUnsignedByte(1013944674);
                     var10 = var1.readUnsignedByte(2075308864);
                     var11 = var1.readUnsignedByte(-4822466);
                     var12 = var1.readUnsignedByte(921283613);
                     if (var8 >= 1 && var10 >= 1) {
                        if (var3 != 1076101603) {
                           throw new IllegalStateException();
                        }

                        if (var11 >= 0) {
                           if (var3 != 1076101603) {
                              throw new IllegalStateException();
                           }

                           if (var12 >= 0) {
                              if (var3 != 1076101603) {
                                 return;
                              }

                              var7 = new class217(var8, var9, var10, var11, var12);
                              break label254;
                           }
                        }
                     }
                  }

                  var7 = null;
               }

               if (var7 != null) {
                  if (!this.field2753.containsKey(var6)) {
                     this.field2753.put(var6, new ArrayList());
                  }

                  ((ArrayList)this.field2753.get(var6)).add(var7);
               }
            }
         } else if (15 == var2) {
            if (var3 != 1076101603) {
               throw new IllegalStateException();
            }

            this.field2728 = Buffer.method12008(var1, (byte)5) * -1430152821;
            this.field2721 = Buffer.method12008(var1, (byte)5) * 1665175321;
         } else if (var2 == 16) {
            if (var3 != 1076101603) {
               return;
            }

            this.animationHeightOffset = Buffer.method12001(var1, (byte)21) * 1388925835;
         } else if (17 == var2) {
            this.field2758 = new boolean[256];

            for (int var17 = 0; var17 < this.field2758.length; var17++) {
               if (var3 != 1076101603) {
                  throw new IllegalStateException();
               }

               this.field2758[var17] = false;
            }

            int var18 = var1.readUnsignedByte(1415376131);

            for (int var25 = 0; var25 < var18; var25++) {
               if (var3 != 1076101603) {
                  throw new IllegalStateException();
               }

               this.field2758[var1.readUnsignedByte(-187112539)] = true;
            }
         } else if (19 == var2) {
            if (var3 != 1076101603) {
               return;
            }

            this.field2733 = true;
         }
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "iw.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;IB)Lky;")
   @ObfuscatedName("aw")
   public Model transformActorModel(Model var1, int var2, byte var3) {
      if (var2 < 0 && !this.isMayaAnim()) {
         int var30 = var2 ^ Integer.MIN_VALUE;
         int var5 = var30 >> 16 & 16383;
         boolean var6 = (var30 & 1073741824) != 0;
         var2 = var30 & 65535;
         int var7 = var2 + 1;
         if (var7 >= this.frameIds.length) {
            if (field2738.contains(this.field2720)) {
               var7 = -1;
            } else if (this.frameCount * 1996641051 > 0) {
               var7 -= this.frameCount * 1996641051;
            } else if (var6) {
               var7 = 0;
            }
         }

         int var8 = this.frameIds[var2];
         Frames var9 = SecureUrlRequester.client.method2577(var8 >> 16);
         int var10 = var8 & 65535;
         int var11 = -1;
         Frames var12 = null;
         if (var7 >= 0 && var7 < this.frameIds.length) {
            int var13 = this.frameIds[var7];
            var12 = SecureUrlRequester.client.method2577(var13 >> 16);
            var11 = var13 & 65535;
         }

         if (var9 == null) {
            return var1.method6886(true);
         } else {
            Model var31 = var1.method6886(!var9.frames[var10].hasAlphaTransform);
            var31.method6862(rl19.field5583, var9, var10, var12, var11, var5, this.frameLengths[var2]);
            return var31;
         }
      } else {
         if (var2 < 0) {
            int var4 = var2 ^ Integer.MIN_VALUE;
            var2 = var4 & 65535;
         }

         int var16 = var2;
         Model var15 = var1;
         SequenceDefinition var14 = this;
         byte var17 = 45;

         try {
            Model var10000;
            if (!var14.isCachedModelIdSet((byte)71)) {
               if (var17 <= 2) {
                  throw new IllegalStateException();
               }

               var16 = var14.frameIds[var16];
               Frames var18 = UrlRequest.getFrames(var16 >> 16, -347296596);
               var16 &= 65535;
               if (null == var18) {
                  if (var17 <= 2) {
                     throw new IllegalStateException();
                  }

                  Model var32 = var15.toSharedSequenceModel(true);
                  var10000 = var32;
               } else {
                  boolean var10001;
                  if (!var18.hasAlphaTransform(var16, (byte)63)) {
                     if (var17 <= 2) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  Model var19 = var15.toSharedSequenceModel(var10001);
                  var19.animate(var18, var16);
                  var10000 = var19;
               }
            } else {
               int var37 = var14.SequenceDefinition_cachedModelId * -326405849;
               classFY var36;
               if (HitSplatDefinition.method4993(var37, 1402352388) != 0) {
                  var36 = null;
               } else {
                  classFY var21 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var37);
                  classFY var20;
                  if (null != var21) {
                     if (var17 <= 2) {
                        throw new IllegalStateException();
                     }

                     var20 = var21;
                  } else {
                     AbstractArchive var23 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
                     AbstractArchive var24 = WorldMapIcon_0.SpotAnimationDefinition_archive;
                     boolean var25 = WorldMapSectionType.method7176(var23, var24, var37, -1267610787);
                     classFY var22;
                     if (!var25) {
                        if (var17 <= 2) {
                           throw new IllegalStateException();
                        }

                        var22 = null;
                     } else {
                        if (classFY.field1932 == null) {
                           if (var17 <= 2) {
                              throw new IllegalStateException();
                           }

                           classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
                           classFY.field1932 = new ThreadPoolExecutor(
                              0,
                              1886450023 * classFY.field1930,
                              0L,
                              TimeUnit.MILLISECONDS,
                              new ArrayBlockingQueue<>(100 + -333558724 * classFY.field1930),
                              new classIO(var14)
                           );
                        }

                        try {
                           var22 = new classFY(var23, var24, var37);
                        } catch (Exception var27) {
                           var22 = null;
                        }
                     }

                     if (var22 != null) {
                        if (var17 <= 2) {
                           throw new IllegalStateException();
                        }

                        SequenceDefinition_cachedModel.put(var22, var37);
                     }

                     var20 = var22;
                  }

                  var36 = var20;
               }

               if (null == var36) {
                  if (var17 <= 2) {
                     throw new IllegalStateException();
                  }

                  Model var33 = var15.toSharedSequenceModel(true);
                  var10000 = var33;
               } else {
                  boolean var39;
                  if (!var36.method4169((byte)12)) {
                     if (var17 <= 2) {
                        throw new IllegalStateException();
                     }

                     var39 = true;
                  } else {
                     var39 = false;
                  }

                  Model var38 = var15.toSharedSequenceModel(var39);
                  var38.method6753(var36, var16);
                  var10000 = var38;
               }
            }

            return var10000;
         } catch (RuntimeException var28) {
            throw RestClientThreadFactory.newRunException(var28, "iw.aw(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;IIB)Lky;")
   @ObfuscatedName("ay")
   Model transformObjectModel(Model var1, int var2, int var3, byte var4) {
      return this.method5270(rl19.field5583, var1, var2, var3);
   }

   public boolean isMayaAnim() {
      return this.isCachedModelIdSet((byte)-68);
   }

   SequenceDefinition() {
      this.SequenceDefinition_cachedModelId = 1849495913;
      this.field2728 = 0;
      this.field2721 = 0;
      this.frameCount = 1510748397;
      this.animationHeightOffset = 0;
      this.field2725 = false;
      this.field2726 = -646744699;
      this.shield = 1414702993;
      this.weapon = -1495265339;
      this.field2729 = 844845003;
      this.field2734 = -942745027;
      this.field2731 = 1537695663;
      this.restartMode = 113643130;
      this.field2733 = false;
   }

   @ObfuscatedSignature(descriptor = "(Lky;ILiw;II)Lky;")
   @ObfuscatedName("az")
   public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4, int var5) {
      if (var2 < 0) {
         int var6 = var2 ^ Integer.MIN_VALUE;
         var2 = var6 & 65535;
      }

      if (var4 < 0) {
         int var19 = var4 ^ Integer.MIN_VALUE;
         var4 = var19 & 65535;
      }

      int var11 = var4;
      SequenceDefinition var10 = var3;
      int var9 = var2;
      Model var8 = var1;
      SequenceDefinition var7 = this;
      int var12 = 1784213328;

      try {
         if (field2737 && !var7.isCachedModelIdSet((byte)81)) {
            if (var12 <= 180197371) {
               throw new IllegalStateException();
            }

            if (!var10.isCachedModelIdSet((byte)21)) {
               return var7.method5235(var8, var9, var10, var11, (byte)-121);
            }
         }

         Model var13;
         Frames var15;
         label210: {
            var13 = var8.toSharedSequenceModel(false);
            boolean var14 = false;
            var15 = null;
            Skeleton var16 = null;
            if (var7.isCachedModelIdSet((byte)-37)) {
               if (var12 <= 180197371) {
                  throw new IllegalStateException();
               }

               classFY var17 = var7.method5250((byte)28);
               if (var17 == null) {
                  if (var12 <= 180197371) {
                     throw new IllegalStateException();
                  }

                  return var13;
               }

               if (var10.isCachedModelIdSet((byte)102)) {
                  if (var12 <= 180197371) {
                     throw new IllegalStateException();
                  }

                  if (null == var7.field2758) {
                     if (var12 <= 180197371) {
                        throw new IllegalStateException();
                     }

                     var13.method6753(var17, var9);
                     return var13;
                  }
               }

               var16 = var17.field1921;
               boolean[] var10004 = var7.field2758;
               boolean var10006;
               if (!var10.isCachedModelIdSet((byte)-10)) {
                  if (var12 <= 180197371) {
                     throw new IllegalStateException();
                  }

                  var10006 = true;
               } else {
                  var10006 = false;
               }

               Model.method6765(var13, var16, var17, var9, var10004, false, var10006);
            } else {
               label213: {
                  var9 = var7.frameIds[var9];
                  var15 = UrlRequest.getFrames(var9 >> 16, -5875102);
                  var9 &= 65535;
                  if (null == var15) {
                     if (var12 <= 180197371) {
                        throw new IllegalStateException();
                     }

                     return var10.transformActorModel(var8, var11, (byte)52);
                  }

                  if (!var10.isCachedModelIdSet((byte)20)) {
                     if (var7.field2754 == null) {
                        break label210;
                     }

                     if (var12 <= 180197371) {
                        throw new IllegalStateException();
                     }

                     if (-1 == var11) {
                        if (var12 <= 180197371) {
                           throw new IllegalStateException();
                        }
                        break label210;
                     }
                  }

                  if (var7.field2754 != null) {
                     if (var12 <= 180197371) {
                        throw new IllegalStateException();
                     }

                     if (-1 != var11) {
                        var14 = var10.isCachedModelIdSet((byte)-106);
                        if (!var14) {
                           if (var12 <= 180197371) {
                              throw new IllegalStateException();
                           }

                           var13.method6769(var15, var9, var7.field2754, false);
                        }
                        break label213;
                     }

                     if (var12 <= 180197371) {
                        throw new IllegalStateException();
                     }
                  }

                  var13.animate(var15, var9);
                  return var13;
               }
            }

            if (var10.isCachedModelIdSet((byte)77)) {
               if (var12 <= 180197371) {
                  throw new IllegalStateException();
               }

               classFY var26 = var10.method5250((byte)29);
               if (var26 == null) {
                  if (var12 <= 180197371) {
                     throw new IllegalStateException();
                  }

                  return var13;
               }

               if (null == var16) {
                  if (var12 <= 180197371) {
                     throw new IllegalStateException();
                  }

                  var16 = var26.field1921;
               }

               Model.method6765(var13, var16, var26, var11, var7.field2758, true, true);
            } else {
               var11 = var10.frameIds[var11];
               Frames var27 = UrlRequest.getFrames(var11 >> 16, 600042041);
               var11 &= 65535;
               if (null == var27) {
                  return var7.transformActorModel(var8, var9, (byte)82);
               }

               var13.method6769(var27, var11, var7.field2754, true);
            }

            if (var14) {
               if (var12 <= 180197371) {
                  throw new IllegalStateException();
               }

               if (var15 != null) {
                  if (var12 <= 180197371) {
                     throw new IllegalStateException();
                  }

                  var13.method6769(var15, var9, var7.field2754, false);
               }
            }

            var13.method6742();
            return var13;
         }

         var13.animate(var15, var9);
         return var13;
      } catch (RuntimeException var18) {
         throw RestClientThreadFactory.newRunException(var18, "iw.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liw;)Z")
   @ObfuscatedName("uv")
   public static boolean method5240(SequenceDefinition var0) {
      return var0.SequenceDefinition_cachedModelId * -326405849 >= 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bj")
   void method5217() {
      if (-1 == this.field2734 * 1930490603) {
         if (this.field2754 == null && null == this.field2758) {
            this.field2734 = 0;
         } else {
            this.field2734 = 1885490054;
         }
      }

      if (this.field2731 * -1606113103 == -1) {
         if (null == this.field2754 && this.field2758 == null) {
            this.field2731 = 0;
         } else {
            this.field2731 = 1219575970;
         }
      }

      if (null != this.frameLengths) {
         this.field2752 = 0;

         for (int var1 = 0; var1 < this.frameLengths.length; var1++) {
            this.field2752 = this.field2752 + 90364675 * this.frameLengths[var1];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("as")
   public boolean isCachedModelIdSet(byte var1) {
      try {
         return this.SequenceDefinition_cachedModelId * -326405849 >= 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "iw.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ac")
   public int getMayaAnimFrame(byte var1) {
      try {
         return -1967825623 * this.field2721 - 1612989987 * this.field2728;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "iw.ac(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   int method5249(int var1) {
      try {
         if (this.isCachedModelIdSet((byte)-12)) {
            if (var1 >= 463201621) {
               throw new IllegalStateException();
            } else {
               return HitSplatDefinition.method4993(this.SequenceDefinition_cachedModelId * -326405849, 1402352388);
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "iw.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lfy;")
   @ObfuscatedName("ax")
   public classFY method5250(byte var1) {
      try {
         if (this.isCachedModelIdSet((byte)25)) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               int var3 = -326405849 * this.SequenceDefinition_cachedModelId;
               classFY var2;
               if (HitSplatDefinition.method4993(var3, 1402352388) != 0) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  var2 = null;
               } else {
                  classFY var5 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var3);
                  classFY var4;
                  if (null != var5) {
                     if (var1 <= 1) {
                        throw new IllegalStateException();
                     }

                     var4 = var5;
                  } else {
                     AbstractArchive var7 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
                     AbstractArchive var8 = WorldMapIcon_0.SpotAnimationDefinition_archive;
                     boolean var9 = WorldMapSectionType.method7176(var7, var8, var3, -1267610787);
                     classFY var6;
                     if (!var9) {
                        if (var1 <= 1) {
                           throw new IllegalStateException();
                        }

                        var6 = null;
                     } else {
                        if (null == classFY.field1932) {
                           if (var1 <= 1) {
                              throw new IllegalStateException();
                           }

                           classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
                           classFY.field1932 = new ThreadPoolExecutor(
                              0,
                              1886450023 * classFY.field1930,
                              0L,
                              TimeUnit.MILLISECONDS,
                              new ArrayBlockingQueue<>(100 + classFY.field1930 * -333558724),
                              new classHZ(this)
                           );
                        }

                        try {
                           var6 = new classFY(var7, var8, var3);
                        } catch (Exception var11) {
                           var6 = null;
                        }
                     }

                     if (null != var6) {
                        if (var1 <= 1) {
                           throw new IllegalStateException();
                        }

                        SequenceDefinition_cachedModel.put(var6, var3);
                     }

                     var4 = var6;
                  }

                  var2 = var4;
               }

               return var2;
            }
         } else {
            return null;
         }
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "iw.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Liw;")
   @ObfuscatedName("am")
   public static SequenceDefinition method5203(int var0) {
      SequenceDefinition var1 = (SequenceDefinition)class402.method8806(SequenceDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Tiles.SequenceDefinition_archive.getFile(12, var0, 1156792355);
         var1 = new SequenceDefinition();
         var1.field2751 = 21846800 * var0;
         if (null != var2) {
            var1.decode(new Buffer(var2), 982817741);
         }

         method5218(var1, -1055011833);
         SequenceDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("bb")
   void method5215(Buffer var1, int var2) {
      if (1 == var2) {
         int var3 = Buffer.method12008(var1, (byte)5);
         this.frameLengths = new int[var3];

         for (int var4 = 0; var4 < var3; var4++) {
            this.frameLengths[var4] = Buffer.method12008(var1, (byte)5);
         }

         this.frameIds = new int[var3];

         for (int var17 = 0; var17 < var3; var17++) {
            this.frameIds[var17] = Buffer.method12008(var1, (byte)5);
         }

         for (int var18 = 0; var18 < var3; var18++) {
            this.frameIds[var18] = (Buffer.method12008(var1, (byte)5) << 16) + this.frameIds[var18];
         }
      } else if (2 == var2) {
         this.frameCount = Buffer.method12008(var1, (byte)5) * -1510748397;
      } else if (var2 == 3) {
         int var12 = var1.readUnsignedByte(37970811);
         this.field2754 = new int[var12 + 1];

         for (int var19 = 0; var19 < var12; var19++) {
            this.field2754[var19] = var1.readUnsignedByte(-658291006);
         }

         this.field2754[var12] = 9999999;
      } else if (var2 == 4) {
         this.field2725 = true;
      } else if (var2 == 5) {
         this.field2726 = var1.readUnsignedByte(1680848886) * -988342399;
      } else if (6 == var2) {
         this.shield = Buffer.method12008(var1, (byte)5) * -1414702993;
      } else if (var2 == 7) {
         this.weapon = Buffer.method12008(var1, (byte)5) * 1495265339;
      } else if (var2 == 8) {
         this.field2729 = var1.readUnsignedByte(-1038898661) * 1179888505;
      } else if (9 == var2) {
         this.field2734 = var1.readUnsignedByte(-1359817793) * 942745027;
      } else if (var2 == 10) {
         this.field2731 = var1.readUnsignedByte(1930596488) * -1537695663;
      } else if (var2 == 11) {
         this.restartMode = var1.readUnsignedByte(1531075342) * -2090662083;
      } else if (var2 == 12) {
         int var13 = var1.readUnsignedByte(-965663904);
         this.chatFrameIds = new int[var13];

         for (int var20 = 0; var20 < var13; var20++) {
            this.chatFrameIds[var20] = Buffer.method12008(var1, (byte)5);
         }

         for (int var21 = 0; var21 < var13; var21++) {
            this.chatFrameIds[var21] = (Buffer.method12008(var1, (byte)5) << 16) + this.chatFrameIds[var21];
         }
      } else if (var2 == 13) {
         this.SequenceDefinition_cachedModelId = Buffer.method12015(var1, 619448036) * -1849495913;
      } else if (var2 == 14) {
         int var14 = Buffer.method12008(var1, (byte)5);
         if (null == this.field2753) {
            this.field2753 = new HashMap();
         }

         for (int var22 = 0; var22 < var14; var22++) {
            int var5;
            class217 var6;
            label161: {
               var5 = Buffer.method12008(var1, (byte)5);
               if (null != var1) {
                  int var7 = 0;
                  int var8 = -1;
                  int var9 = 0;
                  int var10 = 0;
                  int var11 = 0;
                  var7 = Buffer.method12008(var1, (byte)5);
                  var8 = var1.readUnsignedByte(-1051467143);
                  var9 = var1.readUnsignedByte(475963376);
                  var10 = var1.readUnsignedByte(1555124863);
                  var11 = var1.readUnsignedByte(223552636);
                  if (var7 >= 1 && var9 >= 1 && var10 >= 0 && var11 >= 0) {
                     var6 = new class217(var7, var8, var9, var10, var11);
                     break label161;
                  }
               }

               var6 = null;
            }

            if (var6 != null) {
               if (!this.field2753.containsKey(var5)) {
                  this.field2753.put(var5, new ArrayList());
               }

               ((ArrayList)this.field2753.get(var5)).add(var6);
            }
         }
      } else if (15 == var2) {
         this.field2728 = Buffer.method12008(var1, (byte)5) * -1430152821;
         this.field2721 = Buffer.method12008(var1, (byte)5) * 1665175321;
      } else if (var2 == 16) {
         this.animationHeightOffset = Buffer.method12001(var1, (byte)35) * 1388925835;
      } else if (17 == var2) {
         this.field2758 = new boolean[256];

         for (int var15 = 0; var15 < this.field2758.length; var15++) {
            this.field2758[var15] = false;
         }

         int var16 = var1.readUnsignedByte(-736709903);

         for (int var23 = 0; var23 < var16; var23++) {
            this.field2758[var1.readUnsignedByte(149397423)] = true;
         }
      } else if (19 == var2) {
         this.field2733 = true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bo")
   public static int method5208(int var0) {
      classFY var2 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var0);
      classFY var1;
      if (null != var2) {
         var1 = var2;
      } else {
         AbstractArchive var4 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
         AbstractArchive var5 = WorldMapIcon_0.SpotAnimationDefinition_archive;
         boolean var6 = WorldMapSectionType.method7176(var4, var5, var0, -1267610787);
         classFY var3;
         if (!var6) {
            var3 = null;
         } else {
            if (classFY.field1932 == null) {
               classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
               classFY.field1932 = new ThreadPoolExecutor(
                  0, 1886450023 * classFY.field1930, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(classFY.field1930 * -333558724 + 100), new classGP()
               );
            }

            try {
               var3 = new classFY(var4, var5, var0);
            } catch (Exception var8) {
               var3 = null;
            }
         }

         if (var3 != null) {
            SequenceDefinition_cachedModel.put(var3, var0);
         }

         var1 = var3;
      }

      if (var1 == null) {
         return 2;
      } else {
         return var1.method4186(-506168531) ? 0 : 1;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bl")
   static int method5265(int var0, int var1) {
      try {
         return (int)Math.pow(2.0, var0 / 256.0F + 7.0F);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "iw.bl(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Liw;I)V")
   @ObfuscatedName("yi")
   public static void method5218(SequenceDefinition var0, int var1) {
      if (var0 == null) {
         var0.postDecode(var1);
      }

      try {
         if (-1 == var0.field2734 * 1930490603) {
            if (var1 >= -445827419) {
               throw new IllegalStateException();
            }

            if (var0.field2754 == null && null == var0.field2758) {
               var0.field2734 = 0;
            } else {
               var0.field2734 = 1885490054;
            }
         }

         label59:
         if (var0.field2731 * -1606113103 == -1) {
            if (var1 >= -445827419) {
               throw new IllegalStateException();
            }

            if (null == var0.field2754) {
               if (var1 >= -445827419) {
                  return;
               }

               if (var0.field2758 == null) {
                  var0.field2731 = 0;
                  break label59;
               }
            }

            var0.field2731 = 1219575970;
         }

         if (null != var0.frameLengths) {
            if (var1 >= -445827419) {
               throw new IllegalStateException();
            }

            var0.field2752 = 0;

            for (int var2 = 0; var2 < var0.frameLengths.length; var2++) {
               if (var1 >= -445827419) {
                  throw new IllegalStateException();
               }

               var0.field2752 = var0.field2752 + 90364675 * var0.frameLengths[var2];
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "iw.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ap")
   public boolean method5224(int var1, int var2) {
      try {
         if (this.shield * 972490383 <= 0) {
            if (var2 == -238810365) {
               throw new IllegalStateException();
            }

            if (this.weapon * -455776013 <= 0) {
               if (!this.isCachedModelIdSet((byte)-35)) {
                  if (var2 == -238810365) {
                     throw new IllegalStateException();
                  }

                  var1 = this.frameIds[var1];
                  Frames var16 = UrlRequest.getFrames(var1 >> 16, -219307259);
                  var1 &= 65535;
                  if (var16 == null) {
                     if (var2 == -238810365) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  return var16.hasAlphaTransform(var1, (byte)43);
               }

               int var4 = this.SequenceDefinition_cachedModelId * -326405849;
               classFY var3;
               if (HitSplatDefinition.method4993(var4, 1402352388) != 0) {
                  if (var2 == -238810365) {
                     throw new IllegalStateException();
                  }

                  var3 = null;
               } else {
                  classFY var6 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var4);
                  classFY var5;
                  if (var6 != null) {
                     var5 = var6;
                  } else {
                     AbstractArchive var8 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
                     AbstractArchive var9 = WorldMapIcon_0.SpotAnimationDefinition_archive;
                     boolean var10 = WorldMapSectionType.method7176(var8, var9, var4, -1267610787);
                     classFY var7;
                     if (!var10) {
                        if (var2 == -238810365) {
                           throw new IllegalStateException();
                        }

                        var7 = null;
                     } else {
                        if (classFY.field1932 == null) {
                           if (var2 == -238810365) {
                              throw new IllegalStateException();
                           }

                           classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
                           classFY.field1932 = new ThreadPoolExecutor(
                              0,
                              1886450023 * classFY.field1930,
                              0L,
                              TimeUnit.MILLISECONDS,
                              new ArrayBlockingQueue<>(100 + -333558724 * classFY.field1930),
                              new class208(this)
                           );
                        }

                        try {
                           var7 = new classFY(var8, var9, var4);
                        } catch (Exception var12) {
                           var7 = null;
                        }
                     }

                     if (null != var7) {
                        if (var2 == -238810365) {
                           throw new IllegalStateException();
                        }

                        SequenceDefinition_cachedModel.put(var7, var4);
                     }

                     var5 = var7;
                  }

                  var3 = var5;
               }

               if (null == var3) {
                  if (var2 == -238810365) {
                     throw new IllegalStateException();
                  }

                  return false;
               }

               return var3.method4169((byte)12);
            }

            if (var2 == -238810365) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "iw.ap(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liw;Lky;I)Lky;")
   @ObfuscatedName("gt")
   public static Model method5228(SequenceDefinition var0, Model var1, int var2) {
      if (var0 == null) {
         var0.method5243();
      }

      if (!var0.isCachedModelIdSet((byte)-56)) {
         var2 = var0.frameIds[var2];
         Frames var15 = UrlRequest.getFrames(var2 >> 16, 1953157722);
         var2 &= 65535;
         if (var15 == null) {
            return var1.toSharedSpotAnimationModel(true);
         } else {
            Model var16 = var1.toSharedSpotAnimationModel(!var15.hasAlphaTransform(var2, (byte)11));
            var16.animate(var15, var2);
            return var16;
         }
      } else {
         int var4 = var0.SequenceDefinition_cachedModelId * -326405849;
         classFY var3;
         if (HitSplatDefinition.method4993(var4, 1402352388) != 0) {
            var3 = null;
         } else {
            classFY var6 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var4);
            classFY var5;
            if (var6 != null) {
               var5 = var6;
            } else {
               AbstractArchive var8 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
               AbstractArchive var9 = WorldMapIcon_0.SpotAnimationDefinition_archive;
               boolean var10 = WorldMapSectionType.method7176(var8, var9, var4, -1267610787);
               classFY var7;
               if (!var10) {
                  var7 = null;
               } else {
                  if (classFY.field1932 == null) {
                     classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
                     classFY.field1932 = new ThreadPoolExecutor(
                        0,
                        1886450023 * classFY.field1930,
                        0L,
                        TimeUnit.MILLISECONDS,
                        new ArrayBlockingQueue<>(100 + -333558724 * classFY.field1930),
                        new class195(var0)
                     );
                  }

                  try {
                     var7 = new classFY(var8, var9, var4);
                  } catch (Exception var12) {
                     var7 = null;
                  }
               }

               if (null != var7) {
                  SequenceDefinition_cachedModel.put(var7, var4);
               }

               var5 = var7;
            }

            var3 = var5;
         }

         if (var3 == null) {
            return var1.toSharedSpotAnimationModel(true);
         } else {
            Model var17 = var1.toSharedSpotAnimationModel(!var3.method4169((byte)12));
            var17.method6753(var3, var2);
            return var17;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Liw;")
   @ObfuscatedName("ao")
   public static SequenceDefinition method5204(int var0) {
      SequenceDefinition var1 = (SequenceDefinition)class402.method8806(SequenceDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Tiles.SequenceDefinition_archive.getFile(12, var0, -230553909);
         var1 = new SequenceDefinition();
         var1.field2751 = -1171161053 * var0;
         if (null != var2) {
            var1.decode(new Buffer(var2), 982817741);
         }

         method5218(var1, -1967580795);
         SequenceDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Liw;")
   @ObfuscatedName("aa")
   public static SequenceDefinition method5205(int var0) {
      SequenceDefinition var1 = (SequenceDefinition)class402.method8806(SequenceDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Tiles.SequenceDefinition_archive.getFile(12, var0, 1587889635);
         var1 = new SequenceDefinition();
         var1.field2751 = -244038606 * var0;
         if (null != var2) {
            var1.decode(new Buffer(var2), 982817741);
         }

         method5218(var1, -1716074254);
         SequenceDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljt;")
   @ObfuscatedName("be")
   static Frames method5206(int var0) {
      Frames var1 = (Frames)class402.method8806(SequenceDefinition_cachedFrames, var0);
      if (var1 != null) {
         return var1;
      } else {
         var1 = class142.method4014(class152.SequenceDefinition_animationsArchive, WorldMapIcon_0.SpotAnimationDefinition_archive, var0, (byte)119);
         if (var1 != null) {
            SequenceDefinition_cachedFrames.put(var1, var0);
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;I)Lky;")
   @ObfuscatedName("pv")
   public Model method5272(Model var1, int var2) {
      return this.transformSpotAnimationModel(var1, var2, -1088717506);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bg")
   public static int method5209(int var0) {
      classFY var2 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var0);
      classFY var1;
      if (null != var2) {
         var1 = var2;
      } else {
         AbstractArchive var4 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
         AbstractArchive var5 = WorldMapIcon_0.SpotAnimationDefinition_archive;
         boolean var6 = WorldMapSectionType.method7176(var4, var5, var0, -1267610787);
         classFY var3;
         if (!var6) {
            var3 = null;
         } else {
            if (classFY.field1932 == null) {
               classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
               classFY.field1932 = new ThreadPoolExecutor(
                  0, 1886450023 * classFY.field1930, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(classFY.field1930 * -333558724 + 100), new classGP()
               );
            }

            try {
               var3 = new classFY(var4, var5, var0);
            } catch (Exception var8) {
               var3 = null;
            }
         }

         if (var3 != null) {
            SequenceDefinition_cachedModel.put(var3, var0);
         }

         var1 = var3;
      }

      if (var1 == null) {
         return 2;
      } else {
         return var1.method4186(-460802991) ? 0 : 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;Lqm;Lqm;)V")
   @ObfuscatedName("af")
   public static void method5201(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
      Tiles.SequenceDefinition_archive = var0;
      class152.SequenceDefinition_animationsArchive = var1;
      WorldMapData_0.SequenceDefinition_skeletonsArchive = var2;
      WorldMapIcon_0.SpotAnimationDefinition_archive = var3;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("bz")
   void method5213(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(1075765062);
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2, 1076101603);
      }
   }

   @ObfuscatedSignature(descriptor = "(Liw;B)Z")
   @ObfuscatedName("hn")
   public static boolean method5260(SequenceDefinition var0, byte var1) {
      if (var0 == null) {
         return var0.method5245(var1);
      } else {
         try {
            if (var0.isCachedModelIdSet((byte)-3)) {
               if (var1 == 80) {
                  throw new IllegalStateException();
               } else {
                  return var0.method5249(456586728) == 0;
               }
            } else {
               if (null != var0.frameIds) {
                  if (var1 == 80) {
                     throw new IllegalStateException();
                  }

                  if (var0.frameIds.length > 0) {
                     if (var1 == 80) {
                        throw new IllegalStateException();
                     }

                     if (UrlRequest.getFrames(var0.frameIds[0] >> 16, 1219846436) != null) {
                        if (var1 == 80) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }
                  }
               }

               return false;
            }
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "iw.ah(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liw;Lky;ILiw;I)Lky;")
   @ObfuscatedName("di")
   public static Model method5231(SequenceDefinition var0, Model var1, int var2, SequenceDefinition var3, int var4) {
      if (var0 == null) {
         var0.method5243();
      }

      if (field2737 && !var0.isCachedModelIdSet((byte)53) && !var3.isCachedModelIdSet((byte)-6)) {
         return var0.method5235(var1, var2, var3, var4, (byte)-66);
      } else {
         Model var5 = var1.toSharedSequenceModel(false);
         boolean var6 = false;
         Frames var7 = null;
         Skeleton var8 = null;
         if (var0.isCachedModelIdSet((byte)-67)) {
            classFY var9 = var0.method5250((byte)69);
            if (var9 == null) {
               return var5;
            }

            if (var3.isCachedModelIdSet((byte)-46) && null == var0.field2758) {
               var5.method6753(var9, var2);
               return var5;
            }

            var8 = var9.field1921;
            Model.method6765(var5, var8, var9, var2, var0.field2758, false, !var3.isCachedModelIdSet((byte)-64));
         } else {
            var2 = var0.frameIds[var2];
            var7 = UrlRequest.getFrames(var2 >> 16, 678989610);
            var2 &= -1067495063;
            if (null == var7) {
               return var3.transformActorModel(var1, var4, (byte)25);
            }

            if (!var3.isCachedModelIdSet((byte)-29) && (var0.field2754 == null || -1 == var4)) {
               var5.animate(var7, var2);
               return var5;
            }

            if (var0.field2754 == null || -1 == var4) {
               var5.animate(var7, var2);
               return var5;
            }

            var6 = var3.isCachedModelIdSet((byte)-93);
            if (!var6) {
               var5.method6769(var7, var2, var0.field2754, false);
            }
         }

         if (var3.isCachedModelIdSet((byte)-64)) {
            classFY var13 = var3.method5250((byte)91);
            if (var13 == null) {
               return var5;
            }

            if (null == var8) {
               var8 = var13.field1921;
            }

            Model.method6765(var5, var8, var13, var4, var0.field2758, true, true);
         } else {
            var4 = var3.frameIds[var4];
            Frames var14 = UrlRequest.getFrames(var4 >> 16, 211311118);
            var4 &= 65535;
            if (null == var14) {
               return var0.transformActorModel(var1, var2, (byte)97);
            }

            var5.method6769(var14, var4, var0.field2754, true);
         }

         if (var6 && var7 != null) {
            var5.method6769(var7, var2, var0.field2754, false);
         }

         var5.method6742();
         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqg;I)V")
   @ObfuscatedName("ed")
   public static void method5200(GrandExchangeOffer var0, int var1) {
      if (var0 == null) {
         var0.method8894();
      }

      var0.state = (byte)(var0.state & -1443273255);
      var0.state = (byte)(var0.state | var1 & 7);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("bk")
   void method5216(Buffer var1, int var2) {
      if (1 == var2) {
         int var3 = Buffer.method12008(var1, (byte)5);
         this.frameLengths = new int[var3];

         for (int var4 = 0; var4 < var3; var4++) {
            this.frameLengths[var4] = Buffer.method12008(var1, (byte)5);
         }

         this.frameIds = new int[var3];

         for (int var17 = 0; var17 < var3; var17++) {
            this.frameIds[var17] = Buffer.method12008(var1, (byte)5);
         }

         for (int var18 = 0; var18 < var3; var18++) {
            this.frameIds[var18] = (Buffer.method12008(var1, (byte)5) << 16) + this.frameIds[var18];
         }
      } else if (2 == var2) {
         this.frameCount = Buffer.method12008(var1, (byte)5) * -1510748397;
      } else if (var2 == 3) {
         int var12 = var1.readUnsignedByte(-1372387019);
         this.field2754 = new int[var12 + 1];

         for (int var19 = 0; var19 < var12; var19++) {
            this.field2754[var19] = var1.readUnsignedByte(-99508276);
         }

         this.field2754[var12] = 9999999;
      } else if (var2 == 4) {
         this.field2725 = true;
      } else if (var2 == 5) {
         this.field2726 = var1.readUnsignedByte(-220200530) * -988342399;
      } else if (6 == var2) {
         this.shield = Buffer.method12008(var1, (byte)5) * -1414702993;
      } else if (var2 == 7) {
         this.weapon = Buffer.method12008(var1, (byte)5) * 1495265339;
      } else if (var2 == 8) {
         this.field2729 = var1.readUnsignedByte(418441826) * 1179888505;
      } else if (9 == var2) {
         this.field2734 = var1.readUnsignedByte(-489642500) * 942745027;
      } else if (var2 == 10) {
         this.field2731 = var1.readUnsignedByte(-1472794656) * -1537695663;
      } else if (var2 == 11) {
         this.restartMode = var1.readUnsignedByte(-547146189) * -2090662083;
      } else if (var2 == 12) {
         int var13 = var1.readUnsignedByte(-1675784241);
         this.chatFrameIds = new int[var13];

         for (int var20 = 0; var20 < var13; var20++) {
            this.chatFrameIds[var20] = Buffer.method12008(var1, (byte)5);
         }

         for (int var21 = 0; var21 < var13; var21++) {
            this.chatFrameIds[var21] = (Buffer.method12008(var1, (byte)5) << 16) + this.chatFrameIds[var21];
         }
      } else if (var2 == 13) {
         this.SequenceDefinition_cachedModelId = Buffer.method12015(var1, 382282006) * -1849495913;
      } else if (var2 == 14) {
         int var14 = Buffer.method12008(var1, (byte)5);
         if (null == this.field2753) {
            this.field2753 = new HashMap();
         }

         for (int var22 = 0; var22 < var14; var22++) {
            int var5;
            class217 var6;
            label151: {
               var5 = Buffer.method12008(var1, (byte)5);
               if (null != var1) {
                  int var7 = 0;
                  int var8 = -1;
                  int var9 = 0;
                  int var10 = 0;
                  int var11 = 0;
                  var7 = Buffer.method12008(var1, (byte)5);
                  var8 = var1.readUnsignedByte(-1629627620);
                  var9 = var1.readUnsignedByte(-1269936323);
                  var10 = var1.readUnsignedByte(2068766391);
                  var11 = var1.readUnsignedByte(-1095243072);
                  if (var7 >= 1 && var9 >= 1 && var10 >= 0 && var11 >= 0) {
                     var6 = new class217(var7, var8, var9, var10, var11);
                     break label151;
                  }
               }

               var6 = null;
            }

            if (var6 != null) {
               if (!this.field2753.containsKey(var5)) {
                  this.field2753.put(var5, new ArrayList());
               }

               ((ArrayList)this.field2753.get(var5)).add(var6);
            }
         }
      } else if (15 == var2) {
         this.field2728 = Buffer.method12008(var1, (byte)5) * -1430152821;
         this.field2721 = Buffer.method12008(var1, (byte)5) * 1665175321;
      } else if (var2 == 16) {
         this.animationHeightOffset = Buffer.method12001(var1, (byte)33) * 1388925835;
      } else if (17 == var2) {
         this.field2758 = new boolean[256];

         for (int var15 = 0; var15 < this.field2758.length; var15++) {
            this.field2758[var15] = false;
         }

         int var16 = var1.readUnsignedByte(722561615);

         for (int var23 = 0; var23 < var16; var23++) {
            this.field2758[var1.readUnsignedByte(710997251)] = true;
         }
      } else if (19 == var2) {
         this.field2733 = true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liw;)V")
   @ObfuscatedName("xk")
   public static void method5219(SequenceDefinition var0) {
      if (-1 == var0.field2734 * 67864921) {
         if (var0.field2754 == null && null == var0.field2758) {
            var0.field2734 = 0;
         } else {
            var0.field2734 = -1163347903;
         }
      }

      if (var0.field2731 * -1606113103 == -1) {
         if (null == var0.field2754 && var0.field2758 == null) {
            var0.field2731 = 0;
         } else {
            var0.field2731 = 1219575970;
         }
      }

      if (null != var0.frameLengths) {
         var0.field2752 = 0;

         for (int var1 = 0; var1 < var0.frameLengths.length; var1++) {
            var0.field2752 = var0.field2752 + -465369646 * var0.frameLengths[var1];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liw;Lky;II)Lky;")
   @ObfuscatedName("uo")
   public static Model method5225(SequenceDefinition var0, Model var1, int var2, int var3) {
      if (var0 == null) {
         return var0.method5238(var1, var2);
      } else if (!var0.isCachedModelIdSet((byte)-10)) {
         var2 = var0.frameIds[var2];
         Frames var18 = UrlRequest.getFrames(var2 >> 16, 591980055);
         var2 &= 381185018;
         if (null == var18) {
            return var1.toSharedSequenceModel(true);
         } else {
            Model var19 = var1.toSharedSequenceModel(!var18.hasAlphaTransform(var2, (byte)65));
            var3 &= 3;
            if (1 == var3) {
               var19.method6867();
            } else if (var3 == 2) {
               var19.resetBounds();
            } else if (3 == var3) {
               var19.method6846();
            }

            var19.animate(var18, var2);
            if (1 == var3) {
               var19.method6846();
            } else if (2 == var3) {
               var19.resetBounds();
            } else if (var3 == 3) {
               var19.method6867();
            }

            return var19;
         }
      } else {
         int var5 = var0.SequenceDefinition_cachedModelId * -326405849;
         classFY var4;
         if (HitSplatDefinition.method4993(var5, 1402352388) != 0) {
            var4 = null;
         } else {
            classFY var7 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var5);
            classFY var6;
            if (var7 != null) {
               var6 = var7;
            } else {
               AbstractArchive var9 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
               AbstractArchive var10 = WorldMapIcon_0.SpotAnimationDefinition_archive;
               boolean var11 = WorldMapSectionType.method7176(var9, var10, var5, -1267610787);
               classFY var8;
               if (!var11) {
                  var8 = null;
               } else {
                  if (classFY.field1932 == null) {
                     classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
                     classFY.field1932 = new ThreadPoolExecutor(
                        0,
                        1886450023 * classFY.field1930,
                        0L,
                        TimeUnit.MILLISECONDS,
                        new ArrayBlockingQueue<>(-333558724 * classFY.field1930 + 100),
                        new class190(var0)
                     );
                  }

                  try {
                     var8 = new classFY(var9, var10, var5);
                  } catch (Exception var13) {
                     var8 = null;
                  }
               }

               if (null != var8) {
                  SequenceDefinition_cachedModel.put(var8, var5);
               }

               var6 = var8;
            }

            var4 = var6;
         }

         if (null == var4) {
            return var1.toSharedSequenceModel(true);
         } else {
            Model var20 = var1.toSharedSequenceModel(!var4.method4169((byte)12));
            var3 &= 3;
            if (1 == var3) {
               var20.method6867();
            } else if (2 == var3) {
               var20.resetBounds();
            } else if (3 == var3) {
               var20.method6846();
            }

            var20.method6753(var4, var2);
            if (1 == var3) {
               var20.method6846();
            } else if (var3 == 2) {
               var20.resetBounds();
            } else if (var3 == 3) {
               var20.method6867();
            }

            return var20;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bs")
   public static int method5210(int var0) {
      classFY var2 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var0);
      classFY var1;
      if (null != var2) {
         var1 = var2;
      } else {
         AbstractArchive var4 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
         AbstractArchive var5 = WorldMapIcon_0.SpotAnimationDefinition_archive;
         boolean var6 = WorldMapSectionType.method7176(var4, var5, var0, -1267610787);
         classFY var3;
         if (!var6) {
            var3 = null;
         } else {
            if (classFY.field1932 == null) {
               classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
               classFY.field1932 = new ThreadPoolExecutor(
                  0, 1886450023 * classFY.field1930, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(classFY.field1930 * -333558724 + 100), new classGP()
               );
            }

            try {
               var3 = new classFY(var4, var5, var0);
            } catch (Exception var8) {
               var3 = null;
            }
         }

         if (var3 != null) {
            SequenceDefinition_cachedModel.put(var3, var0);
         }

         var1 = var3;
      }

      if (var1 == null) {
         return 2;
      } else {
         return var1.method4186(-123523503) ? 0 : 1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Liw;Lky;IB)Lky;")
   @ObfuscatedName("ki")
   public static Model method5236(SequenceDefinition var0, Model var1, int var2, byte var3) {
      if (var0 == null) {
         return var0.transformWidgetModel(var1, var2, var3);
      } else {
         try {
            if (!var0.isCachedModelIdSet((byte)-1)) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               } else {
                  int var4 = var0.frameIds[var2];
                  Frames var5 = UrlRequest.getFrames(var4 >> 16, 1394258765);
                  var4 &= 65535;
                  if (null == var5) {
                     return var1.toSharedSequenceModel(true);
                  } else {
                     Frames var6 = null;
                     int var7 = 0;
                     if (null != var0.chatFrameIds) {
                        if (var3 != 0) {
                           throw new IllegalStateException();
                        }

                        if (var2 < var0.chatFrameIds.length) {
                           var7 = var0.chatFrameIds[var2];
                           var6 = UrlRequest.getFrames(var7 >> 16, 491478861);
                           var7 &= 65535;
                        }
                     }

                     if (null != var6) {
                        if (var3 != 0) {
                           throw new IllegalStateException();
                        }

                        if (var7 != 65535) {
                           boolean var13;
                           if (!var5.hasAlphaTransform(var4, (byte)67)) {
                              if (var3 != 0) {
                                 throw new IllegalStateException();
                              }

                              var13 = true;
                           } else {
                              var13 = false;
                           }

                           Model var12 = var1.toSharedSequenceModel(var13 & !var6.hasAlphaTransform(var7, (byte)4));
                           var12.animate(var5, var4);
                           var12.animate(var6, var7);
                           return var12;
                        }

                        if (var3 != 0) {
                           throw new IllegalStateException();
                        }
                     }

                     boolean var10001;
                     if (!var5.hasAlphaTransform(var4, (byte)58)) {
                        if (var3 != 0) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     Model var8 = var1.toSharedSequenceModel(var10001);
                     var8.animate(var5, var4);
                     return var8;
                  }
               }
            } else {
               return var0.transformActorModel(var1, var2, (byte)23);
            }
         } catch (RuntimeException var9) {
            throw RestClientThreadFactory.newRunException(var9, "iw.ai(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cm")
   public int method5247() {
      return -1967825623 * this.field2721 - 1612989987 * this.field2728;
   }

   @ObfuscatedSignature(descriptor = "(Lky;I)Lky;")
   @ObfuscatedName("bp")
   public Model method5221(Model var1, int var2) {
      if (!this.isCachedModelIdSet((byte)23)) {
         var2 = this.frameIds[var2];
         Frames var15 = UrlRequest.getFrames(var2 >> 16, 884332129);
         var2 &= 453073347;
         if (null == var15) {
            return var1.toSharedSequenceModel(true);
         } else {
            Model var16 = var1.toSharedSequenceModel(!var15.hasAlphaTransform(var2, (byte)48));
            var16.animate(var15, var2);
            return var16;
         }
      } else {
         int var4 = this.SequenceDefinition_cachedModelId * -326405849;
         classFY var3;
         if (HitSplatDefinition.method4993(var4, 1402352388) != 0) {
            var3 = null;
         } else {
            classFY var6 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var4);
            classFY var5;
            if (null != var6) {
               var5 = var6;
            } else {
               AbstractArchive var8 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
               AbstractArchive var9 = WorldMapIcon_0.SpotAnimationDefinition_archive;
               boolean var10 = WorldMapSectionType.method7176(var8, var9, var4, -1267610787);
               classFY var7;
               if (!var10) {
                  var7 = null;
               } else {
                  if (classFY.field1932 == null) {
                     classFY.field1930 = Runtime.getRuntime().availableProcessors() * 1506054494;
                     classFY.field1932 = new ThreadPoolExecutor(
                        0,
                        -1934618082 * classFY.field1930,
                        0L,
                        TimeUnit.MILLISECONDS,
                        new ArrayBlockingQueue<>(1238872321 + -333558724 * classFY.field1930),
                        new classIO(this)
                     );
                  }

                  try {
                     var7 = new classFY(var8, var9, var4);
                  } catch (Exception var12) {
                     var7 = null;
                  }
               }

               if (var7 != null) {
                  SequenceDefinition_cachedModel.put(var7, var4);
               }

               var5 = var7;
            }

            var3 = var5;
         }

         if (null == var3) {
            return var1.toSharedSequenceModel(true);
         } else {
            Model var17 = var1.toSharedSequenceModel(!var3.method4169((byte)12));
            var17.method6753(var3, var2);
            return var17;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;ILiw;I)Lnet/runelite/api/Model;")
   @ObfuscatedName("nn")
   public net.runelite.api.Model method5273(Model var1, int var2, SequenceDefinition var3, int var4) {
      return this.applyTransformations(var1, var2, var3, var4, 1784213328);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liw;)Lfy;")
   @ObfuscatedName("mh")
   public static classFY method5251(SequenceDefinition var0) {
      if (var0 == null) {
         var0.method5252();
      }

      if (var0.isCachedModelIdSet((byte)-63)) {
         int var2 = -326405849 * var0.SequenceDefinition_cachedModelId;
         classFY var1;
         if (HitSplatDefinition.method4993(var2, 1402352388) != 0) {
            var1 = null;
         } else {
            classFY var4 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var2);
            classFY var3;
            if (null != var4) {
               var3 = var4;
            } else {
               AbstractArchive var6 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
               AbstractArchive var7 = WorldMapIcon_0.SpotAnimationDefinition_archive;
               boolean var8 = WorldMapSectionType.method7176(var6, var7, var2, -1267610787);
               classFY var5;
               if (!var8) {
                  var5 = null;
               } else {
                  if (null == classFY.field1932) {
                     classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
                     classFY.field1932 = new ThreadPoolExecutor(
                        0,
                        1886450023 * classFY.field1930,
                        0L,
                        TimeUnit.MILLISECONDS,
                        new ArrayBlockingQueue<>(100 + classFY.field1930 * -333558724),
                        new classHZ(var0)
                     );
                  }

                  try {
                     var5 = new classFY(var6, var7, var2);
                  } catch (Exception var10) {
                     var5 = null;
                  }
               }

               if (null != var5) {
                  SequenceDefinition_cachedModel.put(var5, var2);
               }

               var3 = var5;
            }

            var1 = var3;
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;I)Lky;")
   @ObfuscatedName("bt")
   public Model method5222(Model var1, int var2) {
      if (!this.isCachedModelIdSet((byte)-25)) {
         var2 = this.frameIds[var2];
         Frames var15 = UrlRequest.getFrames(var2 >> 16, 1621083555);
         var2 &= 65535;
         if (null == var15) {
            return var1.toSharedSequenceModel(true);
         } else {
            Model var16 = var1.toSharedSequenceModel(!var15.hasAlphaTransform(var2, (byte)115));
            var16.animate(var15, var2);
            return var16;
         }
      } else {
         int var4 = this.SequenceDefinition_cachedModelId * -326405849;
         classFY var3;
         if (HitSplatDefinition.method4993(var4, 1402352388) != 0) {
            var3 = null;
         } else {
            classFY var6 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var4);
            classFY var5;
            if (null != var6) {
               var5 = var6;
            } else {
               AbstractArchive var8 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
               AbstractArchive var9 = WorldMapIcon_0.SpotAnimationDefinition_archive;
               boolean var10 = WorldMapSectionType.method7176(var8, var9, var4, -1267610787);
               classFY var7;
               if (!var10) {
                  var7 = null;
               } else {
                  if (classFY.field1932 == null) {
                     classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
                     classFY.field1932 = new ThreadPoolExecutor(
                        0,
                        1886450023 * classFY.field1930,
                        0L,
                        TimeUnit.MILLISECONDS,
                        new ArrayBlockingQueue<>(100 + -333558724 * classFY.field1930),
                        new classIO(this)
                     );
                  }

                  try {
                     var7 = new classFY(var8, var9, var4);
                  } catch (Exception var12) {
                     var7 = null;
                  }
               }

               if (var7 != null) {
                  SequenceDefinition_cachedModel.put(var7, var4);
               }

               var5 = var7;
            }

            var3 = var5;
         }

         if (null == var3) {
            return var1.toSharedSequenceModel(true);
         } else {
            Model var17 = var1.toSharedSequenceModel(!var3.method4169((byte)12));
            var17.method6753(var3, var2);
            return var17;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ci")
   public boolean method5261() {
      return this.isCachedModelIdSet((byte)-32)
         ? this.method5249(-1173481230) == 0
         : null != this.frameIds && this.frameIds.length > 0 && UrlRequest.getFrames(this.frameIds[0] >> 16, 1013218646) != null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ch")
   public boolean method5242() {
      return this.SequenceDefinition_cachedModelId * 2016495331 >= 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljt;")
   @ObfuscatedName("aq")
   static Frames method5207(int var0) {
      Frames var1 = (Frames)class402.method8806(SequenceDefinition_cachedFrames, var0);
      if (var1 != null) {
         return var1;
      } else {
         var1 = class142.method4014(class152.SequenceDefinition_animationsArchive, WorldMapIcon_0.SpotAnimationDefinition_archive, var0, (byte)9);
         if (var1 != null) {
            SequenceDefinition_cachedFrames.put(var1, var0);
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;I)Lky;")
   @ObfuscatedName("bw")
   Model method5229(Model var1, int var2) {
      if (!this.isCachedModelIdSet((byte)25)) {
         var2 = this.frameIds[var2];
         Frames var15 = UrlRequest.getFrames(var2 >> 16, 1152733627);
         var2 &= 65535;
         if (var15 == null) {
            return var1.toSharedSpotAnimationModel(true);
         } else {
            Model var16 = var1.toSharedSpotAnimationModel(!var15.hasAlphaTransform(var2, (byte)82));
            var16.animate(var15, var2);
            return var16;
         }
      } else {
         int var4 = this.SequenceDefinition_cachedModelId * 370142808;
         classFY var3;
         if (HitSplatDefinition.method4993(var4, 1402352388) != 0) {
            var3 = null;
         } else {
            classFY var6 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var4);
            classFY var5;
            if (var6 != null) {
               var5 = var6;
            } else {
               AbstractArchive var8 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
               AbstractArchive var9 = WorldMapIcon_0.SpotAnimationDefinition_archive;
               boolean var10 = WorldMapSectionType.method7176(var8, var9, var4, -1267610787);
               classFY var7;
               if (!var10) {
                  var7 = null;
               } else {
                  if (classFY.field1932 == null) {
                     classFY.field1930 = Runtime.getRuntime().availableProcessors() * 1994992207;
                     classFY.field1932 = new ThreadPoolExecutor(
                        0,
                        1886450023 * classFY.field1930,
                        0L,
                        TimeUnit.MILLISECONDS,
                        new ArrayBlockingQueue<>(100 + -333558724 * classFY.field1930),
                        new class195(this)
                     );
                  }

                  try {
                     var7 = new classFY(var8, var9, var4);
                  } catch (Exception var12) {
                     var7 = null;
                  }
               }

               if (null != var7) {
                  SequenceDefinition_cachedModel.put(var7, var4);
               }

               var5 = var7;
            }

            var3 = var5;
         }

         if (var3 == null) {
            return var1.toSharedSpotAnimationModel(true);
         } else {
            Model var17 = var1.toSharedSpotAnimationModel(!var3.method4169((byte)12));
            var17.method6753(var3, var2);
            return var17;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ce")
   public boolean method5243() {
      return this.SequenceDefinition_cachedModelId * -1559028256 >= 0;
   }

   public int getRestartMode() {
      return this.restartMode * 564693013;
   }

   @ObfuscatedSignature(descriptor = "(Lky;ILiw;I)Lky;")
   @ObfuscatedName("br")
   Model method5232(Model var1, int var2, SequenceDefinition var3, int var4) {
      var2 = this.frameIds[var2];
      Frames var5 = UrlRequest.getFrames(var2 >> 16, 483755176);
      var2 &= 65535;
      if (null == var5) {
         return var3.transformActorModel(var1, var4, (byte)38);
      } else {
         var4 = var3.frameIds[var4];
         Frames var6 = UrlRequest.getFrames(var4 >> 16, 1748236517);
         var4 &= 65535;
         if (var6 == null) {
            Model var12 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2, (byte)93));
            var12.animate(var5, var2);
            return var12;
         } else {
            Model var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2, (byte)60) & !var6.hasAlphaTransform(var4, (byte)21));
            Model.method6758(var7, var5, var2, var6, var4, this.field2754);
            return var7;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;ILiw;I)Lky;")
   @ObfuscatedName("bh")
   Model method5233(Model var1, int var2, SequenceDefinition var3, int var4) {
      var2 = this.frameIds[var2];
      Frames var5 = UrlRequest.getFrames(var2 >> 16, 1997717430);
      var2 &= 1541216671;
      if (null == var5) {
         return var3.transformActorModel(var1, var4, (byte)32);
      } else {
         var4 = var3.frameIds[var4];
         Frames var6 = UrlRequest.getFrames(var4 >> 16, 2097729377);
         var4 &= 65535;
         if (var6 == null) {
            Model var12 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2, (byte)126));
            var12.animate(var5, var2);
            return var12;
         } else {
            Model var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2, (byte)78) & !var6.hasAlphaTransform(var4, (byte)5));
            Model.method6758(var7, var5, var2, var6, var4, this.field2754);
            return var7;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsj;ILse;)I")
   @ObfuscatedName("qt")
   public static int method5274(AnimationSequence var0, int var1, classSE var2) {
      return GrandExchangeOfferUnitPriceComparator.method8832(var0, var1, var2, (byte)79);
   }

   public int getDuration() {
      if (this.isMayaAnim()) {
         return this.method5276();
      } else {
         return this.frameLengths != null ? this.frameLengths.length : 1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl19;Lky;II)Lky;")
   @ObfuscatedName("jr")
   public Model method5270(rl19 var1, Model var2, int var3, int var4) {
      if (var3 < 0 && !this.isMayaAnim()) {
         int var22 = var3 ^ Integer.MIN_VALUE;
         int var24 = var22 >> 16 & 16383;
         var3 = var22 & 65535;
         int var25 = var3 + 1;
         if (var25 >= this.frameIds.length) {
            if (field2738.contains(this.field2720)) {
               var25 = -1;
            } else {
               var25 -= this.frameCount * 1996641051;
            }
         }

         int var8 = this.frameIds[var3];
         Frames var9 = Frames.method6187(var8 >> 16);
         int var10 = var8 & 65535;
         int var11 = -1;
         Frames var12 = null;
         if (var25 >= 0 && var25 < this.frameIds.length) {
            int var13 = this.frameIds[var25];
            var12 = Frames.method6187(var13 >> 16);
            var11 = var13 & 65535;
         }

         if (var9 == null) {
            return var2.method6859(var1, true);
         } else {
            Model var26 = var2.method6859(var1, !var9.frames[var10].hasAlphaTransform);
            var4 &= 3;
            if (var4 == 1) {
               var26.method6894();
            } else if (var4 == 2) {
               var26.method6882();
            } else if (var4 == 3) {
               var26.method6888();
            }

            var26.method6862(var1, var9, var10, var12, var11, var24, this.frameLengths[var3]);
            if (var4 == 1) {
               var26.method6888();
            } else if (var4 == 2) {
               var26.method6882();
            } else if (var4 == 3) {
               var26.method6894();
            }

            return var26;
         }
      } else if (!this.isMayaAnim()) {
         var3 = this.frameIds[var3];
         Frames var21 = Frames.method6187(var3 >> 16);
         var3 &= 65535;
         if (var21 == null) {
            return var2.method6859(var1, true);
         } else {
            Model var23 = var2.method6859(var1, !var21.method6186(var3));
            var4 &= 3;
            if (var4 == 1) {
               var23.method6894();
            } else if (var4 == 2) {
               var23.method6882();
            } else if (var4 == 3) {
               var23.method6888();
            }

            var23.method6873(var1, var21, var3);
            if (var4 == 1) {
               var23.method6888();
            } else if (var4 == 2) {
               var23.method6882();
            } else if (var4 == 3) {
               var23.method6894();
            }

            return var23;
         }
      } else {
         if (var3 < 0) {
            int var5 = var3 ^ Integer.MIN_VALUE;
            var3 = var5 & 65535;
         }

         int var20 = this.SequenceDefinition_cachedModelId * -326405849;
         classFY var6 = classFY.method4195(var20);
         if (var6 != null && var6.method4202()) {
            Model var7 = var2.method6859(var1, !var6.field1933);
            var4 &= 3;
            if (var4 == 1) {
               var7.method6894();
            } else if (var4 == 2) {
               var7.method6882();
            } else if (var4 == 3) {
               var7.method6888();
            }

            var7.method6875(var1, var6, var3);
            if (var4 == 1) {
               var7.method6888();
            } else if (var4 == 2) {
               var7.method6882();
            } else if (var4 == 3) {
               var7.method6894();
            }

            return var7;
         } else {
            return var2.method6859(var1, true);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;ILiw;I)Lky;")
   @ObfuscatedName("bl")
   Model method5234(Model var1, int var2, SequenceDefinition var3, int var4) {
      var2 = this.frameIds[var2];
      Frames var5 = UrlRequest.getFrames(var2 >> 16, 1737549917);
      var2 &= 65535;
      if (null == var5) {
         return var3.transformActorModel(var1, var4, (byte)117);
      } else {
         var4 = var3.frameIds[var4];
         Frames var6 = UrlRequest.getFrames(var4 >> 16, 1634418021);
         var4 &= 65535;
         if (var6 == null) {
            Model var12 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2, (byte)115));
            var12.animate(var5, var2);
            return var12;
         } else {
            Model var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2, (byte)107) & !var6.hasAlphaTransform(var4, (byte)59));
            Model.method6758(var7, var5, var2, var6, var4, this.field2754);
            return var7;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;I)Lky;")
   @ObfuscatedName("bc")
   public Model method5237(Model var1, int var2) {
      if (!this.isCachedModelIdSet((byte)-43)) {
         int var3 = this.frameIds[var2];
         Frames var4 = UrlRequest.getFrames(var3 >> 16, 1058421713);
         var3 &= 65535;
         if (null == var4) {
            return var1.toSharedSequenceModel(true);
         } else {
            Frames var5 = null;
            int var6 = 0;
            if (null != this.chatFrameIds && var2 < this.chatFrameIds.length) {
               var6 = this.chatFrameIds[var2];
               var5 = UrlRequest.getFrames(var6 >> 16, 1690278456);
               var6 &= 65535;
            }

            if (null != var5 && var6 != 65535) {
               Model var10 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3, (byte)48) & !var5.hasAlphaTransform(var6, (byte)15));
               var10.animate(var4, var3);
               var10.animate(var5, var6);
               return var10;
            } else {
               Model var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3, (byte)4));
               var7.animate(var4, var3);
               return var7;
            }
         }
      } else {
         return this.transformActorModel(var1, var2, (byte)42);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;I)Lky;")
   @ObfuscatedName("bx")
   public Model method5238(Model var1, int var2) {
      if (!this.isCachedModelIdSet((byte)12)) {
         int var3 = this.frameIds[var2];
         Frames var4 = UrlRequest.getFrames(var3 >> 16, 1701308081);
         var3 &= 65535;
         if (null == var4) {
            return var1.toSharedSequenceModel(true);
         } else {
            Frames var5 = null;
            int var6 = 0;
            if (null != this.chatFrameIds && var2 < this.chatFrameIds.length) {
               var6 = this.chatFrameIds[var2];
               var5 = UrlRequest.getFrames(var6 >> 16, 1395402140);
               var6 &= 65535;
            }

            if (null != var5 && var6 != 996733231) {
               Model var10 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3, (byte)85) & !var5.hasAlphaTransform(var6, (byte)36));
               var10.animate(var4, var3);
               var10.animate(var5, var6);
               return var10;
            } else {
               Model var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3, (byte)95));
               var7.animate(var4, var3);
               return var7;
            }
         }
      } else {
         return this.transformActorModel(var1, var2, (byte)75);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;I)Lnet/runelite/api/Model;")
   @ObfuscatedName("qq")
   public net.runelite.api.Model method5275(Model var1, int var2) {
      return this.transformActorModel(var1, var2, (byte)45);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bv")
   public boolean method5244() {
      return this.SequenceDefinition_cachedModelId * -326405849 >= 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liw;Lky;I)Lky;")
   @ObfuscatedName("ou")
   public static Model method5223(SequenceDefinition var0, Model var1, int var2) {
      if (var0 == null) {
         var0.method5224(var2, var2);
      }

      if (!var0.isCachedModelIdSet((byte)84)) {
         var2 = var0.frameIds[var2];
         Frames var15 = UrlRequest.getFrames(var2 >> 16, 1066487532);
         var2 &= 311923668;
         if (null == var15) {
            return var1.toSharedSequenceModel(true);
         } else {
            Model var16 = var1.toSharedSequenceModel(!var15.hasAlphaTransform(var2, (byte)48));
            var16.animate(var15, var2);
            return var16;
         }
      } else {
         int var4 = var0.SequenceDefinition_cachedModelId * -195876915;
         classFY var3;
         if (HitSplatDefinition.method4993(var4, 1402352388) != 0) {
            var3 = null;
         } else {
            classFY var6 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var4);
            classFY var5;
            if (null != var6) {
               var5 = var6;
            } else {
               AbstractArchive var8 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
               AbstractArchive var9 = WorldMapIcon_0.SpotAnimationDefinition_archive;
               boolean var10 = WorldMapSectionType.method7176(var8, var9, var4, -1267610787);
               classFY var7;
               if (!var10) {
                  var7 = null;
               } else {
                  if (classFY.field1932 == null) {
                     classFY.field1930 = Runtime.getRuntime().availableProcessors() * -1420179740;
                     classFY.field1932 = new ThreadPoolExecutor(
                        0,
                        -36988332 * classFY.field1930,
                        0L,
                        TimeUnit.MILLISECONDS,
                        new ArrayBlockingQueue<>(665901017 + -659157449 * classFY.field1930),
                        new classIO(var0)
                     );
                  }

                  try {
                     var7 = new classFY(var8, var9, var4);
                  } catch (Exception var12) {
                     var7 = null;
                  }
               }

               if (var7 != null) {
                  SequenceDefinition_cachedModel.put(var7, var4);
               }

               var5 = var7;
            }

            var3 = var5;
         }

         if (null == var3) {
            return var1.toSharedSequenceModel(true);
         } else {
            Model var17 = var1.toSharedSequenceModel(!var3.method4169((byte)12));
            var17.method6753(var3, var2);
            return var17;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liw;Lky;II)Lky;")
   @ObfuscatedName("sb")
   public static Model method5226(SequenceDefinition var0, Model var1, int var2, int var3) {
      if (var0 == null) {
         var0.postDecode(var2);
      }

      if (!var0.isCachedModelIdSet((byte)12)) {
         var2 = var0.frameIds[var2];
         Frames var18 = UrlRequest.getFrames(var2 >> 16, -323137602);
         var2 &= 65535;
         if (null == var18) {
            return var1.toSharedSequenceModel(true);
         } else {
            Model var19 = var1.toSharedSequenceModel(!var18.hasAlphaTransform(var2, (byte)88));
            var3 &= 3;
            if (1 == var3) {
               var19.method6867();
            } else if (var3 == 2) {
               var19.resetBounds();
            } else if (3 == var3) {
               var19.method6846();
            }

            var19.animate(var18, var2);
            if (1 == var3) {
               var19.method6846();
            } else if (2 == var3) {
               var19.resetBounds();
            } else if (var3 == 3) {
               var19.method6867();
            }

            return var19;
         }
      } else {
         int var5 = var0.SequenceDefinition_cachedModelId * -326405849;
         classFY var4;
         if (HitSplatDefinition.method4993(var5, 1402352388) != 0) {
            var4 = null;
         } else {
            classFY var7 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var5);
            classFY var6;
            if (var7 != null) {
               var6 = var7;
            } else {
               AbstractArchive var9 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
               AbstractArchive var10 = WorldMapIcon_0.SpotAnimationDefinition_archive;
               boolean var11 = WorldMapSectionType.method7176(var9, var10, var5, -1267610787);
               classFY var8;
               if (!var11) {
                  var8 = null;
               } else {
                  if (classFY.field1932 == null) {
                     classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
                     classFY.field1932 = new ThreadPoolExecutor(
                        0,
                        400048457 * classFY.field1930,
                        0L,
                        TimeUnit.MILLISECONDS,
                        new ArrayBlockingQueue<>(-1380614553 * classFY.field1930 + 100),
                        new class190(var0)
                     );
                  }

                  try {
                     var8 = new classFY(var9, var10, var5);
                  } catch (Exception var13) {
                     var8 = null;
                  }
               }

               if (null != var8) {
                  SequenceDefinition_cachedModel.put(var8, var5);
               }

               var6 = var8;
            }

            var4 = var6;
         }

         if (null == var4) {
            return var1.toSharedSequenceModel(true);
         } else {
            Model var20 = var1.toSharedSequenceModel(!var4.method4169((byte)12));
            var3 &= 3;
            if (1 == var3) {
               var20.method6867();
            } else if (2 == var3) {
               var20.resetBounds();
            } else if (3 == var3) {
               var20.method6846();
            }

            var20.method6753(var4, var2);
            if (1 == var3) {
               var20.method6846();
            } else if (var3 == 2) {
               var20.resetBounds();
            } else if (var3 == 3) {
               var20.method6867();
            }

            return var20;
         }
      }
   }

   public int getFrameStep() {
      return this.frameCount * 1996641051;
   }

   public int[] getFrameLengths() {
      return this.frameLengths;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ct")
   public int method5248() {
      return -1967825623 * this.field2721 - 502486068 * this.field2728;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;Lqm;Lqm;)V")
   @ObfuscatedName("al")
   public static void method5202(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
      Tiles.SequenceDefinition_archive = var0;
      class152.SequenceDefinition_animationsArchive = var1;
      WorldMapData_0.SequenceDefinition_skeletonsArchive = var2;
      WorldMapIcon_0.SpotAnimationDefinition_archive = var3;
   }

   public int getNumFrames() {
      if (this.isMayaAnim()) {
         return this.method5276();
      } else {
         return this.frameIds != null ? this.frameIds.length : 1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cd")
   public boolean method5262() {
      return this.isCachedModelIdSet((byte)45)
         ? this.method5249(-1828177623) == 0
         : null != this.frameIds && this.frameIds.length > 0 && UrlRequest.getFrames(this.frameIds[0] >> 16, 1426322780) != null;
   }

   @ObfuscatedSignature(descriptor = "(Lky;I)Lky;")
   @ObfuscatedName("bq")
   public Model method5239(Model var1, int var2) {
      if (!this.isCachedModelIdSet((byte)-32)) {
         int var3 = this.frameIds[var2];
         Frames var4 = UrlRequest.getFrames(var3 >> 16, 1489587487);
         var3 &= 65535;
         if (null == var4) {
            return var1.toSharedSequenceModel(true);
         } else {
            Frames var5 = null;
            int var6 = 0;
            if (null != this.chatFrameIds && var2 < this.chatFrameIds.length) {
               var6 = this.chatFrameIds[var2];
               var5 = UrlRequest.getFrames(var6 >> 16, 1398033005);
               var6 &= -1504450726;
            }

            if (null != var5 && var6 != -1040793292) {
               Model var10 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3, (byte)123) & !var5.hasAlphaTransform(var6, (byte)90));
               var10.animate(var4, var3);
               var10.animate(var5, var6);
               return var10;
            } else {
               Model var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3, (byte)77));
               var7.animate(var4, var3);
               return var7;
            }
         }
      } else {
         return this.transformActorModel(var1, var2, (byte)5);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfy;")
   @ObfuscatedName("ck")
   public classFY method5252() {
      if (this.isCachedModelIdSet((byte)30)) {
         int var2 = 1011479338 * this.SequenceDefinition_cachedModelId;
         classFY var1;
         if (HitSplatDefinition.method4993(var2, 1402352388) != 0) {
            var1 = null;
         } else {
            classFY var4 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var2);
            classFY var3;
            if (null != var4) {
               var3 = var4;
            } else {
               AbstractArchive var6 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
               AbstractArchive var7 = WorldMapIcon_0.SpotAnimationDefinition_archive;
               boolean var8 = WorldMapSectionType.method7176(var6, var7, var2, -1267610787);
               classFY var5;
               if (!var8) {
                  var5 = null;
               } else {
                  if (null == classFY.field1932) {
                     classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
                     classFY.field1932 = new ThreadPoolExecutor(
                        0,
                        -1995076228 * classFY.field1930,
                        0L,
                        TimeUnit.MILLISECONDS,
                        new ArrayBlockingQueue<>(1706187011 + classFY.field1930 * -333558724),
                        new classHZ(this)
                     );
                  }

                  try {
                     var5 = new classFY(var6, var7, var2);
                  } catch (Exception var10) {
                     var5 = null;
                  }
               }

               if (null != var5) {
                  SequenceDefinition_cachedModel.put(var5, var2);
               }

               var3 = var5;
            }

            var1 = var3;
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Liw;I)I")
   @ObfuscatedName("qd")
   public static int method5255(SequenceDefinition var0, int var1) {
      if (var0 == null) {
         return var0.method5259(var1);
      } else {
         try {
            return var0.field2751 * -808909293;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "iw.ar(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfy;")
   @ObfuscatedName("cc")
   public classFY method5253() {
      if (this.isCachedModelIdSet((byte)-53)) {
         int var2 = -326405849 * this.SequenceDefinition_cachedModelId;
         classFY var1;
         if (HitSplatDefinition.method4993(var2, 1402352388) != 0) {
            var1 = null;
         } else {
            classFY var4 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var2);
            classFY var3;
            if (null != var4) {
               var3 = var4;
            } else {
               AbstractArchive var6 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
               AbstractArchive var7 = WorldMapIcon_0.SpotAnimationDefinition_archive;
               boolean var8 = WorldMapSectionType.method7176(var6, var7, var2, -1267610787);
               classFY var5;
               if (!var8) {
                  var5 = null;
               } else {
                  if (null == classFY.field1932) {
                     classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
                     classFY.field1932 = new ThreadPoolExecutor(
                        0,
                        1886450023 * classFY.field1930,
                        0L,
                        TimeUnit.MILLISECONDS,
                        new ArrayBlockingQueue<>(100 + classFY.field1930 * -333558724),
                        new classHZ(this)
                     );
                  }

                  try {
                     var5 = new classFY(var6, var7, var2);
                  } catch (Exception var10) {
                     var5 = null;
                  }
               }

               if (null != var5) {
                  SequenceDefinition_cachedModel.put(var5, var2);
               }

               var3 = var5;
            }

            var1 = var3;
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfy;")
   @ObfuscatedName("cs")
   public classFY method5254() {
      if (this.isCachedModelIdSet((byte)100)) {
         int var2 = -326405849 * this.SequenceDefinition_cachedModelId;
         classFY var1;
         if (HitSplatDefinition.method4993(var2, 1402352388) != 0) {
            var1 = null;
         } else {
            classFY var4 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var2);
            classFY var3;
            if (null != var4) {
               var3 = var4;
            } else {
               AbstractArchive var6 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
               AbstractArchive var7 = WorldMapIcon_0.SpotAnimationDefinition_archive;
               boolean var8 = WorldMapSectionType.method7176(var6, var7, var2, -1267610787);
               classFY var5;
               if (!var8) {
                  var5 = null;
               } else {
                  if (null == classFY.field1932) {
                     classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
                     classFY.field1932 = new ThreadPoolExecutor(
                        0,
                        1886450023 * classFY.field1930,
                        0L,
                        TimeUnit.MILLISECONDS,
                        new ArrayBlockingQueue<>(100 + classFY.field1930 * -333558724),
                        new classHZ(this)
                     );
                  }

                  try {
                     var5 = new classFY(var6, var7, var2);
                  } catch (Exception var10) {
                     var5 = null;
                  }
               }

               if (null != var5) {
                  SequenceDefinition_cachedModel.put(var5, var2);
               }

               var3 = var5;
            }

            var1 = var3;
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   public int method5276() {
      return this.getMayaAnimFrame((byte)113);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("co")
   public int method5256() {
      return this.field2751 * -808909293;
   }

   public void setRestartMode(int var1) {
      this.restartMode = var1 * -2090662083;
   }

   public int getId() {
      return this.field2720;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cx")
   public int method5257() {
      return this.field2751 * -808909293;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cg")
   public int method5258() {
      return this.field2751 * 1951760784;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cp")
   public boolean method5263() {
      return this.isCachedModelIdSet((byte)-7)
         ? this.method5249(-189100639) == 0
         : null != this.frameIds && this.frameIds.length > 0 && UrlRequest.getFrames(this.frameIds[0] >> 16, 1666828617) != null;
   }

   @ObfuscatedSignature(descriptor = "(Lky;I)Lky;")
   @ObfuscatedName("bn")
   Model method5230(Model var1, int var2) {
      if (!this.isCachedModelIdSet((byte)-1)) {
         var2 = this.frameIds[var2];
         Frames var15 = UrlRequest.getFrames(var2 >> 16, 2139865691);
         var2 &= 65535;
         if (var15 == null) {
            return var1.toSharedSpotAnimationModel(true);
         } else {
            Model var16 = var1.toSharedSpotAnimationModel(!var15.hasAlphaTransform(var2, (byte)23));
            var16.animate(var15, var2);
            return var16;
         }
      } else {
         int var4 = this.SequenceDefinition_cachedModelId * -326405849;
         classFY var3;
         if (HitSplatDefinition.method4993(var4, 1402352388) != 0) {
            var3 = null;
         } else {
            classFY var6 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var4);
            classFY var5;
            if (var6 != null) {
               var5 = var6;
            } else {
               AbstractArchive var8 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
               AbstractArchive var9 = WorldMapIcon_0.SpotAnimationDefinition_archive;
               boolean var10 = WorldMapSectionType.method7176(var8, var9, var4, -1267610787);
               classFY var7;
               if (!var10) {
                  var7 = null;
               } else {
                  if (classFY.field1932 == null) {
                     classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
                     classFY.field1932 = new ThreadPoolExecutor(
                        0,
                        1886450023 * classFY.field1930,
                        0L,
                        TimeUnit.MILLISECONDS,
                        new ArrayBlockingQueue<>(100 + -333558724 * classFY.field1930),
                        new class195(this)
                     );
                  }

                  try {
                     var7 = new classFY(var8, var9, var4);
                  } catch (Exception var12) {
                     var7 = null;
                  }
               }

               if (null != var7) {
                  SequenceDefinition_cachedModel.put(var7, var4);
               }

               var5 = var7;
            }

            var3 = var5;
         }

         if (var3 == null) {
            return var1.toSharedSpotAnimationModel(true);
         } else {
            Model var17 = var1.toSharedSpotAnimationModel(!var3.method4169((byte)12));
            var17.method6753(var3, var2);
            return var17;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cz")
   public boolean method5264() {
      return this.isCachedModelIdSet((byte)6)
         ? this.method5249(-258289173) == 0
         : null != this.frameIds && this.frameIds.length > 0 && UrlRequest.getFrames(this.frameIds[0] >> 16, 1814564377) != null;
   }

   @ObfuscatedSignature(descriptor = "(Lky;ILiw;IB)Lky;")
   @ObfuscatedName("ad")
   Model method5235(Model var1, int var2, SequenceDefinition var3, int var4, byte var5) {
      try {
         var2 = this.frameIds[var2];
         Frames var6 = UrlRequest.getFrames(var2 >> 16, -119882314);
         var2 &= 65535;
         if (null == var6) {
            if (var5 >= 16) {
               throw new IllegalStateException();
            } else {
               return var3.transformActorModel(var1, var4, (byte)67);
            }
         } else {
            var4 = var3.frameIds[var4];
            Frames var7 = UrlRequest.getFrames(var4 >> 16, -340567188);
            var4 &= 65535;
            if (var7 == null) {
               if (var5 >= 16) {
                  throw new IllegalStateException();
               } else {
                  boolean var15;
                  if (!var6.hasAlphaTransform(var2, (byte)69)) {
                     if (var5 >= 16) {
                        throw new IllegalStateException();
                     }

                     var15 = true;
                  } else {
                     var15 = false;
                  }

                  Model var14 = var1.toSharedSequenceModel(var15);
                  var14.animate(var6, var2);
                  return var14;
               }
            } else {
               boolean var10001;
               if (!var6.hasAlphaTransform(var2, (byte)14)) {
                  if (var5 >= 16) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               boolean var10002;
               if (!var7.hasAlphaTransform(var4, (byte)84)) {
                  if (var5 >= 16) {
                     throw new IllegalStateException();
                  }

                  var10002 = true;
               } else {
                  var10002 = false;
               }

               Model var8 = var1.toSharedSequenceModel(var10001 & var10002);
               Model.method6758(var8, var6, var2, var7, var4, this.field2754);
               return var8;
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "iw.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;II)Lky;")
   @ObfuscatedName("au")
   Model transformSpotAnimationModel(Model var1, int var2, int var3) {
      if (var2 < 0 && !this.isMayaAnim()) {
         int var29 = var2 ^ Integer.MIN_VALUE;
         int var5 = var29 >> 16 & 16383;
         var2 = var29 & 65535;
         int var6 = var2 + 1;
         if (var6 >= this.frameIds.length) {
            var6 = -1;
         }

         int var7 = this.frameIds[var2];
         Frames var8 = SecureUrlRequester.client.method2577(var7 >> 16);
         int var9 = var7 & 65535;
         int var10 = -1;
         Frames var11 = null;
         if (var6 != -1) {
            int var12 = this.frameIds[var6];
            var11 = SecureUrlRequester.client.method2577(var12 >> 16);
            var10 = var12 & 65535;
         }

         if (var8 == null) {
            return var1.method6884(true);
         } else {
            Model var30 = var1.method6884(!var8.frames[var9].hasAlphaTransform);
            var30.method6862(rl19.field5583, var8, var9, var11, var10, var5, this.frameLengths[var2]);
            return var30;
         }
      } else {
         if (var2 < 0) {
            int var4 = var2 ^ Integer.MIN_VALUE;
            var2 = var4 & 65535;
         }

         int var15 = var2;
         Model var14 = var1;
         SequenceDefinition var13 = this;
         int var16 = -1088717506;

         try {
            Model var10000;
            if (!var13.isCachedModelIdSet((byte)-54)) {
               if (var16 >= 1987001659) {
                  throw new IllegalStateException();
               }

               var15 = var13.frameIds[var15];
               Frames var17 = UrlRequest.getFrames(var15 >> 16, 1484965347);
               var15 &= 65535;
               if (var17 == null) {
                  if (var16 >= 1987001659) {
                     throw new IllegalStateException();
                  }

                  Model var31 = var14.toSharedSpotAnimationModel(true);
                  var10000 = var31;
               } else {
                  boolean var10001;
                  if (!var17.hasAlphaTransform(var15, (byte)101)) {
                     if (var16 >= 1987001659) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  Model var18 = var14.toSharedSpotAnimationModel(var10001);
                  var18.animate(var17, var15);
                  var10000 = var18;
               }
            } else {
               int var36 = var13.SequenceDefinition_cachedModelId * -326405849;
               classFY var35;
               if (HitSplatDefinition.method4993(var36, 1402352388) != 0) {
                  if (var16 >= 1987001659) {
                     throw new IllegalStateException();
                  }

                  var35 = null;
               } else {
                  classFY var20 = (classFY)class402.method8806(SequenceDefinition_cachedModel, var36);
                  classFY var19;
                  if (var20 != null) {
                     if (var16 >= 1987001659) {
                        throw new IllegalStateException();
                     }

                     var19 = var20;
                  } else {
                     AbstractArchive var22 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
                     AbstractArchive var23 = WorldMapIcon_0.SpotAnimationDefinition_archive;
                     boolean var24 = WorldMapSectionType.method7176(var22, var23, var36, -1267610787);
                     classFY var21;
                     if (!var24) {
                        if (var16 >= 1987001659) {
                           throw new IllegalStateException();
                        }

                        var21 = null;
                     } else {
                        if (classFY.field1932 == null) {
                           if (var16 >= 1987001659) {
                              throw new IllegalStateException();
                           }

                           classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
                           classFY.field1932 = new ThreadPoolExecutor(
                              0,
                              1886450023 * classFY.field1930,
                              0L,
                              TimeUnit.MILLISECONDS,
                              new ArrayBlockingQueue<>(100 + -333558724 * classFY.field1930),
                              new class195(var13)
                           );
                        }

                        try {
                           var21 = new classFY(var22, var23, var36);
                        } catch (Exception var26) {
                           var21 = null;
                        }
                     }

                     if (null != var21) {
                        if (var16 >= 1987001659) {
                           throw new IllegalStateException();
                        }

                        SequenceDefinition_cachedModel.put(var21, var36);
                     }

                     var19 = var21;
                  }

                  var35 = var19;
               }

               if (var35 == null) {
                  if (var16 >= 1987001659) {
                     throw new IllegalStateException();
                  }

                  Model var32 = var14.toSharedSpotAnimationModel(true);
                  var10000 = var32;
               } else {
                  Model var37 = var14.toSharedSpotAnimationModel(!var35.method4169((byte)12));
                  var37.method6753(var35, var15);
                  var10000 = var37;
               }
            }

            return var10000;
         } catch (RuntimeException var27) {
            throw RestClientThreadFactory.newRunException(var27, "iw.au(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;[BIIIIIIIIII)V")
   @ObfuscatedName("ae")
   static final void method5211(
      WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11
   ) {
      try {
         CollisionMap[] var12 = var0.collisionMaps;
         if (null != var12) {
            if (var11 <= -1793120611) {
               return;
            }

            if (var2 >= 0) {
               if (var11 <= -1793120611) {
                  return;
               }

               if (var2 < var12.length) {
                  CollisionMap var13 = var12[var2];

                  for (int var14 = var3; var14 < 8 + var3; var14++) {
                     if (var11 <= -1793120611) {
                        return;
                     }

                     for (int var15 = var4; var15 < 8 + var4; var15++) {
                        if (var11 <= -1793120611) {
                           return;
                        }

                        if (var13.method6401(var14, var15, -365810060)) {
                           if (var11 <= -1793120611) {
                              throw new IllegalStateException();
                           }

                           var13.method6398(var14, var15, 1073741824, 651999802);
                        }
                     }
                  }
               }
            }
         }

         Buffer var27 = new Buffer(var1);

         for (int var28 = 0; var28 < 4; var28++) {
            if (var11 <= -1793120611) {
               return;
            }

            for (int var30 = 0; var30 < 64; var30++) {
               if (var11 <= -1793120611) {
                  throw new IllegalStateException();
               }

               for (int var16 = 0; var16 < 64; var16++) {
                  if (var5 == var28 && var30 >= var6) {
                     if (var11 <= -1793120611) {
                        throw new IllegalStateException();
                     }

                     if (var30 < var6 + 8 && var16 >= var7) {
                        if (var11 <= -1793120611) {
                           throw new IllegalStateException();
                        }

                        if (var16 < 8 + var7) {
                           int var17 = var3 + FontName.method11646(var30 & 7, var16 & 7, var8, (byte)-19);
                           int var20 = var30 & 7;
                           int var21 = var16 & 7;
                           int var22 = var8 & 3;
                           int var19;
                           if (0 == var22) {
                              if (var11 <= -1793120611) {
                                 throw new IllegalStateException();
                              }

                              var19 = var21;
                           } else if (1 == var22) {
                              if (var11 <= -1793120611) {
                                 throw new IllegalStateException();
                              }

                              var19 = 7 - var20;
                           } else if (var22 == 2) {
                              if (var11 <= -1793120611) {
                                 throw new IllegalStateException();
                              }

                              var19 = 7 - var21;
                           } else {
                              var19 = var20;
                           }

                           int var23 = var4 + var19;
                           int var24 = (var30 & 7) + var9 + var3;
                           int var25 = var4 + var10 + (var16 & 7);
                           class264.loadTerrain(var0, var27, var2, var17, var23, var24, var25, var8, 2129611754);
                           continue;
                        }
                     }
                  }

                  class264.loadTerrain(var0, var27, 0, -1, -1, 0, 0, 0, 2143206216);
               }
            }
         }

         int var10000;
         if (var27.offset * 2108391709 < var27.array.length) {
            if (var11 <= -1793120611) {
               throw new IllegalStateException();
            }

            var10000 = var27.readUnsignedByte(364611253);
         } else {
            var10000 = 0;
         }

         int var29 = var10000;
         boolean var34;
         if (0 != (var29 & 1)) {
            if (var11 <= -1793120611) {
               return;
            }

            var34 = true;
         } else {
            var34 = false;
         }

         boolean var31 = var34;
         if (var31) {
            if (var11 <= -1793120611) {
               throw new IllegalStateException();
            }

            for (int var32 = 0; var32 < 64; var32++) {
               if (var11 <= -1793120611) {
                  throw new IllegalStateException();
               }

               for (int var33 = 0; var33 < 64; var33++) {
                  if (var11 <= -1793120611) {
                     throw new IllegalStateException();
                  }

                  class148.method4142(var27, (byte)65);
               }
            }
         }
      } catch (RuntimeException var26) {
         throw RestClientThreadFactory.newRunException(var26, "iw.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   void postDecode(int var1) {
      try {
         if (-1 == this.animationHeightOffset * 1930490603) {
            if (var1 >= -445827419) {
               throw new IllegalStateException();
            }

            if (this.chatFrameIds == null && null == this.field2758) {
               this.field2729 = 0;
            } else {
               this.field2729 = 1885490054;
            }
         }

         label56:
         if (this.SequenceDefinition_cachedModelId * -1606113103 == -1) {
            if (var1 >= -445827419) {
               throw new IllegalStateException();
            }

            if (null == this.chatFrameIds) {
               if (var1 >= -445827419) {
                  return;
               }

               if (this.field2758 == null) {
                  this.restartMode = 0;
                  break label56;
               }
            }

            this.field2720 = 1219575970;
         }

         if (null != this.frameLengths) {
            if (var1 >= -445827419) {
               throw new IllegalStateException();
            }

            this.shield = 0;

            for (int var2 = 0; var2 < this.frameLengths.length; var2++) {
               if (var1 >= -445827419) {
                  throw new IllegalStateException();
               }

               this.field2734 = this.field2752 + 90364675 * this.frameIds[var2];
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "iw.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ah")
   public boolean method5245(byte var1) {
      try {
         return this.restartMode * -326405849 >= 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "iw.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lky;IB)Lky;")
   @ObfuscatedName("ai")
   public Model transformWidgetModel(Model var1, int var2, byte var3) {
      if (var2 < 0 && !this.method5242()) {
         int var30 = var2 ^ Integer.MIN_VALUE;
         int var5 = var30 >> 16 & 16383;
         boolean var6 = (var30 & 1073741824) != 0;
         var2 = var30 & 65535;
         int var7 = var2 + 1;
         if (var7 >= this.frameLengths.length) {
            if (field2738.contains(this.frameCount)) {
               var7 = -1;
            } else if (this.shield * 1996641051 > 0) {
               var7 -= this.frameCount * 1996641051;
            } else if (var6) {
               var7 = 0;
            }
         }

         int var8 = this.frameLengths[var2];
         Frames var9 = SecureUrlRequester.client.method2577(var8 >> 16);
         int var10 = var8 & 65535;
         int var11 = -1;
         Frames var12 = null;
         if (var7 >= 0 && var7 < this.frameIds.length) {
            int var13 = this.frameIds[var7];
            var12 = SecureUrlRequester.client.method2577(var13 >> 16);
            var11 = var13 & 65535;
         }

         if (var9 == null) {
            return var1.method6727(true);
         } else {
            Model var31 = var1.method6724(!var9.frames[var10].hasAlphaTransform);
            var31.method6862(rl19.field5583, var9, var10, var12, var11, var5, this.frameLengths[var2]);
            return var31;
         }
      } else {
         if (var2 < 0) {
            int var4 = var2 ^ Integer.MIN_VALUE;
            var2 = var4 & 65535;
         }

         int var16 = var2;
         Model var15 = var1;
         SequenceDefinition var14 = this;
         byte var17 = 45;

         try {
            Model var10000;
            if (!var14.method5245((byte)71)) {
               if (var17 <= 2) {
                  throw new IllegalStateException();
               }

               var16 = var14.frameLengths[var16];
               Frames var18 = UrlRequest.getFrames(var16 >> 16, -347296596);
               var16 &= 65535;
               if (null == var18) {
                  if (var17 <= 2) {
                     throw new IllegalStateException();
                  }

                  Model var32 = var15.method6723(true);
                  var10000 = var32;
               } else {
                  boolean var10001;
                  if (!var18.hasAlphaTransform(var16, (byte)63)) {
                     if (var17 <= 2) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  Model var19 = var15.method6723(var10001);
                  var19.animate(var18, var16);
                  var10000 = var19;
               }
            } else {
               int var37 = var14.field2734 * -326405849;
               classFY var36;
               if (HitSplatDefinition.method4993(var37, 1402352388) != 0) {
                  var36 = null;
               } else {
                  classFY var21 = (classFY)class402.method8806(SequenceDefinition_cachedFrames, var37);
                  classFY var20;
                  if (null != var21) {
                     if (var17 <= 2) {
                        throw new IllegalStateException();
                     }

                     var20 = var21;
                  } else {
                     AbstractArchive var23 = WorldMapData_0.SequenceDefinition_skeletonsArchive;
                     AbstractArchive var24 = WorldMapIcon_0.SpotAnimationDefinition_archive;
                     boolean var25 = WorldMapSectionType.method7176(var23, var24, var37, -1267610787);
                     classFY var22;
                     if (!var25) {
                        if (var17 <= 2) {
                           throw new IllegalStateException();
                        }

                        var22 = null;
                     } else {
                        if (classFY.field1932 == null) {
                           if (var17 <= 2) {
                              throw new IllegalStateException();
                           }

                           classFY.field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
                           classFY.field1932 = new ThreadPoolExecutor(
                              0,
                              1886450023 * classFY.field1930,
                              0L,
                              TimeUnit.MILLISECONDS,
                              new ArrayBlockingQueue<>(100 + -333558724 * classFY.field1930),
                              new classIO(var14)
                           );
                        }

                        try {
                           var22 = new classFY(var23, var24, var37);
                        } catch (Exception var27) {
                           var22 = null;
                        }
                     }

                     if (var22 != null) {
                        if (var17 <= 2) {
                           throw new IllegalStateException();
                        }

                        SequenceDefinition_cachedFrames.method7374(var22, var37);
                     }

                     var20 = var22;
                  }

                  var36 = var20;
               }

               if (null == var36) {
                  if (var17 <= 2) {
                     throw new IllegalStateException();
                  }

                  Model var33 = var15.method6725(true);
                  var10000 = var33;
               } else {
                  boolean var39;
                  if (!var36.method4169((byte)12)) {
                     if (var17 <= 2) {
                        throw new IllegalStateException();
                     }

                     var39 = true;
                  } else {
                     var39 = false;
                  }

                  Model var38 = var15.method6724(var39);
                  var38.method6895(var36, var16);
                  var10000 = var38;
               }
            }

            return var10000;
         } catch (RuntimeException var28) {
            throw RestClientThreadFactory.newRunException(var28, "iw.aw(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   public int method5259(int var1) {
      try {
         return this.field2751 * -808909293;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "iw.ar(" + 41);
      }
   }
}
