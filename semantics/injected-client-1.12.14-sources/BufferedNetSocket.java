import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tu")
public class BufferedNetSocket extends AbstractSocket {
   @ObfuscatedSignature(descriptor = "Ltw;")
   @ObfuscatedName("ag")
   BufferedSink sink;
   @ObfuscatedSignature(descriptor = "Ltg;")
   @ObfuscatedName("at")
   BufferedSource source;
   @ObfuscatedName("av")
   Socket socket;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   @Override
   public int vmethod364() throws IOException {
      return this.source.available(-1104242931);
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("at")
   @Override
   public boolean isAvailable(int var1, byte var2) throws IOException {
      try {
         return this.source.isAvailable(var1, -495509101);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "tu.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ar")
   @Override
   public void vmethod360(byte[] var1, int var2, int var3) throws IOException {
      this.sink.write(var1, var2, var3, (byte)25);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/io/FileDescriptor;")
   @ObfuscatedName("ss")
   public FileDescriptor method10911() {
      FileInputStream var1 = (FileInputStream)this.source.inputStream;

      try {
         return var1.getFD();
      } catch (IOException var3) {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("alh")
   protected void method10907() {
      this.close(-1883200549);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lle;)V")
   @ObfuscatedName("ea")
   public static void method10909(WorldMapRenderer var0) {
      if (var0 == null) {
         var0.method7154();
      }

      var0.icons = null;
   }

   @ObfuscatedSignature(descriptor = "([BIII)I")
   @ObfuscatedName("ae")
   @Override
   public int read(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         return this.source.read(var1, var2, var3, 1513667819);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "tu.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIII)V")
   @ObfuscatedName("aj")
   @Override
   public void write(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         this.sink.write(var1, var2, var3, (byte)-12);
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "tu.aj(" + ')');
      }
   }

   @Override
   protected void finalize() {
      try {
         this.close(-1883200549);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "tu.finalize(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   @Override
   public int readUnsignedByte(int var1) throws IOException {
      try {
         return this.source.available(1345943148);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tu.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)I")
   @ObfuscatedName("ax")
   @Override
   public int vmethod372(byte[] var1, int var2, int var3) throws IOException {
      return this.source.read(var1, var2, var3, 1758128647);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("all")
   protected void method10908() {
      this.close(-1883200549);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("au")
   @Override
   public boolean vmethod361(int var1) throws IOException {
      return this.source.isAvailable(var1, 1358384015);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ay")
   @Override
   public boolean vmethod353(int var1) throws IOException {
      return this.source.isAvailable(var1, -1751162010);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("az")
   @Override
   public int vmethod363() throws IOException {
      return this.source.available(-946200478);
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIIIILxt;Loz;I)V")
   @ObfuscatedName("aj")
   static final void worldToMinimap(WorldView var0, int var1, int var2, int var3, int var4, int var5, SpritePixels var6, SpriteMask var7, int var8) {
      try {
         ProjectionCoord var9 = classDH.method3122(var0, var1, var2, (byte)37);
         var1 = (int)var9.x;
         var2 = (int)var9.y;
         var9.release(-804947546);
         int var10 = var1 / 32 - client.field828 * -361115983 / 32;
         int var11 = var2 / 32 - client.field674 * -291215063 / 32;
         int var12 = var11 * var11 + var10 * var10;
         if (var12 > 4225) {
            if (var8 != -1390648400) {
               throw new IllegalStateException();
            }

            if (var12 < 90000) {
               if (var8 != -1390648400) {
                  return;
               }

               int var13 = Rasterizer3D.Rasterizer3D_sine[var5];
               int var14 = Rasterizer3D.Rasterizer3D_cosine[var5];
               int var15 = var11 * var13 + var10 * var14 >> 16;
               int var16 = var14 * var11 - var10 * var13 >> 16;
               double var17 = Math.atan2(var15, var16);
               int var19 = var7.height * 915756381 / 2 - 25;
               int var20 = (int)(Math.sin(var17) * var19);
               int var21 = (int)(Math.cos(var17) * var19);
               byte var22 = 20;
               class39.redHintArrowSprite
                  .method12680(
                     var3 + var7.height * 915756381 / 2 - var22 / 2 + var20,
                     var7.width * 1668058793 / 2 + var4 - var22 / 2 - var21 - 10,
                     var22,
                     var22,
                     15,
                     15,
                     var17,
                     256
                  );
               return;
            }
         }

         SecureRandomFuture.drawSpriteOnMinimap(var3, var4, var10, var11, var5, var6, var7, 480933552);
      } catch (RuntimeException var23) {
         throw RestClientThreadFactory.newRunException(var23, "tu.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod368(byte[] var1, int var2, int var3) throws IOException {
      return this.source.read(var1, var2, var3, 1569065979);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   @Override
   public int vmethod366() throws IOException {
      return this.source.readUnsignedByte(286363924);
   }

   @ObfuscatedSignature(descriptor = "([BII)I")
   @ObfuscatedName("ac")
   @Override
   public int vmethod367(byte[] var1, int var2, int var3) throws IOException {
      return this.source.read(var1, var2, var3, 2017673681);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   @Override
   public void vmethod373() {
      BufferedSink.method10927(this.sink, -250109756);

      try {
         this.socket.close();
      } catch (IOException var2) {
      }

      this.source.close(1961990778);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   @Override
   public void close(int var1) {
      try {
         BufferedSink.method10927(this.sink, -1473789438);

         try {
            this.socket.close();
         } catch (IOException var3) {
         }

         this.source.close(97621868);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "tu.ak(" + ')');
      }
   }

   BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
      this.socket = var1;
      this.socket.setSoTimeout(30000);
      this.socket.setTcpNoDelay(true);
      this.socket.setReceiveBufferSize(65536);
      this.socket.setSendBufferSize(65536);
      this.source = new BufferedSource(this.socket.getInputStream(), var2);
      this.sink = new BufferedSink(this.socket.getOutputStream(), var3);
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ah")
   @Override
   public void vmethod356(byte[] var1, int var2, int var3) throws IOException {
      this.sink.write(var1, var2, var3, (byte)-66);
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("al")
   @Override
   public void vmethod370(byte[] var1, int var2, int var3) throws IOException {
      this.sink.write(var1, var2, var3, (byte)-120);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   @Override
   public void vmethod371() {
      BufferedSink.method10927(this.sink, 1716112739);

      try {
         this.socket.close();
      } catch (IOException var2) {
      }

      this.source.close(466741738);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   @Override
   public void vmethod369() {
      BufferedSink.method10927(this.sink, 744555043);

      try {
         this.socket.close();
      } catch (IOException var2) {
      }

      this.source.close(1615292136);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   @Override
   public int vmethod365() throws IOException {
      return this.source.readUnsignedByte(286363924);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   @Override
   public void vmethod374() {
      BufferedSink.method10927(this.sink, 1094914885);

      try {
         this.socket.close();
      } catch (IOException var2) {
      }

      this.source.close(-202874286);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   @Override
   public void vmethod375() {
      BufferedSink.method10927(this.sink, 1163469059);

      try {
         this.socket.close();
      } catch (IOException var2) {
      }

      this.source.close(942373186);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   @Override
   public int available(int var1) throws IOException {
      try {
         return this.source.readUnsignedByte(286363924);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tu.an(" + 41);
      }
   }
}
