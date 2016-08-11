package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class om {
    private final ok f7264a;
    private final SecureRandom f7265b;

    public om(ok okVar, SecureRandom secureRandom) {
        this.f7264a = okVar;
        this.f7265b = secureRandom;
    }

    static void m6354a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ 68);
        }
    }

    public byte[] m6355a(String str) {
        try {
            byte[] a = this.f7264a.m5613a(str, false);
            if (a.length != 32) {
                throw new on(this);
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(a, 4, 16).get(bArr);
            m6354a(bArr);
            return bArr;
        } catch (Throwable e) {
            throw new on(this, e);
        }
    }

    public byte[] m6356a(byte[] bArr, String str) {
        if (bArr.length != 16) {
            throw new on(this);
        }
        try {
            byte[] a = this.f7264a.m5613a(str, false);
            if (a.length <= 16) {
                throw new on(this);
            }
            ByteBuffer allocate = ByteBuffer.allocate(a.length);
            allocate.put(a);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            a = new byte[(a.length - 16)];
            allocate.get(bArr2);
            allocate.get(a);
            Key secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(bArr2));
            return instance.doFinal(a);
        } catch (Throwable e) {
            throw new on(this, e);
        } catch (Throwable e2) {
            throw new on(this, e2);
        } catch (Throwable e22) {
            throw new on(this, e22);
        } catch (Throwable e222) {
            throw new on(this, e222);
        } catch (Throwable e2222) {
            throw new on(this, e2222);
        } catch (Throwable e22222) {
            throw new on(this, e22222);
        } catch (Throwable e222222) {
            throw new on(this, e222222);
        }
    }
}
