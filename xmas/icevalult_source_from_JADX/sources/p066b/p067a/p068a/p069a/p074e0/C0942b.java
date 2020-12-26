package p066b.p067a.p068a.p069a.p074e0;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: b.a.a.a.e0.b */
public class C0942b {

    /* renamed from: a */
    public static final boolean f3881a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    public static final int[] f3882b = {16842910, 16842919};

    /* renamed from: c */
    public static final String f3883c = C0942b.class.getSimpleName();

    static {
        new int[1][0] = 16842919;
        int[] iArr = {16843623, 16842908};
        new int[1][0] = 16842908;
        new int[1][0] = 16843623;
        int[] iArr2 = {16842913, 16842919};
        int[] iArr3 = {16842913, 16843623, 16842908};
        int[] iArr4 = {16842913, 16842908};
        int[] iArr5 = {16842913, 16843623};
        new int[1][0] = 16842913;
    }

    /* renamed from: a */
    public static ColorStateList m5099a(ColorStateList rippleColor) {
        if (rippleColor == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(rippleColor.getDefaultColor()) == 0 && Color.alpha(rippleColor.getColorForState(f3882b, 0)) != 0) {
            Log.w(f3883c, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return rippleColor;
    }

    /* renamed from: b */
    public static boolean m5100b(int[] stateSet) {
        boolean enabled = false;
        boolean interactedState = false;
        for (int state : stateSet) {
            if (state == 16842910) {
                enabled = true;
            } else if (state == 16842908) {
                interactedState = true;
            } else if (state == 16842919) {
                interactedState = true;
            } else if (state == 16843623) {
                interactedState = true;
            }
        }
        if (!enabled || !interactedState) {
            return false;
        }
        return true;
    }
}
