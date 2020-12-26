package p066b.p067a.p068a.p069a.p088s;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p025h.p029f.C0356a;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p025h.p029f.p030j.C0371b;
import p000a.p025h.p036k.C0396a;
import p066b.p067a.p068a.p069a.C1020k;
import p066b.p067a.p068a.p069a.p070a0.C0918f;
import p066b.p067a.p068a.p069a.p070a0.C0921g;
import p066b.p067a.p068a.p069a.p073d0.C0932c;
import p066b.p067a.p068a.p069a.p073d0.C0933d;
import p066b.p067a.p068a.p069a.p074e0.C0942b;
import p066b.p067a.p068a.p069a.p076g0.C0953g;
import p066b.p067a.p068a.p069a.p081l.C1030h;
import p066b.p067a.p068a.p069a.p085p.C1042a;
import p066b.p067a.p068a.p069a.p091u.C1060a;
import p066b.p067a.p068a.p069a.p093w.C1097a;

/* renamed from: b.a.a.a.s.a */
public class C1047a extends C0953g implements C0371b, Drawable.Callback, C0918f.C0920b {

    /* renamed from: G0 */
    public static final int[] f4395G0 = {16842910};

    /* renamed from: H0 */
    public static final ShapeDrawable f4396H0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    public float f4397A;

    /* renamed from: A0 */
    public ColorStateList f4398A0;

    /* renamed from: B */
    public ColorStateList f4399B;

    /* renamed from: B0 */
    public WeakReference<C1048a> f4400B0 = new WeakReference<>((Object) null);

    /* renamed from: C */
    public float f4401C;

    /* renamed from: C0 */
    public TextUtils.TruncateAt f4402C0;

    /* renamed from: D */
    public ColorStateList f4403D;

    /* renamed from: D0 */
    public boolean f4404D0;

    /* renamed from: E */
    public CharSequence f4405E;

    /* renamed from: E0 */
    public int f4406E0;

    /* renamed from: F */
    public boolean f4407F;

    /* renamed from: F0 */
    public boolean f4408F0;

    /* renamed from: G */
    public Drawable f4409G;

    /* renamed from: H */
    public ColorStateList f4410H;

    /* renamed from: I */
    public float f4411I;

    /* renamed from: J */
    public boolean f4412J;

    /* renamed from: K */
    public boolean f4413K;

    /* renamed from: L */
    public Drawable f4414L;

    /* renamed from: M */
    public Drawable f4415M;

    /* renamed from: N */
    public ColorStateList f4416N;

    /* renamed from: O */
    public float f4417O;

    /* renamed from: P */
    public CharSequence f4418P;

    /* renamed from: Q */
    public boolean f4419Q;

    /* renamed from: R */
    public boolean f4420R;

    /* renamed from: S */
    public Drawable f4421S;

    /* renamed from: T */
    public C1030h f4422T;

    /* renamed from: U */
    public C1030h f4423U;

    /* renamed from: V */
    public float f4424V;

    /* renamed from: W */
    public float f4425W;

    /* renamed from: X */
    public float f4426X;

    /* renamed from: Y */
    public float f4427Y;

    /* renamed from: Z */
    public float f4428Z;

    /* renamed from: a0 */
    public float f4429a0;

    /* renamed from: b0 */
    public float f4430b0;

    /* renamed from: c0 */
    public float f4431c0;

    /* renamed from: d0 */
    public final Context f4432d0;

    /* renamed from: e0 */
    public final Paint f4433e0 = new Paint(1);

    /* renamed from: f0 */
    public final Paint f4434f0;

    /* renamed from: g0 */
    public final Paint.FontMetrics f4435g0 = new Paint.FontMetrics();

    /* renamed from: h0 */
    public final RectF f4436h0 = new RectF();

    /* renamed from: i0 */
    public final PointF f4437i0 = new PointF();

    /* renamed from: j0 */
    public final Path f4438j0 = new Path();

    /* renamed from: k0 */
    public final C0918f f4439k0;

    /* renamed from: l0 */
    public int f4440l0;

    /* renamed from: m0 */
    public int f4441m0;

    /* renamed from: n0 */
    public int f4442n0;

    /* renamed from: o0 */
    public int f4443o0;

    /* renamed from: p0 */
    public int f4444p0;

    /* renamed from: q0 */
    public int f4445q0;

    /* renamed from: r0 */
    public boolean f4446r0;

    /* renamed from: s0 */
    public int f4447s0;

    /* renamed from: t0 */
    public int f4448t0 = 255;

    /* renamed from: u0 */
    public ColorFilter f4449u0;

    /* renamed from: v0 */
    public PorterDuffColorFilter f4450v0;

    /* renamed from: w0 */
    public ColorStateList f4451w0;

    /* renamed from: x */
    public ColorStateList f4452x;

    /* renamed from: x0 */
    public PorterDuff.Mode f4453x0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: y */
    public ColorStateList f4454y;

    /* renamed from: y0 */
    public int[] f4455y0;

    /* renamed from: z */
    public float f4456z;

    /* renamed from: z0 */
    public boolean f4457z0;

    /* renamed from: b.a.a.a.s.a$a */
    public interface C1048a {
        /* renamed from: a */
        void mo6151a();
    }

    /* renamed from: q0 */
    public static C1047a m5564q0(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        C1047a chip = new C1047a(context, attrs, defStyleAttr, defStyleRes);
        chip.mo6106m1(attrs, defStyleAttr, defStyleRes);
        return chip;
    }

    public C1047a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        mo5581L(context);
        this.f4432d0 = context;
        C0918f fVar = new C0918f(this);
        this.f4439k0 = fVar;
        this.f4405E = "";
        fVar.mo5515e().density = context.getResources().getDisplayMetrics().density;
        this.f4434f0 = null;
        int[] iArr = f4395G0;
        setState(iArr);
        mo6076b2(iArr);
        this.f4404D0 = true;
        if (C0942b.f3881a) {
            f4396H0.setTint(-1);
        }
    }

    /* renamed from: m1 */
    public final void mo6106m1(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray a = C0921g.m5054k(this.f4432d0, attrs, C1020k.f4264o, defStyleAttr, defStyleRes, new int[0]);
        this.f4408F0 = a.hasValue(C1020k.f4194Y);
        mo6056R1(C0932c.m5073a(this.f4432d0, a, C1020k.f4142L));
        mo6137v1(C0932c.m5073a(this.f4432d0, a, C1020k.f4304y));
        mo6040J1(a.getDimension(C1020k.f4122G, 0.0f));
        int i = C1020k.f4308z;
        if (a.hasValue(i)) {
            mo6143x1(a.getDimension(i, 0.0f));
        }
        mo6048N1(C0932c.m5073a(this.f4432d0, a, C1020k.f4134J));
        mo6052P1(a.getDimension(C1020k.f4138K, 0.0f));
        mo6113o2(C0932c.m5073a(this.f4432d0, a, C1020k.f4190X));
        mo6131t2(a.getText(C1020k.f4284t));
        mo6134u2(C0932c.m5078f(this.f4432d0, a, C1020k.f4268p));
        int ellipsize = a.getInt(C1020k.f4276r, 0);
        if (ellipsize == 1) {
            mo6087g2(TextUtils.TruncateAt.START);
        } else if (ellipsize == 2) {
            mo6087g2(TextUtils.TruncateAt.MIDDLE);
        } else if (ellipsize == 3) {
            mo6087g2(TextUtils.TruncateAt.END);
        }
        mo6038I1(a.getBoolean(C1020k.f4118F, false));
        if (!(attrs == null || attrs.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attrs.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            mo6038I1(a.getBoolean(C1020k.f4106C, false));
        }
        mo6017B1(C0932c.m5076d(this.f4432d0, a, C1020k.f4102B));
        int i2 = C1020k.f4114E;
        if (a.hasValue(i2)) {
            mo6029F1(C0932c.m5073a(this.f4432d0, a, i2));
        }
        mo6023D1(a.getDimension(C1020k.f4110D, 0.0f));
        mo6082e2(a.getBoolean(C1020k.f4170S, false));
        if (!(attrs == null || attrs.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attrs.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            mo6082e2(a.getBoolean(C1020k.f4150N, false));
        }
        mo6058S1(C0932c.m5076d(this.f4432d0, a, C1020k.f4146M));
        mo6078c2(C0932c.m5073a(this.f4432d0, a, C1020k.f4166R));
        mo6068X1(a.getDimension(C1020k.f4158P, 0.0f));
        mo6117p1(a.getBoolean(C1020k.f4288u, false));
        mo6133u1(a.getBoolean(C1020k.f4300x, false));
        if (!(attrs == null || attrs.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attrs.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            mo6133u1(a.getBoolean(C1020k.f4296w, false));
        }
        mo6122r1(C0932c.m5076d(this.f4432d0, a, C1020k.f4292v));
        mo6123r2(C1030h.m5432b(this.f4432d0, a, C1020k.f4198Z));
        mo6094h2(C1030h.m5432b(this.f4432d0, a, C1020k.f4178U));
        mo6044L1(a.getDimension(C1020k.f4130I, 0.0f));
        mo6104l2(a.getDimension(C1020k.f4186W, 0.0f));
        mo6100j2(a.getDimension(C1020k.f4182V, 0.0f));
        mo6147y2(a.getDimension(C1020k.f4208b0, 0.0f));
        mo6141w2(a.getDimension(C1020k.f4203a0, 0.0f));
        mo6072Z1(a.getDimension(C1020k.f4162Q, 0.0f));
        mo6062U1(a.getDimension(C1020k.f4154O, 0.0f));
        mo6149z1(a.getDimension(C1020k.f4098A, 0.0f));
        mo6110n2(a.getDimensionPixelSize(C1020k.f4280s, Integer.MAX_VALUE));
        a.recycle();
    }

    /* renamed from: A2 */
    public void mo6015A2(boolean useCompatRipple) {
        if (this.f4457z0 != useCompatRipple) {
            this.f4457z0 = useCompatRipple;
            mo6033G2();
            onStateChange(getState());
        }
    }

    /* renamed from: e1 */
    public boolean mo6081e1() {
        return this.f4457z0;
    }

    /* renamed from: f2 */
    public void mo6084f2(C1048a delegate) {
        this.f4400B0 = new WeakReference<>(delegate);
    }

    /* renamed from: n1 */
    public void mo6109n1() {
        C1048a delegate = (C1048a) this.f4400B0.get();
        if (delegate != null) {
            delegate.mo6151a();
        }
    }

    /* renamed from: S0 */
    public void mo6057S0(RectF bounds) {
        mo6101k0(getBounds(), bounds);
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f4424V + mo6092h0() + this.f4427Y + this.f4439k0.mo5516f(mo6071Z0().toString()) + this.f4428Z + mo6103l0() + this.f4431c0), this.f4406E0);
    }

    public int getIntrinsicHeight() {
        return (int) this.f4456z;
    }

    /* renamed from: D2 */
    public final boolean mo6024D2() {
        return this.f4407F && this.f4409G != null;
    }

    /* renamed from: C2 */
    public final boolean mo6021C2() {
        return this.f4420R && this.f4421S != null && this.f4446r0;
    }

    /* renamed from: E2 */
    public final boolean mo6027E2() {
        return this.f4413K && this.f4414L != null;
    }

    /* renamed from: p0 */
    public final boolean mo6116p0() {
        return this.f4420R && this.f4421S != null && this.f4419Q;
    }

    /* renamed from: h0 */
    public float mo6092h0() {
        if (mo6024D2() || mo6021C2()) {
            return this.f4425W + this.f4411I + this.f4426X;
        }
        return 0.0f;
    }

    /* renamed from: l0 */
    public float mo6103l0() {
        if (mo6027E2()) {
            return this.f4429a0 + this.f4417O + this.f4430b0;
        }
        return 0.0f;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int saveCount = 0;
            int i = this.f4448t0;
            if (i < 255) {
                saveCount = C1042a.m5523a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i);
            }
            mo6136v0(canvas, bounds);
            mo6124s0(canvas, bounds);
            if (this.f4408F0) {
                super.draw(canvas);
            }
            mo6132u0(canvas, bounds);
            mo6142x0(canvas, bounds);
            mo6129t0(canvas, bounds);
            mo6121r0(canvas, bounds);
            if (this.f4404D0) {
                mo6148z0(canvas, bounds);
            }
            mo6139w0(canvas, bounds);
            mo6145y0(canvas, bounds);
            if (this.f4448t0 < 255) {
                canvas.restoreToCount(saveCount);
            }
        }
    }

    /* renamed from: v0 */
    public final void mo6136v0(Canvas canvas, Rect bounds) {
        if (!this.f4408F0) {
            this.f4433e0.setColor(this.f4440l0);
            this.f4433e0.setStyle(Paint.Style.FILL);
            this.f4436h0.set(bounds);
            canvas.drawRoundRect(this.f4436h0, mo6019C0(), mo6019C0(), this.f4433e0);
        }
    }

    /* renamed from: s0 */
    public final void mo6124s0(Canvas canvas, Rect bounds) {
        if (!this.f4408F0) {
            this.f4433e0.setColor(this.f4441m0);
            this.f4433e0.setStyle(Paint.Style.FILL);
            this.f4433e0.setColorFilter(mo6079d1());
            this.f4436h0.set(bounds);
            canvas.drawRoundRect(this.f4436h0, mo6019C0(), mo6019C0(), this.f4433e0);
        }
    }

    /* renamed from: u0 */
    public final void mo6132u0(Canvas canvas, Rect bounds) {
        if (this.f4401C > 0.0f && !this.f4408F0) {
            this.f4433e0.setColor(this.f4443o0);
            this.f4433e0.setStyle(Paint.Style.STROKE);
            if (!this.f4408F0) {
                this.f4433e0.setColorFilter(mo6079d1());
            }
            RectF rectF = this.f4436h0;
            float f = this.f4401C;
            rectF.set(((float) bounds.left) + (f / 2.0f), ((float) bounds.top) + (f / 2.0f), ((float) bounds.right) - (f / 2.0f), ((float) bounds.bottom) - (f / 2.0f));
            float strokeCornerRadius = this.f4397A - (this.f4401C / 2.0f);
            canvas.drawRoundRect(this.f4436h0, strokeCornerRadius, strokeCornerRadius, this.f4433e0);
        }
    }

    /* renamed from: x0 */
    public final void mo6142x0(Canvas canvas, Rect bounds) {
        this.f4433e0.setColor(this.f4444p0);
        this.f4433e0.setStyle(Paint.Style.FILL);
        this.f4436h0.set(bounds);
        if (!this.f4408F0) {
            canvas.drawRoundRect(this.f4436h0, mo6019C0(), mo6019C0(), this.f4433e0);
            return;
        }
        mo5603g(new RectF(bounds), this.f4438j0);
        super.mo5618o(canvas, this.f4433e0, this.f4438j0, mo5627t());
    }

    /* renamed from: t0 */
    public final void mo6129t0(Canvas canvas, Rect bounds) {
        if (mo6024D2()) {
            mo6085g0(bounds, this.f4436h0);
            RectF rectF = this.f4436h0;
            float tx = rectF.left;
            float ty = rectF.top;
            canvas.translate(tx, ty);
            this.f4409G.setBounds(0, 0, (int) this.f4436h0.width(), (int) this.f4436h0.height());
            this.f4409G.draw(canvas);
            canvas.translate(-tx, -ty);
        }
    }

    /* renamed from: r0 */
    public final void mo6121r0(Canvas canvas, Rect bounds) {
        if (mo6021C2()) {
            mo6085g0(bounds, this.f4436h0);
            RectF rectF = this.f4436h0;
            float tx = rectF.left;
            float ty = rectF.top;
            canvas.translate(tx, ty);
            this.f4421S.setBounds(0, 0, (int) this.f4436h0.width(), (int) this.f4436h0.height());
            this.f4421S.draw(canvas);
            canvas.translate(-tx, -ty);
        }
    }

    /* renamed from: z0 */
    public final void mo6148z0(Canvas canvas, Rect bounds) {
        if (this.f4405E != null) {
            Paint.Align align = mo6111o0(bounds, this.f4437i0);
            mo6105m0(bounds, this.f4436h0);
            if (this.f4439k0.mo5514d() != null) {
                this.f4439k0.mo5515e().drawableState = getState();
                this.f4439k0.mo5520j(this.f4432d0);
            }
            this.f4439k0.mo5515e().setTextAlign(align);
            boolean clip = Math.round(this.f4439k0.mo5516f(mo6071Z0().toString())) > Math.round(this.f4436h0.width());
            int saveCount = 0;
            if (clip) {
                saveCount = canvas.save();
                canvas.clipRect(this.f4436h0);
            }
            CharSequence finalText = this.f4405E;
            if (clip && this.f4402C0 != null) {
                finalText = TextUtils.ellipsize(this.f4405E, this.f4439k0.mo5515e(), this.f4436h0.width(), this.f4402C0);
            }
            int length = finalText.length();
            PointF pointF = this.f4437i0;
            canvas.drawText(finalText, 0, length, pointF.x, pointF.y, this.f4439k0.mo5515e());
            if (clip) {
                canvas.restoreToCount(saveCount);
            }
        }
    }

    /* renamed from: w0 */
    public final void mo6139w0(Canvas canvas, Rect bounds) {
        if (mo6027E2()) {
            mo6099j0(bounds, this.f4436h0);
            RectF rectF = this.f4436h0;
            float tx = rectF.left;
            float ty = rectF.top;
            canvas.translate(tx, ty);
            this.f4414L.setBounds(0, 0, (int) this.f4436h0.width(), (int) this.f4436h0.height());
            if (C0942b.f3881a) {
                this.f4415M.setBounds(this.f4414L.getBounds());
                this.f4415M.jumpToCurrentState();
                this.f4415M.draw(canvas);
            } else {
                this.f4414L.draw(canvas);
            }
            canvas.translate(-tx, -ty);
        }
    }

    /* renamed from: y0 */
    public final void mo6145y0(Canvas canvas, Rect bounds) {
        Paint paint = this.f4434f0;
        if (paint != null) {
            paint.setColor(C0356a.m1849d(-16777216, 127));
            canvas.drawRect(bounds, this.f4434f0);
            if (mo6024D2() || mo6021C2()) {
                mo6085g0(bounds, this.f4436h0);
                canvas.drawRect(this.f4436h0, this.f4434f0);
            }
            if (this.f4405E != null) {
                canvas.drawLine((float) bounds.left, bounds.exactCenterY(), (float) bounds.right, bounds.exactCenterY(), this.f4434f0);
            }
            if (mo6027E2()) {
                mo6099j0(bounds, this.f4436h0);
                canvas.drawRect(this.f4436h0, this.f4434f0);
            }
            this.f4434f0.setColor(C0356a.m1849d(-65536, 127));
            mo6095i0(bounds, this.f4436h0);
            canvas.drawRect(this.f4436h0, this.f4434f0);
            this.f4434f0.setColor(C0356a.m1849d(-16711936, 127));
            mo6101k0(bounds, this.f4436h0);
            canvas.drawRect(this.f4436h0, this.f4434f0);
        }
    }

    /* renamed from: g0 */
    public final void mo6085g0(Rect bounds, RectF outBounds) {
        outBounds.setEmpty();
        if (mo6024D2() || mo6021C2()) {
            float offsetFromStart = this.f4424V + this.f4425W;
            if (C0370a.m1936f(this) == 0) {
                float f = ((float) bounds.left) + offsetFromStart;
                outBounds.left = f;
                outBounds.right = f + this.f4411I;
            } else {
                float f2 = ((float) bounds.right) - offsetFromStart;
                outBounds.right = f2;
                outBounds.left = f2 - this.f4411I;
            }
            float exactCenterY = bounds.exactCenterY();
            float f3 = this.f4411I;
            float f4 = exactCenterY - (f3 / 2.0f);
            outBounds.top = f4;
            outBounds.bottom = f4 + f3;
        }
    }

    /* renamed from: o0 */
    public Paint.Align mo6111o0(Rect bounds, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f4405E != null) {
            float offsetFromStart = this.f4424V + mo6092h0() + this.f4427Y;
            if (C0370a.m1936f(this) == 0) {
                pointF.x = ((float) bounds.left) + offsetFromStart;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) bounds.right) - offsetFromStart;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) bounds.centerY()) - mo6108n0();
        }
        return align;
    }

    /* renamed from: n0 */
    public final float mo6108n0() {
        this.f4439k0.mo5515e().getFontMetrics(this.f4435g0);
        Paint.FontMetrics fontMetrics = this.f4435g0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: m0 */
    public final void mo6105m0(Rect bounds, RectF outBounds) {
        outBounds.setEmpty();
        if (this.f4405E != null) {
            float offsetFromStart = this.f4424V + mo6092h0() + this.f4427Y;
            float offsetFromEnd = this.f4431c0 + mo6103l0() + this.f4428Z;
            if (C0370a.m1936f(this) == 0) {
                outBounds.left = ((float) bounds.left) + offsetFromStart;
                outBounds.right = ((float) bounds.right) - offsetFromEnd;
            } else {
                outBounds.left = ((float) bounds.left) + offsetFromEnd;
                outBounds.right = ((float) bounds.right) - offsetFromStart;
            }
            outBounds.top = (float) bounds.top;
            outBounds.bottom = (float) bounds.bottom;
        }
    }

    /* renamed from: j0 */
    public final void mo6099j0(Rect bounds, RectF outBounds) {
        outBounds.setEmpty();
        if (mo6027E2()) {
            float offsetFromEnd = this.f4431c0 + this.f4430b0;
            if (C0370a.m1936f(this) == 0) {
                float f = ((float) bounds.right) - offsetFromEnd;
                outBounds.right = f;
                outBounds.left = f - this.f4417O;
            } else {
                float f2 = ((float) bounds.left) + offsetFromEnd;
                outBounds.left = f2;
                outBounds.right = f2 + this.f4417O;
            }
            float exactCenterY = bounds.exactCenterY();
            float f3 = this.f4417O;
            float f4 = exactCenterY - (f3 / 2.0f);
            outBounds.top = f4;
            outBounds.bottom = f4 + f3;
        }
    }

    /* renamed from: i0 */
    public final void mo6095i0(Rect bounds, RectF outBounds) {
        outBounds.set(bounds);
        if (mo6027E2()) {
            float offsetFromEnd = this.f4431c0 + this.f4430b0 + this.f4417O + this.f4429a0 + this.f4428Z;
            if (C0370a.m1936f(this) == 0) {
                outBounds.right = ((float) bounds.right) - offsetFromEnd;
            } else {
                outBounds.left = ((float) bounds.left) + offsetFromEnd;
            }
        }
    }

    /* renamed from: k0 */
    public final void mo6101k0(Rect bounds, RectF outBounds) {
        outBounds.setEmpty();
        if (mo6027E2()) {
            float offsetFromEnd = this.f4431c0 + this.f4430b0 + this.f4417O + this.f4429a0 + this.f4428Z;
            if (C0370a.m1936f(this) == 0) {
                float f = (float) bounds.right;
                outBounds.right = f;
                outBounds.left = f - offsetFromEnd;
            } else {
                int i = bounds.left;
                outBounds.left = (float) i;
                outBounds.right = ((float) i) + offsetFromEnd;
            }
            outBounds.top = (float) bounds.top;
            outBounds.bottom = (float) bounds.bottom;
        }
    }

    public boolean isStateful() {
        return m5561j1(this.f4452x) || m5561j1(this.f4454y) || m5561j1(this.f4399B) || (this.f4457z0 && m5561j1(this.f4398A0)) || m5563l1(this.f4439k0.mo5514d()) || mo6116p0() || m5562k1(this.f4409G) || m5562k1(this.f4421S) || m5561j1(this.f4451w0);
    }

    /* renamed from: h1 */
    public boolean mo6093h1() {
        return m5562k1(this.f4414L);
    }

    /* renamed from: b2 */
    public boolean mo6076b2(int[] stateSet) {
        if (Arrays.equals(this.f4455y0, stateSet)) {
            return false;
        }
        this.f4455y0 = stateSet;
        if (mo6027E2()) {
            return mo6112o1(getState(), stateSet);
        }
        return false;
    }

    /* renamed from: Q0 */
    public int[] mo6053Q0() {
        return this.f4455y0;
    }

    /* renamed from: a */
    public void mo5523a() {
        mo6109n1();
        invalidateSelf();
    }

    public boolean onStateChange(int[] state) {
        if (this.f4408F0) {
            super.onStateChange(state);
        }
        return mo6112o1(state, mo6053Q0());
    }

    /* renamed from: o1 */
    public final boolean mo6112o1(int[] chipState, int[] closeIconState) {
        int[] iArr = chipState;
        int[] iArr2 = closeIconState;
        boolean invalidate = super.onStateChange(chipState);
        boolean sizeChanged = false;
        ColorStateList colorStateList = this.f4452x;
        int newChipSurfaceColor = colorStateList != null ? colorStateList.getColorForState(iArr, this.f4440l0) : 0;
        if (this.f4440l0 != newChipSurfaceColor) {
            this.f4440l0 = newChipSurfaceColor;
            invalidate = true;
        }
        ColorStateList colorStateList2 = this.f4454y;
        int newChipBackgroundColor = colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f4441m0) : 0;
        if (this.f4441m0 != newChipBackgroundColor) {
            this.f4441m0 = newChipBackgroundColor;
            invalidate = true;
        }
        int newCompositeSurfaceBackgroundColor = C1060a.m5723e(newChipSurfaceColor, newChipBackgroundColor);
        boolean newChecked = true;
        if ((this.f4442n0 != newCompositeSurfaceBackgroundColor) || (mo5630w() == null)) {
            this.f4442n0 = newCompositeSurfaceBackgroundColor;
            mo5588T(ColorStateList.valueOf(newCompositeSurfaceBackgroundColor));
            invalidate = true;
        }
        ColorStateList colorStateList3 = this.f4399B;
        int newChipStrokeColor = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f4443o0) : 0;
        if (this.f4443o0 != newChipStrokeColor) {
            this.f4443o0 = newChipStrokeColor;
            invalidate = true;
        }
        int newCompatRippleColor = (this.f4398A0 == null || !C0942b.m5100b(chipState)) ? 0 : this.f4398A0.getColorForState(iArr, this.f4444p0);
        if (this.f4444p0 != newCompatRippleColor) {
            this.f4444p0 = newCompatRippleColor;
            if (this.f4457z0) {
                invalidate = true;
            }
        }
        int newTextColor = (this.f4439k0.mo5514d() == null || this.f4439k0.mo5514d().f3861b == null) ? 0 : this.f4439k0.mo5514d().f3861b.getColorForState(iArr, this.f4445q0);
        if (this.f4445q0 != newTextColor) {
            this.f4445q0 = newTextColor;
            invalidate = true;
        }
        if (!m5560f1(getState(), 16842912) || !this.f4419Q) {
            newChecked = false;
        }
        if (!(this.f4446r0 == newChecked || this.f4421S == null)) {
            float oldChipIconWidth = mo6092h0();
            this.f4446r0 = newChecked;
            invalidate = true;
            if (oldChipIconWidth != mo6092h0()) {
                sizeChanged = true;
            }
        }
        ColorStateList colorStateList4 = this.f4451w0;
        int newTint = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f4447s0) : 0;
        if (this.f4447s0 != newTint) {
            this.f4447s0 = newTint;
            this.f4450v0 = C1097a.m5837a(this, this.f4451w0, this.f4453x0);
            invalidate = true;
        }
        if (m5562k1(this.f4409G)) {
            invalidate |= this.f4409G.setState(iArr);
        }
        if (m5562k1(this.f4421S)) {
            invalidate |= this.f4421S.setState(iArr);
        }
        if (m5562k1(this.f4414L)) {
            int[] closeIconMergedState = new int[(iArr.length + iArr2.length)];
            int i = newChipSurfaceColor;
            System.arraycopy(iArr, 0, closeIconMergedState, 0, iArr.length);
            System.arraycopy(iArr2, 0, closeIconMergedState, iArr.length, iArr2.length);
            invalidate |= this.f4414L.setState(closeIconMergedState);
        }
        if (C0942b.f3881a && m5562k1(this.f4415M)) {
            invalidate |= this.f4415M.setState(iArr2);
        }
        if (invalidate) {
            invalidateSelf();
        }
        if (sizeChanged) {
            mo6109n1();
        }
        return invalidate;
    }

    /* renamed from: j1 */
    public static boolean m5561j1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: k1 */
    public static boolean m5562k1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r1.f3861b;
     */
    /* renamed from: l1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m5563l1(p066b.p067a.p068a.p069a.p073d0.C0933d r1) {
        /*
            if (r1 == 0) goto L_0x000e
            android.content.res.ColorStateList r0 = r1.f3861b
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p066b.p067a.p068a.p069a.p088s.C1047a.m5563l1(b.a.a.a.d0.d):boolean");
    }

    public boolean onLayoutDirectionChanged(int layoutDirection) {
        boolean invalidate = super.onLayoutDirectionChanged(layoutDirection);
        if (mo6024D2()) {
            invalidate |= C0370a.m1943m(this.f4409G, layoutDirection);
        }
        if (mo6021C2()) {
            invalidate |= C0370a.m1943m(this.f4421S, layoutDirection);
        }
        if (mo6027E2()) {
            invalidate |= C0370a.m1943m(this.f4414L, layoutDirection);
        }
        if (!invalidate) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int level) {
        boolean invalidate = super.onLevelChange(level);
        if (mo6024D2()) {
            invalidate |= this.f4409G.setLevel(level);
        }
        if (mo6021C2()) {
            invalidate |= this.f4421S.setLevel(level);
        }
        if (mo6027E2()) {
            invalidate |= this.f4414L.setLevel(level);
        }
        if (invalidate) {
            invalidateSelf();
        }
        return invalidate;
    }

    public boolean setVisible(boolean visible, boolean restart) {
        boolean invalidate = super.setVisible(visible, restart);
        if (mo6024D2()) {
            invalidate |= this.f4409G.setVisible(visible, restart);
        }
        if (mo6021C2()) {
            invalidate |= this.f4421S.setVisible(visible, restart);
        }
        if (mo6027E2()) {
            invalidate |= this.f4414L.setVisible(visible, restart);
        }
        if (invalidate) {
            invalidateSelf();
        }
        return invalidate;
    }

    public void setAlpha(int alpha) {
        if (this.f4448t0 != alpha) {
            this.f4448t0 = alpha;
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f4448t0;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f4449u0 != colorFilter) {
            this.f4449u0 = colorFilter;
            invalidateSelf();
        }
    }

    public ColorFilter getColorFilter() {
        return this.f4449u0;
    }

    public void setTintList(ColorStateList tint) {
        if (this.f4451w0 != tint) {
            this.f4451w0 = tint;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        if (this.f4453x0 != tintMode) {
            this.f4453x0 = tintMode;
            this.f4450v0 = C1097a.m5837a(this, this.f4451w0, tintMode);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f4408F0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f4397A);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f4397A);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public void invalidateDrawable(Drawable who) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, what, when);
        }
    }

    public void unscheduleDrawable(Drawable who, Runnable what) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, what);
        }
    }

    /* renamed from: F2 */
    public final void mo6030F2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    /* renamed from: f0 */
    public final void mo6083f0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C0370a.m1943m(drawable, C0370a.m1936f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f4414L) {
                if (drawable.isStateful()) {
                    drawable.setState(mo6053Q0());
                }
                C0370a.m1945o(drawable, this.f4416N);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f4409G;
            if (drawable == drawable2 && this.f4412J) {
                C0370a.m1945o(drawable2, this.f4410H);
            }
        }
    }

    /* renamed from: d1 */
    public final ColorFilter mo6079d1() {
        ColorFilter colorFilter = this.f4449u0;
        return colorFilter != null ? colorFilter : this.f4450v0;
    }

    /* renamed from: G2 */
    public final void mo6033G2() {
        this.f4398A0 = this.f4457z0 ? C0942b.m5099a(this.f4403D) : null;
    }

    /* renamed from: R1 */
    public final void mo6056R1(ColorStateList chipSurfaceColor) {
        if (this.f4452x != chipSurfaceColor) {
            this.f4452x = chipSurfaceColor;
            onStateChange(getState());
        }
    }

    /* renamed from: f1 */
    public static boolean m5560f1(int[] stateSet, int state) {
        if (stateSet == null) {
            return false;
        }
        for (int s : stateSet) {
            if (s == state) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B0 */
    public ColorStateList mo6016B0() {
        return this.f4454y;
    }

    /* renamed from: w1 */
    public void mo6140w1(int id) {
        mo6137v1(C0053a.m276c(this.f4432d0, id));
    }

    /* renamed from: v1 */
    public void mo6137v1(ColorStateList chipBackgroundColor) {
        if (this.f4454y != chipBackgroundColor) {
            this.f4454y = chipBackgroundColor;
            onStateChange(getState());
        }
    }

    /* renamed from: H0 */
    public float mo6034H0() {
        return this.f4456z;
    }

    /* renamed from: K1 */
    public void mo6042K1(int id) {
        mo6040J1(this.f4432d0.getResources().getDimension(id));
    }

    /* renamed from: J1 */
    public void mo6040J1(float chipMinHeight) {
        if (this.f4456z != chipMinHeight) {
            this.f4456z = chipMinHeight;
            invalidateSelf();
            mo6109n1();
        }
    }

    /* renamed from: C0 */
    public float mo6019C0() {
        return this.f4408F0 ? mo5574E() : this.f4397A;
    }

    @Deprecated
    /* renamed from: y1 */
    public void mo6146y1(int id) {
        mo6143x1(this.f4432d0.getResources().getDimension(id));
    }

    @Deprecated
    /* renamed from: x1 */
    public void mo6143x1(float chipCornerRadius) {
        if (this.f4397A != chipCornerRadius) {
            this.f4397A = chipCornerRadius;
            setShapeAppearanceModel(mo5571B().mo5655w(chipCornerRadius));
        }
    }

    /* renamed from: J0 */
    public ColorStateList mo6039J0() {
        return this.f4399B;
    }

    /* renamed from: O1 */
    public void mo6050O1(int id) {
        mo6048N1(C0053a.m276c(this.f4432d0, id));
    }

    /* renamed from: N1 */
    public void mo6048N1(ColorStateList chipStrokeColor) {
        if (this.f4399B != chipStrokeColor) {
            this.f4399B = chipStrokeColor;
            if (this.f4408F0) {
                mo5595a0(chipStrokeColor);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: K0 */
    public float mo6041K0() {
        return this.f4401C;
    }

    /* renamed from: Q1 */
    public void mo6054Q1(int id) {
        mo6052P1(this.f4432d0.getResources().getDimension(id));
    }

    /* renamed from: P1 */
    public void mo6052P1(float chipStrokeWidth) {
        if (this.f4401C != chipStrokeWidth) {
            this.f4401C = chipStrokeWidth;
            this.f4433e0.setStrokeWidth(chipStrokeWidth);
            if (this.f4408F0) {
                super.mo5596b0(chipStrokeWidth);
            }
            invalidateSelf();
        }
    }

    /* renamed from: X0 */
    public ColorStateList mo6067X0() {
        return this.f4403D;
    }

    /* renamed from: p2 */
    public void mo6118p2(int id) {
        mo6113o2(C0053a.m276c(this.f4432d0, id));
    }

    /* renamed from: o2 */
    public void mo6113o2(ColorStateList rippleColor) {
        if (this.f4403D != rippleColor) {
            this.f4403D = rippleColor;
            mo6033G2();
            onStateChange(getState());
        }
    }

    /* renamed from: Z0 */
    public CharSequence mo6071Z0() {
        return this.f4405E;
    }

    /* renamed from: t2 */
    public void mo6131t2(CharSequence text) {
        if (text == null) {
            text = "";
        }
        if (!TextUtils.equals(this.f4405E, text)) {
            this.f4405E = text;
            this.f4439k0.mo5519i(true);
            invalidateSelf();
            mo6109n1();
        }
    }

    /* renamed from: a1 */
    public C0933d mo6073a1() {
        return this.f4439k0.mo5514d();
    }

    /* renamed from: v2 */
    public void mo6138v2(int id) {
        mo6134u2(new C0933d(this.f4432d0, id));
    }

    /* renamed from: u2 */
    public void mo6134u2(C0933d textAppearance) {
        this.f4439k0.mo5518h(textAppearance, this.f4432d0);
    }

    /* renamed from: T0 */
    public TextUtils.TruncateAt mo6059T0() {
        return this.f4402C0;
    }

    /* renamed from: g2 */
    public void mo6087g2(TextUtils.TruncateAt truncateAt) {
        this.f4402C0 = truncateAt;
    }

    /* renamed from: H1 */
    public void mo6035H1(int id) {
        mo6038I1(this.f4432d0.getResources().getBoolean(id));
    }

    /* renamed from: I1 */
    public void mo6038I1(boolean chipIconVisible) {
        if (this.f4407F != chipIconVisible) {
            boolean oldShowsChipIcon = mo6024D2();
            this.f4407F = chipIconVisible;
            boolean newShowsChipIcon = mo6024D2();
            if (oldShowsChipIcon != newShowsChipIcon) {
                if (newShowsChipIcon) {
                    mo6083f0(this.f4409G);
                } else {
                    mo6030F2(this.f4409G);
                }
                invalidateSelf();
                mo6109n1();
            }
        }
    }

    /* renamed from: E0 */
    public Drawable mo6025E0() {
        Drawable drawable = this.f4409G;
        if (drawable != null) {
            return C0370a.m1947q(drawable);
        }
        return null;
    }

    /* renamed from: C1 */
    public void mo6020C1(int id) {
        mo6017B1(C0053a.m277d(this.f4432d0, id));
    }

    /* renamed from: B1 */
    public void mo6017B1(Drawable chipIcon) {
        Drawable oldChipIcon = mo6025E0();
        if (oldChipIcon != chipIcon) {
            float oldChipIconWidth = mo6092h0();
            this.f4409G = chipIcon != null ? C0370a.m1948r(chipIcon).mutate() : null;
            float newChipIconWidth = mo6092h0();
            mo6030F2(oldChipIcon);
            if (mo6024D2()) {
                mo6083f0(this.f4409G);
            }
            invalidateSelf();
            if (oldChipIconWidth != newChipIconWidth) {
                mo6109n1();
            }
        }
    }

    /* renamed from: G0 */
    public ColorStateList mo6031G0() {
        return this.f4410H;
    }

    /* renamed from: G1 */
    public void mo6032G1(int id) {
        mo6029F1(C0053a.m276c(this.f4432d0, id));
    }

    /* renamed from: F1 */
    public void mo6029F1(ColorStateList chipIconTint) {
        this.f4412J = true;
        if (this.f4410H != chipIconTint) {
            this.f4410H = chipIconTint;
            if (mo6024D2()) {
                C0370a.m1945o(this.f4409G, chipIconTint);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: F0 */
    public float mo6028F0() {
        return this.f4411I;
    }

    /* renamed from: E1 */
    public void mo6026E1(int id) {
        mo6023D1(this.f4432d0.getResources().getDimension(id));
    }

    /* renamed from: D1 */
    public void mo6023D1(float chipIconSize) {
        if (this.f4411I != chipIconSize) {
            float oldChipIconWidth = mo6092h0();
            this.f4411I = chipIconSize;
            float newChipIconWidth = mo6092h0();
            invalidateSelf();
            if (oldChipIconWidth != newChipIconWidth) {
                mo6109n1();
            }
        }
    }

    /* renamed from: i1 */
    public boolean mo6096i1() {
        return this.f4413K;
    }

    /* renamed from: e2 */
    public void mo6082e2(boolean closeIconVisible) {
        if (this.f4413K != closeIconVisible) {
            boolean oldShowsCloseIcon = mo6027E2();
            this.f4413K = closeIconVisible;
            boolean newShowsCloseIcon = mo6027E2();
            if (oldShowsCloseIcon != newShowsCloseIcon) {
                if (newShowsCloseIcon) {
                    mo6083f0(this.f4414L);
                } else {
                    mo6030F2(this.f4414L);
                }
                invalidateSelf();
                mo6109n1();
            }
        }
    }

    /* renamed from: L0 */
    public Drawable mo6043L0() {
        Drawable drawable = this.f4414L;
        if (drawable != null) {
            return C0370a.m1947q(drawable);
        }
        return null;
    }

    /* renamed from: W1 */
    public void mo6066W1(int id) {
        mo6058S1(C0053a.m277d(this.f4432d0, id));
    }

    /* renamed from: S1 */
    public void mo6058S1(Drawable closeIcon) {
        Drawable oldCloseIcon = mo6043L0();
        if (oldCloseIcon != closeIcon) {
            float oldCloseIconWidth = mo6103l0();
            this.f4414L = closeIcon != null ? C0370a.m1948r(closeIcon).mutate() : null;
            if (C0942b.f3881a) {
                mo6036H2();
            }
            float newCloseIconWidth = mo6103l0();
            mo6030F2(oldCloseIcon);
            if (mo6027E2()) {
                mo6083f0(this.f4414L);
            }
            invalidateSelf();
            if (oldCloseIconWidth != newCloseIconWidth) {
                mo6109n1();
            }
        }
    }

    @TargetApi(21)
    /* renamed from: H2 */
    public final void mo6036H2() {
        this.f4415M = new RippleDrawable(C0942b.m5099a(mo6067X0()), this.f4414L, f4396H0);
    }

    /* renamed from: R0 */
    public ColorStateList mo6055R0() {
        return this.f4416N;
    }

    /* renamed from: d2 */
    public void mo6080d2(int id) {
        mo6078c2(C0053a.m276c(this.f4432d0, id));
    }

    /* renamed from: c2 */
    public void mo6078c2(ColorStateList closeIconTint) {
        if (this.f4416N != closeIconTint) {
            this.f4416N = closeIconTint;
            if (mo6027E2()) {
                C0370a.m1945o(this.f4414L, closeIconTint);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: O0 */
    public float mo6049O0() {
        return this.f4417O;
    }

    /* renamed from: Y1 */
    public void mo6070Y1(int id) {
        mo6068X1(this.f4432d0.getResources().getDimension(id));
    }

    /* renamed from: X1 */
    public void mo6068X1(float closeIconSize) {
        if (this.f4417O != closeIconSize) {
            this.f4417O = closeIconSize;
            invalidateSelf();
            if (mo6027E2()) {
                mo6109n1();
            }
        }
    }

    /* renamed from: T1 */
    public void mo6060T1(CharSequence closeIconContentDescription) {
        if (this.f4418P != closeIconContentDescription) {
            this.f4418P = C0396a.m2002c().mo2369h(closeIconContentDescription);
            invalidateSelf();
        }
    }

    /* renamed from: M0 */
    public CharSequence mo6045M0() {
        return this.f4418P;
    }

    /* renamed from: g1 */
    public boolean mo6086g1() {
        return this.f4419Q;
    }

    /* renamed from: q1 */
    public void mo6119q1(int id) {
        mo6117p1(this.f4432d0.getResources().getBoolean(id));
    }

    /* renamed from: p1 */
    public void mo6117p1(boolean checkable) {
        if (this.f4419Q != checkable) {
            this.f4419Q = checkable;
            float oldChipIconWidth = mo6092h0();
            if (!checkable && this.f4446r0) {
                this.f4446r0 = false;
            }
            float newChipIconWidth = mo6092h0();
            invalidateSelf();
            if (oldChipIconWidth != newChipIconWidth) {
                mo6109n1();
            }
        }
    }

    /* renamed from: t1 */
    public void mo6130t1(int id) {
        mo6133u1(this.f4432d0.getResources().getBoolean(id));
    }

    /* renamed from: u1 */
    public void mo6133u1(boolean checkedIconVisible) {
        if (this.f4420R != checkedIconVisible) {
            boolean oldShowsCheckedIcon = mo6021C2();
            this.f4420R = checkedIconVisible;
            boolean newShowsCheckedIcon = mo6021C2();
            if (oldShowsCheckedIcon != newShowsCheckedIcon) {
                if (newShowsCheckedIcon) {
                    mo6083f0(this.f4421S);
                } else {
                    mo6030F2(this.f4421S);
                }
                invalidateSelf();
                mo6109n1();
            }
        }
    }

    /* renamed from: A0 */
    public Drawable mo6013A0() {
        return this.f4421S;
    }

    /* renamed from: s1 */
    public void mo6125s1(int id) {
        mo6122r1(C0053a.m277d(this.f4432d0, id));
    }

    /* renamed from: r1 */
    public void mo6122r1(Drawable checkedIcon) {
        if (this.f4421S != checkedIcon) {
            float oldChipIconWidth = mo6092h0();
            this.f4421S = checkedIcon;
            float newChipIconWidth = mo6092h0();
            mo6030F2(this.f4421S);
            mo6083f0(this.f4421S);
            invalidateSelf();
            if (oldChipIconWidth != newChipIconWidth) {
                mo6109n1();
            }
        }
    }

    /* renamed from: Y0 */
    public C1030h mo6069Y0() {
        return this.f4422T;
    }

    /* renamed from: s2 */
    public void mo6126s2(int id) {
        mo6123r2(C1030h.m5433c(this.f4432d0, id));
    }

    /* renamed from: r2 */
    public void mo6123r2(C1030h showMotionSpec) {
        this.f4422T = showMotionSpec;
    }

    /* renamed from: U0 */
    public C1030h mo6061U0() {
        return this.f4423U;
    }

    /* renamed from: i2 */
    public void mo6097i2(int id) {
        mo6094h2(C1030h.m5433c(this.f4432d0, id));
    }

    /* renamed from: h2 */
    public void mo6094h2(C1030h hideMotionSpec) {
        this.f4423U = hideMotionSpec;
    }

    /* renamed from: I0 */
    public float mo6037I0() {
        return this.f4424V;
    }

    /* renamed from: M1 */
    public void mo6046M1(int id) {
        mo6044L1(this.f4432d0.getResources().getDimension(id));
    }

    /* renamed from: L1 */
    public void mo6044L1(float chipStartPadding) {
        if (this.f4424V != chipStartPadding) {
            this.f4424V = chipStartPadding;
            invalidateSelf();
            mo6109n1();
        }
    }

    /* renamed from: W0 */
    public float mo6065W0() {
        return this.f4425W;
    }

    /* renamed from: m2 */
    public void mo6107m2(int id) {
        mo6104l2(this.f4432d0.getResources().getDimension(id));
    }

    /* renamed from: l2 */
    public void mo6104l2(float iconStartPadding) {
        if (this.f4425W != iconStartPadding) {
            float oldChipIconWidth = mo6092h0();
            this.f4425W = iconStartPadding;
            float newChipIconWidth = mo6092h0();
            invalidateSelf();
            if (oldChipIconWidth != newChipIconWidth) {
                mo6109n1();
            }
        }
    }

    /* renamed from: V0 */
    public float mo6063V0() {
        return this.f4426X;
    }

    /* renamed from: k2 */
    public void mo6102k2(int id) {
        mo6100j2(this.f4432d0.getResources().getDimension(id));
    }

    /* renamed from: j2 */
    public void mo6100j2(float iconEndPadding) {
        if (this.f4426X != iconEndPadding) {
            float oldChipIconWidth = mo6092h0();
            this.f4426X = iconEndPadding;
            float newChipIconWidth = mo6092h0();
            invalidateSelf();
            if (oldChipIconWidth != newChipIconWidth) {
                mo6109n1();
            }
        }
    }

    /* renamed from: c1 */
    public float mo6077c1() {
        return this.f4427Y;
    }

    /* renamed from: z2 */
    public void mo6150z2(int id) {
        mo6147y2(this.f4432d0.getResources().getDimension(id));
    }

    /* renamed from: y2 */
    public void mo6147y2(float textStartPadding) {
        if (this.f4427Y != textStartPadding) {
            this.f4427Y = textStartPadding;
            invalidateSelf();
            mo6109n1();
        }
    }

    /* renamed from: b1 */
    public float mo6075b1() {
        return this.f4428Z;
    }

    /* renamed from: x2 */
    public void mo6144x2(int id) {
        mo6141w2(this.f4432d0.getResources().getDimension(id));
    }

    /* renamed from: w2 */
    public void mo6141w2(float textEndPadding) {
        if (this.f4428Z != textEndPadding) {
            this.f4428Z = textEndPadding;
            invalidateSelf();
            mo6109n1();
        }
    }

    /* renamed from: P0 */
    public float mo6051P0() {
        return this.f4429a0;
    }

    /* renamed from: a2 */
    public void mo6074a2(int id) {
        mo6072Z1(this.f4432d0.getResources().getDimension(id));
    }

    /* renamed from: Z1 */
    public void mo6072Z1(float closeIconStartPadding) {
        if (this.f4429a0 != closeIconStartPadding) {
            this.f4429a0 = closeIconStartPadding;
            invalidateSelf();
            if (mo6027E2()) {
                mo6109n1();
            }
        }
    }

    /* renamed from: N0 */
    public float mo6047N0() {
        return this.f4430b0;
    }

    /* renamed from: V1 */
    public void mo6064V1(int id) {
        mo6062U1(this.f4432d0.getResources().getDimension(id));
    }

    /* renamed from: U1 */
    public void mo6062U1(float closeIconEndPadding) {
        if (this.f4430b0 != closeIconEndPadding) {
            this.f4430b0 = closeIconEndPadding;
            invalidateSelf();
            if (mo6027E2()) {
                mo6109n1();
            }
        }
    }

    /* renamed from: D0 */
    public float mo6022D0() {
        return this.f4431c0;
    }

    /* renamed from: A1 */
    public void mo6014A1(int id) {
        mo6149z1(this.f4432d0.getResources().getDimension(id));
    }

    /* renamed from: z1 */
    public void mo6149z1(float chipEndPadding) {
        if (this.f4431c0 != chipEndPadding) {
            this.f4431c0 = chipEndPadding;
            invalidateSelf();
            mo6109n1();
        }
    }

    /* renamed from: n2 */
    public void mo6110n2(int maxWidth) {
        this.f4406E0 = maxWidth;
    }

    /* renamed from: B2 */
    public boolean mo6018B2() {
        return this.f4404D0;
    }

    /* renamed from: q2 */
    public void mo6120q2(boolean shouldDrawText) {
        this.f4404D0 = shouldDrawText;
    }
}
