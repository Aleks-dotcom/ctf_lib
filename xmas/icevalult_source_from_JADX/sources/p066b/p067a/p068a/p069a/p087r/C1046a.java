package p066b.p067a.p068a.p069a.p087r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import p000a.p002b.p011p.C0150g;
import p000a.p025h.p040n.C0484c;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.C0989j;
import p066b.p067a.p068a.p069a.p091u.C1060a;

/* renamed from: b.a.a.a.r.a */
public class C1046a extends C0150g {

    /* renamed from: g */
    public static final int f4391g = C0989j.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: h */
    public static final int[][] f4392h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    public ColorStateList f4393e;

    /* renamed from: f */
    public boolean f4394f;

    public C1046a(Context context, AttributeSet attrs) {
        this(context, attrs, C0924b.f3848b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1046a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f4391g
            android.content.Context r0 = p066b.p067a.p068a.p069a.p070a0.C0921g.m5049f(r8, r9, r10, r4)
            r7.<init>(r0, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p066b.p067a.p068a.p069a.C1020k.f4242i1
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r0 = p066b.p067a.p068a.p069a.p070a0.C0921g.m5054k(r0, r1, r2, r3, r4, r5)
            int r1 = p066b.p067a.p068a.p069a.C1020k.f4246j1
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L_0x0029
            android.content.res.ColorStateList r1 = p066b.p067a.p068a.p069a.p073d0.C0932c.m5073a(r8, r0, r1)
            p000a.p025h.p040n.C0484c.m2412c(r7, r1)
        L_0x0029:
            int r1 = p066b.p067a.p068a.p069a.C1020k.f4250k1
            boolean r1 = r0.getBoolean(r1, r6)
            r7.f4394f = r1
            r0.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p066b.p067a.p068a.p069a.p087r.C1046a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4394f && C0484c.m2411b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean useMaterialThemeColors) {
        this.f4394f = useMaterialThemeColors;
        if (useMaterialThemeColors) {
            C0484c.m2412c(this, getMaterialThemeColorsTintList());
        } else {
            C0484c.m2412c(this, (ColorStateList) null);
        }
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4393e == null) {
            int[][] iArr = f4392h;
            int[] checkBoxColorsList = new int[iArr.length];
            int colorControlActivated = C1060a.m5721c(this, C0924b.f3849e);
            int colorSurface = C1060a.m5721c(this, C0924b.colorSurface);
            int colorOnSurface = C1060a.m5721c(this, C0924b.colorOnSurface);
            checkBoxColorsList[0] = C1060a.m5724f(colorSurface, colorControlActivated, 1.0f);
            checkBoxColorsList[1] = C1060a.m5724f(colorSurface, colorOnSurface, 0.54f);
            checkBoxColorsList[2] = C1060a.m5724f(colorSurface, colorOnSurface, 0.38f);
            checkBoxColorsList[3] = C1060a.m5724f(colorSurface, colorOnSurface, 0.38f);
            this.f4393e = new ColorStateList(iArr, checkBoxColorsList);
        }
        return this.f4393e;
    }
}
