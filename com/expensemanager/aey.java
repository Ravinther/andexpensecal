package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.Map;

class aey implements OnClickListener {
    final /* synthetic */ ArrayList f4023a;
    final /* synthetic */ Map f4024b;
    final /* synthetic */ int f4025c;
    final /* synthetic */ String f4026d;
    final /* synthetic */ aex f4027e;

    aey(aex com_expensemanager_aex, ArrayList arrayList, Map map, int i, String str) {
        this.f4027e = com_expensemanager_aex;
        this.f4023a = arrayList;
        this.f4024b = map;
        this.f4025c = i;
        this.f4026d = str;
    }

    public void onClick(View view) {
        int i = (this.f4023a == null || this.f4023a.size() == 0) ? true : 0;
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this.f4027e.f4021a.f3574b, ExpenseNewTransaction.class);
        if (i == 0) {
            Map map = (Map) this.f4023a.get(0);
            bundle.putString("fromWhere", "EditActivity");
            bundle.putLong("rowId", Long.parseLong((String) map.get("rowId")));
        }
        bundle.putString("tag", "SMS," + this.f4027e.f4021a.f3575c);
        bundle.putString("account", (String) this.f4027e.f4021a.f3576d.get("account"));
        bundle.putString("category", (String) this.f4027e.f4021a.f3576d.get("category"));
        bundle.putString("paymentMethod", (String) this.f4027e.f4021a.f3576d.get("paymentMethod"));
        bundle.putString("status", (String) this.f4027e.f4021a.f3576d.get("status"));
        bundle.putString("referenceNumber", (String) this.f4027e.f4021a.f3576d.get("referenceNumber"));
        bundle.putString("description", (String) this.f4024b.get("body"));
        bundle.putInt("position", this.f4025c);
        if (!"".equals(aib.m3865b((String) this.f4027e.f4021a.f3576d.get("body"))) && !"".equals(aib.m3865b((String) this.f4024b.get("body")))) {
            Map a = SMSMain.m3546a((String) this.f4027e.f4021a.f3576d.get("body"), (String) this.f4024b.get("body"));
            bundle.putString("amount", (String) a.get("amount"));
            bundle.putString("payee", (String) a.get("payee"));
            bundle.putBoolean("isSMS", true);
            bundle.putLong("dateLong", Long.parseLong(this.f4026d));
            intent.putExtras(bundle);
            this.f4027e.f4021a.startActivityForResult(intent, 0);
        }
    }
}
