import java.awt.Polygon;
import java.awt.Shape;
import javax.annotation.Nullable;
import net.runelite.api.Perspective;
import net.runelite.api.events.NpcChanged;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dv")
public final class NPC extends Actor implements net.runelite.api.NPC {
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field1501 = 12;
   @ObfuscatedName("az")
   boolean field1508;
   @ObfuscatedName("aw")
   int field1499;
   @ObfuscatedSignature(descriptor = "Lhu;")
   @ObfuscatedName("ae")
   NPCComposition definition;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field1503 = 31;
   @ObfuscatedName("ak")
   String field1497;
   @ObfuscatedSignature(descriptor = "Lha;")
   @ObfuscatedName("ay")
   NpcOverrides modelOverrides;
   @ObfuscatedSignature(descriptor = "Lxe;")
   @ObfuscatedName("ap")
   NPCOverheadIcons npcOverheadIcons;
   @ObfuscatedName("aj")
   boolean field1498 = false;
   @ObfuscatedSignature(descriptor = "Lha;")
   @ObfuscatedName("au")
   NpcOverrides chatheadOverrides;
   @ObfuscatedName("ag")
   static int field1496 = -1404432765;
   @ObfuscatedName("at")
   static int field1495 = 2035824187;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   static final int field1502 = 1;
   @ObfuscatedSignature(descriptor = "Lko;")
   @ObfuscatedName("ad")
   final ModelColorOverride field1500;

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ck")
   @Override
   final boolean vmethod112() {
      return null != this.definition;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldv;IIS)V")
   @ObfuscatedName("xj")
   public static void method3526(NPC var0, int var1, int var2, short var3) {
      if (null == var0.npcOverheadIcons) {
         var0.npcOverheadIcons = new NPCOverheadIcons(var0.definition);
      }

      var0.npcOverheadIcons.method12257(var1, var2, var3, (byte)73);
   }

   public int getId() {
      NPCComposition var1 = this.definition;
      if (var1 != null && var1.getConfigs() != null) {
         var1 = var1.method4731();
      }

      return var1 == null ? -1 : var1.getId();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cc")
   @Override
   final boolean vmethod113() {
      return null != this.definition;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("aw")
   final String method3504(int var1) {
      try {
         if (!this.field1497.isEmpty()) {
            return this.field1497;
         } else {
            NPCComposition var2 = this.definition;
            if (null != var2.transforms) {
               if (var1 == -564181207) {
                  throw new IllegalStateException();
               }

               var2 = NPCComposition.method4683(var2, (byte)0);
               if (null == var2) {
                  var2 = this.definition;
               }
            }

            return var2.name;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dv.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZ)V")
   @ObfuscatedName("bh")
   final void method3513(int var1, int var2, boolean var3) {
      if (AnimationSequence.method10315(this.animationSequence, -831296794)
         && AnimationSequence.method10318(this.animationSequence, 1867147422).field2731 * -1606113103 == 1) {
         Actor.method2754(this, -2145002511);
      }

      if (!var3) {
         int var4 = var1 - this.pathX[0];
         int var5 = var2 - this.pathY[0];
         if (var4 >= -106165678 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            Actor.method2765(this, var1, var2, MoveSpeed.field3806, -645794364);
            return;
         }
      }

      this.method2767(var1, var2, 949946326);
   }

   @ObfuscatedSignature(descriptor = "()Lhu;")
   @ObfuscatedName("qc")
   public NPCComposition method3553() {
      NPCComposition var1 = this.method3554();
      if (var1 != null && var1.getConfigs() != null) {
         var1 = var1.method4731();
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("an")
   @Override
   protected boolean vmethod51(int var1) {
      try {
         if (null == this.definition) {
            if (var1 != -1841545705) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (Actor.method2795(this, 440052811)) {
            if (var1 != -1841545705) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else if (Actor.method2802(this, (short)2048)) {
            if (var1 != -1841545705) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            Model var2;
            label53: {
               if (this.modelOverrides != null) {
                  if (var1 != -1841545705) {
                     throw new IllegalStateException();
                  }

                  if (this.modelOverrides.useLocalPlayer) {
                     if (var1 != -1841545705) {
                        throw new IllegalStateException();
                     }

                     var2 = PlayerComposition.method7912(class330.localPlayer.appearance, null, -1, null, -1, (byte)50);
                     break label53;
                  }
               }

               var2 = this.definition.getModel(null, 1, null, 1, this.modelOverrides, (short)6709);
            }

            if (null != var2) {
               if (var1 != -1841545705) {
                  throw new IllegalStateException();
               }

               if (var2.faceAlphas != null) {
                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dv.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fm")
   @Override
   int vmethod150() {
      return (-2071321549 * this.definition.field2329 == -1 ? this.defaultHeight * 1491799315 : -2071321549 * this.definition.field2329)
         + this.getAnimationHeightOffset(1587298105);
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ax")
   int[] method3518(int var1) {
      try {
         if (this.npcOverheadIcons != null) {
            if (var1 <= 1443085167) {
               throw new IllegalStateException();
            } else {
               return this.npcOverheadIcons.method12253(-2118783808);
            }
         } else {
            return this.definition.method4707(-1300032824);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dv.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[S")
   @ObfuscatedName("ar")
   short[] method3522(int var1) {
      try {
         if (null != this.npcOverheadIcons) {
            if (var1 >= 1761659388) {
               throw new IllegalStateException();
            } else {
               return this.npcOverheadIcons.method12255((short)32657);
            }
         } else {
            return this.definition.method4712((byte)-111);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dv.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([I[SB)V")
   @ObfuscatedName("al")
   void method3530(int[] var1, short[] var2, byte var3) {
      try {
         if (this.npcOverheadIcons == null) {
            if (var3 <= 0) {
               throw new IllegalStateException();
            }

            this.npcOverheadIcons = new NPCOverheadIcons(this.definition);
         }

         this.npcOverheadIcons.method12258(var1, var2, -1410112335);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "dv.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   void method3533(int var1) {
      try {
         this.npcOverheadIcons = null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dv.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lha;")
   @ObfuscatedName("ao")
   NpcOverrides method3536(int var1) {
      try {
         return this.chatheadOverrides;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dv.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lha;I)V")
   @ObfuscatedName("aq")
   void method3539(NpcOverrides var1, int var2) {
      try {
         this.chatheadOverrides = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dv.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhu;)V")
   @ObfuscatedName("ra")
   public void method3552(NPCComposition var1) {
      if (var1 == null) {
         SecureUrlRequester.client.getCallbacks().post(new NpcDespawned(this));
      } else {
         NPCComposition var2 = this.definition;
         if (var2 == null) {
            client.field941.add(new NpcSpawned(this));
         } else if (var1.getId() != var2.getId()) {
            client.field942.add(new NpcChanged(this, var2));
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lha;S)V")
   @ObfuscatedName("be")
   void method3540(NpcOverrides var1, short var2) {
      try {
         this.modelOverrides = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dv.be(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bb")
   void method3543(int var1) {
      try {
         this.chatheadOverrides = null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dv.bb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("bj")
   void method3548(byte var1) {
      try {
         this.modelOverrides = null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dv.bj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dq")
   @Override
   int vmethod147(int var1) {
      try {
         int var10000;
         if (-2071321549 * this.definition.field2329 == -1) {
            if (var1 <= -1595015587) {
               throw new IllegalStateException();
            }

            var10000 = this.defaultHeight * 1491799315;
         } else {
            var10000 = -2071321549 * this.definition.field2329;
         }

         return var10000 + this.getAnimationHeightOffset(-348129190);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dv.dq(" + 41);
      }
   }

   NPC(int var1) {
      super(var1);
      this.field1497 = "";
      this.field1499 = -744463237;
      this.field1500 = new ModelColorOverride((byte)0, (byte)0, (byte)0, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bo")
   @Override
   int vmethod115(int var1) {
      try {
         int var10000;
         if (this.method2813((byte)32)) {
            if (var1 >= -167875364) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = this.definition.method4718(1056332581);
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dv.bo(" + 41);
      }
   }

   public int getCombatLevel() {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else if (super.field1165 * -920641079 != -1) {
         return super.field1165 * -920641079;
      } else {
         NPCComposition var1 = this.definition;
         if (var1 != null && var1.getConfigs() != null) {
            var1 = var1.method4731();
         }

         return var1 == null ? -1 : var1.getCombatLevel();
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   @Override
   protected boolean vmethod50() {
      if (null == this.definition) {
         return false;
      } else if (Actor.method2795(this, 1858233351)) {
         return true;
      } else if (Actor.method2802(this, (short)2048)) {
         return true;
      } else {
         Model var1;
         if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
            var1 = PlayerComposition.method7912(class330.localPlayer.appearance, null, -1, null, -1, (byte)54);
         } else {
            var1 = this.definition.getModel(null, 1, null, 1, this.modelOverrides, (short)22870);
         }

         return null != var1 && var1.faceAlphas != null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("ap")
   @Override
   protected final Model vmethod49() {
      if (this.definition == null) {
         return null;
      } else {
         AnimationSequence var1 = Actor.method2816(this, 2141231512);
         AnimationSequence var2 = this.method2822(var1, 1200906599);
         if (var1 == null && var2 == null) {
            var2 = this.field1152;
            if (AnimationSequence.method10341(this.field1152, 30, -1002405506)) {
               return null;
            }
         }

         SequenceDefinition var3 = var1 == null ? null : AnimationSequence.method10318(var1, 567980165);
         SequenceDefinition var4 = null == var2 ? null : AnimationSequence.method10318(var2, -983981836);
         int var5 = var1 == null ? -1 : var1.getFrame(-609025707);
         int var6 = null == var2 ? -1 : var2.getFrame(-609025707);
         Model var7 = null;
         if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
            var7 = PlayerComposition.method7912(class330.localPlayer.appearance, var3, var5, var4, var6, (byte)92);
         } else {
            var7 = this.definition.getModel(var3, var5, var4, var6, this.modelOverrides, (short)10633);
         }

         if (null == var7) {
            return null;
         } else {
            var7.method6864();
            this.defaultHeight = 154623387 * var7.height;
            int var8 = var7.indicesCount;
            var7 = this.method2839(var7, 1420670173);
            if (this.definition.size * 1880345079 == 1) {
               var7.isSingleTile = true;
            }

            if (this.field1136.method6538()
               && 1759706017 * client.cycle >= this.npcCycle * -618742451
               && 1759706017 * client.cycle < this.field1125 * 413053887) {
               var7.method6832(this.field1136, (short)var8);
            } else {
               var7.method6835();
            }

            if (this.field1508) {
               int var9 = NPCComposition.method4724(this.definition, -1436123519);
               ModelColorOverride var10 = this.field1500;
               byte var11 = (byte)(var9 >> 10 & 63);
               byte var13 = (byte)(var9 >> 7 & 7);
               byte var15 = (byte)(var9 & 127);
               GrandExchangeOfferWorldComparator.method8848(var10, var11, var13, var15, (byte)127);
               var7.method6832(this.field1500, (short)var7.indicesCount);
               var7.method6871(0.01F);
               Model.method6870(var7, -5);
            }

            return var7;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("by")
   boolean method3500(int var1) {
      return var1 >= 0 && var1 <= 4 ? 0 != (this.field1499 * -1586529363 & 1 << var1) : true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldv;I)Z")
   @ObfuscatedName("it")
   public static boolean method3501(NPC var0, int var1) {
      if (var0 == null) {
         var0.method3517(var1);
      }

      return var1 >= 0 && var1 <= 4 ? 0 != (var0.field1499 * -738966977 & 1 << var1) : true;
   }

   @ObfuscatedSignature(descriptor = "()Lhu;")
   @ObfuscatedName("zj")
   public NPCComposition method3554() {
      return this.definition;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cf")
   @Override
   int vmethod116() {
      return this.method2813((byte)32) ? 0 : this.definition.method4718(1995278558);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cs")
   @Override
   final boolean vmethod114() {
      return null != this.definition;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldv;ILlz;)V")
   @ObfuscatedName("ul")
   public static void method3507(NPC var0, int var1, MoveSpeed var2) {
      int var3 = var0.pathX[0];
      int var4 = var0.pathY[0];
      if (0 == var1) {
         var3--;
         var4++;
      }

      if (var1 == 1) {
         var4++;
      }

      if (2 == var1) {
         var3++;
         var4++;
      }

      if (3 == var1) {
         var3--;
      }

      if (var1 == 4) {
         var3++;
      }

      if (5 == var1) {
         var3--;
         var4--;
      }

      if (var1 == 6) {
         var4--;
      }

      if (7 == var1) {
         var3++;
         var4--;
      }

      if (AnimationSequence.method10315(var0.animationSequence, -831296794)
         && AnimationSequence.method10318(var0.animationSequence, -932287524).field2731 * -1606113103 == 1) {
         Actor.method2754(var0, -2122067991);
      }

      Actor.method2765(var0, var3, var4, var2, -645794364);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cn")
   @Override
   final boolean vmethod111() {
      return null != this.definition;
   }

   public short[] getOverheadSpriteIds() {
      if (this.npcOverheadIcons != null) {
         return (short[])this.npcOverheadIcons.overheadSpriteIds.clone();
      } else {
         NPCComposition var1 = this.method3553();
         return var1 != null && var1.recolorFrom != null ? (short[])var1.recolorFrom.clone() : null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldv;)[I")
   @ObfuscatedName("hj")
   public static int[] method3519(NPC var0) {
      return var0.npcOverheadIcons != null ? var0.npcOverheadIcons.method12253(-1891606938) : var0.definition.method4707(-1300032824);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cz")
   @Override
   int vmethod117() {
      return this.method2813((byte)32) ? 0 : this.definition.method4718(499226285);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ci")
   @Override
   int vmethod118() {
      return this.method2813((byte)32) ? 0 : this.definition.method4718(421410667);
   }

   @ObfuscatedSignature(descriptor = "()Lha;")
   @ObfuscatedName("ga")
   NpcOverrides method3537() {
      return this.chatheadOverrides;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fj")
   @Override
   int vmethod149() {
      return (1405120219 * this.definition.field2329 == -1 ? this.defaultHeight * -1850344550 : 405460238 * this.definition.field2329)
         + this.getAnimationHeightOffset(-557671050);
   }

   @ObfuscatedSignature(descriptor = "()[S")
   @ObfuscatedName("cb")
   short[] method3523() {
      return null != this.npcOverheadIcons ? this.npcOverheadIcons.method12255((short)17413) : this.definition.method4712((byte)40);
   }

   public int getIndex() {
      return super.index * -1903023775;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("bt")
   void method3491(String var1) {
      this.field1497 = var1 == null ? "" : var1;
   }

   @ObfuscatedSignature(descriptor = "(Ldv;ILlz;B)V")
   @ObfuscatedName("pr")
   public static void method3508(NPC var0, int var1, MoveSpeed var2, byte var3) {
      if (var0 == null) {
         var0.method3511(var1, var2, var3);
      } else {
         try {
            int var4 = var0.pathX[0];
            int var5 = var0.pathY[0];
            if (0 == var1) {
               var4--;
               var5++;
            }

            if (var1 == 1) {
               if (var3 == 72) {
                  throw new IllegalStateException();
               }

               var5++;
            }

            if (2 == var1) {
               if (var3 == 72) {
                  throw new IllegalStateException();
               }

               var4++;
               var5++;
            }

            if (3 == var1) {
               if (var3 == 72) {
                  throw new IllegalStateException();
               }

               var4--;
            }

            if (var1 == 4) {
               var4++;
            }

            if (5 == var1) {
               if (var3 == 72) {
                  return;
               }

               var4--;
               var5--;
            }

            if (var1 == 6) {
               if (var3 == 72) {
                  return;
               }

               var5--;
            }

            if (7 == var1) {
               if (var3 == 72) {
                  throw new IllegalStateException();
               }

               var4++;
               var5--;
            }

            if (AnimationSequence.method10315(var0.animationSequence, -831296794)
               && AnimationSequence.method10318(var0.animationSequence, -1658512209).field2731 * -1606113103 == 1) {
               Actor.method2754(var0, -570564745);
            }

            Actor.method2765(var0, var4, var5, var2, -645794364);
         } catch (RuntimeException var6) {
            throw RestClientThreadFactory.newRunException(var6, "dv.ac(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ba")
   void method3495(int var1) {
      this.field1499 = var1 * 563486167;
   }

   public String getName() {
      if (this.definition == null) {
         return null;
      } else {
         String var1 = this.method3550();
         return var1.replace(' ', ' ');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldv;Ljava/lang/String;I)V")
   @ObfuscatedName("dg")
   public static void method3492(NPC var0, String var1, int var2) {
      if (var0 == null) {
         var0.method3494(var1, var2);
      }

      try {
         var0.field1497 = var1 == null ? "" : var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dv.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fd")
   @Override
   int vmethod148() {
      return (-2071321549 * this.definition.field2329 == -1 ? this.defaultHeight * 1229275230 : -2071321549 * this.definition.field2329)
         + this.getAnimationHeightOffset(-511747241);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gz")
   void method3544() {
      this.chatheadOverrides = null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bw")
   final String method3505() {
      if (!this.field1497.isEmpty()) {
         return this.field1497;
      } else {
         NPCComposition var1 = this.definition;
         if (null != var1.transforms) {
            var1 = NPCComposition.method4683(var1, (byte)0);
            if (null == var1) {
               var1 = this.definition;
            }
         }

         return var1.name;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bf")
   final String method3506() {
      if (!this.field1497.isEmpty()) {
         return this.field1497;
      } else {
         NPCComposition var1 = this.definition;
         if (null != var1.transforms) {
            var1 = NPCComposition.method4683(var1, (byte)0);
            if (null == var1) {
               var1 = this.definition;
            }
         }

         return var1.name;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILlz;)V")
   @ObfuscatedName("bd")
   final void method3509(int var1, MoveSpeed var2) {
      int var3 = this.pathX[0];
      int var4 = this.pathY[0];
      if (0 == var1) {
         var3--;
         var4++;
      }

      if (var1 == 1) {
         var4++;
      }

      if (2 == var1) {
         var3++;
         var4++;
      }

      if (3 == var1) {
         var3--;
      }

      if (var1 == 4) {
         var3++;
      }

      if (5 == var1) {
         var3--;
         var4--;
      }

      if (var1 == 6) {
         var4--;
      }

      if (7 == var1) {
         var3++;
         var4--;
      }

      if (AnimationSequence.method10315(this.animationSequence, -831296794)
         && AnimationSequence.method10318(this.animationSequence, 707474313).field2731 * -1606113103 == 1) {
         Actor.method2754(this, -649890216);
      }

      Actor.method2765(this, var3, var4, var2, -645794364);
   }

   @ObfuscatedSignature(descriptor = "(ILlz;)V")
   @ObfuscatedName("br")
   final void method3510(int var1, MoveSpeed var2) {
      int var3 = this.pathX[0];
      int var4 = this.pathY[0];
      if (0 == var1) {
         var3--;
         var4++;
      }

      if (var1 == 1) {
         var4++;
      }

      if (2 == var1) {
         var3++;
         var4++;
      }

      if (3 == var1) {
         var3--;
      }

      if (var1 == 4) {
         var3++;
      }

      if (5 == var1) {
         var3--;
         var4--;
      }

      if (var1 == 6) {
         var4--;
      }

      if (7 == var1) {
         var3++;
         var4--;
      }

      if (AnimationSequence.method10315(this.animationSequence, -831296794)
         && AnimationSequence.method10318(this.animationSequence, 818194811).field2731 * -1606113103 == 1) {
         Actor.method2754(this, -1940970604);
      }

      Actor.method2765(this, var3, var4, var2, -645794364);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aa")
   @Override
   final boolean isVisible(int var1) {
      try {
         if (null == this.definition) {
            if (var1 >= -414448437) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dv.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZ)V")
   @ObfuscatedName("bl")
   final void method3514(int var1, int var2, boolean var3) {
      if (AnimationSequence.method10315(this.animationSequence, -831296794)
         && AnimationSequence.method10318(this.animationSequence, -1497764609).field2731 * -1606113103 == 1) {
         Actor.method2754(this, -1256944537);
      }

      if (!var3) {
         int var4 = var1 - this.pathX[0];
         int var5 = var2 - this.pathY[0];
         if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            Actor.method2765(this, var1, var2, MoveSpeed.field3806, -645794364);
            return;
         }
      }

      this.method2767(var1, var2, 1771216319);
   }

   @Override
   public Polygon getCanvasTilePoly() {
      NPCComposition var1 = this.method3553();
      if (var1 == null) {
         return null;
      } else {
         int var2 = var1.getSize();
         return Perspective.getCanvasTileAreaPoly(SecureUrlRequester.client, this.getLocalLocation(), var2);
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bq")
   int[] method3520() {
      return this.npcOverheadIcons != null ? this.npcOverheadIcons.method12253(-1901325628) : this.definition.method4707(-1300032824);
   }

   @ObfuscatedSignature(descriptor = "(Ldv;IIZI)V")
   @ObfuscatedName("hp")
   public static void method3515(NPC var0, int var1, int var2, boolean var3, int var4) {
      if (var0 == null) {
         var0.method3516(var1, var1, var3, var1);
      } else {
         try {
            if (AnimationSequence.method10315(var0.animationSequence, -831296794)
               && AnimationSequence.method10318(var0.animationSequence, -1356918203).field2731 * -1606113103 == 1) {
               if (var4 != -1777612090) {
                  return;
               }

               Actor.method2754(var0, 487179516);
            }

            if (!var3) {
               int var5 = var1 - var0.pathX[0];
               int var6 = var2 - var0.pathY[0];
               if (var5 >= -8) {
                  if (var4 != -1777612090) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= 8) {
                     if (var4 != -1777612090) {
                        throw new IllegalStateException();
                     }

                     if (var6 >= -8) {
                        if (var4 != -1777612090) {
                           throw new IllegalStateException();
                        }

                        if (var6 <= 8) {
                           if (var4 != -1777612090) {
                              throw new IllegalStateException();
                           }

                           Actor.method2765(var0, var1, var2, MoveSpeed.field3806, -645794364);
                           return;
                        }
                     }
                  }
               }
            }

            var0.method2767(var1, var2, 838904682);
         } catch (RuntimeException var7) {
            throw RestClientThreadFactory.newRunException(var7, "dv.ab(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lky;")
   @ObfuscatedName("ag")
   @Override
   protected final Model getModel(int var1) {
      if (client.field1023 != null
         && client.field1023
            .test(super.animationSequence.id * 1870316967 != -1 ? super.animationSequence.id * 1870316967 : super.poseAnimationSequence.id * 1870316967)) {
         int var2 = this.getAnimationFrame();
         int var3 = this.getPoseAnimationFrame();

         Model var14;
         try {
            super.animationSequence.frame = (-2147483648 | Math.max(super.animationSequence.frameCycle * -1148754599 - 1, 0) << 16 | var2) * -449915737;
            super.poseAnimationSequence.frame = (-1073741824 | Math.max(super.poseAnimationSequence.frameCycle * -1148754599 - 1, 0) << 16 | var3) * -449915737;

            for (ActorSpotAnim var5 : this.method2848()) {
               int var6 = var5.getFrame();
               var5.setFrame(-2147483648 | Math.max(var5.getCycle() - 1, 0) << 16 | var6);
            }

            var14 = this.method3551();
         } finally {
            super.animationSequence.frame = var2 * -449915737;
            super.poseAnimationSequence.frame = var3 * -449915737;

            for (ActorSpotAnim var10 : this.method2848()) {
               int var11 = var10.getFrame();
               var10.setFrame(var11 & 65535);
            }
         }

         return var14;
      } else {
         return this.method3551();
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("cu")
   int[] method3521() {
      return this.npcOverheadIcons != null ? this.npcOverheadIcons.method12253(-1934659400) : this.definition.method4707(-1300032824);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldv;Ljava/lang/String;)V")
   @ObfuscatedName("mf")
   public static void method3493(NPC var0, String var1) {
      if (var0 == null) {
         var0.vmethod50();
      }

      var0.field1497 = var1 == null ? "" : var1;
   }

   @ObfuscatedSignature(descriptor = "()[S")
   @ObfuscatedName("ct")
   short[] method3524() {
      return null != this.npcOverheadIcons ? this.npcOverheadIcons.method12255((short)23783) : this.definition.method4712((byte)61);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bu")
   void method3496(int var1) {
      this.field1499 = var1 * 114532389;
   }

   public Shape getConvexHull() {
      Model var1 = this.method6220();
      if (var1 == null) {
         return null;
      } else {
         WorldView var2 = this.method2836();
         int var3 = Perspective.getFootprintTileHeight(
            SecureUrlRequester.client, this.getLocalLocation(), var2.plane * 2115028565, this.definition.getFootprintSize()
         );
         var3 -= this.getAnimationHeightOffset();
         return var1.method6857(var2, super.x * 340712311, super.y * -1747310679, this.getCurrentOrientation(), var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("fz")
   public Model method3551() {
      NPC var1 = this;
      int var2 = 566725961;

      try {
         Model var10000;
         if (var1.definition == null) {
            if (var2 == 340712311) {
               throw new IllegalStateException();
            }

            Object var19 = null;
            var10000 = (Model)var19;
         } else {
            AnimationSequence var3 = Actor.method2816(var1, 2078570409);
            AnimationSequence var4 = var1.method2822(var3, 1400325105);
            if (var3 == null) {
               if (var2 == 340712311) {
                  throw new IllegalStateException();
               }

               if (var4 == null) {
                  if (var2 == 340712311) {
                     throw new IllegalStateException();
                  }

                  var4 = var1.field1152;
                  if (AnimationSequence.method10341(var1.field1152, 30, -1002405506)) {
                     if (var2 == 340712311) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }
               }
            }

            SequenceDefinition var24;
            if (var3 == null) {
               if (var2 == 340712311) {
                  throw new IllegalStateException();
               }

               var24 = null;
            } else {
               var24 = AnimationSequence.method10318(var3, 161195892);
            }

            SequenceDefinition var5 = var24;
            SequenceDefinition var25;
            if (null == var4) {
               if (var2 == 340712311) {
                  throw new IllegalStateException();
               }

               var25 = null;
            } else {
               var25 = AnimationSequence.method10318(var4, 276121137);
            }

            SequenceDefinition var6 = var25;
            int var7 = var3 == null ? -1 : var3.getFrame(-609025707);
            int var26;
            if (null == var4) {
               if (var2 == 340712311) {
                  throw new IllegalStateException();
               }

               var26 = -1;
            } else {
               var26 = var4.getFrame(-609025707);
            }

            Model var22;
            label135: {
               int var8 = var26;
               Object var9 = null;
               if (var1.modelOverrides != null) {
                  if (var2 == 340712311) {
                     throw new IllegalStateException();
                  }

                  if (var1.modelOverrides.useLocalPlayer) {
                     if (var2 == 340712311) {
                        throw new IllegalStateException();
                     }

                     var22 = PlayerComposition.method7912(class330.localPlayer.appearance, var5, var7, var6, var8, (byte)16);
                     break label135;
                  }
               }

               var22 = var1.definition.getModel(var5, var7, var6, var8, var1.modelOverrides, (short)21495);
            }

            if (null == var22) {
               if (var2 == 340712311) {
                  throw new IllegalStateException();
               }

               Object var20 = null;
               var10000 = (Model)var20;
            } else {
               var22.method6864();
               var1.defaultHeight = 154623387 * var22.height;
               int var10 = var22.indicesCount;
               var22 = var1.method2839(var22, -1046031637);
               if (var1.definition.size * 1880345079 == 1) {
                  if (var2 == 340712311) {
                     throw new IllegalStateException();
                  }

                  var22.isSingleTile = true;
               }

               label127: {
                  if (var1.field1136.method6538()) {
                     if (var2 == 340712311) {
                        throw new IllegalStateException();
                     }

                     if (1759706017 * client.cycle >= var1.npcCycle * -618742451 && 1759706017 * client.cycle < var1.field1125 * 413053887) {
                        if (var2 == 340712311) {
                           throw new IllegalStateException();
                        }

                        var22.method6832(var1.field1136, (short)var10);
                        break label127;
                     }
                  }

                  var22.method6835();
               }

               if (var1.field1508) {
                  if (var2 == 340712311) {
                     throw new IllegalStateException();
                  }

                  int var11 = NPCComposition.method4724(var1.definition, -1436123519);
                  ModelColorOverride var12 = var1.field1500;
                  byte var13 = (byte)(var11 >> 10 & 63);
                  byte var15 = (byte)(var11 >> 7 & 7);
                  byte var17 = (byte)(var11 & 127);
                  GrandExchangeOfferWorldComparator.method8848(var12, var13, var15, var17, (byte)127);
                  var22.method6832(var1.field1500, (short)var22.indicesCount);
                  var22.method6871(0.01F);
                  Model.method6870(var22, -5);
               }

               var10000 = var22;
            }
         }

         return var10000;
      } catch (RuntimeException var18) {
         throw RestClientThreadFactory.newRunException(var18, "dv.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldv;IISI)V")
   @ObfuscatedName("et")
   public static void method3527(NPC var0, int var1, int var2, short var3, int var4) {
      if (var0 == null) {
         var0.method3529(var1, var1, var3, var1);
      }

      try {
         if (null == var0.npcOverheadIcons) {
            if (var4 <= 1244638235) {
               throw new IllegalStateException();
            }

            var0.npcOverheadIcons = new NPCOverheadIcons(var0.definition);
         }

         var0.npcOverheadIcons.method12257(var1, var2, var3, (byte)67);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "dv.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gb")
   void method3545() {
      this.chatheadOverrides = null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("pc")
   public String method3550() {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         return this.method3504(944066099);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldv;IB)V")
   @ObfuscatedName("zy")
   public static void method3497(NPC var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method3498(var1, var2);
      }

      try {
         var0.field1499 = var1 * 114532389;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dv.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([I[S)V")
   @ObfuscatedName("cp")
   void method3531(int[] var1, short[] var2) {
      if (this.npcOverheadIcons == null) {
         this.npcOverheadIcons = new NPCOverheadIcons(this.definition);
      }

      this.npcOverheadIcons.method12258(var1, var2, 1230863634);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lar;)Z")
   @ObfuscatedName("cs")
   public static boolean method3499(AsyncHttpResponse var0) {
      if (var0 == null) {
         return var0.method229();
      } else {
         return var0.hasError(-1922330015) ? true : var0.responseFuture.isDone();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cd")
   void method3534() {
      this.npcOverheadIcons = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gg")
   void method3535() {
      this.npcOverheadIcons = null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   @Override
   protected boolean vmethod52() {
      if (null == this.definition) {
         return false;
      } else if (Actor.method2795(this, -945319862)) {
         return true;
      } else if (Actor.method2802(this, (short)2048)) {
         return true;
      } else {
         Model var1;
         if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
            var1 = PlayerComposition.method7912(class330.localPlayer.appearance, null, -1, null, -1, (byte)109);
         } else {
            var1 = this.definition.getModel(null, 1, null, 1, this.modelOverrides, (short)14713);
         }

         return null != var1 && var1.faceAlphas != null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lha;")
   @ObfuscatedName("gy")
   NpcOverrides method3538() {
      return this.chatheadOverrides;
   }

   @ObfuscatedSignature(descriptor = "(IIS)V")
   @ObfuscatedName("cx")
   void method3528(int var1, int var2, short var3) {
      if (null == this.npcOverheadIcons) {
         this.npcOverheadIcons = new NPCOverheadIcons(this.definition);
      }

      this.npcOverheadIcons.method12257(var1, var2, var3, (byte)97);
   }

   @ObfuscatedSignature(descriptor = "(Lha;)V")
   @ObfuscatedName("gt")
   void method3541(NpcOverrides var1) {
      this.modelOverrides = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lha;)V")
   @ObfuscatedName("gw")
   void method3542(NpcOverrides var1) {
      this.modelOverrides = var1;
   }

   @Nullable
   public net.runelite.api.NpcOverrides getChatheadOverrides() {
      return this.chatheadOverrides;
   }

   @ObfuscatedSignature(descriptor = "()[S")
   @ObfuscatedName("cm")
   short[] method3525() {
      return null != this.npcOverheadIcons ? this.npcOverheadIcons.method12255((short)3647) : this.definition.method4712((byte)91);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gv")
   void method3546() {
      this.chatheadOverrides = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gh")
   void method3547() {
      this.chatheadOverrides = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gl")
   void method3549() {
      this.modelOverrides = null;
   }

   public int[] getOverheadArchiveIds() {
      if (this.npcOverheadIcons != null) {
         return (int[])this.npcOverheadIcons.overheadArchiveIds.clone();
      } else {
         NPCComposition var1 = this.method3553();
         return var1 != null && var1.headIconArchiveIds != null ? (int[])var1.headIconArchiveIds.clone() : null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldv;[I[S)V")
   @ObfuscatedName("ov")
   public static void method3532(NPC var0, int[] var1, short[] var2) {
      if (var0.npcOverheadIcons == null) {
         var0.npcOverheadIcons = new NPCOverheadIcons(var0.definition);
      }

      var0.npcOverheadIcons.method12258(var1, var2, -918978018);
   }

   @ObfuscatedSignature(descriptor = "(Ldv;II)Z")
   @ObfuscatedName("xk")
   public static boolean method3502(NPC var0, int var1, int var2) {
      if (var0 == null) {
         var0.method3503(var1, var1);
      }

      try {
         if (var1 >= 0) {
            if (var2 >= -1276741052) {
               throw new IllegalStateException();
            }

            if (var1 <= 4) {
               if (var2 >= -1276741052) {
                  throw new IllegalStateException();
               }

               boolean var10000;
               if (0 != (var0.field1499 * -1586529363 & 1 << var1)) {
                  if (var2 >= -1276741052) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               return var10000;
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dv.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ae")
   static void clearItemContainer(int var0, int var1) {
      try {
         ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.method8915(var0);
         if (var2 == null) {
            if (var1 <= 327680) {
               throw new IllegalStateException();
            }
         } else {
            for (int var3 = 0; var3 < var2.ids.length; var3++) {
               var2.ids[var3] = -1;
               var2.quantities[var3] = 0;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "dv.ae(" + ')');
      }
   }

   @Nullable
   public net.runelite.api.NpcOverrides getModelOverrides() {
      return this.modelOverrides;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("at")
   void method3494(String var1, int var2) {
      try {
         this.field1497 = var1 == null ? "" : var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dv.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILlz;B)V")
   @ObfuscatedName("ac")
   final void method3511(int var1, MoveSpeed var2, byte var3) {
      try {
         int var4 = super.hitSplatValues2[0];
         int var5 = super.hitSplatValues2[0];
         if (0 == var1) {
            var4--;
            var5++;
         }

         if (var1 == 1) {
            if (var3 == 72) {
               throw new IllegalStateException();
            }

            var5++;
         }

         if (2 == var1) {
            if (var3 == 72) {
               throw new IllegalStateException();
            }

            var4++;
            var5++;
         }

         if (3 == var1) {
            if (var3 == 72) {
               throw new IllegalStateException();
            }

            var4--;
         }

         if (var1 == 4) {
            var4++;
         }

         if (5 == var1) {
            if (var3 == 72) {
               return;
            }

            var4--;
            var5--;
         }

         if (var1 == 6) {
            if (var3 == 72) {
               return;
            }

            var5--;
         }

         if (7 == var1) {
            if (var3 == 72) {
               throw new IllegalStateException();
            }

            var4++;
            var5--;
         }

         if (AnimationSequence.method10315(super.field1152, -831296794)
            && AnimationSequence.method10318(super.poseAnimationSequence, -1658512209).field2720 * -1606113103 == 1) {
            Actor.method2754(this, -570564745);
         }

         Actor.method2765(this, var4, var5, var2, -645794364);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "dv.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IISI)V")
   @ObfuscatedName("ah")
   void method3529(int var1, int var2, short var3, int var4) {
      try {
         if (null == this.npcOverheadIcons) {
            if (var4 <= 1244638235) {
               throw new IllegalStateException();
            }

            this.npcOverheadIcons = new NPCOverheadIcons(this.definition);
         }

         this.npcOverheadIcons.method12257(var1, var2, var3, (byte)67);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "dv.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bi")
   boolean method3517(int var1) {
      try {
         if (null == this.definition) {
            if (var1 != -1841545705) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (Actor.method2795(this, 440052811)) {
            if (var1 != -1841545705) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else if (Actor.method2802(this, (short)2048)) {
            if (var1 != -1841545705) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            Model var2;
            label53: {
               if (this.modelOverrides != null) {
                  if (var1 != -1841545705) {
                     throw new IllegalStateException();
                  }

                  if (this.modelOverrides.useLocalPlayer) {
                     if (var1 != -1841545705) {
                        throw new IllegalStateException();
                     }

                     var2 = PlayerComposition.method7912(class330.localPlayer.appearance, null, -1, null, -1, (byte)50);
                     break label53;
                  }
               }

               var2 = this.definition.getModel(null, 1, null, 1, this.modelOverrides, (short)6709);
            }

            if (null != var2) {
               if (var1 != -1841545705) {
                  throw new IllegalStateException();
               }

               if (var2.faceAlphas != null) {
                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dv.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("aj")
   void method3498(int var1, byte var2) {
      try {
         this.field1499 = var1 * 114532389;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dv.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZI)V")
   @ObfuscatedName("ab")
   final void method3516(int var1, int var2, boolean var3, int var4) {
      try {
         if (AnimationSequence.method10315(this.animationSequence, -831296794)
            && AnimationSequence.method10318(super.field1152, -1356918203).field2720 * -1606113103 == 1) {
            if (var4 != -1777612090) {
               return;
            }

            Actor.method2754(this, 487179516);
         }

         if (!var3) {
            int var5 = var1 - super.hitSplatValues[0];
            int var6 = var2 - super.hitSplatValues[0];
            if (var5 >= -8) {
               if (var4 != -1777612090) {
                  throw new IllegalStateException();
               }

               if (var5 <= 8) {
                  if (var4 != -1777612090) {
                     throw new IllegalStateException();
                  }

                  if (var6 >= -8) {
                     if (var4 != -1777612090) {
                        throw new IllegalStateException();
                     }

                     if (var6 <= 8) {
                        if (var4 != -1777612090) {
                           throw new IllegalStateException();
                        }

                        Actor.method2765(this, var1, var2, MoveSpeed.field3806, -645794364);
                        return;
                     }
                  }
               }
            }
         }

         this.method2767(var1, var2, 838904682);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "dv.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ak")
   boolean method3503(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 >= -1276741052) {
               throw new IllegalStateException();
            }

            if (var1 <= 4) {
               if (var2 >= -1276741052) {
                  throw new IllegalStateException();
               }

               boolean var10000;
               if (0 != (this.field1499 * -1586529363 & 1 << var1)) {
                  if (var2 >= -1276741052) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               return var10000;
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dv.ak(" + ')');
      }
   }
}
