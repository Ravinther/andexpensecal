package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;

class wh implements OnClickListener {
    final /* synthetic */ String[] f5396a;
    final /* synthetic */ ExpenseMileageSearch f5397b;

    wh(ExpenseMileageSearch expenseMileageSearch, String[] strArr) {
        this.f5397b = expenseMileageSearch;
        this.f5396a = strArr;
    }

    public void onClick(View view) {
        String str = "account in (" + abd.m3792a(this.f5397b.f3304o) + ")" + " and " + "property" + "!=''" + " and " + "category" + "!='Income'";
        if (this.f5397b.f3295f.getSelectedItemPosition() == 1) {
            str = str + " and " + "property" + " like '%" + this.f5396a[1] + "%' ";
        }
        if (this.f5397b.f3295f.getSelectedItemPosition() == 2) {
            str = str + " and " + "property" + " like '%" + this.f5396a[2] + "%' ";
        }
        List a = abd.m3798a(this.f5397b.f3291b, str + " and (" + "payment_method" + " like '%/mi%' or " + "payment_method" + " like '%/km%')", "expense_tag");
        List arrayList = new ArrayList();
        for (int i = 0; i < a.size(); i++) {
            str = (String) a.get(i);
            if (!(str == null || "".equals(str))) {
                String[] split = str.split(",");
                for (int i2 = 0; i2 < split.length; i2++) {
                    if (!arrayList.contains(split[i2])) {
                        arrayList.add(split[i2].trim());
                    }
                }
            }
        }
        this.f5397b.m3258a((String[]) arrayList.toArray(new String[arrayList.size()]), this.f5397b.f3294e);
    }
}
