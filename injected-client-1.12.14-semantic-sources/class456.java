import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rf")
public class class456 {
   @ObfuscatedSignature(descriptor = "Lxm;")
   @ObfuscatedName("cd")
   static IndexedSprite options_buttons_0Sprite;
   @ObfuscatedSignature(descriptor = "Lrx;")
   @ObfuscatedName("at")
   public ProjectionCoord field5515;
   @ObfuscatedSignature(descriptor = "Lrx;")
   @ObfuscatedName("ag")
   public ProjectionCoord field5514;
   @ObfuscatedSignature(descriptor = "[Lrf;")
   @ObfuscatedName("an")
   static final class456[] field5513 = new class456[-311941883 * class456.field5512];
   @ObfuscatedName("ae")
   static final int field5512 = -838992688;
   @ObfuscatedSignature(descriptor = "Lra;")
   @ObfuscatedName("av")
   public class461 field5516 = new class461();
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field5518 = 65535;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field5517 = 17;
   @ObfuscatedName("aj")
   static int field5511 = 0;

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("at")
   public void method9422(short var1) {
      try {
         synchronized (field5513) {
            if (field5511 * -691516217 < field5512 * -311941883) {
               field5513[(field5511 += -986794761) * -691516217 - 1] = this;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "rf.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   void method9428(int var1) {
      try {
         class461.method9313(this.field5516, -1845539078);
         this.field5515.method9878(1701153650);
         this.field5514.x = 1.0F;
         this.field5514.z = 1.0F;
         this.field5514.y = 1.0F;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "rf.ag(" + ')');
      }
   }

   @Override
   public String toString() {
      try {
         return "[" + this.field5516.toString() + "|" + this.field5515.toString() + "|" + this.field5514.toString() + "]";
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "rf.toString(" + ')');
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (var1 == null) {
            return false;
         } else if (var1 == this) {
            return true;
         } else if (!(var1 instanceof class456)) {
            return false;
         } else {
            class456 var2 = (class456)var1;
            return this.field5516.equals(var2.field5516)
               && this.field5515.method9879(var2.field5515, 2137113714)
               && this.field5514.method9879(var2.field5514, -1565322373);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "rf.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   public void method9423() {
      synchronized (field5513) {
         if (field5511 * -691516217 < field5512 * 1884964648) {
            field5513[(field5511 += -986794761) * 2086984864 - 1] = this;
         }
      }
   }

   @Override
   public int hashCode() {
      try {
         byte var1 = 31;
         int var2 = 1;
         var2 = var2 * 31 + this.field5516.hashCode();
         var2 = var2 * 31 + this.field5515.hashCode();
         return var2 * 31 + this.field5514.hashCode();
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "rf.hashCode(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lrf;")
   @ObfuscatedName("it")
   public static class456 method9437() {
      return BuddyRankComparator.method3976(-814754263);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method9434(Object var1) {
      if (var1 == null) {
         return false;
      } else if (var1 == this) {
         return true;
      } else if (!(var1 instanceof class456)) {
         return false;
      } else {
         class456 var2 = (class456)var1;
         return this.field5516.equals(var2.field5516)
            && this.field5515.method9879(var2.field5515, 184058845)
            && this.field5514.method9879(var2.field5514, -948424723);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   public void method9424() {
      synchronized (field5513) {
         if (field5511 * -218155125 < field5512 * -1332908111) {
            field5513[(field5511 += 746972099) * -691516217 - 1] = this;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apc")
   public String method9431() {
      return "[" + this.field5516.toString() + "|" + this.field5515.toString() + "|" + this.field5514.toString() + "]";
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method9435(Object var1) {
      if (var1 == null) {
         return false;
      } else if (var1 == this) {
         return true;
      } else if (!(var1 instanceof class456)) {
         return false;
      } else {
         class456 var2 = (class456)var1;
         return this.field5516.equals(var2.field5516)
            && this.field5515.method9879(var2.field5515, -747857010)
            && this.field5514.method9879(var2.field5514, -567565466);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lrf;")
   @ObfuscatedName("ae")
   public static class456 method9419() {
      synchronized (field5513) {
         if (field5511 * 877427198 == 0) {
            return new class456();
         } else {
            field5513[(field5511 -= -986794761) * -1854644268].method9428(-861843301);
            return field5513[1534486580 * field5511];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lrf;")
   @ObfuscatedName("aj")
   public static class456 method9420() {
      synchronized (field5513) {
         if (field5511 * 1525500175 == 0) {
            return new class456();
         } else {
            field5513[(field5511 -= -744940990) * 334698836].method9428(1351991184);
            return field5513[-1073873881 * field5511];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public void method9425() {
      synchronized (field5513) {
         if (field5511 * -691516217 < field5512 * -1578358750) {
            field5513[(field5511 += -27626127) * 1580438471 - 1] = this;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apr")
   public String method9432() {
      return "[" + this.field5516.toString() + "|" + this.field5515.toString() + "|" + this.field5514.toString() + "]";
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   public void method9426() {
      synchronized (field5513) {
         if (field5511 * 1121708384 < field5512 * 1749347606) {
            field5513[(field5511 += -778985273) * -691516217 - 1] = this;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cw")
   public void method9438() {
      this.method9422((short)16834);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrf;)V")
   @ObfuscatedName("hp")
   public static void method9429(class456 var0) {
      class461.method9313(var0.field5516, -1845539078);
      var0.field5515.method9878(1701153650);
      var0.field5514.x = 1.0F;
      var0.field5514.z = 1.0F;
      var0.field5514.y = 1.0F;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrf;Ljava/lang/Object;)Z")
   @ObfuscatedName("tf")
   public static boolean method9436(class456 var0, Object var1) {
      if (var0 == null) {
         var0.method9438();
      }

      if (var1 == null) {
         return false;
      } else if (var1 == var0) {
         return true;
      } else if (!(var1 instanceof class456)) {
         return false;
      } else {
         class456 var2 = (class456)var1;
         return var0.field5516.equals(var2.field5516)
            && var0.field5515.method9879(var2.field5515, -1163054338)
            && var0.field5514.method9879(var2.field5514, -1281169322);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   void method9430() {
      class461.method9313(this.field5516, -1845539078);
      this.field5515.method9878(1701153650);
      this.field5514.x = 1.0F;
      this.field5514.z = 1.0F;
      this.field5514.y = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   public void method9427() {
      synchronized (field5513) {
         if (field5511 * -691516217 < field5512 * 935123840) {
            field5513[(field5511 += -986794761) * -1095702280 - 1] = this;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lrf;")
   @ObfuscatedName("an")
   public static class456 method9421() {
      synchronized (field5513) {
         if (field5511 * -691516217 == 0) {
            return new class456();
         } else {
            field5513[(field5511 -= -986794761) * 880266900].method9428(-1917948169);
            return field5513[789146890 * field5511];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrf;)Ljava/lang/String;")
   @ObfuscatedName("fi")
   public static String method9433(class456 var0) {
      if (var0 == null) {
         var0.method9432();
      }

      return "[" + var0.field5516.toString() + "|" + var0.field5515.toString() + "|" + var0.field5514.toString() + "]";
   }

   class456() {
      this.field5515 = new ProjectionCoord();
      this.field5514 = new ProjectionCoord(1.0F, 1.0F, 1.0F);
   }
}
