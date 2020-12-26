package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000a.p025h.p033h.C0379a;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.p039a0.C0424c;
import p000a.p025h.p038m.p039a0.C0432f;
import p000a.p043j.p044a.C0501a;
import p000a.p043j.p045b.C0512c;
import p066b.p067a.p068a.p069a.C0924b;
import p066b.p067a.p068a.p069a.C0928d;
import p066b.p067a.p068a.p069a.C0989j;
import p066b.p067a.p068a.p069a.C1020k;
import p066b.p067a.p068a.p069a.p073d0.C0932c;
import p066b.p067a.p068a.p069a.p076g0.C0953g;
import p066b.p067a.p068a.p069a.p076g0.C0960k;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.C0824c<V> {

    /* renamed from: K */
    public static final int f4699K = C0989j.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    public int f4700A;

    /* renamed from: B */
    public WeakReference<V> f4701B;

    /* renamed from: C */
    public WeakReference<View> f4702C;

    /* renamed from: D */
    public final ArrayList<C1148e> f4703D = new ArrayList<>();

    /* renamed from: E */
    public VelocityTracker f4704E;

    /* renamed from: F */
    public int f4705F;

    /* renamed from: G */
    public int f4706G;

    /* renamed from: H */
    public boolean f4707H;

    /* renamed from: I */
    public Map<View, Integer> f4708I;

    /* renamed from: J */
    public final C0512c.C0515c f4709J = new C1146c();

    /* renamed from: a */
    public int f4710a = 0;

    /* renamed from: b */
    public boolean f4711b = true;

    /* renamed from: c */
    public float f4712c;

    /* renamed from: d */
    public int f4713d;

    /* renamed from: e */
    public boolean f4714e;

    /* renamed from: f */
    public int f4715f;

    /* renamed from: g */
    public boolean f4716g;

    /* renamed from: h */
    public C0953g f4717h;

    /* renamed from: i */
    public C0960k f4718i;

    /* renamed from: j */
    public boolean f4719j;

    /* renamed from: k */
    public BottomSheetBehavior<V>.g f4720k = null;

    /* renamed from: l */
    public ValueAnimator f4721l;

    /* renamed from: m */
    public int f4722m;

    /* renamed from: n */
    public int f4723n;

    /* renamed from: o */
    public int f4724o;

    /* renamed from: p */
    public float f4725p = 0.5f;

    /* renamed from: q */
    public int f4726q;

    /* renamed from: r */
    public float f4727r = -1.0f;

    /* renamed from: s */
    public boolean f4728s;

    /* renamed from: t */
    public boolean f4729t;

    /* renamed from: u */
    public int f4730u = 4;

    /* renamed from: v */
    public C0512c f4731v;

    /* renamed from: w */
    public boolean f4732w;

    /* renamed from: x */
    public int f4733x;

    /* renamed from: y */
    public boolean f4734y;

    /* renamed from: z */
    public int f4735z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public static abstract class C1148e {
        /* renamed from: a */
        public abstract void mo6567a(View view, float f);

        /* renamed from: b */
        public abstract void mo6568b(View view, int i);
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        int i;
        TypedArray a = context.obtainStyledAttributes(attrs, C1020k.f4217d);
        this.f4716g = a.hasValue(C1020k.f4260n);
        int i2 = C1020k.f4227f;
        boolean hasBackgroundTint = a.hasValue(i2);
        if (hasBackgroundTint) {
            mo6540N(context, attrs, hasBackgroundTint, C0932c.m5073a(context, a, i2));
        } else {
            mo6539M(context, attrs, hasBackgroundTint);
        }
        mo6541O();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f4727r = a.getDimension(C1020k.f4222e, -1.0f);
        }
        int i3 = C1020k.f4248k;
        TypedValue value = a.peekValue(i3);
        if (value == null || (i = value.data) != -1) {
            mo6552Z(a.getDimensionPixelSize(i3, -1));
        } else {
            mo6552Z(i);
        }
        mo6551Y(a.getBoolean(C1020k.f4244j, false));
        mo6549W(a.getBoolean(C1020k.f4236h, true));
        mo6555c0(a.getBoolean(C1020k.f4256m, false));
        mo6554b0(a.getInt(C1020k.f4252l, 0));
        mo6550X(a.getFloat(C1020k.f4240i, 0.5f));
        mo6548V(a.getInt(C1020k.f4232g, 0));
        a.recycle();
        this.f4712c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: y */
    public Parcelable mo4438y(CoordinatorLayout parent, V child) {
        return new C1149f(super.mo4438y(parent, child), (BottomSheetBehavior<?>) this);
    }

    /* renamed from: x */
    public void mo4437x(CoordinatorLayout parent, V child, Parcelable state) {
        C1149f ss = (C1149f) state;
        super.mo4437x(parent, child, ss.mo2682f());
        mo6547U(ss);
        int i = ss.f4743d;
        if (i == 1 || i == 2) {
            this.f4730u = 4;
        } else {
            this.f4730u = i;
        }
    }

    /* renamed from: g */
    public void mo4420g(CoordinatorLayout.C0827f layoutParams) {
        super.mo4420g(layoutParams);
        this.f4701B = null;
        this.f4731v = null;
    }

    /* renamed from: j */
    public void mo4423j() {
        super.mo4423j();
        this.f4701B = null;
        this.f4731v = null;
    }

    /* renamed from: l */
    public boolean mo4425l(CoordinatorLayout parent, V child, int layoutDirection) {
        C0953g gVar;
        if (C0460r.m2288s(parent) && !C0460r.m2288s(child)) {
            child.setFitsSystemWindows(true);
        }
        if (this.f4701B == null) {
            this.f4715f = parent.getResources().getDimensionPixelSize(C0928d.design_bottom_sheet_peek_height_min);
            this.f4701B = new WeakReference<>(child);
            if (this.f4716g && (gVar = this.f4717h) != null) {
                C0460r.m2263f0(child, gVar);
            }
            C0953g gVar2 = this.f4717h;
            if (gVar2 != null) {
                float f = this.f4727r;
                if (f == -1.0f) {
                    f = C0460r.m2284q(child);
                }
                gVar2.mo5587S(f);
                boolean z = this.f4730u == 3;
                this.f4719j = z;
                this.f4717h.mo5589U(z ? 0.0f : 1.0f);
            }
            mo6562j0();
            if (C0460r.m2290t(child) == 0) {
                C0460r.m2275l0(child, 1);
            }
        }
        if (this.f4731v == null) {
            this.f4731v = C0512c.m2533m(parent, this.f4709J);
        }
        int savedTop = child.getTop();
        parent.mo4350I(child, layoutDirection);
        this.f4735z = parent.getWidth();
        int height = parent.getHeight();
        this.f4700A = height;
        this.f4723n = Math.max(0, height - child.getHeight());
        mo6538L();
        mo6537K();
        int i = this.f4730u;
        if (i == 3) {
            C0460r.m2241P(child, mo6544R());
        } else if (i == 6) {
            C0460r.m2241P(child, this.f4724o);
        } else if (this.f4728s && i == 5) {
            C0460r.m2241P(child, this.f4700A);
        } else if (i == 4) {
            C0460r.m2241P(child, this.f4726q);
        } else if (i == 1 || i == 2) {
            C0460r.m2241P(child, savedTop - child.getTop());
        }
        this.f4702C = new WeakReference<>(mo6543Q(child));
        return true;
    }

    /* renamed from: k */
    public boolean mo4424k(CoordinatorLayout parent, V child, MotionEvent event) {
        C0512c cVar;
        if (!child.isShown()) {
            this.f4732w = true;
            return false;
        }
        int action = event.getActionMasked();
        if (action == 0) {
            mo6546T();
        }
        if (this.f4704E == null) {
            this.f4704E = VelocityTracker.obtain();
        }
        this.f4704E.addMovement(event);
        View scroll = null;
        if (action == 0) {
            int initialX = (int) event.getX();
            this.f4706G = (int) event.getY();
            if (this.f4730u != 2) {
                WeakReference<View> weakReference = this.f4702C;
                View scroll2 = weakReference != null ? (View) weakReference.get() : null;
                if (scroll2 != null && parent.mo4343B(scroll2, initialX, this.f4706G)) {
                    this.f4705F = event.getPointerId(event.getActionIndex());
                    this.f4707H = true;
                }
            }
            this.f4732w = this.f4705F == -1 && !parent.mo4343B(child, initialX, this.f4706G);
        } else if (action == 1 || action == 3) {
            this.f4707H = false;
            this.f4705F = -1;
            if (this.f4732w) {
                this.f4732w = false;
                return false;
            }
        }
        if (!this.f4732w && (cVar = this.f4731v) != null && cVar.mo2736G(event)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f4702C;
        if (weakReference2 != null) {
            scroll = (View) weakReference2.get();
        }
        if (action != 2 || scroll == null || this.f4732w || this.f4730u == 1 || parent.mo4343B(scroll, (int) event.getX(), (int) event.getY()) || this.f4731v == null || Math.abs(((float) this.f4706G) - event.getY()) <= ((float) this.f4731v.mo2757u())) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public boolean mo4413D(CoordinatorLayout parent, V child, MotionEvent event) {
        if (!child.isShown()) {
            return false;
        }
        int action = event.getActionMasked();
        if (this.f4730u == 1 && action == 0) {
            return true;
        }
        C0512c cVar = this.f4731v;
        if (cVar != null) {
            cVar.mo2762z(event);
        }
        if (action == 0) {
            mo6546T();
        }
        if (this.f4704E == null) {
            this.f4704E = VelocityTracker.obtain();
        }
        this.f4704E.addMovement(event);
        if (action == 2 && !this.f4732w && Math.abs(((float) this.f4706G) - event.getY()) > ((float) this.f4731v.mo2757u())) {
            this.f4731v.mo2740b(child, event.getPointerId(event.getActionIndex()));
        }
        return !this.f4732w;
    }

    /* renamed from: A */
    public boolean mo4410A(CoordinatorLayout coordinatorLayout, V v, View directTargetChild, View target, int axes, int type) {
        this.f4733x = 0;
        this.f4734y = false;
        if ((axes & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public void mo4430q(CoordinatorLayout coordinatorLayout, V child, View target, int dx, int dy, int[] consumed, int type) {
        if (type != 1) {
            WeakReference<View> weakReference = this.f4702C;
            if (target == (weakReference != null ? (View) weakReference.get() : null)) {
                int currentTop = child.getTop();
                int newTop = currentTop - dy;
                if (dy > 0) {
                    if (newTop < mo6544R()) {
                        consumed[1] = currentTop - mo6544R();
                        C0460r.m2241P(child, -consumed[1]);
                        mo6557e0(3);
                    } else {
                        consumed[1] = dy;
                        C0460r.m2241P(child, -dy);
                        mo6557e0(1);
                    }
                } else if (dy < 0 && !target.canScrollVertically(-1)) {
                    int i = this.f4726q;
                    if (newTop <= i || this.f4728s) {
                        consumed[1] = dy;
                        C0460r.m2241P(child, -dy);
                        mo6557e0(1);
                    } else {
                        consumed[1] = currentTop - i;
                        C0460r.m2241P(child, -consumed[1]);
                        mo6557e0(4);
                    }
                }
                mo6542P(child.getTop());
                this.f4733x = dy;
                this.f4734y = true;
            }
        }
    }

    /* renamed from: C */
    public void mo4412C(CoordinatorLayout coordinatorLayout, V child, View target, int type) {
        int top;
        int currentTop;
        if (child.getTop() == mo6544R()) {
            mo6557e0(3);
            return;
        }
        WeakReference<View> weakReference = this.f4702C;
        if (weakReference != null && target == weakReference.get() && this.f4734y) {
            if (this.f4733x > 0) {
                currentTop = mo6544R();
                top = 3;
            } else if (this.f4728s != 0 && mo6560h0(child, mo6545S())) {
                currentTop = this.f4700A;
                top = 5;
            } else if (this.f4733x == 0) {
                int currentTop2 = child.getTop();
                if (!this.f4711b) {
                    int top2 = this.f4724o;
                    if (currentTop2 < top2) {
                        if (currentTop2 < Math.abs(currentTop2 - this.f4726q)) {
                            currentTop = this.f4722m;
                            top = 3;
                        } else {
                            currentTop = this.f4724o;
                            top = 6;
                        }
                    } else if (Math.abs(currentTop2 - top2) < Math.abs(currentTop2 - this.f4726q)) {
                        currentTop = this.f4724o;
                        top = 6;
                    } else {
                        currentTop = this.f4726q;
                        top = 4;
                    }
                } else if (Math.abs(currentTop2 - this.f4723n) < Math.abs(currentTop2 - this.f4726q)) {
                    currentTop = this.f4723n;
                    top = 3;
                } else {
                    currentTop = this.f4726q;
                    top = 4;
                }
            } else if (this.f4711b != 0) {
                currentTop = this.f4726q;
                top = 4;
            } else {
                int currentTop3 = child.getTop();
                if (Math.abs(currentTop3 - this.f4724o) < Math.abs(currentTop3 - this.f4726q)) {
                    currentTop = this.f4724o;
                    top = 6;
                } else {
                    currentTop = this.f4726q;
                    top = 4;
                }
            }
            mo6561i0(child, top, currentTop, false);
            this.f4734y = false;
        }
    }

    /* renamed from: t */
    public void mo4433t(CoordinatorLayout coordinatorLayout, V v, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
    }

    /* renamed from: o */
    public boolean mo4428o(CoordinatorLayout coordinatorLayout, V child, View target, float velocityX, float velocityY) {
        WeakReference<View> weakReference = this.f4702C;
        if (weakReference == null || target != weakReference.get()) {
            return false;
        }
        if (this.f4730u != 3 || super.mo4428o(coordinatorLayout, child, target, velocityX, velocityY)) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public void mo6549W(boolean fitToContents) {
        if (this.f4711b != fitToContents) {
            this.f4711b = fitToContents;
            if (this.f4701B != null) {
                mo6537K();
            }
            mo6557e0((!this.f4711b || this.f4730u != 6) ? this.f4730u : 3);
            mo6562j0();
        }
    }

    /* renamed from: Z */
    public void mo6552Z(int peekHeight) {
        mo6553a0(peekHeight, false);
    }

    /* renamed from: a0 */
    public final void mo6553a0(int peekHeight, boolean animate) {
        V view;
        boolean layout = false;
        if (peekHeight == -1) {
            if (!this.f4714e) {
                this.f4714e = true;
                layout = true;
            }
        } else if (this.f4714e || this.f4713d != peekHeight) {
            this.f4714e = false;
            this.f4713d = Math.max(0, peekHeight);
            layout = true;
        }
        if (layout && this.f4701B != null) {
            mo6537K();
            if (this.f4730u == 4 && (view = (View) this.f4701B.get()) != null) {
                if (animate) {
                    mo6559g0(this.f4730u);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: X */
    public void mo6550X(float ratio) {
        if (ratio <= 0.0f || ratio >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f4725p = ratio;
    }

    /* renamed from: V */
    public void mo6548V(int offset) {
        if (offset >= 0) {
            this.f4722m = offset;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: Y */
    public void mo6551Y(boolean hideable) {
        if (this.f4728s != hideable) {
            this.f4728s = hideable;
            if (!hideable && this.f4730u == 5) {
                mo6556d0(4);
            }
            mo6562j0();
        }
    }

    /* renamed from: c0 */
    public void mo6555c0(boolean skipCollapsed) {
        this.f4729t = skipCollapsed;
    }

    /* renamed from: b0 */
    public void mo6554b0(int flags) {
        this.f4710a = flags;
    }

    /* renamed from: d0 */
    public void mo6556d0(int state) {
        if (state != this.f4730u) {
            if (this.f4701B != null) {
                mo6559g0(state);
            } else if (state == 4 || state == 3 || state == 6 || (this.f4728s && state == 5)) {
                this.f4730u = state;
            }
        }
    }

    /* renamed from: g0 */
    public final void mo6559g0(int state) {
        V child = (View) this.f4701B.get();
        if (child != null) {
            ViewParent parent = child.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C0460r.m2234I(child)) {
                mo6558f0(child, state);
            } else {
                child.post(new C1144a(child, state));
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class C1144a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f4736b;

        /* renamed from: c */
        public final /* synthetic */ int f4737c;

        public C1144a(View view, int i) {
            this.f4736b = view;
            this.f4737c = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo6558f0(this.f4736b, this.f4737c);
        }
    }

    /* renamed from: e0 */
    public void mo6557e0(int state) {
        View bottomSheet;
        if (this.f4730u != state) {
            this.f4730u = state;
            WeakReference<V> weakReference = this.f4701B;
            if (weakReference != null && (bottomSheet = (View) weakReference.get()) != null) {
                if (state == 6 || state == 3) {
                    mo6564l0(true);
                } else if (state == 5 || state == 4) {
                    mo6564l0(false);
                }
                mo6563k0(state);
                for (int i = 0; i < this.f4703D.size(); i++) {
                    this.f4703D.get(i).mo6568b(bottomSheet, state);
                }
                mo6562j0();
            }
        }
    }

    /* renamed from: k0 */
    public final void mo6563k0(int state) {
        ValueAnimator valueAnimator;
        if (state != 2) {
            boolean expand = state == 3;
            if (this.f4719j != expand) {
                this.f4719j = expand;
                if (this.f4717h != null && (valueAnimator = this.f4721l) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f4721l.reverse();
                        return;
                    }
                    float to = expand ? 0.0f : 1.0f;
                    this.f4721l.setFloatValues(new float[]{1.0f - to, to});
                    this.f4721l.start();
                }
            }
        }
    }

    /* renamed from: K */
    public final void mo6537K() {
        int peek;
        if (this.f4714e) {
            peek = Math.max(this.f4715f, this.f4700A - ((this.f4735z * 9) / 16));
        } else {
            peek = this.f4713d;
        }
        if (this.f4711b) {
            this.f4726q = Math.max(this.f4700A - peek, this.f4723n);
        } else {
            this.f4726q = this.f4700A - peek;
        }
    }

    /* renamed from: L */
    public final void mo6538L() {
        this.f4724o = (int) (((float) this.f4700A) * (1.0f - this.f4725p));
    }

    /* renamed from: T */
    public final void mo6546T() {
        this.f4705F = -1;
        VelocityTracker velocityTracker = this.f4704E;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4704E = null;
        }
    }

    /* renamed from: U */
    public final void mo6547U(C1149f ss) {
        int i = this.f4710a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f4713d = ss.f4744e;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f4711b = ss.f4745f;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f4728s = ss.f4746g;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f4729t = ss.f4747h;
            }
        }
    }

    /* renamed from: h0 */
    public boolean mo6560h0(View child, float yvel) {
        if (this.f4729t) {
            return true;
        }
        if (child.getTop() >= this.f4726q && Math.abs((((float) child.getTop()) + (0.1f * yvel)) - ((float) this.f4726q)) / ((float) this.f4713d) > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public View mo6543Q(View view) {
        if (C0460r.m2236K(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup group = (ViewGroup) view;
        int count = group.getChildCount();
        for (int i = 0; i < count; i++) {
            View scrollingChild = mo6543Q(group.getChildAt(i));
            if (scrollingChild != null) {
                return scrollingChild;
            }
        }
        return null;
    }

    /* renamed from: M */
    public final void mo6539M(Context context, AttributeSet attrs, boolean hasBackgroundTint) {
        mo6540N(context, attrs, hasBackgroundTint, (ColorStateList) null);
    }

    /* renamed from: N */
    public final void mo6540N(Context context, AttributeSet attrs, boolean hasBackgroundTint, ColorStateList bottomSheetColor) {
        if (this.f4716g) {
            this.f4718i = C0960k.m5186e(context, attrs, C0924b.bottomSheetStyle, f4699K).mo5662m();
            C0953g gVar = new C0953g(this.f4718i);
            this.f4717h = gVar;
            gVar.mo5581L(context);
            if (!hasBackgroundTint || bottomSheetColor == null) {
                TypedValue defaultColor = new TypedValue();
                context.getTheme().resolveAttribute(16842801, defaultColor, true);
                this.f4717h.setTint(defaultColor.data);
                return;
            }
            this.f4717h.mo5588T(bottomSheetColor);
        }
    }

    /* renamed from: O */
    public final void mo6541O() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f4721l = ofFloat;
        ofFloat.setDuration(500);
        this.f4721l.addUpdateListener(new C1145b());
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C1145b implements ValueAnimator.AnimatorUpdateListener {
        public C1145b() {
        }

        public void onAnimationUpdate(ValueAnimator animation) {
            float value = ((Float) animation.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f4717h != null) {
                BottomSheetBehavior.this.f4717h.mo5589U(value);
            }
        }
    }

    /* renamed from: S */
    public final float mo6545S() {
        VelocityTracker velocityTracker = this.f4704E;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f4712c);
        return this.f4704E.getYVelocity(this.f4705F);
    }

    /* renamed from: R */
    public final int mo6544R() {
        return this.f4711b ? this.f4723n : this.f4722m;
    }

    /* renamed from: f0 */
    public void mo6558f0(View child, int state) {
        int top;
        if (state == 4) {
            top = this.f4726q;
        } else if (state == 6) {
            top = this.f4724o;
            if (this.f4711b && top <= this.f4723n) {
                state = 3;
                top = this.f4723n;
            }
        } else if (state == 3) {
            top = mo6544R();
        } else if (this.f4728s == 0 || state != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + state);
        } else {
            top = this.f4700A;
        }
        mo6561i0(child, state, top, false);
    }

    /* renamed from: i0 */
    public void mo6561i0(View child, int state, int top, boolean settleFromViewDragHelper) {
        boolean startedSettling;
        if (settleFromViewDragHelper) {
            startedSettling = this.f4731v.mo2735F(child.getLeft(), top);
        } else {
            startedSettling = this.f4731v.mo2737H(child, child.getLeft(), top);
        }
        if (startedSettling) {
            mo6557e0(2);
            mo6563k0(state);
            if (this.f4720k == null) {
                this.f4720k = new C1151g(child, state);
            }
            if (!this.f4720k.f4749c) {
                BottomSheetBehavior<V>.g gVar = this.f4720k;
                gVar.f4750d = state;
                C0460r.m2247V(child, gVar);
                boolean unused = this.f4720k.f4749c = true;
                return;
            }
            this.f4720k.f4750d = state;
            return;
        }
        mo6557e0(state);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public class C1146c extends C0512c.C0515c {
        public C1146c() {
        }

        /* renamed from: m */
        public boolean mo2777m(View child, int pointerId) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i = bottomSheetBehavior.f4730u;
            if (i == 1 || bottomSheetBehavior.f4707H) {
                return false;
            }
            if (i == 3 && bottomSheetBehavior.f4705F == pointerId) {
                WeakReference<View> weakReference = bottomSheetBehavior.f4702C;
                View scroll = weakReference != null ? (View) weakReference.get() : null;
                if (scroll != null && scroll.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f4701B;
            if (weakReference2 == null || weakReference2.get() != child) {
                return false;
            }
            return true;
        }

        /* renamed from: k */
        public void mo2775k(View changedView, int left, int top, int dx, int dy) {
            BottomSheetBehavior.this.mo6542P(top);
        }

        /* renamed from: j */
        public void mo2774j(int state) {
            if (state == 1) {
                BottomSheetBehavior.this.mo6557e0(1);
            }
        }

        /* renamed from: l */
        public void mo2776l(View releasedChild, float xvel, float yvel) {
            int targetState;
            int top;
            if (yvel >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f4728s && bottomSheetBehavior.mo6560h0(releasedChild, yvel) && (releasedChild.getTop() > BottomSheetBehavior.this.f4726q || Math.abs(xvel) < Math.abs(yvel))) {
                    top = BottomSheetBehavior.this.f4700A;
                    targetState = 5;
                } else if (yvel == 0.0f || Math.abs(xvel) > Math.abs(yvel)) {
                    int currentTop = releasedChild.getTop();
                    if (!BottomSheetBehavior.this.f4711b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int targetState2 = bottomSheetBehavior2.f4724o;
                        if (currentTop < targetState2) {
                            if (currentTop < Math.abs(currentTop - bottomSheetBehavior2.f4726q)) {
                                top = BottomSheetBehavior.this.f4722m;
                                targetState = 3;
                            } else {
                                top = BottomSheetBehavior.this.f4724o;
                                targetState = 6;
                            }
                        } else if (Math.abs(currentTop - targetState2) < Math.abs(currentTop - BottomSheetBehavior.this.f4726q)) {
                            top = BottomSheetBehavior.this.f4724o;
                            targetState = 6;
                        } else {
                            top = BottomSheetBehavior.this.f4726q;
                            targetState = 4;
                        }
                    } else if (Math.abs(currentTop - BottomSheetBehavior.this.f4723n) < Math.abs(currentTop - BottomSheetBehavior.this.f4726q)) {
                        top = BottomSheetBehavior.this.f4723n;
                        targetState = 3;
                    } else {
                        top = BottomSheetBehavior.this.f4726q;
                        targetState = 4;
                    }
                } else if (BottomSheetBehavior.this.f4711b) {
                    top = BottomSheetBehavior.this.f4726q;
                    targetState = 4;
                } else {
                    int currentTop2 = releasedChild.getTop();
                    if (Math.abs(currentTop2 - BottomSheetBehavior.this.f4724o) < Math.abs(currentTop2 - BottomSheetBehavior.this.f4726q)) {
                        top = BottomSheetBehavior.this.f4724o;
                        targetState = 6;
                    } else {
                        top = BottomSheetBehavior.this.f4726q;
                        targetState = 4;
                    }
                }
            } else if (BottomSheetBehavior.this.f4711b) {
                top = BottomSheetBehavior.this.f4723n;
                targetState = 3;
            } else {
                int currentTop3 = releasedChild.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                if (currentTop3 > bottomSheetBehavior3.f4724o) {
                    top = bottomSheetBehavior3.f4724o;
                    targetState = 6;
                } else {
                    top = bottomSheetBehavior3.f4722m;
                    targetState = 3;
                }
            }
            BottomSheetBehavior.this.mo6561i0(releasedChild, targetState, top, true);
        }

        /* renamed from: b */
        public int mo2766b(View child, int top, int dy) {
            int G = BottomSheetBehavior.this.mo6544R();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C0379a.m1963b(top, G, bottomSheetBehavior.f4728s ? bottomSheetBehavior.f4700A : bottomSheetBehavior.f4726q);
        }

        /* renamed from: a */
        public int mo2765a(View child, int left, int dx) {
            return child.getLeft();
        }

        /* renamed from: e */
        public int mo2769e(View child) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f4728s) {
                return bottomSheetBehavior.f4700A;
            }
            return bottomSheetBehavior.f4726q;
        }
    }

    /* renamed from: P */
    public void mo6542P(int top) {
        float f;
        View bottomSheet = (View) this.f4701B.get();
        if (bottomSheet != null && !this.f4703D.isEmpty()) {
            int i = this.f4726q;
            float f2 = (float) (i - top);
            if (top > i) {
                f = f2 / ((float) (this.f4700A - i));
            } else {
                f = f2 / ((float) (i - mo6544R()));
            }
            float slideOffset = f;
            for (int i2 = 0; i2 < this.f4703D.size(); i2++) {
                this.f4703D.get(i2).mo6567a(bottomSheet, slideOffset);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    public class C1151g implements Runnable {

        /* renamed from: b */
        public final View f4748b;

        /* renamed from: c */
        public boolean f4749c;

        /* renamed from: d */
        public int f4750d;

        public C1151g(View view, int targetState) {
            this.f4748b = view;
            this.f4750d = targetState;
        }

        public void run() {
            C0512c cVar = BottomSheetBehavior.this.f4731v;
            if (cVar == null || !cVar.mo2749k(true)) {
                BottomSheetBehavior.this.mo6557e0(this.f4750d);
            } else {
                C0460r.m2247V(this.f4748b, this);
            }
            this.f4749c = false;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public static class C1149f extends C0501a {
        public static final Parcelable.Creator<C1149f> CREATOR = new C1150a();

        /* renamed from: d */
        public final int f4743d;

        /* renamed from: e */
        public int f4744e;

        /* renamed from: f */
        public boolean f4745f;

        /* renamed from: g */
        public boolean f4746g;

        /* renamed from: h */
        public boolean f4747h;

        public C1149f(Parcel source, ClassLoader loader) {
            super(source, loader);
            this.f4743d = source.readInt();
            this.f4744e = source.readInt();
            boolean z = false;
            this.f4745f = source.readInt() == 1;
            this.f4746g = source.readInt() == 1;
            this.f4747h = source.readInt() == 1 ? true : z;
        }

        public C1149f(Parcelable superState, BottomSheetBehavior<?> behavior) {
            super(superState);
            this.f4743d = behavior.f4730u;
            this.f4744e = behavior.f4713d;
            this.f4745f = behavior.f4711b;
            this.f4746g = behavior.f4728s;
            this.f4747h = behavior.f4729t;
        }

        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f4743d);
            out.writeInt(this.f4744e);
            out.writeInt(this.f4745f ? 1 : 0);
            out.writeInt(this.f4746g ? 1 : 0);
            out.writeInt(this.f4747h ? 1 : 0);
        }

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f$a */
        public static class C1150a implements Parcelable.ClassLoaderCreator<C1149f> {
            /* renamed from: b */
            public C1149f createFromParcel(Parcel in, ClassLoader loader) {
                return new C1149f(in, loader);
            }

            /* renamed from: a */
            public C1149f createFromParcel(Parcel in) {
                return new C1149f(in, (ClassLoader) null);
            }

            /* renamed from: c */
            public C1149f[] newArray(int size) {
                return new C1149f[size];
            }
        }
    }

    /* renamed from: l0 */
    public final void mo6564l0(boolean expanded) {
        int i = Build.VERSION.SDK_INT;
        WeakReference<V> weakReference = this.f4701B;
        if (weakReference != null) {
            ViewParent viewParent = ((View) weakReference.get()).getParent();
            if (viewParent instanceof CoordinatorLayout) {
                CoordinatorLayout parent = (CoordinatorLayout) viewParent;
                int childCount = parent.getChildCount();
                if (i >= 16 && expanded) {
                    if (this.f4708I == null) {
                        this.f4708I = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View child = parent.getChildAt(i2);
                    if (child != this.f4701B.get()) {
                        if (!expanded) {
                            Map<View, Integer> map = this.f4708I;
                            if (map != null && map.containsKey(child)) {
                                C0460r.m2275l0(child, this.f4708I.get(child).intValue());
                            }
                        } else {
                            if (i >= 16) {
                                this.f4708I.put(child, Integer.valueOf(child.getImportantForAccessibility()));
                            }
                            C0460r.m2275l0(child, 4);
                        }
                    }
                }
                if (!expanded) {
                    this.f4708I = null;
                }
            }
        }
    }

    /* renamed from: j0 */
    public final void mo6562j0() {
        V child;
        WeakReference<V> weakReference = this.f4701B;
        if (weakReference != null && (child = (View) weakReference.get()) != null) {
            C0460r.m2249X(child, 524288);
            C0460r.m2249X(child, 262144);
            C0460r.m2249X(child, 1048576);
            if (this.f4728s && this.f4730u != 5) {
                mo6536J(child, C0424c.C0425a.f2002h, 5);
            }
            int i = this.f4730u;
            int nextState = 6;
            if (i == 3) {
                if (this.f4711b != 0) {
                    nextState = 4;
                }
                mo6536J(child, C0424c.C0425a.f2001g, nextState);
            } else if (i == 4) {
                if (this.f4711b) {
                    nextState = 3;
                }
                mo6536J(child, C0424c.C0425a.f2000f, nextState);
            } else if (i == 6) {
                mo6536J(child, C0424c.C0425a.f2001g, 4);
                mo6536J(child, C0424c.C0425a.f2000f, 3);
            }
        }
    }

    /* renamed from: J */
    public final void mo6536J(V child, C0424c.C0425a action, int state) {
        C0460r.m2251Z(child, action, (CharSequence) null, new C1147d(state));
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public class C1147d implements C0432f {

        /* renamed from: a */
        public final /* synthetic */ int f4741a;

        public C1147d(int i) {
            this.f4741a = i;
        }

        /* renamed from: a */
        public boolean mo2521a(View view, C0432f.C0433a arguments) {
            BottomSheetBehavior.this.mo6556d0(this.f4741a);
            return true;
        }
    }
}
