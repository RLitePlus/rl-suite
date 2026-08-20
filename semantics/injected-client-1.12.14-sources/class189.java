import java.awt.event.WindowEvent;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hx")
public class class189 {
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("kj")
   static Archive archive4;
   @ObfuscatedSignature(descriptor = "Lvj;")
   @ObfuscatedName("op")
   static Fonts field2415;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field2413 = 1076101507;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;Lql;)Lql;")
   @ObfuscatedName("an")
   static final IterableNodeHashTable method4807(Buffer var0, IterableNodeHashTable var1) {
      int var2 = var0.readUnsignedByte(-14740327);
      if (null == var1) {
         int var3 = class161.method4253(var2, (byte)0);
         var1 = new IterableNodeHashTable(var3);
      }

      for (int var7 = 0; var7 < var2; var7++) {
         boolean var4 = var0.readUnsignedByte(-587624086) == 1;
         int var5 = var0.readMedium(-1644495785);
         Object var6;
         if (var4) {
            var6 = new ObjectNode(var0.readStringCp1252NullCircumfixed(1933180433));
         } else {
            var6 = new IntegerNode(Buffer.method12015(var0, 1055079583));
         }

         var1.put((Node)var6, (long)var5);
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;Lql;)Lql;")
   @ObfuscatedName("ae")
   static final IterableNodeHashTable method4808(Buffer var0, IterableNodeHashTable var1) {
      int var2 = var0.readUnsignedByte(1686543284);
      if (null == var1) {
         int var3 = class161.method4253(var2, (byte)0);
         var1 = new IterableNodeHashTable(var3);
      }

      for (int var7 = 0; var7 < var2; var7++) {
         boolean var4 = var0.readUnsignedByte(1224084240) == 1;
         int var5 = var0.readMedium(-1073852589);
         Object var6;
         if (var4) {
            var6 = new ObjectNode(var0.readStringCp1252NullCircumfixed(-861325130));
         } else {
            var6 = new IntegerNode(Buffer.method12015(var0, 925209844));
         }

         var1.put((Node)var6, (long)var5);
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcq;)V")
   @ObfuscatedName("ki")
   public static void method4816(ObjectSound var0) {
      if (var0.stream1 != null) {
         class50.pcmStreamMixer.removeSubStream(var0.stream1);
         var0.stream1 = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lql;ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ak")
   static String method4810(IterableNodeHashTable var0, int var1, String var2) {
      if (null == var0) {
         return var2;
      } else {
         ObjectNode var3 = (ObjectNode)var0.get((long)var1);
         return var3 == null ? var2 : (String)var3.obj;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lql;ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("aj")
   static String method4811(IterableNodeHashTable var0, int var1, String var2) {
      if (null == var0) {
         return var2;
      } else {
         ObjectNode var3 = (ObjectNode)var0.get((long)var1);
         return var3 == null ? var2 : (String)var3.obj;
      }
   }

   class189() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lql;ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("aw")
   static String method4812(IterableNodeHashTable var0, int var1, String var2) {
      if (null == var0) {
         return var2;
      } else {
         ObjectNode var3 = (ObjectNode)var0.get((long)var1);
         return var3 == null ? var2 : (String)var3.obj;
      }
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("an")
   public static void method4814(boolean var0, byte var1) {
      try {
         if (var0 != TileItem.ItemDefinition_inMembersWorld) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            ItemComposition.ItemDefinition_cached.clear();
            ItemComposition.ItemDefinition_cachedModels.clear();
            ItemComposition.ItemDefinition_cachedSprites.clear();
            TileItem.ItemDefinition_inMembersWorld = var0;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hx.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(CI)Z")
   @ObfuscatedName("au")
   public static boolean isAlphaNumeric(char var0, int var1) {
      try {
         if (var0 >= '0') {
            if (var1 <= -1191134791) {
               throw new IllegalStateException();
            }

            if (var0 <= '9') {
               return true;
            }

            if (var1 <= -1191134791) {
               throw new IllegalStateException();
            }
         }

         if (var0 >= 'A') {
            if (var1 <= -1191134791) {
               throw new IllegalStateException();
            }

            if (var0 <= 'Z') {
               return true;
            }
         }

         if (var0 < 'a' || var0 > 'z') {
            return false;
         } else if (var1 <= -1191134791) {
            throw new IllegalStateException();
         } else {
            return true;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hx.au(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("cm")
   public static void method4817(GameEngine var0, WindowEvent var1) {
      if (var0 == null) {
         var0.method762();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldk;I)I")
   @ObfuscatedName("aw")
   static int method4815(RawPcmStream var0, int var1) {
      try {
         if (null != var0) {
            if (var1 == 2108391709) {
               throw new IllegalStateException();
            } else {
               return var0.method3247();
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hx.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Liz;")
   @ObfuscatedName("av")
   public static FloorOverlayDefinition method4809(int var0, int var1) {
      try {
         FloorOverlayDefinition var2 = (FloorOverlayDefinition)class402.method8806(FloorOverlayDefinition.FloorOverlayDefinition_cached, var0);
         if (var2 != null) {
            if (var1 <= 1841897446) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = FloorOverlayDefinition.FloorOverlayDefinition_archive.getFile(4, var0, 227216922);
            var2 = new FloorOverlayDefinition();
            if (null != var3) {
               if (var1 <= 1841897446) {
                  throw new IllegalStateException();
               }

               var2.decode(new Buffer(var3), var0, (byte)48);
            }

            var2.method5343(423374463);
            FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hx.av(" + ')');
      }
   }
}
