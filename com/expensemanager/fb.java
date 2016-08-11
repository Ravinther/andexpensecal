package com.expensemanager;

import android.view.View;
import android.widget.ListView;

class fb implements Runnable {
    final /* synthetic */ ListView f4622a;
    final /* synthetic */ int f4623b;
    final /* synthetic */ ExpenseAccountActivities f4624c;

    fb(ExpenseAccountActivities expenseAccountActivities, ListView listView, int i) {
        this.f4624c = expenseAccountActivities;
        this.f4622a = listView;
        this.f4623b = i;
    }

    public void run() {
        this.f4622a.setSelection(this.f4623b);
        View childAt = this.f4622a.getChildAt(this.f4623b);
        if (childAt != null) {
            childAt.requestFocus();
        }
    }
}
