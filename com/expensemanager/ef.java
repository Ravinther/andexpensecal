package com.expensemanager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.C0607c;
import java.io.File;

class ef implements OnClickListener {
    final /* synthetic */ ee f4579a;

    ef(ee eeVar) {
        this.f4579a = eeVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case C0607c.AdsAttrs_adSize /*0*/:
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
                intent.putExtra("output", Uri.fromFile(new File(co.f4431e + "tmp.jpg")));
                this.f4579a.f4578a.startActivityForResult(intent, 7);
            case C0607c.LoadingImageView_imageAspectRatio /*1*/:
                this.f4579a.f4578a.startActivityForResult(new Intent(this.f4579a.f4578a.f2654a, AttachPicture.class), 7);
            default:
        }
    }
}
