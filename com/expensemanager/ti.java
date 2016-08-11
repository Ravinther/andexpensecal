package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class ti implements OnItemClickListener {
    final /* synthetic */ ExpenseIncomeCategoryList f5293a;

    ti(ExpenseIncomeCategoryList expenseIncomeCategoryList) {
        this.f5293a = expenseIncomeCategoryList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str = (String) this.f5293a.f3229d.get(i);
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("category", "Income:" + str);
        intent.putExtras(bundle);
        this.f5293a.setResult(-1, intent);
        this.f5293a.finish();
    }
}
