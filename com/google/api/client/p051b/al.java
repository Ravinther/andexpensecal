package com.google.api.client.p051b;

import com.google.api.client.p050d.C0728p;
import com.google.api.client.p050d.C0734v;
import com.google.api.client.p050d.am;
import com.google.api.client.p050d.at;
import com.google.api.client.p050d.p065a.C0707a;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map.Entry;

/* renamed from: com.google.api.client.b.al */
public class al extends C0671a {
    private Object f7414a;

    public al(Object obj) {
        super(am.f7415a);
        m6640a(obj);
    }

    private static boolean m6639a(boolean z, Writer writer, String str, Object obj) {
        if (!(obj == null || C0728p.m6965a(obj))) {
            if (z) {
                z = false;
            } else {
                writer.write("&");
            }
            writer.write(str);
            String a = C0707a.m6869a(obj instanceof Enum ? C0734v.m6980a((Enum) obj).m6987b() : obj.toString());
            if (a.length() != 0) {
                writer.write("=");
                writer.write(a);
            }
        }
        return z;
    }

    public al m6640a(Object obj) {
        this.f7414a = am.m6911a(obj);
        return this;
    }

    public void m6641a(OutputStream outputStream) {
        Writer bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, m6597d()));
        boolean z = true;
        for (Entry entry : C0728p.m6969b(this.f7414a).entrySet()) {
            boolean z2;
            Object value = entry.getValue();
            if (value != null) {
                String a = C0707a.m6869a((String) entry.getKey());
                Class cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    for (Object a2 : at.m6929a(value)) {
                        z = al.m6639a(z, bufferedWriter, a, a2);
                    }
                    z2 = z;
                } else {
                    z2 = al.m6639a(z, bufferedWriter, a, value);
                }
            } else {
                z2 = z;
            }
            z = z2;
        }
        bufferedWriter.flush();
    }
}
