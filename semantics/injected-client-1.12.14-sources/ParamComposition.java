import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ip")
public class ParamComposition extends DualNode {
   @ObfuscatedName("an")
   public int defaultInt;
   @ObfuscatedName("ag")
   char type;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final int field2539 = 8;
   @ObfuscatedName("ae")
   public String defaultStr;
   @ObfuscatedName("aj")
   boolean autoDisable = true;
   @ToRemove(unused = "true")
   @ObfuscatedName("eu")
   static final int field2541 = 600;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field2536 = 10;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("ku")
   static Archive field2543;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("at")
   public static EvictingDualNodeHashTable ParamDefinition_cached = new EvictingDualNodeHashTable(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   public static final int field2537 = 1536;
   @ToRemove(unused = "true")
   @ObfuscatedName("bt")
   static final int field2540 = 5;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   void method4957() {
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("kf")
   public boolean method4972() {
      return method4969(this, -667029158);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("ae")
   void decodeNext(Buffer var1, int var2, int var3) {
      try {
         if (1 == var2) {
            if (var3 <= -1912129797) {
               throw new IllegalStateException();
            }

            this.type = GrandExchangeOfferUnitPriceComparator.method8845(Buffer.method12001(var1, (byte)81), -234838055);
         } else if (var2 == 2) {
            if (var3 <= -1912129797) {
               throw new IllegalStateException();
            }

            this.defaultInt = Buffer.method12015(var1, -915045256) * -1382433489;
         } else if (4 == var2) {
            if (var3 <= -1912129797) {
               throw new IllegalStateException();
            }

            this.autoDisable = false;
         } else if (5 == var2) {
            if (var3 <= -1912129797) {
               throw new IllegalStateException();
            }

            this.defaultStr = var1.readStringCp1252NullCircumfixed(769428373);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ip.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lip;I)Z")
   @ObfuscatedName("my")
   public static boolean method4969(ParamComposition var0, int var1) {
      if (var0 == null) {
         return var0.isString(var1);
      } else {
         try {
            return 's' == var0.type;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "ip.aj(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("ay")
   public static void method4950(AbstractArchive var0) {
      class190.ParamDefinition_archive = var0;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ar")
   void method4962(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(1510420579);
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2, 467577886);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("ak")
   public static void method4951(AbstractArchive var0) {
      class190.ParamDefinition_archive = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("aw")
   public static void method4952(AbstractArchive var0) {
      class190.ParamDefinition_archive = var0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   void postDecode(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ip.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("qu")
   public int method4973() {
      return this.defaultInt * -822826545;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("al")
   void method4966(Buffer var1, int var2) {
      if (1 == var2) {
         this.type = GrandExchangeOfferUnitPriceComparator.method8845(Buffer.method12001(var1, (byte)5), -1855427895);
      } else if (var2 == 2) {
         this.defaultInt = Buffer.method12015(var1, -366578162) * -1382433489;
      } else if (4 == var2) {
         this.autoDisable = false;
      } else if (5 == var2) {
         this.defaultStr = var1.readStringCp1252NullCircumfixed(181840483);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lip;")
   @ObfuscatedName("au")
   public static ParamComposition method4954(int var0) {
      ParamComposition var1 = (ParamComposition)class402.method8806(ParamDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class190.ParamDefinition_archive.getFile(11, var0, 275760343);
         var1 = new ParamComposition();
         if (var2 != null) {
            var1.decode(new Buffer(var2), (byte)-51);
         }

         var1.postDecode(653356064);
         ParamDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lip;")
   @ObfuscatedName("az")
   public static ParamComposition method4955(int var0) {
      ParamComposition var1 = (ParamComposition)class402.method8806(ParamDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class190.ParamDefinition_archive.getFile(11, var0, 1040827045);
         var1 = new ParamComposition();
         if (var2 != null) {
            var1.decode(new Buffer(var2), (byte)-17);
         }

         var1.postDecode(653356064);
         ParamDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lip;")
   @ObfuscatedName("ad")
   public static ParamComposition method4956(int var0) {
      ParamComposition var1 = (ParamComposition)class402.method8806(ParamDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class190.ParamDefinition_archive.getFile(11, var0, -1369226019);
         var1 = new ParamComposition();
         if (var2 != null) {
            var1.decode(new Buffer(var2), (byte)16);
         }

         var1.postDecode(653356064);
         ParamDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   void method4959() {
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ah")
   void method4967(Buffer var1, int var2) {
      if (1 == var2) {
         this.type = GrandExchangeOfferUnitPriceComparator.method8845(Buffer.method12001(var1, (byte)81), 1154971375);
      } else if (var2 == 2) {
         this.defaultInt = Buffer.method12015(var1, 628893130) * -1382433489;
      } else if (4 == var2) {
         this.autoDisable = false;
      } else if (5 == var2) {
         this.defaultStr = var1.readStringCp1252NullCircumfixed(-1677704334);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   void method4960() {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   void method4961() {
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ax")
   void method4963(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(296124686);
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2, -1860475155);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("an")
   void decode(Buffer var1, byte var2) {
      try {
         while (true) {
            int var3 = var1.readUnsignedByte(-460228950);
            if (var3 == 0) {
               if (var2 == 0) {
                  return;
               }

               return;
            }

            this.decodeNext(var1, var3, -1884940292);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ip.an(" + ')');
      }
   }

   ParamComposition() {
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("af")
   void method4968(Buffer var1, int var2) {
      if (1 == var2) {
         this.type = GrandExchangeOfferUnitPriceComparator.method8845(Buffer.method12001(var1, (byte)72), -1080655214);
      } else if (var2 == 2) {
         this.defaultInt = Buffer.method12015(var1, -112264033) * -1805436692;
      } else if (4 == var2) {
         this.autoDisable = false;
      } else if (5 == var2) {
         this.defaultStr = var1.readStringCp1252NullCircumfixed(-1276600796);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("ap")
   public static void method4953(AbstractArchive var0) {
      class190.ParamDefinition_archive = var0;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("su")
   public String method4974() {
      return this.defaultStr;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ao")
   public boolean method4970() {
      return 161287604 == this.type;
   }

   @ObfuscatedSignature(descriptor = "(B)J")
   @ObfuscatedName("av")
   public static final synchronized long method4949(byte var0) {
      try {
         long var1 = System.currentTimeMillis();
         if (var1 < 5036542711667253977L * class340.field4322) {
            if (var0 != 15) {
               throw new IllegalStateException();
            }

            class182.field2178 = class182.field2178 + (class340.field4322 * 5036542711667253977L - var1) * 7123621135650775227L;
         }

         class340.field4322 = var1 * 3078630805793013097L;
         return 8495838954768131187L * class182.field2178 + var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ip.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   public boolean isString(int var1) {
      try {
         return 's' == this.type;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ip.aj(" + ')');
      }
   }
}
