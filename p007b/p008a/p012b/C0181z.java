package p007b.p008a.p012b;

import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;
import p007b.p013b.C0208c;

/* renamed from: b.a.b.z */
public class C0181z {
    private static C0208c f1075a;
    private HashMap f1076b;
    private HashMap f1077c;

    static {
        f1075a = C0208c.m1493a(C0181z.class);
    }

    public C0181z(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("functions", locale);
        C0180y[] d = C0180y.m1380d();
        this.f1076b = new HashMap(d.length);
        this.f1077c = new HashMap(d.length);
        for (C0180y c0180y : d) {
            String b = c0180y.m1383b();
            Object string = b.length() != 0 ? bundle.getString(b) : null;
            if (string != null) {
                this.f1076b.put(c0180y, string);
                this.f1077c.put(string, c0180y);
            }
        }
    }

    C0180y m1385a(String str) {
        return (C0180y) this.f1077c.get(str);
    }

    String m1386a(C0180y c0180y) {
        return (String) this.f1076b.get(c0180y);
    }
}
