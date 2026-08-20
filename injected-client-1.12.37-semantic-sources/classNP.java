import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("np")
public class classNP {
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ax")
   public static AbstractArchive field4705;
   @ObfuscatedName("af")
   public static ArrayList field4704 = null;
   @ObfuscatedName("ae")
   public static LinkedList field4697 = new LinkedList();
   @ObfuscatedName("ab")
   public static ArrayList field4698 = new ArrayList(3);
   @ObfuscatedName("ac")
   static ArrayList field4699 = new ArrayList(3);
   @ObfuscatedName("az")
   public static final List field4695 = new ArrayList();
   @ObfuscatedName("aa")
   static ArrayList field4700 = new ArrayList();
   @ObfuscatedName("ao")
   static int field4703 = 0;
   @ObfuscatedName("al")
   static int field4702 = 0;
   @ObfuscatedName("aj")
   static int field4696 = 0;
   @ObfuscatedName("ay")
   static int field4701 = 0;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("an")
   public static void method7956(int var0, int var1) {
      classIF.method6207(var0, var1, 0, 0, (byte)-65);
      field4699.clear();
      field4700.clear();
      if (!field4698.isEmpty() && (0 != var0 || var1 != 0)) {
         field4700.add(new classWU(null, field4703 * -1331669075));
         field4700.add(new classWO(null, 0, false, 1784906769 * field4702));
         ArrayList var3 = new ArrayList();

         for (MidiRequest var5 : field4698) {
            var3.add(var5);
         }

         field4700.add(new classWL(null, var3));
      } else {
         classGK.method5486(1382397317);
      }
   }

   classNP() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ad")
   public static void method7948(int var0, int var1) {
      for (classNQ var3 : field4695) {
         var3.vmethod246(var0, var1, -688853523);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ap")
   public static void method7949(int var0, int var1) {
      for (classNQ var3 : field4695) {
         var3.vmethod246(var0, var1, 1735933590);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/ArrayList;IIIIZ)V")
   @ObfuscatedName("au")
   public static void method7950(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (!var0.isEmpty()) {
         field4697.clear();
         field4700.clear();
         if (var5) {
            classGK.method5486(835587696);
         } else {
            for (int var6 = 0; var6 < field4698.size(); var6++) {
               MidiRequest var7 = (MidiRequest)field4698.get(var6);
               if (var7 == null) {
                  field4698.remove(var6);
                  var6--;
               } else if (var7.field4633) {
                  if (917328323 * var7.field4641.field4751 > 0) {
                     var7.field4641.field4751 -= 201370557;
                  }

                  var7.field4641.method8040((byte)-58);
                  var7.field4641.method8026((byte)0);
                  var7.field4641.method8009(0, -1889816888);
                  field4698.remove(var6);
                  var6--;
               } else {
                  var7.field4633 = true;
               }
            }
         }

         if (!var5) {
            field4699.clear();
         }

         for (MidiRequest var14 : var0) {
            if (-1 != 1942111947 * var14.field4632 && 1846277290 * var14.field4630 != -1) {
               if (!var5) {
                  field4699.add(var14);
               }

               field4697.add(var14);
            }
         }

         if (!field4697.isEmpty()) {
            classIF.method6207(var1, var2, var3, var4, (byte)-128);
            field4700.add(new classWN(null));
            field4700.add(new classWS(null, classIA.field2927, classRM.field5809, field4705));
            ArrayList var13 = new ArrayList();
            var13.add(new classWK(new classWP(null, 0, true, field4701 * 396217257)));
            if (!field4698.isEmpty()) {
               ArrayList var15 = new ArrayList();
               var15.add(new classWU(new classWQ(null, var13), -1350272915 * field4696));
               ArrayList var9 = new ArrayList();

               for (MidiRequest var11 : field4698) {
                  var9.add(var11);
               }

               var15.add(new classWU(new classWO(new classWL(null, var9), 0, false, 1784906769 * field4702), -1331669075 * field4703));
               field4700.add(new classWQ(null, var15));
            } else {
               field4700.add(new classWU(null, 1716922079 * field4696));
               field4700.add(new classWQ(null, var13));
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bw")
   public static boolean method7973() {
      boolean var0 = false;
      boolean var1 = false;
      if (!field4700.isEmpty()) {
         classWT var2 = (classWT)field4700.get(0);
         if (var2 == null) {
            field4700.remove(0);
         } else if (var2.vmethod627((byte)93)) {
            if (var2.method12613(-360357532)) {
               System.out.println("Error in midimanager.service: " + classWT.method12619(var2, -596400562));
               var0 = true;
            } else {
               if (var2.method12621((short)-13712) != null) {
                  field4700.add(1, var2.method12621((short)11550));
               }

               var1 = var2.method12614((byte)63);
            }

            field4700.remove(0);
         } else {
            var1 = var2.method12614((byte)35);
         }
      }

      if (var0) {
         field4700.clear();
         classGK.method5486(1234715067);
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/ArrayList;IIIIZ)V")
   @ObfuscatedName("ar")
   public static void method7951(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (!var0.isEmpty()) {
         field4697.clear();
         field4700.clear();
         if (var5) {
            classGK.method5486(2126279217);
         } else {
            for (int var6 = 0; var6 < field4698.size(); var6++) {
               MidiRequest var7 = (MidiRequest)field4698.get(var6);
               if (var7 == null) {
                  field4698.remove(var6);
                  var6--;
               } else if (var7.field4633) {
                  if (917328323 * var7.field4641.field4751 > 0) {
                     var7.field4641.field4751 -= 16852715;
                  }

                  var7.field4641.method8040((byte)64);
                  var7.field4641.method8026((byte)0);
                  var7.field4641.method8009(0, -1531645374);
                  field4698.remove(var6);
                  var6--;
               } else {
                  var7.field4633 = true;
               }
            }
         }

         if (!var5) {
            field4699.clear();
         }

         for (MidiRequest var14 : var0) {
            if (-1 != 1942111947 * var14.field4632 && 450234221 * var14.field4630 != -1) {
               if (!var5) {
                  field4699.add(var14);
               }

               field4697.add(var14);
            }
         }

         if (!field4697.isEmpty()) {
            classIF.method6207(var1, var2, var3, var4, (byte)-32);
            field4700.add(new classWN(null));
            field4700.add(new classWS(null, classIA.field2927, classRM.field5809, field4705));
            ArrayList var13 = new ArrayList();
            var13.add(new classWK(new classWP(null, 0, true, field4701 * 396217257)));
            if (!field4698.isEmpty()) {
               ArrayList var15 = new ArrayList();
               var15.add(new classWU(new classWQ(null, var13), -1350272915 * field4696));
               ArrayList var9 = new ArrayList();

               for (MidiRequest var11 : field4698) {
                  var9.add(var11);
               }

               var15.add(new classWU(new classWO(new classWL(null, var9), 0, false, 1784906769 * field4702), -1331669075 * field4703));
               field4700.add(new classWQ(null, var15));
            } else {
               field4700.add(new classWU(null, -1350272915 * field4696));
               field4700.add(new classWQ(null, var13));
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldc;IIII)V")
   @ObfuscatedName("gj")
   public static void method7972(classDC var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method2909();
      }

      for (int var5 = 0; var5 < var0.field1389.size(); var5++) {
         ((Actor)var0.field1389.get(var5)).method3126(var1, var2, client.field855 * 1612595797, var3, var4, 472951642);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   public static void method7953(int var0) {
      if (!field4698.isEmpty()) {
         for (MidiRequest var2 : field4698) {
            if (null != var2) {
               var2.field4635 = var0 * -1016653583;
            }
         }

         MidiRequest var3 = (MidiRequest)field4698.get(0);
         if (var3 != null && null != var3.field4641 && var3.field4641.method8041((byte)10) && !var3.field4634) {
            var3.field4641.method8009(var0, -994327294);
            var3.field4631 = var0;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bf")
   static void method7980() {
      for (MidiRequest var1 : field4698) {
         if (null != var1) {
            var1.field4641.method8040((byte)-13);
            var1.field4641.method8026((byte)0);
            var1.field4641.method8009(0, -1035531065);
            var1.field4641.field4751 = 0;
            classAC.method316(var1.field4632 * 1942111947, var1.field4630 * 450234221, 1655233109);
         }
      }

      field4698.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   public static void method7954(int var0) {
      if (!field4698.isEmpty()) {
         for (MidiRequest var2 : field4698) {
            if (null != var2) {
               var2.field4635 = var0 * -1016653583;
            }
         }

         MidiRequest var3 = (MidiRequest)field4698.get(0);
         if (var3 != null && null != var3.field4641 && var3.field4641.method8041((byte)10) && !var3.field4634) {
            var3.field4641.method8009(var0, -1178039687);
            var3.field4631 = var0;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bc")
   public static boolean method7962(int var0) {
      if (field4699.isEmpty()) {
         return false;
      } else {
         MidiRequest var1 = (MidiRequest)field4699.get(0);
         return var1 != null && var0 == -213933842 * var1.field4632;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("by")
   static void method7976(int var0, int var1, int var2, int var3) {
      field4703 = var0 * 173745189;
      field4702 = -1367216911 * var1;
      field4696 = -269856411 * var2;
      field4701 = -1506539367 * var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("am")
   public static void method7957(int var0, int var1) {
      classIF.method6207(var0, var1, 0, 0, (byte)-15);
      field4699.clear();
      field4700.clear();
      if (!field4698.isEmpty() && (0 != var0 || var1 != 0)) {
         field4700.add(new classWU(null, field4703 * -1331669075));
         field4700.add(new classWO(null, 0, false, 1784906769 * field4702));
         ArrayList var3 = new ArrayList();

         for (MidiRequest var5 : field4698) {
            var3.add(var5);
         }

         field4700.add(new classWL(null, var3));
      } else {
         classGK.method5486(1000015836);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ah")
   public static boolean method7959() {
      if (!field4700.isEmpty()) {
         return true;
      } else {
         return !field4698.isEmpty() && field4698.get(0) != null && ((MidiRequest)field4698.get(0)).field4641 != null
            ? ((MidiRequest)field4698.get(0)).field4641.method8041((byte)10)
            : false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bn")
   public static void method7960(int var0, int var1, int var2, int var3) {
      if (field4698.size() > 1
         && field4698.get(0) != null
         && ((MidiRequest)field4698.get(0)).field4641.method8041((byte)10)
         && field4698.get(1) != null
         && ((MidiRequest)field4698.get(1)).field4641.method8041((byte)10)) {
         classIF.method6207(var0, var1, var2, var3, (byte)-37);
         field4700.add(new classWA(null));
         ArrayList var4 = new ArrayList();
         var4.add(new classWU(new classWP(null, 1, false, field4701 * 396217257), field4696 * 240984315));
         var4.add(new classWU(new classWO(null, 0, false, field4702 * 1784906769), field4703 * 1604098676));
         field4700.add(new classWQ(null, var4));
         if (field4699.get(0) != null && field4699.get(1) != null) {
            MidiRequest var5 = (MidiRequest)field4699.get(0);
            field4699.set(0, field4698.get(1));
            field4699.set(1, var5);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bx")
   public static void method7961(int var0, int var1, int var2, int var3) {
      if (field4698.size() > 1
         && field4698.get(0) != null
         && ((MidiRequest)field4698.get(0)).field4641.method8041((byte)10)
         && field4698.get(1) != null
         && ((MidiRequest)field4698.get(1)).field4641.method8041((byte)10)) {
         classIF.method6207(var0, var1, var2, var3, (byte)-64);
         field4700.add(new classWA(null));
         ArrayList var4 = new ArrayList();
         var4.add(new classWU(new classWP(null, 1, false, field4701 * 396217257), field4696 * -1350272915));
         var4.add(new classWU(new classWO(null, 0, false, field4702 * 1784906769), field4703 * -1331669075));
         field4700.add(new classWQ(null, var4));
         if (field4699.get(0) != null && field4699.get(1) != null) {
            MidiRequest var5 = (MidiRequest)field4699.get(0);
            field4699.set(0, field4698.get(1));
            field4699.set(1, var5);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bp")
   public static boolean method7963(int var0) {
      if (field4699.isEmpty()) {
         return false;
      } else {
         MidiRequest var1 = (MidiRequest)field4699.get(0);
         return var1 != null && var0 == 433890436 * var1.field4632;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("br")
   public static boolean method7964(int var0) {
      if (field4699.isEmpty()) {
         return false;
      } else {
         MidiRequest var1 = (MidiRequest)field4699.get(0);
         return var1 != null && var0 == 1942111947 * var1.field4632;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bm")
   public static boolean method7965() {
      return !field4699.isEmpty();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I)V")
   @ObfuscatedName("bo")
   public static void method7969(AbstractArchive var0, int var1) {
      if (!field4699.isEmpty()) {
         ArrayList var2 = new ArrayList();

         for (MidiRequest var4 : field4699) {
            var4.field4643 = false;
            var4.field4644 = false;
            var4.field4634 = false;
            var4.field4633 = false;
            var4.field4642 = var0;
            var4.field4635 = var1 * -1016653583;
            var4.field4631 = 0.0F;
            var2.add(var4);
         }

         classIJ.method6215(var2, field4703 * -1331669075, field4702 * 1784906769, -1350272915 * field4696, field4701 * 396217257, false, -2056553734);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   public static void method7967() {
      field4699.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bj")
   public static void method7968() {
      field4699.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I)V")
   @ObfuscatedName("bk")
   public static void method7970(AbstractArchive var0, int var1) {
      if (!field4699.isEmpty()) {
         ArrayList var2 = new ArrayList();

         for (MidiRequest var4 : field4699) {
            var4.field4643 = false;
            var4.field4644 = false;
            var4.field4634 = false;
            var4.field4633 = false;
            var4.field4642 = var0;
            var4.field4635 = var1 * -1942414620;
            var4.field4631 = 0.0F;
            var2.add(var4);
         }

         classIJ.method6215(var2, field4703 * -1331669075, field4702 * 1784906769, -1350272915 * field4696, field4701 * 1796004071, false, 482923099);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   public static void method7955(int var0) {
      if (!field4698.isEmpty()) {
         for (MidiRequest var2 : field4698) {
            if (null != var2) {
               var2.field4635 = var0 * -1016653583;
            }
         }

         MidiRequest var3 = (MidiRequest)field4698.get(0);
         if (var3 != null && null != var3.field4641 && var3.field4641.method8041((byte)10) && !var3.field4634) {
            var3.field4641.method8009(var0, -1847458023);
            var3.field4631 = var0;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;I)V")
   @ObfuscatedName("bu")
   public static void method7971(AbstractArchive var0, int var1) {
      if (!field4699.isEmpty()) {
         ArrayList var2 = new ArrayList();

         for (MidiRequest var4 : field4699) {
            var4.field4643 = false;
            var4.field4644 = false;
            var4.field4634 = false;
            var4.field4633 = false;
            var4.field4642 = var0;
            var4.field4635 = var1 * 2017941029;
            var4.field4631 = 0.0F;
            var2.add(var4);
         }

         classIJ.method6215(var2, field4703 * -1331669075, field4702 * 1784906769, -1350272915 * field4696, field4701 * 396217257, false, -946454553);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("at")
   public static void method7958(int var0, int var1) {
      classIF.method6207(var0, var1, 0, 0, (byte)-69);
      field4699.clear();
      field4700.clear();
      if (!field4698.isEmpty() && (0 != var0 || var1 != 0)) {
         field4700.add(new classWU(null, field4703 * -1331669075));
         field4700.add(new classWO(null, 0, false, 1784906769 * field4702));
         ArrayList var3 = new ArrayList();

         for (MidiRequest var5 : field4698) {
            var3.add(var5);
         }

         field4700.add(new classWL(null, var3));
      } else {
         classGK.method5486(927120993);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bt")
   public static boolean method7966() {
      return !field4699.isEmpty();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bb")
   public static boolean method7974() {
      boolean var0 = false;
      boolean var1 = false;
      if (!field4700.isEmpty()) {
         classWT var2 = (classWT)field4700.get(0);
         if (var2 == null) {
            field4700.remove(0);
         } else if (var2.vmethod627((byte)77)) {
            if (var2.method12613(345700378)) {
               System.out.println("Error in midimanager.service: " + classWT.method12619(var2, 564176047));
               var0 = true;
            } else {
               if (var2.method12621((short)1116) != null) {
                  field4700.add(1, var2.method12621((short)15669));
               }

               var1 = var2.method12614((byte)58);
            }

            field4700.remove(0);
         } else {
            var1 = var2.method12614((byte)70);
         }
      }

      if (var0) {
         field4700.clear();
         classGK.method5486(964546712);
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bi")
   static void method7977(int var0, int var1, int var2, int var3) {
      field4703 = var0 * 173745189;
      field4702 = -1367216911 * var1;
      field4696 = -269856411 * var2;
      field4701 = -1506539367 * var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("be")
   static void method7978(int var0, int var1, int var2, int var3) {
      field4703 = var0 * -345384078;
      field4702 = -1367216911 * var1;
      field4696 = 1764561522 * var2;
      field4701 = -1506539367 * var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/ArrayList;IIIIZ)V")
   @ObfuscatedName("ai")
   public static void method7952(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (!var0.isEmpty()) {
         field4697.clear();
         field4700.clear();
         if (var5) {
            classGK.method5486(1543291022);
         } else {
            for (int var6 = 0; var6 < field4698.size(); var6++) {
               MidiRequest var7 = (MidiRequest)field4698.get(var6);
               if (var7 == null) {
                  field4698.remove(var6);
                  var6--;
               } else if (var7.field4633) {
                  if (718030205 * var7.field4641.field4751 > 0) {
                     var7.field4641.field4751 -= 16852715;
                  }

                  var7.field4641.method8040((byte)21);
                  var7.field4641.method8026((byte)0);
                  var7.field4641.method8009(0, -1283171848);
                  field4698.remove(var6);
                  var6--;
               } else {
                  var7.field4633 = true;
               }
            }
         }

         if (!var5) {
            field4699.clear();
         }

         for (MidiRequest var14 : var0) {
            if (-1 != 1942111947 * var14.field4632 && 450234221 * var14.field4630 != -1) {
               if (!var5) {
                  field4699.add(var14);
               }

               field4697.add(var14);
            }
         }

         if (!field4697.isEmpty()) {
            classIF.method6207(var1, var2, var3, var4, (byte)6);
            field4700.add(new classWN(null));
            field4700.add(new classWS(null, classIA.field2927, classRM.field5809, field4705));
            ArrayList var13 = new ArrayList();
            var13.add(new classWK(new classWP(null, 0, true, field4701 * -300244770)));
            if (!field4698.isEmpty()) {
               ArrayList var15 = new ArrayList();
               var15.add(new classWU(new classWQ(null, var13), 1180751192 * field4696));
               ArrayList var9 = new ArrayList();

               for (MidiRequest var11 : field4698) {
                  var9.add(var11);
               }

               var15.add(new classWU(new classWO(new classWL(null, var9), 0, false, 1784906769 * field4702), -1331669075 * field4703));
               field4700.add(new classWQ(null, var15));
            } else {
               field4700.add(new classWU(null, -193149295 * field4696));
               field4700.add(new classWQ(null, var13));
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/ArrayList;IIII)V")
   @ObfuscatedName("bq")
   public static void method7979(ArrayList var0, int var1, int var2, int var3, int var4) {
      field4699.clear();
      field4699.addAll(var0);
      classIF.method6207(var1, var2, var3, var4, (byte)-32);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ba")
   public static boolean method7975() {
      boolean var0 = false;
      boolean var1 = false;
      if (!field4700.isEmpty()) {
         classWT var2 = (classWT)field4700.get(0);
         if (var2 == null) {
            field4700.remove(0);
         } else if (var2.vmethod627((byte)32)) {
            if (var2.method12613(1287677302)) {
               System.out.println("Error in midimanager.service: " + classWT.method12619(var2, 537966508));
               var0 = true;
            } else {
               if (var2.method12621((short)10676) != null) {
                  field4700.add(1, var2.method12621((short)16321));
               }

               var1 = var2.method12614((byte)88);
            }

            field4700.remove(0);
         } else {
            var1 = var2.method12614((byte)58);
         }
      }

      if (var0) {
         field4700.clear();
         classGK.method5486(1710909786);
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bs")
   static void method7981() {
      for (MidiRequest var1 : field4698) {
         if (null != var1) {
            var1.field4641.method8040((byte)44);
            var1.field4641.method8026((byte)0);
            var1.field4641.method8009(0, -602009511);
            var1.field4641.field4751 = 0;
            classAC.method316(var1.field4632 * 1942111947, var1.field4630 * 450234221, 1430970316);
         }
      }

      field4698.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bd")
   static void method7982() {
      for (MidiRequest var1 : field4698) {
         if (null != var1) {
            var1.field4641.method8040((byte)-28);
            var1.field4641.method8026((byte)0);
            var1.field4641.method8009(0, -1667497089);
            var1.field4641.field4751 = 0;
            classAC.method316(var1.field4632 * 175373375, var1.field4630 * -1101584675, 364487195);
         }
      }

      field4698.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bl")
   static void method7983() {
      for (MidiRequest var1 : field4698) {
         if (null != var1) {
            var1.field4641.method8040((byte)52);
            var1.field4641.method8026((byte)0);
            var1.field4641.method8009(0, -734783711);
            var1.field4641.field4751 = 0;
            classAC.method316(var1.field4632 * 1942111947, var1.field4630 * 450234221, 1389647141);
         }
      }

      field4698.clear();
   }
}
