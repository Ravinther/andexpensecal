package com.expensemanager;

import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;

class adn implements OnClickListener {
    final /* synthetic */ String f3972a;
    final /* synthetic */ PinReset f3973b;

    adn(PinReset pinReset, String str) {
        this.f3973b = pinReset;
        this.f3972a = str;
    }

    public void onClick(View view) {
        String obj = this.f3973b.f3550a.getText().toString();
        String obj2 = this.f3973b.f3551b.getText().toString();
        String trim = this.f3973b.f3553d.getText().toString().trim();
        if ((trim == null || !trim.equalsIgnoreCase(this.f3972a)) && !"reset".equalsIgnoreCase(trim)) {
            aib.m3849a(this.f3973b.f3554e, null, "Reset PIN?", 17301543, "You answer to security question is not correct. Please try again.", "OK", null, null, null).show();
        } else if (obj == null || obj.length() < 4) {
            aib.m3849a(this.f3973b.f3554e, null, "Reset PIN?", 17301543, "PIN must be at least 4 characters", "OK", null, null, null).show();
        } else if (obj == null || !obj.equals(obj2)) {
            aib.m3849a(this.f3973b.f3554e, null, "Reset PIN?", 17301543, "PINs don't match", "OK", null, null, null).show();
        } else {
            Editor edit = this.f3973b.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).edit();
            edit.putString("NEW_PIN", C0445f.m4101a(obj));
            edit.commit();
            this.f3973b.m3519a();
        }
    }
}
