package p000a.p002b.p011p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000a.p025h.p029f.C0356a;

/* renamed from: a.b.p.r0 */
public class C0197r0 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f1024a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f1025b = {-16842910};

    /* renamed from: c */
    public static final int[] f1026c = {16842908};

    /* renamed from: d */
    public static final int[] f1027d = {16842919};

    /* renamed from: e */
    public static final int[] f1028e = {16842912};

    /* renamed from: f */
    public static final int[] f1029f = new int[0];

    /* renamed from: g */
    public static final int[] f1030g = new int[1];

    static {
        new int[1][0] = 16843518;
        new int[1][0] = 16842913;
        int[] iArr = {-16842919, -16842908};
    }

    /* renamed from: b */
    public static int m1039b(Context context, int attr) {
        int[] iArr = f1030g;
        iArr[0] = attr;
        C0218w0 a = C0218w0.m1092t(context, (AttributeSet) null, iArr);
        try {
            return a.mo1497b(0, 0);
        } finally {
            a.mo1514v();
        }
    }

    /* renamed from: d */
    public static ColorStateList m1041d(Context context, int attr) {
        int[] iArr = f1030g;
        iArr[0] = attr;
        C0218w0 a = C0218w0.m1092t(context, (AttributeSet) null, iArr);
        try {
            return a.mo1498c(0);
        } finally {
            a.mo1514v();
        }
    }

    /* renamed from: a */
    public static int m1038a(Context context, int attr) {
        ColorStateList csl = m1041d(context, attr);
        if (csl != null && csl.isStateful()) {
            return csl.getColorForState(f1025b, csl.getDefaultColor());
        }
        TypedValue tv = m1042e();
        context.getTheme().resolveAttribute(16842803, tv, true);
        return m1040c(context, attr, tv.getFloat());
    }

    /* renamed from: e */
    public static TypedValue m1042e() {
        ThreadLocal<TypedValue> threadLocal = f1024a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: c */
    public static int m1040c(Context context, int attr, float alpha) {
        int color = m1039b(context, attr);
        return C0356a.m1849d(color, Math.round(((float) Color.alpha(color)) * alpha));
    }
}
