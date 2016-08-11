package com.google.api.services.drive;

import com.google.api.client.googleapis.p074d.p075a.C0763c;
import com.google.api.client.googleapis.p074d.p075a.C0766d;

public class DriveRequestInitializer extends C0766d {
    public DriveRequestInitializer(String str) {
        super(str);
    }

    public DriveRequestInitializer(String str, String str2) {
        super(str, str2);
    }

    protected void initializeDriveRequest(DriveRequest<?> driveRequest) {
    }

    public final void initializeJsonRequest(C0763c<?> c0763c) {
        super.initializeJsonRequest(c0763c);
        initializeDriveRequest((DriveRequest) c0763c);
    }
}
