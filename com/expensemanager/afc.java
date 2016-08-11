package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

class afc implements OnClickListener {
    final /* synthetic */ String f4037a;
    final /* synthetic */ int f4038b;
    final /* synthetic */ Map f4039c;
    final /* synthetic */ afb f4040d;

    afc(afb com_expensemanager_afb, String str, int i, Map map) {
        this.f4040d = com_expensemanager_afb;
        this.f4037a = str;
        this.f4038b = i;
        this.f4039c = map;
    }

    public void onClick(View view) {
        String string = this.f4040d.f4035b.f3579a.getResources().getString(2131099860);
        String string2 = this.f4040d.f4035b.f3579a.getResources().getString(2131100090);
        String string3 = this.f4040d.f4035b.f3579a.getResources().getString(2131100163);
        Builder builder = new Builder(this.f4040d.f4035b.f3579a);
        builder.setTitle(this.f4040d.f4034a.getResources().getString(2131100092) + ": " + this.f4037a);
        builder.setItems(new String[]{string, string2, string3}, new afd(this));
        builder.show();
    }
}
