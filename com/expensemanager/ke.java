package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class ke implements OnItemClickListener {
    final /* synthetic */ ExpenseAutoFillList f4876a;

    ke(ExpenseAutoFillList expenseAutoFillList) {
        this.f4876a = expenseAutoFillList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map map = (Map) adapterView.getItemAtPosition(i);
        Bundle bundle = new Bundle();
        Intent intent = new Intent();
        bundle.putString("description", (String) map.get("description"));
        intent.putExtras(bundle);
        this.f4876a.setResult(-1, intent);
        this.f4876a.finish();
    }
}
