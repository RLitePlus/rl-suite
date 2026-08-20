import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rx")
public class ProjectionCoord {
   @ObfuscatedSignature(descriptor = "Lrx;")
   @ObfuscatedName("ag")
   public static final ProjectionCoord field5717 = new ProjectionCoord(0.0F, 0.0F, -1.0F);
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   static final int field5723 = 24;
   @ObfuscatedName("ak")
   public static int field5720 = 0;
   @ObfuscatedSignature(descriptor = "Lrx;")
   @ObfuscatedName("an")
   public static final ProjectionCoord field5719 = new ProjectionCoord(0.0F, -1.0F, 0.0F);
   @ObfuscatedSignature(descriptor = "[Lrx;")
   @ObfuscatedName("ae")
   public static final ProjectionCoord[] field5722 = new ProjectionCoord[ProjectionCoord.field5721 * 2018536245];
   @ObfuscatedName("aj")
   static final int field5721 = -1639124528;
   @ObfuscatedSignature(descriptor = "Lrx;")
   @ObfuscatedName("at")
   public static final ProjectionCoord field5718 = new ProjectionCoord(0.0F, 1.0F, 0.0F);
   @ObfuscatedName("aw")
   public float x;
   @ObfuscatedSignature(descriptor = "Lrx;")
   @ObfuscatedName("av")
   public static final ProjectionCoord field5716 = new ProjectionCoord(0.0F, 0.0F, 0.0F);
   @ObfuscatedName("ay")
   public float y;
   @ObfuscatedName("ap")
   public float z;

   @ObfuscatedSignature(descriptor = "(Lrx;I)V")
   @ObfuscatedName("ad")
   public final void method9892(ProjectionCoord var1, int var2) {
      try {
         this.x = this.x - var1.x;
         this.z = this.z - var1.z;
         this.y = this.y - var1.y;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "rx.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrx;B)V")
   @ObfuscatedName("au")
   public final void method9884(ProjectionCoord var1, byte var2) {
      try {
         this.x = this.x + var1.x;
         this.z = this.z + var1.z;
         this.y = this.y + var1.y;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "rx.au(" + ')');
      }
   }

   ProjectionCoord(ProjectionCoord var1) {
      this.x = var1.x;
      this.z = var1.z;
      this.y = var1.y;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   public void release(int var1) {
      try {
         synchronized (field5722) {
            if (field5720 * 1970955523 < field5721 * 2018536245) {
               if (var1 != -804947546) {
                  return;
               }

               field5722[(field5720 += 1300180395) * 1970955523 - 1] = this;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "rx.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFI)V")
   @ObfuscatedName("aj")
   public void method9868(float var1, float var2, float var3, int var4) {
      try {
         this.x = var1;
         this.z = var2;
         this.y = var3;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "rx.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bl")
   public final void method9887(float var1, float var2, float var3) {
      this.x += var1;
      this.z += var2;
      this.y += var3;
   }

   @Override
   public String toString() {
      try {
         return this.x + ", " + this.z + ", " + this.y;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "rx.toString(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrx;I)Z")
   @ObfuscatedName("ap")
   boolean method9879(ProjectionCoord var1, int var2) {
      try {
         if (this.x == var1.x && this.z == var1.z) {
            if (var2 == 1160107696) {
               throw new IllegalStateException();
            }

            if (this.y == var1.y) {
               return true;
            }

            if (var2 == 1160107696) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "rx.ap(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrx;FFF)V")
   @ObfuscatedName("lp")
   public static void method9888(ProjectionCoord var0, float var1, float var2, float var3) {
      if (var0 == null) {
         var0.method9866();
      } else {
         var0.x += var1;
         var0.z += var2;
         var0.y += var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("ay")
   public final void method9920(short var1) {
      float var2 = this.method9924();
      float var3 = var2 == 0.0F ? 0.0F : 1.0F / var2;
      this.x *= var3;
      this.z *= var3;
      this.y *= var3;
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bc")
   public final void method9889(float var1, float var2, float var3) {
      this.x += var1;
      this.z += var2;
      this.y += var3;
   }

   @ObfuscatedSignature(descriptor = "(FFFI)V")
   @ObfuscatedName("az")
   public final void method9890(float var1, float var2, float var3, int var4) {
      try {
         this.x += var1;
         this.z += var2;
         this.y += var3;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "rx.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("cb")
   public final float method9902() {
      return (float)Math.sqrt(this.y * this.y + (this.z * this.z + this.x * this.x));
   }

   @ObfuscatedSignature(descriptor = "(Lrx;I)F")
   @ObfuscatedName("ai")
   public final float method9897(ProjectionCoord var1, int var2) {
      try {
         return this.z * var1.z + this.x * var1.x + var1.y * this.y;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "rx.ai(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrx;)Lrx;")
   @ObfuscatedName("aa")
   public static ProjectionCoord method9858(ProjectionCoord var0) {
      synchronized (field5722) {
         if (0 == 1970955523 * field5720) {
            return new ProjectionCoord(var0);
         } else {
            field5722[(field5720 -= 1300180395) * 1970955523].method9875(var0, (byte)8);
            return field5722[field5720 * 1970955523];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)F")
   @ObfuscatedName("ac")
   public final float method9903(byte var1) {
      try {
         return (float)Math.sqrt(this.y * this.y + (this.z * this.z + this.x * this.x));
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "rx.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrx;F)V")
   @ObfuscatedName("le")
   public static void method9906(ProjectionCoord var0, float var1) {
      if (var0 == null) {
         var0.method9926();
      } else {
         var0.x *= var1;
         var0.z *= var1;
         var0.y *= var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lra;I)V")
   @ObfuscatedName("ax")
   public final void method9909(class461 var1, int var2) {
      try {
         class461 var3 = classFT.method4104(this.x, this.z, this.y, 0.0F, (byte)38);
         class461 var4 = AbstractByteArrayCopier.method7834(var1, 807751936);
         class461 var6;
         synchronized (class461.field5498) {
            if (-603351739 * class461.field5496 == 0) {
               var6 = new class461(var4);
            } else {
               class461.field5498[(class461.field5496 -= -1125927539) * -603351739].method9296(var4, 743318851);
               var6 = class461.field5498[class461.field5496 * -603351739];
            }
         }

         class461.method9328(var6, var3, (byte)46);
         class461.method9328(var6, var1, (byte)11);
         this.method9868(var6.field5502, var6.field5499, var6.field5500, -1643524706);
         class461.method9289(var3, (byte)-92);
         class461.method9289(var4, (byte)-1);
         class461.method9289(var6, (byte)-58);
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "rx.ax(" + ')');
      }
   }

   static {
      new ProjectionCoord(1.0F, 1.0F, 1.0F);
      new ProjectionCoord(1.0F, 0.0F, 0.0F);
      new ProjectionCoord(0.0F, 0.0F, 1.0F);
      new ProjectionCoord(1.0F, 0.0F, 0.0F);
      new ProjectionCoord(-1.0F, 0.0F, 0.0F);
      new ProjectionCoord(0.0F, 0.0F, 1.0F);
      new ProjectionCoord(0.0F, 1.0F, 0.0F);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apc")
   public String method9914() {
      return this.x + ", " + this.z + ", " + this.y;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrx;)Lrx;")
   @ObfuscatedName("ao")
   public static ProjectionCoord method9859(ProjectionCoord var0) {
      synchronized (field5722) {
         if (0 == 1970955523 * field5720) {
            return new ProjectionCoord(var0);
         } else {
            field5722[(field5720 -= 1300180395) * 1970955523].method9875(var0, (byte)8);
            return field5722[field5720 * 1970955523];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFF)Lrx;")
   @ObfuscatedName("af")
   public static ProjectionCoord method9853(float var0, float var1, float var2) {
      synchronized (field5722) {
         if (0 == field5720 * 1970955523) {
            return new ProjectionCoord(var0, var1, var2);
         } else {
            field5722[(field5720 -= 637708265) * 1970955523].method9868(var0, var1, var2, -1211853928);
            return field5722[field5720 * 1865898030];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFF)Lrx;")
   @ObfuscatedName("ar")
   public static ProjectionCoord method9854(float var0, float var1, float var2) {
      synchronized (field5722) {
         if (0 == field5720 * -908199581) {
            return new ProjectionCoord(var0, var1, var2);
         } else {
            field5722[(field5720 -= -660320446) * 1970955523].method9868(var0, var1, var2, -359353751);
            return field5722[field5720 * 1970955523];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bq")
   public final void method9891(float var1, float var2, float var3) {
      this.x += var1;
      this.z += var2;
      this.y += var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrx;Lrx;)V")
   @ObfuscatedName("ag")
   public static void method9893(ProjectionCoord var0, ProjectionCoord var1) {
      if (var0 == null) {
         var0.method9902();
      }

      var0.x = var0.x - var1.x;
      var0.z = var0.z - var1.z;
      var0.y = var0.y - var1.y;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFF)Lrx;")
   @ObfuscatedName("al")
   public static ProjectionCoord method9855(float var0, float var1, float var2) {
      synchronized (field5722) {
         if (0 == field5720 * 1970955523) {
            return new ProjectionCoord(var0, var1, var2);
         } else {
            field5722[(field5720 -= 1300180395) * 1970955523].method9868(var0, var1, var2, -58332608);
            return field5722[field5720 * 1970955523];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bd")
   public final void method9876() {
      this.y = 0.0F;
      this.z = 0.0F;
      this.x = 0.0F;
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("zk")
   public void method9921(float var1, float var2, float var3) {
      this.method9868(var1, var2, var3, 1146629800);
   }

   @ObfuscatedSignature(descriptor = "(FFF)Lrx;")
   @ObfuscatedName("am")
   public static ProjectionCoord method9856(float var0, float var1, float var2) {
      synchronized (field5722) {
         if (0 == field5720 * 1970955523) {
            return new ProjectionCoord(var0, var1, var2);
         } else {
            field5722[(field5720 -= 1300180395) * 1970955523].method9868(var0, var1, var2, 1146462884);
            return field5722[field5720 * 1970955523];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrx;F)Lrx;")
   @ObfuscatedName("bg")
   public static final ProjectionCoord method9863(ProjectionCoord var0, float var1) {
      ProjectionCoord var2 = class30.method1304(var0, 742787141);
      var2.method9907(var1, (byte)41);
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFF)Lrx;")
   @ObfuscatedName("ah")
   public static ProjectionCoord method9857(float var0, float var1, float var2) {
      synchronized (field5722) {
         if (0 == field5720 * 1970955523) {
            return new ProjectionCoord(var0, var1, var2);
         } else {
            field5722[(field5720 -= 1300180395) * 1970955523].method9868(var0, var1, var2, 1055457629);
            return field5722[field5720 * 1970955523];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrx;)Lrx;")
   @ObfuscatedName("aq")
   public static ProjectionCoord method9860(ProjectionCoord var0) {
      synchronized (field5722) {
         if (0 == -1643638323 * field5720) {
            return new ProjectionCoord(var0);
         } else {
            field5722[(field5720 -= 1300180395) * -633823796].method9875(var0, (byte)8);
            return field5722[field5720 * 529011694];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrx;)Lrx;")
   @ObfuscatedName("be")
   public static ProjectionCoord method9861(ProjectionCoord var0) {
      synchronized (field5722) {
         if (0 == 1640153544 * field5720) {
            return new ProjectionCoord(var0);
         } else {
            field5722[(field5720 -= -1076497250) * -1100195681].method9875(var0, (byte)8);
            return field5722[field5720 * -985270064];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   public final void method9877() {
      this.y = 0.0F;
      this.z = 0.0F;
      this.x = 0.0F;
   }

   @ObfuscatedSignature(descriptor = "(Lrx;)Z")
   @ObfuscatedName("bw")
   boolean method9880(ProjectionCoord var1) {
      return this.x == var1.x && this.z == var1.z && this.y == var1.y;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrx;F)Lrx;")
   @ObfuscatedName("bs")
   public static final ProjectionCoord method9864(ProjectionCoord var0, float var1) {
      ProjectionCoord var2 = class30.method1304(var0, 742787141);
      var2.method9907(var1, (byte)66);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("uv")
   public void method9866() {
      synchronized (field5722) {
         if (field5720 * 1970955523 < field5721 * 2018536245) {
            field5722[(field5720 += 1300180395) * 1970955523 - 1] = this;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lra;)V")
   @ObfuscatedName("gq")
   public void method9922(class461 var1) {
      this.method9909(var1, 1314896004);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("qa")
   public void method9867() {
      synchronized (field5722) {
         if (field5720 * 1970955523 < field5721 * -259529124) {
            field5722[(field5720 += 667112006) * 1508056380 - 1] = this;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bb")
   public void method9869(float var1, float var2, float var3) {
      this.x = var1;
      this.z = var2;
      this.y = var3;
   }

   @ObfuscatedSignature(descriptor = "(FFF)Lrx;")
   @ObfuscatedName("dd")
   public static ProjectionCoord method9923(float var0, float var1, float var2) {
      return FaceNormal.method6214(var0, var1, var2, -244409807);
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bj")
   public void method9870(float var1, float var2, float var3) {
      this.x = var1;
      this.z = var2;
      this.y = var3;
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("me")
   public float method9924() {
      return this.method9903((byte)-8);
   }

   @ObfuscatedSignature(descriptor = "(Lrx;)V")
   @ObfuscatedName("bu")
   void method9872(ProjectionCoord var1) {
      this.method9868(var1.x, var1.z, var1.y, -406965697);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrx;)Ljava/lang/String;")
   @ObfuscatedName("ur")
   public static String method9915(ProjectionCoord var0) {
      if (var0 == null) {
         var0.method9917();
      }

      return var0.x + ", " + var0.z + ", " + var0.y;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrx;Lrx;)V")
   @ObfuscatedName("xq")
   public static void method9899(ProjectionCoord var0, ProjectionCoord var1) {
      var0.method9868(var1.y * var0.z - var0.y * var1.z, var1.x * var0.y - var0.x * var1.y, var1.z * var0.x - var1.x * var0.z, -103817921);
   }

   @ObfuscatedSignature(descriptor = "(Lrx;)V")
   @ObfuscatedName("bp")
   void method9873(ProjectionCoord var1) {
      this.method9868(var1.x, var1.z, var1.y, -1150450010);
   }

   @ObfuscatedSignature(descriptor = "(Lrx;)V")
   @ObfuscatedName("bt")
   void method9874(ProjectionCoord var1) {
      this.method9868(var1.x, var1.z, var1.y, -145110691);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apr")
   public String method9916() {
      return this.x + ", " + this.z + ", " + this.y;
   }

   ProjectionCoord(float var1, float var2, float var3) {
      this.x = var1;
      this.z = var2;
      this.y = var3;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   public void method9925() {
      this.release(-804947546);
   }

   @ObfuscatedSignature(descriptor = "(FB)V")
   @ObfuscatedName("ab")
   final void method9907(float var1, byte var2) {
      try {
         this.x *= var1;
         this.z *= var1;
         this.y *= var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "rx.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrx;Lrx;I)V")
   @ObfuscatedName("wl")
   public static void method9900(ProjectionCoord var0, ProjectionCoord var1, int var2) {
      if (var0 == null) {
         var0.method9896(var0, var2);
      } else {
         try {
            var0.method9868(var1.y * var0.z - var0.y * var1.z, var1.x * var0.y - var0.x * var1.y, var1.z * var0.x - var1.x * var0.z, 807872414);
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "rx.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrx;)Z")
   @ObfuscatedName("bn")
   boolean method9881(ProjectionCoord var1) {
      return this.x == var1.x && this.z == var1.z && this.y == var1.y;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("by")
   public final void method9883() {
      float var1 = 1.0F / this.method9903((byte)49);
      this.x *= var1;
      this.z *= var1;
      this.y *= var1;
   }

   @ObfuscatedSignature(descriptor = "(Lra;)V")
   @ObfuscatedName("cp")
   public final void method9910(class461 var1) {
      class461 var2 = classFT.method4104(this.x, this.z, this.y, 0.0F, (byte)98);
      class461 var3 = AbstractByteArrayCopier.method7834(var1, 2095017548);
      class461 var5;
      synchronized (class461.field5498) {
         if (-603351739 * class461.field5496 == 0) {
            var5 = new class461(var3);
         } else {
            class461.field5498[(class461.field5496 -= -1125927539) * -603351739].method9296(var3, 743318851);
            var5 = class461.field5498[class461.field5496 * -603351739];
         }
      }

      class461.method9328(var5, var2, (byte)105);
      class461.method9328(var5, var1, (byte)6);
      this.method9868(var5.field5502, var5.field5499, var5.field5500, -2129789508);
      class461.method9289(var2, (byte)-106);
      class461.method9289(var3, (byte)-91);
      class461.method9289(var5, (byte)-31);
   }

   @ObfuscatedSignature(descriptor = "(Lrx;)V")
   @ObfuscatedName("bh")
   public final void method9885(ProjectionCoord var1) {
      this.x = this.x + var1.x;
      this.z = this.z + var1.z;
      this.y = this.y + var1.y;
   }

   public ProjectionCoord() {
   }

   @ObfuscatedSignature(descriptor = "(Lrx;)V")
   @ObfuscatedName("br")
   public final void method9886(ProjectionCoord var1) {
      this.x = this.x + var1.x;
      this.z = this.z + var1.z;
      this.y = this.y + var1.y;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrx;Lrx;)Lrx;")
   @ObfuscatedName("bo")
   public static final ProjectionCoord method9862(ProjectionCoord var0, ProjectionCoord var1) {
      ProjectionCoord var2 = class30.method1304(var0, 742787141);
      method9900(var2, var1, 1113326130);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lrx;B)V")
   @ObfuscatedName("ak")
   void method9875(ProjectionCoord var1, byte var2) {
      try {
         this.method9868(var1.x, var1.z, var1.y, 979407034);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "rx.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrx;)V")
   @ObfuscatedName("bv")
   public final void method9894(ProjectionCoord var1) {
      this.x = this.x - var1.x;
      this.z = this.z - var1.z;
      this.y = this.y - var1.y;
   }

   @ObfuscatedSignature(descriptor = "(Lrx;)V")
   @ObfuscatedName("ce")
   public final void method9895(ProjectionCoord var1) {
      this.x = this.x - var1.x;
      this.z = this.z - var1.z;
      this.y = this.y - var1.y;
   }

   @ObfuscatedSignature(descriptor = "(Lrx;)F")
   @ObfuscatedName("cu")
   public final float method9898(ProjectionCoord var1) {
      return this.z * var1.z + this.x * var1.x + var1.y * this.y;
   }

   @ObfuscatedSignature(descriptor = "(Lrx;)V")
   @ObfuscatedName("cm")
   final void method9901(ProjectionCoord var1) {
      this.method9868(var1.y * this.z - this.y * var1.z, var1.x * this.y - this.x * var1.y, var1.z * this.x - var1.x * this.z, -1951782933);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   public final void method9878(int var1) {
      try {
         this.y = 0.0F;
         this.z = 0.0F;
         this.x = 0.0F;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "rx.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("ck")
   public final float method9904() {
      return (float)Math.sqrt(this.y * this.y + (this.z * this.z + this.x * this.x));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrx;FFF)V")
   @ObfuscatedName("sb")
   public static void method9871(ProjectionCoord var0, float var1, float var2, float var3) {
      if (var0 == null) {
         var0.method9883();
      }

      var0.x = var1;
      var0.z = var2;
      var0.y = var3;
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("cc")
   public final float method9905() {
      return (float)Math.sqrt(this.y * this.y + (this.z * this.z + this.x * this.x));
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bz")
   public void method9926() {
      this.method9920((short)3141);
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("cn")
   final void method9908(float var1) {
      this.x *= var1;
      this.z *= var1;
      this.y *= var1;
   }

   @ObfuscatedSignature(descriptor = "(Lra;)V")
   @ObfuscatedName("co")
   public final void method9911(class461 var1) {
      class461 var2 = classFT.method4104(this.x, this.z, this.y, 0.0F, (byte)-46);
      class461 var3 = AbstractByteArrayCopier.method7834(var1, 1075351225);
      class461 var5;
      synchronized (class461.field5498) {
         if (-603351739 * class461.field5496 == 0) {
            var5 = new class461(var3);
         } else {
            class461.field5498[(class461.field5496 -= -1125927539) * -603351739].method9296(var3, 743318851);
            var5 = class461.field5498[class461.field5496 * -603351739];
         }
      }

      class461.method9328(var5, var2, (byte)101);
      class461.method9328(var5, var1, (byte)125);
      this.method9868(var5.field5502, var5.field5499, var5.field5500, -2669924);
      class461.method9289(var2, (byte)3);
      class461.method9289(var3, (byte)-1);
      class461.method9289(var5, (byte)-120);
   }

   @ObfuscatedSignature(descriptor = "(Lra;)V")
   @ObfuscatedName("cx")
   public final void method9912(class461 var1) {
      class461 var2 = classFT.method4104(this.x, this.z, this.y, 0.0F, (byte)42);
      class461 var3 = AbstractByteArrayCopier.method7834(var1, 1177936586);
      class461 var5;
      synchronized (class461.field5498) {
         if (-603351739 * class461.field5496 == 0) {
            var5 = new class461(var3);
         } else {
            class461.field5498[(class461.field5496 -= -1125927539) * -603351739].method9296(var3, 743318851);
            var5 = class461.field5498[class461.field5496 * -603351739];
         }
      }

      class461.method9328(var5, var2, (byte)59);
      class461.method9328(var5, var1, (byte)52);
      this.method9868(var5.field5502, var5.field5499, var5.field5500, -1053744737);
      class461.method9289(var2, (byte)-49);
      class461.method9289(var3, (byte)-12);
      class461.method9289(var5, (byte)-45);
   }

   @ObfuscatedSignature(descriptor = "(Lrx;)Z")
   @ObfuscatedName("bf")
   boolean method9882(ProjectionCoord var1) {
      return this.x == var1.x && this.z == var1.z && this.y == var1.y;
   }

   @ObfuscatedSignature(descriptor = "(Lut;ILjava/lang/Object;I)V")
   @ObfuscatedName("ar")
   public static void method9918(DynamicArray var0, int var1, Object var2, int var3) {
      try {
         class461.method9338(var0, null, true, -928498657);
         if (var1 >= 0) {
            if (var3 <= -1467224872) {
               return;
            }

            if (var1 <= 1583568339 * var0.size) {
               DynamicArray.method11228(var0, 1 + 1583568339 * var0.size, -117529853);
               if (var1 < 1583568339 * var0.size) {
                  if (var3 <= -1467224872) {
                     return;
                  }

                  HttpResponse.method142(var0, var1, var0, var1 + 1, var0.size * 1583568339 - var1, (byte)2);
               }

               var0.method11221(var1, var2, -1904613362);
               var0.size += -1205286309;
               return;
            }
         }

         throw new RuntimeException();
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "rx.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lut;Lwh;I)V")
   @ObfuscatedName("aa")
   static void method9919(DynamicArray var0, class586 var1, int var2) {
      try {
         class461.method9338(var0, var1, false, -928498657);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "rx.aa(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrx;Lra;)V")
   @ObfuscatedName("lz")
   public static void method9913(ProjectionCoord var0, class461 var1) {
      class461 var2 = classFT.method4104(var0.x, var0.z, var0.y, 0.0F, (byte)74);
      class461 var3 = AbstractByteArrayCopier.method7834(var1, 2088174953);
      class461 var5;
      synchronized (class461.field5498) {
         if (-603351739 * class461.field5496 == 0) {
            var5 = new class461(var3);
         } else {
            class461.field5498[(class461.field5496 -= -1125927539) * -603351739].method9296(var3, 743318851);
            var5 = class461.field5498[class461.field5496 * -603351739];
         }
      }

      class461.method9328(var5, var2, (byte)30);
      class461.method9328(var5, var1, (byte)33);
      var0.method9868(var5.field5502, var5.field5499, var5.field5500, -881416591);
      class461.method9289(var2, (byte)-72);
      class461.method9289(var3, (byte)-65);
      class461.method9289(var5, (byte)-44);
   }

   @ObfuscatedSignature(descriptor = "(Lrx;I)V")
   @ObfuscatedName("as")
   final void method9896(ProjectionCoord var1, int var2) {
      try {
         this.z = this.z - var1.z;
         this.x = this.z - var1.y;
         this.x = this.x - var1.z;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "rx.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apd")
   public String method9917() {
      return this.x + ", " + this.x + ", " + this.z;
   }
}
