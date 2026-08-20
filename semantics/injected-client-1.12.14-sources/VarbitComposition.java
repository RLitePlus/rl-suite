import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ii")
public class VarbitComposition extends DualNode implements net.runelite.api.VarbitComposition {
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field2482 = 39;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("at")
   public static AbstractArchive VarbitDefinition_archive;
   @ObfuscatedName("av")
   static final int[] field2480 = new int[32];
   @ObfuscatedName("ae")
   public int startBit;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ag")
   public static EvictingDualNodeHashTable VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("aj")
   public int endBit;
   @ObfuscatedName("an")
   public int baseVar;
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   static final String field2486 = ",";
   @ObfuscatedSignature(descriptor = "Lqy;")
   @ObfuscatedName("vm")
   static JagNetThread field2488;

   @ObfuscatedSignature(descriptor = "(Lii;Lxa;IB)V")
   @ObfuscatedName("se")
   public static void method4901(VarbitComposition var0, Buffer var1, int var2, byte var3) {
      if (var0 == null) {
         var0.decodeNext(var1, var2, var3);
      } else {
         try {
            if (var2 == 1) {
               if (var3 <= 0) {
                  throw new IllegalStateException();
               }

               var0.baseVar = Buffer.method12008(var1, (byte)5) * -639606607;
               var0.startBit = var1.readUnsignedByte(-51709492) * 1958600907;
               var0.endBit = var1.readUnsignedByte(2060613458) * 535230935;
            }
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "ii.ag(" + ')');
         }
      }
   }

   public int getLeastSignificantBit() {
      return this.startBit * 1628144867;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lii;Lxa;I)V")
   @ObfuscatedName("jg")
   public static void method4902(VarbitComposition var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.getIndex();
      }

      if (var2 == 1) {
         var0.baseVar = Buffer.method12008(var1, (byte)5) * -639606607;
         var0.startBit = var1.readUnsignedByte(-1627381207) * 2017695108;
         var0.endBit = var1.readUnsignedByte(965276830) * 720882571;
      }
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("pj")
   static void method4907(boolean var0, byte var1) {
      try {
         client.leftClickOpensMenu = var0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ii.pj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("at")
   public void decode(Buffer var1, byte var2) {
      try {
         while (true) {
            int var3 = var1.readUnsignedByte(496382860);
            if (var3 == 0) {
               return;
            }

            method4901(this, var1, var3, (byte)101);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ii.at(" + ')');
      }
   }

   static {
      byte var0 = 2;

      for (int var1 = 0; var1 < 32; var1++) {
         field2480[var1] = var0 - 1;
         var0 += var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   public static void method4893() {
      VarbitDefinition_cached.clear();
   }

   public int getIndex() {
      return this.baseVar * 1051846737;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lii;Lxa;)V")
   @ObfuscatedName("gd")
   public static void method4897(VarbitComposition var0, Buffer var1) {
      if (var0 == null) {
         var0.method4899(var1);
      } else {
         while (true) {
            int var2 = var1.readUnsignedByte(950668876);
            if (var2 == 0) {
               return;
            }

            method4901(var0, var1, var2, (byte)85);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("aw")
   public void method4898(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(1180013162);
         if (var2 == 0) {
            return;
         }

         method4901(this, var1, var2, (byte)41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("an")
   public static int method4895(int var0, byte var1) {
      try {
         return var0 >> 1 & 3;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ii.an(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public static void method4894() {
      VarbitDefinition_cached.clear();
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ap")
   public void method4899(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(1088228120);
         if (var2 == 0) {
            return;
         }

         method4901(this, var1, var2, (byte)60);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;)I")
   @ObfuscatedName("dp")
   public static int method4906(classSF var0) {
      return var0.field5765 * 2134183747;
   }

   public int getMostSignificantBit() {
      return this.endBit * -1525413401;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ak")
   public void method4900(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(237342515);
         if (var2 == 0) {
            return;
         }

         method4901(this, var1, var2, (byte)32);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("au")
   void method4903(Buffer var1, int var2) {
      if (var2 == 1) {
         this.baseVar = Buffer.method12008(var1, (byte)5) * -754851627;
         this.startBit = var1.readUnsignedByte(1299210239) * 1958600907;
         this.endBit = var1.readUnsignedByte(-1407707875) * 117390359;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("at")
   public static void method4905(int var0, int var1, int var2) {
      try {
         VarbitComposition var4 = (VarbitComposition)class402.method8806(VarbitDefinition_cached, var0);
         VarbitComposition var3;
         if (null != var4) {
            if (var2 >= -366819156) {
               throw new IllegalStateException();
            }

            var3 = var4;
         } else {
            byte[] var5 = VarbitDefinition_archive.getFile(14, var0, -62450920);
            var4 = new VarbitComposition();
            if (var5 != null) {
               if (var2 >= -366819156) {
                  throw new IllegalStateException();
               }

               var4.decode(new Buffer(var5), (byte)7);
            }

            VarbitDefinition_cached.put(var4, var0);
            var3 = var4;
         }

         int var6;
         int var8;
         int var11;
         label47: {
            var11 = var3.baseVar * 1051846737;
            var6 = 1628144867 * var3.startBit;
            int var7 = -1525413401 * var3.endBit;
            var8 = Varps.Varps_masks[var7 - var6];
            if (var1 >= 0) {
               if (var2 >= -366819156) {
                  return;
               }

               if (var1 <= var8) {
                  break label47;
               }

               if (var2 >= -366819156) {
                  throw new IllegalStateException();
               }
            }

            var1 = 0;
         }

         var8 <<= var6;
         Varps.Varps_main[var11] = Varps.Varps_main[var11] & ~var8 | var1 << var6 & var8;
         client.method2414(var11);
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "ii.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)J")
   @ObfuscatedName("av")
   public static long method4892(CharSequence var0, int var1) {
      try {
         long var2 = 0L;
         int var4 = var0.length();

         for (int var5 = 0; var5 < var4; var5++) {
            label86: {
               var2 *= 37L;
               char var6 = var0.charAt(var5);
               if (var6 >= 'A') {
                  if (var1 != 16711680) {
                     throw new IllegalStateException();
                  }

                  if (var6 <= 'Z') {
                     var2 += 1 + var6 - 65;
                     break label86;
                  }
               }

               if (var6 >= 'a') {
                  if (var1 != 16711680) {
                     throw new IllegalStateException();
                  }

                  if (var6 <= 'z') {
                     if (var1 != 16711680) {
                        throw new IllegalStateException();
                     }

                     var2 += 1 + var6 - 97;
                     break label86;
                  }
               }

               if (var6 >= '0') {
                  if (var1 != 16711680) {
                     throw new IllegalStateException();
                  }

                  if (var6 <= '9') {
                     var2 += var6 + 27 - 48;
                  }
               }
            }

            if (var2 >= 177917621779460413L) {
               if (var1 != 16711680) {
                  throw new IllegalStateException();
               }
               break;
            }
         }

         while (0L == var2 % 37L) {
            if (var1 != 16711680) {
               throw new IllegalStateException();
            }

            if (var2 == 0L) {
               break;
            }

            if (var1 != 16711680) {
               throw new IllegalStateException();
            }

            var2 /= 37L;
         }

         return var2;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "ii.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;IB)V")
   @ObfuscatedName("ag")
   void decodeNext(Buffer var1, int var2, byte var3) {
      try {
         if (var2 == 1) {
            if (var3 <= 0) {
               throw new IllegalStateException();
            }

            this.endBit = Buffer.method12008(var1, (byte)5) * -639606607;
            this.startBit = var1.readUnsignedShortAddLE(-51709492) * 1958600907;
            this.baseVar = var1.readMedium(2060613458) * 535230935;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ii.ag(" + ')');
      }
   }
}
