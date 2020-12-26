package p000a.p025h.p034i;

import android.os.Build;
import android.os.Trace;

/* renamed from: a.h.i.a */
public final class C0380a {
    /* renamed from: a */
    public static void m1964a(String sectionName) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(sectionName);
        }
    }

    /* renamed from: b */
    public static void m1965b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
