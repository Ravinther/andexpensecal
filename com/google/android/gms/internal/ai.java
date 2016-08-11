package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class ai {
    private static MessageDigest f6222b;
    protected Object f6223a;

    static {
        f6222b = null;
    }

    public ai() {
        this.f6223a = new Object();
    }

    protected MessageDigest m5031a() {
        MessageDigest messageDigest;
        synchronized (this.f6223a) {
            if (f6222b != null) {
                messageDigest = f6222b;
            } else {
                for (int i = 0; i < 2; i++) {
                    try {
                        f6222b = MessageDigest.getInstance("MD5");
                    } catch (NoSuchAlgorithmException e) {
                    }
                }
                messageDigest = f6222b;
            }
        }
        return messageDigest;
    }

    abstract byte[] m5032a(String str);
}
