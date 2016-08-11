package com.google.android.gms.internal;

import android.os.AsyncTask;
import com.google.android.gms.common.C0616e;
import com.google.android.gms.common.C0618f;
import java.io.IOException;

final class nb extends AsyncTask<Void, Void, Void> {
    nb() {
    }

    protected Void m6172a(Void... voidArr) {
        try {
            na.f7213e.start();
        } catch (C0616e e) {
            na.f7215g = true;
            na.f7213e = null;
        } catch (IOException e2) {
            na.f7213e = null;
        } catch (C0618f e3) {
            na.f7213e = null;
        }
        na.f7214f.countDown();
        return null;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m6172a((Void[]) objArr);
    }
}
