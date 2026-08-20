import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("og")
public class class380 {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field4612 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field4611 = 1;
   @ObfuscatedName("ak")
   int[] field4608;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field4610 = 3;
   @ObfuscatedName("aw")
   int field4613;
   @ObfuscatedName("aj")
   int[] field4607 = new int[32];
   @ObfuscatedSignature(descriptor = "Lea;")
   @ObfuscatedName("ar")
   public static class105 pcmPlayerProvider;
   @ObfuscatedName("ae")
   int field4606;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field4609 = 34;
   @ObfuscatedSignature(descriptor = "Lof;")
   @ObfuscatedName("an")
   Widget field4615;

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bz")
   public int[] method8264() {
      return Arrays.copyOf(this.field4607, -1068357947 * this.field4613);
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;Lqm;I)V")
   @ObfuscatedName("av")
   public static void method8243(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, int var3) {
      try {
         GrandExchangeOfferWorldComparator.HitSplatDefinition_archive = var0;
         classWG.field6371 = var1;
         class228.HitSplatDefinition_fontsArchive = var2;
         PlatformInfo var10000 = WorldMapLabelSize.platformInfo;
         WorldMapLabelSize.platformInfo.clockSpeed = (Arrays.hashCode(SecureUrlRequester.client.field1024.getClass().getSigners()) >> 2) * 1700970496
            + -1618552320
            + (Archive.field5389 - 1) * -1509453216;
         var10000.field5119 = client.method2500();
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "og.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("at")
   final void method8244(int var1, int var2) {
      try {
         if (this.field4613 * 117389541 == this.field4607.length) {
            this.field4607 = Arrays.copyOf(this.field4607, 2 * this.field4607.length);
         }

         this.field4607[(this.field4613 += 1341506797) * 117389541 - 1] = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "og.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;ZI)V")
   @ObfuscatedName("ag")
   final void method8246(Widget var1, boolean var2, int var3) {
      try {
         int var10000;
         if (this.field4615 == var1) {
            if (var3 <= 465659907) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = -1516264759 * var1.field4453;
         }

         int var4 = var10000;
         if (this.field4615 == var1) {
            if (var3 <= 465659907) {
               return;
            }

            var10000 = var1.children.length - 1;
         } else {
            var10000 = var1.field4454 * -86298045;
         }

         int var5 = var10000;

         for (int var6 = var4; var6 <= var5; var6++) {
            if (var3 <= 465659907) {
               throw new IllegalStateException();
            }

            Widget var7 = this.field4615.children[var6];
            if (var7 != null) {
               if (var3 <= 465659907) {
                  throw new IllegalStateException();
               }

               if (var7.field4451 * 1865628485 == var1.childIndex * 2077538819) {
                  if (var3 <= 465659907) {
                     throw new IllegalStateException();
                  }

                  this.method8244(2077538819 * var7.childIndex, -425350419);
                  if (var2) {
                     if (var3 <= 465659907) {
                        return;
                     }

                     if (-1516264759 * var7.field4453 <= var7.field4454 * -86298045) {
                        if (var3 <= 465659907) {
                           return;
                        }

                        this.method8246(var7, true, 492667893);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "og.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   public int method8251(int var1) {
      try {
         return this.field4613 * 117389541;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "og.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("ae")
   public Widget method8255(int var1) {
      try {
         int var2 = this.method8259((short)19972);
         Widget var10000;
         if (var2 >= 0) {
            if (var1 == 1228479413) {
               throw new IllegalStateException();
            }

            var10000 = this.field4615.children[var2];
         } else {
            var10000 = null;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "og.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("aj")
   public int method8259(short var1) {
      try {
         return -532148473 * this.field4606 >= 117389541 * this.field4613 ? -1 : this.field4607[(this.field4606 += 459681463) * -532148473 - 1];
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "og.aj(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Log;ILjava/lang/Object;Ljava/lang/Object;)V")
   @ObfuscatedName("sc")
   public static void method8269(class380 var0, int var1, Object var2, Object var3) {
      int[] var4 = var0.field4607;
      int var5 = var0.field4613 * 117389541;
      var0.field4607 = var0.field4608;
      var0.field4613 = 0;
      var0.field4608 = var4;

      for (int var6 = 0; var6 < var5; var6++) {
         Widget var7 = var0.field4615.children[var4[var6]];
         if (var7 != null) {
            Object var8 = var7.method8068(var1, var3, (byte)61);
            if (var2 == var8 || var8 != null && var8.equals(var2)) {
               var0.method8244(var4[var6], -425350419);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bs")
   public int[] method8265() {
      return Arrays.copyOf(this.field4607, 117389541 * this.field4613);
   }

   @ObfuscatedSignature(descriptor = "(ILof;I)V")
   @ObfuscatedName("ay")
   public void method8239(int var1, Widget var2, int var3) {
      this.field4615 = var2;
      this.field4613 = 0;
      this.field4606 = 0;
      if (var1 >= 0 && var1 < 3) {
         if (null == var2 || -1 == var2.childIndex * 2077538819 && var2.type * 928687775 == 0) {
            if (null != var2 && null != var2.children) {
               if (0 == var1) {
                  Widget[] var4 = var2.children;

                  for (int var5 = 0; var5 < var4.length; var5++) {
                     Widget var6 = var4[var5];
                     if (var6 != null) {
                        this.method8244(1846652982 * var6.childIndex, -425350419);
                     }
                  }
               } else {
                  boolean var7 = var1 != 1;
                  if (-1 == var3) {
                     this.method8246(var2, var7, 1860500775);
                  } else if (var3 >= 0 && var3 < var2.children.length && var2.children[var3] != null) {
                     this.method8246(var2.children[var3], var7, 1970278511);
                  }
               }
            }
         } else {
            throw new RuntimeException("");
         }
      } else {
         throw new RuntimeException("");
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Log;ILof;I)V")
   @ObfuscatedName("fa")
   public static void method8240(class380 var0, int var1, Widget var2, int var3) {
      if (var0 == null) {
         var0.method8253();
      }

      var0.field4615 = var2;
      var0.field4613 = 0;
      var0.field4606 = 0;
      if (var1 >= 0 && var1 < 3) {
         if (null == var2 || -1 == var2.childIndex * 1628747866 && var2.type * -1753840080 == 0) {
            if (null != var2 && null != var2.children) {
               if (0 == var1) {
                  Widget[] var4 = var2.children;

                  for (int var5 = 0; var5 < var4.length; var5++) {
                     Widget var6 = var4[var5];
                     if (var6 != null) {
                        var0.method8244(2077538819 * var6.childIndex, -425350419);
                     }
                  }
               } else {
                  boolean var7 = var1 != 1;
                  if (-1 == var3) {
                     var0.method8246(var2, var7, 855093679);
                  } else if (var3 >= 0 && var3 < var2.children.length && var2.children[var3] != null) {
                     var0.method8246(var2.children[var3], var7, 1923023959);
                  }
               }
            }
         } else {
            throw new RuntimeException("");
         }
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(ILof;IB)V")
   @ObfuscatedName("av")
   public void method8241(int var1, Widget var2, int var3, byte var4) {
      try {
         this.field4615 = var2;
         this.field4613 = 0;
         this.field4606 = 0;
         if (var1 >= 0) {
            if (var1 < 3) {
               if (null != var2) {
                  if (var4 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (-1 != var2.childIndex * 2077538819) {
                     throw new RuntimeException("");
                  }

                  if (var4 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (var2.type * 928687775 != 0) {
                     if (var4 <= 1) {
                        throw new IllegalStateException();
                     }

                     throw new RuntimeException("");
                  }
               }

               if (null != var2) {
                  if (var4 <= 1) {
                     return;
                  }

                  if (null != var2.children) {
                     if (0 == var1) {
                        if (var4 <= 1) {
                           return;
                        }

                        Widget[] var5 = var2.children;

                        for (int var6 = 0; var6 < var5.length; var6++) {
                           if (var4 <= 1) {
                              throw new IllegalStateException();
                           }

                           Widget var7 = var5[var6];
                           if (var7 != null) {
                              if (var4 <= 1) {
                                 throw new IllegalStateException();
                              }

                              this.method8244(2077538819 * var7.childIndex, -425350419);
                           }
                        }
                     } else {
                        boolean var10000;
                        if (var1 != 1) {
                           if (var4 <= 1) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                        } else {
                           var10000 = false;
                        }

                        boolean var9 = var10000;
                        if (-1 == var3) {
                           if (var4 <= 1) {
                              throw new IllegalStateException();
                           }

                           this.method8246(var2, var9, 1442841099);
                        } else if (var3 >= 0) {
                           if (var4 <= 1) {
                              throw new IllegalStateException();
                           }

                           if (var3 < var2.children.length) {
                              if (var4 <= 1) {
                                 throw new IllegalStateException();
                              }

                              if (var2.children[var3] != null) {
                                 if (var4 <= 1) {
                                    throw new IllegalStateException();
                                 }

                                 this.method8246(var2.children[var3], var9, 1488597577);
                              }
                           }
                        }
                     }

                     return;
                  }

                  if (var4 <= 1) {
                     throw new IllegalStateException();
                  }
               }

               return;
            }

            if (var4 <= 1) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "og.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;Z)V")
   @ObfuscatedName("ad")
   final void method8247(Widget var1, boolean var2) {
      int var3 = this.field4615 == var1 ? 0 : -1516264759 * var1.field4453;
      int var4 = this.field4615 == var1 ? var1.children.length - 1 : var1.field4454 * -86298045;

      for (int var5 = var3; var5 <= var4; var5++) {
         Widget var6 = this.field4615.children[var5];
         if (var6 != null && var6.field4451 * 1865628485 == var1.childIndex * 2077538819) {
            this.method8244(2077538819 * var6.childIndex, -425350419);
            if (var2 && -1516264759 * var6.field4453 <= var6.field4454 * -86298045) {
               this.method8246(var6, true, 986431409);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxt;I)V")
   @ObfuscatedName("ez")
   public static void method8274(SpritePixels var0, int var1) {
      if (var0 == null) {
         var0.pad(var1);
      }

      if (var0.subWidth != var0.width || var0.subHeight != var0.height) {
         int var2 = var1;
         if (var1 > var0.xOffset) {
            var2 = var0.xOffset;
         }

         int var3 = var1;
         if (var1 + var0.xOffset + var0.subWidth > var0.width) {
            var3 = var0.width - var0.xOffset - var0.subWidth;
         }

         int var4 = var1;
         if (var1 > var0.yOffset) {
            var4 = var0.yOffset;
         }

         int var5 = var1;
         if (var1 + var0.yOffset + var0.subHeight > var0.height) {
            var5 = var0.height - var0.yOffset - var0.subHeight;
         }

         int var6 = var0.subWidth + var2 + var3;
         int var7 = var0.subHeight + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for (int var9 = 0; var9 < var0.subHeight; var9++) {
            for (int var10 = 0; var10 < var0.subWidth; var10++) {
               var8[(var9 + var4) * var6 + var10 + var2] = var0.pixels[var9 * var0.subWidth + var10];
            }
         }

         var0.pixels = var8;
         var0.subWidth = var6;
         var0.subHeight = var7;
         var0.xOffset -= var2;
         var0.yOffset -= var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;Z)V")
   @ObfuscatedName("ai")
   final void method8248(Widget var1, boolean var2) {
      int var3 = this.field4615 == var1 ? 0 : -1516264759 * var1.field4453;
      int var4 = this.field4615 == var1 ? var1.children.length - 1 : var1.field4454 * -86298045;

      for (int var5 = var3; var5 <= var4; var5++) {
         Widget var6 = this.field4615.children[var5];
         if (var6 != null && var6.field4451 * -1015009662 == var1.childIndex * -677222938) {
            this.method8244(-1553135802 * var6.childIndex, -425350419);
            if (var2 && -1516264759 * var6.field4453 <= var6.field4454 * -86298045) {
               this.method8246(var6, true, 1514653924);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   public int method8260() {
      return -532148473 * this.field4606 >= 117389541 * this.field4613 ? -1 : this.field4607[(this.field4606 += 693549001) * -976234612 - 1];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   public int method8252() {
      return this.field4613 * 117389541;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Log;Lof;Z)V")
   @ObfuscatedName("zj")
   public static void method8249(class380 var0, Widget var1, boolean var2) {
      if (var0 == null) {
         var0.method8265();
      }

      int var3 = var0.field4615 == var1 ? 0 : -1516264759 * var1.field4453;
      int var4 = var0.field4615 == var1 ? var1.children.length - 1 : var1.field4454 * 202993554;

      for (int var5 = var3; var5 <= var4; var5++) {
         Widget var6 = var0.field4615.children[var5];
         if (var6 != null && var6.field4451 * 1865628485 == var1.childIndex * 901421928) {
            var0.method8244(2104955405 * var6.childIndex, -425350419);
            if (var2 && -492650846 * var6.field4453 <= var6.field4454 * 596223167) {
               var0.method8246(var6, true, 849618973);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ax")
   public int method8253() {
      return this.field4613 * -556966693;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ar")
   public int method8254() {
      return this.field4613 * 117389541;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   final void method8245(int var1) {
      if (this.field4613 * 1380865514 == this.field4607.length) {
         this.field4607 = Arrays.copyOf(this.field4607, 2 * this.field4607.length);
      }

      this.field4607[(this.field4613 += -43774887) * -1867554833 - 1] = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lof;")
   @ObfuscatedName("af")
   public Widget method8256() {
      int var1 = this.method8259((short)22025);
      return var1 >= 0 ? this.field4615.children[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("am")
   public int method8261() {
      return -532148473 * this.field4606 >= 117389541 * this.field4613 ? -1 : this.field4607[(this.field4606 += 459681463) * -532148473 - 1];
   }

   @ObfuscatedSignature(descriptor = "()Lof;")
   @ObfuscatedName("al")
   public Widget method8257() {
      int var1 = this.method8259((short)22714);
      return var1 >= 0 ? this.field4615.children[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   public int method8262() {
      return -532148473 * this.field4606 >= -1927405713 * this.field4613 ? -1 : this.field4607[(this.field4606 += 459681463) * -1949172754 - 1];
   }

   public class380() {
      this.field4608 = new int[32];
      this.field4606 = 0;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bg")
   public int[] method8266() {
      return Arrays.copyOf(this.field4607, 117389541 * this.field4613);
   }

   @ObfuscatedSignature(descriptor = "(Lut;IIB)V")
   @ObfuscatedName("au")
   public static void method8275(DynamicArray var0, int var1, int var2, byte var3) {
      try {
         class461.method9338(var0, null, true, -928498657);
         if (var1 >= 0) {
            if (var3 != 1) {
               return;
            }

            if (var2 >= 0) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               }

               if (var1 < var0.method11215((byte)68)) {
                  if (var2 < var0.method11215((byte)94)) {
                     if (var1 != var2) {
                        if (var3 != 1) {
                           throw new IllegalStateException();
                        }

                        if (class586.field6376 == var0.field6107) {
                           if (var3 != 1) {
                              throw new IllegalStateException();
                           }

                           int[] var4 = var0.method11207(2053374425);
                           int var5 = var4[var1];
                           var4[var1] = var4[var2];
                           var4[var2] = var5;
                        } else if (var0.field6107 == class586.field6377) {
                           if (var3 != 1) {
                              return;
                           }

                           long[] var8 = DynamicArray.method11211(var0, (byte)77);
                           long var10 = var8[var1];
                           var8[var1] = var8[var2];
                           var8[var2] = var10;
                        } else {
                           Object[] var9 = var0.method11214((byte)-121);
                           Object var11 = var9[var1];
                           var9[var1] = var9[var2];
                           var9[var2] = var11;
                        }
                     }

                     return;
                  }

                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         throw new RuntimeException();
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "og.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Log;ILjava/lang/Object;Ljava/lang/Object;I)V")
   @ObfuscatedName("js")
   public static void method8270(class380 var0, int var1, Object var2, Object var3, int var4) {
      if (var0 == null) {
         var0.method8273(var1, var2, var2, var1);
      }

      try {
         int[] var5 = var0.field4607;
         int var6 = var0.field4613 * 117389541;
         var0.field4607 = var0.field4608;
         var0.field4613 = 0;
         var0.field4608 = var5;

         for (int var7 = 0; var7 < var6; var7++) {
            Widget var8 = var0.field4615.children[var5[var7]];
            if (var8 != null) {
               if (var4 != -651505321) {
                  return;
               }

               Object var9 = var8.method8068(var1, var3, (byte)12);
               if (var2 != var9) {
                  if (var9 == null) {
                     continue;
                  }

                  if (var4 != -651505321) {
                     throw new IllegalStateException();
                  }

                  if (!var9.equals(var2)) {
                     continue;
                  }

                  if (var4 != -651505321) {
                     throw new IllegalStateException();
                  }
               }

               var0.method8244(var5[var7], -425350419);
            }
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "og.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;Z)V")
   @ObfuscatedName("ac")
   final void method8250(Widget var1, boolean var2) {
      int var3 = this.field4615 == var1 ? 0 : -1516264759 * var1.field4453;
      int var4 = this.field4615 == var1 ? var1.children.length - 1 : var1.field4454 * -86298045;

      for (int var5 = var3; var5 <= var4; var5++) {
         Widget var6 = this.field4615.children[var5];
         if (var6 != null && var6.field4451 * 1865628485 == var1.childIndex * 2077538819) {
            this.method8244(2077538819 * var6.childIndex, -425350419);
            if (var2 && -1516264759 * var6.field4453 <= var6.field4454 * -86298045) {
               this.method8246(var6, true, 1642097515);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lof;")
   @ObfuscatedName("ah")
   public Widget method8258() {
      int var1 = this.method8259((short)25786);
      return var1 >= 0 ? this.field4615.children[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(Log;I)[I")
   @ObfuscatedName("ud")
   public static int[] method8267(class380 var0, int var1) {
      if (var0 == null) {
         var0.method8268(var1);
      }

      try {
         return Arrays.copyOf(var0.field4607, 117389541 * var0.field4613);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "og.ak(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Log;ILjava/lang/Object;Ljava/lang/Object;)V")
   @ObfuscatedName("tu")
   public static void method8271(class380 var0, int var1, Object var2, Object var3) {
      int[] var4 = var0.field4607;
      int var5 = var0.field4613 * 117389541;
      var0.field4607 = var0.field4608;
      var0.field4613 = 0;
      var0.field4608 = var4;

      for (int var6 = 0; var6 < var5; var6++) {
         Widget var7 = var0.field4615.children[var4[var6]];
         if (var7 != null) {
            Object var8 = var7.method8068(var1, var3, (byte)119);
            if (var2 == var8 || var8 != null && var8.equals(var2)) {
               var0.method8244(var4[var6], -425350419);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;Ljava/lang/Object;)V")
   @ObfuscatedName("bj")
   public void method8272(int var1, Object var2, Object var3) {
      int[] var4 = this.field4607;
      int var5 = this.field4613 * 117389541;
      this.field4607 = this.field4608;
      this.field4613 = 0;
      this.field4608 = var4;

      for (int var6 = 0; var6 < var5; var6++) {
         Widget var7 = this.field4615.children[var4[var6]];
         if (var7 != null) {
            Object var8 = var7.method8068(var1, var3, (byte)40);
            if (var2 == var8 || var8 != null && var8.equals(var2)) {
               this.method8244(var4[var6], -425350419);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   public int method8263() {
      return -532148473 * this.field4606 >= 117389541 * this.field4613 ? -1 : this.field4607[(this.field4606 += 459681463) * -532148473 - 1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Log;ILof;I)V")
   @ObfuscatedName("yr")
   public static void method8242(class380 var0, int var1, Widget var2, int var3) {
      if (var0 == null) {
         var0.method8263();
      }

      var0.field4615 = var2;
      var0.field4613 = 0;
      var0.field4606 = 0;
      if (var1 >= 0 && var1 < 3) {
         if (null == var2 || -1 == var2.childIndex * 2077538819 && var2.type * 928687775 == 0) {
            if (null != var2 && null != var2.children) {
               if (0 == var1) {
                  Widget[] var4 = var2.children;

                  for (int var5 = 0; var5 < var4.length; var5++) {
                     Widget var6 = var4[var5];
                     if (var6 != null) {
                        var0.method8244(2077538819 * var6.childIndex, -425350419);
                     }
                  }
               } else {
                  boolean var7 = var1 != 1;
                  if (-1 == var3) {
                     var0.method8246(var2, var7, 1711941844);
                  } else if (var3 >= 0 && var3 < var2.children.length && var2.children[var3] != null) {
                     var0.method8246(var2.children[var3], var7, 1048909498);
                  }
               }
            }
         } else {
            throw new RuntimeException("");
         }
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ak")
   public int[] method8268(int var1) {
      try {
         return Arrays.copyOf(this.field4608, 117389541 * this.field4606);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "og.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;Ljava/lang/Object;I)V")
   @ObfuscatedName("aw")
   public void method8273(int var1, Object var2, Object var3, int var4) {
      try {
         int[] var5 = this.field4608;
         int var6 = this.field4606 * 117389541;
         this.field4607 = this.field4608;
         this.field4613 = 0;
         this.field4608 = var5;

         for (int var7 = 0; var7 < var6; var7++) {
            Widget var8 = this.field4615.children[var5[var7]];
            if (var8 != null) {
               if (var4 != -651505321) {
                  return;
               }

               Object var9 = var8.method8068(var1, var3, (byte)12);
               if (var2 != var9) {
                  if (var9 == null) {
                     continue;
                  }

                  if (var4 != -651505321) {
                     throw new IllegalStateException();
                  }

                  if (!var9.equals(var2)) {
                     continue;
                  }

                  if (var4 != -651505321) {
                     throw new IllegalStateException();
                  }
               }

               this.method8244(var5[var7], -425350419);
            }
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "og.aw(" + ')');
      }
   }
}
