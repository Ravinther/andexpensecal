package com.expensemanager;

import android.widget.ArrayAdapter;

class abx implements Runnable {
    final /* synthetic */ GoogleDriveDownloadList f3873a;

    abx(GoogleDriveDownloadList googleDriveDownloadList) {
        this.f3873a = googleDriveDownloadList;
    }

    public void run() {
        this.f3873a.setListAdapter(new ArrayAdapter(this.f3873a.f3486a, 17367043, this.f3873a.f3487b));
        this.f3873a.getListView().setOnItemClickListener(new aby(this));
    }
}
