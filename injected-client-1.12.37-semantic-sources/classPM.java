import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pm")
public class classPM {
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field5347 = 2;
   @ObfuscatedSignature(descriptor = "[Lyz;")
   @ObfuscatedName("db")
   static IndexedSprite[] field5349;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5348 = 1;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;Lyn;)Lyn;")
   @ObfuscatedName("as")
   static final IterableNodeHashTable method9006(classXY var0, IterableNodeHashTable var1) {
      int var2 = classXY.method13039(var0, -346779531);
      if (var1 == null) {
         int var3 = classBZ.method1385(var2, 751476678);
         var1 = new IterableNodeHashTable(var3);
      }

      for (int var7 = 0; var7 < var2; var7++) {
         int var4 = classXY.method13039(var0, -346779531);
         int var5 = var0.method13051(-758448158);
         Object var6;
         if (var4 == 1) {
            var6 = new classVE(var0.method13071(717597091));
         } else if (var4 == 2) {
            var6 = new classVK(var0.method13059(-1407046780));
         } else {
            var6 = new IntegerNode(var0.method13056((byte)1));
         }

         IterableNodeHashTable.method13576(var1, (Node)var6, var5);
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;Lyn;)Lyn;")
   @ObfuscatedName("ag")
   static final IterableNodeHashTable method9007(classXY var0, IterableNodeHashTable var1) {
      int var2 = classXY.method13039(var0, -346779531);
      if (var1 == null) {
         int var3 = classBZ.method1385(var2, 688985698);
         var1 = new IterableNodeHashTable(var3);
      }

      for (int var7 = 0; var7 < var2; var7++) {
         int var4 = classXY.method13039(var0, -346779531);
         int var5 = var0.method13051(-758448158);
         Object var6;
         if (var4 == 1) {
            var6 = new classVE(var0.method13071(-1030484561));
         } else if (var4 == 2) {
            var6 = new classVK(var0.method13059(-1472281966));
         } else {
            var6 = new IntegerNode(var0.method13056((byte)1));
         }

         IterableNodeHashTable.method13576(var1, (Node)var6, var5);
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyn;ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ao")
   static String method9011(IterableNodeHashTable var0, int var1, String var2) {
      if (null == var0) {
         return var2;
      } else {
         classVE var3 = (classVE)var0.method13595(var1);
         return null == var3 ? var2 : (String)var3.field6498;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;Lyn;)Lyn;")
   @ObfuscatedName("ax")
   static final IterableNodeHashTable method9008(classXY var0, IterableNodeHashTable var1) {
      int var2 = classXY.method13039(var0, -346779531);
      if (var1 == null) {
         int var3 = classBZ.method1385(var2, -1013348674);
         var1 = new IterableNodeHashTable(var3);
      }

      for (int var7 = 0; var7 < var2; var7++) {
         int var4 = classXY.method13039(var0, -346779531);
         int var5 = var0.method13051(-758448158);
         Object var6;
         if (var4 == 1) {
            var6 = new classVE(var0.method13071(1010928731));
         } else if (var4 == 2) {
            var6 = new classVK(var0.method13059(-876696519));
         } else {
            var6 = new IntegerNode(var0.method13056((byte)1));
         }

         IterableNodeHashTable.method13576(var1, (Node)var6, var5);
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyn;II)I")
   @ObfuscatedName("ac")
   static int method9009(IterableNodeHashTable var0, int var1, int var2) {
      if (null == var0) {
         return var2;
      } else {
         IntegerNode var3 = (IntegerNode)var0.method13595(var1);
         return null == var3 ? var2 : var3.integer;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfu;)V")
   @ObfuscatedName("vc")
   public static void method9015(Texture var0) {
      if (var0 == null) {
         var0.method5012();
      }

      var0.field2397 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyn;II)I")
   @ObfuscatedName("aa")
   static int method9010(IterableNodeHashTable var0, int var1, int var2) {
      if (null == var0) {
         return var2;
      } else {
         IntegerNode var3 = (IntegerNode)var0.method13595(var1);
         return null == var3 ? var2 : var3.integer;
      }
   }

   classPM() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyn;ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("al")
   static String method9012(IterableNodeHashTable var0, int var1, String var2) {
      if (null == var0) {
         return var2;
      } else {
         classVE var3 = (classVE)var0.method13595(var1);
         return null == var3 ? var2 : (String)var3.field6498;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyn;ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("aj")
   static String method9013(IterableNodeHashTable var0, int var1, String var2) {
      if (null == var0) {
         return var2;
      } else {
         classVE var3 = (classVE)var0.method13595(var1);
         return null == var3 ? var2 : (String)var3.field6498;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyn;ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ay")
   static String method9014(IterableNodeHashTable var0, int var1, String var2) {
      if (null == var0) {
         return var2;
      } else {
         classVE var3 = (classVE)var0.method13595(var1);
         return null == var3 ? var2 : (String)var3.field6498;
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("an")
   static final void method9016(short var0) {
      try {
         EvictingDualNodeHashTable.method6431(DbRowType.field7171);
         classCP.method2571((short)-13093);
         classCA.method1393(-2075868347);
         GraphicsObject.method1093(-527717715);
         EvictingDualNodeHashTable.method6431(classPH.field5252);
         classHG.method6008(1495797727);
         EvictingDualNodeHashTable.method6431(classPW.field5445);
         EvictingDualNodeHashTable.method6431(classPW.field5446);
         EvictingDualNodeHashTable.method6431(classPW.field5447);
         classLV.method7153(713674047);
         CollisionMap.method5307(2037089252);
         EvictingDualNodeHashTable.method6431(classOC.field4814);
         classDC.method2926((short)22388);
         classVP.method12021(-1817923762);
         classFS.method4979(-1424033407);
         classLI.method7108(669177050);
         classDA.method2856(-1860656544);
         EvictingDualNodeHashTable.method6431(SequenceDefinition.field5141);
         EvictingDualNodeHashTable.method6431(SequenceDefinition.field5145);
         EvictingDualNodeHashTable.method6431(SequenceDefinition.field5144);
         classXK.method12823(959307806);
         UserList.method10190(-16711936);
         EvictingDualNodeHashTable.method6431(WorldEntityConfig.field4873);
         EvictingDualNodeHashTable.method6431(VarbitComposition.field5418);
         if (null != classAAK.field56) {
            if (var0 == 255) {
               return;
            }

            classXR.method12884(classAAK.field56, (byte)0);
         }

         if (null != classRE.field5659) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            classXR.method12884(classRE.field5659, (byte)0);
         }

         classGG.method5428(-814519496);
         EvictingDualNodeHashTable.method6431(classOY.field5194);
         IntProjection.method4076(-1771558194);
         classJR.method6405(-475788970);
         EvictingDualNodeHashTable.method6431(client.field978);
         EvictingDualNodeHashTable.method6431(client.field937);
         classEH.method3892(-1519862708);
         if (null != classWK.field6691) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            classWK.field6691.method7393((byte)-68);
         }

         if (classFH.field2257.field2239 != null) {
            if (var0 == 255) {
               return;
            }

            ((TextureProvider)classFH.field2257.field2239).method3817((byte)28);
         }

         classDO.method3508((byte)-81);
         classRJ.method9993(classCE.field702, (byte)-79);
         if (null != classEN.field1804) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            classEN.field1804.method11863((byte)2);
         }

         if (null != NPC.field1584) {
            NPC.field1584.method11863((byte)2);
         }

         if (classQE.field5525 != null) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            classQE.field5525.method11863((byte)2);
         }

         if (ItemContainer.field462 != null) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            ItemContainer.field462.method11863((byte)2);
         }

         if (null != classWN.field6759) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            classWN.field6759.method11863((byte)2);
         }

         if (null != classBF.field427) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            classBF.field427.method11863((byte)2);
         }

         if (null != classBE.field383) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            classBE.field383.method11863((byte)2);
         }

         if (null != ItemContainer.field463) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            ItemContainer.field463.method11863((byte)2);
         }

         if (classYO.field7023 != null) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            classYO.field7023.method11863((byte)2);
         }

         if (null != classCC.field671) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            classCC.field671.method11863((byte)2);
         }

         if (classLZ.field4452 != null) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            classLZ.field4452.method11863((byte)2);
         }

         if (null != MouseHandler.field6273) {
            MouseHandler.field6273.method11863((byte)2);
         }

         if (classCB.field650 != null) {
            if (var0 == 255) {
               return;
            }

            classCB.field650.method11863((byte)2);
         }

         if (classAF.field146 != null) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            classAF.field146.method11863((byte)2);
         }

         if (classFC.field2208 != null) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            classFC.field2208.method11863((byte)2);
         }

         if (null != classSX.field6097) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            classSX.field6097.method11863((byte)2);
         }

         if (null != classMQ.field4562) {
            classMQ.field4562.method11863((byte)2);
         }

         if (classHC.field2767 != null) {
            classHC.field2767.method11863((byte)2);
         }

         if (null != classOP.field5078) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            classOP.field5078.method11863((byte)2);
         }

         if (classQN.field5572 != null) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            classQN.field5572.method11863((byte)2);
         }

         if (classAF.field147 != null) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            classAF.field147.method11863((byte)2);
         }

         if (null != classGG.field2576) {
            if (var0 == 255) {
               return;
            }

            classGG.field2576.method11863((byte)2);
         }

         if (null != classCJ.field764) {
            if (var0 == 255) {
               throw new IllegalStateException();
            }

            classCJ.field764.method11863((byte)2);
         }
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "pm.an(" + ')');
      }
   }
}
