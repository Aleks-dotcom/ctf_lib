package p066b.p067a.p068a.p069a.p076g0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: b.a.a.a.g0.l */
public class C0964l {

    /* renamed from: a */
    public final C0967m[] f3971a = new C0967m[4];

    /* renamed from: b */
    public final Matrix[] f3972b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f3973c = new Matrix[4];

    /* renamed from: d */
    public final PointF f3974d = new PointF();

    /* renamed from: e */
    public final C0967m f3975e = new C0967m();

    /* renamed from: f */
    public final float[] f3976f = new float[2];

    /* renamed from: g */
    public final float[] f3977g = new float[2];

    /* renamed from: b.a.a.a.g0.l$a */
    public interface C0965a {
        /* renamed from: a */
        void mo5634a(C0967m mVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo5635b(C0967m mVar, Matrix matrix, int i);
    }

    public C0964l() {
        for (int i = 0; i < 4; i++) {
            this.f3971a[i] = new C0967m();
            this.f3972b[i] = new Matrix();
            this.f3973c[i] = new Matrix();
        }
    }

    /* renamed from: d */
    public void mo5678d(C0960k shapeAppearanceModel, float interpolation, RectF bounds, Path path) {
        mo5679e(shapeAppearanceModel, interpolation, bounds, (C0965a) null, path);
    }

    /* renamed from: e */
    public void mo5679e(C0960k shapeAppearanceModel, float interpolation, RectF bounds, C0965a pathListener, Path path) {
        path.rewind();
        C0966b spec = new C0966b(shapeAppearanceModel, interpolation, bounds, pathListener, path);
        for (int index = 0; index < 4; index++) {
            mo5685k(spec, index);
            mo5686l(index);
        }
        for (int index2 = 0; index2 < 4; index2++) {
            mo5676b(spec, index2);
            mo5677c(spec, index2);
        }
        path.close();
    }

    /* renamed from: k */
    public final void mo5685k(C0966b spec, int index) {
        mo5682h(index, spec.f3978a).mo5568b(this.f3971a[index], 90.0f, spec.f3982e, spec.f3980c, mo5681g(index, spec.f3978a));
        float edgeAngle = mo5675a(index);
        this.f3972b[index].reset();
        mo5680f(index, spec.f3980c, this.f3974d);
        Matrix matrix = this.f3972b[index];
        PointF pointF = this.f3974d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f3972b[index].preRotate(edgeAngle);
    }

    /* renamed from: l */
    public final void mo5686l(int index) {
        this.f3976f[0] = this.f3971a[index].mo5694h();
        this.f3976f[1] = this.f3971a[index].mo5695i();
        this.f3972b[index].mapPoints(this.f3976f);
        float edgeAngle = mo5675a(index);
        this.f3973c[index].reset();
        Matrix matrix = this.f3973c[index];
        float[] fArr = this.f3976f;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f3973c[index].preRotate(edgeAngle);
    }

    /* renamed from: b */
    public final void mo5676b(C0966b spec, int index) {
        this.f3976f[0] = this.f3971a[index].mo5696j();
        this.f3976f[1] = this.f3971a[index].mo5697k();
        this.f3972b[index].mapPoints(this.f3976f);
        if (index == 0) {
            Path path = spec.f3979b;
            float[] fArr = this.f3976f;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = spec.f3979b;
            float[] fArr2 = this.f3976f;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f3971a[index].mo5690d(this.f3972b[index], spec.f3979b);
        C0965a aVar = spec.f3981d;
        if (aVar != null) {
            aVar.mo5634a(this.f3971a[index], this.f3972b[index], index);
        }
    }

    /* renamed from: c */
    public final void mo5677c(C0966b spec, int index) {
        int nextIndex = (index + 1) % 4;
        this.f3976f[0] = this.f3971a[index].mo5694h();
        this.f3976f[1] = this.f3971a[index].mo5695i();
        this.f3972b[index].mapPoints(this.f3976f);
        this.f3977g[0] = this.f3971a[nextIndex].mo5696j();
        this.f3977g[1] = this.f3971a[nextIndex].mo5697k();
        this.f3972b[nextIndex].mapPoints(this.f3977g);
        float[] fArr = this.f3976f;
        float f = fArr[0];
        float[] fArr2 = this.f3977g;
        float edgeLength = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float center = mo5683i(spec.f3980c, index);
        this.f3975e.mo5699m(0.0f, 0.0f);
        mo5684j(index, spec.f3978a).mo5569a(edgeLength, center, spec.f3982e, this.f3975e);
        this.f3975e.mo5690d(this.f3973c[index], spec.f3979b);
        C0965a aVar = spec.f3981d;
        if (aVar != null) {
            aVar.mo5635b(this.f3975e, this.f3973c[index], index);
        }
    }

    /* renamed from: i */
    public final float mo5683i(RectF bounds, int index) {
        float[] fArr = this.f3976f;
        C0967m[] mVarArr = this.f3971a;
        fArr[0] = mVarArr[index].f3985c;
        fArr[1] = mVarArr[index].f3986d;
        this.f3972b[index].mapPoints(fArr);
        if (index == 1 || index == 3) {
            return Math.abs(bounds.centerX() - this.f3976f[0]);
        }
        return Math.abs(bounds.centerY() - this.f3976f[1]);
    }

    /* renamed from: h */
    public final C0950d mo5682h(int index, C0960k shapeAppearanceModel) {
        if (index == 1) {
            return shapeAppearanceModel.mo5644k();
        }
        if (index == 2) {
            return shapeAppearanceModel.mo5642i();
        }
        if (index != 3) {
            return shapeAppearanceModel.mo5651s();
        }
        return shapeAppearanceModel.mo5649q();
    }

    /* renamed from: g */
    public final C0949c mo5681g(int index, C0960k shapeAppearanceModel) {
        if (index == 1) {
            return shapeAppearanceModel.mo5645l();
        }
        if (index == 2) {
            return shapeAppearanceModel.mo5643j();
        }
        if (index != 3) {
            return shapeAppearanceModel.mo5652t();
        }
        return shapeAppearanceModel.mo5650r();
    }

    /* renamed from: j */
    public final C0952f mo5684j(int index, C0960k shapeAppearanceModel) {
        if (index == 1) {
            return shapeAppearanceModel.mo5641h();
        }
        if (index == 2) {
            return shapeAppearanceModel.mo5646n();
        }
        if (index != 3) {
            return shapeAppearanceModel.mo5647o();
        }
        return shapeAppearanceModel.mo5648p();
    }

    /* renamed from: f */
    public final void mo5680f(int index, RectF bounds, PointF pointF) {
        if (index == 1) {
            pointF.set(bounds.right, bounds.bottom);
        } else if (index == 2) {
            pointF.set(bounds.left, bounds.bottom);
        } else if (index != 3) {
            pointF.set(bounds.right, bounds.top);
        } else {
            pointF.set(bounds.left, bounds.top);
        }
    }

    /* renamed from: a */
    public final float mo5675a(int index) {
        return (float) ((index + 1) * 90);
    }

    /* renamed from: b.a.a.a.g0.l$b */
    public static final class C0966b {

        /* renamed from: a */
        public final C0960k f3978a;

        /* renamed from: b */
        public final Path f3979b;

        /* renamed from: c */
        public final RectF f3980c;

        /* renamed from: d */
        public final C0965a f3981d;

        /* renamed from: e */
        public final float f3982e;

        public C0966b(C0960k shapeAppearanceModel, float interpolation, RectF bounds, C0965a pathListener, Path path) {
            this.f3981d = pathListener;
            this.f3978a = shapeAppearanceModel;
            this.f3982e = interpolation;
            this.f3980c = bounds;
            this.f3979b = path;
        }
    }
}
