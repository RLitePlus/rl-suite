import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vv")
public class classVV extends classLY {
   @ObfuscatedSignature(descriptor = "Llw;")
   @ObfuscatedName("am")
   Widget field6617;
   @ObfuscatedSignature(descriptor = "Lyi;")
   @ObfuscatedName("ad")
   public NodeHashTable field6618 = new NodeHashTable(512);
   @ObfuscatedSignature(descriptor = "Lyi;")
   @ObfuscatedName("au")
   public NodeHashTable field6613;
   @ObfuscatedSignature(descriptor = "Llw;")
   @ObfuscatedName("ai")
   public Widget field6620;
   @ObfuscatedName("at")
   public int field6615;
   @ObfuscatedSignature(descriptor = "Lvw;")
   @ObfuscatedName("ah")
   final classVW field6614;
   @ObfuscatedSignature(descriptor = "Lvc;")
   @ObfuscatedName("bn")
   final classVC field6611;
   @ObfuscatedName("ap")
   public int field6612 = -1130371137;
   @ObfuscatedName("an")
   public int field6616;
   @ObfuscatedName("bx")
   public boolean field6619;

   @ObfuscatedSignature(descriptor = "(Llw;I)Ljava/lang/String;")
   @ObfuscatedName("bd")
   public String method12122(Widget var1, int var2) {
      int var4 = this.method12136(var1, (short)255);
      boolean var3 = (var4 >> var2 & 1) != 0;
      if (!var3 && null == var1.field4386) {
         return null;
      } else {
         return null != var1.actions && var1.actions.length > var2 && var1.actions[var2] != null && !var1.actions[var2].trim().isEmpty()
            ? var1.actions[var2]
            : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ai")
   public void method12109(byte var1) {
      try {
         this.field6612 = -1130371137;
         this.field6613 = new NodeHashTable(8);
         this.field6617 = null;
         this.field6614.method12181(2130314559);
         classVW.method12186(this.field6614, -624973020);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vv.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lvc;")
   @ObfuscatedName("ar")
   public classVC method12112(int var1) {
      try {
         return this.field6611;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vv.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Llw;")
   @ObfuscatedName("cc")
   public Widget method12151() {
      return this.field6614.method12213(-974097448);
   }

   @ObfuscatedSignature(descriptor = "(Llw;B)Z")
   @ObfuscatedName("ak")
   public boolean method12119(Widget var1, byte var2) {
      try {
         return var1.field4289;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "vv.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvv;Llw;B)Llw;")
   @ObfuscatedName("nb")
   public static Widget method12144(classVV var0, Widget var1, byte var2) {
      if (var0 == null) {
         return var0.method12148(var1, var2);
      } else {
         try {
            Widget var3 = var0.method12139(var1, (byte)-76);
            if (var3 == null) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               var3 = var1.field4311;
            }

            return var3;
         } catch (RuntimeException var4) {
            throw classEG.newRunException(var4, "vv.bx(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;B)I")
   @ObfuscatedName("am")
   public int method12173(Widget var1, byte var2) {
      Widget var5 = var1;
      classVV var4 = this;
      boolean var6 = false;

      int var10000;
      try {
         WidgetConfigNode var7 = (WidgetConfigNode)var4.field6618.method13363(-1163656551 * var5.field4329);
         WidgetConfigNode var8 = classFW.method5064(var7, var5.field4260 * 63131743, 2074995174);
         if (var8 != null) {
            if (var6) {
               throw new IllegalStateException();
            }

            int var10 = var8.method6782((byte)37);
            var10000 = var10;
         } else {
            int var11 = var5.field4320 * 1595830249;
            var10000 = var11;
         }
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "vv.am(" + 41);
      }

      int var3 = var10000;
      if (client.field1138) {
         var3 |= 2097152;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Lvv;B)Z")
   @ObfuscatedName("ag")
   public static boolean method12158(classVV var0, byte var1) {
      if (var0 == null) {
         return var0.method12162(var1);
      } else {
         try {
            boolean var10000;
            if (null == var0.field6617) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "vv.bt(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;S)I")
   @ObfuscatedName("ah")
   public int method12136(Widget var1, short var2) {
      try {
         WidgetConfigNode var3 = (WidgetConfigNode)this.field6618.method13363(var1.field4329 * -1163656551);
         WidgetConfigNode var4 = classFW.method5064(var3, var1.field4260 * 63131743, -414664663);
         if (var4 != null) {
            if (var2 != 255) {
               throw new IllegalStateException();
            } else {
               return WidgetConfigNode.method6785(var4, 120041229);
            }
         } else {
            int var6 = var1.field4320 * 1595830249;
            return var6 >> 1 & 1023;
         }
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "vv.ah(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;B)Llw;")
   @ObfuscatedName("bn")
   public Widget method12139(Widget var1, byte var2) {
      try {
         int var3 = classCD.method1410(this.method12173(var1, (byte)0), (short)256);
         if (var3 == 0) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            for (int var4 = 0; var4 < var3; var4++) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               var1 = classLY.method7375(this, var1.field4342 * -1502647899, (byte)43);
               if (null == var1) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            }

            return var1;
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "vv.bn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvv;Llw;I)V")
   @ObfuscatedName("tn")
   public static void method12163(classVV var0, Widget var1, int var2) {
      if (var0 == null) {
         var0.method12166(var1, var2);
      }

      try {
         var0.field6617 = var1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "vv.bg(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvv;Llw;)Ljava/lang/String;")
   @ObfuscatedName("it")
   public static String method12124(classVV var0, Widget var1) {
      if (var0 == null) {
         var0.method12151();
      }

      if (classCK.method1575(var0.method12173(var1, (byte)0), -2092177232) == 0) {
         return null;
      } else {
         return var1.field4345 != null && !var1.field4345.trim().isEmpty() ? var1.field4345 : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Llw;")
   @ObfuscatedName("cs")
   public Widget method12140(Widget var1) {
      int var2 = classCD.method1410(this.method12173(var1, (byte)0), (short)256);
      if (var2 == 0) {
         return null;
      } else {
         for (int var3 = 0; var3 < var2; var3++) {
            var1 = classLY.method7375(this, var1.field4342 * 458555883, (byte)51);
            if (null == var1) {
               return null;
            }
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvv;B)Llw;")
   @ObfuscatedName("yb")
   public static Widget method12152(classVV var0, byte var1) {
      if (var0 == null) {
         return var0.method12153(var1);
      } else {
         try {
            return var0.field6614.method12213(-975656414);
         } catch (RuntimeException var2) {
            throw classEG.newRunException(var2, "vv.bp(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("br")
   public boolean method12154(int var1) {
      try {
         return this.field6614.method12209(2030554553);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vv.br(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)V")
   @ObfuscatedName("cj")
   public void method12164(Widget var1) {
      this.field6617 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Llw;III)Z")
   @ObfuscatedName("bm")
   public boolean method12157(Widget var1, int var2, int var3, int var4) {
      try {
         if (this.field6614.method12209(1398626350)) {
            return false;
         } else {
            if (null != var1) {
               if (var4 <= -213201407) {
                  throw new IllegalStateException();
               }

               if (method12144(this, var1, (byte)-16) != null) {
                  this.field6614.method12175(var1, method12144(this, var1, (byte)-79), var2, var3, (byte)-60);
                  return true;
               }

               if (var4 <= -213201407) {
                  throw new IllegalStateException();
               }
            }

            return false;
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "vv.bm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)I")
   @ObfuscatedName("cb")
   public int method12132(Widget var1) {
      WidgetConfigNode var2 = (WidgetConfigNode)this.field6618.method13363(464145912 * var1.field4329);
      WidgetConfigNode var3 = classFW.method5064(var2, var1.field4260 * 63131743, 397306859);
      return var3 != null ? var3.method6782((byte)63) : var1.field4320 * 1887401626;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("bj")
   public void method12167(byte var1) {
      try {
         this.field6617 = null;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vv.bj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvv;Llw;)Llw;")
   @ObfuscatedName("bi")
   public static Widget method12145(classVV var0, Widget var1) {
      if (var0 == null) {
         var0.method12126(var1);
      }

      Widget var2 = var0.method12139(var1, (byte)-105);
      if (var2 == null) {
         var2 = var1.field4311;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Llw;B)Z")
   @ObfuscatedName("bk")
   public boolean method12170(Widget var1, byte var2) {
      try {
         boolean var10000;
         if (this.field6617 == var1) {
            if (var2 >= 100) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "vv.bk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   public void method12110() {
      this.field6612 = -1130371137;
      this.field6613 = new NodeHashTable(8);
      this.field6617 = null;
      this.field6614.method12181(2129513656);
      classVW.method12186(this.field6614, -624973020);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bu")
   public void method12111() {
      this.field6612 = -1130371137;
      this.field6613 = new NodeHashTable(8);
      this.field6617 = null;
      this.field6614.method12181(2137154234);
      classVW.method12186(this.field6614, -624973020);
   }

   @ObfuscatedSignature(descriptor = "(Llw;II)Ljava/lang/String;")
   @ObfuscatedName("av")
   public String method12123(Widget var1, int var2, int var3) {
      try {
         int var5 = this.method12136(var1, (short)255);
         boolean var10000;
         if ((var5 >> var2 & 1) != 0) {
            if (var3 != -1760527185) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var4 = var10000;
         if (!var4 && null == var1.field4386) {
            if (var3 != -1760527185) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            if (null != var1.actions) {
               if (var3 != -1760527185) {
                  throw new IllegalStateException();
               }

               if (var1.actions.length > var2 && var1.actions[var2] != null) {
                  if (var3 != -1760527185) {
                     throw new IllegalStateException();
                  }

                  if (!var1.actions[var2].trim().isEmpty()) {
                     return var1.actions[var2];
                  }

                  if (var3 != -1760527185) {
                     throw new IllegalStateException();
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "vv.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvc;")
   @ObfuscatedName("bb")
   public classVC method12113() {
      return this.field6611;
   }

   @ObfuscatedSignature(descriptor = "(Lvv;Llw;B)Ljava/lang/String;")
   @ObfuscatedName("fb")
   public static String method12125(classVV var0, Widget var1, byte var2) {
      if (var0 == null) {
         return var0.method12127(var1, var2);
      } else {
         try {
            if (classCK.method1575(var0.method12173(var1, (byte)0), -2129730757) == 0) {
               if (var2 >= 30) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               if (var1.field4345 != null) {
                  if (var2 >= 30) {
                     throw new IllegalStateException();
                  }

                  if (!var1.field4345.trim().isEmpty()) {
                     return var1.field4345;
                  }

                  if (var2 >= 30) {
                     throw new IllegalStateException();
                  }
               }

               return null;
            }
         } catch (RuntimeException var3) {
            throw classEG.newRunException(var3, "vv.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)V")
   @ObfuscatedName("ci")
   public void method12165(Widget var1) {
      this.field6617 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lvc;")
   @ObfuscatedName("bw")
   public classVC method12114() {
      return this.field6611;
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Z")
   @ObfuscatedName("be")
   public boolean method12116(Widget var1) {
      return var1.method7212(-947902929)
         || this.method12173(var1, (byte)0) != 0
         || this.method12136(var1, (short)255) != 0
         || var1 == this.field6614.method12215(-412972097);
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Z")
   @ObfuscatedName("dc")
   public boolean method12171(Widget var1) {
      return this.field6617 == var1;
   }

   @ObfuscatedSignature(descriptor = "(Llw;B)Z")
   @ObfuscatedName("aw")
   public boolean method12117(Widget var1, byte var2) {
      try {
         if (!var1.method7212(-947902929)) {
            if (var2 == 6) {
               throw new IllegalStateException();
            }

            if (this.method12173(var1, (byte)0) == 0) {
               if (var2 == 6) {
                  throw new IllegalStateException();
               }

               if (this.method12136(var1, (short)255) == 0) {
                  if (var2 == 6) {
                     throw new IllegalStateException();
                  }

                  if (var1 != this.field6614.method12215(-1276148624)) {
                     return false;
                  }

                  if (var2 == 6) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "vv.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("an")
   public void method12128(int var1, int var2) {
      try {
         for (WidgetConfigNode var3 = (WidgetConfigNode)this.field6618.method13375();
            var3 != null;
            var3 = (WidgetConfigNode)IndexedObjectSet.method13401(this.field6618)
         ) {
            if ((var3.field6552 >> 16 & 65535L) == var1) {
               var3.vmethod398();
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "vv.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Z")
   @ObfuscatedName("bs")
   public boolean method12120(Widget var1) {
      return var1.field4289;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvv;Llw;)I")
   @ObfuscatedName("cs")
   public static int method12133(classVV var0, Widget var1) {
      WidgetConfigNode var2 = (WidgetConfigNode)var0.field6618.method13363(-1163656551 * var1.field4329);
      WidgetConfigNode var3 = classFW.method5064(var2, var1.field4260 * -1078646016, -569178960);
      return var3 != null ? var3.method6782((byte)42) : var1.field4320 * -1256877351;
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Ljava/lang/String;")
   @ObfuscatedName("bl")
   public String method12126(Widget var1) {
      if (classCK.method1575(this.method12173(var1, (byte)0), -2115348171) == 0) {
         return null;
      } else {
         return var1.field4345 != null && !var1.field4345.trim().isEmpty() ? var1.field4345 : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bh")
   public void method12129(int var1) {
      for (WidgetConfigNode var2 = (WidgetConfigNode)this.field6618.method13375();
         var2 != null;
         var2 = (WidgetConfigNode)IndexedObjectSet.method13401(this.field6618)
      ) {
         if ((var2.field6552 >> 16 & 65535L) == var1) {
            var2.vmethod398();
         }
      }
   }

   public classVV(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4, AbstractArchive var5) {
      super(var1, var2, var3, var4, var5);
      this.field6613 = new NodeHashTable(8);
      this.field6620 = null;
      this.field6615 = 0;
      this.field6616 = -1264941915;
      this.field6617 = null;
      this.field6614 = new classVW();
      this.field6611 = new classVC();
      this.field6619 = false;
   }

   @ObfuscatedSignature(descriptor = "()Lvc;")
   @ObfuscatedName("bi")
   public classVC method12115() {
      return this.field6611;
   }

   @ObfuscatedSignature(descriptor = "(Llw;)I")
   @ObfuscatedName("cp")
   public int method12137(Widget var1) {
      WidgetConfigNode var2 = (WidgetConfigNode)this.field6618.method13363(var1.field4329 * -2026377804);
      WidgetConfigNode var3 = classFW.method5064(var2, var1.field4260 * 63131743, 1687174860);
      if (var3 != null) {
         return WidgetConfigNode.method6785(var3, 120041229);
      } else {
         int var5 = var1.field4320 * 1595830249;
         return var5 >> 1 & 1006152527;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)I")
   @ObfuscatedName("cq")
   public int method12138(Widget var1) {
      WidgetConfigNode var2 = (WidgetConfigNode)this.field6618.method13363(var1.field4329 * -1163656551);
      WidgetConfigNode var3 = classFW.method5064(var2, var1.field4260 * 63131743, -633324221);
      if (var3 != null) {
         return WidgetConfigNode.method6785(var3, 120041229);
      } else {
         int var5 = var1.field4320 * 1595830249;
         return var5 >> 1 & 1023;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvv;)Z")
   @ObfuscatedName("tv")
   public static boolean method12159(classVV var0) {
      return var0 == null ? var0.method12156() : null == var0.field6617;
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Llw;")
   @ObfuscatedName("cl")
   public Widget method12141(Widget var1) {
      int var2 = classCD.method1410(this.method12173(var1, (byte)0), (short)256);
      if (var2 == 0) {
         return null;
      } else {
         for (int var3 = 0; var3 < var2; var3++) {
            var1 = classLY.method7375(this, var1.field4342 * 285697408, (byte)121);
            if (null == var1) {
               return null;
            }
         }

         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvv;Llw;)I")
   @ObfuscatedName("ca")
   public static int method12134(classVV var0, Widget var1) {
      WidgetConfigNode var2 = (WidgetConfigNode)var0.field6618.method13363(-1163656551 * var1.field4329);
      WidgetConfigNode var3 = classFW.method5064(var2, var1.field4260 * 1789871699, -322460111);
      return var3 != null ? var3.method6782((byte)14) : var1.field4320 * 1595830249;
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Llw;")
   @ObfuscatedName("cv")
   public Widget method12142(Widget var1) {
      int var2 = classCD.method1410(this.method12173(var1, (byte)0), (short)256);
      if (var2 == 0) {
         return null;
      } else {
         for (int var3 = 0; var3 < var2; var3++) {
            var1 = classLY.method7375(this, var1.field4342 * -1502647899, (byte)37);
            if (null == var1) {
               return null;
            }
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Z")
   @ObfuscatedName("by")
   public boolean method12118(Widget var1) {
      return var1.method7212(-947902929)
         || this.method12173(var1, (byte)0) != 0
         || this.method12136(var1, (short)255) != 0
         || var1 == this.field6614.method12215(-1484005868);
   }

   @ObfuscatedSignature(descriptor = "(Llw;)I")
   @ObfuscatedName("cu")
   public int method12135(Widget var1) {
      WidgetConfigNode var2 = (WidgetConfigNode)this.field6618.method13363(-1163656551 * var1.field4329);
      WidgetConfigNode var3 = classFW.method5064(var2, var1.field4260 * 63131743, 570299943);
      return var3 != null ? var3.method6782((byte)104) : var1.field4320 * 1595830249;
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Llw;")
   @ObfuscatedName("co")
   Widget method12146(Widget var1) {
      Widget var2 = this.method12139(var1, (byte)-42);
      if (var2 == null) {
         var2 = var1.field4311;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Llw;")
   @ObfuscatedName("ck")
   Widget method12147(Widget var1) {
      Widget var2 = this.method12139(var1, (byte)-120);
      if (var2 == null) {
         var2 = var1.field4311;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "()Lvw;")
   @ObfuscatedName("ca")
   public classVW method12149() {
      return this.field6614;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cn")
   public boolean method12155() {
      return this.field6614.method12209(1574293478);
   }

   @ObfuscatedSignature(descriptor = "(Llw;)I")
   @ObfuscatedName("ld")
   public int method12174(Widget var1) {
      return this.method12173(var1, (byte)0);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cg")
   public boolean method12156() {
      return this.field6614.method12209(1500138385);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cf")
   public boolean method12160() {
      return null == this.field6617;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cz")
   public boolean method12161() {
      return null == this.field6617;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cm")
   public void method12168() {
      this.field6617 = null;
   }

   @ObfuscatedSignature(descriptor = "(B)Lvw;")
   @ObfuscatedName("bc")
   public classVW method12150(byte var1) {
      try {
         return this.field6614;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vv.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ce")
   public void method12169() {
      this.field6617 = null;
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Z")
   @ObfuscatedName("bq")
   public boolean method12121(Widget var1) {
      return var1.field4289;
   }

   @ObfuscatedSignature(descriptor = "(Llw;)Z")
   @ObfuscatedName("dm")
   public boolean method12172(Widget var1) {
      return this.field6617 == var1;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("bt")
   public boolean method12162(byte var1) {
      try {
         boolean var10000;
         if (null == this.field6617) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vv.bt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;B)Ljava/lang/String;")
   @ObfuscatedName("at")
   public String method12127(Widget var1, byte var2) {
      try {
         if (classCK.method1575(this.method12173(var1, (byte)0), -2129730757) == 0) {
            if (var2 >= 30) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            if (var1.field4318 != null) {
               if (var2 >= 30) {
                  throw new IllegalStateException();
               }

               if (!var1.field4302.trim().isEmpty()) {
                  return var1.field4309;
               }

               if (var2 >= 30) {
                  throw new IllegalStateException();
               }
            }

            return null;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "vv.at(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvv;I)V")
   @ObfuscatedName("js")
   public static void method12130(classVV var0, int var1) {
      if (var0 == null) {
         var0.method12131(var1);
      }

      for (WidgetConfigNode var2 = (WidgetConfigNode)var0.field6618.method13375();
         var2 != null;
         var2 = (WidgetConfigNode)IndexedObjectSet.method13401(var0.field6618)
      ) {
         if ((var2.field6552 >> 16 & 65535L) == var1) {
            var2.vmethod398();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;B)Llw;")
   @ObfuscatedName("bx")
   Widget method12148(Widget var1, byte var2) {
      try {
         Widget var3 = this.method12139(var1, (byte)-76);
         if (var3 == null) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            var3 = var1.field4311;
         }

         return var3;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "vv.bx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;I)V")
   @ObfuscatedName("bg")
   public void method12166(Widget var1, int var2) {
      try {
         this.field6617 = var1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "vv.bg(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvv;Llw;)Llw;")
   @ObfuscatedName("jl")
   public static Widget method12143(classVV var0, Widget var1) {
      if (var0 == null) {
         var0.method12164(var1);
      }

      int var2 = classCD.method1410(var0.method12173(var1, (byte)0), (short)256);
      if (var2 == 0) {
         return null;
      } else {
         for (int var3 = 0; var3 < var2; var3++) {
            var1 = classLY.method7375(var0, var1.field4342 * -1502647899, (byte)114);
            if (null == var1) {
               return null;
            }
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bz")
   public void method12131(int var1) {
      for (WidgetConfigNode var2 = (WidgetConfigNode)this.field6613.method13374();
         var2 != null;
         var2 = (WidgetConfigNode)IndexedObjectSet.method13401(this.field6618)
      ) {
         if ((var2.field6552 >> 16 & 65535L) == var1) {
            var2.vmethod387();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Llw;")
   @ObfuscatedName("bp")
   public Widget method12153(byte var1) {
      try {
         return this.field6614.method12215(-975656414);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "vv.bp(" + ')');
      }
   }
}
