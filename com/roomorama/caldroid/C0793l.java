package com.roomorama.caldroid;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/* renamed from: com.roomorama.caldroid.l */
public class C0793l extends ArrayAdapter<String> {
    public static int f7775a;

    static {
        f7775a = -3355444;
    }

    public C0793l(Context context, int i, List<String> list) {
        super(context, i, list);
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) super.getView(i, view, viewGroup);
        if (((String) getItem(i)).length() <= 3) {
            textView.setTextSize(2, 12.0f);
        } else {
            textView.setTextSize(2, 11.0f);
        }
        textView.setTextColor(f7775a);
        textView.setGravity(17);
        return textView;
    }

    public boolean isEnabled(int i) {
        return false;
    }
}
