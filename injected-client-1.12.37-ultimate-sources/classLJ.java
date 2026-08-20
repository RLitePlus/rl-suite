import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lj")
public class classLJ implements classXZ {
   @ObfuscatedSignature(descriptor = "Llj;")
   @ObfuscatedName("ae")
   public static final classLJ field4176 = new classLJ(2);
   @ObfuscatedSignature(descriptor = "Llj;")
   @ObfuscatedName("af")
   public static final classLJ field4177 = new classLJ(1);
   @ObfuscatedSignature(descriptor = "Llj;")
   @ObfuscatedName("ab")
   public static final classLJ field4175 = new classLJ(3);
   @ObfuscatedSignature(descriptor = "Llj;")
   @ObfuscatedName("az")
   public static final classLJ field4174 = new classLJ(0);
   @ObfuscatedName("ag")
   final int field4178;
   @ObfuscatedSignature(descriptor = "Lfx;")
   @ObfuscatedName("mo")
   static classFX field4179;

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return this.field4178 * 177564869;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "lj.az(" + 41);
      }
   }

   classLJ(int var1) {
      this.field4178 = 53424653 * var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return this.field4178 * 177564869;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Llj;")
   @ObfuscatedName("as")
   public static classLJ[] method7110() {
      return new classLJ[]{field4177, field4174, field4176, field4175};
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return this.field4178 * 177564869;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return this.field4178 * 1981206463;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Llj;")
   @ObfuscatedName("ax")
   public static classLJ[] method7111() {
      return new classLJ[]{field4177, field4174, field4176, field4175};
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIIB)V")
   @ObfuscatedName("es")
   static final void method7116(classDZ var0, int var1, int var2, int var3, byte var4) {
      try {
         classNN var5 = var0.field1701[var1][var2][var3];
         if (null == var5) {
            if (var4 == -1) {
               throw new IllegalStateException();
            } else {
               classEZ.method4495(var0.field1689, var1, var2, var3);
               client.method2259(var0, var1, var2, var3);
            }
         } else {
            long var6 = -99999999L;
            classDL var8 = null;

            for (classDL var9 = (classDL)var5.method7915(); var9 != null; var9 = (classDL)classNN.method7924(var5)) {
               if (var4 == -1) {
                  throw new IllegalStateException();
               }

               classOP var10 = classOB.method8299(-1370204663 * var9.field1552, (byte)76);
               long var11 = var10.field5043 * 665046345;
               if (var10.field5055 * 1633663665 == 1) {
                  long var10001;
                  if (1413659045 * var9.field1554 < Integer.MAX_VALUE) {
                     if (var4 == -1) {
                        throw new IllegalStateException();
                     }

                     var10001 = var9.field1554 * 1413659045 + 1;
                  } else {
                     var10001 = 1413659045 * var9.field1554;
                  }

                  var11 *= var10001;
               }

               if (var11 > var6) {
                  if (var4 == -1) {
                     client.method2259(var0, var1, var2, var3);
                     return;
                  }

                  var6 = var11;
                  var8 = var9;
               }
            }

            if (null == var8) {
               classEZ.method4495(var0.field1689, var1, var2, var3);
               client.method2259(var0, var1, var2, var3);
            } else {
               var5.method7902(var8);
               classDL var18 = null;
               classDL var19 = null;

               for (classDL var17 = (classDL)var5.method7915(); var17 != null; var17 = (classDL)classNN.method7924(var5)) {
                  if (var4 == -1) {
                     throw new IllegalStateException();
                  }

                  if (var8.field1552 * -1370204663 != var17.field1552 * -1370204663) {
                     if (var4 == -1) {
                        throw new IllegalStateException();
                     }

                     if (var18 == null) {
                        if (var4 == -1) {
                           throw new IllegalStateException();
                        }

                        var18 = var17;
                     }

                     if (var17.field1552 * -1370204663 != var18.field1552 * -1370204663) {
                        if (var4 == -1) {
                           throw new IllegalStateException();
                        }

                        if (var19 == null) {
                           if (var4 == -1) {
                              throw new IllegalStateException();
                           }

                           var19 = var17;
                        }
                     }
                  }
               }

               int var12 = classEZ.method4492(var0.field1689, var1, var2, var3);
               classUZ var13 = classUZ.field6433;
               if (0 == var12) {
                  if (var4 == -1) {
                     throw new IllegalStateException();
                  }

                  var13 = classME.method7562(var0, var2, var3, var1, -435249545);
               }

               var8.method3406(var13, 1364509005);
               if (null != var18) {
                  if (var4 == -1) {
                     throw new IllegalStateException();
                  }

                  var18.method3406(var13, 1364509005);
               }

               if (null != var19) {
                  if (var4 == -1) {
                     throw new IllegalStateException();
                  }

                  var19.method3406(var13, 1364509005);
               }

               long var14 = classRF.method9961(var1, var2, var3, 3, false, 0, 2140889407 * var0.field1699, (short)20381);
               var0.field1689
                  .method4475(
                     var1,
                     var2,
                     var3,
                     classKV.method6571(var0, classKY.method6612(var2, -673763073), classKY.method6612(var3, 880521706), var1, (byte)122),
                     var8,
                     var14,
                     var18,
                     var19,
                     var12
                  );
               client.method2259(var0, var1, var2, var3);
            }
         }
      } catch (RuntimeException var16) {
         throw classEG.method3884(var16, "lj.es(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIZIII)Lym;")
   @ObfuscatedName("ab")
   public static final classYM method7114(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6, int var7, int var8) {
      try {
         label272: {
            if (var6 == 36) {
               if (var8 != 1683831829) {
                  throw new IllegalStateException();
               }

               if (var7 == 32) {
                  if (-1 == var1) {
                     var4 = 0;
                  } else if (2 == var4) {
                     if (var8 != 1683831829) {
                        throw new IllegalStateException();
                     }

                     if (1 != var1) {
                        var4 = 1;
                     }
                  }
                  break label272;
               }

               if (var8 != 1683831829) {
                  throw new IllegalStateException();
               }
            }

            var4 = 0;
         }

         long var9 = ((long)var1 << 16) + var0 + ((long)var2 << 38) + ((long)var4 << 40) + ((long)var3 << 42);
         if (!var5) {
            if (var8 != 1683831829) {
               throw new IllegalStateException();
            }

            if (var6 == 36) {
               if (var8 != 1683831829) {
                  throw new IllegalStateException();
               }

               if (var7 == 32) {
                  if (var8 != 1683831829) {
                     throw new IllegalStateException();
                  }

                  classYM var11 = (classYM)classOP.field5008.method6422(var9);
                  if (var11 != null) {
                     if (var8 != 1683831829) {
                        throw new IllegalStateException();
                     }

                     return var11;
                  }
               }
            }
         }

         classOP var12 = classOB.method8299(var0, (byte)1);
         if (var1 > 1) {
            if (var8 != 1683831829) {
               throw new IllegalStateException();
            }

            if (null != var12.field5056) {
               if (var8 != 1683831829) {
                  throw new IllegalStateException();
               }

               int var13 = -1;

               for (int var14 = 0; var14 < 10; var14++) {
                  if (var1 >= var12.field5057[var14]) {
                     if (var8 != 1683831829) {
                        throw new IllegalStateException();
                     }

                     if (0 != var12.field5057[var14]) {
                        if (var8 != 1683831829) {
                           throw new IllegalStateException();
                        }

                        var13 = var12.field5056[var14];
                     }
                  }
               }

               if (-1 != var13) {
                  if (var8 != 1683831829) {
                     throw new IllegalStateException();
                  }

                  var12 = classOB.method8299(var13, (byte)63);
               }
            }
         }

         classFX var26 = var12.method8657(1, -1367725887);
         if (var26 == null) {
            if (var8 != 1683831829) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            classYM var27 = null;
            if (1236138331 * var12.field5051 != -1) {
               var27 = method7114(1357747305 * var12.field5058, 10, 1, 0, 0, true, var6, var7, 1683831829);
               if (var27 == null) {
                  if (var8 != 1683831829) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            } else if (-1 != var12.field5052 * 1835686777) {
               if (var8 != 1683831829) {
                  throw new IllegalStateException();
               }

               var27 = method7114(var12.field5064 * 641055003, var1, var2, var3, 0, false, var6, var7, 1683831829);
               if (null == var27) {
                  if (var8 != 1683831829) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            } else if (-1 != -2023616411 * var12.field5065) {
               if (var8 != 1683831829) {
                  throw new IllegalStateException();
               }

               var27 = method7114(1197673963 * var12.field5013, var1, 0, 0, 0, false, var6, var7, 1683831829);
               if (null == var27) {
                  if (var8 != 1683831829) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            }

            int[] var15 = classYW.field7104;
            int var16 = classYW.field7102;
            int var17 = classYW.field7101;
            float[] var18 = classYW.field7103;
            int[] var19 = new int[4];
            classYW.method13675(var19);
            classYM var25 = new classYM(var6, var7);
            classFH.method4738(var25.field7005, var6, var7, null);
            classYW.method13683();
            classFH.method4740();
            int var20 = var7 >> 1;
            classFH.method4756(var20, var20);
            classFH.field2257.field2212 = false;
            if (var12.field5065 * -2023616411 != -1) {
               if (var8 != 1683831829) {
                  throw new IllegalStateException();
               }

               classYM.method13511(var27, 0, 0);
            }

            int var21 = var12.field5034 * 1694643499;
            if (var6 != 36) {
               if (var8 != 1683831829) {
                  throw new IllegalStateException();
               }

               var21 = 32 * var21 / var6;
            }

            if (var5) {
               if (var8 != 1683831829) {
                  throw new IllegalStateException();
               }

               var21 = (int)(var21 * 1.5);
            } else if (var2 == 2) {
               if (var8 != 1683831829) {
                  throw new IllegalStateException();
               }

               var21 = (int)(1.04 * var21);
            }

            int var22 = var21 * classFH.field2253[var12.field5035 * 320831297] >> 16;
            int var23 = var21 * classFH.field2254[320831297 * var12.field5035] >> 16;
            var26.method5230();
            var26.method5250(
               0,
               -1663465803 * var12.field5036,
               163610477 * var12.field5054,
               320831297 * var12.field5035,
               1898608961 * var12.field5038,
               var22 + -1256242689 * var26.field1743 / 2 + -1593790933 * var12.field5039,
               var23 + var12.field5039 * -1593790933
            );
            if (var12.field5052 * 1835686777 != -1) {
               classYM.method13511(var27, 0, 0);
            }

            if (var2 >= 1) {
               if (var8 != 1683831829) {
                  throw new IllegalStateException();
               }

               var25.method13500(1);
            }

            if (var2 >= 2) {
               if (var8 != 1683831829) {
                  throw new IllegalStateException();
               }

               var25.method13500(16777215);
            }

            if (0 != var3) {
               classHJ.method6064(var25, var3);
            }

            classFH.method4738(var25.field7005, var6, var7, null);
            if (-1 != 1236138331 * var12.field5051) {
               if (var8 != 1683831829) {
                  throw new IllegalStateException();
               }

               classYM.method13511(var27, 0, 0);
            }

            label242: {
               if (1 != var4) {
                  if (var8 != 1683831829) {
                     throw new IllegalStateException();
                  }

                  if (2 != var4) {
                     break label242;
                  }

                  if (var8 != 1683831829) {
                     throw new IllegalStateException();
                  }

                  if (var12.field5055 * 1633663665 != 1) {
                     break label242;
                  }
               }

               classNE.field4667.method56(classLH.method7104(var1, 828644827), 0, 9, 16776960, 1);
            }

            if (!var5) {
               if (var8 != 1683831829) {
                  throw new IllegalStateException();
               }

               if (36 == var6) {
                  if (var8 != 1683831829) {
                     throw new IllegalStateException();
                  }

                  if (32 == var7) {
                     classOP.field5008.method6428(var25, var9);
                  }
               }
            }

            classFH.method4738(var15, var16, var17, var18);
            classYW.method13679(var19);
            classFH.method4740();
            classFH.field2257.field2212 = true;
            return var25;
         }
      } catch (RuntimeException var24) {
         throw classEG.method3884(var24, "lj.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;IZLbl;I)V")
   @ObfuscatedName("ax")
   static void method7115(classLW var0, int var1, boolean var2, classBL var3, int var4) {
      try {
         if (null == var0.field4340) {
            var0.field4340 = new classLW[1 + var1];
         }

         if (var0.field4340.length <= var1) {
            classLW[] var5 = new classLW[var1 + 1];
            System.arraycopy(var0.field4340, 0, var5, 0, var0.field4340.length);
            var0.field4340 = var5;
         } else {
            classLW var7 = var0.field4340[var1];
            if (var7 != null) {
               if (var4 >= -259325141) {
                  throw new IllegalStateException();
               }

               if (var2) {
                  throw new RuntimeException("");
               }

               classDM.method3434(var7, var0, (byte)-81);
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "lj.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;IB)Lyz;")
   @ObfuscatedName("ax")
   public static classYZ method7113(classVA var0, int var1, byte var2) {
      try {
         if (!classLN.method7126(var0, var1, (byte)0)) {
            return null;
         } else {
            classYZ var4 = new classYZ();
            var4.field7124 = classYL.field7000 * -1073038619;
            var4.field7120 = classYL.field6999 * -1062567517;
            var4.field7122 = classYL.field7002[0];
            var4.field7123 = classYL.field7003[0];
            var4.field7121 = classPO.field5371[0];
            var4.field7119 = classGG.field2578[0];
            var4.field7126 = classRB.field5639;
            var4.field7125 = classYL.field7004[0];
            classVZ.method12278((byte)63);
            return var4;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "lj.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([IB)[Ljava/lang/Object;")
   @ObfuscatedName("az")
   static Object[] method7112(int[] var0, byte var1) {
      try {
         Object[] var2 = new Object[var0.length];

         for (int var3 = 0; var3 < var0.length; var3++) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            switch (classRN.method10130(var0[var3], 1474882567).field7107 * -900901303) {
               case 0:
               case 1:
                  var2[var3] = null;
                  break;
               case 2:
                  var2[var3] = classTM.method10934(var0[var3], -973324355);
                  break;
               case 3:
                  var2[var3] = (long)classTM.method10934(var0[var3], -973324355);
                  break;
               case 4:
                  var2[var3] = "";
            }
         }

         return var2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "lj.az(" + ')');
      }
   }
}
