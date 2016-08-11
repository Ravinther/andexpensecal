package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.nf$com.google.android.gms.internal.nj;
import java.util.HashSet;

final class np {
    final /* synthetic */ no f7242a;
    private final String f7243b;
    private final nq f7244c;
    private final HashSet<nj> f7245d;
    private int f7246e;
    private boolean f7247f;
    private IBinder f7248g;
    private ComponentName f7249h;

    public np(no noVar, String str) {
        this.f7242a = noVar;
        this.f7243b = str;
        this.f7244c = new nq(this);
        this.f7245d = new HashSet();
        this.f7246e = 2;
    }

    public void m6207a() {
        this.f7247f = this.f7242a.f7239c.bindService(new Intent(this.f7243b).setPackage("com.google.android.gms"), this.f7244c, 129);
        if (this.f7247f) {
            this.f7246e = 3;
        } else {
            this.f7242a.f7239c.unbindService(this.f7244c);
        }
    }

    public void m6208a(nj njVar) {
        this.f7245d.add(njVar);
    }

    public void m6209b() {
        this.f7242a.f7239c.unbindService(this.f7244c);
        this.f7247f = false;
        this.f7246e = 2;
    }

    public void m6210b(nj njVar) {
        this.f7245d.remove(njVar);
    }

    public String m6211c() {
        return this.f7243b;
    }

    public boolean m6212c(nj njVar) {
        return this.f7245d.contains(njVar);
    }

    public boolean m6213d() {
        return this.f7247f;
    }

    public int m6214e() {
        return this.f7246e;
    }

    public boolean m6215f() {
        return this.f7245d.isEmpty();
    }

    public IBinder m6216g() {
        return this.f7248g;
    }

    public ComponentName m6217h() {
        return this.f7249h;
    }
}
