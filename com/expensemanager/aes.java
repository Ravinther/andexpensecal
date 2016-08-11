package com.expensemanager;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.List;

class aes implements OnClickListener {
    final /* synthetic */ SMSAddEdit f4012a;

    aes(SMSAddEdit sMSAddEdit) {
        this.f4012a = sMSAddEdit;
    }

    public void onClick(View view) {
        List a = SMSMain.m3543a(this.f4012a.f3572l, this.f4012a.f3561a.replace("_1", "").replace("_2", ""));
        View listView = new ListView(this.f4012a.f3572l);
        listView.setAdapter(new ArrayAdapter(this.f4012a.f3572l, 17367043, a.toArray(new String[a.size()])));
        Dialog dialog = new Dialog(this.f4012a.f3572l);
        dialog.setTitle(2131100026);
        dialog.setContentView(listView);
        dialog.show();
        listView.setOnItemClickListener(new aet(this, dialog, a));
    }
}
