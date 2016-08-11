package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.HashMap;

class kw implements OnClickListener {
    final /* synthetic */ HashMap f4913a;
    final /* synthetic */ ExpenseBudgetAdd f4914b;

    kw(ExpenseBudgetAdd expenseBudgetAdd, HashMap hashMap) {
        this.f4914b = expenseBudgetAdd;
        this.f4913a = hashMap;
    }

    public void onClick(View view) {
        String charSequence = this.f4914b.f2895e.getText().toString();
        ArrayList arrayList = new ArrayList();
        if (!(charSequence == null || "".endsWith(charSequence))) {
            String[] split = charSequence.split(",");
            for (Object obj : split) {
                ArrayList arrayList2 = (ArrayList) this.f4913a.get(obj);
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
            }
        }
        this.f4914b.m2804a((String[]) arrayList.toArray(new String[arrayList.size()]), this.f4914b.f2896f, false, null);
    }
}
