package com.expensemanager.calculator;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Editable.Factory;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View.OnKeyListener;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class CalculatorDisplay extends ViewSwitcher {
    private static final char[] f4285e;
    TranslateAnimation f4286a;
    TranslateAnimation f4287b;
    TranslateAnimation f4288c;
    TranslateAnimation f4289d;
    private C0405h f4290f;
    private boolean f4291g;

    static {
        f4285e = "0123456789.+-*/\u2212\u00d7\u00f7()!%^".toCharArray();
    }

    public CalculatorDisplay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4291g = false;
    }

    private int m3895a(TextView textView) {
        return (int) (((float) ((textView.getWidth() - textView.getTotalPaddingLeft()) - textView.getTotalPaddingRight())) / (textView.getPaint().measureText("2222222222") / 10.0f));
    }

    void m3897a(CharSequence charSequence, C0399b c0399b) {
        if (getText().length() == 0) {
            c0399b = C0399b.NONE;
        }
        if (c0399b == C0399b.UP) {
            setInAnimation(this.f4286a);
            setOutAnimation(this.f4287b);
        } else if (c0399b == C0399b.DOWN) {
            setInAnimation(this.f4288c);
            setOutAnimation(this.f4289d);
        } else {
            setInAnimation(null);
            setOutAnimation(null);
        }
        EditText editText = (EditText) getNextView();
        editText.setText(charSequence);
        editText.setSelection(charSequence.length());
        showNext();
    }

    void m3898a(String str) {
        EditText editText = (EditText) getCurrentView();
        editText.getText().insert(editText.getSelectionStart(), str);
    }

    EditText getEditText() {
        return (EditText) getCurrentView();
    }

    int getSelectionStart() {
        return ((EditText) getCurrentView()).getSelectionStart();
    }

    Editable getText() {
        return ((EditText) getCurrentView()).getText();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        Calculator calculator = (Calculator) getContext();
        calculator.m3894a((TextView) getChildAt(0));
        calculator.m3894a((TextView) getChildAt(1));
    }

    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            requestFocus();
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f4291g) {
            this.f4290f.m3912a(m3895a((TextView) getCurrentView()));
            this.f4291g = true;
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f4286a = new TranslateAnimation(0.0f, 0.0f, (float) i2, 0.0f);
        this.f4286a.setDuration(500);
        this.f4287b = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-i2));
        this.f4287b.setDuration(500);
        this.f4288c = new TranslateAnimation(0.0f, 0.0f, (float) (-i2), 0.0f);
        this.f4288c.setDuration(500);
        this.f4289d = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) i2);
        this.f4289d.setDuration(500);
    }

    protected void setLogic(C0405h c0405h) {
        this.f4290f = c0405h;
        KeyListener c0398a = new C0398a(this);
        Factory c0402e = new C0402e(c0405h);
        for (int i = 0; i < 2; i++) {
            EditText editText = (EditText) getChildAt(i);
            editText.setBackgroundDrawable(null);
            editText.setEditableFactory(c0402e);
            editText.setKeyListener(c0398a);
        }
    }

    public void setOnKeyListener(OnKeyListener onKeyListener) {
        getChildAt(0).setOnKeyListener(onKeyListener);
        getChildAt(1).setOnKeyListener(onKeyListener);
    }

    void setSelection(int i) {
        ((EditText) getCurrentView()).setSelection(i);
    }
}
