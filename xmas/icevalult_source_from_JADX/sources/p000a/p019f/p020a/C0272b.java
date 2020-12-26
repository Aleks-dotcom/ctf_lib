package p000a.p019f.p020a;

import p000a.p019f.p020a.C0275e;
import p000a.p019f.p020a.C0280i;

/* renamed from: a.f.a.b */
public class C0272b implements C0275e.C0276a {

    /* renamed from: a */
    public C0280i f1265a = null;

    /* renamed from: b */
    public float f1266b = 0.0f;

    /* renamed from: c */
    public boolean f1267c;

    /* renamed from: d */
    public final C0271a f1268d;

    /* renamed from: e */
    public boolean f1269e = false;

    public C0272b(C0273c cache) {
        this.f1268d = new C0271a(this, cache);
    }

    /* renamed from: r */
    public boolean mo1945r() {
        C0280i iVar = this.f1265a;
        return iVar != null && (iVar.f1326g == C0280i.C0281a.UNRESTRICTED || this.f1266b >= 0.0f);
    }

    public String toString() {
        return mo1952x();
    }

    /* renamed from: x */
    public String mo1952x() {
        String s;
        String s2;
        if (this.f1265a == null) {
            s = "" + "0";
        } else {
            s = "" + this.f1265a;
        }
        String s3 = s + " = ";
        boolean addedVariable = false;
        if (this.f1266b != 0.0f) {
            s3 = s3 + this.f1266b;
            addedVariable = true;
        }
        int count = this.f1268d.f1254a;
        for (int i = 0; i < count; i++) {
            C0280i v = this.f1268d.mo1917h(i);
            if (v != null) {
                float amount = this.f1268d.mo1918i(i);
                if (amount != 0.0f) {
                    String name = v.toString();
                    if (!addedVariable) {
                        if (amount < 0.0f) {
                            s2 = s2 + "- ";
                            amount *= -1.0f;
                        }
                    } else if (amount > 0.0f) {
                        s2 = s2 + " + ";
                    } else {
                        s2 = s2 + " - ";
                        amount *= -1.0f;
                    }
                    if (amount == 1.0f) {
                        s2 = s2 + name;
                    } else {
                        s2 = s2 + amount + " " + name;
                    }
                    addedVariable = true;
                }
            }
        }
        if (addedVariable) {
            return s2;
        }
        return s2 + "0.0";
    }

    /* renamed from: w */
    public void mo1951w() {
        this.f1265a = null;
        this.f1268d.mo1912c();
        this.f1266b = 0.0f;
        this.f1269e = false;
    }

    /* renamed from: s */
    public boolean mo1946s(C0280i v) {
        return this.f1268d.mo1913d(v);
    }

    /* renamed from: h */
    public C0272b mo1935h(C0280i variable, int value) {
        this.f1265a = variable;
        variable.f1324e = (float) value;
        this.f1266b = (float) value;
        this.f1269e = true;
        return this;
    }

    /* renamed from: l */
    public C0272b mo1939l(C0280i variable, int value) {
        if (value < 0) {
            this.f1266b = (float) (value * -1);
            this.f1268d.mo1921l(variable, 1.0f);
        } else {
            this.f1266b = (float) value;
            this.f1268d.mo1921l(variable, -1.0f);
        }
        return this;
    }

    /* renamed from: m */
    public C0272b mo1940m(C0280i variableA, C0280i variableB, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f1266b = (float) m;
        }
        if (!inverse) {
            this.f1268d.mo1921l(variableA, -1.0f);
            this.f1268d.mo1921l(variableB, 1.0f);
        } else {
            this.f1268d.mo1921l(variableA, 1.0f);
            this.f1268d.mo1921l(variableB, -1.0f);
        }
        return this;
    }

    /* renamed from: e */
    public C0272b mo1931e(C0280i error, int sign) {
        this.f1268d.mo1921l(error, (float) sign);
        return this;
    }

    /* renamed from: n */
    public C0272b mo1941n(C0280i variableA, C0280i variableB, C0280i slack, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f1266b = (float) m;
        }
        if (!inverse) {
            this.f1268d.mo1921l(variableA, -1.0f);
            this.f1268d.mo1921l(variableB, 1.0f);
            this.f1268d.mo1921l(slack, 1.0f);
        } else {
            this.f1268d.mo1921l(variableA, 1.0f);
            this.f1268d.mo1921l(variableB, -1.0f);
            this.f1268d.mo1921l(slack, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C0272b mo1942o(C0280i variableA, C0280i variableB, C0280i slack, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f1266b = (float) m;
        }
        if (!inverse) {
            this.f1268d.mo1921l(variableA, -1.0f);
            this.f1268d.mo1921l(variableB, 1.0f);
            this.f1268d.mo1921l(slack, -1.0f);
        } else {
            this.f1268d.mo1921l(variableA, 1.0f);
            this.f1268d.mo1921l(variableB, -1.0f);
            this.f1268d.mo1921l(slack, 1.0f);
        }
        return this;
    }

    /* renamed from: k */
    public C0272b mo1938k(float currentWeight, float totalWeights, float nextWeight, C0280i variableStartA, C0280i variableEndA, C0280i variableStartB, C0280i variableEndB) {
        this.f1266b = 0.0f;
        if (totalWeights == 0.0f || currentWeight == nextWeight) {
            this.f1268d.mo1921l(variableStartA, 1.0f);
            this.f1268d.mo1921l(variableEndA, -1.0f);
            this.f1268d.mo1921l(variableEndB, 1.0f);
            this.f1268d.mo1921l(variableStartB, -1.0f);
        } else if (currentWeight == 0.0f) {
            this.f1268d.mo1921l(variableStartA, 1.0f);
            this.f1268d.mo1921l(variableEndA, -1.0f);
        } else if (nextWeight == 0.0f) {
            this.f1268d.mo1921l(variableStartB, 1.0f);
            this.f1268d.mo1921l(variableEndB, -1.0f);
        } else {
            float w = (currentWeight / totalWeights) / (nextWeight / totalWeights);
            this.f1268d.mo1921l(variableStartA, 1.0f);
            this.f1268d.mo1921l(variableEndA, -1.0f);
            this.f1268d.mo1921l(variableEndB, w);
            this.f1268d.mo1921l(variableStartB, -w);
        }
        return this;
    }

    /* renamed from: g */
    public C0272b mo1933g(C0280i variableA, C0280i variableB, int marginA, float bias, C0280i variableC, C0280i variableD, int marginB) {
        if (variableB == variableC) {
            this.f1268d.mo1921l(variableA, 1.0f);
            this.f1268d.mo1921l(variableD, 1.0f);
            this.f1268d.mo1921l(variableB, -2.0f);
            return this;
        }
        if (bias == 0.5f) {
            this.f1268d.mo1921l(variableA, 1.0f);
            this.f1268d.mo1921l(variableB, -1.0f);
            this.f1268d.mo1921l(variableC, -1.0f);
            this.f1268d.mo1921l(variableD, 1.0f);
            if (marginA > 0 || marginB > 0) {
                this.f1266b = (float) ((-marginA) + marginB);
            }
        } else if (bias <= 0.0f) {
            this.f1268d.mo1921l(variableA, -1.0f);
            this.f1268d.mo1921l(variableB, 1.0f);
            this.f1266b = (float) marginA;
        } else if (bias >= 1.0f) {
            this.f1268d.mo1921l(variableC, -1.0f);
            this.f1268d.mo1921l(variableD, 1.0f);
            this.f1266b = (float) marginB;
        } else {
            this.f1268d.mo1921l(variableA, (1.0f - bias) * 1.0f);
            this.f1268d.mo1921l(variableB, (1.0f - bias) * -1.0f);
            this.f1268d.mo1921l(variableC, -1.0f * bias);
            this.f1268d.mo1921l(variableD, bias * 1.0f);
            if (marginA > 0 || marginB > 0) {
                this.f1266b = (((float) (-marginA)) * (1.0f - bias)) + (((float) marginB) * bias);
            }
        }
        return this;
    }

    /* renamed from: d */
    public C0272b mo1930d(C0275e system, int strength) {
        this.f1268d.mo1921l(system.mo1974p(strength, "ep"), 1.0f);
        this.f1268d.mo1921l(system.mo1974p(strength, "em"), -1.0f);
        return this;
    }

    /* renamed from: i */
    public C0272b mo1936i(C0280i variableA, C0280i variableB, C0280i variableC, float percent) {
        this.f1268d.mo1921l(variableA, -1.0f);
        this.f1268d.mo1921l(variableB, 1.0f - percent);
        this.f1268d.mo1921l(variableC, percent);
        return this;
    }

    /* renamed from: j */
    public C0272b mo1937j(C0280i variableA, C0280i variableB, C0280i variableC, C0280i variableD, float ratio) {
        this.f1268d.mo1921l(variableA, -1.0f);
        this.f1268d.mo1921l(variableB, 1.0f);
        this.f1268d.mo1921l(variableC, ratio);
        this.f1268d.mo1921l(variableD, -ratio);
        return this;
    }

    /* renamed from: p */
    public C0272b mo1943p(C0280i at, C0280i ab, C0280i bt, C0280i bb, float angleComponent) {
        this.f1268d.mo1921l(bt, 0.5f);
        this.f1268d.mo1921l(bb, 0.5f);
        this.f1268d.mo1921l(at, -0.5f);
        this.f1268d.mo1921l(ab, -0.5f);
        this.f1266b = -angleComponent;
        return this;
    }

    /* renamed from: q */
    public void mo1944q() {
        float f = this.f1266b;
        if (f < 0.0f) {
            this.f1266b = f * -1.0f;
            this.f1268d.mo1919j();
        }
    }

    /* renamed from: f */
    public boolean mo1932f(C0275e system) {
        boolean addedExtra = false;
        C0280i pivotCandidate = this.f1268d.mo1911b(system);
        if (pivotCandidate == null) {
            addedExtra = true;
        } else {
            mo1950v(pivotCandidate);
        }
        if (this.f1268d.f1254a == 0) {
            this.f1269e = true;
        }
        return addedExtra;
    }

    /* renamed from: u */
    public C0280i mo1949u(C0280i exclude) {
        return this.f1268d.mo1916g((boolean[]) null, exclude);
    }

    /* renamed from: v */
    public void mo1950v(C0280i v) {
        C0280i iVar = this.f1265a;
        if (iVar != null) {
            this.f1268d.mo1921l(iVar, -1.0f);
            this.f1265a = null;
        }
        float amount = this.f1268d.mo1922m(v, true) * -1.0f;
        this.f1265a = v;
        if (amount != 1.0f) {
            this.f1266b /= amount;
            this.f1268d.mo1914e(amount);
        }
    }

    /* renamed from: t */
    public boolean mo1947t() {
        return this.f1265a == null && this.f1266b == 0.0f && this.f1268d.f1254a == 0;
    }

    /* renamed from: c */
    public C0280i mo1928c(C0275e system, boolean[] avoid) {
        return this.f1268d.mo1916g(avoid, (C0280i) null);
    }

    public void clear() {
        this.f1268d.mo1912c();
        this.f1265a = null;
        this.f1266b = 0.0f;
    }

    /* renamed from: b */
    public void mo1927b(C0275e.C0276a row) {
        if (row instanceof C0272b) {
            C0272b copiedRow = (C0272b) row;
            this.f1265a = null;
            this.f1268d.mo1912c();
            int i = 0;
            while (true) {
                C0271a aVar = copiedRow.f1268d;
                if (i < aVar.f1254a) {
                    this.f1268d.mo1910a(aVar.mo1917h(i), copiedRow.f1268d.mo1918i(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1926a(C0280i error) {
        float weight = 1.0f;
        int i = error.f1323d;
        if (i == 1) {
            weight = 1.0f;
        } else if (i == 2) {
            weight = 1000.0f;
        } else if (i == 3) {
            weight = 1000000.0f;
        } else if (i == 4) {
            weight = 1.0E9f;
        } else if (i == 5) {
            weight = 1.0E12f;
        }
        this.f1268d.mo1921l(error, weight);
    }

    public C0280i getKey() {
        return this.f1265a;
    }
}
