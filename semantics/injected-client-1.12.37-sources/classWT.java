import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wt")
public abstract class classWT {
   @ObfuscatedName("ab")
   boolean field6778;
   @ObfuscatedSignature(descriptor = "Lwt;")
   @ObfuscatedName("ag")
   classWT field6775;
   @ObfuscatedName("as")
   String field6776;
   @ObfuscatedName("ax")
   String field6777;
   @ObfuscatedName("ac")
   boolean field6779;

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("az")
   public abstract boolean vmethod627(byte var1);

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("aa")
   public boolean method12614(byte var1) {
      try {
         return this.field6779;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "wt.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)Lwt;")
   @ObfuscatedName("al")
   public classWT method12621(short var1) {
      try {
         return this.field6775;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "wt.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lwt;")
   @ObfuscatedName("ai")
   public classWT method12622() {
      return this.field6775;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwt;)Ljava/lang/String;")
   @ObfuscatedName("rq")
   public static String method12616(classWT var0) {
      if (var0 == null) {
         var0.method12623();
      }

      return "Error in task: " + var0.field6777 + ", Error message: " + var0.field6776;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   public abstract boolean vmethod628();

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("af")
   public abstract boolean vmethod629();

   @ObfuscatedSignature(descriptor = "()Lwt;")
   @ObfuscatedName("aw")
   public classWT method12623() {
      return this.field6775;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ab")
   public abstract boolean vmethod630();

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ay")
   public boolean method12615() {
      return this.field6779;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ad")
   public String method12617() {
      return "Error in task: " + this.field6777 + ", Error message: " + this.field6776;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ap")
   public String method12618() {
      return "Error in task: " + this.field6777 + ", Error message: " + this.field6776;
   }

   classWT(classWT var1) {
      this.field6775 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lwt;Ljava/lang/String;B)V")
   @ObfuscatedName("uz")
   public static void method12624(classWT var0, String var1, byte var2) {
      if (var0 == null) {
         var0.method12627(var1, var2);
      }

      try {
         var0.field6778 = true;
         var0.field6776 = var1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "wt.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ae")
   public abstract boolean vmethod626();

   @ObfuscatedSignature(descriptor = "(Lwt;I)Ljava/lang/String;")
   @ObfuscatedName("uh")
   public static String method12619(classWT var0, int var1) {
      if (var0 == null) {
         var0.method12620(var1);
      }

      try {
         return "Error in task: " + var0.field6777 + ", Error message: " + var0.field6776;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "wt.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ac")
   public boolean method12613(int var1) {
      try {
         return this.field6778;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "wt.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("av")
   void method12625(String var1) {
      this.field6778 = true;
      this.field6776 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwt;Ljava/lang/String;)V")
   @ObfuscatedName("wq")
   public static void method12626(classWT var0, String var1) {
      if (var0 == null) {
         var0.method12617();
      }

      var0.field6778 = true;
      var0.field6776 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("aj")
   void method12627(String var1, byte var2) {
      try {
         this.field6778 = true;
         this.field6776 = var1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "wt.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ao")
   public String method12620(int var1) {
      try {
         return "Error in task: " + this.field6777 + ", Error message: " + this.field6777;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "wt.ao(" + ')');
      }
   }
}
