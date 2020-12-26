package p066b.p067a.p068a.p069a.p073d0;

import android.graphics.Typeface;

/* renamed from: b.a.a.a.d0.a */
public final class C0929a extends C0937f {

    /* renamed from: a */
    public final Typeface f3857a;

    /* renamed from: b */
    public final C0930a f3858b;

    /* renamed from: c */
    public boolean f3859c;

    /* renamed from: b.a.a.a.d0.a$a */
    public interface C0930a {
        /* renamed from: a */
        void mo5487a(Typeface typeface);
    }

    public C0929a(C0930a applyFont, Typeface fallbackFont) {
        this.f3857a = fallbackFont;
        this.f3858b = applyFont;
    }

    /* renamed from: b */
    public void mo5522b(Typeface font, boolean fontResolvedSynchronously) {
        mo5532d(font);
    }

    /* renamed from: a */
    public void mo5521a(int reason) {
        mo5532d(this.f3857a);
    }

    /* renamed from: c */
    public void mo5531c() {
        this.f3859c = true;
    }

    /* renamed from: d */
    public final void mo5532d(Typeface updatedFont) {
        if (!this.f3859c) {
            this.f3858b.mo5487a(updatedFont);
        }
    }
}
