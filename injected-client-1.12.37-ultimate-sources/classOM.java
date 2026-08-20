import javax.annotation.Nullable;
import net.runelite.api.IterableHashTable;
import net.runelite.api.ObjectComposition;
import net.runelite.api.events.PostObjectComposition;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("om")
public class classOM extends classVJ implements ObjectComposition, rl9 {
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field4978 = 18;
   @ObfuscatedSignature(descriptor = "Lwj;")
   @ObfuscatedName("df")
   final classWJ field4963;
   @ObfuscatedName("dh")
   int field4959;
   @ObfuscatedName("cx")
   int field4949;
   @ObfuscatedName("cg")
   public int field4924;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field4973 = 21;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field4976 = 23;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field4936 = 27;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field4975 = 32;
   @rl8(method10126 = 17)
   @ObfuscatedName("du")
   public int field4954;
   @ToRemove(unused = "true")
   @ObfuscatedName("ba")
   static final int field4979 = 78;
   @ToRemove(unused = "true")
   @ObfuscatedName("bz")
   static final int field4980 = 101;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("cb")
   static classJZ field4966 = new classJZ(4096);
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ct")
   public static classJZ field4968 = new classJZ(500);
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field4925 = 2;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("cd")
   static classJZ field4972 = new classJZ(256);
   @ObfuscatedName("cp")
   static boolean field4971 = false;
   @ObfuscatedSignature(descriptor = "[Ler;")
   @ObfuscatedName("cs")
   static classER[] field4969 = new classER[4];
   @ObfuscatedName("cy")
   public final int field4922;
   @ObfuscatedName("ck")
   final int[] field4920;
   @ObfuscatedName("co")
   final int[] field4939;
   @ObfuscatedName("ca")
   String field4945;
   @ObfuscatedName("cc")
   short[] field4940;
   @ObfuscatedName("cf")
   short[] field4941;
   @ObfuscatedName("cn")
   final short[] field4942;
   @ObfuscatedName("ch")
   final short[] field4943;
   @ObfuscatedName("cz")
   public int field4944;
   @ObfuscatedName("dz")
   int field4961;
   @ObfuscatedName("cw")
   public final int field4946;
   @ObfuscatedName("cj")
   public final boolean field4947;
   @ObfuscatedName("ci")
   public final int field4923;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field4928 = 14;
   @ObfuscatedName("ce")
   final boolean field4932;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field4948 = 7;
   @ObfuscatedName("dc")
   public final int field4951;
   @ObfuscatedName("db")
   int field4929;
   @ObfuscatedName("dj")
   public final boolean field4964;
   @ObfuscatedName("dx")
   int field4921;
   @ObfuscatedSignature(descriptor = "Lpo;")
   @ObfuscatedName("dy")
   final classPO field4935;
   @rl8(method10126 = 17)
   @ObfuscatedName("di")
   public int field4953;
   @ObfuscatedName("dk")
   int field4957;
   @ObfuscatedName("dt")
   boolean field4955;
   @ObfuscatedName("cm")
   public final boolean field4950;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("cv")
   static classJZ field4967 = new classJZ(256);
   @ObfuscatedName("dr")
   public boolean field4938;
   @ObfuscatedName("dm")
   int field4952;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field4977 = 40;
   @ObfuscatedName("de")
   int field4960;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field4974 = 6;
   @ObfuscatedName("dn")
   public final boolean field4933;
   @ObfuscatedName("dv")
   public final int field4956;
   @ObfuscatedName("do")
   public final int field4937;
   @ObfuscatedName("dg")
   public final int[] field4930;
   @ObfuscatedName("dl")
   final int field4926;
   @ObfuscatedName("dq")
   final int field4962;
   @ObfuscatedName("dd")
   public int field4927;
   @ObfuscatedSignature(descriptor = "Lww;")
   @ObfuscatedName("ds")
   final classWW field4934;
   @ObfuscatedName("dw")
   int field4958;
   @ObfuscatedName("da")
   public final boolean field4965;
   @rl8(method10126 = 16)
   @ObfuscatedSignature(descriptor = "Lyn;")
   @ObfuscatedName("dp")
   classYN field4931;

   @ObfuscatedSignature(descriptor = "(Lom;I)Lww;")
   @ObfuscatedName("zk")
   public static classWW method8577(classOM var0, int var1) {
      if (var0 == null) {
         var0.method8580(var1);
      }

      try {
         return var0.field4934;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "om.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("cl")
   public String method8562(int var1, String var2) {
      return classFS.method4977(this.field4931, var1, var2, (byte)73);
   }

   @ObfuscatedSignature(descriptor = "(B)Lpo;")
   @ObfuscatedName("ag")
   classPO method8527(byte var1) {
      try {
         return new classPO();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "om.ag(" + ')');
      }
   }

   classOM(classXY var1, int var2, boolean var3) {
      this.field4922 = var2 * 442451425;
      int[] var4 = null;
      int[] var5 = null;
      String var6 = classKK.field3615;
      short[] var7 = null;
      short[] var8 = null;
      short[] var9 = null;
      short[] var10 = null;
      int var11 = 1;
      int var12 = 1;
      byte var13 = 2;
      boolean var14 = true;
      int var15 = -1;
      int var16 = -1;
      boolean var17 = false;
      boolean var18 = false;
      int var19 = -1;
      int var20 = 16;
      byte var21 = 0;
      int var22 = 0;
      classPO var23 = this.method8527((byte)27);
      int var24 = -1;
      int var25 = -1;
      boolean var26 = false;
      boolean var27 = true;
      int var28 = 128;
      int var29 = 128;
      int var30 = 128;
      int var31 = 0;
      int var32 = 0;
      int var33 = 0;
      boolean var34 = false;
      boolean var35 = false;
      int var36 = -1;
      int var37 = 0;
      int[] var38 = null;
      int var39 = -1;
      int var40 = -1;
      classWJ var41 = new classWJ();
      classWW var42 = new classWW();
      boolean var43 = true;
      boolean var44 = false;
      classYN var45 = null;
      if (var1 != null && var1.field6954 != null) {
         label317:
         while (true) {
            int var46 = classXY.method13039(var1, -346779531);
            switch (var46) {
               case 0:
                  break label317;
               case 1:
               case 3:
               case 4:
               case 5:
               case 8:
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
               case 16:
               case 20:
               case 25:
               case 26:
               case 35:
               case 36:
               case 37:
               case 38:
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
               case 76:
               case 80:
               case 83:
               case 84:
               case 85:
               case 86:
               case 87:
               case 88:
               case 94:
               case 97:
               case 98:
               case 99:
               case 103:
               case 104:
               case 105:
               case 106:
               case 107:
               case 108:
               case 109:
               case 110:
               case 111:
               case 112:
               case 113:
               case 114:
               case 115:
               case 116:
               case 117:
               case 118:
               case 119:
               case 120:
               case 121:
               case 122:
               case 123:
               case 124:
               case 125:
               case 126:
               case 127:
               case 128:
               case 129:
               case 130:
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
               case 145:
               case 146:
               case 147:
               case 148:
               case 149:
               case 150:
               case 151:
               case 152:
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
               default:
                  break;
               case 2:
                  var6 = var1.method13071(-515409055);
                  break;
               case 6:
                  int var61 = classXY.method13039(var1, -346779531);
                  if (var61 <= 0) {
                     break;
                  }

                  if (null != var4 && !field4971) {
                     var1.field6955 = var1.field6955 + var61 * (classXM.field6888.method12840((byte)3) + 1) * -1095856699;
                  } else {
                     var5 = new int[var61];
                     var4 = new int[var61];

                     for (int var68 = 0; var68 < var61; var68++) {
                        var4[var68] = var1.method13117(classXM.field6888.field6890, 1851122325);
                        var5[var68] = classXY.method13039(var1, -346779531);
                     }
                  }
                  break;
               case 7:
                  int var60 = classXY.method13039(var1, -346779531);
                  if (var60 <= 0) {
                     break;
                  }

                  if (var4 != null && !field4971) {
                     var1.field6955 = var1.field6955 + var60 * classXM.field6888.method12840((byte)3) * -1095856699;
                  } else {
                     var5 = null;
                     var4 = new int[var60];

                     for (int var67 = 0; var67 < var60; var67++) {
                        var4[var67] = var1.method13117(classXM.field6888.field6890, 1451941769);
                     }
                  }
                  break;
               case 14:
                  var11 = classXY.method13039(var1, -346779531);
                  break;
               case 15:
                  var12 = classXY.method13039(var1, -346779531);
                  break;
               case 17:
                  var13 = 0;
                  var14 = false;
                  break;
               case 18:
                  var14 = false;
                  break;
               case 19:
                  var15 = classXY.method13039(var1, -346779531);
                  break;
               case 21:
                  var16 = 0;
                  break;
               case 22:
                  var17 = true;
                  break;
               case 23:
                  var18 = true;
                  break;
               case 24:
                  var19 = classXY.method13047(var1, -1323360305);
                  if (65535 == var19) {
                     var19 = -1;
                  }
                  break;
               case 27:
                  var13 = 1;
                  break;
               case 28:
                  var20 = classXY.method13039(var1, -346779531);
                  break;
               case 29:
                  var21 = classXY.method13043(var1, (byte)17);
                  break;
               case 30:
               case 31:
               case 32:
               case 33:
               case 34:
               case 100:
               case 101:
               case 102:
                  classPO.method9044(var23, var1, var46, 30, 34, 100, 101, 102, 1161561653);
                  break;
               case 39:
                  var22 = classXY.method13043(var1, (byte)17) * 5;
                  break;
               case 40:
                  int var59 = classXY.method13039(var1, -346779531);
                  var7 = new short[var59];
                  var8 = new short[var59];

                  for (int var66 = 0; var66 < var59; var66++) {
                     var7[var66] = (short)classXY.method13047(var1, -1846630518);
                     var8[var66] = (short)classXY.method13047(var1, -2047651131);
                  }
                  break;
               case 41:
                  int var58 = classXY.method13039(var1, -346779531);
                  var9 = new short[var58];
                  var10 = new short[var58];

                  for (int var65 = 0; var65 < var58; var65++) {
                     var9[var65] = (short)classXY.method13047(var1, -102554966);
                     var10[var65] = (short)classXY.method13047(var1, 1164501279);
                  }
                  break;
               case 61:
                  classXY.method13047(var1, -172294366);
                  break;
               case 62:
                  var26 = true;
                  break;
               case 64:
                  var27 = false;
                  break;
               case 65:
                  var28 = classXY.method13047(var1, -2080287386);
                  break;
               case 66:
                  var29 = classXY.method13047(var1, 38657320);
                  break;
               case 67:
                  var30 = classXY.method13047(var1, 1915859492);
                  break;
               case 68:
                  var25 = classXY.method13047(var1, -641531789);
                  break;
               case 69:
                  classXY.method13039(var1, -346779531);
                  break;
               case 70:
                  var31 = var1.method13050((byte)16);
                  break;
               case 71:
                  var32 = var1.method13050((byte)16);
                  break;
               case 72:
                  var33 = var1.method13050((byte)16);
                  break;
               case 73:
                  var34 = true;
                  break;
               case 74:
                  var35 = true;
                  break;
               case 75:
                  var36 = classXY.method13039(var1, -346779531);
                  break;
               case 77:
               case 92:
                  var39 = classXY.method13047(var1, 1946771396);
                  if (65535 == var39) {
                     var39 = -1;
                  }

                  var40 = classXY.method13047(var1, -1928013773);
                  if (var40 == 65535) {
                     var40 = -1;
                  }

                  int var57 = -1;
                  if (92 == var46) {
                     var57 = classXY.method13047(var1, 1361074484);
                     if (65535 == var57) {
                        var57 = -1;
                     }
                  }

                  int var64 = classXY.method13039(var1, -346779531);
                  var38 = new int[2 + var64];
                  int var69 = 0;

                  for (; var69 <= var64; var69++) {
                     var38[var69] = classXY.method13047(var1, -1528622532);
                     if (var38[var69] == 65535) {
                        var38[var69] = -1;
                     }
                  }

                  var38[var64 + 1] = var57;
                  break;
               case 78:
                  var41.field6689 = classXY.method13047(var1, -1827717086) * -418754533;
                  var41.field6686 = classXY.method13039(var1, -346779531) * 39261697;
                  var41.field6688 = classXY.method13039(var1, -346779531) * -286691225;
                  break;
               case 79:
                  var42.field6784 = classXY.method13047(var1, -1148648289) * -1412665981;
                  var42.field6783 = classXY.method13047(var1, -564967977) * -736985931;
                  var41.field6686 = classXY.method13039(var1, -346779531) * 39261697;
                  var41.field6688 = classXY.method13039(var1, -346779531) * -286691225;
                  int var56 = classXY.method13039(var1, -346779531);
                  var42.field6785 = new int[var56];

                  for (int var63 = 0; var63 < var56; var63++) {
                     var42.field6785[var63] = classXY.method13047(var1, 10166996);
                  }
                  break;
               case 81:
                  var16 = classXY.method13039(var1, -346779531) * 256;
                  break;
               case 82:
                  var24 = classXY.method13047(var1, -467223174);
                  break;
               case 89:
                  var43 = false;
                  break;
               case 90:
                  var44 = true;
                  break;
               case 91:
                  classWD var55 = var41.field6687;
                  int var49 = classXY.method13039(var1, -346779531);
                  classZL var62 = classZL.field7201[var49];
                  var55.method12320(var62, -179178084);
                  break;
               case 93:
                  int var48 = classXY.method13039(var1, -346779531);
                  classZL var47 = classZL.field7201[var48];
                  int var50 = classXY.method13047(var1, 885772415) * 20;
                  var41.field6687.method12314(var47, var50, (byte)81);
                  int var52 = classXY.method13039(var1, -346779531);
                  classZL var51 = classZL.field7201[var52];
                  int var54 = classXY.method13047(var1, 1322257324) * 20;
                  var41.field6687.method12317(var51, var54, -388881497);
                  break;
               case 95:
                  var41.field6690 = (classKC)classOF.method8404(classHF.method6005(-966579297), classXY.method13039(var1, -346779531), 145379329);
                  break;
               case 96:
                  var37 = classXY.method13039(var1, -346779531);
                  break;
               case 249:
                  var45 = classQH.method9525(var1, var45, 1978086108);
            }
         }
      }

      if (-1 == var15) {
         var15 = 0;
         if (null != var4 && (var5 == null || var5[0] == 10)) {
            var15 = 1;
         }

         if (var23.vmethod546((byte)0)) {
            var15 = 1;
         }
      }

      if (var36 == -1) {
         var36 = var13 != 0 ? 1 : 0;
      }

      if (var3 && var35) {
         var13 = 0;
         var14 = false;
      }

      this.field4920 = var4;
      this.field4939 = var5;
      this.field4945 = var6;
      this.field4940 = var7;
      this.field4941 = var8;
      this.field4942 = var9;
      this.field4943 = var10;
      this.field4944 = -1279242757 * var11;
      this.field4924 = var12 * -401373769;
      this.field4946 = var13 * -1601421407;
      this.field4947 = var14;
      this.field4923 = -1410837359 * var15;
      this.field4949 = var16 * 450557271;
      this.field4932 = var17;
      this.field4950 = var18;
      this.field4951 = -129385453 * var19;
      this.field4927 = -241033065 * var20;
      this.field4952 = var21 * -462559883;
      this.field4921 = -1630376027 * var22;
      this.field4935 = var23;
      this.field4953 = 1022644465 * var24;
      this.field4954 = var25 * -2041631353;
      this.field4955 = var26;
      this.field4938 = var27;
      this.field4957 = -717840543 * var28;
      this.field4929 = 1701928533 * var29;
      this.field4958 = -861285851 * var30;
      this.field4959 = var31 * -638985293;
      this.field4960 = 943269191 * var32;
      this.field4961 = -2113260135 * var33;
      this.field4933 = var34;
      this.field4956 = var36 * 1383196645;
      this.field4937 = -357278883 * var37;
      this.field4930 = var38;
      this.field4926 = var39 * -1595279675;
      this.field4962 = var40 * 883773675;
      this.field4963 = var41;
      this.field4934 = var42;
      this.field4964 = var43;
      this.field4965 = var44;
      if (null == var45) {
         this.field4931 = new classYN(1);
      } else {
         this.field4931 = var45;
      }

      this.method8593(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(II[[IIIII)Lee;")
   @ObfuscatedName("ac")
   public final classEE method8541(int var1, int var2, int[][] var3, int var4, int var5, int var6, int var7) {
      try {
         long var8;
         if (this.field4939 == null) {
            if (var7 >= 682279145) {
               throw new IllegalStateException();
            }

            var8 = var2 + (this.field4922 * -381960671 << 10);
         } else {
            var8 = var2 + (this.field4922 * -381960671 << 10) + (var1 << 3);
         }

         Object var10 = (classEE)field4972.method6422(var8);
         if (var10 == null) {
            if (var7 >= 682279145) {
               throw new IllegalStateException();
            }

            classER var11 = this.method8595(var1, var2, -1973084331);
            if (var11 == null) {
               if (var7 >= 682279145) {
                  throw new IllegalStateException();
               }

               return null;
            }

            if (!this.field4932) {
               if (var7 >= 682279145) {
                  throw new IllegalStateException();
               }

               var10 = var11.method4045(54395613 * this.field4952 + 64, 768 + -1693032223 * this.field4921, -50, -10, -50);
            } else {
               var11.field1878 = (short)(64 + 54395613 * this.field4952);
               var11.field1879 = (short)(768 + -1693032223 * this.field4921);
               classER.method4015(var11);
               var10 = var11;
            }

            field4972.method6428((classVJ)var10, var8);
         }

         if (this.field4932) {
            if (var7 >= 682279145) {
               throw new IllegalStateException();
            }

            var10 = classER.method3985((classER)var10);
         }

         if (this.field4949 * 1531627111 >= 0) {
            if (var7 >= 682279145) {
               throw new IllegalStateException();
            }

            if (var10 instanceof classFX) {
               if (var7 >= 682279145) {
                  throw new IllegalStateException();
               }

               var10 = ((classFX)var10).method5246(var3, var4, var5, var6, true, 1531627111 * this.field4949);
            } else if (var10 instanceof classER) {
               if (var7 >= 682279145) {
                  throw new IllegalStateException();
               }

               var10 = ((classER)var10).method3987(var3, var4, var5, var6, true, this.field4949 * 1531627111);
            }
         }

         return (classEE)var10;
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "om.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lom;")
   @ObfuscatedName("bl")
   public final classOM method8550() {
      int var1 = -1;
      if (1087117325 * this.field4926 != -1) {
         var1 = classEM.method3922(this.field4926 * 1087117325, -1577287914);
      } else if (-1 != -1047341117 * this.field4962) {
         var1 = classLB.field4090[this.field4962 * -1047341117];
      }

      int var2;
      if (var1 >= 0 && var1 < this.field4930.length - 1) {
         var2 = this.field4930[var1];
      } else {
         var2 = this.field4930[this.field4930.length - 1];
      }

      return -1 != var2 ? classMU.method7729(var2, 1740798143) : null;
   }

   @ObfuscatedSignature(descriptor = "(II[[IIIILou;II)Lfx;")
   @ObfuscatedName("ao")
   public final classFX method8594(int var1, int var2, int[][] var3, int var4, int var5, int var6, classOU var7, int var8, int var9) {
      return this.method8596(rl21.field5728, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @ObfuscatedSignature(descriptor = "(III)Ler;")
   @ObfuscatedName("al")
   final classER method8595(int var1, int var2, int var3) {
      synchronized (field4968) {
         int var8 = var2;
         int var7 = var1;
         classOM var6 = this;
         int var9 = -1973084331;

         classER var34;
         try {
            classER var10 = null;
            if (var6.field4939 == null) {
               if (10 != var7) {
                  return null;
               }

               if (var6.field4920 == null) {
                  if (var9 != -1973084331) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               boolean var11 = var6.field4955;
               if (var7 == 2) {
                  if (var9 != -1973084331) {
                     throw new IllegalStateException();
                  }

                  if (var8 > 3) {
                     if (var9 != -1973084331) {
                        throw new IllegalStateException();
                     }

                     boolean var10000;
                     if (!var11) {
                        if (var9 != -1973084331) {
                           throw new IllegalStateException();
                        }

                        var10000 = true;
                     } else {
                        var10000 = false;
                     }

                     var11 = var10000;
                  }
               }

               int var12 = var6.field4920.length;

               for (int var13 = 0; var13 < var12; var13++) {
                  int var14 = var6.field4920[var13];
                  int var15 = var14;
                  if (var11) {
                     if (var9 != -1973084331) {
                        throw new IllegalStateException();
                     }

                     var15 = -var14;
                  }

                  var10 = (classER)field4968.method6422(var15);
                  if (var10 == null) {
                     if (var9 != -1973084331) {
                        throw new IllegalStateException();
                     }

                     var10 = classER.method4047(classKD.field3554, var14, 0);
                     if (null == var10) {
                        if (var9 != -1973084331) {
                           throw new IllegalStateException();
                        }

                        return null;
                     }

                     if (var11) {
                        if (var9 != -1973084331) {
                           throw new IllegalStateException();
                        }

                        var10.method4008();
                     }

                     field4968.method6428(var10, var15);
                  }

                  if (var12 > 1) {
                     if (var9 != -1973084331) {
                        throw new IllegalStateException();
                     }

                     field4969[var13] = var10;
                  }
               }

               if (var12 > 1) {
                  if (var9 != -1973084331) {
                     throw new IllegalStateException();
                  }

                  var10 = new classER(field4969, var12);
               }
            } else {
               int var24 = -1;

               for (int var26 = 0; var26 < var6.field4939.length; var26++) {
                  if (var9 != -1973084331) {
                     throw new IllegalStateException();
                  }

                  if (var6.field4939[var26] == var7) {
                     if (var9 != -1973084331) {
                        throw new IllegalStateException();
                     }

                     var24 = var26;
                     break;
                  }
               }

               if (-1 == var24) {
                  if (var9 != -1973084331) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               int var27 = var6.field4920[var24];
               int var29 = var27;
               boolean var10001;
               if (var8 > 3) {
                  if (var9 != -1973084331) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               boolean var31 = var6.field4955 ^ var10001;
               if (var31) {
                  if (var9 != -1973084331) {
                     throw new IllegalStateException();
                  }

                  var29 = var27 + 65536;
               }

               var10 = (classER)field4968.method6422(var29);
               if (var10 == null) {
                  if (var9 != -1973084331) {
                     throw new IllegalStateException();
                  }

                  var10 = classER.method4047(classKD.field3554, var27, 0);
                  if (null == var10) {
                     if (var9 != -1973084331) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  if (var31) {
                     var10.method4008();
                  }

                  field4968.method6428(var10, var29);
               }
            }

            boolean var25;
            label323: {
               if (-1739570015 * var6.field4957 == 128 && -1787252995 * var6.field4929 == 128) {
                  if (var9 != -1973084331) {
                     throw new IllegalStateException();
                  }

                  if (128 == 927725997 * var6.field4958) {
                     var25 = false;
                     break label323;
                  }

                  if (var9 != -1973084331) {
                     throw new IllegalStateException();
                  }
               }

               var25 = true;
            }

            boolean var28;
            label315: {
               if (0 == 916605819 * var6.field4959 && 0 == 2128147575 * var6.field4960) {
                  if (var9 != -1973084331) {
                     throw new IllegalStateException();
                  }

                  if (0 == var6.field4961 * -1155641687) {
                     var28 = false;
                     break label315;
                  }

                  if (var9 != -1973084331) {
                     throw new IllegalStateException();
                  }
               }

               var28 = true;
            }

            boolean var10003;
            label307: {
               var34 = new classER;
               if (0 == var8) {
                  if (var9 != -1973084331) {
                     throw new IllegalStateException();
                  }

                  if (!var25) {
                     if (var9 != -1973084331) {
                        throw new IllegalStateException();
                     }

                     if (!var28) {
                        if (var9 != -1973084331) {
                           throw new IllegalStateException();
                        }

                        var10003 = true;
                        break label307;
                     }
                  }
               }

               var10003 = false;
            }

            boolean var10004;
            if (null == var6.field4940) {
               if (var9 != -1973084331) {
                  throw new IllegalStateException();
               }

               var10004 = true;
            } else {
               var10004 = false;
            }

            boolean var10005;
            if (null == var6.field4942) {
               if (var9 != -1973084331) {
                  throw new IllegalStateException();
               }

               var10005 = true;
            } else {
               var10005 = false;
            }

            var34./* $VF: Unable to resugar constructor */<init>(var10, var10003, var10004, var10005, true);
            classER var30 = var34;
            if (var7 == 4) {
               if (var9 != -1973084331) {
                  throw new IllegalStateException();
               }

               if (var8 > 3) {
                  var30.method3998(256);
                  classER.method4040(var30, 45, 0, -45);
               }
            }

            var8 &= 3;
            if (1 == var8) {
               if (var9 != -1973084331) {
                  throw new IllegalStateException();
               }

               var30.method4034();
            } else if (2 == var8) {
               if (var9 != -1973084331) {
                  throw new IllegalStateException();
               }

               classER.method4042(var30);
            } else if (3 == var8) {
               if (var9 != -1973084331) {
                  throw new IllegalStateException();
               }

               var30.method4044();
            }

            if (null != var6.field4940) {
               for (int var32 = 0; var32 < var6.field4940.length; var32++) {
                  if (var9 != -1973084331) {
                     throw new IllegalStateException();
                  }

                  var30.method4001(var6.field4940[var32], var6.field4941[var32]);
               }
            }

            if (null != var6.field4942) {
               if (var9 != -1973084331) {
                  throw new IllegalStateException();
               }

               for (int var33 = 0; var33 < var6.field4942.length; var33++) {
                  if (var9 != -1973084331) {
                     throw new IllegalStateException();
                  }

                  var30.method4004(var6.field4942[var33], var6.field4943[var33]);
               }
            }

            if (var25) {
               if (var9 != -1973084331) {
                  throw new IllegalStateException();
               }

               var30.method4035(-1739570015 * var6.field4957, var6.field4929 * -1787252995, 927725997 * var6.field4958);
            }

            if (var28) {
               if (var9 != -1973084331) {
                  throw new IllegalStateException();
               }

               classER.method4040(var30, 916605819 * var6.field4959, 2128147575 * var6.field4960, var6.field4961 * -1155641687);
            }

            var34 = var30;
         } catch (RuntimeException var16) {
            throw classEG.method3884(var16, "om.al(" + ')');
         }

         return var34;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ler;")
   @ObfuscatedName("bs")
   final classER method8546(int var1, int var2) {
      classER var3 = null;
      if (this.field4939 == null) {
         if (10 != var1) {
            return null;
         }

         if (this.field4920 == null) {
            return null;
         }

         boolean var4 = this.field4955;
         if (var1 == 2 && var2 > 3) {
            var4 = !var4;
         }

         int var5 = this.field4920.length;

         for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field4920[var6];
            int var8 = var7;
            if (var4) {
               var8 = -var7;
            }

            var3 = (classER)field4968.method6422(var8);
            if (var3 == null) {
               var3 = classER.method4047(classKD.field3554, var7, 0);
               if (null == var3) {
                  return null;
               }

               if (var4) {
                  var3.method4008();
               }

               field4968.method6428(var3, var8);
            }

            if (var5 > 1) {
               field4969[var6] = var3;
            }
         }

         if (var5 > 1) {
            var3 = new classER(field4969, var5);
         }
      } else {
         int var10 = -1;

         for (int var12 = 0; var12 < this.field4939.length; var12++) {
            if (this.field4939[var12] == var1) {
               var10 = var12;
               break;
            }
         }

         if (-1 == var10) {
            return null;
         }

         int var13 = this.field4920[var10];
         int var15 = var13;
         boolean var17 = this.field4955 ^ var2 > 3;
         if (var17) {
            var15 = var13 + 65536;
         }

         var3 = (classER)field4968.method6422(var15);
         if (var3 == null) {
            var3 = classER.method4047(classKD.field3554, var13, 0);
            if (null == var3) {
               return null;
            }

            if (var17) {
               var3.method4008();
            }

            field4968.method6428(var3, var15);
         }
      }

      boolean var11;
      if (-1739570015 * this.field4957 == 128 && 1556070562 * this.field4929 == 678446451 && 128 == 1247638989 * this.field4958) {
         var11 = false;
      } else {
         var11 = true;
      }

      boolean var14;
      if (0 == 1498747178 * this.field4959 && 0 == 2128147575 * this.field4960 && 0 == this.field4961 * 410541903) {
         var14 = false;
      } else {
         var14 = true;
      }

      classER var16 = new classER(var3, 0 == var2 && !var11 && !var14, null == this.field4940, null == this.field4942, true);
      if (var1 == 4 && var2 > 3) {
         var16.method3998(256);
         classER.method4040(var16, 45, 0, -45);
      }

      var2 &= 3;
      if (1 == var2) {
         var16.method4034();
      } else if (2 == var2) {
         classER.method4042(var16);
      } else if (3 == var2) {
         var16.method4044();
      }

      if (null != this.field4940) {
         for (int var18 = 0; var18 < this.field4940.length; var18++) {
            var16.method4001(this.field4940[var18], this.field4941[var18]);
         }
      }

      if (null != this.field4942) {
         for (int var19 = 0; var19 < this.field4942.length; var19++) {
            var16.method4004(this.field4942[var19], this.field4943[var19]);
         }
      }

      if (var11) {
         var16.method4035(465675757 * this.field4957, this.field4929 * -1787252995, 927725997 * this.field4958);
      }

      if (var14) {
         classER.method4040(var16, -2036368304 * this.field4959, -1514674730 * this.field4960, this.field4961 * -1155641687);
      }

      return var16;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ay")
   public int method8556(int var1, int var2, int var3) {
      try {
         return classGQ.method5602(this.field4931, var1, var2, 1332934508);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "om.ay(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IJ)J")
   @ObfuscatedName("aq")
   public long method8558(int var1, long var2) {
      try {
         return classBW.method1276(this.field4931, var1, var2);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "om.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("ad")
   public String method8563(int var1, String var2, int var3) {
      try {
         return classFS.method4977(this.field4931, var1, var2, (byte)117);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "om.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lwj;")
   @ObfuscatedName("au")
   public classWJ method8573(int var1) {
      try {
         return this.field4963;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "om.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bz")
   public int method8581(int var1, int var2) {
      try {
         if (var1 != 1) {
            if (var2 >= -1327280404) {
               throw new IllegalStateException();
            }

            if (3 != var1) {
               return this.field4944 * -582306509;
            }
         }

         return 402876423 * this.field4924;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "om.ar(" + 41);
      }
   }

   public int getMapIconId() {
      return this.field4953 * 1412472849;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bm")
   public static void method8524() {
      classJZ.method6431(field4966);
      classJZ.method6431(field4968);
      classJZ.method6431(field4972);
      classJZ.method6431(field4967);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cy")
   public boolean method8568() {
      if (null == this.field4930) {
         return -1727985133 * this.field4963.field6689 != -1 || null != this.field4934.field6785;
      } else {
         int[] var1 = this.field4930;

         for (int var2 = 0; var2 < var1.length; var2++) {
            int var3 = var1[var2];
            if (var3 != -1) {
               classOM var4 = classMU.method7729(var3, 1386702190);
               if (var4.field4963.field6689 * -1727985133 != -1 || null != var4.field4934.field6785) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()Loz;")
   @ObfuscatedName("av")
   public classOZ method8514() {
      return this.field4935;
   }

   @ObfuscatedSignature(descriptor = "()Loz;")
   @ObfuscatedName("at")
   public classOZ method8515() {
      return this.field4935;
   }

   @ObfuscatedSignature(descriptor = "()Lom;")
   @ObfuscatedName("cj")
   public classOM method8597() {
      return method8553(this, 1360030034);
   }

   public int getVarPlayerId() {
      return this.field4962 * -1047341117;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Lva;Z)V")
   @ObfuscatedName("an")
   public static void method8517(classVA var0, classVA var1, boolean var2) {
      classAK.field213 = var0;
      classKD.field3554 = var1;
      field4971 = var2;
   }

   @ObfuscatedSignature(descriptor = "(Lom;I)Z")
   @ObfuscatedName("bo")
   public static boolean method8569(classOM var0, int var1) {
      if (var0 == null) {
         return var0.method8535(var1);
      } else {
         try {
            if (null == var0.field4930) {
               if (var1 != 1754865660) {
                  throw new IllegalStateException();
               } else {
                  if (-1727985133 * var0.field4963.field6689 == -1) {
                     if (null == var0.field4934.field6785) {
                        return false;
                     }

                     if (var1 != 1754865660) {
                        throw new IllegalStateException();
                     }
                  }

                  return true;
               }
            } else {
               int[] var2 = var0.field4930;
               int var3 = 0;

               while (true) {
                  if (var3 >= var2.length) {
                     return false;
                  }

                  int var4 = var2[var3];
                  if (var4 != -1) {
                     if (var1 != 1754865660) {
                        throw new IllegalStateException();
                     }

                     classOM var5 = classMU.method7729(var4, 1742402583);
                     if (var5.field4963.field6689 * -1727985133 != -1) {
                        break;
                     }

                     if (null != var5.field4934.field6785) {
                        if (var1 != 1754865660) {
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
            throw classEG.method3884(var6, "om.ap(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmu;Ljava/lang/String;)Z")
   @ObfuscatedName("il")
   public static boolean method8529(classMU var0, String var1) {
      if (var0 == null) {
         var0.method7715();
      }

      classMU.method7696(var0, 2, var1, (byte)10);
      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Lva;Z)V")
   @ObfuscatedName("am")
   public static void method8518(classVA var0, classVA var1, boolean var2) {
      classAK.field213 = var0;
      classKD.field3554 = var1;
      field4971 = var2;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cq")
   public boolean method8598() {
      return method8569(this, 1754865660);
   }

   @ObfuscatedSignature(descriptor = "()Lww;")
   @ObfuscatedName("cz")
   public classWW method8578() {
      return this.field4934;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lom;")
   @ObfuscatedName("bn")
   public static classOM method8519(int var0) {
      classOM var1 = (classOM)field4966.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classAK.field213.method11867(6, var0, -2130343881);
         var1 = new classOM(new classXY(var2), var0, true);
         field4966.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lom;")
   @ObfuscatedName("bx")
   public static classOM method8520(int var0) {
      classOM var1 = (classOM)field4966.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classAK.field213.method11867(6, var0, -2109516495);
         var1 = new classOM(new classXY(var2), var0, true);
         field4966.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lom;")
   @ObfuscatedName("bc")
   public static classOM method8521(int var0) {
      classOM var1 = (classOM)field4966.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classAK.field213.method11867(6, var0, -1624545876);
         var1 = new classOM(new classXY(var2), var0, true);
         field4966.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lom;")
   @ObfuscatedName("bp")
   public static classOM method8522(int var0) {
      classOM var1 = (classOM)field4966.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classAK.field213.method11867(6, var0, -1352222775);
         var1 = new classOM(new classXY(var2), var0, true);
         field4966.method6428(var1, var0);
         return var1;
      }
   }

   public int getMapSceneId() {
      return this.field4954 * 1680279607;
   }

   @ObfuscatedSignature(descriptor = "(II[[IIII)Lee;")
   @ObfuscatedName("kz")
   public classEE method8599(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      return this.method8541(var1, var2, var3, var4, var5, var6, -663588657);
   }

   public void setMapSceneId(int var1) {
      this.field4954 = var1 * -2041631353;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lom;)Lom;")
   @ObfuscatedName("zp")
   public static classOM method8551(classOM var0) {
      if (var0 == null) {
         var0.method8554();
      }

      int var1 = -1;
      if (1087117325 * var0.field4926 != -1) {
         var1 = classEM.method3922(var0.field4926 * 1087117325, -1660517570);
      } else if (-1 != -1047341117 * var0.field4962) {
         var1 = classLB.field4090[var0.field4962 * -1047341117];
      }

      int var2;
      if (var1 >= 0 && var1 < var0.field4930.length - 1) {
         var2 = var0.field4930[var1];
      } else {
         var2 = var0.field4930[var0.field4930.length - 1];
      }

      return -1 != var2 ? classMU.method7729(var2, 1941489345) : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("br")
   public static void method8525() {
      classJZ.method6431(field4966);
      classJZ.method6431(field4968);
      classJZ.method6431(field4972);
      classJZ.method6431(field4967);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("dc")
   public String method8588() {
      return this.field4945;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bt")
   public static void method8526() {
      classJZ.method6431(field4966);
      classJZ.method6431(field4968);
      classJZ.method6431(field4972);
      classJZ.method6431(field4967);
   }

   @ObfuscatedSignature(descriptor = "()Lpo;")
   @ObfuscatedName("bg")
   classPO method8528() {
      return new classPO();
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bj")
   public final boolean method8530(int var1) {
      if (null != this.field4939) {
         for (int var4 = 0; var4 < this.field4939.length; var4++) {
            if (var1 == this.field4939[var4]) {
               return classKD.field3554.method11871(this.field4920[var4], 0, (byte)-40);
            }
         }

         return true;
      } else if (null == this.field4920) {
         return true;
      } else if (10 != var1) {
         return true;
      } else {
         boolean var2 = true;

         for (int var3 = 0; var3 < this.field4920.length; var3++) {
            var2 &= classKD.field3554.method11871(this.field4920[var3], 0, (byte)-66);
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(IJ)J")
   @ObfuscatedName("cp")
   public long method8559(int var1, long var2) {
      return classBW.method1276(this.field4931, var1, var2);
   }

   public IterableHashTable getParams() {
      return this.field4931;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hu")
   public int method8600() {
      return this.field4924 * 402876423;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("dd")
   public String method8589() {
      return this.field4945;
   }

   public int getSizeX() {
      return this.field4944 * -582306509;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bu")
   public final boolean method8536() {
      if (null == this.field4920) {
         return true;
      } else {
         boolean var1 = true;

         for (int var2 = 0; var2 < this.field4920.length; var2++) {
            var1 &= classKD.field3554.method11871(this.field4920[var2], 0, (byte)88);
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ba")
   public final boolean method8537() {
      if (null == this.field4920) {
         return true;
      } else {
         boolean var1 = true;

         for (int var2 = 0; var2 < this.field4920.length; var2++) {
            var1 &= classKD.field3554.method11871(this.field4920[var2], 0, (byte)60);
         }

         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lom;IJ)J")
   @ObfuscatedName("xz")
   public static long method8560(classOM var0, int var1, long var2) {
      return classBW.method1276(var0.field4931, var1, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lom;")
   @ObfuscatedName("ah")
   public static classOM method8523(int var0) {
      classOM var1 = (classOM)field4966.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classAK.field213.method11867(6, var0, -2041051687);
         var1 = new classOM(new classXY(var2), var0, true);
         field4966.method6428(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bo")
   public final boolean method8531(int var1) {
      if (null != this.field4939) {
         for (int var4 = 0; var4 < this.field4939.length; var4++) {
            if (var1 == this.field4939[var4]) {
               return classKD.field3554.method11871(this.field4920[var4], 0, (byte)-120);
            }
         }

         return true;
      } else if (null == this.field4920) {
         return true;
      } else if (10 != var1) {
         return true;
      } else {
         boolean var2 = true;

         for (int var3 = 0; var3 < this.field4920.length; var3++) {
            var2 &= classKD.field3554.method11871(this.field4920[var3], 0, (byte)-19);
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cw")
   public int method8582(int var1) {
      return var1 != 1 && 3 != var1 ? this.field4944 * -582306509 : 402876423 * this.field4924;
   }

   @ObfuscatedSignature(descriptor = "(II[[IIIILou;I)Lfx;")
   @ObfuscatedName("by")
   public final classFX method8545(int var1, int var2, int[][] var3, int var4, int var5, int var6, classOU var7, int var8) {
      long var9;
      if (this.field4939 == null) {
         var9 = (this.field4922 * -381960671 << 10) + var2;
      } else {
         var9 = var2 + (var1 << 3) + (this.field4922 * 1814617244 << 10);
      }

      classFX var11 = (classFX)field4967.method6422(var9);
      if (var11 == null) {
         classER var12 = this.method8595(var1, var2, -1973084331);
         if (var12 == null) {
            return null;
         }

         var11 = var12.method4045(-1042493251 + this.field4952 * 855392251, -1385446499 + this.field4921 * -1693032223, -1803986547, -10, -249356147);
         field4967.method6428(var11, var9);
      }

      if (var7 == null && -1 == this.field4949 * 1531627111) {
         return var11;
      } else {
         if (null != var7) {
            var11 = var7.method8790(var11, var8, var2, (byte)55);
         } else {
            var11 = var11.method5081(true);
         }

         if (this.field4949 * 1531627111 >= 0 && var3 != null) {
            var11 = var11.method5246(var3, var4, var5, var6, false, -1799680311 * this.field4949);
         }

         return var11;
      }
   }

   public int getVarbitId() {
      return this.field4926 * 1087117325;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lom;I)I")
   @ObfuscatedName("pw")
   public static int method8586(classOM var0, int var1) {
      if (var0 == null) {
         var0.method8604(var1, var1);
      }

      return 1 != var1 && 3 != var1 ? var0.field4924 * 402876423 : -582306509 * var0.field4944;
   }

   public int getSizeY() {
      return this.field4924 * 402876423;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;IZ)V")
   @ObfuscatedName("hd")
   public void method8593(classXY var1, int var2, boolean var3) {
      if (this.field4949 * 1531627111 > 0 && (client.field1096 & 16) == 0) {
         this.field4949 = -1 * 450557271;
      }

      PostObjectComposition var4 = new PostObjectComposition(this);
      classOE.field4843.getCallbacks().post(var4);
   }

   @ObfuscatedSignature(descriptor = "(II)Ler;")
   @ObfuscatedName("bq")
   final classER method8547(int var1, int var2) {
      classER var3 = null;
      if (this.field4939 == null) {
         if (10 != var1) {
            return null;
         }

         if (this.field4920 == null) {
            return null;
         }

         boolean var4 = this.field4955;
         if (var1 == 2 && var2 > 3) {
            var4 = !var4;
         }

         int var5 = this.field4920.length;

         for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field4920[var6];
            int var8 = var7;
            if (var4) {
               var8 = -var7;
            }

            var3 = (classER)field4968.method6422(var8);
            if (var3 == null) {
               var3 = classER.method4047(classKD.field3554, var7, 0);
               if (null == var3) {
                  return null;
               }

               if (var4) {
                  var3.method4008();
               }

               field4968.method6428(var3, var8);
            }

            if (var5 > 1) {
               field4969[var6] = var3;
            }
         }

         if (var5 > 1) {
            var3 = new classER(field4969, var5);
         }
      } else {
         int var10 = -1;

         for (int var12 = 0; var12 < this.field4939.length; var12++) {
            if (this.field4939[var12] == var1) {
               var10 = var12;
               break;
            }
         }

         if (-1 == var10) {
            return null;
         }

         int var13 = this.field4920[var10];
         int var15 = var13;
         boolean var17 = this.field4955 ^ var2 > 3;
         if (var17) {
            var15 = var13 + 65536;
         }

         var3 = (classER)field4968.method6422(var15);
         if (var3 == null) {
            var3 = classER.method4047(classKD.field3554, var13, 0);
            if (null == var3) {
               return null;
            }

            if (var17) {
               var3.method4008();
            }

            field4968.method6428(var3, var15);
         }
      }

      boolean var11;
      if (-1739570015 * this.field4957 == -646336826 && 2050582693 * this.field4929 == 128 && 1247934193 == 1806556256 * this.field4958) {
         var11 = false;
      } else {
         var11 = true;
      }

      boolean var14;
      if (0 == 2086558097 * this.field4959 && 0 == 2128147575 * this.field4960 && 0 == this.field4961 * -1575524189) {
         var14 = false;
      } else {
         var14 = true;
      }

      classER var16 = new classER(var3, 0 == var2 && !var11 && !var14, null == this.field4940, null == this.field4942, true);
      if (var1 == 4 && var2 > 3) {
         var16.method3998(465718752);
         classER.method4040(var16, -761527048, 0, -45);
      }

      var2 &= 3;
      if (1 == var2) {
         var16.method4034();
      } else if (2 == var2) {
         classER.method4042(var16);
      } else if (3 == var2) {
         var16.method4044();
      }

      if (null != this.field4940) {
         for (int var18 = 0; var18 < this.field4940.length; var18++) {
            var16.method4001(this.field4940[var18], this.field4941[var18]);
         }
      }

      if (null != this.field4942) {
         for (int var19 = 0; var19 < this.field4942.length; var19++) {
            var16.method4004(this.field4942[var19], this.field4943[var19]);
         }
      }

      if (var11) {
         var16.method4035(-1739570015 * this.field4957, this.field4929 * 840287888, 927725997 * this.field4958);
      }

      if (var14) {
         classER.method4040(var16, 916605819 * this.field4959, 2128147575 * this.field4960, this.field4961 * -1155641687);
      }

      return var16;
   }

   @ObfuscatedSignature(descriptor = "(II)Ler;")
   @ObfuscatedName("bf")
   final classER method8548(int var1, int var2) {
      classER var3 = null;
      if (this.field4939 == null) {
         if (10 != var1) {
            return null;
         }

         if (this.field4920 == null) {
            return null;
         }

         boolean var4 = this.field4955;
         if (var1 == 2 && var2 > 3) {
            var4 = !var4;
         }

         int var5 = this.field4920.length;

         for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field4920[var6];
            int var8 = var7;
            if (var4) {
               var8 = -var7;
            }

            var3 = (classER)field4968.method6422(var8);
            if (var3 == null) {
               var3 = classER.method4047(classKD.field3554, var7, 0);
               if (null == var3) {
                  return null;
               }

               if (var4) {
                  var3.method4008();
               }

               field4968.method6428(var3, var8);
            }

            if (var5 > 1) {
               field4969[var6] = var3;
            }
         }

         if (var5 > 1) {
            var3 = new classER(field4969, var5);
         }
      } else {
         int var10 = -1;

         for (int var12 = 0; var12 < this.field4939.length; var12++) {
            if (this.field4939[var12] == var1) {
               var10 = var12;
               break;
            }
         }

         if (-1 == var10) {
            return null;
         }

         int var13 = this.field4920[var10];
         int var15 = var13;
         boolean var17 = this.field4955 ^ var2 > 3;
         if (var17) {
            var15 = var13 + -747842956;
         }

         var3 = (classER)field4968.method6422(var15);
         if (var3 == null) {
            var3 = classER.method4047(classKD.field3554, var13, 0);
            if (null == var3) {
               return null;
            }

            if (var17) {
               var3.method4008();
            }

            field4968.method6428(var3, var15);
         }
      }

      boolean var11;
      if (909269177 * this.field4957 == 128 && -1118843512 * this.field4929 == 128 && 116012078 == 927725997 * this.field4958) {
         var11 = false;
      } else {
         var11 = true;
      }

      boolean var14;
      if (0 == 916605819 * this.field4959 && 0 == 2128147575 * this.field4960 && 0 == this.field4961 * -1155641687) {
         var14 = false;
      } else {
         var14 = true;
      }

      classER var16 = new classER(var3, 0 == var2 && !var11 && !var14, null == this.field4940, null == this.field4942, true);
      if (var1 == 4 && var2 > 3) {
         var16.method3998(256);
         classER.method4040(var16, 45, 0, -45);
      }

      var2 &= 3;
      if (1 == var2) {
         var16.method4034();
      } else if (2 == var2) {
         classER.method4042(var16);
      } else if (3 == var2) {
         var16.method4044();
      }

      if (null != this.field4940) {
         for (int var18 = 0; var18 < this.field4940.length; var18++) {
            var16.method4001(this.field4940[var18], this.field4941[var18]);
         }
      }

      if (null != this.field4942) {
         for (int var19 = 0; var19 < this.field4942.length; var19++) {
            var16.method4004(this.field4942[var19], this.field4943[var19]);
         }
      }

      if (var11) {
         var16.method4035(-1739570015 * this.field4957, this.field4929 * -1787252995, 927725997 * this.field4958);
      }

      if (var14) {
         classER.method4040(var16, 916605819 * this.field4959, 2128147575 * this.field4960, this.field4961 * -1155641687);
      }

      return var16;
   }

   public void setMapIconId(int var1) {
      this.field4953 = var1 * 1022644465;
   }

   @ObfuscatedSignature(descriptor = "(II[[IIII)Lfx;")
   @ObfuscatedName("be")
   public final classFX method8543(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (null == this.field4939) {
         var7 = (this.field4922 * -381960671 << 10) + var2;
      } else {
         var7 = (var1 << 3) + (this.field4922 * -381960671 << 10) + var2;
      }

      classFX var9 = (classFX)field4967.method6422(var7);
      if (null == var9) {
         classER var10 = this.method8595(var1, var2, -1973084331);
         if (null == var10) {
            return null;
         }

         var9 = var10.method4045(this.field4952 * 54395613 + 64, this.field4921 * -1693032223 + 768, -50, -10, -50);
         field4967.method6428(var9, var7);
      }

      if (this.field4949 * 1531627111 >= 0) {
         var9 = var9.method5246(var3, var4, var5, var6, true, 1531627111 * this.field4949);
      }

      return var9;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bk")
   public final boolean method8532(int var1) {
      if (null != this.field4939) {
         for (int var4 = 0; var4 < this.field4939.length; var4++) {
            if (var1 == this.field4939[var4]) {
               return classKD.field3554.method11871(this.field4920[var4], 0, (byte)42);
            }
         }

         return true;
      } else if (null == this.field4920) {
         return true;
      } else if (10 != var1) {
         return true;
      } else {
         boolean var2 = true;

         for (int var3 = 0; var3 < this.field4920.length; var3++) {
            var2 &= classKD.field3554.method11871(this.field4920[var3], 0, (byte)29);
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lom;")
   @ObfuscatedName("bh")
   public final classOM method8552() {
      int var1 = -1;
      if (1087117325 * this.field4926 != -1) {
         var1 = classEM.method3922(this.field4926 * 1087117325, -1287755388);
      } else if (-1 != -1047341117 * this.field4962) {
         var1 = classLB.field4090[this.field4962 * -1047341117];
      }

      int var2;
      if (var1 >= 0 && var1 < this.field4930.length - 1) {
         var2 = this.field4930[var1];
      } else {
         var2 = this.field4930[this.field4930.length - 1];
      }

      return -1 != var2 ? classMU.method7729(var2, 1488710693) : null;
   }

   public int getId() {
      return this.field4922 * -381960671;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lom;I)I")
   @ObfuscatedName("se")
   public static int method8583(classOM var0, int var1) {
      if (var0 == null) {
         var0.method8571();
      }

      return var1 != 1 && 3 != var1 ? var0.field4944 * -582306509 : -78318575 * var0.field4924;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("oq")
   public int method8601() {
      return this.field4944 * -582306509;
   }

   @ObfuscatedSignature(descriptor = "()Lpo;")
   @ObfuscatedName("eu")
   public classPO method8602() {
      return this.field4935;
   }

   @ObfuscatedSignature(descriptor = "(II)Ler;")
   @ObfuscatedName("bd")
   final classER method8549(int var1, int var2) {
      classER var3 = null;
      if (this.field4939 == null) {
         if (10 != var1) {
            return null;
         }

         if (this.field4920 == null) {
            return null;
         }

         boolean var4 = this.field4955;
         if (var1 == 2 && var2 > 3) {
            var4 = !var4;
         }

         int var5 = this.field4920.length;

         for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.field4920[var6];
            int var8 = var7;
            if (var4) {
               var8 = -var7;
            }

            var3 = (classER)field4968.method6422(var8);
            if (var3 == null) {
               var3 = classER.method4047(classKD.field3554, var7, 0);
               if (null == var3) {
                  return null;
               }

               if (var4) {
                  var3.method4008();
               }

               field4968.method6428(var3, var8);
            }

            if (var5 > 1) {
               field4969[var6] = var3;
            }
         }

         if (var5 > 1) {
            var3 = new classER(field4969, var5);
         }
      } else {
         int var10 = -1;

         for (int var12 = 0; var12 < this.field4939.length; var12++) {
            if (this.field4939[var12] == var1) {
               var10 = var12;
               break;
            }
         }

         if (-1 == var10) {
            return null;
         }

         int var13 = this.field4920[var10];
         int var15 = var13;
         boolean var17 = this.field4955 ^ var2 > 3;
         if (var17) {
            var15 = var13 + 65536;
         }

         var3 = (classER)field4968.method6422(var15);
         if (var3 == null) {
            var3 = classER.method4047(classKD.field3554, var13, 0);
            if (null == var3) {
               return null;
            }

            if (var17) {
               var3.method4008();
            }

            field4968.method6428(var3, var15);
         }
      }

      boolean var11;
      if (-1739570015 * this.field4957 == 128 && -1787252995 * this.field4929 == 128 && 128 == 927725997 * this.field4958) {
         var11 = false;
      } else {
         var11 = true;
      }

      boolean var14;
      if (0 == 916605819 * this.field4959 && 0 == 2128147575 * this.field4960 && 0 == this.field4961 * -1155641687) {
         var14 = false;
      } else {
         var14 = true;
      }

      classER var16 = new classER(var3, 0 == var2 && !var11 && !var14, null == this.field4940, null == this.field4942, true);
      if (var1 == 4 && var2 > 3) {
         var16.method3998(256);
         classER.method4040(var16, 45, 0, -45);
      }

      var2 &= 3;
      if (1 == var2) {
         var16.method4034();
      } else if (2 == var2) {
         classER.method4042(var16);
      } else if (3 == var2) {
         var16.method4044();
      }

      if (null != this.field4940) {
         for (int var18 = 0; var18 < this.field4940.length; var18++) {
            var16.method4001(this.field4940[var18], this.field4941[var18]);
         }
      }

      if (null != this.field4942) {
         for (int var19 = 0; var19 < this.field4942.length; var19++) {
            var16.method4004(this.field4942[var19], this.field4943[var19]);
         }
      }

      if (var11) {
         var16.method4035(-1739570015 * this.field4957, this.field4929 * -1787252995, 927725997 * this.field4958);
      }

      if (var14) {
         classER.method4040(var16, 916605819 * this.field4959, 2128147575 * this.field4960, this.field4961 * -1155641687);
      }

      return var16;
   }

   @ObfuscatedSignature(descriptor = "(I)Lom;")
   @ObfuscatedName("fc")
   public static classOM method8603(int var0) {
      return classMU.method7729(var0, 1883040848);
   }

   @ObfuscatedSignature(descriptor = "(Lom;I)Z")
   @ObfuscatedName("qc")
   public static boolean method8538(classOM var0, int var1) {
      if (var0 == null) {
         return var0.method8540(var1);
      } else {
         try {
            if (null == var0.field4920) {
               if (var1 == -1147741534) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               boolean var2 = true;

               for (int var3 = 0; var3 < var0.field4920.length; var3++) {
                  if (var1 == -1147741534) {
                     throw new IllegalStateException();
                  }

                  var2 &= classKD.field3554.method11871(var0.field4920[var3], 0, (byte)79);
               }

               return var2;
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "om.ax(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aw")
   public int method8557(int var1, int var2) {
      return classGQ.method5602(this.field4931, var1, var2, -1434352038);
   }

   @ObfuscatedSignature(descriptor = "(II)Ler;")
   @ObfuscatedName("ot")
   public classER method8604(int var1, int var2) {
      return this.method8595(var1, var2, -1973084331);
   }

   @ObfuscatedSignature(descriptor = "(IJ)J")
   @ObfuscatedName("cu")
   public long method8561(int var1, long var2) {
      return classBW.method1276(this.field4931, var1, var2);
   }

   static {
      field4967.method6439(256);
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ar")
   public int method8587(int var1, int var2) {
      try {
         if (1 != var1) {
            if (var2 <= -543461949) {
               throw new IllegalStateException();
            }

            if (3 != var1) {
               return this.field4924 * 402876423;
            }

            if (var2 <= -543461949) {
               throw new IllegalStateException();
            }
         }

         return -582306509 * this.field4944;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "om.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("cd")
   public String method8564(int var1, String var2) {
      return classFS.method4977(this.field4931, var1, var2, (byte)96);
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("cv")
   public String method8565(int var1, String var2) {
      return classFS.method4977(this.field4931, var1, var2, (byte)48);
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("cs")
   public String method8566(int var1, String var2) {
      return classFS.method4977(this.field4931, var1, var2, (byte)115);
   }

   @ObfuscatedSignature(descriptor = "(B)Loz;")
   @ObfuscatedName("az")
   public classOZ method8516(byte var1) {
      try {
         return this.field4935;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "om.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lwj;")
   @ObfuscatedName("cc")
   public classWJ method8574() {
      return this.field4963;
   }

   @ObfuscatedSignature(descriptor = "()Lwj;")
   @ObfuscatedName("cf")
   public classWJ method8575() {
      return this.field4963;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lom;)Z")
   @ObfuscatedName("jg")
   public static boolean method8570(classOM var0) {
      if (var0 == null) {
         var0.method8588();
      }

      if (null == var0.field4930) {
         return -1727985133 * var0.field4963.field6689 != -1 || null != var0.field4934.field6785;
      } else {
         int[] var1 = var0.field4930;

         for (int var2 = 0; var2 < var1.length; var2++) {
            int var3 = var1[var2];
            if (var3 != -1) {
               classOM var4 = classMU.method7729(var3, 2003358347);
               if (var4.field4963.field6689 * -1727985133 != -1 || null != var4.field4934.field6785) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(S)Ljava/lang/String;")
   @ObfuscatedName("ak")
   public String method8590(short var1) {
      try {
         return this.field4945;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "om.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II[[IIII)Lee;")
   @ObfuscatedName("bi")
   public final classEE method8542(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
      long var7;
      if (this.field4939 == null) {
         var7 = var2 + (this.field4922 * 546843132 << 10);
      } else {
         var7 = var2 + (this.field4922 * -549251343 << 10) + (var1 << 3);
      }

      Object var9 = (classEE)field4972.method6422(var7);
      if (var9 == null) {
         classER var10 = this.method8595(var1, var2, -1973084331);
         if (var10 == null) {
            return null;
         }

         if (!this.field4932) {
            var9 = var10.method4045(2125349463 * this.field4952 + 64, -1693244053 + -1693032223 * this.field4921, -50, -10, -50);
         } else {
            var10.field1878 = (short)(1175168992 + 54395613 * this.field4952);
            var10.field1879 = (short)(-112183664 + -1693032223 * this.field4921);
            classER.method4015(var10);
            var9 = var10;
         }

         field4972.method6428((classVJ)var9, var7);
      }

      if (this.field4932) {
         var9 = classER.method3985((classER)var9);
      }

      if (this.field4949 * 1531627111 >= 0) {
         if (var9 instanceof classFX) {
            var9 = ((classFX)var9).method5246(var3, var4, var5, var6, true, 1531627111 * this.field4949);
         } else if (var9 instanceof classER) {
            var9 = ((classER)var9).method3987(var3, var4, var5, var6, true, this.field4949 * -627801912);
         }
      }

      return (classEE)var9;
   }

   @ObfuscatedSignature(descriptor = "(Lom;I)Lom;")
   @ObfuscatedName("td")
   public static classOM method8553(classOM var0, int var1) {
      if (var0 == null) {
         return var0.method8555(var1);
      } else {
         try {
            int var2 = -1;
            if (1087117325 * var0.field4926 != -1) {
               var2 = classEM.method3922(var0.field4926 * 1087117325, -1344456616);
            } else if (-1 != -1047341117 * var0.field4962) {
               var2 = classLB.field4090[var0.field4962 * -1047341117];
            }

            if (var2 >= 0) {
               if (var1 == 1566578759) {
                  throw new IllegalStateException();
               }

               if (var2 < var0.field4930.length - 1) {
                  int var5 = var0.field4930[var2];
                  return -1 != var5 ? classMU.method7729(var5, 2052883572) : null;
               }

               if (var1 == 1566578759) {
                  throw new IllegalStateException();
               }
            }

            int var3 = var0.field4930[var0.field4930.length - 1];
            return -1 != var3 ? classMU.method7729(var3, 2052883572) : null;
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "om.aj(" + ')');
         }
      }
   }

   public int[] getImpostorIds() {
      return this.field4930;
   }

   @ObfuscatedSignature(descriptor = "()Lww;")
   @ObfuscatedName("ch")
   public classWW method8579() {
      return this.field4934;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("oi")
   public boolean method8605() {
      return method8538(this, -874336012);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bw")
   public final boolean method8539() {
      if (null == this.field4920) {
         return true;
      } else {
         boolean var1 = true;

         for (int var2 = 0; var2 < this.field4920.length; var2++) {
            var1 &= classKD.field3554.method11871(this.field4920[var2], 0, (byte)23);
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cj")
   public int method8584(int var1) {
      return var1 != 1 && 3 != var1 ? this.field4944 * -582306509 : 402876423 * this.field4924;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lom;)Lwj;")
   @ObfuscatedName("vf")
   public static classWJ method8576(classOM var0) {
      if (var0 == null) {
         var0.method8592();
      }

      return var0.field4963;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lom;ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("zy")
   public static String method8567(classOM var0, int var1, String var2) {
      return classFS.method4977(var0.field4931, var1, var2, (byte)11);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ci")
   public int method8585(int var1) {
      return var1 != 1 && 3 != var1 ? this.field4944 * -582306509 : 402876423 * this.field4924;
   }

   @ObfuscatedSignature(descriptor = "(II[[IIIII)Lfx;")
   @ObfuscatedName("aa")
   public final classFX method8544(int var1, int var2, int[][] var3, int var4, int var5, int var6, int var7) {
      try {
         long var8;
         if (null == this.field4939) {
            if (var7 >= 1106423215) {
               throw new IllegalStateException();
            }

            var8 = (this.field4922 * -381960671 << 10) + var2;
         } else {
            var8 = (var1 << 3) + (this.field4922 * -381960671 << 10) + var2;
         }

         classFX var10 = (classFX)field4967.method6422(var8);
         if (null == var10) {
            if (var7 >= 1106423215) {
               throw new IllegalStateException();
            }

            classER var11 = this.method8595(var1, var2, -1973084331);
            if (null == var11) {
               if (var7 >= 1106423215) {
                  throw new IllegalStateException();
               }

               return null;
            }

            var10 = var11.method4045(this.field4952 * 54395613 + 64, this.field4921 * -1693032223 + 768, -50, -10, -50);
            field4967.method6428(var10, var8);
         }

         if (this.field4949 * 1531627111 >= 0) {
            if (var7 >= 1106423215) {
               throw new IllegalStateException();
            }

            var10 = var10.method5246(var3, var4, var5, var6, true, 1531627111 * this.field4949);
         }

         return var10;
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "om.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl21;II[[IIIILou;I)Lfx;")
   @ObfuscatedName("bm")
   public classFX method8596(
      @Nullable rl21 param1, int nullx, int nullxx, int[][] nullxxx, int nullxxxx, int nullxxxxx, int nullxxxxxx, classOU nullxxxxxxx, int nullxxxxxxxx
   ) {
      long var10;
      if (this.field4939 == null) {
         var10 = nullxx + (this.field4922 * -381960671 << 10);
      } else {
         var10 = nullxx + (nullx << 3) + (this.field4922 * -381960671 << 10);
      }

      classFX var12;
      synchronized (field4967) {
         var12 = (classFX)field4967.method6444(var10);
      }

      if (var12 == null) {
         classER var18 = this.method8604(nullx, nullxx);
         if (var18 == null) {
            return null;
         }

         var12 = var18.method4061(this.field4952 * 54395613 + 64, this.field4921 * -1693032223 + 768, -50, -10, -50);
         synchronized (field4967) {
            field4967.method6445(var12, var10);
         }
      }

      if (nullxxxxxxx == null && this.field4949 * 1531627111 == -1) {
         return var12;
      } else {
         if (nullxxxxxxx != null) {
            assert var1 != null;

            var12 = nullxxxxxxx.method8792(var1, var12, nullxxxxxxxx, nullxx);
         } else if (var1 != null) {
            var12 = var12.method5220(var1, true);
         }

         if (this.field4949 * 1531627111 >= 0 && nullxxx != null) {
            var12 = var12.method5268(nullxxx, nullxxxx, nullxxxxx, nullxxxxxx, var1 == null, this.field4949 * 1531627111);
         }

         return var12;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("cm")
   public String method8591() {
      return this.field4945;
   }

   public String getName() {
      return this.field4945;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ck")
   public boolean method8571() {
      if (null == this.field4930) {
         return -1727985133 * this.field4963.field6689 != -1 || null != this.field4934.field6785;
      } else {
         int[] var1 = this.field4930;

         for (int var2 = 0; var2 < var1.length; var2++) {
            int var3 = var1[var2];
            if (var3 != -1) {
               classOM var4 = classMU.method7729(var3, 1535696733);
               if (var4.field4963.field6689 * -1727985133 != -1 || null != var4.field4934.field6785) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("dm")
   public String method8592() {
      return this.field4945;
   }

   @ObfuscatedSignature(descriptor = "(Lyn;)V")
   @ObfuscatedName("vy")
   @Override
   public void vmethod537(classYN var1) {
      this.field4931 = var1;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("as")
   public final boolean method8533(int var1, int var2) {
      try {
         if (null == this.field4920) {
            if (var2 != -656313384) {
               throw new IllegalStateException();
            } else if (null == this.field4939) {
               return true;
            } else if (10 != var1) {
               return true;
            } else {
               boolean var6 = true;

               for (int var4 = 0; var4 < this.field4939.length; var4++) {
                  if (var2 != -656313384) {
                     throw new IllegalStateException();
                  }

                  var6 &= classKD.field3554.method11871(this.field4920[var4], 0, (byte)-51);
               }

               return var6;
            }
         } else {
            for (int var3 = 0; var3 < this.field4920.length; var3++) {
               if (var2 != -656313384) {
                  throw new IllegalStateException();
               }

               if (var1 == this.field4920[var3]) {
                  if (var2 != -656313384) {
                     throw new IllegalStateException();
                  }

                  return classKD.field3554.method11871(this.field4920[var3], 0, (byte)-54);
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "om.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ax")
   public final boolean method8540(int var1) {
      try {
         if (null == this.field4939) {
            if (var1 == -1147741534) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var2 = true;

            for (int var3 = 0; var3 < this.field4939.length; var3++) {
               if (var1 == -1147741534) {
                  throw new IllegalStateException();
               }

               var2 &= classKD.field3554.method11871(this.field4939[var3], 0, (byte)79);
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "om.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lom;II)Z")
   @ObfuscatedName("uz")
   public static boolean method8534(classOM var0, int var1, int var2) {
      if (var0 == null) {
         var0.method8533(var1, var1);
      }

      try {
         if (null == var0.field4939) {
            if (var2 != -656313384) {
               throw new IllegalStateException();
            } else if (null == var0.field4920) {
               return true;
            } else if (10 != var1) {
               return true;
            } else {
               boolean var6 = true;

               for (int var4 = 0; var4 < var0.field4920.length; var4++) {
                  if (var2 != -656313384) {
                     throw new IllegalStateException();
                  }

                  var6 &= classKD.field3554.method11871(var0.field4920[var4], 0, (byte)-51);
               }

               return var6;
            }
         } else {
            for (int var3 = 0; var3 < var0.field4939.length; var3++) {
               if (var2 != -656313384) {
                  throw new IllegalStateException();
               }

               if (var1 == var0.field4939[var3]) {
                  if (var2 != -656313384) {
                     throw new IllegalStateException();
                  }

                  return classKD.field3554.method11871(var0.field4920[var3], 0, (byte)-54);
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "om.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ap")
   public boolean method8535(int var1) {
      if (null != this.field4939) {
         for (int var4 = 0; var4 < this.field4920.length; var4++) {
            if (var1 == this.field4939[var4]) {
               return classKD.field3554.method11871(this.field4920[var4], 0, (byte)-120);
            }
         }

         return true;
      } else if (null == this.field4920) {
         return true;
      } else if (10 != var1) {
         return true;
      } else {
         boolean var2 = true;

         for (int var3 = 0; var3 < this.field4939.length; var3++) {
            var2 &= classKD.field3554.method11871(this.field4939[var3], 0, (byte)-19);
         }

         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lww;")
   @ObfuscatedName("ai")
   public classWW method8580(int var1) {
      try {
         return this.field4934;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "om.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lom;")
   @ObfuscatedName("bv")
   public final classOM method8554() {
      int var1 = -1;
      if (1087117325 * this.field4926 != -1) {
         var1 = classEM.method3922(this.field4926 * 1087117325, -1660517570);
      } else if (-1 != -1047341117 * this.field4962) {
         var1 = classLB.field4091[this.field4926 * -1047341117];
      }

      int var2;
      if (var1 >= 0 && var1 < this.field4930.length - 1) {
         var2 = this.field4930[var1];
      } else {
         var2 = this.field4930[this.field4930.length - 1];
      }

      return -1 != var2 ? classMU.method7729(var2, 1941489345) : null;
   }

   public String[] getActions() {
      String[] var1 = new String[this.field4935.field5363.size()];

      for (int var2 = 0; var2 < this.field4935.field5363.size(); var2++) {
         classPB var3 = (classPB)this.field4935.field5363.get(var2);
         if (var3 != null) {
            var1[var2] = var3.field5210;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lom;)Z")
   @ObfuscatedName("gx")
   public static boolean method8572(classOM var0) {
      if (null == var0.field4930) {
         return -1727985133 * var0.field4963.field6689 != -1 || null != var0.field4934.field6785;
      } else {
         int[] var1 = var0.field4930;

         for (int var2 = 0; var2 < var1.length; var2++) {
            int var3 = var1[var2];
            if (var3 != -1) {
               classOM var4 = classMU.method7729(var3, 1306610335);
               if (var4.field4963.field6689 * -1727985133 != -1 || null != var4.field4934.field6785) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lom;")
   @ObfuscatedName("aj")
   public final classOM method8555(int var1) {
      try {
         int var2 = -1;
         if (1087117325 * this.field4962 != -1) {
            var2 = classEM.method3922(this.field4926 * 1087117325, -1344456616);
         } else if (-1 != -1047341117 * this.field4962) {
            var2 = classLB.field4090[this.field4926 * -1047341117];
         }

         if (var2 >= 0) {
            if (var1 == 1566578759) {
               throw new IllegalStateException();
            }

            if (var2 < this.field4930.length - 1) {
               int var5 = this.field4930[var2];
               return -1 != var5 ? classMU.method7729(var5, 2052883572) : null;
            }

            if (var1 == 1566578759) {
               throw new IllegalStateException();
            }
         }

         int var3 = this.field4930[this.field4930.length - 1];
         return -1 != var3 ? classMU.method7729(var3, 2052883572) : null;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "om.aj(" + ')');
      }
   }
}
