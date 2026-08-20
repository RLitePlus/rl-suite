import javax.net.ssl.HandshakeCompletedListener;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yv")
final class classYV implements classYH {
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field7092 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final String field7094 = "Date not valid.";
   @ObfuscatedSignature(descriptor = "[Lps;")
   @ObfuscatedName("ag")
   public static classPS[] field7095;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field7093 = 1;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqc;Ljavax/net/ssl/HandshakeCompletedListener;)V")
   @ObfuscatedName("nn")
   public static void method13661(classQC var0, HandshakeCompletedListener var1) {
      if (var0 == null) {
         var0.getWantClientAuth();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Object;")
   @ObfuscatedName("ac")
   @Override
   public Object vmethod655(classXY var1) {
      return var1.method13056((byte)1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Integer;Lxy;B)V")
   @ObfuscatedName("az")
   void method13659(Integer var1, classXY var2, byte var3) {
      try {
         var2.method12979(var1, 1138228602);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "yv.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;B)Ljava/lang/Object;")
   @ObfuscatedName("af")
   @Override
   public Object vmethod653(classXY var1, byte var2) {
      try {
         return var1.method13056((byte)1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "yv.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Object;")
   @ObfuscatedName("ax")
   @Override
   public Object vmethod654(classXY var1) {
      return var1.method13056((byte)1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxy;I)V")
   @ObfuscatedName("ae")
   @Override
   public void vmethod656(Object var1, classXY var2, int var3) {
      try {
         this.method13659((Integer)var1, var2, (byte)0);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "yv.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxy;)V")
   @ObfuscatedName("aa")
   @Override
   public void vmethod657(Object var1, classXY var2) {
      this.method13659((Integer)var1, var2, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Integer;Lxy;)V")
   @ObfuscatedName("ab")
   void method13660(Integer var1, classXY var2) {
      var2.method12979(var1, 1228622489);
   }
}
