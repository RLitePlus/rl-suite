import net.runelite.api.IterableHashTable;
import net.runelite.api.ParamHolder;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hu")
public class NPCComposition extends DualNode implements ParamHolder, net.runelite.api.NPCComposition {
   @ObfuscatedName("ca")
   short[] retextureFrom;
   @ObfuscatedName("dn")
   short[] headIconSpriteIndex;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field2357 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field2358 = 12;
   @ObfuscatedName("ci")
   public int field2326;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field2359 = 31;
   @ObfuscatedName("dj")
   public boolean isInteractable;
   @ToRemove(unused = "true")
   @ObfuscatedName("bf")
   static final int field2361 = 116;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ch")
   static EvictingDualNodeHashTable NpcDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ce")
   static EvictingDualNodeHashTable NpcDefinition_cachedModels = new EvictingDualNodeHashTable(50);
   @ObfuscatedName("dl")
   public boolean isFollower;
   @ObfuscatedName("ct")
   public String name = Strings.field4861;
   @ObfuscatedName("cm")
   public int size = 110741447;
   @ObfuscatedName("cb")
   int[] models;
   @ObfuscatedName("ck")
   int[] chatHeadModels;
   @ObfuscatedName("cc")
   public int idleSequence = -258041133;
   @ObfuscatedName("cs")
   public int turnLeftSequence = -1964285235;
   @ObfuscatedName("cn")
   public int turnRightSequence = 1165091883;
   @ObfuscatedName("co")
   public int walkSequence = -2031991097;
   @ObfuscatedName("cq")
   public int field2339;
   @ObfuscatedName("cr")
   short[] recolorFrom;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final float field2354 = 0.4F;
   @ObfuscatedName("cd")
   public int field2348;
   @ObfuscatedName("cz")
   public int field2325;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field2360 = 8;
   @ObfuscatedName("cf")
   public int field2340;
   @ObfuscatedName("cy")
   public int field2328;
   @ObfuscatedSignature(descriptor = "Lql;")
   @ObfuscatedName("dq")
   IterableNodeHashTable params;
   @ObfuscatedName("cv")
   public int field2330;
   @ObfuscatedName("cw")
   public int field2344;
   @ObfuscatedName("da")
   public boolean isClipped;
   @ObfuscatedName("cj")
   public short[] recolorTo;
   @ObfuscatedName("dc")
   int ambient;
   @ObfuscatedName("cl")
   public short[] retextureTo;
   @ObfuscatedName("dd")
   public String[] actions;
   @ObfuscatedName("dw")
   public boolean drawMapDot;
   @ObfuscatedName("dz")
   int transformVarbit;
   @ObfuscatedName("df")
   int widthScale;
   @ObfuscatedName("dy")
   int heightScale;
   @ObfuscatedName("cx")
   public int walkBackSequence = -1279367173;
   @ObfuscatedName("cu")
   public int id;
   @ObfuscatedName("dt")
   public int rotation;
   @ObfuscatedName("dh")
   public int[] transforms;
   @ObfuscatedName("ec")
   int footprintSize;
   @ObfuscatedName("di")
   int transformVarp;
   @ObfuscatedName("cg")
   public int walkLeftSequence = 1677794215;
   @ObfuscatedName("db")
   int contrast;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field2355 = 33;
   @ObfuscatedName("dr")
   public boolean lowPriorityFollowerOps;
   @ObfuscatedName("dx")
   public int field2329;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field2356 = 30;
   @ObfuscatedName("do")
   int[] stats;
   @ObfuscatedName("dk")
   int[] headIconArchiveIds;
   @ObfuscatedName("dv")
   public int combatLevel;
   @ObfuscatedName("cp")
   public int walkRightSequence = -1666825923;
   @ObfuscatedName("ea")
   boolean field2353;
   @ObfuscatedName("ee")
   int field2351;
   @ObfuscatedSignature(descriptor = "Lhp;")
   @ObfuscatedName("eq")
   public class201 field2352;
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   public static final int field2362 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   public static final int field2363 = 57;
   @ToRemove(unused = "true")
   @ObfuscatedName("by")
   static final int field2364 = 36;

   public int getHeightScale() {
      return this.heightScale * 957368917;
   }

   public int getSize() {
      return this.size * 1880345079;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ag")
   void postDecode(byte var1) {
      try {
         if (-1 == this.footprintSize * 964807653) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            this.footprintSize = -500467219 * (int)(0.4F * (this.size * 166001536));
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hu.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhu;ILjava/lang/String;B)Ljava/lang/String;")
   @ObfuscatedName("te")
   public static String method4698(NPCComposition var0, int var1, String var2, byte var3) {
      if (var0 == null) {
         var0.getStringParam(var1, var2, var3);
      }

      try {
         return Projectile.method1418(var0.params, var1, var2, -1790282734);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hu.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lha;)Ljm;")
   @ObfuscatedName("by")
   public final ModelData method4676(NpcOverrides var1) {
      if (null != this.transforms) {
         NPCComposition var2 = method4683(this, (byte)0);
         return null == var2 ? null : method4677(var2, var1, 520160671);
      } else {
         return this.getModelData(this.chatHeadModels, var1, -1657410865);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;IB)V")
   @ObfuscatedName("ae")
   void decodeNext(Buffer var1, int var2, byte var3) {
      try {
         switch (var2) {
            case 1:
               int var13 = var1.readUnsignedByte(-1011155166);
               this.models = new int[var13];

               for (int var18 = 0; var18 < var13; var18++) {
                  if (var3 == 0) {
                     return;
                  }

                  this.models[var18] = Buffer.method12008(var1, (byte)5);
               }
               break;
            case 2:
               this.name = var1.readStringCp1252NullCircumfixed(-1662931412);
               break;
            case 12:
               this.size = var1.readUnsignedByte(-1404938459) * 110741447;
               break;
            case 13:
               this.idleSequence = Buffer.method12008(var1, (byte)5) * 258041133;
               break;
            case 14:
               this.walkSequence = Buffer.method12008(var1, (byte)5) * 2031991097;
               break;
            case 15:
               this.turnLeftSequence = Buffer.method12008(var1, (byte)5) * 1964285235;
               break;
            case 16:
               this.turnRightSequence = Buffer.method12008(var1, (byte)5) * -1165091883;
               break;
            case 17:
               this.walkSequence = Buffer.method12008(var1, (byte)5) * 2031991097;
               this.walkBackSequence = Buffer.method12008(var1, (byte)5) * 1279367173;
               this.walkLeftSequence = Buffer.method12008(var1, (byte)5) * -1677794215;
               this.walkRightSequence = Buffer.method12008(var1, (byte)5) * 1666825923;
               break;
            case 18:
               Buffer.method12008(var1, (byte)5);
               break;
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
               this.actions[var2 - 30] = var1.readStringCp1252NullCircumfixed(1765342234);
               if (this.actions[var2 - 30].equalsIgnoreCase(Strings.field4856)) {
                  if (var3 == 0) {
                     throw new IllegalStateException();
                  }

                  this.actions[var2 - 30] = null;
               }
               break;
            case 40:
               int var12 = var1.readUnsignedByte(2139276374);
               this.retextureFrom = new short[var12];
               this.recolorTo = new short[var12];

               for (int var17 = 0; var17 < var12; var17++) {
                  if (var3 == 0) {
                     return;
                  }

                  this.retextureFrom[var17] = (short)Buffer.method12008(var1, (byte)5);
                  this.recolorTo[var17] = (short)Buffer.method12008(var1, (byte)5);
               }
               break;
            case 41:
               int var11 = var1.readUnsignedByte(-1589662563);
               this.headIconSpriteIndex = new short[var11];
               this.retextureTo = new short[var11];

               for (int var16 = 0; var16 < var11; var16++) {
                  if (var3 == 0) {
                     throw new IllegalStateException();
                  }

                  this.headIconSpriteIndex[var16] = (short)Buffer.method12008(var1, (byte)5);
                  this.retextureTo[var16] = (short)Buffer.method12008(var1, (byte)5);
               }
               break;
            case 60:
               int var10 = var1.readUnsignedByte(1063184981);
               this.chatHeadModels = new int[var10];

               for (int var15 = 0; var15 < var10; var15++) {
                  if (var3 == 0) {
                     throw new IllegalStateException();
                  }

                  this.chatHeadModels[var15] = Buffer.method12008(var1, (byte)5);
               }
               break;
            case 74:
               this.stats[0] = Buffer.method12008(var1, (byte)5);
               break;
            case 75:
               this.stats[1] = Buffer.method12008(var1, (byte)5);
               break;
            case 76:
               this.stats[2] = Buffer.method12008(var1, (byte)5);
               break;
            case 77:
               this.stats[3] = Buffer.method12008(var1, (byte)5);
               break;
            case 78:
               this.stats[4] = Buffer.method12008(var1, (byte)5);
               break;
            case 79:
               this.stats[5] = Buffer.method12008(var1, (byte)5);
               break;
            case 93:
               this.drawMapDot = false;
               break;
            case 95:
               this.combatLevel = Buffer.method12008(var1, (byte)5) * 245421895;
               break;
            case 97:
               this.widthScale = Buffer.method12008(var1, (byte)5) * 375459011;
               break;
            case 98:
               this.heightScale = Buffer.method12008(var1, (byte)5) * -89496835;
               break;
            case 99:
               this.field2352 = class201.field2280;
               break;
            case 100:
               this.ambient = Buffer.method12001(var1, (byte)100) * 2036214745;
               break;
            case 101:
               this.contrast = Buffer.method12001(var1, (byte)35) * 1314851671;
               break;
            case 102:
               int var9 = var1.readUnsignedByte(681929981);
               int var14 = 0;

               for (int var19 = var9; var19 != 0; var19 >>= 1) {
                  if (var3 == 0) {
                     throw new IllegalStateException();
                  }

                  var14++;
               }

               this.headIconArchiveIds = new int[var14];
               this.recolorFrom = new short[var14];

               for (int var7 = 0; var7 < var14; var7++) {
                  if (var3 == 0) {
                     throw new IllegalStateException();
                  }

                  if ((var9 & 1 << var7) == 0) {
                     if (var3 == 0) {
                        throw new IllegalStateException();
                     }

                     this.headIconArchiveIds[var7] = -1;
                     this.recolorFrom[var7] = -1;
                  } else {
                     this.headIconArchiveIds[var7] = var1.readNullableLargeSmart(-876140745);
                     this.recolorFrom[var7] = (short)var1.readShortSmartSub(995772588);
                  }
               }
               break;
            case 103:
               this.rotation = Buffer.method12008(var1, (byte)5) * -749482155;
               break;
            case 106:
            case 118:
               this.transformVarbit = Buffer.method12008(var1, (byte)5) * -1310174059;
               if (65535 == this.transformVarbit * -277752131) {
                  this.transformVarbit = 1310174059;
               }

               this.transformVarp = Buffer.method12008(var1, (byte)5) * 160996041;
               if (65535 == this.transformVarp * 1524408185) {
                  if (var3 == 0) {
                     return;
                  }

                  this.transformVarp = -160996041;
               }

               int var4 = -1;
               if (118 == var2) {
                  if (var3 == 0) {
                     throw new IllegalStateException();
                  }

                  var4 = Buffer.method12008(var1, (byte)5);
                  if (var4 == 65535) {
                     if (var3 == 0) {
                        return;
                     }

                     var4 = -1;
                  }
               }

               int var5 = var1.readUnsignedByte(-1342825728);
               this.transforms = new int[2 + var5];

               for (int var6 = 0; var6 <= var5; var6++) {
                  if (var3 == 0) {
                     throw new IllegalStateException();
                  }

                  this.transforms[var6] = Buffer.method12008(var1, (byte)5);
                  if (65535 == this.transforms[var6]) {
                     this.transforms[var6] = -1;
                  }
               }

               this.transforms[1 + var5] = var4;
               break;
            case 107:
               this.isInteractable = false;
               break;
            case 109:
               this.isClipped = false;
               break;
            case 111:
               this.field2352 = class201.field2282;
               break;
            case 114:
               this.field2348 = Buffer.method12008(var1, (byte)5) * 1856934135;
               break;
            case 115:
               this.field2348 = Buffer.method12008(var1, (byte)5) * 1856934135;
               this.field2325 = Buffer.method12008(var1, (byte)5) * -1442798063;
               this.field2326 = Buffer.method12008(var1, (byte)5) * 2095412907;
               this.field2340 = Buffer.method12008(var1, (byte)5) * -149210883;
               break;
            case 116:
               this.field2328 = Buffer.method12008(var1, (byte)5) * -1486356493;
               break;
            case 117:
               this.field2328 = Buffer.method12008(var1, (byte)5) * -1486356493;
               this.field2339 = Buffer.method12008(var1, (byte)5) * -1573939233;
               this.field2330 = Buffer.method12008(var1, (byte)5) * 1992715801;
               this.field2344 = Buffer.method12008(var1, (byte)5) * -1155876637;
               break;
            case 122:
               this.isFollower = true;
               break;
            case 123:
               this.lowPriorityFollowerOps = true;
               break;
            case 124:
               this.field2329 = Buffer.method12008(var1, (byte)5) * -911902981;
               break;
            case 126:
               this.footprintSize = Buffer.method12008(var1, (byte)5) * -500467219;
               break;
            case 145:
               this.field2353 = true;
               break;
            case 146:
               this.field2351 = Buffer.method12008(var1, (byte)5) * -1261559427;
               break;
            case 249:
               this.params = class406.readStringIntParameters(var1, this.params, (byte)51);
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "hu.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("bj")
   void method4668(Buffer var1, int var2) {
      switch (var2) {
         case 1:
            int var11 = var1.readUnsignedByte(-855451883);
            this.models = new int[var11];

            for (int var16 = 0; var16 < var11; var16++) {
               this.models[var16] = Buffer.method12008(var1, (byte)5);
            }
            break;
         case 2:
            this.name = var1.readStringCp1252NullCircumfixed(912430666);
            break;
         case 12:
            this.size = var1.readUnsignedByte(-472915660) * 834965768;
            break;
         case 13:
            this.idleSequence = Buffer.method12008(var1, (byte)5) * -1265505081;
            break;
         case 14:
            this.walkSequence = Buffer.method12008(var1, (byte)5) * -1874189658;
            break;
         case 15:
            this.turnLeftSequence = Buffer.method12008(var1, (byte)5) * 1047828192;
            break;
         case 16:
            this.turnRightSequence = Buffer.method12008(var1, (byte)5) * -1165091883;
            break;
         case 17:
            this.walkSequence = Buffer.method12008(var1, (byte)5) * 2031991097;
            this.walkBackSequence = Buffer.method12008(var1, (byte)5) * -640618886;
            this.walkLeftSequence = Buffer.method12008(var1, (byte)5) * -1677794215;
            this.walkRightSequence = Buffer.method12008(var1, (byte)5) * 172811979;
            break;
         case 18:
            Buffer.method12008(var1, (byte)5);
            break;
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
            this.actions[var2 - 30] = var1.readStringCp1252NullCircumfixed(770680910);
            if (this.actions[var2 - 30].equalsIgnoreCase(Strings.field4856)) {
               this.actions[var2 - 30] = null;
            }
            break;
         case 40:
            int var10 = var1.readUnsignedByte(985124422);
            this.retextureFrom = new short[var10];
            this.recolorTo = new short[var10];

            for (int var15 = 0; var15 < var10; var15++) {
               this.retextureFrom[var15] = (short)Buffer.method12008(var1, (byte)5);
               this.recolorTo[var15] = (short)Buffer.method12008(var1, (byte)5);
            }
            break;
         case 41:
            int var9 = var1.readUnsignedByte(-186931362);
            this.headIconSpriteIndex = new short[var9];
            this.retextureTo = new short[var9];

            for (int var14 = 0; var14 < var9; var14++) {
               this.headIconSpriteIndex[var14] = (short)Buffer.method12008(var1, (byte)5);
               this.retextureTo[var14] = (short)Buffer.method12008(var1, (byte)5);
            }
            break;
         case 60:
            int var8 = var1.readUnsignedByte(1840592616);
            this.chatHeadModels = new int[var8];

            for (int var13 = 0; var13 < var8; var13++) {
               this.chatHeadModels[var13] = Buffer.method12008(var1, (byte)5);
            }
            break;
         case 74:
            this.stats[0] = Buffer.method12008(var1, (byte)5);
            break;
         case 75:
            this.stats[1] = Buffer.method12008(var1, (byte)5);
            break;
         case 76:
            this.stats[2] = Buffer.method12008(var1, (byte)5);
            break;
         case 77:
            this.stats[3] = Buffer.method12008(var1, (byte)5);
            break;
         case 78:
            this.stats[4] = Buffer.method12008(var1, (byte)5);
            break;
         case 79:
            this.stats[5] = Buffer.method12008(var1, (byte)5);
            break;
         case 93:
            this.drawMapDot = false;
            break;
         case 95:
            this.combatLevel = Buffer.method12008(var1, (byte)5) * 245421895;
            break;
         case 97:
            this.widthScale = Buffer.method12008(var1, (byte)5) * 1050298001;
            break;
         case 98:
            this.heightScale = Buffer.method12008(var1, (byte)5) * -413008279;
            break;
         case 99:
            this.field2352 = class201.field2280;
            break;
         case 100:
            this.ambient = Buffer.method12001(var1, (byte)93) * 1997242563;
            break;
         case 101:
            this.contrast = Buffer.method12001(var1, (byte)10) * 1314851671;
            break;
         case 102:
            int var7 = var1.readUnsignedByte(1340493836);
            int var12 = 0;

            for (int var17 = var7; var17 != 0; var17 >>= 1) {
               var12++;
            }

            this.headIconArchiveIds = new int[var12];
            this.recolorFrom = new short[var12];

            for (int var6 = 0; var6 < var12; var6++) {
               if ((var7 & 1 << var6) == 0) {
                  this.headIconArchiveIds[var6] = -1;
                  this.recolorFrom[var6] = -1;
               } else {
                  this.headIconArchiveIds[var6] = var1.readNullableLargeSmart(-1173059708);
                  this.recolorFrom[var6] = (short)var1.readShortSmartSub(-521668429);
               }
            }
            break;
         case 103:
            this.rotation = Buffer.method12008(var1, (byte)5) * -1990168809;
            break;
         case 106:
         case 118:
            this.transformVarbit = Buffer.method12008(var1, (byte)5) * -1310174059;
            if (65535 == this.transformVarbit * 1595470954) {
               this.transformVarbit = -192777948;
            }

            this.transformVarp = Buffer.method12008(var1, (byte)5) * 160996041;
            if (1020142062 == this.transformVarp * 1524408185) {
               this.transformVarp = -160996041;
            }

            int var3 = -1;
            if (118 == var2) {
               var3 = Buffer.method12008(var1, (byte)5);
               if (var3 == -1292871990) {
                  var3 = -1;
               }
            }

            int var4 = var1.readUnsignedByte(2084792556);
            this.transforms = new int[2 + var4];

            for (int var5 = 0; var5 <= var4; var5++) {
               this.transforms[var5] = Buffer.method12008(var1, (byte)5);
               if (-1196709986 == this.transforms[var5]) {
                  this.transforms[var5] = -1;
               }
            }

            this.transforms[1 + var4] = var3;
            break;
         case 107:
            this.isInteractable = false;
            break;
         case 109:
            this.isClipped = false;
            break;
         case 111:
            this.field2352 = class201.field2282;
            break;
         case 114:
            this.field2348 = Buffer.method12008(var1, (byte)5) * 823866272;
            break;
         case 115:
            this.field2348 = Buffer.method12008(var1, (byte)5) * 1856934135;
            this.field2325 = Buffer.method12008(var1, (byte)5) * 1503176570;
            this.field2326 = Buffer.method12008(var1, (byte)5) * 2095412907;
            this.field2340 = Buffer.method12008(var1, (byte)5) * -149210883;
            break;
         case 116:
            this.field2328 = Buffer.method12008(var1, (byte)5) * 854451162;
            break;
         case 117:
            this.field2328 = Buffer.method12008(var1, (byte)5) * -1486356493;
            this.field2339 = Buffer.method12008(var1, (byte)5) * -2121682939;
            this.field2330 = Buffer.method12008(var1, (byte)5) * 1992715801;
            this.field2344 = Buffer.method12008(var1, (byte)5) * -1155876637;
            break;
         case 122:
            this.isFollower = true;
            break;
         case 123:
            this.lowPriorityFollowerOps = true;
            break;
         case 124:
            this.field2329 = Buffer.method12008(var1, (byte)5) * -179126608;
            break;
         case 126:
            this.footprintSize = Buffer.method12008(var1, (byte)5) * 1413571105;
            break;
         case 145:
            this.field2353 = true;
            break;
         case 146:
            this.field2351 = Buffer.method12008(var1, (byte)5) * -1239501023;
            break;
         case 249:
            this.params = class406.readStringIntParameters(var1, this.params, (byte)65);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhu;")
   @ObfuscatedName("al")
   public static NPCComposition method4654(int var0) {
      NPCComposition var1 = (NPCComposition)class402.method8806(NpcDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Username.NpcDefinition_archive.getFile(9, var0, 1253642120);
         var1 = new NPCComposition();
         var1.id = 596350035 * var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2), 767231947);
         }

         var1.postDecode((byte)17);
         NpcDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "([ILha;I)Ljm;")
   @ObfuscatedName("aw")
   ModelData getModelData(int[] var1, NpcOverrides var2, int var3) {
      try {
         int[] var4 = var1;
         if (var2 != null) {
            if (var3 >= -603351739) {
               throw new IllegalStateException();
            }

            if (var2.modelIds != null) {
               if (var3 >= -603351739) {
                  throw new IllegalStateException();
               }

               var4 = var2.modelIds;
            }
         }

         if (var4 == null) {
            if (var3 >= -603351739) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            boolean var5 = false;

            for (int var6 = 0; var6 < var4.length; var6++) {
               if (var3 >= -603351739) {
                  throw new IllegalStateException();
               }

               if (var4[var6] != -1) {
                  if (var3 >= -603351739) {
                     throw new IllegalStateException();
                  }

                  if (!class348.field4292.tryLoadFile(var4[var6], 0, 756705879)) {
                     if (var3 >= -603351739) {
                        throw new IllegalStateException();
                     }

                     var5 = true;
                  }
               }
            }

            if (var5) {
               if (var3 >= -603351739) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               ModelData[] var11 = new ModelData[var4.length];

               for (int var7 = 0; var7 < var4.length; var7++) {
                  if (var3 >= -603351739) {
                     throw new IllegalStateException();
                  }

                  var11[var7] = ModelData.ModelData_get(class348.field4292, var4[var7], 0);
               }

               ModelData var12;
               if (1 == var11.length) {
                  var12 = var11[0];
                  if (null == var12) {
                     if (var3 >= -603351739) {
                        throw new IllegalStateException();
                     }

                     var12 = new ModelData(var11, var11.length);
                  }
               } else {
                  var12 = new ModelData(var11, var11.length);
               }

               if (null != this.retextureFrom) {
                  if (var3 >= -603351739) {
                     throw new IllegalStateException();
                  }

                  short[] var8 = this.recolorTo;
                  if (var2 != null) {
                     if (var3 >= -603351739) {
                        throw new IllegalStateException();
                     }

                     if (var2.recolorTo != null) {
                        if (var3 >= -603351739) {
                           throw new IllegalStateException();
                        }

                        var8 = var2.recolorTo;
                     }
                  }

                  for (int var9 = 0; var9 < this.retextureFrom.length; var9++) {
                     if (var3 >= -603351739) {
                        throw new IllegalStateException();
                     }

                     var12.recolor(this.retextureFrom[var9], var8[var9]);
                  }
               }

               if (null != this.headIconSpriteIndex) {
                  if (var3 >= -603351739) {
                     throw new IllegalStateException();
                  }

                  short[] var13 = this.retextureTo;
                  if (var2 != null && null != var2.retextureTo) {
                     if (var3 >= -603351739) {
                        throw new IllegalStateException();
                     }

                     var13 = var2.retextureTo;
                  }

                  for (int var14 = 0; var14 < this.headIconSpriteIndex.length; var14++) {
                     if (var3 >= -603351739) {
                        throw new IllegalStateException();
                     }

                     ModelData.method6071(var12, this.headIconSpriteIndex[var14], var13[var14]);
                  }
               }

               return var12;
            }
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "hu.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ai")
   public int[] method4707(int var1) {
      try {
         return this.headIconArchiveIds;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hu.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("as")
   public int method4710(int var1, int var2) {
      try {
         if (this.headIconArchiveIds != null) {
            if (var2 == -1793120611) {
               throw new IllegalStateException();
            }

            if (var1 < this.headIconArchiveIds.length) {
               return this.headIconArchiveIds[var1];
            }

            if (var2 == -1793120611) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "hu.as(" + 41);
      }
   }

   public int[] getChatheadModels() {
      return this.chatHeadModels;
   }

   @ObfuscatedSignature(descriptor = "(IB)S")
   @ObfuscatedName("ab")
   public short method4715(int var1, byte var2) {
      try {
         return null != this.recolorFrom && var1 < this.recolorFrom.length ? this.recolorFrom[var1] : -1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "hu.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   public int method4718(int var1) {
      try {
         return this.footprintSize * 964807653;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hu.ax(" + 41);
      }
   }

   public int[] getConfigs() {
      return this.transforms;
   }

   @ObfuscatedSignature(descriptor = "(Lhu;III)I")
   @ObfuscatedName("kv")
   public static int method4694(NPCComposition var0, int var1, int var2, int var3) {
      if (var0 == null) {
         return var0.getIntParam(var1, var1, var1);
      } else {
         try {
            return class108.method3858(var0.params, var1, var2, -43392855);
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "hu.au(" + 41);
         }
      }
   }

   public int[] getStats() {
      return this.stats;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ad")
   public boolean method4722(int var1) {
      try {
         return this.field2353;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hu.ar(" + ')');
      }
   }

   public short[] getColorToReplace() {
      return this.retextureFrom;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bl")
   public boolean method4687() {
      if (this.transforms == null) {
         return true;
      } else {
         int var1 = -1;
         if (this.transformVarbit * 1014136856 != -1) {
            var1 = WorldMapData_1.getVarbit(this.transformVarbit * -1348579366, -1343048727);
         } else if (-1 != -1678936112 * this.transformVarp) {
            var1 = Varps.Varps_main[this.transformVarp * 1524408185];
         }

         return var1 >= 0 && var1 < this.transforms.length ? this.transforms[var1] != -1 : this.transforms[this.transforms.length - 1] != -1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhu;")
   @ObfuscatedName("af")
   public static NPCComposition method4655(int var0) {
      NPCComposition var1 = (NPCComposition)class402.method8806(NpcDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Username.NpcDefinition_archive.getFile(9, var0, -1524350112);
         var1 = new NPCComposition();
         var1.id = 596350035 * var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2), 933765950);
         }

         var1.postDecode((byte)43);
         NpcDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhu;")
   @ObfuscatedName("am")
   public static NPCComposition method4656(int var0) {
      NPCComposition var1 = (NPCComposition)class402.method8806(NpcDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Username.NpcDefinition_archive.getFile(9, var0, 1077921102);
         var1 = new NPCComposition();
         var1.id = 596350035 * var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2), 1050934243);
         }

         var1.postDecode((byte)5);
         NpcDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   public boolean isInteractible() {
      return this.isInteractable;
   }

   @ObfuscatedSignature(descriptor = "(ILvz;)V")
   @ObfuscatedName("tz")
   public void method4728(int var1, Node var2) {
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

   @ObfuscatedSignature(descriptor = "(B)[S")
   @ObfuscatedName("ac")
   public short[] method4712(byte var1) {
      try {
         return this.recolorFrom;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hu.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   public static void method4658() {
      NpcDefinition_cached.clear();
      NpcDefinition_cachedModels.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   public static void method4659() {
      NpcDefinition_cached.clear();
      NpcDefinition_cachedModels.clear();
   }

   @ObfuscatedSignature(descriptor = "(Lhu;I)I")
   @ObfuscatedName("rt")
   public static int method4724(NPCComposition var0, int var1) {
      if (var0 == null) {
         return var0.method4726(var1);
      } else {
         try {
            return var0.field2351 * 254812117;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "hu.ah(" + 41);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   public static void method4660() {
      NpcDefinition_cached.clear();
      NpcDefinition_cachedModels.clear();
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("ck")
   public int[] method4708() {
      return this.headIconArchiveIds;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   void method4663() {
      if (-1 == this.footprintSize * 964807653) {
         this.footprintSize = -500467219 * (int)(0.4F * (this.size * 166001536));
      }
   }

   public void setValue(int var1, String var2) {
      this.method4728(var1, new ObjectNode(var2));
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("an")
   void decode(Buffer var1, int var2) {
      try {
         while (true) {
            int var3 = var1.readUnsignedByte(1263981355);
            if (0 == var3) {
               if (var2 <= 397667101) {
                  return;
               }

               return;
            }

            this.decodeNext(var1, var3, (byte)-48);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hu.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("bk")
   void method4665(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(985139026);
         if (0 == var2) {
            return;
         }

         this.decodeNext(var1, var2, (byte)36);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("bb")
   void method4669(Buffer var1, int var2) {
      switch (var2) {
         case 1:
            int var11 = var1.readUnsignedByte(-572622730);
            this.models = new int[var11];

            for (int var16 = 0; var16 < var11; var16++) {
               this.models[var16] = Buffer.method12008(var1, (byte)5);
            }
            break;
         case 2:
            this.name = var1.readStringCp1252NullCircumfixed(-516704485);
            break;
         case 12:
            this.size = var1.readUnsignedByte(-571552051) * -259752872;
            break;
         case 13:
            this.idleSequence = Buffer.method12008(var1, (byte)5) * -830128967;
            break;
         case 14:
            this.walkSequence = Buffer.method12008(var1, (byte)5) * -2109633006;
            break;
         case 15:
            this.turnLeftSequence = Buffer.method12008(var1, (byte)5) * 1964285235;
            break;
         case 16:
            this.turnRightSequence = Buffer.method12008(var1, (byte)5) * 209175153;
            break;
         case 17:
            this.walkSequence = Buffer.method12008(var1, (byte)5) * 1741999643;
            this.walkBackSequence = Buffer.method12008(var1, (byte)5) * 1279367173;
            this.walkLeftSequence = Buffer.method12008(var1, (byte)5) * -1056535350;
            this.walkRightSequence = Buffer.method12008(var1, (byte)5) * -858523032;
            break;
         case 18:
            Buffer.method12008(var1, (byte)5);
            break;
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
            this.actions[var2 - 30] = var1.readStringCp1252NullCircumfixed(-1459665898);
            if (this.actions[var2 - 30].equalsIgnoreCase(Strings.field4856)) {
               this.actions[var2 - 30] = null;
            }
            break;
         case 40:
            int var10 = var1.readUnsignedByte(2097573478);
            this.retextureFrom = new short[var10];
            this.recolorTo = new short[var10];

            for (int var15 = 0; var15 < var10; var15++) {
               this.retextureFrom[var15] = (short)Buffer.method12008(var1, (byte)5);
               this.recolorTo[var15] = (short)Buffer.method12008(var1, (byte)5);
            }
            break;
         case 41:
            int var9 = var1.readUnsignedByte(-1694071055);
            this.headIconSpriteIndex = new short[var9];
            this.retextureTo = new short[var9];

            for (int var14 = 0; var14 < var9; var14++) {
               this.headIconSpriteIndex[var14] = (short)Buffer.method12008(var1, (byte)5);
               this.retextureTo[var14] = (short)Buffer.method12008(var1, (byte)5);
            }
            break;
         case 60:
            int var8 = var1.readUnsignedByte(1254224202);
            this.chatHeadModels = new int[var8];

            for (int var13 = 0; var13 < var8; var13++) {
               this.chatHeadModels[var13] = Buffer.method12008(var1, (byte)5);
            }
            break;
         case 74:
            this.stats[0] = Buffer.method12008(var1, (byte)5);
            break;
         case 75:
            this.stats[1] = Buffer.method12008(var1, (byte)5);
            break;
         case 76:
            this.stats[2] = Buffer.method12008(var1, (byte)5);
            break;
         case 77:
            this.stats[3] = Buffer.method12008(var1, (byte)5);
            break;
         case 78:
            this.stats[4] = Buffer.method12008(var1, (byte)5);
            break;
         case 79:
            this.stats[5] = Buffer.method12008(var1, (byte)5);
            break;
         case 93:
            this.drawMapDot = false;
            break;
         case 95:
            this.combatLevel = Buffer.method12008(var1, (byte)5) * 245421895;
            break;
         case 97:
            this.widthScale = Buffer.method12008(var1, (byte)5) * -1026084485;
            break;
         case 98:
            this.heightScale = Buffer.method12008(var1, (byte)5) * -1968530535;
            break;
         case 99:
            this.field2352 = class201.field2280;
            break;
         case 100:
            this.ambient = Buffer.method12001(var1, (byte)121) * -433311808;
            break;
         case 101:
            this.contrast = Buffer.method12001(var1, (byte)87) * 1314851671;
            break;
         case 102:
            int var7 = var1.readUnsignedByte(-1410797009);
            int var12 = 0;

            for (int var17 = var7; var17 != 0; var17 >>= 1) {
               var12++;
            }

            this.headIconArchiveIds = new int[var12];
            this.recolorFrom = new short[var12];

            for (int var6 = 0; var6 < var12; var6++) {
               if ((var7 & 1 << var6) == 0) {
                  this.headIconArchiveIds[var6] = -1;
                  this.recolorFrom[var6] = -1;
               } else {
                  this.headIconArchiveIds[var6] = var1.readNullableLargeSmart(-249474181);
                  this.recolorFrom[var6] = (short)var1.readShortSmartSub(-732425929);
               }
            }
            break;
         case 103:
            this.rotation = Buffer.method12008(var1, (byte)5) * -621662127;
            break;
         case 106:
         case 118:
            this.transformVarbit = Buffer.method12008(var1, (byte)5) * 1734830879;
            if (235099199 == this.transformVarbit * -277752131) {
               this.transformVarbit = 1310174059;
            }

            this.transformVarp = Buffer.method12008(var1, (byte)5) * 160996041;
            if (65535 == this.transformVarp * -44218077) {
               this.transformVarp = -160996041;
            }

            int var3 = -1;
            if (-1081397160 == var2) {
               var3 = Buffer.method12008(var1, (byte)5);
               if (var3 == -1764853481) {
                  var3 = -1;
               }
            }

            int var4 = var1.readUnsignedByte(-816224880);
            this.transforms = new int[2 + var4];

            for (int var5 = 0; var5 <= var4; var5++) {
               this.transforms[var5] = Buffer.method12008(var1, (byte)5);
               if (-357032669 == this.transforms[var5]) {
                  this.transforms[var5] = -1;
               }
            }

            this.transforms[1 + var4] = var3;
            break;
         case 107:
            this.isInteractable = false;
            break;
         case 109:
            this.isClipped = false;
            break;
         case 111:
            this.field2352 = class201.field2282;
            break;
         case 114:
            this.field2348 = Buffer.method12008(var1, (byte)5) * 1856934135;
            break;
         case 115:
            this.field2348 = Buffer.method12008(var1, (byte)5) * 888262154;
            this.field2325 = Buffer.method12008(var1, (byte)5) * -1442798063;
            this.field2326 = Buffer.method12008(var1, (byte)5) * -1216328456;
            this.field2340 = Buffer.method12008(var1, (byte)5) * -149210883;
            break;
         case 116:
            this.field2328 = Buffer.method12008(var1, (byte)5) * -1486356493;
            break;
         case 117:
            this.field2328 = Buffer.method12008(var1, (byte)5) * -1486356493;
            this.field2339 = Buffer.method12008(var1, (byte)5) * -1573939233;
            this.field2330 = Buffer.method12008(var1, (byte)5) * 1992715801;
            this.field2344 = Buffer.method12008(var1, (byte)5) * -1810698417;
            break;
         case 122:
            this.isFollower = true;
            break;
         case 123:
            this.lowPriorityFollowerOps = true;
            break;
         case 124:
            this.field2329 = Buffer.method12008(var1, (byte)5) * -1139565476;
            break;
         case 126:
            this.footprintSize = Buffer.method12008(var1, (byte)5) * -905576417;
            break;
         case 145:
            this.field2353 = true;
            break;
         case 146:
            this.field2351 = Buffer.method12008(var1, (byte)5) * -1261559427;
            break;
         case 249:
            this.params = class406.readStringIntParameters(var1, this.params, (byte)-33);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lvz;")
   @ObfuscatedName("al")
   public Node method4729(int var1) {
      return this.getParams() == null ? null : (Node)this.getParams().get(var1);
   }

   @ObfuscatedSignature(descriptor = "()Lhu;")
   @ObfuscatedName("br")
   public final NPCComposition method4682() {
      int var1 = -1;
      if (-1 != this.transformVarbit * 1713790947) {
         var1 = WorldMapData_1.getVarbit(this.transformVarbit * -277752131, -500236092);
      } else if (-1 != 1223301275 * this.transformVarp) {
         var1 = Varps.Varps_main[-533961161 * this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? AsyncHttpResponse.getNpcDefinition(var2, (byte)74) : null;
   }

   @ObfuscatedSignature(descriptor = "(Liw;ILiw;ILha;)Lky;")
   @ObfuscatedName("bp")
   public final Model method4671(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
      if (this.transforms != null) {
         NPCComposition var10 = method4683(this, (byte)0);
         return null == var10 ? null : var10.getModel(var1, var2, var3, var4, var5, (short)-13020);
      } else {
         long var6 = this.id * 1435750363;
         if (var5 != null) {
            var6 |= 7709241557646364001L * var5.field2145 << 16;
         }

         Model var8 = (Model)class402.method8806(NpcDefinition_cachedModels, var6);
         if (var8 == null) {
            ModelData var9 = this.getModelData(this.models, var5, -868104533);
            if (null == var9) {
               return null;
            }

            var8 = ModelData.method6106(var9, 1710335081 * this.ambient + 64, this.contrast * -1087942141 + 850, -30, -50, -30);
            NpcDefinition_cachedModels.put(var8, var6);
         }

         Model var11;
         if (null != var1 && null != var3) {
            var11 = var1.applyTransformations(var8, var2, var3, var4, 669069499);
         } else if (var1 != null) {
            var11 = var1.transformActorModel(var8, var2, (byte)41);
         } else if (null != var3) {
            var11 = var3.transformActorModel(var8, var4, (byte)75);
         } else {
            var11 = var8.toSharedSequenceModel(true);
         }

         if (128 != this.widthScale * 1459684331 || 128 != this.heightScale * 957368917) {
            Model.method6851(var11, 1459684331 * this.widthScale, 957368917 * this.heightScale, 1459684331 * this.widthScale);
         }

         return var11;
      }
   }

   public String getStringValue(int var1) {
      Node var2 = this.method4729(var1);
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

   @ObfuscatedSignature(descriptor = "(Lhu;Lha;I)Ljm;")
   @ObfuscatedName("mz")
   public static ModelData method4677(NPCComposition var0, NpcOverrides var1, int var2) {
      if (var0 == null) {
         var0.method4679(var1, var2);
      }

      try {
         if (null != var0.transforms) {
            if (var2 <= -1325754350) {
               throw new IllegalStateException();
            } else {
               NPCComposition var3 = method4683(var0, (byte)0);
               if (null == var3) {
                  if (var2 <= -1325754350) {
                     throw new IllegalStateException();
                  } else {
                     return null;
                  }
               } else {
                  return method4677(var3, var1, 2118702315);
               }
            }
         } else {
            return var0.getModelData(var0.chatHeadModels, var1, -1894248112);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hu.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhu;B)Lhu;")
   @ObfuscatedName("hr")
   public static NPCComposition method4683(NPCComposition var0, byte var1) {
      if (var0 == null) {
         var0.transform(var1);
      }

      try {
         int var2 = -1;
         if (-1 != var0.transformVarbit * -277752131) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            var2 = WorldMapData_1.getVarbit(var0.transformVarbit * -277752131, -1278776083);
         } else if (-1 != 1524408185 * var0.transformVarp) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            var2 = Varps.Varps_main[1524408185 * var0.transformVarp];
         }

         int var3;
         label49: {
            if (var2 >= 0) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               if (var2 < var0.transforms.length - 1) {
                  var3 = var0.transforms[var2];
                  break label49;
               }

               if (var1 != 0) {
                  throw new IllegalStateException();
               }
            }

            var3 = var0.transforms[var0.transforms.length - 1];
         }

         if (var3 != -1) {
            if (var1 != 0) {
               throw new IllegalStateException();
            } else {
               return AsyncHttpResponse.getNpcDefinition(var3, (byte)43);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hu.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cz")
   public int method4719() {
      return this.footprintSize * 742317065;
   }

   @ObfuscatedSignature(descriptor = "(Liw;ILiw;ILha;)Lky;")
   @ObfuscatedName("bu")
   public final Model method4672(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
      if (this.transforms != null) {
         NPCComposition var10 = method4683(this, (byte)0);
         return null == var10 ? null : var10.getModel(var1, var2, var3, var4, var5, (short)-16329);
      } else {
         long var6 = this.id * 1435750363;
         if (var5 != null) {
            var6 |= 7709241557646364001L * var5.field2145 << 16;
         }

         Model var8 = (Model)class402.method8806(NpcDefinition_cachedModels, var6);
         if (var8 == null) {
            ModelData var9 = this.getModelData(this.models, var5, -1559429257);
            if (null == var9) {
               return null;
            }

            var8 = ModelData.method6106(var9, 1710335081 * this.ambient + 64, this.contrast * -1087942141 + 850, -30, -50, -30);
            NpcDefinition_cachedModels.put(var8, var6);
         }

         Model var11;
         if (null != var1 && null != var3) {
            var11 = var1.applyTransformations(var8, var2, var3, var4, 1664070495);
         } else if (var1 != null) {
            var11 = var1.transformActorModel(var8, var2, (byte)27);
         } else if (null != var3) {
            var11 = var3.transformActorModel(var8, var4, (byte)116);
         } else {
            var11 = var8.toSharedSequenceModel(true);
         }

         if (128 != this.widthScale * 1459684331 || 128 != this.heightScale * 957368917) {
            Model.method6851(var11, 1459684331 * this.widthScale, 957368917 * this.heightScale, 1459684331 * this.widthScale);
         }

         return var11;
      }
   }

   @ObfuscatedSignature(descriptor = "(Liw;ILiw;ILha;)Lky;")
   @ObfuscatedName("ba")
   public final Model method4673(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
      if (this.transforms != null) {
         NPCComposition var10 = method4683(this, (byte)0);
         return null == var10 ? null : var10.getModel(var1, var2, var3, var4, var5, (short)289);
      } else {
         long var6 = this.id * 1435750363;
         if (var5 != null) {
            var6 |= 7709241557646364001L * var5.field2145 << 16;
         }

         Model var8 = (Model)class402.method8806(NpcDefinition_cachedModels, var6);
         if (var8 == null) {
            ModelData var9 = this.getModelData(this.models, var5, -1639939648);
            if (null == var9) {
               return null;
            }

            var8 = ModelData.method6106(var9, 1710335081 * this.ambient + 64, this.contrast * -1087942141 + 850, -30, -50, -30);
            NpcDefinition_cachedModels.put(var8, var6);
         }

         Model var11;
         if (null != var1 && null != var3) {
            var11 = var1.applyTransformations(var8, var2, var3, var4, 530249687);
         } else if (var1 != null) {
            var11 = var1.transformActorModel(var8, var2, (byte)100);
         } else if (null != var3) {
            var11 = var3.transformActorModel(var8, var4, (byte)55);
         } else {
            var11 = var8.toSharedSequenceModel(true);
         }

         if (128 != this.widthScale * 1459684331 || 128 != this.heightScale * 957368917) {
            Model.method6851(var11, 1459684331 * this.widthScale, 957368917 * this.heightScale, 1459684331 * this.widthScale);
         }

         return var11;
      }
   }

   public void setValue(int var1, int var2) {
      this.method4728(var1, new IntegerNode(var2));
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("bm")
   void method4670(Buffer var1, int var2) {
      switch (var2) {
         case 1:
            int var11 = var1.readUnsignedByte(-707877598);
            this.models = new int[var11];

            for (int var16 = 0; var16 < var11; var16++) {
               this.models[var16] = Buffer.method12008(var1, (byte)5);
            }
            break;
         case 2:
            this.name = var1.readStringCp1252NullCircumfixed(2034057303);
            break;
         case 12:
            this.size = var1.readUnsignedByte(-1677926948) * 110741447;
            break;
         case 13:
            this.idleSequence = Buffer.method12008(var1, (byte)5) * 258041133;
            break;
         case 14:
            this.walkSequence = Buffer.method12008(var1, (byte)5) * 2031991097;
            break;
         case 15:
            this.turnLeftSequence = Buffer.method12008(var1, (byte)5) * 1964285235;
            break;
         case 16:
            this.turnRightSequence = Buffer.method12008(var1, (byte)5) * -1165091883;
            break;
         case 17:
            this.walkSequence = Buffer.method12008(var1, (byte)5) * 2031991097;
            this.walkBackSequence = Buffer.method12008(var1, (byte)5) * 1279367173;
            this.walkLeftSequence = Buffer.method12008(var1, (byte)5) * -1677794215;
            this.walkRightSequence = Buffer.method12008(var1, (byte)5) * 1666825923;
            break;
         case 18:
            Buffer.method12008(var1, (byte)5);
            break;
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
            this.actions[var2 - 30] = var1.readStringCp1252NullCircumfixed(-1496693626);
            if (this.actions[var2 - 30].equalsIgnoreCase(Strings.field4856)) {
               this.actions[var2 - 30] = null;
            }
            break;
         case 40:
            int var10 = var1.readUnsignedByte(-1121276747);
            this.retextureFrom = new short[var10];
            this.recolorTo = new short[var10];

            for (int var15 = 0; var15 < var10; var15++) {
               this.retextureFrom[var15] = (short)Buffer.method12008(var1, (byte)5);
               this.recolorTo[var15] = (short)Buffer.method12008(var1, (byte)5);
            }
            break;
         case 41:
            int var9 = var1.readUnsignedByte(280923603);
            this.headIconSpriteIndex = new short[var9];
            this.retextureTo = new short[var9];

            for (int var14 = 0; var14 < var9; var14++) {
               this.headIconSpriteIndex[var14] = (short)Buffer.method12008(var1, (byte)5);
               this.retextureTo[var14] = (short)Buffer.method12008(var1, (byte)5);
            }
            break;
         case 60:
            int var8 = var1.readUnsignedByte(-222440483);
            this.chatHeadModels = new int[var8];

            for (int var13 = 0; var13 < var8; var13++) {
               this.chatHeadModels[var13] = Buffer.method12008(var1, (byte)5);
            }
            break;
         case 74:
            this.stats[0] = Buffer.method12008(var1, (byte)5);
            break;
         case 75:
            this.stats[1] = Buffer.method12008(var1, (byte)5);
            break;
         case 76:
            this.stats[2] = Buffer.method12008(var1, (byte)5);
            break;
         case 77:
            this.stats[3] = Buffer.method12008(var1, (byte)5);
            break;
         case 78:
            this.stats[4] = Buffer.method12008(var1, (byte)5);
            break;
         case 79:
            this.stats[5] = Buffer.method12008(var1, (byte)5);
            break;
         case 93:
            this.drawMapDot = false;
            break;
         case 95:
            this.combatLevel = Buffer.method12008(var1, (byte)5) * 245421895;
            break;
         case 97:
            this.widthScale = Buffer.method12008(var1, (byte)5) * 375459011;
            break;
         case 98:
            this.heightScale = Buffer.method12008(var1, (byte)5) * -89496835;
            break;
         case 99:
            this.field2352 = class201.field2280;
            break;
         case 100:
            this.ambient = Buffer.method12001(var1, (byte)54) * 2036214745;
            break;
         case 101:
            this.contrast = Buffer.method12001(var1, (byte)126) * 1314851671;
            break;
         case 102:
            int var7 = var1.readUnsignedByte(270815543);
            int var12 = 0;

            for (int var17 = var7; var17 != 0; var17 >>= 1) {
               var12++;
            }

            this.headIconArchiveIds = new int[var12];
            this.recolorFrom = new short[var12];

            for (int var6 = 0; var6 < var12; var6++) {
               if ((var7 & 1 << var6) == 0) {
                  this.headIconArchiveIds[var6] = -1;
                  this.recolorFrom[var6] = -1;
               } else {
                  this.headIconArchiveIds[var6] = var1.readNullableLargeSmart(-1405847301);
                  this.recolorFrom[var6] = (short)var1.readShortSmartSub(201696660);
               }
            }
            break;
         case 103:
            this.rotation = Buffer.method12008(var1, (byte)5) * -749482155;
            break;
         case 106:
         case 118:
            this.transformVarbit = Buffer.method12008(var1, (byte)5) * -1310174059;
            if (65535 == this.transformVarbit * -277752131) {
               this.transformVarbit = 1310174059;
            }

            this.transformVarp = Buffer.method12008(var1, (byte)5) * 160996041;
            if (65535 == this.transformVarp * 1524408185) {
               this.transformVarp = -160996041;
            }

            int var3 = -1;
            if (118 == var2) {
               var3 = Buffer.method12008(var1, (byte)5);
               if (var3 == 65535) {
                  var3 = -1;
               }
            }

            int var4 = var1.readUnsignedByte(435451175);
            this.transforms = new int[2 + var4];

            for (int var5 = 0; var5 <= var4; var5++) {
               this.transforms[var5] = Buffer.method12008(var1, (byte)5);
               if (65535 == this.transforms[var5]) {
                  this.transforms[var5] = -1;
               }
            }

            this.transforms[1 + var4] = var3;
            break;
         case 107:
            this.isInteractable = false;
            break;
         case 109:
            this.isClipped = false;
            break;
         case 111:
            this.field2352 = class201.field2282;
            break;
         case 114:
            this.field2348 = Buffer.method12008(var1, (byte)5) * 1856934135;
            break;
         case 115:
            this.field2348 = Buffer.method12008(var1, (byte)5) * 1856934135;
            this.field2325 = Buffer.method12008(var1, (byte)5) * -1442798063;
            this.field2326 = Buffer.method12008(var1, (byte)5) * 2095412907;
            this.field2340 = Buffer.method12008(var1, (byte)5) * -149210883;
            break;
         case 116:
            this.field2328 = Buffer.method12008(var1, (byte)5) * -1486356493;
            break;
         case 117:
            this.field2328 = Buffer.method12008(var1, (byte)5) * -1486356493;
            this.field2339 = Buffer.method12008(var1, (byte)5) * -1573939233;
            this.field2330 = Buffer.method12008(var1, (byte)5) * 1992715801;
            this.field2344 = Buffer.method12008(var1, (byte)5) * -1155876637;
            break;
         case 122:
            this.isFollower = true;
            break;
         case 123:
            this.lowPriorityFollowerOps = true;
            break;
         case 124:
            this.field2329 = Buffer.method12008(var1, (byte)5) * -911902981;
            break;
         case 126:
            this.footprintSize = Buffer.method12008(var1, (byte)5) * -500467219;
            break;
         case 145:
            this.field2353 = true;
            break;
         case 146:
            this.field2351 = Buffer.method12008(var1, (byte)5) * -1261559427;
            break;
         case 249:
            this.params = class406.readStringIntParameters(var1, this.params, (byte)-28);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lha;)Ljm;")
   @ObfuscatedName("bw")
   public final ModelData method4678(NpcOverrides var1) {
      if (null != this.transforms) {
         NPCComposition var2 = method4683(this, (byte)0);
         return null == var2 ? null : method4677(var2, var1, -675815469);
      } else {
         return this.getModelData(this.chatHeadModels, var1, -1877974274);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bq")
   public boolean method4688() {
      if (this.transforms == null) {
         return true;
      } else {
         int var1 = -1;
         if (this.transformVarbit * -277752131 != -1) {
            var1 = WorldMapData_1.getVarbit(this.transformVarbit * -277752131, 459765342);
         } else if (-1 != 1524408185 * this.transformVarp) {
            var1 = Varps.Varps_main[this.transformVarp * 1524408185];
         }

         return var1 >= 0 && var1 < this.transforms.length ? this.transforms[var1] != -1 : this.transforms[this.transforms.length - 1] != -1;
      }
   }

   @ObfuscatedSignature(descriptor = "([ILha;)Ljm;")
   @ObfuscatedName("bf")
   ModelData method4681(int[] var1, NpcOverrides var2) {
      int[] var3 = var1;
      if (var2 != null && var2.modelIds != null) {
         var3 = var2.modelIds;
      }

      if (var3 == null) {
         return null;
      } else {
         boolean var4 = false;

         for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !class348.field4292.tryLoadFile(var3[var5], 0, 756705879)) {
               var4 = true;
            }
         }

         if (var4) {
            return null;
         } else {
            ModelData[] var9 = new ModelData[var3.length];

            for (int var6 = 0; var6 < var3.length; var6++) {
               var9[var6] = ModelData.ModelData_get(class348.field4292, var3[var6], 0);
            }

            ModelData var10;
            if (1 == var9.length) {
               var10 = var9[0];
               if (null == var10) {
                  var10 = new ModelData(var9, var9.length);
               }
            } else {
               var10 = new ModelData(var9, var9.length);
            }

            if (null != this.retextureFrom) {
               short[] var7 = this.recolorTo;
               if (var2 != null && var2.recolorTo != null) {
                  var7 = var2.recolorTo;
               }

               for (int var8 = 0; var8 < this.retextureFrom.length; var8++) {
                  var10.recolor(this.retextureFrom[var8], var7[var8]);
               }
            }

            if (null != this.headIconSpriteIndex) {
               short[] var11 = this.retextureTo;
               if (var2 != null && null != var2.retextureTo) {
                  var11 = var2.retextureTo;
               }

               for (int var12 = 0; var12 < this.headIconSpriteIndex.length; var12++) {
                  ModelData.method6071(var10, this.headIconSpriteIndex[var12], var11[var12]);
               }
            }

            return var10;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lhu;")
   @ObfuscatedName("bn")
   public final NPCComposition method4684() {
      int var1 = -1;
      if (-1 != this.transformVarbit * -277752131) {
         var1 = WorldMapData_1.getVarbit(this.transformVarbit * -277752131, 894194350);
      } else if (-1 != 1524408185 * this.transformVarp) {
         var1 = Varps.Varps_main[1524408185 * this.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < this.transforms.length - 1) {
         var2 = this.transforms[var1];
      } else {
         var2 = this.transforms[this.transforms.length - 1];
      }

      return var2 != -1 ? AsyncHttpResponse.getNpcDefinition(var2, (byte)53) : null;
   }

   @ObfuscatedSignature(descriptor = "()[S")
   @ObfuscatedName("co")
   public short[] method4713() {
      return this.recolorFrom;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   public static void method4661() {
      NpcDefinition_cached.clear();
      NpcDefinition_cachedModels.clear();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bx")
   public boolean method4689() {
      if (this.transforms == null) {
         return true;
      } else {
         int var1 = -1;
         if (this.transformVarbit * -277752131 != -1) {
            var1 = WorldMapData_1.getVarbit(this.transformVarbit * -277752131, -1411536874);
         } else if (-1 != 1524408185 * this.transformVarp) {
            var1 = Varps.Varps_main[this.transformVarp * 1524408185];
         }

         return var1 >= 0 && var1 < this.transforms.length ? this.transforms[var1] != -1 : this.transforms[this.transforms.length - 1] != -1;
      }
   }

   public int getCombatLevel() {
      return this.combatLevel * 1601675895;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bv")
   public int method4695(int var1, int var2) {
      return class108.method3858(this.params, var1, var2, -2070168009);
   }

   @ObfuscatedSignature(descriptor = "(Lhu;I)Z")
   @ObfuscatedName("fv")
   public static boolean method4703(NPCComposition var0, int var1) {
      if (var0 == null) {
         var0.transformIsVisible(var1);
      }

      try {
         boolean var10000;
         if (null != var0.headIconArchiveIds && null != var0.recolorFrom) {
            if (var1 != -1627042038) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hu.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ch")
   public int method4696(int var1, int var2) {
      return class108.method3858(this.params, var1, var2, -95149720);
   }

   @ObfuscatedSignature(descriptor = "(Liw;ILiw;ILha;S)Lky;")
   @ObfuscatedName("aj")
   public final Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5, short var6) {
      try {
         if (this.transforms != null) {
            if (var6 == 128) {
               throw new IllegalStateException();
            } else {
               NPCComposition var12 = method4683(this, (byte)0);
               if (null == var12) {
                  if (var6 == 128) {
                     throw new IllegalStateException();
                  } else {
                     return null;
                  }
               } else {
                  return var12.getModel(var1, var2, var3, var4, var5, (short)14539);
               }
            }
         } else {
            long var7 = this.id * 1435750363;
            if (var5 != null) {
               if (var6 == 128) {
                  throw new IllegalStateException();
               }

               var7 |= 7709241557646364001L * var5.field2145 << 16;
            }

            Model var9 = (Model)class402.method8806(NpcDefinition_cachedModels, var7);
            if (var9 == null) {
               if (var6 == 128) {
                  throw new IllegalStateException();
               }

               ModelData var10 = this.getModelData(this.models, var5, -951352166);
               if (null == var10) {
                  if (var6 == 128) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               var9 = ModelData.method6106(var10, 1710335081 * this.ambient + 64, this.contrast * -1087942141 + 850, -30, -50, -30);
               NpcDefinition_cachedModels.put(var9, var7);
            }

            Model var13;
            label92: {
               if (null != var1) {
                  if (var6 == 128) {
                     throw new IllegalStateException();
                  }

                  if (null != var3) {
                     var13 = var1.applyTransformations(var9, var2, var3, var4, 702243974);
                     break label92;
                  }
               }

               if (var1 != null) {
                  if (var6 == 128) {
                     throw new IllegalStateException();
                  }

                  var13 = var1.transformActorModel(var9, var2, (byte)65);
               } else if (null != var3) {
                  if (var6 == 128) {
                     throw new IllegalStateException();
                  }

                  var13 = var3.transformActorModel(var9, var4, (byte)6);
               } else {
                  var13 = var9.toSharedSequenceModel(true);
               }
            }

            if (128 == this.widthScale * 1459684331) {
               if (var6 == 128) {
                  throw new IllegalStateException();
               }

               if (128 == this.heightScale * 957368917) {
                  return var13;
               }

               if (var6 == 128) {
                  throw new IllegalStateException();
               }
            }

            Model.method6851(var13, 1459684331 * this.widthScale, 957368917 * this.heightScale, 1459684331 * this.widthScale);
            return var13;
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "hu.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("cu")
   public String method4699(int var1, String var2) {
      return Projectile.method1418(this.params, var1, var2, -1342666036);
   }

   @ObfuscatedSignature(descriptor = "()[S")
   @ObfuscatedName("cx")
   public short[] method4714() {
      return this.recolorFrom;
   }

   @ObfuscatedSignature(descriptor = "(Lhu;I)Z")
   @ObfuscatedName("dm")
   public static boolean method4690(NPCComposition var0, int var1) {
      if (var0 == null) {
         return var0.method4693(var1);
      } else {
         try {
            if (var0.transforms == null) {
               return true;
            } else {
               int var2 = -1;
               if (var0.transformVarbit * -277752131 != -1) {
                  if (var1 <= 49966259) {
                     throw new IllegalStateException();
                  }

                  var2 = WorldMapData_1.getVarbit(var0.transformVarbit * -277752131, 1679025980);
               } else if (-1 != 1524408185 * var0.transformVarp) {
                  var2 = Varps.Varps_main[var0.transformVarp * 1524408185];
               }

               if (var2 >= 0) {
                  if (var1 <= 49966259) {
                     throw new IllegalStateException();
                  }

                  if (var2 < var0.transforms.length) {
                     return var0.transforms[var2] != -1;
                  }

                  if (var1 <= 49966259) {
                     throw new IllegalStateException();
                  }
               }

               boolean var10000;
               if (var0.transforms[var0.transforms.length - 1] != -1) {
                  if (var1 <= 49966259) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               return var10000;
            }
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "hu.ay(" + ')');
         }
      }
   }

   public int getId() {
      return this.id * 1435750363;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("cb")
   public int[] method4709() {
      return this.headIconArchiveIds;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("bz")
   void method4666(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(-978871409);
         if (0 == var2) {
            return;
         }

         this.decodeNext(var1, var2, (byte)79);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)S")
   @ObfuscatedName("cg")
   public short method4716(int var1) {
      return null != this.recolorFrom && var1 < this.recolorFrom.length ? this.recolorFrom[var1] : -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhu;Liw;ILiw;ILha;)Lky;")
   @ObfuscatedName("qa")
   public static Model method4675(NPCComposition var0, SequenceDefinition var1, int var2, SequenceDefinition var3, int var4, NpcOverrides var5) {
      if (var0.transforms != null) {
         NPCComposition var10 = method4683(var0, (byte)0);
         return null == var10 ? null : var10.getModel(var1, var2, var3, var4, var5, (short)8281);
      } else {
         long var6 = var0.id * 1862883256;
         if (var5 != null) {
            var6 |= 7709241557646364001L * var5.field2145 << 16;
         }

         Model var8 = (Model)class402.method8806(NpcDefinition_cachedModels, var6);
         if (var8 == null) {
            ModelData var9 = var0.getModelData(var0.models, var5, -1202248389);
            if (null == var9) {
               return null;
            }

            var8 = ModelData.method6106(var9, -2036102968 * var0.ambient + 64, var0.contrast * -1087942141 + -397935077, -559596786, -121081845, -30);
            NpcDefinition_cachedModels.put(var8, var6);
         }

         Model var11;
         if (null != var1 && null != var3) {
            var11 = var1.applyTransformations(var8, var2, var3, var4, 1418370568);
         } else if (var1 != null) {
            var11 = var1.transformActorModel(var8, var2, (byte)41);
         } else if (null != var3) {
            var11 = var3.transformActorModel(var8, var4, (byte)24);
         } else {
            var11 = var8.toSharedSequenceModel(true);
         }

         if (-949745314 != var0.widthScale * -2051270396 || 1429068043 != var0.heightScale * 1680056761) {
            Model.method6851(var11, 1459684331 * var0.widthScale, -2020976620 * var0.heightScale, 1459684331 * var0.widthScale);
         }

         return var11;
      }
   }

   public int[] getModels() {
      return this.models;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cs")
   public int method4711(int var1) {
      return this.headIconArchiveIds != null && var1 < this.headIconArchiveIds.length ? this.headIconArchiveIds[var1] : -1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ux")
   public boolean method4730() {
      return method4690(this, 195711422);
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ct")
   public String method4700(int var1, String var2) {
      return Projectile.method1418(this.params, var1, var2, -917671261);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhu;)Lhu;")
   @ObfuscatedName("of")
   public static NPCComposition method4685(NPCComposition var0) {
      if (var0 == null) {
         var0.method4708();
      }

      int var1 = -1;
      if (-1 != var0.transformVarbit * 862773367) {
         var1 = WorldMapData_1.getVarbit(var0.transformVarbit * -277752131, -1090811445);
      } else if (-1 != 1524408185 * var0.transformVarp) {
         var1 = Varps.Varps_main[1524408185 * var0.transformVarp];
      }

      int var2;
      if (var1 >= 0 && var1 < var0.transforms.length - 1) {
         var2 = var0.transforms[var1];
      } else {
         var2 = var0.transforms[var0.transforms.length - 1];
      }

      return var2 != -1 ? AsyncHttpResponse.getNpcDefinition(var2, (byte)54) : null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bh")
   public boolean method4691() {
      if (this.transforms == null) {
         return true;
      } else {
         int var1 = -1;
         if (this.transformVarbit * -153405190 != -1) {
            var1 = WorldMapData_1.getVarbit(this.transformVarbit * -277752131, 407587326);
         } else if (-1 != 1524408185 * this.transformVarp) {
            var1 = Varps.Varps_main[this.transformVarp * 1524408185];
         }

         return var1 >= 0 && var1 < this.transforms.length ? this.transforms[var1] != -1 : this.transforms[this.transforms.length - 1] != -1;
      }
   }

   NPCComposition() {
      this.field2348 = -1856934135;
      this.field2325 = 1442798063;
      this.field2326 = -2095412907;
      this.field2340 = 149210883;
      this.field2328 = 1486356493;
      this.field2339 = 1573939233;
      this.field2330 = -1992715801;
      this.field2344 = 1155876637;
      this.actions = new String[5];
      this.drawMapDot = true;
      this.combatLevel = -245421895;
      this.widthScale = 814113152;
      this.heightScale = 1429307008;
      this.ambient = 0;
      this.contrast = 0;
      this.rotation = 1786374816;
      this.transformVarbit = 1310174059;
      this.transformVarp = -160996041;
      this.isInteractable = true;
      this.isClipped = true;
      this.isFollower = false;
      this.lowPriorityFollowerOps = false;
      this.field2329 = 911902981;
      this.stats = new int[]{1, 1, 1, 1, 1, 1};
      this.headIconArchiveIds = null;
      this.recolorFrom = null;
      this.footprintSize = 500467219;
      this.field2353 = false;
      this.field2351 = 1377718980;
      this.field2352 = class201.field2281;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhu;")
   @ObfuscatedName("ao")
   public static NPCComposition method4657(int var0) {
      NPCComposition var1 = (NPCComposition)class402.method8806(NpcDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = Username.NpcDefinition_archive.getFile(9, var0, -1708196986);
         var1 = new NPCComposition();
         var1.id = 596350035 * var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2), 925604409);
         }

         var1.postDecode((byte)42);
         NpcDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)S")
   @ObfuscatedName("cp")
   public short method4717(int var1) {
      return null != this.recolorFrom && var1 < this.recolorFrom.length ? this.recolorFrom[var1] : -1;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ce")
   public String method4701(int var1, String var2) {
      return Projectile.method1418(this.params, var1, var2, 60696936);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ci")
   public int method4720() {
      return this.footprintSize * -1957486669;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cq")
   public int method4721() {
      return this.footprintSize * -1086412753;
   }

   @ObfuscatedSignature(descriptor = "()Lhu;")
   @ObfuscatedName("pm")
   public NPCComposition method4731() {
      return method4683(this, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cw")
   public boolean method4723() {
      return this.field2353;
   }

   public short[] getColorToReplaceWith() {
      return this.recolorTo;
   }

   public void setParams(IterableHashTable var1) {
      this.params = (IterableNodeHashTable)var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cr")
   public int method4725() {
      return this.field2351 * 254812117;
   }

   public String getName() {
      return this.name;
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIII)I")
   @ObfuscatedName("ka")
   static final int getTileHeight(WorldView var0, int var1, int var2, int var3, int var4) {
      try {
         int var5 = var1 >> 7;
         int var6 = var2 >> 7;
         if (var5 >= 0) {
            if (var4 != -253070517) {
               throw new IllegalStateException();
            }

            if (var6 >= 0) {
               if (var4 != -253070517) {
                  throw new IllegalStateException();
               }

               if (var5 < var0.tileSettings[0].length) {
                  if (var4 != -253070517) {
                     throw new IllegalStateException();
                  }

                  if (var6 < var0.tileSettings[0][0].length) {
                     int var7 = var3;
                     if (var3 < 3) {
                        if (var4 != -253070517) {
                           throw new IllegalStateException();
                        }

                        if ((var0.tileSettings[1][var5][var6] & 2) == 2) {
                           if (var4 != -253070517) {
                              throw new IllegalStateException();
                           }

                           var7 = var3 + 1;
                        }
                     }

                     int var8 = var1 & 127;
                     int var9 = var2 & 127;
                     int var10 = var0.tileHeights[var7][var5 + 1][var6] * var8 + var0.tileHeights[var7][var5][var6] * (128 - var8) >> 7;
                     int var11 = var0.tileHeights[var7][1 + var5][1 + var6] * var8 + (128 - var8) * var0.tileHeights[var7][var5][var6 + 1] >> 7;
                     return (128 - var9) * var10 + var11 * var9 >> 7;
                  }
               }
            }
         }

         return 0;
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "hu.ka(" + 41);
      }
   }

   public int getWidthScale() {
      return this.widthScale * 1459684331;
   }

   @ObfuscatedSignature(descriptor = "(Lha;I)Ljm;")
   @ObfuscatedName("ak")
   public final ModelData method4679(NpcOverrides var1, int var2) {
      try {
         if (null != this.transforms) {
            if (var2 <= -1325754350) {
               throw new IllegalStateException();
            } else {
               NPCComposition var3 = method4683(this, (byte)0);
               if (null == var3) {
                  if (var2 <= -1325754350) {
                     throw new IllegalStateException();
                  } else {
                     return null;
                  }
               } else {
                  return method4677(var3, var1, 2118702315);
               }
            }
         } else {
            return this.getModelData(this.models, var1, -1894248112);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hu.ak(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhu;)Z")
   @ObfuscatedName("ww")
   public static boolean method4692(NPCComposition var0) {
      if (var0.transforms == null) {
         return true;
      } else {
         int var1 = -1;
         if (var0.transformVarbit * 1191886888 != -1) {
            var1 = WorldMapData_1.getVarbit(var0.transformVarbit * -277752131, -262167966);
         } else if (-1 != 1612491892 * var0.transformVarp) {
            var1 = Varps.Varps_main[var0.transformVarp * 1524408185];
         }

         return var1 >= 0 && var1 < var0.transforms.length ? var0.transforms[var1] != -1 : var0.transforms[var0.transforms.length - 1] != -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("au")
   public int getIntParam(int var1, int var2, int var3) {
      try {
         return class108.method3858(this.params, var1, var2, -43392855);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hu.au(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
   @ObfuscatedName("az")
   public String getStringParam(int var1, String var2, byte var3) {
      try {
         return Projectile.method1418(this.params, var1, var2, -1790282734);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hu.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ay")
   public boolean transformIsVisible(int var1) {
      try {
         boolean var10000;
         if (null != this.headIconArchiveIds && null != this.retextureFrom) {
            if (var1 != -1627042038) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hu.ad(" + ')');
      }
   }

   public boolean isMinimapVisible() {
      return this.drawMapDot;
   }

   public boolean isFollower() {
      return this.isFollower;
   }

   public String[] getActions() {
      return this.actions;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ah")
   public int method4726(int var1) {
      try {
         return this.heightScale * 254812117;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hu.ah(" + 41);
      }
   }

   public int getFootprintSize() {
      return this.footprintSize * 964807653;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhu;)Z")
   @ObfuscatedName("rt")
   public static boolean method4705(NPCComposition var0) {
      if (var0 == null) {
         var0.method4706();
      }

      return null != var0.headIconArchiveIds && null != var0.recolorFrom;
   }

   public int getIntValue(int var1) {
      Node var2 = this.method4729(var1);
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

   public IterableHashTable getParams() {
      return this.params;
   }

   @ObfuscatedSignature(descriptor = "(B)Lhu;")
   @ObfuscatedName("ap")
   public final NPCComposition transform(byte var1) {
      try {
         int var2 = -1;
         if (-1 != this.footprintSize * -277752131) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            var2 = WorldMapData_1.getVarbit(this.heightScale * -277752131, -1278776083);
         } else if (-1 != 1524408185 * this.footprintSize) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            var2 = Varps.Varps_main[1524408185 * this.widthScale];
         }

         int var3;
         label47: {
            if (var2 >= 0) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               if (var2 < this.transforms.length - 1) {
                  var3 = this.transforms[var2];
                  break label47;
               }

               if (var1 != 0) {
                  throw new IllegalStateException();
               }
            }

            var3 = this.transforms[this.transforms.length - 1];
         }

         if (var3 != -1) {
            if (var1 != 0) {
               throw new IllegalStateException();
            } else {
               return AsyncHttpResponse.getNpcDefinition(var3, (byte)43);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hu.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ar")
   public boolean method4693(int var1) {
      try {
         if (this.transforms == null) {
            return true;
         } else {
            int var2 = -1;
            if (this.ambient * -277752131 != -1) {
               if (var1 <= 49966259) {
                  throw new IllegalStateException();
               }

               var2 = WorldMapData_1.getVarbit(this.footprintSize * -277752131, 1679025980);
            } else if (-1 != 1524408185 * this.heightScale) {
               var2 = Varps.Varps_temp[this.heightScale * 1524408185];
            }

            if (var2 >= 0) {
               if (var1 <= 49966259) {
                  throw new IllegalStateException();
               }

               if (var2 < this.transforms.length) {
                  return this.transforms[var2] != -1;
               }

               if (var1 <= 49966259) {
                  throw new IllegalStateException();
               }
            }

            boolean var10000;
            if (this.transforms[this.transforms.length - 1] != -1) {
               if (var1 <= 49966259) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "hu.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cm")
   public boolean method4706() {
      return null != this.stats && null != this.retextureFrom;
   }
}
