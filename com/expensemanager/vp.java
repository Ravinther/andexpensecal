package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class vp implements OnClickListener {
    final /* synthetic */ ExpenseMileageNewEdit f5377a;

    vp(ExpenseMileageNewEdit expenseMileageNewEdit) {
        this.f5377a = expenseMileageNewEdit;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("account", this.f5377a.f3287t);
        intent.putExtras(bundle);
        this.f5377a.setResult(0, intent);
        this.f5377a.finish();
    }
}
