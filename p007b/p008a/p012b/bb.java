package p007b.p008a.p012b;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import p007b.C0287p;
import p007b.p013b.C0208c;

/* renamed from: b.a.b.bb */
class bb implements au {
    private static C0208c f866a;
    private String f867b;
    private String f868c;
    private at f869d;
    private Stack f870e;
    private C0287p f871f;
    private C0175t f872g;
    private p007b.p008a.bb f873h;
    private as f874i;

    static {
        f866a = C0208c.m1493a(bb.class);
    }

    public bb(String str, C0175t c0175t, p007b.p008a.bb bbVar, C0287p c0287p, as asVar) {
        this.f867b = str;
        this.f871f = c0287p;
        this.f872g = c0175t;
        this.f873h = bbVar;
        this.f874i = asVar;
    }

    private at m1271a(Iterator it) {
        at atVar;
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        at atVar2 = null;
        Object obj = null;
        Stack stack3 = null;
        while (it.hasNext() && obj == null) {
            Object obj2;
            Stack stack4;
            atVar = (at) it.next();
            atVar.m1169a(this.f874i);
            if (atVar instanceof ap) {
                m1272a((ap) atVar, stack);
                obj2 = obj;
                stack4 = stack3;
            } else if (atVar instanceof bc) {
                m1273a((bc) atVar, it, stack);
                obj2 = obj;
                stack4 = stack3;
            } else if (atVar instanceof aq) {
                aq b;
                r1 = (aq) atVar;
                if (r1 instanceof bd) {
                    bd bdVar = (bd) r1;
                    b = (stack.isEmpty() || (atVar2 instanceof aq)) ? bdVar.m1216b() : bdVar.m1213a();
                } else {
                    b = r1;
                }
                if (stack2.empty()) {
                    stack2.push(b);
                } else {
                    r1 = (aq) stack2.peek();
                    if (b.d_() < r1.d_()) {
                        stack2.push(b);
                    } else if (b.d_() == r1.d_() && (b instanceof bl)) {
                        stack2.push(b);
                    } else {
                        stack2.pop();
                        r1.m1179a(stack);
                        stack.push(r1);
                        stack2.push(b);
                    }
                }
                obj2 = obj;
                stack4 = stack3;
            } else if (atVar instanceof C0160d) {
                while (!stack2.isEmpty()) {
                    r1 = (aq) stack2.pop();
                    r1.m1179a(stack);
                    stack.push(r1);
                }
                if (stack3 == null) {
                    stack3 = new Stack();
                }
                stack3.push(stack.pop());
                stack.clear();
                obj2 = obj;
                stack4 = stack3;
            } else if (atVar instanceof ao) {
                at a = m1271a(it);
                atVar2 = new ar();
                a.m1171b(atVar2);
                atVar2.m1178a(a);
                stack.push(atVar2);
                obj2 = obj;
                stack4 = stack3;
            } else if (atVar instanceof C0167l) {
                int i = 1;
                stack4 = stack3;
            } else {
                obj2 = obj;
                stack4 = stack3;
            }
            obj = obj2;
            stack3 = stack4;
            atVar2 = atVar;
        }
        while (!stack2.isEmpty()) {
            aq aqVar = (aq) stack2.pop();
            aqVar.m1179a(stack);
            stack.push(aqVar);
        }
        atVar = !stack.empty() ? (at) stack.pop() : null;
        if (!(stack3 == null || atVar == null)) {
            stack3.push(atVar);
        }
        this.f870e = stack3;
        if (!(stack.empty() && stack2.empty())) {
            f866a.m1499b("Formula " + this.f867b + " has a non-empty parse stack");
        }
        return atVar;
    }

    private void m1272a(ap apVar, Stack stack) {
        if (!(apVar instanceof ac)) {
            stack.push(apVar);
        } else if (apVar instanceof ac) {
            ac acVar = (ac) apVar;
            if (acVar.m1198b()) {
                stack.push(new C0172q(acVar.m1196a()));
            } else {
                stack.push(acVar);
            }
        }
    }

    private void m1273a(bc bcVar, Iterator it, Stack stack) {
        int i = 1;
        int i2 = 0;
        at a = m1271a(it);
        if (bcVar.m1278a(this.f871f) == C0180y.dz) {
            throw new C0177v(C0177v.f1013b);
        } else if (bcVar.m1278a(this.f871f) == C0180y.f1053e && this.f870e == null) {
            C0161e c0161e = new C0161e(bcVar, this.f871f);
            c0161e.m1178a(a);
            stack.push(c0161e);
        } else if (bcVar.m1278a(this.f871f) == C0180y.dy) {
            C0161e c0161e2 = new C0161e(bcVar, this.f871f);
            bn bnVar = new bn(this.f871f);
            r4 = this.f870e.size();
            while (i2 < r4) {
                bnVar.m1178a((at) this.f870e.get(i2));
                i2++;
            }
            c0161e2.m1330a(bnVar);
            stack.push(c0161e2);
        } else if (bcVar.m1278a(this.f871f).m1384c() != 255) {
            C0163h c0163h = new C0163h(bcVar.m1278a(this.f871f), this.f871f);
            r4 = bcVar.m1278a(this.f871f).m1384c();
            if (r4 == 1) {
                c0163h.m1178a(a);
            } else if ((this.f870e != null || r4 == 0) && (this.f870e == null || r4 == this.f870e.size())) {
                while (i2 < r4) {
                    c0163h.m1178a((at) this.f870e.get(i2));
                    i2++;
                }
            } else {
                throw new C0177v(C0177v.f1016e);
            }
            stack.push(c0163h);
        } else if (this.f870e == null) {
            if (a == null) {
                i = 0;
            }
            bn bnVar2 = new bn(bcVar.m1278a(this.f871f), i, this.f871f);
            if (a != null) {
                bnVar2.m1178a(a);
            }
            stack.push(bnVar2);
        } else {
            int size = this.f870e.size();
            bn bnVar3 = new bn(bcVar.m1278a(this.f871f), size, this.f871f);
            at[] atVarArr = new at[size];
            for (int i3 = 0; i3 < size; i3++) {
                atVarArr[(size - i3) - 1] = (at) this.f870e.pop();
            }
            while (i2 < atVarArr.length) {
                bnVar3.m1178a(atVarArr[i2]);
                i2++;
            }
            stack.push(bnVar3);
            this.f870e.clear();
            this.f870e = null;
        }
    }

    private ArrayList m1274d() {
        ArrayList arrayList = new ArrayList();
        bo boVar = new bo(new StringReader(this.f867b));
        boVar.m1318a(this.f872g);
        boVar.m1319a(this.f873h);
        try {
            for (Object c = boVar.m1321c(); c != null; c = boVar.m1321c()) {
                arrayList.add(c);
            }
        } catch (IOException e) {
            f866a.m1499b(e.toString());
        } catch (Error e2) {
            throw new C0177v(C0177v.f1015d, this.f867b + " at char  " + boVar.m1316a());
        }
        return arrayList;
    }

    public void m1275a() {
        this.f869d = m1271a(m1274d().iterator());
    }

    public String m1276b() {
        if (this.f868c == null) {
            StringBuffer stringBuffer = new StringBuffer();
            this.f869d.m1170a(stringBuffer);
            this.f868c = stringBuffer.toString();
        }
        return this.f868c;
    }

    public byte[] m1277c() {
        Object c = this.f869d.m1172c();
        if (!this.f869d.m1174h()) {
            return c;
        }
        Object obj = new byte[(c.length + 4)];
        System.arraycopy(c, 0, obj, 4, c.length);
        obj[0] = bi.f892L.m1285a();
        obj[1] = 1;
        return obj;
    }
}
