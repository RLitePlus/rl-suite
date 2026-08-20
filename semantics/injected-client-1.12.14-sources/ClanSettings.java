import java.util.ArrayList;
import java.util.List;
import net.runelite.api.clan.ClanMember;
import net.runelite.api.clan.ClanRank;
import net.runelite.api.clan.ClanTitle;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gs")
public class ClanSettings implements net.runelite.api.clan.ClanSettings {
   @ObfuscatedName("ac")
   public int memberCount;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final byte field2064 = 125;
   @ObfuscatedName("ak")
   long field2072;
   @ObfuscatedName("aw")
   public int field2062 = 0;
   @ObfuscatedName("ap")
   public String name = null;
   @ObfuscatedName("ay")
   int field2059 = 0;
   @ObfuscatedName("aa")
   long[] bannedMemberHashes;
   @ObfuscatedName("az")
   public byte field2068;
   @ObfuscatedName("al")
   public boolean[] field2085;
   @ObfuscatedName("ai")
   public byte field2065;
   @ObfuscatedName("as")
   public byte field2066;
   @ObfuscatedName("ad")
   public byte field2063;
   @ObfuscatedName("am")
   public int field2058;
   @ObfuscatedName("ax")
   public byte[] memberRanks;
   @ObfuscatedName("ar")
   int[] field2079;
   @ObfuscatedName("ah")
   public int[] memberJoinDates;
   @ObfuscatedName("au")
   public boolean allowGuests;
   @ObfuscatedName("af")
   public int currentOwner = 2036828757;
   @ObfuscatedName("be")
   public String[] bannedMemberNames;
   @ObfuscatedName("ao")
   public int bannedMemberCount;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final byte field2067 = 127;
   @ObfuscatedName("aq")
   public String[] memberNames;
   @ObfuscatedName("ab")
   long[] memberHashes;
   @ObfuscatedSignature(descriptor = "Lql;")
   @ObfuscatedName("bo")
   IterableNodeHashTable parameters;
   @ObfuscatedName("bg")
   boolean useHashes;
   @ObfuscatedName("bs")
   boolean useNames;
   @ObfuscatedName("bz")
   int[] sortedMembers;
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   static final int field2071 = 1004;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgs;IIII)Z")
   @ObfuscatedName("zm")
   public static boolean method4329(ClanSettings var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method4283(var1, var1, var1, var1);
      }

      int var5 = (1 << var3) - 1;
      int var6 = 31 == var4 ? -1 : (1 << 1 + var4) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      if (var0.parameters != null) {
         Node var8 = var0.parameters.get((long)var1);
         if (var8 != null) {
            if (var8 instanceof IntegerNode) {
               IntegerNode var9 = (IntegerNode)var8;
               if ((var9.integer & var7) == var2) {
                  return false;
               }

               var9.integer &= ~var7;
               var9.integer |= var2;
               return true;
            }

            var8.remove();
         }
      } else {
         var0.parameters = new IterableNodeHashTable(4);
      }

      var0.parameters.put((Node)(new IntegerNode(var2)), (long)var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bv")
   boolean method4314(int var1) {
      if (var1 != this.currentOwner * 1172757763 && this.memberRanks[var1] != 126) {
         this.memberRanks[this.currentOwner * 1172757763] = 125;
         this.field2058 = this.currentOwner * -290569037;
         this.memberRanks[var1] = 126;
         this.currentOwner = -2036828757 * var1;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aw")
   void method4295(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 >= 707213469) {
               throw new IllegalStateException();
            }

            if (var1 < this.memberCount * 1184926393) {
               this.memberCount -= -34186359;
               this.sortedMembers = null;
               if (1184926393 * this.memberCount == 0) {
                  if (var2 >= 707213469) {
                     throw new IllegalStateException();
                  }

                  this.memberHashes = null;
                  this.memberNames = null;
                  this.memberRanks = null;
                  this.field2079 = null;
                  this.memberJoinDates = null;
                  this.field2085 = null;
                  this.currentOwner = 2036828757;
                  this.field2058 = 1877626223;
               } else {
                  System.arraycopy(this.memberRanks, 1 + var1, this.memberRanks, var1, this.memberCount * 1184926393 - var1);
                  System.arraycopy(this.field2079, 1 + var1, this.field2079, var1, 1184926393 * this.memberCount - var1);
                  System.arraycopy(this.memberJoinDates, 1 + var1, this.memberJoinDates, var1, this.memberCount * 1184926393 - var1);
                  System.arraycopy(this.field2085, var1 + 1, this.field2085, var1, 1184926393 * this.memberCount - var1);
                  if (this.memberHashes != null) {
                     if (var2 >= 707213469) {
                        return;
                     }

                     System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, 1184926393 * this.memberCount - var1);
                  }

                  if (null != this.memberNames) {
                     System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, 1184926393 * this.memberCount - var1);
                  }

                  this.updateOwner(-705293792);
               }

               return;
            }

            if (var2 >= 707213469) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gs.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[I")
   @ObfuscatedName("aj")
   public int[] getSortedMembers(byte var1) {
      try {
         if (this.sortedMembers == null) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            String[] var2 = new String[1184926393 * this.memberCount];
            this.sortedMembers = new int[this.memberCount * 1184926393];

            for (int var3 = 0; var3 < 1184926393 * this.memberCount; this.sortedMembers[var3] = var3++) {
               if (var1 == 0) {
                  throw new IllegalStateException();
               }

               var2[var3] = this.memberNames[var3];
               if (null != var2[var3]) {
                  if (var1 == 0) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = var2[var3].toLowerCase();
               }
            }

            class28.method499(var2, this.sortedMembers, (byte)115);
         }

         return this.sortedMembers;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gs.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgs;I)Z")
   @ObfuscatedName("pg")
   public static boolean method4315(ClanSettings var0, int var1) {
      if (var1 != var0.currentOwner * -1703629037 && var0.memberRanks[var1] != 1898683756) {
         var0.memberRanks[var0.currentOwner * 264155063] = (byte)214974531;
         var0.field2058 = var0.currentOwner * 1551084056;
         var0.memberRanks[var1] = 126;
         var0.currentOwner = 797003746 * var1;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bl")
   void method4307(int var1) {
      this.bannedMemberCount -= -938336233;
      if (0 == this.bannedMemberCount * -890431577) {
         this.bannedMemberHashes = null;
         this.bannedMemberNames = null;
      } else {
         if (this.bannedMemberHashes != null) {
            System.arraycopy(this.bannedMemberHashes, 1 + var1, this.bannedMemberHashes, var1, this.bannedMemberCount * -890431577 - var1);
         }

         if (this.bannedMemberNames != null) {
            System.arraycopy(this.bannedMemberNames, 1 + var1, this.bannedMemberNames, var1, this.bannedMemberCount * -890431577 - var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IJ)Z")
   @ObfuscatedName("ci")
   boolean method4332(int var1, long var2) {
      if (this.parameters != null) {
         Node var4 = this.parameters.get((long)var1);
         if (var4 != null) {
            if (var4 instanceof classVA) {
               classVA var5 = (classVA)var4;
               if (var5.field6145 == var2) {
                  return false;
               }

               var5.field6145 = var2;
               return true;
            }

            var4.remove();
         }
      } else {
         this.parameters = new IterableNodeHashTable(4);
      }

      this.parameters.put((Node)(new classVA(var2)), (long)var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Z")
   @ObfuscatedName("cq")
   boolean method4339(int var1, String var2) {
      if (null == var2) {
         var2 = "";
      } else if (var2.length() > -958423235) {
         var2 = var2.substring(0, 1072618430);
      }

      if (this.parameters != null) {
         Node var3 = this.parameters.get((long)var1);
         if (null != var3) {
            if (var3 instanceof ObjectNode) {
               ObjectNode var4 = (ObjectNode)var3;
               if (var4.obj instanceof String) {
                  if (var2.equals(var4.obj)) {
                     return false;
                  }

                  var4.remove();
                  this.parameters.put((Node)(new ObjectNode(var2)), var4.key);
                  return true;
               }
            }

            var3.remove();
         }
      } else {
         this.parameters = new IterableNodeHashTable(4);
      }

      this.parameters.put((Node)(new ObjectNode(var2)), (long)var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("au")
   void method4308(int var1, int var2) {
      try {
         this.bannedMemberCount -= -938336233;
         if (0 == this.bannedMemberCount * -890431577) {
            if (var2 <= -1429323804) {
               throw new IllegalStateException();
            }

            this.bannedMemberHashes = null;
            this.bannedMemberNames = null;
         } else {
            if (this.bannedMemberHashes != null) {
               if (var2 <= -1429323804) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.bannedMemberHashes, 1 + var1, this.bannedMemberHashes, var1, this.bannedMemberCount * -890431577 - var1);
            }

            if (this.bannedMemberNames != null) {
               if (var2 <= -1429323804) {
                  return;
               }

               System.arraycopy(this.bannedMemberNames, 1 + var1, this.bannedMemberNames, var1, this.bannedMemberCount * -890431577 - var1);
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gs.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IBI)I")
   @ObfuscatedName("az")
   int method4311(int var1, byte var2, int var3) {
      try {
         if (126 != var2) {
            if (var3 != -1415493742) {
               throw new IllegalStateException();
            }

            if (var2 != 127) {
               if (1172757763 * this.currentOwner == var1) {
                  if (var3 != -1415493742) {
                     throw new IllegalStateException();
                  }

                  if (this.field2058 * 1673809521 == -1) {
                     return -1;
                  }

                  if (this.memberRanks[1673809521 * this.field2058] < 125) {
                     if (var3 != -1415493742) {
                        throw new IllegalStateException();
                     }

                     return -1;
                  }
               }

               if (this.memberRanks[var1] == var2) {
                  if (var3 != -1415493742) {
                     throw new IllegalStateException();
                  }

                  return -1;
               }

               this.memberRanks[var1] = var2;
               this.updateOwner(1524100431);
               return var1;
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gs.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("wa")
   public String[] method4350() {
      return this.memberNames;
   }

   @ObfuscatedSignature(descriptor = "(IJ)Z")
   @ObfuscatedName("cp")
   boolean method4333(int var1, long var2) {
      if (this.parameters != null) {
         Node var4 = this.parameters.get((long)var1);
         if (var4 != null) {
            if (var4 instanceof classVA) {
               classVA var5 = (classVA)var4;
               if (var5.field6145 == var2) {
                  return false;
               }

               var5.field6145 = var2;
               return true;
            }

            var4.remove();
         }
      } else {
         this.parameters = new IterableNodeHashTable(4);
      }

      this.parameters.put((Node)(new classVA(var2)), (long)var1);
      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldj;I)I")
   @ObfuscatedName("cm")
   public static int method4268(Varcs var0, int var1) {
      Object var2 = var0.map.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   public ClanMember findMember(String var1) {
      int var2 = this.method4347(var1.replace(' ', ' '));
      return var2 == -1 ? null : new rl0(this, var2);
   }

   @ObfuscatedSignature(descriptor = "(IIIIB)I")
   @ObfuscatedName("as")
   int method4323(int var1, int var2, int var3, int var4, byte var5) {
      try {
         int var6 = (1 << var3) - 1;
         int var7 = 31 == var4 ? -1 : (1 << var4 + 1) - 1;
         int var8 = var7 ^ var6;
         var2 <<= var3;
         var2 &= var8;
         int var9 = this.field2079[var1];
         if ((var9 & var8) == var2) {
            if (var5 >= 1) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            var9 &= ~var8;
            this.field2079[var1] = var9 | var2;
            return var1;
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "gs.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ac")
   boolean method4326(int var1, int var2, int var3) {
      try {
         if (null != this.parameters) {
            if (var3 != -1945234542) {
               throw new IllegalStateException();
            }

            Node var4 = this.parameters.get((long)var1);
            if (null != var4) {
               if (var3 != -1945234542) {
                  throw new IllegalStateException();
               }

               if (var4 instanceof IntegerNode) {
                  IntegerNode var5 = (IntegerNode)var4;
                  if (var5.integer == var2) {
                     if (var3 != -1945234542) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  var5.integer = var2;
                  return true;
               }

               var4.remove();
            }
         } else {
            this.parameters = new IterableNodeHashTable(4);
         }

         this.parameters.put((Node)(new IntegerNode(var2)), (long)var1);
         return true;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "gs.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ad")
   boolean method4316(int var1, int var2) {
      try {
         if (var1 != this.currentOwner * 1172757763) {
            if (var2 != 1623441177) {
               throw new IllegalStateException();
            }

            if (this.memberRanks[var1] != 126) {
               this.memberRanks[this.currentOwner * 1172757763] = 125;
               this.field2058 = this.currentOwner * -290569037;
               this.memberRanks[var1] = 126;
               this.currentOwner = -2036828757 * var1;
               return true;
            }

            if (var2 != 1623441177) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gs.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;B)Z")
   @ObfuscatedName("ar")
   boolean method4340(int var1, String var2, byte var3) {
      try {
         if (null == var2) {
            if (var3 == 20) {
               throw new IllegalStateException();
            }

            var2 = "";
         } else if (var2.length() > 80) {
            if (var3 == 20) {
               throw new IllegalStateException();
            }

            var2 = var2.substring(0, 80);
         }

         if (this.parameters != null) {
            if (var3 == 20) {
               throw new IllegalStateException();
            }

            Node var4 = this.parameters.get((long)var1);
            if (null != var4) {
               if (var3 == 20) {
                  throw new IllegalStateException();
               }

               if (var4 instanceof ObjectNode) {
                  if (var3 == 20) {
                     throw new IllegalStateException();
                  }

                  ObjectNode var5 = (ObjectNode)var4;
                  if (var5.obj instanceof String) {
                     if (var3 == 20) {
                        throw new IllegalStateException();
                     }

                     if (var2.equals(var5.obj)) {
                        if (var3 == 20) {
                           throw new IllegalStateException();
                        }

                        return false;
                     }

                     var5.remove();
                     this.parameters.put((Node)(new ObjectNode(var2)), var5.key);
                     return true;
                  }
               }

               var4.remove();
            }
         } else {
            this.parameters = new IterableNodeHashTable(4);
         }

         this.parameters.put((Node)(new ObjectNode(var2)), (long)var1);
         return true;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "gs.ar(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgs;Lxa;)V")
   @ObfuscatedName("wt")
   public static void method4343(ClanSettings var0, Buffer var1) {
      if (var0 == null) {
         var0.method4288();
      }

      int var2 = var1.readUnsignedByte(1402899245);
      if (var2 >= 1 && var2 <= 6) {
         int var3 = var1.readUnsignedByte(1509368729);
         if ((var3 & 1) != 0) {
            var0.useHashes = true;
         }

         if (0 != (var3 & 2)) {
            var0.useNames = true;
         }

         if (!var0.useHashes) {
            var0.memberHashes = null;
            var0.bannedMemberHashes = null;
         }

         if (!var0.useNames) {
            var0.memberNames = null;
            var0.bannedMemberNames = null;
         }

         var0.field2062 = Buffer.method12015(var1, 1064807349) * 935580640;
         var0.field2059 = Buffer.method12015(var1, -590797205) * 2062829173;
         if (var2 <= 3 && 3665056 * var0.field2059 != 0) {
            var0.field2059 += 323210784;
         }

         var0.memberCount = Buffer.method12008(var1, (byte)5) * 1160642422;
         var0.bannedMemberCount = var1.readUnsignedByte(373939274) * -1352165680;
         var0.name = var1.readStringCp1252NullCircumfixed(-1649287278);
         if (var2 >= 4) {
            Buffer.method12015(var1, -145176629);
         }

         var0.allowGuests = var1.readUnsignedByte(1399488891) == 1;
         var0.field2068 = Buffer.method12001(var1, (byte)82);
         var0.field2063 = Buffer.method12001(var1, (byte)74);
         var0.field2065 = Buffer.method12001(var1, (byte)23);
         var0.field2066 = Buffer.method12001(var1, (byte)125);
         if (1184926393 * var0.memberCount > 0) {
            if (var0.useHashes && (null == var0.memberHashes || var0.memberHashes.length < var0.memberCount * 107635007)) {
               var0.memberHashes = new long[1184926393 * var0.memberCount];
            }

            if (var0.useNames && (var0.memberNames == null || var0.memberNames.length < var0.memberCount * 1184926393)) {
               var0.memberNames = new String[var0.memberCount * 1184926393];
            }

            if (null == var0.memberRanks || var0.memberRanks.length < -893330626 * var0.memberCount) {
               var0.memberRanks = new byte[var0.memberCount * 196707548];
            }

            if (var0.field2079 == null || var0.field2079.length < -454735239 * var0.memberCount) {
               var0.field2079 = new int[var0.memberCount * 1480549813];
            }

            if (null == var0.memberJoinDates || var0.memberJoinDates.length < var0.memberCount * 1184926393) {
               var0.memberJoinDates = new int[var0.memberCount * 311356099];
            }

            if (var0.field2085 == null || var0.field2085.length < 1184926393 * var0.memberCount) {
               var0.field2085 = new boolean[1257059745 * var0.memberCount];
            }

            for (int var4 = 0; var4 < 1184926393 * var0.memberCount; var4++) {
               if (var0.useHashes) {
                  var0.memberHashes[var4] = Buffer.method12018(var1, -1889603714);
               }

               if (var0.useNames) {
                  var0.memberNames[var4] = var1.readCESU8(792604665);
               }

               var0.memberRanks[var4] = Buffer.method12001(var1, (byte)23);
               if (var2 >= 2) {
                  var0.field2079[var4] = Buffer.method12015(var1, 800941466);
               }

               if (var2 >= 5) {
                  var0.memberJoinDates[var4] = Buffer.method12008(var1, (byte)5);
               } else {
                  var0.memberJoinDates[var4] = 0;
               }

               if (var2 >= 6) {
                  var0.field2085[var4] = var1.readUnsignedByte(414748555) == 1;
               } else {
                  var0.field2085[var4] = false;
               }
            }

            var0.updateOwner(190401616);
         }

         if (-890431577 * var0.bannedMemberCount > 0) {
            if (var0.useHashes && (var0.bannedMemberHashes == null || var0.bannedMemberHashes.length < var0.bannedMemberCount * -890431577)) {
               var0.bannedMemberHashes = new long[-1221914295 * var0.bannedMemberCount];
            }

            if (var0.useNames && (null == var0.bannedMemberNames || var0.bannedMemberNames.length < 822860430 * var0.bannedMemberCount)) {
               var0.bannedMemberNames = new String[-1746465829 * var0.bannedMemberCount];
            }

            for (int var10 = 0; var10 < -890431577 * var0.bannedMemberCount; var10++) {
               if (var0.useHashes) {
                  var0.bannedMemberHashes[var10] = Buffer.method12018(var1, -2096288748);
               }

               if (var0.useNames) {
                  var0.bannedMemberNames[var10] = var1.readCESU8(792604665);
               }
            }
         }

         if (var2 >= 3) {
            int var11 = Buffer.method12008(var1, (byte)5);
            if (var11 > 0) {
               var0.parameters = new IterableNodeHashTable(var11 < 16 ? class161.method4253(var11, (byte)0) : 16);

               while (var11-- > 0) {
                  int var5 = Buffer.method12015(var1, -505274306);
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if (0 == var7) {
                     int var8 = Buffer.method12015(var1, 466259187);
                     var0.parameters.put((Node)(new IntegerNode(var8)), (long)var6);
                  } else if (1 == var7) {
                     long var12 = Buffer.method12018(var1, -2117643686);
                     var0.parameters.put((Node)(new classVA(var12)), (long)var6);
                  } else if (var7 == 2) {
                     String var13 = var1.readStringCp1252NullCircumfixed(1520834186);
                     var0.parameters.put((Node)(new ObjectNode(var13)), (long)var6);
                  }
               }
            }
         }
      } else {
         throw new RuntimeException("" + var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("ah")
   void method4344(Buffer var1, byte var2) {
      try {
         int var3 = var1.readUnsignedByte(-548115602);
         if (var3 >= 1) {
            if (var2 <= 2) {
               return;
            }

            if (var3 <= 6) {
               int var4 = var1.readUnsignedByte(660110055);
               if ((var4 & 1) != 0) {
                  if (var2 <= 2) {
                     throw new IllegalStateException();
                  }

                  this.useHashes = true;
               }

               if (0 != (var4 & 2)) {
                  this.useNames = true;
               }

               if (!this.useHashes) {
                  if (var2 <= 2) {
                     throw new IllegalStateException();
                  }

                  this.memberHashes = null;
                  this.bannedMemberHashes = null;
               }

               if (!this.useNames) {
                  if (var2 <= 2) {
                     throw new IllegalStateException();
                  }

                  this.memberNames = null;
                  this.bannedMemberNames = null;
               }

               this.field2062 = Buffer.method12015(var1, 1481210076) * 2029957263;
               this.field2059 = Buffer.method12015(var1, -507390222) * 2062829173;
               if (var3 <= 3) {
                  if (var2 <= 2) {
                     throw new IllegalStateException();
                  }

                  if (219077085 * this.field2059 != 0) {
                     if (var2 <= 2) {
                        return;
                     }

                     this.field2059 += 323210784;
                  }
               }

               this.memberCount = Buffer.method12008(var1, (byte)5) * -34186359;
               this.bannedMemberCount = var1.readUnsignedByte(-575684149) * -938336233;
               this.name = var1.readStringCp1252NullCircumfixed(-1509590438);
               if (var3 >= 4) {
                  if (var2 <= 2) {
                     throw new IllegalStateException();
                  }

                  Buffer.method12015(var1, 1155578163);
               }

               boolean var10001;
               if (var1.readUnsignedByte(-1434199581) == 1) {
                  if (var2 <= 2) {
                     return;
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               this.allowGuests = var10001;
               this.field2068 = Buffer.method12001(var1, (byte)54);
               this.field2063 = Buffer.method12001(var1, (byte)41);
               this.field2065 = Buffer.method12001(var1, (byte)13);
               this.field2066 = Buffer.method12001(var1, (byte)4);
               if (1184926393 * this.memberCount > 0) {
                  if (var2 <= 2) {
                     throw new IllegalStateException();
                  }

                  label371:
                  if (this.useHashes) {
                     if (var2 <= 2) {
                        return;
                     }

                     if (null != this.memberHashes) {
                        if (this.memberHashes.length >= this.memberCount * 1184926393) {
                           break label371;
                        }

                        if (var2 <= 2) {
                           return;
                        }
                     }

                     this.memberHashes = new long[1184926393 * this.memberCount];
                  }

                  label362:
                  if (this.useNames) {
                     if (var2 <= 2) {
                        throw new IllegalStateException();
                     }

                     if (this.memberNames != null) {
                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }

                        if (this.memberNames.length >= this.memberCount * 1184926393) {
                           break label362;
                        }

                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }
                     }

                     this.memberNames = new String[this.memberCount * 1184926393];
                  }

                  label353: {
                     if (null != this.memberRanks) {
                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }

                        if (this.memberRanks.length >= 1184926393 * this.memberCount) {
                           break label353;
                        }

                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }
                     }

                     this.memberRanks = new byte[this.memberCount * 1184926393];
                  }

                  label346: {
                     if (this.field2079 != null) {
                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }

                        if (this.field2079.length >= 1184926393 * this.memberCount) {
                           break label346;
                        }

                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }
                     }

                     this.field2079 = new int[this.memberCount * 1184926393];
                  }

                  label339: {
                     if (null != this.memberJoinDates) {
                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }

                        if (this.memberJoinDates.length >= this.memberCount * 1184926393) {
                           break label339;
                        }

                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }
                     }

                     this.memberJoinDates = new int[this.memberCount * 1184926393];
                  }

                  label332: {
                     if (this.field2085 != null) {
                        if (this.field2085.length >= 1184926393 * this.memberCount) {
                           break label332;
                        }

                        if (var2 <= 2) {
                           return;
                        }
                     }

                     this.field2085 = new boolean[1184926393 * this.memberCount];
                  }

                  for (int var5 = 0; var5 < 1184926393 * this.memberCount; var5++) {
                     if (var2 <= 2) {
                        throw new IllegalStateException();
                     }

                     if (this.useHashes) {
                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }

                        this.memberHashes[var5] = Buffer.method12018(var1, -1878218622);
                     }

                     if (this.useNames) {
                        if (var2 <= 2) {
                           return;
                        }

                        this.memberNames[var5] = var1.readCESU8(792604665);
                     }

                     this.memberRanks[var5] = Buffer.method12001(var1, (byte)64);
                     if (var3 >= 2) {
                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }

                        this.field2079[var5] = Buffer.method12015(var1, 1691743903);
                     }

                     if (var3 >= 5) {
                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }

                        this.memberJoinDates[var5] = Buffer.method12008(var1, (byte)5);
                     } else {
                        this.memberJoinDates[var5] = 0;
                     }

                     if (var3 >= 6) {
                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }

                        boolean[] var10000 = this.field2085;
                        boolean var10002;
                        if (var1.readUnsignedByte(1077459898) == 1) {
                           if (var2 <= 2) {
                              throw new IllegalStateException();
                           }

                           var10002 = true;
                        } else {
                           var10002 = false;
                        }

                        var10000[var5] = var10002;
                     } else {
                        this.field2085[var5] = false;
                     }
                  }

                  this.updateOwner(2004573127);
               }

               if (-890431577 * this.bannedMemberCount > 0) {
                  if (var2 <= 2) {
                     return;
                  }

                  label316:
                  if (this.useHashes) {
                     if (var2 <= 2) {
                        throw new IllegalStateException();
                     }

                     if (this.bannedMemberHashes != null) {
                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }

                        if (this.bannedMemberHashes.length >= this.bannedMemberCount * -890431577) {
                           break label316;
                        }

                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }
                     }

                     this.bannedMemberHashes = new long[-890431577 * this.bannedMemberCount];
                  }

                  label306:
                  if (this.useNames) {
                     if (var2 <= 2) {
                        throw new IllegalStateException();
                     }

                     if (null != this.bannedMemberNames) {
                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }

                        if (this.bannedMemberNames.length >= -890431577 * this.bannedMemberCount) {
                           break label306;
                        }

                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }
                     }

                     this.bannedMemberNames = new String[-890431577 * this.bannedMemberCount];
                  }

                  for (int var12 = 0; var12 < -890431577 * this.bannedMemberCount; var12++) {
                     if (this.useHashes) {
                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }

                        this.bannedMemberHashes[var12] = Buffer.method12018(var1, -1888237717);
                     }

                     if (this.useNames) {
                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }

                        this.bannedMemberNames[var12] = var1.readCESU8(792604665);
                     }
                  }
               }

               if (var3 >= 3) {
                  int var13 = Buffer.method12008(var1, (byte)5);
                  if (var13 > 0) {
                     if (var2 <= 2) {
                        throw new IllegalStateException();
                     }

                     IterableNodeHashTable var17 = new IterableNodeHashTable;
                     int var10003;
                     if (var13 < 16) {
                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }

                        var10003 = class161.method4253(var13, (byte)0);
                     } else {
                        var10003 = 16;
                     }

                     var17./* $VF: Unable to resugar constructor */<init>(var10003);
                     this.parameters = var17;

                     while (var13-- > 0) {
                        if (var2 <= 2) {
                           throw new IllegalStateException();
                        }

                        int var6 = Buffer.method12015(var1, 1484020184);
                        int var7 = var6 & 1073741823;
                        int var8 = var6 >>> 30;
                        if (0 == var8) {
                           int var9 = Buffer.method12015(var1, -1038051508);
                           this.parameters.put((Node)(new IntegerNode(var9)), (long)var7);
                        } else if (1 == var8) {
                           long var14 = Buffer.method12018(var1, -1955495816);
                           this.parameters.put((Node)(new classVA(var14)), (long)var7);
                        } else if (var8 == 2) {
                           if (var2 <= 2) {
                              throw new IllegalStateException();
                           }

                           String var15 = var1.readStringCp1252NullCircumfixed(1112428528);
                           this.parameters.put((Node)(new ObjectNode(var15)), (long)var7);
                        }
                     }
                  }
               }

               return;
            }

            if (var2 <= 2) {
               return;
            }
         }

         throw new RuntimeException("" + var3);
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "gs.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Integer;")
   @ObfuscatedName("bk")
   public Integer method4351(int var1) {
      return this.getTitleGroupValue(var1, (byte)4);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bi")
   void method4296(int var1) {
      if (var1 >= 0 && var1 < this.memberCount * -1412031931) {
         this.memberCount -= -34186359;
         this.sortedMembers = null;
         if (825222461 * this.memberCount == 0) {
            this.memberHashes = null;
            this.memberNames = null;
            this.memberRanks = null;
            this.field2079 = null;
            this.memberJoinDates = null;
            this.field2085 = null;
            this.currentOwner = 2036828757;
            this.field2058 = 271652797;
         } else {
            System.arraycopy(this.memberRanks, 1 + var1, this.memberRanks, var1, this.memberCount * 1184926393 - var1);
            System.arraycopy(this.field2079, 1 + var1, this.field2079, var1, 1942647013 * this.memberCount - var1);
            System.arraycopy(this.memberJoinDates, 1 + var1, this.memberJoinDates, var1, this.memberCount * 1799857319 - var1);
            System.arraycopy(this.field2085, var1 + 1, this.field2085, var1, 1911868384 * this.memberCount - var1);
            if (this.memberHashes != null) {
               System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, 1184926393 * this.memberCount - var1);
            }

            if (null != this.memberNames) {
               System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, 778756689 * this.memberCount - var1);
            }

            this.updateOwner(1262920438);
         }
      } else {
         throw new RuntimeException("");
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgs;I)V")
   @ObfuscatedName("kz")
   public static void method4309(ClanSettings var0, int var1) {
      if (var0 == null) {
         var0.method4352();
      }

      var0.bannedMemberCount -= 178839979;
      if (0 == var0.bannedMemberCount * -1003982364) {
         var0.bannedMemberHashes = null;
         var0.bannedMemberNames = null;
      } else {
         if (var0.bannedMemberHashes != null) {
            System.arraycopy(var0.bannedMemberHashes, 1 + var1, var0.bannedMemberHashes, var1, var0.bannedMemberCount * -1795380892 - var1);
         }

         if (var0.bannedMemberNames != null) {
            System.arraycopy(var0.bannedMemberNames, 1 + var1, var0.bannedMemberNames, var1, var0.bannedMemberCount * 1124244559 - var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   void method4269(int var1) {
      if (this.useHashes) {
         if (null != this.memberHashes) {
            System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount * 1184926393);
         } else {
            this.memberHashes = new long[var1];
         }
      }

      if (this.useNames) {
         if (this.memberNames != null) {
            System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount * 1184926393);
         } else {
            this.memberNames = new String[var1];
         }
      }

      if (this.memberRanks != null) {
         System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, 1184926393 * this.memberCount);
      } else {
         this.memberRanks = new byte[var1];
      }

      if (this.field2079 != null) {
         System.arraycopy(this.field2079, 0, this.field2079 = new int[var1], 0, 1184926393 * this.memberCount);
      } else {
         this.field2079 = new int[var1];
      }

      if (null != this.memberJoinDates) {
         System.arraycopy(this.memberJoinDates, 0, this.memberJoinDates = new int[var1], 0, this.memberCount * 641288875);
      } else {
         this.memberJoinDates = new int[var1];
      }

      if (null != this.field2085) {
         System.arraycopy(this.field2085, 0, this.field2085 = new boolean[var1], 0, this.memberCount * 1337295968);
      } else {
         this.field2085 = new boolean[var1];
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;IB)V")
   @ObfuscatedName("qa")
   public static void method4270(ClanSettings var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method4272(var1, var2);
      } else {
         try {
            if (var0.useHashes) {
               if (var2 != 78) {
                  return;
               }

               if (null != var0.memberHashes) {
                  if (var2 != 78) {
                     throw new IllegalStateException();
                  }

                  System.arraycopy(var0.memberHashes, 0, var0.memberHashes = new long[var1], 0, var0.memberCount * 1184926393);
               } else {
                  var0.memberHashes = new long[var1];
               }
            }

            if (var0.useNames) {
               if (var2 != 78) {
                  throw new IllegalStateException();
               }

               if (var0.memberNames != null) {
                  System.arraycopy(var0.memberNames, 0, var0.memberNames = new String[var1], 0, var0.memberCount * 1184926393);
               } else {
                  var0.memberNames = new String[var1];
               }
            }

            if (var0.memberRanks != null) {
               if (var2 != 78) {
                  return;
               }

               System.arraycopy(var0.memberRanks, 0, var0.memberRanks = new byte[var1], 0, 1184926393 * var0.memberCount);
            } else {
               var0.memberRanks = new byte[var1];
            }

            if (var0.field2079 != null) {
               if (var2 != 78) {
                  throw new IllegalStateException();
               }

               System.arraycopy(var0.field2079, 0, var0.field2079 = new int[var1], 0, 1184926393 * var0.memberCount);
            } else {
               var0.field2079 = new int[var1];
            }

            if (null != var0.memberJoinDates) {
               if (var2 != 78) {
                  throw new IllegalStateException();
               }

               System.arraycopy(var0.memberJoinDates, 0, var0.memberJoinDates = new int[var1], 0, var0.memberCount * 1184926393);
            } else {
               var0.memberJoinDates = new int[var1];
            }

            if (null != var0.field2085) {
               System.arraycopy(var0.field2085, 0, var0.field2085 = new boolean[var1], 0, var0.memberCount * 1184926393);
            } else {
               var0.field2085 = new boolean[var1];
            }
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "gs.av(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IZ)I")
   @ObfuscatedName("ct")
   int method4318(int var1, boolean var2) {
      if (var2 == this.field2085[var1]) {
         return -1;
      } else {
         this.field2085[var1] = var2;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgs;Lxa;)V")
   @ObfuscatedName("zo")
   public static void method4345(ClanSettings var0, Buffer var1) {
      if (var0 == null) {
         var0.method4289();
      }

      int var2 = var1.readUnsignedByte(-329889460);
      if (var2 >= 1 && var2 <= 6) {
         int var3 = var1.readUnsignedByte(-1499730950);
         if ((var3 & 1) != 0) {
            var0.useHashes = true;
         }

         if (0 != (var3 & 2)) {
            var0.useNames = true;
         }

         if (!var0.useHashes) {
            var0.memberHashes = null;
            var0.bannedMemberHashes = null;
         }

         if (!var0.useNames) {
            var0.memberNames = null;
            var0.bannedMemberNames = null;
         }

         var0.field2062 = Buffer.method12015(var1, -512617904) * 2029957263;
         var0.field2059 = Buffer.method12015(var1, 1099399138) * 2062829173;
         if (var2 <= 3 && 219077085 * var0.field2059 != 0) {
            var0.field2059 += 323210784;
         }

         var0.memberCount = Buffer.method12008(var1, (byte)5) * -34186359;
         var0.bannedMemberCount = var1.readUnsignedByte(2024312347) * -938336233;
         var0.name = var1.readStringCp1252NullCircumfixed(1228339506);
         if (var2 >= 4) {
            Buffer.method12015(var1, 319108814);
         }

         var0.allowGuests = var1.readUnsignedByte(-1126077734) == 1;
         var0.field2068 = Buffer.method12001(var1, (byte)91);
         var0.field2063 = Buffer.method12001(var1, (byte)41);
         var0.field2065 = Buffer.method12001(var1, (byte)59);
         var0.field2066 = Buffer.method12001(var1, (byte)97);
         if (1184926393 * var0.memberCount > 0) {
            if (var0.useHashes && (null == var0.memberHashes || var0.memberHashes.length < var0.memberCount * 1184926393)) {
               var0.memberHashes = new long[1184926393 * var0.memberCount];
            }

            if (var0.useNames && (var0.memberNames == null || var0.memberNames.length < var0.memberCount * 1184926393)) {
               var0.memberNames = new String[var0.memberCount * 1184926393];
            }

            if (null == var0.memberRanks || var0.memberRanks.length < 1184926393 * var0.memberCount) {
               var0.memberRanks = new byte[var0.memberCount * 1184926393];
            }

            if (var0.field2079 == null || var0.field2079.length < 1184926393 * var0.memberCount) {
               var0.field2079 = new int[var0.memberCount * 1184926393];
            }

            if (null == var0.memberJoinDates || var0.memberJoinDates.length < var0.memberCount * 1184926393) {
               var0.memberJoinDates = new int[var0.memberCount * 1184926393];
            }

            if (var0.field2085 == null || var0.field2085.length < 1184926393 * var0.memberCount) {
               var0.field2085 = new boolean[1184926393 * var0.memberCount];
            }

            for (int var4 = 0; var4 < 1184926393 * var0.memberCount; var4++) {
               if (var0.useHashes) {
                  var0.memberHashes[var4] = Buffer.method12018(var1, -1965790860);
               }

               if (var0.useNames) {
                  var0.memberNames[var4] = var1.readCESU8(792604665);
               }

               var0.memberRanks[var4] = Buffer.method12001(var1, (byte)49);
               if (var2 >= 2) {
                  var0.field2079[var4] = Buffer.method12015(var1, 1923197177);
               }

               if (var2 >= 5) {
                  var0.memberJoinDates[var4] = Buffer.method12008(var1, (byte)5);
               } else {
                  var0.memberJoinDates[var4] = 0;
               }

               if (var2 >= 6) {
                  var0.field2085[var4] = var1.readUnsignedByte(1646093640) == 1;
               } else {
                  var0.field2085[var4] = false;
               }
            }

            var0.updateOwner(939841470);
         }

         if (-890431577 * var0.bannedMemberCount > 0) {
            if (var0.useHashes && (var0.bannedMemberHashes == null || var0.bannedMemberHashes.length < var0.bannedMemberCount * -890431577)) {
               var0.bannedMemberHashes = new long[-890431577 * var0.bannedMemberCount];
            }

            if (var0.useNames && (null == var0.bannedMemberNames || var0.bannedMemberNames.length < -890431577 * var0.bannedMemberCount)) {
               var0.bannedMemberNames = new String[-890431577 * var0.bannedMemberCount];
            }

            for (int var10 = 0; var10 < -890431577 * var0.bannedMemberCount; var10++) {
               if (var0.useHashes) {
                  var0.bannedMemberHashes[var10] = Buffer.method12018(var1, -2051324959);
               }

               if (var0.useNames) {
                  var0.bannedMemberNames[var10] = var1.readCESU8(792604665);
               }
            }
         }

         if (var2 >= 3) {
            int var11 = Buffer.method12008(var1, (byte)5);
            if (var11 > 0) {
               var0.parameters = new IterableNodeHashTable(var11 < 16 ? class161.method4253(var11, (byte)0) : 16);

               while (var11-- > 0) {
                  int var5 = Buffer.method12015(var1, 1158845631);
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if (0 == var7) {
                     int var8 = Buffer.method12015(var1, 642035163);
                     var0.parameters.put((Node)(new IntegerNode(var8)), (long)var6);
                  } else if (1 == var7) {
                     long var12 = Buffer.method12018(var1, -1943317559);
                     var0.parameters.put((Node)(new classVA(var12)), (long)var6);
                  } else if (var7 == 2) {
                     String var13 = var1.readStringCp1252NullCircumfixed(-1108546782);
                     var0.parameters.put((Node)(new ObjectNode(var13)), (long)var6);
                  }
               }
            }
         }
      } else {
         throw new RuntimeException("" + var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ao")
   void method4273(int var1) {
      if (this.useHashes) {
         if (null != this.bannedMemberHashes) {
            System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, -890431577 * this.bannedMemberCount);
         } else {
            this.bannedMemberHashes = new long[var1];
         }
      }

      if (this.useNames) {
         if (this.bannedMemberNames != null) {
            System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, -890431577 * this.bannedMemberCount);
         } else {
            this.bannedMemberNames = new String[var1];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("aq")
   public int method4276(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         for (int var2 = 0; var2 < 1184926393 * this.memberCount; var2++) {
            if (this.memberNames[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;IJ)Z")
   @ObfuscatedName("wq")
   public static boolean method4334(ClanSettings var0, int var1, long var2) {
      if (var0 == null) {
         return var0.method4338(var1, var2);
      } else {
         try {
            if (var0.parameters != null) {
               Node var4 = var0.parameters.get((long)var1);
               if (var4 != null) {
                  if (var4 instanceof classVA) {
                     classVA var5 = (classVA)var4;
                     if (var5.field6145 == var2) {
                        return false;
                     }

                     var5.field6145 = var2;
                     return true;
                  }

                  var4.remove();
               }
            } else {
               var0.parameters = new IterableNodeHashTable(4);
            }

            var0.parameters.put((Node)(new classVA(var2)), (long)var1);
            return true;
         } catch (RuntimeException var6) {
            throw RestClientThreadFactory.newRunException(var6, "gs.ax(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("rf")
   public int method4347(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         var1 = var1.toLowerCase();
         String[] var2 = this.method4350();
         int[] var3 = this.method4354();
         int var4 = 0;
         int var5 = var3.length - 1;

         while (var4 <= var5) {
            int var6 = var4 + var5 >>> 1;
            int var7 = var3[var6];
            String var8 = var2[var7];
            int var9 = var8.toLowerCase().compareTo(var1);
            if (var9 < 0) {
               var4 = var6 + 1;
            } else {
               if (var9 <= 0) {
                  return var7;
               }

               var5 = var6 - 1;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgs;Ljava/lang/String;)I")
   @ObfuscatedName("zh")
   public static int method4277(ClanSettings var0, String var1) {
      if (var0 == null) {
         return var0.method4281(var1);
      } else if (var1 != null && !var1.isEmpty()) {
         for (int var2 = 0; var2 < -1743042434 * var0.memberCount; var2++) {
            if (var0.memberNames[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("be")
   public int method4278(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         for (int var2 = 0; var2 < 1004969783 * this.memberCount; var2++) {
            if (this.memberNames[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgs;Ljava/lang/String;)I")
   @ObfuscatedName("np")
   public static int method4279(ClanSettings var0, String var1) {
      if (var0 == null) {
         var0.findMember(var1);
      }

      if (var1 != null && !var1.isEmpty()) {
         for (int var2 = 0; var2 < -625897987 * var0.memberCount; var2++) {
            if (var0.memberNames[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   void method4271(int var1) {
      if (this.useHashes) {
         if (null != this.memberHashes) {
            System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount * 1184926393);
         } else {
            this.memberHashes = new long[var1];
         }
      }

      if (this.useNames) {
         if (this.memberNames != null) {
            System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount * 1184926393);
         } else {
            this.memberNames = new String[var1];
         }
      }

      if (this.memberRanks != null) {
         System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, 1184926393 * this.memberCount);
      } else {
         this.memberRanks = new byte[var1];
      }

      if (this.field2079 != null) {
         System.arraycopy(this.field2079, 0, this.field2079 = new int[var1], 0, -2093305016 * this.memberCount);
      } else {
         this.field2079 = new int[var1];
      }

      if (null != this.memberJoinDates) {
         System.arraycopy(this.memberJoinDates, 0, this.memberJoinDates = new int[var1], 0, this.memberCount * -1494635458);
      } else {
         this.memberJoinDates = new int[var1];
      }

      if (null != this.field2085) {
         System.arraycopy(this.field2085, 0, this.field2085 = new boolean[var1], 0, this.memberCount * 1184926393);
      } else {
         this.field2085 = new boolean[var1];
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("bg")
   public int method4280(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         for (int var2 = 0; var2 < -1882065613 * this.memberCount; var2++) {
            if (this.memberNames[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("bs")
   public int method4282(int var1, int var2, int var3) {
      int var4 = var3 == 31 ? -1 : (1 << 1 + var3) - 1;
      return (this.field2079[var1] & var4) >>> var2;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Integer;")
   @ObfuscatedName("ho")
   public Integer method4284(int var1) {
      if (this.parameters == null) {
         return null;
      } else {
         Node var2 = this.parameters.get((long)var1);
         return null != var2 && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Integer;")
   @ObfuscatedName("bz")
   public Integer method4285(int var1) {
      if (this.parameters == null) {
         return null;
      } else {
         Node var2 = this.parameters.get((long)var1);
         return null != var2 && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null;
      }
   }

   public ClanTitle titleForRank(ClanRank var1) {
      if (!SecureUrlRequester.client.isClientThread()) {
         if (!GameEngine.$assertionsDisabled) {
            throw new AssertionError("must be called on client thread");
         } else {
            throw new IllegalStateException("must be called on client thread");
         }
      } else {
         int var2;
         switch (var1.getRank()) {
            case -1:
               var2 = -1;
               break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 106:
            case 107:
            case 108:
            case 109:
            case 111:
            case 112:
            case 113:
            case 114:
            case 116:
            case 117:
            case 118:
            case 119:
            case 121:
            case 122:
            case 123:
            default:
               var2 = this.method4348(1, 0, 9);
               break;
            case 10:
               var2 = this.method4348(1, 10, 19);
               break;
            case 20:
               var2 = this.method4348(1, 20, 29);
               break;
            case 30:
               var2 = this.method4348(2, 0, 9);
               break;
            case 40:
               var2 = this.method4348(2, 10, 19);
               break;
            case 50:
               var2 = this.method4348(2, 20, 29);
               break;
            case 60:
               var2 = this.method4348(3, 0, 9);
               break;
            case 70:
               var2 = this.method4348(3, 10, 19);
               break;
            case 80:
               var2 = this.method4348(3, 20, 29);
               break;
            case 90:
               var2 = this.method4348(4, 0, 9);
               break;
            case 95:
               var2 = this.method4348(5, 20, 29);
               break;
            case 96:
               var2 = this.method4348(102, 0, 9);
               break;
            case 97:
               var2 = this.method4348(102, 10, 19);
               break;
            case 98:
               var2 = this.method4348(102, 20, 29);
               break;
            case 99:
               var2 = this.method4348(103, 0, 9);
               break;
            case 100:
               var2 = -2;
               break;
            case 101:
               var2 = this.method4348(103, 10, 19);
               break;
            case 102:
               var2 = this.method4348(103, 20, 29);
               break;
            case 103:
               var2 = this.method4348(104, 0, 9);
               break;
            case 104:
               var2 = this.method4348(104, 10, 19);
               break;
            case 105:
               var2 = this.method4348(4, 10, 19);
               break;
            case 110:
               var2 = this.method4348(4, 20, 29);
               break;
            case 115:
               var2 = this.method4348(5, 0, 9);
               break;
            case 120:
               var2 = this.method4348(5, 10, 19);
               break;
            case 124:
               var2 = this.method4348(104, 20, 29);
               break;
            case 125:
               var2 = -3;
               break;
            case 126:
               var2 = -4;
               break;
            case 127:
               var2 = -5;
         }

         if (var2 == 1023) {
            return null;
         } else {
            EnumComposition var3 = SecureUrlRequester.client.method2357(3797);
            String var4 = var3.getStringValue(var2);
            return !var4.isEmpty() ? new ClanTitle(var2, var4) : null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bb")
   public int[] method4288() {
      if (this.sortedMembers == null) {
         String[] var1 = new String[1184926393 * this.memberCount];
         this.sortedMembers = new int[this.memberCount * 1184926393];

         for (int var2 = 0; var2 < 1184926393 * this.memberCount; this.sortedMembers[var2] = var2++) {
            var1[var2] = this.memberNames[var2];
            if (null != var1[var2]) {
               var1[var2] = var1[var2].toLowerCase();
            }
         }

         class28.method499(var1, this.sortedMembers, (byte)11);
      }

      return this.sortedMembers;
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("bj")
   public int[] method4289() {
      if (this.sortedMembers == null) {
         String[] var1 = new String[-889116271 * this.memberCount];
         this.sortedMembers = new int[this.memberCount * 1184926393];

         for (int var2 = 0; var2 < 1938642120 * this.memberCount; this.sortedMembers[var2] = var2++) {
            var1[var2] = this.memberNames[var2];
            if (null != var1[var2]) {
               var1[var2] = var1[var2].toLowerCase();
            }
         }

         class28.method499(var1, this.sortedMembers, (byte)32);
      }

      return this.sortedMembers;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgs;IIII)I")
   @ObfuscatedName("qj")
   public static int method4324(ClanSettings var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method4351(var1);
      }

      int var5 = (1 << var3) - 1;
      int var6 = 31 == var4 ? -1 : (1 << var4 + 1) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      int var8 = var0.field2079[var1];
      if ((var8 & var7) == var2) {
         return -1;
      } else {
         var8 &= ~var7;
         var0.field2079[var1] = var8 | var2;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(JLjava/lang/String;I)V")
   @ObfuscatedName("bp")
   void method4291(long var1, String var3, int var4) {
      if (var3 != null && var3.isEmpty()) {
         var3 = null;
      }

      if (this.useHashes != var1 > 0L) {
         throw new RuntimeException("");
      } else if (this.useNames != (null != var3)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.memberHashes == null || this.memberCount * 1184926393 >= this.memberHashes.length)
            || var3 != null && (null == this.memberNames || 1184926393 * this.memberCount >= this.memberNames.length)) {
            method4270(this, 1184926393 * this.memberCount + 5, (byte)78);
         }

         if (this.memberHashes != null) {
            this.memberHashes[this.memberCount * 1184926393] = var1;
         }

         if (this.memberNames != null) {
            this.memberNames[this.memberCount * 1184926393] = var3;
         }

         if (this.currentOwner * 1172757763 == -1) {
            this.currentOwner = this.memberCount * -1065666925;
            this.memberRanks[1184926393 * this.memberCount] = 126;
         } else {
            this.memberRanks[1184926393 * this.memberCount] = 0;
         }

         this.field2079[1184926393 * this.memberCount] = 0;
         this.memberJoinDates[this.memberCount * 1184926393] = var4;
         this.field2085[1184926393 * this.memberCount] = false;
         this.memberCount += -34186359;
         this.sortedMembers = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(JLjava/lang/String;I)V")
   @ObfuscatedName("bt")
   void method4292(long var1, String var3, int var4) {
      if (var3 != null && var3.isEmpty()) {
         var3 = null;
      }

      if (this.useHashes != var1 > 0L) {
         throw new RuntimeException("");
      } else if (this.useNames != (null != var3)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.memberHashes == null || this.memberCount * 250121543 >= this.memberHashes.length)
            || var3 != null && (null == this.memberNames || -1030452100 * this.memberCount >= this.memberNames.length)) {
            method4270(this, 1184926393 * this.memberCount + 5, (byte)78);
         }

         if (this.memberHashes != null) {
            this.memberHashes[this.memberCount * 1184926393] = var1;
         }

         if (this.memberNames != null) {
            this.memberNames[this.memberCount * 1184926393] = var3;
         }

         if (this.currentOwner * 1172757763 == -1) {
            this.currentOwner = this.memberCount * -1065666925;
            this.memberRanks[-1008637653 * this.memberCount] = 126;
         } else {
            this.memberRanks[1184926393 * this.memberCount] = 0;
         }

         this.field2079[530054325 * this.memberCount] = 0;
         this.memberJoinDates[this.memberCount * 2061653240] = var4;
         this.field2085[-791749363 * this.memberCount] = false;
         this.memberCount += -1791519382;
         this.sortedMembers = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ba")
   void method4297(int var1) {
      if (var1 >= 0 && var1 < this.memberCount * 1184926393) {
         this.memberCount -= -1559227158;
         this.sortedMembers = null;
         if (1807041361 * this.memberCount == 0) {
            this.memberHashes = null;
            this.memberNames = null;
            this.memberRanks = null;
            this.field2079 = null;
            this.memberJoinDates = null;
            this.field2085 = null;
            this.currentOwner = 2036828757;
            this.field2058 = 1032682162;
         } else {
            System.arraycopy(this.memberRanks, 1 + var1, this.memberRanks, var1, this.memberCount * 2084386368 - var1);
            System.arraycopy(this.field2079, 1 + var1, this.field2079, var1, 963251816 * this.memberCount - var1);
            System.arraycopy(this.memberJoinDates, 1 + var1, this.memberJoinDates, var1, this.memberCount * -1594450971 - var1);
            System.arraycopy(this.field2085, var1 + 1, this.field2085, var1, 1184926393 * this.memberCount - var1);
            if (this.memberHashes != null) {
               System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, 1184926393 * this.memberCount - var1);
            }

            if (null != this.memberNames) {
               System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, 1184926393 * this.memberCount - var1);
            }

            this.updateOwner(535899188);
         }
      } else {
         throw new RuntimeException("");
      }
   }

   public ClanSettings(Buffer var1) {
      this.field2058 = 1877626223;
      this.method4344(var1, (byte)23);
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("km")
   public byte[] method4352() {
      return this.memberRanks;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ap")
   void updateOwner(int var1) {
      try {
         if (1184926393 * this.memberCount == 0) {
            this.currentOwner = 2036828757;
            this.field2058 = 1877626223;
         } else {
            this.currentOwner = 2036828757;
            this.field2058 = 1877626223;
            int var2 = 0;
            byte var3 = this.memberRanks[0];

            for (int var4 = 1; var4 < 1184926393 * this.memberCount; var4++) {
               if (var1 <= -1246917826) {
                  throw new IllegalStateException();
               }

               if (this.memberRanks[var4] > var3) {
                  if (var1 <= -1246917826) {
                     throw new IllegalStateException();
                  }

                  if (var3 == 125) {
                     if (var1 <= -1246917826) {
                        throw new IllegalStateException();
                     }

                     this.field2058 = -1877626223 * var2;
                  }

                  var2 = var4;
                  var3 = this.memberRanks[var4];
               } else if (1673809521 * this.field2058 == -1) {
                  if (var1 <= -1246917826) {
                     throw new IllegalStateException();
                  }

                  if (this.memberRanks[var4] == 125) {
                     if (var1 <= -1246917826) {
                        throw new IllegalStateException();
                     }

                     this.field2058 = var4 * -1877626223;
                  }
               }
            }

            this.currentOwner = var2 * -2036828757;
            if (-1 != 1172757763 * this.currentOwner) {
               if (var1 <= -1246917826) {
                  throw new IllegalStateException();
               }

               this.memberRanks[1172757763 * this.currentOwner] = 126;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "gs.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bf")
   void method4302() {
      if (1184926393 * this.memberCount == 0) {
         this.currentOwner = 2036828757;
         this.field2058 = 937423925;
      } else {
         this.currentOwner = 2036828757;
         this.field2058 = 1877626223;
         int var1 = 0;
         byte var2 = this.memberRanks[0];

         for (int var3 = 1; var3 < 1877691316 * this.memberCount; var3++) {
            if (this.memberRanks[var3] > var2) {
               if (var2 == -995451206) {
                  this.field2058 = -1877626223 * var1;
               }

               var1 = var3;
               var2 = this.memberRanks[var3];
            } else if (-331355119 * this.field2058 == -1 && this.memberRanks[var3] == 125) {
               this.field2058 = var3 * -1877626223;
            }
         }

         this.currentOwner = var1 * -2036828757;
         if (-1 != 1172757763 * this.currentOwner) {
            this.memberRanks[1172757763 * this.currentOwner] = 126;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bn")
   void method4303() {
      if (1184926393 * this.memberCount == 0) {
         this.currentOwner = 2036828757;
         this.field2058 = 1877626223;
      } else {
         this.currentOwner = 2036828757;
         this.field2058 = 1877626223;
         int var1 = 0;
         byte var2 = this.memberRanks[0];

         for (int var3 = 1; var3 < 1184926393 * this.memberCount; var3++) {
            if (this.memberRanks[var3] > var2) {
               if (var2 == 125) {
                  this.field2058 = -1877626223 * var1;
               }

               var1 = var3;
               var2 = this.memberRanks[var3];
            } else if (1673809521 * this.field2058 == -1 && this.memberRanks[var3] == 125) {
               this.field2058 = var3 * -1877626223;
            }
         }

         this.currentOwner = var1 * -2036828757;
         if (-1 != 1172757763 * this.currentOwner) {
            this.memberRanks[1172757763 * this.currentOwner] = 126;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(JLjava/lang/String;)V")
   @ObfuscatedName("bd")
   void method4304(long var1, String var3) {
      if (var3 != null && var3.isEmpty()) {
         var3 = null;
      }

      if (var1 > 0L != this.useHashes) {
         throw new RuntimeException("");
      } else if (this.useNames != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount * -1284001338 >= this.bannedMemberHashes.length)
            || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount * -890431577 >= this.bannedMemberNames.length)) {
            this.method4275(5 + this.bannedMemberCount * -890431577, 1025915100);
         }

         if (null != this.bannedMemberHashes) {
            this.bannedMemberHashes[this.bannedMemberCount * 185720286] = var1;
         }

         if (null != this.bannedMemberNames) {
            this.bannedMemberNames[-890431577 * this.bannedMemberCount] = var3;
         }

         this.bannedMemberCount += -1805138198;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;JLjava/lang/String;II)V")
   @ObfuscatedName("ps")
   public static void method4293(ClanSettings var0, long var1, String var3, int var4, int var5) {
      if (var0 == null) {
         var0.method4294(var1, var3, var4, var4);
      }

      try {
         if (var3 != null) {
            if (var5 == 46658093) {
               throw new IllegalStateException();
            }

            if (var3.isEmpty()) {
               var3 = null;
            }
         }

         boolean var10001;
         if (var1 > 0L) {
            if (var5 == 46658093) {
               return;
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         if (var0.useHashes != var10001) {
            if (var5 == 46658093) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("");
            }
         } else {
            if (null != var3) {
               if (var5 == 46658093) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            if (var0.useNames != var10001) {
               if (var5 == 46658093) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException("");
               }
            } else {
               label120: {
                  label131: {
                     if (var1 > 0L) {
                        if (var5 == 46658093) {
                           throw new IllegalStateException();
                        }

                        if (var0.memberHashes == null) {
                           break label131;
                        }

                        if (var5 == 46658093) {
                           throw new IllegalStateException();
                        }

                        if (var0.memberCount * 1184926393 >= var0.memberHashes.length) {
                           break label131;
                        }

                        if (var5 == 46658093) {
                           return;
                        }
                     }

                     if (var3 == null) {
                        break label120;
                     }

                     if (var5 == 46658093) {
                        throw new IllegalStateException();
                     }

                     if (null != var0.memberNames) {
                        if (var5 == 46658093) {
                           return;
                        }

                        if (1184926393 * var0.memberCount < var0.memberNames.length) {
                           break label120;
                        }

                        if (var5 == 46658093) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  method4270(var0, 1184926393 * var0.memberCount + 5, (byte)78);
               }

               if (var0.memberHashes != null) {
                  if (var5 == 46658093) {
                     return;
                  }

                  var0.memberHashes[var0.memberCount * 1184926393] = var1;
               }

               if (var0.memberNames != null) {
                  if (var5 == 46658093) {
                     throw new IllegalStateException();
                  }

                  var0.memberNames[var0.memberCount * 1184926393] = var3;
               }

               if (var0.currentOwner * 1172757763 == -1) {
                  if (var5 == 46658093) {
                     throw new IllegalStateException();
                  }

                  var0.currentOwner = var0.memberCount * -1065666925;
                  var0.memberRanks[1184926393 * var0.memberCount] = 126;
               } else {
                  var0.memberRanks[1184926393 * var0.memberCount] = 0;
               }

               var0.field2079[1184926393 * var0.memberCount] = 0;
               var0.memberJoinDates[var0.memberCount * 1184926393] = var4;
               var0.field2085[1184926393 * var0.memberCount] = false;
               var0.memberCount += -34186359;
               var0.sortedMembers = null;
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "gs.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Ljava/lang/Integer;")
   @ObfuscatedName("ae")
   public Integer getTitleGroupValue(int var1, byte var2) {
      try {
         if (this.parameters == null) {
            if (var2 != 4) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            Node var3 = this.parameters.get((long)var1);
            if (null != var3) {
               if (var2 != 4) {
                  throw new IllegalStateException();
               }

               if (var3 instanceof IntegerNode) {
                  return new Integer(((IntegerNode)var3).integer);
               }

               if (var2 != 4) {
                  throw new IllegalStateException();
               }
            }

            return null;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gs.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bh")
   void method4310(int var1) {
      this.bannedMemberCount -= -938336233;
      if (0 == this.bannedMemberCount * -155206451) {
         this.bannedMemberHashes = null;
         this.bannedMemberNames = null;
      } else {
         if (this.bannedMemberHashes != null) {
            System.arraycopy(this.bannedMemberHashes, 1 + var1, this.bannedMemberHashes, var1, this.bannedMemberCount * -890431577 - var1);
         }

         if (this.bannedMemberNames != null) {
            System.arraycopy(this.bannedMemberNames, 1 + var1, this.bannedMemberNames, var1, this.bannedMemberCount * -890431577 - var1);
         }
      }
   }

   public String getName() {
      return this.name;
   }

   @ObfuscatedSignature(descriptor = "(Ldd;Lcr;II)V")
   @ObfuscatedName("kj")
   static void method4346(WorldView var0, Actor var1, int var2, int var3) {
      try {
         classFR.method4051(var0, 340712311 * var1.x, -1747310679 * var1.y, var2, var1.vmethod115(-2008547755), -1503077925);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gs.kj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IZ)I")
   @ObfuscatedName("cb")
   int method4319(int var1, boolean var2) {
      if (var2 == this.field2085[var1]) {
         return -1;
      } else {
         this.field2085[var1] = var2;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("bq")
   int method4312(int var1, byte var2) {
      if (408275138 != var2 && var2 != 127) {
         if (-1044615632 * this.currentOwner != var1 || this.field2058 * 1673809521 != -1 && this.memberRanks[-911058150 * this.field2058] >= 125) {
            if (this.memberRanks[var1] == var2) {
               return -1;
            } else {
               this.memberRanks[var1] = var2;
               this.updateOwner(-1113658748);
               return var1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;JLjava/lang/String;B)V")
   @ObfuscatedName("sp")
   public static void method4305(ClanSettings var0, long var1, String var3, byte var4) {
      if (var0 == null) {
         var0.method4306(var1, var3, var4);
      } else {
         try {
            if (var3 != null) {
               if (var4 >= 62) {
                  throw new IllegalStateException();
               }

               if (var3.isEmpty()) {
                  if (var4 >= 62) {
                     throw new IllegalStateException();
                  }

                  var3 = null;
               }
            }

            boolean var10000;
            if (var1 > 0L) {
               if (var4 >= 62) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            if (var10000 != var0.useHashes) {
               if (var4 >= 62) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException("");
               }
            } else {
               boolean var10001;
               if (var3 != null) {
                  if (var4 >= 62) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               if (var0.useNames != var10001) {
                  if (var4 >= 62) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException("");
                  }
               } else {
                  label109: {
                     label120: {
                        if (var1 > 0L) {
                           if (var4 >= 62) {
                              throw new IllegalStateException();
                           }

                           if (var0.bannedMemberHashes == null) {
                              break label120;
                           }

                           if (var4 >= 62) {
                              throw new IllegalStateException();
                           }

                           if (var0.bannedMemberCount * -890431577 >= var0.bannedMemberHashes.length) {
                              break label120;
                           }

                           if (var4 >= 62) {
                              throw new IllegalStateException();
                           }
                        }

                        if (var3 == null) {
                           break label109;
                        }

                        if (var4 >= 62) {
                           return;
                        }

                        if (var0.bannedMemberNames != null) {
                           if (var4 >= 62) {
                              throw new IllegalStateException();
                           }

                           if (var0.bannedMemberCount * -890431577 < var0.bannedMemberNames.length) {
                              break label109;
                           }

                           if (var4 >= 62) {
                              throw new IllegalStateException();
                           }
                        }
                     }

                     var0.method4275(5 + var0.bannedMemberCount * -890431577, -131091783);
                  }

                  if (null != var0.bannedMemberHashes) {
                     if (var4 >= 62) {
                        throw new IllegalStateException();
                     }

                     var0.bannedMemberHashes[var0.bannedMemberCount * -890431577] = var1;
                  }

                  if (null != var0.bannedMemberNames) {
                     var0.bannedMemberNames[-890431577 * var0.bannedMemberCount] = var3;
                  }

                  var0.bannedMemberCount += -938336233;
               }
            }
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "gs.ay(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IZI)I")
   @ObfuscatedName("ai")
   int method4320(int var1, boolean var2, int var3) {
      try {
         if (var2 == this.field2085[var1]) {
            if (var3 >= 475869047) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            this.field2085[var1] = var2;
            return var1;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "gs.ai(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIB)Z")
   @ObfuscatedName("ab")
   boolean method4330(int var1, int var2, int var3, int var4, byte var5) {
      try {
         int var6 = (1 << var3) - 1;
         int var10000;
         if (31 == var4) {
            if (var5 == 1) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = (1 << 1 + var4) - 1;
         }

         int var7 = var10000;
         int var8 = var7 ^ var6;
         var2 <<= var3;
         var2 &= var8;
         if (this.parameters != null) {
            if (var5 == 1) {
               throw new IllegalStateException();
            }

            Node var9 = this.parameters.get((long)var1);
            if (var9 != null) {
               if (var5 == 1) {
                  throw new IllegalStateException();
               }

               if (var9 instanceof IntegerNode) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  }

                  IntegerNode var10 = (IntegerNode)var9;
                  if ((var10.integer & var8) == var2) {
                     if (var5 == 1) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  var10.integer &= ~var8;
                  var10.integer |= var2;
                  return true;
               }

               var9.remove();
            }
         } else {
            this.parameters = new IterableNodeHashTable(4);
         }

         this.parameters.put((Node)(new IntegerNode(var2)), (long)var1);
         return true;
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "gs.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IJ)Z")
   @ObfuscatedName("cz")
   boolean method4335(int var1, long var2) {
      if (this.parameters != null) {
         Node var4 = this.parameters.get((long)var1);
         if (var4 != null) {
            if (var4 instanceof classVA) {
               classVA var5 = (classVA)var4;
               if (var5.field6145 == var2) {
                  return false;
               }

               var5.field6145 = var2;
               return true;
            }

            var4.remove();
         }
      } else {
         this.parameters = new IterableNodeHashTable(4);
      }

      this.parameters.put((Node)(new classVA(var2)), (long)var1);
      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgs;)[I")
   @ObfuscatedName("kt")
   public static int[] method4290(ClanSettings var0) {
      if (var0.sortedMembers == null) {
         String[] var1 = new String[-11214333 * var0.memberCount];
         var0.sortedMembers = new int[var0.memberCount * 1184926393];

         for (int var2 = 0; var2 < -1226466017 * var0.memberCount; var0.sortedMembers[var2] = var2++) {
            var1[var2] = var0.memberNames[var2];
            if (null != var1[var2]) {
               var1[var2] = var1[var2].toLowerCase();
            }
         }

         class28.method499(var1, var0.sortedMembers, (byte)7);
      }

      return var0.sortedMembers;
   }

   @ObfuscatedSignature(descriptor = "(IZ)I")
   @ObfuscatedName("cm")
   int method4321(int var1, boolean var2) {
      if (var2 == this.field2085[var1]) {
         return -1;
      } else {
         this.field2085[var1] = var2;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bw")
   void method4298(int var1) {
      if (var1 >= 0 && var1 < this.memberCount * 1184926393) {
         this.memberCount -= -34186359;
         this.sortedMembers = null;
         if (1184926393 * this.memberCount == 0) {
            this.memberHashes = null;
            this.memberNames = null;
            this.memberRanks = null;
            this.field2079 = null;
            this.memberJoinDates = null;
            this.field2085 = null;
            this.currentOwner = 2036828757;
            this.field2058 = 1877626223;
         } else {
            System.arraycopy(this.memberRanks, 1 + var1, this.memberRanks, var1, this.memberCount * 1184926393 - var1);
            System.arraycopy(this.field2079, 1 + var1, this.field2079, var1, 1184926393 * this.memberCount - var1);
            System.arraycopy(this.memberJoinDates, 1 + var1, this.memberJoinDates, var1, this.memberCount * 1184926393 - var1);
            System.arraycopy(this.field2085, var1 + 1, this.field2085, var1, 1184926393 * this.memberCount - var1);
            if (this.memberHashes != null) {
               System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, 1184926393 * this.memberCount - var1);
            }

            if (null != this.memberNames) {
               System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, 1184926393 * this.memberCount - var1);
            }

            this.updateOwner(180148785);
         }
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("ck")
   int method4325(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = -1224041632 == var4 ? -1 : (1 << var4 + 1) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      int var8 = this.field2079[var1];
      if ((var8 & var7) == var2) {
         return -1;
      } else {
         var8 &= ~var7;
         this.field2079[var1] = var8 | var2;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("cs")
   boolean method4327(int var1, int var2) {
      if (null != this.parameters) {
         Node var3 = this.parameters.get((long)var1);
         if (null != var3) {
            if (var3 instanceof IntegerNode) {
               IntegerNode var4 = (IntegerNode)var3;
               if (var4.integer == var2) {
                  return false;
               }

               var4.integer = var2;
               return true;
            }

            var3.remove();
         }
      } else {
         this.parameters = new IterableNodeHashTable(4);
      }

      this.parameters.put((Node)(new IntegerNode(var2)), (long)var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("co")
   boolean method4331(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = -1502147719 == var4 ? -1 : (1 << 1 + var4) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      if (this.parameters != null) {
         Node var8 = this.parameters.get((long)var1);
         if (var8 != null) {
            if (var8 instanceof IntegerNode) {
               IntegerNode var9 = (IntegerNode)var8;
               if ((var9.integer & var7) == var2) {
                  return false;
               }

               var9.integer &= ~var7;
               var9.integer |= var2;
               return true;
            }

            var8.remove();
         }
      } else {
         this.parameters = new IterableNodeHashTable(4);
      }

      this.parameters.put((Node)(new IntegerNode(var2)), (long)var1);
      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgs;IB)I")
   @ObfuscatedName("th")
   public static int method4313(ClanSettings var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method4331(var1, var1, var1, var1);
      }

      if (126 != var2 && var2 != -587460604) {
         if (1746169405 * var0.currentOwner != var1 || var0.field2058 * 1673809521 != -1 && var0.memberRanks[1673809521 * var0.field2058] >= -720418911) {
            if (var0.memberRanks[var1] == var2) {
               return -1;
            } else {
               var0.memberRanks[var1] = var2;
               var0.updateOwner(250256553);
               return var1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("xh")
   public int method4353() {
      return this.memberCount * 1184926393;
   }

   @ObfuscatedSignature(descriptor = "(IJ)Z")
   @ObfuscatedName("cg")
   boolean method4336(int var1, long var2) {
      if (this.parameters != null) {
         Node var4 = this.parameters.get((long)var1);
         if (var4 != null) {
            if (var4 instanceof classVA) {
               classVA var5 = (classVA)var4;
               if (var5.field6145 == var2) {
                  return false;
               }

               var5.field6145 = var2;
               return true;
            }

            var4.remove();
         }
      } else {
         this.parameters = new IterableNodeHashTable(4);
      }

      this.parameters.put((Node)(new classVA(var2)), (long)var1);
      return true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgs;I)V")
   @ObfuscatedName("zb")
   public static void method4299(ClanSettings var0, int var1) {
      if (var0 == null) {
         var0.method4325(var1, var1, var1, var1);
      }

      if (var1 >= 0 && var1 < var0.memberCount * 1184926393) {
         var0.memberCount -= -1372162615;
         var0.sortedMembers = null;
         if (1184926393 * var0.memberCount == 0) {
            var0.memberHashes = null;
            var0.memberNames = null;
            var0.memberRanks = null;
            var0.field2079 = null;
            var0.memberJoinDates = null;
            var0.field2085 = null;
            var0.currentOwner = -1256310362;
            var0.field2058 = -1768006634;
         } else {
            System.arraycopy(var0.memberRanks, 1 + var1, var0.memberRanks, var1, var0.memberCount * 1184926393 - var1);
            System.arraycopy(var0.field2079, 1 + var1, var0.field2079, var1, -1678536391 * var0.memberCount - var1);
            System.arraycopy(var0.memberJoinDates, 1 + var1, var0.memberJoinDates, var1, var0.memberCount * 1184926393 - var1);
            System.arraycopy(var0.field2085, var1 + 1, var0.field2085, var1, -1899482472 * var0.memberCount - var1);
            if (var0.memberHashes != null) {
               System.arraycopy(var0.memberHashes, var1 + 1, var0.memberHashes, var1, -1592745136 * var0.memberCount - var1);
            }

            if (null != var0.memberNames) {
               System.arraycopy(var0.memberNames, var1 + 1, var0.memberNames, var1, 1184926393 * var0.memberCount - var1);
            }

            var0.updateOwner(248847850);
         }
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("am")
   void method4274(int var1) {
      if (this.useHashes) {
         if (null != this.bannedMemberHashes) {
            System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, -890431577 * this.bannedMemberCount);
         } else {
            this.bannedMemberHashes = new long[var1];
         }
      }

      if (this.useNames) {
         if (this.bannedMemberNames != null) {
            System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, -265061401 * this.bannedMemberCount);
         } else {
            this.bannedMemberNames = new String[var1];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgs;I)V")
   @ObfuscatedName("vf")
   public static void method4300(ClanSettings var0, int var1) {
      if (var0 == null) {
         var0.getMembers();
      }

      if (var1 >= 0 && var1 < var0.memberCount * 1184926393) {
         var0.memberCount -= -34186359;
         var0.sortedMembers = null;
         if (1184926393 * var0.memberCount == 0) {
            var0.memberHashes = null;
            var0.memberNames = null;
            var0.memberRanks = null;
            var0.field2079 = null;
            var0.memberJoinDates = null;
            var0.field2085 = null;
            var0.currentOwner = 2036828757;
            var0.field2058 = 1877626223;
         } else {
            System.arraycopy(var0.memberRanks, 1 + var1, var0.memberRanks, var1, var0.memberCount * 1184926393 - var1);
            System.arraycopy(var0.field2079, 1 + var1, var0.field2079, var1, 1184926393 * var0.memberCount - var1);
            System.arraycopy(var0.memberJoinDates, 1 + var1, var0.memberJoinDates, var1, var0.memberCount * 1184926393 - var1);
            System.arraycopy(var0.field2085, var1 + 1, var0.field2085, var1, 1184926393 * var0.memberCount - var1);
            if (var0.memberHashes != null) {
               System.arraycopy(var0.memberHashes, var1 + 1, var0.memberHashes, var1, 1184926393 * var0.memberCount - var1);
            }

            if (null != var0.memberNames) {
               System.arraycopy(var0.memberNames, var1 + 1, var0.memberNames, var1, 1184926393 * var0.memberCount - var1);
            }

            var0.updateOwner(-480736337);
         }
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Z")
   @ObfuscatedName("cy")
   boolean method4341(int var1, String var2) {
      if (null == var2) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (this.parameters != null) {
         Node var3 = this.parameters.get((long)var1);
         if (null != var3) {
            if (var3 instanceof ObjectNode) {
               ObjectNode var4 = (ObjectNode)var3;
               if (var4.obj instanceof String) {
                  if (var2.equals(var4.obj)) {
                     return false;
                  }

                  var4.remove();
                  this.parameters.put((Node)(new ObjectNode(var2)), var4.key);
                  return true;
               }
            }

            var3.remove();
         }
      } else {
         this.parameters = new IterableNodeHashTable(4);
      }

      this.parameters.put((Node)(new ObjectNode(var2)), (long)var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("an")
   public int method4283(int var1, int var2, int var3, int var4) {
      try {
         int var10000;
         if (var3 == 31) {
            if (var4 <= -710882247) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = (1 << 1 + var3) - 1;
         }

         int var5 = var10000;
         return (this.field2079[var1] & var5) >>> var2;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "gs.an(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgs;I)Z")
   @ObfuscatedName("uc")
   public static boolean method4317(ClanSettings var0, int var1) {
      if (var1 != var0.currentOwner * 1172757763 && var0.memberRanks[var1] != 126) {
         var0.memberRanks[var0.currentOwner * 1172757763] = 125;
         var0.field2058 = var0.currentOwner * -290569037;
         var0.memberRanks[var1] = 126;
         var0.currentOwner = -2036828757 * var1;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("ve")
   public int[] method4354() {
      return this.getSortedMembers((byte)59);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("at")
   void method4275(int var1, int var2) {
      try {
         if (this.useHashes) {
            if (var2 <= -1773578279) {
               return;
            }

            if (null != this.bannedMemberHashes) {
               if (var2 <= -1773578279) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, -890431577 * this.bannedMemberCount);
            } else {
               this.bannedMemberHashes = new long[var1];
            }
         }

         if (this.useNames) {
            if (var2 <= -1773578279) {
               throw new IllegalStateException();
            }

            if (this.bannedMemberNames != null) {
               if (var2 <= -1773578279) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, -890431577 * this.bannedMemberCount);
            } else {
               this.bannedMemberNames = new String[var1];
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gs.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("na")
   public int method4348(int var1, int var2, int var3) {
      Integer var4 = this.method4351(var1);
      int var5 = var4 == null ? -1 : var4;
      int var6 = 31 - var3;
      return var5 << var6 >>> var2 + var6;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgs;II)Z")
   @ObfuscatedName("ld")
   public static boolean method4328(ClanSettings var0, int var1, int var2) {
      if (null != var0.parameters) {
         Node var3 = var0.parameters.get((long)var1);
         if (null != var3) {
            if (var3 instanceof IntegerNode) {
               IntegerNode var4 = (IntegerNode)var3;
               if (var4.integer == var2) {
                  return false;
               }

               var4.integer = var2;
               return true;
            }

            var3.remove();
         }
      } else {
         var0.parameters = new IterableNodeHashTable(4);
      }

      var0.parameters.put((Node)(new IntegerNode(var2)), (long)var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(IZ)I")
   @ObfuscatedName("cu")
   int method4322(int var1, boolean var2) {
      if (var2 == this.field2085[var1]) {
         return -1;
      } else {
         this.field2085[var1] = var2;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Z")
   @ObfuscatedName("cf")
   boolean method4342(int var1, String var2) {
      if (null == var2) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (this.parameters != null) {
         Node var3 = this.parameters.get((long)var1);
         if (null != var3) {
            if (var3 instanceof ObjectNode) {
               ObjectNode var4 = (ObjectNode)var3;
               if (var4.obj instanceof String) {
                  if (var2.equals(var4.obj)) {
                     return false;
                  }

                  var4.remove();
                  this.parameters.put((Node)(new ObjectNode(var2)), var4.key);
                  return true;
               }
            }

            var3.remove();
         }
      } else {
         this.parameters = new IterableNodeHashTable(4);
      }

      this.parameters.put((Node)(new ObjectNode(var2)), (long)var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("av")
   void method4272(int var1, byte var2) {
      try {
         if (this.useHashes) {
            if (var2 != 78) {
               return;
            }

            if (null != this.bannedMemberHashes) {
               if (var2 != 78) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.memberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount * 1184926393);
            } else {
               this.bannedMemberHashes = new long[var1];
            }
         }

         if (this.useHashes) {
            if (var2 != 78) {
               throw new IllegalStateException();
            }

            if (this.bannedMemberNames != null) {
               System.arraycopy(this.bannedMemberNames, 0, this.memberNames = new String[var1], 0, this.currentOwner * 1184926393);
            } else {
               this.memberNames = new String[var1];
            }
         }

         if (this.memberRanks != null) {
            if (var2 != 78) {
               return;
            }

            System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, 1184926393 * this.bannedMemberCount);
         } else {
            this.memberRanks = new byte[var1];
         }

         if (this.field2079 != null) {
            if (var2 != 78) {
               throw new IllegalStateException();
            }

            System.arraycopy(this.field2079, 0, this.field2079 = new int[var1], 0, 1184926393 * this.field2058);
         } else {
            this.sortedMembers = new int[var1];
         }

         if (null != this.memberJoinDates) {
            if (var2 != 78) {
               throw new IllegalStateException();
            }

            System.arraycopy(this.memberJoinDates, 0, this.memberJoinDates = new int[var1], 0, this.bannedMemberCount * 1184926393);
         } else {
            this.memberJoinDates = new int[var1];
         }

         if (null != this.field2085) {
            System.arraycopy(this.field2085, 0, this.field2085 = new boolean[var1], 0, this.bannedMemberCount * 1184926393);
         } else {
            this.field2085 = new boolean[var1];
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gs.av(" + ')');
      }
   }

   public List getMembers() {
      int var1 = this.method4353();
      ArrayList var2 = new ArrayList(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         var2.add(new rl0(this, var3));
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("ag")
   public int method4349(String var1, int var2) {
      return this.method4347(var1);
   }

   @ObfuscatedSignature(descriptor = "(JLjava/lang/String;II)V")
   @ObfuscatedName("ak")
   void method4294(long var1, String var3, int var4, int var5) {
      try {
         if (var3 != null) {
            if (var5 == 46658093) {
               throw new IllegalStateException();
            }

            if (var3.isEmpty()) {
               var3 = null;
            }
         }

         boolean var10001;
         if (var1 > 0L) {
            if (var5 == 46658093) {
               return;
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         if (this.useNames != var10001) {
            if (var5 == 46658093) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("");
            }
         } else {
            if (null != var3) {
               if (var5 == 46658093) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            if (this.useHashes != var10001) {
               if (var5 == 46658093) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException("");
               }
            } else {
               label117: {
                  label127: {
                     if (var1 > 0L) {
                        if (var5 == 46658093) {
                           throw new IllegalStateException();
                        }

                        if (this.bannedMemberHashes == null) {
                           break label127;
                        }

                        if (var5 == 46658093) {
                           throw new IllegalStateException();
                        }

                        if (this.field2062 * 1184926393 >= this.bannedMemberHashes.length) {
                           break label127;
                        }

                        if (var5 == 46658093) {
                           return;
                        }
                     }

                     if (var3 == null) {
                        break label117;
                     }

                     if (var5 == 46658093) {
                        throw new IllegalStateException();
                     }

                     if (null != this.memberNames) {
                        if (var5 == 46658093) {
                           return;
                        }

                        if (1184926393 * this.currentOwner < this.bannedMemberNames.length) {
                           break label117;
                        }

                        if (var5 == 46658093) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  method4270(this, 1184926393 * this.bannedMemberCount + 5, (byte)78);
               }

               if (this.bannedMemberHashes != null) {
                  if (var5 == 46658093) {
                     return;
                  }

                  this.memberHashes[this.currentOwner * 1184926393] = var1;
               }

               if (this.memberNames != null) {
                  if (var5 == 46658093) {
                     throw new IllegalStateException();
                  }

                  this.memberNames[this.currentOwner * 1184926393] = var3;
               }

               if (this.memberCount * 1172757763 == -1) {
                  if (var5 == 46658093) {
                     throw new IllegalStateException();
                  }

                  this.currentOwner = this.field2058 * -1065666925;
                  this.memberRanks[1184926393 * this.field2058] = 126;
               } else {
                  this.memberRanks[1184926393 * this.currentOwner] = 0;
               }

               this.sortedMembers[1184926393 * this.field2058] = 0;
               this.memberJoinDates[this.field2062 * 1184926393] = var4;
               this.field2085[1184926393 * this.field2058] = false;
               this.bannedMemberCount = this.memberCount + -34186359;
               this.sortedMembers = null;
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "gs.ak(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgs;IJ)Z")
   @ObfuscatedName("jk")
   public static boolean method4337(ClanSettings var0, int var1, long var2) {
      if (var0.parameters != null) {
         Node var4 = var0.parameters.get((long)var1);
         if (var4 != null) {
            if (var4 instanceof classVA) {
               classVA var5 = (classVA)var4;
               if (var5.field6145 == var2) {
                  return false;
               }

               var5.field6145 = var2;
               return true;
            }

            var4.remove();
         }
      } else {
         var0.parameters = new IterableNodeHashTable(4);
      }

      var0.parameters.put((Node)(new classVA(var2)), (long)var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(IJ)Z")
   @ObfuscatedName("ax")
   boolean method4338(int var1, long var2) {
      if (this.parameters != null) {
         Node var4 = this.parameters.get((long)var1);
         if (var4 != null) {
            if (var4 instanceof classVA) {
               classVA var5 = (classVA)var4;
               if (var5.field6145 == var2) {
                  return false;
               }

               var5.field6145 = var2;
               return true;
            }

            var4.vmethod138();
         }
      } else {
         this.parameters = new IterableNodeHashTable(4);
      }

      this.parameters.put((Node)(new classVA(var2)), (long)var1);
      return true;
   }

   @ObfuscatedSignature(descriptor = "(JLjava/lang/String;B)V")
   @ObfuscatedName("ay")
   void method4306(long var1, String var3, byte var4) {
      try {
         if (var3 != null) {
            if (var4 >= 62) {
               throw new IllegalStateException();
            }

            if (var3.isEmpty()) {
               if (var4 >= 62) {
                  throw new IllegalStateException();
               }

               var3 = null;
            }
         }

         boolean var10000;
         if (var1 > 0L) {
            if (var4 >= 62) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         if (var10000 != this.useNames) {
            if (var4 >= 62) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("");
            }
         } else {
            boolean var10001;
            if (var3 != null) {
               if (var4 >= 62) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            if (this.useHashes != var10001) {
               if (var4 >= 62) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException("");
               }
            } else {
               label106: {
                  label116: {
                     if (var1 > 0L) {
                        if (var4 >= 62) {
                           throw new IllegalStateException();
                        }

                        if (this.bannedMemberHashes == null) {
                           break label116;
                        }

                        if (var4 >= 62) {
                           throw new IllegalStateException();
                        }

                        if (this.field2062 * -890431577 >= this.bannedMemberHashes.length) {
                           break label116;
                        }

                        if (var4 >= 62) {
                           throw new IllegalStateException();
                        }
                     }

                     if (var3 == null) {
                        break label106;
                     }

                     if (var4 >= 62) {
                        return;
                     }

                     if (this.memberNames != null) {
                        if (var4 >= 62) {
                           throw new IllegalStateException();
                        }

                        if (this.field2058 * -890431577 < this.bannedMemberNames.length) {
                           break label106;
                        }

                        if (var4 >= 62) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  this.method4275(5 + this.memberCount * -890431577, -131091783);
               }

               if (null != this.bannedMemberHashes) {
                  if (var4 >= 62) {
                     throw new IllegalStateException();
                  }

                  this.bannedMemberHashes[this.memberCount * -890431577] = var1;
               }

               if (null != this.bannedMemberNames) {
                  this.bannedMemberNames[-890431577 * this.bannedMemberCount] = var3;
               }

               this.currentOwner += -938336233;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "gs.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("bo")
   public int method4281(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         for (int var2 = 0; var2 < -1743042434 * this.currentOwner; var2++) {
            if (this.bannedMemberNames[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }
}
