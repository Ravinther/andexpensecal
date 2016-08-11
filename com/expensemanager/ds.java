package com.expensemanager;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

class ds implements OnClickListener {
    final /* synthetic */ SharedPreferences f4560a;
    final /* synthetic */ TextView f4561b;
    final /* synthetic */ LinearLayout f4562c;
    final /* synthetic */ DebtAddEdit f4563d;

    ds(DebtAddEdit debtAddEdit, SharedPreferences sharedPreferences, TextView textView, LinearLayout linearLayout) {
        this.f4563d = debtAddEdit;
        this.f4560a = sharedPreferences;
        this.f4561b = textView;
        this.f4562c = linearLayout;
    }

    public void onClick(View view) {
        Editor edit = this.f4560a.edit();
        if (this.f4561b.getText().toString().equals(this.f4563d.getResources().getString(2131099918))) {
            this.f4561b.setText(this.f4563d.getResources().getString(2131099966));
            this.f4562c.setVisibility(8);
            edit.putBoolean(this.f4563d.f2671r + "_isOption", false);
        } else {
            this.f4561b.setText(this.f4563d.getResources().getString(2131099918));
            this.f4562c.setVisibility(0);
            edit.putBoolean(this.f4563d.f2671r + "_isOption", true);
        }
        edit.commit();
    }
}
