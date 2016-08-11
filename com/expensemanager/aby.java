package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.io.File;

class aby implements OnItemClickListener {
    final /* synthetic */ abx f3874a;

    aby(abx com_expensemanager_abx) {
        this.f3874a = com_expensemanager_abx;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String[] strArr = (String[]) this.f3874a.f3873a.f3487b.toArray(new String[this.f3874a.f3873a.f3487b.size()]);
        File file = new File(this.f3874a.f3873a.f3486a.getCacheDir().getAbsolutePath() + "/" + strArr[i]);
        if ("csv".equalsIgnoreCase(this.f3874a.f3873a.f3490e)) {
            file = new File(co.f4430d + "/" + strArr[i]);
        }
        this.f3874a.f3873a.m3469a((String) this.f3874a.f3873a.f3489d.get(strArr[i]), strArr[i], "jpg".equalsIgnoreCase(this.f3874a.f3873a.f3490e) ? new File(co.f4431e + "/" + strArr[i]) : file);
        this.f3874a.f3873a.f3496l = strArr[i];
    }
}
