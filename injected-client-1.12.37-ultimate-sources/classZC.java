import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("zc")
public class classZC extends classVJ {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field7150 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field7148 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field7147 = 0;
   @ObfuscatedSignature(descriptor = "[Lyy;")
   @ObfuscatedName("ab")
   classYY[] field7152;
   @ObfuscatedName("ag")
   List field7151;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field7149 = 4;

   public classZC(classVA var1, int var2) {
      byte[] var3 = var1.method11867(var2, 0, -1251911506);
      if (null != var3) {
         this.method13832(new classXY(var3), (byte)2);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ax")
   void method13831(classXY var1) {
      int var2 = classXY.method13119(var1, -1101542591);
      this.field7152 = new classYY[var2];
      this.field7151 = new ArrayList(var2);

      for (int var3 = 0; var3 < var2; var3++) {
         this.field7152[var3] = (classYY)classOF.method8404(classYY.method13782((byte)76), classXY.method13039(var1, -346779531), 1583855012);
         int var4 = classXY.method13119(var1, -747970285);
         HashMap var5 = new HashMap(var4);

         while (var4-- > 0) {
            Object var6 = this.field7152[var3].method13787(var1, 827988912);
            int var7 = classXY.method13119(var1, -151343769);
            ArrayList var8 = new ArrayList();

            while (var7-- > 0) {
               int var9 = classXY.method13119(var1, -1881555353);
               var8.add(var9);
            }

            var5.put(var6, var8);
         }

         this.field7151.add(var3, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("az")
   public boolean method13828(int var1) {
      try {
         boolean var10000;
         if (this.field7152 != null) {
            if (var1 <= 132222543) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "zc.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;B)V")
   @ObfuscatedName("af")
   void method13832(classXY var1, byte var2) {
      try {
         int var3 = classXY.method13119(var1, -1998324959);
         this.field7152 = new classYY[var3];
         this.field7151 = new ArrayList(var3);

         for (int var4 = 0; var4 < var3; var4++) {
            if (var2 == 0) {
               return;
            }

            this.field7152[var4] = (classYY)classOF.method8404(classYY.method13782((byte)-4), classXY.method13039(var1, -346779531), 54392156);
            int var5 = classXY.method13119(var1, -1788832399);
            HashMap var6 = new HashMap(var5);

            while (var5-- > 0) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               Object var7 = this.field7152[var4].method13787(var1, 827988912);
               int var8 = classXY.method13119(var1, -1373334814);
               ArrayList var9 = new ArrayList();

               while (var8-- > 0) {
                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }

                  int var10 = classXY.method13119(var1, 176951995);
                  var9.add(var10);
               }

               var6.put(var7, var9);
            }

            this.field7151.add(var4, var6);
         }
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "zc.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lzc;")
   @ObfuscatedName("lm")
   public static classZC method13837(int var0) {
      return classBA.method779(var0, 2135996924);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   public boolean method13829() {
      return this.field7152 != null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ab")
   public boolean method13830() {
      return this.field7152 != null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;IB)Ljava/util/List;")
   @ObfuscatedName("ae")
   public List method13834(Object var1, int var2, byte var3) {
      try {
         if (var2 < 0) {
            if (var3 == 1) {
               throw new IllegalStateException();
            }

            var2 = 0;
         }

         Map var4 = (Map)this.field7151.get(var2);
         return (List)var4.get(var1);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "zc.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("as")
   void method13833(classXY var1) {
      int var2 = classXY.method13119(var1, 221140724);
      this.field7152 = new classYY[var2];
      this.field7151 = new ArrayList(var2);

      for (int var3 = 0; var3 < var2; var3++) {
         this.field7152[var3] = (classYY)classOF.method8404(classYY.method13782((byte)55), classXY.method13039(var1, -346779531), -1159903959);
         int var4 = classXY.method13119(var1, -249936447);
         HashMap var5 = new HashMap(var4);

         while (var4-- > 0) {
            Object var6 = this.field7152[var3].method13787(var1, 827988912);
            int var7 = classXY.method13119(var1, -915204940);
            ArrayList var8 = new ArrayList();

            while (var7-- > 0) {
               int var9 = classXY.method13119(var1, -1022044693);
               var8.add(var9);
            }

            var5.put(var6, var8);
         }

         this.field7151.add(var3, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;I)Ljava/util/List;")
   @ObfuscatedName("ac")
   public List method13835(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var3 = (Map)this.field7151.get(var2);
      return (List)var3.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)Lzc;")
   @ObfuscatedName("wt")
   public static classZC method13838(int var0) {
      return classHT.method6112(var0, -1765104593);
   }

   public classZC(classVA var1, int var2, int var3) {
      byte[] var4 = var1.method11867(var2, var3 + 1, -960653587);
      if (null != var4) {
         this.method13832(new classXY(var4), (byte)32);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;I)Ljava/util/List;")
   @ObfuscatedName("aa")
   public List method13836(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var3 = (Map)this.field7151.get(var2);
      return (List)var3.get(var1);
   }
}
