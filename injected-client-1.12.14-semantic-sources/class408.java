import net.runelite.api.events.GrandExchangeSearched;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pp")
public class class408 {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field5202 = 149;
   @ObfuscatedName("an")
   public static int KitDefinition_fileCount;
   @ObfuscatedName("ad")
   static int Interpreter_intStackSize;

   class408() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("lv")
   public static final void method8780(int var0, int var1, int var2, int var3, int var4) {
      try {
         for (int var5 = 0; var5 < client.rootWidgetCount * -1020775279; var5++) {
            if (var4 == 1452438221) {
               throw new IllegalStateException();
            }

            if (client.rootWidgetXs[var5] + client.rootWidgetWidths[var5] > var0) {
               if (var4 == 1452438221) {
                  throw new IllegalStateException();
               }

               if (client.rootWidgetXs[var5] < var0 + var2) {
                  if (var4 == 1452438221) {
                     return;
                  }

                  if (client.rootWidgetYs[var5] + client.rootWidgetHeights[var5] > var1) {
                     if (var4 == 1452438221) {
                        throw new IllegalStateException();
                     }

                     if (client.rootWidgetYs[var5] < var3 + var1) {
                        client.field754[var5] = true;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "pp.lv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZI)V")
   @ObfuscatedName("pz")
   static void findItemDefinitions(String var0, boolean var1, int var2) {
      GrandExchangeSearched var3 = new GrandExchangeSearched();
      SecureUrlRequester.client.getCallbacks().post(var3);
      if (!var3.isConsumed()) {
         boolean var5 = var1;
         String var4 = var0;
         int var6 = -1213394640;

         try {
            var4 = var4.toLowerCase();
            short[] var7 = new short[16];
            int var8 = 0;

            for (int var9 = 0; var9 < -1245634957 * class394.ItemDefinition_fileCount; var9++) {
               if (var6 >= 534463345) {
                  throw new IllegalStateException();
               }

               ItemComposition var10 = class150.ItemDefinition_get(var9, -639573225);
               if (var5 && !var10.isMembersOnly) {
                  if (var6 >= 534463345) {
                     return;
                  }
               } else if (388376999 * var10.noteTemplate != -1) {
                  if (var6 >= 534463345) {
                     throw new IllegalStateException();
                  }
               } else if (var10.name.toLowerCase().indexOf(var4) == -1) {
                  if (var6 >= 534463345) {
                     throw new IllegalStateException();
                  }
               } else {
                  if (var8 >= 250) {
                     if (var6 >= 534463345) {
                        throw new IllegalStateException();
                     }

                     class136.foundItemIdCount = 564577179;
                     class468.foundItemIds = null;
                     return;
                  }

                  if (var8 >= var7.length) {
                     if (var6 >= 534463345) {
                        throw new IllegalStateException();
                     }

                     short[] var11 = new short[2 * var7.length];

                     for (int var12 = 0; var12 < var8; var12++) {
                        if (var6 >= 534463345) {
                           return;
                        }

                        var11[var12] = var7[var12];
                     }

                     var7 = var11;
                  }

                  var7[var8++] = (short)var9;
               }
            }

            class468.foundItemIds = var7;
            AbstractByteArrayCopier.foundItemIndex = 0;
            class136.foundItemIdCount = -564577179 * var8;
            String[] var15 = new String[-259451539 * class136.foundItemIdCount];

            for (int var16 = 0; var16 < -259451539 * class136.foundItemIdCount; var16++) {
               if (var6 >= 534463345) {
                  throw new IllegalStateException();
               }

               var15[var16] = class150.ItemDefinition_get(var7[var16], -1735772680).name;
            }

            classPC.method8711(var15, class468.foundItemIds, -479977012);
         } catch (RuntimeException var13) {
            throw RestClientThreadFactory.newRunException(var13, "pp.pz(" + ')');
         }
      }
   }
}
