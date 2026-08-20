package org.bouncycastle.crypto.tls;

import java.util.Hashtable;

public abstract class DefaultTlsClient implements TlsClient {
   public DefaultTlsClient() {
      throw new Exception();
   }

   public Hashtable getClientExtensions() {
      return null;
   }
}
