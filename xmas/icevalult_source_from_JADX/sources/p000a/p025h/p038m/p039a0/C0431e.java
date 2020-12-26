package p000a.p025h.p038m.p039a0;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: a.h.m.a0.e */
public class C0431e {
    /* renamed from: c */
    public static void m2160c(AccessibilityRecord record, View root, int virtualDescendantId) {
        if (Build.VERSION.SDK_INT >= 16) {
            record.setSource(root, virtualDescendantId);
        }
    }

    /* renamed from: a */
    public static void m2158a(AccessibilityRecord record, int maxScrollX) {
        if (Build.VERSION.SDK_INT >= 15) {
            record.setMaxScrollX(maxScrollX);
        }
    }

    /* renamed from: b */
    public static void m2159b(AccessibilityRecord record, int maxScrollY) {
        if (Build.VERSION.SDK_INT >= 15) {
            record.setMaxScrollY(maxScrollY);
        }
    }
}
