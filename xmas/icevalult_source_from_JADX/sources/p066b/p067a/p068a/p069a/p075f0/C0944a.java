package p066b.p067a.p068a.p069a.p075f0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p000a.p025h.p029f.C0356a;

/* renamed from: b.a.a.a.f0.a */
public class C0944a {

    /* renamed from: h */
    public static final int[] f3884h = new int[3];

    /* renamed from: i */
    public static final float[] f3885i = {0.0f, 0.5f, 1.0f};

    /* renamed from: j */
    public static final int[] f3886j = new int[4];

    /* renamed from: k */
    public static final float[] f3887k = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f3888a;

    /* renamed from: b */
    public final Paint f3889b;

    /* renamed from: c */
    public final Paint f3890c;

    /* renamed from: d */
    public int f3891d;

    /* renamed from: e */
    public int f3892e;

    /* renamed from: f */
    public int f3893f;

    /* renamed from: g */
    public final Path f3894g;

    public C0944a() {
        this(-16777216);
    }

    public C0944a(int color) {
        this.f3894g = new Path();
        mo5558d(color);
        Paint paint = new Paint(4);
        this.f3889b = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f3888a = paint2;
        paint2.setColor(this.f3891d);
        this.f3890c = new Paint(paint);
    }

    /* renamed from: d */
    public void mo5558d(int color) {
        this.f3891d = C0356a.m1849d(color, 68);
        this.f3892e = C0356a.m1849d(color, 20);
        this.f3893f = C0356a.m1849d(color, 0);
    }

    /* renamed from: b */
    public void mo5556b(Canvas canvas, Matrix transform, RectF bounds, int elevation) {
        bounds.bottom += (float) elevation;
        bounds.offset(0.0f, (float) (-elevation));
        int[] iArr = f3884h;
        iArr[0] = this.f3893f;
        iArr[1] = this.f3892e;
        iArr[2] = this.f3891d;
        Paint paint = this.f3890c;
        float f = bounds.left;
        paint.setShader(new LinearGradient(f, bounds.top, f, bounds.bottom, iArr, f3885i, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(transform);
        canvas.drawRect(bounds, this.f3890c);
        canvas.restore();
    }

    /* renamed from: a */
    public void mo5555a(Canvas canvas, Matrix matrix, RectF bounds, int elevation, float startAngle, float sweepAngle) {
        RectF rectF = bounds;
        int i = elevation;
        float f = sweepAngle;
        boolean drawShadowInsideBounds = f < 0.0f;
        Path arcBounds = this.f3894g;
        if (drawShadowInsideBounds) {
            int[] iArr = f3886j;
            iArr[0] = 0;
            iArr[1] = this.f3893f;
            iArr[2] = this.f3892e;
            iArr[3] = this.f3891d;
            float f2 = startAngle;
        } else {
            arcBounds.rewind();
            arcBounds.moveTo(bounds.centerX(), bounds.centerY());
            arcBounds.arcTo(rectF, startAngle, f);
            arcBounds.close();
            rectF.inset((float) (-i), (float) (-i));
            int[] iArr2 = f3886j;
            iArr2[0] = 0;
            iArr2[1] = this.f3891d;
            iArr2[2] = this.f3892e;
            iArr2[3] = this.f3893f;
        }
        float startRatio = 1.0f - (((float) i) / (bounds.width() / 2.0f));
        float[] fArr = f3887k;
        fArr[1] = startRatio;
        fArr[2] = startRatio + ((1.0f - startRatio) / 2.0f);
        this.f3889b.setShader(new RadialGradient(bounds.centerX(), bounds.centerY(), bounds.width() / 2.0f, f3886j, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!drawShadowInsideBounds) {
            canvas.clipPath(arcBounds, Region.Op.DIFFERENCE);
        } else {
            Canvas canvas2 = canvas;
        }
        canvas.drawArc(bounds, startAngle, sweepAngle, true, this.f3889b);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint mo5557c() {
        return this.f3888a;
    }
}
