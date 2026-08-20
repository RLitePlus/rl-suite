import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("js")
public class ClientPacket implements classJN {
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bp")
   public static final ClientPacket CONNECTION_TELEMETRY = new ClientPacket(29, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("af")
   public static final ClientPacket IF_BUTTONX = new ClientPacket(1, 9);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ae")
   public static final ClientPacket OPWORLDENTITY4 = new ClientPacket(2, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ab")
   public static final ClientPacket RESUME_P_OBJDIALOG = new ClientPacket(3, 2);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dj")
   public static final ClientPacket OPNPC6 = new ClientPacket(101, 2);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("as")
   static final ClientPacket field3378 = new ClientPacket(5, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ax")
   static final ClientPacket field3379 = new ClientPacket(6, 7);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ac")
   public static final ClientPacket IDLE = new ClientPacket(7, 0);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("aa")
   public static final ClientPacket OPLOC3_V2 = new ClientPacket(8, 8);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ao")
   public static final ClientPacket OPOBJ6 = new ClientPacket(9, 6);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("al")
   public static final ClientPacket OPWORLDENTITYT = new ClientPacket(10, 11);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("du")
   public static final ClientPacket OPOBJU = new ClientPacket(84, 15);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ay")
   public static final ClientPacket REFLECTION_CHECK_REPLY = new ClientPacket(12, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ch")
   public static final ClientPacket OPLOC4_V2 = new ClientPacket(69, 8);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bt")
   public static final ClientPacket SEND_PING_REPLY = new ClientPacket(32, 10);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ap")
   public static final ClientPacket IF_CRMVIEW_OP = new ClientPacket(15, 22);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bj")
   static final ClientPacket field3407 = new ClientPacket(34, 7);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ai")
   public static final ClientPacket AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL = new ClientPacket(17, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ar")
   static final ClientPacket field3391 = new ClientPacket(18, 7);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("eh")
   public static final ClientPacket OPOBJ1_V2 = new ClientPacket(112, 8);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dc")
   public static final ClientPacket CLICKWORLDMAP = new ClientPacket(78, 4);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("av")
   public static final ClientPacket OPPLAYER2 = new ClientPacket(21, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ct")
   public static final ClientPacket EVENT_CAMERA_POSITION = new ClientPacket(55, 4);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("an")
   static final ClientPacket field3466 = new ClientPacket(23, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("am")
   static final ClientPacket field3397 = new ClientPacket(24, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bk")
   public static final ClientPacket OPNPC4_V2 = new ClientPacket(35, 4);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ad")
   public static final ClientPacket BUG_REPORT = new ClientPacket(14, -2);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bx")
   public static final ClientPacket MAP_BUILD_COMPLETE = new ClientPacket(27, 0);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bc")
   static final ClientPacket field3401 = new ClientPacket(28, 7);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("es")
   public static final ClientPacket OPNPCU = new ClientPacket(107, 11);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("br")
   public static final ClientPacket EVENT_APPLET_FOCUS = new ClientPacket(30, 1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bm")
   static final ClientPacket field3446 = new ClientPacket(31, 7);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("aq")
   public static final ClientPacket TELEPORT = new ClientPacket(13, 9);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bg")
   public static final ClientPacket CLANCHANNEL_FULL_REQUEST = new ClientPacket(33, 1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dq")
   public static final ClientPacket CLOSE_MODAL = new ClientPacket(98, 0);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cl")
   public static final ClientPacket IF_SCRIPT_TRIGGER = new ClientPacket(58, -2);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bo")
   public static final ClientPacket OPPLAYER3 = new ClientPacket(36, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bu")
   public static final ClientPacket CLANCHANNEL_KICKUSER = new ClientPacket(37, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ba")
   public static final ClientPacket OPOBJT = new ClientPacket(38, 15);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bw")
   public static final ClientPacket IF_BUTTOND = new ClientPacket(39, 16);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ca")
   public static final ClientPacket OPOBJ4_V2 = new ClientPacket(65, 8);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bi")
   public static final ClientPacket OPPLAYER8 = new ClientPacket(41, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("be")
   public static final ClientPacket OPPLAYERU = new ClientPacket(42, 11);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("by")
   public static final ClientPacket OPNPC3_V2 = new ClientPacket(43, 4);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bq")
   public static final ClientPacket WINDOW_STATUS = new ClientPacket(44, 5);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bf")
   public static final ClientPacket OPPLAYERT = new ClientPacket(45, 11);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bs")
   public static final ClientPacket SOUND_JINGLEEND = new ClientPacket(46, 4);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ag")
   public static final ClientPacket OPPLAYER6 = new ClientPacket(4, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bl")
   public static final ClientPacket OPWORLDENTITY2 = new ClientPacket(48, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bv")
   public static final ClientPacket OPWORLDENTITY3 = new ClientPacket(49, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ed")
   public static final ClientPacket SET_HEADING = new ClientPacket(109, 1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ds")
   public static final ClientPacket CLANSETTINGS_FULL_REQUEST = new ClientPacket(100, 1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cr")
   public static final ClientPacket OPPLAYER5 = new ClientPacket(52, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cu")
   static final ClientPacket field3426 = new ClientPacket(53, 7);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cb")
   public static final ClientPacket RESUME_P_STRINGDIALOG = new ClientPacket(54, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("aw")
   static final ClientPacket field3392 = new ClientPacket(19, 7);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cp")
   public static final ClientPacket MESSAGE_PUBLIC = new ClientPacket(56, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cq")
   public static final ClientPacket OPPLAYER1 = new ClientPacket(57, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dh")
   public static final ClientPacket OPLOC2_V2 = new ClientPacket(90, 8);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cd")
   public static final ClientPacket OPNPC1_V2 = new ClientPacket(59, 4);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ex")
   public static final ClientPacket FRIENDLIST_DEL = new ClientPacket(115, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cs")
   public static final ClientPacket MOVE_MINIMAPCLICK = new ClientPacket(61, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cy")
   public static final ClientPacket RESUME_P_COUNTDIALOG = new ClientPacket(62, 4);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("co")
   public static final ClientPacket OPNPCT = new ClientPacket(63, 11);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cw")
   static final ClientPacket field3463 = new ClientPacket(72, 7);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bb")
   public static final ClientPacket EVENT_MOUSE_CLICK_V2 = new ClientPacket(40, 7);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cc")
   public static final ClientPacket FRIENDCHAT_SETRANK = new ClientPacket(66, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("au")
   public static final ClientPacket SET_CHATFILTERSETTINGS = new ClientPacket(16, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cn")
   public static final ClientPacket OPLOCT = new ClientPacket(68, 15);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ck")
   public static final ClientPacket OPPLAYER4 = new ClientPacket(64, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cz")
   public static final ClientPacket RESUME_P_NAMEDIALOG = new ClientPacket(70, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cg")
   public static final ClientPacket EXIT_FREECAM = new ClientPacket(71, 0);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("az")
   static final ClientPacket EVENT_MOUSE_CLICK_V1 = new ClientPacket(0, 6);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bd")
   public static final ClientPacket EVENT_KEYBOARD = new ClientPacket(47, -2);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dy")
   public static final ClientPacket RESUME_PAUSEBUTTON = new ClientPacket(82, 6);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cx")
   public static final ClientPacket OPOBJ5_V2 = new ClientPacket(75, 8);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ce")
   static final ClientPacket MEMBERSHIP_PROMOTION_ELIGIBILITY = new ClientPacket(76, 2);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cj")
   public static final ClientPacket OPNPC5_V2 = new ClientPacket(73, 4);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dw")
   static final ClientPacket RSEVEN_STATUS = new ClientPacket(89, 1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dd")
   public static final ClientPacket CLIENT_CHEAT = new ClientPacket(79, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dm")
   public static final ClientPacket IF_BUTTONT = new ClientPacket(80, 16);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dx")
   public static final ClientPacket IGNORELIST_ADD = new ClientPacket(81, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cv")
   public static final ClientPacket AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL = new ClientPacket(60, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ah")
   public static final ClientPacket OPWORLDENTITY6 = new ClientPacket(25, 2);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ci")
   public static final ClientPacket OPLOC1_V2 = new ClientPacket(74, 8);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dt")
   public static final ClientPacket OPWORLDENTITYU = new ClientPacket(85, 11);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dr")
   public static final ClientPacket IGNORELIST_DEL = new ClientPacket(86, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dk")
   public static final ClientPacket OPNPC2_V2 = new ClientPacket(87, 4);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("db")
   static final ClientPacket EVENT_NATIVE_MOUSE_MOVE = new ClientPacket(88, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("el")
   public static final ClientPacket RESUME_P_COUNTDIALOG_LONG = new ClientPacket(111, 8);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dg")
   public static final ClientPacket OPWORLDENTITY1 = new ClientPacket(96, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("de")
   public static final ClientPacket UPDATE_PLAYER_MODEL_V2 = new ClientPacket(91, 26);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dz")
   public static final ClientPacket SEND_SNAPSHOT = new ClientPacket(92, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dn")
   public static final ClientPacket OPWORLDENTITY5 = new ClientPacket(93, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dv")
   static final ClientPacket field3467 = new ClientPacket(94, 7);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("do")
   public static final ClientPacket IF_SUBOP = new ClientPacket(95, 10);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cf")
   public static final ClientPacket FRIENDLIST_ADD = new ClientPacket(67, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dl")
   public static final ClientPacket FRIENDCHAT_JOIN_LEAVE = new ClientPacket(97, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ek")
   static final ClientPacket field3488 = new ClientPacket(106, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("df")
   public static final ClientPacket NO_TIMEOUT = new ClientPacket(99, 0);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("at")
   public static final ClientPacket OPOBJ3_V2 = new ClientPacket(22, 8);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ak")
   static final ClientPacket field3474 = new ClientPacket(20, 7);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("da")
   public static final ClientPacket MOVE_GAMECLICK = new ClientPacket(102, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("dp")
   public static final ClientPacket DETECT_MODIFIED_CLIENT = new ClientPacket(103, 4);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ey")
   static final ClientPacket field3477 = new ClientPacket(104, 7);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ea")
   public static final ClientPacket OPLOC6 = new ClientPacket(105, 2);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bn")
   static final ClientPacket field3479 = new ClientPacket(26, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bh")
   public static final ClientPacket OPPLAYER7 = new ClientPacket(50, 3);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("aj")
   public static final ClientPacket IF_BUTTON = new ClientPacket(11, 4);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("cm")
   public static final ClientPacket OPLOC5_V2 = new ClientPacket(77, 8);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ev")
   static final ClientPacket HISCORE_REQUEST = new ClientPacket(110, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("di")
   public static final ClientPacket EVENT_MOUSE_SCROLL = new ClientPacket(83, 2);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("bz")
   public static final ClientPacket FRIENDCHAT_KICK = new ClientPacket(51, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("eg")
   public static final ClientPacket OPOBJ2_V2 = new ClientPacket(113, 8);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("en")
   public static final ClientPacket EVENT_MOUSE_MOVE = new ClientPacket(114, -1);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("ej")
   public static final ClientPacket MESSAGE_PRIVATE = new ClientPacket(108, -2);
   @ObfuscatedSignature(descriptor = "Ljs;")
   @ObfuscatedName("eq")
   public static final ClientPacket OPLOCU = new ClientPacket(116, 15);
   @ObfuscatedName("er")
   final int id;
   @ObfuscatedName("eo")
   final int length;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lom;IJ)J")
   @ObfuscatedName("dp")
   public static long method6412(classOM var0, int var1, long var2) {
      if (var0 == null) {
         var0.getSizeY();
      }

      return classBW.method1276(var0.field4931, var1, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrq;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ti")
   public static int method6409(classRQ var0, Object var1, Object var2) {
      if (var0 == null) {
         var0.compare(var1, var1);
      }

      return var0.method10158((classRO)var1, (classRO)var2, 1217642458);
   }

   ClientPacket(int var1, int var2) {
      this.id = -910918935 * var1;
      this.length = -1719371919 * var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpl;)Loz;")
   @ObfuscatedName("oo")
   public static classOZ method6411(classPL var0) {
      return var0.field5318;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgn;)I")
   @ObfuscatedName("lh")
   public static int method6410(classGN var0) {
      return var0.field2627.length;
   }

   @ObfuscatedSignature(descriptor = "(IIIZI)V")
   @ObfuscatedName("gh")
   public static void method6413(int var0, int var1, int var2, boolean var3, int var4) {
      try {
         PacketBufferNode var5 = classEF.getPacketBufferNode(TELEPORT, client.packetWriter.isaacCipher, (byte)-48);
         var5.packetBuffer.method13156(var2, (byte)49);
         var5.packetBuffer.method13188(var0, (short)-15818);
         int var10001;
         if (var3) {
            if (var4 == 292466431) {
               throw new IllegalStateException();
            }

            var10001 = -1913905689 * client.field920;
         } else {
            var10001 = 0;
         }

         var5.packetBuffer.method12979(var10001, -872122808);
         var5.packetBuffer.method12973(var1, -1542382992);
         client.packetWriter.addNode(var5, -1301097035);
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "js.gh(" + ')');
      }
   }
}
