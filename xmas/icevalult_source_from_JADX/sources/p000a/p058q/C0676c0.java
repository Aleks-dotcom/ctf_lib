package p000a.p058q;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.q.c0 */
public class C0676c0 {

    /* renamed from: a */
    public static final C0696i0 f2629a;

    /* renamed from: b */
    public static final Property<View, Float> f2630b = new C0677a(Float.class, "translationAlpha");

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f2629a = new C0694h0();
        } else if (i >= 23) {
            f2629a = new C0692g0();
        } else if (i >= 22) {
            f2629a = new C0690f0();
        } else if (i >= 21) {
            f2629a = new C0688e0();
        } else if (i >= 19) {
            f2629a = new C0682d0();
        } else {
            f2629a = new C0696i0();
        }
        new C0678b(Rect.class, "clipBounds");
    }

    /* renamed from: a.q.c0$a */
    public static class C0677a extends Property<View, Float> {
        public C0677a(Class x0, String x1) {
            super(x0, x1);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C0676c0.m3342c(view));
        }

        /* renamed from: b */
        public void set(View view, Float alpha) {
            C0676c0.m3346g(view, alpha.floatValue());
        }
    }

    /* renamed from: a.q.c0$b */
    public static class C0678b extends Property<View, Rect> {
        public C0678b(Class x0, String x1) {
            super(x0, x1);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C0460r.m2280o(view);
        }

        /* renamed from: b */
        public void set(View view, Rect clipBounds) {
            C0460r.m2269i0(view, clipBounds);
        }
    }

    /* renamed from: b */
    public static C0663b0 m3341b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C0661a0(view);
        }
        return C0731z.m3563e(view);
    }

    /* renamed from: d */
    public static C0713m0 m3343d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C0705l0(view);
        }
        return new C0703k0(view.getWindowToken());
    }

    /* renamed from: g */
    public static void m3346g(View view, float alpha) {
        f2629a.mo3495f(view, alpha);
    }

    /* renamed from: c */
    public static float m3342c(View view) {
        return f2629a.mo3493c(view);
    }

    /* renamed from: e */
    public static void m3344e(View view) {
        f2629a.mo3494d(view);
    }

    /* renamed from: a */
    public static void m3340a(View view) {
        f2629a.mo3492a(view);
    }

    /* renamed from: h */
    public static void m3347h(View view, int visibility) {
        f2629a.mo3501g(view, visibility);
    }

    /* renamed from: i */
    public static void m3348i(View view, Matrix matrix) {
        f2629a.mo3497h(view, matrix);
    }

    /* renamed from: j */
    public static void m3349j(View view, Matrix matrix) {
        f2629a.mo3498i(view, matrix);
    }

    /* renamed from: f */
    public static void m3345f(View v, int left, int top, int right, int bottom) {
        f2629a.mo3499e(v, left, top, right, bottom);
    }
}
