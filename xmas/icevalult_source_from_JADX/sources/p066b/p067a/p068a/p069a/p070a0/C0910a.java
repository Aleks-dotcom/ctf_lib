package p066b.p067a.p068a.p069a.p070a0;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import p000a.p025h.p033h.C0379a;
import p000a.p025h.p036k.C0404e;
import p000a.p025h.p038m.C0444c;
import p000a.p025h.p038m.C0460r;
import p066b.p067a.p068a.p069a.p073d0.C0929a;
import p066b.p067a.p068a.p069a.p073d0.C0933d;
import p066b.p067a.p068a.p069a.p081l.C1023a;

/* renamed from: b.a.a.a.a0.a */
public final class C0910a {

    /* renamed from: V */
    public static final boolean f3767V = (Build.VERSION.SDK_INT < 18);

    /* renamed from: W */
    public static final Paint f3768W;

    /* renamed from: A */
    public boolean f3769A;

    /* renamed from: B */
    public Bitmap f3770B;

    /* renamed from: C */
    public Paint f3771C;

    /* renamed from: D */
    public float f3772D;

    /* renamed from: E */
    public float f3773E;

    /* renamed from: F */
    public float f3774F;

    /* renamed from: G */
    public float f3775G;

    /* renamed from: H */
    public int[] f3776H;

    /* renamed from: I */
    public boolean f3777I;

    /* renamed from: J */
    public final TextPaint f3778J;

    /* renamed from: K */
    public final TextPaint f3779K;

    /* renamed from: L */
    public TimeInterpolator f3780L;

    /* renamed from: M */
    public TimeInterpolator f3781M;

    /* renamed from: N */
    public float f3782N;

    /* renamed from: O */
    public float f3783O;

    /* renamed from: P */
    public float f3784P;

    /* renamed from: Q */
    public ColorStateList f3785Q;

    /* renamed from: R */
    public float f3786R;

    /* renamed from: S */
    public float f3787S;

    /* renamed from: T */
    public float f3788T;

    /* renamed from: U */
    public ColorStateList f3789U;

    /* renamed from: a */
    public final View f3790a;

    /* renamed from: b */
    public boolean f3791b;

    /* renamed from: c */
    public float f3792c;

    /* renamed from: d */
    public final Rect f3793d;

    /* renamed from: e */
    public final Rect f3794e;

    /* renamed from: f */
    public final RectF f3795f;

    /* renamed from: g */
    public int f3796g = 16;

    /* renamed from: h */
    public int f3797h = 16;

    /* renamed from: i */
    public float f3798i = 15.0f;

    /* renamed from: j */
    public float f3799j = 15.0f;

    /* renamed from: k */
    public ColorStateList f3800k;

    /* renamed from: l */
    public ColorStateList f3801l;

    /* renamed from: m */
    public float f3802m;

    /* renamed from: n */
    public float f3803n;

    /* renamed from: o */
    public float f3804o;

    /* renamed from: p */
    public float f3805p;

    /* renamed from: q */
    public float f3806q;

    /* renamed from: r */
    public float f3807r;

    /* renamed from: s */
    public Typeface f3808s;

    /* renamed from: t */
    public Typeface f3809t;

    /* renamed from: u */
    public Typeface f3810u;

    /* renamed from: v */
    public C0929a f3811v;

    /* renamed from: w */
    public C0929a f3812w;

    /* renamed from: x */
    public CharSequence f3813x;

    /* renamed from: y */
    public CharSequence f3814y;

    /* renamed from: z */
    public boolean f3815z;

    static {
        Paint paint = null;
        f3768W = paint;
        if (paint != null) {
            paint.setAntiAlias(true);
            paint.setColor(-65281);
        }
    }

    public C0910a(View view) {
        this.f3790a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f3778J = textPaint;
        this.f3779K = new TextPaint(textPaint);
        this.f3794e = new Rect();
        this.f3793d = new Rect();
        this.f3795f = new RectF();
    }

    /* renamed from: T */
    public void mo5462T(TimeInterpolator interpolator) {
        this.f3781M = interpolator;
        mo5486z();
    }

    /* renamed from: Q */
    public void mo5459Q(TimeInterpolator interpolator) {
        this.f3780L = interpolator;
        mo5486z();
    }

    /* renamed from: M */
    public void mo5455M(float textSize) {
        if (this.f3798i != textSize) {
            this.f3798i = textSize;
            mo5486z();
        }
    }

    /* renamed from: E */
    public void mo5447E(ColorStateList textColor) {
        if (this.f3801l != textColor) {
            this.f3801l = textColor;
            mo5486z();
        }
    }

    /* renamed from: K */
    public void mo5453K(ColorStateList textColor) {
        if (this.f3800k != textColor) {
            this.f3800k = textColor;
            mo5486z();
        }
    }

    /* renamed from: I */
    public void mo5451I(int left, int top, int right, int bottom) {
        if (!m4972A(this.f3793d, left, top, right, bottom)) {
            this.f3793d.set(left, top, right, bottom);
            this.f3777I = true;
            mo5485y();
        }
    }

    /* renamed from: J */
    public void mo5452J(Rect bounds) {
        mo5451I(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    /* renamed from: B */
    public void mo5444B(int left, int top, int right, int bottom) {
        if (!m4972A(this.f3794e, left, top, right, bottom)) {
            this.f3794e.set(left, top, right, bottom);
            this.f3777I = true;
            mo5485y();
        }
    }

    /* renamed from: C */
    public void mo5445C(Rect bounds) {
        mo5444B(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    /* renamed from: k */
    public void mo5473k(RectF bounds) {
        float f;
        boolean isRtl = mo5467e(this.f3813x);
        Rect rect = this.f3794e;
        if (!isRtl) {
            f = (float) rect.left;
        } else {
            f = ((float) rect.right) - mo5465c();
        }
        bounds.left = f;
        Rect rect2 = this.f3794e;
        bounds.top = (float) rect2.top;
        bounds.right = !isRtl ? f + mo5465c() : (float) rect2.right;
        bounds.bottom = ((float) this.f3794e.top) + mo5475m();
    }

    /* renamed from: c */
    public float mo5465c() {
        if (this.f3813x == null) {
            return 0.0f;
        }
        mo5481s(this.f3779K);
        TextPaint textPaint = this.f3779K;
        CharSequence charSequence = this.f3813x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: q */
    public float mo5479q() {
        mo5482t(this.f3779K);
        return -this.f3779K.ascent();
    }

    /* renamed from: m */
    public float mo5475m() {
        mo5481s(this.f3779K);
        return -this.f3779K.ascent();
    }

    /* renamed from: t */
    public final void mo5482t(TextPaint textPaint) {
        textPaint.setTextSize(this.f3798i);
        textPaint.setTypeface(this.f3809t);
    }

    /* renamed from: s */
    public final void mo5481s(TextPaint textPaint) {
        textPaint.setTextSize(this.f3799j);
        textPaint.setTypeface(this.f3808s);
    }

    /* renamed from: y */
    public void mo5485y() {
        this.f3791b = this.f3794e.width() > 0 && this.f3794e.height() > 0 && this.f3793d.width() > 0 && this.f3793d.height() > 0;
    }

    /* renamed from: L */
    public void mo5454L(int gravity) {
        if (this.f3796g != gravity) {
            this.f3796g = gravity;
            mo5486z();
        }
    }

    /* renamed from: F */
    public void mo5448F(int gravity) {
        if (this.f3797h != gravity) {
            this.f3797h = gravity;
            mo5486z();
        }
    }

    /* renamed from: D */
    public void mo5446D(int resId) {
        C0933d textAppearance = new C0933d(this.f3790a.getContext(), resId);
        ColorStateList colorStateList = textAppearance.f3861b;
        if (colorStateList != null) {
            this.f3801l = colorStateList;
        }
        float f = textAppearance.f3860a;
        if (f != 0.0f) {
            this.f3799j = f;
        }
        ColorStateList colorStateList2 = textAppearance.f3865f;
        if (colorStateList2 != null) {
            this.f3785Q = colorStateList2;
        }
        this.f3783O = textAppearance.f3866g;
        this.f3784P = textAppearance.f3867h;
        this.f3782N = textAppearance.f3868i;
        C0929a aVar = this.f3812w;
        if (aVar != null) {
            aVar.mo5531c();
        }
        this.f3812w = new C0929a(new C0911a(), textAppearance.mo5534e());
        textAppearance.mo5537h(this.f3790a.getContext(), this.f3812w);
        mo5486z();
    }

    /* renamed from: b.a.a.a.a0.a$a */
    public class C0911a implements C0929a.C0930a {
        public C0911a() {
        }

        /* renamed from: a */
        public void mo5487a(Typeface font) {
            C0910a.this.mo5449G(font);
        }
    }

    /* renamed from: G */
    public void mo5449G(Typeface typeface) {
        if (mo5450H(typeface)) {
            mo5486z();
        }
    }

    /* renamed from: U */
    public void mo5463U(Typeface typeface) {
        boolean collapsedFontChanged = mo5450H(typeface);
        boolean expandedFontChanged = mo5456N(typeface);
        if (collapsedFontChanged || expandedFontChanged) {
            mo5486z();
        }
    }

    /* renamed from: H */
    public final boolean mo5450H(Typeface typeface) {
        C0929a aVar = this.f3812w;
        if (aVar != null) {
            aVar.mo5531c();
        }
        if (this.f3808s == typeface) {
            return false;
        }
        this.f3808s = typeface;
        return true;
    }

    /* renamed from: N */
    public final boolean mo5456N(Typeface typeface) {
        C0929a aVar = this.f3811v;
        if (aVar != null) {
            aVar.mo5531c();
        }
        if (this.f3809t == typeface) {
            return false;
        }
        this.f3809t = typeface;
        return true;
    }

    /* renamed from: O */
    public void mo5457O(float fraction) {
        float fraction2 = C0379a.m1962a(fraction, 0.0f, 1.0f);
        if (fraction2 != this.f3792c) {
            this.f3792c = fraction2;
            mo5466d();
        }
    }

    /* renamed from: R */
    public final boolean mo5460R(int[] state) {
        this.f3776H = state;
        if (!mo5484w()) {
            return false;
        }
        mo5486z();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f3800k;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5484w() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f3801l
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f3800k
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p066b.p067a.p068a.p069a.p070a0.C0910a.mo5484w():boolean");
    }

    /* renamed from: r */
    public float mo5480r() {
        return this.f3792c;
    }

    /* renamed from: d */
    public final void mo5466d() {
        mo5468f(this.f3792c);
    }

    /* renamed from: f */
    public final void mo5468f(float fraction) {
        mo5483u(fraction);
        this.f3806q = m4975x(this.f3804o, this.f3805p, fraction, this.f3780L);
        this.f3807r = m4975x(this.f3802m, this.f3803n, fraction, this.f3780L);
        mo5458P(m4975x(this.f3798i, this.f3799j, fraction, this.f3781M));
        if (this.f3801l != this.f3800k) {
            this.f3778J.setColor(m4973a(mo5478p(), mo5476n(), fraction));
        } else {
            this.f3778J.setColor(mo5476n());
        }
        this.f3778J.setShadowLayer(m4975x(this.f3786R, this.f3782N, fraction, (TimeInterpolator) null), m4975x(this.f3787S, this.f3783O, fraction, (TimeInterpolator) null), m4975x(this.f3788T, this.f3784P, fraction, (TimeInterpolator) null), m4973a(mo5477o(this.f3789U), mo5477o(this.f3785Q), fraction));
        C0460r.m2246U(this.f3790a);
    }

    /* renamed from: p */
    public final int mo5478p() {
        return mo5477o(this.f3800k);
    }

    /* renamed from: n */
    public int mo5476n() {
        return mo5477o(this.f3801l);
    }

    /* renamed from: o */
    public final int mo5477o(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f3776H;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: b */
    public final void mo5464b() {
        float currentTextSize = this.f3775G;
        mo5469g(this.f3799j);
        CharSequence charSequence = this.f3814y;
        float f = 0.0f;
        float width = charSequence != null ? this.f3778J.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int collapsedAbsGravity = C0444c.m2174b(this.f3797h, this.f3815z ? 1 : 0);
        int i = collapsedAbsGravity & 112;
        if (i == 48) {
            this.f3803n = ((float) this.f3794e.top) - this.f3778J.ascent();
        } else if (i != 80) {
            this.f3803n = ((float) this.f3794e.centerY()) + (((this.f3778J.descent() - this.f3778J.ascent()) / 2.0f) - this.f3778J.descent());
        } else {
            this.f3803n = (float) this.f3794e.bottom;
        }
        int i2 = collapsedAbsGravity & 8388615;
        if (i2 == 1) {
            this.f3805p = ((float) this.f3794e.centerX()) - (width / 2.0f);
        } else if (i2 != 5) {
            this.f3805p = (float) this.f3794e.left;
        } else {
            this.f3805p = ((float) this.f3794e.right) - width;
        }
        mo5469g(this.f3798i);
        CharSequence charSequence2 = this.f3814y;
        if (charSequence2 != null) {
            f = this.f3778J.measureText(charSequence2, 0, charSequence2.length());
        }
        float width2 = f;
        int expandedAbsGravity = C0444c.m2174b(this.f3796g, this.f3815z ? 1 : 0);
        int i3 = expandedAbsGravity & 112;
        if (i3 == 48) {
            this.f3802m = ((float) this.f3793d.top) - this.f3778J.ascent();
        } else if (i3 != 80) {
            this.f3802m = ((float) this.f3793d.centerY()) + (((this.f3778J.descent() - this.f3778J.ascent()) / 2.0f) - this.f3778J.descent());
        } else {
            this.f3802m = (float) this.f3793d.bottom;
        }
        int i4 = expandedAbsGravity & 8388615;
        if (i4 == 1) {
            this.f3804o = ((float) this.f3793d.centerX()) - (width2 / 2.0f);
        } else if (i4 != 5) {
            this.f3804o = (float) this.f3793d.left;
        } else {
            this.f3804o = ((float) this.f3793d.right) - width2;
        }
        mo5470h();
        mo5458P(currentTextSize);
    }

    /* renamed from: u */
    public final void mo5483u(float fraction) {
        this.f3795f.left = m4975x((float) this.f3793d.left, (float) this.f3794e.left, fraction, this.f3780L);
        this.f3795f.top = m4975x(this.f3802m, this.f3803n, fraction, this.f3780L);
        this.f3795f.right = m4975x((float) this.f3793d.right, (float) this.f3794e.right, fraction, this.f3780L);
        this.f3795f.bottom = m4975x((float) this.f3793d.bottom, (float) this.f3794e.bottom, fraction, this.f3780L);
    }

    /* renamed from: i */
    public void mo5471i(Canvas canvas) {
        float ascent;
        float y;
        int saveCount = canvas.save();
        if (this.f3814y != null && this.f3791b) {
            float x = this.f3806q;
            float y2 = this.f3807r;
            boolean drawTexture = this.f3769A && this.f3770B != null;
            if (drawTexture) {
                float f = this.f3772D;
                float f2 = this.f3774F;
                ascent = f * f2;
                float f3 = this.f3773E * f2;
            } else {
                ascent = this.f3778J.ascent() * this.f3774F;
                float descent = this.f3774F * this.f3778J.descent();
            }
            if (drawTexture) {
                y = y2 + ascent;
            } else {
                y = y2;
            }
            float y3 = this.f3774F;
            if (y3 != 1.0f) {
                canvas.scale(y3, y3, x, y);
            }
            if (drawTexture) {
                canvas.drawBitmap(this.f3770B, x, y, this.f3771C);
            } else {
                CharSequence charSequence = this.f3814y;
                canvas.drawText(charSequence, 0, charSequence.length(), x, y, this.f3778J);
            }
        }
        canvas.restoreToCount(saveCount);
    }

    /* renamed from: e */
    public final boolean mo5467e(CharSequence text) {
        boolean defaultIsRtl = true;
        if (C0460r.m2292v(this.f3790a) != 1) {
            defaultIsRtl = false;
        }
        return (defaultIsRtl ? C0404e.f1973d : C0404e.f1972c).mo2405a(text, 0, text.length());
    }

    /* renamed from: P */
    public final void mo5458P(float textSize) {
        mo5469g(textSize);
        boolean z = f3767V && this.f3774F != 1.0f;
        this.f3769A = z;
        if (z) {
            mo5472j();
        }
        C0460r.m2246U(this.f3790a);
    }

    /* renamed from: g */
    public final void mo5469g(float textSize) {
        float textSizeRatio;
        float newTextSize;
        if (this.f3813x != null) {
            float collapsedWidth = (float) this.f3794e.width();
            float expandedWidth = (float) this.f3793d.width();
            boolean updateDrawText = false;
            if (m4974v(textSize, this.f3799j)) {
                newTextSize = this.f3799j;
                this.f3774F = 1.0f;
                Typeface typeface = this.f3810u;
                Typeface typeface2 = this.f3808s;
                if (typeface != typeface2) {
                    this.f3810u = typeface2;
                    updateDrawText = true;
                }
                textSizeRatio = collapsedWidth;
            } else {
                newTextSize = this.f3798i;
                Typeface typeface3 = this.f3810u;
                Typeface typeface4 = this.f3809t;
                if (typeface3 != typeface4) {
                    this.f3810u = typeface4;
                    updateDrawText = true;
                }
                if (m4974v(textSize, this.f3798i)) {
                    this.f3774F = 1.0f;
                } else {
                    this.f3774F = textSize / this.f3798i;
                }
                float textSizeRatio2 = this.f3799j / this.f3798i;
                if (expandedWidth * textSizeRatio2 > collapsedWidth) {
                    textSizeRatio = Math.min(collapsedWidth / textSizeRatio2, expandedWidth);
                } else {
                    textSizeRatio = expandedWidth;
                }
            }
            boolean z = true;
            if (textSizeRatio > 0.0f) {
                updateDrawText = this.f3775G != newTextSize || this.f3777I || updateDrawText;
                this.f3775G = newTextSize;
                this.f3777I = false;
            }
            if (this.f3814y == null || updateDrawText) {
                this.f3778J.setTextSize(this.f3775G);
                this.f3778J.setTypeface(this.f3810u);
                TextPaint textPaint = this.f3778J;
                if (this.f3774F == 1.0f) {
                    z = false;
                }
                textPaint.setLinearText(z);
                CharSequence title = TextUtils.ellipsize(this.f3813x, this.f3778J, textSizeRatio, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(title, this.f3814y)) {
                    this.f3814y = title;
                    this.f3815z = mo5467e(title);
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo5472j() {
        if (this.f3770B == null && !this.f3793d.isEmpty() && !TextUtils.isEmpty(this.f3814y)) {
            mo5468f(0.0f);
            this.f3772D = this.f3778J.ascent();
            this.f3773E = this.f3778J.descent();
            TextPaint textPaint = this.f3778J;
            CharSequence charSequence = this.f3814y;
            int w = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int h = Math.round(this.f3773E - this.f3772D);
            if (w > 0 && h > 0) {
                this.f3770B = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
                Canvas c = new Canvas(this.f3770B);
                CharSequence charSequence2 = this.f3814y;
                c.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) h) - this.f3778J.descent(), this.f3778J);
                if (this.f3771C == null) {
                    this.f3771C = new Paint(3);
                }
            }
        }
    }

    /* renamed from: z */
    public void mo5486z() {
        if (this.f3790a.getHeight() > 0 && this.f3790a.getWidth() > 0) {
            mo5464b();
            mo5466d();
        }
    }

    /* renamed from: S */
    public void mo5461S(CharSequence text) {
        if (text == null || !TextUtils.equals(this.f3813x, text)) {
            this.f3813x = text;
            this.f3814y = null;
            mo5470h();
            mo5486z();
        }
    }

    /* renamed from: h */
    public final void mo5470h() {
        Bitmap bitmap = this.f3770B;
        if (bitmap != null) {
            bitmap.recycle();
            this.f3770B = null;
        }
    }

    /* renamed from: v */
    public static boolean m4974v(float value, float targetValue) {
        return Math.abs(value - targetValue) < 0.001f;
    }

    /* renamed from: l */
    public ColorStateList mo5474l() {
        return this.f3801l;
    }

    /* renamed from: a */
    public static int m4973a(int color1, int color2, float ratio) {
        float inverseRatio = 1.0f - ratio;
        return Color.argb((int) ((((float) Color.alpha(color1)) * inverseRatio) + (((float) Color.alpha(color2)) * ratio)), (int) ((((float) Color.red(color1)) * inverseRatio) + (((float) Color.red(color2)) * ratio)), (int) ((((float) Color.green(color1)) * inverseRatio) + (((float) Color.green(color2)) * ratio)), (int) ((((float) Color.blue(color1)) * inverseRatio) + (((float) Color.blue(color2)) * ratio)));
    }

    /* renamed from: x */
    public static float m4975x(float startValue, float endValue, float fraction, TimeInterpolator interpolator) {
        if (interpolator != null) {
            fraction = interpolator.getInterpolation(fraction);
        }
        return C1023a.m5420a(startValue, endValue, fraction);
    }

    /* renamed from: A */
    public static boolean m4972A(Rect r, int left, int top, int right, int bottom) {
        return r.left == left && r.top == top && r.right == right && r.bottom == bottom;
    }
}
