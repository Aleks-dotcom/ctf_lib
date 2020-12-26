package p000a.p058q;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: a.q.h */
public class C0693h<T> extends Property<T, Float> {

    /* renamed from: a */
    public final Property<T, PointF> f2648a;

    /* renamed from: b */
    public final PathMeasure f2649b;

    /* renamed from: c */
    public final float f2650c;

    /* renamed from: d */
    public final float[] f2651d = new float[2];

    /* renamed from: e */
    public final PointF f2652e = new PointF();

    /* renamed from: f */
    public float f2653f;

    public C0693h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f2648a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f2649b = pathMeasure;
        this.f2650c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f2653f);
    }

    /* renamed from: b */
    public void set(T target, Float fraction) {
        this.f2653f = fraction.floatValue();
        this.f2649b.getPosTan(this.f2650c * fraction.floatValue(), this.f2651d, (float[]) null);
        PointF pointF = this.f2652e;
        float[] fArr = this.f2651d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f2648a.set(target, pointF);
    }
}
