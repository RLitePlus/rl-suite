import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("iv")
public class classIV extends classHB {
   @ObfuscatedName("kh")
   static boolean field3071;
   @ObfuscatedName("af")
   String field3069;
   @ObfuscatedName("az")
   int field3068;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final String field3070 = "scale_";
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field3067 = 10;

   classIV(classIF var1) {
      this.this$0 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltw;ZZZ)Z")
   @ObfuscatedName("dz")
   public static boolean method6317(classTW var0, boolean var1, boolean var2, boolean var3) {
      return var0.method11170(var0.field6247 * -1345601887, var1, var2, var3, (byte)-125);
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("ap")
   static void method6320(boolean var0, byte var1) {
      try {
         byte var2 = 0;
         if (!AbstractArchive.method11864(-2053271753)) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            var2 = 12;
         } else {
            label91: {
               if (!classOE.field4843.method2149(1985617997)) {
                  if (var1 == 1) {
                     return;
                  }

                  if (!classOE.field4843.method2154((byte)80)) {
                     if (var1 == 1) {
                        throw new IllegalStateException();
                     }

                     if (!client.method2152(classOE.field4843, -956599779)) {
                        break label91;
                     }

                     if (var1 == 1) {
                        return;
                     }
                  }
               }

               var2 = 10;
            }
         }

         classAC.method326(var2, 2129783208);
         if (var0) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            classBF.field389 = "";
            client.method2363(-1);
            classBF.field390 = "";
            classEV.field1944 = 0;
            classQP.field5586 = "";
         }

         label81: {
            if (null != classBF.field389) {
               if (var1 == 1) {
                  return;
               }

               if (!classBF.field389.isEmpty()) {
                  if (var1 == 1) {
                     throw new IllegalStateException();
                  }
                  break label81;
               }
            }

            if (ClientPreferences.method2782(classAB.field122, (byte)8) != null) {
               if (var1 == 1) {
                  throw new IllegalStateException();
               }

               classBF.field389 = ClientPreferences.method2782(classAB.field122, (byte)8);
               client.method2363(-1);
               client.field832 = true;
            } else {
               client.field832 = false;
            }
         }

         if (client.field832) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            if (null != classBF.field389) {
               if (var1 == 1) {
                  throw new IllegalStateException();
               }

               if (!classBF.field389.isEmpty()) {
                  if (var1 == 1) {
                     throw new IllegalStateException();
                  }

                  classBF.field403 = -878854915;
                  return;
               }
            }
         }

         classBF.field403 = 0;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "iv.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;B)V")
   @ObfuscatedName("af")
   @Override
   void vmethod499(ClanSettings var1, byte var2) {
      try {
         ClanSettings.method6293(var1, 102865497 * this.field3068, this.field3069, (byte)-85);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "iv.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcy;)Z")
   @ObfuscatedName("ug")
   public static boolean method6318(ClientPreferences var0) {
      return var0.field1341;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod500(classXY var1) {
      this.field3068 = var1.method13056((byte)1) * -1330377239;
      this.field3069 = var1.method13071(254767341);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod501(classXY var1) {
      this.field3068 = var1.method13056((byte)1) * -1330377239;
      this.field3069 = var1.method13071(1085918569);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod502(ClanSettings var1) {
      ClanSettings.method6293(var1, 102865497 * this.field3068, this.field3069, (byte)-121);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod503(ClanSettings var1) {
      ClanSettings.method6293(var1, 102865497 * this.field3068, this.field3069, (byte)-124);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod498(classXY var1, int var2) {
      try {
         this.field3068 = var1.method13056((byte)1) * -1330377239;
         this.field3069 = var1.method13071(-597738653);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "iv.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)V")
   @ObfuscatedName("cm")
   static final void method6321(PacketBuffer var0, int var1) {
      client.method2398(var0);

      try {
         int var2 = var0.method13198(-83822973);
         var0.method13211(1891829759);
         int var3 = var0.method13198(221345550);
         client.field1041.method12818(var3, var2, -1379620371);
         classKK.method6491(client.field1041, var3, var2, false, (byte)0);
         client.method1868(var0);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "iv.cm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod504(ClanSettings var1) {
      ClanSettings.method6293(var1, 102865497 * this.field3068, this.field3069, (byte)-121);
   }

   @ObfuscatedSignature(descriptor = "(I)Lcm;")
   @ObfuscatedName("ax")
   static World method6319(int var0) {
      try {
         World.field1156 = 0;
         return classSX.method10711(-1953402072);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "iv.ax(" + ')');
      }
   }
}
