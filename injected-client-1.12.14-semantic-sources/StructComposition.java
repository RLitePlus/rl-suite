import net.runelite.api.IterableHashTable;
import net.runelite.api.ParamHolder;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("it")
public class StructComposition extends DualNode implements ParamHolder, net.runelite.api.StructComposition {
   @ObfuscatedName("qi")
   public int field2637 = -1;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("at")
   static EvictingDualNodeHashTable StructDefinition_cached = new EvictingDualNodeHashTable(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field2638 = 507;
   @ObfuscatedSignature(descriptor = "Lql;")
   @ObfuscatedName("ag")
   IterableNodeHashTable params;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("jt")
   static Archive archive2;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("av")
   static AbstractArchive StructDefinition_archive;

   @ObfuscatedSignature(descriptor = "(I)Lvz;")
   @ObfuscatedName("qt")
   public Node method5129(int var1) {
      return this.getParams() == null ? null : (Node)this.getParams().get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("al")
   void method5120(Buffer var1, int var2) {
      if (var2 == 249) {
         this.params = class406.readStringIntParameters(var1, this.params, (byte)-105);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ar")
   void method5116(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(-1538111389);
         if (0 == var2) {
            return;
         }

         this.decodeNext(var1, var2, 616531482);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("ae")
   void decode(Buffer var1, byte var2) {
      try {
         while (true) {
            int var3 = var1.readUnsignedByte(168762760);
            if (0 == var3) {
               if (var2 != 0) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.decodeNext(var1, var3, -376922019);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "it.ae(" + ')');
      }
   }

   public void setParams(IterableHashTable var1) {
      this.params = (IterableNodeHashTable)var1;
   }

   public IterableHashTable getParams() {
      return this.params;
   }

   public int getIntValue(int var1) {
      Node var2 = this.method5129(var1);
      if (var2 != null) {
         IntegerNode var4 = (IntegerNode)var2;
         return var4.getValue();
      } else {
         ParamComposition var3 = SecureUrlRequester.client.method2360(var1);
         if (var3.method4972()) {
            throw new IllegalArgumentException("trying to get int from string param");
         } else {
            return var3.method4973();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ak")
   public int getIntParam(int var1, int var2, int var3) {
      try {
         return class108.method3858(this.params, var1, var2, -58903933);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "it.ak(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lit;Lxa;I)V")
   @ObfuscatedName("sx")
   public static void method5121(StructComposition var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method5120(var1, var2);
      } else {
         if (var2 == 249) {
            var0.params = class406.readStringIntParameters(var1, var0.params, (byte)-15);
         }
      }
   }

   public void setValue(int var1, int var2) {
      this.method5130(var1, new IntegerNode(var2));
   }

   public void setValue(int var1, String var2) {
      this.method5130(var1, new ObjectNode(var2));
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ah")
   void method5118(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(475094008);
         if (0 == var2) {
            return;
         }

         this.decodeNext(var1, var2, 275653473);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("ap")
   public static void method5107(AbstractArchive var0) {
      StructDefinition_archive = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("ay")
   public static void method5108(AbstractArchive var0) {
      StructDefinition_archive = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("au")
   public static void method5109(AbstractArchive var0) {
      StructDefinition_archive = var0;
   }

   public int getId() {
      return this.field2637;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lit;")
   @ObfuscatedName("az")
   public static StructComposition method5110(int var0) {
      StructComposition var1 = (StructComposition)class402.method8806(StructDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = StructDefinition_archive.getFile(34, var0, 1442319335);
         var1 = new StructComposition();
         if (var2 != null) {
            var1.decode(new Buffer(var2), (byte)0);
         }

         var1.postDecode(88400100);
         StructDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lit;")
   @ObfuscatedName("ad")
   public static StructComposition method5111(int var0) {
      StructComposition var1 = (StructComposition)class402.method8806(StructDefinition_cached, var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = StructDefinition_archive.getFile(34, var0, 1551052411);
         var1 = new StructComposition();
         if (var2 != null) {
            var1.decode(new Buffer(var2), (byte)0);
         }

         var1.postDecode(-189919524);
         StructDefinition_cached.put(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   public static void method5112() {
      StructDefinition_cached.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public static void method5113() {
      StructDefinition_cached.clear();
   }

   StructComposition() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lit;Lxa;I)V")
   @ObfuscatedName("jx")
   public static void method5122(StructComposition var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method5123(var1, var2);
      } else {
         if (var2 == 249) {
            var0.params = class406.readStringIntParameters(var1, var0.params, (byte)-32);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ax")
   void method5119(Buffer var1) {
      while (true) {
         int var2 = var1.readUnsignedByte(144336232);
         if (0 == var2) {
            return;
         }

         this.decodeNext(var1, var2, -822284433);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILvz;)V")
   @ObfuscatedName("il")
   public void method5130(int var1, Node var2) {
      ParamComposition var3 = SecureUrlRequester.client.method2360(var1);
      if (var3.method4972() != (var2 instanceof ObjectNode)) {
         if (var3.method4972()) {
            throw new IllegalArgumentException("trying to put int into string param");
         } else {
            throw new IllegalArgumentException("trying to put string into int param");
         }
      } else {
         if (this.getParams() == null) {
            this.setParams(new IterableNodeHashTable(16));
         }

         this.getParams().put(var2, var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
   @ObfuscatedName("aw")
   public String getStringParam(int var1, String var2, byte var3) {
      try {
         return Projectile.method1418(this.params, var1, var2, -1710429349);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "it.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("af")
   void method5123(Buffer var1, int var2) {
      if (var2 == 249) {
         this.params = class406.readStringIntParameters(var1, this.params, (byte)92);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   void postDecode(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "it.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("aj")
   void decodeNext(Buffer var1, int var2, int var3) {
      try {
         if (var2 == 249) {
            if (var3 == -262115870) {
               throw new IllegalStateException();
            }

            this.params = class406.readStringIntParameters(var1, this.params, (byte)-22);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "it.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aa")
   public int method5126(int var1, int var2) {
      return class108.method3858(this.params, var1, var2, -1829779510);
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("aq")
   public String method5128(int var1, String var2) {
      return Projectile.method1418(this.params, var1, var2, -1874161118);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   public static void method5106(int var0) {
      try {
         class203.field2022.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "it.av(" + ')');
      }
   }

   public String getStringValue(int var1) {
      Node var2 = this.method5129(var1);
      if (var2 != null) {
         ObjectNode var4 = (ObjectNode)var2;
         return (String)var4.method11288();
      } else {
         ParamComposition var3 = SecureUrlRequester.client.method2360(var1);
         if (!var3.method4972()) {
            throw new IllegalArgumentException("trying to get string from int param");
         } else {
            return var3.method4974();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ab")
   void method5115() {
   }
}
