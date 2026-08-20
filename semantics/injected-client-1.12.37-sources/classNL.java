import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nl")
public class classNL implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field4682 = 9;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field4683 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final int field4681 = 2;
   @ObfuscatedName("jr")
   static int field4684;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ax")
   public int method7885(Object var1, Object var2) {
      return method7883(this, (classNS)var1, (classNS)var2, -951245792);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxs;)V")
   @ObfuscatedName("jw")
   public static void method7879(PacketBuffer var0) {
      var0.offset = (7 + var0.field6927 * -723669565) / 8 * -1095856699;
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return method7883(this, (classNS)var1, (classNS)var2, -1297027899);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "nl.compare(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnl;Ljava/lang/Object;)Z")
   @ObfuscatedName("qo")
   public static boolean method7886(classNL var0, Object var1) {
      return var0 == null ? var0.method7887(var1) : var0.equals(var1);
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "nl.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lns;Lns;)I")
   @ObfuscatedName("af")
   int method7881(classNS var1, classNS var2) {
      return var1.field4717 * -1799225543 - var2.field4717 * -1799225543;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jr")
   public boolean method7887(Object var1) {
      return super.equals(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnl;Lns;Lns;)I")
   @ObfuscatedName("lb")
   public static int method7882(classNL var0, classNS var1, classNS var2) {
      return var0 == null ? var0.method7881(var1, var1) : var1.field4717 * -1799225543 - var2.field4717 * -1799225543;
   }

   @ObfuscatedSignature(descriptor = "(Lnl;Lns;Lns;I)I")
   @ObfuscatedName("ug")
   public static int method7883(classNL var0, classNS var1, classNS var2, int var3) {
      if (var0 == null) {
         var0.method7884(var1, var1, var3);
      }

      try {
         return var1.field4717 * -1799225543 - var2.field4717 * -1799225543;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "nl.az(" + 41);
      }
   }

   classNL() {
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIIII)Z")
   @ObfuscatedName("ax")
   static boolean method7880(
      int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      try {
         var8++;
         var9++;
         var10--;
         var11--;
         if (var0 >= var8) {
            if (var12 == -483624883) {
               throw new IllegalStateException();
            }

            if (var0 <= var10) {
               if (var12 == -483624883) {
                  throw new IllegalStateException();
               }

               if (var1 >= var9) {
                  if (var12 == -483624883) {
                     throw new IllegalStateException();
                  }

                  if (var1 <= var11) {
                     if (var12 == -483624883) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         if (var2 >= var8) {
            if (var12 == -483624883) {
               throw new IllegalStateException();
            }

            if (var2 <= var10 && var3 >= var9) {
               if (var12 == -483624883) {
                  throw new IllegalStateException();
               }

               if (var3 <= var11) {
                  if (var12 == -483624883) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         if (var4 >= var8) {
            if (var12 == -483624883) {
               throw new IllegalStateException();
            }

            if (var4 <= var10) {
               if (var12 == -483624883) {
                  throw new IllegalStateException();
               }

               if (var5 >= var9) {
                  if (var12 == -483624883) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= var11) {
                     if (var12 == -483624883) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         if (var6 >= var8 && var6 <= var10) {
            if (var12 == -483624883) {
               throw new IllegalStateException();
            }

            if (var7 >= var9) {
               if (var12 == -483624883) {
                  throw new IllegalStateException();
               }

               if (var7 <= var11) {
                  return true;
               }
            }
         }

         if (!classPF.method8853(var8, var9, var0, var1, var2, var3, var4, var5, (byte)-1)) {
            if (var12 == -483624883) {
               throw new IllegalStateException();
            }

            if (!classPF.method8853(var8, var11, var0, var1, var2, var3, var4, var5, (byte)-1)) {
               if (var12 == -483624883) {
                  throw new IllegalStateException();
               }

               if (!classPF.method8853(var10, var9, var0, var1, var2, var3, var4, var5, (byte)-1)) {
                  if (var12 == -483624883) {
                     throw new IllegalStateException();
                  }

                  if (!classPF.method8853(var10, var11, var0, var1, var2, var3, var4, var5, (byte)-1)) {
                     if (!classHL.method6070(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9, -1453501658)) {
                        if (var12 == -483624883) {
                           throw new IllegalStateException();
                        }

                        if (!classHL.method6070(var0, var1, var2, var3, var4, var5, var6, var7, var10, var9, var10, var11, -1453501658)) {
                           if (var12 == -483624883) {
                              throw new IllegalStateException();
                           }

                           if (!classHL.method6070(var0, var1, var2, var3, var4, var5, var6, var7, var10, var11, var8, var11, -1453501658)
                              && !classHL.method6070(var0, var1, var2, var3, var4, var5, var6, var7, var8, var11, var8, var9, -1453501658)) {
                              return false;
                           }
                        }
                     }

                     return true;
                  }

                  if (var12 == -483624883) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         return true;
      } catch (RuntimeException var13) {
         throw classEG.newRunException(var13, "nl.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("af")
   public static int method7878(int var0, int var1) {
      try {
         return var0 >> 8;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "nl.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lns;Lns;I)I")
   @ObfuscatedName("az")
   int method7884(classNS var1, classNS var2, int var3) {
      try {
         return var1.field4717 * -1799225543 - var2.field4717 * -1799225543;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "nl.az(" + 41);
      }
   }
}
