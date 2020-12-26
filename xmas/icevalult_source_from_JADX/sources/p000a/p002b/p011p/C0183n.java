package p000a.p002b.p011p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import p000a.p002b.C0012j;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p025h.p040n.C0486e;

/* renamed from: a.b.p.n */
public class C0183n {

    /* renamed from: a */
    public final ImageView f963a;

    /* renamed from: b */
    public C0203u0 f964b;

    /* renamed from: c */
    public C0203u0 f965c;

    /* renamed from: d */
    public C0203u0 f966d;

    public C0183n(ImageView view) {
        this.f963a = view;
    }

    /* renamed from: f */
    public void mo1273f(AttributeSet attrs, int defStyleAttr) {
        int id;
        C0218w0 a = C0218w0.m1093u(this.f963a.getContext(), attrs, C0012j.f56M, defStyleAttr, 0);
        try {
            Drawable drawable = this.f963a.getDrawable();
            if (!(drawable != null || (id = a.mo1509n(C0012j.f60N, -1)) == -1 || (drawable = C0053a.m277d(this.f963a.getContext(), id)) == null)) {
                this.f963a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0145e0.m825b(drawable);
            }
            int i = C0012j.f64O;
            if (a.mo1513r(i)) {
                C0486e.m2417c(this.f963a, a.mo1498c(i));
            }
            int i2 = C0012j.f68P;
            if (a.mo1513r(i2)) {
                C0486e.m2418d(this.f963a, C0145e0.m827d(a.mo1506k(i2, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.mo1514v();
        }
    }

    /* renamed from: g */
    public void mo1274g(int resId) {
        if (resId != 0) {
            Drawable d = C0053a.m277d(this.f963a.getContext(), resId);
            if (d != null) {
                C0145e0.m825b(d);
            }
            this.f963a.setImageDrawable(d);
        } else {
            this.f963a.setImageDrawable((Drawable) null);
        }
        mo1269b();
    }

    /* renamed from: e */
    public boolean mo1272e() {
        Drawable background = this.f963a.getBackground();
        if (Build.VERSION.SDK_INT < 21 || !(background instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public void mo1275h(ColorStateList tint) {
        if (this.f965c == null) {
            this.f965c = new C0203u0();
        }
        C0203u0 u0Var = this.f965c;
        u0Var.f1040a = tint;
        u0Var.f1043d = true;
        mo1269b();
    }

    /* renamed from: c */
    public ColorStateList mo1270c() {
        C0203u0 u0Var = this.f965c;
        if (u0Var != null) {
            return u0Var.f1040a;
        }
        return null;
    }

    /* renamed from: i */
    public void mo1276i(PorterDuff.Mode tintMode) {
        if (this.f965c == null) {
            this.f965c = new C0203u0();
        }
        C0203u0 u0Var = this.f965c;
        u0Var.f1041b = tintMode;
        u0Var.f1042c = true;
        mo1269b();
    }

    /* renamed from: d */
    public PorterDuff.Mode mo1271d() {
        C0203u0 u0Var = this.f965c;
        if (u0Var != null) {
            return u0Var.f1041b;
        }
        return null;
    }

    /* renamed from: b */
    public void mo1269b() {
        Drawable imageViewDrawable = this.f963a.getDrawable();
        if (imageViewDrawable != null) {
            C0145e0.m825b(imageViewDrawable);
        }
        if (imageViewDrawable == null) {
            return;
        }
        if (!mo1277j() || !mo1268a(imageViewDrawable)) {
            C0203u0 u0Var = this.f965c;
            if (u0Var != null) {
                C0160j.m886i(imageViewDrawable, u0Var, this.f963a.getDrawableState());
                return;
            }
            C0203u0 u0Var2 = this.f964b;
            if (u0Var2 != null) {
                C0160j.m886i(imageViewDrawable, u0Var2, this.f963a.getDrawableState());
            }
        }
    }

    /* renamed from: j */
    public final boolean mo1277j() {
        int sdk = Build.VERSION.SDK_INT;
        if (sdk <= 21) {
            return sdk == 21;
        }
        if (this.f964b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo1268a(Drawable imageSource) {
        if (this.f966d == null) {
            this.f966d = new C0203u0();
        }
        C0203u0 info = this.f966d;
        info.mo1425a();
        ColorStateList tintList = C0486e.m2415a(this.f963a);
        if (tintList != null) {
            info.f1043d = true;
            info.f1040a = tintList;
        }
        PorterDuff.Mode mode = C0486e.m2416b(this.f963a);
        if (mode != null) {
            info.f1042c = true;
            info.f1041b = mode;
        }
        if (!info.f1043d && !info.f1042c) {
            return false;
        }
        C0160j.m886i(imageSource, info, this.f963a.getDrawableState());
        return true;
    }
}
