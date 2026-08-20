import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.json.JSONObject;

@ObfuscatedName("ma")
public class classMA {
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   static final String field4469 = "s";
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field4467 = -1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field4462 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field4464 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field4466 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field4461 = 7;
   @ObfuscatedSignature(descriptor = "Lmu;")
   @ObfuscatedName("ao")
   classMU field4460;
   @ObfuscatedName("au")
   int field4453;
   @ObfuscatedName("aj")
   int field4457 = -2063965041;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field4463 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   public static final int field4465 = 36;
   @ObfuscatedName("ad")
   String field4454;
   @ObfuscatedName("aq")
   String field4459;
   @ObfuscatedSignature(descriptor = "Lms;")
   @ObfuscatedName("al")
   classMS field4456;
   @ObfuscatedSignature(descriptor = "Ley;")
   @ObfuscatedName("ap")
   classEY field4458;
   @ToRemove(unused = "true")
   @ObfuscatedName("br")
   static final int field4468 = 5;
   @ObfuscatedName("ay")
   String field4455;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cs")
   void method7479() {
      this.field4458 = null;
   }

   @ObfuscatedSignature(descriptor = "(B)Lmu;")
   @ObfuscatedName("az")
   public classMU method7429(byte var1) {
      try {
         return this.field4460;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ma.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Lda;I)Z")
   @ObfuscatedName("af")
   public boolean method7431(String var1, String var2, classDA var3, int var4) {
      try {
         if (null != var1) {
            if (var4 <= -748802209) {
               throw new IllegalStateException();
            }

            if (!var1.isEmpty()) {
               if (var3 == null) {
                  if (var4 <= -748802209) {
                     throw new IllegalStateException();
                  }

                  return false;
               }

               this.method7480(830641263);

               try {
                  this.field4455 = var1;
                  this.field4458 = var3.method2872(new URL(this.field4455), -1550682573);
                  this.field4457 = 0;
               } catch (MalformedURLException var6) {
                  this.method7480(830641263);
                  this.field4457 = -334074428;
                  return false;
               }

               if (!var2.isEmpty()) {
                  if (var4 <= -748802209) {
                     throw new IllegalStateException();
                  }

                  this.field4454 = var2;
               }

               return true;
            }

            if (var4 <= -748802209) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "ma.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lda;)V")
   @ObfuscatedName("at")
   public void method7436(classDA var1) {
      switch (this.field4457 * 1284902940) {
         case 0:
            this.method7485(var1, 244281169);
            break;
         case 1:
            this.method7491((byte)-76);
            break;
         default:
            return;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("av")
   public void method7433(String var1, String var2, String var3) {
      this.field4460 = classHS.method6101(103280021);
      this.field4459 = var1;
      this.field4460.method7708(this.field4459, var2, var3, -1354653624);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
   @ObfuscatedName("ac")
   public String method7452(String var1, byte var2) {
      try {
         Object var10000;
         if (this.field4456.field4573.containsKey(var1)) {
            if (var2 == 6) {
               throw new IllegalStateException();
            }

            var10000 = this.field4456.field4573.get(var1);
         } else {
            var10000 = null;
         }

         return (String)var10000;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ma.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)Ljava/util/ArrayList;")
   @ObfuscatedName("aa")
   public ArrayList method7455(short var1) {
      try {
         return this.field4456.field4569;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ma.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("ay")
   public float[] method7470(int var1) {
      try {
         return this.field4456.field4571;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ma.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("bg")
   public int method7446(String var1) {
      return this.field4456.field4572.containsKey(var1) ? (Integer)this.field4456.field4572.get(var1) : -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lma;Ljava/lang/String;Ljava/lang/String;Lda;)Z")
   @ObfuscatedName("am")
   public static boolean method7432(classMA var0, String var1, String var2, classDA var3) {
      if (var0 == null) {
         var0.method7466();
      }

      if (null == var1 || var1.isEmpty()) {
         return false;
      } else if (var3 == null) {
         return false;
      } else {
         var0.method7480(830641263);

         try {
            var0.field4455 = var1;
            var0.field4458 = var3.method2872(new URL(var0.field4455), -437927472);
            var0.field4457 = 0;
         } catch (MalformedURLException var5) {
            var0.method7480(830641263);
            var0.field4457 = -334074428;
            return false;
         }

         if (!var2.isEmpty()) {
            var0.field4454 = var2;
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ad")
   void method7480(int var1) {
      try {
         this.field4458 = null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ma.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lda;I)V")
   @ObfuscatedName("ap")
   void method7485(classDA var1, int var2) {
      try {
         if (this.field4458 != null) {
            if (var2 != 244281169) {
               return;
            }

            if (this.field4458.method4106(2112237512)) {
               byte[] var3 = this.field4458.method4112(1145062404);
               if (var3 == null) {
                  if (var2 != 244281169) {
                     throw new IllegalStateException();
                  }

                  this.method7480(830641263);
                  this.field4457 = -334074428;
                  return;
               }

               try {
                  classWE var4 = new classWE(var3);
                  JSONObject var5 = var4.method12351(-1229780595);
                  if (var5 == null) {
                     return;
                  }

                  try {
                     this.field4453 = var5.getInt("version") * 2102857035;
                  } catch (Exception var8) {
                     this.method7480(830641263);
                     this.field4457 = -501111642;
                     return;
                  }

                  if (-77327261 * this.field4453 < 2) {
                     if (var2 != 244281169) {
                        throw new IllegalStateException();
                     }

                     if (!this.field4456.method7665(var5, this.field4453 * -77327261, var1, -1765815068)) {
                        if (var2 != 244281169) {
                           throw new IllegalStateException();
                        }

                        this.field4457 = -501111642;
                     }
                  } else if (this.field4453 * -77327261 == 2) {
                     classMI var6 = classMI.field4509;
                     var6.method7573(var5, -77327261 * this.field4453, var1, (byte)62);
                     this.field4456 = classMI.method7588(var6, this.field4454, 2120152379);
                     if (this.field4456 != null) {
                        if (var2 != 244281169) {
                           return;
                        }

                        this.method7491((byte)-85);
                        this.field4457 = 2063965041;
                     } else {
                        this.field4457 = 1562853399;
                     }
                  }
               } catch (UnsupportedEncodingException var9) {
                  this.method7480(830641263);
                  this.field4457 = -501111642;
                  return;
               }

               if (this.field4456 != null) {
                  byte var10001;
                  if (!this.field4456.field4569.isEmpty()) {
                     if (var2 != 244281169) {
                        return;
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 2;
                  }

                  this.field4457 = var10001 * 2063965041;
               }

               this.field4458 = null;
               return;
            }

            if (var2 != 244281169) {
               throw new IllegalStateException();
            }
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "ma.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lmu;")
   @ObfuscatedName("aw")
   public classMU method7430() {
      return this.field4460;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/ArrayList;")
   @ObfuscatedName("bw")
   public ArrayList method7458() {
      return this.field4456.field4568;
   }

   @ObfuscatedSignature(descriptor = "(Lda;)V")
   @ObfuscatedName("an")
   public void method7437(classDA var1) {
      switch (this.field4457 * 2013644177) {
         case 0:
            this.method7485(var1, 244281169);
            break;
         case 1:
            this.method7491((byte)43);
            break;
         default:
            return;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("au")
   void method7491(byte var1) {
      try {
         Iterator var2 = this.field4456.field4569.iterator();

         while (var2.hasNext()) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            classMN var3 = (classMN)var2.next();
            if (var3.field4544 != null && !var3.field4544.method4106(2112828241)) {
               return;
            }
         }

         var2 = this.field4456.field4569.iterator();

         while (var2.hasNext()) {
            if (var1 == 0) {
               return;
            }

            classMN var7 = (classMN)var2.next();
            if (var7.field4544 != null) {
               byte[] var4 = var7.field4544.method4112(1145062404);
               if (var4 != null && var4.length > 0) {
                  if (var1 == 0) {
                     return;
                  }

                  this.field4457 = -167037214;
                  return;
               }
            }
         }

         this.method7480(830641263);
         this.field4457 = 1729890613;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ma.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bn")
   public int method7439() {
      return this.field4457 * 50507538;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bx")
   public boolean method7442() {
      return this.field4456 != null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bc")
   public boolean method7443() {
      return this.field4456 != null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("br")
   public int method7447(String var1) {
      return this.field4456.field4572.containsKey(var1) ? (Integer)this.field4456.field4572.get(var1) : -1;
   }

   @ObfuscatedSignature(descriptor = "(Lma;Ljava/lang/String;Lda;I)Z")
   @ObfuscatedName("zi")
   public static boolean method7495(classMA var0, String var1, classDA var2, int var3) {
      if (var0 == null) {
         return var0.method7499(var1, var2, var3);
      } else {
         try {
            try {
               JSONObject var4 = new classWE(var1.getBytes()).method12351(-1045745323);

               try {
                  var0.field4453 = var4.getInt("version") * 2102857035;
               } catch (Exception var6) {
                  var0.method7480(830641263);
                  var0.field4457 = -501111642;
                  return false;
               }

               if (!var0.field4456.method7665(var4, var0.field4453 * -77327261, var2, 1889800462)) {
                  if (var3 <= 992027348) {
                     throw new IllegalStateException();
                  }

                  var0.field4457 = -501111642;
               }

               byte var10001;
               if (!var0.field4456.field4569.isEmpty()) {
                  if (var3 <= 992027348) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 2;
               }

               var0.field4457 = var10001 * 2063965041;
            } catch (UnsupportedEncodingException var7) {
               var0.field4457 = -501111642;
            }

            boolean var10000;
            if (2013644177 * var0.field4457 < 3) {
               if (var3 <= 992027348) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var8) {
            throw classEG.method3884(var8, "ma.ai(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lma;)[F")
   @ObfuscatedName("zd")
   public static float[] method7471(classMA var0) {
      return var0.field4456.field4571;
   }

   @ObfuscatedSignature(descriptor = "(Lma;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
   @ObfuscatedName("ri")
   public static void method7434(classMA var0, String var1, String var2, String var3, short var4) {
      if (var0 == null) {
         var0.method7435(var1, var1, var1, var4);
      }

      try {
         var0.field4460 = classHS.method6101(-1819480864);
         var0.field4459 = var1;
         var0.field4460.method7708(var0.field4459, var2, var3, -714017036);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ma.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("bm")
   public int method7448(String var1) {
      return this.field4456.field4572.containsKey(var1) ? (Integer)this.field4456.field4572.get(var1) : -1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cf")
   void method7492() {
      for (classMN var2 : this.field4456.field4569) {
         if (var2.field4544 != null && !var2.field4544.method4106(2137417646)) {
            return;
         }
      }

      for (classMN var5 : this.field4456.field4569) {
         if (var5.field4544 != null) {
            byte[] var3 = var5.field4544.method4112(1145062404);
            if (var3 != null && var3.length > 0) {
               this.field4457 = -167037214;
               return;
            }
         }
      }

      this.method7480(830641263);
      this.field4457 = 1729890613;
   }

   public classMA(classMA var1) {
      this.field4453 = 0;
      if (var1 != null) {
         this.field4460 = var1.field4460;
         this.field4456 = var1.field4456;
         this.field4457 = var1.field4457 * 1;
         this.field4455 = var1.field4455;
         this.field4459 = var1.field4459;
         this.field4454 = var1.field4454;
         this.field4458 = null;
         this.field4453 = 1 * var1.field4453;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bk")
   public String method7453(String var1) {
      return (String)(this.field4456.field4573.containsKey(var1) ? this.field4456.field4573.get(var1) : null);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("bt")
   public int method7449(String var1) {
      return this.field4456.field4572.containsKey(var1) ? (Integer)this.field4456.field4572.get(var1) : -1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/ArrayList;")
   @ObfuscatedName("ba")
   public ArrayList method7456() {
      return this.field4456.field4569;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bj")
   public String method7454(String var1) {
      return (String)(this.field4456.field4573.containsKey(var1) ? this.field4456.field4573.get(var1) : null);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ch")
   void method7493() {
      for (classMN var2 : this.field4456.field4569) {
         if (var2.field4544 != null && !var2.field4544.method4106(1885666989)) {
            return;
         }
      }

      for (classMN var5 : this.field4456.field4569) {
         if (var5.field4544 != null) {
            byte[] var3 = var5.field4544.method4112(1145062404);
            if (var3 != null && var3.length > 0) {
               this.field4457 = -167037214;
               return;
            }
         }
      }

      this.method7480(830641263);
      this.field4457 = 1729890613;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/ArrayList;")
   @ObfuscatedName("bi")
   public ArrayList method7461() {
      return this.field4456.field4575;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bf")
   public String method7464() {
      return this.field4456.field4570;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("am")
   public int method7440() {
      return this.field4457 * 2013644177;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public int method7441(int var1) {
      try {
         return this.field4457 * 2013644177;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ma.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bs")
   public String method7465() {
      return this.field4456.field4570;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bd")
   public String method7466() {
      return this.field4456.field4570;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bl")
   public String method7467() {
      return this.field4456.field4570;
   }

   public classMA() {
      this.field4453 = 0;
   }

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("bz")
   public float[] method7472() {
      return this.field4456.field4571;
   }

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("bh")
   public float[] method7473() {
      return this.field4456.field4571;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("cu")
   public String method7474() {
      return this.field4456.method7657(-1431884642);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("cb")
   public String method7475() {
      return this.field4456.method7657(-2132132729);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ct")
   public String method7476() {
      return this.field4456.method7657(-1284145959);
   }

   @ObfuscatedSignature(descriptor = "(Lma;I)Ljava/lang/String;")
   @ObfuscatedName("ue")
   public static String method7468(classMA var0, int var1) {
      if (var0 == null) {
         var0.method7469(var1);
      }

      try {
         return var0.field4456.field4570;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ma.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("cp")
   public String method7477() {
      return this.field4456.method7657(-1796493913);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cq")
   void method7481() {
      this.field4458 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lma;Ljava/lang/String;S)I")
   @ObfuscatedName("fz")
   public static int method7450(classMA var0, String var1, short var2) {
      if (var0 == null) {
         return var0.method7451(var1, var2);
      } else {
         try {
            int var10000;
            if (var0.field4456.field4572.containsKey(var1)) {
               if (var2 >= 376) {
                  throw new IllegalStateException();
               }

               var10000 = (Integer)var0.field4456.field4572.get(var1);
            } else {
               var10000 = -1;
            }

            return var10000;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "ma.ax(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cl")
   void method7482() {
      this.field4458 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cd")
   void method7483() {
      this.field4458 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cv")
   void method7484() {
      this.field4458 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lda;)V")
   @ObfuscatedName("cy")
   void method7486(classDA var1) {
      if (this.field4458 != null && this.field4458.method4106(2029559026)) {
         byte[] var2 = this.field4458.method4112(1145062404);
         if (var2 == null) {
            this.method7480(830641263);
            this.field4457 = -334074428;
         } else {
            try {
               classWE var3 = new classWE(var2);
               JSONObject var4 = var3.method12351(-1477810738);
               if (var4 == null) {
                  return;
               }

               try {
                  this.field4453 = var4.getInt("version") * 2102857035;
               } catch (Exception var7) {
                  this.method7480(830641263);
                  this.field4457 = -501111642;
                  return;
               }

               if (-77327261 * this.field4453 < 2) {
                  if (!this.field4456.method7665(var4, this.field4453 * -77327261, var1, -882397869)) {
                     this.field4457 = -501111642;
                  }
               } else if (this.field4453 * -77327261 == 2) {
                  classMI var5 = classMI.field4509;
                  var5.method7573(var4, -77327261 * this.field4453, var1, (byte)62);
                  this.field4456 = classMI.method7588(var5, this.field4454, 2002298986);
                  if (this.field4456 != null) {
                     this.method7491((byte)-2);
                     this.field4457 = 2063965041;
                  } else {
                     this.field4457 = 1562853399;
                  }
               }
            } catch (UnsupportedEncodingException var8) {
               this.method7480(830641263);
               this.field4457 = -501111642;
               return;
            }

            if (this.field4456 != null) {
               this.field4457 = (!this.field4456.field4569.isEmpty() ? 1 : 2) * 2063965041;
            }

            this.field4458 = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lda;)V")
   @ObfuscatedName("co")
   void method7487(classDA var1) {
      if (this.field4458 != null && this.field4458.method4106(1946529288)) {
         byte[] var2 = this.field4458.method4112(1145062404);
         if (var2 == null) {
            this.method7480(830641263);
            this.field4457 = -334074428;
         } else {
            try {
               classWE var3 = new classWE(var2);
               JSONObject var4 = var3.method12351(2115028351);
               if (var4 == null) {
                  return;
               }

               try {
                  this.field4453 = var4.getInt("version") * 2102857035;
               } catch (Exception var7) {
                  this.method7480(830641263);
                  this.field4457 = 1127564862;
                  return;
               }

               if (-953926871 * this.field4453 < 2) {
                  if (!this.field4456.method7665(var4, this.field4453 * 1066612620, var1, -1192841249)) {
                     this.field4457 = -501111642;
                  }
               } else if (this.field4453 * 1877070884 == 2) {
                  classMI var5 = classMI.field4509;
                  var5.method7573(var4, -77327261 * this.field4453, var1, (byte)62);
                  this.field4456 = classMI.method7588(var5, this.field4454, 1816029823);
                  if (this.field4456 != null) {
                     this.method7491((byte)-92);
                     this.field4457 = 156629063;
                  } else {
                     this.field4457 = 873531110;
                  }
               }
            } catch (UnsupportedEncodingException var8) {
               this.method7480(830641263);
               this.field4457 = -235323912;
               return;
            }

            if (this.field4456 != null) {
               this.field4457 = (!this.field4456.field4569.isEmpty() ? 1 : 2) * 879183050;
            }

            this.field4458 = null;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lma;Lda;)V")
   @ObfuscatedName("hd")
   public static void method7488(classMA var0, classDA var1) {
      if (var0.field4458 != null && var0.field4458.method4106(2143399039)) {
         byte[] var2 = var0.field4458.method4112(1145062404);
         if (var2 == null) {
            var0.method7480(830641263);
            var0.field4457 = -334074428;
         } else {
            try {
               classWE var3 = new classWE(var2);
               JSONObject var4 = var3.method12351(-1454626184);
               if (var4 == null) {
                  return;
               }

               try {
                  var0.field4453 = var4.getInt("version") * 2102857035;
               } catch (Exception var7) {
                  var0.method7480(830641263);
                  var0.field4457 = -501111642;
                  return;
               }

               if (-77327261 * var0.field4453 < 2) {
                  if (!var0.field4456.method7665(var4, var0.field4453 * -77327261, var1, -871865115)) {
                     var0.field4457 = -501111642;
                  }
               } else if (var0.field4453 * -77327261 == 2) {
                  classMI var5 = classMI.field4509;
                  var5.method7573(var4, -77327261 * var0.field4453, var1, (byte)62);
                  var0.field4456 = classMI.method7588(var5, var0.field4454, 1875992713);
                  if (var0.field4456 != null) {
                     var0.method7491((byte)43);
                     var0.field4457 = 2063965041;
                  } else {
                     var0.field4457 = 1562853399;
                  }
               }
            } catch (UnsupportedEncodingException var8) {
               var0.method7480(830641263);
               var0.field4457 = -501111642;
               return;
            }

            if (var0.field4456 != null) {
               var0.field4457 = (!var0.field4456.field4569.isEmpty() ? 1 : 2) * 2063965041;
            }

            var0.field4458 = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lda;)V")
   @ObfuscatedName("ck")
   void method7489(classDA var1) {
      if (this.field4458 != null && this.field4458.method4106(1883882099)) {
         byte[] var2 = this.field4458.method4112(1145062404);
         if (var2 == null) {
            this.method7480(830641263);
            this.field4457 = 1960821333;
         } else {
            try {
               classWE var3 = new classWE(var2);
               JSONObject var4 = var3.method12351(-409604338);
               if (var4 == null) {
                  return;
               }

               try {
                  this.field4453 = var4.getInt("version") * 2102857035;
               } catch (Exception var7) {
                  this.method7480(830641263);
                  this.field4457 = -501111642;
                  return;
               }

               if (-77327261 * this.field4453 < 2) {
                  if (!this.field4456.method7665(var4, this.field4453 * -77327261, var1, 206530222)) {
                     this.field4457 = -1138037083;
                  }
               } else if (this.field4453 * -26250067 == 2) {
                  classMI var5 = classMI.field4509;
                  var5.method7573(var4, -77327261 * this.field4453, var1, (byte)62);
                  this.field4456 = classMI.method7588(var5, this.field4454, 1837565031);
                  if (this.field4456 != null) {
                     this.method7491((byte)44);
                     this.field4457 = -435892734;
                  } else {
                     this.field4457 = 1562853399;
                  }
               }
            } catch (UnsupportedEncodingException var8) {
               this.method7480(830641263);
               this.field4457 = -910156673;
               return;
            }

            if (this.field4456 != null) {
               this.field4457 = (!this.field4456.field4569.isEmpty() ? 1 : 2) * 2063965041;
            }

            this.field4458 = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lda;I)V")
   @ObfuscatedName("ab")
   public void method7438(classDA var1, int var2) {
      try {
         switch (this.field4457 * 2013644177) {
            case 0:
               this.method7485(var1, 244281169);
               break;
            case 1:
               this.method7491((byte)-66);
               break;
            default:
               return;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ma.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lma;B)Z")
   @ObfuscatedName("ms")
   public static boolean method7444(classMA var0, byte var1) {
      if (var0 == null) {
         var0.method7445(var1);
      }

      try {
         boolean var10000;
         if (var0.field4456 != null) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ma.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lda;)V")
   @ObfuscatedName("cc")
   void method7490(classDA var1) {
      if (this.field4458 != null && this.field4458.method4106(1918253488)) {
         byte[] var2 = this.field4458.method4112(1145062404);
         if (var2 == null) {
            this.method7480(830641263);
            this.field4457 = -334074428;
         } else {
            try {
               classWE var3 = new classWE(var2);
               JSONObject var4 = var3.method12351(2025364238);
               if (var4 == null) {
                  return;
               }

               try {
                  this.field4453 = var4.getInt("version") * -1948279175;
               } catch (Exception var7) {
                  this.method7480(830641263);
                  this.field4457 = 1624395695;
                  return;
               }

               if (-77327261 * this.field4453 < 2) {
                  if (!this.field4456.method7665(var4, this.field4453 * -77327261, var1, 544090393)) {
                     this.field4457 = -838783784;
                  }
               } else if (this.field4453 * 1986726248 == 2) {
                  classMI var5 = classMI.field4509;
                  var5.method7573(var4, -77327261 * this.field4453, var1, (byte)62);
                  this.field4456 = classMI.method7588(var5, this.field4454, 1856021970);
                  if (this.field4456 != null) {
                     this.method7491((byte)62);
                     this.field4457 = 2063965041;
                  } else {
                     this.field4457 = 1562853399;
                  }
               }
            } catch (UnsupportedEncodingException var8) {
               this.method7480(830641263);
               this.field4457 = -501111642;
               return;
            }

            if (this.field4456 != null) {
               this.field4457 = (!this.field4456.field4569.isEmpty() ? 1 : 2) * 1839944167;
            }

            this.field4458 = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/ArrayList;")
   @ObfuscatedName("bo")
   public ArrayList method7457() {
      return this.field4456.field4569;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cn")
   void method7494() {
      for (classMN var2 : this.field4456.field4569) {
         if (var2.field4544 != null && !var2.field4544.method4106(2114548647)) {
            return;
         }
      }

      for (classMN var5 : this.field4456.field4569) {
         if (var5.field4544 != null) {
            byte[] var3 = var5.field4544.method4112(1145062404);
            if (var3 != null && var3.length > 0) {
               this.field4457 = -167037214;
               return;
            }
         }
      }

      this.method7480(830641263);
      this.field4457 = 1729890613;
   }

   @ObfuscatedSignature(descriptor = "(Lma;I)Ljava/util/ArrayList;")
   @ObfuscatedName("bn")
   public static ArrayList method7459(classMA var0, int var1) {
      if (var0 == null) {
         var0.method7460(var1);
      }

      try {
         return var0.field4456.field4568;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ma.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("aj")
   public String method7478(int var1) {
      try {
         return this.field4456.method7657(-1747304644);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ma.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lda;)Z")
   @ObfuscatedName("cz")
   public boolean method7496(String var1, classDA var2) {
      try {
         JSONObject var3 = new classWE(var1.getBytes()).method12351(715370973);

         try {
            this.field4453 = var3.getInt("version") * 2102857035;
         } catch (Exception var5) {
            this.method7480(830641263);
            this.field4457 = -501111642;
            return false;
         }

         if (!this.field4456.method7665(var3, this.field4453 * -77327261, var2, -825536582)) {
            this.field4457 = -501111642;
         }

         this.field4457 = (!this.field4456.field4569.isEmpty() ? 1 : 2) * 2063965041;
      } catch (UnsupportedEncodingException var6) {
         this.field4457 = -501111642;
      }

      return 2013644177 * this.field4457 < 3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;)V")
   @ObfuscatedName("so")
   public static void method7500(classLH var0) {
      if (var0 == null) {
         var0.method6987();
      }

      if (!classLH.method6876(var0, 455461300) && var0.field4157 * 1881504364 < var0.field4159.method13850(1156680128)) {
         int var1 = classZD.method13892(var0.field4159, var0.field4157 * -805335206, -1596338929);
         var0.method7095((byte)26);
         classLH.method6882(var0, var1, var1, 1122842785);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lda;)Z")
   @ObfuscatedName("cg")
   public boolean method7497(String var1, classDA var2) {
      try {
         JSONObject var3 = new classWE(var1.getBytes()).method12351(-1749028600);

         try {
            this.field4453 = var3.getInt("version") * 2102857035;
         } catch (Exception var5) {
            this.method7480(830641263);
            this.field4457 = -501111642;
            return false;
         }

         if (!this.field4456.method7665(var3, this.field4453 * -77327261, var2, 424477085)) {
            this.field4457 = 502777749;
         }

         this.field4457 = (!this.field4456.field4569.isEmpty() ? 1 : 2) * -160518245;
      } catch (UnsupportedEncodingException var6) {
         this.field4457 = -655046227;
      }

      return 2013644177 * this.field4457 < 3;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lda;)Z")
   @ObfuscatedName("cw")
   public boolean method7498(String var1, classDA var2) {
      try {
         JSONObject var3 = new classWE(var1.getBytes()).method12351(1092751847);

         try {
            this.field4453 = var3.getInt("version") * -2058911701;
         } catch (Exception var5) {
            this.method7480(830641263);
            this.field4457 = 1035077920;
            return false;
         }

         if (!this.field4456.method7665(var3, this.field4453 * -77327261, var2, 138812393)) {
            this.field4457 = -501111642;
         }

         this.field4457 = (!this.field4456.field4569.isEmpty() ? 1 : 2) * 2063965041;
      } catch (UnsupportedEncodingException var6) {
         this.field4457 = 654427332;
      }

      return 2013644177 * this.field4457 < 3;
   }

   @ObfuscatedSignature(descriptor = "(B)[Lkw;")
   @ObfuscatedName("ag")
   public static classKW[] method7428(byte var0) {
      try {
         return new classKW[]{classKW.field4039, classKW.field4043, classKW.field4041, classKW.field4040};
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "ma.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lma;B)Ljava/util/ArrayList;")
   @ObfuscatedName("xt")
   public static ArrayList method7462(classMA var0, byte var1) {
      if (var0 == null) {
         var0.method7463(var1);
      }

      try {
         return var0.field4456.field4575;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ma.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lte;II)V")
   @ObfuscatedName("ag")
   static void method7501(classTE var0, int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= 404036101) {
               throw new IllegalStateException();
            }

            if (var1 < var0.method10756(-1919429894)) {
               return;
            }

            if (var2 <= 404036101) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException();
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ma.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
   @ObfuscatedName("ae")
   public void method7435(String var1, String var2, String var3, short var4) {
      try {
         this.field4460 = classHS.method6101(-1819480864);
         this.field4455 = var1;
         this.field4460.method7708(this.field4455, var2, var3, -714017036);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ma.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("as")
   public boolean method7445(byte var1) {
      try {
         boolean var10000;
         if (this.field4456 != null) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ma.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;S)I")
   @ObfuscatedName("ax")
   public int method7451(String var1, short var2) {
      try {
         int var10000;
         if (this.field4456.field4572.containsKey(var1)) {
            if (var2 >= 376) {
               throw new IllegalStateException();
            }

            var10000 = (Integer)this.field4456.field4572.get(var1);
         } else {
            var10000 = -1;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ma.ax(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/util/ArrayList;")
   @ObfuscatedName("ao")
   public ArrayList method7460(int var1) {
      try {
         return this.field4456.field4575;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ma.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/util/ArrayList;")
   @ObfuscatedName("al")
   public ArrayList method7463(byte var1) {
      try {
         return this.field4456.field4569;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ma.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("aq")
   public String method7469(int var1) {
      try {
         return this.field4456.field4570;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ma.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lda;I)Z")
   @ObfuscatedName("ai")
   public boolean method7499(String var1, classDA var2, int var3) {
      try {
         try {
            JSONObject var4 = new classWE(var1.getBytes()).method12351(-1045745323);

            try {
               this.field4457 = var4.getInt("version") * 2102857035;
            } catch (Exception var6) {
               this.method7480(830641263);
               this.field4457 = -501111642;
               return false;
            }

            if (!this.field4456.method7665(var4, this.field4453 * -77327261, var2, 1889800462)) {
               if (var3 <= 992027348) {
                  throw new IllegalStateException();
               }

               this.field4453 = -501111642;
            }

            byte var10001;
            if (!this.field4456.field4575.isEmpty()) {
               if (var3 <= 992027348) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 2;
            }

            this.field4453 = var10001 * 2063965041;
         } catch (UnsupportedEncodingException var7) {
            this.field4457 = -501111642;
         }

         boolean var10000;
         if (2013644177 * this.field4457 < 3) {
            if (var3 <= 992027348) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "ma.ai(" + ')');
      }
   }
}
