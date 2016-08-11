package com.google.android.gms.internal;

import android.os.Bundle;

@id
public class pi {
    private pj f7327a;
    private boolean f7328b;
    private boolean f7329c;

    public pi() {
        boolean z = false;
        Bundle n = kw.m5958n();
        if (n != null && n.getBoolean("gads:block_autoclicks", false)) {
            z = true;
        }
        this.f7329c = z;
    }

    public pi(boolean z) {
        this.f7329c = z;
    }

    public void m6477a() {
        this.f7328b = true;
    }

    public void m6478a(pj pjVar) {
        this.f7327a = pjVar;
    }

    public void m6479a(String str) {
        ly.m6065a("Action was blocked because no click was detected.");
        if (this.f7327a != null) {
            this.f7327a.m6481a(str);
        }
    }

    public boolean m6480b() {
        return !this.f7329c || this.f7328b;
    }
}
