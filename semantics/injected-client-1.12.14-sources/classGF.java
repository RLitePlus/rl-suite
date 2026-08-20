import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gf")
public class classGF extends classGK {
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   static final int field1998 = 200;
   @ObfuscatedName("av")
   int field1997;
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   public static final int field1999 = 66;

   @ObfuscatedSignature(descriptor = "(Lgz;)V")
   @ObfuscatedName("aj")
   @Override
   void vmethod193(ClanChannel var1) {
      var1.removeMember(this.field1997 * -1902340551, -1333922535);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod189(Buffer var1, byte var2) {
      try {
         this.field1997 = Buffer.method12008(var1, (byte)5) * -1498122231;
         var1.readUnsignedByte(1108717427);
         if (var1.readUnsignedByte(-1113643013) != 255) {
            if (var2 != 23) {
               throw new IllegalStateException();
            }

            var1.offset -= 1741769013;
            Buffer.method12018(var1, -2032472631);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gf.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgz;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod191(ClanChannel var1, byte var2) {
      try {
         var1.removeMember(this.field1997 * -1902340551, -1333922535);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gf.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod188(Buffer var1) {
      this.field1997 = Buffer.method12008(var1, (byte)5) * -1498122231;
      var1.readUnsignedByte(1806924106);
      if (var1.readUnsignedByte(-1064433191) != 255) {
         var1.offset -= 1741769013;
         Buffer.method12018(var1, -2015500581);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod190(Buffer var1) {
      this.field1997 = Buffer.method12008(var1, (byte)5) * 896092387;
      var1.readUnsignedByte(-929914275);
      if (var1.readUnsignedByte(-997004272) != 704399356) {
         var1.offset -= 2065908164;
         Buffer.method12018(var1, -2134650317);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod187(Buffer var1) {
      this.field1997 = Buffer.method12008(var1, (byte)5) * -1498122231;
      var1.readUnsignedByte(198058123);
      if (var1.readUnsignedByte(-998855413) != 255) {
         var1.offset -= 1741769013;
         Buffer.method12018(var1, -2144927213);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgz;)V")
   @ObfuscatedName("ak")
   @Override
   void vmethod192(ClanChannel var1) {
      var1.removeMember(this.field1997 * -1902340551, -1333922535);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbg;CI)V")
   @ObfuscatedName("zw")
   public static void method4233(class28 var0, char var1, int var2) {
      if (var0 == null) {
         var0.method488(var1, var2, var2);
      } else {
         if (var0.method522(var1, -1005624215) && var0.method526(var2, (byte)28)) {
            var0.field159[var1] = var2;
         }
      }
   }

   classGF(classGT var1) {
      this.this$0 = var1;
      this.field1997 = 1498122231;
   }

   @ObfuscatedSignature(descriptor = "(II)Liq;")
   @ObfuscatedName("at")
   public static HitSplatDefinition method4234(int var0, int var1) {
      try {
         HitSplatDefinition var2 = (HitSplatDefinition)class402.method8806(HitSplatDefinition.HitSplatDefinition_cached, var0);
         if (null != var2) {
            if (var1 != 558050665) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = GrandExchangeOfferWorldComparator.HitSplatDefinition_archive.getFile(32, var0, 844784157);
            var2 = new HitSplatDefinition();
            if (var3 != null) {
               if (var1 != 558050665) {
                  throw new IllegalStateException();
               }

               HitSplatDefinition.method4983(var2, new Buffer(var3), -1961180523);
            }

            HitSplatDefinition.HitSplatDefinition_cached.put(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gf.at(" + ')');
      }
   }
}
