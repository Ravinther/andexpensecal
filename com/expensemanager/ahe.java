package com.expensemanager;

import java.util.ArrayList;
import java.util.Arrays;

class ahe implements ahz {
    final /* synthetic */ SortableItemList f4118a;

    ahe(SortableItemList sortableItemList) {
        this.f4118a = sortableItemList;
    }

    public void m3840a(int i, int i2) {
        String str = (String) this.f4118a.f3631a.getItem(i);
        this.f4118a.f3631a.remove(str);
        this.f4118a.f3631a.insert(str, i2);
        this.f4118a.f3635e = abd.m3786a(this.f4118a.f3633c, this.f4118a.f3638h, this.f4118a.f3636f, this.f4118a.getResources().getString(this.f4118a.f3637g));
        this.f4118a.f3634d = new ArrayList(Arrays.asList(this.f4118a.f3635e.split(",")));
        str = (String) this.f4118a.f3634d.get(i);
        this.f4118a.f3634d.remove(i);
        this.f4118a.f3634d.add(i2, str);
        abd.m3811a(this.f4118a.f3633c, this.f4118a.f3638h, "expense_preference", this.f4118a.f3636f, aib.m3857a(this.f4118a.f3634d, ","));
    }
}
