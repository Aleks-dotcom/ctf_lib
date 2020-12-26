package p066b.p067a.p068a.p069a.p073d0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import p000a.p025h.p027e.p028c.C0351f;
import p066b.p067a.p068a.p069a.C1020k;

/* renamed from: b.a.a.a.d0.d */
public class C0933d {

    /* renamed from: a */
    public final float f3860a;

    /* renamed from: b */
    public final ColorStateList f3861b;

    /* renamed from: c */
    public final int f3862c;

    /* renamed from: d */
    public final int f3863d;

    /* renamed from: e */
    public final String f3864e;

    /* renamed from: f */
    public final ColorStateList f3865f;

    /* renamed from: g */
    public final float f3866g;

    /* renamed from: h */
    public final float f3867h;

    /* renamed from: i */
    public final float f3868i;

    /* renamed from: j */
    public final int f3869j;

    /* renamed from: k */
    public boolean f3870k = false;

    /* renamed from: l */
    public Typeface f3871l;

    public C0933d(Context context, int id) {
        TypedArray a = context.obtainStyledAttributes(id, C1020k.f4168R1);
        this.f3860a = a.getDimension(C1020k.f4172S1, 0.0f);
        this.f3861b = C0932c.m5073a(context, a, C1020k.f4184V1);
        C0932c.m5073a(context, a, C1020k.f4188W1);
        C0932c.m5073a(context, a, C1020k.f4192X1);
        this.f3862c = a.getInt(C1020k.f4180U1, 0);
        this.f3863d = a.getInt(C1020k.f4176T1, 1);
        int fontFamilyIndex = C0932c.m5077e(a, C1020k.f4220d2, C1020k.f4215c2);
        this.f3869j = a.getResourceId(fontFamilyIndex, 0);
        this.f3864e = a.getString(fontFamilyIndex);
        a.getBoolean(C1020k.f4225e2, false);
        this.f3865f = C0932c.m5073a(context, a, C1020k.f4196Y1);
        this.f3866g = a.getFloat(C1020k.f4200Z1, 0.0f);
        this.f3867h = a.getFloat(C1020k.f4205a2, 0.0f);
        this.f3868i = a.getFloat(C1020k.f4210b2, 0.0f);
        a.recycle();
    }

    /* renamed from: f */
    public Typeface mo5535f(Context context) {
        if (this.f3870k) {
            return this.f3871l;
        }
        if (!context.isRestricted()) {
            try {
                Typeface b = C0351f.m1825b(context, this.f3869j);
                this.f3871l = b;
                if (b != null) {
                    this.f3871l = Typeface.create(b, this.f3862c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException e) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f3864e, e2);
            }
        }
        mo5533d();
        this.f3870k = true;
        return this.f3871l;
    }

    /* renamed from: h */
    public void mo5537h(Context context, C0937f callback) {
        if (C0936e.m5094a()) {
            mo5535f(context);
        } else {
            mo5533d();
        }
        int i = this.f3869j;
        if (i == 0) {
            this.f3870k = true;
        }
        if (this.f3870k) {
            callback.mo5522b(this.f3871l, true);
            return;
        }
        try {
            C0351f.m1827d(context, i, new C0934a(callback), (Handler) null);
        } catch (Resources.NotFoundException e) {
            this.f3870k = true;
            callback.mo5521a(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f3864e, e2);
            this.f3870k = true;
            callback.mo5521a(-3);
        }
    }

    /* renamed from: b.a.a.a.d0.d$a */
    public class C0934a extends C0351f.C0352a {

        /* renamed from: a */
        public final /* synthetic */ C0937f f3872a;

        public C0934a(C0937f fVar) {
            this.f3872a = fVar;
        }

        /* renamed from: d */
        public void mo1560d(Typeface typeface) {
            C0933d dVar = C0933d.this;
            Typeface unused = dVar.f3871l = Typeface.create(typeface, dVar.f3862c);
            boolean unused2 = C0933d.this.f3870k = true;
            this.f3872a.mo5522b(C0933d.this.f3871l, false);
        }

        /* renamed from: c */
        public void mo1559c(int reason) {
            boolean unused = C0933d.this.f3870k = true;
            this.f3872a.mo5521a(reason);
        }
    }

    /* renamed from: g */
    public void mo5536g(Context context, TextPaint textPaint, C0937f callback) {
        mo5540k(textPaint, mo5534e());
        mo5537h(context, new C0935b(textPaint, callback));
    }

    /* renamed from: b.a.a.a.d0.d$b */
    public class C0935b extends C0937f {

        /* renamed from: a */
        public final /* synthetic */ TextPaint f3874a;

        /* renamed from: b */
        public final /* synthetic */ C0937f f3875b;

        public C0935b(TextPaint textPaint, C0937f fVar) {
            this.f3874a = textPaint;
            this.f3875b = fVar;
        }

        /* renamed from: b */
        public void mo5522b(Typeface typeface, boolean fontResolvedSynchronously) {
            C0933d.this.mo5540k(this.f3874a, typeface);
            this.f3875b.mo5522b(typeface, fontResolvedSynchronously);
        }

        /* renamed from: a */
        public void mo5521a(int i) {
            this.f3875b.mo5521a(i);
        }
    }

    /* renamed from: e */
    public Typeface mo5534e() {
        mo5533d();
        return this.f3871l;
    }

    /* renamed from: d */
    public final void mo5533d() {
        String str;
        if (this.f3871l == null && (str = this.f3864e) != null) {
            this.f3871l = Typeface.create(str, this.f3862c);
        }
        if (this.f3871l == null) {
            int i = this.f3863d;
            if (i == 1) {
                this.f3871l = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f3871l = Typeface.SERIF;
            } else if (i != 3) {
                this.f3871l = Typeface.DEFAULT;
            } else {
                this.f3871l = Typeface.MONOSPACE;
            }
            this.f3871l = Typeface.create(this.f3871l, this.f3862c);
        }
    }

    /* renamed from: i */
    public void mo5538i(Context context, TextPaint textPaint, C0937f callback) {
        mo5539j(context, textPaint, callback);
        ColorStateList colorStateList = this.f3861b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f3868i;
        float f2 = this.f3866g;
        float f3 = this.f3867h;
        ColorStateList colorStateList2 = this.f3865f;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: j */
    public void mo5539j(Context context, TextPaint textPaint, C0937f callback) {
        if (C0936e.m5094a()) {
            mo5540k(textPaint, mo5535f(context));
        } else {
            mo5536g(context, textPaint, callback);
        }
    }

    /* renamed from: k */
    public void mo5540k(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int fake = this.f3862c & (~typeface.getStyle());
        textPaint.setFakeBoldText((fake & 1) != 0);
        textPaint.setTextSkewX((fake & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f3860a);
    }
}
