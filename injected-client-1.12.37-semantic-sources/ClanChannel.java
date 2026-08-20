import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.api.events.ClanMemberJoined;
import net.runelite.api.events.ClanMemberLeft;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ie")
public class ClanChannel extends Node implements net.runelite.api.clan.ClanChannel {
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field2951 = 43;
   @ObfuscatedName("af")
   public long field2953;
   @ObfuscatedName("az")
   public List field2955;
   @ObfuscatedName("ae")
   public String field2948 = null;
   @ObfuscatedName("ag")
   public byte field2950;
   @ObfuscatedName("as")
   boolean field2956;
   @ObfuscatedName("ax")
   boolean field2947 = true;
   @ObfuscatedName("ac")
   int[] field2957;
   @ObfuscatedName("ab")
   public byte field2949;
   @ObfuscatedName("ap")
   static String field2954;
   @ToRemove(unused = "true")
   @ObfuscatedName("cq")
   static final int field2952 = 73;

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ak")
   void method6187(classXY var1) {
      int var2 = classXY.method13039(var1, -346779531);
      if (0 != (var2 & 1)) {
         this.field2956 = true;
      }

      if (0 != (var2 & 2)) {
         this.field2947 = true;
      }

      int var3 = 2;
      if (0 != (var2 & 4)) {
         var3 = classXY.method13039(var1, -346779531);
      }

      this.field6552 = var1.method13059(-513208596);
      this.field2953 = var1.method13059(436870952) * 2301448292752648763L;
      this.field2948 = var1.method13071(143390491);
      var1.method13065((byte)20);
      this.field2950 = classXY.method13043(var1, (byte)17);
      this.field2949 = classXY.method13043(var1, (byte)17);
      int var4 = classXY.method13047(var1, 1175331380);
      if (var4 > 0) {
         this.field2955 = new ArrayList(var4);

         for (int var5 = 0; var5 < var4; var5++) {
            ClanChannelMember var6 = new ClanChannelMember();
            if (this.field2956) {
               var1.method13059(-295476293);
            }

            if (this.field2947) {
               var6.field2846 = new classAAE(var1.method13071(-1355202949));
            }

            var6.field2841 = classXY.method13043(var1, (byte)17);
            var6.field2842 = classXY.method13047(var1, 50340404) * 180057721;
            if (var3 >= 3) {
               var1.method13065((byte)26);
            }

            this.field2955.add(var5, var6);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhn;)V")
   @ObfuscatedName("ay")
   void method6173(ClanChannelMember var1) {
      this.field2955.add(var1);
      this.field2957 = null;
   }

   public ClanChannel(classXY var1) {
      this.method6188(var1, (byte)-18);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ae")
   void method6179(int var1, int var2) {
      this.method6192(var1);

      try {
         this.field2955.remove(var1);
         this.field2957 = null;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ie.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;B)V")
   @ObfuscatedName("as")
   void method6188(classXY var1, byte var2) {
      try {
         int var3 = classXY.method13039(var1, -346779531);
         if (0 != (var3 & 1)) {
            if (var2 >= 1) {
               return;
            }

            this.field2956 = true;
         }

         if (0 != (var3 & 2)) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            this.field2947 = true;
         }

         int var4 = 2;
         if (0 != (var3 & 4)) {
            var4 = classXY.method13039(var1, -346779531);
         }

         this.field6552 = var1.method13059(1943073534);
         this.field2953 = var1.method13059(2019814134) * 2301448292752648763L;
         this.field2948 = var1.method13071(155668970);
         var1.method13065((byte)95);
         this.field2950 = classXY.method13043(var1, (byte)17);
         this.field2949 = classXY.method13043(var1, (byte)17);
         int var5 = classXY.method13047(var1, -1748913958);
         if (var5 > 0) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            this.field2955 = new ArrayList(var5);

            for (int var6 = 0; var6 < var5; var6++) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               ClanChannelMember var7 = new ClanChannelMember();
               if (this.field2956) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }

                  var1.method13059(-1009826537);
               }

               if (this.field2947) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }

                  var7.field2846 = new classAAE(var1.method13071(503907042));
               }

               var7.field2841 = classXY.method13043(var1, (byte)17);
               var7.field2842 = classXY.method13047(var1, -1944776342) * 179951339;
               if (var4 >= 3) {
                  var1.method13065((byte)29);
               }

               this.field2955.add(var6, var7);
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "ie.as(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lie;Lxy;)V")
   @ObfuscatedName("bk")
   public static void method6189(ClanChannel var0, classXY var1) {
      if (var0 == null) {
         var0.method6187(var1);
      }

      int var2 = classXY.method13039(var1, -346779531);
      if (0 != (var2 & 1)) {
         var0.field2956 = true;
      }

      if (0 != (var2 & 2)) {
         var0.field2947 = true;
      }

      int var3 = 2;
      if (0 != (var2 & 4)) {
         var3 = classXY.method13039(var1, -346779531);
      }

      var0.field6552 = var1.method13059(1694481221);
      var0.field2953 = var1.method13059(1816813901) * 2301448292752648763L;
      var0.field2948 = var1.method13071(738845367);
      var1.method13065((byte)91);
      var0.field2950 = classXY.method13043(var1, (byte)17);
      var0.field2949 = classXY.method13043(var1, (byte)17);
      int var4 = classXY.method13047(var1, 1660861027);
      if (var4 > 0) {
         var0.field2955 = new ArrayList(var4);

         for (int var5 = 0; var5 < var4; var5++) {
            ClanChannelMember var6 = new ClanChannelMember();
            if (var0.field2956) {
               var1.method13059(654057150);
            }

            if (var0.field2947) {
               var6.field2846 = new classAAE(var1.method13071(2115664700));
            }

            var6.field2841 = classXY.method13043(var1, (byte)17);
            var6.field2842 = classXY.method13047(var1, -248176967) * 179951339;
            if (var3 >= 3) {
               var1.method13065((byte)51);
            }

            var0.field2955.add(var5, var6);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lie;I)[I")
   @ObfuscatedName("zo")
   public static int[] method6169(ClanChannel var0, int var1) {
      if (var0 == null) {
         var0.method6172(var1);
      }

      try {
         if (var0.field2957 == null) {
            if (var1 >= -1492108231) {
               throw new IllegalStateException();
            }

            String[] var2 = new String[var0.field2955.size()];
            var0.field2957 = new int[var0.field2955.size()];

            for (int var3 = 0; var3 < var0.field2955.size(); var0.field2957[var3] = var3++) {
               var2[var3] = ((ClanChannelMember)var0.field2955.get(var3)).field2846.method166(-2003115826);
            }

            classUO.method11413(var2, var0.field2957, 1863276462);
         }

         return var0.field2957;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ie.az(" + ')');
      }
   }

   static {
      new BitSet(65536);
   }

   @ObfuscatedSignature(descriptor = "(Lhn;)V")
   @ObfuscatedName("vn")
   public void method6194(ClanChannelMember var1) {
      classOE.field4843.getCallbacks().post(new ClanMemberJoined(this, var1));
   }

   public String getName() {
      return this.field2948;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("ax")
   public int[] method6170() {
      if (this.field2957 == null) {
         String[] var1 = new String[this.field2955.size()];
         this.field2957 = new int[this.field2955.size()];

         for (int var2 = 0; var2 < this.field2955.size(); this.field2957[var2] = var2++) {
            var1[var2] = ((ClanChannelMember)this.field2955.get(var2)).field2846.method166(-2003115826);
         }

         classUO.method11413(var1, this.field2957, 1869466533);
      }

      return this.field2957;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("ac")
   public int[] method6171() {
      if (this.field2957 == null) {
         String[] var1 = new String[this.field2955.size()];
         this.field2957 = new int[this.field2955.size()];

         for (int var2 = 0; var2 < this.field2955.size(); this.field2957[var2] = var2++) {
            var1[var2] = ((ClanChannelMember)this.field2955.get(var2)).field2846.method166(-2003115826);
         }

         classUO.method11413(var1, this.field2957, 1086994240);
      }

      return this.field2957;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("ao")
   public int[] method6195() {
      return method6169(this, -1957709273);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ai")
   void method6190(classXY var1) {
      int var2 = classXY.method13039(var1, -346779531);
      if (0 != (var2 & 1)) {
         this.field2956 = true;
      }

      if (0 != (var2 & 2)) {
         this.field2947 = true;
      }

      int var3 = 2;
      if (0 != (var2 & 4)) {
         var3 = classXY.method13039(var1, -346779531);
      }

      this.field6552 = var1.method13059(-1113640940);
      this.field2953 = var1.method13059(-486551884) * 2301448292752648763L;
      this.field2948 = var1.method13071(-638105996);
      var1.method13065((byte)80);
      this.field2950 = classXY.method13043(var1, (byte)17);
      this.field2949 = classXY.method13043(var1, (byte)17);
      int var4 = classXY.method13047(var1, -1127139805);
      if (var4 > 0) {
         this.field2955 = new ArrayList(var4);

         for (int var5 = 0; var5 < var4; var5++) {
            ClanChannelMember var6 = new ClanChannelMember();
            if (this.field2956) {
               var1.method13059(829271577);
            }

            if (this.field2947) {
               var6.field2846 = new classAAE(var1.method13071(1641482552));
            }

            var6.field2841 = classXY.method13043(var1, (byte)17);
            var6.field2842 = classXY.method13047(var1, 1255418010) * 179951339;
            if (var3 >= 3) {
               var1.method13065((byte)113);
            }

            this.field2955.add(var5, var6);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhn;)V")
   @ObfuscatedName("ao")
   void method6174(ClanChannelMember var1) {
      this.field2955.add(var1);
      this.field2957 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lhn;)V")
   @ObfuscatedName("al")
   void method6175(ClanChannelMember var1) {
      this.field2955.add(var1);
      this.field2957 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lhn;)V")
   @ObfuscatedName("aj")
   void method6176(ClanChannelMember var1) {
      this.field2955.add(var1);
      this.field2957 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lhn;B)V")
   @ObfuscatedName("af")
   void method6177(ClanChannelMember var1, byte var2) {
      try {
         this.field2955.add(var1);
         this.field2957 = null;
         this.method6194(var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ie.af(" + ')');
      }
   }

   public List getMembers() {
      return this.field2955;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ns")
   public void method6192(int var1) {
      List var2 = this.getMembers();
      ClanChannelMember var3 = (ClanChannelMember)var2.get(var1);
      classOE.field4843.getCallbacks().post(new ClanMemberLeft(this, var3));
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aq")
   void method6180(int var1) {
      this.field2955.remove(var1);
      this.field2957 = null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   public int method6181() {
      return this.field2955.size();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   public int method6182() {
      return this.field2955.size();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("au")
   public int method6185(String var1) {
      if (!this.field2947) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for (int var2 = 0; var2 < this.field2955.size(); var2++) {
            if (((ClanChannelMember)this.field2955.get(var2)).field2846.method164(1523255766).equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)I")
   @ObfuscatedName("ag")
   public int method6186(String var1, byte var2) {
      try {
         if (!this.field2947) {
            throw new RuntimeException("Displaynames not available");
         } else {
            for (int var3 = 0; var3 < this.field2955.size(); var3++) {
               if (var2 != 33) {
                  throw new IllegalStateException();
               }

               if (((ClanChannelMember)this.field2955.get(var3)).field2846.method164(1214968684).equalsIgnoreCase(var1)) {
                  if (var2 != 33) {
                     throw new IllegalStateException();
                  }

                  return var3;
               }
            }

            return -1;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ie.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("aw")
   void method6191(classXY var1) {
      int var2 = classXY.method13039(var1, -346779531);
      if (0 != (var2 & 1)) {
         this.field2956 = true;
      }

      if (0 != (var2 & 2)) {
         this.field2947 = true;
      }

      int var3 = 2;
      if (0 != (var2 & 4)) {
         var3 = classXY.method13039(var1, -346779531);
      }

      this.field6552 = var1.method13059(-377254497);
      this.field2953 = var1.method13059(82911324) * 2301448292752648763L;
      this.field2948 = var1.method13071(98704368);
      var1.method13065((byte)29);
      this.field2950 = classXY.method13043(var1, (byte)17);
      this.field2949 = classXY.method13043(var1, (byte)17);
      int var4 = classXY.method13047(var1, -296460857);
      if (var4 > 0) {
         this.field2955 = new ArrayList(var4);

         for (int var5 = 0; var5 < var4; var5++) {
            ClanChannelMember var6 = new ClanChannelMember();
            if (this.field2956) {
               var1.method13059(2137565659);
            }

            if (this.field2947) {
               var6.field2846 = new classAAE(var1.method13071(497868145));
            }

            var6.field2841 = classXY.method13043(var1, (byte)17);
            var6.field2842 = classXY.method13047(var1, 829984968) * 179951339;
            if (var3 >= 3) {
               var1.method13065((byte)116);
            }

            this.field2955.add(var5, var6);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhn;)V")
   @ObfuscatedName("aa")
   void method6178(ClanChannelMember var1) {
      this.field2955.add(var1);
      this.field2957 = null;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ep")
   static void method6193(byte var0) {
      try {
         if (!client.field979) {
            if (var0 >= 0) {
               throw new IllegalStateException();
            }
         } else {
            Widget var1 = classLY.method7378(classWK.field6691, 565061963 * classBQ.field529, 1333668003 * client.field980, (byte)-103);
            if (var1 != null) {
               if (var0 >= 0) {
                  return;
               }

               if (var1.field4350 != null) {
                  if (var0 >= 0) {
                     return;
                  }

                  ScriptEvent var2 = classZS.method14182(classUQ.method11465(var1, 1629912630).method14145(var1.field4350, (byte)2), (byte)52);
                  classSZ.method10729(var2, -997665260);
               }
            }

            client.field981 = 1326078651;
            client.field979 = false;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ie.ep(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lie;B)I")
   @ObfuscatedName("dz")
   public static int method6183(ClanChannel var0, byte var1) {
      if (var0 == null) {
         var0.method6184(var1);
      }

      try {
         return var0.field2955.size();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ie.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("az")
   public int[] method6172(int var1) {
      try {
         if (this.field2957 == null) {
            if (var1 >= -1492108231) {
               throw new IllegalStateException();
            }

            String[] var2 = new String[this.field2955.size()];
            this.field2957 = new int[this.field2955.size()];

            for (int var3 = 0; var3 < this.field2955.size(); this.field2957[var3] = var3++) {
               var2[var3] = ((ClanChannelMember)this.field2955.get(var3)).field2846.method166(-2003115826);
            }

            classUO.method11413(var2, this.field2957, 1863276462);
         }

         return this.field2957;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ie.az(" + ')');
      }
   }

   public net.runelite.api.clan.ClanChannelMember findMember(String var1) {
      classAAE var2 = new classAAE(var1, InterfaceParent.field5279);
      var1 = var2.method185();
      if (var1 == null) {
         return null;
      } else {
         List var3 = this.getMembers();
         int[] var4 = this.method6195();
         int var5 = 0;
         int var6 = var4.length - 1;

         while (var5 <= var6) {
            int var7 = var5 + var6 >>> 1;
            int var8 = var4[var7];
            ClanChannelMember var9 = (ClanChannelMember)var3.get(var8);
            int var10 = var9.method6077().method185().compareTo(var1);
            if (var10 < 0) {
               var5 = var7 + 1;
            } else {
               if (var10 <= 0) {
                  return var9;
               }

               var6 = var7 - 1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ab")
   public int method6184(byte var1) {
      try {
         return this.field2955.size();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ie.ab(" + 41);
      }
   }
}
