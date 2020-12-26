package p000a.p025h.p037l;

import androidx.core.util.Pair;

/* renamed from: a.h.l.d */
public class C0415d<F, S> {

    /* renamed from: a */
    public final F f1983a;

    /* renamed from: b */
    public final S f1984b;

    public boolean equals(Object o) {
        if (!(o instanceof C0415d)) {
            return false;
        }
        Pair<?, ?> p = (C0415d) o;
        if (!C0414c.m2049a(p.f1983a, this.f1983a) || !C0414c.m2049a(p.f1984b, this.f1984b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f = this.f1983a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f1984b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f1983a) + " " + String.valueOf(this.f1984b) + "}";
    }
}
