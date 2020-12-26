package p000a.p025h.p038m;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: a.h.m.f */
public final class C0448f {
    /* renamed from: b */
    public static int m2185b(ViewGroup.MarginLayoutParams lp) {
        if (Build.VERSION.SDK_INT >= 17) {
            return lp.getMarginStart();
        }
        return lp.leftMargin;
    }

    /* renamed from: a */
    public static int m2184a(ViewGroup.MarginLayoutParams lp) {
        if (Build.VERSION.SDK_INT >= 17) {
            return lp.getMarginEnd();
        }
        return lp.rightMargin;
    }
}
