import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("oc")
public class WidgetDefinition {
   @ObfuscatedSignature(descriptor = "[[Lof;")
   @ObfuscatedName("ak")
   public Widget[][] Widget_interfaceComponents;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("at")
   AbstractArchive widgetArchive;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("ag")
   AbstractArchive field4411;
   @ObfuscatedSignature(descriptor = "Lth;")
   @ObfuscatedName("ai")
   class498 field4406;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("ae")
   AbstractArchive field4409;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("aj")
   AbstractArchive field4410;
   @ObfuscatedSignature(descriptor = "Lth;")
   @ObfuscatedName("ad")
   class498 field4402;
   @ObfuscatedName("aw")
   Map field4401 = new HashMap();
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ay")
   EvictingDualNodeHashTable Widget_cachedModels;
   @ObfuscatedName("av")
   static boolean[] field4414;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("au")
   EvictingDualNodeHashTable Widget_cachedFonts;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("az")
   EvictingDualNodeHashTable Widget_cachedSpriteMasks;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("ap")
   EvictingDualNodeHashTable Widget_cachedSprites = new EvictingDualNodeHashTable(200);
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("an")
   AbstractArchive field4408;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   public void method7963(int var1) {
      if (-1 != var1) {
         if (field4414[var1]) {
            this.widgetArchive.clearFilesGroup(var1, (byte)-66);
            if (this.Widget_interfaceComponents[var1] != null) {
               for (int var2 = 0; var2 < this.Widget_interfaceComponents[var1].length; var2++) {
                  if (this.Widget_interfaceComponents[var1][var2] != null) {
                     this.Widget_interfaceComponents[var1][var2] = null;
                  }
               }

               this.Widget_interfaceComponents[var1] = null;
               field4414[var1] = false;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loc;II)Lof;")
   @ObfuscatedName("fp")
   public static Widget method7954(WidgetDefinition var0, int var1, int var2) {
      if (var0 == null) {
         var0.method7967(var1);
      }

      Widget var3 = var0.method7953(var1, -956798170);
      if (var2 == -1) {
         return var3;
      } else {
         return null != var3 && null != var3.children && var2 < var3.children.length ? var3.children[var2] : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lof;")
   @ObfuscatedName("vf")
   public Widget method7972(int var1) {
      return this.method7953(var1, -552401114);
   }

   @ObfuscatedSignature(descriptor = "(II)Lof;")
   @ObfuscatedName("av")
   public Widget method7953(int var1, int var2) {
      try {
         int var3 = var1 >> 16;
         int var4 = var1 & 65535;
         if (this.Widget_interfaceComponents[var3] != null) {
            if (var2 == 286657663) {
               throw new IllegalStateException();
            }

            if (null != this.Widget_interfaceComponents[var3][var4]) {
               return this.Widget_interfaceComponents[var3][var4];
            }

            if (var2 == 286657663) {
               throw new IllegalStateException();
            }
         }

         boolean var5 = method7961(this, var3, -1793354163);
         if (var5) {
            return this.Widget_interfaceComponents[var3][var4];
         } else if (var2 == 286657663) {
            throw new IllegalStateException();
         } else {
            return null;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "oc.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loc;I)Z")
   @ObfuscatedName("ea")
   public static boolean method7958(WidgetDefinition var0, int var1) {
      if (var0 == null) {
         var0.method7967(var1);
      }

      if (field4414[var1]) {
         return true;
      } else if (!var0.widgetArchive.tryLoadGroup(var1, -1281429343)) {
         return false;
      } else {
         int var2 = AbstractArchive.method9046(var0.widgetArchive, var1, (byte)-63);
         if (0 == var2) {
            field4414[var1] = true;
            return true;
         } else {
            if (null == var0.Widget_interfaceComponents[var1]) {
               var0.Widget_interfaceComponents[var1] = new Widget[var2];
            }

            for (int var3 = 0; var3 < var2; var3++) {
               if (null == var0.Widget_interfaceComponents[var1][var3]) {
                  byte[] var4 = var0.widgetArchive.getFile(var1, var3, 238879216);
                  if (var4 != null) {
                     Widget var5 = new Widget();
                     var0.Widget_interfaceComponents[var1][var3] = var5;
                     var5.id = (var3 + (var1 << 16)) * -1191270757;
                     if (var4[0] == -1) {
                        var5.decode(new Buffer(var4), -938463493);
                     } else {
                        var5.decodeLegacy(new Buffer(var4), -1427762751);
                     }

                     if (null != var0.field4411) {
                        byte[] var6 = var0.field4411.getFile(var1, var3, -755101117);
                        if (null != var6 && var6.length > 0) {
                           var5.method8009(new Buffer(var6), -1640193822);
                           var0.field4401.put(var5.field4486, var1);
                        }
                     }
                  }
               }
            }

            for (int var7 = 0; var7 < var2; var7++) {
               Widget var8 = var0.Widget_interfaceComponents[var1][var7];
               if (null != var8 && -1 != var8.parentId * 794900977) {
                  Widget var9 = var0.Widget_interfaceComponents[var1][var8.parentId * 794900977 & 65535];
                  if (var7 > var9.field4454 * -1111862213) {
                     var9.field4454 = -593417621 * var7;
                  }

                  if (var7 < var9.field4453 * 1015188033) {
                     var9.field4453 = var7 * -1970530439;
                  }
               }
            }

            field4414[var1] = true;
            return true;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lla;)I")
   @ObfuscatedName("et")
   public static int method7970(WorldMapArea var0) {
      return -1853331498 * var0.regionLowY;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ka")
   public boolean method7973(int var1) {
      return method7961(this, var1, -1746356712);
   }

   @ObfuscatedSignature(descriptor = "(Loc;II)V")
   @ObfuscatedName("we")
   public static void method7964(WidgetDefinition var0, int var1, int var2) {
      if (var0 == null) {
         var0.method7966(var1, var1);
      }

      try {
         if (-1 == var1) {
            if (var2 == -240761312) {
               throw new IllegalStateException();
            }
         } else if (!field4414[var1]) {
            if (var2 == -240761312) {
               throw new IllegalStateException();
            }
         } else {
            var0.widgetArchive.clearFilesGroup(var1, (byte)105);
            if (var0.Widget_interfaceComponents[var1] == null) {
               if (var2 == -240761312) {
                  throw new IllegalStateException();
               }
            } else {
               for (int var3 = 0; var3 < var0.Widget_interfaceComponents[var1].length; var3++) {
                  if (var0.Widget_interfaceComponents[var1][var3] != null) {
                     if (var2 == -240761312) {
                        return;
                     }

                     var0.Widget_interfaceComponents[var1][var3] = null;
                  }
               }

               var0.Widget_interfaceComponents[var1] = null;
               field4414[var1] = false;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oc.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lof;")
   @ObfuscatedName("at")
   public Widget getWidgetChild(int var1, int var2, int var3) {
      try {
         Widget var4 = this.method7953(var1, 1597491069);
         if (var2 == -1) {
            if (var3 >= -540723832) {
               throw new IllegalStateException();
            } else {
               return var4;
            }
         } else {
            if (null != var4) {
               if (var3 >= -540723832) {
                  throw new IllegalStateException();
               }

               if (null != var4.children) {
                  if (var2 < var4.children.length) {
                     return var4.children[var2];
                  }

                  if (var3 >= -540723832) {
                     throw new IllegalStateException();
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "oc.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   public void method7967(int var1) {
      try {
         this.Widget_cachedSprites.clear();
         this.Widget_cachedModels.clear();
         this.Widget_cachedFonts.clear();
         this.Widget_cachedSpriteMasks.clear();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "oc.ae(" + ')');
      }
   }

   public WidgetDefinition(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
      this.Widget_cachedModels = new EvictingDualNodeHashTable(50);
      this.Widget_cachedFonts = new EvictingDualNodeHashTable(20);
      this.Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(8);
      this.field4406 = new class498(10, classTB.field5892);
      this.field4402 = new class498(10, classTB.field5892);
      int var6 = 0;
      if (var1 != null) {
         this.widgetArchive = var1;
         this.field4408 = var2;
         this.field4409 = var3;
         this.field4410 = var4;
         this.field4411 = var5;
         var6 = this.widgetArchive.getGroupCount(-558769921);
      }

      this.Widget_interfaceComponents = new Widget[var6][];
      field4414 = new boolean[var6];
   }

   @ObfuscatedSignature(descriptor = "(II)Lof;")
   @ObfuscatedName("ak")
   public Widget method7956(int var1, int var2) {
      Widget var3 = this.method7953(var1, 1474860748);
      if (var2 == -1) {
         return var3;
      } else {
         return null != var3 && null != var3.children && var2 < var3.children.length ? var3.children[var2] : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ap")
   public boolean method7959(int var1) {
      if (field4414[var1]) {
         return true;
      } else if (!this.widgetArchive.tryLoadGroup(var1, -1328566794)) {
         return false;
      } else {
         int var2 = AbstractArchive.method9046(this.widgetArchive, var1, (byte)-87);
         if (0 == var2) {
            field4414[var1] = true;
            return true;
         } else {
            if (null == this.Widget_interfaceComponents[var1]) {
               this.Widget_interfaceComponents[var1] = new Widget[var2];
            }

            for (int var3 = 0; var3 < var2; var3++) {
               if (null == this.Widget_interfaceComponents[var1][var3]) {
                  byte[] var4 = this.widgetArchive.getFile(var1, var3, -306098463);
                  if (var4 != null) {
                     Widget var5 = new Widget();
                     this.Widget_interfaceComponents[var1][var3] = var5;
                     var5.id = (var3 + (var1 << 16)) * -1191270757;
                     if (var4[0] == -1) {
                        var5.decode(new Buffer(var4), 2033083069);
                     } else {
                        var5.decodeLegacy(new Buffer(var4), -1427762751);
                     }

                     if (null != this.field4411) {
                        byte[] var6 = this.field4411.getFile(var1, var3, -1766262839);
                        if (null != var6 && var6.length > 0) {
                           var5.method8009(new Buffer(var6), -221547398);
                           this.field4401.put(var5.field4486, var1);
                        }
                     }
                  }
               }
            }

            for (int var7 = 0; var7 < var2; var7++) {
               Widget var8 = this.Widget_interfaceComponents[var1][var7];
               if (null != var8 && -1 != var8.parentId * 794900977) {
                  Widget var9 = this.Widget_interfaceComponents[var1][var8.parentId * 794900977 & 65535];
                  if (var7 > var9.field4454 * -86298045) {
                     var9.field4454 = -593417621 * var7;
                  }

                  if (var7 < var9.field4453 * -1516264759) {
                     var9.field4453 = var7 * -1970530439;
                  }
               }
            }

            field4414[var1] = true;
            return true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ay")
   public boolean method7960(int var1) {
      if (field4414[var1]) {
         return true;
      } else if (!this.widgetArchive.tryLoadGroup(var1, -317025730)) {
         return false;
      } else {
         int var2 = AbstractArchive.method9046(this.widgetArchive, var1, (byte)-81);
         if (0 == var2) {
            field4414[var1] = true;
            return true;
         } else {
            if (null == this.Widget_interfaceComponents[var1]) {
               this.Widget_interfaceComponents[var1] = new Widget[var2];
            }

            for (int var3 = 0; var3 < var2; var3++) {
               if (null == this.Widget_interfaceComponents[var1][var3]) {
                  byte[] var4 = this.widgetArchive.getFile(var1, var3, 230338873);
                  if (var4 != null) {
                     Widget var5 = new Widget();
                     this.Widget_interfaceComponents[var1][var3] = var5;
                     var5.id = (var3 + (var1 << 16)) * -1191270757;
                     if (var4[0] == -1) {
                        var5.decode(new Buffer(var4), 1918780962);
                     } else {
                        var5.decodeLegacy(new Buffer(var4), -1427762751);
                     }

                     if (null != this.field4411) {
                        byte[] var6 = this.field4411.getFile(var1, var3, 226431860);
                        if (null != var6 && var6.length > 0) {
                           var5.method8009(new Buffer(var6), -1498712064);
                           this.field4401.put(var5.field4486, var1);
                        }
                     }
                  }
               }
            }

            for (int var7 = 0; var7 < var2; var7++) {
               Widget var8 = this.Widget_interfaceComponents[var1][var7];
               if (null != var8 && -1 != var8.parentId * 274410726) {
                  Widget var9 = this.Widget_interfaceComponents[var1][var8.parentId * 794900977 & 826251773];
                  if (var7 > var9.field4454 * 1217934795) {
                     var9.field4454 = -593417621 * var7;
                  }

                  if (var7 < var9.field4453 * -1516264759) {
                     var9.field4453 = var7 * -1970530439;
                  }
               }
            }

            field4414[var1] = true;
            return true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljh;)Z")
   @ObfuscatedName("kt")
   public static boolean method7971(Scene var0) {
      return var0 == null ? var0.shouldSendWalk() : var0.viewportWalking && var0.baseX != -1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ad")
   public void method7965(int var1) {
      if (-1 != var1) {
         if (field4414[var1]) {
            this.widgetArchive.clearFilesGroup(var1, (byte)59);
            if (this.Widget_interfaceComponents[var1] != null) {
               for (int var2 = 0; var2 < this.Widget_interfaceComponents[var1].length; var2++) {
                  if (this.Widget_interfaceComponents[var1][var2] != null) {
                     this.Widget_interfaceComponents[var1][var2] = null;
                  }
               }

               this.Widget_interfaceComponents[var1] = null;
               field4414[var1] = false;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lof;")
   @ObfuscatedName("aj")
   public Widget method7957(int var1, int var2) {
      Widget var3 = this.method7953(var1, 2138326454);
      if (var2 == -1) {
         return var3;
      } else {
         return null != var3 && null != var3.children && var2 < var3.children.length ? var3.children[var2] : null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public void method7968() {
      this.Widget_cachedSprites.clear();
      this.Widget_cachedModels.clear();
      this.Widget_cachedFonts.clear();
      this.Widget_cachedSpriteMasks.clear();
   }

   @ObfuscatedSignature(descriptor = "(Loc;II)Z")
   @ObfuscatedName("nd")
   public static boolean method7961(WidgetDefinition var0, int var1, int var2) {
      if (var0 == null) {
         return var0.loadInterface(var1, var1);
      } else {
         try {
            if (field4414[var1]) {
               if (var2 >= -1632587821) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else if (!var0.widgetArchive.tryLoadGroup(var1, -1600218315)) {
               if (var2 >= -1632587821) {
                  throw new IllegalStateException();
               } else {
                  return false;
               }
            } else {
               int var3 = AbstractArchive.method9046(var0.widgetArchive, var1, (byte)-34);
               if (0 == var3) {
                  if (var2 >= -1632587821) {
                     throw new IllegalStateException();
                  } else {
                     field4414[var1] = true;
                     return true;
                  }
               } else {
                  if (null == var0.Widget_interfaceComponents[var1]) {
                     if (var2 >= -1632587821) {
                        throw new IllegalStateException();
                     }

                     var0.Widget_interfaceComponents[var1] = new Widget[var3];
                  }

                  for (int var4 = 0; var4 < var3; var4++) {
                     if (var2 >= -1632587821) {
                        throw new IllegalStateException();
                     }

                     if (null == var0.Widget_interfaceComponents[var1][var4]) {
                        if (var2 >= -1632587821) {
                           throw new IllegalStateException();
                        }

                        byte[] var5 = var0.widgetArchive.getFile(var1, var4, 1551679598);
                        if (var5 != null) {
                           if (var2 >= -1632587821) {
                              throw new IllegalStateException();
                           }

                           Widget var6 = new Widget();
                           var0.Widget_interfaceComponents[var1][var4] = var6;
                           var6.id = (var4 + (var1 << 16)) * -1191270757;
                           if (var5[0] == -1) {
                              if (var2 >= -1632587821) {
                                 throw new IllegalStateException();
                              }

                              var6.decode(new Buffer(var5), 1982972606);
                           } else {
                              var6.decodeLegacy(new Buffer(var5), -1427762751);
                           }

                           if (null != var0.field4411) {
                              if (var2 >= -1632587821) {
                                 throw new IllegalStateException();
                              }

                              byte[] var7 = var0.field4411.getFile(var1, var4, 2054035804);
                              if (null != var7) {
                                 if (var2 >= -1632587821) {
                                    throw new IllegalStateException();
                                 }

                                 if (var7.length > 0) {
                                    if (var2 >= -1632587821) {
                                       throw new IllegalStateException();
                                    }

                                    var6.method8009(new Buffer(var7), -1494150710);
                                    var0.field4401.put(var6.field4486, var1);
                                 }
                              }
                           }
                        }
                     }
                  }

                  for (int var9 = 0; var9 < var3; var9++) {
                     Widget var10 = var0.Widget_interfaceComponents[var1][var9];
                     if (null != var10) {
                        if (var2 >= -1632587821) {
                           throw new IllegalStateException();
                        }

                        if (-1 != var10.parentId * 794900977) {
                           Widget var11 = var0.Widget_interfaceComponents[var1][var10.parentId * 794900977 & 65535];
                           if (var9 > var11.field4454 * -86298045) {
                              if (var2 >= -1632587821) {
                                 throw new IllegalStateException();
                              }

                              var11.field4454 = -593417621 * var9;
                           }

                           if (var9 < var11.field4453 * -1516264759) {
                              if (var2 >= -1632587821) {
                                 throw new IllegalStateException();
                              }

                              var11.field4453 = var9 * -1970530439;
                           }
                        }
                     }
                  }

                  field4414[var1] = true;
                  return true;
               }
            }
         } catch (RuntimeException var8) {
            throw RestClientThreadFactory.newRunException(var8, "oc.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public void method7969() {
      this.Widget_cachedSprites.clear();
      this.Widget_cachedModels.clear();
      this.Widget_cachedFonts.clear();
      this.Widget_cachedSpriteMasks.clear();
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ag")
   public boolean loadInterface(int var1, int var2) {
      try {
         if (field4414[var1]) {
            if (var2 >= -1632587821) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else if (!this.field4411.method8976(var1, -1600218315)) {
            if (var2 >= -1632587821) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            int var3 = AbstractArchive.method9046(this.field4411, var1, (byte)-34);
            if (0 == var3) {
               if (var2 >= -1632587821) {
                  throw new IllegalStateException();
               } else {
                  field4414[var1] = true;
                  return true;
               }
            } else {
               if (null == this.Widget_interfaceComponents[var1]) {
                  if (var2 >= -1632587821) {
                     throw new IllegalStateException();
                  }

                  this.Widget_interfaceComponents[var1] = new Widget[var3];
               }

               for (int var4 = 0; var4 < var3; var4++) {
                  if (var2 >= -1632587821) {
                     throw new IllegalStateException();
                  }

                  if (null == this.Widget_interfaceComponents[var1][var4]) {
                     if (var2 >= -1632587821) {
                        throw new IllegalStateException();
                     }

                     byte[] var5 = this.field4411.getFile(var1, var4, 1551679598);
                     if (var5 != null) {
                        if (var2 >= -1632587821) {
                           throw new IllegalStateException();
                        }

                        Widget var6 = new Widget();
                        this.Widget_interfaceComponents[var1][var4] = var6;
                        var6.field4454 = (var4 + (var1 << 16)) * -1191270757;
                        if (var5[0] == -1) {
                           if (var2 >= -1632587821) {
                              throw new IllegalStateException();
                           }

                           var6.method8009(new Buffer(var5), 1982972606);
                        } else {
                           var6.decode(new Buffer(var5), -1427762751);
                        }

                        if (null != this.field4411) {
                           if (var2 >= -1632587821) {
                              throw new IllegalStateException();
                           }

                           byte[] var7 = this.widgetArchive.getFile(var1, var4, 2054035804);
                           if (null != var7) {
                              if (var2 >= -1632587821) {
                                 throw new IllegalStateException();
                              }

                              if (var7.length > 0) {
                                 if (var2 >= -1632587821) {
                                    throw new IllegalStateException();
                                 }

                                 var6.decodeLegacy(new Buffer(var7), -1494150710);
                                 this.field4401.put(var6.field4486, var1);
                              }
                           }
                        }
                     }
                  }
               }

               for (int var9 = 0; var9 < var3; var9++) {
                  Widget var10 = this.Widget_interfaceComponents[var1][var9];
                  if (null != var10) {
                     if (var2 >= -1632587821) {
                        throw new IllegalStateException();
                     }

                     if (-1 != var10.height * 794900977) {
                        Widget var11 = this.Widget_interfaceComponents[var1][var10.scrollY * 794900977 & 65535];
                        if (var9 > var11.childIndex * -86298045) {
                           if (var2 >= -1632587821) {
                              throw new IllegalStateException();
                           }

                           var11.textLineHeight = -593417621 * var9;
                        }

                        if (var9 < var11.modelFrame * -1516264759) {
                           if (var2 >= -1632587821) {
                              throw new IllegalStateException();
                           }

                           var11.contentType = var9 * -1970530439;
                        }
                     }
                  }
               }

               field4414[var1] = true;
               return true;
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "oc.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("an")
   public void method7966(int var1, int var2) {
      try {
         if (-1 == var1) {
            if (var2 == -240761312) {
               throw new IllegalStateException();
            }
         } else if (!field4414[var1]) {
            if (var2 == -240761312) {
               throw new IllegalStateException();
            }
         } else {
            this.field4411.clearFilesGroup(var1, (byte)105);
            if (this.Widget_interfaceComponents[var1] == null) {
               if (var2 == -240761312) {
                  throw new IllegalStateException();
               }
            } else {
               for (int var3 = 0; var3 < this.Widget_interfaceComponents[var1].length; var3++) {
                  if (this.Widget_interfaceComponents[var1][var3] != null) {
                     if (var2 == -240761312) {
                        return;
                     }

                     this.Widget_interfaceComponents[var1][var3] = null;
                  }
               }

               this.Widget_interfaceComponents[var1] = null;
               field4414[var1] = false;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "oc.an(" + ')');
      }
   }
}
