import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xc")
public class classXC {
   @ObfuscatedName("ae")
   HashMap field6823;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("af")
   AbstractArchive field6824;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("az")
   AbstractArchive field6822;
   @ObfuscatedSignature(descriptor = "Lav;")
   @ObfuscatedName("ad")
   public static classAV field6825;

   @ObfuscatedSignature(descriptor = "([Lxj;)Ljava/util/HashMap;")
   @ObfuscatedName("ae")
   public HashMap method12742(classXJ[] var1) {
      HashMap var2 = new HashMap();
      classXJ[] var3 = var1;

      for (int var4 = 0; var4 < var3.length; var4++) {
         classXJ var5 = var3[var4];
         if (this.field6823.containsKey(var5)) {
            var2.put(var5, this.field6823.get(var5));
         } else {
            Font var6 = classCU.method2675(this.field6822, this.field6824, var5.field6880, "", -2045331213);
            if (null != var6) {
               this.field6823.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxc;[Lxj;)Ljava/util/HashMap;")
   @ObfuscatedName("jf")
   public static HashMap method12743(classXC var0, classXJ[] var1) {
      if (var0 == null) {
         var0.method12746(var1);
      }

      HashMap var2 = new HashMap();
      classXJ[] var3 = var1;

      for (int var4 = 0; var4 < var3.length; var4++) {
         classXJ var5 = var3[var4];
         if (var0.field6823.containsKey(var5)) {
            var2.put(var5, var0.field6823.get(var5));
         } else {
            Font var6 = classCU.method2675(var0.field6822, var0.field6824, var5.field6880, "", 421295953);
            if (null != var6) {
               var0.field6823.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "([Lxj;I)Ljava/util/HashMap;")
   @ObfuscatedName("az")
   public HashMap method12744(classXJ[] var1, int var2) {
      try {
         HashMap var3 = new HashMap();
         classXJ[] var4 = var1;

         for (int var5 = 0; var5 < var4.length; var5++) {
            if (var2 != -1607507693) {
               throw new IllegalStateException();
            }

            classXJ var6 = var4[var5];
            if (this.field6823.containsKey(var6)) {
               var3.put(var6, this.field6823.get(var6));
            } else {
               Font var7 = classCU.method2675(this.field6822, this.field6824, var6.field6880, "", -1878459293);
               if (null != var7) {
                  if (var2 != -1607507693) {
                     throw new IllegalStateException();
                  }

                  this.field6823.put(var6, var7);
                  var3.put(var6, var7);
               }
            }
         }

         return var3;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "xc.az(" + ')');
      }
   }

   public classXC(AbstractArchive var1, AbstractArchive var2) {
      this.field6822 = var1;
      this.field6824 = var2;
      this.field6823 = new HashMap();
   }

   @ObfuscatedSignature(descriptor = "([Lxj;)Ljava/util/HashMap;")
   @ObfuscatedName("ab")
   public HashMap method12745(classXJ[] var1) {
      HashMap var2 = new HashMap();
      classXJ[] var3 = var1;

      for (int var4 = 0; var4 < var3.length; var4++) {
         classXJ var5 = var3[var4];
         if (this.field6823.containsKey(var5)) {
            var2.put(var5, this.field6823.get(var5));
         } else {
            Font var6 = classCU.method2675(this.field6822, this.field6824, var5.field6880, "", 1731852835);
            if (null != var6) {
               this.field6823.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "([Lxj;)Ljava/util/HashMap;")
   @ObfuscatedName("af")
   public HashMap method12746(classXJ[] var1) {
      HashMap var2 = new HashMap();
      classXJ[] var3 = var1;

      for (int var4 = 0; var4 < var3.length; var4++) {
         classXJ var5 = var3[var4];
         if (this.field6823.containsKey(var5)) {
            var2.put(var5, this.field6823.get(var5));
         } else {
            Font var6 = classCU.method2675(this.field6822, this.field6822, var5.field6880, "", -2045331213);
            if (null != var6) {
               this.field6823.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }
}
