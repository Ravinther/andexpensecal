package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class acs implements OnClickListener {
    final /* synthetic */ LoanCalculator f3932a;

    acs(LoanCalculator loanCalculator) {
        this.f3932a = loanCalculator;
    }

    public void onClick(View view) {
        String obj = this.f3932a.f3506c.getText().toString();
        if ("".equals(obj)) {
            obj = "0";
        }
        String obj2 = this.f3932a.f3507d.getText().toString();
        if ("".equals(obj2)) {
            obj2 = "0";
        }
        int parseInt = (Integer.parseInt(obj) * 12) + Integer.parseInt(obj2);
        if (parseInt != 0 && !"".equals(this.f3932a.f3504a.getText().toString()) && !"".equals(this.f3932a.f3505b.getText().toString())) {
            Bundle bundle = new Bundle();
            bundle.putString("Loan Amount", this.f3932a.f3504a.getText().toString());
            bundle.putString("Interest Rate", this.f3932a.f3505b.getText().toString());
            bundle.putInt("Loan Period", parseInt);
            if (!"".equals(this.f3932a.f3508e.getText().toString())) {
                bundle.putString("Extra Monthly", this.f3932a.f3508e.getText().toString());
            }
            bundle.putInt("Loan Period", parseInt);
            if (!"".equals(this.f3932a.f3510g.getText().toString().trim()) && "Basic".equals(this.f3932a.f3513j.getText().toString())) {
                bundle.putString("Property Tax", this.f3932a.f3510g.getText().toString().trim());
            }
            if (!"".equals(this.f3932a.f3511h.getText().toString().trim()) && "Basic".equals(this.f3932a.f3513j.getText().toString())) {
                bundle.putString("Property Insurance", this.f3932a.f3511h.getText().toString().trim());
            }
            if (!("".equals(this.f3932a.f3512i.getText().toString().trim()) || "".equals(this.f3932a.f3509f.getText().toString().trim()) || !"Basic".equals(this.f3932a.f3513j.getText().toString()))) {
                bundle.putString("Property Price", this.f3932a.f3509f.getText().toString().trim());
                bundle.putString("PMI", this.f3932a.f3512i.getText().toString().trim());
            }
            Intent intent = new Intent(this.f3932a.f3516m, AmortizationSchedule.class);
            intent.putExtras(bundle);
            this.f3932a.startActivity(intent);
        }
    }
}
