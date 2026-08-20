import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("va")
public class classVA extends Node {
   @ObfuscatedName("av")
   public long field6145;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;IIIIZ)Z")
   @ObfuscatedName("yw")
   public static boolean method11271(Scene var0, int var1, int var2, int var3, int var4, boolean var5) {
      return var0 == null ? var0.method5598(var1, var1, var1, var1, var5) : var0.method5583(var0.field2959, var1, var2, var3, var4, var5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldb;Lrx;)V")
   @ObfuscatedName("sf")
   public static void method11270(TileItem var0, ProjectionCoord var1) {
      if (var0 == null) {
         var0.method3049(var1);
      }

      var0.field1284 = var1;
   }

   public classVA(long var1) {
      this.field6145 = var1;
   }
}
