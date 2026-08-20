import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bl")
public final class GraphicsObject extends Renderable implements net.runelite.api.GraphicsObject {
   @ObfuscatedName("at")
   int cycleStart;
   @ObfuscatedName("ag")
   int plane;
   @ObfuscatedSignature(descriptor = "Ldd;")
   @ObfuscatedName("av")
   final WorldView worldView;
   @ObfuscatedName("an")
   int x;
   @ObfuscatedName("ae")
   int y;
   @ObfuscatedName("aj")
   int z;
   @ObfuscatedSignature(descriptor = "Lsj;")
   @ObfuscatedName("aw")
   final AnimationSequence animationSequence;
   @ObfuscatedName("ak")
   int id;
   @ObfuscatedName("gw")
   static int field223;
   @ToRemove(unused = "true")
   @ObfuscatedName("ds")
   static final boolean field225 = false;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field222 = 60;
   @ObfuscatedName("lu")
   static int cameraPitch;

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("at")
   final void advance(int var1, int var2) {
      this.method678(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   final void method674(int var1) {
      if (!method672(this, -820252705)) {
         client.field900.method11638(this.worldView, this.x * -1678897417, 297135035 * this.y, false, 133741999);
         int var2 = GrandExchangeOfferUnitPriceComparator.method8832(this.animationSequence, var1, client.field900, (byte)8);
         classVW.method11640(client.field900, (byte)-36);
         if ((var2 & 1) != 0) {
            this.animationSequence.reset(555865078);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("fx")
   public Model method682() {
      GraphicsObject var1 = this;
      int var2 = 566725961;

      try {
         Model var10000;
         if (AnimationSequence.method10341(var1.animationSequence, 30, -1002405506)) {
            if (var2 == 340712311) {
               throw new IllegalStateException();
            }

            var1 = null;
            var10000 = var1;
         } else {
            SpotAnimationDefinition var3 = class181.SpotAnimationDefinition_get(265510711 * var1.id, 263788800);
            Model var4 = SpotAnimationDefinition.method4613(var3, var1.animationSequence.getFrame(-609025707), 1024988090);
            if (null == var4) {
               if (var2 == 340712311) {
                  throw new IllegalStateException();
               }

               var1 = null;
               var10000 = var1;
            } else {
               var10000 = var4;
            }
         }

         return var10000;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "bl.ag(" + ')');
      }
   }

   public int getAnimationFrame() {
      return this.animationSequence.frame * 1756992279;
   }

   @ObfuscatedSignature(descriptor = "(I)Lky;")
   @ObfuscatedName("ag")
   @Override
   protected final Model getModel(int var1) {
      return this.method682();
   }

   public int getZ() {
      return this.z * 480104681;
   }

   public int getId() {
      return this.id * 265510711;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ig")
   public int method684() {
      return this.x * -1678897417;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("re")
   public void method685(int var1) {
      this.x = var1 * 537072327;
   }

   @ObfuscatedSignature(descriptor = "(IB)Lwu;")
   @ObfuscatedName("pu")
   static DbTable getDbTable(int var0, byte var1) {
      try {
         DbTable var2 = (DbTable)class402.method8806(client.DBTableIndex_cache, var0);
         if (null == var2) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            var2 = new DbTable(class136.field1858, Buddy.method10784(var0, 401476376), class236.method5960(var0, (byte)-47));
            client.DBTableIndex_cache.put(var2, var0);
         }

         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bl.pu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   @Override
   protected int getAnimationHeightOffset(int var1) {
      try {
         return AnimationSequence.method10315(this.animationSequence, -831296794)
            ? AnimationSequence.method10318(this.animationSequence, 662072875).animationHeightOffset * 89078819
            : 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bl.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aj")
   boolean method671() {
      return !AnimationSequence.method10315(this.animationSequence, -831296794);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   @Override
   protected boolean vmethod50() {
      if (AnimationSequence.method10315(this.animationSequence, -831296794)
         && AnimationSequence.method10318(this.animationSequence, 174122884).method5224(this.animationSequence.getFrame(-609025707), -956276494)) {
         return true;
      } else {
         SpotAnimationDefinition var1 = class181.SpotAnimationDefinition_get(265510711 * this.id, 1588484170);
         Model var2 = var1.method4617((byte)36);
         return var2 != null && var2.faceAlphas != null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("an")
   @Override
   protected boolean vmethod51(int var1) {
      try {
         if (AnimationSequence.method10315(this.animationSequence, -831296794)) {
            if (var1 != -1841545705) {
               throw new IllegalStateException();
            }

            if (AnimationSequence.method10318(this.animationSequence, 182668962).method5224(this.animationSequence.getFrame(-609025707), 86176398)) {
               if (var1 != -1841545705) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         SpotAnimationDefinition var2 = class181.SpotAnimationDefinition_get(265510711 * this.id, -822067230);
         Model var3 = var2.method4617((byte)13);
         if (var3 != null) {
            if (var1 != -1841545705) {
               throw new IllegalStateException();
            }

            if (var3.faceAlphas != null) {
               if (var1 != -1841545705) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bl.an(" + ')');
      }
   }

   public int getStartCycle() {
      return this.cycleStart * 51530303;
   }

   GraphicsObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.animationSequence = new AnimationSequence();
      this.worldView = var1;
      this.id = 517899911 * var2;
      this.plane = -2131840415 * var3;
      this.x = var4 * 537072327;
      this.y = var5 * -1620303501;
      this.z = 1972111193 * var6;
      this.cycleStart = 880846271 * (var7 + var8);
      AnimationSequence.method10313(
         this.animationSequence, class181.SpotAnimationDefinition_get(265510711 * this.id, 286277246).sequence * -508160903, 409345438
      );
      this.method680();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   @Override
   protected int vmethod54() {
      return AnimationSequence.method10315(this.animationSequence, -831296794)
         ? AnimationSequence.method10318(this.animationSequence, -2087161133).animationHeightOffset * 89078819
         : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   @Override
   protected int vmethod55() {
      return AnimationSequence.method10315(this.animationSequence, -831296794)
         ? AnimationSequence.method10318(this.animationSequence, -1810853252).animationHeightOffset * 336035770
         : 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("vw")
   public int method686() {
      return this.y * 297135035;
   }

   @ObfuscatedSignature(descriptor = "()Ldd;")
   @ObfuscatedName("tl")
   public WorldView method687() {
      return this.worldView;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("az")
   @Override
   protected int vmethod56() {
      return AnimationSequence.method10315(this.animationSequence, -831296794)
         ? AnimationSequence.method10318(this.animationSequence, 1676041553).animationHeightOffset * 1186756494
         : 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("yy")
   public void method678(int var1) {
      int var3 = var1;
      GraphicsObject var2 = this;
      int var4 = -648834334;

      try {
         if (!method672(var2, 1457016764)) {
            client.field900.method11638(var2.worldView, var2.x * -1678897417, 297135035 * var2.y, false, 133741999);
            int var5 = GrandExchangeOfferUnitPriceComparator.method8832(var2.animationSequence, var3, client.field900, (byte)32);
            classVW.method11640(client.field900, (byte)-69);
            if ((var5 & 1) != 0 && var4 != 695239666) {
               var2.animationSequence.reset(-657553505);
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "bl.at(" + ')');
      }
   }

   public LocalPoint getLocation() {
      return new LocalPoint(this.method684(), this.method686(), this.worldView);
   }

   public void setFinished(boolean var1) {
      if (!var1) {
         throw new UnsupportedOperationException();
      } else {
         this.animationSequence.method10362();
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   @Override
   protected int vmethod57() {
      return AnimationSequence.method10315(this.animationSequence, -831296794)
         ? AnimationSequence.method10318(this.animationSequence, 775122874).animationHeightOffset * 89078819
         : 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   @Override
   protected boolean vmethod52() {
      if (AnimationSequence.method10315(this.animationSequence, -831296794)
         && AnimationSequence.method10318(this.animationSequence, 294174252).method5224(this.animationSequence.getFrame(-609025707), 1421872013)) {
         return true;
      } else {
         SpotAnimationDefinition var1 = class181.SpotAnimationDefinition_get(265510711 * this.id, 1270598921);
         Model var2 = var1.method4617((byte)118);
         return var2 != null && var2.faceAlphas != null;
      }
   }

   public int getLevel() {
      return this.plane * 423981473;
   }

   @ObfuscatedSignature(descriptor = "(Lbl;I)Z")
   @ObfuscatedName("gn")
   public static boolean method672(GraphicsObject var0, int var1) {
      if (var0 == null) {
         var0.method673(var1);
      }

      try {
         boolean var10000;
         if (!AnimationSequence.method10315(var0.animationSequence, -831296794)) {
            if (var1 == -1427369953) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bl.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Liw;")
   @ObfuscatedName("ys")
   public SequenceDefinition method683() {
      return this.animationSequence.sequenceDefinition;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   final void method675(int var1) {
      if (!method672(this, -1501750103)) {
         client.field900.method11638(this.worldView, this.x * -1678897417, 297135035 * this.y, false, 133741999);
         int var2 = GrandExchangeOfferUnitPriceComparator.method8832(this.animationSequence, var1, client.field900, (byte)81);
         classVW.method11640(client.field900, (byte)-108);
         if ((var2 & 1) != 0) {
            this.animationSequence.reset(-1196380111);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("nc")
   public void method680() {
      GraphicsObjectCreated var1 = new GraphicsObjectCreated(this);
      SecureUrlRequester.client.getCallbacks().post(var1);
   }

   public boolean finished() {
      return this.animationSequence.sequenceDefinition == null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gm")
   public void method688(int var1) {
      this.y = var1 * -1620303501;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   static void method677(int var0) {
      try {
         class30.method1308(24, 1562102017);
         class525.setLoginResponseString(Strings.field5090, Strings.field4932, Strings.field5092, (byte)1);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "bl.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lky;")
   @ObfuscatedName("ap")
   @Override
   protected final Model vmethod49() {
      if (AnimationSequence.method10341(this.animationSequence, 30, -1002405506)) {
         return null;
      } else {
         SpotAnimationDefinition var1 = class181.SpotAnimationDefinition_get(294406507 * this.id, 1179985529);
         Model var2 = SpotAnimationDefinition.method4613(var1, this.animationSequence.getFrame(-609025707), 473912759);
         return null == var2 ? null : var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("hh")
   static int method676(int var0, byte var1) {
      try {
         return 600 + 3 * var0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bl.hh(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[Lpm;")
   @ObfuscatedName("ae")
   public static StudioGame[] method670(byte var0) {
      try {
         return new StudioGame[]{StudioGame.stellardawn, StudioGame.game5, StudioGame.game3, StudioGame.game4, StudioGame.runescape, StudioGame.oldscape};
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "bl.ae(" + ')');
      }
   }

   public GraphicsObject() {
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("av")
   boolean method673(int var1) {
      try {
         boolean var10000;
         if (!AnimationSequence.method10315(this.animationSequence, -831296794)) {
            if (var1 == -1427369953) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bl.av(" + ')');
      }
   }
}
