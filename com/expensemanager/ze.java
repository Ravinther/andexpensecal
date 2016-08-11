package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Map;

class ze implements OnClickListener {
    final /* synthetic */ Map f5527a;
    final /* synthetic */ zd f5528b;

    ze(zd zdVar, Map map) {
        this.f5528b = zdVar;
        this.f5527a = map;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 0;
        if (i == 0) {
            ArrayList arrayList = (ArrayList) this.f5528b.f5525b.get((String) this.f5527a.get("property2"));
            if ((arrayList != null ? arrayList.size() : 0) >= aba.m3780f((String) this.f5527a.get("numberOfPayment"))) {
                aib.m3849a(this.f5528b.f5526c.f3387c, null, this.f5528b.f5526c.getResources().getString(2131099702), 17301543, this.f5528b.f5526c.getResources().getString(2131099994), this.f5528b.f5526c.getResources().getString(2131099983), null, null, null).show();
                return;
            }
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this.f5528b.f5526c.f3387c, ExpenseNewTransaction.class);
            bundle.putString("account", (String) this.f5527a.get("account"));
            bundle.putString("description", (String) this.f5527a.get("description"));
            bundle.putString("reminder", "YES");
            bundle.putString("reminder_Id", (String) this.f5527a.get("property2"));
            intent.putExtras(bundle);
            this.f5528b.f5526c.startActivityForResult(intent, 0);
        }
        if (i == 1) {
            String str = (String) this.f5527a.get("description");
            bundle = new Bundle();
            intent = new Intent(this.f5528b.f5526c.f3387c, ExpenseReminderTransactionList.class);
            bundle.putString("description", str);
            bundle.putString("account", (String) this.f5527a.get("account"));
            intent.putExtras(bundle);
            this.f5528b.f5526c.startActivityForResult(intent, 0);
        }
        if (i == 2) {
            bundle = new Bundle();
            intent = new Intent(this.f5528b.f5526c.f3387c, ExpenseRepeatingTransaction.class);
            bundle.putString("account", (String) this.f5527a.get("account"));
            bundle.putString("rowId", (String) this.f5527a.get("rowId"));
            bundle.putString("fromWhere", "Edit");
            bundle.putString("reminder", "YES");
            intent.putExtras(bundle);
            this.f5528b.f5526c.startActivityForResult(intent, 0);
        }
        if (i == 3) {
            str = (String) this.f5527a.get("description");
            String str2 = (String) this.f5527a.get("rowId");
            String str3 = (String) this.f5527a.get("property2");
            if (!(str2 == null || "".endsWith(str2))) {
                i2 = Integer.valueOf(str2).intValue();
            }
            this.f5528b.f5526c.m3366a(i2, str, str3);
        }
    }
}
