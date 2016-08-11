package com.google.api.client.googleapis.p074d;

/* renamed from: com.google.api.client.googleapis.d.e */
public class C0765e implements C0764f {
    private final String key;
    private final String userIp;

    public C0765e() {
        this(null);
    }

    public C0765e(String str) {
        this(str, null);
    }

    public C0765e(String str, String str2) {
        this.key = str;
        this.userIp = str2;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getUserIp() {
        return this.userIp;
    }

    public void initialize(C0762c<?> c0762c) {
        if (this.key != null) {
            c0762c.put("key", (Object) this.key);
        }
        if (this.userIp != null) {
            c0762c.put("userIp", (Object) this.userIp);
        }
    }
}
