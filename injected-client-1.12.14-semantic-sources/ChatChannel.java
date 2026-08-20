import net.runelite.api.ChatLineBuffer;
import net.runelite.api.MessageNode;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cm")
public class ChatChannel implements ChatLineBuffer {
   @ObfuscatedName("ag")
   int count;
   @ObfuscatedSignature(descriptor = "[Lbu;")
   @ObfuscatedName("at")
   Message[] messages = new Message[100];
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field1056 = 100;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field1052 = 35;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field1055 = 66;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field1054 = 3;

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   int size(int var1) {
      try {
         return this.count * 1784084401;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cm.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([J[JIIB)V")
   @ObfuscatedName("ay")
   public static void method2611(long[] var0, long[] var1, int var2, int var3, byte var4) {
      try {
         if (var2 < var3) {
            int var5 = (var2 + var3) / 2;
            int var6 = var2;
            long var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            long var9 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var9;
            long var10000;
            if (var7 == Long.MAX_VALUE) {
               if (var4 >= 1) {
                  return;
               }

               var10000 = 0L;
            } else {
               var10000 = 1L;
            }

            long var11 = var10000;

            for (int var13 = var2; var13 < var3; var13++) {
               if (var4 >= 1) {
                  throw new IllegalStateException();
               }

               if (var0[var13] >= var7 + (var13 & var11)) {
                  if (var4 >= 1) {
                     throw new IllegalStateException();
                  }
               } else {
                  long var14 = var0[var13];
                  var0[var13] = var0[var6];
                  var0[var6] = var14;
                  long var16 = var1[var13];
                  var1[var13] = var1[var6];
                  var1[var6++] = var16;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var9;
            method2611(var0, var1, var2, var6 - 1, (byte)-50);
            method2611(var0, var1, var6 + 1, var3, (byte)-69);
         }
      } catch (RuntimeException var18) {
         throw RestClientThreadFactory.newRunException(var18, "cm.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbu;")
   @ObfuscatedName("ae")
   Message method2600(int var1, String var2, String var3, String var4) {
      Message var5 = this.messages[-1936953806];

      for (int var6 = 1784084401 * this.count; var6 > 0; var6--) {
         if (var6 != 1765481431) {
            this.messages[var6] = this.messages[var6 - 1];
         }
      }

      if (var5 == null) {
         var5 = new Message(var1, var2, var4, var3);
      } else {
         var5.remove();
         var5.removeDual();
         var5.set(var1, var2, var4, var3, -1781673143);
      }

      this.messages[0] = var5;
      if (1784084401 * this.count < -1164326669) {
         this.count += -623167417;
      }

      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkb;)I")
   @ObfuscatedName("xa")
   public static int method2599(WorldEntityCoord var0) {
      return var0.x * 882985494 >> 7;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbu;")
   @ObfuscatedName("an")
   Message method2601(int var1, String var2, String var3, String var4) {
      Message var5 = this.messages[99];

      for (int var6 = 1784084401 * this.count; var6 > 0; var6--) {
         if (var6 != 100) {
            this.messages[var6] = this.messages[var6 - 1];
         }
      }

      if (var5 == null) {
         var5 = new Message(var1, var2, var4, var3);
      } else {
         var5.remove();
         var5.removeDual();
         var5.set(var1, var2, var4, var3, -1899856974);
      }

      this.messages[0] = var5;
      if (1784084401 * this.count < 100) {
         this.count += 1907290449;
      }

      return var5;
   }

   @ObfuscatedSignature(descriptor = "(II)Lwe;")
   @ObfuscatedName("av")
   public static DbTableType getDbTableType(int var0, int var1) {
      try {
         DbTableType var2 = (DbTableType)class402.method8806(DbTableType.DBTableType_cache, var0);
         if (null != var2) {
            if (var1 >= -1508450356) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = classRS.field5704.getFile(39, var0, 1095857533);
            var2 = new DbTableType();
            if (var3 != null) {
               DbTableType.method11684(var2, new Buffer(var3), (byte)2);
            }

            var2.method11695(279571430);
            DbTableType.DBTableType_cache.put(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cm.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbu;")
   @ObfuscatedName("aj")
   Message method2602(int var1, String var2, String var3, String var4) {
      Message var5 = this.messages[99];

      for (int var6 = 1784084401 * this.count; var6 > 0; var6--) {
         if (var6 != 100) {
            this.messages[var6] = this.messages[var6 - 1];
         }
      }

      if (var5 == null) {
         var5 = new Message(var1, var2, var4, var3);
      } else {
         var5.remove();
         var5.removeDual();
         var5.set(var1, var2, var4, var3, -2106390178);
      }

      this.messages[0] = var5;
      if (1784084401 * this.count < 100) {
         this.count += 1907290449;
      }

      return var5;
   }

   @ObfuscatedSignature(descriptor = "(Lcm;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbu;")
   @ObfuscatedName("vb")
   public static Message method2603(ChatChannel var0, int var1, String var2, String var3, String var4, byte var5) {
      if (var0 == null) {
         var0.addMessage(var1, var2, var2, var2, var5);
      }

      try {
         Message var6 = var0.messages[99];

         for (int var7 = 1784084401 * var0.count; var7 > 0; var7--) {
            if (var5 >= 4) {
               throw new IllegalStateException();
            }

            if (var7 == 100) {
               if (var5 >= 4) {
                  throw new IllegalStateException();
               }
            } else {
               var0.messages[var7] = var0.messages[var7 - 1];
            }
         }

         if (var6 == null) {
            if (var5 >= 4) {
               throw new IllegalStateException();
            }

            var6 = new Message(var1, var2, var4, var3);
         } else {
            var6.remove();
            var6.removeDual();
            var6.set(var1, var2, var4, var3, -1203927316);
         }

         var0.messages[0] = var6;
         if (1784084401 * var0.count < 100) {
            if (var5 >= 4) {
               throw new IllegalStateException();
            }

            var0.count += 1907290449;
         }

         return var6;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "cm.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lbu;")
   @ObfuscatedName("ak")
   Message method2605(int var1) {
      return var1 >= 0 && var1 < this.count * 1784084401 ? this.messages[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   int method2609() {
      return this.count * 1784084401;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcm;I)Lbu;")
   @ObfuscatedName("hm")
   public static Message method2606(ChatChannel var0, int var1) {
      if (var0 == null) {
         var0.method2612(var1);
      }

      return var1 >= 0 && var1 < var0.count * 1502540784 ? var0.messages[var1] : null;
   }

   public int getLength() {
      return this.count * 1784084401;
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
         this.method2612(var3 - 1);
         DualNode var6 = (DualNode)var1;
         var6.method11660();
         var6.method11347();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gh")
   public void method2612(int var1) {
      this.count = var1 * 1907290449;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   int method2610() {
      return this.count * 212451514;
   }

   public MessageNode[] getLines() {
      return this.messages;
   }

   @ObfuscatedSignature(descriptor = "(II)Lbu;")
   @ObfuscatedName("at")
   Message getMessage(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 != -1671591810) {
               throw new IllegalStateException();
            }

            if (var1 < this.count * 1784084401) {
               return this.messages[var1];
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cm.at(" + ')');
      }
   }

   ChatChannel() {
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbu;")
   @ObfuscatedName("av")
   Message addMessage(int var1, String var2, String var3, String var4, byte var5) {
      try {
         Message var6 = this.messages[99];

         for (int var7 = 1784084401 * this.count; var7 > 0; var7--) {
            if (var5 >= 4) {
               throw new IllegalStateException();
            }

            if (var7 == 100) {
               if (var5 >= 4) {
                  throw new IllegalStateException();
               }
            } else {
               this.messages[var7] = this.messages[var7 - 1];
            }
         }

         if (var6 == null) {
            if (var5 >= 4) {
               throw new IllegalStateException();
            }

            var6 = new Message(var1, var2, var4, var3);
         } else {
            var6.method11660();
            var6.removeDual();
            var6.set(var1, var2, var4, var3, -1203927316);
         }

         this.messages[0] = var6;
         if (1784084401 * this.count < 100) {
            if (var5 >= 4) {
               throw new IllegalStateException();
            }

            this.count += 1907290449;
         }

         return var6;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "cm.av(" + ')');
      }
   }
}
