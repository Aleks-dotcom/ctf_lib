package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    public AnimatorSet f4942b;

    /* renamed from: J */
    public abstract AnimatorSet mo7158J(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /* renamed from: H */
    public boolean mo7156H(View dependency, View child, boolean expanded, boolean animated) {
        AnimatorSet animatorSet = this.f4942b;
        boolean currentlyAnimating = animatorSet != null;
        if (currentlyAnimating) {
            animatorSet.cancel();
        }
        AnimatorSet J = mo7158J(dependency, child, expanded, currentlyAnimating);
        this.f4942b = J;
        J.addListener(new C1185a());
        this.f4942b.start();
        if (!animated) {
            this.f4942b.end();
        }
        return true;
    }

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    public class C1185a extends AnimatorListenerAdapter {
        public C1185a() {
        }

        public void onAnimationEnd(Animator animation) {
            AnimatorSet unused = ExpandableTransformationBehavior.this.f4942b = null;
        }
    }
}
