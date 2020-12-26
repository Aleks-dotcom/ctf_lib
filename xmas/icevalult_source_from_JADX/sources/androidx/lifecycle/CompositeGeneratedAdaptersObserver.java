package androidx.lifecycle;

import p000a.p051m.C0576c;
import p000a.p051m.C0577d;
import p000a.p051m.C0580e;
import p000a.p051m.C0582g;
import p000a.p051m.C0588k;

public class CompositeGeneratedAdaptersObserver implements C0580e {

    /* renamed from: a */
    public final C0576c[] f3500a;

    public CompositeGeneratedAdaptersObserver(C0576c[] generatedAdapters) {
        this.f3500a = generatedAdapters;
    }

    /* renamed from: g */
    public void mo3103g(C0582g source, C0577d.C0578a event) {
        C0588k logger = new C0588k();
        for (C0576c mGenerated : this.f3500a) {
            mGenerated.mo3098a(source, event, false, logger);
        }
        for (C0576c mGenerated2 : this.f3500a) {
            mGenerated2.mo3098a(source, event, true, logger);
        }
    }
}
