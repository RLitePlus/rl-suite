import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bd")
public class classBD {
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   public static final int field377 = 0;
   @ObfuscatedName("af")
   Future field375;
   @ToRemove(unused = "true")
   @ObfuscatedName("bq")
   static final int field378 = 65;
   @ObfuscatedName("az")
   ExecutorService field374 = Executors.newSingleThreadExecutor();
   @ToRemove(unused = "true")
   @ObfuscatedName("bv")
   static final int field379 = 96;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field376 = 20;

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("af")
   boolean method979(int var1) {
      try {
         return this.field375.isDone();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "bd.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   void method976() {
      this.field374.shutdown();
      this.field374 = null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ax")
   boolean method980() {
      return this.field375.isDone();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   void method977() {
      this.field374.shutdown();
      this.field374 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lyy;Ljava/lang/Object;B)V")
   @ObfuscatedName("cf")
   static void method990(classYY var0, Object var1, byte var2) {
      try {
         if (var0 == null) {
            if (var2 > 48) {
               throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
            }
         } else {
            switch (-900901303 * var0.field7107) {
               case 2:
                  classBB.field323[(classDY.field1679 += 120041229) * -324749371 - 1] = (Integer)var1;
                  break;
               case 3:
                  classBB.field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = (Long)var1;
                  break;
               case 4:
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var1;
                  break;
               default:
                  throw new IllegalStateException("pushValueOfType() failure - unsupported type");
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "bd.cf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbd;B)Ljava/security/SecureRandom;")
   @ObfuscatedName("sx")
   public static SecureRandom method983(classBD var0, byte var1) {
      if (var0 == null) {
         var0.method987(var1);
      }

      try {
         try {
            return (SecureRandom)var0.field375.get();
         } catch (Exception var3) {
            return classGP.method5547((byte)1);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "bd.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbd;)Ljava/security/SecureRandom;")
   @ObfuscatedName("qh")
   public static SecureRandom method984(classBD var0) {
      try {
         return (SecureRandom)var0.field375.get();
      } catch (Exception var2) {
         return classGP.method5547((byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aa")
   boolean method981() {
      return this.field375.isDone();
   }

   classBD() {
      this.field375 = this.field374.submit(new classDU());
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ao")
   boolean method982() {
      return this.field375.isDone();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/security/SecureRandom;")
   @ObfuscatedName("al")
   SecureRandom method985() {
      try {
         return (SecureRandom)this.field375.get();
      } catch (Exception var2) {
         return classGP.method5547((byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/security/SecureRandom;")
   @ObfuscatedName("ay")
   SecureRandom method986() {
      try {
         return (SecureRandom)this.field375.get();
      } catch (Exception var2) {
         return classGP.method5547((byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("au")
   static void method989(byte var0) {
      try {
         client.field893 = 9147219051952896537L;
         if (null != classPP.field5380) {
            if (var0 <= 126) {
               throw new IllegalStateException();
            }

            classPP.field5380.field1538 = 0;
         }

         classDD.field1405 = true;
         client.field835 = true;
         client.field923 = -4495327398113701859L;
         classZJ.field7189 = new classNV();
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
         client.field820 = 0;
         client.field941.method6521((byte)-40);
         classFP.method4919(-1512642514);
         classTZ.field6260 = 0;
         client.method1863(-1);
         classMD.method7534((byte)121);
         client.field945 = 0;
         client.field979 = false;
         classBI.field475.method10495(-1824285602);
         client.field994.method11434(0, -1739123893);
         client.field967 = 0;
         classMC.field4481 = null;
         classBA.field305 = 0;
         classBA.field311 = 1545843635;
         client.field859 = 0;
         client.field834 = 0;
         client.field916 = classCK.field766;
         client.field897 = classCK.field766;
         client.field814.method1626(-77096468);
         client.field846 = 0;
         client.field817.method7895();
         classYN.method13579(classYE.field6977);
         client.field837.method3047((byte)81);
         classQQ.field5597.method1293(1423332917);
         Arrays.fill(classLB.field4091, 0);
         Arrays.fill(classLB.field4090, 0);
         if (null != classSX.field6096) {
            if (var0 <= 126) {
               throw new IllegalStateException();
            }

            classDS.method3568(classSX.field6096, (byte)126);
         }

         client.field925.clear();
         if (-1 != -77072447 * classWK.field6691.field6612) {
            if (var0 <= 126) {
               throw new IllegalStateException();
            }

            classWK.field6691.method7387(classWK.field6691.field6612 * -77072447, 1312232715);
         }

         for (classPK var1 = (classPK)classWK.field6691.field6613.method13375(); null != var1; var1 = (classPK)classYK.method13401(classWK.field6691.field6613)) {
            if (var0 <= 126) {
               throw new IllegalStateException();
            }

            classPQ.method9106(classGB.field2546, var1, true, classWK.field6691, (byte)-113);
         }

         classWK.field6691.method12109((byte)125);
         classFP.method4919(-1522154020);
         client.field992.method6676(null, null, new int[]{0, 0, 0, 0, 0}, 0, -1, -741931325);

         for (int var3 = 0; var3 < 8; var3++) {
            if (var0 <= 126) {
               return;
            }

            client.field968[var3] = null;
            client.method2376(var3);
            client.field801[var3] = false;
         }

         classBH.field454 = new classYI(32);
         client.field891 = true;
         if (client.field795 != null) {
            if (var0 <= 126) {
               throw new IllegalStateException();
            }

            if (client.field795.field1535 == null) {
               if (var0 <= 126) {
                  throw new IllegalStateException();
               }
            } else {
               classJL var4 = classEF.method3849(classJS.WINDOW_STATUS, client.field795.field1535, (byte)22);
               classXY.method12971(var4.field3343, classLH.method7105(1904094042), (byte)-55);
               var4.field3343.method12973(773246731 * classSA.field5897, -1542382992);
               var4.field3343.method12973(classEU.field1938 * 8379747, -1542382992);
               client.field795.method3367(var4, -1301097035);
            }
         }

         classIB.field2935 = null;
         client.method2220(-1);
         classBM.field513 = null;
         Arrays.fill(client.field865, null);
         classKA.field3513 = null;
         client.method1836(-1);
         Arrays.fill(client.field866, null);
         classXH.method12755(classOE.field4843.field790, (byte)-81);

         for (int var5 = 0; var5 < 8; var5++) {
            if (var0 <= 126) {
               throw new IllegalStateException();
            }

            client.field864[var5] = new classMM();
            client.method1643(var5);
         }

         classON.field4994 = null;
         client.field798 = 0;
         client.field875 = 0;
         client.field990 = 0;
         client.field982 = 0;
         classOE.field4843.method11100(true, 477266699);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "bd.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   void method978(int var1) {
      try {
         this.field374.shutdown();
         this.field374 = null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "bd.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("ax")
   public static void method988(boolean var0, int var1) {
      try {
         if (classJP.field3357 != var0) {
            if (var1 <= 1718748145) {
               throw new IllegalStateException();
            }

            classLI.method7108(1438574197);
            classJP.field3357 = var0;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "bd.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/security/SecureRandom;")
   @ObfuscatedName("ae")
   SecureRandom method987(byte var1) {
      try {
         try {
            return (SecureRandom)this.field375.get();
         } catch (Exception var3) {
            return classGP.method5547((byte)1);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "bd.ae(" + ')');
      }
   }
}
