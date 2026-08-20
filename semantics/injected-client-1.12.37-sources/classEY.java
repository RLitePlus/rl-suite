import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ey")
public class classEY {
   @ObfuscatedName("ar")
   public static int field1983;
   @ObfuscatedName("af")
   static int field1980 = -261056662;
   @ObfuscatedName("ae")
   final URL field1981;
   @ObfuscatedName("ab")
   volatile int field1982;
   @ObfuscatedName("ag")
   volatile byte[] field1987;
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   public static final int field1985 = 64;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field1984 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("cx")
   public static final int field1986 = 97;
   @ObfuscatedName("az")
   static int field1979 = 208499601;

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("az")
   public boolean method4106(int var1) {
      try {
         boolean var10000;
         if (1182504533 * this.field1982 != field1979 * -430419313) {
            if (var1 <= 1308041153) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ey.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("af")
   public byte[] method4112(int var1) {
      try {
         return this.field1987;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ey.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("aa")
   public byte[] method4113() {
      return this.field1987;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ac")
   public boolean method4107() {
      return 1182504533 * this.field1982 != field1979 * -430419313;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ab")
   public boolean method4108() {
      return 1182504533 * this.field1982 != field1979 * -430419313;
   }

   classEY(URL var1) {
      this.field1982 = field1979 * 1269776723;
      this.field1981 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   public boolean method4109() {
      return 1182504533 * this.field1982 != field1979 * -430419313;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ax")
   public boolean method4110() {
      return 1182504533 * this.field1982 != field1979 * 970768241;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ay")
   public String method4114() {
      return this.field1981.toString();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ley;)Z")
   @ObfuscatedName("yy")
   public static boolean method4111(classEY var0) {
      return 1182504533 * var0.field1982 != field1979 * -430419313;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ao")
   public String method4115() {
      return this.field1981.toString();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("aj")
   public String method4116() {
      return this.field1981.toString();
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("er")
   static void method4120(byte var0) {
      try {
         AABB.method4919(-1905538131);
         client.menu.menuOpcodes[0] = 0;
         client.menu.field6804[0] = classKK.field3854;
         client.menu.field6805[0] = "";
         client.menu.menuIdentifiers[0] = 1006;
         client.menu.field6807[0] = false;
         client.menu.subMenus[0] = null;
         client.menu.field6797 = 1932681381;
         client.menu.method12696(-1);
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "ey.er(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ley;B)Ljava/lang/String;")
   @ObfuscatedName("gf")
   public static String method4117(classEY var0, byte var1) {
      if (var0 == null) {
         var0.method4119(var1);
      }

      try {
         return var0.field1981.toString();
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ey.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("al")
   public String method4118() {
      return this.field1981.toString();
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("ae")
   public String method4119(byte var1) {
      try {
         return this.field1981.toString();
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ey.ae(" + ')');
      }
   }
}
