import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mw")
public class classMW {
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field4611 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field4612 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field4610 = 5;

   classMW() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   static void method7732(int var0) {
      ClientPreferences var1 = classOE.client.method2422();
      Buffer var2 = var1.method2845();
      classOE.client.field1115.execute(client::method2297);
   }
}
