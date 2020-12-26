package p066b.p067a.p068a.p069a.p072c0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import p000a.p002b.p011p.C0198s;
import p000a.p025h.p040n.C0484c;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.C0989j;
import p066b.p067a.p068a.p069a.p091u.C1060a;

/* renamed from: b.a.a.a.c0.a */
public class C0927a extends C0198s {

    /* renamed from: g */
    public static final int f3853g = C0989j.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: h */
    public static final int[][] f3854h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    public ColorStateList f3855e;

    /* renamed from: f */
    public boolean f3856f;

    public C0927a(Context context, AttributeSet attrs) {
        this(context, attrs, C0924b.f3852r);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0927a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f3853g
            android.content.Context r0 = p066b.p067a.p068a.p069a.p070a0.C0921g.m5049f(r8, r9, r10, r4)
            r7.<init>(r0, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p066b.p067a.p068a.p069a.C1020k.f4254l1
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r0 = p066b.p067a.p068a.p069a.p070a0.C0921g.m5054k(r0, r1, r2, r3, r4, r5)
            int r1 = p066b.p067a.p068a.p069a.C1020k.f4258m1
            boolean r1 = r0.getBoolean(r1, r6)
            r7.f3856f = r1
            r0.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p066b.p067a.p068a.p069a.p072c0.C0927a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3856f && C0484c.m2411b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean useMaterialThemeColors) {
        this.f3856f = useMaterialThemeColors;
        if (useMaterialThemeColors) {
            C0484c.m2412c(this, getMaterialThemeColorsTintList());
        } else {
            C0484c.m2412c(this, (ColorStateList) null);
        }
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3855e == null) {
            int colorControlActivated = C1060a.m5721c(this, C0924b.f3849e);
            int colorOnSurface = C1060a.m5721c(this, C0924b.colorOnSurface);
            int colorSurface = C1060a.m5721c(this, C0924b.colorSurface);
            int[][] iArr = f3854h;
            int[] radioButtonColorList = new int[iArr.length];
            radioButtonColorList[0] = C1060a.m5724f(colorSurface, colorControlActivated, 1.0f);
            radioButtonColorList[1] = C1060a.m5724f(colorSurface, colorOnSurface, 0.54f);
            radioButtonColorList[2] = C1060a.m5724f(colorSurface, colorOnSurface, 0.38f);
            radioButtonColorList[3] = C1060a.m5724f(colorSurface, colorOnSurface, 0.38f);
            this.f3855e = new ColorStateList(iArr, radioButtonColorList);
        }
        return this.f3855e;
    }
}
