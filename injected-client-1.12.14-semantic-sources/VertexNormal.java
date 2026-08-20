import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ke")
public class VertexNormal {
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field3286 = 202;
   @ObfuscatedName("at")
   int y;
   @ObfuscatedName("ag")
   int z;
   @ObfuscatedName("an")
   int magnitude;
   @ObfuscatedName("av")
   int x;

   VertexNormal(VertexNormal var1) {
      this.x = var1.x * 1;
      this.y = 1 * var1.y;
      this.z = 1 * var1.z;
      this.magnitude = 1 * var1.magnitude;
   }

   VertexNormal() {
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("nw")
   public int method6318() {
      return this.y * 1754978191;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("gr")
   public int method6319() {
      return this.magnitude * 802759063;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kj")
   public int method6320() {
      return this.z * 1294340687;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqt;)Lvz;")
   @ObfuscatedName("uu")
   public static Node method6316(IterableNodeHashTableIterator var0) {
      if (var0 == null) {
         var0.method9155();
      }

      ArchiveDisk.method10607(var0);
      return (Node)var0.next();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("yv")
   public int method6321() {
      return this.x * 97383685;
   }

   @ObfuscatedSignature(descriptor = "([Lof;II)V")
   @ObfuscatedName("nr")
   static final void runComponentCloseListeners(Widget[] var0, int var1, int var2) {
      try {
         for (int var3 = 0; var3 < var0.length; var3++) {
            if (var2 == 1029026025) {
               throw new IllegalStateException();
            }

            Widget var4 = var0[var3];
            if (null == var4) {
               if (var2 == 1029026025) {
                  throw new IllegalStateException();
               }
            } else {
               if (0 == 928687775 * var4.type) {
                  if (var2 == 1029026025) {
                     throw new IllegalStateException();
                  }

                  if (var4.children != null) {
                     runComponentCloseListeners(var4.children, var1, -1646105199);
                  }

                  if (-1 == 2077538819 * var4.childIndex) {
                     if (var2 == 1029026025) {
                        return;
                     }

                     InterfaceParent var5 = (InterfaceParent)client.interfaceParents.method8915(278777747 * var4.id);
                     if (var5 != null) {
                        if (var2 == 1029026025) {
                           throw new IllegalStateException();
                        }

                        class520.runIntfCloseListeners(-1385287145 * var5.group, var1, -440825482);
                     }
                  }
               }

               if (0 == var1) {
                  if (var2 == 1029026025) {
                     throw new IllegalStateException();
                  }

                  if (var4.field4587 != null) {
                     if (var2 == 1029026025) {
                        throw new IllegalStateException();
                     }

                     ScriptEvent var7 = new ScriptEvent();
                     var7.widget = var4;
                     var7.args = var4.field4587;
                     class141.runScriptEvent(var7, 1856325427);
                  }
               }

               if (var1 == 1 && var4.field4541 != null) {
                  if (2077538819 * var4.childIndex >= 0) {
                     if (var2 == 1029026025) {
                        throw new IllegalStateException();
                     }

                     Widget var8 = class226.widgetDefinition.method7953(var4.id * 278777747, -385505579);
                     if (null == var8) {
                        continue;
                     }

                     if (var2 == 1029026025) {
                        return;
                     }

                     if (null == var8.children) {
                        continue;
                     }

                     if (var2 == 1029026025) {
                        throw new IllegalStateException();
                     }

                     if (2077538819 * var4.childIndex >= var8.children.length) {
                        continue;
                     }

                     if (var2 == 1029026025) {
                        throw new IllegalStateException();
                     }

                     if (var4 != var8.children[var4.childIndex * 2077538819]) {
                        if (var2 == 1029026025) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }

                  ScriptEvent var9 = new ScriptEvent();
                  var9.widget = var4;
                  var9.args = var4.field4541;
                  class141.runScriptEvent(var9, 1856325427);
               }
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ke.nr(" + ')');
      }
   }
}
