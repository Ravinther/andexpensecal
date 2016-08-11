package com.expensemanager;

import android.view.View;

class acv implements Runnable {
    final /* synthetic */ View f3935a;
    final /* synthetic */ MyTabPageIndicator f3936b;

    acv(MyTabPageIndicator myTabPageIndicator, View view) {
        this.f3936b = myTabPageIndicator;
        this.f3935a = view;
    }

    public void run() {
        this.f3936b.smoothScrollTo(this.f3935a.getLeft() - ((this.f3936b.getWidth() - this.f3935a.getWidth()) / 2), 0);
        this.f3936b.f3521b = null;
    }
}
