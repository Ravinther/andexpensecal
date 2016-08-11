package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;

class ix implements OnClickListener {
    final /* synthetic */ String f4821a;
    final /* synthetic */ ExpenseAccountTransfer f4822b;

    ix(ExpenseAccountTransfer expenseAccountTransfer, String str) {
        this.f4822b = expenseAccountTransfer;
        this.f4821a = str;
    }

    public void onClick(View view) {
        try {
            Double d = new Double(this.f4822b.f2824j.getText().toString());
            String charSequence = this.f4822b.f2822h.getText().toString();
            if (charSequence == null || "".equals(charSequence)) {
                aib.m3849a(this.f4822b.f2819e, null, this.f4822b.f2819e.getResources().getString(2131099702), 17301543, this.f4822b.f2819e.getResources().getString(2131099716), this.f4822b.f2819e.getResources().getString(2131099983), null, null, null).show();
            } else if (charSequence.equals(this.f4822b.f2821g.getText().toString())) {
                aib.m3849a(this.f4822b.f2819e, null, this.f4822b.f2819e.getResources().getString(2131099702), 17301543, this.f4822b.f2819e.getResources().getString(2131100149), this.f4822b.f2819e.getResources().getString(2131099983), null, null, null).show();
            } else {
                String obj = this.f4822b.f2825k.getText().toString();
                if (obj == null || obj.indexOf("'") == -1) {
                    if (!"".equals(obj)) {
                        obj = "description='" + obj + "'";
                        if (!this.f4822b.f2836v.m4206d()) {
                            this.f4822b.f2836v.m4193a();
                        }
                        List arrayList = new ArrayList();
                        aba.m3760a(this.f4822b.f2819e, this.f4822b.f2836v, obj, arrayList);
                        if (arrayList.size() > 0 && (!"Edit".equalsIgnoreCase(this.f4821a) || this.f4822b.f2818d)) {
                            aib.m3849a(this.f4822b.f2819e, null, this.f4822b.getResources().getString(2131099702), 17301543, this.f4822b.getResources().getString(2131100048), this.f4822b.getResources().getString(2131099983), null, null, null).show();
                            return;
                        }
                    }
                    int a = abd.m3784a(abd.m3786a(this.f4822b.f2819e, this.f4822b.f2836v, this.f4822b.f2821g.getText().toString() + "_CURRENCY", "-1"), -1);
                    int a2 = abd.m3784a(abd.m3786a(this.f4822b.f2819e, this.f4822b.f2836v, charSequence + "_CURRENCY", "-1"), -1);
                    if (a == -1 || a2 == -1 || a == a2) {
                        this.f4822b.m2717a(null, this.f4821a);
                        return;
                    }
                    obj = co.f4436j[a];
                    charSequence = co.f4436j[a2];
                    obj = obj.split(":")[1];
                    this.f4822b.f2830p = obj + charSequence.split(":")[1];
                    String str = null;
                    aib.m3849a(this.f4822b.f2819e, this.f4822b.m2719b(), this.f4822b.getResources().getString(2131099784), 17301659, str, this.f4822b.getResources().getString(2131099983), new iy(this), this.f4822b.getResources().getString(2131099754), null).show();
                    return;
                }
                aib.m3849a(this.f4822b.f2819e, null, this.f4822b.getResources().getString(2131099702), 17301543, this.f4822b.getResources().getString(2131099703), this.f4822b.getResources().getString(2131099983), null, null, null).show();
            }
        } catch (Exception e) {
            aib.m3849a(this.f4822b.f2819e, null, this.f4822b.f2819e.getResources().getString(2131099702), 17301543, this.f4822b.f2819e.getResources().getString(2131099718), this.f4822b.f2819e.getResources().getString(2131099983), null, null, null).show();
        }
    }
}
