package com.roomorama.caldroid;

import android.os.Bundle;
import android.support.v4.app.C0032l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.GridView;
import com.p028a.C0343e;

/* renamed from: com.roomorama.caldroid.j */
public class C0791j extends C0032l {
    private GridView f7770a;
    private C0419g f7771b;
    private OnItemClickListener f7772c;
    private OnItemLongClickListener f7773d;

    public View m7164a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f7770a = (GridView) layoutInflater.inflate(C0343e.date_grid_fragment, viewGroup, false);
        if (this.f7771b != null) {
            this.f7770a.setAdapter(this.f7771b);
        }
        if (this.f7772c != null) {
            this.f7770a.setOnItemClickListener(this.f7772c);
        }
        if (this.f7773d != null) {
            this.f7770a.setOnItemLongClickListener(this.f7773d);
        }
        return this.f7770a;
    }

    public void m7165a(OnItemClickListener onItemClickListener) {
        this.f7772c = onItemClickListener;
    }

    public void m7166a(OnItemLongClickListener onItemLongClickListener) {
        this.f7773d = onItemLongClickListener;
    }

    public void m7167a(C0419g c0419g) {
        this.f7771b = c0419g;
    }
}
