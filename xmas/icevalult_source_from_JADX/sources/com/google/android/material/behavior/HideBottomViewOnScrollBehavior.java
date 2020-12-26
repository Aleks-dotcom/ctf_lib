package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p066b.p067a.p068a.p069a.p081l.C1023a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.C0824c<V> {

    /* renamed from: a */
    public int f4646a = 0;

    /* renamed from: b */
    public int f4647b = 2;

    /* renamed from: c */
    public int f4648c = 0;

    /* renamed from: d */
    public ViewPropertyAnimator f4649d;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /* renamed from: l */
    public boolean mo4425l(CoordinatorLayout parent, V child, int layoutDirection) {
        this.f4646a = child.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) child.getLayoutParams()).bottomMargin;
        return super.mo4425l(parent, child, layoutDirection);
    }

    /* renamed from: G */
    public void mo6469G(V child, int offset) {
        this.f4648c = offset;
        if (this.f4647b == 1) {
            child.setTranslationY((float) (this.f4646a + offset));
        }
    }

    /* renamed from: z */
    public boolean mo4439z(CoordinatorLayout coordinatorLayout, V v, View directTargetChild, View target, int nestedScrollAxes) {
        return nestedScrollAxes == 2;
    }

    /* renamed from: r */
    public void mo4431r(CoordinatorLayout coordinatorLayout, V child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        if (dyConsumed > 0) {
            mo6470H(child);
        } else if (dyConsumed < 0) {
            mo6471I(child);
        }
    }

    /* renamed from: I */
    public void mo6471I(V child) {
        if (this.f4647b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f4649d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                child.clearAnimation();
            }
            this.f4647b = 2;
            mo6468F(child, 0, 225, C1023a.f4315d);
        }
    }

    /* renamed from: H */
    public void mo6470H(V child) {
        if (this.f4647b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f4649d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                child.clearAnimation();
            }
            this.f4647b = 1;
            mo6468F(child, this.f4646a + this.f4648c, 175, C1023a.f4314c);
        }
    }

    /* renamed from: F */
    public final void mo6468F(V child, int targetY, long duration, TimeInterpolator interpolator) {
        this.f4649d = child.animate().translationY((float) targetY).setInterpolator(interpolator).setDuration(duration).setListener(new C1130a());
    }

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class C1130a extends AnimatorListenerAdapter {
        public C1130a() {
        }

        public void onAnimationEnd(Animator animation) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f4649d = null;
        }
    }
}
