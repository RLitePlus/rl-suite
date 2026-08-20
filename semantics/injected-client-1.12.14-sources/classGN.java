import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gn")
public class classGN extends classFM {
   @ObfuscatedName("at")
   int field2036;
   @ObfuscatedName("ag")
   int field2034;
   @ObfuscatedName("av")
   int field2037;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   public static final int field2033 = 15;
   @ObfuscatedName("an")
   int field2035;

   classGN(class154 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZB)I")
   @ObfuscatedName("ch")
   static int method4251(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (var0 == 6754) {
            int var8 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            NPCComposition var9 = AsyncHttpResponse.getNpcDefinition(var8, (byte)127);
            Object[] var10 = Interpreter.Interpreter_objectStack;
            int var11 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
            String var12;
            if (var9 != null) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               var12 = var9.name;
            } else {
               var12 = "";
            }

            var10[var11] = var12;
            return 1;
         } else if (6764 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               NPCComposition var7 = AsyncHttpResponse.getNpcDefinition(
                  Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize], (byte)24
               );
               int var5 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var7.method4710(var5, 486338061);
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var7.method4715(var5, (byte)0);
               return 1;
            }
         } else if (6765 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               NPCComposition var4 = AsyncHttpResponse.getNpcDefinition(
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], (byte)115
               );
               int[] var10000 = Interpreter.Interpreter_intStack;
               int var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               int var10002;
               if (null != var4) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  var10002 = var4.combatLevel * 1601675895;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "gn.ch(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod185(ClanSettings var1, byte var2) {
      try {
         var1.method4330(this.field2037 * -1829672007, 1545137031 * this.field2035, this.field2036 * -1941852729, this.field2034 * 395171731, (byte)9);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gn.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod184(Buffer var1) {
      this.field2037 = Buffer.method12015(var1, 1393706058) * -995546487;
      this.field2035 = Buffer.method12015(var1, -643812077) * 80013879;
      this.field2036 = var1.readUnsignedByte(646729185) * 1000866807;
      this.field2034 = var1.readUnsignedByte(1030469531) * -180363621;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod183(Buffer var1) {
      this.field2037 = Buffer.method12015(var1, -1861144) * -995546487;
      this.field2035 = Buffer.method12015(var1, 336382995) * 997545751;
      this.field2036 = var1.readUnsignedByte(-161788581) * 1000866807;
      this.field2034 = var1.readUnsignedByte(1014491690) * -180363621;
   }

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod186(ClanSettings var1) {
      var1.method4330(this.field2037 * -1829672007, 1545137031 * this.field2035, this.field2036 * -1941852729, this.field2034 * 395171731, (byte)28);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod182(Buffer var1, byte var2) {
      try {
         this.field2037 = Buffer.method12015(var1, 1207569114) * -995546487;
         this.field2035 = Buffer.method12015(var1, 1951415967) * 80013879;
         this.field2036 = var1.readUnsignedByte(-1281282978) * 1000866807;
         this.field2034 = var1.readUnsignedByte(729737269) * -180363621;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gn.av(" + ')');
      }
   }
}
