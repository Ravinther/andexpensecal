package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;

class bl implements OnClickListener {
    final /* synthetic */ ChartNewPeriod f4253a;

    bl(ChartNewPeriod chartNewPeriod) {
        this.f4253a = chartNewPeriod;
    }

    public void onClick(View view) {
        try {
            List arrayList;
            String charSequence;
            String string;
            String str;
            String charSequence2 = this.f4253a.f2542i.getText().toString();
            String str2 = "account in (" + abd.m3792a(charSequence2) + ")";
            if (charSequence2 != null && charSequence2.split(",").length > 1) {
                this.f4253a.f2538e = true;
            }
            str2 = str2 + " and " + "expensed" + ">=" + abd.m3818c(this.f4253a.f2540g.getText().toString()) + " and " + "expensed" + "<=" + abd.m3820d(this.f4253a.f2541h.getText().toString());
            String str3 = "expense";
            int selectedItemPosition = this.f4253a.f2546m.getSelectedItemPosition();
            String str4 = "";
            String str5 = "monthly";
            if (this.f4253a.f2543j.isChecked()) {
                str5 = "weekly";
            }
            if (this.f4253a.f2544k.isChecked()) {
                str5 = "monthly";
            }
            if (this.f4253a.f2545l.isChecked()) {
                str5 = "yearly";
            }
            String str6 = "expensed ASC";
            if (selectedItemPosition == 0) {
                arrayList = new ArrayList();
                charSequence = this.f4253a.f2549p.getText().toString();
                string = !"".equals(charSequence) ? charSequence : this.f4253a.getResources().getString(2131099720);
                str = (charSequence == null || "".endsWith(charSequence)) ? str2 : str2 + " and " + "category" + " in (" + abd.m3792a(charSequence.trim()) + ")";
                if (this.f4253a.f2544k.isChecked()) {
                    abd.m3809a(this.f4253a.f2536c, str, arrayList, str6, this.f4253a.f2538e);
                }
                if (this.f4253a.f2543j.isChecked()) {
                    abd.m3817b(this.f4253a.f2536c, str, arrayList, str6, this.f4253a.f2538e);
                }
                if (this.f4253a.f2545l.isChecked()) {
                    abd.m3819c(this.f4253a.f2536c, str, arrayList, str6, this.f4253a.f2538e);
                }
                if ("Income".equals(charSequence.trim())) {
                    str3 = "income";
                } else {
                    str = str + " and " + "category" + "!='Income'";
                    str3 = "expense";
                }
                ChartNewPeriod.m2467a(this.f4253a.f2539f, arrayList, "0", str3, string, charSequence2, str, str5);
                str2 = str;
            }
            if (selectedItemPosition == 1) {
                arrayList = new ArrayList();
                charSequence = this.f4253a.f2549p.getText().toString();
                str = (charSequence == null || "".equals(charSequence)) ? str2 : str2 + " and " + "category" + " in (" + abd.m3792a(charSequence.trim()) + ")";
                str2 = this.f4253a.f2550q.getText().toString();
                if (!(str2 == null || "".equals(str2))) {
                    str = str + " and " + "subcategory" + " in (" + abd.m3792a(str2.trim()) + ")";
                }
                string = !"".equals(charSequence) ? charSequence : this.f4253a.getResources().getString(2131099720);
                if (!"".equals(str2)) {
                    string = charSequence + ":" + str2;
                } else if ("".equals(charSequence)) {
                    string = this.f4253a.getResources().getString(2131099720);
                }
                if (this.f4253a.f2544k.isChecked()) {
                    abd.m3809a(this.f4253a.f2536c, str, arrayList, str6, this.f4253a.f2538e);
                }
                if (this.f4253a.f2543j.isChecked()) {
                    abd.m3817b(this.f4253a.f2536c, str, arrayList, str6, this.f4253a.f2538e);
                }
                if (this.f4253a.f2545l.isChecked()) {
                    abd.m3819c(this.f4253a.f2536c, str, arrayList, str6, this.f4253a.f2538e);
                }
                if ("Income".equals(charSequence.trim())) {
                    str3 = "income";
                }
                ChartNewPeriod.m2467a(this.f4253a.f2539f, arrayList, "0", str3, string, charSequence2, str, str5);
                str2 = str;
            }
            if (selectedItemPosition == 2) {
                arrayList = new ArrayList();
                charSequence = this.f4253a.f2549p.getText().toString();
                string = !"".equals(charSequence) ? charSequence : this.f4253a.getResources().getString(2131099720);
                if (!(charSequence == null || "".endsWith(charSequence))) {
                    str2 = str2 + " and " + "property" + " in (" + abd.m3792a(charSequence.trim()) + ")";
                }
                if (this.f4253a.f2544k.isChecked()) {
                    abd.m3809a(this.f4253a.f2536c, str2, arrayList, str6, this.f4253a.f2538e);
                }
                if (this.f4253a.f2543j.isChecked()) {
                    abd.m3817b(this.f4253a.f2536c, str2, arrayList, str6, this.f4253a.f2538e);
                }
                if (this.f4253a.f2545l.isChecked()) {
                    abd.m3819c(this.f4253a.f2536c, str2, arrayList, str6, this.f4253a.f2538e);
                }
                str = str2 + " and " + "category" + "!='Income'";
                ChartNewPeriod.m2467a(this.f4253a.f2539f, arrayList, "0", "expense", string, charSequence2, str, str5);
                str2 = str;
            }
            if (selectedItemPosition == 3) {
                arrayList = new ArrayList();
                charSequence = this.f4253a.f2549p.getText().toString();
                string = !"".equals(charSequence) ? charSequence : this.f4253a.getResources().getString(2131099720);
                if (!(charSequence == null || "".endsWith(charSequence))) {
                    str2 = str2 + " and " + "payment_method" + " in (" + abd.m3792a(charSequence.trim()) + ")";
                }
                if (this.f4253a.f2544k.isChecked()) {
                    abd.m3809a(this.f4253a.f2536c, str2, arrayList, str6, this.f4253a.f2538e);
                }
                if (this.f4253a.f2543j.isChecked()) {
                    abd.m3817b(this.f4253a.f2536c, str2, arrayList, str6, this.f4253a.f2538e);
                }
                if (this.f4253a.f2545l.isChecked()) {
                    abd.m3819c(this.f4253a.f2536c, str2, arrayList, str6, this.f4253a.f2538e);
                }
                ChartNewPeriod.m2467a(this.f4253a.f2539f, arrayList, "0", "expense", string, charSequence2, str2 + " and " + "category" + "!='Income'", str5);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
