package com.jagex.oldscape.pub;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("com/jagex/oldscape/pub/OAuthApi")
public interface OAuthApi {
   void setClient(int var1);

   void setRefreshTokenRequester(RefreshAccessTokenRequester var1);

   @ObfuscatedSignature(descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V")
   @ObfuscatedName("abb")
   void vmethod213(OtlTokenRequester var1);

   boolean isOnLoginScreen();

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("abp")
   boolean vmethod219();

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aba")
   void vmethod211(int var1);

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("abv")
   void vmethod212(int var1);

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("abj")
   void vmethod210(int var1);

   @ObfuscatedSignature(descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V")
   @ObfuscatedName("abz")
   void vmethod215(OtlTokenRequester var1);

   void setOtlTokenRequester(OtlTokenRequester var1);

   long getAccountHash();

   @ObfuscatedSignature(descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V")
   @ObfuscatedName("abx")
   void vmethod214(OtlTokenRequester var1);

   @ObfuscatedSignature(descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V")
   @ObfuscatedName("abr")
   void vmethod218(RefreshAccessTokenRequester var1);

   @ObfuscatedSignature(descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V")
   @ObfuscatedName("aby")
   void vmethod216(RefreshAccessTokenRequester var1);

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("abf")
   boolean vmethod220();

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("abu")
   long vmethod225();

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("abh")
   long vmethod223();

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("abd")
   long vmethod224();

   @ObfuscatedSignature(descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V")
   @ObfuscatedName("abq")
   void vmethod217(RefreshAccessTokenRequester var1);

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("abi")
   long vmethod222();

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("abl")
   long vmethod221();

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("acu")
   long vmethod226();
}
