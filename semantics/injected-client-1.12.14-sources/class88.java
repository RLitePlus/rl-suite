import java.awt.event.FocusEvent;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("di")
public class class88 {
   @ObfuscatedName("ab")
   int field1377;
   @ObfuscatedSignature(descriptor = "Ldi;")
   @ObfuscatedName("at")
   static final class88 field1364 = new class88(1);
   @ObfuscatedSignature(descriptor = "Ldi;")
   @ObfuscatedName("ag")
   static final class88 field1362 = new class88(2);
   @ObfuscatedSignature(descriptor = "Ldi;")
   @ObfuscatedName("ac")
   static final class88 field1363 = new class88(15);
   @ObfuscatedSignature(descriptor = "Ldi;")
   @ObfuscatedName("av")
   static final class88 field1361 = new class88(0);
   @ObfuscatedSignature(descriptor = "Ldi;")
   @ObfuscatedName("aj")
   static final class88 field1376 = new class88(5);
   @ObfuscatedSignature(descriptor = "Ldi;")
   @ObfuscatedName("ak")
   static final class88 field1367 = new class88(6);
   @ObfuscatedSignature(descriptor = "Ldi;")
   @ObfuscatedName("aw")
   static final class88 field1371 = new class88(7);
   @ObfuscatedSignature(descriptor = "Ldi;")
   @ObfuscatedName("ad")
   static final class88 field1373 = new class88(12);
   @ObfuscatedSignature(descriptor = "Ldi;")
   @ObfuscatedName("ay")
   static final class88 field1370 = new class88(9);
   @ObfuscatedSignature(descriptor = "Ldi;")
   @ObfuscatedName("au")
   static final class88 field1369 = new class88(10);
   @ObfuscatedSignature(descriptor = "Ldi;")
   @ObfuscatedName("az")
   static final class88 field1372 = new class88(11);
   @ObfuscatedSignature(descriptor = "Ldi;")
   @ObfuscatedName("ap")
   static final class88 field1365 = new class88(8);
   @ObfuscatedSignature(descriptor = "Ldi;")
   @ObfuscatedName("ai")
   static final class88 field1390 = new class88(13);
   @ObfuscatedSignature(descriptor = "Ldi;")
   @ObfuscatedName("as")
   static final class88 field1375 = new class88(14);
   @ObfuscatedSignature(descriptor = "Ldi;")
   @ObfuscatedName("an")
   static final class88 field1366 = new class88(3);
   @ObfuscatedSignature(descriptor = "Ldi;")
   @ObfuscatedName("ae")
   static final class88 field1368 = new class88(4);
   @ToRemove(unused = "true")
   @ObfuscatedName("bn")
   public static final int field1378 = 68;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Ljava/awt/event/FocusEvent;)V")
   @ObfuscatedName("kr")
   public static void method3124(GameEngine var0, FocusEvent var1) {
      if (var0 == null) {
         var0.method811();
      } else {
         GameEngine.volatileFocus = true;
         var0.isCanvasInvalid = true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;I)V")
   @ObfuscatedName("oz")
   static final void method3125(Widget var0, int var1) {
      try {
         int var2 = var0.contentType * 1889823193;
         if (324 == var2) {
            if (var1 == -1311696011) {
               throw new IllegalStateException();
            } else {
               if (-1 == 1420383455 * client.field903) {
                  client.field903 = var0.spriteId2 * 690393041;
                  client.field904 = var0.spriteId * -1920528825;
               }

               if (1 == -941255479 * client.playerAppearance.gender) {
                  var0.spriteId2 = 1958095153 * client.field903;
               } else {
                  var0.spriteId2 = client.field904 * 2082787765;
               }
            }
         } else if (325 == var2) {
            if (var1 == -1311696011) {
               throw new IllegalStateException();
            } else {
               if (1420383455 * client.field903 == -1) {
                  if (var1 == -1311696011) {
                     throw new IllegalStateException();
                  }

                  client.field903 = var0.spriteId2 * 690393041;
                  client.field904 = var0.spriteId * -1920528825;
               }

               if (-941255479 * client.playerAppearance.gender == 1) {
                  if (var1 == -1311696011) {
                     throw new IllegalStateException();
                  }

                  var0.spriteId2 = 2082787765 * client.field904;
               } else {
                  var0.spriteId2 = client.field903 * 1958095153;
               }
            }
         } else if (var2 == 327) {
            if (var1 == -1311696011) {
               throw new IllegalStateException();
            } else {
               var0.modelAngleX = -308867526;
               var0.modelAngleY = ((int)(Math.sin(client.cycle * 1759706017 / 40.0) * 256.0) & 2047) * 676548941;
               var0.modelType = 738952397;
               var0.modelId = 0;
            }
         } else if (328 == var2) {
            if (var1 != -1311696011) {
               var0.modelAngleX = -308867526;
               var0.modelAngleY = ((int)(Math.sin(1759706017 * client.cycle / 40.0) * 256.0) & 2047) * 676548941;
               var0.modelType = 738952397;
               var0.modelId = -1314816461;
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "di.oz(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkk;)I")
   @ObfuscatedName("og")
   public static int method3123(CollisionMap var0) {
      return var0.xSize * -1640107663;
   }

   class88(int var1) {
      this.field1377 = var1 * -641473859;
   }
}
