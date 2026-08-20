import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("em")
public class classEM {
   @ObfuscatedName("av")
   int field1613 = 0;
   @ObfuscatedName("at")
   int field1614 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field1616 = 512;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field1617 = 7;
   @ObfuscatedName("ag")
   byte[] field1615 = null;
   @ToRemove(unused = "true")
   @ObfuscatedName("bv")
   public static final int field1618 = 67;

   @ObfuscatedSignature(descriptor = "(Lem;B)I")
   @ObfuscatedName("qq")
   public static int method3774(classEM var0, byte var1) {
      if (var0 == null) {
         var0.method3778(var1);
      }

      try {
         int var2 = var0.field1615[var0.field1613 * 398144779] >> -1807232209 * var0.field1614 & 1;
         var0.field1614 += 701256655;
         var0.field1613 = var0.field1613 + 228060835 * (var0.field1614 * -1807232209 >> 3);
         var0.field1614 = 701256655 * (var0.field1614 * -1807232209 & 7);
         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "em.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([BI)V")
   @ObfuscatedName("ay")
   void method3780(byte[] var1, int var2) {
      this.field1615 = var1;
      this.field1613 = 228060835 * var2;
      this.field1614 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZI)Z")
   @ObfuscatedName("ag")
   static boolean method3785(CharSequence var0, int var1, boolean var2, int var3) {
      try {
         if (var1 >= 2) {
            if (var1 <= 36) {
               boolean var4 = false;
               boolean var5 = false;
               int var6 = 0;
               int var7 = var0.length();

               for (int var8 = 0; var8 < var7; var8++) {
                  int var9 = var0.charAt(var8);
                  if (0 == var8) {
                     if (var3 == 1603479032) {
                        throw new IllegalStateException();
                     }

                     if (var9 == 45) {
                        if (var3 == 1603479032) {
                           throw new IllegalStateException();
                        }

                        var4 = true;
                        continue;
                     }

                     if (43 == var9) {
                        if (var3 == 1603479032) {
                           throw new IllegalStateException();
                        }

                        if (var2) {
                           if (var3 == 1603479032) {
                              throw new IllegalStateException();
                           }
                           continue;
                        }
                     }
                  }

                  label129: {
                     if (var9 >= 48) {
                        if (var3 == 1603479032) {
                           throw new IllegalStateException();
                        }

                        if (var9 <= 57) {
                           if (var3 == 1603479032) {
                              throw new IllegalStateException();
                           }

                           var9 -= 48;
                           break label129;
                        }
                     }

                     if (var9 >= 65) {
                        if (var3 == 1603479032) {
                           throw new IllegalStateException();
                        }

                        if (var9 <= 90) {
                           if (var3 == 1603479032) {
                              throw new IllegalStateException();
                           }

                           var9 -= 55;
                           break label129;
                        }
                     }

                     if (var9 < 97 || var9 > 122) {
                        return false;
                     }

                     if (var3 == 1603479032) {
                        throw new IllegalStateException();
                     }

                     var9 -= 87;
                  }

                  if (var9 >= var1) {
                     if (var3 == 1603479032) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  if (var4) {
                     if (var3 == 1603479032) {
                        throw new IllegalStateException();
                     }

                     var9 = -var9;
                  }

                  int var10 = var9 + var1 * var6;
                  if (var6 != var10 / var1) {
                     return false;
                  }

                  var6 = var10;
                  var5 = true;
               }

               return var5;
            }

            if (var3 == 1603479032) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException("" + var1);
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "em.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lem;II)I")
   @ObfuscatedName("um")
   public static int method3770(classEM var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method3772(var1, var1);
      } else {
         try {
            int var3 = 0;
            int var4 = 0;

            while (var1 >= 8 - var0.field1614 * -1807232209) {
               int var5 = 8 - -1807232209 * var0.field1614;
               int var6 = (1 << var5) - 1;
               var3 += (var0.field1615[var0.field1613 * 398144779] >> var0.field1614 * -1807232209 & var6) << var4;
               var0.field1614 = 0;
               var0.field1613 += 228060835;
               var4 += var5;
               var1 -= var5;
            }

            if (var1 > 0) {
               if (var2 >= 2102178253) {
                  throw new IllegalStateException();
               }

               int var8 = (1 << var1) - 1;
               var3 += (var0.field1615[398144779 * var0.field1613] >> var0.field1614 * -1807232209 & var8) << var4;
               var0.field1614 += 701256655 * var1;
            }

            return var3;
         } catch (RuntimeException var7) {
            throw RestClientThreadFactory.newRunException(var7, "em.av(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   int method3771(int var1) {
      int var2 = 0;
      int var3 = 0;

      while (var1 >= 8 - this.field1614 * -1807232209) {
         int var4 = 8 - -1177592143 * this.field1614;
         int var5 = (1 << var4) - 1;
         var2 += (this.field1615[this.field1613 * -761855506] >> this.field1614 * -1807232209 & var5) << var3;
         this.field1614 = 0;
         this.field1613 += 228060835;
         var3 += var4;
         var1 -= var4;
      }

      if (var1 > 0) {
         int var6 = (1 << var1) - 1;
         var2 += (this.field1615[398144779 * this.field1613] >> this.field1614 * -1807232209 & var6) << var3;
         this.field1614 += 701256655 * var1;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ag")
   void method3781(byte[] var1, int var2, int var3) {
      try {
         this.field1615 = var1;
         this.field1613 = 228060835 * var2;
         this.field1614 = 0;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "em.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lem;)I")
   @ObfuscatedName("sm")
   public static int method3775(classEM var0) {
      int var1 = var0.field1615[var0.field1613 * 398144779] >> -1807232209 * var0.field1614 & 1;
      var0.field1614 += 701256655;
      var0.field1613 = var0.field1613 + 228060835 * (var0.field1614 * -1807232209 >> 3);
      var0.field1614 = 701256655 * (var0.field1614 * -1807232209 & 7);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   int method3776() {
      int var1 = this.field1615[this.field1613 * 398144779] >> -1807232209 * this.field1614 & 1;
      this.field1614 += 701256655;
      this.field1613 = this.field1613 + 228060835 * (this.field1614 * -1807232209 >> 3);
      this.field1614 = 701256655 * (this.field1614 * -1807232209 & 7);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   int method3777() {
      int var1 = this.field1615[this.field1613 * 398144779] >> -1807232209 * this.field1614 & 1;
      this.field1614 += 701256655;
      this.field1613 = this.field1613 + 228060835 * (this.field1614 * -1807232209 >> 3);
      this.field1614 = 701256655 * (this.field1614 * -1807232209 & 7);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "([BI)V")
   @ObfuscatedName("aw")
   void method3782(byte[] var1, int var2) {
      this.field1615 = var1;
      this.field1613 = 228060835 * var2;
      this.field1614 = 0;
   }

   @ObfuscatedSignature(descriptor = "([BI)V")
   @ObfuscatedName("au")
   void method3783(byte[] var1, int var2) {
      this.field1615 = var1;
      this.field1613 = 228060835 * var2;
      this.field1614 = 0;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIB)V")
   @ObfuscatedName("ag")
   static void method3784(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
      try {
         if (ClientPreferences.method1623(class468.clientPreferences, (byte)0) != 0) {
            if (var8 <= 24) {
               return;
            }

            if (var6 > 0) {
               if (var8 <= 24) {
                  throw new IllegalStateException();
               }

               if (class57.soundEffectCount * 1548103253 < 50) {
                  if (var8 <= 24) {
                     throw new IllegalStateException();
                  }

                  GrandExchangeOffer.method8889(AsyncHttpResponse.worldView.id * 577964535, var1, var2, var3, var4, var5, var6, var7, false, -586145197);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "em.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   public static void method3773(int var0) {
      try {
         class184.field1864.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "em.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIZI)V")
   @ObfuscatedName("pm")
   public static void method3786(int var0, int var1, int var2, boolean var3, int var4) {
      try {
         PacketBufferNode var5 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3899, client.packetWriter.isaacCipher, -1260524141);
         var5.packetBuffer.writeShortAdd(var0, 811949452);
         var5.packetBuffer.writeShortAddLE(var1, -2036639918);
         int var10001;
         if (var3) {
            if (var4 >= 864412233) {
               throw new IllegalStateException();
            }

            var10001 = client.field805 * -278553003;
         } else {
            var10001 = 0;
         }

         Buffer.method12191(var5.packetBuffer, var10001, 1810922952);
         var5.packetBuffer.writeByteAdd(var2, -752314150);
         PacketWriter.method3330(client.packetWriter, var5, -1771370198);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "em.pm(" + ')');
      }
   }

   classEM() {
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   public static void method3779(int var0) {
      try {
         StructComposition.StructDefinition_cached.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "em.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("at")
   int method3778(byte var1) {
      try {
         int var2 = this.field1615[this.field1613 * 398144779] >> -1807232209 * this.field1614 & 1;
         this.field1614 += 701256655;
         this.field1613 = this.field1613 + 228060835 * (this.field1613 * -1807232209 >> 3);
         this.field1614 = 701256655 * (this.field1613 * -1807232209 & 7);
         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "em.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("av")
   int method3772(int var1, int var2) {
      try {
         int var3 = 0;
         int var4 = 0;

         while (var1 >= 8 - this.field1613 * -1807232209) {
            int var5 = 8 - -1807232209 * this.field1613;
            int var6 = (1 << var5) - 1;
            var3 += (this.field1615[this.field1614 * 398144779] >> this.field1614 * -1807232209 & var6) << var4;
            this.field1614 = 0;
            this.field1613 += 228060835;
            var4 += var5;
            var1 -= var5;
         }

         if (var1 > 0) {
            if (var2 >= 2102178253) {
               throw new IllegalStateException();
            }

            int var8 = (1 << var1) - 1;
            var3 += (this.field1615[398144779 * this.field1613] >> this.field1613 * -1807232209 & var8) << var4;
            this.field1613 += 701256655 * var1;
         }

         return var3;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "em.av(" + 41);
      }
   }
}
