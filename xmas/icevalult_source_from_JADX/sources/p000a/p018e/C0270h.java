package p000a.p018e;

import androidx.collection.SparseArrayCompat;

/* renamed from: a.e.h */
public class C0270h<E> implements Cloneable {

    /* renamed from: f */
    public static final Object f1249f = new Object();

    /* renamed from: b */
    public boolean f1250b;

    /* renamed from: c */
    public int[] f1251c;

    /* renamed from: d */
    public Object[] f1252d;

    /* renamed from: e */
    public int f1253e;

    public C0270h() {
        this(10);
    }

    public C0270h(int initialCapacity) {
        this.f1250b = false;
        if (initialCapacity == 0) {
            this.f1251c = C0260c.f1211a;
            this.f1252d = C0260c.f1213c;
            return;
        }
        int initialCapacity2 = C0260c.m1343e(initialCapacity);
        this.f1251c = new int[initialCapacity2];
        this.f1252d = new Object[initialCapacity2];
    }

    /* renamed from: c */
    public C0270h<E> clone() {
        try {
            SparseArrayCompat<E> clone = (C0270h) super.clone();
            clone.f1251c = (int[]) this.f1251c.clone();
            clone.f1252d = (Object[]) this.f1252d.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public E mo1901e(int key) {
        return mo1902f(key, (Object) null);
    }

    /* renamed from: f */
    public E mo1902f(int key, E valueIfKeyNotFound) {
        int i = C0260c.m1339a(this.f1251c, this.f1253e, key);
        if (i >= 0) {
            E[] eArr = this.f1252d;
            if (eArr[i] != f1249f) {
                return eArr[i];
            }
        }
        return valueIfKeyNotFound;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r4.f1252d;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1906j(int r5) {
        /*
            r4 = this;
            int[] r0 = r4.f1251c
            int r1 = r4.f1253e
            int r0 = p000a.p018e.C0260c.m1339a(r0, r1, r5)
            if (r0 < 0) goto L_0x0017
            java.lang.Object[] r1 = r4.f1252d
            r2 = r1[r0]
            java.lang.Object r3 = f1249f
            if (r2 == r3) goto L_0x0017
            r1[r0] = r3
            r1 = 1
            r4.f1250b = r1
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p018e.C0270h.mo1906j(int):void");
    }

    /* renamed from: d */
    public final void mo1900d() {
        int n = this.f1253e;
        int o = 0;
        int[] keys = this.f1251c;
        Object[] values = this.f1252d;
        for (int i = 0; i < n; i++) {
            Object val = values[i];
            if (val != f1249f) {
                if (i != o) {
                    keys[o] = keys[i];
                    values[o] = val;
                    values[i] = null;
                }
                o++;
            }
        }
        this.f1250b = false;
        this.f1253e = o;
    }

    /* renamed from: i */
    public void mo1905i(int key, E value) {
        int i = C0260c.m1339a(this.f1251c, this.f1253e, key);
        if (i >= 0) {
            this.f1252d[i] = value;
            return;
        }
        int i2 = ~i;
        int i3 = this.f1253e;
        if (i2 < i3) {
            Object[] objArr = this.f1252d;
            if (objArr[i2] == f1249f) {
                this.f1251c[i2] = key;
                objArr[i2] = value;
                return;
            }
        }
        if (this.f1250b && i3 >= this.f1251c.length) {
            mo1900d();
            i2 = ~C0260c.m1339a(this.f1251c, this.f1253e, key);
        }
        int i4 = this.f1253e;
        if (i4 >= this.f1251c.length) {
            int n = C0260c.m1343e(i4 + 1);
            int[] nkeys = new int[n];
            Object[] nvalues = new Object[n];
            int[] iArr = this.f1251c;
            System.arraycopy(iArr, 0, nkeys, 0, iArr.length);
            Object[] objArr2 = this.f1252d;
            System.arraycopy(objArr2, 0, nvalues, 0, objArr2.length);
            this.f1251c = nkeys;
            this.f1252d = nvalues;
        }
        int n2 = this.f1253e;
        if (n2 - i2 != 0) {
            int[] iArr2 = this.f1251c;
            System.arraycopy(iArr2, i2, iArr2, i2 + 1, n2 - i2);
            Object[] objArr3 = this.f1252d;
            System.arraycopy(objArr3, i2, objArr3, i2 + 1, this.f1253e - i2);
        }
        this.f1251c[i2] = key;
        this.f1252d[i2] = value;
        this.f1253e++;
    }

    /* renamed from: k */
    public int mo1907k() {
        if (this.f1250b) {
            mo1900d();
        }
        return this.f1253e;
    }

    /* renamed from: h */
    public int mo1904h(int index) {
        if (this.f1250b) {
            mo1900d();
        }
        return this.f1251c[index];
    }

    /* renamed from: l */
    public E mo1908l(int index) {
        if (this.f1250b) {
            mo1900d();
        }
        return this.f1252d[index];
    }

    /* renamed from: g */
    public int mo1903g(E value) {
        if (this.f1250b) {
            mo1900d();
        }
        for (int i = 0; i < this.f1253e; i++) {
            if (this.f1252d[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo1897b() {
        int n = this.f1253e;
        Object[] values = this.f1252d;
        for (int i = 0; i < n; i++) {
            values[i] = null;
        }
        this.f1253e = 0;
        this.f1250b = false;
    }

    /* renamed from: a */
    public void mo1896a(int key, E value) {
        int i = this.f1253e;
        if (i == 0 || key > this.f1251c[i - 1]) {
            if (this.f1250b && i >= this.f1251c.length) {
                mo1900d();
            }
            int pos = this.f1253e;
            if (pos >= this.f1251c.length) {
                int n = C0260c.m1343e(pos + 1);
                int[] nkeys = new int[n];
                Object[] nvalues = new Object[n];
                int[] iArr = this.f1251c;
                System.arraycopy(iArr, 0, nkeys, 0, iArr.length);
                Object[] objArr = this.f1252d;
                System.arraycopy(objArr, 0, nvalues, 0, objArr.length);
                this.f1251c = nkeys;
                this.f1252d = nvalues;
            }
            this.f1251c[pos] = key;
            this.f1252d[pos] = value;
            this.f1253e = pos + 1;
            return;
        }
        mo1905i(key, value);
    }

    public String toString() {
        if (mo1907k() <= 0) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f1253e * 28);
        buffer.append('{');
        for (int i = 0; i < this.f1253e; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            buffer.append(mo1904h(i));
            buffer.append('=');
            Object value = mo1908l(i);
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
