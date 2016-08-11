package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;

@id
public final class ge extends FrameLayout implements OnClickListener {
    private final Activity f6650a;
    private final ImageButton f6651b;

    public ge(Activity activity, int i) {
        super(activity);
        this.f6650a = activity;
        setOnClickListener(this);
        this.f6651b = new ImageButton(activity);
        this.f6651b.setImageResource(17301527);
        this.f6651b.setBackgroundColor(0);
        this.f6651b.setOnClickListener(this);
        this.f6651b.setPadding(0, 0, 0, 0);
        this.f6651b.setContentDescription("Interstitial close button");
        int a = lx.m6056a((Context) activity, i);
        addView(this.f6651b, new LayoutParams(a, a, 17));
    }

    public void m5590a(boolean z) {
        this.f6651b.setVisibility(z ? 4 : 0);
    }

    public void onClick(View view) {
        this.f6650a.finish();
    }
}
