package com.expensemanager.calculator;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;

/* renamed from: com.expensemanager.calculator.g */
class C0404g implements OnClickListener, OnKeyListener, OnLongClickListener {
    private static final char[] f4312b;
    C0405h f4313a;

    static {
        f4312b = new char[]{'='};
    }

    C0404g() {
    }

    void m3905a(C0405h c0405h) {
        this.f4313a = c0405h;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case 2131558444:
                this.f4313a.m3918d();
            case 2131558447:
                this.f4313a.m3917c();
            case 2131558448:
                this.f4313a.m3915b();
                Calculator.f4281b = this.f4313a.f4314a.getText().toString();
            case 2131558449:
                this.f4313a.m3918d();
                this.f4313a.m3919e();
                Calculator.f4281b = "";
            default:
                if (view instanceof Button) {
                    String charSequence = ((Button) view).getText().toString();
                    if (charSequence.length() >= 2) {
                        charSequence = charSequence + '(';
                    }
                    this.f4313a.m3913a(charSequence);
                    Calculator.f4281b = this.f4313a.f4314a.getText().toString();
                }
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean z = true;
        int action = keyEvent.getAction();
        if (i == 21 || i == 22) {
            C0405h c0405h = this.f4313a;
            if (i != 21) {
                z = false;
            }
            return c0405h.m3914a(z);
        } else if (action == 2 && i == 0) {
            return true;
        } else {
            if (keyEvent.getMatch(f4312b, keyEvent.getMetaState()) == '=') {
                if (action != 1) {
                    return true;
                }
                this.f4313a.m3918d();
                return true;
            } else if (i != 23 && i != 19 && i != 20 && i != 66) {
                return false;
            } else {
                if (action != 1) {
                    return true;
                }
                switch (i) {
                    case 23:
                    case 66:
                        this.f4313a.m3918d();
                        return true;
                    default:
                        return true;
                }
            }
        }
    }

    public boolean onLongClick(View view) {
        if (view.getId() != 2131558448) {
            return false;
        }
        this.f4313a.m3917c();
        return true;
    }
}
