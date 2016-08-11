package com.expensemanager;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

class aez implements OnClickListener {
    final /* synthetic */ SharedPreferences f4028a;
    final /* synthetic */ CheckBox f4029b;
    final /* synthetic */ SMSMain f4030c;

    aez(SMSMain sMSMain, SharedPreferences sharedPreferences, CheckBox checkBox) {
        this.f4030c = sMSMain;
        this.f4028a = sharedPreferences;
        this.f4029b = checkBox;
    }

    public void onClick(View view) {
        Editor edit = this.f4028a.edit();
        if (this.f4029b.isChecked()) {
            edit.putBoolean("SMS_AUTO", true);
        } else {
            edit.remove("SMS_AUTO");
        }
        edit.commit();
    }
}
