package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p000a.p025h.p038m.C0460r;
import p066b.p067a.p068a.p069a.C0943f;
import p066b.p067a.p068a.p069a.p071b0.C0925a;
import p066b.p067a.p068a.p069a.p080k0.C1021a;
import p066b.p067a.p068a.p069a.p080k0.C1022b;
import p066b.p067a.p068a.p069a.p081l.C1023a;
import p066b.p067a.p068a.p069a.p081l.C1024b;
import p066b.p067a.p068a.p069a.p081l.C1025c;
import p066b.p067a.p068a.p069a.p081l.C1026d;
import p066b.p067a.p068a.p069a.p081l.C1027e;
import p066b.p067a.p068a.p069a.p081l.C1030h;
import p066b.p067a.p068a.p069a.p081l.C1031i;
import p066b.p067a.p068a.p069a.p081l.C1032j;
import p066b.p067a.p068a.p069a.p089t.C1049a;
import p066b.p067a.p068a.p069a.p089t.C1052c;
import p066b.p067a.p068a.p069a.p089t.C1053d;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final Rect f4944c = new Rect();

    /* renamed from: d */
    public final RectF f4945d = new RectF();

    /* renamed from: e */
    public final RectF f4946e = new RectF();

    /* renamed from: f */
    public final int[] f4947f = new int[2];

    /* renamed from: g */
    public float f4948g;

    /* renamed from: h */
    public float f4949h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    public static class C1190e {

        /* renamed from: a */
        public C1030h f4957a;

        /* renamed from: b */
        public C1032j f4958b;
    }

    /* renamed from: e0 */
    public abstract C1190e mo7180e0(Context context, boolean z);

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /* renamed from: e */
    public boolean mo4418e(CoordinatorLayout parent, View child, View dependency) {
        if (child.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(dependency instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) dependency).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == child.getId()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: g */
    public void mo4420g(CoordinatorLayout.C0827f lp) {
        if (lp.f3371h == 0) {
            lp.f3371h = 80;
        }
    }

    /* renamed from: J */
    public AnimatorSet mo7158J(View dependency, View child, boolean expanded, boolean isAnimating) {
        boolean z = expanded;
        C1190e spec = mo7180e0(child.getContext(), z);
        if (z) {
            this.f4948g = dependency.getTranslationX();
            this.f4949h = dependency.getTranslationY();
        }
        List<Animator> animations = new ArrayList<>();
        List<Animator.AnimatorListener> listeners = new ArrayList<>();
        if (Build.VERSION.SDK_INT >= 21) {
            mo7173X(dependency, child, expanded, isAnimating, spec, animations, listeners);
        }
        RectF childBounds = this.f4945d;
        View view = dependency;
        View view2 = child;
        boolean z2 = expanded;
        List<Animator> list = animations;
        List<Animator.AnimatorListener> list2 = listeners;
        mo7178c0(view, view2, z2, isAnimating, spec, list, list2, childBounds);
        float childWidth = childBounds.width();
        float childHeight = childBounds.height();
        mo7172W(view, view2, z2, spec, animations);
        boolean z3 = isAnimating;
        C1190e eVar = spec;
        mo7175Z(view, view2, z2, z3, eVar, list, list2);
        mo7174Y(view, view2, z2, z3, eVar, childWidth, childHeight, animations, listeners);
        List<Animator> list3 = animations;
        List<Animator.AnimatorListener> list4 = listeners;
        mo7171V(view, view2, z2, z3, eVar, list3, list4);
        mo7170U(view, view2, z2, z3, eVar, list3, list4);
        AnimatorSet set = new AnimatorSet();
        C1024b.m5421a(set, animations);
        set.addListener(new C1186a(this, z, child, dependency));
        int count = listeners.size();
        for (int i = 0; i < count; i++) {
            set.addListener(listeners.get(i));
        }
        return set;
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public class C1186a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f4950a;

        /* renamed from: b */
        public final /* synthetic */ View f4951b;

        /* renamed from: c */
        public final /* synthetic */ View f4952c;

        public C1186a(FabTransformationBehavior this$0, boolean z, View view, View view2) {
            this.f4950a = z;
            this.f4951b = view;
            this.f4952c = view2;
        }

        public void onAnimationStart(Animator animation) {
            if (this.f4950a) {
                this.f4951b.setVisibility(0);
                this.f4952c.setAlpha(0.0f);
                this.f4952c.setVisibility(4);
            }
        }

        public void onAnimationEnd(Animator animation) {
            if (!this.f4950a) {
                this.f4951b.setVisibility(4);
                this.f4952c.setAlpha(1.0f);
                this.f4952c.setVisibility(0);
            }
        }
    }

    @TargetApi(21)
    /* renamed from: X */
    public final void mo7173X(View dependency, View child, boolean expanded, boolean currentlyAnimating, C1190e spec, List<Animator> animations, List<Animator.AnimatorListener> list) {
        Animator animator;
        float translationZ = C0460r.m2284q(child) - C0460r.m2284q(dependency);
        if (expanded) {
            if (!currentlyAnimating) {
                child.setTranslationZ(-translationZ);
            }
            animator = ObjectAnimator.ofFloat(child, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            animator = ObjectAnimator.ofFloat(child, View.TRANSLATION_Z, new float[]{-translationZ});
        }
        spec.f4957a.mo5859e("elevation").mo5867a(animator);
        animations.add(animator);
    }

    /* renamed from: W */
    public final void mo7172W(View dependency, View child, boolean expanded, C1190e spec, List<Animator> animations) {
        float translationX = mo7166Q(dependency, child, spec.f4958b);
        float translationY = mo7167R(dependency, child, spec.f4958b);
        Pair<C1031i, C1031i> N = mo7163N(translationX, translationY, expanded, spec);
        C1031i translationXTiming = (C1031i) N.first;
        C1031i translationYTiming = (C1031i) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        fArr[0] = expanded ? translationX : this.f4948g;
        ValueAnimator translationXAnimator = ObjectAnimator.ofFloat(dependency, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        fArr2[0] = expanded ? translationY : this.f4949h;
        ValueAnimator translationYAnimator = ObjectAnimator.ofFloat(dependency, property2, fArr2);
        translationXTiming.mo5867a(translationXAnimator);
        translationYTiming.mo5867a(translationYAnimator);
        animations.add(translationXAnimator);
        animations.add(translationYAnimator);
    }

    /* renamed from: c0 */
    public final void mo7178c0(View dependency, View child, boolean expanded, boolean currentlyAnimating, C1190e spec, List<Animator> animations, List<Animator.AnimatorListener> list, RectF childBounds) {
        C1031i translationXTiming;
        C1031i translationYTiming;
        ValueAnimator translationYAnimator;
        ValueAnimator translationXAnimator;
        View view = dependency;
        View view2 = child;
        boolean z = expanded;
        C1190e eVar = spec;
        List<Animator> list2 = animations;
        float translationX = mo7166Q(view, view2, eVar.f4958b);
        float translationY = mo7167R(view, view2, eVar.f4958b);
        Pair<C1031i, C1031i> N = mo7163N(translationX, translationY, z, eVar);
        C1031i translationXTiming2 = (C1031i) N.first;
        C1031i translationYTiming2 = (C1031i) N.second;
        if (z) {
            if (!currentlyAnimating) {
                view2.setTranslationX(-translationX);
                view2.setTranslationY(-translationY);
            }
            ValueAnimator translationXAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, new float[]{0.0f});
            ValueAnimator translationYAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{0.0f});
            translationYTiming = translationYTiming2;
            translationXTiming = translationXTiming2;
            float f = -translationY;
            Pair<C1031i, C1031i> pair = N;
            float f2 = translationX;
            mo7161L(child, spec, translationXTiming2, translationYTiming2, -translationX, f, 0.0f, 0.0f, childBounds);
            translationXAnimator = translationXAnimator2;
            translationYAnimator = translationYAnimator2;
            float f3 = translationY;
        } else {
            translationYTiming = translationYTiming2;
            translationXTiming = translationXTiming2;
            Pair<C1031i, C1031i> pair2 = N;
            ValueAnimator translationXAnimator3 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, new float[]{-translationX});
            translationXAnimator = translationXAnimator3;
            translationYAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{-translationY});
        }
        translationXTiming.mo5867a(translationXAnimator);
        translationYTiming.mo5867a(translationYAnimator);
        list2.add(translationXAnimator);
        list2.add(translationYAnimator);
    }

    /* renamed from: Z */
    public final void mo7175Z(View dependency, View child, boolean expanded, boolean currentlyAnimating, C1190e spec, List<Animator> animations, List<Animator.AnimatorListener> listeners) {
        ObjectAnimator animator;
        if ((child instanceof C1053d) && (dependency instanceof ImageView)) {
            C1053d circularRevealChild = (C1053d) child;
            Drawable icon = ((ImageView) dependency).getDrawable();
            if (icon != null) {
                icon.mutate();
                if (expanded) {
                    if (!currentlyAnimating) {
                        icon.setAlpha(255);
                    }
                    animator = ObjectAnimator.ofInt(icon, C1027e.f4319b, new int[]{0});
                } else {
                    animator = ObjectAnimator.ofInt(icon, C1027e.f4319b, new int[]{255});
                }
                animator.addUpdateListener(new C1187b(this, child));
                spec.f4957a.mo5859e("iconFade").mo5867a(animator);
                animations.add(animator);
                listeners.add(new C1188c(this, circularRevealChild, icon));
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public class C1187b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f4953a;

        public C1187b(FabTransformationBehavior this$0, View view) {
            this.f4953a = view;
        }

        public void onAnimationUpdate(ValueAnimator animation) {
            this.f4953a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    public class C1188c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1053d f4954a;

        /* renamed from: b */
        public final /* synthetic */ Drawable f4955b;

        public C1188c(FabTransformationBehavior this$0, C1053d dVar, Drawable drawable) {
            this.f4954a = dVar;
            this.f4955b = drawable;
        }

        public void onAnimationStart(Animator animation) {
            this.f4954a.setCircularRevealOverlayDrawable(this.f4955b);
        }

        public void onAnimationEnd(Animator animation) {
            this.f4954a.setCircularRevealOverlayDrawable((Drawable) null);
        }
    }

    /* renamed from: Y */
    public final void mo7174Y(View dependency, View child, boolean expanded, boolean currentlyAnimating, C1190e spec, float childWidth, float childHeight, List<Animator> animations, List<Animator.AnimatorListener> listeners) {
        C1053d circularRevealChild;
        C1031i timing;
        Animator animator;
        View view = dependency;
        View view2 = child;
        C1190e eVar = spec;
        if (view2 instanceof C1053d) {
            C1053d circularRevealChild2 = (C1053d) view2;
            float revealCenterX = mo7164O(view, view2, eVar.f4958b);
            float revealCenterY = mo7165P(view, view2, eVar.f4958b);
            ((FloatingActionButton) view).mo6882i(this.f4944c);
            float dependencyRadius = ((float) this.f4944c.width()) / 2.0f;
            C1031i timing2 = eVar.f4957a.mo5859e("expansion");
            if (expanded) {
                if (!currentlyAnimating) {
                    circularRevealChild2.setRevealInfo(new C1053d.C1058e(revealCenterX, revealCenterY, dependencyRadius));
                }
                float fromRadius = currentlyAnimating ? circularRevealChild2.getRevealInfo().f4467c : dependencyRadius;
                float toRadius = C0925a.m5061b(revealCenterX, revealCenterY, 0.0f, 0.0f, childWidth, childHeight);
                Animator animator2 = C1049a.m5695a(circularRevealChild2, revealCenterX, revealCenterY, toRadius);
                animator2.addListener(new C1189d(this, circularRevealChild2));
                Animator animator3 = animator2;
                float f = toRadius;
                timing = timing2;
                mo7177b0(child, timing2.mo5868c(), (int) revealCenterX, (int) revealCenterY, fromRadius, animations);
                float f2 = dependencyRadius;
                float f3 = revealCenterY;
                float f4 = revealCenterX;
                circularRevealChild = circularRevealChild2;
                animator = animator3;
            } else {
                timing = timing2;
                float fromRadius2 = circularRevealChild2.getRevealInfo().f4467c;
                float toRadius2 = dependencyRadius;
                Animator animator4 = C1049a.m5695a(circularRevealChild2, revealCenterX, revealCenterY, toRadius2);
                float f5 = fromRadius2;
                mo7177b0(child, timing.mo5868c(), (int) revealCenterX, (int) revealCenterY, fromRadius2, animations);
                float f6 = dependencyRadius;
                int i = (int) revealCenterX;
                float f7 = revealCenterY;
                int i2 = (int) revealCenterY;
                float f8 = revealCenterX;
                circularRevealChild = circularRevealChild2;
                mo7176a0(child, timing.mo5868c(), timing.mo5869d(), eVar.f4957a.mo5861f(), i, i2, toRadius2, animations);
                animator = animator4;
            }
            timing.mo5867a(animator);
            animations.add(animator);
            listeners.add(C1049a.m5696b(circularRevealChild));
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    public class C1189d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1053d f4956a;

        public C1189d(FabTransformationBehavior this$0, C1053d dVar) {
            this.f4956a = dVar;
        }

        public void onAnimationEnd(Animator animation) {
            C1053d.C1058e revealInfo = this.f4956a.getRevealInfo();
            revealInfo.f4467c = Float.MAX_VALUE;
            this.f4956a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: V */
    public final void mo7171V(View dependency, View child, boolean expanded, boolean currentlyAnimating, C1190e spec, List<Animator> animations, List<Animator.AnimatorListener> list) {
        ObjectAnimator animator;
        if (child instanceof C1053d) {
            C1053d circularRevealChild = (C1053d) child;
            int tint = mo7179d0(dependency);
            int transparent = 16777215 & tint;
            if (expanded) {
                if (!currentlyAnimating) {
                    circularRevealChild.setCircularRevealScrimColor(tint);
                }
                animator = ObjectAnimator.ofInt(circularRevealChild, C1053d.C1057d.f4464a, new int[]{transparent});
            } else {
                animator = ObjectAnimator.ofInt(circularRevealChild, C1053d.C1057d.f4464a, new int[]{tint});
            }
            animator.setEvaluator(C1025c.m5422b());
            spec.f4957a.mo5859e("color").mo5867a(animator);
            animations.add(animator);
        }
    }

    /* renamed from: U */
    public final void mo7170U(View unusedDependency, View child, boolean expanded, boolean currentlyAnimating, C1190e spec, List<Animator> animations, List<Animator.AnimatorListener> list) {
        ViewGroup childContentContainer;
        Animator animator;
        if (child instanceof ViewGroup) {
            if ((!(child instanceof C1053d) || C1052c.f4460a != 0) && (childContentContainer = mo7160K(child)) != null) {
                if (expanded) {
                    if (!currentlyAnimating) {
                        C1026d.f4318a.set(childContentContainer, Float.valueOf(0.0f));
                    }
                    animator = ObjectAnimator.ofFloat(childContentContainer, C1026d.f4318a, new float[]{1.0f});
                } else {
                    animator = ObjectAnimator.ofFloat(childContentContainer, C1026d.f4318a, new float[]{0.0f});
                }
                spec.f4957a.mo5859e("contentFade").mo5867a(animator);
                animations.add(animator);
            }
        }
    }

    /* renamed from: N */
    public final Pair<C1031i, C1031i> mo7163N(float translationX, float translationY, boolean expanded, C1190e spec) {
        C1031i translationYTiming;
        C1031i translationXTiming;
        if (translationX == 0.0f || translationY == 0.0f) {
            translationXTiming = spec.f4957a.mo5859e("translationXLinear");
            translationYTiming = spec.f4957a.mo5859e("translationYLinear");
        } else if ((!expanded || translationY >= 0.0f) && (expanded || translationY <= 0.0f)) {
            translationXTiming = spec.f4957a.mo5859e("translationXCurveDownwards");
            translationYTiming = spec.f4957a.mo5859e("translationYCurveDownwards");
        } else {
            translationXTiming = spec.f4957a.mo5859e("translationXCurveUpwards");
            translationYTiming = spec.f4957a.mo5859e("translationYCurveUpwards");
        }
        return new Pair<>(translationXTiming, translationYTiming);
    }

    /* renamed from: Q */
    public final float mo7166Q(View dependency, View child, C1032j positioning) {
        RectF dependencyBounds = this.f4945d;
        RectF childBounds = this.f4946e;
        mo7162M(dependency, dependencyBounds);
        mo7169T(child, childBounds);
        float translationX = 0.0f;
        int i = positioning.f4332a & 7;
        if (i == 1) {
            translationX = childBounds.centerX() - dependencyBounds.centerX();
        } else if (i == 3) {
            translationX = childBounds.left - dependencyBounds.left;
        } else if (i == 5) {
            translationX = childBounds.right - dependencyBounds.right;
        }
        return translationX + positioning.f4333b;
    }

    /* renamed from: R */
    public final float mo7167R(View dependency, View child, C1032j positioning) {
        RectF dependencyBounds = this.f4945d;
        RectF childBounds = this.f4946e;
        mo7162M(dependency, dependencyBounds);
        mo7169T(child, childBounds);
        float translationY = 0.0f;
        int i = positioning.f4332a & 112;
        if (i == 16) {
            translationY = childBounds.centerY() - dependencyBounds.centerY();
        } else if (i == 48) {
            translationY = childBounds.top - dependencyBounds.top;
        } else if (i == 80) {
            translationY = childBounds.bottom - dependencyBounds.bottom;
        }
        return translationY + positioning.f4334c;
    }

    /* renamed from: T */
    public final void mo7169T(View view, RectF rect) {
        RectF windowBounds = rect;
        windowBounds.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] windowLocation = this.f4947f;
        view.getLocationInWindow(windowLocation);
        windowBounds.offsetTo((float) windowLocation[0], (float) windowLocation[1]);
        windowBounds.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: M */
    public final void mo7162M(View view, RectF rect) {
        mo7169T(view, rect);
        rect.offset(this.f4948g, this.f4949h);
    }

    /* renamed from: O */
    public final float mo7164O(View dependency, View child, C1032j positioning) {
        RectF dependencyBounds = this.f4945d;
        RectF childBounds = this.f4946e;
        mo7162M(dependency, dependencyBounds);
        mo7169T(child, childBounds);
        childBounds.offset(-mo7166Q(dependency, child, positioning), 0.0f);
        return dependencyBounds.centerX() - childBounds.left;
    }

    /* renamed from: P */
    public final float mo7165P(View dependency, View child, C1032j positioning) {
        RectF dependencyBounds = this.f4945d;
        RectF childBounds = this.f4946e;
        mo7162M(dependency, dependencyBounds);
        mo7169T(child, childBounds);
        childBounds.offset(0.0f, -mo7167R(dependency, child, positioning));
        return dependencyBounds.centerY() - childBounds.top;
    }

    /* renamed from: L */
    public final void mo7161L(View child, C1190e spec, C1031i translationXTiming, C1031i translationYTiming, float fromX, float fromY, float toX, float toY, RectF childBounds) {
        float translationX = mo7168S(spec, translationXTiming, fromX, toX);
        float translationY = mo7168S(spec, translationYTiming, fromY, toY);
        Rect window = this.f4944c;
        child.getWindowVisibleDisplayFrame(window);
        RectF windowF = this.f4945d;
        windowF.set(window);
        RectF childVisibleBounds = this.f4946e;
        mo7169T(child, childVisibleBounds);
        childVisibleBounds.offset(translationX, translationY);
        childVisibleBounds.intersect(windowF);
        childBounds.set(childVisibleBounds);
    }

    /* renamed from: S */
    public final float mo7168S(C1190e spec, C1031i timing, float from, float to) {
        long delay = timing.mo5868c();
        long duration = timing.mo5869d();
        C1031i expansionTiming = spec.f4957a.mo5859e("expansion");
        return C1023a.m5420a(from, to, timing.mo5870e().getInterpolation(((float) (((expansionTiming.mo5868c() + expansionTiming.mo5869d()) + 17) - delay)) / ((float) duration)));
    }

    /* renamed from: K */
    public final ViewGroup mo7160K(View view) {
        View childContentContainer = view.findViewById(C0943f.mtrl_child_content_container);
        if (childContentContainer != null) {
            return mo7181f0(childContentContainer);
        }
        if ((view instanceof C1022b) || (view instanceof C1021a)) {
            return mo7181f0(((ViewGroup) view).getChildAt(0));
        }
        return mo7181f0(view);
    }

    /* renamed from: f0 */
    public final ViewGroup mo7181f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* renamed from: d0 */
    public final int mo7179d0(View view) {
        ColorStateList tintList = C0460r.m2276m(view);
        if (tintList != null) {
            return tintList.getColorForState(view.getDrawableState(), tintList.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: b0 */
    public final void mo7177b0(View child, long delay, int revealCenterX, int revealCenterY, float fromRadius, List<Animator> animations) {
        if (Build.VERSION.SDK_INT >= 21 && delay > 0) {
            Animator animator = ViewAnimationUtils.createCircularReveal(child, revealCenterX, revealCenterY, fromRadius, fromRadius);
            animator.setStartDelay(0);
            animator.setDuration(delay);
            animations.add(animator);
        }
    }

    /* renamed from: a0 */
    public final void mo7176a0(View child, long delay, long duration, long totalDuration, int revealCenterX, int revealCenterY, float toRadius, List<Animator> animations) {
        if (Build.VERSION.SDK_INT >= 21 && delay + duration < totalDuration) {
            Animator animator = ViewAnimationUtils.createCircularReveal(child, revealCenterX, revealCenterY, toRadius, toRadius);
            animator.setStartDelay(delay + duration);
            animator.setDuration(totalDuration - (delay + duration));
            animations.add(animator);
        }
    }
}
