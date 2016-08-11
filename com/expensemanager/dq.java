package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class dq implements OnClickListener {
    final /* synthetic */ DebtAddEdit f4490a;

    dq(DebtAddEdit debtAddEdit) {
        this.f4490a = debtAddEdit;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f4490a.f2654a, TagList.class);
        Bundle bundle = new Bundle();
        bundle.putString("tag", this.f4490a.f2669p.getText().toString());
        intent.putExtras(bundle);
        this.f4490a.startActivityForResult(intent, 9);
    }
}
