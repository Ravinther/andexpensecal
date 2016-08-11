package com.google.api.client.p055c.p056a.p057a.p058a.p059a;

/* renamed from: com.google.api.client.c.a.a.a.a.g */
public final class C0703g {
    public static void m6840a(Throwable th) {
        C0703g.m6841a(th, Error.class);
        C0703g.m6841a(th, RuntimeException.class);
    }

    public static <X extends Throwable> void m6841a(Throwable th, Class<X> cls) {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    public static RuntimeException m6842b(Throwable th) {
        C0703g.m6840a((Throwable) C0701e.m6830a((Object) th));
        throw new RuntimeException(th);
    }
}
