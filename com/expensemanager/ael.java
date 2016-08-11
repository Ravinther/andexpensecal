package com.expensemanager;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

class ael implements OnClickListener {
    final /* synthetic */ SharedPreferences f4000a;
    final /* synthetic */ TextView f4001b;
    final /* synthetic */ LinearLayout f4002c;
    final /* synthetic */ SMSAddEdit f4003d;

    ael(SMSAddEdit sMSAddEdit, SharedPreferences sharedPreferences, TextView textView, LinearLayout linearLayout) {
        this.f4003d = sMSAddEdit;
        this.f4000a = sharedPreferences;
        this.f4001b = textView;
        this.f4002c = linearLayout;
    }

    public void onClick(View view) {
        Editor edit = this.f4000a.edit();
        if (this.f4001b.getText().toString().equals(this.f4003d.getResources().getString(2131099918))) {
            this.f4001b.setText(this.f4003d.getResources().getString(2131099966));
            this.f4002c.setVisibility(8);
            edit.putBoolean(this.f4003d.f3571k + "_isOption", false);
        } else {
            this.f4001b.setText(this.f4003d.getResources().getString(2131099918));
            this.f4002c.setVisibility(0);
            edit.putBoolean(this.f4003d.f3571k + "_isOption", true);
        }
        edit.commit();
    }
}
