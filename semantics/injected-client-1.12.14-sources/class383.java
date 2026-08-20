import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("os")
public class class383 implements Enum {
   @ObfuscatedSignature(descriptor = "Los;")
   @ObfuscatedName("ae")
   static final class383 field4694 = new class383(4);
   @ObfuscatedSignature(descriptor = "Los;")
   @ObfuscatedName("av")
   static final class383 field4693 = new class383(0);
   @ObfuscatedSignature(descriptor = "Los;")
   @ObfuscatedName("ag")
   static final class383 field4695 = new class383(2);
   @ObfuscatedSignature(descriptor = "Los;")
   @ObfuscatedName("an")
   public static final class383 field4696 = new class383(3);
   @ObfuscatedSignature(descriptor = "Los;")
   @ObfuscatedName("at")
   static final class383 field4697 = new class383(1);
   @ObfuscatedName("aj")
   final int field4692;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field4698 = 6;

   class383(int var1) {
      this.field4692 = -1977131723 * var1;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return -64238307 * this.field4692;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "os.av(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lclient;)Z")
   @ObfuscatedName("sj")
   public static boolean method8660(client var0) {
      return var0 == null ? var0.method2281() : 1 == var0.clientId * 1207018651;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;)Z")
   @ObfuscatedName("kd")
   public static boolean method8657(World var0) {
      return var0 == null ? var0.method911() : (class594.field6414.rsOrdinal((byte)62) & var0.location * 1711259724) != 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return -64238307 * this.field4692;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("kz")
   static final void loadRegion(int var0) {
      if (!client.$assertionsDisabled && !client.field777) {
         throw new AssertionError();
      } else {
         if (client.field1029 == null) {
            rl4 var1 = new rl4(client.field1025, client.field998, Occluder.topLevelWorldView, rl2.method9552(true));
            var1.field5652 = var1.field5636.baseX * 825809917;
            var1.field5650 = var1.field5636.baseY * 1279964673;
            var1.field5649 = HealthBarUpdate.field600 * 1088736263;
            var1.field5651 = ScriptFrame.field355 * -2101212985;
            var1.field5648 = AsyncHttpResponse.worldView.plane * 2115028565;
            if (!client.$assertionsDisabled && client.field1028 != null) {
               throw new AssertionError();
            }

            client.field1029 = var1;
            var1.method9592();
         } else if (client.field1029.method9585()) {
            rl4 var2 = client.field1029;
            if (!client.$assertionsDisabled && client.field1028 != null) {
               throw new AssertionError();
            }

            client.field1029 = null;
            client.field1042 = false;
            Occluder.topLevelWorldView.plane = var2.field5648 * 1538131709;
            client.method2405(var2);
            client.method2506(var2);
            if (!client.$assertionsDisabled && SecureUrlRequester.client.method2562() != 25) {
               throw new AssertionError();
            }

            if (!client.$assertionsDisabled && client.field777) {
               throw new AssertionError();
            }

            if (client.field1025 != var2.field5624 && client.field1025 != null) {
               client.field938.info("Reloading due to draw callbacks change while loading!");
               client.field777 = true;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return -64238307 * this.field4692;
   }

   @ObfuscatedSignature(descriptor = "(II)Lcu;")
   @ObfuscatedName("av")
   static Script getScript(int var0, int var1) {
      try {
         Script var2 = (Script)class402.method8806(Script.Script_cached, var0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = WorldMapRectangle.archive12.getFile(var0, 0, 1559776633);
            if (var3 == null) {
               if (var1 == -1929406537) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               var2 = UserComparator3.newScript(var3, -128596119);
               Script.Script_cached.put(var2, var0);
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "os.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return -64238307 * this.field4692;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("oq")
   static final void method8659(int var0, int var1) {
      try {
         var0 = Math.min(Math.max(var0, 0), 127);
         class468.clientPreferences.updateAreaSoundEffectsVolume(var0, 987938279);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "os.oq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("ax")
   public static String method8658(DynamicArray var0, String var1, int var2) {
      try {
         ProjectionCoord.method9919(var0, class586.field6379, 2078523191);
         int var3 = var0.method11215((byte)72);
         String[] var4 = (String[])var0.method11214((byte)-113);
         if (var3 == 0) {
            if (var2 != 921778921) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else if (1 == var3) {
            if (var2 != 921778921) {
               throw new IllegalStateException();
            } else {
               return var4[0];
            }
         } else {
            int var5 = var1.length();
            int var6 = var5 * (var3 - 1);

            for (int var7 = 0; var7 < var3; var7++) {
               if (var2 != 921778921) {
                  throw new IllegalStateException();
               }

               var6 += var4[var7].length();
            }

            char[] var11 = new char[var6];
            int var8 = 0;

            for (int var9 = 0; var9 < var3; var9++) {
               if (var2 != 921778921) {
                  throw new IllegalStateException();
               }

               if (var9 > 0) {
                  if (var2 != 921778921) {
                     throw new IllegalStateException();
                  }

                  var1.getChars(0, var5, var11, var8);
                  var8 += var5;
               }

               var4[var9].getChars(0, var4[var9].length(), var11, var8);
               var8 += var4[var9].length();
            }

            return new String(var11);
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "os.ax(" + ')');
      }
   }
}
