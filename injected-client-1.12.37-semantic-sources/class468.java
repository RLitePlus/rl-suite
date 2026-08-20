import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pz")
public class class468 extends AbstractQueue {
   @ObfuscatedName("ae")
   Map field5496;
   @ObfuscatedSignature(descriptor = "[Lpd;")
   @ObfuscatedName("af")
   classPD[] field5495;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field5498 = 2;
   @ObfuscatedName("ab")
   int field5497;
   @ObfuscatedName("ag")
   int field5494 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ba")
   public static final int field5501 = 76;
   @ObfuscatedName("az")
   final Comparator field5493;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field5500 = 21;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field5499 = 70;

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/Object;")
   @ObfuscatedName("bl")
   public Object[] method9408() {
      Object[] var1 = super.toArray();
      if (null != this.field5493) {
         Arrays.sort(var1, this.field5493);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public class468(int var1, Comparator var2) {
      this.field5495 = new classPD[var1];
      this.field5496 = new HashMap();
      this.field5493 = var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("aa")
   public boolean method9383(Object var1) {
      if (this.field5496.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         this.field5494 += 28979685;
         int var2 = 287626351 * this.field5497;
         if (var2 >= this.field5495.length) {
            this.method9376(-272147299);
         }

         this.field5497 += 544148111;
         if (var2 == 0) {
            this.field5495[0] = new classPD(var1, 0);
            this.field5496.put(var1, this.field5495[0]);
         } else {
            this.field5495[var2] = new classPD(var1, var2);
            this.field5496.put(var1, this.field5495[var2]);
            method9396(this, var2, -600400888);
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   void method9395(int var1) {
      classPD var2 = this.field5495[var1];

      while (var1 > 0) {
         int var3 = var1 - 1 >>> 1;
         classPD var4 = this.field5495[var3];
         if (null != this.field5493 ? this.field5493.compare(var2.field5224, var4.field5224) >= 0 : ((Comparable)var2.field5224).compareTo(var4.field5224) >= 0
            )
          {
            break;
         }

         this.field5495[var1] = var4;
         this.field5495[var1].field5223 = 39206217 * var1;
         var1 = var3;
      }

      this.field5495[var1] = var2;
      this.field5495[var1].field5223 = var1 * 39206217;
   }

   @Override
   public boolean offer(Object var1) {
      try {
         if (this.field5496.containsKey(var1)) {
            throw new IllegalArgumentException("");
         } else {
            this.field5494 += 28979685;
            int var2 = 287626351 * this.field5497;
            if (var2 >= this.field5495.length) {
               this.method9376(-783036677);
            }

            this.field5497 += 544148111;
            if (var2 == 0) {
               this.field5495[0] = new classPD(var1, 0);
               this.field5496.put(var1, this.field5495[0]);
            } else {
               this.field5495[var2] = new classPD(var1, var2);
               this.field5496.put(var1, this.field5495[var2]);
               method9396(this, var2, -1817699688);
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "pz.offer(" + ')');
      }
   }

   @Override
   public Object peek() {
      try {
         return this.field5497 * 287626351 == 0 ? null : this.field5495[0].field5224;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "pz.peek(" + ')');
      }
   }

   @Override
   public Object poll() {
      try {
         if (this.field5497 * 287626351 == 0) {
            return null;
         } else {
            this.field5494 += 28979685;
            Object var1 = this.field5495[0].field5224;
            this.field5496.remove(var1);
            this.field5497 -= 544148111;
            if (0 == 287626351 * this.field5497) {
               this.field5495[287626351 * this.field5497] = null;
            } else {
               this.field5495[0] = this.field5495[287626351 * this.field5497];
               this.field5495[0].field5223 = 0;
               this.field5495[287626351 * this.field5497] = null;
               this.method9400(0, (byte)51);
            }

            return var1;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pz.poll(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   void method9376(int var1) {
      try {
         int var2 = 1 + (this.field5495.length << 1);
         this.field5495 = Arrays.copyOf(this.field5495, var2);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "pz.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ae")
   void method9400(int var1, byte var2) {
      try {
         classPD var3 = this.field5495[var1];
         int var4 = this.field5497 * 287626351 >>> 1;

         while (var1 < var4) {
            int var9;
            int var5 = 1 + (var1 << 1);
            classPD var6 = this.field5495[var5];
            int var7 = (var1 << 1) + 2;
            classPD var8 = this.field5495[var7];
            label71:
            if (this.field5493 != null) {
               if (var2 <= 30) {
                  throw new IllegalStateException();
               }

               if (var7 < this.field5497 * 287626351) {
                  if (var2 <= 30) {
                     throw new IllegalStateException();
                  }

                  if (this.field5493.compare(var6.field5224, var8.field5224) > 0) {
                     var9 = var7;
                     break label71;
                  }
               }

               var9 = var5;
            } else if (var7 < this.field5497 * 287626351 && ((Comparable)var6.field5224).compareTo(var8.field5224) > 0) {
               var9 = var7;
            } else {
               var9 = var5;
            }

            if (this.field5493 != null) {
               if (var2 <= 30) {
                  throw new IllegalStateException();
               }

               if (this.field5493.compare(var3.field5224, this.field5495[var9].field5224) <= 0) {
                  if (var2 <= 30) {
                     throw new IllegalStateException();
                  }
                  break;
               }
            } else if (((Comparable)var3.field5224).compareTo(this.field5495[var9].field5224) <= 0) {
               if (var2 <= 30) {
                  throw new IllegalStateException();
               }
               break;
            }

            this.field5495[var1] = this.field5495[var9];
            this.field5495[var1].field5223 = 39206217 * var1;
            var1 = var9;
         }

         this.field5495[var1] = var3;
         this.field5495[var1].field5223 = 39206217 * var1;
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "pz.ae(" + ')');
      }
   }

   @Override
   public boolean contains(Object var1) {
      try {
         return this.field5496.containsKey(var1);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pz.contains(" + ')');
      }
   }

   @Override
   public Object[] toArray() {
      try {
         Object[] var1 = super.toArray();
         if (null != this.field5493) {
            Arrays.sort(var1, this.field5493);
         } else {
            Arrays.sort(var1);
         }

         return var1;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pz.toArray(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpz;)V")
   @ObfuscatedName("hx")
   public static void method9377(class468 var0) {
      int var1 = 1 + (var0.field5495.length << 1);
      var0.field5495 = Arrays.copyOf(var0.field5495, var1);
   }

   @ObfuscatedSignature(descriptor = "(Lpz;II)V")
   @ObfuscatedName("es")
   public static void method9396(class468 var0, int var1, int var2) {
      if (var0 == null) {
         var0.method9399(var1, var1);
      }

      try {
         classPD var3 = var0.field5495[var1];

         while (var1 > 0) {
            if (var2 == -311609591) {
               throw new IllegalStateException();
            }

            int var4 = var1 - 1 >>> 1;
            classPD var5 = var0.field5495[var4];
            if (null != var0.field5493) {
               if (var2 == -311609591) {
                  throw new IllegalStateException();
               }

               if (var0.field5493.compare(var3.field5224, var5.field5224) >= 0) {
                  if (var2 == -311609591) {
                     return;
                  }
                  break;
               }
            } else if (((Comparable)var3.field5224).compareTo(var5.field5224) >= 0) {
               if (var2 == -311609591) {
                  return;
               }
               break;
            }

            var0.field5495[var1] = var5;
            var0.field5495[var1].field5223 = 39206217 * var1;
            var1 = var4;
         }

         var0.field5495[var1] = var3;
         var0.field5495[var1].field5223 = var1 * 39206217;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "pz.af(" + ')');
      }
   }

   @Override
   public Iterator iterator() {
      try {
         return new classPJ(this);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "pz.iterator(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("by")
   public Iterator method9410() {
      return new classPJ(this);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bu")
   public int method9380() {
      return this.field5497 * 287626351;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ba")
   public int method9381() {
      return this.field5497 * -1145225963;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bw")
   public int method9382() {
      return this.field5497 * -445912804;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("be")
   public Iterator method9411() {
      return new classPJ(this);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("aj")
   public Object method9387() {
      return this.field5497 * 287626351 == 0 ? null : this.field5495[0].field5224;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("bs")
   public boolean method9404(Object var1) {
      return this.field5496.containsKey(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("bf")
   public boolean method9405(Object var1) {
      return this.field5496.containsKey(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;FFF)F")
   @ObfuscatedName("ek")
   public static float method9412(classUU var0, float var1, float var2, float var3) {
      return var0.field6385 * var1 + var2 * var0.field6398 + var3 * var0.field6401 + var0.field6400;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ap")
   public Object method9390() {
      if (this.field5497 * 287626351 == 0) {
         return null;
      } else {
         this.field5494 += 28979685;
         Object var1 = this.field5495[0].field5224;
         this.field5496.remove(var1);
         this.field5497 -= 544148111;
         if (0 == -381703462 * this.field5497) {
            this.field5495[947729427 * this.field5497] = null;
         } else {
            this.field5495[0] = this.field5495[287626351 * this.field5497];
            this.field5495[0].field5223 = 0;
            this.field5495[1754112399 * this.field5497] = null;
            this.method9400(0, (byte)93);
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/Object;")
   @ObfuscatedName("bv")
   public Object[] method9409() {
      Object[] var1 = super.toArray();
      if (null != this.field5493) {
         Arrays.sort(var1, this.field5493);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("cr")
   public boolean method9394(Object var1) {
      classPD var2 = (classPD)this.field5496.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         this.field5494 += 86028947;
         this.field5497 -= 544148111;
         if (this.field5497 * 567489560 == -1084304384 * var2.field5223) {
            this.field5495[this.field5497 * 173934231] = null;
            return true;
         } else {
            classPD var3 = this.field5495[287626351 * this.field5497];
            this.field5495[287626351 * this.field5497] = null;
            this.field5495[var2.field5223 * 908018937] = var3;
            this.field5495[var2.field5223 * -1897822583].field5223 = 1 * var2.field5223;
            this.method9400(var2.field5223 * 1803005518, (byte)120);
            if (var3 == this.field5495[908018937 * var2.field5223]) {
               method9396(this, var2.field5223 * 908018937, -1974466018);
            }

            return true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("ao")
   public boolean method9384(Object var1) {
      if (this.field5496.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         this.field5494 += 767322016;
         int var2 = 490421750 * this.field5497;
         if (var2 >= this.field5495.length) {
            this.method9376(980818928);
         }

         this.field5497 += 544148111;
         if (var2 == 0) {
            this.field5495[0] = new classPD(var1, 0);
            this.field5496.put(var1, this.field5495[0]);
         } else {
            this.field5495[var2] = new classPD(var1, var2);
            this.field5496.put(var1, this.field5495[var2]);
            method9396(this, var2, 269130368);
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("al")
   public boolean method9385(Object var1) {
      if (this.field5496.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         this.field5494 += 28979685;
         int var2 = 287626351 * this.field5497;
         if (var2 >= this.field5495.length) {
            this.method9376(685090138);
         }

         this.field5497 += 544148111;
         if (var2 == 0) {
            this.field5495[0] = new classPD(var1, 0);
            this.field5496.put(var1, this.field5495[0]);
         } else {
            this.field5495[var2] = new classPD(var1, var2);
            this.field5496.put(var1, this.field5495[var2]);
            method9396(this, var2, 1499262786);
         }

         return true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpz;I)V")
   @ObfuscatedName("tb")
   public static void method9401(class468 var0, int var1) {
      classPD var2 = var0.field5495[var1];
      int var3 = var0.field5497 * 287626351 >>> 1;

      while (var1 < var3) {
         int var4 = 1 + (var1 << 1);
         classPD var5 = var0.field5495[var4];
         int var6 = (var1 << 1) + 2;
         classPD var7 = var0.field5495[var6];
         int var8;
         if (var0.field5493 != null) {
            if (var6 < var0.field5497 * 287626351 && var0.field5493.compare(var5.field5224, var7.field5224) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < var0.field5497 * 287626351 && ((Comparable)var5.field5224).compareTo(var7.field5224) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (var0.field5493 != null
            ? var0.field5493.compare(var2.field5224, var0.field5495[var8].field5224) <= 0
            : ((Comparable)var2.field5224).compareTo(var0.field5495[var8].field5224) <= 0) {
            break;
         }

         var0.field5495[var1] = var0.field5495[var8];
         var0.field5495[var1].field5223 = 39206217 * var1;
         var1 = var8;
      }

      var0.field5495[var1] = var2;
      var0.field5495[var1].field5223 = 39206217 * var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   void method9378() {
      int var1 = 1 + (this.field5495.length << 1);
      this.field5495 = Arrays.copyOf(this.field5495, var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpz;)Ljava/lang/Object;")
   @ObfuscatedName("lx")
   public static Object method9391(class468 var0) {
      if (var0.field5497 * 295750805 == 0) {
         return null;
      } else {
         var0.field5494 += 28979685;
         Object var1 = var0.field5495[0].field5224;
         var0.field5496.remove(var1);
         var0.field5497 -= -323676298;
         if (0 == -1187000635 * var0.field5497) {
            var0.field5495[57883291 * var0.field5497] = null;
         } else {
            var0.field5495[0] = var0.field5495[1233176843 * var0.field5497];
            var0.field5495[0].field5223 = 0;
            var0.field5495[-394056131 * var0.field5497] = null;
            var0.method9400(0, (byte)31);
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("ac")
   public boolean method9386(Object var1) {
      if (this.field5496.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         this.field5494 += 28979685;
         int var2 = 287626351 * this.field5497;
         if (var2 >= this.field5495.length) {
            this.method9376(1483944540);
         }

         this.field5497 += 544148111;
         if (var2 == 0) {
            this.field5495[0] = new classPD(var1, 0);
            this.field5496.put(var1, this.field5495[0]);
         } else {
            this.field5495[var2] = new classPD(var1, var2);
            this.field5496.put(var1, this.field5495[var2]);
            method9396(this, var2, -1920899976);
         }

         return true;
      }
   }

   public class468(int var1) {
      this(var1, null);
   }

   @Override
   public int size() {
      try {
         return this.field5497 * 287626351;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "pz.size(" + 41);
      }
   }

   @Override
   public boolean remove(Object var1) {
      try {
         classPD var2 = (classPD)this.field5496.remove(var1);
         if (var2 == null) {
            return false;
         } else {
            this.field5494 += 28979685;
            this.field5497 -= 544148111;
            if (this.field5497 * 287626351 == 908018937 * var2.field5223) {
               this.field5495[this.field5497 * 287626351] = null;
               return true;
            } else {
               classPD var3 = this.field5495[287626351 * this.field5497];
               this.field5495[287626351 * this.field5497] = null;
               this.field5495[var2.field5223 * 908018937] = var3;
               this.field5495[var2.field5223 * 908018937].field5223 = 1 * var2.field5223;
               this.method9400(var2.field5223 * 908018937, (byte)88);
               if (var3 == this.field5495[908018937 * var2.field5223]) {
                  method9396(this, var2.field5223 * 908018937, 1774692879);
               }

               return true;
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "pz.remove(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("bq")
   public boolean method9406(Object var1) {
      return this.field5496.containsKey(var1);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ay")
   public Object method9388() {
      return this.field5497 * 287626351 == 0 ? null : this.field5495[0].field5224;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ad")
   public Object method9392() {
      if (this.field5497 * -1291155395 == 0) {
         return null;
      } else {
         this.field5494 += 28979685;
         Object var1 = this.field5495[0].field5224;
         this.field5496.remove(var1);
         this.field5497 -= 544148111;
         if (0 == 287626351 * this.field5497) {
            this.field5495[1543160549 * this.field5497] = null;
         } else {
            this.field5495[0] = this.field5495[-998866111 * this.field5497];
            this.field5495[0].field5223 = 0;
            this.field5495[287626351 * this.field5497] = null;
            this.method9400(0, (byte)68);
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("au")
   public Object method9393() {
      if (this.field5497 * 1787627322 == 0) {
         return null;
      } else {
         this.field5494 += -995023217;
         Object var1 = this.field5495[0].field5224;
         this.field5496.remove(var1);
         this.field5497 -= 544148111;
         if (0 == -36551536 * this.field5497) {
            this.field5495[342471231 * this.field5497] = null;
         } else {
            this.field5495[0] = this.field5495[287626351 * this.field5497];
            this.field5495[0].field5223 = 0;
            this.field5495[-1025041472 * this.field5497] = null;
            this.method9400(0, (byte)123);
         }

         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpz;)V")
   @ObfuscatedName("kq")
   public static void method9379(class468 var0) {
      int var1 = 1 + (var0.field5495.length << 1);
      var0.field5495 = Arrays.copyOf(var0.field5495, var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("bd")
   public boolean method9407(Object var1) {
      return this.field5496.containsKey(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpz;)Ljava/lang/Object;")
   @ObfuscatedName("no")
   public static Object method9389(class468 var0) {
      return var0.field5497 * 287626351 == 0 ? null : var0.field5495[0].field5224;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ar")
   void method9397(int var1) {
      classPD var2 = this.field5495[var1];

      while (var1 > 0) {
         int var3 = var1 - 1 >>> 1;
         classPD var4 = this.field5495[var3];
         if (null != this.field5493 ? this.field5493.compare(var2.field5224, var4.field5224) >= 0 : ((Comparable)var2.field5224).compareTo(var4.field5224) >= 0
            )
          {
            break;
         }

         this.field5495[var1] = var4;
         this.field5495[var1].field5223 = 39206217 * var1;
         var1 = var3;
      }

      this.field5495[var1] = var2;
      this.field5495[var1].field5223 = var1 * 39206217;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   void method9398(int var1) {
      classPD var2 = this.field5495[var1];

      while (var1 > 0) {
         int var3 = var1 - 1 >>> 1;
         classPD var4 = this.field5495[var3];
         if (null != this.field5493 ? this.field5493.compare(var2.field5224, var4.field5224) >= 0 : ((Comparable)var2.field5224).compareTo(var4.field5224) >= 0
            )
          {
            break;
         }

         this.field5495[var1] = var4;
         this.field5495[var1].field5223 = 39206217 * var1;
         var1 = var3;
      }

      this.field5495[var1] = var2;
      this.field5495[var1].field5223 = var1 * 39206217;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   void method9402(int var1) {
      classPD var2 = this.field5495[var1];
      int var3 = this.field5497 * 287626351 >>> 1;

      while (var1 < var3) {
         int var4 = 1 + (var1 << 1);
         classPD var5 = this.field5495[var4];
         int var6 = (var1 << 1) + 2;
         classPD var7 = this.field5495[var6];
         int var8;
         if (this.field5493 != null) {
            if (var6 < this.field5497 * 287626351 && this.field5493.compare(var5.field5224, var7.field5224) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < this.field5497 * -2044938483 && ((Comparable)var5.field5224).compareTo(var7.field5224) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (this.field5493 != null
            ? this.field5493.compare(var2.field5224, this.field5495[var8].field5224) <= 0
            : ((Comparable)var2.field5224).compareTo(this.field5495[var8].field5224) <= 0) {
            break;
         }

         this.field5495[var1] = this.field5495[var8];
         this.field5495[var1].field5223 = 39206217 * var1;
         var1 = var8;
      }

      this.field5495[var1] = var2;
      this.field5495[var1].field5223 = 39206217 * var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   void method9403(int var1) {
      classPD var2 = this.field5495[var1];
      int var3 = this.field5497 * 287626351 >>> 1;

      while (var1 < var3) {
         int var4 = 1 + (var1 << 1);
         classPD var5 = this.field5495[var4];
         int var6 = (var1 << 1) + 2;
         classPD var7 = this.field5495[var6];
         int var8;
         if (this.field5493 != null) {
            if (var6 < this.field5497 * -867879238 && this.field5493.compare(var5.field5224, var7.field5224) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < this.field5497 * 287626351 && ((Comparable)var5.field5224).compareTo(var7.field5224) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (this.field5493 != null
            ? this.field5493.compare(var2.field5224, this.field5495[var8].field5224) <= 0
            : ((Comparable)var2.field5224).compareTo(this.field5495[var8].field5224) <= 0) {
            break;
         }

         this.field5495[var1] = this.field5495[var8];
         this.field5495[var1].field5223 = 39206217 * var1;
         var1 = var8;
      }

      this.field5495[var1] = var2;
      this.field5495[var1].field5223 = -1263967027 * var1;
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("av")
   static int method9413(int var0, Script var1, boolean var2, int var3) {
      try {
         Widget var10000;
         if (var2) {
            if (var3 == 1361696503) {
               throw new IllegalStateException();
            }

            var10000 = classSZ.field6110;
         } else {
            var10000 = TileItem.field1558;
         }

         Widget var4 = var10000;
         if (var0 == 1700) {
            if (var3 == 1361696503) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4319 * 2073671441;
               return 1;
            }
         } else if (var0 == 1701) {
            if (var4.field4319 * 2073671441 != -1) {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1190987649 * var4.field4344;
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            }

            return 1;
         } else if (var0 == 1702) {
            if (var3 == 1361696503) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4260 * 63131743;
               return 1;
            }
         } else if (var0 == 1703) {
            if (var3 == 1361696503) {
               throw new IllegalStateException();
            } else {
               int var9 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classPN var10 = classNE.method7829(var9, (byte)-10);
               if (classPN.method9026(var10, (byte)2)) {
                  if (var3 == 1361696503) {
                     throw new IllegalStateException();
                  }

                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var4.method7220(var9, var10.field5351, 1582288814);
               } else if (var10.method9028((byte)71)) {
                  if (var3 == 1361696503) {
                     throw new IllegalStateException();
                  }

                  classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var4.method7228(var9, 3335646069137558745L * var10.field5354);
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = Widget.method7226(
                     var4, var9, -1601970641 * var10.field5352, (byte)-111
                  );
               }

               return 1;
            }
         } else if (var0 == 1704) {
            if (var3 == 1361696503) {
               throw new IllegalStateException();
            } else {
               int var5 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               Object var6 = classKN.method6500(var5, 1011913307);
               int var7 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               var4.method7230(var7, var6, (byte)-9);
               return 1;
            }
         } else if (1707 == var0) {
            if (var3 == 1361696503) {
               throw new IllegalStateException();
            } else {
               int[] var11 = classBB.field323;
               int var10001 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               byte var10002;
               if (var4.method7249(1355775728)) {
                  if (var3 == 1361696503) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var11[var10001] = var10002;
               return 1;
            }
         } else if (1708 == var0) {
            if (var3 == 1361696503) {
               throw new IllegalStateException();
            } else {
               return classEG.method3883(var4, -1485067074);
            }
         } else if (1709 == var0) {
            if (var3 == 1361696503) {
               throw new IllegalStateException();
            } else {
               return classIC.method6142(var4, (byte)-46);
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "pz.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("af")
   void method9399(int var1, int var2) {
      try {
         classPD var3 = this.field5495[var1];

         while (var1 > 0) {
            if (var2 == -311609591) {
               throw new IllegalStateException();
            }

            int var4 = var1 - 1 >>> 1;
            classPD var5 = this.field5495[var4];
            if (null != this.field5493) {
               if (var2 == -311609591) {
                  throw new IllegalStateException();
               }

               if (this.field5493.compare(var3.field5224, var5.field5224) >= 0) {
                  if (var2 == -311609591) {
                     return;
                  }
                  break;
               }
            } else if (((Comparable)var3.field5224).compareTo(var5.field5224) >= 0) {
               if (var2 == -311609591) {
                  return;
               }
               break;
            }

            this.field5495[var1] = var5;
            this.field5495[var1].field5223 = 39206217 * var1;
            var1 = var4;
         }

         this.field5495[var1] = var3;
         this.field5495[var1].field5223 = var1 * 39206217;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "pz.af(" + ')');
      }
   }
}
