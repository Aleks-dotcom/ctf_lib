package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p000a.p025h.p038m.C0460r;
import p066b.p067a.p068a.p069a.p095y.C1099a;

public abstract class ExpandableBehavior extends CoordinatorLayout.C0824c<View> {

    /* renamed from: a */
    public int f4937a = 0;

    /* renamed from: H */
    public abstract boolean mo7156H(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /* renamed from: l */
    public boolean mo4425l(CoordinatorLayout parent, View child, int layoutDirection) {
        C1099a dep;
        if (C0460r.m2235J(child) || (dep = mo7155G(parent, child)) == null || !mo7154F(dep.mo6281a())) {
            return false;
        }
        this.f4937a = dep.mo6281a() ? 1 : 2;
        child.getViewTreeObserver().addOnPreDrawListener(new C1184a(child, this.f4937a, dep));
        return false;
    }

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class C1184a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        public final /* synthetic */ View f4938b;

        /* renamed from: c */
        public final /* synthetic */ int f4939c;

        /* renamed from: d */
        public final /* synthetic */ C1099a f4940d;

        public C1184a(View view, int i, C1099a aVar) {
            this.f4938b = view;
            this.f4939c = i;
            this.f4940d = aVar;
        }

        public boolean onPreDraw() {
            this.f4938b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f4937a == this.f4939c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                C1099a aVar = this.f4940d;
                expandableBehavior.mo7156H((View) aVar, this.f4938b, aVar.mo6281a(), false);
            }
            return false;
        }
    }

    /* renamed from: h */
    public boolean mo4421h(CoordinatorLayout parent, View child, View dependency) {
        C1099a dep = (C1099a) dependency;
        if (!mo7154F(dep.mo6281a())) {
            return false;
        }
        this.f4937a = dep.mo6281a() ? 1 : 2;
        return mo7156H((View) dep, child, dep.mo6281a(), true);
    }

    /* renamed from: G */
    public C1099a mo7155G(CoordinatorLayout parent, View child) {
        List<View> dependencies = parent.mo4391r(child);
        int size = dependencies.size();
        for (int i = 0; i < size; i++) {
            View dependency = dependencies.get(i);
            if (mo4418e(parent, child, dependency)) {
                return (C1099a) dependency;
            }
        }
        return null;
    }

    /* renamed from: F */
    public final boolean mo7154F(boolean expanded) {
        if (expanded) {
            int i = this.f4937a;
            if (i == 0 || i == 2) {
                return true;
            }
            return false;
        } else if (this.f4937a == 1) {
            return true;
        } else {
            return false;
        }
    }
}
