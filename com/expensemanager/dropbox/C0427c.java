package com.expensemanager.dropbox;

import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;

/* renamed from: com.expensemanager.dropbox.c */
class C0427c implements OnClickListener {
    final /* synthetic */ DBRoulette f4512a;

    C0427c(DBRoulette dBRoulette) {
        this.f4512a = dBRoulette;
    }

    public void onClick(View view) {
        File databasePath = this.f4512a.getDatabasePath("personal_finance.db");
        if (databasePath == null || !databasePath.isFile()) {
            this.f4512a.m4054a(this.f4512a.f4505n.getResources().getString(2131099928));
        } else {
            new C0438n(this.f4512a.f4505n, this.f4512a.f4493a, "/ExpenseManager/Database/", databasePath, ".db", true).execute(new Void[0]);
        }
    }
}
