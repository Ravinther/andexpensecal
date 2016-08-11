package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.Map;

class ade implements OnItemClickListener {
    final /* synthetic */ NoteList f3947a;

    ade(NoteList noteList) {
        this.f3947a = noteList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Map map = (Map) adapterView.getItemAtPosition(i);
        Intent intent = new Intent(this.f3947a.f3541d, NoteAdd.class);
        Bundle bundle = new Bundle();
        bundle.putInt("count", this.f3947a.f3545h);
        bundle.putString("rowId", (String) map.get("rowId"));
        bundle.putString("where", "edit");
        intent.putExtras(bundle);
        this.f3947a.startActivityForResult(intent, 0);
    }
}
