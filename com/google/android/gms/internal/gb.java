package com.google.android.gms.internal;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController;
import android.widget.VideoView;
import java.util.HashMap;
import java.util.Map;

@id
public final class gb extends FrameLayout implements OnCompletionListener, OnErrorListener, OnPreparedListener {
    private final ma f6639a;
    private final MediaController f6640b;
    private final gc f6641c;
    private final VideoView f6642d;
    private long f6643e;
    private String f6644f;

    public gb(Context context, ma maVar) {
        super(context);
        this.f6639a = maVar;
        this.f6642d = new VideoView(context);
        addView(this.f6642d, new LayoutParams(-1, -1, 17));
        this.f6640b = new MediaController(context);
        this.f6641c = new gc(this);
        this.f6641c.m5589b();
        this.f6642d.setOnCompletionListener(this);
        this.f6642d.setOnPreparedListener(this);
        this.f6642d.setOnErrorListener(this);
    }

    private static void m5574a(ma maVar, String str) {
        m5577a(maVar, str, new HashMap(1));
    }

    public static void m5575a(ma maVar, String str, String str2) {
        Object obj = str2 == null ? 1 : null;
        Map hashMap = new HashMap(obj != null ? 2 : 3);
        hashMap.put("what", str);
        if (obj == null) {
            hashMap.put("extra", str2);
        }
        m5577a(maVar, "error", hashMap);
    }

    private static void m5576a(ma maVar, String str, String str2, String str3) {
        Map hashMap = new HashMap(2);
        hashMap.put(str2, str3);
        m5577a(maVar, str, hashMap);
    }

    private static void m5577a(ma maVar, String str, Map<String, String> map) {
        map.put("event", str);
        maVar.m6088a("onVideoEvent", (Map) map);
    }

    public void m5578a() {
        this.f6641c.m5588a();
        this.f6642d.stopPlayback();
    }

    public void m5579a(int i) {
        this.f6642d.seekTo(i);
    }

    public void m5580a(MotionEvent motionEvent) {
        this.f6642d.dispatchTouchEvent(motionEvent);
    }

    public void m5581a(String str) {
        this.f6644f = str;
    }

    public void m5582a(boolean z) {
        if (z) {
            this.f6642d.setMediaController(this.f6640b);
            return;
        }
        this.f6640b.hide();
        this.f6642d.setMediaController(null);
    }

    public void m5583b() {
        if (TextUtils.isEmpty(this.f6644f)) {
            m5575a(this.f6639a, "no_src", null);
        } else {
            this.f6642d.setVideoPath(this.f6644f);
        }
    }

    public void m5584c() {
        this.f6642d.pause();
    }

    public void m5585d() {
        this.f6642d.start();
    }

    public void m5586e() {
        long currentPosition = (long) this.f6642d.getCurrentPosition();
        if (this.f6643e != currentPosition) {
            m5576a(this.f6639a, "timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
            this.f6643e = currentPosition;
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        m5574a(this.f6639a, "ended");
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        m5575a(this.f6639a, String.valueOf(i), String.valueOf(i2));
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        m5576a(this.f6639a, "canplaythrough", "duration", String.valueOf(((float) this.f6642d.getDuration()) / 1000.0f));
    }
}
