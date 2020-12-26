package p000a.p025h.p038m;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* renamed from: a.h.m.c */
public final class C0444c {
    /* renamed from: a */
    public static void m2173a(int gravity, int w, int h, Rect container, Rect outRect, int layoutDirection) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(gravity, w, h, container, outRect, layoutDirection);
        } else {
            Gravity.apply(gravity, w, h, container, outRect);
        }
    }

    /* renamed from: b */
    public static int m2174b(int gravity, int layoutDirection) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Gravity.getAbsoluteGravity(gravity, layoutDirection);
        }
        return -8388609 & gravity;
    }
}
