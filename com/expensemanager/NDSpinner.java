package com.expensemanager;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

public class NDSpinner extends Spinner {
    OnItemSelectedListener f3529a;

    public NDSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.f3529a = onItemSelectedListener;
    }

    public void setSelection(int i) {
        super.setSelection(i);
        if (this.f3529a != null && i == getSelectedItemPosition()) {
            this.f3529a.onItemSelected(null, null, i, 0);
        }
    }
}
