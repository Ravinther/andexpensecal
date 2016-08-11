package com.expensemanager;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.List;

class ya implements OnClickListener {
    final /* synthetic */ ExpenseNewTransaction f5470a;

    ya(ExpenseNewTransaction expenseNewTransaction) {
        this.f5470a = expenseNewTransaction;
    }

    public void onClick(View view) {
        List a = abd.m3797a(this.f5470a.f3358y, this.f5470a.f3357x);
        if (this.f5470a.f3338e.getText().toString().startsWith("Income")) {
            String[] split = abd.m3786a(this.f5470a.f3334a, this.f5470a.f3358y, "INCOME_CATEGORY_LIST", this.f5470a.getResources().getString(2131099934)).split(",");
            a.clear();
            for (Object add : split) {
                a.add(add);
            }
        }
        if (a != null && a.size() != 0) {
            View listView = new ListView(this.f5470a.f3334a);
            listView.setAdapter(new ArrayAdapter(this.f5470a.f3334a, 17367043, a.toArray(new String[a.size()])));
            Dialog dialog = new Dialog(this.f5470a.f3334a);
            dialog.setTitle(2131100026);
            dialog.setContentView(listView);
            dialog.show();
            listView.setOnItemClickListener(new yb(this, dialog, a));
        }
    }
}
