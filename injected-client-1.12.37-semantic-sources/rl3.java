import net.runelite.api.MenuAction;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

// $VF: synthetic class
@ObfuscatedName("rl3")
class rl3 {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)Z")
   @ObfuscatedName("wk")
   public static boolean method10080(classQM var0) {
      if (var0 == null) {
         return var0.method9644();
      } else {
         return classQM.method9640(var0, -1640283079) ? true : var0.field5560.isDone();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lya;)Lvq;")
   @ObfuscatedName("lt")
   public static Node method10079(classYA var0) {
      if (var0 == null) {
         return var0.method13286();
      } else {
         var0.method13278();
         return (Node)var0.next();
      }
   }

   static {
      try {
         field5755[MenuAction.WIDGET_TARGET_ON_GAME_OBJECT.ordinal()] = 1;
      } catch (NoSuchFieldError var14) {
      }

      try {
         field5755[MenuAction.GAME_OBJECT_FIRST_OPTION.ordinal()] = 2;
      } catch (NoSuchFieldError var13) {
      }

      try {
         field5755[MenuAction.GAME_OBJECT_SECOND_OPTION.ordinal()] = 3;
      } catch (NoSuchFieldError var12) {
      }

      try {
         field5755[MenuAction.GAME_OBJECT_THIRD_OPTION.ordinal()] = 4;
      } catch (NoSuchFieldError var11) {
      }

      try {
         field5755[MenuAction.GAME_OBJECT_FOURTH_OPTION.ordinal()] = 5;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field5755[MenuAction.GAME_OBJECT_FIFTH_OPTION.ordinal()] = 6;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field5755[MenuAction.EXAMINE_OBJECT.ordinal()] = 7;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field5755[MenuAction.WIDGET_TARGET_ON_GROUND_ITEM.ordinal()] = 8;
      } catch (NoSuchFieldError var7) {
      }

      try {
         field5755[MenuAction.GROUND_ITEM_FIRST_OPTION.ordinal()] = 9;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field5755[MenuAction.GROUND_ITEM_SECOND_OPTION.ordinal()] = 10;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field5755[MenuAction.GROUND_ITEM_THIRD_OPTION.ordinal()] = 11;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field5755[MenuAction.GROUND_ITEM_FOURTH_OPTION.ordinal()] = 12;
      } catch (NoSuchFieldError var3) {
      }

      try {
         field5755[MenuAction.GROUND_ITEM_FIFTH_OPTION.ordinal()] = 13;
      } catch (NoSuchFieldError var2) {
      }

      try {
         field5755[MenuAction.EXAMINE_ITEM_GROUND.ordinal()] = 14;
      } catch (NoSuchFieldError var1) {
      }
   }
}
