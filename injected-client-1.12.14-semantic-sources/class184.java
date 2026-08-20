import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hd")
public class class184 extends DualNode {
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("av")
   static EvictingDualNodeHashTable field1864 = new EvictingDualNodeHashTable(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   public static final int field2172 = 91;
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   static final int field2175 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2174 = 12;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field2173 = 2;

   class184() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aj")
   static void method4485(byte var0) {
      try {
         try {
            File var1 = new File(JagexCache.userHomeDirectory, "random.dat");
            if (var1.exists()) {
               if (var0 == 1) {
                  throw new IllegalStateException();
               }

               JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var1, "rw", 25L), 24, 0);
            } else {
               label52:
               for (int var2 = 0; var2 < class201.field2288.length; var2++) {
                  if (var0 == 1) {
                     throw new IllegalStateException();
                  }

                  for (int var3 = 0; var3 < classWO.field6405.length; var3++) {
                     File var4 = new File(classWO.field6405[var3] + class201.field2288[var2] + File.separatorChar + "random.dat");
                     if (var4.exists()) {
                        if (var0 == 1) {
                           throw new IllegalStateException();
                        }

                        JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0);
                        break label52;
                     }
                  }
               }
            }

            if (JagexCache.JagexCache_randomDat == null) {
               if (var0 == 1) {
                  return;
               }

               RandomAccessFile var7 = new RandomAccessFile(var1, "rw");
               int var8 = var7.read();
               var7.seek(0L);
               var7.write(var8);
               var7.seek(0L);
               var7.close();
               JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var1, "rw", 25L), 24, 0);
            }
         } catch (IOException var5) {
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "hd.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   public static void method4479() {
      field1864.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public static void method4480() {
      field1864.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   public static void method4481() {
      field1864.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   public static void method4482() {
      field1864.clear();
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("nq")
   static void method4487(byte var0) {
      try {
         for (InterfaceParent var1 = (InterfaceParent)client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)client.interfaceParents.next()) {
            if (var0 <= 1) {
               throw new IllegalStateException();
            }

            int var2 = -1385287145 * var1.group;
            if (WidgetDefinition.method7961(class226.widgetDefinition, var2, -1801399791)) {
               if (var0 <= 1) {
                  throw new IllegalStateException();
               }

               boolean var3 = true;
               Widget[] var4 = class226.widgetDefinition.Widget_interfaceComponents[var2];

               for (int var5 = 0; var5 < var4.length; var5++) {
                  if (var0 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (var4[var5] != null) {
                     var3 = var4[var5].isIf3;
                     break;
                  }
               }

               if (!var3) {
                  if (var0 <= 1) {
                     throw new IllegalStateException();
                  }

                  int var8 = (int)var1.key;
                  Widget var6 = class226.widgetDefinition.method7953(var8, 769962498);
                  if (null != var6) {
                     if (var0 <= 1) {
                        return;
                     }

                     class376.invalidateWidget(var6, (byte)5);
                  }
               }
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "hd.nq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   public static void method4484(int var0) {
      try {
         ByteArrayPool.field5840.clear();
         ByteArrayPool.field5840.add(100);
         ByteArrayPool.field5840.add(5000);
         ByteArrayPool.field5840.add(10000);
         ByteArrayPool.field5840.add(30000);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "hd.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("hm")
   static final void forceDisconnect(int var0, byte var1) {
      try {
         class30.logOut((byte)58);
         switch (var0) {
            case 1:
               GraphicsObject.method677(-1871042313);
               break;
            case 2:
               FloorOverlayDefinition.method5357(-779721717);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hd.hm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Lqd;II)Lmj;")
   @ObfuscatedName("av")
   public static PacketBufferNode method4483(int var0, String var1, Language var2, int var3, int var4) {
      try {
         PacketBufferNode var5 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3878, client.packetWriter.isaacCipher, -1624906555);
         var5.packetBuffer.writeByte(0, (short)-31659);
         int var6 = var5.packetBuffer.offset * 2108391709;
         var5.packetBuffer.writeByte(var0, (short)-10596);
         String var7 = var1.toLowerCase();
         int var8 = 0;
         byte[] var9 = null;
         if (var7.startsWith(Strings.field5046)) {
            if (var4 <= -205977343) {
               throw new IllegalStateException();
            }

            var8 = 0;
            var1 = var1.substring(Strings.field5046.length());
         } else if (var7.startsWith(Strings.field4976)) {
            if (var4 <= -205977343) {
               throw new IllegalStateException();
            }

            var8 = 1;
            var1 = var1.substring(Strings.field4976.length());
         } else if (var7.startsWith(Strings.field5048)) {
            if (var4 <= -205977343) {
               throw new IllegalStateException();
            }

            var8 = 2;
            var1 = var1.substring(Strings.field5048.length());
         } else if (var7.startsWith(Strings.field4857)) {
            if (var4 <= -205977343) {
               throw new IllegalStateException();
            }

            var8 = 3;
            var1 = var1.substring(Strings.field4857.length());
         } else if (var7.startsWith(Strings.field4860)) {
            var8 = 4;
            var1 = var1.substring(Strings.field4860.length());
         } else if (var7.startsWith(Strings.field5007)) {
            if (var4 <= -205977343) {
               throw new IllegalStateException();
            }

            var8 = 5;
            var1 = var1.substring(Strings.field5007.length());
         } else if (var7.startsWith(Strings.field4921)) {
            if (var4 <= -205977343) {
               throw new IllegalStateException();
            }

            var8 = 6;
            var1 = var1.substring(Strings.field4921.length());
         } else if (var7.startsWith(Strings.field5121)) {
            if (var4 <= -205977343) {
               throw new IllegalStateException();
            }

            var8 = 7;
            var1 = var1.substring(Strings.field5121.length());
         } else if (var7.startsWith(Strings.field5054)) {
            if (var4 <= -205977343) {
               throw new IllegalStateException();
            }

            var8 = 8;
            var1 = var1.substring(Strings.field5054.length());
         } else if (var7.startsWith(Strings.field5055)) {
            if (var4 <= -205977343) {
               throw new IllegalStateException();
            }

            var8 = 9;
            var1 = var1.substring(Strings.field5055.length());
         } else if (var7.startsWith(Strings.field5056)) {
            if (var4 <= -205977343) {
               throw new IllegalStateException();
            }

            var8 = 10;
            var1 = var1.substring(Strings.field5056.length());
         } else if (var7.startsWith(Strings.field5057)) {
            if (var4 <= -205977343) {
               throw new IllegalStateException();
            }

            var8 = 11;
            var1 = var1.substring(Strings.field5057.length());
         } else if (var7.startsWith(Strings.field5013)) {
            if (var4 <= -205977343) {
               throw new IllegalStateException();
            }

            var8 = 12;
            var1 = var1.substring(Strings.field5013.length());
         } else if (var7.startsWith(Strings.field5014)) {
            if (var4 <= -205977343) {
               throw new IllegalStateException();
            }

            byte var11 = 48;
            byte var12 = 87;
            int var13 = Strings.field5014.length();
            int var14 = 0;
            byte[] var15 = new byte[8];

            byte[] var10;
            while (true) {
               int var16 = var13 + var14;
               if (var16 >= var7.length()) {
                  var10 = null;
                  break;
               }

               char var17 = var7.charAt(var16);
               if (var17 == ':') {
                  if (var4 <= -205977343) {
                     throw new IllegalStateException();
                  }

                  if (var14 == 0) {
                     if (var4 <= -205977343) {
                        throw new IllegalStateException();
                     }

                     var10 = null;
                  } else {
                     byte[] var22 = new byte[var14];
                     System.arraycopy(var15, 0, var22, 0, var14);
                     var10 = var22;
                  }
                  break;
               }

               if (var14 == var15.length) {
                  if (var4 <= -205977343) {
                     throw new IllegalStateException();
                  }

                  var10 = null;
                  break;
               }

               label265: {
                  if (var17 >= '0') {
                     if (var4 <= -205977343) {
                        throw new IllegalStateException();
                     }

                     if (var17 <= '9') {
                        if (var4 <= -205977343) {
                           throw new IllegalStateException();
                        }

                        var17 = (char)(var17 - '0');
                        break label265;
                     }
                  }

                  if (var17 < 'a' || var17 > 'z') {
                     var10 = null;
                     break;
                  }

                  if (var4 <= -205977343) {
                     throw new IllegalStateException();
                  }

                  var17 = (char)(var17 - 'W');
               }

               var15[var14++] = (byte)var17;
            }

            var9 = var10;
            if (var10 != null) {
               if (var4 <= -205977343) {
                  throw new IllegalStateException();
               }

               var8 = 12 + var10.length;
               var1 = var1.substring(Strings.field5014.length() + var10.length + 1);
            }
         }

         var7 = var1.toLowerCase();
         byte var20 = 0;
         if (var7.startsWith(Strings.field5060)) {
            if (var4 <= -205977343) {
               throw new IllegalStateException();
            }

            var20 = 1;
            var1 = var1.substring(Strings.field5060.length());
         } else if (var7.startsWith(Strings.field5061)) {
            var20 = 2;
            var1 = var1.substring(Strings.field5061.length());
         } else if (var7.startsWith(Strings.field5062)) {
            var20 = 3;
            var1 = var1.substring(Strings.field5062.length());
         } else if (var7.startsWith(Strings.field4913)) {
            if (var4 <= -205977343) {
               throw new IllegalStateException();
            }

            var20 = 4;
            var1 = var1.substring(Strings.field4913.length());
         } else if (var7.startsWith(Strings.field5064)) {
            if (var4 <= -205977343) {
               throw new IllegalStateException();
            }

            var20 = 5;
            var1 = var1.substring(Strings.field5064.length());
         }

         var5.packetBuffer.writeByte(var8, (short)-7681);
         var5.packetBuffer.writeByte(var20, (short)-19652);
         if (var9 != null) {
            for (int var21 = 0; var21 < var9.length; var21++) {
               if (var4 <= -205977343) {
                  throw new IllegalStateException();
               }

               var5.packetBuffer.writeByte(var9[var21], (short)-3984);
            }
         }

         classLN.method7205(var5.packetBuffer, var1, -293496581);
         if (var0 == class383.field4696.rsOrdinal((byte)87)) {
            if (var4 <= -205977343) {
               throw new IllegalStateException();
            }

            var5.packetBuffer.writeByte(var3, (short)-18165);
         }

         var5.packetBuffer.writeLengthByte(var5.packetBuffer.offset * 2108391709 - var6, 1802498646);
         return var5;
      } catch (RuntimeException var18) {
         throw RestClientThreadFactory.newRunException(var18, "hd.av(" + ')');
      }
   }
}
