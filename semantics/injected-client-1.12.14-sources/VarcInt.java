import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hg")
public class VarcInt extends DualNode {
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field2190 = 9;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("at")
   static EvictingDualNodeHashTable VarcInt_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ag")
   public boolean persist = false;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("av")
   static AbstractArchive VarcInt_archive;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("cu")
   public static AbstractArchive ObjectDefinition_archive;
   @ToRemove(unused = "true")
   @ObfuscatedName("ek")
   static final int field2191 = 512;
   @ObfuscatedName("ip")
   static List field2192;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("jy")
   static Archive field2195;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("aj")
   public static void method4522(AbstractArchive var0) {
      VarcInt_archive = var0;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ap")
   void method4525(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(1902732932);
         if (var2 == 0) {
            return;
         }

         this.method4528(var1, var2, -1914860083);
      }
   }

   VarcInt() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhg;")
   @ObfuscatedName("ak")
   public static VarcInt method4523(int var0) {
      VarcInt var1 = (VarcInt)class402.method8806(VarcInt_cached, var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = VarcInt_archive.getFile(19, var0, 1780078445);
         var1 = new VarcInt();
         if (var2 != null) {
            method4526(var1, new Buffer(var2), (byte)0);
         }

         VarcInt_cached.put(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   public static void method4524() {
      VarcInt_cached.clear();
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("ae")
   void method4528(Buffer var1, int var2, int var3) {
      try {
         if (var2 == 2) {
            if (var3 >= 1228280) {
               throw new IllegalStateException();
            }

            this.persist = true;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hg.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/String;I)Lut;")
   @ObfuscatedName("cy")
   static DynamicArray method4531(Object var0, String var1, int var2) {
      try {
         if (null == var0) {
            if (var2 >= 303546430) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException();
            }
         } else {
            return (DynamicArray)var0;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "hg.cy(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhg;Lxa;B)V")
   @ObfuscatedName("yb")
   public static void method4526(VarcInt var0, Buffer var1, byte var2) {
      if (var0 == null) {
         var0.method4527(var1, var2);
      } else {
         try {
            while (true) {
               int var3 = var1.readUnsignedByte(1575727273);
               if (var3 == 0) {
                  if (var2 != 0) {
                     return;
                  } else {
                     return;
                  }
               }

               var0.method4528(var1, var3, -1788570780);
            }
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "hg.an(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("ab")
   static final boolean method4529(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         int var8 = var6 + -459009589 * ViewportMouse.ViewportMouse_y;
         if (var8 < var0) {
            if (var7 >= 862283357) {
               throw new IllegalStateException();
            }

            if (var8 < var1) {
               if (var7 >= 862283357) {
                  throw new IllegalStateException();
               }

               if (var8 < var2) {
                  if (var7 >= 862283357) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }
         }

         var8 = ViewportMouse.ViewportMouse_y * -459009589 - var6;
         if (var8 > var0) {
            if (var7 >= 862283357) {
               throw new IllegalStateException();
            }

            if (var8 > var1) {
               if (var7 >= 862283357) {
                  throw new IllegalStateException();
               }

               if (var8 > var2) {
                  return false;
               }
            }
         }

         var8 = var6 + 770621097 * ViewportMouse.ViewportMouse_x;
         if (var8 < var3) {
            if (var7 >= 862283357) {
               throw new IllegalStateException();
            }

            if (var8 < var4) {
               if (var7 >= 862283357) {
                  throw new IllegalStateException();
               }

               if (var8 < var5) {
                  if (var7 >= 862283357) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }
         }

         var8 = ViewportMouse.ViewportMouse_x * 770621097 - var6;
         return var8 <= var3 || var8 <= var4 || var8 <= var5;
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "hg.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("id")
   static final int method4530(int var0, byte var1) {
      try {
         if (Math.abs(var0 - 197556079 * WorldMapData_0.cameraYaw) > 1024) {
            byte var10002;
            if (var0 < WorldMapData_0.cameraYaw * 197556079) {
               if (var1 <= 16) {
                  throw new IllegalStateException();
               }

               var10002 = 1;
            } else {
               var10002 = -1;
            }

            return var0 + 2048 * var10002;
         } else {
            return var0;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hg.id(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("an")
   void method4527(Buffer var1, byte var2) {
      try {
         while (true) {
            int var3 = var1.readSignedShort(1575727273);
            if (var3 == 0) {
               if (var2 != 0) {
                  return;
               }

               return;
            }

            this.method4528(var1, var3, -1788570780);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hg.an(" + ')');
      }
   }
}
