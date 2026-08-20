import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import net.runelite.api.EntityOps;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("po")
public class classPO implements classOZ, EntityOps {
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5364 = 4;
   @ObfuscatedName("af")
   final List field5363 = new ArrayList();
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   public static final int field5366 = 262144;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final String field5370 = "hidden";
   @ObfuscatedSignature(descriptor = "Lie;")
   @ObfuscatedName("bm")
   static ClanChannel field5368;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field5365 = 12;
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   static final int field5367 = 39;
   @ObfuscatedName("as")
   public static int[] field5371;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final String field5369 = "beta";

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bw")
   void method9057() {
      this.field5363.clear();
   }

   @Nullable
   public String getOp(int var1) {
      return this.method9083(var1, classLB.field4090);
   }

   @ObfuscatedSignature(descriptor = "(IILjava/lang/String;I)V")
   @ObfuscatedName("aw")
   void method9049(int var1, int var2, String var3, int var4) {
      try {
         classPB var5 = (classPB)this.field5363.get(var1);
         if (null == var5.field5212) {
            var5.field5212 = this.method9071((byte)112);
         }

         var5.field5212.method9048(var2, var3, (byte)-66);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "po.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIILjava/lang/String;B)V")
   @ObfuscatedName("ak")
   void method9051(int var1, int var2, int var3, int var4, int var5, String var6, byte var7) {
      try {
         classPB var8 = (classPB)this.field5363.get(var1);
         if (var8.field5211 == null) {
            var8.field5211 = new ArrayList();
         }

         var8.field5211.add(new classOA(var6, var2, var3, var4, var5));
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "po.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIILjava/lang/String;B)V")
   @ObfuscatedName("av")
   void method9054(int var1, int var2, int var3, int var4, int var5, int var6, String var7, byte var8) {
      try {
         classPB var9 = (classPB)this.field5363.get(var1);
         if (null == var9.field5212) {
            if (var8 != 11) {
               throw new IllegalStateException();
            }

            var9.field5212 = this.method9071((byte)98);
         }

         var9.field5212.method9051(var2, var3, var4, var5, var6, var7, (byte)63);
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "po.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   void method9058(int var1) {
      try {
         this.field5363.clear();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "po.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II[IB)Z")
   @ObfuscatedName("an")
   boolean method9063(int var1, int var2, int[] var3, byte var4) {
      try {
         if (var1 >= 0) {
            if (var4 <= 2) {
               throw new IllegalStateException();
            }

            if (this.field5363.size() > var1) {
               if (var4 <= 2) {
                  throw new IllegalStateException();
               }

               if (this.field5363.get(var1) != null) {
                  if (var4 <= 2) {
                     throw new IllegalStateException();
                  }

                  if (var2 >= 0) {
                     if (var2 == 0) {
                        if (var4 <= 2) {
                           throw new IllegalStateException();
                        }

                        String var7 = this.vmethod551(var1, var3, (byte)-5);
                        if (var7 != null) {
                           if (var4 <= 2) {
                              throw new IllegalStateException();
                           }

                           if (!var7.isEmpty()) {
                              return true;
                           }
                        }

                        return false;
                     }

                     classPB var5 = (classPB)this.field5363.get(var1);
                     return var5.field5212.method9063(var2, 0, var3, (byte)20);
                  }

                  if (var4 <= 2) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "po.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lpo;")
   @ObfuscatedName("bl")
   classPO method9069() {
      return new classPO();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bu")
   void method9059() {
      this.field5363.clear();
   }

   @ObfuscatedSignature(descriptor = "(I[II)I")
   @ObfuscatedName("am")
   int method9068(int var1, int[] var2, int var3) {
      try {
         if (var2 != null) {
            if (var3 == 355103608) {
               throw new IllegalStateException();
            }

            if (var1 < this.field5363.size()) {
               classPB var4 = (classPB)this.field5363.get(var1);
               if (var4 != null) {
                  if (var3 == 355103608) {
                     throw new IllegalStateException();
                  }

                  if (var4.field5211 != null) {
                     if (var3 == 355103608) {
                        throw new IllegalStateException();
                     }

                     for (int var5 = 0; var5 < var4.field5211.size(); var5++) {
                        if (var3 == 355103608) {
                           throw new IllegalStateException();
                        }

                        classOA var6 = (classOA)var4.field5211.get(var5);
                        int var7;
                        if (var6.field4802 * 1570299213 != 65535) {
                           if (var3 == 355103608) {
                              throw new IllegalStateException();
                           }

                           var7 = this.method9074(var6.field4802 * 1570299213, var2, 287615947);
                        } else {
                           var7 = var2[var6.field4805 * 1003932407];
                        }

                        if (var7 >= var6.field4804 * -600528509 && var7 <= var6.field4803 * -74293995) {
                           if (var3 == 355103608) {
                              throw new IllegalStateException();
                           }

                           return var5;
                        }
                     }
                  }
               }

               return -1;
            }

            if (var3 == 355103608) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "po.am(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("af")
   @Override
   public int vmethod539(short var1) {
      try {
         return this.field5363.size() - 1;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "po.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I[IB)Ljava/lang/String;")
   @ObfuscatedName("ab")
   @Override
   public String vmethod551(int var1, int[] var2, byte var3) {
      try {
         if (var1 >= 0) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            if (var1 < this.field5363.size()) {
               classPB var4 = (classPB)this.field5363.get(var1);
               if (null == var4) {
                  if (var3 == 0) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               if (null != var2) {
                  if (var3 == 0) {
                     throw new IllegalStateException();
                  }

                  int var5 = this.method9068(var1, var2, 571937195);
                  if (var5 >= 0) {
                     if (var3 == 0) {
                        throw new IllegalStateException();
                     }

                     classOA var6 = (classOA)var4.field5211.get(var5);
                     return var6.field5210;
                  }
               }

               return var4.field5210;
            }

            if (var3 == 0) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "po.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Loz;")
   @ObfuscatedName("ag")
   @Override
   public classOZ vmethod542(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 != -166157468) {
               throw new IllegalStateException();
            }

            if (var1 < this.field5363.size()) {
               classPB var3 = (classPB)this.field5363.get(var1);
               if (null == var3) {
                  if (var2 != -166157468) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               return var3.field5212;
            }

            if (var2 != -166157468) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "po.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ae")
   @Override
   public boolean vmethod540(int var1, int var2) {
      try {
         return this.method9063(var1, 0, null, (byte)28);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "po.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I[II)I")
   @ObfuscatedName("bn")
   int method9074(int var1, int[] var2, int var3) {
      try {
         VarbitComposition var5 = (VarbitComposition)VarbitComposition.field5418.method6422(var1);
         VarbitComposition var4;
         if (null != var5) {
            if (var3 <= -2054679977) {
               throw new IllegalStateException();
            }

            var4 = var5;
         } else {
            byte[] var6 = VarbitComposition.field5423.method11867(14, var1, -1355154202);
            var5 = new VarbitComposition(new classXY(var6));
            VarbitComposition.field5418.method6428(var5, var1);
            var4 = var5;
         }

         return var4.method9212(var2[-1681019861 * var4.field5420], (short)-25461);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "po.bn(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Loz;")
   @ObfuscatedName("ap")
   @Override
   public classOZ vmethod553(int var1) {
      if (var1 >= 0 && var1 < this.field5363.size()) {
         classPB var2 = (classPB)this.field5363.get(var1);
         return null == var2 ? null : var2.field5212;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ax")
   @Override
   public boolean vmethod544() {
      for (int var1 = 0; var1 < this.field5363.size(); var1++) {
         if (this.field5363.get(var1) != null && ((classPB)this.field5363.get(var1)).field5210 != null) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ac")
   @Override
   public boolean vmethod545() {
      for (int var1 = 0; var1 < this.field5363.size(); var1++) {
         if (this.field5363.get(var1) != null && ((classPB)this.field5363.get(var1)).field5210 != null) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   @Override
   public int vmethod541() {
      return this.field5363.size() - 1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   @Override
   public int vmethod547() {
      return this.field5363.size() - 1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   @Override
   public int vmethod548() {
      return this.field5363.size() - 1;
   }

   @ObfuscatedSignature(descriptor = "(I)Lpo;")
   @ObfuscatedName("qk")
   public classPO method9082(int var1) {
      return ((classPB)this.field5363.get(var1)).field5212;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("cu")
   public static final String method9078(String var0, int var1) {
      if (var0 == null) {
         var0 = var1 + 1 + ": TEST";
      } else {
         var0 = 1 + var1 + ": " + var0;
      }

      return var0;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   @Override
   public boolean vmethod550(int var1) {
      return this.method9063(var1, 0, null, (byte)44);
   }

   @ObfuscatedSignature(descriptor = "(I[I)Ljava/lang/String;")
   @ObfuscatedName("aq")
   @Override
   public String vmethod549(int var1, int[] var2) {
      if (var1 >= 0 && var1 < this.field5363.size()) {
         classPB var3 = (classPB)this.field5363.get(var1);
         if (null == var3) {
            return null;
         } else {
            if (null != var2) {
               int var4 = this.method9068(var1, var2, 223091000);
               if (var4 >= 0) {
                  classOA var5 = (classOA)var3.field5211.get(var4);
                  return var5.field5210;
               }
            }

            return var3.field5210;
         }
      } else {
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpo;)Lpo;")
   @ObfuscatedName("ut")
   public static classPO method9070(classPO var0) {
      if (var0 == null) {
         var0.method9073();
      }

      return new classPO();
   }

   @ObfuscatedSignature(descriptor = "(I)Loz;")
   @ObfuscatedName("ad")
   @Override
   public classOZ vmethod538(int var1) {
      if (var1 >= 0 && var1 < this.field5363.size()) {
         classPB var2 = (classPB)this.field5363.get(var1);
         return null == var2 ? null : var2.field5212;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   void method9060() {
      this.field5363.clear();
   }

   @ObfuscatedSignature(descriptor = "(I)Loz;")
   @ObfuscatedName("au")
   @Override
   public classOZ vmethod554(int var1) {
      if (var1 >= 0 && var1 < this.field5363.size()) {
         classPB var2 = (classPB)this.field5363.get(var1);
         return null == var2 ? null : var2.field5212;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;IIIIII)Z")
   @ObfuscatedName("bc")
   boolean method9042(classXY var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 >= var3 && var2 <= var4) {
         int var17 = var2 - var3;
         String var20 = var1.method13071(-634841020);
         if (!var20.equalsIgnoreCase("hidden")) {
            this.method9048(var17, var20, (byte)-20);
         }

         return true;
      } else if (var5 == var2) {
         int var16 = classXY.method13039(var1, -346779531);
         int var19 = classXY.method13039(var1, -346779531);
         String var22 = var1.method13071(1538095853);
         this.method9049(var16, var19, var22, 1023779009);
         return true;
      } else if (var2 == var6) {
         int var15 = classXY.method13039(var1, -346779531);
         int var18 = classXY.method13047(var1, 1146048691);
         int var21 = classXY.method13047(var1, 1261360626);
         int var23 = var1.method13056((byte)1);
         int var24 = var1.method13056((byte)1);
         String var25 = var1.method13071(499224131);
         this.method9051(var15, var18, var21, var23, var24, var25, (byte)8);
         return true;
      } else if (var7 == var2) {
         int var8 = classXY.method13039(var1, -346779531);
         int var9 = classXY.method13047(var1, -544671130);
         int var10 = classXY.method13047(var1, 1332224802);
         int var11 = classXY.method13047(var1, -1159540884);
         int var12 = var1.method13056((byte)1);
         int var13 = var1.method13056((byte)1);
         String var14 = var1.method13071(-1056728178);
         this.method9054(var8, var9, var10, var11, var12, var13, var14, (byte)11);
         return true;
      } else {
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpo;IILjava/lang/String;)V")
   @ObfuscatedName("jt")
   public static void method9050(classPO var0, int var1, int var2, String var3) {
      classPB var4 = (classPB)var0.field5363.get(var1);
      if (null == var4.field5212) {
         var4.field5212 = var0.method9071((byte)105);
      }

      var4.field5212.method9048(var2, var3, (byte)-8);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;IIIIII)Z")
   @ObfuscatedName("bp")
   boolean method9043(classXY var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 >= var3 && var2 <= var4) {
         int var17 = var2 - var3;
         String var20 = var1.method13071(-515689110);
         if (!var20.equalsIgnoreCase("hidden")) {
            this.method9048(var17, var20, (byte)34);
         }

         return true;
      } else if (var5 == var2) {
         int var16 = classXY.method13039(var1, -346779531);
         int var19 = classXY.method13039(var1, -346779531);
         String var22 = var1.method13071(101642977);
         this.method9049(var16, var19, var22, 1023779009);
         return true;
      } else if (var2 == var6) {
         int var15 = classXY.method13039(var1, -346779531);
         int var18 = classXY.method13047(var1, -469092688);
         int var21 = classXY.method13047(var1, 1805746601);
         int var23 = var1.method13056((byte)1);
         int var24 = var1.method13056((byte)1);
         String var25 = var1.method13071(1483472008);
         this.method9051(var15, var18, var21, var23, var24, var25, (byte)11);
         return true;
      } else if (var7 == var2) {
         int var8 = classXY.method13039(var1, -346779531);
         int var9 = classXY.method13047(var1, 1380351365);
         int var10 = classXY.method13047(var1, -1276607113);
         int var11 = classXY.method13047(var1, 1591351283);
         int var12 = var1.method13056((byte)1);
         int var13 = var1.method13056((byte)1);
         String var14 = var1.method13071(1287228945);
         this.method9054(var8, var9, var10, var11, var12, var13, var14, (byte)11);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(II[I)Z")
   @ObfuscatedName("be")
   boolean method9064(int var1, int var2, int[] var3) {
      if (var1 < 0 || this.field5363.size() <= var1 || this.field5363.get(var1) == null || var2 < 0) {
         return false;
      } else if (var2 != 0) {
         classPB var5 = (classPB)this.field5363.get(var1);
         return var5.field5212.method9063(var2, 0, var3, (byte)44);
      } else {
         String var4 = this.vmethod551(var1, var3, (byte)58);
         return var4 != null && !var4.isEmpty();
      }
   }

   @ObfuscatedSignature(descriptor = "(II[I)Z")
   @ObfuscatedName("bf")
   boolean method9065(int var1, int var2, int[] var3) {
      if (var1 < 0 || this.field5363.size() <= var1 || this.field5363.get(var1) == null || var2 < 0) {
         return false;
      } else if (var2 != 0) {
         classPB var5 = (classPB)this.field5363.get(var1);
         return var5.field5212.method9063(var2, 0, var3, (byte)114);
      } else {
         String var4 = this.vmethod551(var1, var3, (byte)-8);
         return var4 != null && !var4.isEmpty();
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIILjava/lang/String;)V")
   @ObfuscatedName("bj")
   void method9052(int var1, int var2, int var3, int var4, int var5, String var6) {
      classPB var7 = (classPB)this.field5363.get(var1);
      if (var7.field5211 == null) {
         var7.field5211 = new ArrayList();
      }

      var7.field5211.add(new classOA(var6, var2, var3, var4, var5));
   }

   @ObfuscatedSignature(descriptor = "(IIIIILjava/lang/String;)V")
   @ObfuscatedName("bg")
   void method9053(int var1, int var2, int var3, int var4, int var5, String var6) {
      classPB var7 = (classPB)this.field5363.get(var1);
      if (var7.field5211 == null) {
         var7.field5211 = new ArrayList();
      }

      var7.field5211.add(new classOA(var6, var2, var3, var4, var5));
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("az")
   @Override
   public boolean vmethod546(byte var1) {
      try {
         for (int var2 = 0; var2 < this.field5363.size(); var2++) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            if (this.field5363.get(var2) != null) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               if (((classPB)this.field5363.get(var2)).field5210 != null) {
                  if (var1 != 0) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "po.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ay")
   @Override
   public boolean vmethod552(int var1) {
      return this.method9063(var1, 0, null, (byte)69);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   void method9061() {
      this.field5363.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpo;IIIIIILjava/lang/String;)V")
   @ObfuscatedName("te")
   public static void method9055(classPO var0, int var1, int var2, int var3, int var4, int var5, int var6, String var7) {
      classPB var8 = (classPB)var0.field5363.get(var1);
      if (null == var8.field5212) {
         var8.field5212 = var0.method9071((byte)98);
      }

      var8.field5212.method9051(var2, var3, var4, var5, var6, var7, (byte)26);
   }

   @ObfuscatedSignature(descriptor = "(II[I)Z")
   @ObfuscatedName("bq")
   boolean method9066(int var1, int var2, int[] var3) {
      if (var1 < 0 || this.field5363.size() <= var1 || this.field5363.get(var1) == null || var2 < 0) {
         return false;
      } else if (var2 != 0) {
         classPB var5 = (classPB)this.field5363.get(var1);
         return var5.field5212.method9063(var2, 0, var3, (byte)3);
      } else {
         String var4 = this.vmethod551(var1, var3, (byte)-18);
         return var4 != null && !var4.isEmpty();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("ct")
   public static final String method9079(String var0, int var1) {
      if (var0 == null) {
         var0 = var1 + 1 + ": TEST";
      } else {
         var0 = 1 + var1 + ": " + var0;
      }

      return var0;
   }

   @ObfuscatedSignature(descriptor = "(Lpo;Lxy;IIIIIII)Z")
   @ObfuscatedName("gu")
   public static boolean method9044(classPO var0, classXY var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var0 == null) {
         var0.method9047(var1, var2, var2, var2, var2, var2, var2, var2);
      }

      try {
         if (var2 >= var3) {
            if (var8 != 1161561653) {
               throw new IllegalStateException();
            }

            if (var2 <= var4) {
               if (var8 != 1161561653) {
                  throw new IllegalStateException();
               }

               int var19 = var2 - var3;
               String var22 = var1.method13071(113374169);
               if (!var22.equalsIgnoreCase("hidden")) {
                  if (var8 != 1161561653) {
                     throw new IllegalStateException();
                  }

                  var0.method9048(var19, var22, (byte)-58);
               }

               return true;
            }
         }

         if (var5 == var2) {
            if (var8 != 1161561653) {
               throw new IllegalStateException();
            } else {
               int var18 = classXY.method13039(var1, -346779531);
               int var21 = classXY.method13039(var1, -346779531);
               String var24 = var1.method13071(-851437796);
               var0.method9049(var18, var21, var24, 1023779009);
               return true;
            }
         } else if (var2 == var6) {
            if (var8 != 1161561653) {
               throw new IllegalStateException();
            } else {
               int var17 = classXY.method13039(var1, -346779531);
               int var20 = classXY.method13047(var1, 1860506613);
               int var23 = classXY.method13047(var1, 1976193522);
               int var25 = var1.method13056((byte)1);
               int var26 = var1.method13056((byte)1);
               String var27 = var1.method13071(-441336935);
               var0.method9051(var17, var20, var23, var25, var26, var27, (byte)66);
               return true;
            }
         } else if (var7 == var2) {
            if (var8 != 1161561653) {
               throw new IllegalStateException();
            } else {
               int var9 = classXY.method13039(var1, -346779531);
               int var10 = classXY.method13047(var1, -1756125196);
               int var11 = classXY.method13047(var1, 67953986);
               int var12 = classXY.method13047(var1, 1965030463);
               int var13 = var1.method13056((byte)1);
               int var14 = var1.method13056((byte)1);
               String var15 = var1.method13071(-397015069);
               var0.method9054(var9, var10, var11, var12, var13, var14, var15, (byte)11);
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var16) {
         throw classEG.method3884(var16, "po.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II[I)Z")
   @ObfuscatedName("by")
   boolean method9067(int var1, int var2, int[] var3) {
      if (var1 < 0 || this.field5363.size() <= var1 || this.field5363.get(var1) == null || var2 < 0) {
         return false;
      } else if (var2 != 0) {
         classPB var5 = (classPB)this.field5363.get(var1);
         return var5.field5212.method9063(var2, 0, var3, (byte)80);
      } else {
         String var4 = this.vmethod551(var1, var3, (byte)-18);
         return var4 != null && !var4.isEmpty();
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lpo;")
   @ObfuscatedName("ah")
   classPO method9071(byte var1) {
      try {
         return new classPO();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "po.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;B)V")
   @ObfuscatedName("ar")
   void method9048(int var1, String var2, byte var3) {
      try {
         if (var1 < 0) {
            if (var3 == 3) {
               throw new IllegalStateException();
            }
         } else {
            for (int var4 = this.field5363.size(); var4 <= var1; var4++) {
               this.field5363.add(null);
            }

            this.field5363.set(var1, new classPB(var2));
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "po.ar(" + ')');
      }
   }

   classPO() {
   }

   @ObfuscatedSignature(descriptor = "()Lpo;")
   @ObfuscatedName("bd")
   classPO method9072() {
      return new classPO();
   }

   public int getNumOps() {
      return this.vmethod539((short)-18872);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   @Override
   public boolean vmethod543() {
      for (int var1 = 0; var1 < this.field5363.size(); var1++) {
         if (this.field5363.get(var1) != null && ((classPB)this.field5363.get(var1)).field5210 != null) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(I[I)I")
   @ObfuscatedName("bv")
   int method9075(int var1, int[] var2) {
      VarbitComposition var4 = (VarbitComposition)VarbitComposition.field5418.method6422(var1);
      VarbitComposition var3;
      if (null != var4) {
         var3 = var4;
      } else {
         byte[] var5 = VarbitComposition.field5423.method11867(14, var1, -1738556661);
         var4 = new VarbitComposition(new classXY(var5));
         VarbitComposition.field5418.method6428(var4, var1);
         var3 = var4;
      }

      return var3.method9212(var2[-1681019861 * var3.field5420], (short)1225);
   }

   @ObfuscatedSignature(descriptor = "(I[I)I")
   @ObfuscatedName("bh")
   int method9076(int var1, int[] var2) {
      VarbitComposition var4 = (VarbitComposition)VarbitComposition.field5418.method6422(var1);
      VarbitComposition var3;
      if (null != var4) {
         var3 = var4;
      } else {
         byte[] var5 = VarbitComposition.field5423.method11867(14, var1, -2140708705);
         var4 = new VarbitComposition(new classXY(var5));
         VarbitComposition.field5418.method6428(var4, var1);
         var3 = var4;
      }

      return var3.method9212(var2[464587567 * var3.field5420], (short)-26435);
   }

   @ObfuscatedSignature(descriptor = "(I[I)I")
   @ObfuscatedName("bz")
   int method9077(int var1, int[] var2) {
      VarbitComposition var4 = (VarbitComposition)VarbitComposition.field5418.method6422(var1);
      VarbitComposition var3;
      if (null != var4) {
         var3 = var4;
      } else {
         byte[] var5 = VarbitComposition.field5423.method11867(14, var1, -1766660822);
         var4 = new VarbitComposition(new classXY(var5));
         VarbitComposition.field5418.method6428(var4, var1);
         var3 = var4;
      }

      return var3.method9212(var2[773824800 * var3.field5420], (short)15360);
   }

   @Nullable
   @ObfuscatedSignature(descriptor = "(I[I)Ljava/lang/String;")
   @ObfuscatedName("fg")
   public String method9083(int var1, int[] var2) {
      return this.vmethod551(var1, var2, (byte)-13);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpo;)V")
   @ObfuscatedName("my")
   public static void method9062(classPO var0) {
      var0.field5363.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("cr")
   public static final String method9080(String var0, int var1) {
      if (var0 == null) {
         var0 = var1 + 1 + ": TEST";
      } else {
         var0 = 1 + var1 + ": " + var0;
      }

      return var0;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;IIIIII)Z")
   @ObfuscatedName("bm")
   boolean method9045(classXY var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 >= var3 && var2 <= var4) {
         int var17 = var2 - var3;
         String var20 = var1.method13071(1261840733);
         if (!var20.equalsIgnoreCase("hidden")) {
            this.method9048(var17, var20, (byte)-28);
         }

         return true;
      } else if (var5 == var2) {
         int var16 = classXY.method13039(var1, -346779531);
         int var19 = classXY.method13039(var1, -346779531);
         String var22 = var1.method13071(622997178);
         this.method9049(var16, var19, var22, 1023779009);
         return true;
      } else if (var2 == var6) {
         int var15 = classXY.method13039(var1, -346779531);
         int var18 = classXY.method13047(var1, -1572253125);
         int var21 = classXY.method13047(var1, 846614506);
         int var23 = var1.method13056((byte)1);
         int var24 = var1.method13056((byte)1);
         String var25 = var1.method13071(-622175458);
         this.method9051(var15, var18, var21, var23, var24, var25, (byte)-28);
         return true;
      } else if (var7 == var2) {
         int var8 = classXY.method13039(var1, -346779531);
         int var9 = classXY.method13047(var1, -798650124);
         int var10 = classXY.method13047(var1, -1952101419);
         int var11 = classXY.method13047(var1, -984448061);
         int var12 = var1.method13056((byte)1);
         int var13 = var1.method13056((byte)1);
         String var14 = var1.method13071(-830494741);
         this.method9054(var8, var9, var10, var11, var12, var13, var14, (byte)11);
         return true;
      } else {
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("cb")
   public static final String method9081(String var0, int var1) {
      if (var0 == null) {
         var0 = var1 + 1 + ": TEST";
      } else {
         var0 = 1 + var1 + ": " + var0;
      }

      return var0;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;IIIIII)Z")
   @ObfuscatedName("br")
   boolean method9046(classXY var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 >= var3 && var2 <= var4) {
         int var17 = var2 - var3;
         String var20 = var1.method13071(-464845294);
         if (!var20.equalsIgnoreCase("hidden")) {
            this.method9048(var17, var20, (byte)40);
         }

         return true;
      } else if (var5 == var2) {
         int var16 = classXY.method13039(var1, -346779531);
         int var19 = classXY.method13039(var1, -346779531);
         String var22 = var1.method13071(1718992567);
         this.method9049(var16, var19, var22, 1023779009);
         return true;
      } else if (var2 == var6) {
         int var15 = classXY.method13039(var1, -346779531);
         int var18 = classXY.method13047(var1, -1087473394);
         int var21 = classXY.method13047(var1, -1452890414);
         int var23 = var1.method13056((byte)1);
         int var24 = var1.method13056((byte)1);
         String var25 = var1.method13071(1120986594);
         this.method9051(var15, var18, var21, var23, var24, var25, (byte)-4);
         return true;
      } else if (var7 == var2) {
         int var8 = classXY.method13039(var1, -346779531);
         int var9 = classXY.method13047(var1, -429605590);
         int var10 = classXY.method13047(var1, 1888469593);
         int var11 = classXY.method13047(var1, 406812709);
         int var12 = var1.method13056((byte)1);
         int var13 = var1.method13056((byte)1);
         String var14 = var1.method13071(-721500326);
         this.method9054(var8, var9, var10, var11, var12, var13, var14, (byte)11);
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;IIIIIII)Z")
   @ObfuscatedName("ai")
   boolean method9047(classXY var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (var2 >= var3) {
            if (var8 != 1161561653) {
               throw new IllegalStateException();
            }

            if (var2 <= var4) {
               if (var8 != 1161561653) {
                  throw new IllegalStateException();
               }

               int var19 = var2 - var3;
               String var22 = var1.method13077(113374169);
               if (!var22.equalsIgnoreCase("hidden")) {
                  if (var8 != 1161561653) {
                     throw new IllegalStateException();
                  }

                  this.method9048(var19, var22, (byte)-58);
               }

               return true;
            }
         }

         if (var5 == var2) {
            if (var8 != 1161561653) {
               throw new IllegalStateException();
            } else {
               int var18 = classXY.method13039(var1, -346779531);
               int var21 = classXY.method13039(var1, -346779531);
               String var24 = var1.method13077(-851437796);
               this.method9049(var18, var21, var24, 1023779009);
               return true;
            }
         } else if (var2 == var6) {
            if (var8 != 1161561653) {
               throw new IllegalStateException();
            } else {
               int var17 = classXY.method13039(var1, -346779531);
               int var20 = classXY.method13047(var1, 1860506613);
               int var23 = classXY.method13047(var1, 1976193522);
               int var25 = var1.method13056((byte)1);
               int var26 = var1.method13249((byte)1);
               String var27 = var1.method13071(-441336935);
               this.method9051(var17, var20, var23, var25, var26, var27, (byte)66);
               return true;
            }
         } else if (var7 == var2) {
            if (var8 != 1161561653) {
               throw new IllegalStateException();
            } else {
               int var9 = classXY.method13039(var1, -346779531);
               int var10 = classXY.method13047(var1, -1756125196);
               int var11 = classXY.method13047(var1, 67953986);
               int var12 = classXY.method13047(var1, 1965030463);
               int var13 = var1.method13100((byte)1);
               int var14 = var1.method13202((byte)1);
               String var15 = var1.method13071(-397015069);
               this.method9054(var9, var10, var11, var12, var13, var14, var15, (byte)11);
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var16) {
         throw classEG.method3884(var16, "po.ai(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpo;IIIIIILjava/lang/String;)V")
   @ObfuscatedName("ow")
   public static void method9056(classPO var0, int var1, int var2, int var3, int var4, int var5, int var6, String var7) {
      classPB var8 = (classPB)var0.field5363.get(var1);
      if (null == var8.field5212) {
         var8.field5212 = var0.method9071((byte)15);
      }

      var8.field5212.method9051(var2, var3, var4, var5, var6, var7, (byte)-11);
   }

   @ObfuscatedSignature(descriptor = "()Lpo;")
   @ObfuscatedName("bs")
   classPO method9073() {
      return new classPO();
   }
}
