package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class jy implements OnClickListener {
    final /* synthetic */ ExpenseAutoFillAddEdit f4864a;

    jy(ExpenseAutoFillAddEdit expenseAutoFillAddEdit) {
        this.f4864a = expenseAutoFillAddEdit;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f4864a.f2873k);
        intent.putExtras(bundle);
        this.f4864a.setResult(0, intent);
        this.f4864a.finish();
    }
}
