package p000a.p002b.p006m.p007a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p000a.p002b.p006m.p007a.C0063b;

@SuppressLint({"RestrictedAPI"})
/* renamed from: a.b.m.a.d */
public class C0068d extends C0063b {

    /* renamed from: n */
    public C0069a f473n;

    /* renamed from: o */
    public boolean f474o;

    public boolean isStateful() {
        return true;
    }

    public boolean onStateChange(int[] stateSet) {
        boolean changed = super.onStateChange(stateSet);
        int idx = this.f473n.mo403A(stateSet);
        if (idx < 0) {
            idx = this.f473n.mo403A(StateSet.WILD_CARD);
        }
        return mo307g(idx) || changed;
    }

    /* renamed from: k */
    public int[] mo402k(AttributeSet attrs) {
        int j = 0;
        int numAttrs = attrs.getAttributeCount();
        int[] states = new int[numAttrs];
        for (int i = 0; i < numAttrs; i++) {
            int stateResId = attrs.getAttributeNameResource(i);
            if (!(stateResId == 0 || stateResId == 16842960 || stateResId == 16843161)) {
                int j2 = j + 1;
                states[j] = attrs.getAttributeBooleanValue(i, false) ? stateResId : -stateResId;
                j = j2;
            }
        }
        return StateSet.trimStateSet(states, j);
    }

    public Drawable mutate() {
        if (!this.f474o) {
            super.mutate();
            if (this == this) {
                this.f473n.mo294r();
                this.f474o = true;
            }
        }
        return this;
    }

    /* renamed from: j */
    public C0069a mo267b() {
        return new C0069a(this.f473n, this, (Resources) null);
    }

    /* renamed from: a.b.m.a.d$a */
    public static class C0069a extends C0063b.C0066c {

        /* renamed from: J */
        public int[][] f475J;

        public C0069a(C0069a orig, C0068d owner, Resources res) {
            super(orig, owner, res);
            if (orig != null) {
                this.f475J = orig.f475J;
            } else {
                this.f475J = new int[mo348f()][];
            }
        }

        /* renamed from: r */
        public void mo294r() {
            int[][] iArr = this.f475J;
            int[][] stateSets = new int[iArr.length][];
            for (int i = iArr.length - 1; i >= 0; i--) {
                int[][] iArr2 = this.f475J;
                stateSets[i] = iArr2[i] != null ? (int[]) iArr2[i].clone() : null;
            }
            this.f475J = stateSets;
        }

        /* renamed from: z */
        public int mo404z(int[] stateSet, Drawable drawable) {
            int pos = mo342a(drawable);
            this.f475J[pos] = stateSet;
            return pos;
        }

        /* renamed from: A */
        public int mo403A(int[] stateSet) {
            int[][] stateSets = this.f475J;
            int count = mo351h();
            for (int i = 0; i < count; i++) {
                if (StateSet.stateSetMatches(stateSets[i], stateSet)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new C0068d(this, (Resources) null);
        }

        public Drawable newDrawable(Resources res) {
            return new C0068d(this, res);
        }

        /* renamed from: o */
        public void mo358o(int oldSize, int newSize) {
            super.mo358o(oldSize, newSize);
            int[][] newStateSets = new int[newSize][];
            System.arraycopy(this.f475J, 0, newStateSets, 0, oldSize);
            this.f475J = newStateSets;
        }
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* renamed from: h */
    public void mo268h(C0063b.C0066c state) {
        super.mo268h(state);
        if (state instanceof C0069a) {
            this.f473n = (C0069a) state;
        }
    }

    public C0068d(C0069a state, Resources res) {
        mo268h(new C0069a(state, this, res));
        onStateChange(getState());
    }

    public C0068d(C0069a state) {
        if (state != null) {
            mo268h(state);
        }
    }
}
