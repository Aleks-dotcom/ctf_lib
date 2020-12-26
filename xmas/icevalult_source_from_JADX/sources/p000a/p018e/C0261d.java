package p000a.p018e;

import androidx.collection.LongSparseArray;

/* renamed from: a.e.d */
public class C0261d<E> implements Cloneable {

    /* renamed from: f */
    public static final Object f1214f = new Object();

    /* renamed from: b */
    public boolean f1215b;

    /* renamed from: c */
    public long[] f1216c;

    /* renamed from: d */
    public Object[] f1217d;

    /* renamed from: e */
    public int f1218e;

    public C0261d() {
        this(10);
    }

    public C0261d(int initialCapacity) {
        this.f1215b = false;
        if (initialCapacity == 0) {
            this.f1216c = C0260c.f1212b;
            this.f1217d = C0260c.f1213c;
            return;
        }
        int initialCapacity2 = C0260c.m1344f(initialCapacity);
        this.f1216c = new long[initialCapacity2];
        this.f1217d = new Object[initialCapacity2];
    }

    /* renamed from: c */
    public C0261d<E> clone() {
        try {
            LongSparseArray<E> clone = (C0261d) super.clone();
            clone.f1216c = (long[]) this.f1216c.clone();
            clone.f1217d = (Object[]) this.f1217d.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    public E mo1789f(long key) {
        return mo1790g(key, (Object) null);
    }

    /* renamed from: g */
    public E mo1790g(long key, E valueIfKeyNotFound) {
        int i = C0260c.m1340b(this.f1216c, this.f1218e, key);
        if (i >= 0) {
            E[] eArr = this.f1217d;
            if (eArr[i] != f1214f) {
                return eArr[i];
            }
        }
        return valueIfKeyNotFound;
    }

    @Deprecated
    /* renamed from: d */
    public void mo1787d(long key) {
        mo1794k(key);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r4.f1217d;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1794k(long r5) {
        /*
            r4 = this;
            long[] r0 = r4.f1216c
            int r1 = r4.f1218e
            int r0 = p000a.p018e.C0260c.m1340b(r0, r1, r5)
            if (r0 < 0) goto L_0x0017
            java.lang.Object[] r1 = r4.f1217d
            r2 = r1[r0]
            java.lang.Object r3 = f1214f
            if (r2 == r3) goto L_0x0017
            r1[r0] = r3
            r1 = 1
            r4.f1215b = r1
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p018e.C0261d.mo1794k(long):void");
    }

    /* renamed from: l */
    public void mo1795l(int index) {
        Object[] objArr = this.f1217d;
        Object obj = objArr[index];
        Object obj2 = f1214f;
        if (obj != obj2) {
            objArr[index] = obj2;
            this.f1215b = true;
        }
    }

    /* renamed from: e */
    public final void mo1788e() {
        int n = this.f1218e;
        int o = 0;
        long[] keys = this.f1216c;
        Object[] values = this.f1217d;
        for (int i = 0; i < n; i++) {
            Object val = values[i];
            if (val != f1214f) {
                if (i != o) {
                    keys[o] = keys[i];
                    values[o] = val;
                    values[i] = null;
                }
                o++;
            }
        }
        this.f1215b = false;
        this.f1218e = o;
    }

    /* renamed from: j */
    public void mo1793j(long key, E value) {
        int i = C0260c.m1340b(this.f1216c, this.f1218e, key);
        if (i >= 0) {
            this.f1217d[i] = value;
            return;
        }
        int i2 = ~i;
        int i3 = this.f1218e;
        if (i2 < i3) {
            Object[] objArr = this.f1217d;
            if (objArr[i2] == f1214f) {
                this.f1216c[i2] = key;
                objArr[i2] = value;
                return;
            }
        }
        if (this.f1215b && i3 >= this.f1216c.length) {
            mo1788e();
            i2 = ~C0260c.m1340b(this.f1216c, this.f1218e, key);
        }
        int i4 = this.f1218e;
        if (i4 >= this.f1216c.length) {
            int n = C0260c.m1344f(i4 + 1);
            long[] nkeys = new long[n];
            Object[] nvalues = new Object[n];
            long[] jArr = this.f1216c;
            System.arraycopy(jArr, 0, nkeys, 0, jArr.length);
            Object[] objArr2 = this.f1217d;
            System.arraycopy(objArr2, 0, nvalues, 0, objArr2.length);
            this.f1216c = nkeys;
            this.f1217d = nvalues;
        }
        int n2 = this.f1218e;
        if (n2 - i2 != 0) {
            long[] jArr2 = this.f1216c;
            System.arraycopy(jArr2, i2, jArr2, i2 + 1, n2 - i2);
            Object[] objArr3 = this.f1217d;
            System.arraycopy(objArr3, i2, objArr3, i2 + 1, this.f1218e - i2);
        }
        this.f1216c[i2] = key;
        this.f1217d[i2] = value;
        this.f1218e++;
    }

    /* renamed from: m */
    public int mo1796m() {
        if (this.f1215b) {
            mo1788e();
        }
        return this.f1218e;
    }

    /* renamed from: i */
    public long mo1792i(int index) {
        if (this.f1215b) {
            mo1788e();
        }
        return this.f1216c[index];
    }

    /* renamed from: n */
    public E mo1797n(int index) {
        if (this.f1215b) {
            mo1788e();
        }
        return this.f1217d[index];
    }

    /* renamed from: h */
    public int mo1791h(long key) {
        if (this.f1215b) {
            mo1788e();
        }
        return C0260c.m1340b(this.f1216c, this.f1218e, key);
    }

    /* renamed from: b */
    public void mo1784b() {
        int n = this.f1218e;
        Object[] values = this.f1217d;
        for (int i = 0; i < n; i++) {
            values[i] = null;
        }
        this.f1218e = 0;
        this.f1215b = false;
    }

    /* renamed from: a */
    public void mo1783a(long key, E value) {
        int i = this.f1218e;
        if (i == 0 || key > this.f1216c[i - 1]) {
            if (this.f1215b && i >= this.f1216c.length) {
                mo1788e();
            }
            int pos = this.f1218e;
            if (pos >= this.f1216c.length) {
                int n = C0260c.m1344f(pos + 1);
                long[] nkeys = new long[n];
                Object[] nvalues = new Object[n];
                long[] jArr = this.f1216c;
                System.arraycopy(jArr, 0, nkeys, 0, jArr.length);
                Object[] objArr = this.f1217d;
                System.arraycopy(objArr, 0, nvalues, 0, objArr.length);
                this.f1216c = nkeys;
                this.f1217d = nvalues;
            }
            this.f1216c[pos] = key;
            this.f1217d[pos] = value;
            this.f1218e = pos + 1;
            return;
        }
        mo1793j(key, value);
    }

    public String toString() {
        if (mo1796m() <= 0) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f1218e * 28);
        buffer.append('{');
        for (int i = 0; i < this.f1218e; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            buffer.append(mo1792i(i));
            buffer.append('=');
            Object value = mo1797n(i);
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
