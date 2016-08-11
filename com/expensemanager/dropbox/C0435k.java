package com.expensemanager.dropbox;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: com.expensemanager.dropbox.k */
class C0435k implements OnItemClickListener {
    final /* synthetic */ String f4528a;
    final /* synthetic */ DropboxDownloadList f4529b;

    C0435k(DropboxDownloadList dropboxDownloadList, String str) {
        this.f4529b = dropboxDownloadList;
        this.f4528a = str;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        new C0437m(this.f4529b, i, this.f4528a).execute(new Context[]{this.f4529b.f4506a});
    }
}
