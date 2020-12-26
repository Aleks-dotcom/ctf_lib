package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p066b.p067a.p068a.p069a.p077h0.C0977a;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: k */
    public final C0977a f4858k = new C0977a(this);

    /* renamed from: E */
    public boolean mo6473E(View child) {
        return this.f4858k.mo5723a(child);
    }

    /* renamed from: k */
    public boolean mo4424k(CoordinatorLayout parent, View child, MotionEvent event) {
        this.f4858k.mo5724b(parent, child, event);
        return super.mo4424k(parent, child, event);
    }
}
