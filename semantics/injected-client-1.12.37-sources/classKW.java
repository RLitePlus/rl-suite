import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kw")
public class classKW implements classXZ {
   @ObfuscatedName("ag")
   final int field4044;
   @ObfuscatedSignature(descriptor = "Lkw;")
   @ObfuscatedName("ax")
   public static final classKW field4042 = classKW.field4041;
   @ObfuscatedSignature(descriptor = "Lkw;")
   @ObfuscatedName("af")
   public static final classKW field4043 = new classKW(1, 1);
   @ObfuscatedSignature(descriptor = "Lkw;")
   @ObfuscatedName("ab")
   public static final classKW field4040 = new classKW(3, 3);
   @ObfuscatedSignature(descriptor = "Lkw;")
   @ObfuscatedName("ae")
   static final classKW field4041 = new classKW(2, 2);
   @ObfuscatedName("as")
   final int field4045;
   @ObfuscatedSignature(descriptor = "Lkw;")
   @ObfuscatedName("az")
   public static final classKW field4039 = new classKW(0, 0);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lkw;")
   @ObfuscatedName("aa")
   public static classKW[] method6572() {
      return new classKW[]{field4039, field4043, field4041, field4040};
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return this.field4045 * 2096183251;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "kw.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lkw;")
   @ObfuscatedName("as")
   public static classKW[] method6573() {
      return new classKW[]{field4039, field4043, field4041, field4040};
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return this.field4045 * 156636868;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return this.field4045 * 2096183251;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lkw;")
   @ObfuscatedName("ac")
   public static classKW[] method6574() {
      return new classKW[]{field4039, field4043, field4041, field4040};
   }

   classKW(int var1, int var2) {
      this.field4044 = var1 * 1163370575;
      this.field4045 = var2 * 300496987;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return this.field4045 * 2096183251;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lkw;")
   @ObfuscatedName("ax")
   public static classKW[] method6575() {
      return new classKW[]{field4039, field4043, field4041, field4040};
   }

   @ObfuscatedSignature(descriptor = "(I)[Ljj;")
   @ObfuscatedName("az")
   public static ServerPacket[] method6576(int var0) {
      try {
         return new ServerPacket[]{
            ServerPacket.CAM_TARGET_V4,
            ServerPacket.IF_SETOBJECT,
            ServerPacket.MESSAGE_FRIENDCHANNEL,
            ServerPacket.HINT_ARROW,
            ServerPacket.IF_SETANGLE,
            ServerPacket.CLANSETTINGS_DELTA,
            ServerPacket.SET_INTERACTION_MODE,
            ServerPacket.CLANCHANNEL_FULL,
            ServerPacket.MIDI_SONG_STOP,
            ServerPacket.UPDATE_IGNORELIST,
            ServerPacket.RUNCLIENTSCRIPT,
            ServerPacket.IF_SETTEXT,
            ServerPacket.REBUILD_REGION_V2,
            ServerPacket.MAP_ANIM,
            ServerPacket.UPDATE_INV_STOPTRANSMIT,
            ServerPacket.SET_HEATMAP_ENABLED,
            ServerPacket.SOUND_AREA,
            ServerPacket.CAM_RESET,
            ServerPacket.CHAT_FILTER_SETTINGS,
            ServerPacket.UPDATE_RUNWEIGHT,
            ServerPacket.SET_ACTIVE_WORLD_V2,
            ServerPacket.VARCLAN,
            ServerPacket.IF_SETPLAYERHEAD,
            ServerPacket.UPDATE_INV_PARTIAL,
            ServerPacket.UPDATE_FRIENDLIST,
            ServerPacket.VARCLAN_DISABLE,
            ServerPacket.LOGOUT_TRANSFER,
            ServerPacket.MESSAGE_PRIVATE_ECHO,
            ServerPacket.IF_SETCOLOUR,
            ServerPacket.UPDATE_TRADINGPOST,
            ServerPacket.IF_RESYNC_V2,
            ServerPacket.MIDI_SWAP,
            ServerPacket.CAM_MODE,
            ServerPacket.CAM_ROTATETO,
            ServerPacket.CAM_SMOOTHRESET,
            ServerPacket.IF_OPENTOP,
            ServerPacket.MESSAGE_PRIVATE,
            ServerPacket.LOGOUT,
            ServerPacket.LOC_ADD_CHANGE_V2,
            ServerPacket.REBUILD_NORMAL_V2,
            ServerPacket.MIDI_JINGLE,
            ServerPacket.LOC_DEL,
            ServerPacket.IF_SETPLAYERMODEL_BASECOLOUR,
            ServerPacket.MESSAGE_CLANCHANNEL,
            ServerPacket.UNKNOWN_STRING,
            ServerPacket.IF_OPENSUB,
            ServerPacket.CLANCHANNEL_DELTA,
            ServerPacket.MIDI_SONG_WITHSECONDARY,
            ServerPacket.LOC_MERGE,
            ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED,
            ServerPacket.IF_SETPLAYERMODEL_OBJ,
            ServerPacket.IF_MOVESUB,
            ServerPacket.OBJ_CUSTOMISE_SPECIFIC,
            ServerPacket.SITE_SETTINGS,
            ServerPacket.IF_SETHIDE,
            ServerPacket.HIDELOCOPS,
            ServerPacket.LOGOUT_WITHREASON,
            ServerPacket.PACKET_GROUP_START,
            ServerPacket.RESET_ANIMS,
            ServerPacket.IF_SETANIM,
            ServerPacket.IF_CLEARINV,
            ServerPacket.IF_SETNPCHEAD,
            ServerPacket.IF_SETPLAYERMODEL_SELF,
            ServerPacket.UPDATE_STAT_V2,
            ServerPacket.IF_SETPLAYERMODEL_BODYTYPE,
            ServerPacket.OCULUS_SYNC,
            ServerPacket.UPDATE_REBOOT_TIMER_V2,
            ServerPacket.IF_SETNPCHEAD_ACTIVE,
            ServerPacket.VARP_RESET,
            ServerPacket.HISCORE_REPLY,
            ServerPacket.FRIENDLIST_LOADED,
            ServerPacket.CAM_TARGET_V3,
            ServerPacket.PROJANIM_SPECIFIC_V4,
            ServerPacket.MESSAGE_GAME,
            ServerPacket.UPDATE_INV_FULL,
            ServerPacket.REBUILD_WORLDENTITY_V4,
            ServerPacket.CHAT_FILTER_SETTINGS_PRIVATECHAT,
            ServerPacket.TRIGGER_ONDIALOGABORT,
            ServerPacket.IF_SETSCROLLPOS,
            ServerPacket.MESSAGE_CLANCHANNEL_SYSTEM,
            ServerPacket.WORLDENTITY_INFO_V7,
            ServerPacket.MIDI_SONG_V2,
            ServerPacket.ACCOUNT_FLAGS,
            ServerPacket.PLAYER_SPOTANIM_SPECIFIC,
            ServerPacket.LOC_ANIM_SPECIFIC,
            ServerPacket.SET_PLAYER_OP,
            ServerPacket.OBJ_DEL_SPECIFIC,
            ServerPacket.OBJ_ENABLED_OPS_SPECIFIC,
            ServerPacket.UPDATE_FRIENDCHAT_CHANNEL_FULL_V2,
            ServerPacket.OBJ_UNCUSTOMISE_SPECIFIC,
            ServerPacket.MAP_ANIM_SPECIFIC,
            ServerPacket.PLAYER_INFO,
            ServerPacket.SERVER_TICK_END,
            ServerPacket.NPC_INFO_LARGE_V5,
            ServerPacket.VARP_LARGE,
            ServerPacket.CAM_ROTATEBY,
            ServerPacket.NPC_HEADICON_SPECIFIC,
            ServerPacket.CLANSETTINGS_FULL,
            ServerPacket.SYNTH_SOUND,
            ServerPacket.UPDATE_UID192,
            ServerPacket.VARP_SYNC,
            ServerPacket.NPC_SPOTANIM_SPECIFIC,
            ServerPacket.ANIM_SPECIFIC,
            ServerPacket.UPDATE_STOCKMARKET_SLOT,
            ServerPacket.VARCLAN_ENABLE,
            ServerPacket.IF_SETROTATESPEED,
            ServerPacket.IF_SETEVENTS_V2,
            ServerPacket.URL_OPEN,
            ServerPacket.IF_SETPOSITION,
            ServerPacket.UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER,
            ServerPacket.HIDENPCOPS,
            ServerPacket.SET_NPC_UPDATE_ORIGIN,
            ServerPacket.HIDEOBJOPS,
            ServerPacket.CAM_SHAKE,
            ServerPacket.OBJ_ADD_SPECIFIC,
            ServerPacket.SEND_PING,
            ServerPacket.IF_CLOSESUB,
            ServerPacket.NPC_ANIM_SPECIFIC,
            ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS,
            ServerPacket.NPC_INFO_SMALL_V5,
            ServerPacket.UPDATE_RUNENERGY,
            ServerPacket.RESET_INTERACTION_MODE,
            ServerPacket.MINIMAP_TOGGLE,
            ServerPacket.LOC_ANIM,
            ServerPacket.OBJ_COUNT_SPECIFIC,
            ServerPacket.REFLECTION_CHECKER,
            ServerPacket.UPDATE_ZONE_FULL_FOLLOWS,
            ServerPacket.VARP_SMALL,
            ServerPacket.CAM_ROTATETO_COORDINATE_V3,
            ServerPacket.field3297,
            ServerPacket.CAM_MOVETO_CYCLES_V3,
            ServerPacket.CAM_MOVETO_ARC_V3,
            ServerPacket.IF_SETMODEL_V2,
            ServerPacket.CAM_ROTATETO_COORDINATE_V2,
            ServerPacket.CAM_MOVETO_V3,
            ServerPacket.AMBIENTSOUND_START,
            ServerPacket.SET_MAP_FLAG_V2,
            ServerPacket.GROUP_VAR_LONG,
            ServerPacket.AMBIENTSOUND_STOP,
            ServerPacket.GROUP_FULL,
            ServerPacket.CAM_SKYBOX,
            ServerPacket.NPC_INFO_LARGE_V6,
            ServerPacket.GROUP_VAR,
            ServerPacket.CAM_MOVETO_ARC_V2,
            ServerPacket.GROUP_VAR_INT,
            ServerPacket.CAM_LOOKAT_CYCLES,
            ServerPacket.CAM_LOOKAT_V2,
            ServerPacket.CAM_MOVETO_CYCLES_V2,
            ServerPacket.CAM_LOOKAT_V3,
            ServerPacket.CAM_UNLOCK,
            ServerPacket.NPC_INFO_SMALL_V6,
            ServerPacket.CAM_MOVETO_V2
         };
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "kw.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("hd")
   static String method6577(String var0, int var1) {
      try {
         classKL[] var2 = classGH.method5431((byte)107);

         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var1 == 838738935) {
               throw new IllegalStateException();
            }

            classKL var4 = var2[var3];
            if (-1 != var4.field3939 * 1654631897) {
               if (var1 == 838738935) {
                  throw new IllegalStateException();
               }

               if (var0.startsWith(classDG.method3061(var4.field3939 * 1654631897, (byte)-73))) {
                  if (var1 == 838738935) {
                     throw new IllegalStateException();
                  }

                  var0 = var0.substring(6 + Integer.toString(1654631897 * var4.field3939).length());
                  break;
               }
            }
         }

         return var0;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "kw.hd(" + ')');
      }
   }
}
