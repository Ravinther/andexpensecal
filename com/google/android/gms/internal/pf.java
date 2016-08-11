package com.google.android.gms.internal;

import android.content.Intent;

class pf implements Runnable {
    final /* synthetic */ Intent f7298a;
    final /* synthetic */ pb f7299b;

    pf(pb pbVar, Intent intent) {
        this.f7299b = pbVar;
        this.f7298a = intent;
    }

    public void run() {
        if (!(ha.m5702a(this.f7298a) != 0 || this.f7299b.f7288c.f7310j == null || this.f7299b.f7288c.f7310j.f6976b == null || this.f7299b.f7288c.f7310j.f6976b.m6095d() == null)) {
            this.f7299b.f7288c.f7310j.f6976b.m6095d().m5535a();
        }
        this.f7299b.f7288c.f7324x = false;
    }
}
