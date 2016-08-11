package com.expensemanager.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends Activity {
    static String f4281b;
    C0404g f4282a;
    private CalculatorDisplay f4283c;
    private C0405h f4284d;

    static {
        f4281b = "";
    }

    public Calculator() {
        this.f4282a = new C0404g();
    }

    public void m3894a(TextView textView) {
        float textSize = textView.getTextSize();
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        textView.setTextSize(0, textSize * (((float) Math.min(defaultDisplay.getWidth(), defaultDisplay.getHeight())) / 320.0f));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(2130903047);
        this.f4283c = (CalculatorDisplay) findViewById(2131558428);
        this.f4284d = new C0405h(this, this.f4283c, (Button) findViewById(2131558444));
        this.f4282a.m3905a(this.f4284d);
        this.f4283c.setOnKeyListener(this.f4282a);
        this.f4283c.m3897a(f4281b, C0399b.UP);
        View findViewById = findViewById(2131558448);
        if (findViewById != null) {
            findViewById.setOnLongClickListener(this.f4282a);
        }
    }
}
