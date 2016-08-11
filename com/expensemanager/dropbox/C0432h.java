package com.expensemanager.dropbox;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

/* renamed from: com.expensemanager.dropbox.h */
class C0432h implements OnClickListener {
    final /* synthetic */ DBRoulette f4517a;

    C0432h(DBRoulette dBRoulette) {
        this.f4517a = dBRoulette;
    }

    public void onClick(View view) {
        new C0433i(this.f4517a, this.f4517a.f4493a, "/ExpenseManager/Receipt/", new ArrayList()).execute(new Void[0]);
    }
}
