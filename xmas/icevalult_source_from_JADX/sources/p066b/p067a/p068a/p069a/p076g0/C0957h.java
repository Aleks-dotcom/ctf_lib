package p066b.p067a.p068a.p069a.p076g0;

import android.graphics.drawable.Drawable;
import android.view.View;
import p066b.p067a.p068a.p069a.p070a0.C0922h;

/* renamed from: b.a.a.a.g0.h */
public class C0957h {
    /* renamed from: a */
    public static C0950d m5174a(int cornerFamily) {
        if (cornerFamily == 0) {
            return new C0959j();
        }
        if (cornerFamily != 1) {
            return m5175b();
        }
        return new C0951e();
    }

    /* renamed from: b */
    public static C0950d m5175b() {
        return new C0959j();
    }

    /* renamed from: c */
    public static C0952f m5176c() {
        return new C0952f();
    }

    /* renamed from: d */
    public static void m5177d(View view, float elevation) {
        Drawable background = view.getBackground();
        if (background instanceof C0953g) {
            ((C0953g) background).mo5587S(elevation);
        }
    }

    /* renamed from: e */
    public static void m5178e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C0953g) {
            m5179f(view, (C0953g) background);
        }
    }

    /* renamed from: f */
    public static void m5179f(View view, C0953g materialShapeDrawable) {
        if (materialShapeDrawable.mo5583N()) {
            materialShapeDrawable.mo5591W(C0922h.m5057b(view));
        }
    }
}
