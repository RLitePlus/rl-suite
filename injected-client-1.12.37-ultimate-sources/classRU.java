import net.runelite.api.FriendsChatMember;
import net.runelite.api.FriendsChatRank;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ru")
public class classRU extends classRI implements FriendsChatMember {
   @ObfuscatedSignature(descriptor = "Lrc;")
   @ObfuscatedName("az")
   classRC field5846 = classRC.field5640;
   @ObfuscatedSignature(descriptor = "Lrc;")
   @ObfuscatedName("af")
   classRC field5847 = classRC.field5640;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   void method10279(int var1) {
      try {
         this.field5847 = classRC.field5640;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ru.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lru;I)V")
   @ObfuscatedName("ws")
   public static void method10285(classRU var0, int var1) {
      if (var0 == null) {
         var0.method10289(var1);
      } else {
         try {
            classRC var10001;
            if (classQQ.field5597.field591.method10202(var0.field5835, (byte)10)) {
               if (var1 != 1196222169) {
                  throw new IllegalStateException();
               }

               var10001 = classRC.field5642;
            } else {
               var10001 = classRC.field5641;
            }

            var0.field5847 = var10001;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "ru.ax(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ab")
   void method10276(byte var1) {
      try {
         classRC var10001;
         if (classQQ.field5597.field593.method10202(this.field5835, (byte)10)) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            var10001 = classRC.field5642;
         } else {
            var10001 = classRC.field5641;
         }

         this.field5846 = var10001;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ru.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lru;I)Z")
   @ObfuscatedName("vk")
   public static boolean method10272(classRU var0, int var1) {
      if (var0 == null) {
         return var0.method10274(var1);
      } else {
         try {
            if (classRC.field5640 == var0.field5846) {
               if (var1 <= 1175335984) {
                  throw new IllegalStateException();
               }

               var0.method10276((byte)1);
            }

            boolean var10000;
            if (classRC.field5642 == var0.field5846) {
               if (var1 <= 1175335984) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "ru.af(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("as")
   public final boolean method10282(int var1) {
      try {
         if (this.field5847 == classRC.field5640) {
            if (var1 >= 590677983) {
               throw new IllegalStateException();
            }

            method10285(this, 1196222169);
         }

         boolean var10000;
         if (this.field5847 == classRC.field5642) {
            if (var1 >= 590677983) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ru.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aa")
   public final boolean method10273() {
      if (classRC.field5640 == this.field5846) {
         this.method10276((byte)1);
      }

      return classRC.field5642 == this.field5846;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   public final boolean method10283() {
      if (this.field5847 == classRC.field5640) {
         method10285(this, 1196222169);
      }

      return this.field5847 == classRC.field5642;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   void method10268() {
      this.field5846 = classRC.field5640;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lru;)V")
   @ObfuscatedName("hn")
   public static void method10277(classRU var0) {
      var0.field5846 = classQQ.field5597.field593.method10202(var0.field5835, (byte)10) ? classRC.field5642 : classRC.field5641;
   }

   public FriendsChatRank getRank() {
      return FriendsChatRank.valueOf(this.method9978());
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   void method10286() {
      this.field5847 = classQQ.field5597.field591.method10202(this.field5835, (byte)10) ? classRC.field5642 : classRC.field5641;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   void method10280() {
      this.field5847 = classRC.field5640;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   void method10278() {
      this.field5846 = classQQ.field5597.field593.method10202(this.field5835, (byte)10) ? classRC.field5642 : classRC.field5641;
   }

   @ObfuscatedSignature(descriptor = "(Lru;I)V")
   @ObfuscatedName("yd")
   public static void method10269(classRU var0, int var1) {
      if (var0 == null) {
         var0.method10270(var1);
      } else {
         try {
            var0.field5846 = classRC.field5640;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "ru.az(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   void method10281() {
      this.field5847 = classRC.field5640;
   }

   classRU() {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   void method10287() {
      this.field5847 = classQQ.field5597.field591.method10202(this.field5835, (byte)10) ? classRC.field5642 : classRC.field5641;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lru;)Z")
   @ObfuscatedName("pk")
   public static boolean method10284(classRU var0) {
      if (var0.field5847 == classRC.field5640) {
         method10285(var0, 1196222169);
      }

      return var0.field5847 == classRC.field5642;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   void method10288() {
      this.field5847 = classQQ.field5597.field591.method10202(this.field5835, (byte)10) ? classRC.field5642 : classRC.field5641;
   }

   @ObfuscatedSignature(descriptor = "(Lgy;Lgy;FLgy;S)V")
   @ObfuscatedName("az")
   static void method10275(classGY var0, classGY var1, float var2, classGY var3, short var4) {
      try {
         var2 = classBF.method998(0.0F, 1.0F, var2, 466287385);
         int var5 = var1.method5903(1368589216) - var0.method5903(20317292);
         int var6 = classGY.method5909(var1, 1690676705) - classGY.method5909(var0, 1690676705);
         var5 = (int)(var5 * var2);
         var6 = (int)(var6 * var2);
         classGY.method5929(var3, var0.method5903(712339550) + var5, classGY.method5909(var0, 1690676705) + var6, (byte)5);
         int var7 = classNF.method7830(var0.method5920(2079664854), var1.method5920(2019635063), (byte)45);
         var7 = (int)(var7 * var2);
         var3.method5923(var0.method5920(1496029351) + var7, -1974460731);
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "ru.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   void method10270(int var1) {
      try {
         this.field5846 = classRC.field5641;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ru.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   void method10271() {
      this.field5846 = classRC.field5641;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ax")
   void method10289(int var1) {
      try {
         classRC var10001;
         if (classQQ.field5597.field591.method10202(super.field5834, (byte)10)) {
            if (var1 != 1196222169) {
               throw new IllegalStateException();
            }

            var10001 = classRC.field5640;
         } else {
            var10001 = classRC.field5640;
         }

         this.field5847 = var10001;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ru.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("af")
   public final boolean method10274(int var1) {
      try {
         if (classRC.field5642 == this.field5846) {
            if (var1 <= 1175335984) {
               throw new IllegalStateException();
            }

            this.method10276((byte)1);
         }

         boolean var10000;
         if (classRC.field5641 == this.field5846) {
            if (var1 <= 1175335984) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ru.af(" + ')');
      }
   }
}
