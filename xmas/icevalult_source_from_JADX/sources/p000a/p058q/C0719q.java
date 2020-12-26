package p000a.p058q;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p058q.C0706m;

/* renamed from: a.q.q */
public class C0719q extends C0706m {

    /* renamed from: K */
    public ArrayList<C0706m> f2731K = new ArrayList<>();

    /* renamed from: L */
    public boolean f2732L = true;

    /* renamed from: M */
    public int f2733M;

    /* renamed from: N */
    public boolean f2734N = false;

    /* renamed from: O */
    public int f2735O = 0;

    /* renamed from: U */
    public /* bridge */ /* synthetic */ C0706m mo3543U(long j) {
        mo3592k0(j);
        return this;
    }

    /* renamed from: m0 */
    public C0719q mo3594m0(int ordering) {
        if (ordering == 0) {
            this.f2732L = true;
        } else if (ordering == 1) {
            this.f2732L = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + ordering);
        }
        return this;
    }

    /* renamed from: e0 */
    public C0719q mo3586e0(C0706m transition) {
        mo3587f0(transition);
        long j = this.f2693d;
        if (j >= 0) {
            transition.mo3543U(j);
        }
        if ((this.f2735O & 1) != 0) {
            transition.mo3545W(mo3566s());
        }
        if ((this.f2735O & 2) != 0) {
            transition.mo3547Y(mo3571w());
        }
        if ((this.f2735O & 4) != 0) {
            transition.mo3546X(mo3570v());
        }
        if ((this.f2735O & 8) != 0) {
            transition.mo3544V(mo3565r());
        }
        return this;
    }

    /* renamed from: f0 */
    public final void mo3587f0(C0706m transition) {
        this.f2731K.add(transition);
        transition.f2708s = this;
    }

    /* renamed from: h0 */
    public int mo3589h0() {
        return this.f2731K.size();
    }

    /* renamed from: g0 */
    public C0706m mo3588g0(int index) {
        if (index < 0 || index >= this.f2731K.size()) {
            return null;
        }
        return this.f2731K.get(index);
    }

    /* renamed from: k0 */
    public C0719q mo3592k0(long duration) {
        ArrayList<C0706m> arrayList;
        super.mo3543U(duration);
        if (this.f2693d >= 0 && (arrayList = this.f2731K) != null) {
            int numTransitions = arrayList.size();
            for (int i = 0; i < numTransitions; i++) {
                this.f2731K.get(i).mo3543U(duration);
            }
        }
        return this;
    }

    /* renamed from: n0 */
    public C0719q mo3548Z(long startDelay) {
        super.mo3548Z(startDelay);
        return this;
    }

    /* renamed from: l0 */
    public C0719q mo3545W(TimeInterpolator interpolator) {
        this.f2735O |= 1;
        ArrayList<C0706m> arrayList = this.f2731K;
        if (arrayList != null) {
            int numTransitions = arrayList.size();
            for (int i = 0; i < numTransitions; i++) {
                this.f2731K.get(i).mo3545W(interpolator);
            }
        }
        super.mo3545W(interpolator);
        return this;
    }

    /* renamed from: d0 */
    public C0719q mo3551b(View target) {
        for (int i = 0; i < this.f2731K.size(); i++) {
            this.f2731K.get(i).mo3551b(target);
        }
        super.mo3551b(target);
        return this;
    }

    /* renamed from: c0 */
    public C0719q mo3549a(C0706m.C0712f listener) {
        super.mo3549a(listener);
        return this;
    }

    /* renamed from: j0 */
    public C0719q mo3539Q(View target) {
        for (int i = 0; i < this.f2731K.size(); i++) {
            this.f2731K.get(i).mo3539Q(target);
        }
        super.mo3539Q(target);
        return this;
    }

    /* renamed from: i0 */
    public C0719q mo3538P(C0706m.C0712f listener) {
        super.mo3538P(listener);
        return this;
    }

    /* renamed from: X */
    public void mo3546X(C0691g pathMotion) {
        super.mo3546X(pathMotion);
        this.f2735O |= 4;
        if (this.f2731K != null) {
            for (int i = 0; i < this.f2731K.size(); i++) {
                this.f2731K.get(i).mo3546X(pathMotion);
            }
        }
    }

    /* renamed from: o0 */
    public final void mo3596o0() {
        C0721b listener = new C0721b(this);
        Iterator<C0706m> it = this.f2731K.iterator();
        while (it.hasNext()) {
            it.next().mo3549a(listener);
        }
        this.f2733M = this.f2731K.size();
    }

    /* renamed from: a.q.q$b */
    public static class C0721b extends C0714n {

        /* renamed from: a */
        public C0719q f2737a;

        public C0721b(C0719q transitionSet) {
            this.f2737a = transitionSet;
        }

        /* renamed from: a */
        public void mo3496a(C0706m transition) {
            C0719q qVar = this.f2737a;
            if (!qVar.f2734N) {
                qVar.mo3550a0();
                this.f2737a.f2734N = true;
            }
        }

        /* renamed from: c */
        public void mo3473c(C0706m transition) {
            C0719q qVar = this.f2737a;
            int i = qVar.f2733M - 1;
            qVar.f2733M = i;
            if (i == 0) {
                qVar.f2734N = false;
                qVar.mo3563p();
            }
            transition.mo3538P(this);
        }
    }

    /* renamed from: o */
    public void mo3562o(ViewGroup sceneRoot, C0724t startValues, C0724t endValues, ArrayList<C0723s> startValuesList, ArrayList<C0723s> endValuesList) {
        long startDelay = mo3572y();
        int numTransitions = this.f2731K.size();
        for (int i = 0; i < numTransitions; i++) {
            C0706m childTransition = this.f2731K.get(i);
            if (startDelay > 0 && (this.f2732L || i == 0)) {
                long childStartDelay = childTransition.mo3572y();
                if (childStartDelay > 0) {
                    childTransition.mo3548Z(startDelay + childStartDelay);
                } else {
                    childTransition.mo3548Z(startDelay);
                }
            }
            childTransition.mo3562o(sceneRoot, startValues, endValues, startValuesList, endValuesList);
        }
    }

    /* renamed from: T */
    public void mo3542T() {
        if (this.f2731K.isEmpty()) {
            mo3550a0();
            mo3563p();
            return;
        }
        mo3596o0();
        if (!this.f2732L) {
            for (int i = 1; i < this.f2731K.size(); i++) {
                this.f2731K.get(i - 1).mo3549a(new C0720a(this, this.f2731K.get(i)));
            }
            C0706m firstTransition = this.f2731K.get(0);
            if (firstTransition != null) {
                firstTransition.mo3542T();
                return;
            }
            return;
        }
        Iterator<C0706m> it = this.f2731K.iterator();
        while (it.hasNext()) {
            it.next().mo3542T();
        }
    }

    /* renamed from: a.q.q$a */
    public class C0720a extends C0714n {

        /* renamed from: a */
        public final /* synthetic */ C0706m f2736a;

        public C0720a(C0719q this$0, C0706m mVar) {
            this.f2736a = mVar;
        }

        /* renamed from: c */
        public void mo3473c(C0706m transition) {
            this.f2736a.mo3542T();
            transition.mo3538P(this);
        }
    }

    /* renamed from: j */
    public void mo3443j(C0723s transitionValues) {
        if (mo3530G(transitionValues.f2742b)) {
            Iterator<C0706m> it = this.f2731K.iterator();
            while (it.hasNext()) {
                C0706m childTransition = it.next();
                if (childTransition.mo3530G(transitionValues.f2742b)) {
                    childTransition.mo3443j(transitionValues);
                    transitionValues.f2743c.add(childTransition);
                }
            }
        }
    }

    /* renamed from: g */
    public void mo3442g(C0723s transitionValues) {
        if (mo3530G(transitionValues.f2742b)) {
            Iterator<C0706m> it = this.f2731K.iterator();
            while (it.hasNext()) {
                C0706m childTransition = it.next();
                if (childTransition.mo3530G(transitionValues.f2742b)) {
                    childTransition.mo3442g(transitionValues);
                    transitionValues.f2743c.add(childTransition);
                }
            }
        }
    }

    /* renamed from: i */
    public void mo3558i(C0723s transitionValues) {
        super.mo3558i(transitionValues);
        int numTransitions = this.f2731K.size();
        for (int i = 0; i < numTransitions; i++) {
            this.f2731K.get(i).mo3558i(transitionValues);
        }
    }

    /* renamed from: N */
    public void mo3536N(View sceneRoot) {
        super.mo3536N(sceneRoot);
        int numTransitions = this.f2731K.size();
        for (int i = 0; i < numTransitions; i++) {
            this.f2731K.get(i).mo3536N(sceneRoot);
        }
    }

    /* renamed from: R */
    public void mo3540R(View sceneRoot) {
        super.mo3540R(sceneRoot);
        int numTransitions = this.f2731K.size();
        for (int i = 0; i < numTransitions; i++) {
            this.f2731K.get(i).mo3540R(sceneRoot);
        }
    }

    /* renamed from: Y */
    public void mo3547Y(C0718p propagation) {
        super.mo3547Y(propagation);
        this.f2735O |= 2;
        int numTransitions = this.f2731K.size();
        for (int i = 0; i < numTransitions; i++) {
            this.f2731K.get(i).mo3547Y(propagation);
        }
    }

    /* renamed from: V */
    public void mo3544V(C0706m.C0711e epicenterCallback) {
        super.mo3544V(epicenterCallback);
        this.f2735O |= 8;
        int numTransitions = this.f2731K.size();
        for (int i = 0; i < numTransitions; i++) {
            this.f2731K.get(i).mo3544V(epicenterCallback);
        }
    }

    /* renamed from: b0 */
    public String mo3552b0(String indent) {
        String result = super.mo3552b0(indent);
        for (int i = 0; i < this.f2731K.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(result);
            sb.append("\n");
            sb.append(this.f2731K.get(i).mo3552b0(indent + "  "));
            result = sb.toString();
        }
        return result;
    }

    /* renamed from: m */
    public C0706m clone() {
        C0719q clone = (C0719q) super.clone();
        clone.f2731K = new ArrayList<>();
        int numTransitions = this.f2731K.size();
        for (int i = 0; i < numTransitions; i++) {
            clone.mo3587f0(this.f2731K.get(i).clone());
        }
        return clone;
    }
}
