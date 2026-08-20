package com.jagex.oldscape.pub;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("com/jagex/oldscape/pub/OtlTokenResponse")
public interface OtlTokenResponse {
   String getToken();

   boolean isSuccess();
}
