package com.expensemanager;

import android.os.Looper;
import android.widget.Toast;

class aaw extends Thread {
    final /* synthetic */ ExpenseReportPdf f3823a;

    aaw(ExpenseReportPdf expenseReportPdf) {
        this.f3823a = expenseReportPdf;
    }

    public void run() {
        Looper.prepare();
        Toast.makeText(this.f3823a.f3466g, "It takes several seconds to generate the PDF file.", 1).show();
        Looper.loop();
    }
}
