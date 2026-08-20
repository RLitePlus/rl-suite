import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jp")
public class Task {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field3145 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field3144 = 2;
   @ObfuscatedName("ag")
   public volatile int status = 0;
   @ObfuscatedName("an")
   public int intArgument;
   @ObfuscatedName("ae")
   public volatile Object result;
   @ObfuscatedSignature(descriptor = "Ljp;")
   @ObfuscatedName("aj")
   Task next;
   @ObfuscatedName("aw")
   Object objectArgument;
   @ObfuscatedName("ak")
   int type;

   Task() {
   }
}
