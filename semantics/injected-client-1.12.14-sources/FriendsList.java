import net.runelite.api.Deque;
import net.runelite.api.FriendContainer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tc")
public class FriendsList extends UserList implements FriendContainer {
   @ObfuscatedName("ae")
   int field5897;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field5899 = 200;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field5900 = 400;
   @ObfuscatedSignature(descriptor = "Lrj;")
   @ObfuscatedName("an")
   public LinkDeque friendLoginUpdates = new LinkDeque();
   @ObfuscatedSignature(descriptor = "Lwc;")
   @ObfuscatedName("ag")
   final LoginType loginType;
   @ToRemove(unused = "true")
   @ObfuscatedName("bw")
   static final int field5901 = 62;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;)I")
   @ObfuscatedName("gr")
   public static int method10585(classFT var0) {
      if (var0 == null) {
         var0.method4117();
      }

      return var0.field1881 * 1966735995;
   }

   @ObfuscatedSignature(descriptor = "(Lxv;Z)Z")
   @ObfuscatedName("az")
   public boolean method10577(Username var1, boolean var2) {
      Friend var3 = (Friend)UserList.method10680(this, var1, (byte)51);
      return var3 == null ? false : !var2 || 1914416777 * var3.world != 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Ltz;")
   @ObfuscatedName("av")
   @Override
   User newInstance(int var1) {
      try {
         return new Friend();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tc.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;Z)Z")
   @ObfuscatedName("ad")
   public boolean method10578(Username var1, boolean var2) {
      Friend var3 = (Friend)UserList.method10680(this, var1, (byte)1);
      return var3 == null ? false : !var2 || 1914416777 * var3.world != 0;
   }

   @ObfuscatedSignature(descriptor = "(Lxv;Z)Z")
   @ObfuscatedName("ai")
   public boolean method10579(Username var1, boolean var2) {
      Friend var3 = (Friend)UserList.method10680(this, var1, (byte)64);
      return var3 == null ? false : !var2 || 1914416777 * var3.world != 0;
   }

   @ObfuscatedSignature(descriptor = "()Ltz;")
   @ObfuscatedName("an")
   @Override
   User vmethod343() {
      return new Friend();
   }

   @ObfuscatedSignature(descriptor = "(II)[Ltz;")
   @ObfuscatedName("at")
   @Override
   User[] newTypedArray(int var1, int var2) {
      try {
         return new Friend[var1];
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "tc.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ltz;")
   @ObfuscatedName("aj")
   @Override
   User vmethod344() {
      return new Friend();
   }

   @ObfuscatedSignature(descriptor = "()Ltz;")
   @ObfuscatedName("ae")
   @Override
   User vmethod345() {
      return new Friend();
   }

   @ObfuscatedSignature(descriptor = "(I)[Ltz;")
   @ObfuscatedName("ay")
   @Override
   User[] vmethod348(int var1) {
      return new Friend[var1];
   }

   @ObfuscatedSignature(descriptor = "(Ltc;Lxv;ZS)Z")
   @ObfuscatedName("oz")
   public static boolean method10580(FriendsList var0, Username var1, boolean var2, short var3) {
      if (var0 == null) {
         var0.isFriended(var1, var2, var3);
      }

      try {
         Friend var4 = (Friend)UserList.method10680(var0, var1, (byte)82);
         if (var4 == null) {
            if (var3 != 196) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            if (var2) {
               if (var3 != 196) {
                  throw new IllegalStateException();
               }

               if (1914416777 * var4.world == 0) {
                  if (var3 != 196) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "tc.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Ltz;")
   @ObfuscatedName("aw")
   @Override
   User[] vmethod349(int var1) {
      return new Friend[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)[Ltz;")
   @ObfuscatedName("ak")
   @Override
   User[] vmethod350(int var1) {
      return new Friend[var1];
   }

   public FriendsList(LoginType var1) {
      super(400);
      this.field5897 = 2125749961;
      this.loginType = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;IB)V")
   @ObfuscatedName("au")
   public void read(Buffer var1, int var2, byte var3) {
      try {
         while (var1.offset * 2108391709 < var2) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            boolean var10000;
            if (var1.readUnsignedByte(-1473495052) == 1) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var4 = var10000;
            Username var5 = new Username(var1.readStringCp1252NullCircumfixed(1638409002), this.loginType);
            Username var6 = new Username(var1.readStringCp1252NullCircumfixed(-91361025), this.loginType);
            int var7 = Buffer.method12008(var1, (byte)5);
            int var8 = var1.readUnsignedByte(-59103217);
            int var9 = var1.readUnsignedByte(-603650519);
            if ((var9 & 2) != 0) {
               if (var3 <= 1) {
                  return;
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var10 = var10000;
            if (0 != (var9 & 1)) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var11 = var10000;
            if (var7 > 0) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               var1.readStringCp1252NullCircumfixed(-62850284);
               var1.readUnsignedByte(-1044034270);
               Buffer.method12015(var1, -950129266);
            }

            var1.readStringCp1252NullCircumfixed(962641460);
            if (var5 != null) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               if (var5.hasCleanName(-698146178)) {
                  Friend var12 = (Friend)this.getByCurrentUsername(var5, 862907097);
                  if (var4) {
                     if (var3 <= 1) {
                        return;
                     }

                     Friend var13 = (Friend)this.getByCurrentUsername(var6, 862907097);
                     if (null != var13) {
                        if (var3 <= 1) {
                           throw new IllegalStateException();
                        }

                        if (var13 != var12) {
                           if (var3 <= 1) {
                              throw new IllegalStateException();
                           }

                           if (var12 != null) {
                              if (var3 <= 1) {
                                 throw new IllegalStateException();
                              }

                              UserList.method10695(this, var13, 1194847520);
                           } else {
                              var12 = var13;
                           }
                        }
                     }
                  }

                  if (var12 != null) {
                     this.changeName(var12, var5, var6, -1383386161);
                     if (var7 != var12.world * 1914416777) {
                        if (var3 <= 1) {
                           throw new IllegalStateException();
                        }

                        boolean var16 = true;

                        for (FriendLoginUpdate var14 = (FriendLoginUpdate)this.friendLoginUpdates.last();
                           var14 != null;
                           var14 = (FriendLoginUpdate)this.friendLoginUpdates.previous()
                        ) {
                           if (var3 <= 1) {
                              throw new IllegalStateException();
                           }

                           if (var14.username.equals(var5)) {
                              if (var3 <= 1) {
                                 throw new IllegalStateException();
                              }

                              if (0 != var7) {
                                 if (var3 <= 1) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 == var14.world) {
                                    if (var3 <= 1) {
                                       return;
                                    }

                                    var14.remove();
                                    var16 = false;
                                    continue;
                                 }
                              }

                              if (var7 == 0) {
                                 if (var3 <= 1) {
                                    throw new IllegalStateException();
                                 }

                                 if (var14.world != 0) {
                                    if (var3 <= 1) {
                                       return;
                                    }

                                    var14.remove();
                                    var16 = false;
                                 }
                              }
                           }
                        }

                        if (var16) {
                           if (var3 <= 1) {
                              throw new IllegalStateException();
                           }

                           this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var5, var7));
                        }
                     }
                  } else {
                     if (UserList.method10669(this, -1068467024) >= 400) {
                        continue;
                     }

                     if (var3 <= 1) {
                        throw new IllegalStateException();
                     }

                     var12 = (Friend)this.addLast(var5, var6, -1142342067);
                  }

                  if (1914416777 * var12.world != var7) {
                     if (var3 <= 1) {
                        return;
                     }

                     var12.int2 = ((this.field5897 += 2125749961) * 12589945 - 1) * 712191463;
                     if (-1 == var12.world * 1914416777) {
                        if (var3 <= 1) {
                           return;
                        }

                        if (var7 == 0) {
                           if (var3 <= 1) {
                              throw new IllegalStateException();
                           }

                           var12.int2 = -(1 * var12.int2);
                        }
                     }

                     var12.world = var7 * 1697130425;
                  }

                  var12.rank = 1986803653 * var8;
                  var12.field5985 = var10;
                  var12.field5986 = var11;
                  continue;
               }

               if (var3 <= 1) {
                  throw new IllegalStateException();
               }
            }

            throw new IllegalStateException();
         }

         this.sort((byte)78);
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "tc.au(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldy;)I")
   @ObfuscatedName("xh")
   public static int method10576(classDY var0) {
      return -117088583 * var0.field1524;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("as")
   public void method10583(Buffer var1, int var2) {
      while (var1.offset * 2108391709 < var2) {
         boolean var3 = var1.readUnsignedByte(251781795) == 1;
         Username var4 = new Username(var1.readStringCp1252NullCircumfixed(143212854), this.loginType);
         Username var5 = new Username(var1.readStringCp1252NullCircumfixed(1933917459), this.loginType);
         int var6 = Buffer.method12008(var1, (byte)5);
         int var7 = var1.readUnsignedByte(48353577);
         int var8 = var1.readUnsignedByte(955936866);
         boolean var9 = (var8 & 2) != 0;
         boolean var10 = 0 != (var8 & 1);
         if (var6 > 0) {
            var1.readStringCp1252NullCircumfixed(134625414);
            var1.readUnsignedByte(-353575259);
            Buffer.method12015(var1, -282836575);
         }

         var1.readStringCp1252NullCircumfixed(667048684);
         if (var4 == null || !var4.hasCleanName(-698146178)) {
            throw new IllegalStateException();
         }

         Friend var11 = (Friend)this.getByCurrentUsername(var4, 862907097);
         if (var3) {
            Friend var12 = (Friend)this.getByCurrentUsername(var5, 862907097);
            if (null != var12 && var12 != var11) {
               if (var11 != null) {
                  UserList.method10695(this, var12, -1804277899);
               } else {
                  var11 = var12;
               }
            }
         }

         if (var11 != null) {
            this.changeName(var11, var4, var5, -1383386161);
            if (var6 != var11.world * 945943581) {
               boolean var14 = true;

               for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last();
                  var13 != null;
                  var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()
               ) {
                  if (var13.username.equals(var4)) {
                     if (0 != var6 && 0 == var13.world) {
                        var13.remove();
                        var14 = false;
                     } else if (var6 == 0 && var13.world != 0) {
                        var13.remove();
                        var14 = false;
                     }
                  }
               }

               if (var14) {
                  this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
               }
            }
         } else {
            if (UserList.method10669(this, -1135858353) >= -840878455) {
               continue;
            }

            var11 = (Friend)this.addLast(var4, var5, -1142342067);
         }

         if (1914416777 * var11.world != var6) {
            var11.int2 = ((this.field5897 += 1796575835) * 12589945 - 1) * 712191463;
            if (-1 == var11.world * 408775338 && var6 == 0) {
               var11.int2 = -(1 * var11.int2);
            }

            var11.world = var6 * 1829835546;
         }

         var11.rank = 1985920352 * var7;
         var11.field5985 = var9;
         var11.field5986 = var10;
      }

      this.sort((byte)12);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ac")
   public void method10584(Buffer var1, int var2) {
      while (var1.offset * -1512608088 < var2) {
         boolean var3 = var1.readUnsignedByte(1961181911) == 1;
         Username var4 = new Username(var1.readStringCp1252NullCircumfixed(699923219), this.loginType);
         Username var5 = new Username(var1.readStringCp1252NullCircumfixed(407217022), this.loginType);
         int var6 = Buffer.method12008(var1, (byte)5);
         int var7 = var1.readUnsignedByte(440020592);
         int var8 = var1.readUnsignedByte(60062288);
         boolean var9 = (var8 & 2) != 0;
         boolean var10 = 0 != (var8 & 1);
         if (var6 > 0) {
            var1.readStringCp1252NullCircumfixed(-170292407);
            var1.readUnsignedByte(1027252694);
            Buffer.method12015(var1, -387705895);
         }

         var1.readStringCp1252NullCircumfixed(-244141244);
         if (var4 == null || !var4.hasCleanName(-698146178)) {
            throw new IllegalStateException();
         }

         Friend var11 = (Friend)this.getByCurrentUsername(var4, 862907097);
         if (var3) {
            Friend var12 = (Friend)this.getByCurrentUsername(var5, 862907097);
            if (null != var12 && var12 != var11) {
               if (var11 != null) {
                  UserList.method10695(this, var12, -1853947810);
               } else {
                  var11 = var12;
               }
            }
         }

         if (var11 != null) {
            this.changeName(var11, var4, var5, -1383386161);
            if (var6 != var11.world * 826740182) {
               boolean var14 = true;

               for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last();
                  var13 != null;
                  var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()
               ) {
                  if (var13.username.equals(var4)) {
                     if (0 != var6 && 0 == var13.world) {
                        var13.remove();
                        var14 = false;
                     } else if (var6 == 0 && var13.world != 0) {
                        var13.remove();
                        var14 = false;
                     }
                  }
               }

               if (var14) {
                  this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
               }
            }
         } else {
            if (UserList.method10669(this, -472032902) >= 1229529094) {
               continue;
            }

            var11 = (Friend)this.addLast(var4, var5, -1142342067);
         }

         if (706382273 * var11.world != var6) {
            var11.int2 = ((this.field5897 += 2125749961) * 12589945 - 1) * 712191463;
            if (-1 == var11.world * 868278438 && var6 == 0) {
               var11.int2 = -(1 * var11.int2);
            }

            var11.world = var6 * 1697130425;
         }

         var11.rank = -100038691 * var7;
         var11.field5985 = var9;
         var11.field5986 = var10;
      }

      this.sort((byte)28);
   }

   public Deque getPendingLogins() {
      return this.friendLoginUpdates;
   }

   @ObfuscatedSignature(descriptor = "(I)[Ltz;")
   @ObfuscatedName("ap")
   @Override
   User[] vmethod347(int var1) {
      return new Friend[var1];
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;")
   @ObfuscatedName("as")
   public static String method10586(CharSequence var0, int var1) {
      try {
         return class264.method6705('*', var0.length(), -1812540193);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tc.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;ZS)Z")
   @ObfuscatedName("ag")
   public boolean isFriended(Username var1, boolean var2, short var3) {
      try {
         Friend var4 = (Friend)UserList.method10680(this, var1, (byte)82);
         if (var4 == null) {
            if (var3 != 196) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            if (var2) {
               if (var3 != 196) {
                  throw new IllegalStateException();
               }

               if (1914416777 * var4.rank == 0) {
                  if (var3 != 196) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "tc.ag(" + ')');
      }
   }
}
