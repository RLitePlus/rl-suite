import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qj")
public class classQJ {
   @ObfuscatedSignature(descriptor = "Lzv;")
   @ObfuscatedName("dy")
   static Font field5556;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field5553 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field5552 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field5554 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field5551 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5555 = 0;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIZLvv;Lqn;)V")
   @ObfuscatedName("ay")
   public static final void method9595(int var0, int var1, int var2, boolean var3, classVV var4, classQN var5) {
      if (classLY.method7381(var4, var0, 86941044)) {
         NpcOverrides.method9086(var4.field4440[var0], 0, var4.field4440[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, 89529466);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;II)V")
   @ObfuscatedName("ax")
   static void method9589(Widget var0, int var1, int var2) {
      if (var0.field4264 * 404669979 == 0) {
         var0.field4281 = var0.field4248 * 1865716123;
      } else if (1 == var0.field4264 * 404669979) {
         var0.field4281 = ((var1 - 1115597881 * var0.field4249) / 2 + 975005911 * var0.field4248) * 2084925661;
      } else if (var0.field4264 * 404669979 == 2) {
         var0.field4281 = (var1 - var0.field4249 * 1115597881 - var0.field4248 * 975005911) * 2084925661;
      } else if (404669979 * var0.field4264 == 3) {
         var0.field4281 = -1660995713 * (var1 * var0.field4248 * 975005911 >> 14);
      } else if (4 == var0.field4264 * 404669979) {
         var0.field4281 = 2084925661 * ((var1 - 1115597881 * var0.field4249) / 2 + (var0.field4248 * 975005911 * var1 >> 14));
      } else {
         var0.field4281 = (var1 - var0.field4249 * 809888925 - (var1 * var0.field4248 * 975005911 >> 14)) * -971911785;
      }

      if (0 == var0.field4250 * -509077693) {
         var0.field4257 = -160021231 * var0.field4285;
      } else if (923944517 * var0.field4250 == 1) {
         var0.field4257 = ((var2 - 756789066 * var0.field4259) / 2 + var0.field4285 * 1739436638) * -217131595;
      } else if (2 == var0.field4250 * -886589301) {
         var0.field4257 = (var2 - -1376338600 * var0.field4259 - -1383649640 * var0.field4285) * -217131595;
      } else if (3 == var0.field4250 * 505739073) {
         var0.field4257 = (var2 * -265516179 * var0.field4285 >> 14) * -217131595;
      } else if (4 == var0.field4250 * 167812812) {
         var0.field4257 = -217131595 * ((var2 * var0.field4285 * -265516179 >> 14) + (var2 - var0.field4259 * 293773697) / 2);
      } else {
         var0.field4257 = (var2 - var0.field4259 * 293773697 - (var2 * 2124445196 * var0.field4285 >> 14)) * -1938804695;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;II)V")
   @ObfuscatedName("ac")
   static void method9590(Widget var0, int var1, int var2) {
      if (var0.field4264 * 404669979 == 0) {
         var0.field4281 = var0.field4248 * 1865716123;
      } else if (1 == var0.field4264 * 404669979) {
         var0.field4281 = ((var1 - 1115597881 * var0.field4249) / 2 + 975005911 * var0.field4248) * 2084925661;
      } else if (var0.field4264 * 404669979 == 2) {
         var0.field4281 = (var1 - var0.field4249 * 1115597881 - var0.field4248 * 975005911) * 2084925661;
      } else if (404669979 * var0.field4264 == 3) {
         var0.field4281 = 2084925661 * (var1 * var0.field4248 * 975005911 >> 14);
      } else if (4 == var0.field4264 * 404669979) {
         var0.field4281 = 2084925661 * ((var1 - 1115597881 * var0.field4249) / 2 + (var0.field4248 * 975005911 * var1 >> 14));
      } else {
         var0.field4281 = (var1 - var0.field4249 * 1115597881 - (var1 * var0.field4248 * 975005911 >> 14)) * 2084925661;
      }

      if (0 == var0.field4250 * 923944517) {
         var0.field4257 = -160021231 * var0.field4285;
      } else if (923944517 * var0.field4250 == 1) {
         var0.field4257 = ((var2 - 293773697 * var0.field4259) / 2 + var0.field4285 * -265516179) * -217131595;
      } else if (2 == var0.field4250 * 923944517) {
         var0.field4257 = (var2 - 293773697 * var0.field4259 - -265516179 * var0.field4285) * -217131595;
      } else if (3 == var0.field4250 * 923944517) {
         var0.field4257 = (var2 * -265516179 * var0.field4285 >> 14) * -217131595;
      } else if (4 == var0.field4250 * 923944517) {
         var0.field4257 = -217131595 * ((var2 * var0.field4285 * -265516179 >> 14) + (var2 - var0.field4259 * 293773697) / 2);
      } else {
         var0.field4257 = (var2 - var0.field4259 * 293773697 - (var2 * -265516179 * var0.field4285 >> 14)) * -217131595;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Llw;Llw;ZLvv;Lqn;)V")
   @ObfuscatedName("ao")
   public static void method9591(Widget[] var0, Widget var1, boolean var2, classVV var3, classQN var4) {
      int var5 = 0 != -842862191 * var1.field4258 ? var1.field4258 * -842862191 : var1.field4249 * 1115597881;
      int var6 = 0 != var1.field4269 * -714521463 ? var1.field4269 * -714521463 : 293773697 * var1.field4259;
      NpcOverrides.method9086(
         var0,
         -1210177335 * var1.field4265,
         var1.field4266 * 379541057,
         var1.field4329 * -1163656551,
         63131743 * var1.field4260,
         var5,
         var6,
         var2,
         var3,
         var4,
         -1268064996
      );
      if (var1.field4340 != null) {
         NpcOverrides.method9086(var1.field4340, 0, var1.field4340.length - 1, var1.field4329 * -1163656551, -1, var5, var6, var2, var3, var4, 2009634398);
      }

      if (-1 == var1.field4260 * 63131743) {
         InterfaceParent var7 = (InterfaceParent)var3.field6613.method13363(var1.field4329 * -1163656551);
         if (null != var7) {
            classCN.method2551(2023647411 * var7.field5276, var5, var6, var2, var3, var4, (short)217);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;IILvv;Lqn;)V")
   @ObfuscatedName("ak")
   public static void method9600(Widget var0, int var1, int var2, classVV var3, classQN var4) {
      Widget var7 = -909423634 * var0.field4342 == -1 ? null : classLY.method7378(var3, var0.field4342 * -478101822, 2016824861 * var0.field4263, (byte)-5);
      int var5;
      int var6;
      if (null == var7) {
         var5 = var1;
         var6 = var2;
      } else {
         var5 = 1115597881 * var7.field4249;
         var6 = 293773697 * var7.field4259;
      }

      classPF.method8855(var0, var5, var6, false, var3, var4, (short)22083);
      classMP.method7637(var0, var5, var6, (short)-9936);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Llw;Llw;ZLvv;Lqn;)V")
   @ObfuscatedName("al")
   public static void method9592(Widget[] var0, Widget var1, boolean var2, classVV var3, classQN var4) {
      int var5 = 0 != -842862191 * var1.field4258 ? var1.field4258 * -842862191 : var1.field4249 * 1115597881;
      int var6 = 0 != var1.field4269 * -714521463 ? var1.field4269 * -310120473 : 293773697 * var1.field4259;
      NpcOverrides.method9086(
         var0,
         -1210177335 * var1.field4265,
         var1.field4266 * 379541057,
         var1.field4329 * 1811133811,
         191606210 * var1.field4260,
         var5,
         var6,
         var2,
         var3,
         var4,
         1459022313
      );
      if (var1.field4340 != null) {
         NpcOverrides.method9086(var1.field4340, 0, var1.field4340.length - 1, var1.field4329 * 717548062, -1, var5, var6, var2, var3, var4, 1079330564);
      }

      if (-1 == var1.field4260 * 63131743) {
         InterfaceParent var7 = (InterfaceParent)var3.field6613.method13363(var1.field4329 * -1163656551);
         if (null != var7) {
            classCN.method2551(2023647411 * var7.field5276, var5, var6, var2, var3, var4, (short)217);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Llw;Llw;ZLvv;Lqn;)V")
   @ObfuscatedName("aj")
   public static void method9593(Widget[] var0, Widget var1, boolean var2, classVV var3, classQN var4) {
      int var5 = 0 != -842862191 * var1.field4258 ? var1.field4258 * -830104041 : var1.field4249 * -1553168507;
      int var6 = 0 != var1.field4269 * 116646377 ? var1.field4269 * -714521463 : 293773697 * var1.field4259;
      NpcOverrides.method9086(
         var0,
         -1210177335 * var1.field4265,
         var1.field4266 * 379541057,
         var1.field4329 * -1163656551,
         63131743 * var1.field4260,
         var5,
         var6,
         var2,
         var3,
         var4,
         -308417689
      );
      if (var1.field4340 != null) {
         NpcOverrides.method9086(var1.field4340, 0, var1.field4340.length - 1, var1.field4329 * -1163656551, -1, var5, var6, var2, var3, var4, 352853704);
      }

      if (-1 == var1.field4260 * 63131743) {
         InterfaceParent var7 = (InterfaceParent)var3.field6613.method13363(var1.field4329 * -1163656551);
         if (null != var7) {
            classCN.method2551(1570138223 * var7.field5276, var5, var6, var2, var3, var4, (short)217);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;IILvv;Lqn;)V")
   @ObfuscatedName("ai")
   public static void method9601(Widget var0, int var1, int var2, classVV var3, classQN var4) {
      Widget var7 = 248872571 * var0.field4342 == -1 ? null : classLY.method7378(var3, var0.field4342 * -856575753, 653784551 * var0.field4263, (byte)-4);
      int var5;
      int var6;
      if (null == var7) {
         var5 = var1;
         var6 = var2;
      } else {
         var5 = 1115597881 * var7.field4249;
         var6 = 293773697 * var7.field4259;
      }

      classPF.method8855(var0, var5, var6, false, var3, var4, (short)1248);
      classMP.method7637(var0, var5, var6, (short)-5554);
   }

   classQJ() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Llw;IIIIIIZLvv;Lqn;)V")
   @ObfuscatedName("ad")
   static void method9597(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, classVV var8, classQN var9) {
      for (int var10 = var1; var10 <= var2; var10++) {
         Widget var11 = var0[var10];
         if (null != var11 && var3 == var11.field4342 * -716551276 && var11.field4263 * 653784551 == var4) {
            classPF.method8855(var11, var5, var6, var7, var8, var9, (short)14528);
            classMP.method7637(var11, var5, var6, (short)332);
            if (-34809441 * var11.field4341 > -842862191 * var11.field4258 - var11.field4249 * -1371604208) {
               var11.field4341 = var11.field4258 * 1768404891 - var11.field4249 * 34426095;
            }

            if (-719909924 * var11.field4341 < 0) {
               var11.field4341 = 0;
            }

            if (-41424189 * var11.field4331 > -714521463 * var11.field4269 - 486711901 * var11.field4259) {
               var11.field4331 = var11.field4269 * -1471306045 - var11.field4259 * -1285287941;
            }

            if (var11.field4331 * -41424189 < 0) {
               var11.field4331 = 0;
            }

            if (0 == var11.field4375 * -1510882375) {
               classFC.method4586(var0, var11, var7, var8, var9, 1912113233);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Llw;IIIIIIZLvv;Lqn;)V")
   @ObfuscatedName("ap")
   static void method9598(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, classVV var8, classQN var9) {
      for (int var10 = var1; var10 <= var2; var10++) {
         Widget var11 = var0[var10];
         if (null != var11 && var3 == var11.field4342 * -1502647899 && var11.field4263 * 653784551 == var4) {
            classPF.method8855(var11, var5, var6, var7, var8, var9, (short)26034);
            classMP.method7637(var11, var5, var6, (short)22934);
            if (-34809441 * var11.field4341 > -842862191 * var11.field4258 - var11.field4249 * 1115597881) {
               var11.field4341 = var11.field4258 * -1437415729 - var11.field4249 * 2134006567;
            }

            if (-34809441 * var11.field4341 < 0) {
               var11.field4341 = 0;
            }

            if (-41424189 * var11.field4331 > -714521463 * var11.field4269 - 293773697 * var11.field4259) {
               var11.field4331 = var11.field4269 * -1471306045 - var11.field4259 * 577918571;
            }

            if (var11.field4331 * -41424189 < 0) {
               var11.field4331 = 0;
            }

            if (0 == var11.field4375 * -1510882375) {
               classFC.method4586(var0, var11, var7, var8, var9, 1811398035);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIZLvv;Lqn;)V")
   @ObfuscatedName("aq")
   public static final void method9596(int var0, int var1, int var2, boolean var3, classVV var4, classQN var5) {
      if (classLY.method7381(var4, var0, 385344700)) {
         NpcOverrides.method9086(var4.field4440[var0], 0, var4.field4440[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, -1462097090);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Llw;IIIIIIZLvv;Lqn;)V")
   @ObfuscatedName("au")
   static void method9599(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, classVV var8, classQN var9) {
      for (int var10 = var1; var10 <= var2; var10++) {
         Widget var11 = var0[var10];
         if (null != var11 && var3 == var11.field4342 * -1150603767 && var11.field4263 * 653784551 == var4) {
            classPF.method8855(var11, var5, var6, var7, var8, var9, (short)24265);
            classMP.method7637(var11, var5, var6, (short)-3808);
            if (-34809441 * var11.field4341 > -842862191 * var11.field4258 - var11.field4249 * 1115597881) {
               var11.field4341 = var11.field4258 * -1437415729 - var11.field4249 * 1772967146;
            }

            if (-34809441 * var11.field4341 < 0) {
               var11.field4341 = 0;
            }

            if (-41424189 * var11.field4331 > 356496339 * var11.field4269 - 1060537044 * var11.field4259) {
               var11.field4331 = var11.field4269 * 3989595 - var11.field4259 * 1962645609;
            }

            if (var11.field4331 * -498312712 < 0) {
               var11.field4331 = 0;
            }

            if (0 == var11.field4375 * 83795560) {
               classFC.method4586(var0, var11, var7, var8, var9, -1053530060);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;IILvv;Lqn;)V")
   @ObfuscatedName("ar")
   public static void method9602(Widget var0, int var1, int var2, classVV var3, classQN var4) {
      Widget var7 = -1502647899 * var0.field4342 == -1 ? null : classLY.method7378(var3, var0.field4342 * -1502647899, 653784551 * var0.field4263, (byte)11);
      int var5;
      int var6;
      if (null == var7) {
         var5 = var1;
         var6 = var2;
      } else {
         var5 = 1115597881 * var7.field4249;
         var6 = 293773697 * var7.field4259;
      }

      classPF.method8855(var0, var5, var6, false, var3, var4, (short)13293);
      classMP.method7637(var0, var5, var6, (short)12524);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;IILvv;Lqn;)V")
   @ObfuscatedName("aw")
   public static void method9603(Widget var0, int var1, int var2, classVV var3, classQN var4) {
      Widget var7 = -1502647899 * var0.field4342 == -1 ? null : classLY.method7378(var3, var0.field4342 * -1502647899, 653784551 * var0.field4263, (byte)-4);
      int var5;
      int var6;
      if (null == var7) {
         var5 = var1;
         var6 = var2;
      } else {
         var5 = 1115597881 * var7.field4249;
         var6 = 293773697 * var7.field4259;
      }

      classPF.method8855(var0, var5, var6, false, var3, var4, (short)12794);
      classMP.method7637(var0, var5, var6, (short)-5490);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Llw;Llw;ZLvv;Lqn;)V")
   @ObfuscatedName("aa")
   public static void method9594(Widget[] var0, Widget var1, boolean var2, classVV var3, classQN var4) {
      int var5 = 0 != -842862191 * var1.field4258 ? var1.field4258 * -575357088 : var1.field4249 * -1091980940;
      int var6 = 0 != var1.field4269 * 471229635 ? var1.field4269 * 1493963055 : 293773697 * var1.field4259;
      NpcOverrides.method9086(
         var0,
         -1210177335 * var1.field4265,
         var1.field4266 * -1237567304,
         var1.field4329 * -1163656551,
         -444028231 * var1.field4260,
         var5,
         var6,
         var2,
         var3,
         var4,
         -284260935
      );
      if (var1.field4340 != null) {
         NpcOverrides.method9086(var1.field4340, 0, var1.field4340.length - 1, var1.field4329 * 1130601558, -1, var5, var6, var2, var3, var4, -1617013585);
      }

      if (-1 == var1.field4260 * 63131743) {
         InterfaceParent var7 = (InterfaceParent)var3.field6613.method13363(var1.field4329 * 1646553316);
         if (null != var7) {
            classCN.method2551(1674702933 * var7.field5276, var5, var6, var2, var3, var4, (short)217);
         }
      }
   }
}
