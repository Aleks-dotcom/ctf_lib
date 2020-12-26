package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.List;
import p000a.p002b.p004l.p005a.C0053a;
import p000a.p025h.p029f.p030j.C0370a;
import p000a.p025h.p033h.C0379a;
import p000a.p025h.p038m.C0451i;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.C0479z;
import p000a.p043j.p044a.C0501a;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.C0928d;
import p066b.p067a.p068a.p069a.C0946g;
import p066b.p067a.p068a.p069a.C1020k;
import p066b.p067a.p068a.p069a.p076g0.C0953g;
import p066b.p067a.p068a.p069a.p076g0.C0957h;
import p066b.p067a.p068a.p069a.p081l.C1023a;
import p066b.p067a.p068a.p069a.p082m.C1034a;
import p066b.p067a.p068a.p069a.p082m.C1036b;
import p066b.p067a.p068a.p069a.p082m.C1039e;

@CoordinatorLayout.C0825d(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: b */
    public int f4611b;

    /* renamed from: c */
    public int f4612c;

    /* renamed from: d */
    public int f4613d;

    /* renamed from: e */
    public int f4614e;

    /* renamed from: f */
    public boolean f4615f;

    /* renamed from: g */
    public int f4616g;

    /* renamed from: h */
    public C0479z f4617h;

    /* renamed from: i */
    public List<C1128b> f4618i;

    /* renamed from: j */
    public boolean f4619j;

    /* renamed from: k */
    public boolean f4620k;

    /* renamed from: l */
    public boolean f4621l;

    /* renamed from: m */
    public boolean f4622m;

    /* renamed from: n */
    public int f4623n;

    /* renamed from: o */
    public WeakReference<View> f4624o;

    /* renamed from: p */
    public ValueAnimator f4625p;

    /* renamed from: q */
    public int[] f4626q;

    /* renamed from: r */
    public Drawable f4627r;

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public interface C1128b<T extends AppBarLayout> {
        /* renamed from: a */
        void mo6461a(T t, int i);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f4627r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f4627r = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f4627r.setState(getDrawableState());
                }
                C0370a.m1943m(this.f4627r, C0460r.m2292v(this));
                this.f4627r.setVisible(getVisibility() == 0, false);
                this.f4627r.setCallback(this);
            }
            mo6425u();
            C0460r.m2246U(this);
        }
    }

    public void setStatusBarForegroundColor(int color) {
        setStatusBarForeground(new ColorDrawable(color));
    }

    public void setStatusBarForegroundResource(int resId) {
        setStatusBarForeground(C0053a.m277d(getContext(), resId));
    }

    public Drawable getStatusBarForeground() {
        return this.f4627r;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (mo6411q()) {
            int saveCount = canvas.save();
            canvas.translate(0.0f, (float) (-this.f4611b));
            this.f4627r.draw(canvas);
            canvas.restoreToCount(saveCount);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] state = getDrawableState();
        Drawable d = this.f4627r;
        if (d != null && d.isStateful() && d.setState(state)) {
            invalidateDrawable(d);
        }
    }

    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who == this.f4627r;
    }

    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        boolean visible = visibility == 0;
        Drawable drawable = this.f4627r;
        if (drawable != null) {
            drawable.setVisible(visible, false);
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (heightMode != 1073741824 && C0460r.m2288s(this) && mo6413s()) {
            int newHeight = getMeasuredHeight();
            if (heightMode == Integer.MIN_VALUE) {
                newHeight = C0379a.m1963b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(heightMeasureSpec));
            } else if (heightMode == 0) {
                newHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), newHeight);
        }
        mo6398i();
    }

    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        boolean z = true;
        if (C0460r.m2288s(this) && mo6413s()) {
            int topInset = getTopInset();
            for (int z2 = getChildCount() - 1; z2 >= 0; z2--) {
                C0460r.m2241P(getChildAt(z2), topInset);
            }
        }
        mo6398i();
        this.f4615f = false;
        int i = 0;
        int z3 = getChildCount();
        while (true) {
            if (i >= z3) {
                break;
            } else if (((C1129c) getChildAt(i).getLayoutParams()).mo6463b() != null) {
                this.f4615f = true;
                break;
            } else {
                i++;
            }
        }
        Drawable drawable = this.f4627r;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f4619j) {
            if (!this.f4622m && !mo6383g()) {
                z = false;
            }
            mo6404o(z);
        }
    }

    /* renamed from: u */
    public final void mo6425u() {
        setWillNotDraw(!mo6411q());
    }

    /* renamed from: q */
    public final boolean mo6411q() {
        return this.f4627r != null && getTopInset() > 0;
    }

    /* renamed from: g */
    public final boolean mo6383g() {
        int z = getChildCount();
        for (int i = 0; i < z; i++) {
            if (((C1129c) getChildAt(i).getLayoutParams()).mo6464c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void mo6398i() {
        this.f4612c = -1;
        this.f4613d = -1;
        this.f4614e = -1;
    }

    public void setOrientation(int orientation) {
        if (orientation == 1) {
            super.setOrientation(orientation);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0957h.m5178e(this);
    }

    public void setElevation(float elevation) {
        super.setElevation(elevation);
        C0957h.m5177d(this, elevation);
    }

    public void setExpanded(boolean expanded) {
        mo6402m(expanded, C0460r.m2235J(this));
    }

    /* renamed from: m */
    public void mo6402m(boolean expanded, boolean animate) {
        mo6403n(expanded, animate, true);
    }

    /* renamed from: n */
    public final void mo6403n(boolean expanded, boolean animate, boolean force) {
        int i = 0;
        int i2 = (expanded ? 1 : 2) | (animate ? 4 : 0);
        if (force) {
            i = 8;
        }
        this.f4616g = i2 | i;
        requestLayout();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof C1129c;
    }

    /* renamed from: c */
    public C1129c generateDefaultLayoutParams() {
        return new C1129c(-1, -2);
    }

    /* renamed from: d */
    public C1129c generateLayoutParams(AttributeSet attrs) {
        return new C1129c(getContext(), attrs);
    }

    /* renamed from: e */
    public C1129c generateLayoutParams(ViewGroup.LayoutParams p) {
        if (Build.VERSION.SDK_INT >= 19 && (p instanceof LinearLayout.LayoutParams)) {
            return new C1129c((LinearLayout.LayoutParams) p);
        }
        if (p instanceof ViewGroup.MarginLayoutParams) {
            return new C1129c((ViewGroup.MarginLayoutParams) p);
        }
        return new C1129c(p);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo6374a();
    }

    /* renamed from: f */
    public boolean mo6382f() {
        return this.f4615f;
    }

    public final int getTotalScrollRange() {
        int i = this.f4612c;
        if (i != -1) {
            return i;
        }
        int range = 0;
        int i2 = 0;
        int z = getChildCount();
        while (true) {
            if (i2 >= z) {
                break;
            }
            View child = getChildAt(i2);
            C1129c lp = (C1129c) child.getLayoutParams();
            int childHeight = child.getMeasuredHeight();
            int flags = lp.f4643a;
            if ((flags & 1) == 0) {
                break;
            }
            range += lp.topMargin + childHeight + lp.bottomMargin;
            if (i2 == 0 && C0460r.m2288s(child)) {
                range -= getTopInset();
            }
            if ((flags & 2) != 0) {
                range -= C0460r.m2293w(child);
                break;
            }
            i2++;
        }
        int max = Math.max(0, range);
        this.f4612c = max;
        return max;
    }

    /* renamed from: h */
    public boolean mo6397h() {
        return getTotalScrollRange() != 0;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public int getDownNestedPreScrollRange() {
        int childRange;
        int i = this.f4613d;
        if (i != -1) {
            return i;
        }
        int range = 0;
        for (int i2 = getChildCount() - 1; i2 >= 0; i2--) {
            View child = getChildAt(i2);
            C1129c lp = (C1129c) child.getLayoutParams();
            int childHeight = child.getMeasuredHeight();
            int flags = lp.f4643a;
            if ((flags & 5) == 5) {
                int childRange2 = lp.topMargin + lp.bottomMargin;
                if ((flags & 8) != 0) {
                    childRange = childRange2 + C0460r.m2293w(child);
                } else if ((flags & 2) != 0) {
                    childRange = childRange2 + (childHeight - C0460r.m2293w(child));
                } else {
                    childRange = childRange2 + childHeight;
                }
                if (i2 == 0 && C0460r.m2288s(child)) {
                    childRange = Math.min(childRange, childHeight - getTopInset());
                }
                range += childRange;
            } else if (range > 0) {
                break;
            }
        }
        int max = Math.max(0, range);
        this.f4613d = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.f4614e;
        if (i != -1) {
            return i;
        }
        int range = 0;
        int i2 = 0;
        int z = getChildCount();
        while (true) {
            if (i2 >= z) {
                break;
            }
            View child = getChildAt(i2);
            C1129c lp = (C1129c) child.getLayoutParams();
            int childHeight = child.getMeasuredHeight() + lp.topMargin + lp.bottomMargin;
            int flags = lp.f4643a;
            if ((flags & 1) == 0) {
                break;
            }
            range += childHeight;
            if ((flags & 2) != 0) {
                range -= C0460r.m2293w(child);
                break;
            }
            i2++;
        }
        int max = Math.max(0, range);
        this.f4614e = max;
        return max;
    }

    /* renamed from: k */
    public void mo6400k(int offset) {
        this.f4611b = offset;
        if (!willNotDraw()) {
            C0460r.m2246U(this);
        }
        List<C1128b> list = this.f4618i;
        if (list != null) {
            int z = list.size();
            for (int i = 0; i < z; i++) {
                C1128b listener = this.f4618i.get(i);
                if (listener != null) {
                    listener.mo6461a(this, offset);
                }
            }
        }
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minHeight = C0460r.m2293w(this);
        if (minHeight != 0) {
            return (minHeight * 2) + topInset;
        }
        int childCount = getChildCount();
        int lastChildMinHeight = childCount >= 1 ? C0460r.m2293w(getChildAt(childCount - 1)) : 0;
        if (lastChildMinHeight != 0) {
            return (lastChildMinHeight * 2) + topInset;
        }
        return getHeight() / 3;
    }

    public int[] onCreateDrawableState(int extraSpace) {
        if (this.f4626q == null) {
            this.f4626q = new int[4];
        }
        int[] extraStates = this.f4626q;
        int[] states = super.onCreateDrawableState(extraStates.length + extraSpace);
        boolean z = this.f4620k;
        int i = C0924b.state_liftable;
        if (!z) {
            i = -i;
        }
        extraStates[0] = i;
        extraStates[1] = (!z || !this.f4621l) ? -C0924b.state_lifted : C0924b.state_lifted;
        int i2 = C0924b.state_collapsible;
        if (!z) {
            i2 = -i2;
        }
        extraStates[2] = i2;
        extraStates[3] = (!z || !this.f4621l) ? -C0924b.state_collapsed : C0924b.state_collapsed;
        return LinearLayout.mergeDrawableStates(states, extraStates);
    }

    /* renamed from: o */
    public final boolean mo6404o(boolean liftable) {
        if (this.f4620k == liftable) {
            return false;
        }
        this.f4620k = liftable;
        refreshDrawableState();
        return true;
    }

    /* renamed from: p */
    public boolean mo6410p(boolean lifted) {
        if (this.f4621l == lifted) {
            return false;
        }
        this.f4621l = lifted;
        refreshDrawableState();
        if (!this.f4622m || !(getBackground() instanceof C0953g)) {
            return true;
        }
        mo6424t((C0953g) getBackground(), lifted);
        return true;
    }

    /* renamed from: t */
    public final void mo6424t(C0953g background, boolean lifted) {
        float appBarElevation = getResources().getDimension(C0928d.design_appbar_elevation);
        float toElevation = 0.0f;
        float fromElevation = lifted ? 0.0f : appBarElevation;
        if (lifted) {
            toElevation = appBarElevation;
        }
        ValueAnimator valueAnimator = this.f4625p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{fromElevation, toElevation});
        this.f4625p = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(C0946g.app_bar_elevation_anim_duration));
        this.f4625p.setInterpolator(C1023a.f4312a);
        this.f4625p.addUpdateListener(new C1127a(this, background));
        this.f4625p.start();
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public class C1127a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C0953g f4642a;

        public C1127a(AppBarLayout this$0, C0953g gVar) {
            this.f4642a = gVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f4642a.mo5587S(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public void setLiftOnScroll(boolean liftOnScroll) {
        this.f4622m = liftOnScroll;
    }

    /* renamed from: j */
    public boolean mo6399j() {
        return this.f4622m;
    }

    public void setLiftOnScrollTargetViewId(int liftOnScrollTargetViewId) {
        this.f4623n = liftOnScrollTargetViewId;
        mo6374a();
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f4623n;
    }

    /* renamed from: r */
    public boolean mo6412r(View defaultScrollingView) {
        View scrollingView = mo6375b(defaultScrollingView);
        if (scrollingView == null) {
            scrollingView = defaultScrollingView;
        }
        return scrollingView != null && (scrollingView.canScrollVertically(-1) || scrollingView.getScrollY() > 0);
    }

    /* renamed from: b */
    public final View mo6375b(View defaultScrollingView) {
        int i;
        if (this.f4624o == null && (i = this.f4623n) != -1) {
            View targetView = null;
            if (defaultScrollingView != null) {
                targetView = defaultScrollingView.findViewById(i);
            }
            if (targetView == null && (getParent() instanceof ViewGroup)) {
                targetView = ((ViewGroup) getParent()).findViewById(this.f4623n);
            }
            if (targetView != null) {
                this.f4624o = new WeakReference<>(targetView);
            }
        }
        WeakReference<View> weakReference = this.f4624o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo6374a() {
        WeakReference<View> weakReference = this.f4624o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f4624o = null;
    }

    @Deprecated
    public void setTargetElevation(float elevation) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1039e.m5482a(this, elevation);
        }
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public int getPendingAction() {
        return this.f4616g;
    }

    /* renamed from: l */
    public void mo6401l() {
        this.f4616g = 0;
    }

    public final int getTopInset() {
        C0479z zVar = this.f4617h;
        if (zVar != null) {
            return zVar.mo2615d();
        }
        return 0;
    }

    /* renamed from: s */
    public final boolean mo6413s() {
        if (getChildCount() <= 0) {
            return false;
        }
        View firstChild = getChildAt(0);
        if (firstChild.getVisibility() == 8 || C0460r.m2288s(firstChild)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public static class C1129c extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f4643a = 1;

        /* renamed from: b */
        public Interpolator f4644b;

        public C1129c(Context c, AttributeSet attrs) {
            super(c, attrs);
            TypedArray a = c.obtainStyledAttributes(attrs, C1020k.f4202a);
            this.f4643a = a.getInt(C1020k.f4207b, 0);
            int i = C1020k.f4212c;
            if (a.hasValue(i)) {
                this.f4644b = AnimationUtils.loadInterpolator(c, a.getResourceId(i, 0));
            }
            a.recycle();
        }

        public C1129c(int width, int height) {
            super(width, height);
        }

        public C1129c(ViewGroup.LayoutParams p) {
            super(p);
        }

        public C1129c(ViewGroup.MarginLayoutParams source) {
            super(source);
        }

        public C1129c(LinearLayout.LayoutParams source) {
            super(source);
        }

        /* renamed from: a */
        public int mo6462a() {
            return this.f4643a;
        }

        /* renamed from: b */
        public Interpolator mo6463b() {
            return this.f4644b;
        }

        /* renamed from: c */
        public boolean mo6464c() {
            int i = this.f4643a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attrs) {
            super(context, attrs);
        }
    }

    public static class BaseBehavior<T extends AppBarLayout> extends C1034a<T> {

        /* renamed from: k */
        public int f4628k;

        /* renamed from: l */
        public int f4629l;

        /* renamed from: m */
        public ValueAnimator f4630m;

        /* renamed from: n */
        public int f4631n = -1;

        /* renamed from: o */
        public boolean f4632o;

        /* renamed from: p */
        public float f4633p;

        /* renamed from: q */
        public WeakReference<View> f4634q;

        /* renamed from: r */
        public C1124b f4635r;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        public static abstract class C1124b<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo6450a(T t);
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        /* renamed from: k0 */
        public boolean mo4410A(CoordinatorLayout parent, T child, View directTargetChild, View target, int nestedScrollAxes, int type) {
            ValueAnimator valueAnimator;
            boolean started = (nestedScrollAxes & 2) != 0 && (child.mo6399j() || mo6430V(parent, child, directTargetChild));
            if (started && (valueAnimator = this.f4630m) != null) {
                valueAnimator.cancel();
            }
            this.f4634q = null;
            this.f4629l = type;
            return started;
        }

        /* renamed from: V */
        public final boolean mo6430V(CoordinatorLayout parent, T child, View directTargetChild) {
            return child.mo6397h() && parent.getHeight() - directTargetChild.getHeight() <= child.getHeight();
        }

        /* renamed from: g0 */
        public void mo4430q(CoordinatorLayout coordinatorLayout, T child, View target, int dx, int dy, int[] consumed, int type) {
            int max;
            int min;
            if (dy != 0) {
                if (dy < 0) {
                    int min2 = -child.getTotalScrollRange();
                    min = min2;
                    max = child.getDownNestedPreScrollRange() + min2;
                } else {
                    min = -child.getUpNestedPreScrollRange();
                    max = 0;
                }
                if (min != max) {
                    consumed[1] = mo5885O(coordinatorLayout, child, dy, min, max);
                }
            }
            if (child.mo6399j()) {
                T t = child;
                child.mo6410p(child.mo6412r(target));
                return;
            }
            T t2 = child;
        }

        /* renamed from: h0 */
        public void mo4433t(CoordinatorLayout coordinatorLayout, T child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
            if (dyUnconsumed < 0) {
                consumed[1] = mo5885O(coordinatorLayout, child, dyUnconsumed, -child.getDownNestedScrollRange(), 0);
            }
        }

        /* renamed from: l0 */
        public void mo4412C(CoordinatorLayout coordinatorLayout, T abl, View target, int type) {
            if (this.f4629l == 0 || type == 1) {
                mo6447o0(coordinatorLayout, abl);
                if (abl.mo6399j()) {
                    abl.mo6410p(abl.mo6412r(target));
                }
            }
            this.f4634q = new WeakReference<>(target);
        }

        /* renamed from: S */
        public final void mo6427S(CoordinatorLayout coordinatorLayout, T child, int offset, float velocity) {
            int duration;
            int distance = Math.abs(mo5883M() - offset);
            float velocity2 = Math.abs(velocity);
            if (velocity2 > 0.0f) {
                duration = Math.round((((float) distance) / velocity2) * 1000.0f) * 3;
            } else {
                duration = (int) ((1.0f + (((float) distance) / ((float) child.getHeight()))) * 150.0f);
            }
            mo6428T(coordinatorLayout, child, offset, duration);
        }

        /* renamed from: T */
        public final void mo6428T(CoordinatorLayout coordinatorLayout, T child, int offset, int duration) {
            int currentOffset = mo5883M();
            if (currentOffset == offset) {
                ValueAnimator valueAnimator = this.f4630m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f4630m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f4630m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f4630m = valueAnimator3;
                valueAnimator3.setInterpolator(C1023a.f4316e);
                this.f4630m.addUpdateListener(new C1123a(coordinatorLayout, child));
            } else {
                valueAnimator2.cancel();
            }
            this.f4630m.setDuration((long) Math.min(duration, 600));
            this.f4630m.setIntValues(new int[]{currentOffset, offset});
            this.f4630m.start();
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public class C1123a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ CoordinatorLayout f4636a;

            /* renamed from: b */
            public final /* synthetic */ AppBarLayout f4637b;

            public C1123a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f4636a = coordinatorLayout;
                this.f4637b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator animator) {
                BaseBehavior.this.mo5886P(this.f4636a, this.f4637b, ((Integer) animator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: Z */
        public final int mo6432Z(T abl, int offset) {
            int count = abl.getChildCount();
            for (int i = 0; i < count; i++) {
                View child = abl.getChildAt(i);
                int top = child.getTop();
                int bottom = child.getBottom();
                C1129c lp = (C1129c) child.getLayoutParams();
                if (m5965W(lp.mo6462a(), 32)) {
                    top -= lp.topMargin;
                    bottom += lp.bottomMargin;
                }
                if (top <= (-offset) && bottom >= (-offset)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: o0 */
        public final void mo6447o0(CoordinatorLayout coordinatorLayout, T abl) {
            int offset = mo5883M();
            int offsetChildIndex = mo6432Z(abl, offset);
            if (offsetChildIndex >= 0) {
                View offsetChild = abl.getChildAt(offsetChildIndex);
                C1129c lp = (C1129c) offsetChild.getLayoutParams();
                int flags = lp.mo6462a();
                if ((flags & 17) == 17) {
                    int snapTop = -offsetChild.getTop();
                    int snapBottom = -offsetChild.getBottom();
                    if (offsetChildIndex == abl.getChildCount() - 1) {
                        snapBottom += abl.getTopInset();
                    }
                    if (m5965W(flags, 2)) {
                        snapBottom += C0460r.m2293w(offsetChild);
                    } else if (m5965W(flags, 5)) {
                        int seam = C0460r.m2293w(offsetChild) + snapBottom;
                        if (offset < seam) {
                            snapTop = seam;
                        } else {
                            snapBottom = seam;
                        }
                    }
                    if (m5965W(flags, 32)) {
                        snapTop += lp.topMargin;
                        snapBottom -= lp.bottomMargin;
                    }
                    mo6427S(coordinatorLayout, abl, C0379a.m1963b(offset < (snapBottom + snapTop) / 2 ? snapBottom : snapTop, -abl.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: W */
        public static boolean m5965W(int flags, int check) {
            return (flags & check) == check;
        }

        /* renamed from: f0 */
        public boolean mo4426m(CoordinatorLayout parent, T child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
            if (((CoordinatorLayout.C0827f) child.getLayoutParams()).height != -2) {
                return super.mo4426m(parent, child, parentWidthMeasureSpec, widthUsed, parentHeightMeasureSpec, heightUsed);
            }
            parent.mo4351J(child, parentWidthMeasureSpec, widthUsed, View.MeasureSpec.makeMeasureSpec(0, 0), heightUsed);
            return true;
        }

        /* renamed from: e0 */
        public boolean mo4425l(CoordinatorLayout parent, T abl, int layoutDirection) {
            int offset;
            boolean handled = super.mo4425l(parent, abl, layoutDirection);
            int pendingAction = abl.getPendingAction();
            int i = this.f4631n;
            if (i >= 0 && (pendingAction & 8) == 0) {
                View child = abl.getChildAt(i);
                int offset2 = -child.getBottom();
                if (this.f4632o) {
                    offset = offset2 + C0460r.m2293w(child) + abl.getTopInset();
                } else {
                    offset = offset2 + Math.round(((float) child.getHeight()) * this.f4633p);
                }
                mo5886P(parent, abl, offset);
            } else if (pendingAction != 0) {
                boolean animate = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int offset3 = -abl.getUpNestedPreScrollRange();
                    if (animate) {
                        mo6427S(parent, abl, offset3, 0.0f);
                    } else {
                        mo5886P(parent, abl, offset3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (animate) {
                        mo6427S(parent, abl, 0, 0.0f);
                    } else {
                        mo5886P(parent, abl, 0);
                    }
                }
            }
            abl.mo6401l();
            this.f4631n = -1;
            mo5899G(C0379a.m1963b(mo5898E(), -abl.getTotalScrollRange(), 0));
            mo6448p0(parent, abl, mo5898E(), 0, true);
            abl.mo6400k(mo5898E());
            return handled;
        }

        /* renamed from: U */
        public boolean mo5878H(T view) {
            C1124b bVar = this.f4635r;
            if (bVar != null) {
                return bVar.mo6450a(view);
            }
            WeakReference<View> weakReference = this.f4634q;
            if (weakReference == null) {
                return true;
            }
            View scrollingView = (View) weakReference.get();
            if (scrollingView == null || !scrollingView.isShown() || scrollingView.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* renamed from: d0 */
        public void mo5884N(CoordinatorLayout parent, T layout) {
            mo6447o0(parent, layout);
            if (layout.mo6399j()) {
                layout.mo6410p(layout.mo6412r(mo6431X(parent)));
            }
        }

        /* renamed from: a0 */
        public int mo5881K(T view) {
            return -view.getDownNestedScrollRange();
        }

        /* renamed from: b0 */
        public int mo5882L(T view) {
            return view.getTotalScrollRange();
        }

        /* renamed from: m0 */
        public int mo5887Q(CoordinatorLayout coordinatorLayout, T appBarLayout, int newOffset, int minOffset, int maxOffset) {
            int curOffset = mo5883M();
            int consumed = 0;
            if (minOffset == 0 || curOffset < minOffset || curOffset > maxOffset) {
                this.f4628k = 0;
            } else {
                int newOffset2 = C0379a.m1963b(newOffset, minOffset, maxOffset);
                if (curOffset != newOffset2) {
                    int interpolatedOffset = appBarLayout.mo6382f() ? mo6435c0(appBarLayout, newOffset2) : newOffset2;
                    boolean offsetChanged = mo5899G(interpolatedOffset);
                    consumed = curOffset - newOffset2;
                    this.f4628k = newOffset2 - interpolatedOffset;
                    if (!offsetChanged && appBarLayout.mo6382f()) {
                        coordinatorLayout.mo4367f(appBarLayout);
                    }
                    appBarLayout.mo6400k(mo5898E());
                    mo6448p0(coordinatorLayout, appBarLayout, newOffset2, newOffset2 < curOffset ? -1 : 1, false);
                }
            }
            return consumed;
        }

        /* renamed from: c0 */
        public final int mo6435c0(T layout, int offset) {
            int absOffset = Math.abs(offset);
            int i = 0;
            int z = layout.getChildCount();
            while (true) {
                if (i >= z) {
                    break;
                }
                View child = layout.getChildAt(i);
                C1129c childLp = (C1129c) child.getLayoutParams();
                Interpolator interpolator = childLp.mo6463b();
                if (absOffset < child.getTop() || absOffset > child.getBottom()) {
                    i++;
                } else if (interpolator != null) {
                    int childScrollableHeight = 0;
                    int flags = childLp.mo6462a();
                    if ((flags & 1) != 0) {
                        childScrollableHeight = 0 + child.getHeight() + childLp.topMargin + childLp.bottomMargin;
                        if ((flags & 2) != 0) {
                            childScrollableHeight -= C0460r.m2293w(child);
                        }
                    }
                    if (C0460r.m2288s(child)) {
                        childScrollableHeight -= layout.getTopInset();
                    }
                    if (childScrollableHeight > 0) {
                        return Integer.signum(offset) * (child.getTop() + Math.round(((float) childScrollableHeight) * interpolator.getInterpolation(((float) (absOffset - child.getTop())) / ((float) childScrollableHeight))));
                    }
                }
            }
            return offset;
        }

        /* renamed from: p0 */
        public final void mo6448p0(CoordinatorLayout parent, T layout, int offset, int direction, boolean forceJump) {
            View child = m5966Y(layout, offset);
            if (child != null) {
                int flags = ((C1129c) child.getLayoutParams()).mo6462a();
                boolean lifted = false;
                if ((flags & 1) != 0) {
                    int minHeight = C0460r.m2293w(child);
                    boolean z = false;
                    if (direction > 0 && (flags & 12) != 0) {
                        if ((-offset) >= (child.getBottom() - minHeight) - layout.getTopInset()) {
                            z = true;
                        }
                        lifted = z;
                    } else if ((flags & 2) != 0) {
                        if ((-offset) >= (child.getBottom() - minHeight) - layout.getTopInset()) {
                            z = true;
                        }
                        lifted = z;
                    }
                }
                if (layout.mo6399j() != 0) {
                    lifted = layout.mo6412r(mo6431X(parent));
                }
                boolean changed = layout.mo6410p(lifted);
                if (forceJump || (changed && mo6446n0(parent, layout))) {
                    layout.jumpDrawablesToCurrentState();
                }
            }
        }

        /* renamed from: n0 */
        public final boolean mo6446n0(CoordinatorLayout parent, T layout) {
            List<View> dependencies = parent.mo4394s(layout);
            int size = dependencies.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.C0824c behavior = ((CoordinatorLayout.C0827f) dependencies.get(i).getLayoutParams()).mo4448f();
                if (behavior instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) behavior).mo5893K() != 0;
                }
            }
            return false;
        }

        /* renamed from: Y */
        public static View m5966Y(AppBarLayout layout, int offset) {
            int absOffset = Math.abs(offset);
            int z = layout.getChildCount();
            for (int i = 0; i < z; i++) {
                View child = layout.getChildAt(i);
                if (absOffset >= child.getTop() && absOffset <= child.getBottom()) {
                    return child;
                }
            }
            return null;
        }

        /* renamed from: X */
        public final View mo6431X(CoordinatorLayout parent) {
            int z = parent.getChildCount();
            for (int i = 0; i < z; i++) {
                View child = parent.getChildAt(i);
                if ((child instanceof C0451i) || (child instanceof ListView) || (child instanceof ScrollView)) {
                    return child;
                }
            }
            return null;
        }

        /* renamed from: M */
        public int mo5883M() {
            return mo5898E() + this.f4628k;
        }

        /* renamed from: j0 */
        public Parcelable mo4438y(CoordinatorLayout parent, T abl) {
            Parcelable superState = super.mo4438y(parent, abl);
            int offset = mo5898E();
            int i = 0;
            int count = abl.getChildCount();
            while (i < count) {
                View child = abl.getChildAt(i);
                int visBottom = child.getBottom() + offset;
                if (child.getTop() + offset > 0 || visBottom < 0) {
                    i++;
                } else {
                    C1125c ss = new C1125c(superState);
                    ss.f4639d = i;
                    ss.f4641f = visBottom == C0460r.m2293w(child) + abl.getTopInset();
                    ss.f4640e = ((float) visBottom) / ((float) child.getHeight());
                    return ss;
                }
            }
            return superState;
        }

        /* renamed from: i0 */
        public void mo4437x(CoordinatorLayout parent, T appBarLayout, Parcelable state) {
            if (state instanceof C1125c) {
                C1125c ss = (C1125c) state;
                super.mo4437x(parent, appBarLayout, ss.mo2682f());
                this.f4631n = ss.f4639d;
                this.f4633p = ss.f4640e;
                this.f4632o = ss.f4641f;
                return;
            }
            super.mo4437x(parent, appBarLayout, state);
            this.f4631n = -1;
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        public static class C1125c extends C0501a {
            public static final Parcelable.Creator<C1125c> CREATOR = new C1126a();

            /* renamed from: d */
            public int f4639d;

            /* renamed from: e */
            public float f4640e;

            /* renamed from: f */
            public boolean f4641f;

            public C1125c(Parcel source, ClassLoader loader) {
                super(source, loader);
                this.f4639d = source.readInt();
                this.f4640e = source.readFloat();
                this.f4641f = source.readByte() != 0;
            }

            public C1125c(Parcelable superState) {
                super(superState);
            }

            public void writeToParcel(Parcel dest, int flags) {
                super.writeToParcel(dest, flags);
                dest.writeInt(this.f4639d);
                dest.writeFloat(this.f4640e);
                dest.writeByte(this.f4641f ? (byte) 1 : 0);
            }

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c$a */
            public static class C1126a implements Parcelable.ClassLoaderCreator<C1125c> {
                /* renamed from: b */
                public C1125c createFromParcel(Parcel source, ClassLoader loader) {
                    return new C1125c(source, loader);
                }

                /* renamed from: a */
                public C1125c createFromParcel(Parcel source) {
                    return new C1125c(source, (ClassLoader) null);
                }

                /* renamed from: c */
                public C1125c[] newArray(int size) {
                    return new C1125c[size];
                }
            }
        }
    }

    public static class ScrollingViewBehavior extends C1036b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attrs) {
            super(context, attrs);
            TypedArray a = context.obtainStyledAttributes(attrs, C1020k.f4302x1);
            mo5896O(a.getDimensionPixelSize(C1020k.f4306y1, 0));
            a.recycle();
        }

        /* renamed from: e */
        public boolean mo4418e(CoordinatorLayout parent, View child, View dependency) {
            return dependency instanceof AppBarLayout;
        }

        /* renamed from: h */
        public boolean mo4421h(CoordinatorLayout parent, View child, View dependency) {
            mo6458S(child, dependency);
            mo6459T(child, dependency);
            return false;
        }

        /* renamed from: w */
        public boolean mo4436w(CoordinatorLayout parent, View child, Rect rectangle, boolean immediate) {
            AppBarLayout header = mo5890H(parent.mo4391r(child));
            if (header != null) {
                rectangle.offset(child.getLeft(), child.getTop());
                Rect parentRect = this.f4345d;
                parentRect.set(0, 0, parent.getWidth(), parent.getHeight());
                if (!parentRect.contains(rectangle)) {
                    header.mo6402m(false, !immediate);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: S */
        public final void mo6458S(View child, View dependency) {
            CoordinatorLayout.C0824c behavior = ((CoordinatorLayout.C0827f) dependency.getLayoutParams()).mo4448f();
            if (behavior instanceof BaseBehavior) {
                C0460r.m2241P(child, (((dependency.getBottom() - child.getTop()) + ((BaseBehavior) behavior).f4628k) + mo5895M()) - mo5891I(dependency));
            }
        }

        /* renamed from: J */
        public float mo5892J(View header) {
            int availScrollRange;
            if (header instanceof AppBarLayout) {
                AppBarLayout abl = (AppBarLayout) header;
                int totalScrollRange = abl.getTotalScrollRange();
                int preScrollDown = abl.getDownNestedPreScrollRange();
                int offset = m6007R(abl);
                if ((preScrollDown == 0 || totalScrollRange + offset > preScrollDown) && (availScrollRange = totalScrollRange - preScrollDown) != 0) {
                    return (((float) offset) / ((float) availScrollRange)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* renamed from: R */
        public static int m6007R(AppBarLayout abl) {
            CoordinatorLayout.C0824c behavior = ((CoordinatorLayout.C0827f) abl.getLayoutParams()).mo4448f();
            if (behavior instanceof BaseBehavior) {
                return ((BaseBehavior) behavior).mo5883M();
            }
            return 0;
        }

        /* renamed from: Q */
        public AppBarLayout mo5890H(List<View> views) {
            int z = views.size();
            for (int i = 0; i < z; i++) {
                View view = views.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: L */
        public int mo5894L(View v) {
            if (v instanceof AppBarLayout) {
                return ((AppBarLayout) v).getTotalScrollRange();
            }
            return super.mo5894L(v);
        }

        /* renamed from: T */
        public final void mo6459T(View child, View dependency) {
            if (dependency instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) dependency;
                if (appBarLayout.mo6399j()) {
                    appBarLayout.mo6410p(appBarLayout.mo6412r(child));
                }
            }
        }
    }
}
