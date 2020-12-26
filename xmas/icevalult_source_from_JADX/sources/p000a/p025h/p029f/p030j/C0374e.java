package p000a.p025h.p029f.p030j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: a.h.f.j.e */
public class C0374e extends C0373d {

    /* renamed from: i */
    public static Method f1889i;

    public C0374e(Drawable drawable) {
        super(drawable);
        mo2326g();
    }

    public C0374e(C0375f state, Resources resources) {
        super(state, resources);
        mo2326g();
    }

    public void setHotspot(float x, float y) {
        this.f1888g.setHotspot(x, y);
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        this.f1888g.setHotspotBounds(left, top, right, bottom);
    }

    public void getOutline(Outline outline) {
        this.f1888g.getOutline(outline);
    }

    public Rect getDirtyBounds() {
        return this.f1888g.getDirtyBounds();
    }

    public void setTintList(ColorStateList tint) {
        if (mo2293c()) {
            super.setTintList(tint);
        } else {
            this.f1888g.setTintList(tint);
        }
    }

    public void setTint(int tintColor) {
        if (mo2293c()) {
            super.setTint(tintColor);
        } else {
            this.f1888g.setTint(tintColor);
        }
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        if (mo2293c()) {
            super.setTintMode(tintMode);
        } else {
            this.f1888g.setTintMode(tintMode);
        }
    }

    public boolean setState(int[] stateSet) {
        if (!super.setState(stateSet)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    /* renamed from: c */
    public boolean mo2293c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f1888g;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f1888g;
        if (!(drawable == null || (method = f1889i) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception ex) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", ex);
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void mo2326g() {
        if (f1889i == null) {
            try {
                f1889i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception ex) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", ex);
            }
        }
    }
}
