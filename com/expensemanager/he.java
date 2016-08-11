package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class he implements OnClickListener {
    final /* synthetic */ hd f4728a;

    he(hd hdVar) {
        this.f4728a = hdVar;
    }

    public void onClick(View view) {
        this.f4728a.f4726b.f2760f = this.f4728a.f4726b.f2761g[view.getId()];
        Bundle bundle = new Bundle();
        Intent intent = new Intent();
        bundle.putString("account", this.f4728a.f4726b.f2760f);
        intent.putExtras(bundle);
        this.f4728a.f4726b.setResult(-1, intent);
        this.f4728a.f4726b.finish();
    }
}
