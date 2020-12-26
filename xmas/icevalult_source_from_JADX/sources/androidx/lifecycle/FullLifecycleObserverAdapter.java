package androidx.lifecycle;

import p000a.p051m.C0575b;
import p000a.p051m.C0577d;
import p000a.p051m.C0580e;
import p000a.p051m.C0582g;

public class FullLifecycleObserverAdapter implements C0580e {

    /* renamed from: a */
    public final C0575b f3501a;

    /* renamed from: b */
    public final C0580e f3502b;

    public FullLifecycleObserverAdapter(C0575b fullLifecycleObserver, C0580e lifecycleEventObserver) {
        this.f3501a = fullLifecycleObserver;
        this.f3502b = lifecycleEventObserver;
    }

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    public static /* synthetic */ class C0844a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3503a;

        static {
            int[] iArr = new int[C0577d.C0578a.values().length];
            f3503a = iArr;
            try {
                iArr[C0577d.C0578a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f3503a[C0577d.C0578a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f3503a[C0577d.C0578a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f3503a[C0577d.C0578a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f3503a[C0577d.C0578a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f3503a[C0577d.C0578a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f3503a[C0577d.C0578a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    /* renamed from: g */
    public void mo3103g(C0582g source, C0577d.C0578a event) {
        switch (C0844a.f3503a[event.ordinal()]) {
            case 1:
                this.f3501a.mo3096e(source);
                break;
            case 2:
                this.f3501a.mo3097f(source);
                break;
            case 3:
                this.f3501a.mo3092a(source);
                break;
            case 4:
                this.f3501a.mo3093b(source);
                break;
            case 5:
                this.f3501a.mo3095d(source);
                break;
            case 6:
                this.f3501a.mo3094c(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C0580e eVar = this.f3502b;
        if (eVar != null) {
            eVar.mo3103g(source, event);
        }
    }
}
