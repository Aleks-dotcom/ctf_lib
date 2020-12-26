package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p066b.p067a.p068a.p069a.p081l.C1024b;
import p066b.p067a.p068a.p069a.p081l.C1031i;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final C1031i f4959c = new C1031i(75, 150);

    /* renamed from: d */
    public final C1031i f4960d = new C1031i(0, 150);

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /* renamed from: e */
    public boolean mo4418e(CoordinatorLayout parent, View child, View dependency) {
        return dependency instanceof FloatingActionButton;
    }

    /* renamed from: D */
    public boolean mo4413D(CoordinatorLayout parent, View child, MotionEvent ev) {
        return super.mo4413D(parent, child, ev);
    }

    /* renamed from: J */
    public AnimatorSet mo7158J(View dependency, View child, boolean expanded, boolean isAnimating) {
        ArrayList arrayList = new ArrayList();
        mo7188K(child, expanded, isAnimating, arrayList, new ArrayList<>());
        AnimatorSet set = new AnimatorSet();
        C1024b.m5421a(set, arrayList);
        set.addListener(new C1191a(this, expanded, child));
        return set;
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C1191a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f4961a;

        /* renamed from: b */
        public final /* synthetic */ View f4962b;

        public C1191a(FabTransformationScrimBehavior this$0, boolean z, View view) {
            this.f4961a = z;
            this.f4962b = view;
        }

        public void onAnimationStart(Animator animation) {
            if (this.f4961a) {
                this.f4962b.setVisibility(0);
            }
        }

        public void onAnimationEnd(Animator animation) {
            if (!this.f4961a) {
                this.f4962b.setVisibility(4);
            }
        }
    }

    /* renamed from: K */
    public final void mo7188K(View child, boolean expanded, boolean currentlyAnimating, List<Animator> animations, List<Animator.AnimatorListener> list) {
        Animator animator;
        C1031i timing = expanded ? this.f4959c : this.f4960d;
        if (expanded) {
            if (!currentlyAnimating) {
                child.setAlpha(0.0f);
            }
            animator = ObjectAnimator.ofFloat(child, View.ALPHA, new float[]{1.0f});
        } else {
            animator = ObjectAnimator.ofFloat(child, View.ALPHA, new float[]{0.0f});
        }
        timing.mo5867a(animator);
        animations.add(animator);
    }
}
