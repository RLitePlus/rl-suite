import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hb")
public class EnumComposition extends DualNode implements net.runelite.api.EnumComposition {
   @ToRemove(unused = "true")
   @ObfuscatedName("bw")
   static final int field2159 = 52;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("at")
   static EvictingDualNodeHashTable EnumDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("an")
   public char outputType;
   @ObfuscatedName("ag")
   public char inputType;
   @ObfuscatedName("ai")
   public static int field2157;
   @ObfuscatedName("aj")
   public int defaultInt;
   @ObfuscatedName("ak")
   public int outputCount;
   @ObfuscatedName("aw")
   public int[] keys;
   @ObfuscatedName("ap")
   public int[] intVals;
   @ObfuscatedName("ay")
   public String[] strVals;
   @ObfuscatedSignature(descriptor = "Lut;")
   @ObfuscatedName("az")
   DynamicArray field2163;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("av")
   public static AbstractArchive EnumDefinition_archive;
   @ObfuscatedName("as")
   static String osName;
   @ObfuscatedName("ae")
   public String defaultStr = Strings.field4861;
   @ObfuscatedSignature(descriptor = "Lut;")
   @ObfuscatedName("au")
   DynamicArray field2162;

   @ObfuscatedSignature(descriptor = "(Lhb;I)Lut;")
   @ObfuscatedName("rh")
   public static DynamicArray method4465(EnumComposition var0, int var1) {
      if (var0 == null) {
         var0.method4471(var1);
      }

      try {
         if (null == var0.field2162) {
            if (var1 == -16711936) {
               throw new IllegalStateException();
            }

            if ('s' == var0.inputType) {
               if (var1 == -16711936) {
                  throw new IllegalStateException();
               }

               String[] var3 = var0.strVals;
               DynamicArray var4 = new DynamicArray(class586.field6379, false);
               var4.field6111 = var3;
               var4.size = var3.length * -1205286309;
               var4.field6106 = var3.length * -1332440619;
               var0.field2162 = var4;
            } else {
               int[] var6 = var0.intVals;
               DynamicArray var7 = new DynamicArray(class586.field6376, false);
               var7.array = var6;
               var7.size = var6.length * -1205286309;
               var7.field6106 = -1332440619 * var6.length;
               var0.field2162 = var7;
            }
         }

         return var0.field2162;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "hb.ak(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkk;)I")
   @ObfuscatedName("ol")
   public static int method4458(CollisionMap var0) {
      return 184157848 * var0.yInset;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("ag")
   void decode(Buffer var1, byte var2) {
      try {
         while (true) {
            int var3 = var1.readUnsignedByte(1844388688);
            if (var3 == 0) {
               if (var2 <= 21) {
                  throw new IllegalStateException();
               }

               return;
            }

            method4457(this, var1, var3, (byte)46);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hb.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhb;")
   @ObfuscatedName("ay")
   public static EnumComposition method4444(int var0) {
      EnumComposition var1 = (EnumComposition)class402.method8806(EnumDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = EnumDefinition_archive.getFile(8, var0, 2097395393);
         var1 = new EnumComposition();
         if (null != var2) {
            var1.decode(new Buffer(var2), (byte)103);
         }

         EnumDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhb;I)I")
   @ObfuscatedName("jg")
   public static int method4460(EnumComposition var0, int var1) {
      if (var0 == null) {
         var0.size(var1);
      }

      try {
         return -132553189 * var0.outputCount;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hb.ae(" + 41);
      }
   }

   public int[] getKeys() {
      return this.keys;
   }

   @ObfuscatedSignature(descriptor = "(I)Lut;")
   @ObfuscatedName("aj")
   public DynamicArray method4463(int var1) {
      try {
         if (this.field2163 == null) {
            if (var1 <= -838062851) {
               throw new IllegalStateException();
            }

            int[] var3 = this.keys;
            DynamicArray var4 = new DynamicArray(class586.field6376, false);
            var4.array = var3;
            var4.size = -1205286309 * var3.length;
            var4.field6106 = -1332440619 * var3.length;
            this.field2163 = var4;
         }

         return this.field2163;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "hb.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhb;)Lut;")
   @ObfuscatedName("sl")
   public static DynamicArray method4466(EnumComposition var0) {
      if (null == var0.field2162) {
         if ('s' == var0.inputType) {
            String[] var2 = var0.strVals;
            DynamicArray var3 = new DynamicArray(class586.field6379, false);
            var3.field6111 = var2;
            var3.size = var2.length * -1205286309;
            var3.field6106 = var2.length * -1332440619;
            var0.field2162 = var3;
         } else {
            int[] var4 = var0.intVals;
            DynamicArray var5 = new DynamicArray(class586.field6376, false);
            var5.array = var4;
            var5.size = var4.length * -1205286309;
            var5.field6106 = -1332440619 * var4.length;
            var0.field2162 = var5;
         }
      }

      return var0.field2162;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhb;)Lut;")
   @ObfuscatedName("sk")
   public static DynamicArray method4467(EnumComposition var0) {
      if (null == var0.field2162) {
         if ('s' == var0.inputType) {
            String[] var2 = var0.strVals;
            DynamicArray var3 = new DynamicArray(class586.field6379, false);
            var3.field6111 = var2;
            var3.size = var2.length * -1205286309;
            var3.field6106 = var2.length * -1332440619;
            var0.field2162 = var3;
         } else {
            int[] var4 = var0.intVals;
            DynamicArray var5 = new DynamicArray(class586.field6376, false);
            var5.array = var4;
            var5.size = var4.length * -1205286309;
            var5.field6106 = -1332440619 * var4.length;
            var0.field2162 = var5;
         }
      }

      return var0.field2162;
   }

   public int size() {
      return this.outputCount * -132553189;
   }

   @ObfuscatedSignature(descriptor = "()Lut;")
   @ObfuscatedName("af")
   public DynamicArray method4464() {
      if (this.field2163 == null) {
         int[] var2 = this.keys;
         DynamicArray var3 = new DynamicArray(class586.field6376, false);
         var3.array = var2;
         var3.size = -1205286309 * var2.length;
         var3.field6106 = -1332440619 * var2.length;
         this.field2163 = var3;
      }

      return this.field2163;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhb;")
   @ObfuscatedName("aw")
   public static EnumComposition method4445(int var0) {
      EnumComposition var1 = (EnumComposition)class402.method8806(EnumDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = EnumDefinition_archive.getFile(8, var0, 610803910);
         var1 = new EnumComposition();
         if (null != var2) {
            var1.decode(new Buffer(var2), (byte)79);
         }

         EnumDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ai")
   void method4451(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(779290070);
         if (var2 == 0) {
            return;
         }

         method4457(this, var1, var2, (byte)-39);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   public static void method4448() {
      EnumDefinition_cached.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhb;")
   @ObfuscatedName("au")
   public static EnumComposition method4446(int var0) {
      EnumComposition var1 = (EnumComposition)class402.method8806(EnumDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = EnumDefinition_archive.getFile(8, var0, -1432725743);
         var1 = new EnumComposition();
         if (null != var2) {
            var1.decode(new Buffer(var2), (byte)125);
         }

         EnumDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   public int method4461() {
      return -132553189 * this.outputCount;
   }

   public String[] getStringVals() {
      return this.strVals;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("as")
   void method4452(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(217578346);
         if (var2 == 0) {
            return;
         }

         method4457(this, var1, var2, (byte)-32);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ac")
   void method4453(Buffer var1, int var2) {
      if (var2 == 1) {
         this.outputType = (char)var1.readUnsignedByte(945563445);
      } else if (var2 == 2) {
         this.inputType = (char)var1.readUnsignedByte(866749354);
      } else if (3 == var2) {
         this.defaultStr = var1.readStringCp1252NullCircumfixed(-1223025553);
      } else if (var2 == 4) {
         this.defaultInt = Buffer.method12015(var1, -127059556) * -1746304735;
      } else if (var2 == 5) {
         this.outputCount = Buffer.method12008(var1, (byte)5) * -1377893357;
         this.keys = new int[this.outputCount * -132553189];
         this.strVals = new String[-132553189 * this.outputCount];

         for (int var3 = 0; var3 < this.outputCount * -132553189; var3++) {
            this.keys[var3] = Buffer.method12015(var1, -759052771);
            this.strVals[var3] = var1.readStringCp1252NullCircumfixed(262753894);
         }
      } else if (var2 == 6) {
         this.outputCount = Buffer.method12008(var1, (byte)5) * -1377893357;
         this.keys = new int[-132553189 * this.outputCount];
         this.intVals = new int[this.outputCount * -132553189];

         for (int var4 = 0; var4 < this.outputCount * -132553189; var4++) {
            this.keys[var4] = Buffer.method12015(var1, 1276140583);
            this.intVals[var4] = Buffer.method12015(var1, 1554150735);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ab")
   void method4454(Buffer var1, int var2) {
      if (var2 == 1) {
         this.outputType = (char)var1.readUnsignedByte(1050981041);
      } else if (var2 == 2) {
         this.inputType = (char)var1.readUnsignedByte(-1170588855);
      } else if (3 == var2) {
         this.defaultStr = var1.readStringCp1252NullCircumfixed(240356470);
      } else if (var2 == 4) {
         this.defaultInt = Buffer.method12015(var1, -578371503) * -1746304735;
      } else if (var2 == 5) {
         this.outputCount = Buffer.method12008(var1, (byte)5) * -1377893357;
         this.keys = new int[this.outputCount * -132553189];
         this.strVals = new String[-132553189 * this.outputCount];

         for (int var3 = 0; var3 < this.outputCount * -132553189; var3++) {
            this.keys[var3] = Buffer.method12015(var1, 1381228527);
            this.strVals[var3] = var1.readStringCp1252NullCircumfixed(1235200981);
         }
      } else if (var2 == 6) {
         this.outputCount = Buffer.method12008(var1, (byte)5) * -1377893357;
         this.keys = new int[-132553189 * this.outputCount];
         this.intVals = new int[this.outputCount * -132553189];

         for (int var4 = 0; var4 < this.outputCount * -132553189; var4++) {
            this.keys[var4] = Buffer.method12015(var1, 374322647);
            this.intVals[var4] = Buffer.method12015(var1, -235341895);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ax")
   void method4455(Buffer var1, int var2) {
      if (var2 == 1) {
         this.outputType = (char)var1.readUnsignedByte(1987242478);
      } else if (var2 == 2) {
         this.inputType = (char)var1.readUnsignedByte(-1688621031);
      } else if (3 == var2) {
         this.defaultStr = var1.readStringCp1252NullCircumfixed(-1144780941);
      } else if (var2 == 4) {
         this.defaultInt = Buffer.method12015(var1, 1416885224) * -1746304735;
      } else if (var2 == 5) {
         this.outputCount = Buffer.method12008(var1, (byte)5) * -1377893357;
         this.keys = new int[this.outputCount * -132553189];
         this.strVals = new String[-132553189 * this.outputCount];

         for (int var3 = 0; var3 < this.outputCount * -132553189; var3++) {
            this.keys[var3] = Buffer.method12015(var1, 110115513);
            this.strVals[var3] = var1.readStringCp1252NullCircumfixed(-384035430);
         }
      } else if (var2 == 6) {
         this.outputCount = Buffer.method12008(var1, (byte)5) * -1377893357;
         this.keys = new int[-132553189 * this.outputCount];
         this.intVals = new int[this.outputCount * -132553189];

         for (int var4 = 0; var4 < this.outputCount * -132553189; var4++) {
            this.keys[var4] = Buffer.method12015(var1, 701516324);
            this.intVals[var4] = Buffer.method12015(var1, 1092871517);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZB)I")
   @ObfuscatedName("ah")
   static int method4472(int var0, Script var1, boolean var2, byte var3) {
      try {
         Widget var10000;
         if (var2) {
            if (var3 == 16) {
               throw new IllegalStateException();
            }

            var10000 = UserComparator3.scriptDotWidget;
         } else {
            var10000 = class222.scriptActiveWidget;
         }

         Widget var4 = var10000;
         if (var0 == 1500) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.x * -814361553;
            return 1;
         } else if (var0 == 1501) {
            if (var3 == 16) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.y * -286860451;
               return 1;
            }
         } else if (1502 == var0) {
            if (var3 == 16) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1946208531 * var4.width;
               return 1;
            }
         } else if (var0 == 1503) {
            if (var3 == 16) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -905446999 * var4.height;
               return 1;
            }
         } else if (1504 == var0) {
            if (var3 == 16) {
               throw new IllegalStateException();
            } else {
               int[] var8 = Interpreter.Interpreter_intStack;
               int var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var10002;
               if (var4.isHidden) {
                  if (var3 == 16) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var8[var10001] = var10002;
               return 1;
            }
         } else if (1505 == var0) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.parentId * 794900977;
            return 1;
         } else if (var0 != 1506) {
            return 2;
         } else {
            int var5 = 794900977 * var4.parentId;
            if (var5 == -1) {
               if (var3 == 16) {
                  throw new IllegalStateException();
               }

               for (InterfaceParent var6 = (InterfaceParent)client.interfaceParents.first();
                  var6 != null;
                  var6 = (InterfaceParent)client.interfaceParents.next()
               ) {
                  if (var3 == 16) {
                     throw new IllegalStateException();
                  }

                  if (278777747 * var4.id >> 16 == -1385287145 * var6.group) {
                     if (var3 == 16) {
                        throw new IllegalStateException();
                     }

                     var5 = (int)var6.key;
                     break;
                  }
               }
            }

            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var5;
            return 1;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "hb.ah(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbn;I)V")
   @ObfuscatedName("al")
   static void changeWorld(World var0, int var1) {
      try {
         if (var0.isMembersOnly(-1144318653) != client.isMembersWorld) {
            if (var1 <= -1791314797) {
               throw new IllegalStateException();
            }

            client.isMembersWorld = var0.isMembersOnly(-1600471975);
            class189.method4814(var0.isMembersOnly(-1757474582), (byte)-33);
         }

         if (var0.location * -607869593 != -1330094789 * client.worldProperties) {
            if (var1 <= -1791314797) {
               client.method2483();
               return;
            }

            Archive var2 = class147.archive8;
            int var3 = -607869593 * var0.location;
            if ((var3 & class594.field6435.rsOrdinal((byte)37)) != 0) {
               class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var2, "logo_deadman_mode", "", 1915664827);
            } else if ((var3 & class594.field6409.rsOrdinal((byte)7)) != 0) {
               if (var1 <= -1791314797) {
                  throw new IllegalStateException();
               }

               class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var2, "logo_seasonal_mode", "", 2020614301);
            } else if ((var3 & class594.field6433.rsOrdinal((byte)109)) != 0) {
               if (var1 <= -1791314797) {
                  throw new IllegalStateException();
               }

               class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var2, "logo_speedrunning", "", 1964222110);
            } else if ((var3 & class594.field6417.rsOrdinal((byte)85)) != 0) {
               if (var1 <= -1791314797) {
                  client.method2483();
                  return;
               }

               class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var2, "logo_ugc_world", "", 1943703011);
            } else {
               class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var2, "logo", "", 1929293504);
            }
         }

         DynamicArray.worldHost = var0.host;
         client.worldId = 438507219 * var0.population;
         client.worldProperties = var0.location * -1978907195;
         class365.field4638 = var0.field283;
         int var10000;
         if (0 == client.gameBuild * -423864891) {
            if (var1 <= -1791314797) {
               throw new IllegalStateException();
            }

            var10000 = 43594;
         } else {
            var10000 = 40000 + var0.population * 789563243;
         }

         WorldMapLabel.worldPort = var10000 * -2014086695;
         int var10001;
         if (client.gameBuild * -423864891 == 0) {
            if (var1 <= -1791314797) {
               throw new IllegalStateException();
            }

            var10001 = 443;
         } else {
            var10001 = 50000 + 789563243 * var0.population;
         }

         class532.js5Port = -1309004683 * var10001;
         class46.currentPort = 564245299 * WorldMapLabel.worldPort;
         client.method2483();
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "hb.al(" + ')');
      }
   }

   public int getIntValue(int var1) {
      int[] var2 = this.getKeys();
      if (var2 == null) {
         return this.method4475();
      } else {
         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3] == var1) {
               int[] var4 = this.getIntVals();
               return var4[var3];
            }
         }

         return this.method4475();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lhb;")
   @ObfuscatedName("ap")
   public static EnumComposition method4447(int var0) {
      EnumComposition var1 = (EnumComposition)class402.method8806(EnumDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = EnumDefinition_archive.getFile(8, var0, -2044051320);
         var1 = new EnumComposition();
         if (null != var2) {
            var1.decode(new Buffer(var2), (byte)109);
         }

         EnumDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lut;")
   @ObfuscatedName("am")
   public DynamicArray method4468() {
      if (null == this.field2162) {
         if (-9635224 == this.inputType) {
            String[] var2 = this.strVals;
            DynamicArray var3 = new DynamicArray(class586.field6379, false);
            var3.field6111 = var2;
            var3.size = var2.length * -1205286309;
            var3.field6106 = var2.length * -2138880251;
            this.field2162 = var3;
         } else {
            int[] var4 = this.intVals;
            DynamicArray var5 = new DynamicArray(class586.field6376, false);
            var5.array = var4;
            var5.size = var4.length * 1890831626;
            var5.field6106 = -1332440619 * var4.length;
            this.field2162 = var5;
         }
      }

      return this.field2162;
   }

   public String getStringValue(int var1) {
      int[] var2 = this.getKeys();
      if (var2 == null) {
         return this.method4476();
      } else {
         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3] == var1) {
               String[] var4 = this.getStringVals();
               return var4[var3];
            }
         }

         return this.method4476();
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bl")
   public int method4475() {
      return this.defaultInt * 1780171489;
   }

   @ObfuscatedSignature(descriptor = "()Lut;")
   @ObfuscatedName("ao")
   public DynamicArray method4469() {
      if (null == this.field2162) {
         if (148064510 == this.inputType) {
            String[] var2 = this.strVals;
            DynamicArray var3 = new DynamicArray(class586.field6379, false);
            var3.field6111 = var2;
            var3.size = var2.length * -1205286309;
            var3.field6106 = var2.length * -1332440619;
            this.field2162 = var3;
         } else {
            int[] var4 = this.intVals;
            DynamicArray var5 = new DynamicArray(class586.field6376, false);
            var5.array = var4;
            var5.size = var4.length * 981464526;
            var5.field6106 = -318006418 * var4.length;
            this.field2162 = var5;
         }
      }

      return this.field2162;
   }

   @ObfuscatedSignature(descriptor = "()Lut;")
   @ObfuscatedName("be")
   public DynamicArray method4470() {
      if (null == this.field2162) {
         if ('s' == this.inputType) {
            String[] var2 = this.strVals;
            DynamicArray var3 = new DynamicArray(class586.field6379, false);
            var3.field6111 = var2;
            var3.size = var2.length * -1205286309;
            var3.field6106 = var2.length * -1332440619;
            this.field2162 = var3;
         } else {
            int[] var4 = this.intVals;
            DynamicArray var5 = new DynamicArray(class586.field6376, false);
            var5.array = var4;
            var5.size = var4.length * -1205286309;
            var5.field6106 = -1332440619 * var4.length;
            this.field2162 = var5;
         }
      }

      return this.field2162;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bb")
   public String method4476() {
      return this.defaultStr;
   }

   EnumComposition() {
      this.outputCount = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   public static void method4449() {
      EnumDefinition_cached.clear();
   }

   @ObfuscatedSignature(descriptor = "(III)Lcu;")
   @ObfuscatedName("ag")
   static Script getScript(int var0, int var1, int var2) {
      try {
         Script var3 = (Script)class402.method8806(Script.Script_cached, var0 << 16);
         if (null != var3) {
            if (var2 == 401554769) {
               throw new IllegalStateException();
            } else {
               return var3;
            }
         } else {
            String var4 = String.valueOf(var0);
            int var5 = WorldMapRectangle.archive12.groupLoadPercentByName(var4, (byte)64);
            if (-1 == var5) {
               if (var2 == 401554769) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               byte[] var6 = WorldMapRectangle.archive12.takeFileFlat(var5, -1587474787);
               if (null != var6) {
                  if (var6.length <= 1) {
                     if (var2 == 401554769) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  var3 = UserComparator3.newScript(var6, -1632150062);
                  if (null != var3) {
                     if (var2 == 401554769) {
                        throw new IllegalStateException();
                     }

                     Script.Script_cached.put(var3, var0 << 16);
                     return var3;
                  }
               }

               return null;
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "hb.ag(" + ')');
      }
   }

   public int[] getIntVals() {
      return this.intVals;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;")
   @ObfuscatedName("ox")
   static String method4474(String var0, boolean var1, int var2) {
      try {
         String var10000;
         if (var1) {
            if (var2 == 1415481045) {
               throw new IllegalStateException();
            }

            var10000 = "https://";
         } else {
            var10000 = "http://";
         }

         String var3 = var10000;
         if (1 == -423864891 * client.gameBuild) {
            if (var2 == 1415481045) {
               throw new IllegalStateException();
            }

            var0 = var0 + "-wtrc";
         } else if (2 == client.gameBuild * -423864891) {
            if (var2 == 1415481045) {
               throw new IllegalStateException();
            }

            var0 = var0 + "-wtqa";
         } else if (-423864891 * client.gameBuild == 3) {
            if (var2 == 1415481045) {
               throw new IllegalStateException();
            }

            var0 = var0 + "-wtwip";
         } else if (client.gameBuild * -423864891 == 5) {
            if (var2 == 1415481045) {
               throw new IllegalStateException();
            }

            var0 = var0 + "-wti";
         } else if (4 == client.gameBuild * -423864891) {
            if (var2 == 1415481045) {
               throw new IllegalStateException();
            }

            var0 = "local";
         }

         String var4 = "";
         if (class39.field196 != null) {
            if (var2 == 1415481045) {
               throw new IllegalStateException();
            }

            var4 = "/p=" + class39.field196;
         }

         String var5 = "runescape.com";
         return var3 + var0 + "." + var5 + "/l=" + class352.clientLanguage + "/a=" + classVW.field6321 * 551565965 + var4 + "/";
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "hb.ox(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;IB)V")
   @ObfuscatedName("an")
   void decodeNext(Buffer var1, int var2, byte var3) {
      try {
         if (var2 == 1) {
            if (var3 == 9) {
               throw new IllegalStateException();
            }

            this.inputType = (char)var1.readUnsignedShortAdd(-474957674);
         } else if (var2 == 2) {
            if (var3 == 9) {
               throw new IllegalStateException();
            }

            this.inputType = (char)var1.readUnsignedByte(-1307438717);
         } else if (3 == var2) {
            if (var3 == 9) {
               throw new IllegalStateException();
            }

            this.defaultStr = var1.readCESU8(2056324848);
         } else if (var2 == 4) {
            this.outputCount = Buffer.method12015(var1, -86170325) * -1746304735;
         } else if (var2 == 5) {
            if (var3 == 9) {
               throw new IllegalStateException();
            }

            this.outputCount = Buffer.method12008(var1, (byte)5) * -1377893357;
            this.intVals = new int[this.defaultInt * -132553189];
            this.strVals = new String[-132553189 * this.defaultInt];

            for (int var4 = 0; var4 < this.defaultInt * -132553189; var4++) {
               if (var3 == 9) {
                  return;
               }

               this.intVals[var4] = Buffer.method12015(var1, -466363104);
               this.strVals[var4] = var1.readStringCp1252NullTerminatedOrNull(294139627);
            }
         } else if (var2 == 6) {
            if (var3 == 9) {
               return;
            }

            this.outputCount = Buffer.method12008(var1, (byte)5) * -1377893357;
            this.intVals = new int[-132553189 * this.defaultInt];
            this.keys = new int[this.outputCount * -132553189];

            for (int var6 = 0; var6 < this.defaultInt * -132553189; var6++) {
               if (var3 == 9) {
                  throw new IllegalStateException();
               }

               this.intVals[var6] = Buffer.method12015(var1, 1338518420);
               this.intVals[var6] = Buffer.method12015(var1, 411952534);
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "hb.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhb;Lxa;IB)V")
   @ObfuscatedName("on")
   public static void method4457(EnumComposition var0, Buffer var1, int var2, byte var3) {
      if (var0 == null) {
         var0.decodeNext(var1, var2, var3);
      }

      try {
         if (var2 == 1) {
            if (var3 == 9) {
               throw new IllegalStateException();
            }

            var0.outputType = (char)var1.readUnsignedByte(-474957674);
         } else if (var2 == 2) {
            if (var3 == 9) {
               throw new IllegalStateException();
            }

            var0.inputType = (char)var1.readUnsignedByte(-1307438717);
         } else if (3 == var2) {
            if (var3 == 9) {
               throw new IllegalStateException();
            }

            var0.defaultStr = var1.readStringCp1252NullCircumfixed(2056324848);
         } else if (var2 == 4) {
            var0.defaultInt = Buffer.method12015(var1, -86170325) * -1746304735;
         } else if (var2 == 5) {
            if (var3 == 9) {
               throw new IllegalStateException();
            }

            var0.outputCount = Buffer.method12008(var1, (byte)5) * -1377893357;
            var0.keys = new int[var0.outputCount * -132553189];
            var0.strVals = new String[-132553189 * var0.outputCount];

            for (int var4 = 0; var4 < var0.outputCount * -132553189; var4++) {
               if (var3 == 9) {
                  return;
               }

               var0.keys[var4] = Buffer.method12015(var1, -466363104);
               var0.strVals[var4] = var1.readStringCp1252NullCircumfixed(294139627);
            }
         } else if (var2 == 6) {
            if (var3 == 9) {
               return;
            }

            var0.outputCount = Buffer.method12008(var1, (byte)5) * -1377893357;
            var0.keys = new int[-132553189 * var0.outputCount];
            var0.intVals = new int[var0.outputCount * -132553189];

            for (int var6 = 0; var6 < var0.outputCount * -132553189; var6++) {
               if (var3 == 9) {
                  throw new IllegalStateException();
               }

               var0.keys[var6] = Buffer.method12015(var1, 1338518420);
               var0.intVals[var6] = Buffer.method12015(var1, 411952534);
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "hb.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public int size(int var1) {
      try {
         return -132553189 * this.outputCount;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hb.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lut;")
   @ObfuscatedName("ak")
   public DynamicArray method4471(int var1) {
      try {
         if (null == this.field2163) {
            if (var1 == -16711936) {
               throw new IllegalStateException();
            }

            if ('s' == this.outputType) {
               if (var1 == -16711936) {
                  throw new IllegalStateException();
               }

               String[] var3 = this.strVals;
               DynamicArray var4 = new DynamicArray(class586.field6379, false);
               var4.field6111 = var3;
               var4.size = var3.length * -1205286309;
               var4.size = var3.length * -1332440619;
               this.field2162 = var4;
            } else {
               int[] var6 = this.intVals;
               DynamicArray var7 = new DynamicArray(class586.field6376, false);
               var7.array = var6;
               var7.size = var6.length * -1205286309;
               var7.size = -1332440619 * var6.length;
               this.field2163 = var7;
            }
         }

         return this.field2162;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "hb.ak(" + ')');
      }
   }
}
