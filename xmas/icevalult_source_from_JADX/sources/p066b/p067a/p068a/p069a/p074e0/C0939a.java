package p066b.p067a.p068a.p069a.p074e0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p000a.p025h.p029f.p030j.C0371b;
import p066b.p067a.p068a.p069a.p076g0.C0953g;
import p066b.p067a.p068a.p069a.p076g0.C0960k;
import p066b.p067a.p068a.p069a.p076g0.C0975n;

/* renamed from: b.a.a.a.e0.a */
public class C0939a extends Drawable implements C0975n, C0371b {

    /* renamed from: b */
    public C0941b f3878b;

    public /* bridge */ /* synthetic */ Drawable mutate() {
        mo5541a();
        return this;
    }

    public C0939a(C0960k shapeAppearanceModel) {
        this(new C0941b(new C0953g(shapeAppearanceModel)));
    }

    public C0939a(C0941b state) {
        this.f3878b = state;
    }

    public void setTint(int tintColor) {
        this.f3878b.f3879a.setTint(tintColor);
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        this.f3878b.f3879a.setTintMode(tintMode);
    }

    public void setTintList(ColorStateList tintList) {
        this.f3878b.f3879a.setTintList(tintList);
    }

    public void setShapeAppearanceModel(C0960k shapeAppearanceModel) {
        this.f3878b.f3879a.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public boolean isStateful() {
        return true;
    }

    public boolean onStateChange(int[] stateSet) {
        boolean changed = super.onStateChange(stateSet);
        if (this.f3878b.f3879a.setState(stateSet)) {
            changed = true;
        }
        boolean shouldDrawRipple = C0942b.m5100b(stateSet);
        C0941b bVar = this.f3878b;
        if (bVar.f3880b == shouldDrawRipple) {
            return changed;
        }
        bVar.f3880b = shouldDrawRipple;
        return true;
    }

    public void draw(Canvas canvas) {
        C0941b bVar = this.f3878b;
        if (bVar.f3880b) {
            bVar.f3879a.draw(canvas);
        }
    }

    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        this.f3878b.f3879a.setBounds(bounds);
    }

    public Drawable.ConstantState getConstantState() {
        return this.f3878b;
    }

    /* renamed from: a */
    public C0939a mo5541a() {
        this.f3878b = new C0941b(this.f3878b);
        return this;
    }

    public void setAlpha(int alpha) {
        this.f3878b.f3879a.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3878b.f3879a.setColorFilter(colorFilter);
    }

    public int getOpacity() {
        return this.f3878b.f3879a.getOpacity();
    }

    /* renamed from: b.a.a.a.e0.a$b */
    public static final class C0941b extends Drawable.ConstantState {

        /* renamed from: a */
        public C0953g f3879a;

        /* renamed from: b */
        public boolean f3880b;

        public C0941b(C0953g delegate) {
            this.f3879a = delegate;
            this.f3880b = false;
        }

        public C0941b(C0941b orig) {
            this.f3879a = (C0953g) orig.f3879a.getConstantState().newDrawable();
            this.f3880b = orig.f3880b;
        }

        /* renamed from: a */
        public C0939a newDrawable() {
            return new C0939a(new C0941b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }
    }
}
