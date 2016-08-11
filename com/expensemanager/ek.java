package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class ek implements OnItemClickListener {
    final /* synthetic */ DebtList f4585a;

    ek(DebtList debtList) {
        this.f4585a = debtList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map map = (Map) adapterView.getItemAtPosition(i);
        String str = (String) map.get("property");
        String str2 = (String) map.get("category");
        String string = this.f4585a.getResources().getString(2131099944);
        int i2 = 2131100038;
        if (str2.startsWith("Income")) {
            string = this.f4585a.getResources().getString(2131099741);
            i2 = 2131100003;
        }
        CharSequence charSequence = string + " " + str;
        CharSequence[] charSequenceArr = new String[]{this.f4585a.getResources().getString(2131100163), this.f4585a.getResources().getString(2131099860), this.f4585a.getResources().getString(i2)};
        Builder builder = new Builder(this.f4585a.f2679f);
        builder.setTitle(charSequence).setItems(charSequenceArr, new el(this, map, str2));
        builder.create();
        builder.show();
    }
}
