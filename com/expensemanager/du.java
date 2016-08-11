package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class du implements OnClickListener {
    final /* synthetic */ DebtAddEdit f4566a;

    du(DebtAddEdit debtAddEdit) {
        this.f4566a = debtAddEdit;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f4566a.f2671r);
        intent.putExtras(bundle);
        this.f4566a.setResult(-1, intent);
        this.f4566a.finish();
    }
}
