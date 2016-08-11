package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

class ahn implements OnClickListener {
    final /* synthetic */ TagList f4131a;

    ahn(TagList tagList) {
        this.f4131a = tagList;
    }

    public void onClick(View view) {
        SparseBooleanArray checkedItemPositions = this.f4131a.f3642a.getCheckedItemPositions();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f4131a.f3643b.size(); i++) {
            if (checkedItemPositions.get(i)) {
                arrayList.add(this.f4131a.f3643b.get(i));
            }
        }
        String a = aib.m3857a(arrayList, ",");
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("tag", a);
        intent.putExtras(bundle);
        this.f4131a.setResult(-1, intent);
        this.f4131a.finish();
    }
}
