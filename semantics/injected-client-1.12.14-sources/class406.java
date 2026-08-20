import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pn")
public class class406 implements Enum {
   @ObfuscatedName("aj")
   final int field5187;
   @ObfuscatedSignature(descriptor = "Lpn;")
   @ObfuscatedName("av")
   public static final class406 field5182 = new class406(0, 0);
   @ObfuscatedSignature(descriptor = "Lpn;")
   @ObfuscatedName("ag")
   static final class406 field5184 = new class406(2, 2);
   @ObfuscatedSignature(descriptor = "Lpn;")
   @ObfuscatedName("at")
   public static final class406 field5183 = new class406(1, 1);
   @ObfuscatedName("ae")
   final int field5188;
   @ObfuscatedSignature(descriptor = "Lpn;")
   @ObfuscatedName("an")
   public static final class406 field5185 = new class406(3, 3);
   @ObfuscatedSignature(descriptor = "Lpn;")
   @ObfuscatedName("ak")
   public static final class406 field5186 = field5184;
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   static final int field5189 = 106;

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("av")
   static boolean loadWorlds(int var0) {
      try {
         try {
            if (Huffman.World_request == null) {
               if (var0 <= -1338760881) {
                  throw new IllegalStateException();
               }

               Huffman.World_request = class164.urlRequester.request(new URL(WorldMapEvent.field4009), -726881254);
            } else if (Huffman.World_request.isDone(1741769013)) {
               if (var0 <= -1338760881) {
                  throw new IllegalStateException();
               }

               byte[] var1 = Huffman.World_request.getResponse((byte)125);
               Buffer var2 = new Buffer(var1);
               Buffer.method12015(var2, 1951201792);
               World.World_count = Buffer.method12008(var2, (byte)5) * 1540931909;
               World.World_worlds = new World[-858019443 * World.World_count];

               for (int var3 = 0; var3 < -858019443 * World.World_count; var3++) {
                  if (var0 <= -1338760881) {
                     throw new IllegalStateException();
                  }

                  World var4 = World.World_worlds[var3] = new World();
                  var4.population = Buffer.method12008(var2, (byte)5) * -1414320829;
                  var4.location = Buffer.method12015(var2, -794229617) * 98412119;
                  var4.host = var2.readStringCp1252NullCircumfixed(821666631);
                  var4.activity = var2.readStringCp1252NullCircumfixed(1646905321);
                  var4.index = var2.readUnsignedByte(1471009110) * -1591861077;
                  var4.properties = var2.readShort((byte)-113) * -1461722311;
                  var4.method920(-1);
                  var4.id = var3 * -238795003;
               }

               class154.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2, (byte)-22);
               Huffman.World_request = null;
               return true;
            }
         } catch (Exception var5) {
            var5.printStackTrace();
            Huffman.World_request = null;
         }

         return false;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "pn.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return this.field5187 * 523319105;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pn.av(" + 41);
      }
   }

   class406(int var1, int var2) {
      this.field5188 = 493501791 * var1;
      this.field5187 = -1507370815 * var2;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return this.field5187 * 523319105;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return this.field5187 * 523319105;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpn;")
   @ObfuscatedName("aj")
   public static class406[] method8772() {
      return new class406[]{field5182, field5183, field5184, field5185};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lpn;")
   @ObfuscatedName("ak")
   public static class406[] method8773() {
      return new class406[]{field5182, field5183, field5184, field5185};
   }

   @ObfuscatedSignature(descriptor = "(IIIIB)V")
   @ObfuscatedName("ms")
   static void method8778(int var0, int var1, int var2, int var3, byte var4) {
      try {
         Widget var5 = class226.widgetDefinition.getWidgetChild(var0, var1, -1275945589);
         if (var5 != null) {
            if (var4 != 1) {
               throw new IllegalStateException();
            }

            if (var5.onChatTransmit != null) {
               if (var4 != 1) {
                  throw new IllegalStateException();
               }

               ScriptEvent var6 = new ScriptEvent();
               var6.widget = var5;
               var6.args = var5.onChatTransmit;
               class141.runScriptEvent(var6, 1856325427);
            }
         }

         client.selectedSpellItemId = -159227645 * var3;
         client.isSpellSelected = true;
         Skills.selectedSpellWidget = -1881607229 * var0;
         client.selectedSpellChildIndex = var1 * 1522956395;
         DesktopPlatformInfoProvider.selectedSpellFlags = var2 * -1208776755;
         class376.invalidateWidget(var5, (byte)5);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "pn.ms(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return this.field5187 * -1521045643;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Lql;B)Lql;")
   @ObfuscatedName("av")
   static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1, byte var2) {
      try {
         int var3 = var0.readUnsignedByte(688888409);
         if (null == var1) {
            if (var2 == 2) {
               throw new IllegalStateException();
            }

            int var4 = class161.method4253(var3, (byte)0);
            var1 = new IterableNodeHashTable(var4);
         }

         for (int var9 = 0; var9 < var3; var9++) {
            if (var2 == 2) {
               throw new IllegalStateException();
            }

            boolean var10000;
            if (var0.readUnsignedByte(1040233201) == 1) {
               if (var2 == 2) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var5 = var10000;
            int var6 = var0.readMedium(58093151);
            Object var7;
            if (var5) {
               if (var2 == 2) {
                  throw new IllegalStateException();
               }

               var7 = new ObjectNode(var0.readStringCp1252NullCircumfixed(2105207774));
            } else {
               var7 = new IntegerNode(Buffer.method12015(var0, -669564110));
            }

            var1.put((Node)var7, (long)var6);
         }

         return var1;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "pn.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcq;)I")
   @ObfuscatedName("ay")
   public static int method8777(ObjectSound var0) {
      return 30889521 * var0.field1096;
   }

   @ObfuscatedSignature(descriptor = "(CB)Z")
   @ObfuscatedName("av")
   static final boolean method8775(char var0, byte var1) {
      try {
         if (Character.isISOControl(var0)) {
            if (var1 <= 61) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (class189.isAlphaNumeric(var0, 1685930785)) {
            return true;
         } else {
            char[] var2 = classWA.field6347;

            for (int var3 = 0; var3 < var2.length; var3++) {
               if (var1 <= 61) {
                  throw new IllegalStateException();
               }

               char var4 = var2[var3];
               if (var4 == var0) {
                  if (var1 <= 61) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            var2 = classWA.field6348;

            for (int var7 = 0; var7 < var2.length; var7++) {
               if (var1 <= 61) {
                  throw new IllegalStateException();
               }

               char var8 = var2[var7];
               if (var0 == var8) {
                  if (var1 <= 61) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "pn.av(" + ')');
      }
   }
}
