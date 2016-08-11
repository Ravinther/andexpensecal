package com.dropbox.client2.p030c;

/* renamed from: com.dropbox.client2.c.j */
class C0373j extends Thread {
    private static C0373j f2362d;
    private final C0369f f2363a;
    private final int f2364b;
    private final int f2365c;

    static {
        f2362d = null;
    }

    public C0373j(C0369f c0369f, int i, int i2) {
        this.f2363a = c0369f;
        this.f2364b = i;
        this.f2365c = i2 * 1000;
    }

    public static synchronized void m2332a(C0369f c0369f, int i, int i2) {
        synchronized (C0373j.class) {
            if (f2362d == null) {
                f2362d = new C0373j(c0369f, i, i2);
                f2362d.start();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r5 = this;
        r4 = 0;
    L_0x0001:
        monitor-enter(r5);	 Catch:{ InterruptedException -> 0x002b }
        r0 = r5.f2365c;	 Catch:{ all -> 0x0028 }
        r0 = (long) r0;	 Catch:{ all -> 0x0028 }
        r5.wait(r0);	 Catch:{ all -> 0x0028 }
        monitor-exit(r5);	 Catch:{ all -> 0x0028 }
        r0 = r5.f2363a;	 Catch:{ InterruptedException -> 0x002b }
        r0.closeExpiredConnections();	 Catch:{ InterruptedException -> 0x002b }
        r0 = r5.f2363a;	 Catch:{ InterruptedException -> 0x002b }
        r1 = r5.f2364b;	 Catch:{ InterruptedException -> 0x002b }
        r2 = (long) r1;	 Catch:{ InterruptedException -> 0x002b }
        r1 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x002b }
        r0.closeIdleConnections(r2, r1);	 Catch:{ InterruptedException -> 0x002b }
        r1 = com.dropbox.client2.p030c.C0373j.class;
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x002b }
        r0 = r5.f2363a;	 Catch:{ all -> 0x0031 }
        r0 = r0.getConnectionsInPool();	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x002f;
    L_0x0023:
        r0 = 0;
        f2362d = r0;	 Catch:{ all -> 0x0031 }
        monitor-exit(r1);	 Catch:{ all -> 0x0031 }
    L_0x0027:
        return;
    L_0x0028:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0028 }
        throw r0;	 Catch:{ InterruptedException -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        f2362d = r4;
        goto L_0x0027;
    L_0x002f:
        monitor-exit(r1);	 Catch:{ all -> 0x0031 }
        goto L_0x0001;
    L_0x0031:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0031 }
        throw r0;	 Catch:{ InterruptedException -> 0x002b }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dropbox.client2.c.j.run():void");
    }
}
