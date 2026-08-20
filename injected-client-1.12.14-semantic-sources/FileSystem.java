import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("im")
public class FileSystem {
   @ObfuscatedName("av")
   static boolean FileSystem_hasPermissions = false;
   @ObfuscatedName("at")
   static File FileSystem_cacheDir;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field2517 = 16;
   @ObfuscatedName("ag")
   static Hashtable FileSystem_cacheFiles = new Hashtable(16);
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   static final int field2518 = 30;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   public static void method4918() {
      FileSystem_cacheFiles.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkm;)[[I")
   @ObfuscatedName("nu")
   public static int[][] method4917(classKM var0) {
      return var0.field3366;
   }

   FileSystem() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/io/File;)V")
   @ObfuscatedName("an")
   static void method4913(File var0) {
      FileSystem_cacheDir = var0;
      if (!FileSystem_cacheDir.exists()) {
         throw new RuntimeException("");
      } else {
         FileSystem_hasPermissions = true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/io/File;)V")
   @ObfuscatedName("ae")
   static void method4914(File var0) {
      FileSystem_cacheDir = var0;
      if (!FileSystem_cacheDir.exists()) {
         throw new RuntimeException("");
      } else {
         FileSystem_hasPermissions = true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/io/File;")
   @ObfuscatedName("aj")
   static File method4915(String var0) {
      if (!FileSystem_hasPermissions) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)FileSystem_cacheFiles.get(var0);
         if (null != var1) {
            return var1;
         } else {
            File var2 = new File(FileSystem_cacheDir, var0);
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
                  FileSystem_cacheFiles.put(var0, var2);
                  return var2;
               }
            } catch (Exception var7) {
               try {
                  if (var3 != null) {
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
   @ObfuscatedName("ak")
   public static void method4919() {
      FileSystem_cacheFiles.clear();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   public static void method4920() {
      FileSystem_cacheFiles.clear();
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   public static int method4916(int var0) {
      try {
         int var10000 = MouseHandler.MouseHandler_idleCycles += 457552751;
         client.method2433(-1);
         return var10000 * 651496335 - 1;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "im.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqn;Ljava/lang/String;B)V")
   @ObfuscatedName("hb")
   static void method4921(Archive var0, String var1, byte var2) {
      try {
         ArchiveLoader var3 = new ArchiveLoader(var0, var1);
         client.archiveLoaders.add(var3);
         client.field910 = client.field910 + var3.groupCount * 1652141001;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "im.hb(" + ')');
      }
   }
}
