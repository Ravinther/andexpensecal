package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.LinearLayout;

class wr implements OnClickListener {
    final /* synthetic */ LinearLayout f5413a;
    final /* synthetic */ LinearLayout f5414b;
    final /* synthetic */ LinearLayout f5415c;
    final /* synthetic */ ExpenseNewAccount f5416d;

    wr(ExpenseNewAccount expenseNewAccount, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.f5416d = expenseNewAccount;
        this.f5413a = linearLayout;
        this.f5414b = linearLayout2;
        this.f5415c = linearLayout3;
    }

    public void onClick(View view) {
        if (((CheckBox) view).isChecked()) {
            this.f5413a.setVisibility(0);
            this.f5414b.setVisibility(0);
            this.f5415c.setVisibility(0);
            this.f5416d.f3318m.setVisibility(0);
            return;
        }
        this.f5413a.setVisibility(8);
        this.f5414b.setVisibility(8);
        this.f5415c.setVisibility(8);
        this.f5416d.f3318m.setVisibility(8);
    }
}
