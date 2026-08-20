import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qn")
public class Archive extends AbstractArchive {
   @ObfuscatedName("ad")
   int index;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field5394 = 200;
   @ObfuscatedName("as")
   boolean field5382;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field5391 = 2;
   @ObfuscatedName("aw")
   static CRC32 Archive_crc = new CRC32();
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5393 = 0;
   @ObfuscatedName("ay")
   boolean field5386;
   @ObfuscatedSignature(descriptor = "Ltf;")
   @ObfuscatedName("au")
   ArchiveDisk archiveDisk;
   @ObfuscatedSignature(descriptor = "Ltf;")
   @ObfuscatedName("az")
   ArchiveDisk masterDisk;
   @ObfuscatedName("ar")
   int field5380;
   @ObfuscatedName("ai")
   volatile int field5381;
   @ObfuscatedSignature(descriptor = "Lqy;")
   @ObfuscatedName("ah")
   JagNetThread field5383;
   @ObfuscatedName("ac")
   volatile boolean[] validGroups;
   @ObfuscatedName("ab")
   int indexCrc;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field5395 = 200;
   @ObfuscatedName("ap")
   boolean field5385 = false;
   @ObfuscatedName("ax")
   int indexVersion;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field5392 = 4;

   @ObfuscatedSignature(descriptor = "(I[BZZI)V")
   @ObfuscatedName("ak")
   void write(int var1, byte[] var2, boolean var3, boolean var4, int var5) {
      try {
         if (var3) {
            if (var5 != 1799083207) {
               throw new IllegalStateException();
            }

            if (-1934961457 * this.field5381 == 1) {
               if (var5 != 1799083207) {
                  return;
               }

               throw new RuntimeException();
            }

            if (null != this.masterDisk) {
               if (var5 != 1799083207) {
                  return;
               }

               classUQ.method11201(-669659167 * this.index, var2, this.masterDisk, (short)-5185);
            }

            this.decodeIndex(var2, -1074822005);
            this.loadAllLocal(-1924431354);
         } else {
            var2[var2.length - 4] = (byte)(this.groupVersions[var1] >> 24);
            var2[var2.length - 3] = (byte)(this.groupVersions[var1] >> 16);
            var2[var2.length - 2] = (byte)(this.groupVersions[var1] >> 8);
            var2[var2.length - 1] = (byte)this.groupVersions[var1];
            if (this.archiveDisk != null) {
               if (var5 != 1799083207) {
                  return;
               }

               classUQ.method11201(var1, var2, this.archiveDisk, (short)-12994);
               this.validGroups[var1] = true;
            }

            if (var4) {
               if (var5 != 1799083207) {
                  throw new IllegalStateException();
               }

               this.groups[var1] = BufferedSource.method10618(var2, false, (byte)0);
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "qn.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("by")
   public boolean method9065(int var1) {
      try {
         boolean var10000;
         if (-1934961457 * this.field5381 == 1) {
            if (var1 == 1043655671) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qn.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bj")
   void method9088() {
      this.validGroups = new boolean[this.groups.length];

      for (int var1 = 0; var1 < this.validGroups.length; var1++) {
         this.validGroups[var1] = false;
      }

      if (null == this.archiveDisk) {
         this.field5381 = 1634054703;
      } else {
         this.field5380 = 1193483801;

         for (int var8 = 0; var8 < this.validGroups.length; var8++) {
            if (this.fileCounts[var8] > 0) {
               ArchiveDisk var2 = this.archiveDisk;
               ArchiveDiskAction var4 = new ArchiveDiskAction();
               var4.type = 248909753;
               var4.key = var8;
               var4.archiveDisk = var2;
               var4.archive = this;
               synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                  ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4);
               }

               class228.method4852(1864899218);
               this.field5380 = var8 * -1193483801;
            }
         }

         if (this.field5380 * 1387569623 == -1) {
            this.field5381 = 1634054703;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("aa")
   public void method9108(String var1) {
      this.loadRegionFromName(var1, 987702175);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqn;)I")
   @ObfuscatedName("mr")
   public static int method9071(Archive var0) {
      if (1 != var0.field5381 * -1559115413 && (!var0.field5386 || 2 != var0.field5381 * 296435600)) {
         if (var0.groups != null) {
            return -192589650;
         } else {
            int var1 = var0.field5383.method9257(class418.field5425.field5451 * 1654631247, var0.index * -857064021, 1928452077);
            if (var1 >= 100) {
               var1 = 99;
            }

            return var1;
         }
      } else {
         return 1171390329;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqn;)V")
   @ObfuscatedName("ou")
   public static void method9076(Archive var0) {
      if (var0 == null) {
         var0.method9078();
      }

      var0.field5381 = 1536306595;
      var0.groupIds = new int[0];
      var0.groupCrcs = new int[0];
      var0.groupVersions = new int[0];
      var0.fileCounts = new int[0];
      var0.fileIds = new int[0][];
      var0.groups = new Object[0];
      var0.files = new Object[0][];
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   @Override
   void vmethod322(int var1) {
      if (null != this.archiveDisk && this.validGroups != null && this.validGroups[var1]) {
         ArchiveDisk var2 = this.archiveDisk;
         byte[] var4 = null;
         synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last();
               var6 != null;
               var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()
            ) {
               if (var6.key == var1 && var2 == var6.archiveDisk && 0 == 1892501129 * var6.type) {
                  var4 = var6.data;
                  break;
               }
            }
         }

         if (null != var4) {
            this.load(var2, var1, var4, true, -327044981);
         } else {
            byte[] var9 = var2.read(var1, -593173048);
            this.load(var2, var1, var9, true, 503988913);
         }
      } else {
         this.field5383.method9268(this, this.index * -669659167, var1, this.groupCrcs[var1], (byte)4, true, -1630790925);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ax")
   public boolean method9066() {
      return -1934961457 * this.field5381 == 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkb;)I")
   @ObfuscatedName("lb")
   public static int method9064(WorldEntityCoord var0) {
      return var0 == null ? var0.method6247() : var0.z * -179609957;
   }

   @ObfuscatedSignature(descriptor = "(Ltf;I[BZI)V")
   @ObfuscatedName("aw")
   public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4, int var5) {
      if (var1 == this.masterDisk) {
         if (this.field5381 * -1934961457 == 1) {
            throw new RuntimeException();
         }

         if (var3 == null) {
            this.field5383.method9269(this, 255, this.index * -669659167, this.indexCrc * -1643278115, (byte)0, true);
         } else {
            int var6;
            synchronized (Archive_crc) {
               Archive_crc.reset();
               Archive_crc.update(var3, 0, var3.length);
               var6 = (int)Archive_crc.getValue();
            }

            if (var6 != this.indexCrc * -1643278115) {
               this.field5383.method9269(this, 255, this.index * -669659167, this.indexCrc * -1643278115, (byte)0, true);
            } else {
               Buffer var16 = new Buffer(method9110(var3));
               int var8 = var16.method12221();
               if (var8 < 5 || var8 > 7) {
                  throw new RuntimeException(var8 + "," + this.index * -669659167 + "," + var2);
               }

               int var9 = 0;
               if (var8 >= 6) {
                  var9 = var16.method12226();
               }

               if (var9 != this.indexVersion * 1508356495) {
                  this.field5383.method9269(this, 255, this.index * -669659167, this.indexCrc * -1643278115, (byte)0, true);
               } else {
                  this.method9109(var3);
                  this.method9112();
               }
            }
         }
      } else {
         if (!var4 && var2 == this.field5380 * 1387569623) {
            this.field5381 = 1 * 1634054703;
         }

         if (var3 != null && var3.length > 4) {
            int var15;
            synchronized (Archive_crc) {
               Archive_crc.reset();
               Archive_crc.update(var3, 0, var3.length - 4);
               var15 = (int)Archive_crc.getValue();
            }

            int var18 = (var3[var3.length - 4] & 255) << 24
               | (var3[var3.length - 3] & 255) << 16
               | (var3[var3.length - 2] & 255) << 8
               | var3[var3.length - 1] & 255;
            if (var15 != super.groupCrcs[var2] || var18 != super.groupVersions[var2]) {
               synchronized (Archive_crc) {
                  Archive_crc.reset();
                  Archive_crc.update(var3, 0, var3.length - 2);
                  var15 = (int)Archive_crc.getValue();
               }

               var18 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
            }

            if (var15 == super.groupCrcs[var2] && var18 == super.groupVersions[var2]) {
               this.validGroups[var2] = true;
               if (var4) {
                  assert super.groups[var2] == null;

                  super.groups[var2] = method9105(var3, false);
               }
            } else {
               this.validGroups[var2] = false;
               if (this.field5382 || var4) {
                  this.field5383.method9269(this, this.index * -669659167, var2, super.groupCrcs[var2], (byte)4, var4);
               }
            }
         } else {
            this.validGroups[var2] = false;
            if (this.field5382 || var4) {
               this.field5383.method9269(this, this.index * -669659167, var2, super.groupCrcs[var2], (byte)4, var4);
            }
         }
      }
   }

   public Archive(ArchiveDisk var1, ArchiveDisk var2, JagNetThread var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      super(var5, var6);
      this.field5386 = false;
      this.field5381 = 0;
      this.field5382 = false;
      this.field5380 = 1193483801;
      this.archiveDisk = var1;
      this.masterDisk = var2;
      this.index = var4 * -406408159;
      this.field5382 = var7;
      this.field5386 = var8;
      this.field5385 = var9;
      this.field5383 = var3;
      this.field5383.method9242(this, -669659167 * this.index, (byte)0);
      this.method9106(var1, var2, var3, var4, var5, var6, var7);
   }

   @ObfuscatedSignature(descriptor = "(Lqn;B)I")
   @ObfuscatedName("ox")
   public static int method9072(Archive var0, byte var1) {
      if (var0 == null) {
         return var0.percentage(var1);
      } else {
         try {
            if (1 == var0.field5381 * -1934961457) {
               return 100;
            } else if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               if (var0.field5386) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (2 == var0.field5381 * -1934961457) {
                     if (var1 <= 1) {
                        throw new IllegalStateException();
                     }

                     return 100;
                  }
               }

               if (var0.groups == null) {
                  int var2 = var0.field5383.method9257(class418.field5425.field5451 * 468737477, var0.index * -669659167, 1916961151);
                  if (var2 >= 100) {
                     if (var1 <= 1) {
                        throw new IllegalStateException();
                     }

                     var2 = 99;
                  }

                  return var2;
               } else if (var1 <= 1) {
                  throw new IllegalStateException();
               } else {
                  return 99;
               }
            }
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "qn.at(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ay")
   @Override
   int groupLoadPercent(int var1, int var2) {
      try {
         if (null != this.groups[var1]) {
            if (var2 != 743318851) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            return this.validGroups[var1] ? 100 : this.field5383.method9257(-669659167 * this.index, var1, 880011359);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qn.ay(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("au")
   public boolean method9093(int var1, int var2) {
      try {
         return this.validGroups[var1];
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qn.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("az")
   public boolean method9097(int var1, int var2) {
      try {
         boolean var10000;
         if (AbstractArchive.method8992(this, var1, -1775968255) != null) {
            if (var2 != 1344023781) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qn.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("bg")
   public void method9109(byte[] var1) {
      this.decodeIndex(var1, -2093977259);
   }

   @ObfuscatedSignature(descriptor = "([B)[B")
   @ObfuscatedName("xu")
   public static byte[] method9110(byte[] var0) {
      return HttpRequestTask.decompressBytes(var0, 1733044161);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ao")
   @Override
   void vmethod319(int var1) {
      this.field5383.method9267(-669659167 * this.index, var1, 1683806834);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   public boolean method9067() {
      return -1934961457 * this.field5381 == 1;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("an")
   @Override
   void loadGroup(int var1, byte var2) {
      try {
         if (null != this.archiveDisk) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            if (this.validGroups != null) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               if (this.validGroups[var1]) {
                  ArchiveDisk var3 = this.archiveDisk;
                  byte[] var5 = null;
                  synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                     for (ArchiveDiskAction var7 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last();
                        var7 != null;
                        var7 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()
                     ) {
                        if (var2 >= 1) {
                           return;
                        }

                        if (var7.key == var1) {
                           if (var2 >= 1) {
                              throw new IllegalStateException();
                           }

                           if (var3 == var7.archiveDisk) {
                              if (var2 >= 1) {
                                 return;
                              }

                              if (0 == 1892501129 * var7.type) {
                                 if (var2 >= 1) {
                                    throw new IllegalStateException();
                                 }

                                 var5 = var7.data;
                                 break;
                              }
                           }
                        }
                     }
                  }

                  if (null != var5) {
                     if (var2 >= 1) {
                        return;
                     }

                     this.load(var3, var1, var5, true, -1011763430);
                  } else {
                     byte[] var11 = var3.read(var1, 110858456);
                     this.load(var3, var1, var11, true, -1433341495);
                  }

                  return;
               }
            }
         }

         this.field5383.method9268(this, this.index * -669659167, var1, this.groupCrcs[var1], (byte)4, true, -1611765249);
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "qn.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ac")
   public boolean method9068() {
      return -1934961457 * this.field5381 == 1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ab")
   public boolean method9069() {
      return -1934961457 * this.field5381 == 1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   public int method9073() {
      if (1 != this.field5381 * -1934961457 && (!this.field5386 || 2 != this.field5381 * -1934961457)) {
         if (this.groups != null) {
            return 99;
         } else {
            int var1 = this.field5383.method9257(class418.field5425.field5451 * -824468968, this.index * -669659167, -1945089621);
            if (var1 >= 100) {
               var1 = 99;
            }

            return var1;
         }
      } else {
         return 1651137151;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bi")
   public boolean method9094(int var1) {
      return this.validGroups[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   @Override
   void vmethod317(int var1) {
      this.field5383.method9267(-669659167 * this.index, var1, 747438627);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bn")
   public int method9101() {
      byte var1 = 0;
      int var2 = 0;

      for (int var3 = 0; var3 < this.groups.length; var3++) {
         if (this.fileCounts[var3] > 0) {
            var1 += 100;
            var2 += this.groupLoadPercent(var3, 743318851);
         }
      }

      return 0 == var1 ? 100 : 100 * var2 / var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqn;)I")
   @ObfuscatedName("de")
   public static int method9102(Archive var0) {
      byte var1 = 0;
      int var2 = 0;

      for (int var3 = 0; var3 < var0.groups.length; var3++) {
         if (var0.fileCounts[var3] > 0) {
            var1 += 100;
            var2 += var0.groupLoadPercent(var3, 743318851);
         }
      }

      return 0 == var1 ? 100 : 100 * var2 / var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;)Lla;")
   @ObfuscatedName("up")
   public static WorldMapArea method9104(WorldMap var0) {
      return var0.mainMapArea;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("br")
   @Override
   int vmethod321(int var1) {
      if (null != this.groups[var1]) {
         return -237219504;
      } else {
         return this.validGroups[var1] ? -47430 : this.field5383.method9257(-335278963 * this.index, var1, -2047001273);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ap")
   void loadAllLocal(int var1) {
      try {
         this.validGroups = new boolean[this.groups.length];

         for (int var2 = 0; var2 < this.validGroups.length; var2++) {
            this.validGroups[var2] = false;
         }

         if (null == this.archiveDisk) {
            if (var1 >= 167238309) {
               throw new IllegalStateException();
            } else {
               this.field5381 = 1634054703;
            }
         } else {
            this.field5380 = 1193483801;

            for (int var10 = 0; var10 < this.validGroups.length; var10++) {
               if (this.fileCounts[var10] > 0) {
                  if (var1 >= 167238309) {
                     throw new IllegalStateException();
                  }

                  ArchiveDisk var3 = this.archiveDisk;
                  ArchiveDiskAction var5 = new ArchiveDiskAction();
                  var5.type = 248909753;
                  var5.key = var10;
                  var5.archiveDisk = var3;
                  var5.archive = this;
                  synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                     ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var5);
                  }

                  class228.method4852(-418177836);
                  this.field5380 = var10 * -1193483801;
               }
            }

            if (this.field5380 * 1387569623 == -1) {
               if (var1 >= 167238309) {
                  throw new IllegalStateException();
               }

               this.field5381 = 1634054703;
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "qn.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aq")
   @Override
   void vmethod324(int var1) {
      if (null != this.archiveDisk && this.validGroups != null && this.validGroups[var1]) {
         ArchiveDisk var2 = this.archiveDisk;
         byte[] var4 = null;
         synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last();
               var6 != null;
               var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()
            ) {
               if (var6.key == var1 && var2 == var6.archiveDisk && 0 == 1892501129 * var6.type) {
                  var4 = var6.data;
                  break;
               }
            }
         }

         if (null != var4) {
            this.load(var2, var1, var4, true, -568027074);
         } else {
            byte[] var9 = var2.read(var1, -1762629548);
            this.load(var2, var1, var9, true, -1021504870);
         }
      } else {
         this.field5383.method9268(this, this.index * -669659167, var1, this.groupCrcs[var1], (byte)4, true, -1973291373);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqn;)V")
   @ObfuscatedName("wz")
   public static void method9077(Archive var0) {
      if (var0 == null) {
         var0.method9068();
      }

      var0.field5381 = -1026857890;
      var0.groupIds = new int[0];
      var0.groupCrcs = new int[0];
      var0.groupVersions = new int[0];
      var0.fileCounts = new int[0];
      var0.fileIds = new int[0][];
      var0.groups = new Object[0];
      var0.files = new Object[0][];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   void method9078() {
      this.field5381 = -1026857890;
      this.groupIds = new int[0];
      this.groupCrcs = new int[0];
      this.groupVersions = new int[0];
      this.fileCounts = new int[0];
      this.fileIds = new int[0][];
      this.groups = new Object[0];
      this.files = new Object[0][];
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bp")
   void method9090() {
      this.validGroups = new boolean[this.groups.length];

      for (int var1 = 0; var1 < this.validGroups.length; var1++) {
         this.validGroups[var1] = false;
      }

      if (null == this.archiveDisk) {
         this.field5381 = 1634054703;
      } else {
         this.field5380 = 1193483801;

         for (int var8 = 0; var8 < this.validGroups.length; var8++) {
            if (this.fileCounts[var8] > 0) {
               ArchiveDisk var2 = this.archiveDisk;
               ArchiveDiskAction var4 = new ArchiveDiskAction();
               var4.type = 248909753;
               var4.key = var8;
               var4.archiveDisk = var2;
               var4.archive = this;
               synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                  ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4);
               }

               class228.method4852(294973350);
               this.field5380 = var8 * -1193483801;
            }
         }

         if (this.field5380 * 1387569623 == -1) {
            this.field5381 = 1634054703;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([BZ)Ljava/lang/Object;")
   @ObfuscatedName("xp")
   public static Object method9105(byte[] var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0.length > 136) {
         DirectByteArrayCopier var2 = new DirectByteArrayCopier();
         var2.method7845(var0);
         return var2;
      } else {
         return var0;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bs")
   void method9080(int var1, int var2) {
      this.indexCrc = var1 * -983185547;
      this.indexVersion = -1262596753 * var2;
      if (this.masterDisk != null) {
         int var3 = this.index * -669659167;
         ArchiveDisk var4 = this.masterDisk;
         byte[] var6 = null;
         synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last();
               null != var8;
               var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()
            ) {
               if (var8.key == var3 && var8.archiveDisk == var4 && 0 == 1892501129 * var8.type) {
                  var6 = var8.data;
                  break;
               }
            }
         }

         if (null != var6) {
            this.load(var4, var3, var6, true, -1531616281);
         } else {
            byte[] var11 = var4.read(var3, -174937986);
            this.load(var4, var3, var11, true, 404171384);
         }
      } else {
         this.field5383
            .method9268(this, class418.field5425.field5451 * 468737477, this.index * -669659167, this.indexCrc * -1643278115, (byte)0, true, -1754433119);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("am")
   @Override
   void vmethod318(int var1) {
      this.field5383.method9267(-669659167 * this.index, var1, 1535490871);
   }

   @ObfuscatedSignature(descriptor = "(Ltf;I[BZ)V")
   @ObfuscatedName("bz")
   public void method9085(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
      if (this.masterDisk == var1) {
         if (1 == this.field5381 * -805364346) {
            throw new RuntimeException();
         } else if (null == var3) {
            this.field5383
               .method9268(this, 468737477 * class418.field5425.field5451, -669659167 * this.index, this.indexCrc * 585209545, (byte)0, true, -2106645142);
         } else {
            Archive_crc.reset();
            Archive_crc.update(var3, 0, var3.length);
            int var9 = (int)Archive_crc.getValue();
            if (var9 != -1643278115 * this.indexCrc) {
               this.field5383
                  .method9268(this, class418.field5425.field5451 * 468737477, this.index * -1956227264, -1643278115 * this.indexCrc, (byte)0, true, -2119152521);
            } else {
               Buffer var10 = new Buffer(HttpRequestTask.decompressBytes(var3, 1733044161));
               int var7 = var10.readUnsignedByte(-1521494660);
               if (var7 < 5 || var7 > 7) {
                  throw new RuntimeException(var7 + "," + -396030850 * this.index + "," + var2);
               } else {
                  int var8 = 0;
                  if (var7 >= 6) {
                     var8 = Buffer.method12015(var10, -616887349);
                  }

                  if (var8 != 1508356495 * this.indexVersion) {
                     this.field5383
                        .method9268(
                           this, class418.field5425.field5451 * 468737477, -669659167 * this.index, this.indexCrc * -1643278115, (byte)0, true, -1782046807
                        );
                  } else {
                     this.decodeIndex(var3, -1651483506);
                     this.loadAllLocal(-323619521);
                  }
               }
            }
         }
      } else {
         if (!var4 && -1933638053 * this.field5380 == var2) {
            this.field5381 = 1634054703;
         }

         if (null != var3 && var3.length > 4) {
            Archive_crc.reset();
            Archive_crc.update(var3, 0, var3.length - 4);
            int var5 = (int)Archive_crc.getValue();
            int var6 = ((var3[var3.length - 3] & 255) << 16)
               + ((var3[var3.length - 4] & 255) << 24)
               + ((var3[var3.length - 2] & -1734188183) << 8)
               + (var3[var3.length - 1] & 255);
            if (this.groupCrcs[var2] != var5 || this.groupVersions[var2] != var6) {
               Archive_crc.reset();
               Archive_crc.update(var3, 0, var3.length - 2);
               var5 = (int)Archive_crc.getValue();
               var6 = ((var3[var3.length - 2] & -1453166312) << 8) + (var3[var3.length - 1] & 255);
            }

            if (var5 == this.groupCrcs[var2] && var6 == this.groupVersions[var2]) {
               this.validGroups[var2] = true;
               if (var4) {
                  this.groups[var2] = BufferedSource.method10618(var3, false, (byte)0);
               }
            } else {
               this.validGroups[var2] = false;
               if (this.field5382 || var4) {
                  this.field5383.method9268(this, -21834172 * this.index, var2, this.groupCrcs[var2], (byte)4, var4, -1667364173);
               }
            }
         } else {
            this.validGroups[var2] = false;
            if (this.field5382 || var4) {
               this.field5383.method9268(this, this.index * -1835917884, var2, this.groupCrcs[var2], (byte)4, var4, -2128035258);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltf;I[BZ)V")
   @ObfuscatedName("bk")
   public void method9086(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
      if (this.masterDisk == var1) {
         if (1 == this.field5381 * -1934961457) {
            throw new RuntimeException();
         } else if (null == var3) {
            this.field5383
               .method9268(this, 468737477 * class418.field5425.field5451, -1023407997 * this.index, this.indexCrc * -430071674, (byte)0, true, -1763066819);
         } else {
            Archive_crc.reset();
            Archive_crc.update(var3, 0, var3.length);
            int var9 = (int)Archive_crc.getValue();
            if (var9 != -1643278115 * this.indexCrc) {
               this.field5383
                  .method9268(this, class418.field5425.field5451 * 468737477, this.index * 257174361, -433086721 * this.indexCrc, (byte)0, true, -1546664064);
            } else {
               Buffer var10 = new Buffer(HttpRequestTask.decompressBytes(var3, 1733044161));
               int var7 = var10.readUnsignedByte(481871738);
               if (var7 < 5 || var7 > 7) {
                  throw new RuntimeException(var7 + "," + -669659167 * this.index + "," + var2);
               } else {
                  int var8 = 0;
                  if (var7 >= 6) {
                     var8 = Buffer.method12015(var10, 1266594082);
                  }

                  if (var8 != 1508356495 * this.indexVersion) {
                     this.field5383
                        .method9268(
                           this, class418.field5425.field5451 * 468737477, -669659167 * this.index, this.indexCrc * -1643278115, (byte)0, true, -2012774420
                        );
                  } else {
                     this.decodeIndex(var3, -1222956333);
                     this.loadAllLocal(-1236331665);
                  }
               }
            }
         }
      } else {
         if (!var4 && 1387569623 * this.field5380 == var2) {
            this.field5381 = 719659575;
         }

         if (null != var3 && var3.length > 4) {
            Archive_crc.reset();
            Archive_crc.update(var3, 0, var3.length - 4);
            int var5 = (int)Archive_crc.getValue();
            int var6 = ((var3[var3.length - 3] & 255) << 16)
               + ((var3[var3.length - 4] & 255) << 24)
               + ((var3[var3.length - 2] & 255) << 8)
               + (var3[var3.length - 1] & 255);
            if (this.groupCrcs[var2] != var5 || this.groupVersions[var2] != var6) {
               Archive_crc.reset();
               Archive_crc.update(var3, 0, var3.length - 2);
               var5 = (int)Archive_crc.getValue();
               var6 = ((var3[var3.length - 2] & 1415867170) << 8) + (var3[var3.length - 1] & 255);
            }

            if (var5 == this.groupCrcs[var2] && var6 == this.groupVersions[var2]) {
               this.validGroups[var2] = true;
               if (var4) {
                  this.groups[var2] = BufferedSource.method10618(var3, false, (byte)0);
               }
            } else {
               this.validGroups[var2] = false;
               if (this.field5382 || var4) {
                  this.field5383.method9268(this, -19963294 * this.index, var2, this.groupCrcs[var2], (byte)4, var4, -1678479652);
               }
            }
         } else {
            this.validGroups[var2] = false;
            if (this.field5382 || var4) {
               this.field5383.method9268(this, this.index * 992500273, var2, this.groupCrcs[var2], (byte)4, var4, -1549177200);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   public boolean method9070() {
      return -1934961457 * this.field5381 == 1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bm")
   void method9091() {
      this.validGroups = new boolean[this.groups.length];

      for (int var1 = 0; var1 < this.validGroups.length; var1++) {
         this.validGroups[var1] = false;
      }

      if (null == this.archiveDisk) {
         this.field5381 = 1634054703;
      } else {
         this.field5380 = 1193483801;

         for (int var8 = 0; var8 < this.validGroups.length; var8++) {
            if (this.fileCounts[var8] > 0) {
               ArchiveDisk var2 = this.archiveDisk;
               ArchiveDiskAction var4 = new ArchiveDiskAction();
               var4.type = 248909753;
               var4.key = var8;
               var4.archiveDisk = var2;
               var4.archive = this;
               synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                  ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4);
               }

               class228.method4852(2070248933);
               this.field5380 = var8 * -1193483801;
            }
         }

         if (this.field5380 * 1387569623 == -1) {
            this.field5381 = 1634054703;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ag")
   @Override
   void loadRegionFromGroup(int var1, int var2) {
      try {
         this.field5383.method9267(-669659167 * this.index, var1, 762552045);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qn.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltf;I[BZ)V")
   @ObfuscatedName("bb")
   public void method9087(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
      if (this.masterDisk == var1) {
         if (1 == this.field5381 * -1934961457) {
            throw new RuntimeException();
         } else if (null == var3) {
            this.field5383
               .method9268(this, 1533925407 * class418.field5425.field5451, 470707090 * this.index, this.indexCrc * -1643278115, (byte)0, true, -1947100464);
         } else {
            Archive_crc.reset();
            Archive_crc.update(var3, 0, var3.length);
            int var9 = (int)Archive_crc.getValue();
            if (var9 != -1643278115 * this.indexCrc) {
               this.field5383
                  .method9268(this, class418.field5425.field5451 * -77996227, this.index * -669659167, -2131468935 * this.indexCrc, (byte)0, true, -1993391328);
            } else {
               Buffer var10 = new Buffer(HttpRequestTask.decompressBytes(var3, 1733044161));
               int var7 = var10.readUnsignedByte(-669011035);
               if (var7 < 5 || var7 > 7) {
                  throw new RuntimeException(var7 + "," + 2119190321 * this.index + "," + var2);
               } else {
                  int var8 = 0;
                  if (var7 >= 6) {
                     var8 = Buffer.method12015(var10, -353994569);
                  }

                  if (var8 != 1628022201 * this.indexVersion) {
                     this.field5383
                        .method9268(
                           this, class418.field5425.field5451 * 37845457, -669659167 * this.index, this.indexCrc * -1643278115, (byte)0, true, -1642954916
                        );
                  } else {
                     this.decodeIndex(var3, -690411632);
                     this.loadAllLocal(-1503411779);
                  }
               }
            }
         }
      } else {
         if (!var4 && -461458265 * this.field5380 == var2) {
            this.field5381 = 1634054703;
         }

         if (null != var3 && var3.length > 4) {
            Archive_crc.reset();
            Archive_crc.update(var3, 0, var3.length - 4);
            int var5 = (int)Archive_crc.getValue();
            int var6 = ((var3[var3.length - 3] & 740735929) << 16)
               + ((var3[var3.length - 4] & 1296569417) << 24)
               + ((var3[var3.length - 2] & -498032656) << 8)
               + (var3[var3.length - 1] & -659275670);
            if (this.groupCrcs[var2] != var5 || this.groupVersions[var2] != var6) {
               Archive_crc.reset();
               Archive_crc.update(var3, 0, var3.length - 2);
               var5 = (int)Archive_crc.getValue();
               var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & -1113357690);
            }

            if (var5 == this.groupCrcs[var2] && var6 == this.groupVersions[var2]) {
               this.validGroups[var2] = true;
               if (var4) {
                  this.groups[var2] = BufferedSource.method10618(var3, false, (byte)0);
               }
            } else {
               this.validGroups[var2] = false;
               if (this.field5382 || var4) {
                  this.field5383.method9268(this, -669659167 * this.index, var2, this.groupCrcs[var2], (byte)4, var4, -2002706045);
               }
            }
         } else {
            this.validGroups[var2] = false;
            if (this.field5382 || var4) {
               this.field5383.method9268(this, this.index * -669659167, var2, this.groupCrcs[var2], (byte)4, var4, -1600854544);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bw")
   public boolean method9095(int var1) {
      return this.validGroups[var1];
   }

   @ObfuscatedSignature(descriptor = "(Ltf;Ltf;Lqy;IZZZ)V")
   @ObfuscatedName("th")
   public void method9106(ArchiveDisk var1, ArchiveDisk var2, JagNetThread var3, int var4, boolean var5, boolean var6, boolean var7) {
      if (var4 >= 0 && var4 < 23) {
         client.field939[var4] = this;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   public int method9111() {
      return this.index * -669659167;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("nk")
   public void method9112() {
      this.loadAllLocal(-1316215267);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bt")
   public boolean method9096(int var1) {
      return this.validGroups[var1];
   }

   @ObfuscatedSignature(descriptor = "(Lqn;IIB)V")
   @ObfuscatedName("ve")
   public static void method9081(Archive var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         var0.loadIndex(var1, var1, var3);
      } else {
         try {
            var0.indexCrc = var1 * -983185547;
            var0.indexVersion = -1262596753 * var2;
            if (var0.masterDisk != null) {
               if (var3 <= 1) {
                  return;
               }

               int var4 = var0.index * -669659167;
               ArchiveDisk var5 = var0.masterDisk;
               byte[] var7 = null;
               synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                  for (ArchiveDiskAction var9 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last();
                     null != var9;
                     var9 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()
                  ) {
                     if (var3 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (var9.key == var4) {
                        if (var3 <= 1) {
                           return;
                        }

                        if (var9.archiveDisk == var5) {
                           if (var3 <= 1) {
                              return;
                           }

                           if (0 == 1892501129 * var9.type) {
                              var7 = var9.data;
                              break;
                           }
                        }
                     }
                  }
               }

               if (null != var7) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var0.load(var5, var4, var7, true, -1137795145);
               } else {
                  byte[] var13 = var5.read(var4, -577025358);
                  var0.load(var5, var4, var13, true, -1939900541);
               }
            } else {
               var0.field5383
                  .method9268(var0, class418.field5425.field5451 * 468737477, var0.index * -669659167, var0.indexCrc * -1643278115, (byte)0, true, -2096573563);
            }
         } catch (RuntimeException var12) {
            throw RestClientThreadFactory.newRunException(var12, "qn.aj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([BI[BII)I")
   @ObfuscatedName("qv")
   public static int method9113(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      return BZip2Decompressor.BZip2Decompressor_decompress(var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("av")
   public boolean method9098(int var1) {
      return AbstractArchive.method8992(this, var1, -1775968255) != null;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bu")
   public boolean method9099(int var1) {
      return AbstractArchive.method8992(this, var1, -1775968255) != null;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ba")
   public boolean method9100(int var1) {
      return AbstractArchive.method8992(this, var1, -1775968255) != null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   public int method9074() {
      if (1 != this.field5381 * -1934961457 && (!this.field5386 || 2 != this.field5381 * -1934961457)) {
         if (this.groups != null) {
            return 99;
         } else {
            int var1 = this.field5383.method9257(class418.field5425.field5451 * 468737477, this.index * -669659167, 892683066);
            if (var1 >= 100) {
               var1 = 99;
            }

            return var1;
         }
      } else {
         return 100;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqn;I)V")
   @ObfuscatedName("zb")
   public static void method9079(Archive var0, int var1) {
      if (var0 == null) {
         var0.method9092(var1);
      }

      try {
         var0.field5381 = -1026857890;
         var0.groupIds = new int[0];
         var0.groupCrcs = new int[0];
         var0.groupVersions = new int[0];
         var0.fileCounts = new int[0];
         var0.fileIds = new int[0][];
         var0.groups = new Object[0];
         var0.files = new Object[0][];
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qn.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ad")
   public int loadPercent(int var1) {
      try {
         byte var2 = 0;
         int var3 = 0;

         for (int var4 = 0; var4 < this.groups.length; var4++) {
            if (var1 >= 1735933552) {
               throw new IllegalStateException();
            }

            if (this.fileCounts[var4] > 0) {
               if (var1 >= 1735933552) {
                  throw new IllegalStateException();
               }

               var2 += 100;
               var3 += this.groupLoadPercent(var4, 743318851);
            }
         }

         if (0 != var2) {
            return 100 * var3 / var2;
         } else if (var1 >= 1735933552) {
            throw new IllegalStateException();
         } else {
            return 100;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "qn.ad(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIZIII)Lxt;")
   @ObfuscatedName("at")
   public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6, int var7, int var8) {
      try {
         label284: {
            if (var6 == 36) {
               if (var8 != -1750200916) {
                  throw new IllegalStateException();
               }

               if (var7 == 32) {
                  if (-1 == var1) {
                     if (var8 != -1750200916) {
                        throw new IllegalStateException();
                     }

                     var4 = 0;
                  } else if (2 == var4) {
                     if (var8 != -1750200916) {
                        throw new IllegalStateException();
                     }

                     if (1 != var1) {
                        if (var8 != -1750200916) {
                           throw new IllegalStateException();
                        }

                        var4 = 1;
                     }
                  }
                  break label284;
               }

               if (var8 != -1750200916) {
                  throw new IllegalStateException();
               }
            }

            var4 = 0;
         }

         long var9 = ((long)var3 << 42) + var0 + ((long)var1 << 16) + ((long)var2 << 38) + ((long)var4 << 40);
         if (!var5) {
            if (var8 != -1750200916) {
               throw new IllegalStateException();
            }

            if (var6 == 36) {
               if (var8 != -1750200916) {
                  throw new IllegalStateException();
               }

               if (var7 == 32) {
                  if (var8 != -1750200916) {
                     throw new IllegalStateException();
                  }

                  SpritePixels var11 = (SpritePixels)class402.method8806(ItemComposition.ItemDefinition_cachedSprites, var9);
                  if (var11 != null) {
                     return var11;
                  }
               }
            }
         }

         ItemComposition var12 = class150.ItemDefinition_get(var0, 47286644);
         if (var1 > 1) {
            if (var8 != -1750200916) {
               throw new IllegalStateException();
            }

            if (null != var12.countobj) {
               if (var8 != -1750200916) {
                  throw new IllegalStateException();
               }

               int var13 = -1;

               for (int var14 = 0; var14 < 10; var14++) {
                  if (var8 != -1750200916) {
                     throw new IllegalStateException();
                  }

                  if (var1 >= var12.countco[var14]) {
                     if (var8 != -1750200916) {
                        throw new IllegalStateException();
                     }

                     if (var12.countco[var14] != 0) {
                        if (var8 != -1750200916) {
                           throw new IllegalStateException();
                        }

                        var13 = var12.countobj[var14];
                     }
                  }
               }

               if (var13 != -1) {
                  if (var8 != -1750200916) {
                     throw new IllegalStateException();
                  }

                  var12 = class150.ItemDefinition_get(var13, -1702790958);
               }
            }
         }

         Model var26 = var12.getModel(1, 1472327181);
         if (var26 == null) {
            if (var8 != -1750200916) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            SpritePixels var27 = null;
            if (-1 != var12.noteTemplate * 388376999) {
               if (var8 != -1750200916) {
                  throw new IllegalStateException();
               }

               var27 = getItemSprite(var12.note * 98718905, 10, 1, 0, 0, true, var6, var7, -1750200916);
               if (var27 == null) {
                  if (var8 != -1750200916) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            } else if (428085087 * var12.notedId != -1) {
               if (var8 != -1750200916) {
                  throw new IllegalStateException();
               }

               var27 = getItemSprite(var12.unnotedId * 1181026761, var1, var2, var3, 0, false, var6, var7, -1750200916);
               if (null == var27) {
                  return null;
               }
            } else if (-1 != var12.placeholderTemplate * 413316061) {
               if (var8 != -1750200916) {
                  throw new IllegalStateException();
               }

               var27 = getItemSprite(var12.placeholder * -1134820861, var1, 0, 0, 0, false, var6, var7, -1750200916);
               if (null == var27) {
                  return null;
               }
            }

            int[] var15 = Rasterizer2D.Rasterizer2D_pixels;
            int var16 = Rasterizer2D.Rasterizer2D_width;
            int var17 = Rasterizer2D.Rasterizer2D_height;
            float[] var18 = Rasterizer2D.Rasterizer2D_brightness;
            int[] var19 = new int[4];
            Rasterizer2D.Rasterizer2D_getClipArray(var19);
            SpritePixels var25 = new SpritePixels(var6, var7);
            Rasterizer3D.method5873(var25.pixels, var6, var7, null);
            Rasterizer2D.Rasterizer2D_clear();
            Rasterizer3D.resetRasterClipping();
            int var20 = var7 >> 1;
            Rasterizer3D.setCustomClipBounds(var20, var20);
            Rasterizer3D.clips.rasterGouraudLowRes = false;
            if (-1 != 413316061 * var12.placeholderTemplate) {
               if (var8 != -1750200916) {
                  throw new IllegalStateException();
               }

               var27.method12650(0, 0);
            }

            int var21 = -433511375 * var12.zoom2d;
            if (var6 != 36) {
               if (var8 != -1750200916) {
                  throw new IllegalStateException();
               }

               var21 = var21 * 32 / var6;
            }

            if (var5) {
               if (var8 != -1750200916) {
                  throw new IllegalStateException();
               }

               var21 = (int)(1.5 * var21);
            } else if (var2 == 2) {
               if (var8 != -1750200916) {
                  throw new IllegalStateException();
               }

               var21 = (int)(1.04 * var21);
            }

            int var22 = Rasterizer3D.Rasterizer3D_sine[var12.xan2d * -299438181] * var21 >> 16;
            int var23 = Rasterizer3D.Rasterizer3D_cosine[-299438181 * var12.xan2d] * var21 >> 16;
            var26.method6864();
            var26.method6850(
               0,
               var12.yan2d * 488243145,
               -1738881677 * var12.zan2d,
               var12.xan2d * -299438181,
               68503813 * var12.offsetX2d,
               var22 + var26.height * -1272589951 / 2 + -680099207 * var12.offsetY2d,
               var23 + -680099207 * var12.offsetY2d
            );
            if (-1 != 428085087 * var12.notedId) {
               if (var8 != -1750200916) {
                  throw new IllegalStateException();
               }

               var27.method12650(0, 0);
            }

            if (var2 >= 1) {
               if (var8 != -1750200916) {
                  throw new IllegalStateException();
               }

               var25.outline(1);
            }

            if (var2 >= 2) {
               if (var8 != -1750200916) {
                  throw new IllegalStateException();
               }

               var25.outline(16777215);
            }

            if (var3 != 0) {
               if (var8 != -1750200916) {
                  throw new IllegalStateException();
               }

               SpritePixels.method12643(var25, var3);
            }

            Rasterizer3D.method5873(var25.pixels, var6, var7, null);
            if (-1 != var12.noteTemplate * 388376999) {
               var27.method12650(0, 0);
            }

            label254: {
               if (1 != var4) {
                  if (var8 != -1750200916) {
                     throw new IllegalStateException();
                  }

                  if (2 != var4) {
                     break label254;
                  }

                  if (var8 != -1750200916) {
                     throw new IllegalStateException();
                  }

                  if (var12.isStackable * 1515235515 != 1) {
                     break label254;
                  }

                  if (var8 != -1750200916) {
                     throw new IllegalStateException();
                  }
               }

               class175.ItemDefinition_fontPlain11.method10402(HttpMethod.method369(var1, (short)-11554), 0, 9, 16776960, 1);
            }

            if (!var5) {
               if (var8 != -1750200916) {
                  throw new IllegalStateException();
               }

               if (var6 == 36) {
                  if (var8 != -1750200916) {
                     throw new IllegalStateException();
                  }

                  if (var7 == 32) {
                     if (var8 != -1750200916) {
                        throw new IllegalStateException();
                     }

                     ItemComposition.ItemDefinition_cachedSprites.put(var25, var9);
                  }
               }
            }

            Rasterizer3D.method5873(var15, var16, var17, var18);
            Rasterizer2D.Rasterizer2D_setClipArray(var19);
            Rasterizer3D.resetRasterClipping();
            Rasterizer3D.clips.rasterGouraudLowRes = true;
            return var25;
         }
      } catch (RuntimeException var24) {
         throw RestClientThreadFactory.newRunException(var24, "qn.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("aj")
   void loadIndex(int var1, int var2, byte var3) {
      try {
         this.indexCrc = var1 * -983185547;
         this.index = -1262596753 * var2;
         if (this.masterDisk != null) {
            if (var3 <= 1) {
               return;
            }

            int var4 = this.index * -669659167;
            ArchiveDisk var5 = this.masterDisk;
            byte[] var7 = null;
            synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
               for (ArchiveDiskAction var9 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.method9827();
                  null != var9;
                  var9 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.method9822()
               ) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (var9.key == var4) {
                     if (var3 <= 1) {
                        return;
                     }

                     if (var9.archiveDisk == var5) {
                        if (var3 <= 1) {
                           return;
                        }

                        if (0 == 1892501129 * var9.type) {
                           var7 = var9.data;
                           break;
                        }
                     }
                  }
               }
            }

            if (null != var7) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               this.load(var5, var4, var7, true, -1137795145);
            } else {
               byte[] var13 = var5.read(var4, -577025358);
               this.load(var5, var4, var13, true, -1939900541);
            }
         } else {
            this.field5383
               .method9268(this, class418.field5425.field5451 * 468737477, this.index * -669659167, this.index * -1643278115, (byte)0, true, -2096573563);
         }
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "qn.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   void method9092(int var1) {
      try {
         this.validGroups = new boolean[this.groups.length];

         for (int var2 = 0; var2 < this.validGroups.length; var2++) {
            this.validGroups[var2] = false;
         }

         if (null == this.archiveDisk) {
            if (var1 >= 167238309) {
               throw new IllegalStateException();
            } else {
               this.field5381 = 1634054703;
            }
         } else {
            this.field5380 = 1193483801;

            for (int var10 = 0; var10 < this.validGroups.length; var10++) {
               if (super.field5371[var10] > 0) {
                  if (var1 >= 167238309) {
                     throw new IllegalStateException();
                  }

                  ArchiveDisk var3 = this.archiveDisk;
                  ArchiveDiskAction var5 = new ArchiveDiskAction();
                  var5.type = 248909753;
                  var5.key = var10;
                  var5.archiveDisk = var3;
                  var5.archive = this;
                  synchronized (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
                     ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.method9802(var5);
                  }

                  class228.method4852(-418177836);
                  this.indexCrc = var10 * -1193483801;
               }
            }

            if (this.index * 1387569623 == -1) {
               if (var1 >= 167238309) {
                  throw new IllegalStateException();
               }

               this.field5381 = 1634054703;
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "qn.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("at")
   public int percentage(byte var1) {
      try {
         if (1 == this.field5381 * -1934961457) {
            return 100;
         } else if (var1 <= 1) {
            throw new IllegalStateException();
         } else {
            if (this.field5386) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               if (2 == this.field5381 * -1934961457) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  return 100;
               }
            }

            if (this.groups == null) {
               int var2 = this.field5383.method9257(class418.field5450.field5451 * 468737477, this.field5380 * -669659167, 1916961151);
               if (var2 >= 100) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  var2 = 99;
               }

               return var2;
            } else if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return 99;
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "qn.at(" + 41);
      }
   }
}
