package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class ahm implements OnClickListener {
    final /* synthetic */ TagList f4130a;

    ahm(TagList tagList) {
        this.f4130a = tagList;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("tag", "");
        intent.putExtras(bundle);
        this.f4130a.setResult(-1, intent);
        this.f4130a.finish();
    }
}
