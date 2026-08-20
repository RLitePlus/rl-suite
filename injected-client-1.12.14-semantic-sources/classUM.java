import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("um")
public abstract class classUM extends class320 implements classXR {
   @ObfuscatedSignature(descriptor = "(Lxa;)Lxx;")
   @ObfuscatedName("ad")
   public classXX method11190(Buffer var1) {
      int var2 = Buffer.method12008(var1, (byte)5);
      classUE var3 = this.vmethod414(var2, -834080717);
      classXX var4 = new classXX(var2);
      Class var5 = var3.field6033.field6373;
      if (Integer.class == var5) {
         var4.field6647 = Buffer.method12015(var1, 1807471622);
      } else if (var5 == Long.class) {
         var4.field6647 = Buffer.method12018(var1, -2111048387);
      } else if (String.class == var5) {
         var4.field6647 = var1.readStringCp1252NullTerminatedOrNull(1424410752);
      } else {
         if (!classXP.class.isAssignableFrom(var5)) {
            throw new IllegalStateException();
         }

         try {
            classXP var6 = (classXP)var5.newInstance();
            var6.method12460(var1, 183116085);
            var4.field6647 = var6;
         } catch (InstantiationException var7) {
         } catch (IllegalAccessException var8) {
         }
      }

      return var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lum;)I")
   @ObfuscatedName("uc")
   public static int method11184(classUM var0) {
      return -514178633 * var0.field3818;
   }

   @ObfuscatedSignature(descriptor = "(II)Lue;")
   @ObfuscatedName("av")
   protected abstract classUE vmethod414(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(Lum;B)I")
   @ObfuscatedName("wn")
   public static int method11185(classUM var0, byte var1) {
      if (var0 == null) {
         var0.method11189(var1);
      }

      try {
         return -514178633 * var0.field3818;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "um.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/Object;")
   @ObfuscatedName("ag")
   @Override
   public Object vmethod411(int var1, int var2) {
      try {
         classUE var3 = this.vmethod414(var1, 1020542872);
         if (var3 != null) {
            if (var2 >= -1791519382) {
               throw new IllegalStateException();
            }

            if (var3.method11120((byte)-20)) {
               return classUE.method11121(var3, 2042259295);
            }

            if (var2 >= -1791519382) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "um.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lue;")
   @ObfuscatedName("ae")
   protected abstract classUE vmethod415(int var1);

   @ObfuscatedSignature(descriptor = "(I)Lue;")
   @ObfuscatedName("aj")
   protected abstract classUE vmethod416(int var1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   public int method11186() {
      return -514178633 * this.field3818;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("au")
   @Override
   public Object vmethod412(int var1) {
      classUE var2 = this.vmethod414(var1, 1531216522);
      return var2 != null && var2.method11120((byte)27) ? classUE.method11121(var2, 1960743268) : null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   public int method11187() {
      return -514178633 * this.field3818;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxk;II)V")
   @ObfuscatedName("sh")
   public static void method11195(Menu var0, int var1, int var2) {
      if (var0 == null) {
         var0.createMenuEntry(var1);
      }

      class604.method12442(var0, (byte)14);
      var0.menuX = -876072597 * (var1 - var0.menuWidth * 1097312698 / 2);
      if (1237019199 * var0.menuX + var0.menuWidth * -431072457 > 86317672 * class489.canvasWidth) {
         var0.menuX = 1202979433 * class489.canvasWidth - -2128407154 * var0.menuWidth;
      }

      if (var0.menuX * -1870454030 < 0) {
         var0.menuX = 0;
      }

      var0.menuY = 1877284923 * var2;
      if (var0.menuY * 1308492019 + var0.menuHeight * 399255337 > 1985073442 * class374.canvasHeight) {
         var0.menuY = 2071003580 * class374.canvasHeight - 1771977176 * var0.menuHeight;
      }

      if (1308492019 * var0.menuY < 0) {
         var0.menuY = 0;
      }

      if (1227402295 * var0.field6567 != -1 && var0.subMenus[180456857 * var0.field6567] != null) {
         var0.subMenus[180456857 * var0.field6567].method12404(var0, 219952160);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   public int method11188() {
      return -514178633 * this.field3818;
   }

   protected classUM(StudioGame var1, Language var2, int var3) {
      super(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("az")
   @Override
   public Object vmethod413(int var1) {
      classUE var2 = this.vmethod414(var1, -278011508);
      return var2 != null && var2.method11120((byte)72) ? classUE.method11121(var2, 2016880610) : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkm;)I")
   @ObfuscatedName("qd")
   public static int method11194(classKM var0) {
      return var0 == null ? var0.method6483() : var0.field3370 * -1638078021;
   }

   @ObfuscatedSignature(descriptor = "(Lum;Lxa;S)Lxx;")
   @ObfuscatedName("uv")
   public static classXX method11191(classUM var0, Buffer var1, short var2) {
      if (var0 == null) {
         return var0.method11193(var1, var2);
      } else {
         try {
            int var3 = Buffer.method12008(var1, (byte)5);
            classUE var4 = var0.vmethod414(var3, -535565336);
            classXX var5 = new classXX(var3);
            Class var6 = var4.field6033.field6373;
            if (Integer.class == var6) {
               if (var2 <= 7507) {
                  throw new IllegalStateException();
               }

               var5.field6647 = Buffer.method12015(var1, -702933946);
            } else if (var6 == Long.class) {
               if (var2 <= 7507) {
                  throw new IllegalStateException();
               }

               var5.field6647 = Buffer.method12018(var1, -2142338196);
            } else if (String.class == var6) {
               if (var2 <= 7507) {
                  throw new IllegalStateException();
               }

               var5.field6647 = var1.readStringCp1252NullTerminatedOrNull(1841902876);
            } else {
               if (!classXP.class.isAssignableFrom(var6)) {
                  throw new IllegalStateException();
               }

               try {
                  classXP var7 = (classXP)var6.newInstance();
                  var7.method12460(var1, 183116085);
                  var5.field6647 = var7;
               } catch (InstantiationException var8) {
               } catch (IllegalAccessException var9) {
               }
            }

            return var5;
         } catch (RuntimeException var10) {
            throw RestClientThreadFactory.newRunException(var10, "um.an(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)Lxx;")
   @ObfuscatedName("ai")
   public classXX method11192(Buffer var1) {
      int var2 = Buffer.method12008(var1, (byte)5);
      classUE var3 = this.vmethod414(var2, 960423798);
      classXX var4 = new classXX(var2);
      Class var5 = var3.field6033.field6373;
      if (Integer.class == var5) {
         var4.field6647 = Buffer.method12015(var1, 1384109684);
      } else if (var5 == Long.class) {
         var4.field6647 = Buffer.method12018(var1, -1983374339);
      } else if (String.class == var5) {
         var4.field6647 = var1.readStringCp1252NullTerminatedOrNull(988247195);
      } else {
         if (!classXP.class.isAssignableFrom(var5)) {
            throw new IllegalStateException();
         }

         try {
            classXP var6 = (classXP)var5.newInstance();
            var6.method12460(var1, 183116085);
            var4.field6647 = var6;
         } catch (InstantiationException var7) {
         } catch (IllegalAccessException var8) {
         }
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("at")
   public int method11189(byte var1) {
      try {
         return -514178633 * this.field3818;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "um.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;S)Lxx;")
   @ObfuscatedName("an")
   public classXX method11193(Buffer var1, short var2) {
      try {
         int var3 = Buffer.method12008(var1, (byte)5);
         classUE var4 = this.vmethod414(var3, -535565336);
         classXX var5 = new classXX(var3);
         Class var6 = var4.field6033.field6373;
         if (Integer.class == var6) {
            if (var2 <= 7507) {
               throw new IllegalStateException();
            }

            var5.field6647 = Buffer.method12015(var1, -702933946);
         } else if (var6 == Long.class) {
            if (var2 <= 7507) {
               throw new IllegalStateException();
            }

            var5.field6647 = Buffer.method12018(var1, -2142338196);
         } else if (String.class == var6) {
            if (var2 <= 7507) {
               throw new IllegalStateException();
            }

            var5.field6647 = var1.readStringCp1252NullTerminatedOrNull(1841902876);
         } else {
            if (!classXP.class.isAssignableFrom(var6)) {
               throw new IllegalStateException();
            }

            try {
               classXP var7 = (classXP)var6.newInstance();
               var7.method12460(var1, 183116085);
               var5.field6647 = var7;
            } catch (InstantiationException var8) {
            } catch (IllegalAccessException var9) {
            }
         }

         return var5;
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "um.an(" + ')');
      }
   }
}
