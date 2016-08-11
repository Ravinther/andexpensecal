package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

class acb implements Runnable {
    final /* synthetic */ GoogleDriveDownloadList f3887a;

    acb(GoogleDriveDownloadList googleDriveDownloadList) {
        this.f3887a = googleDriveDownloadList;
    }

    public void run() {
        String b = this.f3887a.f3496l;
        try {
            String str = "Personal Expense";
            if (!(b.indexOf("_") == -1 || b.lastIndexOf(".") == -1)) {
                str = b.substring(b.indexOf("_") + 1, b.lastIndexOf("."));
            }
            if (ExpenseExport.m3163a(this.f3887a.f3486a, co.f4430d + "/" + b, null)) {
                Toast.makeText(this.f3887a.f3486a, this.f3887a.getResources().getString(2131099929), 1).show();
                Intent intent = new Intent(this.f3887a.f3486a, ExpenseAccountActivities.class);
                Bundle bundle = new Bundle();
                bundle.putString("account", str);
                intent.putExtras(bundle);
                this.f3887a.startActivity(intent);
                return;
            }
            Toast.makeText(this.f3887a.f3486a, this.f3887a.getResources().getString(2131099925), 1).show();
        } catch (Exception e) {
            Toast.makeText(this.f3887a.f3486a, this.f3887a.getResources().getString(2131099925), 1).show();
        }
    }
}
