package com.viewpagerindicator;

import android.view.View;

/* renamed from: com.viewpagerindicator.g */
class C0799g implements Runnable {
    final /* synthetic */ View f7792a;
    final /* synthetic */ TabPageIndicator f7793b;

    C0799g(TabPageIndicator tabPageIndicator, View view) {
        this.f7793b = tabPageIndicator;
        this.f7792a = view;
    }

    public void run() {
        this.f7793b.smoothScrollTo(this.f7792a.getLeft() - ((this.f7793b.getWidth() - this.f7792a.getWidth()) / 2), 0);
        this.f7793b.f7777b = null;
    }
}
