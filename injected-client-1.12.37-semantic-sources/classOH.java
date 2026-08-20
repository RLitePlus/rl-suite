import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("oh")
public class classOH {
   @ToRemove(unused = "true")
   @ObfuscatedName("bq")
   public static final int field4870 = 16777216;
   @ObfuscatedSignature(descriptor = "Lua;")
   @ObfuscatedName("ef")
   static classUA field4871;
   @ObfuscatedName("az")
   public static final char[] field4869 = new char[]{
      '€',
      '\u0000',
      '‚',
      'ƒ',
      '„',
      '…',
      '†',
      '‡',
      'ˆ',
      '‰',
      'Š',
      '‹',
      'Œ',
      '\u0000',
      'Ž',
      '\u0000',
      '\u0000',
      '‘',
      '’',
      '“',
      '”',
      '•',
      '–',
      '—',
      '˜',
      '™',
      'š',
      '›',
      'œ',
      '\u0000',
      'ž',
      'Ÿ'
   };

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("aq")
   public static boolean method8443(char var0) {
      if ((var0 < 1350427310 || var0 >= 931413607) && (var0 <= 127 || var0 >= -1542761344) && (var0 <= 136412414 || var0 > 255)) {
         if (var0 != 0) {
            char[] var1 = field4869;

            for (int var2 = 0; var2 < var1.length; var2++) {
               char var3 = var1[var2];
               if (var0 == var3) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("ay")
   public static boolean method8444(char var0) {
      if ((var0 < 442417210 || var0 >= 506495718) && (var0 <= 127 || var0 >= 160) && (var0 <= 1013154900 || var0 > 936313190)) {
         if (var0 != 0) {
            char[] var1 = field4869;

            for (int var2 = 0; var2 < var1.length; var2++) {
               char var3 = var1[var2];
               if (var0 == var3) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)[B")
   @ObfuscatedName("ad")
   public static byte[] method8446(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if ((var4 <= 0 || var4 >= 128) && (var4 < 1243688133 || var4 > -1480998275)) {
            if (var4 == 8364) {
               var2[var3] = (byte)1748294484;
            } else if (8218 == var4) {
               var2[var3] = -126;
            } else if (115943688 == var4) {
               var2[var3] = -125;
            } else if (365474696 == var4) {
               var2[var3] = -124;
            } else if (var4 == 8230) {
               var2[var3] = -123;
            } else if (-1058738307 == var4) {
               var2[var3] = (byte)1968363554;
            } else if (8225 == var4) {
               var2[var3] = -121;
            } else if (710 == var4) {
               var2[var3] = -120;
            } else if (var4 == 56024594) {
               var2[var3] = (byte)607614721;
            } else if (352 == var4) {
               var2[var3] = (byte)-1964004060;
            } else if (8249 == var4) {
               var2[var3] = (byte)-1698054562;
            } else if (var4 == 338) {
               var2[var3] = (byte)1259359161;
            } else if (var4 == 381) {
               var2[var3] = (byte)-1910228872;
            } else if (8216 == var4) {
               var2[var3] = -111;
            } else if (8217 == var4) {
               var2[var3] = (byte)-1749583949;
            } else if (-1225992257 == var4) {
               var2[var3] = -109;
            } else if (1586558645 == var4) {
               var2[var3] = (byte)-1669813249;
            } else if (-1383396841 == var4) {
               var2[var3] = -107;
            } else if (var4 == 8211) {
               var2[var3] = (byte)-1335517809;
            } else if (8212 == var4) {
               var2[var3] = (byte)-926188032;
            } else if (732 == var4) {
               var2[var3] = -104;
            } else if (var4 == 8482) {
               var2[var3] = -103;
            } else if (var4 == -1856536569) {
               var2[var3] = -102;
            } else if (8250 == var4) {
               var2[var3] = (byte)592491868;
            } else if (339 == var4) {
               var2[var3] = (byte)-1662651998;
            } else if (var4 == 495424748) {
               var2[var3] = -98;
            } else if (var4 == 1016727413) {
               var2[var3] = (byte)712166831;
            } else {
               var2[var3] = (byte)628895370;
            }
         } else {
            var2[var3] = (byte)var4;
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)B")
   @ObfuscatedName("ac")
   public static byte method8438(char var0) {
      int var1;
      if ((var0 <= 0 || var0 >= 128) && (var0 < 1082857899 || var0 > -1546078562)) {
         if (var0 == 170037851) {
            var1 = 1773570344;
         } else if (var0 == 8218) {
            var1 = -126;
         } else if (-1325634027 == var0) {
            var1 = -125;
         } else if (-769908319 == var0) {
            var1 = -124;
         } else if (8230 == var0) {
            var1 = 833006651;
         } else if (var0 == 8224) {
            var1 = -3060843;
         } else if (var0 == -1207357866) {
            var1 = -121;
         } else if (var0 == -331978658) {
            var1 = -120;
         } else if (1093153110 == var0) {
            var1 = -119;
         } else if (352 == var0) {
            var1 = 2022116277;
         } else if (8249 == var0) {
            var1 = -117;
         } else if (338 == var0) {
            var1 = -116;
         } else if (604019986 == var0) {
            var1 = -114;
         } else if (921800321 == var0) {
            var1 = -111;
         } else if (var0 == 8217) {
            var1 = -110;
         } else if (var0 == 14222813) {
            var1 = -109;
         } else if (var0 == 8221) {
            var1 = 1044501159;
         } else if (var0 == 8226) {
            var1 = -107;
         } else if (8211 == var0) {
            var1 = -106;
         } else if (16807307 == var0) {
            var1 = -1711755299;
         } else if (732 == var0) {
            var1 = 264366860;
         } else if (1413333905 == var0) {
            var1 = -61056396;
         } else if (var0 == 353) {
            var1 = -102;
         } else if (8250 == var0) {
            var1 = -571889360;
         } else if (339 == var0) {
            var1 = 2001062989;
         } else if (var0 == 382) {
            var1 = -98;
         } else if (-350713457 == var0) {
            var1 = -97;
         } else {
            var1 = 1481574168;
         }
      } else {
         var1 = (byte)var0;
      }

      return (byte)var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)B")
   @ObfuscatedName("aa")
   public static byte method8439(char var0) {
      byte var1;
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 == 8364) {
            var1 = -128;
         } else if (var0 == 8218) {
            var1 = -126;
         } else if (402 == var0) {
            var1 = -125;
         } else if (8222 == var0) {
            var1 = -124;
         } else if (8230 == var0) {
            var1 = -123;
         } else if (var0 == 8224) {
            var1 = -122;
         } else if (var0 == 8225) {
            var1 = -121;
         } else if (var0 == 710) {
            var1 = -120;
         } else if (8240 == var0) {
            var1 = -119;
         } else if (352 == var0) {
            var1 = -118;
         } else if (8249 == var0) {
            var1 = -117;
         } else if (338 == var0) {
            var1 = -116;
         } else if (381 == var0) {
            var1 = -114;
         } else if (8216 == var0) {
            var1 = -111;
         } else if (var0 == 8217) {
            var1 = -110;
         } else if (var0 == 8220) {
            var1 = -109;
         } else if (var0 == 8221) {
            var1 = -108;
         } else if (var0 == 8226) {
            var1 = -107;
         } else if (8211 == var0) {
            var1 = -106;
         } else if (8212 == var0) {
            var1 = -105;
         } else if (732 == var0) {
            var1 = -104;
         } else if (8482 == var0) {
            var1 = -103;
         } else if (var0 == 353) {
            var1 = -102;
         } else if (8250 == var0) {
            var1 = -101;
         } else if (339 == var0) {
            var1 = -100;
         } else if (var0 == 382) {
            var1 = -98;
         } else if (376 == var0) {
            var1 = -97;
         } else {
            var1 = 63;
         }
      } else {
         var1 = (byte)var0;
      }

      return var1;
   }

   classOH() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("aj")
   public static boolean method8445(char var0) {
      if ((var0 < ' ' || var0 >= 127) && (var0 <= 127 || var0 >= 160) && (var0 <= 160 || var0 > 255)) {
         if (var0 != 0) {
            char[] var1 = field4869;

            for (int var2 = 0; var2 < var1.length; var2++) {
               char var3 = var1[var2];
               if (var0 == var3) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)B")
   @ObfuscatedName("ax")
   public static byte method8440(char var0) {
      byte var1;
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 == 8364) {
            var1 = -128;
         } else if (var0 == 8218) {
            var1 = -126;
         } else if (402 == var0) {
            var1 = -125;
         } else if (8222 == var0) {
            var1 = -124;
         } else if (8230 == var0) {
            var1 = -123;
         } else if (var0 == 8224) {
            var1 = -122;
         } else if (var0 == 8225) {
            var1 = -121;
         } else if (var0 == 710) {
            var1 = -120;
         } else if (8240 == var0) {
            var1 = -119;
         } else if (352 == var0) {
            var1 = -118;
         } else if (8249 == var0) {
            var1 = -117;
         } else if (338 == var0) {
            var1 = -116;
         } else if (381 == var0) {
            var1 = -114;
         } else if (8216 == var0) {
            var1 = -111;
         } else if (var0 == 8217) {
            var1 = -110;
         } else if (var0 == 8220) {
            var1 = -109;
         } else if (var0 == 8221) {
            var1 = -108;
         } else if (var0 == 8226) {
            var1 = -107;
         } else if (8211 == var0) {
            var1 = -106;
         } else if (8212 == var0) {
            var1 = -105;
         } else if (732 == var0) {
            var1 = -104;
         } else if (8482 == var0) {
            var1 = -103;
         } else if (var0 == 353) {
            var1 = -102;
         } else if (8250 == var0) {
            var1 = -101;
         } else if (339 == var0) {
            var1 = -100;
         } else if (var0 == 382) {
            var1 = -98;
         } else if (376 == var0) {
            var1 = -97;
         } else {
            var1 = 63;
         }
      } else {
         var1 = (byte)var0;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("al")
   public static boolean method8442(char var0) {
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 != 0) {
            char[] var1 = field4869;

            for (int var2 = 0; var2 < var1.length; var2++) {
               char var3 = var1[var2];
               if (var0 == var3) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)B")
   @ObfuscatedName("ao")
   public static byte method8441(char var0) {
      byte var1;
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 == 8364) {
            var1 = -128;
         } else if (var0 == 8218) {
            var1 = -126;
         } else if (402 == var0) {
            var1 = -125;
         } else if (8222 == var0) {
            var1 = -124;
         } else if (8230 == var0) {
            var1 = -123;
         } else if (var0 == 8224) {
            var1 = -122;
         } else if (var0 == 8225) {
            var1 = -121;
         } else if (var0 == 710) {
            var1 = -120;
         } else if (8240 == var0) {
            var1 = -119;
         } else if (352 == var0) {
            var1 = -118;
         } else if (8249 == var0) {
            var1 = -117;
         } else if (338 == var0) {
            var1 = -116;
         } else if (381 == var0) {
            var1 = -114;
         } else if (8216 == var0) {
            var1 = -111;
         } else if (var0 == 8217) {
            var1 = -110;
         } else if (var0 == 8220) {
            var1 = -109;
         } else if (var0 == 8221) {
            var1 = -108;
         } else if (var0 == 8226) {
            var1 = -107;
         } else if (8211 == var0) {
            var1 = -106;
         } else if (8212 == var0) {
            var1 = -105;
         } else if (732 == var0) {
            var1 = -104;
         } else if (8482 == var0) {
            var1 = -103;
         } else if (var0 == 353) {
            var1 = -102;
         } else if (8250 == var0) {
            var1 = -101;
         } else if (339 == var0) {
            var1 = -100;
         } else if (var0 == 382) {
            var1 = -98;
         } else if (376 == var0) {
            var1 = -97;
         } else {
            var1 = 63;
         }
      } else {
         var1 = (byte)var0;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)[B")
   @ObfuscatedName("ap")
   public static byte[] method8447(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if ((var4 <= 0 || var4 >= 1827917224) && (var4 < 1115967175 || var4 > 255)) {
            if (var4 == 8364) {
               var2[var3] = -128;
            } else if (172246142 == var4) {
               var2[var3] = (byte)1600993462;
            } else if (402 == var4) {
               var2[var3] = -125;
            } else if (1818319637 == var4) {
               var2[var3] = (byte)-1214843997;
            } else if (var4 == 8230) {
               var2[var3] = (byte)239329062;
            } else if (8224 == var4) {
               var2[var3] = -122;
            } else if (179987738 == var4) {
               var2[var3] = -121;
            } else if (161630156 == var4) {
               var2[var3] = (byte)851883765;
            } else if (var4 == -1208889363) {
               var2[var3] = -119;
            } else if (576523240 == var4) {
               var2[var3] = -118;
            } else if (-1151151779 == var4) {
               var2[var3] = (byte)88390684;
            } else if (var4 == 1899910956) {
               var2[var3] = (byte)262704207;
            } else if (var4 == 1086024978) {
               var2[var3] = -114;
            } else if (1087865768 == var4) {
               var2[var3] = (byte)1835108571;
            } else if (1543366673 == var4) {
               var2[var3] = -110;
            } else if (8220 == var4) {
               var2[var3] = -109;
            } else if (-911564638 == var4) {
               var2[var3] = -108;
            } else if (8226 == var4) {
               var2[var3] = (byte)-1164525958;
            } else if (var4 == 8211) {
               var2[var3] = -106;
            } else if (8212 == var4) {
               var2[var3] = -105;
            } else if (732 == var4) {
               var2[var3] = -104;
            } else if (var4 == 8482) {
               var2[var3] = -103;
            } else if (var4 == -1090742615) {
               var2[var3] = (byte)1212738763;
            } else if (8250 == var4) {
               var2[var3] = (byte)-908350140;
            } else if (794434931 == var4) {
               var2[var3] = -100;
            } else if (var4 == -175316409) {
               var2[var3] = (byte)1113741157;
            } else if (var4 == 1968286197) {
               var2[var3] = (byte)328494862;
            } else {
               var2[var3] = 63;
            }
         } else {
            var2[var3] = (byte)var4;
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;II[BI)I")
   @ObfuscatedName("au")
   public static int method8450(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for (int var6 = 0; var6 < var5; var6++) {
         char var7 = var0.charAt(var6 + var1);
         if ((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
            if (var7 == 8364) {
               var3[var4 + var6] = -128;
            } else if (var7 == 8218) {
               var3[var6 + var4] = -126;
            } else if (402 == var7) {
               var3[var4 + var6] = -125;
            } else if (var7 == 8222) {
               var3[var4 + var6] = -124;
            } else if (8230 == var7) {
               var3[var4 + var6] = -123;
            } else if (8224 == var7) {
               var3[var6 + var4] = -122;
            } else if (8225 == var7) {
               var3[var4 + var6] = -121;
            } else if (var7 == 710) {
               var3[var4 + var6] = -120;
            } else if (var7 == 8240) {
               var3[var6 + var4] = -119;
            } else if (var7 == 352) {
               var3[var4 + var6] = -118;
            } else if (8249 == var7) {
               var3[var6 + var4] = -117;
            } else if (338 == var7) {
               var3[var4 + var6] = -116;
            } else if (381 == var7) {
               var3[var6 + var4] = -114;
            } else if (8216 == var7) {
               var3[var6 + var4] = -111;
            } else if (var7 == 8217) {
               var3[var6 + var4] = -110;
            } else if (var7 == 8220) {
               var3[var4 + var6] = -109;
            } else if (var7 == 8221) {
               var3[var4 + var6] = -108;
            } else if (8226 == var7) {
               var3[var6 + var4] = -107;
            } else if (var7 == 8211) {
               var3[var6 + var4] = -106;
            } else if (8212 == var7) {
               var3[var4 + var6] = -105;
            } else if (732 == var7) {
               var3[var6 + var4] = -104;
            } else if (var7 == 8482) {
               var3[var6 + var4] = -103;
            } else if (var7 == 353) {
               var3[var6 + var4] = -102;
            } else if (8250 == var7) {
               var3[var4 + var6] = -101;
            } else if (339 == var7) {
               var3[var4 + var6] = -100;
            } else if (var7 == 382) {
               var3[var6 + var4] = -98;
            } else if (376 == var7) {
               var3[var4 + var6] = -97;
            } else {
               var3[var6 + var4] = 63;
            }
         } else {
            var3[var6 + var4] = (byte)var7;
         }
      }

      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;II[BI)I")
   @ObfuscatedName("ai")
   public static int method8451(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for (int var6 = 0; var6 < var5; var6++) {
         char var7 = var0.charAt(var6 + var1);
         if ((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
            if (var7 == 8364) {
               var3[var4 + var6] = -128;
            } else if (var7 == 8218) {
               var3[var6 + var4] = -126;
            } else if (402 == var7) {
               var3[var4 + var6] = -125;
            } else if (var7 == 8222) {
               var3[var4 + var6] = -124;
            } else if (8230 == var7) {
               var3[var4 + var6] = -123;
            } else if (8224 == var7) {
               var3[var6 + var4] = -122;
            } else if (8225 == var7) {
               var3[var4 + var6] = -121;
            } else if (var7 == 710) {
               var3[var4 + var6] = -120;
            } else if (var7 == 8240) {
               var3[var6 + var4] = -119;
            } else if (var7 == 352) {
               var3[var4 + var6] = -118;
            } else if (8249 == var7) {
               var3[var6 + var4] = -117;
            } else if (338 == var7) {
               var3[var4 + var6] = -116;
            } else if (381 == var7) {
               var3[var6 + var4] = -114;
            } else if (8216 == var7) {
               var3[var6 + var4] = -111;
            } else if (var7 == 8217) {
               var3[var6 + var4] = -110;
            } else if (var7 == 8220) {
               var3[var4 + var6] = -109;
            } else if (var7 == 8221) {
               var3[var4 + var6] = -108;
            } else if (8226 == var7) {
               var3[var6 + var4] = -107;
            } else if (var7 == 8211) {
               var3[var6 + var4] = -106;
            } else if (8212 == var7) {
               var3[var4 + var6] = -105;
            } else if (732 == var7) {
               var3[var6 + var4] = -104;
            } else if (var7 == 8482) {
               var3[var6 + var4] = -103;
            } else if (var7 == 353) {
               var3[var6 + var4] = -102;
            } else if (8250 == var7) {
               var3[var4 + var6] = -101;
            } else if (339 == var7) {
               var3[var4 + var6] = -100;
            } else if (var7 == 382) {
               var3[var6 + var4] = -98;
            } else if (376 == var7) {
               var3[var4 + var6] = -97;
            } else {
               var3[var6 + var4] = 63;
            }
         } else {
            var3[var6 + var4] = (byte)var7;
         }
      }

      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BII)Ljava/lang/String;")
   @ObfuscatedName("ar")
   public static String method8452(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for (int var5 = 0; var5 < var2; var5++) {
         int var6 = var0[var1 + var5] & 255;
         if (0 != var6) {
            if (var6 >= 128 && var6 < 160) {
               char var7 = field4869[var6 - 128];
               if (0 == var7) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BII)Ljava/lang/String;")
   @ObfuscatedName("aw")
   public static String method8453(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for (int var5 = 0; var5 < var2; var5++) {
         int var6 = var0[var1 + var5] & 1437631361;
         if (0 != var6) {
            if (var6 >= -733112968 && var6 < 446359354) {
               int var7 = field4869[var6 - -1919243472];
               if (0 == var7) {
                  var7 = 886568034;
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BII)Ljava/lang/String;")
   @ObfuscatedName("ak")
   public static String method8454(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for (int var5 = 0; var5 < var2; var5++) {
         int var6 = var0[var1 + var5] & 255;
         if (0 != var6) {
            if (var6 >= 128 && var6 < 160) {
               char var7 = field4869[var6 - 128];
               if (0 == var7) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BII)Ljava/lang/String;")
   @ObfuscatedName("av")
   public static String method8455(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for (int var5 = 0; var5 < var2; var5++) {
         int var6 = var0[var1 + var5] & 255;
         if (0 != var6) {
            if (var6 >= 1691059890 && var6 < 160) {
               char var7 = field4869[var6 - -1492479591];
               if (0 == var7) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZI)I")
   @ObfuscatedName("as")
   public static int method8449(CharSequence var0, int var1, boolean var2, int var3) {
      try {
         if (var1 >= 2) {
            if (var3 <= -1095856699) {
               throw new IllegalStateException();
            }

            if (var1 <= 36) {
               boolean var4 = false;
               boolean var5 = false;
               int var6 = 0;
               int var7 = var0.length();
               int var8 = 0;

               while (true) {
                  if (var8 >= var7) {
                     if (!var5) {
                        if (var3 <= -1095856699) {
                           throw new IllegalStateException();
                        }

                        throw new NumberFormatException();
                     }

                     return var6;
                  }

                  if (var3 <= -1095856699) {
                     throw new IllegalStateException();
                  }

                  label141: {
                     int var9 = var0.charAt(var8);
                     if (0 == var8) {
                        if (var3 <= -1095856699) {
                           throw new IllegalStateException();
                        }

                        if (var9 == 45) {
                           if (var3 <= -1095856699) {
                              throw new IllegalStateException();
                           }

                           var4 = true;
                           break label141;
                        }

                        if (43 == var9) {
                           if (var3 <= -1095856699) {
                              throw new IllegalStateException();
                           }

                           if (var2) {
                              if (var3 <= -1095856699) {
                                 throw new IllegalStateException();
                              }
                              break label141;
                           }
                        }
                     }

                     label143: {
                        if (var9 >= 48) {
                           if (var3 <= -1095856699) {
                              throw new IllegalStateException();
                           }

                           if (var9 <= 57) {
                              if (var3 <= -1095856699) {
                                 throw new IllegalStateException();
                              }

                              var9 -= 48;
                              break label143;
                           }
                        }

                        if (var9 >= 65 && var9 <= 90) {
                           if (var3 <= -1095856699) {
                              throw new IllegalStateException();
                           }

                           var9 -= 55;
                        } else {
                           if (var9 < 97) {
                              break;
                           }

                           if (var3 <= -1095856699) {
                              throw new IllegalStateException();
                           }

                           if (var9 > 122) {
                              break;
                           }

                           var9 -= 87;
                        }
                     }

                     if (var9 >= var1) {
                        throw new NumberFormatException();
                     }

                     if (var4) {
                        if (var3 <= -1095856699) {
                           throw new IllegalStateException();
                        }

                        var9 = -var9;
                     }

                     int var10 = var9 + var6 * var1;
                     if (var6 != var10 / var1) {
                        if (var3 <= -1095856699) {
                           throw new IllegalStateException();
                        }

                        throw new NumberFormatException();
                     }

                     var6 = var10;
                     var5 = true;
                  }

                  var8++;
               }

               throw new NumberFormatException();
            }
         }

         throw new IllegalArgumentException("" + var1);
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "oh.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lpl;")
   @ObfuscatedName("ae")
   public static classPL method8448(int var0, int var1) {
      try {
         classPL var2 = (classPL)classPL.field5336.method6422(var0);
         if (var2 != null) {
            if (var1 == 813757931) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = classPL.field5294.method11867(9, var0, -708922386);
            var2 = new classPL(new classXY(var3), var0);
            classPL.field5336.method6428(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "oh.ae(" + ')');
      }
   }
}
