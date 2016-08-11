package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class zd implements OnItemClickListener {
    final /* synthetic */ String[] f5524a;
    final /* synthetic */ Map f5525b;
    final /* synthetic */ ExpenseReminderList f5526c;

    zd(ExpenseReminderList expenseReminderList, String[] strArr, Map map) {
        this.f5526c = expenseReminderList;
        this.f5524a = strArr;
        this.f5525b = map;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map map = (Map) adapterView.getItemAtPosition(i);
        Builder builder = new Builder(this.f5526c.f3387c);
        builder.setTitle((String) map.get("description")).setItems(this.f5524a, new ze(this, map));
        builder.create();
        builder.show();
    }
}
