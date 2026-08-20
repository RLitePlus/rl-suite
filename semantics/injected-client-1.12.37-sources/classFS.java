import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fs")
public class classFS extends classVJ {
   @ObfuscatedSignature(descriptor = "[Let;")
   @ObfuscatedName("az")
   classET[] field2392;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field2393 = 72;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field2394 = 12;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Lva;I)Lfs;")
   @ObfuscatedName("ae")
   public static classFS method4972(AbstractArchive var0, AbstractArchive var1, int var2) {
      boolean var3 = true;
      int var4 = -1;
      int[] var5 = var0.method11824(var2, -1691540534);

      for (int var6 = 0; var6 < var5.length; var6++) {
         byte[] var7 = var0.method11873(var2, var5[var6], 1540366080);
         if (var7 == null) {
            var3 = false;
         } else if (var4 == -1) {
            var4 = (var7[0] & 255) << 8 | var7[1] & 255;
         }
      }

      if (var4 != -1) {
         byte[] var9 = var1.method11873(var4, 0, 1375257937);
         if (var9 == null) {
            var3 = false;
         }
      } else {
         var3 = false;
      }

      if (!var3) {
         return null;
      } else {
         try {
            return new classFS(var0, var1, var2);
         } catch (Exception var8) {
            return null;
         }
      }
   }

   classFS(AbstractArchive var1, AbstractArchive var2, int var3) {
      int var4 = var1.method11868(var3, -82193186);
      this.field2392 = new classET[var4];
      classEM var5 = null;
      int[] var6 = var1.method11824(var3, -1864891576);

      for (int var7 = 0; var7 < var6.length; var7++) {
         byte[] var8 = var1.method11867(var3, var6[var7], -1921665201);
         if (var5 == null) {
            int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
            byte[] var10 = var2.method11873(var9, 0, -94514870);
            var5 = new classEM(var9, var10);
         }

         this.field2392[var6[var7]] = new classET(var8, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("as")
   public boolean method4974(int var1) {
      return this.field2392[var1].field1910;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Lva;I)Lfs;")
   @ObfuscatedName("ab")
   public static classFS method4973(AbstractArchive var0, AbstractArchive var1, int var2) {
      boolean var3 = true;
      int var4 = -1;
      int[] var5 = var0.method11824(var2, -1790781682);

      for (int var6 = 0; var6 < var5.length; var6++) {
         byte[] var7 = var0.method11873(var2, var5[var6], 1734752706);
         if (var7 == null) {
            var3 = false;
         } else if (var4 == -1) {
            var4 = (var7[0] & 255) << 8 | var7[1] & 255;
         }
      }

      if (var4 != -1) {
         byte[] var9 = var1.method11873(var4, 0, 446516911);
         if (var9 == null) {
            var3 = false;
         }
      } else {
         var3 = false;
      }

      if (!var3) {
         return null;
      } else {
         try {
            return new classFS(var0, var1, var2);
         } catch (Exception var8) {
            return null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ag")
   public boolean method4975(int var1) {
      return this.field2392[var1].field1910;
   }

   @ObfuscatedSignature(descriptor = "(B)[Lyz;")
   @ObfuscatedName("ac")
   public static IndexedSprite[] method4978(byte var0) {
      try {
         IndexedSprite[] var1 = new IndexedSprite[classYL.field7001 * 1616155503];

         for (int var2 = 0; var2 < classYL.field7001 * 1616155503; var2++) {
            if (var0 == 0) {
               throw new IllegalStateException();
            }

            IndexedSprite var3 = var1[var2] = new IndexedSprite();
            var3.field7124 = classYL.field7000 * -1073038619;
            var3.field7120 = -1062567517 * classYL.field6999;
            var3.field7122 = classYL.field7002[var2];
            var3.field7123 = classYL.field7003[var2];
            var3.field7121 = classPO.field5371[var2];
            var3.field7119 = classGG.field2578[var2];
            var3.palette = classRB.field5639;
            var3.pixels = classYL.field7004[var2];
         }

         classVZ.method12278((byte)-99);
         return var1;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "fs.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lfs;")
   @ObfuscatedName("mx")
   public static classFS method4981(int var0) {
      return classCN.method2557(var0, 1275003202);
   }

   @ObfuscatedSignature(descriptor = "(Lyn;ILjava/lang/String;B)Ljava/lang/String;")
   @ObfuscatedName("ab")
   static String method4977(IterableNodeHashTable var0, int var1, String var2, byte var3) {
      try {
         if (null == var0) {
            if (var3 <= 9) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            classVE var4 = (classVE)var0.method13595(var1);
            if (null == var4) {
               if (var3 <= 9) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               return (String)var4.field6498;
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "fs.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   public static void method4979(int var0) {
      try {
         EvictingDualNodeHashTable.method6431(classPL.field5336);
         EvictingDualNodeHashTable.method6431(classPL.field5337);
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "fs.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZB)I")
   @ObfuscatedName("cy")
   static int method4980(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (var0 == 8501) {
            if (var3 >= 3) {
               throw new IllegalStateException();
            } else {
               int[] var20;
               int var22;
               byte var24;
               label135: {
                  classXG var12 = classXH.method12772(classOE.client.field790, classBB.field322[(classXT.field6939 -= -1297854163) * 18294437]);
                  int var14 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                  var20 = classBB.field323;
                  var22 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
                  if (var12 != null) {
                     if (var3 >= 3) {
                        throw new IllegalStateException();
                     }

                     if (var14 == var12.field6864 * -38539607) {
                        if (var3 >= 3) {
                           throw new IllegalStateException();
                        }

                        var24 = 1;
                        break label135;
                     }
                  }

                  var24 = 0;
               }

               var20[var22] = var24;
               return 1;
            }
         } else if (var0 == 8520) {
            if (var3 >= 3) {
               throw new IllegalStateException();
            } else {
               classXG var11 = classOE.client.field790.method12768(classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371], -112924041);
               long[] var19 = classBB.field322;
               int var21 = (classXT.field6939 += -1297854163) * 18294437 - 1;
               long var23;
               if (var11 != null) {
                  if (var3 >= 3) {
                     throw new IllegalStateException();
                  }

                  var23 = -5931402327633732889L * var11.field6866;
               } else {
                  var23 = -1L;
               }

               var19[var21] = var23;
               return 1;
            }
         } else if (var0 == 8521) {
            classXG var10 = classXH.method12772(classOE.client.field790, classBB.field322[(classXT.field6939 -= -1297854163) * 18294437]);
            int[] var18 = classBB.field323;
            int var10001 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
            int var10002;
            if (null != var10) {
               if (var3 >= 3) {
                  throw new IllegalStateException();
               }

               var10002 = var10.field6863 * 1743701503;
            } else {
               var10002 = -1;
            }

            var18[var10001] = var10002;
            return 1;
         } else if (var0 == 8560) {
            if (var3 >= 3) {
               throw new IllegalStateException();
            } else {
               int var9 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classXG var13 = classXH.method12772(classOE.client.field790, classBB.field322[(classXT.field6939 -= -1297854163) * 18294437]);
               if (null == var13) {
                  if (var3 >= 3) {
                     throw new IllegalStateException();
                  }

                  classPC var16 = WorldView.method3717(classIZ.method6339(var9, (byte)108), 805125283);
                  classBD.method990(classBW.method1267(var9, (byte)-82), var16.field5216[classCF.method1461(var9, (byte)20)], (byte)125);
               } else {
                  if (var13.field6864 * -38539607 != classIZ.method6339(var9, (byte)76)) {
                     throw new RuntimeException("");
                  }

                  if (var3 >= 3) {
                     throw new IllegalStateException();
                  }

                  classBD.method990(classBW.method1267(var9, (byte)-36), var13.field6862[classCF.method1461(var9, (byte)13)], (byte)106);
               }

               return 1;
            }
         } else if (8570 == var0) {
            if (var3 >= 3) {
               throw new IllegalStateException();
            } else {
               int var4 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classXG var5 = classXH.method12772(classOE.client.field790, classBB.field322[(classXT.field6939 -= -1297854163) * 18294437]);
               if (var5 == null) {
                  if (var3 >= 3) {
                     throw new IllegalStateException();
                  }

                  classPC var6 = WorldView.method3717(classIZ.method6339(var4, (byte)124), -2100207088);
                  Object[] var10000;
                  if (classJW.method6417(var4, (byte)-75) == classOG.field4864) {
                     if (var3 >= 3) {
                        throw new IllegalStateException();
                     }

                     var10000 = var6.field5218;
                  } else {
                     var10000 = var6.field5217;
                  }

                  Object[] var7 = var10000;
                  classBD.method990(classBW.method1267(var4, (byte)-66), var7[classCF.method1461(var4, (byte)-19)], (byte)118);
               } else {
                  if (var5.field6864 * -38539607 != classIZ.method6339(var4, (byte)36)) {
                     throw new RuntimeException("");
                  }

                  if (var3 >= 3) {
                     throw new IllegalStateException();
                  }

                  Object[] var17;
                  if (classJW.method6417(var4, (byte)-27) == classOG.field4864) {
                     if (var3 >= 3) {
                        throw new IllegalStateException();
                     }

                     var17 = var5.field6861;
                  } else {
                     var17 = var5.field6865;
                  }

                  Object[] var15 = var17;
                  classBD.method990(classBW.method1267(var4, (byte)-98), var15[classCF.method1461(var4, (byte)-31)], (byte)72);
               }

               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "fs.cy(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("sk")
   public boolean method4982(int var1) {
      return this.method4976(var1, (byte)75);
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("af")
   public boolean method4976(int var1, byte var2) {
      try {
         return this.field2392[var1].field1910;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "fs.af(" + ')');
      }
   }
}
