import java.util.ArrayList;
import java.util.List;
import net.runelite.api.MenuEntry;
import net.runelite.api.Skill;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.StatChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pv")
public class classPV {
   @ObfuscatedName("al")
   int field5433;
   @ObfuscatedName("ae")
   int field5432;
   @ObfuscatedName("ag")
   int field5427;
   @ObfuscatedName("aa")
   int field5431;
   @ObfuscatedName("ai")
   int field5440;
   @ObfuscatedName("ac")
   final int[] field5428;
   @ObfuscatedName("ax")
   int field5429;
   @ObfuscatedName("ab")
   final int[] field5430;
   @ObfuscatedName("ad")
   int field5426;
   @ObfuscatedName("as")
   final int[] field5437;
   @ObfuscatedName("br")
   public final List field5424 = new ArrayList();
   @ObfuscatedName("ao")
   final int[] field5441;
   @ObfuscatedName("aj")
   int field5435;
   @ObfuscatedName("ay")
   int field5438;
   @ObfuscatedName("aq")
   int field5434;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field5442 = 31;
   @ObfuscatedName("ap")
   int field5439;
   @ObfuscatedName("au")
   int field5425;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5443 = 32;
   @ObfuscatedName("ar")
   int field5436;
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   public static final int field5444 = 1024;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gy")
   public void method9320() {
      client.method2394();

      for (ItemContainerChanged var2 : this.field5424) {
         classOE.client.getCallbacks().post(var2);
      }

      this.field5424.clear();
      classOE.client.getCallbacks().post(new ClientTick());
      if (classOE.client.getOculusOrbState() != 0) {
         MenuEntry[] var7 = classOE.client.getMenuEntries();
         ArrayList var8 = new ArrayList(var7.length);

         for (MenuEntry var6 : var7) {
            switch (var6.getType()) {
               default:
                  var8.add(var6);
               case WIDGET_TARGET_ON_GAME_OBJECT:
               case GAME_OBJECT_FIRST_OPTION:
               case GAME_OBJECT_SECOND_OPTION:
               case GAME_OBJECT_THIRD_OPTION:
               case GAME_OBJECT_FOURTH_OPTION:
               case GAME_OBJECT_FIFTH_OPTION:
               case WIDGET_TARGET_ON_NPC:
               case NPC_FIRST_OPTION:
               case NPC_SECOND_OPTION:
               case NPC_THIRD_OPTION:
               case NPC_FOURTH_OPTION:
               case NPC_FIFTH_OPTION:
               case WIDGET_TARGET_ON_PLAYER:
               case WIDGET_TARGET_ON_GROUND_ITEM:
               case GROUND_ITEM_FIRST_OPTION:
               case GROUND_ITEM_SECOND_OPTION:
               case GROUND_ITEM_THIRD_OPTION:
               case GROUND_ITEM_FOURTH_OPTION:
               case GROUND_ITEM_FIFTH_OPTION:
               case PLAYER_FIRST_OPTION:
               case PLAYER_SECOND_OPTION:
               case PLAYER_THIRD_OPTION:
               case PLAYER_FOURTH_OPTION:
               case PLAYER_FIFTH_OPTION:
               case PLAYER_SIXTH_OPTION:
               case PLAYER_SEVENTH_OPTION:
               case PLAYER_EIGHTH_OPTION:
            }
         }

         classOE.client.setMenuEntries(var8.toArray(new MenuEntry[0]));
      }

      classIS.field3053.scene.method4344();
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ac")
   public void method9218(int var1) {
      try {
         this.field5432 += 2070229217;
         this.method9320();
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpv;I)V")
   @ObfuscatedName("wo")
   public static void method9235(classPV var0, int var1) {
      if (var0 == null) {
         var0.method9319(var1);
      } else {
         try {
            var0.field5435 = var0.field5432 * 751702011;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "pv.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cu")
   public void method9254() {
      this.field5440 = this.field5432 * -1807734201;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ae")
   public void method9226(int var1, byte var2) {
      this.method9318(var1);

      try {
         this.field5430[(this.field5431 += -612394997) * -362269789 - 1 & 31] = var1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "pv.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpv;B)V")
   @ObfuscatedName("qk")
   public static void method9245(classPV var0, byte var1) {
      if (var0 == null) {
         var0.method9247(var1);
      }

      try {
         var0.field5426 = -699888003 * var0.field5432;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ag")
   public void method9231(int var1, int var2) {
      try {
         this.field5437[(this.field5433 += -75721583) * -1415467919 - 1 & 31] = var1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "pv.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dz")
   int method9271() {
      return this.field5427 * 1886152021;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ao")
   public void method9237(int var1) {
      try {
         this.field5438 = this.field5432 * -803606047;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   public void method9242(int var1) {
      try {
         this.field5434 = -312040537 * this.field5432;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.ac(" + ')');
      }
   }

   public classPV() {
      this.field5432 = 2070229217;
      this.field5441 = new int[32];
      this.field5427 = 0;
      this.field5428 = new int[32];
      this.field5429 = 0;
      this.field5430 = new int[32];
      this.field5431 = 0;
      this.field5437 = new int[32];
      this.field5433 = 0;
      this.field5435 = 0;
      this.field5438 = 0;
      this.field5434 = 0;
      this.field5426 = 0;
      this.field5439 = 0;
      this.field5425 = 0;
      this.field5440 = 0;
      this.field5436 = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bk")
   public void method9252(int var1) {
      try {
         this.field5425 = this.field5432 * -1827024473;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bm")
   public void method9255(int var1) {
      try {
         this.field5440 = this.field5432 * -1807734201;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpv;)V")
   @ObfuscatedName("fm")
   public static void method9238(classPV var0) {
      if (var0 == null) {
         var0.method9291();
      }

      var0.field5438 = var0.field5432 * -1585984081;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ay")
   public void method9248(int var1) {
      try {
         this.field5439 = this.field5432 * 2126449247;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("co")
   int method9268(int var1) {
      return this.field5441[var1 & 31];
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("xq")
   public void method9322(int var1) {
      this.method9226(var1, (byte)57);
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ap")
   int method9269(int var1, int var2) {
      try {
         return this.field5441[var1 & 31];
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "pv.ap(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("au")
   int method9272(byte var1) {
      try {
         return this.field5427 * 1886152021;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.au(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dq")
   int method9296() {
      return 1056232063 * this.field5439;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   int method9276(int var1) {
      try {
         return this.field5429 * -634175101;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.ar(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cj")
   int method9291() {
      return this.field5426 * 1331129227;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ak")
   int method9281(int var1) {
      try {
         return -362269789 * this.field5431;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   int method9284(int var1) {
      try {
         return 186634899 * this.field5435;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   int method9286(int var1) {
      try {
         return this.field5438 * -120272575;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   int method9290(int var1) {
      try {
         return -1113846793 * this.field5434;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("am")
   int method9292(byte var1) {
      try {
         return this.field5426 * -905640843;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.am(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bo")
   public void method9323(int var1) {
      this.method9220(var1, (byte)67);
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("af")
   public void method9220(int var1, byte var2) {
      try {
         this.field5441[(this.field5427 += 1362128893) * 1886152021 - 1 & 31] = var1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "pv.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dw")
   int method9282() {
      return -1951985883 * this.field5431;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ax")
   public void method9318(int var1) {
      Skill[] var2 = Skill.values();
      if (var1 >= 0 && var1 < var2.length) {
         int[] var3 = classOE.client.getSkillExperiences();
         int[] var4 = classOE.client.getBoostedSkillLevels();
         int[] var5 = classOE.client.getRealSkillLevels();
         StatChanged var6 = new StatChanged(var2[var1], var3[var1], var5[var1], var4[var1]);
         classOE.client.getCallbacks().post(var6);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bp")
   public void method9219() {
      this.field5432 += -1382978234;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   public void method9324(int var1) {
      method9230(this, var1, (byte)50);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bu")
   public void method9221(int var1) {
      this.field5441[(this.field5427 += 1362128893) * 1886152021 - 1 & 31] = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dr")
   int method9287() {
      return this.field5438 * -120272575;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cv")
   public void method9262() {
      this.field5427 += 638451616;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dy")
   int method9297() {
      return 1056232063 * this.field5439;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aq")
   public void method9227(int var1) {
      this.field5430[(this.field5431 += 1787332678) * -362269789 - 1 & 31] = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   public void method9229(int var1) {
      this.field5428[(this.field5429 += 1089918251) * -634175101 - 1 & 31] = var1 & 32767;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bw")
   public void method9232(int var1) {
      this.field5437[(this.field5433 += -75721583) * -1415467919 - 1 & 31] = var1;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aw")
   int method9278(int var1, int var2) {
      try {
         return this.field5430[var1 & 31];
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "pv.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ba")
   public void method9233(int var1) {
      this.field5437[(this.field5433 += -75721583) * -1216136354 - 1 & -1579403281] = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("qh")
   public void method9228(int var1) {
      this.field5430[(this.field5431 += -612394997) * -362269789 - 1 & 31] = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dl")
   int method9293() {
      return this.field5426 * -905640843;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   public void method9239() {
      this.field5438 = this.field5432 * -803606047;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bq")
   public void method9240() {
      this.field5438 = this.field5432 * -803606047;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   public void method9236() {
      this.field5435 = this.field5432 * 1753564287;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bs")
   public void method9243() {
      this.field5434 = -312040537 * this.field5432;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bd")
   public void method9246() {
      this.field5426 = -699888003 * this.field5432;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bl")
   public void method9249() {
      this.field5439 = this.field5432 * 986962992;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bv")
   public void method9250() {
      this.field5439 = this.field5432 * 43570621;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bh")
   public void method9251() {
      this.field5439 = this.field5432 * 2126449247;
   }

   @ObfuscatedSignature(descriptor = "(Lpv;B)I")
   @ObfuscatedName("si")
   public static int method9308(classPV var0, byte var1) {
      if (var0 == null) {
         var0.method9312(var1);
      }

      try {
         return var0.field5440 * 718414679;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.bx(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bz")
   public void method9253() {
      this.field5425 = this.field5432 * -1827024473;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cr")
   public void method9256() {
      this.field5440 = this.field5432 * -1807734201;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cx")
   int method9303() {
      return this.field5425 * -2078654985;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cb")
   public void method9257() {
      this.field5440 = this.field5432 * -1807734201;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ct")
   public void method9258() {
      this.field5440 = this.field5432 * -1807734201;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cp")
   public void method9259() {
      this.field5436 = 849426047 * this.field5432;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cq")
   public void method9263() {
      this.field5427 += 638451616;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ds")
   int method9283() {
      return -362269789 * this.field5431;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dg")
   int method9266() {
      return this.field5432 * 257906651;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cy")
   int method9270(int var1) {
      return this.field5441[var1 & 31];
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bn")
   int method9304(int var1) {
      try {
         return this.field5425 * -2078654985;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.bn(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ad")
   int method9267(int var1) {
      try {
         return this.field5432 * 2077496097;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cc")
   int method9273(int var1) {
      return this.field5428[var1 & 31];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dc")
   int method9277() {
      return this.field5429 * -634175101;
   }

   @ObfuscatedSignature(descriptor = "(Lpv;IB)V")
   @ObfuscatedName("tp")
   public static void method9230(classPV var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method9225(var1, var2);
      }

      var0.method9321(var1);

      try {
         var0.field5428[(var0.field5429 += 1089918251) * -634175101 - 1 & 31] = var1 & 32767;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "pv.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ah")
   int method9298(int var1) {
      try {
         return 1056232063 * this.field5439;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.ah(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpv;I)I")
   @ObfuscatedName("jp")
   public static int method9313(classPV var0, int var1) {
      if (var0 == null) {
         var0.method9280(var1);
      }

      try {
         return 1796613727 * var0.field5436;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.bc(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cw")
   int method9279(int var1) {
      return this.field5430[var1 & 31];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cl")
   public void method9264() {
      this.field5427 += 638451616;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpv;)I")
   @ObfuscatedName("nk")
   public static int method9294(classPV var0) {
      return var0.field5426 * -905640843;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cf")
   int method9274(int var1) {
      return this.field5428[var1 & 31];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   public void method9241() {
      this.field5438 = this.field5432 * -1458261562;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("as")
   public void method9222(int var1) {
      this.field5441[(this.field5427 += 1362128893) * 1285770944 - 1 & 1124523962] = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dh")
   int method9288() {
      return this.field5438 * -120272575;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cs")
   int method9309() {
      return this.field5440 * 718414679;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dv")
   int method9289() {
      return this.field5438 * -120272575;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dj")
   int method9285() {
      return -296195950 * this.field5435;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bg")
   public void method9265(int var1) {
      try {
         this.field5427 += 638451616;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dn")
   int method9295() {
      return this.field5426 * -905640843;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpv;I)V")
   @ObfuscatedName("oz")
   public static void method9223(classPV var0, int var1) {
      var0.field5441[(var0.field5427 += 1362128893) * 1886152021 - 1 & 31] = var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bf")
   public void method9244() {
      this.field5434 = -312040537 * this.field5432;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cz")
   int method9299() {
      return 1056232063 * this.field5439;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("di")
   int method9300() {
      return 1056232063 * this.field5439;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ai")
   int method9275(int var1, int var2) {
      try {
         return this.field5428[var1 & 31];
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "pv.ai(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("db")
   int method9305() {
      return this.field5425 * -2078654985;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dd")
   int method9306() {
      return this.field5425 * -2078654985;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("de")
   int method9314() {
      return 1796613727 * this.field5436;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("df")
   int method9307() {
      return this.field5425 * -2078654985;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfx;III)V")
   @ObfuscatedName("rm")
   public static void method9317(Model var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method5147(var1);
      }

      for (int var4 = 0; var4 < var0.field2424; var4++) {
         var0.field2427[var4] = (int)var0.field2427[var4] + var1;
         var0.field2430[var4] = (int)var0.field2430[var4] + var2;
         var0.field2426[var4] = (int)var0.field2426[var4] + var3;
      }

      classZG.method13998(var0);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ca")
   int method9310() {
      return this.field5440 * 718414679;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("yg")
   public void method9234(int var1) {
      this.field5437[(this.field5433 += -75721583) * -1415467919 - 1 & 31] = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ci")
   int method9311() {
      return this.field5440 * 718414679;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dx")
   int method9315() {
      return 1796613727 * this.field5436;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("do")
   int method9316() {
      return 1796613727 * this.field5436;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aa")
   public void method9247(byte var1) {
      try {
         this.field5439 = -699888003 * this.field5439;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ik")
   public void method9260(int var1) {
      try {
         this.field5432 = 849426047 * this.field5432;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpv;I)V")
   @ObfuscatedName("wm")
   public static void method9261(classPV var0, int var1) {
      if (var0 == null) {
         var0.method9260(var1);
      } else {
         try {
            var0.field5436 = 849426047 * var0.field5432;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "pv.ay(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpv;I)V")
   @ObfuscatedName("rt")
   public static void method9224(classPV var0, int var1) {
      if (var0 == null) {
         var0.method9237(var1);
      }

      var0.field5441[(var0.field5427 += 1955907487) * 1886152021 - 1 & 31] = var1;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("bx")
   int method9312(byte var1) {
      try {
         return this.field5438 * 718414679;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "pv.bx(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bc")
   int method9280(int var1) {
      return this.field5430[var1 & 31];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpv;)I")
   @ObfuscatedName("ov")
   public static int method9301(classPV var0) {
      return 1056232063 * var0.field5439;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("br")
   public void method9319(int var1) {
      Skill[] var2 = Skill.values();
      if (var1 >= 0 && var1 < var2.length) {
         int[] var3 = classOE.client.getIntStack();
         int[] var4 = classOE.client.getSkillExperiences();
         int[] var5 = classOE.client.getVarps();
         StatChanged var6 = new StatChanged(var2[var1], var3[var1], var5[var1], var4[var1]);
         classOE.client.getCallbacks().post(var6);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dm")
   int method9302() {
      return 1056232063 * this.field5438;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bj")
   public void method9321(int var1) {
      var1 &= 32767;
      NodeHashTable var2 = classOE.client.method2420();
      ItemContainer var3 = (ItemContainer)var2.method13383(var1);
      ItemContainer var4 = (ItemContainer)var2.method13383(var1 | 32768);
      if (var3 != null) {
         ItemContainerChanged var5 = new ItemContainerChanged(var1, var3);
         this.field5424.add(var5);
      }

      if (var4 != null) {
         ItemContainerChanged var7 = new ItemContainerChanged(var1 | 32768, var4);
         this.field5424.add(var7);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ab")
   public void method9225(int var1, byte var2) {
      try {
         this.field5441[(this.field5435 = this.field5433 + 1362128893) * 1886152021 - 1 & 31] = var1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "pv.af(" + ')');
      }
   }
}
