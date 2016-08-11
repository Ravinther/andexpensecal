package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;

class yy implements OnClickListener {
    final /* synthetic */ String f5507a;
    final /* synthetic */ ExpensePaymentMethodList f5508b;

    yy(ExpensePaymentMethodList expensePaymentMethodList, String str) {
        this.f5508b = expensePaymentMethodList;
        this.f5507a = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String obj = this.f5508b.f3382h.getText().toString();
        if (obj == null || obj.indexOf("'") == -1) {
            if (obj != null) {
                obj = obj.trim();
            }
            if (!"".equals(obj) && !this.f5507a.equals(obj)) {
                ArrayList j = aib.m3878j(abd.m3786a(this.f5508b.f3377c, this.f5508b.f3380f, "PAYMENT_METHOD_KEY", this.f5508b.f3379e));
                int indexOf = j.indexOf(this.f5507a);
                if (indexOf > -1) {
                    j.set(indexOf, obj);
                }
                abd.m3811a(this.f5508b.f3377c, this.f5508b.f3380f, "expense_preference", "PAYMENT_METHOD_KEY", aib.m3857a(j, ","));
                ro roVar = new ro(this.f5508b.f3377c);
                if (!roVar.m4206d()) {
                    roVar.m4193a();
                }
                String str = "payment_method='" + this.f5507a + "'";
                try {
                    roVar.m4198a("expense_report", str, "payment_method", obj);
                    roVar.m4198a("expense_repeating", str, "payment_method", obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                roVar.m4201b();
                this.f5508b.onCreate(null);
                return;
            }
            return;
        }
        aib.m3849a(this.f5508b.f3377c, null, this.f5508b.getResources().getString(2131099702), 17301543, this.f5508b.getResources().getString(2131099703), this.f5508b.getResources().getString(2131099983), null, null, null).show();
    }
}
