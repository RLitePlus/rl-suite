import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("me")
public class classME {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field4491 = 1048576;
   @ObfuscatedSignature(descriptor = "Laac;")
   @ObfuscatedName("al")
   public static classAAC field4488 = null;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final String field4496 = "rw";
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final String field4497 = "main_file_cache.idx";
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final String field4498 = "main_file_cache.idx255";
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   static final int field4494 = 89;
   @ObfuscatedSignature(descriptor = "Laac;")
   @ObfuscatedName("aj")
   public static classAAC field4489 = null;
   @ObfuscatedSignature(descriptor = "Laac;")
   @ObfuscatedName("aw")
   static classAAC field4490 = null;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field4493 = 24;
   @ToRemove(unused = "true")
   @ObfuscatedName("cp")
   static final int field4495 = 110;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field4492 = 2;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
   @ObfuscatedName("ao")
   public static void method7539(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (var1 != null && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      classUP.field6363 = var4 * -552347913;
      MidiRequest.field4637 = var3 * 381969765;

      try {
         Script.field499 = System.getProperty("os.name");
      } catch (Exception var36) {
         Script.field499 = "Unknown";
      }

      classZW.field7284 = Script.field499.toLowerCase();
      ClanChannel.field2954 = null;

      try {
         ClanChannel.field2954 = System.getProperty("jagex.userhome");
      } catch (Exception var35) {
      }

      if (ClanChannel.field2954 == null) {
         try {
            ClanChannel.field2954 = System.getProperty("user.home");
         } catch (Exception var34) {
         }
      }

      if (null != ClanChannel.field2954) {
         ClanChannel.field2954 = ClanChannel.field2954 + "/";
      }

      try {
         if (classZW.field7284.startsWith("win")) {
            if (ClanChannel.field2954 == null) {
               ClanChannel.field2954 = client.method2366("USERPROFILE");
            }
         } else if (null == ClanChannel.field2954) {
            ClanChannel.field2954 = client.method2366("HOME");
         }

         if (null != ClanChannel.field2954) {
            ClanChannel.field2954 = ClanChannel.field2954 + "/";
         }
      } catch (Exception var33) {
      }

      if (null == ClanChannel.field2954) {
         ClanChannel.field2954 = "~/";
      }

      classWQ.field6768 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", ClanChannel.field2954, "/tmp/", ""};
      classCV.field1305 = new String[]{".jagex_cache_" + MidiRequest.field4637 * 1602897005, ".file_store_" + MidiRequest.field4637 * 1697206599};

      label479:
      for (int var5 = 0; var5 < 4; var5++) {
         String var7 = 0 == var5 ? "" : "" + var5;
         classDB.field1379 = new File(ClanChannel.field2954, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
         String var8 = null;
         String var9 = null;
         boolean var10 = false;
         if (classDB.field1379.exists()) {
            classAAR var11 = null;

            try {
               var11 = new classAAR(classDB.field1379, "rw", 10000L);
               Buffer var12 = new Buffer((int)var11.method257(-153393736));

               while (702114061 * var12.offset < var12.array.length) {
                  int var13 = var11.method260(var12.array, var12.offset * 702114061, var12.array.length - 2077077400 * var12.offset, -1397369950);
                  if (var13 == -1) {
                     throw new IOException();
                  }

                  var12.offset += -1673129772 * var13;
               }

               var12.offset = 0;
               int var61 = Buffer.method13039(var12, -346779531);
               if (var61 < 1 || var61 > 3) {
                  throw new IOException("" + var61);
               }

               int var14 = 0;
               if (var61 > 1) {
                  var14 = Buffer.method13039(var12, -346779531);
               }

               if (var61 <= 2) {
                  var8 = var12.method13077(1165669181);
                  if (1 == var14) {
                     var9 = var12.method13077(1628145426);
                  }
               } else {
                  var8 = Buffer.method13082(var12, 1081461655);
                  if (var14 == 1) {
                     var9 = Buffer.method13082(var12, 755786984);
                  }
               }
            } catch (Exception var39) {
               var39.printStackTrace();
            } finally {
               try {
                  if (null != var11) {
                     classAAR.method247(var11, (byte)1);
                  }
               } catch (IOException var31) {
               }
            }

            if (null != var8) {
               File var56 = new File(var8);
               if (!var56.exists()) {
                  var8 = null;
               }
            }

            if (null != var8) {
               File var57 = new File(var8, "test.dat");
               if (!classBB.method788(var57, true, -1102901767)) {
                  var8 = null;
               }
            }
         }

         if (var8 == null && 0 == var5) {
            label452:
            for (int var53 = 0; var53 < classCV.field1305.length; var53++) {
               for (int var58 = 0; var58 < classWQ.field6768.length; var58++) {
                  File var62 = new File(classWQ.field6768[var58] + classCV.field1305[var53] + File.separatorChar + var0 + File.separatorChar);
                  if (var62.exists() && classBB.method788(new File(var62, "test.dat"), true, -1576606522)) {
                     var8 = var62.toString();
                     var10 = true;
                     break label452;
                  }
               }
            }
         }

         if (var8 == null) {
            var8 = ClanChannel.field2954
               + File.separatorChar
               + "jagexcache"
               + var7
               + File.separatorChar
               + var0
               + File.separatorChar
               + var2
               + File.separatorChar;
            var10 = true;
         }

         if (var9 != null) {
            File var54 = new File(var9);
            File var59 = new File(var8);

            try {
               File[] var63 = var54.listFiles();
               File[] var65 = var63;

               for (int var15 = 0; var15 < var65.length; var15++) {
                  File var16 = var65[var15];
                  File var17 = new File(var59, var16.getName());
                  boolean var18 = var16.renameTo(var17);
                  if (!var18) {
                     throw new IOException();
                  }
               }
            } catch (Exception var38) {
               var38.printStackTrace();
            }

            var10 = true;
         }

         if (var10) {
            File var55 = new File(var8);
            Object var60 = null;

            try {
               classAAR var64 = new classAAR(classDB.field1379, "rw", 10000L);
               Buffer var66 = new Buffer(500);
               Buffer.method12971(var66, 3, (byte)-60);
               Buffer.method12971(var66, null != var60 ? 1 : 0, (byte)-101);
               var66.method13001(var55.getPath(), -910745300);
               if (var60 != null) {
                  var66.method13001(var60.getPath(), -910745300);
               }

               var64.method242(var66.array, 0, 689286479 * var66.offset, -900673116);
               classAAR.method247(var64, (byte)1);
            } catch (IOException var32) {
               var32.printStackTrace();
            }
         }

         File var6 = new File(var8);
         classSL.field5975 = var6;
         if (!classSL.field5975.exists()) {
            classSL.field5975.mkdirs();
         }

         File[] var44 = classSL.field5975.listFiles();
         if (var44 != null) {
            File[] var47 = var44;

            for (int var50 = 0; var50 < var47.length; var50++) {
               File var52 = var47[var50];
               if (!classBB.method788(var52, false, -583133266)) {
                  continue label479;
               }
            }
         }
         break;
      }

      File var41 = classSL.field5975;
      classMT.field4586 = var41;
      if (!classMT.field4586.exists()) {
         throw new RuntimeException("");
      } else {
         classMT.field4580 = true;

         try {
            File var42 = new File(ClanChannel.field2954, "random.dat");
            if (var42.exists()) {
               field4490 = new classAAC(new classAAR(var42, "rw", 25L), 24, 0);
            } else {
               label403:
               for (int var45 = 0; var45 < classCV.field1305.length; var45++) {
                  for (int var48 = 0; var48 < classWQ.field6768.length; var48++) {
                     File var51 = new File(classWQ.field6768[var48] + classCV.field1305[var45] + File.separatorChar + "random.dat");
                     if (var51.exists()) {
                        field4490 = new classAAC(new classAAR(var51, "rw", 25L), 24, 0);
                        break label403;
                     }
                  }
               }
            }

            if (field4490 == null) {
               RandomAccessFile var46 = new RandomAccessFile(var42, "rw");
               int var49 = var46.read();
               var46.seek(0L);
               var46.write(var49);
               var46.seek(0L);
               var46.close();
               field4490 = new classAAC(new classAAR(var42, "rw", 25L), 24, 0);
            }
         } catch (IOException var37) {
         }

         field4488 = new classAAC(new classAAR(classBJ.method1113("main_file_cache.dat2", -654385736), "rw", 1048576000L), -1796892074, 0);
         field4489 = new classAAC(new classAAR(classBJ.method1113("main_file_cache.idx255", -1088429810), "rw", 1048576L), 1530390350, 0);
         GraphicsObject.field477 = new classAAC[classUP.field6363 * -1127736048];

         for (int var43 = 0; var43 < -646722873 * classUP.field6363; var43++) {
            GraphicsObject.field477[var43] = new classAAC(new classAAR(classBJ.method1113("main_file_cache.idx" + var43, 140195232), "rw", 1048576L), 6000, 0);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("at")
   public static void method7553(Buffer var0, int var1) {
      if (field4490 != null) {
         try {
            field4490.method138(0L);
            field4490.method153(var0.array, var1, 24, -1298094667);
         } catch (Exception var3) {
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
   @ObfuscatedName("ac")
   public static void method7540(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (var1 != null && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      classUP.field6363 = var4 * -552347913;
      MidiRequest.field4637 = var3 * 381969765;

      try {
         Script.field499 = System.getProperty("os.name");
      } catch (Exception var36) {
         Script.field499 = "Unknown";
      }

      classZW.field7284 = Script.field499.toLowerCase();
      ClanChannel.field2954 = null;

      try {
         ClanChannel.field2954 = System.getProperty("jagex.userhome");
      } catch (Exception var35) {
      }

      if (ClanChannel.field2954 == null) {
         try {
            ClanChannel.field2954 = System.getProperty("user.home");
         } catch (Exception var34) {
         }
      }

      if (null != ClanChannel.field2954) {
         ClanChannel.field2954 = ClanChannel.field2954 + "/";
      }

      try {
         if (classZW.field7284.startsWith("win")) {
            if (ClanChannel.field2954 == null) {
               ClanChannel.field2954 = client.method2366("USERPROFILE");
            }
         } else if (null == ClanChannel.field2954) {
            ClanChannel.field2954 = client.method2366("HOME");
         }

         if (null != ClanChannel.field2954) {
            ClanChannel.field2954 = ClanChannel.field2954 + "/";
         }
      } catch (Exception var33) {
      }

      if (null == ClanChannel.field2954) {
         ClanChannel.field2954 = "~/";
      }

      classWQ.field6768 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", ClanChannel.field2954, "/tmp/", ""};
      classCV.field1305 = new String[]{".jagex_cache_" + MidiRequest.field4637 * 1602897005, ".file_store_" + MidiRequest.field4637 * 1602897005};

      label479:
      for (int var5 = 0; var5 < 4; var5++) {
         String var7 = 0 == var5 ? "" : "" + var5;
         classDB.field1379 = new File(ClanChannel.field2954, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
         String var8 = null;
         String var9 = null;
         boolean var10 = false;
         if (classDB.field1379.exists()) {
            classAAR var11 = null;

            try {
               var11 = new classAAR(classDB.field1379, "rw", 10000L);
               Buffer var12 = new Buffer((int)var11.method257(-153393736));

               while (702114061 * var12.offset < var12.array.length) {
                  int var13 = var11.method260(var12.array, var12.offset * 702114061, var12.array.length - 702114061 * var12.offset, -1397369950);
                  if (var13 == -1) {
                     throw new IOException();
                  }

                  var12.offset += -1095856699 * var13;
               }

               var12.offset = 0;
               int var61 = Buffer.method13039(var12, -346779531);
               if (var61 < 1 || var61 > 3) {
                  throw new IOException("" + var61);
               }

               int var14 = 0;
               if (var61 > 1) {
                  var14 = Buffer.method13039(var12, -346779531);
               }

               if (var61 <= 2) {
                  var8 = var12.method13077(1867167769);
                  if (1 == var14) {
                     var9 = var12.method13077(1315705290);
                  }
               } else {
                  var8 = Buffer.method13082(var12, 1500461334);
                  if (var14 == 1) {
                     var9 = Buffer.method13082(var12, -484778587);
                  }
               }
            } catch (Exception var39) {
               var39.printStackTrace();
            } finally {
               try {
                  if (null != var11) {
                     classAAR.method247(var11, (byte)1);
                  }
               } catch (IOException var31) {
               }
            }

            if (null != var8) {
               File var56 = new File(var8);
               if (!var56.exists()) {
                  var8 = null;
               }
            }

            if (null != var8) {
               File var57 = new File(var8, "test.dat");
               if (!classBB.method788(var57, true, 525752549)) {
                  var8 = null;
               }
            }
         }

         if (var8 == null && 0 == var5) {
            label452:
            for (int var53 = 0; var53 < classCV.field1305.length; var53++) {
               for (int var58 = 0; var58 < classWQ.field6768.length; var58++) {
                  File var62 = new File(classWQ.field6768[var58] + classCV.field1305[var53] + File.separatorChar + var0 + File.separatorChar);
                  if (var62.exists() && classBB.method788(new File(var62, "test.dat"), true, 1313050237)) {
                     var8 = var62.toString();
                     var10 = true;
                     break label452;
                  }
               }
            }
         }

         if (var8 == null) {
            var8 = ClanChannel.field2954
               + File.separatorChar
               + "jagexcache"
               + var7
               + File.separatorChar
               + var0
               + File.separatorChar
               + var2
               + File.separatorChar;
            var10 = true;
         }

         if (var9 != null) {
            File var54 = new File(var9);
            File var59 = new File(var8);

            try {
               File[] var63 = var54.listFiles();
               File[] var65 = var63;

               for (int var15 = 0; var15 < var65.length; var15++) {
                  File var16 = var65[var15];
                  File var17 = new File(var59, var16.getName());
                  boolean var18 = var16.renameTo(var17);
                  if (!var18) {
                     throw new IOException();
                  }
               }
            } catch (Exception var38) {
               var38.printStackTrace();
            }

            var10 = true;
         }

         if (var10) {
            File var55 = new File(var8);
            Object var60 = null;

            try {
               classAAR var64 = new classAAR(classDB.field1379, "rw", 10000L);
               Buffer var66 = new Buffer(500);
               Buffer.method12971(var66, 3, (byte)-103);
               Buffer.method12971(var66, null != var60 ? 1 : 0, (byte)-57);
               var66.method13001(var55.getPath(), -910745300);
               if (var60 != null) {
                  var66.method13001(var60.getPath(), -910745300);
               }

               var64.method242(var66.array, 0, 702114061 * var66.offset, -612629987);
               classAAR.method247(var64, (byte)1);
            } catch (IOException var32) {
               var32.printStackTrace();
            }
         }

         File var6 = new File(var8);
         classSL.field5975 = var6;
         if (!classSL.field5975.exists()) {
            classSL.field5975.mkdirs();
         }

         File[] var44 = classSL.field5975.listFiles();
         if (var44 != null) {
            File[] var47 = var44;

            for (int var50 = 0; var50 < var47.length; var50++) {
               File var52 = var47[var50];
               if (!classBB.method788(var52, false, -309035398)) {
                  continue label479;
               }
            }
         }
         break;
      }

      File var41 = classSL.field5975;
      classMT.field4586 = var41;
      if (!classMT.field4586.exists()) {
         throw new RuntimeException("");
      } else {
         classMT.field4580 = true;

         try {
            File var42 = new File(ClanChannel.field2954, "random.dat");
            if (var42.exists()) {
               field4490 = new classAAC(new classAAR(var42, "rw", 25L), 24, 0);
            } else {
               label403:
               for (int var45 = 0; var45 < classCV.field1305.length; var45++) {
                  for (int var48 = 0; var48 < classWQ.field6768.length; var48++) {
                     File var51 = new File(classWQ.field6768[var48] + classCV.field1305[var45] + File.separatorChar + "random.dat");
                     if (var51.exists()) {
                        field4490 = new classAAC(new classAAR(var51, "rw", 25L), 24, 0);
                        break label403;
                     }
                  }
               }
            }

            if (field4490 == null) {
               RandomAccessFile var46 = new RandomAccessFile(var42, "rw");
               int var49 = var46.read();
               var46.seek(0L);
               var46.write(var49);
               var46.seek(0L);
               var46.close();
               field4490 = new classAAC(new classAAR(var42, "rw", 25L), 24, 0);
            }
         } catch (IOException var37) {
         }

         field4488 = new classAAC(new classAAR(classBJ.method1113("main_file_cache.dat2", 140772158), "rw", 1048576000L), 5200, 0);
         field4489 = new classAAC(new classAAR(classBJ.method1113("main_file_cache.idx255", -493268328), "rw", 1048576L), 6000, 0);
         GraphicsObject.field477 = new classAAC[classUP.field6363 * -646722873];

         for (int var43 = 0; var43 < -646722873 * classUP.field6363; var43++) {
            GraphicsObject.field477[var43] = new classAAC(new classAAR(classBJ.method1113("main_file_cache.idx" + var43, 25814695), "rw", 1048576L), 6000, 0);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
   @ObfuscatedName("aa")
   public static void method7541(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (var1 != null && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      classUP.field6363 = var4 * -552347913;
      MidiRequest.field4637 = var3 * 381969765;

      try {
         Script.field499 = System.getProperty("os.name");
      } catch (Exception var36) {
         Script.field499 = "Unknown";
      }

      classZW.field7284 = Script.field499.toLowerCase();
      ClanChannel.field2954 = null;

      try {
         ClanChannel.field2954 = System.getProperty("jagex.userhome");
      } catch (Exception var35) {
      }

      if (ClanChannel.field2954 == null) {
         try {
            ClanChannel.field2954 = System.getProperty("user.home");
         } catch (Exception var34) {
         }
      }

      if (null != ClanChannel.field2954) {
         ClanChannel.field2954 = ClanChannel.field2954 + "/";
      }

      try {
         if (classZW.field7284.startsWith("win")) {
            if (ClanChannel.field2954 == null) {
               ClanChannel.field2954 = client.method2366("USERPROFILE");
            }
         } else if (null == ClanChannel.field2954) {
            ClanChannel.field2954 = client.method2366("HOME");
         }

         if (null != ClanChannel.field2954) {
            ClanChannel.field2954 = ClanChannel.field2954 + "/";
         }
      } catch (Exception var33) {
      }

      if (null == ClanChannel.field2954) {
         ClanChannel.field2954 = "~/";
      }

      classWQ.field6768 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", ClanChannel.field2954, "/tmp/", ""};
      classCV.field1305 = new String[]{".jagex_cache_" + MidiRequest.field4637 * 1555860074, ".file_store_" + MidiRequest.field4637 * -1613496402};

      label479:
      for (int var5 = 0; var5 < 4; var5++) {
         String var7 = 0 == var5 ? "" : "" + var5;
         classDB.field1379 = new File(ClanChannel.field2954, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
         String var8 = null;
         String var9 = null;
         boolean var10 = false;
         if (classDB.field1379.exists()) {
            classAAR var11 = null;

            try {
               var11 = new classAAR(classDB.field1379, "rw", 10000L);
               Buffer var12 = new Buffer((int)var11.method257(-153393736));

               while (-33347134 * var12.offset < var12.array.length) {
                  int var13 = var11.method260(var12.array, var12.offset * 430135352, var12.array.length - 1255560002 * var12.offset, -1397369950);
                  if (var13 == -1) {
                     throw new IOException();
                  }

                  var12.offset += -1095856699 * var13;
               }

               var12.offset = 0;
               int var61 = Buffer.method13039(var12, -346779531);
               if (var61 < 1 || var61 > 3) {
                  throw new IOException("" + var61);
               }

               int var14 = 0;
               if (var61 > 1) {
                  var14 = Buffer.method13039(var12, -346779531);
               }

               if (var61 <= 2) {
                  var8 = var12.method13077(-1060298622);
                  if (1 == var14) {
                     var9 = var12.method13077(-1047636549);
                  }
               } else {
                  var8 = Buffer.method13082(var12, -53657240);
                  if (var14 == 1) {
                     var9 = Buffer.method13082(var12, 1584755635);
                  }
               }
            } catch (Exception var39) {
               var39.printStackTrace();
            } finally {
               try {
                  if (null != var11) {
                     classAAR.method247(var11, (byte)1);
                  }
               } catch (IOException var31) {
               }
            }

            if (null != var8) {
               File var56 = new File(var8);
               if (!var56.exists()) {
                  var8 = null;
               }
            }

            if (null != var8) {
               File var57 = new File(var8, "test.dat");
               if (!classBB.method788(var57, true, 1345804784)) {
                  var8 = null;
               }
            }
         }

         if (var8 == null && 0 == var5) {
            label452:
            for (int var53 = 0; var53 < classCV.field1305.length; var53++) {
               for (int var58 = 0; var58 < classWQ.field6768.length; var58++) {
                  File var62 = new File(classWQ.field6768[var58] + classCV.field1305[var53] + File.separatorChar + var0 + File.separatorChar);
                  if (var62.exists() && classBB.method788(new File(var62, "test.dat"), true, 913942607)) {
                     var8 = var62.toString();
                     var10 = true;
                     break label452;
                  }
               }
            }
         }

         if (var8 == null) {
            var8 = ClanChannel.field2954
               + File.separatorChar
               + "jagexcache"
               + var7
               + File.separatorChar
               + var0
               + File.separatorChar
               + var2
               + File.separatorChar;
            var10 = true;
         }

         if (var9 != null) {
            File var54 = new File(var9);
            File var59 = new File(var8);

            try {
               File[] var63 = var54.listFiles();
               File[] var65 = var63;

               for (int var15 = 0; var15 < var65.length; var15++) {
                  File var16 = var65[var15];
                  File var17 = new File(var59, var16.getName());
                  boolean var18 = var16.renameTo(var17);
                  if (!var18) {
                     throw new IOException();
                  }
               }
            } catch (Exception var38) {
               var38.printStackTrace();
            }

            var10 = true;
         }

         if (var10) {
            File var55 = new File(var8);
            Object var60 = null;

            try {
               classAAR var64 = new classAAR(classDB.field1379, "rw", 10000L);
               Buffer var66 = new Buffer(-1871609904);
               Buffer.method12971(var66, 3, (byte)-62);
               Buffer.method12971(var66, null != var60 ? 1 : 0, (byte)-128);
               var66.method13001(var55.getPath(), -910745300);
               if (var60 != null) {
                  var66.method13001(var60.getPath(), -910745300);
               }

               var64.method242(var66.array, 0, 702114061 * var66.offset, -1391552243);
               classAAR.method247(var64, (byte)1);
            } catch (IOException var32) {
               var32.printStackTrace();
            }
         }

         File var6 = new File(var8);
         classSL.field5975 = var6;
         if (!classSL.field5975.exists()) {
            classSL.field5975.mkdirs();
         }

         File[] var44 = classSL.field5975.listFiles();
         if (var44 != null) {
            File[] var47 = var44;

            for (int var50 = 0; var50 < var47.length; var50++) {
               File var52 = var47[var50];
               if (!classBB.method788(var52, false, -713999436)) {
                  continue label479;
               }
            }
         }
         break;
      }

      File var41 = classSL.field5975;
      classMT.field4586 = var41;
      if (!classMT.field4586.exists()) {
         throw new RuntimeException("");
      } else {
         classMT.field4580 = true;

         try {
            File var42 = new File(ClanChannel.field2954, "random.dat");
            if (var42.exists()) {
               field4490 = new classAAC(new classAAR(var42, "rw", 25L), 24, 0);
            } else {
               label403:
               for (int var45 = 0; var45 < classCV.field1305.length; var45++) {
                  for (int var48 = 0; var48 < classWQ.field6768.length; var48++) {
                     File var51 = new File(classWQ.field6768[var48] + classCV.field1305[var45] + File.separatorChar + "random.dat");
                     if (var51.exists()) {
                        field4490 = new classAAC(new classAAR(var51, "rw", 25L), 24, 0);
                        break label403;
                     }
                  }
               }
            }

            if (field4490 == null) {
               RandomAccessFile var46 = new RandomAccessFile(var42, "rw");
               int var49 = var46.read();
               var46.seek(0L);
               var46.write(var49);
               var46.seek(0L);
               var46.close();
               field4490 = new classAAC(new classAAR(var42, "rw", 25L), 24, 0);
            }
         } catch (IOException var37) {
         }

         field4488 = new classAAC(new classAAR(classBJ.method1113("main_file_cache.dat2", -503731367), "rw", 1048576000L), 585330237, 0);
         field4489 = new classAAC(new classAAR(classBJ.method1113("main_file_cache.idx255", -339682670), "rw", 1048576L), 6000, 0);
         GraphicsObject.field477 = new classAAC[classUP.field6363 * -646722873];

         for (int var43 = 0; var43 < -646722873 * classUP.field6363; var43++) {
            GraphicsObject.field477[var43] = new classAAC(
               new classAAR(classBJ.method1113("main_file_cache.idx" + var43, -742991889), "rw", 1048576L), 2029690893, 0
            );
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   public static void method7557() {
      try {
         classAAC.method132(field4488, -220896546);

         for (int var0 = 0; var0 < -646722873 * classUP.field6363; var0++) {
            classAAC.method132(GraphicsObject.field477[var0], 890084153);
         }

         classAAC.method132(field4489, 442594466);
         classAAC.method132(field4490, 99744384);
      } catch (Exception var1) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/io/File;Z)Z")
   @ObfuscatedName("al")
   static boolean method7543(File var0, boolean var1) {
      try {
         RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
         int var3 = var2.read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if (var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/io/File;Z)Z")
   @ObfuscatedName("aj")
   static boolean method7544(File var0, boolean var1) {
      try {
         RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
         int var3 = var2.read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if (var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/io/File;Z)Z")
   @ObfuscatedName("ay")
   static boolean method7545(File var0, boolean var1) {
      try {
         RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
         int var3 = var2.read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if (var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/io/File;Z)Z")
   @ObfuscatedName("aq")
   static boolean method7546(File var0, boolean var1) {
      try {
         RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
         int var3 = var2.read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if (var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Laar;")
   @ObfuscatedName("ad")
   public static classAAR method7547(String var0, String var1, boolean var2) {
      File var3 = new File(classSL.field5975, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            return new classAAR(var3, "rw", 10000L);
         } catch (IOException var9) {
         }
      }

      String var4 = "";
      if (33 == -471465215 * MidiRequest.field4637) {
         var4 = "_rc";
      } else if (MidiRequest.field4637 * -1646067518 == 2142874692) {
         var4 = "_wip";
      }

      File var5 = new File(ClanChannel.field2954, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      if (!var2 && var5.exists()) {
         try {
            return new classAAR(var5, "rw", 10000L);
         } catch (IOException var8) {
         }
      }

      try {
         return new classAAR(var3, "rw", 10000L);
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
   @ObfuscatedName("ax")
   public static void method7542(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (var1 != null && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      classUP.field6363 = var4 * -552347913;
      MidiRequest.field4637 = var3 * 381969765;

      try {
         Script.field499 = System.getProperty("os.name");
      } catch (Exception var36) {
         Script.field499 = "Unknown";
      }

      classZW.field7284 = Script.field499.toLowerCase();
      ClanChannel.field2954 = null;

      try {
         ClanChannel.field2954 = System.getProperty("jagex.userhome");
      } catch (Exception var35) {
      }

      if (ClanChannel.field2954 == null) {
         try {
            ClanChannel.field2954 = System.getProperty("user.home");
         } catch (Exception var34) {
         }
      }

      if (null != ClanChannel.field2954) {
         ClanChannel.field2954 = ClanChannel.field2954 + "/";
      }

      try {
         if (classZW.field7284.startsWith("win")) {
            if (ClanChannel.field2954 == null) {
               ClanChannel.field2954 = client.method2366("USERPROFILE");
            }
         } else if (null == ClanChannel.field2954) {
            ClanChannel.field2954 = client.method2366("HOME");
         }

         if (null != ClanChannel.field2954) {
            ClanChannel.field2954 = ClanChannel.field2954 + "/";
         }
      } catch (Exception var33) {
      }

      if (null == ClanChannel.field2954) {
         ClanChannel.field2954 = "~/";
      }

      classWQ.field6768 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", ClanChannel.field2954, "/tmp/", ""};
      classCV.field1305 = new String[]{".jagex_cache_" + MidiRequest.field4637 * 1602897005, ".file_store_" + MidiRequest.field4637 * 1213339710};

      label479:
      for (int var5 = 0; var5 < 4; var5++) {
         String var7 = 0 == var5 ? "" : "" + var5;
         classDB.field1379 = new File(ClanChannel.field2954, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
         String var8 = null;
         String var9 = null;
         boolean var10 = false;
         if (classDB.field1379.exists()) {
            classAAR var11 = null;

            try {
               var11 = new classAAR(classDB.field1379, "rw", 10000L);
               Buffer var12 = new Buffer((int)var11.method257(-153393736));

               while (-1068916252 * var12.offset < var12.array.length) {
                  int var13 = var11.method260(var12.array, var12.offset * -298238560, var12.array.length - -1267189305 * var12.offset, -1397369950);
                  if (var13 == -1) {
                     throw new IOException();
                  }

                  var12.offset += -944789764 * var13;
               }

               var12.offset = 0;
               int var61 = Buffer.method13039(var12, -346779531);
               if (var61 < 1 || var61 > 3) {
                  throw new IOException("" + var61);
               }

               int var14 = 0;
               if (var61 > 1) {
                  var14 = Buffer.method13039(var12, -346779531);
               }

               if (var61 <= 2) {
                  var8 = var12.method13077(225797223);
                  if (1 == var14) {
                     var9 = var12.method13077(-1528834759);
                  }
               } else {
                  var8 = Buffer.method13082(var12, 264384070);
                  if (var14 == 1) {
                     var9 = Buffer.method13082(var12, 1274257698);
                  }
               }
            } catch (Exception var39) {
               var39.printStackTrace();
            } finally {
               try {
                  if (null != var11) {
                     classAAR.method247(var11, (byte)1);
                  }
               } catch (IOException var31) {
               }
            }

            if (null != var8) {
               File var56 = new File(var8);
               if (!var56.exists()) {
                  var8 = null;
               }
            }

            if (null != var8) {
               File var57 = new File(var8, "test.dat");
               if (!classBB.method788(var57, true, -1098388039)) {
                  var8 = null;
               }
            }
         }

         if (var8 == null && 0 == var5) {
            label452:
            for (int var53 = 0; var53 < classCV.field1305.length; var53++) {
               for (int var58 = 0; var58 < classWQ.field6768.length; var58++) {
                  File var62 = new File(classWQ.field6768[var58] + classCV.field1305[var53] + File.separatorChar + var0 + File.separatorChar);
                  if (var62.exists() && classBB.method788(new File(var62, "test.dat"), true, -1414983483)) {
                     var8 = var62.toString();
                     var10 = true;
                     break label452;
                  }
               }
            }
         }

         if (var8 == null) {
            var8 = ClanChannel.field2954
               + File.separatorChar
               + "jagexcache"
               + var7
               + File.separatorChar
               + var0
               + File.separatorChar
               + var2
               + File.separatorChar;
            var10 = true;
         }

         if (var9 != null) {
            File var54 = new File(var9);
            File var59 = new File(var8);

            try {
               File[] var63 = var54.listFiles();
               File[] var65 = var63;

               for (int var15 = 0; var15 < var65.length; var15++) {
                  File var16 = var65[var15];
                  File var17 = new File(var59, var16.getName());
                  boolean var18 = var16.renameTo(var17);
                  if (!var18) {
                     throw new IOException();
                  }
               }
            } catch (Exception var38) {
               var38.printStackTrace();
            }

            var10 = true;
         }

         if (var10) {
            File var55 = new File(var8);
            Object var60 = null;

            try {
               classAAR var64 = new classAAR(classDB.field1379, "rw", 10000L);
               Buffer var66 = new Buffer(500);
               Buffer.method12971(var66, 3, (byte)-85);
               Buffer.method12971(var66, null != var60 ? 1 : 0, (byte)-103);
               var66.method13001(var55.getPath(), -910745300);
               if (var60 != null) {
                  var66.method13001(var60.getPath(), -910745300);
               }

               var64.method242(var66.array, 0, -1564525175 * var66.offset, -1186495551);
               classAAR.method247(var64, (byte)1);
            } catch (IOException var32) {
               var32.printStackTrace();
            }
         }

         File var6 = new File(var8);
         classSL.field5975 = var6;
         if (!classSL.field5975.exists()) {
            classSL.field5975.mkdirs();
         }

         File[] var44 = classSL.field5975.listFiles();
         if (var44 != null) {
            File[] var47 = var44;

            for (int var50 = 0; var50 < var47.length; var50++) {
               File var52 = var47[var50];
               if (!classBB.method788(var52, false, 1460538998)) {
                  continue label479;
               }
            }
         }
         break;
      }

      File var41 = classSL.field5975;
      classMT.field4586 = var41;
      if (!classMT.field4586.exists()) {
         throw new RuntimeException("");
      } else {
         classMT.field4580 = true;

         try {
            File var42 = new File(ClanChannel.field2954, "random.dat");
            if (var42.exists()) {
               field4490 = new classAAC(new classAAR(var42, "rw", 25L), 24, 0);
            } else {
               label403:
               for (int var45 = 0; var45 < classCV.field1305.length; var45++) {
                  for (int var48 = 0; var48 < classWQ.field6768.length; var48++) {
                     File var51 = new File(classWQ.field6768[var48] + classCV.field1305[var45] + File.separatorChar + "random.dat");
                     if (var51.exists()) {
                        field4490 = new classAAC(new classAAR(var51, "rw", 25L), 24, 0);
                        break label403;
                     }
                  }
               }
            }

            if (field4490 == null) {
               RandomAccessFile var46 = new RandomAccessFile(var42, "rw");
               int var49 = var46.read();
               var46.seek(0L);
               var46.write(var49);
               var46.seek(0L);
               var46.close();
               field4490 = new classAAC(new classAAR(var42, "rw", 25L), 24, 0);
            }
         } catch (IOException var37) {
         }

         field4488 = new classAAC(new classAAR(classBJ.method1113("main_file_cache.dat2", 423830089), "rw", 1048576000L), 5200, 0);
         field4489 = new classAAC(new classAAR(classBJ.method1113("main_file_cache.idx255", -91468902), "rw", 1048576L), -334375416, 0);
         GraphicsObject.field477 = new classAAC[classUP.field6363 * -646722873];

         for (int var43 = 0; var43 < 1070940093 * classUP.field6363; var43++) {
            GraphicsObject.field477[var43] = new classAAC(new classAAR(classBJ.method1113("main_file_cache.idx" + var43, -589539822), "rw", 1048576L), 6000, 0);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("au")
   public static byte[] method7549() {
      byte[] var0 = new byte[24];

      try {
         field4490.method138(0L);
         field4490.method142(var0, -1230669865);
         int var1 = 0;

         while (var1 < 24 && 0 == var0[var1]) {
            var1++;
         }

         if (var1 >= 24) {
            throw new IOException();
         }
      } catch (Exception var3) {
         for (int var2 = 0; var2 < 24; var2++) {
            var0[var2] = -1;
         }
      }

      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ai")
   public static byte[] method7550() {
      byte[] var0 = new byte[24];

      try {
         field4490.method138(0L);
         field4490.method142(var0, -434238545);
         int var1 = 0;

         while (var1 < 24 && 0 == var0[var1]) {
            var1++;
         }

         if (var1 >= 24) {
            throw new IOException();
         }
      } catch (Exception var3) {
         for (int var2 = 0; var2 < 24; var2++) {
            var0[var2] = -1;
         }
      }

      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ar")
   public static byte[] method7551() {
      byte[] var0 = new byte[24];

      try {
         field4490.method138(0L);
         field4490.method142(var0, -906904590);
         int var1 = 0;

         while (var1 < 24 && 0 == var0[var1]) {
            var1++;
         }

         if (var1 >= 24) {
            throw new IOException();
         }
      } catch (Exception var3) {
         for (int var2 = 0; var2 < 24; var2++) {
            var0[var2] = -1;
         }
      }

      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("aw")
   public static byte[] method7552() {
      byte[] var0 = new byte[24];

      try {
         field4490.method138(0L);
         field4490.method142(var0, -1837703969);
         int var1 = 0;

         while (var1 < 24 && 0 == var0[var1]) {
            var1++;
         }

         if (var1 >= 24) {
            throw new IOException();
         }
      } catch (Exception var3) {
         for (int var2 = 0; var2 < 24; var2++) {
            var0[var2] = -1;
         }
      }

      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("ak")
   public static void method7554(Buffer var0, int var1) {
      if (field4490 != null) {
         try {
            field4490.method138(0L);
            field4490.method153(var0.array, var1, 24, -1927671615);
         } catch (Exception var3) {
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("av")
   public static void method7555(Buffer var0, int var1) {
      if (field4490 != null) {
         try {
            field4490.method138(0L);
            field4490.method153(var0.array, var1, 24, 578153911);
         } catch (Exception var3) {
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Laar;")
   @ObfuscatedName("ap")
   public static classAAR method7548(String var0, String var1, boolean var2) {
      File var3 = new File(classSL.field5975, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            return new classAAR(var3, "rw", 10000L);
         } catch (IOException var9) {
         }
      }

      String var4 = "";
      if (33 == 2015166692 * MidiRequest.field4637) {
         var4 = "_rc";
      } else if (MidiRequest.field4637 * -1462858247 == 2019241592) {
         var4 = "_wip";
      }

      File var5 = new File(ClanChannel.field2954, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      if (!var2 && var5.exists()) {
         try {
            return new classAAR(var5, "rw", 10000L);
         } catch (IOException var8) {
         }
      }

      try {
         return new classAAR(var3, "rw", 10000L);
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   classME() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("an")
   public static void method7556(Buffer var0, int var1) {
      if (field4490 != null) {
         try {
            field4490.method138(0L);
            field4490.method153(var0.array, var1, 24, 841578820);
         } catch (Exception var3) {
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ah")
   public static void method7558() {
      try {
         classAAC.method132(field4488, -1599004065);

         for (int var0 = 0; var0 < 75685140 * classUP.field6363; var0++) {
            classAAC.method132(GraphicsObject.field477[var0], 95779239);
         }

         classAAC.method132(field4489, -138619742);
         classAAC.method132(field4490, -95478724);
      } catch (Exception var1) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bn")
   public static void method7559() {
      try {
         classAAC.method132(field4488, 173897938);

         for (int var0 = 0; var0 < -646722873 * classUP.field6363; var0++) {
            classAAC.method132(GraphicsObject.field477[var0], -1428403396);
         }

         classAAC.method132(field4489, -1464860951);
         classAAC.method132(field4490, 1015118938);
      } catch (Exception var1) {
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZB)I")
   @ObfuscatedName("aw")
   static int method7561(int var0, Script var1, boolean var2, byte var3) {
      try {
         Widget var10000;
         if (var2) {
            if (var3 == 12) {
               throw new IllegalStateException();
            }

            var10000 = classSZ.field6110;
         } else {
            var10000 = TileItem.field1558;
         }

         Widget var4 = var10000;
         if (1500 == var0) {
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4281 * 744286069;
            return 1;
         } else if (1501 == var0) {
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1570844829 * var4.field4257;
            return 1;
         } else if (1502 == var0) {
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1115597881 * var4.field4249;
            return 1;
         } else if (1503 == var0) {
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 293773697 * var4.field4259;
            return 1;
         } else if (1504 == var0) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               int[] var9 = classBB.field323;
               int var10001 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               byte var10002;
               if (var4.field4289) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var9[var10001] = var10002;
               return 1;
            }
         } else if (var0 == 1505) {
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1502647899 * var4.field4342;
            return 1;
         } else if (var0 == 1506) {
            if (var3 == 12) {
               throw new IllegalStateException();
            } else {
               int var5 = var4.field4342 * -1502647899;
               if (var5 == -1) {
                  if (var3 == 12) {
                     throw new IllegalStateException();
                  }

                  classVV var6 = classWK.field6691;

                  for (InterfaceParent var7 = (InterfaceParent)var6.field6613.method13375();
                     null != var7;
                     var7 = (InterfaceParent)IndexedObjectSet.method13401(var6.field6613)
                  ) {
                     if (var3 == 12) {
                        throw new IllegalStateException();
                     }

                     if (var4.field4329 * -1163656551 >> 16 == var7.field5276 * 2023647411) {
                        var5 = (int)var7.field6552;
                        break;
                     }
                  }
               }

               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var5;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "me.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("ac")
   static String method7560(String var0, int var1) {
      try {
         if (var0.startsWith("\"")) {
            if (var1 == 2131153158) {
               throw new IllegalStateException();
            }

            if (var0.length() == 1) {
               if (var1 == 2131153158) {
                  throw new IllegalStateException();
               }

               var0 = "";
            } else if (var0.endsWith("\"") && !var0.endsWith("\\\"")) {
               if (var1 == 2131153158) {
                  throw new IllegalStateException();
               }

               var0 = var0.substring(1, var0.length() - 1);
            }
         }

         return var0.replaceAll("\\\\\"", "\"");
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "me.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIII)Luz;")
   @ObfuscatedName("cx")
   static classUZ method7562(WorldView var0, int var1, int var2, int var3, int var4) {
      try {
         int var5 = var1 * 128;
         int var6 = 128 * var2;
         if (classSG.method10419(var0, var3, var1, var2, 1598583345)) {
            if (var4 >= 702114061) {
               throw new IllegalStateException();
            }

            var3++;
         }

         classUZ var7 = classIK.method6218(var5, var0.field1688[var3][var1][var2], var6, (byte)6);
         classUZ var8 = classIK.method6218(128 + var5, var0.field1688[var3][1 + var1][var2], var6, (byte)28);
         classUZ var9 = classIK.method6218(128 + var5, var0.field1688[var3][var1 + 1][1 + var2], 128 + var6, (byte)67);
         classUZ var10 = classIK.method6218(var5, var0.field1688[var3][var1][var2 + 1], var6 + 128, (byte)52);
         if (var7.field6425 == var8.field6425) {
            if (var4 >= 702114061) {
               throw new IllegalStateException();
            }

            if (var7.field6425 == var9.field6425) {
               if (var4 >= 702114061) {
                  throw new IllegalStateException();
               }

               if (var10.field6425 == var7.field6425) {
                  if (var4 >= 702114061) {
                     throw new IllegalStateException();
                  }

                  classUZ.method11727(var7, 1742134569);
                  classUZ.method11727(var8, 1700571816);
                  classUZ.method11727(var9, 1852589905);
                  classUZ.method11727(var10, 2107937044);
                  return classUZ.field6433;
               }
            }
         }

         classUZ var11 = classWN.method12606(var8, var7, (byte)1);
         classUZ var12 = classWN.method12606(var10, var7, (byte)1);
         classUZ var13 = classIZ.method6340(var11, var12, -1071508276);
         classUZ.method11727(var11, 1923966934);
         classUZ.method11727(var12, 1770747509);
         classUZ var14 = classWN.method12606(var8, var9, (byte)1);
         classUZ var15 = classWN.method12606(var10, var9, (byte)1);
         classUZ var16 = classIZ.method6340(var15, var14, 1684977021);
         classUZ.method11727(var14, 2079647756);
         classUZ.method11727(var15, 1687363155);
         classUZ.method11727(var7, 2120986997);
         classUZ.method11727(var8, 2052194492);
         classUZ.method11727(var9, 1836979318);
         classUZ.method11727(var10, 1905017989);
         classUZ var18 = WorldMapArea.method5840(var13, (byte)-15);
         var18.method11753(var16, -664943379);
         classUZ.method11727(var13, 1694843595);
         classUZ.method11727(var16, 1887302824);
         classUZ var20 = classHZ.method6135(16777216);
         float var21 = 1.0F / var18.method11774(-1808401369);
         var20.field6427 = var18.field6427 * var21;
         var20.field6425 = var21 * var18.field6425;
         var20.field6426 = var21 * var18.field6426;
         classUZ.method11727(var18, 1932680200);
         return var20;
      } catch (RuntimeException var22) {
         throw classEG.newRunException(var22, "me.cx(" + ')');
      }
   }
}
