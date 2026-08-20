import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fl")
public class class134 {
   @ObfuscatedName("ft")
   static boolean field1821;
   @ObfuscatedName("av")
   int field1818;
   @ObfuscatedName("ag")
   float field1812 = Float.MAX_VALUE;
   @ObfuscatedName("an")
   float field1813 = Float.MAX_VALUE;
   @ObfuscatedName("ar")
   static int field1817;
   @ObfuscatedName("at")
   float field1816;
   @ObfuscatedSignature(descriptor = "Lfl;")
   @ObfuscatedName("ak")
   class134 field1820;
   @ObfuscatedName("ae")
   float field1814 = Float.MAX_VALUE;
   @ObfuscatedName("aj")
   float field1815 = Float.MAX_VALUE;
   @ToRemove(unused = "true")
   @ObfuscatedName("bi")
   static final int field1819 = 90;

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("av")
   void method4018(Buffer var1, int var2, int var3) {
      try {
         this.field1818 = var1.readShort((byte)-118) * -915709583;
         this.field1816 = var1.method12021(148945505);
         this.field1812 = var1.method12021(-835072064);
         this.field1813 = var1.method12021(585657854);
         this.field1814 = var1.method12021(109203057);
         this.field1815 = var1.method12021(287223291);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "fl.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("at")
   void method4019(Buffer var1, int var2) {
      this.field1818 = var1.readShort((byte)-78) * -2007863337;
      this.field1816 = var1.method12021(291581055);
      this.field1812 = var1.method12021(184394887);
      this.field1813 = var1.method12021(458966844);
      this.field1814 = var1.method12021(-1623977784);
      this.field1815 = var1.method12021(491512327);
   }

   class134() {
   }

   @ObfuscatedSignature(descriptor = "([I[IIII)V")
   @ObfuscatedName("ak")
   public static void method4022(int[] var0, int[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            if (var4 != -817675254) {
               throw new IllegalStateException();
            }

            int var5 = (var3 + var2) / 2;
            int var6 = var2;
            int var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            int var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;

            for (int var10 = var2; var10 < var3; var10++) {
               if (var0[var10] < (var10 & var9) + var7) {
                  if (var4 != -817675254) {
                     throw new IllegalStateException();
                  }

                  int var11 = var0[var10];
                  var0[var10] = var0[var6];
                  var0[var6] = var11;
                  int var12 = var1[var10];
                  var1[var10] = var1[var6];
                  var1[var6++] = var12;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method4022(var0, var1, var2, var6 - 1, -817675254);
            method4022(var0, var1, 1 + var6, var3, -817675254);
         }
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "fl.ak(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfl;Lxa;I)V")
   @ObfuscatedName("us")
   public static void method4020(class134 var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method4021(var1, var2);
      }

      var0.field1818 = var1.readShort((byte)-66) * -915709583;
      var0.field1816 = var1.method12021(-871110845);
      var0.field1812 = var1.method12021(257819034);
      var0.field1813 = var1.method12021(-713108687);
      var0.field1814 = var1.method12021(288081257);
      var0.field1815 = var1.method12021(-1978627313);
   }

   @ObfuscatedSignature(descriptor = "(B)[Lmz;")
   @ObfuscatedName("av")
   public static ServerPacket[] ServerPacket_values(byte var0) {
      try {
         return new ServerPacket[]{
            ServerPacket.field4024,
            ServerPacket.field4114,
            ServerPacket.field4091,
            ServerPacket.field4152,
            ServerPacket.field4028,
            ServerPacket.field4029,
            ServerPacket.field4030,
            ServerPacket.field4031,
            ServerPacket.field4032,
            ServerPacket.field4033,
            ServerPacket.field4036,
            ServerPacket.field4035,
            ServerPacket.field4108,
            ServerPacket.field4037,
            ServerPacket.field4038,
            ServerPacket.field4039,
            ServerPacket.field4040,
            ServerPacket.field4041,
            ServerPacket.field4107,
            ServerPacket.field4043,
            ServerPacket.field4093,
            ServerPacket.field4045,
            ServerPacket.field4046,
            ServerPacket.field4047,
            ServerPacket.field4065,
            ServerPacket.field4049,
            ServerPacket.field4154,
            ServerPacket.field4051,
            ServerPacket.field4084,
            ServerPacket.field4053,
            ServerPacket.field4054,
            ServerPacket.field4044,
            ServerPacket.field4056,
            ServerPacket.field4057,
            ServerPacket.field4058,
            ServerPacket.field4059,
            ServerPacket.field4060,
            ServerPacket.field4061,
            ServerPacket.field4026,
            ServerPacket.field4067,
            ServerPacket.field4064,
            ServerPacket.field4025,
            ServerPacket.field4066,
            ServerPacket.field4123,
            ServerPacket.field4068,
            ServerPacket.field4069,
            ServerPacket.field4062,
            ServerPacket.field4115,
            ServerPacket.field4117,
            ServerPacket.field4073,
            ServerPacket.field4097,
            ServerPacket.field4075,
            ServerPacket.field4076,
            ServerPacket.field4052,
            ServerPacket.field4078,
            ServerPacket.field4126,
            ServerPacket.field4080,
            ServerPacket.field4063,
            ServerPacket.field4077,
            ServerPacket.field4042,
            ServerPacket.field4125,
            ServerPacket.field4085,
            ServerPacket.field4081,
            ServerPacket.field4087,
            ServerPacket.field4088,
            ServerPacket.field4089,
            ServerPacket.field4090,
            ServerPacket.field4129,
            ServerPacket.field4092,
            ServerPacket.field4055,
            ServerPacket.field4112,
            ServerPacket.field4095,
            ServerPacket.field4050,
            ServerPacket.field4098,
            ServerPacket.field4148,
            ServerPacket.field4099,
            ServerPacket.field4100,
            ServerPacket.field4101,
            ServerPacket.field4102,
            ServerPacket.field4103,
            ServerPacket.field4104,
            ServerPacket.field4105,
            ServerPacket.field4048,
            ServerPacket.field4094,
            ServerPacket.field4070,
            ServerPacket.field4109,
            ServerPacket.field4110,
            ServerPacket.field4111,
            ServerPacket.field4083,
            ServerPacket.field4071,
            ServerPacket.field4118,
            ServerPacket.field4074,
            ServerPacket.field4116,
            ServerPacket.field4140,
            ServerPacket.field4082,
            ServerPacket.field4119,
            ServerPacket.field4120,
            ServerPacket.field4121,
            ServerPacket.field4122,
            ServerPacket.field4079,
            ServerPacket.field4124,
            ServerPacket.field4127,
            ServerPacket.field4151,
            ServerPacket.field4096,
            ServerPacket.field4128,
            ServerPacket.field4134,
            ServerPacket.field4130,
            ServerPacket.field4131,
            ServerPacket.field4132,
            ServerPacket.field4133,
            ServerPacket.field4113,
            ServerPacket.field4135,
            ServerPacket.field4136,
            ServerPacket.field4137,
            ServerPacket.field4138,
            ServerPacket.field4139,
            ServerPacket.field4106,
            ServerPacket.field4086,
            ServerPacket.field4142,
            ServerPacket.field4143,
            ServerPacket.field4144,
            ServerPacket.field4145,
            ServerPacket.field4146,
            ServerPacket.field4147,
            ServerPacket.field4141,
            ServerPacket.field4150,
            ServerPacket.field4072,
            ServerPacket.field4027,
            ServerPacket.field4034,
            ServerPacket.field4153,
            ServerPacket.field4149,
            ServerPacket.field4155,
            ServerPacket.field4156,
            ServerPacket.field4157,
            ServerPacket.field4158
         };
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "fl.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;Lcr;I)V")
   @ObfuscatedName("ih")
   static final void method4024(WorldView var0, Actor var1, int var2) {
      try {
         int var10002 = 340712311 * var1.x;
         int var10003 = var1.y * -1747310679;
         boolean var10004;
         if (var1 == class330.localPlayer) {
            if (var2 <= 1790199378) {
               throw new IllegalStateException();
            }

            var10004 = true;
         } else {
            var10004 = false;
         }

         client.field900.method11638(var0, var10002, var10003, var10004, 133741999);
         int var3 = GrandExchangeOfferUnitPriceComparator.method8832(var1.poseAnimationSequence, 1, client.field900, (byte)2);
         if (0 != (var3 & 2)) {
            if (var2 <= 1790199378) {
               throw new IllegalStateException();
            }

            var1.poseAnimationSequence.method10332((byte)4);
         }

         AnimationSequence.method10313(var1.field1152, 1683244579 * var1.idleSequence, 87349211);
         if (var1.poseAnimationSequence.method10335(1958668357) > 0 && var1.field1152.method10335(1958668357) < 30) {
            if (var2 <= 1790199378) {
               throw new IllegalStateException();
            }

            if (var1.poseAnimationSequence.getId(101022773) == var1.field1152.getId(168862208)) {
               if (var2 <= 1790199378) {
                  throw new IllegalStateException();
               }

               var1.field1152.setSequence(var1.poseAnimationSequence, 2052308201);
            } else {
               int var4 = GrandExchangeOfferUnitPriceComparator.method8832(var1.field1152, 1, null, (byte)58);
               if (0 != (var4 & 2)) {
                  if (var2 <= 1790199378) {
                     throw new IllegalStateException();
                  }

                  var1.field1152.method10332((byte)107);
               }
            }
         }

         IterableNodeHashTableIterator var9 = new IterableNodeHashTableIterator(Actor.method2786(var1, -1495999345));

         for (ActorSpotAnim var5 = (ActorSpotAnim)var9.method9152(); null != var5; var5 = (ActorSpotAnim)var9.next()) {
            if (var2 <= 1790199378) {
               throw new IllegalStateException();
            }

            if (-1 != -1003297275 * var5.id) {
               if (var2 <= 1790199378) {
                  throw new IllegalStateException();
               }

               if (client.cycle * 1759706017 < var5.startCycle * -1097832863) {
                  if (var2 <= 1790199378) {
                     return;
                  }
               } else {
                  AnimationSequence var6 = var5.animationSequence;
                  if (!AnimationSequence.method10315(var6, -831296794)) {
                     if (var2 <= 1790199378) {
                        return;
                     }

                     var5.remove();
                     var1.graphicsCount -= 75728729;
                  } else {
                     int var7 = GrandExchangeOfferUnitPriceComparator.method8832(var6, 1, client.field900, (byte)41);
                     if ((var7 & 1) != 0) {
                        var5.remove();
                        var1.graphicsCount -= 75728729;
                     }
                  }
               }
            }
         }

         if (AnimationSequence.method10315(var1.animationSequence, -831296794) && var1.field1153 * -1580752043 <= 1) {
            SequenceDefinition var10 = AnimationSequence.method10318(var1.animationSequence, 1346253047);
            if (var10.field2734 * 1930490603 == 1 && var1.field1164 * -114856975 > 0) {
               if (var2 <= 1790199378) {
                  throw new IllegalStateException();
               }

               if (var1.spotAnimation * 108069351 <= 1759706017 * client.cycle) {
                  if (var2 <= 1790199378) {
                     throw new IllegalStateException();
                  }

                  if (69976937 * var1.field1176 < 1759706017 * client.cycle) {
                     if (var2 <= 1790199378) {
                        return;
                     }

                     var1.field1153 = -296795651;
                     return;
                  }
               }
            }
         }

         if (-1580752043 * var1.field1153 > 0) {
            var1.field1153 -= -296795651;
         } else {
            int var11 = GrandExchangeOfferUnitPriceComparator.method8832(var1.animationSequence, 1, client.field900, (byte)24);
            if ((var11 & 2) != 0) {
               var1.animationSequence.reset(-2013038974);
            }
         }

         boolean var10001;
         label138: {
            if (AnimationSequence.method10315(var1.animationSequence, -831296794)) {
               if (var2 <= 1790199378) {
                  return;
               }

               if (AnimationSequence.method10318(var1.animationSequence, -890884171).field2725) {
                  if (var2 <= 1790199378) {
                     return;
                  }

                  var10001 = true;
                  break label138;
               }
            }

            var10001 = false;
         }

         var1.isWalking = var10001;
         classVW.method11640(client.field900, (byte)-127);
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "fl.ih(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("an")
   void method4021(Buffer var1, int var2) {
      this.field1818 = var1.readShort((byte)-105) * -915709583;
      this.field1816 = var1.method12021(12947393);
      this.field1812 = var1.method12021(-1037094234);
      this.field1813 = var1.method12021(243588613);
      this.field1814 = var1.method12021(420473235);
      this.field1815 = var1.method12021(-1381518596);
   }
}
