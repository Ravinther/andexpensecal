package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

class jq implements OnClickListener {
    final /* synthetic */ ExpenseAutoFillAddEdit f4854a;

    jq(ExpenseAutoFillAddEdit expenseAutoFillAddEdit) {
        this.f4854a = expenseAutoFillAddEdit;
    }

    public void onClick(View view) {
        if (((CheckBox) view).isChecked()) {
            this.f4854a.f2868f.setEnabled(false);
            this.f4854a.f2868f.setText(this.f4854a.f2870h.getText());
            return;
        }
        this.f4854a.f2868f.setEnabled(true);
    }
}
