package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class eo implements OnItemClickListener {
    final /* synthetic */ Map f4595a;
    final /* synthetic */ String f4596b;
    final /* synthetic */ DebtTransactionList f4597c;

    eo(DebtTransactionList debtTransactionList, Map map, String str) {
        this.f4597c = debtTransactionList;
        this.f4595a = map;
        this.f4596b = str;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map map = (Map) adapterView.getItemAtPosition(i);
        String str = (String) map.get("property");
        String str2 = (String) map.get("category");
        String string = this.f4597c.getResources().getString(2131099944);
        if (str2.startsWith("Income")) {
            string = this.f4597c.getResources().getString(2131099741);
        }
        string + " " + str;
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f4597c.f2684e, DebtAddEdit.class);
        bundle.putString("account", (String) map.get("account"));
        bundle.putLong("rowId", (long) aib.m3879k((String) map.get("rowId")));
        bundle.putString("fromWhere", "edit");
        bundle.putInt("action", 2131099944);
        bundle.putString("dueDate", (String) map.get("tag"));
        if (str2.startsWith("Income")) {
            bundle.putInt("action", 2131099741);
        }
        if (i > 0) {
            bundle.putString("rowIdStr", (String) map.get("rowId"));
            bundle.putString("remainingAmount", (String) map.get("remaining"));
            bundle.putString("dueDate", (String) this.f4595a.get("tag"));
            bundle.putString("property", (String) map.get("property"));
            bundle.putInt("action", 2131100003);
            if (!this.f4596b.startsWith("Income")) {
                bundle.putInt("action", 2131099944);
            }
            if (str2.startsWith("Income")) {
                bundle.putInt("action", 2131100038);
                if (this.f4596b.startsWith("Income")) {
                    bundle.putInt("action", 2131099741);
                }
            }
        }
        intent.putExtras(bundle);
        this.f4597c.startActivityForResult(intent, 0);
    }
}
