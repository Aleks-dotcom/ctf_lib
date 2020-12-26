package p066b.p067a.p068a.p069a.p076g0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p066b.p067a.p068a.p069a.p075f0.C0944a;

/* renamed from: b.a.a.a.g0.m */
public class C0967m {
    @Deprecated

    /* renamed from: a */
    public float f3983a;
    @Deprecated

    /* renamed from: b */
    public float f3984b;
    @Deprecated

    /* renamed from: c */
    public float f3985c;
    @Deprecated

    /* renamed from: d */
    public float f3986d;
    @Deprecated

    /* renamed from: e */
    public float f3987e;
    @Deprecated

    /* renamed from: f */
    public float f3988f;

    /* renamed from: g */
    public final List<C0973f> f3989g = new ArrayList();

    /* renamed from: h */
    public final List<C0974g> f3990h = new ArrayList();

    /* renamed from: b.a.a.a.g0.m$f */
    public static abstract class C0973f {

        /* renamed from: a */
        public final Matrix f4006a = new Matrix();

        /* renamed from: a */
        public abstract void mo5709a(Matrix matrix, Path path);
    }

    public C0967m() {
        mo5699m(0.0f, 0.0f);
    }

    /* renamed from: m */
    public void mo5699m(float startX, float startY) {
        mo5700n(startX, startY, 270.0f, 0.0f);
    }

    /* renamed from: n */
    public void mo5700n(float startX, float startY, float shadowStartAngle, float shadowSweepAngle) {
        mo5705s(startX);
        mo5706t(startY);
        mo5703q(startX);
        mo5704r(startY);
        mo5701o(shadowStartAngle);
        mo5702p((shadowStartAngle + shadowSweepAngle) % 360.0f);
        this.f3989g.clear();
        this.f3990h.clear();
    }

    /* renamed from: l */
    public void mo5698l(float x, float y) {
        C0972e operation = new C0972e();
        float unused = operation.f4004b = x;
        float unused2 = operation.f4005c = y;
        this.f3989g.add(operation);
        C0970c shadowOperation = new C0970c(operation, mo5694h(), mo5695i());
        mo5689c(shadowOperation, shadowOperation.mo5708c() + 270.0f, shadowOperation.mo5708c() + 270.0f);
        mo5703q(x);
        mo5704r(y);
    }

    /* renamed from: a */
    public void mo5687a(float left, float top, float right, float bottom, float startAngle, float sweepAngle) {
        float f = left;
        float f2 = top;
        float f3 = right;
        float f4 = bottom;
        float f5 = startAngle;
        float f6 = sweepAngle;
        C0971d operation = new C0971d(f, f2, f3, f4);
        operation.mo5719s(f5);
        operation.mo5720t(f6);
        this.f3989g.add(operation);
        C0969b arcShadowOperation = new C0969b(operation);
        float endAngle = f5 + f6;
        boolean drawShadowInsideBounds = f6 < 0.0f;
        mo5689c(arcShadowOperation, drawShadowInsideBounds ? (f5 + 180.0f) % 360.0f : f5, drawShadowInsideBounds ? (180.0f + endAngle) % 360.0f : endAngle);
        mo5703q(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians((double) (f5 + f6))))));
        mo5704r(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians((double) (f5 + f6))))));
    }

    /* renamed from: d */
    public void mo5690d(Matrix transform, Path path) {
        int size = this.f3989g.size();
        for (int i = 0; i < size; i++) {
            this.f3989g.get(i).mo5709a(transform, path);
        }
    }

    /* renamed from: e */
    public C0974g mo5691e(Matrix transform) {
        mo5688b(mo5693g());
        return new C0968a(this, new ArrayList<>(this.f3990h), transform);
    }

    /* renamed from: b.a.a.a.g0.m$a */
    public class C0968a extends C0974g {

        /* renamed from: b */
        public final /* synthetic */ List f3991b;

        /* renamed from: c */
        public final /* synthetic */ Matrix f3992c;

        public C0968a(C0967m this$0, List list, Matrix matrix) {
            this.f3991b = list;
            this.f3992c = matrix;
        }

        /* renamed from: a */
        public void mo5707a(Matrix matrix, C0944a shadowRenderer, int shadowElevation, Canvas canvas) {
            for (C0974g op : this.f3991b) {
                op.mo5707a(this.f3992c, shadowRenderer, shadowElevation, canvas);
            }
        }
    }

    /* renamed from: c */
    public final void mo5689c(C0974g shadowOperation, float startShadowAngle, float endShadowAngle) {
        mo5688b(startShadowAngle);
        this.f3990h.add(shadowOperation);
        mo5701o(endShadowAngle);
    }

    /* renamed from: b */
    public final void mo5688b(float nextShadowAngle) {
        if (mo5692f() != nextShadowAngle) {
            float shadowSweep = ((nextShadowAngle - mo5692f()) + 360.0f) % 360.0f;
            if (shadowSweep <= 180.0f) {
                C0971d pathArcOperation = new C0971d(mo5694h(), mo5695i(), mo5694h(), mo5695i());
                pathArcOperation.mo5719s(mo5692f());
                pathArcOperation.mo5720t(shadowSweep);
                this.f3990h.add(new C0969b(pathArcOperation));
                mo5701o(nextShadowAngle);
            }
        }
    }

    /* renamed from: j */
    public float mo5696j() {
        return this.f3983a;
    }

    /* renamed from: k */
    public float mo5697k() {
        return this.f3984b;
    }

    /* renamed from: h */
    public float mo5694h() {
        return this.f3985c;
    }

    /* renamed from: i */
    public float mo5695i() {
        return this.f3986d;
    }

    /* renamed from: f */
    public final float mo5692f() {
        return this.f3987e;
    }

    /* renamed from: g */
    public final float mo5693g() {
        return this.f3988f;
    }

    /* renamed from: s */
    public final void mo5705s(float startX) {
        this.f3983a = startX;
    }

    /* renamed from: t */
    public final void mo5706t(float startY) {
        this.f3984b = startY;
    }

    /* renamed from: q */
    public final void mo5703q(float endX) {
        this.f3985c = endX;
    }

    /* renamed from: r */
    public final void mo5704r(float endY) {
        this.f3986d = endY;
    }

    /* renamed from: o */
    public final void mo5701o(float currentShadowAngle) {
        this.f3987e = currentShadowAngle;
    }

    /* renamed from: p */
    public final void mo5702p(float endShadowAngle) {
        this.f3988f = endShadowAngle;
    }

    /* renamed from: b.a.a.a.g0.m$g */
    public static abstract class C0974g {

        /* renamed from: a */
        public static final Matrix f4007a = new Matrix();

        /* renamed from: a */
        public abstract void mo5707a(Matrix matrix, C0944a aVar, int i, Canvas canvas);

        /* renamed from: b */
        public final void mo5722b(C0944a shadowRenderer, int shadowElevation, Canvas canvas) {
            mo5707a(f4007a, shadowRenderer, shadowElevation, canvas);
        }
    }

    /* renamed from: b.a.a.a.g0.m$c */
    public static class C0970c extends C0974g {

        /* renamed from: b */
        public final C0972e f3994b;

        /* renamed from: c */
        public final float f3995c;

        /* renamed from: d */
        public final float f3996d;

        public C0970c(C0972e operation, float startX, float startY) {
            this.f3994b = operation;
            this.f3995c = startX;
            this.f3996d = startY;
        }

        /* renamed from: a */
        public void mo5707a(Matrix transform, C0944a shadowRenderer, int shadowElevation, Canvas canvas) {
            RectF rect = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f3994b.f4005c - this.f3996d), (double) (this.f3994b.f4004b - this.f3995c)), 0.0f);
            Matrix edgeTransform = new Matrix(transform);
            edgeTransform.preTranslate(this.f3995c, this.f3996d);
            edgeTransform.preRotate(mo5708c());
            shadowRenderer.mo5556b(canvas, edgeTransform, rect, shadowElevation);
        }

        /* renamed from: c */
        public float mo5708c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f3994b.f4005c - this.f3996d) / (this.f3994b.f4004b - this.f3995c))));
        }
    }

    /* renamed from: b.a.a.a.g0.m$b */
    public static class C0969b extends C0974g {

        /* renamed from: b */
        public final C0971d f3993b;

        public C0969b(C0971d operation) {
            this.f3993b = operation;
        }

        /* renamed from: a */
        public void mo5707a(Matrix transform, C0944a shadowRenderer, int shadowElevation, Canvas canvas) {
            float startAngle = this.f3993b.mo5713m();
            float sweepAngle = this.f3993b.mo5714n();
            shadowRenderer.mo5555a(canvas, transform, new RectF(this.f3993b.mo5711k(), this.f3993b.mo5715o(), this.f3993b.mo5712l(), this.f3993b.mo5710j()), shadowElevation, startAngle, sweepAngle);
        }
    }

    /* renamed from: b.a.a.a.g0.m$e */
    public static class C0972e extends C0973f {

        /* renamed from: b */
        public float f4004b;

        /* renamed from: c */
        public float f4005c;

        /* renamed from: a */
        public void mo5709a(Matrix transform, Path path) {
            Matrix inverse = this.f4006a;
            transform.invert(inverse);
            path.transform(inverse);
            path.lineTo(this.f4004b, this.f4005c);
            path.transform(transform);
        }
    }

    /* renamed from: b.a.a.a.g0.m$d */
    public static class C0971d extends C0973f {

        /* renamed from: h */
        public static final RectF f3997h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f3998b;
        @Deprecated

        /* renamed from: c */
        public float f3999c;
        @Deprecated

        /* renamed from: d */
        public float f4000d;
        @Deprecated

        /* renamed from: e */
        public float f4001e;
        @Deprecated

        /* renamed from: f */
        public float f4002f;
        @Deprecated

        /* renamed from: g */
        public float f4003g;

        public C0971d(float left, float top, float right, float bottom) {
            mo5717q(left);
            mo5721u(top);
            mo5718r(right);
            mo5716p(bottom);
        }

        /* renamed from: a */
        public void mo5709a(Matrix transform, Path path) {
            Matrix inverse = this.f4006a;
            transform.invert(inverse);
            path.transform(inverse);
            RectF rectF = f3997h;
            rectF.set(mo5711k(), mo5715o(), mo5712l(), mo5710j());
            path.arcTo(rectF, mo5713m(), mo5714n(), false);
            path.transform(transform);
        }

        /* renamed from: k */
        public final float mo5711k() {
            return this.f3998b;
        }

        /* renamed from: o */
        public final float mo5715o() {
            return this.f3999c;
        }

        /* renamed from: l */
        public final float mo5712l() {
            return this.f4000d;
        }

        /* renamed from: j */
        public final float mo5710j() {
            return this.f4001e;
        }

        /* renamed from: q */
        public final void mo5717q(float left) {
            this.f3998b = left;
        }

        /* renamed from: u */
        public final void mo5721u(float top) {
            this.f3999c = top;
        }

        /* renamed from: r */
        public final void mo5718r(float right) {
            this.f4000d = right;
        }

        /* renamed from: p */
        public final void mo5716p(float bottom) {
            this.f4001e = bottom;
        }

        /* renamed from: m */
        public final float mo5713m() {
            return this.f4002f;
        }

        /* renamed from: n */
        public final float mo5714n() {
            return this.f4003g;
        }

        /* renamed from: s */
        public final void mo5719s(float startAngle) {
            this.f4002f = startAngle;
        }

        /* renamed from: t */
        public final void mo5720t(float sweepAngle) {
            this.f4003g = sweepAngle;
        }
    }
}
