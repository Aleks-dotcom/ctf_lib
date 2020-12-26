package p000a.p001a;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: a.a.b */
public abstract class C0001b {

    /* renamed from: a */
    public boolean f0a;

    /* renamed from: b */
    public CopyOnWriteArrayList<C0000a> f1b = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public abstract void mo3b();

    public C0001b(boolean enabled) {
        this.f0a = enabled;
    }

    /* renamed from: f */
    public final void mo7f(boolean enabled) {
        this.f0a = enabled;
    }

    /* renamed from: c */
    public final boolean mo4c() {
        return this.f0a;
    }

    /* renamed from: d */
    public final void mo5d() {
        Iterator<C0000a> it = this.f1b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* renamed from: a */
    public void mo2a(C0000a cancellable) {
        this.f1b.add(cancellable);
    }

    /* renamed from: e */
    public void mo6e(C0000a cancellable) {
        this.f1b.remove(cancellable);
    }
}
