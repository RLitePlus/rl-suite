import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uj")
public abstract class class520 {
   @ObfuscatedSignature(descriptor = "Lpm;")
   @ObfuscatedName("ia")
   static StudioGame field6071;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field6070 = 13;

   @ObfuscatedSignature(descriptor = "(Lkb;Lto;I)V")
   @ObfuscatedName("ae")
   abstract void vmethod394(WorldEntityCoord var1, WorldEntityCoordSnapshot var2, int var3);

   class520() {
   }

   @ObfuscatedSignature(descriptor = "(Lkb;IIB)Z")
   @ObfuscatedName("at")
   abstract boolean vmethod400(WorldEntityCoord var1, int var2, int var3, byte var4);

   @ObfuscatedSignature(descriptor = "(Lkb;Lto;I)V")
   @ObfuscatedName("gq")
   public void method11175(WorldEntityCoord var1, WorldEntityCoordSnapshot var2, int var3) {
      this.vmethod393(var1, var2, var3, -1824890420);
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("ag")
   abstract void vmethod401(int var1, int var2, byte var3);

   @ObfuscatedSignature(descriptor = "(Lkb;Lto;I)V")
   @ObfuscatedName("an")
   abstract void vmethod392(WorldEntityCoord var1, WorldEntityCoordSnapshot var2, int var3);

   @ObfuscatedSignature(descriptor = "(Lkb;Lto;I)V")
   @ObfuscatedName("aj")
   abstract void vmethod395(WorldEntityCoord var1, WorldEntityCoordSnapshot var2, int var3);

   @ObfuscatedSignature(descriptor = "(Lut;Lut;I)V")
   @ObfuscatedName("ad")
   public static void method11173(DynamicArray var0, DynamicArray var1, int var2) {
      try {
         if (var0 != null) {
            if (var2 != 529503132) {
               return;
            }

            if (var0.method11215((byte)20) > 1) {
               class461.method9338(var0, null, true, -928498657);
               if (null != var1) {
                  if (var2 != 529503132) {
                     throw new IllegalStateException();
                  }

                  class461.method9338(var1, null, true, -928498657);
               }

               int var3 = var0.method11215((byte)122);
               if (null != var1) {
                  if (var2 != 529503132) {
                     throw new IllegalStateException();
                  }

                  if (var1.method11215((byte)117) < var3) {
                     if (var2 != 529503132) {
                        throw new IllegalStateException();
                     }

                     throw new RuntimeException();
                  }
               }

               if (class586.field6376 == var0.field6107) {
                  if (var1 == null) {
                     if (var2 != 529503132) {
                        throw new IllegalStateException();
                     }

                     class134.method4022(var0.method11207(2053374425), class528.field6008, 0, var3 - 1, -817675254);
                  } else if (var1.field6107 == class586.field6376) {
                     if (var2 != 529503132) {
                        throw new IllegalStateException();
                     }

                     class134.method4022(var0.method11207(2053374425), var1.method11207(2053374425), 0, var3 - 1, -817675254);
                  } else if (class586.field6377 == var1.field6107) {
                     if (var2 != 529503132) {
                        throw new IllegalStateException();
                     }

                     classFO.method4033(var0.method11207(2053374425), DynamicArray.method11211(var1, (byte)-20), 0, var3 - 1, (byte)62);
                  } else {
                     class69.method1400(var0.method11207(2053374425), var1.method11214((byte)-77), 0, var3 - 1, 1772939328);
                  }
               } else if (var0.field6107 == class586.field6377) {
                  if (var2 != 529503132) {
                     return;
                  }

                  if (var1 == null) {
                     if (var2 != 529503132) {
                        throw new IllegalStateException();
                     }

                     Arrays.sort(DynamicArray.method11211(var0, (byte)10), 0, var3);
                  } else if (class586.field6376 == var1.field6107) {
                     if (var2 != 529503132) {
                        throw new IllegalStateException();
                     }

                     class341.method7852(DynamicArray.method11211(var0, (byte)-19), var1.method11207(2053374425), 0, var3 - 1, 812950560);
                  } else if (class586.field6377 == var1.field6107) {
                     if (var2 != 529503132) {
                        throw new IllegalStateException();
                     }

                     ChatChannel.method2611(DynamicArray.method11211(var0, (byte)-96), DynamicArray.method11211(var1, (byte)46), 0, var3 - 1, (byte)-30);
                  } else {
                     HorizontalAlignment.method4600(DynamicArray.method11211(var0, (byte)60), var1.method11214((byte)-32), 0, var3 - 1, 1894347670);
                  }
               } else {
                  if (class586.field6379 != var0.field6107) {
                     throw new RuntimeException();
                  }

                  if (var1 == null) {
                     if (var2 != 529503132) {
                        throw new IllegalStateException();
                     }

                     Arrays.sort(var0.method11214((byte)-48), 0, var3);
                  } else if (var1.field6107 == class586.field6376) {
                     if (var2 != 529503132) {
                        throw new IllegalStateException();
                     }

                     WorldMapID.quicksortStringsWithCorrespondingIntegers(
                        (String[])var0.method11214((byte)54), var1.method11207(2053374425), 0, var3 - 1, 1060942896
                     );
                  } else if (class586.field6377 == var1.field6107) {
                     if (var2 != 529503132) {
                        throw new IllegalStateException();
                     }

                     class161.method4254((String[])var0.method11214((byte)-42), DynamicArray.method11211(var1, (byte)88), 0, var3 - 1, (byte)126);
                  } else {
                     Renderable.method6217((String[])var0.method11214((byte)6), var1.method11214((byte)-127), 0, var3 - 1, (byte)60);
                  }
               }

               return;
            }

            if (var2 != 529503132) {
               throw new IllegalStateException();
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "uj.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkb;II)Z")
   @ObfuscatedName("ak")
   abstract boolean vmethod397(WorldEntityCoord var1, int var2, int var3);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrx;)V")
   @ObfuscatedName("xt")
   public static void method11172(ProjectionCoord var0) {
      if (var0 == null) {
         var0.method9877();
      } else {
         var0.y = 0.0F;
         var0.z = 0.0F;
         var0.x = 0.0F;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkb;II)Z")
   @ObfuscatedName("aw")
   abstract boolean vmethod399(WorldEntityCoord var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "(Lkb;II)Z")
   @ObfuscatedName("zq")
   public boolean method11176(WorldEntityCoord var1, int var2, int var3) {
      return this.vmethod400(var1, var2, var3, (byte)99);
   }

   @ObfuscatedSignature(descriptor = "(Lkb;II)Z")
   @ObfuscatedName("ap")
   abstract boolean vmethod398(WorldEntityCoord var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "(Lkb;II)Z")
   @ObfuscatedName("ay")
   abstract boolean vmethod396(WorldEntityCoord var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("au")
   abstract void vmethod403(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("az")
   abstract void vmethod404(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(Lkb;Lto;II)V")
   @ObfuscatedName("av")
   abstract void vmethod393(WorldEntityCoord var1, WorldEntityCoordSnapshot var2, int var3, int var4);

   @ObfuscatedSignature(descriptor = "(Lkb;FI)Z")
   @ObfuscatedName("hi")
   public boolean vmethod405(WorldEntityCoord var1, float var2, int var3) {
      return this.method11176(var1, (int)var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ad")
   abstract void vmethod402(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("nh")
   static final void runIntfCloseListeners(int var0, int var1, int var2) {
      try {
         if (!WidgetDefinition.method7961(class226.widgetDefinition, var0, -2088011560)) {
            if (var2 >= -176688615) {
               throw new IllegalStateException();
            }
         } else {
            VertexNormal.runComponentCloseListeners(class226.widgetDefinition.Widget_interfaceComponents[var0], var1, -697477978);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "uj.nh(" + ')');
      }
   }
}
