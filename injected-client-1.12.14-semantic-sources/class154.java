import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fc")
public class class154 {
   @ObfuscatedName("ac")
   long field1760;
   @ObfuscatedSignature(descriptor = "Lrm;")
   @ObfuscatedName("ax")
   IterableNodeDeque field1748;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field1750 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field1752 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field1754 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field1757 = 10;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field1753 = 15;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field1756 = 8;
   @ObfuscatedName("ab")
   public int field1749 = 451172745;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field1751 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field1755 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   public static final int field1758 = 37;
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   static final int field1759 = 101;
   @ObfuscatedName("al")
   static int[] field1761;

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ae")
   public void method3955(ClanSettings var1) {
      if (-7482329250510979397L * var1.field2072 == -3197148537381341535L * this.field1760 && this.field1749 * 1683362631 == var1.field2062 * 2097966703) {
         for (classFM var2 = (classFM)this.field1748.method9642(); null != var2; var2 = (classFM)this.field1748.method9646()) {
            var2.vmethod185(var1, (byte)-107);
         }

         var1.field2062 += 2029957263;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;B)V")
   @ObfuscatedName("at")
   public void method3956(ClanSettings var1, byte var2) {
      try {
         if (-7482329250510979397L * var1.field2072 == -3197148537381341535L * this.field1760) {
            if (var2 == 14) {
               throw new IllegalStateException();
            }

            if (this.field1749 * 1683362631 == var1.field2062 * 2097966703) {
               for (classFM var3 = (classFM)this.field1748.method9642(); null != var3; var3 = (classFM)this.field1748.method9646()) {
                  if (var2 == 14) {
                     throw new IllegalStateException();
                  }

                  var3.vmethod185(var1, (byte)-98);
               }

               var1.field2062 += 2029957263;
               return;
            }

            if (var2 == 14) {
               return;
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "fc.at(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lad;)Z")
   @ObfuscatedName("pf")
   public static boolean method3960(SecureRandomSSLSocket var0) {
      if (var0 == null) {
         var0.method62();
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ag")
   public void method3957(ClanSettings var1) {
      if (-7482329250510979397L * var1.field2072 == -3197148537381341535L * this.field1760 && this.field1749 * -1077226241 == var1.field2062 * 224562563) {
         for (classFM var2 = (classFM)this.field1748.method9642(); null != var2; var2 = (classFM)this.field1748.method9646()) {
            var2.vmethod185(var1, (byte)-53);
         }

         var1.field2062 += 1987001659;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("an")
   public void method3958(ClanSettings var1) {
      if (-7482329250510979397L * var1.field2072 == -3197148537381341535L * this.field1760 && this.field1749 * 1683362631 == var1.field2062 * 2097966703) {
         for (classFM var2 = (classFM)this.field1748.method9642(); null != var2; var2 = (classFM)this.field1748.method9646()) {
            var2.vmethod185(var1, (byte)-93);
         }

         var1.field2062 += 2029957263;
      } else {
         throw new RuntimeException("");
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfc;Lgs;)V")
   @ObfuscatedName("fq")
   public static void method3959(class154 var0, ClanSettings var1) {
      if (-7482329250510979397L * var1.field2072 == -3197148537381341535L * var0.field1760 && var0.field1749 * 1683362631 == var1.field2062 * 2097966703) {
         for (classFM var2 = (classFM)var0.field1748.method9642(); null != var2; var2 = (classFM)var0.field1748.method9646()) {
            var2.vmethod185(var1, (byte)-34);
         }

         var1.field2062 += 2029957263;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfc;Lxa;I)V")
   @ObfuscatedName("ad")
   public static void method3952(class154 var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method3953(var1, var2);
      }

      try {
         var0.field1760 = Buffer.method12018(var1, -2090912678) * -555177004113613471L;
         var0.field1749 = Buffer.method12015(var1, -496559568) * -451172745;

         for (int var3 = var1.readUnsignedByte(-624324960); var3 != 0; var3 = var1.readUnsignedByte(-1517486739)) {
            if (var2 >= -614038893) {
               return;
            }

            Object var4;
            if (3 == var3) {
               if (var2 >= -614038893) {
                  return;
               }

               var4 = new classGH(var0);
            } else if (1 == var3) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new LoginPacket(var0);
            } else if (13 == var3) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new class166(var0);
            } else if (var3 == 4) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new Sound(var0);
            } else if (6 == var3) {
               var4 = new class165(var0);
            } else if (5 == var3) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new class150(var0);
            } else if (2 == var3) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new classFR(var0);
            } else if (7 == var3) {
               var4 = new class148(var0);
            } else if (14 == var3) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new class152(var0);
            } else if (var3 == 8) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new classGW(var0);
            } else if (var3 == 9) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new class175(var0);
            } else if (10 == var3) {
               var4 = new class161(var0);
            } else if (var3 == 11) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new classGN(var0);
            } else if (var3 == 12) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new class160(var0);
            } else {
               if (15 != var3) {
                  throw new RuntimeException("");
               }

               if (var2 >= -614038893) {
                  return;
               }

               var4 = new classGB(var0);
            }

            ((classFM)var4).vmethod182(var1, (byte)-11);
            var0.field1748.addFirst((Node)var4);
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "fc.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([Lbn;II[I[IB)V")
   @ObfuscatedName("ag")
   static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4, byte var5) {
      try {
         if (var1 < var2) {
            int var6 = var1 - 1;
            int var7 = 1 + var2;
            int var8 = (var2 + var1) / 2;
            World var9 = var0[var8];
            var0[var8] = var0[var1];
            var0[var1] = var9;

            while (var6 < var7) {
               boolean var10 = true;

               do {
                  var7--;

                  for (int var11 = 0; var11 < 4; var11++) {
                     if (var5 >= 10) {
                        throw new IllegalStateException();
                     }

                     int var12;
                     int var13;
                     if (2 == var3[var11]) {
                        if (var5 >= 10) {
                           throw new IllegalStateException();
                        }

                        var12 = var0[var7].id * 1293839821;
                        var13 = 1293839821 * var9.id;
                     } else if (1 == var3[var11]) {
                        var12 = 2054822665 * var0[var7].properties;
                        var13 = 2054822665 * var9.properties;
                        if (var12 == -1) {
                           if (var5 >= 10) {
                              throw new IllegalStateException();
                           }

                           if (1 == var4[var11]) {
                              if (var5 >= 10) {
                                 throw new IllegalStateException();
                              }

                              var12 = 2001;
                           }
                        }

                        if (var13 == -1) {
                           if (var5 >= 10) {
                              return;
                           }

                           if (1 == var4[var11]) {
                              if (var5 >= 10) {
                                 throw new IllegalStateException();
                              }

                              var13 = 2001;
                           }
                        }
                     } else if (3 == var3[var11]) {
                        if (var5 >= 10) {
                           throw new IllegalStateException();
                        }

                        byte var10000;
                        if (var0[var7].isMembersOnly(-1061565744)) {
                           if (var5 >= 10) {
                              return;
                           }

                           var10000 = 1;
                        } else {
                           var10000 = 0;
                        }

                        var12 = var10000;
                        if (var9.isMembersOnly(-473934273)) {
                           if (var5 >= 10) {
                              return;
                           }

                           var10000 = 1;
                        } else {
                           var10000 = 0;
                        }

                        var13 = var10000;
                     } else {
                        var12 = 789563243 * var0[var7].population;
                        var13 = var9.population * 789563243;
                     }

                     if (var13 != var12) {
                        if (1 == var4[var11]) {
                           if (var5 >= 10) {
                              throw new IllegalStateException();
                           }

                           if (var12 > var13) {
                              break;
                           }
                        }

                        if (0 == var4[var11]) {
                           if (var5 >= 10) {
                              throw new IllegalStateException();
                           }

                           if (var12 < var13) {
                              if (var5 >= 10) {
                                 throw new IllegalStateException();
                              }
                              break;
                           }
                        }

                        var10 = false;
                        break;
                     }

                     if (var5 >= 10) {
                        throw new IllegalStateException();
                     }

                     if (var11 == 3) {
                        if (var5 >= 10) {
                           throw new IllegalStateException();
                        }

                        var10 = false;
                     }
                  }
               } while (var10);

               if (var5 >= 10) {
                  throw new IllegalStateException();
               }

               var10 = true;

               do {
                  var6++;

                  for (int var16 = 0; var16 < 4; var16++) {
                     if (var5 >= 10) {
                        throw new IllegalStateException();
                     }

                     int var18;
                     int var19;
                     if (var3[var16] == 2) {
                        if (var5 >= 10) {
                           return;
                        }

                        var18 = var0[var6].id * 1293839821;
                        var19 = 1293839821 * var9.id;
                     } else if (var3[var16] == 1) {
                        if (var5 >= 10) {
                           throw new IllegalStateException();
                        }

                        var18 = 2054822665 * var0[var6].properties;
                        var19 = 2054822665 * var9.properties;
                        if (var18 == -1) {
                           if (var5 >= 10) {
                              throw new IllegalStateException();
                           }

                           if (var4[var16] == 1) {
                              if (var5 >= 10) {
                                 return;
                              }

                              var18 = 2001;
                           }
                        }

                        if (var19 == -1) {
                           if (var5 >= 10) {
                              throw new IllegalStateException();
                           }

                           if (var4[var16] == 1) {
                              if (var5 >= 10) {
                                 return;
                              }

                              var19 = 2001;
                           }
                        }
                     } else if (var3[var16] == 3) {
                        if (var5 >= 10) {
                           throw new IllegalStateException();
                        }

                        byte var21;
                        if (var0[var6].isMembersOnly(-799058443)) {
                           if (var5 >= 10) {
                              return;
                           }

                           var21 = 1;
                        } else {
                           var21 = 0;
                        }

                        var18 = var21;
                        if (var9.isMembersOnly(-1648703969)) {
                           if (var5 >= 10) {
                              throw new IllegalStateException();
                           }

                           var21 = 1;
                        } else {
                           var21 = 0;
                        }

                        var19 = var21;
                     } else {
                        var18 = var0[var6].population * 789563243;
                        var19 = 789563243 * var9.population;
                     }

                     if (var19 != var18) {
                        if (var4[var16] == 1) {
                           if (var5 >= 10) {
                              return;
                           }

                           if (var18 < var19) {
                              if (var5 >= 10) {
                                 throw new IllegalStateException();
                              }
                              break;
                           }
                        }

                        if (var4[var16] == 0 && var18 > var19) {
                           if (var5 >= 10) {
                              return;
                           }
                           break;
                        }

                        var10 = false;
                        break;
                     }

                     if (var5 >= 10) {
                        throw new IllegalStateException();
                     }

                     if (3 == var16) {
                        var10 = false;
                     }
                  }
               } while (var10);

               if (var6 < var7) {
                  World var17 = var0[var6];
                  var0[var6] = var0[var7];
                  var0[var7] = var17;
               }
            }

            sortWorlds(var0, var1, var7, var3, var4, (byte)-112);
            sortWorlds(var0, 1 + var7, var2, var3, var4, (byte)-108);
         }
      } catch (RuntimeException var14) {
         throw RestClientThreadFactory.newRunException(var14, "fc.ag(" + ')');
      }
   }

   public class154(Buffer var1) {
      this.field1748 = new IterableNodeDeque();
      method3952(this, var1, -1466956921);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("av")
   void method3953(Buffer var1, int var2) {
      try {
         this.field1760 = Buffer.method12018(var1, -2090912678) * -555177004113613471L;
         this.field1749 = Buffer.method12015(var1, -496559568) * -451172745;

         for (int var3 = var1.method12183(-624324960); var3 != 0; var3 = var1.readMedium(-1517486739)) {
            if (var2 >= -614038893) {
               return;
            }

            Object var4;
            if (3 == var3) {
               if (var2 >= -614038893) {
                  return;
               }

               var4 = new classGH(this);
            } else if (1 == var3) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new LoginPacket(this);
            } else if (13 == var3) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new class166(this);
            } else if (var3 == 4) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new Sound(this);
            } else if (6 == var3) {
               var4 = new class165(this);
            } else if (5 == var3) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new class150(this);
            } else if (2 == var3) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new classFR(this);
            } else if (7 == var3) {
               var4 = new class148(this);
            } else if (14 == var3) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new class152(this);
            } else if (var3 == 8) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new classGW(this);
            } else if (var3 == 9) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new class175(this);
            } else if (10 == var3) {
               var4 = new class161(this);
            } else if (var3 == 11) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new classGN(this);
            } else if (var3 == 12) {
               if (var2 >= -614038893) {
                  throw new IllegalStateException();
               }

               var4 = new class160(this);
            } else {
               if (15 != var3) {
                  throw new RuntimeException("");
               }

               if (var2 >= -614038893) {
                  return;
               }

               var4 = new classGB(this);
            }

            ((classFM)var4).vmethod182(var1, (byte)-11);
            this.field1748.method9634((Node)var4);
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "fc.av(" + ')');
      }
   }
}
