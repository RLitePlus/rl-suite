import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ef")
public class classEF {
   @ObfuscatedName("ae")
   int field1744;
   @ObfuscatedSignature(descriptor = "[Lsg;")
   @ObfuscatedName("af")
   classSG[] field1745;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final boolean field1748 = false;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field1746 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field1747 = 512;

   @ObfuscatedSignature(descriptor = "(IIILym;B)V")
   @ObfuscatedName("ax")
   static void method3867(int var0, int var1, int var2, SpritePixels var3, byte var4) {
      try {
         int var5 = 128 * var2;
         var5 += client.field994.method11454(1337910085);
         var5 &= 2047;
         byte var6 = 30;
         int var7 = var0 - (int)(classWW.method12631(var5, -2076197325) * var6);
         double var9 = classGP.method5548(var5, 1579021839) / 65536.0;
         int var11 = (int)(var9 * var6) + var1;
         int var12 = Math.max(var3.field7007, var3.field7009);
         int var13 = var12 / 2;
         int var15 = var7 - var13;
         int var16 = var11 - var13;
         int var17 = var3.field7007;
         int var18 = var3.field7009;
         int var19 = var3.field7007 / 2;
         int var20 = var3.field7009 / 2;
         int var22 = var5 & 2047;
         float var21 = (float)((Math.PI * 2) * (var22 / 2048.0F));
         var3.method13548(var15, var16, var17, var18, var19, var20, var21, 256);
      } catch (RuntimeException var23) {
         throw classEG.method3884(var23, "ef.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lef;I)Lsg;")
   @ObfuscatedName("it")
   public static classSG method3853(classEF var0, int var1) {
      if (var0 == null) {
         return var0.method3855(var1);
      } else {
         return var1 >= var0.method3850(-1925436490) ? null : var0.field1745[var1];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lef;Lsn;I[ZZ)V")
   @ObfuscatedName("ac")
   public static void method3866(classEF var0, classSN var1, int var2, boolean[] var3, boolean var4) {
      if (var0 == null) {
         var0.method3845();
      } else {
         int var5 = var1.method10516(372651847);
         int var6 = 0;
         classSG[] var7 = var0.method3860(-1148706420);

         for (int var8 = 0; var8 < var7.length; var8++) {
            classSG var9 = var7[var8];
            if (var3 == null || var3[var6] == var4) {
               var1.method10540(var2, var9, var6, var5, -732732242);
            }

            var6++;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lc")
   public void method3869() {
      for (int var1 = 0; var1 < this.field1744 * -2083016361; var1++) {
         for (classSG var5 : this.field1745) {
            var5.method10427(var1);
         }
      }

      for (int var6 = 0; var6 < this.field1744 * -2083016361; var6++) {
         for (classSG var10 : this.field1745) {
            var10.method10421(var6);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   public int method3850(int var1) {
      try {
         return this.field1745.length;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ef.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lsg;")
   @ObfuscatedName("vd")
   public classSG method3874(int var1) {
      return this.method3854(var1, (byte)95);
   }

   @ObfuscatedSignature(descriptor = "(IB)Lsg;")
   @ObfuscatedName("ae")
   public classSG method3854(int var1, byte var2) {
      try {
         if (var1 >= this.method3850(1353996394)) {
            if (var2 == 1) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return this.field1745[var1];
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ef.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lsg;")
   @ObfuscatedName("ad")
   public classSG method3855(int var1) {
      return var1 >= this.method3850(-1129027061) ? null : this.field1745[var1];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   void method3844() {
      classSG[] var1 = this.field1745;

      for (int var2 = 0; var2 < var1.length; var2++) {
         classSG var3 = var1[var2];
         if (1635126909 * var3.field5924 >= 0) {
            var3.field5929 = this.field1745[var3.field5924 * -1006780702];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;)V")
   @ObfuscatedName("kp")
   public static void method3868(Model var0) {
      if (var0.field2489 != 2) {
         var0.field2489 = 2;
         var0.field2491 = 0;

         for (int var1 = 0; var1 < var0.field2424; var1++) {
            int var2 = (int)var0.field2427[var1];
            int var3 = (int)var0.field2430[var1];
            int var4 = (int)var0.field2426[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > var0.field2491) {
               var0.field2491 = var5;
            }
         }

         var0.field2491 = (int)(Math.sqrt(var0.field2491) + 0.99);
         var0.field2490 = var0.field2491;
         var0.field2493 = var0.field2491 + var0.field2491;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   void method3845() {
      classSG[] var1 = this.field1745;

      for (int var2 = 0; var2 < var1.length; var2++) {
         classSG var3 = var1[var2];
         if (-521703669 * var3.field5924 >= 0) {
            var3.field5929 = this.field1745[var3.field5924 * -521703669];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsn;I)V")
   @ObfuscatedName("aw")
   public void method3861(classSN var1, int var2) {
      this.method3873(var1, var2, null, false, (byte)59);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   public int method3851() {
      return this.field1745.length;
   }

   @ObfuscatedSignature(descriptor = "(Lsn;I)V")
   @ObfuscatedName("av")
   public void method3862(classSN var1, int var2) {
      this.method3873(var1, var2, null, false, (byte)47);
   }

   @ObfuscatedSignature(descriptor = "(I)Lsg;")
   @ObfuscatedName("aq")
   public classSG method3856(int var1) {
      return var1 >= this.method3850(-1125212950) ? null : this.field1745[var1];
   }

   @ObfuscatedSignature(descriptor = "()[Lsg;")
   @ObfuscatedName("ai")
   classSG[] method3858() {
      return this.field1745;
   }

   @ObfuscatedSignature(descriptor = "()[Lsg;")
   @ObfuscatedName("au")
   classSG[] method3859() {
      return this.field1745;
   }

   @ObfuscatedSignature(descriptor = "(Lrl21;Lsn;I[ZZ)V")
   @ObfuscatedName("pc")
   public void method3871(rl21 var1, classSN var2, int var3, boolean[] var4, boolean var5) {
      int var6 = var2.field5992 * -1268206765;
      int var7 = 0;

      for (classSG var11 : this.field1745) {
         if (var4 == null || var5 == var4[var7]) {
            var2.method10538(var1, var3, var11, var7, var6);
         }

         var7++;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqr;)V")
   @ObfuscatedName("nu")
   public static void method3846(classQR var0) {
      if (var0 == null) {
         var0.method9745();
      }

      classQR.method9722(var0, -1, -2104827973);
   }

   @ObfuscatedSignature(descriptor = "(Ljs;Lyt;B)Ljl;")
   @ObfuscatedName("af")
   public static classJL method3849(classJS var0, classYT var1, byte var2) {
      try {
         classJL var3 = SceneTilePaint.method4793(2062869276);
         var3.field3342 = var0;
         var3.field3339 = -1950310809 * var0.field3371;
         if (-1669214905 * var3.field3339 == -1) {
            if (var2 == 80) {
               throw new IllegalStateException();
            }

            var3.field3343 = new PacketBuffer(260);
         } else if (-1669214905 * var3.field3339 == -2) {
            if (var2 == 80) {
               throw new IllegalStateException();
            }

            var3.field3343 = new PacketBuffer(10000);
         } else if (var3.field3339 * -1669214905 <= 18) {
            var3.field3343 = new PacketBuffer(20);
         } else if (var3.field3339 * -1669214905 <= 98) {
            if (var2 == 80) {
               throw new IllegalStateException();
            }

            var3.field3343 = new PacketBuffer(100);
         } else {
            var3.field3343 = new PacketBuffer(260);
         }

         var3.field3343.method12894(var1, -1178783538);
         var3.field3343.method12900(var3.field3342.field3372 * 484572505, (byte)-68);
         var3.field3335 = 0;
         return var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ef.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lef;I)V")
   @ObfuscatedName("ws")
   public static void method3847(classEF var0, int var1) {
      if (var0 == null) {
         var0.method3848(var1);
      }

      var0.method3872();

      try {
         classSG[] var2 = var0.field1745;

         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var1 <= 2130045616) {
               return;
            }

            classSG var4 = var2[var3];
            if (-521703669 * var4.field5924 >= 0) {
               if (var1 <= 2130045616) {
                  return;
               }

               var4.field5929 = var0.field1745[var4.field5924 * -521703669];
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ef.az(" + ')');
      }
   }

   classEF(classXY var1, int var2) {
      this.field1745 = new classSG[var2];
      this.field1744 = classXY.method13039(var1, -346779531) * -983578009;

      for (int var3 = 0; var3 < this.field1745.length; var3++) {
         classSG var4 = new classSG(-2083016361 * this.field1744, var1, false);
         this.field1745[var3] = var4;
      }

      method3847(this, 2142449012);
   }

   @ObfuscatedSignature(descriptor = "(Lsn;I)V")
   @ObfuscatedName("ak")
   public void method3863(classSN var1, int var2) {
      this.method3873(var1, var2, null, false, (byte)97);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dy")
   public int method3875() {
      return this.method3850(1786141898);
   }

   @ObfuscatedSignature(descriptor = "(Lsn;I[ZZB)V")
   @ObfuscatedName("as")
   void method3873(classSN var1, int var2, boolean[] var3, boolean var4, byte var5) {
      this.method3871(rl21.field5728, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(Lsn;I)V")
   @ObfuscatedName("at")
   public void method3864(classSN var1, int var2) {
      this.method3873(var1, var2, null, false, (byte)102);
   }

   @ObfuscatedSignature(descriptor = "(Lsn;II)V")
   @ObfuscatedName("ag")
   public void method3865(classSN var1, int var2, int var3) {
      try {
         this.method3873(var1, var2, null, false, (byte)116);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ef.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gu")
   public void method3872() {
      int var1 = 0;

      while (var1 < this.field1745.length) {
         this.field1745[var1].field5928 = var1++;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lsg;")
   @ObfuscatedName("ay")
   public classSG method3857(int var1) {
      return var1 >= this.method3850(-1009985795) ? null : this.field1745[var1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lef;)I")
   @ObfuscatedName("nc")
   public static int method3852(classEF var0) {
      if (var0 == null) {
         var0.method3859();
      }

      return var0.field1745.length;
   }

   @ObfuscatedSignature(descriptor = "(B)Lmh;")
   @ObfuscatedName("ax")
   public static classMH method3843(byte var0) {
      try {
         try {
            return new classMG();
         } catch (Throwable var2) {
            return new classMQ();
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ef.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Lsg;")
   @ObfuscatedName("ab")
   classSG[] method3860(int var1) {
      try {
         return this.field1745;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ef.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("bj")
   static int method3870(int var0, Script var1, boolean var2, int var3) {
      try {
         if (var0 == 3400) {
            if (var3 <= -1510882375) {
               throw new IllegalStateException();
            } else {
               DynamicObject.field1679 -= 240082458;
               int var11 = classBB.field323[-324749371 * DynamicObject.field1679];
               int var13 = classBB.field323[1 + DynamicObject.field1679 * -324749371];
               EnumComposition var14 = classKD.method6461(var11, 530175687);
               if (!var14.method8348('s', (byte)-6)) {
               }

               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var14.method8330(var13, -1652195152);
               return 1;
            }
         } else if (3408 == var0) {
            DynamicObject.field1679 -= 480164916;
            char var10 = (char)classBB.field323[DynamicObject.field1679 * -324749371];
            char var12 = (char)classBB.field323[1 + DynamicObject.field1679 * -324749371];
            int var6 = classBB.field323[-324749371 * DynamicObject.field1679 + 2];
            int var7 = classBB.field323[3 + DynamicObject.field1679 * -324749371];
            EnumComposition var8 = classKD.method6461(var6, 1708727636);
            if (EnumComposition.method8345(var8, var10, 1682366299)) {
               if (var3 <= -1510882375) {
                  throw new IllegalStateException();
               }

               if (var8.method8348(var12, (byte)-11)) {
                  if (var8.method8348('s', (byte)-5)) {
                     if (var3 <= -1510882375) {
                        throw new IllegalStateException();
                     }

                     classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var8.method8330(var7, -1652195152);
                  } else if (var8.method8348('Ï', (byte)-1)) {
                     classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = EnumComposition.method8341(var8, var7, -980214786);
                  } else {
                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var8.method8334(var7, -1739848449);
                  }

                  return 1;
               }

               if (var3 <= -1510882375) {
                  throw new IllegalStateException();
               }
            }

            if (var12 == 's') {
               if (var3 <= -1510882375) {
                  throw new IllegalStateException();
               }

               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = classKK.field3615;
            } else if (var12 == 207) {
               if (var3 <= -1510882375) {
                  throw new IllegalStateException();
               }

               classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = 0L;
            } else {
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3411) {
            if (var3 <= -1510882375) {
               throw new IllegalStateException();
            } else {
               int var4 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               EnumComposition var5 = classKD.method6461(var4, 697661822);
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var5.method8316(1033162533);
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "ef.bj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   void method3848(int var1) {
      this.method3869();

      try {
         classSG[] var2 = this.field1745;

         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var1 <= 2130045616) {
               return;
            }

            classSG var4 = var2[var3];
            if (-521703669 * var4.field5924 >= 0) {
               if (var1 <= 2130045616) {
                  return;
               }

               var4.field5929 = this.field1745[var4.field5924 * -521703669];
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ef.az(" + ')');
      }
   }
}
