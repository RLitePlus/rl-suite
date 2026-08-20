import java.util.function.Consumer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bq")
public class MenuAction {
   @ObfuscatedName("aw")
   String target;
   @ObfuscatedName("at")
   int param1;
   @ObfuscatedName("ag")
   int opcode;
   @ObfuscatedName("an")
   int identifier;
   @ObfuscatedName("ae")
   int itemId;
   @ObfuscatedName("aj")
   int worldViewId;
   @ObfuscatedName("ak")
   String action;
   @ObfuscatedName("av")
   int param0;
   @ObfuscatedName("lf")
   public Consumer field331;
   @ObfuscatedName("ap")
   boolean field332;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("mj")
   public void method977(int var1) {
      this.param1 = var1 * -1812746979;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mm")
   public int method978() {
      return this.opcode * -261637247;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("rh")
   public String method979() {
      return this.target;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("zw")
   public int method980() {
      return this.identifier * -1309657229;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvu;)I")
   @ObfuscatedName("ve")
   public static int method975(classVU var0) {
      return var0.field6309 * -22855558;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("rd")
   public void method981(int var1) {
      this.param0 = var1 * 1867697229;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;)V")
   @ObfuscatedName("fy")
   public static void method976(WorldMap var0) {
      if (var0 == null) {
         var0.method11493();
      }

      var0.flashingElements = null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("zd")
   public String method982() {
      return this.action;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("eo")
   public int method983() {
      return this.param0 * -785822587;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("kt")
   public void method984(int var1) {
      this.itemId = var1 * -1560334611;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("yj")
   public void method985(String var1) {
      this.action = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("uj")
   public void method986(int var1) {
      this.opcode = var1 * 353141889;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("my")
   public void method987(int var1) {
      this.identifier = var1 * -1699428933;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luf;ZZZ)Z")
   @ObfuscatedName("ah")
   public static boolean method974(class524 var0, boolean var1, boolean var2, boolean var3) {
      return var0.method11129(-784785121 * var0.field6041, var1, var2, var3, 2011568177);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("nq")
   public int method988() {
      return this.worldViewId * -1357223757;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("wv")
   public int method989() {
      return this.param1 * 1849589045;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("zz")
   public void method990(int var1) {
      this.worldViewId = var1 * -1820948869;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ix")
   public int method991() {
      return this.itemId * 679501541;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("rz")
   public void method992(String var1) {
      this.target = var1;
   }

   MenuAction() {
   }
}
