package p000a.p025h.p038m;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: a.h.m.p */
public final class C0458p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final View f2025b;

    /* renamed from: c */
    public ViewTreeObserver f2026c;

    /* renamed from: d */
    public final Runnable f2027d;

    public C0458p(View view, Runnable runnable) {
        this.f2025b = view;
        this.f2026c = view.getViewTreeObserver();
        this.f2027d = runnable;
    }

    /* renamed from: a */
    public static C0458p m2224a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C0458p listener = new C0458p(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(listener);
            view.addOnAttachStateChangeListener(listener);
            return listener;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public boolean onPreDraw() {
        mo2563b();
        this.f2027d.run();
        return true;
    }

    /* renamed from: b */
    public void mo2563b() {
        if (this.f2026c.isAlive()) {
            this.f2026c.removeOnPreDrawListener(this);
        } else {
            this.f2025b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f2025b.removeOnAttachStateChangeListener(this);
    }

    public void onViewAttachedToWindow(View v) {
        this.f2026c = v.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View v) {
        mo2563b();
    }
}
