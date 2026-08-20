import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("as")
public class AsyncRestClient {
   @ObfuscatedName("av")
   final String threadNamePrefix;
   @ObfuscatedName("at")
   final ThreadFactory threadFactory;
   @ObfuscatedName("an")
   final int workQueueCapacity;
   @ObfuscatedName("ag")
   final ThreadPoolExecutor threadPoolExecutor;

   public AsyncRestClient(String var1, int var2, int var3) {
      this.threadNamePrefix = var1;
      this.workQueueCapacity = -567001057 * var2;
      this.threadFactory = new RestClientThreadFactory(this);
      this.threadPoolExecutor = this.createThreadPoolExecutor(var3, (byte)-67);
   }

   @ObfuscatedSignature(descriptor = "(IB)Ljava/util/concurrent/ThreadPoolExecutor;")
   @ObfuscatedName("av")
   final ThreadPoolExecutor createThreadPoolExecutor(int var1, byte var2) {
      return new ThreadPoolExecutor(0, var1, 2L, TimeUnit.MINUTES, new ArrayBlockingQueue<>(this.workQueueCapacity * 1336622047), this.threadFactory);
   }

   @ObfuscatedSignature(descriptor = "(Lau;I)Lar;")
   @ObfuscatedName("at")
   public AsyncHttpResponse submitRequest(HttpRequest var1, int var2) {
      try {
         if (this.threadPoolExecutor.getQueue().remainingCapacity() <= 0) {
            System.err
               .println(
                  "REST thread pool queue is empty\r\nThread pool size "
                     + this.threadPoolExecutor.getCorePoolSize()
                     + " Queue capacity "
                     + this.workQueueCapacity * 1336622047
               );
            return new AsyncHttpResponse("Queue full");
         } else {
            return new AsyncHttpResponse(this.threadPoolExecutor.submit(new HttpRequestTask(this, var1)));
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "as.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Loq;B)V")
   @ObfuscatedName("av")
   public static void method235(Huffman var0, byte var1) {
      try {
         class365.huffman = var0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "as.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Las;I)Ljava/util/concurrent/ThreadPoolExecutor;")
   @ObfuscatedName("wz")
   public static ThreadPoolExecutor method236(AsyncRestClient var0, int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(1720281370 * var0.workQueueCapacity), var0.threadFactory);
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("cu")
   static int method246(int var0, Script var1, boolean var2, int var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "as.cu(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Las;I)V")
   @ObfuscatedName("vh")
   public static void method242(AsyncRestClient var0, int var1) {
      if (var0 == null) {
         var0.shutdown(var1);
      }

      try {
         try {
            var0.threadPoolExecutor.shutdown();
         } catch (Exception var3) {
            System.err.println("Error shutting down RestRequestService\r\n" + var3);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "as.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lau;)Lar;")
   @ObfuscatedName("aj")
   public AsyncHttpResponse method239(HttpRequest var1) {
      if (this.threadPoolExecutor.getQueue().remainingCapacity() <= 0) {
         System.err
            .println(
               "REST thread pool queue is empty\r\nThread pool size "
                  + this.threadPoolExecutor.getCorePoolSize()
                  + " Queue capacity "
                  + this.workQueueCapacity * 1336622047
            );
         return new AsyncHttpResponse("Queue full");
      } else {
         return new AsyncHttpResponse(this.threadPoolExecutor.submit(new HttpRequestTask(this, var1)));
      }
   }

   @ObfuscatedSignature(descriptor = "(Lau;)Lar;")
   @ObfuscatedName("ak")
   public AsyncHttpResponse method240(HttpRequest var1) {
      if (this.threadPoolExecutor.getQueue().remainingCapacity() <= 0) {
         System.err
            .println(
               "REST thread pool queue is empty\r\nThread pool size "
                  + this.threadPoolExecutor.getCorePoolSize()
                  + " Queue capacity "
                  + this.workQueueCapacity * 1336622047
            );
         return new AsyncHttpResponse("Queue full");
      } else {
         return new AsyncHttpResponse(this.threadPoolExecutor.submit(new HttpRequestTask(this, var1)));
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   public final void method243() {
      try {
         this.threadPoolExecutor.shutdown();
      } catch (Exception var2) {
         System.err.println("Error shutting down RestRequestService\r\n" + var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lci;IIIII)V")
   @ObfuscatedName("mc")
   static final void addPlayerToMenu(Player var0, int var1, int var2, int var3, int var4, int var5) {
      boolean var6 = Scene.method5720(var0, false);
      if (var6) {
         int var11 = var4;
         int var10 = var3;
         int var9 = var2;
         int var8 = var1;
         Player var7 = var0;
         int var12 = 1394457789;

         try {
            if (var7.index * -1903023775 == -1548864151 * client.localPlayerIndex) {
               if (var12 <= 505990505) {
               }
            } else if (1759446067 * client.menu.field6552 >= 400) {
               if (var12 <= 505990505) {
               }
            } else {
               String var13;
               if (0 == var7.skillLevel * -1506260323) {
                  if (var12 <= 505990505) {
                     throw new IllegalStateException();
                  }

                  var13 = var7.actions[0]
                     + var7.username
                     + var7.actions[1]
                     + class108.method3888(-545684123 * var7.combatLevel, class330.localPlayer.combatLevel * -545684123, (byte)-113)
                     + " "
                     + classDF.field1351
                     + Strings.field5026
                     + var7.combatLevel * -545684123
                     + classDF.field1349
                     + var7.actions[2];
               } else {
                  var13 = var7.actions[0]
                     + var7.username
                     + var7.actions[1]
                     + " "
                     + classDF.field1351
                     + Strings.field5027
                     + var7.skillLevel * -1506260323
                     + classDF.field1349
                     + var7.actions[2];
               }

               if (-415813337 * client.isItemSelected == 1) {
                  if (var12 <= 505990505) {
                     throw new IllegalStateException();
                  }

                  ClanChannel.insertMenuItem(
                     Strings.field5019,
                     client.field790 + " " + classDF.field1350 + " " + class144.colorStartTag(16777215, 95002882) + var13,
                     14,
                     var8,
                     var9,
                     var10,
                     -1,
                     false,
                     var11,
                     65535
                  );
               } else if (client.isSpellSelected) {
                  if (var12 <= 505990505) {
                     throw new IllegalStateException();
                  }

                  if ((485276933 * DesktopPlatformInfoProvider.selectedSpellFlags & 8) == 8) {
                     ClanChannel.insertMenuItem(
                        client.selectedSpellActionName,
                        client.selectedSpellName + " " + classDF.field1350 + " " + class144.colorStartTag(16777215, 156558656) + var13,
                        15,
                        var8,
                        var9,
                        var10,
                        -1,
                        false,
                        var11,
                        65535
                     );
                  }
               } else {
                  for (int var14 = 7; var14 >= 0; var14--) {
                     if (var12 <= 505990505) {
                        throw new IllegalStateException();
                     }

                     if (client.playerMenuActions[var14] != null) {
                        if (var12 <= 505990505) {
                           throw new IllegalStateException();
                        }

                        short var15;
                        var15 = 0;
                        label152:
                        if (client.playerMenuActions[var14].equalsIgnoreCase(Strings.field5021)) {
                           if (AttackOption.AttackOption_hidden == client.playerAttackOption) {
                              if (var12 <= 505990505) {
                                 throw new IllegalStateException();
                              }
                              continue;
                           }

                           label149: {
                              if (client.playerAttackOption != AttackOption.AttackOption_alwaysRightClick) {
                                 if (var12 <= 505990505) {
                                    throw new IllegalStateException();
                                 }

                                 if (AttackOption.AttackOption_dependsOnCombatLevels != client.playerAttackOption) {
                                    break label149;
                                 }

                                 if (var12 <= 505990505) {
                                    return;
                                 }

                                 if (var7.combatLevel * -545684123 <= -545684123 * class330.localPlayer.combatLevel) {
                                    break label149;
                                 }

                                 if (var12 <= 505990505) {
                                    return;
                                 }
                              }

                              var15 = 2000;
                           }

                           if (-2140200207 * class330.localPlayer.team != 0) {
                              if (var12 <= 505990505) {
                                 throw new IllegalStateException();
                              }

                              if (0 != -2140200207 * var7.team) {
                                 if (-2140200207 * class330.localPlayer.team == var7.team * -2140200207) {
                                    if (var12 <= 505990505) {
                                       throw new IllegalStateException();
                                    }

                                    var15 = 2000;
                                 } else {
                                    var15 = 0;
                                 }
                                 break label152;
                              }
                           }

                           if (AttackOption.field1304 == client.playerAttackOption) {
                              if (var12 <= 505990505) {
                                 throw new IllegalStateException();
                              }

                              if (Player.method1460(var7, (byte)0)) {
                                 if (var12 <= 505990505) {
                                    return;
                                 }

                                 var15 = 2000;
                              }
                           }
                        } else if (client.playerOptionsPriorities[var14]) {
                           if (var12 <= 505990505) {
                              throw new IllegalStateException();
                           }

                           var15 = 2000;
                        }

                        int var16 = 0;
                        var16 = var15 + client.playerMenuOpcodes[var14];
                        ClanChannel.insertMenuItem(
                           client.playerMenuActions[var14],
                           class144.colorStartTag(16777215, 220158543) + var13,
                           var16,
                           var8,
                           var9,
                           var10,
                           -1,
                           false,
                           var11,
                           65535
                        );
                     }
                  }
               }

               for (int var18 = 0; var18 < client.menu.field6552 * 1759446067 && var12 > 505990505; var18++) {
                  if (client.menu.menuOpcodes[var18] == 23) {
                     if (var12 > 505990505) {
                        client.menu.menuTargets[var18] = class144.colorStartTag(16777215, 60891273) + var13;
                     }
                     break;
                  }
               }
            }
         } catch (RuntimeException var17) {
            throw RestClientThreadFactory.newRunException(var17, "as.mc(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbd;Lxv;)Z")
   @ObfuscatedName("ur")
   public static boolean method245(FriendSystem var0, Username var1) {
      Friend var2 = (Friend)UserList.method10680(var0.friendsList, var1, (byte)26);
      return null != var2 && var2.hasWorld(937210184);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ag")
   public static void method241(byte var0) {
      try {
         VarcInt.VarcInt_cached.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "as.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/util/concurrent/ThreadPoolExecutor;")
   @ObfuscatedName("ae")
   final ThreadPoolExecutor method237(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(1336622047 * this.workQueueCapacity), this.threadFactory);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   public final void shutdown(int var1) {
      try {
         try {
            this.threadPoolExecutor.shutdown();
         } catch (Exception var3) {
            System.err.println("Error shutting down RestRequestService\r\n" + var3);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "as.ag(" + ')');
      }
   }
}
