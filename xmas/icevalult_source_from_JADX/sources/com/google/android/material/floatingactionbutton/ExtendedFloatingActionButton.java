package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import p000a.p025h.p038m.C0460r;
import p066b.p067a.p068a.p069a.C1020k;
import p066b.p067a.p068a.p069a.p070a0.C0912b;
import p066b.p067a.p068a.p069a.p081l.C1030h;
import p066b.p067a.p068a.p069a.p096z.C1116d;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.C0823b {

    /* renamed from: s */
    public final Rect f4801s;

    /* renamed from: t */
    public final C1116d f4802t;

    /* renamed from: u */
    public final C1116d f4803u;

    /* renamed from: v */
    public final C1116d f4804v;

    /* renamed from: w */
    public final C1116d f4805w;

    /* renamed from: x */
    public final CoordinatorLayout.C0824c<ExtendedFloatingActionButton> f4806x;

    /* renamed from: y */
    public boolean f4807y;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public static abstract class C1166d {
    }

    static {
        Class<Float> cls = Float.class;
        new C1164b(cls, "width");
        new C1165c(cls, "height");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4807y && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f4807y = false;
            this.f4802t.mo6367i();
        }
    }

    public CoordinatorLayout.C0824c<ExtendedFloatingActionButton> getBehavior() {
        return this.f4806x;
    }

    public void setExtended(boolean extended) {
        if (this.f4807y != extended) {
            C1116d motionStrategy = extended ? this.f4803u : this.f4802t;
            if (!motionStrategy.mo6362d()) {
                motionStrategy.mo6367i();
            }
        }
    }

    public C1030h getShowMotionSpec() {
        return this.f4804v.mo6359a();
    }

    public void setShowMotionSpec(C1030h spec) {
        this.f4804v.mo6365g(spec);
    }

    public void setShowMotionSpecResource(int id) {
        setShowMotionSpec(C1030h.m5433c(getContext(), id));
    }

    public C1030h getHideMotionSpec() {
        return this.f4805w.mo6359a();
    }

    public void setHideMotionSpec(C1030h spec) {
        this.f4805w.mo6365g(spec);
    }

    public void setHideMotionSpecResource(int id) {
        setHideMotionSpec(C1030h.m5433c(getContext(), id));
    }

    public C1030h getExtendMotionSpec() {
        return this.f4803u.mo6359a();
    }

    public void setExtendMotionSpec(C1030h spec) {
        this.f4803u.mo6365g(spec);
    }

    public void setExtendMotionSpecResource(int id) {
        setExtendMotionSpec(C1030h.m5433c(getContext(), id));
    }

    public C1030h getShrinkMotionSpec() {
        return this.f4802t.mo6359a();
    }

    public void setShrinkMotionSpec(C1030h spec) {
        this.f4802t.mo6365g(spec);
    }

    public void setShrinkMotionSpecResource(int id) {
        setShrinkMotionSpec(C1030h.m5433c(getContext(), id));
    }

    /* renamed from: m */
    public final void mo6830m(C1116d strategy, C1166d callback) {
        if (!strategy.mo6362d()) {
            if (!mo6831n()) {
                strategy.mo6367i();
                strategy.mo6360b(callback);
                return;
            }
            measure(0, 0);
            Animator animator = strategy.mo6361c();
            animator.addListener(new C1163a(this, strategy, callback));
            for (Animator.AnimatorListener l : strategy.mo6366h()) {
                animator.addListener(l);
            }
            animator.start();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public class C1163a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f4813a;

        /* renamed from: b */
        public final /* synthetic */ C1116d f4814b;

        /* renamed from: c */
        public final /* synthetic */ C1166d f4815c;

        public C1163a(ExtendedFloatingActionButton this$0, C1116d dVar, C1166d dVar2) {
            this.f4814b = dVar;
        }

        public void onAnimationStart(Animator animation) {
            this.f4814b.onAnimationStart(animation);
            this.f4813a = false;
        }

        public void onAnimationCancel(Animator animation) {
            this.f4813a = true;
            this.f4814b.mo6364f();
        }

        public void onAnimationEnd(Animator animation) {
            this.f4814b.mo6363e();
            if (!this.f4813a) {
                this.f4814b.mo6360b(this.f4815c);
            }
        }
    }

    /* renamed from: n */
    public final boolean mo6831n() {
        return C0460r.m2235J(this) && !isInEditMode();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public static class C1164b extends Property<View, Float> {
        public C1164b(Class x0, String x1) {
            super(x0, x1);
        }

        /* renamed from: b */
        public void set(View object, Float value) {
            object.getLayoutParams().width = value.intValue();
            object.requestLayout();
        }

        /* renamed from: a */
        public Float get(View object) {
            return Float.valueOf((float) object.getLayoutParams().width);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    public static class C1165c extends Property<View, Float> {
        public C1165c(Class x0, String x1) {
            super(x0, x1);
        }

        /* renamed from: b */
        public void set(View object, Float value) {
            object.getLayoutParams().height = value.intValue();
            object.requestLayout();
        }

        /* renamed from: a */
        public Float get(View object) {
            return Float.valueOf((float) object.getLayoutParams().height);
        }
    }

    public int getCollapsedSize() {
        return (Math.min(C0460r.m2226A(this), C0460r.m2296z(this)) * 2) + getIconSize();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.C0824c<T> {

        /* renamed from: a */
        public Rect f4808a;

        /* renamed from: b */
        public C1166d f4809b;

        /* renamed from: c */
        public C1166d f4810c;

        /* renamed from: d */
        public boolean f4811d;

        /* renamed from: e */
        public boolean f4812e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f4811d = false;
            this.f4812e = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray a = context.obtainStyledAttributes(attrs, C1020k.f4245j0);
            this.f4811d = a.getBoolean(C1020k.f4249k0, false);
            this.f4812e = a.getBoolean(C1020k.f4253l0, true);
            a.recycle();
        }

        /* renamed from: g */
        public void mo4420g(CoordinatorLayout.C0827f lp) {
            if (lp.f3371h == 0) {
                lp.f3371h = 80;
            }
        }

        /* renamed from: I */
        public boolean mo4421h(CoordinatorLayout parent, ExtendedFloatingActionButton child, View dependency) {
            if (dependency instanceof AppBarLayout) {
                mo6848M(parent, (AppBarLayout) dependency, child);
                return false;
            } else if (!m6223G(dependency)) {
                return false;
            } else {
                mo6849N(dependency, child);
                return false;
            }
        }

        /* renamed from: G */
        public static boolean m6223G(View view) {
            ViewGroup.LayoutParams lp = view.getLayoutParams();
            if (lp instanceof CoordinatorLayout.C0827f) {
                return ((CoordinatorLayout.C0827f) lp).mo4448f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: K */
        public final boolean mo6846K(View dependency, ExtendedFloatingActionButton child) {
            CoordinatorLayout.C0827f lp = (CoordinatorLayout.C0827f) child.getLayoutParams();
            if ((this.f4811d || this.f4812e) && lp.mo4447e() == dependency.getId()) {
                return true;
            }
            return false;
        }

        /* renamed from: M */
        public final boolean mo6848M(CoordinatorLayout parent, AppBarLayout appBarLayout, ExtendedFloatingActionButton child) {
            if (!mo6846K(appBarLayout, child)) {
                return false;
            }
            if (this.f4808a == null) {
                this.f4808a = new Rect();
            }
            Rect rect = this.f4808a;
            C0912b.m5020a(parent, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo6847L(child);
                return true;
            }
            mo6841E(child);
            return true;
        }

        /* renamed from: N */
        public final boolean mo6849N(View bottomSheet, ExtendedFloatingActionButton child) {
            if (!mo6846K(bottomSheet, child)) {
                return false;
            }
            if (bottomSheet.getTop() < (child.getHeight() / 2) + ((CoordinatorLayout.C0827f) child.getLayoutParams()).topMargin) {
                mo6847L(child);
                return true;
            }
            mo6841E(child);
            return true;
        }

        /* renamed from: L */
        public void mo6847L(ExtendedFloatingActionButton fab) {
            C1116d strategy;
            boolean z = this.f4812e;
            C1166d callback = z ? this.f4810c : this.f4809b;
            if (z) {
                strategy = fab.f4802t;
            } else {
                strategy = fab.f4805w;
            }
            fab.mo6830m(strategy, callback);
        }

        /* renamed from: E */
        public void mo6841E(ExtendedFloatingActionButton fab) {
            C1116d strategy;
            boolean z = this.f4812e;
            C1166d callback = z ? this.f4810c : this.f4809b;
            if (z) {
                strategy = fab.f4803u;
            } else {
                strategy = fab.f4804v;
            }
            fab.mo6830m(strategy, callback);
        }

        /* renamed from: J */
        public boolean mo4425l(CoordinatorLayout parent, ExtendedFloatingActionButton child, int layoutDirection) {
            List<View> dependencies = parent.mo4391r(child);
            int count = dependencies.size();
            for (int i = 0; i < count; i++) {
                View dependency = dependencies.get(i);
                if (!(dependency instanceof AppBarLayout)) {
                    if (m6223G(dependency) && mo6849N(dependency, child)) {
                        break;
                    }
                } else if (mo6848M(parent, (AppBarLayout) dependency, child)) {
                    break;
                }
            }
            parent.mo4350I(child, layoutDirection);
            mo6843H(parent, child);
            return true;
        }

        /* renamed from: F */
        public boolean mo4415b(CoordinatorLayout parent, ExtendedFloatingActionButton child, Rect rect) {
            Rect shadowPadding = child.f4801s;
            rect.set(child.getLeft() + shadowPadding.left, child.getTop() + shadowPadding.top, child.getRight() - shadowPadding.right, child.getBottom() - shadowPadding.bottom);
            return true;
        }

        /* renamed from: H */
        public final void mo6843H(CoordinatorLayout parent, ExtendedFloatingActionButton fab) {
            Rect padding = fab.f4801s;
            if (padding != null && padding.centerX() > 0 && padding.centerY() > 0) {
                CoordinatorLayout.C0827f lp = (CoordinatorLayout.C0827f) fab.getLayoutParams();
                int offsetTB = 0;
                int offsetLR = 0;
                if (fab.getRight() >= parent.getWidth() - lp.rightMargin) {
                    offsetLR = padding.right;
                } else if (fab.getLeft() <= lp.leftMargin) {
                    offsetLR = -padding.left;
                }
                if (fab.getBottom() >= parent.getHeight() - lp.bottomMargin) {
                    offsetTB = padding.bottom;
                } else if (fab.getTop() <= lp.topMargin) {
                    offsetTB = -padding.top;
                }
                if (offsetTB != 0) {
                    C0460r.m2241P(fab, offsetTB);
                }
                if (offsetLR != 0) {
                    C0460r.m2240O(fab, offsetLR);
                }
            }
        }
    }
}
