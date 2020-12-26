package p066b.p067a.p068a.p069a.p096z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p025h.p037l.C0419h;
import p000a.p025h.p038m.C0460r;
import p066b.p067a.p068a.p069a.C0909a;
import p066b.p067a.p068a.p069a.p070a0.C0915e;
import p066b.p067a.p068a.p069a.p074e0.C0942b;
import p066b.p067a.p068a.p069a.p075f0.C0945b;
import p066b.p067a.p068a.p069a.p076g0.C0953g;
import p066b.p067a.p068a.p069a.p076g0.C0957h;
import p066b.p067a.p068a.p069a.p076g0.C0960k;
import p066b.p067a.p068a.p069a.p076g0.C0975n;
import p066b.p067a.p068a.p069a.p081l.C1023a;
import p066b.p067a.p068a.p069a.p081l.C1024b;
import p066b.p067a.p068a.p069a.p081l.C1028f;
import p066b.p067a.p068a.p069a.p081l.C1029g;
import p066b.p067a.p068a.p069a.p081l.C1030h;

/* renamed from: b.a.a.a.z.b */
public class C1102b {

    /* renamed from: F */
    public static final TimeInterpolator f4555F = C1023a.f4314c;

    /* renamed from: G */
    public static final int[] f4556G = {16842919, 16842910};

    /* renamed from: H */
    public static final int[] f4557H = {16843623, 16842908, 16842910};

    /* renamed from: I */
    public static final int[] f4558I = {16842908, 16842910};

    /* renamed from: J */
    public static final int[] f4559J = {16843623, 16842910};

    /* renamed from: K */
    public static final int[] f4560K = {16842910};

    /* renamed from: L */
    public static final int[] f4561L = new int[0];

    /* renamed from: A */
    public final Rect f4562A = new Rect();

    /* renamed from: B */
    public final RectF f4563B = new RectF();

    /* renamed from: C */
    public final RectF f4564C = new RectF();

    /* renamed from: D */
    public final Matrix f4565D = new Matrix();

    /* renamed from: E */
    public ViewTreeObserver.OnPreDrawListener f4566E;

    /* renamed from: a */
    public C0960k f4567a;

    /* renamed from: b */
    public C0953g f4568b;

    /* renamed from: c */
    public Drawable f4569c;

    /* renamed from: d */
    public C1101a f4570d;

    /* renamed from: e */
    public Drawable f4571e;

    /* renamed from: f */
    public boolean f4572f;

    /* renamed from: g */
    public boolean f4573g = true;

    /* renamed from: h */
    public float f4574h;

    /* renamed from: i */
    public float f4575i;

    /* renamed from: j */
    public float f4576j;

    /* renamed from: k */
    public int f4577k;

    /* renamed from: l */
    public final C0915e f4578l;

    /* renamed from: m */
    public C1030h f4579m;

    /* renamed from: n */
    public C1030h f4580n;

    /* renamed from: o */
    public Animator f4581o;

    /* renamed from: p */
    public C1030h f4582p;

    /* renamed from: q */
    public C1030h f4583q;

    /* renamed from: r */
    public float f4584r;

    /* renamed from: s */
    public float f4585s = 1.0f;

    /* renamed from: t */
    public int f4586t;

    /* renamed from: u */
    public int f4587u = 0;

    /* renamed from: v */
    public ArrayList<Animator.AnimatorListener> f4588v;

    /* renamed from: w */
    public ArrayList<Animator.AnimatorListener> f4589w;

    /* renamed from: x */
    public ArrayList<C1111i> f4590x;

    /* renamed from: y */
    public final FloatingActionButton f4591y;

    /* renamed from: z */
    public final C0945b f4592z;

    /* renamed from: b.a.a.a.z.b$i */
    public interface C1111i {
        /* renamed from: a */
        void mo6352a();

        /* renamed from: b */
        void mo6353b();
    }

    /* renamed from: b.a.a.a.z.b$j */
    public interface C1112j {
        /* renamed from: a */
        void mo6354a();

        /* renamed from: b */
        void mo6355b();
    }

    public C1102b(FloatingActionButton view, C0945b shadowViewDelegate) {
        this.f4591y = view;
        this.f4592z = shadowViewDelegate;
        C0915e eVar = new C0915e();
        this.f4578l = eVar;
        eVar.mo5507a(f4556G, mo6324i(new C1110h()));
        eVar.mo5507a(f4557H, mo6324i(new C1109g()));
        eVar.mo5507a(f4558I, mo6324i(new C1109g()));
        eVar.mo5507a(f4559J, mo6324i(new C1109g()));
        eVar.mo5507a(f4560K, mo6324i(new C1113k()));
        eVar.mo5507a(f4561L, mo6324i(new C1108f(this)));
        this.f4584r = view.getRotation();
    }

    /* renamed from: J */
    public void mo6298J(ColorStateList tint) {
        C0953g gVar = this.f4568b;
        if (gVar != null) {
            gVar.setTintList(tint);
        }
        C1101a aVar = this.f4570d;
        if (aVar != null) {
            aVar.mo6287a(tint);
            throw null;
        }
    }

    /* renamed from: K */
    public void mo6299K(PorterDuff.Mode tintMode) {
        C0953g gVar = this.f4568b;
        if (gVar != null) {
            gVar.setTintMode(tintMode);
        }
    }

    /* renamed from: R */
    public void mo6306R(ColorStateList rippleColor) {
        Drawable drawable = this.f4569c;
        if (drawable != null) {
            C0370a.m1945o(drawable, C0942b.m5099a(rippleColor));
        }
    }

    /* renamed from: L */
    public final void mo6300L(float elevation) {
        if (this.f4574h != elevation) {
            this.f4574h = elevation;
            mo6292D(elevation, this.f4575i, this.f4576j);
        }
    }

    /* renamed from: m */
    public float mo6328m() {
        return this.f4574h;
    }

    /* renamed from: p */
    public float mo6331p() {
        return this.f4575i;
    }

    /* renamed from: s */
    public float mo6334s() {
        return this.f4576j;
    }

    /* renamed from: O */
    public final void mo6303O(float translationZ) {
        if (this.f4575i != translationZ) {
            this.f4575i = translationZ;
            mo6292D(this.f4574h, translationZ, this.f4576j);
        }
    }

    /* renamed from: Q */
    public final void mo6305Q(float translationZ) {
        if (this.f4576j != translationZ) {
            this.f4576j = translationZ;
            mo6292D(this.f4574h, this.f4575i, translationZ);
        }
    }

    /* renamed from: a0 */
    public final void mo6315a0() {
        mo6304P(this.f4585s);
    }

    /* renamed from: P */
    public final void mo6304P(float scale) {
        this.f4585s = scale;
        Matrix matrix = this.f4565D;
        mo6322g(scale, matrix);
        this.f4591y.setImageMatrix(matrix);
    }

    /* renamed from: g */
    public final void mo6322g(float scale, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f4591y.getDrawable();
        if (drawable != null && this.f4586t != 0) {
            RectF drawableBounds = this.f4563B;
            RectF imageBounds = this.f4564C;
            drawableBounds.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f4586t;
            imageBounds.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(drawableBounds, imageBounds, Matrix.ScaleToFit.CENTER);
            int i2 = this.f4586t;
            matrix.postScale(scale, scale, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: T */
    public final void mo6308T(C0960k shapeAppearance) {
        this.f4567a = shapeAppearance;
        C0953g gVar = this.f4568b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(shapeAppearance);
        }
        Drawable drawable = this.f4569c;
        if (drawable instanceof C0975n) {
            ((C0975n) drawable).setShapeAppearanceModel(shapeAppearance);
        }
        C1101a aVar = this.f4570d;
        if (aVar != null) {
            aVar.mo6288b(shapeAppearance);
            throw null;
        }
    }

    /* renamed from: t */
    public final C0960k mo6335t() {
        return this.f4567a;
    }

    /* renamed from: u */
    public final C1030h mo6336u() {
        return this.f4582p;
    }

    /* renamed from: U */
    public final void mo6309U(C1030h spec) {
        this.f4582p = spec;
    }

    /* renamed from: o */
    public final C1030h mo6330o() {
        return this.f4583q;
    }

    /* renamed from: N */
    public final void mo6302N(C1030h spec) {
        this.f4583q = spec;
    }

    /* renamed from: X */
    public final boolean mo6312X() {
        return !this.f4572f || this.f4591y.getSizeDimension() >= this.f4577k;
    }

    /* renamed from: n */
    public boolean mo6329n() {
        return this.f4572f;
    }

    /* renamed from: M */
    public void mo6301M(boolean flag) {
        this.f4572f = flag;
    }

    /* renamed from: S */
    public void mo6307S(boolean shadowPaddingEnabled) {
        this.f4573g = shadowPaddingEnabled;
        mo6316b0();
    }

    /* renamed from: D */
    public void mo6292D(float elevation, float hoveredFocusedTranslationZ, float pressedTranslationZ) {
        mo6316b0();
        mo6317c0(elevation);
    }

    /* renamed from: c0 */
    public void mo6317c0(float elevation) {
        C0953g gVar = this.f4568b;
        if (gVar != null) {
            gVar.mo5587S(elevation);
        }
    }

    /* renamed from: C */
    public void mo6291C(int[] state) {
        this.f4578l.mo5510d(state);
    }

    /* renamed from: y */
    public void mo6340y() {
        this.f4578l.mo5509c();
    }

    /* renamed from: e */
    public void mo6320e(Animator.AnimatorListener listener) {
        if (this.f4588v == null) {
            this.f4588v = new ArrayList<>();
        }
        this.f4588v.add(listener);
    }

    /* renamed from: d */
    public void mo6318d(Animator.AnimatorListener listener) {
        if (this.f4589w == null) {
            this.f4589w = new ArrayList<>();
        }
        this.f4589w.add(listener);
    }

    /* renamed from: v */
    public void mo6337v(C1112j listener, boolean fromUser) {
        if (!mo6338w()) {
            Animator animator = this.f4581o;
            if (animator != null) {
                animator.cancel();
            }
            if (mo6311W()) {
                C1030h hVar = this.f4583q;
                if (hVar == null) {
                    hVar = mo6326k();
                }
                AnimatorSet set = mo6323h(hVar, 0.0f, 0.0f, 0.0f);
                set.addListener(new C1103a(fromUser, listener));
                ArrayList<Animator.AnimatorListener> arrayList = this.f4589w;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        set.addListener(it.next());
                    }
                }
                set.start();
                return;
            }
            this.f4591y.mo5526b(fromUser ? 8 : 4, fromUser);
            if (listener != null) {
                listener.mo6355b();
            }
        }
    }

    /* renamed from: b.a.a.a.z.b$a */
    public class C1103a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f4593a;

        /* renamed from: b */
        public final /* synthetic */ boolean f4594b;

        /* renamed from: c */
        public final /* synthetic */ C1112j f4595c;

        public C1103a(boolean z, C1112j jVar) {
            this.f4594b = z;
            this.f4595c = jVar;
        }

        public void onAnimationStart(Animator animation) {
            C1102b.this.f4591y.mo5526b(0, this.f4594b);
            int unused = C1102b.this.f4587u = 1;
            Animator unused2 = C1102b.this.f4581o = animation;
            this.f4593a = false;
        }

        public void onAnimationCancel(Animator animation) {
            this.f4593a = true;
        }

        public void onAnimationEnd(Animator animation) {
            int unused = C1102b.this.f4587u = 0;
            Animator unused2 = C1102b.this.f4581o = null;
            if (!this.f4593a) {
                FloatingActionButton floatingActionButton = C1102b.this.f4591y;
                boolean z = this.f4594b;
                floatingActionButton.mo5526b(z ? 8 : 4, z);
                C1112j jVar = this.f4595c;
                if (jVar != null) {
                    jVar.mo6355b();
                }
            }
        }
    }

    /* renamed from: Y */
    public void mo6313Y(C1112j listener, boolean fromUser) {
        if (!mo6339x()) {
            Animator animator = this.f4581o;
            if (animator != null) {
                animator.cancel();
            }
            if (mo6311W()) {
                if (this.f4591y.getVisibility() != 0) {
                    this.f4591y.setAlpha(0.0f);
                    this.f4591y.setScaleY(0.0f);
                    this.f4591y.setScaleX(0.0f);
                    mo6304P(0.0f);
                }
                C1030h hVar = this.f4582p;
                if (hVar == null) {
                    hVar = mo6327l();
                }
                AnimatorSet set = mo6323h(hVar, 1.0f, 1.0f, 1.0f);
                set.addListener(new C1104b(fromUser, listener));
                ArrayList<Animator.AnimatorListener> arrayList = this.f4588v;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        set.addListener(it.next());
                    }
                }
                set.start();
                return;
            }
            this.f4591y.mo5526b(0, fromUser);
            this.f4591y.setAlpha(1.0f);
            this.f4591y.setScaleY(1.0f);
            this.f4591y.setScaleX(1.0f);
            mo6304P(1.0f);
            if (listener != null) {
                listener.mo6354a();
            }
        }
    }

    /* renamed from: b.a.a.a.z.b$b */
    public class C1104b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f4597a;

        /* renamed from: b */
        public final /* synthetic */ C1112j f4598b;

        public C1104b(boolean z, C1112j jVar) {
            this.f4597a = z;
            this.f4598b = jVar;
        }

        public void onAnimationStart(Animator animation) {
            C1102b.this.f4591y.mo5526b(0, this.f4597a);
            int unused = C1102b.this.f4587u = 2;
            Animator unused2 = C1102b.this.f4581o = animation;
        }

        public void onAnimationEnd(Animator animation) {
            int unused = C1102b.this.f4587u = 0;
            Animator unused2 = C1102b.this.f4581o = null;
            C1112j jVar = this.f4598b;
            if (jVar != null) {
                jVar.mo6354a();
            }
        }
    }

    /* renamed from: l */
    public final C1030h mo6327l() {
        if (this.f4579m == null) {
            this.f4579m = C1030h.m5433c(this.f4591y.getContext(), C0909a.design_fab_show_motion_spec);
        }
        C1030h hVar = this.f4579m;
        C0419h.m2060c(hVar);
        return hVar;
    }

    /* renamed from: k */
    public final C1030h mo6326k() {
        if (this.f4580n == null) {
            this.f4580n = C1030h.m5433c(this.f4591y.getContext(), C0909a.design_fab_hide_motion_spec);
        }
        C1030h hVar = this.f4580n;
        C0419h.m2060c(hVar);
        return hVar;
    }

    /* renamed from: h */
    public final AnimatorSet mo6323h(C1030h spec, float opacity, float scale, float iconScale) {
        List<Animator> animators = new ArrayList<>();
        ObjectAnimator animatorOpacity = ObjectAnimator.ofFloat(this.f4591y, View.ALPHA, new float[]{opacity});
        spec.mo5859e("opacity").mo5867a(animatorOpacity);
        animators.add(animatorOpacity);
        ObjectAnimator animatorScaleX = ObjectAnimator.ofFloat(this.f4591y, View.SCALE_X, new float[]{scale});
        spec.mo5859e("scale").mo5867a(animatorScaleX);
        mo6319d0(animatorScaleX);
        animators.add(animatorScaleX);
        ObjectAnimator animatorScaleY = ObjectAnimator.ofFloat(this.f4591y, View.SCALE_Y, new float[]{scale});
        spec.mo5859e("scale").mo5867a(animatorScaleY);
        mo6319d0(animatorScaleY);
        animators.add(animatorScaleY);
        mo6322g(iconScale, this.f4565D);
        ObjectAnimator animatorIconScale = ObjectAnimator.ofObject(this.f4591y, new C1028f(), new C1105c(), new Matrix[]{new Matrix(this.f4565D)});
        spec.mo5859e("iconScale").mo5867a(animatorIconScale);
        animators.add(animatorIconScale);
        AnimatorSet set = new AnimatorSet();
        C1024b.m5421a(set, animators);
        return set;
    }

    /* renamed from: b.a.a.a.z.b$c */
    public class C1105c extends C1029g {
        public C1105c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float fraction, Matrix startValue, Matrix endValue) {
            float unused = C1102b.this.f4585s = fraction;
            return super.mo5858a(fraction, startValue, endValue);
        }
    }

    /* renamed from: d0 */
    public final void mo6319d0(ObjectAnimator animator) {
        if (Build.VERSION.SDK_INT == 26) {
            animator.setEvaluator(new C1106d(this));
        }
    }

    /* renamed from: b.a.a.a.z.b$d */
    public class C1106d implements TypeEvaluator<Float> {

        /* renamed from: a */
        public FloatEvaluator f4601a = new FloatEvaluator();

        public C1106d(C1102b this$0) {
        }

        /* renamed from: a */
        public Float evaluate(float fraction, Float startValue, Float endValue) {
            float evaluated = this.f4601a.evaluate(fraction, startValue, endValue).floatValue();
            return Float.valueOf(evaluated < 0.1f ? 0.0f : evaluated);
        }
    }

    /* renamed from: f */
    public void mo6321f(C1111i listener) {
        if (this.f4590x == null) {
            this.f4590x = new ArrayList<>();
        }
        this.f4590x.add(listener);
    }

    /* renamed from: H */
    public void mo6296H() {
        ArrayList<C1111i> arrayList = this.f4590x;
        if (arrayList != null) {
            Iterator<C1111i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo6353b();
            }
        }
    }

    /* renamed from: G */
    public void mo6295G() {
        ArrayList<C1111i> arrayList = this.f4590x;
        if (arrayList != null) {
            Iterator<C1111i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo6352a();
            }
        }
    }

    /* renamed from: j */
    public final Drawable mo6325j() {
        return this.f4571e;
    }

    /* renamed from: A */
    public void mo6289A() {
    }

    /* renamed from: b0 */
    public final void mo6316b0() {
        Rect rect = this.f4562A;
        mo6333r(rect);
        mo6293E(rect);
        this.f4592z.mo5559a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: r */
    public void mo6333r(Rect rect) {
        int minPadding = this.f4572f ? (this.f4577k - this.f4591y.getSizeDimension()) / 2 : 0;
        float maxShadowSize = this.f4573g ? mo6328m() + this.f4576j : 0.0f;
        int hPadding = Math.max(minPadding, (int) Math.ceil((double) maxShadowSize));
        int vPadding = Math.max(minPadding, (int) Math.ceil((double) (1.5f * maxShadowSize)));
        rect.set(hPadding, vPadding, hPadding, vPadding);
    }

    /* renamed from: E */
    public void mo6293E(Rect padding) {
        C0419h.m2061d(this.f4571e, "Didn't initialize content background");
        if (mo6310V()) {
            this.f4592z.mo5560b(new InsetDrawable(this.f4571e, padding.left, padding.top, padding.right, padding.bottom));
            return;
        }
        this.f4592z.mo5560b(this.f4571e);
    }

    /* renamed from: V */
    public boolean mo6310V() {
        return true;
    }

    /* renamed from: z */
    public void mo6341z() {
        C0953g gVar = this.f4568b;
        if (gVar != null) {
            C0957h.m5179f(this.f4591y, gVar);
        }
        if (mo6297I()) {
            this.f4591y.getViewTreeObserver().addOnPreDrawListener(mo6332q());
        }
    }

    /* renamed from: B */
    public void mo6290B() {
        ViewTreeObserver viewTreeObserver = this.f4591y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f4566E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f4566E = null;
        }
    }

    /* renamed from: I */
    public boolean mo6297I() {
        return true;
    }

    /* renamed from: F */
    public void mo6294F() {
        float rotation = this.f4591y.getRotation();
        if (this.f4584r != rotation) {
            this.f4584r = rotation;
            mo6314Z();
        }
    }

    /* renamed from: q */
    public final ViewTreeObserver.OnPreDrawListener mo6332q() {
        if (this.f4566E == null) {
            this.f4566E = new C1107e();
        }
        return this.f4566E;
    }

    /* renamed from: b.a.a.a.z.b$e */
    public class C1107e implements ViewTreeObserver.OnPreDrawListener {
        public C1107e() {
        }

        public boolean onPreDraw() {
            C1102b.this.mo6294F();
            return true;
        }
    }

    /* renamed from: x */
    public boolean mo6339x() {
        if (this.f4591y.getVisibility() != 0) {
            if (this.f4587u == 2) {
                return true;
            }
            return false;
        } else if (this.f4587u != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: w */
    public boolean mo6338w() {
        if (this.f4591y.getVisibility() == 0) {
            if (this.f4587u == 1) {
                return true;
            }
            return false;
        } else if (this.f4587u != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: i */
    public final ValueAnimator mo6324i(C1114l impl) {
        ValueAnimator animator = new ValueAnimator();
        animator.setInterpolator(f4555F);
        animator.setDuration(100);
        animator.addListener(impl);
        animator.addUpdateListener(impl);
        animator.setFloatValues(new float[]{0.0f, 1.0f});
        return animator;
    }

    /* renamed from: b.a.a.a.z.b$l */
    public abstract class C1114l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f4606a;

        /* renamed from: b */
        public float f4607b;

        /* renamed from: c */
        public float f4608c;

        /* renamed from: a */
        public abstract float mo6351a();

        public C1114l() {
        }

        public /* synthetic */ C1114l(C1102b x0, C1103a x1) {
            this();
        }

        public void onAnimationUpdate(ValueAnimator animator) {
            if (!this.f4606a) {
                C0953g gVar = C1102b.this.f4568b;
                this.f4607b = gVar == null ? 0.0f : gVar.mo5629v();
                this.f4608c = mo6351a();
                this.f4606a = true;
            }
            C1102b bVar = C1102b.this;
            float f = this.f4607b;
            bVar.mo6317c0((float) ((int) (f + ((this.f4608c - f) * animator.getAnimatedFraction()))));
        }

        public void onAnimationEnd(Animator animator) {
            C1102b.this.mo6317c0((float) ((int) this.f4608c));
            this.f4606a = false;
        }
    }

    /* renamed from: b.a.a.a.z.b$k */
    public class C1113k extends C1114l {
        public C1113k() {
            super(C1102b.this, (C1103a) null);
        }

        /* renamed from: a */
        public float mo6351a() {
            return C1102b.this.f4574h;
        }
    }

    /* renamed from: b.a.a.a.z.b$g */
    public class C1109g extends C1114l {
        public C1109g() {
            super(C1102b.this, (C1103a) null);
        }

        /* renamed from: a */
        public float mo6351a() {
            C1102b bVar = C1102b.this;
            return bVar.f4574h + bVar.f4575i;
        }
    }

    /* renamed from: b.a.a.a.z.b$h */
    public class C1110h extends C1114l {
        public C1110h() {
            super(C1102b.this, (C1103a) null);
        }

        /* renamed from: a */
        public float mo6351a() {
            C1102b bVar = C1102b.this;
            return bVar.f4574h + bVar.f4576j;
        }
    }

    /* renamed from: b.a.a.a.z.b$f */
    public class C1108f extends C1114l {
        public C1108f(C1102b bVar) {
            super(bVar, (C1103a) null);
        }

        /* renamed from: a */
        public float mo6351a() {
            return 0.0f;
        }
    }

    /* renamed from: W */
    public final boolean mo6311W() {
        return C0460r.m2235J(this.f4591y) && !this.f4591y.isInEditMode();
    }

    /* renamed from: Z */
    public void mo6314Z() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f4584r % 90.0f != 0.0f) {
                if (this.f4591y.getLayerType() != 1) {
                    this.f4591y.setLayerType(1, (Paint) null);
                }
            } else if (this.f4591y.getLayerType() != 0) {
                this.f4591y.setLayerType(0, (Paint) null);
            }
        }
        C0953g gVar = this.f4568b;
        if (gVar != null) {
            gVar.mo5592X((int) this.f4584r);
        }
    }
}
