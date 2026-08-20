import net.runelite.api.events.AnimationChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sj")
public class AnimationSequence {
   @ObfuscatedSignature(descriptor = "Liw;")
   @ObfuscatedName("ag")
   SequenceDefinition sequenceDefinition;
   @ObfuscatedName("at")
   int id = -615092759;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field5799 = 30;
   @ObfuscatedSignature(descriptor = "Lcr;")
   @ObfuscatedName("co")
   public Actor field5800;
   @ObfuscatedName("an")
   int frameCycle;
   @ObfuscatedName("ae")
   int frame;
   @ObfuscatedName("aj")
   int frameCount;
   @ObfuscatedName("ak")
   int loopCount;

   @ObfuscatedSignature(descriptor = "(Lsj;II)Z")
   @ObfuscatedName("os")
   public static boolean method10341(AnimationSequence var0, int var1, int var2) {
      if (var0 == null) {
         var0.method10343(var1, var1);
      }

      try {
         if (method10315(var0, -831296794)) {
            if (var2 != -1002405506) {
               throw new IllegalStateException();
            }

            if (-862834637 * var0.loopCount > 0) {
               if (var2 != -1002405506) {
                  throw new IllegalStateException();
               }

               if (-862834637 * var0.loopCount < var1) {
                  if (var2 != -1002405506) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sj.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("am")
   public void method10309(int var1) {
      if (var1 >= 0) {
         if (var1 != this.id * 1870316967) {
            this.id = var1 * 615092759;
            this.sequenceDefinition = ClientPacket.SequenceDefinition_get(var1, 1866679772);
            this.loopCount = 0;
            if (1756992279 * this.frame == -1) {
               this.frame = 0;
            }
         }
      } else {
         this.id = -615092759;
         this.sequenceDefinition = null;
         this.frame = 449915737;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsj;I)V")
   @ObfuscatedName("av")
   public void setSequence(AnimationSequence var1, int var2) {
      try {
         this.sequenceDefinition = var1.sequenceDefinition;
         this.id = var1.id * 1;
         this.frameCycle = 1 * var1.frameCycle;
         this.frame = 1 * var1.frame;
         this.frameCount = 1 * var1.frameCount;
         this.loopCount = 1 * var1.loopCount;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sj.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   public void reset(int var1) {
      try {
         method10313(this, -1, -1053133018);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sj.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ak")
   public int getFrame(int var1) {
      try {
         return 1756992279 * this.frame;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sj.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   public int getId(int var1) {
      try {
         return this.id * 1870316967;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sj.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("pk")
   public void method10359(int var1) {
      method10313(this, var1, -1053133018);
   }

   @ObfuscatedSignature(descriptor = "(Lsj;)V")
   @ObfuscatedName("ar")
   public void method10304(AnimationSequence var1) {
      this.sequenceDefinition = var1.sequenceDefinition;
      this.id = var1.id * 1;
      this.frameCycle = 1 * var1.frameCycle;
      this.frame = 1 * var1.frame;
      this.frameCount = 1 * var1.frameCount;
      this.loopCount = 1 * var1.loopCount;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("au")
   public void method10332(byte var1) {
      try {
         this.frame = 0;
         this.frameCycle = 0;
         this.frameCount = 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sj.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bq")
   void method10348(int var1, int var2) {
      this.frame = var1 * -449915737;
      this.frameCount = -1227346829 * var2;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   public int method10335(int var1) {
      try {
         return -862834637 * this.loopCount;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sj.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dp")
   public void method10358(int var1) {
      if (this.field5800 != null) {
         if (Actor.field1187) {
            this.field5800.field1169 = (byte)(this.field5800.field1169 | 2);
         } else {
            AnimationChanged var2 = new AnimationChanged();
            var2.setActor(this.field5800);
            SecureUrlRequester.client.getCallbacks().post(var2);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsj;I)V")
   @ObfuscatedName("qy")
   public static void method10337(AnimationSequence var0, int var1) {
      if (var0 == null) {
         var0.method10342(var1);
      }

      var0.loopCount = 1045711611 * var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("by")
   public int method10336() {
      return -862834637 * this.loopCount;
   }

   @ObfuscatedSignature(descriptor = "(Lsj;)V")
   @ObfuscatedName("al")
   public void method10305(AnimationSequence var1) {
      this.sequenceDefinition = var1.sequenceDefinition;
      this.id = var1.id * 1;
      this.frameCycle = 1 * var1.frameCycle;
      this.frame = 1 * var1.frame;
      this.frameCount = 1 * var1.frameCount;
      this.loopCount = 1 * var1.loopCount;
   }

   @ObfuscatedSignature(descriptor = "(IIIB)V")
   @ObfuscatedName("ac")
   void method10347(int var1, int var2, int var3, byte var4) {
      try {
         this.frame = var1 * -449915737;
         this.frameCycle = var2 * 314086121;
         this.frameCount = var3 * -1227346829;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "sj.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   public void method10308() {
      method10313(this, -1, 480504330);
   }

   @ObfuscatedSignature(descriptor = "(Lsj;)V")
   @ObfuscatedName("ah")
   public void method10306(AnimationSequence var1) {
      this.sequenceDefinition = var1.sequenceDefinition;
      this.id = var1.id * 1;
      this.frameCycle = 1 * var1.frameCycle;
      this.frame = 1 * var1.frame;
      this.frameCount = 1 * var1.frameCount;
      this.loopCount = 1 * var1.loopCount;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ao")
   public void method10310(int var1) {
      if (var1 >= 0) {
         if (var1 != this.id * 1870316967) {
            this.id = var1 * -1389302786;
            this.sequenceDefinition = ClientPacket.SequenceDefinition_get(var1, -1922808862);
            this.loopCount = 0;
            if (1756992279 * this.frame == -1) {
               this.frame = 0;
            }
         }
      } else {
         this.id = -615092759;
         this.sequenceDefinition = null;
         this.frame = 748189460;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("xk")
   public boolean method10360(int var1) {
      return method10341(this, var1, -1002405506);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   public void method10311(int var1) {
      if (var1 >= 0) {
         if (var1 != this.id * -1280902236) {
            this.id = var1 * 615092759;
            this.sequenceDefinition = ClientPacket.SequenceDefinition_get(var1, 1109538137);
            this.loopCount = 0;
            if (1756992279 * this.frame == -1) {
               this.frame = 0;
            }
         }
      } else {
         this.id = -615092759;
         this.sequenceDefinition = null;
         this.frame = 449915737;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsj;)V")
   @ObfuscatedName("wh")
   public static void method10354(AnimationSequence var0) {
      if (null != var0.sequenceDefinition) {
         if (!var0.sequenceDefinition.isCachedModelIdSet((byte)-8)) {
            var0.frame = (int)(Math.random() * var0.sequenceDefinition.frameIds.length) * -449915737;
            var0.frameCycle = (int)(Math.random() * var0.sequenceDefinition.frameLengths[1756992279 * var0.frame]) * 314086121;
         } else {
            var0.frame = (int)(Math.random() * var0.sequenceDefinition.getMayaAnimFrame((byte)94)) * -449915737;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aq")
   public void method10312(int var1) {
      if (var1 >= 0) {
         if (var1 != this.id * -1859559507) {
            this.id = var1 * 1150387715;
            this.sequenceDefinition = ClientPacket.SequenceDefinition_get(var1, -1819017867);
            this.loopCount = 0;
            if (1756992279 * this.frame == -1) {
               this.frame = 0;
            }
         }
      } else {
         this.id = -713918966;
         this.sequenceDefinition = null;
         this.frame = 449915737;
      }
   }

   public AnimationSequence() {
      this.sequenceDefinition = null;
      this.frame = 449915737;
      this.frameCount = 0;
      this.loopCount = 0;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("uc")
   public void method10361(int var1, int var2, int var3) {
      this.method10347(var1, var2, var3, (byte)53);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ay")
   public void method10333(byte var1) {
      try {
         this.frameCount = 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sj.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Liw;")
   @ObfuscatedName("bs")
   public SequenceDefinition method10316() {
      return this.sequenceDefinition;
   }

   @ObfuscatedSignature(descriptor = "()Liw;")
   @ObfuscatedName("bz")
   public SequenceDefinition method10317() {
      return this.sequenceDefinition;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bb")
   public int method10321() {
      return this.id * 1870316967;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bj")
   public int method10324() {
      return 1756992279 * this.frame;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bm")
   public int method10325() {
      return 1756992279 * this.frame;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bp")
   public int method10326() {
      return 25536759 * this.frame;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bt")
   public int method10327() {
      return -1148754599 * this.frameCycle;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bu")
   public int method10328() {
      return -660715667 * this.frameCycle;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   public void method10334() {
      this.frameCount = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lsj;I)I")
   @ObfuscatedName("zx")
   public static int method10329(AnimationSequence var0, int var1) {
      if (var0 == null) {
         var0.getFrameCycle(var1);
      }

      try {
         return -1148754599 * var0.frameCycle;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sj.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ad")
   void method10338(int var1, int var2) {
      try {
         this.loopCount = 1045711611 * var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sj.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bw")
   void method10339(int var1) {
      this.loopCount = 1045711611 * var1;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bx")
   void method10349(int var1, int var2) {
      this.frame = var1 * -449915737;
      this.frameCount = -1227346829 * var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("jt")
   public void method10362() {
      this.reset(1429364861);
   }

   @ObfuscatedSignature(descriptor = "(Lsj;I)Liw;")
   @ObfuscatedName("tc")
   public static SequenceDefinition method10318(AnimationSequence var0, int var1) {
      if (var0 == null) {
         var0.getSequenceDefinition(var1);
      }

      try {
         return var0.sequenceDefinition;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sj.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("as")
   public boolean method10344(int var1) {
      try {
         if (this.sequenceDefinition != null) {
            if (var1 == -1749652728) {
               throw new IllegalStateException();
            }

            if (!SequenceDefinition.method5260(this.sequenceDefinition, (byte)39)) {
               return false;
            }

            if (var1 == -1749652728) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sj.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bd")
   public boolean method10342(int var1) {
      return method10315(this, -831296794) && -862834637 * this.loopCount > 0 && -862834637 * this.loopCount < var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bh")
   public boolean method10345() {
      return this.sequenceDefinition == null || SequenceDefinition.method5260(this.sequenceDefinition, (byte)61);
   }

   @ObfuscatedSignature(descriptor = "(Lsj;S)V")
   @ObfuscatedName("bo")
   public static void method10355(AnimationSequence var0, short var1) {
      if (var0 == null) {
         var0.method10357(var1);
      }

      try {
         if (null != var0.sequenceDefinition) {
            if (var1 >= 292) {
               throw new IllegalStateException();
            }

            if (!var0.sequenceDefinition.isCachedModelIdSet((byte)-35)) {
               var0.frame = (int)(Math.random() * var0.sequenceDefinition.frameIds.length) * -449915737;
               var0.frameCycle = (int)(Math.random() * var0.sequenceDefinition.frameLengths[1756992279 * var0.frame]) * 314086121;
            } else {
               var0.frame = (int)(Math.random() * var0.sequenceDefinition.getMayaAnimFrame((byte)126)) * -449915737;
            }
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sj.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bl")
   void method10350(int var1, int var2) {
      this.frame = var1 * -449915737;
      this.frameCount = -1227346829 * var2;
   }

   @ObfuscatedSignature(descriptor = "(Lsj;IIB)V")
   @ObfuscatedName("ks")
   public static void method10351(AnimationSequence var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         var0.method10353(var1, var1, var3);
      }

      try {
         var0.frame = var1 * -449915737;
         var0.frameCount = -1227346829 * var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "sj.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bv")
   void method10352(int var1, int var2) {
      this.frame = var1 * -116846650;
      this.frameCount = -1227346829 * var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ch")
   public void method10356() {
      if (null != this.sequenceDefinition) {
         if (!this.sequenceDefinition.isCachedModelIdSet((byte)-15)) {
            this.frame = (int)(Math.random() * this.sequenceDefinition.frameIds.length) * -449915737;
            this.frameCycle = (int)(Math.random() * this.sequenceDefinition.frameLengths[1756992279 * this.frame]) * 314086121;
         } else {
            this.frame = (int)(Math.random() * this.sequenceDefinition.getMayaAnimFrame((byte)124)) * -449915737;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("an")
   public boolean isActive(int var1) {
      try {
         boolean var10000;
         if (this.sequenceDefinition != null) {
            if (var1 != -831296794) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sj.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsj;II)V")
   @ObfuscatedName("vn")
   public static void method10313(AnimationSequence var0, int var1, int var2) {
      if (var0 == null) {
         var0.setSequence(var1, var1);
      } else {
         try {
            if (var1 >= 0) {
               if (var2 == 1100383324) {
                  throw new IllegalStateException();
               }

               if (var1 != var0.id * 1870316967) {
                  if (var2 == 1100383324) {
                     throw new IllegalStateException();
                  }

                  var0.id = var1 * 615092759;
                  var0.sequenceDefinition = ClientPacket.SequenceDefinition_get(var1, 973543425);
                  var0.loopCount = 0;
                  if (1756992279 * var0.frame == -1) {
                     if (var2 == 1100383324) {
                        var0.method10358(var1);
                        return;
                     }

                     var0.frame = 0;
                  }
               }
            } else {
               var0.id = -615092759;
               var0.sequenceDefinition = null;
               var0.frame = 449915737;
            }

            var0.method10358(var1);
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "sj.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Liw;")
   @ObfuscatedName("ae")
   public SequenceDefinition getSequenceDefinition(int var1) {
      try {
         return this.sequenceDefinition;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sj.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsj;I)I")
   @ObfuscatedName("my")
   public static int method10330(AnimationSequence var0, int var1) {
      if (var0 == null) {
         var0.method10331(var1);
      }

      try {
         return 2012240059 * var0.frameCount;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sj.ap(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ap")
   int method10331(int var1) {
      try {
         return 2012240059 * this.loopCount;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sj.ap(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aw")
   public int getFrameCycle(int var1) {
      try {
         return this.id * 1870316967;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sj.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsj;I)Z")
   @ObfuscatedName("aa")
   public static boolean method10315(AnimationSequence var0, int var1) {
      if (var0 == null) {
         return var0.isActive(var1);
      } else {
         try {
            boolean var10000;
            if (var0.sequenceDefinition != null) {
               if (var1 != -831296794) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "sj.an(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ai")
   public boolean method10343(int var1, int var2) {
      try {
         if (method10315(this, -831296794)) {
            if (var2 != -1002405506) {
               throw new IllegalStateException();
            }

            if (-862834637 * this.id > 0) {
               if (var2 != -1002405506) {
                  throw new IllegalStateException();
               }

               if (-862834637 * this.frame < var1) {
                  if (var2 != -1002405506) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sj.ai(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsj;)Z")
   @ObfuscatedName("qo")
   public static boolean method10346(AnimationSequence var0) {
      return var0.sequenceDefinition == null || SequenceDefinition.method5260(var0.sequenceDefinition, (byte)9);
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("ab")
   void method10353(int var1, int var2, byte var3) {
      try {
         this.loopCount = var1 * -449915737;
         this.id = -1227346829 * var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "sj.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("ax")
   public void method10357(short var1) {
      try {
         if (null != this.sequenceDefinition) {
            if (var1 >= 292) {
               throw new IllegalStateException();
            }

            if (!this.sequenceDefinition.isCachedModelIdSet((byte)-35)) {
               this.frameCycle = (int)(Math.random() * this.sequenceDefinition.frameIds.length) * -449915737;
               this.frameCount = (int)(Math.random() * this.sequenceDefinition.frameLengths[1756992279 * this.frameCycle]) * 314086121;
            } else {
               this.loopCount = (int)(Math.random() * this.sequenceDefinition.getMayaAnimFrame((byte)126)) * -449915737;
            }
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sj.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ag")
   public void setSequence(int var1, int var2) {
      try {
         this.frame = 1045711611 * var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sj.ad(" + ')');
      }
   }
}
