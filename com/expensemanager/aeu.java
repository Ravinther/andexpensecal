package com.expensemanager;

import android.view.View;
import android.widget.ListView;

class aeu implements Runnable {
    final /* synthetic */ ListView f4016a;
    final /* synthetic */ int f4017b;
    final /* synthetic */ SMSList f4018c;

    aeu(SMSList sMSList, ListView listView, int i) {
        this.f4018c = sMSList;
        this.f4016a = listView;
        this.f4017b = i;
    }

    public void run() {
        this.f4016a.setSelection(this.f4017b);
        View childAt = this.f4016a.getChildAt(this.f4017b);
        if (childAt != null) {
            childAt.requestFocus();
        }
    }
}
