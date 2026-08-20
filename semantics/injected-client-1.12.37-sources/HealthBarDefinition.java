import net.runelite.api.HealthBarConfig;
import net.runelite.api.events.PostHealthBarConfig;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("px")
public class HealthBarDefinition extends classVJ implements HealthBarConfig {
   @ObfuscatedName("av")
   public final int field5483;
   @ObfuscatedName("ar")
   public final int field5481;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field5488 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("dm")
   public static final int field5490 = 102;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5487 = 5;
   @ObfuscatedName("ai")
   public final int field5484;
   @ObfuscatedName("ah")
   public final int field5485;
   @ObfuscatedName("aw")
   public final int field5482;
   @ObfuscatedName("ak")
   public final int field5477;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("au")
   static EvictingDualNodeHashTable field5476 = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("at")
   public final int field5480;
   @ObfuscatedName("am")
   final int field5479;
   @ObfuscatedName("an")
   final int field5478;
   @rl8(method10126 = 17)
   @ObfuscatedName("bn")
   public int field5486;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5489 = 1;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ap")
   static EvictingDualNodeHashTable field5475 = new EvictingDualNodeHashTable(64);

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("aj")
   public SpritePixels method9367() {
      if (this.field5478 * -1922748515 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field5476.method6422(this.field5478 * 1104423047);
         if (var1 != null) {
            return var1;
         } else {
            var1 = classPN.method9038(classKJ.field3605, 1914620357 * this.field5478, 0, -1592646970);
            if (null != var1) {
               field5476.method6428(var1, 1720677464 * this.field5478);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("oi")
   public void method9371() {
      PostHealthBarConfig var1 = new PostHealthBarConfig();
      var1.setHealthBarConfig(this);
      classOE.client.getCallbacks().post(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)Lym;")
   @ObfuscatedName("ae")
   public SpritePixels method9365(int var1) {
      try {
         if (1254761701 * this.field5479 < 0) {
            if (var1 == -988824982) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            SpritePixels var2 = (SpritePixels)field5476.method6422(this.field5479 * 1254761701);
            if (var2 != null) {
               if (var1 == -988824982) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               var2 = classPN.method9038(classKJ.field3605, 1254761701 * this.field5479, 0, -1829350990);
               if (null != var2) {
                  if (var1 == -988824982) {
                     throw new IllegalStateException();
                  }

                  field5476.method6428(var2, 1254761701 * this.field5479);
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "px.ae(" + ')');
      }
   }

   public void setPadding(int var1) {
      this.field5486 = var1 * -1615725109;
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("zp")
   public SpritePixels method9372() {
      return this.method9368((byte)-90);
   }

   @ObfuscatedSignature(descriptor = "(B)Lym;")
   @ObfuscatedName("ab")
   public SpritePixels method9368(byte var1) {
      try {
         if (this.field5478 * 1914620357 < 0) {
            return null;
         } else {
            SpritePixels var2 = (SpritePixels)field5476.method6422(this.field5478 * 1914620357);
            if (var2 != null) {
               return var2;
            } else {
               var2 = classPN.method9038(classKJ.field3605, 1914620357 * this.field5478, 0, -2123192596);
               if (null != var2) {
                  if (var1 == 31) {
                     throw new IllegalStateException();
                  }

                  field5476.method6428(var2, 1914620357 * this.field5478);
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "px.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpx;)Lym;")
   @ObfuscatedName("yr")
   public static SpritePixels method9369(HealthBarDefinition var0) {
      if (var0.field5478 * 1914620357 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field5476.method6422(var0.field5478 * 1914620357);
         if (var1 != null) {
            return var1;
         } else {
            var1 = classPN.method9038(classKJ.field3605, 1914620357 * var0.field5478, 0, -2146458288);
            if (null != var1) {
               field5476.method6428(var1, 1914620357 * var0.field5478);
            }

            return var1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpx;")
   @ObfuscatedName("ag")
   public static HealthBarDefinition method9360(int var0) {
      HealthBarDefinition var1 = (HealthBarDefinition)field5475.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classMN.field4545.method11867(33, var0, -1602994962);
         var1 = new HealthBarDefinition(new Buffer(var2), var0);
         field5475.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpx;")
   @ObfuscatedName("as")
   public static HealthBarDefinition method9361(int var0) {
      HealthBarDefinition var1 = (HealthBarDefinition)field5475.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classMN.field4545.method11867(-1953443042, var0, -1788520182);
         var1 = new HealthBarDefinition(new Buffer(var2), var0);
         field5475.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   public static void method9362() {
      EvictingDualNodeHashTable.method6431(field5475);
      EvictingDualNodeHashTable.method6431(field5476);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hs")
   public int method9373() {
      return this.field5485 * -1485258143;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public static void method9363() {
      EvictingDualNodeHashTable.method6431(field5475);
      EvictingDualNodeHashTable.method6431(field5476);
   }

   public int getHealthBarFrontSpriteId() {
      return this.field5479 * 1254761701;
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("ay")
   public SpritePixels method9370() {
      if (this.field5478 * 1914620357 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field5476.method6422(this.field5478 * 1914620357);
         if (var1 != null) {
            return var1;
         } else {
            var1 = classPN.method9038(classKJ.field3605, 1914620357 * this.field5478, 0, -1747499911);
            if (null != var1) {
               field5476.method6428(var1, 1914620357 * this.field5478);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("ao")
   public SpritePixels method9366() {
      if (-1087166743 * this.field5479 < 0) {
         return null;
      } else {
         SpritePixels var1 = (SpritePixels)field5476.method6422(this.field5479 * 1254761701);
         if (var1 != null) {
            return var1;
         } else {
            var1 = classPN.method9038(classKJ.field3605, 4154527 * this.field5479, 0, -1954221896);
            if (null != var1) {
               field5476.method6428(var1, -1733022372 * this.field5479);
            }

            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lym;")
   @ObfuscatedName("sb")
   public SpritePixels method9374() {
      return this.method9365(782773199);
   }

   HealthBarDefinition(Buffer var1, int var2) {
      this.field5484 = var2 * 99929699;
      int var3 = 255;
      int var4 = 255;
      int var5 = -1;
      byte var6 = 1;
      int var7 = 70;
      int var8 = -1;
      int var9 = -1;
      int var10 = 30;
      int var11 = 0;
      if (var1 != null && null != var1.array) {
         label53:
         while (true) {
            int var12 = Buffer.method13039(var1, -346779531);
            switch (var12) {
               case 0:
                  break label53;
               case 1:
                  Buffer.method13047(var1, -477261215);
                  continue;
               case 2:
                  var3 = Buffer.method13039(var1, -346779531);
                  continue;
               case 3:
                  var4 = Buffer.method13039(var1, -346779531);
                  continue;
               case 4:
                  var5 = 0;
                  continue;
               case 5:
                  var7 = Buffer.method13047(var1, 659653123);
                  continue;
               case 6:
                  Buffer.method13039(var1, -346779531);
                  continue;
               case 7:
                  var8 = Buffer.method13110(var1, -324749371);
                  continue;
               case 8:
                  var9 = Buffer.method13110(var1, -324749371);
               case 9:
               case 10:
               case 12:
               case 13:
               default:
                  continue;
               case 11:
                  var5 = Buffer.method13047(var1, -1638589704);
                  continue;
               case 14:
                  var10 = Buffer.method13039(var1, -346779531);
                  continue;
               case 15:
            }

            var11 = Buffer.method13039(var1, -346779531);
         }
      }

      this.field5481 = -1608811953 * var3;
      this.field5482 = 1368171699 * var4;
      this.field5477 = var5 * -2128041703;
      this.field5483 = 1049500111 * var6;
      this.field5480 = var7 * 102288865;
      this.field5479 = var8 * 1858533613;
      this.field5478 = var9 * 540658957;
      this.field5485 = var10 * 315056545;
      this.field5486 = var11 * -1615725109;
      this.method9371();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   public static void method9364() {
      EvictingDualNodeHashTable.method6431(field5475);
      EvictingDualNodeHashTable.method6431(field5476);
   }
}
