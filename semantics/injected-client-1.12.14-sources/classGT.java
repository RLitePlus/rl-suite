import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gt")
public class classGT {
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field2093 = 25;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2091 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field2088 = 3;
   @ObfuscatedName("aj")
   long field2094;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field2092 = 1;
   @ObfuscatedName("ak")
   public long field2086 = -837782767103871441L;
   @ObfuscatedSignature(descriptor = "Lrm;")
   @ObfuscatedName("aw")
   IterableNodeDeque field2087 = new IterableNodeDeque();
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final int field2090 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field2089 = 4;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkm;)I")
   @ObfuscatedName("hw")
   public static int method4362(classKM var0) {
      return var0.field3366.length;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("aw")
   void method4355(Buffer var1) {
      this.field2094 = Buffer.method12018(var1, -2113853773);
      this.field2086 = Buffer.method12018(var1, -2145762753) * 837782767103871441L;

      for (int var2 = var1.readUnsignedByte(-1680803906); 0 != var2; var2 = var1.readUnsignedByte(-537245110)) {
         Object var3;
         if (1 == var2) {
            var3 = new classGG(this);
         } else if (var2 == 4) {
            var3 = new classGL(this);
         } else if (3 == var2) {
            var3 = new classGF(this);
         } else if (var2 == 2) {
            var3 = new class157(this);
         } else {
            if (var2 != 5) {
               throw new RuntimeException("");
            }

            var3 = new class164(this);
         }

         ((classGK)var3).vmethod189(var1, (byte)23);
         this.field2087.addFirst((Node)var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgz;B)V")
   @ObfuscatedName("at")
   public void method4363(ClanChannel var1, byte var2) {
      try {
         if (this.field2094 == var1.key) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            if (var1.field2141 * -301898670489180965L == 6110926633958993713L * this.field2086) {
               for (classGK var3 = (classGK)this.field2087.method9642(); null != var3; var3 = (classGK)this.field2087.method9646()) {
                  if (var2 <= 1) {
                     throw new IllegalStateException();
                  }

                  var3.vmethod191(var1, (byte)-24);
               }

               var1.field2141 += 7108271132456580947L;
               return;
            }

            if (var2 <= 1) {
               return;
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gt.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   void method4356(Buffer var1) {
      this.field2094 = Buffer.method12018(var1, -2068937645);
      this.field2086 = Buffer.method12018(var1, -1912081187) * 837782767103871441L;

      for (int var2 = var1.readUnsignedByte(2123329017); 0 != var2; var2 = var1.readUnsignedByte(1651893140)) {
         Object var3;
         if (1 == var2) {
            var3 = new classGG(this);
         } else if (var2 == 4) {
            var3 = new classGL(this);
         } else if (3 == var2) {
            var3 = new classGF(this);
         } else if (var2 == 2) {
            var3 = new class157(this);
         } else {
            if (var2 != 5) {
               throw new RuntimeException("");
            }

            var3 = new class164(this);
         }

         ((classGK)var3).vmethod189(var1, (byte)23);
         this.field2087.addFirst((Node)var3);
      }
   }

   public classGT(Buffer var1) {
      this.method4360(var1, 1808273726);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ae")
   void method4357(Buffer var1) {
      this.field2094 = Buffer.method12018(var1, -1886892183);
      this.field2086 = Buffer.method12018(var1, -1907738482) * 837782767103871441L;

      for (int var2 = var1.readUnsignedByte(1751955110); 0 != var2; var2 = var1.readUnsignedByte(88879264)) {
         Object var3;
         if (1 == var2) {
            var3 = new classGG(this);
         } else if (var2 == 4) {
            var3 = new classGL(this);
         } else if (3 == var2) {
            var3 = new classGF(this);
         } else if (var2 == 2) {
            var3 = new class157(this);
         } else {
            if (var2 != 5) {
               throw new RuntimeException("");
            }

            var3 = new class164(this);
         }

         ((classGK)var3).vmethod189(var1, (byte)23);
         this.field2087.addFirst((Node)var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgz;)V")
   @ObfuscatedName("ay")
   public void method4364(ClanChannel var1) {
      if (this.field2094 == var1.key && var1.field2141 * -301898670489180965L == 6110926633958993713L * this.field2086) {
         for (classGK var2 = (classGK)this.field2087.method9642(); null != var2; var2 = (classGK)this.field2087.method9646()) {
            var2.vmethod191(var1, (byte)21);
         }

         var1.field2141 += 7108271132456580947L;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   void method4358(Buffer var1) {
      this.field2094 = Buffer.method12018(var1, -2079042711);
      this.field2086 = Buffer.method12018(var1, -2019510274) * 837782767103871441L;

      for (int var2 = var1.readUnsignedByte(-109405620); 0 != var2; var2 = var1.readUnsignedByte(1440172961)) {
         Object var3;
         if (1 == var2) {
            var3 = new classGG(this);
         } else if (var2 == 4) {
            var3 = new classGL(this);
         } else if (3 == var2) {
            var3 = new classGF(this);
         } else if (var2 == 2) {
            var3 = new class157(this);
         } else {
            if (var2 != 5) {
               throw new RuntimeException("");
            }

            var3 = new class164(this);
         }

         ((classGK)var3).vmethod189(var1, (byte)23);
         this.field2087.addFirst((Node)var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("aj")
   void method4359(Buffer var1) {
      this.field2094 = Buffer.method12018(var1, -2107371476);
      this.field2086 = Buffer.method12018(var1, -2044352554) * 837782767103871441L;

      for (int var2 = var1.readUnsignedByte(1116359403); 0 != var2; var2 = var1.readUnsignedByte(-1485383081)) {
         Object var3;
         if (1 == var2) {
            var3 = new classGG(this);
         } else if (var2 == 4) {
            var3 = new classGL(this);
         } else if (3 == var2) {
            var3 = new classGF(this);
         } else if (var2 == 2) {
            var3 = new class157(this);
         } else {
            if (var2 != 5) {
               throw new RuntimeException("");
            }

            var3 = new class164(this);
         }

         ((classGK)var3).vmethod189(var1, (byte)23);
         this.field2087.addFirst((Node)var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgz;)V")
   @ObfuscatedName("ap")
   public void method4365(ClanChannel var1) {
      if (this.field2094 == var1.key && var1.field2141 * -301898670489180965L == 6110926633958993713L * this.field2086) {
         for (classGK var2 = (classGK)this.field2087.method9642(); null != var2; var2 = (classGK)this.field2087.method9646()) {
            var2.vmethod191(var1, (byte)78);
         }

         var1.field2141 += 7108271132456580947L;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("av")
   void method4360(Buffer var1, int var2) {
      try {
         this.field2094 = Buffer.method12018(var1, -2062141075);
         this.field2086 = Buffer.method12018(var1, -2078725561) * 837782767103871441L;

         for (int var3 = var1.readUnsignedByte(-1214286264); 0 != var3; var3 = var1.readUnsignedByte(-1486153043)) {
            if (var2 <= 1746490694) {
               throw new IllegalStateException();
            }

            Object var4;
            if (1 == var3) {
               if (var2 <= 1746490694) {
                  throw new IllegalStateException();
               }

               var4 = new classGG(this);
            } else if (var3 == 4) {
               if (var2 <= 1746490694) {
                  return;
               }

               var4 = new classGL(this);
            } else if (3 == var3) {
               var4 = new classGF(this);
            } else if (var3 == 2) {
               if (var2 <= 1746490694) {
                  return;
               }

               var4 = new class157(this);
            } else {
               if (var3 != 5) {
                  throw new RuntimeException("");
               }

               if (var2 <= 1746490694) {
                  throw new IllegalStateException();
               }

               var4 = new class164(this);
            }

            ((classGK)var4).vmethod189(var1, (byte)23);
            this.field2087.addFirst((Node)var4);
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "gt.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgt;Lxa;)V")
   @ObfuscatedName("ne")
   public static void method4361(classGT var0, Buffer var1) {
      if (var0 == null) {
         var0.method4355(var1);
      }

      var0.field2094 = Buffer.method12018(var1, -1937081295);
      var0.field2086 = Buffer.method12018(var1, -2039468632) * 837782767103871441L;

      for (int var2 = var1.readUnsignedByte(-1002433722); 0 != var2; var2 = var1.readUnsignedByte(-1488783146)) {
         Object var3;
         if (1 == var2) {
            var3 = new classGG(var0);
         } else if (var2 == 4) {
            var3 = new classGL(var0);
         } else if (3 == var2) {
            var3 = new classGF(var0);
         } else if (var2 == 2) {
            var3 = new class157(var0);
         } else {
            if (var2 != 5) {
               throw new RuntimeException("");
            }

            var3 = new class164(var0);
         }

         ((classGK)var3).vmethod189(var1, (byte)23);
         var0.field2087.addFirst((Node)var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Ldd;")
   @ObfuscatedName("le")
   static WorldView method4366(int var0, int var1, int var2, int var3) {
      try {
         return client.worldViewManager
            .createWorldView2(var0, var1, var2, class468.clientPreferences.getDrawDistance((byte)-125), TileRenderMode.field3138, 54432370);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gt.le(" + ')');
      }
   }
}
