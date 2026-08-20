import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ly")
public class classLY {
   @ObfuscatedSignature(descriptor = "Lrj;")
   @ObfuscatedName("ay")
   classRJ field4438;
   @ObfuscatedName("az")
   boolean[] field4433;
   @ObfuscatedSignature(descriptor = "[[Llw;")
   @ObfuscatedName("ax")
   public Widget[][] field4440;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ab")
   AbstractArchive field4434;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ag")
   AbstractArchive field4437;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("aj")
   EvictingDualNodeHashTable field4432;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("af")
   AbstractArchive field4435;
   @ObfuscatedName("ac")
   Map field4441 = new HashMap();
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("aa")
   EvictingDualNodeHashTable field4430 = new EvictingDualNodeHashTable(200);
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ae")
   AbstractArchive field4439;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("al")
   EvictingDualNodeHashTable field4429;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("as")
   AbstractArchive field4442;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ao")
   EvictingDualNodeHashTable field4431 = new EvictingDualNodeHashTable(50);
   @ObfuscatedSignature(descriptor = "Lrj;")
   @ObfuscatedName("aq")
   classRJ field4436;
   @ObfuscatedName("rj")
   static Image field4443;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   public void method7392() {
      EvictingDualNodeHashTable.method6431(this.field4430);
      EvictingDualNodeHashTable.method6431(this.field4431);
      EvictingDualNodeHashTable.method6431(this.field4429);
      EvictingDualNodeHashTable.method6431(this.field4432);
   }

   @ObfuscatedSignature(descriptor = "(Lly;II)Z")
   @ObfuscatedName("sq")
   public static boolean method7381(classLY var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method7385(var1, var1);
      } else {
         try {
            if (var1 >= 0) {
               if (var1 < var0.field4440.length) {
                  if (var0.field4433[var1]) {
                     if (var2 <= -324749371) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }

                  if (!var0.field4435.method11866(var1, -906797091)) {
                     if (var2 <= -324749371) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  int var3 = var0.field4435.method11868(var1, -1891658016);
                  if (var3 == 0) {
                     if (var2 <= -324749371) {
                        throw new IllegalStateException();
                     }

                     var0.field4433[var1] = true;
                     return true;
                  }

                  if (null == var0.field4440[var1]) {
                     if (var2 <= -324749371) {
                        throw new IllegalStateException();
                     }

                     var0.field4440[var1] = new Widget[var3];
                  }

                  for (int var4 = 0; var4 < var3; var4++) {
                     if (var2 <= -324749371) {
                        throw new IllegalStateException();
                     }

                     if (null == var0.field4440[var1][var4]) {
                        if (var2 <= -324749371) {
                           throw new IllegalStateException();
                        }

                        byte[] var5 = var0.field4435.method11867(var1, var4, -600631346);
                        if (null != var5) {
                           if (var2 <= -324749371) {
                              throw new IllegalStateException();
                           }

                           Widget var6 = new Widget();
                           var0.field4440[var1][var4] = var6;
                           var6.field4329 = (var4 + (var1 << 16)) * 519254441;
                           if (-1 == var5[0]) {
                              if (var2 <= -324749371) {
                                 throw new IllegalStateException();
                              }

                              var6.method7172(new classXY(var5), 1218236279);
                           } else {
                              Widget.method7170(var6, new classXY(var5), (byte)-16);
                           }

                           if (null != var0.field4439) {
                              if (var2 <= -324749371) {
                                 throw new IllegalStateException();
                              }

                              byte[] var7 = var0.field4439.method11867(var1, var4, -608292274);
                              if (null != var7) {
                                 if (var2 <= -324749371) {
                                    throw new IllegalStateException();
                                 }

                                 if (var7.length > 0) {
                                    if (var2 <= -324749371) {
                                       throw new IllegalStateException();
                                    }

                                    var6.method7175(new classXY(var7), -1144744404);
                                    var0.field4441.put(var6.field4332, var1);
                                 }
                              }
                           }
                        }
                     }
                  }

                  for (int var9 = 0; var9 < var3; var9++) {
                     Widget var10 = var0.field4440[var1][var9];
                     if (null != var10) {
                        if (var2 <= -324749371) {
                           throw new IllegalStateException();
                        }

                        if (-1502647899 * var10.field4342 != -1) {
                           if (var2 <= -324749371) {
                              throw new IllegalStateException();
                           }

                           Widget var11 = var0.field4440[var1][-1502647899 * var10.field4342 & 65535];
                           if (var9 > var11.field4266 * 379541057) {
                              var11.field4266 = -1479820863 * var9;
                           }

                           if (var9 < var11.field4265 * -1210177335) {
                              var11.field4265 = var9 * -452038279;
                           }
                        }
                     }
                  }

                  var0.field4433[var1] = true;
                  return true;
               }

               if (var2 <= -324749371) {
                  throw new IllegalStateException();
               }
            }

            return false;
         } catch (RuntimeException var8) {
            throw classEG.method3884(var8, "ly.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("lf")
   public Widget method7397(int var1) {
      return method7375(this, var1, (byte)126);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ao")
   public boolean method7382(int var1) {
      if (var1 >= 0 && var1 < this.field4440.length) {
         if (this.field4433[var1]) {
            return true;
         } else if (!this.field4435.method11866(var1, -906797091)) {
            return false;
         } else {
            int var2 = this.field4435.method11868(var1, -254740276);
            if (var2 == 0) {
               this.field4433[var1] = true;
               return true;
            } else {
               if (null == this.field4440[var1]) {
                  this.field4440[var1] = new Widget[var2];
               }

               for (int var3 = 0; var3 < var2; var3++) {
                  if (null == this.field4440[var1][var3]) {
                     byte[] var4 = this.field4435.method11867(var1, var3, -1308427039);
                     if (null != var4) {
                        Widget var5 = new Widget();
                        this.field4440[var1][var3] = var5;
                        var5.field4329 = (var3 + (var1 << 16)) * 519254441;
                        if (-1 == var4[0]) {
                           var5.method7172(new classXY(var4), 1218236279);
                        } else {
                           Widget.method7170(var5, new classXY(var4), (byte)-119);
                        }

                        if (null != this.field4439) {
                           byte[] var6 = this.field4439.method11867(var1, var3, -1471794850);
                           if (null != var6 && var6.length > 0) {
                              var5.method7175(new classXY(var6), -1161191361);
                              this.field4441.put(var5.field4332, var1);
                           }
                        }
                     }
                  }
               }

               for (int var7 = 0; var7 < var2; var7++) {
                  Widget var8 = this.field4440[var1][var7];
                  if (null != var8 && -1502647899 * var8.field4342 != -1) {
                     Widget var9 = this.field4440[var1][-1502647899 * var8.field4342 & -2043971647];
                     if (var7 > var9.field4266 * 306317772) {
                        var9.field4266 = -1479820863 * var7;
                     }

                     if (var7 < var9.field4265 * -1210177335) {
                        var9.field4265 = var7 * -452038279;
                     }
                  }
               }

               this.field4433[var1] = true;
               return true;
            }
         }
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ab")
   public void method7387(int var1, int var2) {
      try {
         if (-1 == var1) {
            if (var2 == -2026063788) {
               throw new IllegalStateException();
            }
         } else if (this.field4433[var1]) {
            this.field4435.method11865(var1, -1338922845);
            if (null == this.field4440[var1]) {
               if (var2 != -2026063788) {
                  ;
               }
            } else {
               for (int var3 = 0; var3 < this.field4440[var1].length; var3++) {
                  if (var2 == -2026063788) {
                     throw new IllegalStateException();
                  }

                  if (this.field4440[var1][var3] != null) {
                     if (var2 == -2026063788) {
                        throw new IllegalStateException();
                     }

                     this.field4440[var1][var3] = null;
                  }
               }

               this.field4440[var1] = null;
               this.field4433[var1] = false;
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ly.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ac")
   public boolean method7398(int var1) {
      return method7381(this, var1, -56682132);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lle;)V")
   @ObfuscatedName("hu")
   public static void method7374(classLE var0) {
      if (var0 == null) {
         var0.method6750();
      } else {
         var0.field4114 = classDD.method2983(16711680) * 4380477302914991203L;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ag")
   public void method7393(byte var1) {
      try {
         EvictingDualNodeHashTable.method6431(this.field4430);
         EvictingDualNodeHashTable.method6431(this.field4431);
         EvictingDualNodeHashTable.method6431(this.field4429);
         EvictingDualNodeHashTable.method6431(this.field4432);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ly.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Llw;")
   @ObfuscatedName("ax")
   public Widget method7377(int var1, int var2) {
      Widget var3 = method7375(this, var1, (byte)88);
      if (-1 == var2) {
         return var3;
      } else {
         return null != var3 && null != var3.field4340 && var2 < var3.field4340.length ? var3.field4340[var2] : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lly;IIB)Llw;")
   @ObfuscatedName("jg")
   public static Widget method7378(classLY var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         var0.method7380(var1, var1, var3);
      }

      try {
         Widget var4 = method7375(var0, var1, (byte)82);
         if (-1 == var2) {
            if (var3 >= 32) {
               throw new IllegalStateException();
            } else {
               return var4;
            }
         } else {
            if (null != var4) {
               if (var3 >= 32) {
                  throw new IllegalStateException();
               }

               if (null != var4.field4340) {
                  if (var3 >= 32) {
                     throw new IllegalStateException();
                  }

                  if (var2 < var4.field4340.length) {
                     return var4.field4340[var2];
                  }

                  if (var3 >= 32) {
                     throw new IllegalStateException();
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ly.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lly;IB)Llw;")
   @ObfuscatedName("is")
   public static Widget method7375(classLY var0, int var1, byte var2) {
      if (var0 == null) {
         return var0.method7376(var1, var2);
      } else {
         try {
            int var3 = var1 >> 16;
            int var4 = var1 & 65535;
            if (var0.field4440[var3] != null) {
               if (var2 <= 16) {
                  throw new IllegalStateException();
               }

               if (var0.field4440[var3][var4] != null) {
                  return var0.field4440[var3][var4];
               }

               if (var2 <= 16) {
                  throw new IllegalStateException();
               }
            }

            boolean var5 = method7381(var0, var3, 870024905);
            return !var5 ? null : var0.field4440[var3][var4];
         } catch (RuntimeException var6) {
            throw classEG.method3884(var6, "ly.az(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lly;I)V")
   @ObfuscatedName("bj")
   public static void method7388(classLY var0, int var1) {
      if (var0 == null) {
         var0.method7391(var1);
      }

      if (-1 != var1) {
         if (var0.field4433[var1]) {
            var0.field4435.method11865(var1, 1588962690);
            if (null != var0.field4440[var1]) {
               for (int var2 = 0; var2 < var0.field4440[var1].length; var2++) {
                  if (var0.field4440[var1][var2] != null) {
                     var0.field4440[var1][var2] = null;
                  }
               }

               var0.field4440[var1] = null;
               var0.field4433[var1] = false;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Llw;")
   @ObfuscatedName("as")
   public Widget method7379(int var1, int var2) {
      Widget var3 = method7375(this, var1, (byte)19);
      if (-1 == var2) {
         return var3;
      } else {
         return null != var3 && null != var3.field4340 && var2 < var3.field4340.length ? var3.field4340[var2] : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("vs")
   public boolean method7383(int var1) {
      if (var1 >= 0 && var1 < this.field4440.length) {
         if (this.field4433[var1]) {
            return true;
         } else if (!this.field4435.method11866(var1, -906797091)) {
            return false;
         } else {
            int var2 = this.field4435.method11868(var1, -1881368475);
            if (var2 == 0) {
               this.field4433[var1] = true;
               return true;
            } else {
               if (null == this.field4440[var1]) {
                  this.field4440[var1] = new Widget[var2];
               }

               for (int var3 = 0; var3 < var2; var3++) {
                  if (null == this.field4440[var1][var3]) {
                     byte[] var4 = this.field4435.method11867(var1, var3, -1622891954);
                     if (null != var4) {
                        Widget var5 = new Widget();
                        this.field4440[var1][var3] = var5;
                        var5.field4329 = (var3 + (var1 << 16)) * 519254441;
                        if (-1 == var4[0]) {
                           var5.method7172(new classXY(var4), 1218236279);
                        } else {
                           Widget.method7170(var5, new classXY(var4), (byte)-71);
                        }

                        if (null != this.field4439) {
                           byte[] var6 = this.field4439.method11867(var1, var3, -1569057326);
                           if (null != var6 && var6.length > 0) {
                              var5.method7175(new classXY(var6), 394206728);
                              this.field4441.put(var5.field4332, var1);
                           }
                        }
                     }
                  }
               }

               for (int var7 = 0; var7 < var2; var7++) {
                  Widget var8 = this.field4440[var1][var7];
                  if (null != var8 && -1502647899 * var8.field4342 != -1) {
                     Widget var9 = this.field4440[var1][-1502647899 * var8.field4342 & 65535];
                     if (var7 > var9.field4266 * 379541057) {
                        var9.field4266 = -1479820863 * var7;
                     }

                     if (var7 < var9.field4265 * -1210177335) {
                        var9.field4265 = var7 * -452038279;
                     }
                  }
               }

               this.field4433[var1] = true;
               return true;
            }
         }
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aa")
   public boolean method7384(int var1) {
      if (var1 >= 0 && var1 < this.field4440.length) {
         if (this.field4433[var1]) {
            return true;
         } else if (!this.field4435.method11866(var1, -906797091)) {
            return false;
         } else {
            int var2 = this.field4435.method11868(var1, 1373563660);
            if (var2 == 0) {
               this.field4433[var1] = true;
               return true;
            } else {
               if (null == this.field4440[var1]) {
                  this.field4440[var1] = new Widget[var2];
               }

               for (int var3 = 0; var3 < var2; var3++) {
                  if (null == this.field4440[var1][var3]) {
                     byte[] var4 = this.field4435.method11867(var1, var3, -1318908219);
                     if (null != var4) {
                        Widget var5 = new Widget();
                        this.field4440[var1][var3] = var5;
                        var5.field4329 = (var3 + (var1 << 16)) * 519254441;
                        if (-1 == var4[0]) {
                           var5.method7172(new classXY(var4), 1218236279);
                        } else {
                           Widget.method7170(var5, new classXY(var4), (byte)-6);
                        }

                        if (null != this.field4439) {
                           byte[] var6 = this.field4439.method11867(var1, var3, -1233602195);
                           if (null != var6 && var6.length > 0) {
                              var5.method7175(new classXY(var6), -472614399);
                              this.field4441.put(var5.field4332, var1);
                           }
                        }
                     }
                  }
               }

               for (int var7 = 0; var7 < var2; var7++) {
                  Widget var8 = this.field4440[var1][var7];
                  if (null != var8 && -1502647899 * var8.field4342 != -1) {
                     Widget var9 = this.field4440[var1][-1502647899 * var8.field4342 & 65535];
                     if (var7 > var9.field4266 * 379541057) {
                        var9.field4266 = -1479820863 * var7;
                     }

                     if (var7 < var9.field4265 * -1210177335) {
                        var9.field4265 = var7 * -452038279;
                     }
                  }
               }

               this.field4433[var1] = true;
               return true;
            }
         }
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   public void method7389(int var1) {
      if (-1 != var1) {
         if (this.field4433[var1]) {
            this.field4435.method11865(var1, 1815138758);
            if (null != this.field4440[var1]) {
               for (int var2 = 0; var2 < this.field4440[var1].length; var2++) {
                  if (this.field4440[var1][var2] != null) {
                     this.field4440[var1][var2] = null;
                  }
               }

               this.field4440[var1] = null;
               this.field4433[var1] = false;
            }
         }
      }
   }

   protected classLY(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
      this.field4429 = new EvictingDualNodeHashTable(20);
      this.field4432 = new EvictingDualNodeHashTable(8);
      this.field4438 = new classRJ(10, classRB.field5635);
      this.field4436 = new classRJ(10, classRB.field5635);
      int var6 = 0;
      if (null != var1) {
         this.field4435 = var1;
         this.field4434 = var2;
         this.field4437 = var3;
         this.field4442 = var4;
         this.field4439 = var5;
         var6 = this.field4435.method11832((byte)1);
      }

      this.field4440 = new Widget[var6][];
      this.field4433 = new boolean[var6];
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ay")
   public void method7390(int var1) {
      if (-1 != var1) {
         if (this.field4433[var1]) {
            this.field4435.method11865(var1, 1220924443);
            if (null != this.field4440[var1]) {
               for (int var2 = 0; var2 < this.field4440[var1].length; var2++) {
                  if (this.field4440[var1][var2] != null) {
                     this.field4440[var1][var2] = null;
                  }
               }

               this.field4440[var1] = null;
               this.field4433[var1] = false;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   public void method7394() {
      EvictingDualNodeHashTable.method6431(this.field4430);
      EvictingDualNodeHashTable.method6431(this.field4431);
      EvictingDualNodeHashTable.method6431(this.field4429);
      EvictingDualNodeHashTable.method6431(this.field4432);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgc;III)V")
   @ObfuscatedName("lr")
   public static void method7386(CollisionMap var0, int var1, int var2, int var3) {
      var0.field2550[var1][var2] = var0.field2550[var1][var2] & ~var3;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   public void method7395() {
      EvictingDualNodeHashTable.method6431(this.field4430);
      EvictingDualNodeHashTable.method6431(this.field4431);
      EvictingDualNodeHashTable.method6431(this.field4429);
      EvictingDualNodeHashTable.method6431(this.field4432);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   public void method7396() {
      EvictingDualNodeHashTable.method6431(this.field4430);
      EvictingDualNodeHashTable.method6431(this.field4431);
      EvictingDualNodeHashTable.method6431(this.field4429);
      EvictingDualNodeHashTable.method6431(this.field4432);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ae")
   public boolean method7385(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var1 < this.field4440.length) {
               if (this.field4433[var1]) {
                  if (var2 <= -324749371) {
                     throw new IllegalStateException();
                  }

                  return true;
               }

               if (!this.field4437.method11866(var1, -906797091)) {
                  if (var2 <= -324749371) {
                     throw new IllegalStateException();
                  }

                  return false;
               }

               int var3 = this.field4439.method11868(var1, -1891658016);
               if (var3 == 0) {
                  if (var2 <= -324749371) {
                     throw new IllegalStateException();
                  }

                  this.field4433[var1] = true;
                  return true;
               }

               if (null == this.field4440[var1]) {
                  if (var2 <= -324749371) {
                     throw new IllegalStateException();
                  }

                  this.field4440[var1] = new Widget[var3];
               }

               for (int var4 = 0; var4 < var3; var4++) {
                  if (var2 <= -324749371) {
                     throw new IllegalStateException();
                  }

                  if (null == this.field4440[var1][var4]) {
                     if (var2 <= -324749371) {
                        throw new IllegalStateException();
                     }

                     byte[] var5 = this.field4442.method11873(var1, var4, -600631346);
                     if (null != var5) {
                        if (var2 <= -324749371) {
                           throw new IllegalStateException();
                        }

                        Widget var6 = new Widget();
                        this.field4440[var1][var4] = var6;
                        var6.field4319 = (var4 + (var1 << 16)) * 519254441;
                        if (-1 == var5[0]) {
                           if (var2 <= -324749371) {
                              throw new IllegalStateException();
                           }

                           var6.method7172(new classXY(var5), 1218236279);
                        } else {
                           Widget.method7170(var6, new classXY(var5), (byte)-16);
                        }

                        if (null != this.field4434) {
                           if (var2 <= -324749371) {
                              throw new IllegalStateException();
                           }

                           byte[] var7 = this.field4442.method11873(var1, var4, -608292274);
                           if (null != var7) {
                              if (var2 <= -324749371) {
                                 throw new IllegalStateException();
                              }

                              if (var7.length > 0) {
                                 if (var2 <= -324749371) {
                                    throw new IllegalStateException();
                                 }

                                 var6.method7175(new classXY(var7), -1144744404);
                                 this.field4441.put(var6.field4332, var1);
                              }
                           }
                        }
                     }
                  }
               }

               for (int var9 = 0; var9 < var3; var9++) {
                  Widget var10 = this.field4440[var1][var9];
                  if (null != var10) {
                     if (var2 <= -324749371) {
                        throw new IllegalStateException();
                     }

                     if (-1502647899 * var10.field4342 != -1) {
                        if (var2 <= -324749371) {
                           throw new IllegalStateException();
                        }

                        Widget var11 = this.field4440[var1][-1502647899 * var10.field4242 & 65535];
                        if (var9 > var11.field4341 * 379541057) {
                           var11.field4335 = -1479820863 * var9;
                        }

                        if (var9 < var11.field4291 * -1210177335) {
                           var11.field4250 = var9 * -452038279;
                        }
                     }
                  }
               }

               this.field4433[var1] = true;
               return true;
            }

            if (var2 <= -324749371) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "ly.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Llw;")
   @ObfuscatedName("az")
   public Widget method7376(int var1, byte var2) {
      try {
         int var3 = var1 >> 16;
         int var4 = var1 & 65535;
         if (this.field4440[var3] != null) {
            if (var2 <= 16) {
               throw new IllegalStateException();
            }

            if (this.field4440[var3][var4] != null) {
               return this.field4440[var3][var4];
            }

            if (var2 <= 16) {
               throw new IllegalStateException();
            }
         }

         boolean var5 = method7381(this, var3, 870024905);
         return !var5 ? null : this.field4440[var3][var4];
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "ly.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)Llw;")
   @ObfuscatedName("af")
   public Widget method7380(int var1, int var2, byte var3) {
      try {
         Widget var4 = method7375(this, var1, (byte)82);
         if (-1 == var2) {
            if (var3 >= 32) {
               throw new IllegalStateException();
            } else {
               return var4;
            }
         } else {
            if (null != var4) {
               if (var3 >= 32) {
                  throw new IllegalStateException();
               }

               if (null != var4.field4340) {
                  if (var3 >= 32) {
                     throw new IllegalStateException();
                  }

                  if (var2 < var4.field4340.length) {
                     return var4.field4340[var2];
                  }

                  if (var3 >= 32) {
                     throw new IllegalStateException();
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ly.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   public void method7391(int var1) {
      if (-1 != var1) {
         if (this.field4433[var1]) {
            this.field4435.method11865(var1, 1588962690);
            if (null != this.field4440[var1]) {
               for (int var2 = 0; var2 < this.field4440[var1].length; var2++) {
                  if (this.field4440[var1][var2] != null) {
                     this.field4440[var1][var2] = null;
                  }
               }

               this.field4440[var1] = null;
               this.field4433[var1] = false;
            }
         }
      }
   }
}
