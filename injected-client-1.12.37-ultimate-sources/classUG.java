import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ug")
public class classUG {
   @ObfuscatedSignature(descriptor = "Luz;")
   @ObfuscatedName("af")
   public classUZ field6307;
   @ObfuscatedSignature(descriptor = "Lul;")
   @ObfuscatedName("az")
   public classUL field6305 = new classUL();
   @ObfuscatedSignature(descriptor = "Luz;")
   @ObfuscatedName("ae")
   public classUZ field6306;
   @ToRemove(unused = "true")
   @ObfuscatedName("cq")
   static final int field6308 = 111;
   @ObfuscatedName("ag")
   static final int field6303 = 660588080;
   @ObfuscatedName("as")
   static int field6302 = 0;
   @ObfuscatedSignature(descriptor = "[Lug;")
   @ObfuscatedName("ab")
   static final classUG[] field6304 = new classUG[980706635 * field6303];

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lug;)Ljava/lang/String;")
   @ObfuscatedName("sv")
   public static String method11310(classUG var0) {
      if (var0 == null) {
         var0.method11309();
      }

      return "[" + var0.field6305.toString() + "|" + var0.field6307.toString() + "|" + var0.field6306.toString() + "]";
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lug;)I")
   @ObfuscatedName("hi")
   public static int method11315(classUG var0) {
      if (var0 == null) {
         var0.method11323();
      }

      int var1 = 1943928421;
      int var2 = 1;
      var2 = var2 * 31 + var0.field6305.hashCode();
      var2 = var2 * 1138499505 + var0.field6307.hashCode();
      return 31 * var2 + var0.field6306.hashCode();
   }

   @Override
   public int hashCode() {
      try {
         byte var1 = 31;
         int var2 = 1;
         var2 = var2 * 31 + this.field6305.hashCode();
         var2 = var2 * 31 + this.field6307.hashCode();
         return 31 * var2 + this.field6306.hashCode();
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ug.hashCode(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public void method11306(int var1) {
      try {
         synchronized (field6304) {
            if (492103913 * field6302 < field6303 * 980706635) {
               if (var1 >= 1618312660) {
                  throw new IllegalStateException();
               }

               field6304[(field6302 += 1775136601) * 492103913 - 1] = this;
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ug.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   void method11308(int var1) {
      try {
         classUL.method11377(this.field6305, 561192176);
         this.field6307.method11738(-1974382800);
         this.field6306.field6427 = 1.0F;
         this.field6306.field6425 = 1.0F;
         this.field6306.field6426 = 1.0F;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ug.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldj;)V")
   @ObfuscatedName("qc")
   public static void method11305(classDJ var0) {
      var0.field1522.method8151();
      var0.field1521 = 0;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gi")
   public String method11311() {
      return "[" + this.field6305.toString() + "|" + this.field6307.toString() + "|" + this.field6306.toString() + "]";
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lug;")
   @ObfuscatedName("ax")
   public static classUG method11300() {
      synchronized (field6304) {
         if (0 == field6302 * 492103913) {
            return new classUG();
         } else {
            field6304[(field6302 -= 1775136601) * 492103913].method11308(968854401);
            return field6304[field6302 * 492103913];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lez;)V")
   @ObfuscatedName("zr")
   public static void method11320(classEZ var0) {
      if (var0 == null) {
         var0.method4130();
      }

      var0.field2064 = -1;
      var0.field2151 = null;
   }

   classUG() {
      this.field6307 = new classUZ();
      this.field6306 = new classUZ(1.0F, 1.0F, 1.0F);
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (var1 == null) {
            return false;
         } else if (this == var1) {
            return true;
         } else if (!(var1 instanceof classUG)) {
            return false;
         } else {
            classUG var2 = (classUG)var1;
            return this.field6305.equals(var2.field6305)
               && classUZ.method11742(this.field6307, var2.field6307, (byte)36)
               && classUZ.method11742(this.field6306, var2.field6306, (byte)-69);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ug.equals(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lug;Ljava/lang/Object;)Z")
   @ObfuscatedName("hy")
   public static boolean method11313(classUG var0, Object var1) {
      if (var0 == null) {
         var0.method11314(var1);
      }

      if (var1 == null) {
         return false;
      } else if (var0 == var1) {
         return true;
      } else if (!(var1 instanceof classUG)) {
         return false;
      } else {
         classUG var2 = (classUG)var1;
         return var0.field6305.equals(var2.field6305)
            && classUZ.method11742(var0.field6307, var2.field6307, (byte)27)
            && classUZ.method11742(var0.field6306, var2.field6306, (byte)10);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jr")
   public boolean method11314(Object var1) {
      if (var1 == null) {
         return false;
      } else if (this == var1) {
         return true;
      } else if (!(var1 instanceof classUG)) {
         return false;
      } else {
         classUG var2 = (classUG)var1;
         return this.field6305.equals(var2.field6305)
            && classUZ.method11742(this.field6307, var2.field6307, (byte)64)
            && classUZ.method11742(this.field6306, var2.field6306, (byte)-88);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lug;)V")
   @ObfuscatedName("su")
   public static void method11307(classUG var0) {
      if (var0 == null) {
         var0.method11323();
      } else {
         synchronized (field6304) {
            if (492103913 * field6302 < field6303 * 980706635) {
               field6304[(field6302 += 1775136601) * 492103913 - 1] = var0;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afh")
   public int method11316() {
      int var1 = 463694583;
      int var2 = 1;
      var2 = var2 * -582685269 + this.field6305.hashCode();
      var2 = var2 * 26118768 + this.field6307.hashCode();
      return -1449515366 * var2 + this.field6306.hashCode();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afe")
   public int method11317() {
      byte var1 = 31;
      int var2 = 1;
      var2 = var2 * 31 + this.field6305.hashCode();
      var2 = var2 * 31 + this.field6307.hashCode();
      return 31 * var2 + this.field6306.hashCode();
   }

   @ObfuscatedSignature(descriptor = "(II)Lsn;")
   @ObfuscatedName("ab")
   public static classSN method11321(int var0, int var1) {
      try {
         classSN var2 = (classSN)classOU.field5144.method6422(var0);
         if (null != var2) {
            return var2;
         } else {
            var2 = classMB.method7509(classGN.field2633, classIY.field3099, var0, -1929466463);
            if (var2 != null) {
               classOU.field5144.method6428(var2, var0);
            }

            return var2;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ug.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpv;)V")
   @ObfuscatedName("ai")
   public static void method11319(classPV var0) {
      if (var0 == null) {
         var0.method9297();
      }

      var0.field5427 += 638451616;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lug;)Ljava/lang/String;")
   @ObfuscatedName("hd")
   public static String method11312(classUG var0) {
      if (var0 == null) {
         var0.method11318();
      }

      return "[" + var0.field6305.toString() + "|" + var0.field6307.toString() + "|" + var0.field6306.toString() + "]";
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxs;Lyt;)V")
   @ObfuscatedName("vn")
   public static void method11304(classXS var0, classYT var1) {
      if (var0 == null) {
         var0.method12904();
      }

      var0.field6929 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lug;")
   @ObfuscatedName("ab")
   public static classUG method11301() {
      synchronized (field6304) {
         if (0 == field6302 * -716979174) {
            return new classUG();
         } else {
            field6304[(field6302 -= 1775136601) * 492103913].method11308(1115923696);
            return field6304[field6302 * 1495403731];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lug;")
   @ObfuscatedName("ag")
   public static classUG method11302() {
      synchronized (field6304) {
         if (0 == field6302 * 492103913) {
            return new classUG();
         } else {
            field6304[(field6302 -= 1775136601) * 492103913].method11308(1949189705);
            return field6304[field6302 * 492103913];
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lug;")
   @ObfuscatedName("as")
   public static classUG method11303() {
      synchronized (field6304) {
         if (0 == field6302 * 933579665) {
            return new classUG();
         } else {
            field6304[(field6302 -= 1982063216) * -1237855958].method11308(1422225741);
            return field6304[field6302 * 492103913];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lug;")
   @ObfuscatedName("dt")
   public static classUG method11322() {
      return classMQ.method7640(-989125358);
   }

   @Override
   public String toString() {
      try {
         return "[" + this.field6305.toString() + "|" + this.field6307.toString() + "|" + this.field6306.toString() + "]";
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "ug.toString(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   void method11309() {
      classUL.method11377(this.field6305, -1306624059);
      this.field6307.method11738(-151411178);
      this.field6306.field6427 = 1.0F;
      this.field6306.field6425 = 1.0F;
      this.field6306.field6426 = 1.0F;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fv")
   public void method11323() {
      this.method11306(-428825938);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("afr")
   public int method11318() {
      byte var1 = 31;
      int var2 = 1;
      var2 = var2 * 31 + this.field6305.hashCode();
      var2 = var2 * 31 + this.field6307.hashCode();
      return 31 * var2 + this.field6306.hashCode();
   }
}
