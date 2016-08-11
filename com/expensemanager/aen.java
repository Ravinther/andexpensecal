package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class aen implements OnClickListener {
    final /* synthetic */ SMSAddEdit f4005a;

    aen(SMSAddEdit sMSAddEdit) {
        this.f4005a = sMSAddEdit;
    }

    public void onClick(View view) {
        String stringExtra = this.f4005a.getIntent().getStringExtra("category");
        if (stringExtra == null || !stringExtra.startsWith("Income")) {
            this.f4005a.getIntent().putExtra("category", "Income");
            this.f4005a.f3563c.setText("Income");
            this.f4005a.f3563c.setTextColor(co.f4429c);
            return;
        }
        this.f4005a.getIntent().removeExtra("category");
        this.f4005a.f3563c.setTextColor(co.f4428b);
    }
}
