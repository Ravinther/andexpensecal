package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class ahc implements OnItemClickListener {
    final /* synthetic */ SortableItemList f4115a;

    ahc(SortableItemList sortableItemList) {
        this.f4115a = sortableItemList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String stringExtra = this.f4115a.getIntent().getStringExtra("selected_item_key");
        String str = (String) this.f4115a.f3634d.get(i);
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString(stringExtra, str);
        intent.putExtras(bundle);
        this.f4115a.setResult(-1, intent);
        this.f4115a.finish();
    }
}
