import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.WorldEntityDespawned;
import net.runelite.api.events.WorldViewUnloaded;
import net.runelite.api.hooks.Callbacks;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("cl")
public class classCL implements Iterable {
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field783 = 16;
   @ObfuscatedName("ae")
   final HashMap field780;
   @ObfuscatedSignature(descriptor = "Ltn;")
   @ObfuscatedName("ab")
   classTN field786;
   @ObfuscatedSignature(descriptor = "Ltw;")
   @ObfuscatedName("ag")
   classTW field787;
   @ObfuscatedSignature(descriptor = "Lyn;")
   @ObfuscatedName("az")
   final classYN field782 = new classYN(16);
   @ObfuscatedSignature(descriptor = "Ldz;")
   @ObfuscatedName("as")
   classDZ field785;
   @ObfuscatedName("af")
   final HashMap field781;
   @ObfuscatedName("ax")
   int field779;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   public static final int field784 = 22;

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F")
   @ObfuscatedName("az")
   static float[] method1581(JSONObject var0, String var1, int var2) throws JSONException {
      try {
         float[] var3 = new float[4];

         try {
            JSONArray var4 = var0.getJSONArray(var1);
            var3[0] = (float)var4.optDouble(0, 0.0);
            var3[1] = (float)var4.optDouble(1, 0.0);
            var3[2] = (float)var4.optDouble(2, 1.0);
            var3[3] = (float)var4.optDouble(3, 1.0);
         } catch (JSONException var5) {
            var3[0] = 0.0F;
            var3[1] = 0.0F;
            var3[2] = 1.0F;
            var3[3] = 1.0F;
         }

         return var3;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "cl.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILex;I)Ldz;")
   @ObfuscatedName("af")
   classDZ method1582(int var1, int var2, int var3, int var4, classEX var5, int var6) {
      try {
         classDZ var7 = new classDZ(var1, var2, var3, var4, var5);
         classYN.method13576(this.field782, var7, var1);
         this.field779 += -302879415;
         return var7;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "cl.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;I)Ltn;")
   @ObfuscatedName("mp")
   public static classTN method1619(classCL var0, int var1) {
      if (var0 == null) {
         var0.method1640(var1);
      }

      classTN var2 = (classTN)var0.field780.get(var1);
      return var2 != null ? var2 : var0.field786;
   }

   @ObfuscatedSignature(descriptor = "(II)Ldz;")
   @ObfuscatedName("an")
   classDZ method1595(int var1, int var2) {
      for (classDZ var4 : this) {
         if (!var4.method3719(-2087374717)) {
            int var5 = -1444178379 * var4.field1709;
            int var6 = -351145363 * var4.field1708;
            int var7 = -2132630835 * var4.field1696 + var5;
            int var8 = var4.field1692 * -1816400270 + var6;
            if (var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8) {
               return var4;
            }
         }
      }

      return this.field785;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqi;Ljava/lang/String;I)V")
   @ObfuscatedName("cc")
   public static void method1578(classQI var0, String var1, int var2) {
      var0.field5545.put(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Ldz;B)V")
   @ObfuscatedName("ab")
   void method1587(classDZ var1, byte var2) {
      this.method1631(var1);

      try {
         if (var1 != null) {
            if (var2 != 1) {
               throw new IllegalStateException();
            }

            this.field780.remove(var1.field1699 * 2140889407);
            this.field781.remove(2140889407 * var1.field1699);
            classDZ.method3745(var1, (byte)-59);
            var1.vmethod398();
            this.field779 -= -302879415;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cl.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IS)Ldz;")
   @ObfuscatedName("ag")
   public classDZ method1590(int var1, short var2) {
      try {
         return (classDZ)this.field782.method13595(var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cl.ag(" + ')');
      }
   }

   @Override
   public Iterator iterator() {
      try {
         return this.field782.iterator();
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "cl.iterator(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ki")
   public void method1632(int var1) {
      classSP var2 = (classSP)classIS.field3053.field1700.method13600(var1);
      if (var2 != null) {
         client.field1026.debug("WorldEntity despawn: {}", var2.field6009 * -1807801405);
         classOE.field4843.getCallbacks().post(new WorldEntityDespawned(var2));
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcl;IB)V")
   @ObfuscatedName("pd")
   public static void method1583(classCL var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method1585(var1, var2);
      } else {
         var0.method1633(var1);

         try {
            classDZ var3 = (classDZ)var0.field782.method13595(var1);
            var0.method1587(var3, (byte)1);
            var0.method1632(var1);
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "cl.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Ldz;")
   @ObfuscatedName("ax")
   classDZ method1596(int var1, int var2, int var3) {
      try {
         Iterator var4 = this.iterator();

         while (var4.hasNext()) {
            if (var3 >= 130197942) {
               throw new IllegalStateException();
            }

            classDZ var5 = (classDZ)var4.next();
            if (var5.method3719(-2087374717)) {
               if (var3 >= 130197942) {
                  throw new IllegalStateException();
               }
            } else {
               int var6 = -1444178379 * var5.field1709;
               int var7 = -351145363 * var5.field1708;
               int var8 = 1296729483 * var5.field1696 + var6;
               int var9 = var5.field1692 * -1269171107 + var7;
               if (var1 >= var6) {
                  if (var3 >= 130197942) {
                     throw new IllegalStateException();
                  }

                  if (var2 >= var7) {
                     if (var3 >= 130197942) {
                        throw new IllegalStateException();
                     }

                     if (var1 < var8) {
                        if (var3 >= 130197942) {
                           throw new IllegalStateException();
                        }

                        if (var2 < var9) {
                           if (var3 >= 130197942) {
                              throw new IllegalStateException();
                           }

                           return var5;
                        }
                     }
                  }
               }
            }
         }

         return this.field785;
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "cl.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("aa")
   int method1604(byte var1) {
      try {
         return this.field779 * -1688595207;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cl.aa(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;)V")
   @ObfuscatedName("ai")
   void method1588(classDZ var1) {
      if (var1 != null) {
         this.field780.remove(var1.field1699 * -1821332246);
         this.field781.remove(669987788 * var1.field1699);
         classDZ.method3745(var1, (byte)-51);
         var1.vmethod398();
         this.field779 -= -302879415;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lsp;")
   @ObfuscatedName("bc")
   classSP method1599(int var1) {
      return (classSP)method1592(this, -708227910).field1700.method13595(var1);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aj")
   void method1615(int var1, int var2) {
      try {
         this.field780.remove(var1);
         this.field781.remove(var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cl.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ltn;")
   @ObfuscatedName("ay")
   classTN method1620(int var1, int var2) {
      try {
         classTN var3 = (classTN)this.field780.get(var1);
         classTN var10000;
         if (var3 != null) {
            if (var2 != 206128317) {
               throw new IllegalStateException();
            }

            var10000 = var3;
         } else {
            var10000 = this.field786;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "cl.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bp")
   int method1605() {
      return this.field779 * 165613146;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ad")
   void method1626(int var1) {
      try {
         Iterator var2 = this.field782.iterator();

         while (var2.hasNext()) {
            if (var1 == -1755329566) {
               throw new IllegalStateException();
            }

            classDZ var3 = (classDZ)var2.next();
            this.method1587(var3, (byte)1);
         }

         classYN.method13579(this.field782);
         this.field779 = 0;
         this.field780.clear();
         this.field781.clear();
         this.field786 = classTN.field6172;
         this.field787 = classTW.field6243;
         if (null != this.field785) {
            classDZ.method3724(this.field785, 1840403635);
            classYN.method13576(this.field782, this.field785, 0L);
            this.field779 = -302879415;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "cl.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Ldz;")
   @ObfuscatedName("ap")
   classDZ method1579(int var1, int var2, int var3) {
      this.field785 = this.method1582(0, var1, var2, var3, classEX.field1977, -1393038213);
      return this.field785;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("au")
   void method1584(int var1) {
      classDZ var2 = (classDZ)this.field782.method13595(var1);
      this.method1587(var2, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(II)Ldz;")
   @ObfuscatedName("am")
   classDZ method1597(int var1, int var2) {
      for (classDZ var4 : this) {
         if (!var4.method3719(-2087374717)) {
            int var5 = -1444178379 * var4.field1709;
            int var6 = -351145363 * var4.field1708;
            int var7 = 1296729483 * var4.field1696 + var5;
            int var8 = var4.field1692 * -1269171107 + var6;
            if (var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8) {
               return var4;
            }
         }
      }

      return this.field785;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;)V")
   @ObfuscatedName("ar")
   void method1589(classDZ var1) {
      if (var1 != null) {
         this.field780.remove(var1.field1699 * 2140889407);
         this.field781.remove(2140889407 * var1.field1699);
         classDZ.method3745(var1, (byte)-22);
         var1.vmethod398();
         this.field779 -= -302879415;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("eo")
   static final void method1630(int var0, int var1, int var2) {
      try {
         if (-1927903443 * client.field974.field6797 < 2) {
            if (var2 != 1459476222) {
               throw new IllegalStateException();
            }

            if (client.field945 * -512792823 == 0) {
               if (var2 != 1459476222) {
                  return;
               }

               if (!client.field979) {
                  return;
               }
            }
         }

         if (!client.field858) {
            if (var2 != 1459476222) {
               throw new IllegalStateException();
            }
         } else {
            String var5;
            label79: {
               int var3 = -1927903443 * client.field974.field6797 - 1;
               if (client.field945 * -512792823 == 1) {
                  if (var2 != 1459476222) {
                     throw new IllegalStateException();
                  }

                  if (-1927903443 * client.field974.field6797 < 2) {
                     if (var2 != 1459476222) {
                        throw new IllegalStateException();
                     }

                     var5 = classKK.field3774 + classKK.field3785 + client.field804 + " " + classDO.field1590;
                     break label79;
                  }
               }

               if (client.field979) {
                  if (var2 != 1459476222) {
                     throw new IllegalStateException();
                  }

                  if (-1927903443 * client.field974.field6797 < 2) {
                     if (var2 != 1459476222) {
                        return;
                     }

                     var5 = client.field924 + classKK.field3785 + client.field983 + " " + classDO.field1590;
                     break label79;
                  }
               }

               var5 = classWZ.method12648(client.field974, var3, -115655011);
            }

            if (client.field974.field6797 * -1927903443 > 2) {
               if (var2 != 1459476222) {
                  throw new IllegalStateException();
               }

               var5 = var5 + classQY.method9847(16777215, (byte)104) + " " + '/' + " " + (-1927903443 * client.field974.field6797 - 2) + classKK.field3778;
            }

            classBB.field341.method97(var5, 4 + var0, 15 + var1, 16777215, 0, 1612595797 * client.field855 / 1000);
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "cl.eo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcl;ILtn;Ltw;I)V")
   @ObfuscatedName("xm")
   public static void method1611(classCL var0, int var1, classTN var2, classTW var3, int var4) {
      if (var0 == null) {
         var0.method1614(var1, var2, var3, var1);
      }

      try {
         var0.field780.put(var1, var2);
         var0.field781.put(var1, var3);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "cl.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ldz;")
   @ObfuscatedName("at")
   classDZ method1598(int var1, int var2) {
      for (classDZ var4 : this) {
         if (!var4.method3719(-2087374717)) {
            int var5 = -1444178379 * var4.field1709;
            int var6 = -351145363 * var4.field1708;
            int var7 = 1296729483 * var4.field1696 + var5;
            int var8 = var4.field1692 * -1269171107 + var6;
            if (var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8) {
               return var4;
            }
         }
      }

      return this.field785;
   }

   @ObfuscatedSignature(descriptor = "(I)Ldz;")
   @ObfuscatedName("gn")
   public classDZ method1634(int var1) {
      return this.method1590(var1, (short)2276);
   }

   @ObfuscatedSignature(descriptor = "(II)Ldz;")
   @ObfuscatedName("yq")
   public classDZ method1635(int var1, int var2) {
      return this.method1596(var1, var2, -1987881682);
   }

   @ObfuscatedSignature(descriptor = "(I)Lsp;")
   @ObfuscatedName("ah")
   classSP method1600(int var1) {
      return (classSP)method1592(this, -1922624912).field1700.method13595(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lcl;II)Lsp;")
   @ObfuscatedName("bl")
   public static classSP method1601(classCL var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method1603(var1, var1);
      } else {
         try {
            return (classSP)method1592(var0, -1107644636).field1700.method13595(var1);
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "cl.ac(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lsp;")
   @ObfuscatedName("bx")
   classSP method1602(int var1) {
      return (classSP)method1592(this, -1954751538).field1700.method13595(var1);
   }

   @ObfuscatedSignature(descriptor = "(ILcl;)Ldz;")
   @ObfuscatedName("ms")
   public static classDZ method1636(int var0, classCL var1) {
      return classQB.method9434(var0, var1, -780819548);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("be")
   public Iterator method1624() {
      return this.field782.iterator();
   }

   classCL() {
      this.field780 = new HashMap(16);
      this.field781 = new HashMap(16);
      this.field779 = 0;
      this.method1626(-1780765646);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("br")
   int method1606() {
      return this.field779 * -1688595207;
   }

   @ObfuscatedSignature(descriptor = "(Ltn;Ltw;)V")
   @ObfuscatedName("bt")
   void method1608(classTN var1, classTW var2) {
      this.field786 = var1;
      this.field787 = var2;
   }

   @ObfuscatedSignature(descriptor = "(Ltn;Ltw;)V")
   @ObfuscatedName("bj")
   void method1609(classTN var1, classTW var2) {
      this.field786 = var1;
      this.field787 = var2;
   }

   @ObfuscatedSignature(descriptor = "(I)Ltw;")
   @ObfuscatedName("bi")
   classTW method1621(int var1) {
      classTW var2 = (classTW)this.field781.get(var1);
      return var2 != null ? var2 : this.field787;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;ILtn;Ltw;)V")
   @ObfuscatedName("tu")
   public static void method1612(classCL var0, int var1, classTN var2, classTW var3) {
      var0.field780.put(var1, var2);
      var0.field781.put(var1, var3);
   }

   @ObfuscatedSignature(descriptor = "(ILtn;Ltw;)V")
   @ObfuscatedName("bo")
   void method1613(int var1, classTN var2, classTW var3) {
      this.field780.put(var1, var2);
      this.field781.put(var1, var3);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bu")
   void method1616(int var1) {
      this.field780.remove(var1);
      this.field781.remove(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)Ltn;")
   @ObfuscatedName("rd")
   public classTN method1637(int var1) {
      return this.method1620(var1, 206128317);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ba")
   void method1617(int var1) {
      this.field780.remove(var1);
      this.field781.remove(var1);
   }

   @ObfuscatedSignature(descriptor = "(IIII)Ldz;")
   @ObfuscatedName("az")
   classDZ method1580(int var1, int var2, int var3, int var4) {
      try {
         this.field785 = this.method1582(0, var1, var2, var3, classEX.field1977, -1393038213);
         return this.field785;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "cl.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bq")
   void method1627() {
      for (classDZ var2 : this.field782) {
         this.method1587(var2, (byte)1);
      }

      classYN.method13579(this.field782);
      this.field779 = 0;
      this.field780.clear();
      this.field781.clear();
      this.field786 = classTN.field6172;
      this.field787 = classTW.field6243;
      if (null != this.field785) {
         classDZ.method3724(this.field785, -674612632);
         classYN.method13576(this.field782, this.field785, 0L);
         this.field779 = -302879415;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcl;I)Ldz;")
   @ObfuscatedName("kk")
   public static classDZ method1592(classCL var0, int var1) {
      if (var0 == null) {
         return var0.method1594(var1);
      } else {
         try {
            return var0.field785;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "cl.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ldz;")
   @ObfuscatedName("aw")
   public classDZ method1591(int var1) {
      return (classDZ)this.field782.method13595(var1);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("by")
   public Iterator method1625() {
      return this.field782.iterator();
   }

   @ObfuscatedSignature(descriptor = "(ILcl;)Ldz;")
   @ObfuscatedName("wa")
   public static classDZ method1638(int var0, classCL var1) {
      return classHB.method5990(var0, var1, -849117969);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;)I")
   @ObfuscatedName("ur")
   public static int method1607(classCL var0) {
      return var0.field779 * -1688595207;
   }

   @ObfuscatedSignature(descriptor = "(Ltn;Ltw;I)V")
   @ObfuscatedName("ao")
   void method1610(classTN var1, classTW var2, int var3) {
      try {
         this.field786 = var1;
         this.field787 = var2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "cl.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)I")
   @ObfuscatedName("av")
   static int method1628(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         int var7 = classIZ.method6338(var0, var1, var2, var3, var4, var5, -1006283816);
         return Math.max(var7 - 64, 0);
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "cl.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bw")
   void method1618(int var1) {
      this.field780.remove(var1);
      this.field781.remove(var1);
   }

   @ObfuscatedSignature(descriptor = "(IIIILex;)Ldz;")
   @ObfuscatedName("yl")
   public classDZ method1639(int var1, int var2, int var3, int var4, classEX var5) {
      return this.method1582(var1, var2, var3, var4, var5, -1393038213);
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("dn")
   static void method1629(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         classJB.method6346(classCQ.field1220, var0, var1, var2, var3, var4, 887760572);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "cl.dn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;)V")
   @ObfuscatedName("ng")
   public void method1631(classDZ var1) {
      if (var1 != null) {
         if (var1.field1713 != null) {
            classOE.field4843.getCallbacks().post(new WorldViewUnloaded(var1));
         }

         if (client.field1118 != null) {
            client.field1118.despawnWorldView(var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcl;II)Ltw;")
   @ObfuscatedName("ko")
   public static classTW method1622(classCL var0, int var1, int var2) {
      if (var0 == null) {
         var0.method1623(var1, var1);
      }

      try {
         classTW var3 = (classTW)var0.field781.get(var1);
         classTW var10000;
         if (var3 != null) {
            if (var2 >= 1058766086) {
               throw new IllegalStateException();
            }

            var10000 = var3;
         } else {
            var10000 = var0.field787;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "cl.aq(" + ')');
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V")
   @ObfuscatedName("az")
   public static void method1586(String var0, String var1, String var2, int var3, int var4, byte var5) throws IOException {
      try {
         if (var1 != null) {
            if (var5 != 1) {
               return;
            }

            if (!var1.isEmpty()) {
               var0 = var0 + "-" + var1;
            }
         }

         classUP.field6363 = var4 * -552347913;
         classNB.field4637 = var3 * 381969765;

         try {
            classBL.field499 = System.getProperty("os.name");
         } catch (Exception var41) {
            classBL.field499 = "Unknown";
         }

         classZW.field7284 = classBL.field499.toLowerCase();
         classIE.field2954 = null;

         try {
            classIE.field2954 = System.getProperty("jagex.userhome");
         } catch (Exception var40) {
         }

         if (classIE.field2954 == null) {
            if (var5 != 1) {
               throw new IllegalStateException();
            }

            try {
               classIE.field2954 = System.getProperty("user.home");
            } catch (Exception var39) {
            }
         }

         if (null != classIE.field2954) {
            classIE.field2954 = classIE.field2954 + "/";
         }

         try {
            if (classZW.field7284.startsWith("win")) {
               if (var5 != 1) {
                  throw new IllegalStateException();
               }

               if (classIE.field2954 == null) {
                  if (var5 != 1) {
                     throw new IllegalStateException();
                  }

                  classIE.field2954 = client.method2366("USERPROFILE");
               }
            } else if (null == classIE.field2954) {
               if (var5 != 1) {
                  throw new IllegalStateException();
               }

               classIE.field2954 = client.method2366("HOME");
            }

            if (null != classIE.field2954) {
               if (var5 != 1) {
                  throw new IllegalStateException();
               }

               classIE.field2954 = classIE.field2954 + "/";
            }
         } catch (Exception var38) {
         }

         if (null == classIE.field2954) {
            classIE.field2954 = "~/";
         }

         classWQ.field6768 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", classIE.field2954, "/tmp/", ""};
         classCV.field1305 = new String[]{".jagex_cache_" + classNB.field4637 * 1602897005, ".file_store_" + classNB.field4637 * 1602897005};

         label695:
         for (int var6 = 0; var6 < 4; var6++) {
            if (var5 != 1) {
               throw new IllegalStateException();
            }

            String var8 = 0 == var6 ? "" : "" + var6;
            classDB.field1379 = new File(classIE.field2954, "jagex_cl_" + var0 + "_" + var2 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            if (classDB.field1379.exists()) {
               if (var5 != 1) {
                  throw new IllegalStateException();
               }

               classAAR var12 = null;
               boolean var33 = false /* VF: Semaphore variable */;

               label690: {
                  label689: {
                     try {
                        var33 = true;
                        var12 = new classAAR(classDB.field1379, "rw", 10000L);
                        classXY var13 = new classXY((int)var12.method257(-153393736));

                        while (702114061 * var13.field6955 < var13.field6954.length) {
                           if (var5 != 1) {
                              throw new IllegalStateException();
                           }

                           int var14 = var12.method260(
                              var13.field6954, var13.field6955 * 702114061, var13.field6954.length - 702114061 * var13.field6955, -1397369950
                           );
                           if (var14 == -1) {
                              throw new IOException();
                           }

                           var13.field6955 += -1095856699 * var14;
                        }

                        var13.field6955 = 0;
                        int var67 = classXY.method13039(var13, -346779531);
                        if (var67 >= 1) {
                           if (var5 != 1) {
                              throw new IllegalStateException();
                           }

                           if (var67 <= 3) {
                              int var15 = 0;
                              if (var67 > 1) {
                                 if (var5 != 1) {
                                    throw new IllegalStateException();
                                 }

                                 var15 = classXY.method13039(var13, -346779531);
                              }

                              if (var67 <= 2) {
                                 var9 = var13.method13077(-1671998117);
                                 if (1 == var15) {
                                    if (var5 != 1) {
                                       throw new IllegalStateException();
                                    }

                                    var10 = var13.method13077(941660467);
                                    var33 = false;
                                 } else {
                                    var33 = false;
                                 }
                              } else {
                                 var9 = classXY.method13082(var13, 1921404263);
                                 if (var15 == 1) {
                                    if (var5 != 1) {
                                       throw new IllegalStateException();
                                    }

                                    var10 = classXY.method13082(var13, -754422716);
                                    var33 = false;
                                 } else {
                                    var33 = false;
                                 }
                              }
                              break label689;
                           }
                        }

                        throw new IOException("" + var67);
                     } catch (Exception var44) {
                        var44.printStackTrace();
                        var33 = false;
                     } finally {
                        if (var33) {
                           try {
                              if (null != var12) {
                                 classAAR.method247(var12, (byte)1);
                              }
                           } catch (IOException var34) {
                           }
                        }
                     }

                     try {
                        if (null != var12) {
                           classAAR.method247(var12, (byte)1);
                        }
                     } catch (IOException var36) {
                     }
                     break label690;
                  }

                  try {
                     if (null != var12) {
                        if (var5 != 1) {
                           throw new IllegalStateException();
                        }

                        classAAR.method247(var12, (byte)1);
                     }
                  } catch (IOException var37) {
                  }
               }

               if (null != var9) {
                  File var62 = new File(var9);
                  if (!var62.exists()) {
                     var9 = null;
                  }
               }

               if (null != var9) {
                  if (var5 != 1) {
                     throw new IllegalStateException();
                  }

                  File var63 = new File(var9, "test.dat");
                  if (!classBB.method788(var63, true, -872624671)) {
                     var9 = null;
                  }
               }
            }

            if (var9 == null) {
               if (var5 != 1) {
                  throw new IllegalStateException();
               }

               if (0 == var6) {
                  if (var5 != 1) {
                     throw new IllegalStateException();
                  }

                  label657:
                  for (int var59 = 0; var59 < classCV.field1305.length; var59++) {
                     for (int var64 = 0; var64 < classWQ.field6768.length; var64++) {
                        if (var5 != 1) {
                           throw new IllegalStateException();
                        }

                        File var68 = new File(classWQ.field6768[var64] + classCV.field1305[var59] + File.separatorChar + var0 + File.separatorChar);
                        if (var68.exists()) {
                           if (var5 != 1) {
                              throw new IllegalStateException();
                           }

                           if (classBB.method788(new File(var68, "test.dat"), true, -1932202852)) {
                              var9 = var68.toString();
                              var11 = true;
                              break label657;
                           }
                        }
                     }
                  }
               }
            }

            if (var9 == null) {
               if (var5 != 1) {
                  return;
               }

               var9 = classIE.field2954 + File.separatorChar + "jagexcache" + var8 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
               var11 = true;
            }

            if (var10 != null) {
               if (var5 != 1) {
                  return;
               }

               File var60 = new File(var10);
               File var65 = new File(var9);

               try {
                  File[] var69 = var60.listFiles();
                  File[] var71 = var69;

                  for (int var16 = 0; var16 < var71.length; var16++) {
                     if (var5 != 1) {
                        return;
                     }

                     File var17 = var71[var16];
                     File var18 = new File(var65, var17.getName());
                     boolean var19 = var17.renameTo(var18);
                     if (!var19) {
                        throw new IOException();
                     }
                  }
               } catch (Exception var43) {
                  var43.printStackTrace();
               }

               var11 = true;
            }

            if (var11) {
               if (var5 != 1) {
                  return;
               }

               File var61 = new File(var9);
               Object var66 = null;

               try {
                  classAAR var70 = new classAAR(classDB.field1379, "rw", 10000L);
                  classXY var72 = new classXY(500);
                  classXY.method12971(var72, 3, (byte)-55);
                  byte var10001;
                  if (null != var66) {
                     if (var5 != 1) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  classXY.method12971(var72, var10001, (byte)-74);
                  var72.method13001(var61.getPath(), -910745300);
                  if (var66 != null) {
                     if (var5 != 1) {
                        throw new IllegalStateException();
                     }

                     var72.method13001(var66.getPath(), -910745300);
                  }

                  var70.method242(var72.field6954, 0, 702114061 * var72.field6955, -1522899189);
                  classAAR.method247(var70, (byte)1);
               } catch (IOException var35) {
                  var35.printStackTrace();
               }
            }

            File var7 = new File(var9);
            classSL.field5975 = var7;
            if (!classSL.field5975.exists()) {
               if (var5 != 1) {
                  throw new IllegalStateException();
               }

               classSL.field5975.mkdirs();
            }

            File[] var50 = classSL.field5975.listFiles();
            if (var50 != null) {
               File[] var53 = var50;

               for (int var56 = 0; var56 < var53.length; var56++) {
                  if (var5 != 1) {
                     return;
                  }

                  File var58 = var53[var56];
                  if (!classBB.method788(var58, false, 1172032847)) {
                     if (var5 != 1) {
                        throw new IllegalStateException();
                     }
                     continue label695;
                  }
               }
            }
            break;
         }

         File var47 = classSL.field5975;
         classMT.field4586 = var47;
         if (classMT.field4586.exists()) {
            classMT.field4580 = true;

            try {
               File var48 = new File(classIE.field2954, "random.dat");
               if (var48.exists()) {
                  classME.field4490 = new classAAC(new classAAR(var48, "rw", 25L), 24, 0);
               } else {
                  label598:
                  for (int var51 = 0; var51 < classCV.field1305.length; var51++) {
                     for (int var54 = 0; var54 < classWQ.field6768.length; var54++) {
                        if (var5 != 1) {
                           throw new IllegalStateException();
                        }

                        File var57 = new File(classWQ.field6768[var54] + classCV.field1305[var51] + File.separatorChar + "random.dat");
                        if (var57.exists()) {
                           if (var5 != 1) {
                              return;
                           }

                           classME.field4490 = new classAAC(new classAAR(var57, "rw", 25L), 24, 0);
                           break label598;
                        }
                     }
                  }
               }

               if (classME.field4490 == null) {
                  if (var5 != 1) {
                     return;
                  }

                  RandomAccessFile var52 = new RandomAccessFile(var48, "rw");
                  int var55 = var52.read();
                  var52.seek(0L);
                  var52.write(var55);
                  var52.seek(0L);
                  var52.close();
                  classME.field4490 = new classAAC(new classAAR(var48, "rw", 25L), 24, 0);
               }
            } catch (IOException var42) {
            }

            classME.field4488 = new classAAC(new classAAR(classBJ.method1113("main_file_cache.dat2", -2138930382), "rw", 1048576000L), 5200, 0);
            classME.field4489 = new classAAC(new classAAR(classBJ.method1113("main_file_cache.idx255", -2139055959), "rw", 1048576L), 6000, 0);
            classBI.field477 = new classAAC[classUP.field6363 * -646722873];

            for (int var49 = 0; var49 < -646722873 * classUP.field6363; var49++) {
               if (var5 != 1) {
                  return;
               }

               classBI.field477[var49] = new classAAC(new classAAR(classBJ.method1113("main_file_cache.idx" + var49, -374206652), "rw", 1048576L), 6000, 0);
            }
         } else if (var5 == 1) {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var46) {
         throw classEG.method3884(var46, "cl.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("sx")
   public void method1633(int var1) {
      classDZ var2 = this.method1634(var1);
      if (var2 != null) {
         Callbacks var3 = classOE.field4843.getCallbacks();

         for (classDN var5 : var2.npcs()) {
            var3.post(new NpcDespawned(var5));
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ae")
   void method1585(int var1, byte var2) {
      this.method1633(var1);

      try {
         classDZ var3 = (classDZ)this.field782.method13572(var1);
         this.method1587(var3, (byte)1);
         this.method1633(var1);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "cl.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lsp;")
   @ObfuscatedName("ac")
   classSP method1603(int var1, int var2) {
      try {
         return (classSP)method1592(this, -1107644636).field1700.method13600(var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "cl.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldz;")
   @ObfuscatedName("av")
   public classDZ method1593() {
      return this.field785;
   }

   @ObfuscatedSignature(descriptor = "(II)Ltw;")
   @ObfuscatedName("aq")
   classTW method1623(int var1, int var2) {
      try {
         classTW var3 = (classTW)this.field780.get(var1);
         classTW var10000;
         if (var3 != null) {
            if (var2 >= 1058766086) {
               throw new IllegalStateException();
            }

            var10000 = var3;
         } else {
            var10000 = this.field787;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "cl.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILtn;Ltw;I)V")
   @ObfuscatedName("al")
   void method1614(int var1, classTN var2, classTW var3, int var4) {
      try {
         this.field781.put(var1, var2);
         this.field781.put(var1, var3);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "cl.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ltn;")
   @ObfuscatedName("bb")
   classTN method1640(int var1) {
      return this.method1620(var1, 206128317);
   }

   @ObfuscatedSignature(descriptor = "(I)Ldz;")
   @ObfuscatedName("as")
   public classDZ method1594(int var1) {
      try {
         return this.field785;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cl.as(" + ')');
      }
   }
}
