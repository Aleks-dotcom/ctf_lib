package p000a.p002b.p006m.p007a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p000a.p025h.p029f.p030j.C0370a;

/* renamed from: a.b.m.a.c */
public class C0067c extends Drawable implements Drawable.Callback {

    /* renamed from: b */
    public Drawable f472b;

    public C0067c(Drawable drawable) {
        mo369b(drawable);
    }

    public void draw(Canvas canvas) {
        this.f472b.draw(canvas);
    }

    public void onBoundsChange(Rect bounds) {
        this.f472b.setBounds(bounds);
    }

    public void setChangingConfigurations(int configs) {
        this.f472b.setChangingConfigurations(configs);
    }

    public int getChangingConfigurations() {
        return this.f472b.getChangingConfigurations();
    }

    public void setDither(boolean dither) {
        this.f472b.setDither(dither);
    }

    public void setFilterBitmap(boolean filter) {
        this.f472b.setFilterBitmap(filter);
    }

    public void setAlpha(int alpha) {
        this.f472b.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f472b.setColorFilter(cf);
    }

    public boolean isStateful() {
        return this.f472b.isStateful();
    }

    public boolean setState(int[] stateSet) {
        return this.f472b.setState(stateSet);
    }

    public int[] getState() {
        return this.f472b.getState();
    }

    public void jumpToCurrentState() {
        C0370a.m1939i(this.f472b);
    }

    public Drawable getCurrent() {
        return this.f472b.getCurrent();
    }

    public boolean setVisible(boolean visible, boolean restart) {
        return super.setVisible(visible, restart) || this.f472b.setVisible(visible, restart);
    }

    public int getOpacity() {
        return this.f472b.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f472b.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f472b.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f472b.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f472b.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f472b.getMinimumHeight();
    }

    public boolean getPadding(Rect padding) {
        return this.f472b.getPadding(padding);
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
        return this.f472b.setLevel(level);
    }

    public void setAutoMirrored(boolean mirrored) {
        C0370a.m1940j(this.f472b, mirrored);
    }

    public boolean isAutoMirrored() {
        return C0370a.m1938h(this.f472b);
    }

    public void setTint(int tint) {
        C0370a.m1944n(this.f472b, tint);
    }

    public void setTintList(ColorStateList tint) {
        C0370a.m1945o(this.f472b, tint);
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        C0370a.m1946p(this.f472b, tintMode);
    }

    public void setHotspot(float x, float y) {
        C0370a.m1941k(this.f472b, x, y);
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        C0370a.m1942l(this.f472b, left, top, right, bottom);
    }

    /* renamed from: a */
    public Drawable mo368a() {
        return this.f472b;
    }

    /* renamed from: b */
    public void mo369b(Drawable drawable) {
        Drawable drawable2 = this.f472b;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f472b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }
}
