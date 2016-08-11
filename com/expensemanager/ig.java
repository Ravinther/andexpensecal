package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;

class ig implements OnClickListener {
    final /* synthetic */ ExpenseAccountSummaryTime f4793a;

    ig(ExpenseAccountSummaryTime expenseAccountSummaryTime) {
        this.f4793a = expenseAccountSummaryTime;
    }

    public void onClick(View view) {
        if (this.f4793a.f2805m.getSelectedItemPosition() == 0 || this.f4793a.f2805m.getSelectedItemPosition() == 1 || this.f4793a.f2805m.getSelectedItemPosition() == 6) {
            String str = "";
            List a = abd.m3798a(this.f4793a.f2795c, "account in (" + abd.m3792a(this.f4793a.f2804l.getText().toString()) + ")", "category");
            this.f4793a.m2699a((String[]) a.toArray(new String[a.size()]), this.f4793a.f2809q);
        }
        if (this.f4793a.f2805m.getSelectedItemPosition() == 2) {
            str = "";
            a = abd.m3798a(this.f4793a.f2795c, "account in (" + abd.m3792a(this.f4793a.f2804l.getText().toString()) + ")" + " and " + "property" + "!=''" + " and " + "category" + "!='Income'", "property");
            this.f4793a.m2699a((String[]) a.toArray(new String[a.size()]), this.f4793a.f2809q);
        }
        if (this.f4793a.f2805m.getSelectedItemPosition() == 3) {
            str = "";
            a = abd.m3798a(this.f4793a.f2795c, "account in (" + abd.m3792a(this.f4793a.f2804l.getText().toString()) + ")" + " and " + "payment_method" + "!=''" + " and " + "category" + "!='Income'", "payment_method");
            this.f4793a.m2699a((String[]) a.toArray(new String[a.size()]), this.f4793a.f2809q);
        }
        if (this.f4793a.f2805m.getSelectedItemPosition() == 4) {
            str = "";
            a = abd.m3798a(this.f4793a.f2795c, "account in (" + abd.m3792a(this.f4793a.f2804l.getText().toString()) + ")" + " and " + "status" + "!=''" + " and " + "category" + "!='Income'", "status");
            this.f4793a.m2699a((String[]) a.toArray(new String[a.size()]), this.f4793a.f2809q);
        }
        if (this.f4793a.f2805m.getSelectedItemPosition() == 5) {
            List a2 = abd.m3798a(this.f4793a.f2795c, "account in (" + abd.m3792a(this.f4793a.f2804l.getText().toString()) + ")", "expense_tag");
            List arrayList = new ArrayList();
            for (int i = 0; i < a2.size(); i++) {
                str = (String) a2.get(i);
                if (!(str == null || "".equals(str))) {
                    String[] split = str.split(",");
                    for (int i2 = 0; i2 < split.length; i2++) {
                        if (!arrayList.contains(split[i2])) {
                            arrayList.add(split[i2].trim());
                        }
                    }
                }
            }
            this.f4793a.m2699a((String[]) arrayList.toArray(new String[arrayList.size()]), this.f4793a.f2809q);
        }
    }
}
