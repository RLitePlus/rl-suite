import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nc")
public class MidiPcmStream extends PcmStream {
   @ObfuscatedSignature(descriptor = "Lna;")
   @ObfuscatedName("bk")
   MidiFileReader midiFile;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field4235 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field4234 = 4;
   @ObfuscatedName("bg")
   int[] field4223;
   @ObfuscatedName("ae")
   static ThreadPoolExecutor field4233 = null;
   @ObfuscatedName("aj")
   PriorityQueue priorityQueue = new PriorityQueue(5, new class356());
   @ObfuscatedName("ad")
   int field4212;
   @ObfuscatedName("aw")
   int[] field4226;
   @ObfuscatedName("ap")
   int[] field4209;
   @ObfuscatedName("an")
   static AtomicBoolean field4232 = null;
   @ObfuscatedSignature(descriptor = "Lqi;")
   @ObfuscatedName("au")
   NodeHashTable musicPatches;
   @ObfuscatedName("az")
   int field4211;
   @ObfuscatedName("ak")
   public int field4208 = 0;
   @ObfuscatedName("ai")
   int[] field4213;
   @ObfuscatedName("as")
   int[] field4225;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field4236 = 1;
   @ObfuscatedName("ab")
   int[] field4215;
   @ObfuscatedName("ax")
   int[] field4216;
   @ObfuscatedName("ar")
   int[] field4217;
   @ObfuscatedName("ah")
   int[] field4218;
   @ObfuscatedName("aa")
   int[] field4219;
   @ObfuscatedName("aq")
   int[] field4230;
   @ObfuscatedName("bp")
   long field4239;
   @ObfuscatedName("bo")
   int[] field4207;
   @ObfuscatedName("be")
   int[] field4221;
   @ObfuscatedSignature(descriptor = "[[Lnd;")
   @ObfuscatedName("bs")
   MusicPatchNode[][] field4224;
   @ObfuscatedSignature(descriptor = "[[Lnd;")
   @ObfuscatedName("bz")
   MusicPatchNode[][] field4220;
   @ObfuscatedName("ac")
   int[] field4214;
   @ObfuscatedName("bb")
   boolean field4241;
   @ObfuscatedName("bj")
   int track;
   @ObfuscatedName("bm")
   int trackLength;
   @ObfuscatedName("ay")
   int[] field4210;
   @ObfuscatedName("bt")
   long field4240;
   @ObfuscatedSignature(descriptor = "Lnk;")
   @ObfuscatedName("bu")
   MusicPatchPcmStream patchStream;
   @ObfuscatedSignature(descriptor = "Ldm;")
   @ObfuscatedName("ba")
   PcmPlayer field4228;

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("el")
   void method7710(int var1, int var2) {
      this.field4223[var1] = var2;
      this.field4210[var1] = (int)(2097152.0 * Math.pow(2.0, var2 * 5.493164E-4F) + 0.5);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   public int method7622(int var1) {
      try {
         return this.field4211 * -2096891659;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "nc.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("an")
   public void method7629(byte var1) {
      try {
         if (this.priorityQueue == null) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }
         } else {
            if (null != field4232) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               field4232.set(true);
            }

            field4232 = new AtomicBoolean(false);
            AtomicBoolean var2 = field4232;
            if (null == field4233) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               int var3 = Runtime.getRuntime().availableProcessors();
               field4233 = new ThreadPoolExecutor(0, var3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), new class348(this));
            }

            field4233.submit(new class352(this, var2));
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "nc.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnc;IIII)V")
   @ObfuscatedName("ze")
   public static void method7672(MidiPcmStream var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method7666(var1, var1, var1, var1);
      }

      try {
         MusicPatchNode var5 = var0.field4224[var1][var2];
         if (var5 == null) {
            if (var4 != -2126339302) {
               throw new IllegalStateException();
            }
         } else {
            var0.field4224[var1][var2] = null;
            if (0 != (var0.field4226[var1] & 2)) {
               if (var4 != -2126339302) {
                  throw new IllegalStateException();
               }

               for (MusicPatchNode var6 = (MusicPatchNode)var0.patchStream.queue.last(); null != var6; var6 = (MusicPatchNode)var0.patchStream.queue.previous()) {
                  if (var4 != -2126339302) {
                     throw new IllegalStateException();
                  }

                  if (var5.field4253 * 591677655 == 591677655 * var6.field4253) {
                     if (var4 != -2126339302) {
                        return;
                     }

                     if (var6.field4243 * 498415289 < 0) {
                        if (var4 != -2126339302) {
                           throw new IllegalStateException();
                        }

                        if (var5 != var6) {
                           if (var4 != -2126339302) {
                              return;
                           }

                           var5.field4243 = 0;
                           break;
                        }
                     }
                  }
               }
            } else {
               var5.field4243 = 0;
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "nc.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnq;Z)V")
   @ObfuscatedName("cg")
   public void method7641(MusicTrack var1, boolean var2) {
      synchronized (this.field4228) {
         this.clear(1806462691);
         this.midiFile.method7551(var1.midi);
         this.field4241 = var2;
         this.field4239 = 0L;
         int var4 = this.midiFile.trackCount();

         for (int var5 = 0; var5 < var4; var5++) {
            this.midiFile.gotoTrack(var5);
            this.midiFile.readTrackLength(var5);
            classRV.method9844(this.midiFile, var5);
         }

         this.track = this.midiFile.getPrioritizedTrack() * -1684346213;
         this.trackLength = -668318079 * this.midiFile.trackLengths[this.track * 1501424531];
         this.field4240 = this.midiFile.method7591(this.trackLength * 715127169) * -1953962277268921533L;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ae")
   public void method7632(byte var1) {
      try {
         synchronized (this.field4228) {
            for (MusicPatch var3 = (MusicPatch)this.musicPatches.first(); var3 != null; var3 = (MusicPatch)this.musicPatches.next()) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               var3._remove((short)-6698);
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "nc.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("de")
   void method7690(int var1) {
      if (var1 >= 0) {
         this.field4213[var1] = 928311585;
         this.field4225[var1] = -706959493;
         this.field4214[var1] = 16383;
         this.field4218[var1] = 871667354;
         this.field4219[var1] = 0;
         this.field4230[var1] = -1936748259;
         method7700(this, var1, 1612797159);
         this.method7701(var1, -284200381);
         this.field4226[var1] = 0;
         this.field4221[var1] = 32767;
         this.field4207[var1] = 256;
         this.field4209[var1] = 0;
         method7711(this, var1, 8192, (byte)20);
      } else {
         for (int var2 = 0; var2 < 16; var2++) {
            this.method7691(var2, 2025023543);
         }
      }
   }

   public MidiPcmStream(PcmPlayer var1) {
      this.field4226 = new int[16];
      this.field4209 = new int[16];
      this.field4210 = new int[16];
      this.field4211 = -2030871296;
      this.field4212 = -905717312;
      this.field4213 = new int[16];
      this.field4225 = new int[16];
      this.field4214 = new int[16];
      this.field4215 = new int[16];
      this.field4216 = new int[16];
      this.field4217 = new int[16];
      this.field4218 = new int[16];
      this.field4219 = new int[16];
      this.field4230 = new int[16];
      this.field4221 = new int[16];
      this.field4207 = new int[16];
      this.field4223 = new int[16];
      this.field4224 = new MusicPatchNode[16][128];
      this.field4220 = new MusicPatchNode[16][128];
      this.midiFile = new MidiFileReader();
      this.patchStream = new MusicPatchPcmStream(this);
      this.field4228 = null;
      this.field4228 = var1;
      this.musicPatches = new NodeHashTable(128);
      this.method7697(1750419179);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ad")
   public void clear(int var1) {
      try {
         synchronized (this.field4228) {
            this.midiFile.clear();
            this.method7697(-258822295);
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "nc.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ct")
   public void method7630() {
      if (this.priorityQueue != null) {
         if (null != field4232) {
            field4232.set(true);
         }

         field4232 = new AtomicBoolean(false);
         AtomicBoolean var1 = field4232;
         if (null == field4233) {
            int var2 = Runtime.getRuntime().availableProcessors();
            field4233 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), new class348(this));
         }

         field4233.submit(new class352(this, var1));
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cv")
   public boolean method7648() {
      synchronized (this.field4228) {
         return this.midiFile.isReady();
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dp")
   void method7684(int var1, int var2) {
      this.field4218[var1] = var2;
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("ab")
   void method7659(int var1, int var2, byte var3) {
      try {
         this.field4215[var1] = var2;
         this.field4217[var1] = var2 & -128;
         this.method7662(var1, var2, -1461542651);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "nc.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cz")
   public void method7646() {
      synchronized (this.field4228) {
         this.midiFile.clear();
         this.method7697(-1132316884);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("be")
   void method7694(int var1, byte var2) {
      try {
         for (MusicPatchNode var3 = (MusicPatchNode)this.patchStream.queue.last(); var3 != null; var3 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            if (var1 >= 0) {
               if (var2 <= 0) {
                  return;
               }

               if (var1 != var3.field4253 * 591677655) {
                  continue;
               }

               if (var2 <= 0) {
                  throw new IllegalStateException();
               }
            }

            if (var3.field4243 * 498415289 < 0) {
               if (var2 <= 0) {
                  return;
               }

               this.field4224[var3.field4253 * 591677655][1059417007 * var3.field4248] = null;
               var3.field4243 = 0;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "nc.be(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnd;ZS)V")
   @ObfuscatedName("ah")
   void method7667(MusicPatchNode var1, boolean var2, short var3) {
      try {
         int var5;
         label31: {
            int var4 = var1.rawSound.samples.length;
            if (var2) {
               if (var3 <= 168) {
                  throw new IllegalStateException();
               }

               if (var1.rawSound.field1471) {
                  int var6 = var4 + var4 - var1.rawSound.sampleRate;
                  var5 = (int)((long)var6 * this.field4209[591677655 * var1.field4253] >> 6);
                  var4 <<= 8;
                  if (var5 >= var4) {
                     if (var3 <= 168) {
                        return;
                     }

                     var5 = var4 + var4 - 1 - var5;
                     var1.stream.method3273(true);
                  }
                  break label31;
               }
            }

            var5 = (int)((long)var4 * this.field4209[591677655 * var1.field4253] >> 6);
         }

         var1.stream.method3269(var5);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "nc.ah(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;)Z")
   @ObfuscatedName("vk")
   public static boolean method7649(MidiPcmStream var0) {
      synchronized (var0.field4228) {
         return var0.midiFile.isReady();
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dd")
   void method7660(int var1, int var2) {
      this.field4215[var1] = var2;
      this.field4217[var1] = var2 & 1965646881;
      this.method7662(var1, var2, -1572102921);
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("ao")
   void method7685(int var1, int var2, byte var3) {
      try {
         this.field4218[var1] = var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "nc.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("aa")
   void method7689(int var1, byte var2) {
      try {
         for (MusicPatchNode var3 = (MusicPatchNode)this.patchStream.queue.last(); var3 != null; var3 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var2 != 80) {
               throw new IllegalStateException();
            }

            if (var1 >= 0) {
               if (var2 != 80) {
                  throw new IllegalStateException();
               }

               if (var1 != 591677655 * var3.field4253) {
                  continue;
               }

               if (var2 != 80) {
                  throw new IllegalStateException();
               }
            }

            if (var3.stream != null) {
               if (var2 != 80) {
                  return;
               }

               var3.stream.method3287(1063377631 * EnumComposition.field2157 / 100);
               if (RawPcmStream.method3305(var3.stream)) {
                  this.patchStream.mixer.addSubStream(var3.stream);
               }

               var3.method7737(1641873761);
            }

            if (498415289 * var3.field4243 < 0) {
               if (var2 != 80) {
                  return;
               }

               this.field4224[591677655 * var3.field4253][1059417007 * var3.field4248] = null;
            }

            var3.remove();
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "nc.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aq")
   void method7691(int var1, int var2) {
      try {
         if (var1 < 0) {
            if (var2 != 2025023543) {
               throw new IllegalStateException();
            } else {
               for (int var4 = 0; var4 < 16; var4++) {
                  if (var2 != 2025023543) {
                     return;
                  }

                  this.method7691(var4, 2025023543);
               }
            }
         } else {
            this.field4213[var1] = 12800;
            this.field4225[var1] = 8192;
            this.field4214[var1] = 16383;
            this.field4218[var1] = 8192;
            this.field4219[var1] = 0;
            this.field4230[var1] = 8192;
            method7700(this, var1, -1012711649);
            this.method7701(var1, -1808277538);
            this.field4226[var1] = 0;
            this.field4221[var1] = 32767;
            this.field4207[var1] = 256;
            this.field4209[var1] = 0;
            method7711(this, var1, 8192, (byte)51);
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "nc.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bw")
   @Override
   protected void vmethod175(int[] var1, int var2, int var3) {
      if (this.midiFile.isReady()) {
         int var4 = this.field4212 * 1900427791 * this.midiFile.field4169 / (1063377631 * EnumComposition.field2157);

         do {
            long var5 = 8489672142859145567L * this.field4239 + (long)var3 * var4;
            if (this.field4240 * -4973024566956474005L - var5 >= 0L) {
               this.field4239 = 6690113430319434399L * var5;
               break;
            }

            int var7 = (int)((var4 + (this.field4240 * -4973024566956474005L - this.field4239 * 8489672142859145567L) - 1L) / var4);
            this.field4239 += 6690113430319434399L * (long)var4 * var7;
            this.patchStream.fill(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method7723((byte)-11);
         } while (this.midiFile.isReady());
      }

      this.patchStream.fill(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bm")
   void method7697(int var1) {
      try {
         this.method7689(-1, (byte)80);
         this.method7691(-1, 2025023543);

         for (int var2 = 0; var2 < 16; var2++) {
            if (var1 == -610981227) {
               return;
            }

            this.field4216[var2] = this.field4215[var2];
         }

         for (int var4 = 0; var4 < 16; var4++) {
            if (var1 == -610981227) {
               throw new IllegalStateException();
            }

            this.field4217[var4] = this.field4215[var4] & -128;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "nc.bm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bt")
   void method7701(int var1, int var2) {
      try {
         if (0 != (this.field4226[var1] & 4)) {
            if (var2 <= -1920103168) {
               return;
            }

            for (MusicPatchNode var3 = (MusicPatchNode)this.patchStream.queue.last(); null != var3; var3 = (MusicPatchNode)this.patchStream.queue.previous()) {
               if (var2 <= -1920103168) {
                  throw new IllegalStateException();
               }

               if (var1 == 591677655 * var3.field4253) {
                  var3.field4245 = 0;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "nc.bt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ba")
   void method7706(int var1, int var2) {
      try {
         int var3 = var1 & 240;
         if (128 == var3) {
            int var15 = var1 & 15;
            int var21 = var1 >> 8 & 127;
            int var24 = var1 >> 16 & 127;
            method7672(this, var15, var21, var24, -2126339302);
         } else if (144 == var3) {
            if (var2 == 2045566372) {
               throw new IllegalStateException();
            } else {
               int var14 = var1 & 15;
               int var20 = var1 >> 8 & 127;
               int var23 = var1 >> 16 & 127;
               if (var23 > 0) {
                  this.method7664(var14, var20, var23, 1760981052);
               } else {
                  method7672(this, var14, var20, 64, -2126339302);
               }
            }
         } else if (160 == var3) {
            if (var2 != 2045566372) {
               int var13 = var1 & 15;
               int var19 = var1 >> 8 & 127;
               int var22 = var1 >> 16 & 127;
               method7676(this, var13, var19, var22, (byte)1);
            }
         } else if (176 == var3) {
            if (var2 != 2045566372) {
               int var12 = var1 & 15;
               int var18 = var1 >> 8 & 127;
               int var6 = var1 >> 16 & 127;
               if (var18 == 0) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  this.field4217[var12] = (var6 << 14) + (this.field4217[var12] & -2080769);
               }

               if (32 == var18) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  this.field4217[var12] = (var6 << 7) + (this.field4217[var12] & -16257);
               }

               if (1 == var18) {
                  this.field4219[var12] = (var6 << 7) + (this.field4219[var12] & -16257);
               }

               if (33 == var18) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  this.field4219[var12] = var6 + (this.field4219[var12] & -128);
               }

               if (var18 == 5) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  this.field4230[var12] = (var6 << 7) + (this.field4230[var12] & -16257);
               }

               if (var18 == 37) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  this.field4230[var12] = (this.field4230[var12] & -128) + var6;
               }

               if (var18 == 7) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  this.field4213[var12] = (var6 << 7) + (this.field4213[var12] & -16257);
               }

               if (39 == var18) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  this.field4213[var12] = var6 + (this.field4213[var12] & -128);
               }

               if (var18 == 10) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  this.field4225[var12] = (this.field4225[var12] & -16257) + (var6 << 7);
               }

               if (var18 == 42) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  this.field4225[var12] = var6 + (this.field4225[var12] & -128);
               }

               if (11 == var18) {
                  if (var2 == 2045566372) {
                     return;
                  }

                  this.field4214[var12] = (this.field4214[var12] & -16257) + (var6 << 7);
               }

               if (var18 == 43) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  this.field4214[var12] = (this.field4214[var12] & -128) + var6;
               }

               if (64 == var18) {
                  if (var6 >= 64) {
                     if (var2 == 2045566372) {
                        throw new IllegalStateException();
                     }

                     this.field4226[var12] = this.field4226[var12] | 1;
                  } else {
                     this.field4226[var12] = this.field4226[var12] & -2;
                  }
               }

               if (65 == var18) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  if (var6 >= 64) {
                     if (var2 == 2045566372) {
                        throw new IllegalStateException();
                     }

                     this.field4226[var12] = this.field4226[var12] | 2;
                  } else {
                     method7700(this, var12, -1346425022);
                     this.field4226[var12] = this.field4226[var12] & -3;
                  }
               }

               if (var18 == 99) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  this.field4221[var12] = (this.field4221[var12] & 127) + (var6 << 7);
               }

               if (98 == var18) {
                  this.field4221[var12] = (this.field4221[var12] & 16256) + var6;
               }

               if (101 == var18) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  this.field4221[var12] = (var6 << 7) + (this.field4221[var12] & 127) + 16384;
               }

               if (100 == var18) {
                  this.field4221[var12] = (this.field4221[var12] & 16256) + 16384 + var6;
               }

               if (120 == var18) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  this.method7689(var12, (byte)80);
               }

               if (var18 == 121) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  this.method7691(var12, 2025023543);
               }

               if (var18 == 123) {
                  this.method7694(var12, (byte)39);
               }

               if (var18 == 6) {
                  if (var2 == 2045566372) {
                     return;
                  }

                  int var7 = this.field4221[var12];
                  if (var7 == 16384) {
                     if (var2 == 2045566372) {
                        throw new IllegalStateException();
                     }

                     this.field4207[var12] = (this.field4207[var12] & -16257) + (var6 << 7);
                  }
               }

               if (38 == var18) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  int var25 = this.field4221[var12];
                  if (16384 == var25) {
                     if (var2 == 2045566372) {
                        throw new IllegalStateException();
                     }

                     this.field4207[var12] = (this.field4207[var12] & -128) + var6;
                  }
               }

               if (16 == var18) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  this.field4209[var12] = (this.field4209[var12] & -16257) + (var6 << 7);
               }

               if (48 == var18) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  this.field4209[var12] = (this.field4209[var12] & -128) + var6;
               }

               if (var18 == 81) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  if (var6 >= 64) {
                     this.field4226[var12] = this.field4226[var12] | 4;
                  } else {
                     this.method7701(var12, 309020840);
                     this.field4226[var12] = this.field4226[var12] & -5;
                  }
               }

               if (17 == var18) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  method7711(this, var12, (var6 << 7) + (this.field4223[var12] & -16257), (byte)4);
               }

               if (var18 == 49) {
                  if (var2 == 2045566372) {
                     throw new IllegalStateException();
                  }

                  method7711(this, var12, var6 + (this.field4223[var12] & -128), (byte)101);
               }
            }
         } else if (var3 == 192) {
            if (var2 == 2045566372) {
               throw new IllegalStateException();
            } else {
               int var11 = var1 & 15;
               int var17 = var1 >> 8 & 127;
               this.method7662(var11, this.field4217[var11] + var17, -1607954060);
            }
         } else if (var3 == 208) {
            int var10 = var1 & 15;
            int var16 = var1 >> 8 & 127;
            this.method7682(var10, var16, -2070156295);
         } else if (224 == var3) {
            int var4 = var1 & 15;
            int var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
            this.method7685(var4, var5, (byte)8);
         } else {
            var3 = var1 & 0xFF;
            if (255 == var3) {
               if (var2 == 2045566372) {
                  throw new IllegalStateException();
               } else {
                  this.method7697(328832646);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "nc.ba(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dn")
   void method7695(int var1) {
      for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
         if ((var1 < 0 || var1 == var2.field4253 * 591677655) && var2.field4243 * 498415289 < 0) {
            this.field4224[var2.field4253 * 591677655][1059417007 * var2.field4248] = null;
            var2.field4243 = 0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnd;I)I")
   @ObfuscatedName("bd")
   int method7716(MusicPatchNode var1, int var2) {
      try {
         MusicPatchNode2 var3 = var1.field4263;
         int var4 = this.field4213[591677655 * var1.field4253] * this.field4214[var1.field4253 * 591677655] + 4096 >> 13;
         var4 = var4 * var4 + 16384 >> 15;
         var4 = var1.field4256 * 399647583 * var4 + 16384 >> 15;
         var4 = 128 + var4 * this.field4211 * -2096891659 >> 8;
         if (var3.field4282 * -521738017 > 0) {
            var4 = (int)(var4 * Math.pow(0.5, 1.953125E-5 * (-1323950597 * var1.field4244) * (var3.field4282 * -521738017)) + 0.5);
         }

         if (var3.field4288 != null) {
            if (var2 == -1989092515) {
               throw new IllegalStateException();
            }

            int var5 = var1.field4246 * -1387418467;
            int var6 = var3.field4288[1 + 2068959101 * var1.field4252];
            if (var1.field4252 * 2068959101 < var3.field4288.length - 2) {
               if (var2 == -1989092515) {
                  throw new IllegalStateException();
               }

               int var7 = (var3.field4288[var1.field4252 * 2068959101] & 255) << 8;
               int var8 = (var3.field4288[2 + 2068959101 * var1.field4252] & 255) << 8;
               var6 += (var3.field4288[2068959101 * var1.field4252 + 3] - var6) * (var5 - var7) / (var8 - var7);
            }

            var4 = var6 * var4 + 32 >> 6;
         }

         if (var1.field4243 * 498415289 > 0 && null != var3.field4289) {
            int var13 = var1.field4243 * 498415289;
            int var14 = var3.field4289[1 + -1743855771 * var1.field4242];
            if (-1743855771 * var1.field4242 < var3.field4289.length - 2) {
               if (var2 == -1989092515) {
                  throw new IllegalStateException();
               }

               int var15 = (var3.field4289[-1743855771 * var1.field4242] & 255) << 8;
               int var16 = (var3.field4289[-1743855771 * var1.field4242 + 2] & 255) << 8;
               var14 += (var13 - var15) * (var3.field4289[3 + -1743855771 * var1.field4242] - var14) / (var16 - var15);
            }

            var4 = var14 * var4 + 32 >> 6;
         }

         return var4;
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "nc.bd(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnd;I)I")
   @ObfuscatedName("br")
   int method7719(MusicPatchNode var1, int var2) {
      try {
         int var3 = this.field4225[591677655 * var1.field4253];
         if (var3 < 8192) {
            if (var2 <= -1595015587) {
               throw new IllegalStateException();
            } else {
               return 32 + var3 * var1.field4250 * 1053004281 >> 6;
            }
         } else {
            return 16384 - ((16384 - var3) * (128 - 1053004281 * var1.field4250) + 32 >> 6);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "nc.br(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;)V")
   @ObfuscatedName("rs")
   public static void method7638(MidiPcmStream var0) {
      synchronized (var0.field4228) {
         for (MusicPatch var2 = (MusicPatch)var0.musicPatches.first(); var2 != null; var2 = (MusicPatch)var0.musicPatches.next()) {
            var2.remove();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("aj")
   @Override
   protected PcmStream firstSubStream() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ec")
   void method7698() {
      this.method7689(-1, (byte)80);
      this.method7691(-1, 2025023543);

      for (int var1 = 0; var1 < 16; var1++) {
         this.field4216[var1] = this.field4215[var1];
      }

      for (int var2 = 0; var2 < 16; var2++) {
         this.field4217[var2] = this.field4215[var2] & -128;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   @Override
   protected int vmethod171() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "nc.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ai")
   public boolean isReady(int var1) {
      try {
         synchronized (this.field4228) {
            return this.midiFile.isReady();
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "nc.ai(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;III)V")
   @ObfuscatedName("jn")
   public static void method7663(MidiPcmStream var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.nextSubStream();
      }

      method7672(var0, var1, var2, 64, -2126339302);
      if (0 != (var0.field4226[var1] & 2)) {
         for (MusicPatchNode var4 = (MusicPatchNode)var0.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)var0.patchStream.queue.next()) {
            if (var1 == 554440236 * var4.field4253 && var4.field4243 * 78701293 < 0) {
               var0.field4224[var1][var4.field4248 * -466074472] = null;
               var0.field4224[var1][var2] = var4;
               int var5 = 648077280 * var4.field4258 + (var4.field4254 * 768962951 * 719611032 * var4.field4259 >> 12);
               var4.field4258 = var4.field4258 + (var2 - var4.field4248 * 1059417007 << 8) * 1462896103;
               var4.field4254 = 809739162 * (var5 - -1799684381 * var4.field4258);
               var4.field4259 = -171047009;
               var4.field4248 = var2 * 708949775;
               return;
            }
         }
      }

      MusicPatch var8 = (MusicPatch)var0.musicPatches.method8915(var0.field4216[var1]);
      if (null != var8) {
         if (null != var8.rawSounds[var2]) {
            RawSound var9 = class107.method3822(var8.rawSounds[var2], (short)1621);
            if (null != var9) {
               MusicPatchNode var6 = new MusicPatchNode();
               var6.field4253 = var1 * 1227434727;
               var6.table = var8;
               var6.rawSound = var9;
               var6.field4263 = var8.field4354[var2];
               var6.field4247 = 1711254275 * var8.field4355[var2];
               var6.field4248 = var2 * 233884495;
               var6.field4256 = 150664777 * (var3 * var3 * 1427620301 * var8.field4358 * var8.field4351[var2] + -1347141010 >> 11);
               var6.field4250 = -1795357359 * (var8.field4352[var2] & -882690916);
               var6.field4258 = ((var2 << 8) - (var8.field4357[var2] & 32767)) * -1238282117;
               var6.field4244 = 0;
               var6.field4246 = 0;
               var6.field4252 = 0;
               var6.field4243 = 621845406;
               var6.field4242 = 0;
               if (0 == var0.field4209[var1]) {
                  var6.stream = RawPcmStream.method3180(
                     var9, var0.method7714(var6, (byte)48), var0.method7716(var6, -1866592691), var0.method7719(var6, 757916367)
                  );
               } else {
                  var6.stream = RawPcmStream.method3180(var9, var0.method7714(var6, (byte)40), 0, var0.method7719(var6, -894652023));
                  var0.method7667(var6, var8.field4357[var2] < 0, (short)11837);
               }

               if (var8.field4357[var2] < 0) {
                  var6.stream.method3242(-1);
               }

               if (var6.field4247 * -1560607576 >= 0) {
                  MusicPatchNode var7 = var0.field4220[var1][-1789002907 * var6.field4247];
                  if (null != var7 && 498415289 * var7.field4243 < 0) {
                     var0.field4224[var1][var7.field4248 * 1059417007] = null;
                     var7.field4243 = 0;
                  }

                  var0.field4220[var1][35559339 * var6.field4247] = var6;
               }

               var0.patchStream.queue.addFirst(var6);
               var0.field4224[var1][var2] = var6;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("au")
   @Override
   protected void skip(int var1) {
      try {
         if (this.midiFile.isReady()) {
            int var2 = this.midiFile.field4169 * 1900427791 * this.field4212 / (EnumComposition.field2157 * 1063377631);

            do {
               long var3 = (long)var1 * var2 + 8489672142859145567L * this.field4239;
               if (this.field4240 * -4973024566956474005L - var3 >= 0L) {
                  this.field4239 = var3 * 6690113430319434399L;
                  break;
               }

               int var5 = (int)((var2 + (-4973024566956474005L * this.field4240 - 8489672142859145567L * this.field4239) - 1L) / var2);
               this.field4239 += (long)var5 * var2 * 6690113430319434399L;
               this.patchStream.skip(var5);
               var1 -= var5;
               this.method7723((byte)54);
            } while (this.midiFile.isReady());
         }

         this.patchStream.skip(var1);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "nc.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnd;I)Z")
   @ObfuscatedName("bl")
   boolean method7725(MusicPatchNode var1, int var2) {
      try {
         if (null == var1.stream) {
            if (var2 != 1842254816) {
               throw new IllegalStateException();
            } else {
               if (498415289 * var1.field4243 >= 0) {
                  if (var2 != 1842254816) {
                     throw new IllegalStateException();
                  }

                  var1.remove();
                  if (35559339 * var1.field4247 > 0) {
                     if (var2 != 1842254816) {
                        throw new IllegalStateException();
                     }

                     if (var1 == this.field4220[591677655 * var1.field4253][35559339 * var1.field4247]) {
                        if (var2 != 1842254816) {
                           throw new IllegalStateException();
                        }

                        this.field4220[var1.field4253 * 591677655][var1.field4247 * 35559339] = null;
                     }
                  }
               }

               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "nc.bl(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;Lnd;)Z")
   @ObfuscatedName("ie")
   public static boolean method7726(MidiPcmStream var0, MusicPatchNode var1) {
      if (var0 == null) {
         var0.method7724();
      }

      if (null == var1.stream) {
         if (498415289 * var1.field4243 >= 0) {
            var1.remove();
            if (35559339 * var1.field4247 > 0 && var1 == var0.field4220[591677655 * var1.field4253][35559339 * var1.field4247]) {
               var0.field4220[var1.field4253 * 591677655][var1.field4247 * 35559339] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnq;ZB)V")
   @ObfuscatedName("az")
   public void setMusicTrack(MusicTrack var1, boolean var2, byte var3) {
      try {
         synchronized (this.field4228) {
            this.clear(1806462691);
            this.midiFile.method7551(var1.midi);
            this.field4241 = var2;
            this.field4239 = 0L;
            int var5 = this.midiFile.trackCount();

            for (int var6 = 0; var6 < var5; var6++) {
               this.midiFile.gotoTrack(var6);
               this.midiFile.readTrackLength(var6);
               classRV.method9844(this.midiFile, var6);
            }

            this.track = this.midiFile.getPrioritizedTrack() * -1684346213;
            this.trackLength = -668318079 * this.midiFile.trackLengths[this.track * 1501424531];
            this.field4240 = this.midiFile.method7591(this.trackLength * 715127169) * -1953962277268921533L;
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "nc.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnc;IIIB)V")
   @ObfuscatedName("ay")
   public static void method7676(MidiPcmStream var0, int var1, int var2, int var3, byte var4) {
      if (var0 == null) {
         var0.method7680(var1, var1, var1, var4);
      }

      try {
         ;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "nc.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bz")
   @Override
   protected PcmStream vmethod166() {
      return this.patchStream;
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bb")
   @Override
   protected PcmStream vmethod164() {
      return this.patchStream;
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("ak")
   @Override
   protected PcmStream nextSubStream() {
      return this.patchStream;
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bg")
   @Override
   protected PcmStream vmethod167() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bs")
   @Override
   protected PcmStream vmethod168() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cx")
   static void runWidgetOnLoadListener(int var0, int var1) {
      try {
         if (var0 == -1) {
            if (var1 != 1491939158) {
               client.method2404(var0);
            } else {
               client.method2404(var0);
            }
         } else if (!WidgetDefinition.method7961(class226.widgetDefinition, var0, -1663993433)) {
            if (var1 != 1491939158) {
               throw new IllegalStateException();
            } else {
               client.method2404(var0);
            }
         } else {
            Widget[] var2 = class226.widgetDefinition.Widget_interfaceComponents[var0];

            for (int var3 = 0; var3 < var2.length; var3++) {
               if (var1 != 1491939158) {
                  client.method2404(var0);
                  return;
               }

               Widget var4 = var2[var3];
               if (null != var4.field4566) {
                  if (var1 != 1491939158) {
                     throw new IllegalStateException();
                  }

                  ScriptEvent var5 = new ScriptEvent();
                  var5.widget = var4;
                  var5.args = var4.field4566;
                  LoginType.runScript(var5, 5000000, 0, (byte)-20);
               }
            }

            client.method2404(var0);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "nc.cx(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;Lnd;)I")
   @ObfuscatedName("ho")
   public static int method7717(MidiPcmStream var0, MusicPatchNode var1) {
      if (var0 == null) {
         var0.vmethod172();
      }

      MusicPatchNode2 var2 = var1.field4263;
      int var3 = var0.field4213[1056746051 * var1.field4253] * var0.field4214[var1.field4253 * 591677655] + 894741839 >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var1.field4256 * 399647583 * var3 + 16384 >> 15;
      var3 = 1151928366 + var3 * var0.field4211 * -2096891659 >> 8;
      if (var2.field4282 * -521738017 > 0) {
         var3 = (int)(var3 * Math.pow(0.5, 1.953125E-5 * (-1323950597 * var1.field4244) * (var2.field4282 * -521738017)) + 0.5);
      }

      if (var2.field4288 != null) {
         int var4 = var1.field4246 * -1387418467;
         int var5 = var2.field4288[1 + 672316237 * var1.field4252];
         if (var1.field4252 * 2068959101 < var2.field4288.length - 2) {
            int var6 = (var2.field4288[var1.field4252 * 1628245263] & -2128060924) << 8;
            int var7 = (var2.field4288[2 + -1974038731 * var1.field4252] & -1800812465) << 8;
            var5 += (var2.field4288[2068959101 * var1.field4252 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      if (var1.field4243 * 41655759 > 0 && null != var2.field4289) {
         int var11 = var1.field4243 * 1725960434;
         int var12 = var2.field4289[1 + -237155802 * var1.field4242];
         if (644720179 * var1.field4242 < var2.field4289.length - 2) {
            int var13 = (var2.field4289[-1743855771 * var1.field4242] & 255) << 8;
            int var14 = (var2.field4289[-1743855771 * var1.field4242 + 2] & -525345912) << 8;
            var12 += (var11 - var13) * (var2.field4289[3 + 38486611 * var1.field4242] - var12) / (var14 - var13);
         }

         var3 = var12 * var3 + 445247805 >> 6;
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;Lnd;)I")
   @ObfuscatedName("fk")
   public static int method7713(MidiPcmStream var0, MusicPatchNode var1) {
      if (var0 == null) {
         var0.method7655();
      }

      int var2 = (643864511 * var1.field4259 * 1520153051 * var1.field4254 >> 12) + 1025719767 * var1.field4258;
      var2 += (var0.field4218[591677655 * var1.field4253] - 8192) * var0.field4207[591677655 * var1.field4253] >> 12;
      MusicPatchNode2 var3 = var1.field4263;
      if (var3.field4287 * -665347531 > 0 && (var3.field4284 * -808663929 > 0 || var0.field4219[var1.field4253 * 591677655] > 0)) {
         int var4 = -808663929 * var3.field4284 << 2;
         int var5 = 1011266985 * var3.field4286 << 1;
         if (var1.field4257 * -1992283931 < var5) {
            var4 = var1.field4257 * -1992283931 * var4 / var5;
         }

         var4 += var0.field4219[var1.field4253 * 591677655] >> 7;
         double var6 = Math.sin((var1.field4251 * 1962630943 & 511) * 0.01227184630308513);
         var2 += (int)(var4 * var6);
      }

      int var10 = (int)(var1.rawSound.start * 256 * Math.pow(2.0, var2 * 3.255208333333333E-4) / (EnumComposition.field2157 * 1063377631) + 0.5);
      return var10 < 1 ? 1 : var10;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bu")
   @Override
   protected void vmethod176(int var1) {
      if (this.midiFile.isReady()) {
         int var2 = this.midiFile.field4169 * 1900427791 * this.field4212 / (EnumComposition.field2157 * 1063377631);

         do {
            long var3 = (long)var1 * var2 + 8489672142859145567L * this.field4239;
            if (this.field4240 * -4973024566956474005L - var3 >= 0L) {
               this.field4239 = var3 * 6690113430319434399L;
               break;
            }

            int var5 = (int)((var2 + (-4973024566956474005L * this.field4240 - 8489672142859145567L * this.field4239) - 1L) / var2);
            this.field4239 += (long)var5 * var2 * 6690113430319434399L;
            this.patchStream.skip(var5);
            var1 -= var5;
            this.method7723((byte)-12);
         } while (this.midiFile.isReady());
      }

      this.patchStream.skip(var1);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ax")
   void method7662(int var1, int var2, int var3) {
      try {
         if (this.field4216[var1] != var2) {
            if (var3 == -1793120611) {
               throw new IllegalStateException();
            }

            this.field4216[var1] = var2;

            for (int var4 = 0; var4 < 128; var4++) {
               if (var3 == -1793120611) {
                  throw new IllegalStateException();
               }

               this.field4220[var1][var4] = null;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "nc.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("bf")
   @Override
   protected void vmethod174(int[] var1, int var2, int var3) {
      if (this.midiFile.isReady()) {
         int var4 = this.field4212 * 1900427791 * this.midiFile.field4169 / (1063377631 * EnumComposition.field2157);

         do {
            long var5 = 8489672142859145567L * this.field4239 + (long)var3 * var4;
            if (this.field4240 * -4973024566956474005L - var5 >= 0L) {
               this.field4239 = 6690113430319434399L * var5;
               break;
            }

            int var7 = (int)((var4 + (this.field4240 * -4973024566956474005L - this.field4239 * 8489672142859145567L) - 1L) / var4);
            this.field4239 += 6690113430319434399L * (long)var4 * var7;
            this.patchStream.fill(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method7723((byte)-103);
         } while (this.midiFile.isReady());
      }

      this.patchStream.fill(var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ch")
   public int method7623() {
      return this.field4211 * -2096891659;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bx")
   public int method7624() {
      return this.field4211 * -2096891659;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bv")
   public int method7625() {
      return this.field4211 * -1124469817;
   }

   @ObfuscatedSignature(descriptor = "(Lnq;Lqm;Lds;)Z")
   @ObfuscatedName("ce")
   public boolean method7626(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
      synchronized (this.field4228) {
         boolean var5 = true;
         synchronized (this.priorityQueue) {
            this.priorityQueue.clear();
         }

         for (class358 var17 = (class358)var1.field4326.first(); var17 != null; var17 = (class358)var1.field4326.next()) {
            int var7 = (int)var17.key;
            MusicPatch var8 = (MusicPatch)this.musicPatches.method8915(var7);
            if (var8 == null) {
               var8 = class200.method4653(var2, var7, (byte)-17);
               if (var8 == null) {
                  var5 = false;
                  continue;
               }

               this.musicPatches.put(var8, var7);
            }

            if (!var8.method7859(var3, var17.field4362, (byte)91)) {
               var5 = false;
            } else if (this.priorityQueue != null) {
               synchronized (this.priorityQueue) {
                  for (class107 var11 : var8.field4359) {
                     this.priorityQueue.add(new classNR(var17.field4363 * 368452443, var11));
                  }
               }
            }
         }

         return var5;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnq;Lqm;Lds;)Z")
   @ObfuscatedName("cu")
   public boolean method7627(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
      synchronized (this.field4228) {
         boolean var5 = true;
         synchronized (this.priorityQueue) {
            this.priorityQueue.clear();
         }

         for (class358 var17 = (class358)var1.field4326.first(); var17 != null; var17 = (class358)var1.field4326.next()) {
            int var7 = (int)var17.key;
            MusicPatch var8 = (MusicPatch)this.musicPatches.method8915(var7);
            if (var8 == null) {
               var8 = class200.method4653(var2, var7, (byte)-27);
               if (var8 == null) {
                  var5 = false;
                  continue;
               }

               this.musicPatches.put(var8, var7);
            }

            if (!var8.method7859(var3, var17.field4362, (byte)119)) {
               var5 = false;
            } else if (this.priorityQueue != null) {
               synchronized (this.priorityQueue) {
                  for (class107 var11 : var8.field4359) {
                     this.priorityQueue.add(new classNR(var17.field4363 * -303180047, var11));
                  }
               }
            }
         }

         return var5;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dm")
   void method7686(int var1, int var2) {
      this.field4218[var1] = var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cm")
   public void method7631() {
      if (this.priorityQueue != null) {
         if (null != field4232) {
            field4232.set(true);
         }

         field4232 = new AtomicBoolean(false);
         AtomicBoolean var1 = field4232;
         if (null == field4233) {
            int var2 = Runtime.getRuntime().availableProcessors();
            field4233 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), new class348(this));
         }

         field4233.submit(new class352(this, var1));
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnq;Lqm;Lds;B)Z")
   @ObfuscatedName("ag")
   public boolean updateExternalPlayer(MusicTrack var1, AbstractArchive var2, SoundCache var3, byte var4) {
      try {
         synchronized (this.field4228) {
            boolean var6 = true;
            synchronized (this.priorityQueue) {
               this.priorityQueue.clear();
            }

            for (class358 var19 = (class358)var1.field4326.first(); var19 != null; var19 = (class358)var1.field4326.next()) {
               int var8 = (int)var19.key;
               MusicPatch var9 = (MusicPatch)this.musicPatches.method8915(var8);
               if (var9 == null) {
                  if (var4 != 15) {
                     throw new IllegalStateException();
                  }

                  var9 = class200.method4653(var2, var8, (byte)-96);
                  if (var9 == null) {
                     if (var4 != 15) {
                        throw new IllegalStateException();
                     }

                     var6 = false;
                     continue;
                  }

                  this.musicPatches.put(var9, var8);
               }

               if (!var9.method7859(var3, var19.field4362, (byte)115)) {
                  if (var4 != 15) {
                     throw new IllegalStateException();
                  }

                  var6 = false;
               } else if (this.priorityQueue != null) {
                  if (var4 != 15) {
                     throw new IllegalStateException();
                  }

                  synchronized (this.priorityQueue) {
                     Iterator var11 = var9.field4359.iterator();

                     while (var11.hasNext()) {
                        if (var4 != 15) {
                           throw new IllegalStateException();
                        }

                        class107 var12 = (class107)var11.next();
                        this.priorityQueue.add(new classNR(var19.field4363 * 368452443, var12));
                     }
                  }
               }
            }

            return var6;
         }
      } catch (RuntimeException var18) {
         throw RestClientThreadFactory.newRunException(var18, "nc.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("eg")
   void method7707(int var1) {
      int var2 = var1 & -130368485;
      if (948072989 == var2) {
         int var13 = var1 & 15;
         int var19 = var1 >> 8 & 127;
         int var22 = var1 >> 16 & 127;
         method7672(this, var13, var19, var22, -2126339302);
      } else if (144 == var2) {
         int var12 = var1 & 15;
         int var18 = var1 >> 8 & 1655656326;
         int var21 = var1 >> 16 & 127;
         if (var21 > 0) {
            this.method7664(var12, var18, var21, -349127392);
         } else {
            method7672(this, var12, var18, -595648836, -2126339302);
         }
      } else if (160 == var2) {
         int var11 = var1 & 15;
         int var17 = var1 >> 8 & 127;
         int var20 = var1 >> 16 & -2012663372;
         method7676(this, var11, var17, var20, (byte)1);
      } else if (524956775 == var2) {
         int var10 = var1 & 15;
         int var16 = var1 >> 8 & -1426288549;
         int var5 = var1 >> 16 & 1417418127;
         if (var16 == 0) {
            this.field4217[var10] = (var5 << 14) + (this.field4217[var10] & -2080769);
         }

         if (1917156896 == var16) {
            this.field4217[var10] = (var5 << 7) + (this.field4217[var10] & -16257);
         }

         if (1 == var16) {
            this.field4219[var10] = (var5 << 7) + (this.field4219[var10] & -16257);
         }

         if (-345352203 == var16) {
            this.field4219[var10] = var5 + (this.field4219[var10] & -128);
         }

         if (var16 == 5) {
            this.field4230[var10] = (var5 << 7) + (this.field4230[var10] & -16257);
         }

         if (var16 == -1370808158) {
            this.field4230[var10] = (this.field4230[var10] & -128) + var5;
         }

         if (var16 == 7) {
            this.field4213[var10] = (var5 << 7) + (this.field4213[var10] & -1631552328);
         }

         if (1392170388 == var16) {
            this.field4213[var10] = var5 + (this.field4213[var10] & -128);
         }

         if (var16 == 10) {
            this.field4225[var10] = (this.field4225[var10] & -1841008954) + (var5 << 7);
         }

         if (var16 == 42) {
            this.field4225[var10] = var5 + (this.field4225[var10] & -128);
         }

         if (11 == var16) {
            this.field4214[var10] = (this.field4214[var10] & 1043119450) + (var5 << 7);
         }

         if (var16 == -1302369774) {
            this.field4214[var10] = (this.field4214[var10] & -128) + var5;
         }

         if (1661928913 == var16) {
            if (var5 >= 64) {
               this.field4226[var10] = this.field4226[var10] | 1;
            } else {
               this.field4226[var10] = this.field4226[var10] & -2;
            }
         }

         if (65 == var16) {
            if (var5 >= 64) {
               this.field4226[var10] = this.field4226[var10] | 2;
            } else {
               method7700(this, var10, 2024705569);
               this.field4226[var10] = this.field4226[var10] & -3;
            }
         }

         if (var16 == 99) {
            this.field4221[var10] = (this.field4221[var10] & 685607361) + (var5 << 7);
         }

         if (13459350 == var16) {
            this.field4221[var10] = (this.field4221[var10] & 152784642) + var5;
         }

         if (101 == var16) {
            this.field4221[var10] = (var5 << 7) + (this.field4221[var10] & 127) + -434818451;
         }

         if (-2027107617 == var16) {
            this.field4221[var10] = (this.field4221[var10] & 16256) + 418428395 + var5;
         }

         if (-1153295242 == var16) {
            this.method7689(var10, (byte)80);
         }

         if (var16 == -1206108731) {
            this.method7691(var10, 2025023543);
         }

         if (var16 == 1904359637) {
            this.method7694(var10, (byte)89);
         }

         if (var16 == 6) {
            int var6 = this.field4221[var10];
            if (var6 == 16384) {
               this.field4207[var10] = (this.field4207[var10] & -16257) + (var5 << 7);
            }
         }

         if (-1487185599 == var16) {
            int var23 = this.field4221[var10];
            if (16384 == var23) {
               this.field4207[var10] = (this.field4207[var10] & -128) + var5;
            }
         }

         if (16 == var16) {
            this.field4209[var10] = (this.field4209[var10] & 487906038) + (var5 << 7);
         }

         if (-74638402 == var16) {
            this.field4209[var10] = (this.field4209[var10] & -128) + var5;
         }

         if (var16 == -2044464421) {
            if (var5 >= 64) {
               this.field4226[var10] = this.field4226[var10] | 4;
            } else {
               this.method7701(var10, 859775870);
               this.field4226[var10] = this.field4226[var10] & -1071739442;
            }
         }

         if (17 == var16) {
            method7711(this, var10, (var5 << 7) + (this.field4223[var10] & -16257), (byte)76);
         }

         if (var16 == 49) {
            method7711(this, var10, var5 + (this.field4223[var10] & -128), (byte)46);
         }
      } else if (var2 == 192) {
         int var9 = var1 & 15;
         int var15 = var1 >> 8 & 127;
         this.method7662(var9, this.field4217[var9] + var15, 1689538918);
      } else if (var2 == 208) {
         int var8 = var1 & 15;
         int var14 = var1 >> 8 & 127;
         this.method7682(var8, var14, -2070156295);
      } else if (1726760873 == var2) {
         int var3 = var1 & 15;
         int var4 = (var1 >> 8 & 127) + (var1 >> 9 & 1738846271);
         this.method7685(var3, var4, (byte)8);
      } else {
         var2 = var1 & -1585342935;
         if (255 == var2) {
            this.method7697(-1113097242);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ar")
   void method7664(int var1, int var2, int var3, int var4) {
      try {
         method7672(this, var1, var2, 64, -2126339302);
         if (0 != (this.field4226[var1] & 2)) {
            if (var4 == 1127628544) {
               return;
            }

            for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.first(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.next()) {
               if (var1 == 591677655 * var5.field4253) {
                  if (var4 == 1127628544) {
                     throw new IllegalStateException();
                  }

                  if (var5.field4243 * 498415289 < 0) {
                     if (var4 == 1127628544) {
                        throw new IllegalStateException();
                     }

                     this.field4224[var1][var5.field4248 * 1059417007] = null;
                     this.field4224[var1][var2] = var5;
                     int var6 = 1025719767 * var5.field4258 + (var5.field4254 * 1520153051 * 643864511 * var5.field4259 >> 12);
                     var5.field4258 = var5.field4258 + (var2 - var5.field4248 * 1059417007 << 8) * 1462896103;
                     var5.field4254 = 841409107 * (var6 - 1025719767 * var5.field4258);
                     var5.field4259 = -175902720;
                     var5.field4248 = var2 * 233884495;
                     return;
                  }
               }
            }
         }

         MusicPatch var10 = (MusicPatch)this.musicPatches.method8915(this.field4216[var1]);
         if (null == var10) {
            if (var4 == 1127628544) {
               throw new IllegalStateException();
            }
         } else if (null == var10.rawSounds[var2]) {
            if (var4 == 1127628544) {
               throw new IllegalStateException();
            }
         } else {
            RawSound var11 = class107.method3822(var10.rawSounds[var2], (short)1621);
            if (null == var11) {
               if (var4 != 1127628544) {
                  ;
               }
            } else {
               MusicPatchNode var7 = new MusicPatchNode();
               var7.field4253 = var1 * 1227434727;
               var7.table = var10;
               var7.rawSound = var11;
               var7.field4263 = var10.field4354[var2];
               var7.field4247 = 1711254275 * var10.field4355[var2];
               var7.field4248 = var2 * 233884495;
               var7.field4256 = 13170847 * (var3 * var3 * -1767540733 * var10.field4358 * var10.field4351[var2] + 1024 >> 11);
               var7.field4250 = -17932215 * (var10.field4352[var2] & 255);
               var7.field4258 = ((var2 << 8) - (var10.field4357[var2] & 32767)) * 1462896103;
               var7.field4244 = 0;
               var7.field4246 = 0;
               var7.field4252 = 0;
               var7.field4243 = -1676144521;
               var7.field4242 = 0;
               if (0 == this.field4209[var1]) {
                  var7.stream = RawPcmStream.method3180(
                     var11, this.method7714(var7, (byte)112), this.method7716(var7, 1998631384), this.method7719(var7, 859940955)
                  );
               } else {
                  var7.stream = RawPcmStream.method3180(var11, this.method7714(var7, (byte)122), 0, this.method7719(var7, 2034409111));
                  boolean var10002;
                  if (var10.field4357[var2] < 0) {
                     if (var4 == 1127628544) {
                        throw new IllegalStateException();
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  this.method7667(var7, var10002, (short)24108);
               }

               if (var10.field4357[var2] < 0) {
                  var7.stream.method3242(-1);
               }

               if (var7.field4247 * 35559339 >= 0) {
                  MusicPatchNode var8 = this.field4220[var1][35559339 * var7.field4247];
                  if (null != var8) {
                     if (var4 == 1127628544) {
                        return;
                     }

                     if (498415289 * var8.field4243 < 0) {
                        this.field4224[var1][var8.field4248 * 1059417007] = null;
                        var8.field4243 = 0;
                     }
                  }

                  this.field4220[var1][35559339 * var7.field4247] = var7;
               }

               this.patchStream.queue.addFirst(var7);
               this.field4224[var1][var2] = var7;
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "nc.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cb")
   public void method7633() {
      synchronized (this.field4228) {
         for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
            var2._remove((short)-9757);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;I)V")
   @ObfuscatedName("vy")
   public static void method7692(MidiPcmStream var0, int var1) {
      if (var0 == null) {
         var0.vmethod168();
      }

      if (var1 >= 0) {
         var0.field4213[var1] = 12800;
         var0.field4225[var1] = 8192;
         var0.field4214[var1] = 16383;
         var0.field4218[var1] = 8192;
         var0.field4219[var1] = 0;
         var0.field4230[var1] = 8192;
         method7700(var0, var1, 2028909425);
         var0.method7701(var1, -114425874);
         var0.field4226[var1] = 0;
         var0.field4221[var1] = 32767;
         var0.field4207[var1] = 256;
         var0.field4209[var1] = 0;
         method7711(var0, var1, 8192, (byte)69);
      } else {
         for (int var2 = 0; var2 < 16; var2++) {
            var0.method7691(var2, 2025023543);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("co")
   public void method7639() {
      synchronized (this.field4228) {
         for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
            var2.remove();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;Lnd;)Z")
   @ObfuscatedName("jm")
   public static boolean method7727(MidiPcmStream var0, MusicPatchNode var1) {
      if (var0 == null) {
         var0.method7729(var1);
      }

      if (null == var1.stream) {
         if (498415289 * var1.field4243 >= 0) {
            var1.remove();
            if (35559339 * var1.field4247 > 0 && var1 == var0.field4220[591677655 * var1.field4253][35559339 * var1.field4247]) {
               var0.field4220[var1.field4253 * 591677655][var1.field4247 * 35559339] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dv")
   void method7665(int var1, int var2, int var3) {
      method7672(this, var1, var2, 64, -2126339302);
      if (0 != (this.field4226[var1] & 2)) {
         for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
            if (var1 == 591677655 * var4.field4253 && var4.field4243 * 498415289 < 0) {
               this.field4224[var1][var4.field4248 * 1059417007] = null;
               this.field4224[var1][var2] = var4;
               int var5 = 1025719767 * var4.field4258 + (var4.field4254 * 1520153051 * 643864511 * var4.field4259 >> 12);
               var4.field4258 = var4.field4258 + (var2 - var4.field4248 * 1059417007 << 8) * 1462896103;
               var4.field4254 = 841409107 * (var5 - 1025719767 * var4.field4258);
               var4.field4259 = -175902720;
               var4.field4248 = var2 * 233884495;
               return;
            }
         }
      }

      MusicPatch var8 = (MusicPatch)this.musicPatches.method8915(this.field4216[var1]);
      if (null != var8) {
         if (null != var8.rawSounds[var2]) {
            RawSound var9 = class107.method3822(var8.rawSounds[var2], (short)1621);
            if (null != var9) {
               MusicPatchNode var6 = new MusicPatchNode();
               var6.field4253 = var1 * 1227434727;
               var6.table = var8;
               var6.rawSound = var9;
               var6.field4263 = var8.field4354[var2];
               var6.field4247 = 1711254275 * var8.field4355[var2];
               var6.field4248 = var2 * 233884495;
               var6.field4256 = 13170847 * (var3 * var3 * -1767540733 * var8.field4358 * var8.field4351[var2] + 1024 >> 11);
               var6.field4250 = -17932215 * (var8.field4352[var2] & 255);
               var6.field4258 = ((var2 << 8) - (var8.field4357[var2] & 32767)) * 1462896103;
               var6.field4244 = 0;
               var6.field4246 = 0;
               var6.field4252 = 0;
               var6.field4243 = -1676144521;
               var6.field4242 = 0;
               if (0 == this.field4209[var1]) {
                  var6.stream = RawPcmStream.method3180(
                     var9, this.method7714(var6, (byte)47), this.method7716(var6, 382956161), this.method7719(var6, -819883890)
                  );
               } else {
                  var6.stream = RawPcmStream.method3180(var9, this.method7714(var6, (byte)106), 0, this.method7719(var6, -791815798));
                  this.method7667(var6, var8.field4357[var2] < 0, (short)7680);
               }

               if (var8.field4357[var2] < 0) {
                  var6.stream.method3242(-1);
               }

               if (var6.field4247 * 35559339 >= 0) {
                  MusicPatchNode var7 = this.field4220[var1][35559339 * var6.field4247];
                  if (null != var7 && 498415289 * var7.field4243 < 0) {
                     this.field4224[var1][var7.field4248 * 1059417007] = null;
                     var7.field4243 = 0;
                  }

                  this.field4220[var1][35559339 * var6.field4247] = var6;
               }

               this.patchStream.queue.addFirst(var6);
               this.field4224[var1][var2] = var6;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnq;Z)V")
   @ObfuscatedName("cp")
   public void method7643(MusicTrack var1, boolean var2) {
      synchronized (this.field4228) {
         this.clear(1806462691);
         this.midiFile.method7551(var1.midi);
         this.field4241 = var2;
         this.field4239 = 0L;
         int var4 = this.midiFile.trackCount();

         for (int var5 = 0; var5 < var4; var5++) {
            this.midiFile.gotoTrack(var5);
            this.midiFile.readTrackLength(var5);
            classRV.method9844(this.midiFile, var5);
         }

         this.track = this.midiFile.getPrioritizedTrack() * -1684346213;
         this.trackLength = -668318079 * this.midiFile.trackLengths[this.track * 1501424531];
         this.field4240 = this.midiFile.method7591(this.trackLength * 715127169) * -1953962277268921533L;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnq;Z)V")
   @ObfuscatedName("cd")
   public void method7644(MusicTrack var1, boolean var2) {
      synchronized (this.field4228) {
         this.clear(1806462691);
         this.midiFile.method7551(var1.midi);
         this.field4241 = var2;
         this.field4239 = 0L;
         int var4 = this.midiFile.trackCount();

         for (int var5 = 0; var5 < var4; var5++) {
            this.midiFile.gotoTrack(var5);
            this.midiFile.readTrackLength(var5);
            classRV.method9844(this.midiFile, var5);
         }

         this.track = this.midiFile.getPrioritizedTrack() * 162864102;
         this.trackLength = 274499574 * this.midiFile.trackLengths[this.track * -2068796239];
         this.field4240 = this.midiFile.method7591(this.trackLength * 715127169) * -1953962277268921533L;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;I)V")
   @ObfuscatedName("tm")
   public static void method7619(MidiPcmStream var0, int var1) {
      synchronized (var0.field4228) {
         var0.field4211 = var1 * 1608673292;
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("ap")
   @Override
   protected void fill(int[] var1, int var2, int var3) {
      try {
         if (this.midiFile.isReady()) {
            int var4 = this.field4212 * 1900427791 * this.midiFile.field4169 / (1063377631 * EnumComposition.field2157);

            do {
               long var5 = 8489672142859145567L * this.field4239 + (long)var3 * var4;
               if (this.field4240 * -4973024566956474005L - var5 >= 0L) {
                  this.field4239 = 6690113430319434399L * var5;
                  break;
               }

               int var7 = (int)((var4 + (this.field4240 * -4973024566956474005L - this.field4239 * 8489672142859145567L) - 1L) / var4);
               this.field4239 += 6690113430319434399L * (long)var4 * var7;
               this.patchStream.fill(var1, var2, var7);
               var2 += var7;
               var3 -= var7;
               this.method7723((byte)-32);
            } while (this.midiFile.isReady());
         }

         this.patchStream.fill(var1, var2, var3);
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "nc.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnd;)I")
   @ObfuscatedName("ev")
   int method7720(MusicPatchNode var1) {
      int var2 = this.field4225[591677655 * var1.field4253];
      return var2 < 8192 ? 32 + var2 * var1.field4250 * 1053004281 >> 6 : 16384 - ((16384 - var2) * (128 - 1053004281 * var1.field4250) + 32 >> 6);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cf")
   public boolean method7651() {
      synchronized (this.field4228) {
         return this.midiFile.isReady();
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ac")
   public void method7657(int var1, int var2, int var3) {
      try {
         synchronized (this.field4228) {
            this.method7659(var1, var2, (byte)85);
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "nc.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cr")
   public boolean method7654() {
      synchronized (this.field4228) {
         return NodeHashTable.method8917(this.musicPatches) > 0;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cj")
   public boolean method7655() {
      synchronized (this.field4228) {
         return NodeHashTable.method8917(this.musicPatches) > 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ca")
   public void method7658(int var1, int var2) {
      synchronized (this.field4228) {
         this.method7659(var1, var2, (byte)30);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dx")
   void method7677(int var1, int var2, int var3) {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;Lnd;)I")
   @ObfuscatedName("zo")
   public static int method7721(MidiPcmStream var0, MusicPatchNode var1) {
      int var2 = var0.field4225[-1556789756 * var1.field4253];
      return var2 < -853050733
         ? 32 + var2 * var1.field4250 * 1053004281 >> 6
         : -577888248 - ((16384 - var2) * (-1730505782 - 1053004281 * var1.field4250) + 1643682491 >> 6);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;II)V")
   @ObfuscatedName("nd")
   public static void method7661(MidiPcmStream var0, int var1, int var2) {
      var0.field4215[var1] = var2;
      var0.field4217[var1] = var2 & -128;
      var0.method7662(var1, var2, 552572652);
   }

   @ObfuscatedSignature(descriptor = "(Lnc;IIB)V")
   @ObfuscatedName("qi")
   public static void method7711(MidiPcmStream var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         var0.method7712(var1, var1, var3);
      }

      try {
         var0.field4223[var1] = var2;
         var0.field4210[var1] = (int)(2097152.0 * Math.pow(2.0, var2 * 5.493164E-4F) + 0.5);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "nc.bi(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;Lnd;[III)Z")
   @ObfuscatedName("on")
   public static boolean method7730(MidiPcmStream var0, MusicPatchNode var1, int[] var2, int var3, int var4) {
      if (var0 == null) {
         var0.method7734(var1, var2, var3, var3);
      }

      var1.field4249 = 699325967 * (EnumComposition.field2157 * 1063377631 / 100);
      if (var1.field4243 * 498415289 < 0 || null != var1.stream && !RawPcmStream.method3300(var1.stream)) {
         int var5 = 643864511 * var1.field4259;
         if (var5 > 0) {
            var5 -= (int)(16.0 * Math.pow(2.0, var0.field4230[591677655 * var1.field4253] * 4.921259842519685E-4) + 0.5);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.field4259 = var5 * 36657215;
         }

         var1.stream.method3294(var0.method7714(var1, (byte)99));
         MusicPatchNode2 var6 = var1.field4263;
         boolean var7 = false;
         var1.field4257 += -779922195;
         var1.field4251 = var1.field4251 + var6.field4287 * 170745899;
         double var8 = 5.086263020833333E-6 * ((var1.field4248 * 1059417007 - 60 << 8) + (var1.field4254 * 1520153051 * var1.field4259 * 643864511 >> 12));
         if (var6.field4282 * -521738017 > 0) {
            if (var6.field4283 * 2144474729 > 0) {
               var1.field4244 = var1.field4244 + (int)(128.0 * Math.pow(2.0, var8 * (var6.field4283 * 2144474729)) + 0.5) * 353133875;
            } else {
               var1.field4244 += -2043504256;
            }
         }

         if (null != var6.field4288) {
            if (934432047 * var6.field4285 > 0) {
               var1.field4246 = var1.field4246 + (int)(128.0 * Math.pow(2.0, 934432047 * var6.field4285 * var8) + 0.5) * -2023867979;
            } else {
               var1.field4246 += -1357063552;
            }

            while (
               2068959101 * var1.field4252 < var6.field4288.length - 2
                  && var1.field4246 * -1387418467 > (var6.field4288[2 + var1.field4252 * 2068959101] & 255) << 8
            ) {
               var1.field4252 += 924894122;
            }

            if (var6.field4288.length - 2 == var1.field4252 * 2068959101 && 0 == var6.field4288[1 + 2068959101 * var1.field4252]) {
               var7 = true;
            }
         }

         if (var1.field4243 * 498415289 >= 0
            && var6.field4289 != null
            && (var0.field4226[591677655 * var1.field4253] & 1) == 0
            && (var1.field4247 * 35559339 < 0 || var1 != var0.field4220[591677655 * var1.field4253][35559339 * var1.field4247])) {
            if (-1238659105 * var6.field4281 > 0) {
               var1.field4243 = var1.field4243 + (int)(128.0 * Math.pow(2.0, -1238659105 * var6.field4281 * var8) + 0.5) * 1676144521;
            } else {
               var1.field4243 += -201866112;
            }

            while (
               -1743855771 * var1.field4242 < var6.field4289.length - 2
                  && 498415289 * var1.field4243 > (var6.field4289[var1.field4242 * -1743855771 + 2] & 255) << 8
            ) {
               var1.field4242 += -1309903654;
            }

            if (var6.field4289.length - 2 == var1.field4242 * -1743855771) {
               var7 = true;
            }
         }

         if (var7) {
            var1.stream.method3287(67522799 * var1.field4249);
            if (null != var2) {
               var1.stream.fill(var2, var3, var4);
            } else {
               var1.stream.skip(var4);
            }

            if (RawPcmStream.method3305(var1.stream)) {
               var0.patchStream.mixer.addSubStream(var1.stream);
            }

            var1.method7737(303562394);
            if (498415289 * var1.field4243 >= 0) {
               var1.remove();
               if (var1.field4247 * 35559339 > 0 && var1 == var0.field4220[var1.field4253 * 591677655][35559339 * var1.field4247]) {
                  var0.field4220[591677655 * var1.field4253][35559339 * var1.field4247] = null;
               }
            }

            return true;
         } else {
            var1.stream.method3281(67522799 * var1.field4249, var0.method7716(var1, 629088038), var0.method7719(var1, 122128501));
            return false;
         }
      } else {
         var1.method7737(-392319935);
         var1.remove();
         if (35559339 * var1.field4247 > 0 && var1 == var0.field4220[var1.field4253 * 591677655][var1.field4247 * 35559339]) {
            var0.field4220[var1.field4253 * 591677655][35559339 * var1.field4247] = null;
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnc;Lnd;[IIIB)Z")
   @ObfuscatedName("nh")
   public static boolean method7731(MidiPcmStream var0, MusicPatchNode var1, int[] var2, int var3, int var4, byte var5) {
      if (var0 == null) {
         return var0.method7733(var1, var2, var3, var3, var5);
      } else {
         try {
            label239: {
               var1.field4249 = 699325967 * (EnumComposition.field2157 * 1063377631 / 100);
               if (var1.field4243 * 498415289 >= 0) {
                  if (var5 != 2) {
                     throw new IllegalStateException();
                  }

                  if (null == var1.stream) {
                     break label239;
                  }

                  if (var5 != 2) {
                     throw new IllegalStateException();
                  }

                  if (RawPcmStream.method3300(var1.stream)) {
                     if (var5 != 2) {
                        throw new IllegalStateException();
                     }
                     break label239;
                  }
               }

               int var6 = 643864511 * var1.field4259;
               if (var6 > 0) {
                  if (var5 != 2) {
                     throw new IllegalStateException();
                  }

                  var6 -= (int)(16.0 * Math.pow(2.0, var0.field4230[591677655 * var1.field4253] * 4.921259842519685E-4) + 0.5);
                  if (var6 < 0) {
                     if (var5 != 2) {
                        throw new IllegalStateException();
                     }

                     var6 = 0;
                  }

                  var1.field4259 = var6 * 36657215;
               }

               var1.stream.method3294(var0.method7714(var1, (byte)96));
               MusicPatchNode2 var7 = var1.field4263;
               boolean var8 = false;
               var1.field4257 += -779922195;
               var1.field4251 = var1.field4251 + var7.field4287 * 170745899;
               double var9 = 5.086263020833333E-6
                  * ((var1.field4248 * 1059417007 - 60 << 8) + (var1.field4254 * 1520153051 * var1.field4259 * 643864511 >> 12));
               if (var7.field4282 * -521738017 > 0) {
                  if (var7.field4283 * 2144474729 > 0) {
                     if (var5 != 2) {
                        throw new IllegalStateException();
                     }

                     var1.field4244 = var1.field4244 + (int)(128.0 * Math.pow(2.0, var9 * (var7.field4283 * 2144474729)) + 0.5) * 353133875;
                  } else {
                     var1.field4244 += -2043504256;
                  }
               }

               if (null != var7.field4288) {
                  if (var5 != 2) {
                     throw new IllegalStateException();
                  }

                  if (934432047 * var7.field4285 > 0) {
                     if (var5 != 2) {
                        throw new IllegalStateException();
                     }

                     var1.field4246 = var1.field4246 + (int)(128.0 * Math.pow(2.0, 934432047 * var7.field4285 * var9) + 0.5) * -2023867979;
                  } else {
                     var1.field4246 += -1357063552;
                  }

                  while (2068959101 * var1.field4252 < var7.field4288.length - 2) {
                     if (var5 != 2) {
                        throw new IllegalStateException();
                     }

                     if (var1.field4246 * -1387418467 <= (var7.field4288[2 + var1.field4252 * 2068959101] & 255) << 8) {
                        break;
                     }

                     if (var5 != 2) {
                        throw new IllegalStateException();
                     }

                     var1.field4252 += 924894122;
                  }

                  if (var7.field4288.length - 2 == var1.field4252 * 2068959101) {
                     if (var5 != 2) {
                        throw new IllegalStateException();
                     }

                     if (0 == var7.field4288[1 + 2068959101 * var1.field4252]) {
                        if (var5 != 2) {
                           throw new IllegalStateException();
                        }

                        var8 = true;
                     }
                  }
               }

               if (var1.field4243 * 498415289 >= 0) {
                  if (var5 != 2) {
                     throw new IllegalStateException();
                  }

                  if (var7.field4289 != null) {
                     if (var5 != 2) {
                        throw new IllegalStateException();
                     }

                     label206:
                     if ((var0.field4226[591677655 * var1.field4253] & 1) == 0) {
                        if (var5 != 2) {
                           throw new IllegalStateException();
                        }

                        if (var1.field4247 * 35559339 >= 0) {
                           if (var5 != 2) {
                              throw new IllegalStateException();
                           }

                           if (var1 == var0.field4220[591677655 * var1.field4253][35559339 * var1.field4247]) {
                              break label206;
                           }

                           if (var5 != 2) {
                              throw new IllegalStateException();
                           }
                        }

                        if (-1238659105 * var7.field4281 > 0) {
                           if (var5 != 2) {
                              throw new IllegalStateException();
                           }

                           var1.field4243 = var1.field4243 + (int)(128.0 * Math.pow(2.0, -1238659105 * var7.field4281 * var9) + 0.5) * 1676144521;
                        } else {
                           var1.field4243 += -201866112;
                        }

                        while (-1743855771 * var1.field4242 < var7.field4289.length - 2) {
                           if (var5 != 2) {
                              throw new IllegalStateException();
                           }

                           if (498415289 * var1.field4243 <= (var7.field4289[var1.field4242 * -1743855771 + 2] & 255) << 8) {
                              break;
                           }

                           if (var5 != 2) {
                              throw new IllegalStateException();
                           }

                           var1.field4242 += -1309903654;
                        }

                        if (var7.field4289.length - 2 == var1.field4242 * -1743855771) {
                           if (var5 != 2) {
                              throw new IllegalStateException();
                           }

                           var8 = true;
                        }
                     }
                  }
               }

               if (var8) {
                  if (var5 != 2) {
                     throw new IllegalStateException();
                  }

                  var1.stream.method3287(67522799 * var1.field4249);
                  if (null != var2) {
                     if (var5 != 2) {
                        throw new IllegalStateException();
                     }

                     var1.stream.fill(var2, var3, var4);
                  } else {
                     var1.stream.skip(var4);
                  }

                  if (RawPcmStream.method3305(var1.stream)) {
                     if (var5 != 2) {
                        throw new IllegalStateException();
                     }

                     var0.patchStream.mixer.addSubStream(var1.stream);
                  }

                  var1.method7737(2050079594);
                  if (498415289 * var1.field4243 >= 0) {
                     if (var5 != 2) {
                        throw new IllegalStateException();
                     }

                     var1.remove();
                     if (var1.field4247 * 35559339 > 0) {
                        if (var5 != 2) {
                           throw new IllegalStateException();
                        }

                        if (var1 == var0.field4220[var1.field4253 * 591677655][35559339 * var1.field4247]) {
                           var0.field4220[591677655 * var1.field4253][35559339 * var1.field4247] = null;
                        }
                     }
                  }

                  return true;
               }

               var1.stream.method3281(67522799 * var1.field4249, var0.method7716(var1, 36914530), var0.method7719(var1, -1328393674));
               return false;
            }

            var1.method7737(198556087);
            var1.remove();
            if (35559339 * var1.field4247 > 0) {
               if (var5 != 2) {
                  throw new IllegalStateException();
               }

               if (var1 == var0.field4220[var1.field4253 * 591677655][var1.field4247 * 35559339]) {
                  var0.field4220[var1.field4253 * 591677655][35559339 * var1.field4247] = null;
               }
            }

            return true;
         } catch (RuntimeException var11) {
            throw RestClientThreadFactory.newRunException(var11, "nc.bc(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("as")
   public boolean method7656(int var1) {
      try {
         synchronized (this.field4228) {
            boolean var10000;
            if (NodeHashTable.method8917(this.musicPatches) > 0) {
               if (var1 >= -138229323) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "nc.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnd;Z)V")
   @ObfuscatedName("dy")
   void method7668(MusicPatchNode var1, boolean var2) {
      int var3 = var1.rawSound.samples.length;
      int var4;
      if (var2 && var1.rawSound.field1471) {
         int var5 = var3 + var3 - var1.rawSound.sampleRate;
         var4 = (int)((long)var5 * this.field4209[591677655 * var1.field4253] >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.stream.method3273(true);
         }
      } else {
         var4 = (int)((long)var3 * this.field4209[591677655 * var1.field4253] >> 6);
      }

      var1.stream.method3269(var4);
   }

   @ObfuscatedSignature(descriptor = "(Lnd;Z)V")
   @ObfuscatedName("db")
   void method7669(MusicPatchNode var1, boolean var2) {
      int var3 = var1.rawSound.samples.length;
      int var4;
      if (var2 && var1.rawSound.field1471) {
         int var5 = var3 + var3 - var1.rawSound.sampleRate;
         var4 = (int)((long)var5 * this.field4209[591677655 * var1.field4253] >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.stream.method3273(true);
         }
      } else {
         var4 = (int)((long)var3 * this.field4209[591677655 * var1.field4253] >> 6);
      }

      var1.stream.method3269(var4);
   }

   @ObfuscatedSignature(descriptor = "(Lnd;Z)V")
   @ObfuscatedName("df")
   void method7670(MusicPatchNode var1, boolean var2) {
      int var3 = var1.rawSound.samples.length;
      int var4;
      if (var2 && var1.rawSound.field1471) {
         int var5 = var3 + var3 - var1.rawSound.sampleRate;
         var4 = (int)((long)var5 * this.field4209[591677655 * var1.field4253] >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.stream.method3273(true);
         }
      } else {
         var4 = (int)((long)var3 * this.field4209[591677655 * var1.field4253] >> 6);
      }

      var1.stream.method3269(var4);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dt")
   void method7673(int var1, int var2, int var3) {
      MusicPatchNode var4 = this.field4224[var1][var2];
      if (var4 != null) {
         this.field4224[var1][var2] = null;
         if (0 != (this.field4226[var1] & 2)) {
            for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); null != var5; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
               if (var4.field4253 * 1581856732 == 876195446 * var5.field4253 && var5.field4243 * 498415289 < 0 && var4 != var5) {
                  var4.field4243 = 0;
                  break;
               }
            }
         } else {
            var4.field4243 = 0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dh")
   void method7674(int var1, int var2, int var3) {
      MusicPatchNode var4 = this.field4224[var1][var2];
      if (var4 != null) {
         this.field4224[var1][var2] = null;
         if (0 != (this.field4226[var1] & 2)) {
            for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); null != var5; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
               if (var4.field4253 * 591677655 == 1678019435 * var5.field4253 && var5.field4243 * 498415289 < 0 && var4 != var5) {
                  var4.field4243 = 0;
                  break;
               }
            }
         } else {
            var4.field4243 = 0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dz")
   void method7675(int var1, int var2, int var3) {
      MusicPatchNode var4 = this.field4224[var1][var2];
      if (var4 != null) {
         this.field4224[var1][var2] = null;
         if (0 != (this.field4226[var1] & 2)) {
            for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); null != var5; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
               if (var4.field4253 * 591677655 == 591677655 * var5.field4253 && var5.field4243 * 498415289 < 0 && var4 != var5) {
                  var4.field4243 = 0;
                  break;
               }
            }
         } else {
            var4.field4243 = 0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dl")
   void method7678(int var1, int var2, int var3) {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;)V")
   @ObfuscatedName("xf")
   public static void method7634(MidiPcmStream var0) {
      synchronized (var0.field4228) {
         for (MusicPatch var2 = (MusicPatch)var0.musicPatches.first(); var2 != null; var2 = (MusicPatch)var0.musicPatches.next()) {
            var2._remove((short)-20555);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;)V")
   @ObfuscatedName("wh")
   public static void method7647(MidiPcmStream var0) {
      synchronized (var0.field4228) {
         var0.midiFile.clear();
         var0.method7697(-1704404397);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ef")
   void method7702(int var1) {
      if (0 != (this.field4226[var1] & 4)) {
         for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); null != var2; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var1 == 591677655 * var2.field4253) {
               var2.field4245 = 0;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;Lnd;Z)V")
   @ObfuscatedName("kz")
   public static void method7671(MidiPcmStream var0, MusicPatchNode var1, boolean var2) {
      if (var0 == null) {
         var0.method7631();
      } else {
         int var3 = var1.rawSound.samples.length;
         int var4;
         if (var2 && var1.rawSound.field1471) {
            int var5 = var3 + var3 - var1.rawSound.sampleRate;
            var4 = (int)((long)var5 * var0.field4209[591677655 * var1.field4253] >> 6);
            var3 <<= 8;
            if (var4 >= var3) {
               var4 = var3 + var3 - 1 - var4;
               var1.stream.method3273(true);
            }
         } else {
            var4 = (int)((long)var3 * var0.field4209[591677655 * var1.field4253] >> 6);
         }

         var1.stream.method3269(var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dq")
   void method7681(int var1, int var2) {
   }

   @ObfuscatedSignature(descriptor = "(Lnd;B)I")
   @ObfuscatedName("by")
   int method7714(MusicPatchNode var1, byte var2) {
      try {
         int var10;
         var10 = (643864511 * var1.field4259 * 1520153051 * var1.field4254 >> 12) + 1025719767 * var1.field4258;
         var10 += (this.field4218[591677655 * var1.field4253] - 8192) * this.field4207[591677655 * var1.field4253] >> 12;
         MusicPatchNode2 var4 = var1.field4263;
         label50:
         if (var4.field4287 * -665347531 > 0) {
            if (var2 <= 9) {
               throw new IllegalStateException();
            }

            if (var4.field4284 * -808663929 <= 0) {
               if (var2 <= 9) {
                  throw new IllegalStateException();
               }

               if (this.field4219[var1.field4253 * 591677655] <= 0) {
                  break label50;
               }

               if (var2 <= 9) {
                  throw new IllegalStateException();
               }
            }

            int var5 = -808663929 * var4.field4284 << 2;
            int var6 = 1011266985 * var4.field4286 << 1;
            if (var1.field4257 * -1992283931 < var6) {
               if (var2 <= 9) {
                  throw new IllegalStateException();
               }

               var5 = var1.field4257 * -1992283931 * var5 / var6;
            }

            var5 += this.field4219[var1.field4253 * 591677655] >> 7;
            double var7 = Math.sin((var1.field4251 * 1962630943 & 511) * 0.01227184630308513);
            var10 += (int)(var5 * var7);
         }

         int var12 = (int)(var1.rawSound.start * 256 * Math.pow(2.0, var10 * 3.255208333333333E-4) / (EnumComposition.field2157 * 1063377631) + 0.5);
         int var10000;
         if (var12 < 1) {
            if (var2 <= 9) {
               throw new IllegalStateException();
            }

            var10000 = 1;
         } else {
            var10000 = var12;
         }

         return var10000;
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "nc.by(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bk")
   @Override
   protected PcmStream vmethod163() {
      try {
         return this.patchStream;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "nc.aj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;)V")
   @ObfuscatedName("nm")
   public static void method7635(MidiPcmStream var0) {
      synchronized (var0.field4228) {
         for (MusicPatch var2 = (MusicPatch)var0.musicPatches.first(); var2 != null; var2 = (MusicPatch)var0.musicPatches.next()) {
            var2._remove((short)-3938);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;)Z")
   @ObfuscatedName("us")
   public static boolean method7652(MidiPcmStream var0) {
      if (var0 == null) {
         var0.method7653();
      }

      synchronized (var0.field4228) {
         return var0.midiFile.isReady();
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dg")
   void method7687(int var1, int var2) {
      this.field4218[var1] = var2;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ds")
   void method7693(int var1) {
      if (var1 >= 0) {
         this.field4213[var1] = 2136050257;
         this.field4225[var1] = 8192;
         this.field4214[var1] = -51297904;
         this.field4218[var1] = 8192;
         this.field4219[var1] = 0;
         this.field4230[var1] = 8192;
         method7700(this, var1, 714787336);
         this.method7701(var1, 451759978);
         this.field4226[var1] = 0;
         this.field4221[var1] = -542876617;
         this.field4207[var1] = 256;
         this.field4209[var1] = 0;
         method7711(this, var1, -719641910, (byte)7);
      } else {
         for (int var2 = 0; var2 < 16; var2++) {
            this.method7691(var2, 2025023543);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bj")
   @Override
   protected int vmethod172() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ay")
   public void method7640(byte var1) {
      try {
         synchronized (this.field4228) {
            for (MusicPatch var3 = (MusicPatch)this.musicPatches.first(); var3 != null; var3 = (MusicPatch)this.musicPatches.next()) {
               if (var1 >= 11) {
                  return;
               }

               var3.remove();
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "nc.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("dr")
   void method7679(int var1, int var2, int var3) {
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("bh")
   void method7723(byte var1) {
      try {
         int var2 = 1501424531 * this.track;
         int var3 = this.trackLength * 715127169;
         long var4 = -4973024566956474005L * this.field4240;

         label74:
         while (true) {
            if (var3 != this.trackLength * 715127169) {
               this.track = var2 * -1684346213;
               this.trackLength = -668318079 * var3;
               this.field4240 = -1953962277268921533L * var4;
               return;
            }

            if (var1 == 0) {
               return;
            }

            while (true) {
               if (var3 == this.midiFile.trackLengths[var2]) {
                  if (var1 == 0) {
                     throw new IllegalStateException();
                  }

                  this.midiFile.gotoTrack(var2);
                  int var6 = this.midiFile.readMessage(var2);
                  if (var6 != 1) {
                     if ((var6 & 128) != 0) {
                        if (var1 == 0) {
                           throw new IllegalStateException();
                        }

                        this.method7706(var6, 1087141330);
                     }

                     this.midiFile.readTrackLength(var2);
                     classRV.method9844(this.midiFile, var2);
                     continue;
                  }

                  if (var1 == 0) {
                     throw new IllegalStateException();
                  }

                  this.midiFile.setTrackDone();
                  classRV.method9844(this.midiFile, var2);
                  if (!this.midiFile.isDone()) {
                     if (var1 == 0) {
                        throw new IllegalStateException();
                     }
                  } else {
                     if (!this.field4241) {
                        break label74;
                     }

                     if (var1 == 0) {
                        throw new IllegalStateException();
                     }

                     if (0 == var3) {
                        break label74;
                     }

                     if (var1 == 0) {
                        return;
                     }

                     this.midiFile.reset(var4);
                  }
               }

               var2 = this.midiFile.getPrioritizedTrack();
               var3 = this.midiFile.trackLengths[var2];
               var4 = this.midiFile.method7591(var3);
               break;
            }
         }

         this.method7697(239745464);
         this.midiFile.clear();
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "nc.bh(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ea")
   void method7699() {
      this.method7689(-1, (byte)80);
      this.method7691(-1, 2025023543);

      for (int var1 = 0; var1 < 16; var1++) {
         this.field4216[var1] = this.field4215[var1];
      }

      for (int var2 = 0; var2 < 16; var2++) {
         this.field4217[var2] = this.field4215[var2] & 2019186219;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ck")
   public void method7636() {
      synchronized (this.field4228) {
         for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
            var2._remove((short)-17150);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("eq")
   void method7703(int var1) {
      if (0 != (this.field4226[var1] & 4)) {
         for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); null != var2; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var1 == 591677655 * var2.field4253) {
               var2.field4245 = 0;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ek")
   void method7704(int var1) {
      if (0 != (this.field4226[var1] & 4)) {
         for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); null != var2; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var1 == -116656998 * var2.field4253) {
               var2.field4245 = 0;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("am")
   void method7682(int var1, int var2, int var3) {
      try {
         ;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "nc.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ej")
   void method7705(int var1) {
      if (0 != (this.field4226[var1] & 4)) {
         for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); null != var2; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var1 == -1143917210 * var2.field4253) {
               var2.field4245 = 0;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ew")
   void method7708(int var1) {
      int var2 = var1 & -1650421379;
      if (128 == var2) {
         int var13 = var1 & 15;
         int var19 = var1 >> 8 & 873744288;
         int var22 = var1 >> 16 & -1182245720;
         method7672(this, var13, var19, var22, -2126339302);
      } else if (-593103350 == var2) {
         int var12 = var1 & 15;
         int var18 = var1 >> 8 & -657948432;
         int var21 = var1 >> 16 & -1097676288;
         if (var21 > 0) {
            this.method7664(var12, var18, var21, 195197534);
         } else {
            method7672(this, var12, var18, 64, -2126339302);
         }
      } else if (160 == var2) {
         int var11 = var1 & 15;
         int var17 = var1 >> 8 & 544795409;
         int var20 = var1 >> 16 & -392793934;
         method7676(this, var11, var17, var20, (byte)1);
      } else if (176 == var2) {
         int var10 = var1 & 15;
         int var16 = var1 >> 8 & 880423164;
         int var5 = var1 >> 16 & 127;
         if (var16 == 0) {
            this.field4217[var10] = (var5 << 14) + (this.field4217[var10] & -602846926);
         }

         if (32 == var16) {
            this.field4217[var10] = (var5 << 7) + (this.field4217[var10] & -16257);
         }

         if (1 == var16) {
            this.field4219[var10] = (var5 << 7) + (this.field4219[var10] & -60599769);
         }

         if (33 == var16) {
            this.field4219[var10] = var5 + (this.field4219[var10] & -128);
         }

         if (var16 == 5) {
            this.field4230[var10] = (var5 << 7) + (this.field4230[var10] & -16257);
         }

         if (var16 == 37) {
            this.field4230[var10] = (this.field4230[var10] & -128) + var5;
         }

         if (var16 == 7) {
            this.field4213[var10] = (var5 << 7) + (this.field4213[var10] & 2072639952);
         }

         if (-1092825663 == var16) {
            this.field4213[var10] = var5 + (this.field4213[var10] & -1677177119);
         }

         if (var16 == 10) {
            this.field4225[var10] = (this.field4225[var10] & -1092501263) + (var5 << 7);
         }

         if (var16 == 42) {
            this.field4225[var10] = var5 + (this.field4225[var10] & -128);
         }

         if (11 == var16) {
            this.field4214[var10] = (this.field4214[var10] & -16257) + (var5 << 7);
         }

         if (var16 == -1943919134) {
            this.field4214[var10] = (this.field4214[var10] & -128) + var5;
         }

         if (-424580856 == var16) {
            if (var5 >= 64) {
               this.field4226[var10] = this.field4226[var10] | 1;
            } else {
               this.field4226[var10] = this.field4226[var10] & -2;
            }
         }

         if (65 == var16) {
            if (var5 >= 832922809) {
               this.field4226[var10] = this.field4226[var10] | 2;
            } else {
               method7700(this, var10, 1796383057);
               this.field4226[var10] = this.field4226[var10] & 108709570;
            }
         }

         if (var16 == 99) {
            this.field4221[var10] = (this.field4221[var10] & 127) + (var5 << 7);
         }

         if (98 == var16) {
            this.field4221[var10] = (this.field4221[var10] & 16256) + var5;
         }

         if (101 == var16) {
            this.field4221[var10] = (var5 << 7) + (this.field4221[var10] & -353590336) + 353529258;
         }

         if (-1286130458 == var16) {
            this.field4221[var10] = (this.field4221[var10] & 16256) + 16384 + var5;
         }

         if (996336787 == var16) {
            this.method7689(var10, (byte)80);
         }

         if (var16 == -601122380) {
            this.method7691(var10, 2025023543);
         }

         if (var16 == 123) {
            this.method7694(var10, (byte)124);
         }

         if (var16 == 6) {
            int var6 = this.field4221[var10];
            if (var6 == 1390608575) {
               this.field4207[var10] = (this.field4207[var10] & -16257) + (var5 << 7);
            }
         }

         if (1788124728 == var16) {
            int var23 = this.field4221[var10];
            if (16384 == var23) {
               this.field4207[var10] = (this.field4207[var10] & -344935888) + var5;
            }
         }

         if (16 == var16) {
            this.field4209[var10] = (this.field4209[var10] & -495261742) + (var5 << 7);
         }

         if (48 == var16) {
            this.field4209[var10] = (this.field4209[var10] & -128) + var5;
         }

         if (var16 == 81) {
            if (var5 >= -2008620029) {
               this.field4226[var10] = this.field4226[var10] | 4;
            } else {
               this.method7701(var10, -1030702971);
               this.field4226[var10] = this.field4226[var10] & -383275931;
            }
         }

         if (17 == var16) {
            method7711(this, var10, (var5 << 7) + (this.field4223[var10] & 516297029), (byte)4);
         }

         if (var16 == -1119749261) {
            method7711(this, var10, var5 + (this.field4223[var10] & -128), (byte)52);
         }
      } else if (var2 == 559813427) {
         int var9 = var1 & 15;
         int var15 = var1 >> 8 & 127;
         this.method7662(var9, this.field4217[var9] + var15, 1496335699);
      } else if (var2 == 208) {
         int var8 = var1 & 15;
         int var14 = var1 >> 8 & 127;
         this.method7682(var8, var14, -2070156295);
      } else if (224 == var2) {
         int var3 = var1 & 15;
         int var4 = (var1 >> 8 & 418099207) + (var1 >> 9 & 16256);
         this.method7685(var3, var4, (byte)8);
      } else {
         var2 = var1 & 304457953;
         if (255 == var2) {
            this.method7697(11025655);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("em")
   void method7709(int var1) {
      int var2 = var1 & -1005624215;
      if (128 == var2) {
         int var13 = var1 & 15;
         int var19 = var1 >> 8 & -42775002;
         int var22 = var1 >> 16 & 127;
         method7672(this, var13, var19, var22, -2126339302);
      } else if (-32331461 == var2) {
         int var12 = var1 & 15;
         int var18 = var1 >> 8 & -172337068;
         int var21 = var1 >> 16 & -1436621455;
         if (var21 > 0) {
            this.method7664(var12, var18, var21, 1799804256);
         } else {
            method7672(this, var12, var18, 1571630369, -2126339302);
         }
      } else if (160 == var2) {
         int var11 = var1 & 15;
         int var17 = var1 >> 8 & -1605626390;
         int var20 = var1 >> 16 & 1222173466;
         method7676(this, var11, var17, var20, (byte)1);
      } else if (-1473043235 == var2) {
         int var10 = var1 & 15;
         int var16 = var1 >> 8 & 127;
         int var5 = var1 >> 16 & 127;
         if (var16 == 0) {
            this.field4217[var10] = (var5 << 14) + (this.field4217[var10] & -2080769);
         }

         if (-1502414789 == var16) {
            this.field4217[var10] = (var5 << 7) + (this.field4217[var10] & -16257);
         }

         if (1 == var16) {
            this.field4219[var10] = (var5 << 7) + (this.field4219[var10] & -16257);
         }

         if (33 == var16) {
            this.field4219[var10] = var5 + (this.field4219[var10] & -128);
         }

         if (var16 == 5) {
            this.field4230[var10] = (var5 << 7) + (this.field4230[var10] & -1042440278);
         }

         if (var16 == 37) {
            this.field4230[var10] = (this.field4230[var10] & -128) + var5;
         }

         if (var16 == 7) {
            this.field4213[var10] = (var5 << 7) + (this.field4213[var10] & -16257);
         }

         if (39 == var16) {
            this.field4213[var10] = var5 + (this.field4213[var10] & -128);
         }

         if (var16 == 10) {
            this.field4225[var10] = (this.field4225[var10] & -16257) + (var5 << 7);
         }

         if (var16 == 42) {
            this.field4225[var10] = var5 + (this.field4225[var10] & -128);
         }

         if (11 == var16) {
            this.field4214[var10] = (this.field4214[var10] & -16257) + (var5 << 7);
         }

         if (var16 == 43) {
            this.field4214[var10] = (this.field4214[var10] & -128) + var5;
         }

         if (64 == var16) {
            if (var5 >= 1964633103) {
               this.field4226[var10] = this.field4226[var10] | 1;
            } else {
               this.field4226[var10] = this.field4226[var10] & -2;
            }
         }

         if (414374500 == var16) {
            if (var5 >= 64) {
               this.field4226[var10] = this.field4226[var10] | 2;
            } else {
               method7700(this, var10, -1118333352);
               this.field4226[var10] = this.field4226[var10] & -3;
            }
         }

         if (var16 == 99) {
            this.field4221[var10] = (this.field4221[var10] & 108731697) + (var5 << 7);
         }

         if (524918656 == var16) {
            this.field4221[var10] = (this.field4221[var10] & -681664955) + var5;
         }

         if (-525143248 == var16) {
            this.field4221[var10] = (var5 << 7) + (this.field4221[var10] & 127) + 16384;
         }

         if (100 == var16) {
            this.field4221[var10] = (this.field4221[var10] & 16256) + -731481026 + var5;
         }

         if (120 == var16) {
            this.method7689(var10, (byte)80);
         }

         if (var16 == -194188248) {
            this.method7691(var10, 2025023543);
         }

         if (var16 == 123) {
            this.method7694(var10, (byte)95);
         }

         if (var16 == 6) {
            int var6 = this.field4221[var10];
            if (var6 == 16384) {
               this.field4207[var10] = (this.field4207[var10] & -16257) + (var5 << 7);
            }
         }

         if (-1687105512 == var16) {
            int var23 = this.field4221[var10];
            if (1954817381 == var23) {
               this.field4207[var10] = (this.field4207[var10] & -128) + var5;
            }
         }

         if (16 == var16) {
            this.field4209[var10] = (this.field4209[var10] & -16257) + (var5 << 7);
         }

         if (48 == var16) {
            this.field4209[var10] = (this.field4209[var10] & -1551818542) + var5;
         }

         if (var16 == -1571474662) {
            if (var5 >= 1889404617) {
               this.field4226[var10] = this.field4226[var10] | 4;
            } else {
               this.method7701(var10, -1092553177);
               this.field4226[var10] = this.field4226[var10] & -575799626;
            }
         }

         if (17 == var16) {
            method7711(this, var10, (var5 << 7) + (this.field4223[var10] & -875690411), (byte)47);
         }

         if (var16 == 49) {
            method7711(this, var10, var5 + (this.field4223[var10] & -166629803), (byte)91);
         }
      } else if (var2 == 248575418) {
         int var9 = var1 & 15;
         int var15 = var1 >> 8 & 127;
         this.method7662(var9, this.field4217[var9] + var15, 341782937);
      } else if (var2 == 208) {
         int var8 = var1 & 15;
         int var14 = var1 >> 8 & -90465517;
         this.method7682(var8, var14, -2070156295);
      } else if (626187519 == var2) {
         int var3 = var1 & 15;
         int var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method7685(var3, var4, (byte)8);
      } else {
         var2 = var1 & 0xFF;
         if (454129903 == var2) {
            this.method7697(1301723776);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ldn;")
   @ObfuscatedName("bo")
   @Override
   protected PcmStream vmethod169() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "nc.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnd;)I")
   @ObfuscatedName("et")
   int method7715(MusicPatchNode var1) {
      int var2 = (1331686709 * var1.field4259 * 1520153051 * var1.field4254 >> 12) + 1025719767 * var1.field4258;
      var2 += (this.field4218[591677655 * var1.field4253] - 1692356755) * this.field4207[-231521518 * var1.field4253] >> 12;
      MusicPatchNode2 var3 = var1.field4263;
      if (var3.field4287 * -665347531 > 0 && (var3.field4284 * -808663929 > 0 || this.field4219[var1.field4253 * 591677655] > 0)) {
         int var4 = -808663929 * var3.field4284 << 2;
         int var5 = 820404653 * var3.field4286 << 1;
         if (var1.field4257 * -1992283931 < var5) {
            var4 = var1.field4257 * 2069593616 * var4 / var5;
         }

         var4 += this.field4219[var1.field4253 * -1157601023] >> 7;
         double var6 = Math.sin((var1.field4251 * 1962630943 & -1862005065) * 0.01227184630308513);
         var2 += (int)(var4 * var6);
      }

      int var10 = (int)(var1.rawSound.start * 256 * Math.pow(2.0, var2 * 3.255208333333333E-4) / (EnumComposition.field2157 * -1238107887) + 0.5);
      return var10 < 1 ? 1 : var10;
   }

   @ObfuscatedSignature(descriptor = "(Lnd;)I")
   @ObfuscatedName("ei")
   int method7718(MusicPatchNode var1) {
      MusicPatchNode2 var2 = var1.field4263;
      int var3 = this.field4213[591677655 * var1.field4253] * this.field4214[var1.field4253 * -27363269] + 1486226566 >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var1.field4256 * 399647583 * var3 + 828400702 >> 15;
      var3 = -1994728531 + var3 * this.field4211 * -541185765 >> 8;
      if (var2.field4282 * -521738017 > 0) {
         var3 = (int)(var3 * Math.pow(0.5, 1.953125E-5 * (589918450 * var1.field4244) * (var2.field4282 * -227494536)) + 0.5);
      }

      if (var2.field4288 != null) {
         int var4 = var1.field4246 * -1387418467;
         int var5 = var2.field4288[1 + 2068959101 * var1.field4252];
         if (var1.field4252 * 1172028261 < var2.field4288.length - 2) {
            int var6 = (var2.field4288[var1.field4252 * -439985991] & -1749900142) << 8;
            int var7 = (var2.field4288[2 + 2068959101 * var1.field4252] & -6615737) << 8;
            var5 += (var2.field4288[2068959101 * var1.field4252 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      if (var1.field4243 * 498415289 > 0 && null != var2.field4289) {
         int var11 = var1.field4243 * -2134132840;
         int var12 = var2.field4289[1 + -1743855771 * var1.field4242];
         if (-1743855771 * var1.field4242 < var2.field4289.length - 2) {
            int var13 = (var2.field4289[-1743855771 * var1.field4242] & 255) << 8;
            int var14 = (var2.field4289[-1743855771 * var1.field4242 + 2] & 135218482) << 8;
            var12 += (var11 - var13) * (var2.field4289[3 + -1743855771 * var1.field4242] - var12) / (var14 - var13);
         }

         var3 = var12 * var3 + 32 >> 6;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Lnd;)I")
   @ObfuscatedName("ey")
   int method7722(MusicPatchNode var1) {
      int var2 = this.field4225[591677655 * var1.field4253];
      return var2 < 8192 ? 32 + var2 * var1.field4250 * 1053004281 >> 6 : 16384 - ((16384 - var2) * (128 - 1053004281 * var1.field4250) + 32 >> 6);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cs")
   public void method7637() {
      synchronized (this.field4228) {
         for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
            var2._remove((short)-3007);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ez")
   void method7724() {
      int var1 = 1501424531 * this.track;
      int var2 = this.trackLength * 715127169;

      long var3;
      for (var3 = -4973024566956474005L * this.field4240; var2 == this.trackLength * 715127169; var3 = this.midiFile.method7591(var2)) {
         while (true) {
            if (var2 == this.midiFile.trackLengths[var1]) {
               this.midiFile.gotoTrack(var1);
               int var5 = this.midiFile.readMessage(var1);
               if (var5 != 1) {
                  if ((var5 & 128) != 0) {
                     this.method7706(var5, 1349305255);
                  }

                  this.midiFile.readTrackLength(var1);
                  classRV.method9844(this.midiFile, var1);
                  continue;
               }

               this.midiFile.setTrackDone();
               classRV.method9844(this.midiFile, var1);
               if (this.midiFile.isDone()) {
                  if (!this.field4241 || 0 == var2) {
                     this.method7697(142332956);
                     this.midiFile.clear();
                     return;
                  }

                  this.midiFile.reset(var3);
               }
            }

            var1 = this.midiFile.getPrioritizedTrack();
            var2 = this.midiFile.trackLengths[var1];
            break;
         }
      }

      this.track = var1 * -1684346213;
      this.trackLength = -668318079 * var2;
      this.field4240 = -1953962277268921533L * var3;
   }

   @ObfuscatedSignature(descriptor = "(Lnd;)Z")
   @ObfuscatedName("eh")
   boolean method7728(MusicPatchNode var1) {
      if (null == var1.stream) {
         if (498415289 * var1.field4243 >= 0) {
            var1.remove();
            if (35559339 * var1.field4247 > 0 && var1 == this.field4220[591677655 * var1.field4253][35559339 * var1.field4247]) {
               this.field4220[var1.field4253 * 591677655][var1.field4247 * 35559339] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnd;[III)Z")
   @ObfuscatedName("eb")
   boolean method7732(MusicPatchNode var1, int[] var2, int var3, int var4) {
      var1.field4249 = 699325967 * (EnumComposition.field2157 * 1063377631 / 100);
      if (var1.field4243 * 498415289 < 0 || null != var1.stream && !RawPcmStream.method3300(var1.stream)) {
         int var5 = 643864511 * var1.field4259;
         if (var5 > 0) {
            var5 -= (int)(16.0 * Math.pow(2.0, this.field4230[591677655 * var1.field4253] * 4.921259842519685E-4) + 0.5);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.field4259 = var5 * 36657215;
         }

         var1.stream.method3294(this.method7714(var1, (byte)115));
         MusicPatchNode2 var6 = var1.field4263;
         boolean var7 = false;
         var1.field4257 += -779922195;
         var1.field4251 = var1.field4251 + var6.field4287 * 170745899;
         double var8 = 5.086263020833333E-6 * ((var1.field4248 * 1059417007 - 60 << 8) + (var1.field4254 * 1520153051 * var1.field4259 * 643864511 >> 12));
         if (var6.field4282 * -521738017 > 0) {
            if (var6.field4283 * 2144474729 > 0) {
               var1.field4244 = var1.field4244 + (int)(128.0 * Math.pow(2.0, var8 * (var6.field4283 * 2144474729)) + 0.5) * 353133875;
            } else {
               var1.field4244 += -2043504256;
            }
         }

         if (null != var6.field4288) {
            if (934432047 * var6.field4285 > 0) {
               var1.field4246 = var1.field4246 + (int)(128.0 * Math.pow(2.0, 934432047 * var6.field4285 * var8) + 0.5) * -2023867979;
            } else {
               var1.field4246 += -1357063552;
            }

            while (
               2068959101 * var1.field4252 < var6.field4288.length - 2
                  && var1.field4246 * -1387418467 > (var6.field4288[2 + var1.field4252 * 2068959101] & 255) << 8
            ) {
               var1.field4252 += 924894122;
            }

            if (var6.field4288.length - 2 == var1.field4252 * 2068959101 && 0 == var6.field4288[1 + 2068959101 * var1.field4252]) {
               var7 = true;
            }
         }

         if (var1.field4243 * 498415289 >= 0
            && var6.field4289 != null
            && (this.field4226[591677655 * var1.field4253] & 1) == 0
            && (var1.field4247 * 35559339 < 0 || var1 != this.field4220[591677655 * var1.field4253][35559339 * var1.field4247])) {
            if (-1238659105 * var6.field4281 > 0) {
               var1.field4243 = var1.field4243 + (int)(128.0 * Math.pow(2.0, -1238659105 * var6.field4281 * var8) + 0.5) * 1676144521;
            } else {
               var1.field4243 += -201866112;
            }

            while (
               -1743855771 * var1.field4242 < var6.field4289.length - 2
                  && 498415289 * var1.field4243 > (var6.field4289[var1.field4242 * -1743855771 + 2] & 255) << 8
            ) {
               var1.field4242 += -1309903654;
            }

            if (var6.field4289.length - 2 == var1.field4242 * -1743855771) {
               var7 = true;
            }
         }

         if (var7) {
            var1.stream.method3287(67522799 * var1.field4249);
            if (null != var2) {
               var1.stream.fill(var2, var3, var4);
            } else {
               var1.stream.skip(var4);
            }

            if (RawPcmStream.method3305(var1.stream)) {
               this.patchStream.mixer.addSubStream(var1.stream);
            }

            var1.method7737(-207244036);
            if (498415289 * var1.field4243 >= 0) {
               var1.remove();
               if (var1.field4247 * 35559339 > 0 && var1 == this.field4220[var1.field4253 * 591677655][35559339 * var1.field4247]) {
                  this.field4220[591677655 * var1.field4253][35559339 * var1.field4247] = null;
               }
            }

            return true;
         } else {
            var1.stream.method3281(67522799 * var1.field4249, this.method7716(var1, -1706990626), this.method7719(var1, -161856747));
            return false;
         }
      } else {
         var1.method7737(1267020652);
         var1.remove();
         if (35559339 * var1.field4247 > 0 && var1 == this.field4220[var1.field4253 * 591677655][var1.field4247 * 35559339]) {
            this.field4220[var1.field4253 * 591677655][35559339 * var1.field4247] = null;
         }

         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dk")
   void method7696(int var1) {
      for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
         if ((var1 < 0 || var1 == var2.field4253 * 591677655) && var2.field4243 * 498415289 < 0) {
            this.field4224[var2.field4253 * 591677655][1059417007 * var2.field4248] = null;
            var2.field4243 = 0;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("al")
   void method7666(int var1, int var2, int var3, int var4) {
      try {
         method7672(this, var1, var2, 64, -2126339302);
         if (0 != (this.field4219[var1] & 2)) {
            if (var4 == 1127628544) {
               return;
            }

            for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.method9819();
               var5 != null;
               var5 = (MusicPatchNode)this.patchStream.queue.method9827()
            ) {
               if (var1 == 591677655 * var5.field4256) {
                  if (var4 == 1127628544) {
                     throw new IllegalStateException();
                  }

                  if (var5.field4246 * 498415289 < 0) {
                     if (var4 == 1127628544) {
                        throw new IllegalStateException();
                     }

                     this.field4220[var1][var5.field4256 * 1059417007] = null;
                     this.field4220[var1][var2] = var5;
                     int var6 = 1025719767 * var5.field4251 + (var5.field4242 * 1520153051 * 643864511 * var5.field4244 >> 12);
                     var5.field4256 = var5.field4250 + (var2 - var5.field4242 * 1059417007 << 8) * 1462896103;
                     var5.field4248 = 841409107 * (var6 - 1025719767 * var5.field4243);
                     var5.field4243 = -175902720;
                     var5.field4259 = var2 * 233884495;
                     return;
                  }
               }
            }
         }

         MusicPatch var10 = (MusicPatch)this.musicPatches.method8915(this.field4219[var1]);
         if (null == var10) {
            if (var4 == 1127628544) {
               throw new IllegalStateException();
            }
         } else if (null == var10.rawSounds[var2]) {
            if (var4 == 1127628544) {
               throw new IllegalStateException();
            }
         } else {
            RawSound var11 = class107.method3822(var10.rawSounds[var2], (short)1621);
            if (null == var11) {
               if (var4 != 1127628544) {
                  ;
               }
            } else {
               MusicPatchNode var7 = new MusicPatchNode();
               var7.field4242 = var1 * 1227434727;
               var7.table = var10;
               var7.rawSound = var11;
               var7.field4263 = var10.field4354[var2];
               var7.field4250 = 1711254275 * var10.field4352[var2];
               var7.field4256 = var2 * 233884495;
               var7.field4258 = 13170847 * (var3 * var3 * -1767540733 * var10.field4358 * var10.field4355[var2] + 1024 >> 11);
               var7.field4249 = -17932215 * (var10.field4355[var2] & 255);
               var7.field4245 = ((var2 << 8) - (var10.field4357[var2] & 32767)) * 1462896103;
               var7.field4251 = 0;
               var7.field4248 = 0;
               var7.field4247 = 0;
               var7.field4245 = -1676144521;
               var7.field4259 = 0;
               if (0 == this.field4207[var1]) {
                  var7.stream = RawPcmStream.method3183(
                     var11, this.method7714(var7, (byte)112), this.method7716(var7, 1998631384), this.method7719(var7, 859940955)
                  );
               } else {
                  var7.stream = RawPcmStream.method3181(var11, this.method7714(var7, (byte)122), 0, this.method7716(var7, 2034409111));
                  boolean var10002;
                  if (var10.field4357[var2] < 0) {
                     if (var4 == 1127628544) {
                        throw new IllegalStateException();
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  this.method7667(var7, var10002, (short)24108);
               }

               if (var10.field4357[var2] < 0) {
                  var7.stream.method3285(-1);
               }

               if (var7.field4248 * 35559339 >= 0) {
                  MusicPatchNode var8 = this.field4220[var1][35559339 * var7.field4245];
                  if (null != var8) {
                     if (var4 == 1127628544) {
                        return;
                     }

                     if (498415289 * var8.field4254 < 0) {
                        this.field4220[var1][var8.field4256 * 1059417007] = null;
                        var8.field4257 = 0;
                     }
                  }

                  this.field4224[var1][35559339 * var7.field4248] = var7;
               }

               this.patchStream.queue.method9803(var7);
               this.field4220[var1][var2] = var7;
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "nc.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIB)V")
   @ObfuscatedName("af")
   void method7680(int var1, int var2, int var3, byte var4) {
      try {
         ;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "nc.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnc;II)V")
   @ObfuscatedName("pm")
   public static void method7700(MidiPcmStream var0, int var1, int var2) {
      if (var0 == null) {
         var0.method7688(var1, var1);
      } else {
         try {
            if (0 != (var0.field4226[var1] & 2)) {
               if (var2 == -73676961) {
                  throw new IllegalStateException();
               }

               for (MusicPatchNode var3 = (MusicPatchNode)var0.patchStream.queue.last(); var3 != null; var3 = (MusicPatchNode)var0.patchStream.queue.previous()) {
                  if (var2 == -73676961) {
                     throw new IllegalStateException();
                  }

                  if (var1 == var3.field4253 * 591677655) {
                     if (var2 == -73676961) {
                        return;
                     }

                     if (var0.field4224[var1][var3.field4248 * 1059417007] == null) {
                        if (var2 == -73676961) {
                           throw new IllegalStateException();
                        }

                        if (498415289 * var3.field4243 < 0) {
                           var3.field4243 = 0;
                        }
                     }
                  }
               }
            }
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "nc.bp(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bp")
   void method7688(int var1, int var2) {
      this.field4218[var1] = var2;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cw")
   public boolean method7653() {
      synchronized (this.field4228) {
         return this.midiFile.method7601();
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("av")
   public void setPcmStreamVolume(int var1, byte var2) {
      try {
         synchronized (this.field4228) {
            this.field4211 = var1 * -897125539;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "nc.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnc;IB)V")
   @ObfuscatedName("sl")
   public static void method7621(MidiPcmStream var0, int var1, byte var2) {
      if (var0 == null) {
         var0.setPcmStreamVolume(var1, var2);
      } else {
         try {
            synchronized (var0.field4228) {
               var0.field4211 = var1 * -897125539;
            }
         } catch (RuntimeException var6) {
            throw RestClientThreadFactory.newRunException(var6, "nc.av(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("bi")
   void method7712(int var1, int var2, byte var3) {
      try {
         this.field4223[var1] = var2;
         this.field4214[var1] = (int)(2097152.0 * Math.pow(2.0, var2 * 5.493164E-4F) + 0.5);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "nc.bi(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("di")
   void method7683(int var1, int var2, int var3) {
      try {
         ;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "nc.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnd;[IIIB)Z")
   @ObfuscatedName("bc")
   boolean method7733(MusicPatchNode var1, int[] var2, int var3, int var4, byte var5) {
      try {
         label235: {
            var1.field4259 = 699325967 * (EnumComposition.field2157 * 1063377631 / 100);
            if (var1.field4244 * 498415289 >= 0) {
               if (var5 != 2) {
                  throw new IllegalStateException();
               }

               if (null == var1.stream) {
                  break label235;
               }

               if (var5 != 2) {
                  throw new IllegalStateException();
               }

               if (RawPcmStream.method3300(var1.stream)) {
                  if (var5 != 2) {
                     throw new IllegalStateException();
                  }
                  break label235;
               }
            }

            int var6 = 643864511 * var1.field4247;
            if (var6 > 0) {
               if (var5 != 2) {
                  throw new IllegalStateException();
               }

               var6 -= (int)(16.0 * Math.pow(2.0, this.field4225[591677655 * var1.field4247] * 4.921259842519685E-4) + 0.5);
               if (var6 < 0) {
                  if (var5 != 2) {
                     throw new IllegalStateException();
                  }

                  var6 = 0;
               }

               var1.field4243 = var6 * 36657215;
            }

            var1.stream.method3294(this.method7714(var1, (byte)96));
            MusicPatchNode2 var7 = var1.field4263;
            boolean var8 = false;
            var1.field4245 = var1.field4243 + -779922195;
            var1.field4254 = var1.field4244 + var7.field4285 * 170745899;
            double var9 = 5.086263020833333E-6 * ((var1.field4244 * 1059417007 - 60 << 8) + (var1.field4246 * 1520153051 * var1.field4246 * 643864511 >> 12));
            if (var7.field4286 * -521738017 > 0) {
               if (var7.field4284 * 2144474729 > 0) {
                  if (var5 != 2) {
                     throw new IllegalStateException();
                  }

                  var1.field4249 = var1.field4253 + (int)(128.0 * Math.pow(2.0, var9 * (var7.field4286 * 2144474729)) + 0.5) * 353133875;
               } else {
                  var1.field4244 = var1.field4243 + -2043504256;
               }
            }

            if (null != var7.field4289) {
               if (var5 != 2) {
                  throw new IllegalStateException();
               }

               if (934432047 * var7.field4284 > 0) {
                  if (var5 != 2) {
                     throw new IllegalStateException();
                  }

                  var1.field4248 = var1.field4246 + (int)(128.0 * Math.pow(2.0, 934432047 * var7.field4284 * var9) + 0.5) * -2023867979;
               } else {
                  var1.field4252 = var1.field4246 + -1357063552;
               }

               while (2068959101 * var1.field4259 < var7.field4288.length - 2) {
                  if (var5 != 2) {
                     throw new IllegalStateException();
                  }

                  if (var1.field4258 * -1387418467 <= (var7.field4288[2 + var1.field4250 * 2068959101] & 255) << 8) {
                     break;
                  }

                  if (var5 != 2) {
                     throw new IllegalStateException();
                  }

                  var1.field4252 = var1.field4251 + 924894122;
               }

               if (var7.field4289.length - 2 == var1.field4248 * 2068959101) {
                  if (var5 != 2) {
                     throw new IllegalStateException();
                  }

                  if (0 == var7.field4289[1 + 2068959101 * var1.field4245]) {
                     if (var5 != 2) {
                        throw new IllegalStateException();
                     }

                     var8 = true;
                  }
               }
            }

            if (var1.field4252 * 498415289 >= 0) {
               if (var5 != 2) {
                  throw new IllegalStateException();
               }

               if (var7.field4289 != null) {
                  if (var5 != 2) {
                     throw new IllegalStateException();
                  }

                  label203:
                  if ((this.field4207[591677655 * var1.field4245] & 1) == 0) {
                     if (var5 != 2) {
                        throw new IllegalStateException();
                     }

                     if (var1.field4247 * 35559339 >= 0) {
                        if (var5 != 2) {
                           throw new IllegalStateException();
                        }

                        if (var1 == this.field4224[591677655 * var1.field4249][35559339 * var1.field4254]) {
                           break label203;
                        }

                        if (var5 != 2) {
                           throw new IllegalStateException();
                        }
                     }

                     if (-1238659105 * var7.field4286 > 0) {
                        if (var5 != 2) {
                           throw new IllegalStateException();
                        }

                        var1.field4249 = var1.field4249 + (int)(128.0 * Math.pow(2.0, -1238659105 * var7.field4286 * var9) + 0.5) * 1676144521;
                     } else {
                        var1.field4244 = var1.field4252 + -201866112;
                     }

                     while (-1743855771 * var1.field4250 < var7.field4288.length - 2) {
                        if (var5 != 2) {
                           throw new IllegalStateException();
                        }

                        if (498415289 * var1.field4251 <= (var7.field4289[var1.field4256 * -1743855771 + 2] & 255) << 8) {
                           break;
                        }

                        if (var5 != 2) {
                           throw new IllegalStateException();
                        }

                        var1.field4244 = var1.field4258 + -1309903654;
                     }

                     if (var7.field4288.length - 2 == var1.field4242 * -1743855771) {
                        if (var5 != 2) {
                           throw new IllegalStateException();
                        }

                        var8 = true;
                     }
                  }
               }
            }

            if (var8) {
               if (var5 != 2) {
                  throw new IllegalStateException();
               }

               var1.stream.method3250(67522799 * var1.field4245);
               if (null != var2) {
                  if (var5 != 2) {
                     throw new IllegalStateException();
                  }

                  var1.stream.vmethod174(var2, var3, var4);
               } else {
                  var1.stream.skip(var4);
               }

               if (RawPcmStream.method3305(var1.stream)) {
                  if (var5 != 2) {
                     throw new IllegalStateException();
                  }

                  this.patchStream.mixer.method3421(var1.stream);
               }

               var1.method7737(2050079594);
               if (498415289 * var1.field4253 >= 0) {
                  if (var5 != 2) {
                     throw new IllegalStateException();
                  }

                  var1.method11660();
                  if (var1.field4252 * 35559339 > 0) {
                     if (var5 != 2) {
                        throw new IllegalStateException();
                     }

                     if (var1 == this.field4224[var1.field4253 * 591677655][35559339 * var1.field4259]) {
                        this.field4224[591677655 * var1.field4256][35559339 * var1.field4244] = null;
                     }
                  }
               }

               return true;
            }

            var1.stream.method3280(67522799 * var1.field4258, this.method7719(var1, 36914530), this.method7716(var1, -1328393674));
            return false;
         }

         var1.method7737(198556087);
         var1.vmethod138();
         if (35559339 * var1.field4254 > 0) {
            if (var5 != 2) {
               throw new IllegalStateException();
            }

            if (var1 == this.field4220[var1.field4249 * 591677655][var1.field4246 * 35559339]) {
               this.field4224[var1.field4251 * 591677655][35559339 * var1.field4245] = null;
            }
         }

         return true;
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "nc.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnd;)Z")
   @ObfuscatedName("ed")
   boolean method7729(MusicPatchNode var1) {
      if (null == var1.stream) {
         if (498415289 * var1.field4242 >= 0) {
            var1.method11657();
            if (35559339 * var1.field4244 > 0 && var1 == this.field4220[591677655 * var1.field4244][35559339 * var1.field4245]) {
               this.field4220[var1.field4248 * 591677655][var1.field4242 * 35559339] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnd;[III)Z")
   @ObfuscatedName("en")
   boolean method7734(MusicPatchNode var1, int[] var2, int var3, int var4) {
      var1.field4244 = 699325967 * (EnumComposition.field2157 * 1063377631 / 100);
      if (var1.field4250 * 498415289 < 0 || null != var1.stream && !RawPcmStream.method3300(var1.stream)) {
         int var5 = 643864511 * var1.field4252;
         if (var5 > 0) {
            var5 -= (int)(16.0 * Math.pow(2.0, this.field4221[591677655 * var1.field4244] * 4.921259842519685E-4) + 0.5);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.field4248 = var5 * 36657215;
         }

         var1.stream.method3295(this.method7714(var1, (byte)115));
         MusicPatchNode2 var6 = var1.field4263;
         boolean var7 = false;
         var1.field4251 = var1.field4243 + -779922195;
         var1.field4257 = var1.field4245 + var6.field4286 * 170745899;
         double var8 = 5.086263020833333E-6 * ((var1.field4250 * 1059417007 - 60 << 8) + (var1.field4249 * 1520153051 * var1.field4243 * 643864511 >> 12));
         if (var6.field4285 * -521738017 > 0) {
            if (var6.field4287 * 2144474729 > 0) {
               var1.field4253 = var1.field4249 + (int)(128.0 * Math.pow(2.0, var8 * (var6.field4281 * 2144474729)) + 0.5) * 353133875;
            } else {
               var1.field4242 = var1.field4247 + -2043504256;
            }
         }

         if (null != var6.field4288) {
            if (934432047 * var6.field4285 > 0) {
               var1.field4244 = var1.field4257 + (int)(128.0 * Math.pow(2.0, 934432047 * var6.field4283 * var8) + 0.5) * -2023867979;
            } else {
               var1.field4252 = var1.field4250 + -1357063552;
            }

            while (
               2068959101 * var1.field4257 < var6.field4289.length - 2
                  && var1.field4245 * -1387418467 > (var6.field4289[2 + var1.field4254 * 2068959101] & 255) << 8
            ) {
               var1.field4249 = var1.field4250 + 924894122;
            }

            if (var6.field4289.length - 2 == var1.field4250 * 2068959101 && 0 == var6.field4288[1 + 2068959101 * var1.field4250]) {
               var7 = true;
            }
         }

         if (var1.field4245 * 498415289 >= 0
            && var6.field4288 != null
            && (this.field4221[591677655 * var1.field4247] & 1) == 0
            && (var1.field4243 * 35559339 < 0 || var1 != this.field4220[591677655 * var1.field4247][35559339 * var1.field4248])) {
            if (-1238659105 * var6.field4282 > 0) {
               var1.field4258 = var1.field4258 + (int)(128.0 * Math.pow(2.0, -1238659105 * var6.field4286 * var8) + 0.5) * 1676144521;
            } else {
               var1.field4244 = var1.field4245 + -201866112;
            }

            while (
               -1743855771 * var1.field4249 < var6.field4289.length - 2
                  && 498415289 * var1.field4251 > (var6.field4288[var1.field4256 * -1743855771 + 2] & 255) << 8
            ) {
               var1.field4259 = var1.field4249 + -1309903654;
            }

            if (var6.field4289.length - 2 == var1.field4249 * -1743855771) {
               var7 = true;
            }
         }

         if (var7) {
            var1.stream.method3242(67522799 * var1.field4252);
            if (null != var2) {
               var1.stream.vmethod175(var2, var3, var4);
            } else {
               var1.stream.vmethod176(var4);
            }

            if (RawPcmStream.method3305(var1.stream)) {
               this.patchStream.mixer.method3423(var1.stream);
            }

            var1.method7737(-207244036);
            if (498415289 * var1.field4253 >= 0) {
               var1.method11660();
               if (var1.field4251 * 35559339 > 0 && var1 == this.field4220[var1.field4242 * 591677655][35559339 * var1.field4250]) {
                  this.field4224[591677655 * var1.field4245][35559339 * var1.field4248] = null;
               }
            }

            return true;
         } else {
            var1.stream.method3280(67522799 * var1.field4253, this.method7719(var1, -1706990626), this.method7716(var1, -161856747));
            return false;
         }
      } else {
         var1.method7737(1267020652);
         var1.vmethod156();
         if (35559339 * var1.field4252 > 0 && var1 == this.field4220[var1.field4248 * 591677655][var1.field4248 * 35559339]) {
            this.field4224[var1.field4242 * 591677655][35559339 * var1.field4256] = null;
         }

         return true;
      }
   }
}
