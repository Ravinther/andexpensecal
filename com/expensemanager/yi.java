package com.expensemanager;

import java.util.ArrayList;
import java.util.Arrays;

class yi implements ahz {
    final /* synthetic */ ExpensePayList f5483a;

    yi(ExpensePayList expensePayList) {
        this.f5483a = expensePayList;
    }

    public void m4245a(int i, int i2) {
        String str = (String) this.f5483a.f3362c.getItem(i);
        this.f5483a.f3362c.remove(str);
        this.f5483a.f3362c.insert(str, i2);
        this.f5483a.f3366g = abd.m3786a(this.f5483a.f3364e, this.f5483a.f3371l, this.f5483a.f3367h, this.f5483a.f3368i);
        this.f5483a.f3365f = new ArrayList(Arrays.asList(this.f5483a.f3366g.split(",")));
        str = (String) this.f5483a.f3365f.get(i);
        this.f5483a.f3365f.remove(i);
        this.f5483a.f3365f.add(i2, str);
        abd.m3811a(this.f5483a.f3364e, this.f5483a.f3371l, "expense_preference", this.f5483a.f3367h, aib.m3857a(this.f5483a.f3365f, ","));
    }
}
