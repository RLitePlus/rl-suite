import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jt")
public class Frames extends DualNode {
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field3185 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   public static final int field3187 = 5;
   @ObfuscatedSignature(descriptor = "[Lju;")
   @ObfuscatedName("av")
   Animation[] frames;
   @ToRemove(unused = "true")
   @ObfuscatedName("br")
   static final int field3188 = 66;
   @ObfuscatedName("fs")
   static boolean field3189;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field3186 = 11;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;I)Ljt;")
   @ObfuscatedName("an")
   public static Frames method6179(AbstractArchive var0, AbstractArchive var1, int var2) {
      boolean var3 = true;
      int var4 = -1;
      int[] var5 = AbstractArchive.method8992(var0, var2, -1775968255);

      for (int var6 = 0; var6 < var5.length; var6++) {
         byte[] var7 = AbstractArchive.method9044(var0, var2, var5[var6], -2015900532);
         if (null == var7) {
            var3 = false;
         } else if (var4 == -1) {
            var4 = (var7[0] & 255) << 8 | var7[1] & 255;
         }
      }

      if (-1 != var4) {
         byte[] var9 = AbstractArchive.method9044(var1, var4, 0, -1994143434);
         if (null == var9) {
            var3 = false;
         }
      } else {
         var3 = false;
      }

      if (!var3) {
         return null;
      } else {
         try {
            return new Frames(var0, var1, var2);
         } catch (Exception var8) {
            return null;
         }
      }
   }

   Frames(AbstractArchive var1, AbstractArchive var2, int var3) {
      int var4 = AbstractArchive.method9046(var1, var3, (byte)-74);
      this.frames = new Animation[var4];
      Skeleton var5 = null;
      int[] var6 = AbstractArchive.method8992(var1, var3, -1775968255);

      for (int var7 = 0; var7 < var6.length; var7++) {
         byte[] var8 = var1.getFile(var3, var6[var7], 474393923);
         if (var5 == null) {
            int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
            byte[] var10 = AbstractArchive.method9044(var2, var9, 0, -2146284371);
            var5 = new Skeleton(var9, var10);
         }

         this.frames[var6[var7]] = new Animation(var8, var5);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;I)Ljt;")
   @ObfuscatedName("ag")
   public static Frames method6180(AbstractArchive var0, AbstractArchive var1, int var2) {
      boolean var3 = true;
      int var4 = -1;
      int[] var5 = AbstractArchive.method8992(var0, var2, -1775968255);

      for (int var6 = 0; var6 < var5.length; var6++) {
         byte[] var7 = AbstractArchive.method9044(var0, var2, var5[var6], -1996262632);
         if (null == var7) {
            var3 = false;
         } else if (var4 == -1) {
            var4 = (var7[0] & 255) << 8 | var7[1] & 255;
         }
      }

      if (-1 != var4) {
         byte[] var9 = AbstractArchive.method9044(var1, var4, 0, -2012960067);
         if (null == var9) {
            var3 = false;
         }
      } else {
         var3 = false;
      }

      if (!var3) {
         return null;
      } else {
         try {
            return new Frames(var0, var1, var2);
         } catch (Exception var8) {
            return null;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;I)Ljt;")
   @ObfuscatedName("ae")
   public static Frames method6181(AbstractArchive var0, AbstractArchive var1, int var2) {
      boolean var3 = true;
      int var4 = -1;
      int[] var5 = AbstractArchive.method8992(var0, var2, -1775968255);

      for (int var6 = 0; var6 < var5.length; var6++) {
         byte[] var7 = AbstractArchive.method9044(var0, var2, var5[var6], -2088785496);
         if (null == var7) {
            var3 = false;
         } else if (var4 == -1) {
            var4 = (var7[0] & 1074973586) << 8 | var7[1] & 1984571369;
         }
      }

      if (-1 != var4) {
         byte[] var9 = AbstractArchive.method9044(var1, var4, 0, -1981922757);
         if (null == var9) {
            var3 = false;
         }
      } else {
         var3 = false;
      }

      if (!var3) {
         return null;
      } else {
         try {
            return new Frames(var0, var1, var2);
         } catch (Exception var8) {
            return null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ai")
   public boolean method6186(int var1) {
      return this.hasAlphaTransform(var1, (byte)63);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aw")
   public boolean method6182(int var1) {
      return this.frames[var1].hasAlphaTransform;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   public boolean method6183(int var1) {
      return this.frames[var1].hasAlphaTransform;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ak")
   public boolean method6184(int var1) {
      return this.frames[var1].hasAlphaTransform;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljt;")
   @ObfuscatedName("si")
   public static Frames method6187(int var0) {
      return UrlRequest.getFrames(var0, 1219846436);
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("at")
   public boolean hasAlphaTransform(int var1, byte var2) {
      try {
         return this.frames[var1].hasAlphaTransform;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "jt.at(" + ')');
      }
   }
}
