import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bo")
public class classBO implements classGO {
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   public static final int field520 = 15;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field519 = 2340;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final int field521 = 15;

   @ObfuscatedSignature(descriptor = "(Llw;Lou;IZ)Lfx;")
   @ObfuscatedName("bx")
   @Override
   public Model vmethod132(Widget var1, SequenceDefinition var2, int var3, boolean var4) {
      classPL var5 = null;
      NpcOverrides var6 = null;
      int var7 = var1.field4374 * -1623159427;
      if (var7 >= 0) {
         NPC var8 = (NPC)classIS.field3053.field1698.method13404(var7);
         if (null != var8 && null != var8.definition) {
            var5 = var8.definition;
            if (var5.field5325 != null) {
               var5 = var5.method8955(652890385);
            }

            var6 = NPC.method3476(var8, (byte)-29);
         }
      }

      Player var10 = classMB.method7521(1598569583);
      PlayerComposition var9 = var10 == null ? null : var10.field1285;
      return var1.method7200(classWK.field6691, var2, var3, var4, var9, var5, var6, -2128070697);
   }

   @ObfuscatedSignature(descriptor = "(Llw;B)Lfx;")
   @ObfuscatedName("az")
   @Override
   public Model vmethod115(Widget var1, byte var2) {
      try {
         classOP var3 = classOB.method8299(2073671441 * var1.field4319, (byte)-23);
         if (var3 != null) {
            var3 = var3.method8664(var1.field4344 * 1190987649, 898030122);
            return var3.method8657(1, -724913995);
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "bo.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;B)Lfx;")
   @ObfuscatedName("af")
   @Override
   public Model vmethod119(Widget var1, byte var2) {
      try {
         if (0 == -759306091 * var1.field4374) {
            if (var2 != 4) {
               throw new IllegalStateException();
            } else {
               return client.field992.method6701(null, -1, null, -1, (byte)1);
            }
         } else {
            Player var3 = classMB.method7521(-259687461);
            if (var3 != null) {
               if (var2 != 4) {
                  throw new IllegalStateException();
               } else {
                  return var3.vmethod104(-891174633);
               }
            } else {
               return null;
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "bo.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;B)Lfx;")
   @ObfuscatedName("ae")
   @Override
   public Model vmethod122(Widget var1, byte var2) {
      try {
         Player var3 = classMB.method7521(752730330);
         if (var3 != null) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            } else {
               return var1.field4358
                  .method6701(null, -1, classQA.method9430(var3.field1436 * 1457308725, 1530482058), var3.field1464.method9738(2129109176), (byte)1);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "bo.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lou;I)Lfx;")
   @ObfuscatedName("au")
   @Override
   public Model vmethod126(Widget var1, SequenceDefinition var2, int var3) {
      if (-1 != -759306091 * var1.field4374) {
         classOM var4 = classMU.method7729(var1.field4374 * -148932903, 2027127927);
         return var4.method8594(10, 0, (int[][])null, 0, 0, 0, var2, var3, -1135264680);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lou;IB)Lfx;")
   @ObfuscatedName("ag")
   @Override
   public Model vmethod129(Widget var1, SequenceDefinition var2, int var3, byte var4) {
      try {
         if (-1 != -759306091 * var1.field4374) {
            if (var4 != 43) {
               throw new IllegalStateException();
            } else {
               classPL var5 = classOH.method8448(var1.field4374 * -759306091, 1793567603);
               return var5.method8942(var2, var3, null, -1, null, -191422442);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "bo.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lou;IZI)Lfx;")
   @ObfuscatedName("as")
   @Override
   public Model vmethod133(Widget var1, SequenceDefinition var2, int var3, boolean var4, int var5) {
      try {
         classPL var6 = null;
         NpcOverrides var7 = null;
         int var8 = var1.field4374 * -759306091;
         if (var8 >= 0) {
            if (var5 == -908076843) {
               throw new IllegalStateException();
            }

            NPC var9 = (NPC)classIS.field3053.field1698.method13404(var8);
            if (null != var9 && null != var9.definition) {
               if (var5 == -908076843) {
                  throw new IllegalStateException();
               }

               var6 = var9.definition;
               if (var6.field5325 != null) {
                  if (var5 == -908076843) {
                     throw new IllegalStateException();
                  }

                  var6 = var6.method8955(652890385);
               }

               var7 = NPC.method3476(var9, (byte)-4);
            }
         }

         Player var12 = classMB.method7521(42398432);
         PlayerComposition var10000;
         if (var12 == null) {
            if (var5 == -908076843) {
               throw new IllegalStateException();
            }

            var10000 = null;
         } else {
            var10000 = var12.field1285;
         }

         PlayerComposition var10 = var10000;
         return var1.method7200(classWK.field6691, var2, var3, var4, var10, var6, var7, -2075288880);
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "bo.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Lfx;")
   @ObfuscatedName("aq")
   @Override
   public Model vmethod123(Widget var1) {
      Player var2 = classMB.method7521(2070538627);
      return var2 != null
         ? var1.field4358.method6701(null, -1, classQA.method9430(var2.field1436 * 1457308725, 1313111908), var2.field1464.method9738(1879796211), (byte)1)
         : null;
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lou;IZ)Lfx;")
   @ObfuscatedName("ak")
   @Override
   public Model vmethod135(Widget var1, SequenceDefinition var2, int var3, boolean var4) {
      int var5 = var1.field4374 * -759306091;
      classPL var6 = classOH.method8448(var5, 118556390);
      if (null != var6.field5325) {
         var6 = var6.method8955(652890385);
      }

      Player var7 = classMB.method7521(1225397356);
      PlayerComposition var8 = var7 == null ? null : var7.field1285;
      return var1.method7200(classWK.field6691, var2, var3, var4, var8, var6, null, -2068731694);
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Lfx;")
   @ObfuscatedName("aa")
   @Override
   public Model vmethod116(Widget var1) {
      classOP var2 = classOB.method8299(2073671441 * var1.field4319, (byte)-46);
      if (var2 != null) {
         var2 = var2.method8664(var1.field4344 * -277148656, 1190594093);
         return var2.method8657(1, -1898977711);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lou;IB)Lfx;")
   @ObfuscatedName("ab")
   @Override
   public Model vmethod127(Widget var1, SequenceDefinition var2, int var3, byte var4) {
      try {
         if (-1 != -759306091 * var1.field4374) {
            classOM var5 = classMU.method7729(var1.field4374 * -759306091, 1543312346);
            return var5.method8594(10, 0, (int[][])null, 0, 0, 0, var2, var3, -1135264680);
         } else {
            return null;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "bo.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Lfx;")
   @ObfuscatedName("al")
   @Override
   public Model vmethod117(Widget var1) {
      classOP var2 = classOB.method8299(2073671441 * var1.field4319, (byte)37);
      if (var2 != null) {
         var2 = var2.method8664(var1.field4344 * 1190987649, 1943896797);
         return var2.method8657(1, -859986762);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Lfx;")
   @ObfuscatedName("aj")
   @Override
   public Model vmethod120(Widget var1) {
      if (0 == -759306091 * var1.field4374) {
         return client.field992.method6701(null, -1, null, -1, (byte)1);
      } else {
         Player var2 = classMB.method7521(-1277868466);
         return var2 != null ? var2.vmethod104(427759963) : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Lfx;")
   @ObfuscatedName("ay")
   @Override
   public Model vmethod121(Widget var1) {
      if (0 == -759306091 * var1.field4374) {
         return client.field992.method6701(null, -1, null, -1, (byte)1);
      } else {
         Player var2 = classMB.method7521(-1648313017);
         return var2 != null ? var2.vmethod104(244516039) : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lou;IZ)Lfx;")
   @ObfuscatedName("av")
   @Override
   public Model vmethod136(Widget var1, SequenceDefinition var2, int var3, boolean var4) {
      int var5 = var1.field4374 * -221803860;
      classPL var6 = classOH.method8448(var5, -1215657702);
      if (null != var6.field5325) {
         var6 = var6.method8955(652890385);
      }

      Player var7 = classMB.method7521(1891500084);
      PlayerComposition var8 = var7 == null ? null : var7.field1285;
      return var1.method7200(classWK.field6691, var2, var3, var4, var8, var6, null, -2135461722);
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Lfx;")
   @ObfuscatedName("ad")
   @Override
   public Model vmethod124(Widget var1) {
      Player var2 = classMB.method7521(210080967);
      return var2 != null
         ? var1.field4358.method6701(null, -1, classQA.method9430(var2.field1436 * 1566784038, -387895459), var2.field1464.method9738(1769274076), (byte)1)
         : null;
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lou;IZB)Lfx;")
   @ObfuscatedName("ac")
   @Override
   public Model vmethod140(Widget var1, SequenceDefinition var2, int var3, boolean var4, byte var5) {
      try {
         Player var6 = classMB.method7521(1636756859);
         PlayerComposition var7 = null == var6 ? null : var6.field1285;
         return var1.method7200(classWK.field6691, var2, var3, var4, var7, null, null, -2095627363);
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "bo.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Lfx;")
   @ObfuscatedName("ao")
   @Override
   public Model vmethod118(Widget var1) {
      classOP var2 = classOB.method8299(-2091812169 * var1.field4319, (byte)88);
      if (var2 != null) {
         var2 = var2.method8664(var1.field4344 * 115844986, 1301631379);
         return var2.method8657(1, 167763939);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lou;I)Lfx;")
   @ObfuscatedName("ai")
   @Override
   public Model vmethod128(Widget var1, SequenceDefinition var2, int var3) {
      if (-1 != -759306091 * var1.field4374) {
         classOM var4 = classMU.method7729(var1.field4374 * -571041594, 1543666079);
         return var4.method8594(10, 0, (int[][])null, 0, 0, 0, var2, var3, -1135264680);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lou;I)Lfx;")
   @ObfuscatedName("aw")
   @Override
   public Model vmethod130(Widget var1, SequenceDefinition var2, int var3) {
      if (-1 != 694527222 * var1.field4374) {
         classPL var4 = classOH.method8448(var1.field4374 * -759306091, 1143850612);
         return var4.method8942(var2, var3, null, -1, null, -1282499361);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Lfx;")
   @ObfuscatedName("ap")
   @Override
   public Model vmethod125(Widget var1) {
      Player var2 = classMB.method7521(-1241901958);
      return var2 != null
         ? var1.field4358.method6701(null, -1, classQA.method9430(var2.field1436 * 1457308725, 1205347347), var2.field1464.method9738(1780094988), (byte)1)
         : null;
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lou;IZ)Lfx;")
   @ObfuscatedName("bn")
   @Override
   public Model vmethod141(Widget var1, SequenceDefinition var2, int var3, boolean var4) {
      Player var5 = classMB.method7521(1551788044);
      PlayerComposition var6 = null == var5 ? null : var5.field1285;
      return var1.method7200(classWK.field6691, var2, var3, var4, var6, null, null, -1997278196);
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lou;IZ)Lfx;")
   @ObfuscatedName("ah")
   @Override
   public Model vmethod142(Widget var1, SequenceDefinition var2, int var3, boolean var4) {
      Player var5 = classMB.method7521(254090120);
      PlayerComposition var6 = null == var5 ? null : var5.field1285;
      return var1.method7200(classWK.field6691, var2, var3, var4, var6, null, null, -2131794464);
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lou;IZ)Lfx;")
   @ObfuscatedName("at")
   @Override
   public Model vmethod137(Widget var1, SequenceDefinition var2, int var3, boolean var4) {
      int var5 = var1.field4374 * -759306091;
      classPL var6 = classOH.method8448(var5, -1558476895);
      if (null != var6.field5325) {
         var6 = var6.method8955(652890385);
      }

      Player var7 = classMB.method7521(44931239);
      PlayerComposition var8 = var7 == null ? null : var7.field1285;
      return var1.method7200(classWK.field6691, var2, var3, var4, var8, var6, null, -2116691410);
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lou;IZ)Lfx;")
   @ObfuscatedName("an")
   @Override
   public Model vmethod138(Widget var1, SequenceDefinition var2, int var3, boolean var4) {
      int var5 = var1.field4374 * -759306091;
      classPL var6 = classOH.method8448(var5, -1765573185);
      if (null != var6.field5325) {
         var6 = var6.method8955(652890385);
      }

      Player var7 = classMB.method7521(829754392);
      PlayerComposition var8 = var7 == null ? null : var7.field1285;
      return var1.method7200(classWK.field6691, var2, var3, var4, var8, var6, null, -2014186838);
   }

   classBO() {
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lou;IZ)Lfx;")
   @ObfuscatedName("am")
   @Override
   public Model vmethod143(Widget var1, SequenceDefinition var2, int var3, boolean var4) {
      Player var5 = classMB.method7521(-618768134);
      PlayerComposition var6 = null == var5 ? null : var5.field1285;
      return var1.method7200(classWK.field6691, var2, var3, var4, var6, null, null, -2067405629);
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lou;IZI)Lfx;")
   @ObfuscatedName("ax")
   @Override
   public Model vmethod139(Widget var1, SequenceDefinition var2, int var3, boolean var4, int var5) {
      try {
         int var6 = var1.field4374 * -759306091;
         classPL var7 = classOH.method8448(var6, -1076663323);
         if (null != var7.field5325) {
            if (var5 >= 557073924) {
               throw new IllegalStateException();
            }

            var7 = var7.method8955(652890385);
         }

         Player var8 = classMB.method7521(1071084469);
         PlayerComposition var10000;
         if (var8 == null) {
            if (var5 >= 557073924) {
               throw new IllegalStateException();
            }

            var10000 = null;
         } else {
            var10000 = var8.field1285;
         }

         PlayerComposition var9 = var10000;
         return var1.method7200(classWK.field6691, var2, var3, var4, var9, var7, null, -2090734718);
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "bo.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lou;I)Lfx;")
   @ObfuscatedName("ar")
   @Override
   public Model vmethod131(Widget var1, SequenceDefinition var2, int var3) {
      if (-1 != -759306091 * var1.field4374) {
         classPL var4 = classOH.method8448(var1.field4374 * -759306091, -321194246);
         return var4.method8942(var2, var3, null, -1, null, -206370015);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;Lou;IZ)Lfx;")
   @ObfuscatedName("bc")
   @Override
   public Model vmethod134(Widget var1, SequenceDefinition var2, int var3, boolean var4) {
      classPL var5 = null;
      NpcOverrides var6 = null;
      int var7 = var1.field4374 * 132129510;
      if (var7 >= 0) {
         NPC var8 = (NPC)classIS.field3053.field1698.method13404(var7);
         if (null != var8 && null != var8.definition) {
            var5 = var8.definition;
            if (var5.field5325 != null) {
               var5 = var5.method8955(652890385);
            }

            var6 = NPC.method3476(var8, (byte)-101);
         }
      }

      Player var10 = classMB.method7521(2141103279);
      PlayerComposition var9 = var10 == null ? null : var10.field1285;
      return var1.method7200(classWK.field6691, var2, var3, var4, var9, var5, var6, -2037475463);
   }

   @ObfuscatedSignature(descriptor = "(IIIILup;Lym;Lkh;B)V")
   @ObfuscatedName("as")
   static void method1165(int var0, int var1, int var2, int var3, classUP var4, SpritePixels var5, classKH var6, byte var7) {
      try {
         classKH var15 = var6;
         SpritePixels var14 = var5;
         classUP var13 = var4;
         int var12 = var3;
         int var11 = var2;
         int var10 = var1;
         int var9 = var0;
         byte var16 = 57;

         try {
            if (var14 == null) {
               if (var16 <= 2) {
                  throw new IllegalStateException();
               }
            } else {
               int var17 = var12 * var12 + var11 * var11;
               if (var17 <= 6400) {
                  int var18 = var13.method11443(1456319041);
                  int var19 = classUP.method11445(var13, (byte)-80);
                  int var20 = var12 * var18 + var11 * var19 >> 16;
                  int var21 = var19 * var12 - var18 * var11 >> 16;
                  if (var17 > 2500) {
                     if (var16 > 2) {
                        var14.method13534(
                           -1246906611 * var15.field3586 / 2 + var20 - var14.field7006 / 2,
                           var15.field3585 * -1637380195 / 2 - var21 - var14.field7008 / 2,
                           var9,
                           var10,
                           -1246906611 * var15.field3586,
                           var15.field3585 * -1637380195,
                           var15.field3587,
                           var15.field3584
                        );
                     }
                  } else {
                     SpritePixels.method13511(
                        var14,
                        var9 + -1246906611 * var15.field3586 / 2 + var20 - var14.field7006 / 2,
                        var10 + var15.field3585 * -1637380195 / 2 - var21 - var14.field7008 / 2
                     );
                  }
               }
            }
         } catch (RuntimeException var22) {
            throw classEG.method3884(var22, "bo.as(" + ')');
         }
      } catch (Exception var23) {
      }
   }
}
