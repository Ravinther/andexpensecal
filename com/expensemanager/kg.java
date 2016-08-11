package com.expensemanager;

import java.util.Map;

class kg implements ahz {
    final /* synthetic */ ExpenseAutoFillList f4878a;

    kg(ExpenseAutoFillList expenseAutoFillList) {
        this.f4878a = expenseAutoFillList;
    }

    public void m4149a(int i, int i2) {
        try {
            Map map = (Map) this.f4878a.f2886h.getItem(i);
            this.f4878a.f2886h.remove(map);
            this.f4878a.f2886h.insert(map, i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
