import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ga")
public class class164 extends classGK {
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field1970 = 8;
   @ObfuscatedName("av")
   int field1967;
   @ObfuscatedName("ag")
   int field1969;
   @ObfuscatedName("an")
   String field1974;
   @ObfuscatedName("dd")
   static int field1972;
   @ObfuscatedSignature(descriptor = "Lei;")
   @ObfuscatedName("la")
   static UrlRequester urlRequester;
   @ObfuscatedName("at")
   byte field1968;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   static final int field1971 = 360;

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod187(Buffer var1) {
      var1.readUnsignedByte(305649444);
      this.field1967 = Buffer.method12008(var1, (byte)5) * 951491831;
      this.field1968 = Buffer.method12001(var1, (byte)46);
      this.field1969 = Buffer.method12008(var1, (byte)5) * 501130925;
      Buffer.method12018(var1, -2021145402);
      this.field1974 = var1.readStringCp1252NullCircumfixed(-313586468);
      var1.readUnsignedByte(-1318798050);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;Lld;Ljava/util/List;)V")
   @ObfuscatedName("xh")
   public static void method4213(WorldMapRegion var0, WorldMapData_0 var1, List var2) {
      var0.iconMap.clear();
      var0.worldMapData_0 = var1;
      var0.addAllToIconList(var2, (byte)32);
   }

   class164(classGT var1) {
      this.this$0 = var1;
      this.field1967 = -2066734269;
   }

   @ObfuscatedSignature(descriptor = "(Lgz;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod191(ClanChannel var1, byte var2) {
      try {
         ClanChannelMember var3 = (ClanChannelMember)var1.members.get(-516555115 * this.field1967);
         var3.rank = this.field1968;
         var3.world = -1559527697 * this.field1969;
         var3.username = new Username(this.field1974);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ga.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod188(Buffer var1) {
      var1.readUnsignedByte(-307297462);
      this.field1967 = Buffer.method12008(var1, (byte)5) * 2066734269;
      this.field1968 = Buffer.method12001(var1, (byte)116);
      this.field1969 = Buffer.method12008(var1, (byte)5) * 501130925;
      Buffer.method12018(var1, -1994517578);
      this.field1974 = var1.readStringCp1252NullCircumfixed(589228078);
      var1.readUnsignedByte(-1476435677);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod189(Buffer var1, byte var2) {
      try {
         var1.readUnsignedByte(-1165961493);
         this.field1967 = Buffer.method12008(var1, (byte)5) * 2066734269;
         this.field1968 = Buffer.method12001(var1, (byte)101);
         this.field1969 = Buffer.method12008(var1, (byte)5) * 501130925;
         Buffer.method12018(var1, -1957118305);
         this.field1974 = var1.readStringCp1252NullCircumfixed(1498014315);
         var1.readUnsignedByte(223618001);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ga.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(CB)Z")
   @ObfuscatedName("ac")
   public static boolean isCharPrintable(char var0, byte var1) {
      try {
         if (var0 >= ' ') {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            if (var0 <= '~') {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         if (var0 >= 160) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            if (var0 <= 255) {
               return true;
            }
         }

         if (var0 != 8364 && 338 != var0) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            if (8212 != var0) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               if (339 != var0) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (376 != var0) {
                     return false;
                  }
               }
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ga.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgz;)V")
   @ObfuscatedName("ak")
   @Override
   void vmethod192(ClanChannel var1) {
      ClanChannelMember var2 = (ClanChannelMember)var1.members.get(-516555115 * this.field1967);
      var2.rank = this.field1968;
      var2.world = -1559527697 * this.field1969;
      var2.username = new Username(this.field1974);
   }

   @ObfuscatedSignature(descriptor = "(Lgz;)V")
   @ObfuscatedName("aj")
   @Override
   void vmethod193(ClanChannel var1) {
      ClanChannelMember var2 = (ClanChannelMember)var1.members.get(-516555115 * this.field1967);
      var2.rank = this.field1968;
      var2.world = -1559527697 * this.field1969;
      var2.username = new Username(this.field1974);
   }

   @ObfuscatedSignature(descriptor = "(Ldd;B)V")
   @ObfuscatedName("jx")
   static void method4215(WorldView var0, byte var1) {
      try {
         if (null != class166.field2022) {
            if (var1 <= 0) {
               return;
            }

            if (740194039 * client.field893 > 0) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               int var2 = client.field891 * 355112064;
               Clock.method6213(var0, var2, class166.field2022, (byte)52);
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ga.jx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Luv;")
   @ObfuscatedName("ae")
   public static ClickAction[] method4212(int var0) {
      try {
         return new ClickAction[]{ClickAction.field6118, ClickAction.field6119, ClickAction.field6120};
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ga.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod190(Buffer var1) {
      var1.readUnsignedByte(942920638);
      this.field1967 = Buffer.method12008(var1, (byte)5) * 2066734269;
      this.field1968 = Buffer.method12001(var1, (byte)57);
      this.field1969 = Buffer.method12008(var1, (byte)5) * 501130925;
      Buffer.method12018(var1, -2126323327);
      this.field1974 = var1.readStringCp1252NullCircumfixed(-823455067);
      var1.readUnsignedByte(793203129);
   }
}
