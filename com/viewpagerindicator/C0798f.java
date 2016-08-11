package com.viewpagerindicator;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.viewpagerindicator.f */
class C0798f implements OnClickListener {
    final /* synthetic */ TabPageIndicator f7791a;

    C0798f(TabPageIndicator tabPageIndicator) {
        this.f7791a = tabPageIndicator;
    }

    public void onClick(View view) {
        C0801i c0801i = (C0801i) view;
        int currentItem = this.f7791a.f7780e.getCurrentItem();
        int a = c0801i.m7189a();
        this.f7791a.f7780e.setCurrentItem(a);
        if (currentItem == a && this.f7791a.f7784i != null) {
            this.f7791a.f7784i.m7187a(a);
        }
    }
}
