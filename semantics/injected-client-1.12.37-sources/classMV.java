import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mv")
public class classMV {
   @ObfuscatedName("ae")
   public static Comparator field4606 = new classMY();
   @ObfuscatedName("ab")
   public static Comparator field4607 = new classMC();
   @ObfuscatedName("af")
   public static Comparator field4605 = new classMO();
   @ObfuscatedName("az")
   public static Comparator field4604 = new classMX();
   @ObfuscatedName("ag")
   public final List field4608;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field4609 = 18;

   static {
      new classNA();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;ZB)V")
   @ObfuscatedName("az")
   public void method7730(Comparator var1, boolean var2, byte var3) {
      try {
         if (var2) {
            if (var3 >= -1) {
               return;
            }

            Collections.sort(this.field4608, var1);
         } else {
            Collections.sort(this.field4608, Collections.reverseOrder(var1));
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "mv.az(" + ')');
      }
   }

   public classMV(Buffer var1, boolean var2) {
      int var3 = Buffer.method13047(var1, 1043215320);
      boolean var4 = Buffer.method13039(var1, -346779531) == 1;
      byte var5;
      if (var4) {
         var5 = 1;
      } else {
         var5 = 0;
      }

      int var6 = Buffer.method13047(var1, 1135316952);
      this.field4608 = new ArrayList(var6);

      for (int var7 = 0; var7 < var6; var7++) {
         this.field4608.add(new classNM(var1, var5, var3));
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;Z)V")
   @ObfuscatedName("af")
   public void method7731(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.field4608, var1);
      } else {
         Collections.sort(this.field4608, Collections.reverseOrder(var1));
      }
   }
}
