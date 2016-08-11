package com.expensemanager;

import java.util.ArrayList;
import java.util.Arrays;

class cq implements ahz {
    final /* synthetic */ CreditCardAccountEditList f4438a;

    cq(CreditCardAccountEditList creditCardAccountEditList) {
        this.f4438a = creditCardAccountEditList;
    }

    public void m4030a(int i, int i2) {
        String str = (String) this.f4438a.f2605a.getItem(i);
        this.f4438a.f2605a.remove(str);
        this.f4438a.f2605a.insert(str, i2);
        this.f4438a.f2609e = abd.m3786a(this.f4438a.f2607c, this.f4438a.f2611g, "MY_ACCOUNT_NAMES", null);
        if (this.f4438a.f2609e != null && !"".equals(this.f4438a.f2609e)) {
            this.f4438a.f2608d = new ArrayList(Arrays.asList(this.f4438a.f2609e.split(",")));
            str = (String) this.f4438a.f2608d.get(i);
            this.f4438a.f2608d.remove(i);
            this.f4438a.f2608d.add(i2, str);
            abd.m3811a(this.f4438a.f2607c, this.f4438a.f2611g, "expense_preference", "MY_ACCOUNT_NAMES", aib.m3857a(this.f4438a.f2608d, ","));
            if (this.f4438a.f2610f != null && !"".equals(this.f4438a.f2610f)) {
                int indexOf = this.f4438a.f2608d.indexOf(this.f4438a.f2610f);
                if (indexOf != -1) {
                    abd.m3811a(this.f4438a.f2607c, this.f4438a.f2611g, "expense_preference", "Default_Account_Index", "" + indexOf);
                }
            }
        }
    }
}
