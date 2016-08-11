package com.expensemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

class abh implements OnClickListener {
    final /* synthetic */ Button f3833a;
    final /* synthetic */ GoogleDrive f3834b;

    abh(GoogleDrive googleDrive, Button button) {
        this.f3834b = googleDrive;
        this.f3833a = button;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f3834b.f3483h, GoogleDriveDownloadList.class);
        Bundle bundle = new Bundle();
        bundle.putString("DIR", this.f3833a.getText().toString());
        bundle.putString("FILE_TYPE", "csv");
        intent.putExtras(bundle);
        this.f3834b.startActivity(intent);
    }
}
