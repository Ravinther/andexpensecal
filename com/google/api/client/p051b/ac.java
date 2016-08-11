package com.google.api.client.p051b;

import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.b.ac */
public abstract class ac {
    static final Logger f7381a;
    private static final String[] f7382b;

    static {
        f7381a = Logger.getLogger(ac.class.getName());
        f7382b = new String[]{"DELETE", "GET", "POST", "PUT"};
        Arrays.sort(f7382b);
    }

    protected abstract af m6577a(String str, String str2);

    public final C0694v m6578a() {
        return m6579a(null);
    }

    public final C0694v m6579a(C0659w c0659w) {
        return new C0694v(this, c0659w);
    }

    public boolean m6580a(String str) {
        return Arrays.binarySearch(f7382b, str) >= 0;
    }

    C0692t m6581b() {
        return new C0692t(this, null);
    }
}
