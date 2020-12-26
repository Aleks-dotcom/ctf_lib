package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import p000a.p002b.C0003a;
import p000a.p002b.C0008f;
import p000a.p002b.p009o.p010j.C0113m;
import p000a.p002b.p011p.C0139c0;
import p000a.p002b.p011p.C0140c1;
import p000a.p002b.p011p.C0142d0;
import p000a.p025h.p038m.C0453k;
import p000a.p025h.p038m.C0454l;
import p000a.p025h.p038m.C0455m;
import p000a.p025h.p038m.C0456n;
import p000a.p025h.p038m.C0460r;

public class ActionBarOverlayLayout extends ViewGroup implements C0139c0, C0455m, C0453k, C0454l {

    /* renamed from: C */
    public static final int[] f3061C = {C0003a.actionBarSize, 16842841};

    /* renamed from: A */
    public final Runnable f3062A = new C0784c();

    /* renamed from: B */
    public final C0456n f3063B;

    /* renamed from: b */
    public int f3064b;

    /* renamed from: c */
    public int f3065c = 0;

    /* renamed from: d */
    public ContentFrameLayout f3066d;

    /* renamed from: e */
    public ActionBarContainer f3067e;

    /* renamed from: f */
    public C0142d0 f3068f;

    /* renamed from: g */
    public Drawable f3069g;

    /* renamed from: h */
    public boolean f3070h;

    /* renamed from: i */
    public boolean f3071i;

    /* renamed from: j */
    public boolean f3072j;

    /* renamed from: k */
    public boolean f3073k;

    /* renamed from: l */
    public boolean f3074l;

    /* renamed from: m */
    public int f3075m;

    /* renamed from: n */
    public int f3076n;

    /* renamed from: o */
    public final Rect f3077o = new Rect();

    /* renamed from: p */
    public final Rect f3078p = new Rect();

    /* renamed from: q */
    public final Rect f3079q = new Rect();

    /* renamed from: r */
    public final Rect f3080r = new Rect();

    /* renamed from: s */
    public final Rect f3081s = new Rect();

    /* renamed from: t */
    public final Rect f3082t = new Rect();

    /* renamed from: u */
    public final Rect f3083u = new Rect();

    /* renamed from: v */
    public C0785d f3084v;

    /* renamed from: w */
    public OverScroller f3085w;

    /* renamed from: x */
    public ViewPropertyAnimator f3086x;

    /* renamed from: y */
    public final AnimatorListenerAdapter f3087y = new C0782a();

    /* renamed from: z */
    public final Runnable f3088z = new C0783b();

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0785d {
        /* renamed from: a */
        void mo241a();

        /* renamed from: b */
        void mo242b(boolean z);

        /* renamed from: c */
        void mo243c(int i);

        /* renamed from: d */
        void mo244d();

        /* renamed from: e */
        void mo245e();

        /* renamed from: f */
        void mo246f();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0782a extends AnimatorListenerAdapter {
        public C0782a() {
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3086x = null;
            actionBarOverlayLayout.f3074l = false;
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3086x = null;
            actionBarOverlayLayout.f3074l = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class C0783b implements Runnable {
        public C0783b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo3997u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3086x = actionBarOverlayLayout.f3067e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f3087y);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class C0784c implements Runnable {
        public C0784c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo3997u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f3086x = actionBarOverlayLayout.f3067e.animate().translationY((float) (-ActionBarOverlayLayout.this.f3067e.getHeight())).setListener(ActionBarOverlayLayout.this.f3087y);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        mo3998v(context);
        this.f3063B = new C0456n(this);
    }

    /* renamed from: v */
    public final void mo3998v(Context context) {
        TypedArray ta = getContext().getTheme().obtainStyledAttributes(f3061C);
        boolean z = false;
        this.f3064b = ta.getDimensionPixelSize(0, 0);
        Drawable drawable = ta.getDrawable(1);
        this.f3069g = drawable;
        setWillNotDraw(drawable == null);
        ta.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f3070h = z;
        this.f3085w = new OverScroller(context);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo3997u();
    }

    public void setActionBarVisibilityCallback(C0785d cb) {
        this.f3084v = cb;
        if (getWindowToken() != null) {
            this.f3084v.mo243c(this.f3065c);
            if (this.f3076n != 0) {
                onWindowSystemUiVisibilityChanged(this.f3076n);
                C0460r.m2253a0(this);
            }
        }
    }

    public void setOverlayMode(boolean overlayMode) {
        this.f3071i = overlayMode;
        this.f3070h = overlayMode && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    /* renamed from: w */
    public boolean mo3999w() {
        return this.f3071i;
    }

    public void setHasNonEmbeddedTabs(boolean hasNonEmbeddedTabs) {
        this.f3072j = hasNonEmbeddedTabs;
    }

    public void setShowingForActionMode(boolean showing) {
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mo3998v(getContext());
        C0460r.m2253a0(this);
    }

    public void onWindowSystemUiVisibilityChanged(int visible) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(visible);
        }
        mo4002z();
        int diff = this.f3076n ^ visible;
        this.f3076n = visible;
        boolean z = true;
        boolean barVisible = (visible & 4) == 0;
        boolean stable = (visible & 256) != 0;
        C0785d dVar = this.f3084v;
        if (dVar != null) {
            if (stable) {
                z = false;
            }
            dVar.mo242b(z);
            if (barVisible || !stable) {
                this.f3084v.mo245e();
            } else {
                this.f3084v.mo244d();
            }
        }
        if ((diff & 256) != 0 && this.f3084v != null) {
            C0460r.m2253a0(this);
        }
    }

    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        this.f3065c = visibility;
        C0785d dVar = this.f3084v;
        if (dVar != null) {
            dVar.mo243c(visibility);
        }
    }

    /* renamed from: q */
    public final boolean mo3982q(View view, Rect insets, boolean left, boolean top, boolean bottom, boolean right) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean changed = false;
        C0786e lp = (C0786e) view.getLayoutParams();
        if (left && lp.leftMargin != (i4 = insets.left)) {
            changed = true;
            lp.leftMargin = i4;
        }
        if (top && lp.topMargin != (i3 = insets.top)) {
            changed = true;
            lp.topMargin = i3;
        }
        if (right && lp.rightMargin != (i2 = insets.right)) {
            changed = true;
            lp.rightMargin = i2;
        }
        if (!bottom || lp.bottomMargin == (i = insets.bottom)) {
            return changed;
        }
        lp.bottomMargin = i;
        return true;
    }

    public boolean fitSystemWindows(Rect insets) {
        mo4002z();
        if ((C0460r.m2228C(this) & 256) != 0) {
        }
        Rect systemInsets = insets;
        boolean changed = mo3982q(this.f3067e, systemInsets, true, true, false, true);
        this.f3080r.set(systemInsets);
        C0140c1.m787a(this, this.f3080r, this.f3077o);
        if (!this.f3081s.equals(this.f3080r)) {
            changed = true;
            this.f3081s.set(this.f3080r);
        }
        if (!this.f3078p.equals(this.f3077o)) {
            changed = true;
            this.f3078p.set(this.f3077o);
        }
        if (changed) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: r */
    public C0786e generateDefaultLayoutParams() {
        return new C0786e(-1, -1);
    }

    /* renamed from: s */
    public C0786e generateLayoutParams(AttributeSet attrs) {
        return new C0786e(getContext(), attrs);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new C0786e(p);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof C0786e;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        mo4002z();
        int topInset = 0;
        measureChildWithMargins(this.f3067e, widthMeasureSpec, 0, heightMeasureSpec, 0);
        C0786e lp = (C0786e) this.f3067e.getLayoutParams();
        int maxWidth = Math.max(0, this.f3067e.getMeasuredWidth() + lp.leftMargin + lp.rightMargin);
        int maxHeight = Math.max(0, this.f3067e.getMeasuredHeight() + lp.topMargin + lp.bottomMargin);
        int childState = View.combineMeasuredStates(0, this.f3067e.getMeasuredState());
        boolean stable = (C0460r.m2228C(this) & 256) != 0;
        if (stable) {
            topInset = this.f3064b;
            if (this.f3072j && this.f3067e.getTabContainer() != null) {
                topInset += this.f3064b;
            }
        } else if (this.f3067e.getVisibility() != 8) {
            topInset = this.f3067e.getMeasuredHeight();
        }
        this.f3079q.set(this.f3077o);
        this.f3082t.set(this.f3080r);
        if (this.f3071i || stable) {
            Rect rect = this.f3082t;
            rect.top += topInset;
            rect.bottom += 0;
        } else {
            Rect rect2 = this.f3079q;
            rect2.top += topInset;
            rect2.bottom += 0;
        }
        mo3982q(this.f3066d, this.f3079q, true, true, true, true);
        if (!this.f3083u.equals(this.f3082t)) {
            this.f3083u.set(this.f3082t);
            this.f3066d.mo4041a(this.f3082t);
        }
        measureChildWithMargins(this.f3066d, widthMeasureSpec, 0, heightMeasureSpec, 0);
        C0786e lp2 = (C0786e) this.f3066d.getLayoutParams();
        int maxWidth2 = Math.max(maxWidth, this.f3066d.getMeasuredWidth() + lp2.leftMargin + lp2.rightMargin);
        int maxHeight2 = Math.max(maxHeight, this.f3066d.getMeasuredHeight() + lp2.topMargin + lp2.bottomMargin);
        int childState2 = View.combineMeasuredStates(childState, this.f3066d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(maxWidth2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), widthMeasureSpec, childState2), View.resolveSizeAndState(Math.max(maxHeight2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), heightMeasureSpec, childState2 << 16));
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int count = getChildCount();
        int parentLeft = getPaddingLeft();
        int paddingRight = (right - left) - getPaddingRight();
        int parentTop = getPaddingTop();
        int paddingBottom = (bottom - top) - getPaddingBottom();
        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            if (child.getVisibility() != 8) {
                C0786e lp = (C0786e) child.getLayoutParams();
                int width = child.getMeasuredWidth();
                int height = child.getMeasuredHeight();
                int childLeft = lp.leftMargin + parentLeft;
                int childTop = lp.topMargin + parentTop;
                child.layout(childLeft, childTop, childLeft + width, childTop + height);
            }
        }
    }

    public void draw(Canvas c) {
        super.draw(c);
        if (this.f3069g != null && !this.f3070h) {
            int top = this.f3067e.getVisibility() == 0 ? (int) (((float) this.f3067e.getBottom()) + this.f3067e.getTranslationY() + 0.5f) : 0;
            this.f3069g.setBounds(0, top, getWidth(), this.f3069g.getIntrinsicHeight() + top);
            this.f3069g.draw(c);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: k */
    public void mo2551k(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        mo2547l(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
    }

    /* renamed from: o */
    public boolean mo2550o(View child, View target, int axes, int type) {
        return type == 0 && onStartNestedScroll(child, target, axes);
    }

    /* renamed from: i */
    public void mo2546i(View child, View target, int axes, int type) {
        if (type == 0) {
            onNestedScrollAccepted(child, target, axes);
        }
    }

    /* renamed from: m */
    public void mo2548m(View target, int type) {
        if (type == 0) {
            onStopNestedScroll(target);
        }
    }

    /* renamed from: l */
    public void mo2547l(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (type == 0) {
            onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
        }
    }

    /* renamed from: n */
    public void mo2549n(View target, int dx, int dy, int[] consumed, int type) {
        if (type == 0) {
            onNestedPreScroll(target, dx, dy, consumed);
        }
    }

    public boolean onStartNestedScroll(View child, View target, int axes) {
        if ((axes & 2) == 0 || this.f3067e.getVisibility() != 0) {
            return false;
        }
        return this.f3073k;
    }

    public void onNestedScrollAccepted(View child, View target, int axes) {
        this.f3063B.mo2560b(child, target, axes);
        this.f3075m = getActionBarHideOffset();
        mo3997u();
        C0785d dVar = this.f3084v;
        if (dVar != null) {
            dVar.mo241a();
        }
    }

    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        int i = this.f3075m + dyConsumed;
        this.f3075m = i;
        setActionBarHideOffset(i);
    }

    public void onStopNestedScroll(View target) {
        if (this.f3073k && !this.f3074l) {
            if (this.f3075m <= this.f3067e.getHeight()) {
                mo4001y();
            } else {
                mo4000x();
            }
        }
        C0785d dVar = this.f3084v;
        if (dVar != null) {
            dVar.mo246f();
        }
    }

    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (!this.f3073k || !consumed) {
            return false;
        }
        if (mo3965B(velocityX, velocityY)) {
            mo3981p();
        } else {
            mo3964A();
        }
        this.f3074l = true;
        return true;
    }

    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
    }

    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        return false;
    }

    public int getNestedScrollAxes() {
        return this.f3063B.mo2559a();
    }

    /* renamed from: z */
    public void mo4002z() {
        if (this.f3066d == null) {
            this.f3066d = (ContentFrameLayout) findViewById(C0008f.action_bar_activity_content);
            this.f3067e = (ActionBarContainer) findViewById(C0008f.action_bar_container);
            this.f3068f = mo3996t(findViewById(C0008f.action_bar));
        }
    }

    /* renamed from: t */
    public final C0142d0 mo3996t(View view) {
        if (view instanceof C0142d0) {
            return (C0142d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void setHideOnContentScrollEnabled(boolean hideOnContentScroll) {
        if (hideOnContentScroll != this.f3073k) {
            this.f3073k = hideOnContentScroll;
            if (!hideOnContentScroll) {
                mo3997u();
                setActionBarHideOffset(0);
            }
        }
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f3067e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public void setActionBarHideOffset(int offset) {
        mo3997u();
        this.f3067e.setTranslationY((float) (-Math.max(0, Math.min(offset, this.f3067e.getHeight()))));
    }

    /* renamed from: u */
    public void mo3997u() {
        removeCallbacks(this.f3088z);
        removeCallbacks(this.f3062A);
        ViewPropertyAnimator viewPropertyAnimator = this.f3086x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: y */
    public final void mo4001y() {
        mo3997u();
        postDelayed(this.f3088z, 600);
    }

    /* renamed from: x */
    public final void mo4000x() {
        mo3997u();
        postDelayed(this.f3062A, 600);
    }

    /* renamed from: A */
    public final void mo3964A() {
        mo3997u();
        this.f3088z.run();
    }

    /* renamed from: p */
    public final void mo3981p() {
        mo3997u();
        this.f3062A.run();
    }

    /* renamed from: B */
    public final boolean mo3965B(float velocityX, float velocityY) {
        this.f3085w.fling(0, 0, 0, (int) velocityY, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return this.f3085w.getFinalY() > this.f3067e.getHeight();
    }

    public void setWindowCallback(Window.Callback cb) {
        mo4002z();
        this.f3068f.setWindowCallback(cb);
    }

    public void setWindowTitle(CharSequence title) {
        mo4002z();
        this.f3068f.setWindowTitle(title);
    }

    public CharSequence getTitle() {
        mo4002z();
        return this.f3068f.getTitle();
    }

    /* renamed from: h */
    public void mo978h(int windowFeature) {
        mo4002z();
        if (windowFeature == 2) {
            this.f3068f.mo1006l();
        } else if (windowFeature == 5) {
            this.f3068f.mo1012r();
        } else if (windowFeature == 109) {
            setOverlayMode(true);
        }
    }

    public void setUiOptions(int uiOptions) {
    }

    public void setIcon(int resId) {
        mo4002z();
        this.f3068f.setIcon(resId);
    }

    public void setIcon(Drawable d) {
        mo4002z();
        this.f3068f.setIcon(d);
    }

    public void setLogo(int resId) {
        mo4002z();
        this.f3068f.mo1008n(resId);
    }

    /* renamed from: f */
    public boolean mo976f() {
        mo4002z();
        return this.f3068f.mo999f();
    }

    /* renamed from: e */
    public boolean mo975e() {
        mo4002z();
        return this.f3068f.mo998e();
    }

    /* renamed from: c */
    public boolean mo973c() {
        mo4002z();
        return this.f3068f.mo995c();
    }

    /* renamed from: a */
    public boolean mo971a() {
        mo4002z();
        return this.f3068f.mo993a();
    }

    /* renamed from: g */
    public boolean mo977g() {
        mo4002z();
        return this.f3068f.mo1000g();
    }

    /* renamed from: d */
    public void mo974d() {
        mo4002z();
        this.f3068f.mo997d();
    }

    /* renamed from: b */
    public void mo972b(Menu menu, C0113m.C0114a cb) {
        mo4002z();
        this.f3068f.mo994b(menu, cb);
    }

    /* renamed from: j */
    public void mo979j() {
        mo4002z();
        this.f3068f.mo1002h();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0786e extends ViewGroup.MarginLayoutParams {
        public C0786e(Context c, AttributeSet attrs) {
            super(c, attrs);
        }

        public C0786e(int width, int height) {
            super(width, height);
        }

        public C0786e(ViewGroup.LayoutParams source) {
            super(source);
        }
    }
}
