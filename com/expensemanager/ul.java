package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class ul implements OnClickListener {
    final /* synthetic */ uc f5334a;

    ul(uc ucVar) {
        this.f5334a = ucVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5334a.m315i(), ExpenseBudgetList.class);
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5334a.f5323c);
        intent.putExtras(bundle);
        this.f5334a.m281a(intent, 0);
    }
}
