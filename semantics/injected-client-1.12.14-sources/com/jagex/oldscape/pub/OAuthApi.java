package com.jagex.oldscape.pub;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("com/jagex/oldscape/pub/OAuthApi")
public interface OAuthApi {
   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("amn")
   long vmethod127();

   @ObfuscatedSignature(descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V")
   @ObfuscatedName("ams")
   void vmethod124(OtlTokenRequester var1);

   boolean isOnLoginScreen();

   long getAccountHash();

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ali")
   void vmethod121(int var1);

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("ama")
   long vmethod128();

   void setClient(int var1);

   void setOtlTokenRequester(OtlTokenRequester var1);

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("alz")
   void vmethod122(int var1);

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("alw")
   void vmethod119(int var1);

   @ObfuscatedSignature(descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V")
   @ObfuscatedName("amx")
   void vmethod123(OtlTokenRequester var1);

   @ObfuscatedSignature(descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V")
   @ObfuscatedName("amu")
   void vmethod126(RefreshAccessTokenRequester var1);

   @ObfuscatedSignature(descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V")
   @ObfuscatedName("amm")
   void vmethod125(RefreshAccessTokenRequester var1);

   void setRefreshTokenRequester(RefreshAccessTokenRequester var1);

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("amo")
   void vmethod120(int var1);
}
