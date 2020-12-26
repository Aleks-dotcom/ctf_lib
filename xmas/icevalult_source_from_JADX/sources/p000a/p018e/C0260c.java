package p000a.p018e;

/* renamed from: a.e.c */
public class C0260c {

    /* renamed from: a */
    public static final int[] f1211a = new int[0];

    /* renamed from: b */
    public static final long[] f1212b = new long[0];

    /* renamed from: c */
    public static final Object[] f1213c = new Object[0];

    /* renamed from: e */
    public static int m1343e(int need) {
        return m1342d(need * 4) / 4;
    }

    /* renamed from: f */
    public static int m1344f(int need) {
        return m1342d(need * 8) / 8;
    }

    /* renamed from: d */
    public static int m1342d(int need) {
        for (int i = 4; i < 32; i++) {
            if (need <= (1 << i) - 12) {
                return (1 << i) - 12;
            }
        }
        return need;
    }

    /* renamed from: c */
    public static boolean m1341c(Object a, Object b) {
        return a == b || (a != null && a.equals(b));
    }

    /* renamed from: a */
    public static int m1339a(int[] array, int size, int value) {
        int lo = 0;
        int hi = size - 1;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            int midVal = array[mid];
            if (midVal < value) {
                lo = mid + 1;
            } else if (midVal <= value) {
                return mid;
            } else {
                hi = mid - 1;
            }
        }
        return ~lo;
    }

    /* renamed from: b */
    public static int m1340b(long[] array, int size, long value) {
        int lo = 0;
        int hi = size - 1;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            long midVal = array[mid];
            if (midVal < value) {
                lo = mid + 1;
            } else if (midVal <= value) {
                return mid;
            } else {
                hi = mid - 1;
            }
        }
        return ~lo;
    }
}
