import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mt")
public class classMT {
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field4583 = 29;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field4582 = 1;
   @ObfuscatedName("ae")
   static Hashtable field4581 = new Hashtable(16);
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field4584 = 3;
   @ObfuscatedName("af")
   static File field4586;
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   static final int field4585 = 1076101600;
   @ObfuscatedName("az")
   static boolean field4580 = false;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   public static void method7684() {
      field4581.clear();
   }

   @ObfuscatedSignature(descriptor = "(B)Lqo;")
   @ObfuscatedName("af")
   static classQO method7688(byte var0) {
      try {
         return new classQO();
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "mt.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/io/File;")
   @ObfuscatedName("ab")
   static File method7681(String var0) {
      if (!field4580) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)field4581.get(var0);
         if (null != var1) {
            return var1;
         } else {
            File var2 = new File(field4586, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if (!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  field4581.put(var0, var2);
                  return var2;
               }
            } catch (Exception var7) {
               try {
                  if (null != var3) {
                     var3.close();
                     Object var8 = null;
                  }
               } catch (Exception var6) {
               }

               throw new RuntimeException();
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;)Lfx;")
   @ObfuscatedName("gc")
   public static Model method7690(ModelData var0) {
      if (var0 == null) {
         var0.getVerticesY();
      }

      return var0.method4045(-890625137, 43690, 0, -1, 0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/io/File;")
   @ObfuscatedName("ae")
   static File method7682(String var0) {
      if (!field4580) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)field4581.get(var0);
         if (null != var1) {
            return var1;
         } else {
            File var2 = new File(field4586, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if (!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  field4581.put(var0, var2);
                  return var2;
               }
            } catch (Exception var7) {
               try {
                  if (null != var3) {
                     var3.close();
                     Object var8 = null;
                  }
               } catch (Exception var6) {
               }

               throw new RuntimeException();
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   public static void method7685() {
      field4581.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ler;)V")
   @ObfuscatedName("ey")
   public static void method7689(ModelData var0) {
      if (var0 == null) {
         var0.getFaceIndices2();
      }

      for (int var1 = 0; var1 < var0.field1848; var1++) {
         int var2 = (int)var0.field1855[var1];
         var0.field1855[var1] = var0.field1857[var1];
         var0.field1857[var1] = -var2;
      }

      var0.method4018();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   public static void method7686() {
      field4581.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public static void method7687() {
      field4581.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/io/File;")
   @ObfuscatedName("ag")
   static File method7683(String var0) {
      if (!field4580) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)field4581.get(var0);
         if (null != var1) {
            return var1;
         } else {
            File var2 = new File(field4586, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if (!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  field4581.put(var0, var2);
                  return var2;
               }
            } catch (Exception var7) {
               try {
                  if (null != var3) {
                     var3.close();
                     Object var8 = null;
                  }
               } catch (Exception var6) {
               }

               throw new RuntimeException();
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;II)V")
   @ObfuscatedName("ai")
   static final void method7691(Widget var0, int var1, int var2) {
      try {
         if (null == var0.field4312) {
            if (var2 <= 2040728650) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException();
            }
         } else {
            if (var0.field4404 == null) {
               if (var2 <= 2040728650) {
                  return;
               }

               var0.field4404 = new int[var0.field4312.length];
            }

            var0.field4404[var1] = Integer.MAX_VALUE;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "mt.ai(" + ')');
      }
   }

   classMT() throws Throwable {
      throw new Error();
   }
}
