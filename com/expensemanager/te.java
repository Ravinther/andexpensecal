package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class te implements OnClickListener {
    final /* synthetic */ ExpenseGroupAddEdit f5288a;

    te(ExpenseGroupAddEdit expenseGroupAddEdit) {
        this.f5288a = expenseGroupAddEdit;
    }

    public void onClick(View view) {
        long a = this.f5288a.m3171a();
        if (a != 0) {
            if (a == -1) {
                aba.m3745a(this.f5288a.f3220b, null, this.f5288a.getResources().getString(2131099702), -1, this.f5288a.getResources().getString(2131099715), this.f5288a.getResources().getString(2131099983), null, null, null).show();
                return;
            }
            abd.m3805a(this.f5288a.f3220b, true);
            this.f5288a.setResult(-1, new Intent(this.f5288a.f3220b, ExpenseCategoryExpandableList.class));
            this.f5288a.finish();
        }
    }
}
