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

@ObfuscatedName("of")
public class Widget extends Node implements net.runelite.api.widgets.Widget {
   @ObfuscatedName("cv")
   public int transparencyBot;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field4603 = 1338;
   @ObfuscatedName("eh")
   public int dragThreshold;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field4600 = 0;
   @ObfuscatedName("bm")
   public static boolean field4598 = false;
   @ObfuscatedName("bp")
   public boolean isIf3;
   @ObfuscatedName("bt")
   public int id;
   @ObfuscatedName("bu")
   public int childIndex;
   @ObfuscatedName("ba")
   String field4486;
   @ObfuscatedName("ef")
   int[] field4550;
   @ObfuscatedName("gq")
   public boolean field4511;
   @ObfuscatedName("bw")
   public int contentType;
   @ObfuscatedName("nl")
   public short field4432;
   @ObfuscatedName("do")
   public int itemQuantityMode;
   @ObfuscatedName("fx")
   public Object[] field4575;
   @ObfuscatedName("ex")
   public String dataText;
   @ObfuscatedName("br")
   public int heightAlignment;
   @ObfuscatedName("bh")
   public int rawX;
   @ObfuscatedName("bl")
   public int rawY;
   @ObfuscatedName("bc")
   public int rawWidth;
   @ObfuscatedName("bq")
   public int rawHeight;
   @ObfuscatedName("he")
   public int field4513;
   @ObfuscatedName("bv")
   public int y;
   @ObfuscatedName("ch")
   public int width;
   @ObfuscatedName("ce")
   public int height;
   @ObfuscatedName("cu")
   public int field4448;
   @ObfuscatedName("ct")
   public int field4449;
   @ObfuscatedName("cm")
   public int parentId;
   @ObfuscatedName("cb")
   public int field4451;
   @ObfuscatedName("ck")
   public boolean isHidden;
   @ObfuscatedName("cc")
   public int field4453;
   @ObfuscatedName("ci")
   public int mouseOverColor2;
   @ObfuscatedName("cn")
   public int scrollX;
   @ObfuscatedName("co")
   public int scrollY;
   @ObfuscatedName("cx")
   public int scrollWidth;
   @ObfuscatedName("cs")
   public int field4454;
   @ObfuscatedName("cp")
   public int color;
   @ObfuscatedName("cd")
   public int color2;
   @ObfuscatedName("cz")
   public int mouseOverColor;
   @ObfuscatedName("fu")
   public Object[] onTimer;
   @ObfuscatedName("dt")
   public int modelId;
   @ObfuscatedSignature(descriptor = "Lxg;")
   @ObfuscatedName("cy")
   public FillMode fillMode;
   @ObfuscatedName("cq")
   public int transparencyTop;
   @ObfuscatedSignature(descriptor = "Lop;")
   @ObfuscatedName("hb")
   class376 field4554;
   @ObfuscatedName("cw")
   public int lineWid;
   @ObfuscatedName("cr")
   public boolean field4526;
   @ObfuscatedName("cf")
   public boolean fill;
   @ObfuscatedName("en")
   public boolean hasListener;
   @ObfuscatedName("cl")
   public String field4540;
   @ObfuscatedName("dq")
   public int modelAngleZ;
   @ObfuscatedName("cj")
   public int spriteId2;
   @ObfuscatedName("dv")
   public int outline;
   @ObfuscatedName("df")
   public int spriteShadow;
   @ObfuscatedName("gb")
   public String field4506;
   @ObfuscatedName("dc")
   public boolean spriteFlipH;
   @ObfuscatedName("ej")
   String[] field4551;
   @ObfuscatedName("cg")
   public int scrollHeight;
   @ObfuscatedName("eg")
   public byte[][] field4557;
   @ObfuscatedName("dz")
   int modelId2;
   @ObfuscatedName("dd")
   public int spriteAngle;
   @ObfuscatedName("dj")
   public int sequenceId2;
   @ObfuscatedName("da")
   public int modelOffsetX;
   @ObfuscatedName("dk")
   public int fontId;
   @ObfuscatedName("dr")
   public int modelAngleX;
   @ObfuscatedName("hj")
   public boolean noClickThrough;
   @ObfuscatedName("gj")
   public int[][] cs1Instructions;
   @ObfuscatedName("du")
   public int modelZoom;
   @ObfuscatedName("bd")
   public int widthAlignment;
   @ObfuscatedName("we")
   public int field4429 = -1;
   @ObfuscatedName("dp")
   public int field4473;
   @ObfuscatedSignature(descriptor = "Loa;")
   @ObfuscatedName("dg")
   public PlayerComposition field4497;
   @ObfuscatedName("ds")
   public boolean modelOrthog;
   @ObfuscatedName("de")
   public boolean modelTransparency;
   @ObfuscatedName("dh")
   int modelType2;
   @ObfuscatedSignature(descriptor = "Lof;")
   @ObfuscatedName("ev")
   public Widget parent;
   @ObfuscatedName("dn")
   public String text;
   @ObfuscatedName("ec")
   public String text2;
   @ObfuscatedName("ea")
   public int textLineHeight;
   @ObfuscatedName("ee")
   public int textXAlignment;
   @ObfuscatedName("eq")
   public int textYAlignment;
   @ObfuscatedName("es")
   public boolean textShadowed;
   @ObfuscatedName("ge")
   public int itemQuantity;
   @ObfuscatedName("ek")
   int[] field4485;
   @ObfuscatedName("er")
   int[] field4466;
   @ObfuscatedName("db")
   public int modelType;
   @ObfuscatedName("ew")
   public int flags;
   @ObfuscatedName("em")
   public boolean field4460;
   @ToRemove(unused = "true")
   @ObfuscatedName("ze")
   public static int field4605;
   @ObfuscatedName("gk")
   public int[] cs1Comparisons;
   @ObfuscatedName("el")
   public byte[][] field4452;
   @ObfuscatedName("ep")
   public int[] field4560;
   @ObfuscatedName("et")
   public int[] field4561;
   @ObfuscatedName("fc")
   public Object[] field4541;
   @ObfuscatedName("ei")
   public String[] actions;
   @ObfuscatedName("eu")
   public String[][] field4536;
   @ObfuscatedName("ey")
   public int targetPriority;
   @ObfuscatedName("fa")
   public Object[] field4567;
   @ObfuscatedName("ez")
   public int dragZoneSize;
   @ObfuscatedName("fn")
   public Object[] onHold;
   @ObfuscatedName("eo")
   public boolean isScrollBar;
   @ObfuscatedName("dy")
   public boolean spriteFlipV;
   @ObfuscatedName("fb")
   public Object[] onRelease;
   @ObfuscatedName("gm")
   public Object[] field4566;
   @ObfuscatedName("gd")
   public Object[] onDialogAbort;
   @ObfuscatedName("fh")
   public Object[] onMouseRepeat;
   @ObfuscatedName("gu")
   public Object[] field4569;
   @ObfuscatedName("hz")
   HashMap field4553;
   @ObfuscatedName("ga")
   public Object[] field4547;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field4602 = 3;
   @ObfuscatedName("gf")
   public Object[] onMiscTransmit;
   @ObfuscatedName("fv")
   public Object[] onOp;
   @ObfuscatedName("dx")
   public int modelAngleY;
   @ObfuscatedName("fm")
   public Object[] onChatTransmit;
   @ObfuscatedName("fl")
   public Object[] onMouseOver;
   @ObfuscatedName("nx")
   public int field4431;
   @ObfuscatedName("eb")
   public Object[] onLoad;
   @ObfuscatedName("fk")
   public int[] varTransmitTriggers;
   @ObfuscatedName("fw")
   public Object[] onStatTransmit;
   @ObfuscatedName("vp")
   public short field4433;
   @ObfuscatedName("fe")
   public int[] invTransmitTriggers;
   @ObfuscatedName("fj")
   public Object[] onScroll;
   @ObfuscatedName("dl")
   public int modelOffsetY;
   @ObfuscatedName("hh")
   int field4521;
   @ObfuscatedName("fp")
   public Object[] onClickRepeat;
   @ObfuscatedName("gn")
   public Object[] onClanTransmit;
   @ObfuscatedName("fz")
   public Object[] onVarTransmit;
   @ObfuscatedName("gl")
   public int itemId;
   @ObfuscatedName("fi")
   public Object[] onDrag;
   @ObfuscatedName("fr")
   public Object[] onFriendTransmit;
   @ObfuscatedName("ff")
   public Object[] onClick;
   @ObfuscatedName("fy")
   public int[] statTransmitTriggers;
   @ObfuscatedName("gw")
   public int mouseOverRedirect;
   @ObfuscatedName("dm")
   public int field4546;
   @ObfuscatedName("fs")
   public Object[] onMouseLeave;
   @ObfuscatedName("gg")
   public Object[] onStockTransmit;
   @ObfuscatedName("gy")
   public Object[] field4587;
   @ObfuscatedName("gs")
   public Object[] onResize;
   @ObfuscatedName("fq")
   public Object[] onTargetLeave;
   @ObfuscatedName("go")
   public Object[] onSubChange;
   @ObfuscatedName("fg")
   public Object[] onDragComplete;
   @ObfuscatedName("ed")
   public String spellActionName;
   @ObfuscatedName("ud")
   public int field4430 = -1;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field4604 = 1337;
   @ObfuscatedName("ft")
   public Object[] onTargetEnter;
   @ObfuscatedName("gt")
   public int[] cs1ComparisonValues;
   @ObfuscatedName("hq")
   public boolean prioritizeMenuEntry;
   @ObfuscatedName("bn")
   public int yAlignment;
   @ObfuscatedName("gz")
   public String buttonText;
   @ObfuscatedName("gv")
   public int[] itemIds;
   @ObfuscatedName("gh")
   public int[] itemQuantities;
   @ObfuscatedName("gx")
   public int modelFrame;
   @ObfuscatedName("fd")
   public Object[] onKey;
   @ObfuscatedName("bf")
   public int xAlignment;
   @ObfuscatedName("gp")
   public int modelFrameCycle;
   @ObfuscatedSignature(descriptor = "[Lof;")
   @ObfuscatedName("gc")
   public Widget[] children;
   @ObfuscatedName("gi")
   public boolean field4571;
   @ObfuscatedName("bx")
   public int x;
   @ObfuscatedName("gr")
   public int field4512;
   @ObfuscatedName("di")
   public int sequenceId;
   @ObfuscatedName("hw")
   public int field4514;
   @ObfuscatedName("hd")
   public int field4515;
   @ObfuscatedName("hi")
   public int rootIndex;
   @ObfuscatedName("hg")
   public int cycle;
   @ObfuscatedName("dw")
   public boolean spriteTiling;
   @ObfuscatedName("fo")
   public Object[] onInvTransmit;
   @ObfuscatedName("hx")
   public boolean noScrollThrough;
   @ObfuscatedSignature(descriptor = "Lix;")
   @ObfuscatedName("hc")
   class225 field4442;
   @ObfuscatedName("hn")
   HashMap field4552;
   @ObfuscatedName("by")
   public int buttonType;
   @ObfuscatedName("ca")
   public int spriteId;
   @ObfuscatedName("bi")
   public int type;
   @ObfuscatedName("hy")
   public int[] field4595;
   @ObfuscatedName("hr")
   int[] field4596;
   @ObfuscatedName("hl")
   Object[] field4591;
   @ObfuscatedName("ha")
   int field4548;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field4601 = 100;

   @ObfuscatedSignature(descriptor = "(Lof;Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("up")
   public static String method8119(Widget var0, String var1, int var2) {
      if (var0 == null) {
         var0.method8122(var1, var2);
      }

      try {
         if (11 == var0.type * 928687775 && var0.field4442 != null) {
            if (var2 <= -254588185) {
               throw new IllegalStateException();
            }

            if (var0.method8113((byte)14)) {
               return var0.field4442.method5304(var1, 273409166);
            }

            if (var2 <= -254588185) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "of.bb(" + ')');
      }
   }

   public void setOnKeyListener(Object[] var1) {
      this.onDrag = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)Z")
   @ObfuscatedName("pl")
   public static boolean method8032(Widget var0) {
      return var0.spriteFlipV || var0.spriteFlipH || 0 != var0.outline * 1560590418 || 0 != var0.spriteShadow * 722185787;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ae")
   void decode(Buffer var1, int var2) {
      try {
         var1.readUnsignedByte(1030553836);
         this.isIf3 = true;
         this.type = var1.readUnsignedByte(-1385982060) * -530909857;
         this.contentType = Buffer.method12008(var1, (byte)5) * 198280809;
         this.rawX = var1.readShort((byte)-112) * -1005032755;
         this.rawY = var1.readShort((byte)-2) * -752065015;
         this.rawWidth = Buffer.method12008(var1, (byte)5) * 1403700735;
         if (928687775 * this.type == 9) {
            if (var2 == -452012281) {
               throw new IllegalStateException();
            }

            this.rawHeight = var1.readShort((byte)-119) * 449174585;
         } else {
            this.rawHeight = Buffer.method12008(var1, (byte)5) * 449174585;
         }

         this.widthAlignment = Buffer.method12001(var1, (byte)48) * -1384270729;
         this.heightAlignment = Buffer.method12001(var1, (byte)56) * -500921095;
         this.xAlignment = Buffer.method12001(var1, (byte)54) * -1747850943;
         this.yAlignment = Buffer.method12001(var1, (byte)34) * -1356647925;
         this.parentId = Buffer.method12008(var1, (byte)5) * 155096849;
         if (794900977 * this.parentId == 65535) {
            if (var2 == -452012281) {
               throw new IllegalStateException();
            }

            this.parentId = -155096849;
         } else {
            this.parentId = ((278777747 * this.id & -65536) + 794900977 * this.parentId) * 155096849;
         }

         boolean var10001;
         if (var1.readUnsignedByte(-1117692165) == 1) {
            if (var2 == -452012281) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.isHidden = var10001;
         if (this.type * 928687775 == 0) {
            if (var2 == -452012281) {
               throw new IllegalStateException();
            }

            this.scrollWidth = Buffer.method12008(var1, (byte)5) * 1897778137;
            this.scrollHeight = Buffer.method12008(var1, (byte)5) * 1821115911;
            if (var1.readUnsignedByte(1485282676) == 1) {
               if (var2 == -452012281) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.noClickThrough = var10001;
         }

         if (928687775 * this.type == 5) {
            if (var2 == -452012281) {
               throw new IllegalStateException();
            }

            this.spriteId2 = Buffer.method12015(var1, -254557291) * 2092479471;
            this.spriteAngle = Buffer.method12008(var1, (byte)5) * -795510295;
            if (var1.readUnsignedByte(-750105515) == 1) {
               if (var2 == -452012281) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.spriteTiling = var10001;
            this.transparencyTop = var1.readUnsignedByte(1329333114) * -167855443;
            this.outline = var1.readUnsignedByte(711276708) * 217033705;
            this.spriteShadow = Buffer.method12015(var1, 1602303662) * -1846663581;
            if (var1.readUnsignedByte(-1139170716) == 1) {
               if (var2 == -452012281) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.spriteFlipV = var10001;
            if (var1.readUnsignedByte(1557030051) == 1) {
               if (var2 == -452012281) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.spriteFlipH = var10001;
         }

         if (this.type * 928687775 == 6) {
            if (var2 == -452012281) {
               throw new IllegalStateException();
            }

            this.modelType = -1570196439;
            this.modelId = Buffer.method12008(var1, (byte)5) * -1314816461;
            if (94743803 * this.modelId == 65535) {
               if (var2 == -452012281) {
                  return;
               }

               this.modelId = 1314816461;
            }

            this.modelOffsetX = var1.readShort((byte)-102) * -37619155;
            this.modelOffsetY = var1.readShort((byte)-53) * -1048338377;
            this.modelAngleX = Buffer.method12008(var1, (byte)5) * -1977744073;
            this.modelAngleY = Buffer.method12008(var1, (byte)5) * 676548941;
            this.modelAngleZ = Buffer.method12008(var1, (byte)5) * 132153981;
            this.modelZoom = Buffer.method12008(var1, (byte)5) * 2012543961;
            this.sequenceId = Buffer.method12008(var1, (byte)5) * -12983575;
            if (this.sequenceId * -750054055 == 65535) {
               this.sequenceId = 12983575;
            }

            if (var1.readUnsignedByte(-322023423) == 1) {
               if (var2 == -452012281) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.modelOrthog = var10001;
            Buffer.method12008(var1, (byte)5);
            if (0 != 831546695 * this.widthAlignment) {
               this.field4546 = Buffer.method12008(var1, (byte)5) * -1399881697;
            }

            if (0 != this.heightAlignment * 1876325705) {
               if (var2 == -452012281) {
                  return;
               }

               Buffer.method12008(var1, (byte)5);
            }
         }

         if (4 == this.type * 928687775) {
            if (var2 == -452012281) {
               throw new IllegalStateException();
            }

            this.fontId = Buffer.method12008(var1, (byte)5) * -1824873669;
            if (this.fontId * 137772531 == 65535) {
               if (var2 == -452012281) {
                  throw new IllegalStateException();
               }

               this.fontId = 1824873669;
            }

            this.text = var1.readStringCp1252NullCircumfixed(-2087948413);
            this.textLineHeight = var1.readUnsignedByte(837664598) * -1440610935;
            this.textXAlignment = var1.readUnsignedByte(1150590723) * -563011291;
            this.textYAlignment = var1.readUnsignedByte(1621454921) * 1108485379;
            if (var1.readUnsignedByte(-1462252673) == 1) {
               if (var2 == -452012281) {
                  return;
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.textShadowed = var10001;
            this.color = Buffer.method12015(var1, 1477038909) * -1365603885;
         }

         if (3 == this.type * 928687775) {
            this.color = Buffer.method12015(var1, 1799651934) * -1365603885;
            if (var1.readUnsignedByte(135034056) == 1) {
               if (var2 == -452012281) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.fill = var10001;
            this.transparencyTop = var1.readUnsignedByte(-253452200) * -167855443;
         }

         if (9 == this.type * 928687775) {
            if (var2 == -452012281) {
               throw new IllegalStateException();
            }

            this.lineWid = var1.readUnsignedByte(-290492206) * -249010551;
            this.color = Buffer.method12015(var1, 121550827) * -1365603885;
            if (var1.readUnsignedByte(1557307810) == 1) {
               if (var2 == -452012281) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.field4526 = var10001;
         }

         this.flags = var1.readMedium(-8895894) * 2118307309;
         this.dataText = var1.readStringCp1252NullCircumfixed(722774590);
         int var3 = var1.readUnsignedByte(1072287517);
         if (var3 > 0) {
            this.actions = new String[var3];

            for (int var4 = 0; var4 < var3; var4++) {
               this.actions[var4] = var1.readStringCp1252NullCircumfixed(1658374811);
            }
         }

         this.dragZoneSize = var1.readUnsignedByte(-578107) * 709401353;
         this.dragThreshold = var1.readUnsignedByte(-517885341) * 2011961339;
         if (var1.readUnsignedByte(-214409276) == 1) {
            if (var2 == -452012281) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.isScrollBar = var10001;
         this.spellActionName = var1.readStringCp1252NullCircumfixed(528506994);
         this.field4566 = this.readListener(var1, 362172302);
         this.field4547 = this.readListener(var1, 132290619);
         this.onMiscTransmit = this.readListener(var1, -610331767);
         this.onMouseOver = this.readListener(var1, 188173940);
         this.onChatTransmit = this.readListener(var1, -134070611);
         this.onLoad = this.readListener(var1, -2055997793);
         this.onStatTransmit = this.readListener(var1, -475953363);
         this.onScroll = this.readListener(var1, -1341493916);
         this.onTargetEnter = this.readListener(var1, -578054306);
         this.onClickRepeat = this.readListener(var1, -168366643);
         this.onRelease = this.readListener(var1, -175281034);
         this.onDialogAbort = this.readListener(var1, 1267923202);
         this.onMouseRepeat = this.readListener(var1, 183679136);
         this.field4569 = this.readListener(var1, -1579295146);
         this.onResize = this.readListener(var1, -1487732010);
         this.onOp = this.readListener(var1, -134062336);
         this.field4575 = this.readListener(var1, -1971926131);
         this.onVarTransmit = this.readListener(var1, -1507203567);
         this.varTransmitTriggers = this.readListenerTriggers(var1, (byte)2);
         this.invTransmitTriggers = this.readListenerTriggers(var1, (byte)2);
         this.statTransmitTriggers = this.readListenerTriggers(var1, (byte)2);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "of.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("fi")
   public boolean method8111() {
      return this.field4521 * -163367281 == 2;
   }

   @ObfuscatedSignature(descriptor = "([IB)[I")
   @ObfuscatedName("ag")
   int[] method8000(int[] var1, byte var2) {
      try {
         int[] var10000;
         if (null != var1) {
            if (var2 >= 3) {
               throw new IllegalStateException();
            }

            var10000 = Arrays.copyOf(var1, var1.length);
         } else {
            var10000 = null;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "of.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("an")
   void decodeLegacy(Buffer var1, int var2) {
      try {
         this.isIf3 = false;
         this.type = var1.readUnsignedByte(1973162766) * -530909857;
         this.buttonType = var1.readUnsignedByte(-1148100983) * -1487695159;
         this.contentType = Buffer.method12008(var1, (byte)5) * 198280809;
         this.rawX = var1.readShort((byte)-20) * -1005032755;
         this.rawY = var1.readShort((byte)-111) * -752065015;
         this.rawWidth = Buffer.method12008(var1, (byte)5) * 1403700735;
         this.rawHeight = Buffer.method12008(var1, (byte)5) * 449174585;
         this.transparencyTop = var1.readUnsignedByte(489841485) * -167855443;
         this.parentId = Buffer.method12008(var1, (byte)5) * 155096849;
         if (65535 == this.parentId * 794900977) {
            if (var2 != -1427762751) {
               throw new IllegalStateException();
            }

            this.parentId = -155096849;
         } else {
            this.parentId = 155096849 * (this.parentId * 794900977 + (this.id * 278777747 & -65536));
         }

         this.mouseOverRedirect = Buffer.method12008(var1, (byte)5) * 1715318203;
         if (65535 == 1325862771 * this.mouseOverRedirect) {
            if (var2 != -1427762751) {
               return;
            }

            this.mouseOverRedirect = -1715318203;
         }

         int var3 = var1.readUnsignedByte(1526521644);
         if (var3 > 0) {
            if (var2 != -1427762751) {
               throw new IllegalStateException();
            }

            this.cs1Comparisons = new int[var3];
            this.cs1ComparisonValues = new int[var3];

            for (int var4 = 0; var4 < var3; var4++) {
               if (var2 != -1427762751) {
                  return;
               }

               this.cs1Comparisons[var4] = var1.readUnsignedByte(-88626218);
               this.cs1ComparisonValues[var4] = Buffer.method12008(var1, (byte)5);
            }
         }

         int var9 = var1.readUnsignedByte(899187159);
         if (var9 > 0) {
            if (var2 != -1427762751) {
               throw new IllegalStateException();
            }

            this.cs1Instructions = new int[var9][];

            for (int var5 = 0; var5 < var9; var5++) {
               if (var2 != -1427762751) {
                  throw new IllegalStateException();
               }

               int var6 = Buffer.method12008(var1, (byte)5);
               this.cs1Instructions[var5] = new int[var6];

               for (int var7 = 0; var7 < var6; var7++) {
                  if (var2 != -1427762751) {
                     return;
                  }

                  this.cs1Instructions[var5][var7] = Buffer.method12008(var1, (byte)5);
                  if (65535 == this.cs1Instructions[var5][var7]) {
                     if (var2 != -1427762751) {
                        throw new IllegalStateException();
                     }

                     this.cs1Instructions[var5][var7] = -1;
                  }
               }
            }
         }

         if (this.type * 928687775 == 0) {
            if (var2 != -1427762751) {
               throw new IllegalStateException();
            }

            this.scrollHeight = Buffer.method12008(var1, (byte)5) * 1821115911;
            boolean var10001;
            if (var1.readUnsignedByte(2133422223) == 1) {
               if (var2 != -1427762751) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.isHidden = var10001;
         }

         if (this.type * 928687775 == 1) {
            if (var2 != -1427762751) {
               throw new IllegalStateException();
            }

            Buffer.method12008(var1, (byte)5);
            var1.readUnsignedByte(1907826985);
         }

         if (3 == this.type * 928687775) {
            if (var2 != -1427762751) {
               throw new IllegalStateException();
            }

            boolean var11;
            if (var1.readUnsignedByte(1465072945) == 1) {
               if (var2 != -1427762751) {
                  return;
               }

               var11 = true;
            } else {
               var11 = false;
            }

            this.fill = var11;
         }

         label367: {
            if (928687775 * this.type != 4) {
               if (var2 != -1427762751) {
                  throw new IllegalStateException();
               }

               if (1 != this.type * 928687775) {
                  break label367;
               }

               if (var2 != -1427762751) {
                  throw new IllegalStateException();
               }
            }

            this.textXAlignment = var1.readUnsignedByte(1645514656) * -563011291;
            this.textYAlignment = var1.readUnsignedByte(1877015744) * 1108485379;
            this.textLineHeight = var1.readUnsignedByte(-292586930) * -1440610935;
            this.fontId = Buffer.method12008(var1, (byte)5) * -1824873669;
            if (65535 == 137772531 * this.fontId) {
               if (var2 != -1427762751) {
                  throw new IllegalStateException();
               }

               this.fontId = 1824873669;
            }

            boolean var12;
            if (var1.readUnsignedByte(-1589764977) == 1) {
               if (var2 != -1427762751) {
                  throw new IllegalStateException();
               }

               var12 = true;
            } else {
               var12 = false;
            }

            this.textShadowed = var12;
         }

         if (4 == 928687775 * this.type) {
            if (var2 != -1427762751) {
               throw new IllegalStateException();
            }

            this.text = var1.readStringCp1252NullCircumfixed(-1782032961);
            this.text2 = var1.readStringCp1252NullCircumfixed(-1567921090);
         }

         label323: {
            if (1 != 928687775 * this.type) {
               if (var2 != -1427762751) {
                  return;
               }

               if (3 != this.type * 928687775) {
                  if (var2 != -1427762751) {
                     return;
                  }

                  if (4 != 928687775 * this.type) {
                     break label323;
                  }
               }
            }

            this.color = Buffer.method12015(var1, 1311620941) * -1365603885;
         }

         label315: {
            if (this.type * 928687775 != 3) {
               if (var2 != -1427762751) {
                  throw new IllegalStateException();
               }

               if (4 != 928687775 * this.type) {
                  break label315;
               }

               if (var2 != -1427762751) {
                  throw new IllegalStateException();
               }
            }

            this.color2 = Buffer.method12015(var1, 860098311) * -1017345247;
            this.mouseOverColor = Buffer.method12015(var1, 592386959) * -1160992991;
            this.mouseOverColor2 = Buffer.method12015(var1, 679120679) * -214807625;
         }

         if (5 == this.type * 928687775) {
            this.spriteId2 = Buffer.method12015(var1, 137424930) * 2092479471;
            this.spriteId = Buffer.method12015(var1, 1478960555) * -18433963;
         }

         if (6 == 928687775 * this.type) {
            if (var2 != -1427762751) {
               return;
            }

            this.modelType = -1570196439;
            this.modelId = Buffer.method12008(var1, (byte)5) * -1314816461;
            if (this.modelId * 94743803 == 65535) {
               if (var2 != -1427762751) {
                  throw new IllegalStateException();
               }

               this.modelId = 1314816461;
            }

            this.modelType2 = 1671589439;
            this.modelId2 = Buffer.method12008(var1, (byte)5) * -1849631087;
            if (463905393 * this.modelId2 == 65535) {
               this.modelId2 = 1849631087;
            }

            this.sequenceId = Buffer.method12008(var1, (byte)5) * -12983575;
            if (65535 == this.sequenceId * -750054055) {
               this.sequenceId = 12983575;
            }

            this.sequenceId2 = Buffer.method12008(var1, (byte)5) * 1782708003;
            if (65535 == this.sequenceId2 * 1986719883) {
               if (var2 != -1427762751) {
                  return;
               }

               this.sequenceId2 = -1782708003;
            }

            this.modelZoom = Buffer.method12008(var1, (byte)5) * 2012543961;
            this.modelAngleX = Buffer.method12008(var1, (byte)5) * -1977744073;
            this.modelAngleY = Buffer.method12008(var1, (byte)5) * 676548941;
         }

         if (8 == 928687775 * this.type) {
            if (var2 != -1427762751) {
               return;
            }

            this.text = var1.readStringCp1252NullCircumfixed(1467564689);
         }

         if (this.buttonType * 596322169 == 2) {
            if (var2 != -1427762751) {
               throw new IllegalStateException();
            }

            this.spellActionName = var1.readStringCp1252NullCircumfixed(-1147041576);
            this.field4506 = var1.readStringCp1252NullCircumfixed(2028831102);
            int var10 = Buffer.method12008(var1, (byte)5) & 63;
            this.flags = (-1862035483 * this.flags | var10 << 11) * 2118307309;
         }

         label302: {
            if (1 != this.buttonType * 596322169) {
               if (var2 != -1427762751) {
                  throw new IllegalStateException();
               }

               if (596322169 * this.buttonType != 4) {
                  if (var2 != -1427762751) {
                     return;
                  }

                  if (596322169 * this.buttonType != 5) {
                     if (var2 != -1427762751) {
                        throw new IllegalStateException();
                     }

                     if (this.buttonType * 596322169 != 6) {
                        break label302;
                     }

                     if (var2 != -1427762751) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }

            this.buttonText = var1.readStringCp1252NullCircumfixed(-1849145624);
            if (this.buttonText.isEmpty()) {
               if (this.buttonType * 596322169 == 1) {
                  this.buttonText = Strings.field5110;
               }

               if (this.buttonType * 596322169 == 4) {
                  if (var2 != -1427762751) {
                     throw new IllegalStateException();
                  }

                  this.buttonText = Strings.field4858;
               }

               if (this.buttonType * 596322169 == 5) {
                  this.buttonText = Strings.field4858;
               }

               if (596322169 * this.buttonType == 6) {
                  this.buttonText = Strings.field4859;
               }
            }
         }

         label291: {
            if (this.buttonType * 596322169 != 1) {
               if (var2 != -1427762751) {
                  throw new IllegalStateException();
               }

               if (4 != 596322169 * this.buttonType) {
                  if (var2 != -1427762751) {
                     return;
                  }

                  if (5 != this.buttonType * 596322169) {
                     break label291;
                  }
               }
            }

            this.flags = 2118307309 * (-1862035483 * this.flags | 4194304);
         }

         if (6 == this.buttonType * 596322169) {
            if (var2 != -1427762751) {
               return;
            }

            this.flags = (-1862035483 * this.flags | 1) * 2118307309;
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "of.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Loc;B)Z")
   @ObfuscatedName("bh")
   public boolean method8170(WidgetDefinition var1, byte var2) {
      try {
         classOO var3 = this.method8156(768277378);
         if (var3 == null) {
            if (var2 == 6) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            boolean var4;
            label50: {
               var4 = false;
               if (!var3.method8557((byte)92)) {
                  if (var2 == 6) {
                     throw new IllegalStateException();
                  }

                  if (-1 != this.fontId * 137772531) {
                     int var5 = var3.method8558((byte)-127);
                     int var6 = var3.method8559(-16777216);
                     int var7 = var3.method8550((byte)-75);
                     int var8 = var3.method8549(1757525191);
                     Font var9 = this.getFont(var1, -1094266041);
                     if (null != var9) {
                        if (var2 == 6) {
                           throw new IllegalStateException();
                        }

                        var4 |= var3.method8384(var9, (byte)-3);
                        var4 |= this.method8168(var3, (byte)-27);
                        var4 |= var3.method8401(var5, var6, -786766434);
                        var4 |= classOO.method8450(var3, var7, var8, -1825049792);
                     }
                     break label50;
                  }
               }

               if (var3.method8557((byte)-91)) {
                  if (var2 == 6) {
                     throw new IllegalStateException();
                  }

                  var4 |= this.method8168(var3, (byte)-115);
               }
            }

            var3.method8370(876669541);
            return var4;
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "of.bh(" + ')');
      }
   }

   public int getTargetPriority() {
      return this.targetPriority * 530396407;
   }

   public void setWidth(int var1) {
      this.width = var1 * 1190762213;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("aj")
   void method8009(Buffer var1, int var2) {
      try {
         this.field4486 = var1.readStringCp1252NullCircumfixed(-174021492);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "of.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lei;)V")
   @ObfuscatedName("ev")
   public void method8090(String var1, UrlRequester var2) {
      if (11 == 928687775 * this.type && var1 != null) {
         this.field4442 = new class225();
         this.field4442.method5329(var1, var2, (byte)-81);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("fs")
   public boolean method8112() {
      return this.field4521 * -1348354097 == 2;
   }

   @ObfuscatedSignature(descriptor = "(Loc;ZLei;I)Lxt;")
   @ObfuscatedName("ap")
   public SpritePixels getSprite(WidgetDefinition var1, boolean var2, UrlRequester var3, int var4) {
      if (this.getSpriteId() != -1) {
         net.runelite.api.SpritePixels var5 = (net.runelite.api.SpritePixels)client.field950.get(this.getId());
         if (var5 != null) {
            return (SpritePixels)var5;
         }
      }

      UrlRequester var9 = var3;
      boolean var8 = var2;
      WidgetDefinition var7 = var1;
      Widget var6 = this;
      int var10 = -2067381412;

      try {
         field4598 = false;
         if (var6.field4540 != null) {
            SpritePixels var11 = var6.method8027(var7, var9, (byte)0);
            if (null != var11) {
               if (var10 >= 711995326) {
                  throw new IllegalStateException();
               }

               return var11;
            }
         }

         int var18;
         if (var8) {
            if (var10 >= 711995326) {
               throw new IllegalStateException();
            }

            var18 = 1395688701 * var6.spriteId;
         } else {
            var18 = 79747855 * var6.spriteId2;
         }

         SpritePixels var10000;
         if (var18 == -1) {
            if (var10 >= 711995326) {
               throw new IllegalStateException();
            }

            Object var16 = null;
            var10000 = (SpritePixels)var16;
         } else {
            long var20 = (var6.spriteFlipH ? 1L : 0L) << 39;
            long var10001 = var18 + ((long)(var6.outline * -1211507623) << 36);
            long var10002;
            if (var6.spriteFlipV) {
               if (var10 >= 711995326) {
                  throw new IllegalStateException();
               }

               var10002 = 1L;
            } else {
               var10002 = 0L;
            }

            long var12 = var20 + var10001 + (var10002 << 38) + ((long)(var6.spriteShadow * 771853131) << 40);
            SpritePixels var14 = (SpritePixels)class402.method8806(var7.Widget_cachedSprites, var12);
            if (var14 != null) {
               if (var10 >= 711995326) {
                  throw new IllegalStateException();
               }

               var10000 = var14;
            } else {
               var14 = class387.SpriteBuffer_getSprite(var7.field4409, var18, 0, -2139672119);
               if (var14 == null) {
                  if (var10 >= 711995326) {
                     throw new IllegalStateException();
                  }

                  field4598 = true;
                  Object var17 = null;
                  var10000 = (SpritePixels)var17;
               } else {
                  var6.method8037(var14, (byte)-15);
                  var7.Widget_cachedSprites.put(var14, var12);
                  var10000 = var14;
               }
            }
         }

         return var10000;
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "of.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Loc;Lei;I)Lxt;")
   @ObfuscatedName("au")
   SpritePixels method8028(WidgetDefinition var1, UrlRequester var2, int var3) {
      try {
         if (this.field4540 != null) {
            if (var3 <= 641733023) {
               throw new IllegalStateException();
            }

            if (var2 != null) {
               classOT var4 = (classOT)class498.method10645(var1.field4406, this.field4540, 1934219016);
               if (null == var4) {
                  var4 = new classOT(this.field4540, var2);
                  var1.field4406.method10647(this.field4540, var4, -318891010);
               }

               return var4.method8663((byte)59);
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "of.au(" + ')');
      }
   }

   public void setOnTargetEnterListener(Object[] var1) {
      this.onChatTransmit = var1;
   }

   public void setOnTimerListener(Object[] var1) {
      this.onTargetEnter = var1;
   }

   public void setOnDragListener(Object[] var1) {
      this.onOp = var1;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)Ljava/lang/Object;")
   @ObfuscatedName("ea")
   public Object method8066(int var1, Object var2) {
      for (int var3 = 0; var3 < this.field4548 * -25645663; var3++) {
         if (this.field4596[var3] == var1) {
            return this.field4591[var3];
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("lb")
   public int[] method8191() {
      return this.itemIds;
   }

   @ObfuscatedSignature(descriptor = "(Lxt;B)V")
   @ObfuscatedName("ad")
   void method8037(SpritePixels var1, byte var2) {
      try {
         if (this.spriteFlipV) {
            if (var2 == 65) {
               throw new IllegalStateException();
            }

            var1.flipVertically();
         }

         if (this.spriteFlipH) {
            if (var2 == 65) {
               throw new IllegalStateException();
            }

            var1.flipHorizontally();
         }

         if (-1211507623 * this.outline > 0) {
            if (var2 == 65) {
               throw new IllegalStateException();
            }

            class380.method8274(var1, this.outline * -1211507623);
         }

         if (this.outline * -1211507623 >= 1) {
            if (var2 == 65) {
               throw new IllegalStateException();
            }

            var1.outline(1);
         }

         if (this.outline * -1211507623 >= 2) {
            if (var2 == 65) {
               throw new IllegalStateException();
            }

            var1.outline(16777215);
         }

         if (0 != this.spriteShadow * 771853131) {
            if (var2 == 65) {
               throw new IllegalStateException();
            }

            SpritePixels.method12643(var1, 771853131 * this.spriteShadow);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "of.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Loc;I)Lsu;")
   @ObfuscatedName("ai")
   public Font getFont(WidgetDefinition var1, int var2) {
      try {
         field4598 = false;
         if (this.fontId * 137772531 == -1) {
            if (var2 != -1094266041) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            Font var3 = (Font)class402.method8806(var1.Widget_cachedFonts, this.fontId * 137772531);
            if (var3 != null) {
               if (var2 != -1094266041) {
                  throw new IllegalStateException();
               } else {
                  return var3;
               }
            } else {
               AbstractArchive var5 = var1.field4409;
               AbstractArchive var6 = var1.field4410;
               int var7 = 137772531 * this.fontId;
               Font var4;
               if (!FloorOverlayDefinition.method5355(var5, var7, 0, -1366279867)) {
                  if (var2 != -1094266041) {
                     throw new IllegalStateException();
                  }

                  var4 = null;
               } else {
                  var4 = class181.method4267(var6.getFile(var7, 0, -455417681), 16777215);
               }

               if (var4 != null) {
                  if (var2 != -1094266041) {
                     throw new IllegalStateException();
                  }

                  var1.Widget_cachedFonts.put(var4, this.fontId * 137772531);
               } else {
                  field4598 = true;
               }

               return var4;
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "of.ai(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("po")
   public static String method8120(Widget var0, String var1) {
      return 11 == var0.type * 928687775 && var0.field4442 != null && var0.method8113((byte)14) ? var0.field4442.method5304(var1, -1526041066) : null;
   }

   public void revalidate() {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         SecureUrlRequester.client.method2558(this);
      }
   }

   public void setOnClickListener(Object[] var1) {
      this.onDialogAbort = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)Ljava/lang/String;")
   @ObfuscatedName("dl")
   public static String method8133(Widget var0) {
      if (var0.type * 928687775 == 11 && null != var0.field4442) {
         String var1 = class225.method5317(var0.field4442, (byte)104);

         for (classJO var3 : var0.field4442.method5314(134069302)) {
            String var4 = String.format("%%%S%%", var3.method6146((byte)0));
            if (var3.vmethod194(1088579718) == 0) {
               var1.replaceAll(var4, Integer.toString(var3.vmethod196(497178271)));
            } else {
               var1.replaceAll(var4, var3.vmethod207(1380857227));
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("ah")
   public Widget method8192(int var1) {
      this.itemId = var1 * 1664178957;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Z)Lof;")
   @ObfuscatedName("ra")
   public Widget method8193(boolean var1) {
      this.fill = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Lof;I)Lix;")
   @ObfuscatedName("dl")
   public static class225 method8141(Widget var0, int var1) {
      if (var0 == null) {
         return var0.method8142(var1);
      } else {
         try {
            return var0.field4442;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "of.bu(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Loc;Z)Loz;")
   @ObfuscatedName("dx")
   public SpriteMask method8050(WidgetDefinition var1, boolean var2) {
      if (-1 == this.spriteId * 1395688701) {
         var2 = false;
      }

      int var3 = var2 ? this.spriteId * 1395688701 : 79747855 * this.spriteId2;
      if (var3 == -1) {
         return null;
      } else {
         long var4 = ((this.spriteFlipV ? 1L : 0L) << 38)
            + ((long)(this.outline * -1211507623) << 36)
            + var3
            + ((this.spriteFlipH ? 1L : 0L) << 39)
            + ((long)(this.spriteShadow * 771853131) << 40);
         SpriteMask var6 = (SpriteMask)class402.method8806(var1.Widget_cachedSpriteMasks, var4);
         if (var6 != null) {
            return var6;
         } else {
            SpritePixels var7 = this.getSprite(var1, var2, null, -252611512);
            if (null == var7) {
               return null;
            } else {
               SpritePixels var8 = var7.copyNormalized();
               int[] var9 = new int[var8.subHeight];
               int[] var10 = new int[var8.subHeight];

               for (int var11 = 0; var11 < var8.subHeight; var11++) {
                  int var12 = 0;
                  int var13 = var8.subWidth;

                  for (int var14 = 0; var14 < var8.subWidth; var14++) {
                     if (var8.pixels[var14 + var11 * var8.subWidth] == 0) {
                        var12 = var14;
                        break;
                     }
                  }

                  for (int var16 = var8.subWidth - 1; var16 >= var12; var16--) {
                     if (0 == var8.pixels[var11 * var8.subWidth + var16]) {
                        var13 = 1 + var16;
                        break;
                     }
                  }

                  var9[var11] = var12;
                  var10[var11] = var13 - var12;
               }

               var6 = new SpriteMask(var8.subWidth, var8.subHeight, var10, var9, var3);
               var1.Widget_cachedSpriteMasks.put(var6, var4);
               return var6;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Loc;ZI)Loz;")
   @ObfuscatedName("ac")
   public SpriteMask method8051(WidgetDefinition var1, boolean var2, int var3) {
      try {
         if (-1 == this.spriteId * 1395688701) {
            if (var3 >= -1345332288) {
               throw new IllegalStateException();
            }

            var2 = false;
         }

         int var10000;
         if (var2) {
            if (var3 >= -1345332288) {
               throw new IllegalStateException();
            }

            var10000 = this.spriteId * 1395688701;
         } else {
            var10000 = 79747855 * this.spriteId2;
         }

         int var4 = var10000;
         if (var4 == -1) {
            return null;
         } else {
            long var19;
            if (this.spriteFlipV) {
               if (var3 >= -1345332288) {
                  throw new IllegalStateException();
               }

               var19 = 1L;
            } else {
               var19 = 0L;
            }

            long var5 = (var19 << 38)
               + ((long)(this.outline * -1211507623) << 36)
               + var4
               + ((this.spriteFlipH ? 1L : 0L) << 39)
               + ((long)(this.spriteShadow * 771853131) << 40);
            SpriteMask var7 = (SpriteMask)class402.method8806(var1.Widget_cachedSpriteMasks, var5);
            if (var7 != null) {
               if (var3 >= -1345332288) {
                  throw new IllegalStateException();
               } else {
                  return var7;
               }
            } else {
               SpritePixels var8 = this.getSprite(var1, var2, null, 498296600);
               if (null == var8) {
                  if (var3 >= -1345332288) {
                     throw new IllegalStateException();
                  } else {
                     return null;
                  }
               } else {
                  SpritePixels var9 = var8.copyNormalized();
                  int[] var10 = new int[var9.subHeight];
                  int[] var11 = new int[var9.subHeight];

                  for (int var12 = 0; var12 < var9.subHeight; var12++) {
                     int var13 = 0;
                     int var14 = var9.subWidth;

                     for (int var15 = 0; var15 < var9.subWidth; var15++) {
                        if (var3 >= -1345332288) {
                           throw new IllegalStateException();
                        }

                        if (var9.pixels[var15 + var12 * var9.subWidth] == 0) {
                           var13 = var15;
                           break;
                        }
                     }

                     for (int var18 = var9.subWidth - 1; var18 >= var13; var18--) {
                        if (var3 >= -1345332288) {
                           throw new IllegalStateException();
                        }

                        if (0 == var9.pixels[var12 * var9.subWidth + var18]) {
                           if (var3 >= -1345332288) {
                              throw new IllegalStateException();
                           }

                           var14 = 1 + var18;
                           break;
                        }
                     }

                     var10[var12] = var13;
                     var11[var12] = var14 - var13;
                  }

                  var7 = new SpriteMask(var9.subWidth, var9.subHeight, var11, var10, var4);
                  var1.Widget_cachedSpriteMasks.put(var7, var5);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "of.ac(" + ')');
      }
   }

   public int getOriginalX() {
      return this.rawX * -1022258683;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Loc;Lei;)Lxt;")
   @ObfuscatedName("ms")
   public static SpritePixels method8029(Widget var0, WidgetDefinition var1, UrlRequester var2) {
      if (var0.field4540 != null && var2 != null) {
         classOT var3 = (classOT)class498.method10645(var1.field4406, var0.field4540, 1934219016);
         if (null == var3) {
            var3 = new classOT(var0.field4540, var2);
            var1.field4406.method10647(var0.field4540, var3, -78946032);
         }

         return var3.method8663((byte)72);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gt")
   public void method8151() {
      this.field4554 = new class376();

      for (int var1 = 1; var1 <= 12; var1++) {
         class28.method486(this.field4554.field4679, var1, 0, -759220292);
      }

      for (char var2 = 0; var2 < ' '; var2++) {
         this.field4554.field4679.method488(var2, 0, -371900800);
      }

      this.field4554.field4679.method488('\u0080', 0, -371900800);
      class28.method486(this.field4554.field4679, 82, 2, 1807647244);
      class28.method486(this.field4554.field4679, 81, 2, 4232448);
      class28.method486(this.field4554.field4679, 86, 2, -577198452);
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("bc")
   public Widget method8194(int var1) {
      this.sequenceId = var1 * -12983575;
      return this;
   }

   public int getItemId() {
      return this.itemId * -231674939;
   }

   public int getModelId() {
      return this.modelId * 94743803;
   }

   @ObfuscatedSignature(descriptor = "(IILjava/lang/String;I)V")
   @ObfuscatedName("ax")
   public void method8056(int var1, int var2, String var3, int var4) {
      try {
         label48: {
            if (this.field4536 != null) {
               if (this.field4536.length > var1) {
                  break label48;
               }

               if (var4 <= -1285677508) {
                  throw new IllegalStateException();
               }
            }

            String[][] var5 = new String[var1 + 1][];
            if (this.field4536 != null) {
               System.arraycopy(this.field4536, 0, var5, 0, this.field4536.length);
            }

            this.field4536 = var5;
         }

         if (null == this.field4536[var1] || this.field4536[var1].length <= var2) {
            String[] var7 = new String[var2 + 1];
            if (null != this.field4536[var1]) {
               if (var4 <= -1285677508) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.field4536[var1], 0, var7, 0, this.field4536[var1].length);
            }

            this.field4536[var1] = var7;
         }

         this.field4536[var1][var2] = var3;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "of.ax(" + ')');
      }
   }

   public int getItemQuantityMode() {
      return this.itemQuantityMode * -1574117989;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ct")
   void method8006(Buffer var1) {
      var1.readUnsignedByte(-865816641);
      this.isIf3 = true;
      this.type = var1.readUnsignedByte(-76431378) * -530909857;
      this.contentType = Buffer.method12008(var1, (byte)5) * 198280809;
      this.rawX = var1.readShort((byte)-111) * -1005032755;
      this.rawY = var1.readShort((byte)-121) * -752065015;
      this.rawWidth = Buffer.method12008(var1, (byte)5) * 1403700735;
      if (928687775 * this.type == 9) {
         this.rawHeight = var1.readShort((byte)-32) * 449174585;
      } else {
         this.rawHeight = Buffer.method12008(var1, (byte)5) * 449174585;
      }

      this.widthAlignment = Buffer.method12001(var1, (byte)101) * -1384270729;
      this.heightAlignment = Buffer.method12001(var1, (byte)14) * -500921095;
      this.xAlignment = Buffer.method12001(var1, (byte)7) * -1747850943;
      this.yAlignment = Buffer.method12001(var1, (byte)82) * -1356647925;
      this.parentId = Buffer.method12008(var1, (byte)5) * 155096849;
      if (794900977 * this.parentId == 65535) {
         this.parentId = -155096849;
      } else {
         this.parentId = ((278777747 * this.id & -65536) + 794900977 * this.parentId) * 155096849;
      }

      this.isHidden = var1.readUnsignedByte(166265426) == 1;
      if (this.type * 928687775 == 0) {
         this.scrollWidth = Buffer.method12008(var1, (byte)5) * 1897778137;
         this.scrollHeight = Buffer.method12008(var1, (byte)5) * 1821115911;
         this.noClickThrough = var1.readUnsignedByte(109301468) == 1;
      }

      if (928687775 * this.type == 5) {
         this.spriteId2 = Buffer.method12015(var1, 702048920) * 2092479471;
         this.spriteAngle = Buffer.method12008(var1, (byte)5) * -795510295;
         this.spriteTiling = var1.readUnsignedByte(1424087871) == 1;
         this.transparencyTop = var1.readUnsignedByte(2091716937) * -167855443;
         this.outline = var1.readUnsignedByte(-629689524) * 217033705;
         this.spriteShadow = Buffer.method12015(var1, -703526003) * -1846663581;
         this.spriteFlipV = var1.readUnsignedByte(678133678) == 1;
         this.spriteFlipH = var1.readUnsignedByte(1534006014) == 1;
      }

      if (this.type * 928687775 == 6) {
         this.modelType = -1570196439;
         this.modelId = Buffer.method12008(var1, (byte)5) * -1314816461;
         if (94743803 * this.modelId == 65535) {
            this.modelId = 1314816461;
         }

         this.modelOffsetX = var1.readShort((byte)-58) * -37619155;
         this.modelOffsetY = var1.readShort((byte)-92) * -1048338377;
         this.modelAngleX = Buffer.method12008(var1, (byte)5) * -1977744073;
         this.modelAngleY = Buffer.method12008(var1, (byte)5) * 676548941;
         this.modelAngleZ = Buffer.method12008(var1, (byte)5) * 132153981;
         this.modelZoom = Buffer.method12008(var1, (byte)5) * 2012543961;
         this.sequenceId = Buffer.method12008(var1, (byte)5) * -12983575;
         if (this.sequenceId * -750054055 == 65535) {
            this.sequenceId = 12983575;
         }

         this.modelOrthog = var1.readUnsignedByte(1974946506) == 1;
         Buffer.method12008(var1, (byte)5);
         if (0 != 831546695 * this.widthAlignment) {
            this.field4546 = Buffer.method12008(var1, (byte)5) * -1399881697;
         }

         if (0 != this.heightAlignment * 1876325705) {
            Buffer.method12008(var1, (byte)5);
         }
      }

      if (4 == this.type * 928687775) {
         this.fontId = Buffer.method12008(var1, (byte)5) * -1824873669;
         if (this.fontId * 137772531 == 65535) {
            this.fontId = 1824873669;
         }

         this.text = var1.readStringCp1252NullCircumfixed(942173347);
         this.textLineHeight = var1.readUnsignedByte(2052764208) * -1440610935;
         this.textXAlignment = var1.readUnsignedByte(1354600687) * -563011291;
         this.textYAlignment = var1.readUnsignedByte(1844161915) * 1108485379;
         this.textShadowed = var1.readUnsignedByte(-859898654) == 1;
         this.color = Buffer.method12015(var1, 881634599) * -1365603885;
      }

      if (3 == this.type * 928687775) {
         this.color = Buffer.method12015(var1, 317825407) * -1365603885;
         this.fill = var1.readUnsignedByte(-807265023) == 1;
         this.transparencyTop = var1.readUnsignedByte(714763396) * -167855443;
      }

      if (9 == this.type * 928687775) {
         this.lineWid = var1.readUnsignedByte(-584306484) * -249010551;
         this.color = Buffer.method12015(var1, -300156097) * -1365603885;
         this.field4526 = var1.readUnsignedByte(1628852168) == 1;
      }

      this.flags = var1.readMedium(-1294612792) * 2118307309;
      this.dataText = var1.readStringCp1252NullCircumfixed(1215372040);
      int var2 = var1.readUnsignedByte(-528659145);
      if (var2 > 0) {
         this.actions = new String[var2];

         for (int var3 = 0; var3 < var2; var3++) {
            this.actions[var3] = var1.readStringCp1252NullCircumfixed(1185643913);
         }
      }

      this.dragZoneSize = var1.readUnsignedByte(760752530) * 709401353;
      this.dragThreshold = var1.readUnsignedByte(-970393284) * 2011961339;
      this.isScrollBar = var1.readUnsignedByte(-43975724) == 1;
      this.spellActionName = var1.readStringCp1252NullCircumfixed(-500214251);
      this.field4566 = this.readListener(var1, 257429363);
      this.field4547 = this.readListener(var1, -310715531);
      this.onMiscTransmit = this.readListener(var1, -345335363);
      this.onMouseOver = this.readListener(var1, -162939309);
      this.onChatTransmit = this.readListener(var1, -321282546);
      this.onLoad = this.readListener(var1, -1075397191);
      this.onStatTransmit = this.readListener(var1, -484629655);
      this.onScroll = this.readListener(var1, 200657437);
      this.onTargetEnter = this.readListener(var1, -1321227865);
      this.onClickRepeat = this.readListener(var1, -446026747);
      this.onRelease = this.readListener(var1, 787727797);
      this.onDialogAbort = this.readListener(var1, 788809435);
      this.onMouseRepeat = this.readListener(var1, 1258618278);
      this.field4569 = this.readListener(var1, -246062343);
      this.onResize = this.readListener(var1, 1273998230);
      this.onOp = this.readListener(var1, -1322601533);
      this.field4575 = this.readListener(var1, 1182476534);
      this.onVarTransmit = this.readListener(var1, -2055434129);
      this.varTransmitTriggers = this.readListenerTriggers(var1, (byte)2);
      this.invTransmitTriggers = this.readListenerTriggers(var1, (byte)2);
      this.statTransmitTriggers = this.readListenerTriggers(var1, (byte)2);
   }

   public void setOnVarTransmitListener(Object[] var1) {
      this.onLoad = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("fb")
   public boolean method8105(int var1, int var2, int var3, int var4) {
      if (11 == this.type * 928687775 && this.field4442 != null && this.method8113((byte)14)) {
         var1 -= var3;
         var2 -= var4;
         int var5 = (int)(this.field4442.method5320(-989828645)[0] * (this.width * -1946208531));
         int var6 = (int)(this.field4442.method5320(-365062569)[1] * (-905446999 * this.height));
         int var7 = var5 + (int)(this.field4442.method5320(-988101244)[2] * (-1946208531 * this.width));
         int var8 = var6 + (int)(this.field4442.method5320(-949840868)[3] * (this.height * -905446999));
         return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
      } else {
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Lxa;)[Ljava/lang/Object;")
   @ObfuscatedName("cf")
   public static Object[] method8013(Widget var0, Buffer var1) {
      if (var0 == null) {
         var0.getOnKeyListener();
      }

      int var2 = var1.readUnsignedByte(-1707585100);
      if (0 == var2) {
         return null;
      } else {
         Object[] var3 = new Object[var2];

         for (int var4 = 0; var4 < var2; var4++) {
            int var5 = var1.readUnsignedByte(769549519);
            if (0 == var5) {
               var3[var4] = new Integer(Buffer.method12015(var1, 1198316727));
            } else if (1 == var5) {
               var3[var4] = var1.readStringCp1252NullCircumfixed(1173162351);
            }
         }

         var0.hasListener = true;
         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Loc;Z)Loz;")
   @ObfuscatedName("qq")
   public SpriteMask method8195(WidgetDefinition var1, boolean var2) {
      return this.method8051(var1, var2, -1798200640);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lei;B)V")
   @ObfuscatedName("aa")
   public void method8085(String var1, String var2, String var3, String var4, String var5, UrlRequester var6, byte var7) {
      try {
         this.field4442 = new class225();
         if (!class225.method5285(this.field4442, var1, var3, var6, 1890110648)) {
            if (var7 == 1) {
               throw new IllegalStateException();
            } else {
               this.field4442 = null;
            }
         } else {
            label31: {
               if (this.field4552 != null) {
                  if (var7 == 1) {
                     throw new IllegalStateException();
                  }

                  if (this.field4553 != null) {
                     break label31;
                  }

                  if (var7 == 1) {
                     throw new IllegalStateException();
                  }
               }

               this.method8098((byte)-107);
            }

            this.field4442.method5288(var2, var4, var5, -101184073);
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "of.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lof;")
   @ObfuscatedName("ce")
   public Widget method8196(String var1) {
      this.text = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "()Lbg;")
   @ObfuscatedName("ge")
   public class28 method8161() {
      return null != this.field4554 ? this.field4554.field4679 : null;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bo")
   public void method8099(int var1, int var2, int var3) {
      try {
         if (928687775 * this.type != 11) {
            if (var3 <= -1536675580) {
               throw new IllegalStateException();
            }
         } else {
            if (this.field4552 == null) {
               if (var3 <= -1536675580) {
                  throw new IllegalStateException();
               }

               this.method8098((byte)-36);
            }

            this.field4552.put(var1, var2);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "of.bo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IB)V")
   @ObfuscatedName("bg")
   public void method8101(String var1, int var2, byte var3) {
      try {
         if (928687775 * this.type != 11) {
            if (var3 != 12) {
               throw new IllegalStateException();
            }
         } else {
            if (this.field4553 == null) {
               if (var3 != 12) {
                  throw new IllegalStateException();
               }

               this.method8098((byte)-41);
            }

            this.field4553.put(var1, var2);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "of.bg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)Z")
   @ObfuscatedName("bs")
   public boolean method8106(int var1, int var2, int var3, int var4, int var5) {
      try {
         if (11 == this.type * 928687775) {
            if (var5 >= 193948074) {
               throw new IllegalStateException();
            }

            if (this.field4442 != null) {
               if (this.method8113((byte)14)) {
                  var1 -= var3;
                  var2 -= var4;
                  int var6 = (int)(this.field4442.method5320(-1177334885)[0] * (this.width * -1946208531));
                  int var7 = (int)(this.field4442.method5320(-953047810)[1] * (-905446999 * this.height));
                  int var8 = var6 + (int)(this.field4442.method5320(-1618560602)[2] * (-1946208531 * this.width));
                  int var9 = var7 + (int)(this.field4442.method5320(-956399473)[3] * (this.height * -905446999));
                  if (var1 >= var6) {
                     if (var5 >= 193948074) {
                        throw new IllegalStateException();
                     }

                     if (var2 >= var7) {
                        if (var5 >= 193948074) {
                           throw new IllegalStateException();
                        }

                        if (var1 < var8) {
                           if (var5 >= 193948074) {
                              throw new IllegalStateException();
                           }

                           if (var2 < var9) {
                              if (var5 >= 193948074) {
                                 throw new IllegalStateException();
                              }

                              return true;
                           }
                        }
                     }
                  }

                  return false;
               }

               if (var5 >= 193948074) {
                  throw new IllegalStateException();
               }
            }
         }

         return false;
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "of.bs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("hf")
   public Widget method8197(int var1) {
      this.color = var1 * -1365603885;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("io")
   public void method8198(String var1) {
      this.dataText = var1;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("bz")
   public boolean method8113(byte var1) {
      try {
         return this.field4521 * -1348354097 == 2;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "of.bz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("bk")
   public int method8115(String var1, int var2) {
      try {
         if (this.type * 928687775 == 11) {
            if (var2 >= -2084418733) {
               throw new IllegalStateException();
            }

            if (this.field4442 != null) {
               if (var2 >= -2084418733) {
                  throw new IllegalStateException();
               }

               if (this.method8113((byte)14)) {
                  return this.field4442.method5299(var1, -263959236);
               }
            }
         }

         return -1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "of.bk(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;[I)[I")
   @ObfuscatedName("pc")
   public static int[] method8001(Widget var0, int[] var1) {
      if (var0 == null) {
         var0.getNestedChildren();
      }

      return null != var1 ? Arrays.copyOf(var1, var1.length) : null;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("fh")
   public boolean method8107(int var1, int var2, int var3, int var4) {
      if (11 == this.type * -2130023413 && this.field4442 != null && this.method8113((byte)14)) {
         var1 -= var3;
         var2 -= var4;
         int var5 = (int)(this.field4442.method5320(-1572738615)[0] * (this.width * -1946208531));
         int var6 = (int)(this.field4442.method5320(-1337684221)[1] * (-196791382 * this.height));
         int var7 = var5 + (int)(this.field4442.method5320(-982834376)[2] * (1007490852 * this.width));
         int var8 = var6 + (int)(this.field4442.method5320(-251602138)[3] * (this.height * -905446999));
         return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)V")
   @ObfuscatedName("ab")
   public void setAction(int var1, String var2, int var3) {
      try {
         if (this.actions == null || this.actions.length <= var1) {
            String[] var4 = new String[var1 + 1];
            if (null != this.actions) {
               if (var3 == 751964504) {
                  throw new IllegalStateException();
               }

               for (int var5 = 0; var5 < this.actions.length; var5++) {
                  if (var3 == 751964504) {
                     return;
                  }

                  var4[var5] = this.actions[var5];
               }
            }

            this.actions = var4;
         }

         this.actions[var1] = var2;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "of.ab(" + ')');
      }
   }

   public void setOnMouseRepeatListener(Object[] var1) {
      this.onRelease = var1;
   }

   @ObfuscatedSignature(descriptor = "(Loc;Lei;)Lxt;")
   @ObfuscatedName("cl")
   SpritePixels method8030(WidgetDefinition var1, UrlRequester var2) {
      if (this.field4540 != null && var2 != null) {
         classOT var3 = (classOT)class498.method10645(var1.field4406, this.field4540, 1934219016);
         if (null == var3) {
            var3 = new classOT(this.field4540, var2);
            var1.field4406.method10647(this.field4540, var3, 993295783);
         }

         return var3.method8663((byte)14);
      } else {
         return null;
      }
   }

   public int getModelType() {
      return this.modelType * 2124425241;
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("cx")
   public Widget method8199(int var1) {
      this.itemQuantity = var1 * -1909037165;
      return this;
   }

   public boolean isFlippedHorizontally() {
      return this.spriteFlipH;
   }

   @ObfuscatedSignature(descriptor = "(B)[I")
   @ObfuscatedName("bt")
   public int[] method8137(byte var1) {
      try {
         if (928687775 * this.type == 11) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            if (null != this.field4442) {
               int[] var2 = new int[3];
               int var3 = 0;

               for (classJO var5 : this.field4442.method5314(1236844095)) {
                  if (!var5.method6146((byte)0).equals("user_id")) {
                     if (var1 != 0) {
                        throw new IllegalStateException();
                     }

                     if (var5.vmethod194(723635606) != 0) {
                        return null;
                     }

                     var2[var3++] = var5.vmethod196(497178271);
                     if (var3 > 3) {
                        if (var1 != 0) {
                           throw new IllegalStateException();
                        }

                        return null;
                     }
                  }
               }

               return var2;
            }

            if (var1 != 0) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "of.bt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lof;")
   @ObfuscatedName("pu")
   public Widget method8181(int var1, int var2) {
      return this.method8223(var1).method8231(var2);
   }

   @ObfuscatedSignature(descriptor = "(Loc;Lei;I)Z")
   @ObfuscatedName("ba")
   public boolean method8143(WidgetDefinition var1, UrlRequester var2, int var3) {
      try {
         if (928687775 * this.type == 11) {
            if (var3 == -1348354097) {
               throw new IllegalStateException();
            }

            if (this.field4442 != null) {
               this.field4442.method5290(var2, -1589921768);
               if (this.field4442.method5295(333565326) != this.field4521 * -1348354097) {
                  if (var3 == -1348354097) {
                     throw new IllegalStateException();
                  }

                  this.field4521 = this.field4442.method5295(333565326) * 61269807;
                  if (this.field4521 * -1348354097 >= 3) {
                     if (var3 == -1348354097) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }

                  if (2 == this.field4521 * -1348354097) {
                     if (var3 == -1348354097) {
                        throw new IllegalStateException();
                     }

                     this.method8147(var1, (byte)0);
                     return true;
                  }
               }

               return false;
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "of.ba(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)Z")
   @ObfuscatedName("ta")
   public static boolean method8058(Widget var0) {
      return !var0.isIf3
         || 0 == 928687775 * var0.type
         || var0.type * 928687775 == 11
         || var0.hasListener
         || -1065929375 == var0.contentType * 1889823193
         || 928687775 * var0.type == 12;
   }

   public void setAction(int var1, String var2) {
      this.setAction(var1, var2, -512958560);
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("tj")
   public Widget method8200(int var1) {
      this.scrollHeight = var1 * 1821115911;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Loc;B)V")
   @ObfuscatedName("bi")
   void method8147(WidgetDefinition var1, byte var2) {
      try {
         this.noClickThrough = true;
         ArrayList var3 = this.field4442.method5310(-1138993808);
         ArrayList var4 = class225.method5312(this.field4442, -831431038);
         int var5 = var3.size() + var4.size();
         this.children = new Widget[var5];
         int var6 = 0;

         for (class226 var8 : var3) {
            Widget var9 = WorldMapRectangle.method7260(5, this, var6, 0, 0, 0, 0, var8.field2774, -175760280);
            var9.field4540 = var8.field2777.method3932(-218505900);
            classOT var10 = new classOT(var8.field2777);
            var1.field4406.method10647(var9.field4540, var10, 536479282);
            this.children[var6++] = var9;
         }

         Iterator var12 = var4.iterator();

         while (var12.hasNext()) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            class237 var13 = (class237)var12.next();
            Widget var14 = WorldMapRectangle.method7260(4, this, var6, 0, 0, 0, 0, var13.field2822, 273052371);
            var14.text = var13.field2828;
            var14.fontId = (Integer)this.field4552.get(46220593 * var13.field2821) * -1824873669;
            var14.textXAlignment = var13.field2819 * 882394383;
            var14.textYAlignment = -747353673 * var13.field2820;
            this.children[var6++] = var14;
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "of.bi(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("uh")
   public void method8201(boolean var1) {
      this.isIf3 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("by")
   public void method8152(int var1) {
      try {
         this.field4554 = new class376();

         for (int var2 = 1; var2 <= 12; var2++) {
            class28.method486(this.field4554.field4679, var2, 0, -1607507796);
         }

         for (char var4 = 0; var4 < ' '; var4++) {
            this.field4554.field4679.method488(var4, 0, -371900800);
         }

         this.field4554.field4679.method488('\u0080', 0, -371900800);
         class28.method486(this.field4554.field4679, 82, 2, -377326836);
         class28.method486(this.field4554.field4679, 81, 2, -251952935);
         class28.method486(this.field4554.field4679, 86, 2, 880288667);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "of.by(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Loo;")
   @ObfuscatedName("bw")
   public classOO method8156(int var1) {
      try {
         return null != this.field4554 ? this.field4554.field4678 : null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "of.bw(" + ')');
      }
   }

   public boolean isSelfHidden() {
      return this.isHidden;
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("dj")
   public Widget method8202(int var1) {
      this.modelAngleZ = var1 * 132153981;
      return this;
   }

   public net.runelite.api.widgets.Widget getDragParent() {
      return this.parent;
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("mt")
   public Widget method8203(int var1) {
      this.xAlignment = var1 * -1747850943;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(S)Lom;")
   @ObfuscatedName("bf")
   public class372 method8158(short var1) {
      try {
         class372 var10000;
         if (null != this.field4554) {
            if (var1 != 16256) {
               throw new IllegalStateException();
            }

            var10000 = this.field4554.field4677;
         } else {
            var10000 = null;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "of.bf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)[I")
   @ObfuscatedName("ci")
   int[] method8017(Buffer var1) {
      int var2 = var1.readUnsignedByte(418647829);
      if (var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];

         for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = Buffer.method12015(var1, 1210153858);
         }

         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lop;")
   @ObfuscatedName("bd")
   public class376 method8164(byte var1) {
      try {
         return this.field4554;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "of.bd(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)[Ljava/lang/Object;")
   @ObfuscatedName("cx")
   Object[] method8014(Buffer var1) {
      int var2 = var1.readUnsignedByte(1639412);
      if (0 == var2) {
         return null;
      } else {
         Object[] var3 = new Object[var2];

         for (int var4 = 0; var4 < var2; var4++) {
            int var5 = var1.readUnsignedByte(-962324348);
            if (0 == var5) {
               var3[var4] = new Integer(Buffer.method12015(var1, -1020611629));
            } else if (1 == var5) {
               var3[var4] = var1.readStringCp1252NullCircumfixed(-1781822049);
            }
         }

         this.hasListener = true;
         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("zy")
   public Widget method8204(int var1) {
      this.itemQuantityMode = var1 * 1927430291;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Loa;ZI)V")
   @ObfuscatedName("bl")
   public void method8172(PlayerComposition var1, boolean var2, int var3) {
      try {
         this.modelType = 1893526815;
         this.field4497 = new PlayerComposition(var1);
         if (!var2) {
            if (var3 >= -1595015587) {
               throw new IllegalStateException();
            }

            this.field4497.equipment = Arrays.copyOf(this.field4497.field4383, this.field4497.field4383.length);
            this.field4497.method7922((byte)25);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "of.bl(" + ')');
      }
   }

   public Object[] getOnVarTransmitListener() {
      return this.onLoad;
   }

   @ObfuscatedSignature(descriptor = "(Z)Lof;")
   @ObfuscatedName("ef")
   public Widget method8205(boolean var1) {
      this.textShadowed = var1;
      return this;
   }

   public Widget(Widget var1) {
      this.field4431 = -1;
      this.field4432 = -1;
      this.field4433 = -1;
      this.isIf3 = false;
      this.id = 1191270757;
      this.childIndex = -1657618603;
      this.buttonType = 0;
      this.contentType = 0;
      this.xAlignment = 0;
      this.yAlignment = 0;
      this.widthAlignment = 0;
      this.heightAlignment = 0;
      this.rawX = 0;
      this.rawY = 0;
      this.rawWidth = 0;
      this.rawHeight = 0;
      this.x = 0;
      this.method8177(-1);
      this.y = 0;
      this.method8180(-1);
      this.width = 0;
      this.height = 0;
      this.field4448 = 267374833;
      this.field4449 = 832576307;
      this.parentId = -155096849;
      this.field4451 = -912203661;
      this.isHidden = false;
      this.field4453 = -1930631033;
      this.field4454 = 0;
      this.scrollX = 0;
      this.scrollY = 0;
      this.scrollWidth = 0;
      this.scrollHeight = 0;
      this.color = 0;
      this.color2 = 0;
      this.mouseOverColor = 0;
      this.mouseOverColor2 = 0;
      this.fill = false;
      this.fillMode = FillMode.SOLID;
      this.transparencyTop = 0;
      this.transparencyBot = 0;
      this.lineWid = -249010551;
      this.field4526 = false;
      this.spriteId2 = -2092479471;
      this.spriteId = 18433963;
      this.spriteAngle = 0;
      this.spriteTiling = false;
      this.outline = 0;
      this.spriteShadow = 0;
      this.modelType = -1570196439;
      this.modelId = 1314816461;
      this.modelType2 = 1671589439;
      this.modelId2 = 1849631087;
      this.sequenceId = 12983575;
      this.sequenceId2 = -1782708003;
      this.modelOffsetX = 0;
      this.modelOffsetY = 0;
      this.modelAngleX = 0;
      this.modelAngleY = 0;
      this.modelAngleZ = 0;
      this.modelZoom = -609066812;
      this.field4546 = 0;
      this.field4473 = 0;
      this.modelOrthog = false;
      this.modelTransparency = false;
      this.itemQuantityMode = -440106714;
      this.fontId = 1824873669;
      this.text = "";
      this.text2 = "";
      this.textLineHeight = 0;
      this.textXAlignment = 0;
      this.textYAlignment = 0;
      this.textShadowed = false;
      this.flags = 0;
      this.field4460 = false;
      this.dataText = "";
      this.targetPriority = 1300706076;
      this.parent = null;
      this.dragZoneSize = 0;
      this.dragThreshold = 0;
      this.isScrollBar = false;
      this.spellActionName = "";
      this.hasListener = false;
      this.mouseOverRedirect = -1715318203;
      this.field4506 = "";
      this.buttonText = Strings.field5110;
      this.itemId = -1664178957;
      this.itemQuantity = 0;
      this.modelFrame = 0;
      this.modelFrameCycle = 0;
      this.field4571 = false;
      this.field4511 = false;
      this.field4512 = -1105714163;
      this.field4513 = 0;
      this.field4514 = 0;
      this.field4515 = 0;
      this.rootIndex = -1337068023;
      this.cycle = 1912289617;
      this.noClickThrough = false;
      this.noScrollThrough = false;
      this.prioritizeMenuEntry = false;
      this.field4521 = -61269807;
      this.isIf3 = var1.isIf3;
      this.id = var1.id * 1;
      this.childIndex = var1.childIndex * 1;
      this.field4486 = var1.field4486;
      this.type = var1.type * 1;
      this.buttonType = 1 * var1.buttonType;
      this.contentType = 1 * var1.contentType;
      this.xAlignment = var1.xAlignment * 1;
      this.yAlignment = 1 * var1.yAlignment;
      this.widthAlignment = 1 * var1.widthAlignment;
      this.heightAlignment = 1 * var1.heightAlignment;
      this.rawX = 1 * var1.rawX;
      this.rawY = 1 * var1.rawY;
      this.rawWidth = 1 * var1.rawWidth;
      this.rawHeight = var1.rawHeight * 1;
      this.x = 1 * var1.x;
      this.method8177(-1);
      this.y = 1 * var1.y;
      this.method8180(-1);
      this.width = var1.width * 1;
      this.height = var1.height * 1;
      this.field4448 = var1.field4448 * 1;
      this.field4449 = var1.field4449 * 1;
      this.parentId = 1 * var1.parentId;
      this.field4451 = 1 * var1.field4451;
      this.field4453 = 1 * var1.field4453;
      this.field4454 = var1.field4454 * 1;
      this.isHidden = var1.isHidden;
      this.scrollX = 1 * var1.scrollX;
      this.scrollY = 1 * var1.scrollY;
      this.scrollWidth = 1 * var1.scrollWidth;
      this.scrollHeight = 1 * var1.scrollHeight;
      this.color = var1.color * 1;
      this.color2 = 1 * var1.color2;
      this.mouseOverColor = 1 * var1.mouseOverColor;
      this.mouseOverColor2 = var1.mouseOverColor2 * 1;
      this.fill = var1.fill;
      this.fillMode = var1.fillMode;
      this.transparencyTop = 1 * var1.transparencyTop;
      this.transparencyBot = 1 * var1.transparencyBot;
      this.lineWid = 1 * var1.lineWid;
      this.field4526 = var1.field4526;
      this.spriteId2 = 1 * var1.spriteId2;
      this.spriteId = 1 * var1.spriteId;
      this.field4540 = var1.field4540;
      this.spriteAngle = 1 * var1.spriteAngle;
      this.spriteTiling = var1.spriteTiling;
      this.outline = 1 * var1.outline;
      this.spriteShadow = var1.spriteShadow * 1;
      this.spriteFlipV = var1.spriteFlipV;
      this.spriteFlipH = var1.spriteFlipH;
      this.modelType = var1.modelType * 1;
      this.modelId = var1.modelId * 1;
      this.modelType2 = 1 * var1.modelType2;
      this.modelId2 = 1 * var1.modelId2;
      this.sequenceId = 1 * var1.sequenceId;
      this.sequenceId2 = var1.sequenceId2 * 1;
      this.modelOffsetX = 1 * var1.modelOffsetX;
      this.modelOffsetY = var1.modelOffsetY * 1;
      this.modelAngleX = 1 * var1.modelAngleX;
      this.modelAngleY = var1.modelAngleY * 1;
      this.modelAngleZ = 1 * var1.modelAngleZ;
      this.modelZoom = 1 * var1.modelZoom;
      this.field4546 = var1.field4546 * 1;
      this.field4473 = 1 * var1.field4473;
      if (null != var1.field4497) {
         this.field4497 = new PlayerComposition(var1.field4497);
      }

      this.modelOrthog = var1.modelOrthog;
      this.modelTransparency = var1.modelTransparency;
      this.itemQuantityMode = var1.itemQuantityMode * 1;
      this.fontId = 1 * var1.fontId;
      this.text = var1.text;
      this.text2 = var1.text2;
      this.textLineHeight = var1.textLineHeight * 1;
      this.textXAlignment = 1 * var1.textXAlignment;
      this.textYAlignment = 1 * var1.textYAlignment;
      this.textShadowed = var1.textShadowed;
      this.field4466 = this.method8000(var1.field4466, (byte)-79);
      this.field4485 = this.method8000(var1.field4485, (byte)-7);
      this.field4550 = this.method8000(var1.field4550, (byte)-47);
      this.field4551 = (String[])method7998(this, var1.field4551, -235863823);
      if (var1.field4442 != null) {
         this.field4442 = new class225(var1.field4442);
      }

      this.field4521 = 1 * var1.field4521;
      this.field4552 = var1.field4552;
      if (null != var1.field4553) {
         this.field4553 = new HashMap();
         this.field4553.putAll(var1.field4553);
      }

      this.field4554 = null;
      this.flags = var1.flags * 1;
      this.field4460 = var1.field4460;
      if (var1.field4557 != null) {
         this.field4557 = new byte[var1.field4557.length][];

         for (int var2 = 0; var2 < var1.field4557.length; var2++) {
            this.field4557[var2] = new byte[var1.field4557[var2].length];
            System.arraycopy(var1.field4557[var2], 0, this.field4557[var2], 0, var1.field4557[var2].length);
         }
      }

      if (var1.field4452 != null) {
         this.field4452 = new byte[var1.field4452.length][];

         for (int var4 = 0; var4 < var1.field4452.length; var4++) {
            this.field4452[var4] = new byte[var1.field4452[var4].length];
            System.arraycopy(var1.field4452[var4], 0, this.field4452[var4], 0, var1.field4452[var4].length);
         }
      }

      this.field4560 = this.method8000(var1.field4560, (byte)-9);
      this.field4561 = this.method8000(var1.field4561, (byte)-17);
      this.dataText = var1.dataText;
      this.actions = (String[])method7998(this, var1.actions, -235863823);
      if (null != var1.field4536) {
         this.field4536 = new String[var1.field4536.length][];

         for (int var5 = 0; var5 < var1.field4536.length; var5++) {
            this.field4536[var5] = new String[var1.field4536[var5].length];
            System.arraycopy(var1.field4536[var5], 0, this.field4536[var5], 0, var1.field4536[var5].length);
         }
      }

      this.targetPriority = 1 * var1.targetPriority;
      this.parent = var1.parent;
      this.dragZoneSize = 1 * var1.dragZoneSize;
      this.dragThreshold = 1 * var1.dragThreshold;
      this.isScrollBar = var1.isScrollBar;
      this.spellActionName = var1.spellActionName;
      this.hasListener = var1.hasListener;
      this.field4566 = var1.field4566;
      this.onDialogAbort = var1.onDialogAbort;
      this.onMouseRepeat = var1.onMouseRepeat;
      this.field4569 = var1.field4569;
      this.onResize = var1.onResize;
      this.field4547 = var1.field4547;
      this.onRelease = var1.onRelease;
      this.onMiscTransmit = var1.onMiscTransmit;
      this.onOp = var1.onOp;
      this.field4575 = var1.field4575;
      this.onChatTransmit = var1.onChatTransmit;
      this.onMouseOver = var1.onMouseOver;
      this.onLoad = var1.onLoad;
      this.varTransmitTriggers = var1.varTransmitTriggers;
      this.onStatTransmit = var1.onStatTransmit;
      this.invTransmitTriggers = var1.invTransmitTriggers;
      this.onScroll = var1.onScroll;
      this.statTransmitTriggers = var1.statTransmitTriggers;
      this.onTargetEnter = var1.onTargetEnter;
      this.onClickRepeat = var1.onClickRepeat;
      this.onClanTransmit = var1.onClanTransmit;
      this.onVarTransmit = var1.onVarTransmit;
      this.onInvTransmit = var1.onInvTransmit;
      this.onDrag = var1.onDrag;
      this.onFriendTransmit = var1.onFriendTransmit;
      this.onClick = var1.onClick;
      this.onKey = var1.onKey;
      this.field4567 = var1.field4567;
      this.onStockTransmit = var1.onStockTransmit;
      this.onMouseLeave = var1.onMouseLeave;
      this.onHold = var1.onHold;
      this.field4587 = var1.field4587;
      this.field4541 = var1.field4541;
      this.onTargetLeave = var1.onTargetLeave;
      this.onSubChange = var1.onSubChange;
      this.onDragComplete = var1.onDragComplete;
      this.onTimer = var1.onTimer;
      this.cs1Instructions = var1.cs1Instructions;
      this.cs1Comparisons = this.method8000(var1.cs1Comparisons, (byte)-38);
      this.cs1ComparisonValues = this.method8000(var1.cs1ComparisonValues, (byte)-37);
      this.mouseOverRedirect = 1 * var1.mouseOverRedirect;
      this.field4506 = var1.field4506;
      this.buttonText = var1.buttonText;
      this.itemIds = this.method8000(var1.itemIds, (byte)-87);
      this.itemQuantities = this.method8000(var1.itemQuantities, (byte)-49);
      this.itemId = var1.itemId * 1;
      this.itemQuantity = var1.itemQuantity * 1;
      this.modelFrame = 1 * var1.modelFrame;
      this.modelFrameCycle = var1.modelFrameCycle * 1;
      if (null != var1.children) {
         this.children = new Widget[var1.children.length];

         for (int var6 = 0; var6 < var1.children.length; var6++) {
            this.children[var6] = new Widget(var1.children[var6]);
         }
      }

      this.field4571 = var1.field4571;
      this.field4511 = var1.field4511;
      this.field4512 = 1 * var1.field4512;
      this.field4513 = 1 * var1.field4513;
      this.field4514 = var1.field4514 * 1;
      this.field4515 = var1.field4515 * 1;
      this.rootIndex = 1 * var1.rootIndex;
      this.cycle = var1.cycle * 1;
      this.field4595 = this.method8000(var1.field4595, (byte)-5);
      this.noClickThrough = var1.noClickThrough;
      this.noScrollThrough = var1.noScrollThrough;
      this.prioritizeMenuEntry = var1.prioritizeMenuEntry;
      if (var1.field4548 * -25645663 > 0) {
         this.field4596 = this.method8000(var1.field4596, (byte)-90);
         this.field4591 = method7998(this, var1.field4591, -235863823);
         this.field4548 = 1 * var1.field4548;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("rn")
   public Widget method8206(int var1) {
      this.transparencyTop = var1 * -167855443;
      return this;
   }

   public void setOnTargetLeaveListener(Object[] var1) {
      this.onMouseOver = var1;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("ej")
   public void method8072(int var1, Object var2) {
      for (int var3 = 0; var3 < this.field4548 * -25645663; var3++) {
         if (var1 == this.field4596[var3]) {
            this.field4591[var3] = var2;
            return;
         }
      }

      if (null == this.field4591) {
         this.field4596 = new int[4];
         this.field4591 = new Object[4];
      } else if (-25645663 * this.field4548 == this.field4591.length) {
         this.field4596 = Arrays.copyOf(this.field4596, 2 * this.field4596.length);
         this.field4591 = Arrays.copyOf(this.field4591, 2 * this.field4591.length);
      }

      this.field4596[this.field4548 * -25645663] = var1;
      this.field4591[-25645663 * this.field4548] = var2;
      this.field4548 += 528381537;
   }

   @ObfuscatedSignature(descriptor = "()Lxg;")
   @ObfuscatedName("ef")
   public FillMode method8207() {
      return this.fillMode;
   }

   public void setOnOpListener(Object[] var1) {
      this.onClickRepeat = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILof;IIIII[F)Lof;")
   @ObfuscatedName("bq")
   static Widget method7993(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      Widget var8 = new Widget();
      var8.type = var0 * -530909857;
      var8.parentId = var1.id * -1601929789;
      var8.childIndex = var2 * 1657618603;
      var8.isIf3 = true;
      var8.xAlignment = -1747850943 * var3;
      var8.yAlignment = -1356647925 * var4;
      var8.widthAlignment = var5 * -1384270729;
      var8.heightAlignment = var6 * -500921095;
      var8.rawX = -1005032755 * (int)(var7[0] * (-1946208531 * var1.width));
      var8.rawY = -752065015 * (int)(var1.height * -905446999 * var7[1]);
      var8.rawWidth = (int)(-1946208531 * var1.width * var7[2]) * 1403700735;
      var8.rawHeight = 449174585 * (int)(-905446999 * var1.height * var7[3]);
      return var8;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILof;IIIII[F)Lof;")
   @ObfuscatedName("bx")
   static Widget method7994(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      Widget var8 = new Widget();
      var8.type = var0 * -530909857;
      var8.parentId = var1.id * -1601929789;
      var8.childIndex = var2 * 1657618603;
      var8.isIf3 = true;
      var8.xAlignment = -1747850943 * var3;
      var8.yAlignment = -1356647925 * var4;
      var8.widthAlignment = var5 * -1384270729;
      var8.heightAlignment = var6 * -500921095;
      var8.rawX = -1005032755 * (int)(var7[0] * (-1946208531 * var1.width));
      var8.rawY = -752065015 * (int)(var1.height * -905446999 * var7[1]);
      var8.rawWidth = (int)(-1946208531 * var1.width * var7[2]) * 1403700735;
      var8.rawHeight = 449174585 * (int)(-905446999 * var1.height * var7[3]);
      return var8;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;")
   @ObfuscatedName("bv")
   Object[] method7996(Object[] var1) {
      return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmg;Lmd;)V")
   @ObfuscatedName("is")
   public static void method7992(DemotingHashTable var0, Wrapper var1) {
      if (var0 == null) {
         var0.removeWrapper(var1);
      } else {
         if (var1 != null) {
            var1.remove();
            var1.removeDual();
            var0.remaining = var0.remaining + var1.size;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("kh")
   public void method8177(int var1) {
      if (this.field4432 > -1) {
         this.setRelativeX(this.field4432);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Lof;")
   @ObfuscatedName("lo")
   public Widget method8104(int var1, int var2, int var3, int var4) {
      return this.method8233(var1).method8216(var2).method8224(var3).method8222(var4);
   }

   public Object[] getOnInvTransmitListener() {
      return this.onStatTransmit;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   public void method8182(int var1) {
      this.field4429 = var1;
   }

   public void setFlippedHorizontally(boolean var1) {
      this.spriteFlipH = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("cb")
   void method8003(Buffer var1) {
      this.isIf3 = false;
      this.type = var1.readUnsignedByte(1143565089) * -530909857;
      this.buttonType = var1.readUnsignedByte(2026538564) * -1487695159;
      this.contentType = Buffer.method12008(var1, (byte)5) * 1335832243;
      this.rawX = var1.readShort((byte)-96) * -671345145;
      this.rawY = var1.readShort((byte)-110) * -752065015;
      this.rawWidth = Buffer.method12008(var1, (byte)5) * 1745177904;
      this.rawHeight = Buffer.method12008(var1, (byte)5) * 773935923;
      this.transparencyTop = var1.readUnsignedByte(-982603862) * -1642689861;
      this.parentId = Buffer.method12008(var1, (byte)5) * 155096849;
      if (875818030 == this.parentId * -1322092949) {
         this.parentId = -155096849;
      } else {
         this.parentId = 1337917436 * (this.parentId * 794900977 + (this.id * -404763472 & 1612820291));
      }

      this.mouseOverRedirect = Buffer.method12008(var1, (byte)5) * -931189659;
      if (782346311 == 140215486 * this.mouseOverRedirect) {
         this.mouseOverRedirect = 2098475602;
      }

      int var2 = var1.readUnsignedByte(1684937970);
      if (var2 > 0) {
         this.cs1Comparisons = new int[var2];
         this.cs1ComparisonValues = new int[var2];

         for (int var3 = 0; var3 < var2; var3++) {
            this.cs1Comparisons[var3] = var1.readUnsignedByte(1593395553);
            this.cs1ComparisonValues[var3] = Buffer.method12008(var1, (byte)5);
         }
      }

      int var7 = var1.readUnsignedByte(1928945826);
      if (var7 > 0) {
         this.cs1Instructions = new int[var7][];

         for (int var4 = 0; var4 < var7; var4++) {
            int var5 = Buffer.method12008(var1, (byte)5);
            this.cs1Instructions[var4] = new int[var5];

            for (int var6 = 0; var6 < var5; var6++) {
               this.cs1Instructions[var4][var6] = Buffer.method12008(var1, (byte)5);
               if (65535 == this.cs1Instructions[var4][var6]) {
                  this.cs1Instructions[var4][var6] = -1;
               }
            }
         }
      }

      if (this.type * 635812730 == 0) {
         this.scrollHeight = Buffer.method12008(var1, (byte)5) * 1821115911;
         this.isHidden = var1.readUnsignedByte(1836287044) == 1;
      }

      if (this.type * 928687775 == 1) {
         Buffer.method12008(var1, (byte)5);
         var1.readUnsignedByte(377528566);
      }

      if (3 == this.type * 928687775) {
         this.fill = var1.readUnsignedByte(-910828204) == 1;
      }

      if (1985923545 * this.type == 4 || 1 == this.type * 835705334) {
         this.textXAlignment = var1.readUnsignedByte(365888977) * 1501729839;
         this.textYAlignment = var1.readUnsignedByte(-184570031) * -213440453;
         this.textLineHeight = var1.readUnsignedByte(-226626800) * -1373641410;
         this.fontId = Buffer.method12008(var1, (byte)5) * 1525181127;
         if (65535 == 137772531 * this.fontId) {
            this.fontId = 1824873669;
         }

         this.textShadowed = var1.readUnsignedByte(578870258) == 1;
      }

      if (4 == 928687775 * this.type) {
         this.text = var1.readStringCp1252NullCircumfixed(-1622230312);
         this.text2 = var1.readStringCp1252NullCircumfixed(213421872);
      }

      if (1 == 928687775 * this.type || 3 == this.type * -523665334 || 4 == 928687775 * this.type) {
         this.color = Buffer.method12015(var1, 614552313) * -1365603885;
      }

      if (this.type * 928687775 == 3 || 4 == 490417050 * this.type) {
         this.color2 = Buffer.method12015(var1, 526391484) * -676412817;
         this.mouseOverColor = Buffer.method12015(var1, -44247500) * -1160992991;
         this.mouseOverColor2 = Buffer.method12015(var1, -16179067) * 1983564102;
      }

      if (5 == this.type * 1264600792) {
         this.spriteId2 = Buffer.method12015(var1, 333190230) * 741251715;
         this.spriteId = Buffer.method12015(var1, -989168011) * -18433963;
      }

      if (6 == -2135856644 * this.type) {
         this.modelType = 538752459;
         this.modelId = Buffer.method12008(var1, (byte)5) * -1314816461;
         if (this.modelId * 94743803 == 65535) {
            this.modelId = 1314816461;
         }

         this.modelType2 = -684772488;
         this.modelId2 = Buffer.method12008(var1, (byte)5) * 1474108774;
         if (1650848276 * this.modelId2 == 65535) {
            this.modelId2 = -297528641;
         }

         this.sequenceId = Buffer.method12008(var1, (byte)5) * -680788418;
         if (65535 == this.sequenceId * -750054055) {
            this.sequenceId = 12983575;
         }

         this.sequenceId2 = Buffer.method12008(var1, (byte)5) * -1942912531;
         if (65535 == this.sequenceId2 * 1986719883) {
            this.sequenceId2 = -1782708003;
         }

         this.modelZoom = Buffer.method12008(var1, (byte)5) * 1129373078;
         this.modelAngleX = Buffer.method12008(var1, (byte)5) * -1977744073;
         this.modelAngleY = Buffer.method12008(var1, (byte)5) * -112579228;
      }

      if (8 == 1495331309 * this.type) {
         this.text = var1.readStringCp1252NullCircumfixed(264108434);
      }

      if (this.buttonType * 1407436182 == 2) {
         this.spellActionName = var1.readStringCp1252NullCircumfixed(-146848162);
         this.field4506 = var1.readStringCp1252NullCircumfixed(33309985);
         int var8 = Buffer.method12008(var1, (byte)5) & 63;
         this.flags = (-1828624613 * this.flags | var8 << 11) * 2118307309;
      }

      if (1 == this.buttonType * 596322169 || 596322169 * this.buttonType == 4 || -489731056 * this.buttonType == 5 || this.buttonType * 596322169 == 6) {
         this.buttonText = var1.readStringCp1252NullCircumfixed(-202416815);
         if (this.buttonText.isEmpty()) {
            if (this.buttonType * -409118107 == 1) {
               this.buttonText = Strings.field5110;
            }

            if (this.buttonType * 2108895774 == 4) {
               this.buttonText = Strings.field4858;
            }

            if (this.buttonType * 596322169 == 5) {
               this.buttonText = Strings.field4858;
            }

            if (1614602506 * this.buttonType == 6) {
               this.buttonText = Strings.field4859;
            }
         }
      }

      if (this.buttonType * 596322169 == 1 || 4 == 596322169 * this.buttonType || 5 == this.buttonType * -854962246) {
         this.flags = 2118307309 * (-1178313855 * this.flags | 247316877);
      }

      if (6 == this.buttonType * 596322169) {
         this.flags = (-1862035483 * this.flags | 1) * 2118307309;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("cs")
   void method8004(Buffer var1) {
      this.isIf3 = false;
      this.type = var1.readUnsignedByte(-145000563) * -530909857;
      this.buttonType = var1.readUnsignedByte(747868241) * -1487695159;
      this.contentType = Buffer.method12008(var1, (byte)5) * 198280809;
      this.rawX = var1.readShort((byte)-44) * -1005032755;
      this.rawY = var1.readShort((byte)-75) * -752065015;
      this.rawWidth = Buffer.method12008(var1, (byte)5) * 1403700735;
      this.rawHeight = Buffer.method12008(var1, (byte)5) * 449174585;
      this.transparencyTop = var1.readUnsignedByte(530689445) * -167855443;
      this.parentId = Buffer.method12008(var1, (byte)5) * 155096849;
      if (65535 == this.parentId * 794900977) {
         this.parentId = -155096849;
      } else {
         this.parentId = 155096849 * (this.parentId * 794900977 + (this.id * 278777747 & -65536));
      }

      this.mouseOverRedirect = Buffer.method12008(var1, (byte)5) * 1715318203;
      if (65535 == 1325862771 * this.mouseOverRedirect) {
         this.mouseOverRedirect = -1715318203;
      }

      int var2 = var1.readUnsignedByte(-1112736136);
      if (var2 > 0) {
         this.cs1Comparisons = new int[var2];
         this.cs1ComparisonValues = new int[var2];

         for (int var3 = 0; var3 < var2; var3++) {
            this.cs1Comparisons[var3] = var1.readUnsignedByte(1032641065);
            this.cs1ComparisonValues[var3] = Buffer.method12008(var1, (byte)5);
         }
      }

      int var7 = var1.readUnsignedByte(1524723222);
      if (var7 > 0) {
         this.cs1Instructions = new int[var7][];

         for (int var4 = 0; var4 < var7; var4++) {
            int var5 = Buffer.method12008(var1, (byte)5);
            this.cs1Instructions[var4] = new int[var5];

            for (int var6 = 0; var6 < var5; var6++) {
               this.cs1Instructions[var4][var6] = Buffer.method12008(var1, (byte)5);
               if (65535 == this.cs1Instructions[var4][var6]) {
                  this.cs1Instructions[var4][var6] = -1;
               }
            }
         }
      }

      if (this.type * 928687775 == 0) {
         this.scrollHeight = Buffer.method12008(var1, (byte)5) * 1821115911;
         this.isHidden = var1.readUnsignedByte(1920497479) == 1;
      }

      if (this.type * 928687775 == 1) {
         Buffer.method12008(var1, (byte)5);
         var1.readUnsignedByte(-1465109272);
      }

      if (3 == this.type * 928687775) {
         this.fill = var1.readUnsignedByte(912894395) == 1;
      }

      if (928687775 * this.type == 4 || 1 == this.type * 928687775) {
         this.textXAlignment = var1.readUnsignedByte(-1030561648) * -563011291;
         this.textYAlignment = var1.readUnsignedByte(1459438704) * 1108485379;
         this.textLineHeight = var1.readUnsignedByte(2059305926) * -1440610935;
         this.fontId = Buffer.method12008(var1, (byte)5) * -1824873669;
         if (65535 == 137772531 * this.fontId) {
            this.fontId = 1824873669;
         }

         this.textShadowed = var1.readUnsignedByte(2047716839) == 1;
      }

      if (4 == 928687775 * this.type) {
         this.text = var1.readStringCp1252NullCircumfixed(-385371463);
         this.text2 = var1.readStringCp1252NullCircumfixed(1647197569);
      }

      if (1 == 928687775 * this.type || 3 == this.type * 928687775 || 4 == 928687775 * this.type) {
         this.color = Buffer.method12015(var1, 817956024) * -1365603885;
      }

      if (this.type * 928687775 == 3 || 4 == 928687775 * this.type) {
         this.color2 = Buffer.method12015(var1, 458039258) * -1017345247;
         this.mouseOverColor = Buffer.method12015(var1, 673007415) * -1160992991;
         this.mouseOverColor2 = Buffer.method12015(var1, 2058693955) * -214807625;
      }

      if (5 == this.type * 928687775) {
         this.spriteId2 = Buffer.method12015(var1, 1186722550) * 2092479471;
         this.spriteId = Buffer.method12015(var1, 1587803972) * -18433963;
      }

      if (6 == 928687775 * this.type) {
         this.modelType = -1570196439;
         this.modelId = Buffer.method12008(var1, (byte)5) * -1314816461;
         if (this.modelId * 94743803 == 65535) {
            this.modelId = 1314816461;
         }

         this.modelType2 = 1671589439;
         this.modelId2 = Buffer.method12008(var1, (byte)5) * -1849631087;
         if (463905393 * this.modelId2 == 65535) {
            this.modelId2 = 1849631087;
         }

         this.sequenceId = Buffer.method12008(var1, (byte)5) * -12983575;
         if (65535 == this.sequenceId * -750054055) {
            this.sequenceId = 12983575;
         }

         this.sequenceId2 = Buffer.method12008(var1, (byte)5) * 1782708003;
         if (65535 == this.sequenceId2 * 1986719883) {
            this.sequenceId2 = -1782708003;
         }

         this.modelZoom = Buffer.method12008(var1, (byte)5) * 2012543961;
         this.modelAngleX = Buffer.method12008(var1, (byte)5) * -1977744073;
         this.modelAngleY = Buffer.method12008(var1, (byte)5) * 676548941;
      }

      if (8 == 928687775 * this.type) {
         this.text = var1.readStringCp1252NullCircumfixed(2140457715);
      }

      if (this.buttonType * 596322169 == 2) {
         this.spellActionName = var1.readStringCp1252NullCircumfixed(-619738317);
         this.field4506 = var1.readStringCp1252NullCircumfixed(-299344565);
         int var8 = Buffer.method12008(var1, (byte)5) & 63;
         this.flags = (-1862035483 * this.flags | var8 << 11) * 2118307309;
      }

      if (1 == this.buttonType * 596322169 || 596322169 * this.buttonType == 4 || 596322169 * this.buttonType == 5 || this.buttonType * 596322169 == 6) {
         this.buttonText = var1.readStringCp1252NullCircumfixed(-309272306);
         if (this.buttonText.isEmpty()) {
            if (this.buttonType * 596322169 == 1) {
               this.buttonText = Strings.field5110;
            }

            if (this.buttonType * 596322169 == 4) {
               this.buttonText = Strings.field4858;
            }

            if (this.buttonType * 596322169 == 5) {
               this.buttonText = Strings.field4858;
            }

            if (596322169 * this.buttonType == 6) {
               this.buttonText = Strings.field4859;
            }
         }
      }

      if (this.buttonType * 596322169 == 1 || 4 == 596322169 * this.buttonType || 5 == this.buttonType * 596322169) {
         this.flags = 2118307309 * (-1862035483 * this.flags | 4194304);
      }

      if (6 == this.buttonType * 596322169) {
         this.flags = (-1862035483 * this.flags | 1) * 2118307309;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)[Ljava/lang/Object;")
   @ObfuscatedName("ak")
   Object[] readListener(Buffer var1, int var2) {
      try {
         int var3 = var1.readUnsignedByte(1435328670);
         if (0 == var3) {
            if (var2 >= 1293839821) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            Object[] var4 = new Object[var3];

            for (int var5 = 0; var5 < var3; var5++) {
               if (var2 >= 1293839821) {
                  throw new IllegalStateException();
               }

               int var6 = var1.readUnsignedByte(722855433);
               if (0 == var6) {
                  if (var2 >= 1293839821) {
                     throw new IllegalStateException();
                  }

                  var4[var5] = new Integer(Buffer.method12015(var1, 1527800615));
               } else if (1 == var6) {
                  if (var2 >= 1293839821) {
                     throw new IllegalStateException();
                  }

                  var4[var5] = var1.readStringCp1252NullCircumfixed(1393588269);
               }
            }

            this.hasListener = true;
            return var4;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "of.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Loc;)Z")
   @ObfuscatedName("gr")
   public boolean method8171(WidgetDefinition var1) {
      classOO var2 = this.method8156(756289611);
      if (var2 == null) {
         return false;
      } else {
         boolean var3 = false;
         if (!var2.method8557((byte)13) && -1 != this.fontId * 137772531) {
            int var4 = var2.method8558((byte)-61);
            int var5 = var2.method8559(-16777216);
            int var6 = var2.method8550((byte)83);
            int var7 = var2.method8549(1757525191);
            Font var8 = this.getFont(var1, -1094266041);
            if (null != var8) {
               var3 |= var2.method8384(var8, (byte)-21);
               var3 |= this.method8168(var2, (byte)-86);
               var3 |= var2.method8401(var4, var5, -507345854);
               var3 |= classOO.method8450(var2, var6, var7, -504712449);
            }
         } else if (var2.method8557((byte)-7)) {
            var3 |= this.method8168(var2, (byte)-25);
         }

         var2.method8370(-545656328);
         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "()[Lof;")
   @ObfuscatedName("fp")
   public Widget[] method8208() {
      return this.children;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ck")
   void method8007(Buffer var1) {
      var1.readUnsignedByte(-152466823);
      this.isIf3 = true;
      this.type = var1.readUnsignedByte(432229000) * 2003988326;
      this.contentType = Buffer.method12008(var1, (byte)5) * -278481886;
      this.rawX = var1.readShort((byte)-53) * -1005032755;
      this.rawY = var1.readShort((byte)-41) * 1336071731;
      this.rawWidth = Buffer.method12008(var1, (byte)5) * -454071540;
      if (928687775 * this.type == 9) {
         this.rawHeight = var1.readShort((byte)-102) * -566299946;
      } else {
         this.rawHeight = Buffer.method12008(var1, (byte)5) * -1698802837;
      }

      this.widthAlignment = Buffer.method12001(var1, (byte)83) * -1384270729;
      this.heightAlignment = Buffer.method12001(var1, (byte)22) * -500921095;
      this.xAlignment = Buffer.method12001(var1, (byte)77) * 1524321016;
      this.yAlignment = Buffer.method12001(var1, (byte)21) * -1356647925;
      this.parentId = Buffer.method12008(var1, (byte)5) * 155096849;
      if (-26612578 * this.parentId == 20823498) {
         this.parentId = -155096849;
      } else {
         this.parentId = ((278777747 * this.id & -1400042519) + 541804080 * this.parentId) * 881142216;
      }

      this.isHidden = var1.readUnsignedByte(-1690564431) == 1;
      if (this.type * -637108221 == 0) {
         this.scrollWidth = Buffer.method12008(var1, (byte)5) * -308454759;
         this.scrollHeight = Buffer.method12008(var1, (byte)5) * 1001024456;
         this.noClickThrough = var1.readUnsignedByte(1472352061) == 1;
      }

      if (-855882150 * this.type == 5) {
         this.spriteId2 = Buffer.method12015(var1, 828240771) * 2092479471;
         this.spriteAngle = Buffer.method12008(var1, (byte)5) * -795510295;
         this.spriteTiling = var1.readUnsignedByte(-99513065) == 1;
         this.transparencyTop = var1.readUnsignedByte(1943416486) * 1154903209;
         this.outline = var1.readUnsignedByte(-551372684) * 217033705;
         this.spriteShadow = Buffer.method12015(var1, -576907010) * -1846663581;
         this.spriteFlipV = var1.readUnsignedByte(730197183) == 1;
         this.spriteFlipH = var1.readUnsignedByte(-724517101) == 1;
      }

      if (this.type * 644481735 == 6) {
         this.modelType = -25009568;
         this.modelId = Buffer.method12008(var1, (byte)5) * -1314816461;
         if (-234072971 * this.modelId == 2132100888) {
            this.modelId = 1314816461;
         }

         this.modelOffsetX = var1.readShort((byte)-108) * 1297221500;
         this.modelOffsetY = var1.readShort((byte)-47) * -1048338377;
         this.modelAngleX = Buffer.method12008(var1, (byte)5) * -1977744073;
         this.modelAngleY = Buffer.method12008(var1, (byte)5) * 1752200889;
         this.modelAngleZ = Buffer.method12008(var1, (byte)5) * 132153981;
         this.modelZoom = Buffer.method12008(var1, (byte)5) * 776502937;
         this.sequenceId = Buffer.method12008(var1, (byte)5) * 152108290;
         if (this.sequenceId * -750054055 == -1404535647) {
            this.sequenceId = 12983575;
         }

         this.modelOrthog = var1.readUnsignedByte(229687926) == 1;
         Buffer.method12008(var1, (byte)5);
         if (0 != -938436916 * this.widthAlignment) {
            this.field4546 = Buffer.method12008(var1, (byte)5) * 998831659;
         }

         if (0 != this.heightAlignment * 1876325705) {
            Buffer.method12008(var1, (byte)5);
         }
      }

      if (4 == this.type * 1131766976) {
         this.fontId = Buffer.method12008(var1, (byte)5) * -952524240;
         if (this.fontId * 137772531 == -919865640) {
            this.fontId = 733045473;
         }

         this.text = var1.readStringCp1252NullCircumfixed(-969458849);
         this.textLineHeight = var1.readUnsignedByte(823680769) * -746828223;
         this.textXAlignment = var1.readUnsignedByte(-261652647) * -563011291;
         this.textYAlignment = var1.readUnsignedByte(1439198606) * -658244372;
         this.textShadowed = var1.readUnsignedByte(-1091391583) == 1;
         this.color = Buffer.method12015(var1, -875583705) * 1252692622;
      }

      if (3 == this.type * 732656249) {
         this.color = Buffer.method12015(var1, 1610306457) * -1365603885;
         this.fill = var1.readUnsignedByte(1828252025) == 1;
         this.transparencyTop = var1.readUnsignedByte(195766918) * -167855443;
      }

      if (9 == this.type * -1105873945) {
         this.lineWid = var1.readUnsignedByte(147028559) * 404158736;
         this.color = Buffer.method12015(var1, 461190161) * -1365603885;
         this.field4526 = var1.readUnsignedByte(824220256) == 1;
      }

      this.flags = var1.readMedium(-1841156328) * 2118307309;
      this.dataText = var1.readStringCp1252NullCircumfixed(-161171214);
      int var2 = var1.readUnsignedByte(1707658131);
      if (var2 > 0) {
         this.actions = new String[var2];

         for (int var3 = 0; var3 < var2; var3++) {
            this.actions[var3] = var1.readStringCp1252NullCircumfixed(1541555357);
         }
      }

      this.dragZoneSize = var1.readUnsignedByte(397088815) * 709401353;
      this.dragThreshold = var1.readUnsignedByte(-552143032) * -1496176850;
      this.isScrollBar = var1.readUnsignedByte(-1518154183) == 1;
      this.spellActionName = var1.readStringCp1252NullCircumfixed(2098658123);
      this.field4566 = this.readListener(var1, -300051713);
      this.field4547 = this.readListener(var1, -1021351358);
      this.onMiscTransmit = this.readListener(var1, 667891331);
      this.onMouseOver = this.readListener(var1, -1927716499);
      this.onChatTransmit = this.readListener(var1, 84296420);
      this.onLoad = this.readListener(var1, -864015539);
      this.onStatTransmit = this.readListener(var1, -121038848);
      this.onScroll = this.readListener(var1, -281891489);
      this.onTargetEnter = this.readListener(var1, 1047961071);
      this.onClickRepeat = this.readListener(var1, -1963288062);
      this.onRelease = this.readListener(var1, 888768209);
      this.onDialogAbort = this.readListener(var1, -1083057913);
      this.onMouseRepeat = this.readListener(var1, -1929820870);
      this.field4569 = this.readListener(var1, -1059529097);
      this.onResize = this.readListener(var1, 846454845);
      this.onOp = this.readListener(var1, -851368245);
      this.field4575 = this.readListener(var1, -22106259);
      this.onVarTransmit = this.readListener(var1, 39936370);
      this.varTransmitTriggers = this.readListenerTriggers(var1, (byte)2);
      this.invTransmitTriggers = this.readListenerTriggers(var1, (byte)2);
      this.statTransmitTriggers = this.readListenerTriggers(var1, (byte)2);
   }

   public int getHeightMode() {
      return this.heightAlignment * 1876325705;
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("wj")
   public Widget method8209(int var1) {
      this.textYAlignment = var1 * 1108485379;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("co")
   void method8008(Buffer var1) {
      var1.readUnsignedByte(1152249380);
      this.isIf3 = true;
      this.type = var1.readUnsignedByte(713709941) * -530909857;
      this.contentType = Buffer.method12008(var1, (byte)5) * 198280809;
      this.rawX = var1.readShort((byte)-126) * -1005032755;
      this.rawY = var1.readShort((byte)-86) * -752065015;
      this.rawWidth = Buffer.method12008(var1, (byte)5) * 1403700735;
      if (928687775 * this.type == 9) {
         this.rawHeight = var1.readShort((byte)-59) * 449174585;
      } else {
         this.rawHeight = Buffer.method12008(var1, (byte)5) * 449174585;
      }

      this.widthAlignment = Buffer.method12001(var1, (byte)108) * -1384270729;
      this.heightAlignment = Buffer.method12001(var1, (byte)73) * -500921095;
      this.xAlignment = Buffer.method12001(var1, (byte)92) * -1747850943;
      this.yAlignment = Buffer.method12001(var1, (byte)10) * -1356647925;
      this.parentId = Buffer.method12008(var1, (byte)5) * 155096849;
      if (794900977 * this.parentId == 65535) {
         this.parentId = -155096849;
      } else {
         this.parentId = ((278777747 * this.id & -65536) + 794900977 * this.parentId) * 155096849;
      }

      this.isHidden = var1.readUnsignedByte(-203532349) == 1;
      if (this.type * 928687775 == 0) {
         this.scrollWidth = Buffer.method12008(var1, (byte)5) * 1897778137;
         this.scrollHeight = Buffer.method12008(var1, (byte)5) * 1821115911;
         this.noClickThrough = var1.readUnsignedByte(-778510892) == 1;
      }

      if (928687775 * this.type == 5) {
         this.spriteId2 = Buffer.method12015(var1, 739353173) * 2092479471;
         this.spriteAngle = Buffer.method12008(var1, (byte)5) * -795510295;
         this.spriteTiling = var1.readUnsignedByte(-89536829) == 1;
         this.transparencyTop = var1.readUnsignedByte(637247587) * -167855443;
         this.outline = var1.readUnsignedByte(2075422526) * 217033705;
         this.spriteShadow = Buffer.method12015(var1, 129345277) * -1846663581;
         this.spriteFlipV = var1.readUnsignedByte(-184729187) == 1;
         this.spriteFlipH = var1.readUnsignedByte(-1660136542) == 1;
      }

      if (this.type * 928687775 == 6) {
         this.modelType = -1570196439;
         this.modelId = Buffer.method12008(var1, (byte)5) * -1314816461;
         if (94743803 * this.modelId == 65535) {
            this.modelId = 1314816461;
         }

         this.modelOffsetX = var1.readShort((byte)-31) * -37619155;
         this.modelOffsetY = var1.readShort((byte)-114) * -1048338377;
         this.modelAngleX = Buffer.method12008(var1, (byte)5) * -1977744073;
         this.modelAngleY = Buffer.method12008(var1, (byte)5) * 676548941;
         this.modelAngleZ = Buffer.method12008(var1, (byte)5) * 132153981;
         this.modelZoom = Buffer.method12008(var1, (byte)5) * 2012543961;
         this.sequenceId = Buffer.method12008(var1, (byte)5) * -12983575;
         if (this.sequenceId * -750054055 == 65535) {
            this.sequenceId = 12983575;
         }

         this.modelOrthog = var1.readUnsignedByte(-44202361) == 1;
         Buffer.method12008(var1, (byte)5);
         if (0 != 831546695 * this.widthAlignment) {
            this.field4546 = Buffer.method12008(var1, (byte)5) * -1399881697;
         }

         if (0 != this.heightAlignment * 1876325705) {
            Buffer.method12008(var1, (byte)5);
         }
      }

      if (4 == this.type * 928687775) {
         this.fontId = Buffer.method12008(var1, (byte)5) * -1824873669;
         if (this.fontId * 137772531 == 65535) {
            this.fontId = 1824873669;
         }

         this.text = var1.readStringCp1252NullCircumfixed(-1200638855);
         this.textLineHeight = var1.readUnsignedByte(131127971) * -1440610935;
         this.textXAlignment = var1.readUnsignedByte(1597815148) * -563011291;
         this.textYAlignment = var1.readUnsignedByte(1372064814) * 1108485379;
         this.textShadowed = var1.readUnsignedByte(-166103033) == 1;
         this.color = Buffer.method12015(var1, 582499945) * -1365603885;
      }

      if (3 == this.type * 928687775) {
         this.color = Buffer.method12015(var1, -779056799) * -1365603885;
         this.fill = var1.readUnsignedByte(-414686702) == 1;
         this.transparencyTop = var1.readUnsignedByte(-1435525010) * -167855443;
      }

      if (9 == this.type * 928687775) {
         this.lineWid = var1.readUnsignedByte(1451219444) * -249010551;
         this.color = Buffer.method12015(var1, 275197713) * -1365603885;
         this.field4526 = var1.readUnsignedByte(-1609893361) == 1;
      }

      this.flags = var1.readMedium(-327252912) * 2118307309;
      this.dataText = var1.readStringCp1252NullCircumfixed(-1614127020);
      int var2 = var1.readUnsignedByte(-1586238819);
      if (var2 > 0) {
         this.actions = new String[var2];

         for (int var3 = 0; var3 < var2; var3++) {
            this.actions[var3] = var1.readStringCp1252NullCircumfixed(-1596124747);
         }
      }

      this.dragZoneSize = var1.readUnsignedByte(1033655270) * 709401353;
      this.dragThreshold = var1.readUnsignedByte(-1123493892) * 2011961339;
      this.isScrollBar = var1.readUnsignedByte(1437766395) == 1;
      this.spellActionName = var1.readStringCp1252NullCircumfixed(-1794323951);
      this.field4566 = this.readListener(var1, -152724074);
      this.field4547 = this.readListener(var1, -1238509708);
      this.onMiscTransmit = this.readListener(var1, 788783705);
      this.onMouseOver = this.readListener(var1, -376943);
      this.onChatTransmit = this.readListener(var1, -784332143);
      this.onLoad = this.readListener(var1, -1881185255);
      this.onStatTransmit = this.readListener(var1, -1249119944);
      this.onScroll = this.readListener(var1, -1415530010);
      this.onTargetEnter = this.readListener(var1, -2037939211);
      this.onClickRepeat = this.readListener(var1, -1080562562);
      this.onRelease = this.readListener(var1, -165627695);
      this.onDialogAbort = this.readListener(var1, -648305573);
      this.onMouseRepeat = this.readListener(var1, -1058531739);
      this.field4569 = this.readListener(var1, 651079656);
      this.onResize = this.readListener(var1, -767529014);
      this.onOp = this.readListener(var1, -1550429594);
      this.field4575 = this.readListener(var1, -2039473680);
      this.onVarTransmit = this.readListener(var1, 778644758);
      this.varTransmitTriggers = this.readListenerTriggers(var1, (byte)2);
      this.invTransmitTriggers = this.readListenerTriggers(var1, (byte)2);
      this.statTransmitTriggers = this.readListenerTriggers(var1, (byte)2);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("ff")
   public void method8102(String var1, int var2) {
      if (-928617621 * this.type == 11) {
         if (this.field4553 == null) {
            this.method8098((byte)-78);
         }

         this.field4553.put(var1, var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("cm")
   void method8010(Buffer var1) {
      this.field4486 = var1.readStringCp1252NullCircumfixed(1612512509);
   }

   public int getSpriteId() {
      return this.spriteId2 * 79747855;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("cu")
   void method8011(Buffer var1) {
      this.field4486 = var1.readStringCp1252NullCircumfixed(-1243261738);
   }

   @ObfuscatedSignature(descriptor = "(Z)Lof;")
   @ObfuscatedName("kz")
   public Widget method8210(boolean var1) {
      this.spriteTiling = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("cn")
   void method8012(Buffer var1) {
      this.field4486 = var1.readStringCp1252NullCircumfixed(1386000817);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;II)V")
   @ObfuscatedName("xx")
   public static void method8100(Widget var0, int var1, int var2) {
      if (928687775 * var0.type == 11) {
         if (var0.field4552 == null) {
            var0.method8098((byte)-104);
         }

         var0.field4552.put(var1, var2);
      }
   }

   public int getModelZoom() {
      return this.modelZoom * -1417816983;
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("ww")
   public Widget method8211(int var1) {
      this.textXAlignment = var1 * -563011291;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)[Ljava/lang/Object;")
   @ObfuscatedName("cg")
   Object[] method8016(Buffer var1) {
      int var2 = var1.readUnsignedByte(1358736671);
      if (0 == var2) {
         return null;
      } else {
         Object[] var3 = new Object[var2];

         for (int var4 = 0; var4 < var2; var4++) {
            int var5 = var1.readUnsignedByte(-1636785721);
            if (0 == var5) {
               var3[var4] = new Integer(Buffer.method12015(var1, 1772293975));
            } else if (1 == var5) {
               var3[var4] = var1.readStringCp1252NullCircumfixed(1120823267);
            }
         }

         this.hasListener = true;
         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)[I")
   @ObfuscatedName("cd")
   int[] method8018(Buffer var1) {
      int var2 = var1.readUnsignedByte(1524327156);
      if (var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];

         for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = Buffer.method12015(var1, 2081501848);
         }

         return var3;
      }
   }

   public int getScrollWidth() {
      return this.scrollWidth * -111672215;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)[I")
   @ObfuscatedName("cz")
   int[] method8019(Buffer var1) {
      int var2 = var1.readUnsignedByte(-434235677);
      if (var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];

         for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = Buffer.method12015(var1, -679492629);
         }

         return var3;
      }
   }

   public boolean contains(Point var1) {
      Rectangle var2 = this.getBounds();
      return var2 != null && var2.contains(new java.awt.Point(var1.getX(), var1.getY()));
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("yv")
   public Widget method8212(int var1) {
      this.modelAngleY = var1 * 676548941;
      return this;
   }

   public void setNoScrollThrough(boolean var1) {
      this.noScrollThrough = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("yt")
   public Widget method8213(int var1) {
      this.textLineHeight = var1 * -1440610935;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Loc;Lei;)Lxt;")
   @ObfuscatedName("cw")
   SpritePixels method8024(WidgetDefinition var1, UrlRequester var2) {
      if (!this.method8035(-1530880556)) {
         return this.method8028(var1, var2, 1255322442);
      } else {
         String var3 = this.field4540 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + -1211507623 * this.outline + 771853131 * this.spriteShadow;
         SpritePixels var4 = (SpritePixels)class498.method10645(var1.field4402, var3, 1934219016);
         if (null == var4) {
            SpritePixels var5 = this.method8028(var1, var2, 1774520450);
            if (var5 != null) {
               var4 = var5.method12613();
               this.method8037(var4, (byte)-33);
               var1.field4402.method10647(var3, var4, -1417953533);
            }
         }

         return var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("zd")
   public Widget method8214(int var1) {
      this.flags = var1 * 2118307309;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Loc;ZLei;)Lxt;")
   @ObfuscatedName("cf")
   public SpritePixels method8021(WidgetDefinition var1, boolean var2, UrlRequester var3) {
      field4598 = false;
      if (this.field4540 != null) {
         SpritePixels var4 = this.method8027(var1, var3, (byte)0);
         if (null != var4) {
            return var4;
         }
      }

      int var8;
      if (var2) {
         var8 = 1395688701 * this.spriteId;
      } else {
         var8 = 79747855 * this.spriteId2;
      }

      if (var8 == -1) {
         return null;
      } else {
         long var5 = ((this.spriteFlipH ? 1L : 0L) << 39)
            + var8
            + ((long)(this.outline * -1211507623) << 36)
            + ((this.spriteFlipV ? 1L : 0L) << 38)
            + ((long)(this.spriteShadow * 771853131) << 40);
         SpritePixels var7 = (SpritePixels)class402.method8806(var1.Widget_cachedSprites, var5);
         if (var7 != null) {
            return var7;
         } else {
            var7 = class387.SpriteBuffer_getSprite(var1.field4409, var8, 0, -2139672119);
            if (var7 == null) {
               field4598 = true;
               return null;
            } else {
               this.method8037(var7, (byte)-6);
               var1.Widget_cachedSprites.put(var7, var5);
               return var7;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Loc;ZLei;)Lxt;")
   @ObfuscatedName("cq")
   public SpritePixels method8022(WidgetDefinition var1, boolean var2, UrlRequester var3) {
      field4598 = false;
      if (this.field4540 != null) {
         SpritePixels var4 = this.method8027(var1, var3, (byte)0);
         if (null != var4) {
            return var4;
         }
      }

      int var8;
      if (var2) {
         var8 = 1395688701 * this.spriteId;
      } else {
         var8 = 1781046241 * this.spriteId2;
      }

      if (var8 == -1) {
         return null;
      } else {
         long var5 = ((this.spriteFlipH ? 1L : 0L) << 39)
            + var8
            + ((long)(this.outline * -1211507623) << 36)
            + ((this.spriteFlipV ? 1L : 0L) << -296068843)
            + ((long)(this.spriteShadow * 771853131) << 40);
         SpritePixels var7 = (SpritePixels)class402.method8806(var1.Widget_cachedSprites, var5);
         if (var7 != null) {
            return var7;
         } else {
            var7 = class387.SpriteBuffer_getSprite(var1.field4409, var8, 0, -2139672119);
            if (var7 == null) {
               field4598 = true;
               return null;
            } else {
               this.method8037(var7, (byte)-58);
               var1.Widget_cachedSprites.put(var7, var5);
               return var7;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bm")
   public int method8130(int var1) {
      try {
         if (928687775 * this.type == 11) {
            if (var1 >= -772517373) {
               throw new IllegalStateException();
            }

            if (null != this.field4442) {
               if (var1 >= -772517373) {
                  throw new IllegalStateException();
               }

               if (this.field4553 != null) {
                  if (!this.field4553.isEmpty()) {
                     String var2 = class225.method5317(this.field4442, (byte)118);
                     if (null != var2) {
                        if (var1 >= -772517373) {
                           throw new IllegalStateException();
                        }

                        if (this.field4553.containsKey(class225.method5317(this.field4442, (byte)107))) {
                           if (var1 >= -772517373) {
                              throw new IllegalStateException();
                           }

                           return (Integer)this.field4553.get(var2);
                        }
                     }

                     return -1;
                  }

                  if (var1 >= -772517373) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         return -1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "of.bm(" + 41);
      }
   }

   public int getBorderType() {
      return this.outline * -1211507623;
   }

   public Object[] getOnKeyListener() {
      return this.onDrag;
   }

   @ObfuscatedSignature(descriptor = "(Loc;Lei;)Lxt;")
   @ObfuscatedName("cr")
   SpritePixels method8025(WidgetDefinition var1, UrlRequester var2) {
      if (!this.method8035(-1530880556)) {
         return this.method8028(var1, var2, 1092242400);
      } else {
         String var3 = this.field4540 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + -18978690 * this.outline + 771853131 * this.spriteShadow;
         SpritePixels var4 = (SpritePixels)class498.method10645(var1.field4402, var3, 1934219016);
         if (null == var4) {
            SpritePixels var5 = this.method8028(var1, var2, 2126116080);
            if (var5 != null) {
               var4 = var5.method12613();
               this.method8037(var4, (byte)-43);
               var1.field4402.method10647(var3, var4, -1075208215);
            }
         }

         return var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("jp")
   public Widget method8215(int var1) {
      this.modelZoom = var1 * 2012543961;
      return this;
   }

   public int getHeight() {
      return this.height * -905446999;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Loc;ZLei;)Lxt;")
   @ObfuscatedName("jk")
   public static SpritePixels method8023(Widget var0, WidgetDefinition var1, boolean var2, UrlRequester var3) {
      if (var0 == null) {
         var0.method8140();
      }

      field4598 = false;
      if (var0.field4540 != null) {
         SpritePixels var4 = var0.method8027(var1, var3, (byte)0);
         if (null != var4) {
            return var4;
         }
      }

      int var8;
      if (var2) {
         var8 = 1395688701 * var0.spriteId;
      } else {
         var8 = 79747855 * var0.spriteId2;
      }

      if (var8 == -1) {
         return null;
      } else {
         long var5 = ((var0.spriteFlipH ? 1L : 0L) << 39)
            + var8
            + ((long)(var0.outline * -1211507623) << 36)
            + ((var0.spriteFlipV ? 1L : 0L) << 38)
            + ((long)(var0.spriteShadow * 771853131) << 40);
         SpritePixels var7 = (SpritePixels)class402.method8806(var1.Widget_cachedSprites, var5);
         if (var7 != null) {
            return var7;
         } else {
            var7 = class387.SpriteBuffer_getSprite(var1.field4409, var8, 0, -2139672119);
            if (var7 == null) {
               field4598 = true;
               return null;
            } else {
               var0.method8037(var7, (byte)26);
               var1.Widget_cachedSprites.put(var7, var5);
               return var7;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Loc;Lei;)Lxt;")
   @ObfuscatedName("cj")
   SpritePixels method8026(WidgetDefinition var1, UrlRequester var2) {
      if (!this.method8035(-1530880556)) {
         return this.method8028(var1, var2, 1440520902);
      } else {
         String var3 = this.field4540 + (this.spriteFlipV ? 1 : 0) + (this.spriteFlipH ? 1 : 0) + -1211507623 * this.outline + 771853131 * this.spriteShadow;
         SpritePixels var4 = (SpritePixels)class498.method10645(var1.field4402, var3, 1934219016);
         if (null == var4) {
            SpritePixels var5 = this.method8028(var1, var2, 1803549786);
            if (var5 != null) {
               var4 = var5.method12613();
               this.method8037(var4, (byte)-13);
               var1.field4402.method10647(var3, var4, 1616308145);
            }
         }

         return var4;
      }
   }

   public int getOriginalWidth() {
      return this.rawWidth * 1127299583;
   }

   @ObfuscatedSignature(descriptor = "()Loo;")
   @ObfuscatedName("gz")
   public classOO method8157() {
      return null != this.field4554 ? this.field4554.field4678 : null;
   }

   public int getYPositionMode() {
      return this.yAlignment * -818525789;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("bp")
   public String method8134(int var1) {
      try {
         if (this.type * 928687775 == 11) {
            if (var1 >= 1829534695) {
               throw new IllegalStateException();
            }

            if (null != this.field4442) {
               String var2 = class225.method5317(this.field4442, (byte)65);
               Iterator var3 = this.field4442.method5314(-109514321).iterator();

               while (var3.hasNext()) {
                  if (var1 >= 1829534695) {
                     throw new IllegalStateException();
                  }

                  classJO var4 = (classJO)var3.next();
                  String var5 = String.format("%%%S%%", var4.method6146((byte)0));
                  if (var4.vmethod194(2141955216) == 0) {
                     if (var1 >= 1829534695) {
                        throw new IllegalStateException();
                     }

                     var2.replaceAll(var5, Integer.toString(var4.vmethod196(497178271)));
                  } else {
                     var2.replaceAll(var5, var4.vmethod207(1380857227));
                  }
               }

               return var2;
            }

            if (var1 >= 1829534695) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "of.bp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dv")
   boolean method8033() {
      return this.spriteFlipV || this.spriteFlipH || 0 != this.outline * 809240024 || 0 != this.spriteShadow * 771853131;
   }

   @ObfuscatedSignature(descriptor = "(Lxt;)V")
   @ObfuscatedName("db")
   void method8038(SpritePixels var1) {
      if (this.spriteFlipV) {
         var1.flipVertically();
      }

      if (this.spriteFlipH) {
         var1.flipHorizontally();
      }

      if (-1211507623 * this.outline > 0) {
         class380.method8274(var1, this.outline * -1211507623);
      }

      if (this.outline * -1211507623 >= 1) {
         var1.outline(1);
      }

      if (this.outline * -1211507623 >= 2) {
         var1.outline(16777215);
      }

      if (0 != this.spriteShadow * 771853131) {
         SpritePixels.method12643(var1, 771853131 * this.spriteShadow);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ly")
   public void method8189(int var1) {
      this.field4431 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxt;)V")
   @ObfuscatedName("dy")
   void method8039(SpritePixels var1) {
      if (this.spriteFlipV) {
         var1.flipVertically();
      }

      if (this.spriteFlipH) {
         var1.flipHorizontally();
      }

      if (-1211507623 * this.outline > 0) {
         class380.method8274(var1, this.outline * 1415417500);
      }

      if (this.outline * -1211507623 >= 1) {
         var1.outline(1);
      }

      if (this.outline * -1211507623 >= 2) {
         var1.outline(1840684129);
      }

      if (0 != this.spriteShadow * 57418633) {
         SpritePixels.method12643(var1, 1684922394 * this.spriteShadow);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("uy")
   public void method8184(int var1) {
      this.field4430 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("jl")
   public Widget method8216(int var1) {
      this.rawHeight = var1 * 449174585;
      return this;
   }

   public Point getCanvasLocation() {
      return new Point(this.field4430, this.field4431);
   }

   public int getParentId() {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         int var1 = this.parentId * 794900977;
         if (var1 != -1) {
            return var1;
         } else {
            int var2 = this.getId();
            if (WidgetUtil.componentToInterface(var2) == SecureUrlRequester.client.getTopLevelInterfaceId()) {
               return -1;
            } else {
               int var3 = this.field4429;
               if (var3 != -1) {
                  InterfaceParent var4 = (InterfaceParent)classUQ.method11202(client.interfaceParents, var3);
                  if (var4 != null && var4.getId() == WidgetUtil.componentToInterface(var2)) {
                     return var3;
                  }

                  this.field4429 = -1;
               }

               int var8 = WidgetUtil.componentToInterface(this.getId());

               for (InterfaceParent var7 : SecureUrlRequester.client.method2549()) {
                  if (var8 == var7.getId()) {
                     return (int)var7.getHash();
                  }
               }

               return -1;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILof;IIIII[F)Lof;")
   @ObfuscatedName("bc")
   static Widget method7995(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      Widget var8 = new Widget();
      var8.type = var0 * -1438476906;
      var8.parentId = var1.id * 791762877;
      var8.childIndex = var2 * -2112142287;
      var8.isIf3 = true;
      var8.xAlignment = -1747850943 * var3;
      var8.yAlignment = -709899889 * var4;
      var8.widthAlignment = var5 * -1108798774;
      var8.heightAlignment = var6 * -500921095;
      var8.rawX = -1005032755 * (int)(var7[0] * (-1946208531 * var1.width));
      var8.rawY = -752065015 * (int)(var1.height * -211677469 * var7[1]);
      var8.rawWidth = (int)(-1946208531 * var1.width * var7[2]) * -1337298130;
      var8.rawHeight = 2022617850 * (int)(-905446999 * var1.height * var7[3]);
      return var8;
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("aq")
   public Widget method8217(int var1) {
      this.yAlignment = var1 * -1356647925;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Loc;)Lsu;")
   @ObfuscatedName("dt")
   public Font method8042(WidgetDefinition var1) {
      field4598 = false;
      if (this.fontId * -671625495 == -1) {
         return null;
      } else {
         Font var2 = (Font)class402.method8806(var1.Widget_cachedFonts, this.fontId * 137772531);
         if (var2 != null) {
            return var2;
         } else {
            AbstractArchive var4 = var1.field4409;
            AbstractArchive var5 = var1.field4410;
            int var6 = -316168567 * this.fontId;
            Font var3;
            if (!FloorOverlayDefinition.method5355(var4, var6, 0, -1366279867)) {
               var3 = null;
            } else {
               var3 = class181.method4267(var5.getFile(var6, 0, -1009292985), 16777215);
            }

            if (var3 != null) {
               var1.Widget_cachedFonts.put(var3, this.fontId * 137772531);
            } else {
               field4598 = true;
            }

            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(S)Z")
   @ObfuscatedName("ah")
   public boolean method8063(short var1) {
      try {
         if (this.type * 928687775 != 11) {
            if (var1 == 484) {
               throw new IllegalStateException();
            }

            if (this.type * 928687775 != 12) {
               return false;
            }

            if (var1 == 484) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "of.ah(" + ')');
      }
   }

   public int getDragDeadTime() {
      return this.dragThreshold * -1635558605;
   }

   public int getXTextAlignment() {
      return this.textXAlignment * 450368173;
   }

   @ObfuscatedSignature(descriptor = "()Lsl;")
   @ObfuscatedName("kw")
   public AbstractFont method8190() {
      return this.method8234(class226.widgetDefinition);
   }

   public void setOnScrollWheelListener(Object[] var1) {
      this.onVarTransmit = var1;
   }

   @ObfuscatedSignature(descriptor = "(Loc;Liw;IZLoa;Lhu;Lha;)Lky;")
   @ObfuscatedName("di")
   public Model method8046(
      WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7
   ) {
      field4598 = false;
      int var8;
      int var9;
      if (var4) {
         var8 = this.modelType2 * -1556184641;
         var9 = this.modelId2 * 463905393;
      } else {
         var8 = 2124425241 * this.modelType;
         var9 = this.modelId * 94743803;
      }

      if (var8 == 0) {
         return null;
      } else if (1 == var8 && var9 == -1) {
         return null;
      } else {
         if (var7 != null && var7.useLocalPlayer && var8 == 6) {
            var8 = 3;
         }

         long var10 = var9 + (var8 << 16);
         if (var8 == 2 || 6 == var8) {
            if (null == var6) {
               return null;
            }

            var10 = 1435750363 * var6.id + (var8 << 16);
         }

         if (null != var7) {
            var10 |= 7709241557646364001L * var7.field2145 << 20;
         }

         Model var12 = (Model)class402.method8806(var1.Widget_cachedModels, var10);
         if (null == var12) {
            ModelData var13 = null;
            int var14 = 64;
            int var15 = 768;
            switch (var8) {
               case 1:
                  var13 = ModelData.ModelData_get(var1.field4408, var9, 0);
                  break;
               case 2:
                  var13 = NPCComposition.method4677(var6, null, -1196200918);
                  break;
               case 3:
                  var13 = var5 != null ? var5.getModelData(-262383841) : null;
                  break;
               case 4:
                  ItemComposition var16 = class150.ItemDefinition_get(var9, -271276853);
                  var13 = var16.getModelData(10, (byte)0);
                  var14 += var16.ambient * 689590731;
                  var15 += var16.contrast * 1596591697;
               case 5:
               default:
                  break;
               case 6:
                  var13 = NPCComposition.method4677(var6, var7, 468642435);
            }

            if (var13 == null) {
               field4598 = true;
               return null;
            }

            var12 = ModelData.method6106(var13, var14, var15, -50, -10, -50);
            var1.Widget_cachedModels.put(var12, var10);
         }

         if (var2 != null) {
            var12 = SequenceDefinition.method5236(var2, var12, var3, (byte)0);
         }

         return var12;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)Lof;")
   @ObfuscatedName("pe")
   public Widget method8218(boolean var1) {
      this.isHidden = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Loc;Liw;IZLoa;Lhu;Lha;)Lky;")
   @ObfuscatedName("dl")
   public Model method8047(
      WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7
   ) {
      field4598 = false;
      int var8;
      int var9;
      if (var4) {
         var8 = this.modelType2 * -1556184641;
         var9 = this.modelId2 * 463905393;
      } else {
         var8 = 2124425241 * this.modelType;
         var9 = this.modelId * 94743803;
      }

      if (var8 == 0) {
         return null;
      } else if (1 == var8 && var9 == -1) {
         return null;
      } else {
         if (var7 != null && var7.useLocalPlayer && var8 == 6) {
            var8 = 3;
         }

         long var10 = var9 + (var8 << 16);
         if (var8 == 2 || 6 == var8) {
            if (null == var6) {
               return null;
            }

            var10 = 1435750363 * var6.id + (var8 << 16);
         }

         if (null != var7) {
            var10 |= 7709241557646364001L * var7.field2145 << 20;
         }

         Model var12 = (Model)class402.method8806(var1.Widget_cachedModels, var10);
         if (null == var12) {
            ModelData var13 = null;
            int var14 = 64;
            int var15 = 768;
            switch (var8) {
               case 1:
                  var13 = ModelData.ModelData_get(var1.field4408, var9, 0);
                  break;
               case 2:
                  var13 = NPCComposition.method4677(var6, null, -1130910200);
                  break;
               case 3:
                  var13 = var5 != null ? var5.getModelData(-1149070900) : null;
                  break;
               case 4:
                  ItemComposition var16 = class150.ItemDefinition_get(var9, -507076932);
                  var13 = var16.getModelData(10, (byte)-23);
                  var14 += var16.ambient * 689590731;
                  var15 += var16.contrast * 1596591697;
               case 5:
               default:
                  break;
               case 6:
                  var13 = NPCComposition.method4677(var6, var7, 1906060786);
            }

            if (var13 == null) {
               field4598 = true;
               return null;
            }

            var12 = ModelData.method6106(var13, var14, var15, -50, -10, -50);
            var1.Widget_cachedModels.put(var12, var10);
         }

         if (var2 != null) {
            var12 = SequenceDefinition.method5236(var2, var12, var3, (byte)0);
         }

         return var12;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lof;")
   @ObfuscatedName("hq")
   public Widget method8186(int var1, int var2) {
      return this.method8233(var1).method8216(var2);
   }

   public int getXPositionMode() {
      return this.xAlignment * -423647551;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;II)I")
   @ObfuscatedName("tr")
   public static int method8069(Widget var0, int var1, int var2) {
      for (int var3 = 0; var3 < -25645663 * var0.field4548; var3++) {
         if (var0.field4596[var3] == var1) {
            return (Integer)var0.field4591[var3];
         }
      }

      return var2;
   }

   public boolean isFlippedVertically() {
      return this.spriteFlipV;
   }

   public void setOnHoldListener(Object[] var1) {
      this.onResize = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Ljava/lang/String;)I")
   @ObfuscatedName("eq")
   public static int method8116(Widget var0, String var1) {
      return var0.type * 1785727850 == 11 && var0.field4442 != null && var0.method8113((byte)14) ? var0.field4442.method5299(var1, 1947321302) : -1;
   }

   public int getOriginalHeight() {
      return this.rawHeight * 1955156489;
   }

   public void setFlippedVertically(boolean var1) {
      this.spriteFlipV = var1;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;)[Ljava/lang/Object;")
   @ObfuscatedName("ch")
   Object[] method7997(Object[] var1) {
      return var1 != null ? Arrays.copyOf(var1, var1.length) : null;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("eq")
   public int method8070(int var1, int var2) {
      for (int var3 = 0; var3 < -25645663 * this.field4548; var3++) {
         if (this.field4596[var3] == var1) {
            return (Integer)this.field4591[var3];
         }
      }

      return var2;
   }

   public void setRelativeY(int var1) {
      this.y = var1 * 90132725;
   }

   @ObfuscatedSignature(descriptor = "(Loc;Z)Loz;")
   @ObfuscatedName("dq")
   public SpriteMask method8052(WidgetDefinition var1, boolean var2) {
      if (-1 == this.spriteId * 1395688701) {
         var2 = false;
      }

      int var3 = var2 ? this.spriteId * 1395688701 : 79747855 * this.spriteId2;
      if (var3 == -1) {
         return null;
      } else {
         long var4 = ((this.spriteFlipV ? 1L : 0L) << 38)
            + ((long)(this.outline * -1211507623) << 36)
            + var3
            + ((this.spriteFlipH ? 1L : 0L) << 39)
            + ((long)(this.spriteShadow * 771853131) << 40);
         SpriteMask var6 = (SpriteMask)class402.method8806(var1.Widget_cachedSpriteMasks, var4);
         if (var6 != null) {
            return var6;
         } else {
            SpritePixels var7 = this.getSprite(var1, var2, null, 593292220);
            if (null == var7) {
               return null;
            } else {
               SpritePixels var8 = var7.copyNormalized();
               int[] var9 = new int[var8.subHeight];
               int[] var10 = new int[var8.subHeight];

               for (int var11 = 0; var11 < var8.subHeight; var11++) {
                  int var12 = 0;
                  int var13 = var8.subWidth;

                  for (int var14 = 0; var14 < var8.subWidth; var14++) {
                     if (var8.pixels[var14 + var11 * var8.subWidth] == 0) {
                        var12 = var14;
                        break;
                     }
                  }

                  for (int var16 = var8.subWidth - 1; var16 >= var12; var16--) {
                     if (0 == var8.pixels[var11 * var8.subWidth + var16]) {
                        var13 = 1 + var16;
                        break;
                     }
                  }

                  var9[var11] = var12;
                  var10[var11] = var13 - var12;
               }

               var6 = new SpriteMask(var8.subWidth, var8.subHeight, var10, var9, var3);
               var1.Widget_cachedSpriteMasks.put(var6, var4);
               return var6;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)V")
   @ObfuscatedName("du")
   public void method8054(int var1, String var2) {
      if (this.actions == null || this.actions.length <= var1) {
         String[] var3 = new String[var1 + 1];
         if (null != this.actions) {
            for (int var4 = 0; var4 < this.actions.length; var4++) {
               var3[var4] = this.actions[var4];
            }
         }

         this.actions = var3;
      }

      this.actions[var1] = var2;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)V")
   @ObfuscatedName("dm")
   public void method8055(int var1, String var2) {
      if (this.actions == null || this.actions.length <= var1) {
         String[] var3 = new String[var1 + 1];
         if (null != this.actions) {
            for (int var4 = 0; var4 < this.actions.length; var4++) {
               var3[var4] = this.actions[var4];
            }
         }

         this.actions = var3;
      }

      this.actions[var1] = var2;
   }

   public int getItemQuantity() {
      return this.itemQuantity * 1070452379;
   }

   @ObfuscatedSignature(descriptor = "(IILjava/lang/String;)V")
   @ObfuscatedName("dp")
   public void method8057(int var1, int var2, String var3) {
      if (this.field4536 == null || this.field4536.length <= var1) {
         String[][] var4 = new String[var1 + 1][];
         if (this.field4536 != null) {
            System.arraycopy(this.field4536, 0, var4, 0, this.field4536.length);
         }

         this.field4536 = var4;
      }

      if (null == this.field4536[var1] || this.field4536[var1].length <= var2) {
         String[] var5 = new String[var2 + 1];
         if (null != this.field4536[var1]) {
            System.arraycopy(this.field4536[var1], 0, var5, 0, this.field4536[var1].length);
         }

         this.field4536[var1] = var5;
      }

      this.field4536[var1][var2] = var3;
   }

   public Object[] getOnOpListener() {
      return this.onClickRepeat;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Loo;)Z")
   @ObfuscatedName("ta")
   public static boolean method8167(Widget var0, classOO var1) {
      if (var0 == null) {
         var0.method8225();
      }

      boolean var2 = false;
      if (null != var0.text && !var0.text.isEmpty()) {
         var2 |= var1.method8378(MouseRecorder.method2641(var0.text, 1678138157), 554709609);
         var0.text = "";
      }

      if (null != var0.text2 && !var0.text2.isEmpty()) {
         var2 |= var1.method8382(MouseRecorder.method2641(var0.text2, 1270241046), -2104539796);
         var0.text2 = "";
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)V")
   @ObfuscatedName("dp")
   public static void method8096(Widget var0) {
      if (var0 == null) {
         var0.getYPositionMode();
      }

      var0.field4552 = new HashMap();
      var0.field4553 = new HashMap();
   }

   public void setTargetPriority(int var1) {
      this.targetPriority = var1 * 1398918343;
   }

   @ObfuscatedSignature(descriptor = "(Loc;Lei;)Z")
   @ObfuscatedName("gs")
   public boolean method8144(WidgetDefinition var1, UrlRequester var2) {
      if (928687775 * this.type == 11 && this.field4442 != null) {
         this.field4442.method5290(var2, -1589921768);
         if (this.field4442.method5295(333565326) != this.field4521 * -1348354097) {
            this.field4521 = this.field4442.method5295(333565326) * 61269807;
            if (this.field4521 * -1348354097 >= 3) {
               return true;
            }

            if (2 == this.field4521 * -1348354097) {
               this.method8147(var1, (byte)0);
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("de")
   public boolean method8059() {
      return !this.isIf3
         || 0 == 928687775 * this.type
         || this.type * 928687775 == 11
         || this.hasListener
         || 1338 == this.contentType * 1889823193
         || -1251641238 * this.type == 12;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Loc;)Lsu;")
   @ObfuscatedName("gm")
   public static Font method8043(Widget var0, WidgetDefinition var1) {
      if (var0 == null) {
         var0.getWidthMode();
      }

      field4598 = false;
      if (var0.fontId * -556215513 == -1) {
         return null;
      } else {
         Font var2 = (Font)class402.method8806(var1.Widget_cachedFonts, var0.fontId * 679944510);
         if (var2 != null) {
            return var2;
         } else {
            AbstractArchive var4 = var1.field4409;
            AbstractArchive var5 = var1.field4410;
            int var6 = 137772531 * var0.fontId;
            Font var3;
            if (!FloorOverlayDefinition.method5355(var4, var6, 0, -1366279867)) {
               var3 = null;
            } else {
               var3 = class181.method4267(var5.getFile(var6, 0, -1996151586), 16777215);
            }

            if (var3 != null) {
               var1.Widget_cachedFonts.put(var3, var0.fontId * 135835297);
            } else {
               field4598 = true;
            }

            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("fr")
   public String method8135() {
      if (this.type * 928687775 == 11 && null != this.field4442) {
         String var1 = class225.method5317(this.field4442, (byte)93);

         for (classJO var3 : this.field4442.method5314(-480987357)) {
            String var4 = String.format("%%%S%%", var3.method6146((byte)0));
            if (var3.vmethod194(707903341) == 0) {
               var1.replaceAll(var4, Integer.toString(var3.vmethod196(497178271)));
            } else {
               var1.replaceAll(var4, var3.vmethod207(1380857227));
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dk")
   public boolean method8064() {
      return this.type * 928687775 == 11 || this.type * 928687775 == 12;
   }

   public Object[] getOnLoadListener() {
      return this.field4566;
   }

   public void setOnDragCompleteListener(Object[] var1) {
      this.field4575 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("ii")
   public Widget method8219(int var1) {
      this.fontId = var1 * -1824873669;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Lof;Ljava/lang/String;Lei;I)V")
   @ObfuscatedName("pm")
   public static void method8091(Widget var0, String var1, UrlRequester var2, int var3) {
      if (var0 == null) {
         var0.method8095(var1, var2, var3);
      }

      try {
         if (11 == 928687775 * var0.type) {
            if (var3 <= 580873938) {
               throw new IllegalStateException();
            }

            if (var1 != null) {
               var0.field4442 = new class225();
               var0.field4442.method5329(var1, var2, (byte)-96);
               return;
            }

            if (var3 <= 580873938) {
               throw new IllegalStateException();
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "of.aq(" + ')');
      }
   }

   public int getRelativeY() {
      return this.y * -286860451;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)V")
   @ObfuscatedName("fl")
   public static void method8153(Widget var0) {
      if (var0 == null) {
         var0.getXPositionMode();
      }

      var0.field4554 = new class376();

      for (int var1 = 1; var1 <= 12; var1++) {
         class28.method486(var0.field4554.field4679, var1, 0, 803893056);
      }

      for (char var2 = 0; var2 < ' '; var2++) {
         var0.field4554.field4679.method488(var2, 0, -371900800);
      }

      var0.field4554.field4679.method488('\u0080', 0, -371900800);
      class28.method486(var0.field4554.field4679, 82, 2, 468749197);
      class28.method486(var0.field4554.field4679, 81, 2, 1295080343);
      class28.method486(var0.field4554.field4679, 86, 2, 43476532);
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("kz")
   public Widget method8220(int var1) {
      this.modelType = var1 * -1570196439;
      return this;
   }

   public net.runelite.api.widgets.Widget getParent() {
      int var1 = this.getParentId();
      return var1 == -1 ? null : SecureUrlRequester.client.method2371(var1);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dn")
   public boolean method8065() {
      return this.type * 928687775 == 11 || this.type * 928687775 == 12;
   }

   public void setType(int var1) {
      this.type = var1 * -530909857;
   }

   @ObfuscatedSignature(descriptor = "(Z)Lof;")
   @ObfuscatedName("df")
   public Widget method8221(boolean var1) {
      this.hasListener = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)Ljava/lang/Object;")
   @ObfuscatedName("ec")
   public Object method8067(int var1, Object var2) {
      for (int var3 = 0; var3 < this.field4548 * -25645663; var3++) {
         if (this.field4596[var3] == var1) {
            return this.field4591[var3];
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lof;[Ljava/lang/Object;I)[Ljava/lang/Object;")
   @ObfuscatedName("zu")
   public static Object[] method7998(Widget var0, Object[] var1, int var2) {
      if (var0 == null) {
         var0.method7999(var1, var2);
      }

      try {
         Object[] var10000;
         if (var1 != null) {
            if (var2 != -235863823) {
               throw new IllegalStateException();
            }

            var10000 = Arrays.copyOf(var1, var1.length);
         } else {
            var10000 = null;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "of.at(" + ')');
      }
   }

   public void clearActions() {
      this.actions = null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Lei;J)V")
   @ObfuscatedName("ao")
   public void method8080(String var1, String var2, UrlRequester var3, long var4) {
      try {
         if (928687775 * this.type == 11 && var4 != -1L) {
            var1 = var1.replaceAll("%userid%", Long.toString(var4));
            this.field4442 = new class225();
            if (!class225.method5285(this.field4442, var1, var2, var3, 1665097058)) {
               this.field4442 = null;
            } else {
               if (null == this.field4552 || this.field4553 == null) {
                  this.method8098((byte)-124);
               }
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "of.ao(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Loa;Z)V")
   @ObfuscatedName("jt")
   public static void method8173(Widget var0, PlayerComposition var1, boolean var2) {
      if (var0 == null) {
         var0.method8176(var1, var2);
      } else {
         var0.modelType = -721102372;
         var0.field4497 = new PlayerComposition(var1);
         if (!var2) {
            var0.field4497.equipment = Arrays.copyOf(var0.field4497.field4383, var0.field4497.field4383.length);
            var0.field4497.method7922((byte)4);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)[I")
   @ObfuscatedName("sl")
   public static int[] method8138(Widget var0) {
      if (928687775 * var0.type == 11 && null != var0.field4442) {
         int[] var1 = new int[3];
         int var2 = 0;

         for (classJO var4 : var0.field4442.method5314(1558422561)) {
            if (!var4.method6146((byte)0).equals("user_id")) {
               if (var4.vmethod194(1772757914) != 0) {
                  return null;
               }

               var1[var2++] = var4.vmethod196(497178271);
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

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("un")
   public Widget method8222(int var1) {
      this.heightAlignment = var1 * -500921095;
      return this;
   }

   public String[] getActions() {
      return this.actions;
   }

   public void setDragDeadZone(int var1) {
      this.dragZoneSize = var1 * 709401353;
   }

   @ObfuscatedSignature(descriptor = "(Lof;I)Z")
   @ObfuscatedName("ww")
   public static boolean method8060(Widget var0, int var1) {
      if (var0 == null) {
         var0.method8036(var1);
      }

      try {
         if (var0.isIf3) {
            if (var1 <= -1678510758) {
               throw new IllegalStateException();
            }

            if (0 != 928687775 * var0.type) {
               if (var1 <= -1678510758) {
                  throw new IllegalStateException();
               }

               if (var0.type * 928687775 != 11 && !var0.hasListener) {
                  if (var1 <= -1678510758) {
                     throw new IllegalStateException();
                  }

                  if (1338 != var0.contentType * 1889823193) {
                     if (var1 <= -1678510758) {
                        throw new IllegalStateException();
                     }

                     if (928687775 * var0.type != 12) {
                        return false;
                     }

                     if (var1 <= -1678510758) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "of.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("by")
   public Widget method8223(int var1) {
      this.rawX = var1 * -1005032755;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("dd")
   public Widget method8224(int var1) {
      this.widthAlignment = var1 * -1384270729;
      return this;
   }

   public net.runelite.api.widgets.Widget getChild(int var1) {
      Widget[] var2 = this.method8208();
      return var2 != null && var1 >= 0 && var1 < var2.length ? var2[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("fn")
   public boolean method8108(int var1, int var2, int var3, int var4) {
      if (11 == this.type * 928687775 && this.field4442 != null && this.method8113((byte)14)) {
         var1 -= var3;
         var2 -= var4;
         int var5 = (int)(this.field4442.method5320(-816027473)[0] * (this.width * -1946208531));
         int var6 = (int)(this.field4442.method5320(-1574424314)[1] * (125721650 * this.height));
         int var7 = var5 + (int)(this.field4442.method5320(-1829163420)[2] * (-1946208531 * this.width));
         int var8 = var6 + (int)(this.field4442.method5320(-1366079340)[3] * (this.height * 295699993));
         return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("es")
   public void method8073(int var1, Object var2) {
      for (int var3 = 0; var3 < this.field4548 * -25645663; var3++) {
         if (var1 == this.field4596[var3]) {
            this.field4591[var3] = var2;
            return;
         }
      }

      if (null == this.field4591) {
         this.field4596 = new int[4];
         this.field4591 = new Object[4];
      } else if (-25645663 * this.field4548 == this.field4591.length) {
         this.field4596 = Arrays.copyOf(this.field4596, 2 * this.field4596.length);
         this.field4591 = Arrays.copyOf(this.field4591, 2 * this.field4591.length);
      }

      this.field4596[this.field4548 * -25645663] = var1;
      this.field4591[-25645663 * this.field4548] = var2;
      this.field4548 += 528381537;
   }

   @ObfuscatedSignature(descriptor = "(Loc;Lei;)Z")
   @ObfuscatedName("go")
   public boolean method8145(WidgetDefinition var1, UrlRequester var2) {
      if (928687775 * this.type == 11 && this.field4442 != null) {
         this.field4442.method5290(var2, -1589921768);
         if (this.field4442.method5295(333565326) != this.field4521 * -1348354097) {
            this.field4521 = this.field4442.method5295(333565326) * 61269807;
            if (this.field4521 * -1348354097 >= 3) {
               return true;
            }

            if (2 == this.field4521 * -1693859631) {
               this.method8147(var1, (byte)0);
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public void setHeight(int var1) {
      this.height = var1 * -1551910247;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("ek")
   public void method8074(int var1, Object var2) {
      for (int var3 = 0; var3 < this.field4548 * -25645663; var3++) {
         if (var1 == this.field4596[var3]) {
            this.field4591[var3] = var2;
            return;
         }
      }

      if (null == this.field4591) {
         this.field4596 = new int[4];
         this.field4591 = new Object[4];
      } else if (-25645663 * this.field4548 == this.field4591.length) {
         this.field4596 = Arrays.copyOf(this.field4596, 2 * this.field4596.length);
         this.field4591 = Arrays.copyOf(this.field4591, 2 * this.field4591.length);
      }

      this.field4596[this.field4548 * -25645663] = var1;
      this.field4591[-25645663 * this.field4548] = var2;
      this.field4548 += 528381537;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Lei;J)V")
   @ObfuscatedName("em")
   public void method8081(String var1, String var2, UrlRequester var3, long var4) {
      if (-1739915444 * this.type == 11 && var4 != -1L) {
         var1 = var1.replaceAll("%userid%", Long.toString(var4));
         this.field4442 = new class225();
         if (!class225.method5285(this.field4442, var1, var2, var3, 591454665)) {
            this.field4442 = null;
         } else {
            if (null == this.field4552 || this.field4553 == null) {
               this.method8098((byte)-93);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Lei;J)V")
   @ObfuscatedName("eg")
   public void method8082(String var1, String var2, UrlRequester var3, long var4) {
      if (-1730519025 * this.type == 11 && var4 != -1L) {
         var1 = var1.replaceAll("%userid%", Long.toString(var4));
         this.field4442 = new class225();
         if (!class225.method5285(this.field4442, var1, var2, var3, 1211485622)) {
            this.field4442 = null;
         } else {
            if (null == this.field4552 || this.field4553 == null) {
               this.method8098((byte)-128);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;I)I")
   @ObfuscatedName("tq")
   public static int method8124(Widget var0, int var1) {
      if (var0 == null) {
         return var0.method8129(var1);
      } else {
         try {
            byte var10000;
            if (var0.field4553 != null && !var0.field4553.isEmpty()) {
               if (var1 >= -1446344081) {
                  throw new IllegalStateException();
               }

               var10000 = 1;
            } else {
               var10000 = 0;
            }

            return var10000;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "of.bj(" + 41);
         }
      }
   }

   public boolean getNoClickThrough() {
      return this.noClickThrough;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("qh")
   public int[] method8225() {
      return this.itemQuantities;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Lei;J)V")
   @ObfuscatedName("el")
   public void method8083(String var1, String var2, UrlRequester var3, long var4) {
      if (928687775 * this.type == 11 && var4 != -1L) {
         var1 = var1.replaceAll("%userid%", Long.toString(var4));
         this.field4442 = new class225();
         if (!class225.method5285(this.field4442, var1, var2, var3, 1692017433)) {
            this.field4442 = null;
         } else {
            if (null == this.field4552 || this.field4553 == null) {
               this.method8098((byte)-23);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Lei;J)V")
   @ObfuscatedName("ep")
   public void method8084(String var1, String var2, UrlRequester var3, long var4) {
      if (928687775 * this.type == 11 && var4 != -1L) {
         var1 = var1.replaceAll("%userid%", Long.toString(var4));
         this.field4442 = new class225();
         if (!class225.method5285(this.field4442, var1, var2, var3, 1136103126)) {
            this.field4442 = null;
         } else {
            if (null == this.field4552 || this.field4553 == null) {
               this.method8098((byte)-110);
            }
         }
      }
   }

   public void setOnMouseOverListener(Object[] var1) {
      this.field4547 = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("oo")
   public Widget method8226(int var1) {
      this.scrollY = var1 * 1603227665;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Loc;Liw;IZLoa;Lhu;Lha;B)Lky;")
   @ObfuscatedName("as")
   public Model getModel(
      WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7, byte var8
   ) {
      try {
         field4598 = false;
         int var9;
         int var10;
         if (var4) {
            var9 = this.modelType2 * -1556184641;
            var10 = this.modelId2 * 463905393;
         } else {
            var9 = 2124425241 * this.modelType;
            var10 = this.modelId * 94743803;
         }

         if (var9 == 0) {
            if (var8 == 1) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            if (1 == var9) {
               if (var8 == 1) {
                  throw new IllegalStateException();
               }

               if (var10 == -1) {
                  if (var8 == 1) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            }

            if (var7 != null) {
               if (var8 == 1) {
                  throw new IllegalStateException();
               }

               if (var7.useLocalPlayer) {
                  if (var8 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var9 == 6) {
                     if (var8 == 1) {
                        throw new IllegalStateException();
                     }

                     var9 = 3;
                  }
               }
            }

            long var11;
            label138: {
               var11 = var10 + (var9 << 16);
               if (var9 != 2) {
                  if (var8 == 1) {
                     throw new IllegalStateException();
                  }

                  if (6 != var9) {
                     break label138;
                  }
               }

               if (null == var6) {
                  if (var8 == 1) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               var11 = 1435750363 * var6.id + (var9 << 16);
            }

            if (null != var7) {
               if (var8 == 1) {
                  throw new IllegalStateException();
               }

               var11 |= 7709241557646364001L * var7.field2145 << 20;
            }

            Model var13 = (Model)class402.method8806(var1.Widget_cachedModels, var11);
            if (null == var13) {
               if (var8 == 1) {
                  throw new IllegalStateException();
               }

               ModelData var14 = null;
               int var15 = 64;
               int var16 = 768;
               switch (var9) {
                  case 1:
                     var14 = ModelData.ModelData_get(var1.field4408, var10, 0);
                     break;
                  case 2:
                     var14 = NPCComposition.method4677(var6, null, 196992464);
                     break;
                  case 3:
                     ModelData var10000;
                     if (var5 != null) {
                        if (var8 == 1) {
                           throw new IllegalStateException();
                        }

                        var10000 = var5.getModelData(-157617356);
                     } else {
                        var10000 = null;
                     }

                     var14 = var10000;
                     break;
                  case 4:
                     ItemComposition var17 = class150.ItemDefinition_get(var10, -1699058292);
                     var14 = var17.getModelData(10, (byte)-16);
                     var15 += var17.ambient * 689590731;
                     var16 += var17.contrast * 1596591697;
                  case 5:
                  default:
                     break;
                  case 6:
                     var14 = NPCComposition.method4677(var6, var7, 790311291);
               }

               if (var14 == null) {
                  if (var8 == 1) {
                     throw new IllegalStateException();
                  }

                  field4598 = true;
                  return null;
               }

               var13 = ModelData.method6106(var14, var15, var16, -50, -10, -50);
               var1.Widget_cachedModels.put(var13, var11);
            }

            if (var2 != null) {
               if (var8 == 1) {
                  throw new IllegalStateException();
               }

               var13 = SequenceDefinition.method5236(var2, var13, var3, (byte)0);
            }

            return var13;
         }
      } catch (RuntimeException var18) {
         throw RestClientThreadFactory.newRunException(var18, "of.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lei;)V")
   @ObfuscatedName("eu")
   public void method8086(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
      this.field4442 = new class225();
      if (!class225.method5285(this.field4442, var1, var3, var6, 618714871)) {
         this.field4442 = null;
      } else {
         if (this.field4552 == null || this.field4553 == null) {
            this.method8098((byte)-45);
         }

         this.field4442.method5288(var2, var4, var5, -399991700);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lei;)V")
   @ObfuscatedName("ex")
   public void method8087(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
      this.field4442 = new class225();
      if (!class225.method5285(this.field4442, var1, var3, var6, 1666010303)) {
         this.field4442 = null;
      } else {
         if (this.field4552 == null || this.field4553 == null) {
            this.method8098((byte)-33);
         }

         this.field4442.method5288(var2, var4, var5, 160580552);
      }
   }

   public int getRelativeX() {
      return this.x * -814361553;
   }

   public void setVarTransmitTrigger(int[] var1) {
      this.varTransmitTriggers = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lei;)V")
   @ObfuscatedName("et")
   public void method8088(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
      this.field4442 = new class225();
      if (!class225.method5285(this.field4442, var1, var3, var6, 856935274)) {
         this.field4442 = null;
      } else {
         if (this.field4552 == null || this.field4553 == null) {
            this.method8098((byte)-92);
         }

         this.field4442.method5288(var2, var4, var5, 883342456);
      }
   }

   public int getFontId() {
      return this.fontId * 137772531;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dw")
   boolean method8034() {
      return this.spriteFlipV || this.spriteFlipH || 0 != this.outline * -1211507623 || 0 != this.spriteShadow * 771853131;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("lo")
   public String method8227() {
      return this.text;
   }

   public void setTargetVerb(String var1) {
      this.spellActionName = var1;
   }

   public int getOriginalY() {
      return this.rawY * 1002768441;
   }

   public void setOnDialogAbortListener(Object[] var1) {
      this.field4587 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)I")
   @ObfuscatedName("jq")
   public static int method8131(Widget var0) {
      if (928687775 * var0.type == 11 && null != var0.field4442 && var0.field4553 != null && !var0.field4553.isEmpty()) {
         String var1 = class225.method5317(var0.field4442, (byte)53);
         return null != var1 && var0.field4553.containsKey(class225.method5317(var0.field4442, (byte)45)) ? (Integer)var0.field4553.get(var1) : -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fc")
   public int method8132() {
      if (928687775 * this.type == 11 && null != this.field4442 && this.field4553 != null && !this.field4553.isEmpty()) {
         String var1 = class225.method5317(this.field4442, (byte)43);
         return null != var1 && this.field4553.containsKey(class225.method5317(this.field4442, (byte)45)) ? (Integer)this.field4553.get(var1) : -1;
      } else {
         return -1;
      }
   }

   public int getDragDeadZone() {
      return this.dragZoneSize * -300326087;
   }

   public int getOpacity() {
      return this.transparencyTop * -2090288859;
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("cj")
   public Widget method8228(int var1) {
      this.modelAngleX = var1 * -1977744073;
      return this;
   }

   public boolean getTextShadowed() {
      return this.textShadowed;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lei;)V")
   @ObfuscatedName("ez")
   public void method8092(String var1, UrlRequester var2) {
      if (11 == 1159014344 * this.type && var1 != null) {
         this.field4442 = new class225();
         this.field4442.method5329(var1, var2, (byte)-52);
      }
   }

   public int getClickMask() {
      return this.flags * -1862035483;
   }

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/widgets/Widget;)Lof;")
   @ObfuscatedName("hm")
   public Widget method8229(net.runelite.api.widgets.Widget var1) {
      this.parent = (Widget)var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gb")
   public void method8154() {
      this.field4554 = new class376();

      for (int var1 = 1; var1 <= 12; var1++) {
         class28.method486(this.field4554.field4679, var1, 0, 1073409051);
      }

      for (char var2 = 0; var2 < ' '; var2++) {
         this.field4554.field4679.method488(var2, 0, -371900800);
      }

      this.field4554.field4679.method488('\u0080', 0, -371900800);
      class28.method486(this.field4554.field4679, 82, 2, 1998286769);
      class28.method486(this.field4554.field4679, 81, 2, 333548059);
      class28.method486(this.field4554.field4679, 86, 2, 185596114);
   }

   public void setOnReleaseListener(Object[] var1) {
      this.field4569 = var1;
   }

   public void setOnMouseLeaveListener(Object[] var1) {
      this.onMiscTransmit = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eo")
   void method8097() {
      this.field4552 = new HashMap();
      this.field4553 = new HashMap();
   }

   public int[] getVarTransmitTrigger() {
      return this.varTransmitTriggers;
   }

   public int getWidth() {
      return this.width * -1946208531;
   }

   @ObfuscatedSignature(descriptor = "(Loo;B)Z")
   @ObfuscatedName("br")
   boolean method8168(classOO var1, byte var2) {
      try {
         boolean var3 = false;
         if (null != this.text) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            if (!this.text.isEmpty()) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               var3 |= var1.method8378(MouseRecorder.method2641(this.text, 1286111589), -553575018);
               this.text = "";
            }
         }

         if (null != this.text2) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            if (!this.text2.isEmpty()) {
               var3 |= var1.method8382(MouseRecorder.method2641(this.text2, 1040807009), -299558079);
               this.text2 = "";
            }
         }

         return var3;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "of.br(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;ILjava/lang/Object;)V")
   @ObfuscatedName("tc")
   public static void method8075(Widget var0, int var1, Object var2) {
      if (var0 == null) {
         var0.setAnimationId(var1);
      }

      for (int var3 = 0; var3 < var0.field4548 * -25645663; var3++) {
         if (var1 == var0.field4596[var3]) {
            var0.field4591[var3] = var2;
            return;
         }
      }

      if (null == var0.field4591) {
         var0.field4596 = new int[4];
         var0.field4591 = new Object[4];
      } else if (-25645663 * var0.field4548 == var0.field4591.length) {
         var0.field4596 = Arrays.copyOf(var0.field4596, 2 * var0.field4596.length);
         var0.field4591 = Arrays.copyOf(var0.field4591, 2 * var0.field4591.length);
      }

      var0.field4596[var0.field4548 * -25645663] = var1;
      var0.field4591[-25645663 * var0.field4548] = var2;
      var0.field4548 += 528381537;
   }

   @ObfuscatedSignature(descriptor = "(B)Lbg;")
   @ObfuscatedName("bn")
   public class28 method8162(byte var1) {
      try {
         class28 var10000;
         if (null != this.field4554) {
            if (var1 != 13) {
               throw new IllegalStateException();
            }

            var10000 = this.field4554.field4679;
         } else {
            var10000 = null;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "of.bn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("fp")
   public boolean method8109(int var1, int var2, int var3, int var4) {
      if (11 == this.type * 928687775 && this.field4442 != null && this.method8113((byte)14)) {
         var1 -= var3;
         var2 -= var4;
         int var5 = (int)(this.field4442.method5320(-235201899)[0] * (this.width * -1946208531));
         int var6 = (int)(this.field4442.method5320(-108545604)[1] * (-905446999 * this.height));
         int var7 = var5 + (int)(this.field4442.method5320(-1437975195)[2] * (-1946208531 * this.width));
         int var8 = var6 + (int)(this.field4442.method5320(-87500676)[3] * (this.height * -905446999));
         return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
      } else {
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Ljava/lang/String;Lei;)V")
   @ObfuscatedName("sa")
   public static void method8093(Widget var0, String var1, UrlRequester var2) {
      if (11 == 928687775 * var0.type && var1 != null) {
         var0.field4442 = new class225();
         var0.field4442.method5329(var1, var2, (byte)-43);
      }
   }

   public void setForcedPosition(int var1, int var2) {
      this.field4432 = (short)var1;
      this.field4433 = (short)var2;
      this.setRelativeX(var1);
      this.setRelativeY(var2);
   }

   public int getScrollX() {
      return this.scrollX * 1068149169;
   }

   public Widget() {
      this.field4431 = -1;
      this.field4432 = -1;
      this.field4433 = -1;
      this.isIf3 = false;
      this.id = 1191270757;
      this.childIndex = -1657618603;
      this.buttonType = 0;
      this.contentType = 0;
      this.xAlignment = 0;
      this.yAlignment = 0;
      this.widthAlignment = 0;
      this.heightAlignment = 0;
      this.rawX = 0;
      this.rawY = 0;
      this.rawWidth = 0;
      this.rawHeight = 0;
      this.x = 0;
      this.method8177(-1);
      this.y = 0;
      this.method8180(-1);
      this.width = 0;
      this.height = 0;
      this.field4448 = 267374833;
      this.field4449 = 832576307;
      this.parentId = -155096849;
      this.field4451 = -912203661;
      this.isHidden = false;
      this.field4453 = -1930631033;
      this.field4454 = 0;
      this.scrollX = 0;
      this.scrollY = 0;
      this.scrollWidth = 0;
      this.scrollHeight = 0;
      this.color = 0;
      this.color2 = 0;
      this.mouseOverColor = 0;
      this.mouseOverColor2 = 0;
      this.fill = false;
      this.fillMode = FillMode.SOLID;
      this.transparencyTop = 0;
      this.transparencyBot = 0;
      this.lineWid = -249010551;
      this.field4526 = false;
      this.spriteId2 = -2092479471;
      this.spriteId = 18433963;
      this.spriteAngle = 0;
      this.spriteTiling = false;
      this.outline = 0;
      this.spriteShadow = 0;
      this.modelType = -1570196439;
      this.modelId = 1314816461;
      this.modelType2 = 1671589439;
      this.modelId2 = 1849631087;
      this.sequenceId = 12983575;
      this.sequenceId2 = -1782708003;
      this.modelOffsetX = 0;
      this.modelOffsetY = 0;
      this.modelAngleX = 0;
      this.modelAngleY = 0;
      this.modelAngleZ = 0;
      this.modelZoom = -609066812;
      this.field4546 = 0;
      this.field4473 = 0;
      this.modelOrthog = false;
      this.modelTransparency = false;
      this.itemQuantityMode = -440106714;
      this.fontId = 1824873669;
      this.text = "";
      this.text2 = "";
      this.textLineHeight = 0;
      this.textXAlignment = 0;
      this.textYAlignment = 0;
      this.textShadowed = false;
      this.flags = 0;
      this.field4460 = false;
      this.dataText = "";
      this.targetPriority = 1300706076;
      this.parent = null;
      this.dragZoneSize = 0;
      this.dragThreshold = 0;
      this.isScrollBar = false;
      this.spellActionName = "";
      this.hasListener = false;
      this.mouseOverRedirect = -1715318203;
      this.field4506 = "";
      this.buttonText = Strings.field5110;
      this.itemId = -1664178957;
      this.itemQuantity = 0;
      this.modelFrame = 0;
      this.modelFrameCycle = 0;
      this.field4571 = false;
      this.field4511 = false;
      this.field4512 = -1105714163;
      this.field4513 = 0;
      this.field4514 = 0;
      this.field4515 = 0;
      this.rootIndex = -1337068023;
      this.cycle = 1912289617;
      this.noClickThrough = false;
      this.noScrollThrough = false;
      this.prioritizeMenuEntry = false;
      this.field4521 = -61269807;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("be")
   void method8098(byte var1) {
      try {
         this.field4552 = new HashMap();
         this.field4553 = new HashMap();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "of.be(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;B)Ljava/lang/Object;")
   @ObfuscatedName("al")
   public Object method8068(int var1, Object var2, byte var3) {
      try {
         for (int var4 = 0; var4 < this.field4548 * -25645663; var4++) {
            if (this.field4596[var4] == var1) {
               if (var3 <= 5) {
                  throw new IllegalStateException();
               }

               return this.field4591[var4];
            }
         }

         return var2;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "of.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("sw")
   public void method8180(int var1) {
      if (this.field4433 > -1) {
         this.setRelativeY(this.field4433);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("do")
   public boolean method8061() {
      return !this.isIf3
         || 0 == 928687775 * this.type
         || this.type * 928687775 == 11
         || this.hasListener
         || 1338 == this.contentType * 1889823193
         || 928687775 * this.type == 12;
   }

   public int getWidthMode() {
      return this.widthAlignment * 831546695;
   }

   public String getText() {
      return this.method8227().replace(' ', ' ');
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("fg")
   public boolean method8114() {
      return this.field4521 * 1120367171 == 2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("fz")
   public int method8117(String var1) {
      return this.type * -601393954 == 11 && this.field4442 != null && this.method8113((byte)14) ? this.field4442.method5299(var1, -404123198) : -1;
   }

   public String getName() {
      return this.method8238().replace(' ', ' ');
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("kv")
   public Widget method8230(int var1) {
      this.contentType = var1 * 198280809;
      return this;
   }

   public int getTextColor() {
      return this.color * 7845467;
   }

   public int getYTextAlignment() {
      return this.textYAlignment * 1404399019;
   }

   public Rectangle getBounds() {
      return new Rectangle(this.field4430, this.field4431, this.getWidth(), this.getHeight());
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("yr")
   public Widget method8231(int var1) {
      this.rawY = var1 * -752065015;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("fq")
   public int method8118(String var1) {
      return this.type * 928687775 == 11 && this.field4442 != null && this.method8113((byte)14) ? this.field4442.method5299(var1, 234528313) : -1;
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("rp")
   public Widget method8232(int var1) {
      this.scrollWidth = var1 * 1897778137;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Lxt;)V")
   @ObfuscatedName("dc")
   void method8040(SpritePixels var1) {
      if (this.spriteFlipV) {
         var1.flipVertically();
      }

      if (this.spriteFlipH) {
         var1.flipHorizontally();
      }

      if (-1211507623 * this.outline > 0) {
         class380.method8274(var1, this.outline * -1211507623);
      }

      if (this.outline * -1211507623 >= 1) {
         var1.outline(1);
      }

      if (this.outline * -1211507623 >= 2) {
         var1.outline(16777215);
      }

      if (0 != this.spriteShadow * 771853131) {
         SpritePixels.method12643(var1, 771853131 * this.spriteShadow);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ds")
   public boolean method8062() {
      return !this.isIf3
         || 0 == 928687775 * this.type
         || this.type * 928687775 == 11
         || this.hasListener
         || 1338 == this.contentType * 1889823193
         || 928687775 * this.type == 12;
   }

   public boolean isIf3() {
      return this.isIf3;
   }

   public int getId() {
      return this.id * 278777747;
   }

   public net.runelite.api.widgets.Widget[] getDynamicChildren() {
      Widget var1 = SecureUrlRequester.client.method2371(this.id * 278777747);
      if (var1 == null) {
         return new net.runelite.api.widgets.Widget[0];
      } else {
         Widget[] var2 = var1.children;
         if (var2 == null) {
            return new net.runelite.api.widgets.Widget[0];
         } else {
            ArrayList var3 = new ArrayList();

            for (Widget var7 : var2) {
               if (var7 != null) {
                  assert var7.parentId * 794900977 == this.id * 278777747;

                  if (var7.field4451 * 1865628485 == this.childIndex * 2077538819) {
                     var3.add(var7);
                  }
               }
            }

            return var3.toArray(new Widget[0]);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Lof;")
   @ObfuscatedName("la")
   public Widget method8185(int var1, int var2, int var3, int var4) {
      return this.method8223(var1).method8231(var2).method8203(var3).method8217(var4);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fu")
   public int method8125() {
      return this.field4553 != null && !this.field4553.isEmpty() ? 1 : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fx")
   public int method8126() {
      return this.field4553 != null && !this.field4553.isEmpty() ? 1 : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fj")
   public int method8127() {
      return this.field4553 != null && !this.field4553.isEmpty() ? 1 : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fm")
   public int method8128() {
      return this.field4553 != null && !this.field4553.isEmpty() ? 1 : 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("fu")
   public Widget method8233(int var1) {
      this.rawWidth = var1 * 1403700735;
      return this;
   }

   public String getTargetVerb() {
      return this.spellActionName;
   }

   public boolean getNoScrollThrough() {
      return this.noScrollThrough;
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("ld")
   public Widget method8183(int var1) {
      return this.method8179(-1, var1);
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("er")
   public void method8076(int var1, Object var2) {
      for (int var3 = 0; var3 < this.field4548 * -25645663; var3++) {
         if (var1 == this.field4596[var3]) {
            this.field4591[var3] = var2;
            return;
         }
      }

      if (null == this.field4591) {
         this.field4596 = new int[4];
         this.field4591 = new Object[4];
      } else if (-25645663 * this.field4548 == this.field4591.length) {
         this.field4596 = Arrays.copyOf(this.field4596, 2 * this.field4596.length);
         this.field4591 = Arrays.copyOf(this.field4591, 2 * this.field4591.length);
      }

      this.field4596[this.field4548 * -25645663] = var1;
      this.field4591[-25645663 * this.field4548] = var2;
      this.field4548 += 528381537;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lof;")
   @ObfuscatedName("qo")
   public Widget method8188(String var1) {
      this.method8198(var1.replace(' ', ' '));
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)[I")
   @ObfuscatedName("aw")
   int[] readListenerTriggers(Buffer var1, byte var2) {
      try {
         int var3 = var1.readUnsignedByte(869485992);
         if (var3 == 0) {
            if (var2 != 2) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int[] var4 = new int[var3];

            for (int var5 = 0; var5 < var3; var5++) {
               if (var2 != 2) {
                  throw new IllegalStateException();
               }

               var4[var5] = Buffer.method12015(var1, -67520658);
            }

            return var4;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "of.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gn")
   public String method8136() {
      if (this.type * 756604545 == 11 && null != this.field4442) {
         String var1 = class225.method5317(this.field4442, (byte)77);

         for (classJO var3 : this.field4442.method5314(1728613729)) {
            String var4 = String.format("%%%S%%", var3.method6146((byte)0));
            if (var3.vmethod194(831184507) == 0) {
               var1.replaceAll(var4, Integer.toString(var3.vmethod196(497178271)));
            } else {
               var1.replaceAll(var4, var3.vmethod207(1380857227));
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("gm")
   public int[] method8139() {
      if (928687775 * this.type == 11 && null != this.field4442) {
         int[] var1 = new int[3];
         int var2 = 0;

         for (classJO var4 : this.field4442.method5314(-78514867)) {
            if (!var4.method6146((byte)0).equals("user_id")) {
               if (var4.vmethod194(1210725989) != 0) {
                  return null;
               }

               var1[var2++] = var4.vmethod196(497178271);
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

   @ObfuscatedSignature(descriptor = "(Loc;)Lsl;")
   @ObfuscatedName("mm")
   public AbstractFont method8234(WidgetDefinition var1) {
      return this.getFont(var1, -1094266041);
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("gd")
   public int[] method8140() {
      if (-730410690 * this.type == 11 && null != this.field4442) {
         int[] var1 = new int[3];
         int var2 = 0;

         for (classJO var4 : this.field4442.method5314(-398108906)) {
            if (!var4.method6146((byte)0).equals("user_id")) {
               if (var4.vmethod194(1177387524) != 0) {
                  return null;
               }

               var1[var2++] = var4.vmethod196(497178271);
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

   public void setBorderType(int var1) {
      this.outline = var1 * 217033705;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)V")
   @ObfuscatedName("ef")
   public void method8077(int var1, Object var2) {
      for (int var3 = 0; var3 < this.field4548 * -25645663; var3++) {
         if (var1 == this.field4596[var3]) {
            this.field4591[var3] = var2;
            return;
         }
      }

      if (null == this.field4591) {
         this.field4596 = new int[4];
         this.field4591 = new Object[4];
      } else if (-25645663 * this.field4548 == this.field4591.length) {
         this.field4596 = Arrays.copyOf(this.field4596, 2 * this.field4596.length);
         this.field4591 = Arrays.copyOf(this.field4591, 2 * this.field4591.length);
      }

      this.field4596[this.field4548 * -25645663] = var1;
      this.field4591[-25645663 * this.field4548] = var2;
      this.field4548 += 528381537;
   }

   public int getRotationY() {
      return this.modelAngleZ * 1415481045;
   }

   public void setChildren(net.runelite.api.widgets.Widget[] var1) {
      if (this.getType() != 0) {
         throw new UnsupportedOperationException("children can only be set on type layer widgets");
      } else if (this.childIndex * 2077538819 != -1) {
         throw new UnsupportedOperationException("only static widgets may have children");
      } else {
         this.children = (Widget[])var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Loc;Lei;)Lxt;")
   @ObfuscatedName("dd")
   SpritePixels method8031(WidgetDefinition var1, UrlRequester var2) {
      if (this.field4540 != null && var2 != null) {
         classOT var3 = (classOT)class498.method10645(var1.field4406, this.field4540, 1934219016);
         if (null == var3) {
            var3 = new classOT(this.field4540, var2);
            var1.field4406.method10647(this.field4540, var3, 1904929083);
         }

         return var3.method8663((byte)111);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Loc;Lei;)Z")
   @ObfuscatedName("gg")
   public boolean method8146(WidgetDefinition var1, UrlRequester var2) {
      if (928687775 * this.type == 11 && this.field4442 != null) {
         this.field4442.method5290(var2, -1589921768);
         if (this.field4442.method5295(333565326) != this.field4521 * -1348354097) {
            this.field4521 = this.field4442.method5295(333565326) * 61269807;
            if (this.field4521 * -1348354097 >= 3) {
               return true;
            }

            if (2 == this.field4521 * -1348354097) {
               this.method8147(var1, (byte)0);
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public boolean hasListener() {
      return this.hasListener;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Ljava/lang/String;I)V")
   @ObfuscatedName("cw")
   public static void method8103(Widget var0, String var1, int var2) {
      if (928687775 * var0.type == 11) {
         if (var0.field4553 == null) {
            var0.method8098((byte)-64);
         }

         var0.field4553.put(var1, var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(Loc;)V")
   @ObfuscatedName("gy")
   void method8148(WidgetDefinition var1) {
      this.noClickThrough = true;
      ArrayList var2 = this.field4442.method5310(713856017);
      ArrayList var3 = class225.method5312(this.field4442, 1692471898);
      int var4 = var2.size() + var3.size();
      this.children = new Widget[var4];
      int var5 = 0;

      for (class226 var7 : var2) {
         Widget var8 = WorldMapRectangle.method7260(5, this, var5, 0, 0, 0, 0, var7.field2774, -447687830);
         var8.field4540 = var7.field2777.method3932(975240029);
         classOT var9 = new classOT(var7.field2777);
         var1.field4406.method10647(var8.field4540, var9, -1190486650);
         this.children[var5++] = var8;
      }

      for (class237 var11 : var3) {
         Widget var12 = WorldMapRectangle.method7260(4, this, var5, 0, 0, 0, 0, var11.field2822, 2076085122);
         var12.text = var11.field2828;
         var12.fontId = (Integer)this.field4552.get(46220593 * var11.field2821) * -1824873669;
         var12.textXAlignment = var11.field2819 * 882394383;
         var12.textYAlignment = -747353673 * var11.field2820;
         this.children[var5++] = var12;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lof;")
   @ObfuscatedName("zs")
   public Widget method8179(int var1, int var2) {
      if (!SecureUrlRequester.client.isClientThread()) {
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
         int var10001 = this.id * 278777747;
         var3.id = this.id * 278777747 * -1191270757;
         var3.parentId = var10001 * 155096849;
         var3.field4451 = this.childIndex * 2077538819 * 912203661;
         var3.method8201(true);
         Widget var4 = SecureUrlRequester.client.method2371(this.id * 278777747);
         if (var4 == null) {
            throw new IllegalStateException("createChild called on unloaded component");
         } else {
            assert var4 == this || this.childIndex * 2077538819 != -1;

            Widget[] var5 = var4.children;
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
               var4.children = var5;
            } else if (var5.length <= var1) {
               Widget[] var7 = new Widget[var1 + 1];
               System.arraycopy(var5, 0, var7, 0, var5.length);
               var5 = var7;
               var4.children = var7;
            }

            var5[var1] = var3;
            var3.childIndex = var1 * 1657618603;
            if (this.childIndex * 2077538819 > -1) {
               assert this.getType() == 0;

               if (var1 > this.field4454 * -86298045) {
                  this.field4454 = var1 * -593417621;
               }

               if (var1 < this.field4453 * -1516264759) {
                  this.field4453 = var1 * -1970530439;
               }
            }

            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Loc;)V")
   @ObfuscatedName("gj")
   void method8149(WidgetDefinition var1) {
      this.noClickThrough = true;
      ArrayList var2 = this.field4442.method5310(-79423887);
      ArrayList var3 = class225.method5312(this.field4442, -1434623169);
      int var4 = var2.size() + var3.size();
      this.children = new Widget[var4];
      int var5 = 0;

      for (class226 var7 : var2) {
         Widget var8 = WorldMapRectangle.method7260(5, this, var5, 0, 0, 0, 0, var7.field2774, -1364886153);
         var8.field4540 = var7.field2777.method3932(756655094);
         classOT var9 = new classOT(var7.field2777);
         var1.field4406.method10647(var8.field4540, var9, -811784896);
         this.children[var5++] = var8;
      }

      for (class237 var11 : var3) {
         Widget var12 = WorldMapRectangle.method7260(4, this, var5, 0, 0, 0, 0, var11.field2822, -315330303);
         var12.text = var11.field2828;
         var12.fontId = (Integer)this.field4552.get(46220593 * var11.field2821) * -401672563;
         var12.textXAlignment = var11.field2819 * 891557411;
         var12.textYAlignment = -748347291 * var11.field2820;
         this.children[var5++] = var12;
      }
   }

   public int getContentType() {
      return this.contentType * 1889823193;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ax")
   public static String method8121(Widget var0, String var1) {
      return 11 == var0.type * 928687775 && var0.field4442 != null && var0.method8113((byte)14) ? var0.field4442.method5304(var1, 171450885) : null;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("af")
   public int method8071(int var1, int var2, int var3) {
      try {
         for (int var4 = 0; var4 < -25645663 * this.field4548; var4++) {
            if (var3 >= 610780255) {
               throw new IllegalStateException();
            }

            if (this.field4596[var4] == var1) {
               if (var3 >= 610780255) {
                  throw new IllegalStateException();
               }

               return (Integer)this.field4591[var4];
            }
         }

         return var2;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "of.af(" + 41);
      }
   }

   public boolean isFilled() {
      return this.fill;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Loc;)Lsu;")
   @ObfuscatedName("af")
   public static Font method8044(Widget var0, WidgetDefinition var1) {
      if (var0 == null) {
         return var0.method8045(var1);
      } else {
         field4598 = false;
         if (var0.fontId * 1226804048 == -1) {
            return null;
         } else {
            Font var2 = (Font)class402.method8806(var1.Widget_cachedFonts, var0.fontId * 137772531);
            if (var2 != null) {
               return var2;
            } else {
               AbstractArchive var4 = var1.field4409;
               AbstractArchive var5 = var1.field4410;
               int var6 = 137772531 * var0.fontId;
               Font var3;
               if (!FloorOverlayDefinition.method5355(var4, var6, 0, -1366279867)) {
                  var3 = null;
               } else {
                  var3 = class181.method4267(var5.getFile(var6, 0, 1431984358), 16777215);
               }

               if (var3 != null) {
                  var1.Widget_cachedFonts.put(var3, var0.fontId * 137772531);
               } else {
                  field4598 = true;
               }

               return var3;
            }
         }
      }
   }

   public int getLineHeight() {
      return this.textLineHeight * -1315307335;
   }

   @ObfuscatedSignature(descriptor = "(Loc;)V")
   @ObfuscatedName("ga")
   void method8150(WidgetDefinition var1) {
      this.noClickThrough = true;
      ArrayList var2 = this.field4442.method5310(838342701);
      ArrayList var3 = class225.method5312(this.field4442, -122156603);
      int var4 = var2.size() + var3.size();
      this.children = new Widget[var4];
      int var5 = 0;

      for (class226 var7 : var2) {
         Widget var8 = WorldMapRectangle.method7260(5, this, var5, 0, 0, 0, 0, var7.field2774, 193326335);
         var8.field4540 = var7.field2777.method3932(1296419888);
         classOT var9 = new classOT(var7.field2777);
         var1.field4406.method10647(var8.field4540, var9, 1439361919);
         this.children[var5++] = var8;
      }

      for (class237 var11 : var3) {
         Widget var12 = WorldMapRectangle.method7260(4, this, var5, 0, 0, 0, 0, var11.field2822, -328416910);
         var12.text = var11.field2828;
         var12.fontId = (Integer)this.field4552.get(46220593 * var11.field2821) * -1403710822;
         var12.textXAlignment = var11.field2819 * 1559906390;
         var12.textYAlignment = -747353673 * var11.field2820;
         this.children[var5++] = var12;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gw")
   public void method8155() {
      this.field4554 = new class376();

      for (int var1 = 1; var1 <= 12; var1++) {
         class28.method486(this.field4554.field4679, var1, 0, 1346504313);
      }

      for (char var2 = 0; var2 < ' '; var2++) {
         this.field4554.field4679.method488(var2, 0, -371900800);
      }

      this.field4554.field4679.method488('\u0080', 0, -371900800);
      class28.method486(this.field4554.field4679, 82, 2, -232061186);
      class28.method486(this.field4554.field4679, 81, 2, 666130513);
      class28.method486(this.field4554.field4679, 86, 2, 2091979333);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("az")
   boolean method8035(int var1) {
      try {
         if (!this.spriteFlipV) {
            if (var1 != -1530880556) {
               throw new IllegalStateException();
            }

            if (!this.spriteFlipH) {
               if (var1 != -1530880556) {
                  throw new IllegalStateException();
               }

               if (0 == this.outline * -1211507623) {
                  if (var1 != -1530880556) {
                     throw new IllegalStateException();
                  }

                  if (0 == this.spriteShadow * 771853131) {
                     return false;
                  }
               }
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "of.az(" + ')');
      }
   }

   public void setDragDeadTime(int var1) {
      this.dragThreshold = var1 * 2011961339;
   }

   public void setRelativeX(int var1) {
      this.x = var1 * -890506545;
   }

   @ObfuscatedSignature(descriptor = "(Loc;Lei;B)Lxt;")
   @ObfuscatedName("ay")
   SpritePixels method8027(WidgetDefinition var1, UrlRequester var2, byte var3) {
      try {
         if (!this.method8035(-1530880556)) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               return this.method8028(var1, var2, 1264947430);
            }
         } else {
            StringBuilder var10000 = new StringBuilder().append(this.field4540);
            byte var10001;
            if (this.spriteFlipV) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var10000 = var10000.append((int)var10001);
            if (this.spriteFlipH) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            String var4 = var10000.append((int)var10001).append(-1211507623 * this.outline).append(771853131 * this.spriteShadow).toString();
            SpritePixels var5 = (SpritePixels)class498.method10645(var1.field4402, var4, 1934219016);
            if (null == var5) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               }

               SpritePixels var6 = this.method8028(var1, var2, 1092051472);
               if (var6 != null) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var5 = var6.method12613();
                  this.method8037(var5, (byte)-77);
                  var1.field4402.method10647(var4, var5, -422634290);
               }
            }

            return var5;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "of.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lom;")
   @ObfuscatedName("gh")
   public class372 method8159() {
      return null != this.field4554 ? this.field4554.field4677 : null;
   }

   public void deleteAllChildren() {
      if (this.method8208() != null) {
         Arrays.fill(this.method8208(), null);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lom;")
   @ObfuscatedName("gl")
   public class372 method8160() {
      return null != this.field4554 ? this.field4554.field4677 : null;
   }

   @ObfuscatedSignature(descriptor = "()Lbg;")
   @ObfuscatedName("gx")
   public class28 method8163() {
      return null != this.field4554 ? this.field4554.field4679 : null;
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("tm")
   public Widget method8235(int var1) {
      this.scrollX = var1 * -1597374639;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Loc;Liw;IZLoa;Lhu;Lha;)Lky;")
   @ObfuscatedName("dr")
   public Model method8049(
      WidgetDefinition var1, SequenceDefinition var2, int var3, boolean var4, PlayerComposition var5, NPCComposition var6, NpcOverrides var7
   ) {
      field4598 = false;
      int var8;
      int var9;
      if (var4) {
         var8 = this.modelType2 * -1556184641;
         var9 = this.modelId2 * 463905393;
      } else {
         var8 = 2124425241 * this.modelType;
         var9 = this.modelId * 94743803;
      }

      if (var8 == 0) {
         return null;
      } else if (1 == var8 && var9 == -1) {
         return null;
      } else {
         if (var7 != null && var7.useLocalPlayer && var8 == 6) {
            var8 = 3;
         }

         long var10 = var9 + (var8 << 16);
         if (var8 == 2 || 6 == var8) {
            if (null == var6) {
               return null;
            }

            var10 = 1435750363 * var6.id + (var8 << 16);
         }

         if (null != var7) {
            var10 |= 7709241557646364001L * var7.field2145 << 20;
         }

         Model var12 = (Model)class402.method8806(var1.Widget_cachedModels, var10);
         if (null == var12) {
            ModelData var13 = null;
            int var14 = 195411761;
            int var15 = -655305409;
            switch (var8) {
               case 1:
                  var13 = ModelData.ModelData_get(var1.field4408, var9, 0);
                  break;
               case 2:
                  var13 = NPCComposition.method4677(var6, null, -513745916);
                  break;
               case 3:
                  var13 = var5 != null ? var5.getModelData(-53903071) : null;
                  break;
               case 4:
                  ItemComposition var16 = class150.ItemDefinition_get(var9, -962931586);
                  var13 = var16.getModelData(10, (byte)-52);
                  var14 += var16.ambient * 689590731;
                  var15 += var16.contrast * -2132672441;
               case 5:
               default:
                  break;
               case 6:
                  var13 = NPCComposition.method4677(var6, var7, 1756177897);
            }

            if (var13 == null) {
               field4598 = true;
               return null;
            }

            var12 = ModelData.method6106(var13, var14, var15, -50, 1715378050, 897807665);
            var1.Widget_cachedModels.put(var12, var10);
         }

         if (var2 != null) {
            var12 = SequenceDefinition.method5236(var2, var12, var3, (byte)0);
         }

         return var12;
      }
   }

   public boolean isHidden() {
      if (!SecureUrlRequester.client.isClientThread()) {
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
            if (WidgetUtil.componentToInterface(this.getId()) != SecureUrlRequester.client.getTopLevelInterfaceId()) {
               return true;
            }
         } else if (var1.isHidden()) {
            return true;
         }

         return false;
      }
   }

   public int getScrollHeight() {
      return this.scrollHeight * -1963554889;
   }

   @ObfuscatedSignature(descriptor = "()Lop;")
   @ObfuscatedName("gp")
   public class376 method8165() {
      return this.field4554;
   }

   public int getIndex() {
      return this.childIndex * 2077538819;
   }

   @ObfuscatedSignature(descriptor = "()Lop;")
   @ObfuscatedName("gc")
   public class376 method8166() {
      return this.field4554;
   }

   @ObfuscatedSignature(descriptor = "(Loo;)Z")
   @ObfuscatedName("gi")
   boolean method8169(classOO var1) {
      boolean var2 = false;
      if (null != this.text && !this.text.isEmpty()) {
         var2 |= var1.method8378(MouseRecorder.method2641(this.text, 1254039896), -1193854358);
         this.text = "";
      }

      if (null != this.text2 && !this.text2.isEmpty()) {
         var2 |= var1.method8382(MouseRecorder.method2641(this.text2, 1248593028), -1033087421);
         this.text2 = "";
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lei;)V")
   @ObfuscatedName("ei")
   public void method8089(String var1, String var2, String var3, String var4, String var5, UrlRequester var6) {
      this.field4442 = new class225();
      if (!class225.method5285(this.field4442, var1, var3, var6, 2106835199)) {
         this.field4442 = null;
      } else {
         if (this.field4552 == null || this.field4553 == null) {
            this.method8098((byte)-105);
         }

         this.field4442.method5288(var2, var4, var5, -728591067);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lei;)V")
   @ObfuscatedName("ey")
   public void method8094(String var1, UrlRequester var2) {
      if (11 == -468868827 * this.type && var1 != null) {
         this.field4442 = new class225();
         this.field4442.method5329(var1, var2, (byte)-62);
      }
   }

   public int getRotationZ() {
      return this.modelAngleY * 1629507461;
   }

   @ObfuscatedSignature(descriptor = "(Loa;Z)V")
   @ObfuscatedName("hi")
   public void method8174(PlayerComposition var1, boolean var2) {
      this.modelType = 1893526815;
      this.field4497 = new PlayerComposition(var1);
      if (!var2) {
         this.field4497.equipment = Arrays.copyOf(this.field4497.field4383, this.field4497.field4383.length);
         this.field4497.method7922((byte)-91);
      }
   }

   public int getRotationX() {
      return this.modelAngleX * 751747207;
   }

   @ObfuscatedSignature(descriptor = "(Loa;Z)V")
   @ObfuscatedName("hg")
   public void method8175(PlayerComposition var1, boolean var2) {
      this.modelType = 1893526815;
      this.field4497 = new PlayerComposition(var1);
      if (!var2) {
         this.field4497.equipment = Arrays.copyOf(this.field4497.field4383, this.field4497.field4383.length);
         this.field4497.method7922((byte)70);
      }
   }

   public net.runelite.api.widgets.Widget[] getStaticChildren() {
      if (this.childIndex * 2077538819 > -1) {
         return new net.runelite.api.widgets.Widget[0];
      } else {
         ArrayList var1 = new ArrayList();

         for (Widget var5 : SecureUrlRequester.client.method2318(WidgetUtil.componentToInterface(this.id * 278777747))) {
            if (var5 != null && var5.parentId * 794900977 == this.id * 278777747) {
               var1.add(var5);
            }
         }

         return var1.toArray(new Widget[0]);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIZI)V")
   @ObfuscatedName("ks")
   static void addTileItemToGroundItems(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, int var10) {
      try {
         WorldEntityCoordSnapshot.method10799(AsyncHttpResponse.worldView, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, 702248967);
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "of.ks(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Loc;)Lsu;")
   @ObfuscatedName("dz")
   public Font method8045(WidgetDefinition var1) {
      field4598 = false;
      if (this.contentType * 1226804048 == -1) {
         return null;
      } else {
         Font var2 = (Font)class402.method8806(var1.Widget_cachedSprites, this.heightAlignment * 137772531);
         if (var2 != null) {
            return var2;
         } else {
            AbstractArchive var4 = var1.field4411;
            AbstractArchive var5 = var1.field4411;
            int var6 = 137772531 * this.rawHeight;
            Font var3;
            if (!FloorOverlayDefinition.method5355(var4, var6, 0, -1366279867)) {
               var3 = null;
            } else {
               var3 = class181.method4267(var5.getFile(var6, 0, 1431984358), 16777215);
            }

            if (var3 != null) {
               var1.Widget_cachedSpriteMasks.put(var3, this.modelFrame * 137772531);
            } else {
               field4598 = true;
            }

            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("ax")
   public Widget method8236(int var1) {
      this.spriteId2 = var1 * 2092479471;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ar")
   public boolean method8036(int var1) {
      try {
         if (!this.isIf3) {
            if (var1 != -1530880556) {
               throw new IllegalStateException();
            }

            if (!this.textShadowed) {
               if (var1 != -1530880556) {
                  throw new IllegalStateException();
               }

               if (0 == this.field4451 * -1211507623) {
                  if (var1 != -1530880556) {
                     throw new IllegalStateException();
                  }

                  if (0 == this.sequenceId2 * 771853131) {
                     return false;
                  }
               }
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "of.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;IIII)Z")
   @ObfuscatedName("vz")
   public static boolean method8110(Widget var0, int var1, int var2, int var3, int var4) {
      if (11 == var0.type * 928687775 && var0.field4442 != null && var0.method8113((byte)14)) {
         var1 -= var3;
         var2 -= var4;
         int var5 = (int)(var0.field4442.method5320(-1314458301)[0] * (var0.width * -1946208531));
         int var6 = (int)(var0.field4442.method5320(-1307137431)[1] * (-905446999 * var0.height));
         int var7 = var5 + (int)(var0.field4442.method5320(-1377874282)[2] * (-1946208531 * var0.width));
         int var8 = var6 + (int)(var0.field4442.method5320(-715938177)[3] * (var0.height * -905446999));
         return var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8;
      } else {
         return false;
      }
   }

   public void revalidateScroll() {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         SecureUrlRequester.client.method2558(this);
         SecureUrlRequester.client.method2575(class226.widgetDefinition.Widget_interfaceComponents[WidgetUtil.componentToInterface(this.getId())], this, false);
      }
   }

   public int getType() {
      return this.type * 928687775;
   }

   public net.runelite.api.widgets.Widget[] getNestedChildren() {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (this.childIndex * 2077538819 > -1) {
         return new net.runelite.api.widgets.Widget[0];
      } else {
         InterfaceParent var1 = (InterfaceParent)classUQ.method11202(client.interfaceParents, this.id * 278777747);
         if (var1 == null) {
            return new Widget[0];
         } else {
            int var2 = var1.getId();
            ArrayList var3 = new ArrayList();

            for (Widget var7 : SecureUrlRequester.client.method2318(var2)) {
               if (var7 != null && var7.parentId * 794900977 == -1) {
                  var3.add(var7);
               }
            }

            return var3.toArray(new Widget[0]);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;B)V")
   @ObfuscatedName("am")
   public void method8078(int var1, Object var2, byte var3) {
      try {
         for (int var4 = 0; var4 < this.modelId2 * -25645663; var4++) {
            if (var3 == -10) {
               throw new IllegalStateException();
            }

            if (var1 == this.field4596[var4]) {
               if (var3 == -10) {
                  throw new IllegalStateException();
               }

               this.field4591[var4] = var2;
               return;
            }
         }

         if (null == this.field4591) {
            if (var3 == -10) {
               throw new IllegalStateException();
            }

            this.field4596 = new int[4];
            this.field4591 = new Object[4];
         } else if (-25645663 * this.modelId2 == this.field4591.length) {
            this.field4596 = Arrays.copyOf(this.field4485, 2 * this.field4550.length);
            this.field4591 = Arrays.copyOf(this.field4591, 2 * this.field4591.length);
         }

         this.field4550[this.modelId2 * -25645663] = var1;
         this.field4591[-25645663 * this.field4548] = var2;
         this.modelId2 = this.field4521 + 528381537;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "of.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lei;I)V")
   @ObfuscatedName("aq")
   public void method8095(String var1, UrlRequester var2, int var3) {
      try {
         if (11 == 928687775 * this.type) {
            if (var3 <= 580873938) {
               throw new IllegalStateException();
            }

            if (var1 != null) {
               this.field4442 = new class225();
               this.field4442.method5329(var1, var2, (byte)-96);
               return;
            }

            if (var3 <= 580873938) {
               throw new IllegalStateException();
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "of.aq(" + ')');
      }
   }

   public int getAnimationId() {
      return this.sequenceId * -750054055;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("bb")
   public String method8122(String var1, int var2) {
      try {
         if (11 == this.textYAlignment * 928687775 && this.field4442 != null) {
            if (var2 <= -254588185) {
               throw new IllegalStateException();
            }

            if (this.method8113((byte)14)) {
               return this.field4442.method5304(var1, 273409166);
            }

            if (var2 <= -254588185) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "of.bb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("dg")
   public Widget method8237(int var1) {
      this.modelId = var1 * -1314816461;
      return this;
   }

   public boolean getSpriteTiling() {
      return this.spriteTiling;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("si")
   public static String method8123(Widget var0, String var1) {
      return 11 == var0.type * 928687775 && var0.field4442 != null && var0.method8113((byte)14) ? var0.field4442.method5304(var1, -1105634134) : null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("eb")
   public String method8238() {
      return this.dataText;
   }

   @ObfuscatedSignature(descriptor = "(I)Lix;")
   @ObfuscatedName("bu")
   public class225 method8142(int var1) {
      try {
         return this.field4442;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "of.bu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;ILjava/lang/Object;B)V")
   @ObfuscatedName("tb")
   public static void method8079(Widget var0, int var1, Object var2, byte var3) {
      if (var0 == null) {
         var0.method8078(var1, var2, var3);
      }

      try {
         for (int var4 = 0; var4 < var0.field4548 * -25645663; var4++) {
            if (var3 == -10) {
               throw new IllegalStateException();
            }

            if (var1 == var0.field4596[var4]) {
               if (var3 == -10) {
                  throw new IllegalStateException();
               }

               var0.field4591[var4] = var2;
               return;
            }
         }

         if (null == var0.field4591) {
            if (var3 == -10) {
               throw new IllegalStateException();
            }

            var0.field4596 = new int[4];
            var0.field4591 = new Object[4];
         } else if (-25645663 * var0.field4548 == var0.field4591.length) {
            var0.field4596 = Arrays.copyOf(var0.field4596, 2 * var0.field4596.length);
            var0.field4591 = Arrays.copyOf(var0.field4591, 2 * var0.field4591.length);
         }

         var0.field4596[var0.field4548 * -25645663] = var1;
         var0.field4591[-25645663 * var0.field4548] = var2;
         var0.field4548 += 528381537;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "of.am(" + ')');
      }
   }

   public void setNoClickThrough(boolean var1) {
      this.noClickThrough = var1;
   }

   public int getScrollY() {
      return this.scrollY * -497311503;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bj")
   public int method8129(int var1) {
      try {
         byte var10000;
         if (this.field4552 != null && !this.field4552.isEmpty()) {
            if (var1 >= -1446344081) {
               throw new IllegalStateException();
            }

            var10000 = 1;
         } else {
            var10000 = 0;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "of.bj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Loa;Z)V")
   @ObfuscatedName("hy")
   public void method8176(PlayerComposition var1, boolean var2) {
      this.cycle = -721102372;
      this.field4497 = new PlayerComposition(var1);
      if (!var2) {
         this.field4497.equipment = Arrays.copyOf(this.field4497.field4383, this.field4497.bodyColors.length);
         this.field4497.method7922((byte)4);
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;I)[Ljava/lang/Object;")
   @ObfuscatedName("at")
   Object[] method7999(Object[] var1, int var2) {
      try {
         Object[] var10000;
         if (var1 != null) {
            if (var2 != -235863823) {
               throw new IllegalStateException();
            }

            var10000 = Arrays.copyOf(var1, var1.length);
         } else {
            var10000 = null;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "of.at(" + ')');
      }
   }
}
