import net.runelite.api.Nameable;
import net.runelite.api.events.NameableNameChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rr")
public class User implements Comparable, Nameable {
   @ObfuscatedSignature(descriptor = "Laae;")
   @ObfuscatedName("ae")
   classAAE field5835;
   @ObfuscatedSignature(descriptor = "Laae;")
   @ObfuscatedName("ab")
   classAAE field5834;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field5833 = 26;

   @ObfuscatedSignature(descriptor = "(B)Laae;")
   @ObfuscatedName("at")
   public classAAE method10166(byte var1) {
      try {
         return this.field5835;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rr.at(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrr;Laae;Laae;)V")
   @ObfuscatedName("og")
   public static void method10175(User var0, classAAE var1, classAAE var2) {
      if (var0 == null) {
         var0.method10167();
      }

      if (var1 == null) {
         throw new NullPointerException();
      } else {
         var0.field5835 = var1;
         var0.field5834 = var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cg")
   static int method10179(int var0) {
      try {
         int var1 = 2;
         Player var2 = classMB.method7521(-979057698);
         if (null != var2) {
            if (var0 >= 408219128) {
               throw new IllegalStateException();
            }

            if (null != var2.field1285) {
               if (var0 >= 408219128) {
                  throw new IllegalStateException();
               }

               var1 = -513083879 * var2.field1285.field4093;
            }
         }

         return var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rr.cg(" + 41);
      }
   }

   @Override
   public int compareTo(Object var1) {
      try {
         return this.vmethod562((User)var1, -30374874);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rr.compareTo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Laae;")
   @ObfuscatedName("pq")
   public classAAE method10181() {
      return this.field5835;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int vmethod565(Object var1) {
      return this.vmethod562((User)var1, -30374874);
   }

   @ObfuscatedSignature(descriptor = "(Lrr;)I")
   @ObfuscatedName("ak")
   public int vmethod563(User var1) {
      return classAAE.method182(this.field5835, var1.field5835, 1600959519);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lai;)I")
   @ObfuscatedName("xv")
   public static int method10178(classAI var0) {
      return -1031938045 * var0.field161;
   }

   @ObfuscatedSignature(descriptor = "()Laae;")
   @ObfuscatedName("mo")
   public classAAE method10182() {
      return this.field5834;
   }

   @ObfuscatedSignature(descriptor = "(Lrr;B)Ljava/lang/String;")
   @ObfuscatedName("ug")
   public static String method10171(User var0, byte var1) {
      if (var0 == null) {
         var0.method10174(var1);
      }

      try {
         return var0.field5834 == null ? "" : var0.field5834.method164(1422453419);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rr.am(" + ')');
      }
   }

   User() {
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lb")
   public void method10180(int var1) {
      NameableNameChanged var2 = new NameableNameChanged(this);
      classOE.field4843.getCallbacks().post(var2);
   }

   @ObfuscatedSignature(descriptor = "()Laae;")
   @ObfuscatedName("bx")
   public classAAE method10167() {
      return this.field5835;
   }

   @ObfuscatedSignature(descriptor = "()Laae;")
   @ObfuscatedName("bc")
   public classAAE method10168() {
      return this.field5835;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("br")
   public String method10169() {
      return null == this.field5835 ? "" : this.field5835.method164(727142096);
   }

   @ObfuscatedSignature(descriptor = "(Lrr;Laae;Laae;I)V")
   @ObfuscatedName("ti")
   public static void method10176(User var0, classAAE var1, classAAE var2, int var3) {
      if (var0 == null) {
         var0.method10177(var1, var1, var3);
      } else {
         try {
            if (var1 == null) {
               if (var3 < -1645256279) {
                  throw new NullPointerException();
               }
            } else {
               var0.field5835 = var1;
               var0.field5834 = var2;
               var0.method10180(-1);
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "rr.ah(" + ')');
         }
      }
   }

   public String getPrevName() {
      classAAE var1 = this.method10182();
      return var1 == null ? null : var1.method186();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bp")
   public String method10172() {
      return this.field5834 == null ? "" : this.field5834.method164(1695596637);
   }

   public String getName() {
      return this.method10181().method186();
   }

   @ObfuscatedSignature(descriptor = "(Lrr;I)I")
   @ObfuscatedName("aw")
   public int vmethod562(User var1, int var2) {
      try {
         return classAAE.method182(this.field5835, var1.field5835, 1600959519);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "rr.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;B)Ljava/lang/String;")
   @ObfuscatedName("gz")
   public static String method10170(User var0, byte var1) {
      if (var0 == null) {
         var0.method10173(var1);
      }

      try {
         if (null == var0.field5835) {
            if (var1 != 1) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else {
            return var0.field5835.method164(1523204793);
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rr.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrr;)I")
   @ObfuscatedName("av")
   public int vmethod564(User var1) {
      return classAAE.method182(this.field5835, var1.field5835, 1600959519);
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("an")
   public String method10173(byte var1) {
      try {
         return this.field5835 == null ? "" : this.field5835.method166(1422453419);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rr.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Laae;Laae;I)V")
   @ObfuscatedName("ah")
   void method10177(classAAE var1, classAAE var2, int var3) {
      try {
         if (var1 == null) {
            if (var3 < -1645256279) {
               throw new NullPointerException();
            }
         } else {
            this.field5835 = var1;
            this.field5834 = var2;
            this.method10180(-1);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "rr.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("am")
   public String method10174(byte var1) {
      try {
         return this.field5835 == null ? "" : this.field5835.method164(1422453419);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rr.am(" + ')');
      }
   }
}
