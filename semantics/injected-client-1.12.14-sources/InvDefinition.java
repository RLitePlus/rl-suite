import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gc")
public class InvDefinition extends DualNode {
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("av")
   public static AbstractArchive InvDefinition_archive;
   @ToRemove(unused = "true")
   @ObfuscatedName("da")
   static final int field1980 = 8;
   @ObfuscatedName("ag")
   public int size = 0;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("at")
   static EvictingDualNodeHashTable InvDefinition_cached = new EvictingDualNodeHashTable(64);

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ag")
   void decode(Buffer var1, int var2) {
      try {
         while (true) {
            int var3 = var1.readUnsignedByte(1552100604);
            if (var3 == 0) {
               if (var2 == -1830374410) {
                  throw new IllegalStateException();
               }

               return;
            }

            method4224(this, var1, var3, 2034080201);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gc.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lgc;")
   @ObfuscatedName("ae")
   public static InvDefinition method4217(int var0) {
      InvDefinition var1 = (InvDefinition)class402.method8806(InvDefinition_cached, var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = InvDefinition_archive.getFile(5, var0, -251608571);
         var1 = new InvDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2), -1832550546);
         }

         InvDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   InvDefinition() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public static void method4218() {
      InvDefinition_cached.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   public static void method4219() {
      InvDefinition_cached.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   public static void method4220() {
      InvDefinition_cached.clear();
   }

   @ObfuscatedSignature(descriptor = "(Lgc;Lxa;II)V")
   @ObfuscatedName("oj")
   public static void method4224(InvDefinition var0, Buffer var1, int var2, int var3) {
      if (var0 == null) {
         var0.decodeNext(var1, var2, var2);
      }

      try {
         if (var2 == 2) {
            var0.size = Buffer.method12008(var1, (byte)5) * 242669455;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gc.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ay")
   void method4222(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(-810577497);
         if (var2 == 0) {
            return;
         }

         method4224(this, var1, var2, 2023145277);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)J")
   @ObfuscatedName("ap")
   public static long method4227(int var0, byte var1) {
      try {
         if (var0 > 63) {
            if (var1 != 0) {
               throw new IllegalStateException();
            } else {
               throw new classRR(
                  "Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d",
                  new Object[]{var0}
               );
            }
         } else {
            return (long)Math.pow(2.0, var0) - 1L;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "gc.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("au")
   void method4225(Buffer var1, int var2) {
      if (var2 == 2) {
         this.size = Buffer.method12008(var1, (byte)5) * 242669455;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgc;Lxa;)V")
   @ObfuscatedName("rt")
   public static void method4223(InvDefinition var0, Buffer var1) {
      if (var0 == null) {
         var0.method4222(var1);
      }

      while (true) {
         int var2 = var1.readUnsignedByte(-1345392747);
         if (var2 == 0) {
            return;
         }

         method4224(var0, var1, var2, 2104074394);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("an")
   void decodeNext(Buffer var1, int var2, int var3) {
      try {
         if (var2 == 2) {
            this.size = Buffer.method12008(var1, (byte)5) * 242669455;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gc.an(" + ')');
      }
   }
}
