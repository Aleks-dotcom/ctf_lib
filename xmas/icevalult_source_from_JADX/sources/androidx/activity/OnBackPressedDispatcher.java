package androidx.activity;

import java.util.ArrayDeque;
import java.util.Iterator;
import p000a.p001a.C0000a;
import p000a.p001a.C0001b;
import p000a.p051m.C0577d;
import p000a.p051m.C0580e;
import p000a.p051m.C0582g;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    public final Runnable f2883a;

    /* renamed from: b */
    public final ArrayDeque<C0001b> f2884b = new ArrayDeque<>();

    public OnBackPressedDispatcher(Runnable fallbackOnBackPressed) {
        this.f2883a = fallbackOnBackPressed;
    }

    /* renamed from: b */
    public C0000a mo3830b(C0001b onBackPressedCallback) {
        this.f2884b.add(onBackPressedCallback);
        C0764a cancellable = new C0764a(onBackPressedCallback);
        onBackPressedCallback.mo2a(cancellable);
        return cancellable;
    }

    /* renamed from: a */
    public void mo3829a(C0582g owner, C0001b onBackPressedCallback) {
        C0577d lifecycle = owner.mo2824a();
        if (lifecycle.mo3100b() != C0577d.C0579b.DESTROYED) {
            onBackPressedCallback.mo2a(new LifecycleOnBackPressedCancellable(lifecycle, onBackPressedCallback));
        }
    }

    /* renamed from: c */
    public void mo3831c() {
        Iterator<C0001b> descendingIterator = this.f2884b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0001b callback = descendingIterator.next();
            if (callback.mo4c()) {
                callback.mo3b();
                return;
            }
        }
        Runnable runnable = this.f2883a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C0764a implements C0000a {

        /* renamed from: a */
        public final C0001b f2889a;

        public C0764a(C0001b onBackPressedCallback) {
            this.f2889a = onBackPressedCallback;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f2884b.remove(this.f2889a);
            this.f2889a.mo6e(this);
        }
    }

    public class LifecycleOnBackPressedCancellable implements C0580e, C0000a {

        /* renamed from: a */
        public final C0577d f2885a;

        /* renamed from: b */
        public final C0001b f2886b;

        /* renamed from: c */
        public C0000a f2887c;

        public LifecycleOnBackPressedCancellable(C0577d lifecycle, C0001b onBackPressedCallback) {
            this.f2885a = lifecycle;
            this.f2886b = onBackPressedCallback;
            lifecycle.mo3099a(this);
        }

        /* renamed from: g */
        public void mo3103g(C0582g source, C0577d.C0578a event) {
            if (event == C0577d.C0578a.ON_START) {
                this.f2887c = OnBackPressedDispatcher.this.mo3830b(this.f2886b);
            } else if (event == C0577d.C0578a.ON_STOP) {
                C0000a aVar = this.f2887c;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (event == C0577d.C0578a.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.f2885a.mo3101c(this);
            this.f2886b.mo6e(this);
            C0000a aVar = this.f2887c;
            if (aVar != null) {
                aVar.cancel();
                this.f2887c = null;
            }
        }
    }
}
