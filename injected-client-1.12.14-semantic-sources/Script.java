import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cu")
public class Script extends DualNode implements net.runelite.api.Script {
   @ObfuscatedName("ag")
   String field1216;
   @ObfuscatedSignature(descriptor = "[Lql;")
   @ObfuscatedName("at")
   IterableNodeHashTable[] switches;
   @ObfuscatedName("ay")
   int stringArgumentCount;
   @ObfuscatedName("an")
   int[] opcodes;
   @ObfuscatedName("ae")
   int[] intOperands;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("av")
   static EvictingDualNodeHashTable Script_cached = new EvictingDualNodeHashTable(128);
   @ObfuscatedName("oa")
   static int[] regions;
   @ObfuscatedName("aw")
   int localStringCount;
   @ObfuscatedName("ap")
   int intArgumentCount;
   @ObfuscatedName("ac")
   static ScheduledExecutorService soundSystemExecutor;
   @ToRemove(unused = "true")
   @ObfuscatedName("cb")
   public static final int field1215 = 1012;
   @ObfuscatedName("ak")
   int localIntCount;
   @ObfuscatedName("aj")
   String[] stringOperands;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   public static final int field1212 = 8;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Lcu;")
   @ObfuscatedName("au")
   static Script method2877(int var0, int var1) {
      Script var2 = (Script)class402.method8806(Script_cached, var0 << 16);
      if (null != var2) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = WorldMapRectangle.archive12.groupLoadPercentByName(var3, (byte)-37);
         if (-1 == var4) {
            return null;
         } else {
            byte[] var5 = WorldMapRectangle.archive12.takeFileFlat(var4, 1214947409);
            if (null != var5) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = UserComparator3.newScript(var5, 480556995);
               if (null != var2) {
                  Script_cached.put(var2, var0 << 16);
                  return var2;
               }
            }

            return null;
         }
      }
   }

   Script() {
   }

   public int[] getInstructions() {
      return this.opcodes;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lcu;")
   @ObfuscatedName("aj")
   static Script method2872(int var0) {
      Script var1 = (Script)class402.method8806(Script_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = WorldMapRectangle.archive12.getFile(var0, 0, 63114050);
         if (var2 == null) {
            return null;
         } else {
            var1 = UserComparator3.newScript(var2, -162872999);
            Script_cached.put(var1, var0);
            return var1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lcu;")
   @ObfuscatedName("ak")
   static Script method2873(int var0) {
      Script var1 = (Script)class402.method8806(Script_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = WorldMapRectangle.archive12.getFile(var0, 0, 907530853);
         if (var2 == null) {
            return null;
         } else {
            var1 = UserComparator3.newScript(var2, 961660551);
            Script_cached.put(var1, var0);
            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("oc")
   public int method2881() {
      return this.intArgumentCount * -968069229;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ix")
   public int method2882() {
      return this.stringArgumentCount * -1480905639;
   }

   @ObfuscatedSignature(descriptor = "(S)Lqy;")
   @ObfuscatedName("pn")
   static JagNetThread method2880(short var0) {
      try {
         return VarbitComposition.field2488;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "cu.pn(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)Lcu;")
   @ObfuscatedName("ap")
   static Script method2875(int var0, int var1, int var2) {
      int var3 = (var1 << 8) + var0;
      Script var5 = EnumComposition.getScript(var3, var0, -823968112);
      if (var5 != null) {
         return var5;
      } else {
         int var4 = classTR.method10800(var2, var0, (byte)-64);
         var5 = EnumComposition.getScript(var4, var0, 649224814);
         if (var5 != null) {
            return var5;
         } else {
            var4 = class341.method7848(var0, (byte)86);
            var5 = EnumComposition.getScript(var4, var0, 467117144);
            return null != var5 ? var5 : null;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)Lcu;")
   @ObfuscatedName("ay")
   static Script method2876(int var0, int var1, int var2) {
      int var3 = (var1 << 8) + var0;
      Script var5 = EnumComposition.getScript(var3, var0, -394722078);
      if (var5 != null) {
         return var5;
      } else {
         int var4 = classTR.method10800(var2, var0, (byte)1);
         var5 = EnumComposition.getScript(var4, var0, 378422258);
         if (var5 != null) {
            return var5;
         } else {
            var4 = class341.method7848(var0, (byte)-93);
            var5 = EnumComposition.getScript(var4, var0, -111811700);
            return null != var5 ? var5 : null;
         }
      }
   }

   public int[] getIntOperands() {
      return this.intOperands;
   }

   @ObfuscatedSignature(descriptor = "(II)[Lql;")
   @ObfuscatedName("ae")
   IterableNodeHashTable[] newIterableNodeHashTable(int var1, int var2) {
      try {
         return new IterableNodeHashTable[var1];
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cu.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Lcu;")
   @ObfuscatedName("az")
   static Script method2878(int var0, int var1) {
      Script var2 = (Script)class402.method8806(Script_cached, var0 << 16);
      if (null != var2) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = WorldMapRectangle.archive12.groupLoadPercentByName(var3, (byte)-105);
         if (-1 == var4) {
            return null;
         } else {
            byte[] var5 = WorldMapRectangle.archive12.takeFileFlat(var4, 1773084427);
            if (null != var5) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = UserComparator3.newScript(var5, 784290682);
               if (null != var2) {
                  Script_cached.put(var2, var0 << 16);
                  return var2;
               }
            }

            return null;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lcu;")
   @ObfuscatedName("aw")
   static Script method2874(int var0) {
      Script var1 = (Script)class402.method8806(Script_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = WorldMapRectangle.archive12.getFile(var0, 0, 1586449331);
         if (var2 == null) {
            return null;
         } else {
            var1 = UserComparator3.newScript(var2, -505037216);
            Script_cached.put(var1, var0);
            return var1;
         }
      }
   }
}
