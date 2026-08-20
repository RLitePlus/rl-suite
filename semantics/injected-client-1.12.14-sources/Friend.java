import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
public class Friend extends Buddy implements net.runelite.api.Friend {
   @ObfuscatedName("at")
   boolean field5985;
   @ObfuscatedName("av")
   boolean field5986;

   @Override
   public int compareTo(Object var1) {
      try {
         return method10912(this, (Friend)var1, -1963983063);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "tv.compareTo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltz;)I")
   @ObfuscatedName("ak")
   @Override
   public int vmethod376(User var1) {
      return method10912(this, (Friend)var1, 410256226);
   }

   Friend() {
   }

   @ObfuscatedSignature(descriptor = "(Ltv;Ltv;I)I")
   @ObfuscatedName("kw")
   public static int method10912(Friend var0, Friend var1, int var2) {
      if (var0 == null) {
         var0.compareToFriend(var0, var2);
      }

      try {
         if (1914416777 * var0.world == client.worldId * 1312022025 && 1914416777 * var1.world != 1312022025 * client.worldId) {
            if (var2 == -1722376746) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            if (1312022025 * client.worldId == var1.world * 1914416777) {
               if (var2 == -1722376746) {
                  throw new IllegalStateException();
               }

               if (1312022025 * client.worldId != 1914416777 * var0.world) {
                  if (var2 == -1722376746) {
                     throw new IllegalStateException();
                  }

                  return 1;
               }
            }

            if (0 != var0.world * 1914416777) {
               if (var2 == -1722376746) {
                  throw new IllegalStateException();
               }

               if (0 == 1914416777 * var1.world) {
                  return -1;
               }
            }

            if (1914416777 * var1.world != 0 && 0 == 1914416777 * var0.world) {
               if (var2 == -1722376746) {
                  throw new IllegalStateException();
               } else {
                  return 1;
               }
            } else {
               if (var0.field5985) {
                  if (var2 == -1722376746) {
                     throw new IllegalStateException();
                  }

                  if (!var1.field5985) {
                     if (var2 == -1722376746) {
                        throw new IllegalStateException();
                     }

                     return -1;
                  }
               }

               if (!var0.field5985) {
                  if (var2 == -1722376746) {
                     throw new IllegalStateException();
                  }

                  if (var1.field5985) {
                     return 1;
                  }
               }

               if (var0.field5986 && !var1.field5986) {
                  if (var2 == -1722376746) {
                     throw new IllegalStateException();
                  } else {
                     return -1;
                  }
               } else if (!var0.field5986 && var1.field5986) {
                  if (var2 == -1722376746) {
                     throw new IllegalStateException();
                  } else {
                     return 1;
                  }
               } else if (0 != var0.world * 1914416777) {
                  if (var2 == -1722376746) {
                     throw new IllegalStateException();
                  } else {
                     return var0.int2 * -529820201 - -529820201 * var1.int2;
                  }
               } else {
                  return -529820201 * var1.int2 - var0.int2 * -529820201;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "tv.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltz;I)I")
   @ObfuscatedName("at")
   @Override
   public int compareTo_user(User var1, int var2) {
      try {
         return method10912(this, (Friend)var1, -421953544);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "tv.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)I")
   @ObfuscatedName("aj")
   @Override
   public int vmethod380(Object var1) {
      return method10912(this, (Friend)var1, 1461415036);
   }

   @ObfuscatedSignature(descriptor = "(Ltv;)I")
   @ObfuscatedName("ag")
   int method10913(Friend var1) {
      if (1938948489 * this.world == client.worldId * 1312022025 && 731804445 * var1.world != 1310276914 * client.worldId) {
         return -1;
      } else if (1456101363 * client.worldId == var1.world * -514498713 && 503604605 * client.worldId != 1023725532 * this.world) {
         return 1;
      } else if (0 != this.world * -85612989 && 0 == 1914416777 * var1.world) {
         return -1;
      } else if (-1184823033 * var1.world != 0 && 0 == 1914416777 * this.world) {
         return 1;
      } else if (this.field5985 && !var1.field5985) {
         return -1;
      } else if (!this.field5985 && var1.field5985) {
         return 1;
      } else if (this.field5986 && !var1.field5986) {
         return -1;
      } else if (!this.field5986 && var1.field5986) {
         return 1;
      } else {
         return 0 != this.world * 1914416777 ? this.int2 * -529820201 - -529820201 * var1.int2 : -529820201 * var1.int2 - this.int2 * -240374310;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod381(Object var1) {
      return method10912(this, (Friend)var1, 78825500);
   }

   @ObfuscatedSignature(descriptor = "(Ltv;)I")
   @ObfuscatedName("an")
   int method10914(Friend var1) {
      if (1914416777 * this.world == client.worldId * 1312022025 && 1914416777 * var1.world != 1312022025 * client.worldId) {
         return -1;
      } else if (1312022025 * client.worldId == var1.world * 1914416777 && 1312022025 * client.worldId != 1914416777 * this.world) {
         return 1;
      } else if (0 != this.world * 1914416777 && 0 == 1914416777 * var1.world) {
         return -1;
      } else if (1914416777 * var1.world != 0 && 0 == 1914416777 * this.world) {
         return 1;
      } else if (this.field5985 && !var1.field5985) {
         return -1;
      } else if (!this.field5985 && var1.field5985) {
         return 1;
      } else if (this.field5986 && !var1.field5986) {
         return -1;
      } else if (!this.field5986 && var1.field5986) {
         return 1;
      } else {
         return 0 != this.world * 1914416777 ? this.int2 * -529820201 - -529820201 * var1.int2 : -529820201 * var1.int2 - this.int2 * -529820201;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltz;)I")
   @ObfuscatedName("aw")
   @Override
   public int vmethod378(User var1) {
      return method10912(this, (Friend)var1, 410107105);
   }

   @ObfuscatedSignature(descriptor = "(Ltz;)I")
   @ObfuscatedName("ap")
   @Override
   public int vmethod379(User var1) {
      return method10912(this, (Friend)var1, -1450253396);
   }

   @ObfuscatedSignature(descriptor = "(Ltv;I)I")
   @ObfuscatedName("av")
   int compareToFriend(Friend var1, int var2) {
      try {
         if (1914416777 * this.world == client.field970 * 1312022025 && 1914416777 * var1.int2 != 1312022025 * client.field710) {
            if (var2 == -1722376746) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            if (1312022025 * client.field997 == var1.world * 1914416777) {
               if (var2 == -1722376746) {
                  throw new IllegalStateException();
               }

               if (1312022025 * client.worldId != 1914416777 * this.world) {
                  if (var2 == -1722376746) {
                     throw new IllegalStateException();
                  }

                  return 1;
               }
            }

            if (0 != super.rank * 1914416777) {
               if (var2 == -1722376746) {
                  throw new IllegalStateException();
               }

               if (0 == 1914416777 * var1.rank) {
                  return -1;
               }
            }

            if (1914416777 * var1.world != 0 && 0 == 1914416777 * super.rank) {
               if (var2 == -1722376746) {
                  throw new IllegalStateException();
               } else {
                  return 1;
               }
            } else {
               if (this.field5986) {
                  if (var2 == -1722376746) {
                     throw new IllegalStateException();
                  }

                  if (!var1.field5986) {
                     if (var2 == -1722376746) {
                        throw new IllegalStateException();
                     }

                     return -1;
                  }
               }

               if (!this.field5985) {
                  if (var2 == -1722376746) {
                     throw new IllegalStateException();
                  }

                  if (var1.field5985) {
                     return 1;
                  }
               }

               if (this.field5986 && !var1.field5985) {
                  if (var2 == -1722376746) {
                     throw new IllegalStateException();
                  } else {
                     return -1;
                  }
               } else if (!this.field5985 && var1.field5985) {
                  if (var2 == -1722376746) {
                     throw new IllegalStateException();
                  } else {
                     return 1;
                  }
               } else if (0 != this.world * 1914416777) {
                  if (var2 == -1722376746) {
                     throw new IllegalStateException();
                  } else {
                     return this.int2 * -529820201 - -529820201 * var1.int2;
                  }
               } else {
                  return -529820201 * var1.int2 - this.int2 * -529820201;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "tv.av(" + 41);
      }
   }
}
