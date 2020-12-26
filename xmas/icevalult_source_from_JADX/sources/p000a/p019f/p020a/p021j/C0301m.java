package p000a.p019f.p020a.p021j;

import p000a.p019f.p020a.C0275e;
import p000a.p019f.p020a.C0280i;
import p000a.p019f.p020a.p021j.C0286e;

/* renamed from: a.f.a.j.m */
public class C0301m extends C0303o {

    /* renamed from: c */
    public C0286e f1494c;

    /* renamed from: d */
    public C0301m f1495d;

    /* renamed from: e */
    public float f1496e;

    /* renamed from: f */
    public C0301m f1497f;

    /* renamed from: g */
    public float f1498g;

    /* renamed from: h */
    public int f1499h = 0;

    /* renamed from: i */
    public C0301m f1500i;

    /* renamed from: j */
    public C0302n f1501j = null;

    /* renamed from: k */
    public int f1502k = 1;

    /* renamed from: l */
    public C0302n f1503l = null;

    /* renamed from: m */
    public int f1504m = 1;

    public C0301m(C0286e anchor) {
        this.f1494c = anchor;
    }

    public String toString() {
        if (this.f1507b != 1) {
            return "{ " + this.f1494c + " UNRESOLVED} type: " + mo2140m(this.f1499h);
        } else if (this.f1497f == this) {
            return "[" + this.f1494c + ", RESOLVED: " + this.f1498g + "]  type: " + mo2140m(this.f1499h);
        } else {
            return "[" + this.f1494c + ", RESOLVED: " + this.f1497f + ":" + this.f1498g + "] type: " + mo2140m(this.f1499h);
        }
    }

    /* renamed from: l */
    public void mo2139l(C0301m target, float offset) {
        int i = this.f1507b;
        if (i == 0 || !(this.f1497f == target || this.f1498g == offset)) {
            this.f1497f = target;
            this.f1498g = offset;
            if (i == 1) {
                mo2150c();
            }
            mo2149b();
        }
    }

    /* renamed from: m */
    public String mo2140m(int type) {
        if (type == 1) {
            return "DIRECT";
        }
        if (type == 2) {
            return "CENTER";
        }
        if (type == 3) {
            return "MATCH";
        }
        if (type == 4) {
            return "CHAIN";
        }
        if (type == 5) {
            return "BARRIER";
        }
        return "UNCONNECTED";
    }

    /* renamed from: f */
    public void mo2133f() {
        int i;
        C0301m mVar;
        C0301m mVar2;
        C0301m mVar3;
        C0301m mVar4;
        C0301m mVar5;
        C0301m mVar6;
        float distance;
        float percent;
        float distance2;
        C0301m mVar7;
        boolean isEndAnchor = true;
        if (this.f1507b != 1 && (i = this.f1499h) != 4) {
            C0302n nVar = this.f1501j;
            if (nVar != null) {
                if (nVar.f1507b == 1) {
                    this.f1496e = ((float) this.f1502k) * nVar.f1505c;
                } else {
                    return;
                }
            }
            C0302n nVar2 = this.f1503l;
            if (nVar2 != null) {
                if (nVar2.f1507b == 1) {
                    float f = nVar2.f1505c;
                } else {
                    return;
                }
            }
            if (i == 1 && ((mVar7 = this.f1495d) == null || mVar7.f1507b == 1)) {
                if (mVar7 == null) {
                    this.f1497f = this;
                    this.f1498g = this.f1496e;
                } else {
                    this.f1497f = mVar7.f1497f;
                    this.f1498g = mVar7.f1498g + this.f1496e;
                }
                mo2149b();
            } else if (i == 2 && (mVar4 = this.f1495d) != null && mVar4.f1507b == 1 && (mVar5 = this.f1500i) != null && (mVar6 = mVar5.f1495d) != null && mVar6.f1507b == 1) {
                if (C0275e.m1452x() != null) {
                    C0275e.m1452x().f1312v++;
                }
                C0301m mVar8 = this.f1495d;
                this.f1497f = mVar8.f1497f;
                C0301m mVar9 = this.f1500i;
                C0301m mVar10 = mVar9.f1495d;
                mVar9.f1497f = mVar10.f1497f;
                C0286e eVar = this.f1494c;
                C0286e.C0290d dVar = eVar.f1358c;
                C0286e.C0290d dVar2 = C0286e.C0290d.RIGHT;
                if (!(dVar == dVar2 || dVar == C0286e.C0290d.BOTTOM)) {
                    isEndAnchor = false;
                }
                if (isEndAnchor) {
                    distance = mVar8.f1498g - mVar10.f1498g;
                } else {
                    distance = mVar10.f1498g - mVar8.f1498g;
                }
                if (dVar == C0286e.C0290d.LEFT || dVar == dVar2) {
                    distance2 = distance - ((float) eVar.f1357b.mo2022D());
                    percent = this.f1494c.f1357b.f1405V;
                } else {
                    distance2 = distance - ((float) eVar.f1357b.mo2079r());
                    percent = this.f1494c.f1357b.f1406W;
                }
                int margin = this.f1494c.mo2004d();
                int oppositeMargin = this.f1500i.f1494c.mo2004d();
                if (this.f1494c.mo2009i() == this.f1500i.f1494c.mo2009i()) {
                    percent = 0.5f;
                    margin = 0;
                    oppositeMargin = 0;
                }
                float distance3 = (distance2 - ((float) margin)) - ((float) oppositeMargin);
                if (isEndAnchor) {
                    C0301m mVar11 = this.f1500i;
                    mVar11.f1498g = mVar11.f1495d.f1498g + ((float) oppositeMargin) + (distance3 * percent);
                    this.f1498g = (this.f1495d.f1498g - ((float) margin)) - ((1.0f - percent) * distance3);
                } else {
                    this.f1498g = this.f1495d.f1498g + ((float) margin) + (distance3 * percent);
                    C0301m mVar12 = this.f1500i;
                    mVar12.f1498g = (mVar12.f1495d.f1498g - ((float) oppositeMargin)) - ((1.0f - percent) * distance3);
                }
                mo2149b();
                this.f1500i.mo2149b();
            } else if (i == 3 && (mVar = this.f1495d) != null && mVar.f1507b == 1 && (mVar2 = this.f1500i) != null && (mVar3 = mVar2.f1495d) != null && mVar3.f1507b == 1) {
                if (C0275e.m1452x() != null) {
                    C0275e.m1452x().f1313w++;
                }
                C0301m mVar13 = this.f1495d;
                this.f1497f = mVar13.f1497f;
                C0301m mVar14 = this.f1500i;
                C0301m mVar15 = mVar14.f1495d;
                mVar14.f1497f = mVar15.f1497f;
                this.f1498g = mVar13.f1498g + this.f1496e;
                mVar14.f1498g = mVar15.f1498g + mVar14.f1496e;
                mo2149b();
                this.f1500i.mo2149b();
            } else if (i == 5) {
                this.f1494c.f1357b.mo1995U();
            }
        }
    }

    /* renamed from: p */
    public void mo2143p(int type) {
        this.f1499h = type;
    }

    /* renamed from: e */
    public void mo2132e() {
        super.mo2132e();
        this.f1495d = null;
        this.f1496e = 0.0f;
        this.f1501j = null;
        this.f1502k = 1;
        this.f1503l = null;
        this.f1504m = 1;
        this.f1497f = null;
        this.f1498g = 0.0f;
        this.f1500i = null;
        this.f1499h = 0;
    }

    /* renamed from: q */
    public void mo2144q() {
        C0286e targetAnchor = this.f1494c.mo2009i();
        if (targetAnchor != null) {
            if (targetAnchor.mo2009i() == this.f1494c) {
                this.f1499h = 4;
                targetAnchor.mo2006f().f1499h = 4;
            }
            int margin = this.f1494c.mo2004d();
            C0286e.C0290d dVar = this.f1494c.f1358c;
            if (dVar == C0286e.C0290d.RIGHT || dVar == C0286e.C0290d.BOTTOM) {
                margin = -margin;
            }
            mo2136i(targetAnchor.mo2006f(), margin);
        }
    }

    /* renamed from: h */
    public void mo2135h(int type, C0301m node, int offset) {
        this.f1499h = type;
        this.f1495d = node;
        this.f1496e = (float) offset;
        node.mo2148a(this);
    }

    /* renamed from: i */
    public void mo2136i(C0301m node, int offset) {
        this.f1495d = node;
        this.f1496e = (float) offset;
        node.mo2148a(this);
    }

    /* renamed from: j */
    public void mo2137j(C0301m node, int multiplier, C0302n dimension) {
        this.f1495d = node;
        node.mo2148a(this);
        this.f1501j = dimension;
        this.f1502k = multiplier;
        dimension.mo2148a(this);
    }

    /* renamed from: n */
    public void mo2141n(C0301m opposite, float oppositeOffset) {
        this.f1500i = opposite;
    }

    /* renamed from: o */
    public void mo2142o(C0301m opposite, int multiplier, C0302n dimension) {
        this.f1500i = opposite;
        this.f1503l = dimension;
        this.f1504m = multiplier;
    }

    /* renamed from: g */
    public void mo2134g(C0275e system) {
        C0280i sv = this.f1494c.mo2007g();
        C0301m mVar = this.f1497f;
        if (mVar == null) {
            system.mo1964f(sv, (int) (this.f1498g + 0.5f));
        } else {
            system.mo1963e(sv, system.mo1976r(mVar.f1494c), (int) (this.f1498g + 0.5f), 6);
        }
    }

    /* renamed from: k */
    public float mo2138k() {
        return this.f1498g;
    }
}
