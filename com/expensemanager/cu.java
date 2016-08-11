package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class cu implements OnItemClickListener {
    final /* synthetic */ ct f4448a;

    cu(ct ctVar) {
        this.f4448a = ctVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map map = (Map) adapterView.getItemAtPosition(i);
        CharSequence[] charSequenceArr = new String[]{this.f4448a.m317j().getString(2131100163), this.f4448a.m317j().getString(2131100002)};
        Builder builder = new Builder(this.f4448a.m315i());
        builder.setTitle(r1.f4447e).setItems(charSequenceArr, new cv(this, map));
        builder.create();
        builder.show();
    }
}
