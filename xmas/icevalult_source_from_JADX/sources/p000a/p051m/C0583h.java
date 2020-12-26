package p000a.p051m;

import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleRegistry;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p000a.p012c.p013a.p015b.C0237a;
import p000a.p051m.C0577d;

/* renamed from: a.m.h */
public class C0583h extends C0577d {

    /* renamed from: a */
    public C0237a<C0581f, C0585b> f2385a = new C0237a<>();

    /* renamed from: b */
    public C0577d.C0579b f2386b;

    /* renamed from: c */
    public final WeakReference<C0582g> f2387c;

    /* renamed from: d */
    public int f2388d = 0;

    /* renamed from: e */
    public boolean f2389e = false;

    /* renamed from: f */
    public boolean f2390f = false;

    /* renamed from: g */
    public ArrayList<C0577d.C0579b> f2391g = new ArrayList<>();

    public C0583h(C0582g provider) {
        this.f2387c = new WeakReference<>(provider);
        this.f2386b = C0577d.C0579b.INITIALIZED;
    }

    @Deprecated
    /* renamed from: k */
    public void mo3109k(C0577d.C0579b state) {
        mo3113p(state);
    }

    /* renamed from: p */
    public void mo3113p(C0577d.C0579b state) {
        mo3110m(state);
    }

    /* renamed from: i */
    public void mo3107i(C0577d.C0578a event) {
        mo3110m(m2924h(event));
    }

    /* renamed from: m */
    public final void mo3110m(C0577d.C0579b next) {
        if (this.f2386b != next) {
            this.f2386b = next;
            if (this.f2389e || this.f2388d != 0) {
                this.f2390f = true;
                return;
            }
            this.f2389e = true;
            mo3114q();
            this.f2389e = false;
        }
    }

    /* renamed from: j */
    public final boolean mo3108j() {
        if (this.f2385a.size() == 0) {
            return true;
        }
        C0577d.C0579b eldestObserverState = this.f2385a.mo1628b().getValue().f2394a;
        C0577d.C0579b newestObserverState = this.f2385a.mo1630e().getValue().f2394a;
        if (eldestObserverState == newestObserverState && this.f2386b == newestObserverState) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final C0577d.C0579b mo3105e(C0581f observer) {
        Map.Entry<C0581f, C0585b> i = this.f2385a.mo1626i(observer);
        C0577d.C0579b parentState = null;
        C0577d.C0579b siblingState = i != null ? i.getValue().f2394a : null;
        if (!this.f2391g.isEmpty()) {
            ArrayList<C0577d.C0579b> arrayList = this.f2391g;
            parentState = arrayList.get(arrayList.size() - 1);
        }
        return m2925l(m2925l(this.f2386b, siblingState), parentState);
    }

    /* renamed from: a */
    public void mo3099a(C0581f observer) {
        C0582g lifecycleOwner;
        C0577d.C0579b bVar = this.f2386b;
        C0577d.C0579b initialState = C0577d.C0579b.DESTROYED;
        if (bVar != initialState) {
            initialState = C0577d.C0579b.INITIALIZED;
        }
        C0585b statefulObserver = new C0585b(observer, initialState);
        if (this.f2385a.mo1624g(observer, statefulObserver) == null && (lifecycleOwner = (C0582g) this.f2387c.get()) != null) {
            boolean isReentrance = this.f2388d != 0 || this.f2389e;
            C0577d.C0579b targetState = mo3105e(observer);
            this.f2388d++;
            while (statefulObserver.f2394a.compareTo(targetState) < 0 && this.f2385a.contains(observer)) {
                mo3112o(statefulObserver.f2394a);
                statefulObserver.mo3115a(lifecycleOwner, m2926r(statefulObserver.f2394a));
                mo3111n();
                targetState = mo3105e(observer);
            }
            if (!isReentrance) {
                mo3114q();
            }
            this.f2388d--;
        }
    }

    /* renamed from: n */
    public final void mo3111n() {
        ArrayList<C0577d.C0579b> arrayList = this.f2391g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: o */
    public final void mo3112o(C0577d.C0579b state) {
        this.f2391g.add(state);
    }

    /* renamed from: c */
    public void mo3101c(C0581f observer) {
        this.f2385a.mo1625h(observer);
    }

    /* renamed from: b */
    public C0577d.C0579b mo3100b() {
        return this.f2386b;
    }

    /* renamed from: h */
    public static C0577d.C0579b m2924h(C0577d.C0578a event) {
        switch (C0584a.f2392a[event.ordinal()]) {
            case 1:
            case 2:
                return C0577d.C0579b.CREATED;
            case 3:
            case 4:
                return C0577d.C0579b.STARTED;
            case 5:
                return C0577d.C0579b.RESUMED;
            case 6:
                return C0577d.C0579b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + event);
        }
    }

    /* renamed from: a.m.h$a */
    public static /* synthetic */ class C0584a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2392a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f2393b;

        static {
            int[] iArr = new int[C0577d.C0579b.values().length];
            f2393b = iArr;
            try {
                iArr[C0577d.C0579b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f2393b[C0577d.C0579b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f2393b[C0577d.C0579b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f2393b[C0577d.C0579b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f2393b[C0577d.C0579b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            int[] iArr2 = new int[C0577d.C0578a.values().length];
            f2392a = iArr2;
            try {
                iArr2[C0577d.C0578a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f2392a[C0577d.C0578a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f2392a[C0577d.C0578a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f2392a[C0577d.C0578a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f2392a[C0577d.C0578a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError e10) {
            }
            try {
                f2392a[C0577d.C0578a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError e11) {
            }
            try {
                f2392a[C0577d.C0578a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError e12) {
            }
        }
    }

    /* renamed from: f */
    public static C0577d.C0578a m2923f(C0577d.C0579b state) {
        int i = C0584a.f2393b[state.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return C0577d.C0578a.ON_DESTROY;
        } else {
            if (i == 3) {
                return C0577d.C0578a.ON_STOP;
            }
            if (i == 4) {
                return C0577d.C0578a.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + state);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: r */
    public static C0577d.C0578a m2926r(C0577d.C0579b state) {
        int i = C0584a.f2393b[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C0577d.C0578a.ON_START;
            }
            if (i == 3) {
                return C0577d.C0578a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + state);
            }
        }
        return C0577d.C0578a.ON_CREATE;
    }

    /* renamed from: g */
    public final void mo3106g(C0582g lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState>> ascendingIterator = this.f2385a.mo1629d();
        while (ascendingIterator.hasNext() && !this.f2390f) {
            Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> entry = ascendingIterator.next();
            C0585b observer = (C0585b) entry.getValue();
            while (observer.f2394a.compareTo(this.f2386b) < 0 && !this.f2390f && this.f2385a.contains(entry.getKey())) {
                mo3112o(observer.f2394a);
                observer.mo3115a(lifecycleOwner, m2926r(observer.f2394a));
                mo3111n();
            }
        }
    }

    /* renamed from: d */
    public final void mo3104d(C0582g lifecycleOwner) {
        Iterator<Map.Entry<C0581f, C0585b>> a = this.f2385a.mo1627a();
        while (a.hasNext() && !this.f2390f) {
            Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> entry = a.next();
            C0585b observer = (C0585b) entry.getValue();
            while (observer.f2394a.compareTo(this.f2386b) > 0 && !this.f2390f && this.f2385a.contains(entry.getKey())) {
                C0577d.C0578a event = m2923f(observer.f2394a);
                mo3112o(m2924h(event));
                observer.mo3115a(lifecycleOwner, event);
                mo3111n();
            }
        }
    }

    /* renamed from: q */
    public final void mo3114q() {
        C0582g lifecycleOwner = (C0582g) this.f2387c.get();
        if (lifecycleOwner != null) {
            while (!mo3108j()) {
                this.f2390f = false;
                if (this.f2386b.compareTo(this.f2385a.mo1628b().getValue().f2394a) < 0) {
                    mo3104d(lifecycleOwner);
                }
                Map.Entry<C0581f, C0585b> e = this.f2385a.mo1630e();
                if (!this.f2390f && e != null && this.f2386b.compareTo(e.getValue().f2394a) > 0) {
                    mo3106g(lifecycleOwner);
                }
            }
            this.f2390f = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    /* renamed from: l */
    public static C0577d.C0579b m2925l(C0577d.C0579b state1, C0577d.C0579b state2) {
        return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
    }

    /* renamed from: a.m.h$b */
    public static class C0585b {

        /* renamed from: a */
        public C0577d.C0579b f2394a;

        /* renamed from: b */
        public C0580e f2395b;

        public C0585b(C0581f observer, C0577d.C0579b initialState) {
            this.f2395b = C0587j.m2948f(observer);
            this.f2394a = initialState;
        }

        /* renamed from: a */
        public void mo3115a(C0582g owner, C0577d.C0578a event) {
            C0577d.C0579b newState = C0583h.m2924h(event);
            this.f2394a = C0583h.m2925l(this.f2394a, newState);
            this.f2395b.mo3103g(owner, event);
            this.f2394a = newState;
        }
    }
}
