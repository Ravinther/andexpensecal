package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class jt implements OnClickListener {
    final /* synthetic */ String f4858a;
    final /* synthetic */ ExpenseAutoFillAddEdit f4859b;

    jt(ExpenseAutoFillAddEdit expenseAutoFillAddEdit, String str) {
        this.f4859b = expenseAutoFillAddEdit;
        this.f4858a = str;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f4859b.f2863a, ExpensePayList.class);
        Bundle bundle = new Bundle();
        bundle.putString("categoryDisplay", this.f4858a);
        intent.putExtras(bundle);
        this.f4859b.startActivityForResult(intent, 3);
    }
}
