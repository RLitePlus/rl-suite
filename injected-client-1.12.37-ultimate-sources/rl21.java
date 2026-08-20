import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl21")
public class rl21 {
   @ObfuscatedSignature(descriptor = "[Lrl2;")
   @ObfuscatedName("tr")
   public rl2[] field5722 = new rl2[128];
   @ObfuscatedSignature(descriptor = "Lrl21;")
   @ObfuscatedName("md")
   public static final rl21 field5728 = new rl21(true);
   @ObfuscatedSignature(descriptor = "Luu;")
   @ObfuscatedName("wg")
   public classUU field5727;
   @ObfuscatedName("ns")
   public int field5733;
   @ObfuscatedName("fj")
   public float field5730;
   @ObfuscatedSignature(descriptor = "Lfx;")
   @ObfuscatedName("us")
   public classFX field5723;
   @ObfuscatedName("ja")
   public float field5731;
   @ObfuscatedSignature(descriptor = "Luu;")
   @ObfuscatedName("ls")
   public classUU field5725;
   @ObfuscatedName("ca")
   public float field5729;
   @ObfuscatedSignature(descriptor = "Luu;")
   @ObfuscatedName("pt")
   public classUU field5726;
   @ObfuscatedName("py")
   public int field5734;
   @ObfuscatedName("ww")
   public byte[] field5724;
   @ObfuscatedName("hb")
   public int field5732;

   public rl21() {
      this.field5723 = new classFX();
      this.field5724 = new byte[1];
      this.field5725 = new classUU();
      this.field5726 = new classUU();
      this.field5727 = new classUU();
   }

   @ObfuscatedSignature(descriptor = "(Luu;I)V")
   @ObfuscatedName("ld")
   public void method10061(classUU var1, int var2) {
      if (var2 >= this.field5722.length) {
         this.field5722 = Arrays.copyOf(this.field5722, var2 + 1);
      }

      rl2 var3 = this.field5722[var2];
      if (var3 == null) {
         var3 = this.field5722[var2] = new rl2();
      }

      var3.field5716.method11649(var1);
      var3.field5720 = var3.field5719 = true;
   }

   public rl21(boolean var1) {
      this.field5723 = classFX.field2447;
      this.field5724 = classFX.field2472;
      this.field5725 = classFX.field2475;
      this.field5726 = classFX.field2460;
      this.field5727 = classFX.field2477;
   }
}
