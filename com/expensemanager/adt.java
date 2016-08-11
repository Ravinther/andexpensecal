package com.expensemanager;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

class adt implements OnClickListener {
    final /* synthetic */ ProEdition f3979a;

    adt(ProEdition proEdition) {
        this.f3979a = proEdition;
    }

    public void onClick(View view) {
        this.f3979a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://market.android.com/details?id=com.expensemanager.pro")));
    }
}
