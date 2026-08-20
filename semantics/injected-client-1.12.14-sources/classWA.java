import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wa")
public class classWA {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field6349 = 12;
   @ObfuscatedName("ag")
   static final char[] field6347 = new char[]{
      ' ',
      ' ',
      '_',
      '-',
      'à',
      'á',
      'â',
      'ä',
      'ã',
      'À',
      'Á',
      'Â',
      'Ä',
      'Ã',
      'è',
      'é',
      'ê',
      'ë',
      'È',
      'É',
      'Ê',
      'Ë',
      'í',
      'î',
      'ï',
      'Í',
      'Î',
      'Ï',
      'ò',
      'ó',
      'ô',
      'ö',
      'õ',
      'Ò',
      'Ó',
      'Ô',
      'Ö',
      'Õ',
      'ù',
      'ú',
      'û',
      'ü',
      'Ù',
      'Ú',
      'Û',
      'Ü',
      'ç',
      'Ç',
      'ÿ',
      'Ÿ',
      'ñ',
      'Ñ',
      'ß'
   };
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field6350 = 1;
   @ObfuscatedName("an")
   static final char[] field6348 = new char[]{'[', ']', '#'};

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("ak")
   static final boolean method11661(char var0) {
      if (Character.isISOControl(var0)) {
         return false;
      } else if (class189.isAlphaNumeric(var0, -1117110866)) {
         return true;
      } else {
         char[] var1 = field6347;

         for (int var2 = 0; var2 < var1.length; var2++) {
            char var3 = var1[var2];
            if (var3 == var0) {
               return true;
            }
         }

         var1 = field6348;

         for (int var5 = 0; var5 < var1.length; var5++) {
            char var6 = var1[var5];
            if (var0 == var6) {
               return true;
            }
         }

         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;Lwc;)Ljava/lang/String;")
   @ObfuscatedName("au")
   public static String method11666(CharSequence var0, LoginType var1) {
      if (var0 == null) {
         return null;
      } else {
         int var2 = 0;
         int var3 = var0.length();

         while (var2 < var3 && classFO.method4032(var0.charAt(var2), (byte)-1)) {
            var2++;
         }

         while (var3 > var2 && classFO.method4032(var0.charAt(var3 - 1), (byte)-1)) {
            var3--;
         }

         int var4 = var3 - var2;
         if (var4 >= 1) {
            byte var6;
            if (null == var1) {
               var6 = 12;
            } else {
               switch (917980913 * var1.field6354) {
                  case 2:
                     var6 = 20;
                     break;
                  default:
                     var6 = 12;
               }
            }

            if (var4 <= var6) {
               StringBuilder var5 = new StringBuilder(var4);

               for (int var10 = var2; var10 < var3; var10++) {
                  char var7 = var0.charAt(var10);
                  if (class406.method8775(var7, (byte)112)) {
                     int var8;
                     switch (var7) {
                        case ' ':
                        case '-':
                        case '_':
                        case ' ':
                           var8 = 95;
                           break;
                        case '#':
                        case '[':
                        case ']':
                           var8 = var7;
                           break;
                        case 'À':
                        case 'Á':
                        case 'Â':
                        case 'Ã':
                        case 'Ä':
                        case 'à':
                        case 'á':
                        case 'â':
                        case 'ã':
                        case 'ä':
                           var8 = 97;
                           break;
                        case 'Ç':
                        case 'ç':
                           var8 = 559720260;
                           break;
                        case 'È':
                        case 'É':
                        case 'Ê':
                        case 'Ë':
                        case 'è':
                        case 'é':
                        case 'ê':
                        case 'ë':
                           var8 = -330064676;
                           break;
                        case 'Í':
                        case 'Î':
                        case 'Ï':
                        case 'í':
                        case 'î':
                        case 'ï':
                           var8 = -1114279429;
                           break;
                        case 'Ñ':
                        case 'ñ':
                           var8 = -1605433524;
                           break;
                        case 'Ò':
                        case 'Ó':
                        case 'Ô':
                        case 'Õ':
                        case 'Ö':
                        case 'ò':
                        case 'ó':
                        case 'ô':
                        case 'õ':
                        case 'ö':
                           var8 = 1670323418;
                           break;
                        case 'Ù':
                        case 'Ú':
                        case 'Û':
                        case 'Ü':
                        case 'ù':
                        case 'ú':
                        case 'û':
                        case 'ü':
                           var8 = 583078017;
                           break;
                        case 'ß':
                           var8 = 98;
                           break;
                        case 'ÿ':
                        case 'Ÿ':
                           var8 = 121;
                           break;
                        default:
                           var8 = Character.toLowerCase(var7);
                     }

                     if (0 != var8) {
                        var5.append((char)var8);
                     }
                  }
               }

               if (var5.length() == 0) {
                  return null;
               }

               return var5.toString();
            }
         }

         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("an")
   static final boolean method11662(char var0) {
      if (Character.isISOControl(var0)) {
         return false;
      } else if (class189.isAlphaNumeric(var0, 1901148084)) {
         return true;
      } else {
         char[] var1 = field6347;

         for (int var2 = 0; var2 < var1.length; var2++) {
            char var3 = var1[var2];
            if (var3 == var0) {
               return true;
            }
         }

         var1 = field6348;

         for (int var5 = 0; var5 < var1.length; var5++) {
            char var6 = var1[var5];
            if (var0 == var6) {
               return true;
            }
         }

         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("aj")
   static final boolean method11663(char var0) {
      if (Character.isISOControl(var0)) {
         return false;
      } else if (class189.isAlphaNumeric(var0, 2019514402)) {
         return true;
      } else {
         char[] var1 = field6347;

         for (int var2 = 0; var2 < var1.length; var2++) {
            char var3 = var1[var2];
            if (var3 == var0) {
               return true;
            }
         }

         var1 = field6348;

         for (int var5 = 0; var5 < var1.length; var5++) {
            char var6 = var1[var5];
            if (var0 == var6) {
               return true;
            }
         }

         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;Lwc;)Ljava/lang/String;")
   @ObfuscatedName("ap")
   public static String method11667(CharSequence var0, LoginType var1) {
      if (var0 == null) {
         return null;
      } else {
         int var2 = 0;
         int var3 = var0.length();

         while (var2 < var3 && classFO.method4032(var0.charAt(var2), (byte)-1)) {
            var2++;
         }

         while (var3 > var2 && classFO.method4032(var0.charAt(var3 - 1), (byte)-1)) {
            var3--;
         }

         int var4 = var3 - var2;
         if (var4 >= 1) {
            byte var6;
            if (null == var1) {
               var6 = 12;
            } else {
               switch (-873290805 * var1.field6354) {
                  case 2:
                     var6 = 20;
                     break;
                  default:
                     var6 = 12;
               }
            }

            if (var4 <= var6) {
               StringBuilder var5 = new StringBuilder(var4);

               for (int var10 = var2; var10 < var3; var10++) {
                  char var7 = var0.charAt(var10);
                  if (class406.method8775(var7, (byte)124)) {
                     char var8;
                     switch (var7) {
                        case ' ':
                        case '-':
                        case '_':
                        case ' ':
                           var8 = '_';
                           break;
                        case '#':
                        case '[':
                        case ']':
                           var8 = var7;
                           break;
                        case 'À':
                        case 'Á':
                        case 'Â':
                        case 'Ã':
                        case 'Ä':
                        case 'à':
                        case 'á':
                        case 'â':
                        case 'ã':
                        case 'ä':
                           var8 = 'a';
                           break;
                        case 'Ç':
                        case 'ç':
                           var8 = 'c';
                           break;
                        case 'È':
                        case 'É':
                        case 'Ê':
                        case 'Ë':
                        case 'è':
                        case 'é':
                        case 'ê':
                        case 'ë':
                           var8 = 'e';
                           break;
                        case 'Í':
                        case 'Î':
                        case 'Ï':
                        case 'í':
                        case 'î':
                        case 'ï':
                           var8 = 'i';
                           break;
                        case 'Ñ':
                        case 'ñ':
                           var8 = 'n';
                           break;
                        case 'Ò':
                        case 'Ó':
                        case 'Ô':
                        case 'Õ':
                        case 'Ö':
                        case 'ò':
                        case 'ó':
                        case 'ô':
                        case 'õ':
                        case 'ö':
                           var8 = 'o';
                           break;
                        case 'Ù':
                        case 'Ú':
                        case 'Û':
                        case 'Ü':
                        case 'ù':
                        case 'ú':
                        case 'û':
                        case 'ü':
                           var8 = 'u';
                           break;
                        case 'ß':
                           var8 = 'b';
                           break;
                        case 'ÿ':
                        case 'Ÿ':
                           var8 = 'y';
                           break;
                        default:
                           var8 = Character.toLowerCase(var7);
                     }

                     if (0 != var8) {
                        var5.append(var8);
                     }
                  }
               }

               if (var5.length() == 0) {
                  return null;
               }

               return var5.toString();
            }
         }

         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("aw")
   static final boolean method11665(char var0) {
      return 160 == var0 || ' ' == var0 || var0 == '_' || var0 == '-';
   }

   classWA() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;Lwc;)Ljava/lang/String;")
   @ObfuscatedName("ay")
   public static String method11668(CharSequence var0, LoginType var1) {
      if (var0 == null) {
         return null;
      } else {
         int var2 = 0;
         int var3 = var0.length();

         while (var2 < var3 && classFO.method4032(var0.charAt(var2), (byte)-1)) {
            var2++;
         }

         while (var3 > var2 && classFO.method4032(var0.charAt(var3 - 1), (byte)-1)) {
            var3--;
         }

         int var4 = var3 - var2;
         if (var4 >= 1) {
            byte var6;
            if (null == var1) {
               var6 = 12;
            } else {
               switch (-873290805 * var1.field6354) {
                  case 2:
                     var6 = 20;
                     break;
                  default:
                     var6 = 12;
               }
            }

            if (var4 <= var6) {
               StringBuilder var5 = new StringBuilder(var4);

               for (int var10 = var2; var10 < var3; var10++) {
                  char var7 = var0.charAt(var10);
                  if (class406.method8775(var7, (byte)113)) {
                     char var8;
                     switch (var7) {
                        case ' ':
                        case '-':
                        case '_':
                        case ' ':
                           var8 = '_';
                           break;
                        case '#':
                        case '[':
                        case ']':
                           var8 = var7;
                           break;
                        case 'À':
                        case 'Á':
                        case 'Â':
                        case 'Ã':
                        case 'Ä':
                        case 'à':
                        case 'á':
                        case 'â':
                        case 'ã':
                        case 'ä':
                           var8 = 'a';
                           break;
                        case 'Ç':
                        case 'ç':
                           var8 = 'c';
                           break;
                        case 'È':
                        case 'É':
                        case 'Ê':
                        case 'Ë':
                        case 'è':
                        case 'é':
                        case 'ê':
                        case 'ë':
                           var8 = 'e';
                           break;
                        case 'Í':
                        case 'Î':
                        case 'Ï':
                        case 'í':
                        case 'î':
                        case 'ï':
                           var8 = 'i';
                           break;
                        case 'Ñ':
                        case 'ñ':
                           var8 = 'n';
                           break;
                        case 'Ò':
                        case 'Ó':
                        case 'Ô':
                        case 'Õ':
                        case 'Ö':
                        case 'ò':
                        case 'ó':
                        case 'ô':
                        case 'õ':
                        case 'ö':
                           var8 = 'o';
                           break;
                        case 'Ù':
                        case 'Ú':
                        case 'Û':
                        case 'Ü':
                        case 'ù':
                        case 'ú':
                        case 'û':
                        case 'ü':
                           var8 = 'u';
                           break;
                        case 'ß':
                           var8 = 'b';
                           break;
                        case 'ÿ':
                        case 'Ÿ':
                           var8 = 'y';
                           break;
                        default:
                           var8 = Character.toLowerCase(var7);
                     }

                     if (0 != var8) {
                        var5.append(var8);
                     }
                  }
               }

               if (var5.length() == 0) {
                  return null;
               }

               return var5.toString();
            }
         }

         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("ae")
   static final boolean method11664(char var0) {
      if (Character.isISOControl(var0)) {
         return false;
      } else if (class189.isAlphaNumeric(var0, 342819849)) {
         return true;
      } else {
         char[] var1 = field6347;

         for (int var2 = 0; var2 < var1.length; var2++) {
            char var3 = var1[var2];
            if (var3 == var0) {
               return true;
            }
         }

         var1 = field6348;

         for (int var5 = 0; var5 < var1.length; var5++) {
            char var6 = var1[var5];
            if (var0 == var6) {
               return true;
            }
         }

         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZB)I")
   @ObfuscatedName("ad")
   static int method11669(int var0, Script var1, boolean var2, byte var3) {
      try {
         Widget var4;
         if (var0 >= 2000) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            int var5 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            var4 = class226.widgetDefinition.method7953(var5, -977920860);
         } else {
            var4 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         }

         if (var0 == 1100) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var41 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var47 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               if (12 == 928687775 * var4.type) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  classOO var48 = var4.method8156(1640289207);
                  if (var48 != null) {
                     if (var3 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (var48.method8401(var41, var47, -850132114)) {
                        if (var3 <= 1) {
                           throw new IllegalStateException();
                        }

                        class376.invalidateWidget(var4, (byte)5);
                     }
                  }
               } else {
                  var4.scrollX = var41 * -1597374639;
                  if (1068149169 * var4.scrollX > -111672215 * var4.scrollWidth - -1946208531 * var4.width) {
                     if (var3 <= 1) {
                        throw new IllegalStateException();
                     }

                     var4.scrollX = -1481704391 * var4.scrollWidth - -1014270979 * var4.width;
                  }

                  if (1068149169 * var4.scrollX < 0) {
                     if (var3 <= 1) {
                        throw new IllegalStateException();
                     }

                     var4.scrollX = 0;
                  }

                  var4.scrollY = 1603227665 * var47;
                  if (-497311503 * var4.scrollY > -1963554889 * var4.scrollHeight - -905446999 * var4.height) {
                     var4.scrollY = -50253017 * var4.scrollHeight - 351495225 * var4.height;
                  }

                  if (-497311503 * var4.scrollY < 0) {
                     if (var3 <= 1) {
                        throw new IllegalStateException();
                     }

                     var4.scrollY = 0;
                  }

                  class376.invalidateWidget(var4, (byte)5);
               }

               return 1;
            }
         } else if (var0 == 1101) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               var4.color = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1365603885;
               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (var0 == 1102) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               var4.fill = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (1103 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               var4.transparencyTop = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -167855443;
               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (1104 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               var4.lineWid = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -249010551;
               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (var0 == 1105) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               var4.spriteId2 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 2092479471;
               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (1106 == var0) {
            var4.spriteAngle = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -795510295;
            class376.invalidateWidget(var4, (byte)5);
            return 1;
         } else if (1107 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               boolean var57;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var57 = true;
               } else {
                  var57 = false;
               }

               var4.spriteTiling = var57;
               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (1108 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               var4.modelType = -1570196439;
               var4.modelId = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1314816461;
               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (1109 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 2126178222;
               var4.modelOffsetX = -37619155 * Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               var4.modelOffsetY = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1] * -1048338377;
               var4.modelAngleX = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2] * -1977744073;
               var4.modelAngleY = 676548941 * Interpreter.Interpreter_intStack[3 + 327716789 * class408.Interpreter_intStackSize];
               var4.modelAngleZ = Interpreter.Interpreter_intStack[4 + 327716789 * class408.Interpreter_intStackSize] * 132153981;
               var4.modelZoom = 2012543961 * Interpreter.Interpreter_intStack[5 + class408.Interpreter_intStackSize * 327716789];
               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (1110 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               int var40 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               if (var4.sequenceId * -750054055 != var40) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var4.sequenceId = var40 * -12983575;
                  var4.modelFrame = 0;
                  var4.modelFrameCycle = 0;
                  class376.invalidateWidget(var4, (byte)5);
               }

               return 1;
            }
         } else if (1111 == var0) {
            boolean var56;
            if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               var56 = true;
            } else {
               var56 = false;
            }

            var4.modelOrthog = var56;
            class376.invalidateWidget(var4, (byte)5);
            return 1;
         } else if (1112 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               String var39 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               if (var4.type * 928687775 == 12) {
                  label847: {
                     classOO var46 = var4.method8156(1307888429);
                     if (null != var46) {
                        if (var3 <= 1) {
                           throw new IllegalStateException();
                        }

                        if (var46.method8557((byte)-61)) {
                           if (var3 <= 1) {
                              throw new IllegalStateException();
                           }

                           var46.method8378(var39, -1522788314);
                           break label847;
                        }
                     }

                     var4.text = var39;
                  }

                  class376.invalidateWidget(var4, (byte)5);
               } else if (!var39.equals(var4.text)) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var4.text = var39;
                  class376.invalidateWidget(var4, (byte)5);
               }

               return 1;
            }
         } else if (var0 == 1113) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               var4.fontId = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1824873669;
               if (12 == 928687775 * var4.type) {
                  classOO var38 = var4.method8156(744035786);
                  if (null != var38) {
                     if (var3 <= 1) {
                        throw new IllegalStateException();
                     }

                     var38.method8416(-49005836);
                  }
               }

               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (1114 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1084394537;
               if (12 == 928687775 * var4.type) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  classOO var37 = var4.method8156(899739852);
                  if (var37 != null) {
                     var37.method8405(
                        Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789],
                        Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1],
                        -2033556037
                     );
                     var37.method8412(Interpreter.Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789], 418519100);
                  }
               } else {
                  var4.textXAlignment = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789] * -563011291;
                  var4.textYAlignment = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize] * 1108485379;
                  var4.textLineHeight = -1440610935 * Interpreter.Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
               }

               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (var0 == 1115) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               var4.textShadowed = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (1116 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               var4.outline = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 217033705;
               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (1117 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               var4.spriteShadow = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1846663581;
               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (var0 == 1118) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               boolean var55;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var55 = true;
               } else {
                  var55 = false;
               }

               var4.spriteFlipV = var55;
               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (1119 == var0) {
            boolean var54;
            if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               var54 = true;
            } else {
               var54 = false;
            }

            var4.spriteFlipH = var54;
            class376.invalidateWidget(var4, (byte)5);
            return 1;
         } else if (var0 == 1120) {
            class408.Interpreter_intStackSize -= 708726074;
            var4.scrollWidth = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789] * 1897778137;
            var4.scrollHeight = 1821115911 * Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
            class376.invalidateWidget(var4, (byte)5);
            if (0 == var4.type * 928687775) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               Widget[] var53;
               if (2077538819 * var4.childIndex == -1) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var53 = class226.widgetDefinition.Widget_interfaceComponents[278777747 * var4.id >> 16];
               } else {
                  var53 = class226.widgetDefinition.method7953(794900977 * var4.parentId, -696178572).children;
               }

               Widget[] var36 = var53;
               class339.revalidateWidgetScroll(var36, var4, false, -1786772313);
            }

            return 1;
         } else if (var0 == 1121) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               HealthBarDefinition.resumePauseWidget(278777747 * var4.id, 2077538819 * var4.childIndex, 796730673);
               client.meslayerContinueWidget = var4;
               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (1122 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               var4.spriteId = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -18433963;
               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (var0 == 1123) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               var4.color2 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1017345247;
               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (var0 == 1124) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               var4.transparencyBot = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * 1009763901;
               class376.invalidateWidget(var4, (byte)5);
               return 1;
            }
         } else if (var0 == 1125) {
            int var35 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            FillMode var45 = (FillMode)GrandExchangeOffer.findEnumerated(class299.FillMode_values(-1859449601), var35, (byte)1);
            if (null != var45) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               var4.fillMode = var45;
               class376.invalidateWidget(var4, (byte)5);
            }

            return 1;
         } else if (var0 == 1126) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               boolean var52;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var52 = true;
               } else {
                  var52 = false;
               }

               boolean var34 = var52;
               var4.field4526 = var34;
               return 1;
            }
         } else if (var0 == 1127) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               boolean var51;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var51 = true;
               } else {
                  var51 = false;
               }

               boolean var33 = var51;
               var4.modelTransparency = var33;
               return 1;
            }
         } else if (var0 == 1129) {
            var4.field4540 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            class376.invalidateWidget(var4, (byte)5);
            return 1;
         } else if (1130 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               var4.method8080(
                  (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587],
                  "",
                  class164.urlRequester,
                  class6.getUserId(756246269)
               );
               return 1;
            }
         } else if (1131 == var0) {
            class408.Interpreter_intStackSize -= 708726074;
            var4.method8099(
               Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
               Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize],
               -1163090419
            );
            return 1;
         } else if (var0 == 1132) {
            var4.method8101(
               (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587],
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789],
               (byte)12
            );
            return 1;
         } else if (var0 == 1133) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               class372 var32 = var4.method8158((short)16256);
               if (var32 != null) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var32.field4640 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize] * -1863371523;
                  class376.invalidateWidget(var4, (byte)5);
               }

               return 1;
            }
         } else if (1134 == var0) {
            class408.Interpreter_intStackSize -= -1793120611;
            class372 var31 = var4.method8158((short)16256);
            if (var31 != null) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               var31.field4642 = -2050586211 * Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               class376.invalidateWidget(var4, (byte)5);
            }

            return 1;
         } else if (var0 == 1135) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
               classOO var30 = var4.method8156(646482203);
               if (var30 != null) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var4.text2 = (String)Interpreter.Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
               }

               return 1;
            }
         } else if (var0 == 1136) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               class372 var29 = var4.method8158((short)16256);
               if (var29 != null) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var29.field4641 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789] * -718628869;
                  class376.invalidateWidget(var4, (byte)5);
               }

               return 1;
            }
         } else if (1137 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               classOO var28 = var4.method8156(874201232);
               if (null != var28) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (var28.method8392(Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], -1560077076)) {
                     if (var3 <= 1) {
                        throw new IllegalStateException();
                     }

                     class376.invalidateWidget(var4, (byte)5);
                  }
               }

               return 1;
            }
         } else if (var0 == 1138) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               classOO var27 = var4.method8156(160183327);
               if (var27 != null && var27.method8397(Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], -1088391311)) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  class376.invalidateWidget(var4, (byte)5);
               }

               return 1;
            }
         } else if (var0 == 1139) {
            class408.Interpreter_intStackSize -= -1793120611;
            classOO var26 = var4.method8156(922095599);
            if (null != var26) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               if (var26.method8400(Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], 650447443)) {
                  class376.invalidateWidget(var4, (byte)5);
               }
            }

            return 1;
         } else if (1140 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               boolean var50;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var50 = true;
               } else {
                  var50 = false;
               }

               boolean var25 = var50;
               client.widgetFocusInputManager.method6358(336321861);
               classOO var44 = var4.method8156(1014021568);
               if (null != var44) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (var44.method8371(var25, 1485355144)) {
                     if (var3 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (var25) {
                        if (var3 <= 1) {
                           throw new IllegalStateException();
                        }

                        client.widgetFocusInputManager.method6353(var4, (byte)29);
                     }

                     class376.invalidateWidget(var4, (byte)5);
                  }
               }

               return 1;
            }
         } else if (1141 == var0) {
            boolean var24 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            if (!var24) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               if (client.widgetFocusInputManager.method6348(-813486657) == var4) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  client.widgetFocusInputManager.method6358(-1809835684);
                  class376.invalidateWidget(var4, (byte)5);
               }
            }

            classOO var43 = var4.method8156(596471565);
            if (var43 != null) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               var43.method8375(var24, 1084889504);
            }

            return 1;
         } else if (1142 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               classOO var23 = var4.method8156(541089159);
               if (null != var23) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (classOO.method8450(
                     var23,
                     Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
                     Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789],
                     -1986907023
                  )) {
                     if (var3 <= 1) {
                        throw new IllegalStateException();
                     }

                     class376.invalidateWidget(var4, (byte)5);
                  }
               }

               return 1;
            }
         } else if (1143 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               classOO var22 = var4.method8156(2010057429);
               if (null != var22
                  && classOO.method8450(
                     var22,
                     Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
                     Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
                     -914768207
                  )) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  class376.invalidateWidget(var4, (byte)5);
               }

               return 1;
            }
         } else if (var0 == 1144) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               classOO var21 = var4.method8156(1832465185);
               if (null != var21) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  classOO.method8582(var21, Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], (byte)-35);
                  class376.invalidateWidget(var4, (byte)5);
               }

               return 1;
            }
         } else if (var0 == 1145) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               classOO var20 = var4.method8156(255216077);
               if (var20 != null) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var20.method8575(Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], (short)193);
               }

               return 1;
            }
         } else if (var0 == 1146) {
            class408.Interpreter_intStackSize -= -1793120611;
            classOO var19 = var4.method8156(1722184156);
            if (null != var19) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               var19.method8414(Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], -1677752388);
            }

            return 1;
         } else if (1147 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1793120611;
               classOO var18 = var4.method8156(861534617);
               if (null != var18) {
                  var18.method8591(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789], -10267897);
                  class376.invalidateWidget(var4, (byte)5);
               }

               return 1;
            }
         } else if (1148 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               class28 var17 = var4.method8162((byte)13);
               if (null != var17) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  class28.method486(
                     var17,
                     Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
                     Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789],
                     -1772320261
                  );
               }

               return 1;
            }
         } else if (var0 == 1149) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               class28 var16 = var4.method8162((byte)13);
               if (null != var16) {
                  var16.method488(
                     (char)Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
                     Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize],
                     -371900800
                  );
               }

               return 1;
            }
         } else if (1150 == var0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               Widget.method8091(
                  var4,
                  (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587],
                  class164.urlRequester,
                  1049693640
               );
               return 1;
            }
         } else if (var0 == 1151) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               SecureRandomFuture.Interpreter_objectStackSize -= -1799073313;
               String var15 = (String)Interpreter.Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
               String var42 = (String)Interpreter.Interpreter_objectStack[1 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
               String var7 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 2];
               long var8 = class6.getUserId(-55444448);
               long var10 = class40.getUserHash(1019556323);
               String var12 = PlatformInfo.method11338(class282.getPlatformInfo(-1446907360), class282.getPlatformInfo(1555843000).os * -208903543, 168937541);
               if (-1L != var8) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var15 = var15.replaceAll("%userid%", Long.toString(var8));
               }

               if (var10 != -1L) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var15 = var15.replaceAll("%userhash%", Long.toString(var10));
               }

               if (!var12.isEmpty()) {
                  var15 = var15.replaceAll("%deviceid%", var12);
               }

               var4.method8085(var15, var42, var7, var12, Long.toString(var10), class164.urlRequester, (byte)11);
               return 1;
            }
         } else if (1152 != var0) {
            return 2;
         } else if (928687775 * var4.type == 11) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            } else {
               boolean var10000;
               label858: {
                  class225 var14 = Widget.method8141(var4, -1972412800);
                  if (null != var14) {
                     if (var3 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (var14.method5297((byte)12)) {
                        if (var3 <= 1) {
                           throw new IllegalStateException();
                        }

                        if (class234.method5950(WorldMapArea.method6908(-76037658), var14.method5322((byte)-20), 208000344)) {
                           if (var3 <= 1) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                           break label858;
                        }
                     }
                  }

                  var10000 = false;
               }

               boolean var6 = var10000;
               int[] var49 = Interpreter.Interpreter_intStack;
               int var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var10002;
               if (var6) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var49[var10001] = var10002;
               return 1;
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "wa.ad(" + 41);
      }
   }
}
