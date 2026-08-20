import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tk")
public class IgnoreList extends UserList {
   @ObfuscatedSignature(descriptor = "Lwc;")
   @ObfuscatedName("ae")
   final LoginType field5935;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field5936 = 100;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field5937 = 400;

   @ObfuscatedSignature(descriptor = "(I)[Ltz;")
   @ObfuscatedName("aw")
   @Override
   User[] vmethod349(int var1) {
      return new Ignored[var1];
   }

   @ObfuscatedSignature(descriptor = "()Ltz;")
   @ObfuscatedName("ae")
   @Override
   User vmethod345() {
      return new Ignored();
   }

   @ObfuscatedSignature(descriptor = "(II)[Ltz;")
   @ObfuscatedName("at")
   @Override
   User[] newTypedArray(int var1, int var2) {
      try {
         return new Ignored[var1];
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "tk.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("ag")
   public void read(Buffer var1, int var2, int var3) {
      try {
         while (var1.offset * 2108391709 < var2) {
            if (var3 <= 1965532721) {
               throw new IllegalStateException();
            }

            int var4 = var1.readUnsignedByte(-784075215);
            if (var4 == 4) {
               if (var3 <= 1965532721) {
                  throw new IllegalStateException();
               }

               Username var11 = new Username(var1.readStringCp1252NullCircumfixed(460815299), this.field5935);
               if (!var11.hasCleanName(-698146178)) {
                  if (var3 <= 1965532721) {
                     return;
                  }

                  throw new IllegalStateException();
               }

               boolean var12 = false;
               class320.friendSystem.removeIgnore(Username.method12702(var11, (byte)-127), var12, -844319907);
            } else {
               boolean var10000;
               if (0 != (var4 & 1)) {
                  if (var3 <= 1965532721) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var5 = var10000;
               Username var6 = new Username(var1.readStringCp1252NullCircumfixed(-676867211), this.field5935);
               Username var7 = new Username(var1.readStringCp1252NullCircumfixed(-1214822938), this.field5935);
               var1.readStringCp1252NullCircumfixed(-800412820);
               if (!var6.hasCleanName(-698146178)) {
                  throw new IllegalStateException();
               }

               Ignored var8 = (Ignored)this.getByCurrentUsername(var6, 862907097);
               if (var5) {
                  if (var3 <= 1965532721) {
                     return;
                  }

                  Ignored var9 = (Ignored)this.getByCurrentUsername(var7, 862907097);
                  if (var9 != null) {
                     if (var3 <= 1965532721) {
                        throw new IllegalStateException();
                     }

                     if (var9 != var8) {
                        if (var3 <= 1965532721) {
                           throw new IllegalStateException();
                        }

                        if (var8 != null) {
                           if (var3 <= 1965532721) {
                              throw new IllegalStateException();
                           }

                           UserList.method10695(this, var9, -735389269);
                        } else {
                           var8 = var9;
                        }
                     }
                  }
               }

               if (null != var8) {
                  this.changeName(var8, var6, var7, -1383386161);
               } else if (UserList.method10669(this, 889348661) < 400) {
                  if (var3 <= 1965532721) {
                     return;
                  }

                  int var14 = UserList.method10669(this, -1388896315);
                  var8 = (Ignored)this.addLast(var6, var7, -1142342067);
                  var8.id = var14 * 1369742937;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "tk.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ltz;")
   @ObfuscatedName("an")
   @Override
   User vmethod343() {
      return new Ignored();
   }

   public IgnoreList(LoginType var1) {
      super(400);
      this.field5935 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Ltz;")
   @ObfuscatedName("aj")
   @Override
   User vmethod344() {
      return new Ignored();
   }

   @ObfuscatedSignature(descriptor = "(I)[Ltz;")
   @ObfuscatedName("ay")
   @Override
   User[] vmethod348(int var1) {
      return new Ignored[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)[Ltz;")
   @ObfuscatedName("ap")
   @Override
   User[] vmethod347(int var1) {
      return new Ignored[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)[Ltz;")
   @ObfuscatedName("ak")
   @Override
   User[] vmethod350(int var1) {
      return new Ignored[var1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltk;Lxa;I)V")
   @ObfuscatedName("ke")
   public static void method10750(IgnoreList var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.vmethod345();
      }

      while (var1.offset * 2108391709 < var2) {
         int var3 = var1.readUnsignedByte(468038818);
         if (var3 == 4) {
            Username var4 = new Username(var1.readStringCp1252NullCircumfixed(889373685), var0.field5935);
            if (!var4.hasCleanName(-698146178)) {
               throw new IllegalStateException();
            }

            boolean var5 = false;
            class320.friendSystem.removeIgnore(Username.method12702(var4, (byte)-15), var5, 1846327550);
         } else {
            boolean var9 = 0 != (var3 & 1);
            Username var10 = new Username(var1.readStringCp1252NullCircumfixed(1257003533), var0.field5935);
            Username var6 = new Username(var1.readStringCp1252NullCircumfixed(1231867068), var0.field5935);
            var1.readStringCp1252NullCircumfixed(-1038545333);
            if (!var10.hasCleanName(-698146178)) {
               throw new IllegalStateException();
            }

            Ignored var7 = (Ignored)var0.getByCurrentUsername(var10, 862907097);
            if (var9) {
               Ignored var8 = (Ignored)var0.getByCurrentUsername(var6, 862907097);
               if (var8 != null && var8 != var7) {
                  if (var7 != null) {
                     UserList.method10695(var0, var8, -714333526);
                  } else {
                     var7 = var8;
                  }
               }
            }

            if (null != var7) {
               var0.changeName(var7, var10, var6, -1383386161);
            } else if (UserList.method10669(var0, -747109662) < 400) {
               int var12 = UserList.method10669(var0, 1605199700);
               var7 = (Ignored)var0.addLast(var10, var6, -1142342067);
               var7.id = var12 * 1369742937;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ltz;")
   @ObfuscatedName("av")
   @Override
   User newInstance(int var1) {
      try {
         return new Ignored();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tk.av(" + ')');
      }
   }
}
