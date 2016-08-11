package com.expensemanager;

import android.text.Editable;
import android.text.TextWatcher;

class abk implements TextWatcher {
    final /* synthetic */ GoogleDrive f3840a;

    abk(GoogleDrive googleDrive) {
        this.f3840a = googleDrive;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String replace = this.f3840a.f3482f.getText().toString().toString().replace("\\", "/");
        if (replace.startsWith("/")) {
            this.f3840a.f3482f.setText("");
        }
        if (replace.split("/").length > 2 || (replace.split("/").length > 1 && replace.endsWith("/"))) {
            this.f3840a.f3482f.setText(replace.substring(0, replace.lastIndexOf("/")));
            this.f3840a.f3482f.setSelection(this.f3840a.f3482f.getText().length(), this.f3840a.f3482f.getText().length());
        }
    }
}
