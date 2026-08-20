import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jb")
public class classJB implements classXZ {
   @ObfuscatedSignature(descriptor = "Lyz;")
   @ObfuscatedName("cl")
   static classYZ field3120;
   @ObfuscatedSignature(descriptor = "Ljb;")
   @ObfuscatedName("af")
   public static final classJB field3117 = new classJB(1, 1, true, false);
   @ObfuscatedSignature(descriptor = "Ljb;")
   @ObfuscatedName("ae")
   public static final classJB field3115 = new classJB(2, 2, true, true);
   @ObfuscatedName("ab")
   final int field3112;
   @ObfuscatedName("ag")
   final int field3111;
   @ObfuscatedSignature(descriptor = "Ljb;")
   @ObfuscatedName("az")
   public static final classJB field3114 = new classJB(0, 0, false, false);
   @ObfuscatedName("ax")
   public final boolean field3113;
   @ObfuscatedSignature(descriptor = "Ljb;")
   @ObfuscatedName("ac")
   public static final classJB field3116 = field3115;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field3118 = 10;
   @ObfuscatedName("as")
   public final boolean field3110;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field3119 = 9;

   classJB(int var1, int var2, boolean var3, boolean var4) {
      this.field3112 = -847524539 * var1;
      this.field3111 = 1160914555 * var2;
      this.field3110 = var3;
      this.field3113 = var4;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return 1894631603 * this.field3111;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return 1894631603 * this.field3111;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lai;)I")
   @ObfuscatedName("bu")
   public static int method6344(classAI var0) {
      return 745199125 * var0.field158;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return 1894631603 * this.field3111;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return 1894631603 * this.field3111;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "jb.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIIIII)V")
   @ObfuscatedName("dv")
   static void method6346(classDZ var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         classNN var7 = var0.field1701[var1][var2][var3];
         if (var7 != null) {
            if (var6 <= -1090888932) {
               throw new IllegalStateException();
            }

            for (classDL var8 = (classDL)var7.method7915(); var8 != null; var8 = (classDL)classNN.method7924(var7)) {
               if (var6 <= -1090888932) {
                  return;
               }

               if (var8.field1552 * -1370204663 == var4) {
                  if (var6 <= -1090888932) {
                     throw new IllegalStateException();
                  }

                  if (var5 == 1413659045 * var8.field1554) {
                     var8.vmethod398();
                     break;
                  }
               }
            }

            if (var7.method7915() == null) {
               if (var6 <= -1090888932) {
                  throw new IllegalStateException();
               }

               var0.field1701[var1][var2][var3] = null;
            }

            classLJ.method7116(var0, var1, var2, var3, (byte)-111);
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "jb.dv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ac")
   static void method6345(int var0, int var1) {
      try {
         if (var0 == -44590225 * client.field828) {
            if (var1 != -1192966987) {
               throw new IllegalStateException();
            }
         } else {
            if (30 == -44590225 * client.field828) {
               client.field908.method4582((byte)118);
            }

            if (-44590225 * client.field828 == 0) {
               if (var1 != -1192966987) {
                  throw new IllegalStateException();
               }

               classOE.field4843.method11071(-2025028862);
            }

            label167: {
               if (var0 != 20) {
                  if (var1 != -1192966987) {
                     return;
                  }

                  if (var0 != 40) {
                     if (var1 != -1192966987) {
                        return;
                     }

                     if (45 != var0) {
                        if (50 != var0) {
                           break label167;
                        }

                        if (var1 != -1192966987) {
                           return;
                        }
                     }
                  }
               }

               classRL.method10026(classCX.field1310, 249948929);
               client.field905 = 0;
               client.field815 = 0;
               client.field917.method6758(var0, 1630105049);
               if (var0 != 20) {
                  if (var1 != -1192966987) {
                     throw new IllegalStateException();
                  }

                  classXQ.method12875(false, 402128428);
               }
            }

            if (20 != var0) {
               if (var1 != -1192966987) {
                  throw new IllegalStateException();
               }

               if (var0 != 40) {
                  if (var1 != -1192966987) {
                     return;
                  }

                  if (classDS.field1623 != null) {
                     if (var1 != -1192966987) {
                        throw new IllegalStateException();
                     }

                     classDS.field1623.vmethod604(1271658352);
                     classDS.field1623 = null;
                  }
               }
            }

            if (25 == -44590225 * client.field828) {
               client.field913 = 0;
               client.field909 = 0;
               client.field910 = 196357067;
               client.field816 = 0;
               client.field912 = 882774979;
            }

            label175: {
               if (5 != var0) {
                  if (var1 != -1192966987) {
                     throw new IllegalStateException();
                  }

                  if (var0 != 10) {
                     if (var0 == 20) {
                        if (var1 != -1192966987) {
                           throw new IllegalStateException();
                        }

                        int var4 = client.field828 * -44590225 == 11 ? 4 : 0;
                        classJF.method6361(classBH.field462, classHC.field2767, classOV.field5169, false, var4, 1600397897);
                     } else if (var0 == 11) {
                        if (var1 != -1192966987) {
                           throw new IllegalStateException();
                        }

                        classJF.method6361(classBH.field462, classHC.field2767, classOV.field5169, false, 4, 1600397897);
                     } else if (50 == var0) {
                        if (var1 != -1192966987) {
                           return;
                        }

                        classSP.method10624("", "Updating date of birth...", "", (byte)-44);
                        classJF.method6361(classBH.field462, classHC.field2767, classOV.field5169, false, 7, 1600397897);
                     } else if (var0 != 0) {
                        if (var1 != -1192966987) {
                           throw new IllegalStateException();
                        }

                        if (!classPA.field5209) {
                           if (var1 != -1192966987) {
                              throw new IllegalStateException();
                           }
                        } else {
                           field3120 = null;
                           classKA.field3514 = null;
                           classBM.field514 = null;
                           classNI.field4673 = null;
                           classFR.field2391 = null;
                           classFP.field2372 = null;
                           classCG.field733 = null;
                           classCK.field778 = null;
                           classEK.field1779 = null;
                           classCR.field1230 = null;
                           classCF.field720 = null;
                           classPM.field5349 = null;
                           classPD.field5227 = null;
                           classFJ.field2294 = null;
                           classML.field4531.method2584(1347397579);
                           classBK.method1118(0, 100, (byte)115);
                           classWU.method12629((byte)100).method11887(true, 116730183);
                           classPA.field5209 = false;
                           client.method2310(-1);
                        }
                     }
                     break label175;
                  }

                  if (var1 != -1192966987) {
                     throw new IllegalStateException();
                  }
               }

               byte var10000;
               if (classVA.method11864(-2053271753)) {
                  if (var1 != -1192966987) {
                     throw new IllegalStateException();
                  }

                  var10000 = 0;
               } else {
                  var10000 = 12;
               }

               byte var2 = var10000;
               classJF.method6361(classBH.field462, classHC.field2767, classOV.field5169, true, var2, 1600397897);
            }

            client.field828 = var0 * -214948977;
            client.method2357(-1);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "jb.ac(" + ')');
      }
   }
}
