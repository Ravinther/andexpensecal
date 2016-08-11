package com.google.android.gms.internal;

import java.util.LinkedList;
import java.util.List;

@id
public class ab {
    private final Object f6194a;
    private int f6195b;
    private List<aa> f6196c;

    public ab() {
        this.f6194a = new Object();
        this.f6196c = new LinkedList();
    }

    public aa m5011a() {
        aa aaVar = null;
        synchronized (this.f6194a) {
            if (this.f6196c.size() == 0) {
                ly.m6065a("Queue empty");
                return null;
            } else if (this.f6196c.size() >= 2) {
                int i = Integer.MIN_VALUE;
                for (aa aaVar2 : this.f6196c) {
                    aa aaVar3;
                    int i2;
                    int g = aaVar2.m5009g();
                    if (g > i) {
                        int i3 = g;
                        aaVar3 = aaVar2;
                        i2 = i3;
                    } else {
                        i2 = i;
                        aaVar3 = aaVar;
                    }
                    i = i2;
                    aaVar = aaVar3;
                }
                this.f6196c.remove(aaVar);
                return aaVar;
            } else {
                aaVar2 = (aa) this.f6196c.get(0);
                aaVar2.m5005c();
                return aaVar2;
            }
        }
    }

    public boolean m5012a(aa aaVar) {
        boolean z;
        synchronized (this.f6194a) {
            if (this.f6196c.contains(aaVar)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean m5013b(aa aaVar) {
        boolean z;
        synchronized (this.f6194a) {
            for (aa aaVar2 : this.f6196c) {
                if (aaVar != aaVar2 && aaVar2.m5003b().equals(aaVar.m5003b())) {
                    this.f6196c.remove(aaVar);
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return z;
    }

    public void m5014c(aa aaVar) {
        synchronized (this.f6194a) {
            if (this.f6196c.size() >= 10) {
                ly.m6065a("Queue is full, current size = " + this.f6196c.size());
                this.f6196c.remove(0);
            }
            int i = this.f6195b;
            this.f6195b = i + 1;
            aaVar.m5000a(i);
            this.f6196c.add(aaVar);
        }
    }
}
