package p000a.p051m;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: a.m.d */
public abstract class C0577d {

    /* renamed from: a.m.d$a */
    public enum C0578a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: a */
    public abstract void mo3099a(C0581f fVar);

    /* renamed from: b */
    public abstract C0579b mo3100b();

    /* renamed from: c */
    public abstract void mo3101c(C0581f fVar);

    public C0577d() {
        new AtomicReference();
    }

    /* renamed from: a.m.d$b */
    public enum C0579b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean mo3102a(C0579b state) {
            return compareTo(state) >= 0;
        }
    }
}
