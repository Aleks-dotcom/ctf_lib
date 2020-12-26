package p000a.p043j.p045b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.j.b.c */
public class C0512c {

    /* renamed from: w */
    public static final Interpolator f2136w = new C0513a();

    /* renamed from: a */
    public int f2137a;

    /* renamed from: b */
    public int f2138b;

    /* renamed from: c */
    public int f2139c = -1;

    /* renamed from: d */
    public float[] f2140d;

    /* renamed from: e */
    public float[] f2141e;

    /* renamed from: f */
    public float[] f2142f;

    /* renamed from: g */
    public float[] f2143g;

    /* renamed from: h */
    public int[] f2144h;

    /* renamed from: i */
    public int[] f2145i;

    /* renamed from: j */
    public int[] f2146j;

    /* renamed from: k */
    public int f2147k;

    /* renamed from: l */
    public VelocityTracker f2148l;

    /* renamed from: m */
    public float f2149m;

    /* renamed from: n */
    public float f2150n;

    /* renamed from: o */
    public int f2151o;

    /* renamed from: p */
    public int f2152p;

    /* renamed from: q */
    public OverScroller f2153q;

    /* renamed from: r */
    public final C0515c f2154r;

    /* renamed from: s */
    public View f2155s;

    /* renamed from: t */
    public boolean f2156t;

    /* renamed from: u */
    public final ViewGroup f2157u;

    /* renamed from: v */
    public final Runnable f2158v = new C0514b();

    /* renamed from: a.j.b.c$c */
    public static abstract class C0515c {
        /* renamed from: a */
        public abstract int mo2765a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo2766b(View view, int i, int i2);

        /* renamed from: j */
        public abstract void mo2774j(int i);

        /* renamed from: k */
        public abstract void mo2775k(View view, int i, int i2, int i3, int i4);

        /* renamed from: l */
        public abstract void mo2776l(View view, float f, float f2);

        /* renamed from: m */
        public abstract boolean mo2777m(View view, int i);

        /* renamed from: i */
        public void mo2773i(View capturedChild, int activePointerId) {
        }

        /* renamed from: h */
        public void mo2772h(int edgeFlags, int pointerId) {
        }

        /* renamed from: g */
        public boolean mo2771g(int edgeFlags) {
            return false;
        }

        /* renamed from: f */
        public void mo2770f(int edgeFlags, int pointerId) {
        }

        /* renamed from: c */
        public int mo2767c(int index) {
            return index;
        }

        /* renamed from: d */
        public int mo2768d(View child) {
            return 0;
        }

        /* renamed from: e */
        public int mo2769e(View child) {
            return 0;
        }
    }

    /* renamed from: a.j.b.c$a */
    public static class C0513a implements Interpolator {
        public float getInterpolation(float t) {
            float t2 = t - 1.0f;
            return (t2 * t2 * t2 * t2 * t2) + 1.0f;
        }
    }

    /* renamed from: a.j.b.c$b */
    public class C0514b implements Runnable {
        public C0514b() {
        }

        public void run() {
            C0512c.this.mo2734E(0);
        }
    }

    /* renamed from: m */
    public static C0512c m2533m(ViewGroup forParent, C0515c cb) {
        return new C0512c(forParent.getContext(), forParent, cb);
    }

    /* renamed from: l */
    public static C0512c m2532l(ViewGroup forParent, float sensitivity, C0515c cb) {
        C0512c helper = m2533m(forParent, cb);
        helper.f2138b = (int) (((float) helper.f2138b) * (1.0f / sensitivity));
        return helper;
    }

    public C0512c(Context context, ViewGroup forParent, C0515c cb) {
        if (forParent == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cb != null) {
            this.f2157u = forParent;
            this.f2154r = cb;
            ViewConfiguration vc = ViewConfiguration.get(context);
            this.f2151o = (int) ((20.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
            this.f2138b = vc.getScaledTouchSlop();
            this.f2149m = (float) vc.getScaledMaximumFlingVelocity();
            this.f2150n = (float) vc.getScaledMinimumFlingVelocity();
            this.f2153q = new OverScroller(context, f2136w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: b */
    public void mo2740b(View childView, int activePointerId) {
        if (childView.getParent() == this.f2157u) {
            this.f2155s = childView;
            this.f2139c = activePointerId;
            this.f2154r.mo2773i(childView, activePointerId);
            mo2734E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f2157u + ")");
    }

    /* renamed from: u */
    public int mo2757u() {
        return this.f2138b;
    }

    /* renamed from: a */
    public void mo2739a() {
        this.f2139c = -1;
        mo2745g();
        VelocityTracker velocityTracker = this.f2148l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2148l = null;
        }
    }

    /* renamed from: H */
    public boolean mo2737H(View child, int finalLeft, int finalTop) {
        this.f2155s = child;
        this.f2139c = -1;
        boolean continueSliding = mo2755s(finalLeft, finalTop, 0, 0);
        if (!continueSliding && this.f2137a == 0 && this.f2155s != null) {
            this.f2155s = null;
        }
        return continueSliding;
    }

    /* renamed from: F */
    public boolean mo2735F(int finalLeft, int finalTop) {
        if (this.f2156t) {
            return mo2755s(finalLeft, finalTop, (int) this.f2148l.getXVelocity(this.f2139c), (int) this.f2148l.getYVelocity(this.f2139c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: s */
    public final boolean mo2755s(int finalLeft, int finalTop, int xvel, int yvel) {
        int startLeft = this.f2155s.getLeft();
        int startTop = this.f2155s.getTop();
        int dx = finalLeft - startLeft;
        int dy = finalTop - startTop;
        if (dx == 0 && dy == 0) {
            this.f2153q.abortAnimation();
            mo2734E(0);
            return false;
        }
        this.f2153q.startScroll(startLeft, startTop, dx, dy, mo2748j(this.f2155s, dx, dy, xvel, yvel));
        mo2734E(2);
        return true;
    }

    /* renamed from: j */
    public final int mo2748j(View child, int dx, int dy, int xvel, int yvel) {
        float f;
        float f2;
        float f3;
        float f4;
        View view = child;
        int xvel2 = mo2744f(xvel, (int) this.f2150n, (int) this.f2149m);
        int yvel2 = mo2744f(yvel, (int) this.f2150n, (int) this.f2149m);
        int absDx = Math.abs(dx);
        int absDy = Math.abs(dy);
        int absXVel = Math.abs(xvel2);
        int absYVel = Math.abs(yvel2);
        int addedVel = absXVel + absYVel;
        int addedDistance = absDx + absDy;
        if (xvel2 != 0) {
            f2 = (float) absXVel;
            f = (float) addedVel;
        } else {
            f2 = (float) absDx;
            f = (float) addedDistance;
        }
        float xweight = f2 / f;
        if (yvel2 != 0) {
            f4 = (float) absYVel;
            f3 = (float) addedVel;
        } else {
            f4 = (float) absDy;
            f3 = (float) addedDistance;
        }
        float yweight = f4 / f3;
        return (int) ((((float) mo2747i(dx, xvel2, this.f2154r.mo2768d(view))) * xweight) + (((float) mo2747i(dy, yvel2, this.f2154r.mo2769e(view))) * yweight));
    }

    /* renamed from: i */
    public final int mo2747i(int delta, int velocity, int motionRange) {
        int duration;
        if (delta == 0) {
            return 0;
        }
        int width = this.f2157u.getWidth();
        int halfWidth = width / 2;
        float distance = ((float) halfWidth) + (((float) halfWidth) * mo2751o(Math.min(1.0f, ((float) Math.abs(delta)) / ((float) width))));
        int velocity2 = Math.abs(velocity);
        if (velocity2 > 0) {
            duration = Math.round(Math.abs(distance / ((float) velocity2)) * 1000.0f) * 4;
        } else {
            duration = (int) ((1.0f + (((float) Math.abs(delta)) / ((float) motionRange))) * 256.0f);
        }
        return Math.min(duration, 600);
    }

    /* renamed from: f */
    public final int mo2744f(int value, int absMin, int absMax) {
        int absValue = Math.abs(value);
        if (absValue < absMin) {
            return 0;
        }
        if (absValue > absMax) {
            return value > 0 ? absMax : -absMax;
        }
        return value;
    }

    /* renamed from: e */
    public final float mo2743e(float value, float absMin, float absMax) {
        float absValue = Math.abs(value);
        if (absValue < absMin) {
            return 0.0f;
        }
        if (absValue > absMax) {
            return value > 0.0f ? absMax : -absMax;
        }
        return value;
    }

    /* renamed from: o */
    public final float mo2751o(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: k */
    public boolean mo2749k(boolean deferCallbacks) {
        if (this.f2137a == 2) {
            boolean keepGoing = this.f2153q.computeScrollOffset();
            int x = this.f2153q.getCurrX();
            int y = this.f2153q.getCurrY();
            int dx = x - this.f2155s.getLeft();
            int dy = y - this.f2155s.getTop();
            if (dx != 0) {
                C0460r.m2240O(this.f2155s, dx);
            }
            if (dy != 0) {
                C0460r.m2241P(this.f2155s, dy);
            }
            if (!(dx == 0 && dy == 0)) {
                this.f2154r.mo2775k(this.f2155s, x, y, dx, dy);
            }
            if (keepGoing && x == this.f2153q.getFinalX() && y == this.f2153q.getFinalY()) {
                this.f2153q.abortAnimation();
                keepGoing = false;
            }
            if (!keepGoing) {
                if (deferCallbacks) {
                    this.f2157u.post(this.f2158v);
                } else {
                    mo2734E(0);
                }
            }
        }
        if (this.f2137a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final void mo2750n(float xvel, float yvel) {
        this.f2156t = true;
        this.f2154r.mo2776l(this.f2155s, xvel, yvel);
        this.f2156t = false;
        if (this.f2137a == 1) {
            mo2734E(0);
        }
    }

    /* renamed from: g */
    public final void mo2745g() {
        float[] fArr = this.f2140d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2141e, 0.0f);
            Arrays.fill(this.f2142f, 0.0f);
            Arrays.fill(this.f2143g, 0.0f);
            Arrays.fill(this.f2144h, 0);
            Arrays.fill(this.f2145i, 0);
            Arrays.fill(this.f2146j, 0);
            this.f2147k = 0;
        }
    }

    /* renamed from: h */
    public final void mo2746h(int pointerId) {
        if (this.f2140d != null && mo2759w(pointerId)) {
            this.f2140d[pointerId] = 0.0f;
            this.f2141e[pointerId] = 0.0f;
            this.f2142f[pointerId] = 0.0f;
            this.f2143g[pointerId] = 0.0f;
            this.f2144h[pointerId] = 0;
            this.f2145i[pointerId] = 0;
            this.f2146j[pointerId] = 0;
            this.f2147k &= ~(1 << pointerId);
        }
    }

    /* renamed from: q */
    public final void mo2753q(int pointerId) {
        float[] fArr = this.f2140d;
        if (fArr == null || fArr.length <= pointerId) {
            float[] imx = new float[(pointerId + 1)];
            float[] imy = new float[(pointerId + 1)];
            float[] lmx = new float[(pointerId + 1)];
            float[] lmy = new float[(pointerId + 1)];
            int[] iit = new int[(pointerId + 1)];
            int[] edip = new int[(pointerId + 1)];
            int[] edl = new int[(pointerId + 1)];
            if (fArr != null) {
                System.arraycopy(fArr, 0, imx, 0, fArr.length);
                float[] fArr2 = this.f2141e;
                System.arraycopy(fArr2, 0, imy, 0, fArr2.length);
                float[] fArr3 = this.f2142f;
                System.arraycopy(fArr3, 0, lmx, 0, fArr3.length);
                float[] fArr4 = this.f2143g;
                System.arraycopy(fArr4, 0, lmy, 0, fArr4.length);
                int[] iArr = this.f2144h;
                System.arraycopy(iArr, 0, iit, 0, iArr.length);
                int[] iArr2 = this.f2145i;
                System.arraycopy(iArr2, 0, edip, 0, iArr2.length);
                int[] iArr3 = this.f2146j;
                System.arraycopy(iArr3, 0, edl, 0, iArr3.length);
            }
            this.f2140d = imx;
            this.f2141e = imy;
            this.f2142f = lmx;
            this.f2143g = lmy;
            this.f2144h = iit;
            this.f2145i = edip;
            this.f2146j = edl;
        }
    }

    /* renamed from: C */
    public final void mo2732C(float x, float y, int pointerId) {
        mo2753q(pointerId);
        float[] fArr = this.f2140d;
        this.f2142f[pointerId] = x;
        fArr[pointerId] = x;
        float[] fArr2 = this.f2141e;
        this.f2143g[pointerId] = y;
        fArr2[pointerId] = y;
        this.f2144h[pointerId] = mo2756t((int) x, (int) y);
        this.f2147k |= 1 << pointerId;
    }

    /* renamed from: D */
    public final void mo2733D(MotionEvent ev) {
        int pointerCount = ev.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = ev.getPointerId(i);
            if (mo2760x(pointerId)) {
                float x = ev.getX(i);
                float y = ev.getY(i);
                this.f2142f[pointerId] = x;
                this.f2143g[pointerId] = y;
            }
        }
    }

    /* renamed from: w */
    public boolean mo2759w(int pointerId) {
        return (this.f2147k & (1 << pointerId)) != 0;
    }

    /* renamed from: E */
    public void mo2734E(int state) {
        this.f2157u.removeCallbacks(this.f2158v);
        if (this.f2137a != state) {
            this.f2137a = state;
            this.f2154r.mo2774j(state);
            if (this.f2137a == 0) {
                this.f2155s = null;
            }
        }
    }

    /* renamed from: I */
    public boolean mo2738I(View toCapture, int pointerId) {
        if (toCapture == this.f2155s && this.f2139c == pointerId) {
            return true;
        }
        if (toCapture == null || !this.f2154r.mo2777m(toCapture, pointerId)) {
            return false;
        }
        this.f2139c = pointerId;
        mo2740b(toCapture, pointerId);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0110, code lost:
        if (r2 != r15) goto L_0x011f;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2736G(android.view.MotionEvent r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            int r2 = r22.getActionMasked()
            int r3 = r22.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r21.mo2739a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f2148l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f2148l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f2148l
            r4.addMovement(r1)
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0156
            if (r2 == r6) goto L_0x014d
            if (r2 == r5) goto L_0x008d
            r7 = 3
            if (r2 == r7) goto L_0x0087
            r7 = 5
            if (r2 == r7) goto L_0x0046
            r5 = 6
            if (r2 == r5) goto L_0x0038
            r16 = r2
            r17 = r3
            r4 = 0
            goto L_0x018b
        L_0x0038:
            int r5 = r1.getPointerId(r3)
            r0.mo2746h(r5)
            r16 = r2
            r17 = r3
            r4 = 0
            goto L_0x018b
        L_0x0046:
            int r7 = r1.getPointerId(r3)
            float r8 = r1.getX(r3)
            float r9 = r1.getY(r3)
            r0.mo2732C(r8, r9, r7)
            int r10 = r0.f2137a
            if (r10 != 0) goto L_0x006a
            int[] r5 = r0.f2144h
            r5 = r5[r7]
            int r10 = r0.f2152p
            r11 = r5 & r10
            if (r11 == 0) goto L_0x0080
            a.j.b.c$c r11 = r0.f2154r
            r10 = r10 & r5
            r11.mo2772h(r10, r7)
            goto L_0x0080
        L_0x006a:
            if (r10 != r5) goto L_0x0080
            int r5 = (int) r8
            int r10 = (int) r9
            android.view.View r5 = r0.mo2754r(r5, r10)
            android.view.View r10 = r0.f2155s
            if (r5 != r10) goto L_0x0079
            r0.mo2738I(r5, r7)
        L_0x0079:
            r16 = r2
            r17 = r3
            r4 = 0
            goto L_0x018b
        L_0x0080:
            r16 = r2
            r17 = r3
            r4 = 0
            goto L_0x018b
        L_0x0087:
            r16 = r2
            r17 = r3
            goto L_0x0151
        L_0x008d:
            float[] r5 = r0.f2140d
            if (r5 == 0) goto L_0x0147
            float[] r5 = r0.f2141e
            if (r5 != 0) goto L_0x009c
            r16 = r2
            r17 = r3
            r4 = 0
            goto L_0x018b
        L_0x009c:
            int r5 = r22.getPointerCount()
            r7 = 0
        L_0x00a1:
            if (r7 >= r5) goto L_0x013c
            int r8 = r1.getPointerId(r7)
            boolean r9 = r0.mo2760x(r8)
            if (r9 != 0) goto L_0x00b5
            r16 = r2
            r17 = r3
            r19 = r5
            goto L_0x0131
        L_0x00b5:
            float r9 = r1.getX(r7)
            float r10 = r1.getY(r7)
            float[] r11 = r0.f2140d
            r11 = r11[r8]
            float r11 = r9 - r11
            float[] r12 = r0.f2141e
            r12 = r12[r8]
            float r12 = r10 - r12
            int r13 = (int) r9
            int r14 = (int) r10
            android.view.View r13 = r0.mo2754r(r13, r14)
            if (r13 == 0) goto L_0x00d9
            boolean r14 = r0.mo2742d(r13, r11, r12)
            if (r14 == 0) goto L_0x00d9
            r14 = 1
            goto L_0x00da
        L_0x00d9:
            r14 = 0
        L_0x00da:
            if (r14 == 0) goto L_0x0119
            int r15 = r13.getLeft()
            int r4 = (int) r11
            int r4 = r4 + r15
            a.j.b.c$c r6 = r0.f2154r
            r16 = r2
            int r2 = (int) r11
            int r2 = r6.mo2765a(r13, r4, r2)
            int r6 = r13.getTop()
            r17 = r3
            int r3 = (int) r12
            int r3 = r3 + r6
            r18 = r4
            a.j.b.c$c r4 = r0.f2154r
            r19 = r5
            int r5 = (int) r12
            int r4 = r4.mo2766b(r13, r3, r5)
            a.j.b.c$c r5 = r0.f2154r
            int r5 = r5.mo2768d(r13)
            r20 = r3
            a.j.b.c$c r3 = r0.f2154r
            int r3 = r3.mo2769e(r13)
            if (r5 == 0) goto L_0x0112
            if (r5 <= 0) goto L_0x011f
            if (r2 != r15) goto L_0x011f
        L_0x0112:
            if (r3 == 0) goto L_0x0142
            if (r3 <= 0) goto L_0x011f
            if (r4 != r6) goto L_0x011f
            goto L_0x0142
        L_0x0119:
            r16 = r2
            r17 = r3
            r19 = r5
        L_0x011f:
            r0.mo2731B(r11, r12, r8)
            int r2 = r0.f2137a
            r3 = 1
            if (r2 != r3) goto L_0x0128
            goto L_0x0142
        L_0x0128:
            if (r14 == 0) goto L_0x0131
            boolean r2 = r0.mo2738I(r13, r8)
            if (r2 == 0) goto L_0x0131
            goto L_0x0142
        L_0x0131:
            int r7 = r7 + 1
            r2 = r16
            r3 = r17
            r5 = r19
            r6 = 1
            goto L_0x00a1
        L_0x013c:
            r16 = r2
            r17 = r3
            r19 = r5
        L_0x0142:
            r21.mo2733D(r22)
            r4 = 0
            goto L_0x018b
        L_0x0147:
            r16 = r2
            r17 = r3
            r4 = 0
            goto L_0x018b
        L_0x014d:
            r16 = r2
            r17 = r3
        L_0x0151:
            r21.mo2739a()
            r4 = 0
            goto L_0x018b
        L_0x0156:
            r16 = r2
            r17 = r3
            float r2 = r22.getX()
            float r3 = r22.getY()
            r4 = 0
            int r6 = r1.getPointerId(r4)
            r0.mo2732C(r2, r3, r6)
            int r7 = (int) r2
            int r8 = (int) r3
            android.view.View r7 = r0.mo2754r(r7, r8)
            android.view.View r8 = r0.f2155s
            if (r7 != r8) goto L_0x017b
            int r8 = r0.f2137a
            if (r8 != r5) goto L_0x017b
            r0.mo2738I(r7, r6)
        L_0x017b:
            int[] r5 = r0.f2144h
            r5 = r5[r6]
            int r8 = r0.f2152p
            r9 = r5 & r8
            if (r9 == 0) goto L_0x018b
            a.j.b.c$c r9 = r0.f2154r
            r8 = r8 & r5
            r9.mo2772h(r8, r6)
        L_0x018b:
            int r2 = r0.f2137a
            r3 = 1
            if (r2 != r3) goto L_0x0191
            r4 = 1
        L_0x0191:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p043j.p045b.C0512c.mo2736G(android.view.MotionEvent):boolean");
    }

    /* renamed from: z */
    public void mo2762z(MotionEvent ev) {
        int action = ev.getActionMasked();
        int actionIndex = ev.getActionIndex();
        if (action == 0) {
            mo2739a();
        }
        if (this.f2148l == null) {
            this.f2148l = VelocityTracker.obtain();
        }
        this.f2148l.addMovement(ev);
        if (action == 0) {
            float x = ev.getX();
            float y = ev.getY();
            int pointerId = ev.getPointerId(0);
            View toCapture = mo2754r((int) x, (int) y);
            mo2732C(x, y, pointerId);
            mo2738I(toCapture, pointerId);
            int edgesTouched = this.f2144h[pointerId];
            int i = this.f2152p;
            if ((edgesTouched & i) != 0) {
                this.f2154r.mo2772h(i & edgesTouched, pointerId);
            }
        } else if (action == 1) {
            if (this.f2137a == 1) {
                mo2730A();
            }
            mo2739a();
        } else if (action != 2) {
            if (action == 3) {
                if (this.f2137a == 1) {
                    mo2750n(0.0f, 0.0f);
                }
                mo2739a();
            } else if (action == 5) {
                int pointerId2 = ev.getPointerId(actionIndex);
                float x2 = ev.getX(actionIndex);
                float y2 = ev.getY(actionIndex);
                mo2732C(x2, y2, pointerId2);
                if (this.f2137a == 0) {
                    mo2738I(mo2754r((int) x2, (int) y2), pointerId2);
                    int edgesTouched2 = this.f2144h[pointerId2];
                    int i2 = this.f2152p;
                    if ((edgesTouched2 & i2) != 0) {
                        this.f2154r.mo2772h(i2 & edgesTouched2, pointerId2);
                    }
                } else if (mo2758v((int) x2, (int) y2)) {
                    mo2738I(this.f2155s, pointerId2);
                }
            } else if (action == 6) {
                int pointerId3 = ev.getPointerId(actionIndex);
                if (this.f2137a == 1 && pointerId3 == this.f2139c) {
                    int newActivePointer = -1;
                    int pointerCount = ev.getPointerCount();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= pointerCount) {
                            break;
                        }
                        int id = ev.getPointerId(i3);
                        if (id != this.f2139c) {
                            View r = mo2754r((int) ev.getX(i3), (int) ev.getY(i3));
                            View view = this.f2155s;
                            if (r == view && mo2738I(view, id)) {
                                newActivePointer = this.f2139c;
                                break;
                            }
                        }
                        i3++;
                    }
                    if (newActivePointer == -1) {
                        mo2730A();
                    }
                }
                mo2746h(pointerId3);
            }
        } else if (this.f2137a != 1) {
            int pointerCount2 = ev.getPointerCount();
            for (int i4 = 0; i4 < pointerCount2; i4++) {
                int pointerId4 = ev.getPointerId(i4);
                if (mo2760x(pointerId4)) {
                    float x3 = ev.getX(i4);
                    float y3 = ev.getY(i4);
                    float dx = x3 - this.f2140d[pointerId4];
                    float dy = y3 - this.f2141e[pointerId4];
                    mo2731B(dx, dy, pointerId4);
                    if (this.f2137a != 1) {
                        View toCapture2 = mo2754r((int) x3, (int) y3);
                        if (mo2742d(toCapture2, dx, dy) && mo2738I(toCapture2, pointerId4)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            mo2733D(ev);
        } else if (mo2760x(this.f2139c)) {
            int index = ev.findPointerIndex(this.f2139c);
            float x4 = ev.getX(index);
            float y4 = ev.getY(index);
            float[] fArr = this.f2142f;
            int i5 = this.f2139c;
            int idx = (int) (x4 - fArr[i5]);
            int idy = (int) (y4 - this.f2143g[i5]);
            mo2752p(this.f2155s.getLeft() + idx, this.f2155s.getTop() + idy, idx, idy);
            mo2733D(ev);
        }
    }

    /* renamed from: B */
    public final void mo2731B(float dx, float dy, int pointerId) {
        int dragsStarted = 0;
        if (mo2741c(dx, dy, pointerId, 1)) {
            dragsStarted = 0 | 1;
        }
        if (mo2741c(dy, dx, pointerId, 4)) {
            dragsStarted |= 4;
        }
        if (mo2741c(dx, dy, pointerId, 2)) {
            dragsStarted |= 2;
        }
        if (mo2741c(dy, dx, pointerId, 8)) {
            dragsStarted |= 8;
        }
        if (dragsStarted != 0) {
            int[] iArr = this.f2145i;
            iArr[pointerId] = iArr[pointerId] | dragsStarted;
            this.f2154r.mo2770f(dragsStarted, pointerId);
        }
    }

    /* renamed from: c */
    public final boolean mo2741c(float delta, float odelta, int pointerId, int edge) {
        float absDelta = Math.abs(delta);
        float absODelta = Math.abs(odelta);
        if (!((this.f2144h[pointerId] & edge) != edge || (this.f2152p & edge) == 0 || (this.f2146j[pointerId] & edge) == edge || (this.f2145i[pointerId] & edge) == edge)) {
            int i = this.f2138b;
            if (absDelta > ((float) i) || absODelta > ((float) i)) {
                if (absDelta < 0.5f * absODelta && this.f2154r.mo2771g(edge)) {
                    int[] iArr = this.f2146j;
                    iArr[pointerId] = iArr[pointerId] | edge;
                    return false;
                } else if ((this.f2145i[pointerId] & edge) != 0 || absDelta <= ((float) this.f2138b)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo2742d(View child, float dx, float dy) {
        if (child == null) {
            return false;
        }
        boolean checkHorizontal = this.f2154r.mo2768d(child) > 0;
        boolean checkVertical = this.f2154r.mo2769e(child) > 0;
        if (checkHorizontal && checkVertical) {
            float f = (dx * dx) + (dy * dy);
            int i = this.f2138b;
            if (f > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (checkHorizontal) {
            if (Math.abs(dx) > ((float) this.f2138b)) {
                return true;
            }
            return false;
        } else if (!checkVertical || Math.abs(dy) <= ((float) this.f2138b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: A */
    public final void mo2730A() {
        this.f2148l.computeCurrentVelocity(1000, this.f2149m);
        mo2750n(mo2743e(this.f2148l.getXVelocity(this.f2139c), this.f2150n, this.f2149m), mo2743e(this.f2148l.getYVelocity(this.f2139c), this.f2150n, this.f2149m));
    }

    /* renamed from: p */
    public final void mo2752p(int left, int top, int dx, int dy) {
        int i = dx;
        int i2 = dy;
        int clampedX = left;
        int clampedY = top;
        int oldLeft = this.f2155s.getLeft();
        int oldTop = this.f2155s.getTop();
        if (i != 0) {
            clampedX = this.f2154r.mo2765a(this.f2155s, left, i);
            C0460r.m2240O(this.f2155s, clampedX - oldLeft);
        } else {
            int i3 = left;
        }
        if (i2 != 0) {
            clampedY = this.f2154r.mo2766b(this.f2155s, top, i2);
            C0460r.m2241P(this.f2155s, clampedY - oldTop);
        } else {
            int i4 = top;
        }
        if (i != 0 || i2 != 0) {
            this.f2154r.mo2775k(this.f2155s, clampedX, clampedY, clampedX - oldLeft, clampedY - oldTop);
        }
    }

    /* renamed from: v */
    public boolean mo2758v(int x, int y) {
        return mo2761y(this.f2155s, x, y);
    }

    /* renamed from: y */
    public boolean mo2761y(View view, int x, int y) {
        if (view != null && x >= view.getLeft() && x < view.getRight() && y >= view.getTop() && y < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public View mo2754r(int x, int y) {
        for (int i = this.f2157u.getChildCount() - 1; i >= 0; i--) {
            ViewGroup viewGroup = this.f2157u;
            this.f2154r.mo2767c(i);
            View child = viewGroup.getChildAt(i);
            if (x >= child.getLeft() && x < child.getRight() && y >= child.getTop() && y < child.getBottom()) {
                return child;
            }
        }
        return null;
    }

    /* renamed from: t */
    public final int mo2756t(int x, int y) {
        int result = 0;
        if (x < this.f2157u.getLeft() + this.f2151o) {
            result = 0 | 1;
        }
        if (y < this.f2157u.getTop() + this.f2151o) {
            result |= 4;
        }
        if (x > this.f2157u.getRight() - this.f2151o) {
            result |= 2;
        }
        if (y > this.f2157u.getBottom() - this.f2151o) {
            return result | 8;
        }
        return result;
    }

    /* renamed from: x */
    public final boolean mo2760x(int pointerId) {
        if (mo2759w(pointerId)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + pointerId + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }
}
