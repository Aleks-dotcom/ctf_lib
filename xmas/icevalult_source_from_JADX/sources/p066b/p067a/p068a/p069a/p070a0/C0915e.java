package p066b.p067a.p068a.p069a.p070a0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: b.a.a.a.a0.e */
public final class C0915e {

    /* renamed from: a */
    public final ArrayList<C0917b> f3828a = new ArrayList<>();

    /* renamed from: b */
    public C0917b f3829b = null;

    /* renamed from: c */
    public ValueAnimator f3830c = null;

    /* renamed from: d */
    public final Animator.AnimatorListener f3831d = new C0916a();

    /* renamed from: b.a.a.a.a0.e$a */
    public class C0916a extends AnimatorListenerAdapter {
        public C0916a() {
        }

        public void onAnimationEnd(Animator animator) {
            C0915e eVar = C0915e.this;
            if (eVar.f3830c == animator) {
                eVar.f3830c = null;
            }
        }
    }

    /* renamed from: a */
    public void mo5507a(int[] specs, ValueAnimator animator) {
        C0917b tuple = new C0917b(specs, animator);
        animator.addListener(this.f3831d);
        this.f3828a.add(tuple);
    }

    /* renamed from: d */
    public void mo5510d(int[] state) {
        C0917b match = null;
        int count = this.f3828a.size();
        int i = 0;
        while (true) {
            if (i >= count) {
                break;
            }
            C0917b tuple = this.f3828a.get(i);
            if (StateSet.stateSetMatches(tuple.f3833a, state)) {
                match = tuple;
                break;
            }
            i++;
        }
        C0917b bVar = this.f3829b;
        if (match != bVar) {
            if (bVar != null) {
                mo5508b();
            }
            this.f3829b = match;
            if (match != null) {
                mo5511e(match);
            }
        }
    }

    /* renamed from: e */
    public final void mo5511e(C0917b match) {
        ValueAnimator valueAnimator = match.f3834b;
        this.f3830c = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: b */
    public final void mo5508b() {
        ValueAnimator valueAnimator = this.f3830c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f3830c = null;
        }
    }

    /* renamed from: c */
    public void mo5509c() {
        ValueAnimator valueAnimator = this.f3830c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f3830c = null;
        }
    }

    /* renamed from: b.a.a.a.a0.e$b */
    public static class C0917b {

        /* renamed from: a */
        public final int[] f3833a;

        /* renamed from: b */
        public final ValueAnimator f3834b;

        public C0917b(int[] specs, ValueAnimator animator) {
            this.f3833a = specs;
            this.f3834b = animator;
        }
    }
}
