package com.google.api.client.p050d;

import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateFactory;

/* renamed from: com.google.api.client.d.an */
public final class an {
    public static Signature m6919a() {
        return Signature.getInstance("SHA256withRSA");
    }

    public static boolean m6920a(Signature signature, PublicKey publicKey, byte[] bArr, byte[] bArr2) {
        signature.initVerify(publicKey);
        signature.update(bArr2);
        return signature.verify(bArr);
    }

    public static CertificateFactory m6921b() {
        return CertificateFactory.getInstance("X.509");
    }
}
