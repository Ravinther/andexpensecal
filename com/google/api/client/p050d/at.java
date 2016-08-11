package com.google.api.client.p050d;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.api.client.d.at */
public class at {
    public static Class<?> m6926a(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    public static Class<?> m6927a(List<Type> list, Type type) {
        Type a = type instanceof TypeVariable ? at.m6935a((List) list, (TypeVariable) type) : type;
        if (a instanceof GenericArrayType) {
            return Array.newInstance(at.m6927a((List) list, at.m6938b(a)), 0).getClass();
        }
        if (a instanceof Class) {
            return (Class) a;
        }
        if (a instanceof ParameterizedType) {
            return at.m6926a((ParameterizedType) a);
        }
        am.m6916a(a == null, "wildcard type is not supported: %s", a);
        return Object.class;
    }

    private static IllegalArgumentException m6928a(Exception exception, Class<?> cls) {
        StringBuilder append = new StringBuilder("unable to create new instance of class ").append(cls.getName());
        ArrayList arrayList = new ArrayList();
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (!(cls.getEnclosingClass() == null || Modifier.isStatic(cls.getModifiers()))) {
                arrayList.add("because it is not static");
            }
            if (Modifier.isPublic(cls.getModifiers())) {
                try {
                    cls.getConstructor(new Class[0]);
                } catch (NoSuchMethodException e) {
                    arrayList.add("because it has no accessible default constructor");
                }
            } else {
                arrayList.add("possibly because it is not public");
            }
        }
        Iterator it = arrayList.iterator();
        Object obj = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (obj != null) {
                append.append(" and");
            } else {
                obj = 1;
            }
            append.append(" ").append(str);
        }
        return new IllegalArgumentException(append.toString(), exception);
    }

    public static <T> Iterable<T> m6929a(Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class cls = obj.getClass();
        am.m6916a(cls.isArray(), "not an array or Iterable: %s", cls);
        return !cls.getComponentType().isPrimitive() ? Arrays.asList((Object[]) obj) : new au(obj);
    }

    public static <T> T m6930a(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (Exception e) {
            throw at.m6928a(e, (Class) cls);
        } catch (Exception e2) {
            throw at.m6928a(e2, (Class) cls);
        }
    }

    public static Object m6931a(Collection<?> collection, Class<?> cls) {
        if (!cls.isPrimitive()) {
            return collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
        }
        Object newInstance = Array.newInstance(cls, collection.size());
        int i = 0;
        for (Object obj : collection) {
            int i2 = i + 1;
            Array.set(newInstance, i, obj);
            i = i2;
        }
        return newInstance;
    }

    public static ParameterizedType m6932a(Type type, Class<?> cls) {
        if ((type instanceof Class) || (type instanceof ParameterizedType)) {
            Type type2 = type;
            while (type2 != null && type2 != Object.class) {
                Class cls2;
                if (type2 instanceof Class) {
                    cls2 = (Class) type2;
                } else {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Class<?> a = at.m6926a(parameterizedType);
                    if (a == cls) {
                        return parameterizedType;
                    }
                    if (cls.isInterface()) {
                        for (Type type3 : a.getGenericInterfaces()) {
                            if (cls.isAssignableFrom(type3 instanceof Class ? (Class) type3 : at.m6926a((ParameterizedType) type3))) {
                                type2 = type3;
                                break;
                            }
                        }
                    }
                    Class<?> cls3 = a;
                }
                type2 = cls2.getGenericSuperclass();
            }
        }
        return null;
    }

    private static Type m6933a(Type type, Class<?> cls, int i) {
        Type type2 = at.m6932a(type, (Class) cls).getActualTypeArguments()[i];
        if (!(type2 instanceof TypeVariable)) {
            return type2;
        }
        Type a = at.m6935a(Arrays.asList(new Type[]{type}), (TypeVariable) type2);
        return a != null ? a : type2;
    }

    public static Type m6934a(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        return lowerBounds.length != 0 ? lowerBounds[0] : wildcardType.getUpperBounds()[0];
    }

    public static Type m6935a(List<Type> list, TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class cls = (Class) genericDeclaration;
            int size = list.size();
            ParameterizedType parameterizedType = null;
            while (parameterizedType == null) {
                size--;
                if (size < 0) {
                    break;
                }
                parameterizedType = at.m6932a((Type) list.get(size), cls);
            }
            if (parameterizedType != null) {
                TypeVariable[] typeParameters = genericDeclaration.getTypeParameters();
                int i = 0;
                while (i < typeParameters.length && !typeParameters[i].equals(typeVariable)) {
                    i++;
                }
                Type type = parameterizedType.getActualTypeArguments()[i];
                if (!(type instanceof TypeVariable)) {
                    return type;
                }
                Type a = at.m6935a((List) list, (TypeVariable) type);
                return a != null ? a : type;
            }
        }
        return null;
    }

    public static boolean m6936a(Class<?> cls, Class<?> cls2) {
        return cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    public static boolean m6937a(Type type) {
        return (type instanceof GenericArrayType) || ((type instanceof Class) && ((Class) type).isArray());
    }

    public static Type m6938b(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type m6939c(Type type) {
        return at.m6933a(type, Iterable.class, 0);
    }

    public static Type m6940d(Type type) {
        return at.m6933a(type, Map.class, 1);
    }
}
