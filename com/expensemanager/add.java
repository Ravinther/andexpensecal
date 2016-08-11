package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

class add implements OnClickListener {
    final /* synthetic */ NoteList f3946a;

    add(NoteList noteList) {
        this.f3946a = noteList;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f3946a.f3541d, NoteAdd.class);
        Bundle bundle = new Bundle();
        bundle.putInt("count", this.f3946a.f3545h);
        intent.putExtras(bundle);
        this.f3946a.startActivityForResult(intent, 0);
    }
}
