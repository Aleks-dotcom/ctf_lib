package p066b.p067a.p068a.p069a.p081l;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p000a.p048l.p049a.p050a.C0568a;
import p000a.p048l.p049a.p050a.C0569b;
import p000a.p048l.p049a.p050a.C0570c;

/* renamed from: b.a.a.a.l.a */
public class C1023a {

    /* renamed from: a */
    public static final TimeInterpolator f4312a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f4313b = new C0569b();

    /* renamed from: c */
    public static final TimeInterpolator f4314c = new C0568a();

    /* renamed from: d */
    public static final TimeInterpolator f4315d = new C0570c();

    /* renamed from: e */
    public static final TimeInterpolator f4316e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m5420a(float startValue, float endValue, float fraction) {
        return ((endValue - startValue) * fraction) + startValue;
    }
}
