import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sv")
public class classSV implements Callable {
   @ObfuscatedName("ab")
   final int field6070;
   @ObfuscatedSignature(descriptor = "Lsk;")
   @ObfuscatedName("af")
   final classSK field6069;
   @ObfuscatedSignature(descriptor = "Lsh;")
   @ObfuscatedName("ae")
   final classSH field6071;
   @ObfuscatedSignature(descriptor = "Lsu;")
   @ObfuscatedName("az")
   final classSU field6072;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field6073 = 31;

   @ObfuscatedSignature(descriptor = "(Lwz;I)V")
   @ObfuscatedName("ez")
   public static void method10696(classWZ var0, int var1) {
      if (var0 == null) {
         var0.method12679(var1);
      } else {
         var0.method12691(null);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lma;)Ljava/util/ArrayList;")
   @ObfuscatedName("ng")
   public static ArrayList method10691(classMA var0) {
      return var0.field4456.field4575;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyf;Ljava/lang/Long;Lxy;)V")
   @ObfuscatedName("os")
   public static void method10689(classYF var0, Long var1, classXY var2) {
      if (var0 == null) {
         var0.vmethod654(var2);
      }

      var2.method12987(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;Ljava/awt/event/WindowEvent;)V")
   @ObfuscatedName("xc")
   public static void method10694(classTQ var0, WindowEvent var1) {
      if (var0 == null) {
         var0.method10975();
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("af")
   public Object method10692() {
      this.field6072.method10656(144967014);
      classSU[][] var1;
      if (this.field6069 == classSK.field5973) {
         var1 = this.this$0.field6007;
      } else {
         var1 = this.this$0.field6006;
      }

      var1[this.field6070 * 31034317][this.field6071.method10440(-2029965570)] = this.field6072;
      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsv;)Ljava/lang/Object;")
   @ObfuscatedName("us")
   public static Object method10693(classSV var0) {
      var0.field6072.method10656(1132842632);
      classSU[][] var1;
      if (var0.field6069 == classSK.field5973) {
         var1 = var0.this$0.field6007;
      } else {
         var1 = var0.this$0.field6006;
      }

      var1[var0.field6070 * 31034317][var0.field6071.method10440(1389720683)] = var0.field6072;
      return null;
   }

   @Override
   public Object call() {
      try {
         this.field6072.method10656(736490956);
         classSU[][] var1;
         if (this.field6069 == classSK.field5973) {
            var1 = this.this$0.field6007;
         } else {
            var1 = this.this$0.field6006;
         }

         var1[this.field6070 * 31034317][this.field6071.method10440(317216094)] = this.field6072;
         return null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sv.call(" + ')');
      }
   }

   classSV(classSN var1, classSU var2, classSK var3, classSH var4, int var5) {
      this.this$0 = var1;
      this.field6072 = var2;
      this.field6069 = var3;
      this.field6071 = var4;
      this.field6070 = var5 * -541173499;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lup;)F")
   @ObfuscatedName("vy")
   public static float method10690(classUP var0) {
      return classED.method3828(var0.field6362 * 1379695375, 1196830319);
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/util/Date;")
   @ObfuscatedName("ao")
   static Date method10695(int var0) {
      try {
         Calendar var1 = Calendar.getInstance();
         var1.set(2, 0);
         var1.set(5, 1);
         var1.set(1, 1900);
         return var1.getTime();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sv.ao(" + ')');
      }
   }
}
