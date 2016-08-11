package com.expensemanager;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;

final class ho implements OnClickListener {
    final /* synthetic */ SharedPreferences f4751a;
    final /* synthetic */ int f4752b;
    final /* synthetic */ Dialog f4753c;

    ho(SharedPreferences sharedPreferences, int i, Dialog dialog) {
        this.f4751a = sharedPreferences;
        this.f4752b = i;
        this.f4753c = dialog;
    }

    public void onClick(View view) {
        Editor edit = this.f4751a.edit();
        edit.putInt("versionCode", this.f4752b);
        edit.commit();
        this.f4753c.dismiss();
    }
}
