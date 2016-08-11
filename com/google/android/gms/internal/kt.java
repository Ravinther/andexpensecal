package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@id
public class kt {
    private final kw f7006a;
    private final LinkedList<ku> f7007b;
    private final Object f7008c;
    private final String f7009d;
    private final String f7010e;
    private long f7011f;
    private long f7012g;
    private boolean f7013h;
    private long f7014i;
    private long f7015j;
    private long f7016k;
    private long f7017l;

    public kt(kw kwVar, String str, String str2) {
        this.f7008c = new Object();
        this.f7011f = -1;
        this.f7012g = -1;
        this.f7013h = false;
        this.f7014i = -1;
        this.f7015j = 0;
        this.f7016k = -1;
        this.f7017l = -1;
        this.f7006a = kwVar;
        this.f7009d = str;
        this.f7010e = str2;
        this.f7007b = new LinkedList();
    }

    public kt(String str, String str2) {
        this(kw.m5947a(), str, str2);
    }

    public void m5929a() {
        synchronized (this.f7008c) {
            if (this.f7017l != -1 && this.f7012g == -1) {
                this.f7012g = SystemClock.elapsedRealtime();
                this.f7006a.m5961a(this);
            }
            kw kwVar = this.f7006a;
            kw.m5954f().m5984c();
        }
    }

    public void m5930a(long j) {
        synchronized (this.f7008c) {
            this.f7017l = j;
            if (this.f7017l != -1) {
                this.f7006a.m5961a(this);
            }
        }
    }

    public void m5931a(av avVar) {
        synchronized (this.f7008c) {
            this.f7016k = SystemClock.elapsedRealtime();
            kw kwVar = this.f7006a;
            kw.m5954f().m5982a(avVar, this.f7016k);
        }
    }

    public void m5932a(boolean z) {
        synchronized (this.f7008c) {
            if (this.f7017l != -1) {
                this.f7014i = SystemClock.elapsedRealtime();
                if (!z) {
                    this.f7012g = this.f7014i;
                    this.f7006a.m5961a(this);
                }
            }
        }
    }

    public void m5933b() {
        synchronized (this.f7008c) {
            if (this.f7017l != -1) {
                ku kuVar = new ku();
                kuVar.m5940c();
                this.f7007b.add(kuVar);
                this.f7015j++;
                kw kwVar = this.f7006a;
                kw.m5954f().m5983b();
                this.f7006a.m5961a(this);
            }
        }
    }

    public void m5934b(long j) {
        synchronized (this.f7008c) {
            if (this.f7017l != -1) {
                this.f7011f = j;
                this.f7006a.m5961a(this);
            }
        }
    }

    public void m5935b(boolean z) {
        synchronized (this.f7008c) {
            if (this.f7017l != -1) {
                this.f7013h = z;
                this.f7006a.m5961a(this);
            }
        }
    }

    public void m5936c() {
        synchronized (this.f7008c) {
            if (!(this.f7017l == -1 || this.f7007b.isEmpty())) {
                ku kuVar = (ku) this.f7007b.getLast();
                if (kuVar.m5938a() == -1) {
                    kuVar.m5939b();
                    this.f7006a.m5961a(this);
                }
            }
        }
    }

    public Bundle m5937d() {
        Bundle bundle;
        synchronized (this.f7008c) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f7009d);
            bundle.putString("slotid", this.f7010e);
            bundle.putBoolean("ismediation", this.f7013h);
            bundle.putLong("treq", this.f7016k);
            bundle.putLong("tresponse", this.f7017l);
            bundle.putLong("timp", this.f7012g);
            bundle.putLong("tload", this.f7014i);
            bundle.putLong("pcc", this.f7015j);
            bundle.putLong("tfetch", this.f7011f);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f7007b.iterator();
            while (it.hasNext()) {
                arrayList.add(((ku) it.next()).m5941d());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
