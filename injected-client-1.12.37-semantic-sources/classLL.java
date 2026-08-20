import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ll")
public class classLL {
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final String field4189 = "";
   @ObfuscatedName("af")
   public static final short[][] field4187 = new short[][]{
      {
            6798,
            107,
            10283,
            16,
            4797,
            7744,
            5799,
            4634,
            -31839,
            22433,
            2983,
            -11343,
            8,
            5281,
            10438,
            3650,
            -27322,
            -21845,
            200,
            571,
            908,
            21830,
            28946,
            -15701,
            -14010,
            -22122,
            937,
            8130,
            -13422,
            30385
      },
      {
            8741,
            12,
            -1506,
            -22374,
            7735,
            8404,
            1701,
            -27106,
            24094,
            10153,
            -8915,
            4783,
            1341,
            16578,
            -30533,
            25239,
            8,
            5281,
            10438,
            3650,
            -27322,
            -21845,
            200,
            571,
            908,
            21830,
            28946,
            -15701,
            -14010
      },
      {
            25238,
            8742,
            12,
            -1506,
            -22374,
            7735,
            8404,
            1701,
            -27106,
            24094,
            10153,
            -8915,
            4783,
            1341,
            16578,
            -30533,
            8,
            5281,
            10438,
            3650,
            -27322,
            -21845,
            200,
            571,
            908,
            21830,
            28946,
            -15701,
            -14010
      },
      {4626, 11146, 6439, 12, 4758, 10270},
      {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991, 918}
   };
   @ObfuscatedName("ae")
   public static final short[] field4185 = new short[]{-10304, 9104, -1, -1, -1};
   @ObfuscatedName("az")
   public static final short[] field4184 = new short[]{6798, 8741, 25238, 4626, 4550};
   @ObfuscatedName("ll")
   static long field4188;
   @ObfuscatedName("ab")
   public static final short[][] field4186 = new short[][]{
      {
            6554,
            115,
            10304,
            28,
            5702,
            7756,
            5681,
            4510,
            -31835,
            22437,
            2859,
            -11339,
            16,
            5157,
            10446,
            3658,
            -27314,
            -21965,
            472,
            580,
            784,
            21966,
            28950,
            -15697,
            -14002,
            -22116,
            945,
            8144,
            -13414,
            30389
      },
      {
            9104,
            10275,
            7595,
            3610,
            7975,
            8526,
            918,
            -26734,
            24466,
            10145,
            -6882,
            5027,
            1457,
            16565,
            -30545,
            25486,
            24,
            5392,
            10429,
            3673,
            -27335,
            -21957,
            192,
            687,
            412,
            21821,
            28835,
            -15460,
            -14019
      },
      new short[0],
      new short[0],
      new short[0]
   };

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("az")
   public static int method7119(int var0, int var1) {
      try {
         return Actor.method3082(var0, 2111857814);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ll.az(" + 41);
      }
   }

   classLL() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIIII)V")
   @ObfuscatedName("ac")
   static void method7120(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = var1;
         int var7 = var2;
         int var8 = classKC.method6460(var0, var1, var2, var0.field1710 * -483624883, var4, (short)-867) - var3;
         if (!var0.method3719(-2087374717)) {
            if (var5 >= 1580238376) {
               throw new IllegalStateException();
            }

            WorldEntity var9 = (WorldEntity)classIS.field3053.worldEntities.method13595(var0.field1699 * 2140889407);
            if (null != var9) {
               if (var5 >= 1580238376) {
                  throw new IllegalStateException();
               }

               classUZ var10 = classYY.method13790(var0, var1, var2, (byte)100);
               var6 = (int)var10.field6427;
               var7 = (int)var10.field6426;
               var8 += classKV.method6571(
                  classIS.field3053, var9.vmethod368(311606126), var9.vmethod371(-1384177484), classIS.field3053.field1710 * -483624883, (byte)122
               );
               classUZ.method11727(var10, 1849940085);
            }
         }

         classAU.method713(var6, var7, var8, 824068936);
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "ll.ac(" + ')');
      }
   }
}
