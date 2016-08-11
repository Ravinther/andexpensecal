package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.expensemanager.calculator.Calculator;

class aaz implements OnItemClickListener {
    final /* synthetic */ String[] f3826a;
    final /* synthetic */ ExpenseTools f3827b;

    aaz(ExpenseTools expenseTools, String[] strArr) {
        this.f3827b = expenseTools;
        this.f3826a = strArr;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Intent intent;
        Bundle bundle;
        if (i == 0) {
            intent = new Intent(this.f3827b.f3475c, Calculator.class);
            bundle = new Bundle();
            bundle.putString("fromWhere", "tools");
            bundle.putString("account", this.f3827b.f3473a);
            intent.putExtras(bundle);
            this.f3827b.startActivity(intent);
        } else if (i == 1) {
            intent = new Intent(this.f3827b.f3475c, CurrencyConverter.class);
            bundle = new Bundle();
            bundle.putString("fromWhere", "tools");
            bundle.putString("account", this.f3827b.f3473a);
            intent.putExtras(bundle);
            this.f3827b.startActivity(intent);
        } else if (i == 2) {
            intent = new Intent(this.f3827b.f3475c, SalesTaxCalculator.class);
            bundle = new Bundle();
            bundle.putString("fromWhere", "tools");
            bundle.putString("account", this.f3827b.f3473a);
            bundle.putString("title", this.f3826a[2]);
            intent.putExtras(bundle);
            this.f3827b.startActivity(intent);
        } else if (i == 3) {
            intent = new Intent(this.f3827b.f3475c, TipCalculator.class);
            bundle = new Bundle();
            bundle.putString("fromWhere", "tools");
            bundle.putString("account", this.f3827b.f3473a);
            bundle.putString("title", this.f3826a[3]);
            intent.putExtras(bundle);
            this.f3827b.startActivity(intent);
        } else if (i == 4) {
            intent = new Intent(this.f3827b.f3475c, CreditCardPayOffCalculator.class);
            bundle = new Bundle();
            bundle.putString("fromWhere", "tools");
            bundle.putString("account", this.f3827b.f3473a);
            bundle.putString("title", this.f3826a[4]);
            intent.putExtras(bundle);
            this.f3827b.startActivity(intent);
        } else if (i == 5) {
            intent = new Intent(this.f3827b.f3475c, InterestCalculator.class);
            bundle = new Bundle();
            bundle.putString("fromWhere", "tools");
            bundle.putString("account", this.f3827b.f3473a);
            bundle.putString("title", this.f3826a[5]);
            intent.putExtras(bundle);
            this.f3827b.startActivity(intent);
        } else if (i == 6) {
            intent = new Intent(this.f3827b.f3475c, LoanCalculator.class);
            bundle = new Bundle();
            bundle.putString("fromWhere", "tools");
            bundle.putString("account", this.f3827b.f3473a);
            bundle.putString("title", this.f3826a[6]);
            intent.putExtras(bundle);
            this.f3827b.startActivity(intent);
        }
    }
}
