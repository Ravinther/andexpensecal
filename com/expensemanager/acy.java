package com.expensemanager;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class acy implements OnClickListener {
    final /* synthetic */ NoteAdd f3939a;

    acy(NoteAdd noteAdd) {
        this.f3939a = noteAdd;
    }

    public void onClick(View view) {
        this.f3939a.setResult(0, new Intent());
        this.f3939a.finish();
    }
}
