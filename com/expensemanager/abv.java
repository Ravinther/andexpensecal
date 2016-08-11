package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

class abv implements OnClickListener {
    final /* synthetic */ Button f3869a;
    final /* synthetic */ GoogleDrive f3870b;

    abv(GoogleDrive googleDrive, Button button) {
        this.f3870b = googleDrive;
        this.f3869a = button;
    }

    public void onClick(View view) {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        File file = new File(co.f4431e);
        if (file == null || file.list() == null || file.list().length == 0) {
            aib.m3849a(this.f3870b.f3483h, null, this.f3870b.getResources().getString(2131099702), 17301543, this.f3870b.getResources().getString(2131099928), this.f3870b.getResources().getString(2131099983), null, null, null).show();
            return;
        }
        String[] list = file.list();
        for (int i = 0; i < list.length; i++) {
            arrayList.add(new File(co.f4431e + list[i]));
            arrayList2.add(list[i]);
        }
        this.f3870b.m3455a(this.f3869a.getText().toString(), arrayList, "image/jpeg", arrayList2);
    }
}
