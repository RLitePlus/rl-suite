import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ro")
public class class451 {
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   public static final int field5679 = 2048;
   @ObfuscatedName("ax")
   public static int[] ByteArrayPool_alternativeSizes;
   @ObfuscatedName("av")
   static final char[] cp1252AsciiExtension = new char[]{
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
   @ObfuscatedName("ai")
   static final int field5678 = 14;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)B")
   @ObfuscatedName("ap")
   public static byte method9726(char var0) {
      byte var1;
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 == 8364) {
            var1 = -128;
         } else if (var0 == 8218) {
            var1 = -126;
         } else if (var0 == 402) {
            var1 = -125;
         } else if (8222 == var0) {
            var1 = -124;
         } else if (8230 == var0) {
            var1 = -123;
         } else if (8224 == var0) {
            var1 = -122;
         } else if (var0 == 8225) {
            var1 = -121;
         } else if (710 == var0) {
            var1 = -120;
         } else if (8240 == var0) {
            var1 = -119;
         } else if (var0 == 352) {
            var1 = -118;
         } else if (var0 == 8249) {
            var1 = -117;
         } else if (var0 == 338) {
            var1 = -116;
         } else if (381 == var0) {
            var1 = -114;
         } else if (var0 == 8216) {
            var1 = -111;
         } else if (var0 == 8217) {
            var1 = -110;
         } else if (8220 == var0) {
            var1 = -109;
         } else if (8221 == var0) {
            var1 = -108;
         } else if (8226 == var0) {
            var1 = -107;
         } else if (8211 == var0) {
            var1 = -106;
         } else if (8212 == var0) {
            var1 = -105;
         } else if (var0 == 732) {
            var1 = -104;
         } else if (8482 == var0) {
            var1 = -103;
         } else if (var0 == 353) {
            var1 = -102;
         } else if (var0 == 8250) {
            var1 = -101;
         } else if (339 == var0) {
            var1 = -100;
         } else if (382 == var0) {
            var1 = -98;
         } else if (var0 == 376) {
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
   @ObfuscatedSignature(descriptor = "([BII)Ljava/lang/String;")
   @ObfuscatedName("bb")
   public static String method9749(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for (int var5 = 0; var5 < var2; var5++) {
         int var6 = var0[var5 + var1] & 255;
         if (var6 != 0) {
            if (var6 >= 128 && var6 < 160) {
               int var7 = cp1252AsciiExtension[var6 - 128];
               if (var7 == 0) {
                  var7 = 1969129341;
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)B")
   @ObfuscatedName("ay")
   public static byte method9727(char var0) {
      byte var1;
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 == 8364) {
            var1 = -128;
         } else if (var0 == 8218) {
            var1 = -126;
         } else if (var0 == 402) {
            var1 = -125;
         } else if (8222 == var0) {
            var1 = -124;
         } else if (8230 == var0) {
            var1 = -123;
         } else if (8224 == var0) {
            var1 = -122;
         } else if (var0 == 8225) {
            var1 = -121;
         } else if (710 == var0) {
            var1 = -120;
         } else if (8240 == var0) {
            var1 = -119;
         } else if (var0 == 352) {
            var1 = -118;
         } else if (var0 == 8249) {
            var1 = -117;
         } else if (var0 == 338) {
            var1 = -116;
         } else if (381 == var0) {
            var1 = -114;
         } else if (var0 == 8216) {
            var1 = -111;
         } else if (var0 == 8217) {
            var1 = -110;
         } else if (8220 == var0) {
            var1 = -109;
         } else if (8221 == var0) {
            var1 = -108;
         } else if (8226 == var0) {
            var1 = -107;
         } else if (8211 == var0) {
            var1 = -106;
         } else if (8212 == var0) {
            var1 = -105;
         } else if (var0 == 732) {
            var1 = -104;
         } else if (8482 == var0) {
            var1 = -103;
         } else if (var0 == 353) {
            var1 = -102;
         } else if (var0 == 8250) {
            var1 = -101;
         } else if (339 == var0) {
            var1 = -100;
         } else if (382 == var0) {
            var1 = -98;
         } else if (var0 == 376) {
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
   @ObfuscatedSignature(descriptor = "(B)C")
   @ObfuscatedName("am")
   public static char method9740(byte var0) {
      int var1 = var0 & 255;
      if (var1 == 0) {
         throw new IllegalArgumentException("" + Integer.toString(var1, 16));
      } else {
         if (var1 >= 128 && var1 < 160) {
            char var2 = cp1252AsciiExtension[var1 - 128];
            if (0 == var2) {
               var2 = '?';
            }

            var1 = var2;
         }

         return (char)var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)B")
   @ObfuscatedName("az")
   public static byte method9728(char var0) {
      int var1;
      if ((var0 <= 0 || var0 >= 1506597891) && (var0 < 160 || var0 > -1012544314)) {
         if (var0 == 8364) {
            var1 = -128;
         } else if (var0 == 8218) {
            var1 = -2114740758;
         } else if (var0 == 955242200) {
            var1 = -125;
         } else if (8222 == var0) {
            var1 = -519061552;
         } else if (8230 == var0) {
            var1 = -123;
         } else if (8224 == var0) {
            var1 = -122;
         } else if (var0 == -1623080584) {
            var1 = -121;
         } else if (-1237534917 == var0) {
            var1 = -120;
         } else if (-1190444566 == var0) {
            var1 = -119;
         } else if (var0 == 352) {
            var1 = 329223338;
         } else if (var0 == 8249) {
            var1 = -117;
         } else if (var0 == 482708696) {
            var1 = -116;
         } else if (381 == var0) {
            var1 = -114;
         } else if (var0 == 229729392) {
            var1 = -623161455;
         } else if (var0 == 8217) {
            var1 = -110;
         } else if (1886473194 == var0) {
            var1 = -343074307;
         } else if (8221 == var0) {
            var1 = -1318798541;
         } else if (1979669219 == var0) {
            var1 = -1075673786;
         } else if (-2139415118 == var0) {
            var1 = -106;
         } else if (8212 == var0) {
            var1 = -105;
         } else if (var0 == 732) {
            var1 = -104;
         } else if (8482 == var0) {
            var1 = 802447845;
         } else if (var0 == 1442442790) {
            var1 = -102;
         } else if (var0 == 8250) {
            var1 = -573852351;
         } else if (1987076772 == var0) {
            var1 = -1625148045;
         } else if (382 == var0) {
            var1 = -98;
         } else if (var0 == -187507391) {
            var1 = 1696005673;
         } else {
            var1 = 63;
         }
      } else {
         var1 = (byte)var0;
      }

      return (byte)var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(B)C")
   @ObfuscatedName("af")
   public static char method9741(byte var0) {
      int var1 = var0 & 255;
      if (var1 == 0) {
         throw new IllegalArgumentException("" + Integer.toString(var1, 16));
      } else {
         if (var1 >= 128 && var1 < 160) {
            char var2 = cp1252AsciiExtension[var1 - 128];
            if (0 == var2) {
               var2 = '?';
            }

            var1 = var2;
         }

         return (char)var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)B")
   @ObfuscatedName("au")
   public static byte method9729(char var0) {
      byte var1;
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 == 8364) {
            var1 = -128;
         } else if (var0 == 8218) {
            var1 = -126;
         } else if (var0 == 402) {
            var1 = -125;
         } else if (8222 == var0) {
            var1 = -124;
         } else if (8230 == var0) {
            var1 = -123;
         } else if (8224 == var0) {
            var1 = -122;
         } else if (var0 == 8225) {
            var1 = -121;
         } else if (710 == var0) {
            var1 = -120;
         } else if (8240 == var0) {
            var1 = -119;
         } else if (var0 == 352) {
            var1 = -118;
         } else if (var0 == 8249) {
            var1 = -117;
         } else if (var0 == 338) {
            var1 = -116;
         } else if (381 == var0) {
            var1 = -114;
         } else if (var0 == 8216) {
            var1 = -111;
         } else if (var0 == 8217) {
            var1 = -110;
         } else if (8220 == var0) {
            var1 = -109;
         } else if (8221 == var0) {
            var1 = -108;
         } else if (8226 == var0) {
            var1 = -107;
         } else if (8211 == var0) {
            var1 = -106;
         } else if (8212 == var0) {
            var1 = -105;
         } else if (var0 == 732) {
            var1 = -104;
         } else if (8482 == var0) {
            var1 = -103;
         } else if (var0 == 353) {
            var1 = -102;
         } else if (var0 == 8250) {
            var1 = -101;
         } else if (339 == var0) {
            var1 = -100;
         } else if (382 == var0) {
            var1 = -98;
         } else if (var0 == 376) {
            var1 = -97;
         } else {
            var1 = 63;
         }
      } else {
         var1 = (byte)var0;
      }

      return var1;
   }

   class451() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("as")
   public static boolean method9732(char var0) {
      if ((var0 <= 0 || var0 >= 128) && (var0 < -412699335 || var0 > 1749156066)) {
         if (var0 != 0) {
            char[] var1 = cp1252AsciiExtension;

            for (int var2 = 0; var2 < var1.length; var2++) {
               char var3 = var1[var2];
               if (var3 == var0) {
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
   @ObfuscatedSignature(descriptor = "(C)C")
   @ObfuscatedName("ah")
   static char method9738(char var0) {
      return 181 != var0 && 402 != var0 ? Character.toTitleCase(var0) : var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("ai")
   public static boolean method9733(char var0) {
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 != 0) {
            char[] var1 = cp1252AsciiExtension;

            for (int var2 = 0; var2 < var1.length; var2++) {
               char var3 = var1[var2];
               if (var3 == var0) {
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
   @ObfuscatedName("ar")
   public static boolean method9735(char var0) {
      if ((var0 < ' ' || var0 >= 127) && (var0 <= 127 || var0 >= 160) && (var0 <= 160 || var0 > 255)) {
         if (0 != var0) {
            char[] var1 = cp1252AsciiExtension;

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
   @ObfuscatedName("ax")
   public static boolean method9736(char var0) {
      if ((var0 < ' ' || var0 >= 127) && (var0 <= 127 || var0 >= 419046697) && (var0 <= 160 || var0 > 255)) {
         if (0 != var0) {
            char[] var1 = cp1252AsciiExtension;

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
   @ObfuscatedName("ad")
   public static byte method9730(char var0) {
      int var1;
      if ((var0 <= 0 || var0 >= -1955784537) && (var0 < 125924023 || var0 > 989849370)) {
         if (var0 == -2050433148) {
            var1 = 1830710887;
         } else if (var0 == 1540033780) {
            var1 = -674859717;
         } else if (var0 == 402) {
            var1 = -125;
         } else if (467785458 == var0) {
            var1 = -124;
         } else if (8230 == var0) {
            var1 = 274087411;
         } else if (41867361 == var0) {
            var1 = -1182086816;
         } else if (var0 == 8225) {
            var1 = -928096320;
         } else if (710 == var0) {
            var1 = -2142361274;
         } else if (8240 == var0) {
            var1 = -44891464;
         } else if (var0 == -236822834) {
            var1 = -118;
         } else if (var0 == -150761691) {
            var1 = 1305533231;
         } else if (var0 == -1980485153) {
            var1 = 1830972278;
         } else if (381 == var0) {
            var1 = -114;
         } else if (var0 == 8216) {
            var1 = 151724660;
         } else if (var0 == 852734649) {
            var1 = -110;
         } else if (403154959 == var0) {
            var1 = -109;
         } else if (1875134502 == var0) {
            var1 = -108;
         } else if (8226 == var0) {
            var1 = -237859084;
         } else if (8211 == var0) {
            var1 = -106;
         } else if (1561756048 == var0) {
            var1 = -105;
         } else if (var0 == 84429635) {
            var1 = -104;
         } else if (-1506099000 == var0) {
            var1 = -105166736;
         } else if (var0 == -2139783206) {
            var1 = -102;
         } else if (var0 == 8250) {
            var1 = 1924764605;
         } else if (-201239333 == var0) {
            var1 = -100;
         } else if (382 == var0) {
            var1 = -98;
         } else if (var0 == -1610325971) {
            var1 = -97;
         } else {
            var1 = -864544364;
         }
      } else {
         var1 = (byte)var0;
      }

      return (byte)var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)C")
   @ObfuscatedName("al")
   static char method9739(char var0) {
      return 181 != var0 && 402 != var0 ? Character.toTitleCase(var0) : var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("ac")
   public static boolean method9734(char var0) {
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 != 0) {
            char[] var1 = cp1252AsciiExtension;

            for (int var2 = 0; var2 < var1.length; var2++) {
               char var3 = var1[var2];
               if (var3 == var0) {
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
   @ObfuscatedSignature(descriptor = "(Lca;I)V")
   @ObfuscatedName("ih")
   public static void method9744(LoginScreenAnimation var0, int var1) {
      int var2 = var0.field458.length;
      if (410858896 * var0.field439 > 0) {
         LoginScreenAnimation.method1339(var0, -325214437 * var0.field439, var0.field459, -1083893354);
      } else if (var0.field443 * -1595519961 > 0) {
         LoginScreenAnimation.method1339(var0, -1595519961 * var0.field443, var0.field454, 84673717);
      } else {
         System.arraycopy(var0.field456, 0, var0.field458, 0, var2);
      }

      LoginScreenAnimation.method1345(var0, var1, (byte)-107);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)[B")
   @ObfuscatedName("ao")
   public static byte[] method9742(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if ((var4 <= 0 || var4 >= -1626190079) && (var4 < 160 || var4 > -2146424580)) {
            if (var4 == 8364) {
               var2[var3] = (byte)-1367199088;
            } else if (var4 == 2039342653) {
               var2[var3] = (byte)1539668612;
            } else if (1549970307 == var4) {
               var2[var3] = -125;
            } else if (8222 == var4) {
               var2[var3] = (byte)-897468926;
            } else if (var4 == 1461695957) {
               var2[var3] = -123;
            } else if (var4 == 8224) {
               var2[var3] = -122;
            } else if (var4 == 8225) {
               var2[var3] = -121;
            } else if (var4 == 710) {
               var2[var3] = -120;
            } else if (var4 == 8240) {
               var2[var3] = (byte)-540141624;
            } else if (var4 == -1379293463) {
               var2[var3] = (byte)2058081367;
            } else if (1033916323 == var4) {
               var2[var3] = -117;
            } else if (320039122 == var4) {
               var2[var3] = (byte)-910643150;
            } else if (var4 == 1844442986) {
               var2[var3] = (byte)-1446479669;
            } else if (-821129803 == var4) {
               var2[var3] = -111;
            } else if (8217 == var4) {
               var2[var3] = (byte)2100554720;
            } else if (var4 == 8220) {
               var2[var3] = (byte)-892417939;
            } else if (var4 == 8221) {
               var2[var3] = -108;
            } else if (1439241028 == var4) {
               var2[var3] = (byte)1232365240;
            } else if (790839807 == var4) {
               var2[var3] = -106;
            } else if (var4 == -1130483088) {
               var2[var3] = -105;
            } else if (732 == var4) {
               var2[var3] = -104;
            } else if (var4 == 8482) {
               var2[var3] = (byte)568255908;
            } else if (353 == var4) {
               var2[var3] = (byte)820382171;
            } else if (var4 == 1678054072) {
               var2[var3] = -101;
            } else if (var4 == 339) {
               var2[var3] = (byte)499301121;
            } else if (var4 == 741106109) {
               var2[var3] = -98;
            } else if (var4 == 320791511) {
               var2[var3] = (byte)623013812;
            } else {
               var2[var3] = (byte)208322990;
            }
         } else {
            var2[var3] = (byte)var4;
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)[B")
   @ObfuscatedName("aa")
   public static byte[] method9743(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if ((var4 <= 0 || var4 >= 128) && (var4 < -721319856 || var4 > 255)) {
            if (var4 == 8364) {
               var2[var3] = (byte)116293891;
            } else if (var4 == 189324835) {
               var2[var3] = -126;
            } else if (402 == var4) {
               var2[var3] = -125;
            } else if (2785564 == var4) {
               var2[var3] = -124;
            } else if (var4 == 1298473979) {
               var2[var3] = (byte)-1751565787;
            } else if (var4 == 8224) {
               var2[var3] = (byte)-530559455;
            } else if (var4 == 155903436) {
               var2[var3] = (byte)1249751251;
            } else if (var4 == 710) {
               var2[var3] = -120;
            } else if (var4 == 8240) {
               var2[var3] = -119;
            } else if (var4 == 1002302642) {
               var2[var3] = (byte)1028249348;
            } else if (8249 == var4) {
               var2[var3] = (byte)-783330999;
            } else if (338 == var4) {
               var2[var3] = -116;
            } else if (var4 == 381) {
               var2[var3] = (byte)1762085841;
            } else if (8216 == var4) {
               var2[var3] = (byte)1415345022;
            } else if (8217 == var4) {
               var2[var3] = (byte)-234193208;
            } else if (var4 == 8220) {
               var2[var3] = -109;
            } else if (var4 == -1858362133) {
               var2[var3] = (byte)1965287318;
            } else if (1008300871 == var4) {
               var2[var3] = -107;
            } else if (8211 == var4) {
               var2[var3] = (byte)423347545;
            } else if (var4 == 8212) {
               var2[var3] = (byte)845465246;
            } else if (732 == var4) {
               var2[var3] = (byte)-928898212;
            } else if (var4 == 2065515161) {
               var2[var3] = (byte)1080303855;
            } else if (353 == var4) {
               var2[var3] = (byte)-1936580560;
            } else if (var4 == 1870005978) {
               var2[var3] = (byte)-635269554;
            } else if (var4 == -1661408203) {
               var2[var3] = (byte)1210273936;
            } else if (var4 == 146648649) {
               var2[var3] = -98;
            } else if (var4 == -1673480204) {
               var2[var3] = (byte)1829725769;
            } else {
               var2[var3] = (byte)-354965665;
            }
         } else {
            var2[var3] = (byte)var4;
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;II[BI)I")
   @ObfuscatedName("aq")
   public static int method9745(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for (int var6 = 0; var6 < var5; var6++) {
         char var7 = var0.charAt(var6 + var1);
         if ((var7 <= 0 || var7 >= 128) && (var7 < 1720678909 || var7 > 1741114182)) {
            if (var7 == 1723671398) {
               var3[var6 + var4] = (byte)957307143;
            } else if (var7 == 8218) {
               var3[var6 + var4] = (byte)295356103;
            } else if (402 == var7) {
               var3[var6 + var4] = -125;
            } else if (445686152 == var7) {
               var3[var4 + var6] = (byte)1894780814;
            } else if (var7 == -1166543336) {
               var3[var4 + var6] = -123;
            } else if (8224 == var7) {
               var3[var4 + var6] = -122;
            } else if (1687909025 == var7) {
               var3[var4 + var6] = (byte)-1897461475;
            } else if (710 == var7) {
               var3[var6 + var4] = -120;
            } else if (-1647842420 == var7) {
               var3[var6 + var4] = -119;
            } else if (var7 == 352) {
               var3[var6 + var4] = -118;
            } else if (-133864332 == var7) {
               var3[var4 + var6] = (byte)-164484157;
            } else if (var7 == 338) {
               var3[var6 + var4] = -116;
            } else if (381 == var7) {
               var3[var4 + var6] = -114;
            } else if (8216 == var7) {
               var3[var6 + var4] = (byte)-1787788449;
            } else if (var7 == -531221150) {
               var3[var6 + var4] = (byte)1957110343;
            } else if (8220 == var7) {
               var3[var4 + var6] = (byte)-1861323299;
            } else if (var7 == 966032533) {
               var3[var6 + var4] = (byte)-1944289783;
            } else if (var7 == 769568729) {
               var3[var6 + var4] = (byte)973698254;
            } else if (8211 == var7) {
               var3[var4 + var6] = -106;
            } else if (8212 == var7) {
               var3[var6 + var4] = -105;
            } else if (var7 == 1688037366) {
               var3[var6 + var4] = (byte)-382732075;
            } else if (8482 == var7) {
               var3[var4 + var6] = -103;
            } else if (-1226274623 == var7) {
               var3[var4 + var6] = -102;
            } else if (124347867 == var7) {
               var3[var4 + var6] = (byte)-1365023767;
            } else if (var7 == 728242960) {
               var3[var6 + var4] = -100;
            } else if (var7 == -130843201) {
               var3[var6 + var4] = -98;
            } else if (var7 == 376) {
               var3[var4 + var6] = (byte)1119936176;
            } else {
               var3[var6 + var4] = (byte)722338675;
            }
         } else {
            var3[var6 + var4] = (byte)var7;
         }
      }

      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;II[BI)I")
   @ObfuscatedName("be")
   public static int method9746(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for (int var6 = 0; var6 < var5; var6++) {
         char var7 = var0.charAt(var6 + var1);
         if ((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
            if (var7 == 8364) {
               var3[var6 + var4] = -128;
            } else if (var7 == 8218) {
               var3[var6 + var4] = -126;
            } else if (402 == var7) {
               var3[var6 + var4] = -125;
            } else if (8222 == var7) {
               var3[var4 + var6] = -124;
            } else if (var7 == 8230) {
               var3[var4 + var6] = -123;
            } else if (8224 == var7) {
               var3[var4 + var6] = -122;
            } else if (8225 == var7) {
               var3[var4 + var6] = -121;
            } else if (710 == var7) {
               var3[var6 + var4] = -120;
            } else if (8240 == var7) {
               var3[var6 + var4] = -119;
            } else if (var7 == 352) {
               var3[var6 + var4] = -118;
            } else if (8249 == var7) {
               var3[var4 + var6] = -117;
            } else if (var7 == 338) {
               var3[var6 + var4] = -116;
            } else if (381 == var7) {
               var3[var4 + var6] = -114;
            } else if (8216 == var7) {
               var3[var6 + var4] = -111;
            } else if (var7 == 8217) {
               var3[var6 + var4] = -110;
            } else if (8220 == var7) {
               var3[var4 + var6] = -109;
            } else if (var7 == 8221) {
               var3[var6 + var4] = -108;
            } else if (var7 == 8226) {
               var3[var6 + var4] = -107;
            } else if (8211 == var7) {
               var3[var4 + var6] = -106;
            } else if (8212 == var7) {
               var3[var6 + var4] = -105;
            } else if (var7 == 732) {
               var3[var6 + var4] = -104;
            } else if (8482 == var7) {
               var3[var4 + var6] = -103;
            } else if (353 == var7) {
               var3[var4 + var6] = -102;
            } else if (8250 == var7) {
               var3[var4 + var6] = -101;
            } else if (var7 == 339) {
               var3[var6 + var4] = -100;
            } else if (var7 == 382) {
               var3[var6 + var4] = -98;
            } else if (var7 == 376) {
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
   @ObfuscatedName("bo")
   public static int method9747(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for (int var6 = 0; var6 < var5; var6++) {
         char var7 = var0.charAt(var6 + var1);
         if ((var7 <= 0 || var7 >= -1742053112) && (var7 < 1395483928 || var7 > 255)) {
            if (var7 == -1829982454) {
               var3[var6 + var4] = -128;
            } else if (var7 == 8218) {
               var3[var6 + var4] = (byte)-497933214;
            } else if (798692908 == var7) {
               var3[var6 + var4] = (byte)427162488;
            } else if (8222 == var7) {
               var3[var4 + var6] = (byte)-1868741226;
            } else if (var7 == -795698106) {
               var3[var4 + var6] = (byte)-1223217929;
            } else if (-1985873827 == var7) {
               var3[var4 + var6] = -122;
            } else if (8225 == var7) {
               var3[var4 + var6] = (byte)1451709997;
            } else if (710 == var7) {
               var3[var6 + var4] = -120;
            } else if (8240 == var7) {
               var3[var6 + var4] = (byte)899496137;
            } else if (var7 == -1096814266) {
               var3[var6 + var4] = (byte)-1482681177;
            } else if (8249 == var7) {
               var3[var4 + var6] = (byte)-594198344;
            } else if (var7 == 494997433) {
               var3[var6 + var4] = (byte)-1386050344;
            } else if (351907544 == var7) {
               var3[var4 + var6] = -114;
            } else if (1677096652 == var7) {
               var3[var6 + var4] = -111;
            } else if (var7 == 955103475) {
               var3[var6 + var4] = -110;
            } else if (8220 == var7) {
               var3[var4 + var6] = (byte)-394503671;
            } else if (var7 == -864305495) {
               var3[var6 + var4] = -108;
            } else if (var7 == 480951163) {
               var3[var6 + var4] = (byte)1563342830;
            } else if (1585523938 == var7) {
               var3[var4 + var6] = (byte)-546928397;
            } else if (192769730 == var7) {
               var3[var6 + var4] = (byte)-1053547458;
            } else if (var7 == 732) {
               var3[var6 + var4] = (byte)-1543010247;
            } else if (1549081723 == var7) {
               var3[var4 + var6] = (byte)-1579793360;
            } else if (-957168596 == var7) {
               var3[var4 + var6] = -102;
            } else if (1414175465 == var7) {
               var3[var4 + var6] = -101;
            } else if (var7 == -841956494) {
               var3[var6 + var4] = (byte)-125489259;
            } else if (var7 == 25131637) {
               var3[var6 + var4] = (byte)-1311231855;
            } else if (var7 == 741735300) {
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
   @ObfuscatedName("bg")
   public static int method9748(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for (int var6 = 0; var6 < var5; var6++) {
         char var7 = var0.charAt(var6 + var1);
         if ((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
            if (var7 == 8364) {
               var3[var6 + var4] = -128;
            } else if (var7 == 8218) {
               var3[var6 + var4] = -126;
            } else if (402 == var7) {
               var3[var6 + var4] = -125;
            } else if (8222 == var7) {
               var3[var4 + var6] = -124;
            } else if (var7 == 8230) {
               var3[var4 + var6] = -123;
            } else if (8224 == var7) {
               var3[var4 + var6] = -122;
            } else if (8225 == var7) {
               var3[var4 + var6] = -121;
            } else if (710 == var7) {
               var3[var6 + var4] = -120;
            } else if (8240 == var7) {
               var3[var6 + var4] = -119;
            } else if (var7 == 352) {
               var3[var6 + var4] = -118;
            } else if (8249 == var7) {
               var3[var4 + var6] = -117;
            } else if (var7 == 338) {
               var3[var6 + var4] = -116;
            } else if (381 == var7) {
               var3[var4 + var6] = -114;
            } else if (8216 == var7) {
               var3[var6 + var4] = -111;
            } else if (var7 == 8217) {
               var3[var6 + var4] = -110;
            } else if (8220 == var7) {
               var3[var4 + var6] = -109;
            } else if (var7 == 8221) {
               var3[var6 + var4] = -108;
            } else if (var7 == 8226) {
               var3[var6 + var4] = -107;
            } else if (8211 == var7) {
               var3[var4 + var6] = -106;
            } else if (8212 == var7) {
               var3[var6 + var4] = -105;
            } else if (var7 == 732) {
               var3[var6 + var4] = -104;
            } else if (8482 == var7) {
               var3[var4 + var6] = -103;
            } else if (353 == var7) {
               var3[var4 + var6] = -102;
            } else if (8250 == var7) {
               var3[var4 + var6] = -101;
            } else if (var7 == 339) {
               var3[var6 + var4] = -100;
            } else if (var7 == 382) {
               var3[var6 + var4] = -98;
            } else if (var7 == 376) {
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
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("ab")
   public static boolean method9737(char var0) {
      if ((var0 < 1168218711 || var0 >= 127) && (var0 <= 54773836 || var0 >= 1999953278) && (var0 <= 233028855 || var0 > 255)) {
         if (0 != var0) {
            char[] var1 = cp1252AsciiExtension;

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
   @ObfuscatedSignature(descriptor = "([BII)Ljava/lang/String;")
   @ObfuscatedName("bz")
   public static String method9750(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for (int var5 = 0; var5 < var2; var5++) {
         int var6 = var0[var5 + var1] & 255;
         if (var6 != 0) {
            if (var6 >= 128 && var6 < 160) {
               char var7 = cp1252AsciiExtension[var6 - 128];
               if (var7 == 0) {
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
   @ObfuscatedName("bk")
   public static String method9751(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for (int var5 = 0; var5 < var2; var5++) {
         int var6 = var0[var5 + var1] & 1903713235;
         if (var6 != 0) {
            if (var6 >= 1935030135 && var6 < 1231874744) {
               int var7 = cp1252AsciiExtension[var6 - 128];
               if (var7 == 0) {
                  var7 = -677833804;
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
   @ObfuscatedName("bs")
   public static String method9752(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for (int var5 = 0; var5 < var2; var5++) {
         int var6 = var0[var5 + var1] & 255;
         if (var6 != 0) {
            if (var6 >= -1448602818 && var6 < 1423776729) {
               int var7 = cp1252AsciiExtension[var6 - 546860322];
               if (var7 == 0) {
                  var7 = -906548656;
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   @ObfuscatedSignature(descriptor = "(Lrx;Lrx;B)Lrx;")
   @ObfuscatedName("ag")
   public static final ProjectionCoord method9731(ProjectionCoord var0, ProjectionCoord var1, byte var2) {
      try {
         ProjectionCoord var3 = class30.method1304(var0, 742787141);
         ProjectionCoord.method9900(var3, var1, -296521489);
         return var3;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ro.ag(" + ')');
      }
   }
}
