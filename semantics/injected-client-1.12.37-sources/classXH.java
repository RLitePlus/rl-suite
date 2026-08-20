import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xh")
public class classXH {
   @ObfuscatedSignature(descriptor = "[Lxg;")
   @ObfuscatedName("az")
   classXG[] field6869 = new classXG[0];
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field6870 = 7;

   @ObfuscatedSignature(descriptor = "(Lxs;II)V")
   @ObfuscatedName("ae")
   public void method12758(PacketBuffer var1, int var2, int var3) {
      try {
         while (702114061 * var1.offset < var2) {
            if (var3 == 1156537225) {
               throw new IllegalStateException();
            }

            int var4 = Buffer.method13039(var1, -346779531);
            if (var4 >= this.field6869.length) {
               if (var3 == 1156537225) {
                  throw new IllegalStateException();
               }

               this.field6869 = Arrays.copyOf(this.field6869, 1 + var4);
            }

            this.method12765(var4, var1, 1762245209);
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "xh.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxh;Lxs;I)V")
   @ObfuscatedName("fp")
   public static void method12761(classXH var0, PacketBuffer var1, int var2) {
      if (var0 == null) {
         var0.method12769(var2);
      }

      while (702114061 * var1.offset < var2) {
         int var3 = Buffer.method13039(var1, -346779531);
         int var4 = var1.method13056((byte)1);
         Object var5 = null;
         switch (classBW.method1267(var4, (byte)-109).field7107 * -1036606364) {
            case 2:
               var5 = var1.method13056((byte)1);
               break;
            case 3:
               var5 = var1.method13059(1604974912);
               break;
            case 4:
               var5 = var1.method13071(5651073);
         }

         if (var3 < var0.field6869.length && var0.field6869[var3] != null && -1472217620 * var0.field6869[var3].field6864 == classIZ.method6339(var4, (byte)75)
            )
          {
            int var6 = classCF.method1461(var4, (byte)23);
            switch (classJW.method6417(var4, (byte)101).field4861 * 1805222340) {
               case 0:
                  var0.field6869[var3].field6861[var6] = var5;
                  break;
               case 1:
                  var0.field6869[var3].field6862[var6] = var5;
                  break;
               case 2:
                  var0.field6869[var3].field6865[var6] = var5;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxh;J)Lxg;")
   @ObfuscatedName("rz")
   public static classXG method12771(classXH var0, long var1) {
      classXG[] var3 = var0.field6869;

      for (int var4 = 0; var4 < var3.length; var4++) {
         classXG var5 = var3[var4];
         if (null != var5 && -5931402327633732889L * var5.field6866 == var1) {
            return var5;
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(Lxh;J)Lxg;")
   @ObfuscatedName("cm")
   public static classXG method12772(classXH var0, long var1) {
      if (var0 == null) {
         var0.method12773(var1);
      }

      try {
         classXG[] var3 = var0.field6869;

         for (int var4 = 0; var4 < var3.length; var4++) {
            classXG var5 = var3[var4];
            if (null != var5 && -5931402327633732889L * var5.field6866 == var1) {
               return var5;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "xh.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILxs;I)V")
   @ObfuscatedName("ab")
   void method12765(int var1, PacketBuffer var2, int var3) {
      try {
         int var4 = Buffer.method13096(var2, 434878691);
         if (-1 == var4) {
            if (this.field6869[var1] != null) {
               if (var3 == 684991541) {
                  throw new IllegalStateException();
               }

               this.method12774(-38539607 * this.field6869[var1].field6864, var1, -1L);
               this.field6869[var1] = null;
            }
         } else {
            long var5;
            boolean var7;
            label64: {
               var5 = var2.method13059(2053626902);
               var7 = false;
               if (this.field6869[var1] != null) {
                  if (var3 == 684991541) {
                     throw new IllegalStateException();
                  }

                  if (var4 == -38539607 * this.field6869[var1].field6864) {
                     if (var3 == 684991541) {
                        throw new IllegalStateException();
                     }

                     if (-5931402327633732889L * this.field6869[var1].field6866 == var5) {
                        break label64;
                     }
                  }
               }

               if (this.field6869[var1] != null) {
                  if (var3 == 684991541) {
                     throw new IllegalStateException();
                  }

                  this.method12774(this.field6869[var1].field6864 * -38539607, var1, -1L);
                  this.field6869[var1] = null;
               }

               this.field6869[var1] = new classXG(var1, var4, var5);
               var7 = true;
            }

            classPC var8 = WorldView.method3717(var4, -1060823799);
            classTJ.method10856(var8.field5215, this.field6869[var1].field6862, var2, 465617240);
            classTJ.method10856(var8.field5214, this.field6869[var1].field6865, var2, -1640027915);
            classTJ.method10856(var8.field5213, this.field6869[var1].field6861, var2, 1915877480);
            if (var7) {
               if (var3 == 684991541) {
                  throw new IllegalStateException();
               }

               this.method12774(var4, var1, var5);
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "xh.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lxg;")
   @ObfuscatedName("ag")
   public classXG method12768(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 == -2059690683) {
               throw new IllegalStateException();
            }

            if (var1 < this.field6869.length) {
               if (var2 == -2059690683) {
                  throw new IllegalStateException();
               }

               return this.field6869[var1];
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "xh.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lxg;")
   @ObfuscatedName("ar")
   public classXG method12769(int var1) {
      return var1 >= 0 && var1 < this.field6869.length ? this.field6869[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(Lxs;II)V")
   @ObfuscatedName("af")
   public void method12762(PacketBuffer var1, int var2, int var3) {
      try {
         while (702114061 * var1.offset < var2) {
            if (var3 >= 111634418) {
               throw new IllegalStateException();
            }

            int var4 = Buffer.method13039(var1, -346779531);
            int var5 = var1.method13056((byte)1);
            Object var6 = null;
            switch (classBW.method1267(var5, (byte)18).field7107 * -900901303) {
               case 2:
                  var6 = var1.method13056((byte)1);
                  break;
               case 3:
                  var6 = var1.method13059(-381606880);
                  break;
               case 4:
                  var6 = var1.method13071(-996599750);
            }

            if (var4 < this.field6869.length) {
               if (var3 >= 111634418) {
                  throw new IllegalStateException();
               }

               if (this.field6869[var4] == null) {
                  if (var3 >= 111634418) {
                     throw new IllegalStateException();
                  }
               } else if (-38539607 * this.field6869[var4].field6864 == classIZ.method6339(var5, (byte)85)) {
                  int var7 = classCF.method1461(var5, (byte)67);
                  switch (classJW.method6417(var5, (byte)-33).field4861 * 33726487) {
                     case 0:
                        this.field6869[var4].field6861[var7] = var6;
                        break;
                     case 1:
                        this.field6869[var4].field6862[var7] = var6;
                        break;
                     case 2:
                        this.field6869[var4].field6865[var7] = var6;
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "xh.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxh;B)V")
   @ObfuscatedName("li")
   public static void method12755(classXH var0, byte var1) {
      if (var0 == null) {
         var0.method12757(var1);
      }

      try {
         var0.field6869 = new classXG[0];
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "xh.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIJ)V")
   @ObfuscatedName("ax")
   void method12774(int var1, int var2, long var3) {
      try {
         ScriptEvent var5 = classZS.method14182(classCA.method1392(85, -1495127640).method14145(new Object[]{var1, var2, var3}, (byte)2), (byte)102);
         classSZ.method10729(var5, -605675329);
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "xh.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)V")
   @ObfuscatedName("al")
   public void method12759(PacketBuffer var1, int var2) {
      while (702114061 * var1.offset < var2) {
         int var3 = Buffer.method13039(var1, -346779531);
         if (var3 >= this.field6869.length) {
            this.field6869 = Arrays.copyOf(this.field6869, 1 + var3);
         }

         this.method12765(var3, var1, 243159536);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)V")
   @ObfuscatedName("aj")
   public void method12760(PacketBuffer var1, int var2) {
      while (702114061 * var1.offset < var2) {
         int var3 = Buffer.method13039(var1, -346779531);
         if (var3 >= this.field6869.length) {
            this.field6869 = Arrays.copyOf(this.field6869, 1 + var3);
         }

         this.method12765(var3, var1, -1300696495);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   public void method12756() {
      this.field6869 = new classXG[0];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxh;ILxs;)V")
   @ObfuscatedName("ek")
   public static void method12766(classXH var0, int var1, PacketBuffer var2) {
      if (var0 == null) {
         var0.method12758(var2, var1, var1);
      } else {
         int var3 = Buffer.method13096(var2, 355879082);
         if (-1 == var3) {
            if (var0.field6869[var1] != null) {
               var0.method12774(-38539607 * var0.field6869[var1].field6864, var1, -1L);
               var0.field6869[var1] = null;
            }
         } else {
            long var4 = var2.method13059(2009674222);
            boolean var6 = false;
            if (var0.field6869[var1] == null
               || var3 != -38539607 * var0.field6869[var1].field6864
               || -5931402327633732889L * var0.field6869[var1].field6866 != var4) {
               if (var0.field6869[var1] != null) {
                  var0.method12774(var0.field6869[var1].field6864 * -38539607, var1, -1L);
                  var0.field6869[var1] = null;
               }

               var0.field6869[var1] = new classXG(var1, var3, var4);
               var6 = true;
            }

            classPC var7 = WorldView.method3717(var3, -2119284705);
            classTJ.method10856(var7.field5215, var0.field6869[var1].field6862, var2, -1640529127);
            classTJ.method10856(var7.field5214, var0.field6869[var1].field6865, var2, 391246397);
            classTJ.method10856(var7.field5213, var0.field6869[var1].field6861, var2, -1581915059);
            if (var6) {
               var0.method12774(var3, var1, var4);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)V")
   @ObfuscatedName("aq")
   public void method12763(PacketBuffer var1, int var2) {
      while (702114061 * var1.offset < var2) {
         int var3 = Buffer.method13039(var1, -346779531);
         int var4 = var1.method13056((byte)1);
         Object var5 = null;
         switch (classBW.method1267(var4, (byte)-20).field7107 * -900901303) {
            case 2:
               var5 = var1.method13056((byte)1);
               break;
            case 3:
               var5 = var1.method13059(2025992345);
               break;
            case 4:
               var5 = var1.method13071(141736018);
         }

         if (var3 < this.field6869.length && this.field6869[var3] != null && -38539607 * this.field6869[var3].field6864 == classIZ.method6339(var4, (byte)71)) {
            int var6 = classCF.method1461(var4, (byte)24);
            switch (classJW.method6417(var4, (byte)-61).field4861 * 33726487) {
               case 0:
                  this.field6869[var3].field6861[var6] = var5;
                  break;
               case 1:
                  this.field6869[var3].field6862[var6] = var5;
                  break;
               case 2:
                  this.field6869[var3].field6865[var6] = var5;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)V")
   @ObfuscatedName("ad")
   public void method12764(PacketBuffer var1, int var2) {
      while (702114061 * var1.offset < var2) {
         int var3 = Buffer.method13039(var1, -346779531);
         int var4 = var1.method13056((byte)1);
         Object var5 = null;
         switch (classBW.method1267(var4, (byte)-76).field7107 * -900901303) {
            case 2:
               var5 = var1.method13056((byte)1);
               break;
            case 3:
               var5 = var1.method13059(-428215676);
               break;
            case 4:
               var5 = var1.method13071(1455239792);
         }

         if (var3 < this.field6869.length && this.field6869[var3] != null && -38539607 * this.field6869[var3].field6864 == classIZ.method6339(var4, (byte)69)) {
            int var6 = classCF.method1461(var4, (byte)36);
            switch (classJW.method6417(var4, (byte)-9).field4861 * 33726487) {
               case 0:
                  this.field6869[var3].field6861[var6] = var5;
                  break;
               case 1:
                  this.field6869[var3].field6862[var6] = var5;
                  break;
               case 2:
                  this.field6869[var3].field6865[var6] = var5;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[Ljava/lang/Object;Lxs;)V")
   @ObfuscatedName("at")
   static void method12777(int[] var0, Object[] var1, PacketBuffer var2) {
      for (int var3 = 0; var3 < var0.length; var3++) {
         switch (FriendsList.method10130(var0[var3], 1275371533).field7107 * -900901303) {
            case 2:
               var1[var3] = var2.method13122((byte)-92);
               break;
            case 3:
               var1[var3] = var2.method13059(-151717911);
               break;
            case 4:
               var1[var3] = var2.method13071(60947993);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILxs;)V")
   @ObfuscatedName("au")
   void method12767(int var1, PacketBuffer var2) {
      int var3 = Buffer.method13096(var2, 305636474);
      if (-1 == var3) {
         if (this.field6869[var1] != null) {
            this.method12774(1664380055 * this.field6869[var1].field6864, var1, -1L);
            this.field6869[var1] = null;
         }
      } else {
         long var4 = var2.method13059(938244963);
         boolean var6 = false;
         if (this.field6869[var1] == null
            || var3 != -225244800 * this.field6869[var1].field6864
            || -5931402327633732889L * this.field6869[var1].field6866 != var4) {
            if (this.field6869[var1] != null) {
               this.method12774(this.field6869[var1].field6864 * -38539607, var1, -1L);
               this.field6869[var1] = null;
            }

            this.field6869[var1] = new classXG(var1, var3, var4);
            var6 = true;
         }

         classPC var7 = WorldView.method3717(var3, -428530804);
         classTJ.method10856(var7.field5215, this.field6869[var1].field6862, var2, -650852122);
         classTJ.method10856(var7.field5214, this.field6869[var1].field6865, var2, -2090636871);
         classTJ.method10856(var7.field5213, this.field6869[var1].field6861, var2, 724636172);
         if (var6) {
            this.method12774(var3, var1, var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIJ)V")
   @ObfuscatedName("ak")
   void method12775(int var1, int var2, long var3) {
      ScriptEvent var5 = classZS.method14182(classCA.method1392(85, -1964057342).method14145(new Object[]{var1, var2, var3}, (byte)2), (byte)24);
      classSZ.method10729(var5, -1505457920);
   }

   @ObfuscatedSignature(descriptor = "(IIJ)V")
   @ObfuscatedName("av")
   void method12776(int var1, int var2, long var3) {
      ScriptEvent var5 = classZS.method14182(classCA.method1392(85, -1905575321).method14145(new Object[]{var1, var2, var3}, (byte)2), (byte)25);
      classSZ.method10729(var5, -908918484);
   }

   @ObfuscatedSignature(descriptor = "(I)Lxg;")
   @ObfuscatedName("ai")
   public classXG method12770(int var1) {
      return var1 >= 0 && var1 < this.field6869.length ? this.field6869[var1] : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[Ljava/lang/Object;Lxs;)V")
   @ObfuscatedName("an")
   static void method12778(int[] var0, Object[] var1, PacketBuffer var2) {
      for (int var3 = 0; var3 < var0.length; var3++) {
         switch (FriendsList.method10130(var0[var3], 244796811).field7107 * -900901303) {
            case 2:
               var1[var3] = var2.method13122((byte)-91);
               break;
            case 3:
               var1[var3] = var2.method13059(1333766301);
               break;
            case 4:
               var1[var3] = var2.method13071(-1345780181);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("az")
   public void method12757(byte var1) {
      try {
         this.field6869 = new classXG[0];
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "xh.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(J)Lxg;")
   @ObfuscatedName("as")
   public classXG method12773(long var1) {
      try {
         classXG[] var3 = this.field6869;

         for (int var4 = 0; var4 < var3.length; var4++) {
            classXG var5 = var3[var4];
            if (null != var5 && -5931402327633732889L * var5.field6866 == var1) {
               return var5;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "xh.as(" + ')');
      }
   }
}
