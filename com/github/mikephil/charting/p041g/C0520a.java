package com.github.mikephil.charting.p041g;

import android.graphics.Paint;
import android.graphics.Paint.Style;
import com.github.mikephil.charting.p039h.C0542h;
import com.github.mikephil.charting.p039h.C0545l;

/* renamed from: com.github.mikephil.charting.g.a */
public abstract class C0520a extends C0519i {
    protected C0542h f5845a;
    protected Paint f5846b;
    protected Paint f5847c;
    protected Paint f5848d;
    protected Paint f5849e;

    public C0520a(C0545l c0545l, C0542h c0542h) {
        super(c0545l);
        this.f5845a = c0542h;
        this.f5847c = new Paint(1);
        this.f5846b = new Paint();
        this.f5846b.setColor(-7829368);
        this.f5846b.setStrokeWidth(1.0f);
        this.f5846b.setStyle(Style.STROKE);
        this.f5846b.setAlpha(90);
        this.f5848d = new Paint();
        this.f5848d.setColor(-16777216);
        this.f5848d.setStrokeWidth(1.0f);
        this.f5848d.setStyle(Style.STROKE);
        this.f5849e = new Paint(1);
        this.f5849e.setStyle(Style.STROKE);
    }

    public Paint m4588a() {
        return this.f5847c;
    }
}
