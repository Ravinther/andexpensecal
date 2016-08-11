package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class fo implements OnItemClickListener {
    final /* synthetic */ ExpenseAccountEditList f4653a;

    fo(ExpenseAccountEditList expenseAccountEditList) {
        this.f4653a = expenseAccountEditList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str = (String) this.f4653a.f2722d.get(i);
        Intent intent = new Intent(this.f4653a.f2721c, ExpenseNewAccount.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("isNew", false);
        bundle.putString("account", str);
        intent.putExtras(bundle);
        this.f4653a.startActivityForResult(intent, 0);
    }
}
