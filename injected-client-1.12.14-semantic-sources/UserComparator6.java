import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fp")
public class UserComparator6 extends AbstractUserComparator {
   @ObfuscatedSignature(descriptor = "Lxm;")
   @ObfuscatedName("cz")
   static IndexedSprite field1830;
   @ObfuscatedSignature(descriptor = "Lih;")
   @ObfuscatedName("mv")
   static MouseWheel mouseWheel;
   @ObfuscatedName("av")
   final boolean reversed;
   @ObfuscatedName("ct")
   static String otp;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field1827 = 3;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ag")
   public int method4041(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, -1186373917);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfp;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("zw")
   public static int method4042(UserComparator6 var0, Object var1, Object var2) {
      if (var0 == null) {
         var0.method4041(var1, var1);
      }

      return var0.compareBuddy((Buddy)var1, (Buddy)var2, -1054733510);
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;I)I")
   @ObfuscatedName("av")
   int compareBuddy(Buddy var1, Buddy var2, int var3) {
      try {
         if (0 != var1.world * 1914416777) {
            if (var3 >= 1856325427) {
               throw new IllegalStateException();
            }

            if (0 != var2.world * 1914416777) {
               if (var3 >= 1856325427) {
                  throw new IllegalStateException();
               }

               int var10000;
               if (this.reversed) {
                  if (var3 >= 1856325427) {
                     throw new IllegalStateException();
                  }

                  var10000 = var1.getUsername((byte)-112).compareToTyped(var2.getUsername((byte)-54), -335976648);
               } else {
                  var10000 = var2.getUsername((byte)-114).compareToTyped(var1.getUsername((byte)-94), 2002707868);
               }

               return var10000;
            }
         }

         return this.compareUser(var1, var2, (byte)-20);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "fp.av(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrj;Lvr;)V")
   @ObfuscatedName("wg")
   public static void method4040(LinkDeque var0, Link var1) {
      if (var0 == null) {
         var0.last();
      }

      if (var1.next != null) {
         var1.remove();
      }

      var1.next = var0.sentinel.next;
      var1.previous = var0.sentinel;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)Z")
   @ObfuscatedName("lu")
   public static boolean method4044(Widget var0) {
      return var0.field4521 * -1348354097 == 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfp;Ltm;Ltm;)I")
   @ObfuscatedName("ga")
   public static int method4036(UserComparator6 var0, Buddy var1, Buddy var2) {
      if (var0 == null) {
         return var0.method4039(var1, var1);
      } else if (0 != var1.world * 1914416777 && 0 != var2.world * 1914416777) {
         return var0.reversed
            ? var1.getUsername((byte)-79).compareToTyped(var2.getUsername((byte)-51), -188688175)
            : var2.getUsername((byte)-43).compareToTyped(var1.getUsername((byte)-25), -664586324);
      } else {
         return var0.compareUser(var1, var2, (byte)-31);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("an")
   public int method4043(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, -1438174210);
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("cm")
   static int method4045(int var0, Script var1, boolean var2, int var3) {
      try {
         if (7108 == var0) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WidgetConfigNode.method7991((byte)-9)
               ? 1
               : 0;
            return 1;
         } else {
            return 2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "fp.cm(" + 41);
      }
   }

   public UserComparator6(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;)I")
   @ObfuscatedName("ak")
   int method4037(Buddy var1, Buddy var2) {
      if (0 != var1.world * 1914416777 && 0 != var2.world * 1914416777) {
         return this.reversed
            ? var1.getUsername((byte)-108).compareToTyped(var2.getUsername((byte)-4), -1677829693)
            : var2.getUsername((byte)-88).compareToTyped(var1.getUsername((byte)-86), 1817424188);
      } else {
         return this.compareUser(var1, var2, (byte)-67);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;)I")
   @ObfuscatedName("aw")
   int method4038(Buddy var1, Buddy var2) {
      if (0 != var1.world * 1914416777 && 0 != var2.world * 1914416777) {
         return this.reversed
            ? var1.getUsername((byte)-34).compareToTyped(var2.getUsername((byte)-109), -1394580273)
            : var2.getUsername((byte)-27).compareToTyped(var1.getUsername((byte)-6), -703446909);
      } else {
         return this.compareUser(var1, var2, (byte)-33);
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.compareBuddy((Buddy)var1, (Buddy)var2, 1281159198);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fp.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;)I")
   @ObfuscatedName("aj")
   int method4039(Buddy var1, Buddy var2) {
      if (0 != var1.int2 * 1914416777 && 0 != var2.world * 1914416777) {
         return this.reversed
            ? var1.getUsername((byte)-79).compareToTyped(var2.getUsername((byte)-51), -188688175)
            : var2.getUsername((byte)-43).compareToTyped(var1.getUsername((byte)-25), -664586324);
      } else {
         return this.compareUser(var1, var2, (byte)-31);
      }
   }
}
