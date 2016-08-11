package com.expensemanager;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.List;

class aer implements OnItemClickListener {
    final /* synthetic */ Dialog f4009a;
    final /* synthetic */ List f4010b;
    final /* synthetic */ aeq f4011c;

    aer(aeq com_expensemanager_aeq, Dialog dialog, List list) {
        this.f4011c = com_expensemanager_aeq;
        this.f4009a = dialog;
        this.f4010b = list;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4009a.dismiss();
        this.f4011c.f4008a.f3567g.setText((CharSequence) this.f4010b.get(i));
        this.f4011c.f4008a.f3568h.setText((CharSequence) this.f4010b.get(i));
    }
}
