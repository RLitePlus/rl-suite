import java.util.HashMap;
import java.util.Iterator;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.WorldEntityDespawned;
import net.runelite.api.events.WorldViewUnloaded;
import net.runelite.api.hooks.Callbacks;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cv")
public class WorldViewManager implements Iterable {
   @ObfuscatedSignature(descriptor = "Ldd;")
   @ObfuscatedName("aj")
   WorldView worldView;
   @ObfuscatedName("ag")
   final HashMap field1225;
   @ObfuscatedName("at")
   final HashMap field1224;
   @ObfuscatedSignature(descriptor = "Lql;")
   @ObfuscatedName("av")
   final IterableNodeHashTable worldViews = new IterableNodeHashTable(16);
   @ObfuscatedSignature(descriptor = "Luf;")
   @ObfuscatedName("ae")
   class524 field1230;
   @ObfuscatedSignature(descriptor = "Luv;")
   @ObfuscatedName("an")
   ClickAction field1231;
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   public static final int field1228 = 4;
   @ObfuscatedName("ak")
   int field1223;
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   static final int field1227 = 42;

   @ObfuscatedSignature(descriptor = "(IIIB)Ldd;")
   @ObfuscatedName("av")
   WorldView createWorldView(int var1, int var2, int var3, byte var4) {
      try {
         this.worldView = this.createWorldView2(-1, var1, var2, var3, TileRenderMode.field3137, 1833387737);
         return this.worldView;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "cv.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcv;Luv;Luf;I)V")
   @ObfuscatedName("mp")
   public static void method2931(WorldViewManager var0, ClickAction var1, class524 var2, int var3) {
      if (var0 == null) {
         var0.method2935(var1, var2, var3);
      }

      try {
         var0.field1231 = var1;
         var0.field1230 = var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cv.ai(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcv;III)Ldd;")
   @ObfuscatedName("ou")
   public static WorldView method2886(WorldViewManager var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method2968();
      }

      var0.worldView = var0.createWorldView2(-1, var1, var2, var3, TileRenderMode.field3137, 1657359804);
      return var0.worldView;
   }

   @ObfuscatedSignature(descriptor = "(IIIILjn;I)Ldd;")
   @ObfuscatedName("at")
   WorldView createWorldView2(int var1, int var2, int var3, int var4, TileRenderMode var5, int var6) {
      try {
         WorldView var7 = new WorldView(var1, var2, var3, var4, var5);
         this.worldViews.put((Node)var7, (long)var1);
         this.field1223 += -543696247;
         return var7;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "cv.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ag")
   void removeWorldViewById(int var1, int var2) {
      this.method2960(var1);

      try {
         WorldView var3 = (WorldView)this.worldViews.get((long)var1);
         method2896(this, var3, (short)-30816);
         this.method2963(var1);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cv.ag(" + ')');
      }
   }

   @Override
   public Iterator iterator() {
      try {
         return this.worldViews.iterator();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "cv.iterator(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcv;IB)Ldd;")
   @ObfuscatedName("nk")
   public static WorldView method2901(WorldViewManager var0, int var1, byte var2) {
      if (var0 == null) {
         var0.getWorldView(var1, var2);
      }

      try {
         return (WorldView)var0.worldViews.get((long)var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cv.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ac")
   void method2940(int var1, byte var2) {
      try {
         this.field1225.remove(var1);
         this.field1224.remove(var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cv.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lci;")
   @ObfuscatedName("ap")
   Player method2961(int var1) {
      WorldView var2 = this.method2969(client.currentWorldViewId * 1201323213);
      return var2 == null ? null : var2.method3102(client.localPlayerIndex * -1548864151);
   }

   @ObfuscatedSignature(descriptor = "(Lcv;I)Lts;")
   @ObfuscatedName("zw")
   public static WorldEntity method2922(WorldViewManager var0, int var1) {
      if (var0 == null) {
         return var0.method2925(var1);
      } else {
         try {
            return (WorldEntity)var0.method2905((byte)-26).worldEntities.get((long)(client.currentWorldViewId * 1201323213));
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "cv.au(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lts;")
   @ObfuscatedName("ay")
   WorldEntity method2917(int var1, int var2) {
      try {
         return (WorldEntity)this.method2905((byte)-39).worldEntities.get((long)var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cv.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lci;")
   @ObfuscatedName("bi")
   Player method2915() {
      return WorldView.method3073(method2901(this, 1201323213 * client.currentWorldViewId, (byte)1), client.localPlayerIndex * 1743512221, 1241304183);
   }

   @ObfuscatedSignature(descriptor = "(I)Lrx;")
   @ObfuscatedName("az")
   ProjectionCoord method2962(int var1) {
      WorldView var2 = this.method2970();
      if (var2 == null) {
         return ProjectionCoord.method9923(0.0F, 0.0F, 0.0F);
      } else {
         Player var3 = var2.method3102(client.localPlayerIndex * -1548864151);
         if (var3 == null) {
            return ProjectionCoord.method9923(0.0F, 0.0F, 0.0F);
         } else {
            ProjectionCoord var4 = client.method2537(var2, var3.vmethod153(), var3.vmethod154());
            var4.z = var3.vmethod155();
            return var4;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ldd;")
   @ObfuscatedName("aj")
   public WorldView method2905(byte var1) {
      try {
         return this.worldView;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cv.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcv;I)Luv;")
   @ObfuscatedName("ll")
   public static ClickAction method2943(WorldViewManager var0, int var1) {
      ClickAction var2 = (ClickAction)var0.field1225.get(var1);
      return null != var2 ? var2 : var0.field1231;
   }

   @ObfuscatedSignature(descriptor = "(Ldd;)V")
   @ObfuscatedName("bs")
   void method2895(WorldView var1) {
      if (null != var1) {
         this.field1225.remove(var1.id * 577964535);
         this.field1224.remove(577964535 * var1.id);
         var1.method3084((byte)-5);
         var1.remove();
         this.field1223 -= -543696247;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcv;Ldd;S)V")
   @ObfuscatedName("cq")
   public static void method2896(WorldViewManager var0, WorldView var1, short var2) {
      if (var0 == null) {
         var0.removeWorldView(var1, var2);
      }

      var0.method2964(var1);

      try {
         if (null != var1) {
            if (var2 >= 128) {
               throw new IllegalStateException();
            }

            var0.field1225.remove(var1.id * 577964535);
            var0.field1224.remove(577964535 * var1.id);
            var1.method3084((byte)8);
            var1.remove();
            var0.field1223 -= -543696247;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cv.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Luf;")
   @ObfuscatedName("cn")
   class524 method2947(int var1) {
      class524 var2 = (class524)this.field1224.get(var1);
      return null != var2 ? var2 : this.field1230;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("mo")
   public void method2963(int var1) {
      WorldEntity var2 = (WorldEntity)class340.method7830(Occluder.topLevelWorldView.worldEntities, var1);
      if (var2 != null) {
         client.field938.debug("WorldEntity despawn: {}", var2.plane * 314555321);
         SecureUrlRequester.client.getCallbacks().post(new WorldEntityDespawned(var2));
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Luf;")
   @ObfuscatedName("ax")
   class524 method2948(int var1, int var2) {
      try {
         class524 var3 = (class524)this.field1224.get(var1);
         class524 var10000;
         if (null != var3) {
            if (var2 >= 1434241066) {
               throw new IllegalStateException();
            }

            var10000 = var3;
         } else {
            var10000 = this.field1230;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cv.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldd;")
   @ObfuscatedName("bp")
   WorldView method2908() {
      return method2901(this, client.currentWorldViewId * 914418758, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(I)Luv;")
   @ObfuscatedName("ux")
   public ClickAction method2966(int var1) {
      return method2945(this, var1, -19345525);
   }

   @ObfuscatedSignature(descriptor = "(Lcv;III)Ldd;")
   @ObfuscatedName("ix")
   public static WorldView method2912(WorldViewManager var0, int var1, int var2, int var3) {
      if (var0 == null) {
         return var0.getWorldViewFromWorldPoint(var1, var1, var1);
      } else {
         try {
            Iterator var4 = var0.iterator();

            while (var4.hasNext()) {
               if (var3 == -159808370) {
                  throw new IllegalStateException();
               }

               WorldView var5 = (WorldView)var4.next();
               if (577964535 * var5.id != -1) {
                  int var6 = 825809917 * var5.baseX;
                  int var7 = var5.baseY * 1279964673;
                  int var8 = var6 + var5.sizeX * 2010544793;
                  int var9 = var7 + 1823353167 * var5.sizeY;
                  if (var1 >= var6) {
                     if (var3 == -159808370) {
                        throw new IllegalStateException();
                     }

                     if (var2 >= var7) {
                        if (var3 == -159808370) {
                           throw new IllegalStateException();
                        }

                        if (var1 < var8) {
                           if (var3 == -159808370) {
                              throw new IllegalStateException();
                           }

                           if (var2 < var9) {
                              if (var3 == -159808370) {
                                 throw new IllegalStateException();
                              }

                              return var5;
                           }
                        }
                     }
                  }
               }
            }

            return var0.worldView;
         } catch (RuntimeException var10) {
            throw RestClientThreadFactory.newRunException(var10, "cv.aw(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ar")
   void clear(byte var1) {
      try {
         Iterator var2 = this.worldViews.iterator();

         while (var2.hasNext()) {
            if (var1 >= 3) {
               throw new IllegalStateException();
            }

            WorldView var3 = (WorldView)var2.next();
            method2896(this, var3, (short)-17095);
         }

         this.worldViews.clear();
         this.field1223 = 0;
         this.field1225.clear();
         this.field1224.clear();
         this.field1231 = ClickAction.field6119;
         this.field1230 = class524.field6036;
         if (null != this.worldView) {
            if (var1 >= 3) {
               throw new IllegalStateException();
            }

            this.worldView.method3067(710287567);
            this.worldViews.put((Node)this.worldView, -1L);
            this.field1223 = -543696247;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cv.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Ldd;")
   @ObfuscatedName("al")
   WorldView method2887(int var1, int var2, int var3) {
      this.worldView = this.createWorldView2(-1, var1, var2, var3, TileRenderMode.field3137, 1945735839);
      return this.worldView;
   }

   @ObfuscatedSignature(descriptor = "(III)Ldd;")
   @ObfuscatedName("af")
   WorldView method2888(int var1, int var2, int var3) {
      this.worldView = this.createWorldView2(-1, var1, var2, var3, TileRenderMode.field3137, 1449773109);
      return this.worldView;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aq")
   void method2894(int var1) {
      WorldView var2 = (WorldView)this.worldViews.get((long)var1);
      method2896(this, var2, (short)-20596);
   }

   @ObfuscatedSignature(descriptor = "(Ldd;)V")
   @ObfuscatedName("be")
   void method2897(WorldView var1) {
      if (null != var1) {
         this.field1225.remove(var1.id * 577964535);
         this.field1224.remove(577964535 * var1.id);
         var1.method3084((byte)-6);
         var1.remove();
         this.field1223 -= -543696247;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcv;I)I")
   @ObfuscatedName("ph")
   public static int method2927(WorldViewManager var0, int var1) {
      if (var0 == null) {
         var0.method2930(var1);
      }

      try {
         return 492420025 * var0.field1223;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cv.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;)V")
   @ObfuscatedName("bo")
   void method2898(WorldView var1) {
      if (null != var1) {
         this.field1225.remove(var1.id * -1602341770);
         this.field1224.remove(-1679380368 * var1.id);
         var1.method3084((byte)-111);
         var1.remove();
         this.field1223 -= 2026529195;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Luf;")
   @ObfuscatedName("cs")
   class524 method2949(int var1) {
      class524 var2 = (class524)this.field1224.get(var1);
      return null != var2 ? var2 : this.field1230;
   }

   @ObfuscatedSignature(descriptor = "()Ldd;")
   @ObfuscatedName("dc")
   public WorldView method2906() {
      return this.worldView;
   }

   @ObfuscatedSignature(descriptor = "()Ldd;")
   @ObfuscatedName("bb")
   public WorldView method2907() {
      return this.worldView;
   }

   @ObfuscatedSignature(descriptor = "(ILuv;Luf;I)V")
   @ObfuscatedName("as")
   void method2936(int var1, ClickAction var2, class524 var3, int var4) {
      try {
         this.field1225.put(var1, var2);
         this.field1224.put(var1, var3);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "cv.as(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;)Z")
   @ObfuscatedName("rr")
   public static boolean method2959(World var0) {
      if (var0 == null) {
         var0.method898();
      }

      return (class594.field6429.rsOrdinal((byte)93) & -607869593 * var0.location) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Ldd;")
   @ObfuscatedName("bm")
   WorldView method2909() {
      return method2901(this, client.currentWorldViewId * -1073553100, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(II)Ldd;")
   @ObfuscatedName("bt")
   WorldView method2913(int var1, int var2) {
      for (WorldView var4 : this) {
         if (577964535 * var4.id != -1) {
            int var5 = 825809917 * var4.baseX;
            int var6 = var4.baseY * 1279964673;
            int var7 = var5 + var4.sizeX * 2010544793;
            int var8 = var6 + 1823353167 * var4.sizeY;
            if (var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8) {
               return var4;
            }
         }
      }

      return this.worldView;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcv;)Ljava/util/Iterator;")
   @ObfuscatedName("zz")
   public static Iterator method2952(WorldViewManager var0) {
      if (var0 == null) {
         var0.method2957();
      }

      return var0.worldViews.iterator();
   }

   @ObfuscatedSignature(descriptor = "()Lci;")
   @ObfuscatedName("bu")
   Player method2916() {
      return WorldView.method3073(method2901(this, 1201323213 * client.currentWorldViewId, (byte)1), client.localPlayerIndex * -1548864151, 1254377160);
   }

   @ObfuscatedSignature(descriptor = "(Ldd;)V")
   @ObfuscatedName("bg")
   void method2899(WorldView var1) {
      if (null != var1) {
         this.field1225.remove(var1.id * -1814254899);
         this.field1224.remove(-229323934 * var1.id);
         var1.method3084((byte)-65);
         var1.remove();
         this.field1223 -= 422233208;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   public static void method2884(int var0) {
      try {
         VarbitComposition.VarbitDefinition_cached.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "cv.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lts;")
   @ObfuscatedName("bw")
   WorldEntity method2918(int var1) {
      return (WorldEntity)this.method2905((byte)-2).worldEntities.get((long)var1);
   }

   @ObfuscatedSignature(descriptor = "(I)Lts;")
   @ObfuscatedName("bf")
   WorldEntity method2919(int var1) {
      return (WorldEntity)this.method2905((byte)-92).worldEntities.get((long)var1);
   }

   @ObfuscatedSignature(descriptor = "(I)Lts;")
   @ObfuscatedName("bn")
   WorldEntity method2920(int var1) {
      return (WorldEntity)this.method2905((byte)-103).worldEntities.get((long)var1);
   }

   @ObfuscatedSignature(descriptor = "()Lts;")
   @ObfuscatedName("br")
   WorldEntity method2923() {
      return (WorldEntity)this.method2905((byte)-13).worldEntities.get((long)(client.currentWorldViewId * 1201323213));
   }

   @ObfuscatedSignature(descriptor = "(IIIILjn;)Ldd;")
   @ObfuscatedName("vh")
   public WorldView method2967(int var1, int var2, int var3, int var4, TileRenderMode var5) {
      return this.createWorldView2(var1, var2, var3, var4, var5, 1833387737);
   }

   @ObfuscatedSignature(descriptor = "()Lts;")
   @ObfuscatedName("bd")
   WorldEntity method2924() {
      return (WorldEntity)this.method2905((byte)-56).worldEntities.get((long)(client.currentWorldViewId * 1201323213));
   }

   @ObfuscatedSignature(descriptor = "()Lrx;")
   @ObfuscatedName("bh")
   ProjectionCoord method2926() {
      WorldView var1 = method2910(this, (byte)1);
      Player var2 = WorldView.method3073(var1, -1548864151 * client.localPlayerIndex, 1970817359);
      ProjectionCoord var3 = classDH.method3122(var1, var2.getY(-1697840644), var2.getX(-727737924), (byte)61);
      var3.z = var2.getPlane(-1956853625);
      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcv;)Ljava/util/Iterator;")
   @ObfuscatedName("at")
   public static Iterator method2953(WorldViewManager var0) {
      return var0.worldViews.iterator();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bl")
   int method2928() {
      return 492420025 * this.field1223;
   }

   @ObfuscatedSignature(descriptor = "()Lci;")
   @ObfuscatedName("ls")
   public Player method2968() {
      return this.method2961(1069843077);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bc")
   int method2929() {
      return 260517097 * this.field1223;
   }

   @ObfuscatedSignature(descriptor = "(Luv;Luf;)V")
   @ObfuscatedName("bq")
   void method2932(ClickAction var1, class524 var2) {
      this.field1231 = var1;
      this.field1230 = var2;
   }

   @ObfuscatedSignature(descriptor = "(Luv;Luf;)V")
   @ObfuscatedName("bv")
   void method2933(ClickAction var1, class524 var2) {
      this.field1231 = var1;
      this.field1230 = var2;
   }

   @ObfuscatedSignature(descriptor = "(ILuv;Luf;)V")
   @ObfuscatedName("ch")
   void method2937(int var1, ClickAction var2, class524 var3) {
      this.field1225.put(var1, var2);
      this.field1224.put(var1, var3);
   }

   @ObfuscatedSignature(descriptor = "(ILuv;Luf;)V")
   @ObfuscatedName("ce")
   void method2938(int var1, ClickAction var2, class524 var3) {
      this.field1225.put(var1, var2);
      this.field1224.put(var1, var3);
   }

   @ObfuscatedSignature(descriptor = "(ILuv;Luf;)V")
   @ObfuscatedName("cu")
   void method2939(int var1, ClickAction var2, class524 var3) {
      this.field1225.put(var1, var2);
      this.field1224.put(var1, var3);
   }

   @ObfuscatedSignature(descriptor = "(I)Ldd;")
   @ObfuscatedName("bk")
   public WorldView method2902(int var1) {
      return (WorldView)this.worldViews.get((long)var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cm")
   void method2941(int var1) {
      this.field1225.remove(var1);
      this.field1224.remove(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ct")
   void method2942(int var1) {
      this.field1225.remove(var1);
      this.field1224.remove(var1);
   }

   WorldViewManager() {
      this.field1225 = new HashMap(16);
      this.field1224 = new HashMap(16);
      this.field1223 = 0;
      this.clear((byte)-52);
   }

   @ObfuscatedSignature(descriptor = "(I)Ldd;")
   @ObfuscatedName("vd")
   public WorldView method2969(int var1) {
      return method2901(this, var1, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(IIIILjn;)Ldd;")
   @ObfuscatedName("ao")
   WorldView method2890(int var1, int var2, int var3, int var4, TileRenderMode var5) {
      WorldView var6 = new WorldView(var1, var2, var3, var4, var5);
      this.worldViews.put((Node)var6, (long)var1);
      this.field1223 += -543696247;
      return var6;
   }

   @ObfuscatedSignature(descriptor = "()Ldd;")
   @ObfuscatedName("bj")
   public WorldView method2970() {
      return method2910(this, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(I)Luf;")
   @ObfuscatedName("co")
   class524 method2950(int var1) {
      class524 var2 = (class524)this.field1224.get(var1);
      return null != var2 ? var2 : this.field1230;
   }

   @ObfuscatedSignature(descriptor = "(Luv;Luf;)V")
   @ObfuscatedName("bx")
   void method2934(ClickAction var1, class524 var2) {
      this.field1231 = var1;
      this.field1230 = var2;
   }

   @ObfuscatedSignature(descriptor = "(I)Luv;")
   @ObfuscatedName("ck")
   ClickAction method2944(int var1) {
      ClickAction var2 = (ClickAction)this.field1225.get(var1);
      return null != var2 ? var2 : this.field1231;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Iterator;")
   @ObfuscatedName("cd")
   public Iterator method2954() {
      return this.worldViews.iterator();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcv;I)Lts;")
   @ObfuscatedName("ee")
   public static WorldEntity method2921(WorldViewManager var0, int var1) {
      return var0 == null ? var0.method2925(var1) : (WorldEntity)var0.method2905((byte)-4).worldEntities.get((long)var1);
   }

   @ObfuscatedSignature(descriptor = "(Ldd;)V")
   @ObfuscatedName("az")
   public void method2964(WorldView var1) {
      if (var1 != null) {
         if (var1.field1335 != null) {
            SecureUrlRequester.client.getCallbacks().post(new WorldViewUnloaded(var1));
         }

         if (client.field1025 != null) {
            client.field1025.despawnWorldView(var1);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcv;IIIILjn;)Ldd;")
   @ObfuscatedName("cr")
   public static WorldView method2891(WorldViewManager var0, int var1, int var2, int var3, int var4, TileRenderMode var5) {
      if (var0 == null) {
         var0.method2915();
      }

      WorldView var6 = new WorldView(var1, var2, var3, var4, var5);
      var0.worldViews.put((Node)var6, (long)var1);
      var0.field1223 += -543696247;
      return var6;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cz")
   void method2956() {
      for (WorldView var2 : this.worldViews) {
         method2896(this, var2, (short)-29950);
      }

      this.worldViews.clear();
      this.field1223 = 0;
      this.field1225.clear();
      this.field1224.clear();
      this.field1231 = ClickAction.field6119;
      this.field1230 = class524.field6036;
      if (null != this.worldView) {
         this.worldView.method3067(-349751776);
         this.worldViews.put((Node)this.worldView, -1L);
         this.field1223 = -673300667;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcv;B)Ldd;")
   @ObfuscatedName("iu")
   public static WorldView method2910(WorldViewManager var0, byte var1) {
      if (var0 == null) {
         return var0.getWorldView(var1);
      } else {
         try {
            return method2901(var0, client.currentWorldViewId * 1201323213, (byte)1);
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "cv.ak(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ci")
   void method2957() {
      for (WorldView var2 : this.worldViews) {
         method2896(this, var2, (short)-2799);
      }

      this.worldViews.clear();
      this.field1223 = 0;
      this.field1225.clear();
      this.field1224.clear();
      this.field1231 = ClickAction.field6119;
      this.field1230 = class524.field6036;
      if (null != this.worldView) {
         this.worldView.method3067(211875713);
         this.worldViews.put((Node)this.worldView, -1L);
         this.field1223 = -543696247;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cf")
   void method2958() {
      for (WorldView var2 : this.worldViews) {
         method2896(this, var2, (short)-26595);
      }

      this.worldViews.clear();
      this.field1223 = 0;
      this.field1225.clear();
      this.field1224.clear();
      this.field1231 = ClickAction.field6119;
      this.field1230 = class524.field6036;
      if (null != this.worldView) {
         this.worldView.method3067(-1022609305);
         this.worldViews.put((Node)this.worldView, -1L);
         this.field1223 = -543696247;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ag")
   public static void method2892(byte var0) {
      try {
         DbRowType.DBRowType_cache.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "cv.ag(" + ')');
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // $VF: Could not properly define all variable types!
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "(Lcg;Lcu;III)V")
   @ObfuscatedName("ag")
   static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3, int var4) {
      client.method2065(var1);
      if (SecureUrlRequester.client.field954 > var2) {
         var2 = SecureUrlRequester.client.field954;
      }

      if (var3 > 0 && SecureUrlRequester.client.field991 > var3) {
         var3 = SecureUrlRequester.client.field991;
      }

      int var7 = var3;
      int var6 = var2;
      Script var5 = var1;
      ScriptEvent var31 = var0;
      int var8 = 1369353301;

      try {
         Object[] var9 = var31.args;
         class408.Interpreter_intStackSize = 0;
         SecureRandomFuture.Interpreter_objectStackSize = 0;
         client.field990 = -1;
         int var10 = -1;
         int[] var11 = var5.opcodes;
         int[] var12 = var5.intOperands;
         int var13 = -1;
         Interpreter.Interpreter_frameDepth = 0;
         Interpreter.field345 = false;
         boolean var14 = false;
         Interpreter.field339 = 0;
         boolean var27 = false /* VF: Semaphore variable */;

         label1218: {
            label1219: {
               try {
                  label1177: {
                     var27 = true;
                     class251.Interpreter_intLocals = new int[var5.localIntCount * -58237571];
                     int var32 = 0;
                     Interpreter.Interpreter_objectLocals = new Object[-14880459 * var5.localStringCount];
                     int var33 = 0;

                     for (int var34 = 1; var34 < var9.length; var34++) {
                        if (var8 <= -1065385178) {
                           throw new IllegalStateException();
                        }

                        if (var9[var34] instanceof Integer) {
                           if (var8 <= -1065385178) {
                              throw new IllegalStateException();
                           }

                           int var18 = (Integer)var9[var34];
                           if (-2147483647 == var18) {
                              var18 = var31.mouseX * -1567081689;
                           }

                           if (-2147483646 == var18) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              var18 = var31.mouseY * -1332622121;
                           }

                           if (-2147483645 == var18) {
                              if (var8 <= -1065385178) {
                                 var27 = false;
                                 return;
                              }

                              var18 = null != var31.widget ? 278777747 * var31.widget.id : -1;
                           }

                           if (var18 == -2147483644) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              var18 = var31.opIndex * 2029362027;
                           }

                           if (var18 == -2147483643) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              int var10000;
                              if (null != var31.widget) {
                                 if (var8 <= -1065385178) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = var31.widget.childIndex * 2077538819;
                              } else {
                                 var10000 = -1;
                              }

                              var18 = var10000;
                           }

                           if (-2147483642 == var18) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              int var79;
                              if (null != var31.dragTarget) {
                                 if (var8 <= -1065385178) {
                                    var27 = false;
                                    return;
                                 }

                                 var79 = 278777747 * var31.dragTarget.id;
                              } else {
                                 var79 = -1;
                              }

                              var18 = var79;
                           }

                           if (-2147483641 == var18) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              var18 = var31.dragTarget != null ? 2077538819 * var31.dragTarget.childIndex : -1;
                           }

                           if (-2147483640 == var18) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              var18 = var31.keyTyped * 1798396775;
                           }

                           if (-2147483639 == var18) {
                              if (var8 <= -1065385178) {
                                 var27 = false;
                                 return;
                              }

                              var18 = 837595959 * var31.keyPressed;
                           }

                           if (var18 == -2147483638) {
                              if (var8 <= -1065385178) {
                                 var27 = false;
                                 return;
                              }

                              var18 = 715272521 * var31.field525;
                           }

                           class251.Interpreter_intLocals[var32++] = var18;
                        } else if (var9[var34] instanceof String) {
                           if (var8 <= -1065385178) {
                              var27 = false;
                              return;
                           }

                           String var51 = (String)var9[var34];
                           if (var51.equals("event_opbase")) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              var51 = var31.targetName;
                           }

                           Interpreter.Interpreter_objectLocals[var33++] = var51;
                        } else if (var9[var34] instanceof DynamicArray) {
                           if (var8 <= -1065385178) {
                              throw new IllegalStateException();
                           }

                           Interpreter.Interpreter_objectLocals[var33++] = var9[var34];
                        }
                     }

                     Interpreter.field335 = -1821970675 * var31.field530;

                     while (true) {
                        Interpreter.field339 += 1177210717;
                        if (-2113340171 * Interpreter.field339 > var6) {
                           if (var8 <= -1065385178) {
                              throw new IllegalStateException();
                           }

                           throw new RuntimeException();
                        }

                        do {
                           client.field990 = ++var10;
                           var13 = var11[var10];
                        } while (client.method2510(var13));

                        if (var13 < 100) {
                           if (0 == var13) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var12[var10];
                           } else if (1 == var13) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              int var50 = var12[var10];
                              Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Varps.Varps_main[var50];
                           } else if (2 == var13) {
                              int var49 = var12[var10];
                              Varps.Varps_main[var49] = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                              client.method2414(var49);
                              Huffman.changeGameOptions(var49, 1382603152);
                           } else if (var13 == 3) {
                              Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var5.stringOperands[var10];
                           } else if (var13 == 6) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              var10 = client.field990 = var10 + var12[var10];
                           } else if (var13 == 7) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              class408.Interpreter_intStackSize -= 708726074;
                              if (Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1]
                                 != Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize]) {
                                 if (var8 <= -1065385178) {
                                    throw new IllegalStateException();
                                 }

                                 var10 = client.field990 = var10 + var12[var10];
                              }
                           } else if (var13 == 8) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              class408.Interpreter_intStackSize -= 708726074;
                              if (Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize]
                                 == Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize]) {
                                 if (var8 <= -1065385178) {
                                    throw new IllegalStateException();
                                 }

                                 var10 = client.field990 = var10 + var12[var10];
                              }
                           } else if (var13 == 9) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              class408.Interpreter_intStackSize -= 708726074;
                              if (Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize]
                                 < Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1]) {
                                 if (var8 <= -1065385178) {
                                    throw new IllegalStateException();
                                 }

                                 var10 = client.field990 = var10 + var12[var10];
                              }
                           } else if (var13 == 10) {
                              class408.Interpreter_intStackSize -= 708726074;
                              if (Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789]
                                 > Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789]) {
                                 if (var8 <= -1065385178) {
                                    throw new IllegalStateException();
                                 }

                                 var10 = client.field990 = var10 + var12[var10];
                              }
                           } else if (21 == var13) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              if (Interpreter.Interpreter_frameDepth * -444245115 == 0) {
                                 if (var8 <= -1065385178) {
                                    throw new IllegalStateException();
                                 }

                                 var27 = false;
                                 break label1219;
                              }

                              ScriptFrame var47 = Interpreter.Interpreter_frames[(Interpreter.Interpreter_frameDepth -= -383228595) * -444245115];
                              Script var81 = var47.script;
                              client.method2065(var47.script);
                              var5 = var81;
                              var11 = var5.opcodes;
                              var12 = var5.intOperands;
                              var10 = client.field990 = 1078296483 * var47.pc;
                              class251.Interpreter_intLocals = var47.intLocals;
                              Interpreter.Interpreter_objectLocals = var47.stringLocals;
                           } else if (25 == var13) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              int var46 = var12[var10];
                              Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WorldMapData_1.getVarbit(
                                 var46, 57654654
                              );
                           } else if (var13 == 27) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              int var45 = var12[var10];
                              VarbitComposition.method4905(
                                 var45, Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -1953320624
                              );
                           } else if (31 == var13) {
                              if (var8 <= -1065385178) {
                                 var27 = false;
                                 return;
                              }

                              class408.Interpreter_intStackSize -= 708726074;
                              if (Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize]
                                 <= Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1]) {
                                 if (var8 <= -1065385178) {
                                    throw new IllegalStateException();
                                 }

                                 var10 = client.field990 = var10 + var12[var10];
                              }
                           } else if (var13 == 32) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              class408.Interpreter_intStackSize -= 708726074;
                              if (Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789]
                                 >= Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1]) {
                                 if (var8 <= -1065385178) {
                                    throw new IllegalStateException();
                                 }

                                 var10 = client.field990 = var10 + var12[var10];
                              }
                           } else if (var13 == 33) {
                              if (var8 <= -1065385178) {
                                 var27 = false;
                                 return;
                              }

                              Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class251.Interpreter_intLocals[var12[var10]];
                           } else if (var13 == 34) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              class251.Interpreter_intLocals[var12[var10]] = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611)
                                 * 327716789];
                           } else if (var13 == 35) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = Interpreter.Interpreter_objectLocals[var12[var10]];
                           } else if (var13 == 36) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              Interpreter.Interpreter_objectLocals[var12[var10]] = Interpreter.Interpreter_objectStack[(
                                    SecureRandomFuture.Interpreter_objectStackSize -= 831964661
                                 )
                                 * -1595015587];
                           } else if (37 == var13) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              int var44 = var12[var10];
                              SecureRandomFuture.Interpreter_objectStackSize -= var44 * 831964661;
                              String var59 = WorldMapData_0.method7117(
                                 Interpreter.Interpreter_objectStack, -1595015587 * SecureRandomFuture.Interpreter_objectStackSize, var44, -633285200
                              );
                              Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var59;
                           } else if (var13 == 38) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              class408.Interpreter_intStackSize -= -1793120611;
                           } else if (var13 == 39) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              SecureRandomFuture.Interpreter_objectStackSize -= 831964661;
                           } else if (var13 == 40) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              if (-444245115 * Interpreter.Interpreter_frameDepth == 50) {
                                 if (var8 > -1065385178) {
                                    throw new RuntimeException();
                                 }

                                 var27 = false;
                                 return;
                              }

                              int var43 = var12[var10];
                              Script var58 = class383.getScript(var43, 813758522);
                              int[] var61 = new int[-58237571 * var58.localIntCount];
                              Object[] var20 = new Object[-14880459 * var58.localStringCount];
                              if (var58.intArgumentCount * -968069229 >= 0) {
                                 if (var8 <= -1065385178) {
                                    var27 = false;
                                    return;
                                 }

                                 System.arraycopy(
                                    Interpreter.Interpreter_intStack,
                                    0 + (327716789 * class408.Interpreter_intStackSize - var58.intArgumentCount * -968069229),
                                    var61,
                                    0,
                                    -968069229 * var58.intArgumentCount
                                 );
                              }

                              if (-1480905639 * var58.stringArgumentCount >= 0) {
                                 if (var8 <= -1065385178) {
                                    throw new IllegalStateException();
                                 }

                                 System.arraycopy(
                                    Interpreter.Interpreter_objectStack,
                                    -1595015587 * SecureRandomFuture.Interpreter_objectStackSize - -1480905639 * var58.stringArgumentCount + 0,
                                    var20,
                                    0,
                                    -1480905639 * var58.stringArgumentCount
                                 );
                              }

                              class408.Interpreter_intStackSize = class408.Interpreter_intStackSize - 121454375 * var58.intArgumentCount;
                              SecureRandomFuture.Interpreter_objectStackSize = SecureRandomFuture.Interpreter_objectStackSize
                                 - -1805128147 * var58.stringArgumentCount;
                              ScriptFrame var21 = new ScriptFrame();
                              var21.script = var5;
                              var21.pc = 1406577675 * var10;
                              var21.intLocals = class251.Interpreter_intLocals;
                              var21.stringLocals = Interpreter.Interpreter_objectLocals;
                              Interpreter.Interpreter_frames[(Interpreter.Interpreter_frameDepth += -383228595) * -444245115 - 1] = var21;
                              client.method2065(var58);
                              var5 = var58;
                              var11 = var58.opcodes;
                              var12 = var58.intOperands;
                              client.field990 = -1;
                              var10 = -1;
                              class251.Interpreter_intLocals = var61;
                              Interpreter.Interpreter_objectLocals = var20;
                           } else if (var13 == 42) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class166.varcs
                                 .getInt(var12[var10], (byte)1);
                           } else if (var13 == 43) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              Varcs.method3128(
                                 class166.varcs,
                                 var12[var10],
                                 Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789],
                                 -85340123
                              );
                           } else if (var13 == 44) {
                              int var42 = var12[var10] >> 16;
                              int var57 = var12[var10] & 65535;
                              int var60 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                              if (var60 < 0) {
                                 break;
                              }

                              if (var8 <= -1065385178) {
                                 var27 = false;
                                 return;
                              }

                              if (var60 > 5000) {
                                 break;
                              }

                              if (var57 == 115) {
                                 if (var8 <= -1065385178) {
                                    throw new IllegalStateException();
                                 }

                                 Interpreter.Interpreter_objectLocals[var42] = new DynamicArray(class586.field6379, "", var60, var60);
                              } else {
                                 if (105 != var57) {
                                    if (var8 <= -1065385178) {
                                       throw new IllegalStateException();
                                    }

                                    if (var57 != 49) {
                                       Interpreter.Interpreter_objectLocals[var42] = new DynamicArray(class586.field6376, -1, var60, var60);
                                       continue;
                                    }
                                 }

                                 Interpreter.Interpreter_objectLocals[var42] = new DynamicArray(class586.field6376, 0, var60, var60);
                              }
                           } else if (45 == var13) {
                              if (var8 <= -1065385178) {
                                 var27 = false;
                                 return;
                              }

                              DynamicArray var36 = class66.method1387(var12[var10], Interpreter.Interpreter_objectLocals[var12[var10]], -1272469458);
                              int var53 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                              class31.method666(var36, var53, 609313415);
                              if (var36.field6107 == class586.field6376) {
                                 if (var8 <= -1065385178) {
                                    var27 = false;
                                    return;
                                 }

                                 Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var36.method11207(
                                    2053374425
                                 )[var53];
                              } else {
                                 Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var36.method11214(
                                    (byte)-44
                                 )[var53];
                              }
                           } else if (var13 == 46) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              DynamicArray var37 = class66.method1387(var12[var10], Interpreter.Interpreter_objectLocals[var12[var10]], 405832279);
                              if (!var37.field6109) {
                                 throw new RuntimeException();
                              }

                              if (var37.field6107 == class586.field6376) {
                                 if (var8 <= -1065385178) {
                                    throw new IllegalStateException();
                                 }

                                 class408.Interpreter_intStackSize -= 708726074;
                                 int var54 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
                                 class31.method666(var37, var54, -1148002626);
                                 var37.method11207(2053374425)[var54] = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
                              } else {
                                 int var55 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                                 class31.method666(var37, var55, 1300462998);
                                 var37.method11214((byte)50)[var55] = Interpreter.Interpreter_objectStack[(
                                       SecureRandomFuture.Interpreter_objectStackSize -= 831964661
                                    )
                                    * -1595015587];
                              }
                           } else if (49 == var13) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              String var38 = class166.varcs.getString(var12[var10], (byte)43);
                              Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var38;
                           } else if (var13 == 50) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              class166.varcs
                                 .setString(
                                    var12[var10],
                                    (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587],
                                    2043045110
                                 );
                           } else if (60 == var13) {
                              IterableNodeHashTable var39 = var5.switches[var12[var10]];
                              IntegerNode var56 = (IntegerNode)var39.get(
                                 (long)Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]
                              );
                              if (null != var56) {
                                 var10 = client.field990 = var10 + var56.integer;
                              }
                           } else if (63 == var13) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = null;
                           } else if (var13 == 74) {
                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              Integer var40 = FontName.field6342.getTitleGroupValue(var12[var10], (byte)4);
                              if (var40 == null) {
                                 Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                              } else {
                                 Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var40;
                              }
                           } else {
                              if (76 != var13) {
                                 throw new IllegalStateException();
                              }

                              if (var8 <= -1065385178) {
                                 throw new IllegalStateException();
                              }

                              Integer var41 = class4.field14.method11181(var12[var10], (byte)3);
                              if (null == var41) {
                                 if (var8 <= -1065385178) {
                                    throw new IllegalStateException();
                                 }

                                 Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                              } else {
                                 Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var41;
                              }
                           }
                        } else {
                           boolean var80;
                           if (var5.intOperands[var10] == 1) {
                              if (var8 <= -1065385178) {
                                 var27 = false;
                                 return;
                              }

                              var80 = true;
                           } else {
                              var80 = false;
                           }

                           boolean var35 = var80;
                           int var52 = FontName.method11651(var13, var5, var35, -739147715);
                           switch (var52) {
                              case 0:
                                 var27 = false;
                                 break label1177;
                              case 1:
                              default:
                                 break;
                              case 2:
                                 throw new IllegalStateException();
                           }
                        }
                     }

                     throw new RuntimeException();
                  }
               } catch (Exception var28) {
                  var14 = true;
                  StringBuilder var16 = new StringBuilder(30);
                  var16.append("").append(var5.key).append(" ");

                  for (int var17 = Interpreter.Interpreter_frameDepth * -444245115 - 1; var17 >= 0; var17--) {
                     var16.append("").append(Interpreter.Interpreter_frames[var17].script.key).append(" ");
                  }

                  var16.append("").append(var13);
                  PlayerType.RunException_sendStackTrace(var16.toString(), var28, -679809919);
                  var27 = false;
                  break label1218;
               } finally {
                  if (var27) {
                     while (!Interpreter.field344.isEmpty()) {
                        classDY var23 = (classDY)Interpreter.field344.remove(0);
                        FontName.widgetDefaultMenuAction(
                           var23.method3597(178472165), var23.method3600((byte)-6), var23.method3601((short)2489), var23.method3605((byte)0), "", -1376442236
                        );
                     }

                     if (Interpreter.field345) {
                        if (var8 <= -1065385178) {
                           return;
                        }

                        Interpreter.field345 = false;
                        Login.method1274((byte)1);
                     }

                     <unknown> var22;
                     if (var14) {
                        throw var22_3;
                     }

                     if (var8 > -1065385178) {
                        if (var7 > 0) {
                           if (var8 <= -1065385178) {
                              throw new IllegalStateException();
                           }

                           if (-2113340171 * Interpreter.field339 >= var7) {
                              PlayerType.RunException_sendStackTrace(
                                 "Warning: Script " + var5.field1216 + " finished at op count " + Interpreter.field339 * -2113340171 + " of max " + var6,
                                 null,
                                 1636577756
                              );
                              throw var22_2;
                           }
                        }

                        throw var22_1;
                     }

                     return;
                  }
               }

               while (!Interpreter.field344.isEmpty()) {
                  if (var8 <= -1065385178) {
                     throw new IllegalStateException();
                  }

                  classDY var19 = (classDY)Interpreter.field344.remove(0);
                  FontName.widgetDefaultMenuAction(
                     var19.method3597(1194864666), var19.method3600((byte)-99), var19.method3601((short)-17166), var19.method3605((byte)0), "", -1376442236
                  );
               }

               if (Interpreter.field345) {
                  if (var8 <= -1065385178) {
                     return;
                  }

                  Interpreter.field345 = false;
                  Login.method1274((byte)1);
               }

               if (!var14) {
                  if (var8 <= -1065385178) {
                     throw new IllegalStateException();
                  }

                  if (var7 > 0 && -2113340171 * Interpreter.field339 >= var7) {
                     PlayerType.RunException_sendStackTrace(
                        "Warning: Script " + var5.field1216 + " finished at op count " + Interpreter.field339 * -2113340171 + " of max " + var6,
                        null,
                        -1834931732
                     );
                     return;
                  }
               }

               return;
            }

            while (!Interpreter.field344.isEmpty()) {
               if (var8 <= -1065385178) {
                  throw new IllegalStateException();
               }

               classDY var48 = (classDY)Interpreter.field344.remove(0);
               FontName.widgetDefaultMenuAction(
                  var48.method3597(1475725227), var48.method3600((byte)-125), var48.method3601((short)12376), var48.method3605((byte)0), "", -1376442236
               );
            }

            if (Interpreter.field345) {
               Interpreter.field345 = false;
               Login.method1274((byte)1);
            }

            if (!var14 && var7 > 0 && var8 > -1065385178 && -2113340171 * Interpreter.field339 >= var7 && var8 > -1065385178) {
               PlayerType.RunException_sendStackTrace(
                  "Warning: Script " + var5.field1216 + " finished at op count " + Interpreter.field339 * -2113340171 + " of max " + var6, null, 207697101
               );
            }

            return;
         }

         while (!Interpreter.field344.isEmpty()) {
            if (var8 <= -1065385178) {
               throw new IllegalStateException();
            }

            classDY var15 = (classDY)Interpreter.field344.remove(0);
            FontName.widgetDefaultMenuAction(
               var15.method3597(1035068615), var15.method3600((byte)-95), var15.method3601((short)-7628), var15.method3605((byte)0), "", -1376442236
            );
         }

         if (Interpreter.field345) {
            if (var8 <= -1065385178) {
               throw new IllegalStateException();
            }

            Interpreter.field345 = false;
            Login.method1274((byte)1);
         }

         if (!var14) {
            if (var8 <= -1065385178) {
               throw new IllegalStateException();
            }

            if (var7 > 0 && -2113340171 * Interpreter.field339 >= var7) {
               if (var8 <= -1065385178) {
                  throw new IllegalStateException();
               }

               PlayerType.RunException_sendStackTrace(
                  "Warning: Script " + var5.field1216 + " finished at op count " + Interpreter.field339 * -2113340171 + " of max " + var6, null, -432967498
               );
            }
         }
      } catch (RuntimeException var30) {
         throw RestClientThreadFactory.newRunException(var30, "cv.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcv;II)Luv;")
   @ObfuscatedName("oy")
   public static ClickAction method2945(WorldViewManager var0, int var1, int var2) {
      if (var0 == null) {
         var0.getClickAction(var1, var1);
      }

      try {
         ClickAction var3 = (ClickAction)var0.field1225.get(var1);
         ClickAction var10000;
         if (null != var3) {
            if (var2 <= -574452591) {
               throw new IllegalStateException();
            }

            var10000 = var3;
         } else {
            var10000 = var0.field1231;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cv.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ldd;")
   @ObfuscatedName("zs")
   public WorldView method2971(int var1, int var2) {
      return method2912(this, var1, var2, -896670169);
   }

   @ObfuscatedSignature(descriptor = "(III)Ldd;")
   @ObfuscatedName("aw")
   WorldView getWorldViewFromWorldPoint(int var1, int var2, int var3) {
      try {
         Iterator var4 = this.iterator();

         while (var4.hasNext()) {
            if (var3 == -159808370) {
               throw new IllegalStateException();
            }

            WorldView var5 = (WorldView)var4.next();
            if (577964535 * var5.field1331 != -1) {
               int var6 = 825809917 * var5.baseY;
               int var7 = var5.baseX * 1279964673;
               int var8 = var6 + var5.plane * 2010544793;
               int var9 = var7 + 1823353167 * var5.id;
               if (var1 >= var6) {
                  if (var3 == -159808370) {
                     throw new IllegalStateException();
                  }

                  if (var2 >= var7) {
                     if (var3 == -159808370) {
                        throw new IllegalStateException();
                     }

                     if (var1 < var8) {
                        if (var3 == -159808370) {
                           throw new IllegalStateException();
                        }

                        if (var2 < var9) {
                           if (var3 == -159808370) {
                              throw new IllegalStateException();
                           }

                           return var5;
                        }
                     }
                  }
               }
            }
         }

         return this.worldView;
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "cv.aw(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcv;I)Luf;")
   @ObfuscatedName("nr")
   public static class524 method2951(WorldViewManager var0, int var1) {
      class524 var2 = (class524)var0.field1224.get(var1);
      return null != var2 ? var2 : var0.field1230;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcv;I)Ldd;")
   @ObfuscatedName("uf")
   public static WorldView method2903(WorldViewManager var0, int var1) {
      return (WorldView)var0.worldViews.get((long)var1);
   }

   @ObfuscatedSignature(descriptor = "(Ldd;S)V")
   @ObfuscatedName("an")
   void removeWorldView(WorldView var1, short var2) {
      this.method2964(var1);

      try {
         if (null != var1) {
            if (var2 >= 128) {
               throw new IllegalStateException();
            }

            this.field1224.remove(var1.plane * 577964535);
            this.field1225.remove(577964535 * var1.field1331);
            var1.method3084((byte)8);
            var1.vmethod138();
            this.field1223 -= -543696247;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cv.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ad")
   int method2930(int var1) {
      try {
         return 492420025 * this.field1223;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cv.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ldd;")
   @ObfuscatedName("ak")
   WorldView getWorldView(byte var1) {
      try {
         return method2901(this, client.graphicsCycle * 1201323213, (byte)1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cv.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("sq")
   public void method2960(int var1) {
      WorldView var2 = this.method2969(var1);
      if (var2 != null) {
         Callbacks var3 = SecureUrlRequester.client.getCallbacks();

         for (NPC var5 : var2.npcs()) {
            var3.post(new NpcDespawned(var5));
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Luv;Luf;I)V")
   @ObfuscatedName("ai")
   void method2935(ClickAction var1, class524 var2, int var3) {
      try {
         this.field1231 = var1;
         this.field1230 = var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cv.ai(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltt;Ltt;)I")
   @ObfuscatedName("mf")
   public static int method2883(class499 var0, class499 var1) {
      if (-2975702961368216467L * var0.field5980 < var1.field5980 * -2975702961368216467L) {
         return -1;
      } else {
         return var0.field5980 * -2975702961368216467L > var1.field5980 * -2975702961368216467L ? 1 : 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Luv;")
   @ObfuscatedName("ab")
   ClickAction getClickAction(int var1, int var2) {
      try {
         ClickAction var3 = (ClickAction)this.field1225.get(var1);
         ClickAction var10000;
         if (null != var3) {
            if (var2 <= -574452591) {
               throw new IllegalStateException();
            }

            var10000 = var3;
         } else {
            var10000 = this.field1231;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cv.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Ldd;")
   @ObfuscatedName("ae")
   public WorldView getWorldView(int var1, byte var2) {
      try {
         return (WorldView)this.worldViews.get((long)var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cv.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lts;")
   @ObfuscatedName("au")
   WorldEntity method2925(int var1) {
      try {
         return (WorldEntity)this.method2905((byte)-26).worldEntities.get((long)(client.overheadTextCount * 1201323213));
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cv.au(" + ')');
      }
   }
}
