import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cw")
public class classCW {
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   static final int field1308 = 100;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final float field1306 = 0.4F;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field1307 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("br")
   static final String field1309 = "w";

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnl;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ta")
   public static int method2693(classNL var0, Object var1, Object var2) {
      return var0 == null ? var0.method7885(var1, var1) : classNL.method7883(var0, (classNS)var1, (classNS)var2, 415080863);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;II)V")
   @ObfuscatedName("ax")
   static void method2690(WorldEntity var0, int var1, int var2) {
      if (var1 == 65535) {
         byte var5 = -1;
         classQR.method9722(var0.field6017, var5, -2089730688);
         classQR.method9747(var0.field6017, -347513559);
         var0.field6018 = var2 * -1033857357;
      } else {
         SequenceDefinition var3 = var0.field6017.method9731((byte)87);
         if (var3 != null) {
            if (var1 == var0.method10598((byte)-32)) {
               int var4 = var3.field5122 * 1697446663;
               if (1 == var4) {
                  classQR.method9747(var0.field6017, 740937106);
                  var0.field6018 = var2 * -1033857357;
               }

               if (2 == var4) {
                  classQR.method9754(var0.field6017, -79098024);
               }

               return;
            }

            if (classQA.method9430(var1, 834036259).field5121 * -1968168817 < var3.field5121 * -1968168817) {
               return;
            }
         }

         classQR.method9722(var0.field6017, var1, -1985435851);
         classQR.method9747(var0.field6017, 82004239);
         var0.field6018 = var2 * -1033857357;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;Lxs;)V")
   @ObfuscatedName("ae")
   static void method2687(WorldView var0, PacketBuffer var1) {
      int var2 = Buffer.method13039(var1, -346779531);
      if (var2 < classZH.method14003(var0.field1693, (byte)10)) {
         for (int var3 = var2; var3 < classZH.method14003(var0.field1693, (byte)10); var3++) {
            int var4 = var0.field1693.method14001(var3, 1685103733);
            classCU.method2678(var4, 580200972);
            WorldEntity var5 = (WorldEntity)var0.worldEntities.method13595(var4);
            if (var5 != null) {
               var5.vmethod398();
            }
         }
      }

      if (var2 > classZH.method14003(var0.field1693, (byte)10)) {
         throw new RuntimeException("");
      } else {
         var0.field1693.method14007(2081841631);
         classGY var18 = new classGY();

         for (int var19 = 0; var19 < var2; var19++) {
            int var21 = var0.field1693.method14001(var19, 1595056641);
            WorldEntity var6 = (WorldEntity)var0.worldEntities.method13595(var21);
            int var7 = Buffer.method13039(var1, -346779531);
            if (0 == var7) {
               classCU.method2678(var21, 772961001);
               if (null != var6) {
                  var6.vmethod398();
               }
            } else {
               var0.field1693.method13999(var21, (byte)44);
               if (var7 != 1) {
                  var18.method5926(var6.method10563(-1645514239), 84495761);
                  byte var8 = Buffer.method13043(var1, (byte)17);
                  if (0 != var8) {
                     int var9 = classQK.method9604(var1, var8, 0, (byte)27);
                     int var10 = classQK.method9604(var1, var8, 2, (byte)113);
                     int var11 = classQK.method9604(var1, var8, 4, (byte)43);
                     int var12 = classQK.method9604(var1, var8, 6, (byte)50);
                     var18.method5939(var9, var10, var11, var12, 1240479628);
                  }

                  if (var7 == 2) {
                     WorldEntity.method10609(var6, var0, var18, (byte)0);
                  } else {
                     var6.method10612(var18, (byte)-93);
                  }
               }

               int var25 = Buffer.method13039(var1, -346779531);
               if ((var25 & 1) != 0) {
                  int var27 = Buffer.method13047(var1, -907540070);
                  int var30 = var1.method13159((byte)-117);
                  classIX.method6333(var6, var27, var30, 1356281982);
               }

               if (0 != (var25 & 2)) {
                  int var28 = var1.method13159((byte)-94);
                  var6.method10583(var28, -1619453940);
               }
            }
         }

         while (var1.method12931(294258401 * client.packetWriter.serverPacketLength, 761810155) > 0) {
            int var20 = Buffer.method13047(var1, -388693601);
            int var22 = var1.method13165(-809192981);
            int var23 = var1.method13165(-895142115);
            int var24 = var1.method13159((byte)-87);
            int var26 = var1.method13202((byte)76);
            var0.field1693.method13999(var20, (byte)44);
            int var29 = var23 >> 4 & 15;
            int var31 = var23 & 15;
            int var32 = 8 * var29;
            int var33 = 8 * var31;
            WorldView var13 = client.field814.method1582(var20, var32, var33, classAB.field122.method2817((byte)0), classEX.field1978, -1393038213);
            WorldEntity var15 = new WorldEntity(var20, var13);
            IterableNodeHashTable.method13576(var0.worldEntities, var15, var20);
            var15.field6009 = var20 * -662280981;
            var15.field6020 = var0.field1699 * -1758428471;
            WorldEntity.method10567(var15, classIR.method6309(var26, -340342746), -927574133);
            classOB.method8291(var1, var15.field6019, 0, 0, -482046160);
            WorldEntity.method10609(var15, var0, var15.field6019, (byte)0);
            WorldEntity.method10577(var15, (classKR)classOF.method8404(classOB.method8292((byte)-39), var24, 1309193695), -1459513721);
            if ((var22 & 1) != 0) {
               int var16 = Buffer.method13047(var1, 650928042);
               int var17 = var1.method13159((byte)-82);
               classIX.method6333(var15, var16, var17, 2058455401);
            }

            if (0 != (var22 & 2)) {
               int var34 = var1.method13159((byte)-92);
               var15.method10583(var34, -1619453940);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;Lxs;)V")
   @ObfuscatedName("ab")
   static void method2688(WorldView var0, PacketBuffer var1) {
      int var2 = Buffer.method13039(var1, -346779531);
      if (var2 < classZH.method14003(var0.field1693, (byte)10)) {
         for (int var3 = var2; var3 < classZH.method14003(var0.field1693, (byte)10); var3++) {
            int var4 = var0.field1693.method14001(var3, 2106087467);
            classCU.method2678(var4, 470218129);
            WorldEntity var5 = (WorldEntity)var0.worldEntities.method13595(var4);
            if (var5 != null) {
               var5.vmethod398();
            }
         }
      }

      if (var2 > classZH.method14003(var0.field1693, (byte)10)) {
         throw new RuntimeException("");
      } else {
         var0.field1693.method14007(2136204948);
         classGY var18 = new classGY();

         for (int var19 = 0; var19 < var2; var19++) {
            int var21 = var0.field1693.method14001(var19, 1926791976);
            WorldEntity var6 = (WorldEntity)var0.worldEntities.method13595(var21);
            int var7 = Buffer.method13039(var1, -346779531);
            if (0 == var7) {
               classCU.method2678(var21, 172076819);
               if (null != var6) {
                  var6.vmethod398();
               }
            } else {
               var0.field1693.method13999(var21, (byte)44);
               if (var7 != 1) {
                  var18.method5926(var6.method10563(-923752616), 698076929);
                  byte var8 = Buffer.method13043(var1, (byte)17);
                  if (0 != var8) {
                     int var9 = classQK.method9604(var1, var8, 0, (byte)32);
                     int var10 = classQK.method9604(var1, var8, 2, (byte)28);
                     int var11 = classQK.method9604(var1, var8, 4, (byte)46);
                     int var12 = classQK.method9604(var1, var8, 6, (byte)36);
                     var18.method5939(var9, var10, var11, var12, -275726068);
                  }

                  if (var7 == 2) {
                     WorldEntity.method10609(var6, var0, var18, (byte)0);
                  } else {
                     var6.method10612(var18, (byte)-23);
                  }
               }

               int var25 = Buffer.method13039(var1, -346779531);
               if ((var25 & 1) != 0) {
                  int var27 = Buffer.method13047(var1, -293815640);
                  int var30 = var1.method13159((byte)-95);
                  classIX.method6333(var6, var27, var30, 1359054509);
               }

               if (0 != (var25 & 2)) {
                  int var28 = var1.method13159((byte)-22);
                  var6.method10583(var28, -1619453940);
               }
            }
         }

         while (var1.method12931(1265354011 * client.packetWriter.serverPacketLength, 528001785) > 0) {
            int var20 = Buffer.method13047(var1, 282124653);
            int var22 = var1.method13165(-1413020339);
            int var23 = var1.method13165(-1813826168);
            int var24 = var1.method13159((byte)-58);
            int var26 = var1.method13202((byte)31);
            var0.field1693.method13999(var20, (byte)44);
            int var29 = var23 >> 4 & 15;
            int var31 = var23 & 15;
            int var32 = 8 * var29;
            int var33 = 8 * var31;
            WorldView var13 = client.field814.method1582(var20, var32, var33, classAB.field122.method2817((byte)0), classEX.field1978, -1393038213);
            WorldEntity var15 = new WorldEntity(var20, var13);
            IterableNodeHashTable.method13576(var0.worldEntities, var15, var20);
            var15.field6009 = var20 * -662280981;
            var15.field6020 = var0.field1699 * 774817283;
            WorldEntity.method10567(var15, classIR.method6309(var26, 1345348057), -1433354147);
            classOB.method8291(var1, var15.field6019, 0, 0, -482046160);
            WorldEntity.method10609(var15, var0, var15.field6019, (byte)0);
            WorldEntity.method10577(var15, (classKR)classOF.method8404(classOB.method8292((byte)-14), var24, 1067148466), -819973393);
            if ((var22 & 1) != 0) {
               int var16 = Buffer.method13047(var1, 1304730707);
               int var17 = var1.method13159((byte)-96);
               classIX.method6333(var15, var16, var17, 1119365624);
            }

            if (0 != (var22 & 2)) {
               int var34 = var1.method13159((byte)-54);
               var15.method10583(var34, -1619453940);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;II)V")
   @ObfuscatedName("ag")
   static void method2691(WorldEntity var0, int var1, int var2) {
      if (var1 == 65535) {
         byte var5 = -1;
         classQR.method9722(var0.field6017, var5, -2007363398);
         classQR.method9747(var0.field6017, 638185673);
         var0.field6018 = var2 * -1033857357;
      } else {
         SequenceDefinition var3 = var0.field6017.method9731((byte)81);
         if (var3 != null) {
            if (var1 == var0.method10598((byte)-61)) {
               int var4 = var3.field5122 * 1697446663;
               if (1 == var4) {
                  classQR.method9747(var0.field6017, 745148570);
                  var0.field6018 = var2 * -1033857357;
               }

               if (2 == var4) {
                  classQR.method9754(var0.field6017, 1517735591);
               }

               return;
            }

            if (classQA.method9430(var1, 907932233).field5121 * -1968168817 < var3.field5121 * -1968168817) {
               return;
            }
         }

         classQR.method9722(var0.field6017, var1, -2014443293);
         classQR.method9747(var0.field6017, -996301059);
         var0.field6018 = var2 * -1033857357;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;II)V")
   @ObfuscatedName("as")
   static void method2692(WorldEntity var0, int var1, int var2) {
      if (var1 == 65535) {
         byte var5 = -1;
         classQR.method9722(var0.field6017, var5, -2010624485);
         classQR.method9747(var0.field6017, -1327692625);
         var0.field6018 = var2 * -1033857357;
      } else {
         SequenceDefinition var3 = var0.field6017.method9731((byte)21);
         if (var3 != null) {
            if (var1 == var0.method10598((byte)-75)) {
               int var4 = var3.field5122 * 1697446663;
               if (1 == var4) {
                  classQR.method9747(var0.field6017, -1148056682);
                  var0.field6018 = var2 * -1033857357;
               }

               if (2 == var4) {
                  classQR.method9754(var0.field6017, -1110812996);
               }

               return;
            }

            if (classQA.method9430(var1, -248512127).field5121 * -1968168817 < var3.field5121 * -1968168817) {
               return;
            }
         }

         classQR.method9722(var0.field6017, var1, -2066956043);
         classQR.method9747(var0.field6017, -1206820994);
         var0.field6018 = var2 * -1033857357;
      }
   }

   classCW() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(Ldz;I)V")
   @ObfuscatedName("cq")
   static void method2694(WorldView var0, int var1) {
      try {
         if (client.field851) {
            if (var1 <= 2004704828) {
               throw new IllegalStateException();
            }

            classDV.method3627(var0, client.field845 * -2130951373, false, 1418883661);
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "cw.cq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcl;I)Ldn;")
   @ObfuscatedName("af")
   public static NPC method2689(int var0, classCL var1, int var2) {
      try {
         for (WorldView var4 : var1) {
            NPC var5 = (NPC)var4.field1698.method13404(var0);
            if (var5 != null) {
               if (var2 >= 2038139370) {
                  throw new IllegalStateException();
               }

               return var5;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "cw.af(" + ')');
      }
   }
}
