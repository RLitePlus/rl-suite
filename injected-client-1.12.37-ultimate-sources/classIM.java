import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("im")
public class classIM extends classIS {
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   public static final int field2993 = 19;
   @ObfuscatedName("az")
   int field2992;
   @ToRemove(unused = "true")
   @ObfuscatedName("bv")
   static final int field2998 = 130;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final int field2996 = 21;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field2995 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field2994 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   static final int field2997 = 44;

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod506(classXY var1) {
      this.field2992 = classXY.method13047(var1, 1363314717) * 1242480657;
      classXY.method13039(var1, -346779531);
      if (classXY.method13039(var1, -346779531) != 1874736274) {
         var1.field6955 -= -82698895;
         var1.method13059(488882632);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lie;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod511(classIE var1) {
      var1.method6179(this.field2992 * -876529621, -167076243);
   }

   @ObfuscatedSignature(descriptor = "(Lie;I)V")
   @ObfuscatedName("af")
   @Override
   void vmethod509(classIE var1, int var2) {
      try {
         var1.method6179(this.field2992 * 1506658405, -1172431142);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "im.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lie;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod510(classIE var1) {
      var1.method6179(this.field2992 * 1506658405, -1438515093);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod505(classXY var1) {
      this.field2992 = classXY.method13047(var1, 1902951631) * -953626631;
      classXY.method13039(var1, -346779531);
      if (classXY.method13039(var1, -346779531) != 341801299) {
         var1.field6955 -= 1347578625;
         var1.method13059(1817284262);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lie;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod508(classIE var1) {
      var1.method6179(this.field2992 * 1506658405, -1658141160);
   }

   classIM(classIX var1) {
      this.this$0 = var1;
      this.field2992 = 624187027;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod507(classXY var1, int var2) {
      try {
         this.field2992 = classXY.method13047(var1, 1663062833) * -624187027;
         classXY.method13039(var1, -346779531);
         if (classXY.method13039(var1, -346779531) != 255) {
            if (var2 >= 1072982787) {
               return;
            }

            var1.field6955 -= -1095856699;
            var1.method13059(-926205580);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "im.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("as")
   public static void method6224(int var0, int var1, int var2, int var3, int var4) {
      try {
         if (classNP.field4698.size() > 1 && classNP.field4698.get(0) != null) {
            if (var4 >= -545605385) {
               return;
            }

            if (((classNB)classNP.field4698.get(0)).field4641.method8041((byte)10)) {
               if (var4 >= -545605385) {
                  return;
               }

               if (classNP.field4698.get(1) != null) {
                  if (var4 >= -545605385) {
                     throw new IllegalStateException();
                  }

                  if (((classNB)classNP.field4698.get(1)).field4641.method8041((byte)10)) {
                     if (var4 >= -545605385) {
                        throw new IllegalStateException();
                     }

                     classIF.method6207(var0, var1, var2, var3, (byte)8);
                     classNP.field4700.add(new classWA(null));
                     ArrayList var5 = new ArrayList();
                     var5.add(new classWU(new classWP(null, 1, false, classNP.field4701 * 396217257), classNP.field4696 * -1350272915));
                     var5.add(new classWU(new classWO(null, 0, false, classNP.field4702 * 1784906769), classNP.field4703 * -1331669075));
                     classNP.field4700.add(new classWQ(null, var5));
                     if (classNP.field4699.get(0) != null && classNP.field4699.get(1) != null) {
                        classNB var6 = (classNB)classNP.field4699.get(0);
                        classNP.field4699.set(0, classNP.field4698.get(1));
                        classNP.field4699.set(1, var6);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "im.as(" + ')');
      }
   }
}
