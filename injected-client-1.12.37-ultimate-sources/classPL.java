import net.runelite.api.IterableHashTable;
import net.runelite.api.NPCComposition;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pl")
public class classPL extends classVJ implements NPCComposition, rl9 {
   @ObfuscatedName("do")
   final int field5324;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ae")
   public static classVA field5294;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ab")
   public static classVA field5290;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field5340 = 12;
   @ObfuscatedName("dk")
   final short[] field5316;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field5341 = 34;
   @ObfuscatedName("dv")
   final int field5323;
   @ToRemove(unused = "true")
   @ObfuscatedName("bn")
   static final int field5343 = 79;
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   static final int field5342 = 102;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("co")
   static classJZ field5337 = new classJZ(50);
   @ToRemove(unused = "true")
   @ObfuscatedName("cd")
   static final int field5346 = 251;
   @ObfuscatedName("df")
   final int field5297;
   @ObfuscatedName("eo")
   public final boolean field5334;
   @ObfuscatedName("ck")
   public final int field5302;
   @ObfuscatedName("ca")
   String field5293;
   @ObfuscatedName("cc")
   public final int field5284;
   @ObfuscatedName("cf")
   final int[] field5292;
   @ObfuscatedName("dy")
   public final int field5303;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("cy")
   static classJZ field5336 = new classJZ(64);
   @ObfuscatedName("cz")
   public final int field5291;
   @ObfuscatedName("cg")
   public final int field5307;
   @ObfuscatedName("cw")
   public final int field5285;
   @ObfuscatedName("cj")
   public final int field5308;
   @ObfuscatedName("ci")
   public final int field5286;
   @ObfuscatedName("cx")
   public final int field5309;
   @ObfuscatedName("ce")
   public final int field5281;
   @ObfuscatedName("cm")
   public final int field5310;
   @ObfuscatedName("dc")
   public final int field5301;
   @ObfuscatedName("dd")
   public final int field5311;
   @ToRemove(unused = "true")
   @ObfuscatedName("bq")
   static final int field5344 = 118;
   @ObfuscatedName("cn")
   final int[] field5304;
   @ObfuscatedName("dh")
   public final boolean field5319;
   @ObfuscatedName("di")
   public final int field5312;
   @ObfuscatedName("du")
   public final boolean field5313;
   @ObfuscatedName("dt")
   final short[] field5314;
   @ObfuscatedName("dr")
   public final short[] field5315;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   static final int field5338 = 77;
   @ObfuscatedName("db")
   public final short[] field5317;
   @ObfuscatedSignature(descriptor = "Lpo;")
   @ObfuscatedName("dw")
   final classPO field5318;
   @ObfuscatedName("ch")
   public final int field5306;
   @ObfuscatedName("ex")
   final int field5332;
   @ObfuscatedName("dz")
   final int field5321;
   @ObfuscatedName("dn")
   final int field5322;
   @ObfuscatedName("de")
   public final int field5320;
   @ObfuscatedName("dm")
   public final int field5282;
   @ObfuscatedName("dl")
   public final int[] field5325;
   @ObfuscatedName("dg")
   public final int field5299;
   @ObfuscatedName("dq")
   final int field5296;
   @ObfuscatedName("eh")
   final int[] field5329;
   @ObfuscatedName("ds")
   public final boolean field5326;
   @ObfuscatedName("dj")
   public final boolean field5327;
   @ObfuscatedName("en")
   final short[] field5331;
   @ObfuscatedName("dp")
   public final boolean field5295;
   @ObfuscatedName("ey")
   public final int field5288;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field5289 = 8;
   @ObfuscatedName("da")
   public final boolean field5328;
   @ObfuscatedName("eg")
   final int[] field5330;
   @ObfuscatedName("dx")
   public final int field5298;
   @rl8(method10126 = 16)
   @ObfuscatedSignature(descriptor = "Lyn;")
   @ObfuscatedName("ea")
   classYN field5300;
   @ObfuscatedName("eq")
   final boolean field5333;
   @ObfuscatedName("er")
   final int field5287;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field5339 = 33;
   @ObfuscatedSignature(descriptor = "Lwj;")
   @ObfuscatedName("et")
   public final classWJ field5283;
   @ObfuscatedSignature(descriptor = "Lww;")
   @ObfuscatedName("ew")
   public final classWW field5335;
   @ObfuscatedSignature(descriptor = "Loq;")
   @ObfuscatedName("eu")
   public final classOQ field5305;
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   static final int field5345 = 57;

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dc")
   public boolean method8996() {
      if (this.field5325 == null) {
         return -1 != this.field5283.field6689 * -1727985133 || this.field5335.field6785 != null;
      } else {
         int[] var1 = this.field5325;

         for (int var2 = 0; var2 < var1.length; var2++) {
            int var3 = var1[var2];
            if (-1 != var3) {
               classPL var4 = classOH.method8448(var3, -1200041233);
               if (-1 != -1727985133 * var4.field5283.field6689 || null != var4.field5335.field6785) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public int getSize() {
      return this.field5284 * -1216348145;
   }

   @ObfuscatedSignature(descriptor = "(I)Lpo;")
   @ObfuscatedName("af")
   classPO method8931(int var1) {
      try {
         return new classPO();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pl.af(" + ')');
      }
   }

   classPL(classXY var1, int var2) {
      this.field5302 = var2 * 827844159;
      String var3 = classKK.field3615;
      int var4 = 1;
      int[] var5 = null;
      int[] var6 = null;
      int var7 = -1;
      int var8 = -1;
      int var9 = -1;
      int var10 = -1;
      int var11 = -1;
      int var12 = -1;
      int var13 = -1;
      int var14 = -1;
      int var15 = -1;
      int var16 = -1;
      int var17 = -1;
      int var18 = -1;
      int var19 = -1;
      int var20 = -1;
      int var21 = -1;
      boolean var22 = false;
      short[] var23 = null;
      short[] var24 = null;
      short[] var25 = null;
      short[] var26 = null;
      classPO var27 = this.method8931(-835605451);
      boolean var28 = true;
      int var29 = -1;
      int var30 = 128;
      int var31 = 128;
      byte var32 = 0;
      int var33 = 0;
      int var34 = 32;
      int[] var35 = null;
      int var36 = -1;
      int var37 = -1;
      boolean var38 = true;
      boolean var39 = true;
      boolean var40 = false;
      boolean var41 = false;
      int var42 = -1;
      classYN var43 = null;
      int[] var44 = new int[]{1, 1, 1, 1, 1, 1};
      int[] var45 = null;
      short[] var46 = null;
      int var47 = -1;
      boolean var48 = false;
      int var49 = 39188;
      boolean var50 = true;
      classWJ var51 = new classWJ();
      classWW var52 = new classWW();
      classOQ var53 = classOQ.field5081;
      if (var1 != null && null != var1.field6954) {
         label299:
         while (true) {
            int var54 = classXY.method13039(var1, -346779531);
            switch (var54) {
               case 0:
                  break label299;
               case 1:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
               case 8:
               case 9:
               case 10:
               case 11:
               case 19:
               case 20:
               case 21:
               case 22:
               case 23:
               case 24:
               case 25:
               case 26:
               case 27:
               case 28:
               case 29:
               case 35:
               case 36:
               case 37:
               case 38:
               case 39:
               case 42:
               case 43:
               case 44:
               case 45:
               case 46:
               case 47:
               case 48:
               case 49:
               case 50:
               case 51:
               case 52:
               case 53:
               case 54:
               case 55:
               case 56:
               case 57:
               case 58:
               case 59:
               case 60:
               case 63:
               case 64:
               case 65:
               case 66:
               case 67:
               case 68:
               case 69:
               case 70:
               case 71:
               case 72:
               case 73:
               case 80:
               case 81:
               case 82:
               case 83:
               case 84:
               case 85:
               case 86:
               case 87:
               case 88:
               case 89:
               case 90:
               case 91:
               case 92:
               case 94:
               case 96:
               case 104:
               case 105:
               case 108:
               case 110:
               case 112:
               case 113:
               case 119:
               case 120:
               case 121:
               case 125:
               case 127:
               case 128:
               case 129:
               case 131:
               case 132:
               case 133:
               case 134:
               case 135:
               case 136:
               case 137:
               case 138:
               case 139:
               case 140:
               case 141:
               case 142:
               case 143:
               case 144:
               case 153:
               case 154:
               case 155:
               case 156:
               case 157:
               case 158:
               case 159:
               case 160:
               case 161:
               case 162:
               case 163:
               case 164:
               case 165:
               case 166:
               case 167:
               case 168:
               case 169:
               case 170:
               case 171:
               case 172:
               case 173:
               case 174:
               case 175:
               case 176:
               case 177:
               case 178:
               case 179:
               case 180:
               case 181:
               case 182:
               case 183:
               case 184:
               case 185:
               case 186:
               case 187:
               case 188:
               case 189:
               case 190:
               case 191:
               case 192:
               case 193:
               case 194:
               case 195:
               case 196:
               case 197:
               case 198:
               case 199:
               case 200:
               case 201:
               case 202:
               case 203:
               case 204:
               case 205:
               case 206:
               case 207:
               case 208:
               case 209:
               case 210:
               case 211:
               case 212:
               case 213:
               case 214:
               case 215:
               case 216:
               case 217:
               case 218:
               case 219:
               case 220:
               case 221:
               case 222:
               case 223:
               case 224:
               case 225:
               case 226:
               case 227:
               case 228:
               case 229:
               case 230:
               case 231:
               case 232:
               case 233:
               case 234:
               case 235:
               case 236:
               case 237:
               case 238:
               case 239:
               case 240:
               case 241:
               case 242:
               case 243:
               case 244:
               case 245:
               case 246:
               case 247:
               case 248:
               case 250:
               default:
                  break;
               case 2:
                  var3 = var1.method13071(1381224448);
                  break;
               case 12:
                  var4 = classXY.method13039(var1, -346779531);
                  break;
               case 13:
                  var7 = classXY.method13047(var1, -11551235);
                  break;
               case 14:
                  var10 = classXY.method13047(var1, 674915822);
                  break;
               case 15:
                  var8 = classXY.method13047(var1, 975161411);
                  break;
               case 16:
                  var9 = classXY.method13047(var1, -1694115320);
                  break;
               case 17:
                  var10 = classXY.method13047(var1, -525059563);
                  var11 = classXY.method13047(var1, 1819068317);
                  var12 = classXY.method13047(var1, -106680584);
                  var13 = classXY.method13047(var1, 1105178497);
                  break;
               case 18:
                  classXY.method13047(var1, -1614430796);
                  break;
               case 30:
               case 31:
               case 32:
               case 33:
               case 34:
               case 251:
               case 252:
               case 253:
                  classPO.method9044(var27, var1, var54, 30, 34, 251, 252, 253, 1161561653);
                  break;
               case 40:
                  int var70 = classXY.method13039(var1, -346779531);
                  var23 = new short[var70];
                  var24 = new short[var70];

                  for (int var78 = 0; var78 < var70; var78++) {
                     var23[var78] = (short)classXY.method13047(var1, -2087008104);
                     var24[var78] = (short)classXY.method13047(var1, 1175337329);
                  }
                  break;
               case 41:
                  int var69 = classXY.method13039(var1, -346779531);
                  var25 = new short[var69];
                  var26 = new short[var69];

                  for (int var77 = 0; var77 < var69; var77++) {
                     var25[var77] = (short)classXY.method13047(var1, 1006054699);
                     var26[var77] = (short)classXY.method13047(var1, -2139171520);
                  }
                  break;
               case 61:
                  int var68 = classXY.method13039(var1, -346779531);
                  var5 = new int[var68];

                  for (int var76 = 0; var76 < var68; var76++) {
                     var5[var76] = var1.method13117(classXM.field6888.field6890, 1716326015);
                  }
                  break;
               case 62:
                  int var67 = classXY.method13039(var1, -346779531);
                  var6 = new int[var67];

                  for (int var75 = 0; var75 < var67; var75++) {
                     var6[var75] = var1.method13117(classXM.field6888.field6890, 1518099007);
                  }
                  break;
               case 74:
                  var44[0] = classXY.method13047(var1, -1821699879);
                  break;
               case 75:
                  var44[1] = classXY.method13047(var1, -2120146721);
                  break;
               case 76:
                  var44[2] = classXY.method13047(var1, -1124357946);
                  break;
               case 77:
                  var44[3] = classXY.method13047(var1, -1693678342);
                  break;
               case 78:
                  var44[4] = classXY.method13047(var1, 336447020);
                  break;
               case 79:
                  var44[5] = classXY.method13047(var1, -1926068077);
                  break;
               case 93:
                  var28 = false;
                  break;
               case 95:
                  var29 = classXY.method13047(var1, 24265317);
                  break;
               case 97:
                  var30 = classXY.method13047(var1, 188656600);
                  break;
               case 98:
                  var31 = classXY.method13047(var1, 237873694);
                  break;
               case 99:
                  var53 = classOQ.field5079;
                  break;
               case 100:
                  var32 = classXY.method13043(var1, (byte)17);
                  break;
               case 101:
                  var33 = classXY.method13043(var1, (byte)17) * 5;
                  break;
               case 102:
                  int var66 = classXY.method13039(var1, -346779531);
                  int var74 = 0;

                  for (int var80 = var66; 0 != var80; var80 >>= 1) {
                     var74++;
                  }

                  var45 = new int[var74];
                  var46 = new short[var74];

                  for (int var81 = 0; var81 < var74; var81++) {
                     if ((var66 & 1 << var81) == 0) {
                        var45[var81] = -1;
                        var46[var81] = -1;
                     } else {
                        var45[var81] = classXY.method13110(var1, -324749371);
                        var46[var81] = (short)classXY.method13096(var1, -730728427);
                     }
                  }
                  break;
               case 103:
                  var34 = classXY.method13047(var1, 134377154);
                  break;
               case 106:
               case 118:
                  var36 = classXY.method13047(var1, -360424813);
                  if (var36 == 65535) {
                     var36 = -1;
                  }

                  var37 = classXY.method13047(var1, -635983963);
                  if (65535 == var37) {
                     var37 = -1;
                  }

                  int var65 = -1;
                  if (118 == var54) {
                     var65 = classXY.method13047(var1, 543231650);
                     if (var65 == 65535) {
                        var65 = -1;
                     }
                  }

                  int var73 = classXY.method13039(var1, -346779531);
                  var35 = new int[2 + var73];

                  for (int var79 = 0; var79 <= var73; var79++) {
                     var35[var79] = classXY.method13047(var1, 531671492);
                     if (var35[var79] == 65535) {
                        var35[var79] = -1;
                     }
                  }

                  var35[1 + var73] = var65;
                  break;
               case 107:
                  var38 = false;
                  break;
               case 109:
                  var39 = false;
                  break;
               case 111:
                  var53 = classOQ.field5080;
                  break;
               case 114:
                  var14 = classXY.method13047(var1, -171247890);
                  break;
               case 115:
                  var14 = classXY.method13047(var1, 576052994);
                  var15 = classXY.method13047(var1, -1631180024);
                  var16 = classXY.method13047(var1, -1498861295);
                  var17 = classXY.method13047(var1, -1932561699);
                  break;
               case 116:
                  var18 = classXY.method13047(var1, 388202665);
                  break;
               case 117:
                  var18 = classXY.method13047(var1, 344265763);
                  var19 = classXY.method13047(var1, -792186032);
                  var20 = classXY.method13047(var1, 624450092);
                  var21 = classXY.method13047(var1, -684860613);
                  break;
               case 122:
                  var40 = true;
                  break;
               case 123:
                  var41 = true;
                  break;
               case 124:
                  var42 = classXY.method13047(var1, -242714651);
                  break;
               case 126:
                  var47 = classXY.method13047(var1, 1481172224);
                  break;
               case 130:
                  var22 = true;
                  break;
               case 145:
                  var48 = true;
                  break;
               case 146:
                  var49 = classXY.method13047(var1, -1210526976);
                  break;
               case 147:
                  var50 = false;
                  break;
               case 148:
                  var51.field6689 = classXY.method13047(var1, 1934168574) * -418754533;
                  var51.field6686 = classXY.method13039(var1, -346779531) * 39261697;
                  var51.field6688 = classXY.method13039(var1, -346779531) * -286691225;
                  break;
               case 149:
                  classWD var64 = var51.field6687;
                  int var57 = classXY.method13039(var1, -346779531);
                  classZL var72 = classZL.field7201[var57];
                  var64.method12320(var72, -179178084);
                  break;
               case 150:
                  int var71 = classXY.method13039(var1, -346779531);
                  classZL var63 = classZL.field7201[var71];
                  int var58 = classXY.method13047(var1, -466516573) * 20;
                  var51.field6687.method12314(var63, var58, (byte)111);
                  int var60 = classXY.method13039(var1, -346779531);
                  classZL var59 = classZL.field7201[var60];
                  int var62 = classXY.method13047(var1, 776673976) * 20;
                  var51.field6687.method12317(var59, var62, -388881497);
                  break;
               case 151:
                  var51.field6690 = (classKC)classOF.method8404(classHF.method6005(-966579297), classXY.method13039(var1, -346779531), -2046684356);
                  break;
               case 152:
                  var52.field6784 = classXY.method13047(var1, -1356571755) * -1412665981;
                  var52.field6783 = classXY.method13047(var1, -2076965834) * -736985931;
                  var51.field6686 = classXY.method13039(var1, -346779531) * 39261697;
                  var51.field6688 = classXY.method13039(var1, -346779531) * -286691225;
                  int var55 = classXY.method13039(var1, -346779531);
                  var52.field6785 = new int[var55];

                  for (int var56 = 0; var56 < var55; var56++) {
                     var52.field6785[var56] = classXY.method13047(var1, 1445422137);
                  }
                  break;
               case 249:
                  var43 = classQH.method9525(var1, var43, 1978086108);
            }
         }
      }

      if (-1 == var47) {
         var47 = (int)(0.4F * (var4 * 128));
      }

      this.field5293 = var3;
      this.field5284 = var4 * -949031185;
      this.field5292 = var5;
      this.field5304 = var6;
      this.field5306 = 1220125627 * var7;
      this.field5291 = 674030075 * var8;
      this.field5307 = 1213713169 * var9;
      this.field5285 = var10 * -804691593;
      this.field5308 = var11 * -2105781777;
      this.field5286 = -1432063099 * var12;
      this.field5309 = 852782415 * var13;
      this.field5281 = -1755050233 * var14;
      this.field5310 = -67317255 * var15;
      this.field5301 = var16 * 1677703629;
      this.field5311 = -1133315765 * var17;
      this.field5282 = var18 * 698705141;
      this.field5298 = 684682811 * var19;
      this.field5303 = var20 * -2023412849;
      this.field5312 = -991336805 * var21;
      this.field5313 = var22;
      this.field5314 = var23;
      this.field5315 = var24;
      this.field5316 = var25;
      this.field5317 = var26;
      this.field5318 = var27;
      this.field5319 = var28;
      this.field5320 = var29 * 2135414653;
      this.field5321 = var30 * -1731973987;
      this.field5322 = var31 * 1397641381;
      this.field5323 = var32 * -852812645;
      this.field5324 = var33 * -757704127;
      this.field5299 = var34 * -1360446703;
      this.field5325 = var35;
      this.field5296 = -373079405 * var36;
      this.field5297 = var37 * 718644969;
      this.field5326 = var38;
      this.field5327 = var39;
      this.field5328 = var40;
      this.field5295 = var41;
      this.field5288 = var42 * -1483773759;
      if (var43 == null) {
         this.field5300 = new classYN(1);
      } else {
         this.field5300 = var43;
      }

      this.field5329 = var44;
      this.field5330 = var45;
      this.field5331 = var46;
      this.field5332 = var47 * -390173693;
      this.field5333 = var48;
      this.field5287 = var49 * 928365823;
      this.field5334 = var50;
      this.field5283 = var51;
      this.field5335 = var52;
      this.field5305 = var53;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("aj")
   public String method8967(int var1, String var2, int var3) {
      try {
         return classFS.method4977(this.field5300, var1, var2, (byte)27);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "pl.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;)Z")
   @ObfuscatedName("lc")
   public static boolean method8957(classPL var0) {
      if (var0.field5325 == null) {
         return true;
      } else {
         int var1 = -1;
         if (var0.field5296 * -771216485 != -1) {
            var1 = classEM.method3922(-771216485 * var0.field5296, -1473414039);
         } else if (-1 != 123179353 * var0.field5297) {
            var1 = classLB.field4090[123179353 * var0.field5297];
         }

         return var1 >= 0 && var1 < var0.field5325.length ? var0.field5325[var1] != -1 : -1 != var0.field5325[var0.field5325.length - 1];
      }
   }

   public int getCombatLevel() {
      return this.field5320 * 1781570005;
   }

   @ObfuscatedSignature(descriptor = "([ILpp;)Ler;")
   @ObfuscatedName("bi")
   classER method8948(int[] var1, classPP var2) {
      int[] var3 = var1;
      if (null != var2 && null != var2.field5374) {
         var3 = var2.field5374;
      }

      if (null == var3) {
         return null;
      } else {
         boolean var4 = false;

         for (int var5 = 0; var5 < var3.length; var5++) {
            if (-1 != var3[var5] && !field5290.method11871(var3[var5], 0, (byte)23)) {
               var4 = true;
            }
         }

         if (var4) {
            return null;
         } else {
            classER[] var9 = new classER[var3.length];

            for (int var6 = 0; var6 < var3.length; var6++) {
               var9[var6] = classER.method4047(field5290, var3[var6], 0);
            }

            classER var10;
            if (var9.length == 1) {
               var10 = var9[0];
               if (var10 == null) {
                  var10 = new classER(var9, var9.length);
               }
            } else {
               var10 = new classER(var9, var9.length);
            }

            if (this.field5314 != null) {
               short[] var7 = this.field5315;
               if (null != var2 && var2.field5375 != null) {
                  var7 = var2.field5375;
               }

               for (int var8 = 0; var8 < this.field5314.length; var8++) {
                  var10.method4001(this.field5314[var8], var7[var8]);
               }
            }

            if (this.field5316 != null) {
               short[] var11 = this.field5317;
               if (var2 != null && null != var2.field5376) {
                  var11 = var2.field5376;
               }

               for (int var12 = 0; var12 < this.field5316.length; var12++) {
                  var10.method4004(this.field5316[var12], var11[var12]);
               }
            }

            return var10;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("ak")
   public String method8994(byte var1) {
      try {
         return this.field5293;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pl.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lpl;")
   @ObfuscatedName("ac")
   public final classPL method8955(int var1) {
      try {
         int var2 = -1;
         if (-1 != -771216485 * this.field5296) {
            if (var1 != 652890385) {
               throw new IllegalStateException();
            }

            var2 = classEM.method3922(this.field5296 * -771216485, -752703544);
         } else if (123179353 * this.field5297 != -1) {
            if (var1 != 652890385) {
               throw new IllegalStateException();
            }

            var2 = classLB.field4090[123179353 * this.field5297];
         }

         int var3;
         label42: {
            if (var2 >= 0) {
               if (var1 != 652890385) {
                  throw new IllegalStateException();
               }

               if (var2 < this.field5325.length - 1) {
                  var3 = this.field5325[var2];
                  break label42;
               }
            }

            var3 = this.field5325[this.field5325.length - 1];
         }

         if (var3 != -1) {
            if (var1 != 652890385) {
               throw new IllegalStateException();
            } else {
               return classOH.method8448(var3, 990349769);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "pl.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lct;)V")
   @ObfuscatedName("fp")
   public static void method8937(classCT var0) {
      if (var0 == null) {
         var0.method2668();
      }

      var0.field1267 = classRC.field5640;
   }

   @ObfuscatedSignature(descriptor = "(IJ)J")
   @ObfuscatedName("bd")
   public long method8963(int var1, long var2) {
      try {
         return classBW.method1276(this.field5300, var1, var2);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "pl.al(" + ')');
      }
   }

   public boolean isMinimapVisible() {
      return this.field5319;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("fy")
   public boolean method9001() {
      return this.method8959((byte)-97);
   }

   @ObfuscatedSignature(descriptor = "(Lpp;B)Ler;")
   @ObfuscatedName("as")
   public final classER method8943(classPP var1, byte var2) {
      try {
         if (null != this.field5325) {
            classPL var3 = this.method8955(652890385);
            if (var3 == null) {
               if (var2 <= 3) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               return var3.method8943(var1, (byte)8);
            }
         } else {
            return method8950(this, this.field5304, var1, 795096365);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "pl.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ay")
   public boolean method8971(int var1) {
      try {
         boolean var10000;
         if (this.field5330 != null && null != this.field5331) {
            if (var1 != -267153217) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pl.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[I")
   @ObfuscatedName("aq")
   public int[] method8974(byte var1) {
      try {
         return this.field5330;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pl.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ad")
   public int method8977(int var1, byte var2) {
      try {
         if (null != this.field5330) {
            if (var1 < this.field5330.length) {
               return this.field5330[var1];
            }

            if (var2 >= 1) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "pl.ad(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;)Z")
   @ObfuscatedName("ut")
   public static boolean method8997(classPL var0) {
      if (var0 == null) {
         return var0.method9005();
      } else if (var0.field5325 == null) {
         return -1 != var0.field5283.field6689 * -1727985133 || var0.field5335.field6785 != null;
      } else {
         int[] var1 = var0.field5325;

         for (int var2 = 0; var2 < var1.length; var2++) {
            int var3 = var1[var2];
            if (-1 != var3) {
               classPL var4 = classOH.method8448(var3, -377396942);
               if (-1 != -1727985133 * var4.field5283.field6689 || null != var4.field5335.field6785) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[S")
   @ObfuscatedName("ap")
   public short[] method8981(int var1) {
      try {
         return this.field5331;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pl.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Loz;")
   @ObfuscatedName("ah")
   public classOZ method8929() {
      return this.field5318;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ar")
   public boolean method8987(int var1) {
      try {
         return this.field5333;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pl.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aw")
   public int method8989(int var1) {
      try {
         return -1776205057 * this.field5287;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pl.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cz")
   public int method8990() {
      return -1776205057 * this.field5287;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("av")
   public boolean method8998(byte var1) {
      try {
         if (this.field5325 == null) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            } else {
               if (-1 == this.field5283.field6689 * -1727985133) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (this.field5335.field6785 == null) {
                     return false;
                  }
               }

               return true;
            }
         } else {
            int[] var2 = this.field5325;
            int var3 = 0;

            while (true) {
               if (var3 >= var2.length) {
                  return false;
               }

               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               int var4 = var2[var3];
               if (-1 != var4) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  classPL var5 = classOH.method8448(var4, 1854770430);
                  if (-1 != -1727985133 * var5.field5283.field6689) {
                     break;
                  }

                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (null != var5.field5335.field6785) {
                     if (var1 >= 0) {
                        throw new IllegalStateException();
                     }
                     break;
                  }
               }

               var3++;
            }

            return true;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "pl.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([ILpp;)Ler;")
   @ObfuscatedName("be")
   classER method8949(int[] var1, classPP var2) {
      int[] var3 = var1;
      if (null != var2 && null != var2.field5374) {
         var3 = var2.field5374;
      }

      if (null == var3) {
         return null;
      } else {
         boolean var4 = false;

         for (int var5 = 0; var5 < var3.length; var5++) {
            if (-1 != var3[var5] && !field5290.method11871(var3[var5], 0, (byte)84)) {
               var4 = true;
            }
         }

         if (var4) {
            return null;
         } else {
            classER[] var9 = new classER[var3.length];

            for (int var6 = 0; var6 < var3.length; var6++) {
               var9[var6] = classER.method4047(field5290, var3[var6], 0);
            }

            classER var10;
            if (var9.length == 1) {
               var10 = var9[0];
               if (var10 == null) {
                  var10 = new classER(var9, var9.length);
               }
            } else {
               var10 = new classER(var9, var9.length);
            }

            if (this.field5314 != null) {
               short[] var7 = this.field5315;
               if (null != var2 && var2.field5375 != null) {
                  var7 = var2.field5375;
               }

               for (int var8 = 0; var8 < this.field5314.length; var8++) {
                  var10.method4001(this.field5314[var8], var7[var8]);
               }
            }

            if (this.field5316 != null) {
               short[] var11 = this.field5317;
               if (var2 != null && null != var2.field5376) {
                  var11 = var2.field5376;
               }

               for (int var12 = 0; var12 < this.field5316.length; var12++) {
                  var10.method4004(this.field5316[var12], var11[var12]);
               }
            }

            return var10;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpl;")
   @ObfuscatedName("bx")
   public static classPL method8933(int var0) {
      classPL var1 = (classPL)field5336.method6422(var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = field5294.method11867(9, var0, -1420278537);
         var1 = new classPL(new classXY(var2), var0);
         field5336.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;)I")
   @ObfuscatedName("wq")
   public static int method8985(classPL var0) {
      return var0.field5332 * -128106731;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;Lou;ILou;ILpp;)Lfx;")
   @ObfuscatedName("fq")
   public static classFX method8939(classPL var0, classOU var1, int var2, classOU var3, int var4, classPP var5) {
      if (null != var0.field5325) {
         classPL var10 = var0.method8955(652890385);
         return var10 == null ? null : var10.method8942(var1, var2, var3, var4, var5, -828731087);
      } else {
         long var6 = var0.field5302 * 1959413853;
         if (var5 != null) {
            var6 |= -4980301671096129853L * var5.field5378 << 16;
         }

         classFX var8 = (classFX)field5337.method6422(var6);
         if (var8 == null) {
            classER var9 = method8950(var0, var0.field5292, var5, 795096365);
            if (null == var9) {
               return null;
            }

            var8 = var9.method4045(423192979 * var0.field5323 + 844156957, 850 + -1738706466 * var0.field5324, -30, 1808646333, -1774326506);
            field5337.method6428(var8, var6);
         }

         classFX var11;
         if (null != var1 && null != var3) {
            var11 = var1.method8791(var8, var2, var3, var4, -1737939264);
         } else if (var1 != null) {
            var11 = classOU.method8793(var1, var8, var2, (byte)0);
         } else if (var3 != null) {
            var11 = classOU.method8793(var3, var8, var4, (byte)0);
         } else {
            var11 = var8.method5081(true);
         }

         if (128 != var0.field5321 * 1835812871 || 1270703591 * var0.field5322 != 128) {
            var11.method5237(781957557 * var0.field5321, var0.field5322 * -440064221, 781957557 * var0.field5321);
         }

         return var11;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpl;")
   @ObfuscatedName("bc")
   public static classPL method8934(int var0) {
      classPL var1 = (classPL)field5336.method6422(var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = field5294.method11867(9, var0, -1740563463);
         var1 = new classPL(new classXY(var2), var0);
         field5336.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpl;[ILpp;I)Ler;")
   @ObfuscatedName("rs")
   public static classER method8950(classPL var0, int[] var1, classPP var2, int var3) {
      if (var0 == null) {
         return var0.method8954(var1, var2, var3);
      } else {
         try {
            int[] var4 = var1;
            if (null != var2) {
               if (var3 != 795096365) {
                  throw new IllegalStateException();
               }

               if (null != var2.field5374) {
                  if (var3 != 795096365) {
                     throw new IllegalStateException();
                  }

                  var4 = var2.field5374;
               }
            }

            if (null == var4) {
               if (var3 != 795096365) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               boolean var5 = false;

               for (int var6 = 0; var6 < var4.length; var6++) {
                  if (var3 != 795096365) {
                     throw new IllegalStateException();
                  }

                  if (-1 != var4[var6]) {
                     if (var3 != 795096365) {
                        throw new IllegalStateException();
                     }

                     if (!field5290.method11871(var4[var6], 0, (byte)12)) {
                        if (var3 != 795096365) {
                           throw new IllegalStateException();
                        }

                        var5 = true;
                     }
                  }
               }

               if (var5) {
                  return null;
               } else {
                  classER[] var11 = new classER[var4.length];

                  for (int var7 = 0; var7 < var4.length; var7++) {
                     if (var3 != 795096365) {
                        throw new IllegalStateException();
                     }

                     var11[var7] = classER.method4047(field5290, var4[var7], 0);
                  }

                  classER var12;
                  if (var11.length == 1) {
                     if (var3 != 795096365) {
                        throw new IllegalStateException();
                     }

                     var12 = var11[0];
                     if (var12 == null) {
                        if (var3 != 795096365) {
                           throw new IllegalStateException();
                        }

                        var12 = new classER(var11, var11.length);
                     }
                  } else {
                     var12 = new classER(var11, var11.length);
                  }

                  if (var0.field5314 != null) {
                     if (var3 != 795096365) {
                        throw new IllegalStateException();
                     }

                     short[] var8 = var0.field5315;
                     if (null != var2) {
                        if (var3 != 795096365) {
                           throw new IllegalStateException();
                        }

                        if (var2.field5375 != null) {
                           if (var3 != 795096365) {
                              throw new IllegalStateException();
                           }

                           var8 = var2.field5375;
                        }
                     }

                     for (int var9 = 0; var9 < var0.field5314.length; var9++) {
                        if (var3 != 795096365) {
                           throw new IllegalStateException();
                        }

                        var12.method4001(var0.field5314[var9], var8[var9]);
                     }
                  }

                  if (var0.field5316 != null) {
                     if (var3 != 795096365) {
                        throw new IllegalStateException();
                     }

                     short[] var13 = var0.field5317;
                     if (var2 != null && null != var2.field5376) {
                        if (var3 != 795096365) {
                           throw new IllegalStateException();
                        }

                        var13 = var2.field5376;
                     }

                     for (int var14 = 0; var14 < var0.field5316.length; var14++) {
                        if (var3 != 795096365) {
                           throw new IllegalStateException();
                        }

                        var12.method4004(var0.field5316[var14], var13[var14]);
                     }
                  }

                  return var12;
               }
            }
         } catch (RuntimeException var10) {
            throw classEG.method3884(var10, "pl.ax(" + ')');
         }
      }
   }

   public int getWidthScale() {
      return this.field5321 * 781957557;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;)Lpo;")
   @ObfuscatedName("gp")
   public static classPO method8932(classPL var0) {
      if (var0 == null) {
         var0.getModels();
      }

      return new classPO();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bp")
   public static void method8935() {
      classJZ.method6431(field5336);
      classJZ.method6431(field5337);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("br")
   public static void method8936() {
      classJZ.method6431(field5336);
      classJZ.method6431(field5337);
   }

   public String getName() {
      return this.field5293;
   }

   @ObfuscatedSignature(descriptor = "(Lpp;)Ler;")
   @ObfuscatedName("bj")
   public final classER method8944(classPP var1) {
      if (null != this.field5325) {
         classPL var2 = this.method8955(652890385);
         return var2 == null ? null : var2.method8943(var1, (byte)108);
      } else {
         return method8950(this, this.field5304, var1, 795096365);
      }
   }

   @ObfuscatedSignature(descriptor = "(IJ)J")
   @ObfuscatedName("al")
   public long method8964(int var1, long var2) {
      return classBW.method1276(this.field5300, var1, var2);
   }

   public int[] getStats() {
      return this.field5329;
   }

   public int[] getConfigs() {
      return this.field5325;
   }

   @ObfuscatedSignature(descriptor = "(Lpp;)Ler;")
   @ObfuscatedName("bo")
   public final classER method8945(classPP var1) {
      if (null != this.field5325) {
         classPL var2 = this.method8955(652890385);
         return var2 == null ? null : var2.method8943(var1, (byte)99);
      } else {
         return method8950(this, this.field5304, var1, 795096365);
      }
   }

   @ObfuscatedSignature(descriptor = "([ILpp;)Ler;")
   @ObfuscatedName("ba")
   classER method8951(int[] var1, classPP var2) {
      int[] var3 = var1;
      if (null != var2 && null != var2.field5374) {
         var3 = var2.field5374;
      }

      if (null == var3) {
         return null;
      } else {
         boolean var4 = false;

         for (int var5 = 0; var5 < var3.length; var5++) {
            if (-1 != var3[var5] && !field5290.method11871(var3[var5], 0, (byte)-21)) {
               var4 = true;
            }
         }

         if (var4) {
            return null;
         } else {
            classER[] var9 = new classER[var3.length];

            for (int var6 = 0; var6 < var3.length; var6++) {
               var9[var6] = classER.method4047(field5290, var3[var6], 0);
            }

            classER var10;
            if (var9.length == 1) {
               var10 = var9[0];
               if (var10 == null) {
                  var10 = new classER(var9, var9.length);
               }
            } else {
               var10 = new classER(var9, var9.length);
            }

            if (this.field5314 != null) {
               short[] var7 = this.field5315;
               if (null != var2 && var2.field5375 != null) {
                  var7 = var2.field5375;
               }

               for (int var8 = 0; var8 < this.field5314.length; var8++) {
                  var10.method4001(this.field5314[var8], var7[var8]);
               }
            }

            if (this.field5316 != null) {
               short[] var11 = this.field5317;
               if (var2 != null && null != var2.field5376) {
                  var11 = var2.field5376;
               }

               for (int var12 = 0; var12 < this.field5316.length; var12++) {
                  var10.method4004(this.field5316[var12], var11[var12]);
               }
            }

            return var10;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([ILpp;)Ler;")
   @ObfuscatedName("bw")
   classER method8952(int[] var1, classPP var2) {
      int[] var3 = var1;
      if (null != var2 && null != var2.field5374) {
         var3 = var2.field5374;
      }

      if (null == var3) {
         return null;
      } else {
         boolean var4 = false;

         for (int var5 = 0; var5 < var3.length; var5++) {
            if (-1 != var3[var5] && !field5290.method11871(var3[var5], 0, (byte)60)) {
               var4 = true;
            }
         }

         if (var4) {
            return null;
         } else {
            classER[] var9 = new classER[var3.length];

            for (int var6 = 0; var6 < var3.length; var6++) {
               var9[var6] = classER.method4047(field5290, var3[var6], 0);
            }

            classER var10;
            if (var9.length == 1) {
               var10 = var9[0];
               if (var10 == null) {
                  var10 = new classER(var9, var9.length);
               }
            } else {
               var10 = new classER(var9, var9.length);
            }

            if (this.field5314 != null) {
               short[] var7 = this.field5315;
               if (null != var2 && var2.field5375 != null) {
                  var7 = var2.field5375;
               }

               for (int var8 = 0; var8 < this.field5314.length; var8++) {
                  var10.method4001(this.field5314[var8], var7[var8]);
               }
            }

            if (this.field5316 != null) {
               short[] var11 = this.field5317;
               if (var2 != null && null != var2.field5376) {
                  var11 = var2.field5376;
               }

               for (int var12 = 0; var12 < this.field5316.length; var12++) {
                  var10.method4004(this.field5316[var12], var11[var12]);
               }
            }

            return var10;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpl;I)I")
   @ObfuscatedName("ec")
   public static int method8986(classPL var0, int var1) {
      if (var0 == null) {
         var0.method8993(var1);
      }

      try {
         return var0.field5332 * -1509122389;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pl.ai(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;Lou;ILou;ILpp;)Lfx;")
   @ObfuscatedName("bk")
   public static classFX method8940(classPL var0, classOU var1, int var2, classOU var3, int var4, classPP var5) {
      if (var0 == null) {
         var0.method8942(var1, var2, var1, var2, var5, var2);
      }

      if (null != var0.field5325) {
         classPL var10 = var0.method8955(652890385);
         return var10 == null ? null : var10.method8942(var1, var2, var3, var4, var5, -1192552610);
      } else {
         long var6 = var0.field5302 * 283969983;
         if (var5 != null) {
            var6 |= -4980301671096129853L * var5.field5378 << 16;
         }

         classFX var8 = (classFX)field5337.method6422(var6);
         if (var8 == null) {
            classER var9 = method8950(var0, var0.field5292, var5, 795096365);
            if (null == var9) {
               return null;
            }

            var8 = var9.method4045(423192979 * var0.field5323 + 64, 850 + 2098640321 * var0.field5324, -30, -50, -30);
            field5337.method6428(var8, var6);
         }

         classFX var11;
         if (null != var1 && null != var3) {
            var11 = var1.method8791(var8, var2, var3, var4, -1195884941);
         } else if (var1 != null) {
            var11 = classOU.method8793(var1, var8, var2, (byte)0);
         } else if (var3 != null) {
            var11 = classOU.method8793(var3, var8, var4, (byte)0);
         } else {
            var11 = var8.method5081(true);
         }

         if (128 != var0.field5321 * 781957557 || 611915565 * var0.field5322 != 128) {
            var11.method5237(781957557 * var0.field5321, var0.field5322 * 611915565, 781957557 * var0.field5321);
         }

         return var11;
      }
   }

   @ObfuscatedSignature(descriptor = "([ILpp;)Ler;")
   @ObfuscatedName("bb")
   classER method8953(int[] var1, classPP var2) {
      int[] var3 = var1;
      if (null != var2 && null != var2.field5374) {
         var3 = var2.field5374;
      }

      if (null == var3) {
         return null;
      } else {
         boolean var4 = false;

         for (int var5 = 0; var5 < var3.length; var5++) {
            if (-1 != var3[var5] && !field5290.method11871(var3[var5], 0, (byte)-73)) {
               var4 = true;
            }
         }

         if (var4) {
            return null;
         } else {
            classER[] var9 = new classER[var3.length];

            for (int var6 = 0; var6 < var3.length; var6++) {
               var9[var6] = classER.method4047(field5290, var3[var6], 0);
            }

            classER var10;
            if (var9.length == 1) {
               var10 = var9[0];
               if (var10 == null) {
                  var10 = new classER(var9, var9.length);
               }
            } else {
               var10 = new classER(var9, var9.length);
            }

            if (this.field5314 != null) {
               short[] var7 = this.field5315;
               if (null != var2 && var2.field5375 != null) {
                  var7 = var2.field5375;
               }

               for (int var8 = 0; var8 < this.field5314.length; var8++) {
                  var10.method4001(this.field5314[var8], var7[var8]);
               }
            }

            if (this.field5316 != null) {
               short[] var11 = this.field5317;
               if (var2 != null && null != var2.field5376) {
                  var11 = var2.field5376;
               }

               for (int var12 = 0; var12 < this.field5316.length; var12++) {
                  var10.method4004(this.field5316[var12], var11[var12]);
               }
            }

            return var10;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)S")
   @ObfuscatedName("cc")
   public short method8983(int var1) {
      return this.field5331 != null && var1 < this.field5331.length ? this.field5331[var1] : -1;
   }

   @ObfuscatedSignature(descriptor = "()Lpl;")
   @ObfuscatedName("by")
   public final classPL method8956() {
      int var1 = -1;
      if (-1 != -771216485 * this.field5296) {
         var1 = classEM.method3922(this.field5296 * 1082956305, -1355372185);
      } else if (105808121 * this.field5297 != -1) {
         var1 = classLB.field4090[123179353 * this.field5297];
      }

      int var2;
      if (var1 >= 0 && var1 < this.field5325.length - 1) {
         var2 = this.field5325[var1];
      } else {
         var2 = this.field5325[this.field5325.length - 1];
      }

      return var2 != -1 ? classOH.method8448(var2, 977579935) : null;
   }

   @ObfuscatedSignature(descriptor = "()Lpl;")
   @ObfuscatedName("fd")
   public classPL method9002() {
      return this.method8955(652890385);
   }

   public boolean isInteractible() {
      return this.field5326;
   }

   @ObfuscatedSignature(descriptor = "(I)Loz;")
   @ObfuscatedName("az")
   public classOZ method8930(int var1) {
      try {
         return this.field5318;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pl.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lou;ILou;ILpp;)Lfx;")
   @ObfuscatedName("bg")
   public final classFX method8941(classOU var1, int var2, classOU var3, int var4, classPP var5) {
      if (null != this.field5325) {
         classPL var10 = this.method8955(652890385);
         return var10 == null ? null : var10.method8942(var1, var2, var3, var4, var5, -848657705);
      } else {
         long var6 = this.field5302 * 283969983;
         if (var5 != null) {
            var6 |= -4980301671096129853L * var5.field5378 << 16;
         }

         classFX var8 = (classFX)field5337.method6422(var6);
         if (var8 == null) {
            classER var9 = method8950(this, this.field5292, var5, 795096365);
            if (null == var9) {
               return null;
            }

            var8 = var9.method4045(423192979 * this.field5323 + 64, 850 + 2098640321 * this.field5324, -30, -50, -30);
            field5337.method6428(var8, var6);
         }

         classFX var11;
         if (null != var1 && null != var3) {
            var11 = var1.method8791(var8, var2, var3, var4, 1490505301);
         } else if (var1 != null) {
            var11 = classOU.method8793(var1, var8, var2, (byte)0);
         } else if (var3 != null) {
            var11 = classOU.method8793(var3, var8, var4, (byte)0);
         } else {
            var11 = var8.method5081(true);
         }

         if (128 != this.field5321 * 781957557 || 611915565 * this.field5322 != 128) {
            var11.method5237(781957557 * this.field5321, this.field5322 * 611915565, 781957557 * this.field5321);
         }

         return var11;
      }
   }

   public int getFootprintSize() {
      return this.field5332 * -1509122389;
   }

   @ObfuscatedSignature(descriptor = "(IJ)J")
   @ObfuscatedName("bl")
   public long method8965(int var1, long var2) {
      return classBW.method1276(this.field5300, var1, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;)Z")
   @ObfuscatedName("hk")
   public static boolean method8958(classPL var0) {
      if (var0.field5325 == null) {
         return true;
      } else {
         int var1 = -1;
         if (var0.field5296 * -771216485 != -1) {
            var1 = classEM.method3922(-771216485 * var0.field5296, -1610705117);
         } else if (-1 != 123179353 * var0.field5297) {
            var1 = classLB.field4090[123179353 * var0.field5297];
         }

         return var1 >= 0 && var1 < var0.field5325.length ? var0.field5325[var1] != -1 : -1 != var0.field5325[var0.field5325.length - 1];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)Llv;")
   @ObfuscatedName("ix")
   public static classLV method8938(classDH var0) {
      return var0.field1463.field625;
   }

   @ObfuscatedSignature(descriptor = "(IJ)J")
   @ObfuscatedName("bv")
   public long method8966(int var1, long var2) {
      return classBW.method1276(this.field5300, var1, var2);
   }

   public int[] getModels() {
      return this.field5292;
   }

   public int getId() {
      return this.field5302 * 283969983;
   }

   @ObfuscatedSignature(descriptor = "(Lou;ILou;ILpp;I)Lfx;")
   @ObfuscatedName("ag")
   public final classFX method8942(classOU var1, int var2, classOU var3, int var4, classPP var5, int var6) {
      try {
         if (null != this.field5325) {
            classPL var12 = this.method8955(652890385);
            if (var12 == null) {
               if (var6 >= -160372750) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               return var12.method8942(var1, var2, var3, var4, var5, -520150610);
            }
         } else {
            long var7 = this.field5302 * 283969983;
            if (var5 != null) {
               if (var6 >= -160372750) {
                  throw new IllegalStateException();
               }

               var7 |= -4980301671096129853L * var5.field5378 << 16;
            }

            classFX var9 = (classFX)field5337.method6422(var7);
            if (var9 == null) {
               if (var6 >= -160372750) {
                  throw new IllegalStateException();
               }

               classER var10 = method8950(this, this.field5292, var5, 795096365);
               if (null == var10) {
                  if (var6 >= -160372750) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               var9 = var10.method4045(423192979 * this.field5323 + 64, 850 + 2098640321 * this.field5324, -30, -50, -30);
               field5337.method6428(var9, var7);
            }

            classFX var13;
            label88: {
               if (null != var1) {
                  if (var6 >= -160372750) {
                     throw new IllegalStateException();
                  }

                  if (null != var3) {
                     if (var6 >= -160372750) {
                        throw new IllegalStateException();
                     }

                     var13 = var1.method8791(var9, var2, var3, var4, -1239761340);
                     break label88;
                  }
               }

               if (var1 != null) {
                  if (var6 >= -160372750) {
                     throw new IllegalStateException();
                  }

                  var13 = classOU.method8793(var1, var9, var2, (byte)0);
               } else if (var3 != null) {
                  var13 = classOU.method8793(var3, var9, var4, (byte)0);
               } else {
                  var13 = var9.method5081(true);
               }
            }

            if (128 == this.field5321 * 781957557) {
               if (var6 >= -160372750) {
                  throw new IllegalStateException();
               }

               if (611915565 * this.field5322 == 128) {
                  return var13;
               }

               if (var6 >= -160372750) {
                  throw new IllegalStateException();
               }
            }

            var13.method5237(781957557 * this.field5321, this.field5322 * 611915565, 781957557 * this.field5321);
            return var13;
         }
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "pl.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("aa")
   public boolean method8959(byte var1) {
      try {
         if (this.field5325 == null) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            int var2 = -1;
            if (this.field5296 * -771216485 != -1) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               var2 = classEM.method3922(-771216485 * this.field5296, -2115024723);
            } else if (-1 != 123179353 * this.field5297) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               var2 = classLB.field4090[123179353 * this.field5297];
            }

            if (var2 >= 0) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               if (var2 < this.field5325.length) {
                  boolean var4;
                  if (this.field5325[var2] != -1) {
                     if (var1 >= 1) {
                        throw new IllegalStateException();
                     }

                     var4 = true;
                  } else {
                     var4 = false;
                  }

                  return var4;
               }

               if (var1 >= 1) {
                  throw new IllegalStateException();
               }
            }

            boolean var10000;
            if (-1 != this.field5325[this.field5325.length - 1]) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "pl.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cu")
   public boolean method8972() {
      return this.field5330 != null && null != this.field5331;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bs")
   public int method8960(int var1, int var2) {
      return classGQ.method5602(this.field5300, var1, var2, 1084241679);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cb")
   public boolean method8973() {
      return this.field5330 != null && null != this.field5331;
   }

   @ObfuscatedSignature(descriptor = "(Lpl;III)I")
   @ObfuscatedName("ib")
   public static int method8961(classPL var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method8962(var1, var1, var1);
      }

      try {
         return classGQ.method5602(var0.field5300, var1, var2, 416109443);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "pl.ao(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)S")
   @ObfuscatedName("au")
   public short method8984(int var1, byte var2) {
      try {
         if (this.field5331 != null) {
            if (var1 < this.field5331.length) {
               return this.field5331[var1];
            }

            if (var2 >= 0) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "pl.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("cp")
   public int[] method8975() {
      return this.field5330;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("cq")
   public int[] method8976() {
      return this.field5330;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cl")
   public int method8978(int var1) {
      return null != this.field5330 && var1 < this.field5330.length ? this.field5330[var1] : -1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cd")
   public int method8979(int var1) {
      return null != this.field5330 && var1 < this.field5330.length ? this.field5330[var1] : -1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cv")
   public int method8980(int var1) {
      return null != this.field5330 && var1 < this.field5330.length ? this.field5330[var1] : -1;
   }

   public short[] getColorToReplaceWith() {
      return this.field5315;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bg")
   public static String method8968(classPL var0, int var1, String var2) {
      return classFS.method4977(var0.field5300, var1, var2, (byte)119);
   }

   public boolean isFollower() {
      return this.field5328;
   }

   @ObfuscatedSignature(descriptor = "()[S")
   @ObfuscatedName("cs")
   public short[] method8982() {
      return this.field5331;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;Lpp;)Ler;")
   @ObfuscatedName("tp")
   public static classER method8946(classPL var0, classPP var1) {
      if (null != var0.field5325) {
         classPL var2 = var0.method8955(652890385);
         return var2 == null ? null : var2.method8943(var1, (byte)84);
      } else {
         return method8950(var0, var0.field5304, var1, 795096365);
      }
   }

   public String[] getActions() {
      String[] var1 = new String[this.field5318.field5363.size()];

      for (int var2 = 0; var2 < this.field5318.field5363.size(); var2++) {
         classPB var3 = (classPB)this.field5318.field5363.get(var2);
         if (var3 != null) {
            var1[var2] = var3.field5210;
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cn")
   public boolean method8988() {
      return this.field5333;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ch")
   public int method8991() {
      return 1794625942 * this.field5287;
   }

   @ObfuscatedSignature(descriptor = "(Lpp;)Ler;")
   @ObfuscatedName("bk")
   public final classER method8947(classPP var1) {
      if (null != this.field5325) {
         classPL var2 = this.method8955(652890385);
         return var2 == null ? null : var2.method8943(var1, (byte)123);
      } else {
         return method8950(this, this.field5304, var1, 795096365);
      }
   }

   public int getHeightScale() {
      return this.field5322 * 611915565;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cw")
   public int method8992() {
      return -1776205057 * this.field5287;
   }

   public IterableHashTable getParams() {
      return this.field5300;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("cj")
   public String method8995() {
      return this.field5293;
   }

   public short[] getColorToReplace() {
      return this.field5314;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bh")
   public String method8969(int var1, String var2) {
      return classFS.method4977(this.field5300, var1, var2, (byte)93);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cx")
   public boolean method8999() {
      if (this.field5325 == null) {
         return -1 != this.field5283.field6689 * -1618323126 || this.field5335.field6785 != null;
      } else {
         int[] var1 = this.field5325;

         for (int var2 = 0; var2 < var1.length; var2++) {
            int var3 = var1[var2];
            if (-1 != var3) {
               classPL var4 = classOH.method8448(var3, 1133371951);
               if (-1 != -1727985133 * var4.field5283.field6689 || null != var4.field5335.field6785) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ce")
   public boolean method9000() {
      if (this.field5325 == null) {
         return -1 != this.field5283.field6689 * -1529649401 || this.field5335.field6785 != null;
      } else {
         int[] var1 = this.field5325;

         for (int var2 = 0; var2 < var1.length; var2++) {
            int var3 = var1[var2];
            if (-1 != var3) {
               classPL var4 = classOH.method8448(var3, -1601329360);
               if (-1 != 1685055551 * var4.field5283.field6689 || null != var4.field5335.field6785) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("cr")
   public String method8970(int var1, String var2) {
      return classFS.method4977(this.field5300, var1, var2, (byte)109);
   }

   @ObfuscatedSignature(descriptor = "(Lyn;)V")
   @ObfuscatedName("vy")
   @Override
   public void vmethod537(classYN var1) {
      this.field5300 = var1;
   }

   @ObfuscatedSignature(descriptor = "([ILpp;I)Ler;")
   @ObfuscatedName("ax")
   classER method8954(int[] var1, classPP var2, int var3) {
      try {
         int[] var4 = var1;
         if (null != var2) {
            if (var3 != 795096365) {
               throw new IllegalStateException();
            }

            if (null != var2.field5379) {
               if (var3 != 795096365) {
                  throw new IllegalStateException();
               }

               var4 = var2.field5379;
            }
         }

         if (null == var4) {
            if (var3 != 795096365) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            boolean var5 = false;

            for (int var6 = 0; var6 < var4.length; var6++) {
               if (var3 != 795096365) {
                  throw new IllegalStateException();
               }

               if (-1 != var4[var6]) {
                  if (var3 != 795096365) {
                     throw new IllegalStateException();
                  }

                  if (!field5294.method11871(var4[var6], 0, (byte)12)) {
                     if (var3 != 795096365) {
                        throw new IllegalStateException();
                     }

                     var5 = true;
                  }
               }
            }

            if (var5) {
               return null;
            } else {
               classER[] var11 = new classER[var4.length];

               for (int var7 = 0; var7 < var4.length; var7++) {
                  if (var3 != 795096365) {
                     throw new IllegalStateException();
                  }

                  var11[var7] = classER.method3959(field5294, var4[var7], 0);
               }

               classER var12;
               if (var11.length == 1) {
                  if (var3 != 795096365) {
                     throw new IllegalStateException();
                  }

                  var12 = var11[0];
                  if (var12 == null) {
                     if (var3 != 795096365) {
                        throw new IllegalStateException();
                     }

                     var12 = new classER(var11, var11.length);
                  }
               } else {
                  var12 = new classER(var11, var11.length);
               }

               if (this.field5331 != null) {
                  if (var3 != 795096365) {
                     throw new IllegalStateException();
                  }

                  short[] var8 = this.field5315;
                  if (null != var2) {
                     if (var3 != 795096365) {
                        throw new IllegalStateException();
                     }

                     if (var2.field5375 != null) {
                        if (var3 != 795096365) {
                           throw new IllegalStateException();
                        }

                        var8 = var2.field5375;
                     }
                  }

                  for (int var9 = 0; var9 < this.field5316.length; var9++) {
                     if (var3 != 795096365) {
                        throw new IllegalStateException();
                     }

                     var12.method4000(this.field5316[var9], var8[var9]);
                  }
               }

               if (this.field5314 != null) {
                  if (var3 != 795096365) {
                     throw new IllegalStateException();
                  }

                  short[] var13 = this.field5315;
                  if (var2 != null && null != var2.field5376) {
                     if (var3 != 795096365) {
                        throw new IllegalStateException();
                     }

                     var13 = var2.field5376;
                  }

                  for (int var14 = 0; var14 < this.field5331.length; var14++) {
                     if (var3 != 795096365) {
                        throw new IllegalStateException();
                     }

                     var12.method4005(this.field5316[var14], var13[var14]);
                  }
               }

               return var12;
            }
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "pl.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ai")
   public int method8993(int var1) {
      try {
         return -1776205057 * this.field5332;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pl.aw(" + 41);
      }
   }

   public int[] getChatheadModels() {
      return this.field5304;
   }

   @ObfuscatedSignature(descriptor = "()Lpo;")
   @ObfuscatedName("lk")
   public classPO method9003() {
      return this.field5318;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ao")
   public int method8962(int var1, int var2, int var3) {
      try {
         return classGQ.method5602(this.field5300, var1, var2, 416109443);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "pl.ao(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cg")
   public int method9004() {
      return this.field5321 * -1509122389;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cm")
   public boolean method9005() {
      return this.field5313;
   }
}
