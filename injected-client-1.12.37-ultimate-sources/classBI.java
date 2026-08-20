import net.runelite.api.GraphicsObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bi")
public final class classBI extends classEE implements GraphicsObject {
   @ObfuscatedName("aw")
   static int[] field476;
   @ObfuscatedName("af")
   int field470;
   @ObfuscatedName("ol")
   static int field474;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field472 = 3;
   @ObfuscatedName("ag")
   int field468;
   @ObfuscatedName("as")
   int field469;
   @ObfuscatedSignature(descriptor = "[Laac;")
   @ObfuscatedName("ay")
   public static classAAC[] field477;
   @ObfuscatedSignature(descriptor = "Lqr;")
   @ObfuscatedName("ac")
   final classQR field464;
   @ObfuscatedName("ax")
   int field465;
   @ObfuscatedName("ab")
   int field467;
   @ObfuscatedName("ae")
   int field471;
   @ObfuscatedSignature(descriptor = "Lsm;")
   @ObfuscatedName("kv")
   static classSM field475;
   @ObfuscatedSignature(descriptor = "Ldz;")
   @ObfuscatedName("az")
   final classDZ field466;
   @ToRemove(unused = "true")
   @ObfuscatedName("cr")
   static final int field473 = 106;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public static void method1093(int var0) {
      try {
         classJZ.method6431(classOW.field5183);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "bi.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   @Override
   protected boolean vmethod94() {
      if (this.field464.method9726(374233424) && this.field464.method9731((byte)50).method8749(this.field464.method9738(1833310060), 1284412146)) {
         return true;
      } else {
         classOR var1 = classAI.method376(-1841951179 * this.field465, -2130613085);
         classFX var2 = var1.method8726(123197522);
         return null != var2 && var2.field2444 != null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbi;I)V")
   @ObfuscatedName("yh")
   public static void method1094(classBI var0, int var1) {
      if (var0 == null) {
         var0.method1098(var1);
      } else if (!var0.method1091(-997627355)) {
         classAT.field277.method286(var0.field466, var0.field467 * 1586395561, -1285652349 * var0.field468, false, -416704557);
         int var2 = classRD.method9941(var0.field464, var1, classAT.field277, -853080321);
         classAAX.method290(classAT.field277, 107381215);
         if (0 != (var2 & 1)) {
            classQR.method9720(var0.field464, -1105023259);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lfx;")
   @ObfuscatedName("ae")
   @Override
   protected final classFX vmethod104(int var1) {
      return this.method1107();
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   @Override
   protected boolean vmethod95(int var1) {
      try {
         if (this.field464.method9726(374233424)) {
            if (var1 == -702405562) {
               throw new IllegalStateException();
            }

            if (this.field464.method9731((byte)95).method8749(this.field464.method9738(1810602030), 1284412146)) {
               if (var1 == -702405562) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         classOR var2 = classAI.method376(-1841951179 * this.field465, -2142576131);
         classFX var3 = var2.method8726(1685298176);
         if (null == var3 || var3.field2444 == null) {
            return false;
         } else if (var1 == -702405562) {
            throw new IllegalStateException();
         } else {
            return true;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "bi.ab(" + ')');
      }
   }

   public int getLevel() {
      return this.field471 * 1040651135;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   @Override
   protected int vmethod98(int var1) {
      try {
         int var10000;
         if (this.field464.method9726(374233424)) {
            if (var1 <= -1498749565) {
               throw new IllegalStateException();
            }

            var10000 = this.field464.method9731((byte)1).field5138 * -687960895;
         } else {
            var10000 = 0;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "bi.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   boolean method1087() {
      return !this.field464.method9726(374233424);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ax")
   boolean method1088() {
      return !this.field464.method9726(374233424);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbi;)Z")
   @ObfuscatedName("dc")
   public static boolean method1089(classBI var0) {
      return !var0.field464.method9726(374233424);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ac")
   boolean method1090() {
      return !this.field464.method9726(374233424);
   }

   public int getAnimationFrame() {
      return this.field464.field5602 * 292569817;
   }

   classBI(classDZ var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.field464 = new classQR();
      this.field466 = var1;
      this.field465 = 1497060381 * var2;
      this.field471 = 1755098239 * var3;
      this.field467 = var4 * 1654733465;
      this.field468 = -776090069 * var5;
      this.field469 = var6 * 475390849;
      this.field470 = 2008838029 * (var8 + var7);
      classQR.method9722(this.field464, classAI.method376(-1841951179 * this.field465, -2033763623).field5083 * 696329207, -2091936876);
      this.method1104();
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("az")
   boolean method1091(int var1) {
      try {
         boolean var10000;
         if (!this.field464.method9726(374233424)) {
            if (var1 >= -57176573) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "bi.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ao")
   boolean method1092() {
      return !this.field464.method9726(374233424);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ro")
   public int method1108() {
      return this.field468 * -1285652349;
   }

   @ObfuscatedSignature(descriptor = "()Lou;")
   @ObfuscatedName("hb")
   public classOU method1103() {
      return this.field464.field5599;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   @Override
   protected int vmethod99() {
      return this.field464.method9726(374233424) ? this.field464.method9731((byte)35).field5138 * -125401106 : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mp")
   public int method1109() {
      return this.field467 * 1586395561;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aq")
   final void method1095(int var1) {
      if (!this.method1091(-999939569)) {
         classAT.field277.method286(this.field466, this.field467 * 1586395561, -1285652349 * this.field468, false, -1241447601);
         int var2 = classRD.method9941(this.field464, var1, classAT.field277, -446443166);
         classAAX.method290(classAT.field277, -1884292736);
         if (0 != (var2 & 1)) {
            classQR.method9720(this.field464, 1711434617);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("xp")
   public classFX method1107() {
      classBI var1 = this;
      int var2 = -891174633;

      try {
         classFX var10000;
         if (classQR.method9763(var1.field464, 30, -1109955801)) {
            if (var2 <= -1767431455) {
               throw new IllegalStateException();
            }

            var1 = null;
            var10000 = var1;
         } else {
            classOR var3 = classAI.method376(var1.field465 * -1841951179, -1696391316);
            classFX var4 = var3.method8724(var1.field464.method9738(1922448585), 1593421514);
            if (var4 == null) {
               if (var2 <= -1767431455) {
                  throw new IllegalStateException();
               }

               var1 = null;
               var10000 = var1;
            } else {
               var10000 = var4;
            }
         }

         return var10000;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "bi.ae(" + ')');
      }
   }

   public int getZ() {
      return this.field469 * -1107927935;
   }

   public int getStartCycle() {
      return this.field470 * 1835952965;
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ap")
   @Override
   protected final classFX vmethod92() {
      if (classQR.method9763(this.field464, 30, -1136562440)) {
         return null;
      } else {
         classOR var1 = classAI.method376(this.field465 * 2138398622, -1757120346);
         classFX var2 = var1.method8724(this.field464.method9738(2102348236), 1763791194);
         return var2 == null ? null : var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lfx;")
   @ObfuscatedName("ad")
   @Override
   protected final classFX vmethod93() {
      if (classQR.method9763(this.field464, 30, -885166570)) {
         return null;
      } else {
         classOR var1 = classAI.method376(this.field465 * -1841951179, -1632774000);
         classFX var2 = var1.method8724(this.field464.method9738(1930803832), 1684359103);
         return var2 == null ? null : var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("qt")
   public void method1104() {
      GraphicsObjectCreated var1 = new GraphicsObjectCreated(this);
      classOE.field4843.getCallbacks().post(var1);
   }

   public LocalPoint getLocation() {
      return new LocalPoint(this.method1109(), this.method1108(), this.field466);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ar")
   @Override
   protected boolean vmethod96() {
      if (this.field464.method9726(374233424) && this.field464.method9731((byte)114).method8749(this.field464.method9738(1733913483), 1284412146)) {
         return true;
      } else {
         classOR var1 = classAI.method376(-1841951179 * this.field465, -1532281291);
         classFX var2 = var1.method8726(595564444);
         return null != var2 && var2.field2444 != null;
      }
   }

   public void setFinished(boolean var1) {
      if (!var1) {
         throw new UnsupportedOperationException();
      } else {
         this.field464.method9783();
      }
   }

   @ObfuscatedSignature(descriptor = "(ILlw;Llw;B)Llw;")
   @ObfuscatedName("ao")
   static classLW method1100(int var0, classLW var1, classLW var2, byte var3) {
      try {
         int var4 = 0;
         classLW var5 = null;

         for (int var6 = 1 + 63131743 * var2.field4260; var6 < var1.field4340.length; var6++) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }

            classLW var7 = var1.field4340[var6];
            if (null == var7) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               }
            } else if (var7.field4263 * 653784551 == var2.field4260 * 63131743) {
               if (++var4 - 1 == var0) {
                  if (var3 != 0) {
                     throw new IllegalStateException();
                  }

                  var5 = var7;
                  break;
               }
            }
         }

         return var5;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "bi.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldz;")
   @ObfuscatedName("jm")
   public classDZ method1110() {
      return this.field466;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   @Override
   protected boolean vmethod97() {
      if (this.field464.method9726(374233424) && this.field464.method9731((byte)99).method8749(this.field464.method9738(2000766998), 1284412146)) {
         return true;
      } else {
         classOR var1 = classAI.method376(-1841951179 * this.field465, -1286288334);
         classFX var2 = var1.method8726(-1408799262);
         return null != var2 && var2.field2444 != null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ay")
   final void method1096(int var1) {
      if (!this.method1091(-1279099477)) {
         classAT.field277.method286(this.field466, this.field467 * 406257313, 1533760510 * this.field468, false, -1378138958);
         int var2 = classRD.method9941(this.field464, var1, classAT.field277, -192061079);
         classAAX.method290(classAT.field277, 1580106184);
         if (0 != (var2 & 1)) {
            classQR.method9720(this.field464, -1721841807);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   @Override
   protected int vmethod100() {
      return this.field464.method9726(374233424) ? this.field464.method9731((byte)24).field5138 * -687960895 : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("av")
   @Override
   protected int vmethod101() {
      return this.field464.method9726(374233424) ? this.field464.method9731((byte)94).field5138 * -687960895 : 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbi;I)V")
   @ObfuscatedName("wo")
   public static void method1097(classBI var0, int var1) {
      if (var0 == null) {
         var0.method1107();
      }

      if (!var0.method1091(-1969342095)) {
         classAT.field277.method286(var0.field466, var0.field467 * 1586395561, -1285652349 * var0.field468, false, -1844648843);
         int var2 = classRD.method9941(var0.field464, var1, classAT.field277, -381287340);
         classAAX.method290(classAT.field277, -1658017930);
         if (0 != (var2 & 1)) {
            classQR.method9720(var0.field464, -674118334);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   protected int vmethod102() {
      return this.field464.method9726(374233424) ? this.field464.method9731((byte)103).field5138 * -687960895 : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   protected int vmethod103() {
      return this.field464.method9726(374233424) ? this.field464.method9731((byte)112).field5138 * -687960895 : 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ai")
   static void method1102(int var0) {
      try {
         classDJ.method3360(client.field795, -720419209);
         client.field795.field1529 = 0;
         client.field795.field1523.field6955 = 0;
         client.field795.field1520 = null;
         client.field795.field1533 = null;
         client.field795.field1532 = null;
         client.field795.field1531 = null;
         client.field795.field1525 = 0;
         client.field795.field1524 = 0;
         client.field939 = 0;
         client.field880 = "";
         classFP.method4919(-698578324);
         classBA.field305 = 0;
         client.field859 = 0;
         classIS.field3053.method3728(-1008620329);
         classBH.field454 = new classYI(32);
         classJB.method6345(30, -1192966987);
         if (client.field795 != null && client.field795.field1535 != null) {
            classJL var1 = classEF.method3849(classJS.WINDOW_STATUS, client.field795.field1535, (byte)-43);
            classXY.method12971(var1.field3343, classLH.method7105(-2145629943), (byte)-76);
            var1.field3343.method12973(classSA.field5897 * 773246731, -1542382992);
            var1.field3343.method12973(classEU.field1938 * 8379747, -1542382992);
            client.field795.method3367(var1, -1301097035);
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "bi.ai(" + ')');
      }
   }

   public boolean finished() {
      return this.field464.field5599 == null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("xs")
   public void method1106(int var1) {
      int var3 = var1;
      classBI var2 = this;
      int var4 = 2001249014;

      try {
         if (var2.method1091(-1464464194)) {
            if (var4 == 347879187) {
               throw new IllegalStateException();
            }
         } else {
            classAT.field277.method286(var2.field466, var2.field467 * 1586395561, -1285652349 * var2.field468, false, 1260699196);
            int var5 = classRD.method9941(var2.field464, var3, classAT.field277, -1252552908);
            classAAX.method290(classAT.field277, 1522032505);
            if (0 != (var5 & 1)) {
               if (var4 == 347879187) {
                  throw new IllegalStateException();
               }

               classQR.method9720(var2.field464, -1474253031);
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "bi.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ez")
   public void method1111(int var1) {
      this.field467 = var1 * 1654733465;
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ai")
   static final int method1101(int var0, int var1, int var2) {
      try {
         int var3 = classAK.method428(var0 - 1, var1 - 1, 1802280853)
            + classAK.method428(1 + var0, var1 - 1, 1573622702)
            + classAK.method428(var0 - 1, 1 + var1, 1808549159)
            + classAK.method428(1 + var0, var1 + 1, 1339759405);
         int var4 = classAK.method428(var0 - 1, var1, 2048099358)
            + classAK.method428(1 + var0, var1, 1397693901)
            + classAK.method428(var0, var1 - 1, 1404031470)
            + classAK.method428(var0, 1 + var1, 1594740970);
         int var5 = classAK.method428(var0, var1, 2085991794);
         return var3 / 16 + var4 / 8 + var5 / 4;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "bi.ai(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("af")
   final void method1105(int var1, int var2) {
      this.method1106(var1);
   }

   public classBI() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;)Z")
   @ObfuscatedName("cg")
   public static boolean method1099(classLW var0) {
      return var0.field4330 * 2133229739 == 2;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("vq")
   public void method1112(int var1) {
      this.field468 = var1 * -776090069;
   }

   public int getId() {
      return this.field465 * -1841951179;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   final void method1098(int var1) {
      if (!this.method1091(-997627355)) {
         classAT.field277.method286(this.field466, this.field468 * 1586395561, -1285652349 * this.field467, false, -416704557);
         int var2 = classRD.method9941(this.field464, var1, classAT.field277, -853080321);
         classAAX.method290(classAT.field277, 107381215);
         if (0 != (var2 & 1)) {
            classQR.method9720(this.field464, -1105023259);
         }
      }
   }
}
