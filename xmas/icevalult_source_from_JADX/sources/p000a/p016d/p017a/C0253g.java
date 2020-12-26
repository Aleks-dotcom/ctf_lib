package p000a.p016d.p017a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: a.d.a.g */
public class C0253g extends Drawable {

    /* renamed from: a */
    public float f1169a;

    /* renamed from: b */
    public final Paint f1170b;

    /* renamed from: c */
    public final RectF f1171c;

    /* renamed from: d */
    public final Rect f1172d;

    /* renamed from: e */
    public float f1173e;

    /* renamed from: f */
    public boolean f1174f;

    /* renamed from: g */
    public boolean f1175g;

    /* renamed from: h */
    public ColorStateList f1176h;

    /* renamed from: i */
    public PorterDuffColorFilter f1177i;

    /* renamed from: j */
    public ColorStateList f1178j;

    /* renamed from: k */
    public PorterDuff.Mode f1179k;

    /* renamed from: e */
    public final void mo1704e(ColorStateList color) {
        ColorStateList valueOf = color == null ? ColorStateList.valueOf(0) : color;
        this.f1176h = valueOf;
        this.f1170b.setColor(valueOf.getColorForState(getState(), this.f1176h.getDefaultColor()));
    }

    /* renamed from: g */
    public void mo1706g(float padding, boolean insetForPadding, boolean insetForRadius) {
        if (padding != this.f1173e || this.f1174f != insetForPadding || this.f1175g != insetForRadius) {
            this.f1173e = padding;
            this.f1174f = insetForPadding;
            this.f1175g = insetForRadius;
            mo1710i((Rect) null);
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public float mo1701c() {
        return this.f1173e;
    }

    public void draw(Canvas canvas) {
        boolean clearColorFilter;
        Paint paint = this.f1170b;
        if (this.f1177i == null || paint.getColorFilter() != null) {
            clearColorFilter = false;
        } else {
            paint.setColorFilter(this.f1177i);
            clearColorFilter = true;
        }
        RectF rectF = this.f1171c;
        float f = this.f1169a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (clearColorFilter) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    /* renamed from: i */
    public final void mo1710i(Rect bounds) {
        if (bounds == null) {
            bounds = getBounds();
        }
        this.f1171c.set((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
        this.f1172d.set(bounds);
        if (this.f1174f) {
            float vInset = C0254h.m1290d(this.f1173e, this.f1169a, this.f1175g);
            this.f1172d.inset((int) Math.ceil((double) C0254h.m1289c(this.f1173e, this.f1169a, this.f1175g)), (int) Math.ceil((double) vInset));
            this.f1171c.set(this.f1172d);
        }
    }

    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        mo1710i(bounds);
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1172d, this.f1169a);
    }

    /* renamed from: h */
    public void mo1709h(float radius) {
        if (radius != this.f1169a) {
            this.f1169a = radius;
            mo1710i((Rect) null);
            invalidateSelf();
        }
    }

    public void setAlpha(int alpha) {
        this.f1170b.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f1170b.setColorFilter(cf);
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: d */
    public float mo1702d() {
        return this.f1169a;
    }

    /* renamed from: f */
    public void mo1705f(ColorStateList color) {
        mo1704e(color);
        invalidateSelf();
    }

    /* renamed from: b */
    public ColorStateList mo1700b() {
        return this.f1176h;
    }

    public void setTintList(ColorStateList tint) {
        this.f1178j = tint;
        this.f1177i = mo1699a(tint, this.f1179k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        this.f1179k = tintMode;
        this.f1177i = mo1699a(this.f1178j, tintMode);
        invalidateSelf();
    }

    public boolean onStateChange(int[] stateSet) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1176h;
        int newColor = colorStateList.getColorForState(stateSet, colorStateList.getDefaultColor());
        boolean colorChanged = newColor != this.f1170b.getColor();
        if (colorChanged) {
            this.f1170b.setColor(newColor);
        }
        ColorStateList colorStateList2 = this.f1178j;
        if (colorStateList2 == null || (mode = this.f1179k) == null) {
            return colorChanged;
        }
        this.f1177i = mo1699a(colorStateList2, mode);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f1176h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f1178j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f1176h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p016d.p017a.C0253g.isStateful():boolean");
    }

    /* renamed from: a */
    public final PorterDuffColorFilter mo1699a(ColorStateList tint, PorterDuff.Mode tintMode) {
        if (tint == null || tintMode == null) {
            return null;
        }
        return new PorterDuffColorFilter(tint.getColorForState(getState(), 0), tintMode);
    }
}
