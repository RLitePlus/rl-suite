import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.io.BaseEncoding;
import com.google.common.io.ByteStreams;
import com.google.common.io.CharStreams;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import net.runelite.api.IndexDataBase;
import net.runelite.api.overlay.OverlayIndex;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qm")
public abstract class AbstractArchive implements IndexDataBase {
   @ObfuscatedName("ba")
   int field5361;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   static final int field5360 = 4;
   @ObfuscatedName("bf")
   int[][] fileIds;
   @ObfuscatedName("br")
   Object[] groups;
   @ObfuscatedName("bs")
   public int hash;
   @ObfuscatedName("bz")
   boolean releaseGroups;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field5359 = 1;
   @ObfuscatedName("bh")
   Object[][] files;
   @ObfuscatedName("bb")
   int groupCount;
   @ObfuscatedName("bm")
   int[] groupNameHashes;
   @ObfuscatedName("ew")
   public boolean field5366;
   @ObfuscatedSignature(descriptor = "Lsn;")
   @ObfuscatedName("bp")
   IntHashTable groupNameHashTable;
   @ObfuscatedName("bt")
   int[] field5370;
   @ObfuscatedName("bu")
   int[] field5371;
   @ObfuscatedName("bo")
   static int field5355 = 0;
   @ObfuscatedName("bi")
   int[] groupCrcs;
   @ObfuscatedName("nc")
   public Object field5364;
   @ObfuscatedName("by")
   int[] groupVersions;
   @ObfuscatedName("bw")
   int[] fileCounts;
   @ObfuscatedSignature(descriptor = "Lxc;")
   @ObfuscatedName("bg")
   static GZipDecompressor gzipDecompressor = new GZipDecompressor();
   @ObfuscatedName("bk")
   boolean shallowFiles;
   @ObfuscatedSignature(descriptor = "[Lsn;")
   @ObfuscatedName("bd")
   IntHashTable[] fileNameHashTables;
   @ObfuscatedName("bn")
   int[][] fileNameHashes;
   @ObfuscatedName("bj")
   int[] groupIds;

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ca")
   void method8965(byte[] var1) {
      this.hash = HttpRequestTask.method86(var1, var1.length, (byte)60) * -2114810791;
      Buffer var2 = new Buffer(HttpRequestTask.decompressBytes(var1, 1733044161));
      int var3 = var2.readUnsignedByte(-215355177);
      if (var3 >= 5 && var3 <= 7) {
         if (var3 >= 6) {
            Buffer.method12015(var2, -853936695);
         }

         int var4 = var2.readUnsignedByte(-26128808);
         boolean var5 = (var4 & 1) != 0;
         boolean var6 = 0 != (var4 & 2);
         boolean var7 = (var4 & 4) != 0;
         boolean var8 = 0 != (var4 & 8);
         if (var6) {
            throw new UnsupportedOperationException("");
         } else if (var8) {
            throw new UnsupportedOperationException("");
         } else {
            if (var3 >= 7) {
               this.groupCount = var2.readLargeSmart(-2069276081) * -831037161;
            } else {
               this.groupCount = Buffer.method12008(var2, (byte)5) * -736197796;
            }

            int var9 = 0;
            int var10 = -1;
            this.groupIds = new int[this.groupCount * 1969481383];
            if (var3 >= 7) {
               for (int var11 = 0; var11 < 1969481383 * this.groupCount; var11++) {
                  this.groupIds[var11] = var9 += var2.readLargeSmart(-1688623186);
                  if (this.groupIds[var11] > var10) {
                     var10 = this.groupIds[var11];
                  }
               }
            } else {
               for (int var19 = 0; var19 < this.groupCount * 1969481383; var19++) {
                  this.groupIds[var19] = var9 += Buffer.method12008(var2, (byte)5);
                  if (this.groupIds[var19] > var10) {
                     var10 = this.groupIds[var19];
                  }
               }
            }

            this.field5361 = (var10 + 1) * -711813221;
            this.groupCrcs = new int[1497293744 * this.field5361];
            this.groupVersions = new int[-1716717933 * this.field5361];
            this.fileCounts = new int[this.field5361 * 2125267086];
            this.fileIds = new int[-1716717933 * this.field5361][];
            this.groups = new Object[this.field5361 * -219594637];
            this.files = new Object[-1716717933 * this.field5361][];
            if (var5) {
               this.groupNameHashes = new int[-1716717933 * this.field5361];
               Arrays.fill(this.groupNameHashes, -1);

               for (int var20 = 0; var20 < -1944026611 * this.groupCount; var20++) {
                  this.groupNameHashes[this.groupIds[var20]] = Buffer.method12015(var2, -418517378);
               }

               this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
            }

            for (int var21 = 0; var21 < this.groupCount * 467546243; var21++) {
               this.groupCrcs[this.groupIds[var21]] = Buffer.method12015(var2, 1707813493);
            }

            if (var7) {
               this.field5370 = new int[this.field5361 * -1716717933];
               this.field5371 = new int[-223272758 * this.field5361];

               for (int var22 = 0; var22 < this.groupCount * 1969481383; var22++) {
                  this.field5370[this.groupIds[var22]] = Buffer.method12015(var2, 1750569115);
                  this.field5371[this.groupIds[var22]] = Buffer.method12015(var2, 174731679);
               }
            }

            for (int var23 = 0; var23 < this.groupCount * 1969481383; var23++) {
               this.groupVersions[this.groupIds[var23]] = Buffer.method12015(var2, 1184577218);
            }

            if (var3 >= 7) {
               for (int var24 = 0; var24 < 1969481383 * this.groupCount; var24++) {
                  this.fileCounts[this.groupIds[var24]] = var2.readLargeSmart(-1309490381);
               }

               for (int var25 = 0; var25 < 2085606247 * this.groupCount; var25++) {
                  int var12 = this.groupIds[var25];
                  int var13 = this.fileCounts[var12];
                  var9 = 0;
                  int var14 = -1;
                  this.fileIds[var12] = new int[var13];

                  for (int var15 = 0; var15 < var13; var15++) {
                     int var16 = this.fileIds[var12][var15] = var9 += var2.readLargeSmart(-2114926661);
                     if (var16 > var14) {
                        var14 = var16;
                     }
                  }

                  this.files[var12] = new Object[1 + var14];
               }
            } else {
               for (int var26 = 0; var26 < this.groupCount * 1969481383; var26++) {
                  this.fileCounts[this.groupIds[var26]] = Buffer.method12008(var2, (byte)5);
               }

               for (int var27 = 0; var27 < this.groupCount * -1412066249; var27++) {
                  int var29 = this.groupIds[var27];
                  int var31 = this.fileCounts[var29];
                  var9 = 0;
                  int var33 = -1;
                  this.fileIds[var29] = new int[var31];

                  for (int var35 = 0; var35 < var31; var35++) {
                     int var37 = this.fileIds[var29][var35] = var9 += Buffer.method12008(var2, (byte)5);
                     if (var37 > var33) {
                        var33 = var37;
                     }
                  }

                  this.files[var29] = new Object[var33 + 1];
               }
            }

            if (var5) {
               this.fileNameHashes = new int[1 + var10][];
               this.fileNameHashTables = new IntHashTable[1 + var10];

               for (int var28 = 0; var28 < this.groupCount * 1969481383; var28++) {
                  int var30 = this.groupIds[var28];
                  int var32 = this.fileCounts[var30];
                  this.fileNameHashes[var30] = new int[this.files[var30].length];
                  Arrays.fill(this.fileNameHashes[var30], -1);

                  for (int var34 = 0; var34 < var32; var34++) {
                     int var36 = null != this.fileIds[var30] ? this.fileIds[var30][var34] : var34;
                     this.fileNameHashes[var30][var36] = Buffer.method12015(var2, 1414599572);
                  }

                  this.fileNameHashTables[var30] = new IntHashTable(this.fileNameHashes[var30]);
               }
            }
         }
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eg")
   public void method9004() {
      for (int var1 = 0; var1 < this.groups.length; var1++) {
         this.groups[var1] = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ag")
   void loadRegionFromGroup(int var1, int var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qm.ag(" + ')');
      }
   }

   public boolean isOverlayOutdated() {
      return this.field5366;
   }

   @ObfuscatedSignature(descriptor = "(III)[B")
   @ObfuscatedName("ct")
   public byte[] getFile(int var1, int var2, int var3) {
      int var19 = var2;
      int var18 = var1;
      AbstractArchive var17 = this;
      int var20 = 269531577;

      byte[] var10000;
      try {
         byte[] var65 = var17.takeFileEncrypted(var18, var19, null, -590775437);
         var10000 = var65;
      } catch (RuntimeException var55) {
         throw RestClientThreadFactory.newRunException(var55, "qm.bc(" + ')');
      }

      byte[] var4 = var10000;
      Archive var5 = (Archive)this;
      if (!OverlayIndex.hasOverlay(var5.method9111(), var1)) {
         return var4;
      } else {
         InputStream var6 = this.getClass().getResourceAsStream("/runelite/" + var5.method9111() + "/" + var1);
         if (var6 == null) {
            client.field938.warn("Missing overlay data for {}/{}", var5.method9111(), var1);
            return var4;
         } else {
            try {
               InputStream var7 = this.getClass().getResourceAsStream("/runelite/" + var5.method9111() + "/" + var1 + ".hash");

               try {
                  if (var4 == null) {
                     if (var7 != null) {
                        client.field938.warn("Hash file for non existing archive {}/{}", var5.method9111(), var1);
                        return null;
                     } else {
                        client.field938.debug("Adding archive {}/{}", var5.method9111(), var1);

                        try {
                           return ByteStreams.toByteArray(var6);
                        } catch (IOException var57) {
                           client.field938.warn("error loading archive replacement", var57);
                           return null;
                        }
                     }
                  } else if (var7 == null) {
                     client.field938.warn("Missing hash file for {}/{}", var5.method9111(), var1);
                     return var4;
                  } else {
                     HashCode var8 = Hashing.sha256().hashBytes(var4);
                     String var9 = BaseEncoding.base16().encode(var8.asBytes());

                     try {
                        String var10 = CharStreams.toString(new InputStreamReader(var7));
                        if (var10.equals(var9)) {
                           client.field938.debug("Replacing archive {}/{}", var5.method9111(), var1);
                           return ByteStreams.toByteArray(var6);
                        }

                        client.field938.warn("Mismatch in overlaid cache archive hash for {}/{}: {} != {}", new Object[]{var5.method9111(), var1, var10, var9});
                        this.field5366 = true;
                     } catch (IOException var56) {
                        client.field938.warn("error checking hash", var56);
                     }

                     return var4;
                  }
               } finally {
                  if (var7 != null) {
                     try {
                        var7.close();
                     } catch (IOException var54) {
                        client.field938.warn(null, var54);
                     }
                  }
               }
            } finally {
               try {
                  var6.close();
               } catch (IOException var53) {
                  client.field938.warn(null, var53);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II[I)[B")
   @ObfuscatedName("lb")
   public byte[] method9057(int var1, int var2, int[] var3) {
      return this.takeFileEncrypted(var1, var2, var3, -590775437);
   }

   @ObfuscatedSignature(descriptor = "(II[II)[B")
   @ObfuscatedName("bq")
   public byte[] takeFileEncrypted(int var1, int var2, int[] var3, int var4) {
      if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
         Object var5 = this.files[var1][var2];
         if (var5 == null) {
            synchronized (this) {
               Object var7 = this.groups[var1];
               if (var7 == null) {
                  this.method9060(var1);
               }

               if (!this.method9061(var1, var3)) {
                  return null;
               }

               var5 = this.files[var1][var2];
               if (this.shallowFiles) {
                  this.files[var1][var2] = null;
               }
            }
         }

         return var5 == null ? null : method9063(var5, false);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   void vmethod322(int var1) {
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ch")
   public boolean tryLoadGroup(int var1, int var2) {
      synchronized (this) {
         int var6 = var1;
         AbstractArchive var5 = this;
         int var7 = -1255109178;

         boolean var10000;
         try {
            if (null != var5.groups[var6]) {
               if (var7 >= 466342872) {
                  throw new IllegalStateException();
               }

               boolean var10 = true;
               var10000 = var10;
            } else {
               var5.loadGroup(var6, (byte)-16);
               if (var5.groups[var6] != null) {
                  if (var7 >= 466342872) {
                     throw new IllegalStateException();
                  }

                  boolean var11 = true;
                  var10000 = var11;
               } else {
                  boolean var12 = false;
                  var10000 = var12;
               }
            }
         } catch (RuntimeException var8) {
            throw RestClientThreadFactory.newRunException(var8, "qm.ch(" + ')');
         }

         return var10000;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)Z")
   @ObfuscatedName("ar")
   public static boolean method8981(AbstractArchive var0) {
      if (var0 == null) {
         return var0.isOverlayOutdated();
      } else {
         boolean var1 = true;

         for (int var2 = 0; var2 < var0.groupIds.length; var2++) {
            int var3 = var0.groupIds[var2];
            if (var0.groups[var3] == null) {
               var0.loadGroup(var3, (byte)-41);
               if (var0.groups[var3] == null) {
                  var1 = false;
               }
            }
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;III)[B")
   @ObfuscatedName("ja")
   public static byte[] method9044(AbstractArchive var0, int var1, int var2, int var3) {
      if (var0 == null) {
         return var0.takeFile(var1, var1, var1);
      } else if (var1 >= 0 && var1 < var0.files.length && var0.files[var1] != null && var2 >= 0 && var2 < var0.files[var1].length) {
         Object var4 = var0.files[var1][var2];
         if (var4 == null) {
            synchronized (var0) {
               Object var6 = var0.groups[var1];
               if (var6 == null) {
                  var0.method9060(var1);
               }

               var0.method9061(var1, null);
               var4 = var0.files[var1][var2];
            }
         }

         return var4 == null ? null : method9063(var4, false);
      } else {
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("fu")
   public static void method9011(AbstractArchive var0) {
      if (var0 == null) {
         var0.method9014();
      }

      for (int var1 = 0; var1 < var0.files.length; var1++) {
         if (var0.files[var1] != null) {
            for (int var2 = 0; var2 < var0.files[var1].length; var2++) {
               var0.files[var1][var2] = null;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ce")
   public boolean isFullyLoaded(int var1) {
      try {
         boolean var2 = true;

         for (int var3 = 0; var3 < this.groupIds.length; var3++) {
            if (var1 <= -1500941553) {
               throw new IllegalStateException();
            }

            int var4 = this.groupIds[var3];
            if (this.groups[var4] == null) {
               this.loadGroup(var4, (byte)-65);
               if (this.groups[var4] == null) {
                  var2 = false;
               }
            }
         }

         return var2;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "qm.ce(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ay")
   int groupLoadPercent(int var1, int var2) {
      try {
         if (null != this.groups[var1]) {
            if (var2 != 743318851) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qm.ay(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("an")
   void loadGroup(int var1, byte var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qm.an(" + ')');
      }
   }

   public byte[] loadData(int var1, int var2) {
      return this.getFile(var1, var2, 269531577);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("fv")
   public int method9058(int var1) {
      return method9046(this, var1, (byte)-120);
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)I")
   @ObfuscatedName("eu")
   public int method9021(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.fileNameHashTables[var1].get(Projectile.hashString(var2, 1277556611), 1123379343);
   }

   public int[] getFileIds(int var1) {
      return method8992(this, var1, -1775968255);
   }

   @ObfuscatedSignature(descriptor = "(IB)[B")
   @ObfuscatedName("cm")
   public byte[] getFileFlat(int var1, byte var2) {
      try {
         if (this.files.length == 1) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            } else {
               return method9044(this, 0, var1, -2025417411);
            }
         } else if (1 == this.files[var1].length) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            } else {
               return method9044(this, var1, 0, -2009310655);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qm.cm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)I")
   @ObfuscatedName("cq")
   public int groupLoadPercentByName(String var1, byte var2) {
      try {
         var1 = var1.toLowerCase();
         return this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qm.cg(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("dq")
   public byte[] method8985(int var1) {
      if (1 == this.files.length) {
         return this.getFile(0, var1, 652467448);
      } else if (1 == this.files[var1].length) {
         return this.getFile(var1, 0, 1066160152);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cc")
   public int getGroupCount(int var1) {
      try {
         return this.field5361 * -1716717933;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qm.cc(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("et")
   public int method9059(String var1) {
      return this.groupLoadPercentByName(var1, (byte)-23);
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("bx")
   public boolean tryLoadFile(int var1, int var2, int var3) {
      synchronized (this) {
         int var8 = var2;
         int var7 = var1;
         AbstractArchive var6 = this;
         int var9 = 756705879;

         boolean var10000;
         try {
            if (var7 >= 0) {
               if (var9 != 756705879) {
                  throw new IllegalStateException();
               }

               if (var7 < var6.files.length && null != var6.files[var7]) {
                  if (var9 != 756705879) {
                     throw new IllegalStateException();
                  }

                  if (var8 >= 0) {
                     if (var9 != 756705879) {
                        throw new IllegalStateException();
                     }

                     if (var8 < var6.files[var7].length) {
                        if (var6.files[var7][var8] != null) {
                           return true;
                        } else if (null != var6.groups[var7]) {
                           if (var9 != 756705879) {
                              throw new IllegalStateException();
                           }

                           return true;
                        } else {
                           var6.loadGroup(var7, (byte)-114);
                           if (var6.groups[var7] != null) {
                              if (var9 != 756705879) {
                                 throw new IllegalStateException();
                              }

                              boolean var15 = true;
                              var10000 = var15;
                           } else {
                              boolean var16 = false;
                              var10000 = var16;
                           }

                           return var10000;
                        }
                     }
                  }
               }
            }

            boolean var12 = false;
            var10000 = var12;
         } catch (RuntimeException var10) {
            throw RestClientThreadFactory.newRunException(var10, "qm.bx(" + ')');
         }

         return var10000;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("ff")
   public boolean method9035(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
      return this.tryLoadGroup(var2, -1943215694);
   }

   @ObfuscatedSignature(descriptor = "(Lqm;IB)I")
   @ObfuscatedName("ce")
   public static int method9046(AbstractArchive var0, int var1, byte var2) {
      if (var0 == null) {
         var0.getGroupFileCount(var1, var2);
      }

      if (var0.files != null && var1 < var0.files.length) {
         Object[] var3 = var0.files[var1];
         return var3 == null ? 0 : var3.length;
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[B")
   @ObfuscatedName("cu")
   public byte[] takeFileFlat(int var1, int var2) {
      try {
         if (1 == this.files.length) {
            if (var2 == 34091720) {
               throw new IllegalStateException();
            } else {
               return this.getFile(0, var1, -902676837);
            }
         } else if (1 == this.files[var1].length) {
            if (var2 == 34091720) {
               throw new IllegalStateException();
            } else {
               return this.getFile(var1, 0, -1381189285);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qm.cu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I[II)Z")
   @ObfuscatedName("cx")
   boolean buildFiles(int var1, int[] var2, int var3) {
      this.method9054(var1, var2);

      try {
         if (this.groups[var1] == null) {
            if (var3 == 541565463) {
               throw new IllegalStateException();
            } else {
               this.method9052(var1, var2);
               return false;
            }
         } else {
            int var4 = this.fileCounts[var1];
            int[] var5 = this.fileIds[var1];
            Object[] var6 = this.files[var1];
            boolean var7 = true;

            for (int var8 = 0; var8 < var4; var8++) {
               if (var3 == 541565463) {
                  throw new IllegalStateException();
               }

               if (var6[var5[var8]] == null) {
                  if (var3 == 541565463) {
                     throw new IllegalStateException();
                  }

                  var7 = false;
                  break;
               }
            }

            if (var7) {
               if (var3 == 541565463) {
                  throw new IllegalStateException();
               } else {
                  this.method9052(var1, var2);
                  return true;
               }
            } else {
               byte[] var21;
               label176: {
                  label175: {
                     if (var2 != null) {
                        if (0 != var2[0]) {
                           break label175;
                        }

                        if (var3 == 541565463) {
                           throw new IllegalStateException();
                        }

                        if (0 != var2[1]) {
                           break label175;
                        }

                        if (var3 == 541565463) {
                           throw new IllegalStateException();
                        }

                        if (var2[2] != 0) {
                           break label175;
                        }

                        if (var3 == 541565463) {
                           throw new IllegalStateException();
                        }

                        if (0 != var2[3]) {
                           if (var3 == 541565463) {
                              throw new IllegalStateException();
                           }
                           break label175;
                        }
                     }

                     var21 = FriendSystem.method408(this.groups[var1], false, -1887123292);
                     break label176;
                  }

                  var21 = FriendSystem.method408(this.groups[var1], true, -1174406386);
                  Buffer var9 = new Buffer(var21);
                  var9.xteaDecrypt(var2, 5, var9.array.length, (byte)-13);
               }

               byte[] var22;
               try {
                  var22 = HttpRequestTask.decompressBytes(var21, 1733044161);
               } catch (RuntimeException var19) {
                  throw RestClientThreadFactory.newRunException(
                     var19,
                     ""
                        + (null != var2)
                        + ","
                        + var1
                        + ","
                        + var21.length
                        + ","
                        + HttpRequestTask.method86(var21, var21.length, (byte)60)
                        + ","
                        + HttpRequestTask.method86(var21, var21.length - 2, (byte)60)
                        + ","
                        + this.groupCrcs[var1]
                        + ","
                        + this.hash * 1599863785
                  );
               }

               if (this.releaseGroups) {
                  this.groups[var1] = null;
               }

               if (var4 > 1) {
                  if (var3 == 541565463) {
                     throw new IllegalStateException();
                  }

                  int var10 = var22.length;
                  int var11 = var22[--var10] & 255;
                  var10 -= var11 * var4 * 4;
                  Buffer var12 = new Buffer(var22);
                  int[] var13 = new int[var4];
                  var12.offset = 1741769013 * var10;

                  for (int var14 = 0; var14 < var11; var14++) {
                     if (var3 == 541565463) {
                        throw new IllegalStateException();
                     }

                     int var15 = 0;

                     for (int var16 = 0; var16 < var4; var16++) {
                        if (var3 == 541565463) {
                           throw new IllegalStateException();
                        }

                        var15 += Buffer.method12015(var12, 1853403213);
                        var13[var16] += var15;
                     }
                  }

                  byte[][] var25 = new byte[var4][];

                  for (int var26 = 0; var26 < var4; var26++) {
                     var25[var26] = new byte[var13[var26]];
                     var13[var26] = 0;
                  }

                  var12.offset = var10 * 1741769013;
                  int var27 = 0;

                  for (int var28 = 0; var28 < var11; var28++) {
                     int var17 = 0;

                     for (int var18 = 0; var18 < var4; var18++) {
                        if (var3 == 541565463) {
                           throw new IllegalStateException();
                        }

                        var17 += Buffer.method12015(var12, 504485063);
                        System.arraycopy(var22, var27, var25[var18], var13[var18], var17);
                        var13[var18] += var17;
                        var27 += var17;
                     }
                  }

                  for (int var29 = 0; var29 < var4; var29++) {
                     if (var3 == 541565463) {
                        throw new IllegalStateException();
                     }

                     if (!this.shallowFiles) {
                        var6[var5[var29]] = BufferedSource.method10618(var25[var29], false, (byte)0);
                     } else {
                        var6[var5[var29]] = var25[var29];
                     }
                  }
               } else if (!this.shallowFiles) {
                  if (var3 == 541565463) {
                     throw new IllegalStateException();
                  }

                  var6[var5[0]] = BufferedSource.method10618(var22, false, (byte)0);
               } else {
                  var6[var5[0]] = var22;
               }

               this.method9052(var1, var2);
               return true;
            }
         }
      } catch (RuntimeException var20) {
         throw RestClientThreadFactory.newRunException(var20, "qm.cx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Z")
   @ObfuscatedName("bv")
   public boolean method8977(int var1, byte var2) {
      try {
         if (this.files.length == 1) {
            return this.tryLoadFile(0, var1, 756705879);
         } else if (1 == this.files[var1].length) {
            return this.tryLoadFile(var1, 0, 756705879);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qm.bv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
   @ObfuscatedName("cd")
   public boolean isValidFileName(String var1, String var2, int var3) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
         if (var4 < 0) {
            if (var3 >= -1498811448) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            int var5 = this.fileNameHashTables[var4].get(Projectile.hashString(var2, 1277556611), 1123379343);
            if (var5 < 0) {
               if (var3 >= -1498811448) {
                  throw new IllegalStateException();
               } else {
                  return false;
               }
            } else {
               return true;
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "qm.cd(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("co")
   public void clearFiles(byte var1) {
      for (int var2 = 0; var2 < this.files.length; var2++) {
         if (this.files[var2] != null) {
            for (int var3 = 0; var3 < this.files[var2].length; var3++) {
               if (this.files[var2][var3] instanceof DirectByteArrayCopier) {
                  ((DirectByteArrayCopier)this.files[var2][var3]).method7843();
               }

               this.files[var2][var3] = null;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
   @ObfuscatedName("ci")
   public boolean tryLoadFileByNames(String var1, String var2, int var3) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
         int var5 = this.fileNameHashTables[var4].get(Projectile.hashString(var2, 1277556611), 1123379343);
         return this.tryLoadFile(var4, var5, 756705879);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "qm.ci(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Z")
   @ObfuscatedName("cf")
   public boolean tryLoadGroupByName(String var1, int var2) {
      try {
         var1 = var1.toLowerCase();
         int var3 = this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
         return this.tryLoadGroup(var3, -1255109178);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qm.cf(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;)Z")
   @ObfuscatedName("bf")
   public static boolean method9037(AbstractArchive var0, String var1) {
      if (var0 == null) {
         var0.method9019(var1);
      }

      var1 = var1.toLowerCase();
      int var2 = var0.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
      return var0.tryLoadGroup(var2, 75422634);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("cy")
   public void loadRegionFromName(String var1, int var2) {
      try {
         var1 = var1.toLowerCase();
         int var3 = this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
         if (var3 < 0) {
            if (var2 == -1771620243) {
               throw new IllegalStateException();
            }
         } else {
            this.loadRegionFromGroup(var3, 1511163426);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qm.cy(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   void vmethod317(int var1) {
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("am")
   void vmethod318(int var1) {
   }

   @ObfuscatedSignature(descriptor = "(II[I)[B")
   @ObfuscatedName("dv")
   public byte[] method8972(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
         if (null == this.files[var1][var2]) {
            boolean var4 = this.buildFiles(var1, var3, -861894038);
            if (!var4) {
               this.loadGroup(var1, (byte)-104);
               var4 = this.buildFiles(var1, var3, 527946103);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var6 = FriendSystem.method408(this.files[var1][var2], false, -1357602484);
         if (this.shallowFiles) {
            this.files[var1][var2] = null;
         }

         return var6;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aq")
   void vmethod324(int var1) {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)[B")
   @ObfuscatedName("cv")
   static final byte[] method8961(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      int var2 = var1.readUnsignedByte(228164197);
      int var3 = Buffer.method12015(var1, 539676569);
      if (var3 >= 0 && (field5355 * 741238659 == 0 || var3 <= field5355 * 741238659)) {
         if (var2 == 0) {
            byte[] var6 = new byte[var3];
            var1.readBytes(var6, 0, var3, (byte)-11);
            return var6;
         } else {
            int var4 = Buffer.method12015(var1, 136589840);
            if (var4 >= 0 && (741238659 * field5355 == 0 || var4 <= field5355 * 741238659)) {
               byte[] var5 = new byte[var4];
               if (1 == var2) {
                  BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
               } else {
                  GZipDecompressor.method12237(gzipDecompressor, var1, var5, -535278753);
               }

               return var5;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z")
   @ObfuscatedName("en")
   public boolean method9031(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
      int var4 = this.fileNameHashTables[var3].get(Projectile.hashString(var2, 1277556611), 1123379343);
      return this.tryLoadFile(var3, var4, 756705879);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)[B")
   @ObfuscatedName("cr")
   static final byte[] method8962(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      int var2 = var1.readUnsignedByte(2041696205);
      int var3 = Buffer.method12015(var1, -709285539);
      if (var3 >= 0 && (field5355 * 741238659 == 0 || var3 <= field5355 * -477924324)) {
         if (var2 == 0) {
            byte[] var6 = new byte[var3];
            var1.readBytes(var6, 0, var3, (byte)-6);
            return var6;
         } else {
            int var4 = Buffer.method12015(var1, 429773477);
            if (var4 >= 0 && (1031115890 * field5355 == 0 || var4 <= field5355 * 701694130)) {
               byte[] var5 = new byte[var4];
               if (1 == var2) {
                  BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
               } else {
                  GZipDecompressor.method12237(gzipDecompressor, var1, var5, -535278753);
               }

               return var5;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("cj")
   void method8966(byte[] var1) {
      this.hash = HttpRequestTask.method86(var1, var1.length, (byte)60) * 2000718554;
      Buffer var2 = new Buffer(HttpRequestTask.decompressBytes(var1, 1733044161));
      int var3 = var2.readUnsignedByte(1911028670);
      if (var3 >= 5 && var3 <= 7) {
         if (var3 >= 6) {
            Buffer.method12015(var2, -459669318);
         }

         int var4 = var2.readUnsignedByte(2132974714);
         boolean var5 = (var4 & 1) != 0;
         boolean var6 = 0 != (var4 & 2);
         boolean var7 = (var4 & 4) != 0;
         boolean var8 = 0 != (var4 & 8);
         if (var6) {
            throw new UnsupportedOperationException("");
         } else if (var8) {
            throw new UnsupportedOperationException("");
         } else {
            if (var3 >= 7) {
               this.groupCount = var2.readLargeSmart(-1382422445) * -831037161;
            } else {
               this.groupCount = Buffer.method12008(var2, (byte)5) * -831037161;
            }

            int var9 = 0;
            int var10 = -1;
            this.groupIds = new int[this.groupCount * 1969481383];
            if (var3 >= 7) {
               for (int var11 = 0; var11 < 1969481383 * this.groupCount; var11++) {
                  this.groupIds[var11] = var9 += var2.readLargeSmart(-1074369258);
                  if (this.groupIds[var11] > var10) {
                     var10 = this.groupIds[var11];
                  }
               }
            } else {
               for (int var19 = 0; var19 < this.groupCount * -1683019675; var19++) {
                  this.groupIds[var19] = var9 += Buffer.method12008(var2, (byte)5);
                  if (this.groupIds[var19] > var10) {
                     var10 = this.groupIds[var19];
                  }
               }
            }

            this.field5361 = (var10 + 1) * 405830037;
            this.groupCrcs = new int[-1716717933 * this.field5361];
            this.groupVersions = new int[-1031940338 * this.field5361];
            this.fileCounts = new int[this.field5361 * -1716717933];
            this.fileIds = new int[256283616 * this.field5361][];
            this.groups = new Object[this.field5361 * 672474657];
            this.files = new Object[-1716717933 * this.field5361][];
            if (var5) {
               this.groupNameHashes = new int[753193973 * this.field5361];
               Arrays.fill(this.groupNameHashes, -1);

               for (int var20 = 0; var20 < 1969481383 * this.groupCount; var20++) {
                  this.groupNameHashes[this.groupIds[var20]] = Buffer.method12015(var2, 1348658640);
               }

               this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
            }

            for (int var21 = 0; var21 < this.groupCount * 1969481383; var21++) {
               this.groupCrcs[this.groupIds[var21]] = Buffer.method12015(var2, -412277211);
            }

            if (var7) {
               this.field5370 = new int[this.field5361 * 859723099];
               this.field5371 = new int[1309761057 * this.field5361];

               for (int var22 = 0; var22 < this.groupCount * 1969481383; var22++) {
                  this.field5370[this.groupIds[var22]] = Buffer.method12015(var2, -430020509);
                  this.field5371[this.groupIds[var22]] = Buffer.method12015(var2, -861660842);
               }
            }

            for (int var23 = 0; var23 < this.groupCount * 1294851166; var23++) {
               this.groupVersions[this.groupIds[var23]] = Buffer.method12015(var2, 1270101247);
            }

            if (var3 >= 7) {
               for (int var24 = 0; var24 < -311728678 * this.groupCount; var24++) {
                  this.fileCounts[this.groupIds[var24]] = var2.readLargeSmart(-943055157);
               }

               for (int var25 = 0; var25 < 1195590335 * this.groupCount; var25++) {
                  int var12 = this.groupIds[var25];
                  int var13 = this.fileCounts[var12];
                  var9 = 0;
                  int var14 = -1;
                  this.fileIds[var12] = new int[var13];

                  for (int var15 = 0; var15 < var13; var15++) {
                     int var16 = this.fileIds[var12][var15] = var9 += var2.readLargeSmart(-926618480);
                     if (var16 > var14) {
                        var14 = var16;
                     }
                  }

                  this.files[var12] = new Object[1 + var14];
               }
            } else {
               for (int var26 = 0; var26 < this.groupCount * 513721305; var26++) {
                  this.fileCounts[this.groupIds[var26]] = Buffer.method12008(var2, (byte)5);
               }

               for (int var27 = 0; var27 < this.groupCount * 1969481383; var27++) {
                  int var29 = this.groupIds[var27];
                  int var31 = this.fileCounts[var29];
                  var9 = 0;
                  int var33 = -1;
                  this.fileIds[var29] = new int[var31];

                  for (int var35 = 0; var35 < var31; var35++) {
                     int var37 = this.fileIds[var29][var35] = var9 += Buffer.method12008(var2, (byte)5);
                     if (var37 > var33) {
                        var33 = var37;
                     }
                  }

                  this.files[var29] = new Object[var33 + 1];
               }
            }

            if (var5) {
               this.fileNameHashes = new int[1 + var10][];
               this.fileNameHashTables = new IntHashTable[1 + var10];

               for (int var28 = 0; var28 < this.groupCount * 1969481383; var28++) {
                  int var30 = this.groupIds[var28];
                  int var32 = this.fileCounts[var30];
                  this.fileNameHashes[var30] = new int[this.files[var30].length];
                  Arrays.fill(this.fileNameHashes[var30], -1);

                  for (int var34 = 0; var34 < var32; var34++) {
                     int var36 = null != this.fileIds[var30] ? this.fileIds[var30][var34] : var34;
                     this.fileNameHashes[var30][var36] = Buffer.method12015(var2, 77017671);
                  }

                  this.fileNameHashTables[var30] = new IntHashTable(this.fileNameHashes[var30]);
               }
            }
         }
      } else {
         throw new RuntimeException("");
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;I)Z")
   @ObfuscatedName("bj")
   public static boolean method8978(AbstractArchive var0, int var1) {
      if (var0 == null) {
         var0.loadData(var1, var1);
      }

      if (var0.files.length == 1) {
         return var0.tryLoadFile(0, var1, 756705879);
      } else if (1 == var0.files[var1].length) {
         return var0.tryLoadFile(var1, 0, 756705879);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("es")
   public void method9005() {
      for (int var1 = 0; var1 < this.groups.length; var1++) {
         this.groups[var1] = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ek")
   public void method9060(int var1) {
      this.loadGroup(var1, (byte)-100);
   }

   @ObfuscatedSignature(descriptor = "(I[I)Z")
   @ObfuscatedName("ka")
   public boolean method9061(int var1, int[] var2) {
      return this.buildFiles(var1, var2, 1255700466);
   }

   @ObfuscatedSignature(descriptor = "(II)[B")
   @ObfuscatedName("cl")
   public byte[] method8969(int var1, int var2) {
      return this.takeFileEncrypted(var1, var2, null, -590775437);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dn")
   public int method9001() {
      return this.field5361 * 498576780;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("br")
   int vmethod321(int var1) {
      return null != this.groups[var1] ? 100 : 0;
   }

   @ObfuscatedSignature(descriptor = "(II)[B")
   @ObfuscatedName("vd")
   public byte[] method9062(int var1, int var2) {
      return method9044(this, var1, var2, -2053428314);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)[B")
   @ObfuscatedName("cw")
   static final byte[] method8963(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      int var2 = var1.readUnsignedByte(-843894915);
      int var3 = Buffer.method12015(var1, 246876029);
      if (var3 >= 0 && (field5355 * 741238659 == 0 || var3 <= field5355 * 741238659)) {
         if (var2 == 0) {
            byte[] var6 = new byte[var3];
            var1.readBytes(var6, 0, var3, (byte)13);
            return var6;
         } else {
            int var4 = Buffer.method12015(var1, 66480338);
            if (var4 >= 0 && (741238659 * field5355 == 0 || var4 <= field5355 * 741238659)) {
               byte[] var5 = new byte[var4];
               if (1 == var2) {
                  BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
               } else {
                  GZipDecompressor.method12237(gzipDecompressor, var1, var5, -535278753);
               }

               return var5;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(II[I)[B")
   @ObfuscatedName("dy")
   public byte[] method8973(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
         if (null == this.files[var1][var2]) {
            boolean var4 = this.buildFiles(var1, var3, 854100782);
            if (!var4) {
               this.loadGroup(var1, (byte)-39);
               var4 = this.buildFiles(var1, var3, -157093480);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var6 = FriendSystem.method408(this.files[var1][var2], false, -1526493704);
         if (this.shallowFiles) {
            this.files[var1][var2] = null;
         }

         return var6;
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(II[I)[B")
   @ObfuscatedName("dc")
   public byte[] method8974(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
         if (null == this.files[var1][var2]) {
            boolean var4 = this.buildFiles(var1, var3, 1270759653);
            if (!var4) {
               this.loadGroup(var1, (byte)-89);
               var4 = this.buildFiles(var1, var3, 2116010900);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var6 = FriendSystem.method408(this.files[var1][var2], false, -1854338252);
         if (this.shallowFiles) {
            this.files[var1][var2] = null;
         }

         return var6;
      } else {
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;I)[B")
   @ObfuscatedName("xm")
   public static byte[] method8987(AbstractArchive var0, int var1) {
      if (1 == var0.files.length) {
         return var0.getFile(0, var1, -2141868039);
      } else if (1 == var0.files[var1].length) {
         return var0.getFile(var1, 0, -797089733);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("db")
   public boolean method8976(int var1, int var2) {
      if (var1 >= 0 && var1 < this.files.length && null != this.files[var1] && var2 >= 0 && var2 < this.files[var1].length) {
         if (this.files[var1][var2] != null) {
            return true;
         } else if (null != this.groups[var1]) {
            return true;
         } else {
            this.loadGroup(var1, (byte)-86);
            return this.groups[var1] != null;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("dt")
   public boolean method8979(int var1) {
      if (this.files.length == 1) {
         return this.tryLoadFile(0, var1, 756705879);
      } else if (1 == this.files[var1].length) {
         return this.tryLoadFile(var1, 0, 756705879);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;II)[I")
   @ObfuscatedName("rq")
   public static int[] method8992(AbstractArchive var0, int var1, int var2) {
      if (var0 == null) {
         return var0.getGroupFileIds(var1, var1);
      } else {
         try {
            if (var1 >= 0) {
               if (var2 != -1775968255) {
                  throw new IllegalStateException();
               }

               if (var1 < var0.fileIds.length) {
                  return var0.fileIds[var1];
               }
            }

            return null;
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "qm.cb(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("em")
   public void method9012() {
      for (int var1 = 0; var1 < this.files.length; var1++) {
         if (this.files[var1] != null) {
            for (int var2 = 0; var2 < this.files[var1].length; var2++) {
               this.files[var1][var2] = null;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("dz")
   public boolean method8980(int var1) {
      if (null != this.groups[var1]) {
         return true;
      } else {
         this.loadGroup(var1, (byte)-9);
         return this.groups[var1] != null;
      }
   }

   AbstractArchive(boolean var1, boolean var2) {
      this.releaseGroups = var1;
      this.shallowFiles = var2;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("da")
   public boolean method8983() {
      boolean var1 = true;

      for (int var2 = 0; var2 < this.groupIds.length; var2++) {
         int var3 = this.groupIds[var2];
         if (this.groups[var3] == null) {
            this.loadGroup(var3, (byte)-43);
            if (this.groups[var3] == null) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("dl")
   public byte[] method8988(int var1) {
      if (1 == this.files.length) {
         return this.getFile(0, var1, 579993653);
      } else if (1 == this.files[var1].length) {
         return this.getFile(var1, 0, 28487159);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I[I)Z")
   @ObfuscatedName("el")
   boolean method9016(int var1, int[] var2) {
      if (this.groups[var1] == null) {
         return false;
      } else {
         int var3 = this.fileCounts[var1];
         int[] var4 = this.fileIds[var1];
         Object[] var5 = this.files[var1];
         boolean var6 = true;

         for (int var7 = 0; var7 < var3; var7++) {
            if (var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var19;
            if (var2 == null || 0 == var2[0] && 0 == var2[1] && var2[2] == 0 && 0 == var2[3]) {
               var19 = FriendSystem.method408(this.groups[var1], false, -1900517310);
            } else {
               var19 = FriendSystem.method408(this.groups[var1], true, -2034467604);
               Buffer var8 = new Buffer(var19);
               var8.xteaDecrypt(var2, 5, var8.array.length, (byte)-13);
            }

            byte[] var20;
            try {
               var20 = HttpRequestTask.decompressBytes(var19, 1733044161);
            } catch (RuntimeException var18) {
               throw RestClientThreadFactory.newRunException(
                  var18,
                  ""
                     + (null != var2)
                     + ","
                     + var1
                     + ","
                     + var19.length
                     + ","
                     + HttpRequestTask.method86(var19, var19.length, (byte)60)
                     + ","
                     + HttpRequestTask.method86(var19, var19.length - 2, (byte)60)
                     + ","
                     + this.groupCrcs[var1]
                     + ","
                     + this.hash * 1599863785
               );
            }

            if (this.releaseGroups) {
               this.groups[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               int var10 = var20[--var9] & 833257532;
               var9 -= var10 * var3 * 4;
               Buffer var11 = new Buffer(var20);
               int[] var12 = new int[var3];
               var11.offset = 1741769013 * var9;

               for (int var13 = 0; var13 < var10; var13++) {
                  int var14 = 0;

                  for (int var15 = 0; var15 < var3; var15++) {
                     var14 += Buffer.method12015(var11, -895518451);
                     var12[var15] += var14;
                  }
               }

               byte[][] var23 = new byte[var3][];

               for (int var24 = 0; var24 < var3; var24++) {
                  var23[var24] = new byte[var12[var24]];
                  var12[var24] = 0;
               }

               var11.offset = var9 * 543547540;
               int var25 = 0;

               for (int var26 = 0; var26 < var10; var26++) {
                  int var16 = 0;

                  for (int var17 = 0; var17 < var3; var17++) {
                     var16 += Buffer.method12015(var11, -793472630);
                     System.arraycopy(var20, var25, var23[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var25 += var16;
                  }
               }

               for (int var27 = 0; var27 < var3; var27++) {
                  if (!this.shallowFiles) {
                     var5[var4[var27]] = BufferedSource.method10618(var23[var27], false, (byte)0);
                  } else {
                     var5[var4[var27]] = var23[var27];
                  }
               }
            } else if (!this.shallowFiles) {
               var5[var4[0]] = BufferedSource.method10618(var20, false, (byte)0);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ew")
   public void method9013() {
      for (int var1 = 0; var1 < this.files.length; var1++) {
         if (this.files[var1] != null) {
            for (int var2 = 0; var2 < this.files[var1].length; var2++) {
               this.files[var1][var2] = null;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("er")
   public void method9055(int var1) {
      for (int var2 = 0; var2 < this.groups.length; var2++) {
         if (this.groups[var2] instanceof DirectByteArrayCopier) {
            ((DirectByteArrayCopier)this.groups[var2]).method7843();
         }

         this.groups[var2] = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("dp")
   public int[] method8993(int var1) {
      return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("dg")
   public int[] method8994(int var1) {
      return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ds")
   public int[] method8995(int var1) {
      return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("de")
   public int method8997(int var1) {
      return this.files != null && var1 < this.files.length && null != this.files[var1] ? this.files[var1].length : 0;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("do")
   public int method8998(int var1) {
      return this.files != null && var1 < this.files.length && null != this.files[var1] ? this.files[var1].length : 0;
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;B)I")
   @ObfuscatedName("ej")
   public static int method9041(AbstractArchive var0, String var1, byte var2) {
      if (var0 == null) {
         return var0.getGroupId(var1, var2);
      } else {
         try {
            var1 = var1.toLowerCase();
            int var3 = var0.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
            return var0.groupLoadPercent(var3, 743318851);
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "qm.cq(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dk")
   public int method8999(int var1) {
      return this.files != null && var1 < this.files.length && null != this.files[var1] ? this.files[var1].length : 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luf;ZZZ)Z")
   @ObfuscatedName("wu")
   public static boolean method8967(class524 var0, boolean var1, boolean var2, boolean var3) {
      return var0 == null ? var0.method11158(var1, var1, var1) : var0.method11135(-884512677 * var0.field6039, var1, var2, var3, (byte)-73);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
   @ObfuscatedName("cz")
   public byte[] takeFileByNames(String var1, String var2, int var3) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
         int var5 = this.fileNameHashTables[var4].get(Projectile.hashString(var2, 1277556611), 1123379343);
         return this.getFile(var4, var5, -41238410);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "qm.cz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cs")
   public void clearGroups(int var1) {
      for (int var2 = 0; var2 < this.files[var1].length; var2++) {
         this.files[var1][var2] = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[B")
   @ObfuscatedName("dw")
   public byte[] method8970(int var1, int var2) {
      return this.takeFileEncrypted(var1, var2, null, -590775437);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ee")
   public void method9006() {
      for (int var1 = 0; var1 < this.groups.length; var1++) {
         this.groups[var1] = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ej")
   public void method9008(int var1) {
      for (int var2 = 0; var2 < this.files[var1].length; var2++) {
         this.files[var1][var2] = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;ILjava/lang/String;I)I")
   @ObfuscatedName("ky")
   public static int method9022(AbstractArchive var0, int var1, String var2, int var3) {
      if (var0 == null) {
         return var0.getFileId(var1, var2, var1);
      } else {
         try {
            var2 = var2.toLowerCase();
            return var0.fileNameHashTables[var1].get(Projectile.hashString(var2, 1277556611), 1123379343);
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "qm.cp(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[B")
   @ObfuscatedName("dd")
   public byte[] method8971(int var1, int var2) {
      return this.takeFileEncrypted(var1, var2, null, -590775437);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ye")
   public void method9009(int var1) {
      for (int var2 = 0; var2 < this.files[var1].length; var2++) {
         this.files[var1][var2] = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ao")
   void vmethod319(int var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("ep")
   public int method9018(String var1) {
      var1 = var1.toLowerCase();
      return this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("fl")
   public int method9019(String var1) {
      var1 = var1.toLowerCase();
      return this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("ex")
   public int method9020(String var1) {
      var1 = var1.toLowerCase();
      return this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
   }

   @ObfuscatedSignature(descriptor = "(I)[B")
   @ObfuscatedName("dr")
   public byte[] method8989(int var1) {
      if (1 == this.files.length) {
         return this.getFile(0, var1, 769672358);
      } else if (1 == this.files[var1].length) {
         return this.getFile(var1, 0, 1531114844);
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;I)V")
   @ObfuscatedName("nb")
   public static void method9010(AbstractArchive var0, int var1) {
      if (var0 == null) {
         var0.clearGroups(var1);
      } else {
         for (int var2 = 0; var2 < var0.files[var1].length; var2++) {
            var0.files[var1][var2] = null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("cn")
   public void clearFilesGroup(int var1, byte var2) {
      for (int var3 = 0; var3 < this.files[var1].length; var3++) {
         if (this.files[var1][var3] instanceof DirectByteArrayCopier) {
            ((DirectByteArrayCopier)this.files[var1][var3]).method7843();
         }

         this.files[var1][var3] = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)I")
   @ObfuscatedName("ey")
   public int method9023(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.fileNameHashTables[var1].get(Projectile.hashString(var2, 1277556611), 1123379343);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Z)[B")
   @ObfuscatedName("nk")
   public static byte[] method9063(Object var0, boolean var1) {
      return FriendSystem.method408(var0, var1, -1445947552);
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)I")
   @ObfuscatedName("ev")
   public int method9024(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.fileNameHashTables[var1].get(Projectile.hashString(var2, 1277556611), 1123379343);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ec")
   public int method9002() {
      return this.field5361 * 515889508;
   }

   @ObfuscatedSignature(descriptor = "([BI)V")
   @ObfuscatedName("bl")
   void decodeIndex(byte[] var1, int var2) {
      try {
         this.hash = HttpRequestTask.method86(var1, var1.length, (byte)60) * -2114810791;
         Buffer var3 = new Buffer(HttpRequestTask.decompressBytes(var1, 1733044161));
         int var4 = var3.readUnsignedByte(1316491782);
         if (var4 >= 5) {
            if (var2 >= 680976127) {
               return;
            }

            if (var4 <= 7) {
               if (var4 >= 6) {
                  if (var2 >= 680976127) {
                     throw new IllegalStateException();
                  }

                  Buffer.method12015(var3, 511616117);
               }

               int var5 = var3.readUnsignedByte(-136515542);
               boolean var10000;
               if ((var5 & 1) != 0) {
                  if (var2 >= 680976127) {
                     throw new IllegalStateException();
                  }

                  var10000 = 1;
               } else {
                  var10000 = 0;
               }

               boolean var6 = (boolean)var10000;
               if (0 != (var5 & 2)) {
                  if (var2 >= 680976127) {
                     throw new IllegalStateException();
                  }

                  var10000 = (boolean)1;
               } else {
                  var10000 = (boolean)0;
               }

               boolean var7 = var10000;
               if ((var5 & 4) != 0) {
                  if (var2 >= 680976127) {
                     throw new IllegalStateException();
                  }

                  var10000 = (boolean)1;
               } else {
                  var10000 = (boolean)0;
               }

               boolean var8 = var10000;
               if (0 != (var5 & 8)) {
                  if (var2 >= 680976127) {
                     return;
                  }

                  var10000 = (boolean)1;
               } else {
                  var10000 = (boolean)0;
               }

               boolean var9 = var10000;
               if (var7) {
                  throw new UnsupportedOperationException("");
               }

               if (var9) {
                  if (var2 >= 680976127) {
                     throw new IllegalStateException();
                  }

                  throw new UnsupportedOperationException("");
               }

               if (var4 >= 7) {
                  if (var2 >= 680976127) {
                     return;
                  }

                  this.groupCount = var3.readLargeSmart(-872973509) * -831037161;
               } else {
                  this.groupCount = Buffer.method12008(var3, (byte)5) * -831037161;
               }

               int var10 = 0;
               int var11 = -1;
               this.groupIds = new int[this.groupCount * 1969481383];
               if (var4 >= 7) {
                  if (var2 >= 680976127) {
                     throw new IllegalStateException();
                  }

                  for (int var12 = 0; var12 < 1969481383 * this.groupCount; var12++) {
                     if (var2 >= 680976127) {
                        throw new IllegalStateException();
                     }

                     this.groupIds[var12] = var10 += var3.readLargeSmart(-1497980145);
                     if (this.groupIds[var12] > var11) {
                        if (var2 >= 680976127) {
                           return;
                        }

                        var11 = this.groupIds[var12];
                     }
                  }
               } else {
                  for (int var21 = 0; var21 < this.groupCount * 1969481383; var21++) {
                     if (var2 >= 680976127) {
                        throw new IllegalStateException();
                     }

                     this.groupIds[var21] = var10 += Buffer.method12008(var3, (byte)5);
                     if (this.groupIds[var21] > var11) {
                        if (var2 >= 680976127) {
                           throw new IllegalStateException();
                        }

                        var11 = this.groupIds[var21];
                     }
                  }
               }

               this.field5361 = (var11 + 1) * -711813221;
               this.groupCrcs = new int[-1716717933 * this.field5361];
               this.groupVersions = new int[-1716717933 * this.field5361];
               this.fileCounts = new int[this.field5361 * -1716717933];
               this.fileIds = new int[-1716717933 * this.field5361][];
               this.groups = new Object[this.field5361 * -1716717933];
               this.files = new Object[-1716717933 * this.field5361][];
               if (var6) {
                  if (var2 >= 680976127) {
                     return;
                  }

                  this.groupNameHashes = new int[-1716717933 * this.field5361];
                  Arrays.fill(this.groupNameHashes, -1);

                  for (int var22 = 0; var22 < 1969481383 * this.groupCount; var22++) {
                     this.groupNameHashes[this.groupIds[var22]] = Buffer.method12015(var3, 404841458);
                  }

                  this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
               }

               for (int var23 = 0; var23 < this.groupCount * 1969481383; var23++) {
                  if (var2 >= 680976127) {
                     return;
                  }

                  this.groupCrcs[this.groupIds[var23]] = Buffer.method12015(var3, -971002752);
               }

               if (var8) {
                  if (var2 >= 680976127) {
                     throw new IllegalStateException();
                  }

                  this.field5370 = new int[this.field5361 * -1716717933];
                  this.field5371 = new int[-1716717933 * this.field5361];

                  for (int var24 = 0; var24 < this.groupCount * 1969481383; var24++) {
                     if (var2 >= 680976127) {
                        throw new IllegalStateException();
                     }

                     this.field5370[this.groupIds[var24]] = Buffer.method12015(var3, 1399589584);
                     this.field5371[this.groupIds[var24]] = Buffer.method12015(var3, 504150997);
                  }
               }

               for (int var25 = 0; var25 < this.groupCount * 1969481383; var25++) {
                  this.groupVersions[this.groupIds[var25]] = Buffer.method12015(var3, 233794211);
               }

               if (var4 >= 7) {
                  for (int var26 = 0; var26 < 1969481383 * this.groupCount; var26++) {
                     if (var2 >= 680976127) {
                        throw new IllegalStateException();
                     }

                     this.fileCounts[this.groupIds[var26]] = var3.readLargeSmart(-1546864133);
                  }

                  for (int var27 = 0; var27 < 1969481383 * this.groupCount; var27++) {
                     if (var2 >= 680976127) {
                        throw new IllegalStateException();
                     }

                     int var13 = this.groupIds[var27];
                     int var14 = this.fileCounts[var13];
                     var10 = 0;
                     int var15 = -1;
                     this.fileIds[var13] = new int[var14];

                     for (int var16 = 0; var16 < var14; var16++) {
                        if (var2 >= 680976127) {
                           throw new IllegalStateException();
                        }

                        int var17 = this.fileIds[var13][var16] = var10 += var3.readLargeSmart(-941047958);
                        if (var17 > var15) {
                           if (var2 >= 680976127) {
                              throw new IllegalStateException();
                           }

                           var15 = var17;
                        }
                     }

                     this.files[var13] = new Object[1 + var15];
                  }
               } else {
                  for (int var28 = 0; var28 < this.groupCount * 1969481383; var28++) {
                     if (var2 >= 680976127) {
                        throw new IllegalStateException();
                     }

                     this.fileCounts[this.groupIds[var28]] = Buffer.method12008(var3, (byte)5);
                  }

                  for (int var29 = 0; var29 < this.groupCount * 1969481383; var29++) {
                     if (var2 >= 680976127) {
                        throw new IllegalStateException();
                     }

                     int var31 = this.groupIds[var29];
                     int var33 = this.fileCounts[var31];
                     var10 = 0;
                     int var35 = -1;
                     this.fileIds[var31] = new int[var33];

                     for (int var37 = 0; var37 < var33; var37++) {
                        if (var2 >= 680976127) {
                           throw new IllegalStateException();
                        }

                        int var39 = this.fileIds[var31][var37] = var10 += Buffer.method12008(var3, (byte)5);
                        if (var39 > var35) {
                           if (var2 >= 680976127) {
                              throw new IllegalStateException();
                           }

                           var35 = var39;
                        }
                     }

                     this.files[var31] = new Object[var35 + 1];
                  }
               }

               if (var6) {
                  if (var2 >= 680976127) {
                     throw new IllegalStateException();
                  }

                  this.fileNameHashes = new int[1 + var11][];
                  this.fileNameHashTables = new IntHashTable[1 + var11];

                  for (int var30 = 0; var30 < this.groupCount * 1969481383; var30++) {
                     if (var2 >= 680976127) {
                        return;
                     }

                     int var32 = this.groupIds[var30];
                     int var34 = this.fileCounts[var32];
                     this.fileNameHashes[var32] = new int[this.files[var32].length];
                     Arrays.fill(this.fileNameHashes[var32], -1);

                     for (int var36 = 0; var36 < var34; var36++) {
                        if (var2 >= 680976127) {
                           return;
                        }

                        if (null != this.fileIds[var32]) {
                           if (var2 >= 680976127) {
                              return;
                           }

                           var10000 = this.fileIds[var32][var36];
                        } else {
                           var10000 = var36;
                        }

                        int var38 = var10000;
                        this.fileNameHashes[var32][var38] = Buffer.method12015(var3, -195860063);
                     }

                     this.fileNameHashTables[var32] = new IntHashTable(this.fileNameHashes[var32]);
                  }
               }

               return;
            }

            if (var2 >= 680976127) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var18) {
         throw RestClientThreadFactory.newRunException(var18, "qm.bl(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)[B")
   @ObfuscatedName("ng")
   public static byte[] method8990(AbstractArchive var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method8989(var1);
      } else if (var1 >= 0 && var1 < var0.files.length && var0.files[var1] != null && var2 >= 0 && var2 < var0.files[var1].length) {
         if (var0.files[var1][var2] == null) {
            boolean var3 = var0.buildFiles(var1, null, -758393119);
            if (!var3) {
               var0.loadGroup(var1, (byte)-12);
               var3 = var0.buildFiles(var1, null, -1356420169);
               if (!var3) {
                  return null;
               }
            }
         }

         return FriendSystem.method408(var0.files[var1][var2], false, -1475658466);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(II[I)[B")
   @ObfuscatedName("df")
   public byte[] method8975(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
         if (null == this.files[var1][var2]) {
            boolean var4 = this.buildFiles(var1, var3, -1049639597);
            if (!var4) {
               this.loadGroup(var1, (byte)-120);
               var4 = this.buildFiles(var1, var3, 1081701793);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var6 = FriendSystem.method408(this.files[var1][var2], false, -1883852228);
         if (this.shallowFiles) {
            this.files[var1][var2] = null;
         }

         return var6;
      } else {
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;Ljava/lang/String;)Z")
   @ObfuscatedName("ex")
   public static boolean method9032(AbstractArchive var0, String var1, String var2) {
      if (var0 == null) {
         return var0.isOverlayOutdated();
      } else {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var3 = var0.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
         int var4 = var0.fileNameHashTables[var3].get(Projectile.hashString(var2, 1277556611), 1123379343);
         return var0.tryLoadFile(var3, var4, 756705879);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z")
   @ObfuscatedName("eb")
   public boolean method9033(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
      int var4 = this.fileNameHashTables[var3].get(Projectile.hashString(var2, 1277556611), 1123379343);
      return this.tryLoadFile(var3, var4, 756705879);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)Z")
   @ObfuscatedName("wn")
   public static boolean method8984(AbstractArchive var0) {
      if (var0 == null) {
         return var0.method8983();
      } else {
         boolean var1 = true;

         for (int var2 = 0; var2 < var0.groupIds.length; var2++) {
            int var3 = var0.groupIds[var2];
            if (var0.groups[var3] == null) {
               var0.loadGroup(var3, (byte)-93);
               if (var0.groups[var3] == null) {
                  var1 = false;
               }
            }
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z")
   @ObfuscatedName("eo")
   public boolean method9034(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
      int var4 = this.fileNameHashTables[var3].get(Projectile.hashString(var2, 1277556611), 1123379343);
      return this.tryLoadFile(var3, var4, 756705879);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B")
   @ObfuscatedName("eh")
   public byte[] method9028(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
      int var4 = this.fileNameHashTables[var3].get(Projectile.hashString(var2, 1277556611), 1123379343);
      return this.getFile(var3, var4, -663243798);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ea")
   public int method9003() {
      return this.field5361 * -1716717933;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("fb")
   public boolean method9038(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
      return this.tryLoadGroup(var2, -2063835755);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("fn")
   public void method9040(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
      if (var2 >= 0) {
         this.loadRegionFromGroup(var2, 2109701713);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("ud")
   public int method9042(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
      return this.groupLoadPercent(var2, 743318851);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("at")
   static int method8964(String var0, int var1) {
      try {
         if (var0.equals("centre")) {
            if (var1 == 529081187) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else {
            if (!var0.equals("bottom")) {
               if (var1 == 529081187) {
                  throw new IllegalStateException();
               }

               if (!var0.equals("right")) {
                  return 0;
               }

               if (var1 == 529081187) {
                  throw new IllegalStateException();
               }
            }

            return 2;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qm.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I[I)V")
   @ObfuscatedName("rs")
   public void method9052(int var1, int[] var2) {
      if (this.releaseGroups && this.groups[var1] == null && this.field5364 instanceof DirectByteArrayCopier) {
         ((DirectByteArrayCopier)this.field5364).method7843();
      }

      this.field5364 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;Ljava/lang/String;)[B")
   @ObfuscatedName("ai")
   public static byte[] method9029(AbstractArchive var0, String var1, String var2) {
      if (var0 == null) {
         var0.method9040(var1);
      }

      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = var0.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
      int var4 = var0.fileNameHashTables[var3].get(Projectile.hashString(var2, 1277556611), 1123379343);
      return var0.getFile(var3, var4, -567161091);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)Lrl;")
   @ObfuscatedName("av")
   public static Bounds method8960(int var0, int var1, int var2, int var3, int var4) {
      try {
         synchronized (Bounds.field5543) {
            if (-1799388663 * Bounds.field5541 == 0) {
               if (var4 >= 1173493416) {
                  throw new IllegalStateException();
               } else {
                  return new Bounds(var0, var1, var2, var3);
               }
            } else {
               Bounds.field5541 -= -1383158727;
               Bounds.method9496(Bounds.field5543[-1799388663 * Bounds.field5541], var0, var1, 1101244774);
               Bounds.method9503(Bounds.field5543[Bounds.field5541 * -1799388663], var2, var3, (short)16384);
               return Bounds.field5543[Bounds.field5541 * -1799388663];
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "qm.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ck")
   public int getGroupFileCount(int var1, byte var2) {
      if (this.files != null && var1 < this.files.length) {
         Object[] var3 = this.files[var1];
         return var3 == null ? 0 : var3.length;
      } else {
         return 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I[I)V")
   @ObfuscatedName("sf")
   public void method9054(int var1, int[] var2) {
      this.field5364 = this.groups[var1];
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)I")
   @ObfuscatedName("cp")
   public int getFileId(int var1, String var2, int var3) {
      try {
         var2 = var2.toLowerCase();
         return this.fileNameHashTables[var1].get(Projectile.hashString(var2, 1277556611), 1123379343);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qm.cp(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)I")
   @ObfuscatedName("cg")
   public int getGroupId(String var1, byte var2) {
      try {
         var1 = var1.toLowerCase();
         int var3 = this.groupNameHashTable.get(Projectile.hashString(var1, 1277556611), 1123379343);
         return this.groupLoadPercent(var3, 743318851);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "qm.cq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)[B")
   @ObfuscatedName("bc")
   public byte[] takeFile(int var1, int var2, int var3) {
      if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
         Object var4 = this.files[var1][var2];
         if (var4 == null) {
            synchronized (this) {
               Object var6 = this.groups[var1];
               if (var6 == null) {
                  this.clearGroups(var1);
               }

               this.method9061(var1, null);
               var4 = this.files[var1][var2];
            }
         }

         return var4 == null ? null : method9063(var4, false);
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eq")
   public void method9014() {
      for (int var1 = 0; var1 < this.files.length; var1++) {
         if (this.files[var1] != null) {
            for (int var2 = 0; var2 < this.files[var1].length; var2++) {
               this.files[var1][var2] = null;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)[I")
   @ObfuscatedName("cb")
   public int[] getGroupFileIds(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 != -1775968255) {
               throw new IllegalStateException();
            }

            if (var1 < this.fileIds.length) {
               return this.fileIds[var1];
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qm.cb(" + ')');
      }
   }
}
