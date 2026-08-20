import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xg")
public class FillMode implements Enum {
   @ObfuscatedSignature(descriptor = "Lxg;")
   @ObfuscatedName("ag")
   static final FillMode field6493 = new FillMode(2, 2);
   @ObfuscatedName("an")
   public final int field6495;
   @ObfuscatedSignature(descriptor = "Lxg;")
   @ObfuscatedName("at")
   static final FillMode field6494 = new FillMode(1, 1);
   @ObfuscatedSignature(descriptor = "Lxg;")
   @ObfuscatedName("av")
   public static final FillMode SOLID = new FillMode(0, 0);
   @ObfuscatedName("ae")
   final int field6496;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   public static final int field6498 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   public static final int field6497 = 38;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lem;[BI)V")
   @ObfuscatedName("ki")
   public static void method12276(classEM var0, byte[] var1, int var2) {
      if (var0 == null) {
         var0.method3781(var1, var2, var2);
      }

      var0.field1615 = var1;
      var0.field1613 = 228060835 * var2;
      var0.field1614 = 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return this.field6496 * -216454495;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return this.field6496 * -216454495;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xg.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return this.field6496 * -216454495;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return this.field6496 * -216454495;
   }

   FillMode(int var1, int var2) {
      this.field6495 = var1 * 711005403;
      this.field6496 = var2 * 391723361;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lxg;")
   @ObfuscatedName("aj")
   public static FillMode[] method12272() {
      return new FillMode[]{field6493, field6494, SOLID};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lxg;")
   @ObfuscatedName("ak")
   public static FillMode[] method12273() {
      return new FillMode[]{field6493, field6494, SOLID};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lxg;")
   @ObfuscatedName("ap")
   public static FillMode[] method12274() {
      return new FillMode[]{field6493, field6494, SOLID};
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("ba")
   static int method12277(int var0, Script var1, boolean var2, int var3) {
      try {
         if (3800 == var0) {
            if (var3 != 1893716028) {
               throw new IllegalStateException();
            } else {
               if (SecureRandomFuture.guestClanSettings != null) {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
                  FontName.field6342 = SecureRandomFuture.guestClanSettings;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               }

               return 1;
            }
         } else if (var0 == 3801) {
            int var20 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            if (client.currentClanSettings[var20] != null) {
               if (var3 != 1893716028) {
                  throw new IllegalStateException();
               }

               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
               FontName.field6342 = client.currentClanSettings[var20];
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3802) {
            if (var3 != 1893716028) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = FontName.field6342.name;
               return 1;
            }
         } else if (var0 == 3803) {
            int[] var25 = Interpreter.Interpreter_intStack;
            int var26 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
            byte var27;
            if (FontName.field6342.allowGuests) {
               if (var3 != 1893716028) {
                  throw new IllegalStateException();
               }

               var27 = 1;
            } else {
               var27 = 0;
            }

            var25[var26] = var27;
            return 1;
         } else if (var0 == 3804) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2068;
            return 1;
         } else if (3805 == var0) {
            if (var3 != 1893716028) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2063;
               return 1;
            }
         } else if (var0 == 3806) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2065;
            return 1;
         } else if (3807 == var0) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2066;
            return 1;
         } else if (var0 == 3809) {
            if (var3 != 1893716028) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.memberCount
                  * 1184926393;
               return 1;
            }
         } else if (var0 == 3810) {
            int var19 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = FontName.field6342.memberNames[var19];
            return 1;
         } else if (var0 == 3811) {
            if (var3 != 1893716028) {
               throw new IllegalStateException();
            } else {
               int var18 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.memberRanks[var18];
               return 1;
            }
         } else if (3812 == var0) {
            if (var3 != 1893716028) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -890431577
                  * FontName.field6342.bannedMemberCount;
               return 1;
            }
         } else if (3813 == var0) {
            if (var3 != 1893716028) {
               throw new IllegalStateException();
            } else {
               int var17 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = FontName.field6342.bannedMemberNames[var17];
               return 1;
            }
         } else if (3814 == var0) {
            class408.Interpreter_intStackSize -= -1084394537;
            int var16 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            int var22 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
            int var23 = Interpreter.Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342
               .method4283(var16, var22, var23, -3979127);
            return 1;
         } else if (3815 == var0) {
            if (var3 != 1893716028) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.currentOwner
                  * 1172757763;
               return 1;
            }
         } else if (var0 == 3816) {
            if (var3 != 1893716028) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.field2058 * 1673809521;
               return 1;
            }
         } else if (3817 == var0) {
            if (var3 != 1893716028) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = classDY.method3606(
                  FontName.field6342,
                  (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587],
                  2067715462
               );
               return 1;
            }
         } else if (3818 == var0) {
            Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 - 1] = FontName.field6342.getSortedMembers((byte)59)[Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize
                  * 327716789
               - 1]];
            return 1;
         } else if (3819 == var0) {
            if (var3 != 1893716028) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var15 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var21 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
               Message.method1207(var21, var15, 1066345315);
               return 1;
            }
         } else if (var0 == 3820) {
            int var14 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FontName.field6342.memberJoinDates[var14];
            return 1;
         } else {
            if (3821 == var0) {
               if (var3 != 1893716028) {
                  throw new IllegalStateException();
               }

               class408.Interpreter_intStackSize -= -1084394537;
               int var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               boolean var10000;
               if (Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1] == 1) {
                  if (var3 != 1893716028) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var5 = var10000;
               int var6 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
               classIO.method4948(var6, var4, var5, 1927981662);
            }

            if (3822 == var0) {
               if (var3 != 1893716028) {
                  throw new IllegalStateException();
               } else {
                  int var13 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                  int[] var24 = Interpreter.Interpreter_intStack;
                  int var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  byte var10002;
                  if (FontName.field6342.field2085[var13]) {
                     if (var3 != 1893716028) {
                        throw new IllegalStateException();
                     }

                     var10002 = 1;
                  } else {
                     var10002 = 0;
                  }

                  var24[var10001] = var10002;
                  return 1;
               }
            } else if (var0 == 3850) {
               if (var3 != 1893716028) {
                  throw new IllegalStateException();
               } else {
                  if (null != class57.guestClanChannel) {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
                     class225.field2771 = class57.guestClanChannel;
                  } else {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  }

                  return 1;
               }
            } else if (var0 == 3851) {
               if (var3 != 1893716028) {
                  throw new IllegalStateException();
               } else {
                  int var12 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                  if (null != client.currentClanChannels[var12]) {
                     if (var3 != 1893716028) {
                        throw new IllegalStateException();
                     }

                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
                     class225.field2771 = client.currentClanChannels[var12];
                     class148.field1907 = var12 * -606235673;
                  } else {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                  }

                  return 1;
               }
            } else if (3852 == var0) {
               if (var3 != 1893716028) {
                  throw new IllegalStateException();
               } else {
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = class225.field2771.name;
                  return 1;
               }
            } else if (3853 == var0) {
               if (var3 != 1893716028) {
                  throw new IllegalStateException();
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class225.field2771.field2134;
                  return 1;
               }
            } else if (var0 == 3854) {
               if (var3 != 1893716028) {
                  throw new IllegalStateException();
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class225.field2771.field2135;
                  return 1;
               }
            } else if (3855 == var0) {
               if (var3 != 1893716028) {
                  throw new IllegalStateException();
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class225.field2771
                     .method4425(-2089769915);
                  return 1;
               }
            } else if (3856 == var0) {
               if (var3 != 1893716028) {
                  throw new IllegalStateException();
               } else {
                  int var11 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = Username.method12702(
                     ((ClanChannelMember)class225.field2771.members.get(var11)).username, (byte)-55
                  );
                  return 1;
               }
            } else if (3857 == var0) {
               if (var3 != 1893716028) {
                  throw new IllegalStateException();
               } else {
                  int var10 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ((ClanChannelMember)class225.field2771
                        .members
                        .get(var10))
                     .rank;
                  return 1;
               }
            } else if (3858 == var0) {
               if (var3 != 1893716028) {
                  throw new IllegalStateException();
               } else {
                  int var9 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = ((ClanChannelMember)class225.field2771
                           .members
                           .get(var9))
                        .world
                     * -1379379925;
                  return 1;
               }
            } else if (3859 == var0) {
               if (var3 != 1893716028) {
                  throw new IllegalStateException();
               } else {
                  int var8 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                  class309.method7193(class148.field1907 * 1695010775, var8, -844830756);
                  return 1;
               }
            } else if (3860 == var0) {
               if (var3 != 1893716028) {
                  throw new IllegalStateException();
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class225.field2771
                     .method4429(
                        (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], 1596368249
                     );
                  return 1;
               }
            } else if (3861 == var0) {
               if (var3 != 1893716028) {
                  throw new IllegalStateException();
               } else {
                  Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 - 1] = class225.field2771.getSortedMembers(-453092939)[Interpreter.Interpreter_intStack[327716789
                        * class408.Interpreter_intStackSize
                     - 1]];
                  return 1;
               }
            } else if (var0 == 3890) {
               if (var3 != 1893716028) {
                  throw new IllegalStateException();
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != class4.field14 ? 1 : 0;
                  return 1;
               }
            } else {
               return 2;
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "xg.ba(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lxg;")
   @ObfuscatedName("aw")
   public static FillMode[] method12275() {
      return new FillMode[]{field6493, field6494, SOLID};
   }
}
