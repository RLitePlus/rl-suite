import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dw")
public class HealthBarConfig extends Node {
   @ToRemove(unused = "true")
   @ObfuscatedName("bd")
   public static final int field1514 = 69;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field1512 = 4;
   @ObfuscatedSignature(descriptor = "Lhj;")
   @ObfuscatedName("ag")
   HealthBarDefinition definition;
   @ObfuscatedSignature(descriptor = "Lrm;")
   @ObfuscatedName("an")
   IterableNodeDeque updates = new IterableNodeDeque();
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field1511 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field1513 = 5;

   @ObfuscatedSignature(descriptor = "(II)Lcj;")
   @ObfuscatedName("at")
   HealthBarUpdate get(int var1, int var2) {
      try {
         HealthBarUpdate var3 = (HealthBarUpdate)this.updates.method9642();
         if (null != var3) {
            if (-313755967 * var3.cycle <= var1) {
               for (HealthBarUpdate var4 = (HealthBarUpdate)this.updates.method9646(); var4 != null; var4 = (HealthBarUpdate)this.updates.method9646()) {
                  if (var2 >= 879270082) {
                     throw new IllegalStateException();
                  }

                  if (var4.cycle * -313755967 > var1) {
                     break;
                  }

                  if (var2 >= 879270082) {
                     throw new IllegalStateException();
                  }

                  var3.remove();
                  var3 = var4;
               }

               if (var3.cycleOffset * 111989601 + var3.cycle * -313755967 + this.definition.int5 * 933043503 > var1) {
                  if (var2 >= 879270082) {
                     throw new IllegalStateException();
                  }

                  return var3;
               }

               var3.remove();
               return null;
            }

            if (var2 >= 879270082) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "dw.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lcj;")
   @ObfuscatedName("zq")
   public HealthBarUpdate method3567(int var1) {
      return this.get(var1, -1139893780);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;III)V")
   @ObfuscatedName("vo")
   public static void method3565(MidiPcmStream var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method7683(var1, var1, var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("av")
   void put(int var1, int var2, int var3, int var4, int var5) {
      try {
         HealthBarUpdate var6 = null;
         int var7 = 0;

         for (HealthBarUpdate var8 = (HealthBarUpdate)this.updates.method9642(); var8 != null; var8 = (HealthBarUpdate)this.updates.method9646()) {
            if (var5 <= -237478937) {
               throw new IllegalStateException();
            }

            var7++;
            if (-313755967 * var8.cycle == var1) {
               if (var5 <= -237478937) {
                  return;
               }

               var8.set(var1, var2, var3, var4, -1045995060);
               return;
            }

            if (-313755967 * var8.cycle <= var1) {
               if (var5 <= -237478937) {
                  return;
               }

               var6 = var8;
            }
         }

         if (null != var6) {
            IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var6);
            if (var7 >= 4) {
               this.updates.method9642().remove();
            }
         } else if (var5 <= -237478937) {
            throw new IllegalStateException();
         } else {
            if (var7 < 4) {
               if (var5 <= -237478937) {
                  throw new IllegalStateException();
               }

               this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "dw.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldw;I)Z")
   @ObfuscatedName("ho")
   public static boolean method3562(HealthBarConfig var0, int var1) {
      if (var0 == null) {
         return var0.isEmpty(var1);
      } else {
         try {
            return var0.updates.method9653();
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "dw.ag(" + ')');
         }
      }
   }

   HealthBarConfig(HealthBarDefinition var1) {
      this.definition = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Lcj;")
   @ObfuscatedName("aj")
   HealthBarUpdate method3559(int var1) {
      HealthBarUpdate var2 = (HealthBarUpdate)this.updates.method9642();
      if (null != var2 && -313755967 * var2.cycle <= var1) {
         for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.method9646();
            var3 != null && var3.cycle * -697097090 <= var1;
            var3 = (HealthBarUpdate)this.updates.method9646()
         ) {
            var2.remove();
            var2 = var3;
         }

         if (var2.cycleOffset * 111989601 + var2.cycle * -313755967 + this.definition.int5 * 1465927299 > var1) {
            return var2;
         } else {
            var2.remove();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ae")
   void method3556(int var1, int var2, int var3, int var4) {
      HealthBarUpdate var5 = null;
      int var6 = 0;

      for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.method9642(); var7 != null; var7 = (HealthBarUpdate)this.updates.method9646()) {
         var6++;
         if (-313755967 * var7.cycle == var1) {
            var7.set(var1, var2, var3, var4, -1045995060);
            return;
         }

         if (-313755967 * var7.cycle <= var1) {
            var5 = var7;
         }
      }

      if (null == var5) {
         if (var6 < 4) {
            this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
         }
      } else {
         IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
         if (var6 >= 4) {
            this.updates.method9642().remove();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldw;IIII)V")
   @ObfuscatedName("eh")
   public static void method3557(HealthBarConfig var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method3559(var1);
      }

      HealthBarUpdate var5 = null;
      int var6 = 0;

      for (HealthBarUpdate var7 = (HealthBarUpdate)var0.updates.method9642(); var7 != null; var7 = (HealthBarUpdate)var0.updates.method9646()) {
         var6++;
         if (-313755967 * var7.cycle == var1) {
            var7.set(var1, var2, var3, var4, -1045995060);
            return;
         }

         if (-313755967 * var7.cycle <= var1) {
            var5 = var7;
         }
      }

      if (null == var5) {
         if (var6 < 4) {
            var0.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
         }
      } else {
         IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
         if (var6 >= 4) {
            var0.updates.method9642().remove();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lcj;")
   @ObfuscatedName("ak")
   HealthBarUpdate method3560(int var1) {
      HealthBarUpdate var2 = (HealthBarUpdate)this.updates.method9642();
      if (null != var2 && -1536420466 * var2.cycle <= var1) {
         for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.method9646();
            var3 != null && var3.cycle * 932367096 <= var1;
            var3 = (HealthBarUpdate)this.updates.method9646()
         ) {
            var2.remove();
            var2 = var3;
         }

         if (var2.cycleOffset * 802857765 + var2.cycle * -1569083242 + this.definition.int5 * 1829290336 > var1) {
            return var2;
         } else {
            var2.remove();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lcj;")
   @ObfuscatedName("aw")
   HealthBarUpdate method3561(int var1) {
      HealthBarUpdate var2 = (HealthBarUpdate)this.updates.method9642();
      if (null != var2 && -313755967 * var2.cycle <= var1) {
         for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.method9646();
            var3 != null && var3.cycle * -313755967 <= var1;
            var3 = (HealthBarUpdate)this.updates.method9646()
         ) {
            var2.remove();
            var2 = var3;
         }

         if (var2.cycleOffset * 111989601 + var2.cycle * -313755967 + this.definition.int5 * 933043503 > var1) {
            return var2;
         } else {
            var2.remove();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   boolean method3563() {
      return this.updates.method9653();
   }

   @ObfuscatedSignature(descriptor = "()Lhj;")
   @ObfuscatedName("tr")
   public HealthBarDefinition method3568() {
      return this.definition;
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZB)I")
   @ObfuscatedName("ce")
   static int method3566(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (6809 == var0) {
            int var4 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            ObjectComposition var5 = AsyncHttpResponse.getObjectDefinition(var4, 2032647095);
            Object[] var10000 = Interpreter.Interpreter_objectStack;
            int var10001 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
            String var10002;
            if (null != var5) {
               if (var3 != -1) {
                  throw new IllegalStateException();
               }

               var10002 = var5.name;
            } else {
               var10002 = "";
            }

            var10000[var10001] = var10002;
            return 1;
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "dw.ce(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ag")
   boolean isEmpty(int var1) {
      try {
         return this.updates.method9664();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dw.ag(" + ')');
      }
   }
}
