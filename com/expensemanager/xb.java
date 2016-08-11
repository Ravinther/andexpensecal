package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.C0607c;
import java.io.File;

class xb implements OnClickListener {
    final /* synthetic */ xa f5434a;

    xb(xa xaVar) {
        this.f5434a = xaVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
                intent.putExtra("output", Uri.fromFile(new File(co.f4431e + "tmp.jpg")));
                this.f5434a.f5433a.startActivityForResult(intent, 7);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f5434a.f5433a.startActivityForResult(new Intent(this.f5434a.f5433a.f3334a, AttachPicture.class), 7);
            default:
        }
    }
}
