import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gy")
public class class165 extends classFM {
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field2127 = 78;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final int field2129 = 21;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field2128 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("bz")
   static final int field2130 = 1076101603;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field2125 = 1536;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field2124 = 127;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field2126 = 4096;
   @ToRemove(unused = "true")
   @ObfuscatedName("dd")
   static final int field2131 = 100;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field2123 = 0;
   @ObfuscatedName("av")
   int field2122;

   @ObfuscatedSignature(descriptor = "(Lwh;I)Ljava/lang/Object;")
   @ObfuscatedName("cp")
   static Object method4411(class586 var0, int var1) {
      try {
         if (var0 == null) {
            if (var1 != 790883686) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("popValueOfType() failure - null baseVarType");
            }
         } else {
            switch (var0.field6375 * 676106613) {
               case 0:
                  return Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               case 3:
                  return Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               default:
                  throw new IllegalStateException("popValueOfType() failure - unsupported type");
            }
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "gy.cp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod182(Buffer var1, byte var2) {
      try {
         this.field2122 = Buffer.method12008(var1, (byte)5) * -890042721;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gy.av(" + ')');
      }
   }

   class165(class154 var1) {
      this.this$0 = var1;
      this.field2122 = 890042721;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;Ljq;I)V")
   @ObfuscatedName("ph")
   public static void method4408(Model var0, class251 var1, int var2) {
      if (var0 == null) {
         var0.getFaceTransparencies();
      }

      var0.method6874(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod184(Buffer var1) {
      this.field2122 = Buffer.method12008(var1, (byte)5) * -890042721;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod183(Buffer var1) {
      this.field2122 = Buffer.method12008(var1, (byte)5) * -890042721;
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("bs")
   static int method4410(int var0, Script var1, boolean var2, int var3) {
      try {
         if (2700 == var0) {
            Widget var15 = class226.widgetDefinition
               .method7953(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 1980117476);
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var15.itemId * -231674939;
            return 1;
         } else if (var0 == 2701) {
            if (var3 == 915082835) {
               throw new IllegalStateException();
            } else {
               Widget var14 = class226.widgetDefinition
                  .method7953(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 1976397634);
               if (var14.itemId * -231674939 != -1) {
                  if (var3 == 915082835) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1070452379 * var14.itemQuantity;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               }

               return 1;
            }
         } else if (var0 == 2702) {
            if (var3 == 915082835) {
               throw new IllegalStateException();
            } else {
               int var13 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               InterfaceParent var17 = (InterfaceParent)client.interfaceParents.method8915(var13);
               if (var17 != null) {
                  if (var3 == 915082835) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               }

               return 1;
            }
         } else if (var0 == 2703) {
            if (var3 == 915082835) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1084394537;
               int var12 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               Widget var16 = class226.widgetDefinition
                  .getWidgetChild(
                     Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1],
                     Interpreter.Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789],
                     -1683269067
                  );
               ParamComposition var18 = WorldMap.getParamDefinition(var12, -560681641);
               if (ParamComposition.method4969(var18, 1649349813)) {
                  if (var3 == 915082835) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var16.method8068(
                     var12, var18.defaultStr, (byte)53
                  );
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var16.method8071(
                     var12, -822826545 * var18.defaultInt, -2007207513
                  );
               }

               return 1;
            }
         } else if (2704 == var0) {
            if (var3 == 915082835) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1084394537;
               Widget var11 = class226.widgetDefinition
                  .getWidgetChild(
                     Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize],
                     Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789],
                     -708628138
                  );
               int var5 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
               Object var6 = class39.method651(var5, 1172512898);
               int var7 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Widget.method8079(var11, var7, var6, (byte)68);
               return 1;
            }
         } else if (2706 == var0) {
            if (var3 == 915082835) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1354500905 * client.rootInterface;
               return 1;
            }
         } else if (2707 == var0) {
            Widget var10 = class226.widgetDefinition
               .method7953(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -2083728325);
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var10.method8113((byte)14) ? 1 : 0;
            return 1;
         } else if (var0 == 2708) {
            if (var3 == 915082835) {
               throw new IllegalStateException();
            } else {
               Widget var9 = class226.widgetDefinition
                  .method7953(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -1013406228);
               return FriendSystem.method472(var9, 1781325806);
            }
         } else if (2709 == var0) {
            if (var3 == 915082835) {
               throw new IllegalStateException();
            } else {
               Widget var4 = class226.widgetDefinition
                  .method7953(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 1466831686);
               return class28.method532(var4, (byte)-16);
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "gy.bs(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod185(ClanSettings var1, byte var2) {
      try {
         var1.method4308(this.field2122 * -850750113, -318876416);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gy.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ig")
   static final void method4409(byte var0) {
      try {
         if (-848945929 * client.logoutTimer > 0) {
            if (var0 > 0) {
               class30.logOut((byte)32);
            }
         } else {
            client.timer.method8696(-378949484);
            WorldMapSectionType.updateGameState(40, (byte)45);
            FadeInTask.field5856 = PacketWriter.method3346(client.packetWriter, -1498731585);
            PacketWriter.method3340(client.packetWriter, 1703255159);
         }
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "gy.ig(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("at")
   static void changeWorldSelectSorting(int var0, int var1, int var2) {
      try {
         int[] var3 = new int[4];
         int[] var4 = new int[4];
         var3[0] = var0;
         var4[0] = var1;
         int var5 = 1;

         for (int var6 = 0; var6 < 4; var6++) {
            if (var2 >= -1602952024) {
               throw new IllegalStateException();
            }

            if (var0 != World.World_sortOption1[var6]) {
               var3[var5] = World.World_sortOption1[var6];
               var4[var5] = World.World_sortOption2[var6];
               var5++;
            }
         }

         World.World_sortOption1 = var3;
         World.World_sortOption2 = var4;
         class154.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2, (byte)-98);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "gy.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod186(ClanSettings var1) {
      var1.method4308(this.field2122 * -850750113, 1900537892);
   }
}
