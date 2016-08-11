package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;

class ey implements Runnable {
    final /* synthetic */ ErrorCode f6517a;
    final /* synthetic */ er f6518b;

    ey(er erVar, ErrorCode errorCode) {
        this.f6518b = erVar;
        this.f6517a = errorCode;
    }

    public void run() {
        try {
            this.f6518b.f6509a.m5380a(fd.m5476a(this.f6517a));
        } catch (Throwable e) {
            ly.m6073d("Could not call onAdFailedToLoad.", e);
        }
    }
}
