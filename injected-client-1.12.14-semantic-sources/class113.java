import java.awt.event.FocusEvent;
import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ew")
public class class113 {
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field1722 = 14;
   @ObfuscatedSignature(descriptor = "Ldu;")
   @ObfuscatedName("av")
   VorbisFloor field1717;
   @ObfuscatedName("ag")
   int[] field1720;
   @ObfuscatedName("an")
   int[] field1719;
   @ObfuscatedName("ae")
   boolean[] field1721;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field1723 = 32;
   @ObfuscatedName("at")
   boolean field1718;
   @ObfuscatedName("iz")
   static int field1724;

   @ObfuscatedSignature(descriptor = "(Lew;[FII)V")
   @ObfuscatedName("rc")
   public static void method3913(class113 var0, float[] var1, int var2, int var3) {
      if (var0 == null) {
         var0.method3916(var1, var2, var2);
      }

      try {
         int var4 = var0.field1717.field1486.length;
         int var5 = VorbisFloor.field1493[var0.field1717.multiplier - 1];
         boolean[] var6 = var0.field1721;
         var0.field1721[1] = true;
         var6[0] = true;

         for (int var7 = 2; var7 < var4; var7++) {
            int var8 = VorbisFloor.method3479(var0.field1717, var0.field1720, var7);
            int var9 = AuthenticationScheme.method3951(var0.field1717, var0.field1720, var7);
            int var10 = var0.field1717.method3485(var0.field1720[var8], var0.field1719[var8], var0.field1720[var9], var0.field1719[var9], var0.field1720[var7]);
            int var11 = var0.field1719[var7];
            int var12 = var5 - var10;
            int var10000;
            if (var12 < var10) {
               if (var3 <= -1631082730) {
                  throw new IllegalStateException();
               }

               var10000 = var12;
            } else {
               var10000 = var10;
            }

            int var14 = var10000 << 1;
            if (var11 != 0) {
               boolean[] var15 = var0.field1721;
               var0.field1721[var9] = true;
               var15[var8] = true;
               var0.field1721[var7] = true;
               if (var11 >= var14) {
                  if (var3 <= -1631082730) {
                     throw new IllegalStateException();
                  }

                  int var10002;
                  if (var12 > var10) {
                     if (var3 <= -1631082730) {
                        return;
                     }

                     var10002 = var10 + (var11 - var10);
                  } else {
                     var10002 = var12 + (var10 - var11) - 1;
                  }

                  var0.field1719[var7] = var10002;
               } else {
                  int var25;
                  if ((var11 & 1) != 0) {
                     if (var3 <= -1631082730) {
                        throw new IllegalStateException();
                     }

                     var25 = var10 - (var11 + 1) / 2;
                  } else {
                     var25 = var10 + var11 / 2;
                  }

                  var0.field1719[var7] = var25;
               }
            } else {
               var0.field1721[var7] = false;
               var0.field1719[var7] = var10;
            }
         }

         method3922(var0, 0, var4 - 1, -1001855073);
         int var18 = 0;
         int var19 = var0.field1717.multiplier * var0.field1719[0];

         for (int var20 = 1; var20 < var4; var20++) {
            if (var3 <= -1631082730) {
               throw new IllegalStateException();
            }

            if (var0.field1721[var20]) {
               int var22 = var0.field1720[var20];
               int var24 = var0.field1719[var20] * var0.field1717.multiplier;
               var0.field1717.method3486(var18, var19, var22, var24, var1, var2);
               if (var22 >= var2) {
                  if (var3 <= -1631082730) {
                     return;
                  }

                  return;
               }

               var18 = var22;
               var19 = var24;
            }
         }

         float var21 = VorbisFloor.VorbisFloor_decibelStatics[var19];

         for (int var23 = var18; var23 < var2; var23++) {
            if (var3 <= -1631082730) {
               return;
            }

            var1[var23] *= var21;
         }
      } catch (RuntimeException var17) {
         throw RestClientThreadFactory.newRunException(var17, "ew.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("oc")
   public static void method3924(GameEngine var0, FocusEvent var1) {
      if (var0 == null) {
         var0.method769();
      } else {
         GameEngine.volatileFocus = false;
      }
   }

   class113(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
      this.field1717 = var1;
      this.field1718 = var2;
      this.field1720 = var3;
      this.field1719 = var4;
      this.field1721 = var5;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/ArrayList;IIIIZI)V")
   @ObfuscatedName("av")
   public static void method3918(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         if (var0.isEmpty()) {
            if (var6 != -1882065613) {
               throw new IllegalStateException();
            }
         } else {
            class345.field4308.clear();
            class345.field4310.clear();
            if (var5) {
               if (var6 != -1882065613) {
                  throw new IllegalStateException();
               }

               classFM.method4028(1346873340);
            } else {
               for (int var7 = 0; var7 < class345.midiRequests.size(); var7++) {
                  if (var6 != -1882065613) {
                     throw new IllegalStateException();
                  }

                  MidiRequest var8 = (MidiRequest)class345.midiRequests.get(var7);
                  if (null == var8) {
                     if (var6 != -1882065613) {
                        return;
                     }

                     class345.midiRequests.remove(var7);
                     var7--;
                  } else if (var8.field4269) {
                     if (var6 != -1882065613) {
                        throw new IllegalStateException();
                     }

                     if (268210409 * var8.midiPcmStream.field4208 > 0) {
                        var8.midiPcmStream.field4208 -= 1683572569;
                     }

                     var8.midiPcmStream.clear(1806462691);
                     var8.midiPcmStream.method7640((byte)-14);
                     MidiPcmStream.method7621(var8.midiPcmStream, 0, (byte)8);
                     class345.midiRequests.remove(var7);
                     var7--;
                  } else {
                     var8.field4269 = true;
                  }
               }
            }

            class27.method932(var0, var5, 1123954122);
            if (class345.field4308.isEmpty()) {
               if (var6 != -1882065613) {
                  throw new IllegalStateException();
               }
            } else {
               ItemLayer.method5389(var1, var2, var3, var4, -1308816337);
               class345.field4310.add(new AddRequestTask(null));
               class345.field4310.add(new classSX(null, class345.field4317, WidgetFocusInputManager.field3309, classGH.field2009));
               ArrayList var11 = new ArrayList();
               var11.add(new classSA(new FadeInTask(null, 0, true, -673721945 * class345.field4306)));
               if (!class345.midiRequests.isEmpty()) {
                  if (var6 != -1882065613) {
                     throw new IllegalStateException();
                  }

                  ArrayList var12 = new ArrayList();
                  var12.add(new DelayFadeTask(new ConcurrentMidiTask(null, var11), 1197280793 * class345.field4307));
                  ArrayList var9 = classLN.method7213((byte)23);
                  var12.add(
                     new DelayFadeTask(
                        new FadeOutTask(new classSY(null, var9), 0, false, 595186573 * class345.field4312), class345.musicPlayerStatus * 847508035
                     )
                  );
                  class345.field4310.add(new ConcurrentMidiTask(null, var12));
               } else {
                  class345.field4310.add(new DelayFadeTask(null, 1197280793 * class345.field4307));
                  class345.field4310.add(new ConcurrentMidiTask(null, var11));
               }
            }
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "ew.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("at")
   boolean method3919(byte var1) {
      try {
         return this.field1718;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ew.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([FI)V")
   @ObfuscatedName("an")
   void method3914(float[] var1, int var2) {
      int var3 = this.field1717.field1486.length;
      int var4 = VorbisFloor.field1493[this.field1717.multiplier - 1];
      boolean[] var5 = this.field1721;
      this.field1721[1] = true;
      var5[0] = true;

      for (int var6 = 2; var6 < var3; var6++) {
         int var7 = VorbisFloor.method3479(this.field1717, this.field1720, var6);
         int var8 = AuthenticationScheme.method3951(this.field1717, this.field1720, var6);
         int var9 = this.field1717.method3485(this.field1720[var7], this.field1719[var7], this.field1720[var8], this.field1719[var8], this.field1720[var6]);
         int var10 = this.field1719[var6];
         int var11 = var4 - var9;
         int var13 = (var11 < var9 ? var11 : var9) << 1;
         if (var10 != 0) {
            boolean[] var14 = this.field1721;
            this.field1721[var8] = true;
            var14[var7] = true;
            this.field1721[var6] = true;
            if (var10 >= var13) {
               this.field1719[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
            } else {
               this.field1719[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var9 + var10 / 2;
            }
         } else {
            this.field1721[var6] = false;
            this.field1719[var6] = var9;
         }
      }

      method3922(this, 0, var3 - 1, 703839634);
      int var16 = 0;
      int var17 = this.field1717.multiplier * this.field1719[0];

      for (int var18 = 1; var18 < var3; var18++) {
         if (this.field1721[var18]) {
            int var20 = this.field1720[var18];
            int var22 = this.field1719[var18] * this.field1717.multiplier;
            this.field1717.method3486(var16, var17, var20, var22, var1, var2);
            if (var20 >= var2) {
               return;
            }

            var16 = var20;
            var17 = var22;
         }
      }

      float var19 = VorbisFloor.VorbisFloor_decibelStatics[var17];

      for (int var21 = var16; var21 < var2; var21++) {
         var1[var21] *= var19;
      }
   }

   @ObfuscatedSignature(descriptor = "([FI)V")
   @ObfuscatedName("ae")
   void method3915(float[] var1, int var2) {
      int var3 = this.field1717.field1486.length;
      int var4 = VorbisFloor.field1493[this.field1717.multiplier - 1];
      boolean[] var5 = this.field1721;
      this.field1721[1] = true;
      var5[0] = true;

      for (int var6 = 2; var6 < var3; var6++) {
         int var7 = VorbisFloor.method3479(this.field1717, this.field1720, var6);
         int var8 = AuthenticationScheme.method3951(this.field1717, this.field1720, var6);
         int var9 = this.field1717.method3485(this.field1720[var7], this.field1719[var7], this.field1720[var8], this.field1719[var8], this.field1720[var6]);
         int var10 = this.field1719[var6];
         int var11 = var4 - var9;
         int var13 = (var11 < var9 ? var11 : var9) << 1;
         if (var10 != 0) {
            boolean[] var14 = this.field1721;
            this.field1721[var8] = true;
            var14[var7] = true;
            this.field1721[var6] = true;
            if (var10 >= var13) {
               this.field1719[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
            } else {
               this.field1719[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var9 + var10 / 2;
            }
         } else {
            this.field1721[var6] = false;
            this.field1719[var6] = var9;
         }
      }

      method3922(this, 0, var3 - 1, -1601628431);
      int var16 = 0;
      int var17 = this.field1717.multiplier * this.field1719[0];

      for (int var18 = 1; var18 < var3; var18++) {
         if (this.field1721[var18]) {
            int var20 = this.field1720[var18];
            int var22 = this.field1719[var18] * this.field1717.multiplier;
            this.field1717.method3486(var16, var17, var20, var22, var1, var2);
            if (var20 >= var2) {
               return;
            }

            var16 = var20;
            var17 = var22;
         }
      }

      float var19 = VorbisFloor.VorbisFloor_decibelStatics[var17];

      for (int var21 = var16; var21 < var2; var21++) {
         var1[var21] *= var19;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ak")
   void method3920(int var1, int var2) {
      if (var1 < var2) {
         int var3 = var1;
         int var4 = this.field1720[var1];
         int var5 = this.field1719[var1];
         boolean var6 = this.field1721[var1];

         for (int var7 = var1 + 1; var7 <= var2; var7++) {
            int var8 = this.field1720[var7];
            if (var8 < var4) {
               this.field1720[var3] = var8;
               this.field1719[var3] = this.field1719[var7];
               this.field1721[var3] = this.field1721[var7];
               this.field1720[var7] = this.field1720[++var3];
               this.field1719[var7] = this.field1719[var3];
               this.field1721[var7] = this.field1721[var3];
            }
         }

         this.field1720[var3] = var4;
         this.field1719[var3] = var5;
         this.field1721[var3] = var6;
         method3922(this, var1, var3 - 1, 755412079);
         method3922(this, 1 + var3, var2, 418139267);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aj")
   void method3921(int var1, int var2) {
      if (var1 < var2) {
         int var3 = var1;
         int var4 = this.field1720[var1];
         int var5 = this.field1719[var1];
         boolean var6 = this.field1721[var1];

         for (int var7 = var1 + 1; var7 <= var2; var7++) {
            int var8 = this.field1720[var7];
            if (var8 < var4) {
               this.field1720[var3] = var8;
               this.field1719[var3] = this.field1719[var7];
               this.field1721[var3] = this.field1721[var7];
               this.field1720[var7] = this.field1720[++var3];
               this.field1719[var7] = this.field1719[var3];
               this.field1721[var7] = this.field1721[var3];
            }
         }

         this.field1720[var3] = var4;
         this.field1719[var3] = var5;
         this.field1721[var3] = var6;
         method3922(this, var1, var3 - 1, 596327896);
         method3922(this, 1 + var3, var2, -426196575);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Lmy;")
   @ObfuscatedName("av")
   static classMY[] method3917(int var0) {
      try {
         return new classMY[]{
            classMY.field4022,
            classMY.field4021,
            classMY.field4016,
            classMY.field4014,
            classMY.field4019,
            classMY.field4015,
            classMY.field4018,
            classMY.field4017
         };
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ew.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("av")
   public static int method3912(int var0, int var1) {
      try {
         if (var0 != 0) {
            if (var1 >= -604800983) {
               throw new IllegalStateException();
            }

            if (var0 != 1) {
               return -1;
            }

            if (var1 >= -604800983) {
               throw new IllegalStateException();
            }
         }

         return 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ew.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lew;III)V")
   @ObfuscatedName("zs")
   public static void method3922(class113 var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.VarbisFloor_sort(var1, var1, var1);
      } else {
         try {
            if (var1 >= var2) {
               if (var3 == -1084271024) {
                  throw new IllegalStateException();
               }
            } else {
               int var4 = var1;
               int var5 = var0.field1720[var1];
               int var6 = var0.field1719[var1];
               boolean var7 = var0.field1721[var1];

               for (int var8 = var1 + 1; var8 <= var2; var8++) {
                  if (var3 == -1084271024) {
                     return;
                  }

                  int var9 = var0.field1720[var8];
                  if (var9 < var5) {
                     var0.field1720[var4] = var9;
                     var0.field1719[var4] = var0.field1719[var8];
                     var0.field1721[var4] = var0.field1721[var8];
                     var0.field1720[var8] = var0.field1720[++var4];
                     var0.field1719[var8] = var0.field1719[var4];
                     var0.field1721[var8] = var0.field1721[var4];
                  }
               }

               var0.field1720[var4] = var5;
               var0.field1719[var4] = var6;
               var0.field1721[var4] = var7;
               method3922(var0, var1, var4 - 1, -511694840);
               method3922(var0, 1 + var4, var2, -1004939918);
            }
         } catch (RuntimeException var10) {
            throw RestClientThreadFactory.newRunException(var10, "ew.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ag")
   void VarbisFloor_sort(int var1, int var2, int var3) {
      try {
         if (var1 >= var2) {
            if (var3 == -1084271024) {
               throw new IllegalStateException();
            }
         } else {
            int var4 = var1;
            int var5 = this.field1719[var1];
            int var6 = this.field1720[var1];
            boolean var7 = this.field1721[var1];

            for (int var8 = var1 + 1; var8 <= var2; var8++) {
               if (var3 == -1084271024) {
                  return;
               }

               int var9 = this.field1719[var8];
               if (var9 < var5) {
                  this.field1720[var4] = var9;
                  this.field1720[var4] = this.field1720[var8];
                  this.field1721[var4] = this.field1721[var8];
                  this.field1720[var8] = this.field1720[++var4];
                  this.field1720[var8] = this.field1720[var4];
                  this.field1721[var8] = this.field1721[var4];
               }
            }

            this.field1720[var4] = var5;
            this.field1720[var4] = var6;
            this.field1721[var4] = var7;
            method3922(this, var1, var4 - 1, -511694840);
            method3922(this, 1 + var4, var2, -1004939918);
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "ew.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([FII)V")
   @ObfuscatedName("av")
   void method3916(float[] var1, int var2, int var3) {
      try {
         int var4 = this.field1717.field1486.length;
         int var5 = VorbisFloor.field1493[this.field1717.multiplier - 1];
         boolean[] var6 = this.field1721;
         this.field1721[1] = true;
         var6[0] = true;

         for (int var7 = 2; var7 < var4; var7++) {
            int var8 = VorbisFloor.method3479(this.field1717, this.field1720, var7);
            int var9 = AuthenticationScheme.method3951(this.field1717, this.field1719, var7);
            int var10 = this.field1717.method3485(this.field1720[var8], this.field1720[var8], this.field1720[var9], this.field1720[var9], this.field1719[var7]);
            int var11 = this.field1720[var7];
            int var12 = var5 - var10;
            int var10000;
            if (var12 < var10) {
               if (var3 <= -1631082730) {
                  throw new IllegalStateException();
               }

               var10000 = var12;
            } else {
               var10000 = var10;
            }

            int var14 = var10000 << 1;
            if (var11 != 0) {
               boolean[] var15 = this.field1721;
               this.field1721[var9] = true;
               var15[var8] = true;
               this.field1721[var7] = true;
               if (var11 >= var14) {
                  if (var3 <= -1631082730) {
                     throw new IllegalStateException();
                  }

                  int var10002;
                  if (var12 > var10) {
                     if (var3 <= -1631082730) {
                        return;
                     }

                     var10002 = var10 + (var11 - var10);
                  } else {
                     var10002 = var12 + (var10 - var11) - 1;
                  }

                  this.field1720[var7] = var10002;
               } else {
                  int var25;
                  if ((var11 & 1) != 0) {
                     if (var3 <= -1631082730) {
                        throw new IllegalStateException();
                     }

                     var25 = var10 - (var11 + 1) / 2;
                  } else {
                     var25 = var10 + var11 / 2;
                  }

                  this.field1720[var7] = var25;
               }
            } else {
               this.field1721[var7] = false;
               this.field1719[var7] = var10;
            }
         }

         method3922(this, 0, var4 - 1, -1001855073);
         int var18 = 0;
         int var19 = this.field1717.multiplier * this.field1719[0];

         for (int var20 = 1; var20 < var4; var20++) {
            if (var3 <= -1631082730) {
               throw new IllegalStateException();
            }

            if (this.field1721[var20]) {
               int var22 = this.field1720[var20];
               int var24 = this.field1719[var20] * this.field1717.multiplier;
               this.field1717.method3486(var18, var19, var22, var24, var1, var2);
               if (var22 >= var2) {
                  if (var3 <= -1631082730) {
                     return;
                  }

                  return;
               }

               var18 = var22;
               var19 = var24;
            }
         }

         float var21 = VorbisFloor.VorbisFloor_decibelStatics[var19];

         for (int var23 = var18; var23 < var2; var23++) {
            if (var3 <= -1631082730) {
               return;
            }

            var1[var23] *= var21;
         }
      } catch (RuntimeException var17) {
         throw RestClientThreadFactory.newRunException(var17, "ew.av(" + ')');
      }
   }
}
