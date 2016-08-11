package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;

class gt implements Runnable {
    final /* synthetic */ gw f6672a;
    final /* synthetic */ Intent f6673b;
    final /* synthetic */ gr f6674c;

    gt(gr grVar, gw gwVar, Intent intent) {
        this.f6674c = grVar;
        this.f6672a = gwVar;
        this.f6673b = intent;
    }

    public void run() {
        try {
            if (this.f6674c.f6666h.m5710a(this.f6672a.f6689b, -1, this.f6673b)) {
                this.f6674c.f6662d.m5731a(new gx(this.f6674c.f6661c, this.f6672a.f6690c, true, -1, this.f6673b, this.f6672a));
            } else {
                this.f6674c.f6662d.m5731a(new gx(this.f6674c.f6661c, this.f6672a.f6690c, false, -1, this.f6673b, this.f6672a));
            }
        } catch (RemoteException e) {
            ly.m6074e("Fail to verify and dispatch pending transaction");
        }
    }
}
