package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class vm implements OnClickListener {
    final /* synthetic */ ExpenseMileageNewEdit f5373a;

    vm(ExpenseMileageNewEdit expenseMileageNewEdit) {
        this.f5373a = expenseMileageNewEdit;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f5373a.f3268a, TagList.class);
        Bundle bundle = new Bundle();
        bundle.putString("tag", this.f5373a.f3281n.getText().toString());
        intent.putExtras(bundle);
        this.f5373a.startActivityForResult(intent, 7);
    }
}
