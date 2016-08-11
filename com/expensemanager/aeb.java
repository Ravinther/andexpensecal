package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

class aeb implements OnClickListener {
    final /* synthetic */ SMSAddEdit f3987a;

    aeb(SMSAddEdit sMSAddEdit) {
        this.f3987a = sMSAddEdit;
    }

    public void onClick(View view) {
        if (!"".equals(this.f3987a.f3568h.getText().toString())) {
            Map a = SMSMain.m3546a(this.f3987a.f3568h.getText().toString(), this.f3987a.f3568h.getText().toString());
            Intent intent = new Intent(this.f3987a.f3572l, ExpenseNewTransaction.class);
            Bundle bundle = new Bundle();
            bundle.putString("amount", (String) a.get("amount"));
            bundle.putString("payee", (String) a.get("payee"));
            bundle.putString("account", this.f3987a.f3562b.getText().toString());
            bundle.putString("category", this.f3987a.f3563c.getText().toString());
            bundle.putString("paymentMethod", this.f3987a.f3564d.getText().toString());
            bundle.putString("status", this.f3987a.f3565e.getText().toString());
            bundle.putString("referenceNumber", this.f3987a.f3566f.getText().toString());
            bundle.putString("tag", "SMS," + this.f3987a.f3561a);
            bundle.putBoolean("isSMS", true);
            intent.putExtras(bundle);
            this.f3987a.startActivity(intent);
        }
    }
}
