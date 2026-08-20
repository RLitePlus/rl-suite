import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("id")
public final class classID {
   @ObfuscatedSignature(descriptor = "Lyn;")
   @ObfuscatedName("ae")
   IterableNodeHashTable field2945;
   @ObfuscatedName("az")
   int field2942;
   @ObfuscatedSignature(descriptor = "Lii;")
   @ObfuscatedName("ag")
   classII field2946;
   @ObfuscatedSignature(descriptor = "Lnz;")
   @ObfuscatedName("ab")
   classNZ field2944 = new classNZ();
   @ObfuscatedName("af")
   int field2943;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   public void method6165() {
      this.field2944.method8262();
      IterableNodeHashTable.method13579(this.field2945);
      this.field2943 = this.field2942;
   }

   public classID(int var1, int var2) {
      this.field2942 = var1;
      this.field2943 = var1;
      byte var3 = 1;

      while (var3 + var3 < var1 && var3 < var2) {
         var3 += var3;
      }

      this.field2945 = new IterableNodeHashTable(var3);
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("aq")
   void method6149(long var1) {
      classJQ var3 = (classJQ)this.field2945.method13595(var1);
      this.method6152(var3);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   public void method6166() {
      this.field2944.method8262();
      IterableNodeHashTable.method13579(this.field2945);
      this.field2943 = this.field2942;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;J)V")
   @ObfuscatedName("ab")
   public void method6154(Object var1, long var2) {
      this.method6157(var1, var2, 1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;JI)V")
   @ObfuscatedName("ag")
   public void method6157(Object var1, long var2, int var4) {
      if (var4 > this.field2942) {
         throw new IllegalStateException();
      } else {
         this.method6149(var2);
         this.field2943 -= var4;

         while (this.field2943 < 0) {
            classJQ var5 = (classJQ)this.field2944.method8269();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.vmethod516()) {
            }

            this.method6152(var5);
            if (this.field2946 != null) {
               this.field2946.method6214(var5.vmethod513());
            }
         }

         classJD var6 = new classJD(var1, var4);
         IterableNodeHashTable.method13576(this.field2945, var6, var2);
         classNZ.method8265(this.field2944, var6);
         var6.field6514 = 0L;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lid;I)V")
   @ObfuscatedName("wp")
   public static void method6160(classID var0, int var1) {
      for (classJQ var2 = (classJQ)var0.field2944.method8271(); var2 != null; var2 = (classJQ)var0.field2944.method8279()) {
         if (var2.vmethod516()) {
            if (var2.vmethod513() == null) {
               var2.vmethod398();
               var2.method11958();
               var0.field2943 = var0.field2943 + var2.field3358;
            }
         } else if (++var2.field6514 > var1) {
            classJU var3 = new classJU(var2.vmethod513(), var2.field3358);
            IterableNodeHashTable.method13576(var0.field2945, var3, var2.field6552);
            classNZ.method8260(var3, var2);
            var2.vmethod398();
            var2.method11958();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("as")
   public void method6161(int var1) {
      for (classJQ var2 = (classJQ)this.field2944.method8271(); var2 != null; var2 = (classJQ)this.field2944.method8279()) {
         if (var2.vmethod516()) {
            if (var2.vmethod513() == null) {
               var2.vmethod398();
               var2.method11958();
               this.field2943 = this.field2943 + var2.field3358;
            }
         } else if (++var2.field6514 > var1) {
            classJU var3 = new classJU(var2.vmethod513(), var2.field3358);
            IterableNodeHashTable.method13576(this.field2945, var3, var2.field6552);
            classNZ.method8260(var3, var2);
            var2.vmethod398();
            var2.method11958();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lid;Ljq;)V")
   @ObfuscatedName("pe")
   public static void method6151(classID var0, classJQ var1) {
      if (var0 == null) {
         var0.method6166();
      }

      if (var1 != null) {
         var1.vmethod398();
         var1.method11958();
         var0.field2943 = var0.field2943 + var1.field3358;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   public void method6167() {
      this.field2944.method8262();
      IterableNodeHashTable.method13579(this.field2945);
      this.field2943 = this.field2942;
   }

   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/Object;")
   @ObfuscatedName("ac")
   public Object method6143(long var1) {
      classJQ var3 = (classJQ)this.field2945.method13595(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.vmethod513();
         if (var4 == null) {
            var3.vmethod398();
            var3.method11958();
            this.field2943 = this.field2943 + var3.field3358;
            return null;
         } else {
            if (var3.vmethod516()) {
               classJD var5 = new classJD(var4, var3.field3358);
               IterableNodeHashTable.method13576(this.field2945, var5, var3.field6552);
               classNZ.method8265(this.field2944, var5);
               var5.field6514 = 0L;
               var3.vmethod398();
               var3.method11958();
            } else {
               classNZ.method8265(this.field2944, var3);
               var3.field6514 = 0L;
            }

            return var4;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/Object;")
   @ObfuscatedName("aa")
   public Object method6144(long var1) {
      classJQ var3 = (classJQ)this.field2945.method13595(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.vmethod513();
         if (var4 == null) {
            var3.vmethod398();
            var3.method11958();
            this.field2943 = this.field2943 + var3.field3358;
            return null;
         } else {
            if (var3.vmethod516()) {
               classJD var5 = new classJD(var4, var3.field3358);
               IterableNodeHashTable.method13576(this.field2945, var5, var3.field6552);
               classNZ.method8265(this.field2944, var5);
               var5.field6514 = 0L;
               var3.vmethod398();
               var3.method11958();
            } else {
               classNZ.method8265(this.field2944, var3);
               var3.field6514 = 0L;
            }

            return var4;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/Object;")
   @ObfuscatedName("ao")
   public Object method6145(long var1) {
      classJQ var3 = (classJQ)this.field2945.method13595(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.vmethod513();
         if (var4 == null) {
            var3.vmethod398();
            var3.method11958();
            this.field2943 = this.field2943 + var3.field3358;
            return null;
         } else {
            if (var3.vmethod516()) {
               classJD var5 = new classJD(var4, var3.field3358);
               IterableNodeHashTable.method13576(this.field2945, var5, var3.field6552);
               classNZ.method8265(this.field2944, var5);
               var5.field6514 = 0L;
               var3.vmethod398();
               var3.method11958();
            } else {
               classNZ.method8265(this.field2944, var3);
               var3.field6514 = 0L;
            }

            return var4;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   public void method6162(int var1) {
      for (classJQ var2 = (classJQ)this.field2944.method8271(); var2 != null; var2 = (classJQ)this.field2944.method8279()) {
         if (var2.vmethod516()) {
            if (var2.vmethod513() == null) {
               var2.vmethod398();
               var2.method11958();
               this.field2943 = this.field2943 + var2.field3358;
            }
         } else if (++var2.field6514 > var1) {
            classJU var3 = new classJU(var2.vmethod513(), var2.field3358);
            IterableNodeHashTable.method13576(this.field2945, var3, var2.field6552);
            classNZ.method8260(var3, var2);
            var2.vmethod398();
            var2.method11958();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   public void method6163(int var1) {
      for (classJQ var2 = (classJQ)this.field2944.method8271(); var2 != null; var2 = (classJQ)this.field2944.method8279()) {
         if (var2.vmethod516()) {
            if (var2.vmethod513() == null) {
               var2.vmethod398();
               var2.method11958();
               this.field2943 = this.field2943 + var2.field3358;
            }
         } else if (++var2.field6514 > var1) {
            classJU var3 = new classJU(var2.vmethod513(), var2.field3358);
            IterableNodeHashTable.method13576(this.field2945, var3, var2.field6552);
            classNZ.method8260(var3, var2);
            var2.vmethod398();
            var2.method11958();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljq;)V")
   @ObfuscatedName("ae")
   void method6152(classJQ var1) {
      if (var1 != null) {
         var1.vmethod398();
         var1.method11958();
         this.field2943 = this.field2943 + var1.field3358;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;J)V")
   @ObfuscatedName("au")
   public void method6155(Object var1, long var2) {
      this.method6157(var1, var2, 1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lid;Ljq;)V")
   @ObfuscatedName("ll")
   public static void method6153(classID var0, classJQ var1) {
      if (var0 == null) {
         var0.method6167();
      }

      if (var1 != null) {
         var1.vmethod398();
         var1.method11958();
         var0.field2943 = var0.field2943 + var1.field3358;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;J)V")
   @ObfuscatedName("ai")
   public void method6156(Object var1, long var2) {
      this.method6157(var1, var2, 1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;JI)V")
   @ObfuscatedName("ar")
   public void method6158(Object var1, long var2, int var4) {
      if (var4 > this.field2942) {
         throw new IllegalStateException();
      } else {
         this.method6149(var2);
         this.field2943 -= var4;

         while (this.field2943 < 0) {
            classJQ var5 = (classJQ)this.field2944.method8269();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.vmethod516()) {
            }

            this.method6152(var5);
            if (this.field2946 != null) {
               this.field2946.method6214(var5.vmethod513());
            }
         }

         classJD var6 = new classJD(var1, var4);
         IterableNodeHashTable.method13576(this.field2945, var6, var2);
         classNZ.method8265(this.field2944, var6);
         var6.field6514 = 0L;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bn")
   public void method6168() {
      this.field2944.method8262();
      IterableNodeHashTable.method13579(this.field2945);
      this.field2943 = this.field2942;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lid;Ljava/lang/Object;JI)V")
   @ObfuscatedName("yv")
   public static void method6159(classID var0, Object var1, long var2, int var4) {
      if (var4 > var0.field2942) {
         throw new IllegalStateException();
      } else {
         var0.method6149(var2);
         var0.field2943 -= var4;

         while (var0.field2943 < 0) {
            classJQ var5 = (classJQ)var0.field2944.method8269();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.vmethod516()) {
            }

            var0.method6152(var5);
            if (var0.field2946 != null) {
               var0.field2946.method6214(var5.vmethod513());
            }
         }

         classJD var6 = new classJD(var1, var4);
         IterableNodeHashTable.method13576(var0.field2945, var6, var2);
         classNZ.method8265(var0.field2944, var6);
         var6.field6514 = 0L;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lid;J)Ljava/lang/Object;")
   @ObfuscatedName("bk")
   public static Object method6146(classID var0, long var1) {
      if (var0 == null) {
         var0.method6167();
      }

      classJQ var3 = (classJQ)var0.field2945.method13595(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.vmethod513();
         if (var4 == null) {
            var3.vmethod398();
            var3.method11958();
            var0.field2943 = var0.field2943 + var3.field3358;
            return null;
         } else {
            if (var3.vmethod516()) {
               classJD var5 = new classJD(var4, var3.field3358);
               IterableNodeHashTable.method13576(var0.field2945, var5, var3.field6552);
               classNZ.method8265(var0.field2944, var5);
               var5.field6514 = 0L;
               var3.vmethod398();
               var3.method11958();
            } else {
               classNZ.method8265(var0.field2944, var3);
               var3.field6514 = 0L;
            }

            return var4;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   public void method6164(int var1) {
      for (classJQ var2 = (classJQ)this.field2944.method8271(); var2 != null; var2 = (classJQ)this.field2944.method8279()) {
         if (var2.vmethod516()) {
            if (var2.vmethod513() == null) {
               var2.vmethod398();
               var2.method11958();
               this.field2943 = this.field2943 + var2.field3358;
            }
         } else if (++var2.field6514 > var1) {
            classJU var3 = new classJU(var2.vmethod513(), var2.field3358);
            IterableNodeHashTable.method13576(this.field2945, var3, var2.field6552);
            classNZ.method8260(var3, var2);
            var2.vmethod398();
            var2.method11958();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/Object;")
   @ObfuscatedName("az")
   public Object method6147(long var1) {
      classJQ var3 = (classJQ)this.field2945.method13595(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.vmethod513();
         if (var4 == null) {
            var3.vmethod398();
            var3.method11958();
            this.field2943 = this.field2943 + var3.field3358;
            return null;
         } else {
            if (var3.vmethod516()) {
               classJD var5 = new classJD(var4, var3.field3358);
               IterableNodeHashTable.method13576(this.field2945, var5, var3.field6552);
               classNZ.method8265(this.field2944, var5);
               var5.field6514 = 0L;
               var3.vmethod398();
               var3.method11958();
            } else {
               classNZ.method8265(this.field2944, var3);
               var3.field6514 = 0L;
            }

            return var4;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("af")
   void method6150(long var1) {
      classJQ var3 = (classJQ)this.field2945.method13595(var1);
      this.method6152(var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lid;J)Ljava/lang/Object;")
   @ObfuscatedName("zz")
   public static Object method6148(classID var0, long var1) {
      classJQ var3 = (classJQ)var0.field2945.method13595(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.vmethod513();
         if (var4 == null) {
            var3.vmethod398();
            var3.method11958();
            var0.field2943 = var0.field2943 + var3.field3358;
            return null;
         } else {
            if (var3.vmethod516()) {
               classJD var5 = new classJD(var4, var3.field3358);
               IterableNodeHashTable.method13576(var0.field2945, var5, var3.field6552);
               classNZ.method8265(var0.field2944, var5);
               var5.field6514 = 0L;
               var3.vmethod398();
               var3.method11958();
            } else {
               classNZ.method8265(var0.field2944, var3);
               var3.field6514 = 0L;
            }

            return var4;
         }
      }
   }

   public classID(int var1) {
      this(var1, var1);
   }
}
