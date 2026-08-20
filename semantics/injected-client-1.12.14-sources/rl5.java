import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.runelite.api.MenuEntry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rl5")
public class rl5 implements MenuEntry {
   @ObfuscatedSignature(descriptor = "Lxk;")
   @ObfuscatedName("ar")
   public final Menu field5665;
   @ObfuscatedName("cn")
   public int field5666;
   @ObfuscatedName("ma")
   public Consumer field5667;

   public boolean isForceLeftClick() {
      return this.field5665.menuShiftClick[this.field5666];
   }

   public int getItemOp() {
      net.runelite.api.MenuAction var1 = this.getType();
      if (var1 == net.runelite.api.MenuAction.CC_OP
         || var1 == net.runelite.api.MenuAction.CC_OP_LOW_PRIORITY
         || var1 == net.runelite.api.MenuAction.RUNELITE_WIDGET) {
         int var2 = this.field5665.menuIdentifiers[this.field5666];
         int var3 = this.field5665.menuArguments2[this.field5666];
         int var4 = this.field5665.menuArguments1[this.field5666];
         if (var3 == 9764864) {
            switch (var2) {
               case 1:
                  Widget var5 = SecureUrlRequester.client.method2371(var3);
                  if (var5 != null && var4 != -1) {
                     net.runelite.api.widgets.Widget var7 = var5.getChild(var4);
                     if (var7 != null && var7.getItemId() > -1) {
                        int var6 = SecureUrlRequester.client.method2361(var7.getItemId()).getShiftClickActionIndex();
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

   public int getIdentifier() {
      return this.field5665.menuIdentifiers[this.field5666];
   }

   public void deleteSubMenu() {
      this.field5665.subMenus[this.field5666] = null;
   }

   @ObfuscatedSignature(descriptor = "(I)Lrl5;")
   @ObfuscatedName("sj")
   public rl5 method9608(int var1) {
      this.field5665.menuWorldViewIds[this.field5666] = var1;
      return this;
   }

   public String getTarget() {
      return this.field5665.menuTargets[this.field5666];
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
            WorldView var2 = this.method9604();
            return (net.runelite.api.Player)var2.npcs.method9177(var1);
         default:
            return null;
      }
   }

   @Nullable
   public net.runelite.api.Actor getActor() {
      net.runelite.api.NPC var1 = this.getNpc();
      return (net.runelite.api.Actor)(var1 != null ? var1 : this.getPlayer());
   }

   public Consumer onClick() {
      return this.field5667;
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

   @ObfuscatedSignature(descriptor = "(I)Lrl5;")
   @ObfuscatedName("zt")
   public rl5 method9605(int var1) {
      this.field5665.menuArguments2[this.field5666] = var1;
      return this;
   }

   public int getParam1() {
      return this.field5665.menuArguments2[this.field5666];
   }

   @ObfuscatedSignature(descriptor = "(I)Lrl5;")
   @ObfuscatedName("pt")
   public rl5 method9601(int var1) {
      this.field5665.menuItemIds[this.field5666] = var1;
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
      net.runelite.api.MenuAction var5 = this.getType();
      return var2 * 59 + (var5 == null ? 43 : var5.hashCode());
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/function/Consumer;)Lrl5;")
   @ObfuscatedName("jc")
   public rl5 method9603(Consumer var1) {
      this.field5667 = var1;
      return this;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public net.runelite.api.widgets.Widget getWidget() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: invalid constant type: Lnet/runelite/api/MenuAction; with value 13
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ConstExprent.toJava(ConstExprent.java:356)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SwitchStatement.toJava(SwitchStatement.java:171)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1326)
      //
      // Bytecode:
      // 00: getstatic rl6.field5668 [I
      // 03: aload 0
      // 04: invokevirtual rl5.getType ()Lnet/runelite/api/MenuAction;
      // 07: invokevirtual net/runelite/api/MenuAction.ordinal ()I
      // 0a: iaload
      // 0b: tableswitch 74 1 6 37 37 37 37 37 37
      // 30: aload 0
      // 31: invokevirtual rl5.getParam1 ()I
      // 34: istore 1
      // 35: aload 0
      // 36: invokevirtual rl5.getParam0 ()I
      // 39: istore 2
      // 3a: getstatic SecureUrlRequester.client Lclient;
      // 3d: iload 1
      // 3e: invokevirtual client.method2371 (I)LWidget;
      // 41: astore 3
      // 42: aload 3
      // 43: ifnull 53
      // 46: iload 2
      // 47: bipush -1
      // 48: if_icmple 53
      // 4b: aload 3
      // 4c: iload 2
      // 4d: invokeinterface net/runelite/api/widgets/Widget.getChild (I)Lnet/runelite/api/widgets/Widget; 2
      // 52: astore 3
      // 53: aload 3
      // 54: areturn
      // 55: aconst_null
      // 56: areturn
   }

   @ObfuscatedSignature(descriptor = "()Ldd;")
   @ObfuscatedName("kh")
   public WorldView method9604() {
      return WorldView.method3094(this.getWorldViewId());
   }

   @ObfuscatedSignature(descriptor = "(Lnet/runelite/api/MenuAction;)Lrl5;")
   @ObfuscatedName("vy")
   public rl5 method9609(net.runelite.api.MenuAction var1) {
      int var2 = this.field5665.menuOpcodes[this.field5666];
      short var3 = 0;
      if (var2 >= 2000) {
         var3 = 2000;
      }

      this.field5665.menuOpcodes[this.field5666] = var1.getId() + var3;
      return this;
   }

   public net.runelite.api.Menu createSubMenu() {
      return this.field5665.subMenus[this.field5666] = new Menu(false);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   public net.runelite.api.NPC getNpc() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: invalid constant type: Lnet/runelite/api/MenuAction; with value 13
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ConstExprent.toJava(ConstExprent.java:356)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SwitchStatement.toJava(SwitchStatement.java:171)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1326)
      //
      // Bytecode:
      // 00: getstatic rl6.field5668 [I
      // 03: aload 0
      // 04: invokevirtual rl5.getType ()Lnet/runelite/api/MenuAction;
      // 07: invokevirtual net/runelite/api/MenuAction.ordinal ()I
      // 0a: iaload
      // 0b: tableswitch 68 7 14 45 45 45 45 45 45 45 45
      // 38: aload 0
      // 39: invokevirtual rl5.method9604 ()LWorldView;
      // 3c: astore 1
      // 3d: aload 0
      // 3e: invokevirtual rl5.getIdentifier ()I
      // 41: istore 2
      // 42: aload 1
      // 43: getfield WorldView.players LIndexedObjectSet;
      // 46: iload 2
      // 47: i2l
      // 48: invokevirtual IndexedObjectSet.method9177 (J)LIndexedObjectNode;
      // 4b: checkcast net/runelite/api/NPC
      // 4e: areturn
      // 4f: aconst_null
      // 50: areturn
   }

   public String getOption() {
      return this.field5665.menuActions[this.field5666];
   }

   @ObfuscatedSignature(descriptor = "(Z)Lrl5;")
   @ObfuscatedName("lz")
   public rl5 method9600(boolean var1) {
      this.field5665.menuShiftClick[this.field5666] = var1;
      return this;
   }

   public net.runelite.api.MenuAction getType() {
      int var1 = this.field5665.menuOpcodes[this.field5666];
      if (var1 >= 2000) {
         var1 -= 2000;
      }

      return net.runelite.api.MenuAction.of(var1);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof rl5)) {
         return false;
      } else {
         rl5 var2 = (rl5)var1;
         if (!var2.method9602(this)) {
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
                  net.runelite.api.MenuAction var7 = this.getType();
                  net.runelite.api.MenuAction var8 = var2.getType();
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

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("ph")
   public boolean method9602(Object var1) {
      return var1 instanceof rl5;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lrl5;")
   @ObfuscatedName("bd")
   public rl5 method9606(String var1) {
      this.field5665.menuTargets[this.field5666] = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "(I)Lrl5;")
   @ObfuscatedName("ru")
   public rl5 method9610(int var1) {
      this.field5665.menuIdentifiers[this.field5666] = var1;
      return this;
   }

   public MenuEntry setDeprioritized(boolean var1) {
      if (var1) {
         if (this.field5665.menuOpcodes[this.field5666] < 2000) {
            this.field5665.menuOpcodes[this.field5666] = this.field5665.menuOpcodes[this.field5666] + 2000;
         }
      } else if (this.field5665.menuOpcodes[this.field5666] >= 2000) {
         this.field5665.menuOpcodes[this.field5666] = this.field5665.menuOpcodes[this.field5666] - 2000;
      }

      return this;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;Lor;)V")
   @ObfuscatedName("sf")
   public static void method9598(classOO var0, classOR var1) {
      if (var0 == null) {
         var0.method8563();
      }

      var0.field4675 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lrl5;")
   @ObfuscatedName("nb")
   public rl5 method9611(String var1) {
      this.field5665.menuActions[this.field5666] = var1;
      return this;
   }

   @ObfuscatedSignature(descriptor = "()Lxk;")
   @ObfuscatedName("oa")
   public Menu method9599() {
      return this.field5665.subMenus[this.field5666];
   }

   @ObfuscatedSignature(descriptor = "(I)Lrl5;")
   @ObfuscatedName("lr")
   public rl5 method9607(int var1) {
      this.field5665.menuArguments1[this.field5666] = var1;
      return this;
   }

   public boolean isDeprioritized() {
      return this.field5665.menuOpcodes[this.field5666] >= 2000;
   }

   public int getItemId() {
      return this.field5665.menuItemIds[this.field5666];
   }

   public int getParam0() {
      return this.field5665.menuArguments1[this.field5666];
   }

   public boolean isItemOp() {
      net.runelite.api.MenuAction var1 = this.getType();
      if (var1 == net.runelite.api.MenuAction.CC_OP
         || var1 == net.runelite.api.MenuAction.CC_OP_LOW_PRIORITY
         || var1 == net.runelite.api.MenuAction.RUNELITE_WIDGET) {
         int var2 = this.field5665.menuIdentifiers[this.field5666];
         int var3 = this.field5665.menuArguments2[this.field5666];
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

   public int getWorldViewId() {
      return this.field5665.menuWorldViewIds[this.field5666];
   }

   public rl5(Menu var1, int var2) {
      this.field5665 = var1;
      this.field5666 = var2;
   }
}
