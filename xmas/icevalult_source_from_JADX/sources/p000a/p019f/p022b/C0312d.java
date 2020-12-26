package p000a.p019f.p022b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: a.f.b.d */
public class C0312d extends ViewGroup {

    /* renamed from: b */
    public C0309c f1605b;

    /* renamed from: b */
    public C0313a generateLayoutParams(AttributeSet attrs) {
        return new C0313a(getContext(), attrs);
    }

    /* renamed from: a.f.b.d$a */
    public static class C0313a extends ConstraintLayout.C0820a {

        /* renamed from: m0 */
        public float f1606m0 = 1.0f;

        /* renamed from: n0 */
        public boolean f1607n0 = false;

        /* renamed from: o0 */
        public float f1608o0 = 0.0f;

        /* renamed from: p0 */
        public float f1609p0 = 0.0f;

        /* renamed from: q0 */
        public float f1610q0 = 0.0f;

        /* renamed from: r0 */
        public float f1611r0 = 0.0f;

        /* renamed from: s0 */
        public float f1612s0 = 1.0f;

        /* renamed from: t0 */
        public float f1613t0 = 1.0f;

        /* renamed from: u0 */
        public float f1614u0 = 0.0f;

        /* renamed from: v0 */
        public float f1615v0 = 0.0f;

        /* renamed from: w0 */
        public float f1616w0 = 0.0f;

        /* renamed from: x0 */
        public float f1617x0 = 0.0f;

        /* renamed from: y0 */
        public float f1618y0 = 0.0f;

        public C0313a(int width, int height) {
            super(width, height);
        }

        public C0313a(Context c, AttributeSet attrs) {
            super(c, attrs);
            TypedArray a = c.obtainStyledAttributes(attrs, C0317h.f1704i0);
            int N = a.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a.getIndex(i);
                if (attr == C0317h.f1734s0) {
                    this.f1606m0 = a.getFloat(attr, this.f1606m0);
                } else if (attr == C0317h.f1638F0) {
                    this.f1608o0 = a.getFloat(attr, this.f1608o0);
                    this.f1607n0 = true;
                } else if (attr == C0317h.f1623A0) {
                    this.f1610q0 = a.getFloat(attr, this.f1610q0);
                } else if (attr == C0317h.f1626B0) {
                    this.f1611r0 = a.getFloat(attr, this.f1611r0);
                } else if (attr == C0317h.f1755z0) {
                    this.f1609p0 = a.getFloat(attr, this.f1609p0);
                } else if (attr == C0317h.f1749x0) {
                    this.f1612s0 = a.getFloat(attr, this.f1612s0);
                } else if (attr == C0317h.f1752y0) {
                    this.f1613t0 = a.getFloat(attr, this.f1613t0);
                } else if (attr == C0317h.f1737t0) {
                    this.f1614u0 = a.getFloat(attr, this.f1614u0);
                } else if (attr == C0317h.f1740u0) {
                    this.f1615v0 = a.getFloat(attr, this.f1615v0);
                } else if (attr == C0317h.f1743v0) {
                    this.f1616w0 = a.getFloat(attr, this.f1616w0);
                } else if (attr == C0317h.f1746w0) {
                    this.f1617x0 = a.getFloat(attr, this.f1617x0);
                } else if (attr == C0317h.f1635E0) {
                    this.f1616w0 = a.getFloat(attr, this.f1618y0);
                }
            }
        }
    }

    /* renamed from: a */
    public C0313a generateDefaultLayoutParams() {
        return new C0313a(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new ConstraintLayout.C0820a(p);
    }

    public C0309c getConstraintSet() {
        if (this.f1605b == null) {
            this.f1605b = new C0309c();
        }
        this.f1605b.mo2175b(this);
        return this.f1605b;
    }

    public void onLayout(boolean changed, int l, int t, int r, int b) {
    }
}
