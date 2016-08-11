package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import java.util.ArrayList;

class gn implements OnClickListener {
    final /* synthetic */ int f4698a;
    final /* synthetic */ ExpenseAccountGroupEditList f4699b;

    gn(ExpenseAccountGroupEditList expenseAccountGroupEditList, int i) {
        this.f4699b = expenseAccountGroupEditList;
        this.f4698a = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String obj = this.f4699b.f2749g.getText().toString();
        obj.replaceAll(",", "");
        if ("".equals(obj)) {
            Toast.makeText(this.f4699b.getApplicationContext(), 2131099683, 1).show();
            return;
        }
        if (this.f4698a > -1) {
            if (!this.f4699b.f2746d.contains(obj) || this.f4699b.f2746d.indexOf(obj) == this.f4698a) {
                this.f4699b.f2746d.set(this.f4698a, obj);
            } else {
                Toast.makeText(this.f4699b.f2745c, 2131099710, 1).show();
                return;
            }
        } else if (this.f4699b.f2746d.contains(obj)) {
            Toast.makeText(this.f4699b.f2745c, 2131099710, 1).show();
            return;
        } else {
            this.f4699b.f2746d.add(obj);
        }
        String a = aib.m3857a(this.f4699b.f2746d, ",");
        if (!a.equals("")) {
            abd.m3811a(this.f4699b.f2745c, this.f4699b.f2750h, "expense_preference", "ACCOUNT_GROUP_NAME", a);
            String[] split = abd.m3786a(this.f4699b.f2745c, this.f4699b.f2750h, "MY_ACCOUNT_NAMES", "Personal Expense").split(",");
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.f4699b.f2748f.getCount(); i2++) {
                if (this.f4699b.f2748f.getCheckedItemPositions().get(i2)) {
                    arrayList.add(split[i2]);
                }
            }
            a = aib.m3857a(arrayList, ",");
            if (!a.equals("")) {
                abd.m3811a(this.f4699b.f2745c, this.f4699b.f2750h, "expense_preference", "ACCOUNT_GROUP_NAME_" + obj, a);
                this.f4699b.onCreate(null);
            }
        }
    }
}
