package p000a.p055o.p056d;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;
import p000a.p025h.p038m.C0420a;
import p000a.p025h.p038m.C0460r;
import p000a.p025h.p038m.p039a0.C0424c;
import p000a.p025h.p038m.p039a0.C0428d;

/* renamed from: a.o.d.k */
public class C0644k extends C0420a {

    /* renamed from: d */
    public final RecyclerView f2569d;

    /* renamed from: e */
    public final C0645a f2570e;

    public C0644k(RecyclerView recyclerView) {
        this.f2569d = recyclerView;
        C0420a itemDelegate = mo3362n();
        if (itemDelegate == null || !(itemDelegate instanceof C0645a)) {
            this.f2570e = new C0645a(this);
        } else {
            this.f2570e = (C0645a) itemDelegate;
        }
    }

    /* renamed from: o */
    public boolean mo3363o() {
        return this.f2569d.hasPendingAdapterUpdates();
    }

    /* renamed from: j */
    public boolean mo2427j(View host, int action, Bundle args) {
        if (super.mo2427j(host, action, args)) {
            return true;
        }
        if (mo3363o() || this.f2569d.getLayoutManager() == null) {
            return false;
        }
        return this.f2569d.getLayoutManager().mo5191g1(action, args);
    }

    /* renamed from: g */
    public void mo2424g(View host, C0424c info) {
        super.mo2424g(host, info);
        if (!mo3363o() && this.f2569d.getLayoutManager() != null) {
            this.f2569d.getLayoutManager().mo5157M0(info);
        }
    }

    /* renamed from: f */
    public void mo2423f(View host, AccessibilityEvent event) {
        super.mo2423f(host, event);
        if ((host instanceof RecyclerView) && !mo3363o()) {
            RecyclerView rv = (RecyclerView) host;
            if (rv.getLayoutManager() != null) {
                rv.getLayoutManager().mo4765K0(event);
            }
        }
    }

    /* renamed from: n */
    public C0420a mo3362n() {
        return this.f2570e;
    }

    /* renamed from: a.o.d.k$a */
    public static class C0645a extends C0420a {

        /* renamed from: d */
        public final C0644k f2571d;

        /* renamed from: e */
        public Map<View, C0420a> f2572e = new WeakHashMap();

        public C0645a(C0644k recyclerViewDelegate) {
            this.f2571d = recyclerViewDelegate;
        }

        /* renamed from: o */
        public void mo3365o(View itemView) {
            C0420a delegate = C0460r.m2266h(itemView);
            if (delegate != null && delegate != this) {
                this.f2572e.put(itemView, delegate);
            }
        }

        /* renamed from: n */
        public C0420a mo3364n(View itemView) {
            return this.f2572e.remove(itemView);
        }

        /* renamed from: g */
        public void mo2424g(View host, C0424c info) {
            if (this.f2571d.mo3363o() || this.f2571d.f2569d.getLayoutManager() == null) {
                super.mo2424g(host, info);
                return;
            }
            this.f2571d.f2569d.getLayoutManager().mo5160O0(host, info);
            C0420a originalDelegate = this.f2572e.get(host);
            if (originalDelegate != null) {
                originalDelegate.mo2424g(host, info);
            } else {
                super.mo2424g(host, info);
            }
        }

        /* renamed from: j */
        public boolean mo2427j(View host, int action, Bundle args) {
            if (this.f2571d.mo3363o() || this.f2571d.f2569d.getLayoutManager() == null) {
                return super.mo2427j(host, action, args);
            }
            C0420a originalDelegate = this.f2572e.get(host);
            if (originalDelegate != null) {
                if (originalDelegate.mo2427j(host, action, args)) {
                    return true;
                }
            } else if (super.mo2427j(host, action, args)) {
                return true;
            }
            return this.f2571d.f2569d.getLayoutManager().mo5196i1(host, action, args);
        }

        /* renamed from: l */
        public void mo2429l(View host, int eventType) {
            C0420a originalDelegate = this.f2572e.get(host);
            if (originalDelegate != null) {
                originalDelegate.mo2429l(host, eventType);
            } else {
                super.mo2429l(host, eventType);
            }
        }

        /* renamed from: m */
        public void mo2430m(View host, AccessibilityEvent event) {
            C0420a originalDelegate = this.f2572e.get(host);
            if (originalDelegate != null) {
                originalDelegate.mo2430m(host, event);
            } else {
                super.mo2430m(host, event);
            }
        }

        /* renamed from: a */
        public boolean mo2419a(View host, AccessibilityEvent event) {
            C0420a originalDelegate = this.f2572e.get(host);
            if (originalDelegate != null) {
                return originalDelegate.mo2419a(host, event);
            }
            return super.mo2419a(host, event);
        }

        /* renamed from: h */
        public void mo2425h(View host, AccessibilityEvent event) {
            C0420a originalDelegate = this.f2572e.get(host);
            if (originalDelegate != null) {
                originalDelegate.mo2425h(host, event);
            } else {
                super.mo2425h(host, event);
            }
        }

        /* renamed from: f */
        public void mo2423f(View host, AccessibilityEvent event) {
            C0420a originalDelegate = this.f2572e.get(host);
            if (originalDelegate != null) {
                originalDelegate.mo2423f(host, event);
            } else {
                super.mo2423f(host, event);
            }
        }

        /* renamed from: i */
        public boolean mo2426i(ViewGroup host, View child, AccessibilityEvent event) {
            C0420a originalDelegate = this.f2572e.get(host);
            if (originalDelegate != null) {
                return originalDelegate.mo2426i(host, child, event);
            }
            return super.mo2426i(host, child, event);
        }

        /* renamed from: b */
        public C0428d mo2420b(View host) {
            C0420a originalDelegate = this.f2572e.get(host);
            if (originalDelegate != null) {
                return originalDelegate.mo2420b(host);
            }
            return super.mo2420b(host);
        }
    }
}
