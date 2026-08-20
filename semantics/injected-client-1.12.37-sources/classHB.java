import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hb")
public abstract class classHB extends Node {
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field2761 = 13;

   classHB() {
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   abstract void vmethod498(Buffer var1, int var2);

   @ObfuscatedSignature(descriptor = "(Liq;B)V")
   @ObfuscatedName("af")
   abstract void vmethod499(ClanSettings var1, byte var2);

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   abstract void vmethod500(Buffer var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzr;)I")
   @ObfuscatedName("mq")
   public static int method5991(ScriptEvent var0) {
      return 1039173409 * var0.field7255;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   abstract void vmethod501(Buffer var1);

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ag")
   abstract void vmethod502(ClanSettings var1);

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("as")
   abstract void vmethod503(ClanSettings var1);

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ax")
   abstract void vmethod504(ClanSettings var1);

   @ObfuscatedSignature(descriptor = "(ILcl;I)Ldz;")
   @ObfuscatedName("ab")
   public static WorldView method5990(int var0, classCL var1, int var2) {
      try {
         Iterator var3 = var1.iterator();

         while (var3.hasNext()) {
            if (var2 == -94043672) {
               throw new IllegalStateException();
            }

            WorldView var4 = (WorldView)var3.next();
            if (var4.field1698.method13404(var0) != null) {
               if (var2 == -94043672) {
                  throw new IllegalStateException();
               }

               return var4;
            }
         }

         return classCL.method1592(var1, 14925414);
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "hb.ab(" + ')');
      }
   }
}
