import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jy")
public class FaceNormal {
   @ToRemove(unused = "true")
   @ObfuscatedName("bn")
   static final int field3242 = 117;
   @ObfuscatedName("at")
   int y;
   @ObfuscatedName("ag")
   int z;
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   static final int field3243 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   public static final int field3238 = 17;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   public static final int field3241 = 27;
   @ObfuscatedName("as")
   public static boolean PcmPlayer_stereo;
   @ObfuscatedName("oo")
   static int[] regionMapArchiveIds;
   @ObfuscatedName("av")
   int x;

   @ObfuscatedSignature(descriptor = "(FFFI)Lrx;")
   @ObfuscatedName("av")
   public static ProjectionCoord method6214(float var0, float var1, float var2, int var3) {
      try {
         synchronized (ProjectionCoord.field5722) {
            if (0 == ProjectionCoord.field5720 * 1970955523) {
               if (var3 <= -1793120611) {
                  throw new IllegalStateException();
               } else {
                  return new ProjectionCoord(var0, var1, var2);
               }
            } else {
               ProjectionCoord.field5722[(ProjectionCoord.field5720 -= 1300180395) * 1970955523].method9868(var0, var1, var2, 1146629800);
               return ProjectionCoord.field5722[ProjectionCoord.field5720 * 1970955523];
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "jy.av(" + ')');
      }
   }

   FaceNormal() {
   }
}
