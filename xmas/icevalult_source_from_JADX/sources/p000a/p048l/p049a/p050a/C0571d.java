package p000a.p048l.p049a.p050a;

import android.view.animation.Interpolator;

/* renamed from: a.l.a.a.d */
public abstract class C0571d implements Interpolator {

    /* renamed from: a */
    public final float[] f2370a;

    /* renamed from: b */
    public final float f2371b;

    public C0571d(float[] values) {
        this.f2370a = values;
        this.f2371b = 1.0f / ((float) (values.length - 1));
    }

    public float getInterpolation(float input) {
        if (input >= 1.0f) {
            return 1.0f;
        }
        if (input <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f2370a;
        int position = Math.min((int) (((float) (fArr.length - 1)) * input), fArr.length - 2);
        float f = this.f2371b;
        float[] fArr2 = this.f2370a;
        return fArr2[position] + ((fArr2[position + 1] - fArr2[position]) * ((input - (((float) position) * f)) / f));
    }
}
