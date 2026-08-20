import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl19")
public class rl19 {
   @ObfuscatedName("fq")
   public byte[] field5579;
   @ObfuscatedName("wo")
   public int field5589;
   @ObfuscatedSignature(descriptor = "Lry;")
   @ObfuscatedName("ef")
   public TransformationMatrix field5580;
   @ObfuscatedSignature(descriptor = "Lky;")
   @ObfuscatedName("cf")
   public Model field5578;
   @ObfuscatedName("jx")
   public int field5588;
   @ObfuscatedName("hl")
   public int field5587;
   @ObfuscatedSignature(descriptor = "Lry;")
   @ObfuscatedName("hi")
   public TransformationMatrix field5582;
   @ObfuscatedSignature(descriptor = "Lrl19;")
   @ObfuscatedName("zj")
   public static final rl19 field5583 = new rl19(true);
   @ObfuscatedName("vx")
   public float field5586;
   @ObfuscatedName("kp")
   public float field5585;
   @ObfuscatedName("fp")
   public float field5584;
   @ObfuscatedSignature(descriptor = "Lry;")
   @ObfuscatedName("xr")
   public TransformationMatrix field5581;
   @ObfuscatedSignature(descriptor = "[Lrl1;")
   @ObfuscatedName("tv")
   public rl1[] field5577 = new rl1[128];

   public rl19() {
      this.field5578 = new Model();
      this.field5579 = new byte[1];
      this.field5580 = new TransformationMatrix();
      this.field5581 = new TransformationMatrix();
      this.field5582 = new TransformationMatrix();
   }

   @ObfuscatedSignature(descriptor = "(Lry;I)V")
   @ObfuscatedName("hv")
   public void method9550(TransformationMatrix var1, int var2) {
      if (var2 >= this.field5577.length) {
         this.field5577 = Arrays.copyOf(this.field5577, var2 + 1);
      }

      rl1 var3 = this.field5577[var2];
      if (var3 == null) {
         var3 = this.field5577[var2] = new rl1();
      }

      var3.field5550.method10020(var1);
      var3.field5554 = var3.field5553 = true;
   }

   public rl19(boolean var1) {
      this.field5578 = Model.Model_sharedSequenceModel;
      this.field5579 = Model.Model_sharedSequenceModelFaceAlphas;
      this.field5580 = Model.field3549;
      this.field5581 = Model.field3550;
      this.field5582 = Model.field3551;
   }
}
