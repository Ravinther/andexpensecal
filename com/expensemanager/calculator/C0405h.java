package com.expensemanager.calculator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import com.expensemanager.ExpenseNewTransaction;
import com.expensemanager.aba;

/* renamed from: com.expensemanager.calculator.h */
class C0405h {
    CalculatorDisplay f4314a;
    private String f4315b;
    private boolean f4316c;
    private Context f4317d;
    private final String f4318e;

    C0405h(Context context, CalculatorDisplay calculatorDisplay, Button button) {
        this.f4315b = "";
        this.f4316c = false;
        this.f4318e = context.getResources().getString(2131099879);
        this.f4314a = calculatorDisplay;
        this.f4314a.setLogic(this);
        this.f4317d = context;
    }

    private void m3906a(CharSequence charSequence) {
        this.f4314a.m3897a(charSequence, C0399b.UP);
    }

    static boolean m3907a(char c) {
        return "+-\u00d7\u00f7/*".indexOf(c) != -1;
    }

    private void m3908b(boolean z) {
        this.f4314a.m3897a("", z ? C0399b.UP : C0399b.NONE);
        m3911a();
        Calculator.f4281b = "";
    }

    static boolean m3909c(String str) {
        return str.length() == 1 && C0405h.m3907a(str.charAt(0));
    }

    private String m3910f() {
        return this.f4314a.getText().toString();
    }

    void m3911a() {
        this.f4315b = "";
        this.f4316c = false;
    }

    void m3912a(int i) {
    }

    void m3913a(String str) {
        this.f4314a.m3898a(str);
    }

    boolean m3914a(boolean z) {
        EditText editText = this.f4314a.getEditText();
        int selectionStart = editText.getSelectionStart();
        return z ? selectionStart == 0 : selectionStart >= editText.length();
    }

    void m3915b() {
        if (m3910f().equals(this.f4315b) || this.f4316c) {
            m3908b(false);
            return;
        }
        this.f4314a.dispatchKeyEvent(new KeyEvent(0, 67));
        this.f4315b = "";
    }

    boolean m3916b(String str) {
        String f = m3910f();
        return (this.f4316c || (this.f4315b.equals(f) && !C0405h.m3909c(str) && this.f4314a.getSelectionStart() == f.length())) ? false : true;
    }

    void m3917c() {
        m3908b(false);
    }

    void m3918d() {
        String replaceAll = m3910f().replaceAll(",", "");
        if (replaceAll.indexOf("%") != -1) {
            replaceAll = replaceAll.replaceAll("%", "*0.01");
        }
        if (!replaceAll.equals(this.f4315b)) {
            try {
                char[] cArr = new char[]{'*', '/'};
                char[] cArr2 = new char[]{'\u00d7', '\u00f7'};
                int length = cArr2.length - 1;
                while (length >= 0) {
                    String replace = replaceAll.replace(cArr2[length], cArr[length]);
                    length--;
                    replaceAll = replace;
                }
                double a = new C0406i().m3924a(replaceAll);
                if (a >= 0.0d) {
                    this.f4315b = aba.m3746a(a);
                } else {
                    this.f4315b = "-" + aba.m3746a(Math.abs(a));
                }
            } catch (Exception e) {
                this.f4316c = true;
                this.f4315b = this.f4318e;
            }
            if (!replaceAll.equals(this.f4315b)) {
                m3906a(this.f4315b);
                Calculator.f4281b = this.f4315b;
            }
        }
    }

    void m3919e() {
        String stringExtra = ((Activity) this.f4317d).getIntent().getStringExtra("fromWhere");
        Intent intent = new Intent(this.f4317d, ExpenseNewTransaction.class);
        Bundle bundle = new Bundle();
        bundle.putString("fromWhere", stringExtra);
        bundle.putString("amount", this.f4314a.getText().toString().replaceAll(",", ""));
        bundle.putString("account", ((Activity) this.f4317d).getIntent().getStringExtra("account"));
        intent.putExtras(bundle);
        if ("tools".equalsIgnoreCase(stringExtra)) {
            ((Activity) this.f4317d).startActivity(intent);
            return;
        }
        ((Activity) this.f4317d).setResult(-1, intent);
        ((Activity) this.f4317d).finish();
    }
}
