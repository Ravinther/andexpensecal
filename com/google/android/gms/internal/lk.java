package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class lk extends BroadcastReceiver {
    private lk() {
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            li.f7066c = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            li.f7066c = false;
        }
    }
}
