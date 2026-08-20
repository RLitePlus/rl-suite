import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vk")
public class classVK extends classVB {
   @ObfuscatedName("av")
   int field6176 = 0;
   @ObfuscatedName("at")
   int field6177 = 0;
   @ObfuscatedName("ae")
   int field6181;
   @ObfuscatedName("an")
   int field6179;
   @ObfuscatedName("ag")
   int field6178 = 0;
   @ObfuscatedName("aj")
   int field6180;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   @Override
   public int vmethod427() {
      double var1 = class560.method11318(this, (byte)-30);
      return (int)Math.round(-1021701547 * this.field6178 + var1 * (-1651431937 * this.field6180 - 310745970 * this.field6178));
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   @Override
   public int vmethod418(int var1) {
      try {
         double var2 = class560.method11318(this, (byte)-30);
         return (int)Math.round(var2 * (this.field6179 * -1511321315 - this.field6176 * -1574013177) + this.field6176 * -1574013177);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vk.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   @Override
   public int vmethod426() {
      double var1 = class560.method11318(this, (byte)-30);
      return (int)Math.round((this.field6181 * -756774739 - -518960405 * this.field6177) * var1 + -518960405 * this.field6177);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod417(int var1) {
      try {
         double var2 = class560.method11318(this, (byte)-30);
         return (int)Math.round(-1021701547 * this.field6178 + var2 * (-1012492251 * this.field6180 - -1021701547 * this.field6178));
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vk.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   @Override
   public int vmethod422() {
      double var1 = class560.method11318(this, (byte)-30);
      return (int)Math.round((this.field6181 * 1904082983 - -518960405 * this.field6177) * var1 + -518960405 * this.field6177);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod424() {
      double var1 = class560.method11318(this, (byte)-30);
      return (int)Math.round(var1 * (this.field6179 * -1511321315 - this.field6176 * -1574013177) + this.field6176 * 788546453);
   }

   public classVK(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super(var7, var8);
      this.field6179 = 0;
      this.field6181 = 0;
      this.field6180 = 0;
      this.field6176 = var1 * -1650768201;
      this.field6177 = -1617818173 * var2;
      this.field6178 = -1079878915 * var3;
      this.field6179 = 1287534901 * var4;
      this.field6181 = var5 * 1619401509;
      this.field6180 = var6 * -365182035;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   @Override
   public int vmethod423() {
      double var1 = class560.method11318(this, (byte)-30);
      return (int)Math.round((this.field6181 * -756774739 - -518960405 * this.field6177) * var1 + -518960405 * this.field6177);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod420() {
      double var1 = class560.method11318(this, (byte)-30);
      return (int)Math.round(var1 * (this.field6179 * 1982080972 - this.field6176 * -1574013177) + this.field6176 * 482527231);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   @Override
   public int vmethod425() {
      double var1 = class560.method11318(this, (byte)-30);
      return (int)Math.round(-1021701547 * this.field6178 + var1 * (-1012492251 * this.field6180 - -1021701547 * this.field6178));
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   @Override
   public int vmethod421(int var1) {
      try {
         double var2 = class560.method11318(this, (byte)-30);
         return (int)Math.round((this.field6181 * -756774739 - -518960405 * this.field6177) * var2 + -518960405 * this.field6177);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vk.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("az")
   @Override
   public int vmethod428() {
      double var1 = class560.method11318(this, (byte)-30);
      return (int)Math.round(-1021701547 * this.field6178 + var1 * (-1012492251 * this.field6180 - -1021701547 * this.field6178));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   @Override
   public int vmethod419() {
      double var1 = class560.method11318(this, (byte)-30);
      return (int)Math.round(-1021701547 * this.field6178 + var1 * (-1012492251 * this.field6180 - 2081104679 * this.field6178));
   }

   @ObfuscatedSignature(descriptor = "(Lof;I)Z")
   @ObfuscatedName("oc")
   static final boolean method11310(Widget var0, int var1) {
      try {
         int var2 = 1889823193 * var0.contentType;
         if (var2 == 205) {
            if (var1 >= 1113370650) {
               throw new IllegalStateException();
            } else {
               client.logoutTimer = 485255766;
               return true;
            }
         } else {
            if (var2 >= 300) {
               if (var1 >= 1113370650) {
                  throw new IllegalStateException();
               }

               if (var2 <= 313) {
                  if (var1 >= 1113370650) {
                     throw new IllegalStateException();
                  }

                  int var3 = (var2 - 300) / 2;
                  int var4 = var2 & 1;
                  boolean var10002;
                  if (var4 == 1) {
                     if (var1 >= 1113370650) {
                        throw new IllegalStateException();
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  PlayerComposition.method7894(client.playerAppearance, var3, var10002, 880471699);
               }
            }

            if (var2 >= 314 && var2 <= 323) {
               if (var1 >= 1113370650) {
                  throw new IllegalStateException();
               }

               int var6 = (var2 - 314) / 2;
               int var8 = var2 & 1;
               boolean var9;
               if (1 == var8) {
                  if (var1 >= 1113370650) {
                     throw new IllegalStateException();
                  }

                  var9 = true;
               } else {
                  var9 = false;
               }

               client.playerAppearance.method7897(var6, var9, -909859953);
            }

            if (var2 == 324) {
               if (var1 >= 1113370650) {
                  throw new IllegalStateException();
               }

               client.playerAppearance.method7901(0, -1608162426);
            }

            if (var2 == 325) {
               if (var1 >= 1113370650) {
                  throw new IllegalStateException();
               }

               client.playerAppearance.method7901(1, 120642758);
            }

            if (var2 == 326) {
               if (var1 >= 1113370650) {
                  throw new IllegalStateException();
               } else {
                  PacketBufferNode var7 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3945, client.packetWriter.isaacCipher, -1892659489);
                  client.playerAppearance.write(var7.packetBuffer, -1803734593);
                  PacketWriter.method3330(client.packetWriter, var7, -1771370198);
                  return true;
               }
            } else {
               return false;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "vk.oc(" + ')');
      }
   }
}
