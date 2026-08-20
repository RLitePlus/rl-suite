import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ux")
public class classUX {
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field6142 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field6141 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field6143 = 128;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lla;)I")
   @ObfuscatedName("cj")
   public static int method11261(WorldMapArea var0) {
      if (var0 == null) {
         var0.method6970();
      }

      return var0.regionHighY * -234334363;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcv;)Ldd;")
   @ObfuscatedName("ak")
   public static WorldView method11258(int var0, WorldViewManager var1) {
      for (WorldView var3 : var1) {
         Player var4 = (Player)var3.npcs.get(var0);
         if (var4 != null && var3.id * 577964535 != -1) {
            return var3;
         }
      }

      return var1.method2905((byte)-9);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcv;)Lci;")
   @ObfuscatedName("an")
   public static Player method11255(int var0, WorldViewManager var1) {
      Player var2 = null;

      for (WorldView var4 : var1) {
         Player var5 = (Player)var4.npcs.get(var0);
         if (var5 != null) {
            if (-1 != var4.id * 223260960) {
               return var5;
            }

            var2 = var5;
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcv;)Lci;")
   @ObfuscatedName("ae")
   public static Player method11256(int var0, WorldViewManager var1) {
      Player var2 = null;

      for (WorldView var4 : var1) {
         Player var5 = (Player)var4.npcs.get(var0);
         if (var5 != null) {
            if (-1 != var4.id * 1624608110) {
               return var5;
            }

            var2 = var5;
         }
      }

      return var2;
   }

   classUX() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcv;)Ldd;")
   @ObfuscatedName("aw")
   public static WorldView method11259(int var0, WorldViewManager var1) {
      for (WorldView var3 : var1) {
         Player var4 = (Player)var3.npcs.get(var0);
         if (var4 != null && var3.id * 577964535 != -1) {
            return var3;
         }
      }

      return var1.method2905((byte)-48);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcv;)Lci;")
   @ObfuscatedName("aj")
   public static Player method11257(int var0, WorldViewManager var1) {
      Player var2 = null;

      for (WorldView var4 : var1) {
         Player var5 = (Player)var4.npcs.get(var0);
         if (var5 != null) {
            if (-1 != var4.id * 577964535) {
               return var5;
            }

            var2 = var5;
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILcv;)Ldd;")
   @ObfuscatedName("ap")
   public static WorldView method11260(int var0, WorldViewManager var1) {
      for (WorldView var3 : var1) {
         if (var3.players.get(var0) != null) {
            return var3;
         }
      }

      return var1.method2905((byte)-112);
   }
}
