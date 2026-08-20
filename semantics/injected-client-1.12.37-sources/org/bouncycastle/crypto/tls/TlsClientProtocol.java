package org.bouncycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;

public class TlsClientProtocol {
   public OutputStream getOutputStream() {
      return null;
   }

   public InputStream getInputStream() {
      return null;
   }

   public void close() {
   }

   public void connect(TlsClient var1) {
   }

   public TlsClientProtocol(InputStream var1, OutputStream var2, SecureRandom var3) {
      throw new Exception();
   }
}
