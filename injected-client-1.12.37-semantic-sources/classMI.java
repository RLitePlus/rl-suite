import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("mi")
public class classMI {
   @ObfuscatedSignature(descriptor = "Lmi;")
   @ObfuscatedName("af")
   static final classMI field4509 = new classMI();
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final String field4511 = "osrs";
   @ObfuscatedName("ae")
   Map field4508 = new HashMap();
   @ObfuscatedName("ab")
   int field4507 = 0;
   @ObfuscatedName("gq")
   static int field4510;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
   @ObfuscatedName("ae")
   public static String method7575(String var0, int var1) {
      try {
         return (String)classGQ.field2652.get(var0.toLowerCase());
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "mi.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;ILda;B)V")
   @ObfuscatedName("az")
   void method7573(JSONObject var1, int var2, classDA var3, byte var4) {
      try {
         this.field4508.clear();

         JSONObject var5;
         try {
            var5 = var1;
            this.field4507 = var2 * -1363556091;
            var1.getLong("lastfullsyncat");
            var1.getLong("lastcardupdatedat");
         } catch (Exception var8) {
            return;
         }

         try {
            this.method7576(var5.getJSONArray("crmcomponents"), 229940173 * this.field4507, var3, (byte)1);
         } catch (Exception var7) {
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "mi.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;ILda;B)V")
   @ObfuscatedName("af")
   void method7576(JSONArray var1, int var2, classDA var3, byte var4) throws JSONException {
      try {
         if (var1 != null) {
            for (int var5 = 0; var5 < var1.length(); var5++) {
               if (var4 != 1) {
                  return;
               }

               JSONObject var6 = var1.getJSONObject(var5);
               if (!var6.getString("game").equals("osrs")) {
                  if (var4 != 1) {
                     throw new IllegalStateException();
                  }
               } else if (var6.getBoolean("removed")) {
                  if (var4 != 1) {
                     throw new IllegalStateException();
                  }
               } else {
                  String var7 = var6.getString("platform");
                  if (!var7.equals("mobile")) {
                     if (var4 != 1) {
                        throw new IllegalStateException();
                     }

                     if (!var7.equals("android")) {
                        if (var4 != 1) {
                           throw new IllegalStateException();
                        }

                        if (var7.equals("ios")) {
                           if (var4 != 1) {
                              throw new IllegalStateException();
                           }
                        } else {
                           classMS var8 = new classMS();

                           try {
                              var8.method7665(var6, var2, var3, -2022071435);
                           } catch (Exception var10) {
                           }

                           if (!var8.field4570.isEmpty()) {
                              String var9 = var6.getString("location");
                              this.field4508.put(var9, var8);
                           }
                        }
                     }
                  }
               }
            }

            this.field4508 = method7580(this, (short)211);
            classDD.method2983(16711680);
         }
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "mi.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmi;S)Ljava/util/Map;")
   @ObfuscatedName("ev")
   public static Map method7580(classMI var0, short var1) {
      if (var0 == null) {
         var0.method7587(var1);
      }

      try {
         HashMap var2 = new HashMap();
         ArrayList var3 = new ArrayList();
         var3.addAll(var0.field4508.entrySet());
         boolean var4 = false;

         while (!var4) {
            if (var1 != 211) {
               throw new IllegalStateException();
            }

            var4 = true;

            for (int var6 = 0; var6 < var3.size() - 1; var6++) {
               if (var1 != 211) {
                  throw new IllegalStateException();
               }

               if (((classMS)((Entry)var3.get(var6)).getValue()).method7660((byte)20) > ((classMS)((Entry)var3.get(1 + var6)).getValue()).method7660((byte)-33)
                  )
                {
                  if (var1 != 211) {
                     throw new IllegalStateException();
                  }

                  Entry var5 = (Entry)var3.get(var6);
                  var3.set(var6, var3.get(1 + var6));
                  var3.set(var6 + 1, var5);
                  var4 = false;
               }
            }
         }

         Iterator var9 = var3.iterator();

         while (var9.hasNext()) {
            if (var1 != 211) {
               throw new IllegalStateException();
            }

            Entry var7 = (Entry)var9.next();
            var2.put(var7.getKey(), var7.getValue());
         }

         return var2;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "mi.ae(" + ')');
      }
   }

   classMI() {
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;ILda;)V")
   @ObfuscatedName("ag")
   void method7574(JSONObject var1, int var2, classDA var3) {
      this.field4508.clear();

      JSONObject var4;
      try {
         var4 = var1;
         this.field4507 = var2 * -1363556091;
         var1.getLong("lastfullsyncat");
         var1.getLong("lastcardupdatedat");
      } catch (Exception var7) {
         return;
      }

      try {
         this.method7576(var4.getJSONArray("crmcomponents"), 229940173 * this.field4507, var3, (byte)1);
      } catch (Exception var6) {
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Map;")
   @ObfuscatedName("aj")
   Map method7581() {
      HashMap var1 = new HashMap();
      ArrayList var2 = new ArrayList();
      var2.addAll(this.field4508.entrySet());
      boolean var3 = false;

      while (!var3) {
         var3 = true;

         for (int var5 = 0; var5 < var2.size() - 1; var5++) {
            if (((classMS)((Entry)var2.get(var5)).getValue()).method7660((byte)54) > ((classMS)((Entry)var2.get(1 + var5)).getValue()).method7660((byte)-44)) {
               Entry var4 = (Entry)var2.get(var5);
               var2.set(var5, var2.get(1 + var5));
               var2.set(var5 + 1, var4);
               var3 = false;
            }
         }
      }

      for (Entry var6 : var2) {
         var1.put(var6.getKey(), var6.getValue());
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;ILda;)V")
   @ObfuscatedName("ax")
   void method7577(JSONArray var1, int var2, classDA var3) throws JSONException {
      if (var1 != null) {
         for (int var4 = 0; var4 < var1.length(); var4++) {
            JSONObject var5 = var1.getJSONObject(var4);
            if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
               String var6 = var5.getString("platform");
               if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
                  classMS var7 = new classMS();

                  try {
                     var7.method7665(var5, var2, var3, 1486517862);
                  } catch (Exception var9) {
                  }

                  if (!var7.field4570.isEmpty()) {
                     String var8 = var5.getString("location");
                     this.field4508.put(var8, var7);
                  }
               }
            }
         }

         this.field4508 = method7580(this, (short)211);
         classDD.method2983(16711680);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmi;Ljava/lang/String;I)Lms;")
   @ObfuscatedName("py")
   public static classMS method7588(classMI var0, String var1, int var2) {
      if (var0 == null) {
         return var0.method7591(var1, var2);
      } else {
         try {
            return (classMS)var0.field4508.get(var1);
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "mi.ab(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmi;)Ljava/util/Map;")
   @ObfuscatedName("gq")
   public static Map method7582(classMI var0) {
      if (var0 == null) {
         return var0.method7586();
      } else {
         HashMap var1 = new HashMap();
         ArrayList var2 = new ArrayList();
         var2.addAll(var0.field4508.entrySet());
         boolean var3 = false;

         while (!var3) {
            var3 = true;

            for (int var5 = 0; var5 < var2.size() - 1; var5++) {
               if (((classMS)((Entry)var2.get(var5)).getValue()).method7660((byte)-111)
                  > ((classMS)((Entry)var2.get(1 + var5)).getValue()).method7660((byte)-28)) {
                  Entry var4 = (Entry)var2.get(var5);
                  var2.set(var5, var2.get(1 + var5));
                  var2.set(var5 + 1, var4);
                  var3 = false;
               }
            }
         }

         for (Entry var6 : var2) {
            var1.put(var6.getKey(), var6.getValue());
         }

         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmi;)Ljava/util/Map;")
   @ObfuscatedName("ek")
   public static Map method7583(classMI var0) {
      if (var0 == null) {
         return var0.method7581();
      } else {
         HashMap var1 = new HashMap();
         ArrayList var2 = new ArrayList();
         var2.addAll(var0.field4508.entrySet());
         boolean var3 = false;

         while (!var3) {
            var3 = true;

            for (int var5 = 0; var5 < var2.size() - 1; var5++) {
               if (((classMS)((Entry)var2.get(var5)).getValue()).method7660((byte)-29) > ((classMS)((Entry)var2.get(1 + var5)).getValue()).method7660((byte)38)
                  )
                {
                  Entry var4 = (Entry)var2.get(var5);
                  var2.set(var5, var2.get(1 + var5));
                  var2.set(var5 + 1, var4);
                  var3 = false;
               }
            }
         }

         for (Entry var6 : var2) {
            var1.put(var6.getKey(), var6.getValue());
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Map;")
   @ObfuscatedName("aa")
   Map method7584() {
      HashMap var1 = new HashMap();
      ArrayList var2 = new ArrayList();
      var2.addAll(this.field4508.entrySet());
      boolean var3 = false;

      while (!var3) {
         var3 = true;

         for (int var5 = 0; var5 < var2.size() - 1; var5++) {
            if (((classMS)((Entry)var2.get(var5)).getValue()).method7660((byte)-59) > ((classMS)((Entry)var2.get(1 + var5)).getValue()).method7660((byte)-2)) {
               Entry var4 = (Entry)var2.get(var5);
               var2.set(var5, var2.get(1 + var5));
               var2.set(var5 + 1, var4);
               var3 = false;
            }
         }
      }

      for (Entry var6 : var2) {
         var1.put(var6.getKey(), var6.getValue());
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;ILda;)V")
   @ObfuscatedName("as")
   void method7578(JSONArray var1, int var2, classDA var3) throws JSONException {
      if (var1 != null) {
         for (int var4 = 0; var4 < var1.length(); var4++) {
            JSONObject var5 = var1.getJSONObject(var4);
            if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
               String var6 = var5.getString("platform");
               if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
                  classMS var7 = new classMS();

                  try {
                     var7.method7665(var5, var2, var3, -1630162249);
                  } catch (Exception var9) {
                  }

                  if (!var7.field4570.isEmpty()) {
                     String var8 = var5.getString("location");
                     this.field4508.put(var8, var7);
                  }
               }
            }
         }

         this.field4508 = method7580(this, (short)211);
         classDD.method2983(16711680);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Map;")
   @ObfuscatedName("al")
   Map method7585() {
      HashMap var1 = new HashMap();
      ArrayList var2 = new ArrayList();
      var2.addAll(this.field4508.entrySet());
      boolean var3 = false;

      while (!var3) {
         var3 = true;

         for (int var5 = 0; var5 < var2.size() - 1; var5++) {
            if (((classMS)((Entry)var2.get(var5)).getValue()).method7660((byte)-111) > ((classMS)((Entry)var2.get(1 + var5)).getValue()).method7660((byte)-74)) {
               Entry var4 = (Entry)var2.get(var5);
               var2.set(var5, var2.get(1 + var5));
               var2.set(var5 + 1, var4);
               var3 = false;
            }
         }
      }

      for (Entry var6 : var2) {
         var1.put(var6.getKey(), var6.getValue());
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;ILda;)V")
   @ObfuscatedName("ac")
   void method7579(JSONArray var1, int var2, classDA var3) throws JSONException {
      if (var1 != null) {
         for (int var4 = 0; var4 < var1.length(); var4++) {
            JSONObject var5 = var1.getJSONObject(var4);
            if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
               String var6 = var5.getString("platform");
               if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
                  classMS var7 = new classMS();

                  try {
                     var7.method7665(var5, var2, var3, 350632438);
                  } catch (Exception var9) {
                  }

                  if (!var7.field4570.isEmpty()) {
                     String var8 = var5.getString("location");
                     this.field4508.put(var8, var7);
                  }
               }
            }
         }

         this.field4508 = method7580(this, (short)211);
         classDD.method2983(16711680);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Map;")
   @ObfuscatedName("ay")
   Map method7586() {
      HashMap var1 = new HashMap();
      ArrayList var2 = new ArrayList();
      var2.addAll(this.field4508.entrySet());
      boolean var3 = false;

      while (!var3) {
         var3 = true;

         for (int var5 = 0; var5 < var2.size() - 1; var5++) {
            if (((classMS)((Entry)var2.get(var5)).getValue()).method7660((byte)-59) > ((classMS)((Entry)var2.get(1 + var5)).getValue()).method7660((byte)7)) {
               Entry var4 = (Entry)var2.get(var5);
               var2.set(var5, var2.get(1 + var5));
               var2.set(var5 + 1, var4);
               var3 = false;
            }
         }
      }

      for (Entry var6 : var2) {
         var1.put(var6.getKey(), var6.getValue());
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lms;")
   @ObfuscatedName("ap")
   classMS method7589(String var1) {
      return (classMS)this.field4508.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Lms;")
   @ObfuscatedName("ad")
   classMS method7590(String var1) {
      return (classMS)this.field4508.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIIIIIIIB)V")
   @ObfuscatedName("ey")
   static final void method7592(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
      boolean var10 = client.field885;

      try {
         client.field885 = false;
         int var20 = var8;
         int var19 = var7;
         int var18 = var6;
         int var17 = var5;
         int var16 = var4;
         int var15 = var3;
         int var14 = var2;
         int var13 = var1;
         WorldView var12 = var0;
         byte var21 = 2;

         try {
            Scene var22 = var12.scene;
            if (var15 >= 1) {
               if (var21 != 2) {
                  throw new IllegalStateException();
               }

               if (var16 >= 1) {
                  if (var21 != 2) {
                     throw new IllegalStateException();
                  }

                  if (var15 <= var12.field1696 * 1296729483 - 2) {
                     if (var21 != 2) {
                        throw new IllegalStateException();
                     }

                     if (var16 <= -1269171107 * var12.field1692 - 2) {
                        if (client.field885) {
                           if (var21 != 2) {
                              return;
                           }

                           if (-483624883 * var12.field1710 != var13) {
                              if (var21 != 2) {
                                 throw new IllegalStateException();
                              }

                              return;
                           }
                        }

                        Renderable var23 = null;
                        Renderable var24 = null;
                        int var25 = -1;
                        long var26 = 0L;
                        int var28 = 0;
                        int var29 = 0;
                        if (0 == var14) {
                           if (var21 != 2) {
                              throw new IllegalStateException();
                           }

                           var26 = var22.method4455(var13, var15, var16);
                        }

                        if (1 == var14) {
                           var26 = var22.method4417(var13, var15, var16);
                        }

                        if (var14 == 2) {
                           if (var21 != 2) {
                              return;
                           }

                           var26 = var22.method4439(var13, var15, var16);
                        }

                        if (var14 == 3) {
                           if (var21 != 2) {
                              return;
                           }

                           var26 = var22.method4476(var13, var15, var16);
                        }

                        if (0L != var26) {
                           if (var21 != 2) {
                              return;
                           }

                           int var30 = Scene.method4462(var22, var13, var15, var16, var26);
                           var25 = classCN.method2552(var26);
                           var28 = var30 & 31;
                           var29 = var30 >> 6 & 3;
                           classOM var31 = classMU.method7729(var25, 1505586716);
                           var12.method3748(var13, var15, var16, var31, var29, (byte)106);
                           if (0 == var14) {
                              if (var21 != 2) {
                                 throw new IllegalStateException();
                              }

                              BoundaryObject var32 = var22.method4467(var13, var15, var16);
                              var23 = var32.field2249;
                              var24 = var32.field2248;
                              var22.method4485(var13, var15, var16);
                              if (var31.field4946 * -2040437663 != 0) {
                                 var12.field1687[var13].method5373(var15, var16, var28, var29, var31.field4947, -2142373270);
                              }
                           }

                           if (var14 == 1) {
                              WallDecoration var41 = var22.method4420(var13, var15, var16);
                              var23 = var41.field2279;
                              var24 = var41.field2278;
                              var22.method4445(var13, var15, var16);
                           }

                           if (var14 == 2) {
                              var23 = var22.method4395(var13, var15, var16).field2200;
                              var22.method4394(var13, var15, var16);
                              if (-582306509 * var31.field4944 + var15 > 1296729483 * var12.field1696 - 1) {
                                 return;
                              }

                              if (var21 != 2) {
                                 throw new IllegalStateException();
                              }

                              if (var16 + -582306509 * var31.field4944 > -1269171107 * var12.field1692 - 1
                                 || var15 + 402876423 * var31.field4924 > var12.field1696 * 1296729483 - 1) {
                                 return;
                              }

                              if (402876423 * var31.field4924 + var16 > var12.field1692 * -1269171107 - 1) {
                                 if (var21 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 return;
                              }

                              if (0 != -2040437663 * var31.field4946) {
                                 if (var21 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 var12.field1687[var13]
                                    .method5377(var15, var16, -582306509 * var31.field4944, var31.field4924 * 402876423, var29, var31.field4947, (byte)13);
                              }
                           }

                           if (3 == var14) {
                              if (var21 != 2) {
                                 throw new IllegalStateException();
                              }

                              var23 = Scene.method4457(var22, var13, var15, var16).field1816;
                              Scene.method4456(var22, var13, var15, var16);
                              if (-2040437663 * var31.field4946 == 1) {
                                 if (var21 != 2) {
                                    throw new IllegalStateException();
                                 }

                                 var12.field1687[var13].method5380(var15, var16, 1400157407);
                              }
                           }
                        }

                        if (var17 >= 0) {
                           if (var21 != 2) {
                              throw new IllegalStateException();
                           }

                           int var39 = var13;
                           if (classSG.method10419(var12, var13, var15, var16, 1423908992)) {
                              if (var21 != 2) {
                                 throw new IllegalStateException();
                              }

                              var39 = var13 + 1;
                           }

                           if (var17 != var25) {
                              if (var21 != 2) {
                                 throw new IllegalStateException();
                              }

                              var23 = null;
                              var24 = null;
                           }

                           classFK.method4820(var12, var13, var39, var15, var16, var17, var18, var19, var20, var12.field1687[var13], var23, var24, 1370119256);
                           classOM var40 = classMU.method7729(var17, 1715466882);
                           if (null != var40) {
                              if (var21 != 2) {
                                 throw new IllegalStateException();
                              }

                              if (classOM.method8569(var40, 1754865660) && var21 == 2) {
                                 var12.method3739(var39, var15, var16, var40, var18, 1781268585);
                              }
                           }
                        }
                     }
                  }
               }
            }
         } catch (RuntimeException var35) {
            throw classEG.method3884(var35, "mi.ey(" + ')');
         }
      } finally {
         client.field885 = var10;
      }
   }

   @ObfuscatedSignature(descriptor = "(S)Ljava/util/Map;")
   @ObfuscatedName("ae")
   Map method7587(short var1) {
      try {
         HashMap var2 = new HashMap();
         ArrayList var3 = new ArrayList();
         var3.addAll(this.field4508.entrySet());
         boolean var4 = false;

         while (!var4) {
            if (var1 != 211) {
               throw new IllegalStateException();
            }

            var4 = true;

            for (int var6 = 0; var6 < var3.size() - 1; var6++) {
               if (var1 != 211) {
                  throw new IllegalStateException();
               }

               if (((classMS)((Entry)var3.get(var6)).getValue()).method7660((byte)20) > ((classMS)((Entry)var3.get(1 + var6)).getValue()).method7660((byte)-33)
                  )
                {
                  if (var1 != 211) {
                     throw new IllegalStateException();
                  }

                  Entry var5 = (Entry)var3.get(var6);
                  var3.set(var6, var3.get(1 + var6));
                  var3.set(var6 + 1, var5);
                  var4 = false;
               }
            }
         }

         Iterator var9 = var3.iterator();

         while (var9.hasNext()) {
            if (var1 != 211) {
               throw new IllegalStateException();
            }

            Entry var7 = (Entry)var9.next();
            var2.put(var7.getKey(), var7.getValue());
         }

         return var2;
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "mi.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Lms;")
   @ObfuscatedName("ab")
   classMS method7591(String var1, int var2) {
      try {
         return (classMS)this.field4508.get(var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "mi.ab(" + ')');
      }
   }
}
