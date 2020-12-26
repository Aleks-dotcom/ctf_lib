package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p025h.p038m.C0460r;
import p000a.p043j.p044a.C0501a;
import p066b.p067a.p068a.p069a.C0928d;
import p066b.p067a.p068a.p069a.p076g0.C0953g;
import p066b.p067a.p068a.p069a.p076g0.C0957h;
import p066b.p067a.p068a.p069a.p081l.C1033k;
import p066b.p067a.p068a.p069a.p083n.C1040a;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.C0823b {

    /* renamed from: Q */
    public final int f4667Q;

    /* renamed from: R */
    public final C0953g f4668R;

    /* renamed from: S */
    public Animator f4669S;

    /* renamed from: T */
    public Animator f4670T;

    /* renamed from: U */
    public int f4671U;

    /* renamed from: V */
    public int f4672V;

    /* renamed from: W */
    public boolean f4673W;

    /* renamed from: a0 */
    public int f4674a0;

    /* renamed from: b0 */
    public ArrayList<C1141f> f4675b0;

    /* renamed from: c0 */
    public boolean f4676c0;

    /* renamed from: d0 */
    public Behavior f4677d0;

    /* renamed from: e0 */
    public int f4678e0;

    /* renamed from: f0 */
    public AnimatorListenerAdapter f4679f0;

    /* renamed from: g0 */
    public C1033k<FloatingActionButton> f4680g0;

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    public interface C1141f {
        /* renamed from: a */
        void mo6528a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void mo6529b(BottomAppBar bottomAppBar);
    }

    public int getFabAlignmentMode() {
        return this.f4671U;
    }

    public void setFabAlignmentMode(int fabAlignmentMode) {
        mo6502m0(fabAlignmentMode);
        mo6501l0(fabAlignmentMode, this.f4676c0);
        this.f4671U = fabAlignmentMode;
    }

    public int getFabAnimationMode() {
        return this.f4672V;
    }

    public void setFabAnimationMode(int fabAnimationMode) {
        this.f4672V = fabAnimationMode;
    }

    public void setBackgroundTint(ColorStateList backgroundTint) {
        C0370a.m1945o(this.f4668R, backgroundTint);
    }

    public ColorStateList getBackgroundTint() {
        return this.f4668R.mo5573D();
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().mo5906c();
    }

    public void setFabCradleMargin(float cradleMargin) {
        if (cradleMargin != getFabCradleMargin()) {
            getTopEdgeTreatment().mo5910g(cradleMargin);
            this.f4668R.invalidateSelf();
        }
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().mo5907d();
    }

    public void setFabCradleRoundedCornerRadius(float roundedCornerRadius) {
        if (roundedCornerRadius != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().mo5911h(roundedCornerRadius);
            this.f4668R.invalidateSelf();
        }
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().mo5905b();
    }

    public void setCradleVerticalOffset(float verticalOffset) {
        if (verticalOffset != getCradleVerticalOffset()) {
            getTopEdgeTreatment().mo5909f(verticalOffset);
            this.f4668R.invalidateSelf();
            mo6504o0();
        }
    }

    public boolean getHideOnScroll() {
        return this.f4673W;
    }

    public void setHideOnScroll(boolean hide) {
        this.f4673W = hide;
    }

    public void setElevation(float elevation) {
        this.f4668R.mo5587S(elevation);
        getBehavior().mo6469G(this, this.f4668R.mo5570A() - this.f4668R.mo5633z());
    }

    /* renamed from: f0 */
    public final void mo6488f0() {
        ArrayList<C1141f> arrayList;
        int i = this.f4674a0;
        this.f4674a0 = i + 1;
        if (i == 0 && (arrayList = this.f4675b0) != null) {
            Iterator<C1141f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo6528a(this);
            }
        }
    }

    /* renamed from: e0 */
    public final void mo6487e0() {
        ArrayList<C1141f> arrayList;
        int i = this.f4674a0 - 1;
        this.f4674a0 = i;
        if (i == 0 && (arrayList = this.f4675b0) != null) {
            Iterator<C1141f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo6529b(this);
            }
        }
    }

    /* renamed from: p0 */
    public boolean mo6506p0(int diameter) {
        if (((float) diameter) == getTopEdgeTreatment().mo5908e()) {
            return false;
        }
        getTopEdgeTreatment().mo5912i((float) diameter);
        this.f4668R.invalidateSelf();
        return true;
    }

    /* renamed from: m0 */
    public final void mo6502m0(int targetMode) {
        if (this.f4671U != targetMode && C0460r.m2235J(this)) {
            Animator animator = this.f4669S;
            if (animator != null) {
                animator.cancel();
            }
            List<Animator> animators = new ArrayList<>();
            if (this.f4672V == 1) {
                mo6485c0(targetMode, animators);
            } else {
                mo6484b0(targetMode, animators);
            }
            AnimatorSet set = new AnimatorSet();
            set.playTogether(animators);
            this.f4669S = set;
            set.addListener(new C1135a());
            this.f4669S.start();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public class C1135a extends AnimatorListenerAdapter {
        public C1135a() {
        }

        public void onAnimationStart(Animator animation) {
            BottomAppBar.this.mo6488f0();
        }

        public void onAnimationEnd(Animator animation) {
            BottomAppBar.this.mo6487e0();
        }
    }

    /* renamed from: g0 */
    public final FloatingActionButton mo6489g0() {
        View view = mo6497h0();
        if (view instanceof FloatingActionButton) {
            return (FloatingActionButton) view;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo6497h0() {
        /*
            r5 = this;
            android.view.ViewParent r0 = r5.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r5.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.mo4394s(r5)
            java.util.Iterator r2 = r0.iterator()
        L_0x0018:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x002f
            java.lang.Object r3 = r2.next()
            android.view.View r3 = (android.view.View) r3
            boolean r4 = r3 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r4 != 0) goto L_0x002e
            boolean r4 = r3 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r4 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            goto L_0x0018
        L_0x002e:
            return r3
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.mo6497h0():android.view.View");
    }

    /* renamed from: k0 */
    public final boolean mo6500k0() {
        FloatingActionButton fab = mo6489g0();
        return fab != null && fab.mo6889o();
    }

    /* renamed from: b0 */
    public void mo6484b0(int targetMode, List<Animator> list) {
        FloatingActionButton fab = mo6489g0();
        if (fab != null && !fab.mo6888n()) {
            mo6488f0();
            fab.mo6886l(new C1136b(targetMode));
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    public class C1136b extends FloatingActionButton.C1168b {

        /* renamed from: a */
        public final /* synthetic */ int f4687a;

        public C1136b(int i) {
            this.f4687a = i;
        }

        /* renamed from: a */
        public void mo6521a(FloatingActionButton fab) {
            fab.setTranslationX(BottomAppBar.this.mo6499j0(this.f4687a));
            fab.mo6898s(new C1137a());
        }

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        public class C1137a extends FloatingActionButton.C1168b {
            public C1137a() {
            }

            /* renamed from: b */
            public void mo6522b(FloatingActionButton fab) {
                BottomAppBar.this.mo6487e0();
            }
        }
    }

    /* renamed from: c0 */
    public final void mo6485c0(int targetMode, List<Animator> animators) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(mo6489g0(), "translationX", new float[]{mo6499j0(targetMode)});
        animator.setDuration(300);
        animators.add(animator);
    }

    /* renamed from: l0 */
    public final void mo6501l0(int targetMode, boolean newFabAttached) {
        if (C0460r.m2235J(this)) {
            Animator animator = this.f4670T;
            if (animator != null) {
                animator.cancel();
            }
            List<Animator> animators = new ArrayList<>();
            if (!mo6500k0()) {
                targetMode = 0;
                newFabAttached = false;
            }
            mo6486d0(targetMode, newFabAttached, animators);
            AnimatorSet set = new AnimatorSet();
            set.playTogether(animators);
            this.f4670T = set;
            set.addListener(new C1138c());
            this.f4670T.start();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    public class C1138c extends AnimatorListenerAdapter {
        public C1138c() {
        }

        public void onAnimationStart(Animator animation) {
            BottomAppBar.this.mo6488f0();
        }

        public void onAnimationEnd(Animator animation) {
            BottomAppBar.this.mo6487e0();
            Animator unused = BottomAppBar.this.f4670T = null;
        }
    }

    /* renamed from: d0 */
    public final void mo6486d0(int targetMode, boolean targetAttached, List<Animator> animators) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            Animator fadeIn = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo6498i0(actionMenuView, targetMode, targetAttached))) > 1.0f) {
                Animator fadeOut = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                fadeOut.addListener(new C1139d(actionMenuView, targetMode, targetAttached));
                AnimatorSet set = new AnimatorSet();
                set.setDuration(150);
                set.playSequentially(new Animator[]{fadeOut, fadeIn});
                animators.add(set);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                animators.add(fadeIn);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    public class C1139d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f4691a;

        /* renamed from: b */
        public final /* synthetic */ ActionMenuView f4692b;

        /* renamed from: c */
        public final /* synthetic */ int f4693c;

        /* renamed from: d */
        public final /* synthetic */ boolean f4694d;

        public C1139d(ActionMenuView actionMenuView, int i, boolean z) {
            this.f4692b = actionMenuView;
            this.f4693c = i;
            this.f4694d = z;
        }

        public void onAnimationCancel(Animator animation) {
            this.f4691a = true;
        }

        public void onAnimationEnd(Animator animation) {
            if (!this.f4691a) {
                BottomAppBar.this.mo6507q0(this.f4692b, this.f4693c, this.f4694d);
            }
        }
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().mo5905b();
    }

    /* renamed from: j0 */
    public final float mo6499j0(int fabAlignmentMode) {
        int i = 1;
        boolean isRtl = C0460r.m2292v(this) == 1;
        if (fabAlignmentMode != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.f4667Q;
        if (isRtl) {
            i = -1;
        }
        return (float) (measuredWidth * i);
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return mo6499j0(this.f4671U);
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View view = getChildAt(i);
            if (view instanceof ActionMenuView) {
                return (ActionMenuView) view;
            }
        }
        return null;
    }

    /* renamed from: q0 */
    public final void mo6507q0(ActionMenuView actionMenuView, int fabAlignmentMode, boolean fabAttached) {
        actionMenuView.setTranslationX((float) mo6498i0(actionMenuView, fabAlignmentMode, fabAttached));
    }

    /* renamed from: i0 */
    public int mo6498i0(ActionMenuView actionMenuView, int fabAlignmentMode, boolean fabAttached) {
        int i;
        boolean isRtl = C0460r.m2292v(this) == 1;
        int toolbarLeftContentEnd = isRtl ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View view = getChildAt(i2);
            if ((view.getLayoutParams() instanceof Toolbar.C0815e) && (((Toolbar.C0815e) view.getLayoutParams()).f238a & 8388615) == 8388611) {
                if (isRtl) {
                    i = Math.min(toolbarLeftContentEnd, view.getLeft());
                } else {
                    i = Math.max(toolbarLeftContentEnd, view.getRight());
                }
                toolbarLeftContentEnd = i;
            }
        }
        int offset = toolbarLeftContentEnd - (isRtl ? actionMenuView.getRight() : actionMenuView.getLeft());
        if (fabAlignmentMode != 1 || !fabAttached) {
            return 0;
        }
        return offset;
    }

    /* renamed from: a0 */
    public final void mo6483a0() {
        Animator animator = this.f4670T;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f4669S;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        if (changed) {
            mo6483a0();
            mo6504o0();
        }
        mo6503n0();
    }

    private C1040a getTopEdgeTreatment() {
        return (C1040a) this.f4668R.mo5571B().mo5648p();
    }

    /* renamed from: o0 */
    public final void mo6504o0() {
        getTopEdgeTreatment().mo5913j(getFabTranslationX());
        View fab = mo6497h0();
        this.f4668R.mo5589U((!this.f4676c0 || !mo6500k0()) ? 0.0f : 1.0f);
        if (fab != null) {
            fab.setTranslationY(getFabTranslationY());
            fab.setTranslationX(getFabTranslationX());
        }
    }

    /* renamed from: n0 */
    public final void mo6503n0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!mo6500k0()) {
                mo6507q0(actionMenuView, 0, false);
            } else {
                mo6507q0(actionMenuView, this.f4671U, this.f4676c0);
            }
        }
    }

    /* renamed from: Z */
    public final void mo6482Z(FloatingActionButton fab) {
        fab.mo6862e(this.f4679f0);
        fab.mo6863f(new C1140e());
        fab.mo6864g(this.f4680g0);
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    public class C1140e extends AnimatorListenerAdapter {
        public C1140e() {
        }

        public void onAnimationStart(Animator animation) {
            BottomAppBar.this.f4679f0.onAnimationStart(animation);
            FloatingActionButton fab = BottomAppBar.this.mo6489g0();
            if (fab != null) {
                fab.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f4678e0;
    }

    public void setTitle(CharSequence title) {
    }

    public void setSubtitle(CharSequence subtitle) {
    }

    public Behavior getBehavior() {
        if (this.f4677d0 == null) {
            this.f4677d0 = new Behavior();
        }
        return this.f4677d0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0957h.m5179f(this, this.f4668R);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        public final Rect f4681e = new Rect();

        /* renamed from: f */
        public WeakReference<BottomAppBar> f4682f;

        /* renamed from: g */
        public int f4683g;

        /* renamed from: h */
        public final View.OnLayoutChangeListener f4684h = new C1134a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class C1134a implements View.OnLayoutChangeListener {
            public C1134a() {
            }

            public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                View view = v;
                BottomAppBar child = (BottomAppBar) Behavior.this.f4682f.get();
                if (child == null || !(view instanceof FloatingActionButton)) {
                    v.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton fab = (FloatingActionButton) view;
                fab.mo6883j(Behavior.this.f4681e);
                int height = Behavior.this.f4681e.height();
                child.mo6506p0(height);
                CoordinatorLayout.C0827f fabLayoutParams = (CoordinatorLayout.C0827f) v.getLayoutParams();
                if (Behavior.this.f4683g == 0) {
                    int bottomMargin = child.getResources().getDimensionPixelOffset(C0928d.mtrl_bottomappbar_fab_bottom_margin);
                    fabLayoutParams.bottomMargin = child.getBottomInset() + (bottomMargin - ((fab.getMeasuredHeight() - height) / 2));
                }
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        /* renamed from: M */
        public boolean mo4425l(CoordinatorLayout parent, BottomAppBar child, int layoutDirection) {
            this.f4682f = new WeakReference<>(child);
            View dependentView = child.mo6497h0();
            if (dependentView != null && !C0460r.m2235J(dependentView)) {
                CoordinatorLayout.C0827f fabLayoutParams = (CoordinatorLayout.C0827f) dependentView.getLayoutParams();
                fabLayoutParams.f3367d = 49;
                this.f4683g = fabLayoutParams.bottomMargin;
                if (dependentView instanceof FloatingActionButton) {
                    FloatingActionButton fab = (FloatingActionButton) dependentView;
                    fab.addOnLayoutChangeListener(this.f4684h);
                    child.mo6482Z(fab);
                }
                child.mo6504o0();
            }
            parent.mo4350I(child, layoutDirection);
            return super.mo4425l(parent, child, layoutDirection);
        }

        /* renamed from: N */
        public boolean mo4410A(CoordinatorLayout coordinatorLayout, BottomAppBar child, View directTargetChild, View target, int axes, int type) {
            return child.getHideOnScroll() && super.mo4410A(coordinatorLayout, child, directTargetChild, target, axes, type);
        }
    }

    public Parcelable onSaveInstanceState() {
        C1142g savedState = new C1142g(super.onSaveInstanceState());
        savedState.f4697d = this.f4671U;
        savedState.f4698e = this.f4676c0;
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof C1142g)) {
            super.onRestoreInstanceState(state);
            return;
        }
        C1142g savedState = (C1142g) state;
        super.onRestoreInstanceState(savedState.mo2682f());
        this.f4671U = savedState.f4697d;
        this.f4676c0 = savedState.f4698e;
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    public static class C1142g extends C0501a {
        public static final Parcelable.Creator<C1142g> CREATOR = new C1143a();

        /* renamed from: d */
        public int f4697d;

        /* renamed from: e */
        public boolean f4698e;

        public C1142g(Parcelable superState) {
            super(superState);
        }

        public C1142g(Parcel in, ClassLoader loader) {
            super(in, loader);
            this.f4697d = in.readInt();
            this.f4698e = in.readInt() != 0;
        }

        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f4697d);
            out.writeInt(this.f4698e ? 1 : 0);
        }

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g$a */
        public static class C1143a implements Parcelable.ClassLoaderCreator<C1142g> {
            /* renamed from: b */
            public C1142g createFromParcel(Parcel in, ClassLoader loader) {
                return new C1142g(in, loader);
            }

            /* renamed from: a */
            public C1142g createFromParcel(Parcel in) {
                return new C1142g(in, (ClassLoader) null);
            }

            /* renamed from: c */
            public C1142g[] newArray(int size) {
                return new C1142g[size];
            }
        }
    }
}
