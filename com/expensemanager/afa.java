package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import java.util.List;

class afa implements OnClickListener {
    final /* synthetic */ List f4032a;
    final /* synthetic */ SMSMain f4033b;

    afa(SMSMain sMSMain, List list) {
        this.f4033b = sMSMain;
        this.f4032a = list;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this.f4033b.f3579a, SMSAddEdit.class);
        Bundle bundle = new Bundle();
        bundle.putString("sender_no", (String) this.f4032a.get(i));
        bundle.putBoolean("isEdit", false);
        intent.putExtras(bundle);
        this.f4033b.startActivityForResult(intent, 0);
    }
}
