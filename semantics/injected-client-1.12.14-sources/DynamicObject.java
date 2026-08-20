import javax.annotation.Nullable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ct")
public class DynamicObject extends Renderable implements net.runelite.api.DynamicObject {
   @ObfuscatedName("ir")
   public boolean field1208;
   @ObfuscatedName("ag")
   final int type;
   @ObfuscatedName("aj")
   final int x;
   @ObfuscatedName("an")
   final int orientation;
   @ObfuscatedSignature(descriptor = "Lsj;")
   @ObfuscatedName("ap")
   final AnimationSequence animationSequence;
   @ObfuscatedName("at")
   final int id;
   @ObfuscatedName("ae")
   final int plane;
   @ObfuscatedName("ak")
   final int y;
   @ObfuscatedSignature(descriptor = "Lsj;")
   @ObfuscatedName("aw")
   final AnimationSequence field1194 = null;
   @ObfuscatedName("fi")
   public int field1199;
   @ObfuscatedSignature(descriptor = "Ljh;")
   @ObfuscatedName("uf")
   public Scene field1198;
   @ObfuscatedSignature(descriptor = "Ldd;")
   @ObfuscatedName("av")
   final WorldView worldView;
   @ObfuscatedName("ay")
   int cycleStart;
   @ObfuscatedName("tv")
   public int field1196;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field1207 = 65536;

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   @Override
   protected boolean vmethod50() {
      ObjectComposition var1 = AsyncHttpResponse.getObjectDefinition(this.type * -1843633419, 2083971271);
      if (null != var1.transforms) {
         var1 = var1.transform(308354557);
      }

      if (null == var1) {
         return false;
      } else if (AnimationSequence.method10315(this.field1194, -831296794)
         && AnimationSequence.method10318(this.field1194, -2146934153).method5224(this.field1194.getFrame(-609025707), 579381797)) {
         return true;
      } else if (AnimationSequence.method10315(this.animationSequence, -831296794)
         && AnimationSequence.method10318(this.animationSequence, -1291503717).method5224(this.animationSequence.getFrame(-609025707), 616800442)) {
         return true;
      } else {
         Model var2 = Fonts.method11309(var1, this.orientation * 1965532721, this.y * -31819065, (int[][])null, 0, 0, 0, null, -1, (byte)8);
         return null != var2 && var2.faceAlphas != null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lky;")
   @ObfuscatedName("ag")
   @Override
   protected final Model getModel(int var1) {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         this.method2869();
         return this.method2868(rl19.field5583);
      }
   }

   DynamicObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Renderable var10) {
      this.animationSequence = null;
      this.field1196 = -1;
      this.field1198 = var1.scene;
      if (var10 instanceof DynamicObject) {
         this.field1196 = ((DynamicObject)var10).field1196;
         this.field1199 = ((DynamicObject)var10).field1199;
      }

      this.worldView = var1;
      this.type = 1566161245 * var2;
      this.orientation = var3 * 456651473;
      this.y = var4 * -1107941641;
      this.id = 1912152011 * var5;
      this.plane = var6 * -613192905;
      this.x = 264101007 * var7;
      this.field1194 = new AnimationSequence();
      this.animationSequence = new AnimationSequence();
      if (-1 != var8) {
         AnimationSequence.method10313(this.field1194, var8, 486531623);
         AnimationSequence.method10313(this.animationSequence, var8, -90589969);
         SequenceDefinition var11 = AnimationSequence.method10318(this.field1194, 1059229721);
         this.cycleStart = client.cycle * -1745105923 - -116436259;
         if (var9 && -1 != var11.frameCount * 1996641051) {
            AnimationSequence.method10355(this.field1194, (short)-15167);
         }

         if (var10 instanceof DynamicObject) {
            DynamicObject var12 = (DynamicObject)var10;
            if (var12.field1194.getId(-1885001431) == var8) {
               if (0 == 564693013 * var11.restartMode) {
                  this.field1194.setSequence(var12.field1194, 1247484323);
                  this.cycleStart = var12.cycleStart * 1;
               }

               this.animationSequence.setSequence(var12.animationSequence, -73500438);
            } else if (!var12.field1194.method10344(803258749)) {
               this.animationSequence.setSequence(var12.animationSequence, 2130420340);
            } else {
               this.animationSequence.setSequence(var12.field1194, 1867334098);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   @Override
   protected int getAnimationHeightOffset(int var1) {
      try {
         AnimationSequence var2 = this.field1194;
         if (var2 == null) {
            if (var1 == -962274595) {
               throw new IllegalStateException();
            }

            var2 = this.animationSequence;
         }

         if (var2 == null) {
            if (var1 == -962274595) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            int var10000;
            if (AnimationSequence.method10315(var2, -831296794)) {
               if (var1 == -962274595) {
                  throw new IllegalStateException();
               }

               var10000 = AnimationSequence.method10318(var2, 1204260762).animationHeightOffset * 89078819;
            } else {
               var10000 = 0;
            }

            return var10000;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ct.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Liw;")
   @ObfuscatedName("at")
   public SequenceDefinition method2867() {
      return this.field1194.sequenceDefinition;
   }

   public int getAnimCycle() {
      return -1;
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("ap")
   @Override
   protected final Model vmethod49() {
      ObjectComposition var1 = AsyncHttpResponse.getObjectDefinition(1304966882 * this.type, 2099700595);
      if (null != var1.transforms) {
         var1 = var1.transform(-191184385);
      }

      if (null == var1) {
         return null;
      } else {
         int var2;
         int var3;
         if (this.y * -31819065 != 1 && 3 != this.y * -31819065) {
            var2 = 1813358617 * var1.sizeX;
            var3 = -274977686 * var1.sizeY;
         } else {
            var2 = -352504863 * var1.sizeY;
            var3 = -833033680 * var1.sizeX;
         }

         int var4 = (var2 >> 1) + this.plane * -1159185785;
         int var5 = this.plane * 2078050987 + (var2 + 1 >> 1);
         int var6 = (var3 >> 1) + -1279875575 * this.x;
         int var7 = (var3 + 1 >> 1) + 858492001 * this.x;
         int[][] var8 = this.worldView.tileHeights[this.id * -444628779];
         int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
         int var10 = (-1159185785 * this.plane << 7) + (var2 << 6);
         int var11 = (this.x * -1838693777 << 7) + (var3 << 6);
         int var12 = client.cycle * 1759706017 - -730874372 * this.cycleStart;
         this.cycleStart = client.cycle * -1882854578;
         client.field900.method11638(this.worldView, var10, var11, false, 133741999);
         int var13 = GrandExchangeOfferUnitPriceComparator.method8832(this.field1194, var12, client.field900, (byte)27);
         classVW.method11640(client.field900, (byte)-41);
         if (0 != (var13 & 1) && (var13 & 8) != 0) {
            this.field1194.reset(-1023035721);
         }

         if (AnimationSequence.method10341(this.field1194, 30, -1002405506)) {
            if (AnimationSequence.method10315(this.animationSequence, -831296794)) {
               int var14 = GrandExchangeOfferUnitPriceComparator.method8832(this.animationSequence, var12, null, (byte)80);
               if (0 != (var14 & 1) && 0 != (var14 & 8)) {
                  this.animationSequence.reset(1059592674);
               }

               if (!AnimationSequence.method10341(this.animationSequence, 30, -1002405506)) {
                  return Fonts.method11309(
                     var1,
                     1965532721 * this.orientation,
                     -442608930 * this.y,
                     var8,
                     var10,
                     var9,
                     var11,
                     AnimationSequence.method10318(this.animationSequence, 573295733),
                     this.animationSequence.getFrame(-609025707),
                     (byte)8
                  );
               }
            }

            return null;
         } else {
            return Fonts.method11309(
               var1,
               -949937026 * this.orientation,
               this.y * 135634414,
               var8,
               var10,
               var9,
               var11,
               AnimationSequence.method10318(this.field1194, 1335837582),
               this.field1194.getFrame(-609025707),
               (byte)8
            );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl19;)Lky;")
   @ObfuscatedName("jb")
   public Model method2868(@Nullable rl19 param1) {
      ObjectComposition var2 = ObjectComposition.method5196(this.type * -1843633419);
      if (var2.transforms != null) {
         var2 = this.method2864(var2);
      }

      if (var2 == null) {
         return null;
      } else {
         int var3;
         int var4;
         if (this.y * -31819065 != 1 && this.y * -31819065 != 3) {
            var3 = var2.sizeX * 1813358617;
            var4 = var2.sizeY * -352504863;
         } else {
            var3 = var2.sizeY * -352504863;
            var4 = var2.sizeX * 1813358617;
         }

         int var5 = this.plane * -1159185785 + this.field1198.field3014;
         int var6 = this.x * -1838693777 + this.field1198.field3014;
         int var7 = (var3 >> 1) + var5;
         int var8 = (var3 + 1 >> 1) + var5;
         int var9 = (var4 >> 1) + var6;
         int var10 = (var4 + 1 >> 1) + var6;
         int[][] var11 = this.field1198.tileHeights[this.id * 771919331];
         int var12 = var11[var7][var10] + var11[var7][var9] + var11[var8][var9] + var11[var8][var10] >> 2;
         int var13 = (var5 << 7) + (var3 << 6);
         int var14 = (var6 << 7) + (var4 << 6);
         int var15;
         if (client.field1023 != null && this.field1194.id * 1870316967 != -1 && client.field1023.test(this.field1194.id * 1870316967)) {
            var15 = -2147483648 | Math.max(this.field1194.frameCycle * -1148754599 - 1, 0) << 16 | this.field1194.frame * 1756992279;
         } else {
            var15 = this.field1194.frame * 1756992279;
         }

         return var2.method5190(var1, this.orientation * 1965532721, this.y * -31819065, var11, var13, var12, var14, this.field1194.sequenceDefinition, var15);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   @Override
   protected int vmethod54() {
      AnimationSequence var1 = this.field1194;
      if (var1 == null) {
         var1 = this.animationSequence;
      }

      if (var1 == null) {
         return 0;
      } else {
         return AnimationSequence.method10315(var1, -831296794) ? AnimationSequence.method10318(var1, -562188059).animationHeightOffset * 1280978032 : 0;
      }
   }

   public int getAnimFrame() {
      return this.field1194.frame * 1756992279;
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("kk")
   public Model method2866() {
      return this.field1194.sequenceDefinition != null ? null : this.method2868(null);
   }

   @ObfuscatedSignature(descriptor = "(Ldd;[BIII)V")
   @ObfuscatedName("ay")
   static final void method2863(WorldView var0, byte[] var1, int var2, int var3, int var4) {
      try {
         Buffer var5 = new Buffer(var1);
         int var6 = -1;

         while (true) {
            int var7 = Buffer.method12056(var5, 1760049798);
            if (var7 == 0) {
               if (var4 != -2022892612) {
                  throw new IllegalStateException();
               }

               return;
            }

            var6 += var7;
            int var8 = 0;

            while (true) {
               int var9 = Buffer.method12050(var5, 871695361);
               if (var9 == 0) {
                  break;
               }

               var8 += var9 - 1;
               int var10 = var8 & 63;
               int var11 = var8 >> 6 & 63;
               int var12 = var8 >> 12;
               int var13 = var5.readUnsignedByte(998622689);
               int var14 = var13 >> 2;
               int var15 = var13 & 3;
               int var16 = var2 + var11;
               int var17 = var3 + var10;
               if (var16 > 0) {
                  if (var4 != -2022892612) {
                     throw new IllegalStateException();
                  }

                  if (var17 > 0 && var16 < var0.tileHeights[0].length - 2) {
                     if (var4 != -2022892612) {
                        throw new IllegalStateException();
                     }

                     if (var17 < var0.tileHeights[0][0].length - 2) {
                        if (var4 != -2022892612) {
                           throw new IllegalStateException();
                        }

                        int var18 = var12;
                        if (2 == (var0.tileSettings[1][var16][var17] & 2)) {
                           if (var4 != -2022892612) {
                              throw new IllegalStateException();
                           }

                           var18 = var12 - 1;
                        }

                        CollisionMap var19 = null;
                        if (var18 >= 0) {
                           if (var4 != -2022892612) {
                              return;
                           }

                           if (null != var0.collisionMaps) {
                              if (var4 != -2022892612) {
                                 throw new IllegalStateException();
                              }

                              var19 = var0.collisionMaps[var18];
                           }
                        }

                        FriendSystem.addObjects(var0, var12, var16, var17, var6, var15, var14, var19, 1408185935);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var20) {
         throw RestClientThreadFactory.newRunException(var20, "ct.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("wo")
   public boolean method2871() {
      return this.field1194.sequenceDefinition == null;
   }

   @ObfuscatedSignature(descriptor = "()Liv;")
   @ObfuscatedName("ts")
   public ObjectComposition method2865() {
      ObjectComposition var1 = ObjectComposition.method5196(this.type * -1843633419);
      if (var1.transforms != null) {
         var1 = this.method2864(var1);
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Liv;)Liv;")
   @ObfuscatedName("dl")
   public ObjectComposition method2864(ObjectComposition var1) {
      if (this.field1196 == -1) {
         return null;
      } else {
         int var2 = -1;
         if (var1.transformVarbit * -753060269 != -1) {
            var2 = client.method2411(var1.transformVarbit * -753060269, this.field1199);
         } else if (var1.transformVarp * 1406043891 != -1) {
            var2 = this.field1199;
         }

         int var3;
         if (var2 >= 0 && var2 < var1.transforms.length - 1) {
            var3 = var1.transforms[var2];
         } else {
            var3 = var1.transforms[var1.transforms.length - 1];
         }

         return var3 != -1 ? ObjectComposition.method5196(var3) : null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("rw")
   public void method2869() {
      ObjectComposition var1 = ObjectComposition.method5196(this.type * -1843633419);
      if (var1.transforms != null) {
         var1 = this.method2864(var1);
      }

      if (var1 != null) {
         int var2;
         int var3;
         if (this.y * -31819065 != 1 && this.y * -31819065 != 3) {
            var2 = var1.sizeX * 1813358617;
            var3 = var1.sizeY * -352504863;
         } else {
            var2 = var1.sizeY * -352504863;
            var3 = var1.sizeX * 1813358617;
         }

         int var4 = (this.plane * -1159185785 << 7) + (var2 << 6);
         int var5 = (this.x * -1838693777 << 7) + (var3 << 6);
         int var6 = client.cycle * 1759706017 - this.cycleStart * 944706933;
         this.cycleStart = client.cycle * 1759706017 * -116436259;
         client.field900.method11644(this.worldView, var4, var5, false);
         int var7 = SequenceDefinition.method5274(this.field1194, var6, client.field900);
         client.field900.method11643();
         if ((var7 & 1) != 0 && (var7 & 8) != 0) {
            this.field1194.method10362();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("az")
   @Override
   protected int vmethod56() {
      AnimationSequence var1 = this.field1194;
      if (var1 == null) {
         var1 = this.animationSequence;
      }

      if (var1 == null) {
         return 0;
      } else {
         return AnimationSequence.method10315(var1, -831296794) ? AnimationSequence.method10318(var1, 710063589).animationHeightOffset * 89078819 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   @Override
   protected int vmethod57() {
      AnimationSequence var1 = this.field1194;
      if (var1 == null) {
         var1 = this.animationSequence;
      }

      if (var1 == null) {
         return 0;
      } else {
         return AnimationSequence.method10315(var1, -831296794) ? AnimationSequence.method10318(var1, 188405462).animationHeightOffset * 89078819 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   @Override
   protected boolean vmethod52() {
      ObjectComposition var1 = AsyncHttpResponse.getObjectDefinition(this.type * 649503379, 2124284548);
      if (null != var1.transforms) {
         var1 = var1.transform(-825796160);
      }

      if (null == var1) {
         return false;
      } else if (AnimationSequence.method10315(this.field1194, -831296794)
         && AnimationSequence.method10318(this.field1194, -187617535).method5224(this.field1194.getFrame(-609025707), 243276371)) {
         return true;
      } else if (AnimationSequence.method10315(this.animationSequence, -831296794)
         && AnimationSequence.method10318(this.animationSequence, -130882746).method5224(this.animationSequence.getFrame(-609025707), -247502877)) {
         return true;
      } else {
         Model var2 = Fonts.method11309(var1, this.orientation * -158541032, this.y * 17325598, (int[][])null, 0, 0, 0, null, -1, (byte)8);
         return null != var2 && var2.faceAlphas != null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("an")
   @Override
   protected boolean vmethod51(int var1) {
      try {
         ObjectComposition var2 = AsyncHttpResponse.getObjectDefinition(this.type * -1843633419, 2066297061);
         if (null != var2.transforms) {
            if (var1 != -1841545705) {
               throw new IllegalStateException();
            }

            var2 = var2.transform(-1379876482);
         }

         if (null == var2) {
            return false;
         } else if (AnimationSequence.method10315(this.field1194, -831296794)
            && AnimationSequence.method10318(this.field1194, 1355273012).method5224(this.field1194.getFrame(-609025707), -1537509208)) {
            if (var1 != -1841545705) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else if (AnimationSequence.method10315(this.animationSequence, -831296794)
            && AnimationSequence.method10318(this.animationSequence, -1905832279).method5224(this.animationSequence.getFrame(-609025707), -1995847607)) {
            return true;
         } else {
            Model var3 = Fonts.method11309(var2, this.orientation * 1965532721, this.y * -31819065, (int[][])null, 0, 0, 0, null, -1, (byte)8);
            if (null != var3) {
               if (var1 != -1841545705) {
                  throw new IllegalStateException();
               }

               if (var3.faceAlphas != null) {
                  if (var1 != -1841545705) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ct.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gv")
   public void method2870() {
      ObjectComposition var1 = ObjectComposition.method5196(this.type * -1843633419);
      if (var1.transforms != null) {
         if (var1.transformVarbit * -753060269 != -1) {
            this.field1196 = client.method2503(var1.transformVarbit * -753060269);
            this.field1199 = Varps.Varps_main[this.field1196];
         } else if (var1.transformVarp * 1406043891 != -1) {
            this.field1196 = var1.transformVarp * 1406043891;
            this.field1199 = Varps.Varps_main[this.field1196];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   @Override
   protected int vmethod55() {
      AnimationSequence var1 = this.field1194;
      if (var1 == null) {
         var1 = this.animationSequence;
      }

      if (var1 == null) {
         return 0;
      } else {
         return AnimationSequence.method10315(var1, -831296794) ? AnimationSequence.method10318(var1, -185278305).animationHeightOffset * 89078819 : 0;
      }
   }
}
