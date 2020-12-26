package p000a.p025h.p029f.p030j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: a.h.f.j.d */
public class C0373d extends Drawable implements Drawable.Callback, C0372c, C0371b {

    /* renamed from: h */
    public static final PorterDuff.Mode f1882h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public int f1883b;

    /* renamed from: c */
    public PorterDuff.Mode f1884c;

    /* renamed from: d */
    public boolean f1885d;

    /* renamed from: e */
    public C0375f f1886e;

    /* renamed from: f */
    public boolean f1887f;

    /* renamed from: g */
    public Drawable f1888g;

    public C0373d(C0375f state, Resources res) {
        this.f1886e = state;
        mo2296e(res);
    }

    public C0373d(Drawable dr) {
        this.f1886e = mo2294d();
        mo2292b(dr);
    }

    /* renamed from: e */
    public final void mo2296e(Resources res) {
        Drawable.ConstantState constantState;
        C0375f fVar = this.f1886e;
        if (fVar != null && (constantState = fVar.f1891b) != null) {
            mo2292b(constantState.newDrawable(res));
        }
    }

    public void jumpToCurrentState() {
        this.f1888g.jumpToCurrentState();
    }

    public void draw(Canvas canvas) {
        this.f1888g.draw(canvas);
    }

    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f1888g;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
    }

    public void setChangingConfigurations(int configs) {
        this.f1888g.setChangingConfigurations(configs);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0375f fVar = this.f1886e;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f1888g.getChangingConfigurations();
    }

    public void setDither(boolean dither) {
        this.f1888g.setDither(dither);
    }

    public void setFilterBitmap(boolean filter) {
        this.f1888g.setFilterBitmap(filter);
    }

    public void setAlpha(int alpha) {
        this.f1888g.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f1888g.setColorFilter(cf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f1886e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r2 = this;
            boolean r0 = r2.mo2293c()
            if (r0 == 0) goto L_0x000d
            a.h.f.j.f r0 = r2.f1886e
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f1892c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r1 = r0.isStateful()
            if (r1 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r1 = r2.f1888g
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x0020
        L_0x001e:
            r1 = 1
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p025h.p029f.p030j.C0373d.isStateful():boolean");
    }

    public boolean setState(int[] stateSet) {
        return mo2297f(stateSet) || this.f1888g.setState(stateSet);
    }

    public int[] getState() {
        return this.f1888g.getState();
    }

    public Drawable getCurrent() {
        return this.f1888g.getCurrent();
    }

    public boolean setVisible(boolean visible, boolean restart) {
        return super.setVisible(visible, restart) || this.f1888g.setVisible(visible, restart);
    }

    public int getOpacity() {
        return this.f1888g.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f1888g.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f1888g.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f1888g.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f1888g.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f1888g.getMinimumHeight();
    }

    public boolean getPadding(Rect padding) {
        return this.f1888g.getPadding(padding);
    }

    public void setAutoMirrored(boolean mirrored) {
        this.f1888g.setAutoMirrored(mirrored);
    }

    public boolean isAutoMirrored() {
        return this.f1888g.isAutoMirrored();
    }

    public Drawable.ConstantState getConstantState() {
        C0375f fVar = this.f1886e;
        if (fVar == null || !fVar.mo2332a()) {
            return null;
        }
        this.f1886e.f1890a = getChangingConfigurations();
        return this.f1886e;
    }

    public Drawable mutate() {
        if (!this.f1887f && super.mutate() == this) {
            this.f1886e = mo2294d();
            Drawable drawable = this.f1888g;
            if (drawable != null) {
                drawable.mutate();
            }
            C0375f fVar = this.f1886e;
            if (fVar != null) {
                Drawable drawable2 = this.f1888g;
                fVar.f1891b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f1887f = true;
        }
        return this;
    }

    /* renamed from: d */
    public final C0375f mo2294d() {
        return new C0375f(this.f1886e);
    }

    public void invalidateDrawable(Drawable who) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        scheduleSelf(what, when);
    }

    public void unscheduleDrawable(Drawable who, Runnable what) {
        unscheduleSelf(what);
    }

    public boolean onLevelChange(int level) {
        return this.f1888g.setLevel(level);
    }

    public void setTint(int tint) {
        setTintList(ColorStateList.valueOf(tint));
    }

    public void setTintList(ColorStateList tint) {
        this.f1886e.f1892c = tint;
        mo2297f(getState());
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        this.f1886e.f1893d = tintMode;
        mo2297f(getState());
    }

    /* renamed from: f */
    public final boolean mo2297f(int[] state) {
        if (!mo2293c()) {
            return false;
        }
        C0375f fVar = this.f1886e;
        ColorStateList tintList = fVar.f1892c;
        PorterDuff.Mode tintMode = fVar.f1893d;
        if (tintList == null || tintMode == null) {
            this.f1885d = false;
            clearColorFilter();
        } else {
            int color = tintList.getColorForState(state, tintList.getDefaultColor());
            if (!(this.f1885d && color == this.f1883b && tintMode == this.f1884c)) {
                setColorFilter(color, tintMode);
                this.f1883b = color;
                this.f1884c = tintMode;
                this.f1885d = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Drawable mo2291a() {
        return this.f1888g;
    }

    /* renamed from: b */
    public final void mo2292b(Drawable dr) {
        Drawable drawable = this.f1888g;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f1888g = dr;
        if (dr != null) {
            dr.setCallback(this);
            setVisible(dr.isVisible(), true);
            setState(dr.getState());
            setLevel(dr.getLevel());
            setBounds(dr.getBounds());
            C0375f fVar = this.f1886e;
            if (fVar != null) {
                fVar.f1891b = dr.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: c */
    public boolean mo2293c() {
        return true;
    }
}
