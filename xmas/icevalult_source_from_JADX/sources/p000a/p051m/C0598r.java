package p000a.p051m;

import java.util.HashMap;

/* renamed from: a.m.r */
public class C0598r {

    /* renamed from: a */
    public final HashMap<String, C0594p> f2402a = new HashMap<>();

    /* renamed from: c */
    public final void mo3138c(String key, C0594p viewModel) {
        C0594p oldViewModel = this.f2402a.put(key, viewModel);
        if (oldViewModel != null) {
            oldViewModel.mo3015c();
        }
    }

    /* renamed from: b */
    public final C0594p mo3137b(String key) {
        return this.f2402a.get(key);
    }

    /* renamed from: a */
    public final void mo3136a() {
        for (C0594p vm : this.f2402a.values()) {
            vm.mo3132a();
        }
        this.f2402a.clear();
    }
}
