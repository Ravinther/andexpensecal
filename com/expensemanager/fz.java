package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import java.util.ArrayList;

class fz implements OnClickListener {
    final /* synthetic */ int f4672a;
    final /* synthetic */ ArrayList f4673b;
    final /* synthetic */ fu f4674c;

    fz(fu fuVar, int i, ArrayList arrayList) {
        this.f4674c = fuVar;
        this.f4672a = i;
        this.f4673b = arrayList;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String obj = this.f4674c.f4664d.getText().toString();
        obj.replaceAll(",", "");
        if ("".equals(obj)) {
            Toast.makeText(this.f4674c.m315i(), 2131099683, 1).show();
            return;
        }
        if (this.f4672a > -1) {
            if (!this.f4673b.contains(obj) || this.f4673b.indexOf(obj) == this.f4672a) {
                this.f4673b.set(this.f4672a, obj);
            } else {
                Toast.makeText(this.f4674c.m315i(), 2131099710, 1).show();
                return;
            }
        } else if (this.f4673b.contains(obj)) {
            Toast.makeText(this.f4674c.m315i(), 2131099710, 1).show();
            return;
        } else {
            this.f4673b.add(obj);
        }
        String a = aib.m3857a(this.f4673b, ",");
        if (!a.equals("")) {
            abd.m3811a(this.f4674c.m315i(), ExpenseAccountGroup.f2736u, "expense_preference", "ACCOUNT_GROUP_NAME", a);
            String[] split = abd.m3786a(this.f4674c.m315i(), ExpenseAccountGroup.f2736u, "MY_ACCOUNT_NAMES", "Personal Expense").split(",");
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.f4674c.f4663c.getCount(); i2++) {
                if (this.f4674c.f4663c.getCheckedItemPositions().get(i2)) {
                    arrayList.add(split[i2]);
                }
            }
            a = aib.m3857a(arrayList, ",");
            if (!a.equals("")) {
                abd.m3811a(this.f4674c.m315i(), ExpenseAccountGroup.f2736u, "expense_preference", "ACCOUNT_GROUP_NAME_" + obj, a);
                ExpenseAccountGroup.f2740y.set(ExpenseAccountGroup.f2738w.getCurrentItem(), obj);
                ExpenseAccountGroup.f2739x.m145c();
                ExpenseAccountGroup.f2734q.m7177a();
                this.f4674c.m315i().setTitle(ExpenseAccountGroup.m2641a(this.f4674c.m315i(), ExpenseAccountGroup.f2736u, obj));
            }
        }
    }
}
