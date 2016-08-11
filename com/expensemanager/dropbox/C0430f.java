package com.expensemanager.dropbox;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

/* renamed from: com.expensemanager.dropbox.f */
class C0430f implements OnClickListener {
    final /* synthetic */ DBRoulette f4515a;

    C0430f(DBRoulette dBRoulette) {
        this.f4515a = dBRoulette;
    }

    public void onClick(View view) {
        new C0433i(this.f4515a, this.f4515a.f4493a, "/ExpenseManager/CSV/", new ArrayList()).execute(new Void[0]);
    }
}
