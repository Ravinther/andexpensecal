package p007b.p008a.p012b;

import java.util.Stack;

/* renamed from: b.a.b.aq */
abstract class aq extends at {
    private at[] f828a;

    public aq() {
        this.f828a = new at[0];
    }

    protected void m1178a(at atVar) {
        atVar.m1171b(this);
        Object obj = new at[(this.f828a.length + 1)];
        System.arraycopy(this.f828a, 0, obj, 0, this.f828a.length);
        obj[this.f828a.length] = atVar;
        this.f828a = obj;
    }

    public abstract void m1179a(Stack stack);

    abstract int d_();

    protected void m1180e() {
        for (at i : this.f828a) {
            i.m1175i();
        }
    }

    protected at[] m1181f() {
        return this.f828a;
    }
}
