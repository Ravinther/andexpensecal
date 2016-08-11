package com.roomorama.caldroid;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import p000a.p001a.C0000a;

/* renamed from: com.roomorama.caldroid.c */
class C0786c implements OnItemLongClickListener {
    final /* synthetic */ C0421a f7761a;

    C0786c(C0421a c0421a) {
        this.f7761a = c0421a;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0000a c0000a = (C0000a) this.f7761a.aC.get(i);
        if (this.f7761a.aZ != null) {
            if (!this.f7761a.aL && ((this.f7761a.aA != null && c0000a.m23a(this.f7761a.aA)) || ((this.f7761a.aB != null && c0000a.m28b(this.f7761a.aB)) || (this.f7761a.ay != null && this.f7761a.ay.indexOf(c0000a) != -1)))) {
                return false;
            }
            this.f7761a.aZ.m3971b(C0790i.m7161a(c0000a), view);
        }
        return true;
    }
}
