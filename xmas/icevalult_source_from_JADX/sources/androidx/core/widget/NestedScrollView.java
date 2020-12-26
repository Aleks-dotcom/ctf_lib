package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000a.p025h.p038m.C0420a;
import p000a.p025h.p038m.C0451i;
import p000a.p025h.p038m.C0452j;
import p000a.p025h.p038m.C0454l;
import p000a.p025h.p038m.C0456n;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.p039a0.C0424c;
import p000a.p025h.p038m.p039a0.C0431e;
import p000a.p025h.p040n.C0485d;

public class NestedScrollView extends FrameLayout implements C0454l, C0451i {

    /* renamed from: B */
    public static final C0833a f3399B = new C0833a();

    /* renamed from: C */
    public static final int[] f3400C = {16843130};

    /* renamed from: A */
    public C0834b f3401A;

    /* renamed from: b */
    public long f3402b;

    /* renamed from: c */
    public final Rect f3403c;

    /* renamed from: d */
    public OverScroller f3404d;

    /* renamed from: e */
    public EdgeEffect f3405e;

    /* renamed from: f */
    public EdgeEffect f3406f;

    /* renamed from: g */
    public int f3407g;

    /* renamed from: h */
    public boolean f3408h;

    /* renamed from: i */
    public boolean f3409i;

    /* renamed from: j */
    public View f3410j;

    /* renamed from: k */
    public boolean f3411k;

    /* renamed from: l */
    public VelocityTracker f3412l;

    /* renamed from: m */
    public boolean f3413m;

    /* renamed from: n */
    public boolean f3414n;

    /* renamed from: o */
    public int f3415o;

    /* renamed from: p */
    public int f3416p;

    /* renamed from: q */
    public int f3417q;

    /* renamed from: r */
    public int f3418r;

    /* renamed from: s */
    public final int[] f3419s;

    /* renamed from: t */
    public final int[] f3420t;

    /* renamed from: u */
    public int f3421u;

    /* renamed from: v */
    public int f3422v;

    /* renamed from: w */
    public C0835c f3423w;

    /* renamed from: x */
    public final C0456n f3424x;

    /* renamed from: y */
    public final C0452j f3425y;

    /* renamed from: z */
    public float f3426z;

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface C0834b {
        /* renamed from: a */
        void mo3857a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NestedScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f3403c = new Rect();
        this.f3408h = true;
        this.f3409i = false;
        this.f3410j = null;
        this.f3411k = false;
        this.f3414n = true;
        this.f3418r = -1;
        this.f3419s = new int[2];
        this.f3420t = new int[2];
        mo4561x();
        TypedArray a = context.obtainStyledAttributes(attrs, f3400C, defStyleAttr, 0);
        setFillViewport(a.getBoolean(0, false));
        a.recycle();
        this.f3424x = new C0456n(this);
        this.f3425y = new C0452j(this);
        setNestedScrollingEnabled(true);
        C0460r.m2257c0(this, f3399B);
    }

    /* renamed from: g */
    public void mo4519g(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type, int[] consumed) {
        this.f3425y.mo2531e(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type, consumed);
    }

    /* renamed from: N */
    public boolean mo4495N(int axes, int type) {
        return this.f3425y.mo2543q(axes, type);
    }

    /* renamed from: O */
    public void mo4496O(int type) {
        this.f3425y.mo2545s(type);
    }

    /* renamed from: u */
    public boolean mo4558u(int type) {
        return this.f3425y.mo2538l(type);
    }

    /* renamed from: f */
    public boolean mo4518f(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        return this.f3425y.mo2530d(dx, dy, consumed, offsetInWindow, type);
    }

    public void setNestedScrollingEnabled(boolean enabled) {
        this.f3425y.mo2540n(enabled);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f3425y.mo2539m();
    }

    public boolean startNestedScroll(int axes) {
        return mo4495N(axes, 0);
    }

    public void stopNestedScroll() {
        mo4496O(0);
    }

    public boolean hasNestedScrollingParent() {
        return mo4558u(0);
    }

    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return this.f3425y.mo2532f(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    }

    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return mo4518f(dx, dy, consumed, offsetInWindow, 0);
    }

    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return this.f3425y.mo2527a(velocityX, velocityY, consumed);
    }

    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return this.f3425y.mo2528b(velocityX, velocityY);
    }

    /* renamed from: k */
    public void mo2551k(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        mo4484C(dyUnconsumed, type, consumed);
    }

    /* renamed from: C */
    public final void mo4484C(int dyUnconsumed, int type, int[] consumed) {
        int oldScrollY = getScrollY();
        scrollBy(0, dyUnconsumed);
        int myConsumed = getScrollY() - oldScrollY;
        if (consumed != null) {
            consumed[1] = consumed[1] + myConsumed;
        }
        this.f3425y.mo2531e(0, myConsumed, 0, dyUnconsumed - myConsumed, (int[]) null, type, consumed);
    }

    /* renamed from: o */
    public boolean mo2550o(View child, View target, int axes, int type) {
        return (axes & 2) != 0;
    }

    /* renamed from: i */
    public void mo2546i(View child, View target, int axes, int type) {
        this.f3424x.mo2561c(child, target, axes, type);
        mo4495N(2, type);
    }

    /* renamed from: m */
    public void mo2548m(View target, int type) {
        this.f3424x.mo2562d(target, type);
        mo4496O(type);
    }

    /* renamed from: l */
    public void mo2547l(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        mo4484C(dyUnconsumed, type, (int[]) null);
    }

    /* renamed from: n */
    public void mo2549n(View target, int dx, int dy, int[] consumed, int type) {
        mo4518f(dx, dy, consumed, (int[]) null, type);
    }

    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        return mo2550o(child, target, nestedScrollAxes, 0);
    }

    public void onNestedScrollAccepted(View child, View target, int nestedScrollAxes) {
        mo2546i(child, target, nestedScrollAxes, 0);
    }

    public void onStopNestedScroll(View target) {
        mo2548m(target, 0);
    }

    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        mo4484C(dyUnconsumed, 0, (int[]) null);
    }

    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        mo2549n(target, dx, dy, consumed, 0);
    }

    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (consumed) {
            return false;
        }
        dispatchNestedFling(0.0f, velocityY, true);
        mo4549s((int) velocityY);
        return true;
    }

    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        return dispatchNestedPreFling(velocityX, velocityY);
    }

    public int getNestedScrollAxes() {
        return this.f3424x.mo2559a();
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int length = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < length) {
            return ((float) scrollY) / ((float) length);
        }
        return 1.0f;
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View child = getChildAt(0);
        int length = getVerticalFadingEdgeLength();
        int span = ((child.getBottom() + ((FrameLayout.LayoutParams) child.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (span < length) {
            return ((float) span) / ((float) length);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    /* renamed from: x */
    public final void mo4561x() {
        this.f3404d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration configuration = ViewConfiguration.get(getContext());
        this.f3415o = configuration.getScaledTouchSlop();
        this.f3416p = configuration.getScaledMinimumFlingVelocity();
        this.f3417q = configuration.getScaledMaximumFlingVelocity();
    }

    public void addView(View child) {
        if (getChildCount() <= 0) {
            super.addView(child);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View child, int index) {
        if (getChildCount() <= 0) {
            super.addView(child, index);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View child, ViewGroup.LayoutParams params) {
        if (getChildCount() <= 0) {
            super.addView(child, params);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (getChildCount() <= 0) {
            super.addView(child, index, params);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(C0834b l) {
        this.f3401A = l;
    }

    /* renamed from: c */
    public final boolean mo4503c() {
        if (getChildCount() <= 0) {
            return false;
        }
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        if (child.getHeight() + lp.topMargin + lp.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    public void setFillViewport(boolean fillViewport) {
        if (fillViewport != this.f3413m) {
            this.f3413m = fillViewport;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean smoothScrollingEnabled) {
        this.f3414n = smoothScrollingEnabled;
    }

    public void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        C0834b bVar = this.f3401A;
        if (bVar != null) {
            bVar.mo3857a(this, l, t, oldl, oldt);
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f3413m && View.MeasureSpec.getMode(heightMeasureSpec) != 0 && getChildCount() > 0) {
            View child = getChildAt(0);
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
            int childSize = child.getMeasuredHeight();
            int parentSpace = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - lp.topMargin) - lp.bottomMargin;
            if (childSize < parentSpace) {
                child.measure(FrameLayout.getChildMeasureSpec(widthMeasureSpec, getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin, lp.width), View.MeasureSpec.makeMeasureSpec(parentSpace, 1073741824));
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event) || mo4543q(event);
    }

    /* renamed from: q */
    public boolean mo4543q(KeyEvent event) {
        this.f3403c.setEmpty();
        int i = 130;
        if (!mo4503c()) {
            if (!isFocused() || event.getKeyCode() == 4) {
                return false;
            }
            View currentFocused = findFocus();
            if (currentFocused == this) {
                currentFocused = null;
            }
            View nextFocused = FocusFinder.getInstance().findNextFocus(this, currentFocused, 130);
            if (nextFocused == null || nextFocused == this || !nextFocused.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (event.getAction() != 0) {
            return false;
        } else {
            int keyCode = event.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (event.isShiftPressed()) {
                        i = 33;
                    }
                    mo4487F(i);
                    return false;
                } else if (!event.isAltPressed()) {
                    return mo4502b(130);
                } else {
                    return mo4557t(130);
                }
            } else if (!event.isAltPressed()) {
                return mo4502b(33);
            } else {
                return mo4557t(33);
            }
        }
    }

    /* renamed from: v */
    public final boolean mo4559v(int x, int y) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View child = getChildAt(0);
        if (y < child.getTop() - scrollY || y >= child.getBottom() - scrollY || x < child.getLeft() || x >= child.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final void mo4560w() {
        VelocityTracker velocityTracker = this.f3412l;
        if (velocityTracker == null) {
            this.f3412l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: y */
    public final void mo4562y() {
        if (this.f3412l == null) {
            this.f3412l = VelocityTracker.obtain();
        }
    }

    /* renamed from: G */
    public final void mo4488G() {
        VelocityTracker velocityTracker = this.f3412l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3412l = null;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        if (disallowIntercept) {
            mo4488G();
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        MotionEvent motionEvent = ev;
        int action = ev.getAction();
        if (action == 2 && this.f3411k) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int activePointerId = this.f3418r;
                    if (activePointerId != -1) {
                        int pointerIndex = motionEvent.findPointerIndex(activePointerId);
                        if (pointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + activePointerId + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(pointerIndex);
                            if (Math.abs(y - this.f3407g) > this.f3415o && (2 & getNestedScrollAxes()) == 0) {
                                this.f3411k = true;
                                this.f3407g = y;
                                mo4562y();
                                this.f3412l.addMovement(motionEvent);
                                this.f3421u = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        mo4485D(ev);
                    }
                }
            }
            this.f3411k = false;
            this.f3418r = -1;
            mo4488G();
            if (this.f3404d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C0460r.m2246U(this);
            }
            mo4496O(0);
        } else {
            int y2 = (int) ev.getY();
            if (!mo4559v((int) ev.getX(), y2)) {
                this.f3411k = false;
                mo4488G();
            } else {
                this.f3407g = y2;
                this.f3418r = motionEvent.getPointerId(0);
                mo4560w();
                this.f3412l.addMovement(motionEvent);
                this.f3404d.computeScrollOffset();
                this.f3411k = true ^ this.f3404d.isFinished();
                mo4495N(2, 0);
            }
        }
        return this.f3411k;
    }

    public boolean onTouchEvent(MotionEvent ev) {
        ViewParent parent;
        int deltaY;
        MotionEvent motionEvent = ev;
        mo4562y();
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            this.f3421u = 0;
        }
        MotionEvent vtev = MotionEvent.obtain(ev);
        vtev.offsetLocation(0.0f, (float) this.f3421u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f3412l;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f3417q);
                int initialVelocity = (int) velocityTracker.getYVelocity(this.f3418r);
                if (Math.abs(initialVelocity) <= this.f3416p) {
                    if (this.f3404d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        C0460r.m2246U(this);
                    }
                } else if (!dispatchNestedPreFling(0.0f, (float) (-initialVelocity))) {
                    dispatchNestedFling(0.0f, (float) (-initialVelocity), true);
                    mo4549s(-initialVelocity);
                }
                this.f3418r = -1;
                mo4527j();
            } else if (actionMasked == 2) {
                int activePointerIndex = motionEvent.findPointerIndex(this.f3418r);
                if (activePointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f3418r + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(activePointerIndex);
                    int deltaY2 = this.f3407g - y;
                    if (mo4518f(0, deltaY2, this.f3420t, this.f3419s, 0)) {
                        deltaY2 -= this.f3420t[1];
                        this.f3421u += this.f3419s[1];
                    }
                    if (this.f3411k || Math.abs(deltaY2) <= this.f3415o) {
                        deltaY = deltaY2;
                    } else {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f3411k = true;
                        if (deltaY2 > 0) {
                            deltaY = deltaY2 - this.f3415o;
                        } else {
                            deltaY = deltaY2 + this.f3415o;
                        }
                    }
                    if (this.f3411k) {
                        this.f3407g = y - this.f3419s[1];
                        int oldY = getScrollY();
                        int range = getScrollRange();
                        int overscrollMode = getOverScrollMode();
                        boolean canOverscroll = overscrollMode == 0 || (overscrollMode == 1 && range > 0);
                        int i = overscrollMode;
                        int range2 = range;
                        int i2 = y;
                        int activePointerIndex2 = activePointerIndex;
                        if (mo4486E(0, deltaY, 0, getScrollY(), 0, range, 0, 0, true) && !mo4558u(0)) {
                            this.f3412l.clear();
                        }
                        int scrolledDeltaY = getScrollY() - oldY;
                        int[] iArr = this.f3420t;
                        iArr[1] = 0;
                        mo4519g(0, scrolledDeltaY, 0, deltaY - scrolledDeltaY, this.f3419s, 0, iArr);
                        int i3 = this.f3407g;
                        int[] iArr2 = this.f3419s;
                        this.f3407g = i3 - iArr2[1];
                        this.f3421u += iArr2[1];
                        if (canOverscroll) {
                            int deltaY3 = deltaY - this.f3420t[1];
                            mo4542p();
                            int pulledToY = oldY + deltaY3;
                            if (pulledToY < 0) {
                                C0485d.m2414a(this.f3405e, ((float) deltaY3) / ((float) getHeight()), motionEvent.getX(activePointerIndex2) / ((float) getWidth()));
                                if (!this.f3406f.isFinished()) {
                                    this.f3406f.onRelease();
                                    int i4 = range2;
                                } else {
                                    int i5 = range2;
                                }
                            } else {
                                int activePointerIndex3 = activePointerIndex2;
                                if (pulledToY > range2) {
                                    C0485d.m2414a(this.f3406f, ((float) deltaY3) / ((float) getHeight()), 1.0f - (motionEvent.getX(activePointerIndex3) / ((float) getWidth())));
                                    if (!this.f3405e.isFinished()) {
                                        this.f3405e.onRelease();
                                    }
                                }
                            }
                            EdgeEffect edgeEffect = this.f3405e;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f3406f.isFinished())) {
                                C0460r.m2246U(this);
                            }
                            int i6 = deltaY3;
                        } else {
                            int i7 = range2;
                            int i8 = activePointerIndex2;
                        }
                    } else {
                        int i9 = activePointerIndex;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f3411k != 0 && getChildCount() > 0 && this.f3404d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0460r.m2246U(this);
                }
                this.f3418r = -1;
                mo4527j();
            } else if (actionMasked == 5) {
                int index = ev.getActionIndex();
                this.f3407g = (int) motionEvent.getY(index);
                this.f3418r = motionEvent.getPointerId(index);
            } else if (actionMasked == 6) {
                mo4485D(ev);
                this.f3407g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f3418r));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z = !this.f3404d.isFinished();
            this.f3411k = z;
            if (z && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f3404d.isFinished()) {
                mo4497a();
            }
            this.f3407g = (int) ev.getY();
            this.f3418r = motionEvent.getPointerId(0);
            mo4495N(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f3412l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(vtev);
        }
        vtev.recycle();
        return true;
    }

    /* renamed from: D */
    public final void mo4485D(MotionEvent ev) {
        int pointerIndex = ev.getActionIndex();
        if (ev.getPointerId(pointerIndex) == this.f3418r) {
            int newPointerIndex = pointerIndex == 0 ? 1 : 0;
            this.f3407g = (int) ev.getY(newPointerIndex);
            this.f3418r = ev.getPointerId(newPointerIndex);
            VelocityTracker velocityTracker = this.f3412l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent event) {
        if ((event.getSource() & 2) == 0 || event.getAction() != 8 || this.f3411k) {
            return false;
        }
        float vscroll = event.getAxisValue(9);
        if (vscroll == 0.0f) {
            return false;
        }
        int range = getScrollRange();
        int oldScrollY = getScrollY();
        int newScrollY = oldScrollY - ((int) (getVerticalScrollFactorCompat() * vscroll));
        if (newScrollY < 0) {
            newScrollY = 0;
        } else if (newScrollY > range) {
            newScrollY = range;
        }
        if (newScrollY == oldScrollY) {
            return false;
        }
        super.scrollTo(getScrollX(), newScrollY);
        return true;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f3426z == 0.0f) {
            TypedValue outValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, outValue, true)) {
                this.f3426z = outValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f3426z;
    }

    public void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        super.scrollTo(scrollX, scrollY);
    }

    /* renamed from: E */
    public boolean mo4486E(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
        int maxOverScrollX2;
        int maxOverScrollY2;
        boolean clampedX;
        boolean clampedY;
        int overScrollMode = getOverScrollMode();
        boolean canScrollHorizontal = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean canScrollVertical = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean overScrollHorizontal = overScrollMode == 0 || (overScrollMode == 1 && canScrollHorizontal);
        boolean overScrollVertical = overScrollMode == 0 || (overScrollMode == 1 && canScrollVertical);
        int newScrollX = scrollX + deltaX;
        if (!overScrollHorizontal) {
            maxOverScrollX2 = 0;
        } else {
            maxOverScrollX2 = maxOverScrollX;
        }
        int newScrollY = scrollY + deltaY;
        if (!overScrollVertical) {
            maxOverScrollY2 = 0;
        } else {
            maxOverScrollY2 = maxOverScrollY;
        }
        int left = -maxOverScrollX2;
        int right = maxOverScrollX2 + scrollRangeX;
        int top = -maxOverScrollY2;
        int bottom = maxOverScrollY2 + scrollRangeY;
        if (newScrollX > right) {
            newScrollX = right;
            clampedX = true;
        } else if (newScrollX < left) {
            newScrollX = left;
            clampedX = true;
        } else {
            clampedX = false;
        }
        if (newScrollY > bottom) {
            newScrollY = bottom;
            clampedY = true;
        } else if (newScrollY < top) {
            newScrollY = top;
            clampedY = true;
        } else {
            clampedY = false;
        }
        if (clampedY) {
            int i = overScrollMode;
            if (!mo4558u(1)) {
                this.f3404d.springBack(newScrollX, newScrollY, 0, 0, 0, getScrollRange());
            }
        }
        onOverScrolled(newScrollX, newScrollY, clampedX, clampedY);
        return clampedX || clampedY;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        return Math.max(0, ((child.getHeight() + lp.topMargin) + lp.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* renamed from: r */
    public final View mo4544r(boolean topFocus, int top, int bottom) {
        List<View> focusables = getFocusables(2);
        View focusCandidate = null;
        boolean foundFullyContainedFocusable = false;
        int count = focusables.size();
        for (int i = 0; i < count; i++) {
            View view = focusables.get(i);
            int viewTop = view.getTop();
            int viewBottom = view.getBottom();
            if (top < viewBottom && viewTop < bottom) {
                boolean viewIsCloserToBoundary = false;
                boolean viewIsFullyContained = top < viewTop && viewBottom < bottom;
                if (focusCandidate == null) {
                    focusCandidate = view;
                    foundFullyContainedFocusable = viewIsFullyContained;
                } else {
                    if ((topFocus && viewTop < focusCandidate.getTop()) || (!topFocus && viewBottom > focusCandidate.getBottom())) {
                        viewIsCloserToBoundary = true;
                    }
                    if (foundFullyContainedFocusable) {
                        if (viewIsFullyContained && viewIsCloserToBoundary) {
                            focusCandidate = view;
                        }
                    } else if (viewIsFullyContained) {
                        focusCandidate = view;
                        foundFullyContainedFocusable = true;
                    } else if (viewIsCloserToBoundary) {
                        focusCandidate = view;
                    }
                }
            }
        }
        return focusCandidate;
    }

    /* renamed from: F */
    public boolean mo4487F(int direction) {
        boolean down = direction == 130;
        int height = getHeight();
        if (down) {
            this.f3403c.top = getScrollY() + height;
            int count = getChildCount();
            if (count > 0) {
                View view = getChildAt(count - 1);
                int bottom = view.getBottom() + ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f3403c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f3403c.top = getScrollY() - height;
            Rect rect2 = this.f3403c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f3403c;
        int i = rect3.top;
        int i2 = i + height;
        rect3.bottom = i2;
        return mo4490I(direction, i, i2);
    }

    /* renamed from: t */
    public boolean mo4557t(int direction) {
        int count;
        boolean down = direction == 130;
        int height = getHeight();
        Rect rect = this.f3403c;
        rect.top = 0;
        rect.bottom = height;
        if (down && (count = getChildCount()) > 0) {
            View view = getChildAt(count - 1);
            this.f3403c.bottom = view.getBottom() + ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f3403c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3403c;
        return mo4490I(direction, rect3.top, rect3.bottom);
    }

    /* renamed from: I */
    public final boolean mo4490I(int direction, int top, int bottom) {
        boolean handled = true;
        int height = getHeight();
        int containerTop = getScrollY();
        int containerBottom = containerTop + height;
        boolean up = direction == 33;
        View newFocused = mo4544r(up, top, bottom);
        if (newFocused == null) {
            newFocused = this;
        }
        if (top < containerTop || bottom > containerBottom) {
            mo4525h(up ? top - containerTop : bottom - containerBottom);
        } else {
            handled = false;
        }
        if (newFocused != findFocus()) {
            newFocused.requestFocus(direction);
        }
        return handled;
    }

    /* renamed from: b */
    public boolean mo4502b(int direction) {
        View currentFocused = findFocus();
        if (currentFocused == this) {
            currentFocused = null;
        }
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, currentFocused, direction);
        int maxJump = getMaxScrollAmount();
        if (nextFocused == null || !mo4483B(nextFocused, maxJump, getHeight())) {
            int scrollDelta = maxJump;
            if (direction == 33 && getScrollY() < scrollDelta) {
                scrollDelta = getScrollY();
            } else if (direction == 130 && getChildCount() > 0) {
                View child = getChildAt(0);
                scrollDelta = Math.min((child.getBottom() + ((FrameLayout.LayoutParams) child.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxJump);
            }
            if (scrollDelta == 0) {
                return false;
            }
            mo4525h(direction == 130 ? scrollDelta : -scrollDelta);
        } else {
            nextFocused.getDrawingRect(this.f3403c);
            offsetDescendantRectToMyCoords(nextFocused, this.f3403c);
            mo4525h(mo4517e(this.f3403c));
            nextFocused.requestFocus(direction);
        }
        if (currentFocused == null || !currentFocused.isFocused() || !mo4563z(currentFocused)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* renamed from: z */
    public final boolean mo4563z(View descendant) {
        return !mo4483B(descendant, 0, getHeight());
    }

    /* renamed from: B */
    public final boolean mo4483B(View descendant, int delta, int height) {
        descendant.getDrawingRect(this.f3403c);
        offsetDescendantRectToMyCoords(descendant, this.f3403c);
        return this.f3403c.bottom + delta >= getScrollY() && this.f3403c.top - delta <= getScrollY() + height;
    }

    /* renamed from: h */
    public final void mo4525h(int delta) {
        if (delta == 0) {
            return;
        }
        if (this.f3414n) {
            mo4493L(0, delta);
        } else {
            scrollBy(0, delta);
        }
    }

    /* renamed from: L */
    public final void mo4493L(int dx, int dy) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f3402b > 250) {
                View child = getChildAt(0);
                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
                int childSize = child.getHeight() + lp.topMargin + lp.bottomMargin;
                int parentSpace = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                this.f3404d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(scrollY + dy, Math.max(0, childSize - parentSpace))) - scrollY);
                mo4489H(false);
            } else {
                if (!this.f3404d.isFinished()) {
                    mo4497a();
                }
                scrollBy(dx, dy);
            }
            this.f3402b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: M */
    public final void mo4494M(int x, int y) {
        mo4493L(x - getScrollX(), y - getScrollY());
    }

    public int computeVerticalScrollRange() {
        int count = getChildCount();
        int parentSpace = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (count == 0) {
            return parentSpace;
        }
        View child = getChildAt(0);
        int scrollRange = child.getBottom() + ((FrameLayout.LayoutParams) child.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int overscrollBottom = Math.max(0, scrollRange - parentSpace);
        if (scrollY < 0) {
            return scrollRange - scrollY;
        }
        if (scrollY > overscrollBottom) {
            return scrollRange + (scrollY - overscrollBottom);
        }
        return scrollRange;
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        child.measure(FrameLayout.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight(), child.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        child.measure(FrameLayout.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin + widthUsed, lp.width), View.MeasureSpec.makeMeasureSpec(lp.topMargin + lp.bottomMargin, 0));
    }

    public void computeScroll() {
        if (!this.f3404d.isFinished()) {
            this.f3404d.computeScrollOffset();
            int y = this.f3404d.getCurrY();
            int unconsumed = y - this.f3422v;
            this.f3422v = y;
            int[] iArr = this.f3420t;
            boolean canOverscroll = true;
            iArr[1] = 0;
            mo4518f(0, unconsumed, iArr, (int[]) null, 1);
            int unconsumed2 = unconsumed - this.f3420t[1];
            int range = getScrollRange();
            if (unconsumed2 != 0) {
                int oldScrollY = getScrollY();
                mo4486E(0, unconsumed2, getScrollX(), oldScrollY, 0, range, 0, 0, false);
                int scrolledByMe = getScrollY() - oldScrollY;
                int unconsumed3 = unconsumed2 - scrolledByMe;
                int[] iArr2 = this.f3420t;
                iArr2[1] = 0;
                mo4519g(0, scrolledByMe, 0, unconsumed3, this.f3419s, 1, iArr2);
                unconsumed2 = unconsumed3 - this.f3420t[1];
            }
            if (unconsumed2 != 0) {
                int mode = getOverScrollMode();
                if (mode != 0 && (mode != 1 || range <= 0)) {
                    canOverscroll = false;
                }
                if (canOverscroll) {
                    mo4542p();
                    if (unconsumed2 < 0) {
                        if (this.f3405e.isFinished()) {
                            this.f3405e.onAbsorb((int) this.f3404d.getCurrVelocity());
                        }
                    } else if (this.f3406f.isFinished()) {
                        this.f3406f.onAbsorb((int) this.f3404d.getCurrVelocity());
                    }
                }
                mo4497a();
            }
            if (!this.f3404d.isFinished()) {
                C0460r.m2246U(this);
            }
        }
    }

    /* renamed from: H */
    public final void mo4489H(boolean participateInNestedScrolling) {
        if (participateInNestedScrolling) {
            mo4495N(2, 1);
        } else {
            mo4496O(1);
        }
        this.f3422v = getScrollY();
        C0460r.m2246U(this);
    }

    /* renamed from: a */
    public final void mo4497a() {
        this.f3404d.abortAnimation();
        mo4496O(1);
    }

    /* renamed from: J */
    public final void mo4491J(View child) {
        child.getDrawingRect(this.f3403c);
        offsetDescendantRectToMyCoords(child, this.f3403c);
        int scrollDelta = mo4517e(this.f3403c);
        if (scrollDelta != 0) {
            scrollBy(0, scrollDelta);
        }
    }

    /* renamed from: K */
    public final boolean mo4492K(Rect rect, boolean immediate) {
        int delta = mo4517e(rect);
        boolean scroll = delta != 0;
        if (scroll) {
            if (immediate) {
                scrollBy(0, delta);
            } else {
                mo4493L(0, delta);
            }
        }
        return scroll;
    }

    /* renamed from: e */
    public int mo4517e(Rect rect) {
        int scrollYDelta;
        int scrollYDelta2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int screenTop = getScrollY();
        int screenBottom = screenTop + height;
        int actualScreenBottom = screenBottom;
        int fadingEdge = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            screenTop += fadingEdge;
        }
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        if (rect.bottom < child.getHeight() + lp.topMargin + lp.bottomMargin) {
            screenBottom -= fadingEdge;
        }
        int i = rect.bottom;
        if (i > screenBottom && rect.top > screenTop) {
            if (rect.height() > height) {
                scrollYDelta2 = 0 + (rect.top - screenTop);
            } else {
                scrollYDelta2 = 0 + (rect.bottom - screenBottom);
            }
            return Math.min(scrollYDelta2, (child.getBottom() + lp.bottomMargin) - actualScreenBottom);
        } else if (rect.top >= screenTop || i >= screenBottom) {
            return 0;
        } else {
            if (rect.height() > height) {
                scrollYDelta = 0 - (screenBottom - rect.bottom);
            } else {
                scrollYDelta = 0 - (screenTop - rect.top);
            }
            return Math.max(scrollYDelta, -getScrollY());
        }
    }

    public void requestChildFocus(View child, View focused) {
        if (!this.f3408h) {
            mo4491J(focused);
        } else {
            this.f3410j = focused;
        }
        super.requestChildFocus(child, focused);
    }

    public boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        View nextFocus;
        if (direction == 2) {
            direction = 130;
        } else if (direction == 1) {
            direction = 33;
        }
        if (previouslyFocusedRect == null) {
            nextFocus = FocusFinder.getInstance().findNextFocus(this, (View) null, direction);
        } else {
            nextFocus = FocusFinder.getInstance().findNextFocusFromRect(this, previouslyFocusedRect, direction);
        }
        if (nextFocus != null && !mo4563z(nextFocus)) {
            return nextFocus.requestFocus(direction, previouslyFocusedRect);
        }
        return false;
    }

    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        rectangle.offset(child.getLeft() - child.getScrollX(), child.getTop() - child.getScrollY());
        return mo4492K(rectangle, immediate);
    }

    public void requestLayout() {
        this.f3408h = true;
        super.requestLayout();
    }

    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        this.f3408h = false;
        View view = this.f3410j;
        if (view != null && m4088A(view, this)) {
            mo4491J(this.f3410j);
        }
        this.f3410j = null;
        if (!this.f3409i) {
            if (this.f3423w != null) {
                scrollTo(getScrollX(), this.f3423w.f3427b);
                this.f3423w = null;
            }
            int childSize = 0;
            if (getChildCount() > 0) {
                View child = getChildAt(0);
                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
                childSize = child.getMeasuredHeight() + lp.topMargin + lp.bottomMargin;
            }
            int parentSpace = ((b - t) - getPaddingTop()) - getPaddingBottom();
            int currentScrollY = getScrollY();
            int newScrollY = m4089d(currentScrollY, parentSpace, childSize);
            if (newScrollY != currentScrollY) {
                scrollTo(getScrollX(), newScrollY);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3409i = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3409i = false;
    }

    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        View currentFocused = findFocus();
        if (currentFocused != null && this != currentFocused && mo4483B(currentFocused, 0, oldh)) {
            currentFocused.getDrawingRect(this.f3403c);
            offsetDescendantRectToMyCoords(currentFocused, this.f3403c);
            mo4525h(mo4517e(this.f3403c));
        }
    }

    /* renamed from: A */
    public static boolean m4088A(View child, View parent) {
        if (child == parent) {
            return true;
        }
        ViewParent theParent = child.getParent();
        if (!(theParent instanceof ViewGroup) || !m4088A((View) theParent, parent)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public void mo4549s(int velocityY) {
        if (getChildCount() > 0) {
            this.f3404d.fling(getScrollX(), getScrollY(), 0, velocityY, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, 0, 0);
            mo4489H(true);
        }
    }

    /* renamed from: j */
    public final void mo4527j() {
        this.f3411k = false;
        mo4488G();
        mo4496O(0);
        EdgeEffect edgeEffect = this.f3405e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f3406f.onRelease();
        }
    }

    public void scrollTo(int x, int y) {
        if (getChildCount() > 0) {
            View child = getChildAt(0);
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
            int x2 = m4089d(x, (getWidth() - getPaddingLeft()) - getPaddingRight(), child.getWidth() + lp.leftMargin + lp.rightMargin);
            int y2 = m4089d(y, (getHeight() - getPaddingTop()) - getPaddingBottom(), child.getHeight() + lp.topMargin + lp.bottomMargin);
            if (x2 != getScrollX() || y2 != getScrollY()) {
                super.scrollTo(x2, y2);
            }
        }
    }

    /* renamed from: p */
    public final void mo4542p() {
        if (getOverScrollMode() == 2) {
            this.f3405e = null;
            this.f3406f = null;
        } else if (this.f3405e == null) {
            Context context = getContext();
            this.f3405e = new EdgeEffect(context);
            this.f3406f = new EdgeEffect(context);
        }
    }

    public void draw(Canvas canvas) {
        int i = Build.VERSION.SDK_INT;
        super.draw(canvas);
        if (this.f3405e != null) {
            int scrollY = getScrollY();
            if (!this.f3405e.isFinished()) {
                int restoreCount = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int xTranslation = 0;
                int yTranslation = Math.min(0, scrollY);
                if (i < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    xTranslation = 0 + getPaddingLeft();
                }
                if (i >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    yTranslation += getPaddingTop();
                }
                canvas.translate((float) xTranslation, (float) yTranslation);
                this.f3405e.setSize(width, height);
                if (this.f3405e.draw(canvas)) {
                    C0460r.m2246U(this);
                }
                canvas.restoreToCount(restoreCount);
            }
            if (!this.f3406f.isFinished()) {
                int restoreCount2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int xTranslation2 = 0;
                int yTranslation2 = Math.max(getScrollRange(), scrollY) + height2;
                if (i < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    xTranslation2 = 0 + getPaddingLeft();
                }
                if (i >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    yTranslation2 -= getPaddingBottom();
                }
                canvas.translate((float) (xTranslation2 - width2), (float) yTranslation2);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f3406f.setSize(width2, height2);
                if (this.f3406f.draw(canvas)) {
                    C0460r.m2246U(this);
                }
                canvas.restoreToCount(restoreCount2);
            }
        }
    }

    /* renamed from: d */
    public static int m4089d(int n, int my, int child) {
        if (my >= child || n < 0) {
            return 0;
        }
        if (my + n > child) {
            return child - my;
        }
        return n;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof C0835c)) {
            super.onRestoreInstanceState(state);
            return;
        }
        C0835c ss = (C0835c) state;
        super.onRestoreInstanceState(ss.getSuperState());
        this.f3423w = ss;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C0835c ss = new C0835c(super.onSaveInstanceState());
        ss.f3427b = getScrollY();
        return ss;
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public static class C0835c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0835c> CREATOR = new C0836a();

        /* renamed from: b */
        public int f3427b;

        public C0835c(Parcelable superState) {
            super(superState);
        }

        public C0835c(Parcel source) {
            super(source);
            this.f3427b = source.readInt();
        }

        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeInt(this.f3427b);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3427b + "}";
        }

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        public static class C0836a implements Parcelable.Creator<C0835c> {
            /* renamed from: a */
            public C0835c createFromParcel(Parcel in) {
                return new C0835c(in);
            }

            /* renamed from: b */
            public C0835c[] newArray(int size) {
                return new C0835c[size];
            }
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C0833a extends C0420a {
        /* renamed from: j */
        public boolean mo2427j(View host, int action, Bundle arguments) {
            if (super.mo2427j(host, action, arguments)) {
                return true;
            }
            NestedScrollView nsvHost = (NestedScrollView) host;
            if (!nsvHost.isEnabled()) {
                return false;
            }
            if (action == 4096) {
                int targetScrollY = Math.min(nsvHost.getScrollY() + ((nsvHost.getHeight() - nsvHost.getPaddingBottom()) - nsvHost.getPaddingTop()), nsvHost.getScrollRange());
                if (targetScrollY == nsvHost.getScrollY()) {
                    return false;
                }
                nsvHost.mo4494M(0, targetScrollY);
                return true;
            } else if (action != 8192) {
                return false;
            } else {
                int targetScrollY2 = Math.max(nsvHost.getScrollY() - ((nsvHost.getHeight() - nsvHost.getPaddingBottom()) - nsvHost.getPaddingTop()), 0);
                if (targetScrollY2 == nsvHost.getScrollY()) {
                    return false;
                }
                nsvHost.mo4494M(0, targetScrollY2);
                return true;
            }
        }

        /* renamed from: g */
        public void mo2424g(View host, C0424c info) {
            int scrollRange;
            super.mo2424g(host, info);
            NestedScrollView nsvHost = (NestedScrollView) host;
            info.mo2459V(ScrollView.class.getName());
            if (nsvHost.isEnabled() && (scrollRange = nsvHost.getScrollRange()) > 0) {
                info.mo2490m0(true);
                if (nsvHost.getScrollY() > 0) {
                    info.mo2464a(8192);
                }
                if (nsvHost.getScrollY() < scrollRange) {
                    info.mo2464a(4096);
                }
            }
        }

        /* renamed from: f */
        public void mo2423f(View host, AccessibilityEvent event) {
            super.mo2423f(host, event);
            NestedScrollView nsvHost = (NestedScrollView) host;
            event.setClassName(ScrollView.class.getName());
            event.setScrollable(nsvHost.getScrollRange() > 0);
            event.setScrollX(nsvHost.getScrollX());
            event.setScrollY(nsvHost.getScrollY());
            C0431e.m2158a(event, nsvHost.getScrollX());
            C0431e.m2159b(event, nsvHost.getScrollRange());
        }
    }
}
