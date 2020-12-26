package p000a.p025h.p038m.p039a0;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: a.h.m.a0.b */
public final class C0423b {
    /* renamed from: b */
    public static void m2076b(AccessibilityEvent event, int changeTypes) {
        if (Build.VERSION.SDK_INT >= 19) {
            event.setContentChangeTypes(changeTypes);
        }
    }

    /* renamed from: a */
    public static int m2075a(AccessibilityEvent event) {
        if (Build.VERSION.SDK_INT >= 19) {
            return event.getContentChangeTypes();
        }
        return 0;
    }
}
