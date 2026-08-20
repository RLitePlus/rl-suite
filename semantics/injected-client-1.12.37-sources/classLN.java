import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ln")
public class classLN {
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   public static final int field4191 = 19;
   @ObfuscatedSignature(descriptor = "Ley;")
   @ObfuscatedName("az")
   classEY field4190;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final long field4192 = 86400000L;
   @ObfuscatedSignature(descriptor = "Lym;")
   @ObfuscatedName("af")
   SpritePixels field4193;

   classLN(String var1, classDA var2) {
      try {
         this.field4190 = var2.method2872(new URL(var1), 869537695);
      } catch (MalformedURLException var4) {
         this.field4190 = null;
      }
   }

   classLN(classEY var1) {
      this.field4190 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;)I")
   @ObfuscatedName("yq")
   public static int method7125(Scene var0) {
      return var0.field2064;
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("ab")
   SpritePixels method7121() {
      if (null == this.field4193 && this.field4190 != null && this.field4190.method4106(2052128257)) {
         if (this.field4190.method4112(1145062404) != null) {
            this.field4193 = classIT.method6314(this.field4190.method4112(1145062404), 1867148155);
         }

         this.field4190 = null;
      }

      return this.field4193;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lln;)Lym;")
   @ObfuscatedName("os")
   public static SpritePixels method7122(classLN var0) {
      if (null == var0.field4193 && var0.field4190 != null && var0.field4190.method4106(1653383308)) {
         if (var0.field4190.method4112(1145062404) != null) {
            var0.field4193 = classIT.method6314(var0.field4190.method4112(1145062404), 1525019442);
         }

         var0.field4190 = null;
      }

      return var0.field4193;
   }

   @ObfuscatedSignature(descriptor = "(I)Lym;")
   @ObfuscatedName("az")
   SpritePixels method7123(int var1) {
      try {
         if (null == this.field4193) {
            if (var1 <= -386472562) {
               throw new IllegalStateException();
            }

            if (this.field4190 != null) {
               if (var1 <= -386472562) {
                  throw new IllegalStateException();
               }

               if (this.field4190.method4106(1864295050)) {
                  if (this.field4190.method4112(1145062404) != null) {
                     if (var1 <= -386472562) {
                        throw new IllegalStateException();
                     }

                     this.field4193 = classIT.method6314(this.field4190.method4112(1145062404), 1561807024);
                  }

                  this.field4190 = null;
               }
            }
         }

         return this.field4193;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ln.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;IB)Z")
   @ObfuscatedName("al")
   static boolean method7126(AbstractArchive var0, int var1, byte var2) {
      try {
         byte[] var3 = AbstractArchive.method11814(var0, var1, 1334120179);
         if (var3 == null) {
            if (var2 != 0) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            classYS.method13624(var3, -1108124092);
            return true;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "ln.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)V")
   @ObfuscatedName("ee")
   static void method7127(int var0, String var1, int var2) {
      try {
         int var3 = client.field837.field1419 * -2087374717;
         int[] var4 = client.field837.field1423;
         boolean var5 = false;
         classAAE var6 = new classAAE(var1, InterfaceParent.field5279);
         WorldView var7 = client.field814.method1590(client.field846 * -2034209657, (short)6359);
         WorldView var8 = var7;
         if (null == var7) {
            if (var2 <= 1518330686) {
               throw new IllegalStateException();
            } else {
               classPH.method8883(4, "", classKK.field3640 + var1 + ", current world null.", 1408645042);
            }
         } else {
            for (int var9 = 0; var9 < var3; var9++) {
               Player var10 = (Player)var8.field1694.method13404(var4[var9]);
               if (null != var10) {
                  if (var2 <= 1518330686) {
                     throw new IllegalStateException();
                  }

                  if (-2130951373 * client.field845 != -1315528093 * var10.field1480) {
                     if (var2 <= 1518330686) {
                        throw new IllegalStateException();
                     }

                     if (var10.field1283 != null) {
                        if (var2 <= 1518330686) {
                           return;
                        }

                        if (var10.field1283.equals(var6)) {
                           if (var2 <= 1518330686) {
                              return;
                           }

                           if (1 == var0) {
                              if (var2 <= 1518330686) {
                                 throw new IllegalStateException();
                              }

                              PacketBufferNode var11 = classEF.getPacketBufferNode(ClientPacket.OPPLAYER1, client.packetWriter.isaacCipher, (byte)24);
                              var11.packetBuffer.method13153(0, (byte)-20);
                              var11.packetBuffer.method12973(var4[var9], -1542382992);
                              client.packetWriter.addNode(var11, -1301097035);
                           } else if (var0 == 4) {
                              if (var2 <= 1518330686) {
                                 throw new IllegalStateException();
                              }

                              PacketBufferNode var13 = classEF.getPacketBufferNode(ClientPacket.OPPLAYER4, client.packetWriter.isaacCipher, (byte)18);
                              var13.packetBuffer.method13156(0, (byte)-6);
                              var13.packetBuffer.method12973(var4[var9], -1542382992);
                              client.packetWriter.addNode(var13, -1301097035);
                           } else if (6 == var0) {
                              if (var2 <= 1518330686) {
                                 throw new IllegalStateException();
                              }

                              PacketBufferNode var14 = classEF.getPacketBufferNode(ClientPacket.OPPLAYER6, client.packetWriter.isaacCipher, (byte)14);
                              var14.packetBuffer.method13151(0, -1910538783);
                              Buffer.method13180(var14.packetBuffer, var4[var9], (byte)-26);
                              client.packetWriter.addNode(var14, -1301097035);
                           } else if (7 == var0) {
                              PacketBufferNode var15 = classEF.getPacketBufferNode(ClientPacket.OPPLAYER7, client.packetWriter.isaacCipher, (byte)-75);
                              var15.packetBuffer.method13151(0, -1910538783);
                              Buffer.method13180(var15.packetBuffer, var4[var9], (byte)12);
                              client.packetWriter.addNode(var15, -1301097035);
                           }

                           var5 = true;
                           break;
                        }
                     }
                  }
               }
            }

            if (!var5) {
               if (var2 <= 1518330686) {
                  return;
               }

               classPH.method8883(4, "", classKK.field3640 + var1, 1289350155);
            }
         }
      } catch (RuntimeException var12) {
         throw classEG.newRunException(var12, "ln.ee(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("ae")
   SpritePixels method7124() {
      if (null == this.field4193 && this.field4190 != null && this.field4190.method4106(1473792848)) {
         if (this.field4190.method4112(1145062404) != null) {
            this.field4193 = classIT.method6314(this.field4190.method4112(1145062404), 1783541196);
         }

         this.field4190 = null;
      }

      return this.field4193;
   }
}
