package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;

class afd implements OnClickListener {
    final /* synthetic */ afc f4041a;

    afd(afc com_expensemanager_afc) {
        this.f4041a = com_expensemanager_afc;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            Bundle bundle = new Bundle();
            Intent intent = new Intent(this.f4041a.f4040d.f4035b.f3579a, SMSAddEdit.class);
            bundle.putString("sender_no", this.f4041a.f4037a);
            bundle.putBoolean("isEdit", true);
            intent.putExtras(bundle);
            this.f4041a.f4040d.f4035b.startActivityForResult(intent, 0);
        }
        if (i == 1) {
            intent = new Intent(this.f4041a.f4040d.f4035b.f3579a, SMSList.class);
            Bundle bundle2 = new Bundle();
            bundle2.putString("sender_no", (String) this.f4041a.f4040d.f4035b.f3580b.get(this.f4041a.f4038b));
            intent.putExtras(bundle2);
            this.f4041a.f4040d.f4035b.startActivityForResult(intent, 0);
        }
        if (i == 2) {
            String a = ExpenseCustomActivities.m3061a("expense_tag", (String) this.f4041a.f4040d.f4035b.f3580b.get(this.f4041a.f4038b));
            bundle2 = new Bundle();
            Intent intent2 = new Intent(this.f4041a.f4040d.f4035b.f3579a, ExpenseAccountExpandableList.class);
            bundle2.putString("title", this.f4041a.f4040d.f4035b.getResources().getString(2131100092) + ": " + ((String) this.f4041a.f4040d.f4035b.f3580b.get(this.f4041a.f4038b)));
            bundle2.putString("account", (String) this.f4041a.f4039c.get("account"));
            bundle2.putString("whereClause", a);
            intent2.putExtras(bundle2);
            this.f4041a.f4040d.f4035b.startActivityForResult(intent2, 0);
        }
    }
}
