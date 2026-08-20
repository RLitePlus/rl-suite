import net.runelite.api.Deque;
import net.runelite.api.FriendContainer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rn")
public class FriendsList extends UserList implements FriendContainer {
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field5817 = 64;
   @ObfuscatedName("ag")
   int field5813;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5818 = 400;
   @ObfuscatedSignature(descriptor = "Lnk;")
   @ObfuscatedName("ab")
   public classNK field5812 = new classNK();
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field5815 = 200;
   @ObfuscatedSignature(descriptor = "Laao;")
   @ObfuscatedName("ae")
   final classAAO field5814;
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   public static final int field5819 = 71;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field5816 = 25;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   static final String field5820 = "game-session/v1/tokens";

   @ObfuscatedSignature(descriptor = "(Laae;Z)Z")
   @ObfuscatedName("aj")
   public boolean method10131(classAAE var1, boolean var2) {
      Friend var3 = (Friend)this.method10207(var1, 282151994);
      return null == var3 ? false : !var2 || 1407608587 * var3.field5669 != 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Lrr;")
   @ObfuscatedName("az")
   @Override
   User vmethod555(int var1) {
      try {
         return new Friend();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rn.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)[Lrr;")
   @ObfuscatedName("af")
   @Override
   User[] vmethod558(int var1, byte var2) {
      try {
         return new Friend[var1];
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rn.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;IB)V")
   @ObfuscatedName("ax")
   public void method10135(classXY var1, int var2, byte var3) {
      try {
         while (702114061 * var1.field6955 < var2) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            boolean var10000;
            if (classXY.method13039(var1, -346779531) == 1) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var4 = var10000;
            classAAE var5 = new classAAE(var1.method13071(-164489557), this.field5814);
            classAAE var6 = new classAAE(var1.method13071(963455264), this.field5814);
            int var7 = classXY.method13047(var1, -553521674);
            int var8 = classXY.method13039(var1, -346779531);
            int var9 = classXY.method13039(var1, -346779531);
            if ((var9 & 2) != 0) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var10 = var10000;
            if ((var9 & 1) != 0) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var11 = var10000;
            if (var7 > 0) {
               if (var3 != 1) {
                  return;
               }

               var1.method13071(602408241);
               classXY.method13039(var1, -346779531);
               var1.method13056((byte)1);
            }

            var1.method13071(2114272159);
            if (null != var5) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               }

               if (var5.method171(84304373)) {
                  Friend var12 = (Friend)UserList.method10209(this, var5, 215663160);
                  if (var4) {
                     if (var3 != 1) {
                        throw new IllegalStateException();
                     }

                     Friend var13 = (Friend)UserList.method10209(this, var6, -213415090);
                     if (var13 != null) {
                        if (var3 != 1) {
                           throw new IllegalStateException();
                        }

                        if (var13 != var12) {
                           if (var3 != 1) {
                              return;
                           }

                           if (null != var12) {
                              this.method10220(var13, 85928142);
                           } else {
                              var12 = var13;
                           }
                        }
                     }
                  }

                  if (null != var12) {
                     if (var3 != 1) {
                        throw new IllegalStateException();
                     }

                     this.method10237(var12, var5, var6, 484569748);
                     if (var7 != var12.field5669 * -760305529) {
                        if (var3 != 1) {
                           throw new IllegalStateException();
                        }

                        boolean var16 = true;

                        for (FriendLoginUpdate var14 = (FriendLoginUpdate)this.field5812.method7868();
                           var14 != null;
                           var14 = (FriendLoginUpdate)this.field5812.method7872()
                        ) {
                           if (var3 != 1) {
                              throw new IllegalStateException();
                           }

                           if (var14.field5665.equals(var5)) {
                              if (var3 != 1) {
                                 return;
                              }

                              if (var7 != 0) {
                                 if (var3 != 1) {
                                    throw new IllegalStateException();
                                 }

                                 if (var14.field5666 == 0) {
                                    classVM.method11996(var14);
                                    var16 = false;
                                    continue;
                                 }
                              }

                              if (0 == var7 && var14.field5666 != 0) {
                                 if (var3 != 1) {
                                    throw new IllegalStateException();
                                 }

                                 classVM.method11996(var14);
                                 var16 = false;
                              }
                           }
                        }

                        if (var16) {
                           classNK.method7865(this.field5812, new FriendLoginUpdate(var5, var7));
                        }
                     }
                  } else {
                     if (this.method10191(-1891707521) >= 400) {
                        continue;
                     }

                     if (var3 != 1) {
                        return;
                     }

                     var12 = (Friend)this.method10226(var5, var6, (byte)1);
                  }

                  if (var7 != var12.field5669 * -760305529) {
                     if (var3 != 1) {
                        throw new IllegalStateException();
                     }

                     var12.field5670 = ((this.field5813 += -546079269) * 1336292947 - 1) * 282868315;
                     if (-1 == var12.field5669 * -760305529 && 0 == var7) {
                        if (var3 != 1) {
                           throw new IllegalStateException();
                        }

                        var12.field5670 = -(var12.field5670 * 1);
                     }

                     var12.field5669 = var7 * 849976631;
                  }

                  var12.field5671 = -998616451 * var8;
                  var12.field5829 = var10;
                  var12.field5828 = var11;
                  continue;
               }

               if (var3 != 1) {
                  throw new IllegalStateException();
               }
            }

            throw new IllegalStateException();
         }

         this.method10234((byte)52);
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "rn.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lrr;")
   @ObfuscatedName("ab")
   @Override
   User vmethod556() {
      return new Friend();
   }

   public FriendsList(classAAO var1) {
      super(400);
      this.field5813 = -546079269;
      this.field5814 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lrr;")
   @ObfuscatedName("ag")
   @Override
   User vmethod557() {
      return new Friend();
   }

   @ObfuscatedSignature(descriptor = "(I)[Lrr;")
   @ObfuscatedName("as")
   @Override
   User[] vmethod559(int var1) {
      return new Friend[var1];
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("ay")
   public void method10136(classXY var1, int var2) {
      while (702114061 * var1.field6955 < var2) {
         boolean var3 = classXY.method13039(var1, -346779531) == 1;
         classAAE var4 = new classAAE(var1.method13071(163959395), this.field5814);
         classAAE var5 = new classAAE(var1.method13071(-1111492227), this.field5814);
         int var6 = classXY.method13047(var1, -1321718598);
         int var7 = classXY.method13039(var1, -346779531);
         int var8 = classXY.method13039(var1, -346779531);
         boolean var9 = (var8 & 2) != 0;
         boolean var10 = (var8 & 1) != 0;
         if (var6 > 0) {
            var1.method13071(-1244773458);
            classXY.method13039(var1, -346779531);
            var1.method13056((byte)1);
         }

         var1.method13071(-1358535128);
         if (null == var4 || !var4.method171(-380005946)) {
            throw new IllegalStateException();
         }

         Friend var11 = (Friend)UserList.method10209(this, var4, -483768489);
         if (var3) {
            Friend var12 = (Friend)UserList.method10209(this, var5, 10049706);
            if (var12 != null && var12 != var11) {
               if (null != var11) {
                  this.method10220(var12, -1079214284);
               } else {
                  var11 = var12;
               }
            }
         }

         if (null != var11) {
            this.method10237(var11, var4, var5, 845283771);
            if (var6 != var11.field5669 * -637919054) {
               boolean var14 = true;

               for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.field5812.method7868();
                  var13 != null;
                  var13 = (FriendLoginUpdate)this.field5812.method7872()
               ) {
                  if (var13.field5665.equals(var4)) {
                     if (var6 != 0 && var13.field5666 == 0) {
                        classVM.method11996(var13);
                        var14 = false;
                     } else if (0 == var6 && var13.field5666 != 0) {
                        classVM.method11996(var13);
                        var14 = false;
                     }
                  }
               }

               if (var14) {
                  classNK.method7865(this.field5812, new FriendLoginUpdate(var4, var6));
               }
            }
         } else {
            if (this.method10191(-1135340799) >= 400) {
               continue;
            }

            var11 = (Friend)this.method10226(var4, var5, (byte)-71);
         }

         if (var6 != var11.field5669 * -1028820137) {
            var11.field5670 = ((this.field5813 += -546079269) * 258969951 - 1) * 282868315;
            if (-1 == var11.field5669 * -760305529 && 0 == var6) {
               var11.field5670 = -(var11.field5670 * 1);
            }

            var11.field5669 = var6 * 849976631;
         }

         var11.field5671 = -179047125 * var7;
         var11.field5829 = var9;
         var11.field5828 = var10;
      }

      this.method10234((byte)72);
   }

   @ObfuscatedSignature(descriptor = "(Laae;Z)Z")
   @ObfuscatedName("al")
   public boolean method10132(classAAE var1, boolean var2) {
      Friend var3 = (Friend)this.method10207(var1, 282151994);
      return null == var3 ? false : !var2 || -760305529 * var3.field5669 != 0;
   }

   @ObfuscatedSignature(descriptor = "(Laae;Z)Z")
   @ObfuscatedName("ac")
   public boolean method10133(classAAE var1, boolean var2) {
      Friend var3 = (Friend)this.method10207(var1, 282151994);
      return null == var3 ? false : !var2 || -1495204789 * var3.field5669 != 0;
   }

   public Deque getPendingLogins() {
      return this.field5812;
   }

   @ObfuscatedSignature(descriptor = "(II)Lyy;")
   @ObfuscatedName("af")
   public static classYY method10130(int var0, int var1) {
      try {
         return classYR.field7073[var0];
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rn.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("aq")
   public void method10137(classXY var1, int var2) {
      while (702114061 * var1.field6955 < var2) {
         boolean var3 = classXY.method13039(var1, -346779531) == 1;
         classAAE var4 = new classAAE(var1.method13071(-618593419), this.field5814);
         classAAE var5 = new classAAE(var1.method13071(-609255046), this.field5814);
         int var6 = classXY.method13047(var1, -1192861307);
         int var7 = classXY.method13039(var1, -346779531);
         int var8 = classXY.method13039(var1, -346779531);
         boolean var9 = (var8 & 2) != 0;
         boolean var10 = (var8 & 1) != 0;
         if (var6 > 0) {
            var1.method13071(566881087);
            classXY.method13039(var1, -346779531);
            var1.method13056((byte)1);
         }

         var1.method13071(1565399809);
         if (null == var4 || !var4.method171(249763947)) {
            throw new IllegalStateException();
         }

         Friend var11 = (Friend)UserList.method10209(this, var4, -1919857173);
         if (var3) {
            Friend var12 = (Friend)UserList.method10209(this, var5, 888126702);
            if (var12 != null && var12 != var11) {
               if (null != var11) {
                  this.method10220(var12, -477148842);
               } else {
                  var11 = var12;
               }
            }
         }

         if (null != var11) {
            this.method10237(var11, var4, var5, 223355795);
            if (var6 != var11.field5669 * 1957680341) {
               boolean var14 = true;

               for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.field5812.method7868();
                  var13 != null;
                  var13 = (FriendLoginUpdate)this.field5812.method7872()
               ) {
                  if (var13.field5665.equals(var4)) {
                     if (var6 != 0 && var13.field5666 == 0) {
                        classVM.method11996(var13);
                        var14 = false;
                     } else if (0 == var6 && var13.field5666 != 0) {
                        classVM.method11996(var13);
                        var14 = false;
                     }
                  }
               }

               if (var14) {
                  classNK.method7865(this.field5812, new FriendLoginUpdate(var4, var6));
               }
            }
         } else {
            if (this.method10191(-1526041748) >= -2091973663) {
               continue;
            }

            var11 = (Friend)this.method10226(var4, var5, (byte)-28);
         }

         if (var6 != var11.field5669 * 843569712) {
            var11.field5670 = ((this.field5813 += 1868193187) * 1336292947 - 1) * 1023288574;
            if (-1 == var11.field5669 * -1024278346 && 0 == var6) {
               var11.field5670 = -(var11.field5670 * 1);
            }

            var11.field5669 = var6 * 849976631;
         }

         var11.field5671 = -998616451 * var7;
         var11.field5829 = var9;
         var11.field5828 = var10;
      }

      this.method10234((byte)126);
   }

   @ObfuscatedSignature(descriptor = "(Laae;ZI)Z")
   @ObfuscatedName("ae")
   public boolean method10134(classAAE var1, boolean var2, int var3) {
      try {
         Friend var4 = (Friend)this.method10207(var1, 282151994);
         if (null == var4) {
            return false;
         } else {
            if (var2) {
               if (var3 >= -1889939987) {
                  throw new IllegalStateException();
               }

               if (-760305529 * var4.field5669 == 0) {
                  if (var3 >= -1889939987) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "rn.ae(" + ')');
      }
   }
}
