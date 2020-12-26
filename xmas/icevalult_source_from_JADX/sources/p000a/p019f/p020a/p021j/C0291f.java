package p000a.p019f.p020a.p021j;

import java.util.ArrayList;
import p000a.p019f.p020a.C0272b;
import p000a.p019f.p020a.C0273c;
import p000a.p019f.p020a.C0275e;
import p000a.p019f.p020a.C0280i;
import p000a.p019f.p020a.p021j.C0286e;

/* renamed from: a.f.a.j.f */
public class C0291f {

    /* renamed from: j0 */
    public static float f1383j0 = 0.5f;

    /* renamed from: A */
    public C0286e[] f1384A;

    /* renamed from: B */
    public ArrayList<C0286e> f1385B;

    /* renamed from: C */
    public C0293b[] f1386C;

    /* renamed from: D */
    public C0291f f1387D;

    /* renamed from: E */
    public int f1388E;

    /* renamed from: F */
    public int f1389F;

    /* renamed from: G */
    public float f1390G;

    /* renamed from: H */
    public int f1391H;

    /* renamed from: I */
    public int f1392I;

    /* renamed from: J */
    public int f1393J;

    /* renamed from: K */
    public int f1394K;

    /* renamed from: L */
    public int f1395L;

    /* renamed from: M */
    public int f1396M;

    /* renamed from: N */
    public int f1397N;

    /* renamed from: O */
    public int f1398O;

    /* renamed from: P */
    public int f1399P;

    /* renamed from: Q */
    public int f1400Q;

    /* renamed from: R */
    public int f1401R;

    /* renamed from: S */
    public int f1402S;

    /* renamed from: T */
    public int f1403T;

    /* renamed from: U */
    public int f1404U;

    /* renamed from: V */
    public float f1405V;

    /* renamed from: W */
    public float f1406W;

    /* renamed from: X */
    public Object f1407X;

    /* renamed from: Y */
    public int f1408Y;

    /* renamed from: Z */
    public String f1409Z;

    /* renamed from: a */
    public int f1410a = -1;

    /* renamed from: a0 */
    public String f1411a0;

    /* renamed from: b */
    public int f1412b = -1;

    /* renamed from: b0 */
    public boolean f1413b0;

    /* renamed from: c */
    public C0302n f1414c;

    /* renamed from: c0 */
    public boolean f1415c0;

    /* renamed from: d */
    public C0302n f1416d;

    /* renamed from: d0 */
    public boolean f1417d0;

    /* renamed from: e */
    public int f1418e = 0;

    /* renamed from: e0 */
    public int f1419e0;

    /* renamed from: f */
    public int f1420f = 0;

    /* renamed from: f0 */
    public int f1421f0;

    /* renamed from: g */
    public int[] f1422g = new int[2];

    /* renamed from: g0 */
    public float[] f1423g0;

    /* renamed from: h */
    public int f1424h = 0;

    /* renamed from: h0 */
    public C0291f[] f1425h0;

    /* renamed from: i */
    public int f1426i = 0;

    /* renamed from: i0 */
    public C0291f[] f1427i0;

    /* renamed from: j */
    public float f1428j = 1.0f;

    /* renamed from: k */
    public int f1429k = 0;

    /* renamed from: l */
    public int f1430l = 0;

    /* renamed from: m */
    public float f1431m = 1.0f;

    /* renamed from: n */
    public int f1432n = -1;

    /* renamed from: o */
    public float f1433o = 1.0f;

    /* renamed from: p */
    public C0295h f1434p = null;

    /* renamed from: q */
    public int[] f1435q = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: r */
    public float f1436r = 0.0f;

    /* renamed from: s */
    public C0286e f1437s = new C0286e(this, C0286e.C0290d.LEFT);

    /* renamed from: t */
    public C0286e f1438t = new C0286e(this, C0286e.C0290d.TOP);

    /* renamed from: u */
    public C0286e f1439u = new C0286e(this, C0286e.C0290d.RIGHT);

    /* renamed from: v */
    public C0286e f1440v = new C0286e(this, C0286e.C0290d.BOTTOM);

    /* renamed from: w */
    public C0286e f1441w = new C0286e(this, C0286e.C0290d.BASELINE);

    /* renamed from: x */
    public C0286e f1442x = new C0286e(this, C0286e.C0290d.CENTER_X);

    /* renamed from: y */
    public C0286e f1443y = new C0286e(this, C0286e.C0290d.CENTER_Y);

    /* renamed from: z */
    public C0286e f1444z;

    /* renamed from: a.f.a.j.f$b */
    public enum C0293b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    /* renamed from: k0 */
    public void mo2066k0(int maxWidth) {
        this.f1435q[0] = maxWidth;
    }

    /* renamed from: j0 */
    public void mo2064j0(int maxHeight) {
        this.f1435q[1] = maxHeight;
    }

    /* renamed from: P */
    public boolean mo2039P() {
        return this.f1418e == 0 && this.f1390G == 0.0f && this.f1424h == 0 && this.f1426i == 0 && this.f1386C[0] == C0293b.MATCH_CONSTRAINT;
    }

    /* renamed from: O */
    public boolean mo2038O() {
        return this.f1420f == 0 && this.f1390G == 0.0f && this.f1429k == 0 && this.f1430l == 0 && this.f1386C[1] == C0293b.MATCH_CONSTRAINT;
    }

    /* renamed from: Q */
    public void mo2040Q() {
        this.f1437s.mo2013m();
        this.f1438t.mo2013m();
        this.f1439u.mo2013m();
        this.f1440v.mo2013m();
        this.f1441w.mo2013m();
        this.f1442x.mo2013m();
        this.f1443y.mo2013m();
        this.f1444z.mo2013m();
        this.f1387D = null;
        this.f1436r = 0.0f;
        this.f1388E = 0;
        this.f1389F = 0;
        this.f1390G = 0.0f;
        this.f1391H = -1;
        this.f1392I = 0;
        this.f1393J = 0;
        this.f1396M = 0;
        this.f1397N = 0;
        this.f1398O = 0;
        this.f1399P = 0;
        this.f1400Q = 0;
        this.f1401R = 0;
        this.f1402S = 0;
        this.f1403T = 0;
        this.f1404U = 0;
        float f = f1383j0;
        this.f1405V = f;
        this.f1406W = f;
        C0293b[] bVarArr = this.f1386C;
        C0293b bVar = C0293b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f1407X = null;
        this.f1408Y = 0;
        this.f1411a0 = null;
        this.f1419e0 = 0;
        this.f1421f0 = 0;
        float[] fArr = this.f1423g0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f1410a = -1;
        this.f1412b = -1;
        int[] iArr = this.f1435q;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f1418e = 0;
        this.f1420f = 0;
        this.f1428j = 1.0f;
        this.f1431m = 1.0f;
        this.f1426i = Integer.MAX_VALUE;
        this.f1430l = Integer.MAX_VALUE;
        this.f1424h = 0;
        this.f1429k = 0;
        this.f1432n = -1;
        this.f1433o = 1.0f;
        C0302n nVar = this.f1414c;
        if (nVar != null) {
            nVar.mo2132e();
        }
        C0302n nVar2 = this.f1416d;
        if (nVar2 != null) {
            nVar2.mo2132e();
        }
        this.f1434p = null;
        this.f1413b0 = false;
        this.f1415c0 = false;
        this.f1417d0 = false;
    }

    /* renamed from: S */
    public void mo1994S() {
        for (int i = 0; i < 6; i++) {
            this.f1384A[i].mo2006f().mo2132e();
        }
    }

    /* renamed from: H0 */
    public void mo2031H0() {
        for (int i = 0; i < 6; i++) {
            this.f1384A[i].mo2006f().mo2144q();
        }
    }

    /* renamed from: d */
    public void mo1998d(int optimizationLevel) {
        C0299k.m1664a(optimizationLevel, this);
    }

    /* renamed from: U */
    public void mo1995U() {
    }

    /* renamed from: L */
    public boolean mo2035L() {
        if (this.f1437s.mo2006f().f1507b == 1 && this.f1439u.mo2006f().f1507b == 1 && this.f1438t.mo2006f().f1507b == 1 && this.f1440v.mo2006f().f1507b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public C0302n mo2092x() {
        if (this.f1414c == null) {
            this.f1414c = new C0302n();
        }
        return this.f1414c;
    }

    /* renamed from: w */
    public C0302n mo2090w() {
        if (this.f1416d == null) {
            this.f1416d = new C0302n();
        }
        return this.f1416d;
    }

    public C0291f() {
        C0286e eVar = new C0286e(this, C0286e.C0290d.CENTER);
        this.f1444z = eVar;
        this.f1384A = new C0286e[]{this.f1437s, this.f1439u, this.f1438t, this.f1440v, this.f1441w, eVar};
        this.f1385B = new ArrayList<>();
        C0293b bVar = C0293b.FIXED;
        this.f1386C = new C0293b[]{bVar, bVar};
        this.f1387D = null;
        this.f1388E = 0;
        this.f1389F = 0;
        this.f1390G = 0.0f;
        this.f1391H = -1;
        this.f1392I = 0;
        this.f1393J = 0;
        this.f1394K = 0;
        this.f1395L = 0;
        this.f1396M = 0;
        this.f1397N = 0;
        this.f1398O = 0;
        this.f1399P = 0;
        this.f1400Q = 0;
        float f = f1383j0;
        this.f1405V = f;
        this.f1406W = f;
        this.f1408Y = 0;
        this.f1409Z = null;
        this.f1411a0 = null;
        this.f1413b0 = false;
        this.f1415c0 = false;
        this.f1417d0 = false;
        this.f1419e0 = 0;
        this.f1421f0 = 0;
        this.f1423g0 = new float[]{-1.0f, -1.0f};
        this.f1425h0 = new C0291f[]{null, null};
        this.f1427i0 = new C0291f[]{null, null};
        mo2048a();
    }

    /* renamed from: T */
    public void mo2042T(C0273c cache) {
        this.f1437s.mo2014n(cache);
        this.f1438t.mo2014n(cache);
        this.f1439u.mo2014n(cache);
        this.f1440v.mo2014n(cache);
        this.f1441w.mo2014n(cache);
        this.f1444z.mo2014n(cache);
        this.f1442x.mo2014n(cache);
        this.f1443y.mo2014n(cache);
    }

    /* renamed from: a */
    public final void mo2048a() {
        this.f1385B.add(this.f1437s);
        this.f1385B.add(this.f1438t);
        this.f1385B.add(this.f1439u);
        this.f1385B.add(this.f1440v);
        this.f1385B.add(this.f1442x);
        this.f1385B.add(this.f1443y);
        this.f1385B.add(this.f1444z);
        this.f1385B.add(this.f1441w);
    }

    /* renamed from: u */
    public C0291f mo2086u() {
        return this.f1387D;
    }

    /* renamed from: p0 */
    public void mo2076p0(C0291f widget) {
        this.f1387D = widget;
    }

    /* renamed from: z0 */
    public void mo2097z0(boolean widthWrapContent) {
    }

    /* renamed from: c0 */
    public void mo2051c0(boolean heightWrapContent) {
    }

    /* renamed from: f */
    public void mo2055f(C0291f target, float angle, int radius) {
        C0286e.C0290d dVar = C0286e.C0290d.CENTER;
        mo2033J(dVar, target, dVar, radius, 0);
        this.f1436r = angle;
    }

    /* renamed from: x0 */
    public void mo2093x0(int visibility) {
        this.f1408Y = visibility;
    }

    /* renamed from: C */
    public int mo2020C() {
        return this.f1408Y;
    }

    /* renamed from: n */
    public String mo2071n() {
        return this.f1409Z;
    }

    /* renamed from: X */
    public void mo2045X(String name) {
        this.f1409Z = name;
    }

    /* renamed from: g */
    public void mo2057g(C0275e system) {
        C0280i r = system.mo1976r(this.f1437s);
        C0280i r2 = system.mo1976r(this.f1438t);
        C0280i r3 = system.mo1976r(this.f1439u);
        C0280i r4 = system.mo1976r(this.f1440v);
        if (this.f1400Q > 0) {
            system.mo1976r(this.f1441w);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f1411a0 != null) {
            str = "type: " + this.f1411a0 + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.f1409Z != null) {
            str2 = "id: " + this.f1409Z + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f1392I);
        sb.append(", ");
        sb.append(this.f1393J);
        sb.append(") - (");
        sb.append(this.f1388E);
        sb.append(" x ");
        sb.append(this.f1389F);
        sb.append(") wrap: (");
        sb.append(this.f1403T);
        sb.append(" x ");
        sb.append(this.f1404U);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: G */
    public int mo2028G() {
        return this.f1392I;
    }

    /* renamed from: H */
    public int mo2030H() {
        return this.f1393J;
    }

    /* renamed from: D */
    public int mo2022D() {
        if (this.f1408Y == 8) {
            return 0;
        }
        return this.f1388E;
    }

    /* renamed from: F */
    public int mo2026F() {
        return this.f1403T;
    }

    /* renamed from: r */
    public int mo2079r() {
        if (this.f1408Y == 8) {
            return 0;
        }
        return this.f1389F;
    }

    /* renamed from: E */
    public int mo2024E() {
        return this.f1404U;
    }

    /* renamed from: t */
    public int mo2083t(int orientation) {
        if (orientation == 0) {
            return mo2022D();
        }
        if (orientation == 1) {
            return mo2079r();
        }
        return 0;
    }

    /* renamed from: p */
    public int mo2075p() {
        return this.f1396M + this.f1398O;
    }

    /* renamed from: q */
    public int mo2077q() {
        return this.f1397N + this.f1399P;
    }

    /* renamed from: z */
    public int mo2096z() {
        return this.f1392I + this.f1398O;
    }

    /* renamed from: A */
    public int mo2016A() {
        return this.f1393J + this.f1399P;
    }

    /* renamed from: y */
    public int mo2094y() {
        return mo2028G() + this.f1388E;
    }

    /* renamed from: l */
    public int mo2067l() {
        return mo2030H() + this.f1389F;
    }

    /* renamed from: k */
    public float mo2065k(int orientation) {
        if (orientation == 0) {
            return this.f1405V;
        }
        if (orientation == 1) {
            return this.f1406W;
        }
        return -1.0f;
    }

    /* renamed from: I */
    public boolean mo2032I() {
        return this.f1400Q > 0;
    }

    /* renamed from: j */
    public int mo2063j() {
        return this.f1400Q;
    }

    /* renamed from: m */
    public Object mo2069m() {
        return this.f1407X;
    }

    /* renamed from: i */
    public ArrayList<C0286e> mo2061i() {
        return this.f1385B;
    }

    /* renamed from: C0 */
    public void mo2021C0(int x) {
        this.f1392I = x;
    }

    /* renamed from: D0 */
    public void mo2023D0(int y) {
        this.f1393J = y;
    }

    /* renamed from: o0 */
    public void mo2074o0(int x, int y) {
        this.f1392I = x;
        this.f1393J = y;
    }

    /* renamed from: n0 */
    public void mo2072n0(int x, int y) {
        this.f1398O = x;
        this.f1399P = y;
    }

    /* renamed from: F0 */
    public void mo2027F0() {
        int left = this.f1392I;
        int top = this.f1393J;
        int i = this.f1392I + this.f1388E;
        int i2 = this.f1393J + this.f1389F;
        this.f1396M = left;
        this.f1397N = top;
    }

    /* renamed from: y0 */
    public void mo2095y0(int w) {
        this.f1388E = w;
        int i = this.f1401R;
        if (w < i) {
            this.f1388E = i;
        }
    }

    /* renamed from: b0 */
    public void mo2050b0(int h) {
        this.f1389F = h;
        int i = this.f1402S;
        if (h < i) {
            this.f1389F = i;
        }
    }

    /* renamed from: h0 */
    public void mo2060h0(int horizontalMatchStyle, int min, int max, float percent) {
        this.f1418e = horizontalMatchStyle;
        this.f1424h = min;
        this.f1426i = max;
        this.f1428j = percent;
        if (percent < 1.0f && horizontalMatchStyle == 0) {
            this.f1418e = 2;
        }
    }

    /* renamed from: v0 */
    public void mo2089v0(int verticalMatchStyle, int min, int max, float percent) {
        this.f1420f = verticalMatchStyle;
        this.f1429k = min;
        this.f1430l = max;
        this.f1431m = percent;
        if (percent < 1.0f && verticalMatchStyle == 0) {
            this.f1420f = 2;
        }
    }

    /* renamed from: Y */
    public void mo2046Y(String ratio) {
        int commaIndex;
        if (ratio == null || ratio.length() == 0) {
            this.f1390G = 0.0f;
            return;
        }
        int dimensionRatioSide = -1;
        float dimensionRatio = 0.0f;
        int len = ratio.length();
        int commaIndex2 = ratio.indexOf(44);
        if (commaIndex2 <= 0 || commaIndex2 >= len - 1) {
            commaIndex = 0;
        } else {
            String dimension = ratio.substring(0, commaIndex2);
            if (dimension.equalsIgnoreCase("W")) {
                dimensionRatioSide = 0;
            } else if (dimension.equalsIgnoreCase("H")) {
                dimensionRatioSide = 1;
            }
            commaIndex = commaIndex2 + 1;
        }
        int colonIndex = ratio.indexOf(58);
        if (colonIndex < 0 || colonIndex >= len - 1) {
            String r = ratio.substring(commaIndex);
            if (r.length() > 0) {
                try {
                    dimensionRatio = Float.parseFloat(r);
                } catch (NumberFormatException e) {
                }
            }
        } else {
            String nominator = ratio.substring(commaIndex, colonIndex);
            String denominator = ratio.substring(colonIndex + 1);
            if (nominator.length() > 0 && denominator.length() > 0) {
                try {
                    float nominatorValue = Float.parseFloat(nominator);
                    float denominatorValue = Float.parseFloat(denominator);
                    if (nominatorValue > 0.0f && denominatorValue > 0.0f) {
                        dimensionRatio = dimensionRatioSide == 1 ? Math.abs(denominatorValue / nominatorValue) : Math.abs(nominatorValue / denominatorValue);
                    }
                } catch (NumberFormatException e2) {
                }
            }
        }
        if (dimensionRatio > 0.0f) {
            this.f1390G = dimensionRatio;
            this.f1391H = dimensionRatioSide;
        }
    }

    /* renamed from: d0 */
    public void mo2052d0(float horizontalBiasPercent) {
        this.f1405V = horizontalBiasPercent;
    }

    /* renamed from: r0 */
    public void mo2080r0(float verticalBiasPercent) {
        this.f1406W = verticalBiasPercent;
    }

    /* renamed from: m0 */
    public void mo2070m0(int w) {
        if (w < 0) {
            this.f1401R = 0;
        } else {
            this.f1401R = w;
        }
    }

    /* renamed from: l0 */
    public void mo2068l0(int h) {
        if (h < 0) {
            this.f1402S = 0;
        } else {
            this.f1402S = h;
        }
    }

    /* renamed from: B0 */
    public void mo2019B0(int w) {
        this.f1403T = w;
    }

    /* renamed from: A0 */
    public void mo2017A0(int h) {
        this.f1404U = h;
    }

    /* renamed from: a0 */
    public void mo2049a0(int left, int top, int right, int bottom) {
        int w = right - left;
        int h = bottom - top;
        this.f1392I = left;
        this.f1393J = top;
        if (this.f1408Y == 8) {
            this.f1388E = 0;
            this.f1389F = 0;
            return;
        }
        C0293b[] bVarArr = this.f1386C;
        C0293b bVar = bVarArr[0];
        C0293b bVar2 = C0293b.FIXED;
        if (bVar == bVar2 && w < this.f1388E) {
            w = this.f1388E;
        }
        if (bVarArr[1] == bVar2 && h < this.f1389F) {
            h = this.f1389F;
        }
        this.f1388E = w;
        this.f1389F = h;
        int i = this.f1402S;
        if (h < i) {
            this.f1389F = i;
        }
        int i2 = this.f1401R;
        if (w < i2) {
            this.f1388E = i2;
        }
        this.f1415c0 = true;
    }

    /* renamed from: Z */
    public void mo2047Z(int start, int end, int orientation) {
        if (orientation == 0) {
            mo2056f0(start, end);
        } else if (orientation == 1) {
            mo2084t0(start, end);
        }
        this.f1415c0 = true;
    }

    /* renamed from: f0 */
    public void mo2056f0(int left, int right) {
        this.f1392I = left;
        int i = right - left;
        this.f1388E = i;
        int i2 = this.f1401R;
        if (i < i2) {
            this.f1388E = i2;
        }
    }

    /* renamed from: t0 */
    public void mo2084t0(int top, int bottom) {
        this.f1393J = top;
        int i = bottom - top;
        this.f1389F = i;
        int i2 = this.f1402S;
        if (i < i2) {
            this.f1389F = i2;
        }
    }

    /* renamed from: v */
    public int mo2088v(int orientation) {
        if (orientation == 0) {
            return this.f1394K;
        }
        if (orientation == 1) {
            return this.f1395L;
        }
        return 0;
    }

    /* renamed from: q0 */
    public void mo2078q0(int offset, int orientation) {
        if (orientation == 0) {
            this.f1394K = offset;
        } else if (orientation == 1) {
            this.f1395L = offset;
        }
    }

    /* renamed from: V */
    public void mo2043V(int baseline) {
        this.f1400Q = baseline;
    }

    /* renamed from: W */
    public void mo2044W(Object companion) {
        this.f1407X = companion;
    }

    /* renamed from: i0 */
    public void mo2062i0(float horizontalWeight) {
        this.f1423g0[0] = horizontalWeight;
    }

    /* renamed from: w0 */
    public void mo2091w0(float verticalWeight) {
        this.f1423g0[1] = verticalWeight;
    }

    /* renamed from: e0 */
    public void mo2054e0(int horizontalChainStyle) {
        this.f1419e0 = horizontalChainStyle;
    }

    /* renamed from: s0 */
    public void mo2082s0(int verticalChainStyle) {
        this.f1421f0 = verticalChainStyle;
    }

    /* renamed from: c */
    public boolean mo1997c() {
        return this.f1408Y != 8;
    }

    /* renamed from: J */
    public void mo2033J(C0286e.C0290d startType, C0291f target, C0286e.C0290d endType, int margin, int goneMargin) {
        C0286e startAnchor = mo2059h(startType);
        startAnchor.mo2001a(target.mo2059h(endType), margin, goneMargin, C0286e.C0289c.STRONG, 0, true);
    }

    /* renamed from: R */
    public void mo2041R() {
        C0291f parent = mo2086u();
        if (parent == null || !(parent instanceof C0294g) || !((C0294g) mo2086u()).mo2104S0()) {
            int mAnchorsSize = this.f1385B.size();
            for (int i = 0; i < mAnchorsSize; i++) {
                this.f1385B.get(i).mo2013m();
            }
        }
    }

    /* renamed from: h */
    public C0286e mo2059h(C0286e.C0290d anchorType) {
        switch (C0292a.f1445a[anchorType.ordinal()]) {
            case 1:
                return this.f1437s;
            case 2:
                return this.f1438t;
            case 3:
                return this.f1439u;
            case 4:
                return this.f1440v;
            case 5:
                return this.f1441w;
            case 6:
                return this.f1444z;
            case 7:
                return this.f1442x;
            case 8:
                return this.f1443y;
            case 9:
                return null;
            default:
                throw new AssertionError(anchorType.name());
        }
    }

    /* renamed from: s */
    public C0293b mo2081s() {
        return this.f1386C[0];
    }

    /* renamed from: B */
    public C0293b mo2018B() {
        return this.f1386C[1];
    }

    /* renamed from: o */
    public C0293b mo2073o(int orientation) {
        if (orientation == 0) {
            return mo2081s();
        }
        if (orientation == 1) {
            return mo2018B();
        }
        return null;
    }

    /* renamed from: g0 */
    public void mo2058g0(C0293b behaviour) {
        this.f1386C[0] = behaviour;
        if (behaviour == C0293b.WRAP_CONTENT) {
            mo2095y0(this.f1403T);
        }
    }

    /* renamed from: u0 */
    public void mo2087u0(C0293b behaviour) {
        this.f1386C[1] = behaviour;
        if (behaviour == C0293b.WRAP_CONTENT) {
            mo2050b0(this.f1404U);
        }
    }

    /* renamed from: M */
    public boolean mo2036M() {
        C0286e eVar = this.f1437s;
        C0286e eVar2 = eVar.f1359d;
        if (eVar2 != null && eVar2.f1359d == eVar) {
            return true;
        }
        C0286e eVar3 = this.f1439u;
        C0286e eVar4 = eVar3.f1359d;
        if (eVar4 == null || eVar4.f1359d != eVar3) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    public boolean mo2037N() {
        C0286e eVar = this.f1438t;
        C0286e eVar2 = eVar.f1359d;
        if (eVar2 != null && eVar2.f1359d == eVar) {
            return true;
        }
        C0286e eVar3 = this.f1440v;
        C0286e eVar4 = eVar3.f1359d;
        if (eVar4 == null || eVar4.f1359d != eVar3) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public final boolean mo2034K(int orientation) {
        int offset = orientation * 2;
        C0286e[] eVarArr = this.f1384A;
        return (eVarArr[offset].f1359d == null || eVarArr[offset].f1359d.f1359d == eVarArr[offset] || eVarArr[offset + 1].f1359d == null || eVarArr[offset + 1].f1359d.f1359d != eVarArr[offset + 1]) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01a6, code lost:
        if (r0 == -1) goto L_0x01aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0257 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01a1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1996b(p000a.p019f.p020a.C0275e r54) {
        /*
            r53 = this;
            r15 = r53
            r10 = r54
            a.f.a.j.e r0 = r15.f1437s
            a.f.a.i r36 = r10.mo1976r(r0)
            a.f.a.j.e r0 = r15.f1439u
            a.f.a.i r2 = r10.mo1976r(r0)
            a.f.a.j.e r0 = r15.f1438t
            a.f.a.i r1 = r10.mo1976r(r0)
            a.f.a.j.e r0 = r15.f1440v
            a.f.a.i r0 = r10.mo1976r(r0)
            a.f.a.j.e r3 = r15.f1441w
            a.f.a.i r13 = r10.mo1976r(r3)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            a.f.a.j.f r7 = r15.f1387D
            r8 = 8
            r12 = 0
            r11 = 1
            if (r7 == 0) goto L_0x00b5
            if (r7 == 0) goto L_0x003a
            a.f.a.j.f$b[] r9 = r7.f1386C
            r9 = r9[r12]
            a.f.a.j.f$b r14 = p000a.p019f.p020a.p021j.C0291f.C0293b.WRAP_CONTENT
            if (r9 != r14) goto L_0x003a
            r9 = 1
            goto L_0x003b
        L_0x003a:
            r9 = 0
        L_0x003b:
            r5 = r9
            if (r7 == 0) goto L_0x0048
            a.f.a.j.f$b[] r7 = r7.f1386C
            r7 = r7[r11]
            a.f.a.j.f$b r9 = p000a.p019f.p020a.p021j.C0291f.C0293b.WRAP_CONTENT
            if (r7 != r9) goto L_0x0048
            r7 = 1
            goto L_0x0049
        L_0x0048:
            r7 = 0
        L_0x0049:
            r6 = r7
            boolean r7 = r15.mo2034K(r12)
            if (r7 == 0) goto L_0x0059
            a.f.a.j.f r7 = r15.f1387D
            a.f.a.j.g r7 = (p000a.p019f.p020a.p021j.C0294g) r7
            r7.mo2099N0(r15, r12)
            r3 = 1
            goto L_0x005d
        L_0x0059:
            boolean r3 = r53.mo2036M()
        L_0x005d:
            boolean r7 = r15.mo2034K(r11)
            if (r7 == 0) goto L_0x006c
            a.f.a.j.f r7 = r15.f1387D
            a.f.a.j.g r7 = (p000a.p019f.p020a.p021j.C0294g) r7
            r7.mo2099N0(r15, r11)
            r4 = 1
            goto L_0x0070
        L_0x006c:
            boolean r4 = r53.mo2037N()
        L_0x0070:
            if (r5 == 0) goto L_0x008d
            int r7 = r15.f1408Y
            if (r7 == r8) goto L_0x008d
            a.f.a.j.e r7 = r15.f1437s
            a.f.a.j.e r7 = r7.f1359d
            if (r7 != 0) goto L_0x008d
            a.f.a.j.e r7 = r15.f1439u
            a.f.a.j.e r7 = r7.f1359d
            if (r7 != 0) goto L_0x008d
            a.f.a.j.f r7 = r15.f1387D
            a.f.a.j.e r7 = r7.f1439u
            a.f.a.i r7 = r10.mo1976r(r7)
            r10.mo1967i(r7, r2, r12, r11)
        L_0x008d:
            if (r6 == 0) goto L_0x00ae
            int r7 = r15.f1408Y
            if (r7 == r8) goto L_0x00ae
            a.f.a.j.e r7 = r15.f1438t
            a.f.a.j.e r7 = r7.f1359d
            if (r7 != 0) goto L_0x00ae
            a.f.a.j.e r7 = r15.f1440v
            a.f.a.j.e r7 = r7.f1359d
            if (r7 != 0) goto L_0x00ae
            a.f.a.j.e r7 = r15.f1441w
            if (r7 != 0) goto L_0x00ae
            a.f.a.j.f r7 = r15.f1387D
            a.f.a.j.e r7 = r7.f1440v
            a.f.a.i r7 = r10.mo1976r(r7)
            r10.mo1967i(r7, r0, r12, r11)
        L_0x00ae:
            r37 = r3
            r38 = r4
            r9 = r5
            r7 = r6
            goto L_0x00bb
        L_0x00b5:
            r37 = r3
            r38 = r4
            r9 = r5
            r7 = r6
        L_0x00bb:
            int r3 = r15.f1388E
            int r4 = r15.f1401R
            if (r3 >= r4) goto L_0x00c3
            int r3 = r15.f1401R
        L_0x00c3:
            int r4 = r15.f1389F
            int r5 = r15.f1402S
            if (r4 >= r5) goto L_0x00cb
            int r4 = r15.f1402S
        L_0x00cb:
            a.f.a.j.f$b[] r5 = r15.f1386C
            r6 = r5[r12]
            a.f.a.j.f$b r14 = p000a.p019f.p020a.p021j.C0291f.C0293b.MATCH_CONSTRAINT
            if (r6 == r14) goto L_0x00d5
            r6 = 1
            goto L_0x00d6
        L_0x00d5:
            r6 = 0
        L_0x00d6:
            r12 = r5[r11]
            if (r12 == r14) goto L_0x00dc
            r12 = 1
            goto L_0x00dd
        L_0x00dc:
            r12 = 0
        L_0x00dd:
            r17 = 0
            int r11 = r15.f1391H
            r15.f1432n = r11
            float r8 = r15.f1390G
            r15.f1433o = r8
            r20 = r0
            int r0 = r15.f1418e
            r21 = r1
            int r1 = r15.f1420f
            r22 = 0
            r23 = r2
            int r22 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r22 <= 0) goto L_0x018b
            int r2 = r15.f1408Y
            r24 = r3
            r3 = 8
            if (r2 == r3) goto L_0x018d
            r17 = 1
            r2 = 0
            r3 = r5[r2]
            if (r3 != r14) goto L_0x0109
            if (r0 != 0) goto L_0x0109
            r0 = 3
        L_0x0109:
            r2 = 1
            r3 = r5[r2]
            if (r3 != r14) goto L_0x0111
            if (r1 != 0) goto L_0x0111
            r1 = 3
        L_0x0111:
            r2 = 0
            r3 = r5[r2]
            if (r3 != r14) goto L_0x0125
            r3 = 1
            r2 = r5[r3]
            if (r2 != r14) goto L_0x0125
            r2 = 3
            if (r0 != r2) goto L_0x0125
            if (r1 != r2) goto L_0x0125
            r15.mo2025E0(r9, r7, r6, r12)
            goto L_0x018d
        L_0x0125:
            r2 = 0
            r3 = r5[r2]
            if (r3 != r14) goto L_0x0153
            r3 = 3
            if (r0 != r3) goto L_0x0153
            r15.f1432n = r2
            int r2 = r15.f1389F
            float r2 = (float) r2
            float r8 = r8 * r2
            int r3 = (int) r8
            r2 = 1
            r5 = r5[r2]
            if (r5 == r14) goto L_0x0148
            r0 = 4
            r17 = 0
            r39 = r0
            r40 = r1
            r41 = r3
            r42 = r4
            r43 = r17
            goto L_0x0197
        L_0x0148:
            r39 = r0
            r40 = r1
            r41 = r3
            r42 = r4
            r43 = r17
            goto L_0x0197
        L_0x0153:
            r2 = 1
            r3 = r5[r2]
            if (r3 != r14) goto L_0x018d
            r3 = 3
            if (r1 != r3) goto L_0x018d
            r15.f1432n = r2
            r2 = -1
            if (r11 != r2) goto L_0x0165
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r8
            r15.f1433o = r2
        L_0x0165:
            float r2 = r15.f1433o
            int r3 = r15.f1388E
            float r3 = (float) r3
            float r2 = r2 * r3
            int r4 = (int) r2
            r2 = 0
            r3 = r5[r2]
            if (r3 == r14) goto L_0x0180
            r1 = 4
            r17 = 0
            r39 = r0
            r40 = r1
            r42 = r4
            r43 = r17
            r41 = r24
            goto L_0x0197
        L_0x0180:
            r39 = r0
            r40 = r1
            r42 = r4
            r43 = r17
            r41 = r24
            goto L_0x0197
        L_0x018b:
            r24 = r3
        L_0x018d:
            r39 = r0
            r40 = r1
            r42 = r4
            r43 = r17
            r41 = r24
        L_0x0197:
            int[] r0 = r15.f1422g
            r1 = 0
            r0[r1] = r39
            r1 = 1
            r0[r1] = r40
            if (r43 == 0) goto L_0x01ac
            int r0 = r15.f1432n
            if (r0 == 0) goto L_0x01a9
            r2 = -1
            if (r0 != r2) goto L_0x01ad
            goto L_0x01aa
        L_0x01a9:
            r2 = -1
        L_0x01aa:
            r14 = 1
            goto L_0x01ae
        L_0x01ac:
            r2 = -1
        L_0x01ad:
            r14 = 0
        L_0x01ae:
            a.f.a.j.f$b[] r0 = r15.f1386C
            r3 = 0
            r0 = r0[r3]
            a.f.a.j.f$b r11 = p000a.p019f.p020a.p021j.C0291f.C0293b.WRAP_CONTENT
            if (r0 != r11) goto L_0x01bd
            boolean r0 = r15 instanceof p000a.p019f.p020a.p021j.C0294g
            if (r0 == 0) goto L_0x01bd
            r0 = 1
            goto L_0x01be
        L_0x01bd:
            r0 = 0
        L_0x01be:
            r44 = r6
            r6 = r0
            r0 = 1
            a.f.a.j.e r3 = r15.f1444z
            boolean r3 = r3.mo2011k()
            if (r3 == 0) goto L_0x01ce
            r0 = 0
            r22 = r0
            goto L_0x01d0
        L_0x01ce:
            r22 = r0
        L_0x01d0:
            int r0 = r15.f1410a
            r8 = 2
            r24 = 0
            if (r0 == r8) goto L_0x023e
            a.f.a.j.f r0 = r15.f1387D
            if (r0 == 0) goto L_0x01e3
            a.f.a.j.e r0 = r0.f1439u
            a.f.a.i r0 = r10.mo1976r(r0)
            r4 = r0
            goto L_0x01e5
        L_0x01e3:
            r4 = r24
        L_0x01e5:
            a.f.a.j.f r0 = r15.f1387D
            if (r0 == 0) goto L_0x01f1
            a.f.a.j.e r0 = r0.f1437s
            a.f.a.i r0 = r10.mo1976r(r0)
            r3 = r0
            goto L_0x01f3
        L_0x01f1:
            r3 = r24
        L_0x01f3:
            a.f.a.j.f$b[] r0 = r15.f1386C
            r16 = 0
            r5 = r0[r16]
            a.f.a.j.e r0 = r15.f1437s
            r45 = r7
            r7 = r0
            a.f.a.j.e r0 = r15.f1439u
            r8 = r0
            int r0 = r15.f1392I
            r46 = r9
            r9 = r0
            int r0 = r15.f1401R
            r1 = r11
            r11 = r0
            int[] r0 = r15.f1435q
            r0 = r0[r16]
            r47 = r12
            r25 = 0
            r12 = r0
            float r0 = r15.f1405V
            r48 = r13
            r13 = r0
            int r0 = r15.f1424h
            r17 = r0
            int r0 = r15.f1426i
            r18 = r0
            float r0 = r15.f1428j
            r19 = r0
            r49 = r20
            r0 = r53
            r51 = r1
            r50 = r21
            r1 = r54
            r52 = r23
            r2 = r46
            r10 = r41
            r15 = r37
            r16 = r39
            r20 = r22
            r0.mo2053e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0250
        L_0x023e:
            r45 = r7
            r46 = r9
            r51 = r11
            r47 = r12
            r48 = r13
            r49 = r20
            r50 = r21
            r52 = r23
            r25 = 0
        L_0x0250:
            r7 = r53
            int r0 = r7.f1412b
            r1 = 2
            if (r0 != r1) goto L_0x0258
            return
        L_0x0258:
            a.f.a.j.f$b[] r0 = r7.f1386C
            r1 = 1
            r0 = r0[r1]
            r2 = r51
            if (r0 != r2) goto L_0x0268
            boolean r0 = r7 instanceof p000a.p019f.p020a.p021j.C0294g
            if (r0 == 0) goto L_0x0268
            r21 = 1
            goto L_0x026a
        L_0x0268:
            r21 = 0
        L_0x026a:
            if (r43 == 0) goto L_0x0276
            int r0 = r7.f1432n
            if (r0 == r1) goto L_0x0273
            r2 = -1
            if (r0 != r2) goto L_0x0276
        L_0x0273:
            r29 = 1
            goto L_0x0278
        L_0x0276:
            r29 = 0
        L_0x0278:
            int r0 = r7.f1400Q
            if (r0 <= 0) goto L_0x02b7
            a.f.a.j.e r0 = r7.f1441w
            a.f.a.j.m r0 = r0.mo2006f()
            int r0 = r0.f1507b
            if (r0 != r1) goto L_0x0296
            a.f.a.j.e r0 = r7.f1441w
            a.f.a.j.m r0 = r0.mo2006f()
            r8 = r54
            r0.mo2134g(r8)
            r10 = r48
            r9 = r50
            goto L_0x02bd
        L_0x0296:
            r8 = r54
            int r0 = r53.mo2063j()
            r2 = 6
            r10 = r48
            r9 = r50
            r8.mo1963e(r10, r9, r0, r2)
            a.f.a.j.e r0 = r7.f1441w
            a.f.a.j.e r0 = r0.f1359d
            if (r0 == 0) goto L_0x02bd
            a.f.a.i r0 = r8.mo1976r(r0)
            r3 = 0
            r8.mo1963e(r10, r0, r3, r2)
            r22 = 0
            r11 = r22
            goto L_0x02bf
        L_0x02b7:
            r8 = r54
            r10 = r48
            r9 = r50
        L_0x02bd:
            r11 = r22
        L_0x02bf:
            a.f.a.j.f r0 = r7.f1387D
            if (r0 == 0) goto L_0x02cc
            a.f.a.j.e r0 = r0.f1440v
            a.f.a.i r0 = r8.mo1976r(r0)
            r19 = r0
            goto L_0x02ce
        L_0x02cc:
            r19 = r24
        L_0x02ce:
            a.f.a.j.f r0 = r7.f1387D
            if (r0 == 0) goto L_0x02db
            a.f.a.j.e r0 = r0.f1438t
            a.f.a.i r0 = r8.mo1976r(r0)
            r18 = r0
            goto L_0x02dd
        L_0x02db:
            r18 = r24
        L_0x02dd:
            a.f.a.j.f$b[] r0 = r7.f1386C
            r20 = r0[r1]
            a.f.a.j.e r0 = r7.f1438t
            r22 = r0
            a.f.a.j.e r0 = r7.f1440v
            r23 = r0
            int r0 = r7.f1393J
            r24 = r0
            int r0 = r7.f1402S
            r26 = r0
            int[] r0 = r7.f1435q
            r27 = r0[r1]
            float r0 = r7.f1406W
            r28 = r0
            int r0 = r7.f1429k
            r32 = r0
            int r0 = r7.f1430l
            r33 = r0
            float r0 = r7.f1431m
            r34 = r0
            r15 = r53
            r16 = r54
            r17 = r45
            r25 = r42
            r30 = r38
            r31 = r40
            r35 = r11
            r15.mo2053e(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            if (r43 == 0) goto L_0x033c
            r12 = 6
            int r0 = r7.f1432n
            if (r0 != r1) goto L_0x032d
            float r5 = r7.f1433o
            r0 = r54
            r1 = r49
            r2 = r9
            r3 = r52
            r4 = r36
            r6 = r12
            r0.mo1970l(r1, r2, r3, r4, r5, r6)
            goto L_0x033c
        L_0x032d:
            float r5 = r7.f1433o
            r0 = r54
            r1 = r52
            r2 = r36
            r3 = r49
            r4 = r9
            r6 = r12
            r0.mo1970l(r1, r2, r3, r4, r5, r6)
        L_0x033c:
            a.f.a.j.e r0 = r7.f1444z
            boolean r0 = r0.mo2011k()
            if (r0 == 0) goto L_0x0362
            a.f.a.j.e r0 = r7.f1444z
            a.f.a.j.e r0 = r0.mo2009i()
            a.f.a.j.f r0 = r0.mo2005e()
            float r1 = r7.f1436r
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            a.f.a.j.e r2 = r7.f1444z
            int r2 = r2.mo2004d()
            r8.mo1960b(r7, r0, r1, r2)
        L_0x0362:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p019f.p020a.p021j.C0291f.mo1996b(a.f.a.e):void");
    }

    /* renamed from: E0 */
    public void mo2025E0(boolean hparentWrapContent, boolean vparentWrapContent, boolean horizontalDimensionFixed, boolean verticalDimensionFixed) {
        if (this.f1432n == -1) {
            if (horizontalDimensionFixed && !verticalDimensionFixed) {
                this.f1432n = 0;
            } else if (!horizontalDimensionFixed && verticalDimensionFixed) {
                this.f1432n = 1;
                if (this.f1391H == -1) {
                    this.f1433o = 1.0f / this.f1433o;
                }
            }
        }
        if (this.f1432n == 0 && (!this.f1438t.mo2011k() || !this.f1440v.mo2011k())) {
            this.f1432n = 1;
        } else if (this.f1432n == 1 && (!this.f1437s.mo2011k() || !this.f1439u.mo2011k())) {
            this.f1432n = 0;
        }
        if (this.f1432n == -1 && (!this.f1438t.mo2011k() || !this.f1440v.mo2011k() || !this.f1437s.mo2011k() || !this.f1439u.mo2011k())) {
            if (this.f1438t.mo2011k() && this.f1440v.mo2011k()) {
                this.f1432n = 0;
            } else if (this.f1437s.mo2011k() && this.f1439u.mo2011k()) {
                this.f1433o = 1.0f / this.f1433o;
                this.f1432n = 1;
            }
        }
        if (this.f1432n == -1) {
            if (hparentWrapContent && !vparentWrapContent) {
                this.f1432n = 0;
            } else if (!hparentWrapContent && vparentWrapContent) {
                this.f1433o = 1.0f / this.f1433o;
                this.f1432n = 1;
            }
        }
        if (this.f1432n == -1) {
            int i = this.f1424h;
            if (i > 0 && this.f1429k == 0) {
                this.f1432n = 0;
            } else if (i == 0 && this.f1429k > 0) {
                this.f1433o = 1.0f / this.f1433o;
                this.f1432n = 1;
            }
        }
        if (this.f1432n == -1 && hparentWrapContent && vparentWrapContent) {
            this.f1433o = 1.0f / this.f1433o;
            this.f1432n = 1;
        }
    }

    /* renamed from: e */
    public final void mo2053e(C0275e system, boolean parentWrapContent, C0280i parentMin, C0280i parentMax, C0293b dimensionBehaviour, boolean wrapContent, C0286e beginAnchor, C0286e endAnchor, int beginPosition, int dimension, int minDimension, int maxDimension, float bias, boolean useRatio, boolean inChain, int matchConstraintDefault, int matchMinDimension, int matchMaxDimension, float matchPercentDimension, boolean applyPosition) {
        int matchConstraintDefault2;
        boolean variableSize;
        boolean variableSize2;
        int dimension2;
        C0280i beginTarget;
        int matchConstraintDefault3;
        int matchMaxDimension2;
        int numConnections;
        int matchMinDimension2;
        C0280i endTarget;
        int matchMaxDimension3;
        C0280i begin;
        C0280i begin2;
        int numConnections2;
        int i;
        int matchMaxDimension4;
        C0280i begin3;
        int i2;
        int numConnections3;
        int centeringStrength;
        boolean applyCentering;
        boolean applyBoundsCheck;
        C0280i beginTarget2;
        int matchConstraintDefault4;
        C0280i end;
        C0280i begin4;
        int endStrength;
        int startStrength;
        boolean applyBoundsCheck2;
        int i3;
        int dimension3;
        int matchConstraintDefault5;
        C0280i percentEnd;
        C0280i percentBegin;
        int i4;
        C0275e eVar = system;
        C0280i iVar = parentMin;
        C0280i iVar2 = parentMax;
        int i5 = minDimension;
        int i6 = maxDimension;
        C0280i begin5 = eVar.mo1976r(beginAnchor);
        C0280i end2 = eVar.mo1976r(endAnchor);
        C0280i beginTarget3 = eVar.mo1976r(beginAnchor.mo2009i());
        C0280i endTarget2 = eVar.mo1976r(endAnchor.mo2009i());
        if (eVar.f1281g && beginAnchor.mo2006f().f1507b == 1 && endAnchor.mo2006f().f1507b == 1) {
            if (C0275e.m1452x() != null) {
                C0275e.m1452x().f1308r++;
            }
            beginAnchor.mo2006f().mo2134g(eVar);
            endAnchor.mo2006f().mo2134g(eVar);
            if (!inChain && parentWrapContent) {
                eVar.mo1967i(iVar2, end2, 0, 6);
                return;
            }
            return;
        }
        if (C0275e.m1452x() != null) {
            C0275e.m1452x().f1316z++;
        }
        boolean isBeginConnected = beginAnchor.mo2011k();
        boolean isEndConnected = endAnchor.mo2011k();
        boolean isCenterConnected = this.f1444z.mo2011k();
        int numConnections4 = 0;
        if (isBeginConnected) {
            numConnections4 = 0 + 1;
        }
        if (isEndConnected) {
            numConnections4++;
        }
        if (isCenterConnected) {
            numConnections4++;
        }
        int numConnections5 = numConnections4;
        if (useRatio) {
            matchConstraintDefault2 = 3;
        } else {
            matchConstraintDefault2 = matchConstraintDefault;
        }
        int i7 = C0292a.f1446b[dimensionBehaviour.ordinal()];
        int numConnections6 = numConnections5;
        if (i7 == 1) {
            variableSize = false;
        } else if (i7 == 2) {
            variableSize = false;
        } else if (i7 == 3) {
            variableSize = false;
        } else if (i7 != 4) {
            variableSize = false;
        } else if (matchConstraintDefault2 == 4) {
            variableSize = false;
        } else {
            variableSize = true;
        }
        if (this.f1408Y == 8) {
            dimension2 = 0;
            variableSize2 = false;
        } else {
            dimension2 = dimension;
            variableSize2 = variableSize;
        }
        if (applyPosition) {
            if (isBeginConnected || isEndConnected || isCenterConnected) {
                int i8 = beginPosition;
                if (isBeginConnected && !isEndConnected) {
                    eVar.mo1963e(begin5, beginTarget3, beginAnchor.mo2004d(), 6);
                }
            } else {
                eVar.mo1964f(begin5, beginPosition);
            }
        }
        if (!variableSize2) {
            if (wrapContent) {
                eVar.mo1963e(end2, begin5, 0, 3);
                if (i5 > 0) {
                    i4 = 6;
                    eVar.mo1967i(end2, begin5, i5, 6);
                } else {
                    i4 = 6;
                }
                if (i6 < Integer.MAX_VALUE) {
                    eVar.mo1969k(end2, begin5, i6, i4);
                }
            } else {
                eVar.mo1963e(end2, begin5, dimension2, 6);
            }
            matchMinDimension2 = matchMinDimension;
            matchMaxDimension2 = matchMaxDimension;
            int i9 = dimension2;
            matchConstraintDefault3 = matchConstraintDefault2;
            endTarget = endTarget2;
            beginTarget = beginTarget3;
            numConnections = numConnections6;
        } else {
            int matchMinDimension3 = matchMinDimension;
            if (matchMinDimension3 == -2) {
                matchMinDimension3 = dimension2;
            }
            C0280i endTarget3 = endTarget2;
            int matchMaxDimension5 = matchMaxDimension;
            if (matchMaxDimension5 == -2) {
                matchMaxDimension5 = dimension2;
            }
            if (matchMinDimension3 > 0) {
                i3 = 6;
                eVar.mo1967i(end2, begin5, matchMinDimension3, 6);
                dimension2 = Math.max(dimension2, matchMinDimension3);
            } else {
                i3 = 6;
            }
            if (matchMaxDimension5 > 0) {
                eVar.mo1969k(end2, begin5, matchMaxDimension5, i3);
                dimension2 = Math.min(dimension2, matchMaxDimension5);
            }
            if (matchConstraintDefault2 == 1) {
                if (parentWrapContent) {
                    eVar.mo1963e(end2, begin5, dimension2, 6);
                    dimension3 = dimension2;
                    matchConstraintDefault3 = matchConstraintDefault2;
                    matchMinDimension2 = matchMinDimension3;
                    matchMaxDimension2 = matchMaxDimension5;
                    beginTarget = beginTarget3;
                    numConnections = numConnections6;
                    endTarget = endTarget3;
                } else if (inChain) {
                    eVar.mo1963e(end2, begin5, dimension2, 4);
                    dimension3 = dimension2;
                    matchConstraintDefault3 = matchConstraintDefault2;
                    matchMinDimension2 = matchMinDimension3;
                    matchMaxDimension2 = matchMaxDimension5;
                    beginTarget = beginTarget3;
                    numConnections = numConnections6;
                    endTarget = endTarget3;
                } else {
                    eVar.mo1963e(end2, begin5, dimension2, 1);
                    dimension3 = dimension2;
                    matchConstraintDefault3 = matchConstraintDefault2;
                    matchMinDimension2 = matchMinDimension3;
                    matchMaxDimension2 = matchMaxDimension5;
                    beginTarget = beginTarget3;
                    numConnections = numConnections6;
                    endTarget = endTarget3;
                }
            } else if (matchConstraintDefault2 == 2) {
                C0286e.C0290d j = beginAnchor.mo2010j();
                int dimension4 = dimension2;
                C0286e.C0290d dVar = C0286e.C0290d.TOP;
                if (j != dVar) {
                    matchConstraintDefault5 = matchConstraintDefault2;
                    if (beginAnchor.mo2010j() != C0286e.C0290d.BOTTOM) {
                        percentBegin = eVar.mo1976r(this.f1387D.mo2059h(C0286e.C0290d.LEFT));
                        percentEnd = eVar.mo1976r(this.f1387D.mo2059h(C0286e.C0290d.RIGHT));
                        C0272b s = system.mo1977s();
                        dimension3 = dimension4;
                        matchConstraintDefault3 = matchConstraintDefault5;
                        numConnections = numConnections6;
                        matchMinDimension2 = matchMinDimension3;
                        matchMaxDimension2 = matchMaxDimension5;
                        endTarget = endTarget3;
                        beginTarget = beginTarget3;
                        s.mo1937j(end2, begin5, percentEnd, percentBegin, matchPercentDimension);
                        eVar.mo1962d(s);
                        variableSize2 = false;
                    }
                } else {
                    matchConstraintDefault5 = matchConstraintDefault2;
                }
                percentBegin = eVar.mo1976r(this.f1387D.mo2059h(dVar));
                percentEnd = eVar.mo1976r(this.f1387D.mo2059h(C0286e.C0290d.BOTTOM));
                C0272b s2 = system.mo1977s();
                dimension3 = dimension4;
                matchConstraintDefault3 = matchConstraintDefault5;
                numConnections = numConnections6;
                matchMinDimension2 = matchMinDimension3;
                matchMaxDimension2 = matchMaxDimension5;
                endTarget = endTarget3;
                beginTarget = beginTarget3;
                s2.mo1937j(end2, begin5, percentEnd, percentBegin, matchPercentDimension);
                eVar.mo1962d(s2);
                variableSize2 = false;
            } else {
                dimension3 = dimension2;
                matchConstraintDefault3 = matchConstraintDefault2;
                matchMinDimension2 = matchMinDimension3;
                matchMaxDimension2 = matchMaxDimension5;
                beginTarget = beginTarget3;
                numConnections = numConnections6;
                endTarget = endTarget3;
            }
            if (!variableSize2 || numConnections == 2 || useRatio) {
                int i10 = dimension3;
            } else {
                variableSize2 = false;
                int dimension5 = dimension3;
                int d = Math.max(matchMinDimension2, dimension5);
                if (matchMaxDimension2 > 0) {
                    d = Math.min(matchMaxDimension2, d);
                }
                eVar.mo1963e(end2, begin5, d, 6);
                int i11 = dimension5;
            }
        }
        if (!applyPosition) {
            C0286e eVar2 = beginAnchor;
            C0286e eVar3 = endAnchor;
            int i12 = matchMinDimension2;
            numConnections2 = numConnections;
            int i13 = matchMaxDimension2;
            int i14 = matchConstraintDefault3;
            C0280i iVar3 = beginTarget;
            i = 6;
            matchMaxDimension3 = 0;
            begin = begin5;
            begin2 = end2;
        } else if (inChain) {
            C0286e eVar4 = beginAnchor;
            C0286e eVar5 = endAnchor;
            int i15 = matchMinDimension2;
            numConnections2 = numConnections;
            int i16 = matchMaxDimension2;
            int i17 = matchConstraintDefault3;
            C0280i iVar4 = beginTarget;
            i = 6;
            matchMaxDimension3 = 0;
            begin = begin5;
            begin2 = end2;
        } else {
            if (isBeginConnected || isEndConnected || isCenterConnected) {
                if (!isBeginConnected || isEndConnected) {
                    if (!isBeginConnected && isEndConnected) {
                        eVar.mo1963e(end2, endTarget, -endAnchor.mo2004d(), 6);
                        if (parentWrapContent) {
                            eVar.mo1967i(begin5, iVar, 0, 5);
                            C0286e eVar6 = beginAnchor;
                            C0286e eVar7 = endAnchor;
                            int i18 = matchMinDimension2;
                            int i19 = numConnections;
                            int i20 = matchMaxDimension2;
                            int i21 = matchConstraintDefault3;
                            C0280i iVar5 = beginTarget;
                            i2 = 6;
                            matchMaxDimension4 = 0;
                            C0280i iVar6 = begin5;
                            begin3 = end2;
                        } else {
                            C0286e eVar8 = beginAnchor;
                            C0286e eVar9 = endAnchor;
                            int i22 = matchMinDimension2;
                            int i23 = numConnections;
                            int i24 = matchMaxDimension2;
                            int i25 = matchConstraintDefault3;
                            C0280i iVar7 = beginTarget;
                            i2 = 6;
                            matchMaxDimension4 = 0;
                            C0280i iVar8 = begin5;
                            begin3 = end2;
                        }
                    } else if (!isBeginConnected || !isEndConnected) {
                        C0286e eVar10 = beginAnchor;
                        C0286e eVar11 = endAnchor;
                        int i26 = matchMinDimension2;
                        int i27 = numConnections;
                        int i28 = matchMaxDimension2;
                        int i29 = matchConstraintDefault3;
                        C0280i iVar9 = beginTarget;
                        i2 = 6;
                        matchMaxDimension4 = 0;
                        C0280i iVar10 = begin5;
                        begin3 = end2;
                    } else {
                        boolean applyBoundsCheck3 = false;
                        boolean applyCentering2 = false;
                        if (variableSize2) {
                            if (parentWrapContent && minDimension == 0) {
                                eVar.mo1967i(end2, begin5, 0, 6);
                            }
                            matchConstraintDefault4 = matchConstraintDefault3;
                            if (matchConstraintDefault4 == 0) {
                                int strength = 6;
                                if (matchMaxDimension2 > 0 || matchMinDimension2 > 0) {
                                    strength = 4;
                                    applyBoundsCheck3 = true;
                                }
                                numConnections3 = numConnections;
                                beginTarget2 = beginTarget;
                                eVar.mo1963e(begin5, beginTarget2, beginAnchor.mo2004d(), strength);
                                eVar.mo1963e(end2, endTarget, -endAnchor.mo2004d(), strength);
                                if (matchMaxDimension2 > 0 || matchMinDimension2 > 0) {
                                    applyCentering2 = true;
                                }
                                applyBoundsCheck = applyBoundsCheck3;
                                applyCentering = applyCentering2;
                                centeringStrength = 5;
                            } else {
                                numConnections3 = numConnections;
                                beginTarget2 = beginTarget;
                                if (matchConstraintDefault4 == 1) {
                                    applyBoundsCheck = true;
                                    applyCentering = true;
                                    centeringStrength = 6;
                                } else if (matchConstraintDefault4 == 3) {
                                    int strength2 = 4;
                                    if (!useRatio) {
                                        applyBoundsCheck2 = true;
                                        if (this.f1432n != -1 && matchMaxDimension2 <= 0) {
                                            strength2 = 6;
                                        }
                                    } else {
                                        applyBoundsCheck2 = true;
                                    }
                                    eVar.mo1963e(begin5, beginTarget2, beginAnchor.mo2004d(), strength2);
                                    eVar.mo1963e(end2, endTarget, -endAnchor.mo2004d(), strength2);
                                    applyBoundsCheck = applyBoundsCheck2;
                                    applyCentering = true;
                                    centeringStrength = 5;
                                } else {
                                    applyBoundsCheck = false;
                                    applyCentering = false;
                                    centeringStrength = 5;
                                }
                            }
                        } else {
                            numConnections3 = numConnections;
                            matchConstraintDefault4 = matchConstraintDefault3;
                            beginTarget2 = beginTarget;
                            applyBoundsCheck = false;
                            applyCentering = true;
                            centeringStrength = 5;
                        }
                        int startStrength2 = 5;
                        int endStrength2 = 5;
                        boolean applyStartConstraint = parentWrapContent;
                        boolean applyEndConstraint = parentWrapContent;
                        if (applyCentering) {
                            int i30 = matchConstraintDefault4;
                            end = end2;
                            int i31 = matchMinDimension2;
                            begin4 = begin5;
                            int i32 = matchMaxDimension2;
                            matchMaxDimension4 = 0;
                            system.mo1961c(begin5, beginTarget2, beginAnchor.mo2004d(), bias, endTarget, end2, endAnchor.mo2004d(), centeringStrength);
                            i2 = 6;
                            boolean isBeginAnchorBarrier = beginAnchor.f1359d.f1357b instanceof C0283b;
                            int i33 = numConnections3;
                            boolean isEndAnchorBarrier = endAnchor.f1359d.f1357b instanceof C0283b;
                            if (isBeginAnchorBarrier && !isEndAnchorBarrier) {
                                endStrength2 = 6;
                                applyEndConstraint = true;
                            } else if (!isBeginAnchorBarrier && isEndAnchorBarrier) {
                                startStrength2 = 6;
                                applyStartConstraint = true;
                            }
                        } else {
                            C0286e eVar12 = beginAnchor;
                            C0286e eVar13 = endAnchor;
                            int i34 = matchConstraintDefault4;
                            end = end2;
                            int i35 = matchMinDimension2;
                            int i36 = matchMaxDimension2;
                            int matchConstraintDefault6 = numConnections3;
                            i2 = 6;
                            matchMaxDimension4 = 0;
                            begin4 = begin5;
                        }
                        if (applyBoundsCheck) {
                            startStrength = 6;
                            endStrength = 6;
                        } else {
                            startStrength = startStrength2;
                            endStrength = endStrength2;
                        }
                        if ((!variableSize2 && applyStartConstraint) || applyBoundsCheck) {
                            eVar.mo1967i(begin4, beginTarget2, beginAnchor.mo2004d(), startStrength);
                        }
                        if ((variableSize2 || !applyEndConstraint) && !applyBoundsCheck) {
                            begin3 = end;
                        } else {
                            begin3 = end;
                            eVar.mo1969k(begin3, endTarget, -endAnchor.mo2004d(), endStrength);
                        }
                        if (parentWrapContent) {
                            eVar.mo1967i(begin4, iVar, matchMaxDimension4, i2);
                        }
                    }
                } else if (parentWrapContent) {
                    eVar.mo1967i(iVar2, end2, 0, 5);
                    C0286e eVar14 = beginAnchor;
                    C0286e eVar15 = endAnchor;
                    int i37 = matchMinDimension2;
                    int i38 = numConnections;
                    int i39 = matchMaxDimension2;
                    int i40 = matchConstraintDefault3;
                    C0280i iVar11 = beginTarget;
                    i2 = 6;
                    matchMaxDimension4 = 0;
                    C0280i iVar12 = begin5;
                    begin3 = end2;
                } else {
                    C0286e eVar16 = beginAnchor;
                    C0286e eVar17 = endAnchor;
                    int i41 = matchMinDimension2;
                    int i42 = numConnections;
                    int i43 = matchMaxDimension2;
                    int i44 = matchConstraintDefault3;
                    C0280i iVar13 = beginTarget;
                    i2 = 6;
                    matchMaxDimension4 = 0;
                    C0280i iVar14 = begin5;
                    begin3 = end2;
                }
            } else if (parentWrapContent) {
                eVar.mo1967i(iVar2, end2, 0, 5);
                C0286e eVar18 = beginAnchor;
                C0286e eVar19 = endAnchor;
                int i45 = matchMinDimension2;
                int i46 = numConnections;
                int i47 = matchMaxDimension2;
                int i48 = matchConstraintDefault3;
                C0280i iVar15 = beginTarget;
                i2 = 6;
                matchMaxDimension4 = 0;
                C0280i iVar16 = begin5;
                begin3 = end2;
            } else {
                C0286e eVar20 = beginAnchor;
                C0286e eVar21 = endAnchor;
                int i49 = matchMinDimension2;
                int i50 = numConnections;
                int i51 = matchMaxDimension2;
                int i52 = matchConstraintDefault3;
                C0280i iVar17 = beginTarget;
                i2 = 6;
                matchMaxDimension4 = 0;
                C0280i iVar18 = begin5;
                begin3 = end2;
            }
            if (parentWrapContent) {
                eVar.mo1967i(iVar2, begin3, matchMaxDimension4, i2);
                return;
            }
            return;
        }
        if (numConnections2 < 2 && parentWrapContent) {
            eVar.mo1967i(begin, iVar, matchMaxDimension3, i);
            eVar.mo1967i(iVar2, begin2, matchMaxDimension3, i);
        }
    }

    /* renamed from: a.f.a.j.f$a */
    public static /* synthetic */ class C0292a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1445a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f1446b;

        static {
            int[] iArr = new int[C0293b.values().length];
            f1446b = iArr;
            try {
                iArr[C0293b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f1446b[C0293b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f1446b[C0293b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f1446b[C0293b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            int[] iArr2 = new int[C0286e.C0290d.values().length];
            f1445a = iArr2;
            try {
                iArr2[C0286e.C0290d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f1445a[C0286e.C0290d.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f1445a[C0286e.C0290d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f1445a[C0286e.C0290d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f1445a[C0286e.C0290d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f1445a[C0286e.C0290d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError e10) {
            }
            try {
                f1445a[C0286e.C0290d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError e11) {
            }
            try {
                f1445a[C0286e.C0290d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError e12) {
            }
            try {
                f1445a[C0286e.C0290d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError e13) {
            }
        }
    }

    /* renamed from: G0 */
    public void mo2029G0(C0275e system) {
        int left = system.mo1981y(this.f1437s);
        int top = system.mo1981y(this.f1438t);
        int right = system.mo1981y(this.f1439u);
        int bottom = system.mo1981y(this.f1440v);
        int h = bottom - top;
        if (right - left < 0 || h < 0 || left == Integer.MIN_VALUE || left == Integer.MAX_VALUE || top == Integer.MIN_VALUE || top == Integer.MAX_VALUE || right == Integer.MIN_VALUE || right == Integer.MAX_VALUE || bottom == Integer.MIN_VALUE || bottom == Integer.MAX_VALUE) {
            left = 0;
            top = 0;
            right = 0;
            bottom = 0;
        }
        mo2049a0(left, top, right, bottom);
    }
}
