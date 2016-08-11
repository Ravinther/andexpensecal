package com.google.android.gms.internal;

@id
public abstract class jm extends lb {
    private final fh f6858a;
    private final jl f6859b;

    public jm(fh fhVar, jl jlVar) {
        this.f6858a = fhVar;
        this.f6859b = jlVar;
    }

    private static fj m5816a(jt jtVar, fh fhVar) {
        fj fjVar = null;
        try {
            fjVar = jtVar.m5840a(fhVar);
        } catch (Throwable e) {
            ly.m6073d("Could not fetch ad response from ad request service.", e);
        } catch (Throwable e2) {
            ly.m6073d("Could not fetch ad response from ad request service due to an Exception.", e2);
        } catch (Throwable e22) {
            ly.m6073d("Could not fetch ad response from ad request service due to an Exception.", e22);
        } catch (Throwable e222) {
            kw.m5951a(e222);
        }
        return fjVar;
    }

    public final void m5817a() {
        try {
            fj fjVar;
            jt d = m5820d();
            if (d == null) {
                fjVar = new fj(0);
            } else {
                fjVar = m5816a(d, this.f6858a);
                if (fjVar == null) {
                    fjVar = new fj(0);
                }
            }
            m5819c();
            this.f6859b.m5771a(fjVar);
        } catch (Throwable th) {
            m5819c();
        }
    }

    public final void m5818b() {
        m5819c();
    }

    public abstract void m5819c();

    public abstract jt m5820d();
}
