package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.expensemanager.caldroid.CaldroidActivity;

class up implements OnClickListener {
    final /* synthetic */ uc f5338a;

    up(uc ucVar) {
        this.f5338a = ucVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5338a.m315i(), CaldroidActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5338a.f5323c);
        intent.putExtras(bundle);
        this.f5338a.m281a(intent, 0);
    }
}
