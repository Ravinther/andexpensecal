package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

class aee implements OnClickListener {
    final /* synthetic */ aec f3990a;

    aee(aec com_expensemanager_aec) {
        this.f3990a = com_expensemanager_aec;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        boolean z = false;
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(abd.m3786a(this.f3990a.f3988a.f3572l, this.f3990a.f3988a.f3570j, "SMS_SENDER", "").split(",")));
            arrayList.remove(this.f3990a.f3988a.f3561a);
            if (!this.f3990a.f3988a.f3570j.m4206d()) {
                this.f3990a.f3988a.f3570j.m4193a();
            }
            abd.m3811a(this.f3990a.f3988a.f3572l, this.f3990a.f3988a.f3570j, "expense_preference", "SMS_SENDER", aib.m3857a(arrayList, ","));
            if (!this.f3990a.f3988a.f3570j.m4206d()) {
                this.f3990a.f3988a.f3570j.m4193a();
            }
            this.f3990a.f3988a.f3570j.m4197a("expense_preference", "name", "SMS_" + this.f3990a.f3988a.f3561a);
            z = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f3990a.f3988a.f3570j.m4201b();
        if (z) {
            abd.m3805a(this.f3990a.f3988a.f3572l, z);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("sender_no", this.f3990a.f3988a.f3561a);
            intent.putExtras(bundle);
            this.f3990a.f3988a.setResult(-1, intent);
            this.f3990a.f3988a.finish();
            return;
        }
        aib.m3849a(this.f3990a.f3988a.f3572l, null, this.f3990a.f3988a.getResources().getString(2131099702), 17301543, this.f3990a.f3988a.getResources().getString(2131099707), this.f3990a.f3988a.getResources().getString(2131099983), null, null, null).show();
    }
}
