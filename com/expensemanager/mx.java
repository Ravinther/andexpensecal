package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;
import java.util.HashMap;

class mx implements OnClickListener {
    final /* synthetic */ String f5000a;
    final /* synthetic */ boolean f5001b;
    final /* synthetic */ String f5002c;
    final /* synthetic */ ExpenseCategoryExpandableList f5003d;

    mx(ExpenseCategoryExpandableList expenseCategoryExpandableList, String str, boolean z, String str2) {
        this.f5003d = expenseCategoryExpandableList;
        this.f5000a = str;
        this.f5001b = z;
        this.f5002c = str2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ArrayList arrayList = new ArrayList();
        Object hashMap = new HashMap();
        ExpenseBudgetAdd.m2800a(this.f5003d.f2997i, arrayList, hashMap);
        ArrayList arrayList2 = (ArrayList) hashMap.get(this.f5000a);
        String obj = this.f5003d.f2998j.getText().toString();
        ro roVar = new ro(this.f5003d.f2995g);
        if (!roVar.m4206d()) {
            roVar.m4193a();
        }
        String trim;
        if (this.f5001b) {
            trim = obj != null ? obj.trim() : obj;
            if (!"".equals(trim) && !this.f5000a.equals(trim)) {
                if (arrayList.contains(trim)) {
                    aib.m3849a(this.f5003d.f2995g, null, this.f5003d.getResources().getString(2131099702), 17301543, this.f5003d.getResources().getString(2131099710), this.f5003d.getResources().getString(2131099983), null, null, null).show();
                    return;
                }
                try {
                    String str = "category='" + this.f5000a + "'";
                    roVar.m4198a("expense_category", str, "category", trim);
                    roVar.m4198a("expense_report", str, "category", trim);
                    roVar.m4198a("expense_repeating", str, "category", trim);
                    roVar.m4198a("expense_payee_payer", str, "category", trim);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                return;
            }
        }
        if (obj != null) {
            obj = obj.trim();
        }
        if (!"".equals(obj) && !this.f5002c.equals(obj)) {
            if (arrayList2.contains(obj)) {
                aib.m3849a(this.f5003d.f2995g, null, this.f5003d.getResources().getString(2131099702), 17301543, this.f5003d.getResources().getString(2131099710), this.f5003d.getResources().getString(2131099983), null, null, null).show();
                return;
            }
            try {
                trim = "category='" + this.f5000a + "' AND " + "subcategory" + "='" + this.f5002c + "'";
                roVar.m4198a("expense_category", trim, "subcategory", obj);
                roVar.m4198a("expense_report", trim, "subcategory", obj);
                roVar.m4198a("expense_repeating", trim, "subcategory", obj);
                roVar.m4198a("expense_payee_payer", trim, "subcategory", obj);
                abd.m3805a(this.f5003d.f2995g, true);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            return;
        }
        roVar.m4201b();
        this.f5003d.f2991c.clear();
        this.f5003d.f2992d.clear();
        this.f5003d.m2906a(roVar, this.f5003d.f2991c, this.f5003d.f2992d);
        this.f5003d.f2996h.notifyDataSetChanged();
    }
}
