package android.support.v4.app;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.C0607c;

/* renamed from: android.support.v4.app.p */
class C0038p extends Handler {
    final /* synthetic */ C0037o f272a;

    C0038p(C0037o c0037o) {
        this.f272a = c0037o;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                if (this.f272a.f264f) {
                    this.f272a.m360a(false);
                }
            case C0607c.LoadingImageView_circleCrop /*2*/:
                this.f272a.m362b();
                this.f272a.f260b.m419e();
            default:
                super.handleMessage(message);
        }
    }
}
