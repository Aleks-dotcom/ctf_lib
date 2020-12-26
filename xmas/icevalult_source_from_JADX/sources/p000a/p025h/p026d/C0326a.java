package p000a.p025h.p026d;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import p000a.p025h.p027e.C0339a;

/* renamed from: a.h.d.a */
public class C0326a extends C0339a {

    /* renamed from: c */
    public static C0327a f1812c;

    /* renamed from: a.h.d.a$a */
    public interface C0327a {
        /* renamed from: a */
        boolean mo2217a(Activity activity, int i, int i2, Intent intent);
    }

    /* renamed from: f */
    public static C0327a m1744f() {
        return f1812c;
    }

    /* renamed from: e */
    public static void m1743e(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: g */
    public static void m1745g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (!C0328b.m1755i(activity)) {
            activity.recreate();
        }
    }
}
