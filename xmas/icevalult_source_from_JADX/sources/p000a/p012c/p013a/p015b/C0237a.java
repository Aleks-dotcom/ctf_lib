package p000a.p012c.p013a.p015b;

import androidx.arch.core.internal.SafeIterableMap;
import java.util.HashMap;
import java.util.Map;
import p000a.p012c.p013a.p015b.C0238b;

/* renamed from: a.c.a.b.a */
public class C0237a<K, V> extends C0238b<K, V> {

    /* renamed from: f */
    public HashMap<K, C0238b.C0241c<K, V>> f1148f = new HashMap<>();

    /* renamed from: c */
    public C0238b.C0241c<K, V> mo1622c(K k) {
        return this.f1148f.get(k);
    }

    /* renamed from: g */
    public V mo1624g(K key, V v) {
        SafeIterableMap.Entry<K, V> current = mo1622c(key);
        if (current != null) {
            return current.f1154c;
        }
        this.f1148f.put(key, mo1632f(key, v));
        return null;
    }

    /* renamed from: h */
    public V mo1625h(K key) {
        V removed = super.mo1625h(key);
        this.f1148f.remove(key);
        return removed;
    }

    public boolean contains(K key) {
        return this.f1148f.containsKey(key);
    }

    /* renamed from: i */
    public Map.Entry<K, V> mo1626i(K k) {
        if (contains(k)) {
            return this.f1148f.get(k).f1156e;
        }
        return null;
    }
}
