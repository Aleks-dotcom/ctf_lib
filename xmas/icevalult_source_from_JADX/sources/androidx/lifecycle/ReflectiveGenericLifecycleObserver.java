package androidx.lifecycle;

import p000a.p051m.C0572a;
import p000a.p051m.C0577d;
import p000a.p051m.C0580e;
import p000a.p051m.C0582g;

public class ReflectiveGenericLifecycleObserver implements C0580e {

    /* renamed from: a */
    public final Object f3521a;

    /* renamed from: b */
    public final C0572a.C0573a f3522b;

    public ReflectiveGenericLifecycleObserver(Object wrapped) {
        this.f3521a = wrapped;
        this.f3522b = C0572a.f2372c.mo3085c(wrapped.getClass());
    }

    /* renamed from: g */
    public void mo3103g(C0582g source, C0577d.C0578a event) {
        this.f3522b.mo3088a(source, event, this.f3521a);
    }
}
