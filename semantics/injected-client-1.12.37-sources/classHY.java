import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hy")
public class classHY extends WorldMapArea {
   @ObfuscatedName("al")
   HashSet field2912;
   @ObfuscatedName("ay")
   List field2913;
   @ObfuscatedName("aj")
   ArrayList field2911;
   @ToRemove(unused = "true")
   @ObfuscatedName("bz")
   static final int field2910 = 146;

   @ObfuscatedSignature(descriptor = "(Lxy;ZI)V")
   @ObfuscatedName("ce")
   void method6129(Buffer var1, boolean var2, int var3) {
      try {
         this.field2913 = new LinkedList();
         int var4 = Buffer.method13047(var1, -907205401);

         for (int var5 = 0; var5 < var4; var5++) {
            if (var3 == 1407924950) {
               throw new IllegalStateException();
            }

            int var6 = Buffer.method13110(var1, -324749371);
            classKY var7 = new classKY(var1.method13056((byte)1));
            boolean var10000;
            if (Buffer.method13039(var1, -346779531) == 1) {
               if (var3 == 1407924950) {
                  return;
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var8 = var10000;
            if (!var2) {
               if (var8) {
                  continue;
               }

               if (var3 == 1407924950) {
                  return;
               }
            }

            this.field2913.add(new classHF(null, var7, var6, null));
         }
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "hy.ce(" + ')');
      }
   }

   classHY() {
   }

   @ObfuscatedSignature(descriptor = "(Lxy;Z)V")
   @ObfuscatedName("cm")
   void method6130(Buffer var1, boolean var2) {
      this.field2913 = new LinkedList();
      int var3 = Buffer.method13047(var1, -180237716);

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = Buffer.method13110(var1, -324749371);
         classKY var6 = new classKY(var1.method13056((byte)1));
         boolean var7 = Buffer.method13039(var1, -346779531) == 1;
         if (var2 || !var7) {
            this.field2913.add(new classHF(null, var6, var5, null));
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhy;Lxy;Lxy;IZB)V")
   @ObfuscatedName("en")
   public static void method6127(classHY var0, Buffer var1, Buffer var2, int var3, boolean var4, byte var5) {
      if (var0 == null) {
         var0.method6128(var1, var1, var3, var4, var5);
      } else {
         try {
            var0.method5820(var1, var3, 1246613763);
            int var6 = Buffer.method13047(var2, -411743696);
            var0.field2912 = new HashSet(var6);

            for (int var7 = 0; var7 < var6; var7++) {
               if (var5 >= 1) {
                  throw new IllegalStateException();
               }

               classGL var8 = new classGL();

               try {
                  classGL.method5487(var8, var2, -417591206);
               } catch (IllegalStateException var12) {
                  continue;
               }

               var0.field2912.add(var8);
            }

            int var14 = Buffer.method13047(var2, -949121677);
            var0.field2911 = new ArrayList(var14);

            for (int var15 = 0; var15 < var14; var15++) {
               if (var5 >= 1) {
                  throw new IllegalStateException();
               }

               classGF var9 = new classGF();

               try {
                  classGF.method5404(var9, var2, 1660020430);
               } catch (IllegalStateException var11) {
                  continue;
               }

               var0.field2911.add(var9);
            }

            var0.method6129(var2, var4, 982814688);
         } catch (RuntimeException var13) {
            throw classEG.newRunException(var13, "hy.cx(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;Z)V")
   @ObfuscatedName("dc")
   void method6131(Buffer var1, boolean var2) {
      this.field2913 = new LinkedList();
      int var3 = Buffer.method13047(var1, 1309326328);

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = Buffer.method13110(var1, -324749371);
         classKY var6 = new classKY(var1.method13056((byte)1));
         boolean var7 = Buffer.method13039(var1, -346779531) == 1;
         if (var2 || !var7) {
            this.field2913.add(new classHF(null, var6, var5, null));
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;Z)V")
   @ObfuscatedName("dd")
   void method6132(Buffer var1, boolean var2) {
      this.field2913 = new LinkedList();
      int var3 = Buffer.method13047(var1, 752768595);

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = Buffer.method13110(var1, -324749371);
         classKY var6 = new classKY(var1.method13056((byte)1));
         boolean var7 = Buffer.method13039(var1, -346779531) == 1;
         if (var2 || !var7) {
            this.field2913.add(new classHF(null, var6, var5, null));
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwd;)Lzl;")
   @ObfuscatedName("on")
   public static classZL method6133(classWD var0) {
      return var0.field6668;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;Lxy;IZB)V")
   @ObfuscatedName("cx")
   void method6128(Buffer var1, Buffer var2, int var3, boolean var4, byte var5) {
      try {
         this.method5820(var1, var3, 1246613763);
         int var6 = Buffer.method13047(var2, -411743696);
         this.field2912 = new HashSet(var6);

         for (int var7 = 0; var7 < var6; var7++) {
            if (var5 >= 1) {
               throw new IllegalStateException();
            }

            classGL var8 = new classGL();

            try {
               classGL.method5487(var8, var2, -417591206);
            } catch (IllegalStateException var12) {
               continue;
            }

            this.field2912.add(var8);
         }

         int var14 = Buffer.method13047(var2, -949121677);
         this.field2911 = new ArrayList(var14);

         for (int var15 = 0; var15 < var14; var15++) {
            if (var5 >= 1) {
               throw new IllegalStateException();
            }

            classGF var9 = new classGF();

            try {
               classGF.method5404(var9, var2, 1660020430);
            } catch (IllegalStateException var11) {
               continue;
            }

            this.field2911.add(var9);
         }

         this.method6129(var2, var4, 982814688);
      } catch (RuntimeException var13) {
         throw classEG.newRunException(var13, "hy.cx(" + ')');
      }
   }
}
