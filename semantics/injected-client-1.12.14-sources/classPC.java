import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pc")
public class classPC {
   @ToRemove(unused = "true")
   @ObfuscatedName("ba")
   static final int field4787 = 58;
   @ToRemove(unused = "true")
   @ObfuscatedName("bw")
   static final int field4788 = 115;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field4786 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ew")
   static final int field4789 = 2000;

   classPC() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[SI)V")
   @ObfuscatedName("av")
   public static void method8711(String[] var0, short[] var1, int var2) {
      try {
         class387.sortItemsByName(var0, var1, 0, var0.length - 1, (byte)-110);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "pc.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;)V")
   @ObfuscatedName("si")
   public static void method8713(Model var0) {
      if (var0.radius != 2) {
         var0.radius = 2;
         var0.diameter = 0;

         for (int var1 = 0; var1 < var0.verticesCount; var1++) {
            int var2 = (int)var0.field3501[var1];
            int var3 = (int)var0.field3507[var1];
            int var4 = (int)var0.field3503[var1];
            int var5 = var2 * var2 + var4 * var4 + var3 * var3;
            if (var5 > var0.diameter) {
               var0.diameter = var5;
            }
         }

         var0.diameter = (int)(Math.sqrt(var0.diameter) + 0.99);
         var0.xzRadius = var0.diameter;
         var0.bottomY = var0.diameter + var0.diameter;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   static void method8714(int var0) {
      try {
         Login.Login_username = Login.Login_username.trim();
         client.method2115(-1);
         if (Login.Login_username.isEmpty()) {
            if (var0 >= 587628145) {
               throw new IllegalStateException();
            } else {
               class525.setLoginResponseString(Strings.field4973, Strings.field4974, Strings.field5105, (byte)1);
            }
         } else if (Login.Login_password.isEmpty()) {
            if (var0 < 587628145) {
               class525.setLoginResponseString(Strings.field5130, Strings.field4977, Strings.field4911, (byte)1);
            }
         } else {
            class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
            classFR.method4050(false, -1570767859);
            WorldMapSectionType.updateGameState(20, (byte)45);
         }
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "pc.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(J)I")
   @ObfuscatedName("an")
   static int method8712(long var0) {
      try {
         return (int)(var0 >>> 16 & 7L);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pc.an(" + 41);
      }
   }
}
