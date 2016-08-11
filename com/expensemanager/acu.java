package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class acu implements OnClickListener {
    final /* synthetic */ MyTabPageIndicator f3934a;

    acu(MyTabPageIndicator myTabPageIndicator) {
        this.f3934a = myTabPageIndicator;
    }

    public void onClick(View view) {
        acx com_expensemanager_acx = (acx) view;
        int currentItem = this.f3934a.f3524e.getCurrentItem();
        int a = com_expensemanager_acx.m3832a();
        this.f3934a.f3524e.setCurrentItem(a);
        if (currentItem == a && this.f3934a.f3528i != null) {
            this.f3934a.f3528i.m3830a(a);
        }
    }
}
