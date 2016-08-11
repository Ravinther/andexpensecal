package com.expensemanager;

import android.app.ExpandableListActivity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;

class my implements OnClickListener {
    final /* synthetic */ ArrayList f5004a;
    final /* synthetic */ String f5005b;
    final /* synthetic */ String f5006c;
    final /* synthetic */ ExpenseCategoryExpandableList f5007d;

    my(ExpenseCategoryExpandableList expenseCategoryExpandableList, ArrayList arrayList, String str, String str2) {
        this.f5007d = expenseCategoryExpandableList;
        this.f5004a = arrayList;
        this.f5005b = str;
        this.f5006c = str2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String str = (String) this.f5004a.get(i);
        ro roVar = new ro(this.f5007d.f2995g);
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        try {
            String str2 = "category='" + this.f5005b + "' AND " + "subcategory" + "='" + this.f5006c + "'";
            if (roVar.m4202b("DELETE from expense_category WHERE " + str2)) {
                if (roVar.m4185a("expense_category", roVar.m4203c(str, this.f5006c)) != -1) {
                    roVar.m4198a("expense_category", str2, "category", str);
                    roVar.m4198a("expense_report", str2, "category", str);
                    roVar.m4198a("expense_repeating", str2, "category", str);
                    roVar.m4198a("expense_payee_payer", str2, "category", str);
                    abd.m3805a(this.f5007d.f2995g, true);
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        roVar.m4201b();
        this.f5007d.f2991c.clear();
        this.f5007d.f2992d.clear();
        this.f5007d.m2906a(roVar, this.f5007d.f2991c, this.f5007d.f2992d);
        this.f5007d.f2996h.notifyDataSetChanged();
        ((ExpandableListActivity) this.f5007d.f2995g).getExpandableListView().expandGroup(this.f5007d.f2989a.indexOf(str));
    }
}
