import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nl")
public class class345 {
   @ObfuscatedName("an")
   public static ArrayList midiRequests = new ArrayList(3);
   @ObfuscatedName("at")
   public static ArrayList field4311 = null;
   @ObfuscatedName("av")
   public static final List field4305 = new ArrayList();
   @ObfuscatedName("ad")
   static int field4306 = 0;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("ae")
   public static AbstractArchive field4317;
   @ObfuscatedName("aw")
   public static ArrayList field4309 = new ArrayList(3);
   @ObfuscatedName("ap")
   public static ArrayList field4310 = new ArrayList();
   @ObfuscatedName("ay")
   static int musicPlayerStatus = 0;
   @ObfuscatedName("au")
   static int field4312 = 0;
   @ObfuscatedName("az")
   static int field4307 = 0;
   @ObfuscatedName("ag")
   public static LinkedList field4308 = new LinkedList();
   @ToRemove(unused = "true")
   @ObfuscatedName("ch")
   static final int field4315 = 68;
   @ToRemove(unused = "true")
   @ObfuscatedName("eq")
   static final int field4316 = 4095;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/ArrayList;Z)V")
   @ObfuscatedName("bo")
   static void method7820(ArrayList var0, boolean var1) {
      if (!var1) {
         field4309.clear();
      }

      for (MidiRequest var3 : var0) {
         if (-1 != var3.musicTrackGroupId * 1685463904 && -1 != var3.musicTrackFileId * 1748386293) {
            if (!var1) {
               field4309.add(var3);
            }

            field4308.add(var3);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ab")
   public static void method7808(int var0, int var1) {
      ItemLayer.method5389(var0, var1, 0, 0, -1390521762);
      field4309.clear();
      field4310.clear();
      if (midiRequests.isEmpty() || var0 == 0 && var1 == 0) {
         classFM.method4028(498229697);
      } else {
         field4310.add(new DelayFadeTask(null, musicPlayerStatus * 847508035));
         field4310.add(new FadeOutTask(null, 0, false, field4312 * 595186573));
         ArrayList var2 = classLN.method7213((byte)99);
         field4310.add(new classSY(null, var2));
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/ArrayList;IIIIZ)V")
   @ObfuscatedName("az")
   public static void method7803(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (!var0.isEmpty()) {
         field4308.clear();
         field4310.clear();
         if (var5) {
            classFM.method4028(1940696954);
         } else {
            for (int var6 = 0; var6 < midiRequests.size(); var6++) {
               MidiRequest var7 = (MidiRequest)midiRequests.get(var6);
               if (null == var7) {
                  midiRequests.remove(var6);
                  var6--;
               } else if (var7.field4269) {
                  if (268210409 * var7.midiPcmStream.field4208 > 0) {
                     var7.midiPcmStream.field4208 -= 692421171;
                  }

                  var7.midiPcmStream.clear(1806462691);
                  var7.midiPcmStream.method7640((byte)-74);
                  MidiPcmStream.method7621(var7.midiPcmStream, 0, (byte)-73);
                  midiRequests.remove(var6);
                  var6--;
               } else {
                  var7.field4269 = true;
               }
            }
         }

         class27.method932(var0, var5, -1868414579);
         if (!field4308.isEmpty()) {
            ItemLayer.method5389(var1, var2, var3, var4, -1533711506);
            field4310.add(new AddRequestTask(null));
            field4310.add(new classSX(null, field4317, WidgetFocusInputManager.field3309, classGH.field2009));
            ArrayList var9 = new ArrayList();
            var9.add(new classSA(new FadeInTask(null, 0, true, -1868061233 * field4306)));
            if (!midiRequests.isEmpty()) {
               ArrayList var10 = new ArrayList();
               var10.add(new DelayFadeTask(new ConcurrentMidiTask(null, var9), -1544909203 * field4307));
               ArrayList var8 = classLN.method7213((byte)29);
               var10.add(new DelayFadeTask(new FadeOutTask(new classSY(null, var8), 0, false, -1003083165 * field4312), musicPlayerStatus * 1176264057));
               field4310.add(new ConcurrentMidiTask(null, var10));
            } else {
               field4310.add(new DelayFadeTask(null, 1197280793 * field4307));
               field4310.add(new ConcurrentMidiTask(null, var9));
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/ArrayList;IIIIZ)V")
   @ObfuscatedName("ad")
   public static void method7804(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (!var0.isEmpty()) {
         field4308.clear();
         field4310.clear();
         if (var5) {
            classFM.method4028(-831442096);
         } else {
            for (int var6 = 0; var6 < midiRequests.size(); var6++) {
               MidiRequest var7 = (MidiRequest)midiRequests.get(var6);
               if (null == var7) {
                  midiRequests.remove(var6);
                  var6--;
               } else if (var7.field4269) {
                  if (268210409 * var7.midiPcmStream.field4208 > 0) {
                     var7.midiPcmStream.field4208 -= 1683572569;
                  }

                  var7.midiPcmStream.clear(1806462691);
                  var7.midiPcmStream.method7640((byte)-122);
                  MidiPcmStream.method7621(var7.midiPcmStream, 0, (byte)-76);
                  midiRequests.remove(var6);
                  var6--;
               } else {
                  var7.field4269 = true;
               }
            }
         }

         class27.method932(var0, var5, -832709933);
         if (!field4308.isEmpty()) {
            ItemLayer.method5389(var1, var2, var3, var4, -1241693862);
            field4310.add(new AddRequestTask(null));
            field4310.add(new classSX(null, field4317, WidgetFocusInputManager.field3309, classGH.field2009));
            ArrayList var9 = new ArrayList();
            var9.add(new classSA(new FadeInTask(null, 0, true, -673721945 * field4306)));
            if (!midiRequests.isEmpty()) {
               ArrayList var10 = new ArrayList();
               var10.add(new DelayFadeTask(new ConcurrentMidiTask(null, var9), 1197280793 * field4307));
               ArrayList var8 = classLN.method7213((byte)114);
               var10.add(new DelayFadeTask(new FadeOutTask(new classSY(null, var8), 0, false, 595186573 * field4312), musicPlayerStatus * 847508035));
               field4310.add(new ConcurrentMidiTask(null, var10));
            } else {
               field4310.add(new DelayFadeTask(null, 1197280793 * field4307));
               field4310.add(new ConcurrentMidiTask(null, var9));
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/ArrayList;IIIIZ)V")
   @ObfuscatedName("ai")
   public static void method7805(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (!var0.isEmpty()) {
         field4308.clear();
         field4310.clear();
         if (var5) {
            classFM.method4028(155174330);
         } else {
            for (int var6 = 0; var6 < midiRequests.size(); var6++) {
               MidiRequest var7 = (MidiRequest)midiRequests.get(var6);
               if (null == var7) {
                  midiRequests.remove(var6);
                  var6--;
               } else if (var7.field4269) {
                  if (268210409 * var7.midiPcmStream.field4208 > 0) {
                     var7.midiPcmStream.field4208 -= 1683572569;
                  }

                  var7.midiPcmStream.clear(1806462691);
                  var7.midiPcmStream.method7640((byte)-67);
                  MidiPcmStream.method7621(var7.midiPcmStream, 0, (byte)95);
                  midiRequests.remove(var6);
                  var6--;
               } else {
                  var7.field4269 = true;
               }
            }
         }

         class27.method932(var0, var5, -651435928);
         if (!field4308.isEmpty()) {
            ItemLayer.method5389(var1, var2, var3, var4, -1716885493);
            field4310.add(new AddRequestTask(null));
            field4310.add(new classSX(null, field4317, WidgetFocusInputManager.field3309, classGH.field2009));
            ArrayList var9 = new ArrayList();
            var9.add(new classSA(new FadeInTask(null, 0, true, -673721945 * field4306)));
            if (!midiRequests.isEmpty()) {
               ArrayList var10 = new ArrayList();
               var10.add(new DelayFadeTask(new ConcurrentMidiTask(null, var9), 1197280793 * field4307));
               ArrayList var8 = classLN.method7213((byte)45);
               var10.add(new DelayFadeTask(new FadeOutTask(new classSY(null, var8), 0, false, 595186573 * field4312), musicPlayerStatus * 847508035));
               field4310.add(new ConcurrentMidiTask(null, var10));
            } else {
               field4310.add(new DelayFadeTask(null, 1197280793 * field4307));
               field4310.add(new ConcurrentMidiTask(null, var9));
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("as")
   public static void method7806(int var0) {
      if (!midiRequests.isEmpty()) {
         for (MidiRequest var2 : midiRequests) {
            if (null != var2) {
               var2.musicTrackVolume = var0 * 2082292442;
            }
         }

         MidiRequest var3 = (MidiRequest)midiRequests.get(0);
         if (var3 != null && var3.midiPcmStream != null && var3.midiPcmStream.isReady(-1609982307) && !var3.field4268) {
            MidiPcmStream.method7621(var3.midiPcmStream, var0, (byte)86);
            var3.field4267 = var0;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ac")
   public static void method7809(int var0, int var1) {
      ItemLayer.method5389(var0, var1, 0, 0, -1926602989);
      field4309.clear();
      field4310.clear();
      if (midiRequests.isEmpty() || var0 == 0 && var1 == 0) {
         classFM.method4028(2013657124);
      } else {
         field4310.add(new DelayFadeTask(null, musicPlayerStatus * 847508035));
         field4310.add(new FadeOutTask(null, 0, false, field4312 * 595186573));
         ArrayList var2 = classLN.method7213((byte)69);
         field4310.add(new classSY(null, var2));
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   public static void method7813() {
      field4309.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ax")
   public static void method7810(int var0, int var1, int var2, int var3) {
      if (midiRequests.size() > 1
         && midiRequests.get(0) != null
         && ((MidiRequest)midiRequests.get(0)).midiPcmStream.isReady(-2084282355)
         && midiRequests.get(1) != null
         && ((MidiRequest)midiRequests.get(1)).midiPcmStream.isReady(1429300634)) {
         ItemLayer.method5389(var0, var1, var2, var3, -1535297582);
         field4310.add(new SwapSongTask(null));
         ArrayList var4 = new ArrayList();
         var4.add(new DelayFadeTask(new FadeInTask(null, 1, false, field4306 * -673721945), field4307 * 1197280793));
         var4.add(new DelayFadeTask(new FadeOutTask(null, 0, false, field4312 * 595186573), 847508035 * musicPlayerStatus));
         field4310.add(new ConcurrentMidiTask(null, var4));
         if (field4309.get(0) != null && field4309.get(1) != null) {
            MidiRequest var5 = (MidiRequest)field4309.get(0);
            field4309.set(0, midiRequests.get(1));
            field4309.set(1, var5);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ar")
   public static void method7811(int var0, int var1, int var2, int var3) {
      if (midiRequests.size() > 1
         && midiRequests.get(0) != null
         && ((MidiRequest)midiRequests.get(0)).midiPcmStream.isReady(-2142712307)
         && midiRequests.get(1) != null
         && ((MidiRequest)midiRequests.get(1)).midiPcmStream.isReady(494690990)) {
         ItemLayer.method5389(var0, var1, var2, var3, -1681322291);
         field4310.add(new SwapSongTask(null));
         ArrayList var4 = new ArrayList();
         var4.add(new DelayFadeTask(new FadeInTask(null, 1, false, field4306 * -620928248), field4307 * 1197280793));
         var4.add(new DelayFadeTask(new FadeOutTask(null, 0, false, field4312 * -1212944131), 847508035 * musicPlayerStatus));
         field4310.add(new ConcurrentMidiTask(null, var4));
         if (field4309.get(0) != null && field4309.get(1) != null) {
            MidiRequest var5 = (MidiRequest)field4309.get(0);
            field4309.set(0, midiRequests.get(1));
            field4309.set(1, var5);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/ArrayList;Z)V")
   @ObfuscatedName("bg")
   static void method7821(ArrayList var0, boolean var1) {
      if (!var1) {
         field4309.clear();
      }

      for (MidiRequest var3 : var0) {
         if (-1 != var3.musicTrackGroupId * -2058822378 && -1 != var3.musicTrackFileId * 1590357891) {
            if (!var1) {
               field4309.add(var3);
            }

            field4308.add(var3);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   public static void method7814() {
      field4309.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   public static void method7815() {
      field4309.clear();
   }

   class345() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lja;Ljava/lang/String;)Ljk;")
   @ObfuscatedName("ao")
   public static class236 method7807(classJA var0, String var1) {
      return (class236)var0.field2797.get(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;I)V")
   @ObfuscatedName("ao")
   public static void method7816(AbstractArchive var0, int var1) {
      if (!field4309.isEmpty()) {
         ArrayList var2 = new ArrayList();

         for (MidiRequest var4 : field4309) {
            var4.field4279 = false;
            var4.field4278 = false;
            var4.field4268 = false;
            var4.field4269 = false;
            var4.musicTrackArchive = var0;
            var4.musicTrackVolume = -1589930535 * var1;
            var4.field4267 = 0.0F;
            var2.add(var4);
         }

         class113.method3918(var2, musicPlayerStatus * 847508035, field4312 * 595186573, field4307 * 1197280793, -673721945 * field4306, false, -1882065613);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;I)V")
   @ObfuscatedName("aa")
   public static void method7817(AbstractArchive var0, int var1) {
      if (!field4309.isEmpty()) {
         ArrayList var2 = new ArrayList();

         for (MidiRequest var4 : field4309) {
            var4.field4279 = false;
            var4.field4278 = false;
            var4.field4268 = false;
            var4.field4269 = false;
            var4.musicTrackArchive = var0;
            var4.musicTrackVolume = -1589930535 * var1;
            var4.field4267 = 0.0F;
            var2.add(var4);
         }

         class113.method3918(var2, musicPlayerStatus * -749762448, field4312 * 595186573, field4307 * -163081417, 1658474198 * field4306, false, -1882065613);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;I)V")
   @ObfuscatedName("aq")
   public static void method7818(AbstractArchive var0, int var1) {
      if (!field4309.isEmpty()) {
         ArrayList var2 = new ArrayList();

         for (MidiRequest var4 : field4309) {
            var4.field4279 = false;
            var4.field4278 = false;
            var4.field4268 = false;
            var4.field4269 = false;
            var4.musicTrackArchive = var0;
            var4.musicTrackVolume = -1589930535 * var1;
            var4.field4267 = 0.0F;
            var2.add(var4);
         }

         class113.method3918(var2, musicPlayerStatus * 847508035, field4312 * 595186573, field4307 * 1197280793, -673721945 * field4306, false, -1882065613);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("be")
   public static boolean method7819() {
      boolean var0 = false;
      boolean var1 = false;
      if (!field4310.isEmpty()) {
         SongTask var2 = (SongTask)field4310.get(0);
         if (null == var2) {
            field4310.remove(0);
         } else if (var2.vmethod325((byte)59)) {
            if (var2.method10527(-2101685859)) {
               System.out.println("Error in midimanager.service: " + var2.method10533((short)20378));
               var0 = true;
            } else {
               if (var2.method10538((byte)-49) != null) {
                  field4310.add(1, var2.method10538((byte)4));
               }

               var1 = var2.method10531(-576153918);
            }

            field4310.remove(0);
         } else {
            var1 = var2.method10531(1190453730);
         }
      }

      if (var0) {
         field4310.clear();
         classFM.method4028(-255934713);
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ah")
   public static void method7812(int var0, int var1, int var2, int var3) {
      if (midiRequests.size() > 1
         && midiRequests.get(0) != null
         && ((MidiRequest)midiRequests.get(0)).midiPcmStream.isReady(922813434)
         && midiRequests.get(1) != null
         && ((MidiRequest)midiRequests.get(1)).midiPcmStream.isReady(526168077)) {
         ItemLayer.method5389(var0, var1, var2, var3, -1594377330);
         field4310.add(new SwapSongTask(null));
         ArrayList var4 = new ArrayList();
         var4.add(new DelayFadeTask(new FadeInTask(null, 1, false, field4306 * -673721945), field4307 * -1973363515));
         var4.add(new DelayFadeTask(new FadeOutTask(null, 0, false, field4312 * -1053790576), 847508035 * musicPlayerStatus));
         field4310.add(new ConcurrentMidiTask(null, var4));
         if (field4309.get(0) != null && field4309.get(1) != null) {
            MidiRequest var5 = (MidiRequest)field4309.get(0);
            field4309.set(0, midiRequests.get(1));
            field4309.set(1, var5);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bs")
   public static void method7822(int var0, int var1, int var2, int var3) {
      musicPlayerStatus = var0 * 497969771;
      field4312 = var1 * 1561175877;
      field4307 = 1402629673 * var2;
      field4306 = 1099154967 * var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bz")
   public static void method7823(int var0, int var1, int var2, int var3) {
      musicPlayerStatus = var0 * -267321389;
      field4312 = var1 * 432415076;
      field4307 = 1402629673 * var2;
      field4306 = -1643322269 * var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljava/util/ArrayList;")
   @ObfuscatedName("bk")
   static ArrayList method7824() {
      ArrayList var0 = new ArrayList();

      for (MidiRequest var2 : midiRequests) {
         var0.add(var2);
      }

      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   static void method7825() {
      for (MidiRequest var1 : midiRequests) {
         if (null != var1) {
            var1.midiPcmStream.clear(1806462691);
            var1.midiPcmStream.method7640((byte)1);
            MidiPcmStream.method7621(var1.midiPcmStream, 0, (byte)-34);
            var1.midiPcmStream.field4208 = 0;
            int var2 = -1778393937 * var1.musicTrackGroupId;
            int var3 = var1.musicTrackFileId * -1740472291;

            for (classNE var5 : field4305) {
               var5.vmethod129(var2, var3, (byte)8);
            }
         }
      }

      midiRequests.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bj")
   static void method7826() {
      for (MidiRequest var1 : midiRequests) {
         if (null != var1) {
            var1.midiPcmStream.clear(1806462691);
            var1.midiPcmStream.method7640((byte)-39);
            MidiPcmStream.method7621(var1.midiPcmStream, 0, (byte)117);
            var1.midiPcmStream.field4208 = 0;
            int var2 = 879499174 * var1.musicTrackGroupId;
            int var3 = var1.musicTrackFileId * -1740472291;

            for (classNE var5 : field4305) {
               var5.vmethod129(var2, var3, (byte)8);
            }
         }
      }

      midiRequests.clear();
   }

   @ObfuscatedSignature(descriptor = "(Lmj;B)V")
   @ObfuscatedName("ht")
   static void method7827(PacketBufferNode var0, byte var1) {
      try {
         var0.packetBuffer.writeInt(1599863785 * class147.archive8.hash, 1601892810);
         Buffer.method12191(var0.packetBuffer, ActorSpotAnim.archive13.hash * 1599863785, 342120622);
         Buffer.method12187(var0.packetBuffer, 1599863785 * classSI.field5792.hash, 1138536888);
         var0.packetBuffer.writeIntIME(1599863785 * class175.field1995.hash, 783375377);
         var0.packetBuffer.writeInt(class226.field2779.hash * 1599863785, 110926160);
         Buffer.method12191(var0.packetBuffer, GrandExchangeOfferOwnWorldComparator.field422.hash * 1599863785, 1177974147);
         var0.packetBuffer.writeInt(1599863785 * HttpRequestTask.archive10.hash, 1644301954);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "nl.ht(" + ')');
      }
   }
}
