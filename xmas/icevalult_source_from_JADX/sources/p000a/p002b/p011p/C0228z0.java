package p000a.p002b.p011p;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.C0469s;

/* renamed from: a.b.p.z0 */
public class C0228z0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    public static C0228z0 f1128k;

    /* renamed from: l */
    public static C0228z0 f1129l;

    /* renamed from: b */
    public final View f1130b;

    /* renamed from: c */
    public final CharSequence f1131c;

    /* renamed from: d */
    public final int f1132d;

    /* renamed from: e */
    public final Runnable f1133e = new C0229a();

    /* renamed from: f */
    public final Runnable f1134f = new C0230b();

    /* renamed from: g */
    public int f1135g;

    /* renamed from: h */
    public int f1136h;

    /* renamed from: i */
    public C0127a1 f1137i;

    /* renamed from: j */
    public boolean f1138j;

    /* renamed from: a.b.p.z0$a */
    public class C0229a implements Runnable {
        public C0229a() {
        }

        public void run() {
            C0228z0.this.mo1608g(false);
        }
    }

    /* renamed from: a.b.p.z0$b */
    public class C0230b implements Runnable {
        public C0230b() {
        }

        public void run() {
            C0228z0.this.mo1606c();
        }
    }

    /* renamed from: f */
    public static void m1187f(View view, CharSequence tooltipText) {
        C0228z0 z0Var = f1128k;
        if (z0Var != null && z0Var.f1130b == view) {
            m1186e((C0228z0) null);
        }
        if (TextUtils.isEmpty(tooltipText)) {
            C0228z0 z0Var2 = f1129l;
            if (z0Var2 != null && z0Var2.f1130b == view) {
                z0Var2.mo1606c();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0228z0(view, tooltipText);
    }

    public C0228z0(View anchor, CharSequence tooltipText) {
        this.f1130b = anchor;
        this.f1131c = tooltipText;
        this.f1132d = C0469s.m2335c(ViewConfiguration.get(anchor.getContext()));
        mo1605b();
        anchor.setOnLongClickListener(this);
        anchor.setOnHoverListener(this);
    }

    public boolean onLongClick(View v) {
        this.f1135g = v.getWidth() / 2;
        this.f1136h = v.getHeight() / 2;
        mo1608g(true);
        return true;
    }

    public boolean onHover(View v, MotionEvent event) {
        if (this.f1137i != null && this.f1138j) {
            return false;
        }
        AccessibilityManager manager = (AccessibilityManager) this.f1130b.getContext().getSystemService("accessibility");
        if (manager.isEnabled() && manager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action != 7) {
            if (action == 10) {
                mo1605b();
                mo1606c();
            }
        } else if (this.f1130b.isEnabled() && this.f1137i == null && mo1609h(event)) {
            m1186e(this);
        }
        return false;
    }

    public void onViewAttachedToWindow(View v) {
    }

    public void onViewDetachedFromWindow(View v) {
        mo1606c();
    }

    /* renamed from: g */
    public void mo1608g(boolean fromTouch) {
        long timeout;
        if (C0460r.m2234I(this.f1130b)) {
            m1186e((C0228z0) null);
            C0228z0 z0Var = f1129l;
            if (z0Var != null) {
                z0Var.mo1606c();
            }
            f1129l = this;
            this.f1138j = fromTouch;
            C0127a1 a1Var = new C0127a1(this.f1130b.getContext());
            this.f1137i = a1Var;
            a1Var.mo941e(this.f1130b, this.f1135g, this.f1136h, this.f1138j, this.f1131c);
            this.f1130b.addOnAttachStateChangeListener(this);
            if (this.f1138j) {
                timeout = 2500;
            } else if ((C0460r.m2228C(this.f1130b) & 1) == 1) {
                timeout = 3000 - ((long) ViewConfiguration.getLongPressTimeout());
            } else {
                timeout = 15000 - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f1130b.removeCallbacks(this.f1134f);
            this.f1130b.postDelayed(this.f1134f, timeout);
        }
    }

    /* renamed from: c */
    public void mo1606c() {
        if (f1129l == this) {
            f1129l = null;
            C0127a1 a1Var = this.f1137i;
            if (a1Var != null) {
                a1Var.mo939c();
                this.f1137i = null;
                mo1605b();
                this.f1130b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1128k == this) {
            m1186e((C0228z0) null);
        }
        this.f1130b.removeCallbacks(this.f1134f);
    }

    /* renamed from: e */
    public static void m1186e(C0228z0 handler) {
        C0228z0 z0Var = f1128k;
        if (z0Var != null) {
            z0Var.mo1604a();
        }
        f1128k = handler;
        if (handler != null) {
            handler.mo1607d();
        }
    }

    /* renamed from: d */
    public final void mo1607d() {
        this.f1130b.postDelayed(this.f1133e, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: a */
    public final void mo1604a() {
        this.f1130b.removeCallbacks(this.f1133e);
    }

    /* renamed from: h */
    public final boolean mo1609h(MotionEvent event) {
        int newAnchorX = (int) event.getX();
        int newAnchorY = (int) event.getY();
        if (Math.abs(newAnchorX - this.f1135g) <= this.f1132d && Math.abs(newAnchorY - this.f1136h) <= this.f1132d) {
            return false;
        }
        this.f1135g = newAnchorX;
        this.f1136h = newAnchorY;
        return true;
    }

    /* renamed from: b */
    public final void mo1605b() {
        this.f1135g = Integer.MAX_VALUE;
        this.f1136h = Integer.MAX_VALUE;
    }
}
