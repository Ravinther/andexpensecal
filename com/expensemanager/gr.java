package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

class gr implements OnItemClickListener {
    final /* synthetic */ ExpenseAccountHiddenList f4706a;

    gr(ExpenseAccountHiddenList expenseAccountHiddenList) {
        this.f4706a = expenseAccountHiddenList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String charSequence = ((TextView) view.findViewById(2131558423)).getText().toString();
        Intent intent = new Intent(this.f4706a.f2754b, ExpenseNewAccount.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("isNew", false);
        bundle.putString("account", charSequence);
        bundle.putBoolean("isHidden", true);
        intent.putExtras(bundle);
        this.f4706a.startActivityForResult(intent, 0);
    }
}
