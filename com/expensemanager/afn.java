package com.expensemanager;

import java.util.Map;

class afn implements ahz {
    final /* synthetic */ ShoppingList f4052a;

    afn(ShoppingList shoppingList) {
        this.f4052a = shoppingList;
    }

    public void m3838a(int i, int i2) {
        Map map = (Map) this.f4052a.f3591a.getItem(i);
        this.f4052a.f3591a.remove(map);
        this.f4052a.f3591a.insert(map, i2);
        this.f4052a.m3562a(this.f4052a.f3594d);
        this.f4052a.onCreate(null);
    }
}
