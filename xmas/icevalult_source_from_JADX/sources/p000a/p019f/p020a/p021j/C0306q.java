package p000a.p019f.p020a.p021j;

import java.util.ArrayList;
import p000a.p019f.p020a.C0273c;

/* renamed from: a.f.a.j.q */
public class C0306q extends C0291f {

    /* renamed from: k0 */
    public ArrayList<C0291f> f1518k0 = new ArrayList<>();

    /* renamed from: Q */
    public void mo2040Q() {
        this.f1518k0.clear();
        super.mo2040Q();
    }

    /* renamed from: I0 */
    public void mo2156I0(C0291f widget) {
        this.f1518k0.add(widget);
        if (widget.mo2086u() != null) {
            ((C0306q) widget.mo2086u()).mo2158L0(widget);
        }
        widget.mo2076p0(this);
    }

    /* renamed from: L0 */
    public void mo2158L0(C0291f widget) {
        this.f1518k0.remove(widget);
        widget.mo2076p0((C0291f) null);
    }

    /* renamed from: J0 */
    public C0294g mo2157J0() {
        C0291f parent = mo2086u();
        C0294g container = null;
        if (this instanceof C0294g) {
            container = (C0294g) this;
        }
        while (parent != null) {
            C0291f item = parent;
            parent = item.mo2086u();
            if (item instanceof C0294g) {
                container = (C0294g) item;
            }
        }
        return container;
    }

    /* renamed from: n0 */
    public void mo2072n0(int x, int y) {
        super.mo2072n0(x, y);
        int count = this.f1518k0.size();
        for (int i = 0; i < count; i++) {
            this.f1518k0.get(i).mo2072n0(mo2096z(), mo2016A());
        }
    }

    /* renamed from: F0 */
    public void mo2027F0() {
        super.mo2027F0();
        ArrayList<C0291f> arrayList = this.f1518k0;
        if (arrayList != null) {
            int count = arrayList.size();
            for (int i = 0; i < count; i++) {
                C0291f widget = this.f1518k0.get(i);
                widget.mo2072n0(mo2075p(), mo2077q());
                if (!(widget instanceof C0294g)) {
                    widget.mo2027F0();
                }
            }
        }
    }

    /* renamed from: K0 */
    public void mo2098K0() {
        mo2027F0();
        ArrayList<C0291f> arrayList = this.f1518k0;
        if (arrayList != null) {
            int count = arrayList.size();
            for (int i = 0; i < count; i++) {
                C0291f widget = this.f1518k0.get(i);
                if (widget instanceof C0306q) {
                    ((C0306q) widget).mo2098K0();
                }
            }
        }
    }

    /* renamed from: T */
    public void mo2042T(C0273c cache) {
        super.mo2042T(cache);
        int count = this.f1518k0.size();
        for (int i = 0; i < count; i++) {
            this.f1518k0.get(i).mo2042T(cache);
        }
    }

    /* renamed from: M0 */
    public void mo2159M0() {
        this.f1518k0.clear();
    }
}
