import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rj")
public final class classRJ {
   @ObfuscatedName("iu")
   static int field5681;
   @ObfuscatedName("af")
   final Map field5673;
   @ObfuscatedSignature(descriptor = "Lpz;")
   @ObfuscatedName("ae")
   final class468 field5676;
   @ObfuscatedSignature(descriptor = "Lpz;")
   @ObfuscatedName("ab")
   final class468 field5678;
   @ObfuscatedName("az")
   final Comparator field5674 = new classRQ(this);
   @ObfuscatedName("ag")
   final long field5679;
   @ObfuscatedName("ax")
   final int field5675;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field5680 = 12;
   @ObfuscatedSignature(descriptor = "Lrb;")
   @ObfuscatedName("as")
   final classRB field5677;

   public classRJ(int var1, classRB var2) {
      this(-1L, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(S)Z")
   @ObfuscatedName("az")
   boolean method9980(short var1) {
      try {
         boolean var10000;
         if (-456314879 * this.field5675 != -1) {
            if (var1 != -256) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "rj.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   void method9990() {
      if (-1L == this.field5679 * -6953202533736370667L) {
         throw new IllegalStateException("");
      } else {
         long var1 = System.currentTimeMillis() - -6953202533736370667L * this.field5679;

         while (!this.field5676.isEmpty()) {
            classRO var3 = (classRO)this.field5676.peek();
            if (var3.field5823 * -9085244238986792263L >= var1) {
               return;
            }

            this.field5673.remove(var3.field5822);
            this.field5676.remove(var3);
            if (this.method9980((short)-256)) {
               this.field5678.remove(var3);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcy;I)V")
   @ObfuscatedName("nj")
   public static void method9997(ClientPreferences var0, int var1) {
      if (var0 == null) {
         var0.method2779();
      }

      var0.field1354 = -491985321 * var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "(Lrj;B)V")
   @ObfuscatedName("ne")
   public static void method9993(classRJ var0, byte var1) {
      if (var0 == null) {
         var0.method9992(var1);
      }

      try {
         synchronized (var0) {
            var0.field5673.clear();
            var0.field5676.clear();
            if (var0.method9980((short)-256)) {
               if (var1 == 1) {
                  throw new IllegalStateException();
               }

               var0.field5678.clear();
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "rj.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;B)Ljava/lang/Object;")
   @ObfuscatedName("ae")
   public Object method9982(Object var1, Object var2, byte var3) {
      try {
         synchronized (this) {
            if (-6953202533736370667L * this.field5679 != -1L) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               }

               this.method9991((byte)88);
            }

            classRO var5 = (classRO)this.field5673.get(var1);
            if (var5 != null) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               } else {
                  Object var11 = var5.field5821;
                  var5.field5821 = var2;
                  this.method9986(var5, false, (byte)109);
                  return var11;
               }
            } else {
               if (this.method9980((short)-256)) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  if (this.field5673.size() == -456314879 * this.field5675) {
                     if (var3 != 1) {
                        throw new IllegalStateException();
                     }

                     classRO var6 = (classRO)this.field5678.remove();
                     this.field5673.remove(var6.field5822);
                     this.field5676.remove(var6);
                  }
               }

               classRO var10 = new classRO(var2, var1);
               this.field5673.put(var1, var10);
               this.method9986(var10, true, (byte)13);
               return null;
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "rj.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lro;ZB)V")
   @ObfuscatedName("ab")
   void method9986(classRO var1, boolean var2, byte var3) {
      try {
         if (!var2) {
            if (var3 <= 8) {
               throw new IllegalStateException();
            }

            this.field5676.remove(var1);
            if (this.method9980((short)-256)) {
               if (var3 <= 8) {
                  return;
               }

               if (!this.field5678.remove(var1)) {
                  if (var3 <= 8) {
                     return;
                  }

                  throw new IllegalStateException("");
               }
            }
         }

         var1.field5823 = System.currentTimeMillis() * 2386105512788964233L;
         if (this.method9980((short)-256)) {
            if (var3 <= 8) {
               throw new IllegalStateException();
            }

            switch (this.field5677.field5634 * -508526291) {
               case 0:
                  var1.field5824 += 3428169640820171001L;
                  break;
               case 1:
                  var1.field5824 = 6766909879375017457L * var1.field5823;
            }

            this.field5678.add(var1);
         }

         this.field5676.add(var1);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "rj.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ag")
   void method9991(byte var1) {
      try {
         if (-1L == this.field5679 * -6953202533736370667L) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("");
            }
         } else {
            long var2 = System.currentTimeMillis() - -6953202533736370667L * this.field5679;

            while (!this.field5676.isEmpty()) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               classRO var4 = (classRO)this.field5676.peek();
               if (var4.field5823 * -9085244238986792263L >= var2) {
                  return;
               }

               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               this.field5673.remove(var4.field5822);
               this.field5676.remove(var4);
               if (this.method9980((short)-256)) {
                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  this.field5678.remove(var4);
               }
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "rj.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/ArrayList;IIIIB)V")
   @ObfuscatedName("bc")
   static void method9998(ArrayList var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         if (var0.isEmpty()) {
            if (var5 == -1) {
               throw new IllegalStateException();
            }
         } else {
            int var6 = (Integer)var0.get(0);
            if (var6 == -1 && !client.field989) {
               classBK.method1118(0, 0, (byte)117);
            } else if (-1 != var6) {
               if (var5 == -1) {
                  throw new IllegalStateException();
               }

               if (!classFM.method4846(var6, (byte)-33)) {
                  if (var5 == -1) {
                     throw new IllegalStateException();
                  }

                  if (classMH.method7572((byte)11) != 0) {
                     if (var5 == -1) {
                        throw new IllegalStateException();
                     }

                     ArrayList var7 = new ArrayList();

                     for (int var8 = 0; var8 < var0.size(); var8++) {
                        if (var5 == -1) {
                           throw new IllegalStateException();
                        }

                        var7.add(new MidiRequest(classFC.field2208, (Integer)var0.get(var8), 0, classMH.method7572((byte)11), false));
                     }

                     if (client.field989) {
                        if (var5 == -1) {
                           throw new IllegalStateException();
                        }

                        classKR.method6557(var7, var1, var2, var3, var4, (byte)0);
                     } else {
                        classIJ.method6215(var7, var1, var2, var3, var4, false, -1918189282);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "rj.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;")
   @ObfuscatedName("af")
   public Object method9981(Object var1, byte var2) {
      try {
         synchronized (this) {
            if (-1L != -6953202533736370667L * this.field5679) {
               if (var2 == 1) {
                  throw new IllegalStateException();
               }

               this.method9991((byte)58);
            }

            classRO var4 = (classRO)this.field5673.get(var1);
            if (var4 == null) {
               return null;
            } else {
               this.method9986(var4, false, (byte)68);
               return var4.field5821;
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "rj.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;)V")
   @ObfuscatedName("es")
   public static void method9979(classVW var0) {
      if (var0 == null) {
         var0.method12239();
      }

      var0.field6630 = null;
      var0.field6622 = null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;")
   @ObfuscatedName("aa")
   public Object method9983(Object var1, Object var2) {
      synchronized (this) {
         if (-6953202533736370667L * this.field5679 != -1L) {
            this.method9991((byte)106);
         }

         classRO var4 = (classRO)this.field5673.get(var1);
         if (var4 != null) {
            Object var9 = var4.field5821;
            var4.field5821 = var2;
            this.method9986(var4, false, (byte)20);
            return var9;
         } else {
            if (this.method9980((short)-256) && this.field5673.size() == -456314879 * this.field5675) {
               classRO var5 = (classRO)this.field5678.remove();
               this.field5673.remove(var5.field5822);
               this.field5676.remove(var5);
            }

            classRO var8 = new classRO(var2, var1);
            this.field5673.put(var1, var8);
            this.method9986(var8, true, (byte)35);
            return null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;")
   @ObfuscatedName("ao")
   public Object method9984(Object var1, Object var2) {
      synchronized (this) {
         if (-6953202533736370667L * this.field5679 != -1L) {
            this.method9991((byte)48);
         }

         classRO var4 = (classRO)this.field5673.get(var1);
         if (var4 != null) {
            Object var9 = var4.field5821;
            var4.field5821 = var2;
            this.method9986(var4, false, (byte)9);
            return var9;
         } else {
            if (this.method9980((short)-256) && this.field5673.size() == 1613513669 * this.field5675) {
               classRO var5 = (classRO)this.field5678.remove();
               this.field5673.remove(var5.field5822);
               this.field5676.remove(var5);
            }

            classRO var8 = new classRO(var2, var1);
            this.field5673.put(var1, var8);
            this.method9986(var8, true, (byte)126);
            return null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;")
   @ObfuscatedName("al")
   public Object method9985(Object var1, Object var2) {
      synchronized (this) {
         if (-6953202533736370667L * this.field5679 != -1L) {
            this.method9991((byte)64);
         }

         classRO var4 = (classRO)this.field5673.get(var1);
         if (var4 != null) {
            Object var9 = var4.field5821;
            var4.field5821 = var2;
            this.method9986(var4, false, (byte)104);
            return var9;
         } else {
            if (this.method9980((short)-256) && this.field5673.size() == -456314879 * this.field5675) {
               classRO var5 = (classRO)this.field5678.remove();
               this.field5673.remove(var5.field5822);
               this.field5676.remove(var5);
            }

            classRO var8 = new classRO(var2, var1);
            this.field5673.put(var1, var8);
            this.method9986(var8, true, (byte)80);
            return null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lro;Z)V")
   @ObfuscatedName("ay")
   void method9987(classRO var1, boolean var2) {
      if (!var2) {
         this.field5676.remove(var1);
         if (this.method9980((short)-256) && !this.field5678.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.field5823 = System.currentTimeMillis() * 2386105512788964233L;
      if (this.method9980((short)-256)) {
         switch (this.field5677.field5634 * -508526291) {
            case 0:
               var1.field5824 += 3428169640820171001L;
               break;
            case 1:
               var1.field5824 = 6766909879375017457L * var1.field5823;
         }

         this.field5678.add(var1);
      }

      this.field5676.add(var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   public void method9994() {
      synchronized (this) {
         this.field5673.clear();
         this.field5676.clear();
         if (this.method9980((short)-256)) {
            this.field5678.clear();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   public void method9995() {
      synchronized (this) {
         this.field5673.clear();
         this.field5676.clear();
         if (this.method9980((short)-256)) {
            this.field5678.clear();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrj;Lro;Z)V")
   @ObfuscatedName("rp")
   public static void method9988(classRJ var0, classRO var1, boolean var2) {
      if (var0 == null) {
         var0.method9995();
      }

      if (!var2) {
         var0.field5676.remove(var1);
         if (var0.method9980((short)-256) && !var0.field5678.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.field5823 = System.currentTimeMillis() * 2386105512788964233L;
      if (var0.method9980((short)-256)) {
         switch (var0.field5677.field5634 * -508526291) {
            case 0:
               var1.field5824 += 3428169640820171001L;
               break;
            case 1:
               var1.field5824 = 6766909879375017457L * var1.field5823;
         }

         var0.field5678.add(var1);
      }

      var0.field5676.add(var1);
   }

   classRJ(long var1, int var3, classRB var4) {
      this.field5679 = var1 * 8640338316139114813L;
      this.field5675 = 70438913 * var3;
      this.field5677 = var4;
      if (-1 == -456314879 * this.field5675) {
         this.field5673 = new HashMap(64);
         this.field5676 = new class468(64, this.field5674);
         this.field5678 = null;
      } else {
         if (null == this.field5677) {
            throw new IllegalArgumentException("");
         }

         this.field5673 = new HashMap(this.field5675 * -456314879);
         this.field5676 = new class468(-456314879 * this.field5675, this.field5674);
         this.field5678 = new class468(this.field5675 * -456314879);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrj;Lro;Z)V")
   @ObfuscatedName("bx")
   public static void method9989(classRJ var0, classRO var1, boolean var2) {
      if (var0 == null) {
         var0.method9990();
      }

      if (!var2) {
         var0.field5676.remove(var1);
         if (var0.method9980((short)-256) && !var0.field5678.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.field5823 = System.currentTimeMillis() * 2386105512788964233L;
      if (var0.method9980((short)-256)) {
         switch (var0.field5677.field5634 * -508526291) {
            case 0:
               var1.field5824 += 3428169640820171001L;
               break;
            case 1:
               var1.field5824 = 6766909879375017457L * var1.field5823;
         }

         var0.field5678.add(var1);
      }

      var0.field5676.add(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrj;)V")
   @ObfuscatedName("mi")
   public static void method9996(classRJ var0) {
      if (var0 == null) {
         var0.method9994();
      }

      synchronized (var0) {
         var0.field5673.clear();
         var0.field5676.clear();
         if (var0.method9980((short)-256)) {
            var0.field5678.clear();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("as")
   public void method9992(byte var1) {
      try {
         if (-1L == this.field5679 * -6953202533736370667L) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("");
            }
         } else {
            long var2 = System.currentTimeMillis() - -6953202533736370667L * this.field5679;

            while (!this.field5678.isEmpty()) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               classRO var4 = (classRO)this.field5676.method9387();
               if (var4.field5824 * -9085244238986792263L >= var2) {
                  return;
               }

               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               this.field5673.remove(var4.field5821);
               this.field5678.method9384(var4);
               if (this.method9980((short)-256)) {
                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  this.field5676.method9383(var4);
               }
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "rj.ag(" + ')');
      }
   }
}
