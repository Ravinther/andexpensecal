package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Map;

class afr implements OnClickListener {
    final /* synthetic */ Map f4058a;
    final /* synthetic */ CheckBox f4059b;
    final /* synthetic */ TextView f4060c;
    final /* synthetic */ afq f4061d;

    afr(afq com_expensemanager_afq, Map map, CheckBox checkBox, TextView textView) {
        this.f4061d = com_expensemanager_afq;
        this.f4058a = map;
        this.f4059b = checkBox;
        this.f4060c = textView;
    }

    public void onClick(View view) {
        long j = 0;
        Object obj = (String) this.f4058a.get("account");
        if ("$ShoppingList".equalsIgnoreCase(obj)) {
            obj = (String) this.f4058a.get("property3");
        }
        if (this.f4059b.isChecked()) {
            String string = this.f4061d.f4055a.getResources().getString(2131099795);
            j = Calendar.getInstance().getTimeInMillis();
            this.f4060c.setText(string + ": " + aba.m3749a(j, ExpenseManager.f3244t));
            this.f4058a.put("date", aba.m3749a(j, ExpenseManager.f3244t));
            this.f4058a.put("dateLong", "" + j);
            this.f4058a.put("account", obj);
            this.f4058a.put("property3", "$ShoppingList");
        } else {
            this.f4060c.setText(null);
            this.f4058a.put("date", "");
            this.f4058a.put("dateLong", "0");
            this.f4058a.put("account", "$ShoppingList");
            this.f4058a.put("property3", obj);
        }
        String str = "_id = " + ((String) this.f4058a.get("rowId"));
        if (!this.f4061d.f4055a.f3594d.m4206d()) {
            this.f4061d.f4055a.f3594d.m4193a();
        }
        this.f4061d.f4055a.f3594d.m4198a("expense_report", str, "expensed", "" + j);
        boolean a = !"".equals((String) this.f4058a.get("amount")) ? this.f4061d.f4055a.f3594d.m4198a("expense_report", str, "account", (String) this.f4058a.get("account")) : this.f4061d.f4055a.f3594d.m4198a("expense_report", str, "property3", (String) this.f4058a.get("property3"));
        if (a) {
            abd.m3805a(this.f4061d.f4055a.f3593c, a);
        }
    }
}
