package com.roomorama.caldroid;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import p000a.p001a.C0000a;

/* renamed from: com.roomorama.caldroid.b */
class C0785b implements OnItemClickListener {
    final /* synthetic */ C0421a f7760a;

    C0785b(C0421a c0421a) {
        this.f7760a = c0421a;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0000a c0000a = (C0000a) this.f7760a.aC.get(i);
        if (this.f7760a.aZ != null) {
            if (!this.f7760a.aL) {
                if (this.f7760a.aA != null && c0000a.m23a(this.f7760a.aA)) {
                    return;
                }
                if (this.f7760a.aB != null && c0000a.m28b(this.f7760a.aB)) {
                    return;
                }
                if (!(this.f7760a.ay == null || this.f7760a.ay.indexOf(c0000a) == -1)) {
                    return;
                }
            }
            this.f7760a.aZ.m3970a(C0790i.m7161a(c0000a), view);
        }
    }
}
