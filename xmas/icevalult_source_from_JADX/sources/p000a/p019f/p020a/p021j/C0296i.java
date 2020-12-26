package p000a.p019f.p020a.p021j;

import java.util.ArrayList;
import p000a.p019f.p020a.C0275e;
import p000a.p019f.p020a.C0280i;
import p000a.p019f.p020a.p021j.C0286e;
import p000a.p019f.p020a.p021j.C0291f;

/* renamed from: a.f.a.j.i */
public class C0296i extends C0291f {

    /* renamed from: k0 */
    public float f1484k0 = -1.0f;

    /* renamed from: l0 */
    public int f1485l0 = -1;

    /* renamed from: m0 */
    public int f1486m0 = -1;

    /* renamed from: n0 */
    public C0286e f1487n0 = this.f1438t;

    /* renamed from: o0 */
    public int f1488o0 = 0;

    /* renamed from: p0 */
    public boolean f1489p0 = false;

    public C0296i() {
        new C0300l();
        this.f1385B.clear();
        this.f1385B.add(this.f1487n0);
        int count = this.f1384A.length;
        for (int i = 0; i < count; i++) {
            this.f1384A[i] = this.f1487n0;
        }
    }

    /* renamed from: c */
    public boolean mo1997c() {
        return true;
    }

    /* renamed from: M0 */
    public void mo2129M0(int orientation) {
        if (this.f1488o0 != orientation) {
            this.f1488o0 = orientation;
            this.f1385B.clear();
            if (this.f1488o0 == 1) {
                this.f1487n0 = this.f1437s;
            } else {
                this.f1487n0 = this.f1438t;
            }
            this.f1385B.add(this.f1487n0);
            int count = this.f1384A.length;
            for (int i = 0; i < count; i++) {
                this.f1384A[i] = this.f1487n0;
            }
        }
    }

    /* renamed from: I0 */
    public int mo2125I0() {
        return this.f1488o0;
    }

    /* renamed from: a.f.a.j.i$a */
    public static /* synthetic */ class C0297a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1490a;

        static {
            int[] iArr = new int[C0286e.C0290d.values().length];
            f1490a = iArr;
            try {
                iArr[C0286e.C0290d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f1490a[C0286e.C0290d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f1490a[C0286e.C0290d.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f1490a[C0286e.C0290d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f1490a[C0286e.C0290d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f1490a[C0286e.C0290d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f1490a[C0286e.C0290d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f1490a[C0286e.C0290d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f1490a[C0286e.C0290d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
        }
    }

    /* renamed from: h */
    public C0286e mo2059h(C0286e.C0290d anchorType) {
        switch (C0297a.f1490a[anchorType.ordinal()]) {
            case 1:
            case 2:
                if (this.f1488o0 == 1) {
                    return this.f1487n0;
                }
                break;
            case 3:
            case 4:
                if (this.f1488o0 == 0) {
                    return this.f1487n0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(anchorType.name());
    }

    /* renamed from: i */
    public ArrayList<C0286e> mo2061i() {
        return this.f1385B;
    }

    /* renamed from: L0 */
    public void mo2128L0(float value) {
        if (value > -1.0f) {
            this.f1484k0 = value;
            this.f1485l0 = -1;
            this.f1486m0 = -1;
        }
    }

    /* renamed from: J0 */
    public void mo2126J0(int value) {
        if (value > -1) {
            this.f1484k0 = -1.0f;
            this.f1485l0 = value;
            this.f1486m0 = -1;
        }
    }

    /* renamed from: K0 */
    public void mo2127K0(int value) {
        if (value > -1) {
            this.f1484k0 = -1.0f;
            this.f1485l0 = -1;
            this.f1486m0 = value;
        }
    }

    /* renamed from: d */
    public void mo1998d(int optimizationLevel) {
        C0291f constraintWidgetContainer = mo2086u();
        if (constraintWidgetContainer != null) {
            if (mo2125I0() == 1) {
                this.f1438t.mo2006f().mo2135h(1, constraintWidgetContainer.f1438t.mo2006f(), 0);
                this.f1440v.mo2006f().mo2135h(1, constraintWidgetContainer.f1438t.mo2006f(), 0);
                if (this.f1485l0 != -1) {
                    this.f1437s.mo2006f().mo2135h(1, constraintWidgetContainer.f1437s.mo2006f(), this.f1485l0);
                    this.f1439u.mo2006f().mo2135h(1, constraintWidgetContainer.f1437s.mo2006f(), this.f1485l0);
                } else if (this.f1486m0 != -1) {
                    this.f1437s.mo2006f().mo2135h(1, constraintWidgetContainer.f1439u.mo2006f(), -this.f1486m0);
                    this.f1439u.mo2006f().mo2135h(1, constraintWidgetContainer.f1439u.mo2006f(), -this.f1486m0);
                } else if (this.f1484k0 != -1.0f && constraintWidgetContainer.mo2081s() == C0291f.C0293b.FIXED) {
                    int position = (int) (((float) constraintWidgetContainer.f1388E) * this.f1484k0);
                    this.f1437s.mo2006f().mo2135h(1, constraintWidgetContainer.f1437s.mo2006f(), position);
                    this.f1439u.mo2006f().mo2135h(1, constraintWidgetContainer.f1437s.mo2006f(), position);
                }
            } else {
                this.f1437s.mo2006f().mo2135h(1, constraintWidgetContainer.f1437s.mo2006f(), 0);
                this.f1439u.mo2006f().mo2135h(1, constraintWidgetContainer.f1437s.mo2006f(), 0);
                if (this.f1485l0 != -1) {
                    this.f1438t.mo2006f().mo2135h(1, constraintWidgetContainer.f1438t.mo2006f(), this.f1485l0);
                    this.f1440v.mo2006f().mo2135h(1, constraintWidgetContainer.f1438t.mo2006f(), this.f1485l0);
                } else if (this.f1486m0 != -1) {
                    this.f1438t.mo2006f().mo2135h(1, constraintWidgetContainer.f1440v.mo2006f(), -this.f1486m0);
                    this.f1440v.mo2006f().mo2135h(1, constraintWidgetContainer.f1440v.mo2006f(), -this.f1486m0);
                } else if (this.f1484k0 != -1.0f && constraintWidgetContainer.mo2018B() == C0291f.C0293b.FIXED) {
                    int position2 = (int) (((float) constraintWidgetContainer.f1389F) * this.f1484k0);
                    this.f1438t.mo2006f().mo2135h(1, constraintWidgetContainer.f1438t.mo2006f(), position2);
                    this.f1440v.mo2006f().mo2135h(1, constraintWidgetContainer.f1438t.mo2006f(), position2);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo1996b(C0275e system) {
        C0294g parent = (C0294g) mo2086u();
        if (parent != null) {
            C0286e begin = parent.mo2059h(C0286e.C0290d.LEFT);
            C0286e end = parent.mo2059h(C0286e.C0290d.RIGHT);
            C0291f fVar = this.f1387D;
            boolean z = true;
            boolean parentWrapContent = fVar != null && fVar.f1386C[0] == C0291f.C0293b.WRAP_CONTENT;
            if (this.f1488o0 == 0) {
                begin = parent.mo2059h(C0286e.C0290d.TOP);
                end = parent.mo2059h(C0286e.C0290d.BOTTOM);
                C0291f fVar2 = this.f1387D;
                if (fVar2 == null || fVar2.f1386C[1] != C0291f.C0293b.WRAP_CONTENT) {
                    z = false;
                }
                parentWrapContent = z;
            }
            if (this.f1485l0 != -1) {
                C0280i guide = system.mo1976r(this.f1487n0);
                system.mo1963e(guide, system.mo1976r(begin), this.f1485l0, 6);
                if (parentWrapContent) {
                    system.mo1967i(system.mo1976r(end), guide, 0, 5);
                }
            } else if (this.f1486m0 != -1) {
                C0280i guide2 = system.mo1976r(this.f1487n0);
                C0280i parentRight = system.mo1976r(end);
                system.mo1963e(guide2, parentRight, -this.f1486m0, 6);
                if (parentWrapContent) {
                    system.mo1967i(guide2, system.mo1976r(begin), 0, 5);
                    system.mo1967i(parentRight, guide2, 0, 5);
                }
            } else if (this.f1484k0 != -1.0f) {
                system.mo1962d(C0275e.m1451t(system, system.mo1976r(this.f1487n0), system.mo1976r(begin), system.mo1976r(end), this.f1484k0, this.f1489p0));
            }
        }
    }

    /* renamed from: G0 */
    public void mo2029G0(C0275e system) {
        if (mo2086u() != null) {
            int value = system.mo1981y(this.f1487n0);
            if (this.f1488o0 == 1) {
                mo2021C0(value);
                mo2023D0(0);
                mo2050b0(mo2086u().mo2079r());
                mo2095y0(0);
                return;
            }
            mo2021C0(0);
            mo2023D0(value);
            mo2095y0(mo2086u().mo2022D());
            mo2050b0(0);
        }
    }
}
