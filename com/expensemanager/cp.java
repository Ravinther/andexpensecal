package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class cp implements OnItemClickListener {
    final /* synthetic */ CreditCardAccountEditList f4437a;

    cp(CreditCardAccountEditList creditCardAccountEditList) {
        this.f4437a = creditCardAccountEditList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str = (String) this.f4437a.f2608d.get(i);
        Intent intent = new Intent(this.f4437a.f2607c, ExpenseNewAccount.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("isNew", false);
        bundle.putString("account", str);
        intent.putExtras(bundle);
        this.f4437a.startActivityForResult(intent, 0);
    }
}
