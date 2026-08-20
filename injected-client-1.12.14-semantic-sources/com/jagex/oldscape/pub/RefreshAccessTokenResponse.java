package com.jagex.oldscape.pub;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("com/jagex/oldscape/pub/RefreshAccessTokenResponse")
public interface RefreshAccessTokenResponse {
   String getAccessToken();

   boolean isSuccess();

   String getRefreshToken();
}
