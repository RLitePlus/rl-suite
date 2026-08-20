import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gd")
public class class160 extends classFM {
   @ObfuscatedName("av")
   String field1987;
   @ObfuscatedName("of")
   static byte[][] regionLandArchives;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   static final int field1985 = 70;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final String field1986 = "There was a problem updating your DOB.";
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("kv")
   static Archive field1988;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field1984 = 32;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field1983 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   public static final int field1982 = 46;

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bc")
   static int method4229(int var0, int var1) {
      try {
         return (int)((Math.log(var0) / Interpreter.field334 - 7.0) * 256.0);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "gd.bc(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod182(Buffer var1, byte var2) {
      try {
         this.field1987 = var1.readStringCp1252NullCircumfixed(523588112);
         Buffer.method12015(var1, -103238140);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gd.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;)Z")
   @ObfuscatedName("yw")
   public static boolean method4228(ClientPreferences var0) {
      return var0.field622;
   }

   @ObfuscatedSignature(descriptor = "(Lgs;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod185(ClanSettings var1, byte var2) {
      try {
         var1.name = this.field1987;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gd.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod183(Buffer var1) {
      this.field1987 = var1.readStringCp1252NullCircumfixed(-1864061276);
      Buffer.method12015(var1, 264523731);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod184(Buffer var1) {
      this.field1987 = var1.readStringCp1252NullCircumfixed(579251925);
      Buffer.method12015(var1, -279325008);
   }

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod186(ClanSettings var1) {
      var1.name = this.field1987;
   }

   class160(class154 var1) {
      this.this$0 = var1;
   }
}
