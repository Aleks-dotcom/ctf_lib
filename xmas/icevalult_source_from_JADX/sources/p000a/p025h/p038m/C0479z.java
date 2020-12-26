package p000a.p025h.p038m;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: a.h.m.z */
public class C0479z {

    /* renamed from: a */
    public final Object f2057a;

    public C0479z(Object insets) {
        this.f2057a = insets;
    }

    /* renamed from: b */
    public int mo2613b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2057a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo2615d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2057a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo2614c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2057a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: a */
    public int mo2612a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f2057a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: e */
    public boolean mo2616e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f2057a).isConsumed();
        }
        return false;
    }

    /* renamed from: f */
    public C0479z mo2618f(int left, int top, int right, int bottom) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C0479z(((WindowInsets) this.f2057a).replaceSystemWindowInsets(left, top, right, bottom));
        }
        return null;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        C0479z other = (C0479z) o;
        Object obj = this.f2057a;
        if (obj != null) {
            return obj.equals(other.f2057a);
        }
        if (other.f2057a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f2057a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    public static C0479z m2368h(Object insets) {
        if (insets == null) {
            return null;
        }
        return new C0479z(insets);
    }

    /* renamed from: g */
    public static Object m2367g(C0479z insets) {
        if (insets == null) {
            return null;
        }
        return insets.f2057a;
    }
}
