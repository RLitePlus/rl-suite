import net.runelite.api.ChatLineBuffer;
import net.runelite.api.MessageNode;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bv")
public class ChatChannel implements ChatLineBuffer {
   @ObfuscatedSignature(descriptor = "Lyz;")
   @ObfuscatedName("de")
   static IndexedSprite field590;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   static final int field588 = 51;
   @ObfuscatedName("ae")
   int field583;
   @ObfuscatedSignature(descriptor = "[Lcg;")
   @ObfuscatedName("af")
   Message[] field580 = new Message[100];
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field585 = 2301979;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field582 = 9;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final String field589 = "_z";
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field586 = 100;
   @ToRemove(unused = "true")
   @ObfuscatedName("bh")
   public static final int field587 = 66;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field584 = 7;

   public MessageNode[] getLines() {
      return this.field580;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbv;I)Lcg;")
   @ObfuscatedName("rl")
   public static Message method1251(ChatChannel var0, int var1) {
      if (var0 == null) {
         var0.method1253(var1, var1);
      }

      return var1 >= 0 && var1 < 1160694231 * var0.field583 ? var0.field580[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcg;")
   @ObfuscatedName("az")
   Message method1249(int var1, String var2, String var3, String var4, int var5) {
      try {
         Message var6 = this.field580[99];

         for (int var7 = this.field583 * 1160694231; var7 > 0; var7--) {
            if (var5 >= 714218958) {
               throw new IllegalStateException();
            }

            if (100 != var7) {
               this.field580[var7] = this.field580[var7 - 1];
            }
         }

         if (var6 == null) {
            if (var5 >= 714218958) {
               throw new IllegalStateException();
            }

            var6 = new Message(var1, var2, var4, var3);
         } else {
            var6.vmethod398();
            var6.method11958();
            var6.method1466(var1, var2, var4, var3, (byte)-84);
         }

         this.field580[0] = var6;
         if (this.field583 * 1160694231 < 100) {
            if (var5 >= 714218958) {
               throw new IllegalStateException();
            }

            this.field583 += -771671577;
         }

         return var6;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "bv.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("am")
   public static int method1258(int var0) {
      try {
         return classCS.field1248 * -1766337085 - 1;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "bv.am(" + 41);
      }
   }

   ChatChannel() {
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ax")
   int method1254() {
      return this.field583 * 1160694231;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbv;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcg;")
   @ObfuscatedName("is")
   public static Message method1250(ChatChannel var0, int var1, String var2, String var3, String var4) {
      Message var5 = var0.field580[99];

      for (int var6 = var0.field583 * 1160694231; var6 > 0; var6--) {
         if (100 != var6) {
            var0.field580[var6] = var0.field580[var6 - 1];
         }
      }

      if (var5 == null) {
         var5 = new Message(var1, var2, var4, var3);
      } else {
         var5.vmethod398();
         var5.method11958();
         var5.method1466(var1, var2, var4, var3, (byte)-98);
      }

      var0.field580[0] = var5;
      if (var0.field583 * 1160694231 < 100) {
         var0.field583 += -771671577;
      }

      return var5;
   }

   public void removeMessageNode(MessageNode var1) {
      MessageNode[] var2 = this.getLines();
      int var3 = this.getLength();
      int var4 = -1;

      for (int var5 = 0; var5 < var3; var5++) {
         if (var2[var5] == var1) {
            var4 = var5;
            break;
         }
      }

      if (var4 != -1) {
         assert var3 - 1 >= var4;

         System.arraycopy(var2, var4 + 1, var2, var4, var3 - 1 - var4);
         var2[var3 - 1] = null;
         this.method1259(var3 - 1);
         classVJ var6 = (classVJ)var1;
         var6.method12065();
         var6.method11963();
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ae")
   int method1255(byte var1) {
      try {
         return this.field583 * 1160694231;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "bv.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   int method1256() {
      return this.field583 * 1160694231;
   }

   public int getLength() {
      return this.field583 * 1160694231;
   }

   @ObfuscatedSignature(descriptor = "(Lbv;II)Lcg;")
   @ObfuscatedName("xm")
   public static Message method1252(ChatChannel var0, int var1, int var2) {
      if (var0 == null) {
         return var0.method1253(var1, var1);
      } else {
         try {
            if (var1 >= 0) {
               if (var2 == 620798481) {
                  throw new IllegalStateException();
               }

               if (var1 < 1160694231 * var0.field583) {
                  return var0.field580[var1];
               }

               if (var2 == 620798481) {
                  throw new IllegalStateException();
               }
            }

            return null;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "bv.af(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luu;Ljava/lang/Object;)Z")
   @ObfuscatedName("ce")
   public static boolean method1257(classUU var0, Object var1) {
      if (var0 == null) {
         var0.method11634();
      }

      if (!(var1 instanceof classUU)) {
         return false;
      } else {
         classUU var2 = (classUU)var1;

         for (int var3 = 0; var3 < 16; var3++) {
            if (var0.field6403[var3] != var2.field6403[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gl")
   public void method1259(int var1) {
      this.field583 = var1 * -771671577;
   }

   @ObfuscatedSignature(descriptor = "(II)Lcg;")
   @ObfuscatedName("af")
   Message method1253(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 == 620798481) {
               throw new IllegalStateException();
            }

            if (var1 < 1160694231 * this.field583) {
               return this.field580[var1];
            }

            if (var2 == 620798481) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "bv.af(" + ')');
      }
   }
}
