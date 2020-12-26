package p000a.p059r.p060a.p061a;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p025h.p029f.p030j.C0371b;

/* renamed from: a.r.a.a.g */
public abstract class C0743g extends Drawable implements C0371b {

    /* renamed from: b */
    public Drawable f2788b;

    public void setColorFilter(int color, PorterDuff.Mode mode) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.setColorFilter(color, mode);
        } else {
            super.setColorFilter(color, mode);
        }
    }

    public boolean onLevelChange(int level) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.setLevel(level);
        }
        return super.onLevelChange(level);
    }

    public void setHotspot(float x, float y) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            C0370a.m1941k(drawable, x, y);
        }
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            C0370a.m1942l(drawable, left, top, right, bottom);
        }
    }

    public void setFilterBitmap(boolean filter) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.setFilterBitmap(filter);
        }
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            C0370a.m1939i(drawable);
        }
    }

    public void applyTheme(Resources.Theme t) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            C0370a.m1931a(drawable, t);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public boolean getPadding(Rect padding) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.getPadding(padding);
        }
        return super.getPadding(padding);
    }

    public int[] getState() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void setChangingConfigurations(int configs) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            drawable.setChangingConfigurations(configs);
        } else {
            super.setChangingConfigurations(configs);
        }
    }

    public boolean setState(int[] stateSet) {
        Drawable drawable = this.f2788b;
        if (drawable != null) {
            return drawable.setState(stateSet);
        }
        return super.setState(stateSet);
    }
}
