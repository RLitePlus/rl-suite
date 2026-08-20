import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.json.JSONObject;

@ObfuscatedName("ix")
public class class225 {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field2767 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field2770 = 6;
   @ObfuscatedName("ai")
   String field2763;
   @ObfuscatedName("ad")
   String field2759;
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ay")
   class234 field2764;
   @ObfuscatedName("az")
   int field2762 = -944674513;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2769 = 0;
   @ObfuscatedSignature(descriptor = "Ljk;")
   @ObfuscatedName("au")
   class236 field2761;
   @ObfuscatedName("as")
   String field2766;
   @ObfuscatedSignature(descriptor = "Ley;")
   @ObfuscatedName("ac")
   UrlRequest field2765;
   @ObfuscatedName("ab")
   int field2760 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final String field2772 = "scape main";
   @ObfuscatedSignature(descriptor = "Lgz;")
   @ObfuscatedName("bg")
   static ClanChannel field2771;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field2768 = 13;
   @ObfuscatedName("av")
   public static URL RunException_applet;

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("bd")
   public float[] method5319() {
      return this.field2761.field3070;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
   @ObfuscatedName("ag")
   public void method5288(String var1, String var2, String var3, int var4) {
      try {
         this.field2764 = WorldMapArea.method6908(-1548837820);
         this.field2763 = var1;
         class234.method5928(this.field2764, this.field2763, var2, var3, (byte)-110);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ix.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lei;I)V")
   @ObfuscatedName("an")
   public void method5290(UrlRequester var1, int var2) {
      try {
         switch (-1607499215 * this.field2762) {
            case 0:
               this.method5325(var1, 340427984);
               break;
            case 1:
               method5327(this, 1004715746);
               break;
            default:
               return;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ix.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("aj")
   public boolean method5297(byte var1) {
      try {
         boolean var10000;
         if (null != this.field2761) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ix.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("ak")
   public int method5299(String var1, int var2) {
      try {
         int var10000;
         if (this.field2761.field3071.containsKey(var1)) {
            if (var2 == -1105425477) {
               throw new IllegalStateException();
            }

            var10000 = (Integer)this.field2761.field3071.get(var1);
         } else {
            var10000 = -1;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ix.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("aw")
   public String method5304(String var1, int var2) {
      try {
         Object var10000;
         if (this.field2761.field3072.containsKey(var1)) {
            if (var2 >= 327716789) {
               throw new IllegalStateException();
            }

            var10000 = this.field2761.field3072.get(var1);
         } else {
            var10000 = null;
         }

         return (String)var10000;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ix.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/io/File;Ljava/io/File;I)V")
   @ObfuscatedName("ag")
   static void method5333(File var0, File var1, int var2) {
      try {
         try {
            AccessFile var3 = new AccessFile(SoundCache.field1483, "rw", 10000L);
            Buffer var4 = new Buffer(500);
            var4.writeByte(3, (short)-27596);
            var4.writeByte(var1 != null ? 1 : 0, (short)-7350);
            Buffer.method11966(var4, var0.getPath(), -671176567);
            if (null != var1) {
               if (var2 != 1444084843) {
                  throw new IllegalStateException();
               }

               Buffer.method11966(var4, var1.getPath(), -1159270707);
            }

            AccessFile.method11798(var3, var4.array, 0, var4.offset * 2108391709, (byte)-34);
            var3.close((byte)-127);
         } catch (IOException var5) {
            var5.printStackTrace();
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ix.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/util/ArrayList;")
   @ObfuscatedName("au")
   public ArrayList method5314(int var1) {
      try {
         return this.field2761.field3068;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ix.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("bb")
   public int method5300(String var1) {
      return this.field2761.field3071.containsKey(var1) ? (Integer)this.field2761.field3071.get(var1) : -1;
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("ad")
   public float[] method5320(int var1) {
      try {
         return this.field2761.field3070;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ix.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("ai")
   public String method5322(byte var1) {
      try {
         return this.field2761.method5965(2111887724);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ix.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("as")
   void method5323(int var1) {
      try {
         this.field2765 = null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ix.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lei;I)V")
   @ObfuscatedName("ac")
   void method5325(UrlRequester var1, int var2) {
      try {
         if (this.field2765 != null) {
            if (var2 <= 323330376) {
               return;
            }

            if (this.field2765.isDone(1741769013)) {
               byte[] var3 = this.field2765.getResponse((byte)65);
               if (null == var3) {
                  if (var2 <= 323330376) {
                     throw new IllegalStateException();
                  }

                  this.method5323(-1986121800);
                  this.field2762 = -516269244;
                  return;
               }

               try {
                  HttpJsonRequestBody var4 = new HttpJsonRequestBody(var3);
                  JSONObject var5 = var4.getBody(-1073560894);
                  if (null == var5) {
                     return;
                  }

                  try {
                     this.field2760 = var5.getInt("version") * -627546211;
                  } catch (Exception var8) {
                     this.method5323(1336573045);
                     this.field2762 = 1373079782;
                     return;
                  }

                  if (this.field2760 * 2049988277 < 2) {
                     if (var2 <= 323330376) {
                        return;
                     }

                     if (!this.field2761.method5975(var5, this.field2760 * 2049988277, var1, (byte)-62)) {
                        if (var2 <= 323330376) {
                           throw new IllegalStateException();
                        }

                        this.field2762 = 1373079782;
                     }
                  } else if (this.field2760 * 2049988277 == 2) {
                     classJA var6 = classJA.field2798;
                     var6.method5371(var5, this.field2760 * 2049988277, var1, 268666868);
                     this.field2761 = classJA.method5385(var6, this.field2766, (short)321);
                     if (this.field2761 != null) {
                        if (var2 <= 323330376) {
                           throw new IllegalStateException();
                        }

                        method5327(this, 282280968);
                        this.field2762 = 944674513;
                     } else {
                        this.field2762 = -1977213001;
                     }
                  }
               } catch (UnsupportedEncodingException var9) {
                  this.method5323(-434824505);
                  this.field2762 = 1373079782;
                  return;
               }

               if (this.field2761 != null) {
                  if (var2 <= 323330376) {
                     throw new IllegalStateException();
                  }

                  byte var10001;
                  if (!this.field2761.field3074.isEmpty()) {
                     if (var2 <= 323330376) {
                        return;
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 2;
                  }

                  this.field2762 = var10001 * 944674513;
               }

               this.field2765 = null;
               return;
            }

            if (var2 <= 323330376) {
               throw new IllegalStateException();
            }
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "ix.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bf")
   public String method5316() {
      return this.field2761.field3069;
   }

   @ObfuscatedSignature(descriptor = "()Ljj;")
   @ObfuscatedName("ah")
   public class234 method5280() {
      return this.field2764;
   }

   @ObfuscatedSignature(descriptor = "(Lix;B)Ljava/lang/String;")
   @ObfuscatedName("zf")
   public static String method5317(class225 var0, byte var1) {
      if (var0 == null) {
         var0.method5318(var1);
      }

      try {
         return var0.field2761.field3069;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ix.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljj;")
   @ObfuscatedName("ar")
   public class234 method5281() {
      return this.field2764;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Lei;)Z")
   @ObfuscatedName("al")
   public boolean method5284(String var1, String var2, UrlRequester var3) {
      if (var1 == null || var1.isEmpty()) {
         return false;
      } else if (var3 == null) {
         return false;
      } else {
         this.method5323(-1423053020);

         try {
            this.field2759 = var1;
            this.field2765 = var3.request(new URL(this.field2759), -726881254);
            this.field2762 = 0;
         } catch (MalformedURLException var5) {
            this.method5323(1340519085);
            this.field2762 = -516269244;
            return false;
         }

         if (!var2.isEmpty()) {
            this.field2766 = var2;
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("af")
   public void method5289(String var1, String var2, String var3) {
      this.field2764 = WorldMapArea.method6908(1275384016);
      this.field2763 = var1;
      class234.method5928(this.field2764, this.field2763, var2, var3, (byte)-35);
   }

   @ObfuscatedSignature(descriptor = "(Lei;)V")
   @ObfuscatedName("am")
   public void method5291(UrlRequester var1) {
      switch (1112901321 * this.field2762) {
         case 0:
            this.method5325(var1, 716945478);
            break;
         case 1:
            method5327(this, 2078291988);
            break;
         default:
            return;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lei;)V")
   @ObfuscatedName("ao")
   public void method5292(UrlRequester var1) {
      switch (-1607499215 * this.field2762) {
         case 0:
            this.method5325(var1, 1854900710);
            break;
         case 1:
            method5327(this, -568158677);
            break;
         default:
            return;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lei;)V")
   @ObfuscatedName("aa")
   public void method5293(UrlRequester var1) {
      switch (-1607499215 * this.field2762) {
         case 0:
            this.method5325(var1, 496081759);
            break;
         case 1:
            method5327(this, -391276273);
            break;
         default:
            return;
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lhy;")
   @ObfuscatedName("av")
   public static KitDefinition method5278(int var0, byte var1) {
      try {
         KitDefinition var2 = (KitDefinition)class402.method8806(KitDefinition.KitDefinition_cached, var0);
         if (null != var2) {
            if (var1 != 12) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else if (KitDefinition.KitDefinition_archive == null) {
            if (var1 != 12) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            byte[] var3 = KitDefinition.KitDefinition_archive.getFile(3, var0, -527838790);
            var2 = new KitDefinition();
            if (null != var3) {
               if (var1 != 12) {
                  throw new IllegalStateException();
               }

               var2.decode(new Buffer(var3), 975112843);
            }

            KitDefinition.KitDefinition_cached.put(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ix.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/ArrayList;")
   @ObfuscatedName("by")
   public ArrayList method5315() {
      return this.field2761.field3068;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bg")
   public boolean method5298() {
      return null != this.field2761;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/util/ArrayList;")
   @ObfuscatedName("ap")
   public ArrayList method5310(int var1) {
      try {
         return this.field2761.field3074;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ix.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("bz")
   public int method5301(String var1) {
      return this.field2761.field3071.containsKey(var1) ? (Integer)this.field2761.field3071.get(var1) : -1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("bk")
   public int method5302(String var1) {
      return this.field2761.field3071.containsKey(var1) ? (Integer)this.field2761.field3071.get(var1) : -1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/ArrayList;")
   @ObfuscatedName("bi")
   public ArrayList method5311() {
      return this.field2761.field3067;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bm")
   public String method5305(String var1) {
      return (String)(this.field2761.field3072.containsKey(var1) ? this.field2761.field3072.get(var1) : null);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   public int method5294() {
      return -1607499215 * this.field2762;
   }

   @ObfuscatedSignature(descriptor = "(Lix;B)Ljj;")
   @ObfuscatedName("ut")
   public static class234 method5282(class225 var0, byte var1) {
      if (var0 == null) {
         return var0.method5283(var1);
      } else {
         try {
            return var0.field2764;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "ix.av(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lip;)Z")
   @ObfuscatedName("lw")
   public static boolean method5287(ParamComposition var0) {
      return 's' == var0.type;
   }

   @ObfuscatedSignature(descriptor = "(Lix;I)Ljava/util/ArrayList;")
   @ObfuscatedName("sr")
   public static ArrayList method5312(class225 var0, int var1) {
      if (var0 == null) {
         var0.method5313(var1);
      }

      try {
         return var0.field2761.field3067;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ix.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ba")
   public String method5306(String var1) {
      return (String)(this.field2761.field3072.containsKey(var1) ? this.field2761.field3072.get(var1) : null);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bu")
   public String method5307(String var1) {
      return (String)(this.field2761.field3072.containsKey(var1) ? this.field2761.field3072.get(var1) : null);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lei;B)Z")
   @ObfuscatedName("ax")
   public boolean method5329(String var1, UrlRequester var2, byte var3) {
      try {
         try {
            JSONObject var4 = new HttpJsonRequestBody(var1.getBytes()).getBody(-1073560894);

            try {
               this.field2760 = var4.getInt("version") * -627546211;
            } catch (Exception var6) {
               this.method5323(-965449035);
               this.field2762 = 1373079782;
               return false;
            }

            if (!this.field2761.method5975(var4, this.field2760 * 2049988277, var2, (byte)-65)) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               this.field2762 = 1373079782;
            }

            byte var10001;
            if (!this.field2761.field3074.isEmpty()) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 2;
            }

            this.field2762 = var10001 * 944674513;
         } catch (UnsupportedEncodingException var7) {
            this.field2762 = 1373079782;
         }

         return this.field2762 * -1607499215 < 3;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "ix.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lix;Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("pv")
   public static String method5308(class225 var0, String var1) {
      return (String)(var0.field2761.field3072.containsKey(var1) ? var0.field2761.field3072.get(var1) : null);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lix;Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("rh")
   public static String method5309(class225 var0, String var1) {
      return (String)(var0.field2761.field3072.containsKey(var1) ? var0.field2761.field3072.get(var1) : null);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public int method5295(int var1) {
      try {
         return -1607499215 * this.field2762;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ix.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("bn")
   public float[] method5321() {
      return this.field2761.field3070;
   }

   public class225(class225 var1) {
      if (var1 != null) {
         this.field2764 = var1.field2764;
         this.field2761 = var1.field2761;
         this.field2762 = var1.field2762 * 1;
         this.field2759 = var1.field2759;
         this.field2763 = var1.field2763;
         this.field2766 = var1.field2766;
         this.field2765 = null;
         this.field2760 = 1 * var1.field2760;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bh")
   void method5324() {
      this.field2765 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lei;)V")
   @ObfuscatedName("bl")
   void method5326(UrlRequester var1) {
      if (this.field2765 != null && this.field2765.isDone(1741769013)) {
         byte[] var2 = this.field2765.getResponse((byte)93);
         if (null == var2) {
            this.method5323(398170256);
            this.field2762 = -516269244;
         } else {
            try {
               HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
               JSONObject var4 = var3.getBody(-1073560894);
               if (null == var4) {
                  return;
               }

               try {
                  this.field2760 = var4.getInt("version") * -627546211;
               } catch (Exception var7) {
                  this.method5323(-942862600);
                  this.field2762 = 1373079782;
                  return;
               }

               if (this.field2760 * 2049988277 < 2) {
                  if (!this.field2761.method5975(var4, this.field2760 * 2049988277, var1, (byte)-16)) {
                     this.field2762 = 1373079782;
                  }
               } else if (this.field2760 * 2049988277 == 2) {
                  classJA var5 = classJA.field2798;
                  var5.method5371(var4, this.field2760 * 2049988277, var1, 1815175574);
                  this.field2761 = classJA.method5385(var5, this.field2766, (short)321);
                  if (this.field2761 != null) {
                     method5327(this, -1306346143);
                     this.field2762 = 944674513;
                  } else {
                     this.field2762 = -1977213001;
                  }
               }
            } catch (UnsupportedEncodingException var8) {
               this.method5323(1901773962);
               this.field2762 = 1373079782;
               return;
            }

            if (this.field2761 != null) {
               this.field2762 = (!this.field2761.field3074.isEmpty() ? 1 : 2) * 944674513;
            }

            this.field2765 = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lix;Ljava/lang/String;Ljava/lang/String;Lei;I)Z")
   @ObfuscatedName("fh")
   public static boolean method5285(class225 var0, String var1, String var2, UrlRequester var3, int var4) {
      if (var0 == null) {
         return var0.method5286(var1, var1, var3, var4);
      } else {
         try {
            if (var1 != null) {
               if (!var1.isEmpty()) {
                  if (var3 == null) {
                     if (var4 <= 327716789) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  var0.method5323(1465485113);

                  try {
                     var0.field2759 = var1;
                     var0.field2765 = var3.request(new URL(var0.field2759), -726881254);
                     var0.field2762 = 0;
                  } catch (MalformedURLException var6) {
                     var0.method5323(-44596208);
                     var0.field2762 = -516269244;
                     return false;
                  }

                  if (!var2.isEmpty()) {
                     var0.field2766 = var2;
                  }

                  return true;
               }

               if (var4 <= 327716789) {
                  throw new IllegalStateException();
               }
            }

            return false;
         } catch (RuntimeException var7) {
            throw RestClientThreadFactory.newRunException(var7, "ix.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lix;I)V")
   @ObfuscatedName("gh")
   public static void method5327(class225 var0, int var1) {
      if (var0 == null) {
         var0.method5328(var1);
      } else {
         try {
            Iterator var2 = var0.field2761.field3074.iterator();

            while (var2.hasNext()) {
               if (var1 == -1540292811) {
                  throw new IllegalStateException();
               }

               class226 var3 = (class226)var2.next();
               if (null != var3.field2777) {
                  if (var1 == -1540292811) {
                     throw new IllegalStateException();
                  }

                  if (!var3.field2777.isDone(1741769013)) {
                     if (var1 == -1540292811) {
                        throw new IllegalStateException();
                     }

                     return;
                  }
               }
            }

            for (class226 var7 : var0.field2761.field3074) {
               if (null != var7.field2777) {
                  if (var1 == -1540292811) {
                     throw new IllegalStateException();
                  }

                  byte[] var4 = var7.field2777.getResponse((byte)36);
                  if (var4 != null) {
                     if (var1 == -1540292811) {
                        return;
                     }

                     if (var4.length > 0) {
                        if (var1 == -1540292811) {
                           throw new IllegalStateException();
                        }

                        var0.field2762 = 1889349026;
                        return;
                     }
                  }
               }
            }

            var0.method5323(-1494994469);
            var0.field2762 = 428405269;
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "ix.ab(" + ')');
         }
      }
   }

   public class225() {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lei;)Z")
   @ObfuscatedName("bq")
   public boolean method5330(String var1, UrlRequester var2) {
      try {
         JSONObject var3 = new HttpJsonRequestBody(var1.getBytes()).getBody(-1073560894);

         try {
            this.field2760 = var3.getInt("version") * 834918462;
         } catch (Exception var5) {
            this.method5323(870879614);
            this.field2762 = 2075496767;
            return false;
         }

         if (!this.field2761.method5975(var3, this.field2760 * -1837442957, var2, (byte)101)) {
            this.field2762 = 356412241;
         }

         this.field2762 = (!this.field2761.field3074.isEmpty() ? 1 : 2) * 944674513;
      } catch (UnsupportedEncodingException var6) {
         this.field2762 = -1815644199;
      }

      return this.field2762 * -1747121649 < 3;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("bj")
   public int method5303(String var1) {
      return this.field2761.field3071.containsKey(var1) ? (Integer)this.field2761.field3071.get(var1) : -1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lei;)Z")
   @ObfuscatedName("bv")
   public boolean method5331(String var1, UrlRequester var2) {
      try {
         JSONObject var3 = new HttpJsonRequestBody(var1.getBytes()).getBody(-1073560894);

         try {
            this.field2760 = var3.getInt("version") * -627546211;
         } catch (Exception var5) {
            this.method5323(20777122);
            this.field2762 = 1373079782;
            return false;
         }

         if (!this.field2761.method5975(var3, this.field2760 * 2049988277, var2, (byte)-91)) {
            this.field2762 = 1373079782;
         }

         this.field2762 = (!this.field2761.field3074.isEmpty() ? 1 : 2) * 944674513;
      } catch (UnsupportedEncodingException var6) {
         this.field2762 = 1373079782;
      }

      return this.field2762 * -1607499215 < 3;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("av")
   public static int method5277(int var0, int var1) {
      try {
         return var0 >> 24 & 3;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ix.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("be")
   public int method5296() {
      return -1607499215 * this.field2762;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrn;)Lvo;")
   @ObfuscatedName("fn")
   public static DualNode method5279(IterableDualNodeQueue var0) {
      DualNode var1 = var0.sentinel.previousDual;
      if (var1 == var0.sentinel) {
         return null;
      } else {
         var1.removeDual();
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lei;)Z")
   @ObfuscatedName("bx")
   public boolean method5332(String var1, UrlRequester var2) {
      try {
         JSONObject var3 = new HttpJsonRequestBody(var1.getBytes()).getBody(-1073560894);

         try {
            this.field2760 = var3.getInt("version") * -627546211;
         } catch (Exception var5) {
            this.method5323(59275351);
            this.field2762 = 1373079782;
            return false;
         }

         if (!this.field2761.method5975(var3, this.field2760 * 2049988277, var2, (byte)19)) {
            this.field2762 = 1373079782;
         }

         this.field2762 = (!this.field2761.field3074.isEmpty() ? 1 : 2) * 1963332747;
      } catch (UnsupportedEncodingException var6) {
         this.field2762 = 1373079782;
      }

      return this.field2762 * 228098363 < 3;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/util/ArrayList;")
   @ObfuscatedName("ay")
   public ArrayList method5313(int var1) {
      try {
         return this.field2761.field3067;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ix.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Lei;I)Z")
   @ObfuscatedName("at")
   public boolean method5286(String var1, String var2, UrlRequester var3, int var4) {
      try {
         if (var1 != null) {
            if (!var1.isEmpty()) {
               if (var3 == null) {
                  if (var4 <= 327716789) {
                     throw new IllegalStateException();
                  }

                  return false;
               }

               this.method5323(1465485113);

               try {
                  this.field2759 = var1;
                  this.field2765 = var3.request(new URL(this.field2763), -726881254);
                  this.field2760 = 0;
               } catch (MalformedURLException var6) {
                  this.method5323(-44596208);
                  this.field2762 = -516269244;
                  return false;
               }

               if (!var2.isEmpty()) {
                  this.field2759 = var2;
               }

               return true;
            }

            if (var4 <= 327716789) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "ix.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   void method5328(int var1) {
      try {
         Iterator var2 = this.field2761.field3067.iterator();

         while (var2.hasNext()) {
            if (var1 == -1540292811) {
               throw new IllegalStateException();
            }

            class226 var3 = (class226)var2.next();
            if (null != var3.field2777) {
               if (var1 == -1540292811) {
                  throw new IllegalStateException();
               }

               if (!var3.field2777.isDone(1741769013)) {
                  if (var1 == -1540292811) {
                     throw new IllegalStateException();
                  }

                  return;
               }
            }
         }

         for (class226 var7 : this.field2761.field3067) {
            if (null != var7.field2777) {
               if (var1 == -1540292811) {
                  throw new IllegalStateException();
               }

               byte[] var4 = var7.field2777.getResponse((byte)36);
               if (var4 != null) {
                  if (var1 == -1540292811) {
                     return;
                  }

                  if (var4.length > 0) {
                     if (var1 == -1540292811) {
                        throw new IllegalStateException();
                     }

                     this.field2762 = 1889349026;
                     return;
                  }
               }
            }
         }

         this.method5323(-1494994469);
         this.field2760 = 428405269;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ix.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("az")
   public String method5318(byte var1) {
      try {
         return this.field2761.field3069;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ix.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljj;")
   @ObfuscatedName("av")
   public class234 method5283(byte var1) {
      try {
         return this.field2764;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ix.av(" + ')');
      }
   }
}
