package p066b.p067a.p068a.p069a.p094x;

import android.content.Context;
import android.graphics.Color;
import p000a.p025h.p029f.C0356a;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.p073d0.C0931b;
import p066b.p067a.p068a.p069a.p091u.C1060a;

/* renamed from: b.a.a.a.x.a */
public class C1098a {

    /* renamed from: a */
    public final boolean f4551a;

    /* renamed from: b */
    public final int f4552b;

    /* renamed from: c */
    public final int f4553c;

    /* renamed from: d */
    public final float f4554d;

    public C1098a(Context context) {
        this.f4551a = C0931b.m5070b(context, C0924b.elevationOverlayEnabled, false);
        this.f4552b = C1060a.m5719a(context, C0924b.elevationOverlayColor, 0);
        this.f4553c = C1060a.m5719a(context, C0924b.colorSurface, 0);
        this.f4554d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: c */
    public int mo6278c(int backgroundColor, float elevation) {
        if (!this.f4551a || !mo6280e(backgroundColor)) {
            return backgroundColor;
        }
        return mo6277b(backgroundColor, elevation);
    }

    /* renamed from: b */
    public int mo6277b(int backgroundColor, float elevation) {
        float overlayAlphaFraction = mo6276a(elevation);
        return C0356a.m1849d(C1060a.m5724f(C0356a.m1849d(backgroundColor, 255), this.f4552b, overlayAlphaFraction), Color.alpha(backgroundColor));
    }

    /* renamed from: a */
    public float mo6276a(float elevation) {
        float f = this.f4554d;
        if (f <= 0.0f || elevation <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (elevation / f))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: d */
    public boolean mo6279d() {
        return this.f4551a;
    }

    /* renamed from: e */
    public final boolean mo6280e(int color) {
        return C0356a.m1849d(color, 255) == this.f4553c;
    }
}
