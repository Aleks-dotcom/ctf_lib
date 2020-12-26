package p066b.p067a.p068a.p069a.p070a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000a.p002b.p009o.C0076d;
import p000a.p002b.p011p.C0218w0;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.C1020k;

/* renamed from: b.a.a.a.a0.g */
public final class C0921g {

    /* renamed from: a */
    public static final int[] f3842a = {C0924b.colorPrimary};

    /* renamed from: b */
    public static final int[] f3843b = {C0924b.colorPrimaryVariant};

    /* renamed from: c */
    public static final int[] f3844c = {16842752, C0924b.theme};

    /* renamed from: d */
    public static final int[] f3845d = {C0924b.materialThemeOverlay};

    /* renamed from: k */
    public static TypedArray m5054k(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes, int... textAppearanceResIndices) {
        m5045b(context, set, defStyleAttr, defStyleRes);
        m5047d(context, set, attrs, defStyleAttr, defStyleRes, textAppearanceResIndices);
        return context.obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes);
    }

    /* renamed from: l */
    public static C0218w0 m5055l(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes, int... textAppearanceResIndices) {
        m5045b(context, set, defStyleAttr, defStyleRes);
        m5047d(context, set, attrs, defStyleAttr, defStyleRes, textAppearanceResIndices);
        return C0218w0.m1093u(context, set, attrs, defStyleAttr, defStyleRes);
    }

    /* renamed from: b */
    public static void m5045b(Context context, AttributeSet set, int defStyleAttr, int defStyleRes) {
        TypedArray a = context.obtainStyledAttributes(set, C1020k.f4216c3, defStyleAttr, defStyleRes);
        boolean enforceMaterialTheme = a.getBoolean(C1020k.f4226e3, false);
        a.recycle();
        if (enforceMaterialTheme) {
            TypedValue isMaterialTheme = new TypedValue();
            if (!context.getTheme().resolveAttribute(C0924b.isMaterialTheme, isMaterialTheme, true) || (isMaterialTheme.type == 18 && isMaterialTheme.data == 0)) {
                m5046c(context);
            }
        }
        m5044a(context);
    }

    /* renamed from: d */
    public static void m5047d(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes, int... textAppearanceResIndices) {
        TypedArray themeEnforcementAttrs = context.obtainStyledAttributes(set, C1020k.f4216c3, defStyleAttr, defStyleRes);
        boolean validTextAppearance = false;
        if (!themeEnforcementAttrs.getBoolean(C1020k.f4231f3, false)) {
            themeEnforcementAttrs.recycle();
            return;
        }
        if (textAppearanceResIndices != null && textAppearanceResIndices.length != 0) {
            validTextAppearance = m5050g(context, set, attrs, defStyleAttr, defStyleRes, textAppearanceResIndices);
        } else if (themeEnforcementAttrs.getResourceId(C1020k.f4221d3, -1) != -1) {
            validTextAppearance = true;
        }
        themeEnforcementAttrs.recycle();
        if (!validTextAppearance) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: g */
    public static boolean m5050g(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes, int... textAppearanceResIndices) {
        TypedArray componentAttrs = context.obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes);
        for (int customTextAppearanceIndex : textAppearanceResIndices) {
            if (componentAttrs.getResourceId(customTextAppearanceIndex, -1) == -1) {
                componentAttrs.recycle();
                return false;
            }
        }
        componentAttrs.recycle();
        return true;
    }

    /* renamed from: a */
    public static void m5044a(Context context) {
        m5048e(context, f3842a, "Theme.AppCompat");
    }

    /* renamed from: c */
    public static void m5046c(Context context) {
        m5048e(context, f3843b, "Theme.MaterialComponents");
    }

    /* renamed from: h */
    public static boolean m5051h(Context context, int[] themeAttributes) {
        TypedArray a = context.obtainStyledAttributes(themeAttributes);
        for (int i = 0; i < themeAttributes.length; i++) {
            if (!a.hasValue(i)) {
                a.recycle();
                return false;
            }
        }
        a.recycle();
        return true;
    }

    /* renamed from: e */
    public static void m5048e(Context context, int[] themeAttributes, String themeName) {
        if (!m5051h(context, themeAttributes)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + themeName + " (or a descendant).");
        }
    }

    /* renamed from: f */
    public static Context m5049f(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        int materialThemeOverlayId = m5053j(context, attrs, defStyleAttr, defStyleRes);
        if (materialThemeOverlayId == 0) {
            return context;
        }
        if ((context instanceof C0076d) && ((C0076d) context).mo419b() == materialThemeOverlayId) {
            return context;
        }
        Context context2 = new C0076d(context, materialThemeOverlayId);
        int androidThemeOverlayId = m5052i(context2, attrs);
        if (androidThemeOverlayId != 0) {
            return new C0076d(context2, androidThemeOverlayId);
        }
        return context2;
    }

    /* renamed from: i */
    public static int m5052i(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs, f3844c);
        int androidThemeId = a.getResourceId(0, 0);
        int appThemeId = a.getResourceId(1, 0);
        a.recycle();
        if (androidThemeId != 0) {
            return androidThemeId;
        }
        return appThemeId;
    }

    /* renamed from: j */
    public static int m5053j(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray a = context.obtainStyledAttributes(attrs, f3845d, defStyleAttr, defStyleRes);
        int materialThemeOverlayId = a.getResourceId(0, 0);
        a.recycle();
        return materialThemeOverlayId;
    }
}
