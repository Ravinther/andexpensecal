package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class abp implements OnClickListener {
    final /* synthetic */ GoogleDrive f3858a;

    abp(GoogleDrive googleDrive) {
        this.f3858a = googleDrive;
    }

    public void onClick(View view) {
        this.f3858a.startActivityForResult(this.f3858a.f3479c.m7007a(), 1);
    }
}
