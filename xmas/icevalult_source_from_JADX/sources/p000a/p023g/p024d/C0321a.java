package p000a.p023g.p024d;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p000a.p018e.C0269g;
import p000a.p025h.p037l.C0416e;
import p000a.p025h.p037l.C0417f;

/* renamed from: a.g.d.a */
public final class C0321a<T> {

    /* renamed from: a */
    public final C0416e<ArrayList<T>> f1768a = new C0417f(10);

    /* renamed from: b */
    public final C0269g<T, ArrayList<T>> f1769b = new C0269g<>();

    /* renamed from: c */
    public final ArrayList<T> f1770c = new ArrayList<>();

    /* renamed from: d */
    public final HashSet<T> f1771d = new HashSet<>();

    /* renamed from: b */
    public void mo2207b(T node) {
        if (!this.f1769b.containsKey(node)) {
            this.f1769b.put(node, null);
        }
    }

    /* renamed from: d */
    public boolean mo2209d(T node) {
        return this.f1769b.containsKey(node);
    }

    /* renamed from: a */
    public void mo2206a(T node, T incomingEdge) {
        if (!this.f1769b.containsKey(node) || !this.f1769b.containsKey(incomingEdge)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> edges = this.f1769b.get(node);
        if (edges == null) {
            edges = mo2211f();
            this.f1769b.put(node, edges);
        }
        edges.add(incomingEdge);
    }

    /* renamed from: g */
    public List mo2212g(T node) {
        return this.f1769b.get(node);
    }

    /* renamed from: h */
    public List<T> mo2213h(T node) {
        ArrayList<T> result = null;
        int size = this.f1769b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> edges = this.f1769b.mo1887m(i);
            if (edges != null && edges.contains(node)) {
                if (result == null) {
                    result = new ArrayList<>();
                }
                result.add(this.f1769b.mo1882i(i));
            }
        }
        return result;
    }

    /* renamed from: j */
    public boolean mo2215j(T node) {
        int size = this.f1769b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> edges = this.f1769b.mo1887m(i);
            if (edges != null && edges.contains(node)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo2208c() {
        int size = this.f1769b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> edges = this.f1769b.mo1887m(i);
            if (edges != null) {
                mo2216k(edges);
            }
        }
        this.f1769b.clear();
    }

    /* renamed from: i */
    public ArrayList<T> mo2214i() {
        this.f1770c.clear();
        this.f1771d.clear();
        int size = this.f1769b.size();
        for (int i = 0; i < size; i++) {
            mo2210e(this.f1769b.mo1882i(i), this.f1770c, this.f1771d);
        }
        return this.f1770c;
    }

    /* renamed from: e */
    public final void mo2210e(T node, ArrayList<T> result, HashSet<T> tmpMarked) {
        if (!result.contains(node)) {
            if (!tmpMarked.contains(node)) {
                tmpMarked.add(node);
                ArrayList<T> edges = this.f1769b.get(node);
                if (edges != null) {
                    int size = edges.size();
                    for (int i = 0; i < size; i++) {
                        mo2210e(edges.get(i), result, tmpMarked);
                    }
                }
                tmpMarked.remove(node);
                result.add(node);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: f */
    public final ArrayList<T> mo2211f() {
        ArrayList<T> list = this.f1768a.mo2417b();
        if (list == null) {
            return new ArrayList<>();
        }
        return list;
    }

    /* renamed from: k */
    public final void mo2216k(ArrayList<T> list) {
        list.clear();
        this.f1768a.mo2416a(list);
    }
}
