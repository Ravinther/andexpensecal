package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class ab implements OnClickListener {
    final /* synthetic */ ChartNewCustom f3828a;

    ab(ChartNewCustom chartNewCustom) {
        this.f3828a = chartNewCustom;
    }

    public void onClick(View view) {
        String str = "";
        if (this.f3828a.f2447j.isChecked()) {
            str = "account in (" + abd.m3792a(this.f3828a.f2446i.getText().toString()) + ")" + " and " + "subcategory" + "!=''" + " and " + "category" + "!='Income'";
            String charSequence = this.f3828a.f2455r.getText().toString();
            if (!"".equals(charSequence)) {
                String str2 = "account in (" + abd.m3792a(this.f3828a.f2446i.getText().toString()) + ")" + " and " + "subcategory" + "!=''" + " and " + "category" + " IN ('";
                String[] split = charSequence.split(",");
                for (int i = 0; i < split.length; i++) {
                    str2 = i + 1 < split.length ? str2 + split[i] + "','" : str2 + split[i] + "'";
                }
                str = str2 + ")";
            }
        }
        if (this.f3828a.f2448k.isChecked()) {
            str = "account in (" + abd.m3792a(this.f3828a.f2446i.getText().toString()) + ")" + " and " + "subcategory" + "!=''" + " and " + "category" + "='Income'";
        }
        List a = abd.m3798a(this.f3828a.f2440c, str, "subcategory");
        this.f3828a.m2390a((String[]) a.toArray(new String[a.size()]), this.f3828a.f2456s);
    }
}
