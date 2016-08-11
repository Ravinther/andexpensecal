package com.google.api.client.googleapis.json;

import com.google.api.client.json.C0657b;
import com.google.api.client.json.C0771d;
import com.google.api.client.json.C0780g;
import com.google.api.client.p050d.C0728p;
import com.google.api.client.p050d.ab;
import com.google.api.client.p051b.C0695x;
import java.util.Collections;
import java.util.List;

public class GoogleJsonError extends C0657b {
    @ab
    private int code;
    @ab
    private List<ErrorInfo> errors;
    @ab
    private String message;

    public class ErrorInfo extends C0657b {
        @ab
        private String domain;
        @ab
        private String location;
        @ab
        private String locationType;
        @ab
        private String message;
        @ab
        private String reason;

        public ErrorInfo clone() {
            return (ErrorInfo) super.clone();
        }

        public final String getDomain() {
            return this.domain;
        }

        public final String getLocation() {
            return this.location;
        }

        public final String getLocationType() {
            return this.locationType;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getReason() {
            return this.reason;
        }

        public ErrorInfo set(String str, Object obj) {
            return (ErrorInfo) super.set(str, obj);
        }

        public final void setDomain(String str) {
            this.domain = str;
        }

        public final void setLocation(String str) {
            this.location = str;
        }

        public final void setLocationType(String str) {
            this.locationType = str;
        }

        public final void setMessage(String str) {
            this.message = str;
        }

        public final void setReason(String str) {
            this.reason = str;
        }
    }

    static {
        C0728p.m6961a(ErrorInfo.class);
    }

    public static GoogleJsonError parse(C0771d c0771d, C0695x c0695x) {
        return (GoogleJsonError) new C0780g(c0771d).m7145a(Collections.singleton("error")).m7144a().m7046a(c0695x.m6814g(), c0695x.m6818k(), GoogleJsonError.class);
    }

    public GoogleJsonError clone() {
        return (GoogleJsonError) super.clone();
    }

    public final int getCode() {
        return this.code;
    }

    public final List<ErrorInfo> getErrors() {
        return this.errors;
    }

    public final String getMessage() {
        return this.message;
    }

    public GoogleJsonError set(String str, Object obj) {
        return (GoogleJsonError) super.set(str, obj);
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setErrors(List<ErrorInfo> list) {
        this.errors = list;
    }

    public final void setMessage(String str) {
        this.message = str;
    }
}
