package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class ys implements OnClickListener {
    final /* synthetic */ EditText f5499a;
    final /* synthetic */ ExpensePaymentMethodList f5500b;

    ys(ExpensePaymentMethodList expensePaymentMethodList, EditText editText) {
        this.f5500b = expensePaymentMethodList;
        this.f5499a = editText;
    }

    public void onClick(View view) {
        CharSequence obj = this.f5499a.getText().toString();
        if (obj != null && !"".equals(obj)) {
            if (obj.indexOf("'") != -1) {
                aib.m3849a(this.f5500b.f3377c, null, this.f5500b.getResources().getString(2131099702), 17301543, this.f5500b.getResources().getString(2131099703), this.f5500b.getResources().getString(2131099983), null, null, null).show();
                return;
            }
            if (this.f5500b.f3379e == null || "".equals(this.f5500b.f3379e)) {
                this.f5500b.f3379e = obj.trim();
            } else {
                this.f5500b.f3379e = this.f5500b.f3379e + "," + obj.trim();
            }
            abd.m3811a(this.f5500b.f3377c, this.f5500b.f3380f, "expense_preference", "PAYMENT_METHOD_KEY", this.f5500b.f3379e);
            this.f5499a.setHint(obj);
            this.f5499a.setText("");
            this.f5500b.onCreate(null);
            abd.m3806a(this.f5500b.f3376b, this.f5500b.f3375a.getCount());
        }
    }
}
