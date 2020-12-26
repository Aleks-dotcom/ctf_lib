package p066b.p067a.p068a.p069a.p081l;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: b.a.a.a.l.g */
public class C1029g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    public final float[] f4322a = new float[9];

    /* renamed from: b */
    public final float[] f4323b = new float[9];

    /* renamed from: c */
    public final Matrix f4324c = new Matrix();

    /* renamed from: a */
    public Matrix mo5858a(float fraction, Matrix startValue, Matrix endValue) {
        startValue.getValues(this.f4322a);
        endValue.getValues(this.f4323b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f4323b;
            float f = fArr[i];
            float[] fArr2 = this.f4322a;
            fArr[i] = fArr2[i] + (fraction * (f - fArr2[i]));
        }
        this.f4324c.setValues(this.f4323b);
        return this.f4324c;
    }
}
