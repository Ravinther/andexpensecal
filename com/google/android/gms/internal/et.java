package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;

class et implements Runnable {
    final /* synthetic */ ErrorCode f6511a;
    final /* synthetic */ er f6512b;

    et(er erVar, ErrorCode errorCode) {
        this.f6512b = erVar;
        this.f6511a = errorCode;
    }

    public void run() {
        try {
            this.f6512b.f6509a.m5380a(fd.m5476a(this.f6511a));
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdFailedToLoad.", e);
        }
    }
}
