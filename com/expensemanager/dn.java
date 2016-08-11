package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Spinner;

class dn implements OnClickListener {
    final /* synthetic */ Spinner f4482a;
    final /* synthetic */ Spinner f4483b;
    final /* synthetic */ Spinner f4484c;
    final /* synthetic */ Spinner f4485d;
    final /* synthetic */ DateSettings f4486e;

    dn(DateSettings dateSettings, Spinner spinner, Spinner spinner2, Spinner spinner3, Spinner spinner4) {
        this.f4486e = dateSettings;
        this.f4482a = spinner;
        this.f4483b = spinner2;
        this.f4484c = spinner3;
        this.f4485d = spinner4;
    }

    public void onClick(View view) {
        int selectedItemPosition = this.f4482a.getSelectedItemPosition() + 1;
        ExpenseManager.f3242r = selectedItemPosition;
        int selectedItemPosition2 = this.f4483b.getSelectedItemPosition() + 1;
        ExpenseManager.f3243s = selectedItemPosition2;
        int selectedItemPosition3 = this.f4484c.getSelectedItemPosition();
        ExpenseManager.f3241q = selectedItemPosition3;
        String substring = ((String) this.f4485d.getSelectedItem()).trim().substring(0, 10);
        ExpenseManager.f3244t = substring;
        abd.m3811a(this.f4486e.f2651a, this.f4486e.f2653c, "expense_preference", "firstDayOfWeek", "" + selectedItemPosition2);
        abd.m3811a(this.f4486e.f2651a, this.f4486e.f2653c, "expense_preference", "firstDayOfMonth", "" + selectedItemPosition);
        abd.m3811a(this.f4486e.f2651a, this.f4486e.f2653c, "expense_preference", "DATE_FORMAT", substring);
        abd.m3811a(this.f4486e.f2651a, this.f4486e.f2653c, "expense_preference", "firstMonthOfYear", "" + selectedItemPosition3);
        this.f4486e.setResult(-1, new Intent(this.f4486e.f2651a, Settings.class));
        this.f4486e.finish();
    }
}
