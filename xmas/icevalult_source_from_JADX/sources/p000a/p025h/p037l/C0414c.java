package p000a.p025h.p037l;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: a.h.l.c */
public class C0414c {
    /* renamed from: a */
    public static boolean m2049a(Object a, Object b) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(a, b);
        }
        return a == b || (a != null && a.equals(b));
    }

    /* renamed from: b */
    public static int m2050b(Object... values) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(values);
        }
        return Arrays.hashCode(values);
    }
}
