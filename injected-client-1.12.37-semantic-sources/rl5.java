import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl5")
public class rl5 implements MenuEntry {
   @ObfuscatedName("jv")
   public int field5802;
   @ObfuscatedSignature(descriptor = "Lwz;")
   @ObfuscatedName("bj")
   public final Menu field5801;
   @ObfuscatedName("ag")
   public Consumer field5803;

   @Nullable
   public net.runelite.api.Actor getActor() {
      net.runelite.api.NPC var1 = this.getNpc();
      return (net.runelite.api.Actor)(var1 != null ? var1 : this.getPlayer());
   }

   public Consumer onClick() {
      return this.field5803;
   }

   @Override
   public String toString() {
      return "MenuEntryImpl(getOption="
         + this.getOption()
         + ", getTarget="
         + this.getTarget()
         + ", getIdentifier="
         + this.getIdentifier()
         + ", getType="
         + this.getType()
         + ", getParam0="
         + this.getParam0()
         + ", getParam1="
         + this.getParam1()
         + ", getItemId="
         + this.getItemId()
         + ", isForceLeftClick="
         + this.isForceLeftClick()
         + ", getWorldViewId="
         + this.getWorldViewId()
         + ", isDeprioritized="
         + this.isDeprioritized()
         + ")";
   }

   public String getOption() {
      return this.field5801.field6804[this.field5802];
   }

   public int getItemOp() {
      MenuAction var1 = this.getType();
      if (var1 == MenuAction.CC_OP || var1 == MenuAction.CC_OP_LOW_PRIORITY || var1 == MenuAction.RUNELITE_WIDGET) {
         int var2 = this.field5801.field6801[this.field5802];
         int var3 = this.field5801.field6799[this.field5802];
         int var4 = this.field5801.field6798[this.field5802];
         if (var3 == 9764864) {
            switch (var2) {
               case 1:
                  Widget var5 = classOE.field4843.method2295(var3);
                  if (var5 != null && var4 != -1) {
                     net.runelite.api.widgets.Widget var7 = var5.getChild(var4);
                     if (var7 != null && var7.getItemId() > -1) {
                        int var6 = classOE.field4843.method2278(var7.getItemId()).getShiftClickActionIndex();
                        if (var6 >= 0) {
                           return var6 + 1;
                        }
                     }
                  }
                  break;
               case 2:
                  return 1;
               case 3:
                  return 2;
               case 4:
                  return 3;
               case 5:
               default:
                  break;
               case 6:
                  return 4;
               case 7:
                  return 5;
            }
         }
      }

      return -1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   public net.runelite.api.Player getPlayer() {
      int var1 = this.getIdentifier();
      switch (this.getType()) {
         case WALK:
            var1--;
         case ITEM_USE_ON_PLAYER:
         case WIDGET_TARGET_ON_PLAYER:
         case PLAYER_FIRST_OPTION:
         case PLAYER_SECOND_OPTION:
         case PLAYER_THIRD_OPTION:
         case PLAYER_FOURTH_OPTION:
         case PLAYER_FIFTH_OPTION:
         case PLAYER_SIXTH_OPTION:
         case PLAYER_SEVENTH_OPTION:
         case PLAYER_EIGHTH_OPTION:
         case RUNELITE_PLAYER:
            WorldView var2 = this.method10111();
            if (var2 == null) {
               return null;
            }

            return (net.runelite.api.Player)var2.field1694.method13405(var1);
         default:
            return null;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public net.runelite.api.widgets.Widget getWidget() {
      switch (this.getType()) {
         case WIDGET_TARGET:
         case WIDGET_TARGET_ON_WIDGET:
         case WIDGET_CONTINUE:
         case CC_OP:
         case CC_OP_LOW_PRIORITY:
         case RUNELITE_WIDGET:
            int var1 = this.getParam1();
            int var2 = this.getParam0();
            Object var3 = classOE.field4843.method2295(var1);
            if (var3 != null && var2 > -1) {
               var3 = var3.getChild(var2);
            }

            return (net.runelite.api.widgets.Widget)var3;
         default:
            return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldz;")
   @ObfuscatedName("lk")
   public WorldView method10111() {
      return WorldView.method3780(this.getWorldViewId());
   }

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/MenuAction;)Lrl5;")
   @ObfuscatedName("ii")
   public rl5 method10117(MenuAction var1) {
      int var2 = this.field5801.menuIdentifiers[this.field5802];
      short var3 = 0;
      if (var2 >= 2000) {
         var3 = 2000;
      }

      this.field5801.menuIdentifiers[this.field5802] = var1.getId() + var3;
      return this;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   public net.runelite.api.NPC getNpc() {
      switch (this.getType()) {
         case ITEM_USE_ON_NPC:
         case WIDGET_TARGET_ON_NPC:
         case NPC_FIRST_OPTION:
         case NPC_SECOND_OPTION:
         case NPC_THIRD_OPTION:
         case NPC_FOURTH_OPTION:
         case NPC_FIFTH_OPTION:
         case EXAMINE_NPC:
            WorldView var1 = this.method10111();
            int var2 = this.getIdentifier();
            return (net.runelite.api.NPC)var1.field1698.method13405(var2);
         default:
            return null;
      }
   }

   public net.runelite.api.Menu createSubMenu() {
      return this.field5801.subMenus[this.field5802] = new Menu(false);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lrl5;")
   @ObfuscatedName("rg")
   public rl5 method10122(String var1) {
      this.field5801.field6805[this.field5802] = var1;
      return this;
   }

   public boolean isDeprioritized() {
      return this.field5801.menuIdentifiers[this.field5802] >= 2000;
   }

   @ObfuscatedSignature(descriptor = "()Lwz;")
   @ObfuscatedName("tk")
   public Menu method10114() {
      return this.field5801.subMenus[this.field5802];
   }

   public int getParam1() {
      return this.field5801.field6799[this.field5802];
   }

   public boolean isItemOp() {
      MenuAction var1 = this.getType();
      if (var1 == MenuAction.CC_OP || var1 == MenuAction.CC_OP_LOW_PRIORITY || var1 == MenuAction.RUNELITE_WIDGET) {
         int var2 = this.field5801.field6801[this.field5802];
         int var3 = this.field5801.field6799[this.field5802];
         if (var3 == 9764864) {
            switch (var2) {
               case 1:
               case 2:
               case 3:
               case 4:
               case 6:
               case 7:
                  return true;
               case 5:
            }
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(I)Lrl5;")
   @ObfuscatedName("vy")
   public rl5 method10119(int var1) {
      this.field5801.field6801[this.field5802] = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(I)Lrl5;")
   @ObfuscatedName("ta")
   public rl5 method10115(int var1) {
      this.field5801.field6798[this.field5802] = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/function/Consumer;)Lrl5;")
   @ObfuscatedName("kn")
   public rl5 method10118(Consumer var1) {
      this.field5803 = var1;
      return this;
   }

   public String getTarget() {
      return this.field5801.field6805[this.field5802];
   }

   @ObfuscatedSignature(descriptor = "(I)Lrl5;")
   @ObfuscatedName("hq")
   public rl5 method10120(int var1) {
      this.field5801.field6799[this.field5802] = var1;
      return this;
   }

   public MenuEntry setDeprioritized(boolean var1) {
      if (var1) {
         if (this.field5801.menuIdentifiers[this.field5802] < 2000) {
            this.field5801.menuIdentifiers[this.field5802] = this.field5801.menuIdentifiers[this.field5802] + 2000;
         }
      } else if (this.field5801.menuIdentifiers[this.field5802] >= 2000) {
         this.field5801.menuIdentifiers[this.field5802] = this.field5801.menuIdentifiers[this.field5802] - 2000;
      }

      return this;
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.getIdentifier();
      var2 = var2 * 59 + this.getParam0();
      var2 = var2 * 59 + this.getParam1();
      var2 = var2 * 59 + this.getItemId();
      var2 = var2 * 59 + (this.isForceLeftClick() ? 79 : 97);
      var2 = var2 * 59 + this.getWorldViewId();
      var2 = var2 * 59 + (this.isDeprioritized() ? 79 : 97);
      String var3 = this.getOption();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      String var4 = this.getTarget();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      MenuAction var5 = this.getType();
      return var2 * 59 + (var5 == null ? 43 : var5.hashCode());
   }

   public MenuAction getType() {
      int var1 = this.field5801.menuIdentifiers[this.field5802];
      if (var1 >= 2000) {
         var1 -= 2000;
      }

      return MenuAction.of(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lrl5;")
   @ObfuscatedName("er")
   public rl5 method10121(String var1) {
      this.field5801.field6804[this.field5802] = var1;
      return this;
   }

   public void deleteSubMenu() {
      this.field5801.subMenus[this.field5802] = null;
   }

   @ObfuscatedSignature(descriptor = "(Z)Lrl5;")
   @ObfuscatedName("dg")
   public rl5 method10110(boolean var1) {
      this.field5801.field6807[this.field5802] = var1;
      return this;
   }

   public int getWorldViewId() {
      return this.field5801.menuOpcodes[this.field5802];
   }

   @ObfuscatedSignature(descriptor = "(I)Lrl5;")
   @ObfuscatedName("rc")
   public rl5 method10116(int var1) {
      this.field5801.menuArguments2[this.field5802] = var1;
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof rl5)) {
         return false;
      } else {
         rl5 var2 = (rl5)var1;
         if (!var2.method10112(this)) {
            return false;
         } else if (this.getIdentifier() != var2.getIdentifier()) {
            return false;
         } else if (this.getParam0() != var2.getParam0()) {
            return false;
         } else if (this.getParam1() != var2.getParam1()) {
            return false;
         } else if (this.getItemId() != var2.getItemId()) {
            return false;
         } else if (this.isForceLeftClick() != var2.isForceLeftClick()) {
            return false;
         } else if (this.getWorldViewId() != var2.getWorldViewId()) {
            return false;
         } else if (this.isDeprioritized() != var2.isDeprioritized()) {
            return false;
         } else {
            String var3 = this.getOption();
            String var4 = var2.getOption();
            if (var3 == null ? var4 == null : var3.equals(var4)) {
               String var5 = this.getTarget();
               String var6 = var2.getTarget();
               if (var5 == null ? var6 == null : var5.equals(var6)) {
                  MenuAction var7 = this.getType();
                  MenuAction var8 = var2.getType();
                  return var7 == null ? var8 == null : var7.equals(var8);
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      }
   }

   public int getIdentifier() {
      return this.field5801.field6801[this.field5802];
   }

   @ObfuscatedSignature(descriptor = "(I)Lrl5;")
   @ObfuscatedName("tw")
   public rl5 method10113(int var1) {
      this.field5801.menuOpcodes[this.field5802] = var1;
      return this;
   }

   public int getParam0() {
      return this.field5801.field6798[this.field5802];
   }

   public int getItemId() {
      return this.field5801.menuArguments2[this.field5802];
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("fn")
   public boolean method10112(Object var1) {
      return var1 instanceof rl5;
   }

   public boolean isForceLeftClick() {
      return this.field5801.field6807[this.field5802];
   }

   public rl5(Menu var1, int var2) {
      this.field5801 = var1;
      this.field5802 = var2;
   }
}
