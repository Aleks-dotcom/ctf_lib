package p000a.p018e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: a.e.f */
public abstract class C0263f<K, V> {

    /* renamed from: a */
    public C0263f<K, V>.b f1227a;

    /* renamed from: b */
    public C0263f<K, V>.c f1228b;

    /* renamed from: c */
    public C0263f<K, V>.e f1229c;

    /* renamed from: a */
    public abstract void mo1750a();

    /* renamed from: b */
    public abstract Object mo1751b(int i, int i2);

    /* renamed from: c */
    public abstract Map<K, V> mo1752c();

    /* renamed from: d */
    public abstract int mo1753d();

    /* renamed from: e */
    public abstract int mo1754e(Object obj);

    /* renamed from: f */
    public abstract int mo1755f(Object obj);

    /* renamed from: g */
    public abstract void mo1756g(K k, V v);

    /* renamed from: h */
    public abstract void mo1757h(int i);

    /* renamed from: i */
    public abstract V mo1758i(int i, V v);

    /* renamed from: a.e.f$a */
    public final class C0264a<T> implements Iterator<T> {

        /* renamed from: b */
        public final int f1230b;

        /* renamed from: c */
        public int f1231c;

        /* renamed from: d */
        public int f1232d;

        /* renamed from: e */
        public boolean f1233e = false;

        public C0264a(int offset) {
            this.f1230b = offset;
            this.f1231c = C0263f.this.mo1753d();
        }

        public boolean hasNext() {
            return this.f1232d < this.f1231c;
        }

        public T next() {
            if (hasNext()) {
                Object res = C0263f.this.mo1751b(this.f1232d, this.f1230b);
                this.f1232d++;
                this.f1233e = true;
                return res;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f1233e) {
                int i = this.f1232d - 1;
                this.f1232d = i;
                this.f1231c--;
                this.f1233e = false;
                C0263f.this.mo1757h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a.e.f$d */
    public final class C0267d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b */
        public int f1237b;

        /* renamed from: c */
        public int f1238c;

        /* renamed from: d */
        public boolean f1239d = false;

        public /* bridge */ /* synthetic */ Object next() {
            mo1846a();
            return this;
        }

        public C0267d() {
            this.f1237b = C0263f.this.mo1753d() - 1;
            this.f1238c = -1;
        }

        public boolean hasNext() {
            return this.f1238c < this.f1237b;
        }

        /* renamed from: a */
        public Map.Entry<K, V> mo1846a() {
            if (hasNext()) {
                this.f1238c++;
                this.f1239d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f1239d) {
                C0263f.this.mo1757h(this.f1238c);
                this.f1238c--;
                this.f1237b--;
                this.f1239d = false;
                return;
            }
            throw new IllegalStateException();
        }

        public K getKey() {
            if (this.f1239d) {
                return C0263f.this.mo1751b(this.f1238c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f1239d) {
                return C0263f.this.mo1751b(this.f1238c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V setValue(V object) {
            if (this.f1239d) {
                return C0263f.this.mo1758i(this.f1238c, object);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean equals(Object o) {
            if (!this.f1239d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(o instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry<?, ?> e = (Map.Entry) o;
                if (!C0260c.m1341c(e.getKey(), C0263f.this.mo1751b(this.f1238c, 0)) || !C0260c.m1341c(e.getValue(), C0263f.this.mo1751b(this.f1238c, 1))) {
                    return false;
                }
                return true;
            }
        }

        public int hashCode() {
            if (this.f1239d) {
                int i = 0;
                Object key = C0263f.this.mo1751b(this.f1238c, 0);
                Object value = C0263f.this.mo1751b(this.f1238c, 1);
                int hashCode = key == null ? 0 : key.hashCode();
                if (value != null) {
                    i = value.hashCode();
                }
                return i ^ hashCode;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: a.e.f$b */
    public final class C0265b implements Set<Map.Entry<K, V>> {
        public C0265b() {
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            mo1815a((Map.Entry) obj);
            throw null;
        }

        /* renamed from: a */
        public boolean mo1815a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int oldSize = C0263f.this.mo1753d();
            for (Map.Entry<K, V> entry : collection) {
                C0263f.this.mo1756g(entry.getKey(), entry.getValue());
            }
            return oldSize != C0263f.this.mo1753d();
        }

        public void clear() {
            C0263f.this.mo1750a();
        }

        public boolean contains(Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry<?, ?> e = (Map.Entry) o;
            int index = C0263f.this.mo1754e(e.getKey());
            if (index < 0) {
                return false;
            }
            return C0260c.m1341c(C0263f.this.mo1751b(index, 1), e.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C0263f.this.mo1753d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0267d();
        }

        public boolean remove(Object object) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C0263f.this.mo1753d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object object) {
            return C0263f.m1367k(this, object);
        }

        public int hashCode() {
            int result = 0;
            for (int i = C0263f.this.mo1753d() - 1; i >= 0; i--) {
                int i2 = 0;
                Object key = C0263f.this.mo1751b(i, 0);
                Object value = C0263f.this.mo1751b(i, 1);
                int hashCode = key == null ? 0 : key.hashCode();
                if (value != null) {
                    i2 = value.hashCode();
                }
                result += i2 ^ hashCode;
            }
            return result;
        }
    }

    /* renamed from: a.e.f$c */
    public final class C0266c implements Set<K> {
        public C0266c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0263f.this.mo1750a();
        }

        public boolean contains(Object object) {
            return C0263f.this.mo1754e(object) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C0263f.m1366j(C0263f.this.mo1752c(), collection);
        }

        public boolean isEmpty() {
            return C0263f.this.mo1753d() == 0;
        }

        public Iterator<K> iterator() {
            return new C0264a(0);
        }

        public boolean remove(Object object) {
            int index = C0263f.this.mo1754e(object);
            if (index < 0) {
                return false;
            }
            C0263f.this.mo1757h(index);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C0263f.m1368o(C0263f.this.mo1752c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C0263f.m1369p(C0263f.this.mo1752c(), collection);
        }

        public int size() {
            return C0263f.this.mo1753d();
        }

        public Object[] toArray() {
            return C0263f.this.mo1810q(0);
        }

        public <T> T[] toArray(T[] array) {
            return C0263f.this.mo1811r(array, 0);
        }

        public boolean equals(Object object) {
            return C0263f.m1367k(this, object);
        }

        public int hashCode() {
            int result = 0;
            for (int i = C0263f.this.mo1753d() - 1; i >= 0; i--) {
                int i2 = 0;
                Object obj = C0263f.this.mo1751b(i, 0);
                if (obj != null) {
                    i2 = obj.hashCode();
                }
                result += i2;
            }
            return result;
        }
    }

    /* renamed from: a.e.f$e */
    public final class C0268e implements Collection<V> {
        public C0268e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0263f.this.mo1750a();
        }

        public boolean contains(Object object) {
            return C0263f.this.mo1755f(object) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C0263f.this.mo1753d() == 0;
        }

        public Iterator<V> iterator() {
            return new C0264a(1);
        }

        public boolean remove(Object object) {
            int index = C0263f.this.mo1755f(object);
            if (index < 0) {
                return false;
            }
            C0263f.this.mo1757h(index);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int N = C0263f.this.mo1753d();
            boolean changed = false;
            int i = 0;
            while (i < N) {
                if (collection.contains(C0263f.this.mo1751b(i, 1))) {
                    C0263f.this.mo1757h(i);
                    i--;
                    N--;
                    changed = true;
                }
                i++;
            }
            return changed;
        }

        public boolean retainAll(Collection<?> collection) {
            int N = C0263f.this.mo1753d();
            boolean changed = false;
            int i = 0;
            while (i < N) {
                if (!collection.contains(C0263f.this.mo1751b(i, 1))) {
                    C0263f.this.mo1757h(i);
                    i--;
                    N--;
                    changed = true;
                }
                i++;
            }
            return changed;
        }

        public int size() {
            return C0263f.this.mo1753d();
        }

        public Object[] toArray() {
            return C0263f.this.mo1810q(1);
        }

        public <T> T[] toArray(T[] array) {
            return C0263f.this.mo1811r(array, 1);
        }
    }

    /* renamed from: j */
    public static <K, V> boolean m1366j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public static <K, V> boolean m1368o(Map<K, V> map, Collection<?> collection) {
        int oldSize = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return oldSize != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m1369p(Map<K, V> map, Collection<?> collection) {
        int oldSize = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return oldSize != map.size();
    }

    /* renamed from: q */
    public Object[] mo1810q(int offset) {
        int N = mo1753d();
        Object[] result = new Object[N];
        for (int i = 0; i < N; i++) {
            result[i] = mo1751b(i, offset);
        }
        return result;
    }

    /* renamed from: r */
    public <T> T[] mo1811r(T[] array, int offset) {
        int N = mo1753d();
        if (array.length < N) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), N);
        }
        for (int i = 0; i < N; i++) {
            array[i] = mo1751b(i, offset);
        }
        if (array.length > N) {
            array[N] = null;
        }
        return array;
    }

    /* renamed from: k */
    public static <T> boolean m1367k(Set<T> set, Object object) {
        if (set == object) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set<?> s = (Set) object;
        try {
            if (set.size() != s.size() || !set.containsAll(s)) {
                return false;
            }
            return true;
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    /* renamed from: l */
    public Set<Map.Entry<K, V>> mo1807l() {
        if (this.f1227a == null) {
            this.f1227a = new C0265b();
        }
        return this.f1227a;
    }

    /* renamed from: m */
    public Set<K> mo1808m() {
        if (this.f1228b == null) {
            this.f1228b = new C0266c();
        }
        return this.f1228b;
    }

    /* renamed from: n */
    public Collection<V> mo1809n() {
        if (this.f1229c == null) {
            this.f1229c = new C0268e();
        }
        return this.f1229c;
    }
}
