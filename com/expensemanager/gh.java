package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class gh implements OnClickListener {
    final /* synthetic */ fu f4693a;

    gh(fu fuVar) {
        this.f4693a = fuVar;
    }

    public void onClick(View view) {
        String str = aba.m3771c(0, "", 0).replace(" AND account=''", "") + " AND " + "account" + " in (" + abd.m3792a(this.f4693a.f4665e) + ")";
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f4693a.m315i(), ExpenseAccountExpandableList.class);
        bundle.putString("title", this.f4693a.m315i().getTitle().toString());
        bundle.putString("account", this.f4693a.f4665e);
        bundle.putString("whereClause", str);
        intent.putExtras(bundle);
        this.f4693a.m281a(intent, 0);
    }
}
