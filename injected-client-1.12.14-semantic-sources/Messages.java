import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("da")
public class Messages {
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   public static final int field1281 = 24;
   @ObfuscatedSignature(descriptor = "Lql;")
   @ObfuscatedName("at")
   static final IterableNodeHashTable Messages_hashTable = new IterableNodeHashTable(1024);
   @ObfuscatedSignature(descriptor = "Lrn;")
   @ObfuscatedName("ag")
   static final IterableDualNodeQueue Messages_queue = new IterableDualNodeQueue();
   @ObfuscatedName("an")
   static int Messages_count = 0;
   @ObfuscatedName("av")
   static final Map Messages_channels = new HashMap();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Lbu;")
   @ObfuscatedName("ac")
   static Message method3015(int var0, int var1) {
      ChatChannel var2 = (ChatChannel)Messages_channels.get(var0);
      return var2.getMessage(var1, -1671591810);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("ay")
   static void method3011(int var0, String var1, String var2) {
      class222.addChatMessage(var0, var1, var2, null, (byte)3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("au")
   static void method3012(int var0, String var1, String var2, String var3) {
      ChatChannel var4 = (ChatChannel)Messages_channels.get(var0);
      if (null == var4) {
         var4 = new ChatChannel();
         Messages_channels.put(var0, var4);
      }

      Message var5 = ChatChannel.method2603(var4, var0, var1, var2, var3, (byte)-102);
      Messages_hashTable.put((Node)var5, (long)(var5.count * 380472083));
      Messages_queue.add(var5);
      client.chatCycle = -1387197951 * client.cycleCntr;
   }

   Messages() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   static void method3023() {
      Messages_channels.clear();
      Messages_hashTable.clear();
      Messages_queue.clear();
      Messages_count = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lbu;")
   @ObfuscatedName("ar")
   static Message method3018(int var0) {
      return (Message)Messages_hashTable.get((long)var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Lbu;")
   @ObfuscatedName("as")
   static Message method3016(int var0, int var1) {
      ChatChannel var2 = (ChatChannel)Messages_channels.get(var0);
      return var2.getMessage(var1, -1671591810);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("ag")
   public static void readReflectionCheck(Buffer var0, int var1, int var2) {
      try {
         ReflectionCheck var3 = new ReflectionCheck();
         var3.id = var0.readUnsignedByte(-1169748911) * -393932659;
         var3.size = Buffer.method12015(var0, -7157779) * 1720163863;
         var3.operations = new int[-1975307707 * var3.id];
         var3.creationErrors = new int[var3.id * -1975307707];
         var3.fields = new Field[var3.id * -1975307707];
         var3.intReplaceValues = new int[-1975307707 * var3.id];
         var3.methods = new Method[var3.id * -1975307707];
         var3.arguments = new byte[-1975307707 * var3.id][][];

         for (int var4 = 0; var4 < -1975307707 * var3.id; var4++) {
            if (var2 <= -2016150759) {
               throw new IllegalStateException();
            }

            try {
               int var5 = var0.readUnsignedByte(160250459);
               if (var5 != 0) {
                  if (var2 <= -2016150759) {
                     throw new IllegalStateException();
                  }

                  if (1 != var5) {
                     if (var2 <= -2016150759) {
                        return;
                     }

                     if (2 != var5) {
                        if (var5 != 3) {
                           if (var2 <= -2016150759) {
                              throw new IllegalStateException();
                           }

                           if (var5 != 4) {
                              continue;
                           }

                           if (var2 <= -2016150759) {
                              return;
                           }
                        }

                        String var27 = var0.readStringCp1252NullCircumfixed(-1663475853);
                        String var28 = var0.readStringCp1252NullCircumfixed(1526298585);
                        int var29 = var0.readUnsignedByte(1900886815);
                        String[] var9 = new String[var29];

                        for (int var10 = 0; var10 < var29; var10++) {
                           var9[var10] = var0.readStringCp1252NullCircumfixed(-1202646637);
                        }

                        String var30 = var0.readStringCp1252NullCircumfixed(1838916320);
                        byte[][] var11 = new byte[var29][];
                        if (3 == var5) {
                           if (var2 <= -2016150759) {
                              throw new IllegalStateException();
                           }

                           for (int var12 = 0; var12 < var29; var12++) {
                              int var13 = Buffer.method12015(var0, 1928884527);
                              var11[var12] = new byte[var13];
                              var0.readBytes(var11[var12], 0, var13, (byte)-20);
                           }
                        }

                        var3.operations[var4] = var5;
                        Class[] var31 = new Class[var29];

                        for (int var32 = 0; var32 < var29; var32++) {
                           var31[var32] = BoundaryObject.loadClassFromDescriptor(var9[var32], 1401900348);
                        }

                        Class var33 = BoundaryObject.loadClassFromDescriptor(var30, 1401900348);
                        if (BoundaryObject.loadClassFromDescriptor(var27, 1401900348).getClassLoader() == null) {
                           throw new SecurityException();
                        }

                        Method[] var14 = BoundaryObject.loadClassFromDescriptor(var27, 1401900348).getDeclaredMethods();
                        Method[] var15 = var14;

                        for (int var16 = 0; var16 < var15.length; var16++) {
                           if (var2 <= -2016150759) {
                              throw new IllegalStateException();
                           }

                           Method var17 = var15[var16];
                           if (var17.getName().equals(var28)) {
                              Class[] var18 = var17.getParameterTypes();
                              if (var31.length == var18.length) {
                                 if (var2 <= -2016150759) {
                                    throw new IllegalStateException();
                                 }

                                 boolean var19 = true;

                                 for (int var20 = 0; var20 < var31.length; var20++) {
                                    if (var2 <= -2016150759) {
                                       throw new IllegalStateException();
                                    }

                                    if (var31[var20] != var18[var20]) {
                                       if (var2 <= -2016150759) {
                                          throw new IllegalStateException();
                                       }

                                       var19 = false;
                                       break;
                                    }
                                 }

                                 if (var19 && var33 == var17.getReturnType()) {
                                    if (var2 <= -2016150759) {
                                       throw new IllegalStateException();
                                    }

                                    var3.methods[var4] = var17;
                                 }
                              }
                           }
                        }

                        var3.arguments[var4] = var11;
                        continue;
                     }

                     if (var2 <= -2016150759) {
                        throw new IllegalStateException();
                     }
                  }
               }

               String var6 = var0.readStringCp1252NullCircumfixed(-955947756);
               String var7 = var0.readStringCp1252NullCircumfixed(-1810033026);
               int var8 = 0;
               if (var5 == 1) {
                  if (var2 <= -2016150759) {
                     throw new IllegalStateException();
                  }

                  var8 = Buffer.method12015(var0, -944759664);
               }

               var3.operations[var4] = var5;
               var3.intReplaceValues[var4] = var8;
               if (BoundaryObject.loadClassFromDescriptor(var6, 1401900348).getClassLoader() == null) {
                  if (var2 <= -2016150759) {
                     return;
                  }

                  throw new SecurityException();
               }

               var3.fields[var4] = BoundaryObject.loadClassFromDescriptor(var6, 1401900348).getDeclaredField(var7);
            } catch (ClassNotFoundException var21) {
               var3.creationErrors[var4] = -1;
            } catch (SecurityException var22) {
               var3.creationErrors[var4] = -2;
            } catch (NullPointerException var23) {
               var3.creationErrors[var4] = -3;
            } catch (Exception var24) {
               var3.creationErrors[var4] = -4;
            } catch (Throwable var25) {
               var3.creationErrors[var4] = -5;
            }
         }

         class117.reflectionChecks.addFirst(var3);
      } catch (RuntimeException var26) {
         throw RestClientThreadFactory.newRunException(var26, "da.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lbu;")
   @ObfuscatedName("ab")
   static Message method3019(int var0) {
      return (Message)Messages_hashTable.get((long)var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lbu;")
   @ObfuscatedName("ax")
   static Message method3020(int var0) {
      return (Message)Messages_hashTable.get((long)var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("ad")
   static void method3013(int var0, String var1, String var2, String var3) {
      ChatChannel var4 = (ChatChannel)Messages_channels.get(var0);
      if (null == var4) {
         var4 = new ChatChannel();
         Messages_channels.put(var0, var4);
      }

      Message var5 = ChatChannel.method2603(var4, var0, var1, var2, var3, (byte)-119);
      Messages_hashTable.put((Node)var5, (long)(var5.count * 380472083));
      Messages_queue.add(var5);
      client.chatCycle = -286807489 * client.cycleCntr;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ah")
   static int method3021(int var0) {
      ChatChannel var1 = (ChatChannel)Messages_channels.get(var0);
      return var1 == null ? 0 : var1.size(134600857);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("az")
   static void method3014(int var0, String var1, String var2, String var3) {
      ChatChannel var4 = (ChatChannel)Messages_channels.get(var0);
      if (null == var4) {
         var4 = new ChatChannel();
         Messages_channels.put(var0, var4);
      }

      Message var5 = ChatChannel.method2603(var4, var0, var1, var2, var3, (byte)-18);
      Messages_hashTable.put((Node)var5, (long)(var5.count * 380472083));
      Messages_queue.add(var5);
      client.chatCycle = -1387197951 * client.cycleCntr;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   static void method3024() {
      Messages_channels.clear();
      Messages_hashTable.clear();
      Messages_queue.clear();
      Messages_count = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("be")
   static int method3027(int var0) {
      Message var1 = (Message)Messages_hashTable.get((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.nextDual == Messages_queue.sentinel ? -1 : 341986056 * ((Message)var1.nextDual).count;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   static void method3025() {
      Messages_channels.clear();
      Messages_hashTable.clear();
      Messages_queue.clear();
      Messages_count = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   static void method3026() {
      for (Message var1 : Messages_hashTable) {
         var1.clearIsFromIgnored(1979602416);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Lbu;")
   @ObfuscatedName("ai")
   static Message method3017(int var0, int var1) {
      ChatChannel var2 = (ChatChannel)Messages_channels.get(var0);
      return var2.getMessage(var1, -1671591810);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aq")
   static int method3028(int var0) {
      Message var1 = (Message)Messages_hashTable.get((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.nextDual == Messages_queue.sentinel ? -1 : 380472083 * ((Message)var1.nextDual).count;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bo")
   static int method3029(int var0) {
      Message var1 = (Message)Messages_hashTable.get((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return Messages_queue.sentinel == var1.previousDual ? -1 : 380472083 * ((Message)var1.previousDual).count;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bg")
   static int method3030(int var0) {
      Message var1 = (Message)Messages_hashTable.get((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return Messages_queue.sentinel == var1.previousDual ? -1 : 380472083 * ((Message)var1.previousDual).count;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bs")
   static int method3031(int var0) {
      Message var1 = (Message)Messages_hashTable.get((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return Messages_queue.sentinel == var1.previousDual ? -1 : 380472083 * ((Message)var1.previousDual).count;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("al")
   static int method3022(int var0) {
      ChatChannel var1 = (ChatChannel)Messages_channels.get(var0);
      return var1 == null ? 0 : var1.size(956761783);
   }
}
