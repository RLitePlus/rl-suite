import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sz")
public abstract class SongTask {
   @ObfuscatedName("aj")
   String field5881;
   @ObfuscatedName("ag")
   boolean field5882;
   @ObfuscatedSignature(descriptor = "Lsz;")
   @ObfuscatedName("an")
   SongTask songTask;
   @ObfuscatedName("ae")
   String field5880;
   @ObfuscatedName("ak")
   boolean field5883;
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   static final int field5879 = 2;

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("av")
   public abstract boolean vmethod325(byte var1);

   @ObfuscatedSignature(descriptor = "()Lsz;")
   @ObfuscatedName("al")
   public SongTask method10537() {
      return this.songTask;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method10528() {
      return this.field5882;
   }

   @ObfuscatedSignature(descriptor = "(S)Ljava/lang/String;")
   @ObfuscatedName("aw")
   public String method10533(short var1) {
      try {
         return "Error in task: " + this.field5881 + ", Error message: " + this.field5880;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sz.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lsz;")
   @ObfuscatedName("ap")
   public SongTask method10538(byte var1) {
      try {
         return this.songTask;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sz.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ah")
   public String method10534() {
      return "Error in task: " + this.field5881 + ", Error message: " + this.field5880;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   public abstract boolean vmethod327();

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   public boolean method10526() {
      return this.field5883;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("an")
   public abstract boolean vmethod326();

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   public boolean method10529() {
      return this.field5882;
   }

   SongTask(SongTask var1) {
      this.songTask = var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ac")
   public boolean method10530() {
      return this.field5882;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   public boolean method10531(int var1) {
      try {
         return this.field5882;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sz.ak(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsz;)Ljava/lang/String;")
   @ObfuscatedName("vm")
   public static String method10535(SongTask var0) {
      if (var0 == null) {
         var0.method10537();
      }

      return "Error in task: " + var0.field5881 + ", Error message: " + var0.field5880;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ar")
   public String method10536() {
      return "Error in task: " + this.field5881 + ", Error message: " + this.field5880;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ak")
   public boolean method10527(int var1) {
      try {
         return this.field5883;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sz.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;S)V")
   @ObfuscatedName("ci")
   static void method10543(Widget var0, short var1) {
      try {
         var0.method8152(-1724614069);
         var0.method8156(1910227574).method8528(new class85(var0), (byte)-92);
         classOO.method8526(var0.method8156(346330765), new classDH(var0), 1169539275);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sz.ci(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   public boolean method10532() {
      return this.field5882;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("am")
   void method10539(String var1) {
      this.field5883 = true;
      this.field5880 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("aa")
   void method10540(String var1) {
      this.field5883 = true;
      this.field5880 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lsz;Ljava/lang/String;B)V")
   @ObfuscatedName("pr")
   public static void method10541(SongTask var0, String var1, byte var2) {
      if (var0 == null) {
         var0.method10542(var1, var2);
      }

      try {
         var0.field5883 = true;
         var0.field5880 = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sz.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("ay")
   void method10542(String var1, byte var2) {
      try {
         this.field5882 = true;
         this.field5881 = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sz.ay(" + ')');
      }
   }
}
