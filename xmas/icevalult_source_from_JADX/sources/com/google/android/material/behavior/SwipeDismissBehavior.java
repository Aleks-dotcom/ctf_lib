package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000a.p025h.p038m.C0460r;
import p000a.p043j.p045b.C0512c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.C0824c<V> {

    /* renamed from: a */
    public C0512c f4651a;

    /* renamed from: b */
    public C1132b f4652b;

    /* renamed from: c */
    public boolean f4653c;

    /* renamed from: d */
    public float f4654d = 0.0f;

    /* renamed from: e */
    public boolean f4655e;

    /* renamed from: f */
    public int f4656f = 2;

    /* renamed from: g */
    public float f4657g = 0.5f;

    /* renamed from: h */
    public float f4658h = 0.0f;

    /* renamed from: i */
    public float f4659i = 0.5f;

    /* renamed from: j */
    public final C0512c.C0515c f4660j = new C1131a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public interface C1132b {
        /* renamed from: a */
        void mo6479a(View view);

        /* renamed from: b */
        void mo6480b(int i);
    }

    /* renamed from: L */
    public void mo6477L(int direction) {
        this.f4656f = direction;
    }

    /* renamed from: K */
    public void mo6476K(float fraction) {
        this.f4658h = m6030F(0.0f, fraction, 1.0f);
    }

    /* renamed from: J */
    public void mo6475J(float fraction) {
        this.f4659i = m6030F(0.0f, fraction, 1.0f);
    }

    /* renamed from: k */
    public boolean mo4424k(CoordinatorLayout parent, V child, MotionEvent event) {
        boolean dispatchEventToHelper = this.f4653c;
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f4653c = parent.mo4343B(child, (int) event.getX(), (int) event.getY());
            dispatchEventToHelper = this.f4653c;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f4653c = false;
        }
        if (!dispatchEventToHelper) {
            return false;
        }
        mo6474H(parent);
        return this.f4651a.mo2736G(event);
    }

    /* renamed from: D */
    public boolean mo4413D(CoordinatorLayout parent, V v, MotionEvent event) {
        C0512c cVar = this.f4651a;
        if (cVar == null) {
            return false;
        }
        cVar.mo2762z(event);
        return true;
    }

    /* renamed from: E */
    public boolean mo6473E(View view) {
        return true;
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C1131a extends C0512c.C0515c {

        /* renamed from: a */
        public int f4661a;

        /* renamed from: b */
        public int f4662b = -1;

        public C1131a() {
        }

        /* renamed from: m */
        public boolean mo2777m(View child, int pointerId) {
            int i = this.f4662b;
            return (i == -1 || i == pointerId) && SwipeDismissBehavior.this.mo6473E(child);
        }

        /* renamed from: i */
        public void mo2773i(View capturedChild, int activePointerId) {
            this.f4662b = activePointerId;
            this.f4661a = capturedChild.getLeft();
            ViewParent parent = capturedChild.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: j */
        public void mo2774j(int state) {
            C1132b bVar = SwipeDismissBehavior.this.f4652b;
            if (bVar != null) {
                bVar.mo6480b(state);
            }
        }

        /* renamed from: l */
        public void mo2776l(View child, float xvel, float yvel) {
            int targetLeft;
            C1132b bVar;
            this.f4662b = -1;
            int childWidth = child.getWidth();
            boolean dismiss = false;
            if (mo6478n(child, xvel)) {
                int left = child.getLeft();
                int i = this.f4661a;
                targetLeft = left < i ? i - childWidth : i + childWidth;
                dismiss = true;
            } else {
                targetLeft = this.f4661a;
            }
            if (SwipeDismissBehavior.this.f4651a.mo2735F(targetLeft, child.getTop())) {
                C0460r.m2247V(child, new C1133c(child, dismiss));
            } else if (dismiss && (bVar = SwipeDismissBehavior.this.f4652b) != null) {
                bVar.mo6479a(child);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0026 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0035 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo6478n(android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0039
                int r3 = p000a.p025h.p038m.C0460r.m2292v(r7)
                if (r3 != r2) goto L_0x0010
                r3 = 1
                goto L_0x0011
            L_0x0010:
                r3 = 0
            L_0x0011:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f4656f
                r5 = 2
                if (r4 != r5) goto L_0x0019
                return r2
            L_0x0019:
                if (r4 != 0) goto L_0x0028
                if (r3 == 0) goto L_0x0022
                int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r0 >= 0) goto L_0x0027
                goto L_0x0026
            L_0x0022:
                int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r0 <= 0) goto L_0x0027
            L_0x0026:
                r1 = 1
            L_0x0027:
                return r1
            L_0x0028:
                if (r4 != r2) goto L_0x0037
                if (r3 == 0) goto L_0x0031
                int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r0 <= 0) goto L_0x0036
                goto L_0x0035
            L_0x0031:
                int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r0 >= 0) goto L_0x0036
            L_0x0035:
                r1 = 1
            L_0x0036:
                return r1
            L_0x0037:
                return r1
            L_0x0039:
                int r0 = r7.getLeft()
                int r3 = r6.f4661a
                int r0 = r0 - r3
                int r3 = r7.getWidth()
                float r3 = (float) r3
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r4 = r4.f4657g
                float r3 = r3 * r4
                int r3 = java.lang.Math.round(r3)
                int r4 = java.lang.Math.abs(r0)
                if (r4 < r3) goto L_0x0056
                r1 = 1
            L_0x0056:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C1131a.mo6478n(android.view.View, float):boolean");
        }

        /* renamed from: d */
        public int mo2768d(View child) {
            return child.getWidth();
        }

        /* renamed from: a */
        public int mo2765a(View child, int left, int dx) {
            int max;
            int min;
            boolean isRtl = C0460r.m2292v(child) == 1;
            int max2 = SwipeDismissBehavior.this.f4656f;
            if (max2 == 0) {
                if (isRtl) {
                    min = this.f4661a - child.getWidth();
                    max = this.f4661a;
                } else {
                    min = this.f4661a;
                    max = this.f4661a + child.getWidth();
                }
            } else if (max2 != 1) {
                min = this.f4661a - child.getWidth();
                max = this.f4661a + child.getWidth();
            } else if (isRtl) {
                min = this.f4661a;
                max = this.f4661a + child.getWidth();
            } else {
                min = this.f4661a - child.getWidth();
                max = this.f4661a;
            }
            return SwipeDismissBehavior.m6031G(min, left, max);
        }

        /* renamed from: b */
        public int mo2766b(View child, int top, int dy) {
            return child.getTop();
        }

        /* renamed from: k */
        public void mo2775k(View child, int left, int top, int dx, int dy) {
            float startAlphaDistance = ((float) this.f4661a) + (((float) child.getWidth()) * SwipeDismissBehavior.this.f4658h);
            float endAlphaDistance = ((float) this.f4661a) + (((float) child.getWidth()) * SwipeDismissBehavior.this.f4659i);
            if (((float) left) <= startAlphaDistance) {
                child.setAlpha(1.0f);
            } else if (((float) left) >= endAlphaDistance) {
                child.setAlpha(0.0f);
            } else {
                child.setAlpha(SwipeDismissBehavior.m6030F(0.0f, 1.0f - SwipeDismissBehavior.m6032I(startAlphaDistance, endAlphaDistance, (float) left), 1.0f));
            }
        }
    }

    /* renamed from: H */
    public final void mo6474H(ViewGroup parent) {
        C0512c cVar;
        if (this.f4651a == null) {
            if (this.f4655e) {
                cVar = C0512c.m2532l(parent, this.f4654d, this.f4660j);
            } else {
                cVar = C0512c.m2533m(parent, this.f4660j);
            }
            this.f4651a = cVar;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public class C1133c implements Runnable {

        /* renamed from: b */
        public final View f4664b;

        /* renamed from: c */
        public final boolean f4665c;

        public C1133c(View view, boolean dismiss) {
            this.f4664b = view;
            this.f4665c = dismiss;
        }

        public void run() {
            C1132b bVar;
            C0512c cVar = SwipeDismissBehavior.this.f4651a;
            if (cVar != null && cVar.mo2749k(true)) {
                C0460r.m2247V(this.f4664b, this);
            } else if (this.f4665c && (bVar = SwipeDismissBehavior.this.f4652b) != null) {
                bVar.mo6479a(this.f4664b);
            }
        }
    }

    /* renamed from: F */
    public static float m6030F(float min, float value, float max) {
        return Math.min(Math.max(min, value), max);
    }

    /* renamed from: G */
    public static int m6031G(int min, int value, int max) {
        return Math.min(Math.max(min, value), max);
    }

    /* renamed from: I */
    public static float m6032I(float startValue, float endValue, float value) {
        return (value - startValue) / (endValue - startValue);
    }
}
