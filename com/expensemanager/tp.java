package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;

class tp implements OnClickListener {
    final /* synthetic */ String f5302a;
    final /* synthetic */ ExpenseIncomeCategoryList f5303b;

    tp(ExpenseIncomeCategoryList expenseIncomeCategoryList, String str) {
        this.f5303b = expenseIncomeCategoryList;
        this.f5302a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String obj = this.f5303b.f3233h.getText().toString();
        if (obj == null || obj.indexOf("'") == -1) {
            if (obj != null) {
                obj = obj.trim();
            }
            if (!"".equals(obj) && !this.f5302a.equals(obj)) {
                ArrayList j = aib.m3878j(abd.m3786a(this.f5303b.f3228c, this.f5303b.f3231f, "INCOME_CATEGORY_LIST", this.f5303b.f3230e));
                int indexOf = j.indexOf(this.f5302a);
                if (indexOf > -1) {
                    j.set(indexOf, obj);
                }
                abd.m3811a(this.f5303b.f3228c, this.f5303b.f3231f, "expense_preference", "INCOME_CATEGORY_LIST", aib.m3857a(j, ","));
                ro roVar = new ro(this.f5303b.f3228c);
                if (!roVar.m4206d()) {
                    roVar.m4193a();
                }
                String str = "category='Income' AND subcategory='" + this.f5302a + "'";
                try {
                    roVar.m4198a("expense_report", str, "subcategory", obj);
                    roVar.m4198a("expense_repeating", str, "subcategory", obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                roVar.m4201b();
                this.f5303b.onCreate(null);
                return;
            }
            return;
        }
        aib.m3849a(this.f5303b.f3228c, null, this.f5303b.getResources().getString(2131099702), 17301543, this.f5303b.getResources().getString(2131099703), this.f5303b.getResources().getString(2131099983), null, null, null).show();
    }
}
