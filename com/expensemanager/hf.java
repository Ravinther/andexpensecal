package com.expensemanager;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnLongClickListener;

class hf implements OnLongClickListener {
    final /* synthetic */ hd f4729a;

    hf(hd hdVar) {
        this.f4729a = hdVar;
    }

    public boolean onLongClick(View view) {
        CharSequence[] charSequenceArr = new CharSequence[]{this.f4729a.f4725a.getResources().getString(2131099860)};
        int id = view.getId();
        Builder builder = new Builder(this.f4729a.f4725a);
        builder.setTitle(this.f4729a.f4726b.f2761g[id]);
        builder.setItems(charSequenceArr, new hg(this, id));
        builder.show();
        return true;
    }
}
