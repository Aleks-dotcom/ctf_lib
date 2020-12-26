package p000a.p025h.p037l;

/* renamed from: a.h.l.h */
public final class C0419h {
    /* renamed from: a */
    public static void m2058a(boolean expression, Object errorMessage) {
        if (!expression) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
    }

    /* renamed from: c */
    public static <T> T m2060c(T reference) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException();
    }

    /* renamed from: d */
    public static <T> T m2061d(T reference, Object errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(String.valueOf(errorMessage));
    }

    /* renamed from: b */
    public static int m2059b(int value) {
        if (value >= 0) {
            return value;
        }
        throw new IllegalArgumentException();
    }
}
