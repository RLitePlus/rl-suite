import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vj")
public class Fonts {
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("at")
   AbstractArchive fontsArchive;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("av")
   AbstractArchive spritesArchive;
   @ObfuscatedName("ag")
   HashMap map;

   @ObfuscatedSignature(descriptor = "([Lvy;)Ljava/util/HashMap;")
   @ObfuscatedName("an")
   public HashMap method11304(FontName[] var1) {
      HashMap var2 = new HashMap();
      FontName[] var3 = var1;

      for (int var4 = 0; var4 < var3.length; var4++) {
         FontName var5 = var3[var4];
         if (this.map.containsKey(var5)) {
            var2.put(var5, this.map.get(var5));
         } else {
            Font var6 = class147.method4137(this.fontsArchive, this.spritesArchive, var5.name, "", (byte)62);
            if (var6 != null) {
               this.map.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Liv;II[[IIIILiw;IB)Lky;")
   @ObfuscatedName("bd")
   public static Model method11309(
      ObjectComposition var0, int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8, byte var9
   ) {
      if (var0 == null) {
         var0.getModelDynamic(var1, var1, var3, var1, var1, var1, var7, var1, var9);
      }

      return var0.method5190(rl19.field5583, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @ObfuscatedSignature(descriptor = "([Lvy;)Ljava/util/HashMap;")
   @ObfuscatedName("at")
   public HashMap method11305(FontName[] var1) {
      HashMap var2 = new HashMap();
      FontName[] var3 = var1;

      for (int var4 = 0; var4 < var3.length; var4++) {
         FontName var5 = var3[var4];
         if (this.map.containsKey(var5)) {
            var2.put(var5, this.map.get(var5));
         } else {
            Font var6 = class147.method4137(this.fontsArchive, this.spritesArchive, var5.name, "", (byte)34);
            if (var6 != null) {
               this.map.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvj;[Lvy;)Ljava/util/HashMap;")
   @ObfuscatedName("oj")
   public static HashMap method11306(Fonts var0, FontName[] var1) {
      if (var0 == null) {
         return var0.method11305(var1);
      } else {
         HashMap var2 = new HashMap();
         FontName[] var3 = var1;

         for (int var4 = 0; var4 < var3.length; var4++) {
            FontName var5 = var3[var4];
            if (var0.map.containsKey(var5)) {
               var2.put(var5, var0.map.get(var5));
            } else {
               Font var6 = class147.method4137(var0.fontsArchive, var0.spritesArchive, var5.name, "", (byte)49);
               if (var6 != null) {
                  var0.map.put(var5, var6);
                  var2.put(var5, var6);
               }
            }
         }

         return var2;
      }
   }

   public Fonts(AbstractArchive var1, AbstractArchive var2) {
      this.fontsArchive = var1;
      this.spritesArchive = var2;
      this.map = new HashMap();
   }

   @ObfuscatedSignature(descriptor = "([Lvy;I)Ljava/util/HashMap;")
   @ObfuscatedName("av")
   public HashMap createMap(FontName[] var1, int var2) {
      try {
         HashMap var3 = new HashMap();
         FontName[] var4 = var1;

         for (int var5 = 0; var5 < var4.length; var5++) {
            if (var2 != 1097748137) {
               throw new IllegalStateException();
            }

            FontName var6 = var4[var5];
            if (this.map.containsKey(var6)) {
               if (var2 != 1097748137) {
                  throw new IllegalStateException();
               }

               var3.put(var6, this.map.get(var6));
            } else {
               Font var7 = class147.method4137(this.fontsArchive, this.spritesArchive, var6.name, "", (byte)78);
               if (var7 != null) {
                  this.map.put(var6, var7);
                  var3.put(var6, var7);
               }
            }
         }

         return var3;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "vj.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lts;Lxj;B)V")
   @ObfuscatedName("at")
   static void method11308(WorldEntity var0, PacketBuffer var1, byte var2) {
      try {
         int var3 = var1.readUnsignedByte(-595319432);
         if (0 != (var3 & 1)) {
            if (var2 != 2) {
               throw new IllegalStateException();
            }

            int var4 = Buffer.method12008(var1, (byte)5);
            int var5 = var1.readUnsignedByte(-371816232);
            if (65535 == var4) {
               if (var2 != 2) {
                  throw new IllegalStateException();
               }

               byte var9 = -1;
               AnimationSequence.method10313(var0.field5966, var9, 785237787);
               var0.field5966.method10332((byte)25);
               var0.field5968 = -1041917121 * var5;
            } else {
               label72: {
                  SequenceDefinition var6 = AnimationSequence.method10318(var0.field5966, 1789745785);
                  if (null != var6) {
                     if (var2 != 2) {
                        throw new IllegalStateException();
                     }

                     if (var4 == var0.method10863(435334531)) {
                        if (var2 != 2) {
                           throw new IllegalStateException();
                        }

                        int var7 = 564693013 * var6.restartMode;
                        if (var7 == 1) {
                           if (var2 != 2) {
                              return;
                           }

                           var0.field5966.method10332((byte)103);
                           var0.field5968 = -1041917121 * var5;
                        }

                        if (var7 == 2) {
                           if (var2 != 2) {
                              throw new IllegalStateException();
                           }

                           var0.field5966.method10333((byte)122);
                        }
                        break label72;
                     }

                     if (ClientPacket.SequenceDefinition_get(var4, 1114890188).field2726 * -1808717695 < var6.field2726 * -1808717695) {
                        if (var2 != 2) {
                           throw new IllegalStateException();
                        }
                        break label72;
                     }
                  }

                  AnimationSequence.method10313(var0.field5966, var4, 905522825);
                  var0.field5966.method10332((byte)100);
                  var0.field5968 = -1041917121 * var5;
               }
            }
         }

         if ((var3 & 2) != 0) {
            if (var2 != 2) {
               return;
            }

            var0.method10849(var1.readUnsignedByte(357555266), (byte)1);
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "vj.at(" + ')');
      }
   }
}
