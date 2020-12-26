package p000a.p059r.p060a.p061a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
import p000a.p025h.p027e.p028c.C0355g;
import p000a.p025h.p029f.C0357b;

/* renamed from: a.r.a.a.f */
public class C0742f implements Interpolator {

    /* renamed from: a */
    public float[] f2786a;

    /* renamed from: b */
    public float[] f2787b;

    public C0742f(Context context, AttributeSet attrs, XmlPullParser parser) {
        this(context.getResources(), context.getTheme(), attrs, parser);
    }

    public C0742f(Resources res, Resources.Theme theme, AttributeSet attrs, XmlPullParser parser) {
        TypedArray a = C0355g.m1844k(res, theme, attrs, C0733a.f2772l);
        mo3661d(a, parser);
        a.recycle();
    }

    /* renamed from: d */
    public final void mo3661d(TypedArray a, XmlPullParser parser) {
        if (C0355g.m1843j(parser, "pathData")) {
            String pathData = C0355g.m1842i(a, parser, "pathData", 4);
            Path path = C0357b.m1854e(pathData);
            if (path != null) {
                mo3659b(path);
                return;
            }
            throw new InflateException("The path is null, which is created from " + pathData);
        } else if (!C0355g.m1843j(parser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C0355g.m1843j(parser, "controlY1")) {
            float x1 = C0355g.m1839f(a, parser, "controlX1", 0, 0.0f);
            float y1 = C0355g.m1839f(a, parser, "controlY1", 1, 0.0f);
            boolean hasX2 = C0355g.m1843j(parser, "controlX2");
            if (hasX2 != C0355g.m1843j(parser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!hasX2) {
                mo3660c(x1, y1);
            } else {
                mo3658a(x1, y1, C0355g.m1839f(a, parser, "controlX2", 2, 0.0f), C0355g.m1839f(a, parser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    /* renamed from: c */
    public final void mo3660c(float controlX, float controlY) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(controlX, controlY, 1.0f, 1.0f);
        mo3659b(path);
    }

    /* renamed from: a */
    public final void mo3658a(float x1, float y1, float x2, float y2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(x1, y1, x2, y2, 1.0f, 1.0f);
        mo3659b(path);
    }

    /* renamed from: b */
    public final void mo3659b(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float pathLength = pathMeasure.getLength();
        int numPoints = Math.min(3000, ((int) (pathLength / 0.002f)) + 1);
        if (numPoints > 0) {
            this.f2786a = new float[numPoints];
            this.f2787b = new float[numPoints];
            float[] position = new float[2];
            for (int i = 0; i < numPoints; i++) {
                pathMeasure.getPosTan((((float) i) * pathLength) / ((float) (numPoints - 1)), position, (float[]) null);
                this.f2786a[i] = position[0];
                this.f2787b[i] = position[1];
            }
            if (((double) Math.abs(this.f2786a[0])) > 1.0E-5d || ((double) Math.abs(this.f2787b[0])) > 1.0E-5d || ((double) Math.abs(this.f2786a[numPoints - 1] - 1.0f)) > 1.0E-5d || ((double) Math.abs(this.f2787b[numPoints - 1] - 1.0f)) > 1.0E-5d) {
                throw new IllegalArgumentException("The Path must start at (0,0) and end at (1,1) start: " + this.f2786a[0] + "," + this.f2787b[0] + " end:" + this.f2786a[numPoints - 1] + "," + this.f2787b[numPoints - 1]);
            }
            float prevX = 0.0f;
            int componentIndex = 0;
            int i2 = 0;
            while (i2 < numPoints) {
                float[] fArr = this.f2786a;
                int componentIndex2 = componentIndex + 1;
                float x = fArr[componentIndex];
                if (x >= prevX) {
                    fArr[i2] = x;
                    prevX = x;
                    i2++;
                    componentIndex = componentIndex2;
                } else {
                    throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + x);
                }
            }
            if (pathMeasure.nextContour() != 0) {
                throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
            }
            return;
        }
        throw new IllegalArgumentException("The Path has a invalid length " + pathLength);
    }

    public float getInterpolation(float t) {
        if (t <= 0.0f) {
            return 0.0f;
        }
        if (t >= 1.0f) {
            return 1.0f;
        }
        int startIndex = 0;
        int endIndex = this.f2786a.length - 1;
        while (endIndex - startIndex > 1) {
            int midIndex = (startIndex + endIndex) / 2;
            if (t < this.f2786a[midIndex]) {
                endIndex = midIndex;
            } else {
                startIndex = midIndex;
            }
        }
        float[] fArr = this.f2786a;
        float xRange = fArr[endIndex] - fArr[startIndex];
        if (xRange == 0.0f) {
            return this.f2787b[startIndex];
        }
        float[] fArr2 = this.f2787b;
        float startY = fArr2[startIndex];
        return ((fArr2[endIndex] - startY) * ((t - fArr[startIndex]) / xRange)) + startY;
    }
}
