package p000a.p018e;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: a.e.e */
public class C0262e<K, V> {

    /* renamed from: a */
    public final LinkedHashMap<K, V> f1219a;

    /* renamed from: b */
    public int f1220b;

    /* renamed from: c */
    public int f1221c;

    /* renamed from: d */
    public int f1222d;

    /* renamed from: e */
    public int f1223e;

    /* renamed from: f */
    public int f1224f;

    /* renamed from: g */
    public int f1225g;

    /* renamed from: h */
    public int f1226h;

    public C0262e(int maxSize) {
        if (maxSize > 0) {
            this.f1221c = maxSize;
            this.f1219a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r1 = mo1799a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r1 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.f1223e++;
        r0 = r4.f1219a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r0 == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r4.f1219a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        r4.f1220b += mo1803e(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        mo1800b(false, r5, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        mo1805g(r4.f1221c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        return r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo1801c(K r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0055
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f1219a     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0013
            int r1 = r4.f1225g     // Catch:{ all -> 0x0052 }
            int r1 = r1 + 1
            r4.f1225g = r1     // Catch:{ all -> 0x0052 }
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            return r0
        L_0x0013:
            int r1 = r4.f1226h     // Catch:{ all -> 0x0052 }
            int r1 = r1 + 1
            r4.f1226h = r1     // Catch:{ all -> 0x0052 }
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r4.mo1799a(r5)
            if (r1 != 0) goto L_0x0022
            r2 = 0
            return r2
        L_0x0022:
            monitor-enter(r4)
            int r2 = r4.f1223e     // Catch:{ all -> 0x004f }
            int r2 = r2 + 1
            r4.f1223e = r2     // Catch:{ all -> 0x004f }
            java.util.LinkedHashMap<K, V> r2 = r4.f1219a     // Catch:{ all -> 0x004f }
            java.lang.Object r2 = r2.put(r5, r1)     // Catch:{ all -> 0x004f }
            r0 = r2
            if (r0 == 0) goto L_0x0038
            java.util.LinkedHashMap<K, V> r2 = r4.f1219a     // Catch:{ all -> 0x004f }
            r2.put(r5, r0)     // Catch:{ all -> 0x004f }
            goto L_0x0041
        L_0x0038:
            int r2 = r4.f1220b     // Catch:{ all -> 0x004f }
            int r3 = r4.mo1803e(r5, r1)     // Catch:{ all -> 0x004f }
            int r2 = r2 + r3
            r4.f1220b = r2     // Catch:{ all -> 0x004f }
        L_0x0041:
            monitor-exit(r4)     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x0049
            r2 = 0
            r4.mo1800b(r2, r5, r1, r0)
            return r0
        L_0x0049:
            int r2 = r4.f1221c
            r4.mo1805g(r2)
            return r1
        L_0x004f:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004f }
            throw r2
        L_0x0052:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            throw r0
        L_0x0055:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "key == null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p018e.C0262e.mo1801c(java.lang.Object):java.lang.Object");
    }

    /* renamed from: d */
    public final V mo1802d(K key, V value) {
        V previous;
        if (key == null || value == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1222d++;
            this.f1220b += mo1803e(key, value);
            previous = this.f1219a.put(key, value);
            if (previous != null) {
                this.f1220b -= mo1803e(key, previous);
            }
        }
        if (previous != null) {
            mo1800b(false, key, previous, value);
        }
        mo1805g(this.f1221c);
        return previous;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1805g(int r6) {
        /*
            r5 = this;
        L_0x0000:
            monitor-enter(r5)
            int r0 = r5.f1220b     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<K, V> r0 = r5.f1219a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r5.f1220b     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r5.f1220b     // Catch:{ all -> 0x0071 }
            if (r0 <= r6) goto L_0x0050
            java.util.LinkedHashMap<K, V> r0 = r5.f1219a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r5.f1219a     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<K, V> r3 = r5.f1219a     // Catch:{ all -> 0x0071 }
            r3.remove(r1)     // Catch:{ all -> 0x0071 }
            int r3 = r5.f1220b     // Catch:{ all -> 0x0071 }
            int r4 = r5.mo1803e(r1, r2)     // Catch:{ all -> 0x0071 }
            int r3 = r3 - r4
            r5.f1220b = r3     // Catch:{ all -> 0x0071 }
            int r3 = r5.f1224f     // Catch:{ all -> 0x0071 }
            r4 = 1
            int r3 = r3 + r4
            r5.f1224f = r3     // Catch:{ all -> 0x0071 }
            monitor-exit(r5)     // Catch:{ all -> 0x0071 }
            r0 = 0
            r5.mo1800b(r4, r1, r2, r0)
            goto L_0x0000
        L_0x0050:
            monitor-exit(r5)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r1.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r2 = r5.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x0071 }
            r1.append(r2)     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = ".sizeOf() is reporting inconsistent results!"
            r1.append(r2)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0071 }
            r0.<init>(r1)     // Catch:{ all -> 0x0071 }
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0071 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p018e.C0262e.mo1805g(int):void");
    }

    /* renamed from: b */
    public void mo1800b(boolean evicted, K k, V v, V v2) {
    }

    /* renamed from: a */
    public V mo1799a(K k) {
        return null;
    }

    /* renamed from: e */
    public final int mo1803e(K key, V value) {
        int result = mo1804f(key, value);
        if (result >= 0) {
            return result;
        }
        throw new IllegalStateException("Negative size: " + key + "=" + value);
    }

    /* renamed from: f */
    public int mo1804f(K k, V v) {
        return 1;
    }

    public final synchronized String toString() {
        int i;
        int accesses;
        i = this.f1225g;
        accesses = this.f1226h + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f1221c), Integer.valueOf(this.f1225g), Integer.valueOf(this.f1226h), Integer.valueOf(accesses != 0 ? (i * 100) / accesses : 0)});
    }
}
