package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class fy implements OnClickListener {
    final /* synthetic */ fu f4671a;

    fy(fu fuVar) {
        this.f4671a = fuVar;
    }

    public void onClick(View view) {
        String str = aba.m3747a(0, "", 1).replace(" AND account=''", "") + " AND " + "account" + " in (" + abd.m3792a(this.f4671a.f4665e) + ")";
        if ("YES".equalsIgnoreCase(ExpenseAccountGroup.f2735r)) {
            str = str + " AND  (" + "category" + "!='Account Transfer' " + " OR " + "subcategory" + "!='Account Transfer' )";
        }
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f4671a.m315i(), ExpenseAccountExpandableList.class);
        bundle.putString("title", this.f4671a.m315i().getTitle().toString());
        bundle.putString("account", this.f4671a.f4665e);
        bundle.putString("whereClause", str);
        intent.putExtras(bundle);
        this.f4671a.m281a(intent, 0);
    }
}
