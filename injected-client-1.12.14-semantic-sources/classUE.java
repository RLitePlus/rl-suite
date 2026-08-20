import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ue")
public abstract class classUE implements classMI {
   @ObfuscatedSignature(descriptor = "Lwh;")
   @ObfuscatedName("av")
   class586 field6033;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final int field6031 = 512;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final String field6032 = "_";

   classUE(int var1) {
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("av")
   abstract void vmethod406(Buffer var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "(Lue;I)Ljava/lang/Object;")
   @ObfuscatedName("rh")
   public static Object method11121(classUE var0, int var1) {
      if (var0 == null) {
         var0.method11123(var1);
      }

      try {
         if (var0.field6033 == class586.field6376) {
            return 0;
         } else if (class586.field6377 == var0.field6033) {
            if (var1 <= 953753448) {
               throw new IllegalStateException();
            } else {
               return -1L;
            }
         } else if (class586.field6379 == var0.field6033) {
            if (var1 <= 953753448) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else {
            return null;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ue.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ak")
   boolean method11120(byte var1) {
      try {
         boolean var10000;
         if (null != this.field6033) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ue.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ae")
   abstract void vmethod407(Buffer var1, int var2);

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("at")
   abstract void vmethod408(Buffer var1, int var2);

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ag")
   abstract void vmethod409(Buffer var1, int var2);

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("an")
   abstract void vmethod410(Buffer var1, int var2);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwn;)J")
   @ObfuscatedName("vs")
   public static long method11124(AccessFile var0) throws IOException {
      return var0 == null ? var0.method11811() : var0.file.length();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("ay")
   Object method11122() {
      if (this.field6033 == class586.field6376) {
         return 0;
      } else if (class586.field6377 == this.field6033) {
         return -1L;
      } else {
         return class586.field6379 == this.field6033 ? "" : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ap")
   public void method11118(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(2107369197);
         if (0 == var2) {
            return;
         }

         class532[] var3 = new class532[]{class532.field6060, class532.field6062, class532.field6059, class532.field6061};
         class532 var4 = (class532)GrandExchangeOffer.findEnumerated(var3, var2, (byte)1);
         if (null != var4) {
            switch (var4.field6058 * 429561909) {
               case 0:
                  var1.readStringCp1252NullTerminatedOrNull(550029248);
                  break;
               case 1:
                  GrandExchangeOffer.findEnumerated(MusicPatchNode.method7736((byte)-34), var1.readUnsignedByte(404532394), (byte)1);
                  break;
               case 2:
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
               case 3:
                  int var5 = var1.readUnsignedByte(-1452963831);
                  this.field6033 = class251.method6149(var5, -1703539756);
                  if (null == this.field6033) {
                     throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                  }
            }
         } else {
            this.vmethod406(var1, var2, -1379833913);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("aj")
   public void method11119(Buffer var1, int var2) {
      try {
         while (true) {
            int var3 = var1.readUnsignedByte(1940366528);
            if (0 == var3) {
               if (var2 == 1107296256) {
                  throw new IllegalStateException();
               }

               return;
            }

            class532[] var4 = new class532[]{class532.field6060, class532.field6062, class532.field6059, class532.field6061};
            class532 var5 = (class532)GrandExchangeOffer.findEnumerated(var4, var3, (byte)1);
            if (null != var5) {
               if (var2 == 1107296256) {
                  return;
               }

               switch (var5.field6058 * 429561909) {
                  case 0:
                     var1.readStringCp1252NullTerminatedOrNull(258971601);
                     break;
                  case 1:
                     GrandExchangeOffer.findEnumerated(MusicPatchNode.method7736((byte)40), var1.readUnsignedByte(-1100330498), (byte)1);
                     break;
                  case 2:
                  default:
                     throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var5);
                  case 3:
                     int var6 = var1.readUnsignedByte(-1718405129);
                     this.field6033 = class251.method6149(var6, -1703539756);
                     if (null == this.field6033) {
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
                     }
               }
            } else {
               this.vmethod406(var1, var3, -1489048031);
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "ue.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("aw")
   Object method11123(int var1) {
      try {
         if (this.field6033 == class586.field6376) {
            return 0;
         } else if (class586.field6377 == this.field6033) {
            if (var1 <= 953753448) {
               throw new IllegalStateException();
            } else {
               return -1L;
            }
         } else if (class586.field6376 == this.field6033) {
            if (var1 <= 953753448) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else {
            return null;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ue.aw(" + ')');
      }
   }
}
