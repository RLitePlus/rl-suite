import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public abstract class Renderable extends classVO implements net.runelite.api.Renderable {
   @ObfuscatedName("ed")
   public int field1743 = 1715874840;

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   protected boolean vmethod97() {
      return true;
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIIIIJIIZ)V")
   @ObfuscatedName("mq")
   void vmethod414(
      int var1, classUP var2, classUP var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14
   ) {
      if (1 != classFH.field2257.field2217 || this.vmethod95(-6876261)) {
         Model var15 = this.vmethod104(1316629443);
         if (var15 != null) {
            var5 -= this.vmethod98(-100665075);
            this.field1743 = 1 * var15.field1743;
            classNZ.method8286(var15, this.vmethod260((byte)64));
            var15.method5163(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
            classNZ.method8286(var15, classFZ.field2515);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILuu;IIIJ)V")
   @ObfuscatedName("ms")
   void vmethod419(int var1, classUU var2, int var3, int var4, int var5, long var6) {
      try {
         if (1 != classFH.field2257.field2217 || this.vmethod95(409103606)) {
            Model var8 = this.vmethod104(284128743);
            if (null != var8) {
               var4 -= this.vmethod98(-799269367);
               this.field1743 = var8.field1743 * 1;
               classNZ.method8286(var8, this.vmethod260((byte)56));
               var8.vmethod419(var1, var2, var3, var4, var5, var6);
               classNZ.method8286(var8, classFZ.field2515);
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "ee.mu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   protected int vmethod102() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   protected boolean vmethod95(int var1) {
      try {
         return true;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ee.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lfz;")
   @ObfuscatedName("bg")
   protected classFZ vmethod260(byte var1) {
      try {
         return classFZ.field2515;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ee.bg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ar")
   protected boolean vmethod96() {
      return true;
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIIIIJIIZ)V")
   @ObfuscatedName("lx")
   void vmethod415(
      int var1, classUP var2, classUP var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14
   ) {
      try {
         if (1 != classFH.field2257.field2217 || this.vmethod95(-785834226)) {
            Model var15 = this.vmethod104(-1455788262);
            if (var15 != null) {
               var5 -= this.vmethod98(-244425845);
               this.field1743 = 1 * var15.field1743;
               classNZ.method8286(var15, this.vmethod260((byte)42));
               var15.method5163(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
               classNZ.method8286(var15, classFZ.field2515);
            }
         }
      } catch (RuntimeException var16) {
         throw classEG.method3884(var16, "ee.lx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ad")
   protected Model vmethod93() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIIIIJIIZ)V")
   @ObfuscatedName("mk")
   void vmethod416(
      int var1, classUP var2, classUP var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14
   ) {
      if (1 != classFH.field2257.field2217 || this.vmethod95(1957067718)) {
         Model var15 = this.vmethod104(-1642790657);
         if (var15 != null) {
            var5 -= this.vmethod98(-50511978);
            this.field1743 = 1 * var15.field1743;
            classNZ.method8286(var15, this.vmethod260((byte)25));
            var15.method5163(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
            classNZ.method8286(var15, classFZ.field2515);
         }
      }
   }

   public int getModelHeight() {
      return this.field1743 * -1256242689;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   protected boolean vmethod94() {
      return true;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   protected int vmethod98(int var1) {
      try {
         return 0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ee.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   protected int vmethod99() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   protected int vmethod100() {
      return 0;
   }

   public void setModelHeight(int var1) {
      this.field1743 = var1 * 903659007;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("av")
   protected int vmethod101() {
      return 0;
   }

   protected Renderable() {
   }

   public int getAnimationHeightOffset() {
      return this.vmethod98(106143449);
   }

   @ObfuscatedSignature(descriptor = "(ILuu;IIIJ)V")
   @ObfuscatedName("dh")
   public void method3839(int var1, classUU var2, int var3, int var4, int var5, long var6) {
      this.vmethod419(var1, var2, var3, var4, var5, var6);
   }

   @ObfuscatedSignature(descriptor = "()Lfz;")
   @ObfuscatedName("ue")
   public classFZ method3840() {
      return this.vmethod260((byte)106);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   protected int vmethod103() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "()Lfz;")
   @ObfuscatedName("cp")
   protected classFZ vmethod261() {
      return classFZ.field2515;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;B)V")
   @ObfuscatedName("co")
   static void method3838(WorldView var0, byte var1) {
      try {
         WorldEntity var2 = (WorldEntity)var0.worldEntities.method13595(-2034209657 * client.field846);
         if (var2 == null) {
            if (var1 == 0) {
               ;
            }
         } else {
            classDG.method3080(var0, var2, false, 940794824);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ee.co(" + ')');
      }
   }

   public int getRenderMode() {
      return this.method3840().field2514;
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIIIIJIIZ)V")
   @ObfuscatedName("sz")
   public void method3841(
      int var1, classUP var2, classUP var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14
   ) {
      this.vmethod415(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var12, var13, var14);
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIIIIJIIZ)V")
   @ObfuscatedName("me")
   void vmethod417(
      int var1, classUP var2, classUP var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14
   ) {
      if (1 != classFH.field2257.field2217 || this.vmethod95(960025440)) {
         Model var15 = this.vmethod104(-1421815584);
         if (var15 != null) {
            var5 -= this.vmethod98(1870273107);
            this.field1743 = 1 * var15.field1743;
            classNZ.method8286(var15, this.vmethod260((byte)36));
            var15.method5163(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
            classNZ.method8286(var15, classFZ.field2515);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("uh")
   public Model method3842() {
      return this.vmethod104(-891174633);
   }

   @ObfuscatedSignature(descriptor = "(ILup;Lup;IIIIIIJIIZ)V")
   @ObfuscatedName("mt")
   void vmethod418(
      int var1, classUP var2, classUP var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14
   ) {
      if (1 != classFH.field2257.field2217 || this.vmethod95(-428553131)) {
         Model var15 = this.vmethod104(1119298836);
         if (var15 != null) {
            var5 -= this.vmethod98(-809662443);
            this.field1743 = 1 * var15.field1743;
            classNZ.method8286(var15, this.vmethod260((byte)123));
            var15.method5163(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
            classNZ.method8286(var15, classFZ.field2515);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ap")
   protected Model vmethod92() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(ILuu;IIIJ)V")
   @ObfuscatedName("ml")
   void vmethod420(int var1, classUU var2, int var3, int var4, int var5, long var6) {
      if (1 != classFH.field2257.field2217 || this.vmethod95(561642254)) {
         Model var8 = this.vmethod104(-1414331705);
         if (null != var8) {
            var4 -= this.vmethod98(-191918719);
            this.field1743 = var8.field1743 * 1;
            classNZ.method8286(var8, this.vmethod260((byte)77));
            var8.vmethod419(var1, var2, var3, var4, var5, var6);
            classNZ.method8286(var8, classFZ.field2515);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILuu;IIIJ)V")
   @ObfuscatedName("mu")
   void vmethod421(int var1, classUU var2, int var3, int var4, int var5, long var6) {
      if (1 != classFH.field2257.field2217 || this.vmethod95(-764973486)) {
         Model var8 = this.vmethod104(-394479590);
         if (null != var8) {
            var4 -= this.vmethod98(1553042247);
            this.field1743 = var8.field1743 * 1;
            classNZ.method8286(var8, this.vmethod260((byte)68));
            var8.vmethod419(var1, var2, var3, var4, var5, var6);
            classNZ.method8286(var8, classFZ.field2515);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lfx;")
   @ObfuscatedName("ae")
   protected Model vmethod104(int var1) {
      try {
         return null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ee.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZB)I")
   @ObfuscatedName("bt")
   static int method3837(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (var0 == 3200) {
            if (var3 >= 6) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 360123687;
               GraphicsObject.field475
                  .method10472(
                     classBB.field323[DynamicObject.field1679 * -324749371],
                     classBB.field323[-324749371 * DynamicObject.field1679 + 1],
                     classBB.field323[DynamicObject.field1679 * -324749371 + 2],
                     (byte)0
                  );
               return 1;
            }
         } else if (var0 == 3201) {
            if (var3 >= 6) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 600206145;
               int var20 = classBB.field323[DynamicObject.field1679 * -324749371];
               int var29 = classBB.field323[1 + -324749371 * DynamicObject.field1679];
               int var38 = classBB.field323[2 + -324749371 * DynamicObject.field1679];
               int var52 = classBB.field323[-324749371 * DynamicObject.field1679 + 3];
               int var57 = classBB.field323[4 + -324749371 * DynamicObject.field1679];
               ArrayList var58 = new ArrayList();
               var58.add(var20);
               classRJ.method9998(var58, var29, var38, var52, var57, (byte)53);
               return 1;
            }
         } else if (var0 == 3202) {
            DynamicObject.field1679 -= 240082458;
            Script.method1148(classBB.field323[-324749371 * DynamicObject.field1679], classBB.field323[-324749371 * DynamicObject.field1679 + 1], 1433612772);
            return 1;
         } else {
            if (3212 != var0 && 3213 != var0) {
               if (var3 >= 6) {
                  throw new IllegalStateException();
               }

               if (3209 != var0) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  if (3181 != var0 && 3203 != var0) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     if (var0 != 3205) {
                        if (var3 >= 6) {
                           throw new IllegalStateException();
                        }

                        if (var0 != 3207) {
                           if (var0 != 3214) {
                              if (var3 >= 6) {
                                 throw new IllegalStateException();
                              }

                              if (3215 != var0 && var0 != 3210) {
                                 if (var3 >= 6) {
                                    throw new IllegalStateException();
                                 }

                                 if (var0 != 3182 && 3204 != var0 && var0 != 3206) {
                                    if (var3 >= 6) {
                                       throw new IllegalStateException();
                                    }

                                    if (var0 != 3208) {
                                       if (3211 == var0) {
                                          if (var3 >= 6) {
                                             throw new IllegalStateException();
                                          }

                                          return 1;
                                       }

                                       if (3216 == var0) {
                                          if (var3 >= 6) {
                                             throw new IllegalStateException();
                                          }

                                          int var19 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                                          int var28 = 0;
                                          classCB var37 = (classCB)classOF.method8404(classAF.method335((byte)93), var19, -1921146105);
                                          if (null != var37) {
                                             if (var3 >= 6) {
                                                throw new IllegalStateException();
                                             }

                                             var28 = classCB.field638 != var37 ? 1 : 0;
                                          }

                                          classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var28;
                                          return 1;
                                       }

                                       if (var0 == 3218) {
                                          if (var3 >= 6) {
                                             throw new IllegalStateException();
                                          }

                                          int var18 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                                          byte var27 = 0;
                                          classCU var36 = (classCU)classOF.method8404(classHA.method5953((byte)-96), var18, -1078884928);
                                          if (var36 != null) {
                                             if (var3 >= 6) {
                                                throw new IllegalStateException();
                                             }

                                             byte var63;
                                             if (classCU.field1286 != var36) {
                                                if (var3 >= 6) {
                                                   throw new IllegalStateException();
                                                }

                                                var63 = 1;
                                             } else {
                                                var63 = 0;
                                             }

                                             var27 = var63;
                                          }

                                          classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var27;
                                          return 1;
                                       }

                                       if (3217 != var0) {
                                          if (var3 >= 6) {
                                             throw new IllegalStateException();
                                          }

                                          if (3219 != var0) {
                                             if (var0 == 3220) {
                                                if (var3 >= 6) {
                                                   throw new IllegalStateException();
                                                }

                                                DynamicObject.field1679 -= 240082458;
                                                int var17 = classBB.field323[-324749371 * DynamicObject.field1679];
                                                int var26 = classBB.field323[DynamicObject.field1679 * -324749371 + 1];
                                                classBK.method1118(var17, var26, (byte)64);
                                                return 1;
                                             }

                                             if (3221 == var0) {
                                                if (var3 >= 6) {
                                                   throw new IllegalStateException();
                                                }

                                                DynamicObject.field1679 -= 720247374;
                                                int var16 = classBB.field323[DynamicObject.field1679 * -324749371];
                                                int var25 = classBB.field323[1 + DynamicObject.field1679 * -324749371];
                                                int var35 = classBB.field323[2 + DynamicObject.field1679 * -324749371];
                                                int var51 = classBB.field323[3 + DynamicObject.field1679 * -324749371];
                                                int var56 = classBB.field323[4 + DynamicObject.field1679 * -324749371];
                                                int var9 = classBB.field323[5 + -324749371 * DynamicObject.field1679];
                                                ArrayList var10 = new ArrayList();
                                                var10.add(var16);
                                                var10.add(var25);
                                                classRJ.method9998(var10, var35, var51, var56, var9, (byte)-47);
                                                return 1;
                                             }

                                             if (var0 == 3222) {
                                                DynamicObject.field1679 -= 480164916;
                                                int var15 = classBB.field323[-324749371 * DynamicObject.field1679];
                                                int var24 = classBB.field323[DynamicObject.field1679 * -324749371 + 1];
                                                int var34 = classBB.field323[2 + DynamicObject.field1679 * -324749371];
                                                int var50 = classBB.field323[3 + DynamicObject.field1679 * -324749371];
                                                classIM.method6224(var15, var24, var34, var50, -911761661);
                                                return 1;
                                             }

                                             if (var0 == 3228) {
                                                if (var3 >= 6) {
                                                   throw new IllegalStateException();
                                                }

                                                String var14 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
                                                String var23 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
                                                classED.method3832(var23, var14, -1880754552);
                                                return 1;
                                             }

                                             if (3229 == var0) {
                                                Projection.method5024((byte)-110);
                                                return 1;
                                             }

                                             return 2;
                                          }

                                          if (var3 >= 6) {
                                             throw new IllegalStateException();
                                          }
                                       }

                                       classCB var13 = classCB.field638;
                                       classCU var22 = classCU.field1286;
                                       byte var32 = -1;
                                       int var48 = -1;
                                       if (3217 == var0) {
                                          if (var3 >= 6) {
                                             throw new IllegalStateException();
                                          }

                                          int var8 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                                          var13 = (classCB)classOF.method8404(classAF.method335((byte)84), var8, 1436256516);
                                          if (null == var13) {
                                             if (var3 >= 6) {
                                                throw new IllegalStateException();
                                             }

                                             throw new RuntimeException(String.format("Unrecognized device option %d", var8));
                                          }
                                       }

                                       if (3219 == var0) {
                                          if (var3 >= 6) {
                                             throw new IllegalStateException();
                                          }

                                          int var53 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                                          var22 = (classCU)classOF.method8404(classHA.method5953((byte)-26), var53, -78090192);
                                          if (null == var22) {
                                             if (var3 >= 6) {
                                                throw new IllegalStateException();
                                             }

                                             throw new RuntimeException(String.format("Unrecognized game option %d", var53));
                                          }
                                       }

                                       if (classCU.field1286 == var22) {
                                          switch (var13.field648 * 611340289) {
                                             case 1:
                                             case 2:
                                             case 3:
                                                var32 = 0;
                                                var48 = 1;
                                                break;
                                             case 4:
                                                var32 = 0;
                                                var48 = Integer.MAX_VALUE;
                                                break;
                                             case 5:
                                                var32 = 0;
                                                var48 = 100;
                                                break;
                                             case 6:
                                                var32 = 25;
                                                var48 = 90;
                                                break;
                                             default:
                                                String var54 = String.format("Unkown device option: %s.", var13);
                                                throw new RuntimeException(var54);
                                          }
                                       } else {
                                          switch (321038383 * var22.field1292) {
                                             case 1:
                                                var32 = 0;
                                                var48 = 1;
                                                break;
                                             case 2:
                                             case 3:
                                             case 4:
                                                var32 = 0;
                                                var48 = 100;
                                                break;
                                             default:
                                                String var55 = String.format("Unkown game option: %s.", var22);
                                                throw new RuntimeException(var55);
                                          }
                                       }

                                       classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var32;
                                       classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var48;
                                       return 1;
                                    }
                                 }
                              }
                           }

                           classCB var12 = classCB.field638;
                           classCU var21 = classCU.field1286;
                           int var30 = 0;
                           if (var0 == 3214) {
                              if (var3 >= 6) {
                                 throw new IllegalStateException();
                              }

                              int var43 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                              var12 = (classCB)classOF.method8404(classAF.method335((byte)100), var43, -361613076);
                              if (null == var12) {
                                 if (var3 >= 6) {
                                    throw new IllegalStateException();
                                 }

                                 throw new RuntimeException(String.format("Unrecognized device option %d", var43));
                              }
                           }

                           if (3215 == var0) {
                              if (var3 >= 6) {
                                 throw new IllegalStateException();
                              }

                              int var44 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                              var21 = (classCU)classOF.method8404(classHA.method5953((byte)-10), var44, -718887939);
                              if (var21 == null) {
                                 throw new RuntimeException(String.format("Unrecognized game option %d", var44));
                              }
                           }

                           if (3210 == var0) {
                              if (var3 >= 6) {
                                 throw new IllegalStateException();
                              }

                              int var45 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                              var12 = (classCB)classOF.method8404(classAF.method335((byte)37), var45, 1772954155);
                              if (var12 == null) {
                                 if (var3 >= 6) {
                                    throw new IllegalStateException();
                                 }

                                 var21 = (classCU)classOF.method8404(classHA.method5953((byte)-73), var45, -1389643671);
                                 if (null == var21) {
                                    if (var3 >= 6) {
                                       throw new IllegalStateException();
                                    }

                                    throw new RuntimeException(String.format("Unrecognized client option %d", var45));
                                 }
                              }
                           } else if (var0 == 3182) {
                              if (var3 >= 6) {
                                 throw new IllegalStateException();
                              }

                              var12 = classCB.field643;
                           } else if (var0 == 3204) {
                              if (var3 >= 6) {
                                 throw new IllegalStateException();
                              }

                              var21 = classCU.field1290;
                           } else if (3206 == var0) {
                              if (var3 >= 6) {
                                 throw new IllegalStateException();
                              }

                              var21 = classCU.field1287;
                           } else if (3208 == var0) {
                              if (var3 >= 6) {
                                 throw new IllegalStateException();
                              }

                              var21 = classCU.field1289;
                           }

                           if (var21 == classCU.field1286) {
                              if (var3 >= 6) {
                                 throw new IllegalStateException();
                              }

                              switch (var12.field648 * 611340289) {
                                 case 1:
                                    byte var61;
                                    if (ClientPreferences.method2724(classAB.field122, (short)3944)) {
                                       if (var3 >= 6) {
                                          throw new IllegalStateException();
                                       }

                                       var61 = 1;
                                    } else {
                                       var61 = 0;
                                    }

                                    var30 = var61;
                                    break;
                                 case 2:
                                    byte var60;
                                    if (classAB.field122.method2732((byte)28)) {
                                       if (var3 >= 6) {
                                          throw new IllegalStateException();
                                       }

                                       var60 = 1;
                                    } else {
                                       var60 = 0;
                                    }

                                    var30 = var60;
                                    break;
                                 case 3:
                                    byte var59;
                                    if (classAB.field122.method2741(1218899916)) {
                                       if (var3 >= 6) {
                                          throw new IllegalStateException();
                                       }

                                       var59 = 1;
                                    } else {
                                       var59 = 0;
                                    }

                                    var30 = var59;
                                    break;
                                 case 4:
                                    var30 = classAB.field122.method2750(1229551124);
                                    break;
                                 case 5:
                                    var30 = Projectile.method1223(-576800219);
                                    break;
                                 case 6:
                                    var30 = classAB.field122.method2817((byte)0);
                                    break;
                                 case 7:
                                    var30 = (int)(classAB.field122.method2820(-1273549063) * 100.0F);
                                    break;
                                 case 8:
                                    byte var10000;
                                    if (ClientPreferences.method2824(classAB.field122, -1980786523)) {
                                       if (var3 >= 6) {
                                          throw new IllegalStateException();
                                       }

                                       var10000 = 1;
                                    } else {
                                       var10000 = 0;
                                    }

                                    var30 = var10000;
                                    break;
                                 default:
                                    String var46 = String.format("Unkown device option: %s.", var12);
                                    throw new RuntimeException(var46);
                              }
                           } else {
                              switch (var21.field1292 * 321038383) {
                                 case 1:
                                    byte var62;
                                    if (ClientPreferences.method2720(classAB.field122, -1315528093)) {
                                       if (var3 >= 6) {
                                          throw new IllegalStateException();
                                       }

                                       var62 = 1;
                                    } else {
                                       var62 = 0;
                                    }

                                    var30 = var62;
                                    break;
                                 case 2:
                                    var30 = classMH.method7572((byte)11);
                                    break;
                                 case 3:
                                    var30 = classCA.method1396(-1161877045);
                                    break;
                                 case 4:
                                    var30 = classEA.method3800((byte)-94);
                                    break;
                                 default:
                                    String var47 = String.format("Unkown game option: %s.", var21);
                                    throw new RuntimeException(var47);
                              }
                           }

                           classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var30;
                           return 1;
                        }

                        if (var3 >= 6) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }
            }

            classCB var4 = classCB.field638;
            classCU var5 = classCU.field1286;
            int var6 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            if (3212 == var0) {
               if (var3 >= 6) {
                  throw new IllegalStateException();
               }

               int var7 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               var4 = (classCB)classOF.method8404(classAF.method335((byte)30), var7, 618593499);
               if (var4 == null) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  throw new RuntimeException(String.format("Unrecognized device option %d", var7));
               }
            }

            if (var0 == 3213) {
               int var39 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               var5 = (classCU)classOF.method8404(classHA.method5953((byte)-92), var39, -39811946);
               if (var5 == null) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  throw new RuntimeException(String.format("Unrecognized game option %d", var39));
               }
            }

            if (3209 == var0) {
               int var40 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               var4 = (classCB)classOF.method8404(classAF.method335((byte)15), var40, -1129083438);
               if (var4 == null) {
                  var5 = (classCU)classOF.method8404(classHA.method5953((byte)11), var40, 501732863);
                  if (var5 == null) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     throw new RuntimeException(String.format("Unrecognized client option %d", var40));
                  }
               }
            } else if (var0 == 3181) {
               var4 = classCB.field643;
            } else if (3203 == var0) {
               if (var3 >= 6) {
                  throw new IllegalStateException();
               }

               var5 = classCU.field1290;
            } else if (var0 == 3205) {
               if (var3 >= 6) {
                  throw new IllegalStateException();
               }

               var5 = classCU.field1287;
            } else if (3207 == var0) {
               if (var3 >= 6) {
                  throw new IllegalStateException();
               }

               var5 = classCU.field1289;
            }

            if (classCU.field1286 == var5) {
               if (var3 >= 6) {
                  throw new IllegalStateException();
               }

               switch (var4.field648 * 611340289) {
                  case 1:
                     boolean var66;
                     if (1 == var6) {
                        if (var3 >= 6) {
                           throw new IllegalStateException();
                        }

                        var66 = true;
                     } else {
                        var66 = false;
                     }

                     classAB.field122.method2727(var66, -1640111913);
                     break;
                  case 2:
                     boolean var65;
                     if (var6 == 1) {
                        if (var3 >= 6) {
                           throw new IllegalStateException();
                        }

                        var65 = true;
                     } else {
                        var65 = false;
                     }

                     ClientPreferences.method2736(classAB.field122, var65, (byte)16);
                     break;
                  case 3:
                     boolean var64;
                     if (var6 == 1) {
                        if (var3 >= 6) {
                           throw new IllegalStateException();
                        }

                        var64 = true;
                     } else {
                        var64 = false;
                     }

                     classAB.field122.method2743(var64, (byte)3);
                     break;
                  case 4:
                     if (var6 < 0) {
                        if (var3 >= 6) {
                           throw new IllegalStateException();
                        }

                        var6 = 0;
                     }

                     ClientPreferences.method2752(classAB.field122, var6, (byte)12);
                     break;
                  case 5:
                     classBY.method1359(var6, (byte)0);
                     break;
                  case 6:
                     classAB.field122.method2812(var6, 1476941209);
                     break;
                  case 7:
                     classAB.field122.method2822(var6, 2044651245);
                     classEM.method3929((byte)-1);
                     break;
                  case 8:
                     boolean var10001;
                     if (var6 == 1) {
                        if (var3 >= 6) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     ClientPreferences.method2829(classAB.field122, var10001, -1353457148);
                     break;
                  default:
                     String var41 = String.format("Unkown device option: %s.", var4);
                     throw new RuntimeException(var41);
               }
            } else {
               switch (321038383 * var5.field1292) {
                  case 1:
                     boolean var67;
                     if (1 == var6) {
                        if (var3 >= 6) {
                           throw new IllegalStateException();
                        }

                        var67 = true;
                     } else {
                        var67 = false;
                     }

                     classAB.field122.method2721(var67, 2137048680);
                     break;
                  case 2:
                     ClientPreferences.method2765(classAB.field122, var6, 1222866659);
                     classKL.method6494(-1698036639);
                     break;
                  case 3:
                     ClientPreferences.method2774(classAB.field122, var6, -1335837787);
                     classGI.method5464(-1877463965);
                     break;
                  case 4:
                     classAB.field122.method2781(var6, (byte)34);
                     classDO.method3509((byte)117);
                     break;
                  default:
                     String var42 = String.format("Unkown game option: %s.", var5);
                     throw new RuntimeException(var42);
               }
            }

            return 1;
         }
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "ee.bt(" + 41);
      }
   }
}
