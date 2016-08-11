package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class kc implements OnClickListener {
    final /* synthetic */ String f4871a;
    final /* synthetic */ ExpenseAutoFillList f4872b;

    kc(ExpenseAutoFillList expenseAutoFillList, String str) {
        this.f4872b = expenseAutoFillList;
        this.f4871a = str;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f4872b.f2882d, ExpenseAutoFillAddEdit.class);
        Bundle bundle = new Bundle();
        bundle.putString("categoryDisplay", this.f4871a);
        bundle.putString("account", this.f4872b.f2881c);
        intent.putExtras(bundle);
        this.f4872b.startActivityForResult(intent, 0);
    }
}
