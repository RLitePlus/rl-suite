import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jj")
public class ServerPacket {
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fg")
   public static final ServerPacket AMBIENTSOUND_START = new ServerPacket(135, 3);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("af")
   public static final ServerPacket IF_SETOBJECT = new ServerPacket(1, 10);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ae")
   public static final ServerPacket MESSAGE_FRIENDCHANNEL = new ServerPacket(2, -1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ab")
   public static final ServerPacket HINT_ARROW = new ServerPacket(3, 6);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ag")
   public static final ServerPacket IF_SETANGLE = new ServerPacket(4, 10);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ft")
   public static final ServerPacket CAM_UNLOCK = new ServerPacket(149, 1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ax")
   public static final ServerPacket SET_INTERACTION_MODE = new ServerPacket(6, 4);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ac")
   public static final ServerPacket CLANCHANNEL_FULL = new ServerPacket(7, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dc")
   public static final ServerPacket IF_SETSCROLLPOS = new ServerPacket(78, 6);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("as")
   public static final ServerPacket CLANSETTINGS_DELTA = new ServerPacket(5, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("al")
   public static final ServerPacket RUNCLIENTSCRIPT = new ServerPacket(10, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bc")
   public static final ServerPacket IF_SETCOLOUR = new ServerPacket(28, 6);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ar")
   public static final ServerPacket CHAT_FILTER_SETTINGS = new ServerPacket(18, 2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("aq")
   public static final ServerPacket MAP_ANIM = new ServerPacket(13, 6);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bh")
   public static final ServerPacket IF_SETPLAYERMODEL_OBJ = new ServerPacket(50, 8);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ap")
   public static final ServerPacket SET_HEATMAP_ENABLED = new ServerPacket(15, 1);
   @ObfuscatedName("fm")
   public final int length;
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ai")
   public static final ServerPacket CAM_RESET = new ServerPacket(17, 0);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bn")
   public static final ServerPacket LOGOUT_TRANSFER = new ServerPacket(26, -1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ed")
   public static final ServerPacket UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER = new ServerPacket(109, -1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fl")
   public static final ServerPacket CAM_MOVETO_ARC_V3 = new ServerPacket(131, 15);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bq")
   public static final ServerPacket UNKNOWN_STRING = new ServerPacket(44, -1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("at")
   public static final ServerPacket IF_SETPLAYERHEAD = new ServerPacket(22, 4);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("au")
   static final ServerPacket SOUND_AREA = new ServerPacket(16, 7);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("am")
   public static final ServerPacket UPDATE_FRIENDLIST = new ServerPacket(24, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ah")
   public static final ServerPacket VARCLAN_DISABLE = new ServerPacket(25, 0);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("en")
   public static final ServerPacket OBJ_ADD_SPECIFIC = new ServerPacket(114, 17);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bx")
   public static final ServerPacket MESSAGE_PRIVATE_ECHO = new ServerPacket(27, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dq")
   public static final ServerPacket SYNTH_SOUND = new ServerPacket(98, 5);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bp")
   public static final ServerPacket UPDATE_TRADINGPOST = new ServerPacket(29, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("eh")
   public static final ServerPacket HIDEOBJOPS = new ServerPacket(112, 1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bm")
   public static final ServerPacket MIDI_SWAP = new ServerPacket(31, 8);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bt")
   public static final ServerPacket CAM_MODE = new ServerPacket(32, 1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cr")
   public static final ServerPacket OBJ_CUSTOMISE_SPECIFIC = new ServerPacket(52, 20);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bj")
   public static final ServerPacket CAM_SMOOTHRESET = new ServerPacket(34, 4);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cs")
   public static final ServerPacket IF_SETNPCHEAD = new ServerPacket(61, 6);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bo")
   public static final ServerPacket MESSAGE_PRIVATE = new ServerPacket(36, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ba")
   public static final ServerPacket LOC_ADD_CHANGE_V2 = new ServerPacket(38, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("aa")
   public static final ServerPacket MIDI_SONG_STOP = new ServerPacket(8, 4);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bw")
   public static final ServerPacket REBUILD_NORMAL_V2 = new ServerPacket(39, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ex")
   public static final ServerPacket SEND_PING = new ServerPacket(115, 8);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bi")
   public static final ServerPacket LOC_DEL = new ServerPacket(41, 2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("be")
   public static final ServerPacket IF_SETPLAYERMODEL_BASECOLOUR = new ServerPacket(42, 6);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("di")
   public static final ServerPacket PLAYER_SPOTANIM_SPECIFIC = new ServerPacket(83, 9);
   @ObfuscatedName("fc")
   public final int id;
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bf")
   public static final ServerPacket IF_OPENSUB = new ServerPacket(45, 7);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bs")
   public static final ServerPacket CLANCHANNEL_DELTA = new ServerPacket(46, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bb")
   public static final ServerPacket MIDI_JINGLE = new ServerPacket(40, 5);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bl")
   public static final ServerPacket LOC_MERGE = new ServerPacket(48, 14);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cu")
   public static final ServerPacket SITE_SETTINGS = new ServerPacket(53, -1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ej")
   public static final ServerPacket IF_SETPOSITION = new ServerPacket(108, 8);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bz")
   public static final ServerPacket IF_MOVESUB = new ServerPacket(51, 8);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ad")
   public static final ServerPacket UPDATE_INV_STOPTRANSMIT = new ServerPacket(14, 2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bk")
   public static final ServerPacket IF_OPENTOP = new ServerPacket(35, 2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bd")
   public static final ServerPacket MIDI_SONG_WITHSECONDARY = new ServerPacket(47, 12);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ct")
   public static final ServerPacket HIDELOCOPS = new ServerPacket(55, 1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cp")
   public static final ServerPacket LOGOUT_WITHREASON = new ServerPacket(56, 1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ce")
   public static final ServerPacket CHAT_FILTER_SETTINGS_PRIVATECHAT = new ServerPacket(76, 1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cl")
   public static final ServerPacket RESET_ANIMS = new ServerPacket(58, 0);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cd")
   public static final ServerPacket IF_SETANIM = new ServerPacket(59, 6);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cv")
   public static final ServerPacket IF_CLEARINV = new ServerPacket(60, 4);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cx")
   public static final ServerPacket REBUILD_WORLDENTITY_V4 = new ServerPacket(75, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ay")
   public static final ServerPacket REBUILD_REGION_V2 = new ServerPacket(12, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("co")
   public static final ServerPacket UPDATE_STAT_V2 = new ServerPacket(63, 7);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ck")
   public static final ServerPacket IF_SETPLAYERMODEL_BODYTYPE = new ServerPacket(64, 5);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("an")
   public static final ServerPacket UPDATE_INV_PARTIAL = new ServerPacket(23, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cc")
   public static final ServerPacket UPDATE_REBOOT_TIMER_V2 = new ServerPacket(66, -1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cb")
   public static final ServerPacket IF_SETHIDE = new ServerPacket(54, 5);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cn")
   public static final ServerPacket VARP_RESET = new ServerPacket(68, 0);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ch")
   static final ServerPacket HISCORE_REPLY = new ServerPacket(69, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cz")
   public static final ServerPacket FRIENDLIST_LOADED = new ServerPacket(70, 0);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cg")
   public static final ServerPacket CAM_TARGET_V3 = new ServerPacket(71, 5);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cw")
   public static final ServerPacket PROJANIM_SPECIFIC_V4 = new ServerPacket(72, 27);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cj")
   public static final ServerPacket MESSAGE_GAME = new ServerPacket(73, -1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ci")
   public static final ServerPacket UPDATE_INV_FULL = new ServerPacket(74, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fo")
   public static final ServerPacket CAM_MOVETO_CYCLES_V3 = new ServerPacket(130, 11);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dd")
   public static final ServerPacket MESSAGE_CLANCHANNEL_SYSTEM = new ServerPacket(79, -1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cm")
   public static final ServerPacket TRIGGER_ONDIALOGABORT = new ServerPacket(77, 0);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ei")
   public static final ServerPacket REFLECTION_CHECKER = new ServerPacket(125, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fb")
   public static final ServerPacket GROUP_VAR_LONG = new ServerPacket(137, 13);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dm")
   public static final ServerPacket WORLDENTITY_INFO_V7 = new ServerPacket(80, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dx")
   public static final ServerPacket MIDI_SONG_V2 = new ServerPacket(81, 10);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("eu")
   public static final ServerPacket RESET_INTERACTION_MODE = new ServerPacket(121, 2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fv")
   public static final ServerPacket GROUP_VAR_INT = new ServerPacket(144, 9);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("du")
   public static final ServerPacket LOC_ANIM_SPECIFIC = new ServerPacket(84, 6);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dt")
   public static final ServerPacket SET_PLAYER_OP = new ServerPacket(85, -1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dr")
   public static final ServerPacket OBJ_DEL_SPECIFIC = new ServerPacket(86, 10);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dk")
   public static final ServerPacket OBJ_ENABLED_OPS_SPECIFIC = new ServerPacket(87, 7);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("db")
   public static final ServerPacket UPDATE_FRIENDCHAT_CHANNEL_FULL_V2 = new ServerPacket(88, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dw")
   public static final ServerPacket OBJ_UNCUSTOMISE_SPECIFIC = new ServerPacket(89, 10);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dh")
   public static final ServerPacket MAP_ANIM_SPECIFIC = new ServerPacket(90, 8);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("de")
   public static final ServerPacket PLAYER_INFO = new ServerPacket(91, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dz")
   public static final ServerPacket SERVER_TICK_END = new ServerPacket(92, 0);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dn")
   public static final ServerPacket NPC_INFO_LARGE_V5 = new ServerPacket(93, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dv")
   public static final ServerPacket VARP_LARGE = new ServerPacket(94, 6);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("do")
   public static final ServerPacket CAM_ROTATEBY = new ServerPacket(95, 7);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dg")
   public static final ServerPacket NPC_HEADICON_SPECIFIC = new ServerPacket(96, 9);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dl")
   public static final ServerPacket CLANSETTINGS_FULL = new ServerPacket(97, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cf")
   public static final ServerPacket IF_SETNPCHEAD_ACTIVE = new ServerPacket(67, 6);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("df")
   public static final ServerPacket UPDATE_UID192 = new ServerPacket(99, 28);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ds")
   public static final ServerPacket VARP_SYNC = new ServerPacket(100, 0);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dj")
   public static final ServerPacket NPC_SPOTANIM_SPECIFIC = new ServerPacket(101, 9);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ak")
   public static final ServerPacket SET_ACTIVE_WORLD_V2 = new ServerPacket(20, 3);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dp")
   public static final ServerPacket UPDATE_STOCKMARKET_SLOT = new ServerPacket(103, 20);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ey")
   public static final ServerPacket VARCLAN_ENABLE = new ServerPacket(104, 0);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("by")
   public static final ServerPacket MESSAGE_CLANCHANNEL = new ServerPacket(43, -1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ek")
   public static final ServerPacket IF_SETEVENTS_V2 = new ServerPacket(106, 16);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("es")
   public static final ServerPacket URL_OPEN = new ServerPacket(107, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("eb")
   public static final ServerPacket VARP_SMALL = new ServerPacket(127, 3);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bu")
   public static final ServerPacket LOGOUT = new ServerPacket(37, 0);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ev")
   public static final ServerPacket HIDENPCOPS = new ServerPacket(110, 1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("el")
   public static final ServerPacket SET_NPC_UPDATE_ORIGIN = new ServerPacket(111, 2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fu")
   public static final ServerPacket AMBIENTSOUND_STOP = new ServerPacket(138, 1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("eg")
   public static final ServerPacket CAM_SHAKE = new ServerPacket(113, 4);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("da")
   public static final ServerPacket ANIM_SPECIFIC = new ServerPacket(102, 3);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("az")
   public static final ServerPacket CAM_TARGET_V4 = new ServerPacket(0, 5);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("eq")
   public static final ServerPacket IF_CLOSESUB = new ServerPacket(116, 4);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("er")
   public static final ServerPacket NPC_ANIM_SPECIFIC = new ServerPacket(117, 5);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("eo")
   public static final ServerPacket UPDATE_ZONE_PARTIAL_FOLLOWS = new ServerPacket(118, 3);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("et")
   public static final ServerPacket NPC_INFO_SMALL_V5 = new ServerPacket(119, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ew")
   public static final ServerPacket UPDATE_RUNENERGY = new ServerPacket(120, 2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cy")
   public static final ServerPacket IF_SETPLAYERMODEL_SELF = new ServerPacket(62, 5);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ef")
   public static final ServerPacket MINIMAP_TOGGLE = new ServerPacket(122, 1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("em")
   public static final ServerPacket LOC_ANIM = new ServerPacket(123, 4);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ez")
   public static final ServerPacket OBJ_COUNT_SPECIFIC = new ServerPacket(124, 14);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("aw")
   public static final ServerPacket UPDATE_RUNWEIGHT = new ServerPacket(19, 2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ee")
   public static final ServerPacket UPDATE_ZONE_FULL_FOLLOWS = new ServerPacket(126, 3);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("av")
   public static final ServerPacket VARCLAN = new ServerPacket(21, -1);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ep")
   public static final ServerPacket CAM_ROTATETO_COORDINATE_V3 = new ServerPacket(128, 11);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ec")
   static final ServerPacket field3297 = new ServerPacket(129, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ca")
   public static final ServerPacket OCULUS_SYNC = new ServerPacket(65, 4);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fj")
   public static final ServerPacket IF_SETMODEL_V2 = new ServerPacket(132, 8);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ea")
   public static final ServerPacket IF_SETROTATESPEED = new ServerPacket(105, 8);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fd")
   public static final ServerPacket CAM_ROTATETO_COORDINATE_V2 = new ServerPacket(133, 9);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fy")
   public static final ServerPacket CAM_MOVETO_V3 = new ServerPacket(134, 9);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bv")
   public static final ServerPacket UPDATE_ZONE_PARTIAL_ENCLOSED = new ServerPacket(49, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fi")
   public static final ServerPacket SET_MAP_FLAG_V2 = new ServerPacket(136, 4);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("cq")
   public static final ServerPacket PACKET_GROUP_START = new ServerPacket(57, 2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("dy")
   public static final ServerPacket ACCOUNT_FLAGS = new ServerPacket(82, 8);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fz")
   public static final ServerPacket GROUP_FULL = new ServerPacket(139, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fh")
   public static final ServerPacket CAM_SKYBOX = new ServerPacket(140, 4);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fq")
   public static final ServerPacket NPC_INFO_LARGE_V6 = new ServerPacket(141, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fp")
   public static final ServerPacket GROUP_VAR = new ServerPacket(142, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fs")
   public static final ServerPacket CAM_MOVETO_ARC_V2 = new ServerPacket(143, 14);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ao")
   public static final ServerPacket UPDATE_IGNORELIST = new ServerPacket(9, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fn")
   public static final ServerPacket CAM_LOOKAT_CYCLES = new ServerPacket(145, 10);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fk")
   public static final ServerPacket CAM_LOOKAT_V2 = new ServerPacket(146, 8);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fx")
   public static final ServerPacket CAM_MOVETO_CYCLES_V2 = new ServerPacket(147, 10);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fr")
   public static final ServerPacket CAM_LOOKAT_V3 = new ServerPacket(148, 9);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("aj")
   public static final ServerPacket IF_SETTEXT = new ServerPacket(11, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("ff")
   public static final ServerPacket NPC_INFO_SMALL_V6 = new ServerPacket(150, -2);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("fe")
   public static final ServerPacket CAM_MOVETO_V2 = new ServerPacket(151, 8);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("bg")
   public static final ServerPacket CAM_ROTATETO = new ServerPacket(33, 7);
   @ObfuscatedSignature(descriptor = "Ljj;")
   @ObfuscatedName("br")
   public static final ServerPacket IF_RESYNC_V2 = new ServerPacket(30, -2);

   @ObfuscatedSignature(descriptor = "(IB)Lpg;")
   @ObfuscatedName("ae")
   public static classPG method6372(int var0, byte var1) {
      try {
         classPG var2 = (classPG)classPG.field5238.method6422(var0);
         if (null != var2) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = classBQ.field531.method11867(15, var0, -869055847);
            var2 = new classPG(new Buffer(var3), var0);
            classPG.field5238.method6428(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "jj.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ljj;")
   @ObfuscatedName("af")
   public static ServerPacket[] method6374() {
      return new ServerPacket[]{
         CAM_TARGET_V4,
         IF_SETOBJECT,
         MESSAGE_FRIENDCHANNEL,
         HINT_ARROW,
         IF_SETANGLE,
         CLANSETTINGS_DELTA,
         SET_INTERACTION_MODE,
         CLANCHANNEL_FULL,
         MIDI_SONG_STOP,
         UPDATE_IGNORELIST,
         RUNCLIENTSCRIPT,
         IF_SETTEXT,
         REBUILD_REGION_V2,
         MAP_ANIM,
         UPDATE_INV_STOPTRANSMIT,
         SET_HEATMAP_ENABLED,
         SOUND_AREA,
         CAM_RESET,
         CHAT_FILTER_SETTINGS,
         UPDATE_RUNWEIGHT,
         SET_ACTIVE_WORLD_V2,
         VARCLAN,
         IF_SETPLAYERHEAD,
         UPDATE_INV_PARTIAL,
         UPDATE_FRIENDLIST,
         VARCLAN_DISABLE,
         LOGOUT_TRANSFER,
         MESSAGE_PRIVATE_ECHO,
         IF_SETCOLOUR,
         UPDATE_TRADINGPOST,
         IF_RESYNC_V2,
         MIDI_SWAP,
         CAM_MODE,
         CAM_ROTATETO,
         CAM_SMOOTHRESET,
         IF_OPENTOP,
         MESSAGE_PRIVATE,
         LOGOUT,
         LOC_ADD_CHANGE_V2,
         REBUILD_NORMAL_V2,
         MIDI_JINGLE,
         LOC_DEL,
         IF_SETPLAYERMODEL_BASECOLOUR,
         MESSAGE_CLANCHANNEL,
         UNKNOWN_STRING,
         IF_OPENSUB,
         CLANCHANNEL_DELTA,
         MIDI_SONG_WITHSECONDARY,
         LOC_MERGE,
         UPDATE_ZONE_PARTIAL_ENCLOSED,
         IF_SETPLAYERMODEL_OBJ,
         IF_MOVESUB,
         OBJ_CUSTOMISE_SPECIFIC,
         SITE_SETTINGS,
         IF_SETHIDE,
         HIDELOCOPS,
         LOGOUT_WITHREASON,
         PACKET_GROUP_START,
         RESET_ANIMS,
         IF_SETANIM,
         IF_CLEARINV,
         IF_SETNPCHEAD,
         IF_SETPLAYERMODEL_SELF,
         UPDATE_STAT_V2,
         IF_SETPLAYERMODEL_BODYTYPE,
         OCULUS_SYNC,
         UPDATE_REBOOT_TIMER_V2,
         IF_SETNPCHEAD_ACTIVE,
         VARP_RESET,
         HISCORE_REPLY,
         FRIENDLIST_LOADED,
         CAM_TARGET_V3,
         PROJANIM_SPECIFIC_V4,
         MESSAGE_GAME,
         UPDATE_INV_FULL,
         REBUILD_WORLDENTITY_V4,
         CHAT_FILTER_SETTINGS_PRIVATECHAT,
         TRIGGER_ONDIALOGABORT,
         IF_SETSCROLLPOS,
         MESSAGE_CLANCHANNEL_SYSTEM,
         WORLDENTITY_INFO_V7,
         MIDI_SONG_V2,
         ACCOUNT_FLAGS,
         PLAYER_SPOTANIM_SPECIFIC,
         LOC_ANIM_SPECIFIC,
         SET_PLAYER_OP,
         OBJ_DEL_SPECIFIC,
         OBJ_ENABLED_OPS_SPECIFIC,
         UPDATE_FRIENDCHAT_CHANNEL_FULL_V2,
         OBJ_UNCUSTOMISE_SPECIFIC,
         MAP_ANIM_SPECIFIC,
         PLAYER_INFO,
         SERVER_TICK_END,
         NPC_INFO_LARGE_V5,
         VARP_LARGE,
         CAM_ROTATEBY,
         NPC_HEADICON_SPECIFIC,
         CLANSETTINGS_FULL,
         SYNTH_SOUND,
         UPDATE_UID192,
         VARP_SYNC,
         NPC_SPOTANIM_SPECIFIC,
         ANIM_SPECIFIC,
         UPDATE_STOCKMARKET_SLOT,
         VARCLAN_ENABLE,
         IF_SETROTATESPEED,
         IF_SETEVENTS_V2,
         URL_OPEN,
         IF_SETPOSITION,
         UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER,
         HIDENPCOPS,
         SET_NPC_UPDATE_ORIGIN,
         HIDEOBJOPS,
         CAM_SHAKE,
         OBJ_ADD_SPECIFIC,
         SEND_PING,
         IF_CLOSESUB,
         NPC_ANIM_SPECIFIC,
         UPDATE_ZONE_PARTIAL_FOLLOWS,
         NPC_INFO_SMALL_V5,
         UPDATE_RUNENERGY,
         RESET_INTERACTION_MODE,
         MINIMAP_TOGGLE,
         LOC_ANIM,
         OBJ_COUNT_SPECIFIC,
         REFLECTION_CHECKER,
         UPDATE_ZONE_FULL_FOLLOWS,
         VARP_SMALL,
         CAM_ROTATETO_COORDINATE_V3,
         field3297,
         CAM_MOVETO_CYCLES_V3,
         CAM_MOVETO_ARC_V3,
         IF_SETMODEL_V2,
         CAM_ROTATETO_COORDINATE_V2,
         CAM_MOVETO_V3,
         AMBIENTSOUND_START,
         SET_MAP_FLAG_V2,
         GROUP_VAR_LONG,
         AMBIENTSOUND_STOP,
         GROUP_FULL,
         CAM_SKYBOX,
         NPC_INFO_LARGE_V6,
         GROUP_VAR,
         CAM_MOVETO_ARC_V2,
         GROUP_VAR_INT,
         CAM_LOOKAT_CYCLES,
         CAM_LOOKAT_V2,
         CAM_MOVETO_CYCLES_V2,
         CAM_LOOKAT_V3,
         CAM_UNLOCK,
         NPC_INFO_SMALL_V6,
         CAM_MOVETO_V2
      };
   }

   ServerPacket(int var1, int var2) {
      this.length = 2135382271 * var1;
      this.id = var2 * 111526941;
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("af")
   static void method6373(int var0, int var1, byte var2) {
      try {
         int[] var3 = new int[4];
         int[] var4 = new int[4];
         var3[0] = var0;
         var4[0] = var1;
         int var5 = 1;

         for (int var6 = 0; var6 < 4; var6++) {
            if (var2 == 111) {
               throw new IllegalStateException();
            }

            if (var0 != World.field1154[var6]) {
               if (var2 == 111) {
                  throw new IllegalStateException();
               }

               var3[var5] = World.field1154[var6];
               var4[var5] = World.field1155[var6];
               var5++;
            }
         }

         World.field1154 = var3;
         World.field1155 = var4;
         classEH.method3893(World.field1170, 0, World.field1170.length - 1, World.field1154, World.field1155, -1162776478);
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "jj.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ljj;")
   @ObfuscatedName("ae")
   public static ServerPacket[] method6375() {
      return new ServerPacket[]{
         CAM_TARGET_V4,
         IF_SETOBJECT,
         MESSAGE_FRIENDCHANNEL,
         HINT_ARROW,
         IF_SETANGLE,
         CLANSETTINGS_DELTA,
         SET_INTERACTION_MODE,
         CLANCHANNEL_FULL,
         MIDI_SONG_STOP,
         UPDATE_IGNORELIST,
         RUNCLIENTSCRIPT,
         IF_SETTEXT,
         REBUILD_REGION_V2,
         MAP_ANIM,
         UPDATE_INV_STOPTRANSMIT,
         SET_HEATMAP_ENABLED,
         SOUND_AREA,
         CAM_RESET,
         CHAT_FILTER_SETTINGS,
         UPDATE_RUNWEIGHT,
         SET_ACTIVE_WORLD_V2,
         VARCLAN,
         IF_SETPLAYERHEAD,
         UPDATE_INV_PARTIAL,
         UPDATE_FRIENDLIST,
         VARCLAN_DISABLE,
         LOGOUT_TRANSFER,
         MESSAGE_PRIVATE_ECHO,
         IF_SETCOLOUR,
         UPDATE_TRADINGPOST,
         IF_RESYNC_V2,
         MIDI_SWAP,
         CAM_MODE,
         CAM_ROTATETO,
         CAM_SMOOTHRESET,
         IF_OPENTOP,
         MESSAGE_PRIVATE,
         LOGOUT,
         LOC_ADD_CHANGE_V2,
         REBUILD_NORMAL_V2,
         MIDI_JINGLE,
         LOC_DEL,
         IF_SETPLAYERMODEL_BASECOLOUR,
         MESSAGE_CLANCHANNEL,
         UNKNOWN_STRING,
         IF_OPENSUB,
         CLANCHANNEL_DELTA,
         MIDI_SONG_WITHSECONDARY,
         LOC_MERGE,
         UPDATE_ZONE_PARTIAL_ENCLOSED,
         IF_SETPLAYERMODEL_OBJ,
         IF_MOVESUB,
         OBJ_CUSTOMISE_SPECIFIC,
         SITE_SETTINGS,
         IF_SETHIDE,
         HIDELOCOPS,
         LOGOUT_WITHREASON,
         PACKET_GROUP_START,
         RESET_ANIMS,
         IF_SETANIM,
         IF_CLEARINV,
         IF_SETNPCHEAD,
         IF_SETPLAYERMODEL_SELF,
         UPDATE_STAT_V2,
         IF_SETPLAYERMODEL_BODYTYPE,
         OCULUS_SYNC,
         UPDATE_REBOOT_TIMER_V2,
         IF_SETNPCHEAD_ACTIVE,
         VARP_RESET,
         HISCORE_REPLY,
         FRIENDLIST_LOADED,
         CAM_TARGET_V3,
         PROJANIM_SPECIFIC_V4,
         MESSAGE_GAME,
         UPDATE_INV_FULL,
         REBUILD_WORLDENTITY_V4,
         CHAT_FILTER_SETTINGS_PRIVATECHAT,
         TRIGGER_ONDIALOGABORT,
         IF_SETSCROLLPOS,
         MESSAGE_CLANCHANNEL_SYSTEM,
         WORLDENTITY_INFO_V7,
         MIDI_SONG_V2,
         ACCOUNT_FLAGS,
         PLAYER_SPOTANIM_SPECIFIC,
         LOC_ANIM_SPECIFIC,
         SET_PLAYER_OP,
         OBJ_DEL_SPECIFIC,
         OBJ_ENABLED_OPS_SPECIFIC,
         UPDATE_FRIENDCHAT_CHANNEL_FULL_V2,
         OBJ_UNCUSTOMISE_SPECIFIC,
         MAP_ANIM_SPECIFIC,
         PLAYER_INFO,
         SERVER_TICK_END,
         NPC_INFO_LARGE_V5,
         VARP_LARGE,
         CAM_ROTATEBY,
         NPC_HEADICON_SPECIFIC,
         CLANSETTINGS_FULL,
         SYNTH_SOUND,
         UPDATE_UID192,
         VARP_SYNC,
         NPC_SPOTANIM_SPECIFIC,
         ANIM_SPECIFIC,
         UPDATE_STOCKMARKET_SLOT,
         VARCLAN_ENABLE,
         IF_SETROTATESPEED,
         IF_SETEVENTS_V2,
         URL_OPEN,
         IF_SETPOSITION,
         UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER,
         HIDENPCOPS,
         SET_NPC_UPDATE_ORIGIN,
         HIDEOBJOPS,
         CAM_SHAKE,
         OBJ_ADD_SPECIFIC,
         SEND_PING,
         IF_CLOSESUB,
         NPC_ANIM_SPECIFIC,
         UPDATE_ZONE_PARTIAL_FOLLOWS,
         NPC_INFO_SMALL_V5,
         UPDATE_RUNENERGY,
         RESET_INTERACTION_MODE,
         MINIMAP_TOGGLE,
         LOC_ANIM,
         OBJ_COUNT_SPECIFIC,
         REFLECTION_CHECKER,
         UPDATE_ZONE_FULL_FOLLOWS,
         VARP_SMALL,
         CAM_ROTATETO_COORDINATE_V3,
         field3297,
         CAM_MOVETO_CYCLES_V3,
         CAM_MOVETO_ARC_V3,
         IF_SETMODEL_V2,
         CAM_ROTATETO_COORDINATE_V2,
         CAM_MOVETO_V3,
         AMBIENTSOUND_START,
         SET_MAP_FLAG_V2,
         GROUP_VAR_LONG,
         AMBIENTSOUND_STOP,
         GROUP_FULL,
         CAM_SKYBOX,
         NPC_INFO_LARGE_V6,
         GROUP_VAR,
         CAM_MOVETO_ARC_V2,
         GROUP_VAR_INT,
         CAM_LOOKAT_CYCLES,
         CAM_LOOKAT_V2,
         CAM_MOVETO_CYCLES_V2,
         CAM_LOOKAT_V3,
         CAM_UNLOCK,
         NPC_INFO_SMALL_V6,
         CAM_MOVETO_V2
      };
   }
}
