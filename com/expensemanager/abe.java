package com.expensemanager;

import android.view.View;
import android.widget.ListView;

final class abe implements Runnable {
    final /* synthetic */ ListView f3829a;
    final /* synthetic */ int f3830b;

    abe(ListView listView, int i) {
        this.f3829a = listView;
        this.f3830b = i;
    }

    public void run() {
        this.f3829a.setSelection(this.f3830b);
        View childAt = this.f3829a.getChildAt(this.f3830b);
        if (childAt != null) {
            childAt.requestFocus();
        }
    }
}
