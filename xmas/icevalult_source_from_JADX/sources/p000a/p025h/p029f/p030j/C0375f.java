package p000a.p025h.p029f.p030j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: a.h.f.j.f */
public final class C0375f extends Drawable.ConstantState {

    /* renamed from: a */
    public int f1890a;

    /* renamed from: b */
    public Drawable.ConstantState f1891b;

    /* renamed from: c */
    public ColorStateList f1892c = null;

    /* renamed from: d */
    public PorterDuff.Mode f1893d = C0373d.f1882h;

    public C0375f(C0375f orig) {
        if (orig != null) {
            this.f1890a = orig.f1890a;
            this.f1891b = orig.f1891b;
            this.f1892c = orig.f1892c;
            this.f1893d = orig.f1893d;
        }
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources res) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C0374e(this, res);
        }
        return new C0373d(this, res);
    }

    public int getChangingConfigurations() {
        int i = this.f1890a;
        Drawable.ConstantState constantState = this.f1891b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    /* renamed from: a */
    public boolean mo2332a() {
        return this.f1891b != null;
    }
}
