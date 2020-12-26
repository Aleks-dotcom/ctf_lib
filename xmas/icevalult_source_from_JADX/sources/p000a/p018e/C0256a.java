package p000a.p018e;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: a.e.a */
public class C0256a<K, V> extends C0269g<K, V> implements Map<K, V> {

    /* renamed from: i */
    public C0263f<K, V> f1198i;

    public C0256a() {
    }

    public C0256a(int capacity) {
        super(capacity);
    }

    public C0256a(C0269g map) {
        super(map);
    }

    /* renamed from: a.e.a$a */
    public class C0257a extends C0263f<K, V> {
        public C0257a() {
        }

        /* renamed from: d */
        public int mo1753d() {
            return C0256a.this.f1248d;
        }

        /* renamed from: b */
        public Object mo1751b(int index, int offset) {
            return C0256a.this.f1247c[(index << 1) + offset];
        }

        /* renamed from: e */
        public int mo1754e(Object key) {
            return C0256a.this.mo1876f(key);
        }

        /* renamed from: f */
        public int mo1755f(Object value) {
            return C0256a.this.mo1880h(value);
        }

        /* renamed from: c */
        public Map<K, V> mo1752c() {
            return C0256a.this;
        }

        /* renamed from: g */
        public void mo1756g(K key, V value) {
            C0256a.this.put(key, value);
        }

        /* renamed from: i */
        public V mo1758i(int index, V value) {
            return C0256a.this.mo1886l(index, value);
        }

        /* renamed from: h */
        public void mo1757h(int index) {
            C0256a.this.mo1885k(index);
        }

        /* renamed from: a */
        public void mo1750a() {
            C0256a.this.clear();
        }
    }

    /* renamed from: n */
    public final C0263f<K, V> mo1746n() {
        if (this.f1198i == null) {
            this.f1198i = new C0257a();
        }
        return this.f1198i;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo1870c(this.f1248d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: o */
    public boolean mo1747o(Collection<?> collection) {
        return C0263f.m1369p(this, collection);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return mo1746n().mo1807l();
    }

    public Set<K> keySet() {
        return mo1746n().mo1808m();
    }

    public Collection<V> values() {
        return mo1746n().mo1809n();
    }
}
