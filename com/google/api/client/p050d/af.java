package com.google.api.client.p050d;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.d.af */
public final class af implements ap {
    private final ap f7576a;
    private final int f7577b;
    private final Level f7578c;
    private final Logger f7579d;

    public af(ap apVar, Logger logger, Level level, int i) {
        this.f7576a = apVar;
        this.f7579d = logger;
        this.f7578c = level;
        this.f7577b = i;
    }

    public void m6905a(OutputStream outputStream) {
        OutputStream aeVar = new ae(outputStream, this.f7579d, this.f7578c, this.f7577b);
        try {
            this.f7576a.m6588a(aeVar);
            outputStream.flush();
        } finally {
            aeVar.m6904a().close();
        }
    }
}
