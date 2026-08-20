import java.awt.Shape;
import net.runelite.api.HeadIcon;
import net.runelite.api.Perspective;
import net.runelite.api.events.PlayerChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ci")
public final class Player extends Actor implements net.runelite.api.Player {
   @ObfuscatedName("ac")
   int field579;
   @ObfuscatedSignature(descriptor = "Lxv;")
   @ObfuscatedName("ag")
   Username username;
   @ObfuscatedSignature(descriptor = "Loa;")
   @ObfuscatedName("ae")
   PlayerComposition appearance;
   @ObfuscatedName("aj")
   int headIconPk = -1178561503;
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   static final int field587 = 1076101600;
   @ObfuscatedName("aw")
   String[] actions;
   @ObfuscatedName("ap")
   int combatLevel;
   @ObfuscatedSignature(descriptor = "Ltq;")
   @ObfuscatedName("bo")
   TriBool isInClanChat;
   @ObfuscatedName("ay")
   int skillLevel;
   @ObfuscatedName("az")
   int animationCycleStart;
   @ObfuscatedName("ad")
   int animationCycleEnd;
   @ObfuscatedName("ai")
   int field581;
   @ObfuscatedName("ak")
   int headIconPrayer = 1885238757;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final float field577 = 0.4F;
   @ObfuscatedSignature(descriptor = "Lky;")
   @ObfuscatedName("ab")
   Model model0;
   @ObfuscatedName("ax")
   int minX;
   @ObfuscatedName("ar")
   int minY;
   @ObfuscatedName("ah")
   int maxX;
   @ObfuscatedName("al")
   int maxY;
   @ObfuscatedName("af")
   boolean isUnanimated;
   @ObfuscatedName("au")
   int tileHeight;
   @ObfuscatedName("ao")
   boolean isHidden;
   @ObfuscatedName("aa")
   int plane;
   @ObfuscatedSignature(descriptor = "Ltq;")
   @ObfuscatedName("be")
   TriBool isInFriendsChat;
   @ObfuscatedSignature(descriptor = "Ltq;")
   @ObfuscatedName("aq")
   TriBool isFriendTriBool;
   @ObfuscatedName("am")
   int team;
   @ObfuscatedName("bg")
   int footprintSize;
   @ObfuscatedName("as")
   int tileHeight2;

   @ObfuscatedSignature(descriptor = "(Lci;B)V")
   @ObfuscatedName("mf")
   public static void method1440(Player var0, byte var1) {
      if (var0 == null) {
         var0.checkIsFriend(var1);
      }

      try {
         var0.isInFriendsChat = class320.friendSystem.isFriendAndHasWorld(var0.username, (short)-16579) ? TriBool.TriBool_true : TriBool.TriBool_false;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ci.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bp")
   boolean method1435() {
      if (this.isInFriendsChat == TriBool.TriBool_unknown) {
         method1440(this, (byte)-34);
      }

      return this.isInFriendsChat == TriBool.TriBool_true;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("zn")
   public int method1477() {
      return this.skillLevel * -1506260323;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   @Override
   public int getPlane(int var1) {
      try {
         return this.plane * -2060016843;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ci.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("at")
   final void read(Buffer var1, byte var2) {
      try {
         var1.offset = 0;
         byte var3 = Buffer.method12001(var1, (byte)29);
         byte var4 = -1;
         this.headIconPk = Buffer.method12001(var1, (byte)17) * 1178561503;
         this.headIconPrayer = Buffer.method12001(var1, (byte)72) * -1885238757;
         int var5 = -1;
         this.team = 0;
         int[] var6 = new int[12];

         for (int var7 = 0; var7 < var6.length; var7++) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            int var8 = var1.readUnsignedByte(1790625879);
            if (var8 == 0) {
               var6[var7] = 0;
            } else {
               int var9 = var1.readUnsignedByte(-1009348952);
               int var10 = var9 + (var8 << 8);
               if (var7 == 0) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if (65535 == var10) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     var5 = Buffer.method12008(var1, (byte)5);
                     break;
                  }
               }

               var6[var7] = var10;
               if (this.method1468(var6[var7], 1149382054)) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  int var11 = this.method1471(var6[var7], 963660187).team * -1635567717;
                  if (var11 != 0) {
                     if (var2 == 1) {
                        this.method1474();
                        return;
                     }

                     this.team = -586314223 * var11;
                  }
               }
            }
         }

         int[] var31 = new int[12];

         for (int var32 = 0; var32 < var31.length; var32++) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            int var34 = var1.readUnsignedByte(-317808786);
            if (var34 == 0) {
               if (var2 == 1) {
                  this.method1474();
                  return;
               }

               var31[var32] = 0;
            } else {
               int var37 = var1.readUnsignedByte(826928964);
               var31[var32] = var37 + (var34 << 8);
            }
         }

         int[] var33 = new int[5];

         for (int var35 = 0; var35 < var33.length; var35++) {
            if (var2 == 1) {
               this.method1474();
               return;
            }

            int var38;
            label414: {
               var38 = var1.readUnsignedByte(-277552046);
               if (var38 >= 0) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var38 < ItemContainer.field1065[var35].length) {
                     break label414;
                  }

                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }
               }

               var38 = 0;
            }

            var33[var35] = var38;
         }

         this.idleSequence = Buffer.method12008(var1, (byte)5) * -2146330229;
         if (this.idleSequence * 1683244579 == 65535) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            this.idleSequence = 2146330229;
         }

         this.turnLeftSequence = Buffer.method12008(var1, (byte)5) * 10470407;
         if (this.turnLeftSequence * -1787008585 == 65535) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            this.turnLeftSequence = -10470407;
         }

         this.turnRightSequence = -1126426293 * this.turnLeftSequence;
         this.walkSequence = Buffer.method12008(var1, (byte)5) * 308070339;
         if (65535 == -1691426581 * this.walkSequence) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            this.walkSequence = -308070339;
         }

         this.walkBackSequence = Buffer.method12008(var1, (byte)5) * 207093345;
         if (this.walkBackSequence * -1392171615 == 65535) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            this.walkBackSequence = -207093345;
         }

         this.walkLeftSequence = Buffer.method12008(var1, (byte)5) * 1071631209;
         if (65535 == this.walkLeftSequence * -1963363111) {
            this.walkLeftSequence = -1071631209;
         }

         this.walkRightSequence = Buffer.method12008(var1, (byte)5) * 1809054117;
         if (65535 == 577914413 * this.walkRightSequence) {
            if (var2 == 1) {
               this.method1474();
               return;
            }

            this.walkRightSequence = -1809054117;
         }

         this.runSequence = Buffer.method12008(var1, (byte)5) * -1512855059;
         if (-2045699099 * this.runSequence == 65535) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            this.runSequence = 1512855059;
         }

         this.username = new Username(var1.readStringCp1252NullCircumfixed(471700055), LoginScreenAnimation.loginType);
         this.clearIsFriend((short)-6000);
         this.updateIsInFriendsChat(-1212836011);
         this.updateIsInClanChat(-1309903654);
         if (this == class330.localPlayer) {
            if (var2 == 1) {
               this.method1474();
               return;
            }

            RunException.field6660 = Username.method12702(this.username, (byte)46);
         }

         this.combatLevel = var1.readUnsignedByte(965465142) * -796908435;
         this.skillLevel = Buffer.method12008(var1, (byte)5) * -915371083;
         boolean var10001;
         if (var1.readUnsignedByte(1871806228) == 1) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.isHidden = var10001;
         if (0 == client.gameBuild * -423864891 && client.staffModLevel * 427594063 >= 2) {
            this.isHidden = false;
         }

         PlayerCompositionColorTextureOverride[] var36 = null;
         boolean var39 = false;
         int var41 = Buffer.method12008(var1, (byte)5);
         boolean var10000;
         if ((var41 >> 15 & 1) == 1) {
            if (var2 == 1) {
               this.method1474();
               return;
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         var39 = var10000;
         if (var41 > 0 && var41 != 32768) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            var36 = new PlayerCompositionColorTextureOverride[12];

            for (int var12 = 0; var12 < var36.length; var12++) {
               if (var2 == 1) {
                  this.method1474();
                  return;
               }

               int var13 = var41 >> 12 - var12 & 1;
               if (var13 == 1) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  int var17 = var6[var12] - 2048;
                  int var18 = var1.readUnsignedByte(-199554139);
                  if (0 != (var18 & 1)) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var19 = var10000;
                  if ((var18 & 2) != 0) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var20 = var10000;
                  if (0 != (var18 & 4)) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var21 = var10000;
                  if (0 != (var18 & 8)) {
                     if (var2 == 1) {
                        this.method1474();
                        return;
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var22 = var10000;
                  PlayerCompositionColorTextureOverride var23 = new PlayerCompositionColorTextureOverride(var17);
                  if (var19) {
                     if (var2 == 1) {
                        this.method1474();
                        return;
                     }

                     int var24 = var1.readUnsignedByte(-955561967);
                     int[] var25 = new int[]{var24 & 15, var24 >> 4 & 15};
                     if (var23.playerCompositionRecolorTo != null && var25.length == var23.playerCompositionRecolorTo.length) {
                        if (var2 == 1) {
                           throw new IllegalStateException();
                        }

                        var10000 = true;
                     } else {
                        var10000 = false;
                     }

                     boolean var26 = var10000;

                     for (int var27 = 0; var27 < 2; var27++) {
                        if (15 != var25[var27]) {
                           if (var2 == 1) {
                              throw new IllegalStateException();
                           }

                           short var28 = (short)Buffer.method12008(var1, (byte)5);
                           if (var26) {
                              if (var2 == 1) {
                                 throw new IllegalStateException();
                              }

                              var23.playerCompositionRecolorTo[var25[var27]] = var28;
                           }
                        }
                     }
                  }

                  if (var20) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     int var43 = var1.readUnsignedByte(1876852376);
                     int[] var44 = new int[]{var43 & 15, var43 >> 4 & 15};
                     if (var23.playerCompositionRetextureTo != null && var44.length == var23.playerCompositionRetextureTo.length) {
                        if (var2 == 1) {
                           this.method1474();
                           return;
                        }

                        var10000 = true;
                     } else {
                        var10000 = false;
                     }

                     boolean var45 = var10000;

                     for (int var46 = 0; var46 < 2; var46++) {
                        if (var2 == 1) {
                           throw new IllegalStateException();
                        }

                        if (var44[var46] != 15) {
                           if (var2 == 1) {
                              throw new IllegalStateException();
                           }

                           short var47 = (short)Buffer.method12008(var1, (byte)5);
                           if (var45) {
                              if (var2 == 1) {
                                 this.method1474();
                                 return;
                              }

                              var23.playerCompositionRetextureTo[var44[var46]] = var47;
                           }
                        }
                     }
                  }

                  if (var21) {
                     var23.field2113 = Buffer.method12008(var1, (byte)5) * -756936397;
                     var23.field2116 = Buffer.method12008(var1, (byte)5) * 431006017;
                  }

                  if (var22) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     var23.field2112 = Buffer.method12008(var1, (byte)5) * -576146133;
                     var23.field2111 = Buffer.method12008(var1, (byte)5) * -958218623;
                  }

                  var36[var12] = var23;
               }
            }
         }

         for (int var42 = 0; var42 < 3; var42++) {
            this.actions[var42] = var1.readStringCp1252NullCircumfixed(-535985478);
         }

         var4 = Buffer.method12001(var1, (byte)13);
         if (null == this.appearance) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            this.appearance = new PlayerComposition();
         }

         this.appearance.method7877(var31, var6, var36, var39, var33, var3, var5, var4, -2025636455);
         if (var5 != -1) {
            if (var2 == 1) {
               this.method1474();
               return;
            }

            this.size = AsyncHttpResponse.getNpcDefinition(var5, (byte)126).size * -1901835949;
         } else {
            this.size = 1531937925;
         }

         this.footprintSize = -951168111 * (int)(0.4F * (-1779816832 * this.size));
         this.method1474();
      } catch (RuntimeException var29) {
         throw RestClientThreadFactory.newRunException(var29, "ci.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("jw")
   public Model method1476() {
      Player var1 = this;
      int var2 = 566725961;

      try {
         Model var10000;
         if (null == var1.appearance) {
            if (var2 == 340712311) {
               throw new IllegalStateException();
            }

            Object var14 = null;
            var10000 = (Model)var14;
         } else {
            AnimationSequence var3 = Actor.method2816(var1, 2085604559);
            AnimationSequence var17;
            if (var1.isUnanimated) {
               if (var2 == 340712311) {
                  throw new IllegalStateException();
               }

               var17 = null;
            } else {
               var17 = var1.method2822(var3, 349458886);
            }

            AnimationSequence var4 = var17;
            if (var3 == null) {
               if (var2 == 340712311) {
                  throw new IllegalStateException();
               }

               if (null == var4) {
                  var4 = var1.field1152;
                  if (AnimationSequence.method10341(var1.field1152, 30, -1002405506)) {
                     if (var2 == 340712311) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }
               }
            }

            SequenceDefinition var18;
            if (null == var3) {
               if (var2 == 340712311) {
                  throw new IllegalStateException();
               }

               var18 = null;
            } else {
               var18 = AnimationSequence.method10318(var3, -734405600);
            }

            SequenceDefinition var5 = var18;
            SequenceDefinition var19;
            if (var4 == null) {
               if (var2 == 340712311) {
                  throw new IllegalStateException();
               }

               var19 = null;
            } else {
               var19 = AnimationSequence.method10318(var4, 819036096);
            }

            SequenceDefinition var6 = var19;
            int var20;
            if (var3 == null) {
               if (var2 == 340712311) {
                  throw new IllegalStateException();
               }

               var20 = -1;
            } else {
               var20 = var3.getFrame(-609025707);
            }

            int var7 = var20;
            int var21;
            if (var4 == null) {
               if (var2 == 340712311) {
                  throw new IllegalStateException();
               }

               var21 = -1;
            } else {
               var21 = var4.getFrame(-609025707);
            }

            int var8 = var21;
            Model var9 = PlayerComposition.method7912(var1.appearance, var5, var7, var6, var8, (byte)45);
            if (null == var9) {
               if (var2 == 340712311) {
                  throw new IllegalStateException();
               }

               Object var15 = null;
               var10000 = (Model)var15;
            } else {
               var9.method6864();
               var1.defaultHeight = var9.height * 154623387;
               int var10 = var9.indicesCount;
               if (!var1.isUnanimated) {
                  if (var2 == 340712311) {
                     throw new IllegalStateException();
                  }

                  var9 = var1.method2839(var9, 1973682866);
               }

               if (!var1.isUnanimated) {
                  if (var2 == 340712311) {
                     throw new IllegalStateException();
                  }

                  if (var1.model0 != null) {
                     if (var2 == 340712311) {
                        throw new IllegalStateException();
                     }

                     if (client.cycle * 1759706017 >= 2063009467 * var1.animationCycleEnd) {
                        if (var2 == 340712311) {
                           throw new IllegalStateException();
                        }

                        var1.model0 = null;
                     }

                     if (client.cycle * 1759706017 >= var1.animationCycleStart * -920595127 && client.cycle * 1759706017 < var1.animationCycleEnd * 2063009467) {
                        if (var2 == 340712311) {
                           throw new IllegalStateException();
                        }

                        Model var11 = var1.model0;
                        Model.method6877(
                           var11,
                           var1.field581 * 1673305597 - var1.x * 340712311,
                           var1.tileHeight2 * -1055026275 - var1.tileHeight * 781403537,
                           var1.field579 * 1289722773 - -1747310679 * var1.y
                        );
                        if (var1.orientation * -1817477693 == 512) {
                           if (var2 == 340712311) {
                              throw new IllegalStateException();
                           }

                           var11.method6846();
                           var11.method6846();
                           var11.method6846();
                        } else if (1024 == -1817477693 * var1.orientation) {
                           if (var2 == 340712311) {
                              throw new IllegalStateException();
                           }

                           var11.method6846();
                           var11.method6846();
                        } else if (-1817477693 * var1.orientation == 1536) {
                           var11.method6846();
                        }

                        Model[] var12 = new Model[]{var9, var11};
                        var9 = new Model(var12, 2);
                        if (var1.orientation * -1817477693 == 512) {
                           var11.method6846();
                        } else if (-1817477693 * var1.orientation == 1024) {
                           var11.method6846();
                           var11.method6846();
                        } else if (-1817477693 * var1.orientation == 1536) {
                           if (var2 == 340712311) {
                              throw new IllegalStateException();
                           }

                           var11.method6846();
                           var11.method6846();
                           var11.method6846();
                        }

                        Model.method6877(
                           var11,
                           var1.x * 340712311 - var1.field581 * 1673305597,
                           781403537 * var1.tileHeight - var1.tileHeight2 * -1055026275,
                           -1747310679 * var1.y - var1.field579 * 1289722773
                        );
                     }
                  }
               }

               label179: {
                  var9.isSingleTile = true;
                  if (var1.field1136.method6538()) {
                     if (var2 == 340712311) {
                        throw new IllegalStateException();
                     }

                     if (1759706017 * client.cycle >= var1.npcCycle * -618742451 && client.cycle * 1759706017 < 413053887 * var1.field1125) {
                        if (var2 == 340712311) {
                           throw new IllegalStateException();
                        }

                        var9.method6832(var1.field1136, (short)var10);
                        break label179;
                     }
                  }

                  var9.method6835();
               }

               var10000 = var9;
            }
         }

         return var10000;
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "ci.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   boolean isFriend(int var1) {
      try {
         if (this.isInFriendsChat == TriBool.TriBool_unknown) {
            method1440(this, (byte)-52);
         }

         boolean var10000;
         if (this.isInFriendsChat == TriBool.TriBool_true) {
            if (var1 <= -891162010) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ci.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("ak")
   void clearIsFriend(short var1) {
      try {
         this.isInFriendsChat = TriBool.TriBool_unknown;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ci.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bu")
   void method1438() {
      this.isInFriendsChat = TriBool.TriBool_unknown;
   }

   public int getFootprintSize() {
      return this.footprintSize * 1348652401;
   }

   public void setSkullIcon(int var1) {
      this.headIconPk = var1 * 1178561503;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ax")
   void updateIsInFriendsChat(int var1) {
      try {
         this.isInClanChat = TriBool.TriBool_unknown;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ci.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ah")
   void method1450(int var1) {
      try {
         TriBool var10001;
         label21: {
            if (BuddyRankComparator.friendsChat != null) {
               if (var1 != -1418448276) {
                  throw new IllegalStateException();
               }

               if (BuddyRankComparator.friendsChat.contains(this.username, (byte)0)) {
                  var10001 = TriBool.TriBool_true;
                  break label21;
               }
            }

            var10001 = TriBool.TriBool_false;
         }

         this.isInClanChat = var10001;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ci.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lci;)V")
   @ObfuscatedName("kp")
   public static void method1453(Player var0) {
      if (var0 == null) {
         var0.getFootprintSize();
      }

      for (int var1 = 0; var1 < 4; var1++) {
         if (null != client.currentClanSettings[var1]
            && classDY.method3606(client.currentClanSettings[var1], Username.method12702(var0.username, (byte)-44), -1959414916) != -1
            && 2 != var1) {
            var0.isFriendTriBool = TriBool.TriBool_true;
            return;
         }
      }

      var0.isFriendTriBool = TriBool.TriBool_false;
   }

   @ObfuscatedSignature(descriptor = "(Lci;B)Z")
   @ObfuscatedName("qg")
   public static boolean method1460(Player var0, byte var1) {
      if (var0 == null) {
         return var0.isFriendsChatMember(var1);
      } else {
         try {
            if (TriBool.TriBool_unknown == var0.isFriendTriBool) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               var0.clearIsInFriendsChat(1221700513);
            }

            boolean var10000;
            if (TriBool.TriBool_true == var0.isFriendTriBool) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "ci.al(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   void clearIsInFriendsChat(int var1) {
      try {
         for (int var2 = 0; var2 < 4; var2++) {
            if (var1 != 1221700513) {
               throw new IllegalStateException();
            }

            if (null != client.currentClanSettings[var2]
               && classDY.method3606(client.currentClanSettings[var2], Username.method12702(this.username, (byte)-76), 2087027333) != -1
               && 2 != var2) {
               if (var1 != 1221700513) {
                  throw new IllegalStateException();
               }

               this.isFriendTriBool = TriBool.TriBool_true;
               return;
            }
         }

         this.isFriendTriBool = TriBool.TriBool_false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ci.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ar")
   void updateIsInClanChat(int var1) {
      try {
         this.isFriendTriBool = TriBool.TriBool_unknown;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ci.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lky;")
   @ObfuscatedName("ag")
   @Override
   protected final Model getModel(int var1) {
      if (client.field1023 != null
         && client.field1023
            .test(super.animationSequence.id * 1870316967 != -1 ? super.animationSequence.id * 1870316967 : super.poseAnimationSequence.id * 1870316967)) {
         int var2 = super.animationSequence.frame * 1756992279;
         int var3 = super.poseAnimationSequence.frame * 1756992279;

         Model var14;
         try {
            super.animationSequence.frame = (-2147483648 | Math.max(super.animationSequence.frameCycle * -1148754599 - 1, 0) << 16 | var2) * -449915737;
            super.poseAnimationSequence.frame = (-1073741824 | Math.max(super.poseAnimationSequence.frameCycle * -1148754599 - 1, 0) << 16 | var3) * -449915737;

            for (ActorSpotAnim var5 : this.method2848()) {
               int var6 = var5.getFrame();
               var5.setFrame(-2147483648 | Math.max(var5.getCycle() - 1, 0) << 16 | var6);
            }

            var14 = this.method1476();
         } finally {
            super.animationSequence.frame = var2 * -449915737;
            super.poseAnimationSequence.frame = var3 * -449915737;

            for (ActorSpotAnim var10 : this.method2848()) {
               int var11 = var10.getFrame();
               var10.setFrame(var11 & 65535);
            }
         }

         return var14;
      } else {
         return this.method1476();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("an")
   @Override
   protected boolean vmethod51(int var1) {
      try {
         if (this.appearance == null) {
            if (var1 != -1841545705) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            if (null != this.model0) {
               if (var1 != -1841545705) {
                  throw new IllegalStateException();
               }

               if (this.model0.faceAlphas != null) {
                  if (var1 != -1841545705) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            if (Actor.method2795(this, 1561781710)) {
               if (var1 != -1841545705) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else if (Actor.method2802(this, (short)2048)) {
               if (var1 != -1841545705) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               Model var2 = PlayerComposition.method7912(this.appearance, null, -1, null, -1, (byte)67);
               if (var2 == null || null == var2.faceAlphas) {
                  return false;
               } else if (var1 != -1841545705) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ci.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lis;")
   @ObfuscatedName("be")
   ItemComposition method1471(int var1, int var2) {
      try {
         return class150.ItemDefinition_get(var1 - 2048, -998636383);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ci.be(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("aq")
   boolean method1468(int var1, int var2) {
      try {
         boolean var10000;
         if (var1 >= 2048) {
            if (var2 <= 551453715) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ci.aq(" + ')');
      }
   }

   Player(int var1) {
      super(var1);
      this.actions = new String[3];
      this.combatLevel = 0;
      this.skillLevel = 0;
      this.animationCycleStart = 0;
      this.animationCycleEnd = 0;
      this.isUnanimated = false;
      this.team = 0;
      this.isHidden = false;
      this.isInFriendsChat = TriBool.TriBool_unknown;
      this.isInClanChat = TriBool.TriBool_unknown;
      this.isFriendTriBool = TriBool.TriBool_unknown;
      this.footprintSize = 0;

      for (int var2 = 0; var2 < 3; var2++) {
         this.actions[var2] = "";
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lci;)Z")
   @ObfuscatedName("wq")
   public static boolean method1445(Player var0) {
      if (TriBool.TriBool_unknown == var0.isInClanChat) {
         var0.method1450(-1418448276);
      }

      return TriBool.TriBool_true == var0.isInClanChat;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bg")
   @Override
   public int vmethod102() {
      return this.plane * -2060016843;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bd")
   void method1451() {
      this.isInClanChat = BuddyRankComparator.friendsChat != null && BuddyRankComparator.friendsChat.contains(this.username, (byte)0)
         ? TriBool.TriBool_true
         : TriBool.TriBool_false;
   }

   public int getId() {
      return super.index * -1903023775;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aa")
   @Override
   final boolean isVisible(int var1) {
      try {
         if (null == this.appearance) {
            if (var1 >= -414448437) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ci.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("ap")
   @Override
   protected final Model vmethod49() {
      if (null == this.appearance) {
         return null;
      } else {
         AnimationSequence var1 = Actor.method2816(this, 2125356910);
         AnimationSequence var2 = this.isUnanimated ? null : this.method2822(var1, 116997038);
         if (var1 == null && null == var2) {
            var2 = this.field1152;
            if (AnimationSequence.method10341(this.field1152, 30, -1002405506)) {
               return null;
            }
         }

         SequenceDefinition var3 = null == var1 ? null : AnimationSequence.method10318(var1, 1671845398);
         SequenceDefinition var4 = var2 == null ? null : AnimationSequence.method10318(var2, 2035464629);
         int var5 = var1 == null ? -1 : var1.getFrame(-609025707);
         int var6 = var2 == null ? -1 : var2.getFrame(-609025707);
         Model var7 = PlayerComposition.method7912(this.appearance, var3, var5, var4, var6, (byte)49);
         if (null == var7) {
            return null;
         } else {
            var7.method6864();
            this.defaultHeight = var7.height * 154623387;
            int var8 = var7.indicesCount;
            if (!this.isUnanimated) {
               var7 = this.method2839(var7, 1184081294);
            }

            if (!this.isUnanimated && this.model0 != null) {
               if (client.cycle * 1759706017 >= 2063009467 * this.animationCycleEnd) {
                  this.model0 = null;
               }

               if (client.cycle * 277839256 >= this.animationCycleStart * -514721846 && client.cycle * 1759706017 < this.animationCycleEnd * 1146455720) {
                  Model var9 = this.model0;
                  Model.method6877(
                     var9,
                     this.field581 * 1673305597 - this.x * 340712311,
                     this.tileHeight2 * -1363713234 - this.tileHeight * 781403537,
                     this.field579 * 995903233 - -1747310679 * this.y
                  );
                  if (this.orientation * -1817477693 == -1804595846) {
                     var9.method6846();
                     var9.method6846();
                     var9.method6846();
                  } else if (22498578 == 1880481436 * this.orientation) {
                     var9.method6846();
                     var9.method6846();
                  } else if (-1817477693 * this.orientation == 1536) {
                     var9.method6846();
                  }

                  Model[] var10 = new Model[]{var7, var9};
                  var7 = new Model(var10, 2);
                  if (this.orientation * -1817477693 == 512) {
                     var9.method6846();
                  } else if (-581362640 * this.orientation == 1420672210) {
                     var9.method6846();
                     var9.method6846();
                  } else if (617310583 * this.orientation == -212418891) {
                     var9.method6846();
                     var9.method6846();
                     var9.method6846();
                  }

                  Model.method6877(
                     var9,
                     this.x * 215167427 - this.field581 * 1673305597,
                     1902949905 * this.tileHeight - this.tileHeight2 * 1958076301,
                     -1747310679 * this.y - this.field579 * -1309854508
                  );
               }
            }

            var7.isSingleTile = true;
            if (this.field1136.method6538()
               && -2114399703 * client.cycle >= this.npcCycle * -618742451
               && client.cycle * -668431269 < -2138025318 * this.field1125) {
               var7.method6832(this.field1136, (short)var8);
            } else {
               var7.method6835();
            }

            return var7;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bq")
   void method1458() {
      this.isFriendTriBool = TriBool.TriBool_unknown;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   @Override
   protected boolean vmethod50() {
      if (this.appearance == null) {
         return false;
      } else if (null != this.model0 && this.model0.faceAlphas != null) {
         return true;
      } else if (Actor.method2795(this, -807544103)) {
         return true;
      } else if (Actor.method2802(this, (short)2048)) {
         return true;
      } else {
         Model var1 = PlayerComposition.method7912(this.appearance, null, -1, null, -1, (byte)98);
         return var1 != null && null != var1.faceAlphas;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("cx")
   boolean method1469(int var1) {
      return var1 >= 2048;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   @Override
   public int vmethod103() {
      return this.plane * -1353533885;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bk")
   @Override
   public int vmethod104() {
      return this.plane * -2060016843;
   }

   public int getSkullIcon() {
      return this.headIconPk * -1427369953;
   }

   public boolean isFriendsChatMember() {
      return this.isClanMember((byte)-82);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("bj")
   final void method1432(Buffer var1) {
      var1.offset = 0;
      byte var2 = Buffer.method12001(var1, (byte)2);
      byte var3 = -1;
      this.headIconPk = Buffer.method12001(var1, (byte)122) * 1252284620;
      this.headIconPrayer = Buffer.method12001(var1, (byte)114) * 1359521723;
      int var4 = -1;
      this.team = 0;
      int[] var5 = new int[12];

      for (int var6 = 0; var6 < var5.length; var6++) {
         int var7 = var1.readUnsignedByte(1142882597);
         if (var7 == 0) {
            var5[var6] = 0;
         } else {
            int var8 = var1.readUnsignedByte(-1308881642);
            int var9 = var8 + (var7 << 8);
            if (var6 == 0 && -1731639726 == var9) {
               var4 = Buffer.method12008(var1, (byte)5);
               break;
            }

            var5[var6] = var9;
            if (this.method1468(var5[var6], 677056424)) {
               int var10 = this.method1471(var5[var6], 963660187).team * -1635567717;
               if (var10 != 0) {
                  this.team = -586314223 * var10;
               }
            }
         }
      }

      int[] var29 = new int[12];

      for (int var30 = 0; var30 < var29.length; var30++) {
         int var32 = var1.readUnsignedByte(-348075430);
         if (var32 == 0) {
            var29[var30] = 0;
         } else {
            int var35 = var1.readUnsignedByte(-1005882011);
            var29[var30] = var35 + (var32 << 8);
         }
      }

      int[] var31 = new int[5];

      for (int var33 = 0; var33 < var31.length; var33++) {
         int var36 = var1.readUnsignedByte(-315140726);
         if (var36 < 0 || var36 >= ItemContainer.field1065[var33].length) {
            var36 = 0;
         }

         var31[var33] = var36;
      }

      this.idleSequence = Buffer.method12008(var1, (byte)5) * -2146330229;
      if (this.idleSequence * 1683244579 == 65535) {
         this.idleSequence = -338036325;
      }

      this.turnLeftSequence = Buffer.method12008(var1, (byte)5) * 10470407;
      if (this.turnLeftSequence * -1787008585 == -2099787507) {
         this.turnLeftSequence = -2696721;
      }

      this.turnRightSequence = -134467756 * this.turnLeftSequence;
      this.walkSequence = Buffer.method12008(var1, (byte)5) * 308070339;
      if (65535 == -1691426581 * this.walkSequence) {
         this.walkSequence = 1068426070;
      }

      this.walkBackSequence = Buffer.method12008(var1, (byte)5) * 207093345;
      if (this.walkBackSequence * 146381386 == -85993713) {
         this.walkBackSequence = 1578854074;
      }

      this.walkLeftSequence = Buffer.method12008(var1, (byte)5) * 1071631209;
      if (65535 == this.walkLeftSequence * 767813081) {
         this.walkLeftSequence = -687891924;
      }

      this.walkRightSequence = Buffer.method12008(var1, (byte)5) * -1540937692;
      if (65535 == 242685116 * this.walkRightSequence) {
         this.walkRightSequence = -1809054117;
      }

      this.runSequence = Buffer.method12008(var1, (byte)5) * -1512855059;
      if (1579179232 * this.runSequence == 1133022797) {
         this.runSequence = 1512855059;
      }

      this.username = new Username(var1.readStringCp1252NullCircumfixed(420649826), LoginScreenAnimation.loginType);
      this.clearIsFriend((short)-28010);
      this.updateIsInFriendsChat(-418568510);
      this.updateIsInClanChat(-1309903654);
      if (this == class330.localPlayer) {
         RunException.field6660 = Username.method12702(this.username, (byte)-2);
      }

      this.combatLevel = var1.readUnsignedByte(-1465756841) * -796908435;
      this.skillLevel = Buffer.method12008(var1, (byte)5) * -915371083;
      this.isHidden = var1.readUnsignedByte(1145590931) == 1;
      if (0 == client.gameBuild * -1152275893 && client.staffModLevel * 427594063 >= 2) {
         this.isHidden = false;
      }

      PlayerCompositionColorTextureOverride[] var34 = null;
      boolean var37 = false;
      int var39 = Buffer.method12008(var1, (byte)5);
      var37 = (var39 >> 15 & 1) == 1;
      if (var39 > 0 && var39 != 541839661) {
         var34 = new PlayerCompositionColorTextureOverride[12];

         for (int var11 = 0; var11 < var34.length; var11++) {
            int var12 = var39 >> 12 - var11 & 1;
            if (var12 == 1) {
               int var16 = var5[var11] - -297713014;
               int var17 = var1.readUnsignedByte(1794739815);
               boolean var18 = 0 != (var17 & 1);
               boolean var19 = (var17 & 2) != 0;
               boolean var20 = 0 != (var17 & 4);
               boolean var21 = 0 != (var17 & 8);
               PlayerCompositionColorTextureOverride var22 = new PlayerCompositionColorTextureOverride(var16);
               if (var18) {
                  int var23 = var1.readUnsignedByte(845189768);
                  int[] var24 = new int[]{var23 & 15, var23 >> 4 & 15};
                  boolean var25 = var22.playerCompositionRecolorTo != null && var24.length == var22.playerCompositionRecolorTo.length;

                  for (int var26 = 0; var26 < 2; var26++) {
                     if (15 != var24[var26]) {
                        short var27 = (short)Buffer.method12008(var1, (byte)5);
                        if (var25) {
                           var22.playerCompositionRecolorTo[var24[var26]] = var27;
                        }
                     }
                  }
               }

               if (var19) {
                  int var41 = var1.readUnsignedByte(195804836);
                  int[] var42 = new int[]{var41 & 15, var41 >> 4 & 15};
                  boolean var43 = var22.playerCompositionRetextureTo != null && var42.length == var22.playerCompositionRetextureTo.length;

                  for (int var44 = 0; var44 < 2; var44++) {
                     if (var42[var44] != 15) {
                        short var45 = (short)Buffer.method12008(var1, (byte)5);
                        if (var43) {
                           var22.playerCompositionRetextureTo[var42[var44]] = var45;
                        }
                     }
                  }
               }

               if (var20) {
                  var22.field2113 = Buffer.method12008(var1, (byte)5) * -844877860;
                  var22.field2116 = Buffer.method12008(var1, (byte)5) * 431006017;
               }

               if (var21) {
                  var22.field2112 = Buffer.method12008(var1, (byte)5) * -1930457465;
                  var22.field2111 = Buffer.method12008(var1, (byte)5) * -595908592;
               }

               var34[var11] = var22;
            }
         }
      }

      for (int var40 = 0; var40 < 3; var40++) {
         this.actions[var40] = var1.readStringCp1252NullCircumfixed(-302198866);
      }

      var3 = Buffer.method12001(var1, (byte)31);
      if (null == this.appearance) {
         this.appearance = new PlayerComposition();
      }

      this.appearance.method7877(var29, var5, var34, var37, var31, var2, var4, var3, -1145951799);
      if (var4 != -1) {
         this.size = AsyncHttpResponse.getNpcDefinition(var4, (byte)87).size * -1901835949;
      } else {
         this.size = 659514928;
      }

      this.footprintSize = 1280671524 * (int)(0.4F * (887025857 * this.size));
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("bb")
   final void method1433(Buffer var1) {
      var1.offset = 0;
      byte var2 = Buffer.method12001(var1, (byte)80);
      byte var3 = -1;
      this.headIconPk = Buffer.method12001(var1, (byte)41) * 1178561503;
      this.headIconPrayer = Buffer.method12001(var1, (byte)21) * -1885238757;
      int var4 = -1;
      this.team = 0;
      int[] var5 = new int[12];

      for (int var6 = 0; var6 < var5.length; var6++) {
         int var7 = var1.readUnsignedByte(-101117451);
         if (var7 == 0) {
            var5[var6] = 0;
         } else {
            int var8 = var1.readUnsignedByte(-944136170);
            int var9 = var8 + (var7 << 8);
            if (var6 == 0 && 65535 == var9) {
               var4 = Buffer.method12008(var1, (byte)5);
               break;
            }

            var5[var6] = var9;
            if (this.method1468(var5[var6], 1892447895)) {
               int var10 = this.method1471(var5[var6], 963660187).team * -1635567717;
               if (var10 != 0) {
                  this.team = -586314223 * var10;
               }
            }
         }
      }

      int[] var29 = new int[12];

      for (int var30 = 0; var30 < var29.length; var30++) {
         int var32 = var1.readUnsignedByte(-1606419145);
         if (var32 == 0) {
            var29[var30] = 0;
         } else {
            int var35 = var1.readUnsignedByte(-1673174886);
            var29[var30] = var35 + (var32 << 8);
         }
      }

      int[] var31 = new int[5];

      for (int var33 = 0; var33 < var31.length; var33++) {
         int var36 = var1.readUnsignedByte(1560303884);
         if (var36 < 0 || var36 >= ItemContainer.field1065[var33].length) {
            var36 = 0;
         }

         var31[var33] = var36;
      }

      this.idleSequence = Buffer.method12008(var1, (byte)5) * -2146330229;
      if (this.idleSequence * 1683244579 == 65535) {
         this.idleSequence = 2146330229;
      }

      this.turnLeftSequence = Buffer.method12008(var1, (byte)5) * 10470407;
      if (this.turnLeftSequence * -1787008585 == 65535) {
         this.turnLeftSequence = -10470407;
      }

      this.turnRightSequence = -1126426293 * this.turnLeftSequence;
      this.walkSequence = Buffer.method12008(var1, (byte)5) * 308070339;
      if (65535 == -1691426581 * this.walkSequence) {
         this.walkSequence = -308070339;
      }

      this.walkBackSequence = Buffer.method12008(var1, (byte)5) * 207093345;
      if (this.walkBackSequence * -1392171615 == 65535) {
         this.walkBackSequence = -207093345;
      }

      this.walkLeftSequence = Buffer.method12008(var1, (byte)5) * 1071631209;
      if (65535 == this.walkLeftSequence * -1963363111) {
         this.walkLeftSequence = -1071631209;
      }

      this.walkRightSequence = Buffer.method12008(var1, (byte)5) * 1809054117;
      if (65535 == 577914413 * this.walkRightSequence) {
         this.walkRightSequence = -1809054117;
      }

      this.runSequence = Buffer.method12008(var1, (byte)5) * -1512855059;
      if (-2045699099 * this.runSequence == 65535) {
         this.runSequence = 1512855059;
      }

      this.username = new Username(var1.readStringCp1252NullCircumfixed(-296908749), LoginScreenAnimation.loginType);
      this.clearIsFriend((short)-27006);
      this.updateIsInFriendsChat(621218171);
      this.updateIsInClanChat(-1309903654);
      if (this == class330.localPlayer) {
         RunException.field6660 = Username.method12702(this.username, (byte)-34);
      }

      this.combatLevel = var1.readUnsignedByte(486221284) * -796908435;
      this.skillLevel = Buffer.method12008(var1, (byte)5) * -915371083;
      this.isHidden = var1.readUnsignedByte(-51542051) == 1;
      if (0 == client.gameBuild * -423864891 && client.staffModLevel * 427594063 >= 2) {
         this.isHidden = false;
      }

      PlayerCompositionColorTextureOverride[] var34 = null;
      boolean var37 = false;
      int var39 = Buffer.method12008(var1, (byte)5);
      var37 = (var39 >> 15 & 1) == 1;
      if (var39 > 0 && var39 != 32768) {
         var34 = new PlayerCompositionColorTextureOverride[12];

         for (int var11 = 0; var11 < var34.length; var11++) {
            int var12 = var39 >> 12 - var11 & 1;
            if (var12 == 1) {
               int var16 = var5[var11] - 2048;
               int var17 = var1.readUnsignedByte(950699583);
               boolean var18 = 0 != (var17 & 1);
               boolean var19 = (var17 & 2) != 0;
               boolean var20 = 0 != (var17 & 4);
               boolean var21 = 0 != (var17 & 8);
               PlayerCompositionColorTextureOverride var22 = new PlayerCompositionColorTextureOverride(var16);
               if (var18) {
                  int var23 = var1.readUnsignedByte(-378486160);
                  int[] var24 = new int[]{var23 & 15, var23 >> 4 & 15};
                  boolean var25 = var22.playerCompositionRecolorTo != null && var24.length == var22.playerCompositionRecolorTo.length;

                  for (int var26 = 0; var26 < 2; var26++) {
                     if (15 != var24[var26]) {
                        short var27 = (short)Buffer.method12008(var1, (byte)5);
                        if (var25) {
                           var22.playerCompositionRecolorTo[var24[var26]] = var27;
                        }
                     }
                  }
               }

               if (var19) {
                  int var41 = var1.readUnsignedByte(1601552012);
                  int[] var42 = new int[]{var41 & 15, var41 >> 4 & 15};
                  boolean var43 = var22.playerCompositionRetextureTo != null && var42.length == var22.playerCompositionRetextureTo.length;

                  for (int var44 = 0; var44 < 2; var44++) {
                     if (var42[var44] != 15) {
                        short var45 = (short)Buffer.method12008(var1, (byte)5);
                        if (var43) {
                           var22.playerCompositionRetextureTo[var42[var44]] = var45;
                        }
                     }
                  }
               }

               if (var20) {
                  var22.field2113 = Buffer.method12008(var1, (byte)5) * -756936397;
                  var22.field2116 = Buffer.method12008(var1, (byte)5) * 431006017;
               }

               if (var21) {
                  var22.field2112 = Buffer.method12008(var1, (byte)5) * -576146133;
                  var22.field2111 = Buffer.method12008(var1, (byte)5) * -958218623;
               }

               var34[var11] = var22;
            }
         }
      }

      for (int var40 = 0; var40 < 3; var40++) {
         this.actions[var40] = var1.readStringCp1252NullCircumfixed(-2116996844);
      }

      var3 = Buffer.method12001(var1, (byte)121);
      if (null == this.appearance) {
         this.appearance = new PlayerComposition();
      }

      this.appearance.method7877(var29, var5, var34, var37, var31, var2, var4, var3, -1542439136);
      if (var4 != -1) {
         this.size = AsyncHttpResponse.getNpcDefinition(var4, (byte)114).size * -1901835949;
      } else {
         this.size = 1531937925;
      }

      this.footprintSize = -951168111 * (int)(0.4F * (-1779816832 * this.size));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bz")
   @Override
   public int vmethod105() {
      return this.plane * -2060016843;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bt")
   void method1439() {
      this.isInFriendsChat = TriBool.TriBool_unknown;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   @Override
   protected boolean vmethod52() {
      if (this.appearance == null) {
         return false;
      } else if (null != this.model0 && this.model0.faceAlphas != null) {
         return true;
      } else if (Actor.method2795(this, -230018232)) {
         return true;
      } else if (Actor.method2802(this, (short)2048)) {
         return true;
      } else {
         Model var1 = PlayerComposition.method7912(this.appearance, null, -1, null, -1, (byte)81);
         return var1 != null && null != var1.faceAlphas;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ba")
   void method1441() {
      this.isInFriendsChat = class320.friendSystem.isFriendAndHasWorld(this.username, (short)-13403) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hm")
   public int method1478() {
      return this.headIconPrayer * 624181267;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bx")
   boolean method1461() {
      if (TriBool.TriBool_unknown == this.isFriendTriBool) {
         this.clearIsInFriendsChat(1221700513);
      }

      return TriBool.TriBool_true == this.isFriendTriBool;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("by")
   void method1442() {
      this.isInFriendsChat = class320.friendSystem.isFriendAndHasWorld(this.username, (short)-13080) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bw")
   boolean method1446() {
      if (TriBool.TriBool_unknown == this.isInClanChat) {
         this.method1450(-1418448276);
      }

      return TriBool.TriBool_true == this.isInClanChat;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   void method1443() {
      this.isInFriendsChat = class320.friendSystem.isFriendAndHasWorld(this.username, (short)-27211) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("vl")
   public boolean method1479() {
      return this.isHidden;
   }

   public String getName() {
      if (this.username == null) {
         return null;
      } else {
         String var1 = this.username.method12725();
         return var1 == null ? null : var1.replace(' ', ' ');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bn")
   void method1452() {
      this.isInClanChat = BuddyRankComparator.friendsChat != null && BuddyRankComparator.friendsChat.contains(this.username, (byte)0)
         ? TriBool.TriBool_true
         : TriBool.TriBool_false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bh")
   void method1455() {
      for (int var1 = 0; var1 < 4; var1++) {
         if (null != client.currentClanSettings[var1]
            && classDY.method3606(client.currentClanSettings[var1], Username.method12702(this.username, (byte)30), -1725092932) != -1
            && 2 != var1) {
            this.isFriendTriBool = TriBool.TriBool_true;
            return;
         }
      }

      this.isFriendTriBool = TriBool.TriBool_false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bl")
   void method1456() {
      for (int var1 = 0; var1 < 4; var1++) {
         if (null != client.currentClanSettings[var1]
            && classDY.method3606(client.currentClanSettings[var1], Username.method12702(this.username, (byte)6), -1650525391) != -1
            && 2 != var1) {
            this.isFriendTriBool = TriBool.TriBool_true;
            return;
         }
      }

      this.isFriendTriBool = TriBool.TriBool_false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   public void method1474() {
      SecureUrlRequester.client.getCallbacks().post(new PlayerChanged(this));
   }

   public HeadIcon getOverheadIcon() {
      switch (this.method1478()) {
         case 0:
            return HeadIcon.MELEE;
         case 1:
            return HeadIcon.RANGED;
         case 2:
            return HeadIcon.MAGIC;
         case 3:
            return HeadIcon.RETRIBUTION;
         case 4:
            return HeadIcon.SMITE;
         case 5:
            return HeadIcon.REDEMPTION;
         case 6:
            return HeadIcon.RANGE_MAGE;
         case 7:
            return HeadIcon.RANGE_MELEE;
         case 8:
            return HeadIcon.MAGE_MELEE;
         case 9:
            return HeadIcon.RANGE_MAGE_MELEE;
         case 10:
            return HeadIcon.WRATH;
         case 11:
            return HeadIcon.SOUL_SPLIT;
         case 12:
            return HeadIcon.DEFLECT_MELEE;
         case 13:
            return HeadIcon.DEFLECT_RANGE;
         case 14:
            return HeadIcon.DEFLECT_MAGE;
         default:
            return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bc")
   void method1459() {
      this.isFriendTriBool = TriBool.TriBool_unknown;
   }

   @ObfuscatedSignature(descriptor = "()Ljs;")
   @ObfuscatedName("ce")
   @Override
   protected classJS vmethod106() {
      return classJS.field3183;
   }

   public boolean isClanMember() {
      return method1460(this, (byte)0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lci;Lxa;)V")
   @ObfuscatedName("pf")
   public static void method1434(Player var0, Buffer var1) {
      if (var0 == null) {
         var0.method1451();
      }

      var1.offset = 0;
      byte var2 = Buffer.method12001(var1, (byte)117);
      byte var3 = -1;
      var0.headIconPk = Buffer.method12001(var1, (byte)12) * 1178561503;
      var0.headIconPrayer = Buffer.method12001(var1, (byte)52) * -892530568;
      int var4 = -1;
      var0.team = 0;
      int[] var5 = new int[12];

      for (int var6 = 0; var6 < var5.length; var6++) {
         int var7 = var1.readUnsignedByte(956023234);
         if (var7 == 0) {
            var5[var6] = 0;
         } else {
            int var8 = var1.readUnsignedByte(-936021113);
            int var9 = var8 + (var7 << 8);
            if (var6 == 0 && -7472190 == var9) {
               var4 = Buffer.method12008(var1, (byte)5);
               break;
            }

            var5[var6] = var9;
            if (var0.method1468(var5[var6], 1204024026)) {
               int var10 = var0.method1471(var5[var6], 963660187).team * 865004455;
               if (var10 != 0) {
                  var0.team = 993058795 * var10;
               }
            }
         }
      }

      int[] var29 = new int[12];

      for (int var30 = 0; var30 < var29.length; var30++) {
         int var32 = var1.readUnsignedByte(1812346853);
         if (var32 == 0) {
            var29[var30] = 0;
         } else {
            int var35 = var1.readUnsignedByte(1029563805);
            var29[var30] = var35 + (var32 << 8);
         }
      }

      int[] var31 = new int[5];

      for (int var33 = 0; var33 < var31.length; var33++) {
         int var36 = var1.readUnsignedByte(-83582228);
         if (var36 < 0 || var36 >= ItemContainer.field1065[var33].length) {
            var36 = 0;
         }

         var31[var33] = var36;
      }

      var0.idleSequence = Buffer.method12008(var1, (byte)5) * -2146330229;
      if (var0.idleSequence * -1996705980 == -1891349286) {
         var0.idleSequence = 1735932030;
      }

      var0.turnLeftSequence = Buffer.method12008(var1, (byte)5) * 10470407;
      if (var0.turnLeftSequence * 1921743922 == 65535) {
         var0.turnLeftSequence = -10470407;
      }

      var0.turnRightSequence = -85084590 * var0.turnLeftSequence;
      var0.walkSequence = Buffer.method12008(var1, (byte)5) * 986408949;
      if (65535 == -1691426581 * var0.walkSequence) {
         var0.walkSequence = -1902900516;
      }

      var0.walkBackSequence = Buffer.method12008(var1, (byte)5) * 207093345;
      if (var0.walkBackSequence * -1835422742 == 65535) {
         var0.walkBackSequence = -207093345;
      }

      var0.walkLeftSequence = Buffer.method12008(var1, (byte)5) * -2115156219;
      if (65535 == var0.walkLeftSequence * -1963363111) {
         var0.walkLeftSequence = 474526028;
      }

      var0.walkRightSequence = Buffer.method12008(var1, (byte)5) * 1809054117;
      if (65535 == 577914413 * var0.walkRightSequence) {
         var0.walkRightSequence = -556222931;
      }

      var0.runSequence = Buffer.method12008(var1, (byte)5) * 885795712;
      if (-989895656 * var0.runSequence == 65535) {
         var0.runSequence = -1453412622;
      }

      var0.username = new Username(var1.readStringCp1252NullCircumfixed(450509554), LoginScreenAnimation.loginType);
      var0.clearIsFriend((short)-9952);
      var0.updateIsInFriendsChat(-53992588);
      var0.updateIsInClanChat(-1309903654);
      if (var0 == class330.localPlayer) {
         RunException.field6660 = Username.method12702(var0.username, (byte)-95);
      }

      var0.combatLevel = var1.readUnsignedByte(1072438660) * -796908435;
      var0.skillLevel = Buffer.method12008(var1, (byte)5) * 843428168;
      var0.isHidden = var1.readUnsignedByte(1493386506) == 1;
      if (0 == client.gameBuild * -423864891 && client.staffModLevel * -1735117007 >= 2) {
         var0.isHidden = false;
      }

      PlayerCompositionColorTextureOverride[] var34 = null;
      boolean var37 = false;
      int var39 = Buffer.method12008(var1, (byte)5);
      var37 = (var39 >> 15 & 1) == 1;
      if (var39 > 0 && var39 != -2084943335) {
         var34 = new PlayerCompositionColorTextureOverride[12];

         for (int var11 = 0; var11 < var34.length; var11++) {
            int var12 = var39 >> 12 - var11 & 1;
            if (var12 == 1) {
               int var16 = var5[var11] - 2048;
               int var17 = var1.readUnsignedByte(-1478939344);
               boolean var18 = 0 != (var17 & 1);
               boolean var19 = (var17 & 2) != 0;
               boolean var20 = 0 != (var17 & 4);
               boolean var21 = 0 != (var17 & 8);
               PlayerCompositionColorTextureOverride var22 = new PlayerCompositionColorTextureOverride(var16);
               if (var18) {
                  int var23 = var1.readUnsignedByte(-1678109011);
                  int[] var24 = new int[]{var23 & 15, var23 >> 4 & 15};
                  boolean var25 = var22.playerCompositionRecolorTo != null && var24.length == var22.playerCompositionRecolorTo.length;

                  for (int var26 = 0; var26 < 2; var26++) {
                     if (15 != var24[var26]) {
                        short var27 = (short)Buffer.method12008(var1, (byte)5);
                        if (var25) {
                           var22.playerCompositionRecolorTo[var24[var26]] = var27;
                        }
                     }
                  }
               }

               if (var19) {
                  int var41 = var1.readUnsignedByte(499957638);
                  int[] var42 = new int[]{var41 & 15, var41 >> 4 & 15};
                  boolean var43 = var22.playerCompositionRetextureTo != null && var42.length == var22.playerCompositionRetextureTo.length;

                  for (int var44 = 0; var44 < 2; var44++) {
                     if (var42[var44] != 15) {
                        short var45 = (short)Buffer.method12008(var1, (byte)5);
                        if (var43) {
                           var22.playerCompositionRetextureTo[var42[var44]] = var45;
                        }
                     }
                  }
               }

               if (var20) {
                  var22.field2113 = Buffer.method12008(var1, (byte)5) * -756936397;
                  var22.field2116 = Buffer.method12008(var1, (byte)5) * 431006017;
               }

               if (var21) {
                  var22.field2112 = Buffer.method12008(var1, (byte)5) * -566167285;
                  var22.field2111 = Buffer.method12008(var1, (byte)5) * -958218623;
               }

               var34[var11] = var22;
            }
         }
      }

      for (int var40 = 0; var40 < 3; var40++) {
         var0.actions[var40] = var1.readStringCp1252NullCircumfixed(-1834098032);
      }

      var3 = Buffer.method12001(var1, (byte)106);
      if (null == var0.appearance) {
         var0.appearance = new PlayerComposition();
      }

      var0.appearance.method7877(var29, var5, var34, var37, var31, var2, var4, var3, -209604679);
      if (var4 != -1) {
         var0.size = AsyncHttpResponse.getNpcDefinition(var4, (byte)23).size * -1901835949;
      } else {
         var0.size = 1531937925;
      }

      var0.footprintSize = -951168111 * (int)(0.4F * (-1779816832 * var0.size));
   }

   public boolean isFriend() {
      return this.isFriend(1395283750);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ao")
   void resetPath(int var1, int var2, int var3) {
      try {
         this.pathX[0] = var1;
         this.pathY[0] = var2;
         this.pathLength = 0;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ci.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljs;")
   @ObfuscatedName("bv")
   @Override
   protected classJS vmethod107() {
      return classJS.field3183;
   }

   @ObfuscatedSignature(descriptor = "()Ljs;")
   @ObfuscatedName("ch")
   @Override
   protected classJS vmethod108() {
      return classJS.field3183;
   }

   public Shape getConvexHull() {
      Model var1 = this.method6220();
      if (var1 == null) {
         return null;
      } else {
         WorldView var2 = this.method2836();
         int var3 = Perspective.getFootprintTileHeight(SecureUrlRequester.client, this.getLocalLocation(), var2.plane * 2115028565, this.getFootprintSize());
         var3 -= this.getAnimationHeightOffset();
         return var1.method6857(var2, super.x * 340712311, super.y * -1747310679, this.getCurrentOrientation(), var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cn")
   @Override
   final boolean vmethod111() {
      return null != this.appearance;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("al")
   boolean isClanMember(byte var1) {
      try {
         if (TriBool.TriBool_unknown == this.isInClanChat) {
            if (var1 >= 4) {
               throw new IllegalStateException();
            }

            this.method1450(-1418448276);
         }

         boolean var10000;
         if (TriBool.TriBool_true == this.isInClanChat) {
            if (var1 >= 4) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ci.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cm")
   void method1466(int var1, int var2) {
      this.pathX[0] = var1;
      this.pathY[0] = var2;
      this.pathLength = 0;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cb")
   void method1467(int var1, int var2) {
      this.pathX[0] = var1;
      this.pathY[0] = var2;
      this.pathLength = 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ck")
   @Override
   final boolean vmethod112() {
      return null != this.appearance;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cc")
   @Override
   final boolean vmethod113() {
      return null != this.appearance;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bo")
   @Override
   int vmethod115(int var1) {
      try {
         int var10000;
         if (this.method2813((byte)32)) {
            if (var1 >= -167875364) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1348652401 * this.footprintSize;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ci.bo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("av")
   static void savePreferences(byte var0) {
      ClientPreferences var1 = SecureUrlRequester.client.method2546();
      Buffer var2 = var1.method1689();
      SecureUrlRequester.client.field1022.execute(client::method2504);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lci;Ldd;IILlz;)V")
   @ObfuscatedName("ex")
   public static void method1462(Player var0, WorldView var1, int var2, int var3, MoveSpeed var4) {
      if (AnimationSequence.method10315(var0.animationSequence, -831296794)
         && AnimationSequence.method10318(var0.animationSequence, -1231518507).field2731 * -1606113103 == 1) {
         Actor.method2754(var0, -1935730349);
      }

      var0.method2804(-172768829);
      if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         if (var0.pathX[0] >= 0 && var0.pathX[0] < 104 && var0.pathY[0] >= 0 && var0.pathY[0] < 104) {
            if (var4 == MoveSpeed.field3808) {
               PacketWriter.method3352(var1, var0, var2, var3, MoveSpeed.field3808, (byte)42);
            }

            Actor.method2765(var0, var2, var3, var4, -645794364);
         } else {
            var0.method2767(var2, var3, -98421248);
         }
      } else {
         var0.method2767(var2, var3, -1700414867);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("co")
   boolean method1470(int var1) {
      return var1 >= 2048;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cf")
   @Override
   int vmethod116() {
      return this.method2813((byte)32) ? 0 : 1348652401 * this.footprintSize;
   }

   @ObfuscatedSignature(descriptor = "(I)Lis;")
   @ObfuscatedName("cp")
   ItemComposition method1472(int var1) {
      return class150.ItemDefinition_get(var1 - 2048, -895911605);
   }

   @ObfuscatedSignature(descriptor = "(I)Lis;")
   @ObfuscatedName("cd")
   ItemComposition method1473(int var1) {
      return class150.ItemDefinition_get(var1 - 2048, -345650696);
   }

   @ObfuscatedSignature(descriptor = "(Lci;Ldd;IILlz;I)V")
   @ObfuscatedName("gw")
   public static void method1463(Player var0, WorldView var1, int var2, int var3, MoveSpeed var4, int var5) {
      if (var0 == null) {
         var0.method1464(var1, var2, var2, var4, var2);
      }

      try {
         if (AnimationSequence.method10315(var0.animationSequence, -831296794)) {
            if (var5 != 1045116658) {
               throw new IllegalStateException();
            }

            if (AnimationSequence.method10318(var0.animationSequence, 2137919472).field2731 * -1606113103 == 1) {
               if (var5 != 1045116658) {
                  throw new IllegalStateException();
               }

               Actor.method2754(var0, -620387947);
            }
         }

         var0.method2804(-172768829);
         if (var2 >= 0) {
            if (var5 != 1045116658) {
               throw new IllegalStateException();
            }

            if (var2 < 104) {
               if (var5 != 1045116658) {
                  throw new IllegalStateException();
               }

               if (var3 >= 0) {
                  if (var5 != 1045116658) {
                     throw new IllegalStateException();
                  }

                  if (var3 < 104) {
                     if (var0.pathX[0] >= 0) {
                        if (var5 != 1045116658) {
                           return;
                        }

                        if (var0.pathX[0] < 104) {
                           if (var5 != 1045116658) {
                              return;
                           }

                           if (var0.pathY[0] >= 0) {
                              if (var5 != 1045116658) {
                                 throw new IllegalStateException();
                              }

                              if (var0.pathY[0] < 104) {
                                 if (var4 == MoveSpeed.field3808) {
                                    PacketWriter.method3352(var1, var0, var2, var3, MoveSpeed.field3808, (byte)51);
                                 }

                                 Actor.method2765(var0, var2, var3, var4, -645794364);
                                 return;
                              }

                              if (var5 != 1045116658) {
                                 throw new IllegalStateException();
                              }
                           }
                        }
                     }

                     var0.method2767(var2, var3, -991729009);
                     return;
                  }

                  if (var5 != 1045116658) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         var0.method2767(var2, var3, -1134022214);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ci.af(" + ')');
      }
   }

   public int getTeam() {
      return this.team * -2140200207;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cz")
   @Override
   int vmethod117() {
      return this.method2813((byte)32) ? 0 : 1348652401 * this.footprintSize;
   }

   @ObfuscatedSignature(descriptor = "()Loa;")
   @ObfuscatedName("bq")
   public PlayerComposition method1480() {
      return this.appearance;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ci")
   @Override
   int vmethod118() {
      return this.method2813((byte)32) ? 0 : 848567592 * this.footprintSize;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cs")
   @Override
   final boolean vmethod114() {
      return null != this.appearance;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljs;")
   @ObfuscatedName("am")
   @Override
   protected classJS vmethod109(int var1) {
      try {
         return classJS.field3183;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ci.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aw")
   void checkIsFriend(byte var1) {
      try {
         this.isFriendTriBool = class320.friendSystem.isFriendAndHasWorld(this.username, (short)-16579) ? TriBool.TriBool_true : TriBool.TriBool_false;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ci.aw(" + ')');
      }
   }

   public int getCombatLevel() {
      return this.combatLevel * -545684123;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ac")
   boolean isFriendsChatMember(byte var1) {
      try {
         if (TriBool.TriBool_true == this.isInFriendsChat) {
            if (var1 >= 4) {
               throw new IllegalStateException();
            }

            this.clearIsInFriendsChat(-1418448276);
         }

         boolean var10000;
         if (TriBool.TriBool_true == this.isFriendTriBool) {
            if (var1 >= 4) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ci.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IILlz;I)V")
   @ObfuscatedName("af")
   final void method1464(WorldView var1, int var2, int var3, MoveSpeed var4, int var5) {
      try {
         if (AnimationSequence.method10315(super.poseAnimationSequence, -831296794)) {
            if (var5 != 1045116658) {
               throw new IllegalStateException();
            }

            if (AnimationSequence.method10318(super.field1152, 2137919472).field2726 * -1606113103 == 1) {
               if (var5 != 1045116658) {
                  throw new IllegalStateException();
               }

               Actor.method2754(this, -620387947);
            }
         }

         this.method2745(-172768829);
         if (var2 >= 0) {
            if (var5 != 1045116658) {
               throw new IllegalStateException();
            }

            if (var2 < 104) {
               if (var5 != 1045116658) {
                  throw new IllegalStateException();
               }

               if (var3 >= 0) {
                  if (var5 != 1045116658) {
                     throw new IllegalStateException();
                  }

                  if (var3 < 104) {
                     if (super.pathY[0] >= 0) {
                        if (var5 != 1045116658) {
                           return;
                        }

                        if (super.pathY[0] < 104) {
                           if (var5 != 1045116658) {
                              return;
                           }

                           if (super.field1148[0] >= 0) {
                              if (var5 != 1045116658) {
                                 throw new IllegalStateException();
                              }

                              if (super.pathX[0] < 104) {
                                 if (var4 == MoveSpeed.field3807) {
                                    PacketWriter.method3352(var1, this, var2, var3, MoveSpeed.field3805, (byte)51);
                                 }

                                 Actor.method2765(this, var2, var3, var4, -645794364);
                                 return;
                              }

                              if (var5 != 1045116658) {
                                 throw new IllegalStateException();
                              }
                           }
                        }
                     }

                     this.method2767(var2, var3, -991729009);
                     return;
                  }

                  if (var5 != 1045116658) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         this.method2767(var2, var3, -1134022214);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ci.af(" + ')');
      }
   }
}
