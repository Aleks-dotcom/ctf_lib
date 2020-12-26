package p000a.p025h.p038m;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.h.m.n */
public class C0456n {

    /* renamed from: a */
    public int f2023a;

    /* renamed from: b */
    public int f2024b;

    public C0456n(ViewGroup viewGroup) {
    }

    /* renamed from: b */
    public void mo2560b(View child, View target, int axes) {
        mo2561c(child, target, axes, 0);
    }

    /* renamed from: c */
    public void mo2561c(View child, View target, int axes, int type) {
        if (type == 1) {
            this.f2024b = axes;
        } else {
            this.f2023a = axes;
        }
    }

    /* renamed from: a */
    public int mo2559a() {
        return this.f2023a | this.f2024b;
    }

    /* renamed from: d */
    public void mo2562d(View target, int type) {
        if (type == 1) {
            this.f2024b = 0;
        } else {
            this.f2023a = 0;
        }
    }
}
