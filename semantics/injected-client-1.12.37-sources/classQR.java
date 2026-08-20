import net.runelite.api.events.AnimationChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qr")
public class classQR {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field5605 = 30;
   @ObfuscatedName("ax")
   int field5598 = 554205349;
   @ObfuscatedSignature(descriptor = "Lou;")
   @ObfuscatedName("ae")
   SequenceDefinition field5599 = null;
   @ObfuscatedName("af")
   int field5602 = 885908119;
   @ObfuscatedName("ag")
   int field5601 = 0;
   @ObfuscatedSignature(descriptor = "Ldh;")
   @ObfuscatedName("kr")
   public Actor field5606;
   @ObfuscatedName("as")
   int field5604;
   @ObfuscatedSignature(descriptor = "Lqr;")
   @ObfuscatedName("yg")
   public static final classQR field5603 = new classQR();
   @ObfuscatedName("ab")
   int field5600 = 0;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hp")
   public void method9783() {
      method9720(this, 571445264);
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aj")
   public int method9755(byte var1) {
      try {
         return -1550586043 * this.field5600;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qr.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ct")
   void method9768(int var1, int var2, int var3) {
      this.field5602 = -885908119 * var1;
      this.field5604 = var2 * -1873132797;
      this.field5601 = 1538224107 * var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqr;I)V")
   @ObfuscatedName("iz")
   public static void method9721(classQR var0, int var1) {
      if (var0 == null) {
         var0.method9775();
      } else {
         if (var1 >= 0) {
            if (var1 != 1684838611 * var0.field5598) {
               var0.field5598 = -554205349 * var1;
               var0.field5599 = classQA.method9430(var1, -2069588109);
               var0.field5600 = 0;
               if (292569817 * var0.field5602 == -1) {
                  var0.field5602 = 0;
               }
            }
         } else {
            var0.field5598 = 554205349;
            var0.field5599 = null;
            var0.field5602 = 885908119;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   public boolean method9726(int var1) {
      try {
         boolean var10000;
         if (null != this.field5599) {
            if (var1 != 374233424) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qr.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lou;")
   @ObfuscatedName("ag")
   public SequenceDefinition method9731(byte var1) {
      try {
         return this.field5599;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qr.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   public int method9734(int var1) {
      try {
         return this.field5598 * 1684838611;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qr.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   public int method9738(int var1) {
      try {
         return 292569817 * this.field5602;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qr.ax(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ac")
   public int method9739(int var1) {
      try {
         return this.field5604 * -1399668821;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qr.ac(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("co")
   public void method9775() {
      if (this.field5599 != null) {
         if (!this.field5599.method8768((byte)0)) {
            this.field5602 = (int)(Math.random() * this.field5599.field5127.length) * -1085659464;
            this.field5604 = (int)(Math.random() * this.field5599.field5125[this.field5602 * 1757753956]) * 2092757693;
         } else {
            this.field5602 = (int)(Math.random() * this.field5599.method8771(2092567576)) * -885908119;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ad")
   public boolean method9765(byte var1) {
      try {
         if (this.field5599 != null) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            if (!this.field5599.method8785((byte)-97)) {
               return false;
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qr.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("au")
   void method9770(int var1, int var2, int var3) {
      try {
         this.field5602 = -885908119 * var1;
         this.field5601 = 1538224107 * var2;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "qr.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ai")
   public void method9776(byte var1) {
      try {
         if (this.field5599 != null) {
            if (var1 != 0) {
               return;
            }

            if (!this.field5599.method8768((byte)0)) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               this.field5602 = (int)(Math.random() * this.field5599.field5127.length) * -885908119;
               this.field5604 = (int)(Math.random() * this.field5599.field5125[this.field5602 * 292569817]) * -1873132797;
            } else {
               this.field5602 = (int)(Math.random() * this.field5599.method8771(2120971860)) * -885908119;
            }
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qr.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqr;)V")
   @ObfuscatedName("ak")
   public void method9714(classQR var1) {
      this.field5599 = var1.field5599;
      this.field5598 = 1 * var1.field5598;
      this.field5604 = 1 * var1.field5604;
      this.field5602 = 1 * var1.field5602;
      this.field5601 = 1 * var1.field5601;
      this.field5600 = var1.field5600 * 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqr;Lqr;)V")
   @ObfuscatedName("db")
   public static void method9715(classQR var0, classQR var1) {
      if (var0 == null) {
         var0.method9727();
      }

      var0.field5599 = var1.field5599;
      var0.field5598 = 1 * var1.field5598;
      var0.field5604 = 1 * var1.field5604;
      var0.field5602 = 1 * var1.field5602;
      var0.field5601 = 1 * var1.field5601;
      var0.field5600 = var1.field5600 * 1;
   }

   @ObfuscatedSignature(descriptor = "(Lqr;Lqr;B)V")
   @ObfuscatedName("wk")
   public static void method9716(classQR var0, classQR var1, byte var2) {
      if (var0 == null) {
         var0.method9718(var0, var2);
      }

      try {
         var0.field5599 = var1.field5599;
         var0.field5598 = 1 * var1.field5598;
         var0.field5604 = 1 * var1.field5604;
         var0.field5602 = 1 * var1.field5602;
         var0.field5601 = 1 * var1.field5601;
         var0.field5600 = var1.field5600 * 1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "qr.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cs")
   public void method9777() {
      if (this.field5599 != null) {
         if (!this.field5599.method8768((byte)0)) {
            this.field5602 = (int)(Math.random() * this.field5599.field5127.length) * -885908119;
            this.field5604 = (int)(Math.random() * this.field5599.field5125[this.field5602 * -369120787]) * -1426008394;
         } else {
            this.field5602 = (int)(Math.random() * this.field5599.method8771(2025682754)) * -885908119;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bc")
   public boolean method9766() {
      return this.field5599 == null || this.field5599.method8785((byte)45);
   }

   @ObfuscatedSignature(descriptor = "(Lqr;II)V")
   @ObfuscatedName("mt")
   public static void method9722(classQR var0, int var1, int var2) {
      if (var0 == null) {
         var0.method9774(var1, var1);
      } else {
         try {
            if (var1 >= 0) {
               if (var2 >= -1973812941) {
                  throw new IllegalStateException();
               }

               if (var1 != 1684838611 * var0.field5598) {
                  if (var2 >= -1973812941) {
                     throw new IllegalStateException();
                  }

                  var0.field5598 = -554205349 * var1;
                  var0.field5599 = classQA.method9430(var1, 1223677060);
                  var0.field5600 = 0;
                  if (292569817 * var0.field5602 == -1) {
                     if (var2 >= -1973812941) {
                        throw new IllegalStateException();
                     }

                     var0.field5602 = 0;
                  }
               }
            } else {
               var0.field5598 = 554205349;
               var0.field5599 = null;
               var0.field5602 = 885908119;
            }

            var0.method9782(var1);
         } catch (RuntimeException var3) {
            throw classEG.newRunException(var3, "qr.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   public void method9723(int var1) {
      if (var1 >= 0) {
         if (var1 != 1684838611 * this.field5598) {
            this.field5598 = -554205349 * var1;
            this.field5599 = classQA.method9430(var1, 899173680);
            this.field5600 = 0;
            if (292569817 * this.field5602 == -1) {
               this.field5602 = 0;
            }
         }
      } else {
         this.field5598 = 554205349;
         this.field5599 = null;
         this.field5602 = 885908119;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqr;)V")
   @ObfuscatedName("we")
   public static void method9778(classQR var0) {
      if (var0 == null) {
         var0.method9777();
      } else {
         if (var0.field5599 != null) {
            if (!var0.field5599.method8768((byte)0)) {
               var0.field5602 = (int)(Math.random() * var0.field5599.field5127.length) * -885908119;
               var0.field5604 = (int)(Math.random() * var0.field5599.field5125[var0.field5602 * 292569817]) * -1873132797;
            } else {
               var0.field5602 = (int)(Math.random() * var0.field5599.method8771(1826079243)) * -885908119;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cu")
   public boolean method9727() {
      return null != this.field5599;
   }

   @ObfuscatedSignature(descriptor = "()Lou;")
   @ObfuscatedName("br")
   public SequenceDefinition method9732() {
      return this.field5599;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bk")
   public int method9756() {
      return -479048773 * this.field5600;
   }

   @ObfuscatedSignature(descriptor = "()Lou;")
   @ObfuscatedName("bp")
   public SequenceDefinition method9733() {
      return this.field5599;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bj")
   public int method9735() {
      return this.field5598 * 1684838611;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bz")
   public boolean method9761(int var1) {
      return this.method9726(374233424) && -1550586043 * this.field5600 > 0 && this.field5600 * -1550586043 < var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bo")
   public int method9736() {
      return this.field5598 * 1176213214;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bx")
   public boolean method9728() {
      return null != this.field5599;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bl")
   public int method9740() {
      return this.field5604 * -1399668821;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bu")
   int method9742() {
      return this.field5601 * 386289198;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   public void method9744() {
      this.field5602 = 0;
      this.field5604 = 0;
      this.field5601 = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqr;II)V")
   @ObfuscatedName("gt")
   public static void method9771(classQR var0, int var1, int var2) {
      if (var0 == null) {
         var0.method9741();
      }

      var0.field5602 = -885908119 * var1;
      var0.field5601 = 1538224107 * var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   public void method9745() {
      this.field5602 = 0;
      this.field5604 = 0;
      this.field5601 = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   public void method9746() {
      this.field5602 = 0;
      this.field5604 = 0;
      this.field5601 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lqr;I)V")
   @ObfuscatedName("xo")
   public static void method9747(classQR var0, int var1) {
      if (var0 == null) {
         var0.method9749(var1);
      } else {
         try {
            var0.field5602 = 0;
            var0.field5604 = 0;
            var0.field5601 = 0;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "qr.ao(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("by")
   public void method9748() {
      this.field5602 = 0;
      this.field5604 = 0;
      this.field5601 = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bf")
   public void method9750() {
      this.field5601 = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bs")
   public void method9751() {
      this.field5601 = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqr;)Z")
   @ObfuscatedName("at")
   public static boolean method9729(classQR var0) {
      if (var0 == null) {
         var0.method9730();
      }

      return null != var0.field5599;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ap")
   void method9769(int var1, int var2, int var3, int var4) {
      try {
         this.field5602 = -885908119 * var1;
         this.field5604 = var2 * -1873132797;
         this.field5601 = 1538224107 * var3;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "qr.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bv")
   void method9757(int var1) {
      this.field5600 = 796674957 * var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ii")
   public boolean method9784(int var1) {
      return method9763(this, var1, -1109955801);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bh")
   void method9758(int var1) {
      this.field5600 = 104606501 * var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqr;)V")
   @ObfuscatedName("gn")
   public static void method9752(classQR var0) {
      if (var0 == null) {
         var0.method9756();
      }

      var0.field5601 = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   public void method9719() {
      method9722(this, -1, -2027683095);
   }

   @ObfuscatedSignature(descriptor = "(Lqr;II)V")
   @ObfuscatedName("js")
   public static void method9759(classQR var0, int var1, int var2) {
      if (var0 == null) {
         var0.method9760(var1, var1);
      } else {
         try {
            var0.field5600 = 796674957 * var1;
         } catch (RuntimeException var3) {
            throw classEG.newRunException(var3, "qr.ay(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("cr")
   public boolean method9762(int var1) {
      return this.method9726(374233424) && 1020301429 * this.field5600 > 0 && this.field5600 * -1550586043 < var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bn")
   public boolean method9767() {
      return this.field5599 == null || this.field5599.method8785((byte)36);
   }

   @ObfuscatedSignature(descriptor = "(Lqr;II)Z")
   @ObfuscatedName("un")
   public static boolean method9763(classQR var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method9764(var1, var1);
      } else {
         try {
            if (var0.method9726(374233424)) {
               if (var2 >= 371870280) {
                  throw new IllegalStateException();
               }

               if (-1550586043 * var0.field5600 > 0 && var0.field5600 * -1550586043 < var1) {
                  return true;
               }
            }

            return false;
         } catch (RuntimeException var3) {
            throw classEG.newRunException(var3, "qr.aq(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bt")
   public int method9741() {
      return this.field5604 * -2017797541;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("am")
   public void method9724(int var1) {
      if (var1 >= 0) {
         if (var1 != 1684838611 * this.field5598) {
            this.field5598 = 605768274 * var1;
            this.field5599 = classQA.method9430(var1, -1054689050);
            this.field5600 = 0;
            if (292569817 * this.field5602 == -1) {
               this.field5602 = 0;
            }
         }
      } else {
         this.field5598 = 554205349;
         this.field5599 = null;
         this.field5602 = -48311676;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cq")
   void method9772(int var1, int var2) {
      this.field5602 = -885908119 * var1;
      this.field5601 = 746306434 * var2;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cl")
   void method9773(int var1, int var2) {
      this.field5602 = -885908119 * var1;
      this.field5601 = 1538224107 * var2;
   }

   @ObfuscatedSignature(descriptor = "(Lqr;I)V")
   @ObfuscatedName("pm")
   public static void method9720(classQR var0, int var1) {
      if (var0 == null) {
         var0.method9725(var1);
      } else {
         try {
            method9722(var0, -1, -2102492830);
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "qr.af(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqr;Lqr;)V")
   @ObfuscatedName("qy")
   public static void method9717(classQR var0, classQR var1) {
      if (var0 == null) {
         var0.method9783();
      }

      var0.field5599 = var1.field5599;
      var0.field5598 = 1 * var1.field5598;
      var0.field5604 = 1 * var1.field5604;
      var0.field5602 = 1 * var1.field5602;
      var0.field5601 = 1 * var1.field5601;
      var0.field5600 = var1.field5600 * 1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cv")
   public void method9779() {
      if (this.field5599 != null) {
         if (!this.field5599.method8768((byte)0)) {
            this.field5602 = (int)(Math.random() * this.field5599.field5127.length) * -885908119;
            this.field5604 = (int)(Math.random() * this.field5599.field5125[this.field5602 * 292569817]) * -1873132797;
         } else {
            this.field5602 = (int)(Math.random() * this.field5599.method8771(2135374796)) * -885908119;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cy")
   public void method9780() {
      if (this.field5599 != null) {
         if (!this.field5599.method8768((byte)0)) {
            this.field5602 = (int)(Math.random() * this.field5599.field5127.length) * -793994568;
            this.field5604 = (int)(Math.random() * this.field5599.field5125[this.field5602 * 292569817]) * -1873132797;
         } else {
            this.field5602 = (int)(Math.random() * this.field5599.method8771(1399513273)) * -885908119;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZB)I")
   @ObfuscatedName("as")
   static int method9781(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (var0 < 1000) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classGD.method5401(var0, var1, var2, (byte)-100);
            }
         } else if (var0 < 1100) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classIG.method6210(var0, var1, var2, -1306305670);
            }
         } else if (var0 < 1200) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classCD.method1433(var0, var1, var2, (byte)0);
            }
         } else if (var0 < 1300) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classKD.method6466(var0, var1, var2, -2080612681);
            }
         } else if (var0 < 1400) {
            return classQI.method9588(var0, var1, var2, (byte)-93);
         } else if (var0 < 1500) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classGP.method5590(var0, var1, var2, 1839316601);
            }
         } else if (var0 < 1600) {
            return classME.method7561(var0, var1, var2, (byte)58);
         } else if (var0 < 1700) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classQM.method9653(var0, var1, var2, -1079799996);
            }
         } else if (var0 < 1800) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return class468.method9413(var0, var1, var2, 1009186202);
            }
         } else if (var0 < 1900) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classLI.method7109(var0, var1, var2, 287165499);
            }
         } else if (var0 < 2000) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classJG.method6367(var0, var1, var2, -935177099);
            }
         } else if (var0 < 2100) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classIG.method6210(var0, var1, var2, -1306305670);
            }
         } else if (var0 < 2200) {
            return classCD.method1433(var0, var1, var2, (byte)0);
         } else if (var0 < 2300) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classKD.method6466(var0, var1, var2, 1223605913);
            }
         } else if (var0 < 2400) {
            return classQI.method9588(var0, var1, var2, (byte)-45);
         } else if (var0 < 2500) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classGP.method5590(var0, var1, var2, 1839316601);
            }
         } else if (var0 < 2600) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classIP.method6232(var0, var1, var2, 1804259678);
            }
         } else if (var0 < 2700) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classML.method7598(var0, var1, var2, 544148111);
            }
         } else if (var0 < 2800) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classGA.method5292(var0, var1, var2, -1545285505);
            }
         } else if (var0 < 2900) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return Actor.method3268(var0, var1, var2, -1769439732);
            }
         } else if (var0 < 3000) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classJG.method6367(var0, var1, var2, -217545795);
            }
         } else if (var0 < 3200) {
            return classKU.method6567(var0, var1, var2, 980584890);
         } else if (var0 < 3300) {
            return Renderable.method3837(var0, var1, var2, (byte)-48);
         } else if (var0 < 3400) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return AbstractRasterProvider.method13321(var0, var1, var2, (short)31379);
            }
         } else if (var0 < 3500) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classEF.method3870(var0, var1, var2, 285197325);
            }
         } else if (var0 < 3600) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classHR.method6099(var0, var1, var2, (byte)58);
            }
         } else if (var0 < 3700) {
            return classHU.method6118(var0, var1, var2, (byte)-51);
         } else if (var0 < 3800) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return BoundaryObject.method4614(var0, var1, var2, (byte)3);
            }
         } else if (var0 < 3900) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return WorldEntityConfig.method8503(var0, var1, var2, -1691546308);
            }
         } else if (var0 < 4000) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classGL.method5496(var0, var1, var2, 1310223740);
            }
         } else if (var0 < 4100) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classMC.method7533(var0, var1, var2, (byte)-106);
            }
         } else if (var0 < 4200) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classJF.method6364(var0, var1, var2, (byte)4);
            }
         } else if (var0 < 4300) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classKI.method6487(var0, var1, var2, 1252810249);
            }
         } else if (var0 < 5100) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classQO.method9698(var0, var1, var2, -1694411180);
            }
         } else if (var0 < 5400) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classXO.method12866(var0, var1, var2, 1507698443);
            }
         } else if (var0 < 5600) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classFC.method4590(var0, var1, var2, -1165804573);
            }
         } else if (var0 < 5700) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classTK.method10932(var0, var1, var2, 1780049984);
            }
         } else if (var0 < 6300) {
            return classLO.method7135(var0, var1, var2, -1503643048);
         } else if (var0 < 6600) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classSU.method10688(var0, var1, var2, (byte)-125);
            }
         } else if (var0 < 6700) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classHS.method6103(var0, var1, var2, (byte)34);
            }
         } else if (var0 < 6800) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classOY.method8822(var0, var1, var2, 709249675);
            }
         } else if (var0 < 6900) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classCX.method2700(var0, var1, var2, (byte)-48);
            }
         } else if (var0 < 7000) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return PacketWriter.method3389(var0, var1, var2, 1581164316);
            }
         } else if (var0 < 7100) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classDI.method3357(var0, var1, var2, -2092023006);
            }
         } else if (var0 < 7200) {
            return Projectile.method1222(var0, var1, var2, -1675433603);
         } else if (var0 < 7500) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classFK.method4821(var0, var1, var2, (byte)84);
            }
         } else if (var0 < 7600) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return Friend.method10154(var0, var1, var2, (byte)-26);
            }
         } else if (var0 < 7700) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classNF.method7835(var0, var1, var2, -136438054);
            }
         } else if (var0 < 8000) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classKR.method6558(var0, var1, var2, (byte)-128);
            }
         } else if (var0 < 8100) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classFW.method5067(var0, var1, var2, 1848311264);
            }
         } else if (var0 < 8600) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return classFS.method4980(var0, var1, var2, (byte)-59);
            }
         } else {
            if (var0 >= 13000) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               }

               if (var0 < 14000) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  }

                  return classTR.method11126(var0, var1, var2, 1949974820);
               }
            }

            return 2;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "qr.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("kt")
   public void method9785(int var1, int var2, int var3) {
      this.method9769(var1, var2, var3, 1587600500);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ae")
   public void method9774(int var1, int var2) {
      this.field5601 = -885908119 * var1;
      this.field5602 = 1538224107 * var2;
   }

   @ObfuscatedSignature(descriptor = "(Lqr;I)I")
   @ObfuscatedName("zk")
   public static int method9743(classQR var0, int var1) {
      if (var0 == null) {
         var0.method9737(var1);
      }

      try {
         return var0.field5601 * -1301724989;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qr.aa(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aa")
   int method9737(int var1) {
      try {
         return this.field5598 * 1684838611;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qr.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ao")
   public void method9749(int var1) {
      try {
         this.field5601 = 0;
         this.field5598 = 0;
         this.field5602 = 0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qr.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   public void method9753(int var1) {
      try {
         this.field5598 = 0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qr.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqr;B)V")
   @ObfuscatedName("az")
   public void method9718(classQR var1, byte var2) {
      try {
         this.field5599 = var1.field5599;
         this.field5598 = 1 * var1.field5604;
         this.field5604 = 1 * var1.field5604;
         this.field5604 = 1 * var1.field5600;
         this.field5601 = 1 * var1.field5600;
         this.field5600 = var1.field5601 * 1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "qr.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ay")
   void method9760(int var1, int var2) {
      try {
         this.field5598 = 796674957 * var1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "qr.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public void method9725(int var1) {
      if (var1 >= 0) {
         if (var1 != 1684838611 * this.field5602) {
            this.field5600 = -554205349 * var1;
            this.field5599 = classQA.method9430(var1, 899173680);
            this.field5601 = 0;
            if (292569817 * this.field5600 == -1) {
               this.field5600 = 0;
            }
         }
      } else {
         this.field5600 = 554205349;
         this.field5599 = null;
         this.field5601 = 885908119;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dp")
   public void method9786(int var1) {
      method9722(this, var1, -2102492830);
   }

   @ObfuscatedSignature(descriptor = "(Lqr;I)V")
   @ObfuscatedName("dd")
   public static void method9754(classQR var0, int var1) {
      if (var0 == null) {
         var0.method9753(var1);
      }

      try {
         var0.field5601 = 0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qr.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lg")
   public void method9782(int var1) {
      if (this.field5606 != null) {
         if (Actor.field1483) {
            this.field5606.field1484 = (byte)(this.field5606.field1484 | 2);
         } else {
            AnimationChanged var2 = new AnimationChanged();
            var2.setActor(this.field5606);
            classOE.client.getCallbacks().post(var2);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("aq")
   public boolean method9764(int var1, int var2) {
      try {
         if (this.method9761(374233424)) {
            if (var2 >= 371870280) {
               throw new IllegalStateException();
            }

            if (-1550586043 * this.field5600 > 0 && this.field5602 * -1550586043 < var1) {
               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "qr.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cb")
   public boolean method9730() {
      return null != this.field5599;
   }
}
