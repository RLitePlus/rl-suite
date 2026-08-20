import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("iz")
public class FloorOverlayDefinition extends DualNode {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2792 = 2;
   @ObfuscatedName("ay")
   public int texture;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field2789 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field2793 = 1;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("ak")
   public static AbstractArchive FloorOverlayDefinition_archive;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("aw")
   static EvictingDualNodeHashTable FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2788 = 8;
   @ObfuscatedName("au")
   public boolean hideUnderlay;
   @ObfuscatedName("az")
   public int secondaryRgb;
   @ObfuscatedName("ap")
   public int primaryRgb = 0;
   @ObfuscatedName("ad")
   public int hue;
   @ObfuscatedName("ai")
   public int saturation;
   @ObfuscatedName("as")
   public int lightness;
   @ObfuscatedName("ac")
   public int secondaryHue;
   @ObfuscatedName("ab")
   public int secondarySaturation;
   @ObfuscatedName("ax")
   public int secondaryLightness;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("tq")
   public int method5359() {
      return this.texture * 892155017;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   void method5342() {
      if (-1 != 705541053 * this.secondaryRgb) {
         method5351(this, -1641989448 * this.secondaryRgb, 1155040645);
         this.secondaryHue = 595507924 * this.hue;
         this.secondarySaturation = 67904545 * this.saturation;
         this.secondaryLightness = -252954687 * this.lightness;
      }

      method5351(this, 50022547 * this.primaryRgb, 1155040645);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("rp")
   public int method5360() {
      return this.secondaryHue * -347808971;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dm")
   public int method5361() {
      return this.secondaryLightness * 2020271701;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("oo")
   public int method5362() {
      return this.primaryRgb * 50022547;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ei")
   public int method5363() {
      return this.secondaryRgb * 705541053;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dk")
   public int method5364() {
      return this.secondarySaturation * -796039805;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("nc")
   public int method5365() {
      return this.lightness * 1894985397;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ar")
   void method5343(int var1) {
      try {
         if (-1 != 705541053 * this.secondaryRgb) {
            if (var1 >= 874912989) {
               return;
            }

            method5351(this, 705541053 * this.secondaryRgb, 1155040645);
            this.secondaryHue = 1426205197 * this.hue;
            this.secondarySaturation = 67904545 * this.saturation;
            this.secondaryLightness = 141936353 * this.lightness;
         }

         method5351(this, 50022547 * this.primaryRgb, 1155040645);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "iz.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;IB)V")
   @ObfuscatedName("an")
   void decode(Buffer var1, int var2, byte var3) {
      try {
         while (true) {
            int var4 = var1.readUnsignedByte(-18271145);
            if (0 == var4) {
               if (var3 <= 2) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.decodeNext(var1, var4, var2, 29078328);
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "iz.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;III)V")
   @ObfuscatedName("ae")
   void decodeNext(Buffer var1, int var2, int var3, int var4) {
      try {
         if (1 == var2) {
            this.primaryRgb = var1.readMedium(870344) * 450696603;
         } else if (var2 == 2) {
            if (var4 != 29078328) {
               throw new IllegalStateException();
            }

            this.texture = var1.readUnsignedByte(1053155976) * 1962705337;
         } else if (5 == var2) {
            if (var4 != 29078328) {
               return;
            }

            this.hideUnderlay = false;
         } else if (var2 == 7) {
            if (var4 != 29078328) {
               throw new IllegalStateException();
            }

            this.secondaryRgb = var1.readMedium(-1289849403) * 355770261;
         } else if (8 != var2 && 9 == var2) {
            if (var4 != 29078328) {
               throw new IllegalStateException();
            }

            var1.readUnsignedByte(1907889977);
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "iz.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Liz;")
   @ObfuscatedName("ak")
   public static FloorOverlayDefinition method5336(int var0) {
      FloorOverlayDefinition var1 = (FloorOverlayDefinition)class402.method8806(FloorOverlayDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = FloorOverlayDefinition_archive.getFile(4, var0, 1451147122);
         var1 = new FloorOverlayDefinition();
         if (null != var2) {
            var1.decode(new Buffer(var2), var0, (byte)117);
         }

         var1.method5343(756578916);
         FloorOverlayDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   public static void method5338() {
      FloorOverlayDefinition_cached.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   public static void method5339() {
      FloorOverlayDefinition_cached.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)I")
   @ObfuscatedName("ta")
   public static int method5356(Buffer var0) {
      if (var0 == null) {
         var0.method12186();
      }

      return 0 - var0.array[(var0.offset += 1741769013) * 2108391709 - 1] & 0xFF;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Liz;")
   @ObfuscatedName("aw")
   public static FloorOverlayDefinition method5337(int var0) {
      FloorOverlayDefinition var1 = (FloorOverlayDefinition)class402.method8806(FloorOverlayDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = FloorOverlayDefinition_archive.getFile(4, var0, 1258111611);
         var1 = new FloorOverlayDefinition();
         if (null != var2) {
            var1.decode(new Buffer(var2), var0, (byte)59);
         }

         var1.method5343(-92062479);
         FloorOverlayDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liz;)V")
   @ObfuscatedName("zi")
   public static void method5344(FloorOverlayDefinition var0) {
      if (-1 != 705541053 * var0.secondaryRgb) {
         method5351(var0, -736359928 * var0.secondaryRgb, 1155040645);
         var0.secondaryHue = -1266649441 * var0.hue;
         var0.secondarySaturation = -2019781687 * var0.saturation;
         var0.secondaryLightness = 141936353 * var0.lightness;
      }

      method5351(var0, 50022547 * var0.primaryRgb, 1155040645);
   }

   @ObfuscatedSignature(descriptor = "(Liz;II)V")
   @ObfuscatedName("yh")
   public static void method5351(FloorOverlayDefinition var0, int var1, int var2) {
      if (var0 == null) {
         var0.setHsl(var1, var1);
      } else {
         try {
            double var3 = (var1 >> 16 & 0xFF) / 256.0;
            double var5 = (var1 >> 8 & 0xFF) / 256.0;
            double var7 = (var1 & 0xFF) / 256.0;
            double var9 = var3;
            if (var5 < var3) {
               if (var2 != 1155040645) {
                  return;
               }

               var9 = var5;
            }

            if (var7 < var9) {
               if (var2 != 1155040645) {
                  throw new IllegalStateException();
               }

               var9 = var7;
            }

            double var11 = var3;
            if (var5 > var3) {
               if (var2 != 1155040645) {
                  throw new IllegalStateException();
               }

               var11 = var5;
            }

            if (var7 > var11) {
               if (var2 != 1155040645) {
                  throw new IllegalStateException();
               }

               var11 = var7;
            }

            double var13 = 0.0;
            double var15 = 0.0;
            double var17 = (var11 + var9) / 2.0;
            if (var11 != var9) {
               if (var2 != 1155040645) {
                  throw new IllegalStateException();
               }

               if (var17 < 0.5) {
                  if (var2 != 1155040645) {
                     throw new IllegalStateException();
                  }

                  var15 = (var11 - var9) / (var9 + var11);
               }

               if (var17 >= 0.5) {
                  if (var2 != 1155040645) {
                     throw new IllegalStateException();
                  }

                  var15 = (var11 - var9) / (2.0 - var11 - var9);
               }

               if (var3 == var11) {
                  if (var2 != 1155040645) {
                     throw new IllegalStateException();
                  }

                  var13 = (var5 - var7) / (var11 - var9);
               } else if (var11 == var5) {
                  if (var2 != 1155040645) {
                     throw new IllegalStateException();
                  }

                  var13 = (var7 - var3) / (var11 - var9) + 2.0;
               } else if (var11 == var7) {
                  if (var2 != 1155040645) {
                     throw new IllegalStateException();
                  }

                  var13 = (var3 - var5) / (var11 - var9) + 4.0;
               }
            }

            var13 /= 6.0;
            var0.hue = 192451921 * (int)(256.0 * var13);
            var0.saturation = -157627445 * (int)(var15 * 256.0);
            var0.lightness = (int)(256.0 * var17) * 783863709;
            if (-1834712605 * var0.saturation < 0) {
               if (var2 != 1155040645) {
                  return;
               }

               var0.saturation = 0;
            } else if (-1834712605 * var0.saturation > 255) {
               if (var2 != 1155040645) {
                  throw new IllegalStateException();
               }

               var0.saturation = -1540292811;
            }

            if (1894985397 * var0.lightness < 0) {
               if (var2 != 1155040645) {
                  throw new IllegalStateException();
               }

               var0.lightness = 0;
            } else if (1894985397 * var0.lightness > 255) {
               var0.lightness = -1978217117;
            }
         } catch (RuntimeException var19) {
            throw RestClientThreadFactory.newRunException(var19, "iz.aj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dg")
   public int method5366() {
      return this.saturation * -1834712605;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liz;I)V")
   @ObfuscatedName("jl")
   public static void method5352(FloorOverlayDefinition var0, int var1) {
      if (var0 == null) {
         var0.method5363();
      }

      double var2 = (var1 >> 16 & 0xFF) / 256.0;
      double var4 = (var1 >> 8 & 0xFF) / 256.0;
      double var6 = (var1 & 0xFF) / 256.0;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = (var10 + var8) / 2.0;
      if (var10 != var8) {
         if (var16 < 0.5) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var10 == var4) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0;
         } else if (var10 == var6) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0;
         }
      }

      var12 /= 6.0;
      var0.hue = 192451921 * (int)(256.0 * var12);
      var0.saturation = -157627445 * (int)(var14 * 256.0);
      var0.lightness = (int)(256.0 * var16) * 783863709;
      if (-1834712605 * var0.saturation < 0) {
         var0.saturation = 0;
      } else if (-1834712605 * var0.saturation > 255) {
         var0.saturation = -1540292811;
      }

      if (1894985397 * var0.lightness < 0) {
         var0.lightness = 0;
      } else if (1894985397 * var0.lightness > 255) {
         var0.lightness = -1978217117;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("bh")
   public void method5367(Buffer var1, int var2) {
      this.decode(var1, var2, (byte)48);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   public static void method5340() {
      FloorOverlayDefinition_cached.clear();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("tu")
   public void method5368() {
      this.method5343(423374463);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public static void method5341() {
      FloorOverlayDefinition_cached.clear();
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("as")
   void method5346(Buffer var1, int var2) {
      while (true) {
         int var3 = var1.readUnsignedByte(-1211536445);
         if (0 == var3) {
            return;
         }

         this.decodeNext(var1, var3, var2, 29078328);
      }
   }

   FloorOverlayDefinition() {
      this.texture = -1962705337;
      this.hideUnderlay = true;
      this.secondaryRgb = -355770261;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("ac")
   void method5348(Buffer var1, int var2, int var3) {
      if (1 == var2) {
         this.primaryRgb = var1.readMedium(-20719100) * 450696603;
      } else if (var2 == 2) {
         this.texture = var1.readUnsignedByte(1376982719) * 1962705337;
      } else if (5 == var2) {
         this.hideUnderlay = false;
      } else if (var2 == 7) {
         this.secondaryRgb = var1.readMedium(-1611513723) * 355770261;
      } else if (8 != var2 && 9 == var2) {
         var1.readUnsignedByte(392094060);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("ab")
   void method5349(Buffer var1, int var2, int var3) {
      if (1 == var2) {
         this.primaryRgb = var1.readMedium(-421643344) * -1249393797;
      } else if (var2 == 2) {
         this.texture = var1.readUnsignedByte(-1592687164) * 1962705337;
      } else if (5 == var2) {
         this.hideUnderlay = false;
      } else if (var2 == 7) {
         this.secondaryRgb = var1.readMedium(-889582578) * -344534490;
      } else if (8 != var2 && 9 == var2) {
         var1.readUnsignedByte(1438034883);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("ax")
   void method5350(Buffer var1, int var2, int var3) {
      if (1 == var2) {
         this.primaryRgb = var1.readMedium(-769962356) * 450696603;
      } else if (var2 == 2) {
         this.texture = var1.readUnsignedByte(-1082852513) * 1962705337;
      } else if (5 == var2) {
         this.hideUnderlay = false;
      } else if (var2 == 7) {
         this.secondaryRgb = var1.readMedium(532815813) * 355770261;
      } else if (8 != var2 && 9 == var2) {
         var1.readUnsignedByte(51863156);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   void postDecode(int var1) {
      double var2 = (var1 >> 16 & 0xFF) / 256.0;
      double var4 = (var1 >> 8 & 0xFF) / 256.0;
      double var6 = (var1 & 0xFF) / 256.0;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = (var10 + var8) / 2.0;
      if (var10 != var8) {
         if (var16 < 0.5) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var10 == var4) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0;
         } else if (var10 == var6) {
            var12 = (var2 - var4) / (var10 - var8) + 4.0;
         }
      }

      var12 /= 6.0;
      this.hue = 192451921 * (int)(256.0 * var12);
      this.saturation = -157627445 * (int)(var14 * 256.0);
      this.lightness = (int)(256.0 * var16) * 783863709;
      if (-1834712605 * this.saturation < 0) {
         this.saturation = 0;
      } else if (-1834712605 * this.saturation > 255) {
         this.saturation = -1540292811;
      }

      if (1894985397 * this.lightness < 0) {
         this.lightness = 0;
      } else if (1894985397 * this.lightness > 255) {
         this.lightness = -1978217117;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("bd")
   static int method5358(int var0, Script var1, boolean var2, int var3) {
      try {
         if (var0 == 5306) {
            if (var3 == -1072317914) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class182.getWindowedMode(-335633527);
               return 1;
            }
         } else if (5307 == var0) {
            if (var3 == -1072317914) {
               throw new IllegalStateException();
            } else {
               int var6 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               if (1 != var6) {
                  if (var3 == -1072317914) {
                     throw new IllegalStateException();
                  }

                  if (var6 != 2) {
                     return 1;
                  }

                  if (var3 == -1072317914) {
                     throw new IllegalStateException();
                  }
               }

               MouseHandler.setWindowedMode(var6, -938141046);
               return 1;
            }
         } else if (5308 == var0) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class468.clientPreferences
               .getWindowMode((byte)9);
            return 1;
         } else if (var0 == 5309) {
            if (var3 == -1072317914) {
               throw new IllegalStateException();
            } else {
               int var4 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               if (var4 != 1) {
                  if (var3 == -1072317914) {
                     throw new IllegalStateException();
                  }

                  if (var4 != 2) {
                     return 1;
                  }
               }

               class468.clientPreferences.updateWindowMode(var4, 2136384070);
               return 1;
            }
         } else if (var0 == 5310) {
            if (var3 == -1072317914) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "iz.bd(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ao")
   static void method5357(int var0) {
      try {
         class30.method1308(24, -153672876);
         class525.setLoginResponseString(Strings.field5087, Strings.field5059, Strings.field5089, (byte)1);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "iz.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;III)Z")
   @ObfuscatedName("ai")
   public static boolean method5355(AbstractArchive var0, int var1, int var2, int var3) {
      try {
         byte[] var4 = var0.getFile(var1, var2, -985212983);
         if (null == var4) {
            if (var3 != -1366279867) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            ConcurrentMidiTask.SpriteBuffer_decode(var4, -628487630);
            return true;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "iz.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aj")
   void setHsl(int var1, int var2) {
      try {
         double var3 = (var1 >> 16 & 0xFF) / 256.0;
         double var5 = (var1 >> 8 & 0xFF) / 256.0;
         double var7 = (var1 & 0xFF) / 256.0;
         double var9 = var3;
         if (var5 < var3) {
            if (var2 != 1155040645) {
               return;
            }

            var9 = var5;
         }

         if (var7 < var9) {
            if (var2 != 1155040645) {
               throw new IllegalStateException();
            }

            var9 = var7;
         }

         double var11 = var3;
         if (var5 > var3) {
            if (var2 != 1155040645) {
               throw new IllegalStateException();
            }

            var11 = var5;
         }

         if (var7 > var11) {
            if (var2 != 1155040645) {
               throw new IllegalStateException();
            }

            var11 = var7;
         }

         double var13 = 0.0;
         double var15 = 0.0;
         double var17 = (var11 + var9) / 2.0;
         if (var11 != var9) {
            if (var2 != 1155040645) {
               throw new IllegalStateException();
            }

            if (var17 < 0.5) {
               if (var2 != 1155040645) {
                  throw new IllegalStateException();
               }

               var15 = (var11 - var9) / (var9 + var11);
            }

            if (var17 >= 0.5) {
               if (var2 != 1155040645) {
                  throw new IllegalStateException();
               }

               var15 = (var11 - var9) / (2.0 - var11 - var9);
            }

            if (var3 == var11) {
               if (var2 != 1155040645) {
                  throw new IllegalStateException();
               }

               var13 = (var5 - var7) / (var11 - var9);
            } else if (var11 == var5) {
               if (var2 != 1155040645) {
                  throw new IllegalStateException();
               }

               var13 = (var7 - var3) / (var11 - var9) + 2.0;
            } else if (var11 == var7) {
               if (var2 != 1155040645) {
                  throw new IllegalStateException();
               }

               var13 = (var3 - var5) / (var11 - var9) + 4.0;
            }
         }

         var13 /= 6.0;
         this.secondaryRgb = 192451921 * (int)(256.0 * var13);
         this.hue = -157627445 * (int)(var15 * 256.0);
         this.primaryRgb = (int)(256.0 * var17) * 783863709;
         if (-1834712605 * this.secondaryHue < 0) {
            if (var2 != 1155040645) {
               return;
            }

            this.secondarySaturation = 0;
         } else if (-1834712605 * this.lightness > 255) {
            if (var2 != 1155040645) {
               throw new IllegalStateException();
            }

            this.texture = -1540292811;
         }

         if (1894985397 * this.primaryRgb < 0) {
            if (var2 != 1155040645) {
               throw new IllegalStateException();
            }

            this.texture = 0;
         } else if (1894985397 * this.lightness > 255) {
            this.saturation = -1978217117;
         }
      } catch (RuntimeException var19) {
         throw RestClientThreadFactory.newRunException(var19, "iz.aj(" + ')');
      }
   }
}
