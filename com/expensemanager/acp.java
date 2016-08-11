package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

class acp implements OnClickListener {
    final /* synthetic */ LinearLayout f3928a;
    final /* synthetic */ LoanCalculator f3929b;

    acp(LoanCalculator loanCalculator, LinearLayout linearLayout) {
        this.f3929b = loanCalculator;
        this.f3928a = linearLayout;
    }

    public void onClick(View view) {
        Button button = (Button) view;
        if ("Advanced".equalsIgnoreCase(button.getText().toString())) {
            this.f3928a.setVisibility(0);
            button.setText("Basic");
            return;
        }
        this.f3928a.setVisibility(8);
        button.setText("Advanced");
    }
}
