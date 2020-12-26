package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000a.p002b.p011p.C0227z;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.C1020k;
import p066b.p067a.p068a.p069a.p073d0.C0931b;
import p066b.p067a.p068a.p069a.p073d0.C0932c;

public class MaterialTextView extends C0227z {
    public MaterialTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public MaterialTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        int resId;
        if (m6363g(context)) {
            Resources.Theme theme = context.getTheme();
            if (!m6366j(context, theme, attrs, defStyleAttr, defStyleRes) && (resId = m6364h(theme, attrs, defStyleAttr, defStyleRes)) != -1) {
                mo7152f(theme, resId);
            }
        }
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        if (m6363g(context)) {
            mo7152f(context.getTheme(), resId);
        }
    }

    /* renamed from: f */
    public final void mo7152f(Resources.Theme theme, int resId) {
        TypedArray attributes = theme.obtainStyledAttributes(resId, C1020k.f4274q1);
        int lineHeight = m6365i(getContext(), attributes, C1020k.f4278r1, C1020k.f4282s1);
        attributes.recycle();
        if (lineHeight >= 0) {
            setLineHeight(lineHeight);
        }
    }

    /* renamed from: g */
    public static boolean m6363g(Context context) {
        return C0931b.m5070b(context, C0924b.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: i */
    public static int m6365i(Context context, TypedArray attributes, int... indices) {
        int lineHeight = -1;
        for (int index = 0; index < indices.length && lineHeight < 0; index++) {
            lineHeight = C0932c.m5075c(context, attributes, indices[index], -1);
        }
        return lineHeight;
    }

    /* renamed from: j */
    public static boolean m6366j(Context context, Resources.Theme theme, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray attributes = theme.obtainStyledAttributes(attrs, C1020k.f4286t1, defStyleAttr, defStyleRes);
        int lineHeight = m6365i(context, attributes, C1020k.f4294v1, C1020k.f4298w1);
        attributes.recycle();
        if (lineHeight != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static int m6364h(Resources.Theme theme, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray attributes = theme.obtainStyledAttributes(attrs, C1020k.f4286t1, defStyleAttr, defStyleRes);
        int appearanceAttrId = attributes.getResourceId(C1020k.f4290u1, -1);
        attributes.recycle();
        return appearanceAttrId;
    }
}
