package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class ach implements OnClickListener {
    final /* synthetic */ InterestCalculator f3901a;

    ach(InterestCalculator interestCalculator) {
        this.f3901a = interestCalculator;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("Compounding", this.f3901a.f3498b.getSelectedItem().toString());
        bundle.putString("Principal Amount", this.f3901a.f3500d.getText().toString());
        bundle.putString("Monthly Deposit", this.f3901a.f3501e.getText().toString());
        bundle.putString("Period", this.f3901a.f3502f.getText().toString());
        bundle.putString("Interest Rate", this.f3901a.f3503g.getText().toString());
        Intent intent = new Intent(this.f3901a.f3497a, InterestTable.class);
        intent.putExtras(bundle);
        this.f3901a.startActivity(intent);
    }
}
