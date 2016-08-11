package com.expensemanager;

import android.view.View;
import android.widget.ListView;

class vj implements Runnable {
    final /* synthetic */ ListView f5368a;
    final /* synthetic */ int f5369b;
    final /* synthetic */ ExpenseMileageActivities f5370c;

    vj(ExpenseMileageActivities expenseMileageActivities, ListView listView, int i) {
        this.f5370c = expenseMileageActivities;
        this.f5368a = listView;
        this.f5369b = i;
    }

    public void run() {
        this.f5368a.setSelection(this.f5369b);
        View childAt = this.f5368a.getChildAt(this.f5369b);
        if (childAt != null) {
            childAt.requestFocus();
        }
    }
}
