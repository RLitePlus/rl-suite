import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qy")
public class JagNetThread {
   @ObfuscatedName("aq")
   CRC32 field5477;
   @ObfuscatedName("bz")
   byte field5473;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5483 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field5482 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field5484 = 512;
   @ObfuscatedName("ak")
   public int field5475 = 0;
   @ObfuscatedName("aw")
   public int field5464 = 0;
   @ObfuscatedSignature(descriptor = "Ltd;")
   @ObfuscatedName("ap")
   AbstractSocket field5490;
   @ObfuscatedName("al")
   boolean field5493;
   @ObfuscatedSignature(descriptor = "Lru;")
   @ObfuscatedName("ac")
   DualNodeDeque field5470;
   @ObfuscatedSignature(descriptor = "Lqi;")
   @ObfuscatedName("az")
   NodeHashTable field5466;
   @ObfuscatedName("ad")
   int field5467;
   @ObfuscatedSignature(descriptor = "Lqi;")
   @ObfuscatedName("ai")
   NodeHashTable field5468;
   @ObfuscatedName("as")
   int field5469;
   @ObfuscatedSignature(descriptor = "Lxa;")
   @ObfuscatedName("ao")
   Buffer field5492;
   @ObfuscatedSignature(descriptor = "Lqi;")
   @ObfuscatedName("ab")
   NodeHashTable field5471;
   @ObfuscatedName("ax")
   int field5479;
   @ObfuscatedSignature(descriptor = "Lqi;")
   @ObfuscatedName("ar")
   NodeHashTable field5472;
   @ObfuscatedName("ah")
   int field5463;
   @ObfuscatedName("bg")
   int field5480;
   @ObfuscatedSignature(descriptor = "Lqs;")
   @ObfuscatedName("af")
   classQS field5489;
   @ObfuscatedSignature(descriptor = "Lxa;")
   @ObfuscatedName("be")
   Buffer field5478;
   @ObfuscatedSignature(descriptor = "Lxa;")
   @ObfuscatedName("am")
   Buffer field5491;
   @ObfuscatedName("aa")
   int field5476;
   @ObfuscatedName("au")
   long field5488;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field5487 = 0;
   @ObfuscatedSignature(descriptor = "[Lqn;")
   @ObfuscatedName("bo")
   Archive[] field5474;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field5485 = 3;
   @ObfuscatedName("bs")
   int field5481;
   @ObfuscatedName("ay")
   int field5465 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field5486 = 1;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqy;Lqn;IIIBZ)V")
   @ObfuscatedName("rg")
   public static void method9249(JagNetThread var0, Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
      if (var0 == null) {
         var0.method9267(var2, var2, var2);
      } else {
         long var7 = (var2 << 16) + var3;
         classQS var9 = (classQS)var0.field5466.method8915(var7);
         if (var9 == null) {
            var9 = (classQS)var0.field5468.method8915(var7);
            if (null == var9) {
               var9 = (classQS)var0.field5471.method8915(var7);
               if (null != var9) {
                  if (var6) {
                     var9.removeDual();
                     var0.field5466.put(var9, var7);
                     var0.field5479 -= -2105133251;
                     var0.field5467 += 484135689;
                  }
               } else {
                  if (!var6) {
                     var9 = (classQS)var0.field5472.method8915(var7);
                     if (var9 != null) {
                        return;
                     }
                  }

                  var9 = new classQS();
                  var9.field5415 = var1;
                  var9.field5414 = var4 * -1220612917;
                  var9.field5412 = var5;
                  if (var6) {
                     var0.field5466.put(var9, var7);
                     var0.field5467 += 484135689;
                  } else {
                     var0.field5470.method9833(var9);
                     var0.field5471.put(var9, var7);
                     var0.field5479 += -2105133251;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("at")
   public void method9232(boolean var1, int var2) {
      try {
         if (this.field5490 != null) {
            try {
               Buffer var3 = new Buffer(4);
               byte var10001;
               if (var1) {
                  if (var2 >= 278159886) {
                     throw new IllegalStateException();
                  }

                  var10001 = 2;
               } else {
                  var10001 = 3;
               }

               var3.writeByte(var10001, (short)-1983);
               var3.writeMedium(0, 2141751090);
               this.field5490.write(var3.array, 0, 4, 858433438);
            } catch (IOException var6) {
               try {
                  this.field5490.close(-1883200549);
               } catch (Exception var5) {
               }

               this.field5464 += -1101389911;
               this.field5490 = null;
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "qy.at(" + ')');
      }
   }

   public JagNetThread() {
      this.field5466 = new NodeHashTable(4096);
      this.field5467 = 0;
      this.field5468 = new NodeHashTable(32);
      this.field5469 = 0;
      this.field5470 = new DualNodeDeque();
      this.field5471 = new NodeHashTable(4096);
      this.field5479 = 0;
      this.field5472 = new NodeHashTable(4096);
      this.field5463 = 0;
      this.field5478 = new Buffer(8);
      this.field5476 = 0;
      this.field5477 = new CRC32();
      this.field5474 = new Archive[256];
      this.field5480 = -573055231;
      this.field5481 = -1585405957;
      this.field5473 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lqn;IB)V")
   @ObfuscatedName("an")
   void method9242(Archive var1, int var2, byte var3) {
      try {
         if (var1.field5386) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            if (!var1.field5385) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               }

               if (var2 <= this.field5480 * 680976127) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  throw new RuntimeException("");
               }

               if (var2 < -1854300211 * this.field5481) {
                  this.field5481 = var2 * 1122264325;
               }
            }
         } else {
            if (var2 >= -1854300211 * this.field5481) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               }

               throw new RuntimeException("");
            }

            if (var2 > this.field5480 * 680976127) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               }

               this.field5480 = 573055231 * var2;
            }
         }

         if (this.field5492 != null) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               this.method9245(var1, var2, (byte)-1);
            }
         } else {
            this.method9268(null, class418.field5425.field5451 * 468737477, 255, 0, (byte)0, true, -1739525330);
            this.field5474[var2] = var1;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qy.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bk")
   int method9256(int var1, int var2) {
      long var3 = (var1 << 16) + var2;
      return null != this.field5489 && this.field5489.key == var3
         ? 1 + 741561464 * this.field5491.offset / (this.field5491.array.length - this.field5489.field5412)
         : 0;
   }

   @ObfuscatedSignature(descriptor = "(Lqn;IIIBZI)V")
   @ObfuscatedName("aj")
   void method9268(Archive var1, int var2, int var3, int var4, byte var5, boolean var6, int var7) {
      synchronized (this) {
         boolean var16 = var6;
         byte var15 = var5;
         int var14 = var4;
         int var13 = var3;
         int var12 = var2;
         Archive var11 = var1;
         JagNetThread var10 = this;
         int var17 = -1600943359;

         try {
            long var18 = (var12 << 16) + var13;
            classQS var20 = (classQS)var10.field5466.method8915(var18);
            if (var20 != null) {
               if (var17 >= -1526551496) {
                  throw new IllegalStateException();
               }
            } else {
               var20 = (classQS)var10.field5468.method8915(var18);
               if (null != var20) {
                  if (var17 >= -1526551496) {
                  }
               } else {
                  var20 = (classQS)var10.field5471.method8915(var18);
                  if (null != var20) {
                     if (var17 < -1526551496 && var16) {
                        if (var17 >= -1526551496) {
                           throw new IllegalStateException();
                        }

                        var20.removeDual();
                        var10.field5466.put(var20, var18);
                        var10.field5479 -= -2105133251;
                        var10.field5467 += 484135689;
                     }
                  } else {
                     if (!var16) {
                        if (var17 >= -1526551496) {
                           throw new IllegalStateException();
                        }

                        var20 = (classQS)var10.field5472.method8915(var18);
                        if (var20 != null) {
                           if (var17 >= -1526551496) {
                           }

                           return;
                        }
                     }

                     var20 = new classQS();
                     var20.field5415 = var11;
                     var20.field5414 = var14 * -1220612917;
                     var20.field5412 = var15;
                     if (var16) {
                        var10.field5466.put(var20, var18);
                        var10.field5467 += 484135689;
                     } else {
                        var10.field5470.method9833(var20);
                        var10.field5471.put(var20, var18);
                        var10.field5479 += -2105133251;
                     }
                  }
               }
            }
         } catch (RuntimeException var21) {
            throw RestClientThreadFactory.newRunException(var21, "qy.aj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqn;IIIBZ)V")
   @ObfuscatedName("eh")
   public void method9269(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
      this.method9268(var1, var2, var3, var4, var5, var6, -1600943359);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ak")
   void method9267(int var1, int var2, int var3) {
      synchronized (this) {
         int var8 = var2;
         int var7 = var1;
         JagNetThread var6 = this;
         int var9 = 762552045;

         try {
            long var10 = (var7 << 16) + var8;
            classQS var12 = (classQS)var6.field5471.method8915(var10);
            if (null == var12) {
               if (var9 <= 688079671) {
                  throw new IllegalStateException();
               }
            } else {
               DualNodeDeque.method9836(var6.field5470, var12);
            }
         } catch (RuntimeException var13) {
            throw RestClientThreadFactory.newRunException(var13, "qy.ak(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqy;ZZ)I")
   @ObfuscatedName("ze")
   public static int method9261(JagNetThread var0, boolean var1, boolean var2) {
      if (var0 == null) {
         var0.method9234(var1);
      }

      int var3 = 0;
      if (var1) {
         var3 += 2050000033 * var0.field5469 + var0.field5467 * 1350052665;
      }

      if (var2) {
         var3 += var0.field5463 * 2003362371 + -1274357739 * var0.field5479;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("aw")
   int method9257(int var1, int var2, int var3) {
      try {
         long var4 = (var1 << 16) + var2;
         if (null != this.field5489) {
            if (var3 == 1597805397) {
               throw new IllegalStateException();
            }

            if (this.field5489.key == var4) {
               return 1 + -1722618313 * this.field5491.offset / (this.field5491.array.length - this.field5489.field5412);
            }

            if (var3 == 1597805397) {
               throw new IllegalStateException();
            }
         }

         return 0;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "qy.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqn;IB)V")
   @ObfuscatedName("ae")
   void method9245(Archive var1, int var2, byte var3) {
      try {
         int var4 = 5 + var2 * 8;
         int var5 = 0;
         int var6 = 0;
         if (var4 <= this.field5492.array.length - 8) {
            if (var3 != -1) {
               throw new IllegalStateException();
            }

            this.field5492.offset = 1741769013 * var4;
            var5 = Buffer.method12015(this.field5492, 7638652);
            var6 = Buffer.method12015(this.field5492, 747412627);
         }

         if (var5 == 0) {
            if (var3 != -1) {
               return;
            }

            if (var6 == 0) {
               if (var3 != -1) {
                  throw new IllegalStateException();
               }

               if (var1.field5386) {
                  if (var3 != -1) {
                     throw new IllegalStateException();
                  }

                  Archive.method9079(var1, 1537917663);
                  return;
               }

               throw new RuntimeException("");
            }
         }

         Archive.method9081(var1, var5, var6, (byte)119);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "qy.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("az")
   public boolean method9228() {
      long var1 = ParamComposition.method4949((byte)15);
      int var3 = (int)(var1 - this.field5488 * 7245199905198616269L);
      this.field5488 = 6608554564537085445L * var1;
      if (var3 > 775645075) {
         var3 = 200;
      }

      this.field5465 += 1881340294 * var3;
      if (0 == this.field5463 * -675522790 && 359636942 * this.field5469 == 0 && 1405199711 * this.field5479 == 0 && 0 == 1350052665 * this.field5467) {
         return true;
      } else if (this.field5490 == null) {
         return false;
      } else {
         try {
            if (164462190 * this.field5465 > -1451044507) {
               throw new IOException();
            } else {
               while (2050000033 * this.field5469 < 1054243879 && 1350052665 * this.field5467 > 0) {
                  classQS var4 = (classQS)this.field5466.first();
                  Buffer var5 = new Buffer(4);
                  var5.writeByte(1, (short)-14947);
                  var5.writeMedium((int)var4.key, 2143482656);
                  this.field5490.write(var5.array, 0, 4, -177424867);
                  this.field5468.put(var4, var4.key);
                  this.field5467 -= 484135689;
                  this.field5469 += 1923506017;
               }

               while (this.field5463 * 1796865227 < 200 && this.field5479 * 1046766517 > 0) {
                  classQS var19 = (classQS)UserComparator3.method3682(this.field5470);
                  Buffer var21 = new Buffer(4);
                  var21.writeByte(0, (short)-28387);
                  var21.writeMedium((int)var19.key, 2138823084);
                  this.field5490.write(var21.array, 0, 4, 1920191131);
                  var19.removeDual();
                  this.field5472.put(var19, var19.key);
                  this.field5479 -= 854182087;
                  this.field5463 += 675973587;
               }

               for (int var20 = 0; var20 < 100; var20++) {
                  int var22 = this.field5490.readUnsignedByte(-1807232209);
                  if (var22 < 0) {
                     throw new IOException();
                  }

                  if (0 == var22) {
                     break;
                  }

                  this.field5465 = 0;
                  byte var6 = 0;
                  if (null == this.field5489) {
                     var6 = 8;
                  } else if (0 == -1218851699 * this.field5476) {
                     var6 = 1;
                  }

                  if (var6 > 0) {
                     int var7 = var6 - this.field5478.offset * 2108391709;
                     if (var7 > var22) {
                        var7 = var22;
                     }

                     this.field5490.read(this.field5478.array, this.field5478.offset * 1160775454, var7, 1534386910);
                     if (this.field5473 != 0) {
                        for (int var8 = 0; var8 < var7; var8++) {
                           this.field5478.array[var8 + this.field5478.offset * -1335789422] = (byte)(
                              this.field5478.array[var8 + this.field5478.offset * -1335789422] ^ this.field5473
                           );
                        }
                     }

                     this.field5478.offset += 1741769013 * var7;
                     if (this.field5478.offset * 1335551359 < var6) {
                        break;
                     }

                     if (null == this.field5489) {
                        this.field5478.offset = 0;
                        int var24 = this.field5478.readUnsignedByte(959601955);
                        int var9 = Buffer.method12008(this.field5478, (byte)5);
                        int var10 = this.field5478.readUnsignedByte(524450887);
                        int var11 = Buffer.method12015(this.field5478, 676557960);
                        long var12 = (var24 << 16) + var9;
                        classQS var14 = (classQS)this.field5468.method8915(var12);
                        this.field5493 = true;
                        if (var14 == null) {
                           var14 = (classQS)this.field5472.method8915(var12);
                           this.field5493 = false;
                        }

                        if (var14 == null) {
                           throw new IOException();
                        }

                        int var15 = 0 == var10 ? 5 : 9;
                        this.field5489 = var14;
                        this.field5491 = new Buffer(this.field5489.field5412 + var15 + var11);
                        this.field5491.writeByte(var10, (short)-9812);
                        this.field5491.writeInt(var11, 1292854965);
                        this.field5476 = -734612952;
                        this.field5478.offset = 0;
                     } else if (0 == this.field5476 * -595369315) {
                        if (-1 == this.field5478.array[0]) {
                           this.field5476 = -1617000134;
                           this.field5478.offset = 0;
                        } else {
                           this.field5489 = null;
                        }
                     }
                  } else {
                     int var23 = this.field5491.array.length - this.field5489.field5412;
                     int var25 = 512 - this.field5476 * 582637711;
                     if (var25 > var23 - 2108391709 * this.field5491.offset) {
                        var25 = var23 - this.field5491.offset * 2108391709;
                     }

                     if (var25 > var22) {
                        var25 = var22;
                     }

                     this.field5490.read(this.field5491.array, 2108391709 * this.field5491.offset, var25, 1534386910);
                     if (0 != this.field5473) {
                        for (int var26 = 0; var26 < var25; var26++) {
                           this.field5491.array[this.field5491.offset * 2108391709 + var26] = (byte)(
                              this.field5491.array[this.field5491.offset * 2108391709 + var26] ^ this.field5473
                           );
                        }
                     }

                     this.field5491.offset += var25 * 1809422569;
                     this.field5476 += 1636151154 * var25;
                     if (this.field5491.offset * -1510921230 == var23) {
                        if (this.field5489.key == 16711935L) {
                           this.field5492 = this.field5491;

                           for (int var28 = 0; var28 < 256; var28++) {
                              Archive var29 = this.field5474[var28];
                              if (null != var29) {
                                 this.method9245(var29, var28, (byte)-1);
                              }
                           }
                        } else {
                           this.field5477.reset();
                           this.field5477.update(this.field5491.array, 0, var23);
                           int var27 = (int)this.field5477.getValue();
                           if (var27 != 735190834 * this.field5489.field5414) {
                              try {
                                 this.field5490.close(-1883200549);
                              } catch (Exception var17) {
                              }

                              this.field5475 += -1466251990;
                              this.field5490 = null;
                              this.field5473 = (byte)(Math.random() * 255.0 + 1.0);
                              return false;
                           }

                           this.field5475 = 0;
                           this.field5464 = 0;
                           this.field5489
                              .field5415
                              .write(
                                 (int)(this.field5489.key & 65535L),
                                 this.field5491.array,
                                 16711680L == (this.field5489.key & 16711680L),
                                 this.field5493,
                                 1799083207
                              );
                        }

                        this.field5489.remove();
                        if (this.field5493) {
                           this.field5469 -= 1923506017;
                        } else {
                           this.field5463 -= -339936661;
                        }

                        this.field5476 = 0;
                        this.field5489 = null;
                        this.field5491 = null;
                     } else {
                        if (726307112 != -150719906 * this.field5476) {
                           break;
                        }

                        this.field5476 = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var18) {
            try {
               this.field5490.close(-1883200549);
            } catch (Exception var16) {
            }

            this.field5464 += 1126406893;
            this.field5490 = null;
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method9229() {
      long var1 = ParamComposition.method4949((byte)15);
      int var3 = (int)(var1 - this.field5488 * 7245199905198616269L);
      this.field5488 = 6608554564537085445L * var1;
      if (var3 > 200) {
         var3 = 200;
      }

      this.field5465 += 857778495 * var3;
      if (0 == this.field5463 * 2003362371 && 2050000033 * this.field5469 == 0 && -1274357739 * this.field5479 == 0 && 0 == 1350052665 * this.field5467) {
         return true;
      } else if (this.field5490 == null) {
         return false;
      } else {
         try {
            if (-695875905 * this.field5465 > 30000) {
               throw new IOException();
            } else {
               while (2050000033 * this.field5469 < 200 && 1350052665 * this.field5467 > 0) {
                  classQS var4 = (classQS)this.field5466.first();
                  Buffer var5 = new Buffer(4);
                  var5.writeByte(1, (short)-17760);
                  var5.writeMedium((int)var4.key, 2143832082);
                  this.field5490.write(var5.array, 0, 4, 1811603272);
                  this.field5468.put(var4, var4.key);
                  this.field5467 -= 484135689;
                  this.field5469 += 1923506017;
               }

               while (this.field5463 * 2003362371 < 200 && this.field5479 * -1274357739 > 0) {
                  classQS var19 = (classQS)UserComparator3.method3682(this.field5470);
                  Buffer var21 = new Buffer(4);
                  var21.writeByte(0, (short)-20917);
                  var21.writeMedium((int)var19.key, 2146149678);
                  this.field5490.write(var21.array, 0, 4, 1263059313);
                  var19.removeDual();
                  this.field5472.put(var19, var19.key);
                  this.field5479 -= -2105133251;
                  this.field5463 += -339936661;
               }

               for (int var20 = 0; var20 < 100; var20++) {
                  int var22 = this.field5490.readUnsignedByte(-1807232209);
                  if (var22 < 0) {
                     throw new IOException();
                  }

                  if (0 == var22) {
                     break;
                  }

                  this.field5465 = 0;
                  byte var6 = 0;
                  if (null == this.field5489) {
                     var6 = 8;
                  } else if (0 == -1218851699 * this.field5476) {
                     var6 = 1;
                  }

                  if (var6 > 0) {
                     int var7 = var6 - this.field5478.offset * 2108391709;
                     if (var7 > var22) {
                        var7 = var22;
                     }

                     this.field5490.read(this.field5478.array, this.field5478.offset * 2108391709, var7, 1534386910);
                     if (this.field5473 != 0) {
                        for (int var8 = 0; var8 < var7; var8++) {
                           this.field5478.array[var8 + this.field5478.offset * 2108391709] = (byte)(
                              this.field5478.array[var8 + this.field5478.offset * 2108391709] ^ this.field5473
                           );
                        }
                     }

                     this.field5478.offset += 1741769013 * var7;
                     if (this.field5478.offset * 2108391709 < var6) {
                        break;
                     }

                     if (null == this.field5489) {
                        this.field5478.offset = 0;
                        int var24 = this.field5478.readUnsignedByte(2088601025);
                        int var9 = Buffer.method12008(this.field5478, (byte)5);
                        int var10 = this.field5478.readUnsignedByte(477539728);
                        int var11 = Buffer.method12015(this.field5478, -426550533);
                        long var12 = (var24 << 16) + var9;
                        classQS var14 = (classQS)this.field5468.method8915(var12);
                        this.field5493 = true;
                        if (var14 == null) {
                           var14 = (classQS)this.field5472.method8915(var12);
                           this.field5493 = false;
                        }

                        if (var14 == null) {
                           throw new IOException();
                        }

                        int var15 = 0 == var10 ? 5 : 9;
                        this.field5489 = var14;
                        this.field5491 = new Buffer(this.field5489.field5412 + var15 + var11);
                        this.field5491.writeByte(var10, (short)-25725);
                        this.field5491.writeInt(var11, 957452163);
                        this.field5476 = -734612952;
                        this.field5478.offset = 0;
                     } else if (0 == this.field5476 * -1218851699) {
                        if (-1 == this.field5478.array[0]) {
                           this.field5476 = -1165568443;
                           this.field5478.offset = 0;
                        } else {
                           this.field5489 = null;
                        }
                     }
                  } else {
                     int var23 = this.field5491.array.length - this.field5489.field5412;
                     int var25 = 512 - this.field5476 * -1218851699;
                     if (var25 > var23 - 2108391709 * this.field5491.offset) {
                        var25 = var23 - this.field5491.offset * 2108391709;
                     }

                     if (var25 > var22) {
                        var25 = var22;
                     }

                     this.field5490.read(this.field5491.array, 2108391709 * this.field5491.offset, var25, 1534386910);
                     if (0 != this.field5473) {
                        for (int var26 = 0; var26 < var25; var26++) {
                           this.field5491.array[this.field5491.offset * 2108391709 + var26] = (byte)(
                              this.field5491.array[this.field5491.offset * 2108391709 + var26] ^ this.field5473
                           );
                        }
                     }

                     this.field5491.offset += var25 * 1741769013;
                     this.field5476 += -1165568443 * var25;
                     if (this.field5491.offset * 2108391709 == var23) {
                        if (this.field5489.key == 16711935L) {
                           this.field5492 = this.field5491;

                           for (int var28 = 0; var28 < 256; var28++) {
                              Archive var29 = this.field5474[var28];
                              if (null != var29) {
                                 this.method9245(var29, var28, (byte)-1);
                              }
                           }
                        } else {
                           this.field5477.reset();
                           this.field5477.update(this.field5491.array, 0, var23);
                           int var27 = (int)this.field5477.getValue();
                           if (var27 != 1340283107 * this.field5489.field5414) {
                              try {
                                 this.field5490.close(-1883200549);
                              } catch (Exception var17) {
                              }

                              this.field5475 += -1007308057;
                              this.field5490 = null;
                              this.field5473 = (byte)(Math.random() * 255.0 + 1.0);
                              return false;
                           }

                           this.field5475 = 0;
                           this.field5464 = 0;
                           this.field5489
                              .field5415
                              .write(
                                 (int)(this.field5489.key & 65535L),
                                 this.field5491.array,
                                 16711680L == (this.field5489.key & 16711680L),
                                 this.field5493,
                                 1799083207
                              );
                        }

                        this.field5489.remove();
                        if (this.field5493) {
                           this.field5469 -= 1923506017;
                        } else {
                           this.field5463 -= -339936661;
                        }

                        this.field5476 = 0;
                        this.field5489 = null;
                        this.field5491 = null;
                     } else {
                        if (512 != -1218851699 * this.field5476) {
                           break;
                        }

                        this.field5476 = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var18) {
            try {
               this.field5490.close(-1883200549);
            } catch (Exception var16) {
            }

            this.field5464 += -1101389911;
            this.field5490 = null;
            return false;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;I)[I")
   @ObfuscatedName("ci")
   public static int[] method9248(AbstractArchive var0, int var1) {
      if (var0 == null) {
         var0.method8979(var1);
      }

      return var1 >= 0 && var1 < var0.fileIds.length ? var0.fileIds[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(Lqy;Ltd;ZI)V")
   @ObfuscatedName("hj")
   public static void method9236(JagNetThread var0, AbstractSocket var1, boolean var2, int var3) {
      if (var0 == null) {
         var0.method9241(var1, var2, var3);
      }

      try {
         if (var0.field5490 != null) {
            if (var3 == 743318851) {
               throw new IllegalStateException();
            }

            try {
               var0.field5490.close(-1883200549);
            } catch (Exception var8) {
            }

            var0.field5490 = null;
         }

         var0.field5490 = var1;
         var0.method9232(var2, -2133597768);
         var0.field5478.offset = 0;
         var0.field5489 = null;
         var0.field5491 = null;
         var0.field5476 = 0;

         while (true) {
            classQS var4 = (classQS)var0.field5468.first();
            if (null == var4) {
               if (var3 == 743318851) {
                  return;
               } else {
                  while (true) {
                     var4 = (classQS)var0.field5472.first();
                     if (var4 == null) {
                        if (var3 == 743318851) {
                           throw new IllegalStateException();
                        } else {
                           if (0 != var0.field5473) {
                              if (var3 == 743318851) {
                                 throw new IllegalStateException();
                              }

                              try {
                                 Buffer var11 = new Buffer(4);
                                 var11.writeByte(4, (short)-22130);
                                 var11.writeByte(var0.field5473, (short)-1965);
                                 var11.writeShort(0, -1636442033);
                                 var0.field5490.write(var11.array, 0, 4, 1489277291);
                              } catch (IOException var7) {
                                 try {
                                    var0.field5490.close(-1883200549);
                                 } catch (Exception var6) {
                                 }

                                 var0.field5464 += -1101389911;
                                 var0.field5490 = null;
                              }
                           }

                           var0.field5465 = 0;
                           var0.field5488 = ParamComposition.method4949((byte)15) * 6608554564537085445L;
                           return;
                        }
                     }

                     DualNodeDeque.method9836(var0.field5470, var4);
                     var0.field5471.put(var4, var4.key);
                     var0.field5479 += -2105133251;
                     var0.field5463 -= -339936661;
                  }
               }
            }

            var0.field5466.put(var4, var4.key);
            var0.field5467 += 484135689;
            var0.field5469 -= 1923506017;
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "qy.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltd;Z)V")
   @ObfuscatedName("ah")
   public void method9237(AbstractSocket var1, boolean var2) {
      if (this.field5490 != null) {
         try {
            this.field5490.close(-1883200549);
         } catch (Exception var7) {
         }

         this.field5490 = null;
      }

      this.field5490 = var1;
      this.method9232(var2, -1451488113);
      this.field5478.offset = 0;
      this.field5489 = null;
      this.field5491 = null;
      this.field5476 = 0;

      while (true) {
         classQS var3 = (classQS)this.field5468.first();
         if (null == var3) {
            while (true) {
               var3 = (classQS)this.field5472.first();
               if (var3 == null) {
                  if (0 != this.field5473) {
                     try {
                        Buffer var9 = new Buffer(4);
                        var9.writeByte(4, (short)-20507);
                        var9.writeByte(this.field5473, (short)-25151);
                        var9.writeShort(0, -1716395026);
                        this.field5490.write(var9.array, 0, 4, 1712008147);
                     } catch (IOException var6) {
                        try {
                           this.field5490.close(-1883200549);
                        } catch (Exception var5) {
                        }

                        this.field5464 += -1101389911;
                        this.field5490 = null;
                     }
                  }

                  this.field5465 = 0;
                  this.field5488 = ParamComposition.method4949((byte)15) * 6608554564537085445L;
                  return;
               }

               DualNodeDeque.method9836(this.field5470, var3);
               this.field5471.put(var3, var3.key);
               this.field5479 += -2105133251;
               this.field5463 -= 1652832757;
            }
         }

         this.field5466.put(var3, var3.key);
         this.field5467 += 484135689;
         this.field5469 -= 1923506017;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("as")
   public void method9233(boolean var1) {
      if (this.field5490 != null) {
         try {
            Buffer var2 = new Buffer(4);
            var2.writeByte(var1 ? 2 : 3, (short)-1300);
            var2.writeMedium(0, 2146798495);
            this.field5490.write(var2.array, 0, 4, -180256108);
         } catch (IOException var5) {
            try {
               this.field5490.close(-1883200549);
            } catch (Exception var4) {
            }

            this.field5464 += -1101389911;
            this.field5490 = null;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqy;II)I")
   @ObfuscatedName("pa")
   public static int method9258(JagNetThread var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method9257(var1, var1, var1);
      } else {
         long var3 = (var1 << 16) + var2;
         return null != var0.field5489 && var0.field5489.key == var3
            ? 1 + -1616144925 * var0.field5491.offset / (var0.field5491.array.length - var0.field5489.field5412)
            : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ac")
   public void method9234(boolean var1) {
      if (this.field5490 != null) {
         try {
            Buffer var2 = new Buffer(4);
            var2.writeByte(var1 ? 2 : 3, (short)-18744);
            var2.writeMedium(0, 2146275391);
            this.field5490.write(var2.array, 0, 4, 1388282507);
         } catch (IOException var5) {
            try {
               this.field5490.close(-1883200549);
            } catch (Exception var4) {
            }

            this.field5464 += -1101389911;
            this.field5490 = null;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsc;)I")
   @ObfuscatedName("tg")
   public static int method9227(classSC var0) {
      return var0 == null ? var0.method10071() : var0.field5761 * -1432123415;
   }

   @ObfuscatedSignature(descriptor = "(Ltd;Z)V")
   @ObfuscatedName("ax")
   public void method9238(AbstractSocket var1, boolean var2) {
      if (this.field5490 != null) {
         try {
            this.field5490.close(-1883200549);
         } catch (Exception var7) {
         }

         this.field5490 = null;
      }

      this.field5490 = var1;
      this.method9232(var2, 119026364);
      this.field5478.offset = 0;
      this.field5489 = null;
      this.field5491 = null;
      this.field5476 = 0;

      while (true) {
         classQS var3 = (classQS)this.field5468.first();
         if (null == var3) {
            while (true) {
               var3 = (classQS)this.field5472.first();
               if (var3 == null) {
                  if (0 != this.field5473) {
                     try {
                        Buffer var9 = new Buffer(4);
                        var9.writeByte(4, (short)-14466);
                        var9.writeByte(this.field5473, (short)-5420);
                        var9.writeShort(0, -1536616391);
                        this.field5490.write(var9.array, 0, 4, 1488060499);
                     } catch (IOException var6) {
                        try {
                           this.field5490.close(-1883200549);
                        } catch (Exception var5) {
                        }

                        this.field5464 += -1101389911;
                        this.field5490 = null;
                     }
                  }

                  this.field5465 = 0;
                  this.field5488 = ParamComposition.method4949((byte)15) * 6608554564537085445L;
                  return;
               }

               DualNodeDeque.method9836(this.field5470, var3);
               this.field5471.put(var3, var3.key);
               this.field5479 += 1116381966;
               this.field5463 -= -1417765298;
            }
         }

         this.field5466.put(var3, var3.key);
         this.field5467 += 484135689;
         this.field5469 -= 1923506017;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqy;Ltd;Z)V")
   @ObfuscatedName("rw")
   public static void method9239(JagNetThread var0, AbstractSocket var1, boolean var2) {
      if (var0.field5490 != null) {
         try {
            var0.field5490.close(-1883200549);
         } catch (Exception var7) {
         }

         var0.field5490 = null;
      }

      var0.field5490 = var1;
      var0.method9232(var2, -922581701);
      var0.field5478.offset = 0;
      var0.field5489 = null;
      var0.field5491 = null;
      var0.field5476 = 0;

      while (true) {
         classQS var3 = (classQS)var0.field5468.first();
         if (null == var3) {
            while (true) {
               var3 = (classQS)var0.field5472.first();
               if (var3 == null) {
                  if (0 != var0.field5473) {
                     try {
                        Buffer var9 = new Buffer(4);
                        var9.writeByte(4, (short)-1514);
                        var9.writeByte(var0.field5473, (short)-10818);
                        var9.writeShort(0, -2034549412);
                        var0.field5490.write(var9.array, 0, 4, 826793299);
                     } catch (IOException var6) {
                        try {
                           var0.field5490.close(-1883200549);
                        } catch (Exception var5) {
                        }

                        var0.field5464 += 1042655315;
                        var0.field5490 = null;
                     }
                  }

                  var0.field5465 = 0;
                  var0.field5488 = ParamComposition.method4949((byte)15) * 6608554564537085445L;
                  return;
               }

               DualNodeDeque.method9836(var0.field5470, var3);
               var0.field5471.put(var3, var3.key);
               var0.field5479 += -217798655;
               var0.field5463 -= -1237865168;
            }
         }

         var0.field5466.put(var3, var3.key);
         var0.field5467 += 484135689;
         var0.field5469 -= -886066337;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqy;Lqn;I)V")
   @ObfuscatedName("as")
   public static void method9243(JagNetThread var0, Archive var1, int var2) {
      if (var0 == null) {
         var0.method9247(var1, var2);
      }

      if (var1.field5386) {
         if (!var1.field5385) {
            if (var2 <= var0.field5480 * 680976127) {
               throw new RuntimeException("");
            }

            if (var2 < -1854300211 * var0.field5481) {
               var0.field5481 = var2 * 1122264325;
            }
         }
      } else {
         if (var2 >= -1854300211 * var0.field5481) {
            throw new RuntimeException("");
         }

         if (var2 > var0.field5480 * 680976127) {
            var0.field5480 = 573055231 * var2;
         }
      }

      if (var0.field5492 != null) {
         var0.method9245(var1, var2, (byte)-1);
      } else {
         var0.method9268(null, class418.field5425.field5451 * 468737477, 255, 0, (byte)0, true, -2094055326);
         var0.field5474[var2] = var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqy;ZZ)I")
   @ObfuscatedName("pb")
   public static int method9262(JagNetThread var0, boolean var1, boolean var2) {
      if (var0 == null) {
         var0.method9228();
      }

      int var3 = 0;
      if (var1) {
         var3 += 2050000033 * var0.field5469 + var0.field5467 * 1350052665;
      }

      if (var2) {
         var3 += var0.field5463 * 2003362371 + -1274357739 * var0.field5479;
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqy;)V")
   @ObfuscatedName("dg")
   public static void method9265(JagNetThread var0) {
      if (null != var0.field5490) {
         try {
            var0.field5490.close(-1883200549);
         } catch (Exception var2) {
         }

         var0.field5490 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   public boolean method9230() {
      long var1 = ParamComposition.method4949((byte)15);
      int var3 = (int)(var1 - this.field5488 * 7245199905198616269L);
      this.field5488 = 6608554564537085445L * var1;
      if (var3 > 200) {
         var3 = 200;
      }

      this.field5465 += 857778495 * var3;
      if (0 == this.field5463 * -1249397596 && 2050000033 * this.field5469 == 0 && -1274357739 * this.field5479 == 0 && 0 == 1350052665 * this.field5467) {
         return true;
      } else if (this.field5490 == null) {
         return false;
      } else {
         try {
            if (574903445 * this.field5465 > 2128331378) {
               throw new IOException();
            } else {
               while (2050000033 * this.field5469 < 200 && 1350052665 * this.field5467 > 0) {
                  classQS var4 = (classQS)this.field5466.first();
                  Buffer var5 = new Buffer(4);
                  var5.writeByte(1, (short)-26075);
                  var5.writeMedium((int)var4.key, 2141064561);
                  this.field5490.write(var5.array, 0, 4, 1239369733);
                  this.field5468.put(var4, var4.key);
                  this.field5467 -= 484135689;
                  this.field5469 += -127086048;
               }

               while (this.field5463 * 2003362371 < 1667062898 && this.field5479 * -1249133620 > 0) {
                  classQS var19 = (classQS)UserComparator3.method3682(this.field5470);
                  Buffer var21 = new Buffer(4);
                  var21.writeByte(0, (short)-24941);
                  var21.writeMedium((int)var19.key, 2143875675);
                  this.field5490.write(var21.array, 0, 4, 474962312);
                  var19.removeDual();
                  this.field5472.put(var19, var19.key);
                  this.field5479 -= 963871621;
                  this.field5463 += -731913605;
               }

               for (int var20 = 0; var20 < 1187091585; var20++) {
                  int var22 = this.field5490.readUnsignedByte(-1807232209);
                  if (var22 < 0) {
                     throw new IOException();
                  }

                  if (0 == var22) {
                     break;
                  }

                  this.field5465 = 0;
                  byte var6 = 0;
                  if (null == this.field5489) {
                     var6 = 8;
                  } else if (0 == 251560137 * this.field5476) {
                     var6 = 1;
                  }

                  if (var6 > 0) {
                     int var7 = var6 - this.field5478.offset * 2108391709;
                     if (var7 > var22) {
                        var7 = var22;
                     }

                     this.field5490.read(this.field5478.array, this.field5478.offset * -1276712067, var7, 1534386910);
                     if (this.field5473 != 0) {
                        for (int var8 = 0; var8 < var7; var8++) {
                           this.field5478.array[var8 + this.field5478.offset * 2108391709] = (byte)(
                              this.field5478.array[var8 + this.field5478.offset * 2108391709] ^ this.field5473
                           );
                        }
                     }

                     this.field5478.offset += 1741769013 * var7;
                     if (this.field5478.offset * -2127973502 < var6) {
                        break;
                     }

                     if (null == this.field5489) {
                        this.field5478.offset = 0;
                        int var24 = this.field5478.readUnsignedByte(1287236879);
                        int var9 = Buffer.method12008(this.field5478, (byte)5);
                        int var10 = this.field5478.readUnsignedByte(-1062502263);
                        int var11 = Buffer.method12015(this.field5478, 1694011467);
                        long var12 = (var24 << 16) + var9;
                        classQS var14 = (classQS)this.field5468.method8915(var12);
                        this.field5493 = true;
                        if (var14 == null) {
                           var14 = (classQS)this.field5472.method8915(var12);
                           this.field5493 = false;
                        }

                        if (var14 == null) {
                           throw new IOException();
                        }

                        int var15 = 0 == var10 ? 5 : 9;
                        this.field5489 = var14;
                        this.field5491 = new Buffer(this.field5489.field5412 + var15 + var11);
                        this.field5491.writeByte(var10, (short)-17040);
                        this.field5491.writeInt(var11, 1206198676);
                        this.field5476 = -734612952;
                        this.field5478.offset = 0;
                     } else if (0 == this.field5476 * 1103157935) {
                        if (-1 == this.field5478.array[0]) {
                           this.field5476 = -1253506604;
                           this.field5478.offset = 0;
                        } else {
                           this.field5489 = null;
                        }
                     }
                  } else {
                     int var23 = this.field5491.array.length - this.field5489.field5412;
                     int var25 = -323697974 - this.field5476 * 132346599;
                     if (var25 > var23 - -11987224 * this.field5491.offset) {
                        var25 = var23 - this.field5491.offset * 2108391709;
                     }

                     if (var25 > var22) {
                        var25 = var22;
                     }

                     this.field5490.read(this.field5491.array, 272347617 * this.field5491.offset, var25, 1534386910);
                     if (0 != this.field5473) {
                        for (int var26 = 0; var26 < var25; var26++) {
                           this.field5491.array[this.field5491.offset * 2108391709 + var26] = (byte)(
                              this.field5491.array[this.field5491.offset * 2108391709 + var26] ^ this.field5473
                           );
                        }
                     }

                     this.field5491.offset += var25 * 1336120176;
                     this.field5476 += -1291331312 * var25;
                     if (this.field5491.offset * -325525586 == var23) {
                        if (this.field5489.key == 16711935L) {
                           this.field5492 = this.field5491;

                           for (int var28 = 0; var28 < -91505475; var28++) {
                              Archive var29 = this.field5474[var28];
                              if (null != var29) {
                                 this.method9245(var29, var28, (byte)-1);
                              }
                           }
                        } else {
                           this.field5477.reset();
                           this.field5477.update(this.field5491.array, 0, var23);
                           int var27 = (int)this.field5477.getValue();
                           if (var27 != -1211115723 * this.field5489.field5414) {
                              try {
                                 this.field5490.close(-1883200549);
                              } catch (Exception var17) {
                              }

                              this.field5475 += 322129606;
                              this.field5490 = null;
                              this.field5473 = (byte)(Math.random() * 255.0 + 1.0);
                              return false;
                           }

                           this.field5475 = 0;
                           this.field5464 = 0;
                           this.field5489
                              .field5415
                              .write(
                                 (int)(this.field5489.key & 65535L),
                                 this.field5491.array,
                                 16711680L == (this.field5489.key & 16711680L),
                                 this.field5493,
                                 1799083207
                              );
                        }

                        this.field5489.remove();
                        if (this.field5493) {
                           this.field5469 -= 1923506017;
                        } else {
                           this.field5463 -= -1467182846;
                        }

                        this.field5476 = 0;
                        this.field5489 = null;
                        this.field5491 = null;
                     } else {
                        if (512 != -1218851699 * this.field5476) {
                           break;
                        }

                        this.field5476 = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var18) {
            try {
               this.field5490.close(-1883200549);
            } catch (Exception var16) {
            }

            this.field5464 += -1469154917;
            this.field5490 = null;
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltd;Z)V")
   @ObfuscatedName("ar")
   public void method9240(AbstractSocket var1, boolean var2) {
      if (this.field5490 != null) {
         try {
            this.field5490.close(-1883200549);
         } catch (Exception var7) {
         }

         this.field5490 = null;
      }

      this.field5490 = var1;
      this.method9232(var2, -1209237083);
      this.field5478.offset = 0;
      this.field5489 = null;
      this.field5491 = null;
      this.field5476 = 0;

      while (true) {
         classQS var3 = (classQS)this.field5468.first();
         if (null == var3) {
            while (true) {
               var3 = (classQS)this.field5472.first();
               if (var3 == null) {
                  if (0 != this.field5473) {
                     try {
                        Buffer var9 = new Buffer(4);
                        var9.writeByte(4, (short)-9650);
                        var9.writeByte(this.field5473, (short)-14864);
                        var9.writeShort(0, -1676960922);
                        this.field5490.write(var9.array, 0, 4, 1866049452);
                     } catch (IOException var6) {
                        try {
                           this.field5490.close(-1883200549);
                        } catch (Exception var5) {
                        }

                        this.field5464 += -1101389911;
                        this.field5490 = null;
                     }
                  }

                  this.field5465 = 0;
                  this.field5488 = ParamComposition.method4949((byte)15) * 6608554564537085445L;
                  return;
               }

               DualNodeDeque.method9836(this.field5470, var3);
               this.field5471.put(var3, var3.key);
               this.field5479 += -753877645;
               this.field5463 -= 104144768;
            }
         }

         this.field5466.put(var3, var3.key);
         this.field5467 += -675408138;
         this.field5469 -= 1724658864;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqn;I)V")
   @ObfuscatedName("al")
   void method9244(Archive var1, int var2) {
      if (var1.field5386) {
         if (!var1.field5385) {
            if (var2 <= this.field5480 * 680976127) {
               throw new RuntimeException("");
            }

            if (var2 < -1854300211 * this.field5481) {
               this.field5481 = var2 * 1122264325;
            }
         }
      } else {
         if (var2 >= -1854300211 * this.field5481) {
            throw new RuntimeException("");
         }

         if (var2 > this.field5480 * 680976127) {
            this.field5480 = 573055231 * var2;
         }
      }

      if (this.field5492 != null) {
         this.method9245(var1, var2, (byte)-1);
      } else {
         this.method9268(null, class418.field5425.field5451 * 468737477, 255, 0, (byte)0, true, -1579892904);
         this.field5474[var2] = var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqy;II)I")
   @ObfuscatedName("pw")
   public static int method9259(JagNetThread var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method9256(var1, var1);
      } else {
         long var3 = (var1 << 16) + var2;
         return null != var0.field5489 && var0.field5489.key == var3
            ? 1 + -984071954 * var0.field5491.offset / (var0.field5491.array.length - var0.field5489.field5412)
            : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqn;I)V")
   @ObfuscatedName("am")
   void method9246(Archive var1, int var2) {
      int var3 = 5 + var2 * 8;
      int var4 = 0;
      int var5 = 0;
      if (var3 <= this.field5492.array.length - 8) {
         this.field5492.offset = 1741769013 * var3;
         var4 = Buffer.method12015(this.field5492, 100863997);
         var5 = Buffer.method12015(this.field5492, -116105347);
      }

      if (var4 != 0 || var5 != 0) {
         Archive.method9081(var1, var4, var5, (byte)42);
      } else if (var1.field5386) {
         Archive.method9079(var1, 1954405014);
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqn;I)V")
   @ObfuscatedName("ao")
   void method9247(Archive var1, int var2) {
      int var3 = 5 + var2 * 8;
      int var4 = 0;
      int var5 = 0;
      if (var3 <= this.field5492.array.length - 8) {
         this.field5492.offset = -13747155 * var3;
         var4 = Buffer.method12015(this.field5492, 598558583);
         var5 = Buffer.method12015(this.field5492, 1904566595);
      }

      if (var4 != 0 || var5 != 0) {
         Archive.method9081(var1, var4, var5, (byte)40);
      } else if (var1.field5386) {
         Archive.method9079(var1, 1361081137);
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqy;ZZI)I")
   @ObfuscatedName("wf")
   public static int method9263(JagNetThread var0, boolean var1, boolean var2, int var3) {
      if (var0 == null) {
         return var0.method9264(var1, var1, var3);
      } else {
         try {
            int var4 = 0;
            if (var1) {
               var4 += 2050000033 * var0.field5469 + var0.field5467 * 1350052665;
            }

            if (var2) {
               if (var3 != 1631254210) {
                  throw new IllegalStateException();
               }

               var4 += var0.field5463 * 2003362371 + -1274357739 * var0.field5479;
            }

            return var4;
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "qy.ap(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqn;IIIBZ)V")
   @ObfuscatedName("aa")
   void method9250(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
      long var7 = (var2 << 16) + var3;
      classQS var9 = (classQS)this.field5466.method8915(var7);
      if (var9 == null) {
         var9 = (classQS)this.field5468.method8915(var7);
         if (null == var9) {
            var9 = (classQS)this.field5471.method8915(var7);
            if (null != var9) {
               if (var6) {
                  var9.removeDual();
                  this.field5466.put(var9, var7);
                  this.field5479 -= -2105133251;
                  this.field5467 += 484135689;
               }
            } else {
               if (!var6) {
                  var9 = (classQS)this.field5472.method8915(var7);
                  if (var9 != null) {
                     return;
                  }
               }

               var9 = new classQS();
               var9.field5415 = var1;
               var9.field5414 = var4 * 708267658;
               var9.field5412 = var5;
               if (var6) {
                  this.field5466.put(var9, var7);
                  this.field5467 += -297460447;
               } else {
                  this.field5470.method9833(var9);
                  this.field5471.put(var9, var7);
                  this.field5479 += -2105133251;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqn;IIIBZ)V")
   @ObfuscatedName("aq")
   void method9251(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
      long var7 = (var2 << 16) + var3;
      classQS var9 = (classQS)this.field5466.method8915(var7);
      if (var9 == null) {
         var9 = (classQS)this.field5468.method8915(var7);
         if (null == var9) {
            var9 = (classQS)this.field5471.method8915(var7);
            if (null != var9) {
               if (var6) {
                  var9.removeDual();
                  this.field5466.put(var9, var7);
                  this.field5479 -= -2105133251;
                  this.field5467 += 484135689;
               }
            } else {
               if (!var6) {
                  var9 = (classQS)this.field5472.method8915(var7);
                  if (var9 != null) {
                     return;
                  }
               }

               var9 = new classQS();
               var9.field5415 = var1;
               var9.field5414 = var4 * -1220612917;
               var9.field5412 = var5;
               if (var6) {
                  this.field5466.put(var9, var7);
                  this.field5467 += 484135689;
               } else {
                  this.field5470.method9833(var9);
                  this.field5471.put(var9, var7);
                  this.field5479 += -2105133251;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqn;IIIBZ)V")
   @ObfuscatedName("be")
   void method9252(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
      long var7 = (var2 << 16) + var3;
      classQS var9 = (classQS)this.field5466.method8915(var7);
      if (var9 == null) {
         var9 = (classQS)this.field5468.method8915(var7);
         if (null == var9) {
            var9 = (classQS)this.field5471.method8915(var7);
            if (null != var9) {
               if (var6) {
                  var9.removeDual();
                  this.field5466.put(var9, var7);
                  this.field5479 -= -2105133251;
                  this.field5467 += -1257864047;
               }
            } else {
               if (!var6) {
                  var9 = (classQS)this.field5472.method8915(var7);
                  if (var9 != null) {
                     return;
                  }
               }

               var9 = new classQS();
               var9.field5415 = var1;
               var9.field5414 = var4 * 1496982630;
               var9.field5412 = var5;
               if (var6) {
                  this.field5466.put(var9, var7);
                  this.field5467 += 484135689;
               } else {
                  this.field5470.method9833(var9);
                  this.field5471.put(var9, var7);
                  this.field5479 += -2105133251;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bb")
   int method9260(int var1, int var2) {
      long var3 = (var1 << 16) + var2;
      return null != this.field5489 && this.field5489.key == var3
         ? 1 + -1722618313 * this.field5491.offset / (this.field5491.array.length - this.field5489.field5412)
         : 0;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bg")
   void method9253(int var1, int var2) {
      long var3 = (var1 << 16) + var2;
      classQS var5 = (classQS)this.field5471.method8915(var3);
      if (null != var5) {
         DualNodeDeque.method9836(this.field5470, var5);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqy;Z)V")
   @ObfuscatedName("lf")
   public static void method9235(JagNetThread var0, boolean var1) {
      if (var0.field5490 != null) {
         try {
            Buffer var2 = new Buffer(4);
            var2.writeByte(var1 ? 2 : 3, (short)-12594);
            var2.writeMedium(0, 2138012731);
            var0.field5490.write(var2.array, 0, 4, 748527431);
         } catch (IOException var5) {
            try {
               var0.field5490.close(-1883200549);
            } catch (Exception var4) {
            }

            var0.field5464 += -1101389911;
            var0.field5490 = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bz")
   void method9254(int var1, int var2) {
      long var3 = (var1 << 16) + var2;
      classQS var5 = (classQS)this.field5471.method8915(var3);
      if (null != var5) {
         DualNodeDeque.method9836(this.field5470, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bs")
   void method9255(int var1, int var2) {
      long var3 = (var1 << 16) + var2;
      classQS var5 = (classQS)this.field5471.method8915(var3);
      if (null != var5) {
         DualNodeDeque.method9836(this.field5470, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("av")
   public boolean method9231(int var1) {
      try {
         long var2 = ParamComposition.method4949((byte)15);
         int var4 = (int)(var2 - this.field5488 * 7245199905198616269L);
         this.field5488 = 6608554564537085445L * var2;
         if (var4 > 200) {
            if (var1 == -1397510155) {
               throw new IllegalStateException();
            }

            var4 = 200;
         }

         this.field5465 += 857778495 * var4;
         if (0 == this.field5463 * 2003362371) {
            if (var1 == -1397510155) {
               throw new IllegalStateException();
            }

            if (2050000033 * this.field5469 == 0 && -1274357739 * this.field5479 == 0 && 0 == 1350052665 * this.field5467) {
               if (var1 == -1397510155) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         if (this.field5490 == null) {
            if (var1 == -1397510155) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            try {
               if (-695875905 * this.field5465 > 30000) {
                  if (var1 == -1397510155) {
                     throw new IllegalStateException();
                  } else {
                     throw new IOException();
                  }
               } else {
                  while (2050000033 * this.field5469 < 200) {
                     if (var1 == -1397510155) {
                        throw new IllegalStateException();
                     }

                     if (1350052665 * this.field5467 <= 0) {
                        break;
                     }

                     if (var1 == -1397510155) {
                        throw new IllegalStateException();
                     }

                     classQS var5 = (classQS)this.field5466.first();
                     Buffer var6 = new Buffer(4);
                     var6.writeByte(1, (short)-30973);
                     var6.writeMedium((int)var5.key, 2146784013);
                     this.field5490.write(var6.array, 0, 4, 154652065);
                     this.field5468.put(var5, var5.key);
                     this.field5467 -= 484135689;
                     this.field5469 += 1923506017;
                  }

                  while (this.field5463 * 2003362371 < 200) {
                     if (var1 == -1397510155) {
                        throw new IllegalStateException();
                     }

                     if (this.field5479 * -1274357739 <= 0) {
                        break;
                     }

                     if (var1 == -1397510155) {
                        throw new IllegalStateException();
                     }

                     classQS var21 = (classQS)UserComparator3.method3682(this.field5470);
                     Buffer var23 = new Buffer(4);
                     var23.writeByte(0, (short)-17832);
                     var23.writeMedium((int)var21.key, 2145472173);
                     this.field5490.write(var23.array, 0, 4, 1862515806);
                     var21.removeDual();
                     this.field5472.put(var21, var21.key);
                     this.field5479 -= -2105133251;
                     this.field5463 += -339936661;
                  }

                  int var22 = 0;

                  while (true) {
                     label309: {
                        if (var22 < 100) {
                           if (var1 == -1397510155) {
                              throw new IllegalStateException();
                           }

                           int var24 = this.field5490.readUnsignedByte(-1807232209);
                           if (var24 < 0) {
                              if (var1 == -1397510155) {
                                 throw new IllegalStateException();
                              }

                              throw new IOException();
                           }

                           if (0 == var24) {
                              if (var1 == -1397510155) {
                                 throw new IllegalStateException();
                              }
                           } else {
                              this.field5465 = 0;
                              byte var7 = 0;
                              if (null == this.field5489) {
                                 if (var1 == -1397510155) {
                                    throw new IllegalStateException();
                                 }

                                 var7 = 8;
                              } else if (0 == -1218851699 * this.field5476) {
                                 if (var1 == -1397510155) {
                                    throw new IllegalStateException();
                                 }

                                 var7 = 1;
                              }

                              if (var7 > 0) {
                                 int var8 = var7 - this.field5478.offset * 2108391709;
                                 if (var8 > var24) {
                                    if (var1 == -1397510155) {
                                       throw new IllegalStateException();
                                    }

                                    var8 = var24;
                                 }

                                 this.field5490.read(this.field5478.array, this.field5478.offset * 2108391709, var8, 1534386910);
                                 if (this.field5473 != 0) {
                                    if (var1 == -1397510155) {
                                       throw new IllegalStateException();
                                    }

                                    for (int var9 = 0; var9 < var8; var9++) {
                                       this.field5478.array[var9 + this.field5478.offset * 2108391709] = (byte)(
                                          this.field5478.array[var9 + this.field5478.offset * 2108391709] ^ this.field5473
                                       );
                                    }
                                 }

                                 this.field5478.offset += 1741769013 * var8;
                                 if (this.field5478.offset * 2108391709 >= var7) {
                                    if (null == this.field5489) {
                                       if (var1 == -1397510155) {
                                          throw new IllegalStateException();
                                       }

                                       this.field5478.offset = 0;
                                       int var26 = this.field5478.readUnsignedByte(-1394576895);
                                       int var10 = Buffer.method12008(this.field5478, (byte)5);
                                       int var11 = this.field5478.readUnsignedByte(-148534255);
                                       int var12 = Buffer.method12015(this.field5478, 884923895);
                                       long var13 = (var26 << 16) + var10;
                                       classQS var15 = (classQS)this.field5468.method8915(var13);
                                       this.field5493 = true;
                                       if (var15 == null) {
                                          if (var1 == -1397510155) {
                                             throw new IllegalStateException();
                                          }

                                          var15 = (classQS)this.field5472.method8915(var13);
                                          this.field5493 = false;
                                       }

                                       if (var15 == null) {
                                          if (var1 == -1397510155) {
                                             throw new IllegalStateException();
                                          }

                                          throw new IOException();
                                       }

                                       byte var10000;
                                       if (0 == var11) {
                                          if (var1 == -1397510155) {
                                             throw new IllegalStateException();
                                          }

                                          var10000 = 5;
                                       } else {
                                          var10000 = 9;
                                       }

                                       byte var16 = var10000;
                                       this.field5489 = var15;
                                       this.field5491 = new Buffer(this.field5489.field5412 + var16 + var12);
                                       this.field5491.writeByte(var11, (short)-29182);
                                       this.field5491.writeInt(var12, 998359027);
                                       this.field5476 = -734612952;
                                       this.field5478.offset = 0;
                                    } else if (0 == this.field5476 * -1218851699) {
                                       if (var1 == -1397510155) {
                                          throw new IllegalStateException();
                                       }

                                       if (-1 == this.field5478.array[0]) {
                                          if (var1 == -1397510155) {
                                             throw new IllegalStateException();
                                          }

                                          this.field5476 = -1165568443;
                                          this.field5478.offset = 0;
                                       } else {
                                          this.field5489 = null;
                                       }
                                    }
                                    break label309;
                                 }

                                 if (var1 == -1397510155) {
                                    throw new IllegalStateException();
                                 }
                              } else {
                                 int var25 = this.field5491.array.length - this.field5489.field5412;
                                 int var27 = 512 - this.field5476 * -1218851699;
                                 if (var27 > var25 - 2108391709 * this.field5491.offset) {
                                    if (var1 == -1397510155) {
                                       throw new IllegalStateException();
                                    }

                                    var27 = var25 - this.field5491.offset * 2108391709;
                                 }

                                 if (var27 > var24) {
                                    if (var1 == -1397510155) {
                                       throw new IllegalStateException();
                                    }

                                    var27 = var24;
                                 }

                                 this.field5490.read(this.field5491.array, 2108391709 * this.field5491.offset, var27, 1534386910);
                                 if (0 != this.field5473) {
                                    if (var1 == -1397510155) {
                                       throw new IllegalStateException();
                                    }

                                    for (int var28 = 0; var28 < var27; var28++) {
                                       if (var1 == -1397510155) {
                                          throw new IllegalStateException();
                                       }

                                       this.field5491.array[this.field5491.offset * 2108391709 + var28] = (byte)(
                                          this.field5491.array[this.field5491.offset * 2108391709 + var28] ^ this.field5473
                                       );
                                    }
                                 }

                                 this.field5491.offset += var27 * 1741769013;
                                 this.field5476 += -1165568443 * var27;
                                 if (this.field5491.offset * 2108391709 == var25) {
                                    if (var1 == -1397510155) {
                                       throw new IllegalStateException();
                                    }

                                    if (this.field5489.key == 16711935L) {
                                       if (var1 == -1397510155) {
                                          throw new IllegalStateException();
                                       }

                                       this.field5492 = this.field5491;

                                       for (int var30 = 0; var30 < 256; var30++) {
                                          if (var1 == -1397510155) {
                                             throw new IllegalStateException();
                                          }

                                          Archive var31 = this.field5474[var30];
                                          if (null != var31) {
                                             if (var1 == -1397510155) {
                                                throw new IllegalStateException();
                                             }

                                             this.method9245(var31, var30, (byte)-1);
                                          }
                                       }
                                    } else {
                                       this.field5477.reset();
                                       this.field5477.update(this.field5491.array, 0, var25);
                                       int var29 = (int)this.field5477.getValue();
                                       if (var29 != 1340283107 * this.field5489.field5414) {
                                          if (var1 == -1397510155) {
                                             throw new IllegalStateException();
                                          }

                                          try {
                                             this.field5490.close(-1883200549);
                                          } catch (Exception var18) {
                                          }

                                          this.field5475 += -1007308057;
                                          this.field5490 = null;
                                          this.field5473 = (byte)(Math.random() * 255.0 + 1.0);
                                          return false;
                                       }

                                       this.field5475 = 0;
                                       this.field5464 = 0;
                                       int var10001 = (int)(this.field5489.key & 65535L);
                                       boolean var10003;
                                       if (16711680L == (this.field5489.key & 16711680L)) {
                                          if (var1 == -1397510155) {
                                             throw new IllegalStateException();
                                          }

                                          var10003 = true;
                                       } else {
                                          var10003 = false;
                                       }

                                       this.field5489.field5415.write(var10001, this.field5491.array, var10003, this.field5493, 1799083207);
                                    }

                                    this.field5489.remove();
                                    if (this.field5493) {
                                       if (var1 == -1397510155) {
                                          throw new IllegalStateException();
                                       }

                                       this.field5469 -= 1923506017;
                                    } else {
                                       this.field5463 -= -339936661;
                                    }

                                    this.field5476 = 0;
                                    this.field5489 = null;
                                    this.field5491 = null;
                                    break label309;
                                 }

                                 if (512 == -1218851699 * this.field5476) {
                                    if (var1 == -1397510155) {
                                       throw new IllegalStateException();
                                    }

                                    this.field5476 = 0;
                                    break label309;
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
                  this.field5490.close(-1883200549);
               } catch (Exception var17) {
               }

               this.field5464 += -1101389911;
               this.field5490 = null;
               return false;
            }
         }
      } catch (RuntimeException var20) {
         throw RestClientThreadFactory.newRunException(var20, "qy.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ay")
   public void method9266(int var1) {
      try {
         if (null != this.field5490) {
            if (var1 == -230462863) {
               throw new IllegalStateException();
            }

            try {
               this.field5490.close(-1883200549);
            } catch (Exception var3) {
            }

            this.field5490 = null;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qy.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZZI)I")
   @ObfuscatedName("ap")
   public int method9264(boolean var1, boolean var2, int var3) {
      try {
         int var4 = 0;
         if (var1) {
            var4 += 2050000033 * this.field5465 + this.field5479 * 1350052665;
         }

         if (var2) {
            if (var3 != 1631254210) {
               throw new IllegalStateException();
            }

            var4 += this.field5476 * 2003362371 + -1274357739 * this.field5469;
         }

         return var4;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "qy.ap(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltd;ZI)V")
   @ObfuscatedName("ag")
   public void method9241(AbstractSocket var1, boolean var2, int var3) {
      try {
         if (this.field5490 != null) {
            if (var3 == 743318851) {
               throw new IllegalStateException();
            }

            try {
               this.field5490.close(-1883200549);
            } catch (Exception var8) {
            }

            this.field5490 = null;
         }

         this.field5490 = var1;
         this.method9232(var2, -2133597768);
         this.field5478.offset = 0;
         this.field5489 = null;
         this.field5492 = null;
         this.field5476 = 0;

         while (true) {
            classQS var4 = (classQS)this.field5466.next();
            if (null == var4) {
               if (var3 == 743318851) {
                  return;
               } else {
                  while (true) {
                     var4 = (classQS)this.field5471.method8927();
                     if (var4 == null) {
                        if (var3 == 743318851) {
                           throw new IllegalStateException();
                        } else {
                           if (0 != this.field5473) {
                              if (var3 == 743318851) {
                                 throw new IllegalStateException();
                              }

                              try {
                                 Buffer var11 = new Buffer(4);
                                 var11.writeByte(4, (short)-22130);
                                 var11.writeByte(this.field5473, (short)-1965);
                                 var11.writeShortAdd(0, -1636442033);
                                 this.field5490.write(var11.array, 0, 4, 1489277291);
                              } catch (IOException var7) {
                                 try {
                                    this.field5490.close(-1883200549);
                                 } catch (Exception var6) {
                                 }

                                 this.field5475 += -1101389911;
                                 this.field5490 = null;
                              }
                           }

                           this.field5479 = 0;
                           this.field5488 = ParamComposition.method4949((byte)15) * 6608554564537085445L;
                           return;
                        }
                     }

                     DualNodeDeque.method9836(this.field5470, var4);
                     this.field5472.method8931(var4, var4.key);
                     this.field5465 = this.field5476 + -2105133251;
                     this.field5479 = this.field5467 - -339936661;
                  }
               }
            }

            this.field5471.method8920(var4, var4.key);
            this.field5469 = this.field5463 + 484135689;
            this.field5476 = this.field5481 - 1923506017;
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "qy.ag(" + ')');
      }
   }
}
