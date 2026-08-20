import java.net.URL;
import java.util.EnumSet;
import net.runelite.api.WorldType;
import net.runelite.api.events.WorldListLoad;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bn")
public class World implements net.runelite.api.World {
   @ObfuscatedName("as")
   String activity;
   @ObfuscatedName("ad")
   int population;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field274 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field276 = 2;
   @ObfuscatedSignature(descriptor = "[Lbn;")
   @ObfuscatedName("ae")
   static World[] World_worlds;
   @ObfuscatedName("aj")
   static int World_count = 0;
   @ObfuscatedName("ab")
   int index;
   @ObfuscatedName("aw")
   static int[] World_sortOption2 = new int[]{1, 1, 1, 1};
   @ObfuscatedName("ak")
   static int World_listCount = 0;
   @ObfuscatedName("ap")
   static int[] World_sortOption1 = new int[]{0, 1, 2, 3};
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field278 = 3;
   @ObfuscatedName("az")
   int properties;
   @ObfuscatedName("ai")
   String host;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field275 = 0;
   @ObfuscatedName("ac")
   int location;
   @ObfuscatedName("au")
   int id;
   @ObfuscatedName("ax")
   String field283;
   @ObfuscatedSignature(descriptor = "Lxm;")
   @ObfuscatedName("cc")
   static IndexedSprite titlebuttonSprite;
   @ToRemove(unused = "true")
   @ObfuscatedName("ch")
   static final int field280 = 25;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IZIZ)V")
   @ObfuscatedName("bs")
   static void method874(int var0, boolean var1, int var2, boolean var3) {
      if (null != World_worlds) {
         class387.doWorldSorting(0, World_worlds.length - 1, var0, var1, var2, var3, (byte)-52);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ay")
   boolean isMembersOnly(int var1) {
      try {
         boolean var10000;
         if ((class594.field6406.rsOrdinal((byte)77) & this.location * -607869593) != 0) {
            if (var1 >= -163413578) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bn.ay(" + ')');
      }
   }

   public void setActivity(String var1) {
      this.activity = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("az")
   boolean method894(int var1) {
      try {
         boolean var10000;
         if ((class594.field6437.rsOrdinal((byte)34) & -607869593 * this.location) != 0) {
            if (var1 <= -602850645) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bn.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ad")
   boolean isPvp(int var1) {
      try {
         boolean var10000;
         if ((class594.field6429.rsOrdinal((byte)106) & -607869593 * this.location) != 0) {
            if (var1 <= 712959760) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bn.ad(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;)Z")
   @ObfuscatedName("uc")
   public static boolean method901(World var0) {
      return var0 == null ? var0.method909() : (class594.field6435.rsOrdinal((byte)1) & var0.location * -607869593) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ct")
   boolean method890() {
      return (class594.field6422.rsOrdinal((byte)40) & this.location * -607869593) != 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("as")
   boolean method902(int var1) {
      try {
         return (class594.field6435.rsOrdinal((byte)35) & this.location * -607869593) != 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bn.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("xt")
   public void method921(int var1) {
      this.location = var1 * 98412119;
   }

   public String getAddress() {
      return this.host;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ac")
   boolean isBeta(int var1) {
      try {
         boolean var10000;
         if ((class594.field6414.rsOrdinal((byte)112) & this.location * -607869593) != 0) {
            if (var1 <= 231899698) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bn.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ax")
   boolean method912(byte var1) {
      try {
         boolean var10000;
         if ((class594.field6433.rsOrdinal((byte)67) & -607869593 * this.location) != 0) {
            if (var1 == 38) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bn.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lbn;")
   @ObfuscatedName("bi")
   static World method884() {
      World_listCount = 0;
      return class217.getNextWorldListWorld(-1846675440);
   }

   World() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ao")
   static void method868(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for (int var5 = 0; var5 < 4; var5++) {
         if (var0 != World_sortOption1[var5]) {
            var2[var4] = World_sortOption1[var5];
            var3[var4] = World_sortOption2[var5];
            var4++;
         }
      }

      World_sortOption1 = var2;
      World_sortOption2 = var3;
      class154.sortWorlds(World_worlds, 0, World_worlds.length - 1, World_sortOption1, World_sortOption2, (byte)-93);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("al")
   static boolean method864() {
      try {
         if (Huffman.World_request == null) {
            Huffman.World_request = class164.urlRequester.request(new URL(WorldMapEvent.field4009), -726881254);
         } else if (Huffman.World_request.isDone(1741769013)) {
            byte[] var0 = Huffman.World_request.getResponse((byte)66);
            Buffer var1 = new Buffer(var0);
            Buffer.method12015(var1, 1709388600);
            World_count = Buffer.method12008(var1, (byte)5) * 1540931909;
            World_worlds = new World[-858019443 * World_count];

            for (int var2 = 0; var2 < -858019443 * World_count; var2++) {
               World var3 = World_worlds[var2] = new World();
               var3.population = Buffer.method12008(var1, (byte)5) * -1414320829;
               var3.location = Buffer.method12015(var1, 417095920) * 98412119;
               var3.host = var1.readStringCp1252NullCircumfixed(-1354548484);
               var3.activity = var1.readStringCp1252NullCircumfixed(-1670350953);
               var3.index = var1.readUnsignedByte(2060076727) * -1591861077;
               var3.properties = var1.readShort((byte)-32) * -1461722311;
               var3.id = var2 * -238795003;
            }

            class154.sortWorlds(World_worlds, 0, World_worlds.length - 1, World_sortOption1, World_sortOption2, (byte)-57);
            Huffman.World_request = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         Huffman.World_request = null;
      }

      return false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("af")
   static boolean method865() {
      try {
         if (Huffman.World_request == null) {
            Huffman.World_request = class164.urlRequester.request(new URL(WorldMapEvent.field4009), -726881254);
         } else if (Huffman.World_request.isDone(1741769013)) {
            byte[] var0 = Huffman.World_request.getResponse((byte)27);
            Buffer var1 = new Buffer(var0);
            Buffer.method12015(var1, 1966941022);
            World_count = Buffer.method12008(var1, (byte)5) * 1540931909;
            World_worlds = new World[-858019443 * World_count];

            for (int var2 = 0; var2 < -858019443 * World_count; var2++) {
               World var3 = World_worlds[var2] = new World();
               var3.population = Buffer.method12008(var1, (byte)5) * -1414320829;
               var3.location = Buffer.method12015(var1, 761921854) * -314073706;
               var3.host = var1.readStringCp1252NullCircumfixed(1480932090);
               var3.activity = var1.readStringCp1252NullCircumfixed(294540219);
               var3.index = var1.readUnsignedByte(-761505294) * -1591861077;
               var3.properties = var1.readShort((byte)-93) * -92369955;
               var3.id = var2 * -238795003;
            }

            class154.sortWorlds(World_worlds, 0, World_worlds.length - 1, World_sortOption1, World_sortOption2, (byte)-109);
            Huffman.World_request = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         Huffman.World_request = null;
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("yd")
   public void method920(int var1) {
      World[] var2 = SecureUrlRequester.client.method2573();
      if (var2 != null && var2.length > 0 && var2[var2.length - 1] == this) {
         WorldListLoad var3 = new WorldListLoad(var2);
         SecureUrlRequester.client.getCallbacks().post(var3);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("am")
   static boolean method866() {
      try {
         if (Huffman.World_request == null) {
            Huffman.World_request = class164.urlRequester.request(new URL(WorldMapEvent.field4009), -726881254);
         } else if (Huffman.World_request.isDone(1741769013)) {
            byte[] var0 = Huffman.World_request.getResponse((byte)59);
            Buffer var1 = new Buffer(var0);
            Buffer.method12015(var1, 1394324709);
            World_count = Buffer.method12008(var1, (byte)5) * 1540931909;
            World_worlds = new World[-858019443 * World_count];

            for (int var2 = 0; var2 < -858019443 * World_count; var2++) {
               World var3 = World_worlds[var2] = new World();
               var3.population = Buffer.method12008(var1, (byte)5) * -1414320829;
               var3.location = Buffer.method12015(var1, 72590917) * 98412119;
               var3.host = var1.readStringCp1252NullCircumfixed(171251585);
               var3.activity = var1.readStringCp1252NullCircumfixed(1255862062);
               var3.index = var1.readUnsignedByte(-693274848) * -1591861077;
               var3.properties = var1.readShort((byte)-128) * -1461722311;
               var3.id = var2 * -238795003;
            }

            class154.sortWorlds(World_worlds, 0, World_worlds.length - 1, World_sortOption1, World_sortOption2, (byte)-47);
            Huffman.World_request = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         Huffman.World_request = null;
      }

      return false;
   }

   public int getPlayerCount() {
      return this.properties * 2054822665;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;)I")
   @ObfuscatedName("qj")
   public static int method919(WorldMap var0) {
      return var0.field6241 * -1471167996;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Lbn;II[I[I)V")
   @ObfuscatedName("bg")
   static void method872(World[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var5 = var1 - 1;
         int var6 = 1 + var2;
         int var7 = (var2 + var1) / 2;
         World var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while (var5 < var6) {
            boolean var9 = true;

            do {
               var6--;

               for (int var10 = 0; var10 < 4; var10++) {
                  int var11;
                  int var12;
                  if (2 == var3[var10]) {
                     var11 = var0[var6].id * 1293839821;
                     var12 = 1293839821 * var8.id;
                  } else if (1 == var3[var10]) {
                     var11 = 2054822665 * var0[var6].properties;
                     var12 = 2054822665 * var8.properties;
                     if (var11 == -1 && 1 == var4[var10]) {
                        var11 = 2001;
                     }

                     if (var12 == -1 && 1 == var4[var10]) {
                        var12 = 2001;
                     }
                  } else if (3 == var3[var10]) {
                     var11 = var0[var6].isMembersOnly(-1618521077) ? 1 : 0;
                     var12 = var8.isMembersOnly(-902103559) ? 1 : 0;
                  } else {
                     var11 = 789563243 * var0[var6].population;
                     var12 = var8.population * 789563243;
                  }

                  if (var12 != var11) {
                     if ((1 != var4[var10] || var11 <= var12) && (0 != var4[var10] || var11 >= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while (var9);

            var9 = true;

            do {
               var5++;

               for (int var14 = 0; var14 < 4; var14++) {
                  int var16;
                  int var17;
                  if (var3[var14] == 2) {
                     var16 = var0[var5].id * 1293839821;
                     var17 = 1293839821 * var8.id;
                  } else if (var3[var14] == 1) {
                     var16 = 2054822665 * var0[var5].properties;
                     var17 = 2054822665 * var8.properties;
                     if (var16 == -1 && var4[var14] == 1) {
                        var16 = 2001;
                     }

                     if (var17 == -1 && var4[var14] == 1) {
                        var17 = 2001;
                     }
                  } else if (var3[var14] == 3) {
                     var16 = var0[var5].isMembersOnly(-643262914) ? 1 : 0;
                     var17 = var8.isMembersOnly(-1503421994) ? 1 : 0;
                  } else {
                     var16 = var0[var5].population * 789563243;
                     var17 = 789563243 * var8.population;
                  }

                  if (var17 != var16) {
                     if ((var4[var14] != 1 || var16 >= var17) && (var4[var14] != 0 || var16 <= var17)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (3 == var14) {
                     var9 = false;
                  }
               }
            } while (var9);

            if (var5 < var6) {
               World var15 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var15;
            }
         }

         class154.sortWorlds(var0, var1, var6, var3, var4, (byte)-57);
         class154.sortWorlds(var0, 1 + var6, var2, var3, var4, (byte)5);
      }
   }

   public void setAddress(String var1) {
      this.host = var1;
   }

   public int getIndex() {
      return this.id * 1293839821;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aa")
   static void method869(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for (int var5 = 0; var5 < 4; var5++) {
         if (var0 != World_sortOption1[var5]) {
            var2[var4] = World_sortOption1[var5];
            var3[var4] = World_sortOption2[var5];
            var4++;
         }
      }

      World_sortOption1 = var2;
      World_sortOption2 = var3;
      class154.sortWorlds(World_worlds, 0, World_worlds.length - 1, World_sortOption1, World_sortOption2, (byte)9);
   }

   public String getActivity() {
      return this.activity;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aq")
   static void method870(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for (int var5 = 0; var5 < 4; var5++) {
         if (var0 != World_sortOption1[var5]) {
            var2[var4] = World_sortOption1[var5];
            var3[var4] = World_sortOption2[var5];
            var4++;
         }
      }

      World_sortOption1 = var2;
      World_sortOption2 = var3;
      class154.sortWorlds(World_worlds, 0, World_worlds.length - 1, World_sortOption1, World_sortOption2, (byte)-24);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("be")
   static void method871(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for (int var5 = 0; var5 < 4; var5++) {
         if (var0 != World_sortOption1[var5]) {
            var2[var4] = World_sortOption1[var5];
            var3[var4] = World_sortOption2[var5];
            var4++;
         }
      }

      World_sortOption1 = var2;
      World_sortOption2 = var3;
      class154.sortWorlds(World_worlds, 0, World_worlds.length - 1, World_sortOption1, World_sortOption2, (byte)-37);
   }

   public void setTypes(EnumSet var1) {
      this.method921(WorldType.toMask(var1));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Lbn;II[I[I)V")
   @ObfuscatedName("bo")
   static void method873(World[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var5 = var1 - 1;
         int var6 = 1 + var2;
         int var7 = (var2 + var1) / 2;
         World var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while (var5 < var6) {
            boolean var9 = true;

            do {
               var6--;

               for (int var10 = 0; var10 < 4; var10++) {
                  int var11;
                  int var12;
                  if (2 == var3[var10]) {
                     var11 = var0[var6].id * 1293839821;
                     var12 = 1293839821 * var8.id;
                  } else if (1 == var3[var10]) {
                     var11 = 2054822665 * var0[var6].properties;
                     var12 = 2054822665 * var8.properties;
                     if (var11 == -1 && 1 == var4[var10]) {
                        var11 = 2001;
                     }

                     if (var12 == -1 && 1 == var4[var10]) {
                        var12 = 2001;
                     }
                  } else if (3 == var3[var10]) {
                     var11 = var0[var6].isMembersOnly(-748785556) ? 1 : 0;
                     var12 = var8.isMembersOnly(-980107931) ? 1 : 0;
                  } else {
                     var11 = 789563243 * var0[var6].population;
                     var12 = var8.population * 789563243;
                  }

                  if (var12 != var11) {
                     if ((1 != var4[var10] || var11 <= var12) && (0 != var4[var10] || var11 >= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while (var9);

            var9 = true;

            do {
               var5++;

               for (int var14 = 0; var14 < 4; var14++) {
                  int var16;
                  int var17;
                  if (var3[var14] == 2) {
                     var16 = var0[var5].id * 1293839821;
                     var17 = 1293839821 * var8.id;
                  } else if (var3[var14] == 1) {
                     var16 = 2054822665 * var0[var5].properties;
                     var17 = 2054822665 * var8.properties;
                     if (var16 == -1 && var4[var14] == 1) {
                        var16 = 2001;
                     }

                     if (var17 == -1 && var4[var14] == 1) {
                        var17 = 2001;
                     }
                  } else if (var3[var14] == 3) {
                     var16 = var0[var5].isMembersOnly(-401597124) ? 1 : 0;
                     var17 = var8.isMembersOnly(-498471282) ? 1 : 0;
                  } else {
                     var16 = var0[var5].population * 789563243;
                     var17 = 789563243 * var8.population;
                  }

                  if (var17 != var16) {
                     if ((var4[var14] != 1 || var16 >= var17) && (var4[var14] != 0 || var16 <= var17)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (3 == var14) {
                     var9 = false;
                  }
               }
            } while (var9);

            if (var5 < var6) {
               World var15 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var15;
            }
         }

         class154.sortWorlds(var0, var1, var6, var3, var4, (byte)-123);
         class154.sortWorlds(var0, 1 + var6, var2, var3, var4, (byte)-71);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bn")
   boolean method895() {
      return (class594.field6437.rsOrdinal((byte)66) & -607869593 * this.location) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ce")
   boolean method888() {
      return (class594.field6406.rsOrdinal((byte)112) & this.location * -607869593) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIZIZ)V")
   @ObfuscatedName("bz")
   static void method875(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var6 = (var0 + var1) / 2;
         int var7 = var0;
         World var8 = World_worlds[var6];
         World_worlds[var6] = World_worlds[var1];
         World_worlds[var1] = var8;

         for (int var9 = var0; var9 < var1; var9++) {
            if (MouseHandler.method971(World_worlds[var9], var8, var2, var3, var4, var5, 93619784) <= 0) {
               World var10 = World_worlds[var9];
               World_worlds[var9] = World_worlds[var7];
               World_worlds[var7++] = var10;
            }
         }

         World_worlds[var1] = World_worlds[var7];
         World_worlds[var7] = var8;
         class387.doWorldSorting(var0, var7 - 1, var2, var3, var4, var5, (byte)-115);
         class387.doWorldSorting(1 + var7, var1, var2, var3, var4, var5, (byte)-71);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;Lbn;IZIZ)I")
   @ObfuscatedName("bb")
   static int method877(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
      int var6 = class107.compareWorlds(var0, var1, var2, var3, 1887103891);
      if (var6 != 0) {
         return var3 ? -var6 : var6;
      } else if (var4 == -1) {
         return 0;
      } else {
         int var7 = class107.compareWorlds(var0, var1, var4, var5, 1291793648);
         return var5 ? -var7 : var7;
      }
   }

   public int getId() {
      return this.population * 789563243;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;Lbn;IZIZ)I")
   @ObfuscatedName("bj")
   static int method878(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
      int var6 = class107.compareWorlds(var0, var1, var2, var3, 1060528739);
      if (var6 != 0) {
         return var3 ? -var6 : var6;
      } else if (var4 == -1) {
         return 0;
      } else {
         int var7 = class107.compareWorlds(var0, var1, var4, var5, 1992864716);
         return var5 ? -var7 : var7;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cg")
   boolean method913() {
      return (class594.field6433.rsOrdinal((byte)1) & -607869593 * this.location) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;Lbn;IZ)I")
   @ObfuscatedName("bp")
   static int method879(World var0, World var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = var0.properties * 2054822665;
         int var5 = -240289611 * var1.properties;
         if (!var3) {
            if (-1 == var4) {
               var4 = -1460200936;
            }

            if (-1 == var5) {
               var5 = -1201951873;
            }
         }

         return var4 - var5;
      } else if (2 == var2) {
         return var0.index * 231070801 - -428025341 * var1.index;
      } else if (var2 == 3) {
         if (var0.activity.equals("-")) {
            if (var1.activity.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.activity.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.activity.compareTo(var1.activity);
         }
      } else if (4 == var2) {
         return var0.method899(1954196520) ? (var1.method899(1902206319) ? 0 : 1) : (var1.method899(1748015094) ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method894(-322668778) ? (var1.method894(190013078) ? 0 : 1) : (var1.method894(91308587) ? -1 : 0);
      } else if (var2 == 6) {
         return var0.isPvp(1441314328) ? (var1.isPvp(1837084925) ? 0 : 1) : (var1.isPvp(788382776) ? -1 : 0);
      } else if (7 == var2) {
         return var0.isMembersOnly(-416785163) ? (var1.isMembersOnly(-613674854) ? 0 : 1) : (var1.isMembersOnly(-808383912) ? -1 : 0);
      } else {
         return -585758208 * var0.population - 789563243 * var1.population;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;Lbn;IZ)I")
   @ObfuscatedName("bt")
   static int method880(World var0, World var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = var0.properties * 2054822665;
         int var5 = 2054822665 * var1.properties;
         if (!var3) {
            if (-1 == var4) {
               var4 = 2001;
            }

            if (-1 == var5) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else if (2 == var2) {
         return var0.index * -428025341 - -428025341 * var1.index;
      } else if (var2 == 3) {
         if (var0.activity.equals("-")) {
            if (var1.activity.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.activity.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.activity.compareTo(var1.activity);
         }
      } else if (4 == var2) {
         return var0.method899(1880188790) ? (var1.method899(1749026746) ? 0 : 1) : (var1.method899(1849067157) ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method894(1894061827) ? (var1.method894(1665052648) ? 0 : 1) : (var1.method894(1763562479) ? -1 : 0);
      } else if (var2 == 6) {
         return var0.isPvp(2043279665) ? (var1.isPvp(852793706) ? 0 : 1) : (var1.isPvp(1917887343) ? -1 : 0);
      } else if (7 == var2) {
         return var0.isMembersOnly(-2009327419) ? (var1.isMembersOnly(-693572893) ? 0 : 1) : (var1.isMembersOnly(-880777607) ? -1 : 0);
      } else {
         return 789563243 * var0.population - 789563243 * var1.population;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;Lbn;IZ)I")
   @ObfuscatedName("bu")
   static int method881(World var0, World var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = var0.properties * 137299184;
         int var5 = 1864883931 * var1.properties;
         if (!var3) {
            if (-1 == var4) {
               var4 = -1988195853;
            }

            if (-1 == var5) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else if (2 == var2) {
         return var0.index * -428025341 - -428025341 * var1.index;
      } else if (var2 == 3) {
         if (var0.activity.equals("-")) {
            if (var1.activity.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.activity.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.activity.compareTo(var1.activity);
         }
      } else if (4 == var2) {
         return var0.method899(1989022528) ? (var1.method899(1847627917) ? 0 : 1) : (var1.method899(2045820879) ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method894(-159519328) ? (var1.method894(156635139) ? 0 : 1) : (var1.method894(-230126541) ? -1 : 0);
      } else if (var2 == 6) {
         return var0.isPvp(1845229566) ? (var1.isPvp(1838099455) ? 0 : 1) : (var1.isPvp(814824846) ? -1 : 0);
      } else if (7 == var2) {
         return var0.isMembersOnly(-1689849246) ? (var1.isMembersOnly(-857949392) ? 0 : 1) : (var1.isMembersOnly(-1228889638) ? -1 : 0);
      } else {
         return 789563243 * var0.population - 910114132 * var1.population;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kr")
   public int method922() {
      return this.location * -607869593;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Leh;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("dq")
   public static int method863(UserComparator7 var0, Object var1, Object var2) {
      return var0 == null ? var0.method3729(var1, var1) : var0.compareBuddy((Buddy)var1, (Buddy)var2, (byte)-5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;Lbn;IZ)I")
   @ObfuscatedName("ba")
   static int method882(World var0, World var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = var0.properties * 2054822665;
         int var5 = -1514635999 * var1.properties;
         if (!var3) {
            if (-1 == var4) {
               var4 = 2001;
            }

            if (-1 == var5) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else if (2 == var2) {
         return var0.index * 1748518516 - -977240895 * var1.index;
      } else if (var2 == 3) {
         if (var0.activity.equals("-")) {
            if (var1.activity.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.activity.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.activity.compareTo(var1.activity);
         }
      } else if (4 == var2) {
         return var0.method899(1827447405) ? (var1.method899(1999127251) ? 0 : 1) : (var1.method899(1916236334) ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method894(421977204) ? (var1.method894(-600359140) ? 0 : 1) : (var1.method894(1004676450) ? -1 : 0);
      } else if (var2 == 6) {
         return var0.isPvp(1304278173) ? (var1.isPvp(942313396) ? 0 : 1) : (var1.isPvp(910152494) ? -1 : 0);
      } else if (7 == var2) {
         return var0.isMembersOnly(-2016139359) ? (var1.isMembersOnly(-1911105834) ? 0 : 1) : (var1.isMembersOnly(-697409421) ? -1 : 0);
      } else {
         return 789563243 * var0.population - -170252088 * var1.population;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ai")
   boolean method899(int var1) {
      try {
         boolean var10000;
         if ((class594.field6428.rsOrdinal((byte)104) & -607869593 * this.location) != 0) {
            if (var1 <= 1741769013) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bn.ai(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lbn;")
   @ObfuscatedName("by")
   static World method885() {
      return World_listCount * 2144460140 < World_count * 1148108109 ? World_worlds[(World_listCount += -615407417) * 330506487 - 1] : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lbn;")
   @ObfuscatedName("bw")
   static World method886() {
      return World_listCount * -1280122107 < World_count * -858019443 ? World_worlds[(World_listCount += -615407417) * 519747054 - 1] : null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("br")
   boolean method889() {
      return (class594.field6406.rsOrdinal((byte)99) & this.location * -743499759) != 0;
   }

   @ObfuscatedSignature(descriptor = "(Lbn;I)Z")
   @ObfuscatedName("kj")
   public static boolean method891(World var0, int var1) {
      if (var0 == null) {
         return var0.isDeadman(var1);
      } else {
         try {
            boolean var10000;
            if ((class594.field6422.rsOrdinal((byte)29) & var0.location * -607869593) != 0) {
               if (var1 >= -1222244686) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "bn.au(" + ')');
         }
      }
   }

   public EnumSet getTypes() {
      return WorldType.fromMask(this.method922());
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cd")
   boolean method907() {
      return (class594.field6414.rsOrdinal((byte)43) & this.location * -607869593) != 0;
   }

   public void setPlayerCount(int var1) {
      this.properties = var1 * -1461722311;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ch")
   boolean method892() {
      return (class594.field6422.rsOrdinal((byte)115) & this.location * -607869593) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cu")
   boolean method903() {
      return (class594.field6435.rsOrdinal((byte)80) & this.location * -607869593) != 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   boolean method910(int var1) {
      try {
         boolean var10000;
         if ((class594.field6409.rsOrdinal((byte)124) & -607869593 * this.location) != 0) {
            if (var1 <= 1923703669) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bn.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bf")
   boolean method897() {
      return (class594.field6429.rsOrdinal((byte)88) & -607869593 * this.location) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("co")
   boolean method900() {
      return (class594.field6428.rsOrdinal((byte)73) & -1384582736 * this.location) != 0;
   }

   public void setLocation(int var1) {
      this.index = var1 * -1591861077;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bh")
   boolean method904() {
      return (class594.field6435.rsOrdinal((byte)7) & this.location * -607869593) != 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ar")
   boolean method916(int var1) {
      try {
         boolean var10000;
         if ((class594.field6436.rsOrdinal((byte)29) & -607869593 * this.location) != 0) {
            if (var1 <= 1005353755) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bn.ar(" + ')');
      }
   }

   public void setId(int var1) {
      this.population = var1 * -1414320829;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bq")
   boolean method905() {
      return (class594.field6435.rsOrdinal((byte)113) & this.location * -607869593) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIZIZ)V")
   @ObfuscatedName("bk")
   static void method876(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var6 = (var0 + var1) / 2;
         int var7 = var0;
         World var8 = World_worlds[var6];
         World_worlds[var6] = World_worlds[var1];
         World_worlds[var1] = var8;

         for (int var9 = var0; var9 < var1; var9++) {
            if (MouseHandler.method971(World_worlds[var9], var8, var2, var3, var4, var5, 93619784) <= 0) {
               World var10 = World_worlds[var9];
               World_worlds[var9] = World_worlds[var7];
               World_worlds[var7++] = var10;
            }
         }

         World_worlds[var1] = World_worlds[var7];
         World_worlds[var7] = var8;
         class387.doWorldSorting(var0, var7 - 1, var2, var3, var4, var5, (byte)-36);
         class387.doWorldSorting(1 + var7, var1, var2, var3, var4, var5, (byte)7);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cx")
   boolean method908() {
      return (class594.field6414.rsOrdinal((byte)28) & this.location * -607869593) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ah")
   static boolean method867() {
      try {
         if (Huffman.World_request == null) {
            Huffman.World_request = class164.urlRequester.request(new URL(WorldMapEvent.field4009), -726881254);
         } else if (Huffman.World_request.isDone(1741769013)) {
            byte[] var0 = Huffman.World_request.getResponse((byte)59);
            Buffer var1 = new Buffer(var0);
            Buffer.method12015(var1, -569637910);
            World_count = Buffer.method12008(var1, (byte)5) * 1540931909;
            World_worlds = new World[-858019443 * World_count];

            for (int var2 = 0; var2 < -858019443 * World_count; var2++) {
               World var3 = World_worlds[var2] = new World();
               var3.population = Buffer.method12008(var1, (byte)5) * -1414320829;
               var3.location = Buffer.method12015(var1, -188899419) * 98412119;
               var3.host = var1.readStringCp1252NullCircumfixed(930259035);
               var3.activity = var1.readStringCp1252NullCircumfixed(1747883218);
               var3.index = var1.readUnsignedByte(440918555) * -1591861077;
               var3.properties = var1.readShort((byte)-87) * -1461722311;
               var3.id = var2 * -238795003;
            }

            class154.sortWorlds(World_worlds, 0, World_worlds.length - 1, World_sortOption1, World_sortOption2, (byte)-1);
            Huffman.World_request = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         Huffman.World_request = null;
      }

      return false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;)Z")
   @ObfuscatedName("gt")
   public static boolean method917(World var0) {
      if (var0 == null) {
         var0.method922();
      }

      return (class594.field6436.rsOrdinal((byte)24) & -607869593 * var0.location) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bd")
   boolean method911() {
      return (class594.field6409.rsOrdinal((byte)90) & -607869593 * this.location) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;Lbn;IZ)I")
   @ObfuscatedName("bm")
   static int method883(World var0, World var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = var0.properties * -1302787320;
         int var5 = 2054822665 * var1.properties;
         if (!var3) {
            if (-1 == var4) {
               var4 = 2001;
            }

            if (-1 == var5) {
               var5 = -1928931737;
            }
         }

         return var4 - var5;
      } else if (2 == var2) {
         return var0.index * -428025341 - -428025341 * var1.index;
      } else if (var2 == 3) {
         if (var0.activity.equals("-")) {
            if (var1.activity.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.activity.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.activity.compareTo(var1.activity);
         }
      } else if (4 == var2) {
         return var0.method899(1959030619) ? (var1.method899(1759522577) ? 0 : 1) : (var1.method899(2108390476) ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method894(1362602819) ? (var1.method894(-436388758) ? 0 : 1) : (var1.method894(2050123232) ? -1 : 0);
      } else if (var2 == 6) {
         return var0.isPvp(1856581716) ? (var1.isPvp(1537820489) ? 0 : 1) : (var1.isPvp(889164734) ? -1 : 0);
      } else if (7 == var2) {
         return var0.isMembersOnly(-1386238421) ? (var1.isMembersOnly(-1055686337) ? 0 : 1) : (var1.isMembersOnly(-727103325) ? -1 : 0);
      } else {
         return 948441157 * var0.population - -1824215517 * var1.population;
      }
   }

   public int getLocation() {
      return this.index * -428025341;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bl")
   boolean method914() {
      return (class594.field6433.rsOrdinal((byte)63) & -607869593 * this.location) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cn")
   boolean method915() {
      return (class594.field6433.rsOrdinal((byte)84) & -607869593 * this.location) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cb")
   boolean method918() {
      return (class594.field6436.rsOrdinal((byte)5) & -2041143718 * this.location) != 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("au")
   boolean isDeadman(int var1) {
      try {
         boolean var10000;
         if ((class594.field6428.rsOrdinal((byte)29) & this.population * -607869593) != 0) {
            if (var1 >= -1222244686) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bn.au(" + ')');
      }
   }

   public void setIndex(int var1) {
      this.id = var1 * -238795003;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cm")
   boolean method909() {
      return (class594.field6422.rsOrdinal((byte)62) & this.index * 1711259724) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bv")
   boolean method898() {
      return (class594.field6428.rsOrdinal((byte)93) & -607869593 * this.index) != 0;
   }
}
