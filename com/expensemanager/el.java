package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import java.util.Map;

class el implements OnClickListener {
    final /* synthetic */ Map f4586a;
    final /* synthetic */ String f4587b;
    final /* synthetic */ ek f4588c;

    el(ek ekVar, Map map, String str) {
        this.f4588c = ekVar;
        this.f4586a = map;
        this.f4587b = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this.f4588c.f4585a.f2679f, DebtTransactionList.class);
            bundle.putString("account", (String) this.f4586a.get("account"));
            bundle.putLong("rowId", (long) aib.m3879k((String) this.f4586a.get("rowId")));
            intent.putExtras(bundle);
            this.f4588c.f4585a.startActivityForResult(intent, 0);
        }
        if (i == 1) {
            bundle = new Bundle();
            intent = new Intent(this.f4588c.f4585a.f2679f, DebtAddEdit.class);
            bundle.putString("account", (String) this.f4586a.get("account"));
            bundle.putLong("rowId", (long) aib.m3879k((String) this.f4586a.get("rowId")));
            bundle.putString("fromWhere", "Edit");
            bundle.putInt("action", 2131099944);
            bundle.putString("dueDate", (String) this.f4586a.get("tag"));
            if (this.f4587b.startsWith("Income")) {
                bundle.putInt("action", 2131099741);
            }
            intent.putExtras(bundle);
            this.f4588c.f4585a.startActivityForResult(intent, 0);
        }
        if (i == 2) {
            bundle = new Bundle();
            intent = new Intent(this.f4588c.f4585a.f2679f, DebtAddEdit.class);
            bundle.putString("account", (String) this.f4586a.get("account"));
            bundle.putString("remainingAmount", aba.m3767b((String) this.f4586a.get("remaining")));
            bundle.putString("rowIdStr", (String) this.f4586a.get("rowId"));
            bundle.putString("dueDate", (String) this.f4586a.get("tag"));
            bundle.putString("property", (String) this.f4586a.get("property"));
            bundle.putString("fromWhere", "payment");
            bundle.putInt("action", 2131100003);
            if (!this.f4587b.startsWith("Income")) {
                bundle.putString("category", "Income");
                bundle.putInt("action", 2131100038);
            }
            intent.putExtras(bundle);
            this.f4588c.f4585a.startActivityForResult(intent, 0);
        }
    }
}
