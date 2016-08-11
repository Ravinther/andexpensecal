package com.expensemanager;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.List;

class aet implements OnItemClickListener {
    final /* synthetic */ Dialog f4013a;
    final /* synthetic */ List f4014b;
    final /* synthetic */ aes f4015c;

    aet(aes com_expensemanager_aes, Dialog dialog, List list) {
        this.f4015c = com_expensemanager_aes;
        this.f4013a = dialog;
        this.f4014b = list;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4013a.dismiss();
        this.f4015c.f4012a.f3567g.setText((CharSequence) this.f4014b.get(i));
        this.f4015c.f4012a.f3568h.setText((CharSequence) this.f4014b.get(i));
    }
}
