import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hc")
public class classHC extends classHB {
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field2764 = 10;
   @ObfuscatedName("af")
   String field2763;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field2765 = 35;
   @ObfuscatedSignature(descriptor = "Lyz;")
   @ObfuscatedName("cf")
   static classYZ field2768;
   @ToRemove(unused = "true")
   @ObfuscatedName("by")
   static final int field2766 = 64;
   @ObfuscatedName("az")
   long field2762;
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("hv")
   static classVP field2767;

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod503(classIQ var1) {
      var1.method6252(this.field2762 * -8137162529794675313L, this.field2763, 0, 594786739);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod498(classXY var1, int var2) {
      try {
         if (classXY.method13039(var1, -346779531) != 255) {
            if (var2 >= -989877912) {
               throw new IllegalStateException();
            }

            var1.field6955 -= -1095856699;
            this.field2762 = var1.method13059(1547312186) * -7031832937399692945L;
         }

         this.field2763 = var1.method13069((byte)89);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "hc.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;B)V")
   @ObfuscatedName("af")
   @Override
   void vmethod499(classIQ var1, byte var2) {
      try {
         var1.method6252(this.field2762 * -8137162529794675313L, this.field2763, 0, -741016718);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "hc.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("au")
   static void method5992(int var0) {
      try {
         classBF.field389 = classBF.field389.trim();
         client.method2363(-1);
         if (classBF.field389.isEmpty()) {
            if (var0 != -486975020) {
               throw new IllegalStateException();
            } else {
               classSP.method10624(classKK.field3713, classKK.field3769, classKK.field3679, (byte)-28);
            }
         } else {
            long var2;
            try {
               URL var4 = new URL(classLZ.method7427("services", false, -1442756803) + "m=accountappeal/login.ws");
               URLConnection var5 = var4.openConnection();
               var5.setRequestProperty("connection", "close");
               var5.setDoInput(true);
               var5.setDoOutput(true);
               var5.setConnectTimeout(5000);
               OutputStreamWriter var6 = new OutputStreamWriter(var5.getOutputStream());
               var6.write("data1=req");
               var6.flush();
               InputStream var7 = var5.getInputStream();
               classXY var8 = new classXY(new byte[1000]);

               while (true) {
                  int var9 = var7.read(var8.field6954, var8.field6955 * 702114061, 1000 - var8.field6955 * 702114061);
                  if (-1 == var9) {
                     var8.field6955 = 0;
                     long var13 = var8.method13059(745816352);
                     var2 = var13;
                     break;
                  }

                  var8.field6955 += var9 * -1095856699;
                  if (702114061 * var8.field6955 >= 1000) {
                     if (var0 != -486975020) {
                        throw new IllegalStateException();
                     }

                     var2 = 0L;
                     break;
                  }
               }
            } catch (Exception var11) {
               var2 = 0L;
            }

            int var1;
            if (0L == var2) {
               if (var0 != -486975020) {
                  return;
               }

               var1 = 5;
            } else {
               var1 = classGY.method5922(var2, classBF.field389, (byte)-5);
            }

            switch (var1) {
               case 2:
                  classSP.method10624(classKK.field3874, classKK.field3906, classKK.field3763, (byte)-28);
                  classAC.method326(6, 2068399022);
                  break;
               case 3:
                  classSP.method10624(classKK.field3727, classKK.field3607, classKK.field3879, (byte)-31);
                  break;
               case 4:
                  classSP.method10624(classKK.field3880, classKK.field3881, classKK.field3882, (byte)-26);
                  break;
               case 5:
                  classSP.method10624(classKK.field3883, classKK.field3884, classKK.field3885, (byte)-93);
                  break;
               case 6:
                  classSP.method10624(classKK.field3886, classKK.field3887, classKK.field3888, (byte)-40);
                  break;
               case 7:
                  classSP.method10624(classKK.field3768, classKK.field3890, classKK.field3891, (byte)-120);
            }
         }
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "hc.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod501(classXY var1) {
      if (classXY.method13039(var1, -346779531) != 1977590721) {
         var1.field6955 -= -1095856699;
         this.field2762 = var1.method13059(-69179397) * -7031832937399692945L;
      }

      this.field2763 = var1.method13069((byte)23);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod502(classIQ var1) {
      var1.method6252(this.field2762 * -8137162529794675313L, this.field2763, 0, 552680498);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod500(classXY var1) {
      if (classXY.method13039(var1, -346779531) != 255) {
         var1.field6955 -= -1095856699;
         this.field2762 = var1.method13059(-242494880) * -7031832937399692945L;
      }

      this.field2763 = var1.method13069((byte)-51);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod504(classIQ var1) {
      var1.method6252(this.field2762 * -8137162529794675313L, this.field2763, 0, -1735302393);
   }

   classHC(classIF var1) {
      this.this$0 = var1;
      this.field2762 = 7031832937399692945L;
      this.field2763 = null;
   }
}
