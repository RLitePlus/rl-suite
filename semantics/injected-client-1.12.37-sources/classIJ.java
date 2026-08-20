import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ij")
public class classIJ extends classHB {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2977 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field2978 = 18;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   static final String field2982 = "dt";
   @ObfuscatedName("iz")
   static int field2981;
   @ObfuscatedName("az")
   int field2976;
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   static final int field2979 = 61;
   @ToRemove(unused = "true")
   @ObfuscatedName("cc")
   static final int field2980 = 59;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("gt")
   static final void method6216(String var0, int var1) {
      try {
         if (var0.equals("")) {
            if (var1 != -1142457594) {
               throw new IllegalStateException();
            }
         } else {
            PacketBufferNode var2 = classEF.getPacketBufferNode(ClientPacket.FRIENDCHAT_JOIN_LEAVE, client.packetWriter.isaacCipher, (byte)-48);
            Buffer.method12971(var2.packetBuffer, classAU.method712(var0, (byte)59), (byte)-76);
            Buffer.method12997(var2.packetBuffer, var0, (short)19626);
            client.packetWriter.addNode(var2, -1301097035);
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "ij.gt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod501(Buffer var1) {
      this.field2976 = Buffer.method13047(var1, 1811243603) * -595538065;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod498(Buffer var1, int var2) {
      try {
         this.field2976 = Buffer.method13047(var1, -518976421) * -595538065;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "ij.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod500(Buffer var1) {
      this.field2976 = Buffer.method13047(var1, -1405582422) * -378118865;
   }

   classIJ(classIF var1) {
      this.this$0 = var1;
      this.field2976 = 595538065;
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod502(ClanSettings var1) {
      ClanSettings.method6255(var1, 1779789711 * this.field2976, 702383331);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod503(ClanSettings var1) {
      ClanSettings.method6255(var1, 1779789711 * this.field2976, 434519228);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod504(ClanSettings var1) {
      ClanSettings.method6255(var1, 1779789711 * this.field2976, 55426774);
   }

   @ObfuscatedSignature(descriptor = "(Liq;B)V")
   @ObfuscatedName("af")
   @Override
   void vmethod499(ClanSettings var1, byte var2) {
      try {
         ClanSettings.method6255(var1, 1779789711 * this.field2976, 1185036733);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "ij.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/ArrayList;IIIIZI)V")
   @ObfuscatedName("af")
   public static void method6215(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         if (var0.isEmpty()) {
            if (var6 >= 492858962) {
               throw new IllegalStateException();
            }
         } else {
            classNP.field4697.clear();
            classNP.field4700.clear();
            if (var5) {
               classGK.method5486(973918153);
            } else {
               for (int var7 = 0; var7 < classNP.field4698.size(); var7++) {
                  MidiRequest var8 = (MidiRequest)classNP.field4698.get(var7);
                  if (var8 == null) {
                     if (var6 >= 492858962) {
                        throw new IllegalStateException();
                     }

                     classNP.field4698.remove(var7);
                     var7--;
                  } else if (var8.field4633) {
                     if (var6 >= 492858962) {
                        return;
                     }

                     if (917328323 * var8.field4641.field4751 > 0) {
                        if (var6 >= 492858962) {
                           return;
                        }

                        var8.field4641.field4751 -= 16852715;
                     }

                     var8.field4641.method8040((byte)69);
                     var8.field4641.method8026((byte)0);
                     var8.field4641.method8009(0, -1159796592);
                     classNP.field4698.remove(var7);
                     var7--;
                  } else {
                     var8.field4633 = true;
                  }
               }
            }

            if (!var5) {
               if (var6 >= 492858962) {
                  throw new IllegalStateException();
               }

               classNP.field4699.clear();
            }

            for (MidiRequest var16 : var0) {
               if (-1 != 1942111947 * var16.field4632) {
                  if (450234221 * var16.field4630 == -1) {
                     if (var6 >= 492858962) {
                        throw new IllegalStateException();
                     }
                  } else {
                     if (!var5) {
                        if (var6 >= 492858962) {
                           throw new IllegalStateException();
                        }

                        classNP.field4699.add(var16);
                     }

                     classNP.field4697.add(var16);
                  }
               }
            }

            if (classNP.field4697.isEmpty()) {
               if (var6 < 492858962) {
                  ;
               }
            } else {
               classIF.method6207(var1, var2, var3, var4, (byte)-32);
               classNP.field4700.add(new classWN(null));
               classNP.field4700.add(new classWS(null, classIA.field2927, classRM.field5809, classNP.field4705));
               ArrayList var15 = new ArrayList();
               var15.add(new classWK(new classWP(null, 0, true, classNP.field4701 * 396217257)));
               if (!classNP.field4698.isEmpty()) {
                  ArrayList var17 = new ArrayList();
                  var17.add(new classWU(new classWQ(null, var15), -1350272915 * classNP.field4696));
                  ArrayList var10 = new ArrayList();
                  Iterator var11 = classNP.field4698.iterator();

                  while (var11.hasNext()) {
                     if (var6 >= 492858962) {
                        throw new IllegalStateException();
                     }

                     MidiRequest var12 = (MidiRequest)var11.next();
                     var10.add(var12);
                  }

                  var17.add(new classWU(new classWO(new classWL(null, var10), 0, false, 1784906769 * classNP.field4702), -1331669075 * classNP.field4703));
                  classNP.field4700.add(new classWQ(null, var17));
               } else {
                  classNP.field4700.add(new classWU(null, -1350272915 * classNP.field4696));
                  classNP.field4700.add(new classWQ(null, var15));
               }
            }
         }
      } catch (RuntimeException var13) {
         throw classEG.newRunException(var13, "ij.af(" + ')');
      }
   }
}
