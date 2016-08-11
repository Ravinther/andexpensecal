package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class gc implements OnClickListener {
    final /* synthetic */ fu f4688a;

    gc(fu fuVar) {
        this.f4688a = fuVar;
    }

    public void onClick(View view) {
        String a = abd.m3794a("expensed<=" + aib.m3847a(), "All", this.f4688a.f4665e, "NO");
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f4688a.m315i(), ExpenseAccountExpandableList.class);
        bundle.putString("title", this.f4688a.m315i().getTitle().toString());
        bundle.putString("account", this.f4688a.f4665e);
        bundle.putString("whereClause", a);
        intent.putExtras(bundle);
        this.f4688a.m281a(intent, 0);
    }
}
