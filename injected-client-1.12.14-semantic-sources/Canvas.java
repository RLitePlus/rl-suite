import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ao")
public final class Canvas extends java.awt.Canvas {
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   public static final int field45 = 35;
   @ObfuscatedName("av")
   Component component;

   @ObfuscatedSignature(descriptor = "(Lcr;I)V")
   @ObfuscatedName("in")
   static final void method156(Actor var0, int var1) {
      try {
         int var2 = var0.idleSequence * 1683244579;
         if (0 == var0.pathLength * -1921456255) {
            if (var1 == 1528583797) {
               var0.field1145 = 0;
               var0.method2747(var2, 1883787690);
            }
         } else {
            if (Actor.method2758(var0, -103195895)) {
               SequenceDefinition var3 = AnimationSequence.method10318(var0.animationSequence, 493771736);
               if (var0.field1164 * -114856975 > 0) {
                  if (var1 != 1528583797) {
                     throw new IllegalStateException();
                  }

                  if (0 == var3.field2734 * 1930490603) {
                     var0.field1145 += 1816773741;
                     var0.method2747(var2, 560984297);
                     return;
                  }
               }

               if (-114856975 * var0.field1164 <= 0) {
                  if (var1 != 1528583797) {
                     throw new IllegalStateException();
                  }

                  if (0 == var3.field2731 * -1606113103) {
                     if (var1 != 1528583797) {
                        throw new IllegalStateException();
                     }

                     var0.field1145 += 1816773741;
                     var0.method2747(var2, 1036599217);
                     return;
                  }
               }
            }

            int var13 = 340712311 * var0.x;
            int var4 = -1747310679 * var0.y;
            int var5 = var0.size * 1257575232 + 128 * var0.pathX[var0.pathLength * -1921456255 - 1];
            int var6 = 1257575232 * var0.size + 128 * var0.pathY[var0.pathLength * -1921456255 - 1];
            if (var13 < var5) {
               if (var4 < var6) {
                  if (var1 != 1528583797) {
                     return;
                  }

                  var0.orientation = -590964992;
               } else if (var4 > var6) {
                  if (var1 != 1528583797) {
                     return;
                  }

                  var0.orientation = -1686344448;
               } else {
                  var0.orientation = 1008828928;
               }
            } else if (var13 > var5) {
               if (var1 != 1528583797) {
                  throw new IllegalStateException();
               }

               if (var4 < var6) {
                  if (var1 != 1528583797) {
                     throw new IllegalStateException();
                  }

                  var0.orientation = 504414464;
               } else if (var4 > var6) {
                  if (var1 != 1528583797) {
                     throw new IllegalStateException();
                  }

                  var0.orientation = 1599793920;
               } else {
                  var0.orientation = -1095379456;
               }
            } else if (var4 < var6) {
               var0.orientation = 2104208384;
            } else if (var4 > var6) {
               if (var1 != 1528583797) {
                  throw new IllegalStateException();
               }

               var0.orientation = 0;
            }

            MoveSpeed var7 = var0.pathTraversed[-1921456255 * var0.pathLength - 1];
            if (var5 - var13 <= 256) {
               if (var1 != 1528583797) {
                  throw new IllegalStateException();
               }

               if (var5 - var13 >= -256) {
                  if (var1 != 1528583797) {
                     throw new IllegalStateException();
                  }

                  if (var6 - var4 <= 256) {
                     if (var1 != 1528583797) {
                        throw new IllegalStateException();
                     }

                     if (var6 - var4 >= -256) {
                        int var8 = -1817477693 * var0.orientation - var0.rotation * 1777129311 & 2047;
                        if (var8 > 1024) {
                           if (var1 != 1528583797) {
                              throw new IllegalStateException();
                           }

                           var8 -= 2048;
                        }

                        label502: {
                           var2 = var0.walkBackSequence * -1392171615;
                           if (var8 >= -256) {
                              if (var1 != 1528583797) {
                                 throw new IllegalStateException();
                              }

                              if (var8 <= 256) {
                                 if (var1 != 1528583797) {
                                    throw new IllegalStateException();
                                 }

                                 var2 = -1691426581 * var0.walkSequence;
                                 break label502;
                              }
                           }

                           if (var8 >= 256) {
                              if (var1 != 1528583797) {
                                 return;
                              }

                              if (var8 < 768) {
                                 if (var1 != 1528583797) {
                                    throw new IllegalStateException();
                                 }

                                 var2 = 577914413 * var0.walkRightSequence;
                                 break label502;
                              }
                           }

                           if (var8 >= -768) {
                              if (var1 != 1528583797) {
                                 throw new IllegalStateException();
                              }

                              if (var8 <= -256) {
                                 if (var1 != 1528583797) {
                                    return;
                                 }

                                 var2 = var0.walkLeftSequence * -1963363111;
                              }
                           }
                        }

                        if (-1 == var2) {
                           var2 = var0.walkSequence * -1691426581;
                        }

                        byte var9 = 4;
                        boolean var10 = true;
                        if (var0 instanceof NPC) {
                           if (var1 != 1528583797) {
                              throw new IllegalStateException();
                           }

                           var10 = ((NPC)var0).definition.isClipped;
                        }

                        if (var10) {
                           if (var1 != 1528583797) {
                              return;
                           }

                           if (1777129311 * var0.rotation != var0.orientation * -1817477693) {
                              if (var1 != 1528583797) {
                                 return;
                              }

                              if (-1 == var0.targetIndex * -998106409) {
                                 if (var1 != 1528583797) {
                                    throw new IllegalStateException();
                                 }

                                 if (var0.field1158 * 662711013 != 0) {
                                    if (var1 != 1528583797) {
                                       throw new IllegalStateException();
                                    }

                                    var9 = 2;
                                 }
                              }
                           }

                           if (-1921456255 * var0.pathLength > 2) {
                              if (var1 != 1528583797) {
                                 throw new IllegalStateException();
                              }

                              var9 = 6;
                           }

                           if (var0.pathLength * -1921456255 > 3) {
                              if (var1 != 1528583797) {
                                 throw new IllegalStateException();
                              }

                              var9 = 8;
                           }

                           if (var0.field1145 * 888202597 > 0) {
                              if (var1 != 1528583797) {
                                 throw new IllegalStateException();
                              }

                              if (-1921456255 * var0.pathLength > 1) {
                                 if (var1 != 1528583797) {
                                    throw new IllegalStateException();
                                 }

                                 var9 = 8;
                                 var0.field1145 -= 1816773741;
                              }
                           }
                        } else {
                           if (-1921456255 * var0.pathLength > 1) {
                              if (var1 != 1528583797) {
                                 throw new IllegalStateException();
                              }

                              var9 = 6;
                           }

                           if (var0.pathLength * -1921456255 > 2) {
                              if (var1 != 1528583797) {
                                 throw new IllegalStateException();
                              }

                              var9 = 8;
                           }

                           if (888202597 * var0.field1145 > 0) {
                              if (var1 != 1528583797) {
                                 throw new IllegalStateException();
                              }

                              if (var0.pathLength * -1921456255 > 1) {
                                 if (var1 != 1528583797) {
                                    throw new IllegalStateException();
                                 }

                                 var9 = 8;
                                 var0.field1145 -= 1816773741;
                              }
                           }
                        }

                        if (var7 == MoveSpeed.field3808) {
                           if (var1 != 1528583797) {
                              throw new IllegalStateException();
                           }

                           var9 <<= 1;
                        } else if (MoveSpeed.field3807 == var7) {
                           if (var1 != 1528583797) {
                              throw new IllegalStateException();
                           }

                           var9 >>= 1;
                        }

                        label467:
                        if (var9 >= 8) {
                           if (var1 != 1528583797) {
                              throw new IllegalStateException();
                           }

                           if (var2 == -1691426581 * var0.walkSequence) {
                              if (var1 != 1528583797) {
                                 throw new IllegalStateException();
                              }

                              if (var0.runSequence * -2045699099 != -1) {
                                 if (var1 != 1528583797) {
                                    throw new IllegalStateException();
                                 }

                                 var2 = var0.runSequence * -2045699099;
                                 break label467;
                              }
                           }

                           if (-1392171615 * var0.walkBackSequence == var2) {
                              if (var1 != 1528583797) {
                                 throw new IllegalStateException();
                              }

                              if (var0.field1160 * 1665234837 != -1) {
                                 var2 = 1665234837 * var0.field1160;
                                 break label467;
                              }
                           }

                           if (var2 == -1963363111 * var0.walkLeftSequence) {
                              if (var1 != 1528583797) {
                                 throw new IllegalStateException();
                              }

                              if (var0.field1154 * -1258908619 != -1) {
                                 if (var1 != 1528583797) {
                                    return;
                                 }

                                 var2 = -1258908619 * var0.field1154;
                                 break label467;
                              }
                           }

                           if (var2 == 577914413 * var0.walkRightSequence) {
                              if (var1 != 1528583797) {
                                 throw new IllegalStateException();
                              }

                              if (-1 != var0.field1138 * 2019166665) {
                                 if (var1 != 1528583797) {
                                    return;
                                 }

                                 var2 = 2019166665 * var0.field1138;
                              }
                           }
                        } else {
                           label455:
                           if (var9 <= 2) {
                              if (-1691426581 * var0.walkSequence == var2) {
                                 if (var1 != 1528583797) {
                                    throw new IllegalStateException();
                                 }

                                 if (-1 != 397393405 * var0.field1139) {
                                    if (var1 != 1528583797) {
                                       throw new IllegalStateException();
                                    }

                                    var2 = var0.field1139 * 397393405;
                                    break label455;
                                 }
                              }

                              if (-1392171615 * var0.walkBackSequence == var2) {
                                 if (var1 != 1528583797) {
                                    throw new IllegalStateException();
                                 }

                                 if (-1 != var0.field1140 * -2048617785) {
                                    if (var1 != 1528583797) {
                                       throw new IllegalStateException();
                                    }

                                    var2 = -2048617785 * var0.field1140;
                                    break label455;
                                 }
                              }

                              if (var0.walkLeftSequence * -1963363111 == var2) {
                                 if (var1 != 1528583797) {
                                    throw new IllegalStateException();
                                 }

                                 if (-1 != 2044363043 * var0.field1141) {
                                    if (var1 != 1528583797) {
                                       throw new IllegalStateException();
                                    }

                                    var2 = 2044363043 * var0.field1141;
                                    break label455;
                                 }
                              }

                              if (var2 == 577914413 * var0.walkRightSequence) {
                                 if (var1 != 1528583797) {
                                    return;
                                 }

                                 if (-1 != -1077781875 * var0.field1142) {
                                    if (var1 != 1528583797) {
                                       throw new IllegalStateException();
                                    }

                                    var2 = var0.field1142 * -1077781875;
                                 }
                              }
                           }
                        }

                        label507: {
                           if (var13 == var5) {
                              if (var1 != 1528583797) {
                                 throw new IllegalStateException();
                              }

                              if (var6 == var4) {
                                 break label507;
                              }

                              if (var1 != 1528583797) {
                                 throw new IllegalStateException();
                              }
                           }

                           if (var13 < var5) {
                              var0.x += var9 * 1875668551;
                              if (var0.x * 340712311 > var5) {
                                 var0.x = 1875668551 * var5;
                              }
                           } else if (var13 > var5) {
                              var0.x -= var9 * 1875668551;
                              if (340712311 * var0.x < var5) {
                                 var0.x = var5 * 1875668551;
                              }
                           }

                           if (var4 < var6) {
                              if (var1 != 1528583797) {
                                 throw new IllegalStateException();
                              }

                              var0.y += -122983271 * var9;
                              if (-1747310679 * var0.y > var6) {
                                 if (var1 != 1528583797) {
                                    throw new IllegalStateException();
                                 }

                                 var0.y = -122983271 * var6;
                              }
                           } else if (var4 > var6) {
                              var0.y -= -122983271 * var9;
                              if (-1747310679 * var0.y < var6) {
                                 if (var1 != 1528583797) {
                                    throw new IllegalStateException();
                                 }

                                 var0.y = -122983271 * var6;
                              }
                           }
                        }

                        if (340712311 * var0.x == var5) {
                           if (var1 != 1528583797) {
                              throw new IllegalStateException();
                           }

                           if (-1747310679 * var0.y == var6) {
                              if (var1 != 1528583797) {
                                 throw new IllegalStateException();
                              }

                              var0.pathLength -= 234838145;
                              if (var0.field1164 * -114856975 > 0) {
                                 if (var1 != 1528583797) {
                                    throw new IllegalStateException();
                                 }

                                 var0.field1164 -= -968350447;
                              }
                           }
                        }

                        var0.method2747(var2, 1554820783);
                        return;
                     }

                     if (var1 != 1528583797) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }

            var0.x = var5 * 1875668551;
            var0.y = -122983271 * var6;
            var0.pathLength -= 234838145;
            if (-114856975 * var0.field1164 > 0) {
               var0.field1164 -= -968350447;
            }

            var0.method2747(var2, 835746937);
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "ao.in(" + ')');
      }
   }

   @Override
   public final void update(Graphics var1) {
      try {
         this.component.update(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ao.update(" + ')');
      }
   }

   @Override
   public final void paint(Graphics var1) {
      try {
         this.component.paint(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ao.paint(" + ')');
      }
   }

   Canvas(Component var1) {
      this.component = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("at")
   public final void method148(Graphics var1) {
      this.component.update(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("ag")
   public final void method149(Graphics var1) {
      this.component.update(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("an")
   public final void method151(Graphics var1) {
      this.component.paint(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("ae")
   public final void method152(Graphics var1) {
      this.component.paint(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("aj")
   public final void method153(Graphics var1) {
      this.component.paint(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("av")
   public final void method150(Graphics var1) {
      this.component.update(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lao;Ljava/awt/Graphics;)V")
   @ObfuscatedName("bw")
   public static void method154(Canvas var0, Graphics var1) {
      if (var0 == null) {
         var0.method155(var1);
      } else {
         var0.component.paint(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/awt/Graphics;)V")
   @ObfuscatedName("ak")
   public final void method155(Graphics var1) {
      try {
         this.component.paint(var1);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ao.paint(" + ')');
      }
   }
}
