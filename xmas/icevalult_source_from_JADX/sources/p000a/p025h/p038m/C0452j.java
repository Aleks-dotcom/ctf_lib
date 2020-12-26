package p000a.p025h.p038m;

import android.view.View;
import android.view.ViewParent;

/* renamed from: a.h.m.j */
public class C0452j {

    /* renamed from: a */
    public ViewParent f2018a;

    /* renamed from: b */
    public ViewParent f2019b;

    /* renamed from: c */
    public final View f2020c;

    /* renamed from: d */
    public boolean f2021d;

    /* renamed from: e */
    public int[] f2022e;

    public C0452j(View view) {
        this.f2020c = view;
    }

    /* renamed from: n */
    public void mo2540n(boolean enabled) {
        if (this.f2021d) {
            C0460r.m2287r0(this.f2020c);
        }
        this.f2021d = enabled;
    }

    /* renamed from: m */
    public boolean mo2539m() {
        return this.f2021d;
    }

    /* renamed from: k */
    public boolean mo2537k() {
        return mo2538l(0);
    }

    /* renamed from: l */
    public boolean mo2538l(int type) {
        return mo2535i(type) != null;
    }

    /* renamed from: p */
    public boolean mo2542p(int axes) {
        return mo2543q(axes, 0);
    }

    /* renamed from: q */
    public boolean mo2543q(int axes, int type) {
        if (mo2538l(type)) {
            return true;
        }
        if (!mo2539m()) {
            return false;
        }
        View child = this.f2020c;
        for (ViewParent p = this.f2020c.getParent(); p != null; p = p.getParent()) {
            if (C0471u.m2344f(p, child, this.f2020c, axes, type)) {
                mo2541o(type, p);
                C0471u.m2343e(p, child, this.f2020c, axes, type);
                return true;
            }
            if (p instanceof View) {
                child = (View) p;
            }
        }
        return false;
    }

    /* renamed from: r */
    public void mo2544r() {
        mo2545s(0);
    }

    /* renamed from: s */
    public void mo2545s(int type) {
        ViewParent parent = mo2535i(type);
        if (parent != null) {
            C0471u.m2345g(parent, this.f2020c, type);
            mo2541o(type, (ViewParent) null);
        }
    }

    /* renamed from: f */
    public boolean mo2532f(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return mo2534h(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, 0, (int[]) null);
    }

    /* renamed from: g */
    public boolean mo2533g(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        return mo2534h(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type, (int[]) null);
    }

    /* renamed from: e */
    public void mo2531e(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type, int[] consumed) {
        mo2534h(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type, consumed);
    }

    /* renamed from: h */
    public final boolean mo2534h(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type, int[] consumed) {
        int startY;
        int startX;
        int[] consumed2;
        int[] iArr = offsetInWindow;
        if (mo2539m()) {
            ViewParent parent = mo2535i(type);
            if (parent == null) {
                return false;
            }
            if (dxConsumed != 0 || dyConsumed != 0 || dxUnconsumed != 0 || dyUnconsumed != 0) {
                if (iArr != null) {
                    this.f2020c.getLocationInWindow(iArr);
                    startX = iArr[0];
                    startY = iArr[1];
                } else {
                    startX = 0;
                    startY = 0;
                }
                if (consumed == null) {
                    int[] consumed3 = mo2536j();
                    consumed3[0] = 0;
                    consumed3[1] = 0;
                    consumed2 = consumed3;
                } else {
                    consumed2 = consumed;
                }
                C0471u.m2342d(parent, this.f2020c, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type, consumed2);
                if (iArr != null) {
                    this.f2020c.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - startX;
                    iArr[1] = iArr[1] - startY;
                }
                return true;
            } else if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
        } else {
            int i = type;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo2529c(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return mo2530d(dx, dy, consumed, offsetInWindow, 0);
    }

    /* renamed from: d */
    public boolean mo2530d(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        int startY;
        int startX;
        int[] consumed2;
        int[] iArr = offsetInWindow;
        if (mo2539m()) {
            ViewParent parent = mo2535i(type);
            if (parent == null) {
                return false;
            }
            if (dx != 0 || dy != 0) {
                if (iArr != null) {
                    this.f2020c.getLocationInWindow(iArr);
                    startX = iArr[0];
                    startY = iArr[1];
                } else {
                    startX = 0;
                    startY = 0;
                }
                if (consumed == null) {
                    consumed2 = mo2536j();
                } else {
                    consumed2 = consumed;
                }
                consumed2[0] = 0;
                consumed2[1] = 0;
                C0471u.m2341c(parent, this.f2020c, dx, dy, consumed2, type);
                if (iArr != null) {
                    this.f2020c.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - startX;
                    iArr[1] = iArr[1] - startY;
                }
                return (consumed2[0] == 0 && consumed2[1] == 0) ? false : true;
            } else if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
        } else {
            int i = type;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2527a(float velocityX, float velocityY, boolean consumed) {
        ViewParent parent;
        if (!mo2539m() || (parent = mo2535i(0)) == null) {
            return false;
        }
        return C0471u.m2339a(parent, this.f2020c, velocityX, velocityY, consumed);
    }

    /* renamed from: b */
    public boolean mo2528b(float velocityX, float velocityY) {
        ViewParent parent;
        if (!mo2539m() || (parent = mo2535i(0)) == null) {
            return false;
        }
        return C0471u.m2340b(parent, this.f2020c, velocityX, velocityY);
    }

    /* renamed from: i */
    public final ViewParent mo2535i(int type) {
        if (type == 0) {
            return this.f2018a;
        }
        if (type != 1) {
            return null;
        }
        return this.f2019b;
    }

    /* renamed from: o */
    public final void mo2541o(int type, ViewParent p) {
        if (type == 0) {
            this.f2018a = p;
        } else if (type == 1) {
            this.f2019b = p;
        }
    }

    /* renamed from: j */
    public final int[] mo2536j() {
        if (this.f2022e == null) {
            this.f2022e = new int[2];
        }
        return this.f2022e;
    }
}
