package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import java.util.HashMap;

class dk implements OnClickListener {
    final /* synthetic */ CurrencySettings f4479a;

    dk(CurrencySettings currencySettings) {
        this.f4479a = currencySettings;
    }

    public void onClick(View view) {
        abd.m3811a(this.f4479a.f2645f, this.f4479a.f2646g, "expense_preference", "BASE_CURRENCY_INDEX", "" + this.f4479a.f2641b.getSelectedItemPosition());
        for (int i = 0; i < this.f4479a.f2647h.size(); i++) {
            LinearLayout linearLayout = (LinearLayout) this.f4479a.f2642c.getChildAt(i + 1);
            int childCount = linearLayout.getChildCount();
            String replace = ((String) this.f4479a.f2647h.get(i)).replace("/", "");
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = linearLayout.getChildAt(i2);
                if ("android.widget.EditText".equalsIgnoreCase(childAt.getClass().getName())) {
                    String obj = ((EditText) childAt).getText().toString();
                    if (obj == null || "".equals(obj)) {
                        abd.m3810a(this.f4479a.f2645f, this.f4479a.f2646g, replace);
                    } else {
                        abd.m3811a(this.f4479a.f2645f, this.f4479a.f2646g, "expense_preference", replace, obj);
                    }
                }
            }
        }
        HashMap hashMap = new HashMap();
        abd.m3795a(this.f4479a.f2645f, abd.m3787a(this.f4479a.f2645f, this.f4479a.f2646g, this.f4479a.f2650k, hashMap, this.f4479a.f2640a), this.f4479a.f2650k, hashMap, ExpenseManager.f3246v);
        Intent intent = new Intent(this.f4479a.f2645f, ExpenseManager.class);
        intent.addFlags(67108864);
        this.f4479a.startActivity(intent);
    }
}
