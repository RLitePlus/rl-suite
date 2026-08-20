import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sb")
public class class468 extends AbstractQueue {
   @ObfuscatedSignature(descriptor = "Lcl;")
   @ObfuscatedName("na")
   public static ClientPreferences clientPreferences;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field5758 = 32;
   @ObfuscatedName("ag")
   Map field5754;
   @ObfuscatedName("an")
   int field5757;
   @ObfuscatedName("ae")
   int field5755 = 0;
   @ObfuscatedName("av")
   final Comparator field5753;
   @ObfuscatedName("ij")
   static short[] foundItemIds;
   @ObfuscatedSignature(descriptor = "[Lrz;")
   @ObfuscatedName("at")
   classRZ[] field5756;

   @Override
   public Object peek() {
      try {
         return 0 == this.field5757 * -1002980573 ? null : this.field5756[0].field5748;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "sb.peek(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsb;I)V")
   @ObfuscatedName("uw")
   public static void method10057(class468 var0, int var1) {
      classRZ var2 = var0.field5756[var1];
      int var3 = -1002980573 * var0.field5757 >>> 1;

      while (var1 < var3) {
         int var4 = (var1 << 1) + 1;
         classRZ var5 = var0.field5756[var4];
         int var6 = 2 + (var1 << 1);
         classRZ var7 = var0.field5756[var6];
         int var8;
         if (null != var0.field5753) {
            if (var6 < -1002980573 * var0.field5757 && var0.field5753.compare(var5.field5748, var7.field5748) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < var0.field5757 * -1002980573 && ((Comparable)var5.field5748).compareTo(var7.field5748) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (null != var0.field5753
            ? var0.field5753.compare(var2.field5748, var0.field5756[var8].field5748) <= 0
            : ((Comparable)var2.field5748).compareTo(var0.field5756[var8].field5748) <= 0) {
            break;
         }

         var0.field5756[var1] = var0.field5756[var8];
         var0.field5756[var1].field5749 = var1 * -349483459;
         var1 = var8;
      }

      var0.field5756[var1] = var2;
      var0.field5756[var1].field5749 = var1 * -349483459;
   }

   public class468(int var1, Comparator var2) {
      this.field5756 = new classRZ[var1];
      this.field5754 = new HashMap();
      this.field5753 = var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsb;)Ljava/util/Iterator;")
   @ObfuscatedName("oq")
   public static Iterator method10065(class468 var0) {
      return (Iterator)(var0 == null ? var0.method10067() : new classRK(var0));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsb;Ljava/lang/Object;)Z")
   @ObfuscatedName("qe")
   public static boolean method10044(class468 var0, Object var1) {
      if (var0.field5754.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         var0.field5755 += -1078411269;
         int var2 = var0.field5757 * -1002980573;
         if (var2 >= var0.field5756.length) {
            method10041(var0, -827158672);
         }

         var0.field5757 += 461720715;
         if (0 == var2) {
            var0.field5756[0] = new classRZ(var1, 0);
            var0.field5754.put(var1, var0.field5756[0]);
         } else {
            var0.field5756[var2] = new classRZ(var1, var2);
            var0.field5754.put(var1, var0.field5756[var2]);
            method10053(var0, var2, (byte)2);
         }

         return true;
      }
   }

   @Override
   public Object poll() {
      try {
         if (this.field5757 * -1002980573 == 0) {
            return null;
         } else {
            this.field5755 += -1078411269;
            Object var1 = this.field5756[0].field5748;
            this.field5754.remove(var1);
            this.field5757 -= 461720715;
            if (-1002980573 * this.field5757 == 0) {
               this.field5756[this.field5757 * -1002980573] = null;
            } else {
               this.field5756[0] = this.field5756[-1002980573 * this.field5757];
               this.field5756[0].field5749 = 0;
               this.field5756[-1002980573 * this.field5757] = null;
               this.method10058(0, (byte)1);
            }

            return var1;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sb.poll(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("bh")
   public boolean method10050(Object var1) {
      classRZ var2 = (classRZ)this.field5754.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         this.field5755 += -1078411269;
         this.field5757 -= 461720715;
         if (var2.field5749 * -191678187 == this.field5757 * -1002980573) {
            this.field5756[this.field5757 * -1002980573] = null;
            return true;
         } else {
            classRZ var3 = this.field5756[1047420110 * this.field5757];
            this.field5756[this.field5757 * -2099290098] = null;
            this.field5756[-1148021913 * var2.field5749] = var3;
            this.field5756[-620647803 * var2.field5749].field5749 = var2.field5749 * 1;
            this.method10058(var2.field5749 * -191678187, (byte)1);
            if (this.field5756[var2.field5749 * -191678187] == var3) {
               method10053(this, var2.field5749 * -191678187, (byte)2);
            }

            return true;
         }
      }
   }

   @Override
   public Iterator iterator() {
      try {
         return new classRK(this);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "sb.iterator(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("bl")
   public boolean method10051(Object var1) {
      classRZ var2 = (classRZ)this.field5754.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         this.field5755 += -1078411269;
         this.field5757 -= 461720715;
         if (var2.field5749 * -1562657007 == this.field5757 * -2070376740) {
            this.field5756[this.field5757 * -504775689] = null;
            return true;
         } else {
            classRZ var3 = this.field5756[-1002980573 * this.field5757];
            this.field5756[this.field5757 * -1002980573] = null;
            this.field5756[903024703 * var2.field5749] = var3;
            this.field5756[940584204 * var2.field5749].field5749 = var2.field5749 * 1;
            this.method10058(var2.field5749 * -191678187, (byte)1);
            if (this.field5756[var2.field5749 * 143318900] == var3) {
               method10053(this, var2.field5749 * -191678187, (byte)2);
            }

            return true;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsb;)Ljava/lang/Object;")
   @ObfuscatedName("or")
   public static Object method10047(class468 var0) {
      if (var0.field5757 * -1595651291 == 0) {
         return null;
      } else {
         var0.field5755 += 1577187416;
         Object var1 = var0.field5756[0].field5748;
         var0.field5754.remove(var1);
         var0.field5757 -= -1794823485;
         if (-1280419614 * var0.field5757 == 0) {
            var0.field5756[var0.field5757 * -142401492] = null;
         } else {
            var0.field5756[0] = var0.field5756[-1002980573 * var0.field5757];
            var0.field5756[0].field5749 = 0;
            var0.field5756[-1002980573 * var0.field5757] = null;
            var0.method10058(0, (byte)1);
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("aj")
   public boolean method10045(Object var1) {
      if (this.field5754.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         this.field5755 += -1078411269;
         int var2 = this.field5757 * -881557894;
         if (var2 >= this.field5756.length) {
            method10041(this, -827158672);
         }

         this.field5757 += 461720715;
         if (0 == var2) {
            this.field5756[0] = new classRZ(var1, 0);
            this.field5754.put(var1, this.field5756[0]);
         } else {
            this.field5756[var2] = new classRZ(var1, var2);
            this.field5754.put(var1, this.field5756[var2]);
            method10053(this, var2, (byte)2);
         }

         return true;
      }
   }

   @Override
   public boolean remove(Object var1) {
      try {
         classRZ var2 = (classRZ)this.field5754.remove(var1);
         if (var2 == null) {
            return false;
         } else {
            this.field5755 += -1078411269;
            this.field5757 -= 461720715;
            if (var2.field5749 * -191678187 == this.field5757 * -1002980573) {
               this.field5756[this.field5757 * -1002980573] = null;
               return true;
            } else {
               classRZ var3 = this.field5756[-1002980573 * this.field5757];
               this.field5756[this.field5757 * -1002980573] = null;
               this.field5756[-191678187 * var2.field5749] = var3;
               this.field5756[-191678187 * var2.field5749].field5749 = var2.field5749 * 1;
               this.method10058(var2.field5749 * -191678187, (byte)1);
               if (this.field5756[var2.field5749 * -191678187] == var3) {
                  method10053(this, var2.field5749 * -191678187, (byte)2);
               }

               return true;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "sb.remove(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsb;)Ljava/lang/Object;")
   @ObfuscatedName("fr")
   public static Object method10048(class468 var0) {
      if (var0.field5757 * -1002980573 == 0) {
         return null;
      } else {
         var0.field5755 += -1078411269;
         Object var1 = var0.field5756[0].field5748;
         var0.field5754.remove(var1);
         var0.field5757 -= 461720715;
         if (-1002980573 * var0.field5757 == 0) {
            var0.field5756[var0.field5757 * -1002980573] = null;
         } else {
            var0.field5756[0] = var0.field5756[-1002980573 * var0.field5757];
            var0.field5756[0].field5749 = 0;
            var0.field5756[-1002980573 * var0.field5757] = null;
            var0.method10058(0, (byte)1);
         }

         return var1;
      }
   }

   @Override
   public boolean contains(Object var1) {
      try {
         return this.field5754.containsKey(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sb.contains(" + ')');
      }
   }

   @Override
   public Object[] toArray() {
      try {
         Object[] var1 = super.toArray();
         if (null != this.field5753) {
            Arrays.sort(var1, this.field5753);
         } else {
            Arrays.sort(var1);
         }

         return var1;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sb.toArray(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsb;IB)V")
   @ObfuscatedName("cw")
   public static void method10053(class468 var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method10060(var1, var2);
      } else {
         try {
            classRZ var3 = var0.field5756[var1];

            while (var1 > 0) {
               int var4 = var1 - 1 >>> 1;
               classRZ var5 = var0.field5756[var4];
               if (null != var0.field5753) {
                  if (var2 != 2) {
                     throw new IllegalStateException();
                  }

                  if (var0.field5753.compare(var3.field5748, var5.field5748) >= 0) {
                     if (var2 != 2) {
                        throw new IllegalStateException();
                     }
                     break;
                  }
               } else if (((Comparable)var3.field5748).compareTo(var5.field5748) >= 0) {
                  if (var2 != 2) {
                     return;
                  }
                  break;
               }

               var0.field5756[var1] = var5;
               var0.field5756[var1].field5749 = var1 * -349483459;
               var1 = var4;
            }

            var0.field5756[var1] = var3;
            var0.field5756[var1].field5749 = var1 * -349483459;
         } catch (RuntimeException var6) {
            throw RestClientThreadFactory.newRunException(var6, "sb.at(" + ')');
         }
      }
   }

   @Override
   public boolean offer(Object var1) {
      try {
         if (this.field5754.containsKey(var1)) {
            throw new IllegalArgumentException("");
         } else {
            this.field5755 += -1078411269;
            int var2 = this.field5757 * -1002980573;
            if (var2 >= this.field5756.length) {
               method10041(this, -827158672);
            }

            this.field5757 += 461720715;
            if (0 == var2) {
               this.field5756[0] = new classRZ(var1, 0);
               this.field5754.put(var1, this.field5756[0]);
            } else {
               this.field5756[var2] = new classRZ(var1, var2);
               this.field5754.put(var1, this.field5756[var2]);
               method10053(this, var2, (byte)2);
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sb.offer(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("cg")
   public Iterator method10066() {
      return new classRK(this);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bt")
   public int method10043() {
      return -1002980573 * this.field5757;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("cd")
   public Iterator method10067() {
      return new classRK(this);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsb;)Ljava/lang/Object;")
   @ObfuscatedName("sp")
   public static Object method10046(class468 var0) {
      return 0 == var0.field5757 * 1261759816 ? null : var0.field5756[0].field5748;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("bi")
   public boolean method10061(Object var1) {
      return this.field5754.containsKey(var1);
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/Object;")
   @ObfuscatedName("bw")
   public Object[] method10062() {
      Object[] var1 = super.toArray();
      if (null != this.field5753) {
         Arrays.sort(var1, this.field5753);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/Object;")
   @ObfuscatedName("bf")
   public Object[] method10063() {
      Object[] var1 = super.toArray();
      if (null != this.field5753) {
         Arrays.sort(var1, this.field5753);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ag")
   void method10058(int var1, byte var2) {
      try {
         classRZ var3 = this.field5756[var1];
         int var4 = -1002980573 * this.field5757 >>> 1;

         while (var1 < var4) {
            if (var2 != 1) {
               return;
            }

            int var5 = (var1 << 1) + 1;
            classRZ var6 = this.field5756[var5];
            int var7 = 2 + (var1 << 1);
            classRZ var8 = this.field5756[var7];
            int var9;
            if (null != this.field5753) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }

               if (var7 < -1002980573 * this.field5757 && this.field5753.compare(var6.field5748, var8.field5748) > 0) {
                  if (var2 != 1) {
                     throw new IllegalStateException();
                  }

                  var9 = var7;
               } else {
                  var9 = var5;
               }
            } else {
               label78: {
                  if (var7 < this.field5757 * -1002980573) {
                     if (var2 != 1) {
                        throw new IllegalStateException();
                     }

                     if (((Comparable)var6.field5748).compareTo(var8.field5748) > 0) {
                        if (var2 != 1) {
                           return;
                        }

                        var9 = var7;
                        break label78;
                     }
                  }

                  var9 = var5;
               }
            }

            if (null != this.field5753) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }

               if (this.field5753.compare(var3.field5748, this.field5756[var9].field5748) <= 0) {
                  if (var2 != 1) {
                     throw new IllegalStateException();
                  }
                  break;
               }
            } else if (((Comparable)var3.field5748).compareTo(this.field5756[var9].field5748) <= 0) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }
               break;
            }

            this.field5756[var1] = this.field5756[var9];
            this.field5756[var1].field5749 = var1 * -349483459;
            var1 = var9;
         }

         this.field5756[var1] = var3;
         this.field5756[var1].field5749 = var1 * -349483459;
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "sb.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("bc")
   public boolean method10052(Object var1) {
      classRZ var2 = (classRZ)this.field5754.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         this.field5755 += -1078411269;
         this.field5757 -= 461720715;
         if (var2.field5749 * -191678187 == this.field5757 * -1002980573) {
            this.field5756[this.field5757 * -1002980573] = null;
            return true;
         } else {
            classRZ var3 = this.field5756[-1002980573 * this.field5757];
            this.field5756[this.field5757 * -1002980573] = null;
            this.field5756[-191678187 * var2.field5749] = var3;
            this.field5756[-191678187 * var2.field5749].field5749 = var2.field5749 * 1;
            this.method10058(var2.field5749 * -191678187, (byte)1);
            if (this.field5756[var2.field5749 * -191678187] == var3) {
               method10053(this, var2.field5749 * -191678187, (byte)2);
            }

            return true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   void method10040() {
      int var1 = (this.field5756.length << 1) + 1;
      this.field5756 = Arrays.copyOf(this.field5756, var1);
   }

   public class468(int var1) {
      this(var1, null);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsb;)[Ljava/lang/Object;")
   @ObfuscatedName("ox")
   public static Object[] method10064(class468 var0) {
      if (var0 == null) {
         var0.method10062();
      }

      Object[] var1 = var0.toArray();
      if (null != var0.field5753) {
         Arrays.sort(var1, var0.field5753);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ap")
   public Object method10049() {
      if (this.field5757 * -1002980573 == 0) {
         return null;
      } else {
         this.field5755 += -1078411269;
         Object var1 = this.field5756[0].field5748;
         this.field5754.remove(var1);
         this.field5757 -= 461720715;
         if (-1002980573 * this.field5757 == 0) {
            this.field5756[this.field5757 * -1002980573] = null;
         } else {
            this.field5756[0] = this.field5756[-1002980573 * this.field5757];
            this.field5756[0].field5749 = 0;
            this.field5756[-1002980573 * this.field5757] = null;
            this.method10058(0, (byte)1);
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("au")
   void method10054(int var1) {
      classRZ var2 = this.field5756[var1];

      while (var1 > 0) {
         int var3 = var1 - 1 >>> 1;
         classRZ var4 = this.field5756[var3];
         if (null != this.field5753 ? this.field5753.compare(var2.field5748, var4.field5748) >= 0 : ((Comparable)var2.field5748).compareTo(var4.field5748) >= 0
            )
          {
            break;
         }

         this.field5756[var1] = var4;
         this.field5756[var1].field5749 = var1 * 1708950321;
         var1 = var3;
      }

      this.field5756[var1] = var2;
      this.field5756[var1].field5749 = var1 * -286106037;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   void method10055(int var1) {
      classRZ var2 = this.field5756[var1];

      while (var1 > 0) {
         int var3 = var1 - 1 >>> 1;
         classRZ var4 = this.field5756[var3];
         if (null != this.field5753 ? this.field5753.compare(var2.field5748, var4.field5748) >= 0 : ((Comparable)var2.field5748).compareTo(var4.field5748) >= 0
            )
          {
            break;
         }

         this.field5756[var1] = var4;
         this.field5756[var1].field5749 = var1 * 950937852;
         var1 = var3;
      }

      this.field5756[var1] = var2;
      this.field5756[var1].field5749 = var1 * -1417648362;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ad")
   void method10056(int var1) {
      classRZ var2 = this.field5756[var1];

      while (var1 > 0) {
         int var3 = var1 - 1 >>> 1;
         classRZ var4 = this.field5756[var3];
         if (null != this.field5753 ? this.field5753.compare(var2.field5748, var4.field5748) >= 0 : ((Comparable)var2.field5748).compareTo(var4.field5748) >= 0
            )
          {
            break;
         }

         this.field5756[var1] = var4;
         this.field5756[var1].field5749 = var1 * -866281952;
         var1 = var3;
      }

      this.field5756[var1] = var2;
      this.field5756[var1].field5749 = var1 * -349483459;
   }

   @ObfuscatedSignature(descriptor = "(Lsb;I)V")
   @ObfuscatedName("fb")
   public static void method10041(class468 var0, int var1) {
      if (var0 == null) {
         var0.method10042(var1);
      } else {
         try {
            int var2 = (var0.field5756.length << 1) + 1;
            var0.field5756 = Arrays.copyOf(var0.field5756, var2);
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "sb.av(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ai")
   void method10059(int var1) {
      classRZ var2 = this.field5756[var1];
      int var3 = -1002980573 * this.field5757 >>> 1;

      while (var1 < var3) {
         int var4 = (var1 << 1) + 1;
         classRZ var5 = this.field5756[var4];
         int var6 = 2 + (var1 << 1);
         classRZ var7 = this.field5756[var6];
         int var8;
         if (null != this.field5753) {
            if (var6 < -1002980573 * this.field5757 && this.field5753.compare(var5.field5748, var7.field5748) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < this.field5757 * -1002980573 && ((Comparable)var5.field5748).compareTo(var7.field5748) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (null != this.field5753
            ? this.field5753.compare(var2.field5748, this.field5756[var8].field5748) <= 0
            : ((Comparable)var2.field5748).compareTo(this.field5756[var8].field5748) <= 0) {
            break;
         }

         this.field5756[var1] = this.field5756[var8];
         this.field5756[var1].field5749 = var1 * -349483459;
         var1 = var8;
      }

      this.field5756[var1] = var2;
      this.field5756[var1].field5749 = var1 * -349483459;
   }

   @Override
   public int size() {
      try {
         return -1002980573 * this.field5757;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "sb.size(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmj;I)V")
   @ObfuscatedName("hp")
   static void method10068(PacketBufferNode var0, int var1) {
      try {
         var0.packetBuffer.writeInt(1599863785 * Varps.field4729.hash, 1856416551);
         var0.packetBuffer.writeInt(1599863785 * class189.archive4.hash, 1287398473);
         var0.packetBuffer.writeIntIME(1599863785 * AsyncHttpResponse.field63.hash, 783375377);
         var0.packetBuffer.writeInt(ParamComposition.field2543.hash * 1599863785, 589372048);
         var0.packetBuffer.writeInt(0, 1614065946);
         var0.packetBuffer.writeInt(1599863785 * class160.field1988.hash, 964232003);
         var0.packetBuffer.writeIntIME(Skeleton.field2818.hash * 1599863785, 783375377);
         var0.packetBuffer.writeInt(Tile.archive9.hash * 1599863785, 220044348);
         Buffer.method12187(var0.packetBuffer, UserComparator4.archive6.hash * 1599863785, -614078362);
         var0.packetBuffer.writeInt(1599863785 * PcmPlayer.field1445.hash, 1117656276);
         var0.packetBuffer.writeIntIME(class138.field1779.hash * 1599863785, 783375377);
         var0.packetBuffer.writeIntIME(1599863785 * AbstractWorldMapIcon.field3997.hash, 783375377);
         var0.packetBuffer.writeIntIME(1599863785 * VarcInt.field2195.hash, 783375377);
         Buffer.method12191(var0.packetBuffer, 1599863785 * class136.field1858.hash, -1365110248);
         Buffer.method12187(var0.packetBuffer, StructComposition.archive2.hash * 1599863785, -1038292622);
         var0.packetBuffer.writeIntIME(WorldMapRectangle.archive12.hash * 1599863785, 783375377);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sb.hp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("at")
   void method10060(int var1, byte var2) {
      try {
         classRZ var3 = this.field5756[var1];
         int var4 = -1002980573 * this.field5757 >>> 1;

         while (var1 < var4) {
            if (var2 != 1) {
               return;
            }

            int var5 = (var1 << 1) + 1;
            classRZ var6 = this.field5756[var5];
            int var7 = 2 + (var1 << 1);
            classRZ var8 = this.field5756[var7];
            int var9;
            if (null != this.field5753) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }

               if (var7 < -1002980573 * this.field5755 && this.field5753.compare(var6.field5748, var8.field5748) > 0) {
                  if (var2 != 1) {
                     throw new IllegalStateException();
                  }

                  var9 = var7;
               } else {
                  var9 = var5;
               }
            } else {
               label78: {
                  if (var7 < this.field5757 * -1002980573) {
                     if (var2 != 1) {
                        throw new IllegalStateException();
                     }

                     if (((Comparable)var6.field5748).compareTo(var8.field5748) > 0) {
                        if (var2 != 1) {
                           return;
                        }

                        var9 = var7;
                        break label78;
                     }
                  }

                  var9 = var5;
               }
            }

            if (null != this.field5753) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }

               if (this.field5753.compare(var3.field5748, this.field5756[var9].field5748) <= 0) {
                  if (var2 != 1) {
                     throw new IllegalStateException();
                  }
                  break;
               }
            } else if (((Comparable)var3.field5748).compareTo(this.field5756[var9].field5748) <= 0) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }
               break;
            }

            this.field5756[var1] = this.field5756[var9];
            this.field5756[var1].field5749 = var1 * -349483459;
            var1 = var9;
         }

         this.field5756[var1] = var3;
         this.field5756[var1].field5749 = var1 * -349483459;
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "sb.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   void method10042(int var1) {
      try {
         int var2 = (this.field5756.length << 1) + 1;
         this.field5756 = Arrays.copyOf(this.field5756, var2);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sb.av(" + ')');
      }
   }
}
