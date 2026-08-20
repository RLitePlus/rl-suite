import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cp")
public class classCP {
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("au")
   static final classCP field1199 = new classCP();
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("af")
   static final classCP field1197 = new classCP();
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("ae")
   static final classCP field1196 = new classCP();
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("ab")
   static final classCP field1186 = new classCP();
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("ac")
   static final classCP field1185 = new classCP();
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("as")
   static final classCP field1184 = new classCP();
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("ax")
   static final classCP field1189 = new classCP();
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("aa")
   static final classCP field1191 = new classCP();
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("ay")
   static final classCP field1195 = new classCP();
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("ai")
   static final classCP field1200 = new classCP();
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("al")
   static final classCP field1193 = new classCP();
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("aj")
   static final classCP field1194 = new classCP();
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("ao")
   static final classCP field1192 = new classCP();
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("az")
   static final classCP field1183 = new classCP();
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("ad")
   static final classCP field1190 = new classCP();
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("ag")
   static final classCP field1187 = new classCP();
   @ObfuscatedName("le")
   static byte[][] field1204;
   @ObfuscatedName("bk")
   static int field1202;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field1201 = 21;
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("ap")
   static final classCP field1198 = new classCP();
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   static final String field1203 = "JX_CHARACTER_ID";
   @ObfuscatedSignature(descriptor = "Lcp;")
   @ObfuscatedName("aq")
   static final classCP field1188 = new classCP();

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("ae")
   public static void method2571(short var0) {
      try {
         EvictingDualNodeHashTable.method6431(classZU.field7271);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "cp.ae(" + ')');
      }
   }

   classCP() {
   }

   @ObfuscatedSignature(descriptor = "(Lva;Lva;Lva;I)V")
   @ObfuscatedName("az")
   public static void method2570(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, int var3) {
      try {
         classES.field1904 = var0;
         classWN.field6758 = var1;
         classEN.field1803 = var2;
         classVT var10000 = classEB.field1727;
         classEB.field1727.field6576 = (Arrays.hashCode(classOE.field4843.field1117.getClass().getSigners()) >> 2) * 721999872
            + -1694189056
            + (classSN.field5986 - 1) * 1337221120;
         var10000.field6583 = client.method2367();
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "cp.az(" + ')');
      }
   }
}
