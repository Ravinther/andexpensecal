package com.expensemanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Map;

class afb extends BaseAdapter {
    Context f4034a;
    final /* synthetic */ SMSMain f4035b;
    private LayoutInflater f4036c;

    public afb(SMSMain sMSMain, Context context) {
        this.f4035b = sMSMain;
        this.f4036c = LayoutInflater.from(context);
        this.f4034a = context;
    }

    public int getCount() {
        return this.f4035b.f3580b.size();
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = this.f4036c.inflate(2130903154, null);
        TextView textView = (TextView) inflate.findViewById(2131558423);
        TextView textView2 = (TextView) inflate.findViewById(2131558421);
        TextView textView3 = (TextView) inflate.findViewById(2131558424);
        TextView textView4 = (TextView) inflate.findViewById(2131558422);
        TextView textView5 = (TextView) inflate.findViewById(2131558425);
        TextView textView6 = (TextView) inflate.findViewById(2131558426);
        textView3.setVisibility(8);
        textView4.setVisibility(8);
        textView5.setVisibility(8);
        textView6.setVisibility(8);
        TextView textView7 = (TextView) inflate.findViewById(2131558992);
        String str = (String) this.f4035b.f3580b.get(i);
        Map a = SMSMain.m3545a(this.f4035b.f3579a, this.f4035b.f3581c, str);
        textView.setText(this.f4034a.getResources().getString(2131100092) + ": " + str);
        textView2.setText(this.f4034a.getResources().getString(2131099678) + ": " + ((String) a.get("account")));
        textView3.setText(this.f4034a.getResources().getString(2131099755) + ": " + ((String) a.get("category")));
        textView4.setText(this.f4034a.getResources().getString(2131100011) + ": " + ((String) a.get("paymentMethod")));
        textView5.setText(this.f4034a.getResources().getString(2131100101) + ": " + ((String) a.get("status")));
        textView6.setText(this.f4034a.getResources().getString(2131100039) + ": " + ((String) a.get("referenceNumber")));
        textView7.setText((CharSequence) a.get("body"));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(2131558643);
        linearLayout.setId(i);
        linearLayout.setOnClickListener(new afc(this, str, i, a));
        return inflate;
    }
}
