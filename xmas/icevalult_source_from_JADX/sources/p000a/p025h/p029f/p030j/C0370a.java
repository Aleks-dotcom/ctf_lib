package p000a.p025h.p029f.p030j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: a.h.f.j.a */
public final class C0370a {

    /* renamed from: a */
    public static Method f1878a;

    /* renamed from: b */
    public static boolean f1879b;

    /* renamed from: c */
    public static Method f1880c;

    /* renamed from: d */
    public static boolean f1881d;

    @Deprecated
    /* renamed from: i */
    public static void m1939i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m1940j(Drawable drawable, boolean mirrored) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(mirrored);
        }
    }

    /* renamed from: h */
    public static boolean m1938h(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    /* renamed from: k */
    public static void m1941k(Drawable drawable, float x, float y) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(x, y);
        }
    }

    /* renamed from: l */
    public static void m1942l(Drawable drawable, int left, int top, int right, int bottom) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(left, top, right, bottom);
        }
    }

    /* renamed from: n */
    public static void m1944n(Drawable drawable, int tint) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(tint);
        } else if (drawable instanceof C0371b) {
            ((C0371b) drawable).setTint(tint);
        }
    }

    /* renamed from: o */
    public static void m1945o(Drawable drawable, ColorStateList tint) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(tint);
        } else if (drawable instanceof C0371b) {
            ((C0371b) drawable).setTintList(tint);
        }
    }

    /* renamed from: p */
    public static void m1946p(Drawable drawable, PorterDuff.Mode tintMode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(tintMode);
        } else if (drawable instanceof C0371b) {
            ((C0371b) drawable).setTintMode(tintMode);
        }
    }

    /* renamed from: d */
    public static int m1934d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m1931a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: b */
    public static boolean m1932b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: e */
    public static ColorFilter m1935e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* renamed from: c */
    public static void m1933c(Drawable drawable) {
        DrawableContainer.DrawableContainerState state;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            drawable.clearColorFilter();
        } else if (i >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                m1933c(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof C0372c) {
                m1933c(((C0372c) drawable).mo2291a());
            } else if ((drawable instanceof DrawableContainer) && (state = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int count = state.getChildCount();
                for (int i2 = 0; i2 < count; i2++) {
                    Drawable child = state.getChild(i2);
                    if (child != null) {
                        m1933c(child);
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    /* renamed from: g */
    public static void m1937g(Drawable drawable, Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(res, parser, attrs, theme);
        } else {
            drawable.inflate(res, parser, attrs);
        }
    }

    /* renamed from: r */
    public static Drawable m1948r(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable;
        }
        if (i >= 21) {
            if (!(drawable instanceof C0371b)) {
                return new C0374e(drawable);
            }
            return drawable;
        } else if (!(drawable instanceof C0371b)) {
            return new C0373d(drawable);
        } else {
            return drawable;
        }
    }

    /* renamed from: q */
    public static <T extends Drawable> T m1947q(Drawable drawable) {
        if (drawable instanceof C0372c) {
            return ((C0372c) drawable).mo2291a();
        }
        return drawable;
    }

    /* renamed from: m */
    public static boolean m1943m(Drawable drawable, int layoutDirection) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.setLayoutDirection(layoutDirection);
        }
        if (i < 17) {
            return false;
        }
        if (!f1879b) {
            Class<Drawable> cls = Drawable.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f1878a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f1879b = true;
        }
        Method method = f1878a;
        if (method != null) {
            try {
                method.invoke(drawable, new Object[]{Integer.valueOf(layoutDirection)});
                return true;
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                f1878a = null;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static int m1936f(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i < 17) {
            return 0;
        }
        if (!f1881d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f1880c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            f1881d = true;
        }
        Method method = f1880c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                f1880c = null;
            }
        }
        return 0;
    }
}
