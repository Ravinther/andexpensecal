package com.expensemanager;

import android.view.View;
import android.view.View.OnClickListener;

class adf implements OnClickListener {
    final /* synthetic */ NoteList f3948a;

    adf(NoteList noteList) {
        this.f3948a = noteList;
    }

    public void onClick(View view) {
        if (this.f3948a.getResources().getString(2131100094).equals(this.f3948a.f3540c.getText())) {
            this.f3948a.f3540c.setText(2131100065);
            this.f3948a.f3544g = true;
            this.f3948a.f3546i.notifyDataSetChanged();
            return;
        }
        this.f3948a.f3540c.setText(2131100094);
        this.f3948a.f3544g = false;
        this.f3948a.f3546i.notifyDataSetChanged();
        this.f3948a.m3510a(this.f3948a.f3542e);
    }
}
