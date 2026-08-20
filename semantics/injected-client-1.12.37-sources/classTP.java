import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tp")
public class classTP {
   @ObfuscatedName("ac")
   int field6182;
   @ObfuscatedName("gd")
   public boolean field6180;
   @ObfuscatedName("nj")
   public static boolean field6186;
   @ObfuscatedName("lq")
   public static boolean field6185;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field6184 = 0;
   @ObfuscatedName("ax")
   int field6181;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field6183 = 1;

   classTP(int var1, int var2) {
      this.field6180 = field6186;
      this.field6181 = 937813429 * var1;
      this.field6182 = -2099811167 * var2;
   }

   @ObfuscatedSignature(descriptor = "(Ltl;I)Z")
   @ObfuscatedName("az")
   boolean method10938(classTL var1, int var2) {
      this.method10942(var1);

      try {
         if (var1 == null) {
            if (var2 != -160021231) {
               throw new IllegalStateException();
            } else {
               this.method10941(var1);
               return false;
            }
         } else {
            switch (this.field6181 * -850550627) {
               case 1:
                  boolean var6 = var1.vmethod446(this.field6182 * 876705633, (byte)2);
                  this.method10941(var1);
                  return var6;
               case 2:
                  boolean var5 = var1.vmethod447(876705633 * this.field6182, (byte)1);
                  this.method10941(var1);
                  return var5;
               case 3:
                  boolean var4 = var1.vmethod448((char)(this.field6182 * 876705633), 1791336663);
                  this.method10941(var1);
                  return var4;
               case 4:
                  boolean var10001;
                  if (1 == this.field6182 * 876705633) {
                     if (var2 != -160021231) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  boolean var10000 = var1.vmethod444(var10001, -85125777);
                  this.method10941(var1);
                  return var10000;
               default:
                  this.method10941(var1);
                  return false;
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "tp.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltl;)Z")
   @ObfuscatedName("af")
   boolean method10939(classTL var1) {
      if (var1 == null) {
         return false;
      } else {
         switch (this.field6181 * -850550627) {
            case 1:
               return var1.vmethod446(this.field6182 * 876705633, (byte)2);
            case 2:
               return var1.vmethod447(876705633 * this.field6182, (byte)1);
            case 3:
               return var1.vmethod448((char)(this.field6182 * 876705633), 1791336663);
            case 4:
               return var1.vmethod444(1 == this.field6182 * 876705633, 488570365);
            default:
               return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltl;)V")
   @ObfuscatedName("jf")
   public void method10941(classTL var1) {
      field6185 = false;
   }

   @ObfuscatedSignature(descriptor = "(Ltl;)V")
   @ObfuscatedName("ni")
   public void method10942(classTL var1) {
      field6185 = this.field6180;
   }

   @ObfuscatedSignature(descriptor = "(Ltl;)Z")
   @ObfuscatedName("ae")
   boolean method10940(classTL var1) {
      if (var1 == null) {
         return false;
      } else {
         switch (this.field6181 * -850550627) {
            case 1:
               return var1.vmethod446(this.field6182 * 876705633, (byte)2);
            case 2:
               return var1.vmethod447(876705633 * this.field6182, (byte)1);
            case 3:
               return var1.vmethod448((char)(this.field6182 * 876705633), 1791336663);
            case 4:
               return var1.vmethod444(1 == this.field6182 * 876705633, -211541371);
            default:
               return false;
         }
      }
   }
}
