package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

class abu implements OnClickListener {
    final /* synthetic */ Button f3867a;
    final /* synthetic */ GoogleDrive f3868b;

    abu(GoogleDrive googleDrive, Button button) {
        this.f3868b = googleDrive;
        this.f3867a = button;
    }

    public void onClick(View view) {
        String[] split = abd.m3786a(this.f3868b.f3483h, GoogleDrive.f3477g, "MY_ACCOUNT_NAMES", "Personal Expense").split(",");
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (int i = 0; i < split.length; i++) {
            aba.m3775c(GoogleDrive.f3477g, split[i]);
            File file = new File(co.f4430d + "/" + split[i] + ".csv");
            if (file == null || !file.isFile()) {
                this.f3868b.m3462a(this.f3868b.f3483h.getResources().getString(2131099928));
            } else {
                arrayList.add(file);
                arrayList2.add(aib.m3874f("yyyy-MM-dd") + "_" + split[i] + ".csv");
            }
        }
        this.f3868b.m3455a(this.f3867a.getText().toString(), arrayList, "text/plain", arrayList2);
    }
}
