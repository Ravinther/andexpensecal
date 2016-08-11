package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class yh implements OnClickListener {
    final /* synthetic */ EditText f5481a;
    final /* synthetic */ ExpensePayList f5482b;

    yh(ExpensePayList expensePayList, EditText editText) {
        this.f5482b = expensePayList;
        this.f5481a = editText;
    }

    public void onClick(View view) {
        CharSequence obj = this.f5481a.getText().toString();
        if (obj != null && !"".equals(obj)) {
            if (obj.indexOf("'") != -1) {
                aib.m3849a(this.f5482b.f3364e, null, this.f5482b.f3364e.getResources().getString(2131099702), 17301543, this.f5482b.f3364e.getResources().getString(2131099703), this.f5482b.f3364e.getResources().getString(2131099983), null, null, null).show();
                return;
            }
            if (this.f5482b.f3366g == null || "".equals(this.f5482b.f3366g)) {
                this.f5482b.f3366g = obj.trim();
            } else {
                this.f5482b.f3366g = this.f5482b.f3366g + "," + obj.trim();
            }
            abd.m3811a(this.f5482b.f3364e, this.f5482b.f3371l, "expense_preference", this.f5482b.f3367h, this.f5482b.f3366g);
            this.f5481a.setHint(obj);
            this.f5481a.setText("");
            this.f5482b.onCreate(null);
            abd.m3806a(this.f5482b.f3363d, this.f5482b.f3362c.getCount());
        }
    }
}
