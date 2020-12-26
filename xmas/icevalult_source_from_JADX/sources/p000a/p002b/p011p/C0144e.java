package p000a.p002b.p011p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p000a.p002b.C0012j;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.b.p.e */
public class C0144e {

    /* renamed from: a */
    public final View f827a;

    /* renamed from: b */
    public final C0160j f828b;

    /* renamed from: c */
    public int f829c = -1;

    /* renamed from: d */
    public C0203u0 f830d;

    /* renamed from: e */
    public C0203u0 f831e;

    /* renamed from: f */
    public C0203u0 f832f;

    public C0144e(View view) {
        this.f827a = view;
        this.f828b = C0160j.m883b();
    }

    /* renamed from: e */
    public void mo1026e(AttributeSet attrs, int defStyleAttr) {
        C0218w0 a = C0218w0.m1093u(this.f827a.getContext(), attrs, C0012j.f186o3, defStyleAttr, 0);
        try {
            int i = C0012j.f191p3;
            if (a.mo1513r(i)) {
                this.f829c = a.mo1509n(i, -1);
                ColorStateList tint = this.f828b.mo1167f(this.f827a.getContext(), this.f829c);
                if (tint != null) {
                    mo1029h(tint);
                }
            }
            int i2 = C0012j.f196q3;
            if (a.mo1513r(i2)) {
                C0460r.m2265g0(this.f827a, a.mo1498c(i2));
            }
            int i3 = C0012j.f201r3;
            if (a.mo1513r(i3)) {
                C0460r.m2267h0(this.f827a, C0145e0.m827d(a.mo1506k(i3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.mo1514v();
        }
    }

    /* renamed from: g */
    public void mo1028g(int resId) {
        this.f829c = resId;
        C0160j jVar = this.f828b;
        mo1029h(jVar != null ? jVar.mo1167f(this.f827a.getContext(), resId) : null);
        mo1023b();
    }

    /* renamed from: f */
    public void mo1027f(Drawable background) {
        this.f829c = -1;
        mo1029h((ColorStateList) null);
        mo1023b();
    }

    /* renamed from: i */
    public void mo1030i(ColorStateList tint) {
        if (this.f831e == null) {
            this.f831e = new C0203u0();
        }
        C0203u0 u0Var = this.f831e;
        u0Var.f1040a = tint;
        u0Var.f1043d = true;
        mo1023b();
    }

    /* renamed from: c */
    public ColorStateList mo1024c() {
        C0203u0 u0Var = this.f831e;
        if (u0Var != null) {
            return u0Var.f1040a;
        }
        return null;
    }

    /* renamed from: j */
    public void mo1031j(PorterDuff.Mode tintMode) {
        if (this.f831e == null) {
            this.f831e = new C0203u0();
        }
        C0203u0 u0Var = this.f831e;
        u0Var.f1041b = tintMode;
        u0Var.f1042c = true;
        mo1023b();
    }

    /* renamed from: d */
    public PorterDuff.Mode mo1025d() {
        C0203u0 u0Var = this.f831e;
        if (u0Var != null) {
            return u0Var.f1041b;
        }
        return null;
    }

    /* renamed from: b */
    public void mo1023b() {
        Drawable background = this.f827a.getBackground();
        if (background == null) {
            return;
        }
        if (!mo1032k() || !mo1022a(background)) {
            C0203u0 u0Var = this.f831e;
            if (u0Var != null) {
                C0160j.m886i(background, u0Var, this.f827a.getDrawableState());
                return;
            }
            C0203u0 u0Var2 = this.f830d;
            if (u0Var2 != null) {
                C0160j.m886i(background, u0Var2, this.f827a.getDrawableState());
            }
        }
    }

    /* renamed from: h */
    public void mo1029h(ColorStateList tint) {
        if (tint != null) {
            if (this.f830d == null) {
                this.f830d = new C0203u0();
            }
            C0203u0 u0Var = this.f830d;
            u0Var.f1040a = tint;
            u0Var.f1043d = true;
        } else {
            this.f830d = null;
        }
        mo1023b();
    }

    /* renamed from: k */
    public final boolean mo1032k() {
        int sdk = Build.VERSION.SDK_INT;
        if (sdk <= 21) {
            return sdk == 21;
        }
        if (this.f830d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo1022a(Drawable background) {
        if (this.f832f == null) {
            this.f832f = new C0203u0();
        }
        C0203u0 info = this.f832f;
        info.mo1425a();
        ColorStateList tintList = C0460r.m2276m(this.f827a);
        if (tintList != null) {
            info.f1043d = true;
            info.f1040a = tintList;
        }
        PorterDuff.Mode mode = C0460r.m2278n(this.f827a);
        if (mode != null) {
            info.f1042c = true;
            info.f1041b = mode;
        }
        if (!info.f1043d && !info.f1042c) {
            return false;
        }
        C0160j.m886i(background, info, this.f827a.getDrawableState());
        return true;
    }
}
