import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("in")
public class classIN extends classHB {
   @ObfuscatedName("af")
   int field3003;
   @ObfuscatedName("ab")
   int field3000;
   @ObfuscatedName("ae")
   int field3002;
   @ToRemove(unused = "true")
   @ObfuscatedName("cm")
   static final int field3005 = 0;
   @ObfuscatedName("az")
   int field2999;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   public static final int field3001 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field3004 = 3;

   classIN(classIF var1) {
      this.this$0 = var1;
      this.field2999 = 536329785;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod498(classXY var1, int var2) {
      try {
         this.field2999 = classXY.method13047(var1, -160289159) * -536329785;
         this.field3003 = var1.method13056((byte)1) * -554661077;
         this.field3002 = classXY.method13039(var1, -346779531) * -1077362017;
         this.field3000 = classXY.method13039(var1, -346779531) * -423990687;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "in.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod503(ClanSettings var1) {
      var1.method6281(-998777197 * this.field2999, -1307452541 * this.field3003, this.field3002 * -1709581985, this.field3000 * -690063450, (byte)-1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqi;Ljava/lang/String;)I")
   @ObfuscatedName("gm")
   public static int method6227(classQI var0, String var1) {
      if (var0 == null) {
         var0.method9580(var1);
      }

      Integer var2 = (Integer)var0.field5545.get(var1);
      return var2 == null ? -1 : var2;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod500(classXY var1) {
      this.field2999 = classXY.method13047(var1, -1529115716) * -1405253871;
      this.field3003 = var1.method13056((byte)1) * -1128827;
      this.field3002 = classXY.method13039(var1, -346779531) * -1077362017;
      this.field3000 = classXY.method13039(var1, -346779531) * -423990687;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod501(classXY var1) {
      this.field2999 = classXY.method13047(var1, 1459142177) * -536329785;
      this.field3003 = var1.method13056((byte)1) * -2115098002;
      this.field3002 = classXY.method13039(var1, -346779531) * -1077362017;
      this.field3000 = classXY.method13039(var1, -346779531) * -305578291;
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod502(ClanSettings var1) {
      var1.method6281(-354915260 * this.field2999, -1307452541 * this.field3003, this.field3002 * -1709581985, this.field3000 * -423380575, (byte)-1);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod504(ClanSettings var1) {
      var1.method6281(-60608521 * this.field2999, -1307452541 * this.field3003, this.field3002 * -1709581985, this.field3000 * -423380575, (byte)-1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgx;)Z")
   @ObfuscatedName("so")
   public static boolean method6228(WorldMapArea var0) {
      return var0.field2732;
   }

   @ObfuscatedSignature(descriptor = "(Liq;B)V")
   @ObfuscatedName("af")
   @Override
   void vmethod499(ClanSettings var1, byte var2) {
      try {
         var1.method6281(-60608521 * this.field2999, -1307452541 * this.field3003, this.field3002 * -1709581985, this.field3000 * -423380575, (byte)-1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "in.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)I")
   @ObfuscatedName("au")
   static final int method6229(int var0, int var1, int var2, int var3, int var4) {
      try {
         int var5 = 65536 - classFH.field2254[1024 * var2 / var3] >> 1;
         return (var1 * var5 >> 16) + ((65536 - var5) * var0 >> 16);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "in.au(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[SB)V")
   @ObfuscatedName("az")
   public static void method6225(String[] var0, short[] var1, byte var2) {
      try {
         classQA.method9414(var0, var1, 0, var0.length - 1, -484319890);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "in.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("af")
   static boolean method6226(byte var0) {
      try {
         boolean var10000;
         if (null != classUO.field6361) {
            if (var0 != 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "in.af(" + ')');
      }
   }
}
