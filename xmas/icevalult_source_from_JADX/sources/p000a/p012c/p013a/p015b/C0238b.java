package p000a.p012c.p013a.p015b;

import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: a.c.a.b.b */
public class C0238b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b */
    public C0241c<K, V> f1149b;

    /* renamed from: c */
    public C0241c<K, V> f1150c;

    /* renamed from: d */
    public WeakHashMap<C0244f<K, V>, Boolean> f1151d = new WeakHashMap<>();

    /* renamed from: e */
    public int f1152e = 0;

    /* renamed from: a.c.a.b.b$f */
    public interface C0244f<K, V> {
        /* renamed from: a */
        void mo1645a(C0241c<K, V> cVar);
    }

    /* renamed from: c */
    public C0241c<K, V> mo1622c(K k) {
        SafeIterableMap.Entry<K, V> currentNode = this.f1149b;
        while (currentNode != null && !currentNode.f1153b.equals(k)) {
            currentNode = currentNode.f1155d;
        }
        return currentNode;
    }

    /* renamed from: g */
    public V mo1624g(K key, V v) {
        SafeIterableMap.Entry<K, V> entry = mo1622c(key);
        if (entry != null) {
            return entry.f1154c;
        }
        mo1632f(key, v);
        return null;
    }

    /* renamed from: f */
    public C0241c<K, V> mo1632f(K key, V v) {
        SafeIterableMap.Entry<K, V> newEntry = new C0241c<>(key, v);
        this.f1152e++;
        C0241c<K, V> cVar = this.f1150c;
        if (cVar == null) {
            this.f1149b = newEntry;
            this.f1150c = newEntry;
            return newEntry;
        }
        cVar.f1155d = newEntry;
        newEntry.f1156e = cVar;
        this.f1150c = newEntry;
        return newEntry;
    }

    /* renamed from: h */
    public V mo1625h(K key) {
        SafeIterableMap.Entry<K, V> toRemove = mo1622c(key);
        if (toRemove == null) {
            return null;
        }
        this.f1152e--;
        if (!this.f1151d.isEmpty()) {
            Iterator<C0244f<K, V>> it = this.f1151d.keySet().iterator();
            while (it.hasNext()) {
                ((C0244f) it.next()).mo1645a(toRemove);
            }
        }
        C0241c<K, V> cVar = toRemove.f1156e;
        if (cVar != null) {
            cVar.f1155d = toRemove.f1155d;
        } else {
            this.f1149b = toRemove.f1155d;
        }
        C0241c<K, V> cVar2 = toRemove.f1155d;
        if (cVar2 != null) {
            cVar2.f1156e = cVar;
        } else {
            this.f1150c = cVar;
        }
        toRemove.f1155d = null;
        toRemove.f1156e = null;
        return toRemove.f1154c;
    }

    public int size() {
        return this.f1152e;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        SafeIterableMap.ListIterator<K, V> iterator = new C0239a<>(this.f1149b, this.f1150c);
        this.f1151d.put(iterator, false);
        return iterator;
    }

    /* renamed from: a */
    public Iterator<Map.Entry<K, V>> mo1627a() {
        SafeIterableMap.DescendingIterator<K, V> iterator = new C0240b<>(this.f1150c, this.f1149b);
        this.f1151d.put(iterator, false);
        return iterator;
    }

    /* renamed from: d */
    public C0238b<K, V>.d mo1629d() {
        SafeIterableMap<K, V>.IteratorWithAdditions iterator = new C0242d();
        this.f1151d.put(iterator, false);
        return iterator;
    }

    /* renamed from: b */
    public Map.Entry<K, V> mo1628b() {
        return this.f1149b;
    }

    /* renamed from: e */
    public Map.Entry<K, V> mo1630e() {
        return this.f1150c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0238b)) {
            return false;
        }
        C0238b map = (C0238b) obj;
        if (size() != map.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> iterator1 = iterator();
        Iterator iterator2 = map.iterator();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            Map.Entry<K, V> next1 = iterator1.next();
            Object next2 = iterator2.next();
            if ((next1 == null && next2 != null) || (next1 != null && !next1.equals(next2))) {
                return false;
            }
        }
        if (iterator1.hasNext() || iterator2.hasNext()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int h = 0;
        Iterator<Map.Entry<K, V>> i = iterator();
        while (i.hasNext()) {
            h += i.next().hashCode();
        }
        return h;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Iterator<Map.Entry<K, V>> iterator = iterator();
        while (iterator.hasNext()) {
            builder.append(iterator.next().toString());
            if (iterator.hasNext()) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    /* renamed from: a.c.a.b.b$e */
    public static abstract class C0243e<K, V> implements Iterator<Map.Entry<K, V>>, C0244f<K, V> {

        /* renamed from: b */
        public C0241c<K, V> f1160b;

        /* renamed from: c */
        public C0241c<K, V> f1161c;

        /* renamed from: b */
        public abstract C0241c<K, V> mo1637b(C0241c<K, V> cVar);

        /* renamed from: c */
        public abstract C0241c<K, V> mo1638c(C0241c<K, V> cVar);

        public C0243e(C0241c<K, V> start, C0241c<K, V> expectedEnd) {
            this.f1160b = expectedEnd;
            this.f1161c = start;
        }

        public boolean hasNext() {
            return this.f1161c != null;
        }

        /* renamed from: a */
        public void mo1645a(C0241c<K, V> entry) {
            if (this.f1160b == entry && entry == this.f1161c) {
                this.f1161c = null;
                this.f1160b = null;
            }
            C0241c<K, V> cVar = this.f1160b;
            if (cVar == entry) {
                this.f1160b = mo1637b(cVar);
            }
            if (this.f1161c == entry) {
                this.f1161c = mo1650e();
            }
        }

        /* renamed from: e */
        public final C0241c<K, V> mo1650e() {
            C0241c<K, V> cVar = this.f1161c;
            C0241c<K, V> cVar2 = this.f1160b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo1638c(cVar);
        }

        /* renamed from: d */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> result = this.f1161c;
            this.f1161c = mo1650e();
            return result;
        }
    }

    /* renamed from: a.c.a.b.b$a */
    public static class C0239a<K, V> extends C0243e<K, V> {
        public C0239a(C0241c<K, V> start, C0241c<K, V> expectedEnd) {
            super(start, expectedEnd);
        }

        /* renamed from: c */
        public C0241c<K, V> mo1638c(C0241c<K, V> entry) {
            return entry.f1155d;
        }

        /* renamed from: b */
        public C0241c<K, V> mo1637b(C0241c<K, V> entry) {
            return entry.f1156e;
        }
    }

    /* renamed from: a.c.a.b.b$b */
    public static class C0240b<K, V> extends C0243e<K, V> {
        public C0240b(C0241c<K, V> start, C0241c<K, V> expectedEnd) {
            super(start, expectedEnd);
        }

        /* renamed from: c */
        public C0241c<K, V> mo1638c(C0241c<K, V> entry) {
            return entry.f1156e;
        }

        /* renamed from: b */
        public C0241c<K, V> mo1637b(C0241c<K, V> entry) {
            return entry.f1155d;
        }
    }

    /* renamed from: a.c.a.b.b$d */
    public class C0242d implements Iterator<Map.Entry<K, V>>, C0244f<K, V> {

        /* renamed from: b */
        public C0241c<K, V> f1157b;

        /* renamed from: c */
        public boolean f1158c = true;

        public C0242d() {
        }

        /* renamed from: a */
        public void mo1645a(C0241c<K, V> entry) {
            C0241c<K, V> cVar = this.f1157b;
            if (entry == cVar) {
                C0241c<K, V> cVar2 = cVar.f1156e;
                this.f1157b = cVar2;
                this.f1158c = cVar2 == null;
            }
        }

        public boolean hasNext() {
            if (!this.f1158c) {
                C0241c<K, V> cVar = this.f1157b;
                if (cVar == null || cVar.f1155d == null) {
                    return false;
                }
                return true;
            } else if (C0238b.this.f1149b != null) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (this.f1158c) {
                this.f1158c = false;
                this.f1157b = C0238b.this.f1149b;
            } else {
                C0241c<K, V> cVar = this.f1157b;
                this.f1157b = cVar != null ? cVar.f1155d : null;
            }
            return this.f1157b;
        }
    }

    /* renamed from: a.c.a.b.b$c */
    public static class C0241c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public final K f1153b;

        /* renamed from: c */
        public final V f1154c;

        /* renamed from: d */
        public C0241c<K, V> f1155d;

        /* renamed from: e */
        public C0241c<K, V> f1156e;

        public C0241c(K key, V value) {
            this.f1153b = key;
            this.f1154c = value;
        }

        public K getKey() {
            return this.f1153b;
        }

        public V getValue() {
            return this.f1154c;
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f1153b + "=" + this.f1154c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0241c)) {
                return false;
            }
            C0241c entry = (C0241c) obj;
            if (!this.f1153b.equals(entry.f1153b) || !this.f1154c.equals(entry.f1154c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f1153b.hashCode() ^ this.f1154c.hashCode();
        }
    }
}
