import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fg")
public class class138 implements Callable {
   @ObfuscatedSignature(descriptor = "Lfq;")
   @ObfuscatedName("at")
   final class140 field1775;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("kg")
   static Archive field1779;
   @ObfuscatedName("an")
   final int field1773;
   @ObfuscatedSignature(descriptor = "Lfz;")
   @ObfuscatedName("ag")
   final class141 field1774;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field1777 = 2;
   @ObfuscatedSignature(descriptor = "Lft;")
   @ObfuscatedName("av")
   final classFT field1776;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("ad")
   public static AbstractArchive ItemDefinition_archive;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;)Z")
   @ObfuscatedName("zk")
   public static boolean method3979(ClientPreferences var0) {
      if (var0 == null) {
         var0.getAreaSoundEffectVolume();
      }

      return var0.roofsHidden;
   }

   @ObfuscatedSignature(descriptor = "(Ldd;ZLxj;I)V")
   @ObfuscatedName("li")
   static final void method3983(WorldView var0, boolean var1, PacketBuffer var2, int var3) {
      try {
         while (true) {
            byte var4 = 16;
            int var5 = 1 << var4;
            if (var2.readBits(253081433 * client.packetWriter.serverPacketLength, -1549766289) >= var4 + 12) {
               int var6 = var2.method12339(var4, 1333712909);
               if (var6 != var5 - 1) {
                  boolean var7 = false;
                  NPC var8 = (NPC)var0.players.get(var6);
                  if (var8 == null) {
                     if (var3 != -1570779086) {
                        return;
                     }

                     var8 = new NPC(var6);
                     GrandExchangeOfferTotalQuantityComparator.method9179(var0.players, var8, var6);
                     var7 = true;
                  }

                  var0.field1313.method10495(var6, (byte)-6);
                  var8.field1498 = false;
                  var8.worldViewId = 921498739 * var0.id;
                  int var10;
                  if (var1) {
                     if (var3 != -1570779086) {
                        throw new IllegalStateException();
                     }

                     var10 = var2.method12339(8, 1333712909);
                     if (var10 > 127) {
                        if (var3 != -1570779086) {
                           throw new IllegalStateException();
                        }

                        var10 -= 256;
                     }
                  } else {
                     var10 = var2.method12339(6, 1333712909);
                     if (var10 > 31) {
                        var10 -= 64;
                     }
                  }

                  boolean var10000;
                  if (var2.method12339(1, 1333712909) == 1) {
                     if (var3 != -1570779086) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var12 = var10000;
                  if (var12) {
                     var2.method12339(32, 1333712909);
                  }

                  int var13 = client.defaultRotations[var2.method12339(3, 1333712909)];
                  if (var7) {
                     if (var3 != -1570779086) {
                        throw new IllegalStateException();
                     }

                     var8.orientation = (var8.rotation = var13 * -1511045985) * 409082421;
                     var8.field1123 = var8.orientation * 628888237;
                  }

                  int var9 = var2.method12339(1, 1333712909);
                  int var11;
                  if (var1) {
                     if (var3 != -1570779086) {
                        throw new IllegalStateException();
                     }

                     var11 = var2.method12339(8, 1333712909);
                     if (var11 > 127) {
                        if (var3 != -1570779086) {
                           return;
                        }

                        var11 -= 256;
                     }
                  } else {
                     var11 = var2.method12339(6, 1333712909);
                     if (var11 > 31) {
                        if (var3 != -1570779086) {
                           throw new IllegalStateException();
                        }

                        var11 -= 64;
                     }
                  }

                  NPCComposition var10001 = AsyncHttpResponse.getNpcDefinition(var2.method12339(14, 1333712909), (byte)98);
                  var8.method3552(var10001);
                  var8.definition = var10001;
                  int var14 = var2.method12339(1, 1333712909);
                  if (var14 == 1) {
                     client.npcIndices[(client.npcCount += -1508875419) * 6231661 - 1] = var6;
                  }

                  classFM.method4030(var8, -1866562559);
                  if (662711013 * var8.field1158 == 0) {
                     if (var3 != -1570779086) {
                        throw new IllegalStateException();
                     }

                     var8.rotation = 0;
                  }

                  int var16 = 1362339427 * SceneTilePaint.field3592 + var10;
                  int var10002 = 1887074611 * GraphicsObject.field223 + var11;
                  boolean var10003;
                  if (var9 == 1) {
                     if (var3 != -1570779086) {
                        throw new IllegalStateException();
                     }

                     var10003 = true;
                  } else {
                     var10003 = false;
                  }

                  NPC.method3515(var8, var16, var10002, var10003, -1777612090);
                  continue;
               }

               if (var3 != -1570779086) {
                  throw new IllegalStateException();
               }
            }

            var2.exportIndex((byte)61);
            return;
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "fg.li(" + ')');
      }
   }

   @Override
   public Object call() {
      try {
         classFT.method4107(this.field1776, (byte)2);
         classFT[][] var1;
         if (class140.field1834 == this.field1775) {
            var1 = this.this$0.field1944;
         } else {
            var1 = this.this$0.field1945;
         }

         var1[this.field1773 * -2040720483][this.field1774.method4209((byte)1)] = this.field1776;
         return null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fg.call(" + ')');
      }
   }

   class138(classFY var1, classFT var2, class140 var3, class141 var4, int var5) {
      this.this$0 = var1;
      this.field1776 = var2;
      this.field1775 = var3;
      this.field1774 = var4;
      this.field1773 = var5 * 1343294133;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("av")
   public Object method3980() {
      classFT.method4107(this.field1776, (byte)-11);
      classFT[][] var1;
      if (class140.field1834 == this.field1775) {
         var1 = this.this$0.field1944;
      } else {
         var1 = this.this$0.field1945;
      }

      var1[this.field1773 * -2040720483][this.field1774.method4209((byte)1)] = this.field1776;
      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfg;)Ljava/lang/Object;")
   @ObfuscatedName("pf")
   public static Object method3981(class138 var0) {
      classFT.method4107(var0.field1776, (byte)-10);
      classFT[][] var1;
      if (class140.field1834 == var0.field1775) {
         var1 = var0.this$0.field1944;
      } else {
         var1 = var0.this$0.field1945;
      }

      var1[var0.field1773 * -266815504][var0.field1774.method4209((byte)1)] = var0.field1776;
      return null;
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("bu")
   static int method3982(int var0, Script var1, boolean var2, int var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "fg.bu(" + 41);
      }
   }
}
