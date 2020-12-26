package p066b.p067a.p068a.p069a.p073d0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p002b.p011p.C0218w0;

/* renamed from: b.a.a.a.d0.c */
public class C0932c {
    /* renamed from: a */
    public static ColorStateList m5073a(Context context, TypedArray attributes, int index) {
        int color;
        int resourceId;
        ColorStateList value;
        if (attributes.hasValue(index) && (resourceId = attributes.getResourceId(index, 0)) != 0 && (value = C0053a.m276c(context, resourceId)) != null) {
            return value;
        }
        if (Build.VERSION.SDK_INT > 15 || (color = attributes.getColor(index, -1)) == -1) {
            return attributes.getColorStateList(index);
        }
        return ColorStateList.valueOf(color);
    }

    /* renamed from: b */
    public static ColorStateList m5074b(Context context, C0218w0 attributes, int index) {
        int color;
        int resourceId;
        ColorStateList value;
        if (attributes.mo1513r(index) && (resourceId = attributes.mo1509n(index, 0)) != 0 && (value = C0053a.m276c(context, resourceId)) != null) {
            return value;
        }
        if (Build.VERSION.SDK_INT > 15 || (color = attributes.mo1497b(index, -1)) == -1) {
            return attributes.mo1498c(index);
        }
        return ColorStateList.valueOf(color);
    }

    /* renamed from: d */
    public static Drawable m5076d(Context context, TypedArray attributes, int index) {
        int resourceId;
        Drawable value;
        if (!attributes.hasValue(index) || (resourceId = attributes.getResourceId(index, 0)) == 0 || (value = C0053a.m277d(context, resourceId)) == null) {
            return attributes.getDrawable(index);
        }
        return value;
    }

    /* renamed from: f */
    public static C0933d m5078f(Context context, TypedArray attributes, int index) {
        int resourceId;
        if (!attributes.hasValue(index) || (resourceId = attributes.getResourceId(index, 0)) == 0) {
            return null;
        }
        return new C0933d(context, resourceId);
    }

    /* renamed from: c */
    public static int m5075c(Context context, TypedArray attributes, int index, int defaultValue) {
        TypedValue value = new TypedValue();
        if (!attributes.getValue(index, value) || value.type != 2) {
            return attributes.getDimensionPixelSize(index, defaultValue);
        }
        TypedArray styledAttrs = context.getTheme().obtainStyledAttributes(new int[]{value.data});
        int dimension = styledAttrs.getDimensionPixelSize(0, defaultValue);
        styledAttrs.recycle();
        return dimension;
    }

    /* renamed from: e */
    public static int m5077e(TypedArray attributes, int a, int b) {
        if (attributes.hasValue(a)) {
            return a;
        }
        return b;
    }
}
