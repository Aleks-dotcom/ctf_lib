package p000a.p058q;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* renamed from: a.q.x */
public class C0728x {

    /* renamed from: a */
    public static boolean f2749a = true;

    /* renamed from: a */
    public static C0727w m3558a(ViewGroup group) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C0726v(group);
        }
        return C0725u.m3549g(group);
    }

    /* renamed from: c */
    public static void m3560c(ViewGroup group, boolean suppress) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            group.suppressLayout(suppress);
        } else if (i >= 18) {
            m3559b(group, suppress);
        } else {
            C0729y.m3562b(group, suppress);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static void m3559b(ViewGroup group, boolean suppress) {
        if (f2749a) {
            try {
                group.suppressLayout(suppress);
            } catch (NoSuchMethodError e) {
                f2749a = false;
            }
        }
    }
}
