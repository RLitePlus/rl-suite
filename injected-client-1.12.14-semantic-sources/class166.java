import java.awt.Image;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gj")
public class class166 extends classFM {
   @ObfuscatedName("af")
   static Image field2021;
   @ObfuscatedName("at")
   String field2017;
   @ObfuscatedName("ag")
   int field2016;
   @ObfuscatedName("av")
   long field2018;
   @ToRemove(unused = "true")
   @ObfuscatedName("dp")
   static final int field2019 = 2;
   @ObfuscatedSignature(descriptor = "Ldj;")
   @ObfuscatedName("gq")
   static Varcs varcs;
   @ObfuscatedSignature(descriptor = "Lky;")
   @ObfuscatedName("qr")
   static Model field2022;

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod183(Buffer var1) {
      if (var1.readUnsignedByte(750515188) != 255) {
         var1.offset -= 1741769013;
         this.field2018 = Buffer.method12018(var1, -1962290256) * 5277103562960842325L;
      }

      this.field2017 = var1.readCESU8(792604665);
      this.field2016 = Buffer.method12008(var1, (byte)5) * -1161096071;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod182(Buffer var1, byte var2) {
      try {
         if (var1.readUnsignedByte(-1169143008) != 255) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            var1.offset -= 1741769013;
            this.field2018 = Buffer.method12018(var1, -1963992786) * 5277103562960842325L;
         }

         this.field2017 = var1.readCESU8(792604665);
         this.field2016 = Buffer.method12008(var1, (byte)5) * 1437954529;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gj.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqp;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("aj")
   public static int method4242(GrandExchangeOfferNameComparator var0, Object var1, Object var2) {
      return var0 == null
         ? var0.method9132(var1, var1)
         : GrandExchangeOfferNameComparator.method9128(var0, (GrandExchangeEvent)var1, (GrandExchangeEvent)var2, (byte)-98);
   }

   class166(class154 var1) {
      this.this$0 = var1;
      this.field2018 = -5277103562960842325L;
      this.field2017 = null;
      this.field2016 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod184(Buffer var1) {
      if (var1.readUnsignedByte(719235746) != 255) {
         var1.offset -= 1741769013;
         this.field2018 = Buffer.method12018(var1, -1937329310) * 5277103562960842325L;
      }

      this.field2017 = var1.readCESU8(792604665);
      this.field2016 = Buffer.method12008(var1, (byte)5) * 1437954529;
   }

   @ObfuscatedSignature(descriptor = "(Lgs;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod185(ClanSettings var1, byte var2) {
      try {
         ClanSettings.method4293(var1, this.field2018 * -5037811622651568387L, this.field2017, this.field2016 * -2115333599, -554844003);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gj.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod186(ClanSettings var1) {
      ClanSettings.method4293(var1, this.field2018 * -5037811622651568387L, this.field2017, this.field2016 * -2115333599, -1601620697);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("mu")
   static final void method4243(int var0, int var1, int var2) {
      try {
         int[] var3 = new int[WorldViewManager.method2927(client.worldViewManager, 751747207)];
         float[] var4 = new float[WorldViewManager.method2927(client.worldViewManager, 751747207)];
         int var5 = 0;

         for (WorldView var7 : client.worldViewManager) {
            var3[var5] = var7.id * 577964535;
            var4[var5] = var7.scene.field2929;
            var5++;
         }

         class144.method3968(var4, var3, -1459225483);
         HashMap var28 = new HashMap();

         for (int var26 = var3.length - 1; var26 >= 0; var26--) {
            if (var2 >= -587457338) {
               throw new IllegalStateException();
            }

            if (!(var4[var26] > 0.0F)) {
               if (var2 >= -587457338) {
                  throw new IllegalStateException();
               }

               if (var3[var26] != -1) {
                  continue;
               }

               if (var2 >= -587457338) {
                  throw new IllegalStateException();
               }
            }

            ClickAction var29 = WorldViewManager.method2945(client.worldViewManager, var3[var26], -560956433);
            if (!var28.containsKey(var29)) {
               if (var2 >= -587457338) {
                  throw new IllegalStateException();
               }

               var28.put(var29, var3[var26]);
            }
         }

         for (int var27 = 0; var27 < var3.length; var27++) {
            if (var2 >= -587457338) {
               throw new IllegalStateException();
            }

            int var30 = var3[var27];
            ClickAction var8 = WorldViewManager.method2945(client.worldViewManager, var30, 1200711848);
            Integer var9 = (Integer)var28.get(var8);
            if (null != var9 && var9.equals(var30)) {
               if (var8 == ClickAction.field6119) {
                  if (var2 >= -587457338) {
                     throw new IllegalStateException();
                  }

                  ClanChannel.insertMenuItem(Strings.field5024, "", 23, 0, var0, var1, 0, false, var30, 65535);
               } else if (ClickAction.field6120 == var8) {
                  if (var2 >= -587457338) {
                     throw new IllegalStateException();
                  }

                  int var10 = 164941911 * client.viewportWidth / 2;
                  int var11 = 620574401 * client.viewportHeight / 2;
                  int var12 = client.viewportZoom * 1624872185;
                  ProjectionCoord var13 = class210.method4891(
                     Occluder.topLevelWorldView.scene,
                     client.field867 * -852488123,
                     SpriteBufferProperties.cameraX * -201184013,
                     ScriptFrame.cameraY * 2001367751,
                     class528.cameraZ * 1084219535,
                     var10,
                     var11,
                     var12,
                     -317748003
                  );
                  if (var13 != null) {
                     if (var2 >= -587457338) {
                        throw new IllegalStateException();
                     }

                     ProjectionCoord var14 = FaceNormal.method6214(
                        -361115983 * client.field828, -852488123 * client.field867, client.field674 * -291215063, -239646659
                     );
                     ProjectionCoord var16 = class30.method1304(var13, 742787141);
                     var16.method9892(var14, 1781153076);
                     ProjectionCoord var17 = class451.method9731(ProjectionCoord.field5717, var16, (byte)1);
                     ProjectionCoord var19 = ProjectionCoord.field5718;
                     float var18 = var17.method9897(var19, 1524499395);
                     ProjectionCoord var22 = ProjectionCoord.field5717;
                     float var21 = var22.method9897(var16, -598702680);
                     float var23 = (float)Math.atan2(var18, var21);
                     int var24 = classLX.method7323(var23, -143527022);
                     var24 = classGW.method4374(var24, 1669644862);
                     ClanChannel.insertMenuItem(Strings.field5025, "", 60, var24, 0, 0, 0, false, var30, 65535);
                     var14.release(-804947546);
                     var16.release(-804947546);
                     var17.release(-804947546);
                     var13.release(-804947546);
                  }
               }
            }
         }
      } catch (RuntimeException var25) {
         throw RestClientThreadFactory.newRunException(var25, "gj.mu(" + ')');
      }
   }
}
