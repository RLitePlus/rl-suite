import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yy")
public class classYY implements classXZ {
   @ObfuscatedSignature(descriptor = "Lyy;")
   @ObfuscatedName("ab")
   public static final classYY field7114 = new classYY(0, 5, classTE.class, new classYO());
   @ObfuscatedSignature(descriptor = "Lyy;")
   @ObfuscatedName("ae")
   public static final classYY field7113 = new classYY(4, 2, String.class, new classZB());
   @ObfuscatedName("ac")
   public final Class field7109;
   @ObfuscatedSignature(descriptor = "Lyy;")
   @ObfuscatedName("af")
   public static final classYY field7115 = new classYY(3, 1, Long.class, new classYF());
   @ObfuscatedSignature(descriptor = "Lyy;")
   @ObfuscatedName("ag")
   static final classYY field7112 = new classYY(1, 6, Object.class, new classYP());
   @ObfuscatedName("ax")
   public final int field7107;
   @ObfuscatedName("as")
   public final int field7108;
   @ObfuscatedSignature(descriptor = "Lyy;")
   @ObfuscatedName("az")
   public static final classYY field7111 = new classYY(2, 0, Integer.class, new classYV());
   @ObfuscatedSignature(descriptor = "Lyh;")
   @ObfuscatedName("aa")
   final classYH field7110;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   static final int field7117 = 75;
   @ObfuscatedName("os")
   static boolean field7118;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   static final int field7116 = 0;

   @Override
   public String toString() {
      if (this == field7111) {
         return "int";
      } else if (this == field7115) {
         return "long";
      } else {
         return this == field7113 ? "string" : "unknown";
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return this.field7108 * -701844459;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "yy.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(JIZLrz;B)Ljava/lang/String;")
   @ObfuscatedName("ae")
   static String method13778(long var0, int var2, boolean var3, classRZ var4, byte var5) {
      try {
         return classXW.method12950(var0, var2, false, var3, var4, (byte)-11) + "%";
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "yy.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Class;I)Lyy;")
   @ObfuscatedName("as")
   public static classYY method13783(Class var0, int var1) {
      try {
         classYY[] var2 = method13782((byte)-4);

         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var1 >= -1503548527) {
               throw new IllegalStateException();
            }

            classYY var4 = var2[var3];
            if (var0 == var4.field7109) {
               if (var1 >= -1503548527) {
                  throw new IllegalStateException();
               }

               return var4;
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "yy.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxy;S)V")
   @ObfuscatedName("ax")
   public static void method13784(Object var0, Buffer var1, short var2) {
      try {
         Class var4 = var0.getClass();
         classYY var5 = method13783(var4, -1986258481);
         if (var5 == null) {
            if (var2 != 255) {
               throw new IllegalArgumentException();
            }
         } else {
            classYH var3 = var5.field7110;
            var3.vmethod656(var0, var1, 1083304569);
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "yy.ax(" + ')');
      }
   }

   classYY(int var1, int var2, Class var3, classYH var4) {
      this.field7107 = 935492601 * var1;
      this.field7108 = 2019130173 * var2;
      this.field7109 = var3;
      this.field7110 = var4;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)Ljava/lang/Object;")
   @ObfuscatedName("ac")
   public Object method13787(Buffer var1, int var2) {
      try {
         return this.field7110.vmethod653(var1, (byte)-99);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "yy.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Object;")
   @ObfuscatedName("ap")
   public Object method13788(Buffer var1) {
      return this.field7110.vmethod653(var1, (byte)-19);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Object;")
   @ObfuscatedName("aq")
   public Object method13789(Buffer var1) {
      return this.field7110.vmethod653(var1, (byte)-24);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsu;)I")
   @ObfuscatedName("ew")
   public static int method13777(classSU var0) {
      return var0.field6060 * -1666621055;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxy;)V")
   @ObfuscatedName("ay")
   public static void method13785(Object var0, Buffer var1) {
      Class var3 = var0.getClass();
      classYY var4 = method13783(var3, -1510627076);
      if (var4 == null) {
         throw new IllegalArgumentException();
      } else {
         classYH var2 = var4.field7110;
         var2.vmethod656(var0, var1, -407735841);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lyy;")
   @ObfuscatedName("aa")
   public static classYY[] method13779() {
      return new classYY[]{field7111, field7115, field7114, field7113, field7112};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lyy;")
   @ObfuscatedName("ao")
   public static classYY[] method13780() {
      return new classYY[]{field7111, field7115, field7114, field7113, field7112};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lyy;")
   @ObfuscatedName("al")
   public static classYY[] method13781() {
      return new classYY[]{field7111, field7115, field7114, field7113, field7112};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqr;)I")
   @ObfuscatedName("vc")
   public static int method13776(classQR var0) {
      return var0.field5601 * -1301724989;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxy;)V")
   @ObfuscatedName("aj")
   public static void method13786(Object var0, Buffer var1) {
      Class var3 = var0.getClass();
      classYY var4 = method13783(var3, -2101844078);
      if (var4 == null) {
         throw new IllegalArgumentException();
      } else {
         classYH var2 = var4.field7110;
         var2.vmethod656(var0, var1, 1021411155);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[Lyy;")
   @ObfuscatedName("ag")
   public static classYY[] method13782(byte var0) {
      try {
         return new classYY[]{field7111, field7115, field7114, field7113, field7112};
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "yy.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lyy;")
   @ObfuscatedName("je")
   public static classYY method13792(int var0) {
      return FriendsList.method10130(var0, 675005370);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return this.field7108 * -602961010;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return this.field7108 * -701844459;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIB)Luz;")
   @ObfuscatedName("bi")
   static classUZ method13790(WorldView var0, int var1, int var2, byte var3) {
      try {
         if (var0 != null) {
            if (var3 <= 99) {
               throw new IllegalStateException();
            }

            if (var0 != classIS.field3053) {
               WorldEntity var4 = (WorldEntity)classIS.field3053.worldEntities.method13595(2140889407 * var0.field1699);
               if (var4 == null) {
                  if (var3 <= 99) {
                     throw new IllegalStateException();
                  }

                  return classIK.method6218(var1, 0.0F, var2, (byte)4);
               }

               return var4.method10620(var1, var2, (byte)49);
            }

            if (var3 <= 99) {
               throw new IllegalStateException();
            }
         }

         return classIK.method6218(var1, 0.0F, var2, (byte)-64);
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "yy.bi(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return this.field7108 * -701844459;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hp")
   static void method13791(int var0) {
      try {
         classAB.field122.method2795(347524667 * client.field886, -16777216);
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "yy.hp(" + ')');
      }
   }
}
