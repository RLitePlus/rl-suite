import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ws")
public class classWS extends classWT {
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("af")
   AbstractArchive field6773;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ae")
   AbstractArchive field6771;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field6774 = 17;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("az")
   AbstractArchive field6772;

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("af")
   @Override
   public boolean vmethod629() {
      int var1 = 0;

      for (MidiRequest var3 : classNP.field4698) {
         if (var3 != null && var3.field4641.field4751 * 917328323 > 1 && var3.field4641.method8045((short)26640)) {
            classWT.method12624(this, "Attempted to load patches of already loading midiplayer!", (byte)52);
            return true;
         }

         if (null != var3 && !var3.field4644) {
            try {
               if (var3.field4642 != null && var3.field4632 * 1942111947 != -1 && var3.field4630 * -637815256 != -1) {
                  if (var3.field4640 == null) {
                     var3.field4640 = classNO.method7945(var3.field4642, 1942111947 * var3.field4632, 450234221 * var3.field4630);
                     if (null == var3.field4640) {
                        continue;
                     }
                  }

                  if (null == var3.field4639) {
                     var3.field4639 = new classAT(this.field6772, this.field6771);
                  }

                  if (classNU.method8018(var3.field4641, var3.field4640, this.field6773, var3.field4639, 1766023070)) {
                     var1++;
                     var3.field4644 = true;
                     classNU.method8022(var3.field4641, -175382759);
                  }
               } else {
                  var1++;
               }
            } catch (Exception var5) {
               classAAU.method275(null, var5, (byte)81);
               classWT.method12624(this, var5.getMessage(), (byte)-13);
               return true;
            }
         } else {
            var1++;
         }
      }

      return var1 == classNP.field4698.size();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpv;)I")
   @ObfuscatedName("ih")
   public static int method12612(classPV var0) {
      return 1056232063 * var0.field5439;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("az")
   @Override
   public boolean vmethod627(byte var1) {
      try {
         int var2 = 0;
         Iterator var3 = classNP.field4698.iterator();

         while (var3.hasNext()) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            MidiRequest var4 = (MidiRequest)var3.next();
            if (var4 != null) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               if (var4.field4641.field4751 * 917328323 > 1) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (var4.field4641.method8045((short)16662)) {
                     if (var1 <= 1) {
                        throw new IllegalStateException();
                     }

                     classWT.method12624(this, "Attempted to load patches of already loading midiplayer!", (byte)68);
                     return true;
                  }
               }
            }

            if (null != var4) {
               if (!var4.field4644) {
                  try {
                     if (var4.field4642 != null) {
                        if (var1 <= 1) {
                           throw new IllegalStateException();
                        }

                        if (var4.field4632 * 1942111947 != -1) {
                           if (var1 <= 1) {
                              throw new IllegalStateException();
                           }

                           if (var4.field4630 * 450234221 != -1) {
                              if (var4.field4640 == null) {
                                 if (var1 <= 1) {
                                    throw new IllegalStateException();
                                 }

                                 var4.field4640 = classNO.method7945(var4.field4642, 1942111947 * var4.field4632, 450234221 * var4.field4630);
                                 if (null == var4.field4640) {
                                    if (var1 <= 1) {
                                       throw new IllegalStateException();
                                    }
                                    continue;
                                 }
                              }

                              if (null == var4.field4639) {
                                 if (var1 <= 1) {
                                    throw new IllegalStateException();
                                 }

                                 var4.field4639 = new classAT(this.field6772, this.field6771);
                              }

                              if (classNU.method8018(var4.field4641, var4.field4640, this.field6773, var4.field4639, 1762295839)) {
                                 if (var1 <= 1) {
                                    throw new IllegalStateException();
                                 }

                                 var2++;
                                 var4.field4644 = true;
                                 classNU.method8022(var4.field4641, -2040324162);
                              }
                              continue;
                           }

                           if (var1 <= 1) {
                              throw new IllegalStateException();
                           }
                        }
                     }

                     var2++;
                     continue;
                  } catch (Exception var6) {
                     classAAU.method275(null, var6, (byte)92);
                     classWT.method12624(this, var6.getMessage(), (byte)-87);
                     return true;
                  }
               }

               if (var1 <= 1) {
                  throw new IllegalStateException();
               }
            }

            var2++;
         }

         if (var2 != classNP.field4698.size()) {
            return false;
         } else if (var1 <= 1) {
            throw new IllegalStateException();
         } else {
            return true;
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "ws.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod628() {
      int var1 = 0;

      for (MidiRequest var3 : classNP.field4698) {
         if (var3 != null && var3.field4641.field4751 * 1777782214 > 1 && var3.field4641.method8045((short)25466)) {
            classWT.method12624(this, "Attempted to load patches of already loading midiplayer!", (byte)32);
            return true;
         }

         if (null != var3 && !var3.field4644) {
            try {
               if (var3.field4642 != null && var3.field4632 * 1942111947 != -1 && var3.field4630 * 450234221 != -1) {
                  if (var3.field4640 == null) {
                     var3.field4640 = classNO.method7945(var3.field4642, -1470733929 * var3.field4632, 450234221 * var3.field4630);
                     if (null == var3.field4640) {
                        continue;
                     }
                  }

                  if (null == var3.field4639) {
                     var3.field4639 = new classAT(this.field6772, this.field6771);
                  }

                  if (classNU.method8018(var3.field4641, var3.field4640, this.field6773, var3.field4639, 1597325418)) {
                     var1++;
                     var3.field4644 = true;
                     classNU.method8022(var3.field4641, -731841728);
                  }
               } else {
                  var1++;
               }
            } catch (Exception var5) {
               classAAU.method275(null, var5, (byte)78);
               classWT.method12624(this, var5.getMessage(), (byte)1);
               return true;
            }
         } else {
            var1++;
         }
      }

      return var1 == classNP.field4698.size();
   }

   public classWS(classWT var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
      super(var1);
      this.field6773 = var2;
      this.field6771 = var3;
      this.field6772 = var4;
      this.field6777 = "LoadSongTask";
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ae")
   @Override
   public boolean vmethod626() {
      int var1 = 0;

      for (MidiRequest var3 : classNP.field4698) {
         if (var3 != null && var3.field4641.field4751 * 917328323 > 1 && var3.field4641.method8045((short)18485)) {
            classWT.method12624(this, "Attempted to load patches of already loading midiplayer!", (byte)-81);
            return true;
         }

         if (null != var3 && !var3.field4644) {
            try {
               if (var3.field4642 != null && var3.field4632 * 1942111947 != -1 && var3.field4630 * -630372102 != -1) {
                  if (var3.field4640 == null) {
                     var3.field4640 = classNO.method7945(var3.field4642, -1924128385 * var3.field4632, 529751017 * var3.field4630);
                     if (null == var3.field4640) {
                        continue;
                     }
                  }

                  if (null == var3.field4639) {
                     var3.field4639 = new classAT(this.field6772, this.field6771);
                  }

                  if (classNU.method8018(var3.field4641, var3.field4640, this.field6773, var3.field4639, 1625746580)) {
                     var1++;
                     var3.field4644 = true;
                     classNU.method8022(var3.field4641, 654712694);
                  }
               } else {
                  var1++;
               }
            } catch (Exception var5) {
               classAAU.method275(null, var5, (byte)6);
               classWT.method12624(this, var5.getMessage(), (byte)-65);
               return true;
            }
         } else {
            var1++;
         }
      }

      return var1 == classNP.field4698.size();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ab")
   @Override
   public boolean vmethod630() {
      int var1 = 0;

      for (MidiRequest var3 : classNP.field4698) {
         if (var3 != null && var3.field4641.field4751 * 917328323 > 1 && var3.field4641.method8045((short)27754)) {
            classWT.method12624(this, "Attempted to load patches of already loading midiplayer!", (byte)2);
            return true;
         }

         if (null != var3 && !var3.field4644) {
            try {
               if (var3.field4642 != null && var3.field4632 * 1942111947 != -1 && var3.field4630 * 450234221 != -1) {
                  if (var3.field4640 == null) {
                     var3.field4640 = classNO.method7945(var3.field4642, 1942111947 * var3.field4632, 450234221 * var3.field4630);
                     if (null == var3.field4640) {
                        continue;
                     }
                  }

                  if (null == var3.field4639) {
                     var3.field4639 = new classAT(this.field6772, this.field6771);
                  }

                  if (classNU.method8018(var3.field4641, var3.field4640, this.field6773, var3.field4639, 1978381900)) {
                     var1++;
                     var3.field4644 = true;
                     classNU.method8022(var3.field4641, -1399596704);
                  }
               } else {
                  var1++;
               }
            } catch (Exception var5) {
               classAAU.method275(null, var5, (byte)21);
               classWT.method12624(this, var5.getMessage(), (byte)-17);
               return true;
            }
         } else {
            var1++;
         }
      }

      return var1 == classNP.field4698.size();
   }
}
