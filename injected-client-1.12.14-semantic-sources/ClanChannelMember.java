import net.runelite.api.Nameable;
import net.runelite.api.clan.ClanRank;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fa")
public class ClanChannelMember implements net.runelite.api.clan.ClanChannelMember {
   @ToRemove(unused = "true")
   @ObfuscatedName("bz")
   static final int field1735 = 20;
   @ObfuscatedName("at")
   public int world;
   @ObfuscatedSignature(descriptor = "Lxv;")
   @ObfuscatedName("ag")
   public Username username;
   @ObfuscatedName("av")
   public byte rank;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("aj")
   public static AbstractArchive KitDefinition_modelsArchive;

   public String getPrevName() {
      return null;
   }

   public ClanRank getRank() {
      return client.method2464(this.method3950());
   }

   public String getName() {
      Username var1 = this.method3949();
      if (var1 == null) {
         return null;
      } else {
         String var2 = var1.method12725();
         return var2 == null ? null : var2.replace(' ', ' ');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsz;)Z")
   @ObfuscatedName("ww")
   public static boolean method3944(SongTask var0) {
      return var0.field5882;
   }

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/Nameable;)I")
   @ObfuscatedName("qn")
   public int method3948(Nameable var1) {
      return this.getName().compareTo(var1.getName());
   }

   public int getWorld() {
      return this.world * -1379379925;
   }

   @ObfuscatedSignature(descriptor = "([BIII)Z")
   @ObfuscatedName("ap")
   static final boolean method3947(byte[] var0, int var1, int var2, int var3) {
      try {
         boolean var4 = true;
         Buffer var5 = new Buffer(var0);
         int var6 = -1;

         label118:
         while (true) {
            int var7 = Buffer.method12056(var5, -496650014);
            if (var7 == 0) {
               if (var3 == -1002980573) {
                  throw new IllegalStateException();
               }

               return var4;
            }

            var6 += var7;
            int var8 = 0;
            boolean var9 = false;

            while (true) {
               while (!var9) {
                  int var10 = Buffer.method12050(var5, 44140611);
                  if (0 == var10) {
                     if (var3 == -1002980573) {
                        throw new IllegalStateException();
                     }
                     continue label118;
                  }

                  var8 += var10 - 1;
                  int var11 = var8 & 63;
                  int var12 = var8 >> 6 & 63;
                  int var13 = var5.readUnsignedByte(1211380133) >> 2;
                  int var14 = var1 + var12;
                  int var15 = var2 + var11;
                  if (var14 > 0) {
                     if (var3 == -1002980573) {
                        throw new IllegalStateException();
                     }

                     if (var15 > 0) {
                        if (var3 == -1002980573) {
                           throw new IllegalStateException();
                        }

                        if (var14 < 103) {
                           if (var3 == -1002980573) {
                              throw new IllegalStateException();
                           }

                           if (var15 < 103) {
                              if (var3 == -1002980573) {
                                 throw new IllegalStateException();
                              }

                              ObjectComposition var16 = AsyncHttpResponse.getObjectDefinition(var6, 2094555887);
                              if (var13 == 22 && client.isLowDetail) {
                                 if (var3 == -1002980573) {
                                    throw new IllegalStateException();
                                 }

                                 if (-1900812067 * var16.int1 == 0 && 1 != var16.interactType * 756705879 && !var16.boolean2) {
                                    if (var3 == -1002980573) {
                                       throw new IllegalStateException();
                                    }
                                    continue;
                                 }
                              }

                              if (!var16.method5158(1882603197)) {
                                 if (var3 == -1002980573) {
                                    throw new IllegalStateException();
                                 }

                                 client.field799 += -1601593403;
                                 var4 = false;
                              }

                              var9 = true;
                           }
                        }
                     }
                  }
               }

               if (var3 == -1002980573) {
                  throw new IllegalStateException();
               }

               int var18 = Buffer.method12050(var5, -1165629396);
               if (0 == var18) {
                  if (var3 == -1002980573) {
                     throw new IllegalStateException();
                  }
                  break;
               }

               var5.readUnsignedByte(1752190016);
            }
         }
      } catch (RuntimeException var17) {
         throw RestClientThreadFactory.newRunException(var17, "fa.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lxv;")
   @ObfuscatedName("th")
   public Username method3949() {
      return this.username;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqv;Lqk;Lqk;)I")
   @ObfuscatedName("eh")
   public static int method3945(GrandExchangeOfferTotalQuantityComparator var0, GrandExchangeEvent var1, GrandExchangeEvent var2) {
      if (var0 == null) {
         return var0.method9184(var1, var1);
      } else {
         return var1.grandExchangeOffer.totalQuantity * 966823731 < 966823731 * var2.grandExchangeOffer.totalQuantity
            ? -1
            : (966823731 * var1.grandExchangeOffer.totalQuantity == var2.grandExchangeOffer.totalQuantity * 966823731 ? 0 : 1);
      }
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("ja")
   public byte method3950() {
      return this.rank;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("ad")
   public static String method3946(String var0, int var1) {
      try {
         int var2 = var0.length();
         char[] var3 = new char[var2];
         byte var4 = 2;

         for (int var5 = 0; var5 < var2; var5++) {
            if (var1 >= 2048873804) {
               throw new IllegalStateException();
            }

            char var6 = var0.charAt(var5);
            if (var4 == 0) {
               var6 = Character.toLowerCase(var6);
            } else {
               label72: {
                  if (var4 != 2) {
                     if (!Character.isUpperCase(var6)) {
                        break label72;
                     }

                     if (var1 >= 2048873804) {
                        throw new IllegalStateException();
                     }
                  }

                  var6 = class144.method3967(var6, 1609045112);
               }
            }

            if (Character.isLetter(var6)) {
               if (var1 >= 2048873804) {
                  throw new IllegalStateException();
               }

               var4 = 0;
            } else {
               label65: {
                  if (var6 != '.') {
                     if (var1 >= 2048873804) {
                        throw new IllegalStateException();
                     }

                     if ('?' != var6) {
                        if (var1 >= 2048873804) {
                           throw new IllegalStateException();
                        }

                        if (var6 != '!') {
                           if (Character.isSpaceChar(var6)) {
                              if (2 != var4) {
                                 var4 = 1;
                              }
                           } else {
                              var4 = 1;
                           }
                           break label65;
                        }

                        if (var1 >= 2048873804) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  var4 = 2;
               }
            }

            var3[var5] = var6;
         }

         return new String(var3);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "fa.ad(" + ')');
      }
   }

   ClanChannelMember() {
   }
}
