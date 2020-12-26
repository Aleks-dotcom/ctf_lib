package p066b.p067a.p068a.p069a.p076g0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p066b.p067a.p068a.p069a.C1020k;

/* renamed from: b.a.a.a.g0.k */
public class C0960k {

    /* renamed from: a */
    public C0950d f3947a;

    /* renamed from: b */
    public C0950d f3948b;

    /* renamed from: c */
    public C0950d f3949c;

    /* renamed from: d */
    public C0950d f3950d;

    /* renamed from: e */
    public C0949c f3951e;

    /* renamed from: f */
    public C0949c f3952f;

    /* renamed from: g */
    public C0949c f3953g;

    /* renamed from: h */
    public C0949c f3954h;

    /* renamed from: i */
    public C0952f f3955i;

    /* renamed from: j */
    public C0952f f3956j;

    /* renamed from: k */
    public C0952f f3957k;

    /* renamed from: l */
    public C0952f f3958l;

    /* renamed from: b.a.a.a.g0.k$c */
    public interface C0963c {
        /* renamed from: a */
        C0949c mo5636a(C0949c cVar);
    }

    /* renamed from: b.a.a.a.g0.k$b */
    public static final class C0962b {

        /* renamed from: a */
        public C0950d f3959a = C0957h.m5175b();

        /* renamed from: b */
        public C0950d f3960b = C0957h.m5175b();

        /* renamed from: c */
        public C0950d f3961c = C0957h.m5175b();

        /* renamed from: d */
        public C0950d f3962d = C0957h.m5175b();

        /* renamed from: e */
        public C0949c f3963e = new C0947a(0.0f);

        /* renamed from: f */
        public C0949c f3964f = new C0947a(0.0f);

        /* renamed from: g */
        public C0949c f3965g = new C0947a(0.0f);

        /* renamed from: h */
        public C0949c f3966h = new C0947a(0.0f);

        /* renamed from: i */
        public C0952f f3967i = C0957h.m5176c();

        /* renamed from: j */
        public C0952f f3968j = C0957h.m5176c();

        /* renamed from: k */
        public C0952f f3969k = C0957h.m5176c();

        /* renamed from: l */
        public C0952f f3970l = C0957h.m5176c();

        public C0962b() {
        }

        public C0962b(C0960k other) {
            this.f3959a = other.f3947a;
            this.f3960b = other.f3948b;
            this.f3961c = other.f3949c;
            this.f3962d = other.f3950d;
            this.f3963e = other.f3951e;
            this.f3964f = other.f3952f;
            this.f3965g = other.f3953g;
            this.f3966h = other.f3954h;
            this.f3967i = other.f3955i;
            this.f3968j = other.f3956j;
            this.f3969k = other.f3957k;
            this.f3970l = other.f3958l;
        }

        /* renamed from: o */
        public C0962b mo5663o(float cornerSize) {
            mo5674z(cornerSize);
            mo5660D(cornerSize);
            mo5670v(cornerSize);
            mo5666r(cornerSize);
            return this;
        }

        /* renamed from: z */
        public C0962b mo5674z(float cornerSize) {
            this.f3963e = new C0947a(cornerSize);
            return this;
        }

        /* renamed from: A */
        public C0962b mo5657A(C0949c cornerSize) {
            this.f3963e = cornerSize;
            return this;
        }

        /* renamed from: D */
        public C0962b mo5660D(float cornerSize) {
            this.f3964f = new C0947a(cornerSize);
            return this;
        }

        /* renamed from: E */
        public C0962b mo5661E(C0949c cornerSize) {
            this.f3964f = cornerSize;
            return this;
        }

        /* renamed from: v */
        public C0962b mo5670v(float cornerSize) {
            this.f3965g = new C0947a(cornerSize);
            return this;
        }

        /* renamed from: w */
        public C0962b mo5671w(C0949c cornerSize) {
            this.f3965g = cornerSize;
            return this;
        }

        /* renamed from: r */
        public C0962b mo5666r(float cornerSize) {
            this.f3966h = new C0947a(cornerSize);
            return this;
        }

        /* renamed from: s */
        public C0962b mo5667s(C0949c cornerSize) {
            this.f3966h = cornerSize;
            return this;
        }

        /* renamed from: x */
        public C0962b mo5672x(int cornerFamily, C0949c cornerSize) {
            mo5673y(C0957h.m5174a(cornerFamily));
            mo5657A(cornerSize);
            return this;
        }

        /* renamed from: y */
        public C0962b mo5673y(C0950d topLeftCorner) {
            this.f3959a = topLeftCorner;
            float size = m5218n(topLeftCorner);
            if (size != -1.0f) {
                mo5674z(size);
            }
            return this;
        }

        /* renamed from: B */
        public C0962b mo5658B(int cornerFamily, C0949c cornerSize) {
            mo5659C(C0957h.m5174a(cornerFamily));
            mo5661E(cornerSize);
            return this;
        }

        /* renamed from: C */
        public C0962b mo5659C(C0950d topRightCorner) {
            this.f3960b = topRightCorner;
            float size = m5218n(topRightCorner);
            if (size != -1.0f) {
                mo5660D(size);
            }
            return this;
        }

        /* renamed from: t */
        public C0962b mo5668t(int cornerFamily, C0949c cornerSize) {
            mo5669u(C0957h.m5174a(cornerFamily));
            mo5671w(cornerSize);
            return this;
        }

        /* renamed from: u */
        public C0962b mo5669u(C0950d bottomRightCorner) {
            this.f3961c = bottomRightCorner;
            float size = m5218n(bottomRightCorner);
            if (size != -1.0f) {
                mo5670v(size);
            }
            return this;
        }

        /* renamed from: p */
        public C0962b mo5664p(int cornerFamily, C0949c cornerSize) {
            mo5665q(C0957h.m5174a(cornerFamily));
            mo5667s(cornerSize);
            return this;
        }

        /* renamed from: q */
        public C0962b mo5665q(C0950d bottomLeftCorner) {
            this.f3962d = bottomLeftCorner;
            float size = m5218n(bottomLeftCorner);
            if (size != -1.0f) {
                mo5666r(size);
            }
            return this;
        }

        /* renamed from: n */
        public static float m5218n(C0950d treatment) {
            if (treatment instanceof C0959j) {
                return ((C0959j) treatment).f3946a;
            }
            if (treatment instanceof C0951e) {
                return ((C0951e) treatment).f3898a;
            }
            return -1.0f;
        }

        /* renamed from: m */
        public C0960k mo5662m() {
            return new C0960k(this);
        }
    }

    /* renamed from: a */
    public static C0962b m5182a() {
        return new C0962b();
    }

    /* renamed from: e */
    public static C0962b m5186e(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        return m5187f(context, attrs, defStyleAttr, defStyleRes, 0);
    }

    /* renamed from: f */
    public static C0962b m5187f(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, int defaultCornerSize) {
        return m5188g(context, attrs, defStyleAttr, defStyleRes, new C0947a((float) defaultCornerSize));
    }

    /* renamed from: g */
    public static C0962b m5188g(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, C0949c defaultCornerSize) {
        TypedArray a = context.obtainStyledAttributes(attrs, C1020k.f4262n1, defStyleAttr, defStyleRes);
        int shapeAppearanceResId = a.getResourceId(C1020k.f4266o1, 0);
        int shapeAppearanceOverlayResId = a.getResourceId(C1020k.f4270p1, 0);
        a.recycle();
        return m5185d(context, shapeAppearanceResId, shapeAppearanceOverlayResId, defaultCornerSize);
    }

    /* renamed from: b */
    public static C0962b m5183b(Context context, int shapeAppearanceResId, int shapeAppearanceOverlayResId) {
        return m5184c(context, shapeAppearanceResId, shapeAppearanceOverlayResId, 0);
    }

    /* renamed from: c */
    public static C0962b m5184c(Context context, int shapeAppearanceResId, int shapeAppearanceOverlayResId, int defaultCornerSize) {
        return m5185d(context, shapeAppearanceResId, shapeAppearanceOverlayResId, new C0947a((float) defaultCornerSize));
    }

    /* renamed from: d */
    public static C0962b m5185d(Context context, int shapeAppearanceResId, int shapeAppearanceOverlayResId, C0949c defaultCornerSize) {
        if (shapeAppearanceOverlayResId != 0) {
            context = new ContextThemeWrapper(context, shapeAppearanceResId);
            shapeAppearanceResId = shapeAppearanceOverlayResId;
        }
        TypedArray a = context.obtainStyledAttributes(shapeAppearanceResId, C1020k.f4310z1);
        try {
            int cornerFamily = a.getInt(C1020k.f4100A1, 0);
            int cornerFamilyTopLeft = a.getInt(C1020k.f4112D1, cornerFamily);
            int cornerFamilyTopRight = a.getInt(C1020k.f4116E1, cornerFamily);
            int cornerFamilyBottomRight = a.getInt(C1020k.f4108C1, cornerFamily);
            int cornerFamilyBottomLeft = a.getInt(C1020k.f4104B1, cornerFamily);
            C0949c cornerSize = m5189m(a, C1020k.f4120F1, defaultCornerSize);
            C0949c cornerSizeTopLeft = m5189m(a, C1020k.f4132I1, cornerSize);
            C0949c cornerSizeTopRight = m5189m(a, C1020k.f4136J1, cornerSize);
            C0949c cornerSizeBottomRight = m5189m(a, C1020k.f4128H1, cornerSize);
            C0949c cornerSizeBottomLeft = m5189m(a, C1020k.f4124G1, cornerSize);
            C0962b bVar = new C0962b();
            bVar.mo5672x(cornerFamilyTopLeft, cornerSizeTopLeft);
            bVar.mo5658B(cornerFamilyTopRight, cornerSizeTopRight);
            bVar.mo5668t(cornerFamilyBottomRight, cornerSizeBottomRight);
            bVar.mo5664p(cornerFamilyBottomLeft, cornerSizeBottomLeft);
            return bVar;
        } finally {
            a.recycle();
        }
    }

    /* renamed from: m */
    public static C0949c m5189m(TypedArray a, int index, C0949c defaultValue) {
        TypedValue value = a.peekValue(index);
        if (value == null) {
            return defaultValue;
        }
        int i = value.type;
        if (i == 5) {
            return new C0947a((float) TypedValue.complexToDimensionPixelSize(value.data, a.getResources().getDisplayMetrics()));
        }
        if (i == 6) {
            return new C0958i(value.getFraction(1.0f, 1.0f));
        }
        return defaultValue;
    }

    static {
        new C0958i(0.5f);
    }

    public C0960k(C0962b builder) {
        this.f3947a = builder.f3959a;
        this.f3948b = builder.f3960b;
        this.f3949c = builder.f3961c;
        this.f3950d = builder.f3962d;
        this.f3951e = builder.f3963e;
        this.f3952f = builder.f3964f;
        this.f3953g = builder.f3965g;
        this.f3954h = builder.f3966h;
        this.f3955i = builder.f3967i;
        this.f3956j = builder.f3968j;
        this.f3957k = builder.f3969k;
        this.f3958l = builder.f3970l;
    }

    public C0960k() {
        this.f3947a = C0957h.m5175b();
        this.f3948b = C0957h.m5175b();
        this.f3949c = C0957h.m5175b();
        this.f3950d = C0957h.m5175b();
        this.f3951e = new C0947a(0.0f);
        this.f3952f = new C0947a(0.0f);
        this.f3953g = new C0947a(0.0f);
        this.f3954h = new C0947a(0.0f);
        this.f3955i = C0957h.m5176c();
        this.f3956j = C0957h.m5176c();
        this.f3957k = C0957h.m5176c();
        this.f3958l = C0957h.m5176c();
    }

    /* renamed from: q */
    public C0950d mo5649q() {
        return this.f3947a;
    }

    /* renamed from: s */
    public C0950d mo5651s() {
        return this.f3948b;
    }

    /* renamed from: k */
    public C0950d mo5644k() {
        return this.f3949c;
    }

    /* renamed from: i */
    public C0950d mo5642i() {
        return this.f3950d;
    }

    /* renamed from: r */
    public C0949c mo5650r() {
        return this.f3951e;
    }

    /* renamed from: t */
    public C0949c mo5652t() {
        return this.f3952f;
    }

    /* renamed from: l */
    public C0949c mo5645l() {
        return this.f3953g;
    }

    /* renamed from: j */
    public C0949c mo5643j() {
        return this.f3954h;
    }

    /* renamed from: n */
    public C0952f mo5646n() {
        return this.f3958l;
    }

    /* renamed from: p */
    public C0952f mo5648p() {
        return this.f3955i;
    }

    /* renamed from: o */
    public C0952f mo5647o() {
        return this.f3956j;
    }

    /* renamed from: h */
    public C0952f mo5641h() {
        return this.f3957k;
    }

    /* renamed from: v */
    public C0962b mo5654v() {
        return new C0962b(this);
    }

    /* renamed from: w */
    public C0960k mo5655w(float cornerSize) {
        C0962b v = mo5654v();
        v.mo5663o(cornerSize);
        return v.mo5662m();
    }

    /* renamed from: x */
    public C0960k mo5656x(C0963c op) {
        C0962b v = mo5654v();
        v.mo5657A(op.mo5636a(mo5650r()));
        v.mo5661E(op.mo5636a(mo5652t()));
        v.mo5667s(op.mo5636a(mo5643j()));
        v.mo5671w(op.mo5636a(mo5645l()));
        return v.mo5662m();
    }

    /* renamed from: u */
    public boolean mo5653u(RectF bounds) {
        Class<C0952f> cls = C0952f.class;
        boolean hasDefaultEdges = this.f3958l.getClass().equals(cls) && this.f3956j.getClass().equals(cls) && this.f3955i.getClass().equals(cls) && this.f3957k.getClass().equals(cls);
        float cornerSize = this.f3951e.mo5562a(bounds);
        boolean cornersHaveSameSize = this.f3952f.mo5562a(bounds) == cornerSize && this.f3954h.mo5562a(bounds) == cornerSize && this.f3953g.mo5562a(bounds) == cornerSize;
        boolean hasRoundedCorners = (this.f3948b instanceof C0959j) && (this.f3947a instanceof C0959j) && (this.f3949c instanceof C0959j) && (this.f3950d instanceof C0959j);
        if (!hasDefaultEdges || !cornersHaveSameSize || !hasRoundedCorners) {
            return false;
        }
        return true;
    }
}
