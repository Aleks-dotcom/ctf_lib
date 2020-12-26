package p000a.p025h.p038m;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p000a.p025h.p031g.p032a.C0377b;

/* renamed from: a.h.m.g */
public final class C0449g {
    /* renamed from: a */
    public static MenuItem m2186a(MenuItem item, C0441b provider) {
        if (item instanceof C0377b) {
            return ((C0377b) item).mo486b(provider);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return item;
    }

    /* renamed from: c */
    public static void m2188c(MenuItem item, CharSequence contentDescription) {
        if (item instanceof C0377b) {
            ((C0377b) item).setContentDescription(contentDescription);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setContentDescription(contentDescription);
        }
    }

    /* renamed from: g */
    public static void m2192g(MenuItem item, CharSequence tooltipText) {
        if (item instanceof C0377b) {
            ((C0377b) item).setTooltipText(tooltipText);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setTooltipText(tooltipText);
        }
    }

    /* renamed from: f */
    public static void m2191f(MenuItem item, char numericChar, int numericModifiers) {
        if (item instanceof C0377b) {
            ((C0377b) item).setNumericShortcut(numericChar, numericModifiers);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setNumericShortcut(numericChar, numericModifiers);
        }
    }

    /* renamed from: b */
    public static void m2187b(MenuItem item, char alphaChar, int alphaModifiers) {
        if (item instanceof C0377b) {
            ((C0377b) item).setAlphabeticShortcut(alphaChar, alphaModifiers);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setAlphabeticShortcut(alphaChar, alphaModifiers);
        }
    }

    /* renamed from: d */
    public static void m2189d(MenuItem item, ColorStateList tint) {
        if (item instanceof C0377b) {
            ((C0377b) item).setIconTintList(tint);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setIconTintList(tint);
        }
    }

    /* renamed from: e */
    public static void m2190e(MenuItem item, PorterDuff.Mode tintMode) {
        if (item instanceof C0377b) {
            ((C0377b) item).setIconTintMode(tintMode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setIconTintMode(tintMode);
        }
    }
}
