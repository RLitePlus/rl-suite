import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import sun.misc.Unsafe;

@ObfuscatedName("zw")
public class classZW extends classZN {
   @ObfuscatedName("vd")
   public static final Unsafe field7279 = method14212();
   @ObfuscatedName("pl")
   public long field7283;
   @ObfuscatedName("aq")
   public static String field7284;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field7281 = 24624;
   @ObfuscatedName("dt")
   public int field7282;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ae")
   static AbstractArchive field7286;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field7280 = 16384;
   @ObfuscatedName("az")
   ByteBuffer field7285;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("qd")
   public void method14213() {
      if (field7279 != null) {
         field7279.freeMemory(this.field7283);
         this.field7283 = 0L;
         this.field7282 = 0;
      }
   }

   classZW() {
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ad")
   @Override
   void vmethod664(byte[] var1) {
      this.field7285 = ByteBuffer.allocateDirect(var1.length);
      ((java.nio.Buffer)this.field7285).position(0);
      this.field7285.put(var1);
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("au")
   @Override
   void vmethod665(byte[] var1) {
      this.field7285 = ByteBuffer.allocateDirect(var1.length);
      ((java.nio.Buffer)this.field7285).position(0);
      this.field7285.put(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("ab")
   @Override
   byte[] vmethod658(int var1) {
      if (field7279 != null) {
         byte[] var3 = new byte[this.field7282];
         field7279.copyMemory(null, this.field7283, var3, Unsafe.ARRAY_BYTE_BASE_OFFSET, this.field7282);
         return var3;
      } else {
         byte[] var2 = new byte[this.field7285.capacity()];
         this.field7285.position(0);
         this.field7285.get(var2);
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("aj")
   @Override
   byte[] vmethod662() {
      byte[] var1 = new byte[this.field7285.capacity()];
      ((java.nio.Buffer)this.field7285).position(0);
      this.field7285.get(var1);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Lsun/misc/Unsafe;")
   @ObfuscatedName("er")
   public static Unsafe method14212() {
      try {
         Field var0 = Unsafe.class.getDeclaredField("theUnsafe");
         if (!var0.getType().equals(Unsafe.class)) {
            return null;
         } else {
            int var1 = var0.getModifiers();
            if (Modifier.isStatic(var1) && Modifier.isFinal(var1)) {
               var0.setAccessible(true);
               return (Unsafe)var0.get(null);
            } else {
               return null;
            }
         }
      } catch (Exception var2) {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ay")
   @Override
   byte[] vmethod660() {
      byte[] var1 = new byte[this.field7285.capacity()];
      ((java.nio.Buffer)this.field7285).position(0);
      this.field7285.get(var1);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("aq")
   @Override
   void vmethod663(byte[] var1) {
      this.field7285 = ByteBuffer.allocateDirect(var1.length);
      ((java.nio.Buffer)this.field7285).position(0);
      this.field7285.put(var1);
   }

   @ObfuscatedSignature(descriptor = "([BI)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod659(byte[] var1, int var2) {
      if (field7279 != null) {
         assert this.field7283 == 0L;

         long var3 = field7279.allocateMemory(var1.length);
         field7279.copyMemory(var1, Unsafe.ARRAY_BYTE_BASE_OFFSET, null, var3, var1.length);
         this.field7283 = var3;
         this.field7282 = var1.length;
      } else {
         this.field7285 = ByteBuffer.allocateDirect(var1.length);
         this.field7285.position(0);
         this.field7285.put(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ap")
   @Override
   void vmethod666(byte[] var1) {
      this.field7285 = ByteBuffer.allocateDirect(var1.length);
      ((java.nio.Buffer)this.field7285).position(0);
      this.field7285.put(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqq;)Z")
   @ObfuscatedName("go")
   public static boolean method14211(classQQ var0) {
      return var0.field5594;
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("oo")
   public void method14214(byte[] var1) {
      this.vmethod659(var1, 473372216);
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("al")
   @Override
   byte[] vmethod661() {
      byte[] var1 = new byte[this.field7285.capacity()];
      ((java.nio.Buffer)this.field7285).position(0);
      this.field7285.get(var1);
      return var1;
   }

   static {
      if (field7279 == null) {
         client.logger.info("unable to find Unsafe, using direct buffer");
      }
   }
}
