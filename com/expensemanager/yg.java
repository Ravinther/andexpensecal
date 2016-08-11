package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class yg implements OnItemClickListener {
    final /* synthetic */ ExpensePayList f5480a;

    yg(ExpensePayList expensePayList) {
        this.f5480a = expensePayList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str = (String) this.f5480a.f3365f.get(i);
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("payee", str);
        intent.putExtras(bundle);
        this.f5480a.setResult(-1, intent);
        this.f5480a.finish();
    }
}
