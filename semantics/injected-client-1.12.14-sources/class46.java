import java.util.ArrayList;
import java.util.Arrays;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bh")
public class class46 {
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   static final int field179 = 35;
   @ObfuscatedName("at")
   int field169;
   @ObfuscatedSignature(descriptor = "Loj;")
   @ObfuscatedName("ag")
   Coord coord;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   static final int field178 = 14;
   @ObfuscatedSignature(descriptor = "Llz;")
   @ObfuscatedName("ae")
   MoveSpeed pathTraversed;
   @ObfuscatedName("au")
   int targetIndex;
   @ObfuscatedName("ak")
   String[] actions;
   @ObfuscatedName("aw")
   int field168;
   @ObfuscatedName("ap")
   int orientation;
   @ObfuscatedName("ay")
   int field171;
   @ObfuscatedSignature(descriptor = "Lci;")
   @ObfuscatedName("bh")
   public static Player field181;
   @ObfuscatedName("an")
   byte field176;
   @ObfuscatedName("av")
   final ArrayList field175 = new ArrayList(1);
   @ObfuscatedName("lz")
   static int currentPort;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field177 = 150;
   @ObfuscatedSignature(descriptor = "Lxa;")
   @ObfuscatedName("aj")
   Buffer field183;

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("av")
   void method534(byte var1) {
      this.method619();

      try {
         this.field183 = null;
         this.field175.clear();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bh.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("at")
   void method537(int var1, int var2) {
      try {
         this.field169 = 1728637963 * var1;
         this.orientation = 0;
         this.field171 = 573777967;
         this.targetIndex = 148377471;
         this.field176 = 0;
         this.pathTraversed = MoveSpeed.field3806;
         this.field183 = null;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bh.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bo")
   void method538(int var1) {
      this.field169 = -1462636799 * var1;
      this.orientation = 0;
      this.field171 = 573777967;
      this.targetIndex = -652769215;
      this.field176 = 0;
      this.pathTraversed = MoveSpeed.field3806;
      this.field183 = null;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ae")
   void method545(byte var1) {
      try {
         this.field175.clear();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bh.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("dy")
   void method615(int var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < this.field175.size(); var5++) {
         ((Actor)this.field175.get(var5)).updateSpotAnimation(var1, var2, var3, var4, -1767732690);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ak")
   boolean method551(int var1) {
      try {
         return -1 == 596721571 * this.field169;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bh.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aw")
   void method554(byte var1) {
      try {
         this.field169 = this.coord.method8316(-1054433747) * 1728637963;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bh.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ap")
   void method559(int var1, int var2, int var3) {
      try {
         Coord.method8321(this.coord, this.field169 * 596721571, var1, var2, (byte)49);
         this.field169 = -1728637963;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bh.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbh;II)V")
   @ObfuscatedName("lk")
   public static void method595(class46 var0, int var1, int var2) {
      if (var0 == null) {
         var0.method564(var1, var1);
      } else {
         try {
            var0.field171 = var1 * -573777967;

            for (int var3 = 0; var3 < var0.field175.size(); var3++) {
               Player var4 = (Player)var0.field175.get(var3);
               var4.field1123 = 698821791 * var0.field171;
               if (var4.pathLength * -1921456255 == 0) {
                  if (var2 != -816455450) {
                     throw new IllegalStateException();
                  }

                  var4.orientation = var0.field171 * 1654452731;
                  var4.method2804(-172768829);
               }
            }
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "bh.ah(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ay")
   int method565(int var1) {
      try {
         return 370217423 * this.coord.plane;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bh.ay(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbh;IIBBBB)V")
   @ObfuscatedName("ur")
   public static void method611(class46 var0, int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
      if (var0 == null) {
         var0.method591(var1, var1);
      } else {
         for (int var7 = 0; var7 < var0.field175.size(); var7++) {
            Player var8 = (Player)var0.field175.get(var7);
            var8.npcCycle = var1 * 657376133;
            var8.field1125 = var2 * -1176899161;
            GrandExchangeOfferWorldComparator.method8848(var8.field1136, var3, var4, var5, var6);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("au")
   void method566(int var1, int var2) {
      try {
         this.coord.plane = var1 * 969692463;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bh.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lci;)V")
   @ObfuscatedName("he")
   public void method620(Player var1) {
      if (var1.getId() == client.localPlayerIndex * -1548864151) {
         field181 = var1;
      }

      SecureUrlRequester.client.getCallbacks().postDeferred(new PlayerSpawned(var1));
   }

   @ObfuscatedSignature(descriptor = "(Lci;I)V")
   @ObfuscatedName("an")
   void method542(Player var1, int var2) {
      this.method621(var1);

      try {
         this.field175.remove(var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bh.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ad")
   void method571(Buffer var1, int var2) {
      try {
         this.field183 = var1;

         for (int var3 = 0; var3 < this.field175.size(); var3++) {
            if (var2 <= 271966426) {
               return;
            }

            ((Player)this.field175.get(var3)).read(this.field183, (byte)18);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bh.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("ai")
   void method575(int var1, int var2, byte var3) {
      try {
         for (int var4 = 0; var4 < this.field175.size(); var4++) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            CameraViewMode.performPlayerAnimation((Player)this.field175.get(var4), var1, var2, -40656488);
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "bh.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("ac")
   void method582(String var1, byte var2) {
      try {
         boolean var10000;
         if (var1.charAt(0) == '~') {
            if (var2 != 1) {
               return;
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var3 = var10000;
         if (var3) {
            if (var2 != 1) {
               return;
            }

            var1 = var1.substring(1);
         }

         Username var4 = null;

         for (int var5 = 0; var5 < this.field175.size(); var5++) {
            Player var6 = (Player)this.field175.get(var5);
            var6.field1186 = false;
            var6.field1161 = 0;
            var6.field1147 = 0;
            var6.overheadTextCyclesRemaining = -2058916106;
            var6.overheadText = var1;
            var6.method2825(-1);
            var4 = var6.username;
         }

         if (var4 != null) {
            if (!var3) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }

               if (-586128735 * this.field168 != client.localPlayerIndex * -1548864151) {
                  return;
               }

               if (var2 != 1) {
                  return;
               }
            }

            class356.addGameMessage(2, Username.method12702(var4, (byte)23), var1, 1082880661);
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "bh.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILdd;)Lci;")
   @ObfuscatedName("bp")
   Player method548(int var1, WorldView var2) {
      Player var3 = new Player(var1);
      if (null != this.field183) {
         var3.read(this.field183, (byte)86);
      }

      var3.orientation = 230851947 * this.orientation;
      var3.targetIndex = this.targetIndex * 556217703;
      var3.pathTraversed[0] = this.pathTraversed;
      var3.plane = this.coord.plane * 1883102579;
      var3.worldViewId = var2.id * 921498739;
      var3.actions = this.actions;
      var3.method2767(this.coord.x * -1931160809 - var2.baseX * 825809917, this.coord.y * -263036313 - 1279964673 * var2.baseY, -788706767);
      return var3;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ar")
   void method591(int var1, int var2) {
      try {
         for (int var3 = 0; var3 < this.field175.size(); var3++) {
            if (var2 == -650102551) {
               throw new IllegalStateException();
            }

            ((Actor)this.field175.get(var3)).removeHealthBar(var1, 327716789);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bh.ar(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbh;ILpq;ZLjava/lang/String;[B)V")
   @ObfuscatedName("pd")
   public static void method597(class46 var0, int var1, PlayerType var2, boolean var3, String var4, byte[] var5) {
      if (var0 == null) {
         var0.method566(var1, var1);
      } else {
         boolean var6 = false;
         String var7 = null;

         for (int var8 = 0; var8 < var0.field175.size(); var8++) {
            Player var9 = (Player)var0.field175.get(var8);
            if (var9.username != null && null != var9.appearance) {
               boolean var10 = false;
               if (var2.isUser && FriendSystem.method443(class320.friendSystem, var9.username, (byte)57)) {
                  var10 = true;
               }

               if (!var10 && 0 == client.field668 * -1318209885 && !var9.isHidden) {
                  var6 = true;
                  var7 = Username.method12702(var9.username, (byte)19);
                  var9.overheadText = var4.trim();
                  var9.field1161 = (var1 >> 8) * -1206846863;
                  var9.field1147 = -2125652501 * (var1 & 0xFF);
                  var9.overheadTextCyclesRemaining = -655039455;
                  byte[] var13 = var5;
                  int[] var12;
                  if (var5 != null && var5.length != 0 && var5.length <= 8) {
                     int[] var14 = new int[var5.length];
                     int var15 = 0;

                     while (true) {
                        if (var15 >= var13.length) {
                           var12 = var14;
                           break;
                        }

                        if (var13[var15] < 0 || var13[var15] >= class623.field6575.length) {
                           var12 = null;
                           break;
                        }

                        var14[var15] = class623.field6575[var13[var15]];
                        var15++;
                     }
                  } else {
                     var12 = null;
                  }

                  var9.field1148 = var12;
                  var9.field1186 = var3;
                  var9.field1144 = var9 != class330.localPlayer
                     && var2.isUser
                     && !client.field766.isEmpty()
                     && var4.toLowerCase().indexOf(client.field766) == -1;
               }
            }
         }

         if (var6 && null != var7) {
            int var16;
            if (var2.isPrivileged) {
               var16 = var3 ? 279328492 : 1;
            } else {
               var16 = var3 ? -1685478420 : 2;
            }

            if (-1 != var2.modIcon * -1046167364) {
               class356.addGameMessage(var16, SoundSystem.method3115(-113743747 * var2.modIcon, 2127187032) + var7, var4, 206778156);
            } else {
               class356.addGameMessage(var16, var7, var4, -1621296276);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("cw")
   void method604(String[] var1) {
      this.actions = Arrays.copyOf(var1, var1.length);

      for (int var2 = 0; var2 < this.field175.size(); var2++) {
         ((Player)this.field175.get(var2)).actions = Arrays.copyOf(var1, var1.length);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIBBBBI)V")
   @ObfuscatedName("ao")
   void method612(int var1, int var2, byte var3, byte var4, byte var5, byte var6, int var7) {
      try {
         for (int var8 = 0; var8 < this.field175.size(); var8++) {
            if (var7 >= 2108391709) {
               throw new IllegalStateException();
            }

            Player var9 = (Player)this.field175.get(var8);
            var9.npcCycle = var1 * 657376133;
            var9.field1125 = var2 * -244368321;
            GrandExchangeOfferWorldComparator.method8848(var9.field1136, var3, var4, var5, var6);
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "bh.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIB)V")
   @ObfuscatedName("aa")
   void method616(int var1, int var2, int var3, int var4, byte var5) {
      try {
         for (int var6 = 0; var6 < this.field175.size(); var6++) {
            if (var5 >= 10) {
               throw new IllegalStateException();
            }

            ((Actor)this.field175.get(var6)).updateSpotAnimation(var1, var2, var3, var4, -987112429);
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "bh.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   void method535() {
      this.field183 = null;
      this.field175.clear();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   void method536() {
      this.field183 = null;
      this.field175.clear();
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("af")
   void method600(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         for (int var9 = 0; var9 < this.field175.size(); var9++) {
            if (var8 != -1543563048) {
               throw new IllegalStateException();
            }

            Player var10 = (Player)this.field175.get(var9);
            WorldView var11 = var10.getWorldView((byte)-20);
            int var12 = -1931160809 * this.coord.x - 825809917 * var11.baseX;
            int var13 = -263036313 * this.coord.y - var11.baseY * 1279964673;
            var10.field1181 = -1816676295 * (var12 + var1);
            var10.field1178 = (var2 + var13) * 1687056953;
            var10.field1180 = (var3 + var12) * 637283297;
            var10.field1182 = (var4 + var13) * -449848409;
            var10.spotAnimation = -779189801 * var5;
            var10.field1176 = 1487731929 * var6;
            var10.field1179 = var7 * 182140069;
            var10.field1164 = 0;
            var10.resetPath(-259434463 * var10.field1180, -276095977 * var10.field1182, 327716789);
            var10.plane = 1883102579 * this.coord.plane;
         }
      } catch (RuntimeException var14) {
         throw RestClientThreadFactory.newRunException(var14, "bh.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbh;IIIIII)V")
   @ObfuscatedName("cp")
   public static void method586(class46 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method590(var1, var1, var1, var1, var1, var1);
      }

      try {
         for (int var7 = 0; var7 < var0.field175.size(); var7++) {
            ((Actor)var0.field175.get(var7)).addHealthBar(var1, 1759706017 * client.cycle, var2, var3, var4, var5, (byte)34);
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "bh.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bg")
   void method539(int var1) {
      this.field169 = 1728637963 * var1;
      this.orientation = 0;
      this.field171 = 573777967;
      this.targetIndex = 148377471;
      this.field176 = 0;
      this.pathTraversed = MoveSpeed.field3806;
      this.field183 = null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cz")
   void method596(int var1) {
      this.field171 = var1 * -573777967;

      for (int var2 = 0; var2 < this.field175.size(); var2++) {
         Player var3 = (Player)this.field175.get(var2);
         var3.field1123 = 698821791 * this.field171;
         if (var3.pathLength * -1921456255 == 0) {
            var3.orientation = this.field171 * 1654452731;
            var3.method2804(-172768829);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lci;)V")
   @ObfuscatedName("bz")
   void method543(Player var1) {
      this.field175.remove(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lci;)V")
   @ObfuscatedName("bk")
   void method544(Player var1) {
      this.field175.remove(var1);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("as")
   void method577(int var1, int var2) {
      try {
         this.targetIndex = var1 * -148377471;

         for (int var3 = 0; var3 < this.field175.size(); var3++) {
            if (var2 <= -1239501023) {
               throw new IllegalStateException();
            }

            ((Actor)this.field175.get(var3)).targetIndex = -92047129 * var1;
            ((Actor)this.field175.get(var3)).method2838(-1);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bh.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("co")
   void method587(int var1, int var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < this.field175.size(); var6++) {
         ((Actor)this.field175.get(var6)).addHealthBar(var1, 2090475542 * client.cycle, var2, var3, var4, var5, (byte)118);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llz;B)V")
   @ObfuscatedName("az")
   void method569(MoveSpeed var1, byte var2) {
      try {
         for (int var3 = 0; var3 < this.field175.size(); var3++) {
            if (var2 == 0) {
               return;
            }

            Player var4 = (Player)this.field175.get(var3);
            WorldView var5 = var4.getWorldView((byte)-28);
            int var6 = this.coord.x * -1931160809 - var5.baseX * 825809917;
            int var7 = -263036313 * this.coord.y - 1279964673 * var5.baseY;
            MoveSpeed var8 = var1;
            short var9 = 1536;
            short var10 = 11776;
            if (-1 == 577964535 * var5.id) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               if (-1317332087 * client.cameraTargetIndex == -586128735 * this.field168) {
                  if (var2 == 0) {
                     return;
                  }

                  label64:
                  if (GrandExchangeOfferUnitPriceComparator.cameraViewMode == CameraViewMode.field5269) {
                     if (var4.x * 340712311 >= 1536) {
                        if (var2 == 0) {
                           throw new IllegalStateException();
                        }

                        if (-1747310679 * var4.y >= 1536) {
                           if (var2 == 0) {
                              throw new IllegalStateException();
                           }

                           if (var4.x * 340712311 < 11776) {
                              if (var2 == 0) {
                                 return;
                              }

                              if (-1747310679 * var4.y < 11776) {
                                 break label64;
                              }

                              if (var2 == 0) {
                                 throw new IllegalStateException();
                              }
                           }
                        }
                     }

                     var8 = MoveSpeed.field3805;
                  }
               }
            }

            var4.plane = this.coord.plane * 1883102579;
            if (MoveSpeed.field3805 == var8) {
               var4.method2767(var6, var7, -460723953);
            } else {
               Player.method1463(var4, var5, var6, var7, var8, 1045116658);
            }
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "bh.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lci;)V")
   @ObfuscatedName("yi")
   public void method621(Player var1) {
      SecureUrlRequester.client.getCallbacks().post(new PlayerDespawned(var1));
      if (field181 == var1) {
         field181 = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbh;[Ljava/lang/String;)V")
   @ObfuscatedName("ud")
   public static void method605(class46 var0, String[] var1) {
      if (var0 == null) {
         var0.method536();
      }

      var0.actions = Arrays.copyOf(var1, var1.length);

      for (int var2 = 0; var2 < var0.field175.size(); var2++) {
         ((Player)var0.field175.get(var2)).actions = Arrays.copyOf(var1, var1.length);
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("cv")
   void method606(String[] var1) {
      this.actions = Arrays.copyOf(var1, var1.length);

      for (int var2 = 0; var2 < this.field175.size(); var2++) {
         ((Player)this.field175.get(var2)).actions = Arrays.copyOf(var1, var1.length);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILdd;)Lci;")
   @ObfuscatedName("bt")
   Player method549(int var1, WorldView var2) {
      Player var3 = new Player(var1);
      if (null != this.field183) {
         var3.read(this.field183, (byte)31);
      }

      var3.orientation = 230851947 * this.orientation;
      var3.targetIndex = this.targetIndex * 556217703;
      var3.pathTraversed[0] = this.pathTraversed;
      var3.plane = this.coord.plane * 1883102579;
      var3.worldViewId = var2.id * 921498739;
      var3.actions = this.actions;
      var3.method2767(this.coord.x * -1931160809 - var2.baseX * 825809917, this.coord.y * -263036313 - 1279964673 * var2.baseY, -1110651973);
      return var3;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("br")
   void method560(int var1, int var2) {
      Coord.method8321(this.coord, this.field169 * 596721571, var1, var2, (byte)51);
      this.field169 = -1106754697;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   void method555() {
      this.field169 = this.coord.method8316(-1304815986) * 1728637963;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("by")
   void method556() {
      this.field169 = this.coord.method8316(113432819) * 1728637963;
   }

   @ObfuscatedSignature(descriptor = "(IIBBBB)V")
   @ObfuscatedName("dd")
   void method613(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
      for (int var7 = 0; var7 < this.field175.size(); var7++) {
         Player var8 = (Player)this.field175.get(var7);
         var8.npcCycle = var1 * 657376133;
         var8.field1125 = var2 * -244368321;
         GrandExchangeOfferWorldComparator.method8848(var8.field1136, var3, var4, var5, var6);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("wp")
   public void method619() {
      field181 = null;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bn")
   void method561(int var1, int var2) {
      Coord.method8321(this.coord, this.field169 * 351494353, var1, var2, (byte)112);
      this.field169 = -1728637963;
   }

   @ObfuscatedSignature(descriptor = "(Lbh;Lci;I)V")
   @ObfuscatedName("ru")
   public static void method540(class46 var0, Player var1, int var2) {
      if (var0 == null) {
         var0.method541(var1, var2);
      } else {
         var0.method620(var1);

         try {
            var0.field175.add(var1);
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "bh.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbh;ILpq;ZLjava/lang/String;[BB)V")
   @ObfuscatedName("ly")
   public static void method598(class46 var0, int var1, PlayerType var2, boolean var3, String var4, byte[] var5, byte var6) {
      if (var0 == null) {
         var0.method599(var1, var2, var3, var4, var5, var6);
      }

      try {
         boolean var7 = false;
         String var8 = null;

         for (int var9 = 0; var9 < var0.field175.size(); var9++) {
            if (var6 != 3) {
               throw new IllegalStateException();
            }

            Player var10 = (Player)var0.field175.get(var9);
            if (var10.username != null && null != var10.appearance) {
               if (var6 != 3) {
                  throw new IllegalStateException();
               }

               boolean var11 = false;
               if (var2.isUser) {
                  if (var6 != 3) {
                     throw new IllegalStateException();
                  }

                  if (FriendSystem.method443(class320.friendSystem, var10.username, (byte)-7)) {
                     var11 = true;
                  }
               }

               if (!var11) {
                  if (var6 != 3) {
                     throw new IllegalStateException();
                  }

                  if (0 == client.field668 * 106722889) {
                     if (var6 != 3) {
                        throw new IllegalStateException();
                     }

                     if (!var10.isHidden) {
                        int[] var13;
                        label176: {
                           var7 = true;
                           var8 = Username.method12702(var10.username, (byte)-31);
                           var10.overheadText = var4.trim();
                           var10.method2825(-1);
                           var10.field1161 = (var1 >> 8) * -1610220469;
                           var10.field1147 = -1464513895 * (var1 & 0xFF);
                           var10.overheadTextCyclesRemaining = -2058916106;
                           byte[] var14 = var5;
                           if (var5 != null) {
                              if (var6 != 3) {
                                 throw new IllegalStateException();
                              }

                              if (var5.length != 0) {
                                 if (var6 != 3) {
                                    throw new IllegalStateException();
                                 }

                                 if (var5.length <= 8) {
                                    int[] var15 = new int[var5.length];
                                    int var16 = 0;

                                    while (true) {
                                       if (var16 < var14.length) {
                                          if (var6 != 3) {
                                             throw new IllegalStateException();
                                          }

                                          if (var14[var16] >= 0) {
                                             if (var14[var16] < class623.field6575.length) {
                                                var15[var16] = class623.field6575[var14[var16]];
                                                var16++;
                                                continue;
                                             }

                                             if (var6 != 3) {
                                                return;
                                             }
                                          }

                                          var13 = null;
                                          break label176;
                                       }

                                       var13 = var15;
                                       break label176;
                                    }
                                 }
                              }
                           }

                           var13 = null;
                        }

                        boolean var10001;
                        label157: {
                           var10.field1148 = var13;
                           var10.field1186 = var3;
                           if (var10 != class330.localPlayer && var2.isUser) {
                              if (var6 != 3) {
                                 throw new IllegalStateException();
                              }

                              if (!client.field766.isEmpty() && var4.toLowerCase().indexOf(client.field766) == -1) {
                                 var10001 = true;
                                 break label157;
                              }
                           }

                           var10001 = false;
                        }

                        var10.field1144 = var10001;
                     }
                  }
               }
            }
         }

         if (var7) {
            if (var6 != 3) {
               throw new IllegalStateException();
            }

            if (null != var8) {
               int var18;
               if (var2.isPrivileged) {
                  if (var6 != 3) {
                     throw new IllegalStateException();
                  }

                  var18 = var3 ? 91 : 1;
               } else {
                  byte var10000;
                  if (var3) {
                     if (var6 != 3) {
                        throw new IllegalStateException();
                     }

                     var10000 = 90;
                  } else {
                     var10000 = 2;
                  }

                  var18 = var10000;
               }

               if (-1 != var2.modIcon * 390301733) {
                  if (var6 != 3) {
                     throw new IllegalStateException();
                  }

                  class356.addGameMessage(var18, SoundSystem.method3115(390301733 * var2.modIcon, 2127187032) + var8, var4, 1276845987);
               } else {
                  class356.addGameMessage(var18, var8, var4, -1839198257);
               }
            }
         }
      } catch (RuntimeException var17) {
         throw RestClientThreadFactory.newRunException(var17, "bh.al(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbh;IIIII)V")
   @ObfuscatedName("dn")
   public static void method588(class46 var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 == null) {
         var0.method619();
      } else {
         for (int var6 = 0; var6 < var0.field175.size(); var6++) {
            ((Actor)var0.field175.get(var6)).addHealthBar(var1, 1759706017 * client.cycle, var2, var3, var4, var5, (byte)88);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bd")
   void method562(int var1, int var2) {
      Coord.method8321(this.coord, this.field169 * -173985257, var1, var2, (byte)86);
      this.field169 = -1728637963;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ck")
   void method578(int var1) {
      this.targetIndex = var1 * -148377471;

      for (int var2 = 0; var2 < this.field175.size(); var2++) {
         ((Actor)this.field175.get(var2)).targetIndex = 594949731 * var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bh")
   void method563(int var1, int var2) {
      Coord.method8321(this.coord, this.field169 * 596721571, var1, var2, (byte)76);
      this.field169 = -1728637963;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("cq")
   void method607(String[] var1) {
      this.actions = Arrays.copyOf(var1, var1.length);

      for (int var2 = 0; var2 < this.field175.size(); var2++) {
         ((Player)this.field175.get(var2)).actions = Arrays.copyOf(var1, var1.length);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bq")
   void method567(int var1) {
      this.coord.plane = var1 * 969692463;
   }

   @ObfuscatedSignature(descriptor = "(Llz;)V")
   @ObfuscatedName("bx")
   void method570(MoveSpeed var1) {
      for (int var2 = 0; var2 < this.field175.size(); var2++) {
         Player var3 = (Player)this.field175.get(var2);
         WorldView var4 = var3.getWorldView((byte)-85);
         int var5 = this.coord.x * -1931160809 - var4.baseX * 825809917;
         int var6 = -263036313 * this.coord.y - 1279964673 * var4.baseY;
         MoveSpeed var7 = var1;
         short var8 = 1536;
         short var9 = 11776;
         if (-1 == 577964535 * var4.id
            && -1317332087 * client.cameraTargetIndex == -586128735 * this.field168
            && GrandExchangeOfferUnitPriceComparator.cameraViewMode == CameraViewMode.field5269
            && (var3.x * 340712311 < 1536 || -1747310679 * var3.y < 1536 || var3.x * 340712311 >= 11776 || -1747310679 * var3.y >= 11776)) {
            var7 = MoveSpeed.field3805;
         }

         var3.plane = this.coord.plane * 1883102579;
         if (MoveSpeed.field3805 == var7) {
            var3.method2767(var5, var6, 1357431973);
         } else {
            Player.method1463(var3, var4, var5, var6, var7, 1045116658);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("bv")
   void method572(Buffer var1) {
      this.field183 = var1;

      for (int var2 = 0; var2 < this.field175.size(); var2++) {
         ((Player)this.field175.get(var2)).read(this.field183, (byte)29);
      }
   }

   class46(int var1) {
      this.field169 = 0;
      this.coord = new Coord();
      this.actions = new String[3];
      this.field168 = -996671841;
      this.orientation = 0;
      this.field171 = 573777967;
      this.targetIndex = 148377471;
      this.field168 = 996671841 * var1;

      for (int var2 = 0; var2 < 3; var2++) {
         this.actions[var2] = "";
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cu")
   void method576(int var1, int var2) {
      for (int var3 = 0; var3 < this.field175.size(); var3++) {
         CameraViewMode.performPlayerAnimation((Player)this.field175.get(var3), var1, var2, -40656488);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ct")
   void method579(int var1) {
      this.targetIndex = var1 * 1307843627;

      for (int var2 = 0; var2 < this.field175.size(); var2++) {
         ((Actor)this.field175.get(var2)).targetIndex = -92047129 * var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbh;)V")
   @ObfuscatedName("la")
   public static void method546(class46 var0) {
      var0.field175.clear();
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cm")
   void method580(int var1) {
      this.targetIndex = var1 * -148377471;

      for (int var2 = 0; var2 < this.field175.size(); var2++) {
         ((Actor)this.field175.get(var2)).targetIndex = -92047129 * var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cb")
   void method581(int var1) {
      this.targetIndex = var1 * -148377471;

      for (int var2 = 0; var2 < this.field175.size(); var2++) {
         ((Actor)this.field175.get(var2)).targetIndex = -92047129 * var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   void method547() {
      this.field175.clear();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("cc")
   void method583(String var1) {
      boolean var2 = var1.charAt(0) == '~';
      if (var2) {
         var1 = var1.substring(1);
      }

      Username var3 = null;

      for (int var4 = 0; var4 < this.field175.size(); var4++) {
         Player var5 = (Player)this.field175.get(var4);
         var5.field1186 = false;
         var5.field1161 = 0;
         var5.field1147 = 0;
         var5.overheadTextCyclesRemaining = -1636497358;
         var5.overheadText = var1;
         var3 = var5.username;
      }

      if (var3 != null) {
         if (var2 || 259228129 * this.field168 == client.localPlayerIndex * -1548864151) {
            class356.addGameMessage(2, Username.method12702(var3, (byte)-11), var1, -55788655);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("cs")
   void method584(String var1) {
      boolean var2 = var1.charAt(0) == '~';
      if (var2) {
         var1 = var1.substring(1);
      }

      Username var3 = null;

      for (int var4 = 0; var4 < this.field175.size(); var4++) {
         Player var5 = (Player)this.field175.get(var4);
         var5.field1186 = false;
         var5.field1161 = 0;
         var5.field1147 = 0;
         var5.overheadTextCyclesRemaining = -2058916106;
         var5.overheadText = var1;
         var3 = var5.username;
      }

      if (var3 != null) {
         if (var2 || -586128735 * this.field168 == client.localPlayerIndex * -1548864151) {
            class356.addGameMessage(2, Username.method12702(var3, (byte)-2), var1, -21883857);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("cx")
   void method589(int var1, int var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < this.field175.size(); var6++) {
         ((Actor)this.field175.get(var6)).addHealthBar(var1, 1759706017 * client.cycle, var2, var3, var4, var5, (byte)92);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ba")
   boolean method552() {
      return -1 == 596721571 * this.field169;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cg")
   void method592(int var1) {
      for (int var2 = 0; var2 < this.field175.size(); var2++) {
         ((Actor)this.field175.get(var2)).removeHealthBar(var1, 327716789);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cp")
   void method593(int var1) {
      for (int var2 = 0; var2 < this.field175.size(); var2++) {
         ((Actor)this.field175.get(var2)).removeHealthBar(var1, 327716789);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cd")
   void method594(int var1) {
      for (int var2 = 0; var2 < this.field175.size(); var2++) {
         ((Actor)this.field175.get(var2)).removeHealthBar(var1, 327716789);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbh;)V")
   @ObfuscatedName("wr")
   public static void method557(class46 var0) {
      var0.field169 = var0.coord.method8316(-1341505848) * 1728637963;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbh;I)V")
   @ObfuscatedName("sj")
   public static void method568(class46 var0, int var1) {
      var0.coord.plane = var1 * 969692463;
   }

   @ObfuscatedSignature(descriptor = "(ILdd;I)Lci;")
   @ObfuscatedName("aj")
   Player method550(int var1, WorldView var2, int var3) {
      try {
         Player var4 = new Player(var1);
         if (null != this.field183) {
            if (var3 <= 972788794) {
               throw new IllegalStateException();
            }

            var4.read(this.field183, (byte)-94);
         }

         var4.orientation = 230851947 * this.orientation;
         var4.targetIndex = this.targetIndex * 556217703;
         var4.method2838(-1);
         var4.pathTraversed[0] = this.pathTraversed;
         var4.plane = this.coord.plane * 1883102579;
         var4.worldViewId = var2.id * 921498739;
         var4.actions = this.actions;
         var4.method2767(this.coord.x * -1931160809 - var2.baseX * 825809917, this.coord.y * -263036313 - 1279964673 * var2.baseY, -1076394061);
         return var4;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "bh.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbh;IIIIIII)V")
   @ObfuscatedName("bd")
   public static void method601(class46 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var0 == null) {
         var0.method603(var1, var1, var1, var1, var1, var1, var1);
      } else {
         for (int var8 = 0; var8 < var0.field175.size(); var8++) {
            Player var9 = (Player)var0.field175.get(var8);
            WorldView var10 = var9.getWorldView((byte)-5);
            int var11 = -1931160809 * var0.coord.x - -1302548400 * var10.baseX;
            int var12 = -263036313 * var0.coord.y - var10.baseY * 1279964673;
            var9.field1181 = -1816676295 * (var11 + var1);
            var9.field1178 = (var2 + var12) * 1687056953;
            var9.field1180 = (var3 + var11) * 637283297;
            var9.field1182 = (var4 + var12) * -449848409;
            var9.spotAnimation = -779189801 * var5;
            var9.field1176 = 1487731929 * var6;
            var9.field1179 = var7 * 987924868;
            var9.field1164 = 0;
            var9.resetPath(-259434463 * var9.field1180, -276095977 * var9.field1182, 327716789);
            var9.plane = 1883102579 * var0.coord.plane;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIB)V")
   @ObfuscatedName("ab")
   void method585(int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         for (int var7 = 0; var7 < this.field175.size(); var7++) {
            ((Actor)this.field175.get(var7)).addHitSplat(var1, var2, var3, var4, client.cycle * 1759706017, var5, (short)32767);
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "bh.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ce")
   void method573(Buffer var1) {
      this.field183 = var1;

      for (int var2 = 0; var2 < this.field175.size(); var2++) {
         ((Player)this.field175.get(var2)).read(this.field183, (byte)-45);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bu")
   boolean method553() {
      return -1 == 596721571 * this.field169;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("cr")
   void method608(String[] var1) {
      this.actions = Arrays.copyOf(var1, var1.length);

      for (int var2 = 0; var2 < this.field175.size(); var2++) {
         ((Player)this.field175.get(var2)).actions = Arrays.copyOf(var1, var1.length);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("df")
   void method617(int var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < this.field175.size(); var5++) {
         ((Actor)this.field175.get(var5)).updateSpotAnimation(var1, var2, var3, var4, -1382181099);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIBBBB)V")
   @ObfuscatedName("dw")
   void method614(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
      for (int var7 = 0; var7 < this.field175.size(); var7++) {
         Player var8 = (Player)this.field175.get(var7);
         var8.npcCycle = var1 * 657376133;
         var8.field1125 = var2 * 1535533974;
         GrandExchangeOfferWorldComparator.method8848(var8.field1136, var3, var4, var5, var6);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("cy")
   void method602(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for (int var8 = 0; var8 < this.field175.size(); var8++) {
         Player var9 = (Player)this.field175.get(var8);
         WorldView var10 = var9.getWorldView((byte)-49);
         int var11 = -1130514071 * this.coord.x - 596181946 * var10.baseX;
         int var12 = 102965316 * this.coord.y - var10.baseY * 1279964673;
         var9.field1181 = 652346753 * (var11 + var1);
         var9.field1178 = (var2 + var12) * 517957376;
         var9.field1180 = (var3 + var11) * -252576164;
         var9.field1182 = (var4 + var12) * 95595297;
         var9.spotAnimation = -98156783 * var5;
         var9.field1176 = -245424301 * var6;
         var9.field1179 = var7 * 182140069;
         var9.field1164 = 0;
         var9.resetPath(-707070624 * var9.field1180, -276095977 * var9.field1182, 327716789);
         var9.plane = 1883102579 * this.coord.plane;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("dv")
   void method618(int var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < this.field175.size(); var5++) {
         ((Actor)this.field175.get(var5)).updateSpotAnimation(var1, var2, var3, var4, -853932802);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ch")
   void method574(Buffer var1) {
      this.field183 = var1;

      for (int var2 = 0; var2 < this.field175.size(); var2++) {
         ((Player)this.field175.get(var2)).read(this.field183, (byte)-59);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;B)V")
   @ObfuscatedName("av")
   public static void method533(AbstractArchive var0, byte var1) {
      try {
         VarpDefinition.VarpDefinition_archive = var0;
         VarpDefinition.field2407 = AbstractArchive.method9046(VarpDefinition.VarpDefinition_archive, 16, (byte)-31) * 1596659933;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bh.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lci;I)V")
   @ObfuscatedName("ag")
   void method541(Player var1, int var2) {
      this.method621(var1);

      try {
         this.field175.add(var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bh.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ax")
   void method590(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         for (int var7 = 0; var7 < this.field175.size(); var7++) {
            ((Actor)this.field175.get(var7)).addHealthBar(var1, 1759706017 * client.field983, var2, var3, var4, var5, (byte)34);
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "bh.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ah")
   void method564(int var1, int var2) {
      Coord.method8321(this.coord, this.orientation * -173985257, var1, var2, (byte)86);
      this.field169 = -1728637963;
   }

   @ObfuscatedSignature(descriptor = "(ILpq;ZLjava/lang/String;[BB)V")
   @ObfuscatedName("al")
   void method599(int var1, PlayerType var2, boolean var3, String var4, byte[] var5, byte var6) {
      try {
         boolean var7 = false;
         String var8 = null;

         for (int var9 = 0; var9 < this.field175.size(); var9++) {
            if (var6 != 3) {
               throw new IllegalStateException();
            }

            Player var10 = (Player)this.field175.get(var9);
            if (var10.username != null && null != var10.appearance) {
               if (var6 != 3) {
                  throw new IllegalStateException();
               }

               boolean var11 = false;
               if (var2.isUser) {
                  if (var6 != 3) {
                     throw new IllegalStateException();
                  }

                  if (FriendSystem.method443(class320.friendSystem, var10.username, (byte)-7)) {
                     var11 = true;
                  }
               }

               if (!var11) {
                  if (var6 != 3) {
                     throw new IllegalStateException();
                  }

                  if (0 == client.field831 * 106722889) {
                     if (var6 != 3) {
                        throw new IllegalStateException();
                     }

                     if (!var10.isHidden) {
                        int[] var13;
                        label174: {
                           var7 = true;
                           var8 = Username.method12702(var10.username, (byte)-31);
                           var10.overheadText = var4.trim();
                           var10.method2825(-1);
                           var10.field1180 = (var1 >> 8) * -1610220469;
                           var10.field1123 = -1464513895 * (var1 & 0xFF);
                           var10.worldViewId = -2058916106;
                           byte[] var14 = var5;
                           if (var5 != null) {
                              if (var6 != 3) {
                                 throw new IllegalStateException();
                              }

                              if (var5.length != 0) {
                                 if (var6 != 3) {
                                    throw new IllegalStateException();
                                 }

                                 if (var5.length <= 8) {
                                    int[] var15 = new int[var5.length];
                                    int var16 = 0;

                                    while (true) {
                                       if (var16 < var14.length) {
                                          if (var6 != 3) {
                                             throw new IllegalStateException();
                                          }

                                          if (var14[var16] >= 0) {
                                             if (var14[var16] < class623.field6575.length) {
                                                var15[var16] = class623.field6575[var14[var16]];
                                                var16++;
                                                continue;
                                             }

                                             if (var6 != 3) {
                                                return;
                                             }
                                          }

                                          var13 = null;
                                          break label174;
                                       }

                                       var13 = var15;
                                       break label174;
                                    }
                                 }
                              }
                           }

                           var13 = null;
                        }

                        boolean var10001;
                        label155: {
                           var10.hitSplatTypes = var13;
                           var10.false0 = var3;
                           if (var10 != class330.localPlayer && var2.isUser) {
                              if (var6 != 3) {
                                 throw new IllegalStateException();
                              }

                              if (!client.field673.isEmpty() && var4.toLowerCase().indexOf(client.refreshToken) == -1) {
                                 var10001 = true;
                                 break label155;
                              }
                           }

                           var10001 = false;
                        }

                        var10.field1185 = var10001;
                     }
                  }
               }
            }
         }

         if (var7) {
            if (var6 != 3) {
               throw new IllegalStateException();
            }

            if (null != var8) {
               int var18;
               if (var2.isUser) {
                  if (var6 != 3) {
                     throw new IllegalStateException();
                  }

                  var18 = var3 ? 91 : 1;
               } else {
                  byte var10000;
                  if (var3) {
                     if (var6 != 3) {
                        throw new IllegalStateException();
                     }

                     var10000 = 90;
                  } else {
                     var10000 = 2;
                  }

                  var18 = var10000;
               }

               if (-1 != var2.modIcon * 390301733) {
                  if (var6 != 3) {
                     throw new IllegalStateException();
                  }

                  class356.addGameMessage(var18, SoundSystem.method3115(390301733 * var2.modIcon, 2127187032) + var8, var4, 1276845987);
               } else {
                  class356.addGameMessage(var18, var8, var4, -1839198257);
               }
            }
         }
      } catch (RuntimeException var17) {
         throw RestClientThreadFactory.newRunException(var17, "bh.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;I)V")
   @ObfuscatedName("am")
   void method609(String[] var1, int var2) {
      try {
         this.actions = Arrays.copyOf(var1, var1.length);

         for (int var3 = 0; var3 < this.field175.size(); var3++) {
            if (var2 != -937676350) {
               throw new IllegalStateException();
            }

            ((Player)this.field175.get(var3)).actions = Arrays.copyOf(var1, var1.length);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bh.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbh;[Ljava/lang/String;I)V")
   @ObfuscatedName("nm")
   public static void method610(class46 var0, String[] var1, int var2) {
      if (var0 == null) {
         var0.method609(var1, var2);
      }

      try {
         var0.actions = Arrays.copyOf(var1, var1.length);

         for (int var3 = 0; var3 < var0.field175.size(); var3++) {
            if (var2 != -937676350) {
               throw new IllegalStateException();
            }

            ((Player)var0.field175.get(var3)).actions = Arrays.copyOf(var1, var1.length);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bh.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bw")
   void method558() {
      this.targetIndex = this.coord.method8316(-1304815986) * 1728637963;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("cf")
   void method603(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for (int var8 = 0; var8 < this.field175.size(); var8++) {
         Player var9 = (Player)this.field175.get(var8);
         WorldView var10 = var9.getWorldView((byte)-5);
         int var11 = -1931160809 * this.coord.plane - -1302548400 * var10.baseY;
         int var12 = -263036313 * this.coord.x - var10.baseY * 1279964673;
         var9.field1153 = -1816676295 * (var11 + var1);
         var9.field1139 = (var2 + var12) * 1687056953;
         var9.index = (var3 + var11) * 637283297;
         var9.field1178 = (var4 + var12) * -449848409;
         var9.field1164 = -779189801 * var5;
         var9.field1164 = 1487731929 * var6;
         var9.y = var7 * 987924868;
         var9.y = 0;
         var9.resetPath(-259434463 * var9.field1153, -276095977 * var9.field1178, 327716789);
         var9.animationCycleStart = 1883102579 * this.coord.plane;
      }
   }
}
