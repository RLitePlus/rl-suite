import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bc")
public class classBC {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field116 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final String field119 = "m=accountappeal/login.ws";
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field113 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final String field120 = "services";
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field114 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field117 = 1000;
   @ObfuscatedName("au")
   static final BigInteger field111 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   @ObfuscatedName("az")
   static final BigInteger field112 = new BigInteger(
      "7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"
   );
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field115 = 9;
   @ToRemove(unused = "true")
   @ObfuscatedName("bl")
   static final int field118 = 1001;

   classBC() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("av")
   static int method402(int var0, int var1) {
      try {
         return var0 - 1;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bc.av(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("ag")
   static boolean method400(String var0) {
      if (null == var0) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("at")
   static boolean method401(String var0) {
      if (null == var0) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldv;B)Z")
   @ObfuscatedName("js")
   static boolean method403(NPC var0, byte var1) {
      try {
         if (!var0.definition.method4722(-203416512)) {
            if (var1 != 2) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            for (int var2 = 0; var2 < Occluder.topLevelWorldView.field1314.method10502(-1749578867); var2++) {
               if (var1 != 2) {
                  throw new IllegalStateException();
               }

               WorldEntity var3 = (WorldEntity)Occluder.topLevelWorldView
                  .worldEntities
                  .get((long)Occluder.topLevelWorldView.field1314.method10498(var2, (byte)8));
               if (var3 != null) {
                  if (var1 != 2) {
                     throw new IllegalStateException();
                  }

                  if (client.cycle * 1759706017 == var3.worldView.scene.cycle) {
                     if (var1 != 2) {
                        throw new IllegalStateException();
                     }

                     if (!WorldEntity.method10825(var3, 296685190) && classTR.method10815(var3, var0, 2039858534)) {
                        if (var1 != 2) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }
                  }
               }
            }

            return false;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "bc.js(" + ')');
      }
   }
}
