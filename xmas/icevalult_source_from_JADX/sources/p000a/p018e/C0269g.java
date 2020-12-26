package p000a.p018e;

import androidx.collection.SimpleArrayMap;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: a.e.g */
public class C0269g<K, V> {

    /* renamed from: e */
    public static Object[] f1242e;

    /* renamed from: f */
    public static int f1243f;

    /* renamed from: g */
    public static Object[] f1244g;

    /* renamed from: h */
    public static int f1245h;

    /* renamed from: b */
    public int[] f1246b;

    /* renamed from: c */
    public Object[] f1247c;

    /* renamed from: d */
    public int f1248d;

    /* renamed from: b */
    public static int m1386b(int[] hashes, int N, int hash) {
        try {
            return C0260c.m1339a(hashes, N, hash);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    public int mo1874e(Object key, int hash) {
        int N = this.f1248d;
        if (N == 0) {
            return -1;
        }
        int index = m1386b(this.f1246b, N, hash);
        if (index < 0 || key.equals(this.f1247c[index << 1])) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f1246b[end] == hash) {
            if (key.equals(this.f1247c[end << 1])) {
                return end;
            }
            end++;
        }
        int i = index - 1;
        while (i >= 0 && this.f1246b[i] == hash) {
            if (key.equals(this.f1247c[i << 1])) {
                return i;
            }
            i--;
        }
        return ~end;
    }

    /* renamed from: g */
    public int mo1877g() {
        int N = this.f1248d;
        if (N == 0) {
            return -1;
        }
        int index = m1386b(this.f1246b, N, 0);
        if (index < 0 || this.f1247c[index << 1] == null) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f1246b[end] == 0) {
            if (this.f1247c[end << 1] == null) {
                return end;
            }
            end++;
        }
        int i = index - 1;
        while (i >= 0 && this.f1246b[i] == 0) {
            if (this.f1247c[i << 1] == null) {
                return i;
            }
            i--;
        }
        return ~end;
    }

    /* renamed from: a */
    public final void mo1869a(int size) {
        Class<C0269g> cls = C0269g.class;
        if (size == 8) {
            synchronized (cls) {
                Object[] array = f1244g;
                if (array != null) {
                    this.f1247c = array;
                    f1244g = (Object[]) array[0];
                    this.f1246b = (int[]) array[1];
                    array[1] = null;
                    array[0] = null;
                    f1245h--;
                    return;
                }
            }
        } else if (size == 4) {
            synchronized (cls) {
                Object[] array2 = f1242e;
                if (array2 != null) {
                    this.f1247c = array2;
                    f1242e = (Object[]) array2[0];
                    this.f1246b = (int[]) array2[1];
                    array2[1] = null;
                    array2[0] = null;
                    f1243f--;
                    return;
                }
            }
        }
        this.f1246b = new int[size];
        this.f1247c = new Object[(size << 1)];
    }

    /* renamed from: d */
    public static void m1387d(int[] hashes, Object[] array, int size) {
        Class<C0269g> cls = C0269g.class;
        if (hashes.length == 8) {
            synchronized (cls) {
                if (f1245h < 10) {
                    array[0] = f1244g;
                    array[1] = hashes;
                    for (int i = (size << 1) - 1; i >= 2; i--) {
                        array[i] = null;
                    }
                    f1244g = array;
                    f1245h++;
                }
            }
        } else if (hashes.length == 4) {
            synchronized (cls) {
                if (f1243f < 10) {
                    array[0] = f1242e;
                    array[1] = hashes;
                    for (int i2 = (size << 1) - 1; i2 >= 2; i2--) {
                        array[i2] = null;
                    }
                    f1242e = array;
                    f1243f++;
                }
            }
        }
    }

    public C0269g() {
        this.f1246b = C0260c.f1211a;
        this.f1247c = C0260c.f1213c;
        this.f1248d = 0;
    }

    public C0269g(int capacity) {
        if (capacity == 0) {
            this.f1246b = C0260c.f1211a;
            this.f1247c = C0260c.f1213c;
        } else {
            mo1869a(capacity);
        }
        this.f1248d = 0;
    }

    public C0269g(C0269g<K, V> map) {
        this();
        if (map != null) {
            mo1884j(map);
        }
    }

    public void clear() {
        if (this.f1248d > 0) {
            int[] ohashes = this.f1246b;
            Object[] oarray = this.f1247c;
            int osize = this.f1248d;
            this.f1246b = C0260c.f1211a;
            this.f1247c = C0260c.f1213c;
            this.f1248d = 0;
            m1387d(ohashes, oarray, osize);
        }
        if (this.f1248d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public void mo1870c(int minimumCapacity) {
        int osize = this.f1248d;
        if (this.f1246b.length < minimumCapacity) {
            int[] ohashes = this.f1246b;
            Object[] oarray = this.f1247c;
            mo1869a(minimumCapacity);
            if (this.f1248d > 0) {
                System.arraycopy(ohashes, 0, this.f1246b, 0, osize);
                System.arraycopy(oarray, 0, this.f1247c, 0, osize << 1);
            }
            m1387d(ohashes, oarray, osize);
        }
        if (this.f1248d != osize) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object key) {
        return mo1876f(key) >= 0;
    }

    /* renamed from: f */
    public int mo1876f(Object key) {
        return key == null ? mo1877g() : mo1874e(key, key.hashCode());
    }

    /* renamed from: h */
    public int mo1880h(Object value) {
        int N = this.f1248d * 2;
        Object[] array = this.f1247c;
        if (value == null) {
            for (int i = 1; i < N; i += 2) {
                if (array[i] == null) {
                    return i >> 1;
                }
            }
            return -1;
        }
        for (int i2 = 1; i2 < N; i2 += 2) {
            if (value.equals(array[i2])) {
                return i2 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(Object value) {
        return mo1880h(value) >= 0;
    }

    public V get(Object key) {
        return getOrDefault(key, (Object) null);
    }

    public V getOrDefault(Object key, V defaultValue) {
        int index = mo1876f(key);
        return index >= 0 ? this.f1247c[(index << 1) + 1] : defaultValue;
    }

    /* renamed from: i */
    public K mo1882i(int index) {
        return this.f1247c[index << 1];
    }

    /* renamed from: m */
    public V mo1887m(int index) {
        return this.f1247c[(index << 1) + 1];
    }

    /* renamed from: l */
    public V mo1886l(int index, V value) {
        int index2 = (index << 1) + 1;
        V[] vArr = this.f1247c;
        V old = vArr[index2];
        vArr[index2] = value;
        return old;
    }

    public boolean isEmpty() {
        return this.f1248d <= 0;
    }

    public V put(K key, V value) {
        int index;
        int hash;
        int osize = this.f1248d;
        if (key == null) {
            hash = 0;
            index = mo1877g();
        } else {
            hash = key.hashCode();
            index = mo1874e(key, hash);
        }
        if (index >= 0) {
            int index2 = (index << 1) + 1;
            V[] vArr = this.f1247c;
            V old = vArr[index2];
            vArr[index2] = value;
            return old;
        }
        int index3 = ~index;
        if (osize >= this.f1246b.length) {
            int n = 4;
            if (osize >= 8) {
                n = (osize >> 1) + osize;
            } else if (osize >= 4) {
                n = 8;
            }
            int[] ohashes = this.f1246b;
            Object[] oarray = this.f1247c;
            mo1869a(n);
            if (osize == this.f1248d) {
                int[] iArr = this.f1246b;
                if (iArr.length > 0) {
                    System.arraycopy(ohashes, 0, iArr, 0, ohashes.length);
                    System.arraycopy(oarray, 0, this.f1247c, 0, oarray.length);
                }
                m1387d(ohashes, oarray, osize);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (index3 < osize) {
            int[] iArr2 = this.f1246b;
            System.arraycopy(iArr2, index3, iArr2, index3 + 1, osize - index3);
            Object[] objArr = this.f1247c;
            System.arraycopy(objArr, index3 << 1, objArr, (index3 + 1) << 1, (this.f1248d - index3) << 1);
        }
        int i = this.f1248d;
        if (osize == i) {
            int[] iArr3 = this.f1246b;
            if (index3 < iArr3.length) {
                iArr3[index3] = hash;
                Object[] objArr2 = this.f1247c;
                objArr2[index3 << 1] = key;
                objArr2[(index3 << 1) + 1] = value;
                this.f1248d = i + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: j */
    public void mo1884j(C0269g<? extends K, ? extends V> array) {
        int N = array.f1248d;
        mo1870c(this.f1248d + N);
        if (this.f1248d != 0) {
            for (int i = 0; i < N; i++) {
                put(array.mo1882i(i), array.mo1887m(i));
            }
        } else if (N > 0) {
            System.arraycopy(array.f1246b, 0, this.f1246b, 0, N);
            System.arraycopy(array.f1247c, 0, this.f1247c, 0, N << 1);
            this.f1248d = N;
        }
    }

    public V putIfAbsent(K key, V value) {
        V mapValue = get(key);
        if (mapValue == null) {
            return put(key, value);
        }
        return mapValue;
    }

    public V remove(Object key) {
        int index = mo1876f(key);
        if (index >= 0) {
            return mo1885k(index);
        }
        return null;
    }

    public boolean remove(Object key, Object value) {
        int index = mo1876f(key);
        if (index < 0) {
            return false;
        }
        V mapValue = mo1887m(index);
        if (value != mapValue && (value == null || !value.equals(mapValue))) {
            return false;
        }
        mo1885k(index);
        return true;
    }

    /* renamed from: k */
    public V mo1885k(int index) {
        int nsize;
        Object[] objArr = this.f1247c;
        Object old = objArr[(index << 1) + 1];
        int osize = this.f1248d;
        if (osize <= 1) {
            m1387d(this.f1246b, objArr, osize);
            this.f1246b = C0260c.f1211a;
            this.f1247c = C0260c.f1213c;
            nsize = 0;
        } else {
            nsize = osize - 1;
            int[] iArr = this.f1246b;
            int i = 8;
            if (iArr.length <= 8 || this.f1248d >= iArr.length / 3) {
                if (index < nsize) {
                    System.arraycopy(iArr, index + 1, iArr, index, nsize - index);
                    Object[] objArr2 = this.f1247c;
                    System.arraycopy(objArr2, (index + 1) << 1, objArr2, index << 1, (nsize - index) << 1);
                }
                Object[] objArr3 = this.f1247c;
                objArr3[nsize << 1] = null;
                objArr3[(nsize << 1) + 1] = null;
            } else {
                if (osize > 8) {
                    i = osize + (osize >> 1);
                }
                int n = i;
                int[] ohashes = this.f1246b;
                Object[] oarray = this.f1247c;
                mo1869a(n);
                if (osize == this.f1248d) {
                    if (index > 0) {
                        System.arraycopy(ohashes, 0, this.f1246b, 0, index);
                        System.arraycopy(oarray, 0, this.f1247c, 0, index << 1);
                    }
                    if (index < nsize) {
                        System.arraycopy(ohashes, index + 1, this.f1246b, index, nsize - index);
                        System.arraycopy(oarray, (index + 1) << 1, this.f1247c, index << 1, (nsize - index) << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (osize == this.f1248d) {
            this.f1248d = nsize;
            return old;
        }
        throw new ConcurrentModificationException();
    }

    public V replace(K key, V value) {
        int index = mo1876f(key);
        if (index >= 0) {
            return mo1886l(index, value);
        }
        return null;
    }

    public boolean replace(K key, V oldValue, V newValue) {
        int index = mo1876f(key);
        if (index < 0) {
            return false;
        }
        V mapValue = mo1887m(index);
        if (mapValue != oldValue && (oldValue == null || !oldValue.equals(mapValue))) {
            return false;
        }
        mo1886l(index, newValue);
        return true;
    }

    public int size() {
        return this.f1248d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof C0269g) {
            SimpleArrayMap<?, ?> map = (C0269g) object;
            if (size() != map.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f1248d) {
                try {
                    K key = mo1882i(i);
                    V mine = mo1887m(i);
                    Object theirs = map.get(key);
                    if (mine == null) {
                        if (theirs != null || !map.containsKey(key)) {
                            return false;
                        }
                    } else if (!mine.equals(theirs)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e) {
                    return false;
                } catch (ClassCastException e2) {
                    return false;
                }
            }
            return true;
        } else if (!(object instanceof Map)) {
            return false;
        } else {
            Map<?, ?> map2 = (Map) object;
            if (size() != map2.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f1248d) {
                try {
                    K key2 = mo1882i(i2);
                    V mine2 = mo1887m(i2);
                    Object theirs2 = map2.get(key2);
                    if (mine2 == null) {
                        if (theirs2 != null || !map2.containsKey(key2)) {
                            return false;
                        }
                    } else if (!mine2.equals(theirs2)) {
                        return false;
                    }
                    i2++;
                } catch (NullPointerException e3) {
                    return false;
                } catch (ClassCastException e4) {
                    return false;
                }
            }
            return true;
        }
    }

    public int hashCode() {
        int[] hashes = this.f1246b;
        Object[] array = this.f1247c;
        int result = 0;
        int i = 0;
        int v = 1;
        int s = this.f1248d;
        while (i < s) {
            Object value = array[v];
            result += hashes[i] ^ (value == null ? 0 : value.hashCode());
            i++;
            v += 2;
        }
        return result;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f1248d * 28);
        buffer.append('{');
        for (int i = 0; i < this.f1248d; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            Object key = mo1882i(i);
            if (key != this) {
                buffer.append(key);
            } else {
                buffer.append("(this Map)");
            }
            buffer.append('=');
            Object value = mo1887m(i);
            if (value != this) {
                buffer.append(value);
            } else {
                buffer.append("(this Map)");
            }
        }
        buffer.append('}');
        return buffer.toString();
    }
}
