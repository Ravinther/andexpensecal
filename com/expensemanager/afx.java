package com.expensemanager;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class afx implements OnItemClickListener {
    final /* synthetic */ String f4070a;
    final /* synthetic */ ShoppingListAddEdit f4071b;

    afx(ShoppingListAddEdit shoppingListAddEdit, String str) {
        this.f4071b = shoppingListAddEdit;
        this.f4070a = str;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (!"Edit".equalsIgnoreCase(this.f4070a)) {
            List arrayList = new ArrayList();
            ExpenseAccountActivities.m2602a(this.f4071b.f3598A, "description='" + this.f4071b.f3615k.getText().toString() + "' AND " + "property4" + "!=''", arrayList, false, null);
            if (arrayList != null && arrayList.size() != 0) {
                Map map = (Map) arrayList.get(0);
                String str = (String) map.get("property4");
                if (str != null && !"".equals(str)) {
                    String[] split = str.split(" ");
                    if (split.length > 0) {
                        this.f4071b.f3606b.setText(split[0]);
                    }
                    if (split.length > 1) {
                        this.f4071b.f3607c.setText(split[1]);
                    }
                    this.f4071b.f3612h.setText(aib.m3865b((String) map.get("category")));
                    this.f4071b.f3617m.setText(aib.m3852a(map.get("property")));
                    CharSequence replace = aib.m3853a((String) map.get("amount")).replaceAll(",", "").replace("+", "");
                    if (replace.startsWith("(")) {
                        replace = aba.m3782h(replace);
                    }
                    this.f4071b.f3614j.setText(replace);
                    this.f4071b.f3616l.setText(aib.m3852a(map.get("referenceNumber")));
                    this.f4071b.f3617m.setText(aib.m3852a(map.get("property")));
                    this.f4071b.f3618n.setText((String) map.get("status"));
                    this.f4071b.f3613i.setText((String) map.get("paymentMethod"));
                    this.f4071b.f3622r.setText((String) map.get("tag"));
                    this.f4071b.f3623s.setText((String) map.get("tax"));
                }
            }
        }
    }
}
