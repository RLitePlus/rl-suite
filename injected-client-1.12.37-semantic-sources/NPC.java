import java.awt.Polygon;
import java.awt.Shape;
import javax.annotation.Nullable;
import net.runelite.api.Perspective;
import net.runelite.api.events.NpcChanged;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dn")
public final class NPC extends Actor implements net.runelite.api.NPC {
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field1577 = 33;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final float field1574 = 0.01F;
   @ObfuscatedName("ac")
   String field1571;
   @ObfuscatedName("ab")
   static int field1572 = 1703859013;
   @ObfuscatedName("ag")
   static int field1573 = 1679619839;
   @ObfuscatedSignature(descriptor = "Lpl;")
   @ObfuscatedName("as")
   classPL definition;
   @ObfuscatedName("ax")
   boolean field1569 = false;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field1575 = -5;
   @ObfuscatedName("aa")
   int field1570;
   @ObfuscatedSignature(descriptor = "Lyx;")
   @ObfuscatedName("ao")
   classYX npcOverheadIcons;
   @ToRemove(unused = "true")
   @ObfuscatedName("bc")
   public static final int field1579 = 27;
   @ObfuscatedSignature(descriptor = "Lpp;")
   @ObfuscatedName("al")
   NpcOverrides field1583;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field1578 = 31;
   @ObfuscatedSignature(descriptor = "Lpp;")
   @ObfuscatedName("aj")
   NpcOverrides field1582;
   @ObfuscatedSignature(descriptor = "Llc;")
   @ObfuscatedName("ad")
   PlayerComposition field1580;
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("ha")
   static classVP field1584;
   @ObfuscatedName("ay")
   boolean field1586;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field1576 = 54;
   @ObfuscatedSignature(descriptor = "Lfl;")
   @ObfuscatedName("aq")
   final classFL field1568;

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("al")
   int[] method3460(int var1) {
      try {
         if (this.npcOverheadIcons != null) {
            if (var1 >= -977573417) {
               throw new IllegalStateException();
            } else {
               return this.npcOverheadIcons.method13766(1894471617);
            }
         } else {
            return this.definition.method8974((byte)3);
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dn.al(" + ')');
      }
   }

   @Override
   public Polygon getCanvasTilePoly() {
      classPL var1 = this.method3497();
      if (var1 == null) {
         return null;
      } else {
         int var2 = var1.getSize();
         return Perspective.getCanvasTileAreaPoly(classOE.field4843, this.getLocalLocation(), var2);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfl;")
   @ObfuscatedName("cx")
   @Override
   public classFL vmethod270() {
      return this.field1586 ? this.method3492((byte)-87) : null;
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ax")
   boolean method3445(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 == 1142231971) {
               throw new IllegalStateException();
            }

            if (var1 <= 4) {
               boolean var10000;
               if ((-792802207 * this.field1570 & 1 << var1) != 0) {
                  if (var2 == 1142231971) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               return var10000;
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dn.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIS)V")
   @ObfuscatedName("co")
   void method3465(int var1, int var2, short var3) {
      if (null == this.npcOverheadIcons) {
         this.npcOverheadIcons = new classYX(this.definition);
      }

      this.npcOverheadIcons.method13769(var1, var2, var3, -1871315217);
   }

   @ObfuscatedSignature(descriptor = "(ILgt;I)V")
   @ObfuscatedName("aa")
   final void method3452(int var1, classGT var2, int var3) {
      try {
         int var4 = this.field1474[0];
         int var5 = this.field1433[0];
         if (0 == var1) {
            if (var3 == -17325597) {
               return;
            }

            var4--;
            var5++;
         }

         if (1 == var1) {
            if (var3 == -17325597) {
               throw new IllegalStateException();
            }

            var5++;
         }

         if (2 == var1) {
            var4++;
            var5++;
         }

         if (var1 == 3) {
            if (var3 == -17325597) {
               throw new IllegalStateException();
            }

            var4--;
         }

         if (var1 == 4) {
            if (var3 == -17325597) {
               throw new IllegalStateException();
            }

            var4++;
         }

         if (5 == var1) {
            if (var3 == -17325597) {
               throw new IllegalStateException();
            }

            var4--;
            var5--;
         }

         if (6 == var1) {
            if (var3 == -17325597) {
               return;
            }

            var5--;
         }

         if (7 == var1) {
            var4++;
            var5--;
         }

         if (this.field1465.method9726(374233424)) {
            if (var3 == -17325597) {
               return;
            }

            if (this.field1465.method9731((byte)67).field5119 * 221400229 == 1) {
               if (var3 == -17325597) {
                  return;
               }

               Actor.method3101(this, 1870015014);
            }
         }

         Actor.method3111(this, var4, var5, var2, -1015799936);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "dn.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZB)V")
   @ObfuscatedName("ao")
   final void method3457(int var1, int var2, boolean var3, byte var4) {
      try {
         if (this.field1465.method9726(374233424)) {
            if (var4 == 0) {
               throw new IllegalStateException();
            }

            if (this.field1465.method9731((byte)119).field5119 * 221400229 == 1) {
               if (var4 == 0) {
                  throw new IllegalStateException();
               }

               Actor.method3101(this, -806296543);
            }
         }

         if (!var3) {
            if (var4 == 0) {
               return;
            }

            int var5 = var1 - this.field1474[0];
            int var6 = var2 - this.field1433[0];
            if (var5 >= -8) {
               if (var4 == 0) {
                  return;
               }

               if (var5 <= 8) {
                  if (var4 == 0) {
                     throw new IllegalStateException();
                  }

                  if (var6 >= -8) {
                     if (var4 == 0) {
                        throw new IllegalStateException();
                     }

                     if (var6 <= 8) {
                        if (var4 == 0) {
                           throw new IllegalStateException();
                        }

                        Actor.method3111(this, var1, var2, classGT.field2680, -638911196);
                        return;
                     }
                  }
               }
            }
         }

         this.method3113(var1, var2, 527441438);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "dn.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldn;I)V")
   @ObfuscatedName("ir")
   public static void method3473(NPC var0, int var1) {
      if (var0 == null) {
         var0.method3475(var1);
      }

      try {
         var0.npcOverheadIcons = null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dn.am(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldn;)Lfl;")
   @ObfuscatedName("iq")
   public static classFL method3491(NPC var0) {
      int var1 = var0.definition.method8989(-52154858);
      classFL var2 = var0.field1568;
      byte var3 = classGK.method5471(var1, -1864703506);
      byte var4 = classGK.method5472(var1, -1665176581);
      byte var5 = (byte)(var1 & 127);
      classFL.method4832(var2, var3, var4, var5, (byte)926264651);
      return var0.field1568;
   }

   public int[] getOverheadArchiveIds() {
      if (this.npcOverheadIcons != null) {
         return (int[])this.npcOverheadIcons.field7106.clone();
      } else {
         classPL var1 = this.method3497();
         return var1 != null && var1.field5330 != null ? (int[])var1.field5330.clone() : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldn;I)[S")
   @ObfuscatedName("hj")
   public static short[] method3462(NPC var0, int var1) {
      if (var0 == null) {
         var0.method3464(var1);
      }

      try {
         if (null != var0.npcOverheadIcons) {
            if (var1 <= 702114061) {
               throw new IllegalStateException();
            } else {
               return var0.npcOverheadIcons.method13767(-1378357);
            }
         } else {
            return var0.definition.method8981(-240101723);
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dn.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("bn")
   @Override
   final boolean vmethod262(byte var1) {
      try {
         return null != this.definition;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dn.bn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[S")
   @ObfuscatedName("cd")
   short[] method3463() {
      return null != this.npcOverheadIcons ? this.npcOverheadIcons.method13767(-761591449) : this.definition.method8981(-559014387);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("eg")
   @Override
   boolean vmethod377(int var1) {
      try {
         return this.definition.field5313;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dn.eg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("as")
   void method3439(int var1, byte var2) {
      try {
         this.field1570 = 937220001 * var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dn.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ly")
   void method3489() {
      this.field1582 = null;
      this.field1580 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldn;I)Z")
   @ObfuscatedName("qx")
   public static boolean method3446(NPC var0, int var1) {
      if (var0 == null) {
         var0.vmethod270();
      }

      return var1 >= 0 && var1 <= 4 ? (-792802207 * var0.field1570 & 1 << var1) != 0 : true;
   }

   @ObfuscatedSignature(descriptor = "(Ldn;B)Lpp;")
   @ObfuscatedName("vq")
   public static NpcOverrides method3476(NPC var0, byte var1) {
      if (var0 == null) {
         var0.method3479(var1);
      }

      try {
         return var0.field1583;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dn.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpp;S)V")
   @ObfuscatedName("bc")
   void method3485(NpcOverrides var1, short var2) {
      try {
         this.field1582 = var1;
         if (var1.field5373) {
            if (var2 <= 357) {
               throw new IllegalStateException();
            }

            if (null == this.field1580) {
               if (var2 <= 357) {
                  throw new IllegalStateException();
               }

               this.field1580 = new PlayerComposition();
            }

            int[] var3 = new int[5];
            if (null != var1.field5375) {
               if (var2 <= 357) {
                  throw new IllegalStateException();
               }

               for (int var4 = 0; var4 < 5; var4++) {
                  if (var2 <= 357) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = var1.field5375[var4];
               }
            }

            this.field1580.method6673(var1.field5379, var1.field5374, null, false, var3, 1836325209 * var1.field5372, -1, 0, -1798890011);
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "dn.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bk")
   void method3486(int var1) {
      try {
         this.field1583 = null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dn.bk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bo")
   void method3490(int var1) {
      try {
         this.field1582 = null;
         this.field1580 = null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dn.bo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("es")
   @Override
   int vmethod373(int var1) {
      try {
         int var10000;
         if (-1 == 182527809 * this.definition.field5288) {
            if (var1 != 1468278006) {
               throw new IllegalStateException();
            }

            var10000 = this.field1470 * -1576740359;
         } else {
            var10000 = this.definition.field5288 * 182527809;
         }

         return var10000 + this.vmethod98(436160785);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dn.es(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bp")
   @Override
   int vmethod267(int var1) {
      try {
         int var10000;
         if (this.method3170(-921463806)) {
            if (var1 != -1423776655) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = classPL.method8986(this.definition, 1363929196);
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dn.bp(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("il")
   @Override
   boolean vmethod379() {
      return this.definition.field5313;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;")
   @ObfuscatedName("az")
   public static String method3435(CharSequence var0, byte var1) {
      try {
         int var2 = var0.length();
         StringBuilder var3 = new StringBuilder(var2);

         for (int var4 = 0; var4 < var2; var4++) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            char var5;
            label115: {
               var5 = var0.charAt(var4);
               if (var5 >= 'a') {
                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= 'z') {
                     break label115;
                  }

                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 >= 'A') {
                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= 'Z') {
                     break label115;
                  }

                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 >= '0') {
                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= '9') {
                     break label115;
                  }

                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 != '.') {
                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var5 != '-') {
                     if (var1 <= 0) {
                        throw new IllegalStateException();
                     }

                     if ('*' != var5) {
                        if (var1 <= 0) {
                           throw new IllegalStateException();
                        }

                        if ('_' != var5) {
                           if (var5 == ' ') {
                              if (var1 <= 0) {
                                 throw new IllegalStateException();
                              }

                              var3.append('+');
                           } else {
                              byte var6 = classOG.method8434(var5, (byte)35);
                              var3.append('%');
                              int var7 = var6 >> 4 & 15;
                              if (var7 >= 10) {
                                 if (var1 <= 0) {
                                    throw new IllegalStateException();
                                 }

                                 var3.append((char)(55 + var7));
                              } else {
                                 var3.append((char)(48 + var7));
                              }

                              var7 = var6 & 15;
                              if (var7 >= 10) {
                                 var3.append((char)(55 + var7));
                              } else {
                                 var3.append((char)(48 + var7));
                              }
                           }
                           continue;
                        }

                        if (var1 <= 0) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }
            }

            var3.append(var5);
         }

         return var3.toString();
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "dn.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldn;I)V")
   @ObfuscatedName("nf")
   public static void method3440(NPC var0, int var1) {
      if (var0 == null) {
         var0.method3444(var1);
      } else {
         var0.field1570 = 937220001 * var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("bm")
   @Override
   public float vmethod276(int var1) {
      try {
         if (this.field1586) {
            if (var1 <= 1658477188) {
               throw new IllegalStateException();
            } else {
               return 0.01F;
            }
         } else {
            return 1.0F;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dn.bm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bt")
   @Override
   public int vmethod278(int var1) {
      try {
         return this.field1586 ? -5 : 0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dn.bt(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lfz;")
   @ObfuscatedName("bg")
   @Override
   protected classFZ vmethod260(byte var1) {
      try {
         if (null != this.field1582) {
            if (var1 <= 4) {
               throw new IllegalStateException();
            }

            if (this.field1582.field5373) {
               return classFZ.field2517;
            }
         }

         classFZ var10000;
         if (!this.definition.field5334) {
            if (var1 <= 4) {
               throw new IllegalStateException();
            }

            var10000 = classFZ.field2517;
         } else {
            var10000 = super.vmethod260((byte)106);
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dn.bg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIS)V")
   @ObfuscatedName("cy")
   void method3466(int var1, int var2, short var3) {
      if (null == this.npcOverheadIcons) {
         this.npcOverheadIcons = new classYX(this.definition);
      }

      this.npcOverheadIcons.method13769(var1, var2, var3, -1871315217);
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ap")
   @Override
   protected final Model vmethod92() {
      if (this.definition == null) {
         return null;
      } else {
         classQR var1 = this.method3175(-957600076);
         classQR var2 = this.method3177(var1, 387169795);
         if (null == var1 && var2 == null) {
            var2 = this.field1466;
            if (classQR.method9763(this.field1466, 30, -1418022292)) {
               return null;
            }
         }

         SequenceDefinition var3 = null == var1 ? null : var1.method9731((byte)126);
         SequenceDefinition var4 = null == var2 ? null : var2.method9731((byte)75);
         int var5 = null == var1 ? -1 : var1.method9738(1973948872);
         int var6 = var2 == null ? -1 : var2.method9738(1690202925);
         Model var7 = null;
         if (null != this.field1582) {
            if (this.field1582.field5377) {
               Player var8 = classMB.method7521(290261570);
               if (null != var8) {
                  var7 = var8.field1285.method6701(var3, var5, var4, var6, (byte)1);
               }
            } else if (this.field1582.field5373) {
               if (this.field1580 != null) {
                  var7 = this.field1580.method6701(var3, var5, var4, var6, (byte)1);
               }
            } else {
               var7 = this.definition.method8942(var3, var5, var4, var6, this.field1582, -766186715);
            }
         } else {
            var7 = this.definition.method8942(var3, var5, var4, var6, this.field1582, -1091059971);
         }

         if (var7 == null) {
            return null;
         } else {
            var7.method5230();
            this.field1470 = 2010593719 * var7.field1743;
            int var9 = var7.field2419;
            if (1 == -1325375202 * this.definition.field5284) {
               var7.field2421 = true;
            }

            if (Actor.method3180(this, -1831794059)) {
               var7.method5205(this.field1435, (short)var9);
            } else {
               classQG.method9520(var7);
            }

            var7.method5200(null != this.field1477 ? classUD.method11268(this.field1477, client.field855 * 1612595797) : 0);
            if (this.field1586) {
               var7.method5205(this.method3492((byte)-45), (short)var7.field2419);
               var7.method5227(0.01F);
               var7.method5232(-2143705616);
            }

            return var7;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("cz")
   public Model method3499() {
      NPC var1 = this;
      int var2 = -891174633;

      try {
         Model var10000;
         if (var1.definition == null) {
            if (var2 <= -1767431455) {
               throw new IllegalStateException();
            }

            Object var12 = null;
            var10000 = (Model)var12;
         } else {
            classQR var3 = var1.method3175(-384373404);
            classQR var4 = var1.method3177(var3, -1714817131);
            if (null == var3) {
               if (var2 <= -1767431455) {
                  throw new IllegalStateException();
               }

               if (var4 == null) {
                  if (var2 <= -1767431455) {
                     throw new IllegalStateException();
                  }

                  var4 = var1.field1466;
                  if (classQR.method9763(var1.field1466, 30, -1980368678)) {
                     if (var2 <= -1767431455) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }
               }
            }

            SequenceDefinition var16;
            if (null == var3) {
               if (var2 <= -1767431455) {
                  throw new IllegalStateException();
               }

               var16 = null;
            } else {
               var16 = var3.method9731((byte)89);
            }

            SequenceDefinition var5 = var16;
            SequenceDefinition var17;
            if (null == var4) {
               if (var2 <= -1767431455) {
                  throw new IllegalStateException();
               }

               var17 = null;
            } else {
               var17 = var4.method9731((byte)49);
            }

            SequenceDefinition var6 = var17;
            int var7 = null == var3 ? -1 : var3.method9738(1876575022);
            int var18;
            if (var4 == null) {
               if (var2 <= -1767431455) {
                  throw new IllegalStateException();
               }

               var18 = -1;
            } else {
               var18 = var4.method9738(2130609443);
            }

            int var8 = var18;
            Model var9 = null;
            if (null != var1.field1582) {
               if (var2 <= -1767431455) {
                  throw new IllegalStateException();
               }

               if (var1.field1582.field5377) {
                  if (var2 <= -1767431455) {
                     throw new IllegalStateException();
                  }

                  Player var10 = classMB.method7521(1134144035);
                  if (null != var10) {
                     if (var2 <= -1767431455) {
                        throw new IllegalStateException();
                     }

                     var9 = var10.field1285.method6701(var5, var7, var6, var8, (byte)1);
                  }
               } else if (var1.field1582.field5373) {
                  if (var2 <= -1767431455) {
                     throw new IllegalStateException();
                  }

                  if (var1.field1580 != null) {
                     if (var2 <= -1767431455) {
                        throw new IllegalStateException();
                     }

                     var9 = var1.field1580.method6701(var5, var7, var6, var8, (byte)1);
                  }
               } else {
                  var9 = var1.definition.method8942(var5, var7, var6, var8, var1.field1582, -1812942431);
               }
            } else {
               var9 = var1.definition.method8942(var5, var7, var6, var8, var1.field1582, -308934681);
            }

            if (var9 == null) {
               if (var2 <= -1767431455) {
                  throw new IllegalStateException();
               }

               Object var13 = null;
               var10000 = (Model)var13;
            } else {
               var9.method5230();
               var1.field1470 = 2010593719 * var9.field1743;
               int var15 = var9.field2419;
               if (1 == -1216348145 * var1.definition.field5284) {
                  if (var2 <= -1767431455) {
                     throw new IllegalStateException();
                  }

                  var9.field2421 = true;
               }

               if (Actor.method3180(var1, -1329859236)) {
                  if (var2 <= -1767431455) {
                     throw new IllegalStateException();
                  }

                  var9.method5205(var1.field1435, (short)var15);
               } else {
                  classQG.method9520(var9);
               }

               var9.method5200(null != var1.field1477 ? classUD.method11268(var1.field1477, client.field855 * 1612595797) : 0);
               if (var1.field1586) {
                  if (var2 <= -1767431455) {
                     throw new IllegalStateException();
                  }

                  var9.method5205(var1.method3492((byte)91), (short)var9.field2419);
                  var9.method5227(0.01F);
                  var9.method5232(-5);
               }

               var10000 = var9;
            }
         }

         return var10000;
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "dn.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ad")
   @Override
   protected final Model vmethod93() {
      if (this.definition == null) {
         return null;
      } else {
         classQR var1 = this.method3175(-1303404224);
         classQR var2 = this.method3177(var1, 812754771);
         if (null == var1 && var2 == null) {
            var2 = this.field1466;
            if (classQR.method9763(this.field1466, 30, -214155733)) {
               return null;
            }
         }

         SequenceDefinition var3 = null == var1 ? null : var1.method9731((byte)121);
         SequenceDefinition var4 = null == var2 ? null : var2.method9731((byte)123);
         int var5 = null == var1 ? -1 : var1.method9738(1873455220);
         int var6 = var2 == null ? -1 : var2.method9738(2102505247);
         Model var7 = null;
         if (null != this.field1582) {
            if (this.field1582.field5377) {
               Player var8 = classMB.method7521(1104105836);
               if (null != var8) {
                  var7 = var8.field1285.method6701(var3, var5, var4, var6, (byte)1);
               }
            } else if (this.field1582.field5373) {
               if (this.field1580 != null) {
                  var7 = this.field1580.method6701(var3, var5, var4, var6, (byte)1);
               }
            } else {
               var7 = this.definition.method8942(var3, var5, var4, var6, this.field1582, -1697078269);
            }
         } else {
            var7 = this.definition.method8942(var3, var5, var4, var6, this.field1582, -1561970053);
         }

         if (var7 == null) {
            return null;
         } else {
            var7.method5230();
            this.field1470 = 2010593719 * var7.field1743;
            int var9 = var7.field2419;
            if (1 == -1216348145 * this.definition.field5284) {
               var7.field2421 = true;
            }

            if (Actor.method3180(this, -127718153)) {
               var7.method5205(this.field1435, (short)var9);
            } else {
               classQG.method9520(var7);
            }

            var7.method5200(null != this.field1477 ? classUD.method11268(this.field1477, client.field855 * 1612595797) : 0);
            if (this.field1586) {
               var7.method5205(this.method3492((byte)99), (short)var7.field2419);
               var7.method5227(0.01F);
               var7.method5232(-5);
            }

            return var7;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lb")
   void method3487() {
      this.field1583 = null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   @Override
   protected boolean vmethod94() {
      if (this.definition == null) {
         return false;
      } else if (this.method3146(-966919849)) {
         return true;
      } else if (this.field1477 != null && this.field1477.method282(client.field855 * 1612595797)) {
         return true;
      } else {
         Model var1 = null;
         if (null != this.field1582) {
            if (this.field1582.field5377) {
               Player var2 = classMB.method7521(-61149835);
               if (var2 != null) {
                  var1 = var2.field1285.method6701(null, -1, null, -1, (byte)1);
               }
            } else if (this.field1582.field5373) {
               if (null != this.field1580) {
                  var1 = this.field1580.method6701(null, -1, null, -1, (byte)1);
               }
            } else {
               var1 = this.definition.method8942(null, -1, null, -1, this.field1582, -730695928);
            }
         } else {
            var1 = this.definition.method8942(null, -1, null, -1, this.field1582, -1602996996);
         }

         return null != var1 && null != var1.field2444;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   @Override
   protected boolean vmethod97() {
      if (this.definition == null) {
         return false;
      } else if (this.method3146(-491948979)) {
         return true;
      } else if (this.field1477 != null && this.field1477.method282(client.field855 * 1612595797)) {
         return true;
      } else {
         Model var1 = null;
         if (null != this.field1582) {
            if (this.field1582.field5377) {
               Player var2 = classMB.method7521(-751529625);
               if (var2 != null) {
                  var1 = var2.field1285.method6701(null, -1, null, -1, (byte)1);
               }
            } else if (this.field1582.field5373) {
               if (null != this.field1580) {
                  var1 = this.field1580.method6701(null, -1, null, -1, (byte)1);
               }
            } else {
               var1 = this.definition.method8942(null, -1, null, -1, this.field1582, -787300165);
            }
         } else {
            var1 = this.definition.method8942(null, -1, null, -1, this.field1582, -637419320);
         }

         return null != var1 && null != var1.field2444;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ck")
   @Override
   final boolean vmethod263() {
      return null != this.definition;
   }

   public int getCombatLevel() {
      if (!classOE.field4843.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (super.field1479 * 705538257 != -1) {
         return super.field1479 * 705538257;
      } else {
         classPL var1 = this.definition;
         if (var1 != null && var1.getConfigs() != null) {
            var1 = var1.method9002();
         }

         return var1 == null ? -1 : var1.getCombatLevel();
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ca")
   @Override
   final boolean vmethod264() {
      return null != this.definition;
   }

   @ObfuscatedSignature(descriptor = "(B)Lfl;")
   @ObfuscatedName("bu")
   classFL method3492(byte var1) {
      try {
         int var2 = this.definition.method8989(-52154858);
         classFL var3 = this.field1568;
         byte var4 = classGK.method5471(var2, -1821178453);
         byte var5 = classGK.method5472(var2, -1665176581);
         byte var6 = (byte)(var2 & 127);
         classFL.method4832(var3, var4, var5, var6, (byte)127);
         return this.field1568;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "dn.bu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cf")
   @Override
   final boolean vmethod266() {
      return null != this.definition;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cw")
   @Override
   int vmethod268() {
      return this.method3170(-921463806) ? 0 : classPL.method8986(this.definition, 758746747);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cj")
   @Override
   int vmethod269() {
      return this.method3170(-921463806) ? 0 : classPL.method8986(this.definition, 962137520);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ar")
   @Override
   protected boolean vmethod96() {
      if (this.definition == null) {
         return false;
      } else if (this.method3146(-510671558)) {
         return true;
      } else if (this.field1477 != null && this.field1477.method282(client.field855 * 1612595797)) {
         return true;
      } else {
         Model var1 = null;
         if (null != this.field1582) {
            if (this.field1582.field5377) {
               Player var2 = classMB.method7521(21052915);
               if (var2 != null) {
                  var1 = var2.field1285.method6701(null, -1, null, -1, (byte)1);
               }
            } else if (this.field1582.field5373) {
               if (null != this.field1580) {
                  var1 = this.field1580.method6701(null, -1, null, -1, (byte)1);
               }
            } else {
               var1 = this.definition.method8942(null, -1, null, -1, this.field1582, -266918321);
            }
         } else {
            var1 = this.definition.method8942(null, -1, null, -1, this.field1582, -783416523);
         }

         return null != var1 && null != var1.field2444;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lpp;")
   @ObfuscatedName("lp")
   NpcOverrides method3477() {
      return this.field1583;
   }

   @ObfuscatedSignature(descriptor = "()Lfl;")
   @ObfuscatedName("ce")
   @Override
   public classFL vmethod272() {
      return this.field1586 ? this.method3492((byte)73) : null;
   }

   @ObfuscatedSignature(descriptor = "()Lfl;")
   @ObfuscatedName("cm")
   @Override
   public classFL vmethod273() {
      return this.field1586 ? this.method3492((byte)10) : null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bi")
   void method3441(int var1) {
      this.field1570 = 1402934361 * var1;
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("dd")
   @Override
   public float vmethod277() {
      return this.field1586 ? 0.01F : 1.0F;
   }

   NPC(int var1) {
      super(var1);
      this.field1571 = "";
      this.field1570 = -1010951041;
      this.field1568 = new classFL((byte)0, (byte)0, (byte)0, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dm")
   @Override
   public int vmethod279() {
      return this.field1586 ? -5 : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hh")
   @Override
   int vmethod374() {
      return (-1 == 33031770 * this.definition.field5288 ? this.field1470 * 636656845 : this.definition.field5288 * 182527809) + this.vmethod98(-1271283736);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hv")
   @Override
   int vmethod375() {
      return (-1 == 182527809 * this.definition.field5288 ? this.field1470 * -1576740359 : this.definition.field5288 * -303139422) + this.vmethod98(2000238900);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hc")
   @Override
   int vmethod376() {
      return (-1 == -416076566 * this.definition.field5288 ? this.field1470 * -1865898707 : this.definition.field5288 * -420360001) + this.vmethod98(600590848);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("pd")
   public String method3496() {
      if (!classOE.field4843.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return this.method3451(-694108261);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("it")
   @Override
   boolean vmethod378() {
      return this.definition.field5313;
   }

   @ObfuscatedSignature(descriptor = "([I[SI)V")
   @ObfuscatedName("aq")
   void method3470(int[] var1, short[] var2, int var3) {
      try {
         if (this.npcOverheadIcons == null) {
            if (var3 <= -966335656) {
               throw new IllegalStateException();
            }

            this.npcOverheadIcons = new classYX(this.definition);
         }

         this.npcOverheadIcons.method13774(var1, var2, 768968807);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dn.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ig")
   @Override
   boolean vmethod380() {
      return this.definition.field5313;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lj")
   void method3474() {
      this.npcOverheadIcons = null;
   }

   @ObfuscatedSignature(descriptor = "()Lfl;")
   @ObfuscatedName("lu")
   classFL method3493() {
      int var1 = this.definition.method8989(-52154858);
      classFL var2 = this.field1568;
      byte var3 = classGK.method5471(var1, -1913667842);
      byte var4 = classGK.method5472(var1, -1665176581);
      byte var5 = (byte)(var1 & 127);
      classFL.method4832(var2, var3, var4, var5, (byte)127);
      return this.field1568;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("bw")
   void method3436(String var1) {
      this.field1571 = var1 == null ? "" : var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/StringBuilder;Lqi;I)V")
   @ObfuscatedName("ag")
   static void method3495(String var0, StringBuilder var1, classQI var2, int var3) {
      try {
         int var4 = var0.indexOf(61);
         if (-1 == var4) {
            String[] var5 = var0.split(":");
            String var6 = var2.method9577(var5[0], 2145269203);
            if (null != var6) {
               if (var3 >= -44590225) {
                  throw new IllegalStateException();
               }

               if (var5.length > 1) {
                  if (var3 >= -44590225) {
                     throw new IllegalStateException();
                  }

                  String var7 = var5[1].toLowerCase();
                  if (var7.equals("lower")) {
                     if (var3 >= -44590225) {
                        throw new IllegalStateException();
                     }

                     var6 = classPD.method8844(var6, true, 956525589);
                  } else if (var7.equals("upper")) {
                     if (var3 >= -44590225) {
                        throw new IllegalStateException();
                     }

                     var6 = classPD.method8844(var6, false, -184991073);
                  }
               }
            }

            var1.append(var6);
         } else {
            String var9 = var0.substring(0, var4);
            String var10 = var0.substring(1 + var4);
            var10 = classME.method7560(var10, -1767313942);
            var2.method9561(var9, var10, -2073541729);
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "dn.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("be")
   void method3442(int var1) {
      this.field1570 = 937220001 * var1;
   }

   @Nullable
   public net.runelite.api.NpcOverrides getChatheadOverrides() {
      return this.field1583;
   }

   @ObfuscatedSignature(descriptor = "()Lpl;")
   @ObfuscatedName("go")
   public classPL method3497() {
      classPL var1 = this.method3500();
      if (var1 != null && var1.getConfigs() != null) {
         var1 = var1.method9002();
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("by")
   void method3443(int var1) {
      this.field1570 = -1026244725 * var1;
   }

   @ObfuscatedSignature(descriptor = "(IIZ)V")
   @ObfuscatedName("cb")
   final void method3458(int var1, int var2, boolean var3) {
      if (this.field1465.method9726(374233424) && this.field1465.method9731((byte)123).field5119 * 221400229 == 1) {
         Actor.method3101(this, -213705491);
      }

      if (!var3) {
         int var4 = var1 - this.field1474[0];
         int var5 = var2 - this.field1433[0];
         if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            Actor.method3111(this, var1, var2, classGT.field2680, 112412752);
            return;
         }
      }

      this.method3113(var1, var2, 527441438);
   }

   @ObfuscatedSignature(descriptor = "(Lpl;)V")
   @ObfuscatedName("mh")
   public void method3498(classPL var1) {
      if (var1 == null) {
         classOE.field4843.getCallbacks().post(new NpcDespawned(this));
      } else {
         classPL var2 = this.definition;
         if (var2 == null) {
            client.field1030.add(new NpcSpawned(this));
         } else if (var1.getId() != var2.getId()) {
            client.field1031.add(new NpcChanged(this, var2));
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bd")
   boolean method3447(int var1) {
      return var1 >= 0 && var1 <= 4 ? (1594792805 * this.field1570 & 1 << var1) != 0 : true;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bs")
   boolean method3448(int var1) {
      return var1 >= 0 && var1 <= 4 ? (-792802207 * this.field1570 & 1 << var1) != 0 : true;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bl")
   final String method3449() {
      if (!this.field1571.isEmpty()) {
         return this.field1571;
      } else {
         classPL var1 = this.definition;
         if (null != var1.field5325) {
            var1 = var1.method8955(652890385);
            if (var1 == null) {
               var1 = this.definition;
            }
         }

         return var1.method8994((byte)53);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bv")
   final String method3450() {
      if (!this.field1571.isEmpty()) {
         return this.field1571;
      } else {
         classPL var1 = this.definition;
         if (null != var1.field5325) {
            var1 = var1.method8955(652890385);
            if (var1 == null) {
               var1 = this.definition;
            }
         }

         return var1.method8994((byte)-18);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ac")
   final String method3451(int var1) {
      try {
         if (!this.field1571.isEmpty()) {
            if (var1 >= 404226072) {
               throw new IllegalStateException();
            } else {
               return this.field1571;
            }
         } else {
            classPL var2 = this.definition;
            if (null != var2.field5325) {
               if (var1 >= 404226072) {
                  throw new IllegalStateException();
               }

               var2 = var2.method8955(652890385);
               if (var2 == null) {
                  if (var1 >= 404226072) {
                     throw new IllegalStateException();
                  }

                  var2 = this.definition;
               }
            }

            return var2.method8994((byte)-28);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dn.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILgt;)V")
   @ObfuscatedName("bz")
   final void method3453(int var1, classGT var2) {
      int var3 = this.field1474[0];
      int var4 = this.field1433[0];
      if (0 == var1) {
         var3--;
         var4++;
      }

      if (1 == var1) {
         var4++;
      }

      if (2 == var1) {
         var3++;
         var4++;
      }

      if (var1 == 3) {
         var3--;
      }

      if (var1 == 4) {
         var3++;
      }

      if (5 == var1) {
         var3--;
         var4--;
      }

      if (6 == var1) {
         var4--;
      }

      if (7 == var1) {
         var3++;
         var4--;
      }

      if (this.field1465.method9726(374233424) && this.field1465.method9731((byte)77).field5119 * 221400229 == 1) {
         Actor.method3101(this, -26801499);
      }

      Actor.method3111(this, var3, var4, var2, -1835517117);
   }

   public String getName() {
      if (this.definition == null) {
         return null;
      } else {
         String var1 = this.method3496();
         return var1.replace(' ', ' ');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldn;Ljava/lang/String;B)V")
   @ObfuscatedName("pp")
   public static void method3437(NPC var0, String var1, byte var2) {
      if (var0 == null) {
         var0.method3438(var1, var2);
      } else {
         try {
            String var10001;
            if (var1 == null) {
               if (var2 <= 1) {
                  throw new IllegalStateException();
               }

               var10001 = "";
            } else {
               var10001 = var1;
            }

            var0.field1571 = var10001;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "dn.af(" + ')');
         }
      }
   }

   public Shape getConvexHull() {
      Model var1 = this.method3842();
      if (var1 == null) {
         return null;
      } else {
         WorldView var2 = this.method3284();
         int var3 = Perspective.getFootprintTileHeight(classOE.field4843, this.getLocalLocation(), var2.field1710 * -483624883, this.getFootprintSize());
         var3 -= this.getAnimationHeightOffset();
         return var1.method5252(var2, super.field1487 * -1547553299, super.field1489 * -1272026483, this.getCurrentOrientation(), var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILgt;)V")
   @ObfuscatedName("cu")
   final void method3454(int var1, classGT var2) {
      int var3 = this.field1474[0];
      int var4 = this.field1433[0];
      if (0 == var1) {
         var3--;
         var4++;
      }

      if (1 == var1) {
         var4++;
      }

      if (2 == var1) {
         var3++;
         var4++;
      }

      if (var1 == 3) {
         var3--;
      }

      if (var1 == 4) {
         var3++;
      }

      if (5 == var1) {
         var3--;
         var4--;
      }

      if (6 == var1) {
         var4--;
      }

      if (7 == var1) {
         var3++;
         var4--;
      }

      if (this.field1465.method9726(374233424) && this.field1465.method9731((byte)36).field5119 * 221400229 == 1) {
         Actor.method3101(this, -378184761);
      }

      Actor.method3111(this, var3, var4, var2, -208441912);
   }

   @ObfuscatedSignature(descriptor = "(IIZ)V")
   @ObfuscatedName("ct")
   final void method3459(int var1, int var2, boolean var3) {
      if (this.field1465.method9726(374233424) && this.field1465.method9731((byte)113).field5119 * 221400229 == 1) {
         Actor.method3101(this, 1509198029);
      }

      if (!var3) {
         int var4 = var1 - this.field1474[0];
         int var5 = var2 - this.field1433[0];
         if (var4 >= 224541102 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            Actor.method3111(this, var1, var2, classGT.field2680, 583273175);
            return;
         }
      }

      this.method3113(var1, var2, 527441438);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ih")
   @Override
   boolean vmethod381() {
      return this.definition.field5313;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("cl")
   int[] method3461() {
      return this.npcOverheadIcons != null ? this.npcOverheadIcons.method13766(1825333754) : this.definition.method8974((byte)64);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cc")
   @Override
   final boolean vmethod265() {
      return null != this.definition;
   }

   @Nullable
   public net.runelite.api.NpcOverrides getModelOverrides() {
      return this.field1582;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("lz")
   void method3488() {
      this.field1583 = null;
   }

   @ObfuscatedSignature(descriptor = "(I)Lfx;")
   @ObfuscatedName("ae")
   @Override
   protected final Model vmethod104(int var1) {
      if (client.field1116 != null
         && client.field1116
            .test(super.field1465.field5598 * 1684838611 != -1 ? super.field1465.field5598 * 1684838611 : super.field1464.field5598 * 1684838611)) {
         int var2 = this.getAnimationFrame();
         int var3 = this.getPoseAnimationFrame();

         Model var4;
         try {
            super.field1465.field5602 = (-2147483648 | Math.max(super.field1465.field5604 * -1399668821 - 1, 0) << 16 | var2) * -885908119;
            super.field1464.field5602 = (-1073741824 | Math.max(super.field1464.field5604 * -1399668821 - 1, 0) << 16 | var3) * -885908119;
            var4 = this.method3499();
         } finally {
            super.field1465.field5602 = var2 * -885908119;
            super.field1464.field5602 = var3 * -885908119;
         }

         return var4;
      } else {
         return this.method3499();
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfl;")
   @ObfuscatedName("ci")
   @Override
   public classFL vmethod271() {
      return this.field1586 ? this.method3492((byte)-16) : null;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   @Override
   protected boolean vmethod95(int var1) {
      try {
         if (this.definition == null) {
            if (var1 == -702405562) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (this.method3146(-857460300)) {
            if (var1 == -702405562) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            if (this.field1477 != null) {
               if (var1 == -702405562) {
                  throw new IllegalStateException();
               }

               if (this.field1477.method282(client.field855 * 1612595797)) {
                  if (var1 == -702405562) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            Model var2 = null;
            if (null != this.field1582) {
               if (var1 == -702405562) {
                  throw new IllegalStateException();
               }

               if (this.field1582.field5377) {
                  if (var1 == -702405562) {
                     throw new IllegalStateException();
                  }

                  Player var3 = classMB.method7521(-1270183808);
                  if (var3 != null) {
                     if (var1 == -702405562) {
                        throw new IllegalStateException();
                     }

                     var2 = var3.field1285.method6701(null, -1, null, -1, (byte)1);
                  }
               } else if (this.field1582.field5373) {
                  if (var1 == -702405562) {
                     throw new IllegalStateException();
                  }

                  if (null != this.field1580) {
                     if (var1 == -702405562) {
                        throw new IllegalStateException();
                     }

                     var2 = this.field1580.method6701(null, -1, null, -1, (byte)1);
                  }
               } else {
                  var2 = this.definition.method8942(null, -1, null, -1, this.field1582, -1207683968);
               }
            } else {
               var2 = this.definition.method8942(null, -1, null, -1, this.field1582, -1895949318);
            }

            if (null != var2) {
               if (var1 == -702405562) {
                  throw new IllegalStateException();
               }

               if (null != var2.field2444) {
                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dn.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([I[S)V")
   @ObfuscatedName("cz")
   void method3471(int[] var1, short[] var2) {
      if (this.npcOverheadIcons == null) {
         this.npcOverheadIcons = new classYX(this.definition);
      }

      this.npcOverheadIcons.method13774(var1, var2, -405729472);
   }

   @ObfuscatedSignature(descriptor = "()Lfz;")
   @ObfuscatedName("cp")
   @Override
   protected classFZ vmethod261() {
      if (null != this.field1582 && this.field1582.field5373) {
         return classFZ.field2517;
      } else {
         return !this.definition.field5334 ? classFZ.field2517 : super.vmethod260((byte)108);
      }
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("dc")
   @Override
   public float vmethod275() {
      return this.field1586 ? 0.01F : 1.0F;
   }

   @ObfuscatedSignature(descriptor = "()Lpp;")
   @ObfuscatedName("lm")
   NpcOverrides method3478() {
      return this.field1583;
   }

   @ObfuscatedSignature(descriptor = "([I[S)V")
   @ObfuscatedName("ch")
   void method3472(int[] var1, short[] var2) {
      if (this.npcOverheadIcons == null) {
         this.npcOverheadIcons = new classYX(this.definition);
      }

      this.npcOverheadIcons.method13774(var1, var2, -250151651);
   }

   @ObfuscatedSignature(descriptor = "(Lpp;)V")
   @ObfuscatedName("lf")
   void method3480(NpcOverrides var1) {
      this.field1583 = var1;
   }

   @ObfuscatedSignature(descriptor = "(ILgt;)V")
   @ObfuscatedName("cr")
   final void method3455(int var1, classGT var2) {
      int var3 = this.field1474[0];
      int var4 = this.field1433[0];
      if (0 == var1) {
         var3--;
         var4++;
      }

      if (1 == var1) {
         var4++;
      }

      if (2 == var1) {
         var3++;
         var4++;
      }

      if (var1 == 3) {
         var3--;
      }

      if (var1 == 4) {
         var3++;
      }

      if (5 == var1) {
         var3--;
         var4--;
      }

      if (6 == var1) {
         var4--;
      }

      if (7 == var1) {
         var3++;
         var4--;
      }

      if (this.field1465.method9726(374233424) && this.field1465.method9731((byte)17).field5119 * 221400229 == 1) {
         Actor.method3101(this, -1262737815);
      }

      Actor.method3111(this, var3, var4, var2, -1618033851);
   }

   @ObfuscatedSignature(descriptor = "(Lpp;)V")
   @ObfuscatedName("lh")
   void method3481(NpcOverrides var1) {
      this.field1583 = var1;
   }

   @ObfuscatedSignature(descriptor = "(IISB)V")
   @ObfuscatedName("ay")
   void method3467(int var1, int var2, short var3, byte var4) {
      try {
         if (null == this.npcOverheadIcons) {
            if (var4 != 4) {
               throw new IllegalStateException();
            }

            this.npcOverheadIcons = new classYX(this.definition);
         }

         this.npcOverheadIcons.method13769(var1, var2, var3, -1871315217);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "dn.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIS)V")
   @ObfuscatedName("cs")
   void method3468(int var1, int var2, short var3) {
      if (null == this.npcOverheadIcons) {
         this.npcOverheadIcons = new classYX(this.definition);
      }

      this.npcOverheadIcons.method13769(var1, var2, var3, -1871315217);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dx")
   @Override
   public int vmethod280() {
      return this.field1586 ? 1492525834 : 0;
   }

   @ObfuscatedSignature(descriptor = "()Lfl;")
   @ObfuscatedName("li")
   classFL method3494() {
      int var1 = this.definition.method8989(-52154858);
      classFL var2 = this.field1568;
      byte var3 = classGK.method5471(var1, -1798125925);
      byte var4 = classGK.method5472(var1, -1665176581);
      byte var5 = (byte)(var1 & 127);
      classFL.method4832(var2, var3, var4, var5, (byte)127);
      return this.field1568;
   }

   @ObfuscatedSignature(descriptor = "(Lpp;)V")
   @ObfuscatedName("ln")
   void method3482(NpcOverrides var1) {
      this.field1583 = var1;
   }

   @ObfuscatedSignature(descriptor = "(ILgt;)V")
   @ObfuscatedName("bh")
   final void method3456(int var1, classGT var2) {
      int var3 = this.field1474[0];
      int var4 = this.field1433[0];
      if (0 == var1) {
         var3--;
         var4++;
      }

      if (1 == var1) {
         var4++;
      }

      if (2 == var1) {
         var3++;
         var4++;
      }

      if (var1 == 3) {
         var3--;
      }

      if (var1 == 4) {
         var3++;
      }

      if (5 == var1) {
         var3--;
         var4--;
      }

      if (6 == var1) {
         var4--;
      }

      if (7 == var1) {
         var3++;
         var4--;
      }

      if (this.field1465.method9726(374233424) && this.field1465.method9731((byte)55).field5119 * 221400229 == 1) {
         Actor.method3101(this, -1866972276);
      }

      Actor.method3111(this, var3, var4, var2, 96013266);
   }

   @ObfuscatedSignature(descriptor = "(Ldn;Lpp;B)V")
   @ObfuscatedName("rc")
   public static void method3483(NPC var0, NpcOverrides var1, byte var2) {
      if (var0 == null) {
         var0.method3484(var1, var2);
      }

      try {
         var0.field1583 = var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dn.bx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lfl;")
   @ObfuscatedName("br")
   @Override
   public classFL vmethod274(byte var1) {
      try {
         if (this.field1586) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return this.method3492((byte)47);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dn.br(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("af")
   void method3438(String var1, byte var2) {
      try {
         String var10001;
         if (var1 == null) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            var10001 = "";
         } else {
            var10001 = var1;
         }

         this.field1571 = var10001;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dn.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[S")
   @ObfuscatedName("aj")
   short[] method3464(int var1) {
      try {
         if (null != this.npcOverheadIcons) {
            if (var1 <= 702114061) {
               throw new IllegalStateException();
            } else {
               return this.npcOverheadIcons.method13767(-1378357);
            }
         } else {
            return this.definition.method8981(-240101723);
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dn.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lpl;")
   @ObfuscatedName("qs")
   public classPL method3500() {
      return this.definition;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("am")
   void method3475(int var1) {
      try {
         this.npcOverheadIcons = null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dn.am(" + ')');
      }
   }

   public short[] getOverheadSpriteIds() {
      if (this.npcOverheadIcons != null) {
         return (short[])this.npcOverheadIcons.field7105.clone();
      } else {
         classPL var1 = this.method3497();
         return var1 != null && var1.field5331 != null ? (short[])var1.field5331.clone() : null;
      }
   }

   public int getIndex() {
      return super.field1480 * -1315528093;
   }

   @ObfuscatedSignature(descriptor = "(B)Lpp;")
   @ObfuscatedName("ah")
   NpcOverrides method3479(byte var1) {
      try {
         return this.field1583;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dn.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpp;B)V")
   @ObfuscatedName("bx")
   void method3484(NpcOverrides var1, byte var2) {
      try {
         this.field1583 = var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dn.bx(" + ')');
      }
   }

   public int getId() {
      classPL var1 = this.definition;
      if (var1 != null && var1.getConfigs() != null) {
         var1 = var1.method9002();
      }

      return var1 == null ? -1 : var1.getId();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldn;IIS)V")
   @ObfuscatedName("fx")
   public static void method3469(NPC var0, int var1, int var2, short var3) {
      if (null == var0.npcOverheadIcons) {
         var0.npcOverheadIcons = new classYX(var0.definition);
      }

      var0.npcOverheadIcons.method13769(var1, var2, var3, -1871315217);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bq")
   void method3444(int var1) {
      this.field1570 = 937220001 * var1;
   }
}
