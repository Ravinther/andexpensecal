package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

class abi implements OnClickListener {
    final /* synthetic */ Button f3835a;
    final /* synthetic */ GoogleDrive f3836b;

    abi(GoogleDrive googleDrive, Button button) {
        this.f3836b = googleDrive;
        this.f3835a = button;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f3836b.f3483h, GoogleDriveDownloadList.class);
        Bundle bundle = new Bundle();
        bundle.putString("DIR", this.f3835a.getText().toString());
        bundle.putString("FILE_TYPE", "jpg");
        intent.putExtras(bundle);
        this.f3836b.startActivity(intent);
    }
}
