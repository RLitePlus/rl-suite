import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ep")
public class class117 {
   @ObfuscatedName("uw")
   static int field1631;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field1629 = 5;
   @ObfuscatedSignature(descriptor = "Lrm;")
   @ObfuscatedName("av")
   public static IterableNodeDeque reflectionChecks = new IterableNodeDeque();
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field1630 = 5;

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("at")
   static int method3808(int var0, int var1) {
      try {
         return (var0 >> 7) + 1;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ep.at(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public static void method3801() {
      reflectionChecks = new IterableNodeDeque();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public static void method3802() {
      reflectionChecks = new IterableNodeDeque();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   public static void method3803() {
      reflectionChecks = new IterableNodeDeque();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxj;)V")
   @ObfuscatedName("aw")
   public static void method3804(PacketBuffer var0) {
      ReflectionCheck var1 = (ReflectionCheck)reflectionChecks.method9642();
      if (var1 != null) {
         int var2 = var0.offset * 2108391709;
         var0.writeInt(var1.size * 1393129895, 1103131300);

         for (int var3 = 0; var3 < var1.id * -1975307707; var3++) {
            if (0 != var1.creationErrors[var3]) {
               var0.writeByte(var1.creationErrors[var3], (short)-9106);
            } else {
               try {
                  int var4 = var1.operations[var3];
                  if (0 == var4) {
                     Field var5 = var1.fields[var3];
                     int var6 = var5.getInt(null);
                     var0.writeByte(0, (short)-21173);
                     var0.writeInt(var6, 342265975);
                  } else if (1 == var4) {
                     Field var22 = var1.fields[var3];
                     var22.setInt(null, var1.intReplaceValues[var3]);
                     var0.writeByte(0, (short)-42);
                  } else if (var4 == 2) {
                     Field var23 = var1.fields[var3];
                     int var26 = var23.getModifiers();
                     var0.writeByte(0, (short)-26862);
                     var0.writeInt(var26, 587106607);
                  }

                  if (3 != var4) {
                     if (4 == var4) {
                        Method var25 = var1.methods[var3];
                        int var28 = var25.getModifiers();
                        var0.writeByte(0, (short)-14635);
                        var0.writeInt(var28, 583822143);
                     }
                  } else {
                     Method var24 = var1.methods[var3];
                     byte[][] var27 = var1.arguments[var3];
                     Object[] var7 = new Object[var27.length];

                     for (int var8 = 0; var8 < var27.length; var8++) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var27[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var29 = var24.invoke(null, var7);
                     if (var29 == null) {
                        var0.writeByte(0, (short)-25899);
                     } else if (var29 instanceof Number) {
                        var0.writeByte(1, (short)-11478);
                        var0.writeLongMedium(((Number)var29).longValue());
                     } else if (var29 instanceof String) {
                        var0.writeByte(2, (short)-20039);
                        var0.writeStringCp1252NullTerminated((String)var29, 998990159);
                     } else {
                        var0.writeByte(4, (short)-7764);
                     }
                  }
               } catch (ClassNotFoundException var10) {
                  var0.writeByte(-10, (short)-4961);
               } catch (InvalidClassException var11) {
                  var0.writeByte(-11, (short)-14964);
               } catch (StreamCorruptedException var12) {
                  var0.writeByte(-12, (short)-25486);
               } catch (OptionalDataException var13) {
                  var0.writeByte(-13, (short)-6357);
               } catch (IllegalAccessException var14) {
                  var0.writeByte(-14, (short)-16254);
               } catch (IllegalArgumentException var15) {
                  var0.writeByte(-15, (short)-24456);
               } catch (InvocationTargetException var16) {
                  var0.writeByte(-16, (short)-12151);
               } catch (SecurityException var17) {
                  var0.writeByte(-17, (short)-25380);
               } catch (IOException var18) {
                  var0.writeByte(-18, (short)-587);
               } catch (NullPointerException var19) {
                  var0.writeByte(-19, (short)-3118);
               } catch (Exception var20) {
                  var0.writeByte(-20, (short)-18111);
               } catch (Throwable var21) {
                  var0.writeByte(-21, (short)-23729);
               }
            }
         }

         var0.writeCrc(var2, -1693282382);
         var1.remove();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ai")
   public static void method3809(Buffer var0, int var1) {
      ReflectionCheck var2 = new ReflectionCheck();
      var2.id = var0.readUnsignedByte(1168335041) * -1535246007;
      var2.size = Buffer.method12015(var0, 1683893990) * 1720163863;
      var2.operations = new int[-1975307707 * var2.id];
      var2.creationErrors = new int[var2.id * -60545441];
      var2.fields = new Field[var2.id * -1975307707];
      var2.intReplaceValues = new int[515847979 * var2.id];
      var2.methods = new Method[var2.id * -1975307707];
      var2.arguments = new byte[-1975307707 * var2.id][][];

      for (int var3 = 0; var3 < -1975307707 * var2.id; var3++) {
         try {
            int var4 = var0.readUnsignedByte(1326801819);
            if (var4 != 0 && 1 != var4 && 2 != var4) {
               if (var4 == 3 || var4 == 4) {
                  String var25 = var0.readStringCp1252NullCircumfixed(-2001239102);
                  String var26 = var0.readStringCp1252NullCircumfixed(1086037854);
                  int var27 = var0.readUnsignedByte(1598989115);
                  String[] var8 = new String[var27];

                  for (int var9 = 0; var9 < var27; var9++) {
                     var8[var9] = var0.readStringCp1252NullCircumfixed(-236398716);
                  }

                  String var28 = var0.readStringCp1252NullCircumfixed(-1924404487);
                  byte[][] var10 = new byte[var27][];
                  if (3 == var4) {
                     for (int var11 = 0; var11 < var27; var11++) {
                        int var12 = Buffer.method12015(var0, 2020347881);
                        var10[var11] = new byte[var12];
                        var0.readBytes(var10[var11], 0, var12, (byte)-71);
                     }
                  }

                  var2.operations[var3] = var4;
                  Class[] var29 = new Class[var27];

                  for (int var30 = 0; var30 < var27; var30++) {
                     var29[var30] = BoundaryObject.loadClassFromDescriptor(var8[var30], 1401900348);
                  }

                  Class var31 = BoundaryObject.loadClassFromDescriptor(var28, 1401900348);
                  if (BoundaryObject.loadClassFromDescriptor(var25, 1401900348).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = BoundaryObject.loadClassFromDescriptor(var25, 1401900348).getDeclaredMethods();
                  Method[] var14 = var13;

                  for (int var15 = 0; var15 < var14.length; var15++) {
                     Method var16 = var14[var15];
                     if (var16.getName().equals(var26)) {
                        Class[] var17 = var16.getParameterTypes();
                        if (var29.length == var17.length) {
                           boolean var18 = true;

                           for (int var19 = 0; var19 < var29.length; var19++) {
                              if (var29[var19] != var17[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if (var18 && var31 == var16.getReturnType()) {
                              var2.methods[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.arguments[var3] = var10;
               }
            } else {
               String var5 = var0.readStringCp1252NullCircumfixed(-732602004);
               String var6 = var0.readStringCp1252NullCircumfixed(-2043763316);
               int var7 = 0;
               if (var4 == 1) {
                  var7 = Buffer.method12015(var0, 1599601764);
               }

               var2.operations[var3] = var4;
               var2.intReplaceValues[var3] = var7;
               if (BoundaryObject.loadClassFromDescriptor(var5, 1401900348).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.fields[var3] = BoundaryObject.loadClassFromDescriptor(var5, 1401900348).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.creationErrors[var3] = -1;
         } catch (SecurityException var21) {
            var2.creationErrors[var3] = -2;
         } catch (NullPointerException var22) {
            var2.creationErrors[var3] = -3;
         } catch (Exception var23) {
            var2.creationErrors[var3] = -4;
         } catch (Throwable var24) {
            var2.creationErrors[var3] = -5;
         }
      }

      reflectionChecks.addFirst(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrm;Lvz;)V")
   @ObfuscatedName("cg")
   public static void method3807(IterableNodeDeque var0, Node var1) {
      if (var0 == null) {
         var0.isEmpty();
      }

      if (var1.next != null) {
         var1.remove();
      }

      var1.next = var0.sentinel;
      var1.previous = var0.sentinel.previous;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxj;)V")
   @ObfuscatedName("ay")
   public static void method3805(PacketBuffer var0) {
      ReflectionCheck var1 = (ReflectionCheck)reflectionChecks.method9642();
      if (var1 != null) {
         int var2 = var0.offset * 2108391709;
         var0.writeInt(var1.size * 1393129895, 1878457027);

         for (int var3 = 0; var3 < var1.id * -1975307707; var3++) {
            if (0 != var1.creationErrors[var3]) {
               var0.writeByte(var1.creationErrors[var3], (short)-365);
            } else {
               try {
                  int var4 = var1.operations[var3];
                  if (0 == var4) {
                     Field var5 = var1.fields[var3];
                     int var6 = var5.getInt(null);
                     var0.writeByte(0, (short)-27839);
                     var0.writeInt(var6, 860007336);
                  } else if (1 == var4) {
                     Field var22 = var1.fields[var3];
                     var22.setInt(null, var1.intReplaceValues[var3]);
                     var0.writeByte(0, (short)-21916);
                  } else if (var4 == 2) {
                     Field var23 = var1.fields[var3];
                     int var26 = var23.getModifiers();
                     var0.writeByte(0, (short)-24067);
                     var0.writeInt(var26, 380773831);
                  }

                  if (3 != var4) {
                     if (4 == var4) {
                        Method var25 = var1.methods[var3];
                        int var28 = var25.getModifiers();
                        var0.writeByte(0, (short)-9406);
                        var0.writeInt(var28, 1313361791);
                     }
                  } else {
                     Method var24 = var1.methods[var3];
                     byte[][] var27 = var1.arguments[var3];
                     Object[] var7 = new Object[var27.length];

                     for (int var8 = 0; var8 < var27.length; var8++) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var27[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var29 = var24.invoke(null, var7);
                     if (var29 == null) {
                        var0.writeByte(0, (short)-25438);
                     } else if (var29 instanceof Number) {
                        var0.writeByte(1, (short)-25489);
                        var0.writeLongMedium(((Number)var29).longValue());
                     } else if (var29 instanceof String) {
                        var0.writeByte(2, (short)-5682);
                        var0.writeStringCp1252NullTerminated((String)var29, 998990159);
                     } else {
                        var0.writeByte(4, (short)-480);
                     }
                  }
               } catch (ClassNotFoundException var10) {
                  var0.writeByte(-10, (short)-16815);
               } catch (InvalidClassException var11) {
                  var0.writeByte(-11, (short)-3627);
               } catch (StreamCorruptedException var12) {
                  var0.writeByte(-12, (short)-21376);
               } catch (OptionalDataException var13) {
                  var0.writeByte(-13, (short)-8394);
               } catch (IllegalAccessException var14) {
                  var0.writeByte(-14, (short)-7157);
               } catch (IllegalArgumentException var15) {
                  var0.writeByte(-15, (short)-2510);
               } catch (InvocationTargetException var16) {
                  var0.writeByte(-16, (short)-17017);
               } catch (SecurityException var17) {
                  var0.writeByte(-17, (short)-9142);
               } catch (IOException var18) {
                  var0.writeByte(-18, (short)-18284);
               } catch (NullPointerException var19) {
                  var0.writeByte(-19, (short)-30521);
               } catch (Exception var20) {
                  var0.writeByte(-20, (short)-18424);
               } catch (Throwable var21) {
                  var0.writeByte(-21, (short)-25693);
               }
            }
         }

         var0.writeCrc(var2, -1693282382);
         var1.remove();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("au")
   public static void method3810(Buffer var0, int var1) {
      ReflectionCheck var2 = new ReflectionCheck();
      var2.id = var0.readUnsignedByte(-1158136509) * -393932659;
      var2.size = Buffer.method12015(var0, 796525893) * 1720163863;
      var2.operations = new int[-1975307707 * var2.id];
      var2.creationErrors = new int[var2.id * -1975307707];
      var2.fields = new Field[var2.id * -1975307707];
      var2.intReplaceValues = new int[-1975307707 * var2.id];
      var2.methods = new Method[var2.id * -1975307707];
      var2.arguments = new byte[-1975307707 * var2.id][][];

      for (int var3 = 0; var3 < -1975307707 * var2.id; var3++) {
         try {
            int var4 = var0.readUnsignedByte(87253034);
            if (var4 != 0 && 1 != var4 && 2 != var4) {
               if (var4 == 3 || var4 == 4) {
                  String var25 = var0.readStringCp1252NullCircumfixed(-263459376);
                  String var26 = var0.readStringCp1252NullCircumfixed(-1317947186);
                  int var27 = var0.readUnsignedByte(602224545);
                  String[] var8 = new String[var27];

                  for (int var9 = 0; var9 < var27; var9++) {
                     var8[var9] = var0.readStringCp1252NullCircumfixed(-1353380505);
                  }

                  String var28 = var0.readStringCp1252NullCircumfixed(1498026713);
                  byte[][] var10 = new byte[var27][];
                  if (3 == var4) {
                     for (int var11 = 0; var11 < var27; var11++) {
                        int var12 = Buffer.method12015(var0, 1192744940);
                        var10[var11] = new byte[var12];
                        var0.readBytes(var10[var11], 0, var12, (byte)-43);
                     }
                  }

                  var2.operations[var3] = var4;
                  Class[] var29 = new Class[var27];

                  for (int var30 = 0; var30 < var27; var30++) {
                     var29[var30] = BoundaryObject.loadClassFromDescriptor(var8[var30], 1401900348);
                  }

                  Class var31 = BoundaryObject.loadClassFromDescriptor(var28, 1401900348);
                  if (BoundaryObject.loadClassFromDescriptor(var25, 1401900348).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = BoundaryObject.loadClassFromDescriptor(var25, 1401900348).getDeclaredMethods();
                  Method[] var14 = var13;

                  for (int var15 = 0; var15 < var14.length; var15++) {
                     Method var16 = var14[var15];
                     if (var16.getName().equals(var26)) {
                        Class[] var17 = var16.getParameterTypes();
                        if (var29.length == var17.length) {
                           boolean var18 = true;

                           for (int var19 = 0; var19 < var29.length; var19++) {
                              if (var29[var19] != var17[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if (var18 && var31 == var16.getReturnType()) {
                              var2.methods[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.arguments[var3] = var10;
               }
            } else {
               String var5 = var0.readStringCp1252NullCircumfixed(-1992425408);
               String var6 = var0.readStringCp1252NullCircumfixed(23139557);
               int var7 = 0;
               if (var4 == 1) {
                  var7 = Buffer.method12015(var0, -609822735);
               }

               var2.operations[var3] = var4;
               var2.intReplaceValues[var3] = var7;
               if (BoundaryObject.loadClassFromDescriptor(var5, 1401900348).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.fields[var3] = BoundaryObject.loadClassFromDescriptor(var5, 1401900348).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.creationErrors[var3] = -1;
         } catch (SecurityException var21) {
            var2.creationErrors[var3] = -2;
         } catch (NullPointerException var22) {
            var2.creationErrors[var3] = -3;
         } catch (Exception var23) {
            var2.creationErrors[var3] = -4;
         } catch (Throwable var24) {
            var2.creationErrors[var3] = -5;
         }
      }

      reflectionChecks.addFirst(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("az")
   public static void method3811(Buffer var0, int var1) {
      ReflectionCheck var2 = new ReflectionCheck();
      var2.id = var0.readUnsignedByte(-1458908797) * -393932659;
      var2.size = Buffer.method12015(var0, -369480430) * 1720163863;
      var2.operations = new int[-1975307707 * var2.id];
      var2.creationErrors = new int[var2.id * -1975307707];
      var2.fields = new Field[var2.id * -1975307707];
      var2.intReplaceValues = new int[-1975307707 * var2.id];
      var2.methods = new Method[var2.id * -1975307707];
      var2.arguments = new byte[-1975307707 * var2.id][][];

      for (int var3 = 0; var3 < -1975307707 * var2.id; var3++) {
         try {
            int var4 = var0.readUnsignedByte(-1338137636);
            if (var4 != 0 && 1 != var4 && 2 != var4) {
               if (var4 == 3 || var4 == 4) {
                  String var25 = var0.readStringCp1252NullCircumfixed(333294164);
                  String var26 = var0.readStringCp1252NullCircumfixed(-940815608);
                  int var27 = var0.readUnsignedByte(-1108467418);
                  String[] var8 = new String[var27];

                  for (int var9 = 0; var9 < var27; var9++) {
                     var8[var9] = var0.readStringCp1252NullCircumfixed(2047800816);
                  }

                  String var28 = var0.readStringCp1252NullCircumfixed(1091473612);
                  byte[][] var10 = new byte[var27][];
                  if (3 == var4) {
                     for (int var11 = 0; var11 < var27; var11++) {
                        int var12 = Buffer.method12015(var0, 1572080294);
                        var10[var11] = new byte[var12];
                        var0.readBytes(var10[var11], 0, var12, (byte)83);
                     }
                  }

                  var2.operations[var3] = var4;
                  Class[] var29 = new Class[var27];

                  for (int var30 = 0; var30 < var27; var30++) {
                     var29[var30] = BoundaryObject.loadClassFromDescriptor(var8[var30], 1401900348);
                  }

                  Class var31 = BoundaryObject.loadClassFromDescriptor(var28, 1401900348);
                  if (BoundaryObject.loadClassFromDescriptor(var25, 1401900348).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = BoundaryObject.loadClassFromDescriptor(var25, 1401900348).getDeclaredMethods();
                  Method[] var14 = var13;

                  for (int var15 = 0; var15 < var14.length; var15++) {
                     Method var16 = var14[var15];
                     if (var16.getName().equals(var26)) {
                        Class[] var17 = var16.getParameterTypes();
                        if (var29.length == var17.length) {
                           boolean var18 = true;

                           for (int var19 = 0; var19 < var29.length; var19++) {
                              if (var29[var19] != var17[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if (var18 && var31 == var16.getReturnType()) {
                              var2.methods[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.arguments[var3] = var10;
               }
            } else {
               String var5 = var0.readStringCp1252NullCircumfixed(532945747);
               String var6 = var0.readStringCp1252NullCircumfixed(367679860);
               int var7 = 0;
               if (var4 == 1) {
                  var7 = Buffer.method12015(var0, 1279150662);
               }

               var2.operations[var3] = var4;
               var2.intReplaceValues[var3] = var7;
               if (BoundaryObject.loadClassFromDescriptor(var5, 1401900348).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.fields[var3] = BoundaryObject.loadClassFromDescriptor(var5, 1401900348).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.creationErrors[var3] = -1;
         } catch (SecurityException var21) {
            var2.creationErrors[var3] = -2;
         } catch (NullPointerException var22) {
            var2.creationErrors[var3] = -3;
         } catch (Exception var23) {
            var2.creationErrors[var3] = -4;
         } catch (Throwable var24) {
            var2.creationErrors[var3] = -5;
         }
      }

      reflectionChecks.addFirst(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ad")
   public static void method3812(Buffer var0, int var1) {
      ReflectionCheck var2 = new ReflectionCheck();
      var2.id = var0.readUnsignedByte(-87542374) * -393932659;
      var2.size = Buffer.method12015(var0, 176532368) * -197909054;
      var2.operations = new int[-1570589411 * var2.id];
      var2.creationErrors = new int[var2.id * -1975307707];
      var2.fields = new Field[var2.id * -1693507721];
      var2.intReplaceValues = new int[489240557 * var2.id];
      var2.methods = new Method[var2.id * -1606421413];
      var2.arguments = new byte[-1975307707 * var2.id][][];

      for (int var3 = 0; var3 < -1975307707 * var2.id; var3++) {
         try {
            int var4 = var0.readUnsignedByte(-1124704713);
            if (var4 != 0 && 1 != var4 && 2 != var4) {
               if (var4 == 3 || var4 == 4) {
                  String var25 = var0.readStringCp1252NullCircumfixed(548933074);
                  String var26 = var0.readStringCp1252NullCircumfixed(-1993474143);
                  int var27 = var0.readUnsignedByte(867538056);
                  String[] var8 = new String[var27];

                  for (int var9 = 0; var9 < var27; var9++) {
                     var8[var9] = var0.readStringCp1252NullCircumfixed(92112843);
                  }

                  String var28 = var0.readStringCp1252NullCircumfixed(-1653833616);
                  byte[][] var10 = new byte[var27][];
                  if (3 == var4) {
                     for (int var11 = 0; var11 < var27; var11++) {
                        int var12 = Buffer.method12015(var0, -802957214);
                        var10[var11] = new byte[var12];
                        var0.readBytes(var10[var11], 0, var12, (byte)19);
                     }
                  }

                  var2.operations[var3] = var4;
                  Class[] var29 = new Class[var27];

                  for (int var30 = 0; var30 < var27; var30++) {
                     var29[var30] = BoundaryObject.loadClassFromDescriptor(var8[var30], 1401900348);
                  }

                  Class var31 = BoundaryObject.loadClassFromDescriptor(var28, 1401900348);
                  if (BoundaryObject.loadClassFromDescriptor(var25, 1401900348).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = BoundaryObject.loadClassFromDescriptor(var25, 1401900348).getDeclaredMethods();
                  Method[] var14 = var13;

                  for (int var15 = 0; var15 < var14.length; var15++) {
                     Method var16 = var14[var15];
                     if (var16.getName().equals(var26)) {
                        Class[] var17 = var16.getParameterTypes();
                        if (var29.length == var17.length) {
                           boolean var18 = true;

                           for (int var19 = 0; var19 < var29.length; var19++) {
                              if (var29[var19] != var17[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if (var18 && var31 == var16.getReturnType()) {
                              var2.methods[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.arguments[var3] = var10;
               }
            } else {
               String var5 = var0.readStringCp1252NullCircumfixed(-889878075);
               String var6 = var0.readStringCp1252NullCircumfixed(-1344176492);
               int var7 = 0;
               if (var4 == 1) {
                  var7 = Buffer.method12015(var0, 2061549835);
               }

               var2.operations[var3] = var4;
               var2.intReplaceValues[var3] = var7;
               if (BoundaryObject.loadClassFromDescriptor(var5, 1401900348).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.fields[var3] = BoundaryObject.loadClassFromDescriptor(var5, 1401900348).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.creationErrors[var3] = -1;
         } catch (SecurityException var21) {
            var2.creationErrors[var3] = -2;
         } catch (NullPointerException var22) {
            var2.creationErrors[var3] = -171633980;
         } catch (Exception var23) {
            var2.creationErrors[var3] = -4;
         } catch (Throwable var24) {
            var2.creationErrors[var3] = -5;
         }
      }

      reflectionChecks.addFirst(var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxj;)V")
   @ObfuscatedName("ap")
   public static void method3806(PacketBuffer var0) {
      ReflectionCheck var1 = (ReflectionCheck)reflectionChecks.method9642();
      if (var1 != null) {
         int var2 = var0.offset * 2108391709;
         var0.writeInt(var1.size * 541525877, 1107053571);

         for (int var3 = 0; var3 < var1.id * -1975307707; var3++) {
            if (0 != var1.creationErrors[var3]) {
               var0.writeByte(var1.creationErrors[var3], (short)-1997);
            } else {
               try {
                  int var4 = var1.operations[var3];
                  if (0 == var4) {
                     Field var5 = var1.fields[var3];
                     int var6 = var5.getInt(null);
                     var0.writeByte(0, (short)-1496);
                     var0.writeInt(var6, 113456025);
                  } else if (1 == var4) {
                     Field var22 = var1.fields[var3];
                     var22.setInt(null, var1.intReplaceValues[var3]);
                     var0.writeByte(0, (short)-4331);
                  } else if (var4 == 2) {
                     Field var23 = var1.fields[var3];
                     int var26 = var23.getModifiers();
                     var0.writeByte(0, (short)-27998);
                     var0.writeInt(var26, 1231826138);
                  }

                  if (3 != var4) {
                     if (4 == var4) {
                        Method var25 = var1.methods[var3];
                        int var28 = var25.getModifiers();
                        var0.writeByte(0, (short)-5926);
                        var0.writeInt(var28, 461495061);
                     }
                  } else {
                     Method var24 = var1.methods[var3];
                     byte[][] var27 = var1.arguments[var3];
                     Object[] var7 = new Object[var27.length];

                     for (int var8 = 0; var8 < var27.length; var8++) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var27[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var29 = var24.invoke(null, var7);
                     if (var29 == null) {
                        var0.writeByte(0, (short)-18439);
                     } else if (var29 instanceof Number) {
                        var0.writeByte(1, (short)-22891);
                        var0.writeLongMedium(((Number)var29).longValue());
                     } else if (var29 instanceof String) {
                        var0.writeByte(2, (short)-14719);
                        var0.writeStringCp1252NullTerminated((String)var29, 998990159);
                     } else {
                        var0.writeByte(4, (short)-8179);
                     }
                  }
               } catch (ClassNotFoundException var10) {
                  var0.writeByte(-10, (short)-4361);
               } catch (InvalidClassException var11) {
                  var0.writeByte(-752265681, (short)-14822);
               } catch (StreamCorruptedException var12) {
                  var0.writeByte(-1146328711, (short)-12208);
               } catch (OptionalDataException var13) {
                  var0.writeByte(-13, (short)-1939);
               } catch (IllegalAccessException var14) {
                  var0.writeByte(-1992271018, (short)-27229);
               } catch (IllegalArgumentException var15) {
                  var0.writeByte(1924822511, (short)-30467);
               } catch (InvocationTargetException var16) {
                  var0.writeByte(-16, (short)-8908);
               } catch (SecurityException var17) {
                  var0.writeByte(-17, (short)-8660);
               } catch (IOException var18) {
                  var0.writeByte(2027651768, (short)-18816);
               } catch (NullPointerException var19) {
                  var0.writeByte(-19, (short)-10730);
               } catch (Exception var20) {
                  var0.writeByte(-20, (short)-4913);
               } catch (Throwable var21) {
                  var0.writeByte(1756053298, (short)-29801);
               }
            }
         }

         var0.writeCrc(var2, -1693282382);
         var1.remove();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
   @ObfuscatedName("as")
   static Class method3813(String var0) throws ClassNotFoundException {
      if (var0.equals("B")) {
         return byte.class;
      } else if (var0.equals("I")) {
         return int.class;
      } else if (var0.equals("S")) {
         return short.class;
      } else if (var0.equals("J")) {
         return long.class;
      } else if (var0.equals("Z")) {
         return boolean.class;
      } else if (var0.equals("F")) {
         return float.class;
      } else if (var0.equals("D")) {
         return double.class;
      } else if (var0.equals("C")) {
         return char.class;
      } else {
         return var0.equals("void") ? void.class : Class.forName(var0);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("py")
   static String method3814(String var0, int var1) {
      try {
         PlayerType[] var2 = Varps.PlayerType_values(-1081887393);

         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var1 == 2132152857) {
               throw new IllegalStateException();
            }

            PlayerType var4 = var2[var3];
            if (-1 != 390301733 * var4.modIcon) {
               if (var1 == 2132152857) {
                  throw new IllegalStateException();
               }

               if (var0.startsWith(SoundSystem.method3115(390301733 * var4.modIcon, 2127187032))) {
                  if (var1 == 2132152857) {
                     throw new IllegalStateException();
                  }

                  var0 = var0.substring(6 + Integer.toString(390301733 * var4.modIcon).length());
                  break;
               }
            }
         }

         return var0;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ep.py(" + ')');
      }
   }

   class117() throws Throwable {
      throw new Error();
   }
}
