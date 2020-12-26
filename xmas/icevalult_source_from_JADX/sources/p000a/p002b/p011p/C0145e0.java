package p000a.p002b.p011p;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import p000a.p002b.p006m.p007a.C0067c;
import p000a.p025h.p029f.p030j.C0372c;

@SuppressLint({"RestrictedAPI"})
/* renamed from: a.b.p.e0 */
public class C0145e0 {

    /* renamed from: a */
    public static final int[] f833a = {16842912};

    /* renamed from: b */
    public static final int[] f834b = new int[0];

    static {
        new Rect();
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException e) {
            }
        }
    }

    /* renamed from: b */
    public static void m825b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m826c(drawable);
        }
    }

    /* renamed from: a */
    public static boolean m824a(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (i < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (i < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState state = drawable.getConstantState();
            if (!(state instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable child : ((DrawableContainer.DrawableContainerState) state).getChildren()) {
                if (!m824a(child)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof C0372c) {
            return m824a(((C0372c) drawable).mo2291a());
        } else {
            if (drawable instanceof C0067c) {
                return m824a(((C0067c) drawable).mo368a());
            }
            if (drawable instanceof ScaleDrawable) {
                return m824a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    /* renamed from: c */
    public static void m826c(Drawable drawable) {
        int[] originalState = drawable.getState();
        if (originalState == null || originalState.length == 0) {
            drawable.setState(f833a);
        } else {
            drawable.setState(f834b);
        }
        drawable.setState(originalState);
    }

    /* renamed from: d */
    public static PorterDuff.Mode m827d(int value, PorterDuff.Mode defaultMode) {
        if (value == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (value == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (value == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (value) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return defaultMode;
        }
    }
}
