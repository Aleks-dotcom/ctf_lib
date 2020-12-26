package p066b.p067a.p068a.p069a.p071b0;

/* renamed from: b.a.a.a.b0.a */
public final class C0925a {
    /* renamed from: a */
    public static float m5060a(float x1, float y1, float x2, float y2) {
        return (float) Math.hypot((double) (x2 - x1), (double) (y2 - y1));
    }

    /* renamed from: c */
    public static float m5062c(float start, float stop, float amount) {
        return ((1.0f - amount) * start) + (amount * stop);
    }

    /* renamed from: b */
    public static float m5061b(float pointX, float pointY, float rectLeft, float rectTop, float rectRight, float rectBottom) {
        return m5063d(m5060a(pointX, pointY, rectLeft, rectTop), m5060a(pointX, pointY, rectRight, rectTop), m5060a(pointX, pointY, rectRight, rectBottom), m5060a(pointX, pointY, rectLeft, rectBottom));
    }

    /* renamed from: d */
    public static float m5063d(float a, float b, float c, float d) {
        if (a > b && a > c && a > d) {
            return a;
        }
        if (b <= c || b <= d) {
            return c > d ? c : d;
        }
        return b;
    }
}
