import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("th")
public final class class498 {
   @ObfuscatedName("ak")
   final int field5919;
   @ObfuscatedName("at")
   final Map field5920;
   @ObfuscatedSignature(descriptor = "Lsb;")
   @ObfuscatedName("an")
   final class468 field5921;
   @ObfuscatedSignature(descriptor = "Lsb;")
   @ObfuscatedName("ag")
   final class468 field5922;
   @ObfuscatedName("ae")
   final long field5917;
   @ObfuscatedSignature(descriptor = "Ltb;")
   @ObfuscatedName("aj")
   final classTB field5918;
   @ObfuscatedName("av")
   final Comparator field5916 = new classTE(this);
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5923 = 2048;
   @ObfuscatedSignature(descriptor = "Lsu;")
   @ObfuscatedName("fo")
   static Font fontPlain11;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lth;)V")
   @ObfuscatedName("sv")
   public static void method10659(class498 var0) {
      if (var0 == null) {
         var0.method10655();
      } else {
         synchronized (var0) {
            var0.field5920.clear();
            var0.field5921.clear();
            if (method10642(var0, (byte)-75)) {
               var0.field5922.clear();
            }
         }
      }
   }

   class498(long var1, int var3, classTB var4) {
      this.field5917 = 7858963234263738533L * var1;
      this.field5919 = 443094187 * var3;
      this.field5918 = var4;
      if (324683267 * this.field5919 == -1) {
         this.field5920 = new HashMap(64);
         this.field5921 = new class468(64, this.field5916);
         this.field5922 = null;
      } else {
         if (null == this.field5918) {
            throw new IllegalArgumentException("");
         }

         this.field5920 = new HashMap(this.field5919 * 324683267);
         this.field5921 = new class468(324683267 * this.field5919, this.field5916);
         this.field5922 = new class468(324683267 * this.field5919);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
   @ObfuscatedName("ag")
   public Object method10647(Object var1, Object var2, int var3) {
      try {
         synchronized (this) {
            if (this.field5917 * -1872081348891082963L != -1L) {
               if (var3 <= -1661730090) {
                  throw new IllegalStateException();
               }

               this.method10654(751189193);
            }

            class499 var5 = (class499)this.field5920.get(var1);
            if (var5 != null) {
               if (var3 <= -1661730090) {
                  throw new IllegalStateException();
               } else {
                  Object var11 = var5.field5976;
                  var5.field5976 = var2;
                  this.method10650(var5, false, 2138439757);
                  return var11;
               }
            } else {
               if (method10642(this, (byte)-39) && this.field5920.size() == 324683267 * this.field5919) {
                  class499 var6 = (class499)this.field5922.remove();
                  this.field5920.remove(var6.field5977);
                  this.field5921.remove(var6);
               }

               class499 var10 = new class499(var2, var1);
               this.field5920.put(var1, var10);
               this.method10650(var10, true, 2009074236);
               return null;
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "th.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   void method10653() {
      if (-1L == -1872081348891082963L * this.field5917) {
         throw new IllegalStateException("");
      } else {
         long var1 = System.currentTimeMillis() - -1872081348891082963L * this.field5917;

         while (!this.field5921.isEmpty()) {
            class499 var3 = (class499)this.field5921.peek();
            if (var3.field5979 * 2286872270706208031L >= var1) {
               return;
            }

            this.field5920.remove(var3.field5977);
            this.field5921.remove(var3);
            if (method10642(this, (byte)-86)) {
               this.field5922.remove(var3);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltt;ZI)V")
   @ObfuscatedName("an")
   void method10650(class499 var1, boolean var2, int var3) {
      try {
         if (!var2) {
            if (var3 <= 1954984791) {
               return;
            }

            this.field5921.remove(var1);
            if (method10642(this, (byte)-7)) {
               if (var3 <= 1954984791) {
                  return;
               }

               if (!this.field5922.remove(var1)) {
                  if (var3 <= 1954984791) {
                     throw new IllegalStateException();
                  }

                  throw new IllegalStateException("");
               }
            }
         }

         var1.field5979 = System.currentTimeMillis() * -3730626151781183777L;
         if (method10642(this, (byte)18)) {
            if (var3 <= 1954984791) {
               throw new IllegalStateException();
            }

            switch (this.field5918.field5894 * 1610619333) {
               case 0:
                  var1.field5980 = 6793596468844793915L * var1.field5979;
                  break;
               case 1:
                  var1.field5980 += -4627912699238802075L;
            }

            this.field5922.add(var1);
         }

         this.field5921.add(var1);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "th.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   void method10654(int var1) {
      try {
         if (-1L == -1872081348891082963L * this.field5917) {
            if (var1 > 327716789) {
               throw new IllegalStateException("");
            }
         } else {
            long var2 = System.currentTimeMillis() - -1872081348891082963L * this.field5917;

            while (!this.field5921.isEmpty()) {
               class499 var4 = (class499)this.field5921.peek();
               if (var4.field5979 * 2286872270706208031L >= var2) {
                  return;
               }

               if (var1 <= 327716789) {
                  return;
               }

               this.field5920.remove(var4.field5977);
               this.field5921.remove(var4);
               if (method10642(this, (byte)-104)) {
                  if (var1 <= 327716789) {
                     throw new IllegalStateException();
                  }

                  this.field5922.remove(var4);
               }
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "th.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aj")
   public void clearFiles(byte var1) {
      try {
         synchronized (this) {
            this.field5920.clear();
            this.field5921.clear();
            if (method10642(this, (byte)2)) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               this.field5922.clear();
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "th.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lth;B)Z")
   @ObfuscatedName("fp")
   public static boolean method10642(class498 var0, byte var1) {
      if (var0 == null) {
         return var0.method10643(var1);
      } else {
         try {
            boolean var10000;
            if (-1 != var0.field5919 * 324683267) {
               if (var1 >= 20) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "th.av(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldx;Z)Ldq;")
   @ObfuscatedName("qi")
   public static RawSound method10649(SoundEffect var0, boolean var1) {
      if (var0 == null) {
         return var0.method3586(var1);
      } else {
         return var0.field1516 == 0 ? var0.method3580(var1) : var0.field1518.method3875((byte)-86);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;")
   @ObfuscatedName("ak")
   public Object method10644(Object var1) {
      synchronized (this) {
         if (this.field5917 * -1872081348891082963L != -1L) {
            this.method10654(712820118);
         }

         class499 var3 = (class499)this.field5920.get(var1);
         if (var3 == null) {
            return null;
         } else {
            this.method10650(var3, false, 2075233859);
            return var3.field5976;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;")
   @ObfuscatedName("aw")
   public Object method10648(Object var1, Object var2) {
      synchronized (this) {
         if (this.field5917 * -1872081348891082963L != -1L) {
            this.method10654(1865790713);
         }

         class499 var4 = (class499)this.field5920.get(var1);
         if (var4 != null) {
            Object var9 = var4.field5976;
            var4.field5976 = var2;
            this.method10650(var4, false, 2126927834);
            return var9;
         } else {
            if (method10642(this, (byte)13) && this.field5920.size() == 324683267 * this.field5919) {
               class499 var5 = (class499)this.field5922.remove();
               this.field5920.remove(var5.field5977);
               this.field5921.remove(var5);
            }

            class499 var8 = new class499(var2, var1);
            this.field5920.put(var1, var8);
            this.method10650(var8, true, 2018164132);
            return null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltt;Z)V")
   @ObfuscatedName("ap")
   void method10651(class499 var1, boolean var2) {
      if (!var2) {
         this.field5921.remove(var1);
         if (method10642(this, (byte)-91) && !this.field5922.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.field5979 = System.currentTimeMillis() * -3730626151781183777L;
      if (method10642(this, (byte)-45)) {
         switch (this.field5918.field5894 * 1733645583) {
            case 0:
               var1.field5980 = 6793596468844793915L * var1.field5979;
               break;
            case 1:
               var1.field5980 += -4627912699238802075L;
         }

         this.field5922.add(var1);
      }

      this.field5921.add(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ltt;Z)V")
   @ObfuscatedName("ay")
   void method10652(class499 var1, boolean var2) {
      if (!var2) {
         this.field5921.remove(var1);
         if (method10642(this, (byte)-115) && !this.field5922.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.field5979 = System.currentTimeMillis() * -3730626151781183777L;
      if (method10642(this, (byte)-24)) {
         switch (this.field5918.field5894 * 1610619333) {
            case 0:
               var1.field5980 = 6793596468844793915L * var1.field5979;
               break;
            case 1:
               var1.field5980 += -4627912699238802075L;
         }

         this.field5922.add(var1);
      }

      this.field5921.add(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lth;Ljava/lang/Object;I)Ljava/lang/Object;")
   @ObfuscatedName("fo")
   public static Object method10645(class498 var0, Object var1, int var2) {
      if (var0 == null) {
         return var0.method10646(var1, var2);
      } else {
         try {
            synchronized (var0) {
               if (var0.field5917 * -1872081348891082963L != -1L) {
                  if (var2 != 1934219016) {
                     throw new IllegalStateException();
                  }

                  var0.method10654(1375939680);
               }

               class499 var4 = (class499)var0.field5920.get(var1);
               if (var4 == null) {
                  if (var2 != 1934219016) {
                     throw new IllegalStateException();
                  } else {
                     return null;
                  }
               } else {
                  var0.method10650(var4, false, 2023365228);
                  return var4.field5976;
               }
            }
         } catch (RuntimeException var7) {
            throw RestClientThreadFactory.newRunException(var7, "th.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public void method10661() {
      synchronized (this) {
         this.field5920.clear();
         this.field5921.clear();
         if (method10642(this, (byte)-72)) {
            this.field5922.clear();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;B)I")
   @ObfuscatedName("av")
   public static int method10640(CharSequence var0, byte var1) {
      try {
         int var2 = var0.length();
         int var3 = 0;

         for (int var4 = 0; var4 < var2; var4++) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            char var5 = var0.charAt(var4);
            if (var5 <= 127) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               var3++;
            } else if (var5 <= 2047) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               var3 += 2;
            } else {
               var3 += 3;
            }
         }

         return var3;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "th.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   void method10655() {
      if (-1L == -1872081348891082963L * this.field5917) {
         throw new IllegalStateException("");
      } else {
         long var1 = System.currentTimeMillis() - -1872081348891082963L * this.field5917;

         while (!this.field5921.isEmpty()) {
            class499 var3 = (class499)this.field5921.peek();
            if (var3.field5979 * 2286872270706208031L >= var1) {
               return;
            }

            this.field5920.remove(var3.field5977);
            this.field5921.remove(var3);
            if (method10642(this, (byte)16)) {
               this.field5922.remove(var3);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   void method10656() {
      if (-1L == -1872081348891082963L * this.field5917) {
         throw new IllegalStateException("");
      } else {
         long var1 = System.currentTimeMillis() - -1872081348891082963L * this.field5917;

         while (!this.field5921.isEmpty()) {
            class499 var3 = (class499)this.field5921.peek();
            if (var3.field5979 * 2286872270706208031L >= var1) {
               return;
            }

            this.field5920.remove(var3.field5977);
            this.field5921.remove(var3);
            if (method10642(this, (byte)-114)) {
               this.field5922.remove(var3);
            }
         }
      }
   }

   public class498(int var1, classTB var2) {
      this(-1L, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   void method10657() {
      if (-1L == -1872081348891082963L * this.field5917) {
         throw new IllegalStateException("");
      } else {
         long var1 = System.currentTimeMillis() - -1872081348891082963L * this.field5917;

         while (!this.field5921.isEmpty()) {
            class499 var3 = (class499)this.field5921.peek();
            if (var3.field5979 * 2286872270706208031L >= var1) {
               return;
            }

            this.field5920.remove(var3.field5977);
            this.field5921.remove(var3);
            if (method10642(this, (byte)-53)) {
               this.field5922.remove(var3);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lth;)V")
   @ObfuscatedName("qg")
   public static void method10658(class498 var0) {
      if (-1L == -1872081348891082963L * var0.field5917) {
         throw new IllegalStateException("");
      } else {
         long var1 = System.currentTimeMillis() - -1872081348891082963L * var0.field5917;

         while (!var0.field5921.isEmpty()) {
            class499 var3 = (class499)var0.field5921.peek();
            if (var3.field5979 * 2286872270706208031L >= var1) {
               return;
            }

            var0.field5920.remove(var3.field5977);
            var0.field5921.remove(var3);
            if (method10642(var0, (byte)-9)) {
               var0.field5922.remove(var3);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("at")
   public static int method10641(int var0, int var1) {
      try {
         return var0 >> 14 & 1023;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "th.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;")
   @ObfuscatedName("at")
   public Object method10646(Object var1, int var2) {
      try {
         synchronized (this) {
            if (this.field5917 * -1872081348891082963L != -1L) {
               if (var2 != 1934219016) {
                  throw new IllegalStateException();
               }

               this.method10654(1375939680);
            }

            class499 var4 = (class499)this.field5920.get(var1);
            if (var4 == null) {
               if (var2 != 1934219016) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               this.method10650(var4, false, 2023365228);
               return var4.field5976;
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "th.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("av")
   boolean method10643(byte var1) {
      try {
         boolean var10000;
         if (-1 != this.field5919 * 324683267) {
            if (var1 >= 20) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "th.av(" + ')');
      }
   }
}
