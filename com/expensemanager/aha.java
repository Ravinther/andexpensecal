package com.expensemanager;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.List;

class aha implements OnItemClickListener {
    final /* synthetic */ Dialog f4111a;
    final /* synthetic */ List f4112b;
    final /* synthetic */ agz f4113c;

    aha(agz com_expensemanager_agz, Dialog dialog, List list) {
        this.f4113c = com_expensemanager_agz;
        this.f4111a = dialog;
        this.f4112b = list;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4111a.dismiss();
        this.f4113c.f4108a.f3612h.setText((CharSequence) this.f4112b.get(i));
    }
}
