import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fd")
public class class152 extends classFM {
   @ObfuscatedName("av")
   int field1762;
   @ObfuscatedName("at")
   boolean field1766;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("am")
   static AbstractArchive SequenceDefinition_animationsArchive;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field1763 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field1764 = 131072;

   @ObfuscatedSignature(descriptor = "(Lci;B)Z")
   @ObfuscatedName("jz")
   static boolean method3962(Player var0, byte var1) {
      try {
         if (0 == client.drawPlayerNames * -1459845413) {
            if (var1 != 0) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (var0 != class330.localPlayer) {
            if (var1 != 0) {
               throw new IllegalStateException();
            } else {
               boolean var2 = GameEngine.method833(1612957145);
               if (!var2) {
                  if (var1 != 0) {
                     throw new IllegalStateException();
                  }

                  boolean var7;
                  if ((client.drawPlayerNames * -1459845413 & 1) != 0) {
                     if (var1 != 0) {
                        throw new IllegalStateException();
                     }

                     var7 = true;
                  } else {
                     var7 = false;
                  }

                  label91: {
                     boolean var3 = var7;
                     if (var3) {
                        if (var1 != 0) {
                           throw new IllegalStateException();
                        }

                        if (var0.isFriend(-614719324)) {
                           if (var1 != 0) {
                              throw new IllegalStateException();
                           }

                           var7 = true;
                           break label91;
                        }
                     }

                     var7 = false;
                  }

                  var2 = var7;
               }

               boolean var6 = var2;
               if (!var2) {
                  if (var1 != 0) {
                     throw new IllegalStateException();
                  }

                  boolean var9;
                  if (0 != (client.drawPlayerNames * -1459845413 & 2)) {
                     if (var1 != 0) {
                        throw new IllegalStateException();
                     }

                     var9 = true;
                  } else {
                     var9 = false;
                  }

                  label80: {
                     boolean var4 = var9;
                     if (var4) {
                        if (var1 != 0) {
                           throw new IllegalStateException();
                        }

                        if (var0.isClanMember((byte)-19)) {
                           var9 = true;
                           break label80;
                        }
                     }

                     var9 = false;
                  }

                  var6 = var9;
               }

               return var6;
            }
         } else {
            boolean var10000;
            if ((-1459845413 * client.drawPlayerNames & 8) != 0) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "fd.jz(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkk;)I")
   @ObfuscatedName("ny")
   public static int method3961(CollisionMap var0) {
      if (var0 == null) {
         var0.method6444();
      }

      return -1751058007 * var0.yInset;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod182(Buffer var1, byte var2) {
      try {
         this.field1762 = Buffer.method12008(var1, (byte)5) * -936670383;
         boolean var10001;
         if (var1.readUnsignedByte(-878254127) == 1) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.field1766 = var10001;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fd.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod185(ClanSettings var1, byte var2) {
      try {
         var1.method4320(-919298639 * this.field1762, this.field1766, -624041443);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fd.at(" + ')');
      }
   }

   class152(class154 var1) {
      this.this$0 = var1;
      this.field1762 = 936670383;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod183(Buffer var1) {
      this.field1762 = Buffer.method12008(var1, (byte)5) * 381276825;
      this.field1766 = var1.readUnsignedByte(371022392) == 1;
   }

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod186(ClanSettings var1) {
      var1.method4320(-919298639 * this.field1762, this.field1766, -498772063);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod184(Buffer var1) {
      this.field1762 = Buffer.method12008(var1, (byte)5) * -936670383;
      this.field1766 = var1.readUnsignedByte(680257575) == 1;
   }
}
