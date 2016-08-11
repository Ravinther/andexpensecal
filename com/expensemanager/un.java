package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class un implements OnClickListener {
    final /* synthetic */ uc f5336a;

    un(uc ucVar) {
        this.f5336a = ucVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5336a.m315i(), ChartNewList.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5337a.f5323c);
        intent.putExtras(bundle);
        this.f5336a.m281a(intent, 0);
    }
}
