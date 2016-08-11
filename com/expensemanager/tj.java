package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class tj implements OnClickListener {
    final /* synthetic */ EditText f5294a;
    final /* synthetic */ ExpenseIncomeCategoryList f5295b;

    tj(ExpenseIncomeCategoryList expenseIncomeCategoryList, EditText editText) {
        this.f5295b = expenseIncomeCategoryList;
        this.f5294a = editText;
    }

    public void onClick(View view) {
        CharSequence obj = this.f5294a.getText().toString();
        if (obj != null && !"".equals(obj)) {
            if (obj.indexOf("'") != -1) {
                aib.m3849a(this.f5295b.f3228c, null, "Alert", 17301543, "An apostrophe ' is not allowed in the string.", "OK", null, null, null).show();
                return;
            }
            if (this.f5295b.f3230e == null || "".equals(this.f5295b.f3230e)) {
                this.f5295b.f3230e = obj.trim();
            } else {
                this.f5295b.f3230e = this.f5295b.f3230e + "," + obj.trim();
            }
            abd.m3811a(this.f5295b.f3228c, this.f5295b.f3231f, "expense_preference", "INCOME_CATEGORY_LIST", this.f5295b.f3230e);
            this.f5294a.setHint(obj);
            this.f5294a.setText("");
            this.f5295b.onCreate(null);
            abd.m3806a(this.f5295b.f3227b, this.f5295b.f3226a.getCount());
        }
    }
}
