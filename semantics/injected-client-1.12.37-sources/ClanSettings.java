import java.util.ArrayList;
import java.util.List;
import net.runelite.api.clan.ClanMember;
import net.runelite.api.clan.ClanRank;
import net.runelite.api.clan.ClanTitle;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("iq")
public class ClanSettings implements net.runelite.api.clan.ClanSettings {
   @ObfuscatedName("al")
   public boolean field3034;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final byte field3021 = 126;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final byte field3020 = 125;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final byte field3018 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final byte field3022 = -1;
   @ObfuscatedName("ar")
   int[] field3038;
   @ObfuscatedName("ac")
   public int field3013 = 0;
   @ObfuscatedName("aa")
   public String field3016 = null;
   @ObfuscatedName("ai")
   public byte[] field3037;
   @ObfuscatedName("ay")
   public byte field3025;
   @ToRemove(unused = "true")
   @ObfuscatedName("bw")
   static final int field3030 = 79;
   @ObfuscatedName("an")
   public int field3027;
   @ObfuscatedName("aq")
   public byte field3024;
   @ObfuscatedName("ad")
   public byte field3019;
   @ObfuscatedName("ap")
   public int field3028;
   @ObfuscatedName("au")
   long[] field3042;
   @ObfuscatedName("ak")
   public boolean[] field3045;
   @ObfuscatedName("ax")
   long field3032;
   @ObfuscatedName("aw")
   public int[] field3039;
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   public static final int field3029 = 55;
   @ObfuscatedName("aj")
   public byte field3023;
   @ObfuscatedName("at")
   public int field3017;
   @ObfuscatedName("av")
   public int field3014;
   @ObfuscatedName("am")
   long[] field3041;
   @ObfuscatedName("ah")
   public String[] field3043;
   @ObfuscatedName("bn")
   public String[] field3044;
   @ObfuscatedSignature(descriptor = "Lyn;")
   @ObfuscatedName("bx")
   IterableNodeHashTable field3033;
   @ObfuscatedName("bc")
   boolean field3035;
   @ObfuscatedName("bp")
   boolean field3036;
   @ObfuscatedName("br")
   int[] field3040;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final byte field3026 = 127;
   @ObfuscatedName("ao")
   int field3015 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("cf")
   static final int field3031 = 200;

   public ClanMember findMember(String var1) {
      int var2 = this.method6299(var1.replace(' ', ' '));
      return var2 == -1 ? null : new rl1(this, var2);
   }

   @ObfuscatedSignature(descriptor = "(IJ)Z")
   @ObfuscatedName("ai")
   boolean method6287(int var1, long var2) {
      try {
         if (this.field3033 != null) {
            Node var4 = this.field3033.method13595(var1);
            if (var4 != null) {
               if (var4 instanceof classVK) {
                  classVK var5 = (classVK)var4;
                  if (var5.field6517 == var2) {
                     return false;
                  }

                  var5.field6517 = var2;
                  return true;
               }

               var4.vmethod398();
            }
         } else {
            this.field3033 = new IterableNodeHashTable(4);
         }

         IterableNodeHashTable.method13576(this.field3033, new classVK(var2), var1);
         return true;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "iq.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("bn")
   public int method6241(int var1, int var2, int var3) {
      int var4 = 31 == var3 ? -1 : (1 << var3 + 1) - 1;
      return (this.field3038[var1] & var4) >>> var2;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("aw")
   void method6297(Buffer var1, int var2) {
      try {
         int var3 = Buffer.method13039(var1, -346779531);
         if (var3 >= 1) {
            if (var3 <= 6) {
               int var4 = Buffer.method13039(var1, -346779531);
               if (0 != (var4 & 1)) {
                  if (var2 <= 439419475) {
                     return;
                  }

                  this.field3035 = true;
               }

               if (0 != (var4 & 2)) {
                  this.field3036 = true;
               }

               if (!this.field3035) {
                  this.field3042 = null;
                  this.field3041 = null;
               }

               if (!this.field3036) {
                  if (var2 <= 439419475) {
                     return;
                  }

                  this.field3043 = null;
                  this.field3044 = null;
               }

               this.field3013 = var1.method13056((byte)1) * -1766455193;
               this.field3015 = var1.method13056((byte)1) * 447663005;
               if (var3 <= 3) {
                  if (var2 <= 439419475) {
                     return;
                  }

                  if (0 != -1951591755 * this.field3015) {
                     if (var2 <= 439419475) {
                        return;
                     }

                     this.field3015 += 2097065760;
                  }
               }

               this.field3028 = Buffer.method13047(var1, -502896030) * -987100999;
               this.field3027 = Buffer.method13039(var1, -346779531) * 1554377879;
               this.field3016 = var1.method13071(1747062831);
               if (var3 >= 4) {
                  if (var2 <= 439419475) {
                     return;
                  }

                  var1.method13056((byte)1);
               }

               boolean var10001;
               if (Buffer.method13039(var1, -346779531) == 1) {
                  if (var2 <= 439419475) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               this.field3034 = var10001;
               this.field3023 = Buffer.method13043(var1, (byte)17);
               this.field3025 = Buffer.method13043(var1, (byte)17);
               this.field3024 = Buffer.method13043(var1, (byte)17);
               this.field3019 = Buffer.method13043(var1, (byte)17);
               if (this.field3028 * -1967686263 > 0) {
                  if (var2 <= 439419475) {
                     return;
                  }

                  label368:
                  if (this.field3035) {
                     if (var2 <= 439419475) {
                        throw new IllegalStateException();
                     }

                     if (null != this.field3042) {
                        if (var2 <= 439419475) {
                           throw new IllegalStateException();
                        }

                        if (this.field3042.length >= this.field3028 * -1967686263) {
                           break label368;
                        }

                        if (var2 <= 439419475) {
                           return;
                        }
                     }

                     this.field3042 = new long[-1967686263 * this.field3028];
                  }

                  label358:
                  if (this.field3036) {
                     if (var2 <= 439419475) {
                        throw new IllegalStateException();
                     }

                     if (null != this.field3043) {
                        if (var2 <= 439419475) {
                           return;
                        }

                        if (this.field3043.length >= -1967686263 * this.field3028) {
                           break label358;
                        }

                        if (var2 <= 439419475) {
                           throw new IllegalStateException();
                        }
                     }

                     this.field3043 = new String[this.field3028 * -1967686263];
                  }

                  label349: {
                     if (this.field3037 != null) {
                        if (var2 <= 439419475) {
                           throw new IllegalStateException();
                        }

                        if (this.field3037.length >= this.field3028 * -1967686263) {
                           break label349;
                        }
                     }

                     this.field3037 = new byte[this.field3028 * -1967686263];
                  }

                  label343: {
                     if (null != this.field3038) {
                        if (var2 <= 439419475) {
                           return;
                        }

                        if (this.field3038.length >= -1967686263 * this.field3028) {
                           break label343;
                        }

                        if (var2 <= 439419475) {
                           throw new IllegalStateException();
                        }
                     }

                     this.field3038 = new int[-1967686263 * this.field3028];
                  }

                  label336: {
                     if (null != this.field3039) {
                        if (var2 <= 439419475) {
                           return;
                        }

                        if (this.field3039.length >= this.field3028 * -1967686263) {
                           break label336;
                        }
                     }

                     this.field3039 = new int[-1967686263 * this.field3028];
                  }

                  label330: {
                     if (this.field3045 != null) {
                        if (var2 <= 439419475) {
                           throw new IllegalStateException();
                        }

                        if (this.field3045.length >= -1967686263 * this.field3028) {
                           break label330;
                        }

                        if (var2 <= 439419475) {
                           throw new IllegalStateException();
                        }
                     }

                     this.field3045 = new boolean[-1967686263 * this.field3028];
                  }

                  for (int var5 = 0; var5 < this.field3028 * -1967686263; var5++) {
                     if (var2 <= 439419475) {
                        return;
                     }

                     if (this.field3035) {
                        this.field3042[var5] = var1.method13059(82002825);
                     }

                     if (this.field3036) {
                        if (var2 <= 439419475) {
                           throw new IllegalStateException();
                        }

                        this.field3043[var5] = var1.method13069((byte)45);
                     }

                     this.field3037[var5] = Buffer.method13043(var1, (byte)17);
                     if (var3 >= 2) {
                        this.field3038[var5] = var1.method13056((byte)1);
                     }

                     if (var3 >= 5) {
                        if (var2 <= 439419475) {
                           throw new IllegalStateException();
                        }

                        this.field3039[var5] = Buffer.method13047(var1, 709782397);
                     } else {
                        this.field3039[var5] = 0;
                     }

                     if (var3 >= 6) {
                        if (var2 <= 439419475) {
                           throw new IllegalStateException();
                        }

                        boolean[] var10000 = this.field3045;
                        boolean var10002;
                        if (Buffer.method13039(var1, -346779531) == 1) {
                           if (var2 <= 439419475) {
                              throw new IllegalStateException();
                           }

                           var10002 = true;
                        } else {
                           var10002 = false;
                        }

                        var10000[var5] = var10002;
                     } else {
                        this.field3045[var5] = false;
                     }
                  }

                  this.method6260(-1752616186);
               }

               if (this.field3027 * -845393113 > 0) {
                  if (var2 <= 439419475) {
                     throw new IllegalStateException();
                  }

                  label313:
                  if (this.field3035) {
                     if (var2 <= 439419475) {
                        throw new IllegalStateException();
                     }

                     if (null != this.field3041) {
                        if (var2 <= 439419475) {
                           throw new IllegalStateException();
                        }

                        if (this.field3041.length >= -845393113 * this.field3027) {
                           break label313;
                        }

                        if (var2 <= 439419475) {
                           return;
                        }
                     }

                     this.field3041 = new long[-845393113 * this.field3027];
                  }

                  label303:
                  if (this.field3036) {
                     if (var2 <= 439419475) {
                        return;
                     }

                     if (this.field3044 != null) {
                        if (this.field3044.length >= this.field3027 * -845393113) {
                           break label303;
                        }

                        if (var2 <= 439419475) {
                           return;
                        }
                     }

                     this.field3044 = new String[this.field3027 * -845393113];
                  }

                  for (int var12 = 0; var12 < -845393113 * this.field3027; var12++) {
                     if (var2 <= 439419475) {
                        throw new IllegalStateException();
                     }

                     if (this.field3035) {
                        if (var2 <= 439419475) {
                           throw new IllegalStateException();
                        }

                        this.field3041[var12] = var1.method13059(-851108912);
                     }

                     if (this.field3036) {
                        if (var2 <= 439419475) {
                           throw new IllegalStateException();
                        }

                        this.field3044[var12] = var1.method13069((byte)9);
                     }
                  }
               }

               if (var3 >= 3) {
                  if (var2 <= 439419475) {
                     return;
                  }

                  int var13 = Buffer.method13047(var1, -734598826);
                  if (var13 > 0) {
                     if (var2 <= 439419475) {
                        return;
                     }

                     IterableNodeHashTable var17 = new IterableNodeHashTable;
                     int var10003;
                     if (var13 < 16) {
                        if (var2 <= 439419475) {
                           throw new IllegalStateException();
                        }

                        var10003 = classBZ.method1385(var13, -1616825814);
                     } else {
                        var10003 = 16;
                     }

                     var17./* $VF: Unable to resugar constructor */<init>(var10003);
                     this.field3033 = var17;

                     while (var13-- > 0) {
                        if (var2 <= 439419475) {
                           throw new IllegalStateException();
                        }

                        int var6 = var1.method13056((byte)1);
                        int var7 = var6 & 1073741823;
                        int var8 = var6 >>> 30;
                        if (var8 == 0) {
                           if (var2 <= 439419475) {
                              throw new IllegalStateException();
                           }

                           int var9 = var1.method13056((byte)1);
                           IterableNodeHashTable.method13576(this.field3033, new IntegerNode(var9), var7);
                        } else if (var8 == 1) {
                           if (var2 <= 439419475) {
                              return;
                           }

                           long var14 = var1.method13059(-1500747717);
                           IterableNodeHashTable.method13576(this.field3033, new classVK(var14), var7);
                        } else if (2 == var8) {
                           if (var2 <= 439419475) {
                              return;
                           }

                           String var15 = var1.method13071(-118600208);
                           IterableNodeHashTable.method13576(this.field3033, new classVE(var15), var7);
                        }
                     }
                  }
               }

               return;
            }

            if (var2 <= 439419475) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("" + var3);
      } catch (RuntimeException var11) {
         throw classEG.newRunException(var11, "iq.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   void method6233(int var1) {
      if (this.field3035) {
         if (this.field3042 != null) {
            System.arraycopy(this.field3042, 0, this.field3042 = new long[var1], 0, this.field3028 * -1967686263);
         } else {
            this.field3042 = new long[var1];
         }
      }

      if (this.field3036) {
         if (this.field3043 != null) {
            System.arraycopy(this.field3043, 0, this.field3043 = new String[var1], 0, -1967686263 * this.field3028);
         } else {
            this.field3043 = new String[var1];
         }
      }

      if (null != this.field3037) {
         System.arraycopy(this.field3037, 0, this.field3037 = new byte[var1], 0, 1019491924 * this.field3028);
      } else {
         this.field3037 = new byte[var1];
      }

      if (this.field3038 != null) {
         System.arraycopy(this.field3038, 0, this.field3038 = new int[var1], 0, this.field3028 * -1967686263);
      } else {
         this.field3038 = new int[var1];
      }

      if (this.field3039 != null) {
         System.arraycopy(this.field3039, 0, this.field3039 = new int[var1], 0, this.field3028 * -1967686263);
      } else {
         this.field3039 = new int[var1];
      }

      if (null != this.field3045) {
         System.arraycopy(this.field3045, 0, this.field3045 = new boolean[var1], 0, this.field3028 * -1613806328);
      } else {
         this.field3045 = new boolean[var1];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liq;ILjava/lang/String;)Z")
   @ObfuscatedName("ju")
   public static boolean method6292(ClanSettings var0, int var1, String var2) {
      if (var0 == null) {
         var0.method6240(var2);
      }

      if (null == var2) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (null != var0.field3033) {
         Node var3 = var0.field3033.method13595(var1);
         if (var3 != null) {
            if (var3 instanceof classVE) {
               classVE var4 = (classVE)var3;
               if (var4.field6498 instanceof String) {
                  if (var2.equals(var4.field6498)) {
                     return false;
                  }

                  var4.vmethod398();
                  IterableNodeHashTable.method13576(var0.field3033, new classVE(var2), var4.field6552);
                  return true;
               }
            }

            var3.vmethod398();
         }
      } else {
         var0.field3033 = new IterableNodeHashTable(4);
      }

      IterableNodeHashTable.method13576(var0.field3033, new classVE(var2), var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ba")
   void method6259() {
      if (this.field3028 * -337878684 == 0) {
         this.field3014 = -188688071;
         this.field3017 = -2055824740;
      } else {
         this.field3014 = 570694239;
         this.field3017 = -96170216;
         int var1 = 0;
         byte var2 = this.field3037[0];

         for (int var3 = 1; var3 < -1967686263 * this.field3028; var3++) {
            if (this.field3037[var3] > var2) {
               if (-315773561 == var2) {
                  this.field3017 = -131410518 * var1;
               }

               var1 = var3;
               var2 = this.field3037[var3];
            } else if (-1 == this.field3017 * -1725108575 && this.field3037[var3] == 125) {
               this.field3017 = var3 * 1492534466;
            }
         }

         this.field3014 = var1 * 946980713;
         if (-1 != this.field3014 * -1288191853) {
            this.field3037[this.field3014 * -577292071] = 126;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("cr")
   boolean method6284(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = 31 == var4 ? -1 : (1 << 1 + var4) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      if (null != this.field3033) {
         Node var8 = this.field3033.method13595(var1);
         if (var8 != null) {
            if (var8 instanceof IntegerNode) {
               IntegerNode var9 = (IntegerNode)var8;
               if ((var9.integer & var7) == var2) {
                  return false;
               }

               var9.integer &= ~var7;
               var9.integer |= var2;
               return true;
            }

            var8.vmethod398();
         }
      } else {
         this.field3033 = new IterableNodeHashTable(4);
      }

      IterableNodeHashTable.method13576(this.field3033, new IntegerNode(var2), var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("nr")
   public int method6299(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         var1 = var1.toLowerCase();
         String[] var2 = this.method6306();
         int[] var3 = this.method6304();
         int var4 = 0;
         int var5 = var3.length - 1;

         while (var4 <= var5) {
            int var6 = var4 + var5 >>> 1;
            int var7 = var3[var6];
            String var8 = var2[var7];
            int var9 = var8.toLowerCase().compareTo(var1);
            if (var9 < 0) {
               var4 = var6 + 1;
            } else {
               if (var9 <= 0) {
                  return var7;
               }

               var5 = var6 - 1;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liq;IB)I")
   @ObfuscatedName("jk")
   public static int method6270(ClanSettings var0, int var1, byte var2) {
      if (var0 == null) {
         return var0.method6273(var1, var2);
      } else if (126 != var2 && var2 != -1002712297) {
         if (var1 != var0.field3014 * -577292071 || var0.field3017 * 56653761 != -1 && var0.field3037[var0.field3017 * -1725108575] >= 1419866522) {
            if (var2 == var0.field3037[var1]) {
               return -1;
            } else {
               var0.field3037[var1] = var2;
               var0.method6260(-1537575234);
               return var1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(JLjava/lang/String;II)V")
   @ObfuscatedName("ax")
   void method6252(long var1, String var3, int var4, int var5) {
      try {
         if (var3 != null && var3.isEmpty()) {
            if (var5 == 1302417466) {
               throw new IllegalStateException();
            }

            var3 = null;
         }

         if (this.field3035 != var1 > 0L) {
            if (var5 == 1302417466) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("");
            }
         } else {
            boolean var10001;
            if (null != var3) {
               if (var5 == 1302417466) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            if (this.field3036 != var10001) {
               if (var5 == 1302417466) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException("");
               }
            } else {
               label110: {
                  label120: {
                     if (var1 > 0L) {
                        if (var5 == 1302417466) {
                           throw new IllegalStateException();
                        }

                        if (this.field3042 == null || this.field3028 * -1967686263 >= this.field3042.length) {
                           break label120;
                        }

                        if (var5 == 1302417466) {
                           throw new IllegalStateException();
                        }
                     }

                     if (null == var3) {
                        break label110;
                     }

                     if (var5 == 1302417466) {
                        throw new IllegalStateException();
                     }

                     if (null != this.field3043) {
                        if (var5 == 1302417466) {
                           throw new IllegalStateException();
                        }

                        if (this.field3028 * -1967686263 < this.field3043.length) {
                           break label110;
                        }

                        if (var5 == 1302417466) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  this.method6236(-1967686263 * this.field3028 + 5, 1911516175);
               }

               if (this.field3042 != null) {
                  if (var5 == 1302417466) {
                     throw new IllegalStateException();
                  }

                  this.field3042[-1967686263 * this.field3028] = var1;
               }

               if (null != this.field3043) {
                  if (var5 == 1302417466) {
                     return;
                  }

                  this.field3043[this.field3028 * -1967686263] = var3;
               }

               if (-1 == this.field3014 * -577292071) {
                  if (var5 == 1302417466) {
                     throw new IllegalStateException();
                  }

                  this.field3014 = -380568527 * this.field3028;
                  this.field3037[-1967686263 * this.field3028] = 126;
               } else {
                  this.field3037[this.field3028 * -1967686263] = 0;
               }

               this.field3038[this.field3028 * -1967686263] = 0;
               this.field3039[this.field3028 * -1967686263] = var4;
               this.field3045[this.field3028 * -1967686263] = false;
               this.field3028 += -987100999;
               this.field3040 = null;
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "iq.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(JLjava/lang/String;B)V")
   @ObfuscatedName("ao")
   void method6264(long var1, String var3, byte var4) {
      try {
         if (var3 != null) {
            if (var4 == 32) {
               throw new IllegalStateException();
            }

            if (var3.isEmpty()) {
               var3 = null;
            }
         }

         boolean var10001;
         if (var1 > 0L) {
            if (var4 == 32) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         if (this.field3035 != var10001) {
            throw new RuntimeException("");
         } else {
            if (var3 != null) {
               if (var4 == 32) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            if (this.field3036 != var10001) {
               if (var4 == 32) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException("");
               }
            } else {
               label89: {
                  label99: {
                     if (var1 > 0L) {
                        if (this.field3041 == null) {
                           break label99;
                        }

                        if (var4 == 32) {
                           throw new IllegalStateException();
                        }

                        if (this.field3027 * -845393113 >= this.field3041.length) {
                           break label99;
                        }

                        if (var4 == 32) {
                           throw new IllegalStateException();
                        }
                     }

                     if (null == var3) {
                        break label89;
                     }

                     if (var4 == 32) {
                        throw new IllegalStateException();
                     }

                     if (this.field3044 != null) {
                        if (var4 == 32) {
                           throw new IllegalStateException();
                        }

                        if (-845393113 * this.field3027 < this.field3044.length) {
                           break label89;
                        }
                     }
                  }

                  method6237(this, 5 + this.field3027 * -845393113, -1348272939);
               }

               if (null != this.field3041) {
                  this.field3041[this.field3027 * -845393113] = var1;
               }

               if (this.field3044 != null) {
                  this.field3044[-845393113 * this.field3027] = var3;
               }

               this.field3027 += 1554377879;
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "iq.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("sn")
   public int method6302() {
      return this.field3028 * -1967686263;
   }

   @ObfuscatedSignature(descriptor = "(Liq;ILjava/lang/String;B)Z")
   @ObfuscatedName("ui")
   public static boolean method6293(ClanSettings var0, int var1, String var2, byte var3) {
      if (var0 == null) {
         return var0.method6296(var1, var2, var3);
      } else {
         try {
            if (null == var2) {
               var2 = "";
            } else if (var2.length() > 80) {
               var2 = var2.substring(0, 80);
            }

            if (null != var0.field3033) {
               if (var3 >= 106) {
                  throw new IllegalStateException();
               }

               Node var4 = var0.field3033.method13595(var1);
               if (var4 != null) {
                  if (var3 >= 106) {
                     throw new IllegalStateException();
                  }

                  if (var4 instanceof classVE) {
                     if (var3 >= 106) {
                        throw new IllegalStateException();
                     }

                     classVE var5 = (classVE)var4;
                     if (var5.field6498 instanceof String) {
                        if (var2.equals(var5.field6498)) {
                           return false;
                        }

                        var5.vmethod398();
                        IterableNodeHashTable.method13576(var0.field3033, new classVE(var2), var5.field6552);
                        return true;
                     }
                  }

                  var4.vmethod398();
               }
            } else {
               var0.field3033 = new IterableNodeHashTable(4);
            }

            IterableNodeHashTable.method13576(var0.field3033, new classVE(var2), var1);
            return true;
         } catch (RuntimeException var6) {
            throw classEG.newRunException(var6, "iq.ar(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("al")
   void method6268(int var1, int var2) {
      try {
         this.field3027 -= 1554377879;
         if (0 == this.field3027 * -845393113) {
            this.field3041 = null;
            this.field3044 = null;
         } else {
            if (this.field3041 != null) {
               if (var2 <= -1948715938) {
                  return;
               }

               System.arraycopy(this.field3041, var1 + 1, this.field3041, var1, this.field3027 * -845393113 - var1);
            }

            if (null != this.field3044) {
               System.arraycopy(this.field3044, var1 + 1, this.field3044, var1, -845393113 * this.field3027 - var1);
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "iq.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IBB)I")
   @ObfuscatedName("aj")
   int method6271(int var1, byte var2, byte var3) {
      try {
         if (126 != var2) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            if (var2 != 127) {
               if (var1 == this.field3014 * -577292071) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (this.field3017 * -1725108575 == -1) {
                     return -1;
                  }

                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (this.field3037[this.field3017 * -1725108575] < 125) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     return -1;
                  }
               }

               if (var2 == this.field3037[var1]) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  return -1;
               }

               this.field3037[var1] = var2;
               this.method6260(274316535);
               return var1;
            }

            if (var3 >= 0) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "iq.aj(" + 41);
      }
   }

   public ClanSettings(Buffer var1) {
      this.field3014 = -946980713;
      this.field3017 = -917140833;
      this.method6297(var1, 852263864);
   }

   @ObfuscatedSignature(descriptor = "(IIIIB)I")
   @ObfuscatedName("ad")
   int method6281(int var1, int var2, int var3, int var4, byte var5) {
      try {
         int var6 = (1 << var3) - 1;
         int var10000;
         if (31 == var4) {
            if (var5 != -1) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = (1 << var4 + 1) - 1;
         }

         int var7 = var10000;
         int var8 = var7 ^ var6;
         var2 <<= var3;
         var2 &= var8;
         int var9 = this.field3038[var1];
         if (var2 == (var9 & var8)) {
            return -1;
         } else {
            var9 &= ~var8;
            this.field3038[var1] = var9 | var2;
            return var1;
         }
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "iq.ad(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liq;IJ)Z")
   @ObfuscatedName("mz")
   public static boolean method6288(ClanSettings var0, int var1, long var2) {
      if (var0.field3033 != null) {
         Node var4 = var0.field3033.method13595(var1);
         if (var4 != null) {
            if (var4 instanceof classVK) {
               classVK var5 = (classVK)var4;
               if (var5.field6517 == var2) {
                  return false;
               }

               var5.field6517 = var2;
               return true;
            }

            var4.vmethod398();
         }
      } else {
         var0.field3033 = new IterableNodeHashTable(4);
      }

      IterableNodeHashTable.method13576(var0.field3033, new classVK(var2), var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   void method6260(int var1) {
      try {
         if (this.field3028 * -1967686263 == 0) {
            if (var1 < 289333612) {
               this.field3014 = -946980713;
               this.field3017 = -917140833;
            }
         } else {
            this.field3014 = -946980713;
            this.field3017 = -917140833;
            int var2 = 0;
            byte var3 = this.field3037[0];

            for (int var4 = 1; var4 < -1967686263 * this.field3028; var4++) {
               if (var1 >= 289333612) {
                  return;
               }

               if (this.field3037[var4] > var3) {
                  if (var1 >= 289333612) {
                     throw new IllegalStateException();
                  }

                  if (125 == var3) {
                     if (var1 >= 289333612) {
                        throw new IllegalStateException();
                     }

                     this.field3017 = 917140833 * var2;
                  }

                  var2 = var4;
                  var3 = this.field3037[var4];
               } else if (-1 == this.field3017 * -1725108575) {
                  if (var1 >= 289333612) {
                     throw new IllegalStateException();
                  }

                  if (this.field3037[var4] == 125) {
                     if (var1 >= 289333612) {
                        throw new IllegalStateException();
                     }

                     this.field3017 = var4 * 917140833;
                  }
               }
            }

            this.field3014 = var2 * 946980713;
            if (-1 != this.field3014 * -577292071) {
               if (var1 >= 289333612) {
                  throw new IllegalStateException();
               }

               this.field3037[this.field3014 * -577292071] = 126;
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "iq.aa(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liq;ILjava/lang/String;)Z")
   @ObfuscatedName("gg")
   public static boolean method6294(ClanSettings var0, int var1, String var2) {
      if (var0 == null) {
         return var0.method6295(var1, var2);
      } else {
         if (null == var2) {
            var2 = "";
         } else if (var2.length() > 80) {
            var2 = var2.substring(0, 80);
         }

         if (null != var0.field3033) {
            Node var3 = var0.field3033.method13595(var1);
            if (var3 != null) {
               if (var3 instanceof classVE) {
                  classVE var4 = (classVE)var3;
                  if (var4.field6498 instanceof String) {
                     if (var2.equals(var4.field6498)) {
                        return false;
                     }

                     var4.vmethod398();
                     IterableNodeHashTable.method13576(var0.field3033, new classVE(var2), var4.field6552);
                     return true;
                  }
               }

               var3.vmethod398();
            }
         } else {
            var0.field3033 = new IterableNodeHashTable(4);
         }

         IterableNodeHashTable.method13576(var0.field3033, new classVE(var2), var1);
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;IZI)I")
   @ObfuscatedName("ut")
   public static int method6276(ClanSettings var0, int var1, boolean var2, int var3) {
      if (var0 == null) {
         var0.method6280(var1, var2, var1);
      }

      try {
         if (var2 == var0.field3045[var1]) {
            if (var3 <= 1378918676) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            var0.field3045[var1] = var2;
            return var1;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "iq.aq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIS)Z")
   @ObfuscatedName("au")
   boolean method6285(int var1, int var2, int var3, int var4, short var5) {
      try {
         int var6 = (1 << var3) - 1;
         int var10000;
         if (31 == var4) {
            if (var5 != 16256) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = (1 << 1 + var4) - 1;
         }

         int var7 = var10000;
         int var8 = var7 ^ var6;
         var2 <<= var3;
         var2 &= var8;
         if (null != this.field3033) {
            if (var5 != 16256) {
               throw new IllegalStateException();
            }

            Node var9 = this.field3033.method13595(var1);
            if (var9 != null) {
               if (var5 != 16256) {
                  throw new IllegalStateException();
               }

               if (var9 instanceof IntegerNode) {
                  IntegerNode var10 = (IntegerNode)var9;
                  if ((var10.integer & var8) == var2) {
                     if (var5 != 16256) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  var10.integer &= ~var8;
                  var10.integer |= var2;
                  return true;
               }

               var9.vmethod398();
            }
         } else {
            this.field3033 = new IterableNodeHashTable(4);
         }

         IterableNodeHashTable.method13576(this.field3033, new IntegerNode(var2), var1);
         return true;
      } catch (RuntimeException var11) {
         throw classEG.newRunException(var11, "iq.au(" + ')');
      }
   }

   public ClanTitle titleForRank(ClanRank var1) {
      if (!classOE.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         int var2;
         switch (var1.getRank()) {
            case -1:
               var2 = -1;
               break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 106:
            case 107:
            case 108:
            case 109:
            case 111:
            case 112:
            case 113:
            case 114:
            case 116:
            case 117:
            case 118:
            case 119:
            case 121:
            case 122:
            case 123:
            default:
               var2 = this.method6301(1, 0, 9);
               break;
            case 10:
               var2 = this.method6301(1, 10, 19);
               break;
            case 20:
               var2 = this.method6301(1, 20, 29);
               break;
            case 30:
               var2 = this.method6301(2, 0, 9);
               break;
            case 40:
               var2 = this.method6301(2, 10, 19);
               break;
            case 50:
               var2 = this.method6301(2, 20, 29);
               break;
            case 60:
               var2 = this.method6301(3, 0, 9);
               break;
            case 70:
               var2 = this.method6301(3, 10, 19);
               break;
            case 80:
               var2 = this.method6301(3, 20, 29);
               break;
            case 90:
               var2 = this.method6301(4, 0, 9);
               break;
            case 95:
               var2 = this.method6301(5, 20, 29);
               break;
            case 96:
               var2 = this.method6301(102, 0, 9);
               break;
            case 97:
               var2 = this.method6301(102, 10, 19);
               break;
            case 98:
               var2 = this.method6301(102, 20, 29);
               break;
            case 99:
               var2 = this.method6301(103, 0, 9);
               break;
            case 100:
               var2 = -2;
               break;
            case 101:
               var2 = this.method6301(103, 10, 19);
               break;
            case 102:
               var2 = this.method6301(103, 20, 29);
               break;
            case 103:
               var2 = this.method6301(104, 0, 9);
               break;
            case 104:
               var2 = this.method6301(104, 10, 19);
               break;
            case 105:
               var2 = this.method6301(4, 10, 19);
               break;
            case 110:
               var2 = this.method6301(4, 20, 29);
               break;
            case 115:
               var2 = this.method6301(5, 0, 9);
               break;
            case 120:
               var2 = this.method6301(5, 10, 19);
               break;
            case 124:
               var2 = this.method6301(104, 20, 29);
               break;
            case 125:
               var2 = -3;
               break;
            case 126:
               var2 = -4;
               break;
            case 127:
               var2 = -5;
         }

         if (var2 == 1023) {
            return null;
         } else {
            EnumComposition var3 = classOE.client.method2279(3797);
            String var4 = var3.getStringValue(var2);
            return !var4.isEmpty() ? new ClanTitle(var2, var4) : null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("bz")
   boolean method6286(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = 31 == var4 ? -1 : (1 << 1 + var4) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      if (null != this.field3033) {
         Node var8 = this.field3033.method13595(var1);
         if (var8 != null) {
            if (var8 instanceof IntegerNode) {
               IntegerNode var9 = (IntegerNode)var8;
               if ((var9.integer & var7) == var2) {
                  return false;
               }

               var9.integer &= ~var7;
               var9.integer |= var2;
               return true;
            }

            var8.vmethod398();
         }
      } else {
         this.field3033 = new IterableNodeHashTable(4);
      }

      IterableNodeHashTable.method13576(this.field3033, new IntegerNode(var2), var1);
      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liq;JLjava/lang/String;)V")
   @ObfuscatedName("cq")
   public static void method6265(ClanSettings var0, long var1, String var3) {
      if (var0 == null) {
         var0.method6262();
      }

      if (var3 != null && var3.isEmpty()) {
         var3 = null;
      }

      if (var0.field3035 != var1 > 0L) {
         throw new RuntimeException("");
      } else if (var0.field3036 != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (var0.field3041 == null || var0.field3027 * -131578380 >= var0.field3041.length)
            || null != var3 && (var0.field3044 == null || -845393113 * var0.field3027 >= var0.field3044.length)) {
            method6237(var0, 5 + var0.field3027 * -845393113, -1348272939);
         }

         if (null != var0.field3041) {
            var0.field3041[var0.field3027 * 332998056] = var1;
         }

         if (var0.field3044 != null) {
            var0.field3044[-845393113 * var0.field3027] = var3;
         }

         var0.field3027 += 649056350;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("bx")
   public int method6242(int var1, int var2, int var3) {
      int var4 = -1070409994 == var3 ? -1 : (1 << var3 + 1) - 1;
      return (this.field3038[var1] & var4) >>> var2;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   void method6234(int var1) {
      if (this.field3035) {
         if (this.field3042 != null) {
            System.arraycopy(this.field3042, 0, this.field3042 = new long[var1], 0, this.field3028 * -1967686263);
         } else {
            this.field3042 = new long[var1];
         }
      }

      if (this.field3036) {
         if (this.field3043 != null) {
            System.arraycopy(this.field3043, 0, this.field3043 = new String[var1], 0, -1967686263 * this.field3028);
         } else {
            this.field3043 = new String[var1];
         }
      }

      if (null != this.field3037) {
         System.arraycopy(this.field3037, 0, this.field3037 = new byte[var1], 0, -1967686263 * this.field3028);
      } else {
         this.field3037 = new byte[var1];
      }

      if (this.field3038 != null) {
         System.arraycopy(this.field3038, 0, this.field3038 = new int[var1], 0, this.field3028 * -1967686263);
      } else {
         this.field3038 = new int[var1];
      }

      if (this.field3039 != null) {
         System.arraycopy(this.field3039, 0, this.field3039 = new int[var1], 0, this.field3028 * -1967686263);
      } else {
         this.field3039 = new int[var1];
      }

      if (null != this.field3045) {
         System.arraycopy(this.field3045, 0, this.field3045 = new boolean[var1], 0, this.field3028 * -1967686263);
      } else {
         this.field3045 = new boolean[var1];
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   void method6235(int var1) {
      if (this.field3035) {
         if (this.field3042 != null) {
            System.arraycopy(this.field3042, 0, this.field3042 = new long[var1], 0, this.field3028 * -1967686263);
         } else {
            this.field3042 = new long[var1];
         }
      }

      if (this.field3036) {
         if (this.field3043 != null) {
            System.arraycopy(this.field3043, 0, this.field3043 = new String[var1], 0, -1967686263 * this.field3028);
         } else {
            this.field3043 = new String[var1];
         }
      }

      if (null != this.field3037) {
         System.arraycopy(this.field3037, 0, this.field3037 = new byte[var1], 0, -1967686263 * this.field3028);
      } else {
         this.field3037 = new byte[var1];
      }

      if (this.field3038 != null) {
         System.arraycopy(this.field3038, 0, this.field3038 = new int[var1], 0, this.field3028 * -1967686263);
      } else {
         this.field3038 = new int[var1];
      }

      if (this.field3039 != null) {
         System.arraycopy(this.field3039, 0, this.field3039 = new int[var1], 0, this.field3028 * -1967686263);
      } else {
         this.field3039 = new int[var1];
      }

      if (null != this.field3045) {
         System.arraycopy(this.field3045, 0, this.field3045 = new boolean[var1], 0, this.field3028 * -1967686263);
      } else {
         this.field3045 = new boolean[var1];
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[I")
   @ObfuscatedName("as")
   public int[] method6249(byte var1) {
      try {
         if (this.field3040 == null) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            String[] var2 = new String[-1967686263 * this.field3028];
            this.field3040 = new int[-1967686263 * this.field3028];

            for (int var3 = 0; var3 < this.field3028 * -1967686263; this.field3040[var3] = var3++) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               var2[var3] = this.field3043[var3];
               if (var2[var3] != null) {
                  if (var1 >= 1) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = var2[var3].toLowerCase();
               }
            }

            classUO.method11413(var2, this.field3040, 481421932);
         }

         return this.field3040;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "iq.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("am")
   public int method6238(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         for (int var2 = 0; var2 < -1967686263 * this.field3028; var2++) {
            if (this.field3043[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("ah")
   public int method6239(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         for (int var2 = 0; var2 < -1967686263 * this.field3028; var2++) {
            if (this.field3043[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("an")
   public int method6240(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         for (int var2 = 0; var2 < -1967686263 * this.field3028; var2++) {
            if (this.field3043[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("bc")
   public int method6243(int var1, int var2, int var3) {
      int var4 = 31 == var3 ? -1 : (1 << var3 + 1) - 1;
      return (this.field3038[var1] & var4) >>> var2;
   }

   @ObfuscatedSignature(descriptor = "(Liq;II)V")
   @ObfuscatedName("bc")
   public static void method6237(ClanSettings var0, int var1, int var2) {
      if (var0 == null) {
         var0.method6257(var1, var1);
      } else {
         try {
            if (var0.field3035) {
               if (var2 != -1348272939) {
                  throw new IllegalStateException();
               }

               if (null != var0.field3041) {
                  System.arraycopy(var0.field3041, 0, var0.field3041 = new long[var1], 0, -845393113 * var0.field3027);
               } else {
                  var0.field3041 = new long[var1];
               }
            }

            if (var0.field3036) {
               if (var2 != -1348272939) {
                  throw new IllegalStateException();
               }

               if (null != var0.field3044) {
                  if (var2 != -1348272939) {
                     throw new IllegalStateException();
                  }

                  System.arraycopy(var0.field3044, 0, var0.field3044 = new String[var1], 0, -845393113 * var0.field3027);
               } else {
                  var0.field3044 = new String[var1];
               }
            }
         } catch (RuntimeException var3) {
            throw classEG.newRunException(var3, "iq.af(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   void method6261() {
      if (this.field3028 * -1379492733 == 0) {
         this.field3014 = 775776988;
         this.field3017 = -917140833;
      } else {
         this.field3014 = -946980713;
         this.field3017 = -1181398211;
         int var1 = 0;
         byte var2 = this.field3037[0];

         for (int var3 = 1; var3 < -1967686263 * this.field3028; var3++) {
            if (this.field3037[var3] > var2) {
               if (360473302 == var2) {
                  this.field3017 = 982414571 * var1;
               }

               var1 = var3;
               var2 = this.field3037[var3];
            } else if (-1 == this.field3017 * -1725108575 && this.field3037[var3] == -1353983553) {
               this.field3017 = var3 * 517526604;
            }
         }

         this.field3014 = var1 * 946980713;
         if (-1 != this.field3014 * -577292071) {
            this.field3037[this.field3014 * -577292071] = 126;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Integer;")
   @ObfuscatedName("fx")
   public Integer method6246(int var1) {
      if (null == this.field3033) {
         return null;
      } else {
         Node var2 = this.field3033.method13595(var1);
         return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bw")
   void method6262() {
      if (this.field3028 * -1967686263 == 0) {
         this.field3014 = -946980713;
         this.field3017 = -917140833;
      } else {
         this.field3014 = -946980713;
         this.field3017 = -917140833;
         int var1 = 0;
         byte var2 = this.field3037[0];

         for (int var3 = 1; var3 < -1967686263 * this.field3028; var3++) {
            if (this.field3037[var3] > var2) {
               if (125 == var2) {
                  this.field3017 = 917140833 * var1;
               }

               var1 = var3;
               var2 = this.field3037[var3];
            } else if (-1 == this.field3017 * -1725108575 && this.field3037[var3] == 125) {
               this.field3017 = var3 * 917140833;
            }
         }

         this.field3014 = var1 * 946980713;
         if (-1 != this.field3014 * -577292071) {
            this.field3037[this.field3014 * -577292071] = 126;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bt")
   public int[] method6250() {
      if (this.field3040 == null) {
         String[] var1 = new String[-1967686263 * this.field3028];
         this.field3040 = new int[-1967686263 * this.field3028];

         for (int var2 = 0; var2 < this.field3028 * 1416420770; this.field3040[var2] = var2++) {
            var1[var2] = this.field3043[var2];
            if (var1[var2] != null) {
               var1[var2] = var1[var2].toLowerCase();
            }
         }

         classUO.method11413(var1, this.field3040, 99957133);
      }

      return this.field3040;
   }

   @ObfuscatedSignature(descriptor = "(JLjava/lang/String;I)V")
   @ObfuscatedName("bg")
   void method6253(long var1, String var3, int var4) {
      if (var3 != null && var3.isEmpty()) {
         var3 = null;
      }

      if (this.field3035 != var1 > 0L) {
         throw new RuntimeException("");
      } else if (this.field3036 != (null != var3)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.field3042 == null || this.field3028 * -1967686263 >= this.field3042.length)
            || null != var3 && (null == this.field3043 || this.field3028 * -1967686263 >= this.field3043.length)) {
            this.method6236(-1967686263 * this.field3028 + 5, 1440752857);
         }

         if (this.field3042 != null) {
            this.field3042[-1967686263 * this.field3028] = var1;
         }

         if (null != this.field3043) {
            this.field3043[this.field3028 * -1967686263] = var3;
         }

         if (-1 == this.field3014 * -577292071) {
            this.field3014 = -380568527 * this.field3028;
            this.field3037[-1967686263 * this.field3028] = 126;
         } else {
            this.field3037[this.field3028 * -1967686263] = 0;
         }

         this.field3038[this.field3028 * -1967686263] = 0;
         this.field3039[this.field3028 * -1967686263] = var4;
         this.field3045[this.field3028 * -1967686263] = false;
         this.field3028 += -987100999;
         this.field3040 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bj")
   void method6254(int var1) {
      if (var1 >= 0 && var1 < -1967686263 * this.field3028) {
         this.field3028 -= -987100999;
         this.field3040 = null;
         if (0 == this.field3028 * -1967686263) {
            this.field3042 = null;
            this.field3043 = null;
            this.field3037 = null;
            this.field3038 = null;
            this.field3039 = null;
            this.field3045 = null;
            this.field3014 = -946980713;
            this.field3017 = -917140833;
         } else {
            System.arraycopy(this.field3037, var1 + 1, this.field3037, var1, this.field3028 * -1967686263 - var1);
            System.arraycopy(this.field3038, var1 + 1, this.field3038, var1, this.field3028 * -1967686263 - var1);
            System.arraycopy(this.field3039, 1 + var1, this.field3039, var1, this.field3028 * -1967686263 - var1);
            System.arraycopy(this.field3045, var1 + 1, this.field3045, var1, -1967686263 * this.field3028 - var1);
            if (null != this.field3042) {
               System.arraycopy(this.field3042, var1 + 1, this.field3042, var1, this.field3028 * -1967686263 - var1);
            }

            if (this.field3043 != null) {
               System.arraycopy(this.field3043, var1 + 1, this.field3043, var1, this.field3028 * -1967686263 - var1);
            }

            this.method6260(178035997);
         }
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("js")
   public byte[] method6303() {
      return this.field3037;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liq;IZ)I")
   @ObfuscatedName("md")
   public static int method6277(ClanSettings var0, int var1, boolean var2) {
      if (var2 == var0.field3045[var1]) {
         return -1;
      } else {
         var0.field3045[var1] = var2;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liq;IJ)Z")
   @ObfuscatedName("at")
   public static boolean method6289(ClanSettings var0, int var1, long var2) {
      if (var0.field3033 != null) {
         Node var4 = var0.field3033.method13595(var1);
         if (var4 != null) {
            if (var4 instanceof classVK) {
               classVK var5 = (classVK)var4;
               if (var5.field6517 == var2) {
                  return false;
               }

               var5.field6517 = var2;
               return true;
            }

            var4.vmethod398();
         }
      } else {
         var0.field3033 = new IterableNodeHashTable(4);
      }

      IterableNodeHashTable.method13576(var0.field3033, new classVK(var2), var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("xi")
   public int[] method6304() {
      return this.method6249((byte)-64);
   }

   @ObfuscatedSignature(descriptor = "(Liq;II)V")
   @ObfuscatedName("vf")
   public static void method6255(ClanSettings var0, int var1, int var2) {
      if (var0 == null) {
         var0.method6258(var1, var1);
      }

      try {
         if (var1 >= 0) {
            if (var1 < -1967686263 * var0.field3028) {
               var0.field3028 -= -987100999;
               var0.field3040 = null;
               if (0 == var0.field3028 * -1967686263) {
                  if (var2 == -549112886) {
                     throw new IllegalStateException();
                  }

                  var0.field3042 = null;
                  var0.field3043 = null;
                  var0.field3037 = null;
                  var0.field3038 = null;
                  var0.field3039 = null;
                  var0.field3045 = null;
                  var0.field3014 = -946980713;
                  var0.field3017 = -917140833;
               } else {
                  System.arraycopy(var0.field3037, var1 + 1, var0.field3037, var1, var0.field3028 * -1967686263 - var1);
                  System.arraycopy(var0.field3038, var1 + 1, var0.field3038, var1, var0.field3028 * -1967686263 - var1);
                  System.arraycopy(var0.field3039, 1 + var1, var0.field3039, var1, var0.field3028 * -1967686263 - var1);
                  System.arraycopy(var0.field3045, var1 + 1, var0.field3045, var1, -1967686263 * var0.field3028 - var1);
                  if (null != var0.field3042) {
                     if (var2 == -549112886) {
                        return;
                     }

                     System.arraycopy(var0.field3042, var1 + 1, var0.field3042, var1, var0.field3028 * -1967686263 - var1);
                  }

                  if (var0.field3043 != null) {
                     if (var2 == -549112886) {
                        throw new IllegalStateException();
                     }

                     System.arraycopy(var0.field3043, var1 + 1, var0.field3043, var1, var0.field3028 * -1967686263 - var1);
                  }

                  var0.method6260(-286379203);
               }

               return;
            }

            if (var2 == -549112886) {
               return;
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "iq.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bk")
   void method6256(int var1) {
      if (var1 >= 0 && var1 < -1967686263 * this.field3028) {
         this.field3028 -= -20073127;
         this.field3040 = null;
         if (0 == this.field3028 * -978264140) {
            this.field3042 = null;
            this.field3043 = null;
            this.field3037 = null;
            this.field3038 = null;
            this.field3039 = null;
            this.field3045 = null;
            this.field3014 = -946980713;
            this.field3017 = -1543239170;
         } else {
            System.arraycopy(this.field3037, var1 + 1, this.field3037, var1, this.field3028 * 1787375351 - var1);
            System.arraycopy(this.field3038, var1 + 1, this.field3038, var1, this.field3028 * -1504307712 - var1);
            System.arraycopy(this.field3039, 1 + var1, this.field3039, var1, this.field3028 * -1967686263 - var1);
            System.arraycopy(this.field3045, var1 + 1, this.field3045, var1, -1967686263 * this.field3028 - var1);
            if (null != this.field3042) {
               System.arraycopy(this.field3042, var1 + 1, this.field3042, var1, this.field3028 * -1967686263 - var1);
            }

            if (this.field3043 != null) {
               System.arraycopy(this.field3043, var1 + 1, this.field3043, var1, this.field3028 * -1967686263 - var1);
            }

            this.method6260(104683310);
         }
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bu")
   void method6263() {
      if (this.field3028 * -1967686263 == 0) {
         this.field3014 = -946980713;
         this.field3017 = -917140833;
      } else {
         this.field3014 = -946980713;
         this.field3017 = -917140833;
         int var1 = 0;
         byte var2 = this.field3037[0];

         for (int var3 = 1; var3 < -1967686263 * this.field3028; var3++) {
            if (this.field3037[var3] > var2) {
               if (125 == var2) {
                  this.field3017 = 917140833 * var1;
               }

               var1 = var3;
               var2 = this.field3037[var3];
            } else if (-1 == this.field3017 * -1725108575 && this.field3037[var3] == 125) {
               this.field3017 = var3 * 917140833;
            }
         }

         this.field3014 = var1 * 946980713;
         if (-1 != this.field3014 * -577292071) {
            this.field3037[this.field3014 * -577292071] = 126;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("bq")
   int method6272(int var1, byte var2) {
      if (126 != var2 && var2 != -1498167495) {
         if (var1 != this.field3014 * -577292071 || this.field3017 * -1725108575 != -1 && this.field3037[this.field3017 * -1725108575] >= 916590868) {
            if (var2 == this.field3037[var1]) {
               return -1;
            } else {
               this.field3037[var1] = var2;
               this.method6260(-2015695094);
               return var1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ay")
   boolean method6274(int var1, int var2) {
      try {
         if (var1 != -577292071 * this.field3014) {
            if (var2 != -1083013539) {
               throw new IllegalStateException();
            }

            if (this.field3037[var1] != 126) {
               this.field3037[-577292071 * this.field3014] = 125;
               this.field3017 = -1721649351 * this.field3014;
               this.field3037[var1] = 126;
               this.field3014 = 946980713 * var1;
               return true;
            }

            if (var2 != -1083013539) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "iq.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("pl")
   public int method6301(int var1, int var2, int var3) {
      Integer var4 = this.method6305(var1);
      int var5 = var4 == null ? -1 : var4;
      int var6 = 31 - var3;
      return var5 << var6 >>> var2 + var6;
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("bf")
   int method6273(int var1, byte var2) {
      if (126 != var2 && var2 != 127) {
         if (var1 != this.field3014 * -577292071 || this.field3017 * -1725108575 != -1 && this.field3037[this.field3017 * -1725108575] >= 125) {
            if (var2 == this.field3037[var1]) {
               return -1;
            } else {
               this.field3037[var1] = var2;
               this.method6260(-172096256);
               return var1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;IIII)I")
   @ObfuscatedName("nm")
   public static int method6244(ClanSettings var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         return var0.method6245(var1, var1, var1, var1);
      } else {
         try {
            int var5 = 31 == var3 ? -1 : (1 << var3 + 1) - 1;
            return (var0.field3038[var1] & var5) >>> var2;
         } catch (RuntimeException var6) {
            throw classEG.newRunException(var6, "iq.ab(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(JLjava/lang/String;)V")
   @ObfuscatedName("bi")
   void method6266(long var1, String var3) {
      if (var3 != null && var3.isEmpty()) {
         var3 = null;
      }

      if (this.field3035 != var1 > 0L) {
         throw new RuntimeException("");
      } else if (this.field3036 != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.field3041 == null || this.field3027 * -845393113 >= this.field3041.length)
            || null != var3 && (this.field3044 == null || 889087089 * this.field3027 >= this.field3044.length)) {
            method6237(this, 5 + this.field3027 * -1499856537, -1348272939);
         }

         if (null != this.field3041) {
            this.field3041[this.field3027 * -1345575636] = var1;
         }

         if (this.field3044 != null) {
            this.field3044[1180734584 * this.field3027] = var3;
         }

         this.field3027 += 1554377879;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Integer;")
   @ObfuscatedName("bp")
   public Integer method6305(int var1) {
      return this.method6247(var1, (byte)75);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("by")
   void method6269(int var1) {
      this.field3027 -= -1466794044;
      if (0 == this.field3027 * -845393113) {
         this.field3041 = null;
         this.field3044 = null;
      } else {
         if (this.field3041 != null) {
            System.arraycopy(this.field3041, var1 + 1, this.field3041, var1, this.field3027 * -1346258179 - var1);
         }

         if (null != this.field3044) {
            System.arraycopy(this.field3044, var1 + 1, this.field3044, var1, 1085234865 * this.field3027 - var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Ljava/lang/Integer;")
   @ObfuscatedName("ag")
   public Integer method6247(int var1, byte var2) {
      try {
         if (null == this.field3033) {
            return null;
         } else {
            Node var3 = this.field3033.method13595(var1);
            if (var3 != null) {
               if (var2 != 75) {
                  throw new IllegalStateException();
               }

               if (var3 instanceof IntegerNode) {
                  return new Integer(((IntegerNode)var3).integer);
               }

               if (var2 != 75) {
                  throw new IllegalStateException();
               }
            }

            return null;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "iq.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;IIS)Z")
   @ObfuscatedName("rw")
   public static boolean method6282(ClanSettings var0, int var1, int var2, short var3) {
      if (var0 == null) {
         var0.method6283(var1, var1, var3);
      }

      try {
         if (null != var0.field3033) {
            if (var3 == 1000) {
               throw new IllegalStateException();
            }

            Node var4 = var0.field3033.method13595(var1);
            if (null != var4) {
               if (var3 == 1000) {
                  throw new IllegalStateException();
               }

               if (var4 instanceof IntegerNode) {
                  if (var3 == 1000) {
                     throw new IllegalStateException();
                  }

                  IntegerNode var5 = (IntegerNode)var4;
                  if (var2 == var5.integer) {
                     if (var3 == 1000) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  var5.integer = var2;
                  return true;
               }

               var4.vmethod398();
            }
         } else {
            var0.field3033 = new IterableNodeHashTable(4);
         }

         IterableNodeHashTable.method13576(var0.field3033, new IntegerNode(var2), var1);
         return true;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "iq.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("cv")
   void method6298(Buffer var1) {
      int var2 = Buffer.method13039(var1, -346779531);
      if (var2 >= 1 && var2 <= 6) {
         int var3 = Buffer.method13039(var1, -346779531);
         if (0 != (var3 & 1)) {
            this.field3035 = true;
         }

         if (0 != (var3 & 2)) {
            this.field3036 = true;
         }

         if (!this.field3035) {
            this.field3042 = null;
            this.field3041 = null;
         }

         if (!this.field3036) {
            this.field3043 = null;
            this.field3044 = null;
         }

         this.field3013 = var1.method13056((byte)1) * -1766455193;
         this.field3015 = var1.method13056((byte)1) * 447663005;
         if (var2 <= 3 && 0 != -1951591755 * this.field3015) {
            this.field3015 += 2097065760;
         }

         this.field3028 = Buffer.method13047(var1, 1085925872) * -987100999;
         this.field3027 = Buffer.method13039(var1, -346779531) * 1554377879;
         this.field3016 = var1.method13071(982630138);
         if (var2 >= 4) {
            var1.method13056((byte)1);
         }

         this.field3034 = Buffer.method13039(var1, -346779531) == 1;
         this.field3023 = Buffer.method13043(var1, (byte)17);
         this.field3025 = Buffer.method13043(var1, (byte)17);
         this.field3024 = Buffer.method13043(var1, (byte)17);
         this.field3019 = Buffer.method13043(var1, (byte)17);
         if (this.field3028 * -1967686263 > 0) {
            if (this.field3035 && (null == this.field3042 || this.field3042.length < this.field3028 * -1967686263)) {
               this.field3042 = new long[-1967686263 * this.field3028];
            }

            if (this.field3036 && (null == this.field3043 || this.field3043.length < -1967686263 * this.field3028)) {
               this.field3043 = new String[this.field3028 * -1967686263];
            }

            if (this.field3037 == null || this.field3037.length < this.field3028 * -1967686263) {
               this.field3037 = new byte[this.field3028 * -1967686263];
            }

            if (null == this.field3038 || this.field3038.length < -1967686263 * this.field3028) {
               this.field3038 = new int[-1967686263 * this.field3028];
            }

            if (null == this.field3039 || this.field3039.length < this.field3028 * -1967686263) {
               this.field3039 = new int[-1967686263 * this.field3028];
            }

            if (this.field3045 == null || this.field3045.length < -1967686263 * this.field3028) {
               this.field3045 = new boolean[-1967686263 * this.field3028];
            }

            for (int var4 = 0; var4 < this.field3028 * -1967686263; var4++) {
               if (this.field3035) {
                  this.field3042[var4] = var1.method13059(885075618);
               }

               if (this.field3036) {
                  this.field3043[var4] = var1.method13069((byte)-11);
               }

               this.field3037[var4] = Buffer.method13043(var1, (byte)17);
               if (var2 >= 2) {
                  this.field3038[var4] = var1.method13056((byte)1);
               }

               if (var2 >= 5) {
                  this.field3039[var4] = Buffer.method13047(var1, -384456557);
               } else {
                  this.field3039[var4] = 0;
               }

               if (var2 >= 6) {
                  this.field3045[var4] = Buffer.method13039(var1, -346779531) == 1;
               } else {
                  this.field3045[var4] = false;
               }
            }

            this.method6260(-1683694069);
         }

         if (this.field3027 * -845393113 > 0) {
            if (this.field3035 && (null == this.field3041 || this.field3041.length < -845393113 * this.field3027)) {
               this.field3041 = new long[-845393113 * this.field3027];
            }

            if (this.field3036 && (this.field3044 == null || this.field3044.length < this.field3027 * -845393113)) {
               this.field3044 = new String[this.field3027 * -845393113];
            }

            for (int var10 = 0; var10 < -845393113 * this.field3027; var10++) {
               if (this.field3035) {
                  this.field3041[var10] = var1.method13059(-1480563965);
               }

               if (this.field3036) {
                  this.field3044[var10] = var1.method13069((byte)77);
               }
            }
         }

         if (var2 >= 3) {
            int var11 = Buffer.method13047(var1, 907409062);
            if (var11 > 0) {
               this.field3033 = new IterableNodeHashTable(var11 < 16 ? classBZ.method1385(var11, -1573601361) : 16);

               while (var11-- > 0) {
                  int var5 = var1.method13056((byte)1);
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if (var7 == 0) {
                     int var8 = var1.method13056((byte)1);
                     IterableNodeHashTable.method13576(this.field3033, new IntegerNode(var8), var6);
                  } else if (var7 == 1) {
                     long var12 = var1.method13059(2090571963);
                     IterableNodeHashTable.method13576(this.field3033, new classVK(var12), var6);
                  } else if (2 == var7) {
                     String var13 = var1.method13071(-986049037);
                     IterableNodeHashTable.method13576(this.field3033, new classVE(var13), var6);
                  }
               }
            }
         }
      } else {
         throw new RuntimeException("" + var2);
      }
   }

   public List getMembers() {
      int var1 = this.method6302();
      ArrayList var2 = new ArrayList(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         var2.add(new rl1(this, var3));
      }

      return var2;
   }

   public String getName() {
      return this.field3016;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liq;)[I")
   @ObfuscatedName("du")
   public static int[] method6251(ClanSettings var0) {
      if (var0 == null) {
         var0.getName();
      }

      if (var0.field3040 == null) {
         String[] var1 = new String[-1967686263 * var0.field3028];
         var0.field3040 = new int[-1967686263 * var0.field3028];

         for (int var2 = 0; var2 < var0.field3028 * -1967686263; var0.field3040[var2] = var2++) {
            var1[var2] = var0.field3043[var2];
            if (var1[var2] != null) {
               var1[var2] = var1[var2].toLowerCase();
            }
         }

         classUO.method11413(var1, var0.field3040, 2140825942);
      }

      return var0.field3040;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bd")
   boolean method6275(int var1) {
      if (var1 != -577292071 * this.field3014 && this.field3037[var1] != 126) {
         this.field3037[-577292071 * this.field3014] = 125;
         this.field3017 = -1721649351 * this.field3014;
         this.field3037[var1] = 126;
         this.field3014 = 946980713 * var1;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(IZ)I")
   @ObfuscatedName("bv")
   int method6278(int var1, boolean var2) {
      if (var2 == this.field3045[var1]) {
         return -1;
      } else {
         this.field3045[var1] = var2;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(IZ)I")
   @ObfuscatedName("bh")
   int method6279(int var1, boolean var2) {
      if (var2 == this.field3045[var1]) {
         return -1;
      } else {
         this.field3045[var1] = var2;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liq;JLjava/lang/String;)V")
   @ObfuscatedName("km")
   public static void method6267(ClanSettings var0, long var1, String var3) {
      if (var0 == null) {
         var0.method6261();
      }

      if (var3 != null && var3.isEmpty()) {
         var3 = null;
      }

      if (var0.field3035 != var1 > 0L) {
         throw new RuntimeException("");
      } else if (var0.field3036 != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (var0.field3041 == null || var0.field3027 * -845393113 >= var0.field3041.length)
            || null != var3 && (var0.field3044 == null || -845393113 * var0.field3027 >= var0.field3044.length)) {
            method6237(var0, 5 + var0.field3027 * -845393113, -1348272939);
         }

         if (null != var0.field3041) {
            var0.field3041[var0.field3027 * -845393113] = var1;
         }

         if (var0.field3044 != null) {
            var0.field3044[-845393113 * var0.field3027] = var3;
         }

         var0.field3027 += 1554377879;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("az")
   void method6236(int var1, int var2) {
      try {
         if (this.field3035) {
            if (var2 <= -486845133) {
               return;
            }

            if (this.field3042 != null) {
               if (var2 <= -486845133) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.field3042, 0, this.field3042 = new long[var1], 0, this.field3028 * -1967686263);
            } else {
               this.field3042 = new long[var1];
            }
         }

         if (this.field3036) {
            if (var2 <= -486845133) {
               throw new IllegalStateException();
            }

            if (this.field3043 != null) {
               if (var2 <= -486845133) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.field3043, 0, this.field3043 = new String[var1], 0, -1967686263 * this.field3028);
            } else {
               this.field3043 = new String[var1];
            }
         }

         if (null != this.field3037) {
            if (var2 <= -486845133) {
               throw new IllegalStateException();
            }

            System.arraycopy(this.field3037, 0, this.field3037 = new byte[var1], 0, -1967686263 * this.field3028);
         } else {
            this.field3037 = new byte[var1];
         }

         if (this.field3038 != null) {
            if (var2 <= -486845133) {
               return;
            }

            System.arraycopy(this.field3038, 0, this.field3038 = new int[var1], 0, this.field3028 * -1967686263);
         } else {
            this.field3038 = new int[var1];
         }

         if (this.field3039 != null) {
            System.arraycopy(this.field3039, 0, this.field3039 = new int[var1], 0, this.field3028 * -1967686263);
         } else {
            this.field3039 = new int[var1];
         }

         if (null != this.field3045) {
            if (var2 <= -486845133) {
               throw new IllegalStateException();
            }

            System.arraycopy(this.field3045, 0, this.field3045 = new boolean[var1], 0, this.field3028 * -1967686263);
         } else {
            this.field3045 = new boolean[var1];
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "iq.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IJ)Z")
   @ObfuscatedName("cb")
   boolean method6290(int var1, long var2) {
      if (this.field3033 != null) {
         Node var4 = this.field3033.method13595(var1);
         if (var4 != null) {
            if (var4 instanceof classVK) {
               classVK var5 = (classVK)var4;
               if (var5.field6517 == var2) {
                  return false;
               }

               var5.field6517 = var2;
               return true;
            }

            var4.vmethod398();
         }
      } else {
         this.field3033 = new IterableNodeHashTable(4);
      }

      IterableNodeHashTable.method13576(this.field3033, new classVK(var2), var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(IJ)Z")
   @ObfuscatedName("cp")
   boolean method6291(int var1, long var2) {
      if (this.field3033 != null) {
         Node var4 = this.field3033.method13595(var1);
         if (var4 != null) {
            if (var4 instanceof classVK) {
               classVK var5 = (classVK)var4;
               if (var5.field6517 == var2) {
                  return false;
               }

               var5.field6517 = var2;
               return true;
            }

            var4.vmethod398();
         }
      } else {
         this.field3033 = new IterableNodeHashTable(4);
      }

      IterableNodeHashTable.method13576(this.field3033, new classVK(var2), var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Z")
   @ObfuscatedName("cd")
   boolean method6295(int var1, String var2) {
      if (null == var2) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (null != this.field3033) {
         Node var3 = this.field3033.method13595(var1);
         if (var3 != null) {
            if (var3 instanceof classVE) {
               classVE var4 = (classVE)var3;
               if (var4.field6498 instanceof String) {
                  if (var2.equals(var4.field6498)) {
                     return false;
                  }

                  var4.vmethod398();
                  IterableNodeHashTable.method13576(this.field3033, new classVE(var2), var4.field6552);
                  return true;
               }
            }

            var3.vmethod398();
         }
      } else {
         this.field3033 = new IterableNodeHashTable(4);
      }

      IterableNodeHashTable.method13576(this.field3033, new classVE(var2), var1);
      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Liq;I)Ljava/lang/Integer;")
   @ObfuscatedName("eu")
   public static Integer method6248(ClanSettings var0, int var1) {
      if (null == var0.field3033) {
         return null;
      } else {
         Node var2 = var0.field3033.method13595(var1);
         return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("af")
   void method6257(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var1 < -1967686263 * this.field3014) {
               this.field3028 = this.field3027 - -987100999;
               this.field3040 = null;
               if (0 == this.field3014 * -1967686263) {
                  if (var2 == -549112886) {
                     throw new IllegalStateException();
                  }

                  this.field3042 = null;
                  this.field3043 = null;
                  this.field3037 = null;
                  this.field3040 = null;
                  this.field3039 = null;
                  this.field3045 = null;
                  this.field3014 = -946980713;
                  this.field3013 = -917140833;
               } else {
                  System.arraycopy(this.field3037, var1 + 1, this.field3037, var1, this.field3014 * -1967686263 - var1);
                  System.arraycopy(this.field3038, var1 + 1, this.field3040, var1, this.field3013 * -1967686263 - var1);
                  System.arraycopy(this.field3039, 1 + var1, this.field3039, var1, this.field3017 * -1967686263 - var1);
                  System.arraycopy(this.field3045, var1 + 1, this.field3045, var1, -1967686263 * this.field3014 - var1);
                  if (null != this.field3041) {
                     if (var2 == -549112886) {
                        return;
                     }

                     System.arraycopy(this.field3042, var1 + 1, this.field3042, var1, this.field3013 * -1967686263 - var1);
                  }

                  if (this.field3043 != null) {
                     if (var2 == -549112886) {
                        throw new IllegalStateException();
                     }

                     System.arraycopy(this.field3043, var1 + 1, this.field3043, var1, this.field3014 * -1967686263 - var1);
                  }

                  this.method6254(-286379203);
               }

               return;
            }

            if (var2 == -549112886) {
               return;
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "iq.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ac")
   void method6258(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var1 < -1967686263 * this.field3027) {
               this.field3014 = this.field3013 - -987100999;
               this.field3038 = null;
               if (0 == this.field3014 * -1967686263) {
                  if (var2 == -549112886) {
                     throw new IllegalStateException();
                  }

                  this.field3042 = null;
                  this.field3043 = null;
                  this.field3037 = null;
                  this.field3038 = null;
                  this.field3039 = null;
                  this.field3045 = null;
                  this.field3013 = -946980713;
                  this.field3028 = -917140833;
               } else {
                  System.arraycopy(this.field3037, var1 + 1, this.field3037, var1, this.field3027 * -1967686263 - var1);
                  System.arraycopy(this.field3040, var1 + 1, this.field3040, var1, this.field3017 * -1967686263 - var1);
                  System.arraycopy(this.field3039, 1 + var1, this.field3039, var1, this.field3017 * -1967686263 - var1);
                  System.arraycopy(this.field3045, var1 + 1, this.field3045, var1, -1967686263 * this.field3028 - var1);
                  if (null != this.field3042) {
                     if (var2 == -549112886) {
                        return;
                     }

                     System.arraycopy(this.field3041, var1 + 1, this.field3042, var1, this.field3028 * -1967686263 - var1);
                  }

                  if (this.field3043 != null) {
                     if (var2 == -549112886) {
                        throw new IllegalStateException();
                     }

                     System.arraycopy(this.field3044, var1 + 1, this.field3043, var1, this.field3014 * -1967686263 - var1);
                  }

                  this.method6233(-286379203);
               }

               return;
            }

            if (var2 == -549112886) {
               return;
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "iq.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIS)Z")
   @ObfuscatedName("ap")
   boolean method6283(int var1, int var2, short var3) {
      try {
         if (null != this.field3033) {
            if (var3 == 1000) {
               throw new IllegalStateException();
            }

            Node var4 = this.field3033.method13570(var1);
            if (null != var4) {
               if (var3 == 1000) {
                  throw new IllegalStateException();
               }

               if (var4 instanceof IntegerNode) {
                  if (var3 == 1000) {
                     throw new IllegalStateException();
                  }

                  IntegerNode var5 = (IntegerNode)var4;
                  if (var2 == var5.integer) {
                     if (var3 == 1000) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  var5.integer = var2;
                  return true;
               }

               var4.vmethod399();
            }
         } else {
            this.field3033 = new IterableNodeHashTable(4);
         }

         IterableNodeHashTable.method13576(this.field3033, new IntegerNode(var2), var1);
         return true;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "iq.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("aw")
   public String[] method6306() {
      return this.field3043;
   }

   @ObfuscatedSignature(descriptor = "(IZI)I")
   @ObfuscatedName("aq")
   int method6280(int var1, boolean var2, int var3) {
      try {
         if (var2 == this.field3045[var1]) {
            if (var3 <= 1378918676) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            this.field3045[var1] = var2;
            return var1;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "iq.aq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;B)Z")
   @ObfuscatedName("ar")
   boolean method6296(int var1, String var2, byte var3) {
      try {
         if (null == var2) {
            var2 = "";
         } else if (var2.length() > 80) {
            var2 = var2.substring(0, 80);
         }

         if (null != this.field3033) {
            if (var3 >= 106) {
               throw new IllegalStateException();
            }

            Node var4 = this.field3033.method13571(var1);
            if (var4 != null) {
               if (var3 >= 106) {
                  throw new IllegalStateException();
               }

               if (var4 instanceof classVE) {
                  if (var3 >= 106) {
                     throw new IllegalStateException();
                  }

                  classVE var5 = (classVE)var4;
                  if (var5.field6498 instanceof String) {
                     if (var2.equals(var5.field6498)) {
                        return false;
                     }

                     var5.method12065();
                     IterableNodeHashTable.method13576(this.field3033, new classVE(var2), var5.field6552);
                     return true;
                  }
               }

               var4.vmethod387();
            }
         } else {
            this.field3033 = new IterableNodeHashTable(4);
         }

         IterableNodeHashTable.method13576(this.field3033, new classVE(var2), var1);
         return true;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "iq.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("ae")
   public int method6300(String var1, int var2) {
      return this.method6240(var1);
   }

   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("ab")
   public int method6245(int var1, int var2, int var3, int var4) {
      try {
         int var5 = 31 == var3 ? -1 : (1 << var3 + 1) - 1;
         return (this.field3040[var1] & var5) >>> var2;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "iq.ab(" + 41);
      }
   }
}
