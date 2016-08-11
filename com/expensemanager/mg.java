package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.HashMap;

class mg implements OnClickListener {
    final /* synthetic */ HashMap f4970a;
    final /* synthetic */ ExpenseBudgetOnetimeAdd f4971b;

    mg(ExpenseBudgetOnetimeAdd expenseBudgetOnetimeAdd, HashMap hashMap) {
        this.f4971b = expenseBudgetOnetimeAdd;
        this.f4970a = hashMap;
    }

    public void onClick(View view) {
        String charSequence = this.f4971b.f2958e.getText().toString();
        ArrayList arrayList = new ArrayList();
        if (!(charSequence == null || "".endsWith(charSequence))) {
            String[] split = charSequence.split(",");
            for (Object obj : split) {
                ArrayList arrayList2 = (ArrayList) this.f4970a.get(obj);
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
            }
        }
        this.f4971b.m2874a((String[]) arrayList.toArray(new String[arrayList.size()]), this.f4971b.f2959f, false);
    }
}
