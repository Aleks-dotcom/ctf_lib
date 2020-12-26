package p000a.p018e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: a.e.b */
public final class C0258b<E> implements Collection<E>, Set<E> {

    /* renamed from: f */
    public static final int[] f1200f = new int[0];

    /* renamed from: g */
    public static final Object[] f1201g = new Object[0];

    /* renamed from: h */
    public static Object[] f1202h;

    /* renamed from: i */
    public static int f1203i;

    /* renamed from: j */
    public static Object[] f1204j;

    /* renamed from: k */
    public static int f1205k;

    /* renamed from: b */
    public int[] f1206b;

    /* renamed from: c */
    public Object[] f1207c;

    /* renamed from: d */
    public int f1208d;

    /* renamed from: e */
    public C0263f<E, E> f1209e;

    /* renamed from: f */
    public final int mo1769f(Object key, int hash) {
        int N = this.f1208d;
        if (N == 0) {
            return -1;
        }
        int index = C0260c.m1339a(this.f1206b, N, hash);
        if (index < 0 || key.equals(this.f1207c[index])) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f1206b[end] == hash) {
            if (key.equals(this.f1207c[end])) {
                return end;
            }
            end++;
        }
        int i = index - 1;
        while (i >= 0 && this.f1206b[i] == hash) {
            if (key.equals(this.f1207c[i])) {
                return i;
            }
            i--;
        }
        return ~end;
    }

    /* renamed from: g */
    public final int mo1770g() {
        int N = this.f1208d;
        if (N == 0) {
            return -1;
        }
        int index = C0260c.m1339a(this.f1206b, N, 0);
        if (index < 0 || this.f1207c[index] == null) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f1206b[end] == 0) {
            if (this.f1207c[end] == null) {
                return end;
            }
            end++;
        }
        int i = index - 1;
        while (i >= 0 && this.f1206b[i] == 0) {
            if (this.f1207c[i] == null) {
                return i;
            }
            i--;
        }
        return ~end;
    }

    /* renamed from: a */
    public final void mo1759a(int size) {
        if (size == 8) {
            synchronized (C0258b.class) {
                Object[] array = f1204j;
                if (array != null) {
                    this.f1207c = array;
                    f1204j = (Object[]) array[0];
                    this.f1206b = (int[]) array[1];
                    array[1] = null;
                    array[0] = null;
                    f1205k--;
                    return;
                }
            }
        } else if (size == 4) {
            synchronized (C0258b.class) {
                Object[] array2 = f1202h;
                if (array2 != null) {
                    this.f1207c = array2;
                    f1202h = (Object[]) array2[0];
                    this.f1206b = (int[]) array2[1];
                    array2[1] = null;
                    array2[0] = null;
                    f1203i--;
                    return;
                }
            }
        }
        this.f1206b = new int[size];
        this.f1207c = new Object[size];
    }

    /* renamed from: c */
    public static void m1321c(int[] hashes, Object[] array, int size) {
        if (hashes.length == 8) {
            synchronized (C0258b.class) {
                if (f1205k < 10) {
                    array[0] = f1204j;
                    array[1] = hashes;
                    for (int i = size - 1; i >= 2; i--) {
                        array[i] = null;
                    }
                    f1204j = array;
                    f1205k++;
                }
            }
        } else if (hashes.length == 4) {
            synchronized (C0258b.class) {
                if (f1203i < 10) {
                    array[0] = f1202h;
                    array[1] = hashes;
                    for (int i2 = size - 1; i2 >= 2; i2--) {
                        array[i2] = null;
                    }
                    f1202h = array;
                    f1203i++;
                }
            }
        }
    }

    public C0258b() {
        this(0);
    }

    public C0258b(int capacity) {
        if (capacity == 0) {
            this.f1206b = f1200f;
            this.f1207c = f1201g;
        } else {
            mo1759a(capacity);
        }
        this.f1208d = 0;
    }

    public void clear() {
        int i = this.f1208d;
        if (i != 0) {
            m1321c(this.f1206b, this.f1207c, i);
            this.f1206b = f1200f;
            this.f1207c = f1201g;
            this.f1208d = 0;
        }
    }

    /* renamed from: b */
    public void mo1762b(int minimumCapacity) {
        if (this.f1206b.length < minimumCapacity) {
            int[] ohashes = this.f1206b;
            Object[] oarray = this.f1207c;
            mo1759a(minimumCapacity);
            int i = this.f1208d;
            if (i > 0) {
                System.arraycopy(ohashes, 0, this.f1206b, 0, i);
                System.arraycopy(oarray, 0, this.f1207c, 0, this.f1208d);
            }
            m1321c(ohashes, oarray, this.f1208d);
        }
    }

    public boolean contains(Object key) {
        return mo1767e(key) >= 0;
    }

    /* renamed from: e */
    public int mo1767e(Object key) {
        return key == null ? mo1770g() : mo1769f(key, key.hashCode());
    }

    /* renamed from: i */
    public E mo1773i(int index) {
        return this.f1207c[index];
    }

    public boolean isEmpty() {
        return this.f1208d <= 0;
    }

    public boolean add(E value) {
        int index;
        int hash;
        if (value == null) {
            hash = 0;
            index = mo1770g();
        } else {
            hash = value.hashCode();
            index = mo1769f(value, hash);
        }
        if (index >= 0) {
            return false;
        }
        int index2 = ~index;
        int i = this.f1208d;
        if (i >= this.f1206b.length) {
            int i2 = 4;
            if (i >= 8) {
                i2 = (i >> 1) + i;
            } else if (i >= 4) {
                i2 = 8;
            }
            int n = i2;
            int[] ohashes = this.f1206b;
            Object[] oarray = this.f1207c;
            mo1759a(n);
            int[] iArr = this.f1206b;
            if (iArr.length > 0) {
                System.arraycopy(ohashes, 0, iArr, 0, ohashes.length);
                System.arraycopy(oarray, 0, this.f1207c, 0, oarray.length);
            }
            m1321c(ohashes, oarray, this.f1208d);
        }
        int i3 = this.f1208d;
        if (index2 < i3) {
            int[] iArr2 = this.f1206b;
            System.arraycopy(iArr2, index2, iArr2, index2 + 1, i3 - index2);
            Object[] objArr = this.f1207c;
            System.arraycopy(objArr, index2, objArr, index2 + 1, this.f1208d - index2);
        }
        this.f1206b[index2] = hash;
        this.f1207c[index2] = value;
        this.f1208d++;
        return true;
    }

    public boolean remove(Object object) {
        int index = mo1767e(object);
        if (index < 0) {
            return false;
        }
        mo1771h(index);
        return true;
    }

    /* renamed from: h */
    public E mo1771h(int index) {
        Object[] objArr = this.f1207c;
        Object old = objArr[index];
        int i = this.f1208d;
        if (i <= 1) {
            m1321c(this.f1206b, objArr, i);
            this.f1206b = f1200f;
            this.f1207c = f1201g;
            this.f1208d = 0;
        } else {
            int[] iArr = this.f1206b;
            int n = 8;
            if (iArr.length <= 8 || i >= iArr.length / 3) {
                int i2 = i - 1;
                this.f1208d = i2;
                if (index < i2) {
                    System.arraycopy(iArr, index + 1, iArr, index, i2 - index);
                    Object[] objArr2 = this.f1207c;
                    System.arraycopy(objArr2, index + 1, objArr2, index, this.f1208d - index);
                }
                this.f1207c[this.f1208d] = null;
            } else {
                if (i > 8) {
                    n = i + (i >> 1);
                }
                int[] ohashes = this.f1206b;
                Object[] oarray = this.f1207c;
                mo1759a(n);
                this.f1208d--;
                if (index > 0) {
                    System.arraycopy(ohashes, 0, this.f1206b, 0, index);
                    System.arraycopy(oarray, 0, this.f1207c, 0, index);
                }
                int i3 = this.f1208d;
                if (index < i3) {
                    System.arraycopy(ohashes, index + 1, this.f1206b, index, i3 - index);
                    System.arraycopy(oarray, index + 1, this.f1207c, index, this.f1208d - index);
                }
            }
        }
        return old;
    }

    public int size() {
        return this.f1208d;
    }

    public Object[] toArray() {
        int i = this.f1208d;
        Object[] result = new Object[i];
        System.arraycopy(this.f1207c, 0, result, 0, i);
        return result;
    }

    public <T> T[] toArray(T[] array) {
        if (array.length < this.f1208d) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), this.f1208d);
        }
        System.arraycopy(this.f1207c, 0, array, 0, this.f1208d);
        int length = array.length;
        int i = this.f1208d;
        if (length > i) {
            array[i] = null;
        }
        return array;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set<?> set = (Set) object;
        if (size() != set.size()) {
            return false;
        }
        int i = 0;
        while (i < this.f1208d) {
            try {
                if (!set.contains(mo1773i(i))) {
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
    }

    public int hashCode() {
        int[] hashes = this.f1206b;
        int result = 0;
        int s = this.f1208d;
        for (int i = 0; i < s; i++) {
            result += hashes[i];
        }
        return result;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f1208d * 14);
        buffer.append('{');
        for (int i = 0; i < this.f1208d; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            Object value = mo1773i(i);
            if (value != this) {
                buffer.append(value);
            } else {
                buffer.append("(this Set)");
            }
        }
        buffer.append('}');
        return buffer.toString();
    }

    /* renamed from: a.e.b$a */
    public class C0259a extends C0263f<E, E> {
        public C0259a() {
        }

        /* renamed from: d */
        public int mo1753d() {
            return C0258b.this.f1208d;
        }

        /* renamed from: b */
        public Object mo1751b(int index, int offset) {
            return C0258b.this.f1207c[index];
        }

        /* renamed from: e */
        public int mo1754e(Object key) {
            return C0258b.this.mo1767e(key);
        }

        /* renamed from: f */
        public int mo1755f(Object value) {
            return C0258b.this.mo1767e(value);
        }

        /* renamed from: c */
        public Map<E, E> mo1752c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* renamed from: g */
        public void mo1756g(E key, E e) {
            C0258b.this.add(key);
        }

        /* renamed from: i */
        public E mo1758i(int index, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        /* renamed from: h */
        public void mo1757h(int index) {
            C0258b.this.mo1771h(index);
        }

        /* renamed from: a */
        public void mo1750a() {
            C0258b.this.clear();
        }
    }

    /* renamed from: d */
    public final C0263f<E, E> mo1766d() {
        if (this.f1209e == null) {
            this.f1209e = new C0259a();
        }
        return this.f1209e;
    }

    public Iterator<E> iterator() {
        return mo1766d().mo1808m().iterator();
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object item : collection) {
            if (!contains(item)) {
                return false;
            }
        }
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo1762b(this.f1208d + collection.size());
        boolean added = false;
        for (E value : collection) {
            added |= add(value);
        }
        return added;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean removed = false;
        for (Object value : collection) {
            removed |= remove(value);
        }
        return removed;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean removed = false;
        for (int i = this.f1208d - 1; i >= 0; i--) {
            if (!collection.contains(this.f1207c[i])) {
                mo1771h(i);
                removed = true;
            }
        }
        return removed;
    }
}
