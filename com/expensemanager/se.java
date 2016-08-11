package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;

class se implements OnClickListener {
    final /* synthetic */ String f5250a;
    final /* synthetic */ List f5251b;
    final /* synthetic */ ExpenseDetails f5252c;

    se(ExpenseDetails expenseDetails, String str, List list) {
        this.f5252c = expenseDetails;
        this.f5250a = str;
        this.f5251b = list;
    }

    public void onClick(View view) {
        String b = aba.m3764b(this.f5252c.f3178F, this.f5252c.f3183K, this.f5252c.f3202q);
        if (this.f5252c.f3202q == 1 && "CATEGORY_VIEW".equalsIgnoreCase(this.f5252c.f3182J)) {
            List arrayList = new ArrayList();
            aba.m3754a(this.f5252c.f3207w, b, arrayList, new ArrayList(), this.f5252c.f3205u);
            this.f5252c.m3114b(this.f5252c.f3175C, arrayList, this.f5250a, this.f5252c.f3181I, aba.m3748a(this.f5252c.f3178F, this.f5252c.f3184L), b);
            return;
        }
        this.f5252c.m3108a(this.f5252c.f3175C, this.f5251b, this.f5250a, this.f5252c.f3181I, aba.m3748a(this.f5252c.f3178F, this.f5252c.f3184L), b);
    }
}
