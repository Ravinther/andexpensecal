package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

class afl implements OnClickListener {
    final /* synthetic */ SharedPreferences f4049a;
    final /* synthetic */ Settings f4050b;

    afl(Settings settings, SharedPreferences sharedPreferences) {
        this.f4050b = settings;
        this.f4049a = sharedPreferences;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Editor edit = this.f4049a.edit();
        edit.putInt("LANGUAGE_ID", i);
        edit.commit();
    }
}
