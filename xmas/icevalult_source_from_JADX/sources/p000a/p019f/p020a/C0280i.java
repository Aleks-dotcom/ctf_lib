package p000a.p019f.p020a;

import java.util.Arrays;

/* renamed from: a.f.a.i */
public class C0280i {

    /* renamed from: k */
    public static int f1319k = 1;

    /* renamed from: a */
    public String f1320a;

    /* renamed from: b */
    public int f1321b = -1;

    /* renamed from: c */
    public int f1322c = -1;

    /* renamed from: d */
    public int f1323d = 0;

    /* renamed from: e */
    public float f1324e;

    /* renamed from: f */
    public float[] f1325f = new float[7];

    /* renamed from: g */
    public C0281a f1326g;

    /* renamed from: h */
    public C0272b[] f1327h = new C0272b[8];

    /* renamed from: i */
    public int f1328i = 0;

    /* renamed from: j */
    public int f1329j = 0;

    /* renamed from: a.f.a.i$a */
    public enum C0281a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    /* renamed from: b */
    public static void m1492b() {
        f1319k++;
    }

    public C0280i(C0281a type, String prefix) {
        this.f1326g = type;
    }

    /* renamed from: a */
    public final void mo1986a(C0272b row) {
        int i = 0;
        while (true) {
            int i2 = this.f1328i;
            if (i >= i2) {
                C0272b[] bVarArr = this.f1327h;
                if (i2 >= bVarArr.length) {
                    this.f1327h = (C0272b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C0272b[] bVarArr2 = this.f1327h;
                int i3 = this.f1328i;
                bVarArr2[i3] = row;
                this.f1328i = i3 + 1;
                return;
            } else if (this.f1327h[i] != row) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo1987c(C0272b row) {
        int count = this.f1328i;
        for (int i = 0; i < count; i++) {
            if (this.f1327h[i] == row) {
                for (int j = 0; j < (count - i) - 1; j++) {
                    C0272b[] bVarArr = this.f1327h;
                    bVarArr[i + j] = bVarArr[i + j + 1];
                }
                this.f1328i--;
                return;
            }
        }
    }

    /* renamed from: f */
    public final void mo1990f(C0272b definition) {
        int count = this.f1328i;
        for (int i = 0; i < count; i++) {
            C0272b[] bVarArr = this.f1327h;
            bVarArr[i].f1268d.mo1923n(bVarArr[i], definition, false);
        }
        this.f1328i = 0;
    }

    /* renamed from: d */
    public void mo1988d() {
        this.f1320a = null;
        this.f1326g = C0281a.UNKNOWN;
        this.f1323d = 0;
        this.f1321b = -1;
        this.f1322c = -1;
        this.f1324e = 0.0f;
        this.f1328i = 0;
        this.f1329j = 0;
    }

    /* renamed from: e */
    public void mo1989e(C0281a type, String prefix) {
        this.f1326g = type;
    }

    public String toString() {
        return "" + this.f1320a;
    }
}
