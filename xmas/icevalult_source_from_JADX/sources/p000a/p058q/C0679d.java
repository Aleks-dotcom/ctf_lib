package p000a.p058q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.q.d */
public class C0679d extends C0698j0 {
    public C0679d(int fadingMode) {
        mo3512i0(fadingMode);
    }

    /* renamed from: j */
    public void mo3443j(C0723s transitionValues) {
        super.mo3443j(transitionValues);
        transitionValues.f2741a.put("android:fade:transitionAlpha", Float.valueOf(C0676c0.m3342c(transitionValues.f2742b)));
    }

    /* renamed from: j0 */
    public final Animator mo3489j0(View view, float startAlpha, float endAlpha) {
        if (startAlpha == endAlpha) {
            return null;
        }
        C0676c0.m3346g(view, startAlpha);
        ObjectAnimator anim = ObjectAnimator.ofFloat(view, C0676c0.f2630b, new float[]{endAlpha});
        anim.addListener(new C0681b(view));
        mo3549a(new C0680a(this, view));
        return anim;
    }

    /* renamed from: a.q.d$a */
    public class C0680a extends C0714n {

        /* renamed from: a */
        public final /* synthetic */ View f2631a;

        public C0680a(C0679d this$0, View view) {
            this.f2631a = view;
        }

        /* renamed from: c */
        public void mo3473c(C0706m transition) {
            C0676c0.m3346g(this.f2631a, 1.0f);
            C0676c0.m3340a(this.f2631a);
            transition.mo3538P(this);
        }
    }

    /* renamed from: e0 */
    public Animator mo3487e0(ViewGroup sceneRoot, View view, C0723s startValues, C0723s endValues) {
        float startAlpha = m3354k0(startValues, 0.0f);
        if (startAlpha == 1.0f) {
            startAlpha = 0.0f;
        }
        return mo3489j0(view, startAlpha, 1.0f);
    }

    /* renamed from: g0 */
    public Animator mo3488g0(ViewGroup sceneRoot, View view, C0723s startValues, C0723s endValues) {
        C0676c0.m3344e(view);
        return mo3489j0(view, m3354k0(startValues, 1.0f), 0.0f);
    }

    /* renamed from: k0 */
    public static float m3354k0(C0723s startValues, float fallbackValue) {
        Float startAlphaFloat;
        float startAlpha = fallbackValue;
        if (startValues == null || (startAlphaFloat = (Float) startValues.f2741a.get("android:fade:transitionAlpha")) == null) {
            return startAlpha;
        }
        return startAlphaFloat.floatValue();
    }

    /* renamed from: a.q.d$b */
    public static class C0681b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f2632a;

        /* renamed from: b */
        public boolean f2633b = false;

        public C0681b(View view) {
            this.f2632a = view;
        }

        public void onAnimationStart(Animator animation) {
            if (C0460r.m2231F(this.f2632a) && this.f2632a.getLayerType() == 0) {
                this.f2633b = true;
                this.f2632a.setLayerType(2, (Paint) null);
            }
        }

        public void onAnimationEnd(Animator animation) {
            C0676c0.m3346g(this.f2632a, 1.0f);
            if (this.f2633b) {
                this.f2632a.setLayerType(0, (Paint) null);
            }
        }
    }
}
