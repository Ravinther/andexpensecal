package com.google.api.client.googleapis.json;

import com.google.api.client.json.C0657b;
import com.google.api.client.p050d.ab;

public class GoogleJsonErrorContainer extends C0657b {
    @ab
    private GoogleJsonError error;

    public GoogleJsonErrorContainer clone() {
        return (GoogleJsonErrorContainer) super.clone();
    }

    public final GoogleJsonError getError() {
        return this.error;
    }

    public GoogleJsonErrorContainer set(String str, Object obj) {
        return (GoogleJsonErrorContainer) super.set(str, obj);
    }

    public final void setError(GoogleJsonError googleJsonError) {
        this.error = googleJsonError;
    }
}
