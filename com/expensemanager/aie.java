package com.expensemanager;

import android.text.Editable;
import android.text.TextWatcher;
import java.text.DecimalFormat;
import java.util.Locale;

final class aie implements TextWatcher {
    boolean f4144a;

    aie() {
    }

    public void afterTextChanged(Editable editable) {
        if (!this.f4144a) {
            this.f4144a = true;
            try {
                String replaceAll = editable.toString().replaceAll(",", "");
                if (replaceAll.startsWith(".") || replaceAll.equals("-")) {
                    this.f4144a = false;
                    return;
                }
                CharSequence format;
                String str = "";
                DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance(Locale.US);
                if (replaceAll.indexOf(".") == -1) {
                    format = decimalFormat.format(Double.parseDouble(replaceAll));
                } else if (replaceAll.endsWith(".")) {
                    format = decimalFormat.format(Double.parseDouble(replaceAll)) + ".";
                } else {
                    String substring = replaceAll.substring(0, replaceAll.indexOf("."));
                    format = decimalFormat.format(Double.parseDouble(substring)) + "." + replaceAll.substring(replaceAll.indexOf(".") + 1);
                }
                editable.replace(0, editable.length(), format);
                this.f4144a = false;
            } catch (NumberFormatException e) {
                editable.clear();
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
