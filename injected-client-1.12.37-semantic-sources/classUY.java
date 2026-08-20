import net.runelite.api.events.PostStructComposition;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uy")
public abstract class classUY extends classTH implements classAAJ {
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field6424 = 18;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   public int method11703() {
      return -1627988871 * this.field6137;
   }

   @ObfuscatedSignature(descriptor = "(II)Lur;")
   @ObfuscatedName("az")
   protected abstract classUR vmethod606(int var1, int var2);

   @ObfuscatedSignature(descriptor = "(I)Lur;")
   @ObfuscatedName("ag")
   protected abstract classUR vmethod607(int var1);

   @ObfuscatedSignature(descriptor = "(I)Lur;")
   @ObfuscatedName("as")
   protected abstract classUR vmethod608(int var1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   public int method11704() {
      return -1627988871 * this.field6137;
   }

   @ObfuscatedSignature(descriptor = "(I)Lur;")
   @ObfuscatedName("ax")
   protected abstract classUR vmethod609(int var1);

   protected classUY(classKX var1, classXO var2, int var3) {
      super(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(IB)Ljava/lang/Object;")
   @ObfuscatedName("ae")
   @Override
   public Object vmethod6(int var1, byte var2) {
      try {
         classUR var3 = this.vmethod606(var1, 1241421818);
         if (null != var3) {
            if (classUR.method11519(var3, 1953474919)) {
               return var3.method11523(1949231943);
            }

            if (var2 >= 0) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "uy.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   public int method11705() {
      return 1493591413 * this.field6137;
   }

   @ObfuscatedSignature(descriptor = "(Luy;Lxy;I)Laaz;")
   @ObfuscatedName("xn")
   public static classAAZ method11707(classUY var0, classXY var1, int var2) {
      if (var0 == null) {
         return var0.method11709(var1, var2);
      } else {
         try {
            int var3 = classXY.method13047(var1, -1621289879);
            classUR var4 = var0.vmethod606(var3, 20231137);
            classAAZ var5 = new classAAZ(var3);
            Class var6 = var4.field6373.field7109;
            if (Integer.class == var6) {
               var5.field120 = var1.method13056((byte)1);
            } else if (Long.class == var6) {
               var5.field120 = var1.method13059(1652502764);
            } else if (var6 == String.class) {
               var5.field120 = var1.method13077(1119042216);
            } else {
               if (!classXV.class.isAssignableFrom(var6)) {
                  throw new IllegalStateException();
               }

               if (var2 <= -785197785) {
                  throw new IllegalStateException();
               }

               try {
                  classXV var7 = (classXV)var6.newInstance();
                  var7.method12948(var1, (byte)-17);
                  var5.field120 = var7;
               } catch (InstantiationException var8) {
               } catch (IllegalAccessException var9) {
               }
            }

            return var5;
         } catch (RuntimeException var10) {
            throw classEG.method3884(var10, "uy.ab(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("af")
   public int method11706(byte var1) {
      try {
         return -1627988871 * this.field6137;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "uy.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("al")
   @Override
   public Object vmethod5(int var1) {
      classUR var2 = this.vmethod606(var1, -1663914667);
      return null != var2 && classUR.method11519(var2, 2022911592) ? var2.method11523(2093263743) : null;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("aj")
   @Override
   public Object vmethod7(int var1) {
      classUR var2 = this.vmethod606(var1, 940192300);
      return null != var2 && classUR.method11519(var2, 2131644615) ? var2.method11523(1891825846) : null;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Laaz;")
   @ObfuscatedName("ay")
   public classAAZ method11708(classXY var1) {
      int var2 = classXY.method13047(var1, -1639067797);
      classUR var3 = this.vmethod606(var2, 1337955535);
      classAAZ var4 = new classAAZ(var2);
      Class var5 = var3.field6373.field7109;
      if (Integer.class == var5) {
         var4.field120 = var1.method13056((byte)1);
      } else if (Long.class == var5) {
         var4.field120 = var1.method13059(-1316144705);
      } else if (var5 == String.class) {
         var4.field120 = var1.method13077(656006653);
      } else {
         if (!classXV.class.isAssignableFrom(var5)) {
            throw new IllegalStateException();
         }

         try {
            classXV var6 = (classXV)var5.newInstance();
            var6.method12948(var1, (byte)-61);
            var4.field120 = var6;
         } catch (InstantiationException var7) {
         } catch (IllegalAccessException var8) {
         }
      }

      return var4;
   }

   @ObfuscatedSignature(descriptor = "(II)Lpr;")
   @ObfuscatedName("az")
   public static classPR method11710(int var0, int var1) {
      int var4 = var0;
      int var5 = 64572192;

      classPR var10000;
      try {
         classPR var6 = (classPR)classPR.field5385.method6422(var4);
         if (var6 != null) {
            var10000 = var6;
         } else {
            byte[] var7 = classPR.field5391.method11867(34, var4, -1876871032);
            var6 = new classPR(new classXY(var7), var4);
            classPR.field5385.method6428(var6, var4);
            var10000 = var6;
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "uy.az(" + ')');
      }

      classPR var2 = var10000;
      if (var2.getId() == -1) {
         var2.field5386 = var0;
         PostStructComposition var3 = new PostStructComposition();
         var3.setStructComposition(var2);
         classOE.field4843.getCallbacks().post(var3);
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)Laaz;")
   @ObfuscatedName("ab")
   public classAAZ method11709(classXY var1, int var2) {
      try {
         int var3 = classXY.method13047(var1, -1621289879);
         classUR var4 = this.vmethod606(var3, 20231137);
         classAAZ var5 = new classAAZ(var3);
         Class var6 = var4.field6373.field7109;
         if (Integer.class == var6) {
            var5.field120 = var1.method13122((byte)1);
         } else if (Long.class == var6) {
            var5.field120 = var1.method13059(1652502764);
         } else if (var6 == String.class) {
            var5.field120 = var1.method13071(1119042216);
         } else {
            if (!classXV.class.isAssignableFrom(var6)) {
               throw new IllegalStateException();
            }

            if (var2 <= -785197785) {
               throw new IllegalStateException();
            }

            try {
               classXV var7 = (classXV)var6.newInstance();
               var7.method12948(var1, (byte)-17);
               var5.field120 = var7;
            } catch (InstantiationException var8) {
            } catch (IllegalAccessException var9) {
            }
         }

         return var5;
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "uy.ab(" + ')');
      }
   }
}
