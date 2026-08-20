import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aam")
public class classAAM {
   @ObfuscatedName("ax")
   final int field60;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field75 = 5;
   @ObfuscatedName("as")
   final int field72 = 3;
   @ObfuscatedName("al")
   public int field64;
   @ObfuscatedName("ac")
   public final int[][] field62;
   @ObfuscatedName("aa")
   public int field61;
   @ObfuscatedName("ao")
   public int field63;
   @ObfuscatedName("aq")
   public int field67;
   @ObfuscatedName("ar")
   public int field70;
   @ObfuscatedName("ay")
   public int field66;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field76 = 3;
   @ObfuscatedName("ad")
   public int field68;
   @ObfuscatedName("ap")
   public int field69;
   @ObfuscatedName("au")
   public int field73;
   @ObfuscatedName("ai")
   public int field71;
   @ObfuscatedName("aj")
   public int field65;
   @ObfuscatedName("aw")
   public int field74;
   @ObfuscatedName("ak")
   public int field59;

   public classAAM() {
      this.field60 = 5;
      this.field62 = new int[3][5];
      this.field61 = 1341066909;
      this.field63 = -490970771;
      this.field64 = 1234583629;
      this.field65 = 613231765;
      this.field66 = 1903416019;
      this.field67 = -1994980579;
      this.field68 = 1871315217;
      this.field69 = 1305955669;
      this.field73 = -1371129297;
      this.field71 = -1405701505;
      this.field70 = -533723561;
      this.field74 = 2041856481;
      this.field59 = 2075654969;
   }

   @ObfuscatedSignature(descriptor = "(Lva;I)V")
   @ObfuscatedName("az")
   public void method223(classVA var1, int var2) {
      try {
         byte[] var3 = classVA.method11814(var1, -523235161 * classAAK.field55.field53, 421238328);
         classXY var4 = new classXY(var3);

         while (true) {
            int var5 = classXY.method13039(var4, -346779531);
            if (var5 == 0) {
               if (var2 == -1906292819) {
                  throw new IllegalStateException();
               }

               return;
            }

            switch (var5) {
               case 1:
                  var4.method13051(-758448158);
                  break;
               case 2:
                  this.field61 = classXY.method13110(var4, -324749371) * -1341066909;
                  this.field63 = classXY.method13110(var4, -324749371) * 490970771;
                  this.field64 = classXY.method13110(var4, -324749371) * -1234583629;
                  this.field65 = classXY.method13110(var4, -324749371) * -613231765;
                  this.field66 = classXY.method13110(var4, -324749371) * -1903416019;
                  this.field67 = classXY.method13110(var4, -324749371) * 1994980579;
                  this.field68 = classXY.method13110(var4, -324749371) * -1871315217;
                  this.field69 = classXY.method13110(var4, -324749371) * -1305955669;
                  this.field73 = classXY.method13110(var4, -324749371) * 1371129297;
                  this.field71 = classXY.method13110(var4, -324749371) * 1405701505;
                  this.field70 = classXY.method13110(var4, -324749371) * 533723561;
                  break;
               case 3:
                  for (int var6 = 0; var6 < this.field62.length; var6++) {
                     if (var2 == -1906292819) {
                        throw new IllegalStateException();
                     }

                     for (int var7 = 0; var7 < this.field62[var6].length; var7++) {
                        if (var2 == -1906292819) {
                           return;
                        }

                        this.field62[var6][var7] = var4.method13051(-758448158);
                     }
                  }
               case 4:
               default:
                  break;
               case 5:
                  this.field74 = var4.method13117(classXM.field6888.field6890, 1519469817) * -2041856481;
                  this.field59 = var4.method13117(classXM.field6888.field6890, 1599350587) * -2075654969;
                  break;
               case 6:
                  this.field61 = classXY.method13110(var4, -324749371) * -1341066909;
                  this.field63 = classXY.method13110(var4, -324749371) * 490970771;
                  this.field64 = classXY.method13110(var4, -324749371) * -1234583629;
                  this.field65 = classXY.method13110(var4, -324749371) * -613231765;
                  this.field66 = classXY.method13110(var4, -324749371) * -1903416019;
                  this.field67 = classXY.method13110(var4, -324749371) * 1994980579;
                  this.field68 = classXY.method13110(var4, -324749371) * -1871315217;
                  this.field69 = classXY.method13110(var4, -324749371) * -1305955669;
                  this.field73 = classXY.method13110(var4, -324749371) * 1371129297;
                  this.field71 = classXY.method13110(var4, -324749371) * 1405701505;
                  this.field70 = classXY.method13110(var4, -324749371) * 533723561;
                  classXY.method13110(var4, -324749371);
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "aam.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("ae")
   public void method224(classVA var1) {
      byte[] var2 = classVA.method11814(var1, -523235161 * classAAK.field55.field53, -1979103039);
      classXY var3 = new classXY(var2);

      while (true) {
         int var4 = classXY.method13039(var3, -346779531);
         if (var4 == 0) {
            return;
         }

         switch (var4) {
            case 1:
               var3.method13051(-758448158);
               break;
            case 2:
               this.field61 = classXY.method13110(var3, -324749371) * -1341066909;
               this.field63 = classXY.method13110(var3, -324749371) * 1330623206;
               this.field64 = classXY.method13110(var3, -324749371) * 1911645448;
               this.field65 = classXY.method13110(var3, -324749371) * -2138418392;
               this.field66 = classXY.method13110(var3, -324749371) * -401029796;
               this.field67 = classXY.method13110(var3, -324749371) * 1037226261;
               this.field68 = classXY.method13110(var3, -324749371) * 511724201;
               this.field69 = classXY.method13110(var3, -324749371) * -1133103025;
               this.field73 = classXY.method13110(var3, -324749371) * -518063482;
               this.field71 = classXY.method13110(var3, -324749371) * -1869686950;
               this.field70 = classXY.method13110(var3, -324749371) * 533723561;
               break;
            case 3:
               for (int var5 = 0; var5 < this.field62.length; var5++) {
                  for (int var6 = 0; var6 < this.field62[var5].length; var6++) {
                     this.field62[var5][var6] = var3.method13051(-758448158);
                  }
               }
            case 4:
            default:
               break;
            case 5:
               this.field74 = var3.method13117(classXM.field6888.field6890, 1700611882) * -2041856481;
               this.field59 = var3.method13117(classXM.field6888.field6890, 2039498273) * 1827060224;
               break;
            case 6:
               this.field61 = classXY.method13110(var3, -324749371) * -1251906261;
               this.field63 = classXY.method13110(var3, -324749371) * 490970771;
               this.field64 = classXY.method13110(var3, -324749371) * -1234583629;
               this.field65 = classXY.method13110(var3, -324749371) * 569889985;
               this.field66 = classXY.method13110(var3, -324749371) * -1903416019;
               this.field67 = classXY.method13110(var3, -324749371) * -611610010;
               this.field68 = classXY.method13110(var3, -324749371) * -1871315217;
               this.field69 = classXY.method13110(var3, -324749371) * -1305955669;
               this.field73 = classXY.method13110(var3, -324749371) * 686110359;
               this.field71 = classXY.method13110(var3, -324749371) * 1405701505;
               this.field70 = classXY.method13110(var3, -324749371) * 533723561;
               classXY.method13110(var3, -324749371);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("af")
   public void method225(classVA var1) {
      byte[] var2 = classVA.method11814(var1, -523235161 * classAAK.field55.field53, 1369586842);
      classXY var3 = new classXY(var2);

      while (true) {
         int var4 = classXY.method13039(var3, -346779531);
         if (var4 == 0) {
            return;
         }

         switch (var4) {
            case 1:
               var3.method13051(-758448158);
               break;
            case 2:
               this.field61 = classXY.method13110(var3, -324749371) * -1341066909;
               this.field63 = classXY.method13110(var3, -324749371) * 490970771;
               this.field64 = classXY.method13110(var3, -324749371) * -1234583629;
               this.field65 = classXY.method13110(var3, -324749371) * -613231765;
               this.field66 = classXY.method13110(var3, -324749371) * -1903416019;
               this.field67 = classXY.method13110(var3, -324749371) * 1994980579;
               this.field68 = classXY.method13110(var3, -324749371) * -1871315217;
               this.field69 = classXY.method13110(var3, -324749371) * -1305955669;
               this.field73 = classXY.method13110(var3, -324749371) * 1371129297;
               this.field71 = classXY.method13110(var3, -324749371) * 1405701505;
               this.field70 = classXY.method13110(var3, -324749371) * 533723561;
               break;
            case 3:
               for (int var5 = 0; var5 < this.field62.length; var5++) {
                  for (int var6 = 0; var6 < this.field62[var5].length; var6++) {
                     this.field62[var5][var6] = var3.method13051(-758448158);
                  }
               }
            case 4:
            default:
               break;
            case 5:
               this.field74 = var3.method13117(classXM.field6888.field6890, 2094660938) * -2041856481;
               this.field59 = var3.method13117(classXM.field6888.field6890, 1676526752) * -2075654969;
               break;
            case 6:
               this.field61 = classXY.method13110(var3, -324749371) * -1341066909;
               this.field63 = classXY.method13110(var3, -324749371) * 490970771;
               this.field64 = classXY.method13110(var3, -324749371) * -1234583629;
               this.field65 = classXY.method13110(var3, -324749371) * -613231765;
               this.field66 = classXY.method13110(var3, -324749371) * -1903416019;
               this.field67 = classXY.method13110(var3, -324749371) * 1994980579;
               this.field68 = classXY.method13110(var3, -324749371) * -1871315217;
               this.field69 = classXY.method13110(var3, -324749371) * -1305955669;
               this.field73 = classXY.method13110(var3, -324749371) * 1371129297;
               this.field71 = classXY.method13110(var3, -324749371) * 1405701505;
               this.field70 = classXY.method13110(var3, -324749371) * 533723561;
               classXY.method13110(var3, -324749371);
         }
      }
   }
}
