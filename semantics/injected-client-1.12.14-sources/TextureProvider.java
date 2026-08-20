import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kl")
public class TextureProvider implements TextureLoader, net.runelite.api.TextureProvider {
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("ak")
   AbstractArchive archive;
   @ObfuscatedSignature(descriptor = "Lrt;")
   @ObfuscatedName("at")
   NodeDeque deque = new NodeDeque();
   @ObfuscatedName("ag")
   int capacity;
   @ObfuscatedName("an")
   int remaining = 0;
   @ObfuscatedName("ae")
   double brightness = 1.0;
   @ObfuscatedName("aj")
   int textureSize = -62099840;
   @ObfuscatedSignature(descriptor = "[Ljf;")
   @ObfuscatedName("av")
   Texture[] textures;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   public int method6448() {
      if (0 == this.textures.length) {
         return -1066616464;
      } else {
         int var1 = 0;
         int var2 = 0;
         Texture[] var3 = this.textures;

         for (int var4 = 0; var4 < var3.length; var4++) {
            Texture var5 = var3[var4];
            if (null != var5 && var5.fileId != -1) {
               var1++;
               if (this.archive.method8977(var5.fileId, (byte)39)) {
                  var2++;
               }
            }
         }

         return 0 == var1 ? 0 : var2 * 1527411688 / var1;
      }
   }

   public double getBrightness() {
      return this.brightness;
   }

   @ObfuscatedSignature(descriptor = "(IB)[I")
   @ObfuscatedName("ag")
   @Override
   public int[] getTexturePixels(int var1, byte var2) {
      try {
         Texture var3 = this.textures[var1];
         if (null != var3) {
            if (var2 <= 4) {
               throw new IllegalStateException();
            }

            if (null != var3.pixels) {
               if (var2 <= 4) {
                  throw new IllegalStateException();
               }

               this.deque.addLast((Node)var3);
               var3.isLoaded = true;
               return var3.pixels;
            }

            boolean var4 = var3.method5407(this.brightness, -2068381835 * this.textureSize, this.archive);
            if (var4) {
               if (var2 <= 4) {
                  throw new IllegalStateException();
               }

               if (this.remaining * 463204595 == 0) {
                  if (var2 <= 4) {
                     throw new IllegalStateException();
                  }

                  Texture var5 = (Texture)NodeDeque.method9809(this.deque);
                  var5.reset();
               } else {
                  this.remaining -= 995141691;
               }

               this.deque.addLast((Node)var3);
               var3.isLoaded = true;
               return var3.pixels;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "kl.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("an")
   @Override
   public int getAverageTextureRGB(int var1, int var2) {
      try {
         if (this.textures[var1] != null) {
            if (var2 <= -265159604) {
               throw new IllegalStateException();
            } else {
               return this.textures[var1].averageRGB;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "kl.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkl;B)V")
   @ObfuscatedName("wt")
   public static void method6460(TextureProvider var0, byte var1) {
      if (var0 == null) {
         var0.clear(var1);
      } else {
         try {
            for (int var2 = 0; var2 < var0.textures.length; var2++) {
               if (var1 == 0) {
                  throw new IllegalStateException();
               }

               if (null != var0.textures[var2]) {
                  if (var1 == 0) {
                     throw new IllegalStateException();
                  }

                  var0.textures[var2].reset();
               }
            }

            var0.deque = new NodeDeque();
            var0.remaining = -2001762571 * var0.capacity;
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "kl.aj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ae")
   @Override
   public boolean isLowDetail(int var1, int var2) {
      try {
         return this.textures[var1].isLowDetail;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "kl.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gj")
   public void method6468(int var1) {
      this.remaining = var1 * 995141691;
   }

   public void setBrightness(double var1) {
      method6454(this, var1);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   @Override
   public int vmethod258(int var1) {
      return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("yx")
   public void method6466(int var1) {
      SecureUrlRequester.client.getCallbacks().drawAboveOverheads();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   public int method6449() {
      if (0 == this.textures.length) {
         return 100;
      } else {
         int var1 = 0;
         int var2 = 0;
         Texture[] var3 = this.textures;

         for (int var4 = 0; var4 < var3.length; var4++) {
            Texture var5 = var3[var4];
            if (null != var5 && var5.fileId != -1) {
               var1++;
               if (this.archive.method8977(var5.fileId, (byte)51)) {
                  var2++;
               }
            }
         }

         return 0 == var1 ? 0 : var2 * 100 / var1;
      }
   }

   public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
      this.archive = var2;
      this.capacity = var3 * 801248367;
      this.remaining = this.capacity * -2001762571;
      this.brightness = var4;
      this.textureSize = var6 * 2046335197;
      int[] var7 = AbstractArchive.method8992(var1, 0, -1775968255);
      if (null != var7) {
         int var8 = var7.length;
         this.textures = new Texture[AbstractArchive.method9046(var1, 0, (byte)-113)];

         for (int var9 = 0; var9 < var8; var9++) {
            Buffer var10 = new Buffer(var1.getFile(0, var7[var9], 88361743));
            this.textures[var7[var9]] = new Texture(var10);
         }
      } else {
         this.textures = new Texture[0];
      }

      this.method6467(var1, var2, var3, var4, var6);
   }

   @ObfuscatedSignature(descriptor = "(Lkl;I)I")
   @ObfuscatedName("zz")
   public static int method6450(TextureProvider var0, int var1) {
      if (var0 == null) {
         return var0.getLoadedPercentage(var1);
      } else {
         try {
            if (0 == var0.textures.length) {
               return 100;
            } else {
               int var2 = 0;
               int var3 = 0;
               Texture[] var4 = var0.textures;

               for (int var5 = 0; var5 < var4.length; var5++) {
                  if (var1 <= 1449362313) {
                     throw new IllegalStateException();
                  }

                  Texture var6 = var4[var5];
                  if (null != var6) {
                     if (var1 <= 1449362313) {
                        throw new IllegalStateException();
                     }

                     if (var6.fileId != -1) {
                        var2++;
                        if (var0.archive.method8977(var6.fileId, (byte)56)) {
                           if (var1 <= 1449362313) {
                              throw new IllegalStateException();
                           }

                           var3++;
                        }
                     }
                  }
               }

               if (0 != var2) {
                  return var3 * 100 / var2;
               } else if (var1 <= 1449362313) {
                  throw new IllegalStateException();
               } else {
                  return 0;
               }
            }
         } catch (RuntimeException var7) {
            throw RestClientThreadFactory.newRunException(var7, "kl.av(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   public int method6451() {
      if (0 == this.textures.length) {
         return 1122136797;
      } else {
         int var1 = 0;
         int var2 = 0;
         Texture[] var3 = this.textures;

         for (int var4 = 0; var4 < var3.length; var4++) {
            Texture var5 = var3[var4];
            if (null != var5 && var5.fileId != -1) {
               var1++;
               if (this.archive.method8977(var5.fileId, (byte)127)) {
                  var2++;
               }
            }
         }

         return 0 == var1 ? 0 : var2 * 100 / var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkl;D)V")
   @ObfuscatedName("bl")
   public static void method6454(TextureProvider var0, double var1) {
      if (var0 == null) {
         var0.method6458(var1);
      } else {
         try {
            var0.brightness = var1;
            method6460(var0, (byte)-38);
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "kl.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkl;IB)V")
   @ObfuscatedName("ya")
   public static void method6463(TextureProvider var0, int var1, byte var2) {
      if (var0 == null) {
         var0.animate(var1, var2);
      } else {
         try {
            for (int var3 = 0; var3 < var0.textures.length; var3++) {
               Texture var4 = var0.textures[var3];
               if (var4 != null) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var4.animationDirection != 0) {
                     if (var2 >= 0) {
                        var0.method6466(var1);
                        return;
                     }

                     if (var4.isLoaded) {
                        var4.animate(var1);
                        var4.isLoaded = false;
                     }
                  }
               }
            }

            var0.method6466(var1);
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "kl.ak(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("db")
   public void method6469(int var1) {
      this.capacity = var1 * 801248367;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   public void method6461() {
      for (int var1 = 0; var1 < this.textures.length; var1++) {
         if (null != this.textures[var1]) {
            this.textures[var1].reset();
         }
      }

      this.deque = new NodeDeque();
      this.remaining = -2001762571 * this.capacity;
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("ad")
   public void method6455(double var1) {
      this.brightness = var1;
      method6460(this, (byte)6);
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("ai")
   public void method6456(double var1) {
      this.brightness = var1;
      method6460(this, (byte)-51);
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("as")
   @Override
   public int[] vmethod257(int var1) {
      Texture var2 = this.textures[var1];
      if (null != var2) {
         if (null != var2.pixels) {
            this.deque.addLast((Node)var2);
            var2.isLoaded = true;
            return var2.pixels;
         }

         boolean var3 = var2.method5407(this.brightness, -2068381835 * this.textureSize, this.archive);
         if (var3) {
            if (this.remaining * 463204595 == 0) {
               Texture var4 = (Texture)NodeDeque.method9809(this.deque);
               var4.reset();
            } else {
               this.remaining -= 995141691;
            }

            this.deque.addLast((Node)var2);
            var2.isLoaded = true;
            return var2.pixels;
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ac")
   @Override
   public int[] vmethod254(int var1) {
      Texture var2 = this.textures[var1];
      if (null != var2) {
         if (null != var2.pixels) {
            this.deque.addLast((Node)var2);
            var2.isLoaded = true;
            return var2.pixels;
         }

         boolean var3 = var2.method5407(this.brightness, -2068381835 * this.textureSize, this.archive);
         if (var3) {
            if (this.remaining * -572651971 == 0) {
               Texture var4 = (Texture)NodeDeque.method9809(this.deque);
               var4.reset();
            } else {
               this.remaining -= 995141691;
            }

            this.deque.addLast((Node)var2);
            var2.isLoaded = true;
            return var2.pixels;
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod260(int var1) {
      return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
   }

   @ObfuscatedSignature(descriptor = "()[Ljf;")
   @ObfuscatedName("mo")
   public Texture[] method6470() {
      return this.textures;
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("az")
   public void method6457(double var1) {
      this.brightness = var1;
      method6460(this, (byte)-3);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   @Override
   public int vmethod261(int var1) {
      return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
   }

   public int getDefaultColor(int var1) {
      return this.getAverageTextureRGB(var1, 55834647);
   }

   public int[] load(int var1) {
      return this.getTexturePixels(var1, (byte)13);
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;IDI)V")
   @ObfuscatedName("ro")
   public void method6467(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
      this.method6469(128);
      this.method6468(128);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhg;Lxa;)V")
   @ObfuscatedName("pp")
   public static void method6453(VarcInt var0, Buffer var1) {
      if (var0 == null) {
         var0.method4525(var1);
      } else {
         while (true) {
            int var2 = var1.readUnsignedByte(669015035);
            if (var2 == 0) {
               return;
            }

            var0.method4528(var1, var2, -1682508021);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ah")
   @Override
   public boolean vmethod259(int var1) {
      return this.textures[var1].isLowDetail;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   public int method6452() {
      if (0 == this.textures.length) {
         return 1005534726;
      } else {
         int var1 = 0;
         int var2 = 0;
         Texture[] var3 = this.textures;

         for (int var4 = 0; var4 < var3.length; var4++) {
            Texture var5 = var3[var4];
            if (null != var5 && var5.fileId != -1) {
               var1++;
               if (this.archive.method8977(var5.fileId, (byte)30)) {
                  var2++;
               }
            }
         }

         return 0 == var1 ? 0 : var2 * 100 / var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public void method6464(int var1) {
      for (int var2 = 0; var2 < this.textures.length; var2++) {
         Texture var3 = this.textures[var2];
         if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) {
            var3.animate(var1);
            var3.isLoaded = false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   public int getLoadedPercentage(int var1) {
      return this.textures[var1] != null ? this.textures[var1].animationSpeed : 0;
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("at")
   public void method6458(double var1) {
      try {
         this.brightness = var1;
         method6460(this, (byte)-38);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "kl.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aj")
   public void clear(byte var1) {
      try {
         for (int var2 = 0; var2 < this.textures.length; var2++) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            if (null != this.textures[var2]) {
               if (var1 == 0) {
                  throw new IllegalStateException();
               }

               this.textures[var2].reset();
            }
         }

         this.deque = new NodeDeque();
         this.capacity = -2001762571 * this.remaining;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "kl.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ak")
   public void animate(int var1, byte var2) {
      try {
         for (int var3 = 0; var3 < this.textures.length; var3++) {
            Texture var4 = this.textures[var3];
            if (var4 != null) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               if (var4.fileId != 0) {
                  if (var2 >= 0) {
                     this.method6464(var1);
                     return;
                  }

                  if (var4.isLoaded) {
                     var4.method5417(var1);
                     var4.isLowDetail = false;
                  }
               }
            }
         }

         this.method6464(var1);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "kl.ak(" + ')');
      }
   }
}
