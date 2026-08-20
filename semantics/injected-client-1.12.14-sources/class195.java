import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hh")
class class195 implements ThreadFactory {
   @ObfuscatedName("ui")
   static int field2200;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field2196 = 11;
   @ToRemove(unused = "true")
   @ObfuscatedName("ee")
   static final int field2199 = 12;
   @ToRemove(unused = "true")
   @ObfuscatedName("cn")
   static final int field2198 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   static final int field2197 = 106;

   @ObfuscatedSignature(descriptor = "(I)[Ljava/lang/Object;")
   @ObfuscatedName("be")
   static Object[] method4536(int var0) {
      try {
         String var1 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         Object[] var2 = new Object[var1.length()];

         for (int var3 = var1.length() - 1; var3 >= 0; var3--) {
            if (var1.charAt(var3) == 'i') {
               if (var0 == -1570876979) {
                  throw new IllegalStateException();
               }

               var2[var3] = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            } else {
               var2[var3] = Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            }
         }

         return var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hh.be(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhh;Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("nj")
   public static Thread method4534(class195 var0, Runnable var1) {
      if (var0 == null) {
         var0.newThread(var1);
      }

      return new Thread(var1, "OSRS Maya Anim Load");
   }

   @Override
   public Thread newThread(Runnable var1) {
      try {
         return new Thread(var1, "OSRS Maya Anim Load");
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hh.newThread(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfq;)I")
   @ObfuscatedName("nl")
   public static int method4532(class140 var0) {
      return -1142185869 * var0.field1838;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("av")
   public Thread method4535(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   class195(SequenceDefinition var1) {
      this.this$0 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lna;I)I")
   @ObfuscatedName("lh")
   public static int method4533(MidiFileReader var0, int var1) {
      if (var0 == null) {
         var0.method7589(var1, var1);
      }

      return var0.readMessage0(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("oo")
   static final void Clan_leaveChat(int var0) {
      try {
         PacketBufferNode var1 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3896, client.packetWriter.isaacCipher, -1525616863);
         var1.packetBuffer.writeByte(0, (short)-8564);
         PacketWriter.method3330(client.packetWriter, var1, -1771370198);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hh.oo(" + ')');
      }
   }
}
