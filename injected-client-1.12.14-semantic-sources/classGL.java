import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class classGL extends classGK {
   @ObfuscatedName("at")
   byte field2024;
   @ObfuscatedName("ag")
   byte field2023;
   @ObfuscatedName("av")
   String field2025;

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod190(Buffer var1) {
      this.field2025 = var1.readCESU8(792604665);
      if (this.field2025 != null) {
         var1.readUnsignedByte(2005762447);
         this.field2024 = Buffer.method12001(var1, (byte)64);
         this.field2023 = Buffer.method12001(var1, (byte)31);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod189(Buffer var1, byte var2) {
      try {
         this.field2025 = var1.readCESU8(792604665);
         if (this.field2025 != null) {
            if (var2 != 23) {
               return;
            }

            var1.readUnsignedByte(-1251586102);
            this.field2024 = Buffer.method12001(var1, (byte)122);
            this.field2023 = Buffer.method12001(var1, (byte)41);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gl.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgz;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod191(ClanChannel var1, byte var2) {
      try {
         var1.name = this.field2025;
         if (null != this.field2025) {
            if (var2 == 25) {
               throw new IllegalStateException();
            }

            var1.field2135 = this.field2024;
            var1.field2134 = this.field2023;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gl.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod188(Buffer var1) {
      this.field2025 = var1.readCESU8(792604665);
      if (this.field2025 != null) {
         var1.readUnsignedByte(-1447691737);
         this.field2024 = Buffer.method12001(var1, (byte)42);
         this.field2023 = Buffer.method12001(var1, (byte)72);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgz;)V")
   @ObfuscatedName("ak")
   @Override
   void vmethod192(ClanChannel var1) {
      var1.name = this.field2025;
      if (null != this.field2025) {
         var1.field2135 = this.field2024;
         var1.field2134 = this.field2023;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod187(Buffer var1) {
      this.field2025 = var1.readCESU8(792604665);
      if (this.field2025 != null) {
         var1.readUnsignedByte(1125747614);
         this.field2024 = Buffer.method12001(var1, (byte)77);
         this.field2023 = Buffer.method12001(var1, (byte)74);
      }
   }

   classGL(classGT var1) {
      this.this$0 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lgz;)V")
   @ObfuscatedName("aj")
   @Override
   void vmethod193(ClanChannel var1) {
      var1.name = this.field2025;
      if (null != this.field2025) {
         var1.field2135 = this.field2024;
         var1.field2134 = this.field2023;
      }
   }
}
