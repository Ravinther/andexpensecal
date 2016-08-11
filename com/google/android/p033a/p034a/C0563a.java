package com.google.android.p033a.p034a;

import com.google.android.p033a.p034a.p045a.C0560a;
import com.google.android.p033a.p034a.p045a.C0561b;
import java.security.Key;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.a.a.a */
public class C0563a implements C0562p {
    private static final byte[] f5995a;
    private Cipher f5996b;
    private Cipher f5997c;

    static {
        f5995a = new byte[]{(byte) 16, (byte) 74, (byte) 71, (byte) -80, (byte) 32, (byte) 101, (byte) -47, (byte) 72, (byte) 117, (byte) -14, (byte) 0, (byte) -29, (byte) 70, (byte) 65, (byte) -12, (byte) 74};
    }

    public C0563a(byte[] bArr, String str, String str2) {
        try {
            Key secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBEWITHSHAAND256BITAES-CBC-BC").generateSecret(new PBEKeySpec((str + str2).toCharArray(), bArr, 1024, 256)).getEncoded(), "AES");
            this.f5996b = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f5996b.init(1, secretKeySpec, new IvParameterSpec(f5995a));
            this.f5997c = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f5997c.init(2, secretKeySpec, new IvParameterSpec(f5995a));
        } catch (Throwable e) {
            throw new RuntimeException("Invalid environment", e);
        }
    }

    public String m4828a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return C0560a.m4819a(this.f5996b.doFinal(("com.android.vending.licensing.AESObfuscator-1|" + str2 + str).getBytes("UTF-8")));
        } catch (Throwable e) {
            throw new RuntimeException("Invalid environment", e);
        } catch (Throwable e2) {
            throw new RuntimeException("Invalid environment", e2);
        }
    }

    public String m4829b(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            String str3 = new String(this.f5997c.doFinal(C0560a.m4821a(str)), "UTF-8");
            if (str3.indexOf("com.android.vending.licensing.AESObfuscator-1|" + str2) == 0) {
                return str3.substring("com.android.vending.licensing.AESObfuscator-1|".length() + str2.length(), str3.length());
            }
            throw new C0581u("Header not found (invalid data or key):" + str);
        } catch (C0561b e) {
            throw new C0581u(e.getMessage() + ":" + str);
        } catch (IllegalBlockSizeException e2) {
            throw new C0581u(e2.getMessage() + ":" + str);
        } catch (BadPaddingException e3) {
            throw new C0581u(e3.getMessage() + ":" + str);
        } catch (Throwable e4) {
            throw new RuntimeException("Invalid environment", e4);
        }
    }
}
