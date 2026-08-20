import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.api.events.VarClientIntChanged;
import net.runelite.api.events.VarClientStrChanged;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dj")
public class Varcs {
   @ToRemove(unused = "true")
   @ObfuscatedName("by")
   public static final int field1385 = 64;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field1383 = 2;
   @ObfuscatedName("ag")
   boolean[] intsPersistence;
   @ObfuscatedName("ae")
   boolean unwrittenChanges = false;
   @ObfuscatedName("aj")
   long field1386;
   @ObfuscatedName("ba")
   static int field1384;
   @ObfuscatedName("an")
   Map map;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field1382 = 16777215;

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("az")
   void method3126(int var1, int var2) {
      this.map.put(var1, var2);
      if (this.intsPersistence[var1]) {
         this.unwrittenChanges = true;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Map;")
   @ObfuscatedName("gh")
   public Map method3168() {
      return this.map;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)Loo;")
   @ObfuscatedName("ln")
   public static classOO method3163(Widget var0) {
      return null != var0.field4554 ? var0.field4554.field4678 : null;
   }

   @ObfuscatedSignature(descriptor = "(Z)Lwn;")
   @ObfuscatedName("aa")
   AccessFile method3146(boolean var1) {
      return HttpMethod.getPreferencesFile("2", class520.field6071.name, var1, (byte)61);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldj;I)I")
   @ObfuscatedName("fi")
   public static int method3131(Varcs var0, int var1) {
      Object var2 = var0.map.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)V")
   @ObfuscatedName("ag")
   void setString(int var1, String var2, int var3) {
      try {
         this.map.put(var1, var2);
         this.method3166(var1, var2);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "dj.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Ljava/lang/String;")
   @ObfuscatedName("an")
   String getString(int var1, byte var2) {
      try {
         Object var3 = this.map.get(var1);
         if (var3 instanceof String) {
            if (var2 != 43) {
               throw new IllegalStateException();
            } else {
               return (String)var3;
            }
         } else {
            return "";
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "dj.an(" + ')');
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   void method3148() {
      AccessFile var1 = this.getPreferencesFile(true, 338110233);
      boolean var21 = false /* VF: Semaphore variable */;

      label134: {
         label133: {
            try {
               var21 = true;
               int var2 = 3;
               int var3 = 0;

               for (Entry var5 : this.map.entrySet()) {
                  int var6 = (Integer)var5.getKey();
                  if (this.intsPersistence[var6]) {
                     Object var7 = var5.getValue();
                     var2 += 3;
                     if (var7 instanceof Integer) {
                        var2 += 4;
                     } else if (var7 instanceof String) {
                        var2 += AccessFile.stringCp1252NullTerminatedByteSize((String)var7, -1880358352);
                     }

                     var3++;
                  }
               }

               Buffer var27 = new Buffer(var2);
               var27.writeByte(2, (short)-26043);
               var27.writeShort(var3, -2004230535);

               for (Entry var29 : this.map.entrySet()) {
                  int var30 = (Integer)var29.getKey();
                  if (this.intsPersistence[var30]) {
                     var27.writeShort(var30, -1632706824);
                     Object var8 = var29.getValue();
                     Class var10 = var8.getClass();
                     class586[] var11 = class586.method11705((byte)-42);
                     int var12 = 0;

                     class586 var9;
                     while (true) {
                        if (var12 >= var11.length) {
                           var9 = null;
                           break;
                        }

                        class586 var13 = var11[var12];
                        if (var10 == var13.field6373) {
                           var9 = var13;
                           break;
                        }

                        var12++;
                     }

                     var27.writeByte(var9.field6372 * 50478497, (short)-21497);
                     class586.method11708(var8, var27, (byte)27);
                  }
               }

               AccessFile.method11798(var1, var27.array, 0, var27.offset * 2108391709, (byte)-70);
               var21 = false;
               break label133;
            } catch (Exception var25) {
               var21 = false;
            } finally {
               if (var21) {
                  try {
                     var1.close((byte)-119);
                  } catch (Exception var22) {
                  }
               }
            }

            try {
               var1.close((byte)-3);
            } catch (Exception var23) {
            }
            break label134;
         }

         try {
            var1.close((byte)-45);
         } catch (Exception var24) {
         }
      }

      this.unwrittenChanges = false;
      this.field1386 = ParamComposition.method4949((byte)15);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   int method3132(int var1) {
      Object var2 = this.map.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("al")
   String method3140(int var1) {
      Object var2 = this.map.get(var1);
      return var2 instanceof String ? (String)var2 : "";
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ap")
   void tryWrite(int var1) {
      try {
         if (this.unwrittenChanges) {
            if (var1 != 327716789) {
               throw new IllegalStateException();
            }

            if (this.field1386 < ParamComposition.method4949((byte)15) - 60000L) {
               if (var1 != 327716789) {
                  return;
               }

               this.write(2122356836);
            }
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dj.ap(" + ')');
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ak")
   void write(int var1) {
      try {
         AccessFile var2 = this.getPreferencesFile(true, 1188799351);
         boolean var23 = false /* VF: Semaphore variable */;

         label170: {
            label169: {
               try {
                  var23 = true;
                  int var3 = 3;
                  int var4 = 0;
                  Iterator var5 = this.map.entrySet().iterator();

                  while (var5.hasNext()) {
                     if (var1 <= -7302276) {
                        throw new IllegalStateException();
                     }

                     Entry var6 = (Entry)var5.next();
                     int var7 = (Integer)var6.getKey();
                     if (this.intsPersistence[var7]) {
                        if (var1 <= -7302276) {
                           throw new IllegalStateException();
                        }

                        Object var8 = var6.getValue();
                        var3 += 3;
                        if (var8 instanceof Integer) {
                           if (var1 <= -7302276) {
                              return;
                           }

                           var3 += 4;
                        } else if (var8 instanceof String) {
                           if (var1 <= -7302276) {
                              throw new IllegalStateException();
                           }

                           var3 += AccessFile.stringCp1252NullTerminatedByteSize((String)var8, -2022046365);
                        }

                        var4++;
                     }
                  }

                  Buffer var30 = new Buffer(var3);
                  var30.writeByte(2, (short)-15420);
                  var30.writeShort(var4, -2026164095);
                  Iterator var31 = this.map.entrySet().iterator();

                  while (var31.hasNext()) {
                     if (var1 <= -7302276) {
                        throw new IllegalStateException();
                     }

                     Entry var32 = (Entry)var31.next();
                     int var33 = (Integer)var32.getKey();
                     if (this.intsPersistence[var33]) {
                        var30.writeShort(var33, -1870326660);
                        Object var9 = var32.getValue();
                        Class var11 = var9.getClass();
                        class586[] var12 = class586.method11705((byte)23);
                        int var13 = 0;

                        class586 var10;
                        while (true) {
                           if (var13 >= var12.length) {
                              var10 = null;
                              break;
                           }

                           class586 var14 = var12[var13];
                           if (var11 == var14.field6373) {
                              var10 = var14;
                              break;
                           }

                           var13++;
                        }

                        var30.writeByte(var10.field6372 * 50478497, (short)-6687);
                        class586.method11708(var9, var30, (byte)-71);
                     }
                  }

                  AccessFile.method11798(var2, var30.array, 0, var30.offset * 2108391709, (byte)-26);
                  var23 = false;
                  break label169;
               } catch (Exception var27) {
                  var23 = false;
               } finally {
                  if (var23) {
                     try {
                        var2.close((byte)-49);
                     } catch (Exception var24) {
                     }
                  }
               }

               try {
                  var2.close((byte)-23);
               } catch (Exception var25) {
               }
               break label170;
            }

            try {
               var2.close((byte)-123);
            } catch (Exception var26) {
            }
         }

         this.unwrittenChanges = false;
         this.field1386 = ParamComposition.method4949((byte)15);
      } catch (RuntimeException var29) {
         throw RestClientThreadFactory.newRunException(var29, "dj.ak(" + ')');
      }
   }

   Varcs() {
      int var1 = AbstractArchive.method9046(StructComposition.archive2, 19, (byte)-100);
      this.map = new HashMap();
      this.intsPersistence = new boolean[var1];

      for (int var2 = 0; var2 < var1; var2++) {
         VarcInt var3 = FriendSystem.method404(var2, -1879411072);
         this.intsPersistence[var2] = var3.persist;
      }

      this.read((byte)23);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   int method3133(int var1) {
      Object var2 = this.map.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ax")
   int method3134(int var1) {
      Object var2 = this.map.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   void method3156() {
      if (this.unwrittenChanges && this.field1386 < ParamComposition.method4949((byte)15) - 60000L) {
         this.write(104823714);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldj;I)V")
   @ObfuscatedName("vx")
   public static void method3142(Varcs var0, int var1) {
      if (var0 == null) {
         var0.clearTransient(var1);
      } else {
         try {
            for (int var2 = 0; var2 < var0.intsPersistence.length; var2++) {
               if (var1 != 1406454795) {
                  throw new IllegalStateException();
               }

               if (!var0.intsPersistence[var2]) {
                  if (var1 != 1406454795) {
                     throw new IllegalStateException();
                  }

                  var0.map.remove(var2);
               }
            }
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "dj.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("at")
   int getInt(int var1, byte var2) {
      try {
         Object var3 = this.map.get(var1);
         if (var3 instanceof Integer) {
            if (var2 != 1) {
               throw new IllegalStateException();
            } else {
               return (Integer)var3;
            }
         } else {
            return -1;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "dj.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)V")
   @ObfuscatedName("pc")
   public void method3166(int var1, String var2) {
      SecureUrlRequester.client.getCallbacks().post(new VarClientStrChanged(var1));
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("af")
   String method3141(int var1) {
      Object var2 = this.map.get(var1);
      return var2 instanceof String ? (String)var2 : "";
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)V")
   @ObfuscatedName("ar")
   void method3137(int var1, String var2) {
      this.map.put(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("au")
   void method3127(int var1, int var2) {
      this.map.put(var1, var2);
      if (this.intsPersistence[var1]) {
         this.unwrittenChanges = true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldj;III)V")
   @ObfuscatedName("hy")
   public static void method3128(Varcs var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.setInt(var1, var1, var1);
      }

      try {
         var0.map.put(var1, var2);
         if (var0.intsPersistence[var1]) {
            if (var3 == -749429014) {
               throw new IllegalStateException();
            }

            var0.unwrittenChanges = true;
         }

         var0.method3167(var1, var2);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "dj.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)Lwn;")
   @ObfuscatedName("aj")
   AccessFile getPreferencesFile(boolean var1, int var2) {
      try {
         return HttpMethod.getPreferencesFile("2", class520.field6071.name, var1, (byte)61);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dj.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   void method3143() {
      for (int var1 = 0; var1 < this.intsPersistence.length; var1++) {
         if (!this.intsPersistence[var1]) {
            this.map.remove(var1);
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   void method3150() {
      AccessFile var1 = this.getPreferencesFile(true, 2060052282);
      boolean var21 = false /* VF: Semaphore variable */;

      label134: {
         label133: {
            try {
               var21 = true;
               int var2 = 3;
               int var3 = 0;

               for (Entry var5 : this.map.entrySet()) {
                  int var6 = (Integer)var5.getKey();
                  if (this.intsPersistence[var6]) {
                     Object var7 = var5.getValue();
                     var2 += 3;
                     if (var7 instanceof Integer) {
                        var2 += 4;
                     } else if (var7 instanceof String) {
                        var2 += AccessFile.stringCp1252NullTerminatedByteSize((String)var7, -2039636480);
                     }

                     var3++;
                  }
               }

               Buffer var27 = new Buffer(var2);
               var27.writeByte(2, (short)-11592);
               var27.writeShort(var3, -2140343891);

               for (Entry var29 : this.map.entrySet()) {
                  int var30 = (Integer)var29.getKey();
                  if (this.intsPersistence[var30]) {
                     var27.writeShort(var30, -1347302266);
                     Object var8 = var29.getValue();
                     Class var10 = var8.getClass();
                     class586[] var11 = class586.method11705((byte)62);
                     int var12 = 0;

                     class586 var9;
                     while (true) {
                        if (var12 >= var11.length) {
                           var9 = null;
                           break;
                        }

                        class586 var13 = var11[var12];
                        if (var10 == var13.field6373) {
                           var9 = var13;
                           break;
                        }

                        var12++;
                     }

                     var27.writeByte(var9.field6372 * 50478497, (short)-16846);
                     class586.method11708(var8, var27, (byte)-26);
                  }
               }

               AccessFile.method11798(var1, var27.array, 0, var27.offset * 2108391709, (byte)-29);
               var21 = false;
               break label133;
            } catch (Exception var25) {
               var21 = false;
            } finally {
               if (var21) {
                  try {
                     var1.close((byte)-115);
                  } catch (Exception var22) {
                  }
               }
            }

            try {
               var1.close((byte)-50);
            } catch (Exception var23) {
            }
            break label134;
         }

         try {
            var1.close((byte)-8);
         } catch (Exception var24) {
         }
      }

      this.unwrittenChanges = false;
      this.field1386 = ParamComposition.method4949((byte)15);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("aw")
   void read(byte var1) {
      try {
         AccessFile var2 = this.getPreferencesFile(false, -1128546127);
         boolean var23 = false /* VF: Semaphore variable */;

         label253: {
            label247: {
               label254: {
                  label245: {
                     try {
                        var23 = true;
                        byte[] var3 = new byte[(int)AccessFile.method11809(var2, (byte)5)];
                        int var4 = 0;

                        while (var4 < var3.length) {
                           int var5 = var2.read(var3, var4, var3.length - var4, (byte)64);
                           if (var5 == -1) {
                              if (var1 == 0) {
                                 throw new IllegalStateException();
                              }

                              throw new EOFException();
                           }

                           var4 += var5;
                        }

                        Buffer var32 = new Buffer(var3);
                        if (var32.array.length - 2108391709 * var32.offset < 1) {
                           if (var1 == 0) {
                              throw new IllegalStateException();
                           }

                           var23 = false;
                           break label247;
                        }

                        int var6 = var32.readUnsignedByte(1280349883);
                        if (var6 >= 0) {
                           if (var1 == 0) {
                              throw new IllegalStateException();
                           }

                           if (var6 <= 2) {
                              if (var6 >= 2) {
                                 int var33 = Buffer.method12008(var32, (byte)5);

                                 for (int var35 = 0; var35 < var33; var35++) {
                                    if (var1 == 0) {
                                       return;
                                    }

                                    int var37 = Buffer.method12008(var32, (byte)5);
                                    int var38 = var32.readUnsignedByte(-1607843679);
                                    class586 var11 = (class586)GrandExchangeOffer.findEnumerated(class586.method11705((byte)30), var38, (byte)1);
                                    Object var12 = class586.method11714(var11, var32, -228349196);
                                    if (var37 >= 0 && var37 < this.intsPersistence.length) {
                                       if (var1 == 0) {
                                          return;
                                       }

                                       if (this.intsPersistence[var37]) {
                                          if (var1 == 0) {
                                             throw new IllegalStateException();
                                          }

                                          this.map.put(var37, var12);
                                       }
                                    }
                                 }

                                 var23 = false;
                                 break label254;
                              }

                              int var7 = Buffer.method12008(var32, (byte)5);

                              for (int var8 = 0; var8 < var7; var8++) {
                                 int var9 = Buffer.method12008(var32, (byte)5);
                                 int var10 = Buffer.method12015(var32, 732063694);
                                 if (var9 >= 0) {
                                    if (var1 == 0) {
                                       throw new IllegalStateException();
                                    }

                                    if (var9 < this.intsPersistence.length && this.intsPersistence[var9]) {
                                       if (var1 == 0) {
                                          throw new IllegalStateException();
                                       }

                                       this.map.put(var9, var10);
                                    }
                                 }
                              }

                              int var34 = Buffer.method12008(var32, (byte)5);

                              for (int var36 = 0; var36 < var34; var36++) {
                                 Buffer.method12008(var32, (byte)5);
                                 var32.readStringCp1252NullCircumfixed(1890794719);
                              }

                              var23 = false;
                              break label254;
                           }

                           var23 = false;
                        } else {
                           var23 = false;
                        }
                        break label245;
                     } catch (Exception var29) {
                        var23 = false;
                     } finally {
                        if (var23) {
                           try {
                              var2.close((byte)-2);
                           } catch (Exception var24) {
                           }
                        }
                     }

                     try {
                        var2.close((byte)-57);
                     } catch (Exception var26) {
                     }
                     break label253;
                  }

                  try {
                     var2.close((byte)-118);
                  } catch (Exception var28) {
                  }

                  return;
               }

               try {
                  var2.close((byte)-85);
               } catch (Exception var27) {
               }
               break label253;
            }

            try {
               var2.close((byte)-68);
            } catch (Exception var25) {
            }

            return;
         }

         this.unwrittenChanges = false;
      } catch (RuntimeException var31) {
         throw RestClientThreadFactory.newRunException(var31, "dj.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bn")
   public void method3167(int var1, int var2) {
      SecureUrlRequester.client.getCallbacks().post(new VarClientIntChanged(var1));
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   void method3154() {
      AccessFile var1 = this.getPreferencesFile(false, -1234888413);
      boolean var21 = false /* VF: Semaphore variable */;

      label201: {
         label196: {
            label202: {
               label194: {
                  try {
                     var21 = true;
                     byte[] var2 = new byte[(int)AccessFile.method11809(var1, (byte)-33)];
                     int var3 = 0;

                     while (var3 < var2.length) {
                        int var4 = var1.read(var2, var3, var2.length - var3, (byte)72);
                        if (var4 == -1) {
                           throw new EOFException();
                        }

                        var3 += var4;
                     }

                     Buffer var29 = new Buffer(var2);
                     if (var29.array.length - 2108391709 * var29.offset < 1) {
                        var21 = false;
                        break label196;
                     }

                     int var5 = var29.readUnsignedByte(-355782913);
                     if (var5 >= 0) {
                        if (var5 <= 2) {
                           if (var5 >= 2) {
                              int var30 = Buffer.method12008(var29, (byte)5);

                              for (int var32 = 0; var32 < var30; var32++) {
                                 int var34 = Buffer.method12008(var29, (byte)5);
                                 int var35 = var29.readUnsignedByte(1088623934);
                                 class586 var10 = (class586)GrandExchangeOffer.findEnumerated(class586.method11705((byte)-11), var35, (byte)1);
                                 Object var11 = class586.method11714(var10, var29, -745769991);
                                 if (var34 >= 0 && var34 < this.intsPersistence.length && this.intsPersistence[var34]) {
                                    this.map.put(var34, var11);
                                 }
                              }

                              var21 = false;
                              break label202;
                           }

                           int var6 = Buffer.method12008(var29, (byte)5);

                           for (int var7 = 0; var7 < var6; var7++) {
                              int var8 = Buffer.method12008(var29, (byte)5);
                              int var9 = Buffer.method12015(var29, 477583113);
                              if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) {
                                 this.map.put(var8, var9);
                              }
                           }

                           int var31 = Buffer.method12008(var29, (byte)5);

                           for (int var33 = 0; var33 < var31; var33++) {
                              Buffer.method12008(var29, (byte)5);
                              var29.readStringCp1252NullCircumfixed(1355374643);
                           }

                           var21 = false;
                           break label202;
                        }

                        var21 = false;
                     } else {
                        var21 = false;
                     }
                     break label194;
                  } catch (Exception var27) {
                     var21 = false;
                  } finally {
                     if (var21) {
                        try {
                           var1.close((byte)-25);
                        } catch (Exception var22) {
                        }
                     }
                  }

                  try {
                     var1.close((byte)-122);
                  } catch (Exception var24) {
                  }
                  break label201;
               }

               try {
                  var1.close((byte)-18);
               } catch (Exception var26) {
               }

               return;
            }

            try {
               var1.close((byte)-38);
            } catch (Exception var25) {
            }
            break label201;
         }

         try {
            var1.close((byte)-97);
         } catch (Exception var23) {
         }

         return;
      }

      this.unwrittenChanges = false;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   void method3151() {
      AccessFile var1 = this.getPreferencesFile(true, 647630662);
      boolean var21 = false /* VF: Semaphore variable */;

      label134: {
         label133: {
            try {
               var21 = true;
               int var2 = 3;
               int var3 = 0;

               for (Entry var5 : this.map.entrySet()) {
                  int var6 = (Integer)var5.getKey();
                  if (this.intsPersistence[var6]) {
                     Object var7 = var5.getValue();
                     var2 += 3;
                     if (var7 instanceof Integer) {
                        var2 += 4;
                     } else if (var7 instanceof String) {
                        var2 += AccessFile.stringCp1252NullTerminatedByteSize((String)var7, 2048592229);
                     }

                     var3++;
                  }
               }

               Buffer var27 = new Buffer(var2);
               var27.writeByte(2, (short)-30090);
               var27.writeShort(var3, -1965453158);

               for (Entry var29 : this.map.entrySet()) {
                  int var30 = (Integer)var29.getKey();
                  if (this.intsPersistence[var30]) {
                     var27.writeShort(var30, -1214220669);
                     Object var8 = var29.getValue();
                     Class var10 = var8.getClass();
                     class586[] var11 = class586.method11705((byte)8);
                     int var12 = 0;

                     class586 var9;
                     while (true) {
                        if (var12 >= var11.length) {
                           var9 = null;
                           break;
                        }

                        class586 var13 = var11[var12];
                        if (var10 == var13.field6373) {
                           var9 = var13;
                           break;
                        }

                        var12++;
                     }

                     var27.writeByte(var9.field6372 * 50478497, (short)-1371);
                     class586.method11708(var8, var27, (byte)-56);
                  }
               }

               AccessFile.method11798(var1, var27.array, 0, var27.offset * 2108391709, (byte)-115);
               var21 = false;
               break label133;
            } catch (Exception var25) {
               var21 = false;
            } finally {
               if (var21) {
                  try {
                     var1.close((byte)-80);
                  } catch (Exception var22) {
                  }
               }
            }

            try {
               var1.close((byte)-76);
            } catch (Exception var23) {
            }
            break label134;
         }

         try {
            var1.close((byte)-52);
         } catch (Exception var24) {
         }
      }

      this.unwrittenChanges = false;
      this.field1386 = ParamComposition.method4949((byte)15);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bz")
   void method3157() {
      if (this.unwrittenChanges && this.field1386 < ParamComposition.method4949((byte)15) - 60000L) {
         this.write(189735020);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   void method3144() {
      for (int var1 = 0; var1 < this.intsPersistence.length; var1++) {
         if (!this.intsPersistence[var1]) {
            this.map.remove(var1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldj;B)Z")
   @ObfuscatedName("bc")
   public static boolean method3159(Varcs var0, byte var1) {
      if (var0 == null) {
         return var0.hasUnwrittenChanges(var1);
      } else {
         try {
            return var0.unwrittenChanges;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "dj.ay(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bj")
   boolean method3160() {
      return this.unwrittenChanges;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bm")
   boolean method3161() {
      return this.unwrittenChanges;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldj;II)V")
   @ObfuscatedName("lz")
   public static void method3129(Varcs var0, int var1, int var2) {
      var0.map.put(var1, var2);
      if (var0.intsPersistence[var1]) {
         var0.unwrittenChanges = true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIIIB)V")
   @ObfuscatedName("jt")
   static final void method3165(WorldView var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         client.overheadTextCount = 0;
         boolean var6 = false;
         int var7 = -1;
         int var8 = -1;
         int var9 = 1320060371 * client.playerUpdateManager.field1538;
         int[] var10 = client.playerUpdateManager.playerIndices;

         for (int var11 = 0; var11 < var9 + var0.field1313.method10502(-1968882929); var11++) {
            if (var5 == 1) {
               return;
            }

            Actor var12;
            if (var11 < var9) {
               if (var5 == 1) {
                  throw new IllegalStateException();
               }

               var12 = (Actor)var0.npcs.get(var10[var11]);
               if (var10[var11] == 1466770191 * client.combatTargetPlayerIndex) {
                  var6 = true;
                  var7 = var11;
                  continue;
               }

               if (class330.localPlayer == var12) {
                  if (var5 == 1) {
                     return;
                  }

                  var8 = var11;
                  continue;
               }
            } else {
               var12 = (Actor)var0.players.get(var0.field1313.method10498(var11 - var9, (byte)65));
            }

            GrandExchangeOfferWorldComparator.drawActor2d(var0, var12, var11, var1, var2, var3, var4, -1324140438);
         }

         if (client.renderSelf) {
            if (var5 == 1) {
               throw new IllegalStateException();
            }

            if (-1 != var8) {
               if (var5 == 1) {
                  throw new IllegalStateException();
               }

               GrandExchangeOfferWorldComparator.drawActor2d(var0, class330.localPlayer, var8, var1, var2, var3, var4, 687535200);
            }
         }

         if (var6) {
            if (var5 == 1) {
               throw new IllegalStateException();
            }

            GrandExchangeOfferWorldComparator.drawActor2d(
               var0, (Actor)var0.npcs.get(client.combatTargetPlayerIndex * 1466770191), var7, var1, var2, var3, var4, -1642184861
            );
         }

         for (int var24 = 0; var24 < client.overheadTextCount * 814091759; var24++) {
            int var25 = client.overheadTextXs[var24];
            int var13 = client.overheadTextYs[var24];
            int var14 = client.overheadTextXOffsets[var24];
            int var15 = client.overheadTextAscents[var24];
            boolean var16 = true;

            while (var16) {
               if (var5 == 1) {
                  throw new IllegalStateException();
               }

               var16 = false;

               for (int var17 = 0; var17 < var24; var17++) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var13 + 2 > client.overheadTextYs[var17] - client.overheadTextAscents[var17]) {
                     if (var5 == 1) {
                        throw new IllegalStateException();
                     }

                     if (var13 - var15 < 2 + client.overheadTextYs[var17]) {
                        if (var5 == 1) {
                           throw new IllegalStateException();
                        }

                        if (var25 - var14 < client.overheadTextXs[var17] + client.overheadTextXOffsets[var17]) {
                           if (var5 == 1) {
                              return;
                           }

                           if (var14 + var25 > client.overheadTextXs[var17] - client.overheadTextXOffsets[var17]
                              && client.overheadTextYs[var17] - client.overheadTextAscents[var17] < var13) {
                              var13 = client.overheadTextYs[var17] - client.overheadTextAscents[var17];
                              var16 = true;
                           }
                        }
                     }
                  }
               }
            }

            client.viewportTempX = client.overheadTextXs[var24] * 1024916153;
            client.viewportTempY = (client.overheadTextYs[var24] = var13) * 237478937;
            String var26 = client.overheadText[var24];
            if (0 == 2100087115 * client.chatEffects) {
               if (var5 == 1) {
                  throw new IllegalStateException();
               }

               int var18 = 16776960;
               if (client.overheadTextColors[var24] < 6) {
                  var18 = client.field788[client.overheadTextColors[var24]];
               }

               if (client.overheadTextColors[var24] == 6) {
                  int var10000;
                  if (1759706017 * client.cycle % 20 < 10) {
                     if (var5 == 1) {
                        throw new IllegalStateException();
                     }

                     var10000 = 16711680;
                  } else {
                     var10000 = 16776960;
                  }

                  var18 = var10000;
               }

               if (7 == client.overheadTextColors[var24]) {
                  char var33;
                  if (client.cycle * 1759706017 % 20 < 10) {
                     if (var5 == 1) {
                        return;
                     }

                     var33 = 255;
                  } else {
                     var33 = '\uffff';
                  }

                  var18 = var33;
               }

               if (client.overheadTextColors[var24] == 8) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  }

                  var18 = 1759706017 * client.cycle % 20 < 10 ? '뀀' : 8454016;
               }

               if (9 == client.overheadTextColors[var24]) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  }

                  int var19 = 150 - client.overheadTextCyclesRemaining[var24];
                  if (var19 < 50) {
                     if (var5 == 1) {
                        throw new IllegalStateException();
                     }

                     var18 = 1280 * var19 + 16711680;
                  } else if (var19 < 100) {
                     if (var5 == 1) {
                        throw new IllegalStateException();
                     }

                     var18 = 16776960 - (var19 - 50) * 327680;
                  } else if (var19 < 150) {
                     if (var5 == 1) {
                        return;
                     }

                     var18 = (var19 - 100) * 5 + 65280;
                  }
               }

               if (10 == client.overheadTextColors[var24]) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  }

                  int var27 = 150 - client.overheadTextCyclesRemaining[var24];
                  if (var27 < 50) {
                     if (var5 == 1) {
                        throw new IllegalStateException();
                     }

                     var18 = 5 * var27 + 16711680;
                  } else if (var27 < 100) {
                     var18 = 16711935 - (var27 - 50) * 327680;
                  } else if (var27 < 150) {
                     if (var5 == 1) {
                        return;
                     }

                     var18 = (var27 - 100) * 327680 + 255 - 5 * (var27 - 100);
                  }
               }

               if (client.overheadTextColors[var24] == 11) {
                  if (var5 == 1) {
                     return;
                  }

                  int var28 = 150 - client.overheadTextCyclesRemaining[var24];
                  if (var28 < 50) {
                     var18 = 16777215 - var28 * 327685;
                  } else if (var28 < 100) {
                     if (var5 == 1) {
                        throw new IllegalStateException();
                     }

                     var18 = 65280 + 327685 * (var28 - 50);
                  } else if (var28 < 150) {
                     if (var5 == 1) {
                        throw new IllegalStateException();
                     }

                     var18 = 16777215 - 327680 * (var28 - 100);
                  }
               }

               if (12 == client.overheadTextColors[var24]) {
                  if (var5 == 1) {
                     return;
                  }

                  if (null == client.field816[var24]) {
                     if (var5 == 1) {
                        throw new IllegalStateException();
                     }

                     int var29 = var26.length();
                     client.field816[var24] = new int[var29];

                     for (int var20 = 0; var20 < var29; var20++) {
                        if (var5 == 1) {
                           throw new IllegalStateException();
                        }

                        int var21 = (int)(64.0F * ((float)var20 / var29));
                        int var22 = var21 << 10 | 896 | 64;
                        client.field816[var24][var20] = class545.field6056[var22];
                     }
                  }
               }

               if (0 == client.overheadTextEffects[var24]) {
                  class234.fontBold12
                     .method10437(var26, client.viewportTempX * -1259541623 + var1, var2 + client.viewportTempY * -604800983, var18, 0, client.field816[var24]);
               }

               if (1 == client.overheadTextEffects[var24]) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  }

                  class234.fontBold12
                     .method10427(
                        var26,
                        -1259541623 * client.viewportTempX + var1,
                        -604800983 * client.viewportTempY + var2,
                        var18,
                        0,
                        1759706017 * client.cycle,
                        client.field816[var24]
                     );
               }

               if (client.overheadTextEffects[var24] == 2) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  }

                  class234.fontBold12
                     .method10430(
                        var26,
                        client.viewportTempX * -1259541623 + var1,
                        var2 + -604800983 * client.viewportTempY,
                        var18,
                        0,
                        client.cycle * 1759706017,
                        client.field816[var24]
                     );
               }

               if (3 == client.overheadTextEffects[var24]) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  }

                  class234.fontBold12
                     .method10434(
                        var26,
                        -1259541623 * client.viewportTempX + var1,
                        var2 + client.viewportTempY * -604800983,
                        var18,
                        0,
                        client.cycle * 1759706017,
                        150 - client.overheadTextCyclesRemaining[var24],
                        client.field816[var24]
                     );
               }

               if (client.overheadTextEffects[var24] == 4) {
                  int var30 = (150 - client.overheadTextCyclesRemaining[var24]) * (class234.fontBold12.stringWidth(var26) + 100) / 150;
                  Rasterizer2D.Rasterizer2D_expandClip(
                     var1 + -1259541623 * client.viewportTempX - 50, var2, var1 + client.viewportTempX * -1259541623 + 50, var2 + var4
                  );
                  class234.fontBold12
                     .method10439(
                        var26,
                        50 + -1259541623 * client.viewportTempX + var1 - var30,
                        var2 + -604800983 * client.viewportTempY,
                        var18,
                        0,
                        client.field816[var24]
                     );
                  Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var4 + var2);
               }

               if (client.overheadTextEffects[var24] == 5) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  }

                  int var31 = 150 - client.overheadTextCyclesRemaining[var24];
                  int var32 = 0;
                  if (var31 < 25) {
                     if (var5 == 1) {
                        throw new IllegalStateException();
                     }

                     var32 = var31 - 25;
                  } else if (var31 > 125) {
                     if (var5 == 1) {
                        throw new IllegalStateException();
                     }

                     var32 = var31 - 125;
                  }

                  Rasterizer2D.Rasterizer2D_expandClip(
                     var1, -604800983 * client.viewportTempY + var2 - class234.fontBold12.ascent - 1, var3 + var1, var2 + client.viewportTempY * -604800983 + 5
                  );
                  class234.fontBold12
                     .method10437(
                        var26, var1 + -1259541623 * client.viewportTempX, var32 + client.viewportTempY * -604800983 + var2, var18, 0, client.field816[var24]
                     );
                  Rasterizer2D.Rasterizer2D_setClip(var1, var2, var1 + var3, var2 + var4);
               }
            } else {
               FadeOutTask.method10363(
                  class234.fontBold12, var26, -1259541623 * client.viewportTempX + var1, var2 + -604800983 * client.viewportTempY, 16776960, 0
               );
            }
         }
      } catch (RuntimeException var23) {
         throw RestClientThreadFactory.newRunException(var23, "dj.jt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;II)I")
   @ObfuscatedName("ae")
   public static int method3152(CharSequence var0, int var1, int var2) {
      try {
         return CollisionMap.method6404(var0, var1, true, -557898551);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dj.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("ai")
   static int method3164(int var0, Script var1, boolean var2, int var3) {
      try {
         Widget var4;
         if (var0 >= 2000) {
            if (var3 != 327716789) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            var4 = class226.widgetDefinition
               .method7953(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 1166994721);
         } else {
            Widget var10000;
            if (var2) {
               if (var3 != 327716789) {
                  throw new IllegalStateException();
               }

               var10000 = UserComparator3.scriptDotWidget;
            } else {
               var10000 = class222.scriptActiveWidget;
            }

            var4 = var10000;
         }

         class376.invalidateWidget(var4, (byte)5);
         if (var0 != 1200) {
            if (var3 != 327716789) {
               throw new IllegalStateException();
            }

            if (var0 != 1205) {
               if (var3 != 327716789) {
                  throw new IllegalStateException();
               }

               if (1212 != var0) {
                  if (1201 == var0) {
                     var4.modelType = 1154574418;
                     var4.modelId = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1314816461;
                     return 1;
                  }

                  if (var0 == 1202) {
                     if (var3 != 327716789) {
                        throw new IllegalStateException();
                     }

                     var4.modelType = -415622021;
                     var4.modelId = PlayerComposition.method7917(class330.localPlayer.appearance, (byte)0) * -1314816461;
                     return 1;
                  }

                  if (1207 == var0) {
                     if (var3 != 327716789) {
                        throw new IllegalStateException();
                     }

                     boolean var12 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
                     var4.method8172(class330.localPlayer.appearance, var12, -1685163476);
                     return 1;
                  }

                  if (1208 == var0) {
                     int var11 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                     if (null == var4.field4497) {
                        if (var3 != 327716789) {
                           throw new IllegalStateException();
                        }

                        throw new RuntimeException("");
                     }

                     var4.field4497.method7936(var11, 1250073373);
                     return 1;
                  }

                  if (1209 == var0) {
                     if (var3 != 327716789) {
                        throw new IllegalStateException();
                     }

                     class408.Interpreter_intStackSize -= 708726074;
                     int var10 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
                     int var13 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
                     if (var4.field4497 == null) {
                        throw new RuntimeException("");
                     }

                     PlayerComposition.method7931(var4.field4497, var10, var13, 1665628438);
                     return 1;
                  }

                  if (var0 == 1210) {
                     if (var3 != 327716789) {
                        throw new IllegalStateException();
                     }

                     int var9 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                     if (null == var4.field4497) {
                        if (var3 != 327716789) {
                           throw new IllegalStateException();
                        }

                        throw new RuntimeException("");
                     }

                     var4.field4497.method7925(class330.localPlayer.appearance.gender * -941255479, var9, -1704793879);
                     return 1;
                  }

                  if (var0 == 1214) {
                     var4.modelType = 323330376;
                     var4.modelId = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1314816461;
                     return 1;
                  }

                  if (var0 == 1215) {
                     if (var3 != 327716789) {
                        throw new IllegalStateException();
                     }

                     var4.modelType = -1246866063;
                     var4.modelId = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] * -1314816461;
                     return 1;
                  }

                  return 2;
               }

               if (var3 != 327716789) {
                  throw new IllegalStateException();
               }
            }
         }

         class408.Interpreter_intStackSize -= 708726074;
         int var5 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
         int var6 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
         var4.itemId = 1664178957 * var5;
         var4.itemQuantity = -1909037165 * var6;
         ItemComposition var7 = class150.ItemDefinition_get(var5, 172432352);
         var4.modelAngleX = -1892318899 * var7.xan2d;
         var4.modelAngleY = 1357613173 * var7.yan2d;
         var4.modelAngleZ = 1714868007 * var7.zan2d;
         var4.modelOffsetX = var7.offsetX2d * 2127673313;
         var4.modelOffsetY = 1491904511 * var7.offsetY2d;
         var4.modelZoom = var7.zoom2d * -1257260919;
         if (var0 == 1205) {
            var4.itemQuantityMode = 0;
         } else {
            boolean var14 = var0 == 1212;
            boolean var10001;
            if (1515235515 * var7.isStackable == 1) {
               if (var3 != 327716789) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            if (var14 | var10001) {
               if (var3 != 327716789) {
                  throw new IllegalStateException();
               }

               var4.itemQuantityMode = 1927430291;
            } else {
               var4.itemQuantityMode = -440106714;
            }
         }

         if (var4.field4546 * -209716257 > 0) {
            var4.modelZoom = 1874496800 * var4.modelZoom / (var4.field4546 * -209716257) * 2012543961;
         } else if (var4.rawWidth * 1127299583 > 0) {
            if (var3 != 327716789) {
               throw new IllegalStateException();
            }

            var4.modelZoom = 1874496800 * var4.modelZoom / (1127299583 * var4.rawWidth) * 2012543961;
         }

         return 1;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "dj.ai(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldj;ILjava/lang/String;)V")
   @ObfuscatedName("fe")
   public static void method3138(Varcs var0, int var1, String var2) {
      var0.map.put(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("av")
   void setInt(int var1, int var2, int var3) {
      try {
         this.map.put(var1, var2);
         if (this.intsPersistence[var1]) {
            if (var3 == -749429014) {
               throw new IllegalStateException();
            }

            this.unwrittenChanges = true;
         }

         this.method3167(var1, var2);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "dj.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   void clearTransient(int var1) {
      try {
         for (int var2 = 0; var2 < this.intsPersistence.length; var2++) {
            if (var1 != 1406454795) {
               throw new IllegalStateException();
            }

            if (!this.intsPersistence[var2]) {
               if (var1 != 1406454795) {
                  throw new IllegalStateException();
               }

               this.map.remove(var2);
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dj.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ay")
   boolean hasUnwrittenChanges(byte var1) {
      try {
         return this.unwrittenChanges;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dj.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bb")
   void method3158() {
      if (this.unwrittenChanges && this.field1386 < ParamComposition.method4949((byte)15) - 60000L) {
         this.clearTransient(141939197);
      }
   }
}
