package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class kf implements OnClickListener {
    final /* synthetic */ ExpenseAutoFillList f4877a;

    kf(ExpenseAutoFillList expenseAutoFillList) {
        this.f4877a = expenseAutoFillList;
    }

    public void onClick(View view) {
        if (this.f4877a.getResources().getString(2131100094).equals(this.f4877a.f2880b.getText())) {
            this.f4877a.f2880b.setText(2131100065);
            this.f4877a.f2885g = true;
            this.f4877a.f2886h.notifyDataSetChanged();
            return;
        }
        this.f4877a.f2880b.setText(2131100094);
        this.f4877a.f2885g = false;
        this.f4877a.f2886h.notifyDataSetChanged();
        this.f4877a.m2790a(this.f4877a.f2883e);
    }
}
