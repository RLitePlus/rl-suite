package org.bouncycastle.crypto.tls;

import java.util.Hashtable;

public abstract class DefaultTlsClient implements TlsClient {
   public Hashtable getClientExtensions() {
      return null;
   }

   public DefaultTlsClient() {
      throw new Exception();
   }
}
