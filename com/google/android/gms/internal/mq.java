package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public abstract class mq implements kv {
    protected MotionEvent f7138a;
    protected DisplayMetrics f7139b;
    protected ok f7140c;
    private ol f7141d;

    protected mq(Context context, ok okVar, ol olVar) {
        this.f7140c = okVar;
        this.f7141d = olVar;
        try {
            this.f7139b = context.getResources().getDisplayMetrics();
        } catch (UnsupportedOperationException e) {
            this.f7139b = new DisplayMetrics();
            this.f7139b.density = 1.0f;
        }
    }

    private String m6130a(Context context, String str, boolean z) {
        try {
            byte[] b;
            synchronized (this) {
                m6131a();
                if (z) {
                    m6142c(context);
                } else {
                    m6141b(context);
                }
                b = m6132b();
            }
            return b.length == 0 ? Integer.toString(5) : m6135a(b, str);
        } catch (NoSuchAlgorithmException e) {
            return Integer.toString(7);
        } catch (UnsupportedEncodingException e2) {
            return Integer.toString(7);
        } catch (IOException e3) {
            return Integer.toString(3);
        }
    }

    private void m6131a() {
        this.f7141d.m6350a();
    }

    private byte[] m6132b() {
        return this.f7141d.m6353b();
    }

    public String m6133a(Context context) {
        return m6130a(context, null, false);
    }

    public String m6134a(Context context, String str) {
        return m6130a(context, str, true);
    }

    String m6135a(byte[] bArr, String str) {
        byte[] bArr2;
        if (bArr.length > 239) {
            m6131a();
            m6137a(20, 1);
            bArr = m6132b();
        }
        if (bArr.length < 239) {
            bArr2 = new byte[(239 - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            bArr2 = ByteBuffer.allocate(240).put((byte) bArr.length).put(bArr).put(bArr2).array();
        } else {
            bArr2 = ByteBuffer.allocate(240).put((byte) bArr.length).put(bArr).array();
        }
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(bArr2);
        bArr2 = ByteBuffer.allocate(256).put(instance.digest()).put(bArr2).array();
        byte[] bArr3 = new byte[256];
        new ig().m5757a(bArr2, bArr3);
        if (str != null && str.length() > 0) {
            m6140a(str, bArr3);
        }
        return this.f7140c.m5612a(bArr3, true);
    }

    public void m6136a(int i, int i2, int i3) {
        if (this.f7138a != null) {
            this.f7138a.recycle();
        }
        this.f7138a = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * this.f7139b.density, ((float) i2) * this.f7139b.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
    }

    protected void m6137a(int i, long j) {
        this.f7141d.m6351a(i, j);
    }

    protected void m6138a(int i, String str) {
        this.f7141d.m6352a(i, str);
    }

    public void m6139a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f7138a != null) {
                this.f7138a.recycle();
            }
            this.f7138a = MotionEvent.obtain(motionEvent);
        }
    }

    void m6140a(String str, byte[] bArr) {
        if (str.length() > 32) {
            str = str.substring(0, 32);
        }
        new oq(str.getBytes("UTF-8")).m6381a(bArr);
    }

    protected abstract void m6141b(Context context);

    protected abstract void m6142c(Context context);
}
