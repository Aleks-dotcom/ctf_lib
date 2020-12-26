package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import p000a.p012c.p013a.p014a.C0231a;
import p000a.p012c.p013a.p015b.C0238b;
import p000a.p051m.C0577d;
import p000a.p051m.C0582g;
import p000a.p051m.C0590m;

public abstract class LiveData<T> {

    /* renamed from: i */
    public static final Object f3505i = new Object();

    /* renamed from: a */
    public final Object f3506a = new Object();

    /* renamed from: b */
    public C0238b<C0590m<? super T>, LiveData<T>.b> f3507b = new C0238b<>();

    /* renamed from: c */
    public int f3508c = 0;

    /* renamed from: d */
    public volatile Object f3509d;

    /* renamed from: e */
    public volatile Object f3510e;

    /* renamed from: f */
    public int f3511f;

    /* renamed from: g */
    public boolean f3512g;

    /* renamed from: h */
    public boolean f3513h;

    public LiveData() {
        Object obj = f3505i;
        this.f3509d = obj;
        this.f3510e = obj;
        this.f3511f = -1;
        new C0845a();
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    public class C0845a implements Runnable {
        public C0845a() {
        }

        public void run() {
            synchronized (LiveData.this.f3506a) {
                try {
                    Object newValue = LiveData.this.f3510e;
                    try {
                        LiveData.this.f3510e = LiveData.f3505i;
                        LiveData.this.mo3116h(newValue);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo4688b(LiveData<T>.b observer) {
        if (observer.f3518b) {
            if (!observer.mo4694k()) {
                observer.mo4696h(false);
                return;
            }
            int i = observer.f3519c;
            int i2 = this.f3511f;
            if (i < i2) {
                observer.f3519c = i2;
                observer.f3517a.mo3117a(this.f3509d);
            }
        }
    }

    /* renamed from: c */
    public void mo4689c(LiveData<T>.ObserverWrapper initiator) {
        if (this.f3512g) {
            this.f3513h = true;
            return;
        }
        this.f3512g = true;
        do {
            this.f3513h = false;
            if (initiator == null) {
                Iterator<Map.Entry<Observer<? super T>, LiveData<T>.ObserverWrapper>> iterator = this.f3507b.mo1629d();
                while (iterator.hasNext()) {
                    mo4688b((C0846b) iterator.next().getValue());
                    if (this.f3513h) {
                        break;
                    }
                }
            } else {
                mo4688b(initiator);
                initiator = null;
            }
        } while (this.f3513h);
        this.f3512g = false;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [androidx.lifecycle.LiveData$LifecycleBoundObserver, a.m.f, java.lang.Object] */
    /* renamed from: d */
    public void mo4690d(C0582g owner, C0590m<? super T> observer) {
        m4257a("observe");
        if (owner.mo2824a().mo3100b() != C0577d.C0579b.DESTROYED) {
            ? lifecycleBoundObserver = new LifecycleBoundObserver(owner, observer);
            LiveData<T>.ObserverWrapper existing = (C0846b) this.f3507b.mo1624g(observer, lifecycleBoundObserver);
            if (existing != null && !existing.mo4693j(owner)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (existing == null) {
                owner.mo2824a().mo3099a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: g */
    public void mo3144g(C0590m<? super T> observer) {
        m4257a("removeObserver");
        LiveData<T>.ObserverWrapper removed = (C0846b) this.f3507b.mo1625h(observer);
        if (removed != null) {
            removed.mo4692i();
            removed.mo4696h(false);
        }
    }

    /* renamed from: h */
    public void mo3116h(T value) {
        m4257a("setValue");
        this.f3511f++;
        this.f3509d = value;
        mo4689c((LiveData<T>.b) null);
    }

    /* renamed from: e */
    public void mo3142e() {
    }

    /* renamed from: f */
    public void mo3143f() {
    }

    public class LifecycleBoundObserver extends LiveData<T>.b implements Object {

        /* renamed from: e */
        public final C0582g f3514e;

        public LifecycleBoundObserver(C0582g owner, C0590m<? super T> observer) {
            super(observer);
            this.f3514e = owner;
        }

        /* renamed from: k */
        public boolean mo4694k() {
            return this.f3514e.mo2824a().mo3100b().mo3102a(C0577d.C0579b.STARTED);
        }

        /* renamed from: g */
        public void mo4691g(C0582g source, C0577d.C0578a event) {
            if (this.f3514e.mo2824a().mo3100b() == C0577d.C0579b.DESTROYED) {
                LiveData.this.mo3144g(this.f3517a);
            } else {
                mo4696h(mo4694k());
            }
        }

        /* renamed from: j */
        public boolean mo4693j(C0582g owner) {
            return this.f3514e == owner;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [androidx.lifecycle.LiveData$LifecycleBoundObserver, a.m.f] */
        /* renamed from: i */
        public void mo4692i() {
            this.f3514e.mo2824a().mo3101c(this);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    public abstract class C0846b {

        /* renamed from: a */
        public final C0590m<? super T> f3517a;

        /* renamed from: b */
        public boolean f3518b;

        /* renamed from: c */
        public int f3519c = -1;

        /* renamed from: k */
        public abstract boolean mo4694k();

        public C0846b(C0590m<? super T> observer) {
            this.f3517a = observer;
        }

        /* renamed from: j */
        public boolean mo4693j(C0582g owner) {
            return false;
        }

        /* renamed from: i */
        public void mo4692i() {
        }

        /* renamed from: h */
        public void mo4696h(boolean newActive) {
            if (newActive != this.f3518b) {
                this.f3518b = newActive;
                LiveData liveData = LiveData.this;
                int i = liveData.f3508c;
                int i2 = 1;
                boolean wasInactive = i == 0;
                if (!newActive) {
                    i2 = -1;
                }
                liveData.f3508c = i + i2;
                if (wasInactive && newActive) {
                    liveData.mo3142e();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.f3508c == 0 && !this.f3518b) {
                    liveData2.mo3143f();
                }
                if (this.f3518b) {
                    LiveData.this.mo4689c(this);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m4257a(String methodName) {
        if (!C0231a.m1194d().mo1617b()) {
            throw new IllegalStateException("Cannot invoke " + methodName + " on a background" + " thread");
        }
    }
}
