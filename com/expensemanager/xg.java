package com.expensemanager;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

class xg implements OnClickListener {
    final /* synthetic */ SharedPreferences f5439a;
    final /* synthetic */ TextView f5440b;
    final /* synthetic */ LinearLayout f5441c;
    final /* synthetic */ ExpenseNewTransaction f5442d;

    xg(ExpenseNewTransaction expenseNewTransaction, SharedPreferences sharedPreferences, TextView textView, LinearLayout linearLayout) {
        this.f5442d = expenseNewTransaction;
        this.f5439a = sharedPreferences;
        this.f5440b = textView;
        this.f5441c = linearLayout;
    }

    public void onClick(View view) {
        Editor edit = this.f5439a.edit();
        if (this.f5440b.getText().toString().equals(this.f5442d.getResources().getString(2131099918))) {
            this.f5440b.setText(this.f5442d.getResources().getString(2131099966));
            this.f5441c.setVisibility(8);
            edit.putBoolean(this.f5442d.f3357x + "_isOption", false);
        } else {
            this.f5440b.setText(this.f5442d.getResources().getString(2131099918));
            this.f5441c.setVisibility(0);
            edit.putBoolean(this.f5442d.f3357x + "_isOption", true);
        }
        edit.commit();
    }
}
