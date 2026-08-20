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
         throw classEG.method3884(var2, "kw.az(" + 41);
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
   public static classJJ[] method6576(int var0) {
      try {
         return new classJJ[]{
            classJJ.CAM_TARGET_V4,
            classJJ.IF_SETOBJECT,
            classJJ.MESSAGE_FRIENDCHANNEL,
            classJJ.HINT_ARROW,
            classJJ.IF_SETANGLE,
            classJJ.CLANSETTINGS_DELTA,
            classJJ.SET_INTERACTION_MODE,
            classJJ.CLANCHANNEL_FULL,
            classJJ.MIDI_SONG_STOP,
            classJJ.UPDATE_IGNORELIST,
            classJJ.RUNCLIENTSCRIPT,
            classJJ.IF_SETTEXT,
            classJJ.REBUILD_REGION_V2,
            classJJ.MAP_ANIM,
            classJJ.UPDATE_INV_STOPTRANSMIT,
            classJJ.SET_HEATMAP_ENABLED,
            classJJ.SOUND_AREA,
            classJJ.CAM_RESET,
            classJJ.CHAT_FILTER_SETTINGS,
            classJJ.UPDATE_RUNWEIGHT,
            classJJ.SET_ACTIVE_WORLD_V2,
            classJJ.VARCLAN,
            classJJ.IF_SETPLAYERHEAD,
            classJJ.UPDATE_INV_PARTIAL,
            classJJ.UPDATE_FRIENDLIST,
            classJJ.VARCLAN_DISABLE,
            classJJ.LOGOUT_TRANSFER,
            classJJ.MESSAGE_PRIVATE_ECHO,
            classJJ.IF_SETCOLOUR,
            classJJ.UPDATE_TRADINGPOST,
            classJJ.IF_RESYNC_V2,
            classJJ.MIDI_SWAP,
            classJJ.CAM_MODE,
            classJJ.CAM_ROTATETO,
            classJJ.CAM_SMOOTHRESET,
            classJJ.IF_OPENTOP,
            classJJ.MESSAGE_PRIVATE,
            classJJ.LOGOUT,
            classJJ.LOC_ADD_CHANGE_V2,
            classJJ.REBUILD_NORMAL_V2,
            classJJ.MIDI_JINGLE,
            classJJ.LOC_DEL,
            classJJ.IF_SETPLAYERMODEL_BASECOLOUR,
            classJJ.MESSAGE_CLANCHANNEL,
            classJJ.UNKNOWN_STRING,
            classJJ.IF_OPENSUB,
            classJJ.CLANCHANNEL_DELTA,
            classJJ.MIDI_SONG_WITHSECONDARY,
            classJJ.LOC_MERGE,
            classJJ.UPDATE_ZONE_PARTIAL_ENCLOSED,
            classJJ.IF_SETPLAYERMODEL_OBJ,
            classJJ.IF_MOVESUB,
            classJJ.OBJ_CUSTOMISE_SPECIFIC,
            classJJ.SITE_SETTINGS,
            classJJ.IF_SETHIDE,
            classJJ.HIDELOCOPS,
            classJJ.LOGOUT_WITHREASON,
            classJJ.PACKET_GROUP_START,
            classJJ.RESET_ANIMS,
            classJJ.IF_SETANIM,
            classJJ.IF_CLEARINV,
            classJJ.IF_SETNPCHEAD,
            classJJ.IF_SETPLAYERMODEL_SELF,
            classJJ.UPDATE_STAT_V2,
            classJJ.IF_SETPLAYERMODEL_BODYTYPE,
            classJJ.OCULUS_SYNC,
            classJJ.UPDATE_REBOOT_TIMER_V2,
            classJJ.IF_SETNPCHEAD_ACTIVE,
            classJJ.VARP_RESET,
            classJJ.HISCORE_REPLY,
            classJJ.FRIENDLIST_LOADED,
            classJJ.CAM_TARGET_V3,
            classJJ.PROJANIM_SPECIFIC_V4,
            classJJ.MESSAGE_GAME,
            classJJ.UPDATE_INV_FULL,
            classJJ.REBUILD_WORLDENTITY_V4,
            classJJ.CHAT_FILTER_SETTINGS_PRIVATECHAT,
            classJJ.TRIGGER_ONDIALOGABORT,
            classJJ.IF_SETSCROLLPOS,
            classJJ.MESSAGE_CLANCHANNEL_SYSTEM,
            classJJ.WORLDENTITY_INFO_V7,
            classJJ.MIDI_SONG_V2,
            classJJ.ACCOUNT_FLAGS,
            classJJ.PLAYER_SPOTANIM_SPECIFIC,
            classJJ.LOC_ANIM_SPECIFIC,
            classJJ.SET_PLAYER_OP,
            classJJ.OBJ_DEL_SPECIFIC,
            classJJ.OBJ_ENABLED_OPS_SPECIFIC,
            classJJ.UPDATE_FRIENDCHAT_CHANNEL_FULL_V2,
            classJJ.OBJ_UNCUSTOMISE_SPECIFIC,
            classJJ.MAP_ANIM_SPECIFIC,
            classJJ.PLAYER_INFO,
            classJJ.SERVER_TICK_END,
            classJJ.NPC_INFO_LARGE_V5,
            classJJ.VARP_LARGE,
            classJJ.CAM_ROTATEBY,
            classJJ.NPC_HEADICON_SPECIFIC,
            classJJ.CLANSETTINGS_FULL,
            classJJ.SYNTH_SOUND,
            classJJ.UPDATE_UID192,
            classJJ.VARP_SYNC,
            classJJ.NPC_SPOTANIM_SPECIFIC,
            classJJ.ANIM_SPECIFIC,
            classJJ.UPDATE_STOCKMARKET_SLOT,
            classJJ.VARCLAN_ENABLE,
            classJJ.IF_SETROTATESPEED,
            classJJ.IF_SETEVENTS_V2,
            classJJ.URL_OPEN,
            classJJ.IF_SETPOSITION,
            classJJ.UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER,
            classJJ.HIDENPCOPS,
            classJJ.SET_NPC_UPDATE_ORIGIN,
            classJJ.HIDEOBJOPS,
            classJJ.CAM_SHAKE,
            classJJ.OBJ_ADD_SPECIFIC,
            classJJ.SEND_PING,
            classJJ.IF_CLOSESUB,
            classJJ.NPC_ANIM_SPECIFIC,
            classJJ.UPDATE_ZONE_PARTIAL_FOLLOWS,
            classJJ.NPC_INFO_SMALL_V5,
            classJJ.UPDATE_RUNENERGY,
            classJJ.RESET_INTERACTION_MODE,
            classJJ.MINIMAP_TOGGLE,
            classJJ.LOC_ANIM,
            classJJ.OBJ_COUNT_SPECIFIC,
            classJJ.REFLECTION_CHECKER,
            classJJ.UPDATE_ZONE_FULL_FOLLOWS,
            classJJ.VARP_SMALL,
            classJJ.CAM_ROTATETO_COORDINATE_V3,
            classJJ.field3297,
            classJJ.CAM_MOVETO_CYCLES_V3,
            classJJ.CAM_MOVETO_ARC_V3,
            classJJ.IF_SETMODEL_V2,
            classJJ.CAM_ROTATETO_COORDINATE_V2,
            classJJ.CAM_MOVETO_V3,
            classJJ.AMBIENTSOUND_START,
            classJJ.SET_MAP_FLAG_V2,
            classJJ.GROUP_VAR_LONG,
            classJJ.AMBIENTSOUND_STOP,
            classJJ.GROUP_FULL,
            classJJ.CAM_SKYBOX,
            classJJ.NPC_INFO_LARGE_V6,
            classJJ.GROUP_VAR,
            classJJ.CAM_MOVETO_ARC_V2,
            classJJ.GROUP_VAR_INT,
            classJJ.CAM_LOOKAT_CYCLES,
            classJJ.CAM_LOOKAT_V2,
            classJJ.CAM_MOVETO_CYCLES_V2,
            classJJ.CAM_LOOKAT_V3,
            classJJ.CAM_UNLOCK,
            classJJ.NPC_INFO_SMALL_V6,
            classJJ.CAM_MOVETO_V2
         };
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "kw.az(" + ')');
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
         throw classEG.method3884(var5, "kw.hd(" + ')');
      }
   }
}
