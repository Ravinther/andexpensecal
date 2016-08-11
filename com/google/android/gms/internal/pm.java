package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@id
class pm implements kv, Runnable {
    CountDownLatch f7332a;
    private final List<Object[]> f7333b;
    private final AtomicReference<kv> f7334c;
    private ph f7335d;

    public pm(ph phVar) {
        this.f7333b = new Vector();
        this.f7334c = new AtomicReference();
        this.f7332a = new CountDownLatch(1);
        this.f7335d = phVar;
        if (lx.m6064b()) {
            le.m5994a((Runnable) this);
        } else {
            run();
        }
    }

    private Context m6483b(Context context) {
        if (!m6491b()) {
            return context;
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    private void m6484c() {
        if (!this.f7333b.isEmpty()) {
            for (Object[] objArr : this.f7333b) {
                if (objArr.length == 1) {
                    ((kv) this.f7334c.get()).m5945a((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    ((kv) this.f7334c.get()).m5944a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
        }
    }

    public String m6485a(Context context) {
        if (m6490a()) {
            kv kvVar = (kv) this.f7334c.get();
            if (kvVar != null) {
                m6484c();
                return kvVar.m5942a(m6483b(context));
            }
        }
        return "";
    }

    public String m6486a(Context context, String str) {
        if (m6490a()) {
            kv kvVar = (kv) this.f7334c.get();
            if (kvVar != null) {
                m6484c();
                return kvVar.m5943a(m6483b(context), str);
            }
        }
        return "";
    }

    public void m6487a(int i, int i2, int i3) {
        kv kvVar = (kv) this.f7334c.get();
        if (kvVar != null) {
            m6484c();
            kvVar.m5944a(i, i2, i3);
            return;
        }
        this.f7333b.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public void m6488a(MotionEvent motionEvent) {
        kv kvVar = (kv) this.f7334c.get();
        if (kvVar != null) {
            m6484c();
            kvVar.m5945a(motionEvent);
            return;
        }
        this.f7333b.add(new Object[]{motionEvent});
    }

    protected void m6489a(kv kvVar) {
        this.f7334c.set(kvVar);
    }

    protected boolean m6490a() {
        try {
            this.f7332a.await();
            return true;
        } catch (Throwable e) {
            ly.m6073d("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    protected boolean m6491b() {
        return kw.m5958n().getBoolean("gads:spam_app_context:enabled", false);
    }

    public void run() {
        try {
            m6489a(na.m6166a(this.f7335d.f7305e.f6668b, m6483b(this.f7335d.f7303c)));
        } finally {
            this.f7332a.countDown();
            this.f7335d = null;
        }
    }
}
