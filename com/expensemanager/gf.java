package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class gf implements OnClickListener {
    final /* synthetic */ fu f4691a;

    gf(fu fuVar) {
        this.f4691a = fuVar;
    }

    public void onClick(View view) {
        String str = aba.m3747a(0, "", 0).replace(" AND account=''", "") + " AND " + "account" + " in (" + abd.m3792a(this.f4691a.f4665e) + ")";
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f4691a.m315i(), ExpenseAccountExpandableList.class);
        bundle.putString("title", this.f4691a.m315i().getTitle().toString());
        bundle.putString("account", this.f4691a.f4665e);
        bundle.putString("whereClause", str);
        intent.putExtras(bundle);
        this.f4691a.m281a(intent, 0);
    }
}
