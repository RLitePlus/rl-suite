import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cp")
public class MouseRecorder implements Runnable {
   @ObfuscatedName("ae")
   int[] ys;
   @ObfuscatedName("at")
   Object lock;
   @ObfuscatedName("ag")
   int index;
   @ObfuscatedName("aj")
   long[] millis;
   @ObfuscatedName("an")
   int[] xs;
   @ObfuscatedName("ac")
   static int[][] field1086;
   @ToRemove(unused = "true")
   @ObfuscatedName("dt")
   static final String field1085 = "JX_SESSION_ID";
   @ToRemove(unused = "true")
   @ObfuscatedName("ba")
   static final int field1084 = 109;
   @ObfuscatedName("av")
   boolean isRunning = true;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ob")
   static final void method2643(int var0) {
      try {
         Iterator var1 = client.worldViewManager.iterator();

         while (var1.hasNext()) {
            if (var0 <= -731948309) {
               throw new IllegalStateException();
            }

            WorldView var2 = (WorldView)var1.next();

            for (int var3 = 0; var3 < 1320060371 * client.playerUpdateManager.field1538; var3++) {
               Player var4 = (Player)Occluder.topLevelWorldView.npcs.get(client.playerUpdateManager.playerIndices[var3]);
               if (null != var4) {
                  if (var0 <= -731948309) {
                     throw new IllegalStateException();
                  }

                  var4.updateIsInFriendsChat(-1078451492);
               }
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "cp.ob(" + ')');
      }
   }

   @Override
   public void run() {
      try {
         for (; this.isRunning; LoginState.method484(50L)) {
            synchronized (this.lock) {
               if (847414097 * this.index < 500) {
                  this.ys[847414097 * this.index] = MouseHandler.MouseHandler_x * 1856325427;
                  this.xs[847414097 * this.index] = MouseHandler.MouseHandler_y * -1427762751;
                  this.millis[847414097 * this.index] = MouseHandler.MouseHandler_millis * -3445429405105067917L;
                  this.index += 455124401;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cp.run(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dk")
   public void method2638() {
      for (; this.isRunning; LoginState.method484(50L)) {
         synchronized (this.lock) {
            if (847414097 * this.index < 500) {
               this.ys[1812507011 * this.index] = MouseHandler.MouseHandler_x * 299113706;
               this.xs[847414097 * this.index] = MouseHandler.MouseHandler_y * -1427762751;
               this.millis[564373404 * this.index] = MouseHandler.MouseHandler_millis * -3445429405105067917L;
               this.index += 455124401;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dn")
   public void method2639() {
      for (; this.isRunning; LoginState.method484(50L)) {
         synchronized (this.lock) {
            if (847414097 * this.index < 500) {
               this.ys[291527684 * this.index] = MouseHandler.MouseHandler_x * 1856325427;
               this.xs[847414097 * this.index] = MouseHandler.MouseHandler_y * 725684737;
               this.millis[847414097 * this.index] = MouseHandler.MouseHandler_millis * -3445429405105067917L;
               this.index += 2130117698;
            }
         }
      }
   }

   MouseRecorder() {
      this.lock = new Object();
      this.index = 0;
      this.ys = new int[500];
      this.xs = new int[500];
      this.millis = new long[500];
   }

   @ObfuscatedSignature(descriptor = "(I)[Ldc;")
   @ObfuscatedName("ae")
   static AttackOption[] method2645(int var0) {
      try {
         return new AttackOption[]{
            AttackOption.AttackOption_alwaysRightClick,
            AttackOption.field1304,
            AttackOption.AttackOption_dependsOnCombatLevels,
            AttackOption.field1302,
            AttackOption.AttackOption_hidden
         };
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "cp.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("io")
   static void method2642(int var0, int var1, int var2) {
      try {
         if (class468.clientPreferences.getMusicVolume((byte)6) != 0) {
            if (var2 != -2084071294) {
               throw new IllegalStateException();
            }

            if (var0 != -1) {
               ArrayList var3 = new ArrayList();
               var3.add(new MidiRequest(UserComparator4.archive6, var0, 0, class468.clientPreferences.getMusicVolume((byte)6), false));
               class113.method3918(var3, 0, 0, 0, 0, true, -1882065613);
               client.playingJingle = true;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cp.io(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("az")
   public static String method2641(String var0, int var1) {
      try {
         StringBuilder var2 = new StringBuilder(var0.length());
         int var3 = 0;
         int var4 = -1;

         for (int var5 = 0; var5 < var0.length(); var5++) {
            if (var1 <= 995045083) {
               throw new IllegalStateException();
            }

            char var6 = var0.charAt(var5);
            if (var6 == '<') {
               if (var1 <= 995045083) {
                  throw new IllegalStateException();
               }

               var2.append(var0.substring(var3, var5));
               var4 = var5;
            } else if (var6 == '>') {
               if (var1 <= 995045083) {
                  throw new IllegalStateException();
               }

               if (var4 != -1) {
                  String var7 = var0.substring(1 + var4, var5);
                  var4 = -1;
                  if (var7.equals("lt")) {
                     if (var1 <= 995045083) {
                        throw new IllegalStateException();
                     }

                     var2.append("<");
                  } else if (var7.equals("gt")) {
                     var2.append(">");
                  } else if (var7.equals("br")) {
                     var2.append("\n");
                  }

                  var3 = 1 + var5;
               }
            }
         }

         if (var3 < var0.length()) {
            var2.append(var0.substring(var3, var0.length()));
         }

         return var2.toString();
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "cp.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("pr")
   static void method2644(int var0, int var1) {
      try {
         client.oculusOrbState = var0 * -1900215895;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cp.pr(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ec")
   public void method2640() {
      for (; this.isRunning; LoginState.method484(50L)) {
         synchronized (this.lock) {
            if (847414097 * this.index < 2105577751) {
               this.xs[847414097 * this.index] = MouseHandler.MouseHandler_currentButton * 1250910360;
               this.ys[847414097 * this.index] = MouseHandler.MouseHandler_lastPressedY * -2089235901;
               this.millis[1186873932 * this.index] = MouseHandler.MouseHandler_lastPressedTimeMillis * -3445429405105067917L;
               this.index += 1350035881;
            }
         }
      }
   }
}
