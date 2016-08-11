package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class gi implements OnClickListener {
    final /* synthetic */ fu f4694a;

    gi(fu fuVar) {
        this.f4694a = fuVar;
    }

    public void onClick(View view) {
        String str = aba.m3771c(0, "", 1).replace(" AND account=''", "") + " AND " + "account" + " in (" + abd.m3792a(this.f4694a.f4665e) + ")";
        if ("YES".equalsIgnoreCase(ExpenseAccountGroup.f2735r)) {
            str = str + " AND  (" + "category" + "!='Account Transfer' " + " OR " + "subcategory" + "!='Account Transfer' )";
        }
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f4694a.m315i(), ExpenseAccountExpandableList.class);
        bundle.putString("title", this.f4694a.m315i().getTitle().toString());
        bundle.putString("account", this.f4694a.f4665e);
        bundle.putString("whereClause", str);
        intent.putExtras(bundle);
        this.f4694a.m281a(intent, 0);
    }
}
