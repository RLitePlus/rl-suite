import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aae")
public class classAAE implements Comparable {
   @ObfuscatedName("az")
   String field41;
   @ObfuscatedName("af")
   String field42;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field43 = 1;

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ay")
   public boolean method170() {
      return this.field41 != null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("xe")
   public String method185() {
      return this.field41;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("af")
   public String method166(int var1) {
      try {
         return this.field41;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "aae.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gd")
   public String method179() {
      return this.method164(556080291);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   public boolean method171(int var1) {
      try {
         boolean var10000;
         if (this.field41 != null) {
            if (var1 <= -947621106) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "aae.ab(" + ')');
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (var1 instanceof classAAE) {
            classAAE var2 = (classAAE)var1;
            if (this.field41 == null) {
               return null == var2.field41;
            } else if (null == var2.field41) {
               return false;
            } else {
               return this.hashCode() != var2.hashCode() ? false : this.field41.equals(var2.field41);
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "aae.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method184(Object var1) {
      return method182(this, (classAAE)var1, 1600959519);
   }

   @Override
   public String toString() {
      try {
         return this.method164(1585434746);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "aae.toString(" + ')');
      }
   }

   @Override
   public int hashCode() {
      try {
         return null == this.field41 ? 0 : this.field41.hashCode();
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "aae.hashCode(" + 41);
      }
   }

   @Override
   public int compareTo(Object var1) {
      try {
         return method182(this, (classAAE)var1, 1600959519);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "aae.compareTo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gi")
   public String method180() {
      return this.method164(1165451519);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aj")
   public boolean method172() {
      return this.field41 != null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jl")
   public boolean method174(Object var1) {
      if (var1 instanceof classAAE) {
         classAAE var2 = (classAAE)var1;
         if (this.field41 == null) {
            return null == var2.field41;
         } else if (null == var2.field41) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.field41.equals(var2.field41);
         }
      } else {
         return false;
      }
   }

   public classAAE(String var1) {
      this.field42 = var1;
      this.field41 = classBW.method1260(var1, classAAO.field79, -2140318512);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afr")
   public int method177() {
      return null == this.field41 ? 0 : this.field41.hashCode();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laae;Ljava/lang/Object;)Z")
   @ObfuscatedName("oz")
   public static boolean method175(classAAE var0, Object var1) {
      if (var0 == null) {
         return var0.method176(var1);
      } else if (var1 instanceof classAAE) {
         classAAE var2 = (classAAE)var1;
         if (var0.field41 == null) {
            return null == var2.field41;
         } else if (null == var2.field41) {
            return false;
         } else {
            return var0.hashCode() != var2.hashCode() ? false : var0.field41.equals(var2.field41);
         }
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("un")
   public String method186() {
      return this.field42;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afs")
   public int method178() {
      return null == this.field41 ? 0 : this.field41.hashCode();
   }

   public classAAE(String var1, classAAO var2) {
      this.field42 = var1;
      this.field41 = classBW.method1260(var1, var2, -1490299890);
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("az")
   public String method164(int var1) {
      try {
         return this.field42;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "aae.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ax")
   public String method165() {
      return this.field42;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ac")
   public String method167() {
      return this.field41;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("al")
   public String method168() {
      return this.field41;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   public boolean method173() {
      return this.field41 != null;
   }

   @ObfuscatedSignature(descriptor = "(Laae;)I")
   @ObfuscatedName("ap")
   public int method181(classAAE var1) {
      if (null == this.field41) {
         return null == var1.field41 ? 0 : 1;
      } else {
         return var1.field41 == null ? -1 : this.field41.compareTo(var1.field41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jr")
   public boolean method176(Object var1) {
      if (var1 instanceof classAAE) {
         classAAE var2 = (classAAE)var1;
         if (this.field42 == null) {
            return null == var2.field41;
         } else if (null == var2.field41) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.field42.equals(var2.field41);
         }
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ao")
   public String method169() {
      return this.field42;
   }

   @ObfuscatedSignature(descriptor = "(Laae;Laae;I)I")
   @ObfuscatedName("hs")
   public static int method182(classAAE var0, classAAE var1, int var2) {
      if (var0 == null) {
         return var0.method183(var0, var2);
      } else {
         try {
            if (null == var0.field41) {
               if (var2 != 1600959519) {
                  throw new IllegalStateException();
               } else {
                  return null == var1.field41 ? 0 : 1;
               }
            } else if (var1.field41 == null) {
               if (var2 != 1600959519) {
                  throw new IllegalStateException();
               } else {
                  return -1;
               }
            } else {
               return var0.field41.compareTo(var1.field41);
            }
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "aae.ag(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Laae;I)I")
   @ObfuscatedName("ag")
   public int method183(classAAE var1, int var2) {
      try {
         if (null == this.field42) {
            if (var2 != 1600959519) {
               throw new IllegalStateException();
            } else {
               return null == var1.field41 ? 0 : 1;
            }
         } else if (var1.field41 == null) {
            if (var2 != 1600959519) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return this.field41.compareTo(var1.field42);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "aae.ag(" + 41);
      }
   }
}
