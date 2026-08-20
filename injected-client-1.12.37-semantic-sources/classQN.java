import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qn")
public class classQN {
   @ObfuscatedSignature(descriptor = "Lnv;")
   @ObfuscatedName("af")
   IterableNodeDeque field5567;
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("ib")
   static classVP field5572;
   @ToRemove(unused = "true")
   @ObfuscatedName("bh")
   static final int field5571 = 100;
   @ObfuscatedSignature(descriptor = "Lnv;")
   @ObfuscatedName("ab")
   IterableNodeDeque field5569;
   @ObfuscatedSignature(descriptor = "Lnv;")
   @ObfuscatedName("az")
   IterableNodeDeque field5568 = new IterableNodeDeque();
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   public static final int field5570 = 25;
   @ObfuscatedSignature(descriptor = "Lyz;")
   @ObfuscatedName("ch")
   static IndexedSprite field5573;
   @ObfuscatedSignature(descriptor = "Lnv;")
   @ObfuscatedName("ae")
   IterableNodeDeque field5566;

   @ObfuscatedSignature(descriptor = "(Lqn;B)Lzr;")
   @ObfuscatedName("by")
   public static ScriptEvent method9666(classQN var0, byte var1) {
      if (var0 == null) {
         return var0.method9669(var1);
      } else {
         try {
            return (ScriptEvent)IterableNodeDeque.method8163(var0.field5568);
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "qn.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfm;I)V")
   @ObfuscatedName("ab")
   void method9664(classFM var1, int var2) {
      try {
         IterableNodeDeque.method8156(this.field5569, var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qn.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lzr;")
   @ObfuscatedName("av")
   ScriptEvent method9667() {
      return (ScriptEvent)IterableNodeDeque.method8163(this.field5568);
   }

   @ObfuscatedSignature(descriptor = "(Lzr;I)V")
   @ObfuscatedName("ae")
   void method9661(ScriptEvent var1, int var2) {
      try {
         IterableNodeDeque.method8156(this.field5566, var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qn.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lfm;")
   @ObfuscatedName("ac")
   classFM method9677(byte var1) {
      try {
         return (classFM)IterableNodeDeque.method8163(this.field5569);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qn.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lzr;")
   @ObfuscatedName("at")
   ScriptEvent method9670() {
      return (ScriptEvent)IterableNodeDeque.method8163(this.field5567);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bp")
   void method9681() {
      for (classFM var1 = (classFM)this.field5569.method8167(); null != var1; var1 = (classFM)classAAX.method294(this.field5569)) {
         var1.vmethod398();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqn;I)Lzr;")
   @ObfuscatedName("un")
   public static ScriptEvent method9673(classQN var0, int var1) {
      if (var0 == null) {
         return var0.method9676(var1);
      } else {
         try {
            return (ScriptEvent)IterableNodeDeque.method8163(var0.field5566);
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "qn.ax(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;)I")
   @ObfuscatedName("ft")
   public static int method9688(WorldMap var0) {
      return var0.field6744 == null ? -1 : var0.field6738 * 1010414839 + WorldMapArea.method5880(var0.field6744, (short)-30182) * 64;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   void method9679(int var1) {
      try {
         for (ScriptEvent var2 = (ScriptEvent)this.field5568.method8167(); null != var2; var2 = (ScriptEvent)classAAX.method294(this.field5568)) {
            if (var1 <= 1422993977) {
               throw new IllegalStateException();
            }

            if (var2.method14130(-1750837176)) {
               if (var1 <= 1422993977) {
                  return;
               }

               var2.vmethod398();
               ScriptEvent.method14092(var2, -309191397).field4322 = false;
            }
         }

         this.method9682(-1498603398);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qn.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ao")
   void method9682(int var1) {
      try {
         for (classFM var2 = (classFM)this.field5569.method8167(); null != var2; var2 = (classFM)classAAX.method294(this.field5569)) {
            if (var1 == 814915695) {
               return;
            }

            var2.vmethod398();
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qn.ao(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpv;)I")
   @ObfuscatedName("rp")
   public static int method9687(classPV var0) {
      return -127397349 * var0.field5435;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   void method9685(int var1) {
      try {
         for (ScriptEvent var2 = (ScriptEvent)this.field5568.method8167(); null != var2; var2 = (ScriptEvent)classAAX.method294(this.field5568)) {
            if (var1 == 440418608) {
               throw new IllegalStateException();
            }

            if (var2.method14130(-1578156326)) {
               if (var1 == 440418608) {
                  return;
               }

               if (var2.method14091(1853529316) == ScriptEvent.method14092(var2, 1930927931).field4387) {
                  if (var1 == 440418608) {
                     throw new IllegalStateException();
                  }

                  var2.vmethod398();
               }
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qn.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lzr;)V")
   @ObfuscatedName("aj")
   public void method9654(ScriptEvent var1) {
      IterableNodeDeque.method8156(this.field5568, var1);
   }

   @ObfuscatedSignature(descriptor = "()Lfm;")
   @ObfuscatedName("ah")
   classFM method9678() {
      return (classFM)IterableNodeDeque.method8163(this.field5569);
   }

   @ObfuscatedSignature(descriptor = "(Lzr;)V")
   @ObfuscatedName("ap")
   public void method9655(ScriptEvent var1) {
      IterableNodeDeque.method8156(this.field5568, var1);
   }

   @ObfuscatedSignature(descriptor = "(Lzr;)V")
   @ObfuscatedName("ai")
   void method9662(ScriptEvent var1) {
      IterableNodeDeque.method8156(this.field5566, var1);
   }

   @ObfuscatedSignature(descriptor = "()Lzr;")
   @ObfuscatedName("ak")
   ScriptEvent method9668() {
      return (ScriptEvent)IterableNodeDeque.method8163(this.field5568);
   }

   public classQN() {
      this.field5567 = new IterableNodeDeque();
      this.field5566 = new IterableNodeDeque();
      this.field5569 = new IterableNodeDeque();
   }

   @ObfuscatedSignature(descriptor = "(Lzr;)V")
   @ObfuscatedName("aq")
   public void method9656(ScriptEvent var1) {
      IterableNodeDeque.method8156(this.field5568, var1);
   }

   @ObfuscatedSignature(descriptor = "(Lqn;I)Lzr;")
   @ObfuscatedName("rz")
   public static ScriptEvent method9671(classQN var0, int var1) {
      if (var0 == null) {
         return var0.method9675(var1);
      } else {
         try {
            return (ScriptEvent)IterableNodeDeque.method8163(var0.field5567);
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "qn.as(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqn;Lzr;)V")
   @ObfuscatedName("wd")
   public static void method9657(classQN var0, ScriptEvent var1) {
      IterableNodeDeque.method8156(var0.field5568, var1);
   }

   @ObfuscatedSignature(descriptor = "(Lzr;)V")
   @ObfuscatedName("au")
   void method9663(ScriptEvent var1) {
      IterableNodeDeque.method8156(this.field5566, var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bx")
   void method9680() {
      for (ScriptEvent var1 = (ScriptEvent)this.field5568.method8167(); null != var1; var1 = (ScriptEvent)classAAX.method294(this.field5568)) {
         if (var1.method14130(-1590274217)) {
            var1.vmethod398();
            ScriptEvent.method14092(var1, 2116735544).field4322 = false;
         }
      }

      this.method9682(-773742811);
   }

   @ObfuscatedSignature(descriptor = "()Lzr;")
   @ObfuscatedName("am")
   ScriptEvent method9674() {
      return (ScriptEvent)IterableNodeDeque.method8163(this.field5566);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("br")
   void method9683() {
      for (classFM var1 = (classFM)this.field5569.method8167(); null != var1; var1 = (classFM)classAAX.method294(this.field5569)) {
         var1.vmethod398();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lzr;I)V")
   @ObfuscatedName("az")
   public void method9658(ScriptEvent var1, int var2) {
      try {
         IterableNodeDeque.method8156(this.field5568, var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qn.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bc")
   void method9684() {
      for (classFM var1 = (classFM)this.field5569.method8167(); null != var1; var1 = (classFM)classAAX.method294(this.field5569)) {
         var1.vmethod398();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfm;)V")
   @ObfuscatedName("ar")
   void method9665(classFM var1) {
      IterableNodeDeque.method8156(this.field5569, var1);
   }

   @ObfuscatedSignature(descriptor = "()Lzr;")
   @ObfuscatedName("an")
   ScriptEvent method9672() {
      return (ScriptEvent)IterableNodeDeque.method8163(this.field5567);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bm")
   void method9686() {
      for (ScriptEvent var1 = (ScriptEvent)this.field5568.method8167(); null != var1; var1 = (ScriptEvent)classAAX.method294(this.field5568)) {
         if (var1.method14130(-1646822706) && var1.method14091(1834571774) == ScriptEvent.method14092(var1, 1403727204).field4387) {
            var1.vmethod398();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lzr;B)V")
   @ObfuscatedName("af")
   void method9659(ScriptEvent var1, byte var2) {
      try {
         IterableNodeDeque.method8156(this.field5566, var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "qn.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqn;Lzr;B)V")
   @ObfuscatedName("sc")
   public static void method9660(classQN var0, ScriptEvent var1, byte var2) {
      if (var0 == null) {
         var0.method9659(var1, var2);
      } else {
         try {
            IterableNodeDeque.method8156(var0.field5567, var1);
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "qn.af(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lzr;")
   @ObfuscatedName("ag")
   ScriptEvent method9669(byte var1) {
      try {
         return (ScriptEvent)IterableNodeDeque.method8163(this.field5567);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qn.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lzr;")
   @ObfuscatedName("as")
   ScriptEvent method9675(int var1) {
      try {
         return (ScriptEvent)IterableNodeDeque.method8163(this.field5567);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qn.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lzr;")
   @ObfuscatedName("ax")
   ScriptEvent method9676(int var1) {
      try {
         return (ScriptEvent)IterableNodeDeque.method8163(this.field5566);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qn.ax(" + ')');
      }
   }
}
