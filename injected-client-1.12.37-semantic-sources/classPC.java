import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pc")
public class classPC extends classVJ {
   @ObfuscatedName("as")
   public final int[] field5215;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field5220 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field5221 = 7;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ag")
   static EvictingDualNodeHashTable field5219 = new EvictingDualNodeHashTable(8);
   @ObfuscatedName("ax")
   public final int[] field5214;
   @ObfuscatedName("ac")
   public final int[] field5213;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ab")
   public static AbstractArchive field5222;
   @ObfuscatedName("aa")
   public final Object[] field5216;
   @ObfuscatedName("ao")
   public final Object[] field5217;
   @ObfuscatedName("al")
   public final Object[] field5218;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpc;")
   @ObfuscatedName("ae")
   public static classPC method8836(int var0) {
      classPC var1 = (classPC)field5219.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = field5222.method11867(75, var0, -1924681401);
         var1 = new classPC(new classXY(var2), var0);
         field5219.method6428(var1, var0);
         return var1;
      }
   }

   classPC(classXY var1, int var2) {
      int[] var3 = new int[0];
      int[] var4 = new int[0];
      int[] var5 = new int[0];
      Object[] var6 = new Object[0];
      Object[] var7 = new Object[0];
      Object[] var8 = new Object[0];
      if (var1 != null && var1.field6954 != null) {
         label60:
         while (true) {
            int var9 = classXY.method13039(var1, -346779531);
            switch (var9) {
               case 0:
                  break label60;
               case 7:
                  var3 = new int[classXY.method13047(var1, -394615724)];
                  var6 = new Object[var3.length];

                  for (int var12 = 0; var12 < var3.length; var12++) {
                     var3[var12] = classXY.method13102(var1, (byte)46);
                     var6[var12] = FriendsList.method10130(var3[var12], 677004428).method13787(var1, 827988912);
                  }
                  break;
               case 8:
                  var4 = new int[classXY.method13047(var1, -1086424955)];
                  var7 = new Object[var4.length];

                  for (int var11 = 0; var11 < var4.length; var11++) {
                     var4[var11] = classXY.method13102(var1, (byte)37);
                     var7[var11] = FriendsList.method10130(var4[var11], 265449944).method13787(var1, 827988912);
                  }
                  break;
               case 11:
                  var5 = new int[classXY.method13047(var1, -1443937456)];
                  var8 = new Object[var5.length];

                  for (int var10 = 0; var10 < var5.length; var10++) {
                     var5[var10] = classXY.method13102(var1, (byte)23);
                     var8[var10] = FriendsList.method10130(var5[var10], 1939035565).method13787(var1, 827988912);
                  }
            }
         }
      }

      this.field5215 = var3;
      this.field5214 = var4;
      this.field5213 = var5;
      this.field5216 = var6;
      this.field5217 = var7;
      this.field5218 = var8;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lpc;")
   @ObfuscatedName("ab")
   public static classPC method8837(int var0) {
      classPC var1 = (classPC)field5219.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = field5222.method11867(75, var0, -619608434);
         var1 = new classPC(new classXY(var2), var0);
         field5219.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   public static void method8838() {
      EvictingDualNodeHashTable.method6431(field5219);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public static void method8839() {
      EvictingDualNodeHashTable.method6431(field5219);
   }

   @ObfuscatedSignature(descriptor = "(ILky;ZI)V")
   @ObfuscatedName("ck")
   static void method8841(int var0, classKY var1, boolean var2, int var3) {
      try {
         WorldMap var4 = classIO.method6230((byte)-93);
         WorldMapArea var5 = var4.method12486(var0, 1778951456);
         classKY var6 = classOA.method8290(1544651080);
         var4.method12441(var5, var6, var1, var2, (byte)87);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "pc.ck(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvp;Ljava/lang/String;I)V")
   @ObfuscatedName("aa")
   static void method8840(classVP var0, String var1, int var2) {
      try {
         classDT var3 = new classDT(var0, var1);
         client.field1002.add(var3);
         client.field1004 = client.field1004 + var3.field1626 * 2074986393;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "pc.aa(" + ')');
      }
   }
}
