package p000a.p019f.p020a;

import java.util.Arrays;
import java.util.HashMap;
import p000a.p019f.p020a.C0280i;
import p000a.p019f.p020a.p021j.C0286e;
import p000a.p019f.p020a.p021j.C0291f;

/* renamed from: a.f.a.e */
public class C0275e {

    /* renamed from: p */
    public static int f1273p = 1000;

    /* renamed from: q */
    public static C0277f f1274q;

    /* renamed from: a */
    public int f1275a;

    /* renamed from: b */
    public HashMap<String, C0280i> f1276b;

    /* renamed from: c */
    public C0276a f1277c;

    /* renamed from: d */
    public int f1278d;

    /* renamed from: e */
    public int f1279e;

    /* renamed from: f */
    public C0272b[] f1280f;

    /* renamed from: g */
    public boolean f1281g;

    /* renamed from: h */
    public boolean[] f1282h;

    /* renamed from: i */
    public int f1283i;

    /* renamed from: j */
    public int f1284j;

    /* renamed from: k */
    public int f1285k;

    /* renamed from: l */
    public final C0273c f1286l;

    /* renamed from: m */
    public C0280i[] f1287m;

    /* renamed from: n */
    public int f1288n;

    /* renamed from: o */
    public final C0276a f1289o;

    /* renamed from: a.f.a.e$a */
    public interface C0276a {
        /* renamed from: a */
        void mo1926a(C0280i iVar);

        /* renamed from: b */
        void mo1927b(C0276a aVar);

        /* renamed from: c */
        C0280i mo1928c(C0275e eVar, boolean[] zArr);

        void clear();

        C0280i getKey();
    }

    public C0275e() {
        this.f1275a = 0;
        this.f1276b = null;
        this.f1278d = 32;
        this.f1279e = 32;
        this.f1280f = null;
        this.f1281g = false;
        this.f1282h = new boolean[32];
        this.f1283i = 1;
        this.f1284j = 0;
        this.f1285k = 32;
        this.f1287m = new C0280i[f1273p];
        this.f1288n = 0;
        this.f1280f = new C0272b[32];
        mo1956D();
        C0273c cVar = new C0273c();
        this.f1286l = cVar;
        this.f1277c = new C0274d(cVar);
        this.f1289o = new C0272b(cVar);
    }

    /* renamed from: x */
    public static C0277f m1452x() {
        return f1274q;
    }

    /* renamed from: z */
    public final void mo1982z() {
        int i = this.f1278d * 2;
        this.f1278d = i;
        this.f1280f = (C0272b[]) Arrays.copyOf(this.f1280f, i);
        C0273c cVar = this.f1286l;
        cVar.f1272c = (C0280i[]) Arrays.copyOf(cVar.f1272c, this.f1278d);
        int i2 = this.f1278d;
        this.f1282h = new boolean[i2];
        this.f1279e = i2;
        this.f1285k = i2;
        C0277f fVar = f1274q;
        if (fVar != null) {
            fVar.f1294d++;
            fVar.f1305o = Math.max(fVar.f1305o, (long) i2);
            C0277f fVar2 = f1274q;
            fVar2.f1290A = fVar2.f1305o;
        }
    }

    /* renamed from: D */
    public final void mo1956D() {
        int i = 0;
        while (true) {
            C0272b[] bVarArr = this.f1280f;
            if (i < bVarArr.length) {
                C0272b row = bVarArr[i];
                if (row != null) {
                    this.f1286l.f1270a.mo1983a(row);
                }
                this.f1280f[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: E */
    public void mo1957E() {
        C0273c cVar;
        int i = 0;
        while (true) {
            cVar = this.f1286l;
            C0280i[] iVarArr = cVar.f1272c;
            if (i >= iVarArr.length) {
                break;
            }
            C0280i variable = iVarArr[i];
            if (variable != null) {
                variable.mo1988d();
            }
            i++;
        }
        cVar.f1271b.mo1985c(this.f1287m, this.f1288n);
        this.f1288n = 0;
        Arrays.fill(this.f1286l.f1272c, (Object) null);
        HashMap<String, C0280i> hashMap = this.f1276b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f1275a = 0;
        this.f1277c.clear();
        this.f1283i = 1;
        for (int i2 = 0; i2 < this.f1284j; i2++) {
            this.f1280f[i2].f1267c = false;
        }
        mo1956D();
        this.f1284j = 0;
    }

    /* renamed from: r */
    public C0280i mo1976r(Object anchor) {
        if (anchor == null) {
            return null;
        }
        if (this.f1283i + 1 >= this.f1279e) {
            mo1982z();
        }
        C0280i variable = null;
        if (anchor instanceof C0286e) {
            variable = ((C0286e) anchor).mo2007g();
            if (variable == null) {
                ((C0286e) anchor).mo2014n(this.f1286l);
                variable = ((C0286e) anchor).mo2007g();
            }
            int i = variable.f1321b;
            if (i == -1 || i > this.f1275a || this.f1286l.f1272c[i] == null) {
                if (i != -1) {
                    variable.mo1988d();
                }
                int i2 = this.f1275a + 1;
                this.f1275a = i2;
                this.f1283i++;
                variable.f1321b = i2;
                variable.f1326g = C0280i.C0281a.UNRESTRICTED;
                this.f1286l.f1272c[i2] = variable;
            }
        }
        return variable;
    }

    /* renamed from: s */
    public C0272b mo1977s() {
        C0272b row = this.f1286l.f1270a.mo1984b();
        if (row == null) {
            row = new C0272b(this.f1286l);
        } else {
            row.mo1951w();
        }
        C0280i.m1492b();
        return row;
    }

    /* renamed from: u */
    public C0280i mo1978u() {
        C0277f fVar = f1274q;
        if (fVar != null) {
            fVar.f1303m++;
        }
        if (this.f1283i + 1 >= this.f1279e) {
            mo1982z();
        }
        C0280i variable = mo1959a(C0280i.C0281a.SLACK, (String) null);
        int i = this.f1275a + 1;
        this.f1275a = i;
        this.f1283i++;
        variable.f1321b = i;
        this.f1286l.f1272c[i] = variable;
        return variable;
    }

    /* renamed from: q */
    public C0280i mo1975q() {
        C0277f fVar = f1274q;
        if (fVar != null) {
            fVar.f1304n++;
        }
        if (this.f1283i + 1 >= this.f1279e) {
            mo1982z();
        }
        C0280i variable = mo1959a(C0280i.C0281a.SLACK, (String) null);
        int i = this.f1275a + 1;
        this.f1275a = i;
        this.f1283i++;
        variable.f1321b = i;
        this.f1286l.f1272c[i] = variable;
        return variable;
    }

    /* renamed from: g */
    public final void mo1965g(C0272b row) {
        row.mo1930d(this, 0);
    }

    /* renamed from: n */
    public void mo1972n(C0272b row, int sign, int strength) {
        row.mo1931e(mo1974p(strength, (String) null), sign);
    }

    /* renamed from: p */
    public C0280i mo1974p(int strength, String prefix) {
        C0277f fVar = f1274q;
        if (fVar != null) {
            fVar.f1302l++;
        }
        if (this.f1283i + 1 >= this.f1279e) {
            mo1982z();
        }
        C0280i variable = mo1959a(C0280i.C0281a.ERROR, prefix);
        int i = this.f1275a + 1;
        this.f1275a = i;
        this.f1283i++;
        variable.f1321b = i;
        variable.f1323d = strength;
        this.f1286l.f1272c[i] = variable;
        this.f1277c.mo1926a(variable);
        return variable;
    }

    /* renamed from: a */
    public final C0280i mo1959a(C0280i.C0281a type, String prefix) {
        C0280i variable = this.f1286l.f1271b.mo1984b();
        if (variable == null) {
            variable = new C0280i(type, prefix);
            variable.mo1989e(type, prefix);
        } else {
            variable.mo1988d();
            variable.mo1989e(type, prefix);
        }
        int i = this.f1288n;
        int i2 = f1273p;
        if (i >= i2) {
            int i3 = i2 * 2;
            f1273p = i3;
            this.f1287m = (C0280i[]) Arrays.copyOf(this.f1287m, i3);
        }
        C0280i[] iVarArr = this.f1287m;
        int i4 = this.f1288n;
        this.f1288n = i4 + 1;
        iVarArr[i4] = variable;
        return variable;
    }

    /* renamed from: y */
    public int mo1981y(Object anchor) {
        C0280i variable = ((C0286e) anchor).mo2007g();
        if (variable != null) {
            return (int) (variable.f1324e + 0.5f);
        }
        return 0;
    }

    /* renamed from: A */
    public void mo1953A() {
        C0277f fVar = f1274q;
        if (fVar != null) {
            fVar.f1295e++;
        }
        if (this.f1281g) {
            if (fVar != null) {
                fVar.f1307q++;
            }
            boolean fullySolved = true;
            int i = 0;
            while (true) {
                if (i >= this.f1284j) {
                    break;
                } else if (!this.f1280f[i].f1269e) {
                    fullySolved = false;
                    break;
                } else {
                    i++;
                }
            }
            if (!fullySolved) {
                mo1954B(this.f1277c);
                return;
            }
            C0277f fVar2 = f1274q;
            if (fVar2 != null) {
                fVar2.f1306p++;
            }
            mo1973o();
            return;
        }
        mo1954B(this.f1277c);
    }

    /* renamed from: B */
    public void mo1954B(C0276a goal) {
        C0277f fVar = f1274q;
        if (fVar != null) {
            fVar.f1309s++;
            fVar.f1310t = Math.max(fVar.f1310t, (long) this.f1283i);
            C0277f fVar2 = f1274q;
            fVar2.f1311u = Math.max(fVar2.f1311u, (long) this.f1284j);
        }
        mo1958F((C0272b) goal);
        mo1979v(goal);
        mo1955C(goal, false);
        mo1973o();
    }

    /* renamed from: F */
    public final void mo1958F(C0272b row) {
        if (this.f1284j > 0) {
            row.f1268d.mo1924o(row, this.f1280f);
            if (row.f1268d.f1254a == 0) {
                row.f1269e = true;
            }
        }
    }

    /* renamed from: d */
    public void mo1962d(C0272b row) {
        C0280i pivotCandidate;
        if (row != null) {
            C0277f fVar = f1274q;
            if (fVar != null) {
                fVar.f1296f++;
                if (row.f1269e) {
                    fVar.f1297g++;
                }
            }
            if (this.f1284j + 1 >= this.f1285k || this.f1283i + 1 >= this.f1279e) {
                mo1982z();
            }
            boolean added = false;
            if (!row.f1269e) {
                mo1958F(row);
                if (!row.mo1947t()) {
                    row.mo1944q();
                    if (row.mo1932f(this)) {
                        C0280i extra = mo1975q();
                        row.f1265a = extra;
                        mo1971m(row);
                        added = true;
                        this.f1289o.mo1927b(row);
                        mo1955C(this.f1289o, true);
                        if (extra.f1322c == -1) {
                            if (row.f1265a == extra && (pivotCandidate = row.mo1949u(extra)) != null) {
                                C0277f fVar2 = f1274q;
                                if (fVar2 != null) {
                                    fVar2.f1300j++;
                                }
                                row.mo1950v(pivotCandidate);
                            }
                            if (!row.f1269e) {
                                row.f1265a.mo1990f(row);
                            }
                            this.f1284j--;
                        }
                    }
                    if (!row.mo1945r()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!added) {
                mo1971m(row);
            }
        }
    }

    /* renamed from: m */
    public final void mo1971m(C0272b row) {
        C0272b[] bVarArr = this.f1280f;
        int i = this.f1284j;
        if (bVarArr[i] != null) {
            this.f1286l.f1270a.mo1983a(bVarArr[i]);
        }
        C0272b[] bVarArr2 = this.f1280f;
        int i2 = this.f1284j;
        bVarArr2[i2] = row;
        C0280i iVar = row.f1265a;
        iVar.f1322c = i2;
        this.f1284j = i2 + 1;
        iVar.mo1990f(row);
    }

    /* renamed from: C */
    public final int mo1955C(C0276a goal, boolean b) {
        C0277f fVar = f1274q;
        if (fVar != null) {
            fVar.f1298h++;
        }
        boolean done = false;
        int tries = 0;
        for (int i = 0; i < this.f1283i; i++) {
            this.f1282h[i] = false;
        }
        while (!done) {
            C0277f fVar2 = f1274q;
            if (fVar2 != null) {
                fVar2.f1299i++;
            }
            tries++;
            if (tries >= this.f1283i * 2) {
                return tries;
            }
            if (goal.getKey() != null) {
                this.f1282h[goal.getKey().f1321b] = true;
            }
            C0280i pivotCandidate = goal.mo1928c(this, this.f1282h);
            if (pivotCandidate != null) {
                boolean[] zArr = this.f1282h;
                int i2 = pivotCandidate.f1321b;
                if (zArr[i2]) {
                    return tries;
                }
                zArr[i2] = true;
            }
            if (pivotCandidate != null) {
                float min = Float.MAX_VALUE;
                int pivotRowIndex = -1;
                for (int i3 = 0; i3 < this.f1284j; i3++) {
                    C0272b current = this.f1280f[i3];
                    if (current.f1265a.f1326g != C0280i.C0281a.UNRESTRICTED && !current.f1269e && current.mo1946s(pivotCandidate)) {
                        float a_j = current.f1268d.mo1915f(pivotCandidate);
                        if (a_j < 0.0f) {
                            float value = (-current.f1266b) / a_j;
                            if (value < min) {
                                min = value;
                                pivotRowIndex = i3;
                            }
                        }
                    }
                }
                if (pivotRowIndex > -1) {
                    C0272b pivotEquation = this.f1280f[pivotRowIndex];
                    pivotEquation.f1265a.f1322c = -1;
                    C0277f fVar3 = f1274q;
                    if (fVar3 != null) {
                        fVar3.f1300j++;
                    }
                    pivotEquation.mo1950v(pivotCandidate);
                    C0280i iVar = pivotEquation.f1265a;
                    iVar.f1322c = pivotRowIndex;
                    iVar.mo1990f(pivotEquation);
                } else {
                    done = true;
                }
            } else {
                done = true;
            }
        }
        return tries;
    }

    /* renamed from: v */
    public final int mo1979v(C0276a goal) {
        float f;
        int tries = 0;
        boolean infeasibleSystem = false;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f1284j) {
                break;
            }
            C0272b[] bVarArr = this.f1280f;
            if (bVarArr[i].f1265a.f1326g != C0280i.C0281a.UNRESTRICTED && bVarArr[i].f1266b < 0.0f) {
                infeasibleSystem = true;
                break;
            }
            i++;
        }
        if (infeasibleSystem) {
            boolean done = false;
            tries = 0;
            while (!done) {
                C0277f fVar = f1274q;
                if (fVar != null) {
                    fVar.f1301k++;
                }
                tries++;
                float min = Float.MAX_VALUE;
                int strength = 0;
                int pivotRowIndex = -1;
                int pivotColumnIndex = -1;
                int i2 = 0;
                while (i2 < this.f1284j) {
                    C0272b current = this.f1280f[i2];
                    if (current.f1265a.f1326g != C0280i.C0281a.UNRESTRICTED && !current.f1269e && current.f1266b < f) {
                        int j = 1;
                        while (j < this.f1283i) {
                            C0280i candidate = this.f1286l.f1272c[j];
                            float a_j = current.f1268d.mo1915f(candidate);
                            if (a_j > f) {
                                for (int k = 0; k < 7; k++) {
                                    float value = candidate.f1325f[k] / a_j;
                                    if ((value < min && k == strength) || k > strength) {
                                        min = value;
                                        pivotRowIndex = i2;
                                        pivotColumnIndex = j;
                                        strength = k;
                                    }
                                }
                            }
                            j++;
                            f = 0.0f;
                        }
                    }
                    i2++;
                    f = 0.0f;
                }
                if (pivotRowIndex != -1) {
                    C0272b pivotEquation = this.f1280f[pivotRowIndex];
                    pivotEquation.f1265a.f1322c = -1;
                    C0277f fVar2 = f1274q;
                    if (fVar2 != null) {
                        fVar2.f1300j++;
                    }
                    pivotEquation.mo1950v(this.f1286l.f1272c[pivotColumnIndex]);
                    C0280i iVar = pivotEquation.f1265a;
                    iVar.f1322c = pivotRowIndex;
                    iVar.mo1990f(pivotEquation);
                } else {
                    done = true;
                }
                if (tries > this.f1283i / 2) {
                    done = true;
                }
                f = 0.0f;
            }
        }
        return tries;
    }

    /* renamed from: o */
    public final void mo1973o() {
        for (int i = 0; i < this.f1284j; i++) {
            C0272b row = this.f1280f[i];
            row.f1265a.f1324e = row.f1266b;
        }
    }

    /* renamed from: w */
    public C0273c mo1980w() {
        return this.f1286l;
    }

    /* renamed from: i */
    public void mo1967i(C0280i a, C0280i b, int margin, int strength) {
        C0272b row = mo1977s();
        C0280i slack = mo1978u();
        slack.f1323d = 0;
        row.mo1941n(a, b, slack, margin);
        if (strength != 6) {
            mo1972n(row, (int) (-1.0f * row.f1268d.mo1915f(slack)), strength);
        }
        mo1962d(row);
    }

    /* renamed from: h */
    public void mo1966h(C0280i a, C0280i b, boolean hasMatchConstraintWidgets) {
        C0272b row = mo1977s();
        C0280i slack = mo1978u();
        slack.f1323d = 0;
        row.mo1941n(a, b, slack, 0);
        if (hasMatchConstraintWidgets) {
            mo1972n(row, (int) (-1.0f * row.f1268d.mo1915f(slack)), 1);
        }
        mo1962d(row);
    }

    /* renamed from: k */
    public void mo1969k(C0280i a, C0280i b, int margin, int strength) {
        C0272b row = mo1977s();
        C0280i slack = mo1978u();
        slack.f1323d = 0;
        row.mo1942o(a, b, slack, margin);
        if (strength != 6) {
            mo1972n(row, (int) (-1.0f * row.f1268d.mo1915f(slack)), strength);
        }
        mo1962d(row);
    }

    /* renamed from: j */
    public void mo1968j(C0280i a, C0280i b, boolean hasMatchConstraintWidgets) {
        C0272b row = mo1977s();
        C0280i slack = mo1978u();
        slack.f1323d = 0;
        row.mo1942o(a, b, slack, 0);
        if (hasMatchConstraintWidgets) {
            mo1972n(row, (int) (-1.0f * row.f1268d.mo1915f(slack)), 1);
        }
        mo1962d(row);
    }

    /* renamed from: c */
    public void mo1961c(C0280i a, C0280i b, int m1, float bias, C0280i c, C0280i d, int m2, int strength) {
        int i = strength;
        C0272b row = mo1977s();
        row.mo1933g(a, b, m1, bias, c, d, m2);
        if (i != 6) {
            row.mo1930d(this, i);
        }
        mo1962d(row);
    }

    /* renamed from: l */
    public void mo1970l(C0280i a, C0280i b, C0280i c, C0280i d, float ratio, int strength) {
        C0272b row = mo1977s();
        row.mo1937j(a, b, c, d, ratio);
        if (strength != 6) {
            row.mo1930d(this, strength);
        }
        mo1962d(row);
    }

    /* renamed from: e */
    public C0272b mo1963e(C0280i a, C0280i b, int margin, int strength) {
        C0272b row = mo1977s();
        row.mo1940m(a, b, margin);
        if (strength != 6) {
            row.mo1930d(this, strength);
        }
        mo1962d(row);
        return row;
    }

    /* renamed from: f */
    public void mo1964f(C0280i a, int value) {
        int idx = a.f1322c;
        if (a.f1322c != -1) {
            C0272b row = this.f1280f[idx];
            if (row.f1269e) {
                row.f1266b = (float) value;
            } else if (row.f1268d.f1254a == 0) {
                row.f1269e = true;
                row.f1266b = (float) value;
            } else {
                C0272b newRow = mo1977s();
                newRow.mo1939l(a, value);
                mo1962d(newRow);
            }
        } else {
            C0272b row2 = mo1977s();
            row2.mo1935h(a, value);
            mo1962d(row2);
        }
    }

    /* renamed from: t */
    public static C0272b m1451t(C0275e linearSystem, C0280i variableA, C0280i variableB, C0280i variableC, float percent, boolean withError) {
        C0272b row = linearSystem.mo1977s();
        if (withError) {
            linearSystem.mo1965g(row);
        }
        row.mo1936i(variableA, variableB, variableC, percent);
        return row;
    }

    /* renamed from: b */
    public void mo1960b(C0291f widget, C0291f target, float angle, int radius) {
        C0291f fVar = widget;
        C0291f fVar2 = target;
        float f = angle;
        int i = radius;
        C0286e.C0290d dVar = C0286e.C0290d.LEFT;
        C0280i Al = mo1976r(fVar.mo2059h(dVar));
        C0286e.C0290d dVar2 = C0286e.C0290d.TOP;
        C0280i At = mo1976r(fVar.mo2059h(dVar2));
        C0286e.C0290d dVar3 = C0286e.C0290d.RIGHT;
        C0280i Ar = mo1976r(fVar.mo2059h(dVar3));
        C0286e.C0290d dVar4 = C0286e.C0290d.BOTTOM;
        C0280i Ab = mo1976r(fVar.mo2059h(dVar4));
        C0280i Bl = mo1976r(fVar2.mo2059h(dVar));
        C0280i Bt = mo1976r(fVar2.mo2059h(dVar2));
        C0280i Br = mo1976r(fVar2.mo2059h(dVar3));
        C0280i Bb = mo1976r(fVar2.mo2059h(dVar4));
        C0272b row = mo1977s();
        row.mo1943p(At, Ab, Bt, Bb, (float) (Math.sin((double) f) * ((double) i)));
        mo1962d(row);
        C0272b row2 = mo1977s();
        row2.mo1943p(Al, Ar, Bl, Br, (float) (Math.cos((double) f) * ((double) i)));
        mo1962d(row2);
    }
}
