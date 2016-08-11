package com.google.api.client.p051b;

import com.google.api.client.p050d.am;
import com.google.api.client.p050d.ap;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.api.client.b.ah */
public class ah extends C0671a {
    private ArrayList<ai> f7395a;

    public ah() {
        super(new C0691s("multipart/related").m6756a("boundary", "__END_OF_PART__"));
        this.f7395a = new ArrayList();
    }

    public ah m6621a(ai aiVar) {
        this.f7395a.add(am.m6911a((Object) aiVar));
        return this;
    }

    public ah m6622a(Collection<? extends C0670l> collection) {
        this.f7395a = new ArrayList(collection.size());
        for (C0670l aiVar : collection) {
            m6621a(new ai(aiVar));
        }
        return this;
    }

    public void m6623a(OutputStream outputStream) {
        Writer outputStreamWriter = new OutputStreamWriter(outputStream, m6597d());
        String h = m6625h();
        Iterator it = this.f7395a.iterator();
        while (it.hasNext()) {
            ap apVar;
            ai aiVar = (ai) it.next();
            C0688p a = new C0688p().m6723a(null);
            if (aiVar.f7397b != null) {
                a.m6727a(aiVar.f7397b);
            }
            a.m6731c(null).m6747l(null).m6735e(null).m6722a(null).m6724a("Content-Transfer-Encoding", null);
            ap apVar2 = aiVar.f7396a;
            if (apVar2 != null) {
                long b;
                a.m6724a("Content-Transfer-Encoding", Arrays.asList(new String[]{"binary"}));
                a.m6735e(apVar2.m6591e());
                C0683m c0683m = aiVar.f7398c;
                if (c0683m == null) {
                    b = apVar2.m6590b();
                    apVar = apVar2;
                } else {
                    a.m6731c(c0683m.m6695a());
                    apVar = new C0687n(apVar2, c0683m);
                    b = C0671a.m6593a(apVar2);
                }
                if (b != -1) {
                    a.m6722a(Long.valueOf(b));
                }
            } else {
                apVar = null;
            }
            outputStreamWriter.write("--");
            outputStreamWriter.write(h);
            outputStreamWriter.write("\r\n");
            C0688p.m6717a(a, null, null, outputStreamWriter);
            if (apVar != null) {
                outputStreamWriter.write("\r\n");
                outputStreamWriter.flush();
                apVar.m6588a(outputStream);
                outputStreamWriter.write("\r\n");
            }
        }
        outputStreamWriter.write("--");
        outputStreamWriter.write(h);
        outputStreamWriter.write("--");
        outputStreamWriter.write("\r\n");
        outputStreamWriter.flush();
    }

    public boolean m6624g() {
        Iterator it = this.f7395a.iterator();
        while (it.hasNext()) {
            if (!((ai) it.next()).f7396a.m6592g()) {
                return false;
            }
        }
        return true;
    }

    public final String m6625h() {
        return m6596c().m6763c("boundary");
    }
}
