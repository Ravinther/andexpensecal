package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class yr implements OnItemClickListener {
    final /* synthetic */ ExpensePaymentMethodList f5498a;

    yr(ExpensePaymentMethodList expensePaymentMethodList) {
        this.f5498a = expensePaymentMethodList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str = (String) this.f5498a.f3378d.get(i);
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("paymentMethod", str);
        intent.putExtras(bundle);
        this.f5498a.setResult(-1, intent);
        this.f5498a.finish();
    }
}
