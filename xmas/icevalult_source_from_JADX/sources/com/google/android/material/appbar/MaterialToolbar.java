package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import p000a.p025h.p038m.C0460r;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.C0989j;
import p066b.p067a.p068a.p069a.p070a0.C0921g;
import p066b.p067a.p068a.p069a.p076g0.C0953g;
import p066b.p067a.p068a.p069a.p076g0.C0957h;

public class MaterialToolbar extends Toolbar {

    /* renamed from: Q */
    public static final int f4645Q = C0989j.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context, AttributeSet attrs) {
        this(context, attrs, C0924b.f3847A);
    }

    public MaterialToolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(C0921g.m5049f(context, attrs, defStyleAttr, f4645Q), attrs, defStyleAttr);
        mo6465O(getContext());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0957h.m5178e(this);
    }

    public void setElevation(float elevation) {
        super.setElevation(elevation);
        C0957h.m5177d(this, elevation);
    }

    /* renamed from: O */
    public final void mo6465O(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C0953g materialShapeDrawable = new C0953g();
            materialShapeDrawable.mo5588T(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            materialShapeDrawable.mo5581L(context);
            materialShapeDrawable.mo5587S(C0460r.m2284q(this));
            C0460r.m2263f0(this, materialShapeDrawable);
        }
    }
}
