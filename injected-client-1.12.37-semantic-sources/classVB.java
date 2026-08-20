import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vb")
public class classVB {
   @ObfuscatedName("ax")
   public int field6463;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field6479 = 1;
   @ObfuscatedName("al")
   long field6481;
   @ObfuscatedName("aw")
   int field6468;
   @ObfuscatedName("ac")
   public int field6458 = 0;
   @ObfuscatedSignature(descriptor = "Lyi;")
   @ObfuscatedName("aj")
   NodeHashTable field6466;
   @ObfuscatedSignature(descriptor = "Luk;")
   @ObfuscatedName("aa")
   classUK field6483;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field6480 = 0;
   @ObfuscatedName("ao")
   int field6459;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field6477 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6478 = 2;
   @ObfuscatedSignature(descriptor = "Lyi;")
   @ObfuscatedName("aq")
   NodeHashTable field6474;
   @ObfuscatedName("ad")
   int field6472;
   @ObfuscatedName("ai")
   int field6467;
   @ObfuscatedSignature(descriptor = "Lyi;")
   @ObfuscatedName("au")
   NodeHashTable field6465;
   @ObfuscatedSignature(descriptor = "Lnh;")
   @ObfuscatedName("ap")
   classNH field6464;
   @ObfuscatedSignature(descriptor = "Lyi;")
   @ObfuscatedName("ar")
   NodeHashTable field6476;
   @ObfuscatedSignature(descriptor = "[Lvp;")
   @ObfuscatedName("bx")
   classVP[] field6460;
   @ObfuscatedName("ak")
   boolean field6486;
   @ObfuscatedSignature(descriptor = "Luc;")
   @ObfuscatedName("av")
   classUC field6482;
   @ObfuscatedSignature(descriptor = "Lxy;")
   @ObfuscatedName("at")
   classXY field6469;
   @ObfuscatedSignature(descriptor = "Lxy;")
   @ObfuscatedName("an")
   classXY field6484;
   @ObfuscatedName("am")
   int field6470;
   @ObfuscatedName("ah")
   CRC32 field6471;
   @ObfuscatedSignature(descriptor = "Lxy;")
   @ObfuscatedName("bn")
   classXY field6485;
   @ObfuscatedName("ay")
   int field6462;
   @ObfuscatedName("bc")
   int field6461;
   @ObfuscatedName("bp")
   int field6473;
   @ObfuscatedName("br")
   byte field6475;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvb;II)V")
   @ObfuscatedName("ob")
   public static void method11907(classVB var0, int var1, int var2) {
      if (var0 == null) {
         var0.method11910(var1, var1);
      }

      long var3 = (var1 << 16) + var2;
      classUC var5 = (classUC)var0.field6465.method13363(var3);
      if (null != var5) {
         var0.field6464.method7844(var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bp")
   void method11908(int var1, int var2) {
      long var3 = (var1 << 16) + var2;
      classUC var5 = (classUC)this.field6465.method13363(var3);
      if (null != var5) {
         this.field6464.method7844(var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("az")
   public boolean method11883(byte var1) {
      try {
         long var2 = classDD.method2983(16711680);
         int var4 = (int)(var2 - this.field6481 * -2021231288791816661L);
         this.field6481 = -8371170626432079741L * var2;
         if (var4 > 200) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            var4 = 200;
         }

         this.field6459 += 1543721085 * var4;
         if (-1735349139 * this.field6468 == 0) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            if (this.field6472 * 403165785 == 0) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               if (136778065 * this.field6467 == 0) {
                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (-1026186423 * this.field6462 == 0) {
                     return true;
                  }
               }
            }
         }

         if (this.field6483 == null) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            try {
               if (-841176875 * this.field6459 > 30000) {
                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  } else {
                     throw new IOException();
                  }
               } else {
                  while (403165785 * this.field6472 < 200 && this.field6462 * -1026186423 > 0) {
                     if (var1 <= 0) {
                        throw new IllegalStateException();
                     }

                     classUC var5 = (classUC)this.field6466.method13375();
                     classXY var6 = new classXY(4);
                     classXY.method12971(var6, 1, (byte)-76);
                     classXY.method12978(var6, (int)var5.field6552, (byte)-46);
                     this.field6483.vmethod597(var6.field6954, 0, 4, -1032071721);
                     this.field6474.method13372(var5, var5.field6552);
                     this.field6462 -= 1927593721;
                     this.field6472 += 588928489;
                  }

                  while (-1735349139 * this.field6468 < 200) {
                     if (var1 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (136778065 * this.field6467 <= 0) {
                        break;
                     }

                     if (var1 <= 0) {
                        throw new IllegalStateException();
                     }

                     classUC var21 = (classUC)this.field6464.method7847();
                     classXY var23 = new classXY(4);
                     classXY.method12971(var23, 0, (byte)-64);
                     classXY.method12978(var23, (int)var21.field6552, (byte)-75);
                     this.field6483.vmethod597(var23.field6954, 0, 4, -1032071721);
                     var21.method11958();
                     this.field6476.method13372(var21, var21.field6552);
                     this.field6467 -= -1982670927;
                     this.field6468 += -613532315;
                  }

                  int var22 = 0;

                  while (true) {
                     label319: {
                        if (var22 < 100) {
                           if (var1 <= 0) {
                              throw new IllegalStateException();
                           }

                           int var24 = this.field6483.vmethod586(1549380113);
                           if (var24 < 0) {
                              if (var1 <= 0) {
                                 throw new IllegalStateException();
                              }

                              throw new IOException();
                           }

                           if (var24 == 0) {
                              if (var1 <= 0) {
                                 throw new IllegalStateException();
                              }
                           } else {
                              this.field6459 = 0;
                              byte var7 = 0;
                              if (this.field6482 == null) {
                                 if (var1 <= 0) {
                                    throw new IllegalStateException();
                                 }

                                 var7 = 8;
                              } else if (this.field6470 * 1179146369 == 0) {
                                 if (var1 <= 0) {
                                    throw new IllegalStateException();
                                 }

                                 var7 = 1;
                              }

                              if (var7 > 0) {
                                 if (var1 <= 0) {
                                    throw new IllegalStateException();
                                 }

                                 int var8 = var7 - 702114061 * this.field6469.field6955;
                                 if (var8 > var24) {
                                    if (var1 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    var8 = var24;
                                 }

                                 this.field6483.vmethod594(this.field6469.field6954, 702114061 * this.field6469.field6955, var8, -315246770);
                                 if (this.field6475 != 0) {
                                    if (var1 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    for (int var9 = 0; var9 < var8; var9++) {
                                       if (var1 <= 0) {
                                          throw new IllegalStateException();
                                       }

                                       this.field6469.field6954[var9 + this.field6469.field6955 * 702114061] = (byte)(
                                          this.field6469.field6954[var9 + this.field6469.field6955 * 702114061] ^ this.field6475
                                       );
                                    }
                                 }

                                 this.field6469.field6955 += -1095856699 * var8;
                                 if (this.field6469.field6955 * 702114061 >= var7) {
                                    if (this.field6482 == null) {
                                       if (var1 <= 0) {
                                          throw new IllegalStateException();
                                       }

                                       this.field6469.field6955 = 0;
                                       int var26 = classXY.method13039(this.field6469, -346779531);
                                       int var10 = classXY.method13047(this.field6469, 762859659);
                                       int var11 = classXY.method13039(this.field6469, -346779531);
                                       int var12 = this.field6469.method13056((byte)1);
                                       long var13 = var10 + (var26 << 16);
                                       classUC var15 = (classUC)this.field6474.method13363(var13);
                                       this.field6486 = true;
                                       if (null == var15) {
                                          if (var1 <= 0) {
                                             throw new IllegalStateException();
                                          }

                                          var15 = (classUC)this.field6476.method13363(var13);
                                          this.field6486 = false;
                                       }

                                       if (var15 == null) {
                                          if (var1 <= 0) {
                                             throw new IllegalStateException();
                                          }

                                          throw new IOException();
                                       }

                                       byte var10000;
                                       if (var11 == 0) {
                                          if (var1 <= 0) {
                                             throw new IllegalStateException();
                                          }

                                          var10000 = 5;
                                       } else {
                                          var10000 = 9;
                                       }

                                       byte var16 = var10000;
                                       this.field6482 = var15;
                                       this.field6484 = new classXY(this.field6482.field6284 + var12 + var16);
                                       classXY.method12971(this.field6484, var11, (byte)-116);
                                       this.field6484.method12979(var12, -487756836);
                                       this.field6470 = 1904163848;
                                       this.field6469.field6955 = 0;
                                    } else if (this.field6470 * 1179146369 == 0) {
                                       if (var1 <= 0) {
                                          throw new IllegalStateException();
                                       }

                                       if (-1 == this.field6469.field6954[0]) {
                                          if (var1 <= 0) {
                                             throw new IllegalStateException();
                                          }

                                          this.field6470 = 238020481;
                                          this.field6469.field6955 = 0;
                                       } else {
                                          this.field6482 = null;
                                       }
                                    }
                                    break label319;
                                 }

                                 if (var1 <= 0) {
                                    throw new IllegalStateException();
                                 }
                              } else {
                                 int var25 = this.field6484.field6954.length - this.field6482.field6284;
                                 int var27 = 512 - 1179146369 * this.field6470;
                                 if (var27 > var25 - 702114061 * this.field6484.field6955) {
                                    if (var1 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    var27 = var25 - 702114061 * this.field6484.field6955;
                                 }

                                 if (var27 > var24) {
                                    if (var1 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    var27 = var24;
                                 }

                                 this.field6483.vmethod594(this.field6484.field6954, 702114061 * this.field6484.field6955, var27, -1750355838);
                                 if (this.field6475 != 0) {
                                    if (var1 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    for (int var28 = 0; var28 < var27; var28++) {
                                       if (var1 <= 0) {
                                          throw new IllegalStateException();
                                       }

                                       this.field6484.field6954[var28 + this.field6484.field6955 * 702114061] = (byte)(
                                          this.field6484.field6954[var28 + this.field6484.field6955 * 702114061] ^ this.field6475
                                       );
                                    }
                                 }

                                 this.field6484.field6955 += -1095856699 * var27;
                                 this.field6470 += var27 * 238020481;
                                 if (var25 == this.field6484.field6955 * 702114061) {
                                    if (var1 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    if (this.field6482.field6552 == 16711935L) {
                                       if (var1 <= 0) {
                                          throw new IllegalStateException();
                                       }

                                       this.field6485 = this.field6484;

                                       for (int var30 = 0; var30 < 256; var30++) {
                                          if (var1 <= 0) {
                                             throw new IllegalStateException();
                                          }

                                          classVP var31 = this.field6460[var30];
                                          if (var31 != null) {
                                             if (var1 <= 0) {
                                                throw new IllegalStateException();
                                             }

                                             this.method11904(var31, var30, -1315156953);
                                          }
                                       }
                                    } else {
                                       this.field6471.reset();
                                       this.field6471.update(this.field6484.field6954, 0, var25);
                                       int var29 = (int)this.field6471.getValue();
                                       if (942386925 * this.field6482.field6285 != var29) {
                                          if (var1 <= 0) {
                                             throw new IllegalStateException();
                                          }

                                          try {
                                             this.field6483.vmethod604(1271658352);
                                          } catch (Exception var18) {
                                          }

                                          this.field6458 += 410008609;
                                          this.field6483 = null;
                                          this.field6475 = (byte)(Math.random() * 255.0 + 1.0);
                                          return false;
                                       }

                                       this.field6458 = 0;
                                       this.field6463 = 0;
                                       int var10001 = (int)(this.field6482.field6552 & 65535L);
                                       boolean var10003;
                                       if (16711680L == (this.field6482.field6552 & 16711680L)) {
                                          if (var1 <= 0) {
                                             throw new IllegalStateException();
                                          }

                                          var10003 = true;
                                       } else {
                                          var10003 = false;
                                       }

                                       this.field6482.field6286.method12033(var10001, this.field6484.field6954, var10003, this.field6486, 1316437961);
                                    }

                                    this.field6482.vmethod398();
                                    if (this.field6486) {
                                       if (var1 <= 0) {
                                          throw new IllegalStateException();
                                       }

                                       this.field6472 -= 588928489;
                                    } else {
                                       this.field6468 -= -613532315;
                                    }

                                    this.field6470 = 0;
                                    this.field6482 = null;
                                    this.field6484 = null;
                                    break label319;
                                 }

                                 if (1179146369 * this.field6470 == 512) {
                                    if (var1 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    this.field6470 = 0;
                                    break label319;
                                 }
                              }
                           }
                        }

                        return true;
                     }

                     var22++;
                  }
               }
            } catch (IOException var19) {
               try {
                  this.field6483.vmethod604(1271658352);
               } catch (Exception var17) {
               }

               this.field6463 += 1287164533;
               this.field6483 = null;
               return false;
            }
         }
      } catch (RuntimeException var20) {
         throw classEG.method3884(var20, "vb.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("af")
   public void method11887(boolean var1, int var2) {
      try {
         if (null != this.field6483) {
            try {
               classXY var3 = new classXY(4);
               classXY.method12971(var3, var1 ? 2 : 3, (byte)-91);
               classXY.method12978(var3, 0, (byte)-5);
               this.field6483.vmethod597(var3.field6954, 0, 4, -1032071721);
            } catch (IOException var6) {
               try {
                  this.field6483.vmethod604(1271658352);
               } catch (Exception var5) {
               }

               this.field6463 += 1287164533;
               this.field6483 = null;
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "vb.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvb;Luk;ZI)V")
   @ObfuscatedName("xt")
   public static void method11893(classVB var0, classUK var1, boolean var2, int var3) {
      if (var0 == null) {
         var0.method11896(var1, var2, var3);
      }

      try {
         if (var0.field6483 != null) {
            try {
               var0.field6483.vmethod604(1271658352);
            } catch (Exception var8) {
            }

            var0.field6483 = null;
         }

         var0.field6483 = var1;
         var0.method11887(var2, 116730183);
         var0.field6469.field6955 = 0;
         var0.field6482 = null;
         var0.field6484 = null;
         var0.field6470 = 0;

         while (true) {
            classUC var4 = (classUC)var0.field6474.method13375();
            if (null == var4) {
               while (true) {
                  var4 = (classUC)var0.field6476.method13375();
                  if (var4 == null) {
                     if (var3 != 1967420579) {
                        return;
                     } else {
                        if (0 != var0.field6475) {
                           try {
                              classXY var11 = new classXY(4);
                              classXY.method12971(var11, 4, (byte)-97);
                              classXY.method12971(var11, var0.field6475, (byte)-78);
                              var11.method12973(0, -1542382992);
                              var0.field6483.vmethod597(var11.field6954, 0, 4, -1032071721);
                           } catch (IOException var7) {
                              try {
                                 var0.field6483.vmethod604(1271658352);
                              } catch (Exception var6) {
                              }

                              var0.field6463 += 1287164533;
                              var0.field6483 = null;
                           }
                        }

                        var0.field6459 = 0;
                        var0.field6481 = classDD.method2983(16711680) * -8371170626432079741L;
                        return;
                     }
                  }

                  var0.field6464.method7844(var4);
                  var0.field6465.method13372(var4, var4.field6552);
                  var0.field6467 += -1982670927;
                  var0.field6468 -= -613532315;
               }
            }

            var0.field6466.method13372(var4, var4.field6552);
            var0.field6462 += 1927593721;
            var0.field6472 -= 588928489;
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "vb.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvb;Z)V")
   @ObfuscatedName("th")
   public static void method11888(classVB var0, boolean var1) {
      if (null != var0.field6483) {
         try {
            classXY var2 = new classXY(4);
            classXY.method12971(var2, var1 ? 2 : 3, (byte)-30);
            classXY.method12978(var2, 0, (byte)-125);
            var0.field6483.vmethod597(var2.field6954, 0, 4, -1032071721);
         } catch (IOException var5) {
            try {
               var0.field6483.vmethod604(1271658352);
            } catch (Exception var4) {
            }

            var0.field6463 += 1579917531;
            var0.field6483 = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvp;II)V")
   @ObfuscatedName("ab")
   void method11897(classVP var1, int var2, int var3) {
      try {
         if (var1.field6537) {
            if (var3 <= 2090462992) {
               throw new IllegalStateException();
            }

            if (!var1.field6536) {
               if (var3 <= 2090462992) {
                  throw new IllegalStateException();
               }

               if (var2 <= -592576429 * this.field6461) {
                  if (var3 <= 2090462992) {
                     return;
                  }

                  throw new RuntimeException("");
               }

               if (var2 < this.field6473 * -1396095293) {
                  this.field6473 = var2 * 271653355;
               }
            }
         } else {
            if (var2 >= -1396095293 * this.field6473) {
               if (var3 <= 2090462992) {
                  throw new IllegalStateException();
               }

               throw new RuntimeException("");
            }

            if (var2 > -592576429 * this.field6461) {
               this.field6461 = var2 * 1018184667;
            }
         }

         if (null != this.field6485) {
            if (var3 <= 2090462992) {
               throw new IllegalStateException();
            } else {
               this.method11904(var1, var2, -1315156953);
            }
         } else {
            method11921(this, null, classUM.field6329.field6328 * 1060637953, 255, 0, (byte)0, true, -430199353);
            this.field6460[var2] = var1;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "vb.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvp;I)V")
   @ObfuscatedName("ak")
   void method11898(classVP var1, int var2) {
      if (var1.field6537) {
         if (!var1.field6536) {
            if (var2 <= -506617777 * this.field6461) {
               throw new RuntimeException("");
            }

            if (var2 < this.field6473 * -1396095293) {
               this.field6473 = var2 * 271653355;
            }
         }
      } else {
         if (var2 >= 1651931561 * this.field6473) {
            throw new RuntimeException("");
         }

         if (var2 > 2123177699 * this.field6461) {
            this.field6461 = var2 * 1018184667;
         }
      }

      if (null != this.field6485) {
         this.method11904(var1, var2, -1315156953);
      } else {
         method11921(this, null, classUM.field6329.field6328 * 1060637953, -1777298349, 0, (byte)0, true, -1028501572);
         this.field6460[var2] = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bc")
   void method11909(int var1, int var2) {
      long var3 = (var1 << 16) + var2;
      classUC var5 = (classUC)this.field6465.method13363(var3);
      if (null != var5) {
         this.field6464.method7844(var5);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("al")
   public boolean method11884() {
      long var1 = classDD.method2983(16711680);
      int var3 = (int)(var1 - this.field6481 * -2021231288791816661L);
      this.field6481 = -8371170626432079741L * var1;
      if (var3 > -1508835759) {
         var3 = 200;
      }

      this.field6459 += 852329917 * var3;
      if (-1735349139 * this.field6468 == 0 && this.field6472 * 1296129542 == 0 && 1671223992 * this.field6467 == 0 && -1026186423 * this.field6462 == 0) {
         return true;
      } else if (this.field6483 == null) {
         return false;
      } else {
         try {
            if (-841176875 * this.field6459 > -1592739787) {
               throw new IOException();
            } else {
               while (1862031762 * this.field6472 < 200 && this.field6462 * 1366966637 > 0) {
                  classUC var4 = (classUC)this.field6466.method13375();
                  classXY var5 = new classXY(4);
                  classXY.method12971(var5, 1, (byte)-35);
                  classXY.method12978(var5, (int)var4.field6552, (byte)-108);
                  this.field6483.vmethod597(var5.field6954, 0, 4, -1032071721);
                  this.field6474.method13372(var4, var4.field6552);
                  this.field6462 -= 1659157993;
                  this.field6472 += 588928489;
               }

               while (1245540889 * this.field6468 < -1136428215 && 136778065 * this.field6467 > 0) {
                  classUC var19 = (classUC)this.field6464.method7847();
                  classXY var21 = new classXY(4);
                  classXY.method12971(var21, 0, (byte)-72);
                  classXY.method12978(var21, (int)var19.field6552, (byte)-29);
                  this.field6483.vmethod597(var21.field6954, 0, 4, -1032071721);
                  var19.method11958();
                  this.field6476.method13372(var19, var19.field6552);
                  this.field6467 -= 530235475;
                  this.field6468 += -613532315;
               }

               for (int var20 = 0; var20 < 476744020; var20++) {
                  int var22 = this.field6483.vmethod586(1549380113);
                  if (var22 < 0) {
                     throw new IOException();
                  }

                  if (var22 == 0) {
                     break;
                  }

                  this.field6459 = 0;
                  byte var6 = 0;
                  if (this.field6482 == null) {
                     var6 = 8;
                  } else if (this.field6470 * -1069537770 == 0) {
                     var6 = 1;
                  }

                  if (var6 > 0) {
                     int var7 = var6 - 1906998098 * this.field6469.field6955;
                     if (var7 > var22) {
                        var7 = var22;
                     }

                     this.field6483.vmethod594(this.field6469.field6954, 1157174517 * this.field6469.field6955, var7, -1091199615);
                     if (this.field6475 != 0) {
                        for (int var8 = 0; var8 < var7; var8++) {
                           this.field6469.field6954[var8 + this.field6469.field6955 * 702114061] = (byte)(
                              this.field6469.field6954[var8 + this.field6469.field6955 * 702114061] ^ this.field6475
                           );
                        }
                     }

                     this.field6469.field6955 += -1095856699 * var7;
                     if (this.field6469.field6955 * -1700398509 < var6) {
                        break;
                     }

                     if (this.field6482 == null) {
                        this.field6469.field6955 = 0;
                        int var24 = classXY.method13039(this.field6469, -346779531);
                        int var9 = classXY.method13047(this.field6469, -164294556);
                        int var10 = classXY.method13039(this.field6469, -346779531);
                        int var11 = this.field6469.method13056((byte)1);
                        long var12 = var9 + (var24 << 16);
                        classUC var14 = (classUC)this.field6474.method13363(var12);
                        this.field6486 = true;
                        if (null == var14) {
                           var14 = (classUC)this.field6476.method13363(var12);
                           this.field6486 = false;
                        }

                        if (var14 == null) {
                           throw new IOException();
                        }

                        int var15 = var10 == 0 ? 5 : 9;
                        this.field6482 = var14;
                        this.field6484 = new classXY(this.field6482.field6284 + var11 + var15);
                        classXY.method12971(this.field6484, var10, (byte)-83);
                        this.field6484.method12979(var11, 1123491697);
                        this.field6470 = 1904163848;
                        this.field6469.field6955 = 0;
                     } else if (this.field6470 * 837988149 == 0) {
                        if (-1 == this.field6469.field6954[0]) {
                           this.field6470 = 578652390;
                           this.field6469.field6955 = 0;
                        } else {
                           this.field6482 = null;
                        }
                     }
                  } else {
                     int var23 = this.field6484.field6954.length - this.field6482.field6284;
                     int var25 = 512 - 1179146369 * this.field6470;
                     if (var25 > var23 - 702114061 * this.field6484.field6955) {
                        var25 = var23 - 702114061 * this.field6484.field6955;
                     }

                     if (var25 > var22) {
                        var25 = var22;
                     }

                     this.field6483.vmethod594(this.field6484.field6954, -767806793 * this.field6484.field6955, var25, -517025738);
                     if (this.field6475 != 0) {
                        for (int var26 = 0; var26 < var25; var26++) {
                           this.field6484.field6954[var26 + this.field6484.field6955 * 1030752612] = (byte)(
                              this.field6484.field6954[var26 + this.field6484.field6955 * 1030752612] ^ this.field6475
                           );
                        }
                     }

                     this.field6484.field6955 += -1095856699 * var25;
                     this.field6470 += var25 * 238020481;
                     if (var23 == this.field6484.field6955 * -653709882) {
                        if (this.field6482.field6552 == 16711935L) {
                           this.field6485 = this.field6484;

                           for (int var28 = 0; var28 < 256; var28++) {
                              classVP var29 = this.field6460[var28];
                              if (var29 != null) {
                                 this.method11904(var29, var28, -1315156953);
                              }
                           }
                        } else {
                           this.field6471.reset();
                           this.field6471.update(this.field6484.field6954, 0, var23);
                           int var27 = (int)this.field6471.getValue();
                           if (942386925 * this.field6482.field6285 != var27) {
                              try {
                                 this.field6483.vmethod604(1271658352);
                              } catch (Exception var17) {
                              }

                              this.field6458 += 410008609;
                              this.field6483 = null;
                              this.field6475 = (byte)(Math.random() * 255.0 + 1.0);
                              return false;
                           }

                           this.field6458 = 0;
                           this.field6463 = 0;
                           this.field6482
                              .field6286
                              .method12033(
                                 (int)(this.field6482.field6552 & 65535L),
                                 this.field6484.field6954,
                                 16711680L == (this.field6482.field6552 & 16711680L),
                                 this.field6486,
                                 1987387280
                              );
                        }

                        this.field6482.vmethod398();
                        if (this.field6486) {
                           this.field6472 -= -1367809581;
                        } else {
                           this.field6468 -= -613532315;
                        }

                        this.field6470 = 0;
                        this.field6482 = null;
                        this.field6484 = null;
                     } else {
                        if (-1587879898 * this.field6470 != 2036818886) {
                           break;
                        }

                        this.field6470 = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var18) {
            try {
               this.field6483.vmethod604(1271658352);
            } catch (Exception var16) {
            }

            this.field6463 += 1287164533;
            this.field6483 = null;
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aj")
   public boolean method11885() {
      long var1 = classDD.method2983(16711680);
      int var3 = (int)(var1 - this.field6481 * -2021231288791816661L);
      this.field6481 = -8371170626432079741L * var1;
      if (var3 > 200) {
         var3 = 200;
      }

      this.field6459 += 1543721085 * var3;
      if (-1735349139 * this.field6468 == 0 && this.field6472 * 403165785 == 0 && 136778065 * this.field6467 == 0 && -1026186423 * this.field6462 == 0) {
         return true;
      } else if (this.field6483 == null) {
         return false;
      } else {
         try {
            if (-841176875 * this.field6459 > 30000) {
               throw new IOException();
            } else {
               while (403165785 * this.field6472 < 200 && this.field6462 * -1026186423 > 0) {
                  classUC var4 = (classUC)this.field6466.method13375();
                  classXY var5 = new classXY(4);
                  classXY.method12971(var5, 1, (byte)-30);
                  classXY.method12978(var5, (int)var4.field6552, (byte)-89);
                  this.field6483.vmethod597(var5.field6954, 0, 4, -1032071721);
                  this.field6474.method13372(var4, var4.field6552);
                  this.field6462 -= 1927593721;
                  this.field6472 += 588928489;
               }

               while (-1735349139 * this.field6468 < 200 && 136778065 * this.field6467 > 0) {
                  classUC var19 = (classUC)this.field6464.method7847();
                  classXY var21 = new classXY(4);
                  classXY.method12971(var21, 0, (byte)-40);
                  classXY.method12978(var21, (int)var19.field6552, (byte)-71);
                  this.field6483.vmethod597(var21.field6954, 0, 4, -1032071721);
                  var19.method11958();
                  this.field6476.method13372(var19, var19.field6552);
                  this.field6467 -= -1982670927;
                  this.field6468 += -613532315;
               }

               for (int var20 = 0; var20 < 100; var20++) {
                  int var22 = this.field6483.vmethod586(1549380113);
                  if (var22 < 0) {
                     throw new IOException();
                  }

                  if (var22 == 0) {
                     break;
                  }

                  this.field6459 = 0;
                  byte var6 = 0;
                  if (this.field6482 == null) {
                     var6 = 8;
                  } else if (this.field6470 * 1179146369 == 0) {
                     var6 = 1;
                  }

                  if (var6 > 0) {
                     int var7 = var6 - 702114061 * this.field6469.field6955;
                     if (var7 > var22) {
                        var7 = var22;
                     }

                     this.field6483.vmethod594(this.field6469.field6954, 702114061 * this.field6469.field6955, var7, -1589225241);
                     if (this.field6475 != 0) {
                        for (int var8 = 0; var8 < var7; var8++) {
                           this.field6469.field6954[var8 + this.field6469.field6955 * 702114061] = (byte)(
                              this.field6469.field6954[var8 + this.field6469.field6955 * 702114061] ^ this.field6475
                           );
                        }
                     }

                     this.field6469.field6955 += -1095856699 * var7;
                     if (this.field6469.field6955 * 702114061 < var6) {
                        break;
                     }

                     if (this.field6482 == null) {
                        this.field6469.field6955 = 0;
                        int var24 = classXY.method13039(this.field6469, -346779531);
                        int var9 = classXY.method13047(this.field6469, -1292398901);
                        int var10 = classXY.method13039(this.field6469, -346779531);
                        int var11 = this.field6469.method13056((byte)1);
                        long var12 = var9 + (var24 << 16);
                        classUC var14 = (classUC)this.field6474.method13363(var12);
                        this.field6486 = true;
                        if (null == var14) {
                           var14 = (classUC)this.field6476.method13363(var12);
                           this.field6486 = false;
                        }

                        if (var14 == null) {
                           throw new IOException();
                        }

                        int var15 = var10 == 0 ? 5 : 9;
                        this.field6482 = var14;
                        this.field6484 = new classXY(this.field6482.field6284 + var11 + var15);
                        classXY.method12971(this.field6484, var10, (byte)-16);
                        this.field6484.method12979(var11, -660276422);
                        this.field6470 = 1904163848;
                        this.field6469.field6955 = 0;
                     } else if (this.field6470 * 1179146369 == 0) {
                        if (-1 == this.field6469.field6954[0]) {
                           this.field6470 = 238020481;
                           this.field6469.field6955 = 0;
                        } else {
                           this.field6482 = null;
                        }
                     }
                  } else {
                     int var23 = this.field6484.field6954.length - this.field6482.field6284;
                     int var25 = 512 - 1179146369 * this.field6470;
                     if (var25 > var23 - 702114061 * this.field6484.field6955) {
                        var25 = var23 - 702114061 * this.field6484.field6955;
                     }

                     if (var25 > var22) {
                        var25 = var22;
                     }

                     this.field6483.vmethod594(this.field6484.field6954, 702114061 * this.field6484.field6955, var25, -77781758);
                     if (this.field6475 != 0) {
                        for (int var26 = 0; var26 < var25; var26++) {
                           this.field6484.field6954[var26 + this.field6484.field6955 * 702114061] = (byte)(
                              this.field6484.field6954[var26 + this.field6484.field6955 * 702114061] ^ this.field6475
                           );
                        }
                     }

                     this.field6484.field6955 += -1095856699 * var25;
                     this.field6470 += var25 * 238020481;
                     if (var23 == this.field6484.field6955 * 702114061) {
                        if (this.field6482.field6552 == 16711935L) {
                           this.field6485 = this.field6484;

                           for (int var28 = 0; var28 < 256; var28++) {
                              classVP var29 = this.field6460[var28];
                              if (var29 != null) {
                                 this.method11904(var29, var28, -1315156953);
                              }
                           }
                        } else {
                           this.field6471.reset();
                           this.field6471.update(this.field6484.field6954, 0, var23);
                           int var27 = (int)this.field6471.getValue();
                           if (942386925 * this.field6482.field6285 != var27) {
                              try {
                                 this.field6483.vmethod604(1271658352);
                              } catch (Exception var17) {
                              }

                              this.field6458 += 410008609;
                              this.field6483 = null;
                              this.field6475 = (byte)(Math.random() * 255.0 + 1.0);
                              return false;
                           }

                           this.field6458 = 0;
                           this.field6463 = 0;
                           this.field6482
                              .field6286
                              .method12033(
                                 (int)(this.field6482.field6552 & 65535L),
                                 this.field6484.field6954,
                                 16711680L == (this.field6482.field6552 & 16711680L),
                                 this.field6486,
                                 304402131
                              );
                        }

                        this.field6482.vmethod398();
                        if (this.field6486) {
                           this.field6472 -= 588928489;
                        } else {
                           this.field6468 -= -613532315;
                        }

                        this.field6470 = 0;
                        this.field6482 = null;
                        this.field6484 = null;
                     } else {
                        if (1179146369 * this.field6470 != 512) {
                           break;
                        }

                        this.field6470 = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var18) {
            try {
               this.field6483.vmethod604(1271658352);
            } catch (Exception var16) {
            }

            this.field6463 += 1287164533;
            this.field6483 = null;
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Luk;Z)V")
   @ObfuscatedName("ar")
   public void method11894(classUK var1, boolean var2) {
      if (this.field6483 != null) {
         try {
            this.field6483.vmethod604(1271658352);
         } catch (Exception var7) {
         }

         this.field6483 = null;
      }

      this.field6483 = var1;
      this.method11887(var2, 116730183);
      this.field6469.field6955 = 0;
      this.field6482 = null;
      this.field6484 = null;
      this.field6470 = 0;

      while (true) {
         classUC var3 = (classUC)this.field6474.method13375();
         if (null == var3) {
            while (true) {
               var3 = (classUC)this.field6476.method13375();
               if (var3 == null) {
                  if (0 != this.field6475) {
                     try {
                        classXY var9 = new classXY(4);
                        classXY.method12971(var9, 4, (byte)-94);
                        classXY.method12971(var9, this.field6475, (byte)-91);
                        var9.method12973(0, -1542382992);
                        this.field6483.vmethod597(var9.field6954, 0, 4, -1032071721);
                     } catch (IOException var6) {
                        try {
                           this.field6483.vmethod604(1271658352);
                        } catch (Exception var5) {
                        }

                        this.field6463 += 1287164533;
                        this.field6483 = null;
                     }
                  }

                  this.field6459 = 0;
                  this.field6481 = classDD.method2983(16711680) * -8371170626432079741L;
                  return;
               }

               this.field6464.method7844(var3);
               this.field6465.method13372(var3, var3.field6552);
               this.field6467 += -1355418419;
               this.field6468 -= -613532315;
            }
         }

         this.field6466.method13372(var3, var3.field6552);
         this.field6462 += 1927593721;
         this.field6472 -= 588928489;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ap")
   public void method11889(boolean var1) {
      if (null != this.field6483) {
         try {
            classXY var2 = new classXY(4);
            classXY.method12971(var2, var1 ? 2 : 3, (byte)-8);
            classXY.method12978(var2, 0, (byte)-1);
            this.field6483.vmethod597(var2.field6954, 0, 4, -1032071721);
         } catch (IOException var5) {
            try {
               this.field6483.vmethod604(1271658352);
            } catch (Exception var4) {
            }

            this.field6463 += 1473817497;
            this.field6483 = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvb;Lvp;IIIBZI)V")
   @ObfuscatedName("tp")
   public static void method11921(classVB var0, classVP var1, int var2, int var3, int var4, byte var5, boolean var6, int var7) {
      if (var0 == null) {
         var0.method11922(var1, var2, var2, var2, var5, var6, var2);
      } else {
         synchronized (var0) {
            boolean var16 = var6;
            byte var15 = var5;
            int var14 = var4;
            int var13 = var3;
            int var12 = var2;
            classVP var11 = var1;
            classVB var10 = var0;
            int var17 = -1339715056;

            try {
               long var18 = var13 + (var12 << 16);
               classUC var20 = (classUC)var10.field6466.method13363(var18);
               if (null != var20) {
                  if (var17 >= -348944607) {
                     throw new IllegalStateException();
                  }
               } else {
                  var20 = (classUC)var10.field6474.method13363(var18);
                  if (var20 != null) {
                     if (var17 >= -348944607) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var20 = (classUC)var10.field6465.method13363(var18);
                     if (var20 != null) {
                        if (var17 >= -348944607) {
                           throw new IllegalStateException();
                        }

                        if (var16) {
                           if (var17 >= -348944607) {
                              throw new IllegalStateException();
                           }

                           var20.method11958();
                           var10.field6466.method13372(var20, var18);
                           var10.field6467 -= -1982670927;
                           var10.field6462 += 1927593721;
                        }
                     } else {
                        if (!var16) {
                           var20 = (classUC)var10.field6476.method13363(var18);
                           if (var20 != null) {
                              if (var17 >= -348944607) {
                                 throw new IllegalStateException();
                              }

                              return;
                           }
                        }

                        var20 = new classUC();
                        var20.field6286 = var11;
                        var20.field6285 = var14 * -641212699;
                        var20.field6284 = var15;
                        if (var16) {
                           if (var17 >= -348944607) {
                              throw new IllegalStateException();
                           }

                           var10.field6466.method13372(var20, var18);
                           var10.field6462 += 1927593721;
                        } else {
                           var10.field6464.method7842(var20);
                           var10.field6465.method13372(var20, var18);
                           var10.field6467 += -1982670927;
                        }
                     }
                  }
               }
            } catch (RuntimeException var21) {
               throw classEG.method3884(var21, "vb.as(" + ')');
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvp;IIIBZ)V")
   @ObfuscatedName("ah")
   void method11905(classVP var1, int var2, int var3, int var4, byte var5, boolean var6) {
      long var7 = var3 + (var2 << 16);
      classUC var9 = (classUC)this.field6466.method13363(var7);
      if (null == var9) {
         var9 = (classUC)this.field6474.method13363(var7);
         if (var9 == null) {
            var9 = (classUC)this.field6465.method13363(var7);
            if (var9 != null) {
               if (var6) {
                  var9.method11958();
                  this.field6466.method13372(var9, var7);
                  this.field6467 -= 725535685;
                  this.field6462 += 1832565679;
               }
            } else {
               if (!var6) {
                  var9 = (classUC)this.field6476.method13363(var7);
                  if (var9 != null) {
                     return;
                  }
               }

               var9 = new classUC();
               var9.field6286 = var1;
               var9.field6285 = var4 * -641212699;
               var9.field6284 = var5;
               if (var6) {
                  this.field6466.method13372(var9, var7);
                  this.field6462 += 1927593721;
               } else {
                  this.field6464.method7842(var9);
                  this.field6465.method13372(var9, var7);
                  this.field6467 += 1956289536;
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgx;)I")
   @ObfuscatedName("no")
   public static int method11886(WorldMapArea var0) {
      return 364261001 * var0.field2731;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("aq")
   public void method11890(boolean var1) {
      if (null != this.field6483) {
         try {
            classXY var2 = new classXY(4);
            classXY.method12971(var2, var1 ? 2 : 3, (byte)-43);
            classXY.method12978(var2, 0, (byte)-63);
            this.field6483.vmethod597(var2.field6954, 0, 4, -1032071721);
         } catch (IOException var5) {
            try {
               this.field6483.vmethod604(1271658352);
            } catch (Exception var4) {
            }

            this.field6463 += 1287164533;
            this.field6483 = null;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvb;Z)V")
   @ObfuscatedName("yc")
   public static void method11891(classVB var0, boolean var1) {
      if (var0 == null) {
         var0.method11885();
      }

      if (null != var0.field6483) {
         try {
            classXY var2 = new classXY(4);
            classXY.method12971(var2, var1 ? 2 : 3, (byte)-102);
            classXY.method12978(var2, 0, (byte)-104);
            var0.field6483.vmethod597(var2.field6954, 0, 4, -1032071721);
         } catch (IOException var5) {
            try {
               var0.field6483.vmethod604(1271658352);
            } catch (Exception var4) {
            }

            var0.field6463 += 1287164533;
            var0.field6483 = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvb;I)V")
   @ObfuscatedName("ws")
   public static void method11916(classVB var0, int var1) {
      if (var0 == null) {
         var0.method11917(var1);
      }

      try {
         if (var0.field6483 != null) {
            try {
               var0.field6483.vmethod604(1271658352);
            } catch (Exception var3) {
            }

            var0.field6483 = null;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "vb.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvp;I)V")
   @ObfuscatedName("at")
   void method11899(classVP var1, int var2) {
      if (var1.field6537) {
         if (!var1.field6536) {
            if (var2 <= -592576429 * this.field6461) {
               throw new RuntimeException("");
            }

            if (var2 < this.field6473 * -1396095293) {
               this.field6473 = var2 * 271653355;
            }
         }
      } else {
         if (var2 >= -1396095293 * this.field6473) {
            throw new RuntimeException("");
         }

         if (var2 > -592576429 * this.field6461) {
            this.field6461 = var2 * 1018184667;
         }
      }

      if (null != this.field6485) {
         this.method11904(var1, var2, -1315156953);
      } else {
         method11921(this, null, classUM.field6329.field6328 * 1060637953, 255, 0, (byte)0, true, -1657216815);
         this.field6460[var2] = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvp;I)V")
   @ObfuscatedName("an")
   void method11902(classVP var1, int var2) {
      int var3 = var2 * 8 + 5;
      int var4 = 0;
      int var5 = 0;
      if (var3 <= this.field6485.field6954.length - 8) {
         this.field6485.field6955 = var3 * -1095856699;
         var4 = this.field6485.method13056((byte)1);
         var5 = this.field6485.method13056((byte)1);
      }

      if (var4 != 0 || var5 != 0) {
         var1.method12028(var4, var5, -1764789811);
      } else if (var1.field6537) {
         var1.method12026((byte)-112);
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(Luk;Z)V")
   @ObfuscatedName("ai")
   public void method11895(classUK var1, boolean var2) {
      if (this.field6483 != null) {
         try {
            this.field6483.vmethod604(1271658352);
         } catch (Exception var7) {
         }

         this.field6483 = null;
      }

      this.field6483 = var1;
      this.method11887(var2, 116730183);
      this.field6469.field6955 = 0;
      this.field6482 = null;
      this.field6484 = null;
      this.field6470 = 0;

      while (true) {
         classUC var3 = (classUC)this.field6474.method13375();
         if (null == var3) {
            while (true) {
               var3 = (classUC)this.field6476.method13375();
               if (var3 == null) {
                  if (0 != this.field6475) {
                     try {
                        classXY var9 = new classXY(4);
                        classXY.method12971(var9, 4, (byte)-111);
                        classXY.method12971(var9, this.field6475, (byte)-126);
                        var9.method12973(0, -1542382992);
                        this.field6483.vmethod597(var9.field6954, 0, 4, -1032071721);
                     } catch (IOException var6) {
                        try {
                           this.field6483.vmethod604(1271658352);
                        } catch (Exception var5) {
                        }

                        this.field6463 += 1287164533;
                        this.field6483 = null;
                     }
                  }

                  this.field6459 = 0;
                  this.field6481 = classDD.method2983(16711680) * -8371170626432079741L;
                  return;
               }

               this.field6464.method7844(var3);
               this.field6465.method13372(var3, var3.field6552);
               this.field6467 += -1982670927;
               this.field6468 -= -19698770;
            }
         }

         this.field6466.method13372(var3, var3.field6552);
         this.field6462 += 1238289164;
         this.field6472 -= 588928489;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvb;ZZI)I")
   @ObfuscatedName("ca")
   public static int method11913(classVB var0, boolean var1, boolean var2, int var3) {
      if (var0 == null) {
         return var0.method11915(var1, var1, var3);
      } else {
         try {
            int var4 = 0;
            if (var1) {
               if (var3 >= 705564706) {
                  throw new IllegalStateException();
               }

               var4 += var0.field6462 * -1026186423 + var0.field6472 * 403165785;
            }

            if (var2) {
               if (var3 >= 705564706) {
                  throw new IllegalStateException();
               }

               var4 += var0.field6468 * -1735349139 + var0.field6467 * 136778065;
            }

            return var4;
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "vb.aa(" + 41);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvb;Z)V")
   @ObfuscatedName("gz")
   public static void method11892(classVB var0, boolean var1) {
      if (null != var0.field6483) {
         try {
            classXY var2 = new classXY(4);
            classXY.method12971(var2, var1 ? 2 : 3, (byte)-8);
            classXY.method12978(var2, 0, (byte)-9);
            var0.field6483.vmethod597(var2.field6954, 0, 4, -1032071721);
         } catch (IOException var5) {
            try {
               var0.field6483.vmethod604(1271658352);
            } catch (Exception var4) {
            }

            var0.field6463 += 1287164533;
            var0.field6483 = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvp;IIIBZ)V")
   @ObfuscatedName("bn")
   void method11906(classVP var1, int var2, int var3, int var4, byte var5, boolean var6) {
      long var7 = var3 + (var2 << 16);
      classUC var9 = (classUC)this.field6466.method13363(var7);
      if (null == var9) {
         var9 = (classUC)this.field6474.method13363(var7);
         if (var9 == null) {
            var9 = (classUC)this.field6465.method13363(var7);
            if (var9 != null) {
               if (var6) {
                  var9.method11958();
                  this.field6466.method13372(var9, var7);
                  this.field6467 -= -1982670927;
                  this.field6462 += 1927593721;
               }
            } else {
               if (!var6) {
                  var9 = (classUC)this.field6476.method13363(var7);
                  if (var9 != null) {
                     return;
                  }
               }

               var9 = new classUC();
               var9.field6286 = var1;
               var9.field6285 = var4 * -641212699;
               var9.field6284 = var5;
               if (var6) {
                  this.field6466.method13372(var9, var7);
                  this.field6462 += 1927593721;
               } else {
                  this.field6464.method7842(var9);
                  this.field6465.method13372(var9, var7);
                  this.field6467 += -1661251049;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ac")
   int method11911(int var1, int var2, int var3) {
      try {
         long var4 = var2 + (var1 << 16);
         if (this.field6482 != null) {
            if (var3 != -1779850424) {
               throw new IllegalStateException();
            }

            if (this.field6482.field6552 == var4) {
               return 1 + 789815303 * this.field6484.field6955 / (this.field6484.field6954.length - this.field6482.field6284);
            }

            if (var3 != -1779850424) {
               throw new IllegalStateException();
            }
         }

         return 0;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "vb.ac(" + 41);
      }
   }

   public classVB() {
      this.field6463 = 0;
      this.field6459 = 0;
      this.field6466 = new NodeHashTable(4096);
      this.field6462 = 0;
      this.field6474 = new NodeHashTable(32);
      this.field6472 = 0;
      this.field6464 = new classNH();
      this.field6465 = new NodeHashTable(4096);
      this.field6467 = 0;
      this.field6476 = new NodeHashTable(4096);
      this.field6468 = 0;
      this.field6469 = new classXY(8);
      this.field6470 = 0;
      this.field6471 = new CRC32();
      this.field6460 = new classVP[256];
      this.field6461 = -1018184667;
      this.field6473 = 552128789;
      this.field6475 = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvb;Lvp;I)V")
   @ObfuscatedName("lq")
   public static void method11903(classVB var0, classVP var1, int var2) {
      if (var0 == null) {
         var0.method11885();
      }

      int var3 = var2 * 8 + 5;
      int var4 = 0;
      int var5 = 0;
      if (var3 <= var0.field6485.field6954.length - 8) {
         var0.field6485.field6955 = var3 * -1095856699;
         var4 = var0.field6485.method13056((byte)1);
         var5 = var0.field6485.method13056((byte)1);
      }

      if (var4 != 0 || var5 != 0) {
         var1.method12028(var4, var5, -1479090900);
      } else if (var1.field6537) {
         var1.method12026((byte)32);
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("br")
   int method11912(int var1, int var2) {
      long var3 = var2 + (var1 << 16);
      return this.field6482 != null && this.field6482.field6552 == var3
         ? 1 + 789815303 * this.field6484.field6955 / (this.field6484.field6954.length - this.field6482.field6284)
         : 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvb;Lvp;I)V")
   @ObfuscatedName("mi")
   public static void method11900(classVB var0, classVP var1, int var2) {
      if (var0 == null) {
         var0.method11899(var1, var2);
      }

      if (var1.field6537) {
         if (!var1.field6536) {
            if (var2 <= -592576429 * var0.field6461) {
               throw new RuntimeException("");
            }

            if (var2 < var0.field6473 * -1396095293) {
               var0.field6473 = var2 * 271653355;
            }
         }
      } else {
         if (var2 >= -1396095293 * var0.field6473) {
            throw new RuntimeException("");
         }

         if (var2 > -592576429 * var0.field6461) {
            var0.field6461 = var2 * 1018184667;
         }
      }

      if (null != var0.field6485) {
         var0.method11904(var1, var2, -1315156953);
      } else {
         method11921(var0, null, classUM.field6329.field6328 * 1060637953, 255, 0, (byte)0, true, -780718239);
         var0.field6460[var2] = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvp;II)V")
   @ObfuscatedName("ag")
   void method11904(classVP var1, int var2, int var3) {
      try {
         int var4 = var2 * 8 + 5;
         int var5 = 0;
         int var6 = 0;
         if (var4 <= this.field6485.field6954.length - 8) {
            if (var3 != -1315156953) {
               throw new IllegalStateException();
            }

            this.field6485.field6955 = var4 * -1095856699;
            var5 = this.field6485.method13056((byte)1);
            var6 = this.field6485.method13056((byte)1);
         }

         if (var5 == 0) {
            if (var3 != -1315156953) {
               return;
            }

            if (var6 == 0) {
               if (var3 != -1315156953) {
                  throw new IllegalStateException();
               }

               if (var1.field6537) {
                  if (var3 != -1315156953) {
                     throw new IllegalStateException();
                  }

                  var1.method12026((byte)-17);
                  return;
               }

               throw new RuntimeException("");
            }
         }

         var1.method12028(var5, var6, -1351126215);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "vb.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvb;IIB)V")
   @ObfuscatedName("zi")
   public static void method11919(classVB var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         var0.method11920(var1, var1, var3);
      } else {
         synchronized (var0) {
            int var8 = var2;
            int var7 = var1;
            classVB var6 = var0;
            boolean var9 = true;

            try {
               long var10 = (var7 << 16) + var8;
               classUC var12 = (classUC)var6.field6465.method13363(var10);
               if (null == var12) {
                  if (!var9) {
                     throw new IllegalStateException();
                  }
               } else {
                  var6.field6464.method7844(var12);
               }
            } catch (RuntimeException var13) {
               throw classEG.method3884(var13, "vb.ax(" + ')');
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZ)I")
   @ObfuscatedName("bm")
   public int method11914(boolean var1, boolean var2) {
      int var3 = 0;
      if (var1) {
         var3 += this.field6462 * -1026186423 + this.field6472 * 403165785;
      }

      if (var2) {
         var3 += this.field6468 * -1735349139 + this.field6467 * 136778065;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(ZZI)I")
   @ObfuscatedName("aa")
   public int method11915(boolean var1, boolean var2, int var3) {
      try {
         int var4 = 0;
         if (var1) {
            if (var3 >= 705564706) {
               throw new IllegalStateException();
            }

            var4 += this.field6467 * -1026186423 + this.field6459 * 403165785;
         }

         if (var2) {
            if (var3 >= 705564706) {
               throw new IllegalStateException();
            }

            var4 += this.field6459 * -1735349139 + this.field6472 * 136778065;
         }

         return var4;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "vb.aa(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvp;IIIBZI)V")
   @ObfuscatedName("as")
   void method11922(classVP var1, int var2, int var3, int var4, byte var5, boolean var6, int var7) {
      synchronized (this) {
         boolean var16 = var6;
         byte var15 = var5;
         int var14 = var4;
         int var13 = var3;
         int var12 = var2;
         classVP var11 = var1;
         classVB var10 = this;
         int var17 = -1339715056;

         try {
            long var18 = var13 + (var12 << 16);
            classUC var20 = (classUC)var10.field6476.method13363(var18);
            if (null != var20) {
               if (var17 >= -348944607) {
                  throw new IllegalStateException();
               }
            } else {
               var20 = (classUC)var10.field6476.method13365(var18);
               if (var20 != null) {
                  if (var17 >= -348944607) {
                     throw new IllegalStateException();
                  }
               } else {
                  var20 = (classUC)var10.field6474.method13383(var18);
                  if (var20 != null) {
                     if (var17 >= -348944607) {
                        throw new IllegalStateException();
                     }

                     if (var16) {
                        if (var17 >= -348944607) {
                           throw new IllegalStateException();
                        }

                        var20.method11963();
                        var10.field6466.method13372(var20, var18);
                        var10.field6473 = var10.field6462 - -1982670927;
                        var10.field6459 = var10.field6462 + 1927593721;
                     }
                  } else {
                     if (!var16) {
                        var20 = (classUC)var10.field6466.method13363(var18);
                        if (var20 != null) {
                           if (var17 >= -348944607) {
                              throw new IllegalStateException();
                           }

                           return;
                        }
                     }

                     var20 = new classUC();
                     var20.field6286 = var11;
                     var20.field6285 = var14 * -641212699;
                     var20.field6284 = var15;
                     if (var16) {
                        if (var17 >= -348944607) {
                           throw new IllegalStateException();
                        }

                        var10.field6465.method13372(var20, var18);
                        var10.field6461 = var10.field6472 + 1927593721;
                     } else {
                        var10.field6464.method7846(var20);
                        var10.field6466.method13384(var20, var18);
                        var10.field6462 = var10.field6459 + -1982670927;
                     }
                  }
               }
            }
         } catch (RuntimeException var21) {
            throw classEG.method3884(var21, "vb.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("ax")
   void method11920(int var1, int var2, byte var3) {
      synchronized (this) {
         int var8 = var2;
         int var7 = var1;
         classVB var6 = this;
         boolean var9 = true;

         try {
            long var10 = (var7 << 16) + var8;
            classUC var12 = (classUC)var6.field6466.method13383(var10);
            if (null == var12) {
               if (!var9) {
                  throw new IllegalStateException();
               }
            } else {
               var6.field6464.method7846(var12);
            }
         } catch (RuntimeException var13) {
            throw classEG.method3884(var13, "vb.ax(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ao")
   public void method11917(int var1) {
      try {
         if (this.field6483 != null) {
            try {
               this.field6483.vmethod604(1271658352);
            } catch (Exception var3) {
            }

            this.field6483 = null;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "vb.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Luk;ZI)V")
   @ObfuscatedName("ae")
   public void method11896(classUK var1, boolean var2, int var3) {
      try {
         if (this.field6483 != null) {
            try {
               this.field6483.vmethod604(1271658352);
            } catch (Exception var8) {
            }

            this.field6483 = null;
         }

         this.field6483 = var1;
         this.method11887(var2, 116730183);
         this.field6485.field6955 = 0;
         this.field6482 = null;
         this.field6485 = null;
         this.field6462 = 0;

         while (true) {
            classUC var4 = (classUC)this.field6474.method13378();
            if (null == var4) {
               while (true) {
                  var4 = (classUC)this.field6474.method13380();
                  if (var4 == null) {
                     if (var3 != 1967420579) {
                        return;
                     } else {
                        if (0 != this.field6475) {
                           try {
                              classXY var11 = new classXY(4);
                              classXY.method12971(var11, 4, (byte)-97);
                              classXY.method12971(var11, this.field6475, (byte)-78);
                              var11.method13232(0, -1542382992);
                              this.field6483.vmethod597(var11.field6954, 0, 4, -1032071721);
                           } catch (IOException var7) {
                              try {
                                 this.field6483.vmethod604(1271658352);
                              } catch (Exception var6) {
                              }

                              this.field6458 += 1287164533;
                              this.field6483 = null;
                           }
                        }

                        this.field6468 = 0;
                        this.field6481 = classDD.method2983(16711680) * -8371170626432079741L;
                        return;
                     }
                  }

                  this.field6464.method7845(var4);
                  this.field6465.method13372(var4, var4.field6552);
                  this.field6467 = this.field6459 + -1982670927;
                  this.field6462 = this.field6472 - -613532315;
               }
            }

            this.field6474.method13372(var4, var4.field6552);
            this.field6473 = this.field6461 + 1927593721;
            this.field6468 = this.field6462 - 588928489;
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "vb.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bx")
   void method11910(int var1, int var2) {
      long var3 = (var1 << 16) + var2;
      classUC var5 = (classUC)this.field6466.method13363(var3);
      if (null != var5) {
         this.field6464.method7846(var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvp;IIIBZ)V")
   @ObfuscatedName("vo")
   public void method11923(classVP var1, int var2, int var3, int var4, byte var5, boolean var6) {
      method11921(this, var1, var2, var3, var4, var5, var6, -1339715056);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvb;Lvp;I)V")
   @ObfuscatedName("zc")
   public static void method11901(classVB var0, classVP var1, int var2) {
      if (var0 == null) {
         var0.method11912(var2, var2);
      }

      if (var1.field6537) {
         if (!var1.field6536) {
            if (var2 <= -592576429 * var0.field6461) {
               throw new RuntimeException("");
            }

            if (var2 < var0.field6473 * -1396095293) {
               var0.field6473 = var2 * 271653355;
            }
         }
      } else {
         if (var2 >= -1396095293 * var0.field6473) {
            throw new RuntimeException("");
         }

         if (var2 > -592576429 * var0.field6461) {
            var0.field6461 = var2 * 1018184667;
         }
      }

      if (null != var0.field6485) {
         var0.method11904(var1, var2, -1315156953);
      } else {
         method11921(var0, null, classUM.field6329.field6328 * 1060637953, 255, 0, (byte)0, true, -1976269501);
         var0.field6460[var2] = var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bt")
   public void method11918() {
      if (this.field6483 != null) {
         try {
            this.field6483.vmethod604(1271658352);
         } catch (Exception var2) {
         }

         this.field6483 = null;
      }
   }
}
