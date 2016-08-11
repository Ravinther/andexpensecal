package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;

class rv implements OnClickListener {
    final /* synthetic */ String f5233a;
    final /* synthetic */ List f5234b;
    final /* synthetic */ ExpenseDetails f5235c;

    rv(ExpenseDetails expenseDetails, String str, List list) {
        this.f5235c = expenseDetails;
        this.f5233a = str;
        this.f5234b = list;
    }

    public void onClick(View view) {
        String b = aba.m3764b(this.f5235c.f3177E, this.f5235c.f3183K, this.f5235c.f3202q);
        if (this.f5235c.f3202q == 1 && "CATEGORY_VIEW".equalsIgnoreCase(this.f5235c.f3182J)) {
            List arrayList = new ArrayList();
            aba.m3754a(this.f5235c.f3207w, b, arrayList, new ArrayList(), this.f5235c.f3205u);
            this.f5235c.m3114b(this.f5235c.f3175C, arrayList, this.f5233a, this.f5235c.f3181I, aba.m3763b(this.f5235c.f3177E), b);
            return;
        }
        this.f5235c.m3108a(this.f5235c.f3175C, this.f5234b, this.f5233a, this.f5235c.f3180H, aba.m3763b(this.f5235c.f3177E), b);
    }
}
