package p066b.p067a.p068a.p069a.p077h0;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p066b.p067a.p068a.p069a.p077h0.C0982e;

/* renamed from: b.a.a.a.h0.a */
public class C0977a {

    /* renamed from: a */
    public C0982e.C0984b f4008a;

    public C0977a(SwipeDismissBehavior<?> behavior) {
        behavior.mo6476K(0.1f);
        behavior.mo6475J(0.6f);
        behavior.mo6477L(0);
    }

    /* renamed from: a */
    public boolean mo5723a(View child) {
        return child instanceof C0980d;
    }

    /* renamed from: b */
    public void mo5724b(CoordinatorLayout parent, View child, MotionEvent event) {
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C0982e.m5308b().mo5743f(this.f4008a);
            }
        } else if (parent.mo4343B(child, (int) event.getX(), (int) event.getY())) {
            C0982e.m5308b().mo5742e(this.f4008a);
        }
    }
}
