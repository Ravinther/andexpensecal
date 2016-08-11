package com.expensemanager;

import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* renamed from: com.expensemanager.if */
class C0449if implements OnItemSelectedListener {
    final /* synthetic */ Resources f4791a;
    final /* synthetic */ ExpenseAccountSummaryTime f4792b;

    C0449if(ExpenseAccountSummaryTime expenseAccountSummaryTime, Resources resources) {
        this.f4792b = expenseAccountSummaryTime;
        this.f4791a = resources;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            this.f4792b.f2811s.setText(this.f4791a.getString(2131099755));
            this.f4792b.f2809q.setText(null);
        }
        if (i == 1) {
            this.f4792b.f2808p.setVisibility(0);
            this.f4792b.f2811s.setText(this.f4791a.getString(2131099755));
            this.f4792b.f2809q.setText("Income");
        } else if (i != 6) {
            this.f4792b.f2808p.setVisibility(8);
        }
        if (i == 2) {
            this.f4792b.f2811s.setText(this.f4791a.getString(2131100007));
            this.f4792b.f2809q.setText(null);
        }
        if (i == 3) {
            this.f4792b.f2811s.setText(this.f4791a.getString(2131100011));
            this.f4792b.f2809q.setText(null);
        }
        if (i == 4) {
            this.f4792b.f2811s.setText(this.f4791a.getString(2131100101));
            this.f4792b.f2809q.setText(null);
        }
        if (i == 5) {
            this.f4792b.f2811s.setText(this.f4791a.getString(2131100110));
            this.f4792b.f2809q.setText(null);
        }
        if (i == 6) {
            this.f4792b.f2808p.setVisibility(0);
            this.f4792b.f2811s.setText(this.f4791a.getString(2131099755));
            this.f4792b.f2809q.setText(null);
        } else if (i != 1) {
            this.f4792b.f2808p.setVisibility(8);
        }
        this.f4792b.m2697a();
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
