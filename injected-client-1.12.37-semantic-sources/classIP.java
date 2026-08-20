import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ip")
public class classIP extends classHB {
   @ObfuscatedName("az")
   int field3011;
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   static final int field3012 = 103;

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod504(ClanSettings var1) {
      var1.method6274(-393988657 * this.field3011, -1083013539);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod498(classXY var1, int var2) {
      try {
         this.field3011 = classXY.method13047(var1, -378925059) * -124079825;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ip.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;B)V")
   @ObfuscatedName("af")
   @Override
   void vmethod499(ClanSettings var1, byte var2) {
      try {
         var1.method6274(-393988657 * this.field3011, -1083013539);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ip.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod500(classXY var1) {
      this.field3011 = classXY.method13047(var1, 226577069) * -124079825;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod501(classXY var1) {
      this.field3011 = classXY.method13047(var1, 1847032448) * -124079825;
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod502(ClanSettings var1) {
      var1.method6274(-393988657 * this.field3011, -1083013539);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod503(ClanSettings var1) {
      var1.method6274(-393988657 * this.field3011, -1083013539);
   }

   classIP(classIF var1) {
      this.this$0 = var1;
      this.field3011 = 124079825;
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("bx")
   static int method6232(int var0, Script var1, boolean var2, int var3) {
      try {
         Widget var4 = classLY.method7375(classWK.field6691, classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)89);
         if (var0 == 2500) {
            if (var3 != 1804259678) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4281 * 744286069;
               return 1;
            }
         } else if (2501 == var0) {
            if (var3 != 1804259678) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1570844829 * var4.field4257;
               return 1;
            }
         } else if (var0 == 2502) {
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4249 * 1115597881;
            return 1;
         } else if (2503 == var0) {
            if (var3 != 1804259678) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 293773697 * var4.field4259;
               return 1;
            }
         } else if (var0 == 2504) {
            int[] var10000 = classBB.field323;
            int var10001 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
            byte var10002;
            if (var4.field4289) {
               if (var3 != 1804259678) {
                  throw new IllegalStateException();
               }

               var10002 = 1;
            } else {
               var10002 = 0;
            }

            var10000[var10001] = var10002;
            return 1;
         } else if (2505 == var0) {
            if (var3 != 1804259678) {
               throw new IllegalStateException();
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4342 * -1502647899;
               return 1;
            }
         } else if (2506 == var0) {
            if (var3 != 1804259678) {
               throw new IllegalStateException();
            } else {
               int var5 = var4.field4342 * -1502647899;
               if (-1 == var5) {
                  if (var3 != 1804259678) {
                     throw new IllegalStateException();
                  }

                  classVV var6 = classWK.field6691;

                  for (InterfaceParent var7 = (InterfaceParent)var6.field6613.method13375();
                     null != var7;
                     var7 = (InterfaceParent)IndexedObjectSet.method13401(var6.field6613)
                  ) {
                     if (var3 != 1804259678) {
                        throw new IllegalStateException();
                     }

                     if (-1163656551 * var4.field4329 >> 16 == var7.field5276 * 2023647411) {
                        var5 = (int)var7.field6552;
                        break;
                     }
                  }
               }

               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var5;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "ip.bx(" + 41);
      }
   }
}
