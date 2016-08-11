package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import java.util.List;
import java.util.Map;

class ms implements OnChildClickListener {
    final /* synthetic */ ExpenseCategoryExpandableList f4987a;

    ms(ExpenseCategoryExpandableList expenseCategoryExpandableList) {
        this.f4987a = expenseCategoryExpandableList;
    }

    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        String str = (String) ((Map) this.f4987a.f2991c.get(i)).get(this.f4987a.f2993e);
        String str2 = str + ":" + ((String) ((Map) ((List) this.f4987a.f2992d.get(i)).get(i2)).get("SUBCATEGORY"));
        if ("settings".equals(this.f4987a.getIntent().getStringExtra("fromWhere"))) {
            Intent intent = new Intent(this.f4987a.f2995g, ExpenseGroupAddEdit.class);
            Bundle bundle = new Bundle();
            bundle.putString("category", str);
            intent.putExtras(bundle);
            this.f4987a.startActivityForResult(intent, 1);
        } else {
            Bundle bundle2 = new Bundle();
            Intent intent2 = new Intent();
            bundle2.putString("category", str2);
            intent2.putExtras(bundle2);
            this.f4987a.setResult(-1, intent2);
            this.f4987a.finish();
        }
        return false;
    }
}
