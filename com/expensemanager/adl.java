package com.expensemanager;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

class adl extends Dialog implements OnClickListener {
    private ImageButton f3955a;
    private Button f3956b;
    private EditText f3957c;
    private TextView f3958d;
    private Context f3959e;
    private Button f3960f;
    private Button f3961g;
    private Button f3962h;
    private Button f3963i;
    private Button f3964j;
    private Button f3965k;
    private Button f3966l;
    private Button f3967m;
    private Button f3968n;
    private Button f3969o;
    private ImageView f3970p;

    public adl(Context context) {
        super(context);
        this.f3959e = context;
    }

    private boolean m3837a() {
        String string = this.f3959e.getSharedPreferences("MY_PORTFOLIO_TITLES", 0).getString("NEW_PIN", null);
        if (string == null) {
            return true;
        }
        string = C0445f.m4106b(string);
        String obj = this.f3957c.getText().toString();
        if (string != null && string.equalsIgnoreCase(obj)) {
            return true;
        }
        this.f3958d.setVisibility(0);
        this.f3957c.setText(null);
        return false;
    }

    public void onBackPressed() {
        if (!isShowing()) {
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case 2131558506:
                cancel();
            case 2131558507:
                if (m3837a()) {
                    dismiss();
                }
            case 2131558962:
                if (this.f3957c.getSelectionStart() > 0) {
                    this.f3957c.getText().delete(this.f3957c.getSelectionStart() - 1, this.f3957c.getSelectionEnd());
                }
            case 2131558964:
                this.f3959e.startActivity(new Intent(this.f3959e, PinReset.class));
            default:
                CharSequence charSequence = ((Button) view).getText().toString();
                this.f3957c.getText().insert(this.f3957c.getSelectionStart(), charSequence);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2130903138);
        this.f3955a = (ImageButton) findViewById(2131558507);
        this.f3956b = (Button) findViewById(2131558964);
        this.f3957c = (EditText) findViewById(2131558961);
        this.f3958d = (TextView) findViewById(2131558960);
        this.f3955a.setOnClickListener(this);
        this.f3956b.setOnClickListener(this);
        this.f3960f = (Button) findViewById(2131558442);
        this.f3961g = (Button) findViewById(2131558438);
        this.f3962h = (Button) findViewById(2131558439);
        this.f3963i = (Button) findViewById(2131558440);
        this.f3964j = (Button) findViewById(2131558434);
        this.f3965k = (Button) findViewById(2131558435);
        this.f3966l = (Button) findViewById(2131558436);
        this.f3967m = (Button) findViewById(2131558430);
        this.f3968n = (Button) findViewById(2131558431);
        this.f3969o = (Button) findViewById(2131558432);
        this.f3960f.setOnClickListener(this);
        this.f3961g.setOnClickListener(this);
        this.f3962h.setOnClickListener(this);
        this.f3963i.setOnClickListener(this);
        this.f3964j.setOnClickListener(this);
        this.f3965k.setOnClickListener(this);
        this.f3966l.setOnClickListener(this);
        this.f3967m.setOnClickListener(this);
        this.f3968n.setOnClickListener(this);
        this.f3969o.setOnClickListener(this);
        this.f3970p = (ImageView) findViewById(2131558962);
        this.f3970p.setOnClickListener(this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 84 || i == 3) {
            return true;
        }
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        cancel();
        return true;
    }
}
