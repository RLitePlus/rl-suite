import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.api.Point;
import net.runelite.api.widgets.WidgetUtil;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lw")
public class Widget extends Node implements net.runelite.api.widgets.Widget {
   @ObfuscatedName("eg")
   public boolean field4360;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field4411 = 1338;
   @ObfuscatedName("hf")
   int field4330;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field4408 = 1400;
   @ObfuscatedName("fu")
   public Object[] field4381;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field4415 = 1402;
   @ObfuscatedName("eq")
   public int[] field4400;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   public static final int field4414 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final int field4413 = 3;
   @ObfuscatedName("de")
   public int field4305;
   @ObfuscatedName("bj")
   public boolean field4275;
   @ObfuscatedName("cc")
   public int field4329;
   @ObfuscatedName("di")
   public int field4260;
   @ObfuscatedName("bu")
   String field4332;
   @ObfuscatedName("co")
   public int field4375;
   @ObfuscatedName("bi")
   public int field4247;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   public static final int field4409 = 1;
   @ObfuscatedName("bo")
   public int field4264;
   @ObfuscatedName("eh")
   public int field4245;
   @ObfuscatedName("dn")
   public int field4291;
   @ObfuscatedName("cw")
   public int field4334;
   @ObfuscatedName("dg")
   public int field4248;
   @ObfuscatedName("gm")
   public String field4301;
   @ObfuscatedName("dd")
   public int field4255;
   @ObfuscatedName("fo")
   public Object[] field4377;
   @ObfuscatedName("gb")
   public Object[] field4393;
   @ObfuscatedName("dh")
   public int field4257;
   @ObfuscatedName("go")
   public Object[] field4395;
   @ObfuscatedName("do")
   public int field4259;
   @ObfuscatedName("ey")
   public int field4274;
   @ObfuscatedName("gl")
   public int field4261;
   @ObfuscatedName("eo")
   public String field4317;
   @ObfuscatedName("oe")
   public int field4263;
   @ObfuscatedName("ba")
   public int field4250;
   @ObfuscatedName("bv")
   public int field4265;
   @ObfuscatedName("hw")
   public int field4266;
   @ObfuscatedName("ck")
   public int field4341;
   @ObfuscatedName("gh")
   public int field4331;
   @ObfuscatedName("gs")
   public int field4258;
   @ObfuscatedName("ew")
   public String[][] field4353;
   @ObfuscatedName("dz")
   public int field4270;
   @ObfuscatedName("ez")
   public int field4295;
   @ObfuscatedName("eu")
   public int field4272;
   @ObfuscatedName("et")
   public String[] actions;
   @ObfuscatedName("bl")
   public int field4240 = -1;
   @ObfuscatedName("cn")
   public boolean field4271;
   @ObfuscatedSignature(descriptor = "Lye;")
   @ObfuscatedName("ch")
   public classYE field4307;
   @ObfuscatedName("hp")
   HashMap field4268;
   @ObfuscatedName("cp")
   public int field4276;
   @ObfuscatedName("es")
   public boolean field4306;
   @ObfuscatedName("cj")
   public boolean field4278;
   @ObfuscatedName("ed")
   int[] field4253;
   @ObfuscatedName("dj")
   public int field4349;
   @ToRemove(unused = "true")
   @ObfuscatedName("bn")
   public static final int field4417 = 9;
   @ObfuscatedSignature(descriptor = "[Llw;")
   @ObfuscatedName("ge")
   public Widget[] field4340;
   @ObfuscatedName("ca")
   public int field4242;
   @ObfuscatedName("fg")
   public Object[] field4361;
   @ObfuscatedName("cs")
   public int field4283;
   @ObfuscatedName("sq")
   public int field4333;
   @ObfuscatedName("gz")
   public Object[] field4246;
   @ObfuscatedName("dy")
   public boolean field4256;
   @ObfuscatedName("bz")
   public int field4277;
   @ObfuscatedName("dw")
   public int field4374;
   @ObfuscatedName("cf")
   public int field4348;
   @ObfuscatedName("dr")
   int field4354;
   @ObfuscatedName("ds")
   public int field4288;
   @ObfuscatedName("cr")
   public int field4293;
   @ObfuscatedName("ly")
   public int field4290;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field4416 = 1337;
   @ObfuscatedName("ej")
   int[] field4362;
   @ObfuscatedName("gj")
   public int field4292;
   @ObfuscatedName("dm")
   public int field4294;
   @ObfuscatedName("bb")
   public int field4252;
   @ObfuscatedName("gx")
   public int field4296;
   @ObfuscatedName("ct")
   public int field4262;
   @ObfuscatedSignature(descriptor = "Llc;")
   @ObfuscatedName("dl")
   public PlayerComposition field4358;
   @ObfuscatedName("dq")
   public boolean field4297;
   @ObfuscatedName("df")
   public boolean field4298;
   @ObfuscatedName("bs")
   public int field4299;
   @ObfuscatedName("hi")
   public int[] field4372;
   @ObfuscatedName("dt")
   int field4287;
   @ObfuscatedName("ee")
   public String field4302;
   @ObfuscatedName("cg")
   public int field4303;
   @ObfuscatedName("ek")
   public int field4304;
   @ToRemove(unused = "true")
   @ObfuscatedName("nc")
   public static int field4418;
   @ObfuscatedName("fb")
   public Object[] field4380;
   @ObfuscatedName("fl")
   public Object[] field4357;
   @ObfuscatedName("ga")
   public Object[] field4397;
   @ObfuscatedName("cy")
   public int field4347;
   @ObfuscatedName("ev")
   int[] field4279;
   @ObfuscatedName("da")
   public String field4318;
   @ObfuscatedName("by")
   public int field4320;
   @ObfuscatedName("cz")
   public int field4241 = -1;
   @ObfuscatedName("fi")
   public Object[] field4379;
   @ObfuscatedName("ex")
   public byte[][] field4312;
   @ObfuscatedName("dp")
   public String field4339;
   @ObfuscatedName("er")
   public int[] field4370;
   @ObfuscatedName("fn")
   public int[] field4371;
   @ObfuscatedName("ce")
   public String field4309;
   @ObfuscatedName("gt")
   public int field4356;
   @ObfuscatedName("tl")
   public short field4244;
   @ObfuscatedName("bw")
   public int field4285;
   @ObfuscatedName("gf")
   public int field4310;
   @ObfuscatedSignature(descriptor = "Llw;")
   @ObfuscatedName("ef")
   public Widget field4311;
   @ObfuscatedName("cb")
   public int field4368;
   @ObfuscatedName("cx")
   public int field4313;
   @ObfuscatedName("ei")
   public boolean field4314;
   @ObfuscatedName("gy")
   public String field4345;
   @ObfuscatedName("eb")
   public boolean field4315;
   @ObfuscatedName("ep")
   public Object[] field4376;
   @ObfuscatedName("dc")
   public boolean field4282;
   @ObfuscatedName("bk")
   public int field4281;
   @ObfuscatedName("fx")
   public Object[] field4386;
   @ObfuscatedName("hl")
   HashMap field4367;
   @ObfuscatedName("fd")
   public Object[] field4402;
   @ObfuscatedName("fy")
   public Object[] field4286;
   @ObfuscatedName("bh")
   public int field4319;
   @ObfuscatedName("jx")
   public short field4243;
   @ObfuscatedName("cq")
   public boolean field4289;
   @ObfuscatedSignature(descriptor = "Llx;")
   @ObfuscatedName("hg")
   classLX field4369;
   @ObfuscatedName("dk")
   public int field4351;
   @ObfuscatedName("fz")
   public Object[] field4350;
   @ObfuscatedName("fh")
   public Object[] field4382;
   @ObfuscatedName("gg")
   public int[] field4280;
   @ObfuscatedName("fp")
   public Object[] field4355;
   @ObfuscatedName("gn")
   public int[] field4267;
   @ObfuscatedName("be")
   public int field4251;
   @ObfuscatedName("gd")
   public int[] field4385;
   @ObfuscatedName("gu")
   public boolean field4323;
   @ObfuscatedName("ht")
   public boolean field4403;
   @ObfuscatedName("fr")
   public Object[] field4254;
   @ObfuscatedName("ft")
   public Object[] field4387;
   @ObfuscatedName("ff")
   public Object[] field4365;
   @ObfuscatedName("fe")
   public Object[] field4388;
   @ObfuscatedName("fc")
   public Object[] field4389;
   @ObfuscatedName("fm")
   public Object[] field4363;
   @ObfuscatedName("fa")
   public Object[] field4383;
   @ObfuscatedName("fw")
   public Object[] field4391;
   @ObfuscatedName("gq")
   public Object[] field4392;
   @ObfuscatedName("dx")
   public boolean field4352;
   @ObfuscatedName("gv")
   public Object[] field4394;
   @ObfuscatedName("gk")
   public Object[] field4406;
   @ObfuscatedName("cv")
   public int field4249;
   @ObfuscatedName("bq")
   public int field4335;
   @ObfuscatedName("gp")
   public Object[] field4396;
   @ObfuscatedName("ec")
   public Object[] field4359;
   @ObfuscatedName("du")
   public int field4269;
   @ObfuscatedName("gw")
   public int[][] field4399;
   @ObfuscatedSignature(descriptor = "Lma;")
   @ObfuscatedName("hx")
   classMA field4366;
   @ObfuscatedName("gi")
   public int[] field4401;
   @ObfuscatedName("dv")
   public int field4316;
   @ObfuscatedName("cm")
   public int field4327;
   @ObfuscatedName("hr")
   Object[] field4336;
   @ObfuscatedName("fq")
   public int[] field4390;
   @ObfuscatedName("gc")
   public Object[] field4398;
   @ObfuscatedName("fv")
   public Object[] field4384;
   @ObfuscatedName("bd")
   public int field4344;
   @ObfuscatedName("em")
   public int field4321;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field4412 = 1401;
   @ObfuscatedName("cu")
   public int field4338;
   @ObfuscatedName("gr")
   public boolean field4322;
   @ObfuscatedName("hm")
   public boolean field4373;
   @ObfuscatedName("ci")
   public int field4324;
   @ObfuscatedName("bf")
   public int field4325;
   @ObfuscatedName("cd")
   public int field4300;
   @ObfuscatedName("cl")
   public int field4326;
   @ObfuscatedName("fs")
   public int[] field4404;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field4410 = 1339;
   @ObfuscatedName("fj")
   public Object[] field4378;
   @ObfuscatedName("hz")
   public int field4342;
   @ObfuscatedName("en")
   public byte[][] field4346;
   @ObfuscatedName("ea")
   public int field4284;
   @ObfuscatedName("db")
   public int field4273;
   @ObfuscatedName("fk")
   public Object[] field4343;
   @ObfuscatedName("hd")
   public boolean field4328;
   @ObfuscatedName("hk")
   int[] field4405;
   @ObfuscatedName("el")
   String[] field4364;
   @ObfuscatedName("ha")
   int field4308;

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ar")
   public boolean method7212(int var1) {
      try {
         if (this.field4275) {
            if (var1 != -947902929) {
               throw new IllegalStateException();
            }

            if (0 != this.field4375 * -1510882375) {
               if (var1 != -947902929) {
                  throw new IllegalStateException();
               }

               if (11 != this.field4375 * -1510882375) {
                  if (var1 != -947902929) {
                     throw new IllegalStateException();
                  }

                  if (!this.field4315) {
                     if (var1 != -947902929) {
                        throw new IllegalStateException();
                     }

                     if (-90794217 * this.field4334 != 1338) {
                        if (var1 != -947902929) {
                           throw new IllegalStateException();
                        }

                        if (-1510882375 * this.field4375 != 12) {
                           return false;
                        }

                        if (var1 != -947902929) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lw.ar(" + ')');
      }
   }

   public void setOnDragCompleteListener(Object[] var1) {
      this.field4380 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("cx")
   public String method7324() {
      return this.field4301;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;I)[Ljava/lang/Object;")
   @ObfuscatedName("af")
   Object[] method7161(Object[] var1, int var2) {
      try {
         return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lw.af(" + ')');
      }
   }

   public net.runelite.api.widgets.Widget[] getStaticChildren() {
      if (this.field4260 * 63131743 > -1) {
         return new net.runelite.api.widgets.Widget[0];
      } else {
         ArrayList var1 = new ArrayList();

         for (Widget var5 : classOE.field4843.method2255(WidgetUtil.componentToInterface(this.field4329 * -1163656551))) {
            if (var5 != null && var5.field4342 * -1502647899 == this.field4329 * -1163656551) {
               var1.add(var5);
            }
         }

         return var1.toArray(new Widget[0]);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;[I)[I")
   @ObfuscatedName("jo")
   public static int[] method7164(Widget var0, int[] var1) {
      if (var0 == null) {
         var0.isHidden();
      }

      return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("uo")
   public Widget method7325(int var1) {
      this.field4319 = var1 * 1321867761;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("zq")
   public Widget method7326(int var1) {
      this.field4305 = var1 * -2106140265;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Lly;Lda;B)Lym;")
   @ObfuscatedName("ao")
   SpritePixels method7187(classLY var1, classDA var2, byte var3) {
      try {
         if (!this.method7192(1183576002)) {
            if (var3 == 108) {
               throw new IllegalStateException();
            } else {
               return method7190(this, var1, var2, (byte)1);
            }
         } else {
            StringBuilder var10000 = new StringBuilder().append(this.field4339);
            byte var10001;
            if (this.field4352) {
               if (var3 == 108) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var10000 = var10000.append((int)var10001);
            if (this.field4256) {
               if (var3 == 108) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            String var4 = var10000.append((int)var10001).append(this.field4283 * -2011859635).append(this.field4284 * 880555563).toString();
            SpritePixels var5 = (SpritePixels)var1.field4436.method9981(var4, (byte)-7);
            if (null == var5) {
               SpritePixels var6 = method7190(this, var1, var2, (byte)1);
               if (var6 != null) {
                  if (var3 == 108) {
                     throw new IllegalStateException();
                  }

                  var5 = var6.method13473();
                  method7195(this, var5, -2132881644);
                  var1.field4436.method9982(var4, var5, (byte)1);
               }
            }

            return var5;
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "lw.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ed")
   public int method7256() {
      return null != this.field4268 && !this.field4268.isEmpty() ? 1 : 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Lly;Lda;)Lym;")
   @ObfuscatedName("ko")
   public static SpritePixels method7188(Widget var0, classLY var1, classDA var2) {
      if (var0 == null) {
         var0.revalidate();
      }

      if (!var0.method7192(1894829560)) {
         return method7190(var0, var1, var2, (byte)1);
      } else {
         String var3 = var0.field4339 + (var0.field4352 ? 1 : 0) + (var0.field4256 ? 1 : 0) + var0.field4283 * -2011859635 + var0.field4284 * 880555563;
         SpritePixels var4 = (SpritePixels)var1.field4436.method9981(var3, (byte)61);
         if (null == var4) {
            SpritePixels var5 = method7190(var0, var1, var2, (byte)1);
            if (var5 != null) {
               var4 = var5.method13473();
               method7195(var0, var4, -933143798);
               var1.field4436.method9982(var3, var4, (byte)1);
            }
         }

         return var4;
      }
   }

   public int getType() {
      return this.field4375 * -1510882375;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Llw;")
   @ObfuscatedName("at")
   public Widget method7318(int var1, int var2, int var3, int var4) {
      return this.method7343(var1).method7337(var2).method7338(var3).method7355(var4);
   }

   public void revalidate() {
      if (!classOE.field4843.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         client.method2409(this, classSA.field5897 * 773246731, IntProjection.field1938 * 8379747, classWK.field6691, client.field823);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("as")
   public static void method7157(int var0) {
      try {
         try {
            classAAC.method132(classME.field4488, -1255450835);

            for (int var1 = 0; var1 < -646722873 * classUP.field6363; var1++) {
               if (var0 != 2000203024) {
                  return;
               }

               classAAC.method132(GraphicsObject.field477[var1], 501841722);
            }

            classAAC.method132(classME.field4489, 1669685026);
            classAAC.method132(classME.field4490, -141358388);
         } catch (Exception var2) {
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lw.as(" + ')');
      }
   }

   public int getScrollY() {
      return this.field4331 * -41424189;
   }

   public int getItemQuantityMode() {
      return this.field4299 * -278245589;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("as")
   void method7175(classXY var1, int var2) {
      try {
         this.field4332 = var1.method13071(552941395);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lw.as(" + ')');
      }
   }

   public int getXPositionMode() {
      return this.field4264 * 404669979;
   }

   public String getText() {
      return this.method7324().replace(' ', ' ');
   }

   public void setFlippedHorizontally(boolean var1) {
      this.field4256 = var1;
   }

   public void setNoClickThrough(boolean var1) {
      this.field4403 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lly;Lda;)Lym;")
   @ObfuscatedName("cz")
   SpritePixels method7189(classLY var1, classDA var2) {
      if (this.field4339 != null && null != var2) {
         classLN var3 = (classLN)var1.field4438.method9981(this.field4339, (byte)-3);
         if (null == var3) {
            var3 = new classLN(this.field4339, var2);
            var1.field4438.method9982(this.field4339, var3, (byte)1);
         }

         return var3.method7123(1627105142);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)[I")
   @ObfuscatedName("ac")
   int[] method7180(classXY var1, int var2) {
      try {
         int var3 = classXY.method13039(var1, -346779531);
         if (0 == var3) {
            if (var2 == 155860854) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int[] var4 = new int[var3];

            for (int var5 = 0; var5 < var3; var5++) {
               if (var2 == 155860854) {
                  throw new IllegalStateException();
               }

               var4[var5] = var1.method13056((byte)1);
            }

            return var4;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "lw.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lly;ZLda;I)Lym;")
   @ObfuscatedName("aa")
   public SpritePixels method7319(classLY var1, boolean var2, classDA var3, int var4) {
      if (this.getSpriteId() != -1) {
         net.runelite.api.SpritePixels var5 = (net.runelite.api.SpritePixels)client.field1038.get(this.getId());
         if (var5 != null) {
            return (SpritePixels)var5;
         }
      }

      classDA var9 = var3;
      boolean var8 = var2;
      classLY var7 = var1;
      Widget var6 = this;
      int var10 = 1522102538;

      try {
         if (null != var6.field4339) {
            if (var10 == 240082458) {
               throw new IllegalStateException();
            }

            SpritePixels var11 = var6.method7187(var7, var9, (byte)42);
            if (var11 != null) {
               if (var10 == 240082458) {
                  throw new IllegalStateException();
               }

               return var11;
            }
         }

         int var18;
         if (var8) {
            if (var10 == 240082458) {
               throw new IllegalStateException();
            }

            var18 = -669652445 * var6.field4349;
         } else {
            var18 = 208578545 * var6.field4348;
         }

         SpritePixels var10000;
         if (var18 == -1) {
            if (var10 == 240082458) {
               throw new IllegalStateException();
            }

            Object var16 = null;
            var10000 = (SpritePixels)var16;
         } else {
            long var20 = (long)(880555563 * var6.field4284) << 40;
            long var10001;
            if (var6.field4256) {
               if (var10 == 240082458) {
                  throw new IllegalStateException();
               }

               var10001 = 1L;
            } else {
               var10001 = 0L;
            }

            long var12 = var20 + (var10001 << 39) + ((var6.field4352 ? 1L : 0L) << 38) + ((long)(-2011859635 * var6.field4283) << 36) + var18;
            SpritePixels var14 = (SpritePixels)var7.field4430.method6422(var12);
            if (var14 != null) {
               var10000 = var14;
            } else {
               var14 = classPN.method9038(var7.field4437, var18, 0, -1619347588);
               if (null == var14) {
                  if (var10 == 240082458) {
                     throw new IllegalStateException();
                  }

                  Object var17 = null;
                  var10000 = (SpritePixels)var17;
               } else {
                  method7195(var6, var14, -1164212617);
                  var7.field4430.method6428(var14, var12);
                  var10000 = var14;
               }
            }
         }

         return var10000;
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "lw.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Llw;")
   @ObfuscatedName("ci")
   public Widget method7327(String var1) {
      this.field4301 = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("ue")
   public Widget method7328(int var1) {
      this.field4299 = var1 * -349833341;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;B)V")
   @ObfuscatedName("an")
   public void method7230(int var1, Object var2, byte var3) {
      try {
         for (int var4 = 0; var4 < -2048004067 * this.field4308; var4++) {
            if (var3 >= 4) {
               throw new IllegalStateException();
            }

            if (var1 == this.field4405[var4]) {
               this.field4336[var4] = var2;
               return;
            }
         }

         if (this.field4336 == null) {
            this.field4405 = new int[4];
            this.field4336 = new Object[4];
         } else if (-2048004067 * this.field4308 == this.field4336.length) {
            this.field4405 = Arrays.copyOf(this.field4405, 2 * this.field4405.length);
            this.field4336 = Arrays.copyOf(this.field4336, 2 * this.field4336.length);
         }

         this.field4405[this.field4308 * -2048004067] = var1;
         this.field4336[this.field4308 * -2048004067] = var2;
         this.field4308 += -102477259;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "lw.an(" + ')');
      }
   }

   public int getSpriteId() {
      return this.field4348 * 208578545;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   boolean method7192(int var1) {
      try {
         if (!this.field4352) {
            if (var1 <= 685877715) {
               throw new IllegalStateException();
            }

            if (!this.field4256) {
               if (var1 <= 685877715) {
                  throw new IllegalStateException();
               }

               if (0 == -2011859635 * this.field4283) {
                  if (var1 <= 685877715) {
                     throw new IllegalStateException();
                  }

                  if (880555563 * this.field4284 == 0) {
                     return false;
                  }
               }
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lw.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lly;Lou;IZLlc;Lpl;Lpp;I)Lfx;")
   @ObfuscatedName("ad")
   public Model method7200(classLY var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, classPL var6, NpcOverrides var7, int var8) {
      try {
         int var9;
         int var10;
         if (var4) {
            var9 = -799043941 * this.field4287;
            var10 = 697152629 * this.field4354;
         } else {
            var9 = this.field4333 * -910601;
            var10 = this.field4374 * -759306091;
         }

         if (var9 == 0) {
            if (var8 >= -1946717396) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            if (1 == var9) {
               if (var8 >= -1946717396) {
                  throw new IllegalStateException();
               }

               if (-1 == var10) {
                  if (var8 >= -1946717396) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            }

            if (var7 != null) {
               if (var8 >= -1946717396) {
                  throw new IllegalStateException();
               }

               if (var7.field5377) {
                  if (var8 >= -1946717396) {
                     throw new IllegalStateException();
                  }

                  if (6 == var9) {
                     if (var8 >= -1946717396) {
                        throw new IllegalStateException();
                     }

                     var9 = 3;
                  }
               }
            }

            long var11;
            label139: {
               var11 = (var9 << 16) + var10;
               if (2 != var9) {
                  if (var8 >= -1946717396) {
                     throw new IllegalStateException();
                  }

                  if (var9 != 6) {
                     break label139;
                  }

                  if (var8 >= -1946717396) {
                     throw new IllegalStateException();
                  }
               }

               if (var6 == null) {
                  return null;
               }

               var11 = (var9 << 16) + 283969983 * var6.field5302;
            }

            if (null != var7) {
               if (var8 >= -1946717396) {
                  throw new IllegalStateException();
               }

               var11 |= -4980301671096129853L * var7.field5378 << 20;
            }

            Model var13 = (Model)var1.field4431.method6422(var11);
            if (null == var13) {
               if (var8 >= -1946717396) {
                  throw new IllegalStateException();
               }

               ModelData var14 = null;
               int var15 = 64;
               int var16 = 768;
               switch (var9) {
                  case 1:
                     var14 = ModelData.method4047(var1.field4434, var10, 0);
                     break;
                  case 2:
                     var14 = var6.method8943(null, (byte)37);
                     break;
                  case 3:
                     ModelData var10000;
                     if (null != var5) {
                        if (var8 >= -1946717396) {
                           throw new IllegalStateException();
                        }

                        var10000 = var5.method6704((byte)0);
                     } else {
                        var10000 = null;
                     }

                     var14 = var10000;
                     break;
                  case 4:
                     classOP var17 = classOB.method8299(var10, (byte)77);
                     var14 = classOP.method8655(var17, 10, -1145537891);
                     var15 += 1845819663 * var17.field5060;
                     var16 += var17.field5030 * -1636300529;
                  case 5:
                  default:
                     break;
                  case 6:
                     var14 = var6.method8943(var7, (byte)115);
               }

               if (null == var14) {
                  if (var8 >= -1946717396) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               var13 = var14.method4045(var15, var16, -50, -10, -50);
               var1.field4431.method6428(var13, var11);
            }

            if (null != var2) {
               if (var8 >= -1946717396) {
                  throw new IllegalStateException();
               }

               var13 = var2.method8763(var13, var3, -2146329348);
            }

            return var13;
         }
      } catch (RuntimeException var18) {
         throw classEG.method3884(var18, "lw.ad(" + ')');
      }
   }

   public int[] getVarTransmitTrigger() {
      return this.field4280;
   }

   public String[][] getSubOps() {
      return this.field4353;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("dx")
   public void method7329(boolean var1) {
      this.field4275 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dy")
   public boolean method7213() {
      return !this.field4275
         || 0 == this.field4375 * -1510882375
         || 11 == this.field4375 * -1510882375
         || this.field4315
         || -90794217 * this.field4334 == 1338
         || -1510882375 * this.field4375 == 12;
   }

   public Object[] getOnOpListener() {
      return this.field4386;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;IILjava/lang/String;)V")
   @ObfuscatedName("be")
   public static void method7209(Widget var0, int var1, int var2, String var3) {
      if (var0 == null) {
         var0.method7264();
      }

      if (var0.field4353 == null || var0.field4353.length <= var1) {
         String[][] var4 = new String[var1 + 1][];
         if (null != var0.field4353) {
            System.arraycopy(var0.field4353, 0, var4, 0, var0.field4353.length);
         }

         var0.field4353 = var4;
      }

      if (null == var0.field4353[var1] || var0.field4353[var1].length <= var2) {
         String[] var5 = new String[var2 + 1];
         if (var0.field4353[var1] != null) {
            System.arraycopy(var0.field4353[var1], 0, var5, 0, var0.field4353[var1].length);
         }

         var0.field4353[var1] = var5;
      }

      var0.field4353[var1][var2] = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Llc;Z)V")
   @ObfuscatedName("xm")
   public static void method7305(Widget var0, PlayerComposition var1, boolean var2) {
      if (var0 == null) {
         var0.setHasListener(var2);
      }

      var0.field4333 = 299331441;
      var0.field4358 = new PlayerComposition(var1);
      if (!var2) {
         var0.field4358.field4095 = Arrays.copyOf(var0.field4358.field4092, var0.field4358.field4092.length);
         var0.field4358.method6711((byte)-23);
      }
   }

   public void setOnMouseOverListener(Object[] var1) {
      this.field4402 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("gc")
   public Widget method7320(int var1) {
      return this.method7317(-1, var1);
   }

   public boolean isSelfHidden() {
      return this.field4289;
   }

   public int getModelType() {
      return this.field4333 * -910601;
   }

   @ObfuscatedSignature(descriptor = "(Z)Llw;")
   @ObfuscatedName("ar")
   public Widget method7330(boolean var1) {
      this.field4306 = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(IILjava/lang/String;I)V")
   @ObfuscatedName("ai")
   public void method7210(int var1, int var2, String var3, int var4) {
      try {
         label57: {
            if (this.field4353 != null) {
               if (var4 != -512976453) {
                  throw new IllegalStateException();
               }

               if (this.field4353.length > var1) {
                  break label57;
               }

               if (var4 != -512976453) {
                  return;
               }
            }

            String[][] var5 = new String[var1 + 1][];
            if (null != this.field4353) {
               if (var4 != -512976453) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.field4353, 0, var5, 0, this.field4353.length);
            }

            this.field4353 = var5;
         }

         label59: {
            if (null != this.field4353[var1]) {
               if (var4 != -512976453) {
                  throw new IllegalStateException();
               }

               if (this.field4353[var1].length > var2) {
                  break label59;
               }

               if (var4 != -512976453) {
                  return;
               }
            }

            String[] var7 = new String[var2 + 1];
            if (this.field4353[var1] != null) {
               System.arraycopy(this.field4353[var1], 0, var7, 0, this.field4353[var1].length);
            }

            this.field4353[var1] = var7;
         }

         this.field4353[var1][var2] = var3;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "lw.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bm")
   public boolean method7249(int var1) {
      try {
         return this.field4330 * 2133229739 == 2;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lw.bm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cg")
   boolean method7193() {
      return this.field4352 || this.field4256 || 0 != -2011859635 * this.field4283 || -1872633104 * this.field4284 != 0;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;I)Ljava/lang/Object;")
   @ObfuscatedName("ak")
   public Object method7220(int var1, Object var2, int var3) {
      try {
         for (int var4 = 0; var4 < -2048004067 * this.field4308; var4++) {
            if (var3 <= 614424977) {
               throw new IllegalStateException();
            }

            if (var1 == this.field4405[var4]) {
               return this.field4336[var4];
            }
         }

         return var2;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "lw.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IJ)J")
   @ObfuscatedName("at")
   public long method7228(int var1, long var2) {
      try {
         for (int var4 = 0; var4 < this.field4308 * -2048004067; var4++) {
            if (var1 == this.field4405[var4]) {
               return (Long)this.field4336[var4];
            }
         }

         return var2;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "lw.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("it")
   public void method7311(int var1) {
      this.field4241 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ms")
   public void method7315(int var1) {
      if (this.field4244 > -1) {
         this.setRelativeY(this.field4244);
      }
   }

   public void setOnVarTransmitListener(Object[] var1) {
      this.field4382 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hx")
   public void method7314(int var1) {
      this.field4242 = var1;
   }

   public void setOnTargetEnterListener(Object[] var1) {
      this.field4381 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Llw;Llc;ZB)V")
   @ObfuscatedName("bp")
   public static void method7306(Widget var0, PlayerComposition var1, boolean var2, byte var3) {
      if (var0 == null) {
         var0.method7309(var1, var2, var3);
      }

      try {
         var0.field4333 = 299331441;
         var0.field4358 = new PlayerComposition(var1);
         if (!var2) {
            if (var3 <= -4) {
               throw new IllegalStateException();
            }

            var0.field4358.field4095 = Arrays.copyOf(var0.field4358.field4092, var0.field4358.field4092.length);
            var0.field4358.method6711((byte)-58);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lw.bl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("rq")
   public Widget method7331(int var1) {
      this.field4374 = var1 * 434741949;
      return this;
   }

   @ObfuscatedSignature(descriptor = "()Llx;")
   @ObfuscatedName("fd")
   public classLX method7293() {
      return this.field4369;
   }

   public boolean contains(Point var1) {
      Rectangle var2 = this.getBounds();
      return var2 != null && var2.contains(new java.awt.Point(var1.getX(), var1.getY()));
   }

   @ObfuscatedSignature(descriptor = "()Lli;")
   @ObfuscatedName("ee")
   public classLI method7284() {
      return this.field4369 != null ? this.field4369.field4421 : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILlw;IIIII[F)Llw;")
   @ObfuscatedName("bz")
   static Widget method7158(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      Widget var8 = new Widget();
      var8.field4375 = 685068937 * var0;
      var8.field4342 = 175404338 * var1.field4329;
      var8.field4260 = var2 * -372272152;
      var8.field4275 = true;
      var8.field4264 = var3 * 1632281619;
      var8.field4250 = var4 * 454876301;
      var8.field4251 = var5 * 1977876794;
      var8.field4252 = -565540095 * var6;
      var8.field4248 = (int)(1115597881 * var1.field4249 * var7[0]) * -1076753689;
      var8.field4285 = 1989424741 * (int)(var7[1] * (367196657 * var1.field4259));
      var8.field4255 = 1034606045 * (int)(var1.field4249 * 1115597881 * var7[2]);
      var8.field4335 = -845375102 * (int)(293773697 * var1.field4259 * var7[3]);
      return var8;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("rh")
   public void method7312(int var1) {
      this.field4240 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bx")
   void method7239(int var1) {
      try {
         this.field4367 = new HashMap();
         this.field4268 = new HashMap();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lw.bx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bc")
   public void method7241(int var1, int var2, int var3) {
      try {
         if (this.field4375 * -1510882375 == 11) {
            if (this.field4367 == null) {
               this.method7239(-9650769);
            }

            this.field4367.put(var1, var2);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lw.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Llw;")
   @ObfuscatedName("wa")
   public Widget method7332(boolean var1) {
      this.field4315 = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("qn")
   public Widget method7333(int var1) {
      this.field4294 = var1 * 863028557;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(IIIIB)Z")
   @ObfuscatedName("br")
   public boolean method7247(int var1, int var2, int var3, int var4, byte var5) {
      try {
         if (11 == -1510882375 * this.field4375) {
            if (var5 <= 2) {
               throw new IllegalStateException();
            }

            if (this.field4366 != null) {
               if (var5 <= 2) {
                  throw new IllegalStateException();
               }

               if (this.method7249(1355775728)) {
                  var1 -= var3;
                  var2 -= var4;
                  int var6 = (int)(this.field4366.method7470(-1568061385)[0] * (this.field4249 * 1115597881));
                  int var7 = (int)(this.field4366.method7470(-1201967217)[1] * (this.field4259 * 293773697));
                  int var8 = var6 + (int)(this.field4366.method7470(1325549162)[2] * (1115597881 * this.field4249));
                  int var9 = var7 + (int)(this.field4366.method7470(-2078599276)[3] * (this.field4259 * 293773697));
                  if (var1 >= var6) {
                     if (var5 <= 2) {
                        throw new IllegalStateException();
                     }

                     if (var2 >= var7) {
                        if (var5 <= 2) {
                           throw new IllegalStateException();
                        }

                        if (var1 < var8) {
                           if (var5 <= 2) {
                              throw new IllegalStateException();
                           }

                           if (var2 < var9) {
                              if (var5 <= 2) {
                                 throw new IllegalStateException();
                              }

                              return true;
                           }
                        }
                     }
                  }

                  return false;
               }

               if (var5 <= 2) {
                  throw new IllegalStateException();
               }
            }
         }

         return false;
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "lw.br(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;I)Z")
   @ObfuscatedName("tp")
   public static boolean method7215(Widget var0, int var1) {
      if (var0 == null) {
         var0.method7219(var1);
      }

      try {
         if (11 != var0.field4375 * -1510882375) {
            if (var0.field4375 * -1510882375 != 12) {
               return false;
            }

            if (var1 <= 403819328) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lw.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;B)V")
   @ObfuscatedName("au")
   public void method7207(int var1, String var2, byte var3) {
      try {
         label53: {
            if (this.actions != null) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               if (this.actions.length > var1) {
                  break label53;
               }

               if (var3 >= 0) {
                  return;
               }
            }

            String[] var4 = new String[1 + var1];
            if (this.actions != null) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               for (int var5 = 0; var5 < this.actions.length; var5++) {
                  if (var3 >= 0) {
                     return;
                  }

                  var4[var5] = this.actions[var5];
               }
            }

            this.actions = var4;
         }

         this.actions[var1] = var2;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "lw.au(" + ')');
      }
   }

   public String[] getActions() {
      return this.actions;
   }

   public int getParentId() {
      if (!classOE.field4843.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         int var1 = this.field4342 * -1502647899;
         if (var1 != -1) {
            return var1;
         } else {
            int var2 = this.getId();
            if (WidgetUtil.componentToInterface(var2) == classOE.field4843.getTopLevelInterfaceId()) {
               return -1;
            } else {
               int var3 = this.field4240;
               if (var3 != -1) {
                  InterfaceParent var4 = (InterfaceParent)classWK.field6691.field6613.method13383(var3);
                  if (var4 != null && var4.getId() == WidgetUtil.componentToInterface(var2)) {
                     return var3;
                  }

                  this.field4240 = -1;
               }

               int var8 = WidgetUtil.componentToInterface(this.getId());

               for (InterfaceParent var7 : classOE.field4843.method1676()) {
                  if (var8 == var7.getId()) {
                     return (int)var7.getHash();
                  }
               }

               return -1;
            }
         }
      }
   }

   public int getContentType() {
      return this.field4334 * -90794217;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Llw;")
   @ObfuscatedName("kh")
   public Widget method7316(int var1, int var2, int var3, int var4) {
      return this.method7351(var1).method7369(var2).method7344(var3).method7350(var4);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("bt")
   public int method7250(String var1, int var2) {
      try {
         if (11 == this.field4375 * -1510882375) {
            if (var2 == 1676325251) {
               throw new IllegalStateException();
            }

            if (this.field4366 != null) {
               if (var2 == 1676325251) {
                  throw new IllegalStateException();
               }

               if (this.method7249(1355775728)) {
                  return classMA.method7450(this.field4366, var1, (short)-13436);
               }

               if (var2 == 1676325251) {
                  throw new IllegalStateException();
               }
            }
         }

         return -1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lw.bt(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("ex")
   public int[] method7266() {
      if (11 == -1510882375 * this.field4375 && null != this.field4366) {
         int[] var1 = new int[3];
         int var2 = 0;

         for (classMD var4 : classMA.method7462(this.field4366, (byte)12)) {
            if (!var4.method7535((byte)-108).equals("user_id")) {
               if (var4.vmethod525(-1924566210) != 0) {
                  return null;
               }

               var1[var2++] = var4.vmethod523(-2038217113);
               if (var2 > 3) {
                  return null;
               }
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   public int getDragDeadTime() {
      return this.field4313 * 135384009;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bj")
   public int method7257(int var1) {
      try {
         if (null != this.field4268) {
            if (var1 == -1415490927) {
               throw new IllegalStateException();
            }

            if (!this.field4268.isEmpty()) {
               return 1;
            }
         }

         return 0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lw.bj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("bk")
   public int method7260(byte var1) {
      try {
         if (11 == this.field4375 * -1510882375) {
            if (var1 >= 2) {
               throw new IllegalStateException();
            }

            if (null != this.field4366) {
               if (var1 >= 2) {
                  throw new IllegalStateException();
               }

               if (this.field4268 != null) {
                  if (var1 >= 2) {
                     throw new IllegalStateException();
                  }

                  if (!this.field4268.isEmpty()) {
                     String var2 = classMA.method7468(this.field4366, -391312536);
                     if (var2 != null && this.field4268.containsKey(classMA.method7468(this.field4366, -56824379))) {
                        return (Integer)this.field4268.get(var2);
                     }

                     return -1;
                  }

                  if (var1 >= 2) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         return -1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lw.bk(" + 41);
      }
   }

   public boolean getTextShadowed() {
      return this.field4306;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("bo")
   public String method7263(int var1) {
      try {
         if (-1510882375 * this.field4375 == 11) {
            if (var1 <= -99418320) {
               throw new IllegalStateException();
            }

            if (this.field4366 != null) {
               String var2 = classMA.method7468(this.field4366, -1718468240);
               Iterator var3 = classMA.method7462(this.field4366, (byte)119).iterator();

               while (var3.hasNext()) {
                  if (var1 <= -99418320) {
                     throw new IllegalStateException();
                  }

                  classMD var4 = (classMD)var3.next();
                  String var5 = String.format("%%%S%%", var4.method7535((byte)-51));
                  if (var4.vmethod525(-450426704) == 0) {
                     if (var1 <= -99418320) {
                        throw new IllegalStateException();
                     }

                     var2.replaceAll(var5, Integer.toString(var4.vmethod523(-1704902832)));
                  } else {
                     var2.replaceAll(var5, var4.vmethod519(1699599846));
                  }
               }

               return var2;
            }

            if (var1 <= -99418320) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "lw.bo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[I")
   @ObfuscatedName("bu")
   public int[] method7267(byte var1) {
      try {
         if (11 == -1510882375 * this.field4375) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            if (null != this.field4366) {
               int[] var2 = new int[3];
               int var3 = 0;
               Iterator var4 = classMA.method7462(this.field4366, (byte)106).iterator();

               while (var4.hasNext()) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  classMD var5 = (classMD)var4.next();
                  if (!var5.method7535((byte)-54).equals("user_id")) {
                     if (var1 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (var5.vmethod525(1565430181) != 0) {
                        return null;
                     }

                     if (var1 <= 1) {
                        throw new IllegalStateException();
                     }

                     var2[var3++] = var5.vmethod523(-1525521641);
                     if (var3 > 3) {
                        if (var1 <= 1) {
                           throw new IllegalStateException();
                        }

                        return null;
                     }
                  }
               }

               return var2;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "lw.bu(" + ')');
      }
   }

   public net.runelite.api.widgets.Widget[] getDynamicChildren() {
      Widget var1 = classOE.field4843.method2295(this.field4329 * -1163656551);
      if (var1 == null) {
         return new net.runelite.api.widgets.Widget[0];
      } else {
         Widget[] var2 = var1.field4340;
         if (var2 == null) {
            return new net.runelite.api.widgets.Widget[0];
         } else {
            ArrayList var3 = new ArrayList();

            for (Widget var7 : var2) {
               if (var7 != null) {
                  assert var7.field4342 * -1502647899 == this.field4329 * -1163656551;

                  if (var7.field4263 * 653784551 == this.field4260 * 63131743) {
                     var3.add(var7);
                  }
               }
            }

            return var3.toArray(new Widget[0]);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;ILjava/lang/Object;)Ljava/lang/Object;")
   @ObfuscatedName("lh")
   public static Object method7221(Widget var0, int var1, Object var2) {
      if (var0 == null) {
         var0.setItemQuantityMode(var1);
      }

      for (int var3 = 0; var3 < -2048004067 * var0.field4308; var3++) {
         if (var1 == var0.field4405[var3]) {
            return var0.field4336[var3];
         }
      }

      return var2;
   }

   public int getDragDeadZone() {
      return this.field4368 * -782836685;
   }

   @ObfuscatedSignature(descriptor = "(I)Lma;")
   @ObfuscatedName("ba")
   public classMA method7270(int var1) {
      try {
         return this.field4366;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lw.ba(" + ')');
      }
   }

   public void setOnOpListener(Object[] var1) {
      this.field4386 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("ag")
   void method7172(classXY var1, int var2) {
      try {
         classXY.method13039(var1, -346779531);
         this.field4275 = true;
         this.field4375 = classXY.method13039(var1, -346779531) * 685068937;
         this.field4334 = classXY.method13047(var1, -241947726) * -411168601;
         this.field4248 = var1.method13050((byte)16) * -1076753689;
         this.field4285 = var1.method13050((byte)16) * 1989424741;
         this.field4255 = classXY.method13047(var1, 106831180) * 1034606045;
         if (9 == this.field4375 * -1510882375) {
            this.field4335 = var1.method13050((byte)16) * -259501473;
         } else {
            this.field4335 = classXY.method13047(var1, 998811198) * -259501473;
         }

         this.field4251 = classXY.method13043(var1, (byte)17) * -1430539503;
         this.field4252 = classXY.method13043(var1, (byte)17) * -565540095;
         this.field4264 = classXY.method13043(var1, (byte)17) * 1632281619;
         this.field4250 = classXY.method13043(var1, (byte)17) * 454876301;
         this.field4342 = classXY.method13047(var1, -1842555802) * -676768211;
         if (-1502647899 * this.field4342 == 65535) {
            if (var2 != 1218236279) {
               throw new IllegalStateException();
            }

            this.field4342 = 676768211;
         } else {
            this.field4342 = -676768211 * (-1502647899 * this.field4342 + (-1163656551 * this.field4329 & -65536));
         }

         boolean var10001;
         if (classXY.method13039(var1, -346779531) == 1) {
            if (var2 != 1218236279) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.field4289 = var10001;
         if (0 == -1510882375 * this.field4375) {
            this.field4258 = classXY.method13047(var1, -126044868) * -803344527;
            this.field4269 = classXY.method13047(var1, 1051631118) * -251301447;
            if (classXY.method13039(var1, -346779531) == 1) {
               if (var2 != 1218236279) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.field4403 = var10001;
         }

         if (5 == this.field4375 * -1510882375) {
            if (var2 != 1218236279) {
               throw new IllegalStateException();
            }

            this.field4348 = var1.method13056((byte)1) * 857041169;
            this.field4351 = classXY.method13047(var1, -359716027) * -727683123;
            if (classXY.method13039(var1, -346779531) == 1) {
               if (var2 != 1218236279) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.field4282 = var10001;
            this.field4347 = classXY.method13039(var1, -346779531) * -2056841747;
            this.field4283 = classXY.method13039(var1, -346779531) * -1993421947;
            this.field4284 = var1.method13056((byte)1) * 37017731;
            if (classXY.method13039(var1, -346779531) == 1) {
               if (var2 != 1218236279) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.field4352 = var10001;
            if (classXY.method13039(var1, -346779531) == 1) {
               if (var2 != 1218236279) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.field4256 = var10001;
         }

         if (6 == this.field4375 * -1510882375) {
            if (var2 != 1218236279) {
               throw new IllegalStateException();
            }

            this.field4333 = 656328391;
            this.field4374 = var1.method13117(classXM.field6888.field6890, 2125942098) * 434741949;
            this.field4290 = var1.method13050((byte)16) * 1981476425;
            this.field4291 = var1.method13050((byte)16) * 1954863581;
            this.field4356 = classXY.method13047(var1, 1370270829) * 1703663435;
            this.field4292 = classXY.method13047(var1, 994802512) * 993003239;
            this.field4294 = classXY.method13047(var1, 450674507) * 863028557;
            this.field4338 = classXY.method13047(var1, -1508902731) * 1556726191;
            this.field4288 = classXY.method13047(var1, -1221385387) * 742198477;
            if (65535 == this.field4288 * 2114568197) {
               if (var2 != 1218236279) {
                  throw new IllegalStateException();
               }

               this.field4288 = -742198477;
            }

            if (classXY.method13039(var1, -346779531) == 1) {
               if (var2 != 1218236279) {
                  return;
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.field4297 = var10001;
            classXY.method13047(var1, -450046437);
            if (-1966367247 * this.field4251 != 0) {
               this.field4296 = classXY.method13047(var1, -520213711) * 1299951355;
            }

            if (this.field4252 * 372143361 != 0) {
               classXY.method13047(var1, -1192075905);
            }
         }

         if (4 == -1510882375 * this.field4375) {
            if (var2 != 1218236279) {
               return;
            }

            this.field4245 = classXY.method13047(var1, -1135544449) * 590574429;
            if (this.field4245 * -1803847435 == 65535) {
               if (var2 != 1218236279) {
                  throw new IllegalStateException();
               }

               this.field4245 = -590574429;
            }

            this.field4301 = var1.method13071(-945185794);
            this.field4303 = classXY.method13039(var1, -346779531) * -763080175;
            this.field4304 = classXY.method13039(var1, -346779531) * 571804797;
            this.field4305 = classXY.method13039(var1, -346779531) * -2106140265;
            if (classXY.method13039(var1, -346779531) == 1) {
               if (var2 != 1218236279) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.field4306 = var10001;
            this.field4270 = var1.method13056((byte)1) * 1590850751;
         }

         if (-1510882375 * this.field4375 == 3) {
            if (var2 != 1218236279) {
               throw new IllegalStateException();
            }

            this.field4270 = var1.method13056((byte)1) * 1590850751;
            this.field4271 = classXY.method13039(var1, -346779531) == 1;
            this.field4347 = classXY.method13039(var1, -346779531) * -2056841747;
         }

         if (9 == this.field4375 * -1510882375) {
            if (var2 != 1218236279) {
               throw new IllegalStateException();
            }

            this.field4277 = classXY.method13039(var1, -346779531) * 327091521;
            this.field4270 = var1.method13056((byte)1) * 1590850751;
            if (classXY.method13039(var1, -346779531) == 1) {
               if (var2 != 1218236279) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.field4278 = var10001;
         }

         this.field4320 = var1.method13051(-758448158) * 997939289;
         this.field4309 = var1.method13071(-205058935);
         int var3 = classXY.method13039(var1, -346779531);
         if (var3 > 0) {
            if (var2 != 1218236279) {
               throw new IllegalStateException();
            }

            this.actions = new String[var3];

            for (int var4 = 0; var4 < var3; var4++) {
               if (var2 != 1218236279) {
                  return;
               }

               this.actions[var4] = var1.method13071(-520288158);
            }
         }

         this.field4368 = classXY.method13039(var1, -346779531) * 230129403;
         this.field4313 = classXY.method13039(var1, -346779531) * -2074329479;
         if (classXY.method13039(var1, -346779531) == 1) {
            if (var2 != 1218236279) {
               return;
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.field4314 = var10001;
         this.field4345 = var1.method13071(-140187877);
         this.field4376 = this.method7178(var1, 1062416733);
         this.field4402 = this.method7178(var1, 2099116228);
         this.field4361 = this.method7178(var1, 1842509635);
         this.field4350 = this.method7178(var1, 1263183737);
         this.field4381 = this.method7178(var1, 2071129357);
         this.field4382 = this.method7178(var1, 1394211475);
         this.field4355 = this.method7178(var1, 938205581);
         this.field4384 = this.method7178(var1, 1050161569);
         this.field4343 = this.method7178(var1, 540048844);
         this.field4386 = this.method7178(var1, 1635652811);
         this.field4286 = this.method7178(var1, 1062349515);
         this.field4359 = this.method7178(var1, 766182010);
         this.field4377 = this.method7178(var1, 1391640694);
         this.field4357 = this.method7178(var1, 1455687462);
         this.field4378 = this.method7178(var1, 1358422772);
         this.field4379 = this.method7178(var1, 2019082877);
         this.field4380 = this.method7178(var1, 1756166187);
         this.field4387 = this.method7178(var1, 1010164295);
         this.field4280 = this.method7180(var1, -1089851676);
         this.field4267 = this.method7180(var1, 1812795025);
         this.field4385 = this.method7180(var1, 209304390);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "lw.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("qh")
   public Widget method7334(int var1) {
      this.field4333 = var1 * 656328391;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bi")
   public void method7281(int var1) {
      try {
         this.field4369 = new classLX();

         for (int var2 = 1; var2 <= 12; var2++) {
            this.field4369.field4420.method11132(var2, 0, 1709853166);
         }

         for (char var4 = 0; var4 < ' '; var4++) {
            this.field4369.field4420.method11136(var4, 0, (byte)64);
         }

         this.field4369.field4420.method11136('\u0080', 0, (byte)73);
         this.field4369.field4420.method11132(82, 2, 2049801007);
         this.field4369.field4420.method11132(81, 2, 1782508591);
         this.field4369.field4420.method11132(86, 2, 1948751082);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lw.bi(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Llh;")
   @ObfuscatedName("be")
   public classLH method7283(int var1) {
      try {
         classLH var10000;
         if (null != this.field4369) {
            if (var1 >= 32768) {
               throw new IllegalStateException();
            }

            var10000 = this.field4369.field4419;
         } else {
            var10000 = null;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lw.be(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("gw")
   public Widget method7335(int var1) {
      this.field4344 = var1 * 911947905;
      return this;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("yz")
   public int[] method7336() {
      return this.field4372;
   }

   @ObfuscatedSignature(descriptor = "(I)Llx;")
   @ObfuscatedName("bf")
   public classLX method7294(int var1) {
      try {
         return this.field4369;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lw.bf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llh;I)Z")
   @ObfuscatedName("bs")
   boolean method7297(classLH var1, int var2) {
      try {
         boolean var3 = false;
         if (this.field4301 != null) {
            if (var2 >= -1338474268) {
               throw new IllegalStateException();
            }

            if (!this.field4301.isEmpty()) {
               if (var2 >= -1338474268) {
                  throw new IllegalStateException();
               }

               var3 |= classLH.method6804(var1, classLB.method6662(this.field4301, -904615318), -1480555760);
               this.field4301 = "";
            }
         }

         if (this.field4302 != null && !this.field4302.isEmpty()) {
            if (var2 >= -1338474268) {
               throw new IllegalStateException();
            }

            var3 |= var1.method6809(classLB.method6662(this.field4302, -1261950944), 1655923611);
            this.field4302 = "";
         }

         return var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lw.bs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Llw;")
   @ObfuscatedName("su")
   public Widget method7323(int var1, int var2) {
      return this.method7343(var1).method7337(var2);
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("bu")
   public Widget method7337(int var1) {
      this.field4335 = var1 * -259501473;
      return this;
   }

   public Object[] getOnVarTransmitListener() {
      return this.field4382;
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lly;Lda;B)Lym;")
   @ObfuscatedName("ba")
   public static SpritePixels method7190(Widget var0, classLY var1, classDA var2, byte var3) {
      if (var0 == null) {
         var0.method7191(var1, var2, var3);
      }

      try {
         if (var0.field4339 != null) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            if (null != var2) {
               classLN var4 = (classLN)var1.field4438.method9981(var0.field4339, (byte)-26);
               if (null == var4) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  var4 = new classLN(var0.field4339, var2);
                  var1.field4438.method9982(var0.field4339, var4, (byte)1);
               }

               return var4.method7123(1214443818);
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "lw.al(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILlw;IIIII[F)Llw;")
   @ObfuscatedName("bv")
   static Widget method7159(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      Widget var8 = new Widget();
      var8.field4375 = 685068937 * var0;
      var8.field4342 = 498391781 * var1.field4329;
      var8.field4260 = var2 * -1612510305;
      var8.field4275 = true;
      var8.field4264 = var3 * -586967037;
      var8.field4250 = var4 * 454876301;
      var8.field4251 = var5 * -1430539503;
      var8.field4252 = -1106115532 * var6;
      var8.field4248 = (int)(1115597881 * var1.field4249 * var7[0]) * 368215045;
      var8.field4285 = 2124598895 * (int)(var7[1] * (293773697 * var1.field4259));
      var8.field4255 = 1034606045 * (int)(var1.field4249 * 1115597881 * var7[2]);
      var8.field4335 = -1953519449 * (int)(293773697 * var1.field4259 * var7[3]);
      return var8;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("ih")
   public Widget method7338(int var1) {
      this.field4251 = var1 * -1430539503;
      return this;
   }

   public int getYPositionMode() {
      return this.field4250 * 923944517;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Lym;)V")
   @ObfuscatedName("pz")
   public static void method7194(Widget var0, SpritePixels var1) {
      if (var0.field4352) {
         var1.method13498();
      }

      if (var0.field4256) {
         var1.method13491();
      }

      if (-2011859635 * var0.field4283 > 0) {
         var1.method13486(var0.field4283 * -2011859635);
      }

      if (var0.field4283 * -2011859635 >= 1) {
         var1.method13500(1);
      }

      if (var0.field4283 * -2011859635 >= 2) {
         var1.method13500(16777215);
      }

      if (880555563 * var0.field4284 != 0) {
         classHJ.method6064(var1, var0.field4284 * 880555563);
      }
   }

   public Object[] getOnLoadListener() {
      return this.field4376;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILlw;IIIII[F)Llw;")
   @ObfuscatedName("bh")
   static Widget method7160(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      Widget var8 = new Widget();
      var8.field4375 = 1274993067 * var0;
      var8.field4342 = -953747743 * var1.field4329;
      var8.field4260 = var2 * -1612510305;
      var8.field4275 = true;
      var8.field4264 = var3 * 1632281619;
      var8.field4250 = var4 * 744640539;
      var8.field4251 = var5 * 1757502277;
      var8.field4252 = -565540095 * var6;
      var8.field4248 = (int)(1055563839 * var1.field4249 * var7[0]) * 924658261;
      var8.field4285 = -1966132731 * (int)(var7[1] * (-1640459841 * var1.field4259));
      var8.field4255 = 1330453301 * (int)(var1.field4249 * 2032338429 * var7[2]);
      var8.field4335 = 1791847397 * (int)(637353772 * var1.field4259 * var7[3]);
      return var8;
   }

   public void setDragDeadZone(int var1) {
      this.field4368 = var1 * 230129403;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("du")
   public boolean method7216() {
      return 11 == this.field4375 * -1510882375 || this.field4375 * -1510882375 == 12;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;")
   @ObfuscatedName("cu")
   Object[] method7162(Object[] var1) {
      return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ev")
   public int method7261() {
      if (11 == this.field4375 * -1510882375 && null != this.field4366 && this.field4268 != null && !this.field4268.isEmpty()) {
         String var1 = classMA.method7468(this.field4366, -1228083952);
         return var1 != null && this.field4268.containsKey(classMA.method7468(this.field4366, -98673453)) ? (Integer)this.field4268.get(var1) : -1;
      } else {
         return -1;
      }
   }

   public int getItemId() {
      return this.field4319 * 2073671441;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("cq")
   void method7168(classXY var1) {
      this.field4275 = false;
      this.field4375 = classXY.method13039(var1, -346779531) * -128351660;
      this.field4247 = classXY.method13039(var1, -346779531) * -811438059;
      this.field4334 = classXY.method13047(var1, 1401870401) * -411168601;
      this.field4248 = var1.method13050((byte)16) * -1076753689;
      this.field4285 = var1.method13050((byte)16) * 1286043683;
      this.field4255 = classXY.method13047(var1, -60978058) * -1283191478;
      this.field4335 = classXY.method13047(var1, 1042200530) * -259501473;
      this.field4347 = classXY.method13039(var1, -346779531) * 204805685;
      this.field4342 = classXY.method13047(var1, 1143601347) * 328312260;
      if (-621277242 == this.field4342 * -1502647899) {
         this.field4342 = -70821381;
      } else {
         this.field4342 = -1504986339 * ((-682734575 * this.field4329 & -65536) + -1502647899 * this.field4342);
      }

      this.field4316 = classXY.method13047(var1, 1687274602) * 335111401;
      if (-2003253155 * this.field4316 == -1912793676) {
         this.field4316 = 1709618187;
      }

      int var2 = classXY.method13039(var1, -346779531);
      if (var2 > 0) {
         this.field4400 = new int[var2];
         this.field4401 = new int[var2];

         for (int var3 = 0; var3 < var2; var3++) {
            this.field4400[var3] = classXY.method13039(var1, -346779531);
            this.field4401[var3] = classXY.method13047(var1, -551266725);
         }
      }

      int var7 = classXY.method13039(var1, -346779531);
      if (var7 > 0) {
         this.field4399 = new int[var7][];

         for (int var4 = 0; var4 < var7; var4++) {
            int var5 = classXY.method13047(var1, -80780034);
            this.field4399[var4] = new int[var5];

            for (int var6 = 0; var6 < var5; var6++) {
               this.field4399[var4][var6] = classXY.method13047(var1, -374051823);
               if (this.field4399[var4][var6] == 65535) {
                  this.field4399[var4][var6] = -1;
               }
            }
         }
      }

      if (0 == 1850134265 * this.field4375) {
         this.field4269 = classXY.method13047(var1, 1546002490) * 1065509630;
         this.field4289 = classXY.method13039(var1, -346779531) == 1;
      }

      if (933354515 * this.field4375 == 1) {
         classXY.method13047(var1, -1915000606);
         classXY.method13039(var1, -346779531);
      }

      if (3 == -1510882375 * this.field4375) {
         this.field4271 = classXY.method13039(var1, -346779531) == 1;
      }

      if (4 == -1510882375 * this.field4375 || 1 == this.field4375 * -683575018) {
         this.field4304 = classXY.method13039(var1, -346779531) * 571804797;
         this.field4305 = classXY.method13039(var1, -346779531) * -2106140265;
         this.field4303 = classXY.method13039(var1, -346779531) * -763080175;
         this.field4245 = classXY.method13047(var1, 399617741) * 590574429;
         if (65535 == this.field4245 * -1803847435) {
            this.field4245 = -590574429;
         }

         this.field4306 = classXY.method13039(var1, -346779531) == 1;
      }

      if (this.field4375 * 1297721274 == 4) {
         this.field4301 = var1.method13071(-12428429);
         this.field4302 = var1.method13071(2111397842);
      }

      if (1 == -1510882375 * this.field4375 || 3 == this.field4375 * -1510882375 || this.field4375 * -1094427885 == 4) {
         this.field4270 = var1.method13056((byte)1) * 1590850751;
      }

      if (748512751 * this.field4375 == 3 || 4 == this.field4375 * -1510882375) {
         this.field4295 = var1.method13056((byte)1) * -1914223631;
         this.field4272 = var1.method13056((byte)1) * -1882190803;
         this.field4273 = var1.method13056((byte)1) * -1240050015;
      }

      if (5 == this.field4375 * -1517632705) {
         this.field4348 = var1.method13056((byte)1) * 1518739138;
         this.field4349 = var1.method13056((byte)1) * -421179023;
      }

      if (-1510882375 * this.field4375 == 6) {
         this.field4333 = 656328391;
         this.field4287 = -780893970;
         this.field4374 = var1.method13117(classXM.field6888.field6890, 1906598215) * -87747870;
         this.field4354 = var1.method13117(classXM.field6888.field6890, 1817992397) * 607878109;
         this.field4288 = classXY.method13047(var1, 1354374627) * 742198477;
         if (-142663889 == 511129499 * this.field4288) {
            this.field4288 = 439398981;
         }

         this.field4293 = classXY.method13047(var1, -315022870) * 860859185;
         if (821151237 * this.field4293 == 343415003) {
            this.field4293 = -668997325;
         }

         this.field4338 = classXY.method13047(var1, 1127683100) * 2091023102;
         this.field4356 = classXY.method13047(var1, -1891040268) * 221177667;
         this.field4292 = classXY.method13047(var1, 527139157) * 993003239;
      }

      if (8 == -1510882375 * this.field4375) {
         this.field4301 = var1.method13071(-104668453);
      }

      if (this.field4247 * -851058883 == 2) {
         this.field4345 = var1.method13071(281444230);
         this.field4317 = var1.method13071(-470459418);
         int var8 = classXY.method13047(var1, -265984299) & 1535487212;
         this.field4320 = (this.field4320 * 1595830249 | var8 << 11) * -478897898;
      }

      if (this.field4247 * -851058883 == 1 || 4 == this.field4247 * -851058883 || 5 == -851058883 * this.field4247 || 6 == this.field4247 * -851058883) {
         this.field4318 = var1.method13071(396039062);
         if (this.field4318.isEmpty()) {
            if (1 == this.field4247 * -851058883) {
               this.field4318 = classKK.field3795;
            }

            if (4 == 2094523513 * this.field4247) {
               this.field4318 = classKK.field3612;
            }

            if (-1420259847 * this.field4247 == 5) {
               this.field4318 = classKK.field3612;
            }

            if (-851058883 * this.field4247 == 6) {
               this.field4318 = classKK.field3777;
            }
         }
      }

      if (1394324302 * this.field4247 == 1 || 4 == -851058883 * this.field4247 || -851058883 * this.field4247 == 5) {
         this.field4320 = -1082124704 * (1595830249 * this.field4320 | 4194304);
      }

      if (-241045171 * this.field4247 == 6) {
         this.field4320 = (this.field4320 * 1595830249 | 1) * 997939289;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("cl")
   void method7173(classXY var1) {
      classXY.method13039(var1, -346779531);
      this.field4275 = true;
      this.field4375 = classXY.method13039(var1, -346779531) * 685068937;
      this.field4334 = classXY.method13047(var1, 1226095204) * -411168601;
      this.field4248 = var1.method13050((byte)16) * -1076753689;
      this.field4285 = var1.method13050((byte)16) * 1989424741;
      this.field4255 = classXY.method13047(var1, 1706687071) * 1034606045;
      if (9 == this.field4375 * -1510882375) {
         this.field4335 = var1.method13050((byte)16) * -259501473;
      } else {
         this.field4335 = classXY.method13047(var1, -1796836835) * -259501473;
      }

      this.field4251 = classXY.method13043(var1, (byte)17) * -1430539503;
      this.field4252 = classXY.method13043(var1, (byte)17) * -565540095;
      this.field4264 = classXY.method13043(var1, (byte)17) * 1632281619;
      this.field4250 = classXY.method13043(var1, (byte)17) * 454876301;
      this.field4342 = classXY.method13047(var1, -1371666693) * -676768211;
      if (-1502647899 * this.field4342 == 65535) {
         this.field4342 = 676768211;
      } else {
         this.field4342 = -676768211 * (-1502647899 * this.field4342 + (-1163656551 * this.field4329 & -65536));
      }

      this.field4289 = classXY.method13039(var1, -346779531) == 1;
      if (0 == -1510882375 * this.field4375) {
         this.field4258 = classXY.method13047(var1, -800624117) * -803344527;
         this.field4269 = classXY.method13047(var1, -1235426038) * -251301447;
         this.field4403 = classXY.method13039(var1, -346779531) == 1;
      }

      if (5 == this.field4375 * -1510882375) {
         this.field4348 = var1.method13056((byte)1) * 857041169;
         this.field4351 = classXY.method13047(var1, -1604054585) * -727683123;
         this.field4282 = classXY.method13039(var1, -346779531) == 1;
         this.field4347 = classXY.method13039(var1, -346779531) * -2056841747;
         this.field4283 = classXY.method13039(var1, -346779531) * -1993421947;
         this.field4284 = var1.method13056((byte)1) * 37017731;
         this.field4352 = classXY.method13039(var1, -346779531) == 1;
         this.field4256 = classXY.method13039(var1, -346779531) == 1;
      }

      if (6 == this.field4375 * -1510882375) {
         this.field4333 = 656328391;
         this.field4374 = var1.method13117(classXM.field6888.field6890, 1885025106) * 434741949;
         this.field4290 = var1.method13050((byte)16) * 1981476425;
         this.field4291 = var1.method13050((byte)16) * 1954863581;
         this.field4356 = classXY.method13047(var1, -490902197) * 1703663435;
         this.field4292 = classXY.method13047(var1, 30676335) * 993003239;
         this.field4294 = classXY.method13047(var1, 144456973) * 863028557;
         this.field4338 = classXY.method13047(var1, -109871164) * 1556726191;
         this.field4288 = classXY.method13047(var1, 33839186) * 742198477;
         if (65535 == this.field4288 * 2114568197) {
            this.field4288 = -742198477;
         }

         this.field4297 = classXY.method13039(var1, -346779531) == 1;
         classXY.method13047(var1, -1573447692);
         if (-1966367247 * this.field4251 != 0) {
            this.field4296 = classXY.method13047(var1, -181170079) * 1299951355;
         }

         if (this.field4252 * 372143361 != 0) {
            classXY.method13047(var1, -434676914);
         }
      }

      if (4 == -1510882375 * this.field4375) {
         this.field4245 = classXY.method13047(var1, 259000072) * 590574429;
         if (this.field4245 * -1803847435 == 65535) {
            this.field4245 = -590574429;
         }

         this.field4301 = var1.method13071(1660926795);
         this.field4303 = classXY.method13039(var1, -346779531) * -763080175;
         this.field4304 = classXY.method13039(var1, -346779531) * 571804797;
         this.field4305 = classXY.method13039(var1, -346779531) * -2106140265;
         this.field4306 = classXY.method13039(var1, -346779531) == 1;
         this.field4270 = var1.method13056((byte)1) * 1590850751;
      }

      if (-1510882375 * this.field4375 == 3) {
         this.field4270 = var1.method13056((byte)1) * 1590850751;
         this.field4271 = classXY.method13039(var1, -346779531) == 1;
         this.field4347 = classXY.method13039(var1, -346779531) * -2056841747;
      }

      if (9 == this.field4375 * -1510882375) {
         this.field4277 = classXY.method13039(var1, -346779531) * 327091521;
         this.field4270 = var1.method13056((byte)1) * 1590850751;
         this.field4278 = classXY.method13039(var1, -346779531) == 1;
      }

      this.field4320 = var1.method13051(-758448158) * 997939289;
      this.field4309 = var1.method13071(1682930918);
      int var2 = classXY.method13039(var1, -346779531);
      if (var2 > 0) {
         this.actions = new String[var2];

         for (int var3 = 0; var3 < var2; var3++) {
            this.actions[var3] = var1.method13071(-583830759);
         }
      }

      this.field4368 = classXY.method13039(var1, -346779531) * 230129403;
      this.field4313 = classXY.method13039(var1, -346779531) * -2074329479;
      this.field4314 = classXY.method13039(var1, -346779531) == 1;
      this.field4345 = var1.method13071(994951657);
      this.field4376 = this.method7178(var1, 1274305683);
      this.field4402 = this.method7178(var1, 810947961);
      this.field4361 = this.method7178(var1, 1255855957);
      this.field4350 = this.method7178(var1, 392879593);
      this.field4381 = this.method7178(var1, 644062094);
      this.field4382 = this.method7178(var1, 1805554483);
      this.field4355 = this.method7178(var1, 507220260);
      this.field4384 = this.method7178(var1, 806431069);
      this.field4343 = this.method7178(var1, 2027846104);
      this.field4386 = this.method7178(var1, 1045371606);
      this.field4286 = this.method7178(var1, 1126525558);
      this.field4359 = this.method7178(var1, 1752793236);
      this.field4377 = this.method7178(var1, 783002508);
      this.field4357 = this.method7178(var1, 760327156);
      this.field4378 = this.method7178(var1, 743115669);
      this.field4379 = this.method7178(var1, 989426923);
      this.field4380 = this.method7178(var1, 1446497328);
      this.field4387 = this.method7178(var1, 1031532315);
      this.field4280 = this.method7180(var1, -676093146);
      this.field4267 = this.method7180(var1, -610265893);
      this.field4385 = this.method7180(var1, 1578417430);
   }

   public int getHeight() {
      return this.field4259 * 293773697;
   }

   public void setNoScrollThrough(boolean var1) {
      this.field4328 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("hj")
   public Widget method7339(int var1) {
      this.field4269 = var1 * -251301447;
      return this;
   }

   public void setBorderType(int var1) {
      this.field4283 = var1 * -1993421947;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;II)I")
   @ObfuscatedName("ne")
   public static int method7223(Widget var0, int var1, int var2) {
      if (var0 == null) {
         var0.getScrollWidth();
      }

      for (int var3 = 0; var3 < -1461666972 * var0.field4308; var3++) {
         if (var1 == var0.field4405[var3]) {
            return (Integer)var0.field4336[var3];
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("cd")
   void method7174(classXY var1) {
      classXY.method13039(var1, -346779531);
      this.field4275 = true;
      this.field4375 = classXY.method13039(var1, -346779531) * 685068937;
      this.field4334 = classXY.method13047(var1, -572661734) * -411168601;
      this.field4248 = var1.method13050((byte)16) * -1076753689;
      this.field4285 = var1.method13050((byte)16) * 1989424741;
      this.field4255 = classXY.method13047(var1, 7580717) * 1034606045;
      if (9 == this.field4375 * -1510882375) {
         this.field4335 = var1.method13050((byte)16) * -259501473;
      } else {
         this.field4335 = classXY.method13047(var1, 1807899564) * -259501473;
      }

      this.field4251 = classXY.method13043(var1, (byte)17) * -1430539503;
      this.field4252 = classXY.method13043(var1, (byte)17) * -565540095;
      this.field4264 = classXY.method13043(var1, (byte)17) * 1632281619;
      this.field4250 = classXY.method13043(var1, (byte)17) * 454876301;
      this.field4342 = classXY.method13047(var1, 960579237) * -676768211;
      if (-1502647899 * this.field4342 == 65535) {
         this.field4342 = 676768211;
      } else {
         this.field4342 = -676768211 * (-1502647899 * this.field4342 + (-1163656551 * this.field4329 & -65536));
      }

      this.field4289 = classXY.method13039(var1, -346779531) == 1;
      if (0 == -1510882375 * this.field4375) {
         this.field4258 = classXY.method13047(var1, 1648727926) * -803344527;
         this.field4269 = classXY.method13047(var1, -551555091) * -251301447;
         this.field4403 = classXY.method13039(var1, -346779531) == 1;
      }

      if (5 == this.field4375 * -1510882375) {
         this.field4348 = var1.method13056((byte)1) * 857041169;
         this.field4351 = classXY.method13047(var1, 807489590) * -727683123;
         this.field4282 = classXY.method13039(var1, -346779531) == 1;
         this.field4347 = classXY.method13039(var1, -346779531) * -2056841747;
         this.field4283 = classXY.method13039(var1, -346779531) * -1993421947;
         this.field4284 = var1.method13056((byte)1) * 37017731;
         this.field4352 = classXY.method13039(var1, -346779531) == 1;
         this.field4256 = classXY.method13039(var1, -346779531) == 1;
      }

      if (6 == this.field4375 * -1510882375) {
         this.field4333 = 656328391;
         this.field4374 = var1.method13117(classXM.field6888.field6890, 1446318228) * 434741949;
         this.field4290 = var1.method13050((byte)16) * 1981476425;
         this.field4291 = var1.method13050((byte)16) * 1954863581;
         this.field4356 = classXY.method13047(var1, 17865158) * 1703663435;
         this.field4292 = classXY.method13047(var1, 163568153) * 993003239;
         this.field4294 = classXY.method13047(var1, -51558828) * 863028557;
         this.field4338 = classXY.method13047(var1, 288905224) * 1556726191;
         this.field4288 = classXY.method13047(var1, 924238525) * 742198477;
         if (65535 == this.field4288 * 2114568197) {
            this.field4288 = -742198477;
         }

         this.field4297 = classXY.method13039(var1, -346779531) == 1;
         classXY.method13047(var1, 1026166147);
         if (-1966367247 * this.field4251 != 0) {
            this.field4296 = classXY.method13047(var1, 745655976) * 1299951355;
         }

         if (this.field4252 * 372143361 != 0) {
            classXY.method13047(var1, -673847697);
         }
      }

      if (4 == -1510882375 * this.field4375) {
         this.field4245 = classXY.method13047(var1, -1164198420) * 590574429;
         if (this.field4245 * -1803847435 == 65535) {
            this.field4245 = -590574429;
         }

         this.field4301 = var1.method13071(366086190);
         this.field4303 = classXY.method13039(var1, -346779531) * -763080175;
         this.field4304 = classXY.method13039(var1, -346779531) * 571804797;
         this.field4305 = classXY.method13039(var1, -346779531) * -2106140265;
         this.field4306 = classXY.method13039(var1, -346779531) == 1;
         this.field4270 = var1.method13056((byte)1) * 1590850751;
      }

      if (-1510882375 * this.field4375 == 3) {
         this.field4270 = var1.method13056((byte)1) * 1590850751;
         this.field4271 = classXY.method13039(var1, -346779531) == 1;
         this.field4347 = classXY.method13039(var1, -346779531) * -2056841747;
      }

      if (9 == this.field4375 * -1510882375) {
         this.field4277 = classXY.method13039(var1, -346779531) * 327091521;
         this.field4270 = var1.method13056((byte)1) * 1590850751;
         this.field4278 = classXY.method13039(var1, -346779531) == 1;
      }

      this.field4320 = var1.method13051(-758448158) * 997939289;
      this.field4309 = var1.method13071(1943259612);
      int var2 = classXY.method13039(var1, -346779531);
      if (var2 > 0) {
         this.actions = new String[var2];

         for (int var3 = 0; var3 < var2; var3++) {
            this.actions[var3] = var1.method13071(829102579);
         }
      }

      this.field4368 = classXY.method13039(var1, -346779531) * 230129403;
      this.field4313 = classXY.method13039(var1, -346779531) * -2074329479;
      this.field4314 = classXY.method13039(var1, -346779531) == 1;
      this.field4345 = var1.method13071(-139400180);
      this.field4376 = this.method7178(var1, 1215530211);
      this.field4402 = this.method7178(var1, 975385127);
      this.field4361 = this.method7178(var1, 1659929587);
      this.field4350 = this.method7178(var1, 1423637524);
      this.field4381 = this.method7178(var1, 258283176);
      this.field4382 = this.method7178(var1, 245214415);
      this.field4355 = this.method7178(var1, 1950724952);
      this.field4384 = this.method7178(var1, 1358273455);
      this.field4343 = this.method7178(var1, 386757892);
      this.field4386 = this.method7178(var1, 460321647);
      this.field4286 = this.method7178(var1, 1013912744);
      this.field4359 = this.method7178(var1, 1093534699);
      this.field4377 = this.method7178(var1, 575681170);
      this.field4357 = this.method7178(var1, 1592924745);
      this.field4378 = this.method7178(var1, 1968989750);
      this.field4379 = this.method7178(var1, 802794107);
      this.field4380 = this.method7178(var1, 326377191);
      this.field4387 = this.method7178(var1, 1967657751);
      this.field4280 = this.method7180(var1, 629149806);
      this.field4267 = this.method7180(var1, -787508661);
      this.field4385 = this.method7180(var1, 664267371);
   }

   public int getOriginalY() {
      return this.field4285 * -265516179;
   }

   public int getFontId() {
      return this.field4245 * -1803847435;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("tg")
   public Widget method7340(int var1) {
      this.field4334 = var1 * -411168601;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("cv")
   void method7176(classXY var1) {
      this.field4332 = var1.method13071(-532316096);
   }

   @ObfuscatedSignature(descriptor = "(Llw;I)Ltt;")
   @ObfuscatedName("zg")
   public static classTT method7287(Widget var0, int var1) {
      if (var0 == null) {
         var0.method7292(var1);
      }

      try {
         return var0.field4369 != null ? var0.field4369.field4420 : null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lw.bq(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;)Llx;")
   @ObfuscatedName("dr")
   public static classLX method7295(Widget var0) {
      return var0.field4369;
   }

   public Object[] getOnInvTransmitListener() {
      return this.field4355;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("cs")
   void method7177(classXY var1) {
      this.field4332 = var1.method13071(-545224598);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)[I")
   @ObfuscatedName("co")
   int[] method7181(classXY var1) {
      int var2 = classXY.method13039(var1, -346779531);
      if (0 == var2) {
         return null;
      } else {
         int[] var3 = new int[var2];

         for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = var1.method13056((byte)1);
         }

         return var3;
      }
   }

   public int getClickMask() {
      return this.field4320 * 1595830249;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("he")
   public Widget method7341(int var1) {
      this.field4356 = var1 * 1703663435;
      return this;
   }

   @ObfuscatedSignature(descriptor = "([I)[I")
   @ObfuscatedName("ct")
   int[] method7165(int[] var1) {
      return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
   }

   @ObfuscatedSignature(descriptor = "(Lly;Z)Lkh;")
   @ObfuscatedName("hy")
   public classKH method7342(classLY var1, boolean var2) {
      return this.method7204(var1, var2, 555383795);
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("nj")
   public Widget method7343(int var1) {
      this.field4255 = var1 * 1034606045;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Llc;Z)V")
   @ObfuscatedName("fp")
   public void method7307(PlayerComposition var1, boolean var2) {
      this.field4333 = -390889635;
      this.field4358 = new PlayerComposition(var1);
      if (!var2) {
         this.field4358.field4095 = Arrays.copyOf(this.field4358.field4092, this.field4358.field4092.length);
         this.field4358.method6711((byte)-42);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("sb")
   public Widget method7344(int var1) {
      this.field4264 = var1 * 1632281619;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lly;Lda;I)Z")
   @ObfuscatedName("ye")
   public static boolean method7273(Widget var0, classLY var1, classDA var2, int var3) {
      if (var0 == null) {
         return var0.method7276(var1, var2, var3);
      } else {
         try {
            if (11 == var0.field4375 * -1510882375) {
               if (var3 <= -425882002) {
                  throw new IllegalStateException();
               }

               if (null != var0.field4366) {
                  var0.field4366.method7438(var2, -653470088);
                  if (var0.field4366.method7441(-139701566) != 2133229739 * var0.field4330) {
                     var0.field4330 = var0.field4366.method7441(-139701566) * -1716422141;
                     if (2133229739 * var0.field4330 >= 3) {
                        if (var3 <= -425882002) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }

                     if (2 == var0.field4330 * 2133229739) {
                        if (var3 <= -425882002) {
                           throw new IllegalStateException();
                        }

                        var0.method7277(var1, 511211855);
                        return true;
                     }
                  }

                  return false;
               }

               if (var3 <= -425882002) {
                  throw new IllegalStateException();
               }
            }

            return false;
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "lw.bw(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("eh")
   public String method7264() {
      if (-1510882375 * this.field4375 == 11 && this.field4366 != null) {
         String var1 = classMA.method7468(this.field4366, -1360847022);

         for (classMD var3 : classMA.method7462(this.field4366, (byte)88)) {
            String var4 = String.format("%%%S%%", var3.method7535((byte)-33));
            if (var3.vmethod525(588701019) == 0) {
               var1.replaceAll(var4, Integer.toString(var3.vmethod523(-2098433103)));
            } else {
               var1.replaceAll(var4, var3.vmethod519(-1416515802));
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   public int getTargetPriority() {
      return this.field4310 * 2085260293;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Lly;Z)Lkh;")
   @ObfuscatedName("yj")
   public static classKH method7202(Widget var0, classLY var1, boolean var2) {
      if (-1 == var0.field4349 * -669652445) {
         var2 = false;
      }

      int var3 = var2 ? -669652445 * var0.field4349 : 208578545 * var0.field4348;
      if (var3 == -1) {
         return null;
      } else {
         long var4 = ((long)(var0.field4284 * 880555563) << 40)
            + var3
            + ((long)(-2011859635 * var0.field4283) << 36)
            + ((var0.field4352 ? 1L : 0L) << 38)
            + ((var0.field4256 ? 1L : 0L) << 39);
         classKH var6 = (classKH)var1.field4432.method6422(var4);
         if (null != var6) {
            return var6;
         } else {
            SpritePixels var7 = var0.method7319(var1, var2, null, -548149013);
            if (var7 == null) {
               return null;
            } else {
               SpritePixels var8 = var7.method13476();
               int[] var9 = new int[var8.field7009];
               int[] var10 = new int[var8.field7009];

               for (int var11 = 0; var11 < var8.field7009; var11++) {
                  int var12 = 0;
                  int var13 = var8.field7007;

                  for (int var14 = 0; var14 < var8.field7007; var14++) {
                     if (var8.field7005[var11 * var8.field7007 + var14] == 0) {
                        var12 = var14;
                        break;
                     }
                  }

                  for (int var16 = var8.field7007 - 1; var16 >= var12; var16--) {
                     if (var8.field7005[var16 + var8.field7007 * var11] == 0) {
                        var13 = 1 + var16;
                        break;
                     }
                  }

                  var9[var11] = var12;
                  var10[var11] = var13 - var12;
               }

               var6 = new classKH(var8.field7007, var8.field7009, var10, var9, var3);
               var1.field4432.method6428(var6, var4);
               return var6;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;ILjava/lang/Object;)Ljava/lang/Object;")
   @ObfuscatedName("hb")
   public static Object method7222(Widget var0, int var1, Object var2) {
      if (var0 == null) {
         var0.method7293();
      }

      for (int var3 = 0; var3 < -2048004067 * var0.field4308; var3++) {
         if (var1 == var0.field4405[var3]) {
            return var0.field4336[var3];
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lly;ZLda;)Lym;")
   @ObfuscatedName("cf")
   public SpritePixels method7185(classLY var1, boolean var2, classDA var3) {
      if (null != this.field4339) {
         SpritePixels var4 = this.method7187(var1, var3, (byte)58);
         if (var4 != null) {
            return var4;
         }
      }

      int var8;
      if (var2) {
         var8 = -669652445 * this.field4349;
      } else {
         var8 = 208578545 * this.field4348;
      }

      if (var8 == -1) {
         return null;
      } else {
         long var5 = ((long)(880555563 * this.field4284) << 40)
            + ((this.field4256 ? 1L : 0L) << 39)
            + ((this.field4352 ? 1L : 0L) << 38)
            + ((long)(-2011859635 * this.field4283) << 36)
            + var8;
         SpritePixels var7 = (SpritePixels)var1.field4430.method6422(var5);
         if (var7 != null) {
            return var7;
         } else {
            var7 = classPN.method9038(var1.field4437, var8, 0, -1750895898);
            if (null == var7) {
               return null;
            } else {
               method7195(this, var7, -2107773143);
               var1.field4430.method6428(var7, var5);
               return var7;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;Ljava/lang/String;IB)V")
   @ObfuscatedName("yi")
   public static void method7243(Widget var0, String var1, int var2, byte var3) {
      if (var0 == null) {
         var0.method7246(var1, var2, var3);
      } else {
         try {
            if (var0.field4375 * -1510882375 != 11) {
               if (var3 != 32) {
                  ;
               }
            } else {
               if (null == var0.field4268) {
                  if (var3 == 32) {
                     throw new IllegalStateException();
                  }

                  var0.method7239(-1248678116);
               }

               var0.field4268.put(var1, var2);
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "lw.bp(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lly;ZLda;)Lym;")
   @ObfuscatedName("cn")
   public SpritePixels method7186(classLY var1, boolean var2, classDA var3) {
      if (null != this.field4339) {
         SpritePixels var4 = this.method7187(var1, var3, (byte)-102);
         if (var4 != null) {
            return var4;
         }
      }

      int var8;
      if (var2) {
         var8 = -669652445 * this.field4349;
      } else {
         var8 = 208578545 * this.field4348;
      }

      if (var8 == -1) {
         return null;
      } else {
         long var5 = ((long)(880555563 * this.field4284) << 40)
            + ((this.field4256 ? 1L : 0L) << 39)
            + ((this.field4352 ? 1L : 0L) << 38)
            + ((long)(-2011859635 * this.field4283) << 36)
            + var8;
         SpritePixels var7 = (SpritePixels)var1.field4430.method6422(var5);
         if (var7 != null) {
            return var7;
         } else {
            var7 = classPN.method9038(var1.field4437, var8, 0, -1732651649);
            if (null == var7) {
               return null;
            } else {
               method7195(this, var7, -1791269977);
               var1.field4430.method6428(var7, var5);
               return var7;
            }
         }
      }
   }

   public int getScrollWidth() {
      return this.field4258 * -842862191;
   }

   public void setOnDragListener(Object[] var1) {
      this.field4379 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("xw")
   public Widget method7345(int var1) {
      this.field4292 = var1 * 993003239;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/widgets/Widget;)Llw;")
   @ObfuscatedName("ys")
   public Widget method7346(net.runelite.api.widgets.Widget var1) {
      this.field4311 = (Widget)var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Lly;)Lzv;")
   @ObfuscatedName("ci")
   public Font method7197(classLY var1) {
      if (this.field4245 * -1873556420 == -1) {
         return null;
      } else {
         Font var2 = (Font)var1.field4429.method6422(-1803847435 * this.field4245);
         if (null != var2) {
            return var2;
         } else {
            AbstractArchive var4 = var1.field4437;
            AbstractArchive var5 = var1.field4442;
            int var6 = this.field4245 * 818095370;
            Font var3;
            if (!classHK.method6068(var4, var6, 0, (byte)-7)) {
               var3 = null;
            } else {
               byte[] var8 = var5.method11867(var6, 0, -2009463730);
               Font var7;
               if (null == var8) {
                  var7 = null;
               } else {
                  Font var9 = new Font(var8, classYL.field7002, classYL.field7003, classPO.field5371, classGG.field2578, classRB.field5639, classYL.field7004);
                  classVZ.method12278((byte)-25);
                  var7 = var9;
               }

               var3 = var7;
            }

            if (null != var3) {
               var1.field4429.method6428(var3, -1535916298 * this.field4245);
            }

            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("da")
   public boolean method7248(int var1, int var2, int var3, int var4) {
      if (11 == -1510882375 * this.field4375 && this.field4366 != null && this.method7249(1355775728)) {
         var1 -= var3;
         var2 -= var4;
         int var5 = (int)(this.field4366.method7470(325924250)[0] * (this.field4249 * 1028880974));
         int var6 = (int)(this.field4366.method7470(-1250896511)[1] * (this.field4259 * 293773697));
         int var7 = var5 + (int)(this.field4366.method7470(-593915569)[2] * (340233946 * this.field4249));
         int var8 = var6 + (int)(this.field4366.method7470(988786477)[3] * (this.field4259 * 293773697));
         return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lly;Lou;IZLlc;Lpl;Lpp;)Lfx;")
   @ObfuscatedName("cx")
   public Model method7201(classLY var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, classPL var6, NpcOverrides var7) {
      int var8;
      int var9;
      if (var4) {
         var8 = -557671144 * this.field4287;
         var9 = 697152629 * this.field4354;
      } else {
         var8 = this.field4333 * -620665047;
         var9 = this.field4374 * 1325600190;
      }

      if (var8 == 0) {
         return null;
      } else if (1 == var8 && -1 == var9) {
         return null;
      } else {
         if (var7 != null && var7.field5377 && 6 == var8) {
            var8 = 3;
         }

         long var10 = (var8 << 16) + var9;
         if (2 == var8 || var8 == 6) {
            if (var6 == null) {
               return null;
            }

            var10 = (var8 << 16) + -1428076529 * var6.field5302;
         }

         if (null != var7) {
            var10 |= -4980301671096129853L * var7.field5378 << 20;
         }

         Model var12 = (Model)var1.field4431.method6422(var10);
         if (null == var12) {
            ModelData var13 = null;
            int var14 = 1000833940;
            int var15 = 768;
            switch (var8) {
               case 1:
                  var13 = ModelData.method4047(var1.field4434, var9, 0);
                  break;
               case 2:
                  var13 = var6.method8943(null, (byte)36);
                  break;
               case 3:
                  var13 = null != var5 ? var5.method6704((byte)0) : null;
                  break;
               case 4:
                  classOP var16 = classOB.method8299(var9, (byte)-53);
                  var13 = classOP.method8655(var16, 10, 849174015);
                  var14 += 1845819663 * var16.field5060;
                  var15 += var16.field5030 * -1636300529;
               case 5:
               default:
                  break;
               case 6:
                  var13 = var6.method8943(var7, (byte)93);
            }

            if (null == var13) {
               return null;
            }

            var12 = var13.method4045(var14, var15, -50, 2097628435, -50);
            var1.field4431.method6428(var12, var10);
         }

         if (null != var2) {
            var12 = var2.method8763(var12, var3, -2090339941);
         }

         return var12;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Lxy;)V")
   @ObfuscatedName("gf")
   public static void method7169(Widget var0, classXY var1) {
      if (var0 == null) {
         var0.getCanvasLocation();
      }

      var0.field4275 = false;
      var0.field4375 = classXY.method13039(var1, -346779531) * 685068937;
      var0.field4247 = classXY.method13039(var1, -346779531) * -811438059;
      var0.field4334 = classXY.method13047(var1, -1011630446) * -411168601;
      var0.field4248 = var1.method13050((byte)16) * -1076753689;
      var0.field4285 = var1.method13050((byte)16) * 1989424741;
      var0.field4255 = classXY.method13047(var1, -545755246) * 1034606045;
      var0.field4335 = classXY.method13047(var1, 1061592634) * -259501473;
      var0.field4347 = classXY.method13039(var1, -346779531) * -2056841747;
      var0.field4342 = classXY.method13047(var1, -1379916457) * -676768211;
      if (65535 == var0.field4342 * -1502647899) {
         var0.field4342 = 676768211;
      } else {
         var0.field4342 = -676768211 * ((-1163656551 * var0.field4329 & -65536) + -1502647899 * var0.field4342);
      }

      var0.field4316 = classXY.method13047(var1, 1153615263) * -1709618187;
      if (-2003253155 * var0.field4316 == 65535) {
         var0.field4316 = 1709618187;
      }

      int var2 = classXY.method13039(var1, -346779531);
      if (var2 > 0) {
         var0.field4400 = new int[var2];
         var0.field4401 = new int[var2];

         for (int var3 = 0; var3 < var2; var3++) {
            var0.field4400[var3] = classXY.method13039(var1, -346779531);
            var0.field4401[var3] = classXY.method13047(var1, -1701590333);
         }
      }

      int var7 = classXY.method13039(var1, -346779531);
      if (var7 > 0) {
         var0.field4399 = new int[var7][];

         for (int var4 = 0; var4 < var7; var4++) {
            int var5 = classXY.method13047(var1, 1393564595);
            var0.field4399[var4] = new int[var5];

            for (int var6 = 0; var6 < var5; var6++) {
               var0.field4399[var4][var6] = classXY.method13047(var1, 697094154);
               if (var0.field4399[var4][var6] == 65535) {
                  var0.field4399[var4][var6] = -1;
               }
            }
         }
      }

      if (0 == -1510882375 * var0.field4375) {
         var0.field4269 = classXY.method13047(var1, -623648271) * -251301447;
         var0.field4289 = classXY.method13039(var1, -346779531) == 1;
      }

      if (-1510882375 * var0.field4375 == 1) {
         classXY.method13047(var1, 1932385003);
         classXY.method13039(var1, -346779531);
      }

      if (3 == -1510882375 * var0.field4375) {
         var0.field4271 = classXY.method13039(var1, -346779531) == 1;
      }

      if (4 == -1510882375 * var0.field4375 || 1 == var0.field4375 * -1510882375) {
         var0.field4304 = classXY.method13039(var1, -346779531) * 571804797;
         var0.field4305 = classXY.method13039(var1, -346779531) * -2106140265;
         var0.field4303 = classXY.method13039(var1, -346779531) * -763080175;
         var0.field4245 = classXY.method13047(var1, -798261243) * 590574429;
         if (65535 == var0.field4245 * -1803847435) {
            var0.field4245 = -590574429;
         }

         var0.field4306 = classXY.method13039(var1, -346779531) == 1;
      }

      if (var0.field4375 * -1510882375 == 4) {
         var0.field4301 = var1.method13071(-873623348);
         var0.field4302 = var1.method13071(1814550955);
      }

      if (1 == -1510882375 * var0.field4375 || 3 == var0.field4375 * -1510882375 || var0.field4375 * -1510882375 == 4) {
         var0.field4270 = var1.method13056((byte)1) * 1590850751;
      }

      if (-1510882375 * var0.field4375 == 3 || 4 == var0.field4375 * -1510882375) {
         var0.field4295 = var1.method13056((byte)1) * -1914223631;
         var0.field4272 = var1.method13056((byte)1) * -1882190803;
         var0.field4273 = var1.method13056((byte)1) * -1240050015;
      }

      if (5 == var0.field4375 * -1510882375) {
         var0.field4348 = var1.method13056((byte)1) * 857041169;
         var0.field4349 = var1.method13056((byte)1) * 1515656587;
      }

      if (-1510882375 * var0.field4375 == 6) {
         var0.field4333 = 656328391;
         var0.field4287 = -1108433005;
         var0.field4374 = var1.method13117(classXM.field6888.field6890, 1941535278) * 434741949;
         var0.field4354 = var1.method13117(classXM.field6888.field6890, 2143341074) * 607878109;
         var0.field4288 = classXY.method13047(var1, 800533050) * 742198477;
         if (65535 == 2114568197 * var0.field4288) {
            var0.field4288 = -742198477;
         }

         var0.field4293 = classXY.method13047(var1, -597253696) * 668997325;
         if (821151237 * var0.field4293 == 65535) {
            var0.field4293 = -668997325;
         }

         var0.field4338 = classXY.method13047(var1, 1048196937) * 1556726191;
         var0.field4356 = classXY.method13047(var1, -1415541469) * 1703663435;
         var0.field4292 = classXY.method13047(var1, -1907413821) * 993003239;
      }

      if (8 == -1510882375 * var0.field4375) {
         var0.field4301 = var1.method13071(1748993238);
      }

      if (var0.field4247 * -851058883 == 2) {
         var0.field4345 = var1.method13071(1731049422);
         var0.field4317 = var1.method13071(2001274770);
         int var8 = classXY.method13047(var1, 176156968) & 63;
         var0.field4320 = (var0.field4320 * 1595830249 | var8 << 11) * 997939289;
      }

      if (var0.field4247 * -851058883 == 1 || 4 == var0.field4247 * -851058883 || 5 == -851058883 * var0.field4247 || 6 == var0.field4247 * -851058883) {
         var0.field4318 = var1.method13071(247557025);
         if (var0.field4318.isEmpty()) {
            if (1 == var0.field4247 * -851058883) {
               var0.field4318 = classKK.field3795;
            }

            if (4 == -851058883 * var0.field4247) {
               var0.field4318 = classKK.field3612;
            }

            if (-851058883 * var0.field4247 == 5) {
               var0.field4318 = classKK.field3612;
            }

            if (-851058883 * var0.field4247 == 6) {
               var0.field4318 = classKK.field3777;
            }
         }
      }

      if (-851058883 * var0.field4247 == 1 || 4 == -851058883 * var0.field4247 || -851058883 * var0.field4247 == 5) {
         var0.field4320 = 997939289 * (1595830249 * var0.field4320 | 4194304);
      }

      if (-851058883 * var0.field4247 == 6) {
         var0.field4320 = (var0.field4320 * 1595830249 | 1) * 997939289;
      }
   }

   public int getModelZoom() {
      return this.field4338 * 245118287;
   }

   @ObfuscatedSignature(descriptor = "(Lly;Z)Lkh;")
   @ObfuscatedName("cm")
   public classKH method7203(classLY var1, boolean var2) {
      if (-1 == this.field4349 * 1775105243) {
         var2 = false;
      }

      int var3 = var2 ? -579466528 * this.field4349 : 208578545 * this.field4348;
      if (var3 == -1) {
         return null;
      } else {
         long var4 = ((long)(this.field4284 * 880555563) << 40)
            + var3
            + ((long)(2137755444 * this.field4283) << 36)
            + ((this.field4352 ? 1L : 0L) << -1992025586)
            + ((this.field4256 ? 1L : 0L) << 39);
         classKH var6 = (classKH)var1.field4432.method6422(var4);
         if (null != var6) {
            return var6;
         } else {
            SpritePixels var7 = this.method7319(var1, var2, null, 1393465226);
            if (var7 == null) {
               return null;
            } else {
               SpritePixels var8 = var7.method13476();
               int[] var9 = new int[var8.field7009];
               int[] var10 = new int[var8.field7009];

               for (int var11 = 0; var11 < var8.field7009; var11++) {
                  int var12 = 0;
                  int var13 = var8.field7007;

                  for (int var14 = 0; var14 < var8.field7007; var14++) {
                     if (var8.field7005[var11 * var8.field7007 + var14] == 0) {
                        var12 = var14;
                        break;
                     }
                  }

                  for (int var16 = var8.field7007 - 1; var16 >= var12; var16--) {
                     if (var8.field7005[var16 + var8.field7007 * var11] == 0) {
                        var13 = 1 + var16;
                        break;
                     }
                  }

                  var9[var11] = var12;
                  var10[var11] = var13 - var12;
               }

               var6 = new classKH(var8.field7007, var8.field7009, var10, var9, var3);
               var1.field4432.method6428(var6, var4);
               return var6;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)V")
   @ObfuscatedName("dd")
   public void method7208(int var1, String var2) {
      if (this.actions == null || this.actions.length <= var1) {
         String[] var3 = new String[1 + var1];
         if (this.actions != null) {
            for (int var4 = 0; var4 < this.actions.length; var4++) {
               var3[var4] = this.actions[var4];
            }
         }

         this.actions = var3;
      }

      this.actions[var1] = var2;
   }

   public int getRotationZ() {
      return this.field4292 * -1008620329;
   }

   @ObfuscatedSignature(descriptor = "(Lly;)Lzv;")
   @ObfuscatedName("cj")
   public Font method7198(classLY var1) {
      if (this.field4245 * -1803847435 == -1) {
         return null;
      } else {
         Font var2 = (Font)var1.field4429.method6422(-1803847435 * this.field4245);
         if (null != var2) {
            return var2;
         } else {
            AbstractArchive var4 = var1.field4437;
            AbstractArchive var5 = var1.field4442;
            int var6 = this.field4245 * -1803847435;
            Font var3;
            if (!classHK.method6068(var4, var6, 0, (byte)-100)) {
               var3 = null;
            } else {
               byte[] var8 = var5.method11867(var6, 0, -1425096123);
               Font var7;
               if (null == var8) {
                  var7 = null;
               } else {
                  Font var9 = new Font(var8, classYL.field7002, classYL.field7003, classPO.field5371, classGG.field2578, classRB.field5639, classYL.field7004);
                  classVZ.method12278((byte)70);
                  var7 = var9;
               }

               var3 = var7;
            }

            if (null != var3) {
               var1.field4429.method6428(var3, -1803847435 * this.field4245);
            }

            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("di")
   public boolean method7214() {
      return !this.field4275
         || 0 == this.field4375 * -1844190441
         || 11 == this.field4375 * -1510882375
         || this.field4315
         || -90794217 * this.field4334 == 1338
         || -1510882375 * this.field4375 == 12;
   }

   public void setTargetVerb(String var1) {
      this.field4345 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dt")
   public boolean method7217() {
      return 11 == this.field4375 * -1510882375 || this.field4375 * -1510882375 == 12;
   }

   public boolean hasListener() {
      return this.field4315;
   }

   @ObfuscatedSignature(descriptor = "(Lly;)Laaa;")
   @ObfuscatedName("lm")
   public AbstractFont method7347(classLY var1) {
      return this.method7199(var1, (byte)20);
   }

   public void setDragDeadTime(int var1) {
      this.field4313 = var1 * -2074329479;
   }

   @ObfuscatedSignature(descriptor = "(Lly;I)V")
   @ObfuscatedName("bb")
   void method7277(classLY var1, int var2) {
      try {
         this.field4403 = true;
         ArrayList var3 = this.field4366.method7455((short)-7103);
         ArrayList var4 = classMA.method7459(this.field4366, 1107323496);
         int var5 = var3.size() + var4.size();
         this.field4340 = new Widget[var5];
         int var6 = 0;

         for (classMN var8 : var3) {
            Widget var9 = classMN.method7623(5, this, var6, 0, 0, 0, 0, var8.field4541, (byte)-7);
            var9.field4339 = classEY.method4117(var8.field4544, (byte)6);
            classLN var10 = new classLN(var8.field4544);
            var1.field4438.method9982(var9.field4339, var10, (byte)1);
            this.field4340[var6++] = var9;
         }

         Iterator var12 = var4.iterator();

         while (var12.hasNext()) {
            if (var2 == -1556285699) {
               throw new IllegalStateException();
            }

            classML var13 = (classML)var12.next();
            Widget var14 = classMN.method7623(4, this, var6, 0, 0, 0, 0, var13.field4525, (byte)-25);
            var14.field4301 = var13.field4532;
            var14.field4245 = (Integer)this.field4367.get(463835541 * var13.field4524) * 590574429;
            var14.field4304 = 329236247 * var13.field4523;
            var14.field4305 = var13.field4526 * 616376749;
            this.field4340[var6++] = var14;
         }
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "lw.bb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("df")
   public void method7242(int var1, int var2) {
      if (this.field4375 * -1510882375 == 11) {
         if (this.field4367 == null) {
            this.method7239(-1816394492);
         }

         this.field4367.put(var1, var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("de")
   public int method7224(int var1, int var2) {
      for (int var3 = 0; var3 < -2048004067 * this.field4308; var3++) {
         if (var1 == this.field4405[var3]) {
            return (Integer)this.field4336[var3];
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(IJ)J")
   @ObfuscatedName("dn")
   public long method7229(int var1, long var2) {
      for (int var4 = 0; var4 < this.field4308 * -2048004067; var4++) {
         if (var1 == this.field4405[var4]) {
            return (Long)this.field4336[var4];
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("ek")
   public Widget method7348(int var1) {
      this.field4331 = var1 * -1148676629;
      return this;
   }

   public int getOriginalX() {
      return this.field4248 * 975005911;
   }

   @ObfuscatedSignature(descriptor = "(Lly;ZI)Lkh;")
   @ObfuscatedName("ap")
   public classKH method7204(classLY var1, boolean var2, int var3) {
      try {
         if (-1 == this.field4349 * -669652445) {
            if (var3 == 1669356044) {
               throw new IllegalStateException();
            }

            var2 = false;
         }

         int var10000;
         if (var2) {
            if (var3 == 1669356044) {
               throw new IllegalStateException();
            }

            var10000 = -669652445 * this.field4349;
         } else {
            var10000 = 208578545 * this.field4348;
         }

         int var4 = var10000;
         if (var4 == -1) {
            return null;
         } else {
            long var19 = (long)(this.field4284 * 880555563) << 40;
            long var10001 = var4 + ((long)(-2011859635 * this.field4283) << 36);
            long var10002;
            if (this.field4352) {
               if (var3 == 1669356044) {
                  throw new IllegalStateException();
               }

               var10002 = 1L;
            } else {
               var10002 = 0L;
            }

            var10001 += var10002 << 38;
            if (this.field4256) {
               if (var3 == 1669356044) {
                  throw new IllegalStateException();
               }

               var10002 = 1L;
            } else {
               var10002 = 0L;
            }

            long var5 = var19 + var10001 + (var10002 << 39);
            classKH var7 = (classKH)var1.field4432.method6422(var5);
            if (null != var7) {
               if (var3 == 1669356044) {
                  throw new IllegalStateException();
               } else {
                  return var7;
               }
            } else {
               SpritePixels var8 = this.method7319(var1, var2, null, 1817675597);
               if (var8 == null) {
                  return null;
               } else {
                  SpritePixels var9 = var8.method13476();
                  int[] var10 = new int[var9.field7009];
                  int[] var11 = new int[var9.field7009];

                  for (int var12 = 0; var12 < var9.field7009; var12++) {
                     if (var3 == 1669356044) {
                        throw new IllegalStateException();
                     }

                     int var13 = 0;
                     int var14 = var9.field7007;

                     for (int var15 = 0; var15 < var9.field7007; var15++) {
                        if (var3 == 1669356044) {
                           throw new IllegalStateException();
                        }

                        if (var9.field7005[var12 * var9.field7007 + var15] == 0) {
                           if (var3 == 1669356044) {
                              throw new IllegalStateException();
                           }

                           var13 = var15;
                           break;
                        }
                     }

                     for (int var18 = var9.field7007 - 1; var18 >= var13; var18--) {
                        if (var3 == 1669356044) {
                           throw new IllegalStateException();
                        }

                        if (var9.field7005[var18 + var9.field7007 * var12] == 0) {
                           if (var3 == 1669356044) {
                              throw new IllegalStateException();
                           }

                           var14 = 1 + var18;
                           break;
                        }
                     }

                     var10[var12] = var13;
                     var11[var12] = var14 - var13;
                  }

                  var7 = new classKH(var9.field7007, var9.field7009, var11, var10, var4);
                  var1.field4432.method6428(var7, var5);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var16) {
         throw classEG.method3884(var16, "lw.ap(" + ')');
      }
   }

   public void setForcedPosition(int var1, int var2) {
      this.field4243 = (short)var1;
      this.field4244 = (short)var2;
      this.setRelativeX(var1);
      this.setRelativeY(var2);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lda;I)V")
   @ObfuscatedName("bn")
   public void method7236(String var1, classDA var2, int var3) {
      try {
         if (11 == this.field4375 * -1510882375 && var1 != null) {
            this.field4366 = new classMA();
            classMA.method7495(this.field4366, var1, var2, 2081829054);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lw.bn(" + ')');
      }
   }

   public net.runelite.api.widgets.Widget getChild(int var1) {
      Widget[] var2 = this.method7353();
      return var2 != null && var1 >= 0 && var1 < var2.length ? var2[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lda;)V")
   @ObfuscatedName("dg")
   public void method7237(String var1, classDA var2) {
      if (11 == this.field4375 * -8267802 && var1 != null) {
         this.field4366 = new classMA();
         classMA.method7495(this.field4366, var1, var2, 1719852866);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dq")
   void method7240() {
      this.field4367 = new HashMap();
      this.field4268 = new HashMap();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("ds")
   public void method7244(String var1, int var2) {
      if (this.field4375 * -1510882375 == 11) {
         if (null == this.field4268) {
            this.method7239(908132681);
         }

         this.field4268.put(var1, var2);
      }
   }

   public void clearActions() {
      this.actions = null;
   }

   @ObfuscatedSignature(descriptor = "()Ltt;")
   @ObfuscatedName("ep")
   public classTT method7288() {
      return this.field4369 != null ? this.field4369.field4420 : null;
   }

   public int getScrollHeight() {
      return this.field4269 * -714521463;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("xn")
   public Widget method7349(int var1) {
      this.field4245 = var1 * 590574429;
      return this;
   }

   public void setRelativeY(int var1) {
      this.field4257 = var1 * -217131595;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)[Ljava/lang/Object;")
   @ObfuscatedName("ax")
   Object[] method7178(classXY var1, int var2) {
      try {
         int var3 = classXY.method13039(var1, -346779531);
         if (0 == var3) {
            if (var2 <= 227024831) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            Object[] var4 = new Object[var3];

            for (int var5 = 0; var5 < var3; var5++) {
               if (var2 <= 227024831) {
                  throw new IllegalStateException();
               }

               int var6 = classXY.method13039(var1, -346779531);
               if (var6 == 0) {
                  if (var2 <= 227024831) {
                     throw new IllegalStateException();
                  }

                  var4[var5] = new Integer(var1.method13056((byte)1));
               } else if (1 == var6) {
                  if (var2 <= 227024831) {
                     throw new IllegalStateException();
                  }

                  var4[var5] = var1.method13071(-871315181);
               }
            }

            this.field4315 = true;
            return var4;
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "lw.ax(" + ')');
      }
   }

   public void setOnTimerListener(Object[] var1) {
      this.field4343 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;IILjava/lang/String;)V")
   @ObfuscatedName("xa")
   public static void method7211(Widget var0, int var1, int var2, String var3) {
      if (var0 == null) {
         var0.setName(var3);
      }

      if (var0.field4353 == null || var0.field4353.length <= var1) {
         String[][] var4 = new String[var1 + 1][];
         if (null != var0.field4353) {
            System.arraycopy(var0.field4353, 0, var4, 0, var0.field4353.length);
         }

         var0.field4353 = var4;
      }

      if (null == var0.field4353[var1] || var0.field4353[var1].length <= var2) {
         String[] var5 = new String[var2 + 1];
         if (var0.field4353[var1] != null) {
            System.arraycopy(var0.field4353[var1], 0, var5, 0, var0.field4353[var1].length);
         }

         var0.field4353[var1] = var5;
      }

      var0.field4353[var1][var2] = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Lxy;)[Ljava/lang/Object;")
   @ObfuscatedName("lz")
   public static Object[] method7179(Widget var0, classXY var1) {
      if (var0 == null) {
         var0.getBounds();
      }

      int var2 = classXY.method13039(var1, -346779531);
      if (0 == var2) {
         return null;
      } else {
         Object[] var3 = new Object[var2];

         for (int var4 = 0; var4 < var2; var4++) {
            int var5 = classXY.method13039(var1, -346779531);
            if (var5 == 0) {
               var3[var4] = new Integer(var1.method13056((byte)1));
            } else if (1 == var5) {
               var3[var4] = var1.method13071(-98013612);
            }
         }

         var0.field4315 = true;
         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ey")
   public String method7251(String var1) {
      return 11 == this.field4375 * -1510882375 && this.field4366 != null && this.method7249(1355775728) ? this.field4366.method7452(var1, (byte)27) : null;
   }

   public void setChildren(net.runelite.api.widgets.Widget[] var1) {
      if (this.getType() != 0) {
         throw new UnsupportedOperationException("children can only be set on type layer widgets");
      } else if (this.field4260 * 63131743 != -1) {
         throw new UnsupportedOperationException("only static widgets may have children");
      } else {
         this.field4340 = (Widget[])var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ek")
   public String method7252(String var1) {
      return 11 == this.field4375 * -1510882375 && this.field4366 != null && this.method7249(1355775728) ? this.field4366.method7452(var1, (byte)101) : null;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("nk")
   public Widget method7350(int var1) {
      this.field4250 = var1 * 454876301;
      return this;
   }

   public boolean getNoClickThrough() {
      return this.field4403;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("es")
   public int method7258() {
      return null != this.field4268 && !this.field4268.isEmpty() ? 1 : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ej")
   public int method7259() {
      return null != this.field4268 && !this.field4268.isEmpty() ? 1 : 0;
   }

   public boolean getNoScrollThrough() {
      return this.field4328;
   }

   public int getRelativeY() {
      return this.field4257 * 1570844829;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("jm")
   public Widget method7351(int var1) {
      this.field4248 = var1 * -1076753689;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Z)Llw;")
   @ObfuscatedName("hr")
   public Widget method7352(boolean var1) {
      this.field4289 = var1;
      return this;
   }

   public boolean isFlippedHorizontally() {
      return this.field4256;
   }

   public void setOnTargetLeaveListener(Object[] var1) {
      this.field4350 = var1;
   }

   public void setOnMouseLeaveListener(Object[] var1) {
      this.field4361 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Ltt;")
   @ObfuscatedName("ec")
   public classTT method7289() {
      return this.field4369 != null ? this.field4369.field4420 : null;
   }

   @ObfuscatedSignature(descriptor = "()[Llw;")
   @ObfuscatedName("nz")
   public Widget[] method7353() {
      return this.field4340;
   }

   public int getOriginalHeight() {
      return this.field4335 * 549489055;
   }

   public int getXTextAlignment() {
      return this.field4304 * 1409141973;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;)Z")
   @ObfuscatedName("sp")
   public static boolean method7218(Widget var0) {
      if (var0 == null) {
         var0.method7268();
      }

      return 11 == var0.field4375 * -1354330688 || var0.field4375 * 13322969 == 12;
   }

   public String getTargetVerb() {
      return this.field4345;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("el")
   public int method7262() {
      if (11 == this.field4375 * -1510882375 && null != this.field4366 && this.field4268 != null && !this.field4268.isEmpty()) {
         String var1 = classMA.method7468(this.field4366, -1393227033);
         return var1 != null && this.field4268.containsKey(classMA.method7468(this.field4366, -250534846)) ? (Integer)this.field4268.get(var1) : -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Laaa;")
   @ObfuscatedName("xf")
   public AbstractFont method7322() {
      return this.method7347(classWK.field6691);
   }

   public void setOnKeyListener(Object[] var1) {
      this.field4388 = var1;
   }

   public Widget(Widget var1) {
      this.field4242 = -1;
      this.field4243 = -1;
      this.field4244 = -1;
      this.field4275 = false;
      this.field4329 = -519254441;
      this.field4260 = 1612510305;
      this.field4247 = 0;
      this.field4334 = 0;
      this.field4264 = 0;
      this.field4250 = 0;
      this.field4251 = 0;
      this.field4252 = 0;
      this.field4248 = 0;
      this.field4285 = 0;
      this.field4255 = 0;
      this.field4335 = 0;
      this.field4281 = 0;
      this.method7310(-1);
      this.field4257 = 0;
      this.method7315(-1);
      this.field4249 = 0;
      this.field4259 = 0;
      this.field4274 = 62747509;
      this.field4261 = -1988594555;
      this.field4342 = 676768211;
      this.field4263 = -1000754647;
      this.field4289 = false;
      this.field4265 = -1939173753;
      this.field4266 = 0;
      this.field4341 = 0;
      this.field4331 = 0;
      this.field4258 = 0;
      this.field4269 = 0;
      this.field4270 = 0;
      this.field4295 = 0;
      this.field4272 = 0;
      this.field4273 = 0;
      this.field4271 = false;
      this.field4307 = classYE.field6972;
      this.field4347 = 0;
      this.field4276 = 0;
      this.field4277 = 327091521;
      this.field4278 = false;
      this.field4348 = -857041169;
      this.field4349 = -1515656587;
      this.field4351 = 0;
      this.field4282 = false;
      this.field4283 = 0;
      this.field4284 = 0;
      this.field4333 = 656328391;
      this.field4374 = -434741949;
      this.field4287 = -1108433005;
      this.field4354 = -607878109;
      this.field4288 = -742198477;
      this.field4293 = -668997325;
      this.field4290 = 0;
      this.field4291 = 0;
      this.field4356 = 0;
      this.field4292 = 0;
      this.field4294 = 0;
      this.field4338 = 1053796444;
      this.field4296 = 0;
      this.field4262 = 0;
      this.field4297 = false;
      this.field4298 = false;
      this.field4299 = -699666682;
      this.field4245 = -590574429;
      this.field4301 = "";
      this.field4302 = "";
      this.field4303 = 0;
      this.field4304 = 0;
      this.field4305 = 0;
      this.field4306 = false;
      this.field4320 = 0;
      this.field4360 = false;
      this.field4309 = "";
      this.field4310 = 695305012;
      this.field4311 = null;
      this.field4368 = 0;
      this.field4313 = 0;
      this.field4314 = false;
      this.field4345 = "";
      this.field4315 = false;
      this.field4316 = 1709618187;
      this.field4317 = "";
      this.field4318 = classKK.field3795;
      this.field4319 = -1321867761;
      this.field4344 = 0;
      this.field4321 = 0;
      this.field4327 = 0;
      this.field4322 = false;
      this.field4323 = false;
      this.field4324 = -1478436671;
      this.field4325 = 0;
      this.field4300 = 0;
      this.field4326 = 0;
      this.field4403 = false;
      this.field4328 = false;
      this.field4373 = false;
      this.field4330 = 1716422141;
      this.field4275 = var1.field4275;
      this.field4329 = 1 * var1.field4329;
      this.field4260 = 1 * var1.field4260;
      this.field4332 = var1.field4332;
      this.field4375 = 1 * var1.field4375;
      this.field4247 = var1.field4247 * 1;
      this.field4334 = 1 * var1.field4334;
      this.field4264 = var1.field4264 * 1;
      this.field4250 = var1.field4250 * 1;
      this.field4251 = 1 * var1.field4251;
      this.field4252 = var1.field4252 * 1;
      this.field4248 = var1.field4248 * 1;
      this.field4285 = 1 * var1.field4285;
      this.field4255 = 1 * var1.field4255;
      this.field4335 = var1.field4335 * 1;
      this.field4281 = var1.field4281 * 1;
      this.method7310(-1);
      this.field4257 = var1.field4257 * 1;
      this.method7315(-1);
      this.field4249 = var1.field4249 * 1;
      this.field4259 = 1 * var1.field4259;
      this.field4274 = 1 * var1.field4274;
      this.field4261 = 1 * var1.field4261;
      this.field4342 = var1.field4342 * 1;
      this.field4263 = 1 * var1.field4263;
      this.field4265 = var1.field4265 * 1;
      this.field4266 = var1.field4266 * 1;
      this.field4289 = var1.field4289;
      this.field4341 = 1 * var1.field4341;
      this.field4331 = var1.field4331 * 1;
      this.field4258 = 1 * var1.field4258;
      this.field4269 = 1 * var1.field4269;
      this.field4270 = 1 * var1.field4270;
      this.field4295 = 1 * var1.field4295;
      this.field4272 = var1.field4272 * 1;
      this.field4273 = var1.field4273 * 1;
      this.field4271 = var1.field4271;
      this.field4307 = var1.field4307;
      this.field4347 = 1 * var1.field4347;
      this.field4276 = var1.field4276 * 1;
      this.field4277 = 1 * var1.field4277;
      this.field4278 = var1.field4278;
      this.field4348 = var1.field4348 * 1;
      this.field4349 = 1 * var1.field4349;
      this.field4339 = var1.field4339;
      this.field4351 = 1 * var1.field4351;
      this.field4282 = var1.field4282;
      this.field4283 = 1 * var1.field4283;
      this.field4284 = 1 * var1.field4284;
      this.field4352 = var1.field4352;
      this.field4256 = var1.field4256;
      this.field4333 = 1 * var1.field4333;
      this.field4374 = 1 * var1.field4374;
      this.field4287 = 1 * var1.field4287;
      this.field4354 = var1.field4354 * 1;
      this.field4288 = var1.field4288 * 1;
      this.field4293 = 1 * var1.field4293;
      this.field4290 = 1 * var1.field4290;
      this.field4291 = var1.field4291 * 1;
      this.field4356 = 1 * var1.field4356;
      this.field4292 = var1.field4292 * 1;
      this.field4294 = var1.field4294 * 1;
      this.field4338 = var1.field4338 * 1;
      this.field4296 = var1.field4296 * 1;
      this.field4262 = var1.field4262 * 1;
      if (null != var1.field4358) {
         this.field4358 = new PlayerComposition(var1.field4358);
      }

      this.field4297 = var1.field4297;
      this.field4298 = var1.field4298;
      this.field4299 = var1.field4299 * 1;
      this.field4245 = 1 * var1.field4245;
      this.field4301 = var1.field4301;
      this.field4302 = var1.field4302;
      this.field4303 = var1.field4303 * 1;
      this.field4304 = 1 * var1.field4304;
      this.field4305 = 1 * var1.field4305;
      this.field4306 = var1.field4306;
      this.field4362 = method7166(this, var1.field4362, (byte)-100);
      this.field4253 = method7166(this, var1.field4253, (byte)50);
      this.field4279 = method7166(this, var1.field4279, (byte)34);
      this.field4364 = (String[])this.method7161(var1.field4364, -1524024607);
      if (var1.field4366 != null) {
         this.field4366 = new classMA(var1.field4366);
      }

      this.field4330 = var1.field4330 * 1;
      this.field4367 = var1.field4367;
      if (null != var1.field4268) {
         this.field4268 = new HashMap();
         this.field4268.putAll(var1.field4268);
      }

      this.field4369 = null;
      this.field4320 = 1 * var1.field4320;
      this.field4360 = var1.field4360;
      if (var1.field4312 != null) {
         this.field4312 = new byte[var1.field4312.length][];

         for (int var2 = 0; var2 < var1.field4312.length; var2++) {
            this.field4312[var2] = new byte[var1.field4312[var2].length];
            System.arraycopy(var1.field4312[var2], 0, this.field4312[var2], 0, var1.field4312[var2].length);
         }
      }

      if (var1.field4346 != null) {
         this.field4346 = new byte[var1.field4346.length][];

         for (int var4 = 0; var4 < var1.field4346.length; var4++) {
            this.field4346[var4] = new byte[var1.field4346[var4].length];
            System.arraycopy(var1.field4346[var4], 0, this.field4346[var4], 0, var1.field4346[var4].length);
         }
      }

      this.field4370 = method7166(this, var1.field4370, (byte)16);
      this.field4371 = method7166(this, var1.field4371, (byte)90);
      this.field4309 = var1.field4309;
      this.actions = (String[])this.method7161(var1.actions, -1524024607);
      if (null != var1.field4353) {
         this.field4353 = new String[var1.field4353.length][];

         for (int var5 = 0; var5 < var1.field4353.length; var5++) {
            this.field4353[var5] = new String[var1.field4353[var5].length];
            System.arraycopy(var1.field4353[var5], 0, this.field4353[var5], 0, var1.field4353[var5].length);
         }
      }

      this.field4310 = var1.field4310 * 1;
      this.field4311 = var1.field4311;
      this.field4368 = var1.field4368 * 1;
      this.field4313 = var1.field4313 * 1;
      this.field4314 = var1.field4314;
      this.field4345 = var1.field4345;
      this.field4315 = var1.field4315;
      this.field4376 = var1.field4376;
      this.field4359 = var1.field4359;
      this.field4377 = var1.field4377;
      this.field4357 = var1.field4357;
      this.field4378 = var1.field4378;
      this.field4402 = var1.field4402;
      this.field4286 = var1.field4286;
      this.field4361 = var1.field4361;
      this.field4379 = var1.field4379;
      this.field4380 = var1.field4380;
      this.field4381 = var1.field4381;
      this.field4350 = var1.field4350;
      this.field4382 = var1.field4382;
      this.field4280 = var1.field4280;
      this.field4355 = var1.field4355;
      this.field4267 = var1.field4267;
      this.field4384 = var1.field4384;
      this.field4385 = var1.field4385;
      this.field4343 = var1.field4343;
      this.field4386 = var1.field4386;
      this.field4254 = var1.field4254;
      this.field4387 = var1.field4387;
      this.field4365 = var1.field4365;
      this.field4388 = var1.field4388;
      this.field4389 = var1.field4389;
      this.field4363 = var1.field4363;
      this.field4383 = var1.field4383;
      this.field4391 = var1.field4391;
      this.field4392 = var1.field4392;
      this.field4393 = var1.field4393;
      this.field4394 = var1.field4394;
      this.field4406 = var1.field4406;
      this.field4395 = var1.field4395;
      this.field4246 = var1.field4246;
      this.field4396 = var1.field4396;
      this.field4397 = var1.field4397;
      this.field4398 = var1.field4398;
      this.field4399 = var1.field4399;
      this.field4400 = method7166(this, var1.field4400, (byte)-93);
      this.field4401 = method7166(this, var1.field4401, (byte)3);
      this.field4316 = var1.field4316 * 1;
      this.field4317 = var1.field4317;
      this.field4318 = var1.field4318;
      this.field4390 = method7166(this, var1.field4390, (byte)53);
      this.field4372 = method7166(this, var1.field4372, (byte)-23);
      this.field4319 = 1 * var1.field4319;
      this.field4344 = var1.field4344 * 1;
      this.field4321 = 1 * var1.field4321;
      this.field4327 = 1 * var1.field4327;
      if (var1.field4340 != null) {
         this.field4340 = new Widget[var1.field4340.length];

         for (int var6 = 0; var6 < var1.field4340.length; var6++) {
            this.field4340[var6] = new Widget(var1.field4340[var6]);
         }
      }

      this.field4322 = var1.field4322;
      this.field4323 = var1.field4323;
      this.field4324 = var1.field4324 * 1;
      this.field4325 = 1 * var1.field4325;
      this.field4300 = var1.field4300 * 1;
      this.field4326 = 1 * var1.field4326;
      this.field4404 = method7166(this, var1.field4404, (byte)77);
      this.field4403 = var1.field4403;
      this.field4328 = var1.field4328;
      this.field4373 = var1.field4373;
      if (-2048004067 * var1.field4308 > 0) {
         this.field4405 = method7166(this, var1.field4405, (byte)24);
         this.field4336 = this.method7161(var1.field4336, -1524024607);
         this.field4308 = 1 * var1.field4308;
      }
   }

   public int getHeightMode() {
      return this.field4252 * 372143361;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("rs")
   public Widget method7354(int var1) {
      this.field4347 = var1 * -2056841747;
      return this;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("en")
   public int[] method7268() {
      if (11 == -1510882375 * this.field4375 && null != this.field4366) {
         int[] var1 = new int[3];
         int var2 = 0;

         for (classMD var4 : classMA.method7462(this.field4366, (byte)46)) {
            if (!var4.method7535((byte)-98).equals("user_id")) {
               if (var4.vmethod525(-1173770292) != 0) {
                  return null;
               }

               var1[var2++] = var4.vmethod523(-1377673403);
               if (var2 > 3) {
                  return null;
               }
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   public int getTextColor() {
      return this.field4270 * 1740831551;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("eq")
   public int[] method7269() {
      if (11 == -1510882375 * this.field4375 && null != this.field4366) {
         int[] var1 = new int[3];
         int var2 = 0;

         for (classMD var4 : classMA.method7462(this.field4366, (byte)20)) {
            if (!var4.method7535((byte)-40).equals("user_id")) {
               if (var4.vmethod525(-645725653) != 0) {
                  return null;
               }

               var1[var2++] = var4.vmethod523(-1250028197);
               if (var2 > 3) {
                  return null;
               }
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lly;B)Lzv;")
   @ObfuscatedName("aq")
   public Font method7199(classLY var1, byte var2) {
      try {
         if (this.field4245 * -1803847435 == -1) {
            return null;
         } else {
            Font var3 = (Font)var1.field4429.method6422(-1803847435 * this.field4245);
            if (null != var3) {
               if (var2 == 1) {
                  throw new IllegalStateException();
               } else {
                  return var3;
               }
            } else {
               AbstractArchive var5 = var1.field4437;
               AbstractArchive var6 = var1.field4442;
               int var7 = this.field4245 * -1803847435;
               Font var4;
               if (!classHK.method6068(var5, var7, 0, (byte)-84)) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  var4 = null;
               } else {
                  byte[] var9 = var6.method11867(var7, 0, -1598309711);
                  Font var8;
                  if (null == var9) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     var8 = null;
                  } else {
                     Font var10 = new Font(
                        var9, classYL.field7002, classYL.field7003, classPO.field5371, classGG.field2578, classRB.field5639, classYL.field7004
                     );
                     classVZ.method12278((byte)68);
                     var8 = var10;
                  }

                  var4 = var8;
               }

               if (null != var4) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  var1.field4429.method6428(var4, -1803847435 * this.field4245);
               }

               return var4;
            }
         }
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "lw.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("hy")
   public Widget method7355(int var1) {
      this.field4252 = var1 * -565540095;
      return this;
   }

   @ObfuscatedSignature(descriptor = "()Lma;")
   @ObfuscatedName("eo")
   public classMA method7271() {
      return this.field4366;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("zm")
   public Widget method7356(int var1) {
      this.field4338 = var1 * 1556726191;
      return this;
   }

   public int getIndex() {
      return this.field4260 * 63131743;
   }

   public net.runelite.api.widgets.Widget getDragParent() {
      return this.field4311;
   }

   public int getScrollX() {
      return this.field4341 * -34809441;
   }

   @ObfuscatedSignature(descriptor = "(Lly;Lda;)Z")
   @ObfuscatedName("et")
   public boolean method7274(classLY var1, classDA var2) {
      if (11 == this.field4375 * -1510882375 && null != this.field4366) {
         this.field4366.method7438(var2, 572195416);
         if (this.field4366.method7441(-139701566) != 2133229739 * this.field4330) {
            this.field4330 = this.field4366.method7441(-139701566) * -1716422141;
            if (-2015835098 * this.field4330 >= 3) {
               return true;
            }

            if (2 == this.field4330 * 2133229739) {
               this.method7277(var1, -1243617095);
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llc;Z)V")
   @ObfuscatedName("fq")
   public void method7308(PlayerComposition var1, boolean var2) {
      this.field4333 = 299331441;
      this.field4358 = new PlayerComposition(var1);
      if (!var2) {
         this.field4358.field4095 = Arrays.copyOf(this.field4358.field4092, this.field4358.field4092.length);
         this.field4358.method6711((byte)-127);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lly;)V")
   @ObfuscatedName("eu")
   void method7278(classLY var1) {
      this.field4403 = true;
      ArrayList var2 = this.field4366.method7455((short)-8203);
      ArrayList var3 = classMA.method7459(this.field4366, 1036447206);
      int var4 = var2.size() + var3.size();
      this.field4340 = new Widget[var4];
      int var5 = 0;

      for (classMN var7 : var2) {
         Widget var8 = classMN.method7623(5, this, var5, 0, 0, 0, 0, var7.field4541, (byte)-5);
         var8.field4339 = classEY.method4117(var7.field4544, (byte)-24);
         classLN var9 = new classLN(var7.field4544);
         var1.field4438.method9982(var8.field4339, var9, (byte)1);
         this.field4340[var5++] = var8;
      }

      for (classML var11 : var3) {
         Widget var12 = classMN.method7623(4, this, var5, 0, 0, 0, 0, var11.field4525, (byte)-92);
         var12.field4301 = var11.field4532;
         var12.field4245 = (Integer)this.field4367.get(463835541 * var11.field4524) * 590574429;
         var12.field4304 = 329236247 * var11.field4523;
         var12.field4305 = var11.field4526 * 616376749;
         this.field4340[var5++] = var12;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Lxy;)[I")
   @ObfuscatedName("oi")
   public static int[] method7182(Widget var0, classXY var1) {
      if (var0 == null) {
         return var0.method7184(var1);
      } else {
         int var2 = classXY.method13039(var1, -346779531);
         if (0 == var2) {
            return null;
         } else {
            int[] var3 = new int[var2];

            for (int var4 = 0; var4 < var2; var4++) {
               var3[var4] = var1.method13056((byte)1);
            }

            return var3;
         }
      }
   }

   public boolean isFlippedVertically() {
      return this.field4352;
   }

   @ObfuscatedSignature(descriptor = "(Lly;)V")
   @ObfuscatedName("ef")
   void method7279(classLY var1) {
      this.field4403 = true;
      ArrayList var2 = this.field4366.method7455((short)-4545);
      ArrayList var3 = classMA.method7459(this.field4366, 1884139200);
      int var4 = var2.size() + var3.size();
      this.field4340 = new Widget[var4];
      int var5 = 0;

      for (classMN var7 : var2) {
         Widget var8 = classMN.method7623(5, this, var5, 0, 0, 0, 0, var7.field4541, (byte)-66);
         var8.field4339 = classEY.method4117(var7.field4544, (byte)34);
         classLN var9 = new classLN(var7.field4544);
         var1.field4438.method9982(var8.field4339, var9, (byte)1);
         this.field4340[var5++] = var8;
      }

      for (classML var11 : var3) {
         Widget var12 = classMN.method7623(4, this, var5, 0, 0, 0, 0, var11.field4525, (byte)0);
         var12.field4301 = var11.field4532;
         var12.field4245 = (Integer)this.field4367.get(463835541 * var11.field4524) * 590574429;
         var12.field4304 = 329236247 * var11.field4523;
         var12.field4305 = var11.field4526 * 616376749;
         this.field4340[var5++] = var12;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Ljava/lang/String;I)V")
   @ObfuscatedName("eo")
   public static void method7245(Widget var0, String var1, int var2) {
      if (var0.field4375 * -1011688428 == 11) {
         if (null == var0.field4268) {
            var0.method7239(-1634155941);
         }

         var0.field4268.put(var1, var2);
      }
   }

   public net.runelite.api.widgets.Widget getParent() {
      int var1 = this.getParentId();
      return var1 == -1 ? null : classOE.field4843.method2295(var1);
   }

   public Rectangle getBounds() {
      return new Rectangle(this.field4241, this.field4242, this.getWidth(), this.getHeight());
   }

   @ObfuscatedSignature(descriptor = "(Llw;Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("xc")
   public static String method7253(Widget var0, String var1, int var2) {
      if (var0 == null) {
         return var0.method7255(var1, var2);
      } else {
         try {
            if (11 == var0.field4375 * -1510882375) {
               if (var2 <= -1798356091) {
                  throw new IllegalStateException();
               }

               if (var0.field4366 != null) {
                  if (var2 <= -1798356091) {
                     throw new IllegalStateException();
                  }

                  if (var0.method7249(1355775728)) {
                     return var0.field4366.method7452(var1, (byte)46);
                  }

                  if (var2 <= -1798356091) {
                     throw new IllegalStateException();
                  }
               }
            }

            return null;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "lw.bg(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("ay")
   public int[] method7357() {
      return this.field4390;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ez")
   public void method7282() {
      this.field4369 = new classLX();

      for (int var1 = 1; var1 <= 12; var1++) {
         this.field4369.field4420.method11132(var1, 0, 1873082935);
      }

      for (char var2 = 0; var2 < ' '; var2++) {
         this.field4369.field4420.method11136(var2, 0, (byte)9);
      }

      this.field4369.field4420.method11136((char)688577459, 0, (byte)91);
      this.field4369.field4420.method11132(82, 2, 1796657499);
      this.field4369.field4420.method11132(-6837354, 2, 1539048331);
      this.field4369.field4420.method11132(-887462927, 2, 1909242214);
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("vh")
   public Widget method7358(int var1) {
      this.field4270 = var1 * 1590850751;
      return this;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Lxy;)[I")
   @ObfuscatedName("lw")
   public static int[] method7183(Widget var0, classXY var1) {
      if (var0 == null) {
         var0.method7258();
      }

      int var2 = classXY.method13039(var1, -346779531);
      if (0 == var2) {
         return null;
      } else {
         int[] var3 = new int[var2];

         for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = var1.method13056((byte)1);
         }

         return var3;
      }
   }

   public boolean isFilled() {
      return this.field4271;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Lda;J)V")
   @ObfuscatedName("am")
   public void method7232(String var1, String var2, classDA var3, long var4) {
      try {
         if (-1510882375 * this.field4375 == 11 && var4 != -1L) {
            var1 = var1.replaceAll("%userid%", Long.toString(var4));
            this.field4366 = new classMA();
            if (!this.field4366.method7431(var1, var2, var3, 1881063693)) {
               this.field4366 = null;
            } else {
               if (this.field4367 == null || null == this.field4268) {
                  this.method7239(542097596);
               }
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "lw.am(" + ')');
      }
   }

   public void setOnScrollWheelListener(Object[] var1) {
      this.field4387 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("ub")
   public Widget method7359(int var1) {
      this.field4348 = var1 * 857041169;
      return this;
   }

   public int getLineHeight() {
      return this.field4303 * 704962289;
   }

   @ObfuscatedSignature(descriptor = "(Z)Llw;")
   @ObfuscatedName("vt")
   public Widget method7360(boolean var1) {
      this.field4271 = var1;
      return this;
   }

   public void setSubOp(int var1, int var2, String var3) {
      this.method7210(var1, var2, var3, -512976453);
   }

   public int getAnimationId() {
      return this.field4288 * 2114568197;
   }

   @ObfuscatedSignature(descriptor = "(II)Llw;")
   @ObfuscatedName("ep")
   public Widget method7317(int var1, int var2) {
      if (!classOE.field4843.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (this.getType() != 0) {
         throw new UnsupportedOperationException("children can only be created on type layer widgets");
      } else {
         Widget var3 = new Widget();
         var3.setType(var2);
         int var10001 = this.field4329 * -1163656551;
         var3.field4329 = this.field4329 * -1163656551 * 519254441;
         var3.field4342 = var10001 * -676768211;
         var3.field4263 = this.field4260 * 63131743 * 1000754647;
         var3.method7329(true);
         Widget var4 = classOE.field4843.method2295(this.field4329 * -1163656551);
         if (var4 == null) {
            throw new IllegalStateException("createChild called on unloaded component");
         } else {
            assert var4 == this || this.field4260 * 63131743 != -1;

            Widget[] var5 = var4.field4340;
            if (var1 < 0) {
               if (var5 == null) {
                  var1 = 0;
               } else {
                  var1 = 0;

                  for (int var6 = var5.length - 1; var6 >= 0; var6--) {
                     if (var5[var6] != null) {
                        var1 = var6 + 1;
                        break;
                     }
                  }
               }
            }

            if (var5 == null) {
               var5 = new Widget[var1 + 1];
               var4.field4340 = var5;
            } else if (var5.length <= var1) {
               Widget[] var7 = new Widget[var1 + 1];
               System.arraycopy(var5, 0, var7, 0, var5.length);
               var5 = var7;
               var4.field4340 = var7;
            }

            var5[var1] = var3;
            var3.field4260 = var1 * -1612510305;
            if (this.field4260 * 63131743 > -1) {
               assert this.getType() == 0;

               if (var1 > this.field4266 * 379541057) {
                  this.field4266 = var1 * -1479820863;
               }

               if (var1 < this.field4265 * -1210177335) {
                  this.field4265 = var1 * -452038279;
               }
            }

            return var3;
         }
      }
   }

   public Point getCanvasLocation() {
      return new Point(this.field4241, this.field4242);
   }

   @ObfuscatedSignature(descriptor = "()Ltt;")
   @ObfuscatedName("eb")
   public classTT method7290() {
      return this.field4369 != null ? this.field4369.field4420 : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Lly;)Z")
   @ObfuscatedName("wy")
   public static boolean method7301(Widget var0, classLY var1) {
      if (var0 == null) {
         var0.getScrollY();
      }

      classLH var2 = var0.method7283(-603792379);
      if (var2 == null) {
         return false;
      } else {
         boolean var3 = false;
         if (!var2.method6998((byte)-44) && -1 != -1803847435 * var0.field4245) {
            int var4 = var2.method7001(1396991191);
            int var5 = classLH.method7003(var2, 824062724);
            int var6 = var2.method6995(1326989786);
            int var7 = var2.method6994((byte)-7);
            Font var8 = var0.method7199(var1, (byte)-36);
            if (null != var8) {
               var3 |= classLH.method6813(var2, var8, -1732545020);
               var3 |= var0.method7297(var2, -1938765451);
               var3 |= var2.method6834(var4, var5, -56253071);
               var3 |= classLH.method6882(var2, var6, var7, 1122842785);
            }
         } else if (var2.method6998((byte)-98)) {
            var3 |= var0.method7297(var2, -1349843627);
         }

         var2.method6794(-1363350530);
         return var3;
      }
   }

   public int getBorderType() {
      return this.field4283 * -2011859635;
   }

   public int getModelId() {
      return this.field4374 * -759306091;
   }

   public boolean isIf3() {
      return this.field4275;
   }

   public void deleteAllChildren() {
      if (this.method7353() != null) {
         Arrays.fill(this.method7353(), null);
      }
   }

   public int getWidth() {
      return this.field4249 * 1115597881;
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lxy;B)V")
   @ObfuscatedName("sm")
   public static void method7170(Widget var0, classXY var1, byte var2) {
      if (var0 == null) {
         var0.method7171(var1, var2);
      }

      try {
         var0.field4275 = false;
         var0.field4375 = classXY.method13039(var1, -346779531) * 685068937;
         var0.field4247 = classXY.method13039(var1, -346779531) * -811438059;
         var0.field4334 = classXY.method13047(var1, 943248541) * -411168601;
         var0.field4248 = var1.method13050((byte)16) * -1076753689;
         var0.field4285 = var1.method13050((byte)16) * 1989424741;
         var0.field4255 = classXY.method13047(var1, -772132885) * 1034606045;
         var0.field4335 = classXY.method13047(var1, -1633239070) * -259501473;
         var0.field4347 = classXY.method13039(var1, -346779531) * -2056841747;
         var0.field4342 = classXY.method13047(var1, -1526083782) * -676768211;
         if (65535 == var0.field4342 * -1502647899) {
            var0.field4342 = 676768211;
         } else {
            var0.field4342 = -676768211 * ((-1163656551 * var0.field4329 & -65536) + -1502647899 * var0.field4342);
         }

         var0.field4316 = classXY.method13047(var1, -1245275110) * -1709618187;
         if (-2003253155 * var0.field4316 == 65535) {
            if (var2 >= 0) {
               return;
            }

            var0.field4316 = 1709618187;
         }

         int var3 = classXY.method13039(var1, -346779531);
         if (var3 > 0) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            var0.field4400 = new int[var3];
            var0.field4401 = new int[var3];

            for (int var4 = 0; var4 < var3; var4++) {
               var0.field4400[var4] = classXY.method13039(var1, -346779531);
               var0.field4401[var4] = classXY.method13047(var1, 1091068094);
            }
         }

         int var9 = classXY.method13039(var1, -346779531);
         if (var9 > 0) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            var0.field4399 = new int[var9][];

            for (int var5 = 0; var5 < var9; var5++) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               int var6 = classXY.method13047(var1, -123746907);
               var0.field4399[var5] = new int[var6];

               for (int var7 = 0; var7 < var6; var7++) {
                  if (var2 >= 0) {
                     return;
                  }

                  var0.field4399[var5][var7] = classXY.method13047(var1, -980959917);
                  if (var0.field4399[var5][var7] == 65535) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     var0.field4399[var5][var7] = -1;
                  }
               }
            }
         }

         if (0 == -1510882375 * var0.field4375) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            var0.field4269 = classXY.method13047(var1, 1175672359) * -251301447;
            var0.field4289 = classXY.method13039(var1, -346779531) == 1;
         }

         if (-1510882375 * var0.field4375 == 1) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            classXY.method13047(var1, 920361216);
            classXY.method13039(var1, -346779531);
         }

         if (3 == -1510882375 * var0.field4375) {
            var0.field4271 = classXY.method13039(var1, -346779531) == 1;
         }

         label362: {
            if (4 != -1510882375 * var0.field4375) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               if (1 != var0.field4375 * -1510882375) {
                  break label362;
               }

               if (var2 >= 0) {
                  throw new IllegalStateException();
               }
            }

            var0.field4304 = classXY.method13039(var1, -346779531) * 571804797;
            var0.field4305 = classXY.method13039(var1, -346779531) * -2106140265;
            var0.field4303 = classXY.method13039(var1, -346779531) * -763080175;
            var0.field4245 = classXY.method13047(var1, 1522529353) * 590574429;
            if (65535 == var0.field4245 * -1803847435) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               var0.field4245 = -590574429;
            }

            boolean var10001;
            if (classXY.method13039(var1, -346779531) == 1) {
               if (var2 >= 0) {
                  return;
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            var0.field4306 = var10001;
         }

         if (var0.field4375 * -1510882375 == 4) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            var0.field4301 = var1.method13071(1710850257);
            var0.field4302 = var1.method13071(1471640970);
         }

         label318: {
            if (1 != -1510882375 * var0.field4375) {
               if (var2 >= 0) {
                  return;
               }

               if (3 != var0.field4375 * -1510882375) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var0.field4375 * -1510882375 != 4) {
                     break label318;
                  }

                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }
               }
            }

            var0.field4270 = var1.method13056((byte)1) * 1590850751;
         }

         label309: {
            if (-1510882375 * var0.field4375 != 3) {
               if (var2 >= 0) {
                  return;
               }

               if (4 != var0.field4375 * -1510882375) {
                  break label309;
               }

               if (var2 >= 0) {
                  throw new IllegalStateException();
               }
            }

            var0.field4295 = var1.method13056((byte)1) * -1914223631;
            var0.field4272 = var1.method13056((byte)1) * -1882190803;
            var0.field4273 = var1.method13056((byte)1) * -1240050015;
         }

         if (5 == var0.field4375 * -1510882375) {
            var0.field4348 = var1.method13056((byte)1) * 857041169;
            var0.field4349 = var1.method13056((byte)1) * 1515656587;
         }

         if (-1510882375 * var0.field4375 == 6) {
            if (var2 >= 0) {
               return;
            }

            var0.field4333 = 656328391;
            var0.field4287 = -1108433005;
            var0.field4374 = var1.method13117(classXM.field6888.field6890, 1593564491) * 434741949;
            var0.field4354 = var1.method13117(classXM.field6888.field6890, 1741762813) * 607878109;
            var0.field4288 = classXY.method13047(var1, -495192957) * 742198477;
            if (65535 == 2114568197 * var0.field4288) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               var0.field4288 = -742198477;
            }

            var0.field4293 = classXY.method13047(var1, 1533818567) * 668997325;
            if (821151237 * var0.field4293 == 65535) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               var0.field4293 = -668997325;
            }

            var0.field4338 = classXY.method13047(var1, -1228383652) * 1556726191;
            var0.field4356 = classXY.method13047(var1, 1322170790) * 1703663435;
            var0.field4292 = classXY.method13047(var1, 1007031475) * 993003239;
         }

         if (8 == -1510882375 * var0.field4375) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            var0.field4301 = var1.method13071(-953868593);
         }

         if (var0.field4247 * -851058883 == 2) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            var0.field4345 = var1.method13071(1626437172);
            var0.field4317 = var1.method13071(-1228529393);
            int var10 = classXY.method13047(var1, -909726546) & 63;
            var0.field4320 = (var0.field4320 * 1595830249 | var10 << 11) * 997939289;
         }

         label296: {
            if (var0.field4247 * -851058883 != 1) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               if (4 != var0.field4247 * -851058883) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (5 != -851058883 * var0.field4247) {
                     if (var2 >= 0) {
                        return;
                     }

                     if (6 != var0.field4247 * -851058883) {
                        break label296;
                     }

                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }

            var0.field4318 = var1.method13071(-160417512);
            if (var0.field4318.isEmpty()) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               if (1 == var0.field4247 * -851058883) {
                  var0.field4318 = classKK.field3795;
               }

               if (4 == -851058883 * var0.field4247) {
                  var0.field4318 = classKK.field3612;
               }

               if (-851058883 * var0.field4247 == 5) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  var0.field4318 = classKK.field3612;
               }

               if (-851058883 * var0.field4247 == 6) {
                  if (var2 >= 0) {
                     return;
                  }

                  var0.field4318 = classKK.field3777;
               }
            }
         }

         label285: {
            if (-851058883 * var0.field4247 != 1 && 4 != -851058883 * var0.field4247) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               if (-851058883 * var0.field4247 != 5) {
                  break label285;
               }

               if (var2 >= 0) {
                  throw new IllegalStateException();
               }
            }

            var0.field4320 = 997939289 * (1595830249 * var0.field4320 | 4194304);
         }

         if (-851058883 * var0.field4247 == 6) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            var0.field4320 = (var0.field4320 * 1595830249 | 1) * 997939289;
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "lw.ab(" + ')');
      }
   }

   public String getName() {
      return this.method7366().replace(' ', ' ');
   }

   public boolean isHidden() {
      if (!classOE.field4843.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (this.isSelfHidden()) {
         return true;
      } else {
         net.runelite.api.widgets.Widget var1 = this.getParent();
         if (var1 == null) {
            if (WidgetUtil.componentToInterface(this.getId()) != classOE.field4843.getTopLevelInterfaceId()) {
               return true;
            }
         } else if (var1.isHidden()) {
            return true;
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("eg")
   public String method7265() {
      if (-1510882375 * this.field4375 == 11 && this.field4366 != null) {
         String var1 = classMA.method7468(this.field4366, -143597963);

         for (classMD var3 : classMA.method7462(this.field4366, (byte)85)) {
            String var4 = String.format("%%%S%%", var3.method7535((byte)-108));
            if (var3.vmethod525(-1173380297) == 0) {
               var1.replaceAll(var4, Integer.toString(var3.vmethod523(-1283537517)));
            } else {
               var1.replaceAll(var4, var3.vmethod519(-1458487053));
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;")
   @ObfuscatedName("cr")
   Object[] method7163(Object[] var1) {
      return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
   }

   public void setHeight(int var1) {
      this.field4259 = var1 * -1358979455;
   }

   @ObfuscatedSignature(descriptor = "()Ltt;")
   @ObfuscatedName("fo")
   public classTT method7291() {
      return this.field4369 != null ? this.field4369.field4420 : null;
   }

   public void revalidateScroll() {
      if (!classOE.field4843.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         this.revalidate();
         client.method2411(classWK.field6691.field4440[WidgetUtil.componentToInterface(this.getId())], this, false, classWK.field6691, client.field823);
      }
   }

   public int getOpacity() {
      return this.field4347 * 1517457381;
   }

   @ObfuscatedSignature(descriptor = "(Lly;)V")
   @ObfuscatedName("em")
   void method7280(classLY var1) {
      this.field4403 = true;
      ArrayList var2 = this.field4366.method7455((short)-244);
      ArrayList var3 = classMA.method7459(this.field4366, 599647165);
      int var4 = var2.size() + var3.size();
      this.field4340 = new Widget[var4];
      int var5 = 0;

      for (classMN var7 : var2) {
         Widget var8 = classMN.method7623(5, this, var5, 0, 0, 0, 0, var7.field4541, (byte)-1);
         var8.field4339 = classEY.method4117(var7.field4544, (byte)-1);
         classLN var9 = new classLN(var7.field4544);
         var1.field4438.method9982(var8.field4339, var9, (byte)1);
         this.field4340[var5++] = var8;
      }

      for (classML var11 : var3) {
         Widget var12 = classMN.method7623(4, this, var5, 0, 0, 0, 0, var11.field4525, (byte)-66);
         var12.field4301 = var11.field4532;
         var12.field4245 = (Integer)this.field4367.get(463835541 * var11.field4524) * 590574429;
         var12.field4304 = 329236247 * var11.field4523;
         var12.field4305 = var11.field4526 * 616376749;
         this.field4340[var5++] = var12;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lym;I)V")
   @ObfuscatedName("nf")
   public static void method7195(Widget var0, SpritePixels var1, int var2) {
      if (var0 == null) {
         var0.method7196(var1, var2);
      } else {
         try {
            if (var0.field4352) {
               if (var2 >= -563524676) {
                  throw new IllegalStateException();
               }

               var1.method13498();
            }

            if (var0.field4256) {
               if (var2 >= -563524676) {
                  throw new IllegalStateException();
               }

               var1.method13491();
            }

            if (-2011859635 * var0.field4283 > 0) {
               if (var2 >= -563524676) {
                  throw new IllegalStateException();
               }

               var1.method13486(var0.field4283 * -2011859635);
            }

            if (var0.field4283 * -2011859635 >= 1) {
               if (var2 >= -563524676) {
                  throw new IllegalStateException();
               }

               var1.method13500(1);
            }

            if (var0.field4283 * -2011859635 >= 2) {
               if (var2 >= -563524676) {
                  throw new IllegalStateException();
               }

               var1.method13500(16777215);
            }

            if (880555563 * var0.field4284 != 0) {
               if (var2 >= -563524676) {
                  throw new IllegalStateException();
               }

               classHJ.method6064(var1, var0.field4284 * 880555563);
            }
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "lw.ay(" + ')');
         }
      }
   }

   public Widget() {
      this.field4242 = -1;
      this.field4243 = -1;
      this.field4244 = -1;
      this.field4275 = false;
      this.field4329 = -519254441;
      this.field4260 = 1612510305;
      this.field4247 = 0;
      this.field4334 = 0;
      this.field4264 = 0;
      this.field4250 = 0;
      this.field4251 = 0;
      this.field4252 = 0;
      this.field4248 = 0;
      this.field4285 = 0;
      this.field4255 = 0;
      this.field4335 = 0;
      this.field4281 = 0;
      this.method7310(-1);
      this.field4257 = 0;
      this.method7315(-1);
      this.field4249 = 0;
      this.field4259 = 0;
      this.field4274 = 62747509;
      this.field4261 = -1988594555;
      this.field4342 = 676768211;
      this.field4263 = -1000754647;
      this.field4289 = false;
      this.field4265 = -1939173753;
      this.field4266 = 0;
      this.field4341 = 0;
      this.field4331 = 0;
      this.field4258 = 0;
      this.field4269 = 0;
      this.field4270 = 0;
      this.field4295 = 0;
      this.field4272 = 0;
      this.field4273 = 0;
      this.field4271 = false;
      this.field4307 = classYE.field6972;
      this.field4347 = 0;
      this.field4276 = 0;
      this.field4277 = 327091521;
      this.field4278 = false;
      this.field4348 = -857041169;
      this.field4349 = -1515656587;
      this.field4351 = 0;
      this.field4282 = false;
      this.field4283 = 0;
      this.field4284 = 0;
      this.field4333 = 656328391;
      this.field4374 = -434741949;
      this.field4287 = -1108433005;
      this.field4354 = -607878109;
      this.field4288 = -742198477;
      this.field4293 = -668997325;
      this.field4290 = 0;
      this.field4291 = 0;
      this.field4356 = 0;
      this.field4292 = 0;
      this.field4294 = 0;
      this.field4338 = 1053796444;
      this.field4296 = 0;
      this.field4262 = 0;
      this.field4297 = false;
      this.field4298 = false;
      this.field4299 = -699666682;
      this.field4245 = -590574429;
      this.field4301 = "";
      this.field4302 = "";
      this.field4303 = 0;
      this.field4304 = 0;
      this.field4305 = 0;
      this.field4306 = false;
      this.field4320 = 0;
      this.field4360 = false;
      this.field4309 = "";
      this.field4310 = 695305012;
      this.field4311 = null;
      this.field4368 = 0;
      this.field4313 = 0;
      this.field4314 = false;
      this.field4345 = "";
      this.field4315 = false;
      this.field4316 = 1709618187;
      this.field4317 = "";
      this.field4318 = classKK.field3795;
      this.field4319 = -1321867761;
      this.field4344 = 0;
      this.field4321 = 0;
      this.field4327 = 0;
      this.field4322 = false;
      this.field4323 = false;
      this.field4324 = -1478436671;
      this.field4325 = 0;
      this.field4300 = 0;
      this.field4326 = 0;
      this.field4403 = false;
      this.field4328 = false;
      this.field4373 = false;
      this.field4330 = 1716422141;
   }

   public int getItemQuantity() {
      return this.field4344 * 1190987649;
   }

   @ObfuscatedSignature(descriptor = "(Llw;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lda;I)V")
   @ObfuscatedName("ft")
   public static void method7233(Widget var0, String var1, String var2, String var3, String var4, String var5, classDA var6, int var7) {
      if (var0 == null) {
         var0.method7234(var1, var1, var1, var1, var1, var6, var7);
      } else {
         try {
            var0.field4366 = new classMA();
            if (!var0.field4366.method7431(var1, var3, var6, 1711128091)) {
               if (var7 >= -1580735539) {
                  throw new IllegalStateException();
               } else {
                  var0.field4366 = null;
               }
            } else {
               label33: {
                  if (null != var0.field4367) {
                     if (var7 >= -1580735539) {
                        throw new IllegalStateException();
                     }

                     if (null != var0.field4268) {
                        break label33;
                     }

                     if (var7 >= -1580735539) {
                        throw new IllegalStateException();
                     }
                  }

                  var0.method7239(2055703410);
               }

               classMA.method7434(var0.field4366, var2, var4, var5, (short)-2712);
            }
         } catch (RuntimeException var8) {
            throw classEG.method3884(var8, "lw.ah(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("yj")
   public Widget method7361(int var1) {
      this.field4303 = var1 * -763080175;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Llh;)Z")
   @ObfuscatedName("fi")
   boolean method7298(classLH var1) {
      boolean var2 = false;
      if (this.field4301 != null && !this.field4301.isEmpty()) {
         var2 |= classLH.method6804(var1, classLB.method6662(this.field4301, -1749188599), 1589594921);
         this.field4301 = "";
      }

      if (this.field4302 != null && !this.field4302.isEmpty()) {
         var2 |= var1.method6809(classLB.method6662(this.field4302, 1431120141), -797032978);
         this.field4302 = "";
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Z)Llw;")
   @ObfuscatedName("ug")
   public Widget method7362(boolean var1) {
      this.field4282 = var1;
      return this;
   }

   public int getRotationX() {
      return this.field4356 * -1246332317;
   }

   @ObfuscatedSignature(descriptor = "(Llh;)Z")
   @ObfuscatedName("fb")
   boolean method7299(classLH var1) {
      boolean var2 = false;
      if (this.field4301 != null && !this.field4301.isEmpty()) {
         var2 |= classLH.method6804(var1, classLB.method6662(this.field4301, 2048179364), -278339340);
         this.field4301 = "";
      }

      if (this.field4302 != null && !this.field4302.isEmpty()) {
         var2 |= var1.method6809(classLB.method6662(this.field4302, -1454598254), -1098056040);
         this.field4302 = "";
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Llh;)Z")
   @ObfuscatedName("fu")
   boolean method7300(classLH var1) {
      boolean var2 = false;
      if (this.field4301 != null && !this.field4301.isEmpty()) {
         var2 |= classLH.method6804(var1, classLB.method6662(this.field4301, -1650575090), 1550228137);
         this.field4301 = "";
      }

      if (this.field4302 != null && !this.field4302.isEmpty()) {
         var2 |= var1.method6809(classLB.method6662(this.field4302, -809983775), -608172188);
         this.field4302 = "";
      }

      return var2;
   }

   public net.runelite.api.widgets.Widget[] getNestedChildren() {
      if (!classOE.field4843.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (this.field4260 * 63131743 > -1) {
         return new net.runelite.api.widgets.Widget[0];
      } else {
         InterfaceParent var1 = (InterfaceParent)classWK.field6691.field6613.method13383(this.field4329 * -1163656551);
         if (var1 == null) {
            return new Widget[0];
         } else {
            int var2 = var1.getId();
            ArrayList var3 = new ArrayList();

            for (Widget var7 : classOE.field4843.method2255(var2)) {
               if (var7 != null && var7.field4342 * -1502647899 == -1) {
                  var3.add(var7);
               }
            }

            return var3.toArray(new Widget[0]);
         }
      }
   }

   public void setOnMouseRepeatListener(Object[] var1) {
      this.field4286 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("jc")
   public Widget method7363(int var1) {
      this.field4258 = var1 * -803344527;
      return this;
   }

   public int getRotationY() {
      return this.field4294 * 827587461;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("yg")
   public void method7364(String var1) {
      this.field4309 = var1;
   }

   public void setOnDialogAbortListener(Object[] var1) {
      this.field4406 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lly;)Z")
   @ObfuscatedName("fz")
   public boolean method7302(classLY var1) {
      classLH var2 = this.method7283(-1384507301);
      if (var2 == null) {
         return false;
      } else {
         boolean var3 = false;
         if (!var2.method6998((byte)-40) && -1 != -1803847435 * this.field4245) {
            int var4 = var2.method7001(1936117163);
            int var5 = classLH.method7003(var2, 891551425);
            int var6 = var2.method6995(-729758454);
            int var7 = var2.method6994((byte)-88);
            Font var8 = this.method7199(var1, (byte)28);
            if (null != var8) {
               var3 |= classLH.method6813(var2, var8, -333112261);
               var3 |= this.method7297(var2, -1429429791);
               var3 |= var2.method6834(var4, var5, -882131617);
               var3 |= classLH.method6882(var2, var6, var7, 1122842785);
            }
         } else if (var2.method6998((byte)-91)) {
            var3 |= this.method7297(var2, -1991414598);
         }

         var2.method6794(1403534382);
         return var3;
      }
   }

   public int getRelativeX() {
      return this.field4281 * 744286069;
   }

   @ObfuscatedSignature(descriptor = "()Llx;")
   @ObfuscatedName("fy")
   public classLX method7296() {
      return this.field4369;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("al")
   public Widget method7365(int var1) {
      this.field4341 = var1 * 731382367;
      return this;
   }

   public void setOnClickListener(Object[] var1) {
      this.field4359 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("wg")
   public String method7366() {
      return this.field4309;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("fh")
   public Widget method7367(int var1) {
      this.field4320 = var1 * 997939289;
      return this;
   }

   @ObfuscatedSignature(descriptor = "()Lma;")
   @ObfuscatedName("er")
   public classMA method7272() {
      return this.field4366;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lda;)V")
   @ObfuscatedName("dl")
   public void method7238(String var1, classDA var2) {
      if (11 == this.field4375 * -1510882375 && var1 != null) {
         this.field4366 = new classMA();
         classMA.method7495(this.field4366, var1, var2, 1472116592);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lye;")
   @ObfuscatedName("bd")
   public classYE method7368() {
      return this.field4307;
   }

   @ObfuscatedSignature(descriptor = "(Lly;Lda;)Z")
   @ObfuscatedName("ew")
   public boolean method7275(classLY var1, classDA var2) {
      if (11 == this.field4375 * -1510882375 && null != this.field4366) {
         this.field4366.method7438(var2, 838164688);
         if (this.field4366.method7441(-139701566) != 2133229739 * this.field4330) {
            this.field4330 = this.field4366.method7441(-139701566) * -1716422141;
            if (2133229739 * this.field4330 >= 3) {
               return true;
            }

            if (2 == this.field4330 * 2133229739) {
               this.method7277(var1, -1152753755);
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "([BI)Lbl;")
   @ObfuscatedName("ab")
   static Script method7156(byte[] var0, int var1) {
      try {
         Script var2 = new Script();
         classXY var3 = new classXY(var0);
         var3.field6955 = (var3.field6954.length - 2) * -1095856699;
         int var4 = classXY.method13047(var3, -2136955376);
         int var5 = var3.field6954.length - 2 - var4 - 16;
         var3.field6955 = var5 * -1095856699;
         int var6 = var3.method13056((byte)1);
         var2.field493 = classXY.method13047(var3, -966173398) * -420896219;
         var2.field496 = classXY.method13047(var3, 1836786951) * -431593185;
         var2.field492 = classXY.method13047(var3, 1297999619) * 2139455799;
         var2.field495 = classXY.method13047(var3, 395083812) * 1424730171;
         var2.field494 = classXY.method13047(var3, -2057306067) * 712179175;
         var2.field497 = classXY.method13047(var3, 760736946) * 1116857197;
         int var7 = classXY.method13039(var3, -346779531);
         if (var7 > 0) {
            if (var1 >= 642137221) {
               throw new IllegalStateException();
            }

            var2.field505 = var2.method1144(var7, (byte)127);

            for (int var8 = 0; var8 < var7; var8++) {
               int var9 = classXY.method13047(var3, 909554200);
               IterableNodeHashTable var10000 = new IterableNodeHashTable;
               int var10002;
               if (var9 > 0) {
                  if (var1 >= 642137221) {
                     throw new IllegalStateException();
                  }

                  var10002 = classBZ.method1385(var9, -81972016);
               } else {
                  var10002 = 1;
               }

               var10000./* $VF: Unable to resugar constructor */<init>(var10002);
               IterableNodeHashTable var10 = var10000;
               var2.field505[var8] = var10;

               while (var9-- > 0) {
                  if (var1 >= 642137221) {
                     throw new IllegalStateException();
                  }

                  int var11 = var3.method13056((byte)1);
                  int var12 = var3.method13056((byte)1);
                  IterableNodeHashTable.method13576(var10, new IntegerNode(var12), var11);
               }
            }
         }

         var3.field6955 = 0;
         var2.field500 = var3.method13069((byte)-43);
         var2.field501 = new int[var6];
         var2.field502 = new int[var6];
         var2.field504 = new String[var6];
         var2.field503 = new long[var6];
         int var14 = 0;

         while (var3.field6955 * 702114061 < var5) {
            int var15 = classXY.method13047(var3, 1509230209);
            switch (var15) {
               case 3:
                  var2.field504[var14] = var3.method13071(59567316);
                  break;
               case 21:
               case 38:
               case 39:
               case 62:
               case 63:
                  var2.field502[var14] = classXY.method13039(var3, -346779531);
                  break;
               case 61:
                  var2.field503[var14] = var3.method13059(1648463983);
                  break;
               default:
                  if (var15 <= 99) {
                     if (var1 >= 642137221) {
                        throw new IllegalStateException();
                     }

                     var2.field502[var14] = var3.method13056((byte)1);
                  } else {
                     var2.field502[var14] = classXY.method13039(var3, -346779531);
                  }
            }

            var2.field501[var14++] = var15;
         }

         return var2;
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "lw.ab(" + ')');
      }
   }

   public void setWidth(int var1) {
      this.field4249 = var1 * -1261469175;
   }

   @ObfuscatedSignature(descriptor = "(Lly;Lda;B)Lym;")
   @ObfuscatedName("al")
   SpritePixels method7191(classLY var1, classDA var2, byte var3) {
      try {
         if (this.field4339 != null) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            if (null != var2) {
               classLN var4 = (classLN)var1.field4436.method9981(this.field4317, (byte)-26);
               if (null == var4) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  var4 = new classLN(this.field4317, var2);
                  var1.field4438.method9982(this.field4345, var4, (byte)1);
               }

               return var4.method7123(1214443818);
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "lw.al(" + ')');
      }
   }

   public void setTargetPriority(int var1) {
      this.field4310 = var1 * 173826253;
   }

   public int getOriginalWidth() {
      return this.field4255 * 1523460725;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("il")
   public Widget method7369(int var1) {
      this.field4285 = var1 * 1989424741;
      return this;
   }

   public Object[] getOnKeyListener() {
      return this.field4388;
   }

   @ObfuscatedSignature(descriptor = "(Lly;I)Z")
   @ObfuscatedName("bd")
   public boolean method7303(classLY var1, int var2) {
      try {
         classLH var3 = this.method7283(-1285434602);
         if (var3 == null) {
            if (var2 == -1110124474) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            boolean var4;
            label49: {
               var4 = false;
               if (!var3.method6989((byte)-81)) {
                  if (var2 == -1110124474) {
                     throw new IllegalStateException();
                  }

                  if (-1 != -1803847435 * this.field4305) {
                     if (var2 == -1110124474) {
                        throw new IllegalStateException();
                     }

                     int var5 = var3.method6995(1953330546);
                     int var6 = classLH.method7003(var3, 248323188);
                     int var7 = var3.method7018(652006032);
                     int var8 = var3.method7039((byte)-107);
                     Font var9 = this.method7199(var1, (byte)-9);
                     if (null != var9) {
                        if (var2 == -1110124474) {
                           throw new IllegalStateException();
                        }

                        var4 |= classLH.method6813(var3, var9, -990616751);
                        var4 |= this.method7297(var3, -1853987285);
                        var4 |= var3.method6834(var5, var6, -774367201);
                        var4 |= classLH.method6882(var3, var7, var8, 1122842785);
                     }
                     break label49;
                  }
               }

               if (var3.method6989((byte)-23)) {
                  if (var2 == -1110124474) {
                     throw new IllegalStateException();
                  }

                  var4 |= this.method7297(var3, -1385179671);
               }
            }

            var3.method7084(145599420);
            return var4;
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "lw.bd(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ml")
   public static String method7254(Widget var0, String var1) {
      return 11 == var0.field4375 * -1510882375 && var0.field4366 != null && var0.method7249(1355775728) ? var0.field4366.method7452(var1, (byte)-29) : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;ILjava/lang/Object;)V")
   @ObfuscatedName("wy")
   public static void method7231(Widget var0, int var1, Object var2) {
      if (var0 == null) {
         var0.isFlippedHorizontally();
      }

      for (int var3 = 0; var3 < -2048004067 * var0.field4308; var3++) {
         if (var1 == var0.field4405[var3]) {
            var0.field4336[var3] = var2;
            return;
         }
      }

      if (var0.field4336 == null) {
         var0.field4405 = new int[4];
         var0.field4336 = new Object[4];
      } else if (-2048004067 * var0.field4308 == var0.field4336.length) {
         var0.field4405 = Arrays.copyOf(var0.field4405, 2 * var0.field4405.length);
         var0.field4336 = Arrays.copyOf(var0.field4336, 2 * var0.field4336.length);
      }

      var0.field4405[var0.field4308 * 280402259] = var1;
      var0.field4336[var0.field4308 * 961827228] = var2;
      var0.field4308 += -102477259;
   }

   public void setRelativeX(int var1) {
      this.field4281 = var1 * 2084925661;
   }

   public int getId() {
      return this.field4329 * -1163656551;
   }

   public int getYTextAlignment() {
      return this.field4305 * -338086361;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;B)V")
   @ObfuscatedName("ab")
   void method7171(classXY var1, byte var2) {
      try {
         this.field4297 = false;
         this.field4245 = classXY.method13039(var1, -346779531) * 685068937;
         this.field4344 = classXY.method13039(var1, -346779531) * -811438059;
         this.field4261 = classXY.method13047(var1, 943248541) * -411168601;
         this.field4249 = var1.method13122((byte)16) * -1076753689;
         this.field4333 = var1.method13159((byte)16) * 1989424741;
         this.field4248 = classXY.method13047(var1, -772132885) * 1034606045;
         this.field4341 = classXY.method13047(var1, -1633239070) * -259501473;
         this.field4342 = classXY.method13039(var1, -346779531) * -2056841747;
         this.field4321 = classXY.method13047(var1, -1526083782) * -676768211;
         if (65535 == this.field4251 * -1502647899) {
            this.field4262 = 676768211;
         } else {
            this.field4240 = -676768211 * ((-1163656551 * this.field4338 & -65536) + -1502647899 * this.field4342);
         }

         this.field4277 = classXY.method13047(var1, -1245275110) * -1709618187;
         if (-2003253155 * this.field4316 == 65535) {
            if (var2 >= 0) {
               return;
            }

            this.field4255 = 1709618187;
         }

         int var3 = classXY.method13039(var1, -346779531);
         if (var3 > 0) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            this.field4267 = new int[var3];
            this.field4385 = new int[var3];

            for (int var4 = 0; var4 < var3; var4++) {
               this.field4404[var4] = classXY.method13039(var1, -346779531);
               this.field4401[var4] = classXY.method13047(var1, 1091068094);
            }
         }

         int var9 = classXY.method13039(var1, -346779531);
         if (var9 > 0) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            this.field4399 = new int[var9][];

            for (int var5 = 0; var5 < var9; var5++) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               int var6 = classXY.method13047(var1, -123746907);
               this.field4399[var5] = new int[var6];

               for (int var7 = 0; var7 < var6; var7++) {
                  if (var2 >= 0) {
                     return;
                  }

                  this.field4399[var5][var7] = classXY.method13047(var1, -980959917);
                  if (this.field4399[var5][var7] == 65535) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     this.field4399[var5][var7] = -1;
                  }
               }
            }
         }

         if (0 == -1510882375 * this.field4252) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            this.field4342 = classXY.method13047(var1, 1175672359) * -251301447;
            this.field4323 = classXY.method13039(var1, -346779531) == 1;
         }

         if (-1510882375 * this.field4295 == 1) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            classXY.method13047(var1, 920361216);
            classXY.method13039(var1, -346779531);
         }

         if (3 == -1510882375 * this.field4241) {
            this.field4315 = classXY.method13039(var1, -346779531) == 1;
         }

         label358: {
            if (4 != -1510882375 * this.field4320) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               if (1 != this.field4296 * -1510882375) {
                  break label358;
               }

               if (var2 >= 0) {
                  throw new IllegalStateException();
               }
            }

            this.field4259 = classXY.method13039(var1, -346779531) * 571804797;
            this.field4261 = classXY.method13039(var1, -346779531) * -2106140265;
            this.field4293 = classXY.method13039(var1, -346779531) * -763080175;
            this.field4247 = classXY.method13047(var1, 1522529353) * 590574429;
            if (65535 == this.field4310 * -1803847435) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               this.field4250 = -590574429;
            }

            boolean var10001;
            if (classXY.method13039(var1, -346779531) == 1) {
               if (var2 >= 0) {
                  return;
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.field4322 = var10001;
         }

         if (this.field4276 * -1510882375 == 4) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            this.field4317 = var1.method13077(1710850257);
            this.field4318 = var1.method13071(1471640970);
         }

         label316: {
            if (1 != -1510882375 * this.field4335) {
               if (var2 >= 0) {
                  return;
               }

               if (3 != this.field4248 * -1510882375) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (this.field4263 * -1510882375 != 4) {
                     break label316;
                  }

                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }
               }
            }

            this.field4333 = var1.method13202((byte)1) * 1590850751;
         }

         label307: {
            if (-1510882375 * this.field4264 != 3) {
               if (var2 >= 0) {
                  return;
               }

               if (4 != this.field4251 * -1510882375) {
                  break label307;
               }

               if (var2 >= 0) {
                  throw new IllegalStateException();
               }
            }

            this.field4284 = var1.method13159((byte)1) * -1914223631;
            this.field4258 = var1.method13122((byte)1) * -1882190803;
            this.field4272 = var1.method13207((byte)1) * -1240050015;
         }

         if (5 == this.field4260 * -1510882375) {
            this.field4262 = var1.method13207((byte)1) * 857041169;
            this.field4293 = var1.method13202((byte)1) * 1515656587;
         }

         if (-1510882375 * this.field4321 == 6) {
            if (var2 >= 0) {
               return;
            }

            this.field4290 = 656328391;
            this.field4308 = -1108433005;
            this.field4291 = var1.method13117(classXM.field6889.field6890, 1593564491) * 434741949;
            this.field4354 = var1.method13117(classXM.field6888.field6890, 1741762813) * 607878109;
            this.field4320 = classXY.method13047(var1, -495192957) * 742198477;
            if (65535 == 2114568197 * this.field4338) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               this.field4368 = -742198477;
            }

            this.field4295 = classXY.method13047(var1, 1533818567) * 668997325;
            if (821151237 * this.field4249 == 65535) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               this.field4292 = -668997325;
            }

            this.field4331 = classXY.method13047(var1, -1228383652) * 1556726191;
            this.field4333 = classXY.method13047(var1, 1322170790) * 1703663435;
            this.field4338 = classXY.method13047(var1, 1007031475) * 993003239;
         }

         if (8 == -1510882375 * this.field4293) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            this.field4317 = var1.method13071(-953868593);
         }

         if (this.field4348 * -851058883 == 2) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            this.field4318 = var1.method13071(1626437172);
            this.field4301 = var1.method13071(-1228529393);
            int var10 = classXY.method13047(var1, -909726546) & 63;
            this.field4292 = (this.field4261 * 1595830249 | var10 << 11) * 997939289;
         }

         label294: {
            if (this.field4338 * -851058883 != 1) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               if (4 != this.field4264 * -851058883) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (5 != -851058883 * this.field4319) {
                     if (var2 >= 0) {
                        return;
                     }

                     if (6 != this.field4305 * -851058883) {
                        break label294;
                     }

                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }

            this.field4309 = var1.method13071(-160417512);
            if (this.field4309.isEmpty()) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               if (1 == this.field4321 * -851058883) {
                  this.field4309 = classKK.field3663;
               }

               if (4 == -851058883 * this.field4319) {
                  this.field4309 = classKK.field3694;
               }

               if (-851058883 * this.field4249 == 5) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  this.field4309 = classKK.field3611;
               }

               if (-851058883 * this.field4331 == 6) {
                  if (var2 >= 0) {
                     return;
                  }

                  this.field4345 = classKK.field3666;
               }
            }
         }

         label283: {
            if (-851058883 * this.field4255 != 1 && 4 != -851058883 * this.field4296) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               if (-851058883 * this.field4252 != 5) {
                  break label283;
               }

               if (var2 >= 0) {
                  throw new IllegalStateException();
               }
            }

            this.field4304 = 997939289 * (1595830249 * this.field4245 | 4194304);
         }

         if (-851058883 * this.field4294 == 6) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            this.field4245 = (this.field4274 * 1595830249 | 1) * 997939289;
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "lw.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lly;I)Z")
   @ObfuscatedName("vy")
   public static boolean method7304(Widget var0, classLY var1, int var2) {
      if (var0 == null) {
         return var0.method7303(var1, var2);
      } else {
         try {
            classLH var3 = var0.method7283(-1285434602);
            if (var3 == null) {
               if (var2 == -1110124474) {
                  throw new IllegalStateException();
               } else {
                  return false;
               }
            } else {
               boolean var4;
               label51: {
                  var4 = false;
                  if (!var3.method6998((byte)-81)) {
                     if (var2 == -1110124474) {
                        throw new IllegalStateException();
                     }

                     if (-1 != -1803847435 * var0.field4245) {
                        if (var2 == -1110124474) {
                           throw new IllegalStateException();
                        }

                        int var5 = var3.method7001(1953330546);
                        int var6 = classLH.method7003(var3, 248323188);
                        int var7 = var3.method6995(652006032);
                        int var8 = var3.method6994((byte)-107);
                        Font var9 = var0.method7199(var1, (byte)-9);
                        if (null != var9) {
                           if (var2 == -1110124474) {
                              throw new IllegalStateException();
                           }

                           var4 |= classLH.method6813(var3, var9, -990616751);
                           var4 |= var0.method7297(var3, -1853987285);
                           var4 |= var3.method6834(var5, var6, -774367201);
                           var4 |= classLH.method6882(var3, var7, var8, 1122842785);
                        }
                        break label51;
                     }
                  }

                  if (var3.method6998((byte)-23)) {
                     if (var2 == -1110124474) {
                        throw new IllegalStateException();
                     }

                     var4 |= var0.method7297(var3, -1385179671);
                  }
               }

               var3.method6794(145599420);
               return var4;
            }
         } catch (RuntimeException var10) {
            throw classEG.method3884(var10, "lw.bd(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lda;I)V")
   @ObfuscatedName("ah")
   public void method7234(String var1, String var2, String var3, String var4, String var5, classDA var6, int var7) {
      try {
         this.field4366 = new classMA();
         if (!this.field4366.method7431(var1, var3, var6, 1711128091)) {
            if (var7 >= -1580735539) {
               throw new IllegalStateException();
            } else {
               this.field4366 = null;
            }
         } else {
            label31: {
               if (null != this.field4367) {
                  if (var7 >= -1580735539) {
                     throw new IllegalStateException();
                  }

                  if (null != this.field4268) {
                     break label31;
                  }

                  if (var7 >= -1580735539) {
                     throw new IllegalStateException();
                  }
               }

               this.method7239(2055703410);
            }

            classMA.method7434(this.field4366, var2, var4, var5, (short)-2712);
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "lw.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IB)V")
   @ObfuscatedName("bp")
   public void method7246(String var1, int var2, byte var3) {
      try {
         if (this.field4334 * -1510882375 != 11) {
            if (var3 != 32) {
               ;
            }
         } else {
            if (null == this.field4367) {
               if (var3 == 32) {
                  throw new IllegalStateException();
               }

               this.method7239(-1248678116);
            }

            this.field4367.put(var1, var2);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lw.bp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;I)Lli;")
   @ObfuscatedName("as")
   public static classLI method7285(Widget var0, int var1) {
      if (var0 == null) {
         return var0.method7286(var1);
      } else {
         try {
            classLI var10000;
            if (var0.field4369 != null) {
               if (var1 <= -14785344) {
                  throw new IllegalStateException();
               }

               var10000 = var0.field4369.field4421;
            } else {
               var10000 = null;
            }

            return var10000;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "lw.by(" + ')');
         }
      }
   }

   public int getWidthMode() {
      return this.field4251 * -1966367247;
   }

   @ObfuscatedSignature(descriptor = "(Lly;Lda;I)Z")
   @ObfuscatedName("bw")
   public boolean method7276(classLY var1, classDA var2, int var3) {
      try {
         if (11 == this.field4342 * -1510882375) {
            if (var3 <= -425882002) {
               throw new IllegalStateException();
            }

            if (null != this.field4366) {
               this.field4366.method7438(var2, -653470088);
               if (this.field4366.method7441(-139701566) != 2133229739 * this.field4330) {
                  this.field4354 = this.field4366.method7441(-139701566) * -1716422141;
                  if (2133229739 * this.field4308 >= 3) {
                     if (var3 <= -425882002) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }

                  if (2 == this.field4330 * 2133229739) {
                     if (var3 <= -425882002) {
                        throw new IllegalStateException();
                     }

                     this.method7277(var1, 511211855);
                     return true;
                  }
               }

               return false;
            }

            if (var3 <= -425882002) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lw.bw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Llw;")
   @ObfuscatedName("tk")
   public Widget method7321(String var1) {
      this.method7364(var1.replace(' ', ' '));
      return this;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Lly;Z)Lkh;")
   @ObfuscatedName("jl")
   public static classKH method7205(Widget var0, classLY var1, boolean var2) {
      if (var0 == null) {
         var0.method7206(var1, var2);
      }

      if (-1 == var0.field4349 * -669652445) {
         var2 = false;
      }

      int var3 = var2 ? -669652445 * var0.field4349 : 208578545 * var0.field4348;
      if (var3 == -1) {
         return null;
      } else {
         long var4 = ((long)(var0.field4284 * 880555563) << 40)
            + var3
            + ((long)(-2011859635 * var0.field4283) << 36)
            + ((var0.field4352 ? 1L : 0L) << 38)
            + ((var0.field4256 ? 1L : 0L) << 39);
         classKH var6 = (classKH)var1.field4432.method6422(var4);
         if (null != var6) {
            return var6;
         } else {
            SpritePixels var7 = var0.method7319(var1, var2, null, 2118704501);
            if (var7 == null) {
               return null;
            } else {
               SpritePixels var8 = var7.method13476();
               int[] var9 = new int[var8.field7009];
               int[] var10 = new int[var8.field7009];

               for (int var11 = 0; var11 < var8.field7009; var11++) {
                  int var12 = 0;
                  int var13 = var8.field7007;

                  for (int var14 = 0; var14 < var8.field7007; var14++) {
                     if (var8.field7005[var11 * var8.field7007 + var14] == 0) {
                        var12 = var14;
                        break;
                     }
                  }

                  for (int var16 = var8.field7007 - 1; var16 >= var12; var16--) {
                     if (var8.field7005[var16 + var8.field7007 * var11] == 0) {
                        var13 = 1 + var16;
                        break;
                     }
                  }

                  var9[var11] = var12;
                  var10[var11] = var13 - var12;
               }

               var6 = new classKH(var8.field7007, var8.field7009, var10, var9, var3);
               var1.field4432.method6428(var6, var4);
               return var6;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;II)I")
   @ObfuscatedName("hh")
   public static int method7225(Widget var0, int var1, int var2) {
      if (var0 == null) {
         var0.method7371(var1);
      }

      for (int var3 = 0; var3 < -2048004067 * var0.field4308; var3++) {
         if (var1 == var0.field4405[var3]) {
            return (Integer)var0.field4336[var3];
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(I)Lli;")
   @ObfuscatedName("by")
   public classLI method7286(int var1) {
      try {
         classLI var10000;
         if (this.field4369 != null) {
            if (var1 <= -14785344) {
               throw new IllegalStateException();
            }

            var10000 = this.field4369.field4421;
         } else {
            var10000 = null;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lw.by(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;IIB)I")
   @ObfuscatedName("ls")
   public static int method7226(Widget var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         return var0.method7227(var1, var1, var3);
      } else {
         try {
            for (int var4 = 0; var4 < -2048004067 * var0.field4308; var4++) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               }

               if (var1 == var0.field4405[var4]) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  }

                  return (Integer)var0.field4336[var4];
               }
            }

            return var2;
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "lw.av(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ltt;")
   @ObfuscatedName("bq")
   public classTT method7292(int var1) {
      try {
         return this.field4369 != null ? this.field4369.field4420 : null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lw.bq(" + ')');
      }
   }

   public void setFlippedVertically(boolean var1) {
      this.field4352 = var1;
   }

   public void setAction(int var1, String var2) {
      this.method7207(var1, var2, (byte)-94);
   }

   public void setOnHoldListener(Object[] var1) {
      this.field4378 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aw")
   public boolean method7219(int var1) {
      try {
         if (11 != this.field4262 * -1510882375) {
            if (this.field4374 * -1510882375 != 12) {
               return false;
            }

            if (var1 <= 403819328) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lw.aw(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lda;)V")
   @ObfuscatedName("be")
   public static void method7235(Widget var0, String var1, String var2, String var3, String var4, String var5, classDA var6) {
      if (var0 == null) {
         var0.method7262();
      }

      var0.field4366 = new classMA();
      if (!var0.field4366.method7431(var1, var3, var6, 571906965)) {
         var0.field4366 = null;
      } else {
         if (null == var0.field4367 || null == var0.field4268) {
            var0.method7239(19588919);
         }

         classMA.method7434(var0.field4366, var2, var4, var5, (short)-31519);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;[IB)[I")
   @ObfuscatedName("yf")
   public static int[] method7166(Widget var0, int[] var1, byte var2) {
      if (var0 == null) {
         var0.method7167(var1, var2);
      }

      try {
         int[] var10000;
         if (var1 != null) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            var10000 = Arrays.copyOf(var1, var1.length);
         } else {
            var10000 = null;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lw.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llc;ZB)V")
   @ObfuscatedName("bl")
   public void method7309(PlayerComposition var1, boolean var2, byte var3) {
      try {
         this.field4245 = 299331441;
         this.field4358 = new PlayerComposition(var1);
         if (!var2) {
            if (var3 <= -4) {
               throw new IllegalStateException();
            }

            this.field4358.field4098 = Arrays.copyOf(this.field4358.field4098, this.field4358.field4092.length);
            this.field4358.method6711((byte)-58);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lw.bl(" + ')');
      }
   }

   public void setVarTransmitTrigger(int[] var1) {
      this.field4280 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("gv")
   public Widget method7370(int var1) {
      this.field4288 = var1 * 742198477;
      return this;
   }

   public void setType(int var1) {
      this.field4375 = var1 * 685068937;
   }

   public void setOnReleaseListener(Object[] var1) {
      this.field4357 = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("av")
   public int method7227(int var1, int var2, byte var3) {
      try {
         for (int var4 = 0; var4 < -2048004067 * this.field4354; var4++) {
            if (var3 == 1) {
               throw new IllegalStateException();
            }

            if (var1 == this.field4279[var4]) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               }

               return (Integer)this.field4336[var4];
            }
         }

         return var2;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "lw.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lym;I)V")
   @ObfuscatedName("ay")
   void method7196(SpritePixels var1, int var2) {
      try {
         if (this.field4360) {
            if (var2 >= -563524676) {
               throw new IllegalStateException();
            }

            var1.method13494();
         }

         if (this.field4314) {
            if (var2 >= -563524676) {
               throw new IllegalStateException();
            }

            var1.method13564();
         }

         if (-2011859635 * this.field4273 > 0) {
            if (var2 >= -563524676) {
               throw new IllegalStateException();
            }

            var1.method13502(this.field4245 * -2011859635);
         }

         if (this.field4348 * -2011859635 >= 1) {
            if (var2 >= -563524676) {
               throw new IllegalStateException();
            }

            var1.setMaxWidth(1);
         }

         if (this.field4374 * -2011859635 >= 2) {
            if (var2 >= -563524676) {
               throw new IllegalStateException();
            }

            var1.setOffsetY(16777215);
         }

         if (880555563 * this.field4321 != 0) {
            if (var2 >= -563524676) {
               throw new IllegalStateException();
            }

            classHJ.method6064(var1, this.field4305 * 880555563);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lw.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("bs")
   public Widget method7371(int var1) {
      this.field4304 = var1 * 571804797;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(II)Llw;")
   @ObfuscatedName("kn")
   public Widget method7313(int var1, int var2) {
      return this.method7351(var1).method7369(var2);
   }

   @ObfuscatedSignature(descriptor = "(Lly;Z)Lkh;")
   @ObfuscatedName("dc")
   public classKH method7206(classLY var1, boolean var2) {
      if (-1 == this.field4252 * -669652445) {
         var2 = false;
      }

      int var3 = var2 ? -669652445 * this.field4348 : 208578545 * this.field4310;
      if (var3 == -1) {
         return null;
      } else {
         long var4 = ((long)(this.field4288 * 880555563) << 40)
            + var3
            + ((long)(-2011859635 * this.field4259) << 36)
            + ((this.field4289 ? 1L : 0L) << 38)
            + ((this.field4315 ? 1L : 0L) << 39);
         classKH var6 = (classKH)var1.field4429.method6423(var4);
         if (null != var6) {
            return var6;
         } else {
            SpritePixels var7 = this.method7319(var1, var2, null, 2118704501);
            if (var7 == null) {
               return null;
            } else {
               SpritePixels var8 = var7.method13474();
               int[] var9 = new int[var8.field7007];
               int[] var10 = new int[var8.field7010];

               for (int var11 = 0; var11 < var8.field7008; var11++) {
                  int var12 = 0;
                  int var13 = var8.field7007;

                  for (int var14 = 0; var14 < var8.field7007; var14++) {
                     if (var8.field7005[var11 * var8.field7009 + var14] == 0) {
                        var12 = var14;
                        break;
                     }
                  }

                  for (int var16 = var8.field7007 - 1; var16 >= var12; var16--) {
                     if (var8.field7005[var16 + var8.field7009 * var11] == 0) {
                        var13 = 1 + var16;
                        break;
                     }
                  }

                  var9[var11] = var12;
                  var10[var11] = var13 - var12;
               }

               var6 = new classKH(var8.field7009, var8.field7009, var10, var9, var3);
               var1.field4429.method6430(var6, var4);
               return var6;
            }
         }
      }
   }

   public boolean getSpriteTiling() {
      return this.field4282;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("bg")
   public String method7255(String var1, int var2) {
      try {
         if (11 == this.field4303 * -1510882375) {
            if (var2 <= -1798356091) {
               throw new IllegalStateException();
            }

            if (this.field4366 != null) {
               if (var2 <= -1798356091) {
                  throw new IllegalStateException();
               }

               if (this.method7212(1355775728)) {
                  return this.field4366.method7452(var1, (byte)46);
               }

               if (var2 <= -1798356091) {
                  throw new IllegalStateException();
               }
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lw.bg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("yg")
   public void method7310(int var1) {
      if (this.field4243 > -1) {
         this.setRelativeX(this.field4243);
      }
   }

   @ObfuscatedSignature(descriptor = "([IB)[I")
   @ObfuscatedName("ae")
   int[] method7167(int[] var1, byte var2) {
      try {
         int[] var10000;
         if (var1 != null) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            var10000 = Arrays.copyOf(var1, var1.length);
         } else {
            var10000 = null;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "lw.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)[I")
   @ObfuscatedName("ck")
   int[] method7184(classXY var1) {
      int var2 = classXY.method13039(var1, -346779531);
      if (0 == var2) {
         return null;
      } else {
         int[] var3 = new int[var2];

         for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = var1.method13122((byte)1);
         }

         return var3;
      }
   }
}
