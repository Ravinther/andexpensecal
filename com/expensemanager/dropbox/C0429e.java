package com.expensemanager.dropbox;

import android.view.View;
import android.view.View.OnClickListener;
import com.expensemanager.aba;
import com.expensemanager.abd;
import com.expensemanager.co;
import com.expensemanager.ro;
import java.io.File;

/* renamed from: com.expensemanager.dropbox.e */
class C0429e implements OnClickListener {
    final /* synthetic */ DBRoulette f4514a;

    C0429e(DBRoulette dBRoulette) {
        this.f4514a = dBRoulette;
    }

    public void onClick(View view) {
        ro roVar = new ro(this.f4514a.f4505n);
        String[] split = abd.m3786a(this.f4514a.f4505n, roVar, "MY_ACCOUNT_NAMES", "Personal Expense").split(",");
        for (int i = 0; i < split.length; i++) {
            aba.m3775c(roVar, split[i]);
            File file = new File(co.f4430d + "/" + split[i] + ".csv");
            if (file == null || !file.isFile()) {
                this.f4514a.m4054a(this.f4514a.f4505n.getResources().getString(2131099928));
            } else {
                new C0438n(this.f4514a.f4505n, this.f4514a.f4493a, "/ExpenseManager/CSV/", file, ".csv", true).execute(new Void[0]);
            }
        }
    }
}
