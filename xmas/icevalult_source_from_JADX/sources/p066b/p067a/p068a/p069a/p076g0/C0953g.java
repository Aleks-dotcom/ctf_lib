package p066b.p067a.p068a.p069a.p076g0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import p000a.p025h.p029f.p030j.C0371b;
import p000a.p025h.p037l.C0414c;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.p075f0.C0944a;
import p066b.p067a.p068a.p069a.p076g0.C0960k;
import p066b.p067a.p068a.p069a.p076g0.C0964l;
import p066b.p067a.p068a.p069a.p076g0.C0967m;
import p066b.p067a.p068a.p069a.p091u.C1060a;
import p066b.p067a.p068a.p069a.p094x.C1098a;

/* renamed from: b.a.a.a.g0.g */
public class C0953g extends Drawable implements C0371b, C0975n {

    /* renamed from: w */
    public static final Paint f3899w = new Paint(1);

    /* renamed from: b */
    public C0956c f3900b;

    /* renamed from: c */
    public final C0967m.C0974g[] f3901c;

    /* renamed from: d */
    public final C0967m.C0974g[] f3902d;

    /* renamed from: e */
    public boolean f3903e;

    /* renamed from: f */
    public final Matrix f3904f;

    /* renamed from: g */
    public final Path f3905g;

    /* renamed from: h */
    public final Path f3906h;

    /* renamed from: i */
    public final RectF f3907i;

    /* renamed from: j */
    public final RectF f3908j;

    /* renamed from: k */
    public final Region f3909k;

    /* renamed from: l */
    public final Region f3910l;

    /* renamed from: m */
    public C0960k f3911m;

    /* renamed from: n */
    public final Paint f3912n;

    /* renamed from: o */
    public final Paint f3913o;

    /* renamed from: p */
    public final C0944a f3914p;

    /* renamed from: q */
    public final C0964l.C0965a f3915q;

    /* renamed from: r */
    public final C0964l f3916r;

    /* renamed from: s */
    public PorterDuffColorFilter f3917s;

    /* renamed from: t */
    public PorterDuffColorFilter f3918t;

    /* renamed from: u */
    public Rect f3919u;

    /* renamed from: v */
    public final RectF f3920v;

    public /* synthetic */ C0953g(C0956c x0, C0954a x1) {
        this(x0);
    }

    /* renamed from: l */
    public static C0953g m5119l(Context context, float elevation) {
        int colorSurface = C1060a.m5720b(context, C0924b.colorSurface, C0953g.class.getSimpleName());
        C0953g materialShapeDrawable = new C0953g();
        materialShapeDrawable.mo5581L(context);
        materialShapeDrawable.mo5588T(ColorStateList.valueOf(colorSurface));
        materialShapeDrawable.mo5587S(elevation);
        return materialShapeDrawable;
    }

    public C0953g() {
        this(new C0960k());
    }

    public C0953g(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this(C0960k.m5186e(context, attrs, defStyleAttr, defStyleRes).mo5662m());
    }

    public C0953g(C0960k shapeAppearanceModel) {
        this(new C0956c(shapeAppearanceModel, (C1098a) null));
    }

    public C0953g(C0956c drawableState) {
        this.f3901c = new C0967m.C0974g[4];
        this.f3902d = new C0967m.C0974g[4];
        this.f3904f = new Matrix();
        this.f3905g = new Path();
        this.f3906h = new Path();
        this.f3907i = new RectF();
        this.f3908j = new RectF();
        this.f3909k = new Region();
        this.f3910l = new Region();
        Paint paint = new Paint(1);
        this.f3912n = paint;
        Paint paint2 = new Paint(1);
        this.f3913o = paint2;
        this.f3914p = new C0944a();
        this.f3916r = new C0964l();
        this.f3920v = new RectF();
        this.f3900b = drawableState;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f3899w;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        mo5598d0();
        mo5597c0(getState());
        this.f3915q = new C0954a();
    }

    /* renamed from: b.a.a.a.g0.g$a */
    public class C0954a implements C0964l.C0965a {
        public C0954a() {
        }

        /* renamed from: a */
        public void mo5634a(C0967m cornerPath, Matrix transform, int count) {
            C0953g.this.f3901c[count] = cornerPath.mo5691e(transform);
        }

        /* renamed from: b */
        public void mo5635b(C0967m edgePath, Matrix transform, int count) {
            C0953g.this.f3902d[count] = edgePath.mo5691e(transform);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f3900b;
    }

    public Drawable mutate() {
        this.f3900b = new C0956c(this.f3900b);
        return this;
    }

    /* renamed from: P */
    public static int m5115P(int paintAlpha, int alpha) {
        return (paintAlpha * ((alpha >>> 7) + alpha)) >>> 8;
    }

    public void setShapeAppearanceModel(C0960k shapeAppearanceModel) {
        this.f3900b.f3923a = shapeAppearanceModel;
        invalidateSelf();
    }

    /* renamed from: B */
    public C0960k mo5571B() {
        return this.f3900b.f3923a;
    }

    /* renamed from: T */
    public void mo5588T(ColorStateList fillColor) {
        C0956c cVar = this.f3900b;
        if (cVar.f3926d != fillColor) {
            cVar.f3926d = fillColor;
            onStateChange(getState());
        }
    }

    /* renamed from: w */
    public ColorStateList mo5630w() {
        return this.f3900b.f3926d;
    }

    /* renamed from: a0 */
    public void mo5595a0(ColorStateList strokeColor) {
        C0956c cVar = this.f3900b;
        if (cVar.f3927e != strokeColor) {
            cVar.f3927e = strokeColor;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        C0956c cVar = this.f3900b;
        if (cVar.f3930h != tintMode) {
            cVar.f3930h = tintMode;
            mo5598d0();
            mo5582M();
        }
    }

    public void setTintList(ColorStateList tintList) {
        this.f3900b.f3929g = tintList;
        mo5598d0();
        mo5582M();
    }

    /* renamed from: D */
    public ColorStateList mo5573D() {
        return this.f3900b.f3929g;
    }

    public void setTint(int tintColor) {
        setTintList(ColorStateList.valueOf(tintColor));
    }

    /* renamed from: Y */
    public void mo5593Y(float strokeWidth, int strokeColor) {
        mo5596b0(strokeWidth);
        mo5595a0(ColorStateList.valueOf(strokeColor));
    }

    /* renamed from: Z */
    public void mo5594Z(float strokeWidth, ColorStateList strokeColor) {
        mo5596b0(strokeWidth);
        mo5595a0(strokeColor);
    }

    /* renamed from: b0 */
    public void mo5596b0(float strokeWidth) {
        this.f3900b.f3934l = strokeWidth;
        invalidateSelf();
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int alpha) {
        C0956c cVar = this.f3900b;
        if (cVar.f3935m != alpha) {
            cVar.f3935m = alpha;
            mo5582M();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3900b.f3925c = colorFilter;
        mo5582M();
    }

    public Region getTransparentRegion() {
        this.f3909k.set(getBounds());
        mo5602f(mo5627t(), this.f3905g);
        this.f3910l.setPath(this.f3905g, this.f3909k);
        this.f3909k.op(this.f3910l, Region.Op.DIFFERENCE);
        return this.f3909k;
    }

    /* renamed from: t */
    public RectF mo5627t() {
        Rect bounds = getBounds();
        this.f3907i.set((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
        return this.f3907i;
    }

    public boolean getPadding(Rect padding) {
        Rect rect = this.f3919u;
        if (rect == null) {
            return super.getPadding(padding);
        }
        padding.set(rect);
        return true;
    }

    /* renamed from: V */
    public void mo5590V(int left, int top, int right, int bottom) {
        C0956c cVar = this.f3900b;
        if (cVar.f3931i == null) {
            cVar.f3931i = new Rect();
        }
        this.f3900b.f3931i.set(left, top, right, bottom);
        this.f3919u = this.f3900b.f3931i;
        invalidateSelf();
    }

    /* renamed from: N */
    public boolean mo5583N() {
        C1098a aVar = this.f3900b.f3924b;
        return aVar != null && aVar.mo6279d();
    }

    /* renamed from: L */
    public void mo5581L(Context context) {
        this.f3900b.f3924b = new C1098a(context);
        mo5601e0();
    }

    /* renamed from: k */
    public final int mo5614k(int backgroundColor) {
        float elevation = mo5577H() + mo5631x();
        C1098a aVar = this.f3900b.f3924b;
        return aVar != null ? aVar.mo6278c(backgroundColor, elevation) : backgroundColor;
    }

    /* renamed from: U */
    public void mo5589U(float interpolation) {
        C0956c cVar = this.f3900b;
        if (cVar.f3933k != interpolation) {
            cVar.f3933k = interpolation;
            this.f3903e = true;
            invalidateSelf();
        }
    }

    /* renamed from: x */
    public float mo5631x() {
        return this.f3900b.f3936n;
    }

    /* renamed from: W */
    public void mo5591W(float parentAbsoluteElevation) {
        C0956c cVar = this.f3900b;
        if (cVar.f3936n != parentAbsoluteElevation) {
            cVar.f3936n = parentAbsoluteElevation;
            mo5601e0();
        }
    }

    /* renamed from: v */
    public float mo5629v() {
        return this.f3900b.f3937o;
    }

    /* renamed from: S */
    public void mo5587S(float elevation) {
        C0956c cVar = this.f3900b;
        if (cVar.f3937o != elevation) {
            cVar.f3937o = elevation;
            mo5601e0();
        }
    }

    /* renamed from: G */
    public float mo5576G() {
        return this.f3900b.f3938p;
    }

    /* renamed from: H */
    public float mo5577H() {
        return mo5629v() + mo5576G();
    }

    /* renamed from: e0 */
    public final void mo5601e0() {
        float z = mo5577H();
        this.f3900b.f3940r = (int) Math.ceil((double) (0.75f * z));
        this.f3900b.f3941s = (int) Math.ceil((double) (0.25f * z));
        mo5598d0();
        mo5582M();
    }

    /* renamed from: X */
    public void mo5592X(int shadowRotation) {
        C0956c cVar = this.f3900b;
        if (cVar.f3942t != shadowRotation) {
            cVar.f3942t = shadowRotation;
            mo5582M();
        }
    }

    /* renamed from: A */
    public int mo5570A() {
        return this.f3900b.f3940r;
    }

    /* renamed from: R */
    public final boolean mo5586R() {
        return Build.VERSION.SDK_INT < 21 || (!mo5584O() && !this.f3905g.isConvex());
    }

    public void invalidateSelf() {
        this.f3903e = true;
        super.invalidateSelf();
    }

    /* renamed from: M */
    public final void mo5582M() {
        super.invalidateSelf();
    }

    /* renamed from: I */
    public final boolean mo5578I() {
        C0956c cVar = this.f3900b;
        int i = cVar.f3939q;
        if (i == 1 || cVar.f3940r <= 0 || (i != 2 && !mo5586R())) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public final boolean mo5579J() {
        Paint.Style style = this.f3900b.f3944v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: K */
    public final boolean mo5580K() {
        Paint.Style style = this.f3900b.f3944v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f3913o.getStrokeWidth() > 0.0f;
    }

    public void onBoundsChange(Rect bounds) {
        this.f3903e = true;
        super.onBoundsChange(bounds);
    }

    public void draw(Canvas canvas) {
        this.f3912n.setColorFilter(this.f3917s);
        int prevAlpha = this.f3912n.getAlpha();
        this.f3912n.setAlpha(m5115P(prevAlpha, this.f3900b.f3935m));
        this.f3913o.setColorFilter(this.f3918t);
        this.f3913o.setStrokeWidth(this.f3900b.f3934l);
        int prevStrokeAlpha = this.f3913o.getAlpha();
        this.f3913o.setAlpha(m5115P(prevStrokeAlpha, this.f3900b.f3935m));
        if (this.f3903e) {
            mo5609h();
            mo5602f(mo5627t(), this.f3905g);
            this.f3903e = false;
        }
        if (mo5578I()) {
            canvas.save();
            mo5585Q(canvas);
            int pathExtraWidth = (int) (this.f3920v.width() - ((float) getBounds().width()));
            int pathExtraHeight = (int) (this.f3920v.height() - ((float) getBounds().height()));
            Bitmap shadowLayer = Bitmap.createBitmap(((int) this.f3920v.width()) + (this.f3900b.f3940r * 2) + pathExtraWidth, ((int) this.f3920v.height()) + (this.f3900b.f3940r * 2) + pathExtraHeight, Bitmap.Config.ARGB_8888);
            Canvas shadowCanvas = new Canvas(shadowLayer);
            float shadowLeft = (float) ((getBounds().left - this.f3900b.f3940r) - pathExtraWidth);
            float shadowTop = (float) ((getBounds().top - this.f3900b.f3940r) - pathExtraHeight);
            shadowCanvas.translate(-shadowLeft, -shadowTop);
            mo5615m(shadowCanvas);
            canvas.drawBitmap(shadowLayer, shadowLeft, shadowTop, (Paint) null);
            shadowLayer.recycle();
            canvas.restore();
        }
        if (mo5579J() != 0) {
            mo5617n(canvas);
        }
        if (mo5580K()) {
            mo5622q(canvas);
        }
        this.f3912n.setAlpha(prevAlpha);
        this.f3913o.setAlpha(prevStrokeAlpha);
    }

    /* renamed from: o */
    public void mo5618o(Canvas canvas, Paint paint, Path path, RectF bounds) {
        mo5621p(canvas, paint, path, this.f3900b.f3923a, bounds);
    }

    /* renamed from: p */
    public final void mo5621p(Canvas canvas, Paint paint, Path path, C0960k shapeAppearanceModel, RectF bounds) {
        if (shapeAppearanceModel.mo5653u(bounds)) {
            float cornerSize = shapeAppearanceModel.mo5652t().mo5562a(bounds);
            canvas.drawRoundRect(bounds, cornerSize, cornerSize, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: n */
    public final void mo5617n(Canvas canvas) {
        mo5621p(canvas, this.f3912n, this.f3905g, this.f3900b.f3923a, mo5627t());
    }

    /* renamed from: q */
    public final void mo5622q(Canvas canvas) {
        mo5621p(canvas, this.f3913o, this.f3906h, this.f3911m, mo5628u());
    }

    /* renamed from: Q */
    public final void mo5585Q(Canvas canvas) {
        int shadowOffsetX = mo5632y();
        int shadowOffsetY = mo5633z();
        if (Build.VERSION.SDK_INT < 21) {
            Rect canvasClipBounds = canvas.getClipBounds();
            int i = this.f3900b.f3940r;
            canvasClipBounds.inset(-i, -i);
            canvasClipBounds.offset(shadowOffsetX, shadowOffsetY);
            canvas.clipRect(canvasClipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) shadowOffsetX, (float) shadowOffsetY);
    }

    /* renamed from: m */
    public final void mo5615m(Canvas canvas) {
        if (this.f3900b.f3941s != 0) {
            canvas.drawPath(this.f3905g, this.f3914p.mo5557c());
        }
        for (int index = 0; index < 4; index++) {
            this.f3901c[index].mo5722b(this.f3914p, this.f3900b.f3940r, canvas);
            this.f3902d[index].mo5722b(this.f3914p, this.f3900b.f3940r, canvas);
        }
        int shadowOffsetX = mo5632y();
        int shadowOffsetY = mo5633z();
        canvas.translate((float) (-shadowOffsetX), (float) (-shadowOffsetY));
        canvas.drawPath(this.f3905g, f3899w);
        canvas.translate((float) shadowOffsetX, (float) shadowOffsetY);
    }

    /* renamed from: y */
    public int mo5632y() {
        C0956c cVar = this.f3900b;
        return (int) (((double) cVar.f3941s) * Math.sin(Math.toRadians((double) cVar.f3942t)));
    }

    /* renamed from: z */
    public int mo5633z() {
        C0956c cVar = this.f3900b;
        return (int) (((double) cVar.f3941s) * Math.cos(Math.toRadians((double) cVar.f3942t)));
    }

    /* renamed from: g */
    public final void mo5603g(RectF bounds, Path path) {
        C0964l lVar = this.f3916r;
        C0956c cVar = this.f3900b;
        C0960k kVar = cVar.f3923a;
        float f = cVar.f3933k;
        lVar.mo5679e(kVar, f, bounds, this.f3915q, path);
    }

    /* renamed from: h */
    public final void mo5609h() {
        C0960k x = mo5571B().mo5656x(new C0955b(this, -mo5572C()));
        this.f3911m = x;
        this.f3916r.mo5678d(x, this.f3900b.f3933k, mo5628u(), this.f3906h);
    }

    /* renamed from: b.a.a.a.g0.g$b */
    public class C0955b implements C0960k.C0963c {

        /* renamed from: a */
        public final /* synthetic */ float f3922a;

        public C0955b(C0953g this$0, float f) {
            this.f3922a = f;
        }

        /* renamed from: a */
        public C0949c mo5636a(C0949c cornerSize) {
            return cornerSize instanceof C0958i ? cornerSize : new C0948b(this.f3922a, cornerSize);
        }
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f3900b.f3939q != 2) {
            if (mo5584O()) {
                outline.setRoundRect(getBounds(), mo5574E());
                return;
            }
            mo5602f(mo5627t(), this.f3905g);
            if (this.f3905g.isConvex()) {
                outline.setConvexPath(this.f3905g);
            }
        }
    }

    /* renamed from: f */
    public final void mo5602f(RectF bounds, Path path) {
        mo5603g(bounds, path);
        if (this.f3900b.f3932j != 1.0f) {
            this.f3904f.reset();
            Matrix matrix = this.f3904f;
            float f = this.f3900b.f3932j;
            matrix.setScale(f, f, bounds.width() / 2.0f, bounds.height() / 2.0f);
            path.transform(this.f3904f);
        }
        path.computeBounds(this.f3920v, true);
    }

    /* renamed from: d0 */
    public final boolean mo5598d0() {
        PorterDuffColorFilter originalTintFilter = this.f3917s;
        PorterDuffColorFilter originalStrokeTintFilter = this.f3918t;
        C0956c cVar = this.f3900b;
        this.f3917s = mo5613j(cVar.f3929g, cVar.f3930h, this.f3912n, true);
        C0956c cVar2 = this.f3900b;
        this.f3918t = mo5613j(cVar2.f3928f, cVar2.f3930h, this.f3913o, false);
        C0956c cVar3 = this.f3900b;
        if (cVar3.f3943u) {
            this.f3914p.mo5558d(cVar3.f3929g.getColorForState(getState(), 0));
        }
        if (!C0414c.m2049a(originalTintFilter, this.f3917s) || !C0414c.m2049a(originalStrokeTintFilter, this.f3918t)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final PorterDuffColorFilter mo5613j(ColorStateList tintList, PorterDuff.Mode tintMode, Paint paint, boolean requiresElevationOverlay) {
        if (tintList == null || tintMode == null) {
            return mo5600e(paint, requiresElevationOverlay);
        }
        return mo5610i(tintList, tintMode, requiresElevationOverlay);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r5.getColor();
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PorterDuffColorFilter mo5600e(android.graphics.Paint r5, boolean r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L_0x0014
            int r0 = r5.getColor()
            int r1 = r4.mo5614k(r0)
            if (r1 == r0) goto L_0x0014
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r1, r3)
            return r2
        L_0x0014:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p066b.p067a.p068a.p069a.p076g0.C0953g.mo5600e(android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    /* renamed from: i */
    public final PorterDuffColorFilter mo5610i(ColorStateList tintList, PorterDuff.Mode tintMode, boolean requiresElevationOverlay) {
        int tintColor = tintList.getColorForState(getState(), 0);
        if (requiresElevationOverlay) {
            tintColor = mo5614k(tintColor);
        }
        return new PorterDuffColorFilter(tintColor, tintMode);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f3900b.f3927e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f3900b.f3926d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f3900b.f3929g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f3900b.f3928f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            b.a.a.a.g0.g$c r0 = r1.f3900b
            android.content.res.ColorStateList r0 = r0.f3929g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            b.a.a.a.g0.g$c r0 = r1.f3900b
            android.content.res.ColorStateList r0 = r0.f3928f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            b.a.a.a.g0.g$c r0 = r1.f3900b
            android.content.res.ColorStateList r0 = r0.f3927e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            b.a.a.a.g0.g$c r0 = r1.f3900b
            android.content.res.ColorStateList r0 = r0.f3926d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p066b.p067a.p068a.p069a.p076g0.C0953g.isStateful():boolean");
    }

    public boolean onStateChange(int[] state) {
        boolean invalidateSelf = mo5597c0(state) || mo5598d0();
        if (invalidateSelf) {
            invalidateSelf();
        }
        return invalidateSelf;
    }

    /* renamed from: c0 */
    public final boolean mo5597c0(int[] state) {
        int previousStrokeColor;
        int newStrokeColor;
        int previousFillColor;
        int newFillColor;
        boolean invalidateSelf = false;
        if (!(this.f3900b.f3926d == null || (previousFillColor = this.f3912n.getColor()) == (newFillColor = this.f3900b.f3926d.getColorForState(state, previousFillColor)))) {
            this.f3912n.setColor(newFillColor);
            invalidateSelf = true;
        }
        if (this.f3900b.f3927e == null || (previousStrokeColor = this.f3913o.getColor()) == (newStrokeColor = this.f3900b.f3927e.getColorForState(state, previousStrokeColor))) {
            return invalidateSelf;
        }
        this.f3913o.setColor(newStrokeColor);
        return true;
    }

    /* renamed from: C */
    public final float mo5572C() {
        if (mo5580K()) {
            return this.f3913o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: u */
    public final RectF mo5628u() {
        RectF rectF = mo5627t();
        float inset = mo5572C();
        this.f3908j.set(rectF.left + inset, rectF.top + inset, rectF.right - inset, rectF.bottom - inset);
        return this.f3908j;
    }

    /* renamed from: E */
    public float mo5574E() {
        return this.f3900b.f3923a.mo5650r().mo5562a(mo5627t());
    }

    /* renamed from: F */
    public float mo5575F() {
        return this.f3900b.f3923a.mo5652t().mo5562a(mo5627t());
    }

    /* renamed from: r */
    public float mo5623r() {
        return this.f3900b.f3923a.mo5643j().mo5562a(mo5627t());
    }

    /* renamed from: s */
    public float mo5624s() {
        return this.f3900b.f3923a.mo5645l().mo5562a(mo5627t());
    }

    /* renamed from: O */
    public boolean mo5584O() {
        return this.f3900b.f3923a.mo5653u(mo5627t());
    }

    /* renamed from: b.a.a.a.g0.g$c */
    public static final class C0956c extends Drawable.ConstantState {

        /* renamed from: a */
        public C0960k f3923a;

        /* renamed from: b */
        public C1098a f3924b;

        /* renamed from: c */
        public ColorFilter f3925c;

        /* renamed from: d */
        public ColorStateList f3926d = null;

        /* renamed from: e */
        public ColorStateList f3927e = null;

        /* renamed from: f */
        public ColorStateList f3928f = null;

        /* renamed from: g */
        public ColorStateList f3929g = null;

        /* renamed from: h */
        public PorterDuff.Mode f3930h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i */
        public Rect f3931i = null;

        /* renamed from: j */
        public float f3932j = 1.0f;

        /* renamed from: k */
        public float f3933k = 1.0f;

        /* renamed from: l */
        public float f3934l;

        /* renamed from: m */
        public int f3935m = 255;

        /* renamed from: n */
        public float f3936n = 0.0f;

        /* renamed from: o */
        public float f3937o = 0.0f;

        /* renamed from: p */
        public float f3938p = 0.0f;

        /* renamed from: q */
        public int f3939q = 0;

        /* renamed from: r */
        public int f3940r = 0;

        /* renamed from: s */
        public int f3941s = 0;

        /* renamed from: t */
        public int f3942t = 0;

        /* renamed from: u */
        public boolean f3943u = false;

        /* renamed from: v */
        public Paint.Style f3944v = Paint.Style.FILL_AND_STROKE;

        public C0956c(C0960k shapeAppearanceModel, C1098a elevationOverlayProvider) {
            this.f3923a = shapeAppearanceModel;
            this.f3924b = elevationOverlayProvider;
        }

        public C0956c(C0956c orig) {
            this.f3923a = orig.f3923a;
            this.f3924b = orig.f3924b;
            this.f3934l = orig.f3934l;
            this.f3925c = orig.f3925c;
            this.f3926d = orig.f3926d;
            this.f3927e = orig.f3927e;
            this.f3930h = orig.f3930h;
            this.f3929g = orig.f3929g;
            this.f3935m = orig.f3935m;
            this.f3932j = orig.f3932j;
            this.f3941s = orig.f3941s;
            this.f3939q = orig.f3939q;
            this.f3943u = orig.f3943u;
            this.f3933k = orig.f3933k;
            this.f3936n = orig.f3936n;
            this.f3937o = orig.f3937o;
            this.f3938p = orig.f3938p;
            this.f3940r = orig.f3940r;
            this.f3942t = orig.f3942t;
            this.f3928f = orig.f3928f;
            this.f3944v = orig.f3944v;
            if (orig.f3931i != null) {
                this.f3931i = new Rect(orig.f3931i);
            }
        }

        public Drawable newDrawable() {
            C0953g msd = new C0953g(this, (C0954a) null);
            boolean unused = msd.f3903e = true;
            return msd;
        }

        public int getChangingConfigurations() {
            return 0;
        }
    }
}
