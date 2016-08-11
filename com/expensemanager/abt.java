package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import java.io.File;

class abt implements OnClickListener {
    final /* synthetic */ Button f3865a;
    final /* synthetic */ GoogleDrive f3866b;

    abt(GoogleDrive googleDrive, Button button) {
        this.f3866b = googleDrive;
        this.f3865a = button;
    }

    public void onClick(View view) {
        File databasePath = this.f3866b.getDatabasePath("personal_finance.db");
        if (databasePath == null || !databasePath.isFile()) {
            this.f3866b.m3462a(this.f3866b.f3483h.getResources().getString(2131099928));
            return;
        }
        this.f3866b.m3454a(this.f3865a.getText().toString(), databasePath, "application/octet-stream", aib.m3874f("yyyy-MM-dd") + ".db");
    }
}
