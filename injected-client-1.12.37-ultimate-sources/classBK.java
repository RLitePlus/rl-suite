import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bk")
public class classBK implements classJT {
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final String field490 = "passwordchoice.ws";
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field487 = 10;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field488 = 512;
   @ObfuscatedName("ma")
   static int field489;

   @ObfuscatedSignature(descriptor = "(Lxj;I)Lzv;")
   @ObfuscatedName("az")
   @Override
   public classZV vmethod105(classXJ var1, int var2) {
      try {
         return (classZV)client.field833.get(var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "bk.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("ax")
   @Override
   public classYM vmethod110() {
      return classGG.field2577;
   }

   @ObfuscatedSignature(descriptor = "(I)[Lyz;")
   @ObfuscatedName("af")
   @Override
   public classYZ[] vmethod108(int var1) {
      try {
         return classFP.field2373;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "bk.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lym;")
   @ObfuscatedName("ae")
   @Override
   public classYM vmethod111(int var1) {
      try {
         return classGG.field2577;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "bk.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxj;)Lzv;")
   @ObfuscatedName("ag")
   @Override
   public classZV vmethod106(classXJ var1) {
      return (classZV)client.field833.get(var1);
   }

   classBK() {
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("as")
   @Override
   public classYM vmethod112() {
      return classGG.field2577;
   }

   @ObfuscatedSignature(descriptor = "()[Lyz;")
   @ObfuscatedName("ao")
   @Override
   public classYZ[] vmethod109() {
      return classFP.field2373;
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("ac")
   @Override
   public classYM vmethod113() {
      return classGG.field2577;
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("aa")
   @Override
   public classYM vmethod114() {
      return classGG.field2577;
   }

   @ObfuscatedSignature(descriptor = "(Lxj;)Lzv;")
   @ObfuscatedName("ab")
   @Override
   public classZV vmethod107(classXJ var1) {
      return (classZV)client.field833.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ldz;[BIIB)V")
   @ObfuscatedName("aj")
   static final void method1119(classDZ var0, byte[] var1, int var2, int var3, byte var4) {
      try {
         classXY var5 = new classXY(var1);
         int var6 = -1;

         label86:
         while (true) {
            int var7 = var5.method13100((byte)76);
            if (var7 == 0) {
               if (var4 != 0) {
                  throw new IllegalStateException();
               }

               return;
            }

            var6 += var7;
            int var8 = 0;

            while (true) {
               int var9 = var5.method13094((short)17353);
               if (var9 == 0) {
                  if (var4 != 0) {
                     break label86;
                  }
                  break;
               }

               var8 += var9 - 1;
               int var10 = var8 & 63;
               int var11 = var8 >> 6 & 63;
               int var12 = var8 >> 12;
               int var13 = classXY.method13039(var5, -346779531);
               int var14 = var13 >> 2;
               int var15 = var13 & 3;
               int var16 = var2 + var11;
               int var17 = var10 + var3;
               if (var16 > 0) {
                  if (var4 != 0) {
                     throw new IllegalStateException();
                  }

                  if (var17 > 0) {
                     if (var4 != 0) {
                        return;
                     }

                     if (var16 < var0.field1688[0].length - 2) {
                        if (var4 != 0) {
                           throw new IllegalStateException();
                        }

                        if (var17 < var0.field1688[0][0].length - 2) {
                           if (var4 != 0) {
                              throw new IllegalStateException();
                           }

                           int var18 = var12;
                           if ((var0.field1702[1][var16][var17] & 2) == 2) {
                              var18 = var12 - 1;
                           }

                           classGC var19 = null;
                           if (var18 >= 0) {
                              if (var4 != 0) {
                                 throw new IllegalStateException();
                              }

                              if (null != var0.field1687) {
                                 if (var4 != 0) {
                                    throw new IllegalStateException();
                                 }

                                 var19 = var0.field1687[var18];
                              }
                           }

                           classCI.method1518(var0, var12, var16, var17, var6, var15, var14, var19, 1070436096);
                        }
                     }
                  }
               }
            }
         }

         throw new IllegalStateException();
      } catch (RuntimeException var20) {
         throw classEG.method3884(var20, "bk.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("ab")
   public static void method1118(int var0, int var1, byte var2) {
      try {
         classIF.method6207(var0, var1, 0, 0, (byte)-36);
         classNP.field4699.clear();
         classNP.field4700.clear();
         if (classNP.field4698.isEmpty()) {
            classGK.method5486(1061606950);
         } else {
            label39:
            if (var2 <= 1) {
               throw new IllegalStateException();
            } else {
               if (0 == var0) {
                  if (var2 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (var1 == 0) {
                     break label39;
                  }

                  if (var2 <= 1) {
                     throw new IllegalStateException();
                  }
               }

               classNP.field4700.add(new classWU(null, classNP.field4703 * -1331669075));
               classNP.field4700.add(new classWO(null, 0, false, 1784906769 * classNP.field4702));
               ArrayList var4 = new ArrayList();
               Iterator var5 = classNP.field4698.iterator();

               while (var5.hasNext()) {
                  if (var2 <= 1) {
                     throw new IllegalStateException();
                  }

                  classNB var6 = (classNB)var5.next();
                  var4.add(var6);
               }

               classNP.field4700.add(new classWL(null, var4));
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "bk.ab(" + ')');
      }
   }
}
