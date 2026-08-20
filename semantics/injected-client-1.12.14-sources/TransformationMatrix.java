import java.util.Arrays;
import java.util.Objects;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ry")
public final class TransformationMatrix {
   @ObfuscatedName("gq")
   public float field5735;
   @ObfuscatedName("ti")
   public float field5741;
   @ObfuscatedName("ng")
   public float field5726;
   @ObfuscatedName("ae")
   public static int field5729 = 0;
   @ObfuscatedName("do")
   public float field5725;
   @ObfuscatedSignature(descriptor = "Lry;")
   @ObfuscatedName("at")
   public static final TransformationMatrix field5728 = new TransformationMatrix();
   @ObfuscatedSignature(descriptor = "[Lry;")
   @ObfuscatedName("ag")
   public static final TransformationMatrix[] field5731 = new TransformationMatrix[604480705 * TransformationMatrix.field5730];
   @ObfuscatedName("mz")
   public float field5736;
   @ObfuscatedName("sp")
   public float field5740;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field5745 = 19;
   @ObfuscatedName("oz")
   public float field5738;
   @ObfuscatedName("al")
   public float field5732;
   @ObfuscatedName("wx")
   public float field5743;
   @ObfuscatedName("bc")
   public float field5734;
   @ObfuscatedName("vk")
   public float field5742;
   @ObfuscatedName("an")
   static final int field5730 = 86946832;
   @ObfuscatedName("qx")
   public float field5739;
   @ObfuscatedName("xp")
   public float field5744;
   @ObfuscatedName("jh")
   public float field5727;
   @ObfuscatedName("aj")
   public float[] field5747;
   @ObfuscatedName("hq")
   public float field5724;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final float field5733 = 1.0E-4F;
   @ObfuscatedName("nw")
   public float field5737;
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   static final int field5746 = 1076101432;

   public TransformationMatrix(Buffer var1, boolean var2) {
      this.method10022(var1, var2);
   }

   public TransformationMatrix(TransformationMatrix var1) {
      this.method10020(var1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("apf")
   public int method10002() {
      byte var1 = 31;
      byte var2 = 1;
      return var2 * 31 + Arrays.hashCode(this.field5747);
   }

   @ObfuscatedSignature(descriptor = "(Lrq;)V")
   @ObfuscatedName("ck")
   public void method9970(class463 var1) {
      this.field5724 = var1.field5692;
      this.field5736 = var1.field5690;
      this.field5740 = var1.field5685;
      this.field5738 = 0.0F;
      this.field5735 = var1.field5688;
      this.field5725 = var1.field5684;
      this.field5741 = var1.field5686;
      this.field5744 = 0.0F;
      this.field5743 = var1.field5687;
      this.field5739 = var1.field5693;
      this.field5726 = var1.field5689;
      this.field5732 = 0.0F;
      this.field5742 = var1.field5694;
      this.field5737 = var1.field5691;
      this.field5734 = var1.field5695;
      this.field5727 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("ao")
   public float[] method9935(int var1) {
      try {
         float[] var2 = new float[]{(float)(-Math.asin(this.field5741)), 0.0F, 0.0F};
         double var3 = Math.cos(var2[0]);
         if (Math.abs(var3) > 0.005) {
            if (var1 <= -1630502586) {
               throw new IllegalStateException();
            }

            double var5 = this.field5740;
            double var7 = this.field5726;
            double var9 = this.field5735;
            double var11 = this.field5725;
            var2[1] = (float)Math.atan2(var5, var7);
            var2[2] = (float)Math.atan2(var9, var11);
         } else {
            double var14 = this.field5736;
            double var15 = this.field5724;
            if (this.field5741 < 0.0F) {
               if (var1 <= -1630502586) {
                  throw new IllegalStateException();
               }

               var2[1] = (float)Math.atan2(var14, var15);
            } else {
               var2[1] = (float)(-Math.atan2(var14, var15));
            }

            var2[2] = 0.0F;
         }

         return var2;
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "ry.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aj")
   public void method9938(byte var1) {
      try {
         this.field5724 = 1.0F;
         this.field5736 = 0.0F;
         this.field5740 = 0.0F;
         this.field5738 = 0.0F;
         this.field5735 = 0.0F;
         this.field5725 = 1.0F;
         this.field5741 = 0.0F;
         this.field5744 = 0.0F;
         this.field5743 = 0.0F;
         this.field5739 = 0.0F;
         this.field5726 = 1.0F;
         this.field5732 = 0.0F;
         this.field5742 = 0.0F;
         this.field5737 = 0.0F;
         this.field5734 = 0.0F;
         this.field5727 = 1.0F;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ry.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lry;)V")
   @ObfuscatedName("by")
   public void method10020(TransformationMatrix var1) {
      method10012(this, var1, -1492394805);
   }

   @ObfuscatedSignature(descriptor = "(Lrq;)V")
   @ObfuscatedName("cm")
   public void method9971(class463 var1) {
      this.field5724 = var1.field5692;
      this.field5736 = var1.field5690;
      this.field5740 = var1.field5685;
      this.field5738 = 0.0F;
      this.field5735 = var1.field5688;
      this.field5725 = var1.field5684;
      this.field5741 = var1.field5686;
      this.field5744 = 0.0F;
      this.field5743 = var1.field5687;
      this.field5739 = var1.field5693;
      this.field5726 = var1.field5689;
      this.field5732 = 0.0F;
      this.field5742 = var1.field5694;
      this.field5737 = var1.field5691;
      this.field5734 = var1.field5695;
      this.field5727 = 1.0F;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lry;)F")
   @ObfuscatedName("fr")
   public static float method9975(TransformationMatrix var0) {
      return var0 == null
         ? var0.method9981()
         : var0.field5734 * (var0.field5738 * var0.field5725 * var0.field5743)
            + (
               var0.field5725 * var0.field5740 * var0.field5732 * var0.field5742
                  + (
                     var0.field5742 * (var0.field5744 * var0.field5736 * var0.field5726)
                        + (
                           var0.field5736 * var0.field5735 * var0.field5732 * var0.field5734
                              + (
                                 var0.field5739 * (var0.field5744 * var0.field5724) * var0.field5734
                                    + (
                                       var0.field5726 * (var0.field5724 * var0.field5725) * var0.field5727
                                          - var0.field5724 * var0.field5725 * var0.field5732 * var0.field5734
                                          - var0.field5739 * (var0.field5741 * var0.field5724) * var0.field5727
                                          + var0.field5737 * (var0.field5741 * var0.field5724 * var0.field5732)
                                    )
                                    - var0.field5726 * (var0.field5724 * var0.field5744) * var0.field5737
                                    - var0.field5727 * (var0.field5736 * var0.field5735 * var0.field5726)
                              )
                              + var0.field5743 * (var0.field5741 * var0.field5736) * var0.field5727
                              - var0.field5742 * (var0.field5732 * (var0.field5741 * var0.field5736))
                              - var0.field5734 * (var0.field5743 * (var0.field5744 * var0.field5736))
                        )
                        + var0.field5740 * var0.field5735 * var0.field5739 * var0.field5727
                        - var0.field5732 * (var0.field5735 * var0.field5740) * var0.field5737
                        - var0.field5743 * (var0.field5740 * var0.field5725) * var0.field5727
                  )
                  + var0.field5737 * (var0.field5744 * var0.field5740 * var0.field5743)
                  - var0.field5742 * (var0.field5739 * (var0.field5740 * var0.field5744))
                  - var0.field5735 * var0.field5738 * var0.field5739 * var0.field5734
                  + var0.field5735 * var0.field5738 * var0.field5726 * var0.field5737
            )
            - var0.field5742 * (var0.field5725 * var0.field5738 * var0.field5726)
            - var0.field5743 * (var0.field5741 * var0.field5738) * var0.field5737
            + var0.field5742 * (var0.field5741 * var0.field5738 * var0.field5739);
   }

   @ObfuscatedSignature(descriptor = "(Lry;)Lry;")
   @ObfuscatedName("vd")
   public static TransformationMatrix method10016(TransformationMatrix var0) {
      synchronized (field5731) {
         if (field5729 * -1539552615 == 0) {
            return new TransformationMatrix(var0);
         } else {
            TransformationMatrix[] var10000 = field5731;
            int var10001 = field5729 * -1539552615 - 1;
            field5729 = (field5729 * -1539552615 - 1) * -794138199;
            TransformationMatrix var2 = var10000[var10001];
            var2.method10020(var0);
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FI)V")
   @ObfuscatedName("ap")
   public void method9950(float var1, int var2) {
      try {
         method9953(this, var1, var1, var1, 2033287157);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ry.ap(" + ')');
      }
   }

   public TransformationMatrix() {
      this.field5724 = 1.0F;
      this.field5725 = 1.0F;
      this.field5726 = 1.0F;
      this.field5727 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "(Lrf;B)V")
   @ObfuscatedName("ad")
   public void method10017(class456 var1, byte var2) {
      float var3 = var1.field5516.field5501 * var1.field5516.field5501;
      float var4 = var1.field5516.field5501 * var1.field5516.field5502;
      float var5 = var1.field5516.field5499 * var1.field5516.field5501;
      float var6 = var1.field5516.field5500 * var1.field5516.field5501;
      float var7 = var1.field5516.field5502 * var1.field5516.field5502;
      float var8 = var1.field5516.field5499 * var1.field5516.field5502;
      float var9 = var1.field5516.field5500 * var1.field5516.field5502;
      float var10 = var1.field5516.field5499 * var1.field5516.field5499;
      float var11 = var1.field5516.field5500 * var1.field5516.field5499;
      float var12 = var1.field5516.field5500 * var1.field5516.field5500;
      this.field5724 = var3 + var7 - var12 - var10;
      this.field5736 = var6 + var8 + var6 + var8;
      this.field5740 = var9 - var5 - var5 + var9;
      this.field5735 = var8 - var6 - var6 + var8;
      this.field5725 = var3 + var10 - var7 - var12;
      this.field5741 = var11 + var11 + var4 + var4;
      this.field5743 = var9 + var9 + var5 + var5;
      this.field5739 = var11 - var4 - var4 + var11;
      this.field5726 = var3 + var12 - var10 - var7;
      this.field5732 = 0.0F;
      this.field5744 = 0.0F;
      this.field5738 = 0.0F;
      this.field5742 = var1.field5515.x;
      this.field5737 = var1.field5515.z;
      this.field5734 = var1.field5515.y;
      this.field5727 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "(FFF)F")
   @ObfuscatedName("db")
   public float method9994(float var1, float var2, float var3) {
      return var1 * this.field5724 + this.field5735 * var2 + this.field5743 * var3 + this.field5742;
   }

   @ObfuscatedSignature(descriptor = "(B)F")
   @ObfuscatedName("ac")
   float method9976(byte var1) {
      try {
         return this.field5734 * (this.field5738 * this.field5725 * this.field5743)
            + (
               this.field5725 * this.field5740 * this.field5732 * this.field5742
                  + (
                     this.field5742 * (this.field5744 * this.field5736 * this.field5726)
                        + (
                           this.field5736 * this.field5735 * this.field5732 * this.field5734
                              + (
                                 this.field5739 * (this.field5744 * this.field5724) * this.field5734
                                    + (
                                       this.field5726 * (this.field5724 * this.field5725) * this.field5727
                                          - this.field5724 * this.field5725 * this.field5732 * this.field5734
                                          - this.field5739 * (this.field5741 * this.field5724) * this.field5727
                                          + this.field5737 * (this.field5741 * this.field5724 * this.field5732)
                                    )
                                    - this.field5726 * (this.field5724 * this.field5744) * this.field5737
                                    - this.field5727 * (this.field5736 * this.field5735 * this.field5726)
                              )
                              + this.field5743 * (this.field5741 * this.field5736) * this.field5727
                              - this.field5742 * (this.field5732 * (this.field5741 * this.field5736))
                              - this.field5734 * (this.field5743 * (this.field5744 * this.field5736))
                        )
                        + this.field5740 * this.field5735 * this.field5739 * this.field5727
                        - this.field5732 * (this.field5735 * this.field5740) * this.field5737
                        - this.field5743 * (this.field5740 * this.field5725) * this.field5727
                  )
                  + this.field5737 * (this.field5744 * this.field5740 * this.field5743)
                  - this.field5742 * (this.field5739 * (this.field5740 * this.field5744))
                  - this.field5735 * this.field5738 * this.field5739 * this.field5734
                  + this.field5735 * this.field5738 * this.field5726 * this.field5737
            )
            - this.field5742 * (this.field5725 * this.field5738 * this.field5726)
            - this.field5743 * (this.field5741 * this.field5738) * this.field5737
            + this.field5742 * (this.field5741 * this.field5738 * this.field5739);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ry.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("cw")
   public float[] method10006() {
      float[] var1 = new float[3];
      ProjectionCoord var2 = new ProjectionCoord(this.field5724, this.field5736, this.field5740);
      ProjectionCoord var3 = new ProjectionCoord(this.field5735, this.field5725, this.field5741);
      ProjectionCoord var4 = new ProjectionCoord(this.field5743, this.field5739, this.field5726);
      var1[0] = var2.method9903((byte)76);
      var1[1] = var3.method9903((byte)27);
      var1[2] = var4.method9903((byte)56);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   public void method9982(int var1) {
      try {
         float var2 = 1.0F / this.method9976((byte)-115);
         float var3 = var2
            * (
               this.field5737 * (this.field5732 * this.field5741)
                  + (
                     this.field5727 * (this.field5725 * this.field5726)
                        - this.field5725 * this.field5732 * this.field5734
                        - this.field5727 * (this.field5741 * this.field5739)
                  )
                  + this.field5739 * this.field5744 * this.field5734
                  - this.field5737 * (this.field5744 * this.field5726)
            );
         float var4 = (
               this.field5726 * -this.field5736 * this.field5727
                  + this.field5734 * (this.field5736 * this.field5732)
                  + this.field5740 * this.field5739 * this.field5727
                  - this.field5737 * (this.field5732 * this.field5740)
                  - this.field5734 * (this.field5739 * this.field5738)
                  + this.field5726 * this.field5738 * this.field5737
            )
            * var2;
         float var5 = (
               this.field5734 * (this.field5738 * this.field5725)
                  + (
                     this.field5727 * (this.field5736 * this.field5741)
                        - this.field5736 * this.field5744 * this.field5734
                        - this.field5725 * this.field5740 * this.field5727
                        + this.field5737 * (this.field5744 * this.field5740)
                  )
                  - this.field5737 * (this.field5738 * this.field5741)
            )
            * var2;
         float var6 = (
               this.field5741 * this.field5738 * this.field5739
                  + (
                     this.field5741 * -this.field5736 * this.field5732
                        + this.field5726 * (this.field5744 * this.field5736)
                        + this.field5732 * (this.field5725 * this.field5740)
                        - this.field5739 * (this.field5744 * this.field5740)
                        - this.field5726 * (this.field5738 * this.field5725)
                  )
            )
            * var2;
         float var7 = (
               this.field5742 * (this.field5726 * this.field5744)
                  + (
                     this.field5734 * (this.field5732 * this.field5735)
                        + this.field5727 * (this.field5726 * -this.field5735)
                        + this.field5743 * this.field5741 * this.field5727
                        - this.field5741 * this.field5732 * this.field5742
                        - this.field5743 * this.field5744 * this.field5734
                  )
            )
            * var2;
         float var8 = (
               this.field5734 * (this.field5738 * this.field5743)
                  + (
                     this.field5742 * (this.field5740 * this.field5732)
                        + (
                           this.field5724 * this.field5726 * this.field5727
                              - this.field5734 * (this.field5724 * this.field5732)
                              - this.field5740 * this.field5743 * this.field5727
                        )
                  )
                  - this.field5726 * this.field5738 * this.field5742
            )
            * var2;
         float var9 = var2
            * (
               this.field5727 * (this.field5740 * this.field5735)
                  + (this.field5734 * (this.field5724 * this.field5744) + -this.field5724 * this.field5741 * this.field5727)
                  - this.field5742 * (this.field5740 * this.field5744)
                  - this.field5738 * this.field5735 * this.field5734
                  + this.field5738 * this.field5741 * this.field5742
            );
         float var10 = var2
            * (
               this.field5741 * this.field5724 * this.field5732
                  - this.field5726 * (this.field5744 * this.field5724)
                  - this.field5740 * this.field5735 * this.field5732
                  + this.field5743 * (this.field5740 * this.field5744)
                  + this.field5726 * (this.field5735 * this.field5738)
                  - this.field5741 * this.field5738 * this.field5743
            );
         float var11 = var2
            * (
               this.field5742 * (this.field5732 * this.field5725)
                  + (
                     this.field5739 * this.field5735 * this.field5727
                        - this.field5737 * (this.field5735 * this.field5732)
                        - this.field5743 * this.field5725 * this.field5727
                  )
                  + this.field5744 * this.field5743 * this.field5737
                  - this.field5742 * (this.field5744 * this.field5739)
            );
         float var12 = var2
            * (
               this.field5739 * -this.field5724 * this.field5727
                  + this.field5732 * this.field5724 * this.field5737
                  + this.field5727 * (this.field5736 * this.field5743)
                  - this.field5736 * this.field5732 * this.field5742
                  - this.field5743 * this.field5738 * this.field5737
                  + this.field5742 * (this.field5739 * this.field5738)
            );
         float var13 = var2
            * (
               this.field5742 * (this.field5744 * this.field5736)
                  + (
                     this.field5727 * (this.field5724 * this.field5725)
                        - this.field5724 * this.field5744 * this.field5737
                        - this.field5736 * this.field5735 * this.field5727
                  )
                  + this.field5737 * (this.field5738 * this.field5735)
                  - this.field5742 * (this.field5725 * this.field5738)
            );
         float var14 = var2
            * (
               this.field5743 * (this.field5738 * this.field5725)
                  + (
                     this.field5735 * this.field5736 * this.field5732
                        + (this.field5732 * (-this.field5724 * this.field5725) + this.field5739 * (this.field5724 * this.field5744))
                        - this.field5743 * (this.field5736 * this.field5744)
                        - this.field5738 * this.field5735 * this.field5739
                  )
            );
         float var15 = (
               this.field5739 * this.field5741 * this.field5742
                  + (
                     this.field5725 * this.field5743 * this.field5734
                        + (this.field5734 * (-this.field5735 * this.field5739) + this.field5726 * this.field5735 * this.field5737)
                        - this.field5726 * this.field5725 * this.field5742
                        - this.field5741 * this.field5743 * this.field5737
                  )
            )
            * var2;
         float var16 = var2
            * (
               this.field5742 * (this.field5736 * this.field5726)
                  + (
                     this.field5734 * (this.field5739 * this.field5724)
                        - this.field5726 * this.field5724 * this.field5737
                        - this.field5743 * this.field5736 * this.field5734
                  )
                  + this.field5743 * this.field5740 * this.field5737
                  - this.field5742 * (this.field5739 * this.field5740)
            );
         float var17 = var2
            * (
               this.field5742 * (this.field5725 * this.field5740)
                  + (
                     this.field5741 * this.field5724 * this.field5737
                        + this.field5725 * -this.field5724 * this.field5734
                        + this.field5734 * (this.field5735 * this.field5736)
                        - this.field5742 * (this.field5736 * this.field5741)
                        - this.field5737 * (this.field5740 * this.field5735)
                  )
            );
         float var18 = (
               this.field5740 * this.field5735 * this.field5739
                  + (
                     this.field5743 * (this.field5741 * this.field5736)
                        + (
                           this.field5726 * (this.field5724 * this.field5725)
                              - this.field5741 * this.field5724 * this.field5739
                              - this.field5735 * this.field5736 * this.field5726
                        )
                  )
                  - this.field5743 * (this.field5725 * this.field5740)
            )
            * var2;
         this.field5724 = var3;
         this.field5736 = var4;
         this.field5740 = var5;
         this.field5738 = var6;
         this.field5735 = var7;
         this.field5725 = var8;
         this.field5741 = var9;
         this.field5744 = var10;
         this.field5743 = var11;
         this.field5739 = var12;
         this.field5726 = var13;
         this.field5732 = var14;
         this.field5742 = var15;
         this.field5737 = var16;
         this.field5734 = var17;
         this.field5727 = var18;
      } catch (RuntimeException var19) {
         throw RestClientThreadFactory.newRunException(var19, "ry.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lry;")
   @ObfuscatedName("aq")
   public static TransformationMatrix method9927() {
      synchronized (field5731) {
         if (-1539552615 * field5729 == 0) {
            return new TransformationMatrix();
         } else {
            field5731[(field5729 -= -794138199) * -1539552615].method9938((byte)6);
            return field5731[field5729 * -1539552615];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lra;)V")
   @ObfuscatedName("hu")
   public void method10021(class461 var1) {
      this.method9967(var1, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(FFF[FI)V")
   @ObfuscatedName("ar")
   public void transformPoint(float var1, float var2, float var3, float[] var4, int var5) {
      try {
         var4[0] = this.field5742 + (var3 * this.field5743 + (this.field5724 * var1 + this.field5735 * var2));
         var4[1] = this.field5725 * var2 + var1 * this.field5736 + var3 * this.field5739 + this.field5737;
         var4[2] = this.field5734 + (this.field5740 * var1 + this.field5741 * var2 + this.field5726 * var3);
         if (var4.length > 3) {
            if (var5 != 1045119330) {
               throw new IllegalStateException();
            }

            var4[3] = this.field5727 + (var2 * this.field5744 + this.field5738 * var1 + this.field5732 * var3);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ry.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Z)V")
   @ObfuscatedName("yf")
   public void method10022(Buffer var1, boolean var2) {
      method10014(this, var1, var2, 730117099);
   }

   @ObfuscatedSignature(descriptor = "(FFFI)Lrx;")
   @ObfuscatedName("ah")
   public ProjectionCoord method9992(float var1, float var2, float var3, int var4) {
      try {
         float var5 = 1.0F / (var1 * this.field5738 + this.field5744 * var2 + var3 * this.field5732 + this.field5727);
         return FaceNormal.method6214(
            (this.field5742 + (var3 * this.field5743 + (var2 * this.field5735 + var1 * this.field5724))) * var5,
            (this.field5737 + (this.field5739 * var3 + (var2 * this.field5725 + var1 * this.field5736))) * var5,
            (this.field5726 * var3 + (var1 * this.field5740 + var2 * this.field5741) + this.field5734) * var5,
            -987535724
         );
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ry.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFI)F")
   @ObfuscatedName("al")
   public float method9995(float var1, float var2, float var3, int var4) {
      try {
         return var1 * this.field5724 + this.field5735 * var2 + this.field5743 * var3 + this.field5742;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ry.al(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lry;)V")
   @ObfuscatedName("bo")
   public static void method9942(TransformationMatrix var0) {
      if (var0 == null) {
         var0.method9940();
      } else {
         var0.field5724 = 0.0F;
         var0.field5736 = 0.0F;
         var0.field5740 = 0.0F;
         var0.field5738 = 0.0F;
         var0.field5735 = 0.0F;
         var0.field5725 = 0.0F;
         var0.field5741 = 0.0F;
         var0.field5744 = 0.0F;
         var0.field5743 = 0.0F;
         var0.field5739 = 0.0F;
         var0.field5726 = 0.0F;
         var0.field5732 = 0.0F;
         var0.field5742 = 0.0F;
         var0.field5737 = 0.0F;
         var0.field5734 = 0.0F;
         var0.field5727 = 0.0F;
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFF)V")
   @ObfuscatedName("cp")
   public void method10023(float var1, float var2, float var3, float var4) {
      this.method9987(var1, var2, var3, var4, -2101166113);
   }

   @ObfuscatedSignature(descriptor = "(FFFB)F")
   @ObfuscatedName("af")
   public float method9996(float var1, float var2, float var3, byte var4) {
      try {
         return this.field5737 + (this.field5725 * var2 + this.field5736 * var1 + var3 * this.field5739);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ry.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lry;)V")
   @ObfuscatedName("ue")
   public void method10024(TransformationMatrix var1) {
      method9959(this, var1, (byte)-19);
   }

   @ObfuscatedSignature(descriptor = "(FFFS)F")
   @ObfuscatedName("am")
   public float method9997(float var1, float var2, float var3, short var4) {
      try {
         return this.field5741 * var2 + this.field5740 * var1 + this.field5726 * var3 + this.field5734;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ry.am(" + ')');
      }
   }

   @Override
   public String toString() {
      return "Mat4{m0="
         + this.field5724
         + ", m1="
         + this.field5736
         + ", m2="
         + this.field5740
         + ", m3="
         + this.field5738
         + ", m4="
         + this.field5735
         + ", m5="
         + this.field5725
         + ", m6="
         + this.field5741
         + ", m7="
         + this.field5744
         + ", m8="
         + this.field5743
         + ", m9="
         + this.field5739
         + ", m10="
         + this.field5726
         + ", m11="
         + this.field5732
         + ", m12="
         + this.field5742
         + ", m13="
         + this.field5737
         + ", m14="
         + this.field5734
         + ", m15="
         + this.field5727
         + "}";
   }

   @Override
   public int hashCode() {
      return Objects.hash(
         this.field5724,
         this.field5736,
         this.field5740,
         this.field5738,
         this.field5735,
         this.field5725,
         this.field5741,
         this.field5744,
         this.field5743,
         this.field5739,
         this.field5726,
         this.field5732,
         this.field5742,
         this.field5737,
         this.field5734,
         this.field5727
      );
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         TransformationMatrix var2 = (TransformationMatrix)var1;
         return Float.compare(var2.field5724, this.field5724) == 0
            && Float.compare(var2.field5736, this.field5736) == 0
            && Float.compare(var2.field5740, this.field5740) == 0
            && Float.compare(var2.field5738, this.field5738) == 0
            && Float.compare(var2.field5735, this.field5735) == 0
            && Float.compare(var2.field5725, this.field5725) == 0
            && Float.compare(var2.field5741, this.field5741) == 0
            && Float.compare(var2.field5744, this.field5744) == 0
            && Float.compare(var2.field5743, this.field5743) == 0
            && Float.compare(var2.field5739, this.field5739) == 0
            && Float.compare(var2.field5726, this.field5726) == 0
            && Float.compare(var2.field5732, this.field5732) == 0
            && Float.compare(var2.field5742, this.field5742) == 0
            && Float.compare(var2.field5737, this.field5737) == 0
            && Float.compare(var2.field5734, this.field5734) == 0
            && Float.compare(var2.field5727, this.field5727) == 0;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrf;)V")
   @ObfuscatedName("ch")
   public void method9962(class456 var1) {
      float var2 = var1.field5516.field5501 * var1.field5516.field5501;
      float var3 = var1.field5516.field5502 * var1.field5516.field5501;
      float var4 = var1.field5516.field5499 * var1.field5516.field5501;
      float var5 = var1.field5516.field5501 * var1.field5516.field5500;
      float var6 = var1.field5516.field5502 * var1.field5516.field5502;
      float var7 = var1.field5516.field5502 * var1.field5516.field5499;
      float var8 = var1.field5516.field5500 * var1.field5516.field5502;
      float var9 = var1.field5516.field5499 * var1.field5516.field5499;
      float var10 = var1.field5516.field5499 * var1.field5516.field5500;
      float var11 = var1.field5516.field5500 * var1.field5516.field5500;
      this.field5724 = var6 + var2 - var11 - var9;
      this.field5736 = var5 + (var5 + var7 + var7);
      this.field5740 = var8 + (var8 - var4 - var4);
      this.field5735 = var7 - var5 - var5 + var7;
      this.field5725 = var2 + var9 - var6 - var11;
      this.field5741 = var3 + (var10 + var3 + var10);
      this.field5743 = var4 + (var8 + var4 + var8);
      this.field5739 = var10 + (var10 - var3 - var3);
      this.field5726 = var11 + var2 - var9 - var6;
      float[] var12 = this.field5747;
      float[] var13 = this.field5747;
      this.field5732 = 0.0F;
      var13[7] = 0.0F;
      var12[3] = 0.0F;
      this.field5742 = var1.field5515.x;
      this.field5737 = var1.field5515.z;
      this.field5734 = var1.field5515.y;
      this.field5727 = 1.0F;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lry;)[F")
   @ObfuscatedName("db")
   public static float[] method10007(TransformationMatrix var0) {
      if (var0 == null) {
         var0.method9941();
      }

      float[] var1 = new float[3];
      ProjectionCoord var2 = new ProjectionCoord(var0.field5724, var0.field5736, var0.field5740);
      ProjectionCoord var3 = new ProjectionCoord(var0.field5735, var0.field5725, var0.field5741);
      ProjectionCoord var4 = new ProjectionCoord(var0.field5743, var0.field5739, var0.field5726);
      var1[0] = var2.method9903((byte)-31);
      var1[1] = var3.method9903((byte)8);
      var1[2] = var4.method9903((byte)-76);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method10003(Object var1) {
      if (!(var1 instanceof TransformationMatrix)) {
         return false;
      } else {
         TransformationMatrix var2 = (TransformationMatrix)var1;

         for (int var3 = 0; var3 < 16; var3++) {
            if (this.field5747[var3] != var2.field5747[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method10004(Object var1) {
      if (!(var1 instanceof TransformationMatrix)) {
         return false;
      } else {
         TransformationMatrix var2 = (TransformationMatrix)var1;

         for (int var3 = 0; var3 < 16; var3++) {
            if (this.field5747[var3] != var2.field5747[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apd")
   public String method9999() {
      StringBuilder var1 = new StringBuilder();
      this.method9935(-1277902271);
      this.method9933((byte)1);

      for (int var2 = 0; var2 < 4; var2++) {
         for (int var3 = 0; var3 < 4; var3++) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.field5747[var3 + var2 * 4];
            if (Math.sqrt(var4 * var4) < 1.0E-4F) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lry;)[F")
   @ObfuscatedName("uv")
   public static float[] method9932(TransformationMatrix var0) {
      if (var0 == null) {
         var0.method9944();
      }

      float[] var1 = new float[3];
      if (var0.field5740 < 0.999 && var0.field5740 > -0.999) {
         var1[1] = (float)(-Math.asin(var0.field5740));
         double var2 = Math.cos(var1[1]);
         var1[0] = (float)Math.atan2(var0.field5741 / var2, var0.field5726 / var2);
         var1[2] = (float)Math.atan2(var0.field5736 / var2, var0.field5724 / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2(var0.field5740, 0.0);
         var1[2] = (float)Math.atan2(-var0.field5739, var0.field5725);
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apc")
   public String method10000() {
      StringBuilder var1 = new StringBuilder();
      this.method9935(1421092287);
      this.method9933((byte)1);

      for (int var2 = 0; var2 < 4; var2++) {
         for (int var3 = 0; var3 < 4; var3++) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = this.field5747[var3 + var2 * 4];
            if (Math.sqrt(var4 * var4) < 1.0E-4F) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lry;")
   @ObfuscatedName("aa")
   public static TransformationMatrix method9928() {
      synchronized (field5731) {
         if (-1539552615 * field5729 == 0) {
            return new TransformationMatrix();
         } else {
            field5731[(field5729 -= -794138199) * -1539552615].method9938((byte)6);
            return field5731[field5729 * -1539552615];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrf;)V")
   @ObfuscatedName("bv")
   public void method9963(class456 var1) {
      float var2 = var1.field5516.field5501 * var1.field5516.field5501;
      float var3 = var1.field5516.field5502 * var1.field5516.field5501;
      float var4 = var1.field5516.field5499 * var1.field5516.field5501;
      float var5 = var1.field5516.field5501 * var1.field5516.field5500;
      float var6 = var1.field5516.field5502 * var1.field5516.field5502;
      float var7 = var1.field5516.field5502 * var1.field5516.field5499;
      float var8 = var1.field5516.field5500 * var1.field5516.field5502;
      float var9 = var1.field5516.field5499 * var1.field5516.field5499;
      float var10 = var1.field5516.field5499 * var1.field5516.field5500;
      float var11 = var1.field5516.field5500 * var1.field5516.field5500;
      this.field5724 = var6 + var2 - var11 - var9;
      this.field5736 = var5 + (var5 + var7 + var7);
      this.field5740 = var8 + (var8 - var4 - var4);
      this.field5735 = var7 - var5 - var5 + var7;
      this.field5725 = var2 + var9 - var6 - var11;
      this.field5741 = var3 + (var10 + var3 + var10);
      this.field5743 = var4 + (var8 + var4 + var8);
      this.field5739 = var10 + (var10 - var3 - var3);
      this.field5726 = var11 + var2 - var9 - var6;
      float[] var12 = this.field5747;
      float[] var13 = this.field5747;
      this.field5732 = 0.0F;
      var13[7] = 0.0F;
      var12[3] = 0.0F;
      this.field5742 = var1.field5515.x;
      this.field5737 = var1.field5515.z;
      this.field5734 = var1.field5515.y;
      this.field5727 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "(Lry;Lxa;ZI)V")
   @ObfuscatedName("jl")
   public static void method10014(TransformationMatrix var0, Buffer var1, boolean var2, int var3) {
      if (var0 == null) {
         var0.method10015(var1, var2, var3);
      } else {
         if (var2) {
            boolean var5 = var2;
            Buffer var4 = var1;
            TransformationMatrix var18 = var0;
            int var6 = 730117099;

            try {
               if (var5) {
                  class463 var7 = new class463();
                  int var10 = var4.readShort((byte)-116);
                  var10 &= 16383;
                  float var9 = (float)(3.834951969714103E-4 * var10);
                  class463.method9764(var7, var9, -1314816461);
                  int var13 = var4.readShort((byte)-32);
                  var13 &= 16383;
                  float var12 = (float)(var13 * 3.834951969714103E-4);
                  var7.method9766(var12, -1739121717);
                  int var16 = var4.readShort((byte)-128);
                  var16 &= 16383;
                  float var15 = (float)(3.834951969714103E-4 * var16);
                  var7.method9771(var15, 517638479);
                  var7.method9775(var4.readShort((byte)-93), var4.readShort((byte)-31), var4.readShort((byte)-119), 1932432107);
                  var18.method9972(var7, (byte)-52);
               } else {
                  for (int var19 = 0; var19 < 16; var19++) {
                     if (var6 <= -167339330) {
                        throw new IllegalStateException();
                     }

                     var18.field5747[var19] = var4.method12021(-102499997);
                  }
               }
            } catch (RuntimeException var17) {
               throw RestClientThreadFactory.newRunException(var17, "ry.ag(" + ')');
            }
         } else {
            var0.field5724 = var1.method12227();
            var0.field5736 = var1.method12227();
            var0.field5740 = var1.method12227();
            var0.field5738 = var1.method12227();
            var0.field5735 = var1.method12227();
            var0.field5725 = var1.method12227();
            var0.field5741 = var1.method12227();
            var0.field5744 = var1.method12227();
            var0.field5743 = var1.method12227();
            var0.field5739 = var1.method12227();
            var0.field5726 = var1.method12227();
            var0.field5732 = var1.method12227();
            var0.field5742 = var1.method12227();
            var0.field5737 = var1.method12227();
            var0.field5734 = var1.method12227();
            var0.field5727 = var1.method12227();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lry;B)V")
   @ObfuscatedName("au")
   public void method10018(TransformationMatrix var1, byte var2) {
      this.field5724 = this.field5724 + var1.field5724;
      this.field5736 = this.field5736 + var1.field5736;
      this.field5740 = this.field5740 + var1.field5740;
      this.field5738 = this.field5738 + var1.field5738;
      this.field5735 = this.field5735 + var1.field5735;
      this.field5725 = this.field5725 + var1.field5725;
      this.field5741 = this.field5741 + var1.field5741;
      this.field5744 = this.field5744 + var1.field5744;
      this.field5743 = this.field5743 + var1.field5743;
      this.field5739 = this.field5739 + var1.field5739;
      this.field5726 = this.field5726 + var1.field5726;
      this.field5732 = this.field5732 + var1.field5732;
      this.field5742 = this.field5742 + var1.field5742;
      this.field5737 = this.field5737 + var1.field5737;
      this.field5734 = this.field5734 + var1.field5734;
      this.field5727 = this.field5727 + var1.field5727;
   }

   @ObfuscatedSignature(descriptor = "(Lry;I)V")
   @ObfuscatedName("kn")
   public static void method9943(TransformationMatrix var0, int var1) {
      if (var0 == null) {
         var0.method9945(var1);
      }

      try {
         var0.field5724 = 0.0F;
         var0.field5736 = 0.0F;
         var0.field5740 = 0.0F;
         var0.field5738 = 0.0F;
         var0.field5735 = 0.0F;
         var0.field5725 = 0.0F;
         var0.field5741 = 0.0F;
         var0.field5744 = 0.0F;
         var0.field5743 = 0.0F;
         var0.field5739 = 0.0F;
         var0.field5726 = 0.0F;
         var0.field5732 = 0.0F;
         var0.field5742 = 0.0F;
         var0.field5737 = 0.0F;
         var0.field5734 = 0.0F;
         var0.field5727 = 0.0F;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ry.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("bk")
   public float[] method9936() {
      float[] var1 = new float[]{(float)(-Math.asin(this.field5741)), 0.0F, 0.0F};
      double var2 = Math.cos(var1[0]);
      if (Math.abs(var2) > 0.005) {
         double var4 = this.field5740;
         double var6 = this.field5726;
         double var8 = this.field5735;
         double var10 = this.field5725;
         var1[1] = (float)Math.atan2(var4, var6);
         var1[2] = (float)Math.atan2(var8, var10);
      } else {
         double var12 = this.field5736;
         double var13 = this.field5724;
         if (this.field5741 < 0.0F) {
            var1[1] = (float)Math.atan2(var12, var13);
         } else {
            var1[1] = (float)(-Math.atan2(var12, var13));
         }

         var1[2] = 0.0F;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   public void method9939() {
      this.field5724 = 1.0F;
      this.field5736 = 0.0F;
      this.field5740 = 0.0F;
      this.field5738 = 0.0F;
      this.field5735 = 0.0F;
      this.field5725 = 1.0F;
      this.field5741 = 0.0F;
      this.field5744 = 0.0F;
      this.field5743 = 0.0F;
      this.field5739 = 0.0F;
      this.field5726 = 1.0F;
      this.field5732 = 0.0F;
      this.field5742 = 0.0F;
      this.field5737 = 0.0F;
      this.field5734 = 0.0F;
      this.field5727 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "(FFF[F)V")
   @ObfuscatedName("vq")
   public void method10025(float var1, float var2, float var3, float[] var4) {
      this.transformPoint(var1, var2, var3, var4, 1045119330);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bj")
   public void method9940() {
      this.field5724 = 1.0F;
      this.field5736 = 0.0F;
      this.field5740 = 0.0F;
      this.field5738 = 0.0F;
      this.field5735 = 0.0F;
      this.field5725 = 1.0F;
      this.field5741 = 0.0F;
      this.field5744 = 0.0F;
      this.field5743 = 0.0F;
      this.field5739 = 0.0F;
      this.field5726 = 1.0F;
      this.field5732 = 0.0F;
      this.field5742 = 0.0F;
      this.field5737 = 0.0F;
      this.field5734 = 0.0F;
      this.field5727 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bm")
   public void method9941() {
      this.field5724 = 1.0F;
      this.field5736 = 0.0F;
      this.field5740 = 0.0F;
      this.field5738 = 0.0F;
      this.field5735 = 0.0F;
      this.field5725 = 1.0F;
      this.field5741 = 0.0F;
      this.field5744 = 0.0F;
      this.field5743 = 0.0F;
      this.field5739 = 0.0F;
      this.field5726 = 1.0F;
      this.field5732 = 0.0F;
      this.field5742 = 0.0F;
      this.field5737 = 0.0F;
      this.field5734 = 0.0F;
      this.field5727 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "(Lry;Lry;I)V")
   @ObfuscatedName("pd")
   public static void method10012(TransformationMatrix var0, TransformationMatrix var1, int var2) {
      if (var0 == null) {
         var0.method10013(var0, var2);
      }

      var0.field5724 = var1.field5724;
      var0.field5736 = var1.field5736;
      var0.field5740 = var1.field5740;
      var0.field5738 = var1.field5738;
      var0.field5735 = var1.field5735;
      var0.field5725 = var1.field5725;
      var0.field5741 = var1.field5741;
      var0.field5744 = var1.field5744;
      var0.field5743 = var1.field5743;
      var0.field5739 = var1.field5739;
      var0.field5726 = var1.field5726;
      var0.field5732 = var1.field5732;
      var0.field5742 = var1.field5742;
      var0.field5737 = var1.field5737;
      var0.field5734 = var1.field5734;
      var0.field5727 = var1.field5727;
   }

   @ObfuscatedSignature(descriptor = "(Lra;B)V")
   @ObfuscatedName("ai")
   public void method9967(class461 var1, byte var2) {
      try {
         float var3 = var1.field5501 * var1.field5501;
         float var4 = var1.field5502 * var1.field5501;
         float var5 = var1.field5499 * var1.field5501;
         float var6 = var1.field5501 * var1.field5500;
         float var7 = var1.field5502 * var1.field5502;
         float var8 = var1.field5499 * var1.field5502;
         float var9 = var1.field5502 * var1.field5500;
         float var10 = var1.field5499 * var1.field5499;
         float var11 = var1.field5500 * var1.field5499;
         float var12 = var1.field5500 * var1.field5500;
         this.field5724 = var7 + var3 - var12 - var10;
         this.field5736 = var8 + var6 + var8 + var6;
         this.field5740 = var9 + (var9 - var5 - var5);
         this.field5735 = var8 - var6 - var6 + var8;
         this.field5725 = var3 + var10 - var7 - var12;
         this.field5741 = var11 + (var4 + var11) + var4;
         this.field5743 = var5 + (var9 + (var9 + var5));
         this.field5739 = var11 - var4 - var4 + var11;
         this.field5726 = var3 + var12 - var10 - var7;
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "ry.ai(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lry;FFFF)V")
   @ObfuscatedName("tm")
   public static void method9986(TransformationMatrix var0, float var1, float var2, float var3, float var4) {
      if (var0 == null) {
         var0.method10026(var1, var1, var1);
      }

      var0.field5724 = var1;
      var0.field5736 = 0.0F;
      var0.field5740 = 0.0F;
      var0.field5738 = 0.0F;
      var0.field5735 = 0.0F;
      var0.field5725 = var2;
      var0.field5741 = 0.0F;
      var0.field5744 = 0.0F;
      var0.field5743 = 0.0F;
      var0.field5739 = 0.0F;
      var0.field5726 = var3;
      var0.field5732 = 0.0F;
      var0.field5742 = 0.0F;
      var0.field5737 = 0.0F;
      var0.field5734 = 0.0F;
      var0.field5727 = var4;
   }

   @ObfuscatedSignature(descriptor = "(FFF)F")
   @ObfuscatedName("ss")
   public float method10026(float var1, float var2, float var3) {
      return this.method9995(var1, var2, var3, -1870335324);
   }

   @ObfuscatedSignature(descriptor = "(Lry;)V")
   @ObfuscatedName("bu")
   public void method10027(TransformationMatrix var1) {
      this.method10018(var1, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bt")
   public void method9944() {
      this.field5724 = 0.0F;
      this.field5736 = 0.0F;
      this.field5740 = 0.0F;
      this.field5738 = 0.0F;
      this.field5735 = 0.0F;
      this.field5725 = 0.0F;
      this.field5741 = 0.0F;
      this.field5744 = 0.0F;
      this.field5743 = 0.0F;
      this.field5739 = 0.0F;
      this.field5726 = 0.0F;
      this.field5732 = 0.0F;
      this.field5742 = 0.0F;
      this.field5737 = 0.0F;
      this.field5734 = 0.0F;
      this.field5727 = 0.0F;
   }

   @ObfuscatedSignature(descriptor = "(Lry;)V")
   @ObfuscatedName("ba")
   public void method9946(TransformationMatrix var1) {
      System.arraycopy(var1.field5747, 0, this.field5747, 0, 16);
   }

   @ObfuscatedSignature(descriptor = "(FFF[F)V")
   @ObfuscatedName("ci")
   public void method9990(float var1, float var2, float var3, float[] var4) {
      var4[0] = this.field5742 + (var3 * this.field5743 + (this.field5724 * var1 + this.field5735 * var2));
      var4[1] = this.field5725 * var2 + var1 * this.field5736 + var3 * this.field5739 + this.field5737;
      var4[2] = this.field5734 + (this.field5740 * var1 + this.field5741 * var2 + this.field5726 * var3);
      if (var4.length > 3) {
         var4[3] = this.field5727 + (var2 * this.field5744 + this.field5738 * var1 + this.field5732 * var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lry;)V")
   @ObfuscatedName("br")
   public void method9947(TransformationMatrix var1) {
      System.arraycopy(var1.field5747, 0, this.field5747, 0, 16);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lry;Lry;)V")
   @ObfuscatedName("xt")
   public static void method9958(TransformationMatrix var0, TransformationMatrix var1) {
      float var2 = var1.field5742 * var0.field5738 + (var1.field5743 * var0.field5740 + (var0.field5724 * var1.field5724 + var1.field5735 * var0.field5736));
      float var3 = var0.field5740 * var1.field5739 + (var0.field5724 * var1.field5736 + var1.field5725 * var0.field5736) + var0.field5738 * var1.field5737;
      float var4 = var0.field5738 * var1.field5734 + (var1.field5741 * var0.field5736 + var1.field5740 * var0.field5724 + var0.field5740 * var1.field5726);
      float var5 = var0.field5738 * var1.field5727 + (var0.field5740 * var1.field5732 + (var1.field5738 * var0.field5724 + var1.field5744 * var0.field5736));
      float var6 = var0.field5741 * var1.field5743 + (var0.field5725 * var1.field5735 + var1.field5724 * var0.field5735) + var0.field5744 * var1.field5742;
      float var7 = var1.field5737 * var0.field5744 + (var0.field5725 * var1.field5725 + var1.field5736 * var0.field5735 + var0.field5741 * var1.field5739);
      float var8 = var1.field5734 * var0.field5744 + (var0.field5741 * var1.field5726 + (var1.field5740 * var0.field5735 + var0.field5725 * var1.field5741));
      float var9 = var1.field5727 * var0.field5744 + (var0.field5735 * var1.field5738 + var0.field5725 * var1.field5744 + var0.field5741 * var1.field5732);
      float var10 = var1.field5742 * var0.field5732 + (var1.field5743 * var0.field5726 + (var0.field5743 * var1.field5724 + var0.field5739 * var1.field5735));
      float var11 = var1.field5737 * var0.field5732 + (var1.field5736 * var0.field5743 + var1.field5725 * var0.field5739 + var0.field5726 * var1.field5739);
      float var12 = var1.field5734 * var0.field5732 + (var0.field5743 * var1.field5740 + var1.field5741 * var0.field5739 + var0.field5726 * var1.field5726);
      float var13 = var0.field5726 * var1.field5732 + (var0.field5739 * var1.field5744 + var0.field5743 * var1.field5738) + var0.field5732 * var1.field5727;
      float var14 = var1.field5742 * var0.field5727 + (var1.field5735 * var0.field5737 + var1.field5724 * var0.field5742 + var0.field5734 * var1.field5743);
      float var15 = var1.field5737 * var0.field5727 + (var1.field5736 * var0.field5742 + var1.field5725 * var0.field5737 + var1.field5739 * var0.field5734);
      float var16 = var0.field5727 * var1.field5734 + (var1.field5726 * var0.field5734 + (var1.field5741 * var0.field5737 + var0.field5742 * var1.field5740));
      float var17 = var0.field5734 * var1.field5732 + (var0.field5737 * var1.field5744 + var1.field5738 * var0.field5742) + var0.field5727 * var1.field5727;
      var0.field5724 = var2;
      var0.field5736 = var3;
      var0.field5740 = var4;
      var0.field5738 = var5;
      var0.field5735 = var6;
      var0.field5725 = var7;
      var0.field5741 = var8;
      var0.field5744 = var9;
      var0.field5743 = var10;
      var0.field5739 = var11;
      var0.field5726 = var12;
      var0.field5732 = var13;
      var0.field5742 = var14;
      var0.field5737 = var15;
      var0.field5734 = var16;
      var0.field5727 = var17;
   }

   @ObfuscatedSignature(descriptor = "(Lry;Lry;B)V")
   @ObfuscatedName("xy")
   public static void method9959(TransformationMatrix var0, TransformationMatrix var1, byte var2) {
      if (var0 == null) {
         var0.method9961(var0, var2);
      } else {
         try {
            float var3 = var1.field5742 * var0.field5738
               + (var1.field5743 * var0.field5740 + (var0.field5724 * var1.field5724 + var1.field5735 * var0.field5736));
            float var4 = var0.field5740 * var1.field5739
               + (var0.field5724 * var1.field5736 + var1.field5725 * var0.field5736)
               + var0.field5738 * var1.field5737;
            float var5 = var0.field5738 * var1.field5734
               + (var1.field5741 * var0.field5736 + var1.field5740 * var0.field5724 + var0.field5740 * var1.field5726);
            float var6 = var0.field5738 * var1.field5727
               + (var0.field5740 * var1.field5732 + (var1.field5738 * var0.field5724 + var1.field5744 * var0.field5736));
            float var7 = var0.field5741 * var1.field5743
               + (var0.field5725 * var1.field5735 + var1.field5724 * var0.field5735)
               + var0.field5744 * var1.field5742;
            float var8 = var1.field5737 * var0.field5744
               + (var0.field5725 * var1.field5725 + var1.field5736 * var0.field5735 + var0.field5741 * var1.field5739);
            float var9 = var1.field5734 * var0.field5744
               + (var0.field5741 * var1.field5726 + (var1.field5740 * var0.field5735 + var0.field5725 * var1.field5741));
            float var10 = var1.field5727 * var0.field5744
               + (var0.field5735 * var1.field5738 + var0.field5725 * var1.field5744 + var0.field5741 * var1.field5732);
            float var11 = var1.field5742 * var0.field5732
               + (var1.field5743 * var0.field5726 + (var0.field5743 * var1.field5724 + var0.field5739 * var1.field5735));
            float var12 = var1.field5737 * var0.field5732
               + (var1.field5736 * var0.field5743 + var1.field5725 * var0.field5739 + var0.field5726 * var1.field5739);
            float var13 = var1.field5734 * var0.field5732
               + (var0.field5743 * var1.field5740 + var1.field5741 * var0.field5739 + var0.field5726 * var1.field5726);
            float var14 = var0.field5726 * var1.field5732
               + (var0.field5739 * var1.field5744 + var0.field5743 * var1.field5738)
               + var0.field5732 * var1.field5727;
            float var15 = var1.field5742 * var0.field5727
               + (var1.field5735 * var0.field5737 + var1.field5724 * var0.field5742 + var0.field5734 * var1.field5743);
            float var16 = var1.field5737 * var0.field5727
               + (var1.field5736 * var0.field5742 + var1.field5725 * var0.field5737 + var1.field5739 * var0.field5734);
            float var17 = var0.field5727 * var1.field5734
               + (var1.field5726 * var0.field5734 + (var1.field5741 * var0.field5737 + var0.field5742 * var1.field5740));
            float var18 = var0.field5734 * var1.field5732
               + (var0.field5737 * var1.field5744 + var1.field5738 * var0.field5742)
               + var0.field5727 * var1.field5727;
            var0.field5724 = var3;
            var0.field5736 = var4;
            var0.field5740 = var5;
            var0.field5738 = var6;
            var0.field5735 = var7;
            var0.field5725 = var8;
            var0.field5741 = var9;
            var0.field5744 = var10;
            var0.field5743 = var11;
            var0.field5739 = var12;
            var0.field5726 = var13;
            var0.field5732 = var14;
            var0.field5742 = var15;
            var0.field5737 = var16;
            var0.field5734 = var17;
            var0.field5727 = var18;
         } catch (RuntimeException var19) {
            throw RestClientThreadFactory.newRunException(var19, "ry.az(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lry;)V")
   @ObfuscatedName("bm")
   public void method9948(TransformationMatrix var1) {
      System.arraycopy(var1.field5747, 0, this.field5747, 0, 16);
   }

   @ObfuscatedSignature(descriptor = "(Lry;B)V")
   @ObfuscatedName("ld")
   public static void method9929(TransformationMatrix var0, byte var1) {
      if (var0 == null) {
         var0.method9930(var1);
      } else {
         try {
            synchronized (field5731) {
               if (-1539552615 * field5729 < 604480705 * field5730) {
                  if (var1 != 1) {
                     throw new IllegalStateException();
                  }

                  field5731[(field5729 += -794138199) * -1539552615 - 1] = var0;
               }
            }
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "ry.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("zw")
   public void method10028() {
      method9929(this, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(F)V")
   @ObfuscatedName("bw")
   public void method9951(float var1) {
      method9953(this, var1, var1, var1, 1988682616);
   }

   @ObfuscatedSignature(descriptor = "(Lrq;B)V")
   @ObfuscatedName("as")
   public void method9972(class463 var1, byte var2) {
      try {
         this.field5724 = var1.field5692;
         this.field5736 = var1.field5690;
         this.field5740 = var1.field5685;
         this.field5738 = 0.0F;
         this.field5735 = var1.field5688;
         this.field5725 = var1.field5684;
         this.field5741 = var1.field5686;
         this.field5744 = 0.0F;
         this.field5743 = var1.field5687;
         this.field5739 = var1.field5693;
         this.field5726 = var1.field5689;
         this.field5732 = 0.0F;
         this.field5742 = var1.field5694;
         this.field5737 = var1.field5691;
         this.field5734 = var1.field5695;
         this.field5727 = 1.0F;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ry.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("la")
   public void method10029() {
      method9943(this, 821498803);
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bn")
   public void method9952(float var1, float var2, float var3) {
      this.method9938((byte)6);
      this.field5724 = var1;
      this.field5725 = var2;
      this.field5726 = var3;
   }

   @ObfuscatedSignature(descriptor = "(Lry;)V")
   @ObfuscatedName("tm")
   public void method9956(TransformationMatrix var1) {
      for (int var2 = 0; var2 < this.field5747.length; var2++) {
         this.field5747[var2] = this.field5747[var2] + var1.field5747[var2];
      }
   }

   @ObfuscatedSignature(descriptor = "(Lry;FFFI)V")
   @ObfuscatedName("ki")
   public static void method9953(TransformationMatrix var0, float var1, float var2, float var3, int var4) {
      if (var0 == null) {
         var0.method9955(var1, var1, var1, var4);
      } else {
         try {
            var0.method9938((byte)6);
            var0.field5724 = var1;
            var0.field5725 = var2;
            var0.field5726 = var3;
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "ry.ay(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lry;)V")
   @ObfuscatedName("bd")
   public void method9957(TransformationMatrix var1) {
      for (int var2 = 0; var2 < this.field5747.length; var2++) {
         this.field5747[var2] = this.field5747[var2] + var1.field5747[var2];
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("tq")
   public void method10030() {
      this.method9938((byte)6);
   }

   @ObfuscatedSignature(descriptor = "()Lry;")
   @ObfuscatedName("my")
   public static TransformationMatrix method10019() {
      synchronized (field5731) {
         if (field5729 * -1539552615 == 0) {
            return new TransformationMatrix();
         } else {
            TransformationMatrix[] var10000 = field5731;
            int var10001 = field5729 * -1539552615 - 1;
            field5729 = (field5729 * -1539552615 - 1) * -794138199;
            TransformationMatrix var1 = var10000[var10001];
            var1.method10030();
            return var1;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("he")
   public boolean method10005(Object var1) {
      if (!(var1 instanceof TransformationMatrix)) {
         return false;
      } else {
         TransformationMatrix var2 = (TransformationMatrix)var1;

         for (int var3 = 0; var3 < 16; var3++) {
            if (this.field5747[var3] != var2.field5747[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrf;)V")
   @ObfuscatedName("bc")
   public void method9964(class456 var1) {
      float var2 = var1.field5516.field5501 * var1.field5516.field5501;
      float var3 = var1.field5516.field5502 * var1.field5516.field5501;
      float var4 = var1.field5516.field5499 * var1.field5516.field5501;
      float var5 = var1.field5516.field5501 * var1.field5516.field5500;
      float var6 = var1.field5516.field5502 * var1.field5516.field5502;
      float var7 = var1.field5516.field5502 * var1.field5516.field5499;
      float var8 = var1.field5516.field5500 * var1.field5516.field5502;
      float var9 = var1.field5516.field5499 * var1.field5516.field5499;
      float var10 = var1.field5516.field5499 * var1.field5516.field5500;
      float var11 = var1.field5516.field5500 * var1.field5516.field5500;
      this.field5724 = var6 + var2 - var11 - var9;
      this.field5736 = var5 + (var5 + var7 + var7);
      this.field5740 = var8 + (var8 - var4 - var4);
      this.field5735 = var7 - var5 - var5 + var7;
      this.field5725 = var2 + var9 - var6 - var11;
      this.field5741 = var3 + (var10 + var3 + var10);
      this.field5743 = var4 + (var8 + var4 + var8);
      this.field5739 = var10 + (var10 - var3 - var3);
      this.field5726 = var11 + var2 - var9 - var6;
      float[] var12 = this.field5747;
      float[] var13 = this.field5747;
      this.field5732 = 0.0F;
      var13[7] = 0.0F;
      var12[3] = 0.0F;
      this.field5742 = var1.field5515.x;
      this.field5737 = var1.field5515.z;
      this.field5734 = var1.field5515.y;
      this.field5727 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "(Lrq;)V")
   @ObfuscatedName("cb")
   public void method9973(class463 var1) {
      this.field5724 = var1.field5692;
      this.field5736 = var1.field5690;
      this.field5740 = var1.field5685;
      this.field5738 = 0.0F;
      this.field5735 = var1.field5688;
      this.field5725 = var1.field5684;
      this.field5741 = var1.field5686;
      this.field5744 = 0.0F;
      this.field5743 = var1.field5687;
      this.field5739 = var1.field5693;
      this.field5726 = var1.field5689;
      this.field5732 = 0.0F;
      this.field5742 = var1.field5694;
      this.field5737 = var1.field5691;
      this.field5734 = var1.field5695;
      this.field5727 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "(FFF)F")
   @ObfuscatedName("ka")
   public float method10031(float var1, float var2, float var3) {
      return this.method9996(var1, var2, var3, (byte)-34);
   }

   @ObfuscatedSignature(descriptor = "(Lrf;)V")
   @ObfuscatedName("bx")
   public void method9965(class456 var1) {
      float var2 = var1.field5516.field5501 * var1.field5516.field5501;
      float var3 = var1.field5516.field5502 * var1.field5516.field5501;
      float var4 = var1.field5516.field5499 * var1.field5516.field5501;
      float var5 = var1.field5516.field5501 * var1.field5516.field5500;
      float var6 = var1.field5516.field5502 * var1.field5516.field5502;
      float var7 = var1.field5516.field5502 * var1.field5516.field5499;
      float var8 = var1.field5516.field5500 * var1.field5516.field5502;
      float var9 = var1.field5516.field5499 * var1.field5516.field5499;
      float var10 = var1.field5516.field5499 * var1.field5516.field5500;
      float var11 = var1.field5516.field5500 * var1.field5516.field5500;
      this.field5724 = var6 + var2 - var11 - var9;
      this.field5736 = var5 + (var5 + var7 + var7);
      this.field5740 = var8 + (var8 - var4 - var4);
      this.field5735 = var7 - var5 - var5 + var7;
      this.field5725 = var2 + var9 - var6 - var11;
      this.field5741 = var3 + (var10 + var3 + var10);
      this.field5743 = var4 + (var8 + var4 + var8);
      this.field5739 = var10 + (var10 - var3 - var3);
      this.field5726 = var11 + var2 - var9 - var6;
      float[] var12 = this.field5747;
      float[] var13 = this.field5747;
      this.field5732 = 0.0F;
      var13[7] = 0.0F;
      var12[3] = 0.0F;
      this.field5742 = var1.field5515.x;
      this.field5737 = var1.field5515.z;
      this.field5734 = var1.field5515.y;
      this.field5727 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "(Lrf;)V")
   @ObfuscatedName("bq")
   public void method9966(class456 var1) {
      float var2 = var1.field5516.field5501 * var1.field5516.field5501;
      float var3 = var1.field5516.field5502 * var1.field5516.field5501;
      float var4 = var1.field5516.field5499 * var1.field5516.field5501;
      float var5 = var1.field5516.field5501 * var1.field5516.field5500;
      float var6 = var1.field5516.field5502 * var1.field5516.field5502;
      float var7 = var1.field5516.field5502 * var1.field5516.field5499;
      float var8 = var1.field5516.field5500 * var1.field5516.field5502;
      float var9 = var1.field5516.field5499 * var1.field5516.field5499;
      float var10 = var1.field5516.field5499 * var1.field5516.field5500;
      float var11 = var1.field5516.field5500 * var1.field5516.field5500;
      this.field5724 = var6 + var2 - var11 - var9;
      this.field5736 = var5 + (var5 + var7 + var7);
      this.field5740 = var8 + (var8 - var4 - var4);
      this.field5735 = var7 - var5 - var5 + var7;
      this.field5725 = var2 + var9 - var6 - var11;
      this.field5741 = var3 + (var10 + var3 + var10);
      this.field5743 = var4 + (var8 + var4 + var8);
      this.field5739 = var10 + (var10 - var3 - var3);
      this.field5726 = var11 + var2 - var9 - var6;
      float[] var12 = this.field5747;
      float[] var13 = this.field5747;
      this.field5732 = 0.0F;
      var13[7] = 0.0F;
      var12[3] = 0.0F;
      this.field5742 = var1.field5515.x;
      this.field5737 = var1.field5515.z;
      this.field5734 = var1.field5515.y;
      this.field5727 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "(FFF)F")
   @ObfuscatedName("cy")
   public float method9998(float var1, float var2, float var3) {
      return this.field5741 * var2 + this.field5740 * var1 + this.field5726 * var3 + this.field5734;
   }

   @ObfuscatedSignature(descriptor = "(Lrq;)V")
   @ObfuscatedName("km")
   public void method10032(class463 var1) {
      this.method9972(var1, (byte)-52);
   }

   @ObfuscatedSignature(descriptor = "(Lra;)V")
   @ObfuscatedName("ce")
   public void method9968(class461 var1) {
      float var2 = var1.field5501 * var1.field5501;
      float var3 = var1.field5502 * var1.field5501;
      float var4 = var1.field5499 * var1.field5501;
      float var5 = var1.field5501 * var1.field5500;
      float var6 = var1.field5502 * var1.field5502;
      float var7 = var1.field5499 * var1.field5502;
      float var8 = var1.field5502 * var1.field5500;
      float var9 = var1.field5499 * var1.field5499;
      float var10 = var1.field5500 * var1.field5499;
      float var11 = var1.field5500 * var1.field5500;
      this.field5724 = var6 + var2 - var11 - var9;
      this.field5736 = var7 + var5 + var7 + var5;
      this.field5740 = var8 + (var8 - var4 - var4);
      this.field5735 = var7 - var5 - var5 + var7;
      this.field5725 = var2 + var9 - var6 - var11;
      this.field5741 = var10 + (var3 + var10) + var3;
      this.field5743 = var4 + (var8 + (var8 + var4));
      this.field5739 = var10 - var3 - var3 + var10;
      this.field5726 = var2 + var11 - var9 - var6;
   }

   @ObfuscatedSignature(descriptor = "(Lra;)V")
   @ObfuscatedName("cu")
   public void method9969(class461 var1) {
      float var2 = var1.field5501 * var1.field5501;
      float var3 = var1.field5502 * var1.field5501;
      float var4 = var1.field5499 * var1.field5501;
      float var5 = var1.field5501 * var1.field5500;
      float var6 = var1.field5502 * var1.field5502;
      float var7 = var1.field5499 * var1.field5502;
      float var8 = var1.field5502 * var1.field5500;
      float var9 = var1.field5499 * var1.field5499;
      float var10 = var1.field5500 * var1.field5499;
      float var11 = var1.field5500 * var1.field5500;
      this.field5724 = var6 + var2 - var11 - var9;
      this.field5736 = var7 + var5 + var7 + var5;
      this.field5740 = var8 + (var8 - var4 - var4);
      this.field5735 = var7 - var5 - var5 + var7;
      this.field5725 = var2 + var9 - var6 - var11;
      this.field5741 = var10 + (var3 + var10) + var3;
      this.field5743 = var4 + (var8 + (var8 + var4));
      this.field5739 = var10 - var3 - var3 + var10;
      this.field5726 = var2 + var11 - var9 - var6;
   }

   @ObfuscatedSignature(descriptor = "(Lrq;)V")
   @ObfuscatedName("ct")
   public void method9974(class463 var1) {
      this.field5724 = var1.field5692;
      this.field5736 = var1.field5690;
      this.field5740 = var1.field5685;
      this.field5738 = 0.0F;
      this.field5735 = var1.field5688;
      this.field5725 = var1.field5684;
      this.field5741 = var1.field5686;
      this.field5744 = 0.0F;
      this.field5743 = var1.field5687;
      this.field5739 = var1.field5693;
      this.field5726 = var1.field5689;
      this.field5732 = 0.0F;
      this.field5742 = var1.field5694;
      this.field5737 = var1.field5691;
      this.field5734 = var1.field5695;
      this.field5727 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "(FFF)F")
   @ObfuscatedName("cv")
   public float method10033(float var1, float var2, float var3) {
      return this.method9997(var1, var2, var3, (short)1603);
   }

   @ObfuscatedSignature(descriptor = "(B)[F")
   @ObfuscatedName("an")
   float[] method9933(byte var1) {
      try {
         float[] var2 = new float[3];
         if (this.field5740 < 0.999) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            if (this.field5740 > -0.999) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               var2[1] = (float)(-Math.asin(this.field5740));
               double var3 = Math.cos(var2[1]);
               var2[0] = (float)Math.atan2(this.field5741 / var3, this.field5726 / var3);
               var2[2] = (float)Math.atan2(this.field5736 / var3, this.field5724 / var3);
               return var2;
            }
         }

         var2[0] = 0.0F;
         var2[1] = (float)Math.atan2(this.field5740, 0.0);
         var2[2] = (float)Math.atan2(-this.field5739, this.field5725);
         return var2;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ry.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrf;)V")
   @ObfuscatedName("ex")
   public void method10034(class456 var1) {
      this.method10017(var1, (byte)36);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lry;)Ljava/lang/String;")
   @ObfuscatedName("ou")
   public static String method10001(TransformationMatrix var0) {
      if (var0 == null) {
         var0.method10029();
      }

      StringBuilder var1 = new StringBuilder();
      var0.method9935(1609678128);
      var0.method9933((byte)1);

      for (int var2 = 0; var2 < 4; var2++) {
         for (int var3 = 0; var3 < 4; var3++) {
            if (var3 > 0) {
               var1.append("\t");
            }

            float var4 = var0.field5747[var3 + var2 * 4];
            if (Math.sqrt(var4 * var4) < 1.0E-4F) {
               var4 = 0.0F;
            }

            var1.append(var4);
         }

         var1.append("\n");
      }

      return var1.toString();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ho")
   public void method10035() {
      this.method9982(-64629359);
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("cn")
   float method9977() {
      return this.field5734 * (this.field5738 * this.field5725 * this.field5743)
         + (
            this.field5725 * this.field5740 * this.field5732 * this.field5742
               + (
                  this.field5742 * (this.field5744 * this.field5736 * this.field5726)
                     + (
                        this.field5736 * this.field5735 * this.field5732 * this.field5734
                           + (
                              this.field5739 * (this.field5744 * this.field5724) * this.field5734
                                 + (
                                    this.field5726 * (this.field5724 * this.field5725) * this.field5727
                                       - this.field5724 * this.field5725 * this.field5732 * this.field5734
                                       - this.field5739 * (this.field5741 * this.field5724) * this.field5727
                                       + this.field5737 * (this.field5741 * this.field5724 * this.field5732)
                                 )
                                 - this.field5726 * (this.field5724 * this.field5744) * this.field5737
                                 - this.field5727 * (this.field5736 * this.field5735 * this.field5726)
                           )
                           + this.field5743 * (this.field5741 * this.field5736) * this.field5727
                           - this.field5742 * (this.field5732 * (this.field5741 * this.field5736))
                           - this.field5734 * (this.field5743 * (this.field5744 * this.field5736))
                     )
                     + this.field5740 * this.field5735 * this.field5739 * this.field5727
                     - this.field5732 * (this.field5735 * this.field5740) * this.field5737
                     - this.field5743 * (this.field5740 * this.field5725) * this.field5727
               )
               + this.field5737 * (this.field5744 * this.field5740 * this.field5743)
               - this.field5742 * (this.field5739 * (this.field5740 * this.field5744))
               - this.field5735 * this.field5738 * this.field5739 * this.field5734
               + this.field5735 * this.field5738 * this.field5726 * this.field5737
         )
         - this.field5742 * (this.field5725 * this.field5738 * this.field5726)
         - this.field5743 * (this.field5741 * this.field5738) * this.field5737
         + this.field5742 * (this.field5741 * this.field5738 * this.field5739);
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("co")
   float method9978() {
      return this.field5734 * (this.field5738 * this.field5725 * this.field5743)
         + (
            this.field5725 * this.field5740 * this.field5732 * this.field5742
               + (
                  this.field5742 * (this.field5744 * this.field5736 * this.field5726)
                     + (
                        this.field5736 * this.field5735 * this.field5732 * this.field5734
                           + (
                              this.field5739 * (this.field5744 * this.field5724) * this.field5734
                                 + (
                                    this.field5726 * (this.field5724 * this.field5725) * this.field5727
                                       - this.field5724 * this.field5725 * this.field5732 * this.field5734
                                       - this.field5739 * (this.field5741 * this.field5724) * this.field5727
                                       + this.field5737 * (this.field5741 * this.field5724 * this.field5732)
                                 )
                                 - this.field5726 * (this.field5724 * this.field5744) * this.field5737
                                 - this.field5727 * (this.field5736 * this.field5735 * this.field5726)
                           )
                           + this.field5743 * (this.field5741 * this.field5736) * this.field5727
                           - this.field5742 * (this.field5732 * (this.field5741 * this.field5736))
                           - this.field5734 * (this.field5743 * (this.field5744 * this.field5736))
                     )
                     + this.field5740 * this.field5735 * this.field5739 * this.field5727
                     - this.field5732 * (this.field5735 * this.field5740) * this.field5737
                     - this.field5743 * (this.field5740 * this.field5725) * this.field5727
               )
               + this.field5737 * (this.field5744 * this.field5740 * this.field5743)
               - this.field5742 * (this.field5739 * (this.field5740 * this.field5744))
               - this.field5735 * this.field5738 * this.field5739 * this.field5734
               + this.field5735 * this.field5738 * this.field5726 * this.field5737
         )
         - this.field5742 * (this.field5725 * this.field5738 * this.field5726)
         - this.field5743 * (this.field5741 * this.field5738) * this.field5737
         + this.field5742 * (this.field5741 * this.field5738 * this.field5739);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lry;)[F")
   @ObfuscatedName("nb")
   public static float[] method9937(TransformationMatrix var0) {
      if (var0 == null) {
         var0.method9941();
      }

      float[] var1 = new float[]{(float)(-Math.asin(var0.field5741)), 0.0F, 0.0F};
      double var2 = Math.cos(var1[0]);
      if (Math.abs(var2) > 0.005) {
         double var4 = var0.field5740;
         double var6 = var0.field5726;
         double var8 = var0.field5735;
         double var10 = var0.field5725;
         var1[1] = (float)Math.atan2(var4, var6);
         var1[2] = (float)Math.atan2(var8, var10);
      } else {
         double var12 = var0.field5736;
         double var13 = var0.field5724;
         if (var0.field5741 < 0.0F) {
            var1[1] = (float)Math.atan2(var12, var13);
         } else {
            var1[1] = (float)(-Math.atan2(var12, var13));
         }

         var1[2] = 0.0F;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cx")
   public void method9983() {
      float var1 = 1.0F / this.method9976((byte)8);
      float var2 = var1
         * (
            this.field5737 * (this.field5732 * this.field5741)
               + (
                  this.field5727 * (this.field5725 * this.field5726)
                     - this.field5725 * this.field5732 * this.field5734
                     - this.field5727 * (this.field5741 * this.field5739)
               )
               + this.field5739 * this.field5744 * this.field5734
               - this.field5737 * (this.field5744 * this.field5726)
         );
      float var3 = (
            this.field5726 * -this.field5736 * this.field5727
               + this.field5734 * (this.field5736 * this.field5732)
               + this.field5740 * this.field5739 * this.field5727
               - this.field5737 * (this.field5732 * this.field5740)
               - this.field5734 * (this.field5739 * this.field5738)
               + this.field5726 * this.field5738 * this.field5737
         )
         * var1;
      float var4 = (
            this.field5734 * (this.field5738 * this.field5725)
               + (
                  this.field5727 * (this.field5736 * this.field5741)
                     - this.field5736 * this.field5744 * this.field5734
                     - this.field5725 * this.field5740 * this.field5727
                     + this.field5737 * (this.field5744 * this.field5740)
               )
               - this.field5737 * (this.field5738 * this.field5741)
         )
         * var1;
      float var5 = (
            this.field5741 * this.field5738 * this.field5739
               + (
                  this.field5741 * -this.field5736 * this.field5732
                     + this.field5726 * (this.field5744 * this.field5736)
                     + this.field5732 * (this.field5725 * this.field5740)
                     - this.field5739 * (this.field5744 * this.field5740)
                     - this.field5726 * (this.field5738 * this.field5725)
               )
         )
         * var1;
      float var6 = (
            this.field5742 * (this.field5726 * this.field5744)
               + (
                  this.field5734 * (this.field5732 * this.field5735)
                     + this.field5727 * (this.field5726 * -this.field5735)
                     + this.field5743 * this.field5741 * this.field5727
                     - this.field5741 * this.field5732 * this.field5742
                     - this.field5743 * this.field5744 * this.field5734
               )
         )
         * var1;
      float var7 = (
            this.field5734 * (this.field5738 * this.field5743)
               + (
                  this.field5742 * (this.field5740 * this.field5732)
                     + (
                        this.field5724 * this.field5726 * this.field5727
                           - this.field5734 * (this.field5724 * this.field5732)
                           - this.field5740 * this.field5743 * this.field5727
                     )
               )
               - this.field5726 * this.field5738 * this.field5742
         )
         * var1;
      float var8 = var1
         * (
            this.field5727 * (this.field5740 * this.field5735)
               + (this.field5734 * (this.field5724 * this.field5744) + -this.field5724 * this.field5741 * this.field5727)
               - this.field5742 * (this.field5740 * this.field5744)
               - this.field5738 * this.field5735 * this.field5734
               + this.field5738 * this.field5741 * this.field5742
         );
      float var9 = var1
         * (
            this.field5741 * this.field5724 * this.field5732
               - this.field5726 * (this.field5744 * this.field5724)
               - this.field5740 * this.field5735 * this.field5732
               + this.field5743 * (this.field5740 * this.field5744)
               + this.field5726 * (this.field5735 * this.field5738)
               - this.field5741 * this.field5738 * this.field5743
         );
      float var10 = var1
         * (
            this.field5742 * (this.field5732 * this.field5725)
               + (
                  this.field5739 * this.field5735 * this.field5727
                     - this.field5737 * (this.field5735 * this.field5732)
                     - this.field5743 * this.field5725 * this.field5727
               )
               + this.field5744 * this.field5743 * this.field5737
               - this.field5742 * (this.field5744 * this.field5739)
         );
      float var11 = var1
         * (
            this.field5739 * -this.field5724 * this.field5727
               + this.field5732 * this.field5724 * this.field5737
               + this.field5727 * (this.field5736 * this.field5743)
               - this.field5736 * this.field5732 * this.field5742
               - this.field5743 * this.field5738 * this.field5737
               + this.field5742 * (this.field5739 * this.field5738)
         );
      float var12 = var1
         * (
            this.field5742 * (this.field5744 * this.field5736)
               + (
                  this.field5727 * (this.field5724 * this.field5725)
                     - this.field5724 * this.field5744 * this.field5737
                     - this.field5736 * this.field5735 * this.field5727
               )
               + this.field5737 * (this.field5738 * this.field5735)
               - this.field5742 * (this.field5725 * this.field5738)
         );
      float var13 = var1
         * (
            this.field5743 * (this.field5738 * this.field5725)
               + (
                  this.field5735 * this.field5736 * this.field5732
                     + (this.field5732 * (-this.field5724 * this.field5725) + this.field5739 * (this.field5724 * this.field5744))
                     - this.field5743 * (this.field5736 * this.field5744)
                     - this.field5738 * this.field5735 * this.field5739
               )
         );
      float var14 = (
            this.field5739 * this.field5741 * this.field5742
               + (
                  this.field5725 * this.field5743 * this.field5734
                     + (this.field5734 * (-this.field5735 * this.field5739) + this.field5726 * this.field5735 * this.field5737)
                     - this.field5726 * this.field5725 * this.field5742
                     - this.field5741 * this.field5743 * this.field5737
               )
         )
         * var1;
      float var15 = var1
         * (
            this.field5742 * (this.field5736 * this.field5726)
               + (
                  this.field5734 * (this.field5739 * this.field5724)
                     - this.field5726 * this.field5724 * this.field5737
                     - this.field5743 * this.field5736 * this.field5734
               )
               + this.field5743 * this.field5740 * this.field5737
               - this.field5742 * (this.field5739 * this.field5740)
         );
      float var16 = var1
         * (
            this.field5742 * (this.field5725 * this.field5740)
               + (
                  this.field5741 * this.field5724 * this.field5737
                     + this.field5725 * -this.field5724 * this.field5734
                     + this.field5734 * (this.field5735 * this.field5736)
                     - this.field5742 * (this.field5736 * this.field5741)
                     - this.field5737 * (this.field5740 * this.field5735)
               )
         );
      float var17 = (
            this.field5740 * this.field5735 * this.field5739
               + (
                  this.field5743 * (this.field5741 * this.field5736)
                     + (
                        this.field5726 * (this.field5724 * this.field5725)
                           - this.field5741 * this.field5724 * this.field5739
                           - this.field5735 * this.field5736 * this.field5726
                     )
               )
               - this.field5743 * (this.field5725 * this.field5740)
         )
         * var1;
      this.field5724 = var2;
      this.field5736 = var3;
      this.field5740 = var4;
      this.field5738 = var5;
      this.field5735 = var6;
      this.field5725 = var7;
      this.field5741 = var8;
      this.field5744 = var9;
      this.field5743 = var10;
      this.field5739 = var11;
      this.field5726 = var12;
      this.field5732 = var13;
      this.field5742 = var14;
      this.field5737 = var15;
      this.field5734 = var16;
      this.field5727 = var17;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Z)V")
   @ObfuscatedName("bo")
   void method9931(Buffer var1, boolean var2) {
      if (var2) {
         class463 var3 = new class463();
         int var6 = var1.readShort((byte)-64);
         var6 &= 268032304;
         float var5 = (float)(3.834951969714103E-4 * var6);
         class463.method9764(var3, var5, -1314816461);
         int var9 = var1.readShort((byte)-42);
         var9 &= 16383;
         float var8 = (float)(var9 * 3.834951969714103E-4);
         var3.method9766(var8, -1739121717);
         int var12 = var1.readShort((byte)-34);
         var12 &= -162700652;
         float var11 = (float)(3.834951969714103E-4 * var12);
         var3.method9771(var11, 517638479);
         var3.method9775(var1.readShort((byte)-21), var1.readShort((byte)-42), var1.readShort((byte)-47), 1270641999);
         this.method9972(var3, (byte)-29);
      } else {
         for (int var13 = 0; var13 < 16; var13++) {
            this.field5747[var13] = var1.method12021(397217977);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFF[F)V")
   @ObfuscatedName("cz")
   public void method9991(float var1, float var2, float var3, float[] var4) {
      var4[0] = this.field5742 + (var3 * this.field5743 + (this.field5724 * var1 + this.field5735 * var2));
      var4[1] = this.field5725 * var2 + var1 * this.field5736 + var3 * this.field5739 + this.field5737;
      var4[2] = this.field5734 + (this.field5740 * var1 + this.field5741 * var2 + this.field5726 * var3);
      if (var4.length > 3) {
         var4[3] = this.field5727 + (var2 * this.field5744 + this.field5738 * var1 + this.field5732 * var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("bf")
   public void method9954(float var1, float var2, float var3) {
      this.method9938((byte)6);
      this.field5724 = var1;
      this.field5725 = var2;
      this.field5726 = var3;
   }

   @ObfuscatedSignature(descriptor = "(FFFFI)V")
   @ObfuscatedName("ax")
   public void method9987(float var1, float var2, float var3, float var4, int var5) {
      try {
         this.field5724 = var1;
         this.field5736 = 0.0F;
         this.field5740 = 0.0F;
         this.field5738 = 0.0F;
         this.field5735 = 0.0F;
         this.field5725 = var2;
         this.field5741 = 0.0F;
         this.field5744 = 0.0F;
         this.field5743 = 0.0F;
         this.field5739 = 0.0F;
         this.field5726 = var3;
         this.field5732 = 0.0F;
         this.field5742 = 0.0F;
         this.field5737 = 0.0F;
         this.field5734 = 0.0F;
         this.field5727 = var4;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ry.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFF)V")
   @ObfuscatedName("wq")
   public void method9988(float var1, float var2, float var3, float var4) {
      this.field5724 = var1;
      this.field5736 = 0.0F;
      this.field5740 = 0.0F;
      this.field5738 = 0.0F;
      this.field5735 = 0.0F;
      this.field5725 = var2;
      this.field5741 = 0.0F;
      this.field5744 = 0.0F;
      this.field5743 = 0.0F;
      this.field5739 = 0.0F;
      this.field5726 = var3;
      this.field5732 = 0.0F;
      this.field5742 = 0.0F;
      this.field5737 = 0.0F;
      this.field5734 = 0.0F;
      this.field5727 = var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lry;Lry;)V")
   @ObfuscatedName("du")
   public static void method9960(TransformationMatrix var0, TransformationMatrix var1) {
      float var2 = var1.field5742 * var0.field5738 + (var1.field5743 * var0.field5740 + (var0.field5724 * var1.field5724 + var1.field5735 * var0.field5736));
      float var3 = var0.field5740 * var1.field5739 + (var0.field5724 * var1.field5736 + var1.field5725 * var0.field5736) + var0.field5738 * var1.field5737;
      float var4 = var0.field5738 * var1.field5734 + (var1.field5741 * var0.field5736 + var1.field5740 * var0.field5724 + var0.field5740 * var1.field5726);
      float var5 = var0.field5738 * var1.field5727 + (var0.field5740 * var1.field5732 + (var1.field5738 * var0.field5724 + var1.field5744 * var0.field5736));
      float var6 = var0.field5741 * var1.field5743 + (var0.field5725 * var1.field5735 + var1.field5724 * var0.field5735) + var0.field5744 * var1.field5742;
      float var7 = var1.field5737 * var0.field5744 + (var0.field5725 * var1.field5725 + var1.field5736 * var0.field5735 + var0.field5741 * var1.field5739);
      float var8 = var1.field5734 * var0.field5744 + (var0.field5741 * var1.field5726 + (var1.field5740 * var0.field5735 + var0.field5725 * var1.field5741));
      float var9 = var1.field5727 * var0.field5744 + (var0.field5735 * var1.field5738 + var0.field5725 * var1.field5744 + var0.field5741 * var1.field5732);
      float var10 = var1.field5742 * var0.field5732 + (var1.field5743 * var0.field5726 + (var0.field5743 * var1.field5724 + var0.field5739 * var1.field5735));
      float var11 = var1.field5737 * var0.field5732 + (var1.field5736 * var0.field5743 + var1.field5725 * var0.field5739 + var0.field5726 * var1.field5739);
      float var12 = var1.field5734 * var0.field5732 + (var0.field5743 * var1.field5740 + var1.field5741 * var0.field5739 + var0.field5726 * var1.field5726);
      float var13 = var0.field5726 * var1.field5732 + (var0.field5739 * var1.field5744 + var0.field5743 * var1.field5738) + var0.field5732 * var1.field5727;
      float var14 = var1.field5742 * var0.field5727 + (var1.field5735 * var0.field5737 + var1.field5724 * var0.field5742 + var0.field5734 * var1.field5743);
      float var15 = var1.field5737 * var0.field5727 + (var1.field5736 * var0.field5742 + var1.field5725 * var0.field5737 + var1.field5739 * var0.field5734);
      float var16 = var0.field5727 * var1.field5734 + (var1.field5726 * var0.field5734 + (var1.field5741 * var0.field5737 + var0.field5742 * var1.field5740));
      float var17 = var0.field5734 * var1.field5732 + (var0.field5737 * var1.field5744 + var1.field5738 * var0.field5742) + var0.field5727 * var1.field5727;
      var0.field5724 = var2;
      var0.field5736 = var3;
      var0.field5740 = var4;
      var0.field5738 = var5;
      var0.field5735 = var6;
      var0.field5725 = var7;
      var0.field5741 = var8;
      var0.field5744 = var9;
      var0.field5743 = var10;
      var0.field5739 = var11;
      var0.field5726 = var12;
      var0.field5732 = var13;
      var0.field5742 = var14;
      var0.field5737 = var15;
      var0.field5734 = var16;
      var0.field5727 = var17;
   }

   @ObfuscatedSignature(descriptor = "(FFF)Lrx;")
   @ObfuscatedName("cf")
   public ProjectionCoord method9993(float var1, float var2, float var3) {
      float var4 = 1.0F / (var1 * this.field5738 + this.field5744 * var2 + var3 * this.field5732 + this.field5727);
      return FaceNormal.method6214(
         (this.field5742 + (var3 * this.field5743 + (var2 * this.field5735 + var1 * this.field5724))) * var4,
         (this.field5737 + (this.field5739 * var3 + (var2 * this.field5725 + var1 * this.field5736))) * var4,
         (this.field5726 * var3 + (var1 * this.field5740 + var2 * this.field5741) + this.field5734) * var4,
         397097333
      );
   }

   @ObfuscatedSignature(descriptor = "(Lry;)V")
   @ObfuscatedName("bi")
   public void method9949(TransformationMatrix var1) {
      System.arraycopy(var1.field5747, 0, this.field5747, 0, 16);
   }

   @ObfuscatedSignature(descriptor = "(I)[F")
   @ObfuscatedName("ae")
   public float[] method10008(int var1) {
      try {
         float[] var2 = new float[3];
         ProjectionCoord var3 = new ProjectionCoord(this.field5724, this.field5736, this.field5740);
         ProjectionCoord var4 = new ProjectionCoord(this.field5735, this.field5725, this.field5741);
         ProjectionCoord var5 = new ProjectionCoord(this.field5743, this.field5739, this.field5726);
         var2[0] = var3.method9903((byte)-17);
         var2[1] = var4.method9903((byte)-41);
         var2[2] = var5.method9903((byte)8);
         return var2;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ry.ao(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lry;)F")
   @ObfuscatedName("cj")
   public static float method9979(TransformationMatrix var0) {
      if (var0 == null) {
         var0.method9980();
      }

      return var0.field5734 * (var0.field5738 * var0.field5725 * var0.field5743)
         + (
            var0.field5725 * var0.field5740 * var0.field5732 * var0.field5742
               + (
                  var0.field5742 * (var0.field5744 * var0.field5736 * var0.field5726)
                     + (
                        var0.field5736 * var0.field5735 * var0.field5732 * var0.field5734
                           + (
                              var0.field5739 * (var0.field5744 * var0.field5724) * var0.field5734
                                 + (
                                    var0.field5726 * (var0.field5724 * var0.field5725) * var0.field5727
                                       - var0.field5724 * var0.field5725 * var0.field5732 * var0.field5734
                                       - var0.field5739 * (var0.field5741 * var0.field5724) * var0.field5727
                                       + var0.field5737 * (var0.field5741 * var0.field5724 * var0.field5732)
                                 )
                                 - var0.field5726 * (var0.field5724 * var0.field5744) * var0.field5737
                                 - var0.field5727 * (var0.field5736 * var0.field5735 * var0.field5726)
                           )
                           + var0.field5743 * (var0.field5741 * var0.field5736) * var0.field5727
                           - var0.field5742 * (var0.field5732 * (var0.field5741 * var0.field5736))
                           - var0.field5734 * (var0.field5743 * (var0.field5744 * var0.field5736))
                     )
                     + var0.field5740 * var0.field5735 * var0.field5739 * var0.field5727
                     - var0.field5732 * (var0.field5735 * var0.field5740) * var0.field5737
                     - var0.field5743 * (var0.field5740 * var0.field5725) * var0.field5727
               )
               + var0.field5737 * (var0.field5744 * var0.field5740 * var0.field5743)
               - var0.field5742 * (var0.field5739 * (var0.field5740 * var0.field5744))
               - var0.field5735 * var0.field5738 * var0.field5739 * var0.field5734
               + var0.field5735 * var0.field5738 * var0.field5726 * var0.field5737
         )
         - var0.field5742 * (var0.field5725 * var0.field5738 * var0.field5726)
         - var0.field5743 * (var0.field5741 * var0.field5738) * var0.field5737
         + var0.field5742 * (var0.field5741 * var0.field5738 * var0.field5739);
   }

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("cr")
   public float[] method10009() {
      float[] var1 = new float[3];
      ProjectionCoord var2 = new ProjectionCoord(this.field5724, this.field5736, this.field5740);
      ProjectionCoord var3 = new ProjectionCoord(this.field5735, this.field5725, this.field5741);
      ProjectionCoord var4 = new ProjectionCoord(this.field5743, this.field5739, this.field5726);
      var1[0] = var2.method9903((byte)9);
      var1[1] = var3.method9903((byte)-43);
      var1[2] = var4.method9903((byte)-94);
      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lry;)[F")
   @ObfuscatedName("dl")
   public static float[] method9934(TransformationMatrix var0) {
      if (var0 == null) {
         var0.method10002();
      }

      float[] var1 = new float[3];
      if (var0.field5740 < 0.999 && var0.field5740 > -0.999) {
         var1[1] = (float)(-Math.asin(var0.field5740));
         double var2 = Math.cos(var1[1]);
         var1[0] = (float)Math.atan2(var0.field5741 / var2, var0.field5726 / var2);
         var1[2] = (float)Math.atan2(var0.field5736 / var2, var0.field5724 / var2);
      } else {
         var1[0] = 0.0F;
         var1[1] = (float)Math.atan2(var0.field5740, 0.0);
         var1[2] = (float)Math.atan2(-var0.field5739, var0.field5725);
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;)Z")
   @ObfuscatedName("ln")
   public static boolean method9985(World var0) {
      if (var0 == null) {
         var0.method888();
      }

      return (class594.field6409.rsOrdinal((byte)62) & 314071428 * var0.location) != 0;
   }

   @ObfuscatedSignature(descriptor = "(FFF)V")
   @ObfuscatedName("kx")
   public void method10036(float var1, float var2, float var3) {
      method9953(this, var1, var2, var3, 2033287157);
   }

   @ObfuscatedSignature(descriptor = "()[F")
   @ObfuscatedName("ca")
   public float[] method10010() {
      float[] var1 = new float[3];
      ProjectionCoord var2 = new ProjectionCoord(this.field5724, this.field5736, this.field5740);
      ProjectionCoord var3 = new ProjectionCoord(this.field5735, this.field5725, this.field5741);
      ProjectionCoord var4 = new ProjectionCoord(this.field5743, this.field5739, this.field5726);
      var1[0] = var2.method9903((byte)-1);
      var1[1] = var3.method9903((byte)-18);
      var1[2] = var4.method9903((byte)-64);
      return var1;
   }

   @ObfuscatedSignature(descriptor = "([F)V")
   @ObfuscatedName("mx")
   public void method10011(float[] var1) {
      var1[0] = this.field5724;
      var1[1] = this.field5736;
      var1[2] = this.field5740;
      var1[3] = this.field5738;
      var1[4] = this.field5735;
      var1[5] = this.field5725;
      var1[6] = this.field5741;
      var1[7] = this.field5744;
      var1[8] = this.field5743;
      var1[9] = this.field5739;
      var1[10] = this.field5726;
      var1[11] = this.field5732;
      var1[12] = this.field5742;
      var1[13] = this.field5737;
      var1[14] = this.field5734;
      var1[15] = this.field5727;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("at")
   public void method9930(byte var1) {
      try {
         synchronized (field5731) {
            if (-1539552615 * field5729 < 604480705 * field5730) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               field5731[(field5729 += -794138199) * -1539552615 - 1] = this;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ry.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   public void method9945(int var1) {
      try {
         this.field5734 = 0.0F;
         this.field5736 = 0.0F;
         this.field5727 = 0.0F;
         this.field5741 = 0.0F;
         this.field5738 = 0.0F;
         this.field5741 = 0.0F;
         this.field5739 = 0.0F;
         this.field5724 = 0.0F;
         this.field5732 = 0.0F;
         this.field5737 = 0.0F;
         this.field5740 = 0.0F;
         this.field5739 = 0.0F;
         this.field5742 = 0.0F;
         this.field5735 = 0.0F;
         this.field5743 = 0.0F;
         this.field5727 = 0.0F;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ry.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFI)V")
   @ObfuscatedName("ay")
   public void method9955(float var1, float var2, float var3, int var4) {
      try {
         this.method9938((byte)6);
         this.field5744 = var1;
         this.field5736 = var2;
         this.field5743 = var3;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ry.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lry;B)V")
   @ObfuscatedName("az")
   public void method9961(TransformationMatrix var1, byte var2) {
      try {
         float var3 = var1.field5735 * this.field5741 + (var1.field5737 * this.field5744 + (this.field5742 * var1.field5738 + var1.field5740 * this.field5736));
         float var4 = this.field5734 * var1.field5743 + (this.field5741 * var1.field5741 + var1.field5743 * this.field5727) + this.field5732 * var1.field5727;
         float var5 = this.field5727 * var1.field5727 + (var1.field5726 * this.field5741 + var1.field5739 * this.field5732 + this.field5727 * var1.field5736);
         float var6 = this.field5740 * var1.field5740 + (this.field5724 * var1.field5744 + (var1.field5741 * this.field5740 + var1.field5726 * this.field5738));
         float var7 = this.field5739 * var1.field5743 + (this.field5727 * var1.field5735 + var1.field5740 * this.field5738) + this.field5734 * var1.field5740;
         float var8 = var1.field5738 * this.field5738 + (this.field5727 * var1.field5740 + var1.field5740 * this.field5741 + this.field5724 * var1.field5726);
         float var9 = var1.field5735 * this.field5741 + (this.field5737 * var1.field5742 + (var1.field5724 * this.field5727 + this.field5727 * var1.field5724));
         float var10 = var1.field5738 * this.field5724 + (this.field5740 * var1.field5724 + this.field5724 * var1.field5725 + this.field5727 * var1.field5724);
         float var11 = var1.field5734 * this.field5736
            + (var1.field5736 * this.field5727 + (this.field5743 * var1.field5740 + this.field5742 * var1.field5744));
         float var12 = var1.field5725 * this.field5724 + (var1.field5727 * this.field5743 + var1.field5734 * this.field5734 + this.field5743 * var1.field5740);
         float var13 = var1.field5739 * this.field5725 + (this.field5738 * var1.field5742 + var1.field5736 * this.field5743 + this.field5738 * var1.field5740);
         float var14 = this.field5726 * var1.field5732 + (this.field5740 * var1.field5726 + this.field5735 * var1.field5739) + this.field5737 * var1.field5726;
         float var15 = var1.field5726 * this.field5740 + (var1.field5737 * this.field5744 + var1.field5727 * this.field5741 + this.field5744 * var1.field5725);
         float var16 = var1.field5740 * this.field5740 + (var1.field5735 * this.field5739 + var1.field5734 * this.field5744 + var1.field5738 * this.field5742);
         float var17 = this.field5734 * var1.field5734
            + (var1.field5726 * this.field5734 + (var1.field5725 * this.field5741 + this.field5725 * var1.field5726));
         float var18 = this.field5724 * var1.field5727 + (this.field5735 * var1.field5732 + var1.field5734 * this.field5734) + this.field5735 * var1.field5725;
         this.field5735 = var3;
         this.field5740 = var4;
         this.field5743 = var5;
         this.field5740 = var6;
         this.field5727 = var7;
         this.field5726 = var8;
         this.field5743 = var9;
         this.field5725 = var10;
         this.field5742 = var11;
         this.field5740 = var12;
         this.field5738 = var13;
         this.field5743 = var14;
         this.field5742 = var15;
         this.field5727 = var16;
         this.field5727 = var17;
         this.field5727 = var18;
      } catch (RuntimeException var19) {
         throw RestClientThreadFactory.newRunException(var19, "ry.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lry;I)V")
   @ObfuscatedName("aw")
   public void method10013(TransformationMatrix var1, int var2) {
      this.field5741 = var1.field5734;
      this.field5724 = var1.field5738;
      this.field5742 = var1.field5726;
      this.field5727 = var1.field5739;
      this.field5738 = var1.field5738;
      this.field5732 = var1.field5734;
      this.field5736 = var1.field5734;
      this.field5738 = var1.field5734;
      this.field5744 = var1.field5740;
      this.field5739 = var1.field5735;
      this.field5737 = var1.field5738;
      this.field5740 = var1.field5744;
      this.field5727 = var1.field5726;
      this.field5744 = var1.field5740;
      this.field5724 = var1.field5735;
      this.field5744 = var1.field5739;
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("cc")
   float method9980() {
      return this.field5744 * (this.field5742 * this.field5738 * this.field5743)
         + (
            this.field5744 * this.field5726 * this.field5724 * this.field5739
               + (
                  this.field5738 * (this.field5741 * this.field5741 * this.field5743)
                     + (
                        this.field5741 * this.field5736 * this.field5724 * this.field5726
                           + (
                              this.field5744 * (this.field5740 * this.field5741) * this.field5740
                                 + (
                                    this.field5725 * (this.field5738 * this.field5742) * this.field5735
                                       - this.field5734 * this.field5725 * this.field5743 * this.field5724
                                       - this.field5726 * (this.field5734 * this.field5727) * this.field5724
                                       + this.field5738 * (this.field5737 * this.field5735 * this.field5727)
                                 )
                                 - this.field5741 * (this.field5727 * this.field5743) * this.field5739
                                 - this.field5739 * (this.field5742 * this.field5736 * this.field5734)
                           )
                           + this.field5734 * (this.field5726 * this.field5742) * this.field5734
                           - this.field5742 * (this.field5732 * (this.field5732 * this.field5732))
                           - this.field5736 * (this.field5743 * (this.field5742 * this.field5740))
                     )
                     + this.field5725 * this.field5725 * this.field5741 * this.field5726
                     - this.field5735 * (this.field5735 * this.field5734) * this.field5724
                     - this.field5725 * (this.field5739 * this.field5739) * this.field5744
               )
               + this.field5727 * (this.field5735 * this.field5725 * this.field5740)
               - this.field5741 * (this.field5724 * (this.field5740 * this.field5726))
               - this.field5740 * this.field5725 * this.field5726 * this.field5726
               + this.field5727 * this.field5742 * this.field5732 * this.field5740
         )
         - this.field5738 * (this.field5724 * this.field5737 * this.field5740)
         - this.field5734 * (this.field5727 * this.field5736) * this.field5744
         + this.field5742 * (this.field5742 * this.field5734 * this.field5735);
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("cs")
   float method9981() {
      return this.field5726 * (this.field5743 * this.field5739 * this.field5725)
         + (
            this.field5726 * this.field5726 * this.field5725 * this.field5737
               + (
                  this.field5736 * (this.field5743 * this.field5725 * this.field5735)
                     + (
                        this.field5727 * this.field5737 * this.field5732 * this.field5744
                           + (
                              this.field5724 * (this.field5737 * this.field5738) * this.field5744
                                 + (
                                    this.field5732 * (this.field5744 * this.field5742) * this.field5726
                                       - this.field5744 * this.field5726 * this.field5725 * this.field5742
                                       - this.field5742 * (this.field5724 * this.field5724) * this.field5727
                                       + this.field5738 * (this.field5732 * this.field5736 * this.field5744)
                                 )
                                 - this.field5725 * (this.field5732 * this.field5739) * this.field5734
                                 - this.field5739 * (this.field5736 * this.field5726 * this.field5741)
                           )
                           + this.field5738 * (this.field5742 * this.field5735) * this.field5725
                           - this.field5734 * (this.field5726 * (this.field5726 * this.field5727))
                           - this.field5739 * (this.field5725 * (this.field5737 * this.field5743))
                     )
                     + this.field5724 * this.field5732 * this.field5732 * this.field5743
                     - this.field5737 * (this.field5741 * this.field5732) * this.field5744
                     - this.field5744 * (this.field5735 * this.field5734) * this.field5744
               )
               + this.field5732 * (this.field5742 * this.field5727 * this.field5727)
               - this.field5743 * (this.field5724 * (this.field5732 * this.field5732))
               - this.field5744 * this.field5741 * this.field5724 * this.field5743
               + this.field5725 * this.field5737 * this.field5741 * this.field5725
         )
         - this.field5734 * (this.field5744 * this.field5726 * this.field5727)
         - this.field5738 * (this.field5732 * this.field5742) * this.field5741
         + this.field5736 * (this.field5740 * this.field5739 * this.field5739);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lry;)V")
   @ObfuscatedName("tw")
   public static void method9984(TransformationMatrix var0) {
      if (var0 == null) {
         var0.method10028();
      } else {
         float var1 = 1.0F / var0.method9976((byte)-108);
         float var2 = var1
            * (
               var0.field5737 * (var0.field5732 * var0.field5741)
                  + (
                     var0.field5727 * (var0.field5725 * var0.field5726)
                        - var0.field5725 * var0.field5732 * var0.field5734
                        - var0.field5727 * (var0.field5741 * var0.field5739)
                  )
                  + var0.field5739 * var0.field5744 * var0.field5734
                  - var0.field5737 * (var0.field5744 * var0.field5726)
            );
         float var3 = (
               var0.field5726 * -var0.field5736 * var0.field5727
                  + var0.field5734 * (var0.field5736 * var0.field5732)
                  + var0.field5740 * var0.field5739 * var0.field5727
                  - var0.field5737 * (var0.field5732 * var0.field5740)
                  - var0.field5734 * (var0.field5739 * var0.field5738)
                  + var0.field5726 * var0.field5738 * var0.field5737
            )
            * var1;
         float var4 = (
               var0.field5734 * (var0.field5738 * var0.field5725)
                  + (
                     var0.field5727 * (var0.field5736 * var0.field5741)
                        - var0.field5736 * var0.field5744 * var0.field5734
                        - var0.field5725 * var0.field5740 * var0.field5727
                        + var0.field5737 * (var0.field5744 * var0.field5740)
                  )
                  - var0.field5737 * (var0.field5738 * var0.field5741)
            )
            * var1;
         float var5 = (
               var0.field5741 * var0.field5738 * var0.field5739
                  + (
                     var0.field5741 * -var0.field5736 * var0.field5732
                        + var0.field5726 * (var0.field5744 * var0.field5736)
                        + var0.field5732 * (var0.field5725 * var0.field5740)
                        - var0.field5739 * (var0.field5744 * var0.field5740)
                        - var0.field5726 * (var0.field5738 * var0.field5725)
                  )
            )
            * var1;
         float var6 = (
               var0.field5742 * (var0.field5726 * var0.field5744)
                  + (
                     var0.field5734 * (var0.field5732 * var0.field5735)
                        + var0.field5727 * (var0.field5726 * -var0.field5735)
                        + var0.field5743 * var0.field5741 * var0.field5727
                        - var0.field5741 * var0.field5732 * var0.field5742
                        - var0.field5743 * var0.field5744 * var0.field5734
                  )
            )
            * var1;
         float var7 = (
               var0.field5734 * (var0.field5738 * var0.field5743)
                  + (
                     var0.field5742 * (var0.field5740 * var0.field5732)
                        + (
                           var0.field5724 * var0.field5726 * var0.field5727
                              - var0.field5734 * (var0.field5724 * var0.field5732)
                              - var0.field5740 * var0.field5743 * var0.field5727
                        )
                  )
                  - var0.field5726 * var0.field5738 * var0.field5742
            )
            * var1;
         float var8 = var1
            * (
               var0.field5727 * (var0.field5740 * var0.field5735)
                  + (var0.field5734 * (var0.field5724 * var0.field5744) + -var0.field5724 * var0.field5741 * var0.field5727)
                  - var0.field5742 * (var0.field5740 * var0.field5744)
                  - var0.field5738 * var0.field5735 * var0.field5734
                  + var0.field5738 * var0.field5741 * var0.field5742
            );
         float var9 = var1
            * (
               var0.field5741 * var0.field5724 * var0.field5732
                  - var0.field5726 * (var0.field5744 * var0.field5724)
                  - var0.field5740 * var0.field5735 * var0.field5732
                  + var0.field5743 * (var0.field5740 * var0.field5744)
                  + var0.field5726 * (var0.field5735 * var0.field5738)
                  - var0.field5741 * var0.field5738 * var0.field5743
            );
         float var10 = var1
            * (
               var0.field5742 * (var0.field5732 * var0.field5725)
                  + (
                     var0.field5739 * var0.field5735 * var0.field5727
                        - var0.field5737 * (var0.field5735 * var0.field5732)
                        - var0.field5743 * var0.field5725 * var0.field5727
                  )
                  + var0.field5744 * var0.field5743 * var0.field5737
                  - var0.field5742 * (var0.field5744 * var0.field5739)
            );
         float var11 = var1
            * (
               var0.field5739 * -var0.field5724 * var0.field5727
                  + var0.field5732 * var0.field5724 * var0.field5737
                  + var0.field5727 * (var0.field5736 * var0.field5743)
                  - var0.field5736 * var0.field5732 * var0.field5742
                  - var0.field5743 * var0.field5738 * var0.field5737
                  + var0.field5742 * (var0.field5739 * var0.field5738)
            );
         float var12 = var1
            * (
               var0.field5742 * (var0.field5744 * var0.field5736)
                  + (
                     var0.field5727 * (var0.field5724 * var0.field5725)
                        - var0.field5724 * var0.field5744 * var0.field5737
                        - var0.field5736 * var0.field5735 * var0.field5727
                  )
                  + var0.field5737 * (var0.field5738 * var0.field5735)
                  - var0.field5742 * (var0.field5725 * var0.field5738)
            );
         float var13 = var1
            * (
               var0.field5743 * (var0.field5738 * var0.field5725)
                  + (
                     var0.field5735 * var0.field5736 * var0.field5732
                        + (var0.field5732 * (-var0.field5724 * var0.field5725) + var0.field5739 * (var0.field5724 * var0.field5744))
                        - var0.field5743 * (var0.field5736 * var0.field5744)
                        - var0.field5738 * var0.field5735 * var0.field5739
                  )
            );
         float var14 = (
               var0.field5739 * var0.field5741 * var0.field5742
                  + (
                     var0.field5725 * var0.field5743 * var0.field5734
                        + (var0.field5734 * (-var0.field5735 * var0.field5739) + var0.field5726 * var0.field5735 * var0.field5737)
                        - var0.field5726 * var0.field5725 * var0.field5742
                        - var0.field5741 * var0.field5743 * var0.field5737
                  )
            )
            * var1;
         float var15 = var1
            * (
               var0.field5742 * (var0.field5736 * var0.field5726)
                  + (
                     var0.field5734 * (var0.field5739 * var0.field5724)
                        - var0.field5726 * var0.field5724 * var0.field5737
                        - var0.field5743 * var0.field5736 * var0.field5734
                  )
                  + var0.field5743 * var0.field5740 * var0.field5737
                  - var0.field5742 * (var0.field5739 * var0.field5740)
            );
         float var16 = var1
            * (
               var0.field5742 * (var0.field5725 * var0.field5740)
                  + (
                     var0.field5741 * var0.field5724 * var0.field5737
                        + var0.field5725 * -var0.field5724 * var0.field5734
                        + var0.field5734 * (var0.field5735 * var0.field5736)
                        - var0.field5742 * (var0.field5736 * var0.field5741)
                        - var0.field5737 * (var0.field5740 * var0.field5735)
                  )
            );
         float var17 = (
               var0.field5740 * var0.field5735 * var0.field5739
                  + (
                     var0.field5743 * (var0.field5741 * var0.field5736)
                        + (
                           var0.field5726 * (var0.field5724 * var0.field5725)
                              - var0.field5741 * var0.field5724 * var0.field5739
                              - var0.field5735 * var0.field5736 * var0.field5726
                        )
                  )
                  - var0.field5743 * (var0.field5725 * var0.field5740)
            )
            * var1;
         var0.field5724 = var2;
         var0.field5736 = var3;
         var0.field5740 = var4;
         var0.field5738 = var5;
         var0.field5735 = var6;
         var0.field5725 = var7;
         var0.field5741 = var8;
         var0.field5744 = var9;
         var0.field5743 = var10;
         var0.field5739 = var11;
         var0.field5726 = var12;
         var0.field5732 = var13;
         var0.field5742 = var14;
         var0.field5737 = var15;
         var0.field5734 = var16;
         var0.field5727 = var17;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;ZI)V")
   @ObfuscatedName("ag")
   void method10015(Buffer var1, boolean var2, int var3) {
      if (var2) {
         boolean var5 = var2;
         Buffer var4 = var1;
         TransformationMatrix var18 = this;
         int var6 = 730117099;

         try {
            if (var5) {
               class463 var7 = new class463();
               int var10 = var4.readShort((byte)-116);
               var10 &= 16383;
               float var9 = (float)(3.834951969714103E-4 * var10);
               class463.method9764(var7, var9, -1314816461);
               int var13 = var4.method12174((byte)-32);
               var13 &= 16383;
               float var12 = (float)(var13 * 3.834951969714103E-4);
               var7.method9766(var12, -1739121717);
               int var16 = var4.readUnsignedByteSub((byte)-128);
               var16 &= 16383;
               float var15 = (float)(3.834951969714103E-4 * var16);
               var7.method9771(var15, 517638479);
               var7.method9775(var4.method12174((byte)-93), var4.readShort((byte)-31), var4.readUnsignedByteSub((byte)-119), 1932432107);
               var18.method9972(var7, (byte)-52);
            } else {
               for (int var19 = 0; var19 < 16; var19++) {
                  if (var6 <= -167339330) {
                     throw new IllegalStateException();
                  }

                  var18.field5747[var19] = var4.method12021(-102499997);
               }
            }
         } catch (RuntimeException var17) {
            throw RestClientThreadFactory.newRunException(var17, "ry.ag(" + ')');
         }
      } else {
         this.field5742 = var1.method12227();
         this.field5725 = var1.method12227();
         this.field5736 = var1.method12020();
         this.field5743 = var1.method12020();
         this.field5726 = var1.method12227();
         this.field5744 = var1.method12227();
         this.field5741 = var1.method12020();
         this.field5740 = var1.method12020();
         this.field5727 = var1.method12020();
         this.field5736 = var1.method12227();
         this.field5736 = var1.method12020();
         this.field5735 = var1.method12227();
         this.field5739 = var1.method12020();
         this.field5734 = var1.method12020();
         this.field5725 = var1.method12020();
         this.field5725 = var1.method12227();
      }
   }
}
