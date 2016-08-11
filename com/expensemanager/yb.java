package com.expensemanager;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.List;

class yb implements OnItemClickListener {
    final /* synthetic */ Dialog f5471a;
    final /* synthetic */ List f5472b;
    final /* synthetic */ ya f5473c;

    yb(ya yaVar, Dialog dialog, List list) {
        this.f5473c = yaVar;
        this.f5471a = dialog;
        this.f5472b = list;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f5471a.dismiss();
        if (this.f5473c.f5470a.f3338e.getText().toString().startsWith("Income")) {
            this.f5473c.f5470a.f3338e.setText("Income:" + ((String) this.f5472b.get(i)));
        } else {
            this.f5473c.f5470a.f3338e.setText((CharSequence) this.f5472b.get(i));
        }
    }
}
