import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.json.JSONObject;

@ObfuscatedName("mf")
public class WorldMapCacheName {
   @ObfuscatedName("aj")
   public final String name;
   @ObfuscatedSignature(descriptor = "Lmf;")
   @ObfuscatedName("ag")
   public static final WorldMapCacheName field3838 = new WorldMapCacheName("compositetexture");
   @ObfuscatedSignature(descriptor = "Lmf;")
   @ObfuscatedName("av")
   public static final WorldMapCacheName field3834 = new WorldMapCacheName("details");
   @ObfuscatedSignature(descriptor = "Lmf;")
   @ObfuscatedName("an")
   static final WorldMapCacheName field3835 = new WorldMapCacheName("area");
   @ObfuscatedSignature(descriptor = "Lmf;")
   @ObfuscatedName("ae")
   public static final WorldMapCacheName field3836 = new WorldMapCacheName("labels");
   @ObfuscatedSignature(descriptor = "Lmf;")
   @ObfuscatedName("at")
   public static final WorldMapCacheName field3837 = new WorldMapCacheName("compositemap");

   WorldMapCacheName(String var1) {
      this.name = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lky;)I")
   @ObfuscatedName("jm")
   public static int method7398(Model var0) {
      if (var0 == null) {
         var0.method6741();
      }

      var0.method6864();
      return var0.diameter;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lub;)Lorg/json/JSONObject;")
   @ObfuscatedName("su")
   public static JSONObject method7397(HttpJsonRequestBody var0) {
      return var0.body;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("an")
   public static boolean method7396(int var0, int var1) {
      try {
         boolean var10000;
         if (0 != (var0 >> 22 & 1)) {
            if (var1 != -604505976) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "mf.an(" + ')');
      }
   }
}
