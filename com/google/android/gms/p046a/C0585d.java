package com.google.android.gms.p046a;

import android.os.IBinder;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.a.d */
public final class C0585d<T> extends C0583b {
    private final T f6043a;

    private C0585d(T t) {
        this.f6043a = t;
    }

    public static <T> C0582a m4878a(T t) {
        return new C0585d(t);
    }

    public static <T> T m4879a(C0582a c0582a) {
        if (c0582a instanceof C0585d) {
            return ((C0585d) c0582a).f6043a;
        }
        IBinder asBinder = c0582a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (field.isAccessible()) {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (Throwable e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (Throwable e2) {
                throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
            } catch (Throwable e22) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e22);
            }
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
}
