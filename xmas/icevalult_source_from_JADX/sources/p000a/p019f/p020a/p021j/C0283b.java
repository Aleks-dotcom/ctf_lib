package p000a.p019f.p020a.p021j;

import java.util.ArrayList;
import p000a.p019f.p020a.C0275e;
import p000a.p019f.p020a.C0280i;
import p000a.p019f.p020a.p021j.C0291f;

/* renamed from: a.f.a.j.b */
public class C0283b extends C0298j {

    /* renamed from: m0 */
    public int f1336m0 = 0;

    /* renamed from: n0 */
    public ArrayList<C0301m> f1337n0 = new ArrayList<>(4);

    /* renamed from: o0 */
    public boolean f1338o0 = true;

    /* renamed from: c */
    public boolean mo1997c() {
        return true;
    }

    /* renamed from: L0 */
    public void mo1993L0(int barrierType) {
        this.f1336m0 = barrierType;
    }

    /* renamed from: K0 */
    public void mo1992K0(boolean allowsGoneWidget) {
        this.f1338o0 = allowsGoneWidget;
    }

    /* renamed from: S */
    public void mo1994S() {
        super.mo1994S();
        this.f1337n0.clear();
    }

    /* renamed from: d */
    public void mo1998d(int optimizationLevel) {
        C0301m node;
        C0291f fVar = this.f1387D;
        if (fVar != null && ((C0294g) fVar).mo2109X0(2)) {
            int i = this.f1336m0;
            if (i == 0) {
                node = this.f1437s.mo2006f();
            } else if (i == 1) {
                node = this.f1439u.mo2006f();
            } else if (i == 2) {
                node = this.f1438t.mo2006f();
            } else if (i == 3) {
                node = this.f1440v.mo2006f();
            } else {
                return;
            }
            node.mo2143p(5);
            int i2 = this.f1336m0;
            if (i2 == 0 || i2 == 1) {
                this.f1438t.mo2006f().mo2139l((C0301m) null, 0.0f);
                this.f1440v.mo2006f().mo2139l((C0301m) null, 0.0f);
            } else {
                this.f1437s.mo2006f().mo2139l((C0301m) null, 0.0f);
                this.f1439u.mo2006f().mo2139l((C0301m) null, 0.0f);
            }
            this.f1337n0.clear();
            for (int i3 = 0; i3 < this.f1492l0; i3++) {
                C0291f widget = this.f1491k0[i3];
                if (this.f1338o0 || widget.mo1997c()) {
                    C0301m depends = null;
                    int i4 = this.f1336m0;
                    if (i4 == 0) {
                        depends = widget.f1437s.mo2006f();
                    } else if (i4 == 1) {
                        depends = widget.f1439u.mo2006f();
                    } else if (i4 == 2) {
                        depends = widget.f1438t.mo2006f();
                    } else if (i4 == 3) {
                        depends = widget.f1440v.mo2006f();
                    }
                    if (depends != null) {
                        this.f1337n0.add(depends);
                        depends.mo2148a(node);
                    }
                }
            }
        }
    }

    /* renamed from: U */
    public void mo1995U() {
        C0301m node;
        float value = 0.0f;
        int i = this.f1336m0;
        if (i == 0) {
            node = this.f1437s.mo2006f();
            value = Float.MAX_VALUE;
        } else if (i == 1) {
            node = this.f1439u.mo2006f();
        } else if (i == 2) {
            node = this.f1438t.mo2006f();
            value = Float.MAX_VALUE;
        } else if (i == 3) {
            node = this.f1440v.mo2006f();
        } else {
            return;
        }
        int count = this.f1337n0.size();
        C0301m resolvedTarget = null;
        int i2 = 0;
        while (i2 < count) {
            C0301m n = this.f1337n0.get(i2);
            if (n.f1507b == 1) {
                int i3 = this.f1336m0;
                if (i3 == 0 || i3 == 2) {
                    if (n.f1498g < value) {
                        value = n.f1498g;
                        resolvedTarget = n.f1497f;
                    }
                } else if (n.f1498g > value) {
                    value = n.f1498g;
                    resolvedTarget = n.f1497f;
                }
                i2++;
            } else {
                return;
            }
        }
        if (C0275e.m1452x() != null) {
            C0275e.m1452x().f1315y++;
        }
        node.f1497f = resolvedTarget;
        node.f1498g = value;
        node.mo2149b();
        int i4 = this.f1336m0;
        if (i4 == 0) {
            this.f1439u.mo2006f().mo2139l(resolvedTarget, value);
        } else if (i4 == 1) {
            this.f1437s.mo2006f().mo2139l(resolvedTarget, value);
        } else if (i4 == 2) {
            this.f1440v.mo2006f().mo2139l(resolvedTarget, value);
        } else if (i4 == 3) {
            this.f1438t.mo2006f().mo2139l(resolvedTarget, value);
        }
    }

    /* renamed from: b */
    public void mo1996b(C0275e system) {
        C0286e[] eVarArr;
        C0286e[] eVarArr2 = this.f1384A;
        eVarArr2[0] = this.f1437s;
        eVarArr2[2] = this.f1438t;
        eVarArr2[1] = this.f1439u;
        eVarArr2[3] = this.f1440v;
        int i = 0;
        while (true) {
            eVarArr = this.f1384A;
            if (i >= eVarArr.length) {
                break;
            }
            eVarArr[i].f1364i = system.mo1976r(eVarArr[i]);
            i++;
        }
        int i2 = this.f1336m0;
        if (i2 >= 0 && i2 < 4) {
            C0286e position = eVarArr[i2];
            boolean hasMatchConstraintWidgets = false;
            int i3 = 0;
            while (true) {
                if (i3 >= this.f1492l0) {
                    break;
                }
                C0291f widget = this.f1491k0[i3];
                if (this.f1338o0 || widget.mo1997c()) {
                    int i4 = this.f1336m0;
                    if ((i4 != 0 && i4 != 1) || widget.mo2081s() != C0291f.C0293b.MATCH_CONSTRAINT) {
                        int i5 = this.f1336m0;
                        if ((i5 == 2 || i5 == 3) && widget.mo2018B() == C0291f.C0293b.MATCH_CONSTRAINT) {
                            hasMatchConstraintWidgets = true;
                            break;
                        }
                    } else {
                        hasMatchConstraintWidgets = true;
                        break;
                    }
                }
                i3++;
            }
            int i6 = this.f1336m0;
            if (i6 == 0 || i6 == 1) {
                if (mo2086u().mo2081s() == C0291f.C0293b.WRAP_CONTENT) {
                    hasMatchConstraintWidgets = false;
                }
            } else if (mo2086u().mo2018B() == C0291f.C0293b.WRAP_CONTENT) {
                hasMatchConstraintWidgets = false;
            }
            for (int i7 = 0; i7 < this.f1492l0; i7++) {
                C0291f widget2 = this.f1491k0[i7];
                if (this.f1338o0 || widget2.mo1997c()) {
                    C0280i target = system.mo1976r(widget2.f1384A[this.f1336m0]);
                    C0286e[] eVarArr3 = widget2.f1384A;
                    int i8 = this.f1336m0;
                    eVarArr3[i8].f1364i = target;
                    if (i8 == 0 || i8 == 2) {
                        system.mo1968j(position.f1364i, target, hasMatchConstraintWidgets);
                    } else {
                        system.mo1966h(position.f1364i, target, hasMatchConstraintWidgets);
                    }
                }
            }
            int i9 = this.f1336m0;
            if (i9 == 0) {
                system.mo1963e(this.f1439u.f1364i, this.f1437s.f1364i, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.mo1963e(this.f1437s.f1364i, this.f1387D.f1439u.f1364i, 0, 5);
                }
            } else if (i9 == 1) {
                system.mo1963e(this.f1437s.f1364i, this.f1439u.f1364i, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.mo1963e(this.f1437s.f1364i, this.f1387D.f1437s.f1364i, 0, 5);
                }
            } else if (i9 == 2) {
                system.mo1963e(this.f1440v.f1364i, this.f1438t.f1364i, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.mo1963e(this.f1438t.f1364i, this.f1387D.f1440v.f1364i, 0, 5);
                }
            } else if (i9 == 3) {
                system.mo1963e(this.f1438t.f1364i, this.f1440v.f1364i, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.mo1963e(this.f1438t.f1364i, this.f1387D.f1438t.f1364i, 0, 5);
                }
            }
        }
    }
}
