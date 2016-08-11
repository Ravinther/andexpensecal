package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.Arrays;

class adz implements OnClickListener {
    final /* synthetic */ SMSAddEdit f3984a;

    adz(SMSAddEdit sMSAddEdit) {
        this.f3984a = sMSAddEdit;
    }

    public void onClick(View view) {
        if (!"".equals(this.f3984a.f3568h.getText().toString())) {
            String a = abd.m3786a(this.f3984a.f3572l, this.f3984a.f3570j, "SMS_SENDER", "");
            if ("".equals(a)) {
                a = this.f3984a.f3561a;
            } else {
                ArrayList j = aib.m3878j(a);
                if (!j.contains(this.f3984a.f3561a)) {
                    a = a + "," + this.f3984a.f3561a;
                } else if (!this.f3984a.getIntent().getBooleanExtra("isEdit", false)) {
                    if (!j.contains(this.f3984a.f3561a + "_1")) {
                        this.f3984a.f3561a += "_1";
                    } else if (j.contains(this.f3984a.f3561a + "_2")) {
                        new Builder(this.f3984a.f3572l).setTitle(2131099702).setMessage("Only three templates are allowed!").setPositiveButton(2131099983, new aea(this)).show();
                        return;
                    } else {
                        this.f3984a.f3561a += "_2";
                    }
                    a = a + "," + this.f3984a.f3561a;
                }
            }
            String[] split = a.split(",");
            Arrays.sort(split);
            abd.m3811a(this.f3984a.f3572l, this.f3984a.f3570j, "expense_preference", "SMS_SENDER", aib.m3868b(split, ","));
            a = this.f3984a.f3562b.getText().toString() + "|" + this.f3984a.f3563c.getText().toString() + "|" + this.f3984a.f3564d.getText().toString() + "|" + this.f3984a.f3565e.getText().toString() + "|" + this.f3984a.f3566f.getText().toString() + "|" + this.f3984a.f3568h.getText().toString();
            String charSequence = this.f3984a.f3569i.getText().toString();
            a = (charSequence == null || "".equals(charSequence)) ? a + "|" + "" : a + "|" + abd.m3818c(charSequence);
            abd.m3811a(this.f3984a.f3572l, this.f3984a.f3570j, "expense_preference", "SMS_" + this.f3984a.f3561a, a);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("sender_no", this.f3984a.f3561a);
            intent.putExtras(bundle);
            this.f3984a.setResult(-1, intent);
            this.f3984a.finish();
        }
    }
}
