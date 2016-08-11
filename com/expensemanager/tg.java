package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class tg implements OnClickListener {
    final /* synthetic */ ExpenseGroupAddEdit f5290a;

    tg(ExpenseGroupAddEdit expenseGroupAddEdit) {
        this.f5290a = expenseGroupAddEdit;
    }

    public void onClick(View view) {
        if (!this.f5290a.f3221c.m4206d()) {
            this.f5290a.f3221c.m4193a();
        }
        boolean a = this.f5290a.f3221c.m4197a("expense_category", "category", this.f5290a.f3224f);
        if (!a) {
            aba.m3745a(this.f5290a.f3220b, null, this.f5290a.getResources().getString(2131099702), -1, this.f5290a.getResources().getString(2131099707), this.f5290a.getResources().getString(2131099983), null, null, null).show();
        }
        abd.m3805a(this.f5290a.f3220b, a);
        this.f5290a.setResult(-1, new Intent(this.f5290a.f3220b, ExpenseCategoryExpandableList.class));
        this.f5290a.finish();
    }
}
