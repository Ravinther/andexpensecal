package com.expensemanager.dropbox;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

/* renamed from: com.expensemanager.dropbox.d */
class C0428d implements OnClickListener {
    final /* synthetic */ DBRoulette f4513a;

    C0428d(DBRoulette dBRoulette) {
        this.f4513a = dBRoulette;
    }

    public void onClick(View view) {
        new C0433i(this.f4513a, this.f4513a.f4493a, "/ExpenseManager/Database/", new ArrayList()).execute(new Void[0]);
    }
}
