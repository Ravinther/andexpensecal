package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;

class sl implements OnClickListener {
    final /* synthetic */ String f5260a;
    final /* synthetic */ List f5261b;
    final /* synthetic */ ExpenseDetails f5262c;

    sl(ExpenseDetails expenseDetails, String str, List list) {
        this.f5262c = expenseDetails;
        this.f5260a = str;
        this.f5261b = list;
    }

    public void onClick(View view) {
        String c = aba.m3771c(this.f5262c.f3179G, this.f5262c.f3183K, this.f5262c.f3202q);
        if (this.f5262c.f3202q == 1 && "CATEGORY_VIEW".equalsIgnoreCase(this.f5262c.f3182J)) {
            List arrayList = new ArrayList();
            aba.m3754a(this.f5262c.f3207w, c, arrayList, new ArrayList(), this.f5262c.f3205u);
            this.f5262c.m3114b(this.f5262c.f3175C, arrayList, this.f5260a, this.f5262c.f3182J, aba.m3779e(this.f5262c.f3179G), c);
            return;
        }
        this.f5262c.m3108a(this.f5262c.f3175C, this.f5261b, this.f5260a, this.f5262c.f3182J, aba.m3779e(this.f5262c.f3179G), c);
    }
}
