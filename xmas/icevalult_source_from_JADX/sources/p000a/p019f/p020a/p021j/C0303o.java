package p000a.p019f.p020a.p021j;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: a.f.a.j.o */
public class C0303o {

    /* renamed from: a */
    public HashSet<C0303o> f1506a = new HashSet<>(2);

    /* renamed from: b */
    public int f1507b = 0;

    /* renamed from: a */
    public void mo2148a(C0303o node) {
        this.f1506a.add(node);
    }

    /* renamed from: e */
    public void mo2132e() {
        this.f1507b = 0;
        this.f1506a.clear();
    }

    /* renamed from: c */
    public void mo2150c() {
        this.f1507b = 0;
        Iterator<C0303o> it = this.f1506a.iterator();
        while (it.hasNext()) {
            it.next().mo2150c();
        }
    }

    /* renamed from: b */
    public void mo2149b() {
        this.f1507b = 1;
        Iterator<C0303o> it = this.f1506a.iterator();
        while (it.hasNext()) {
            it.next().mo2133f();
        }
    }

    /* renamed from: d */
    public boolean mo2151d() {
        return this.f1507b == 1;
    }

    /* renamed from: f */
    public void mo2133f() {
    }
}
