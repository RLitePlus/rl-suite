import net.runelite.api.ChatPlayer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tm")
public class Buddy extends User implements ChatPlayer {
   @ObfuscatedName("ae")
   public int world = -1697130425;
   @ObfuscatedName("aj")
   public int int2;
   @ObfuscatedName("ak")
   public int rank;

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("br")
   void method10778(int var1, int var2) {
      this.world = var1 * 1697130425;
      this.int2 = 712191463 * var2;
   }

   @ObfuscatedSignature(descriptor = "(IIS)V")
   @ObfuscatedName("bw")
   void set(int var1, int var2, short var3) {
      try {
         this.world = var1 * 1697130425;
         this.int2 = 712191463 * var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "tm.bw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bf")
   public int getWorld(int var1) {
      try {
         return 1914416777 * this.world;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tm.bf(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bn")
   public boolean hasWorld(int var1) {
      try {
         boolean var10000;
         if (this.world * 1914416777 > 0) {
            if (var1 != 937210184) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tm.bn(" + ')');
      }
   }

   public int getWorld() {
      return this.world * 1914416777;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ed")
   public int method10781() {
      return 1914416777 * this.world;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("av")
   public static int method10784(int var0, int var1) {
      try {
         return var0 >>> 12;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tm.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bc")
   public int method10782() {
      return 1914416777 * this.world;
   }

   Buddy() {
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bx")
   public boolean method10786() {
      return this.world * 1914416777 > 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bq")
   public int method10789() {
      return this.rank * 91500301;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bv")
   public boolean method10787() {
      return this.world * 1914416777 > 0;
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZB)I")
   @ObfuscatedName("bt")
   static int method10788(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (3600 == var0) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               if (0 == 636276089 * class320.friendSystem.field123) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -2;
               } else if (1 == 636276089 * class320.friendSystem.field123) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = UserList.method10669(
                     class320.friendSystem.friendsList, -825871594
                  );
               }

               return 1;
            }
         } else if (3601 == var0) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               int var50 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               if (class320.friendSystem.method427(-412846501) && var50 >= 0) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  if (var50 < UserList.method10669(class320.friendSystem.friendsList, -532389013)) {
                     Friend var53 = (Friend)class320.friendSystem.friendsList.get(var50, -89437617);
                     Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = User.method10984(
                        var53, (byte)44
                     );
                     Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = User.method10986(
                        var53, 842131119
                     );
                     return 1;
                  }
               }

               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               return 1;
            }
         } else if (var0 == 3602) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               int var49 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               if (class320.friendSystem.method427(-1825810096)) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  if (var49 >= 0 && var49 < UserList.method10669(class320.friendSystem.friendsList, 1575998665)) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ((Buddy)class320.friendSystem
                              .friendsList
                              .get(var49, 1852353205))
                           .world
                        * 1914416777;
                     return 1;
                  }
               }

               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3603) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               int var48 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               if (class320.friendSystem.method427(-791871664)) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  if (var48 >= 0) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     if (var48 < UserList.method10669(class320.friendSystem.friendsList, 414101877)) {
                        if (var3 <= -1) {
                           throw new IllegalStateException();
                        }

                        Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ((Buddy)class320.friendSystem
                                 .friendsList
                                 .get(var48, -1279809638))
                              .rank
                           * 91500301;
                        return 1;
                     }
                  }
               }

               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3604) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               String var47 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               int var52 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Clock.method6212(var47, var52, 852811176);
               return 1;
            }
         } else if (var0 == 3605) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               String var46 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               class320.friendSystem.addFriend(var46, -1888361506);
               return 1;
            }
         } else if (var0 == 3606) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               String var45 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               FriendSystem.method460(class320.friendSystem, var45, 831964661);
               return 1;
            }
         } else if (var0 == 3607) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               String var44 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               class320.friendSystem.addIgnore(var44, -743399704);
               return 1;
            }
         } else if (3608 == var0) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               String var43 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               boolean var51 = true;
               class320.friendSystem.removeIgnore(var43, var51, 631832910);
               return 1;
            }
         } else if (3609 == var0) {
            String var41 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            var41 = class117.method3814(var41, -448856087);
            int[] var75 = Interpreter.Interpreter_intStack;
            int var78 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
            byte var81;
            if (class320.friendSystem.isFriended(new Username(var41, LoginScreenAnimation.loginType), false, -63638469)) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               }

               var81 = 1;
            } else {
               var81 = 0;
            }

            var75[var78] = var81;
            return 1;
         } else if (var0 == 3611) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               if (null != BuddyRankComparator.friendsChat) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = BuddyRankComparator.friendsChat
                     .name;
               } else {
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               }

               return 1;
            }
         } else if (var0 == 3612) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               if (null != BuddyRankComparator.friendsChat) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = UserList.method10669(
                     BuddyRankComparator.friendsChat, 122338546
                  );
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               }

               return 1;
            }
         } else if (var0 == 3613) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               int var40 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               if (BuddyRankComparator.friendsChat != null) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  if (var40 < UserList.method10669(BuddyRankComparator.friendsChat, 1084878080)) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = Username.method12702(
                        BuddyRankComparator.friendsChat.get(var40, -1198532394).getUsername((byte)-97), (byte)-10
                     );
                     return 1;
                  }
               }

               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               return 1;
            }
         } else if (3614 == var0) {
            int var39 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            if (null != BuddyRankComparator.friendsChat) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               }

               if (var39 < UserList.method10669(BuddyRankComparator.friendsChat, -948998574)) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ((Buddy)BuddyRankComparator.friendsChat
                        .get(var39, -1692483207))
                     .getWorld(1054075200);
                  return 1;
               }
            }

            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         } else if (var0 == 3615) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               int var38 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               if (BuddyRankComparator.friendsChat != null) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  if (var38 < UserList.method10669(BuddyRankComparator.friendsChat, -81447053)) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ((Buddy)BuddyRankComparator.friendsChat
                              .get(var38, -325746797))
                           .rank
                        * 91500301;
                     return 1;
                  }
               }

               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3616) {
            int[] var74 = Interpreter.Interpreter_intStack;
            int var77 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
            byte var80;
            if (null != BuddyRankComparator.friendsChat) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               }

               var80 = BuddyRankComparator.friendsChat.minKick;
            } else {
               var80 = 0;
            }

            var74[var77] = var80;
            return 1;
         } else if (var0 == 3617) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               String var37 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               class57.clanKickUser(var37, (byte)73);
               return 1;
            }
         } else if (3618 == var0) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               int[] var73 = Interpreter.Interpreter_intStack;
               int var76 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               int var79;
               if (null != BuddyRankComparator.friendsChat) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  var79 = BuddyRankComparator.friendsChat.rank * -44662875;
               } else {
                  var79 = 0;
               }

               var73[var76] = var79;
               return 1;
            }
         } else if (3619 == var0) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               String var36 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               IntProjection.Clan_joinChat(var36, -269605761);
               return 1;
            }
         } else if (3620 == var0) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               class195.Clan_leaveChat(2089018130);
               return 1;
            }
         } else if (3621 == var0) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               if (!class320.friendSystem.method427(-1226092586)) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = UserList.method10669(
                     class320.friendSystem.ignoreList, 1836490138
                  );
               }

               return 1;
            }
         } else if (3622 == var0) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               int var35 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               if (class320.friendSystem.method427(1020511708)) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  if (var35 >= 0) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     if (var35 < UserList.method10669(class320.friendSystem.ignoreList, 1912051722)) {
                        if (var3 <= -1) {
                           throw new IllegalStateException();
                        }

                        Ignored var5 = (Ignored)class320.friendSystem.ignoreList.get(var35, 1850986310);
                        Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = User.method10984(
                           var5, (byte)-86
                        );
                        Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = User.method10986(
                           var5, 1643918782
                        );
                        return 1;
                     }
                  }
               }

               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               return 1;
            }
         } else if (3623 == var0) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               String var33 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               var33 = class117.method3814(var33, 2095957385);
               int[] var72 = Interpreter.Interpreter_intStack;
               int var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var10002;
               if (FriendSystem.method443(class320.friendSystem, new Username(var33, LoginScreenAnimation.loginType), (byte)30)) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var72[var10001] = var10002;
               return 1;
            }
         } else if (3624 == var0) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               int var32 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               if (null != BuddyRankComparator.friendsChat) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  if (var32 < UserList.method10669(BuddyRankComparator.friendsChat, -235880578)) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     if (BuddyRankComparator.friendsChat.get(var32, -1373971278).getUsername((byte)-22).equals(class330.localPlayer.username)) {
                        if (var3 <= -1) {
                           throw new IllegalStateException();
                        }

                        Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
                        return 1;
                     }
                  }
               }

               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (var0 == 3625) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               if (BuddyRankComparator.friendsChat != null) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  if (BuddyRankComparator.friendsChat.owner != null) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = BuddyRankComparator.friendsChat
                        .owner;
                     return 1;
                  }
               }

               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               return 1;
            }
         } else if (var0 == 3626) {
            if (var3 <= -1) {
               throw new IllegalStateException();
            } else {
               int var31 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               if (BuddyRankComparator.friendsChat != null) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  if (var31 < UserList.method10669(BuddyRankComparator.friendsChat, 854974576)) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     if (((ClanMate)BuddyRankComparator.friendsChat.get(var31, 1342757236)).isFriend((byte)-54)) {
                        if (var3 <= -1) {
                           throw new IllegalStateException();
                        }

                        Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
                        return 1;
                     }
                  }
               }

               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (var0 != 3627) {
            if (3628 == var0) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  class320.friendSystem.friendsList.removeComparator((byte)41);
                  return 1;
               }
            } else if (3629 == var0) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  boolean var71;
                  if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     var71 = true;
                  } else {
                     var71 = false;
                  }

                  boolean var30 = var71;
                  UserList.method10734(class320.friendSystem.friendsList, new UserComparator1(var30), (byte)111);
                  return 1;
               }
            } else if (var0 == 3630) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  boolean var70;
                  if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     var70 = true;
                  } else {
                     var70 = false;
                  }

                  boolean var29 = var70;
                  UserList.method10734(class320.friendSystem.friendsList, new UserComparator2(var29), (byte)65);
                  return 1;
               }
            } else if (var0 == 3631) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  boolean var69;
                  if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     var69 = true;
                  } else {
                     var69 = false;
                  }

                  boolean var28 = var69;
                  UserList.method10734(class320.friendSystem.friendsList, new UserComparator3(var28), (byte)95);
                  return 1;
               }
            } else if (var0 == 3632) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  boolean var68;
                  if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     var68 = true;
                  } else {
                     var68 = false;
                  }

                  boolean var27 = var68;
                  UserList.method10734(class320.friendSystem.friendsList, new UserComparator4(var27), (byte)7);
                  return 1;
               }
            } else if (3633 == var0) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  boolean var67;
                  if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     var67 = true;
                  } else {
                     var67 = false;
                  }

                  boolean var26 = var67;
                  UserList.method10734(class320.friendSystem.friendsList, new UserComparator5(var26), (byte)117);
                  return 1;
               }
            } else if (var0 == 3634) {
               boolean var66;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  var66 = true;
               } else {
                  var66 = false;
               }

               boolean var25 = var66;
               UserList.method10734(class320.friendSystem.friendsList, new UserComparator6(var25), (byte)74);
               return 1;
            } else if (3635 == var0) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  boolean var24 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
                  UserList.method10734(class320.friendSystem.friendsList, new UserComparator7(var24), (byte)5);
                  return 1;
               }
            } else if (3636 == var0) {
               boolean var65;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  var65 = true;
               } else {
                  var65 = false;
               }

               boolean var23 = var65;
               UserList.method10734(class320.friendSystem.friendsList, new UserComparator8(var23), (byte)32);
               return 1;
            } else if (3637 == var0) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  boolean var64;
                  if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     var64 = true;
                  } else {
                     var64 = false;
                  }

                  boolean var22 = var64;
                  UserList.method10734(class320.friendSystem.friendsList, new UserComparator9(var22), (byte)42);
                  return 1;
               }
            } else if (3638 == var0) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  boolean var63;
                  if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     var63 = true;
                  } else {
                     var63 = false;
                  }

                  boolean var21 = var63;
                  UserList.method10734(class320.friendSystem.friendsList, new UserComparator10(var21), (byte)18);
                  return 1;
               }
            } else if (var0 == 3639) {
               class320.friendSystem.friendsList.sort((byte)103);
               return 1;
            } else if (var0 == 3640) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  class320.friendSystem.ignoreList.removeComparator((byte)20);
                  return 1;
               }
            } else if (3641 == var0) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  boolean var62;
                  if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     var62 = true;
                  } else {
                     var62 = false;
                  }

                  boolean var20 = var62;
                  UserList.method10734(class320.friendSystem.ignoreList, new UserComparator1(var20), (byte)68);
                  return 1;
               }
            } else if (var0 == 3642) {
               boolean var61;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  var61 = true;
               } else {
                  var61 = false;
               }

               boolean var19 = var61;
               UserList.method10734(class320.friendSystem.ignoreList, new UserComparator2(var19), (byte)62);
               return 1;
            } else if (var0 == 3643) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  class320.friendSystem.ignoreList.sort((byte)113);
                  return 1;
               }
            } else if (3644 == var0) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  if (null != BuddyRankComparator.friendsChat) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     BuddyRankComparator.friendsChat.removeComparator((byte)121);
                  }

                  return 1;
               }
            } else if (3645 == var0) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  boolean var60;
                  if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     var60 = true;
                  } else {
                     var60 = false;
                  }

                  boolean var18 = var60;
                  if (BuddyRankComparator.friendsChat != null) {
                     UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator1(var18), (byte)56);
                  }

                  return 1;
               }
            } else if (var0 == 3646) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  boolean var59;
                  if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     var59 = true;
                  } else {
                     var59 = false;
                  }

                  boolean var17 = var59;
                  if (BuddyRankComparator.friendsChat != null) {
                     UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator2(var17), (byte)111);
                  }

                  return 1;
               }
            } else if (var0 == 3647) {
               boolean var58;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  var58 = true;
               } else {
                  var58 = false;
               }

               boolean var16 = var58;
               if (BuddyRankComparator.friendsChat != null) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator3(var16), (byte)62);
               }

               return 1;
            } else if (var0 == 3648) {
               boolean var57;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  var57 = true;
               } else {
                  var57 = false;
               }

               boolean var15 = var57;
               if (null != BuddyRankComparator.friendsChat) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator4(var15), (byte)21);
               }

               return 1;
            } else if (3649 == var0) {
               boolean var56;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  var56 = true;
               } else {
                  var56 = false;
               }

               boolean var14 = var56;
               if (null != BuddyRankComparator.friendsChat) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator5(var14), (byte)52);
               }

               return 1;
            } else if (3650 == var0) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  boolean var13 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
                  if (null != BuddyRankComparator.friendsChat) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator6(var13), (byte)4);
                  }

                  return 1;
               }
            } else if (var0 == 3651) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  boolean var12 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
                  if (null != BuddyRankComparator.friendsChat) {
                     UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator7(var12), (byte)10);
                  }

                  return 1;
               }
            } else if (var0 == 3652) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  boolean var55;
                  if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     var55 = true;
                  } else {
                     var55 = false;
                  }

                  boolean var11 = var55;
                  if (BuddyRankComparator.friendsChat != null) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator8(var11), (byte)61);
                  }

                  return 1;
               }
            } else if (3653 == var0) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  boolean var10 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
                  if (null != BuddyRankComparator.friendsChat) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator9(var10), (byte)1);
                  }

                  return 1;
               }
            } else if (var0 == 3654) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  boolean var9 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
                  if (null != BuddyRankComparator.friendsChat) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     UserList.method10734(BuddyRankComparator.friendsChat, new UserComparator10(var9), (byte)46);
                  }

                  return 1;
               }
            } else if (var0 == 3655) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  if (null != BuddyRankComparator.friendsChat) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     BuddyRankComparator.friendsChat.sort((byte)59);
                  }

                  return 1;
               }
            } else if (var0 == 3656) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               } else {
                  boolean var54;
                  if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     var54 = true;
                  } else {
                     var54 = false;
                  }

                  boolean var8 = var54;
                  UserList.method10734(class320.friendSystem.friendsList, new BuddyRankComparator(var8), (byte)117);
                  return 1;
               }
            } else if (var0 == 3657) {
               boolean var10000;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var7 = var10000;
               if (null != BuddyRankComparator.friendsChat) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  UserList.method10734(BuddyRankComparator.friendsChat, new BuddyRankComparator(var7), (byte)62);
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            int var4 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            if (null != BuddyRankComparator.friendsChat) {
               if (var3 <= -1) {
                  throw new IllegalStateException();
               }

               if (var4 < UserList.method10669(BuddyRankComparator.friendsChat, -171022403)) {
                  if (var3 <= -1) {
                     throw new IllegalStateException();
                  }

                  if (((ClanMate)BuddyRankComparator.friendsChat.get(var4, -1727009991)).isIgnored(-2012861431)) {
                     if (var3 <= -1) {
                        throw new IllegalStateException();
                     }

                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
                     return 1;
                  }
               }
            }

            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            return 1;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "tm.bt(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bl")
   public int method10783() {
      return 1914416777 * this.world;
   }
}
