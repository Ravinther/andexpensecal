package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

class abw implements OnClickListener {
    final /* synthetic */ Button f3871a;
    final /* synthetic */ GoogleDrive f3872b;

    abw(GoogleDrive googleDrive, Button button) {
        this.f3872b = googleDrive;
        this.f3871a = button;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f3872b.f3483h, GoogleDriveDownloadList.class);
        Bundle bundle = new Bundle();
        bundle.putString("DIR", this.f3871a.getText().toString());
        bundle.putString("FILE_TYPE", "db");
        intent.putExtras(bundle);
        this.f3872b.startActivity(intent);
    }
}
