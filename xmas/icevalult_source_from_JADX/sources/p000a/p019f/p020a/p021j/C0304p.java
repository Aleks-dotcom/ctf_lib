package p000a.p019f.p020a.p021j;

import java.util.ArrayList;
import p000a.p019f.p020a.p021j.C0286e;

/* renamed from: a.f.a.j.p */
public class C0304p {

    /* renamed from: a */
    public int f1508a;

    /* renamed from: b */
    public int f1509b;

    /* renamed from: c */
    public int f1510c;

    /* renamed from: d */
    public int f1511d;

    /* renamed from: e */
    public ArrayList<C0305a> f1512e = new ArrayList<>();

    /* renamed from: a.f.a.j.p$a */
    public static class C0305a {

        /* renamed from: a */
        public C0286e f1513a;

        /* renamed from: b */
        public C0286e f1514b;

        /* renamed from: c */
        public int f1515c;

        /* renamed from: d */
        public C0286e.C0289c f1516d;

        /* renamed from: e */
        public int f1517e;

        public C0305a(C0286e anchor) {
            this.f1513a = anchor;
            this.f1514b = anchor.mo2009i();
            this.f1515c = anchor.mo2004d();
            this.f1516d = anchor.mo2008h();
            this.f1517e = anchor.mo2003c();
        }

        /* renamed from: b */
        public void mo2155b(C0291f widget) {
            C0286e h = widget.mo2059h(this.f1513a.mo2010j());
            this.f1513a = h;
            if (h != null) {
                this.f1514b = h.mo2009i();
                this.f1515c = this.f1513a.mo2004d();
                this.f1516d = this.f1513a.mo2008h();
                this.f1517e = this.f1513a.mo2003c();
                return;
            }
            this.f1514b = null;
            this.f1515c = 0;
            this.f1516d = C0286e.C0289c.STRONG;
            this.f1517e = 0;
        }

        /* renamed from: a */
        public void mo2154a(C0291f widget) {
            widget.mo2059h(this.f1513a.mo2010j()).mo2002b(this.f1514b, this.f1515c, this.f1516d, this.f1517e);
        }
    }

    public C0304p(C0291f widget) {
        this.f1508a = widget.mo2028G();
        this.f1509b = widget.mo2030H();
        this.f1510c = widget.mo2022D();
        this.f1511d = widget.mo2079r();
        ArrayList<C0286e> i = widget.mo2061i();
        int anchorsSize = i.size();
        for (int i2 = 0; i2 < anchorsSize; i2++) {
            this.f1512e.add(new C0305a(i.get(i2)));
        }
    }

    /* renamed from: b */
    public void mo2153b(C0291f widget) {
        this.f1508a = widget.mo2028G();
        this.f1509b = widget.mo2030H();
        this.f1510c = widget.mo2022D();
        this.f1511d = widget.mo2079r();
        int connections = this.f1512e.size();
        for (int i = 0; i < connections; i++) {
            this.f1512e.get(i).mo2155b(widget);
        }
    }

    /* renamed from: a */
    public void mo2152a(C0291f widget) {
        widget.mo2021C0(this.f1508a);
        widget.mo2023D0(this.f1509b);
        widget.mo2095y0(this.f1510c);
        widget.mo2050b0(this.f1511d);
        int mConnectionsSize = this.f1512e.size();
        for (int i = 0; i < mConnectionsSize; i++) {
            this.f1512e.get(i).mo2154a(widget);
        }
    }
}
