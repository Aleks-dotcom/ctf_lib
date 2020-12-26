package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import p000a.p012c.p013a.p015b.C0238b;
import p000a.p051m.C0577d;
import p000a.p051m.C0580e;
import p000a.p051m.C0582g;
import p000a.p057p.C0658b;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* renamed from: a */
    public C0238b<String, C0907b> f3756a = new C0238b<>();

    /* renamed from: b */
    public Bundle f3757b;

    /* renamed from: c */
    public boolean f3758c;

    /* renamed from: d */
    public boolean f3759d;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    public interface C0906a {
        /* renamed from: a */
        void mo5436a(C0658b bVar);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    public interface C0907b {
        /* renamed from: a */
        Bundle mo5437a();
    }

    /* renamed from: a */
    public Bundle mo5433a(String key) {
        if (this.f3758c) {
            Bundle bundle = this.f3757b;
            if (bundle == null) {
                return null;
            }
            Bundle result = bundle.getBundle(key);
            this.f3757b.remove(key);
            if (this.f3757b.isEmpty()) {
                this.f3757b = null;
            }
            return result;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* renamed from: b */
    public void mo5434b(C0577d lifecycle, Bundle savedState) {
        if (!this.f3758c) {
            if (savedState != null) {
                this.f3757b = savedState.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            lifecycle.mo3099a(new C0580e() {
                /* renamed from: g */
                public void mo3103g(C0582g source, C0577d.C0578a event) {
                    if (event == C0577d.C0578a.ON_START) {
                        SavedStateRegistry.this.f3759d = true;
                    } else if (event == C0577d.C0578a.ON_STOP) {
                        SavedStateRegistry.this.f3759d = false;
                    }
                }
            });
            this.f3758c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* renamed from: c */
    public void mo5435c(Bundle outBundle) {
        Bundle components = new Bundle();
        Bundle bundle = this.f3757b;
        if (bundle != null) {
            components.putAll(bundle);
        }
        Iterator<Map.Entry<String, SavedStateProvider>> it = this.f3756a.mo1629d();
        while (it.hasNext()) {
            Map.Entry<String, SavedStateProvider> entry1 = it.next();
            components.putBundle(entry1.getKey(), ((C0907b) entry1.getValue()).mo5437a());
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", components);
    }
}
