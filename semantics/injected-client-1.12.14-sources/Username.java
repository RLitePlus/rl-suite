import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xv")
public class Username implements Comparable {
   @ObfuscatedName("av")
   String name;
   @ObfuscatedName("at")
   String cleanName;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("ag")
   public static AbstractArchive NpcDefinition_archive;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field6631 = 128;

   public Username(String var1) {
      this.name = var1;
      this.cleanName = PlatformInfo.method11325(var1, LoginType.oldscape, (byte)85);
   }

   @ObfuscatedSignature(descriptor = "(Lxv;B)Ljava/lang/String;")
   @ObfuscatedName("ip")
   public static String method12702(Username var0, byte var1) {
      if (var0 == null) {
         return var0.getName(var1);
      } else {
         try {
            return var0.name;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "xv.av(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("apf")
   public int method12717() {
      return null == this.cleanName ? 0 : this.cleanName.hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (var1 instanceof Username) {
            Username var2 = (Username)var1;
            if (this.cleanName == null) {
               return var2.cleanName == null;
            } else if (null == var2.cleanName) {
               return false;
            } else {
               return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName);
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xv.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;I)I")
   @ObfuscatedName("an")
   public int compareToTyped(Username var1, int var2) {
      try {
         if (null == this.cleanName) {
            if (var2 == 1238134208) {
               throw new IllegalStateException();
            } else if (null == var1.cleanName) {
               if (var2 == 1238134208) {
                  throw new IllegalStateException();
               } else {
                  return 0;
               }
            } else {
               return 1;
            }
         } else if (null == var1.cleanName) {
            if (var2 == 1238134208) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return this.cleanName.compareTo(var1.cleanName);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xv.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ap")
   public String method12703() {
      return this.name;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("dw")
   public String method12725() {
      return this.name;
   }

   @Override
   public int hashCode() {
      try {
         return null == this.cleanName ? 0 : this.cleanName.hashCode();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "xv.hashCode(" + 41);
      }
   }

   @Override
   public String toString() {
      try {
         return method12702(this, (byte)7);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "xv.toString(" + ')');
      }
   }

   @Override
   public int compareTo(Object var1) {
      try {
         return this.compareToTyped((Username)var1, -1203169992);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xv.compareTo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hw")
   public boolean method12714(Object var1) {
      if (var1 instanceof Username) {
         Username var2 = (Username)var1;
         if (this.cleanName == null) {
            return var2.cleanName == null;
         } else if (null == var2.cleanName) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName);
         }
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxv;I)Ljava/lang/String;")
   @ObfuscatedName("ef")
   public static String method12707(Username var0, int var1) {
      if (var0 == null) {
         var0.method12710(var1);
      }

      try {
         return var0.cleanName;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xv.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ag")
   public boolean hasCleanName(int var1) {
      try {
         boolean var10000;
         if (this.cleanName != null) {
            if (var1 != -698146178) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xv.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apd")
   public String method12718() {
      return method12702(this, (byte)-34);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ei")
   public String method12726() {
      return this.cleanName;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("he")
   public boolean method12715(Object var1) {
      if (var1 instanceof Username) {
         Username var2 = (Username)var1;
         if (this.cleanName == null) {
            return var2.cleanName == null;
         } else if (null == var2.cleanName) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName);
         }
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method12716(Object var1) {
      if (var1 instanceof Username) {
         Username var2 = (Username)var1;
         if (this.cleanName == null) {
            return var2.cleanName == null;
         } else if (null == var2.cleanName) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName);
         }
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apc")
   public String method12719() {
      return method12702(this, (byte)-109);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxv;Lxv;)I")
   @ObfuscatedName("kq")
   public static int method12722(Username var0, Username var1) {
      if (null == var0.cleanName) {
         return null == var1.cleanName ? 0 : 1;
      } else {
         return null == var1.cleanName ? -1 : var0.cleanName.compareTo(var1.cleanName);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)I")
   @ObfuscatedName("aj")
   public int method12724(Object var1) {
      return this.compareToTyped((Username)var1, -657501583);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ak")
   public String method12704() {
      return this.name;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("aw")
   public String method12705() {
      return this.name;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apr")
   public String method12720() {
      return method12702(this, (byte)6);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ay")
   public String method12708() {
      return this.cleanName;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("au")
   public String method12709() {
      return this.cleanName;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("az")
   public boolean method12712() {
      return this.cleanName != null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   public boolean method12713() {
      return this.cleanName != null;
   }

   public Username(String var1, LoginType var2) {
      this.name = var1;
      this.cleanName = PlatformInfo.method11325(var1, var2, (byte)-6);
   }

   @ObfuscatedSignature(descriptor = "(Lxv;)I")
   @ObfuscatedName("as")
   public int method12723(Username var1) {
      if (null == this.cleanName) {
         return null == var1.cleanName ? 0 : 1;
      } else {
         return null == var1.cleanName ? -1 : this.cleanName.compareTo(var1.cleanName);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("av")
   public String getName(byte var1) {
      try {
         return this.name;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xv.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("at")
   public String method12710(int var1) {
      try {
         return this.name;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xv.at(" + ')');
      }
   }
}
