package p066b.p067a.p068a.p069a.p084o;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p025h.p038m.C0460r;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.C1020k;
import p066b.p067a.p068a.p069a.p070a0.C0922h;
import p066b.p067a.p068a.p069a.p073d0.C0932c;
import p066b.p067a.p068a.p069a.p074e0.C0939a;
import p066b.p067a.p068a.p069a.p074e0.C0942b;
import p066b.p067a.p068a.p069a.p076g0.C0953g;
import p066b.p067a.p068a.p069a.p076g0.C0960k;
import p066b.p067a.p068a.p069a.p076g0.C0975n;
import p066b.p067a.p068a.p069a.p091u.C1060a;

/* renamed from: b.a.a.a.o.a */
public class C1041a {

    /* renamed from: s */
    public static final boolean f4364s = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: a */
    public final MaterialButton f4365a;

    /* renamed from: b */
    public C0960k f4366b;

    /* renamed from: c */
    public int f4367c;

    /* renamed from: d */
    public int f4368d;

    /* renamed from: e */
    public int f4369e;

    /* renamed from: f */
    public int f4370f;

    /* renamed from: g */
    public int f4371g;

    /* renamed from: h */
    public int f4372h;

    /* renamed from: i */
    public PorterDuff.Mode f4373i;

    /* renamed from: j */
    public ColorStateList f4374j;

    /* renamed from: k */
    public ColorStateList f4375k;

    /* renamed from: l */
    public ColorStateList f4376l;

    /* renamed from: m */
    public Drawable f4377m;

    /* renamed from: n */
    public boolean f4378n = false;

    /* renamed from: o */
    public boolean f4379o = false;

    /* renamed from: p */
    public boolean f4380p = false;

    /* renamed from: q */
    public boolean f4381q;

    /* renamed from: r */
    public LayerDrawable f4382r;

    public C1041a(MaterialButton button, C0960k shapeAppearanceModel) {
        this.f4365a = button;
        this.f4366b = shapeAppearanceModel;
    }

    /* renamed from: o */
    public void mo5932o(TypedArray attributes) {
        this.f4367c = attributes.getDimensionPixelOffset(C1020k.f4297w0, 0);
        this.f4368d = attributes.getDimensionPixelOffset(C1020k.f4301x0, 0);
        this.f4369e = attributes.getDimensionPixelOffset(C1020k.f4305y0, 0);
        this.f4370f = attributes.getDimensionPixelOffset(C1020k.f4309z0, 0);
        int i = C1020k.f4111D0;
        if (attributes.hasValue(i)) {
            int dimensionPixelSize = attributes.getDimensionPixelSize(i, -1);
            this.f4371g = dimensionPixelSize;
            mo5938u(this.f4366b.mo5655w((float) dimensionPixelSize));
            this.f4380p = true;
        }
        this.f4372h = attributes.getDimensionPixelSize(C1020k.f4151N0, 0);
        this.f4373i = C0922h.m5058c(attributes.getInt(C1020k.f4107C0, -1), PorterDuff.Mode.SRC_IN);
        this.f4374j = C0932c.m5073a(this.f4365a.getContext(), attributes, C1020k.f4103B0);
        this.f4375k = C0932c.m5073a(this.f4365a.getContext(), attributes, C1020k.f4147M0);
        this.f4376l = C0932c.m5073a(this.f4365a.getContext(), attributes, C1020k.f4143L0);
        this.f4381q = attributes.getBoolean(C1020k.f4099A0, false);
        int elevation = attributes.getDimensionPixelSize(C1020k.f4115E0, 0);
        int paddingStart = C0460r.m2226A(this.f4365a);
        int paddingTop = this.f4365a.getPaddingTop();
        int paddingEnd = C0460r.m2296z(this.f4365a);
        int paddingBottom = this.f4365a.getPaddingBottom();
        this.f4365a.setInternalBackground(mo5918a());
        C0953g materialShapeDrawable = mo5921d();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.mo5587S((float) elevation);
        }
        C0460r.m2281o0(this.f4365a, this.f4367c + paddingStart, this.f4369e + paddingTop, this.f4368d + paddingEnd, this.f4370f + paddingBottom);
    }

    /* renamed from: q */
    public void mo5934q() {
        this.f4379o = true;
        this.f4365a.setSupportBackgroundTintList(this.f4374j);
        this.f4365a.setSupportBackgroundTintMode(this.f4373i);
    }

    /* renamed from: m */
    public boolean mo5930m() {
        return this.f4379o;
    }

    /* renamed from: D */
    public final InsetDrawable mo5917D(Drawable drawable) {
        return new InsetDrawable(drawable, this.f4367c, this.f4369e, this.f4368d, this.f4370f);
    }

    /* renamed from: y */
    public void mo5942y(ColorStateList tintList) {
        if (this.f4374j != tintList) {
            this.f4374j = tintList;
            if (mo5921d() != null) {
                C0370a.m1945o(mo5921d(), this.f4374j);
            }
        }
    }

    /* renamed from: j */
    public ColorStateList mo5927j() {
        return this.f4374j;
    }

    /* renamed from: z */
    public void mo5943z(PorterDuff.Mode mode) {
        if (this.f4373i != mode) {
            this.f4373i = mode;
            if (mo5921d() != null && this.f4373i != null) {
                C0370a.m1946p(mo5921d(), this.f4373i);
            }
        }
    }

    /* renamed from: k */
    public PorterDuff.Mode mo5928k() {
        return this.f4373i;
    }

    /* renamed from: v */
    public void mo5939v(boolean shouldDrawSurfaceColorStroke) {
        this.f4378n = shouldDrawSurfaceColorStroke;
        mo5916C();
    }

    /* renamed from: a */
    public final Drawable mo5918a() {
        C0953g backgroundDrawable = new C0953g(this.f4366b);
        backgroundDrawable.mo5581L(this.f4365a.getContext());
        C0370a.m1945o(backgroundDrawable, this.f4374j);
        PorterDuff.Mode mode = this.f4373i;
        if (mode != null) {
            C0370a.m1946p(backgroundDrawable, mode);
        }
        backgroundDrawable.mo5594Z((float) this.f4372h, this.f4375k);
        C0953g surfaceColorStrokeDrawable = new C0953g(this.f4366b);
        surfaceColorStrokeDrawable.setTint(0);
        surfaceColorStrokeDrawable.mo5593Y((float) this.f4372h, this.f4378n ? C1060a.m5721c(this.f4365a, C0924b.colorSurface) : 0);
        if (f4364s) {
            C0953g gVar = new C0953g(this.f4366b);
            this.f4377m = gVar;
            C0370a.m1944n(gVar, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C0942b.m5099a(this.f4376l), mo5917D(new LayerDrawable(new Drawable[]{surfaceColorStrokeDrawable, backgroundDrawable})), this.f4377m);
            this.f4382r = rippleDrawable;
            return rippleDrawable;
        }
        C0939a aVar = new C0939a(this.f4366b);
        this.f4377m = aVar;
        C0370a.m1945o(aVar, C0942b.m5099a(this.f4376l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{surfaceColorStrokeDrawable, backgroundDrawable, this.f4377m});
        this.f4382r = layerDrawable;
        return mo5917D(layerDrawable);
    }

    /* renamed from: B */
    public void mo5915B(int height, int width) {
        Drawable drawable = this.f4377m;
        if (drawable != null) {
            drawable.setBounds(this.f4367c, this.f4369e, width - this.f4368d, height - this.f4370f);
        }
    }

    /* renamed from: p */
    public void mo5933p(int color) {
        if (mo5921d() != null) {
            mo5921d().setTint(color);
        }
    }

    /* renamed from: t */
    public void mo5937t(ColorStateList rippleColor) {
        if (this.f4376l != rippleColor) {
            this.f4376l = rippleColor;
            boolean z = f4364s;
            if (z && (this.f4365a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f4365a.getBackground()).setColor(C0942b.m5099a(rippleColor));
            } else if (!z && (this.f4365a.getBackground() instanceof C0939a)) {
                ((C0939a) this.f4365a.getBackground()).setTintList(C0942b.m5099a(rippleColor));
            }
        }
    }

    /* renamed from: f */
    public ColorStateList mo5923f() {
        return this.f4376l;
    }

    /* renamed from: w */
    public void mo5940w(ColorStateList strokeColor) {
        if (this.f4375k != strokeColor) {
            this.f4375k = strokeColor;
            mo5916C();
        }
    }

    /* renamed from: h */
    public ColorStateList mo5925h() {
        return this.f4375k;
    }

    /* renamed from: x */
    public void mo5941x(int strokeWidth) {
        if (this.f4372h != strokeWidth) {
            this.f4372h = strokeWidth;
            mo5916C();
        }
    }

    /* renamed from: i */
    public int mo5926i() {
        return this.f4372h;
    }

    /* renamed from: C */
    public final void mo5916C() {
        C0953g materialShapeDrawable = mo5921d();
        C0953g surfaceColorStrokeDrawable = mo5929l();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.mo5594Z((float) this.f4372h, this.f4375k);
            if (surfaceColorStrokeDrawable != null) {
                surfaceColorStrokeDrawable.mo5593Y((float) this.f4372h, this.f4378n ? C1060a.m5721c(this.f4365a, C0924b.colorSurface) : 0);
            }
        }
    }

    /* renamed from: s */
    public void mo5936s(int cornerRadius) {
        if (!this.f4380p || this.f4371g != cornerRadius) {
            this.f4371g = cornerRadius;
            this.f4380p = true;
            mo5938u(this.f4366b.mo5655w((float) cornerRadius));
        }
    }

    /* renamed from: b */
    public int mo5919b() {
        return this.f4371g;
    }

    /* renamed from: e */
    public final C0953g mo5922e(boolean getSurfaceColorStrokeDrawable) {
        LayerDrawable layerDrawable = this.f4382r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f4364s) {
            return (C0953g) ((LayerDrawable) ((InsetDrawable) this.f4382r.getDrawable(0)).getDrawable()).getDrawable(getSurfaceColorStrokeDrawable ^ true ? 1 : 0);
        }
        return (C0953g) this.f4382r.getDrawable(getSurfaceColorStrokeDrawable ^ true ? 1 : 0);
    }

    /* renamed from: d */
    public C0953g mo5921d() {
        return mo5922e(false);
    }

    /* renamed from: r */
    public void mo5935r(boolean checkable) {
        this.f4381q = checkable;
    }

    /* renamed from: n */
    public boolean mo5931n() {
        return this.f4381q;
    }

    /* renamed from: l */
    public final C0953g mo5929l() {
        return mo5922e(true);
    }

    /* renamed from: A */
    public final void mo5914A(C0960k shapeAppearanceModel) {
        if (mo5921d() != null) {
            mo5921d().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (mo5929l() != null) {
            mo5929l().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (mo5920c() != null) {
            mo5920c().setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    /* renamed from: c */
    public C0975n mo5920c() {
        LayerDrawable layerDrawable = this.f4382r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f4382r.getNumberOfLayers() > 2) {
            return (C0975n) this.f4382r.getDrawable(2);
        }
        return (C0975n) this.f4382r.getDrawable(1);
    }

    /* renamed from: u */
    public void mo5938u(C0960k shapeAppearanceModel) {
        this.f4366b = shapeAppearanceModel;
        mo5914A(shapeAppearanceModel);
    }

    /* renamed from: g */
    public C0960k mo5924g() {
        return this.f4366b;
    }
}
