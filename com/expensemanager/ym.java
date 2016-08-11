package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;

class ym implements OnClickListener {
    final /* synthetic */ String f5488a;
    final /* synthetic */ ExpensePayList f5489b;

    ym(ExpensePayList expensePayList, String str) {
        this.f5489b = expensePayList;
        this.f5488a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String obj = this.f5489b.f3369j.getText().toString();
        if (obj == null || obj.indexOf("'") == -1) {
            if (obj != null) {
                obj = obj.trim();
            }
            if (!"".equals(obj) && !this.f5488a.equals(obj)) {
                ArrayList j = aib.m3878j(abd.m3786a(this.f5489b.f3364e, this.f5489b.f3371l, this.f5489b.f3367h, this.f5489b.f3368i));
                int indexOf = j.indexOf(this.f5488a);
                if (indexOf > -1) {
                    j.set(indexOf, obj);
                }
                abd.m3811a(this.f5489b.f3364e, this.f5489b.f3371l, "expense_preference", this.f5489b.f3367h, aib.m3857a(j, ","));
                ro roVar = new ro(this.f5489b.f3364e);
                if (!roVar.m4206d()) {
                    roVar.m4193a();
                }
                String str = "property='" + this.f5488a + "'";
                try {
                    roVar.m4198a("expense_report", str, "property", obj);
                    roVar.m4198a("expense_repeating", str, "property", obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                roVar.m4201b();
                this.f5489b.onCreate(null);
                return;
            }
            return;
        }
        aib.m3849a(this.f5489b.f3364e, null, this.f5489b.getResources().getString(2131099702), 17301543, this.f5489b.getResources().getString(2131099703), this.f5489b.getResources().getString(2131099983), null, null, null).show();
    }
}
