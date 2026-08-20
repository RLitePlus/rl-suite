import net.runelite.api.ParamHolder;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl9")
public interface rl9 extends ParamHolder {
   @ObfuscatedSignature(descriptor = "(I)Lvq;")
   @ObfuscatedName("jn")
   default Node method10127(int var1) {
      return this.getParams() == null ? null : (Node)this.getParams().get(var1);
   }

   default void setValue(int var1, String var2) {
      this.method10128(var1, new classVE(var2));
   }

   @ObfuscatedSignature(descriptor = "(Lyn;)V")
   @ObfuscatedName("vy")
   void vmethod537(IterableNodeHashTable var1);

   default String getStringValue(int var1) {
      Node var2 = this.method10127(var1);
      if (var2 != null) {
         classVE var5 = (classVE)var2;
         return (String)var5.method11936();
      } else {
         classPN var3 = classOE.client.method2273(var1);
         classYY var4 = classYY.method13792(var3.field5353 * 1468976603);
         if (var4 != classYY.field7113) {
            throw new IllegalArgumentException("trying to get string from " + var4 + " param");
         } else {
            return var3.method9039();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILvq;)V")
   @ObfuscatedName("kl")
   default void method10128(int var1, Node var2) {
      classPN var3 = classOE.client.method2273(var1);
      classYY var4 = classYY.method13792(var3.field5353 * 1468976603);
      if (var2 instanceof IntegerNode && var4 != classYY.field7111) {
         throw new IllegalArgumentException("trying to put int into " + var4 + " param");
      } else if (var2 instanceof classVK && var4 != classYY.field7115) {
         throw new IllegalArgumentException("trying to put long into " + var4 + " param");
      } else if (var2 instanceof classVE && var4 != classYY.field7113) {
         throw new IllegalArgumentException("trying to put string into " + var4 + " param");
      } else {
         if (this.getParams() == null) {
            this.vmethod537(new IterableNodeHashTable(16));
         }

         this.getParams().put(var2, var1);
      }
   }

   default void setValue(int var1, int var2) {
      this.method10128(var1, new IntegerNode(var2));
   }

   default long getLongValue(int var1) {
      Node var2 = this.method10127(var1);
      if (var2 != null) {
         classVE var5 = (classVE)var2;
         return (Long)var5.method11936();
      } else {
         classPN var3 = classOE.client.method2273(var1);
         classYY var4 = classYY.method13792(var3.field5353 * 1468976603);
         if (var4 != classYY.field7115) {
            throw new IllegalArgumentException("trying to get long from " + var4 + " param");
         } else {
            return var3.method9040();
         }
      }
   }

   default void setValue(int var1, long var2) {
      this.method10128(var1, new classVK(var2));
   }

   default int getIntValue(int var1) {
      Node var2 = this.method10127(var1);
      if (var2 != null) {
         IntegerNode var5 = (IntegerNode)var2;
         return var5.getValue();
      } else {
         classPN var3 = classOE.client.method2273(var1);
         classYY var4 = classYY.method13792(var3.field5353 * 1468976603);
         if (var4 != classYY.field7111) {
            throw new IllegalArgumentException("trying to get int from " + var4 + " param");
         } else {
            return var3.method9041();
         }
      }
   }
}
