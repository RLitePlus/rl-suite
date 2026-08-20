import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.api.events.ClanMemberJoined;
import net.runelite.api.events.ClanMemberLeft;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gz")
public class ClanChannel extends Node implements net.runelite.api.clan.ClanChannel {
   @ObfuscatedName("aj")
   boolean field2143;
   @ObfuscatedName("at")
   public long field2141;
   @ObfuscatedName("ag")
   public String name = null;
   @ObfuscatedName("an")
   public byte field2135;
   @ObfuscatedName("av")
   public List members;
   @ToRemove(unused = "true")
   @ObfuscatedName("bh")
   static final int field2139 = 67;
   @ObfuscatedName("ak")
   boolean field2132 = true;
   @ObfuscatedName("aw")
   int[] sortedMembers;
   @ToRemove(unused = "true")
   @ObfuscatedName("bf")
   static final int field2138 = 63;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field2136 = 22;
   @ToRemove(unused = "true")
   @ObfuscatedName("cg")
   public static final int field2140 = 86;
   @ObfuscatedName("ae")
   public byte field2134;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field2137 = 26;

   @ObfuscatedSignature(descriptor = "(Lfa;)V")
   @ObfuscatedName("az")
   void method4415(ClanChannelMember var1) {
      this.members.add(var1);
      this.sortedMembers = null;
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("av")
   public int[] getSortedMembers(int var1) {
      try {
         if (null == this.sortedMembers) {
            if (var1 != -453092939) {
               throw new IllegalStateException();
            }

            String[] var2 = new String[this.members.size()];
            this.sortedMembers = new int[this.members.size()];

            for (int var3 = 0; var3 < this.members.size(); this.sortedMembers[var3] = var3++) {
               if (var1 != -453092939) {
                  throw new IllegalStateException();
               }

               var2[var3] = Username.method12707(((ClanChannelMember)this.members.get(var3)).username, -846306720);
            }

            class28.method499(var2, this.sortedMembers, (byte)4);
         }

         return this.sortedMembers;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gz.av(" + ')');
      }
   }

   public ClanChannel(Buffer var1) {
      this.method4433(var1, (byte)76);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   public int method4425(int var1) {
      try {
         return this.members.size();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "gz.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("aw")
   public int[] method4413() {
      if (null == this.sortedMembers) {
         String[] var1 = new String[this.members.size()];
         this.sortedMembers = new int[this.members.size()];

         for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
            var1[var2] = Username.method12707(((ClanChannelMember)this.members.get(var2)).username, -1004697866);
         }

         class28.method499(var1, this.sortedMembers, (byte)73);
      }

      return this.sortedMembers;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("aj")
   void method4433(Buffer var1, byte var2) {
      try {
         int var3 = var1.readUnsignedByte(-368236304);
         if ((var3 & 1) != 0) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            this.field2143 = true;
         }

         if (0 != (var3 & 2)) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            this.field2132 = true;
         }

         int var4 = 2;
         if (0 != (var3 & 4)) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            var4 = var1.readUnsignedByte(2068392930);
         }

         this.key = Buffer.method12018(var1, -2000458020);
         this.field2141 = Buffer.method12018(var1, -2018119318) * 7108271132456580947L;
         this.name = var1.readStringCp1252NullCircumfixed(1200487301);
         Buffer.method12022(var1, 2004535120);
         this.field2134 = Buffer.method12001(var1, (byte)104);
         this.field2135 = Buffer.method12001(var1, (byte)31);
         int var5 = Buffer.method12008(var1, (byte)5);
         if (var5 > 0) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            this.members = new ArrayList(var5);

            for (int var6 = 0; var6 < var5; var6++) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               ClanChannelMember var7 = new ClanChannelMember();
               if (this.field2143) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  Buffer.method12018(var1, -1977580124);
               }

               if (this.field2132) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  var7.username = new Username(var1.readStringCp1252NullCircumfixed(-1522320900));
               }

               var7.rank = Buffer.method12001(var1, (byte)98);
               var7.world = Buffer.method12008(var1, (byte)5) * -917126781;
               if (var4 >= 3) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  Buffer.method12022(var1, 2004535120);
               }

               this.members.add(var6, var7);
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "gz.aj(" + ')');
      }
   }

   static {
      new BitSet(65536);
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("ak")
   public int[] method4414() {
      if (null == this.sortedMembers) {
         String[] var1 = new String[this.members.size()];
         this.sortedMembers = new int[this.members.size()];

         for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
            var1[var2] = Username.method12707(((ClanChannelMember)this.members.get(var2)).username, 65768427);
         }

         class28.method499(var1, this.sortedMembers, (byte)84);
      }

      return this.sortedMembers;
   }

   public String getName() {
      return this.name;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("ah")
   public int method4428(String var1) {
      if (!this.field2132) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for (int var2 = 0; var2 < this.members.size(); var2++) {
            if (Username.method12702(((ClanChannelMember)this.members.get(var2)).username, (byte)-85).equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfa;)V")
   @ObfuscatedName("ap")
   void method4416(ClanChannelMember var1) {
      this.members.add(var1);
      this.sortedMembers = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgz;Lxa;)V")
   @ObfuscatedName("dz")
   public static void method4434(ClanChannel var0, Buffer var1) {
      if (var0 == null) {
         var0.method4437(var1);
      }

      int var2 = var1.readUnsignedByte(-668132133);
      if ((var2 & 1) != 0) {
         var0.field2143 = true;
      }

      if (0 != (var2 & 2)) {
         var0.field2132 = true;
      }

      int var3 = 2;
      if (0 != (var2 & 4)) {
         var3 = var1.readUnsignedByte(1385945752);
      }

      var0.key = Buffer.method12018(var1, -1919672064);
      var0.field2141 = Buffer.method12018(var1, -2038894425) * 7108271132456580947L;
      var0.name = var1.readStringCp1252NullCircumfixed(-1516664364);
      Buffer.method12022(var1, 2004535120);
      var0.field2134 = Buffer.method12001(var1, (byte)66);
      var0.field2135 = Buffer.method12001(var1, (byte)19);
      int var4 = Buffer.method12008(var1, (byte)5);
      if (var4 > 0) {
         var0.members = new ArrayList(var4);

         for (int var5 = 0; var5 < var4; var5++) {
            ClanChannelMember var6 = new ClanChannelMember();
            if (var0.field2143) {
               Buffer.method12018(var1, -1917931022);
            }

            if (var0.field2132) {
               var6.username = new Username(var1.readStringCp1252NullCircumfixed(-945721858));
            }

            var6.rank = Buffer.method12001(var1, (byte)86);
            var6.world = Buffer.method12008(var1, (byte)5) * 748047405;
            if (var3 >= 3) {
               Buffer.method12022(var1, 2004535120);
            }

            var0.members.add(var5, var6);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   public int method4426() {
      return this.members.size();
   }

   @ObfuscatedSignature(descriptor = "(Lfa;)V")
   @ObfuscatedName("au")
   void method4417(ClanChannelMember var1) {
      this.members.add(var1);
      this.sortedMembers = null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("ae")
   public int method4429(String var1, int var2) {
      try {
         if (!this.field2132) {
            if (var2 != 1596368249) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("Displaynames not available");
            }
         } else {
            for (int var3 = 0; var3 < this.members.size(); var3++) {
               if (var2 != 1596368249) {
                  throw new IllegalStateException();
               }

               if (Username.method12702(((ClanChannelMember)this.members.get(var3)).username, (byte)36).equalsIgnoreCase(var1)) {
                  return var3;
               }
            }

            return -1;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gz.ae(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgz;I)V")
   @ObfuscatedName("wf")
   public static void method4422(ClanChannel var0, int var1) {
      var0.members.remove(var1);
      var0.sortedMembers = null;
   }

   @ObfuscatedSignature(descriptor = "(Lfa;)V")
   @ObfuscatedName("ad")
   void method4418(ClanChannelMember var1) {
      this.members.add(var1);
      this.sortedMembers = null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ai")
   void method4423(int var1) {
      this.members.remove(var1);
      this.sortedMembers = null;
   }

   @ObfuscatedSignature(descriptor = "(Lfa;)V")
   @ObfuscatedName("ay")
   void method4419(ClanChannelMember var1) {
      this.members.add(var1);
      this.sortedMembers = null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   public int method4427() {
      return this.members.size();
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ag")
   void removeMember(int var1, int var2) {
      this.method4439(var1);

      try {
         this.members.remove(var1);
         this.sortedMembers = null;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gz.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("ax")
   public int method4430(String var1) {
      if (!this.field2132) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for (int var2 = 0; var2 < this.members.size(); var2++) {
            if (Username.method12702(((ClanChannelMember)this.members.get(var2)).username, (byte)-90).equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("ar")
   public int method4431(String var1) {
      if (!this.field2132) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for (int var2 = 0; var2 < this.members.size(); var2++) {
            if (Username.method12702(((ClanChannelMember)this.members.get(var2)).username, (byte)-84).equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("af")
   void method4435(Buffer var1) {
      int var2 = var1.readUnsignedByte(1880185350);
      if ((var2 & 1) != 0) {
         this.field2143 = true;
      }

      if (0 != (var2 & 2)) {
         this.field2132 = true;
      }

      int var3 = 2;
      if (0 != (var2 & 4)) {
         var3 = var1.readUnsignedByte(-1265308581);
      }

      this.key = Buffer.method12018(var1, -1979550669);
      this.field2141 = Buffer.method12018(var1, -1876890413) * 7108271132456580947L;
      this.name = var1.readStringCp1252NullCircumfixed(-1737900827);
      Buffer.method12022(var1, 2004535120);
      this.field2134 = Buffer.method12001(var1, (byte)30);
      this.field2135 = Buffer.method12001(var1, (byte)51);
      int var4 = Buffer.method12008(var1, (byte)5);
      if (var4 > 0) {
         this.members = new ArrayList(var4);

         for (int var5 = 0; var5 < var4; var5++) {
            ClanChannelMember var6 = new ClanChannelMember();
            if (this.field2143) {
               Buffer.method12018(var1, -2049179386);
            }

            if (this.field2132) {
               var6.username = new Username(var1.readStringCp1252NullCircumfixed(1521466496));
            }

            var6.rank = Buffer.method12001(var1, (byte)74);
            var6.world = Buffer.method12008(var1, (byte)5) * 519152819;
            if (var3 >= 3) {
               Buffer.method12022(var1, 2004535120);
            }

            this.members.add(var5, var6);
         }
      }
   }

   public List getMembers() {
      return this.members;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("al")
   public int method4432(String var1) {
      if (!this.field2132) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for (int var2 = 0; var2 < this.members.size(); var2++) {
            if (Username.method12702(((ClanChannelMember)this.members.get(var2)).username, (byte)-91).equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fa")
   public void method4439(int var1) {
      List var2 = this.getMembers();
      ClanChannelMember var3 = (ClanChannelMember)var2.get(var1);
      SecureUrlRequester.client.getCallbacks().post(new ClanMemberLeft(this, var3));
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ao")
   void method4436(Buffer var1) {
      int var2 = var1.readUnsignedByte(-824080472);
      if ((var2 & 1) != 0) {
         this.field2143 = true;
      }

      if (0 != (var2 & 2)) {
         this.field2132 = true;
      }

      int var3 = 2;
      if (0 != (var2 & 4)) {
         var3 = var1.readUnsignedByte(-1580779950);
      }

      this.key = Buffer.method12018(var1, -1978380868);
      this.field2141 = Buffer.method12018(var1, -1986029975) * 7108271132456580947L;
      this.name = var1.readStringCp1252NullCircumfixed(330513805);
      Buffer.method12022(var1, 2004535120);
      this.field2134 = Buffer.method12001(var1, (byte)22);
      this.field2135 = Buffer.method12001(var1, (byte)22);
      int var4 = Buffer.method12008(var1, (byte)5);
      if (var4 > 0) {
         this.members = new ArrayList(var4);

         for (int var5 = 0; var5 < var4; var5++) {
            ClanChannelMember var6 = new ClanChannelMember();
            if (this.field2143) {
               Buffer.method12018(var1, -2076285211);
            }

            if (this.field2132) {
               var6.username = new Username(var1.readStringCp1252NullCircumfixed(-1932685282));
            }

            var6.rank = Buffer.method12001(var1, (byte)127);
            var6.world = Buffer.method12008(var1, (byte)5) * -1625703497;
            if (var3 >= 3) {
               Buffer.method12022(var1, 2004535120);
            }

            this.members.add(var5, var6);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("mn")
   public int[] method4441() {
      return this.getSortedMembers(-453092939);
   }

   @ObfuscatedSignature(descriptor = "(Lfa;)V")
   @ObfuscatedName("sz")
   public void method4440(ClanChannelMember var1) {
      SecureUrlRequester.client.getCallbacks().post(new ClanMemberJoined(this, var1));
   }

   public net.runelite.api.clan.ClanChannelMember findMember(String var1) {
      Username var2 = new Username(var1, LoginScreenAnimation.loginType);
      var1 = var2.method12726();
      if (var1 == null) {
         return null;
      } else {
         List var3 = this.getMembers();
         int[] var4 = this.method4441();
         int var5 = 0;
         int var6 = var4.length - 1;

         while (var5 <= var6) {
            int var7 = var5 + var6 >>> 1;
            int var8 = var4[var7];
            ClanChannelMember var9 = (ClanChannelMember)var3.get(var8);
            int var10 = var9.method3949().method12726().compareTo(var1);
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

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("aa")
   void method4437(Buffer var1) {
      int var2 = var1.readUnsignedByte(-1371575393);
      if ((var2 & 1) != 0) {
         this.field2143 = true;
      }

      if (0 != (var2 & 2)) {
         this.field2132 = true;
      }

      int var3 = 2;
      if (0 != (var2 & 4)) {
         var3 = var1.readUnsignedByte(1705616087);
      }

      this.key = Buffer.method12018(var1, -2031939979);
      this.field2141 = Buffer.method12018(var1, -1909062051) * 7108271132456580947L;
      this.name = var1.readStringCp1252NullCircumfixed(-654485190);
      Buffer.method12022(var1, 2004535120);
      this.field2134 = Buffer.method12001(var1, (byte)69);
      this.field2135 = Buffer.method12001(var1, (byte)48);
      int var4 = Buffer.method12008(var1, (byte)5);
      if (var4 > 0) {
         this.members = new ArrayList(var4);

         for (int var5 = 0; var5 < var4; var5++) {
            ClanChannelMember var6 = new ClanChannelMember();
            if (this.field2143) {
               Buffer.method12018(var1, -2036905566);
            }

            if (this.field2132) {
               var6.username = new Username(var1.readStringCp1252NullCircumfixed(-1883720515));
            }

            var6.rank = Buffer.method12001(var1, (byte)25);
            var6.world = Buffer.method12008(var1, (byte)5) * -917126781;
            if (var3 >= 3) {
               Buffer.method12022(var1, 2004535120);
            }

            this.members.add(var5, var6);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I")
   @ObfuscatedName("mo")
   static final int insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8, int var9) {
      try {
         if (client.isMenuOpen) {
            if (var9 != 65535) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else if (!HttpRequestTask.method91(var8, var2, 659493871)) {
            if (var9 != 65535) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return client.menu.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, var7, var8, -2034748584);
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "gz.mo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgz;Lfa;I)V")
   @ObfuscatedName("ia")
   public static void method4420(ClanChannel var0, ClanChannelMember var1, int var2) {
      if (var0 == null) {
         var0.addMember(var1, var2);
      }

      try {
         var0.members.add(var1);
         var0.sortedMembers = null;
         var0.method4440(var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gz.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfa;I)V")
   @ObfuscatedName("at")
   void addMember(ClanChannelMember var1, int var2) {
      try {
         this.members.add(var1);
         this.sortedMembers = null;
         this.method4440(var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gz.at(" + ')');
      }
   }
}
