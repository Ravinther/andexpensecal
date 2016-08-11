package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class aau implements OnClickListener {
    final /* synthetic */ ExpenseReport f3821a;

    aau(ExpenseReport expenseReport) {
        this.f3821a = expenseReport;
    }

    public void onClick(View view) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("From: " + this.f3821a.f3445f.getText().toString() + " " + this.f3821a.f3446g.getText().toString() + "\n");
        stringBuffer.append("Date: " + this.f3821a.f3444e.getText().toString() + "\n");
        if (!"".equals(this.f3821a.f3449j.getText().toString())) {
            stringBuffer.append("Description: " + this.f3821a.f3449j.getText().toString() + "\n");
        }
        if (!"".equals(this.f3821a.f3450k.getText().toString())) {
            stringBuffer.append("Charge Code: " + this.f3821a.f3450k.getText().toString() + "\n");
        }
        if (!"".equals(this.f3821a.f3451l.getText().toString())) {
            stringBuffer.append("Contract Name: " + this.f3821a.f3451l.getText().toString() + "\n");
        }
        if (!"".equals(this.f3821a.f3452m.getText().toString())) {
            stringBuffer.append("Additional Comment: " + this.f3821a.f3452m.getText().toString() + "\n");
        }
        Intent intent = new Intent(this.f3821a.f3443d, ExpenseReportPdf.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f3821a.f3456q);
        bundle.putString("whereClause", this.f3821a.f3442c);
        bundle.putString("msgBody", stringBuffer.toString());
        intent.putExtras(bundle);
        this.f3821a.f3443d.startActivity(intent);
    }
}
