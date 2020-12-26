package androidx.viewpager2.adapter;

import android.os.Handler;
import p000a.p051m.C0577d;
import p000a.p051m.C0580e;
import p000a.p051m.C0582g;

public class FragmentStateAdapter$5 implements C0580e {

    /* renamed from: a */
    public final /* synthetic */ Handler f3764a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f3765b;

    /* renamed from: g */
    public void mo3103g(C0582g source, C0577d.C0578a event) {
        if (event == C0577d.C0578a.ON_DESTROY) {
            this.f3764a.removeCallbacks(this.f3765b);
            source.mo2824a().mo3101c(this);
        }
    }
}
