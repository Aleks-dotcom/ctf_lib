package p000a.p025h.p040n;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p000a.p025h.p038m.C0460r;

/* renamed from: a.h.n.a */
public abstract class C0480a implements View.OnTouchListener {

    /* renamed from: s */
    public static final int f2058s = ViewConfiguration.getTapTimeout();

    /* renamed from: b */
    public final C0481a f2059b = new C0481a();

    /* renamed from: c */
    public final Interpolator f2060c = new AccelerateInterpolator();

    /* renamed from: d */
    public final View f2061d;

    /* renamed from: e */
    public Runnable f2062e;

    /* renamed from: f */
    public float[] f2063f = {0.0f, 0.0f};

    /* renamed from: g */
    public float[] f2064g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: h */
    public int f2065h;

    /* renamed from: i */
    public int f2066i;

    /* renamed from: j */
    public float[] f2067j = {0.0f, 0.0f};

    /* renamed from: k */
    public float[] f2068k = {0.0f, 0.0f};

    /* renamed from: l */
    public float[] f2069l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: m */
    public boolean f2070m;

    /* renamed from: n */
    public boolean f2071n;

    /* renamed from: o */
    public boolean f2072o;

    /* renamed from: p */
    public boolean f2073p;

    /* renamed from: q */
    public boolean f2074q;

    /* renamed from: r */
    public boolean f2075r;

    /* renamed from: a */
    public abstract boolean mo2620a(int i);

    /* renamed from: b */
    public abstract boolean mo2621b(int i);

    /* renamed from: j */
    public abstract void mo2627j(int i, int i2);

    public C0480a(View target) {
        this.f2061d = target;
        float f = Resources.getSystem().getDisplayMetrics().density;
        int maxVelocity = (int) ((1575.0f * f) + 0.5f);
        int minVelocity = (int) ((f * 315.0f) + 0.5f);
        mo2632o((float) maxVelocity, (float) maxVelocity);
        mo2634p((float) minVelocity, (float) minVelocity);
        mo2629l(1);
        mo2631n(Float.MAX_VALUE, Float.MAX_VALUE);
        mo2637s(0.2f, 0.2f);
        mo2638t(1.0f, 1.0f);
        mo2628k(f2058s);
        mo2636r(500);
        mo2635q(500);
    }

    /* renamed from: m */
    public C0480a mo2630m(boolean enabled) {
        if (this.f2074q && !enabled) {
            mo2626i();
        }
        this.f2074q = enabled;
        return this;
    }

    /* renamed from: o */
    public C0480a mo2632o(float horizontalMax, float verticalMax) {
        float[] fArr = this.f2069l;
        fArr[0] = horizontalMax / 1000.0f;
        fArr[1] = verticalMax / 1000.0f;
        return this;
    }

    /* renamed from: p */
    public C0480a mo2634p(float horizontalMin, float verticalMin) {
        float[] fArr = this.f2068k;
        fArr[0] = horizontalMin / 1000.0f;
        fArr[1] = verticalMin / 1000.0f;
        return this;
    }

    /* renamed from: t */
    public C0480a mo2638t(float horizontal, float vertical) {
        float[] fArr = this.f2067j;
        fArr[0] = horizontal / 1000.0f;
        fArr[1] = vertical / 1000.0f;
        return this;
    }

    /* renamed from: l */
    public C0480a mo2629l(int type) {
        this.f2065h = type;
        return this;
    }

    /* renamed from: s */
    public C0480a mo2637s(float horizontal, float vertical) {
        float[] fArr = this.f2063f;
        fArr[0] = horizontal;
        fArr[1] = vertical;
        return this;
    }

    /* renamed from: n */
    public C0480a mo2631n(float horizontalMax, float verticalMax) {
        float[] fArr = this.f2064g;
        fArr[0] = horizontalMax;
        fArr[1] = verticalMax;
        return this;
    }

    /* renamed from: k */
    public C0480a mo2628k(int delayMillis) {
        this.f2066i = delayMillis;
        return this;
    }

    /* renamed from: r */
    public C0480a mo2636r(int durationMillis) {
        this.f2059b.mo2651k(durationMillis);
        return this;
    }

    /* renamed from: q */
    public C0480a mo2635q(int durationMillis) {
        this.f2059b.mo2650j(durationMillis);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f2074q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r3 = 3
            if (r0 == r3) goto L_0x0016
            goto L_0x005a
        L_0x0016:
            r7.mo2626i()
            goto L_0x005a
        L_0x001a:
            r7.f2072o = r2
            r7.f2070m = r1
        L_0x001e:
            float r3 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.view.View r5 = r7.f2061d
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r3 = r7.mo2623d(r1, r3, r4, r5)
            float r4 = r9.getY()
            int r5 = r8.getHeight()
            float r5 = (float) r5
            android.view.View r6 = r7.f2061d
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r4 = r7.mo2623d(r2, r4, r5, r6)
            a.h.n.a$a r5 = r7.f2059b
            r5.mo2652l(r3, r4)
            boolean r5 = r7.f2073p
            if (r5 != 0) goto L_0x005a
            boolean r5 = r7.mo2639u()
            if (r5 == 0) goto L_0x005a
            r7.mo2640v()
        L_0x005a:
            boolean r3 = r7.f2075r
            if (r3 == 0) goto L_0x0063
            boolean r3 = r7.f2073p
            if (r3 == 0) goto L_0x0063
            r1 = 1
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p025h.p040n.C0480a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: u */
    public boolean mo2639u() {
        C0481a scroller = this.f2059b;
        int verticalDirection = scroller.mo2646f();
        int horizontalDirection = scroller.mo2644d();
        return (verticalDirection != 0 && mo2621b(verticalDirection)) || (horizontalDirection != 0 && mo2620a(horizontalDirection));
    }

    /* renamed from: v */
    public final void mo2640v() {
        int i;
        if (this.f2062e == null) {
            this.f2062e = new C0482b();
        }
        this.f2073p = true;
        this.f2071n = true;
        if (this.f2070m || (i = this.f2066i) <= 0) {
            this.f2062e.run();
        } else {
            C0460r.m2248W(this.f2061d, this.f2062e, (long) i);
        }
        this.f2070m = true;
    }

    /* renamed from: i */
    public final void mo2626i() {
        if (this.f2071n) {
            this.f2073p = false;
        } else {
            this.f2059b.mo2649i();
        }
    }

    /* renamed from: d */
    public final float mo2623d(int direction, float coordinate, float srcSize, float dstSize) {
        float value = mo2625h(this.f2063f[direction], srcSize, this.f2064g[direction], coordinate);
        if (value == 0.0f) {
            return 0.0f;
        }
        float relativeVelocity = this.f2067j[direction];
        float minimumVelocity = this.f2068k[direction];
        float maximumVelocity = this.f2069l[direction];
        float targetVelocity = relativeVelocity * dstSize;
        if (value > 0.0f) {
            return m2375e(value * targetVelocity, minimumVelocity, maximumVelocity);
        }
        return -m2375e((-value) * targetVelocity, minimumVelocity, maximumVelocity);
    }

    /* renamed from: h */
    public final float mo2625h(float relativeValue, float size, float maxValue, float current) {
        float interpolated;
        float edgeSize = m2375e(relativeValue * size, 0.0f, maxValue);
        float value = mo2624g(size - current, edgeSize) - mo2624g(current, edgeSize);
        if (value < 0.0f) {
            interpolated = -this.f2060c.getInterpolation(-value);
        } else if (value <= 0.0f) {
            return 0.0f;
        } else {
            interpolated = this.f2060c.getInterpolation(value);
        }
        return m2375e(interpolated, -1.0f, 1.0f);
    }

    /* renamed from: g */
    public final float mo2624g(float current, float leading) {
        if (leading == 0.0f) {
            return 0.0f;
        }
        int i = this.f2065h;
        if (i == 0 || i == 1) {
            if (current < leading) {
                if (current >= 0.0f) {
                    return 1.0f - (current / leading);
                }
                if (!this.f2073p || i != 1) {
                    return 0.0f;
                }
                return 1.0f;
            }
        } else if (i == 2 && current < 0.0f) {
            return current / (-leading);
        }
        return 0.0f;
    }

    /* renamed from: f */
    public static int m2376f(int value, int min, int max) {
        if (value > max) {
            return max;
        }
        if (value < min) {
            return min;
        }
        return value;
    }

    /* renamed from: e */
    public static float m2375e(float value, float min, float max) {
        if (value > max) {
            return max;
        }
        if (value < min) {
            return min;
        }
        return value;
    }

    /* renamed from: c */
    public void mo2622c() {
        long eventTime = SystemClock.uptimeMillis();
        MotionEvent cancel = MotionEvent.obtain(eventTime, eventTime, 3, 0.0f, 0.0f, 0);
        this.f2061d.onTouchEvent(cancel);
        cancel.recycle();
    }

    /* renamed from: a.h.n.a$b */
    public class C0482b implements Runnable {
        public C0482b() {
        }

        public void run() {
            C0480a aVar = C0480a.this;
            if (aVar.f2073p) {
                if (aVar.f2071n) {
                    aVar.f2071n = false;
                    aVar.f2059b.mo2653m();
                }
                C0481a scroller = C0480a.this.f2059b;
                if (scroller.mo2648h() || !C0480a.this.mo2639u()) {
                    C0480a.this.f2073p = false;
                    return;
                }
                C0480a aVar2 = C0480a.this;
                if (aVar2.f2072o) {
                    aVar2.f2072o = false;
                    aVar2.mo2622c();
                }
                scroller.mo2641a();
                C0480a.this.mo2627j(scroller.mo2642b(), scroller.mo2643c());
                C0460r.m2247V(C0480a.this.f2061d, this);
            }
        }
    }

    /* renamed from: a.h.n.a$a */
    public static class C0481a {

        /* renamed from: a */
        public int f2076a;

        /* renamed from: b */
        public int f2077b;

        /* renamed from: c */
        public float f2078c;

        /* renamed from: d */
        public float f2079d;

        /* renamed from: e */
        public long f2080e = Long.MIN_VALUE;

        /* renamed from: f */
        public long f2081f = 0;

        /* renamed from: g */
        public int f2082g = 0;

        /* renamed from: h */
        public int f2083h = 0;

        /* renamed from: i */
        public long f2084i = -1;

        /* renamed from: j */
        public float f2085j;

        /* renamed from: k */
        public int f2086k;

        /* renamed from: k */
        public void mo2651k(int durationMillis) {
            this.f2076a = durationMillis;
        }

        /* renamed from: j */
        public void mo2650j(int durationMillis) {
            this.f2077b = durationMillis;
        }

        /* renamed from: m */
        public void mo2653m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2080e = currentAnimationTimeMillis;
            this.f2084i = -1;
            this.f2081f = currentAnimationTimeMillis;
            this.f2085j = 0.5f;
            this.f2082g = 0;
            this.f2083h = 0;
        }

        /* renamed from: i */
        public void mo2649i() {
            long currentTime = AnimationUtils.currentAnimationTimeMillis();
            this.f2086k = C0480a.m2376f((int) (currentTime - this.f2080e), 0, this.f2077b);
            this.f2085j = mo2645e(currentTime);
            this.f2084i = currentTime;
        }

        /* renamed from: h */
        public boolean mo2648h() {
            return this.f2084i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2084i + ((long) this.f2086k);
        }

        /* renamed from: e */
        public final float mo2645e(long currentTime) {
            long elapsedSinceEnd = this.f2080e;
            if (currentTime < elapsedSinceEnd) {
                return 0.0f;
            }
            long j = this.f2084i;
            if (j < 0 || currentTime < j) {
                return C0480a.m2375e(((float) (currentTime - elapsedSinceEnd)) / ((float) this.f2076a), 0.0f, 1.0f) * 0.5f;
            }
            long elapsedSinceEnd2 = currentTime - j;
            float f = this.f2085j;
            return (1.0f - f) + (f * C0480a.m2375e(((float) elapsedSinceEnd2) / ((float) this.f2086k), 0.0f, 1.0f));
        }

        /* renamed from: g */
        public final float mo2647g(float value) {
            return (-4.0f * value * value) + (4.0f * value);
        }

        /* renamed from: a */
        public void mo2641a() {
            if (this.f2081f != 0) {
                long currentTime = AnimationUtils.currentAnimationTimeMillis();
                float scale = mo2647g(mo2645e(currentTime));
                long elapsedSinceDelta = currentTime - this.f2081f;
                this.f2081f = currentTime;
                this.f2082g = (int) (((float) elapsedSinceDelta) * scale * this.f2078c);
                this.f2083h = (int) (((float) elapsedSinceDelta) * scale * this.f2079d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: l */
        public void mo2652l(float x, float y) {
            this.f2078c = x;
            this.f2079d = y;
        }

        /* renamed from: d */
        public int mo2644d() {
            float f = this.f2078c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int mo2646f() {
            float f = this.f2079d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: b */
        public int mo2642b() {
            return this.f2082g;
        }

        /* renamed from: c */
        public int mo2643c() {
            return this.f2083h;
        }
    }
}
