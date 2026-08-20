import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("in")
public class JagexCache {
   @ObfuscatedSignature(descriptor = "Lws;")
   @ObfuscatedName("az")
   public static BufferedFile JagexCache_idx255File = null;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field2525 = 1048576000;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field2523 = 1048576;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final String field2529 = "main_file_cache.dat2";
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field2526 = 24;
   @ObfuscatedSignature(descriptor = "Lws;")
   @ObfuscatedName("au")
   public static BufferedFile JagexCache_dat2File = null;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final String field2530 = "main_file_cache.idx";
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field2524 = 0;
   @ObfuscatedName("ac")
   static String userHomeDirectory;
   @ObfuscatedSignature(descriptor = "Lws;")
   @ObfuscatedName("ah")
   public static BufferedFile JagexCache_randomDat = null;
   @ObfuscatedName("oh")
   static byte[][] field2531;
   @ToRemove(unused = "true")
   @ObfuscatedName("cv")
   static final int field2527 = 1;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   public static void method4940() {
      try {
         BufferedFile.method11849(JagexCache_dat2File, (short)-21110);

         for (int var0 = 0; var0 < -808607155 * class134.field1817; var0++) {
            BufferedFile.method11849(UserComparator9.JagexCache_idxFiles[var0], (short)-19600);
         }

         BufferedFile.method11849(JagexCache_idx255File, (short)-8113);
         BufferedFile.method11849(JagexCache_randomDat, (short)-6512);
      } catch (Exception var1) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("aa")
   public static void method4939(Buffer var0, int var1) {
      if (null != JagexCache_randomDat) {
         try {
            JagexCache_randomDat.seek(0L);
            JagexCache_randomDat.write(var0.array, var1, 24, -1507952609);
         } catch (Exception var3) {
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
   @ObfuscatedName("ap")
   public static void method4923(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (null != var1 && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      class134.field1817 = 1233151621 * var4;
      class224.cacheGamebuild = 1582662335 * var3;

      try {
         EnumComposition.osName = System.getProperty("os.name");
      } catch (Exception var13) {
         EnumComposition.osName = "Unknown";
      }

      AttackOption.osNameLowercase = EnumComposition.osName.toLowerCase();
      userHomeDirectory = null;

      try {
         userHomeDirectory = System.getProperty("jagex.userhome");
      } catch (Exception var12) {
      }

      if (userHomeDirectory == null) {
         try {
            userHomeDirectory = System.getProperty("user.home");
         } catch (Exception var11) {
         }
      }

      if (userHomeDirectory != null) {
         userHomeDirectory = userHomeDirectory + "/";
      }

      try {
         if (AttackOption.osNameLowercase.startsWith("win")) {
            if (userHomeDirectory == null) {
               userHomeDirectory = client.method2321("USERPROFILE");
            }
         } else if (userHomeDirectory == null) {
            userHomeDirectory = client.method2321("HOME");
         }

         if (null != userHomeDirectory) {
            userHomeDirectory = userHomeDirectory + "/";
         }
      } catch (Exception var10) {
      }

      if (null == userHomeDirectory) {
         userHomeDirectory = "~/";
      }

      classWO.field6405 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", userHomeDirectory, "/tmp/", ""};
      class201.field2288 = new String[]{".jagex_cache_" + -1114182337 * class224.cacheGamebuild, ".file_store_" + class224.cacheGamebuild * -1114182337};

      label95:
      for (int var5 = 0; var5 < 4; var5++) {
         class452.cacheDir = class137.method4003(var0, var2, var5, (byte)-79);
         if (!class452.cacheDir.exists()) {
            class452.cacheDir.mkdirs();
         }

         File[] var6 = class452.cacheDir.listFiles();
         if (var6 == null) {
            break;
         }

         File[] var7 = var6;

         for (int var8 = 0; var8 < var7.length; var8++) {
            File var9 = var7[var8];
            if (!class194.method4478(var9, false, 2127006574)) {
               continue label95;
            }
         }
         break;
      }

      class107.method3815(class452.cacheDir, -1719365016);
      class184.method4485((byte)6);
      JagexCache_dat2File = new BufferedFile(new AccessFile(KeyHandler.getFile("main_file_cache.dat2", (short)28971), "rw", 1048576000L), 5200, 0);
      JagexCache_idx255File = new BufferedFile(new AccessFile(KeyHandler.getFile("main_file_cache.idx255", (short)29827), "rw", 1048576L), 6000, 0);
      UserComparator9.JagexCache_idxFiles = new BufferedFile[-808607155 * class134.field1817];

      for (int var14 = 0; var14 < class134.field1817 * -808607155; var14++) {
         UserComparator9.JagexCache_idxFiles[var14] = new BufferedFile(
            new AccessFile(KeyHandler.getFile("main_file_cache.idx" + var14, (short)20860), "rw", 1048576L), 6000, 0
         );
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
   @ObfuscatedName("ay")
   public static void method4924(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (null != var1 && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      class134.field1817 = 1233151621 * var4;
      class224.cacheGamebuild = 1582662335 * var3;

      try {
         EnumComposition.osName = System.getProperty("os.name");
      } catch (Exception var13) {
         EnumComposition.osName = "Unknown";
      }

      AttackOption.osNameLowercase = EnumComposition.osName.toLowerCase();
      userHomeDirectory = null;

      try {
         userHomeDirectory = System.getProperty("jagex.userhome");
      } catch (Exception var12) {
      }

      if (userHomeDirectory == null) {
         try {
            userHomeDirectory = System.getProperty("user.home");
         } catch (Exception var11) {
         }
      }

      if (userHomeDirectory != null) {
         userHomeDirectory = userHomeDirectory + "/";
      }

      try {
         if (AttackOption.osNameLowercase.startsWith("win")) {
            if (userHomeDirectory == null) {
               userHomeDirectory = client.method2321("USERPROFILE");
            }
         } else if (userHomeDirectory == null) {
            userHomeDirectory = client.method2321("HOME");
         }

         if (null != userHomeDirectory) {
            userHomeDirectory = userHomeDirectory + "/";
         }
      } catch (Exception var10) {
      }

      if (null == userHomeDirectory) {
         userHomeDirectory = "~/";
      }

      classWO.field6405 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", userHomeDirectory, "/tmp/", ""};
      class201.field2288 = new String[]{".jagex_cache_" + -1114182337 * class224.cacheGamebuild, ".file_store_" + class224.cacheGamebuild * -1114182337};

      label95:
      for (int var5 = 0; var5 < 4; var5++) {
         class452.cacheDir = class137.method4003(var0, var2, var5, (byte)-10);
         if (!class452.cacheDir.exists()) {
            class452.cacheDir.mkdirs();
         }

         File[] var6 = class452.cacheDir.listFiles();
         if (var6 == null) {
            break;
         }

         File[] var7 = var6;

         for (int var8 = 0; var8 < var7.length; var8++) {
            File var9 = var7[var8];
            if (!class194.method4478(var9, false, 1962247008)) {
               continue label95;
            }
         }
         break;
      }

      class107.method3815(class452.cacheDir, 1586307690);
      class184.method4485((byte)-18);
      JagexCache_dat2File = new BufferedFile(new AccessFile(KeyHandler.getFile("main_file_cache.dat2", (short)8785), "rw", 1048576000L), 5200, 0);
      JagexCache_idx255File = new BufferedFile(new AccessFile(KeyHandler.getFile("main_file_cache.idx255", (short)21266), "rw", 1048576L), 6000, 0);
      UserComparator9.JagexCache_idxFiles = new BufferedFile[-808607155 * class134.field1817];

      for (int var14 = 0; var14 < class134.field1817 * -808607155; var14++) {
         UserComparator9.JagexCache_idxFiles[var14] = new BufferedFile(
            new AccessFile(KeyHandler.getFile("main_file_cache.idx" + var14, (short)4678), "rw", 1048576L), 6000, 0
         );
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
   @ObfuscatedName("au")
   public static void method4925(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (null != var1 && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      class134.field1817 = 1233151621 * var4;
      class224.cacheGamebuild = 1582662335 * var3;

      try {
         EnumComposition.osName = System.getProperty("os.name");
      } catch (Exception var13) {
         EnumComposition.osName = "Unknown";
      }

      AttackOption.osNameLowercase = EnumComposition.osName.toLowerCase();
      userHomeDirectory = null;

      try {
         userHomeDirectory = System.getProperty("jagex.userhome");
      } catch (Exception var12) {
      }

      if (userHomeDirectory == null) {
         try {
            userHomeDirectory = System.getProperty("user.home");
         } catch (Exception var11) {
         }
      }

      if (userHomeDirectory != null) {
         userHomeDirectory = userHomeDirectory + "/";
      }

      try {
         if (AttackOption.osNameLowercase.startsWith("win")) {
            if (userHomeDirectory == null) {
               userHomeDirectory = client.method2321("USERPROFILE");
            }
         } else if (userHomeDirectory == null) {
            userHomeDirectory = client.method2321("HOME");
         }

         if (null != userHomeDirectory) {
            userHomeDirectory = userHomeDirectory + "/";
         }
      } catch (Exception var10) {
      }

      if (null == userHomeDirectory) {
         userHomeDirectory = "~/";
      }

      classWO.field6405 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", userHomeDirectory, "/tmp/", ""};
      class201.field2288 = new String[]{".jagex_cache_" + -1114182337 * class224.cacheGamebuild, ".file_store_" + class224.cacheGamebuild * -1114182337};

      label95:
      for (int var5 = 0; var5 < 4; var5++) {
         class452.cacheDir = class137.method4003(var0, var2, var5, (byte)-17);
         if (!class452.cacheDir.exists()) {
            class452.cacheDir.mkdirs();
         }

         File[] var6 = class452.cacheDir.listFiles();
         if (var6 == null) {
            break;
         }

         File[] var7 = var6;

         for (int var8 = 0; var8 < var7.length; var8++) {
            File var9 = var7[var8];
            if (!class194.method4478(var9, false, 1903749296)) {
               continue label95;
            }
         }
         break;
      }

      class107.method3815(class452.cacheDir, -771898669);
      class184.method4485((byte)-9);
      JagexCache_dat2File = new BufferedFile(new AccessFile(KeyHandler.getFile("main_file_cache.dat2", (short)4153), "rw", 1048576000L), 5200, 0);
      JagexCache_idx255File = new BufferedFile(new AccessFile(KeyHandler.getFile("main_file_cache.idx255", (short)20301), "rw", 1048576L), 6000, 0);
      UserComparator9.JagexCache_idxFiles = new BufferedFile[-808607155 * class134.field1817];

      for (int var14 = 0; var14 < class134.field1817 * -808607155; var14++) {
         UserComparator9.JagexCache_idxFiles[var14] = new BufferedFile(
            new AccessFile(KeyHandler.getFile("main_file_cache.idx" + var14, (short)24075), "rw", 1048576L), 6000, 0
         );
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
   @ObfuscatedName("ad")
   static File method4927(String var0, String var1, int var2) {
      String var3 = var2 == 0 ? "" : "" + var2;
      SoundCache.field1483 = new File(userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
      String var4 = null;
      String var5 = null;
      boolean var6 = false;
      if (SoundCache.field1483.exists()) {
         AccessFile var7 = null;
         boolean var21 = false /* VF: Semaphore variable */;

         label252: {
            label251: {
               try {
                  var21 = true;
                  var7 = new AccessFile(SoundCache.field1483, "rw", 10000L);
                  Buffer var8 = new Buffer((int)AccessFile.method11809(var7, (byte)-25));

                  while (var8.offset * 2108391709 < var8.array.length) {
                     int var9 = var7.read(var8.array, var8.offset * 2108391709, var8.array.length - var8.offset * 2108391709, (byte)111);
                     if (var9 == -1) {
                        throw new IOException();
                     }

                     var8.offset += 1741769013 * var9;
                  }

                  var8.offset = 0;
                  int var34 = var8.readUnsignedByte(148306761);
                  if (var34 < 1 || var34 > 3) {
                     throw new IOException("" + var34);
                  }

                  int var10 = 0;
                  if (var34 > 1) {
                     var10 = var8.readUnsignedByte(-1410701450);
                  }

                  if (var34 <= 2) {
                     var4 = var8.readStringCp1252NullTerminatedOrNull(1706075847);
                     if (var10 == 1) {
                        var5 = var8.readStringCp1252NullTerminatedOrNull(-1082499101);
                        var21 = false;
                     } else {
                        var21 = false;
                     }
                  } else {
                     var4 = Buffer.method12033(var8, -1692148531);
                     if (var10 == 1) {
                        var5 = Buffer.method12033(var8, 1633860172);
                        var21 = false;
                     } else {
                        var21 = false;
                     }
                  }
                  break label251;
               } catch (Exception var26) {
                  var26.printStackTrace();
                  var21 = false;
               } finally {
                  if (var21) {
                     try {
                        if (null != var7) {
                           var7.close((byte)-55);
                        }
                     } catch (IOException var22) {
                     }
                  }
               }

               try {
                  if (null != var7) {
                     var7.close((byte)-110);
                  }
               } catch (IOException var23) {
               }
               break label252;
            }

            try {
               if (null != var7) {
                  var7.close((byte)-98);
               }
            } catch (IOException var24) {
            }
         }

         if (var4 != null) {
            File var30 = new File(var4);
            if (!var30.exists()) {
               var4 = null;
            }
         }

         if (var4 != null) {
            File var31 = new File(var4, "test.dat");
            if (!class194.method4478(var31, true, 1957357009)) {
               var4 = null;
            }
         }
      }

      if (var4 == null && 0 == var2) {
         label221:
         for (int var28 = 0; var28 < class201.field2288.length; var28++) {
            for (int var32 = 0; var32 < classWO.field6405.length; var32++) {
               File var35 = new File(classWO.field6405[var32] + class201.field2288[var28] + File.separatorChar + var0 + File.separatorChar);
               if (var35.exists() && class194.method4478(new File(var35, "test.dat"), true, 1921561983)) {
                  var4 = var35.toString();
                  var6 = true;
                  break label221;
               }
            }
         }
      }

      if (null == var4) {
         var4 = userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var6 = true;
      }

      if (var5 != null) {
         File var29 = new File(var5);
         File var33 = new File(var4);

         try {
            File[] var36 = var29.listFiles();
            File[] var37 = var36;

            for (int var11 = 0; var11 < var37.length; var11++) {
               File var12 = var37[var11];
               File var13 = new File(var33, var12.getName());
               boolean var14 = var12.renameTo(var13);
               if (!var14) {
                  throw new IOException();
               }
            }
         } catch (Exception var25) {
            var25.printStackTrace();
         }

         var6 = true;
      }

      if (var6) {
         class225.method5333(new File(var4), null, 1444084843);
      }

      return new File(var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/io/File;Ljava/io/File;)V")
   @ObfuscatedName("ax")
   static void method4931(File var0, File var1) {
      try {
         AccessFile var2 = new AccessFile(SoundCache.field1483, "rw", 10000L);
         Buffer var3 = new Buffer(500);
         var3.writeByte(3, (short)-17009);
         var3.writeByte(var1 != null ? 1 : 0, (short)-28256);
         Buffer.method11966(var3, var0.getPath(), 1798684367);
         if (null != var1) {
            Buffer.method11966(var3, var1.getPath(), 306140990);
         }

         AccessFile.method11798(var2, var3.array, 0, var3.offset * 2108391709, (byte)-9);
         var2.close((byte)-105);
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
   @ObfuscatedName("ai")
   static File method4928(String var0, String var1, int var2) {
      String var3 = var2 == 0 ? "" : "" + var2;
      SoundCache.field1483 = new File(userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
      String var4 = null;
      String var5 = null;
      boolean var6 = false;
      if (SoundCache.field1483.exists()) {
         AccessFile var7 = null;
         boolean var21 = false /* VF: Semaphore variable */;

         label252: {
            label251: {
               try {
                  var21 = true;
                  var7 = new AccessFile(SoundCache.field1483, "rw", 10000L);
                  Buffer var8 = new Buffer((int)AccessFile.method11809(var7, (byte)42));

                  while (var8.offset * 2108391709 < var8.array.length) {
                     int var9 = var7.read(var8.array, var8.offset * -910486384, var8.array.length - var8.offset * 2108391709, (byte)22);
                     if (var9 == -1) {
                        throw new IOException();
                     }

                     var8.offset += -1941880512 * var9;
                  }

                  var8.offset = 0;
                  int var34 = var8.readUnsignedByte(-506025508);
                  if (var34 < 1 || var34 > 3) {
                     throw new IOException("" + var34);
                  }

                  int var10 = 0;
                  if (var34 > 1) {
                     var10 = var8.readUnsignedByte(1978274974);
                  }

                  if (var34 <= 2) {
                     var4 = var8.readStringCp1252NullTerminatedOrNull(-1306725731);
                     if (var10 == 1) {
                        var5 = var8.readStringCp1252NullTerminatedOrNull(-674695567);
                        var21 = false;
                     } else {
                        var21 = false;
                     }
                  } else {
                     var4 = Buffer.method12033(var8, -1657208275);
                     if (var10 == 1) {
                        var5 = Buffer.method12033(var8, -217343507);
                        var21 = false;
                     } else {
                        var21 = false;
                     }
                  }
                  break label251;
               } catch (Exception var26) {
                  var26.printStackTrace();
                  var21 = false;
               } finally {
                  if (var21) {
                     try {
                        if (null != var7) {
                           var7.close((byte)-38);
                        }
                     } catch (IOException var22) {
                     }
                  }
               }

               try {
                  if (null != var7) {
                     var7.close((byte)-14);
                  }
               } catch (IOException var23) {
               }
               break label252;
            }

            try {
               if (null != var7) {
                  var7.close((byte)-28);
               }
            } catch (IOException var24) {
            }
         }

         if (var4 != null) {
            File var30 = new File(var4);
            if (!var30.exists()) {
               var4 = null;
            }
         }

         if (var4 != null) {
            File var31 = new File(var4, "test.dat");
            if (!class194.method4478(var31, true, 1921046224)) {
               var4 = null;
            }
         }
      }

      if (var4 == null && 0 == var2) {
         label221:
         for (int var28 = 0; var28 < class201.field2288.length; var28++) {
            for (int var32 = 0; var32 < classWO.field6405.length; var32++) {
               File var35 = new File(classWO.field6405[var32] + class201.field2288[var28] + File.separatorChar + var0 + File.separatorChar);
               if (var35.exists() && class194.method4478(new File(var35, "test.dat"), true, 2105573704)) {
                  var4 = var35.toString();
                  var6 = true;
                  break label221;
               }
            }
         }
      }

      if (null == var4) {
         var4 = userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var6 = true;
      }

      if (var5 != null) {
         File var29 = new File(var5);
         File var33 = new File(var4);

         try {
            File[] var36 = var29.listFiles();
            File[] var37 = var36;

            for (int var11 = 0; var11 < var37.length; var11++) {
               File var12 = var37[var11];
               File var13 = new File(var33, var12.getName());
               boolean var14 = var12.renameTo(var13);
               if (!var14) {
                  throw new IOException();
               }
            }
         } catch (Exception var25) {
            var25.printStackTrace();
         }

         var6 = true;
      }

      if (var6) {
         class225.method5333(new File(var4), null, 1444084843);
      }

      return new File(var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
   @ObfuscatedName("az")
   public static void method4926(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (null != var1 && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      class134.field1817 = 1233151621 * var4;
      class224.cacheGamebuild = 1582662335 * var3;

      try {
         EnumComposition.osName = System.getProperty("os.name");
      } catch (Exception var13) {
         EnumComposition.osName = "Unknown";
      }

      AttackOption.osNameLowercase = EnumComposition.osName.toLowerCase();
      userHomeDirectory = null;

      try {
         userHomeDirectory = System.getProperty("jagex.userhome");
      } catch (Exception var12) {
      }

      if (userHomeDirectory == null) {
         try {
            userHomeDirectory = System.getProperty("user.home");
         } catch (Exception var11) {
         }
      }

      if (userHomeDirectory != null) {
         userHomeDirectory = userHomeDirectory + "/";
      }

      try {
         if (AttackOption.osNameLowercase.startsWith("win")) {
            if (userHomeDirectory == null) {
               userHomeDirectory = client.method2321("USERPROFILE");
            }
         } else if (userHomeDirectory == null) {
            userHomeDirectory = client.method2321("HOME");
         }

         if (null != userHomeDirectory) {
            userHomeDirectory = userHomeDirectory + "/";
         }
      } catch (Exception var10) {
      }

      if (null == userHomeDirectory) {
         userHomeDirectory = "~/";
      }

      classWO.field6405 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", userHomeDirectory, "/tmp/", ""};
      class201.field2288 = new String[]{".jagex_cache_" + -1114182337 * class224.cacheGamebuild, ".file_store_" + class224.cacheGamebuild * -1114182337};

      label95:
      for (int var5 = 0; var5 < 4; var5++) {
         class452.cacheDir = class137.method4003(var0, var2, var5, (byte)-95);
         if (!class452.cacheDir.exists()) {
            class452.cacheDir.mkdirs();
         }

         File[] var6 = class452.cacheDir.listFiles();
         if (var6 == null) {
            break;
         }

         File[] var7 = var6;

         for (int var8 = 0; var8 < var7.length; var8++) {
            File var9 = var7[var8];
            if (!class194.method4478(var9, false, 2124226059)) {
               continue label95;
            }
         }
         break;
      }

      class107.method3815(class452.cacheDir, -320898365);
      class184.method4485((byte)-67);
      JagexCache_dat2File = new BufferedFile(new AccessFile(KeyHandler.getFile("main_file_cache.dat2", (short)10411), "rw", 1048576000L), 5200, 0);
      JagexCache_idx255File = new BufferedFile(new AccessFile(KeyHandler.getFile("main_file_cache.idx255", (short)24464), "rw", 1048576L), 6000, 0);
      UserComparator9.JagexCache_idxFiles = new BufferedFile[-808607155 * class134.field1817];

      for (int var14 = 0; var14 < class134.field1817 * -808607155; var14++) {
         UserComparator9.JagexCache_idxFiles[var14] = new BufferedFile(
            new AccessFile(KeyHandler.getFile("main_file_cache.idx" + var14, (short)18505), "rw", 1048576L), 6000, 0
         );
      }
   }

   JagexCache() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   static void method4938() {
      try {
         File var0 = new File(userHomeDirectory, "random.dat");
         if (var0.exists()) {
            JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
         } else {
            label34:
            for (int var1 = 0; var1 < class201.field2288.length; var1++) {
               for (int var2 = 0; var2 < classWO.field6405.length; var2++) {
                  File var3 = new File(classWO.field6405[var2] + class201.field2288[var1] + File.separatorChar + "random.dat");
                  if (var3.exists()) {
                     JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
                     break label34;
                  }
               }
            }
         }

         if (JagexCache_randomDat == null) {
            RandomAccessFile var5 = new RandomAccessFile(var0, "rw");
            int var6 = var5.read();
            var5.seek(0L);
            var5.write(var6);
            var5.seek(0L);
            var5.close();
            JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
         }
      } catch (IOException var4) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/io/File;Ljava/io/File;)V")
   @ObfuscatedName("ar")
   static void method4932(File var0, File var1) {
      try {
         AccessFile var2 = new AccessFile(SoundCache.field1483, "rw", 10000L);
         Buffer var3 = new Buffer(500);
         var3.writeByte(3, (short)-16197);
         var3.writeByte(var1 != null ? 1 : 0, (short)-18282);
         Buffer.method11966(var3, var0.getPath(), 513788141);
         if (null != var1) {
            Buffer.method11966(var3, var1.getPath(), 2029159799);
         }

         AccessFile.method11798(var2, var3.array, 0, var3.offset * 2108391709, (byte)-22);
         var2.close((byte)-58);
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/io/File;Z)Z")
   @ObfuscatedName("ah")
   static boolean method4934(File var0, boolean var1) {
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
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Lwn;")
   @ObfuscatedName("al")
   public static AccessFile method4935(String var0, String var1, boolean var2) {
      File var3 = new File(class452.cacheDir, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            return new AccessFile(var3, "rw", 10000L);
         } catch (IOException var9) {
         }
      }

      String var4 = "";
      if (-1114182337 * class224.cacheGamebuild == 33) {
         var4 = "_rc";
      } else if (class224.cacheGamebuild * -1114182337 == 34) {
         var4 = "_wip";
      }

      File var5 = new File(userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      if (!var2 && var5.exists()) {
         try {
            return new AccessFile(var5, "rw", 10000L);
         } catch (IOException var8) {
         }
      }

      try {
         return new AccessFile(var3, "rw", 10000L);
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Lwn;")
   @ObfuscatedName("af")
   public static AccessFile method4936(String var0, String var1, boolean var2) {
      File var3 = new File(class452.cacheDir, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            return new AccessFile(var3, "rw", 10000L);
         } catch (IOException var9) {
         }
      }

      String var4 = "";
      if (-1114182337 * class224.cacheGamebuild == 33) {
         var4 = "_rc";
      } else if (class224.cacheGamebuild * -1114182337 == 34) {
         var4 = "_wip";
      }

      File var5 = new File(userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      if (!var2 && var5.exists()) {
         try {
            return new AccessFile(var5, "rw", 10000L);
         } catch (IOException var8) {
         }
      }

      try {
         return new AccessFile(var3, "rw", 10000L);
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Lwn;")
   @ObfuscatedName("am")
   public static AccessFile method4937(String var0, String var1, boolean var2) {
      File var3 = new File(class452.cacheDir, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            return new AccessFile(var3, "rw", 10000L);
         } catch (IOException var9) {
         }
      }

      String var4 = "";
      if (-304342686 * class224.cacheGamebuild == -1248306943) {
         var4 = "_rc";
      } else if (class224.cacheGamebuild * -1114182337 == -1111338807) {
         var4 = "_wip";
      }

      File var5 = new File(userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      if (!var2 && var5.exists()) {
         try {
            return new AccessFile(var5, "rw", 10000L);
         } catch (IOException var8) {
         }
      }

      try {
         return new AccessFile(var3, "rw", 10000L);
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/io/File;Ljava/io/File;)V")
   @ObfuscatedName("ab")
   static void method4933(File var0, File var1) {
      try {
         AccessFile var2 = new AccessFile(SoundCache.field1483, "rw", 10000L);
         Buffer var3 = new Buffer(500);
         var3.writeByte(3, (short)-7158);
         var3.writeByte(var1 != null ? 1 : 0, (short)-22784);
         Buffer.method11966(var3, var0.getPath(), -1387388025);
         if (null != var1) {
            Buffer.method11966(var3, var1.getPath(), 1309762794);
         }

         AccessFile.method11798(var2, var3.array, 0, var3.offset * 2108391709, (byte)-105);
         var2.close((byte)-29);
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
   @ObfuscatedName("ac")
   static File method4929(String var0, String var1, int var2) {
      String var3 = var2 == 0 ? "" : "" + var2;
      SoundCache.field1483 = new File(userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
      String var4 = null;
      String var5 = null;
      boolean var6 = false;
      if (SoundCache.field1483.exists()) {
         AccessFile var7 = null;
         boolean var21 = false /* VF: Semaphore variable */;

         label252: {
            label251: {
               try {
                  var21 = true;
                  var7 = new AccessFile(SoundCache.field1483, "rw", 10000L);
                  Buffer var8 = new Buffer((int)AccessFile.method11809(var7, (byte)83));

                  while (var8.offset * 2108391709 < var8.array.length) {
                     int var9 = var7.read(var8.array, var8.offset * 2108391709, var8.array.length - var8.offset * 2108391709, (byte)-82);
                     if (var9 == -1) {
                        throw new IOException();
                     }

                     var8.offset += 1741769013 * var9;
                  }

                  var8.offset = 0;
                  int var34 = var8.readUnsignedByte(1831805938);
                  if (var34 < 1 || var34 > 3) {
                     throw new IOException("" + var34);
                  }

                  int var10 = 0;
                  if (var34 > 1) {
                     var10 = var8.readUnsignedByte(53423950);
                  }

                  if (var34 <= 2) {
                     var4 = var8.readStringCp1252NullTerminatedOrNull(2081191025);
                     if (var10 == 1) {
                        var5 = var8.readStringCp1252NullTerminatedOrNull(833793413);
                        var21 = false;
                     } else {
                        var21 = false;
                     }
                  } else {
                     var4 = Buffer.method12033(var8, 706393799);
                     if (var10 == 1) {
                        var5 = Buffer.method12033(var8, -644689732);
                        var21 = false;
                     } else {
                        var21 = false;
                     }
                  }
                  break label251;
               } catch (Exception var26) {
                  var26.printStackTrace();
                  var21 = false;
               } finally {
                  if (var21) {
                     try {
                        if (null != var7) {
                           var7.close((byte)-88);
                        }
                     } catch (IOException var22) {
                     }
                  }
               }

               try {
                  if (null != var7) {
                     var7.close((byte)-20);
                  }
               } catch (IOException var23) {
               }
               break label252;
            }

            try {
               if (null != var7) {
                  var7.close((byte)-51);
               }
            } catch (IOException var24) {
            }
         }

         if (var4 != null) {
            File var30 = new File(var4);
            if (!var30.exists()) {
               var4 = null;
            }
         }

         if (var4 != null) {
            File var31 = new File(var4, "test.dat");
            if (!class194.method4478(var31, true, 1994598767)) {
               var4 = null;
            }
         }
      }

      if (var4 == null && 0 == var2) {
         label221:
         for (int var28 = 0; var28 < class201.field2288.length; var28++) {
            for (int var32 = 0; var32 < classWO.field6405.length; var32++) {
               File var35 = new File(classWO.field6405[var32] + class201.field2288[var28] + File.separatorChar + var0 + File.separatorChar);
               if (var35.exists() && class194.method4478(new File(var35, "test.dat"), true, 1903719121)) {
                  var4 = var35.toString();
                  var6 = true;
                  break label221;
               }
            }
         }
      }

      if (null == var4) {
         var4 = userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var6 = true;
      }

      if (var5 != null) {
         File var29 = new File(var5);
         File var33 = new File(var4);

         try {
            File[] var36 = var29.listFiles();
            File[] var37 = var36;

            for (int var11 = 0; var11 < var37.length; var11++) {
               File var12 = var37[var11];
               File var13 = new File(var33, var12.getName());
               boolean var14 = var12.renameTo(var13);
               if (!var14) {
                  throw new IOException();
               }
            }
         } catch (Exception var25) {
            var25.printStackTrace();
         }

         var6 = true;
      }

      if (var6) {
         class225.method5333(new File(var4), null, 1444084843);
      }

      return new File(var4);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Ljava/io/File;")
   @ObfuscatedName("as")
   static File method4930(String var0, String var1, int var2) {
      String var3 = var2 == 0 ? "" : "" + var2;
      SoundCache.field1483 = new File(userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
      String var4 = null;
      String var5 = null;
      boolean var6 = false;
      if (SoundCache.field1483.exists()) {
         AccessFile var7 = null;
         boolean var21 = false /* VF: Semaphore variable */;

         label252: {
            label251: {
               try {
                  var21 = true;
                  var7 = new AccessFile(SoundCache.field1483, "rw", 10000L);
                  Buffer var8 = new Buffer((int)AccessFile.method11809(var7, (byte)-31));

                  while (var8.offset * 916038634 < var8.array.length) {
                     int var9 = var7.read(var8.array, var8.offset * 1282698377, var8.array.length - var8.offset * 2108391709, (byte)55);
                     if (var9 == -1) {
                        throw new IOException();
                     }

                     var8.offset += 1741769013 * var9;
                  }

                  var8.offset = 0;
                  int var34 = var8.readUnsignedByte(1987287055);
                  if (var34 < 1 || var34 > 3) {
                     throw new IOException("" + var34);
                  }

                  int var10 = 0;
                  if (var34 > 1) {
                     var10 = var8.readUnsignedByte(497968424);
                  }

                  if (var34 <= 2) {
                     var4 = var8.readStringCp1252NullTerminatedOrNull(1058278248);
                     if (var10 == 1) {
                        var5 = var8.readStringCp1252NullTerminatedOrNull(-26613917);
                        var21 = false;
                     } else {
                        var21 = false;
                     }
                  } else {
                     var4 = Buffer.method12033(var8, 1185797544);
                     if (var10 == 1) {
                        var5 = Buffer.method12033(var8, -1856464524);
                        var21 = false;
                     } else {
                        var21 = false;
                     }
                  }
                  break label251;
               } catch (Exception var26) {
                  var26.printStackTrace();
                  var21 = false;
               } finally {
                  if (var21) {
                     try {
                        if (null != var7) {
                           var7.close((byte)-114);
                        }
                     } catch (IOException var22) {
                     }
                  }
               }

               try {
                  if (null != var7) {
                     var7.close((byte)-67);
                  }
               } catch (IOException var23) {
               }
               break label252;
            }

            try {
               if (null != var7) {
                  var7.close((byte)-60);
               }
            } catch (IOException var24) {
            }
         }

         if (var4 != null) {
            File var30 = new File(var4);
            if (!var30.exists()) {
               var4 = null;
            }
         }

         if (var4 != null) {
            File var31 = new File(var4, "test.dat");
            if (!class194.method4478(var31, true, 1905085096)) {
               var4 = null;
            }
         }
      }

      if (var4 == null && 0 == var2) {
         label221:
         for (int var28 = 0; var28 < class201.field2288.length; var28++) {
            for (int var32 = 0; var32 < classWO.field6405.length; var32++) {
               File var35 = new File(classWO.field6405[var32] + class201.field2288[var28] + File.separatorChar + var0 + File.separatorChar);
               if (var35.exists() && class194.method4478(new File(var35, "test.dat"), true, 1940603959)) {
                  var4 = var35.toString();
                  var6 = true;
                  break label221;
               }
            }
         }
      }

      if (null == var4) {
         var4 = userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
         var6 = true;
      }

      if (var5 != null) {
         File var29 = new File(var5);
         File var33 = new File(var4);

         try {
            File[] var36 = var29.listFiles();
            File[] var37 = var36;

            for (int var11 = 0; var11 < var37.length; var11++) {
               File var12 = var37[var11];
               File var13 = new File(var33, var12.getName());
               boolean var14 = var12.renameTo(var13);
               if (!var14) {
                  throw new IOException();
               }
            }
         } catch (Exception var25) {
            var25.printStackTrace();
         }

         var6 = true;
      }

      if (var6) {
         class225.method5333(new File(var4), null, 1444084843);
      }

      return new File(var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   public static void method4941() {
      try {
         BufferedFile.method11849(JagexCache_dat2File, (short)-16730);

         for (int var0 = 0; var0 < -808607155 * class134.field1817; var0++) {
            BufferedFile.method11849(UserComparator9.JagexCache_idxFiles[var0], (short)-19340);
         }

         BufferedFile.method11849(JagexCache_idx255File, (short)-25668);
         BufferedFile.method11849(JagexCache_randomDat, (short)-10173);
      } catch (Exception var1) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   public static void method4942() {
      try {
         BufferedFile.method11849(JagexCache_dat2File, (short)-21628);

         for (int var0 = 0; var0 < 1642780694 * class134.field1817; var0++) {
            BufferedFile.method11849(UserComparator9.JagexCache_idxFiles[var0], (short)-19588);
         }

         BufferedFile.method11849(JagexCache_idx255File, (short)-22036);
         BufferedFile.method11849(JagexCache_randomDat, (short)-149);
      } catch (Exception var1) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   public static void method4943() {
      try {
         BufferedFile.method11849(JagexCache_dat2File, (short)-23467);

         for (int var0 = 0; var0 < -808607155 * class134.field1817; var0++) {
            BufferedFile.method11849(UserComparator9.JagexCache_idxFiles[var0], (short)-15522);
         }

         BufferedFile.method11849(JagexCache_idx255File, (short)-23442);
         BufferedFile.method11849(JagexCache_randomDat, (short)134);
      } catch (Exception var1) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;[II)[Ljava/lang/Object;")
   @ObfuscatedName("an")
   static Object[] method4922(Buffer var0, int[] var1, int var2) {
      try {
         int var3 = Buffer.method12050(var0, 832893744);
         Object[] var4 = new Object[var3 * var1.length];

         for (int var5 = 0; var5 < var3; var5++) {
            if (var2 >= 1010049790) {
               throw new IllegalStateException();
            }

            for (int var6 = 0; var6 < var1.length; var6++) {
               if (var2 >= 1010049790) {
                  throw new IllegalStateException();
               }

               int var7 = var1.length * var5 + var6;
               class586 var8 = class251.method6149(var1[var6], -1703539756);
               var4[var7] = class586.method11714(var8, var0, 1377348685);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "in.an(" + ')');
      }
   }
}
