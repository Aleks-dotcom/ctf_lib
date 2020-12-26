package p000a.p057p;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry;
import p000a.p051m.C0577d;

/* renamed from: a.p.a */
public final class C0657a {

    /* renamed from: a */
    public final C0658b f2593a;

    /* renamed from: b */
    public final SavedStateRegistry f2594b = new SavedStateRegistry();

    public C0657a(C0658b owner) {
        this.f2593a = owner;
    }

    /* renamed from: b */
    public SavedStateRegistry mo3430b() {
        return this.f2594b;
    }

    /* renamed from: c */
    public void mo3431c(Bundle savedState) {
        C0577d lifecycle = this.f2593a.mo2824a();
        if (lifecycle.mo3100b() == C0577d.C0579b.INITIALIZED) {
            lifecycle.mo3099a(new Recreator(this.f2593a));
            this.f2594b.mo5434b(lifecycle, savedState);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: d */
    public void mo3432d(Bundle outBundle) {
        this.f2594b.mo5435c(outBundle);
    }

    /* renamed from: a */
    public static C0657a m3302a(C0658b owner) {
        return new C0657a(owner);
    }
}
