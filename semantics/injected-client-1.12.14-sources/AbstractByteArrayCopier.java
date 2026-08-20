import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("np")
public abstract class AbstractByteArrayCopier {
   @ObfuscatedName("iv")
   static int foundItemIndex;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field4324 = -2;

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ap")
   abstract void vmethod310(byte[] var1);

   AbstractByteArrayCopier() {
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZB)I")
   @ObfuscatedName("bi")
   static int method7836(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (3903 == var0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var34 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = GrandExchangeOffer.method8904(
                  client.grandExchangeOffers[var34], 417836213
               );
               return 1;
            }
         } else if (3904 == var0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var33 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.grandExchangeOffers[var33].id
                  * -840737413;
               return 1;
            }
         } else if (var0 == 3905) {
            int var32 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.grandExchangeOffers[var32].unitPrice
               * 270012189;
            return 1;
         } else if (3906 == var0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var31 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.grandExchangeOffers[var31].totalQuantity
                  * 966823731;
               return 1;
            }
         } else if (var0 == 3907) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var30 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -634712805
                  * client.grandExchangeOffers[var30].currentQuantity;
               return 1;
            }
         } else if (3908 == var0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var29 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.grandExchangeOffers[var29].currentPrice
                  * 993851531;
               return 1;
            }
         } else if (var0 == 3910) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var28 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               int var45 = GrandExchangeOffer.method8896(client.grandExchangeOffers[var28], -887756991);
               int[] var54 = Interpreter.Interpreter_intStack;
               int var58 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var62;
               if (0 == var45) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var62 = 1;
               } else {
                  var62 = 0;
               }

               var54[var58] = var62;
               return 1;
            }
         } else if (3911 == var0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var27 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               int var44 = GrandExchangeOffer.method8896(client.grandExchangeOffers[var27], -887756991);
               int[] var53 = Interpreter.Interpreter_intStack;
               int var57 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var61;
               if (var44 == 2) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var61 = 1;
               } else {
                  var61 = 0;
               }

               var53[var57] = var61;
               return 1;
            }
         } else if (var0 == 3912) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var26 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               int var43 = GrandExchangeOffer.method8896(client.grandExchangeOffers[var26], -887756991);
               int[] var52 = Interpreter.Interpreter_intStack;
               int var56 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var60;
               if (5 == var43) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var60 = 1;
               } else {
                  var60 = 0;
               }

               var52[var56] = var60;
               return 1;
            }
         } else if (var0 == 3913) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var25 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               int var42 = GrandExchangeOffer.method8896(client.grandExchangeOffers[var25], -887756991);
               int[] var51 = Interpreter.Interpreter_intStack;
               int var55 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var59;
               if (1 == var42) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var59 = 1;
               } else {
                  var59 = 0;
               }

               var51[var55] = var59;
               return 1;
            }
         } else if (var0 == 3914) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               boolean var50;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var50 = true;
               } else {
                  var50 = false;
               }

               boolean var24 = var50;
               if (null != class234.grandExchangeEvents) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var24, (byte)-1);
               }

               return 1;
            }
         } else if (3915 == var0) {
            boolean var23 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
            if (null != class234.grandExchangeEvents) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var23, (byte)-1);
            }

            return 1;
         } else if (var0 == 3916) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               boolean var48;
               if (Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize] == 1) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var48 = true;
               } else {
                  var48 = false;
               }

               boolean var22 = var48;
               if (Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1] == 1) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var48 = true;
               } else {
                  var48 = false;
               }

               boolean var41 = var48;
               if (class234.grandExchangeEvents != null) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  client.GrandExchangeEvents_worldComparator.filterWorlds = var41;
                  class234.grandExchangeEvents.sort(client.GrandExchangeEvents_worldComparator, var22, (byte)-1);
               }

               return 1;
            }
         } else if (3917 == var0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               boolean var47;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var47 = true;
               } else {
                  var47 = false;
               }

               boolean var21 = var47;
               if (null != class234.grandExchangeEvents) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var21, (byte)-1);
               }

               return 1;
            }
         } else if (3918 == var0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               boolean var46;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var46 = true;
               } else {
                  var46 = false;
               }

               boolean var20 = var46;
               if (null != class234.grandExchangeEvents) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var20, (byte)-1);
               }

               return 1;
            }
         } else if (3919 == var0) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null == class234.grandExchangeEvents
               ? 0
               : class234.grandExchangeEvents.events.size();
            return 1;
         } else if (var0 == 3920) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var19 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               GrandExchangeEvent var40 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var19);
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var40.world * -1787296361;
               return 1;
            }
         } else if (var0 == 3921) {
            int var18 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            GrandExchangeEvent var39 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var18);
            Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var39.getOfferName((byte)1);
            return 1;
         } else if (3922 == var0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var17 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               GrandExchangeEvent var38 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var17);
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var38.getPreviousOfferName(
                  (byte)65
               );
               return 1;
            }
         } else if (var0 == 3923) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var16 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               GrandExchangeEvent var37 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var16);
               long var6 = ParamComposition.method4949((byte)15) - 6337075287727686201L * classFH.field1789 - var37.age * 8132046234609306567L;
               int var8 = (int)(var6 / 3600000L);
               int var9 = (int)((var6 - var8 * 3600000) / 60000L);
               int var10 = (int)((var6 - 3600000 * var8 - 60000 * var9) / 1000L);
               String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var11;
               return 1;
            }
         } else if (3924 == var0) {
            int var15 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            GrandExchangeEvent var36 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var15);
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var36.grandExchangeOffer.totalQuantity
               * 966823731;
            return 1;
         } else if (var0 == 3925) {
            int var14 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            GrandExchangeEvent var35 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var14);
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var35.grandExchangeOffer.unitPrice
               * 270012189;
            return 1;
         } else if (3926 == var0) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var13 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               GrandExchangeEvent var5 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var13);
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -840737413 * var5.grandExchangeOffer.id;
               return 1;
            }
         } else if (var0 == 3939) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var4 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               int[] var10000 = Interpreter.Interpreter_intStack;
               int var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var10002;
               if (class150.ItemDefinition_get(var4, -2032188391).isMembersOnly) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "np.bi(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BZ)Ljava/lang/Object;")
   @ObfuscatedName("ae")
   public static Object method7831(byte[] var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0.length > 719559286) {
         DirectByteArrayCopier var2 = new DirectByteArrayCopier();
         var2.set(var0, (byte)2);
         return var2;
      } else if (var1) {
         int var3 = var0.length;
         byte[] var4 = new byte[var3];
         System.arraycopy(var0, 0, var4, 0, var3);
         return var4;
      } else {
         return var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lad;)Ljava/io/OutputStream;")
   @ObfuscatedName("bv")
   public static OutputStream method7835(SecureRandomSSLSocket var0) throws IOException {
      return var0.val$tlsClientProtocol.getOutputStream();
   }

   @ObfuscatedSignature(descriptor = "([BB)V")
   @ObfuscatedName("an")
   abstract void set(byte[] var1, byte var2);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Z)[B")
   @ObfuscatedName("ak")
   public static byte[] method7832(Object var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var6 = (byte[])var0;
         if (var1) {
            int var4 = var6.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(var6, 0, var5, 0, var4);
            return var5;
         } else {
            return var6;
         }
      } else if (var0 instanceof AbstractByteArrayCopier) {
         AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
         return var2.get(-1665344147);
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("aw")
   abstract byte[] vmethod312();

   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("ag")
   abstract byte[] get(int var1);

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ay")
   abstract void vmethod314(byte[] var1);

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("au")
   abstract void vmethod315(byte[] var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Z)[B")
   @ObfuscatedName("aj")
   public static byte[] method7833(Object var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var6 = (byte[])var0;
         if (var1) {
            int var4 = var6.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(var6, 0, var5, 0, var4);
            return var5;
         } else {
            return var6;
         }
      } else if (var0 instanceof AbstractByteArrayCopier) {
         AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
         return var2.get(-1791850131);
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lra;I)Lra;")
   @ObfuscatedName("ag")
   static final class461 method7834(class461 var0, int var1) {
      try {
         class461 var2;
         synchronized (class461.field5498) {
            if (class461.field5496 * -603351739 == 0) {
               if (var1 <= 526050412) {
                  throw new IllegalStateException();
               }

               var2 = new class461(var0);
            } else {
               class461.field5498[(class461.field5496 -= -1125927539) * -603351739].method9296(var0, 743318851);
               var2 = class461.field5498[-603351739 * class461.field5496];
            }
         }

         class461.method9315(var2, (byte)-92);
         return var2;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "np.ag(" + ')');
      }
   }
}
