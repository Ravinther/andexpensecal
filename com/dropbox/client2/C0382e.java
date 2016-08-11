package com.dropbox.client2;

import com.dropbox.client2.p029a.C0345a;
import com.dropbox.client2.p029a.C0347c;
import java.io.FilterInputStream;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;

/* renamed from: com.dropbox.client2.e */
public class C0382e extends FilterInputStream {
    private final HttpUriRequest f2381a;
    private final C0381d f2382b;

    public C0382e(HttpUriRequest httpUriRequest, HttpResponse httpResponse) {
        super(null);
        HttpEntity entity = httpResponse.getEntity();
        if (entity == null) {
            throw new C0345a("Didn't get entity from HttpResponse");
        }
        try {
            this.in = entity.getContent();
            this.f2381a = httpUriRequest;
            this.f2382b = new C0381d(null);
        } catch (IOException e) {
            throw new C0347c(e);
        }
    }

    public C0381d m2342a() {
        return this.f2382b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m2343a(java.io.OutputStream r19, com.dropbox.client2.C0386j r20) {
        /*
        r18 = this;
        r3 = 0;
        r4 = 0;
        r6 = 0;
        r0 = r18;
        r2 = r0.f2382b;
        r10 = r2.m2341b();
        r8 = new java.io.BufferedOutputStream;	 Catch:{ IOException -> 0x00b6, all -> 0x00b1 }
        r0 = r19;
        r8.<init>(r0);	 Catch:{ IOException -> 0x00b6, all -> 0x00b1 }
        r2 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r9 = new byte[r2];	 Catch:{ IOException -> 0x00b8, all -> 0x00b4 }
        r16 = r6;
        r6 = r4;
        r4 = r16;
    L_0x001d:
        r0 = r18;
        r2 = r0.read(r9);	 Catch:{ IOException -> 0x0035, all -> 0x00b4 }
        if (r2 >= 0) goto L_0x005c;
    L_0x0025:
        r2 = 0;
        r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x0079;
    L_0x002b:
        r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r2 >= 0) goto L_0x0079;
    L_0x002f:
        r2 = new com.dropbox.client2.a.f;	 Catch:{ IOException -> 0x0035, all -> 0x00b4 }
        r2.<init>(r6);	 Catch:{ IOException -> 0x0035, all -> 0x00b4 }
        throw r2;	 Catch:{ IOException -> 0x0035, all -> 0x00b4 }
    L_0x0035:
        r2 = move-exception;
        r4 = r6;
        r3 = r8;
    L_0x0038:
        r2 = r2.getMessage();	 Catch:{ all -> 0x004c }
        if (r2 == 0) goto L_0x009f;
    L_0x003e:
        r6 = "No space";
        r2 = r2.startsWith(r6);	 Catch:{ all -> 0x004c }
        if (r2 == 0) goto L_0x009f;
    L_0x0046:
        r2 = new com.dropbox.client2.a.d;	 Catch:{ all -> 0x004c }
        r2.<init>();	 Catch:{ all -> 0x004c }
        throw r2;	 Catch:{ all -> 0x004c }
    L_0x004c:
        r2 = move-exception;
        r8 = r3;
    L_0x004e:
        if (r8 == 0) goto L_0x0053;
    L_0x0050:
        r8.close();	 Catch:{ IOException -> 0x00ab }
    L_0x0053:
        if (r19 == 0) goto L_0x0058;
    L_0x0055:
        r19.close();	 Catch:{ IOException -> 0x00ad }
    L_0x0058:
        r18.close();	 Catch:{ IOException -> 0x00af }
    L_0x005b:
        throw r2;
    L_0x005c:
        r3 = 0;
        r8.write(r9, r3, r2);	 Catch:{ IOException -> 0x0035, all -> 0x00b4 }
        r2 = (long) r2;	 Catch:{ IOException -> 0x0035, all -> 0x00b4 }
        r6 = r6 + r2;
        if (r20 == 0) goto L_0x001d;
    L_0x0064:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x0035, all -> 0x00b4 }
        r12 = r2 - r4;
        r14 = r20.m2345a();	 Catch:{ IOException -> 0x0035, all -> 0x00b4 }
        r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r12 <= 0) goto L_0x00be;
    L_0x0072:
        r0 = r20;
        r0.m2346a(r6, r10);	 Catch:{ IOException -> 0x0035, all -> 0x00b4 }
    L_0x0077:
        r4 = r2;
        goto L_0x001d;
    L_0x0079:
        r8.flush();	 Catch:{ IOException -> 0x0035, all -> 0x00b4 }
        r19.flush();	 Catch:{ IOException -> 0x0035, all -> 0x00b4 }
        r0 = r19;
        r2 = r0 instanceof java.io.FileOutputStream;	 Catch:{ SyncFailedException -> 0x00bc }
        if (r2 == 0) goto L_0x0091;
    L_0x0085:
        r0 = r19;
        r0 = (java.io.FileOutputStream) r0;	 Catch:{ SyncFailedException -> 0x00bc }
        r2 = r0;
        r2 = r2.getFD();	 Catch:{ SyncFailedException -> 0x00bc }
        r2.sync();	 Catch:{ SyncFailedException -> 0x00bc }
    L_0x0091:
        if (r8 == 0) goto L_0x0096;
    L_0x0093:
        r8.close();	 Catch:{ IOException -> 0x00a5 }
    L_0x0096:
        if (r19 == 0) goto L_0x009b;
    L_0x0098:
        r19.close();	 Catch:{ IOException -> 0x00a7 }
    L_0x009b:
        r18.close();	 Catch:{ IOException -> 0x00a9 }
    L_0x009e:
        return;
    L_0x009f:
        r2 = new com.dropbox.client2.a.f;	 Catch:{ all -> 0x004c }
        r2.<init>(r4);	 Catch:{ all -> 0x004c }
        throw r2;	 Catch:{ all -> 0x004c }
    L_0x00a5:
        r2 = move-exception;
        goto L_0x0096;
    L_0x00a7:
        r2 = move-exception;
        goto L_0x009b;
    L_0x00a9:
        r2 = move-exception;
        goto L_0x009e;
    L_0x00ab:
        r3 = move-exception;
        goto L_0x0053;
    L_0x00ad:
        r3 = move-exception;
        goto L_0x0058;
    L_0x00af:
        r3 = move-exception;
        goto L_0x005b;
    L_0x00b1:
        r2 = move-exception;
        r8 = r3;
        goto L_0x004e;
    L_0x00b4:
        r2 = move-exception;
        goto L_0x004e;
    L_0x00b6:
        r2 = move-exception;
        goto L_0x0038;
    L_0x00b8:
        r2 = move-exception;
        r3 = r8;
        goto L_0x0038;
    L_0x00bc:
        r2 = move-exception;
        goto L_0x0091;
    L_0x00be:
        r2 = r4;
        goto L_0x0077;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dropbox.client2.e.a(java.io.OutputStream, com.dropbox.client2.j):void");
    }

    public void close() {
        this.f2381a.abort();
    }
}
