import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wu")
public class DbTable extends DualNode {
   @ObfuscatedName("ae")
   List columns;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field6459 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field6458 = 0;
   @ObfuscatedSignature(descriptor = "[Lwh;")
   @ObfuscatedName("an")
   class586[] field6461;

   @ObfuscatedSignature(descriptor = "(I)Lwu;")
   @ObfuscatedName("eq")
   public static DbTable method11890(int var0) {
      return GraphicsObject.getDbTable(var0, (byte)-62);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwu;Ljava/lang/Object;I)Ljava/util/List;")
   @ObfuscatedName("tb")
   public static List method11885(DbTable var0, Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var3 = (Map)var0.columns.get(var2);
      return (List)var3.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   void method11882(Buffer var1) {
      int var2 = var1.packBytesToInt(957840331);
      this.field6461 = new class586[var2];
      this.columns = new ArrayList(var2);

      for (int var3 = 0; var3 < var2; var3++) {
         this.field6461[var3] = (class586)GrandExchangeOffer.findEnumerated(class586.method11705((byte)58), var1.readUnsignedByte(-366819656), (byte)1);
         int var4 = var1.packBytesToInt(-606410013);
         HashMap var5 = new HashMap(var4);

         while (var4-- > 0) {
            Object var6 = class586.method11714(this.field6461[var3], var1, 24597715);
            int var7 = var1.packBytesToInt(-1649773238);
            ArrayList var8 = new ArrayList();

            while (var7-- > 0) {
               int var9 = var1.packBytesToInt(-1588312815);
               var8.add(var9);
            }

            var5.put(var6, var8);
         }

         this.columns.add(var3, var5);
      }
   }

   public DbTable(AbstractArchive var1, int var2) {
      byte[] var3 = var1.getFile(var2, 0, -1455829675);
      method11883(this, new Buffer(var3), (byte)4);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;II)Ljava/util/List;")
   @ObfuscatedName("at")
   public List method11886(Object var1, int var2, int var3) {
      try {
         if (var2 < 0) {
            if (var3 <= 539342174) {
               throw new IllegalStateException();
            }

            var2 = 0;
         }

         Map var4 = (Map)this.columns.get(var2);
         return (List)var4.get(var1);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "wu.at(" + ')');
      }
   }

   public DbTable(AbstractArchive var1, int var2, int var3) {
      byte[] var4 = var1.getFile(var2, var3 + 1, 1420649065);
      method11883(this, new Buffer(var4), (byte)45);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;I)Ljava/util/List;")
   @ObfuscatedName("aj")
   public List method11887(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var3 = (Map)this.columns.get(var2);
      return (List)var3.get(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;)I")
   @ObfuscatedName("ge")
   public static int method11889(WorldMap var0) {
      if (var0 == null) {
         var0.method11387();
      }

      return -508056495 * var0.field6240;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;I)Ljava/util/List;")
   @ObfuscatedName("ae")
   public List method11888(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var3 = (Map)this.columns.get(var2);
      return (List)var3.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lwu;Lxa;B)V")
   @ObfuscatedName("np")
   public static void method11883(DbTable var0, Buffer var1, byte var2) {
      if (var0 == null) {
         var0.method11884(var1, var2);
      }

      try {
         int var3 = var1.packBytesToInt(11040826);
         var0.field6461 = new class586[var3];
         var0.columns = new ArrayList(var3);

         for (int var4 = 0; var4 < var3; var4++) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            var0.field6461[var4] = (class586)GrandExchangeOffer.findEnumerated(class586.method11705((byte)-111), var1.readUnsignedByte(-120180691), (byte)1);
            int var5 = var1.packBytesToInt(900656658);
            HashMap var6 = new HashMap(var5);

            while (var5-- > 0) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               Object var7 = class586.method11714(var0.field6461[var4], var1, -789663089);
               int var8 = var1.packBytesToInt(-894482097);
               ArrayList var9 = new ArrayList();

               while (var8-- > 0) {
                  if (var2 == 0) {
                     return;
                  }

                  int var10 = var1.packBytesToInt(-1254136591);
                  var9.add(var10);
               }

               var6.put(var7, var9);
            }

            var0.columns.add(var4, var6);
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "wu.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lwu;")
   @ObfuscatedName("rp")
   public static DbTable method11891(int var0) {
      return WorldMapDecorationType.getDbTable2(var0, (byte)30);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   void method11884(Buffer var1, byte var2) {
      try {
         int var3 = var1.packBytesToInt(11040826);
         this.field6461 = new class586[var3];
         this.columns = new ArrayList(var3);

         for (int var4 = 0; var4 < var3; var4++) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            this.field6461[var4] = (class586)GrandExchangeOffer.findEnumerated(class586.method11705((byte)-111), var1.readVarInt(-120180691), (byte)1);
            int var5 = var1.readShortSmartSub(900656658);
            HashMap var6 = new HashMap(var5);

            while (var5-- > 0) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               Object var7 = class586.method11714(this.field6461[var4], var1, -789663089);
               int var8 = var1.readLargeSmart(-894482097);
               ArrayList var9 = new ArrayList();

               while (var8-- > 0) {
                  if (var2 == 0) {
                     return;
                  }

                  int var10 = var1.readLargeSmart(-1254136591);
                  var9.add(var10);
               }

               var6.put(var7, var9);
            }

            this.columns.add(var4, var6);
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "wu.av(" + ')');
      }
   }
}
